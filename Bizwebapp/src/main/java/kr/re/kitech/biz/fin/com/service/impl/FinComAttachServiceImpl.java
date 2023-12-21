package kr.re.kitech.biz.fin.com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.dao.FinComAttachDAO;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidRptKeyVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.fin.spm.vo.FspEvidAttchListVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;

/**
 * @ClassSubJect 전자증빙관리
 * @Class Name FinComAttachServiceImpl.java
 * @Description 전자증빙관리 ServiceImpl
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/13      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/13
 * @version 1.0
 * @see
 * 
 */
@Service("finComAttachService")
public class FinComAttachServiceImpl extends EgovAbstractServiceImpl implements FinComAttachService {
	@Resource(name="finComAttachDAO")
	private FinComAttachDAO dao;
	
	@Resource(name="generationServiceImpl")
	private GenerationService generationService;
	
	/**
    * 전자증빙 삭제(fspevidattach, fspevidrptkey 만 삭제할 경우 호출)
    * @param String reqNo
    * @return int
    * @author LeeYH
    * @since 2023.04.25.
    */
	public void deleteFspAttchEvid(String reqNo) throws ElException{
		FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
		evidVo.setReq_no(reqNo);
		
		this.deleteFspAttchEvid(evidVo);
	}
	
	/**
    * 전자증빙 삭제
    * @param String reqNo
    * @return int
    * @author LeeYH
    * @since 2023.04.25.
    */
	public void deleteFspAttchEvid(String reqNo, String rqstNo) throws ElException{
		FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
		evidVo.setReq_no(reqNo);
		evidVo.setRqst_no(rqstNo);
		
		this.deleteFspAttchEvid(evidVo);
	}
	
	/**
    * 전자증빙 삭제
    * @param FbaExpnsEvidVo
    * @return int
    * @author LeeYH
    * @since 2022.04.22.
    */
	public void deleteFspAttchEvid(FbaExpnsEvidVo vo) throws ElException{
		// 전자증빙 레포트 키 삭제
		dao.deleteFspEvidRptKey(vo);
		
		// 전자증빙 삭제
		dao.deleteFspEvidAttach(vo);
		
		// 전자증빙 삭제로직 호출 시작(크리스피드 이원길)
		if(vo.getRqst_no() != null && !"".equals(vo.getRqst_no())){
			EvidAttachVo attachVo = new EvidAttachVo();
			attachVo.setRqst_no(vo.getRqst_no()); // 삭제신청번호셋팅
			this.executeProcess(attachVo);
		}		
	}	
	
	/**
    * 전자증빙조회 
    * @param String docId
    * @return List<FspEvidAttachVo>
    * @author LeeYH
    * @since 2023.04.25.
    */
	public List<FspEvidAttachVo> selectFbaExpnsEvidList(String docId, String autoYn) throws ElException{
		FbaExpnsEvidVo vo = new FbaExpnsEvidVo();
		vo.setDoc_id(docId);
		vo.setAuto_yn(autoYn);
		
		return this.selectFbaExpnsEvidList(vo);
	}
	
	/**
    * 전자증빙조회 
    * @param FbaExpnsEvidVo
    * @return List<FspEvidAttachVo>
    * @author LeeYH
    * @since 2022.04.08.
    */
	public List<FspEvidAttachVo> selectFbaExpnsEvidList(FbaExpnsEvidVo vo) throws ElException{
		return dao.selectFbaExpnsEvidList(vo);
	}
	
