package kr.re.kitech.biz.api.server.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.api.server.vo.ApiEipVo;
import kr.re.kitech.biz.apr.enums.AprMapper;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprStatusVo;
import kr.re.kitech.biz.apr.vo.AprWorkVo;
import kr.re.kitech.biz.apr.vo.IntfatabListVo;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * 포털 대응 서비스 (ApiEipApr - 결재 관련 데이터 전달)
 *
 * @author James
 * @since 2022. 6. 2.
 */
@Controller
public class BizEipAprController {

	@Resource(name="apprFuncServiceImpl")
    private ApprFuncService apprFuncService;   

	@Resource(name = "accntServiceImpl")
	private AccntService accntService;	
	
	/**
     * 시스템 사번으로 사용자아이디를 조회하는 내부 메소드
	 * @param syspayno
	 * @return
	 */
	private String findEndpointBySyspayno(String syspayno) {
		UserVo user = this.accntService.findUserIdBySyspayno(syspayno);
		return user.getUid();	
	}
	
	/**
	 * 전자결재 BPM 관련 리스트에 접근 URL을 담는다
	 * @param works
	 * @param serviceid
	 * @return
	 */
	private List<AprWorkVo> fillAprWorkUrlByServiceId(List<AprWorkVo> works, String serviceid) {
		if (null != works) {

			works.forEach(work -> {
				work.setAccessUrl( "?serviceid=" + serviceid + "&reqNo=" + work.getInstName() + "&endpoint=" + work.getEndpoint());
			});
						
			/*
			if ("A003".equals(serviceid)) {
				works.forEach(work -> {
					work.setAccessUrl( "/pop.jsp?w2xPath=/ui/apr/layoutSimple.xml&viewMode=read&reqNo=" + work.getInstName());
				});
			} else if ("A004".equals(serviceid)){
				works.forEach(work -> {
					work.setAccessUrl( "?serviceid=" + serviceid + "&reqNo=" + work.getInstName() + "&endpoint=" + work.getEndpoint());
				});
			}*/			
		}
		return works;
	}
	
	/**
	 * 전자결재 업무 관련(반려/작성중) 리스트에 접근 URL을 담는다
	 * @param works
	 * @param serviceid
	 * @return
	 */
	private List<IntfatabVo> fillIntfatabUrlByServiceId(List<IntfatabVo> works, String serviceid) {
		if (null != works) {
			works.forEach(work -> {
				work.setAccessUrl( "?serviceid=" + serviceid + "&reqNo=" + work.getReqNo() + "&endpoint=" + work.getEndpoints());
			});
		}
		return works;
	}	
	
	/**
     * 결재대기함 카운트
	 */
	@ElService(key = "ApiEipApprWaitCount")
    @RequestMapping(value = "ApiEipApprWaitCount")    
    @ElDescription(sub = "결재대기함 카운트", desc = "결재대기함 카운트를 조회한다.")
	@ElValidator(errUrl = "")               
    public ApiEipVo getApprWaitCount(ApiEipVo param) throws Exception {

		AprScVo sc = new AprScVo();
		sc.setEndpoint(this.findEndpointBySyspayno(param.getSyspayno()));
		sc.setProcClsf(AprMapper.FORM_APPROVAL.getCode());
		sc.setTool(AprMapper.FORM_APPROVAL.getCode());
		sc.setTaskStatus(AprMapper.TASK_NEW.getCode());
		
		int count = this.apprFuncService.searchTotCnt(sc);
    	param.setTotalCount(count);

        return param;
    }
 
 	/**
	 * 업무대기함 카운트
	 */
	@ElService(key = "ApiEipWorkWaitCount")
	@RequestMapping(value = "ApiEipWorkWaitCount")    
	@ElDescription(sub = "업무대기함 카운트", desc = "업무대기함 카운트를 조회한다.")
	@ElValidator(errUrl = "")               
	public ApiEipVo getWorkWaitCount(ApiEipVo param) throws Exception {

		AprScVo sc = new AprScVo();
		sc.setEndpoint(this.findEndpointBySyspayno(param.getSyspayno()));
		sc.setProcClsf(AprMapper.FORM_WORK.getCode());
		sc.setTool(AprMapper.FORM_WORK.getCode());
		sc.setTaskStatus(AprMapper.TASK_NEW.getCode());
		
		int count = this.apprFuncService.searchTotCnt(sc);
    	param.setTotalCount(count);

        return param;
    }
    

