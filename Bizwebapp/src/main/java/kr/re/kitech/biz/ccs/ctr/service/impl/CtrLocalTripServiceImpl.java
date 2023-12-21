package kr.re.kitech.biz.ccs.ctr.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.DocCommentsVo;
import kr.re.kitech.biz.ccs.com.dao.CcsComDAO;
import kr.re.kitech.biz.ccs.com.vo.BizTripHoliCntVo;
import kr.re.kitech.biz.ccs.com.vo.WorkTimeVo;
import kr.re.kitech.biz.ccs.ctr.dao.CtrDomTripDAO;
import kr.re.kitech.biz.ccs.ctr.dao.CtrLocalTripDAO;
import kr.re.kitech.biz.ccs.ctr.service.CtrLocalTripService;
import kr.re.kitech.biz.ccs.ctr.vo.BizTripFareVo;
import kr.re.kitech.biz.ccs.ctr.vo.CheckSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO;
import kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripInfoVO;
import kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripVO;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripCurStnVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripSrcVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.vo.AutoBugtVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.fin.spa.service.FinLocalTripSlipService;
import kr.re.kitech.biz.fin.spa.vo.FinAutoSlipCrtVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSrcVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.CodeVo;

/**
 * @ClassSubJect 근거리출장 관련 처리 컨트롤러
 * @Class Name CtrTripInviteController.java
 * @Description 근거리출장 관련 처리 컨트롤러
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/05/13      김태균             최초생성
 * 
 * @author 김태균
 * @since 2022/05/13
 * @version 1.0
 * @see
 * 
 */
@Service("ctrLocalTripService")
public class CtrLocalTripServiceImpl extends EgovAbstractServiceImpl implements CtrLocalTripService {
	
	@Resource(name = "generationServiceImpl")
	private GenerationService generationService;

	@Resource(name="finComService")
	private FinComService finComService;	
    
    @Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
    @Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService;	
	
    @Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;		
		
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	@Resource(name="ctrLocalTripDAO")
    private CtrLocalTripDAO ctrLocalTripDAO;
    
    @Resource(name="ccsComDAO")
    private CcsComDAO ccsComDAO;
    
    @Resource(name="ctrDomTripDAO")
    private CtrDomTripDAO tripDao;
    
    @Resource(name="attachDAO")
    private AttachDAO attachDao;
    
    @Resource(name="finLocalTripSlipService")
	private FinLocalTripSlipService localSlipService;
    
	
	/**
     * 여비금을 조회 한다
     * @param Object
     * @throws Exception
     */
	@Override
	public List<BizTripFareVo> selectCtrTrafcFee(CtrTripSrcVo param) throws KitechException {
		return ctrLocalTripDAO.selectCtrTrafcFee(param);
	}
	
