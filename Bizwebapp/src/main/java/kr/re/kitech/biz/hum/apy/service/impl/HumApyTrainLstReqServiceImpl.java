package kr.re.kitech.biz.hum.apy.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.DocCommentsVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.hum.apy.dao.HumApyTrainLstReqDAO;
import kr.re.kitech.biz.hum.apy.service.HumApyTrainLstReqService;
import kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyEducVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * @ClassSubJect : 교육훈련 신청 관련 처리를 담당하는 MyBatis Impl
 * @ClassName : HumApyTrainLstReqServiceImpl.java
 * @Description : 교육훈련 신청 관련 처리를 담당하는 MyBatis Impl 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.05.      송선화    최초생성
 * 
 * @author 
 * @since 2023.10.05.
 * @version 1.0
 * @see
 * 
 */
@Service("humApyTrainLstReqServiceImpl")
public class HumApyTrainLstReqServiceImpl extends EgovAbstractServiceImpl implements HumApyTrainLstReqService{
	
	@Resource(name="humApyTrainLstReqDAO")
	private HumApyTrainLstReqDAO trainDao;
	
	@Resource(name = "generationServiceImpl")
	public GenerationService generationService;
	
	@Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;
    
    @Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService;
	
	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;	
	
	@Resource(name="accntServiceImpl")
	private AccntService accntService;
	
	@Resource(name="attachDAO")
	private AttachDAO attachDAO;
	
	/**
   * 교육훈련 신청 목록 조회
   * @param HumApyTrainLstReqVo
   * @return List<HumApyTrainLstReqVo>
   * @throws KitechException
   */
  @Override
  public List<HumApyTrainLstReqVo> selectList(HumApyTrainLstReqVo vo) throws KitechException {
	  List<HumApyTrainLstReqVo> list = new ArrayList<HumApyTrainLstReqVo>();
	  AppLog.debug("=========================duc_code==="+vo.getDuc_code());
	 if(vo.getDuc_code().equals("")){	//HumApyEducMS01
		 list = trainDao.selectHumApyEduc01 (vo);	
	 } else { 	//HumApyEducMS05
		 list = trainDao.selectHumApyEduc05 (vo);	
	 }  
    
    return list;
  }
  
  /**
   * 교육훈련 신청 목록 Excel 내리기
   * @param HumApyTrainLstReqVo
   * @return List<HumApyTrainLstReqVo>
   * @throws KitechException
   */
  @Override
  public List<HumApyTrainLstReqVo> selectTrainLstReqExel(HumApyTrainLstReqVo vo) throws KitechException {
	  List<HumApyTrainLstReqVo> list = new ArrayList<HumApyTrainLstReqVo>();
	 if(vo.getCh_val().equals("TUA002")){	//HumApyEducMS05
		 list = trainDao.selectHumApyEduc05 (vo);	
	 } else { 	//HumApyEducMS01
		 list = trainDao.selectHumApyEduc01 (vo);	
	 }  
    
    return list;
  }
  
  /**
   * 교육훈련상세 조회 전 신청번호로 시스템사번 조회
   * @param HumApyEducVo
   * @return HumApyEducVo
   * @throws KitechException
   */
  @Override
   public HumApyEducVo selectHumApyEduc(HumApyEducVo vo) throws KitechException {
	  return  trainDao.selectHumApyEduc(vo);
   }  
   
    /**
   * 교육훈련 신청 기본정보 상세
   * @param HumApyEducVo
   * @return HumApyEducVo
   * @throws KitechException
   */
   @Override
   public HumApyTrainLstReqListVo selectApyTrainBasicInfo(HumApyEducVo vo) throws KitechException {
	   HumApyTrainLstReqListVo resVo = new HumApyTrainLstReqListVo();
	   HumApyEducVo baseInfo = new HumApyEducVo();
	   HumApyEducVo baseInfo02 = new HumApyEducVo();
	   List<HumApyEduCpacpVo> attentVo = new ArrayList<HumApyEduCpacpVo>();
	   if(vo.getReq_no().equals("")){
		   //기본정보 - 문서 저장전 개인정보
		   baseInfo = trainDao.selectApyTrainBasicInfo(vo); 		   
		   resVo.setHumApyEducVo(baseInfo);
	   } else {
		   //기본정보 - 문서 저장후 개인정보
		   baseInfo02 = trainDao.selectApyTrainBasicInfo02(vo);
		   //참석자정보
		   attentVo = trainDao.selectHumApyEducpacp(vo);
		   
		   resVo.setHumApyEducVo(baseInfo02);
		   resVo.setAttentList(attentVo);  
		   
		   if (baseInfo02.getApr_state().equals("XAD015")) {
				DocCommentsVo docVo = new DocCommentsVo();
				docVo.setReq_no(vo.getReq_no());
				docVo.setOpt_type("rejecttop");
				resVo.setDocList(apprCommonService.selectDocComments(docVo));		
			}	
	   }	      
   
	  return  resVo;
   }  
   