	/**
    * 전자증빙팝업에서 저장 호출(일반,경비결의,소액물품,구매지급신청에서 사용)
    * @param FspEvidAttchListVo
    * @return List<FspEvidAttachVo>
    * @author LeeYH
    * @since 2022.04.15.
    */
	public String saveFspEvidAttachPop(FspEvidAttchListVo vo) throws ElException{
		FbaExpnsEvidVo evidVo = vo.getExpnsEvidVo();		
		
		// 저장
		List<FspEvidAttachVo> attachList = vo.getGridList();
		for(FspEvidAttachVo attachVo : attachList){
			attachVo.setReq_no(evidVo.getReq_no());
			
			if(evidVo.getDoc_id().matches("110|113|117")){
				attachVo.setUnslip_no(evidVo.getReq_no());
				attachVo.setUnslip_odr(evidVo.getUnslip_odr());
			}
		}
		String evidMngmtNo = this.saveFspEvidAttach(attachList);
		
		// 전자증빙(결의번호 또는 신청번호 업데이트 후 전자증빙 재호출)
		// 전자증빙 팝업에서 저장시 결의번호 업데이트전 이미 전자증빙이 생성되므로 한번더 호출
		if(!StringUtil.isEmpty(attachList.get(0).getReq_no()) && evidVo.getDoc_id().matches("110|113|117")){
			EvidAttachVo attachVo = new EvidAttachVo();
			attachVo.setUnslip_no(attachList.get(0).getUnslip_no()); 
			
			this.executeProcess(attachVo);
		}
		
		return evidMngmtNo;
	}	
	
	/**
    * 전자증빙 저장
    * @param FspEvidAttachVo
    * @return List<FspSlipMngmtVo>
    * @author LeeYH
    * @since 2022.03.31.
    */
	public String saveFspEvidAttach(List<FspEvidAttachVo> voList) throws ElException{	
		String evidMngmtNo = voList.get(0).getEvid_mngmt_no();
		//String docId = voList.get(0).getDoc_id();
		if(evidMngmtNo == null || "".equals(evidMngmtNo)){
			evidMngmtNo = dao.selectEvidMngmtNo(voList.get(0).getReq_no());
			
			if(StringUtil.isEmpty(evidMngmtNo)){
				evidMngmtNo = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "CEV"); 
			}
		}
		
		FspEvidRptKeyVo keyVo =  null;
		for(FspEvidAttachVo vo : voList){
			vo.setEvid_mngmt_no(evidMngmtNo);				
			AppLog.info("\n +++++++++++++++++ FspEvidAttachVo : " + vo);
			if(vo.getEvid_mngmt_seq() == 0){
				vo.setEvid_mngmt_seq(dao.selectEvidMngmtSeq(vo));
			}
			if(dao.mergeFspEvidAttach(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.COM, "message.xom.co.com.0002", new String[]{"전자증빙저장"});
			}
			
			// fspevidrptkey저장			
			if("report".equals(vo.getEvid_type())){
				String[] arrKeyCol = vo.getKey_col().split(",");
				String[] arrKeyVal = vo.getKey_val().split(",");
				int keyLen = arrKeyCol.length;
				if (keyLen > 1) { // 복수키 + 복수값
					if (keyLen != arrKeyVal.length) {
						throw new KitechException(Exceptions.ERROR, Business.COM, "message.alert.fin.com.0039", new String[]{vo.getEvid_item_cd()});
					}	
					
					for (int i = 0; i < keyLen; i++) {
						keyVo = new FspEvidRptKeyVo();
						keyVo.setEvid_mngmt_no(vo.getEvid_mngmt_no());
						keyVo.setEvid_item_cd(vo.getEvid_item_cd());
						keyVo.setEvid_mngmt_seq(vo.getEvid_mngmt_seq());
						keyVo.setSeq(1);
						keyVo.setKey_col(arrKeyCol[i]);
						keyVo.setKey_val(arrKeyVal[i]);
						
						if(dao.updateFspEvidRptKey(keyVo) == 0){
							throw new KitechException(Exceptions.ERROR, Business.COM, "message.xom.co.com.0002", new String[]{"전자증빙 레포트 키 저장"});
						}
					}
								
				}else{ // 단일키 + 복수값 (예시: 통합발주 - seq를 두어 evid_item_cd를 구분)
					int i = 0;
					keyVo = new FspEvidRptKeyVo();
					keyVo.setEvid_mngmt_no(vo.getEvid_mngmt_no());
					keyVo.setEvid_item_cd(vo.getEvid_item_cd());
					keyVo.setEvid_mngmt_seq(vo.getEvid_mngmt_seq());
					keyVo.setKey_col(vo.getKey_col());
					
					for (String keyVal : arrKeyVal) {
						keyVo.setSeq(++i);
						keyVo.setKey_val(keyVal);
						
						if(dao.updateFspEvidRptKey(keyVo) == 0){
							throw new KitechException(Exceptions.ERROR, Business.COM, "message.xom.co.com.0002", new String[]{"전자증빙 레포트 키 저장"});
						}
					}
				}				
			} // 레포트 키 저장 끝
		}
				
