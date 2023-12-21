package kr.re.kitech.biz.bud.frc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.bud.frc.dao.BblEnfrcDAO;
import kr.re.kitech.biz.bud.frc.service.BblEnfrcService;
import kr.re.kitech.biz.bud.frc.vo.BblEnfrcReqVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.vo.AutoBugtVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**
 * @ClassSubJect 
 * @ClassName : BblEnfrcServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.01.      작업자    최초생성
 * 
 * @author 
 * @since 2023.09.01.
 * @version 1.0
 * @see
 * 
 */
@Service("bblEnfrcServiceImpl")
public class BblEnfrcServiceImpl  extends EgovAbstractServiceImpl implements BblEnfrcService {
  @Resource(name="bblEnfrcDAO")
  private BblEnfrcDAO budDAO;
  
  @Resource(name="finComService")
  private FinComService finComService;
  
  @Resource(name="generationServiceImpl")
  private GenerationService genService;
  
  @Resource(name = "apprFuncServiceImpl")
  private ApprFuncService apprFuncService;  
  
  @Resource(name="attachDAO")
  private AttachDAO attachDAO;
  
  @Resource(name="finComAttachService")
  private FinComAttachService attachService;

  /**
   * 일반예산신청 목록 조회
   * 
   * @author 
   * @param BblEnfrcReqVo
   * @return List<BblEnfrcVo>
   * @throws KitechException
   * @since 2023.09.02.   
   */
  @Override
  public List<BblEnfrcReqVo> selectList01(BblEnfrcReqVo vo) throws KitechException {
    List<BblEnfrcReqVo> list = budDAO.selectList01(vo);	
    return list;
  }

  /**
   * 일반예산신청 상세 조회
   * 
   * @author 
   * @param BblEnfrcReqVo
   * @return BblEnfrcVo
   * @throws KitechException
   * @since 2023.09.03.   
   */
  @Override
  public BblEnfrcReqVo selectItem01(BblEnfrcReqVo vo) throws KitechException {
    BblEnfrcReqVo resultVO = budDAO.selectItem01(vo);
    return resultVO;
  }

  /**
   * 일반예산신청 저장, 수정, 결재
   * 
   * @author 
   * @param BblEnfrcReqVo
   * @return BblEnfrcVo
   * @throws KitechException
   * @since 2023.09.11.   
   */
  @Override
	public String saveItem01(BblEnfrcReqVo vo) throws KitechException {
	  	String cud_type = vo.getCud_type();
		String budReqNo = vo.getReq_no();// 신청번호 채번
		// 1) 일반예산신청 저장
		if (cud_type.equals("I")) {
			budReqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F21");// 예산집행 신청번호 채번
			vo.setReq_no(budReqNo);
			vo.setReq_seq(1);
			
			// 1-1) 인터페이스 테이블 저장
			apprFuncService.formInit(vo.getReq_no(), "F903", KitechContextUtil.getUserId(), vo.getVend_nm());	
			
			if("218".equals(vo.getExpns_cd())){
				// 1-2) 전자증빙
				List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList("F21", "Y");
				for(FspEvidAttachVo attachVo : attachList){
					// 예실대비표(F06)
					attachVo.setReq_no(budReqNo);
					attachVo.setKey_val(vo.getAccnt_no() + "," + vo.getItm_solve_base() + "," + "0");
					attachService.saveFspEvidAttach(attachList);
				}
			}				
		}
		
		finComService.budEnfrcMnt01(vo);	
		
		if(vo.isApproval()){ 		
			// 02.전자증빙(크리스피드)
			EvidAttachVo attachVo = new EvidAttachVo();
			attachVo.setUnslip_no(vo.getReq_no()); 
			attachService.executeProcess(attachVo);		
			
			// 03.결재신청
		  	AutoBugtVo BugtVo = new AutoBugtVo();
		  	BugtVo.setAccnt_no(vo.getAccnt_no());
		
		  	BugtVo = finComService.getAccntAutoBugtPsn2(BugtVo);
		
			AprVo aprVo 	= new AprVo();		
		
			vo.setEnfrc_amt_cause(0);
			vo.setReq_seq(1);
			vo.setCud_type("U");
			vo.setApr_state("XAD010");
			
			aprVo.setReqNo(vo.getReq_no());
			aprVo.setEndpoint(KitechContextUtil.getUserId());
			aprVo.setReporterId(KitechContextUtil.getSyspayno());
			aprVo.setAprState(vo.getApr_state());
			aprVo.setAccountCharger(BugtVo.getAccnt_rspns());
			aprVo.setBudgetController(BugtVo.getBugt_ctrl_psn());
			aprVo.setExt1Cd(vo.getAccnt_no());
			aprVo.setInfoCd(vo.getVend_nm());
			aprVo.setRuleMoney(""+vo.getReq_amt());
			aprVo.setRuleType("ADR040");
			aprVo.setReqClsf(vo.getReq_clsf());		
			aprVo.setUiId("F903");
			
			// 모델에 첨부파일 및 컬렉션류의 데이터 리스트 추가(필요시)		
			vo.setFileList(attachDAO.selectListAttach(vo.getAttach_file_no()));
									
			// 전자결재 기능 메소드 호출 (결재신청)
			apprFuncService.approvalRequest(aprVo, vo);									
		}
		return vo.getReq_no();
	}
	
 /**
   * 일반예산신청 삭제
   * 
   * @author 
   * @param BblEnfrcReqVo
   * @return BblEnfrcReqVo
   * @throws KitechException
   * @since 2023.09.06.   
   */
    @Override
    public void deleteItem01(DelBblEnfrcVo vo) throws KitechException {
    	// 1) 일반예산신청 삭제
    	finComService.deleteBudEnfrcMnt(vo);	
    	
    	// 2) 전자증빙 삭제
    	attachService.deleteFspAttchEvid(vo.getReq_no(), vo.getReq_no());
    	
    	// 3) 결재 삭제
    	apprFuncService.formRemove(vo.getReq_no());
	}

}
