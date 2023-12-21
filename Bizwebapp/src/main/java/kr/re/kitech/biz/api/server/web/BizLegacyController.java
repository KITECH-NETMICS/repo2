package kr.re.kitech.biz.api.server.web;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.meta.ElCustomNotifyUtil;

import kr.re.kitech.biz.api.server.vo.ApiBizVo;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;

/**
 * EIP2.0 대응 서비스 - 신규 BPM 엔진 연계
 *
 * 결재신청(생성): approvalRequest (AR)
 * 양식제출(상신): formSubmit (FS)
 * 양식승인(결재): formAccept (FA)
 * 양식반려(반려): formReject (FR)
 * 양식회수(회수): formCompensate (FC)
 * 양식위임(위임): formDelegate (FD)
 *
 * @author James
 * @since 2022. 6. 2.
 */
@Controller
public class BizLegacyController {

	@Resource(name="apprCommonServiceImpl")
    private ApprCommonService apprCommonService;
    
    @Resource(name = "apprFuncServiceImpl")	
    public ApprFuncService apprFuncService;


	/**
     * 레거시 결재신청(AR) 요청 -> EIP3 화면 전환
	 * 결재만 사용
	 */
	@ElService(key = "ApiRegacyAR")
    @RequestMapping(value = "ApiRegacyAR")    
    @ElDescription(sub = "결재신청 - 레거시(EIP2.0) 업무시스템에 제공", desc = "결재신청 처리 및 스냅샷 페이진 반환  - 레거시(EIP2.0) 업무시스템에 제공")
	@ElValidator(errUrl = "")               
    public ApiBizVo approvalRequest(AprVo aprVo) throws Exception {
		AppLog.debug("레거시 결재신청 요청 - 파라미터: " + aprVo);
		
		// 1. 파라미터를 오브젝트로 변환 : 맵으로 처립	'''''
		aprVo.setEndpoint(aprVo.getReqUid());
		
		// 이스케이프
		aprVo.setInfoCd( StringUtil.unescape(aprVo.getInfoCd()));
		
		// ext1Cd 가 있는 경우에만 unescape 처리
		if (StringUtils.isNotEmpty(aprVo.getExt1Cd())) {
			aprVo.setExt1Cd( StringUtil.unescape(aprVo.getExt1Cd()));
		}

		// 2. 전자결재 기능 메소드 호출 (결재신청): 결과값 필요.
		apprFuncService.approvalRequest(aprVo, aprVo.getSnap());

		// 3. 임시로직: approvalRequest 에서 반환해야함
		ApiBizVo apiBizVo = new ApiBizVo();
		apiBizVo.setSuccess(true);
		apiBizVo.setSnap(null);
		apiBizVo.setReqNo(null);

        return apiBizVo;
    }
    
	/**
	 * 레거시 Type2 양식제출(FS) - 인스턴스 생성 및 기안(상신)
	 * 업무만 공용사용
	 *
	 * @param apiBizVo
	 * @return
	 * @throws Exception
	 */
	@ElService(key = "ApiRegacyFS")
    @RequestMapping(value = "ApiRegacyFS")    
    @ElDescription(sub = "양식제출(상신) - 레거시(EIP2.0) 업무시스템에 제공", desc = "레거시 타입2 결재 상신 처리를 수행한다.  - 레거시(EIP2.0) 업무시스템에 제공")
	@ElValidator(errUrl = "")            
    public ApiBizVo approvalScreen(AprVo aprVo) throws Exception {    	
		AppLog.debug("레거시 양식승인(결재) 요청 - 파라미터: " + aprVo);

		// 이스케이프
		aprVo.setInfoCd( StringUtil.unescape(aprVo.getInfoCd()));
		aprVo.setEndpoint(aprVo.getReqUid());
		
		// ext1Cd 가 있는 경우에만 unescape 처리
		if (StringUtils.isNotEmpty(aprVo.getExt1Cd())) {
			aprVo.setExt1Cd( StringUtil.unescape(aprVo.getExt1Cd()));
		}
		
		// 1. BPM 승인(기안) 처리
		if (aprVo.getAprState().indexOf("XAD") == -1) {
			aprVo.setAprState("");
		}
		apprFuncService.approvalScreen(aprVo, aprVo.getSnap());
		
		// 3. 임시로직: approvalRequest 에서 반환해야함
		ApiBizVo apiBizVo = new ApiBizVo();
		apiBizVo.setSuccess(true);
		apiBizVo.setSnap(null);
		apiBizVo.setReqNo(null);
		
		return apiBizVo;    	
    }
    