		return evidMngmtNo;
	}
	
	/**
    * 결의생성시 결의번호 업데이트
    * @param String reqNo, String unslipNo, int unslipOdr
    * @author LeeYH
    * @since 2023.04.27.
    */
	public void updateFspEvidAttachUnslipNo(String reqNo, String unslipNo, int unslipOdr) throws KitechException{
		FinSpaSlipUpdVo updVo = new FinSpaSlipUpdVo();
		updVo.setReq_no(reqNo);
		updVo.setUnslip_no(unslipNo);
		updVo.setUnslip_odr(unslipOdr);
		
		this.updateFspEvidAttach(updVo);
	}
	
	/**
    * 결의삭제시 결의번호 초기화
    * @param String reqNo, String unslipNo, int unslipOdr
    * @author LeeYH
    * @since 2023.04.27.
    */
	public void updateFspEvidAttachUnslipNoDel(String reqNo, String unslipNo, String rqstNo) throws KitechException{
		FinSpaSlipUpdVo updVo = new FinSpaSlipUpdVo();
		updVo.setReq_no(reqNo);
		updVo.setUnslip_no("");
		if(!"".equals(rqstNo)){
			updVo.setRqst_no(rqstNo);
		}
		
		this.updateFspEvidAttach(updVo);
	}
	
	/**
    * 결의생성 또는 삭제시 결의번호 업데이트
    * @param FinSpaSlipUpdVo
    * @return int
    * @author LeeYH
    * @since 2022.07.13.
    */
	public void updateFspEvidAttach(FinSpaSlipUpdVo vo) throws ElException{		
		dao.updateFspEvidAttach(vo);
		
		// 전자증빙 삭제로직 호출 시작(크리스피드 이원길)
		if(vo.getRqst_no() != null && !"".equals(vo.getRqst_no())){
			EvidAttachVo attachVo = new EvidAttachVo();
			attachVo.setRqst_no(vo.getRqst_no()); // 삭제신청번호셋팅
			this.executeProcess(attachVo);
		}	
	}
	
	/**
    * 전자증빙 기준데이터 삭제 또는 처리(크리스피드)
    * @param EvidAttachVo
    * @author LeeYH
    * @since 2022.07.13.
    */
	public void executeProcess(EvidAttachVo vo) throws ElException{
		String rqstNo = (vo.getRqst_no() == null)? "" : vo.getRqst_no();
		String slipNo = (vo.getSlip_no() == null)? "" : vo.getSlip_no();
		String unslipNo = (vo.getUnslip_no() == null)? "" : vo.getUnslip_no();
		String reqNo = (vo.getReq_no() == null)? "" : vo.getReq_no();
		
		if(!"already".equals(rqstNo)){ // RQST_NO = "already"이면 무조건 삭제하지 않음
			String delKey = rqstNo;
			
			if("".equals(delKey)){ // 삭제 신청번호가 없을 경우
				if(!"".equals(slipNo)){
					delKey = slipNo;
				}else if(!"".equals(unslipNo)){
					delKey = vo.getUnslip_no();
				}else if(!"".equals(reqNo)){
					delKey = vo.getReq_no();
				}
			}
			
			if(!"".equals(delKey)){
				// 최종 조정된 삭제신청번호 설정
				vo.setRqst_no(delKey);
				// 삭제대상 테이블에 데이터 입력
				dao.insertJobConvDelList(vo);
				
				// job_conv 테이블 삭제
				dao.deleteJobConv(vo);
				
				// ACT_PDF_FILE_ALL 테이블 삭제
				dao.deleteActPdfFileAll(vo);
			}
		}
		
		// 명시적으로 삭제요청이 아닌 건만 처리
		if("".equals(rqstNo) || "already".equals(rqstNo)){
			if(!"".equals(slipNo) || !"".equals(unslipNo) || !"".equals(reqNo)){ // 관련번호가 하나라도 있어야 처리
				dao.selectCallSpActPdfFileall(vo); // 프로시저(sp_act_pdf_file_all) 실행
			}
		}
	}

}