package kr.re.kitech.biz.api.server.service.process;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.api.server.dao.SptProcessDAO;
import kr.re.kitech.biz.api.server.dao.SptTrpProcessDAO;
import kr.re.kitech.biz.api.server.enums.AprProcess;
import kr.re.kitech.biz.api.server.service.BpmPostProcess;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.api.server.vo.biz.SptCustVo;
import kr.re.kitech.biz.api.server.vo.biz.SptRstBookVo;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.vo.ComReqVo;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.spa.service.FinAutoSlipService;
import kr.re.kitech.biz.res.exc.service.ResDepstReqService;
import kr.re.kitech.biz.sup.cus.vo.SptCustChargVo;
import kr.re.kitech.biz.sup.cus.vo.SptCustMentrInfoVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;

/**
 * @ClassSubJect 기업지원 BPM 사후처리
 * @Class Name SptProcess.java
 * @Description 기업지원 BPM 사후처리
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/04      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/08/04
 * @version 1.0
 * @see
 * 
 */
@Component
public class SptProcess implements BpmPostProcess {
	 
	 @Resource(name="finComAttachService")
	 private FinComAttachService attachService;
	 
	 @Resource(name="finAutoSlipService")
	 private FinAutoSlipService autoSlipService;	
	 
	 @Resource(name="resDepstReqService")
	 private ResDepstReqService depstService;
	
	 @Resource(name="sptProcessDAO")
	 private SptProcessDAO dao;
	 
	 @Resource(name="sptTrpProcessDAO")
	 private SptTrpProcessDAO trpDao;

	@Resource(name = "apprCommonServiceImpl")
	private ApprCommonService aprService;

	/**
    * 기업지원 BPM 사후 처리
    * @param ApiBpmVo
    * @return ApiBpmVo
    * @author LeeYH
    * @since 2022.08.04.
    */
	@Override
	public ApiBpmVo doExecute(ApiBpmVo vo) {
		// 후처리 로직 이슈로 인하여 데이터 확인
		AppLog.info("SptProcess ApiBpmVo - vo.getReqNo() ["+ vo.getReqNo() +"] --- vo.getAprState() : ["+ vo.getAprState() +"]");
		String reqNoSub = vo.getReqNo().substring(0,3);
		
		if(reqNoSub.matches("F03|S16")){
			this.updateFspTechSuph(vo);
			
		}else if("XAD100".equals(vo.getAprState())){
			switch(reqNoSub){
				case "S07" : // 파트너 기업 변경신청
					this.saveAppParChngComplete(vo.getReqNo());
					break;
				case "S19" : // 성적서 등록신청
					this.rstBookQrInsertAppComplete(vo.getReqNo());
					break;
				default : break;
			}		
		}
		
		vo.setSuccess(true);
		vo.setMessage("정상처리");	
		
		return vo;
	}
	
	/**
    * 내부기술지원 신청서, 기업부담금입금의뢰 결재 후 사후 작업
    * @param ApiBpmVo
    * @author LeeYH
    * @since 2022.08.05.
    */
	private void updateFspTechSuph(ApiBpmVo vo) throws ElException{
		//내부기술지원 신청서 결재완료 또는 반려시 신청상태 업데이트
		if("F03".equals(vo.getReqNo().substring(0,3))){
			dao.updateFspTechSuphApr(vo);
		}
		
		String unslipNo = dao.selectUnslipNo(vo.getReqNo());	
		
		if("XAD100".equals(vo.getAprState())){
			// 결의서 결재테이블 결재상태 결재완료로 업데이트			
			aprService.modifyAprInterface(unslipNo, "XAD100", vo.getSyspayno());
			
			// 기업부담금 입금상태 수정
			if("S16".equals(vo.getReqNo().substring(0,3))){
				dao.updateSptTltDepstDetlsApr(vo);
			}	
			
			// 전자증빙 가결의 번호 셋팅
			EvidAttachVo attachVo = new EvidAttachVo();
			attachVo.setUnslip_no(unslipNo); 
			attachService.executeProcess(attachVo);
			
		}else if("XAD015".equals(vo.getAprState())){				
			if("F03".equals(vo.getReqNo().substring(0,3))){
				if(!StringUtil.isEmpty(unslipNo)){
					ComReqVo comVo = new ComReqVo();
					comVo.setReq_no(vo.getReqNo());
					comVo.setUnslip_no(unslipNo);
					autoSlipService.deleteFinTechSupSlipMnt(comVo);
				}
			}else{
				if(StringUtil.isEmpty(unslipNo)){
					throw new KitechException(Exceptions.ERROR, Business.SUP, "message.xom.co.com.0007", new String[]{"결의번호"});	
				}
				
				depstService.deleteDepstReqSlipMnt(unslipNo, vo.getReqNo());
			}
		}
	}
	