  /**
   * 교육훈련 개별 상한 금액 체크
   * @param HumApyEducVo
   * @return List<HumApyEducVo>
   * @throws KitechException
   */
  @Override
  public List<HumApyEducVo> selectEduAmt(HumApyEducVo vo) throws KitechException {

    return trainDao.selectEduAmt (vo);
  }
  
  /**
   * 교육훈련 신청 저장
   * @param HumApyEducListVo
   * @return HumApyEducVo
   * @throws KitechException
   */
  @Override
  public HumApyEducVo saveEducAll(HumApyTrainLstReqListVo vo) throws KitechException {
	  HumApyEducVo resVo = new HumApyEducVo();
	  HumApyEducVo baseInfoVo = vo.getHumApyEducVo();
	  List<HumApyEduCpacpVo> eduLstRes = new ArrayList<HumApyEduCpacpVo>();
	  HumApyTrainLstReqListVo humAprTrain = new HumApyTrainLstReqListVo();
	  
	  String reqNo = baseInfoVo.getReq_no();
	  String add_syspayno = baseInfoVo.getAdd_syspayno();
	  AppLog.debug("&&&add_syspayno***"+add_syspayno);
	  
	  if(reqNo.equals("")) {
		  String gen = "";
		  gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "H10");
		  reqNo = gen;
		  
		  baseInfoVo.setReq_no(reqNo);
		  baseInfoVo.setApr_state("XAD005");
		  
		  apprFuncService.formInit(gen, baseInfoVo.getServiceId(), KitechContextUtil.getUserId());
		  
		  trainDao.insertHumApyEducSI01(baseInfoVo);	//교육 기본정보 등록
		  
		  if (add_syspayno != null && !"".equals(add_syspayno)) {
				 this.insertHumApyEducPacp(vo);
		  }	  
	  } else {
		  	//결재상태 유효성
			try {
				apprValidService.isWaitStateAtIntfatab(baseInfoVo.getServiceId(), baseInfoVo.getReq_no());
			}catch (KitechException ex){
				throw ex;
			}
	  
		  trainDao.updateHumApyEducSI01(baseInfoVo);	//교육 기본정보 수정
		  
		  String aprState = baseInfoVo.getApr_state();
		  String saveTyp = baseInfoVo.getSave_typ();
		  
		   if (add_syspayno != null && !"".equals(add_syspayno)) {
			  this.insertHumApyEducPacp(vo);
			//	this.insertHumApyEducPacp(baseInfoVo);
			}
		   
		   if("APR".equals(saveTyp)){
			    // 참석자 정보 재조회
			   eduLstRes =  trainDao.selectHumApyEducpacp(baseInfoVo);
			   
			   if(baseInfoVo.isApproval()) {
					AprVo aprVo = new AprVo();
					//교육 기본정보
					humAprTrain.setHumApyEducVo(baseInfoVo);
					//참석자 정보
					humAprTrain.setAttentList(vo.getAttentList());
					
					aprVo.setReqNo(reqNo);
					aprVo.setEndpoint(accntService.findUserIdBySyspayno(baseInfoVo.getRegst_syspayno()).getUid());
					aprVo.setAprState(baseInfoVo.getApr_state());
					aprVo.setUiId(baseInfoVo.getServiceId());
					aprVo.setReporterId(KitechContextUtil.getSyspayno());
					aprVo.setAccountCharger(baseInfoVo.getSyspayno());
					aprVo.setBudgetController("");
					aprVo.setExt1Cd(baseInfoVo.getAccnt_no());
					aprVo.setInfoCd(baseInfoVo.getEduc_typ_nm()+"/"+baseInfoVo.getEduc_agncy()+"/"+baseInfoVo.getStart_ymd()+"~"+baseInfoVo.getCls_ymd()+"/"+baseInfoVo.getEduc_nm());
					//selectboxEducTyp.getText()+"/"+inputEducAgncy.getValue()+"/"+inputCalendarStartYmd.getValue()+"~"+inputCalendarClsYmd.getValue()+"/"+inputEducNm.getValue()
					aprVo.setExt2Cd(baseInfoVo.getEduc_nm());
					aprVo.setExt3Cd(baseInfoVo.getEdu_member());
					
					aprVo.setSupportPsn(baseInfoVo.getSyspayno());
					
					AppLog.debug("======getAttach_file_no==="+baseInfoVo.getAttach_file_no());
					//스냅샷에 전달하기위한 첨부파일 세팅
					if(!"".equals(baseInfoVo.getAttach_file_no())){
						humAprTrain.setFileList(attachDAO.selectListAttach(baseInfoVo.getAttach_file_no()));
					}
	
					apprFuncService.approvalRequest(aprVo, humAprTrain);
				}
		   } else if ("XAD015".equals(aprState) || "XAD013".equals(aprState)) {
				baseInfoVo.setApr_state("XAD005");
				//xda.execute("kitech.hum.apy.xda.XomXintfatabSU01", doc);
				 apprFuncService.formInit(baseInfoVo.getReq_no(), baseInfoVo.getServiceId(), KitechContextUtil.getUserId());
			}
	  }
	  
