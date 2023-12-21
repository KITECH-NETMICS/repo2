package kr.re.kitech.biz.ccs.cwl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ccs.cwl.dao.CwlFwLoanReqDAO;
import kr.re.kitech.biz.ccs.cwl.service.CwlFwLoanReqService;
import kr.re.kitech.biz.ccs.cwl.vo.CwlFwLoanReqVo;
import kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMasterVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**
 * @ClassSubJect 상조회대출신청 erviceImpl
 * @ClassName : CwlFwLoanReqServiceImpl.java
 * @Description 상조회대출신청 서비스 구현
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.04.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.09.04.
 * @version 1.0
 * @see
 * 
 */
@Service("cwlFwLoanReqServiceImpl")
public class CwlFwLoanReqServiceImpl  extends EgovAbstractServiceImpl implements CwlFwLoanReqService {
  @Resource(name="cwlFwLoanReqDAO")
  private CwlFwLoanReqDAO cwlDAO;
  
  @Resource(name="generationServiceImpl")
  private GenerationService generationService;

  @Resource(name = "apprFuncServiceImpl")
  public ApprFuncService apprFuncService;

  @Resource(name="apprValidServiceImpl")
  private ApprValidService apprValidService;    

  //결재관련 추가
  @Resource(name="apprCommonServiceImpl")
  private ApprCommonService aprComService;
    
  /**
   * 상조회대출신청 목록 조회
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return List<CwlFwLoanReqVo>
   * @throws KitechException
   * @since 2023.09.04.   
   */
  @Override
  public List<CwlFwLoanReqVo> selectList(CwlFwLoanReqVo vo) throws KitechException {
	  List<CwlFwLoanReqVo> list = cwlDAO.selectList(vo);	
	  return list;
  }

