package kr.re.kitech.biz.pat.mnt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.pat.com.dao.PatComDAO;
import kr.re.kitech.biz.pat.com.service.PatComService;
import kr.re.kitech.biz.pat.com.vo.PatRightMntVo;
import kr.re.kitech.biz.pat.mnt.dao.PatRightMngDAO;
import kr.re.kitech.biz.pat.mnt.service.PatRightMngService;
import kr.re.kitech.biz.pat.mnt.vo.PatApprovalVo;
import kr.re.kitech.biz.pat.mnt.vo.PatRightMngListVo;
import kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

@Service("patRightMngServiceImpl")
public class PatRightMngServiceImpl extends EgovAbstractServiceImpl implements PatRightMngService {
  Logger log = LoggerFactory.getLogger(PatRightMngServiceImpl.class);

  @Resource(name="patRightMngDAO")
  private PatRightMngDAO mntDAO;

  @Resource(name="patComDAO")
	private PatComDAO comDao;

  @Resource(name = "patComService")
  private PatComService patComService;

  @Resource(name="generationServiceImpl")
	private GenerationService genService;

  @Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;

  @Resource(name="apprCommonServiceImpl")
	private ApprCommonService aprComService;
	
  /**
    * 권리 유지 관리자 조회
    * @author 
    * @since 2023.08.07.
    */
  @Override
  public List<PatRightMngVo> selectList(PatRightMngVo vo) throws ElException {
    List<PatRightMngVo> list = mntDAO.selectList(vo);	
    return list;
  }

