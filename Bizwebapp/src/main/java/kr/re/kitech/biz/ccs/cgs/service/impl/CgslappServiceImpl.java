package kr.re.kitech.biz.ccs.cgs.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.DocCommentsVo;
import kr.re.kitech.biz.ccs.cgs.dao.CgslappDAO;
import kr.re.kitech.biz.ccs.cgs.service.CgslappService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsSubHoliVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappAnalVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappInfoVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappPsnViewVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappReqInfoVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappSchVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappVo;
import kr.re.kitech.biz.ccs.com.dao.CcsComDAO;
import kr.re.kitech.biz.ccs.com.vo.BizTripHoliCntVo;
import kr.re.kitech.biz.ccs.com.vo.WorkTimeVo;
import kr.re.kitech.biz.ccs.ctr.vo.CheckSrcVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.CodeVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;


/**  
 * @ClassSubJect 휴가원 관련 처리를 담당하는 MyBatis Impl
 * @Class Name CgslappServiceImpl.java
 * @Description 휴가원  처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/05/03   박병목             최초생성
 * 
 * @author 박병목
 * @since 2022/05/03
 * @version 1.0
 * @see
 * 
 */
@Service("cgslappServiceImpl")
public class CgslappServiceImpl  extends EgovAbstractServiceImpl implements CgslappService {

    @Resource(name="cgslappDAO")
    private CgslappDAO cgslappDAO;
    
    @Resource(name="ccsComDAO")
    private CcsComDAO ccsComDAO;
    
    @Resource(name="attachDAO")
    private AttachDAO attachDao;
    
    @Resource(name="generationServiceImpl")
	private GenerationService generationService;
	
    @Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;
    
    @Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService;
	
	@Resource(name="accntServiceImpl")
	private AccntService accntServiceImpl;
	
	/**
    * 휴가원신청목록 조회
    * @param CgslappSchVo
    * @return  List<CgslappVo>
    * @author LeeYH
    * @since 2022.09.02.
    */
	public List<CgslappVo> selectListCgslapp(CgslappSchVo cgslappSchVo) throws ElException {
		return cgslappDAO.selectListCgslapp(cgslappSchVo);
	}

	/**
	 * 휴가원 상세조회를 한다.
	 * @param CgslappSchVo
	 * @return CgslappReqInfoVo
	 * @throws Exception
	 */
	public CgslappReqInfoVo selectCgslapp(CgslappSchVo vo) throws ElException {
		CgslappReqInfoVo retVo = new CgslappReqInfoVo();
		
		// 1) 휴가원 신청정보 조회
		CgslappVo lappVo = cgslappDAO.selectCgslapp(vo);
		retVo.setCgslappVo(lappVo);
		
		// 2) 개인 잔여연차일수, 보상휴가일수 조회
		vo.setSyspayno(lappVo.getReq_psn_syspayno());
		vo.setYear(lappVo.getHoliday_start_ymd().substring(0,4));
		CgslappAnalVo analVo = cgslappDAO.selectRemidrAnalQty(vo);
		
		// 3) 휴가원신청-미승인연차일수
		if(analVo == null){
			analVo = new CgslappAnalVo();
		}
		analVo.setNo_apr_qty(cgslappDAO.selectCgsLappNoAprCnt(vo));
		
		// 4) [단건] 당해년도의 가족돌봄휴가, 병가 상신이후 상태의 카운트 조회
		CgslappInfoVo rstVo = cgslappDAO.selectCgsUsedQty(vo.getSyspayno());
		if(rstVo != null){
			analVo.setSick_cnt(rstVo.getUse_sck_days());
			analVo.setCare_cnt(rstVo.getUse_chd_days());
		}
		
		retVo.setCgslappAnalVo(analVo);
		
		//사후결재 사유조회
		retVo.setPostAprVo(apprCommonService.selectAprAfterReason(vo.getReq_no()));		    	
		
        return retVo;
	}
	
