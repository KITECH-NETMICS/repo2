package kr.re.kitech.biz.sup.tlt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComDepstReqService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.fnd.service.FndDepstReqMntService;
import kr.re.kitech.biz.sup.tlt.dao.SptTltDepstInfoDAO;
import kr.re.kitech.biz.sup.tlt.service.SptTltDepstInfoService;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstDetlsVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstInfoVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstItemVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstSaveVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstSrcVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @ClassSubJect 기업부담금입금의뢰 Controller
 * @Class Name SptTltDepstInfoController.java
 * @Description 기업부담금입금의뢰 관련 처리를 담당하는 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/22   손태화             최초생성
 * 
 * @author 손태화
 * @since 2023/08/22
 * @version 1
 * @see
 * 
 */
@Service("sptTltDepstInfoServiceImpl")
public class SptTltDepstInfoServiceImpl  extends EgovAbstractServiceImpl implements SptTltDepstInfoService {
	
    @Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;
    
    @Resource(name="apprCommonServiceImpl")
	private ApprCommonService aprComService;		
    
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="sptTltDepstInfoDAO")
	private SptTltDepstInfoDAO tltDAO;
	
	@Resource(name="finComDepstReqService")
	private FinComDepstReqService depstService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	@Resource(name="finSlipSaveService")
	private FinSlipSaveService finSlipService;
	
	@Resource(name="fndDepstReqMntService")
	private FndDepstReqMntService fndService;
	
	@Resource(name="attachDAO")
	private AttachDAO attachDao;
	
  /**
   * 기업부담금입금의뢰 목록
   * @author 손태화
   * @param SptTltDepstSrcVo
   * @return List<SptTltDepstInfoVo> 기업부담금입금의뢰 목록
   * @throws KitechException 공통예외
   */
  @Override
  public List<SptTltDepstInfoVo> selectSptTltDepstInfoList(SptTltDepstSrcVo vo) throws KitechException {
	  return tltDAO.selectSptTltDepstInfoList(vo);	
  }
  
  /**
   * 기업부담금 입금예정관리 팝업 조회
   * @author 손태화
   * @param SptTltDepstSrcVo
   * @return SptTltDepstSaveVo
   * @throws KitechException 공통예외
   */
  @Override
  public SptTltDepstSaveVo selectSptTltDepstInfoDetail(SptTltDepstSrcVo vo) throws KitechException{
	  SptTltDepstSaveVo rstVo = new SptTltDepstSaveVo();
	  
	  // 1. 상세정보 조회
	  rstVo.setDepstVo(tltDAO.selectSptTltDepstInfoDetail(vo));
	  
	  // 2. 기업지원직내역
	  rstVo.setItemList(tltDAO.selectSptTltDepstItemList(vo));
	  
	  // 3.입금의뢰 내역 조회
	  rstVo.setDetlsList(tltDAO.selectSptTltDepstDetls(vo.getDepst_mngmt_no()));

	  return rstVo;	
  }
  
  /**
	* 기업부담금 입금예정관리 팝업 - 업체조회
	* @param String custNo
	* @return SptTltDepstInfoVo
	* @throws Exception
	* @author LeeYoungHee
	* @since 2023.12.13.
	*/
	public SptTltDepstInfoVo selectSptCustBaseInfo(String custNo) throws KitechException{
		return tltDAO.selectSptCustBaseInfo(custNo);
	}
	
	/**
	* 기업지원연구직 콤보박스
	* @param String mngmtNo
	* @return List<SptTltDepstItemVo>
	* @throws Exception
	* @author LeeYoungHee
	* @since 2023.12.13.
	*/
	public List<SptTltDepstItemVo> selectSptDisPatchPrCond(String mngmtNo) throws KitechException{
		return tltDAO.selectSptDisPatchPrCond(mngmtNo);
	}
	
	/**
	* 기업부담금 입금예정관리 저장
	* @param SptTltDepstSaveVo
	* @return String
	* @throws Exception
	* @author LeeYoungHee
	* @since 2023.12.14.
	*/
	public String saveSptTltDepstInfo(SptTltDepstSaveVo vo) throws KitechException{
		// 1) 입금예정내역 저장
		SptTltDepstInfoVo depstVo = vo.getDepstVo();
		String depstMngmtNo = depstVo.getDepst_mngmt_no();
		if(StringUtils.isBlank(depstMngmtNo)){
			depstMngmtNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "S15");
			
			depstVo.setDepst_mngmt_no(depstMngmtNo);
			
			tltDAO.insertSptTltDepstInfo(depstVo);
		}else{
			tltDAO.updateSptTltDepstInfo(depstVo);
		}
		
		// 2) 기술지원직 내역 저장
		for(SptTltDepstItemVo itemVo : vo.getItemList()){
			if(!"D".equals(itemVo.getCud_type())){
				itemVo.setDepst_mngmt_no(depstMngmtNo);
				tltDAO.mergeSptTltDepstItem(itemVo);
			}else{
				tltDAO.deleteSptTltDepstItem(itemVo);
			}
		}
		
		return depstMngmtNo;
	}
	
	/**
	* 기업부담금 입금예정관리 삭제
	* @param SptTltDepstSrcVo
	* @throws Exception
	* @author LeeYoungHee
	* @since 2023.12.14.
	*/
	public void deleteSptTltDepstInfo(SptTltDepstSrcVo vo) throws KitechException{
		tltDAO.deleteSptTltDepstInfo(vo.getDepst_mngmt_no());
	}
	
	/**
     * 기업부담금 입금의뢰 저장
     * @param List<FcpDepstReqVo>
	 * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.15.
     */
	public String saveSptTltDepstReq(List<FcpDepstReqVo> depstList) throws KitechException{
		
		String reqNo = "";
		String depstClsf = "";
		long depstAmtSum = 0;
		for(FcpDepstReqVo vo : depstList){
			reqNo = vo.getReq_no();
			depstClsf = vo.getDepst_clsf();
			
			depstAmtSum += vo.getDepst_liq() - vo.getBf_depst_liq();
			
			if("C".equals(vo.getCud_type())){
				reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "S16");
				vo.setReq_no(reqNo);
				
				// 인터페이스 저장
				apprFuncService.formInit(reqNo, "S962", KitechContextUtil.getUserId(), ((!"".equals(vo.getRmk())? vo.getRmk()+"/" : "")) + vo.getAccnt_no());			
			}
			
			// 01.입금의뢰(fcpdepstreq) 저장
			vo.setDepst_ymd(vo.getAcct_txday());
			vo.setDepst_schdl_seq(1);
			vo.setDepst_schdl_detls_seq(1);
			vo.setDepst_clsf("FBD082"); // 기업부담금
			
			depstService.saveDepstReq(vo);			
			
			// 02. 기업부담금 상세 저장
			vo.setDepst_mngmt_no(vo.getDepst_mngmt_no());
			tltDAO.mergeSptTltDepstDetls(vo);
			
			// 03. 전자증빙
			List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList("S16", "Y");
			int idx =0;
			for(FspEvidAttachVo attachVo : attachList){				
				if("R014".equals(attachVo.getEvid_item_cd())){
					attachVo.setReq_no(reqNo);
					attachVo.setKey_val(reqNo + "," + reqNo); 
				}else{
					attachList.remove(idx);
				}				
			}
			attachService.saveFspEvidAttach(attachList);
			
			if("C".equals(vo.getCud_type()) && "STX010".equals(depstClsf)){
				// 기업지원금(S16) 최조 저장시 민간인납부금 저장
				SptTltDepstDetlsVo detlsVo = new SptTltDepstDetlsVo();
				detlsVo.setReq_no(genService.getGenNumber(Numberings.DOCUMENT.getName(), "S17"));
				detlsVo.setCust_no(vo.getVend_cd());
				detlsVo.setReq_psn(vo.getReq_psn());
				tltDAO.insertSptTltPricBth(detlsVo);
			}			
		}
		
		// 04. 입금예정관리 실입금액 수정
		SptTltDepstDetlsVo detlsVo = new SptTltDepstDetlsVo();
		detlsVo.setDepst_mngmt_no(depstList.get(0).getDepst_mngmt_no());
		detlsVo.setDepst_amt(depstAmtSum);
		
		tltDAO.updateSptTltDepstInfoAmt(detlsVo);	
		
		return reqNo;
	}
	
	/**
     * 기업부담금 입금의뢰 삭제
     * @param List<FcpDepstReqVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.15.
     */
	public void deleteSptTltDepstReq(List<FcpDepstReqVo> depstList) throws KitechException{
		long depstAmtSum = 0;
		for(FcpDepstReqVo vo : depstList){
			if(StringUtils.isNotBlank(vo.getUnslip_no())){
				// 결의서 삭제
				this.deleteSptTltDepstSlip(vo.getUnslip_no(), false);
			}
			// 01.입금의뢰 삭제
			depstService.deleteDepstReq(vo);		
			
			// 02. 입금관리내역 삭제
			tltDAO.deleteSptTltDepstDetls(vo.getReq_no());	
			
			depstAmtSum+= vo.getDepst_liq();
			
			// 03. 결재 삭제
			apprFuncService.formRemove(vo.getReq_no());
		}
		
		// 03. 입금예정관리 실입금액 수정
		SptTltDepstDetlsVo detlsVo = new SptTltDepstDetlsVo();
		detlsVo.setDepst_mngmt_no(depstList.get(0).getDepst_mngmt_no());
		detlsVo.setDepst_amt(depstAmtSum * (-1));
		
		tltDAO.updateSptTltDepstInfoAmt(detlsVo);		
	}
	
	/**
    * 기업부담금 입금결의 삭제
    * @param String unslipNo
    * @author LeeYH
    * @since 2023.12.15.
    */
	private void deleteSptTltDepstSlip(String unslipNo, boolean updFlag) throws KitechException{		
		// 자동결의외에 수정된 건이 있는지 조사(분개코드(Fn9910, Fn9920)외의 건수구하기)
		finSlipService.selectAutoSlipCnt(unslipNo);
		
		// 1) 결의서 삭제
		finSlipService.deleteFspSlip(unslipNo);
		
		// 2) 잔액정산 삭제, 잔액생성 수정 - fspramtcreat.won_adjst_amt 초기화
		depstService.deleteFspRamtAdjst(unslipNo, updFlag);		
		
		// 3) 전자증빙삭제(입금내역확인증)
		attachService.deleteFspAttchEvid(unslipNo, unslipNo);		
		
		// 4) xomxintfatab 결의결재상태 테이블 삭제
		aprComService.delXomxintfatab(unslipNo);
	}
	
	/**
    * 기업부담금 입금의뢰 결재신청
    * @param SptTltDepstSaveVo
    * @author LeeYH
    * @since 2023.12.15.
    */
	public void approvalSptTltDepstReq(SptTltDepstInfoVo vo) throws KitechException{
		
		String unslipNo = vo.getUnslip_no();
		// 결의번호 있을 경우 결의서 삭제
		if(StringUtils.isNotBlank(unslipNo)){
			// 결의서 삭제
			this.deleteSptTltDepstSlip(unslipNo, true);
		}
		
		// 1) 결의서 생성
		FcpDepstReqVo depstVo = tltDAO.selectSptTltDepstDetlsApr(vo.getDepst_mngmt_no());
		depstVo.setSlip_ymd(depstVo.getReq_ymd());
		depstVo.setRamt(vo.getDepst_schdl_amt() - vo.getReal_amt());
		
		unslipNo = fndService.saveDepstReqSlipMnt(depstVo);
		
		// 2) spttltdepstdetls에 결의번호 업데이트		
		depstVo.setUnslip_no(unslipNo);
		tltDAO.updateSptTltDepstDetlsUnslipNo(depstVo);
		
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(vo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setUiId("S962");
		aprVo.setInfo(vo.getCmpy_nm_krchar());
		aprVo.setExt1Cd(depstVo.getAccnt_no());
		
		SptTltDepstSaveVo modelVo = new SptTltDepstSaveVo();
		modelVo.setDepstVo(vo);
		
		// 공통코드
		depstVo.setDepst_clsf(CodeCacheManager.getInstance().getCode("FBD", depstVo.getDepst_clsf()).getComNm());
		depstVo.setBank_cd(CodeCacheManager.getInstance().getCode("FAA", depstVo.getBank_cd()).getComNm());
		modelVo.setReqVo(depstVo);
		
		if(StringUtils.isNotBlank(depstVo.getAttach_file_no())){
			modelVo.setFileList(attachDao.selectListAttach(depstVo.getAttach_file_no()));
		}
		
		// 결재내역		
		apprFuncService.approvalRequest(aprVo, modelVo);
	} 
}