 	/**
	 * 결재진행함 카운트
	 */
	@ElService(key = "ApiEipApprRunningCount")
	@RequestMapping(value = "ApiEipApprRunningCount")    
	@ElDescription(sub = "결재진행함 카운트", desc = "결재진행함 카운트를 조회한다.")
	@ElValidator(errUrl = "")               
	public ApiEipVo getApprRunningCount(ApiEipVo param) throws Exception {

		AprScVo sc = new AprScVo();
		sc.setEndpoint(this.findEndpointBySyspayno(param.getSyspayno()));
		sc.setProcClsf(AprMapper.FORM_RUNNING.getCode());
		sc.setStatus(AprMapper.FORM_RUNNING.getCode());
		sc.setTaskStatus(AprMapper.TASK_NEW.getCode());
		
		int count = this.apprFuncService.searchTotCnt(sc);
    	param.setTotalCount(count);

        return param;
    }


	/**
	 * 결재완료함 카운트
	 */
	@ElService(key = "ApiEipApprCompletCount")
	@RequestMapping(value = "ApiEipApprCompletCount")    
	@ElDescription(sub = "결재완료함 카운트", desc = "결재완료함 카운트를 조회한다.")
	@ElValidator(errUrl = "")               
	public ApiEipVo getApprCompletCount(ApiEipVo param) throws Exception {

		AprScVo sc = new AprScVo();
		sc.setEndpoint(this.findEndpointBySyspayno(param.getSyspayno()));
		sc.setProcClsf(AprMapper.FORM_COMPLETE.getCode());
		sc.setStatus(AprMapper.FORM_COMPLETE.getCode());
		
		int count = this.apprFuncService.searchTotCnt(sc);
    	param.setTotalCount(count);

        return param;
    }


 	/**
	 * 결재반려함 카운트
	 */
	@ElService(key = "ApiEipApprRejectCount")
	@RequestMapping(value = "ApiEipApprRejectCount")    
	@ElDescription(sub = "결재반려함 카운트", desc = "결재반려함 카운트를 조회한다.")
	@ElValidator(errUrl = "")               
	public ApiEipVo getApprRejectCount(ApiEipVo param) throws Exception {
		
		AprStatusVo aprStatusVo = new AprStatusVo();
		aprStatusVo.setApr_state(AprState.WAIT_REJECT.getCode());
		
		List<AprStatusVo> aprStatusVoList = new ArrayList<>();
		aprStatusVoList.add(aprStatusVo);
		
		AprScVo sc = new AprScVo();
		sc.setEndpoint(this.findEndpointBySyspayno(param.getSyspayno()));
		sc.setAprStatusVo(aprStatusVoList);
		
		int count = this.apprFuncService.searchWorkTotCnt(sc);
    	param.setTotalCount(count);

        return param;
    }



