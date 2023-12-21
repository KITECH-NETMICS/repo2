package kr.re.kitech.biz.api.server.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.api.server.service.BizEipBizService;
import kr.re.kitech.biz.api.server.vo.ApiEipAnnPayProVo;
import kr.re.kitech.biz.api.server.vo.ApiEipBizListVo;
import kr.re.kitech.biz.api.server.vo.ApiEipCardPayProVo;
import kr.re.kitech.biz.api.server.vo.ApiEipCardUnproVo;
import kr.re.kitech.biz.api.server.vo.ApiEipDormReqVo;
import kr.re.kitech.biz.api.server.vo.ApiEipEduDeadlineVo;
import kr.re.kitech.biz.api.server.vo.ApiEipHumAppoVo;
import kr.re.kitech.biz.api.server.vo.ApiEipHumEducVo;
import kr.re.kitech.biz.api.server.vo.ApiEipHumEvalVo;
import kr.re.kitech.biz.api.server.vo.ApiEipHumRewardVo;
import kr.re.kitech.biz.api.server.vo.ApiEipMNoteVo;
import kr.re.kitech.biz.api.server.vo.ApiEipMRoomReqVo;
import kr.re.kitech.biz.api.server.vo.ApiEipPosiCompVo;
import kr.re.kitech.biz.api.server.vo.ApiEipPrjInfoVo;
import kr.re.kitech.biz.api.server.vo.ApiEipResReportVo;
import kr.re.kitech.biz.api.server.vo.ApiEipTripPayVo;
import kr.re.kitech.biz.api.server.vo.ApiEipTripUnproVo;
import kr.re.kitech.biz.api.server.vo.ApiEipVacaReqVo;
import kr.re.kitech.biz.api.server.vo.ApiEipVo;
import kr.re.kitech.biz.api.server.vo.ApiEipWrkGoalTimeVo;

/**
 * 포털 대응 서비스 (AipEipBiz - 업무 관련 데이터 전달)
 *
 * @author James
 * @since 2022. 6. 2.
 */
@Controller
public class BizEipBizController {

	@Resource(name="bizEipBizServiceImpl")
    private BizEipBizService bizEipBizService;   

	
	/**
     * 미처리회의록조회
	 */
	@ElService(key = "ApiEipMeetingNoteList")
    @RequestMapping(value = "ApiEipMeetingNoteList")    
    @ElDescription(sub = "미처리회의록조회", desc = "미처리회의록조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectFspmeetmnthList(ApiEipVo param) throws Exception {
		
		 List<ApiEipMNoteVo> list = bizEipBizService.selectFspmeetmnthList(param.getSyspayno());
    	 
    	 ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	 apiEipBizListVo.setApiEipMNoteVoList(list);
    	 
        return apiEipBizListVo;
    }
    
	/**
     * 작성회의록조회
	 */
	@ElService(key = "ApiEipMeetingNoteWriteList")
    @RequestMapping(value = "ApiEipMeetingNoteWriteList")    
    @ElDescription(sub = "작성회의록조회", desc = "작성회의록조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectMNoteWriteList(ApiEipVo param) throws Exception {
		
		 List<ApiEipMNoteVo> list = bizEipBizService.selectMNoteWriteList(param.getSyspayno());
    	 
    	 ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	 apiEipBizListVo.setApiEipMNoteVoList(list);
    	 
        return apiEipBizListVo;
    }
    
    /**
     * 교육마감일정
	 */
	@ElService(key = "ApiEipEduDeadLineList")
    @RequestMapping(value = "ApiEipEduDeadLineList")    
    @ElDescription(sub = "교육마감일정조회", desc = "교육마감일정조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectEduDeadLineList(ApiEipVo param) throws Exception {
		
		 List<ApiEipEduDeadlineVo> list = bizEipBizService.selectEduDeadLineList(param.getSyspayno());
    	 
    	 ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	 apiEipBizListVo.setApiEipEduDeadlineVo(list);
    	 
        return apiEipBizListVo;
    }
    
    /**
     * 회의실신청조회
	 */
	@ElService(key = "ApiEipMRoomReqList")
    @RequestMapping(value = "ApiEipMRoomReqList")    
    @ElDescription(sub = "회의실신청조회", desc = "회의실신청조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectMRoomReqList(ApiEipVo param) throws Exception {
		
		 List<ApiEipMRoomReqVo> list = bizEipBizService.selectMRoomReqList(param.getSyspayno());
    	 
    	 ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	 apiEipBizListVo.setApiEipMRoomReqVo(list);
    	 
        return apiEipBizListVo;
    }
    
     /**
     * 기숙사신신청조회
	 */
	@ElService(key = "ApiEipDormReqList")
    @RequestMapping(value = "ApiEipDormReqList")    
    @ElDescription(sub = "기숙사신신청조회", desc = "기숙사신신청조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectDormReqList(ApiEipVo param) throws Exception {
		
		 List<ApiEipDormReqVo> list = bizEipBizService.selectDormReqList(param.getSyspayno());
		 
    	 ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	 apiEipBizListVo.setApiEipDormReqVo(list);
    	 
        return apiEipBizListVo;
    }
    