	/**
     * 근거리출장을 생성 한다
     * @param CtrLocalTripVO
     * @throws Exception
     */
	@Override
	public CtrTripSrcVo saveCtrLocalTrip(CtrLocalTripVO vo)  {
		CtrLocalTripInfoVO infoVo = vo.getTripVo(); // 출장정보		
		
		String reqNo = infoVo.getReq_no();	
			    
		if("C".equals(infoVo.getCud_type())){
			reqNo = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C76");
			
			infoVo.setReq_no(reqNo);
			ctrLocalTripDAO.insertCtrLocalInfo(infoVo);
			
			// 인터페이스 테이블 저장
			apprFuncService.formInit(reqNo, "C304", KitechContextUtil.getUserId());
		}else{
			// AprState 체크하는 공통 메소드호출
			try {
				apprValidService.isWaitStateAtIntfatab("C304", reqNo);
			} catch (KitechException ex) {
				throw ex;
			}
			
			// 수정 로직 호출
			ctrLocalTripDAO.updateCtrLocalInfo(infoVo);						
		}		
		
		// 02.출장원 생성
		// 기존 데이터 삭제
		if(!"C".equals(infoVo.getCud_type())){
			ctrLocalTripDAO.deleteCtrLocalCompn(infoVo.getReq_no());
		}
		
		// 출장자 저장
		CtrLocalTripCompnVO biztripPsnVo = vo.getBiztripPsnVo(); // 출장자
		biztripPsnVo.setReq_no(reqNo);
		ctrLocalTripDAO.insertCtrLocalCompn(biztripPsnVo);
		
		// 동반자저장		
		List<CtrLocalTripCompnVO> compnList = vo.getCompnList(); // 동반자
		for(CtrLocalTripCompnVO compnVo : compnList) {
			compnVo.setReq_no(reqNo);
			ctrLocalTripDAO.insertCtrLocalCompn(compnVo);
		}		
		
		// 03.총액 검증로직
		long payAmtSum = 0;
		for(CtrLocalTripCompnVO compnVo : ctrLocalTripDAO.selectCtrLocalAmt(infoVo)) {
			payAmtSum += compnVo.getPay_amt();
			ctrLocalTripDAO.updateCtrLocalAmt(compnVo);
		}
		
		// 근거리출장 총액 수정
		infoVo.setTot_expns(payAmtSum);
		infoVo.setTrafc_fee(payAmtSum);
		ctrLocalTripDAO.updateCtrLocalExpns(infoVo);
		
		// 04.원차량 사용안함일때(FDO001) 출장금액과 지급금액 일치 여부 확인
		if("FDO001".equals(infoVo.getCar_use_yn())){
			if(infoVo.getTot_expns() != payAmtSum){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.alert.ccs.ctr.0007");
			}
		}		
		
		// 06.예산통제모듈 호출
		// 이전 예산통제 모듈 삭제
		DelBblEnfrcVo delVo = new DelBblEnfrcVo();
		delVo.setReq_no(reqNo);
		finComService.deleteBudEnfrcMnt(delVo);
		
		if("U".equals(infoVo.getCud_type()) && !StringUtil.isEmpty(infoVo.getAccnt_no())){				
			BblenfrcVo enfrcVo = new BblenfrcVo();
			enfrcVo.setReq_no(infoVo.getReq_no()); 		
			enfrcVo.setReq_seq(1); 			
			enfrcVo.setReq_clsf("FBJ021"); 			    
			enfrcVo.setReq_ymd(infoVo.getReq_ymd()); 	    
			enfrcVo.setReq_psn(infoVo.getReq_psn_syspayno());		
			enfrcVo.setReq_dept(infoVo.getReq_dept());	
			enfrcVo.setReq_dept_new_ymd(infoVo.getReq_dept_new_ymd());
			enfrcVo.setAccnt_no(infoVo.getAccnt_no());		
			enfrcVo.setAccnt_cd(infoVo.getAccnt_cd());		
			enfrcVo.setExpns_cd(infoVo.getExpns_cd());		
			enfrcVo.setReq_amt(infoVo.getTot_expns());	
			String rmk = biztripPsnVo.getBiztrip_psn_nm() + " / " +  DateUtil.formatDate(infoVo.getBiztrip_ymd(), "-") + " / " + infoVo.getBiztrip_land();
			enfrcVo.setRmk(rmk.trim());
			enfrcVo.setRelat_no(infoVo.getAccnt_respn_psn_syspayno().substring(2,8));
			
			finComService.budEnfrcMnt01(enfrcVo);
			
			// 예산통제모듈 호출 후 통제번호 수정
			ctrLocalTripDAO.updateCtrLocalCtrlNo(enfrcVo);
			
			// 통제번호 수정(스냅샷에 통제번호 보여주기 위하여)
			infoVo.setBugt_ctrl_no(enfrcVo.getCtrl_no());
		}	
		
		if(infoVo.isApproval()){
    		this.approvalLocalTripReq(vo);
    	}
		  
		//결과 셋팅
		CtrTripSrcVo srcVo = new CtrTripSrcVo();
		srcVo.setReq_no(reqNo);
		
		return srcVo;
	}
	
	
    /**
     * 근거리출장을 삭제 한다
     * @param CtrLocalTripInfoVO
     * @throws Exception
     */
    @Override
    public void deleteCtrLocalTrip(CtrTripSrcVo vo) throws Exception {
    	//2024년 1월 1일 생성건부터 결의생성 연계
		if(!vo.getUnslip_no().isEmpty()){ 					
			FinAutoSlipCrtVo slipVo = new FinAutoSlipCrtVo();			
			slipVo.setUnslip_no(vo.getUnslip_no());			
			// 결의삭제
			localSlipService.deleteLocalTripSlip(slipVo);			
		}

    	// 출장정보 삭제
    	ctrLocalTripDAO.deleteCtrLocalInfo(vo.getReq_no());    	
    	
    	//출장원 삭제
    	ctrLocalTripDAO.deleteCtrLocalCompn(vo.getReq_no());
    	
		// 원인행위 삭제
		DelBblEnfrcVo enfrcVo = new DelBblEnfrcVo();
		enfrcVo.setReq_no(vo.getReq_no());
		finComService.deleteBudEnfrcMnt(enfrcVo);
		
		// 결재정보 삭제
		this.apprCommonService.deleteApr(vo.getReq_no());		
    }
	
