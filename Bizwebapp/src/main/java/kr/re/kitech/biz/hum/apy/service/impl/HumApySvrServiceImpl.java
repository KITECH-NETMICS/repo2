package kr.re.kitech.biz.hum.apy.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ControllerContextUtil;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.hum.apy.dao.HumApySvrDAO;
import kr.re.kitech.biz.hum.apy.service.HumApySvrService;
import kr.re.kitech.biz.hum.apy.vo.AssetsVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyBasicVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyCompanVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo;
import kr.re.kitech.biz.hum.apy.vo.HumApySvrSaveVo;
import kr.re.kitech.biz.hum.apy.vo.HumApySvrVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.service.ApprvConfigService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.AttachVo;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;

/**
 * @ClassSubJect 퇴직신청 관련 처리를 담당하는 MyBatis Impl
 * @Class Name HumApySvrServiceImpl.java
 * @Description 퇴직신청 처리를 담당하는 구현체 서비스
 * @Modification Information
 * @ @ 수정일 수정자 수정내용 @ --------- --------- ------------------------------- @
 *   2022/05/27 박영훈 최초생성
 * 
 * @author 박영훈
 * @since 2022/05/27
 * @version 1.0
 * @see
 * 
 */
@Service("humApySvrServiceImpl")
public class HumApySvrServiceImpl extends EgovAbstractServiceImpl implements HumApySvrService {

	@Resource(name = "humApySvrDAO")
	private HumApySvrDAO humApySvrDAO;

	@Resource(name = "messageSource")
	private MessageSource messageSource;

	@Resource(name = "generationServiceImpl")
	private GenerationService generationService;

	@Resource(name = "apprFuncServiceImpl")
	public ApprFuncService apprFuncService;

	@Resource(name = "accntServiceImpl")
	private AccntService accntService;

	@Resource(name = "attachDAO")
	private AttachDAO attachDAO;
	
	@Resource(name="apprCommonServiceImpl")
    private ApprCommonService apprCommonService;
    
    @Resource(name="mailSender")
	private MailSender mailSender;
	