	  resVo.setReq_no(baseInfoVo.getReq_no());
	  
	  return resVo;
  }
  
  public void insertHumApyEducPacp(HumApyTrainLstReqListVo vo ){
		HumApyEduCpacpVo addVo = new HumApyEduCpacpVo();
		List<HumApyEduCpacpVo> attentVo = vo.getAttentList();
		HumApyEducVo baseVo = vo.getHumApyEducVo();
		
		/**XMLUtil.setString(doc, "syspayno", XMLUtil.getString(doc, "add_syspayno"));
		XMLUtil.setString(doc, "dept_cd", XMLUtil.getString(doc, "add_dept_cd"));
		XMLUtil.setString(doc, "dept_new_ymd", XMLUtil.getString(doc, "add_dept_new_ymd"));
		XMLUtil.setString(doc, "posi_cd", XMLUtil.getString(doc, "add_posi_cd"));
		XMLUtil.setString(doc, "duty_cd", XMLUtil.getString(doc, "add_duty_cd"));
		XMLUtil.setString(doc, "job_cd", XMLUtil.getString(doc, "add_job_cd"));
		XMLUtil.setString(doc, "educ_amt", XMLUtil.getString(doc, "add_educ_amt"));
		XMLUtil.setString(doc, "rpt_educ_amt", XMLUtil.getString(doc, "add_rpt_educ_amt"));
		XMLUtil.setString(doc, "start_ymd", XMLUtil.getString(doc, "add_start_ymd"));
		XMLUtil.setString(doc, "cls_ymd", XMLUtil.getString(doc, "add_cls_ymd"));
		XMLUtil.setString(doc, "educ_time", XMLUtil.getString(doc, "add_educ_time"));
		XMLUtil.setString(doc, "educ_contnt", XMLUtil.getString(doc, "add_educ_contnt"));
		XMLUtil.setString(doc, "attend_yn", "Y");**/
		
		addVo.setSyspayno(baseVo.getAdd_syspayno());
		addVo.setDept_cd(baseVo.getAdd_dept_cd());
		addVo.setDept_new_ymd(baseVo.getAdd_dept_new_ymd());
		addVo.setPosi_cd(baseVo.getAdd_posi_cd());
		addVo.setDuty_cd(baseVo.getAdd_duty_cd());
		addVo.setJob_cd(baseVo.getAdd_job_cd());
		addVo.setEduc_amt(baseVo.getAdd_educ_amt());
		addVo.setRpt_educ_amt(baseVo.getAdd_rpt_educ_amt());
		addVo.setStart_ymd(baseVo.getAdd_start_ymd());
		addVo.setCls_ymd(baseVo.getAdd_cls_ymd());
		addVo.setEduc_time(baseVo.getAdd_educ_time());
		addVo.setEduc_contnt(baseVo.getAdd_educ_contnt());
		addVo.setAttend_yn("Y");
		
		
		HumApyEducVo addCntVo = new HumApyEducVo();
		addCntVo.setSyspayno(baseVo.getAdd_syspayno());
		addCntVo.setReq_no(baseVo.getReq_no());
		int chkResult = trainDao.selectHumApyEduCpacpSS02(addCntVo);	
		
		//String chkCnt = XMLUtil.getString(chkResult, "cnt");
		if (chkResult == 0) {
			for(HumApyEduCpacpVo aVo : attentVo){
				trainDao.insertHumApyEduCpacpSI01(aVo);
			}
			//xda.execute("kitech.hum.apy.xda.HumApyEduCpacpSI01", doc);
		} else {
			for(HumApyEduCpacpVo bVo : attentVo){
				trainDao.updateHumApyEduCpacpSU01(bVo);
			}
			//xda.execute("kitech.hum.apy.xda.HumApyEduCpacpSU01", doc);
		}

  }
  
   /**
   * 교육훈련 전자결재 승인(화면)
   * @param HumApyTrainLstReqListVo
   * @return 
   * @throws KitechException
   */
   @Override
    public void formAccept(HumApyTrainLstReqListVo vo) throws KitechException {
	   HumApyEducVo baseInfoVo = vo.getHumApyEducVo();
    
	   	AprVo aprVo = new AprVo();
		aprVo.setReqNo(baseInfoVo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setAprState(baseInfoVo.getApr_state());
		apprFuncService.formAccept(aprVo);	
    }  
    
    /**
   * 교육훈련 전자결재 반려(화면)
   * @param HumApyEducVo
   * @return 
   * @throws KitechException
   */
   @Override
    public void formReject(HumApyEducVo vo) throws KitechException {
	   	AprVo aprVo = new AprVo();
		aprVo.setReqNo(vo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setAprState(vo.getApr_state());
		apprFuncService.formAccept(aprVo);	
    } 
    
    /**
   * 교육훈련 참석자, 전자결재 삭제
   * @param HumApyEducVo
   * @return 
   * @throws KitechException
   */
   @Override
    public void deleteApyTrain(HumApyEducVo vo) throws KitechException {
	   String delType = vo.getDel_typ();
	   String rowSyspayno = vo.getRow_syspayno();
	   
	    AppLog.debug("rowSyspayno===="+rowSyspayno);
	   if("apy".equals(delType)){
		   trainDao.deleteHumApyEduc(vo);
		   apprFuncService.formRemove(vo.getReq_no());
	   } else  if("row".equals(delType)){
		   vo.setSyspayno(rowSyspayno);
		   trainDao.deleteHumApyEduCpacp(vo);
		   trainDao.updateHumApyEduc(vo);
	   }	   
    } 
    
    /**
   * 교육훈련 참석자 저장
   * @param HumApyEducVo
   * @return 
   * @throws KitechException
   */
   @Override
   public HumApyEduCpacpVo saveEducPacp(HumApyTrainLstReqListVo vo) throws KitechException {
	    List<HumApyEduCpacpVo> attentVo = vo.getAttentList();
	    HumApyEduCpacpVo resVo = new HumApyEduCpacpVo();
	    HumApyEduCpacpVo searchVo = new HumApyEduCpacpVo(); 
	    
	    for(int i=0; i < attentVo.size(); i++){
	    	searchVo.setEmpno(attentVo.get(i).getEmpno() );
	    	searchVo.setReq_no(attentVo.get(i).getReq_no());
	    	int chkCnt = trainDao.selectHumApyEduCpacpSS03(searchVo);
	    	HumApyEduCpacpVo rsltVo = attentVo.get(i);
	    	if(chkCnt== 0){
	    		// 교육훈련 참석자 정보 파일업로드 입력
	    		trainDao.insertHumApyEduCpacpSI02(rsltVo);
	    	} else {
	    		// 교육훈련 참석자 정보 파일업로드 수정
	    		trainDao.updateHumApyEduCpacpSU02(rsltVo);
	    	}
	    	trainDao.updateHumApyEducSU05(rsltVo);	// 교육훈련 교육비합계액 수정
	    }
	    
	    //resVo.setReq_no(vo.getAttentList().get(0).getReq_no());
	    return resVo;
   }
    
}