	/**
	 * 개인 잔여연차일수 조회, 휴가원신청-미승인연차일수
	 * @param CgslappSchVo
	 * @return CgslappAnalVo
	 * @throws Exception
	 */
	public CgslappAnalVo selectRemidrAnalQty(CgslappSchVo vo) throws ElException {
		// 1) 개인 잔여연차일수,보상일수 조회
		CgslappAnalVo retVo = cgslappDAO.selectRemidrAnalQty(vo);
		
		// 2) 휴가원신청-미승인연차일수
		retVo.setNo_apr_qty(cgslappDAO.selectCgsLappNoAprCnt(vo));		
		
		// 3) [단건] 당해년도의 가족돌봄휴가, 병가 상신이후 상태의 카운트 조회
		CgslappInfoVo rstVo = cgslappDAO.selectCgsUsedQty(vo.getSyspayno());
		if(rstVo != null){
			retVo.setSick_cnt(rstVo.getUse_sck_days());
			retVo.setCare_cnt(rstVo.getUse_chd_days());
		}
		
        return retVo;
	}
	
	/**
	 * 개인 잔여연차일수 조회(팝업)
	 * @param CgslappSchVo
	 * @return CgslappAnalVo
	 * @throws Exception
	 */
	public CgslappAnalVo selectRemidrAnalQtyPop(CgslappSchVo vo) throws ElException{
		return cgslappDAO.selectRemidrAnalQty(vo);
	}

	/**
	 * 근무일수 조회
	 * @param CgslappSchVo
	 * @return CgslappAnalVo
	 * @throws Exception
	 */
	public int selectWorkDays(CgslappSchVo cgslappSchVo) throws ElException {
        return cgslappDAO.selectWorkDays(cgslappSchVo);
	}	
	
	/**
	 * 연차 사용내역 조회(팝업)
	 * @param CgslappSchVo
	 * @return CgslappInfoVo
	 * @throws Exception
	 */
	public CgslappPsnViewVo selectPsnHoliInfo(CgslappSchVo cgslappSchVo) throws ElException {
        CgslappPsnViewVo retVo = new CgslappPsnViewVo();
		// 개인정보
		retVo.setHumVo(cgslappDAO.selectHumInfo(cgslappSchVo.getSyspayno()));		
		//연차형황 조회
		retVo.setLappInfoVo(cgslappDAO.selectPsnLappInfo(cgslappSchVo));
		// 휴가사용내역
		retVo.setHoliList(cgslappDAO.selectLappInfo(cgslappSchVo));
		// 휴가공제내역
		retVo.setDedctList(cgslappDAO.selectDedctList(cgslappSchVo));
		//보상휴가 적립내역
		retVo.setRewrdList(cgslappDAO.selectCreComList(cgslappSchVo));
        return retVo;
	}	
	
	/**
	 * 병가 휴가원신청중 증빙 미등록건 조회
	 * @param CgslappSchVo
	 * @return int
	 * @throws Exception
	 */
	public int selectLappNoFileCnt(CgslappSchVo cgslappSchVo) throws ElException {
        return cgslappDAO.selectLappNoFileCnt(cgslappSchVo);
	}
	
