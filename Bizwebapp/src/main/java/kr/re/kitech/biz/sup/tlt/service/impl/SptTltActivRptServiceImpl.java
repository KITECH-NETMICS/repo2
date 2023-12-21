package kr.re.kitech.biz.sup.tlt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.sup.tlt.dao.SptDisPatchPrcondDAO;
import kr.re.kitech.biz.sup.tlt.dao.SptTltActivMonthPlntDAO;
import kr.re.kitech.biz.sup.tlt.dao.SptTltActivMonthRptDAO;
import kr.re.kitech.biz.sup.tlt.dao.SptTltActivRptDAO;
import kr.re.kitech.biz.sup.tlt.dao.SptTltXodhDeptInfoDAO;
import kr.re.kitech.biz.sup.tlt.service.SptTltActivRptService;
import kr.re.kitech.biz.sup.tlt.vo.SptDisPatchPrcondVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthPlnVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthRptVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltActivRptDetailVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltActivRptVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltXodhDeptInfoVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @ClassSubJect 활동보고서 ServiceImpl
 * @Class Name SptTltActivRptServiceImpl.java
 * @Description 활동보고서 관련 처리를 담당하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/14   손태화             최초생성
 * @ 2023/10/04   송선화             수정
 * @author 손태화
 * @since 2023/08/14
 * @version 1
 * @see
 * 
 */
@Service("sptTltActivRptServiceImpl")
public class SptTltActivRptServiceImpl  extends EgovAbstractServiceImpl implements SptTltActivRptService {
    
    @Resource(name="attachDAO")
    private AttachDAO attachDao;
	
    @Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;
    