	/**
	 * 작성중문서함 카운트
	 */
	@ElService(key = "ApiEipApprSavedCount")
	@RequestMapping(value = "ApiEipApprSavedCount")    
	@ElDescription(sub = "작성중문서함 카운트", desc = "작성중문서함 카운트를 조회한다.")
	@ElValidator(errUrl = "")               
	public ApiEipVo getApprSavedCount(ApiEipVo param) throws Exception {

		AprStatusVo aprStatusSave = new AprStatusVo();
		aprStatusSave.setApr_state(AprState.WAIT_SAVE.getCode());

		AprStatusVo aprStatusVoWrite = new AprStatusVo();
		aprStatusVoWrite.setApr_state(AprState.WAIT_WRITE.getCode());
		
		AprStatusVo aprStatusVoWithdraw = new AprStatusVo();
		aprStatusVoWithdraw.setApr_state(AprState.WAIT_WITHDRAW.getCode());

		List<AprStatusVo> aprStatusVoList = new ArrayList<>();
		aprStatusVoList.add(aprStatusSave);
		aprStatusVoList.add(aprStatusVoWrite);
		aprStatusVoList.add(aprStatusVoWithdraw);
		
		AprScVo sc = new AprScVo();
		sc.setEndpoint(this.findEndpointBySyspayno(param.getSyspayno()));
		sc.setAprStatusVo(aprStatusVoList);
		
		int count = this.apprFuncService.searchWorkTotCnt(sc);
    	param.setTotalCount(count);

        return param;
    }

    
    
    
	/**
	 * 결재대기함 리스트
	 */
	@ElService(key = "ApiEipApprWaitList")
	@RequestMapping(value = "ApiEipApprWaitList")    
	@ElDescription(sub = "결재대기함 리스트", desc = "결재대기함 리스트를 조회 한다.")
	@ElValidator(errUrl = "")               
	public ApiEipVo getApprWaitList(ApiEipVo param) throws Exception {
		
		AprScVo sc = new AprScVo();
		sc.setEndpoint(this.findEndpointBySyspayno(param.getSyspayno()));
		sc.setProcClsf(AprMapper.FORM_APPROVAL.getCode());
		sc.setTool(AprMapper.FORM_APPROVAL.getCode());
		sc.setTaskStatus(AprMapper.TASK_NEW.getCode());
		sc.setPageUnit(5);
		sc.setPageIndex(1);
		
		List<AprWorkVo> list = this.apprFuncService.searchAprList(sc);
		list = this.fillAprWorkUrlByServiceId( list, "A003");

		param.setTotalCount(null == list ? 0 : list.size());
		param.setAprWorkVoList(list);
		
		return param;
	}

	/**
	 * 업무대기함 리스트 조회
	 */
	@ElService(key = "ApiEipWorkWaitList")
	@RequestMapping(value = "ApiEipWorkWaitList")    
	@ElDescription(sub = "업무대기함 리스트 조회", desc = "업무대기함 리스트를 조회한다.")
	@ElValidator(errUrl = "")               
	public ApiEipVo getWorkWaitList(ApiEipVo param) throws Exception {
		
		AprScVo sc = new AprScVo();
		sc.setEndpoint(this.findEndpointBySyspayno(param.getSyspayno()));
		sc.setProcClsf(AprMapper.FORM_WORK.getCode());
		sc.setTool(AprMapper.FORM_WORK.getCode());
		sc.setTaskStatus(AprMapper.TASK_NEW.getCode());
		sc.setPageUnit(5);
		sc.setPageIndex(1);
		
		List<AprWorkVo> list = this.apprFuncService.searchAprList(sc);
		list = this.fillAprWorkUrlByServiceId( list, "A004");

		param.setTotalCount(null == list ? 0 : list.size());
		param.setAprWorkVoList(list);
		
		return param;
	}
	
	/**
	 * 결재진행함 리스트
	 */
	@ElService(key = "ApiEipApprRunningList")
	@RequestMapping(value = "ApiEipApprRunningList")    
	@ElDescription(sub = "결재진행함 리스트", desc = "결재진행함 리스트를 조회 한다.")
	@ElValidator(errUrl = "")               
	public ApiEipVo getApprRunningList(ApiEipVo param) throws Exception {
		
		AprScVo sc = new AprScVo();
		sc.setEndpoint(this.findEndpointBySyspayno(param.getSyspayno()));
		sc.setProcClsf(AprMapper.FORM_RUNNING.getCode());
		sc.setStatus(AprMapper.FORM_RUNNING.getCode());
		sc.setTaskStatus(AprMapper.TASK_NEW.getCode());
		sc.setPageUnit(5);
		sc.setPageIndex(1);
		
		List<AprWorkVo> list = this.apprFuncService.searchAprList(sc);
		list = this.fillAprWorkUrlByServiceId( list, "A005");
				
		param.setTotalCount(null == list ? 0 : list.size());
		param.setAprWorkVoList(list);
		
		return param;
	}