	/**
	 * 휴가원 신청 저장
	 * @param CgslappReqInfoVo
	 * @return CgslappAnalVo
	 * @throws Exception
	 */
	public CgslappSchVo saveCgsLapp(CgslappReqInfoVo vo) throws Exception {
		CgslappSchVo srcVo = new CgslappSchVo();
		
		CgslappVo lapVo = vo.getCgslappVo();
		
		if( StringUtils.equals("HBI031", lapVo.getHoliday_clsf()) ){
			lapVo.setHoliday_cls_ymd(lapVo.getHoliday_start_ymd());
		}
		
		if("C".equals(lapVo.getCud_type())) {
			if (lapVo.getHoliday_clsf().matches("HBI040|HBI041|HBI042")) { // 임산부정기건강진단(오전/오후), 임산부정기건강진단(통합)
				srcVo.setReq_psn_syspayno(lapVo.getReq_psn_syspayno());
				srcVo.setHoliday_clsf("HBI042");
			} else {
				srcVo.setHoliday_clsf("HBI042");
			}
			
			Map<String, String> map = cgslappDAO.selectCgsLappExistChk(lapVo);	
			
			// 시간제 연차 유효성 체크 로직 제외
			if (!lapVo.getHoliday_clsf().matches("HBI019|HBI080|HBI042") && map != null) {
				String reqNo = map.get("req_no");
				String errorInfo = "";
				AprState aprState = AprState.getAprState(map.get("apr_state"));
				switch (aprState) {
					case WAIT_SAVE: // 저장중
					case WAIT_WRITE: // 작성중
						errorInfo = "해당일에 이미 작성 중인 문서 " + reqNo + "가 있습니다. [작성중문서함]에서 먼저 작업하십시오.";
						break;
					case WAIT_WITHDRAW: // 회수
						errorInfo = "해당일에 이미 작성 중인 문서 " + reqNo + "가 있습니다. [결재회수함]에서 먼저 작업하십시오.";
						break;
					case WAIT_REJECT: // 반려
						errorInfo = "해당일에 이미 작성 중인 문서 " + reqNo + "가 있습니다. [결재반려함]에서 먼저 작업하십시오.";
						break;
					default:
						errorInfo = "해당 일자에는 신청번호 : " + reqNo + "로 현재 작성되어 [" + aprState.getTitle() + "] 중에 있습니다.\n 확인이 안될 경우 시스템 문의 부탁드립니다.";
					}
					throw new KitechException(Exceptions.ERROR, Business.CCS, errorInfo);
			} else {
				lapVo.setReq_no(generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C55"));				
			}
			// 등록
			cgslappDAO.insertCgslapp(lapVo);
			
			// 인터페이스 테이블 저장
			apprFuncService.formInit(lapVo.getReq_no(), "C21A", "");
			
		} else if ("U".equals(lapVo.getCud_type())) {
			cgslappDAO.updateCgslapp(lapVo);
		}
		
		if(lapVo.isApproval()){
    		this.approvalLappReq(vo);
    	}
		
		// 저장시 req_no 화면에 넘겨주기
		srcVo.setReq_no(lapVo.getReq_no());
		return srcVo;
	}
	
	/**
	 * 휴가원 신청 시간제 연차 결재신청전 체크
	 * @param CgslappReqInfoVo
	 * @return CgslappAnalVo
	 * @throws Exception
	 */
	public void executeCgsLappWorkTimeChk(CgslappVo appVo) throws ElException {	
		if(!"HWT020".equals(appVo.getCommute_cd())) return;		
		
		CheckSrcVo vo = new CheckSrcVo();
		String toDay = DateUtil.getCurrentDate();
		if (!toDay.substring(6, 8).equals("01")) {
			toDay = DateUtil.addDay(toDay, -1);
			
			vo.setYmd(toDay);
		}
		
		int flag = 0;
		
		double holidayStartHour = appVo.getHoliday_start_hour();
		double holidayClsHour = appVo.getHoliday_cls_hour();
			
		vo.setCommute_cd(appVo.getCommute_cd()); // HWT020
		// 전체일수, 휴무일수 조회
		BizTripHoliCntVo cntVo = ccsComDAO.selectBiztripHoliDayCnt(vo);
		int holiDayCnt = cntVo.getHoliDayCnt();
		int totDayCnt = cntVo.getTotCnt();
		
		int target_min = 0;
		int total_min = 0;
		
		if(totDayCnt > 0){	
			// 근무시간현황 개괄 정보 조회
			vo.setSyspayno(appVo.getReq_psn_syspayno());
			WorkTimeVo timeVo = ccsComDAO.selectCwsWorkTimeStatus(vo);				
			
			if(timeVo != null){	
				target_min = timeVo.getTarget_min();
				int cur_work_min = timeVo.getCur_work_min();
				int wll_remain_min = timeVo.getWll_remain_min();				
				
				if(holidayClsHour > 0 && holidayStartHour > 0){
					double tempTime1 = (holidayClsHour - holidayStartHour) - Math.max(0F, Math.min(13, holidayClsHour) - Math.max(12, holidayStartHour)) // 점심휴게시간 제외
								- Math.max(0F, Math.min(18.5, holidayClsHour) - Math.max(18, holidayStartHour)); // 저녁휴게시간 제외
		
					// 집중근무시간이 점심휴게시간을 포함하므로 감산하지 않음
					double tempTime2 = (holidayClsHour - holidayStartHour) - Math.max(0F, Math.min(14, holidayClsHour) - Math.max(10, holidayStartHour)) // 집중근무시간 제외
							- Math.max(0F, Math.min(18.5, holidayClsHour) - Math.max(18, holidayStartHour)); // 저녁휴게시간 제외
							
					total_min = cur_work_min + wll_remain_min + ((int) (Math.round(tempTime2 * 10) / 10.0) * 60);
					
				}else{
					totDayCnt = totDayCnt - holiDayCnt; // 실제 워크 데이 계산
					total_min = cur_work_min + wll_remain_min + (totDayCnt * 300); // 워크데이 하루당 (5=8-3)시간을 더함
				}				
			}
		} // totDayCnt > 0
		
		// 근무시간이 초과되더라도 시간제연차, 보상휴가 집중근무시간만 예외적으로 허용.
		if(appVo.getHoliday_clsf().matches("HBI019|HBI080") && holidayStartHour >= 10 && holidayClsHour <= 14){
			flag = 1;
		}
		
		// 2020-03-05, James, 경조, 병가, 공가, 공가-코로나19 의 경우는 근무시간을 체크하지 않는다 - 장사랑 요청
		if (Arrays.asList(new String[] { "HBI001", "HBI008", "HBI009", "HBI100" }).contains(appVo.getHoliday_clsf())) {
			flag = 1;
		}
		
		if(target_min < total_min && flag == 0) {
			int overTime = (total_min - target_min);
			throw new KitechException(Exceptions.ERROR, Business.CCS, "message.alert.ccs.cgs.0002", new String[]{appVo.getReq_psn_dept_nm(), this.minToHHmm(overTime)});
		}
	}
	
	/**
	 * 휴가원 결재신청
	 * @param CgslappReqInfoVo
	 * @return CgslappAnalVo
	 * @throws Exception
	 */
	private void approvalLappReq(CgslappReqInfoVo vo) throws Exception {	
		// 사후결재 여부
    	if(vo.getPostAprVo() != null && !StringUtil.isEmpty(vo.getPostAprVo().getReq_no())){
    		vo.getPostAprVo().setIs_apr_after(true);
    	}    
    	
    	CgslappVo infoVo = vo.getCgslappVo();	
    	// 입사일자
    	infoVo.setEntr_ymd(DateUtil.formatDate(infoVo.getEntr_ymd(), "-"));
    	// 가족돌봄휴가
    	CodeVo codeVo = null;
    	if(infoVo.getCare_relation() != null && !"".equals(infoVo.getCare_relation())){
			codeVo = CodeCacheManager.getInstance().getCode("CFR", infoVo.getCare_relation());		
			infoVo.setCare_relation(codeVo.getComNm());
		}
		infoVo.setCare_birth_ymd(DateUtil.formatDate(infoVo.getCare_birth_ymd(), "-"));
		
		String beforeReMain = infoVo.getHoliday_before_remain();
		String afterReMain = infoVo.getRemain_holiday();
		
		// 휴가기간
		String period = DateUtil.formatDate(infoVo.getHoliday_start_ymd(), "-");
		if(infoVo.getHoliday_clsf().matches("HBI019|HBI042|HBI080")){
			period += " " + infoVo.getLbl_start_hour() + " ~ " + infoVo.getLbl_cls_hour();
		}else{
			period += " ~ " +  DateUtil.formatDate(infoVo.getHoliday_cls_ymd(), "-");
			
			// 신청전 잔여연차
			infoVo.setHoliday_before_remain(beforeReMain.substring(0, beforeReMain.indexOf("(")));
			// 신청후 잔여연차
			infoVo.setRemain_holiday(afterReMain.substring(0, afterReMain.indexOf("(")));
		}		
		period += " (" + infoVo.getHoliday_daycnt() + "일";
		if(infoVo.getHoliday_clsf().matches("HBI019|HBI042|HBI080")){
			period += "/" + infoVo.getHoliday_hour() + "시간";
		}
		period += ")"; 		
		
		// 휴가기간
		infoVo.setHoliday_prd(period);	
		
		// 백신
		if(!StringUtil.isEmpty(infoVo.getVaccine())){
			codeVo = CodeCacheManager.getInstance().getCode("CBC", infoVo.getVaccine());
			infoVo.setVaccine(codeVo.getComNm());
		}
		// 백신접종사유
		if(!StringUtil.isEmpty(infoVo.getVac_cause())){
			codeVo = CodeCacheManager.getInstance().getCode("CBA", infoVo.getVac_cause());
			infoVo.setVac_cause(codeVo.getComNm());
		}
		// 백신종류
		if(!StringUtil.isEmpty(infoVo.getVac_gb())){
			codeVo = CodeCacheManager.getInstance().getCode("CBS", infoVo.getVac_gb());
			infoVo.setVac_gb(codeVo.getComNm());
		}
		// 접종시기
		if(!StringUtil.isEmpty(infoVo.getVac_date())){
			codeVo = CodeCacheManager.getInstance().getCode("CBD", infoVo.getVac_date());
			infoVo.setVac_date(codeVo.getComNm());
		}
    	
    	// 결재정보
    	AprVo aprVo = new AprVo();
    	aprVo.setMainKey(infoVo.getReq_no());
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReqNo(infoVo.getReq_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("C21A");
		aprVo.setAmounts("0");	
		aprVo.setRepReason(infoVo.getRepReason());
		aprVo.setHolidayClsf(infoVo.getHoliday_clsf());
		aprVo.setHolidayPsn(infoVo.getReq_psn_syspayno());
		aprVo.setExt2Cd(infoVo.getHoliday_clsf_nm());
		
		List<UserVo> userVoList = accntServiceImpl.findUsersByRoleCodes(new String[]{"1006215"});
		
		aprVo.setAutoCmpltMan(userVoList != null ? userVoList.get(0).getSn() : "");
		if(infoVo.getHoliday_clsf().matches("HBI006|HBI019|HBI031|HBI080")){ //연차/시간제연차/보상휴가/건강검진휴가
			aprVo.setAutoControlYn("Y");
		}else{
			aprVo.setAutoControlYn("N");
		}
		aprVo.setRuleType(infoVo.getRule_type_cd());
		aprVo.setRuleMoney(infoVo.getRule_money_cd());		
		
		// infoCd setting
		String infoCd = infoVo.getReq_psn_nm() + "/" + infoVo.getHoliday_clsf_nm() 
				+ " : " + infoVo.getHoliday_start_ymd();
				
		if(infoVo.getHoliday_clsf().matches("HBI019|HBI042|HBI080")){
			infoCd += " " + infoVo.getLbl_start_hour() + " ~ " + infoVo.getLbl_cls_hour();
		}else{
			infoCd += " ~ " + infoVo.getHoliday_cls_ymd();
		}		
		infoCd += " (" + infoVo.getHoliday_daycnt() + "일";
		if(infoVo.getHoliday_clsf().matches("HBI019|HBI042|HBI080")){
			infoCd += "/" + infoVo.getHoliday_hour() + "시간";
		}
		infoCd += ")"; 	
						
		aprVo.setInfoCd(infoCd);		
		
		// 첨부파일
		if(!"".equals(infoVo.getAttach_file_no())){
			vo.setFileList(attachDao.selectListAttach(infoVo.getAttach_file_no()));
		}		
		
		apprFuncService.approvalRequest(aprVo, vo);		
    	
	}
	
	/**
	 * 휴가원 증빙자료 저장
	 * @param CgslappVo
	 * @return CgslappAnalVo
	 * @throws Exception
	 */
	public void updateCgsLappEvid(CgslappVo cgslappVo){				
		cgslappDAO.updateCgsLappEvid(cgslappVo);	   		
	}
	
	/**
	 * 개인연차조회 팝업에서 저장연차 저장
	 * @param CgslappVo
	 * @return int
	 * @throws Exception
	 */
	public void updateCgsLappSaveAnal(CgslappVo vo) throws ElException {
		cgslappDAO.updateCgslappSaveAnal(vo);
	}

	/**
	 * 휴가원 신청 삭제
	 * @param CgslappVo
	 * @return int
	 * @throws Exception
	 */
	public void deleteCgslapp(CgslappSchVo vo) throws Exception {
		// 신청서 삭제
		cgslappDAO.deleteCgslapp(vo);
		
		// 결재정보 삭제
		apprFuncService.formRemove(vo.getReq_no());
	}
	
	/**
    * 대체휴일 등록 - 휴일포함 출장에서 휴일구분을 업무로 지정할 때 휴일을 대체할 일자를 휴가원으로 처리
    *           - 중복검증: 공휴일/휴무일, 기존 휴가원, 기존 출장(근거리/국내/해외) 기간 점검 - 중복 시 Exception 발생
    * @param List<CgsSubHoliVo>
    * @author LeeYH
    * @since 2022.06.28.
    */
	public void registerSubsHoliday(List<CgsSubHoliVo> holiList) throws ElException{
		// 기존 휴가원(대체휴일) 삭제(국내출장은 업무화면에서 삭제
		if(!"C86".equals(holiList.get(0).getCtr_req_no())){
			this.deleteCgsLapp(holiList.get(0).getCtr_req_no());
		}
		
		for(CgsSubHoliVo vo : holiList){
			// 대체휴일 중복 체크
			List<Map<String,String>> list = cgslappDAO.selectLappDuplChk(vo);
			if(list != null && list.size() > 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, list.get(0).get("msg"));
			}
			
			vo.setReq_no(generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C55"));
			if(cgslappDAO.insertCgsLappSub(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"대체휴가원 등록"});
			}
		}
	}
	
	/**
     * 기존 대체휴가원 삭제(출장신청등에서 호출)
     * @param CgsSubHoliVo
     * @return int
     * @throws ElException
     * @author LeeYH
     * @since 2022.06.28.
     */
	public int deleteCgsLapp(String ctrlReqNo) throws ElException{
		return cgslappDAO.deleteCgsLapp(ctrlReqNo);
	}
	
	private String minToHHmm(int minutes) {
		long hours = TimeUnit.MINUTES.toHours(Long.valueOf(minutes));
		long remainMinutes = minutes - TimeUnit.HOURS.toMinutes(hours);
		return String.format("%02d:%02d", hours, remainMinutes);
	}
	
	/**
     * 휴가원 증빙자료 팝업 조회
     * @param CgslappSchVo
     * @return CgslappReqInfoVo
     * @throws ElException
     * @author LeeYH
     * @since 2022.09.14.
     */
	public CgslappReqInfoVo selectCgsLappEvid(CgslappSchVo vo) throws ElException {
		CgslappReqInfoVo retVo = new CgslappReqInfoVo();
		// 휴가원 정보조회
		retVo.setCgslappVo(cgslappDAO.selectCgsLappEvid(vo.getReq_no()));
		
		// 반려의견 조회
		DocCommentsVo docVo = new DocCommentsVo();
		docVo.setReq_no(vo.getReq_no());
		docVo.setOpt_type("rejecttop");
		retVo.setDocList(apprCommonService.selectDocComments(docVo));		
		return retVo;
	}
}