  /**
   * 상조회대출신청 상세 조회
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return CwlFwLoanReqVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  @Override
  public CwlFwLoanReqVo selectItem(CwlFwLoanReqVo vo) throws KitechException {
	  CwlFwLoanReqVo resultVO = cwlDAO.selectItem(vo); // 상세조회
	  
	  // 기대출금, 퇴직금, 전별금 조회
	  CwlFwLoanReqVo loanRamtInfoVo = this.selectloanRamtInfo(resultVO);
	  if (null != loanRamtInfoVo) {
		  resultVO.setLoan_ramt(loanRamtInfoVo.getLoan_ramt());				// 총대출잔액
		  resultVO.setAid_loan_ramt(loanRamtInfoVo.getAid_loan_ramt());		// 상조회대출잔액
		  resultVO.setUniv_loan_ramt(loanRamtInfoVo.getUniv_loan_ramt());	// 대학융자금잔액
		  
		  resultVO.setRetire_appro(loanRamtInfoVo.getRetire_appro()); 	// 퇴직금
		  
		  resultVO.setAvail_sum(loanRamtInfoVo.getAvail_sum());			// 전별금
	  } 	
	  
      return resultVO;
  }

  /**
   * 상조회대출신청 등록
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return int
   * @throws KitechException
   * @since 2023.09.04.   
   */
  @Override
  public CwlFwLoanReqVo insertItem(CwlFwLoanReqVo vo) throws KitechException {
      CwlFwLoanReqVo resultVo = new CwlFwLoanReqVo();
	  
	  if("C".equals(vo.getCud_type())){ // 신규등록일때
			vo.setReq_no(generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C64"));
			// 상조회대출신청 등록
			cwlDAO.insertItem(vo);
			
			// 인터페이스 테이블 저장
			apprFuncService.formInit(vo.getReq_no(), "C253", "");
	  }else{ // 수정일때
		
		  // AprState 체크하는 공통 메소드호출
		  try {
			    apprValidService.isWaitStateAtIntfatab("C253", vo.getReq_no());
		  } catch (KitechException ex) {
			    throw ex;
		  }
			
		  // 상조회대출신청 수정
		  cwlDAO.updateItem(vo);
			
		  //전자결재 반려,회수후 신청화면 [저장]버튼을 클릭하면 인터페이스 테이블에 재신청이 가능하게 "XAD005" 수정
		  if ("XAD015".equals(vo.getApr_state())) {
			  aprComService.modifyAprInterface(vo.getReq_no(), "XAD005", KitechContextUtil.getUserId());
		  }
	  }
		
	  if(vo.isApproval()){
		  // 결재정보
		  AprVo aprVo = new AprVo();
		  aprVo.setEndpoint(KitechContextUtil.getUserId());
		  aprVo.setReqNo(vo.getReq_no());
		  aprVo.setUiId("C253"); //서비스ID
		  aprVo.setLoginUserId(KitechContextUtil.getUserId());
		  aprVo.setReporterId(vo.getReq_psn_syspayno());
		  String infoCd = vo.getReq_psn() + "(" + vo.getEmpno() + ")" + " / 신청금액: " + StringUtil.toCurrency(vo.getLoan_amt()) + "원";
		  aprVo.setInfoCd(infoCd); //서비스ID
				
		  apprFuncService.approvalScreen(aprVo, vo);
	  }

	  resultVo.setReq_no(vo.getReq_no());
	  return resultVo;
  }
  
  /**
   * 상조회대출신청 반려, 승인 처리 
   * 
   * @author lsh
   * @param CwlFwLoanReqVo
   * @return void
   * @throws KitechException
   * @since 2023.08.30.   
   */
  @Override
  public void cwlFwLoanReqProcApr(CwlFwLoanReqVo vo) throws KitechException {
	  if("agree".equals(vo.getReq_action())){ // 승인
	 		AprVo aprVo = new AprVo();			
	 		aprVo.setReqNo(vo.getReq_no());	//신청번호
	 		aprVo.setLoginUserId(KitechContextUtil.getUserId());
	 		aprVo.setReporterId(vo.getReq_psn_syspayno());
	 		aprVo.setUiId("C253");
	 		aprVo.setOperCode("0");
	 		aprVo.setBiz(true);
	 		aprVo.setResult("");
	 		aprVo.setEndpoint(KitechContextUtil.getUserId());	//아이디
	 		
	 		// 승인처리
	 		apprFuncService.formAccept(aprVo);	
	 		
	  }else if("reject".equals(vo.getReq_action())){ 	// 반려
		  AprScVo aprScVo = new AprScVo();		
		  aprScVo.setReqNo(vo.getReq_no());			//신청번호	
		  aprScVo.setComments(vo.getComments());	//반려사유
		  aprScVo.setEndpoint(KitechContextUtil.getUserId());
		
		  // 반려처리
		  if (AprState.isComplate(vo.getApr_state())) {
			  // 담당자 반려처리
			  apprFuncService.formAuthReject(aprScVo);
		  } else {
			  apprFuncService.formReject(aprScVo);
		  }
	  }
  }  
   
  /**
   * 상조회대출신청 삭제
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return int
   * @throws KitechException
   * @since 2023.09.04.   
   */
  @Override
  public void deleteItem(CwlFwLoanReqVo vo) throws KitechException {
	  cwlDAO.deleteItem(vo);
	  // 결재정보 삭제
	  apprFuncService.formRemove(vo.getReq_no());
  }
  
  /**
   * 대출금마스터-기대출금, 퇴직금, 전별금 조회
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return CwlFwLoanReqVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  @Override
  public CwlFwLoanReqVo selectloanRamtInfo(CwlFwLoanReqVo vo) throws KitechException {
	  // 기대출금조회 
	  CwlFwLoanReqVo resultVO = cwlDAO.selectloanRamtInfo(vo);
	  
	  CwlFwLoanReqVo retireApproVo = new CwlFwLoanReqVo();
	  CwlFwLoanReqVo cwlFriHpScaRwlVo = new CwlFwLoanReqVo();
	  
	  // 퇴직금 조회
	  if("Y".equals(vo.getSci_tech_anuty())){
		  retireApproVo = cwlDAO.selectHumSlmmPayCd(vo);
	  }else{
		  retireApproVo = cwlDAO.selectHumSlmmPayAmt(vo);			
	  }
	  
	  if (null != resultVO) {
		  resultVO.setRetire_appro(retireApproVo.getRetire_appro());

		  // 전별금 조회
		  cwlFriHpScaRwlVo = cwlDAO.selectCwlFriHpScaRwl(vo);
		  resultVO.setAvail_sum(cwlFriHpScaRwlVo.getAvail_sum());
	  }
	  			
      return resultVO;
  }
  
  /**
   * 급여계좌정보 조회
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return CwlFwLoanReqVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  @Override
  public CwlFwLoanReqVo selectHumBankBasicInfo(CwlFwLoanReqVo vo) throws KitechException {
	  CwlFwLoanReqVo resultVO = cwlDAO.selectHumBankBasicInfo(vo);	
	  return resultVO;
  }
  
  /**
   * 확정내역 조회
   * 
   * @author 
   * @param CwlFwLoanReqVo
   * @return int
   * @throws KitechException
   * @since 2023.09.04.   
   */
  @Override
  public CwlFwLoanReqVo selectDecideInfo(CwlFwLoanReqVo vo) throws KitechException {
	  CwlFwLoanReqVo resultVO = cwlDAO.selectDecideInfo(vo);
	  return resultVO;
  }
  
  /**
   * 대출금마스터 등록
   * 
   * @author 
   * @param CwlLoanPopVo
   * @return void
   * @throws KitechException
   * @since 2023.09.04.   
   */
  @Override
  public void insertCwlLoanMaster(CwlLoanMasterVo vo) throws KitechException {
	  CwlLoanMasterVo resultVO = cwlDAO.selectCwlLoanRts(vo);
	  if(!"".equals(resultVO.getLoan_rts()) && null != resultVO.getLoan_rts()){
		  vo.setLoan_rts(resultVO.getLoan_rts());
		  cwlDAO.insertCwlLoanMaster(vo);
	  }
  }
  
}
