package kr.re.kitech.biz.sup.par.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.sup.par.dao.SptParBaseDAO;
import kr.re.kitech.biz.sup.par.dao.SptParCustChargDAO;
import kr.re.kitech.biz.sup.par.dao.SptParCustProDAO;
import kr.re.kitech.biz.sup.par.dao.SptParInfoEvalDAO;
import kr.re.kitech.biz.sup.par.service.SptParInfoEvalService;
import kr.re.kitech.biz.sup.par.vo.SptParBaseVo;
import kr.re.kitech.biz.sup.par.vo.SptParCustChargVo;
import kr.re.kitech.biz.sup.par.vo.SptParCustProVo;
import kr.re.kitech.biz.sup.par.vo.SptParInfoEvalDetailVo;
import kr.re.kitech.biz.sup.par.vo.SptParInfoEvalVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @ClassSubJect 파트너기업유지심사서 ServiceImpl
 * @Class Name sptParInfoEvalServiceImpl.java
 * @Description 파트너기업유지심사서 관련 처리를 담당하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/28   손태화             최초생성
 * 
 * @author 손태화
 * @since 2023/08/28
 * @version 1
 * @see
 * 
 */
@Service("sptParInfoEvalServiceImpl")
public class SptParInfoEvalServiceImpl  extends EgovAbstractServiceImpl implements SptParInfoEvalService {
    
    @Resource(name="attachDAO")
    private AttachDAO attachDao;
	
    @Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;
    