	/**
	 * 레거시 Type2 결재승인(FA) - 승인(결재) -> 다음단계로  (biz -> FA) 
	 * 결재 | 업무 공용사용
	 *
	 * @param apiBizVo
	 * @return
	 * @throws Exception
	 */
	@ElService(key = "ApiRegacyFA")
    @RequestMapping(value = "ApiRegacyFA")    
    @ElDescription(sub = "양식승인(결재) - 레거시(EIP2.0) 업무시스템에 제공", desc = "레거시 타입2 승인 결재를 처리한다..  - 레거시(EIP2.0) 업무시스템에 제공")
	@ElValidator(errUrl = "")               
    public ApiBizVo formAccept(AprVo aprVo) throws Exception {
		AppLog.debug("레거시 양식승인(결재) 요청 - 파라미터: " + aprVo);

		// infoCd 가 있는 경우에만 unescape 처리
		if (StringUtils.isNotEmpty(aprVo.getInfoCd())) {
			aprVo.setInfoCd( StringUtil.unescape(aprVo.getInfoCd()));
		}
		
		// ext1Cd 가 있는 경우에만 unescape 처리
		if (StringUtils.isNotEmpty(aprVo.getExt1Cd())) {
			aprVo.setExt1Cd( StringUtil.unescape(aprVo.getExt1Cd()));
		}
		
		// 3. BPM 완료
		aprVo.setEndpoint(aprVo.getReqUid());
		apprFuncService.formAccept(aprVo);
		
		// 3. 임시로직: approvalRequest 에서 반환해야함
		ApiBizVo apiBizVo = new ApiBizVo();
		apiBizVo.setSuccess(true);
		apiBizVo.setSnap(null);
		apiBizVo.setReqNo(null);
		
        return apiBizVo;
    }
	/**
	 * 레거시 Type2 양식반려(FR) - 반려 요청 -> 이전단계로
	 *
	 * @param apiBizVo
	 * @return
	 * @throws Exception
	 */
	@ElService(key = "ApiRegacyFR")
	@RequestMapping(value = "ApiRegacyFR")    
	@ElDescription(sub = "양식반려(반려) - 레거시(EIP2.0) 업무시스템에 제공", desc = "레거시 타입2 결재 양식을 반려 처리한다. - 레거시(EIP2.0) 업무시스템에 제공")
	@ElValidator(errUrl = "")               
	public ApiBizVo formReject(ApiBizVo apiBizVo) throws Exception {
		AppLog.debug("레거시 양식반려(반려) 요청 - 파라미터: " + apiBizVo);
		
		// 3. 전자결재 반려
		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(apiBizVo.getReqNo());
		aprScVo.setEndpoint(apiBizVo.getReqUid());
		aprScVo.setAprState(apiBizVo.getAprState());
		aprScVo.setRejectYN(apiBizVo.getRejectYN());
		aprScVo.setSlipNo(apiBizVo.getSlipNo());
		aprScVo.setComments(apiBizVo.getComments());
		aprScVo.setActorName(apiBizVo.getActorName());
		apprFuncService.formReject(aprScVo);

		// 3. 임시로직: approvalRequest 에서 반환해야함
		apiBizVo.setSuccess(true);
		
		return apiBizVo;
	}
	
	
	/**
	 * 레거시 Type2 양식회수(FA) - 회수 요청 ( 미사용)
	 *
	 * @param apiBizVo
	 * @return
	 * @throws Exception
	 */
	@ElService(key = "ApiRegacyFC")
	@RequestMapping(value = "ApiRegacyFC")    
	@ElDescription(sub = "양식회수(회수) - 레거시(EIP2.0) 업무시스템에 제공", desc = "레거시 타입2 결재양식을 회수한다.- 레거시(EIP2.0) 업무시스템에 제공")
	@ElValidator(errUrl = "")               
	public ApiBizVo formCompensate(ApiBizVo apiBizVo) throws Exception {
		AppLog.debug("레거시 양식회수(회수) 요청 - 파라미터: " + apiBizVo);
		
		// 1. 파라미터를 오브젝트로 변환 : 맵으로 처립	'''''
		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(apiBizVo.getReqNo());
		aprScVo.setEndpoint(apiBizVo.getReqUid());
		aprScVo.setAprState(apiBizVo.getAprState());
		apprFuncService.formCompensate(aprScVo);
		
		// 3. 임시로직: approvalRequest 에서 반환해야함
		apiBizVo.setSuccess(true);
		
		return apiBizVo;
	}

