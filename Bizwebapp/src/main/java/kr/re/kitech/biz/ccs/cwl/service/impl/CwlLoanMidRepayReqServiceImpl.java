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
import kr.re.kitech.biz.apr.vo.DocCommentsVo;
import kr.re.kitech.biz.ccs.cwl.dao.CwlLoanMidRepayReqDAO;
import kr.re.kitech.biz.ccs.cwl.service.CwlLoanMidRepayReqService;
import kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMasterVo;
import kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqListVo;
import kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**
 * @ClassSubJect 대출중도상환신청 serviceImpl
 * @ClassName : CwlLoanMidRepayReqServiceImpl.java
 * @Description 대출중도상환신청 서비스 구현체
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.08.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.09.08.
 * @version 1.0
 * @see
 * 
 */
@Service("cwlLoanMidRepayReqServiceImpl")
public class CwlLoanMidRepayReqServiceImpl  extends EgovAbstractServiceImpl implements CwlLoanMidRepayReqService {
  @Resource(name="cwlLoanMidRepayReqDAO")
  private CwlLoanMidRepayReqDAO cwlDAO;

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
   * 대출중도상환신청 목록 조회
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return List<CwlLoanMidRepayReqVo>
   * @throws KitechException
   * @since 2023.09.08.   
   */
  @Override
  public List<CwlLoanMidRepayReqVo> selectList(CwlLoanMidRepayReqVo vo) throws KitechException {
	  List<CwlLoanMidRepayReqVo> list = cwlDAO.selectList(vo);	
	  return list;
  }