  /**
    * 권리 유지 관리자 저장
    * @author 
    * @since 2023.08.07.
    */
  @Override
  public int savePatRightMntBatch(PatRightMngListVo vo) throws ElException {
    int result = 0;


    // String select01Id = "kitech.pat.mnt.xda.PatMastrMS05";						// 관리번호 검색
    // String select02Id = "kitech.pat.com.xda.PatRightMntSS01";					// 저장전 확인
    // String insert01Id = "kitech.pat.com.xda.PatRightMntSI01";					// 권리유지 등록
    // String update01Id = "kitech.pat.com.xda.PatRightMntSU01";					// 권리유지 변경

    int		mntSeq		= 0;
    String	reqNo		= "";		// 신청 번호
    String  mngmtNo		= "";		// 관리 번호
    String	smitappNo	= "";		// 출원 번호
    String	regstNo		= "";		// 등록 번호

    List<PatRightMngVo> listVo = vo.getPatRightMngVoList();
    
    log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
    log.debug("listVo Size : [{}]", listVo.size());
    
    for (PatRightMngVo item: listVo) {
    
	    log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
	    log.debug("item : [{}]", item);
        				
		// 출원 번호/긍록 번호로 관리번호 찾기
		smitappNo 	= item.getSmitapp_no();
		regstNo    	= item.getRegst_no();
		mntSeq	  	= item.getMnt_seq();

		PatRightMngVo paramDoc01 = new PatRightMngVo();
        paramDoc01.setSmitapp_no(smitappNo);
        paramDoc01.setRegst_no(regstNo);

        // 관리 번호 검색
        PatRightMngVo PatMastrMS05 = mntDAO.selectPatMastrMS05(paramDoc01); // select01Id kitech.pat.mnt.xda.PatMastrMS05

        if(PatMastrMS05 != null){

          PatRightMntVo saveDoc = new PatRightMntVo();

          // 검색 결과 적용
          reqNo = PatMastrMS05.getReq_no();
		  mngmtNo = PatMastrMS05.getMngmt_no();

          saveDoc.setReq_no(reqNo);
          saveDoc.setMngmt_no(mngmtNo);
          saveDoc.setRightmnt_div(""); // 권리유지구분 Y/N
          saveDoc.setRightmnt_div_syspayno(""); // 권리유지구분입력자
          saveDoc.setPatofic_cd(""); // 특허사무소코드 확인
          saveDoc.setPatofic_nm(""); // 특허사무소명
          saveDoc.setNedguidpsn_id(""); // 필요안내자아이디
          saveDoc.setNedguidpsn_nm(""); // 필요안내자명
          saveDoc.setNedguidpsn_reply_req_ymd(""); // 필요안내자회신요청일자
          saveDoc.setNeed_guide_ymd(""); // 필요안내일자
          saveDoc.setNeed_guide_rmk(""); // 필요안내비고
          saveDoc.setRcpt_syspayno(""); // 접수시스템개인번호
          saveDoc.setRcpt_syspaynm(""); // 접수자명
          saveDoc.setRcpt_revw_req_ymd(""); // 접수검토요청일자
          saveDoc.setRcpt_revw_req_rmk(""); // 접수검토요청비고
          saveDoc.setRevw_giveup_clsf(""); // 검토포기구분
          saveDoc.setRevw_complt_hope_ymd(""); // 검토완료희망일
          saveDoc.setRevw_ymd(""); // 검토일자
          saveDoc.setRevw_rmk(""); // 검토비고
          saveDoc.setIndic_complt_hope_ymd(""); // 지시완료희망일
          saveDoc.setIndic_ymd(""); // 지시일자
          saveDoc.setIndic_rmk(""); // 지시비고
          saveDoc.setThsyear_evyearfee_pay_ymd(""); // 금년차연차료납부일
          saveDoc.setAccnt_no(""); // 유지계정번호
          saveDoc.setNexyear_evyearfee_pay_close_ymd(""); // 내년차연차료납부마감일
          saveDoc.setComplt_rpt_id(""); // 완료보고아이디
          saveDoc.setComplt_rpt_nm(""); // 완료보고자명
          saveDoc.setComplt_rpt_ymd(""); // 완료보고일자
          saveDoc.setComplt_rpt_rmk(""); // 완료보고비고
          saveDoc.setRevw_req_ymd(""); // 검토요청일자
          saveDoc.setRevw_req_rmk(""); // 검토요청비고
          saveDoc.setRe_wrte_indic_req_ymd(""); // 재작성지시요청일자
          saveDoc.setRe_wrte_indic_req_rmk(""); // 재작성지시요청비고
          saveDoc.setRe_wrte_indic_ymd(""); // 재작성지시일자
          saveDoc.setRe_wrte_indic_rmk(""); // 재작성지시비고
          saveDoc.setRevw_complt_affir_ymd(""); // 검토완료확인일자
          saveDoc.setRevw_complt_affir_rmk(""); // 검토완료확인비고
          saveDoc.setRcpt_complt_affir_ymd(""); // 접수완료확인일자
          saveDoc.setRcpt_complt_affir_rmk(""); // 접수완료확인비고
          saveDoc.setTax_bill_no(""); // 세금계산서번호
          saveDoc.setUnslip_no(""); // 가결의번호
          saveDoc.setUnusual_item(""); // 특이사항
          saveDoc.setAttach_file_no(""); // 첨부파일

		  // 권리 유지 저장 전 확인
          PatRightMntVo paramDoc02 = new PatRightMntVo();
          paramDoc02.setReq_no(reqNo);
          paramDoc02.setMngmt_no(mngmtNo);
          paramDoc02.setMnt_seq(String.valueOf(mntSeq)); // int

          // 관리 번호 검색
          List<PatRightMntVo> PatRightMntSS01 = comDao.selectPatRightMnt(paramDoc02); // select02Id kitech.pat.com.xda.PatRightMntSS01

          if(PatRightMntSS01.size() > 0){
            result = comDao.insertPatRightMnt(saveDoc); // insert01Id  kitech.pat.com.xda.PatRightMntSI01
          }else{
            result = comDao.updatePatRightMnt(saveDoc); // update01Id  kitech.pat.com.xda.PatRightMntSU01
          }

        }
    }
    return result;
  }