	/**
     * 근거리출장정보를 조회 한다
     * @param Object
     * @throws Exception
     */
	@Override
	public CtrLocalTripVO selectCtrLocalTrip(CtrTripSrcVo vo) throws KitechException {
		CtrLocalTripVO retVo = new CtrLocalTripVO();
		// 근거리출장정보 조회
		CtrLocalTripInfoVO tripVo = ctrLocalTripDAO.selectCtrLocalTrip(vo.getReq_no());
		// FBV110 학회참석(논문발표)
		
		if("FBV110".equals(tripVo.getBiztrip_goal_clsf())){
			tripVo.setPool_conf_nm(tripDao.selectPoolConfNm(vo.getReq_no()));
		}
		retVo.setTripVo(tripVo);
		// 동반자 조회
		retVo.setCompnList(ctrLocalTripDAO.selectCtrLocalCompn(vo.getReq_no()));		
		// 반려의견 조회
		DocCommentsVo docVo = new DocCommentsVo();
		docVo.setReq_no(vo.getReq_no());
		docVo.setOpt_type("rejecttop");
		retVo.setDocList(apprCommonService.selectDocComments(docVo));			
		//사후결재 사유조회
		retVo.setPostAprVo(apprCommonService.selectAprAfterReason(vo.getReq_no()));		
		return retVo;
	}	
	
	/**
     * 최근계정을 조회 한다
     * @param Object
     * @throws Exception
     */
    @Override
    public List<Object> selectRecntAccnt(Object param) throws KitechException {
    	return ctrLocalTripDAO.selectRecntAccnt(param);
    }
    
    /**
     * 출장일수를 조회 한다
     * @param Object
     * @throws KitechException
     */
    @Override
    public List<CtrTripCurStnVo> selectTripPsnCount(CtrTripCurStnVo param) throws KitechException {    
    	// 출장대상일수 조회
    	int workDays = ctrLocalTripDAO.selectWorkDays(param);
    	param.setWork_days(workDays);
    	List<CtrTripCurStnVo> retVo = ctrLocalTripDAO.selectTripPsnCount(param);
    	retVo.get(0).setWork_days(workDays);
    	return retVo;
    }
    