	@Resource(name="apprvConfigService")
	private ApprvConfigService configService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * kr.re.kitech.biz.hum.apy.service.HumApySvrService#selectListHumApySvr(kr.re.
	 * kitech.biz.hum.apy.vo.HumApySvrVo)
	 */
	public List<HumApySvrVo> selectListHumApySvr(HumApySvrVo humApySvrVo) throws Exception {
		List<HumApySvrVo> list = humApySvrDAO.selectListHumApySvr(humApySvrVo);

		return list;
	}

	@Override
	public List<HumApyDeptChkVo> selectListDeptChk(HumApyDeptChkVo humApyDeptChkVo) throws Exception {
		List<HumApyDeptChkVo> list = humApySvrDAO.selectListDeptChk(humApyDeptChkVo);

		return list;
	}

	@Override
	public List<HumApyCompanVo> selectCompanionList(HumApyCompanVo humApyCompanVo) throws Exception {
		List<HumApyCompanVo> list = humApySvrDAO.selectCompanionList(humApyCompanVo);

		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * kr.re.kitech.biz.hum.apy.service.HumApySvrService#selectListCountHumApySvr(kr
	 * .re.kitech.biz.hum.apy.vo.HumApySvrVo)
	 */
	public long selectListCountHumApySvr(HumApySvrVo humApySvrVo) throws Exception {
		return humApySvrDAO.selectListCountHumApySvr(humApySvrVo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see kr.re.kitech.biz.hum.apy.service.HumApySvrService#selectHumApySvr(kr.re.
	 * kitech.biz.hum.apy.vo.HumApySvrVo)
	 */
	public HumApySvrVo selectHumApySvr(HumApySvrVo humApySvrVo) throws Exception {
		HumApySvrVo resultVO = humApySvrDAO.selectHumApySvr(humApySvrVo);

		return resultVO;
	}

	@Override
	public HumApySvrVo selectManger(HumApySvrVo humApySvrVo) throws Exception {
		HumApySvrVo resultVO = humApySvrDAO.selectManger(humApySvrVo);
		return resultVO;
	}

	@Override
	public Map selectDuplCheck(HumApySvrVo humApySvrVo) throws Exception {
		Map cnt = humApySvrDAO.selectDuplCheck(humApySvrVo);
		AppLog.debug("\n################### cnt : " + cnt);

		return cnt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see kr.re.kitech.biz.hum.apy.service.HumApySvrService#insertHumApySvr(kr.re.
	 * kitech.biz.hum.apy.vo.HumApySvrVo)
	 */
	public HumApySvrVo saveHumApySvr(HumApySvrSaveVo vo) throws Exception {
		HumApySvrVo humApySvrVo = vo.getHumApySvrVo();
		List<HumApyDeptChkVo> humApyDeptChkVoList = vo.getHumApyDeptChkVoList();
		BizUserHeader siteUserHeader = (BizUserHeader)ControllerContextUtil.getUserHeader();

		String reqNo = humApySvrVo.getReq_no();
		String aprState = humApySvrVo.getApr_state();
		String deptCd = humApySvrVo.getDept_cd();
		String deptNewYmd = humApySvrVo.getDept_new_ymd();

		AppLog.debug("reqNo ?? : " + reqNo);
		int result;

		if (reqNo == null || "".equals(reqNo)) {

			reqNo = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "H0F");
			humApySvrVo.setReq_no(reqNo);
			apprFuncService.formInit(reqNo, "H550", KitechContextUtil.getUserId());
			for (HumApyDeptChkVo humApyDeptChkVo : humApyDeptChkVoList) {

				humApyDeptChkVo.setReq_no(reqNo);
				humApyDeptChkVo.setDept_cd(deptCd);
				humApyDeptChkVo.setDept_new_ymd(deptNewYmd);

				String retrn_yn = humApyDeptChkVo.getRetrn_yn();

				if (retrn_yn.equals("0")) {
					humApyDeptChkVo.setRetrn_yn("N");
				} else if (retrn_yn.equals("1")) {
					humApyDeptChkVo.setRetrn_yn("Y");
				}

				String affir_yn = humApyDeptChkVo.getAffir_yn();
				if (affir_yn == "0") {
					humApyDeptChkVo.setAffir_yn("N");
				} else if (affir_yn == "1") {
					humApyDeptChkVo.setAffir_yn("Y");
				}
				humApySvrVo.setHumApyDeptChkVoList(humApyDeptChkVoList);
				humApySvrDAO.insertDeptCheck(humApyDeptChkVo);
			}

			result = humApySvrDAO.insertHumApySvr(humApySvrVo);

		} else {

			for (HumApyDeptChkVo humApyDeptChkVo : humApyDeptChkVoList) {
				humApyDeptChkVo.setReq_no(reqNo);
				humApyDeptChkVo.setDept_cd(deptCd);
				humApyDeptChkVo.setDept_new_ymd(deptNewYmd);

				String retrn_yn = humApyDeptChkVo.getRetrn_yn();
				if (retrn_yn.equals("0")) {
					humApyDeptChkVo.setRetrn_yn("N");
				} else if (retrn_yn.equals("1")) {
					humApyDeptChkVo.setRetrn_yn("Y");
				}

				String affir_yn = humApyDeptChkVo.getAffir_yn();
				if (affir_yn.equals("0")) {
					humApyDeptChkVo.setAffir_yn("N");
				} else if (affir_yn.equals("1")) {
					humApyDeptChkVo.setAffir_yn("Y");
				}
				humApySvrDAO.updateDeptCheck(humApyDeptChkVo);
			}

			if (humApySvrVo.isApproval()) {
			
				/*
				// TODO: 아래 로직은 결재 완료시점으로 이동되어야 함
				//업무인수자, 대결자로 설정
				AppvDelegatorVo delegator = new AppvDelegatorVo();
				delegator.setSyspayno(humApySvrVo.getSyspayno());
				
				// 시작일 설정
				delegator.setStart_ymd(humApySvrVo.getRetire_hope_ymd());
				
		        // 종료일: 날짜 문자열을 LocalDate 객체로 변환 후 3개월 더한 후 LocalDate 객체를 날짜 문자열로 다시 변환
		        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyyMMdd");
		        delegator.setCud_type("C");
				delegator.setCls_ymd( LocalDate.parse(humApySvrVo.getRetire_hope_ymd(), f).plusMonths(3).format(f));
				delegator.setIschkdate("1");
				delegator.setMain_syspayno(humApySvrVo.getPsn_no_syspayno());
				delegator.setRegst_syspayno(siteUserHeader.getSession().getSn());
				
				// 해당 사용자의 대결을 전체 삭제 한 후 업무인수자 한건의 대결을 등록한다. (nbiz, kdoc)
				this.configService.saveAppvDelegator(delegator);
				*/

				// 1. BPM 코어 파라미터 객체 생성
				AprVo aprVo = new AprVo();
				aprVo.setReqNo(humApySvrVo.getReq_no());
				aprVo.setEndpoint(accntService.findUserIdBySyspayno(humApySvrVo.getRegst_syspayno()).getUid());
				aprVo.setInfoCd(humApySvrVo.getInfo_cd());
				aprVo.setOccutyp(humApySvrVo.getOccutyp_cd());
				aprVo.setCardKeepperYn(humApySvrVo.getCard_keeper());
				aprVo.setAprState(humApySvrVo.getApr_state());
				aprVo.setRegion(humApySvrVo.getFomat_unit());
				aprVo.setManager4(humApySvrVo.getManager4_id());
				aprVo.setManager(humApySvrVo.getManager_id());
				aprVo.setTcManger(humApySvrVo.getTc_manager_id());

				// 2. 모델에 첨부파일 및 컬렉션류의 데이터 리스트 추가(필요시)
				AttachVo attachVo = new AttachVo();
				// 첨부파일 번호로 첨부파일 리스트 조회
				attachVo.setAttach_file_no(humApySvrVo.getAttach_file_no());
				humApySvrVo.setAttachVo1(attachDAO.selectListAttach(humApySvrVo.getAttach_file_no()));

				humApySvrVo.setHumApyDeptChkVoList(humApyDeptChkVoList);
				// 3. 전자결재 기능 메소드 호출 (결재신청)
				apprFuncService.approvalRequest(aprVo, humApySvrVo);

			}

			result = humApySvrDAO.updateHumApySvr(humApySvrVo);
		}
		
		HumApySvrVo retVo = new HumApySvrVo();
		retVo.setReq_no(reqNo);
		retVo.setSyspayno(humApySvrVo.getSyspayno());
		return retVo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see kr.re.kitech.biz.hum.apy.service.HumApySvrService#deleteHumApySvr(kr.re.
	 * kitech.biz.hum.apy.vo.HumApySvrVo)
	 */
	public int deleteHumApySvr(HumApySvrVo humApySvrVo) throws Exception {
		if(!humApySvrVo.getApr_state().equals("XAD005")) apprFuncService.formRemove(humApySvrVo.getReq_no());
		return humApySvrDAO.deleteHumApySvr(humApySvrVo);
	}

	@Override
	public List<HumApySvrVo> selectListPcs(HumApySvrVo humApySvrVo) throws Exception {
		List<HumApySvrVo> list = humApySvrDAO.selectListPcs(humApySvrVo);
		return list;
	}

	@Override
	public void formAccept(HumApySvrSaveVo vo) throws Exception {

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		Calendar now = Calendar.getInstance();
		String affirYmd = format.format(now.getTime());

		HumApySvrVo humApySvrVo = vo.getHumApySvrVo();

		for (HumApyDeptChkVo humApyDeptChkVo : vo.getHumApyDeptChkVoList()) {

			humApyDeptChkVo.setReq_no(humApySvrVo.getReq_no());

			// 반납여부: 사용자
			String retrn_yn = humApyDeptChkVo.getRetrn_yn();
			humApyDeptChkVo.setRetrn_yn(retrn_yn.equals("1") ? "Y" : "N");

			// 확인 여부: 담당자
			String affir_yn = humApyDeptChkVo.getAffir_yn();
			humApyDeptChkVo.setAffir_yn(affir_yn.equals("1") ? "Y" : "N");

			// 이번 트랜잭션 화면 진입 후 Y 로 갱신된 건에 대해서는 전자결재 진행을 요청한다.
			AppLog.debug("" + humApyDeptChkVo);
			if ( StringUtils.equals("U", humApyDeptChkVo.getRowStatus()) && 
				 StringUtils.equals("Y", humApyDeptChkVo.getAffir_yn()) ) {
				if (!StringUtils.equals(humApyDeptChkVo.getAffir_item_cd(), "HDE020")) {
					AprVo aprVo = new AprVo();
					aprVo.setReqNo(humApySvrVo.getReq_no());
					aprVo.setEndpoint(KitechContextUtil.getUserId());
					aprVo.setAprState(humApySvrVo.getApr_state());
					aprVo.setTaskExt3(humApyDeptChkVo.getAffir_item_cd());
					aprVo.setTaskExt1("H550");
					apprFuncService.formAccept(aprVo);
				}
				// 값이 바뀌었을때만 변경
				humApyDeptChkVo.setAffir_ymd(affirYmd);
				humApyDeptChkVo.setAffir_syspayno(KitechContextUtil.getSyspayno());
				humApyDeptChkVo.setUpdt_syspayno(KitechContextUtil.getSyspayno());
				humApyDeptChkVo.setDept_cd(humApySvrVo.getDept_cd());
				humApyDeptChkVo.setDept_new_ymd(humApySvrVo.getDept_new_ymd());
			}

			// DB 업데이트
			humApySvrDAO.updateDeptCheck(humApyDeptChkVo);
		}
		
		if(humApySvrVo.getFood_manger_yn().equals("Y")){
			AprVo aprVo = new AprVo();
				aprVo.setReqNo(humApySvrVo.getReq_no());
				aprVo.setEndpoint(KitechContextUtil.getUserId());
				aprVo.setAprState(humApySvrVo.getApr_state());
				aprVo.setTaskExt3("HDE020");
				aprVo.setTaskExt1("H550");
				apprFuncService.formAccept(aprVo);
		}
		
		
	}

	@Override
	public void formReject(HumApySvrSaveVo vo) throws Exception {
//		SimpleDateFormat format = new SimpleDateFormat("YYYYMMDD");
//		Calendar now = Calendar.getInstance();
//		String affirYmd = format.format(now.getTime());

		HumApySvrVo humApySvrVo = vo.getHumApySvrVo();

		for (HumApyDeptChkVo humApyDeptChkVo : vo.getHumApyDeptChkVoList()) {

			humApyDeptChkVo.setReq_no(humApySvrVo.getReq_no());

			// 반납여부: 사용자
//			String retrn_yn = humApyDeptChkVo.getRetrn_yn();
//			humApyDeptChkVo.setRetrn_yn(retrn_yn.equals("1") ? "Y" : "N");
			humApyDeptChkVo.setRetrn_yn("N");

			// 확인 여부: 담당자
//			String affir_yn = humApyDeptChkVo.getAffir_yn();
//			humApyDeptChkVo.setAffir_yn(affir_yn.equals("1") ? "Y" : "N");
			humApyDeptChkVo.setAffir_yn("N");

			// 반려일 경우 모든 항목 초기화(2023/02/28 박단비 행정원 요청)
			humApyDeptChkVo.setAffir_ymd("");
			humApyDeptChkVo.setAffir_syspayno("");
			
			// 이번 트랜잭션 화면 진입 후 Y 로 갱신된 건에 대해서는 전자결재 진행을 요청한다.
			AppLog.debug("" + humApyDeptChkVo);
//			if ("U".equals(humApyDeptChkVo.getRowStatus())) {
//
//				// 값이 바뀌었을때만 변경
//				humApyDeptChkVo.setAffir_ymd(affirYmd);
//				humApyDeptChkVo.setAffir_syspayno(KitechContextUtil.getSyspayno());
//				humApyDeptChkVo.setUpdt_syspayno(KitechContextUtil.getSyspayno());
//				humApyDeptChkVo.setDept_cd(humApySvrVo.getDept_cd());
//				humApyDeptChkVo.setDept_new_ymd(humApySvrVo.getDept_new_ymd());
//			}

			// DB 업데이트
			humApySvrDAO.updateDeptCheck(humApyDeptChkVo);
		}
		
			AprScVo aprScVo = new AprScVo();
			aprScVo.setReqNo(humApySvrVo.getReq_no());
			aprScVo.setEndpoint(KitechContextUtil.getUserId());
			aprScVo.setAprState(humApySvrVo.getApr_state());
			aprScVo.setTaskExt1("H550");
			apprFuncService.formReject(aprScVo);
		
	}

	@Override
	public void formComAccept(HumApySvrSaveVo vo) throws Exception {
		HumApySvrVo humApySvrVo = vo.getHumApySvrVo();
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(humApySvrVo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setAprState(humApySvrVo.getApr_state());
		aprVo.setTaskExt1("H550");
		
		AttachVo attachVo = new AttachVo();
		attachVo.setAttach_file_no(humApySvrVo.getAttach_file_no());
		
		humApySvrVo.setAttachVo1(attachDAO.selectListAttach(humApySvrVo.getAttach_file_no()));

		List<HumApyDeptChkVo> humApyDeptChkVoList = vo.getHumApyDeptChkVoList();
		
		for (HumApyDeptChkVo humApyDeptChkVo : vo.getHumApyDeptChkVoList()) {

			humApyDeptChkVo.setReq_no(humApySvrVo.getReq_no());
	
			// 반납여부: 사용자
			String retrn_yn = humApyDeptChkVo.getRetrn_yn();
			humApyDeptChkVo.setRetrn_yn(retrn_yn.equals("1") ? "Y" : "N");
	
			// 확인 여부: 담당자
			String affir_yn = humApyDeptChkVo.getAffir_yn();
			humApyDeptChkVo.setAffir_yn(affir_yn.equals("1") ? "Y" : "N");
		}
	
	    humApySvrVo.setHumApyDeptChkVoList(humApyDeptChkVoList);
		
	    try {
	    	AppLog.debug("START====SNAPSHOT");
			apprCommonService.makeSnapshot(aprVo.getReqNo(), humApySvrVo);
			AppLog.debug("END====SNAPSHOT");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		apprFuncService.formAccept(aprVo);
	}

	@Override
	public void insertHumThst(HumApySvrSaveVo HumApySvrSaveVo) throws Exception {
		HumApyBasicVo humApyBasicVo = new HumApyBasicVo();
		HumApySvrVo humApySvrVo = HumApySvrSaveVo.getHumApySvrVo();
		humApySvrVo.setWork_clsf("HAG010");
		humApyBasicVo = humApySvrDAO.selectHumInfo(humApySvrVo);
		String appont_no = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "H01");
		
		humApySvrVo.setAppont_no(appont_no);
		humApySvrVo.setRef_tab("humapysvr");
		humApySvrVo.setRef_data(humApySvrVo.getReq_no());
		humApySvrVo.setEmpno(humApyBasicVo.getEmpno());
		humApySvrVo.setNm(humApyBasicVo.getNm());
		humApySvrVo.setAppont_befr_dept_cd(humApyBasicVo.getDept_cd());
		humApySvrVo.setAppont_befr_dept_new_ymd(humApyBasicVo.getDept_new_ymd());
		humApySvrVo.setAppont_befr_occugrp_cd(humApyBasicVo.getOccugrp_cd());
		humApySvrVo.setAppont_befr_occutyp_cd(humApyBasicVo.getOccutyp_cd());
		humApySvrVo.setAppont_befr_posi_cd(humApyBasicVo.getPosi_cd());
		humApySvrVo.setAppont_befr_cd(humApyBasicVo.getDuty_cd());
		humApySvrVo.setAppont_befr_job_cd(humApyBasicVo.getJob_cd());
		humApySvrVo.setAppont_befr_job_clsf(humApyBasicVo.getJob_clsf());
		humApySvrVo.setAppont_befr_work_land(humApyBasicVo.getWork_land());
		humApySvrVo.setAppont_prcs("HCX010");
		humApySvrVo.setAppont_prcs_ymd(humApySvrVo.getRetire_hope_ymd());
		humApySvrVo.setAppont_start_ymd(humApySvrVo.getRetire_hope_ymd());
		humApySvrVo.setAppont_typ(humApySvrVo.getRetire_resn());
		humApySvrVo.setDept_cd(humApyBasicVo.getDept_cd());
		humApySvrVo.setDept_new_ymd(humApyBasicVo.getDept_new_ymd());
		humApySvrVo.setOccugrp_cd(humApyBasicVo.getOccugrp_cd());
		humApySvrVo.setOccutyp_cd(humApyBasicVo.getOccutyp_cd());
		humApySvrVo.setPosi_cd(humApyBasicVo.getPosi_cd());
		humApySvrVo.setDuty_cd(humApyBasicVo.getDuty_cd());
		humApySvrVo.setJob_cd(humApyBasicVo.getJob_cd());
		humApySvrVo.setJob_clsf(humApyBasicVo.getJob_clsf());
		humApySvrVo.setWork_land(humApyBasicVo.getWork_land());
		humApySvrVo.setOfca_no("");
		humApySvrDAO.insertHumThst(humApySvrVo);
	}
	
	@Override
	public void humMailSend(HumApySvrVo humApySvrVo) throws ElException {
		MailTemplateVo templateVo = new MailTemplateVo();
		Map<String, String> templateVar = new HashMap<String, String>();
		BizUserHeader siteUserHeader = (BizUserHeader)ControllerContextUtil.getUserHeader();
		
		String subject = "퇴직예정자에 대한 보안교육 안내";
		String templatePath = "hum/HumApySvrMail";
		String syspayno = siteUserHeader.getSession().getSn();
		String toAddr = humApySvrVo.getEmail();
		String sender = "eipadmin@kitech.re.kr";
		
		templateVo.setContentVar(templateVar);
		List<MailTemplateVo> templateVars = new ArrayList<>();
		templateVars.add(templateVo);
		
		mailSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMail.Builder(syspayno, Business.CCS, true)
				.senderEmail(sender.trim())
				.toAddr(toAddr.trim())
				//.ccAddr(ccAddress)
				.subject(subject)
				.savesent(false)	// 받은 편지함 저장 여부
				.logging(true)	// 로그 저장 여부
				.templatePath(templatePath)
				.templateVars(templateVars)
			.build());
			
			humApySvrDAO.MailSendUpdate(humApySvrVo.getReq_no());
	}
	
	
	@Override
	public List<AssetsVo> selectAssetsList(AssetsVo assetsVo) throws Exception {
		List<AssetsVo> list = humApySvrDAO.selectAssetsList(assetsVo);

		return list;
	}
	
	@Override
	public HumApySvrVo selectAdJobChk(HumApySvrVo humApySvrVo) throws Exception {
		HumApySvrVo resultVO = humApySvrDAO.selectAdJobChk(humApySvrVo);
		return resultVO;
	}
	

}