	/**
    * 파트너 기업 변경신청  결재완료 시점 상태값 저장
    * @param String reqNo
    * @author LeeYH
    * @since 2022.08.04.
    */
	private void saveAppParChngComplete(String reqNo)  throws ElException{
		String bizwrkClsf = "SCH010"; // SCH010 파트너 기업
		
		//1) 파트너 기업 정보 변경신청서 조회
		SptCustVo custVo = dao.selectSptParBaseInfo(reqNo);
		
		// 2) 고객맨토 정보 및 고객업무담당자 삭제
		custVo.setBizwrk_clsf(bizwrkClsf); 
		dao.deleteSptCustMentrInfoApr(custVo);
		
		// 3) 파트너 기업 정보 변경신청서멘토 조회
		custVo.setChng_clsf("2");
		List<SptCustMentrInfoVo> mentrList = dao.selectSptCustMentrChngDList(custVo);
		
		int cnt = 1;
		// 4) 고객멘토정보 입력
		for(SptCustMentrInfoVo mentrVo : mentrList){
			mentrVo.setCust_no(custVo.getCust_no());
			mentrVo.setBizwrk_clsf(bizwrkClsf);
			mentrVo.setMentr_yn("Y");
			mentrVo.setSeq(cnt);
			
			dao.insertSptCustMentrInfo(mentrVo);
			
			// 5) 파트너기업 관리주체 수정
			if(cnt == 1){
				dao.updateSptParBaseInfoRegion(mentrVo);
			}
			
			cnt++;
		}
		
		// 6) 파트너 기업 정보 변경신청서담당자 조회
		List<SptCustChargVo> chargList = dao.selectSptCustChargEngDList(custVo);
		cnt = 1;
		
		// 7) 고객업무담당자 저장
		for(SptCustChargVo chargVo : chargList){
			chargVo.setCust_no(custVo.getCust_no());
			chargVo.setBizwrk(bizwrkClsf);
			chargVo.setSeq(cnt);
			chargVo.setAppont_no(custVo.getAppont_no());
			chargVo.setAffair_respn_psn_dept("");
			
			dao.insertSptCustCharg(chargVo);
			cnt++;
		}	
	}
	
	/**
    * 성적서 등록신청 결재 완료 후 성적서 파일에 QR코드 삽입하는 pdf 변환 호출
    * @param String reqNo
    * @author LeeYH
    * @since 2022.08.04.
    */
	private void rstBookQrInsertAppComplete(String reqNo) throws ElException{
		// 기존문서 삭제하고 새로 QR코드 변환파일 생성시 총 파일 페이지 수 체크하여 넘김
		// job_conv 테이블에서 갑지 포함 총 페이지 수 구하기.  성적서 테이블에서 참조하는것으로 변경되어 주석처리
		//result1= xda.execute("kitech.evi.xda.EvidTotPageSS01", doc);	
		// 성적서 테이블에서 갑지 외 총 페이지 수 구하기. 수정발행의 결재인경우 이전성적서를 찾기 위한 값도 있으므로 job_conv 활용으로 되돌아가도 이 xda는 참조되어야 함.
		SptRstBookVo bookVo = dao.selectSptRstBook(reqNo);
		
		int totPgae = bookVo.getFile_tot_page_num();
		if("Y".equals(bookVo.getBlackacre_clsf())){ // // 갑지를 생성하는 경우 더하기 1
			totPgae++;
		}
		
		bookVo.setTot_page(String.valueOf(totPgae));
		
		// 수정발행인 경우  이전 성적서들은 뷰어서버에 강제로 삭제 flag를 넘김
		if("U".equals(bookVo.getRst_book_issu_fg())){
			bookVo.setMis_pk(dao.selectSptRstBookMaxReq(bookVo));
			
			// 뷰어서버에 플래그 넘김
			trpDao.updatePdfResource(bookVo);
		}
		
		// 앞서 변환된 pdf 정보 삭제 후 최종 QR코드 삽입된 문서만 남김.
		dao.insertJovConvDelList(reqNo); // 삭제대상 테이블에 데이터 입력
		dao.deleteJobConv(reqNo); // job_conv, ACT_PDF_FILE_ALL 테이블 삭제
		
		// 성적서 갑지 및 첨부파일 pdf 변환 호출
		dao.selectSpSumRstBookPdfFile(bookVo);		
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.server.service.BpmPostProcess#getAprProcess()
	 */
	@Override
	public AprProcess getAprProcess() {
		return AprProcess.SPT;
	}

}