    /**
    * 근거리 출장 결재전 회계코드 유무 체크
    * @param CheckSrcVo
    * @author LeeYH
    * @since 2022.08.30.
    */
    public CheckSrcVo getLocalTripAccntCd(CheckSrcVo vo) throws KitechException{	
    	Map<String,String> map = new HashMap<>();
		map.put("accnt_no", vo.getAccnt_no());
		map.put("expns_cd", vo.getExpns_cd());
		
    	String accntCd = ctrLocalTripDAO.selectAccntCdLocalTrip(map);
    	
    	if("none".equals(accntCd)){
    		throw new KitechException(Exceptions.ERROR, Business.CCS, "message.alert.ccs.ctr.0004");
    	}else{
    		vo.setAccnt_cd(accntCd);
    	}
    	
    	return vo;
    }
    	
    /**
    * 근거리 출장 근무일 체크
    * @param CheckSrcVo List<CtrLocalTripCompnVO>
    * @author LeeYH
    * @since 2022.08.29.
    */
	private void executeCtrDomeTripWorkTimeChk(CheckSrcVo vo, List<CtrLocalTripCompnVO> compnList) throws KitechException{
		int totDayCnt = 0;		
		
		String toDay = DateUtil.getCurrentDate();
		if (!toDay.substring(6, 8).equals("01")) {
			toDay = DateUtil.addDay(toDay, -1);
			
			vo.setYmd(toDay);
		}
		
		for(CtrLocalTripCompnVO compnVo : compnList){			
			if(compnVo.getCommute_cd().matches("HWT010|HWT040|HWT050")){ // HWT010 비관리, HWT040 시간선택제, HWT050 비상근근무제
				totDayCnt = 0;
			}else{
				vo.setCommute_cd(compnVo.getCommute_cd());
				// 전체일수, 휴무일수 조회
				BizTripHoliCntVo cntVo = ccsComDAO.selectBiztripHoliDayCnt(vo);
				totDayCnt = cntVo.getTotCnt();
			}
			
			if(totDayCnt == 0) continue;	
			
			// 근무시간현황 개괄 정보 조회
			vo.setSyspayno(compnVo.getBiztrip_psn_syspayno());
			WorkTimeVo timeVo = ccsComDAO.selectCwsWorkTimeStatus(vo);				
			
			if(timeVo == null) continue;
			
			double total_min = 0;
			double dayCnt = 0;
			int target_min = timeVo.getTarget_min() + timeVo.getExtend_min();
			int cur_work_min = timeVo.getCur_work_min() - timeVo.getCtr_extend_min();
			int wll_remain_min = timeVo.getWll_remain_min();			
			
			int arrivTime = Integer.parseInt(vo.getArriv_time().replace(":00", ""));
			int startTime = Integer.parseInt(vo.getStart_time().replace(":00", ""));
			
			dayCnt = (arrivTime - startTime) - Math.max(0, Math.min(13, arrivTime) - Math.max(12, startTime))
								- Math.max(0, Math.min(18.5, arrivTime) - Math.max(18, startTime));
								
			if("HWT020".equals(compnVo.getCommute_cd())){
				total_min = (dayCnt * 60) + cur_work_min + wll_remain_min - 180;
			}else{
				total_min = cur_work_min + (dayCnt * 60);
			}
			
			if(target_min < total_min && (startTime < 10 || arrivTime > 14)) {
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.alert.ccs.ctr.0006", new String[]{timeVo.getEmpnm()});
			}
		}		
	}
    