     /**
     * 목표근무시간조회
	 */
	@ElService(key = "ApiEipWrkGoalTimeList")
    @RequestMapping(value = "ApiEipWrkGoalTimeList")    
    @ElDescription(sub = "목표근무시간조회", desc = "목표근무시간조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectWrkGoalTimeList(ApiEipVo param) throws Exception {
		
		 List<ApiEipWrkGoalTimeVo> list = bizEipBizService.selectWrkGoalTimeList(param.getSyspayno());
		 
    	 ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	 apiEipBizListVo.setApiEipWrkGoalTimeVo(list);
    	 
        return apiEipBizListVo;
    }
    
     /**
     * 출장정산시미처리조회
	 */
	@ElService(key = "ApiEipTripUnproList")
    @RequestMapping(value = "ApiEipTripUnproList")    
    @ElDescription(sub = "출장정산시미처리조회", desc = "출장정산시미처리조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectTripUnproList(ApiEipVo param) throws Exception {
		
		 List<ApiEipTripUnproVo> list = bizEipBizService.selectTripUnproList(param.getSyspayno());
		 
    	 ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	 apiEipBizListVo.setApiEipTripUnproVo(list);
    	 
        return apiEipBizListVo;
    }								

     /**
     * 카드정산시미처리조회
	 */
	@ElService(key = "ApiEipCardUnproList")
    @RequestMapping(value = "ApiEipCardUnproList")    
    @ElDescription(sub = "카드정산시미처리조회", desc = "카드정산시미처리조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectCardUnproList(ApiEipVo param) throws Exception {
		
		 List<ApiEipCardUnproVo> list = bizEipBizService.selectCardUnproList(param.getSyspayno());
		 
    	 ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	 apiEipBizListVo.setApiEipCardUnproVo(list);
    	 
        return apiEipBizListVo;
    }
    

    /**
     * 보직자재실집계현황조회  
	 */
	@ElService(key = "ApiEipPosiCompTotalList")
    @RequestMapping(value = "ApiEipPosiCompTotalList")    
    @ElDescription(sub = "보직자재실집계현황조회", desc = "보직자재실집계현황조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectPosiCompTotalList(ApiEipVo param) throws Exception {
		
		 List<ApiEipPosiCompVo> list = bizEipBizService.selectPosiCompTotalList(param.getDeptCd());
		 
    	 ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	 apiEipBizListVo.setApiEipPosiCompVo(list);
    	 
        return apiEipBizListVo;
    }	
    
     /**
     * 보직자재실현황조회 상세
	 */
	@ElService(key = "ApiEipPosiCompList")
    @RequestMapping(value = "ApiEipPosiCompList")    
    @ElDescription(sub = "보직자재실현황조회 상세", desc = "보직자재실현황 상세 조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectPosiCompList(ApiEipVo param) throws Exception {
		
		 List<ApiEipPosiCompVo> list = bizEipBizService.selectPosiCompList();
		 
    	 ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	 apiEipBizListVo.setApiEipPosiCompVo(list);
    	 
        return apiEipBizListVo;
    }
    
    
    
    
    
    /**
     * 과제정보조회
	 */
	@ElService(key = "ApiEipPrjInfoList")
    @RequestMapping(value = "ApiEipPrjInfoList")    
    @ElDescription(sub = "과제정보조회", desc = "과제정보조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectPrjInfo(ApiEipVo param) throws Exception {
		
		 List<ApiEipPrjInfoVo> list = bizEipBizService.selectPrjInfo(param.getSyspayno());
		 
    	 ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	 apiEipBizListVo.setApiEipPrjInfoVo(list);
    	 
        return apiEipBizListVo;
    }
    
    /**
     * 과제정보건수조회
	 */
	@ElService(key = "ApiEipPrjInfoCountList")
    @RequestMapping(value = "ApiEipPrjInfoCountList")    
    @ElDescription(sub = "과제정보건수조회", desc = "과제정보건수조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectAssiInfoCount(ApiEipVo param) throws Exception {
		
		 List<ApiEipPrjInfoVo> list = bizEipBizService.selectAssiInfoCount(param.getSyspayno());
		 
    	 ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	 apiEipBizListVo.setApiEipPrjInfoVo(list);
    	 
        return apiEipBizListVo;
    }
    
    /**
     * 출장현환결재진행조회
	 */
	@ElService(key = "ApiEipTripPayList")
    @RequestMapping(value = "ApiEipTripPayList")    
    @ElDescription(sub = "출장현환결재진행조회", desc = "출장현환결재진행조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectTripPayList(ApiEipVo param) throws Exception {
		
		 List<ApiEipTripPayVo> list = bizEipBizService.selectTripPayList(param.getSyspayno());
		 
    	 ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	 apiEipBizListVo.setApiEipTripPayVo(list);
    	 
        return apiEipBizListVo;
    }
    
