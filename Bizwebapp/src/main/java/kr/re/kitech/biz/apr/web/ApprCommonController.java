/**
 * 
 */
package kr.re.kitech.biz.apr.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.FormBasicService;
import kr.re.kitech.biz.apr.vo.AppFormVo;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.DocCommentsListVo;
import kr.re.kitech.biz.apr.vo.DocCommentsVo;
import kr.re.kitech.biz.apr.vo.PostAprVo;

/**
 * 
 * @author James
 * @since 2022. 6. 3.
 */
@Controller
public class ApprCommonController {

    @Resource(name="apprCommonServiceImpl")
    private ApprCommonService apprCommonService;
    
    @Resource(name="formBasicServiceImpl")
    private FormBasicService formBasicService;
    
    @Resource(name = "apprFuncServiceImpl")
    private ApprFuncService apprFuncService;
        
	/**
	 * 스냡샷 뷰잉
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcGetSnapshot")
	@RequestMapping(value = "SvcGetSnapshot")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "스냅샷을 조회한다.", desc = "스냅샷을 조회한다.")
	public AprScVo viewSnapshot(HttpServletRequest request, AprScVo sc) throws Exception {
		AprScVo aprScVo = new AprScVo();

		AppLog.debug("AprScVo: " + sc);

		// 2. 스냅샷 디렉토리에서 동적으로 조회
		String html = this.apprCommonService.getSnapshot(sc);
		AppLog.debug(html);
		aprScVo.setHtml(html);
		
		// 3. Title, 결재자 기본정보 등 기본적으로 필요한 항목은 리스트 및 BPM GET을 통하여 조회
		AppFormVo appFormVo = new AppFormVo();
		appFormVo = apprCommonService.getSnapshotBaseInfo(sc);
		
		aprScVo.setAuditRolesSn(appFormVo.getAuditRolesSn());
		aprScVo.setAppname(appFormVo.getAppname());
		aprScVo.setTaskName(appFormVo.getTaskname());
		aprScVo.setAprUserVo(appFormVo.getAprUserVo());
		aprScVo.setApprEditable(appFormVo.isApprEditable());
		aprScVo.setLinetype(appFormVo.getLinetype());
		
		aprScVo.setProcDefAlias(appFormVo.getProcDefAlias());
		
		//사용자별 전결타입구분
		aprScVo.setApprvConfigYn(appFormVo.getApprvConfigYn());
		
		// appv_applicationmap 조회 하여 URL 세팅
		aprScVo.setRegulationUrl(appFormVo.getRegulationUrl());
		// 전결타입 및 금액 세팅
		aprScVo.setRuleType(appFormVo.getRuleType());
		aprScVo.setRuleMoney(appFormVo.getRuleMoney());
		// 회수 가능여부
		aprScVo.setWithDrawYn(appFormVo.getWithDrawYn());
		// 사전안전성검토유무
		aprScVo.setSafeYn(appFormVo.getSafeYn());
		
		// TODO: 4. 사후 결재 정보 조회
		
		// TODO: 5. 결재의견 조회하는 로직 협의 필요.
		
		
		return aprScVo;
	}
	
	@ElService(key = "SvcConfirmPostApr")
	@RequestMapping(value = "SvcConfirmPostApr")
	@ElDescription(sub = "사후결재여부 조회", desc = "결재신청전 사후결재여부를 조회한다.")
	@ElValidator(errUrl = "")
	public PostAprVo confirmPostApr(PostAprVo vo) throws Exception{
		return apprCommonService.confirmPostApr(vo);
	}
	
	@ElService(key = "SvcComAprComR01")
	@RequestMapping(value = "SvcComAprComR01")
	@ElDescription(sub = "사후결재 사유 조회", desc = "사후결재 사유를 조회한다.")
	@ElValidator(errUrl = "")
	public PostAprVo selectAprAfterReason(PostAprVo vo) throws Exception{
	    PostAprVo retVo = apprCommonService.selectAprAfterReason(vo.getReq_no());
		return (retVo == null)? vo : retVo;
	}
	
	@ElService(key = "SvcComAprComM01")
	@RequestMapping(value = "SvcComAprComM01")
	@ElDescription(sub = "사후결재 사유 저장", desc = "결재신청전 사후결재사유를 저장한다.")
	@ElValidator(errUrl = "")
	public void saveAprAfterReason(PostAprVo vo) throws Exception{
		apprCommonService.saveAprAfterReason(vo);
	}
	
	@ElService(key = "SvcComAprDocM01")
	@RequestMapping(value = "SvcComAprDocM01")
	@ElDescription(sub = "결재의견 리스트 조회", desc = "결재의견 리스트 조회")
	@ElValidator(errUrl = "")
	public DocCommentsListVo selectDocComments(DocCommentsVo vo) throws Exception{
	
		List<DocCommentsVo> docCommentsVo = apprCommonService.selectDocComments(vo);
		
		DocCommentsListVo docCommentsList = new DocCommentsListVo();
		docCommentsList.setDocCommentsVo(docCommentsVo);
		docCommentsList.setTotalCount(Long.valueOf(docCommentsVo.size()));
		return docCommentsList;
	}
}