  /**
   * 대출중도상환신청 상세 조회
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return CwlLoanMidRepayReqVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  @Override
  public CwlLoanMidRepayReqVo selectItem(CwlLoanMidRepayReqVo vo) throws KitechException {
	  CwlLoanMidRepayReqVo resultVO = cwlDAO.selectItem(vo);
	  
	  // 반려의견 조회
	  DocCommentsVo docVo = new DocCommentsVo();
	  docVo.setReq_no(vo.getReq_no());
	  docVo.setOpt_type("rejecttop");
	  //retVo.setDocList(apprCommonService.selectDocComments(docVo));
	  
      return resultVO;
  }

  /**
   * 대출중도상환신청 등록
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return int
   * @throws KitechException
   * @since 2023.09.08.   
   */
  @Override
  public CwlLoanMidRepayReqVo insertItem(CwlLoanMidRepayReqVo vo) throws KitechException {
	  CwlLoanMidRepayReqVo resultVo = new CwlLoanMidRepayReqVo(); 
	  vo.setReq_no(generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C85"));
	  
	  // 대출중도상환신청 등록
	  cwlDAO.insertItem(vo);
	
	  // 인터페이스 테이블 저장
	  apprFuncService.formInit(vo.getReq_no(), "C274", "");

	  resultVo.setReq_no(vo.getReq_no());
	  return resultVo;
  }
  
  /**
   * 대출중도상환신청 수정
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  @Override
  public void updateItem(CwlLoanMidRepayReqVo vo) throws KitechException {
	  // AprState 체크하는 공통 메소드호출
	  try {
		    apprValidService.isWaitStateAtIntfatab("C274", vo.getReq_no());
	  } catch (KitechException ex) {
		    throw ex;
	  }
		
	  // 상조회대출신청 수정
	  cwlDAO.updateItem(vo);
		
	  //전자결재 반려,회수후 신청화면 [저장]버튼을 클릭하면 인터페이스 테이블에 재신청이 가능하게 "XAD005" 수정
	  if ("XAD015".equals(vo.getApr_state())) {
		  aprComService.modifyAprInterface(vo.getReq_no(), "XAD005", KitechContextUtil.getUserId());
	  }
		
	  if(vo.isApproval()){
		  // 결재정보
		  AprVo aprVo = new AprVo();
		  aprVo.setEndpoint(KitechContextUtil.getUserId());
		  aprVo.setReqNo(vo.getReq_no());
		  aprVo.setUiId("C274"); //서비스ID
		  aprVo.setLoginUserId(KitechContextUtil.getUserId());
		  aprVo.setReporterId(vo.getReq_syspayno());
				
		  apprFuncService.approvalScreen(aprVo, vo);
	  }
  }

  /**
   * 대출중도상환신청 승인 처리 
   * 
   * @author lsh
   * @param CwlFwLoanReqVo
   * @return void
   * @throws KitechException
   * @since 2023.08.30.   
   */
  @Override
  public void cwlLoanMidRepayAgree(CwlLoanMidRepayReqVo vo) throws KitechException {
 		AprVo aprVo = new AprVo();			
 		aprVo.setReqNo(vo.getReq_no());	//신청번호
 		aprVo.setLoginUserId(KitechContextUtil.getUserId());
 		aprVo.setReporterId(vo.getReq_syspayno());
 		aprVo.setUiId("C274");
 		aprVo.setOperCode("0");
 		aprVo.setBiz(true);
 		aprVo.setResult("");
 		aprVo.setEndpoint(KitechContextUtil.getUserId());	//아이디
 		
 		// 승인처리
 		apprFuncService.formAccept(aprVo);	
  }  
  
  /**
   * 대출중도상환신청 반려 처리 
   * 
   * @author lsh
   * @param CwlFwLoanReqVo
   * @return void
   * @throws KitechException
   * @since 2023.08.30.   
   */
  @Override
  public void cwlLoanMidRepayReject(CwlLoanMidRepayReqVo vo) throws KitechException {
	  AprScVo aprScVo = new AprScVo();		
	  aprScVo.setReqNo(vo.getReq_no());			//신청번호	
	  aprScVo.setComments(vo.getComments());	//반려사유
	  aprScVo.setEndpoint(KitechContextUtil.getUserId());
	  
	  if (AprState.isComplate(vo.getApr_state())) {
		  // 담당자 반려처리
		  apprFuncService.formAuthReject(aprScVo);
	  } else {
		  apprFuncService.formReject(aprScVo);
	  }
  }  
  
  /**
   * 대출중도상환신청 확정
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqListVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  @Override
  public void updateLoanMidRepayConfirm(CwlLoanMidRepayReqListVo vo) throws KitechException {
	  // 대출중도상환신청 수정 - 확정
	  cwlDAO.updateLoanMidRepayConfirmAndCancel(vo.getCwlLoanMidRepayReqVo());
	  
	  // 대출기본정보 수정
	  
	  // 1. 대출중도상환신청 이력 등록 
	  cwlDAO.insertCwlLoanMidWayRepay(vo.getCwlLoanMidRepayReqVo());
	  
	  // 2. 대출금마스터 정보 수정
	  CwlLoanMasterVo mstVo = vo.getCwlLoanMasterVo();
	  cwlDAO.updateCwlLoanMaster(mstVo);
  }
  
  /**
   * 대출중도상환신청 확정취소
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqListVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  @Override
  public void updateLoanMidRepayCancel(CwlLoanMidRepayReqListVo vo) throws KitechException {
	  // 대출중도상환신청 수정 - 확정취소
	  cwlDAO.updateLoanMidRepayConfirmAndCancel(vo.getCwlLoanMidRepayReqVo());
	 
	  // 중도상환 이력 테이블 삭제
	  cwlDAO.deleteCwlLoanMidWayRepay(vo.getCwlLoanMidRepayReqVo());
	  
	  // 마스터정보의 싱크를 맞추기 위한 중도상환 정보 조회
	  CwlLoanMasterVo pMstVo = vo.getCwlLoanMasterVo();
	  CwlLoanMasterVo mstUptVo = new CwlLoanMasterVo();

	  List<CwlLoanMasterVo> resultMstVo1 = cwlDAO.selectCwlLoanForSync(pMstVo);
	  if (resultMstVo1.size() > 0) {
		  for (CwlLoanMasterVo cwlLoanMasterVo : resultMstVo1) {
			  mstUptVo.setSyspayno(cwlLoanMasterVo.getSyspayno());
			  mstUptVo.setLoan_cd(cwlLoanMasterVo.getLoan_cd());
			  mstUptVo.setLoan_ymd(cwlLoanMasterVo.getLoan_ymd());
			  mstUptVo.setMidway_repay_times(cwlLoanMasterVo.getMidway_repay_times());
			  mstUptVo.setLoan_ramt(cwlLoanMasterVo.getLoan_ramt());
			  mstUptVo.setMidway_repay_ymd(cwlLoanMasterVo.getMax_midway_repay_ymd());
			  mstUptVo.setTot_midway_repay_amt(cwlLoanMasterVo.getSum_midway_repay_amt());
			  mstUptVo.setTot_midway_repay_intrst(cwlLoanMasterVo.getSum_midway_repay_intrst());
			  mstUptVo.setDedct_progrss_state("");
			  mstUptVo.setUpdt_syspayno("SYSTEM");
		  }
		  
		  List<CwlLoanMasterVo> resultMstVo2 = cwlDAO.selectCwlLoanMidWayRepay(pMstVo);
		  if (resultMstVo2.size() > 0) {
			  for (CwlLoanMasterVo cwlLoanMasterVo : resultMstVo2) {
				  mstUptVo.setThmon_midway_repay_intrst_amt(cwlLoanMasterVo.getMidway_repay_intrst());
			  }
		  }
	  }
	  
	  // 마스터 정보 수정
	  cwlDAO.updateCwlLoanMaster(mstUptVo);
  }
  
  /**
   * 대출중도상환신청 삭제
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return void
   * @throws KitechException
   * @since 2023.09.08.   
   */
  @Override
  public void deleteItem(CwlLoanMidRepayReqVo vo) throws KitechException {
	  cwlDAO.deleteItem(vo);
	  // 결재정보 삭제
	  apprFuncService.formRemove(vo.getReq_no());
  }
  

  /**
   * 중도상환 이자계산 처리
   * 
   * @author lsh
   * @param CwlLoanMidRepayReqVo
   * @return CwlLoanMidRepayReqVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  @Override
  public CwlLoanMidRepayReqVo processInterestCalculation(CwlLoanMidRepayReqVo vo) throws KitechException {
	  CwlLoanMidRepayReqVo resultVO = new CwlLoanMidRepayReqVo();
	  CwlLoanMasterVo paramVo = new CwlLoanMasterVo();
	  paramVo.setSyspayno(vo.getLoan_syspayno());
	  paramVo.setLoan_ymd(vo.getLoan_ymd());
	  CwlLoanMasterVo mstVo = cwlDAO.selectCwlLoanForCalculate(paramVo);
	  
	  double nLoanRts = 0;
	  int nLoanRamt = 0;
	  int nMRepayAmt = 0;
	  int dDayCnt = 0;
	  int sDayCnt = 0;
	  int nRepayLoanAmt = 0;
	  double nRepayIntrst = 0;
	  double nMRepayIntrst = 0;
	  String sLoanCd = "";

	  if (null != mstVo && !"".equals(mstVo.getSyspayno())) {
		  nLoanRts = Double.valueOf(mstVo.getLoan_rts()); 		// 대출이율
		  nLoanRamt = Integer.valueOf(mstVo.getLoan_ramt()); 	// 총중도상환금액
	  }
	  
	  sLoanCd = vo.getLoan_cd(); 								// 대출코드 (ex: 507=상조회대출금 525=대학융자금상환원금)
	  
	  // 총상환 이자
	  nMRepayAmt = Integer.valueOf(vo.getMidway_repay_amt()); // 중도상환 할 금액

	  dDayCnt = vo.getDDay_cnt();
	  sDayCnt = vo.getSDay_cnt();

	  nRepayLoanAmt = nLoanRamt - nMRepayAmt;
	  
	  // 대학융자금이 아니면..융자금은 무이자
	  if (!"525".equals(sLoanCd)) { // 대학융자금일시
		  // 중도상환 이전까지의 이자계산
		  nRepayIntrst = (nLoanRts / 36500) * nLoanRamt * dDayCnt;
		  nRepayIntrst = Math.round(nRepayIntrst);
		  // 중도상환 후 월 예상 이자
		  nMRepayIntrst = (nLoanRts / 36500) * nRepayLoanAmt * sDayCnt;
		  nMRepayIntrst = Math.round(nMRepayIntrst);
	  } else {
		nRepayIntrst = 0;
		nMRepayIntrst = 0;
	  }
	  // 상환 후 잔액
	  resultVO.setAfRepayLoanAmt(Integer.toString(nRepayLoanAmt));
	  // 상환일 이전의 이자
	  resultVO.setBfRepayIntrst(Double.toString(nRepayIntrst));
	  // 상환일 이후의 월 예상이자
	  resultVO.setAfRepayIntrst(Double.toString(nMRepayIntrst));
	    		
      return resultVO;
  }  

}
