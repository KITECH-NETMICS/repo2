package kr.re.kitech.biz.sup.edu.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.sup.edu.dao.SptTechEducAttnceDAO;
import kr.re.kitech.biz.sup.edu.dao.SptTechEducContributeDAO;
import kr.re.kitech.biz.sup.edu.dao.SptTechEducInfoDAO;
import kr.re.kitech.biz.sup.edu.dao.SptTechEducReqdBugtDAO;
import kr.re.kitech.biz.sup.edu.dao.SptTechEducSchedDAO;
import kr.re.kitech.biz.sup.edu.service.SptTechEducInfoService;
import kr.re.kitech.biz.sup.edu.vo.SptTechEducAttnceVo;
import kr.re.kitech.biz.sup.edu.vo.SptTechEducContributeVo;
import kr.re.kitech.biz.sup.edu.vo.SptTechEducInfoDetailVo;
import kr.re.kitech.biz.sup.edu.vo.SptTechEducInfoVo;
import kr.re.kitech.biz.sup.edu.vo.SptTechEducReqdBugtVo;
import kr.re.kitech.biz.sup.edu.vo.SptTechEducSchedVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @ClassSubJect 기술세미나실적등록/교육실적등록 ServiceImpl
 * @Class Name SptTechEducInfoServiceImpl.java
 * @Description 기술세미나실적등록/교육실적등록 관련 처리를 담당하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/04   손태화             최초생성
 * 
 * @author 손태화
 * @since 2023/08/04
 * @version 1
 * @see
 * 
 */
@Service("sptTechEducInfoServiceImpl")
public class SptTechEducInfoServiceImpl  extends EgovAbstractServiceImpl implements SptTechEducInfoService {
    
    @Resource(name="attachDAO")
    private AttachDAO attachDao;
	
    @Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;
    