	/**
	 * 결재완료함 리스트 조회
	 */
	@ElService(key = "ApiEipApprCompletList")
	@RequestMapping(value = "ApiEipApprCompletList")    
	@ElDescription(sub = "결재완료함 리스트 조회", desc = "결재완료함 리스트를 조회한다.")
	@ElValidator(errUrl = "")               
	public ApiEipVo getApprCompletList(ApiEipVo param) throws Exception {
		
		AprScVo sc = new AprScVo();
		sc.setEndpoint(this.findEndpointBySyspayno(param.getSyspayno()));
		sc.setProcClsf(AprMapper.FORM_COMPLETE.getCode());
		sc.setStatus(AprMapper.FORM_COMPLETE.getCode());
		sc.setPageUnit(5);
		sc.setPageIndex(1);
		
		List<AprWorkVo> list = this.apprFuncService.searchAprList(sc);
		list = this.fillAprWorkUrlByServiceId( list, "A006");
		
		
		param.setTotalCount(null == list ? 0 : list.size());
		param.setAprWorkVoList(list);
		
		return param;
	}

    

 	/**
	 * 결재반려함 리스트
	 */
	@ElService(key = "ApiEipApprRejectList")
	@RequestMapping(value = "ApiEipApprRejectList")    
	@ElDescription(sub = "결재반려함 리스트", desc = "결재반려함 리스트를 조회한다.")
	@ElValidator(errUrl = "")               
	public IntfatabListVo getApprRejectList(ApiEipVo param) throws Exception {
		
		AprStatusVo aprStatusVo = new AprStatusVo();
		aprStatusVo.setApr_state(AprState.WAIT_REJECT.getCode());
		
		List<AprStatusVo> aprStatusVoList = new ArrayList<>();
		aprStatusVoList.add(aprStatusVo);
		
		AprScVo sc = new AprScVo();
		sc.setEndpoint(this.findEndpointBySyspayno(param.getSyspayno()));
		sc.setAprStatusVo(aprStatusVoList);
		
		List<IntfatabVo> list = this.apprFuncService.searchWorkList(sc);
		list = this.fillIntfatabUrlByServiceId( list, "A009");
		
		IntfatabListVo listVo = new IntfatabListVo();
		listVo.setTotalCount(null == list ? 0 : list.size());
    	listVo.setIntfatabListVo(list);

        return listVo;
    }



	/**
	 * 작성중문서함 리스트
	 */
	@ElService(key = "ApiEipApprSavedList")
	@RequestMapping(value = "ApiEipApprSavedList")    
	@ElDescription(sub = "작성중문서함 리스트", desc = "작성중문서함 리스트를 조회한다.")
	@ElValidator(errUrl = "")               
	public IntfatabListVo getApprSavedList(ApiEipVo param) throws Exception {

		AprStatusVo aprStatusSave = new AprStatusVo();
		aprStatusSave.setApr_state(AprState.WAIT_SAVE.getCode());

		AprStatusVo aprStatusVoWrite = new AprStatusVo();
		aprStatusVoWrite.setApr_state(AprState.WAIT_WRITE.getCode());
		
		AprStatusVo aprStatusVoWithdraw = new AprStatusVo();
		aprStatusVoWithdraw.setApr_state(AprState.WAIT_WITHDRAW.getCode());

		List<AprStatusVo> aprStatusVoList = new ArrayList<>();
		aprStatusVoList.add(aprStatusSave);
		aprStatusVoList.add(aprStatusVoWrite);
		aprStatusVoList.add(aprStatusVoWithdraw);
		
		AprScVo sc = new AprScVo();
		sc.setEndpoint(this.findEndpointBySyspayno(param.getSyspayno()));
		sc.setAprStatusVo(aprStatusVoList);
		
		List<IntfatabVo> list = this.apprFuncService.searchWorkList(sc);
		list = this.fillIntfatabUrlByServiceId( list, "A010");
		IntfatabListVo listVo = new IntfatabListVo();
		listVo.setTotalCount(null == list ? 0 : list.size());
    	listVo.setIntfatabListVo(list);

        return listVo;
    }
}