	/**
	 * 레거시 Type2 양식 삭제 - deleteApr(삭제)
	 *
	 * @param apiBizVo
	 * @return
	 * @throws Exception
	 */
	@ElService(key = "ApiRegacyFD")
	@RequestMapping(value = "ApiRegacyFD")    
	@ElDescription(sub = "양식삭제 - 레거시(EIP2.0) 업무시스템에 제공", desc = "양식을 삭제산다..  - 레거시(EIP2.0) 업무시스템에 제공")
	@ElValidator(errUrl = "")               
	public ApiBizVo formDelete(ApiBizVo apiBizVo) throws Exception {
		AppLog.debug("레거시 양식삭제 요청 - 파라미터: " + apiBizVo);
		
		// 1. 파라미터를 오브젝트로 변환 : 맵으로 처립	'''''
		boolean isBpm = true;
		// BpmOnlyDel를 Y로 보내게 되면 BPM만 삭제
		if (StringUtils.equals("Y", apiBizVo.getBpmOnlyDel())) {
			isBpm = false;
		}
		apprFuncService.formRemove(apiBizVo.getReqNo(), apiBizVo.isEln(), isBpm);
		
		// 3.반환
		apiBizVo.setSuccess(true);
		
		return apiBizVo;
	}
	
	/**
	 * 레거시 담당자반려함 API 호출
	 *
	 * @param apiBizVo
	 * @return
	 * @throws Exception
	 */
	@ElService(key = "ApiRegacyRE")
	@RequestMapping(value = "ApiRegacyRE")    
	@ElDescription(sub = "담당자반려함 - 레거시(EIP2.0) 업무시스템에 제공", desc = "양식을 삭제산다..  - 레거시(EIP2.0) 업무시스템에 제공")
	@ElValidator(errUrl = "")               
	public ApiBizVo formAdminReject(ApiBizVo apiBizVo) throws Exception {
		AppLog.debug("레거시 양식위임(위임) 요청 - 파라미터: " + apiBizVo);
		
		// 1. 파라미터를 오브젝트로 변환 : 맵으로 처립	'''''
		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(apiBizVo.getReqNo());
		aprScVo.setEndpoint(apiBizVo.getReqUid());
		aprScVo.setAprState(apiBizVo.getAprState());
		aprScVo.setSlipNo(apiBizVo.getSlipNo());
		aprScVo.setComments(apiBizVo.getComments());
		aprScVo.setActorName(apiBizVo.getActorName());
		apprFuncService.formAuthReject(aprScVo);
		
		// 3.반환
		apiBizVo.setSuccess(true);
		
		return apiBizVo;
	}
	
	
	/**
	 * 스냅샷재생성
	 *
	 * @param apiBizVo
	 * @return
	 * @throws Exception
	 */
	@ElService(key = "ApiRegacyMS")
	@RequestMapping(value = "ApiRegacyMS")    
	@ElDescription(sub = "양식삭제 - 레거시(EIP2.0) 업무시스템에 제공", desc = "양식을 삭제산다..  - 레거시(EIP2.0) 업무시스템에 제공")
	@ElValidator(errUrl = "")               
	public ApiBizVo remakeSnapshot(AprVo aprVo) throws Exception {
		AppLog.debug("레거시 양식위임(위임) 요청 - 파라미터: " + aprVo);
		
		// 1. 파라미터를 오브젝트로 변환 : 맵으로 처립	'''''
		apprCommonService.makeSnapshot(aprVo.getReqNo(), aprVo.getSnap());
		
		// 3.반환
		ApiBizVo apiBizVo = new ApiBizVo();
		apiBizVo.setSuccess(true);
		apiBizVo.setSnap(null);
		apiBizVo.setReqNo(null);

        return apiBizVo;
	}
	
	/**
	 * 스냅샷재생성
	 *
	 * @param apiBizVo
	 * @return
	 * @throws Exception
	 */
	@ElService(key = "ApiRegacyReloadCodes")
	@RequestMapping(value = "ApiRegacyReloadCodes")    
	@ElDescription(sub = "코드리로드 - 레거시(EIP2.0) 업무시스템에 제공", desc = "공통코드를 리로드하여 캐싱한다.  - 레거시(EIP2.0) 업무시스템에 제공")
	@ElValidator(errUrl = "")               
	public ApiBizVo reloadCodes(AprVo aprVo) throws Exception {
		AppLog.debug("코드 리로딩 시작 SC", aprVo);    
		boolean isSuccess = ElCustomNotifyUtil.reloadCustomCacheManager(CodeCacheManager.class);
		AppLog.debug("코드 리로딩 종료", isSuccess);
		
		ApiBizVo apiBizVo = new ApiBizVo();
		apiBizVo.setSuccess(true);
	    return apiBizVo;
	}

	

}