    @Resource(name="apprValidServiceImpl")
    private ApprValidService apprValidService;
    
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="sptTechEducInfoDAO")
	private SptTechEducInfoDAO eduDAO;
	
	@Resource(name="sptTechEducAttnceDAO")
	private SptTechEducAttnceDAO attnceDAO;
	
	@Resource(name="sptTechEducSchedDAO")
	private SptTechEducSchedDAO schedDAO;
	
	@Resource(name="sptTechEducReqdBugtDAO")
	private SptTechEducReqdBugtDAO reqdBugtDAO;
	
	@Resource(name="sptTechEducContributeDAO")
	private SptTechEducContributeDAO contributeDAO;
	
	@Resource(name="accntServiceImpl")
	private AccntService accntService;

  /**
   * 기술세미나실적 목록
   * @author 손태화
   * @param SptTechEducInfoVo 검색 : 지역본부 , 책임자 , 개최시작일자 , 개최종료일자 , 실적부서 , 세미나명 , 등록자 , 참여기업 , 신청상태 , 교육/세미나 구분 , find_clsf 
   * @return List<SptTechEducInfoVo> 기술세미나실적 목록
   * @throws KitechException 공통예외
   */
  public List<SptTechEducInfoVo> selectSmnrList(SptTechEducInfoVo vo) throws KitechException {
	  System.out.println("-- into selectList --"); 
    return eduDAO.selectSmnrList(vo);	
  }

  /**
   * 기술세미나실적/교육실적 상세 조회
   * @author 손태화
   * @param SptTechEducInfoVo 상세조회 : 신청번호 , 관리번호 , 교육/세미나 구분
   * @return SptTechEducInfoDetailVo 세미나/교육 상세 , 참여자 목록 , 주요프로그램 목록 , 소요예산 목록 , 기여자 목록
   * @throws KitechException 공통예외
   */ 
  public SptTechEducInfoDetailVo selectDetail(SptTechEducInfoVo vo) throws KitechException {
	  System.out.println("-- into selectDetail --"); 
	  System.out.println("-- vo => "+vo); 
	  SptTechEducInfoDetailVo rstVo = new SptTechEducInfoDetailVo();
	  // 1.세미나 정보
	  SptTechEducInfoVo infoVo = eduDAO.selectDetail(vo);
	  AppLog.debug( "메인데이터", infoVo);
	  rstVo.setSptTechEducInfoVo(infoVo);
	  // 2.교육참여자 목록
	  SptTechEducAttnceVo vo2 = new SptTechEducAttnceVo();
	  vo2.setBiz_clsf(infoVo.getBiz_clsf()); 
	  vo2.setMngmt_no(infoVo.getMngmt_no());
	  List<SptTechEducAttnceVo> attnceVo = new ArrayList<>();
	  if("SEA010".equals(infoVo.getBiz_clsf())){ // 교육
		  attnceVo = attnceDAO.selectEducList(vo2);
	  }else{ // 세미나
		  attnceVo = attnceDAO.selectSmnrList(vo2);
	  }
	  rstVo.setSptTechEducAttnceVoList(attnceVo);
	  // 3.주요프로그램 목록
	  SptTechEducSchedVo vo3 = new SptTechEducSchedVo();
	  vo3.setBiz_clsf(infoVo.getBiz_clsf()); 
	  vo3.setMngmt_no(infoVo.getMngmt_no());
	  List<SptTechEducSchedVo> schedVo = schedDAO.selectList(vo3);
	  rstVo.setSptTechEducSchedVoList(schedVo);
	  // 4.소요예산 목록
	  SptTechEducReqdBugtVo vo4 = new SptTechEducReqdBugtVo();
	  vo4.setBiz_clsf(infoVo.getBiz_clsf()); 
	  vo4.setMngmt_no(infoVo.getMngmt_no());
	  List<SptTechEducReqdBugtVo> reqdBugtVo = reqdBugtDAO.selectList(vo4);
	  rstVo.setSptTechEducReqdBugtVoList(reqdBugtVo);
	  // 5.기여자 목록
	  SptTechEducContributeVo vo5 = new SptTechEducContributeVo();
	  vo5.setBiz_clsf(infoVo.getBiz_clsf()); 
	  vo5.setMngmt_no(infoVo.getMngmt_no());
	  List<SptTechEducContributeVo> contributeVo = contributeDAO.selectList(vo5);
	  rstVo.setSptTechEducContributeVoList(contributeVo);
	  
      return rstVo;
  }

  /**
   * 기술세미나실적/교육실적 등록(수정)
   * @author 손태화
   * @param SptTechEducInfoDetailVo 세미나/교육 상세 , 참여자 목록 , 주요프로그램 목록 , 소요예산 목록 , 기여자 목록
   * @return SptTechEducInfoVo 신청번호 , 관리번호
   * @throws Exception 예외
   */
  public SptTechEducInfoVo saveDetail(SptTechEducInfoDetailVo vo) throws Exception {
	  System.out.println("-- into saveDetail --"); 
	  
	  SptTechEducInfoVo infoVo = vo.getSptTechEducInfoVo();									// 세미나 정보
	  List<SptTechEducAttnceVo> attnceVoList = vo.getSptTechEducAttnceVoList();				// 교육참여자 목록
	  List<SptTechEducSchedVo> schedVoList = vo.getSptTechEducSchedVoList();				// 주요프로그램 목록
	  List<SptTechEducReqdBugtVo> reqdBugtVoList = vo.getSptTechEducReqdBugtVoList();		// 소요예산 목록
	  List<SptTechEducContributeVo> contributeVoist = vo.getSptTechEducContributeVoList();	// 기여자 목록
	  
	  // 등록 일 경우 신청번호 req_no , 관리번호 mngmt_no 를 구한다.
	  if("".equals(infoVo.getMngmt_no())){ // 등록
		  // 1. 신청번호 를 조회한다.
		  if("SEA010".equals(infoVo.getBiz_clsf())){ // 교육
			  infoVo.setReq_no( genService.getGenNumber(Numberings.DOCUMENT.getName(), "S21") );
		  }else{ //세미나실적등록
			  infoVo.setReq_no( genService.getGenNumber(Numberings.DOCUMENT.getName(), "S22") );
		  }
		  // 2. 관리번호 를 조회한다. 
		  SptTechEducInfoVo tmpVo = eduDAO.selectMngmtNo(infoVo);
		  infoVo.setMngmt_no(tmpVo.getMngmt_no());
	  }else{
		   if("SEA010".equals(infoVo.getBiz_clsf())){ // 교육실적등록 등록
			   apprValidService.isWaitStateAtIntfatab("S151", infoVo.getReq_no());
		   } else {			//세미나실적등록
			   apprValidService.isWaitStateAtIntfatab("S155", infoVo.getReq_no());
		   }
	  }
	  // 목록 전체 삭제 후 재등록
	  // 교육참여자
	  SptTechEducAttnceVo attnceDelVo = new SptTechEducAttnceVo();
	  attnceDelVo.setBiz_clsf(infoVo.getBiz_clsf());
	  attnceDelVo.setMngmt_no(infoVo.getMngmt_no());
	  attnceDAO.deletePartDetail(attnceDelVo);
	  // 주요프로그램
	  SptTechEducSchedVo schedDelVo = new SptTechEducSchedVo();
	  schedDelVo.setBiz_clsf(infoVo.getBiz_clsf());
	  schedDelVo.setMngmt_no(infoVo.getMngmt_no());
	  schedDAO.deletePartDetail(schedDelVo);
	  // 소요예산
	  SptTechEducReqdBugtVo reqdBugtDelVo = new SptTechEducReqdBugtVo();
	  reqdBugtDelVo.setBiz_clsf(infoVo.getBiz_clsf());
	  reqdBugtDelVo.setMngmt_no(infoVo.getMngmt_no());
	  reqdBugtDAO.deletePartDetail(reqdBugtDelVo);
	  // 기여자
	  SptTechEducContributeVo contributeDelVo = new SptTechEducContributeVo();
	  contributeDelVo.setBiz_clsf(infoVo.getBiz_clsf());
	  contributeDelVo.setMngmt_no(infoVo.getMngmt_no());
	  contributeDAO.deletePartDetail(contributeDelVo);
	  
	  // 1. 세미나 정보 수정
	  eduDAO.mergeDetail(infoVo);
	  // 2. 교육참여자 목록 수정
	  for(int i=0;i<attnceVoList.size();i++){
		  SptTechEducAttnceVo attnceVo = attnceVoList.get(i);
		  attnceVo.setBiz_clsf(infoVo.getBiz_clsf());
		  attnceVo.setMngmt_no(infoVo.getMngmt_no());
		  attnceVo.setReq_no(infoVo.getReq_no());
		  attnceVo.setSeq((i+1)+"");
		  attnceDAO.mergeDetail(attnceVo);
	  }
	  // 3. 주요프로그램 목록 수정
	  
	  for(int i=0;i<schedVoList.size();i++){
		  SptTechEducSchedVo schedVo = schedVoList.get(i);
		  schedVo.setBiz_clsf(infoVo.getBiz_clsf());
		  schedVo.setMngmt_no(infoVo.getMngmt_no());
		  schedVo.setSeq((i+1)+"");
		  schedDAO.mergeDetail(schedVo);
	  }
	  // 4. 소요예산 목록 수정
	  for(int i=0;i<reqdBugtVoList.size();i++){
		  SptTechEducReqdBugtVo reqdBugtVo = reqdBugtVoList.get(i);
		  reqdBugtVo.setBiz_clsf(infoVo.getBiz_clsf());
		  reqdBugtVo.setMngmt_no(infoVo.getMngmt_no());
		  reqdBugtDAO.mergeDetail(reqdBugtVo);
	  }
	  // 5. 기여자 목록 수정
	  for(int i=0;i<contributeVoist.size();i++){
		  SptTechEducContributeVo contributeVo = contributeVoist.get(i);
		  contributeVo.setBiz_clsf(infoVo.getBiz_clsf());
		  contributeVo.setMngmt_no(infoVo.getMngmt_no());
		  contributeDAO.mergeDetail(contributeVo);
	  }
	  
	  if("C".equals(infoVo.getCud_type())){
			// 인터페이스 테이블 저장
			if("SEA010".equals(infoVo.getBiz_clsf())){ // 교육실적등록 등록
				apprFuncService.formInit(infoVo.getReq_no(), "S151", KitechContextUtil.getUserId());  
			} else {		//세미나실적등록
				apprFuncService.formInit(infoVo.getReq_no(), "S155", KitechContextUtil.getUserId());
			}
	  }
	  
	  if(infoVo.isApproval()){
		  this.approvalInfo(vo);
	  }
	  
	  SptTechEducInfoVo rtVo = infoVo;
  
	  return rtVo;
  }

  /**
   * 기술세미나실적/교육실적 삭제
   * @author 손태화
   * @param SptTechEducInfoDetailVo 관리번호 , 교육/세미나 구분
   * @return  
   * @throws KitechException 공통예외
   */
  public void deleteDetail(SptTechEducInfoDetailVo vo) throws KitechException {
	  System.out.println("-- into deleteDetail --"); 
	  
	  SptTechEducInfoVo infoVo = vo.getSptTechEducInfoVo();									
	  // 세미나 정보
	  eduDAO.deleteDetail(infoVo);
	  // 교육참여자
	  SptTechEducAttnceVo attnceDelVo = new SptTechEducAttnceVo();
	  attnceDelVo.setBiz_clsf(infoVo.getBiz_clsf());
	  attnceDelVo.setMngmt_no(infoVo.getMngmt_no());
	  attnceDAO.deletePartDetail(attnceDelVo);
	  // 주요프로그램
	  SptTechEducSchedVo schedDelVo = new SptTechEducSchedVo();
	  schedDelVo.setBiz_clsf(infoVo.getBiz_clsf());
	  schedDelVo.setMngmt_no(infoVo.getMngmt_no());
	  schedDAO.deletePartDetail(schedDelVo);
	  // 소요예산
	  SptTechEducReqdBugtVo reqdBugtDelVo = new SptTechEducReqdBugtVo();
	  reqdBugtDelVo.setBiz_clsf(infoVo.getBiz_clsf());
	  reqdBugtDelVo.setMngmt_no(infoVo.getMngmt_no());
	  reqdBugtDAO.deletePartDetail(reqdBugtDelVo);
	  // 기여자
	  SptTechEducContributeVo contributeDelVo = new SptTechEducContributeVo();
	  contributeDelVo.setBiz_clsf(infoVo.getBiz_clsf());
	  contributeDelVo.setMngmt_no(infoVo.getMngmt_no());
	  contributeDAO.deletePartDetail(contributeDelVo);
	  
	  // 결재정보 삭제
	  apprFuncService.formRemove(infoVo.getReq_no());
  }
    

  	/**
  	 * 교육실적 목록
  	 * @author 손태화
  	 * @param SptTechEducInfoVo 검색 : 지역본부 , 책임자 , 교육시작일자 , 교육종료일자 , 교육과정 , 등록자 , 실적부서 , 신청상태 , 교육/세미나 구분  
  	 * @return List<SptTechEducInfoVo> 교육실적 목록
  	 * @throws KitechException 공통예외
  	 */
	public List<SptTechEducInfoVo> selectEducList(SptTechEducInfoVo vo) throws KitechException {
		System.out.println("-- into selectList --"); 
		return eduDAO.selectEducList(vo);	
	}
	
	/**
	 * 결재신청
	 * @author 손태화
	 * @param SptTechEducInfoDetailVo 세미나/교육 상세 , 참여자 목록 , 주요프로그램 목록 , 소요예산 목록 , 기여자 목록  
	 * @return 
	 * @throws Exception 예외
	 */
	private void approvalInfo(SptTechEducInfoDetailVo vo) throws Exception {
		System.out.println("-- into approvalInfo --"); 
		// SptTechSmnrReg.xsl
		// root/SptTechEducInfoVo/reqd_amt_sum , root/SptTechEducInfoVo/contribute_rt_sum,
		
		SptTechEducInfoVo infoVo = vo.getSptTechEducInfoVo();									// 세미나 정보
		//SptTechEducInfoVo schVo = vo.getSptTechEducInfoVo();									// 교육 정보
		//List<SptTechEducAttnceVo> attnceVoList = vo.getSptTechEducAttnceVoList();				// 교육참여자 목록
		//List<SptTechEducSchedVo> schedVoList = vo.getSptTechEducSchedVoList();				// 주요프로그램 목록
		//List<SptTechEducReqdBugtVo> reqdBugtVoList = vo.getSptTechEducReqdBugtVoList();		// 소요예산 목록
		//List<SptTechEducContributeVo> contributeVoist = vo.getSptTechEducContributeVoList();	// 기여자 목록
    	
    	AprVo aprVo = new AprVo();
    	if("SEA010".equals(infoVo.getBiz_clsf())){ // 교육
	    	aprVo.setUiId("S151");
	    	//aprVo.setMainKey(infoVo.getReq_no());			
		}else{ // 세미나
			//aprVo.setMainKey(infoVo.getReq_no());
			aprVo.setUiId("S155");
		}	
		
		aprVo.setAprState("XAD010");	
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
    	aprVo.setReqNo(infoVo.getReq_no());
    	aprVo.setReporterId(KitechContextUtil.getSyspayno());
    	aprVo.setInfoCd(infoVo.getMngmt_no()+" | "+infoVo.getEduc_procs());
    	aprVo.setEndpoint(accntService.findUserIdBySyspayno(infoVo.getRegst_syspayno()).getUid()); // 중요!!		
    		
		// 첨부파일
		if(!"".equals(infoVo.getAttach_file_no_01())){
			vo.setFileList_A(attachDao.selectListAttach(infoVo.getAttach_file_no_01()));
		}	
		if(!"".equals(infoVo.getAttach_file_no_02())){
			vo.setFileList_B(attachDao.selectListAttach(infoVo.getAttach_file_no_02()));
		}	
		
		// approvalScreen - xsl 파일이 없으면!!(스탭샷X)
		// approvalRequest - xsl 파일이 있으면!!(스탭샷O)
		apprFuncService.approvalRequest(aprVo, vo);
    }

}