    /**
     * 휴가신청내역
	 */
	@ElService(key = "ApiEipVacaReqList")
    @RequestMapping(value = "ApiEipVacaReqList")    
    @ElDescription(sub = "휴가신청내역", desc = "휴가신청내역 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectVacaReq(ApiEipVo param) throws Exception {
		
		 List<ApiEipVacaReqVo> list = bizEipBizService.selectVacaReq(param.getSyspayno());
		 
    	 ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	 apiEipBizListVo.setApiEipVacaReqVo(list);
    	 
        return apiEipBizListVo;
    }
    
     /**
     * 카드결제미처리현황
	 */
	@ElService(key = "ApiEipCardPayProList")
    @RequestMapping(value = "ApiEipCardPayProList")    
    @ElDescription(sub = "카드결제미처리현황", desc = "카드결제미처리현황 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectCardPayProList(ApiEipVo param) throws Exception {
		
		 List<ApiEipCardPayProVo> list = bizEipBizService.selectCardPayProList(param.getSyspayno());
		 
    	 ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	 apiEipBizListVo.setApiEipCardPayProVo(list);
    	 
        return apiEipBizListVo;
    }
    
     /**
     * 연차결재미처리현황
	 */
	@ElService(key = "ApiEipAnnPayProList")
    @RequestMapping(value = "ApiEipAnnPayProList")    
    @ElDescription(sub = "연차결재미처리현황", desc = "연차결재미처리현황 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectAnnPayProList(ApiEipVo param) throws Exception {
		
		List<ApiEipAnnPayProVo> list = bizEipBizService.selectAnnPayProList(param.getSyspayno());
		 
    	ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	apiEipBizListVo.setApiEipAnnPayProVo(list);
    	 
        return apiEipBizListVo;
    }
    
         /**
     * 교육이력현황
	 */
	@ElService(key = "ApiEipHumEducationLog")
    @RequestMapping(value = "ApiEipHumEducationLog")    
    @ElDescription(sub = "교육이력현황", desc = "교육이력현황 목록을 조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectHumEducationLogList(ApiEipVo param) throws Exception {
		
		List<ApiEipHumEducVo> list = bizEipBizService.selectHumEducationLogList(param.getSyspayno());
		
    	ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	apiEipBizListVo.setApiEipHumEducVo(list);
    	 
        return apiEipBizListVo;
    }
         /**
     * 발령사항현황
	 */
	@ElService(key = "ApiEipHumAppointLog")
    @RequestMapping(value = "ApiEipHumAppointLog")    
    @ElDescription(sub = "발령사항현황", desc = "발령사항현황 목록을 조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectHumAppointLogList(ApiEipVo param) throws Exception {
		
		List<ApiEipHumAppoVo> list = bizEipBizService.selectHumAppointLogList(param.getSyspayno());
		 
    	ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	apiEipBizListVo.setApiEipHumAppoVo(list);
    	 
        return apiEipBizListVo;
    }
         /**
     * 인사평가현황
	 */
	@ElService(key = "ApiEipHumEvaluationLog")
    @RequestMapping(value = "ApiEipHumEvaluationLog")    
    @ElDescription(sub = "인사평가현황", desc = "인사평가현황 목록을 조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectHumEvaluationLogList(ApiEipVo param) throws Exception {
		
		List<ApiEipHumEvalVo> list = bizEipBizService.selectHumEvaluationLogList(param.getSyspayno());
		 
    	ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	apiEipBizListVo.setApiEipHumEvalVo(list);
    	 
        return apiEipBizListVo;
    }
         /**
     * 상벌사항현황
	 */
	@ElService(key = "ApiEipHumRewardLog")
    @RequestMapping(value = "ApiEipHumRewardLog")    
    @ElDescription(sub = "상벌사항현황", desc = "상벌사항현황 목록을 조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectHumRewardLogList(ApiEipVo param) throws Exception {
		
		List<ApiEipHumRewardVo> list = bizEipBizService.selectHumRewardLogList(param.getSyspayno());
		 
    	ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	apiEipBizListVo.setApiEipHumRewardVo(list);
    	 
        return apiEipBizListVo;
    }	

     /**
     * 연구보고서 조회
	 */
	@ElService(key = "ApiEipResReport")
    @RequestMapping(value = "ApiEipResReport")    
    @ElDescription(sub = "연구보고서 조회", desc = "연구보고서 목록을 조회 한다.")
	@ElValidator(errUrl = "")               
    public ApiEipBizListVo selectResReportList(ApiEipResReportVo param) throws Exception {
		
		List<ApiEipResReportVo> list = bizEipBizService.selectResReportList(param);
		 
    	ApiEipBizListVo apiEipBizListVo = new ApiEipBizListVo();
    	 
    	apiEipBizListVo.setApiEipResReportVo(list);
    	 
    	return apiEipBizListVo;
    }	
}