    /**
     * 근거리출장 결재신청
     * @param CtrLocalTripVO
     * @throws KitechException
     * @author LeeYH
     * @since 2022.08.28.
     */
    private void approvalLocalTripReq(CtrLocalTripVO vo){
    			
    	CtrLocalTripInfoVO infoVo = vo.getTripVo();
    	// 계정번호 (계정/출장비 없음)
    	if(StringUtil.isEmpty(infoVo.getAccnt_no())){
    		infoVo.setAccnt_no_use("Y");
    	}
    	
    	// 동행자수
    	List<CtrLocalTripCompnVO> compnList = vo.getCompnList();
    	if(compnList == null){
    		compnList = new ArrayList<CtrLocalTripCompnVO>();
    	}
    	infoVo.setCompn_cnt(compnList.size());
    	
    	// 지급내역
    	vo.setPayList(ctrLocalTripDAO.selectCtrLocalCompn(infoVo.getReq_no()));
    	
    	// 반려의견 조회
		DocCommentsVo docVo = new DocCommentsVo();
		docVo.setReq_no(infoVo.getReq_no());
		docVo.setOpt_type("rejecttop");
		vo.setDocList(apprCommonService.selectDocComments(docVo));			
		
		//사후결재 사유조회
		vo.setPostAprVo(apprCommonService.selectAprAfterReason(infoVo.getReq_no()));		
    	// 사후결재 여부
    	if(vo.getPostAprVo() != null && !StringUtil.isEmpty(vo.getPostAprVo().getReq_no())){
    		vo.getPostAprVo().setIs_apr_after(true);
    	}
    	
    	// 차량사용
		CodeVo codeVo = CodeCacheManager.getInstance().getCode("FDO", infoVo.getCar_use_yn());		
		infoVo.setCar_use_yn(codeVo.getComNm());
		// 출장목적
		codeVo =  CodeCacheManager.getInstance().getCode("FBV", infoVo.getBiztrip_goal_clsf());		
		infoVo.setBiztrip_goal_clsf(codeVo.getComNm());
		
    	String reqNo = infoVo.getReq_no();
    	
    	// 예산통제자 및 자동통제여부 조회
    	AprVo aprVo = new AprVo();
    	if(!StringUtil.isEmpty(infoVo.getAccnt_no()) && infoVo.getTrafc_fee() > 0){
	    	AutoBugtVo autoVo = new AutoBugtVo();	
			autoVo.setReq_no(reqNo);
			autoVo = finComService.getAccntAutoBugtPsn(autoVo);
			
			AppLog.debug("\n --------------------- autoVo : " + autoVo);
			aprVo.setAccountCharger(autoVo.getAccnt_rspns()); // 계정책임자
			aprVo.setBudgetController(autoVo.getBugt_ctrl_psn()); // 예산통제자
			aprVo.setAutoControlYn(autoVo.getBugt_auto_yn()); // 예산자동통제유무
		}
    	
		aprVo.setMainKey(reqNo);
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReqNo(reqNo);
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("C304");
		aprVo.setAmounts(String.valueOf(infoVo.getTot_expns()));
		
		String infoCd = infoVo.getBiztrip_land() + "/" 
						+ DateUtil.formatDate(infoVo.getBiztrip_ymd(), "-") + "/"
						+ infoVo.getStart_time() + "~" + infoVo.getArriv_time();
						
		aprVo.setInfoCd(infoCd);
		aprVo.setExt1Cd(infoVo.getAccnt_no());		
		aprVo.setHoliday("");			
		
		if(!"".equals(infoVo.getAttach_file_no())){
			vo.setFileList(attachDao.selectListAttach(infoVo.getAttach_file_no()));
		}		
		
		//2024년 1월 1일 생성건부터 결재신청시 결의생성 연계
		if(!infoVo.getBiztrip_ymd().substring(0, 4).equals("2023")){			
			FinAutoSlipCrtVo slipVo = new FinAutoSlipCrtVo();
			//결의건은 삭제후 진행
			if(!infoVo.getUnslip_no().isEmpty()){ 															
				slipVo.setUnslip_no(infoVo.getUnslip_no());			
				// 결의삭제
				localSlipService.deleteLocalTripSlip(slipVo);			
			}
			
			FinSpaSrcVo retVo = new FinSpaSrcVo();
			slipVo.setReq_no(reqNo);
			slipVo.setSlip_ymd(infoVo.getBiztrip_ymd());
			// 결의생성 호출
			retVo.setUnslip_no(localSlipService.saveLocalTripSlip(slipVo));			
		}
		
		AppLog.debug("\n --------------------- aprVo : " + aprVo);
		apprFuncService.approvalRequest(aprVo, vo);		
    }
}