    @Resource(name="apprValidServiceImpl")
    private ApprValidService apprValidService;
    
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="sptParInfoEvalDAO")
	private SptParInfoEvalDAO evalDAO;
	
	@Resource(name="sptParBaseDAO")
	private SptParBaseDAO baseDAO;
	
	@Resource(name="sptParCustChargDAO")
	private SptParCustChargDAO custChargDAO;
	
	@Resource(name="sptParCustProDAO")
	private SptParCustProDAO custProDAO;
	
  /**
   * 파트너기업유지심사서 목록
   * @author 손태화
   * @param SptParInfoEvalVo 검색 : 유지심사번호 , 파트너기업지정번호 , 회사명 , 사업자등록번호 , 유지심사시작일 , 유지심사종료일 , 파트너기업지정시작일 , 파트너기업지정정료일 , 작성자 
   * @return List<SptParInfoEvalVo> 파트너기업유지심사서 목록
   * @throws KitechException 공통예외
   */
  @Override
  public List<SptParInfoEvalVo> selectSptParInfoEvalList(SptParInfoEvalVo vo) throws ElException {
	  System.out.println("-- into selectSptParInfoEvalList --"); 
	  return evalDAO.selectSptParInfoEvalList(vo);	
  }
  
  /**
   * 파트너기업유지심사서 상세 조회
   * @author 손태화
   * @param SptParInfoEvalVo 상세조회 : 유지심사서번호
   * @return SptParInfoEvalVo 파트너기업유지심사서 상세
   * @throws KitechException 공통예외
   */
  @Override
  public SptParInfoEvalVo selectSptParInfoEvalDetail(SptParInfoEvalVo vo) throws ElException {
	  System.out.println("-- into selectSptParInfoEvalDetail --");
	  // 파트너기업유지심사서 상세 조회
	  /*
	  SptParInfoEvalDetailVo rstVo = new SptParInfoEvalDetailVo();
	  SptParInfoEvalVo evalVo = evalDAO.selectSptParInfoEvalDetail(vo);
	  rstVo.setSptParInfoEvalVo(evalVo);
	  return rstVo;	
	   */
	  return evalDAO.selectSptParInfoEvalDetail(vo);	
  }
  
  /**
   * 파트너기업유지심사서 상세 조회2
   * @author 손태화
   * @param SptParInfoEvalVo 상세조회 : 파트너기업지정번호
   * @return SptParInfoEvalDetailVo 파트너기업 정보 , 담당자 목록 , 기업지원프로그램 목록
   * @throws KitechException 공통예외
   */
  @Override
  public SptParInfoEvalDetailVo selectSptParCustProList(SptParInfoEvalVo vo) throws ElException {
	  System.out.println("-- into selectSptParCustProList --");
	  SptParInfoEvalDetailVo rstVo = new SptParInfoEvalDetailVo();
	  // 파트너기업 정보
	  SptParBaseVo baseInNo = new SptParBaseVo();
	  baseInNo.setAppont_no(vo.getAppont_no());
	  SptParBaseVo baseOutNo = baseDAO.selectSptBaseDetail(baseInNo);
	  rstVo.setSptParBaseVo(baseOutNo);
	  // 담당자 목록
	  SptParCustChargVo custChargInVo = new SptParCustChargVo();
	  custChargInVo.setAppont_no(vo.getAppont_no());
	  List<SptParCustChargVo> custChargOutVo = custChargDAO.selectSptParCustChargList(custChargInVo);
	  rstVo.setSptParCustChargVoList(custChargOutVo);
	  // 기업지원프로그램 목록 조회
	  SptParCustProVo custProInVo = new SptParCustProVo();
	  custProInVo.setCust_no(vo.getCust_no());
	  List<SptParCustProVo> custProOutVo = custProDAO.selectSptParCustProList(custProInVo);
	  rstVo.setSptParCustProVoList(custProOutVo);
	  
	  return rstVo;	
  }
  
  /**
   * 파트너기업유지심사서 등록(수정)
   * @author 손태화
   * @param SptParInfoEvalDetailVo 파트너기업유지심사서 상세 , 담당자 목록
   * @return SptParInfoEvalVo 유지심사서번호
   * @throws Exception 예외
   */
  @Override
  public SptParInfoEvalVo saveSptParInfoEvalDetail(SptParInfoEvalDetailVo vo) throws Exception {
	  System.out.println("-- into saveSptParInfoEvalDetail --");
	  //[{"id":"dma_eval","key":"SptParInfoEvalVo"},{"id":"dlt_cust_charg","key":"SptParCustChargVoList"},{"id":"dlt_cust_pro","key":"SptParCustProVoList"}]
	  SptParInfoEvalVo evalVo = vo.getSptParInfoEvalVo();
	  List<SptParCustChargVo> custChargVoList = vo.getSptParCustChargVoList();
	  if("".equals(evalVo.getPar_eval_req_no())){ // 등록
		  evalVo.setPar_eval_req_no( genService.getGenNumber(Numberings.DOCUMENT.getName(), "S24") );
	  }else{
		  //결재상태 유효성
			try {
				apprValidService.isWaitStateAtIntfatab("S421", evalVo.getPar_eval_req_no());
			}catch (KitechException ex){
				throw ex;
			}
		 
	  }
	  
	  // 담당자 목록 전체 삭제 후 재등록
	  SptParCustChargVo custChargDelVo = new SptParCustChargVo();
	  custChargDelVo.setAppont_no(evalVo.getAppont_no());
	  custChargDAO.deletePartSptParCustCharg(custChargDelVo);
	  
	  // 유지심사서
	  evalDAO.mergeSptParInfoEval(evalVo);	
	  // 담당자
	  if(custChargVoList.size() > 0){
		  for(int i=0;i<custChargVoList.size();i++){
			  SptParCustChargVo custChargVo = custChargVoList.get(i);
			  custChargVo.setCust_no(evalVo.getCust_no());
			  custChargVo.setAppont_no(evalVo.getAppont_no());
			  custChargVo.setSeq(String.valueOf(i+1)); 
			  custChargDAO.mergeSptParCustCharg(custChargVo);	
		  }
	  }
	  if("C".equals(evalVo.getCud_type())){
			// 인터페이스 테이블 저장
			apprFuncService.formInit(evalVo.getPar_eval_req_no(), "S421", KitechContextUtil.getUserId());  
	  }
	  if(evalVo.isApproval()){
		  this.approvalInfo(vo);
	  }
	  
	  SptParInfoEvalVo rtVo = evalVo;
	  
	  return rtVo;
  }
  
  	/**
  	 * 파트너기업유지심사서 삭제
  	 * @author 손태화
  	 * @param SptParInfoEvalVo 유지심사서번호
  	 * @return  
  	 * @throws KitechException 공통예외
  	 */
  	public void deleteSptParInfoEvalDetail(SptParInfoEvalVo vo){
  		evalDAO.deleteSptParInfoEval(vo);
	  
  		// 결재정보 삭제
  		apprFuncService.formRemove(vo.getPar_eval_req_no());
	}
	
	/**
	 * 결재신청
  	 * @author 손태화
  	 * @param SptParInfoEvalDetailVo XXXXXXXXX
  	 * @return  
  	 * @throws Exception 예외
  	 */
	private void approvalInfo(SptParInfoEvalDetailVo vo) throws Exception {
		// 결재정보
    	AprVo aprVo = new AprVo();
    	aprVo.setReqNo(vo.getSptParInfoEvalVo().getPar_eval_req_no());
    	aprVo.setUiId("S421"); //서비스ID
    	aprVo.setEndpoint(KitechContextUtil.getUserId());
    	aprVo.setAprState(vo.getSptParInfoEvalVo().getApr_state());
    	
    	aprVo.setLoginUserId(KitechContextUtil.getUserId());
    	aprVo.setMainKey(vo.getSptParInfoEvalVo().getPar_eval_req_no());
    	aprVo.setReporterId(vo.getSptParInfoEvalVo().getRegst_syspayno());
    	aprVo.setInfoCd(vo.getSptParInfoEvalVo().getPar_eval_req_no());
    	aprVo.setManager("20150648");
		//aprVo.setManagerId("20150648"); // gsaty3398 유선희 사무원
			
		apprFuncService.approvalRequest(aprVo, vo);		
	}

}