  /**
    * 권리유지 결재신청
    * @author 
    * @throws Exception 
    * @since 2023.08.07.
    */
  @Override
  public PatRightMngVo saveReqPatRight(PatRightMngListVo vo) throws Exception {
    
    PatRightMngVo retVo = new PatRightMngVo();

    String reqNo = "";
    String cudType = "";
    String docuClsf = "";
    String aprState = "";

    PatApprovalVo aprDoc = vo.getPatApprovalVo();

    log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
    log.debug("aprDoc : [{}]", aprDoc);
    
    reqNo = aprDoc.getReq_no();
	cudType = aprDoc.getCud_type();
	docuClsf = aprDoc.getDocu_clsf();
	aprState = aprDoc.getApr_state();
	
	// =================================================== //
	// 1. 신청번호 채번
	// =================================================== //
	if ("".equals(reqNo)) {	
		reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), docuClsf);
		aprDoc.setReq_no(reqNo);
	}
	
	// ============================================ //
	// 2. 전자 결재 임시 저장 //
	// ============================================ //

	if ("C".equals(cudType)) {
		//결재상태 : 임시저장
		if(aprState == "") aprState = "XAD005";
		IntfatabVo IntVo = new IntfatabVo();
		IntVo.setReqNo(aprDoc.getReq_no());
		IntVo.setAprState(aprState);
		IntVo.setEndpoints(KitechContextUtil.getUserId());
		IntVo.setUiId(aprDoc.getUi_id());
		/*kr.re.kitech.biz.apr.putXomxintfatab*/
		aprComService.putXomxintfatab(IntVo);
			
	}

    // =================================================== //
    // 3. 전자 결재 엔진에 전송 Data
    // =================================================== //
    AprVo aprVo = new AprVo();
    aprVo.setApproval(aprDoc.isApproval());
    if (aprVo.isApproval()) {
      //결재: 인스터스 생성 로직 구현
        aprVo.setReqNo(reqNo);
        aprVo.setReporterId(aprDoc.getSyspayno());
        aprVo.setUiId("I501");
        aprVo.setManager(aprDoc.getManager_id());
        aprVo.setAprState(aprState);
        aprVo.setEndpoint(KitechContextUtil.getUserId());
        apprFuncService.approvalScreen(aprVo);
    }

    log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
    log.debug("aprVo : [{}]", aprVo);

    PatRightMntVo saveDoc = vo.getPatRightMntVo();
    
    /*
	    saveDoc = (Document) myRootHash.get("PatRightMnt");
	    WebSquare.ModelUtil.setInstanceValue("patRightMnt/cud_type/@value",     "U");                       // 신청구분
		WebSquare.ModelUtil.setInstanceValue("patRightMnt/req_no/@value",       reqNo);                     // 발명신고서번호
		WebSquare.ModelUtil.setInstanceValue("patRightMnt/mngmt_no/@value",     mngmtNo);                   // 관리번호
		WebSquare.ModelUtil.setInstanceValue("patRightMnt/mnt_seq/@value",      mntSeq);                    // 유지차수
		WebSquare.ModelUtil.setInstanceValue("patRightMnt/right_req_no/@value", "");                        // 권리유지신청번호
     */

    log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
    log.debug("aprState : [{}]", aprState);
	if ("XAD010".equals(aprState)) {
		// =================================================== //
		// 4. 권리유지 테이블에 권리유지신청번호 update
		// =================================================== //
		saveDoc.setReq_no(reqNo);
	}

    /*
     * 권리유지 저장
     */
    patComService.savePatRightMnt(saveDoc);

    retVo.setReq_no(reqNo);
    log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
    log.debug("retVo : [{}]", retVo);
    
    /*if ("Y".equals(rightMntDiv)) {
      // 포기신청
      giveupReqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I02");
      
      saveDoc.setGiveup_req_no(giveupReqNo);
      saveDoc.setSeq_no(1);
      
      log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
      log.debug("saveDoc : [{}]", saveDoc);
           
      PatRightMngVo paramVo = new PatRightMngVo();
      paramVo.setCud_type(saveDoc.getCud_type());
      paramVo.setReq_no(saveDoc.getReq_no());
      paramVo.setMngmt_no(saveDoc.getMngmt_no());
      paramVo.setMnt_seq(Integer.valueOf(saveDoc.getMnt_seq()));
      paramVo.setRight_req_no(saveDoc.getRight_req_no());
      paramVo.setGiveup_req_no(giveupReqNo);

      

      retVo.setGiveup_req_no(savePatGiveUp(paramVo));
    } */  

    return retVo;
  }
  
  /**
	* 권리유지 결재신청
	* @author 
	* @throws Exception 
	* @since 2023.08.10.
	*/
  public PatRightMngVo savePatRightDiv(PatRightMngListVo vo) throws Exception {

		PatRightMngVo retVo = new PatRightMngVo();
	
		String giveupReqNo = "";
		String reqNo = "";
		String aprState = "";
		String rightMntDiv = ""; // 권리유지여부
	
		PatApprovalVo aprDoc = vo.getPatApprovalVo();
	
		reqNo = aprDoc.getReq_no();
		aprState = aprDoc.getApr_state();
		rightMntDiv = aprDoc.getRightmnt_div();
	
		// =================================================== //
		// 1. 전자 결재 엔진에 전송 Data
		// =================================================== //
	
		AprVo aprVo = new AprVo();
	    aprVo.setApproval(aprDoc.isApproval());
	    if (aprVo.isApproval()) {
	      //결재: 인스터스 생성 로직 구현
	        aprVo.setReqNo(reqNo);
	        aprVo.setReporterId(aprDoc.getSyspayno());
	        aprVo.setUiId("I320");
	        aprVo.setManager(aprDoc.getManager_id());
	        aprVo.setAprState(aprState);
	        aprVo.setEndpoint(KitechContextUtil.getUserId());
	        apprFuncService.approvalScreen(aprVo);
	    }
	
	    log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
	    log.debug("aprVo : [{}]", aprVo);
	
	
		PatRightMntVo saveDoc = vo.getPatRightMntVo();
	
		// =================================================== //
		// 3. 권리유지 테이블에 계정번호 update
		// =================================================== //
	
		saveDoc.setCud_type("U");
	
		/*
	     * 권리유지 저장
	     */
	    patComService.savePatRightMnt(saveDoc);
	
		if ("Y".equals(rightMntDiv)) {
		  // 포기
		  giveupReqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I02");
	  
	      saveDoc.setGiveup_req_no(giveupReqNo);
	      saveDoc.setSeq_no(1);
	      
	      log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
	      log.debug("saveDoc : [{}]", saveDoc);
	           
	      PatRightMngVo paramVo = new PatRightMngVo();
	      paramVo.setCud_type(saveDoc.getCud_type());
	      paramVo.setReq_no(saveDoc.getReq_no());
	      paramVo.setMngmt_no(saveDoc.getMngmt_no());
	      paramVo.setMnt_seq(Integer.valueOf(saveDoc.getMnt_seq()));
	      paramVo.setRight_req_no(saveDoc.getRight_req_no());
	      paramVo.setGiveup_req_no(giveupReqNo);
	      paramVo.setUi_id(aprDoc.getUi_id());
	      paramVo.setSeq_no(1);
	
	      retVo.setGiveup_req_no(savePatGiveUp(paramVo));
	
		}
		if ("Y".equals(rightMntDiv)) {
			retVo.setGiveup_req_no(giveupReqNo);
		}
		retVo.setReq_no(reqNo);
	
		return retVo;
	}
  
  


  	/**
	 * 지식재산권 포기 신청 등록
	 * 
	 * [세부기준] 1.단위업무
	 * 
	 */
	public String savePatGiveUp(PatRightMngVo vo) throws Exception {
	// kitech.pat.app.xda.PatGiveUpSI01 지식재산권 포기 등록
    // kitech.pat.ptd.xda.PatTodoSS01 todo 검색
    // kitech.pat.pts.rec.xda.PatPtsTodoSU01 포기 시 TODO 데이터 삭제
    // kitech.pat.app.xda.PatGiveUpSU01 지식재산권 포기 수정
    
    int result = 0;
    
    String cudType = vo.getCud_type();
    String giveupReqNo = vo.getGiveup_req_no();    

    if ("C".equals(cudType)) {
      giveupReqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), vo.getDocu_clsf());
      
      // 지식재산권 포기 등록
      vo.setGiveup_req_no(giveupReqNo);
      result = mntDAO.insertPatGiveUpSI01(vo); // kitech.pat.app.xda.PatGiveUpSI01

      // todo 검색
      vo.setReq_no(giveupReqNo);
      PatRightMngVo PatTodoSS01 = mntDAO.selectPatTodoSS01(vo); // kitech.pat.ptd.xda.PatTodoSS01
      String workId = PatTodoSS01.getWork_id();
      vo.setReq_no(workId);

      // 포기 시 todo 데이터 삭제
      result = mntDAO.updatePatPtsTodoSU01(vo); // kitech.pat.pts.rec.xda.PatPtsTodoSU01

      if(vo.getAprState() == null) vo.setAprState("XAD005");
      if(vo.getEndpoints() == null) vo.setEndpoints(KitechContextUtil.getUserId());
      log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
      log.debug("결재상태 : 임시저장 : [{}]", vo);
      //결재상태 : 임시저장
      IntfatabVo IntVo = new IntfatabVo();
      IntVo.setReqNo(vo.getReq_no());
	  IntVo.setAprState(vo.getApr_state());
	  IntVo.setEndpoints(KitechContextUtil.getUserId());
	  IntVo.setUiId(vo.getUi_id());
	  aprComService.putXomxintfatab(IntVo);

    } else {
    	result = mntDAO.updatePatGiveUpSU01(vo); // kitech.pat.app.xda.PatGiveUpSU01 지식재산권 포기 수정
    }
    	log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ");
    	log.debug("savePatGiveUp ::> result : [{}] giveupReqNo : [{}]", result, giveupReqNo);
    	return giveupReqNo;
    	
	}

}