    @Resource(name="apprValidServiceImpl")
    private ApprValidService apprValidService;
    
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="sptTltActivRptDAO")
	private SptTltActivRptDAO tltDAO;
	
	@Resource(name="sptDisPatchPrcondDAO")
	private SptDisPatchPrcondDAO disPatchPrcondDAO;
	
	@Resource(name="sptTltActivMonthRptDAO")
	private SptTltActivMonthRptDAO rptDAO;
	
	@Resource(name="sptTltActivMonthPlnDAO")
	private SptTltActivMonthPlntDAO plnDAO;
	
	@Resource(name="sptTltXodhDeptInfoDAO")
	private SptTltXodhDeptInfoDAO deptDAO;
	
  /**
   * 활동보고서 목록
   * @author 손태화
   * @param SptTltActivRptVo 검색 : 사용자 , 검색년월 , 작성여부
   * @return List<SptTltActivRptVo> 활동보고서 목록
   * @throws KitechException 공통예외
   */
  @Override
  public List<SptTltActivRptVo> selectSptTltActivRptList(SptTltActivRptVo vo) throws KitechException {
	  System.out.println("-- into selectSptTltActivRptList --"); 
	  //return null;	
	  return tltDAO.selectSptTltActivRptList(vo);	
  }

  /**
   * 기업 목록
   * @author 손태화
   * @param SptTltActivRptVo 검색 : 사용자(작성자)
   * @return SptTltActivRptDetailVo 기업 목록
   * @throws KitechException 공통예외
   */
  @Override
  public SptTltActivRptDetailVo selectSptDisPatchPrcondList(SptTltActivRptVo vo) throws KitechException { 
	  SptTltActivRptDetailVo rstVo = new SptTltActivRptDetailVo();
    
	  SptDisPatchPrcondVo vo1 = new SptDisPatchPrcondVo();
	  vo1.setSyspayno(vo.getSyspayno());
	  List<SptDisPatchPrcondVo> custVo = disPatchPrcondDAO.selectSptDisPatchPrcondList(vo1);
	  rstVo.setSptDisPatchPrcondVoList(custVo);
    
	  return rstVo;
  }
  
  /**
   * 기술지원직정보 목록
   * @author 손태화
   * @param SptTltActivRptVo 검색 : 참여기업
   * @return SptTltActivRptVo 기술지원직정보 목록
   * @throws KitechException 공통예외
   */
  public SptTltActivRptVo selectSkilHumBasIcInfo(SptTltActivRptVo vo) throws KitechException {
	  return tltDAO.selectSkilHumBasIcInfo(vo);
  }
  
  /**
   * 활동보고서 상세 조회
   * @author 손태화
   * @param SptTltActivRptVo 상세조회 : 보고서번호
   * @return SptTltActivRptDetailVo 활동보고서정보 , 당월실적 , 익월목표
   * @throws KitechException 공통예외
   */
  public SptTltActivRptDetailVo selectSptTltActivRptDetail(SptTltActivRptVo vo) throws KitechException {
	  System.out.println("-- into selectDetail --"); 
	  System.out.println("-- vo => "+vo); 
	  SptTltActivRptDetailVo rstVo = new SptTltActivRptDetailVo();
	  
	  // req_no
	  // 활동보고서정보
	  SptTltActivRptVo infoVo = tltDAO.selectSptTltActivRptDetail(vo);
	  rstVo.setSptTltActivRptVo(infoVo);
	  // 기업목록
	  SptDisPatchPrcondVo vo3 = new SptDisPatchPrcondVo();
	  vo3.setSyspayno(infoVo.getSyspayno());
	  List<SptDisPatchPrcondVo> custVo = disPatchPrcondDAO.selectSptDisPatchPrcondList(vo3);
	  rstVo.setSptDisPatchPrcondVoList(custVo);
	  // 당월실적
	  SptTltActivMonthRptVo rptInVo = new SptTltActivMonthRptVo();
	  rptInVo.setReq_no(vo.getReq_no());
	  List<SptTltActivMonthRptVo> rptVo = rptDAO.selectList(rptInVo);
	  rstVo.setSptTltActivMonthRptVoList(rptVo);
	  // 익월목표
	  SptTltActivMonthPlnVo plnInVo = new SptTltActivMonthPlnVo();
	  plnInVo.setReq_no(vo.getReq_no());
	  List<SptTltActivMonthPlnVo> plntVo = plnDAO.selectList(plnInVo);
	  rstVo.setSptTltActivMonthPlnVoList(plntVo);
	  
      return rstVo;
  }

  /**
   * 활동보고서 등록(수정)
   * @author 손태화
   * @param SptTltActivRptDetailVo 활동보고서정보 , 당월실적 , 익월목표
   * @return SptTltActivRptVo 신청번호
   * @throws Exception 예외
   */
  public SptTltActivRptVo mergeSptTltActivRpt(SptTltActivRptDetailVo vo) throws Exception {
	  System.out.println("-- into saveDetail --"); 
	  
	  SptTltActivRptVo infoVo = vo.getSptTltActivRptVo();	// 활동보고서정보
	  List<SptTltActivMonthRptVo> rptVoList = vo.getSptTltActivMonthRptVoList();	// 당월실적
	  List<SptTltActivMonthPlnVo> plnVoList = vo.getSptTltActivMonthPlnVoList();	// 익월목표
	  
	  try {
		  // 중복건수 확인
		  int ActivRptCnt  = tltDAO.selectSptTltActivRptCnt(infoVo); // 중복건수 가 있을때 ( syspayno , rpt_yrmon )
		  // 동일보고서 수정
		  int BasicRegCnt = tltDAO.selectSptTltBasicRegCnt(infoVo); // 동일보고서 수정 일때 (req_no)
		  if(ActivRptCnt < 1 || BasicRegCnt == 1){
			 // throw new KitechException(Exceptions.ERROR, Business.SUP, "message.alert.sup.tlt.err.msg", new String[]{});
		  
			  // 활동보고서정보
			   AppLog.debug("------ getName ===>"+Numberings.DOCUMENT.getName());
			  if("".equals(infoVo.getReq_no())){ // 등록
				  // 1. 신청번호 를 조회한다.
				  infoVo.setReq_no( genService.getGenNumber(Numberings.DOCUMENT.getName(), infoVo.getDocu_clsf()) ); // infoVo.getDocu_clsf() : S12 
			  }else{
				  apprValidService.isWaitStateAtIntfatab("S672", infoVo.getReq_no());
			  }
			   AppLog.debug("------ Req_no ==>"+infoVo.getReq_no());
			  
			  // 목록 전체 삭제 후 재등록
			  // 당월실적
			  SptTltActivMonthRptVo rptDelVo = new SptTltActivMonthRptVo();
			  rptDelVo.setReq_no(infoVo.getReq_no());
			  rptDAO.deletePartDetail(rptDelVo);
			  // 익월목표
			  SptTltActivMonthPlnVo plnDelVo = new SptTltActivMonthPlnVo();
			  plnDelVo.setReq_no(infoVo.getReq_no());
			  plnDAO.deletePartDetail(plnDelVo);
			  
			  // 활동보고서상세
			  tltDAO.mergeSptTltActivRpt(infoVo);
			  // 당월실적
			  for(int i=0;i<rptVoList.size();i++){
				  SptTltActivMonthRptVo rptVo = rptVoList.get(i);
				  rptVo.setReq_no(infoVo.getReq_no());
				  rptVo.setSeq((i+1)+"");
				  rptDAO.mergeDetail(rptVo);
			  }
			  // 익월목표
			  for(int i=0;i<plnVoList.size();i++){
				  SptTltActivMonthPlnVo plnVo = plnVoList.get(i);
				  plnVo.setReq_no(infoVo.getReq_no());
				  plnVo.setSeq((i+1)+"");
				  plnDAO.mergeDetail(plnVo);
			  }
			  
			  if("C".equals(infoVo.getCud_type())){
					// 인터페이스 테이블 저장
					apprFuncService.formInit(infoVo.getReq_no(), "S672", KitechContextUtil.getUserId());  
			  }
			  
			  if(infoVo.isApproval()){
				  this.approvalInfo(vo);
			  }
			  
			  // 승인시
			  if("XAD100".equals(infoVo.getReq_state())){
				  AprVo aprVo = new AprVo();
				  
				  aprVo.setReqNo(infoVo.getReq_no());
				  aprVo.setEndpoint(KitechContextUtil.getUserId()); // 중요!!
				  //aprVo.setdocuclsf // "S12"
				  aprVo.setOperCode("0"); // approvalClsf 0 : 승인 , 2 : 반려
				  //aprVo.setcudtype // "S"
				  aprVo.setUiId("S681");
				  aprVo.setAprState("XAD100");
				  //aprVo.setstateinformflag // "1" 
				  aprVo.setResult("type2");
				  aprVo.setManagerId(KitechContextUtil.getSyspayno());
				  aprVo.setExt1Cd("");
				  aprVo.setInfoCd("");
				  aprVo.setExt2Cd("");
				  aprVo.setExt3Cd("");
				  aprVo.setLoginUserId(KitechContextUtil.getUserId());
				  aprVo.setReporterId(KitechContextUtil.getSyspayno());
				  //aprScVo.setrejectcomment ㄱ
				  aprVo.setComments(infoVo.getRmk());
				  
				  apprFuncService.formAccept(aprVo);
			  }
			  // 반려시
			  if("XAD015".equals(infoVo.getReq_state())){
				  AprScVo aprScVo = new AprScVo();
				  aprScVo.setReqNo(infoVo.getReq_no());
				  aprScVo.setEndpoint(KitechContextUtil.getUserId()); // 중요!!
				  //aprScVo.setdocuclsf // "S12"
				  //aprScVo.setopercode // approvalClsf 0 : 승인 , 2 : 반려
				  //aprScVo.setcudtype // "S"
				  //aprScVo.setuiid // "S681" ??
				  aprScVo.setAprState("XAD015");
				  //aprScVo.setstateinformflag ㄱ // "1" 
				  // aprScVo.setStatus(status);???
				  //aprScVo.setresult // "type2"
				  //aprScVo.setmanagerid // sn : KitechContextUtil.getSyspayno()
				  aprScVo.setExt1Cd("");
				  aprScVo.setInfoCd("");
				  //aprScVo.setext2cd // ""
				  //aprScVo.setext3cd // ""
				  //aprScVo.setloginuserid // KitechContextUtil.getUserId()
				  //aprScVo.setreporterid // KitechContextUtil.getSyspayno()
				  //aprScVo.setrejectcomment ㄱ
				  aprScVo.setComments(infoVo.getRmk());
				  
				  apprFuncService.formReject(aprScVo);
			  }
			  
			  infoVo.setSucc_cnt("0");
			  infoVo.setResult_code("00");
			  
		  } else {
			  if(BasicRegCnt == 1){
				  infoVo.setSucc_cnt("-1");
				  infoVo.setResult_code("98");
			  } else {
				  infoVo.setReq_no("");
				  infoVo.setSucc_cnt("-1");
				  infoVo.setResult_code("98");
			  }
		  }
	 } catch (KitechException ex) {
			throw ex;
	 }	
	  SptTltActivRptVo rtVo = infoVo;
	  return rtVo;
  }

  /**
   * 활동보고서 삭제
   * @author 손태화
   * @param SptTltActivRptVo 관리번호
   * @return  
   * @throws KitechException 공통예외
   */
  public void deleteSptTltActivRpt(SptTltActivRptVo vo) throws KitechException {
	  System.out.println("-- into deleteDetail --"); 
	  
	  // 활동보고서상세
	  tltDAO.deleteSptTltActivRpt(vo);
	  // 당월실적
	  SptTltActivMonthRptVo rptVo = new SptTltActivMonthRptVo();
	  rptVo.setReq_no(vo.getReq_no());
	  rptDAO.deletePartDetail(rptVo);
	  // 익월목표
	  SptTltActivMonthPlnVo plnVo = new SptTltActivMonthPlnVo();
	  plnVo.setReq_no(vo.getReq_no());
	  plnDAO.deletePartDetail(plnVo);
	  
	  // 결재정보 삭제
	  apprFuncService.formRemove(vo.getReq_no());
	}
	
	/**
	 * 활동보고서 상세 결재신청
	 * @author 손태화
	 * @param SptTltActivRptDetailVo 활동보고서정보
	 * @return 
	 * @throws Exception 예외
	 */
	private void approvalInfo(SptTltActivRptDetailVo vo) throws Exception {
		System.out.println("-- into approvalInfo --");
		
		SptTltActivRptVo infoVo = vo.getSptTltActivRptVo();	// 활동보고서정보
		
		AprVo aprVo = new AprVo();
		//aprVo.setdocuclsf // S12
		///aprVo.setcudtype // S
		aprVo.setReqNo(infoVo.getReq_no());
		aprVo.setUiId("S681");
		aprVo.setAprState("XAD010");
		//aprVo.setstateinformflag // 1
		aprVo.setEndpoint(KitechContextUtil.getUserId()); // 중요!!
		aprVo.setResult("type2");
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setInfoCd(infoVo.getCmpy_nm_krchar());
		aprVo.setExt1Cd("");
		aprVo.setExt2Cd(infoVo.getNm());
		aprVo.setExt3Cd("");
		 
		apprFuncService.approvalScreen(aprVo);
    }

	/**
	 * 부서 목록
	 * @author 손태화
	 * @param 
	 * @return SptTltActivRptDetailVo 부서 목록
	 * @throws KitechException 공통예외
	 */
	@Override
	public SptTltActivRptDetailVo selectSptTltXodhDeptList(SptTltActivRptVo vo) throws KitechException { 
	  	SptTltActivRptDetailVo rstVo = new SptTltActivRptDetailVo();
    
	  	SptTltXodhDeptInfoVo vo1 = new SptTltXodhDeptInfoVo();
	  	List<SptTltXodhDeptInfoVo> deptVo = deptDAO.selectSptTltXodhDeptList(vo1);
	  	rstVo.setSptTltXodhDeptInfoVoList(deptVo);
    
	  	return rstVo;
	}
	
	/**
	 * 대상인원
	 * @author 손태화
	 * @param SptTltActivRptDetailVo 기업 목록
	 * @return SptTltActivRptDetailVo 기업 대상인원 목록
	 * @throws KitechException 공통예외
	 */
	@Override
	public SptTltActivRptDetailVo selectSptTltSendList(SptTltActivRptDetailVo vo) throws KitechException { 
		List<SptDisPatchPrcondVo> tgtLstVo = vo.getSptDisPatchPrcondVoList();
		
		SptTltActivRptDetailVo rstVo = new SptTltActivRptDetailVo();
		List<SptDisPatchPrcondVo> outLstVo = new ArrayList<>();
		for(int i=0;i<tgtLstVo.size();i++){
			SptDisPatchPrcondVo tgtVo = tgtLstVo.get(i);
			if(tgtVo.getSend_type_01()){ // 파견기업 업무 담당자
				// 관련 업무 담당자 개발 필요
				throw new KitechException(Exceptions.ERROR, Business.SUP, "message.alert.sup.tlt.err.noing", new String[]{});
			}
			if(tgtVo.getSend_type_02()){ // 멘토
				// 관련 업무 담당자 개발 필요
				throw new KitechException(Exceptions.ERROR, Business.SUP, "message.alert.sup.tlt.err.noing", new String[]{});
				
			}
			if(tgtVo.getSend_type_03()){ // 기업 연구직
				SptDisPatchPrcondVo inVo = new SptDisPatchPrcondVo();
				inVo.setCust_no(tgtVo.getCust_no());
				outLstVo.add(disPatchPrcondDAO.selectSptDisPatchPrcond(inVo));
			}
		}
		rstVo.setSptDisPatchPrcondVoList(outLstVo);
		
		return rstVo;
	}

}
