package kr.re.kitech.biz.apr.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprSnapReqVo;
import kr.re.kitech.biz.apr.vo.AprStatusVo;
import kr.re.kitech.biz.apr.vo.AprTaskListVo;
import kr.re.kitech.biz.apr.vo.AprUserVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.AprWorkListVo;
import kr.re.kitech.biz.apr.vo.AprWorkVo;
import kr.re.kitech.biz.apr.vo.IntfatabListVo;
import kr.re.kitech.biz.apr.vo.IntfatabVo;

/**
 * 
 * @author 박병목
 * @since 2022. 6. 24.
 */
@Controller
public class ApprFuncController {
		
	@Resource(name = "apprFuncServiceImpl")
    private ApprFuncService apprFuncService;
    
	/**
	 * 결재상신
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcFormSubmit")
	@RequestMapping(value = "SvcFormSubmit")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "결재상신", desc = "결재상신")
	public void formSubmit(AprSnapReqVo aprReq) throws Exception {
		List<AprUserVo> users = aprReq.getAprUserListVo();
		apprFuncService.formSubmit(aprReq.getAprScVo(), users);
	}
	
  	/**
	 * 결재승인
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcFormAccept")
	@RequestMapping(value = "SvcFormAccept")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "결재승인", desc = "결재승인")
	public void formAccept(AprVo sc) throws Exception {
		apprFuncService.formAccept(sc);
	}
	
	
  	/**
	 * 일괄 결재승인
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcFormAccepts")
	@RequestMapping(value = "SvcFormAccepts")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "결재승인 다건", desc = "결재승인 다건")
	public void formAccepts(AprTaskListVo sc) throws Exception {
		apprFuncService.formAccepts(sc);
	}
	
	/**
	 * 결재진행(라인편집)
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcFormAcceptLineSet")
	@RequestMapping(value = "SvcFormAcceptLineSet")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "결재진행(라인편집)", desc = "결재진행(라인편집)")
	public void formAcceptLineSet(AprSnapReqVo aprReq) throws Exception {
		List<AprUserVo> users = aprReq.getAprUserListVo();
		apprFuncService.formAcceptLineSet(aprReq.getAprScVo(), users);
	}
	
	/**
	 * 결재반려
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcFormReject")
	@RequestMapping(value = "SvcFormReject")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "결재반려", desc = "결재반려")
	public void formReject(AprScVo sc) throws Exception {
		apprFuncService.formReject(sc);
	}
	
	/**
	 * 결재 담당자반려
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcAuthReject")
	@RequestMapping(value = "SvcAuthReject")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "결재 담당자반려", desc = "결재 담당자반려")
	public void formAuthReject(AprScVo sc) throws Exception {
		// ASIS 담당자반려 적용
		if (StringUtils.equals("1", sc.getAsistype())) {
			apprFuncService.formAuthAsisReject(sc);
		} else {
			apprFuncService.formAuthReject(sc);
		}
	}
	
	/**
	 * 결재회수
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcFormCompensate")
	@RequestMapping(value = "SvcFormCompensate")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "결재회수", desc = "결재회수")
	public void formCompensate(AprScVo sc) throws Exception {
		apprFuncService.formCompensate(sc);
	}
	
	/**
	 * 결재 전달(일괄 포함)
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcFormDelegate")
	@RequestMapping(value = "SvcFormDelegate")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "결재전달", desc = "결재전달, 일괄전달 포함")
	public void formDelegate(AprTaskListVo sc) throws Exception {
		apprFuncService.formDelegate(sc);
	}

	/**
	 * 결재삭제
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcDeleteApr")
	@RequestMapping(value = "SvcDeleteApr")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "결재삭제", desc = "결재삭제")
	public int formRemove(AprVo sc) throws Exception {
		return apprFuncService.formRemove(sc.getReqNo());
	}
	
	/**
	 * 결재대기함 리스트
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcSearchAprList")
	@RequestMapping(value = "SvcSearchAprList")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "결재대기함 리스트", desc = "결재대기함 리스트")
	public AprWorkListVo searchAprList(AprScVo sc) throws Exception {
		int totCount = 0;
		totCount = apprFuncService.searchTotCnt(sc);
		List<AprWorkVo> aprListVoList = apprFuncService.searchAprList(sc);
		AprWorkListVo aprWorkListVo = new AprWorkListVo();
		aprWorkListVo.setWorkListVo(aprListVoList);
		aprWorkListVo.setTotalCount(totCount);
		
		return aprWorkListVo;
	}
	
	/**
	 * 결재대기함 검색조건 리스트
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcInstSearch")
	@RequestMapping(value = "SvcInstSearch")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "결재대기함 검색조건 리스트", desc = "결재대기함 검색조건 리스트")
	public AprWorkListVo searchClsfAprList(AprScVo sc) throws Exception {
		int totCount = 0;
		totCount = apprFuncService.searchClsfTotCnt(sc);
		List<AprWorkVo> aprListVoList = apprFuncService.searchClsfAprList(sc);
		AprWorkListVo aprWorkListVo = new AprWorkListVo();
		aprWorkListVo.setWorkListVo(aprListVoList);
		aprWorkListVo.setTotalCount(totCount);
		
		return aprWorkListVo;
	}
	
	/**
	 * 결재 반려작성중 리스트
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcSearchInsPectList")
	@RequestMapping(value = "SvcSearchInsPectList")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "결재 반려작성중 리스트", desc = "결재 반려작성중 리스트")
	public IntfatabListVo searchWorkList(AprScVo sc) throws Exception {
	
		int totCount = 0;
		
		String[] StatusList = sc.getStatus().split(",");
		List<AprStatusVo> aprList = new ArrayList<AprStatusVo>();
		for(String Status : StatusList){
			AprStatusVo statusVo = new AprStatusVo();
			statusVo.setApr_state(Status);
			aprList.add(statusVo);
		}
		sc.setAprStatusVo(aprList);
		
		totCount = apprFuncService.searchWorkTotCnt(sc);
		List<IntfatabVo> aprListVoList = apprFuncService.searchWorkList(sc);
		IntfatabListVo intfatabListVo = new IntfatabListVo();
		intfatabListVo.setIntfatabListVo(aprListVoList);
		intfatabListVo.setTotalCount(totCount);
		
		return intfatabListVo;
	}
	
	/**
	 * 결재 반려작성중 검색조건 리스트
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcAprSaveSearch")
	@RequestMapping(value = "SvcAprSaveSearch")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "결재 반려작성중 검색조건 리스트", desc = "결재 반려작성중 검색조건 리스트")
	public IntfatabListVo searchClsfWorkList(AprScVo sc) throws Exception {
	
		int totCount = 0;
		
		String[] StatusList = sc.getStatus().split(",");
		List<AprStatusVo> aprList = new ArrayList<AprStatusVo>();
		for(String Status : StatusList){
			AprStatusVo statusVo = new AprStatusVo();
			statusVo.setApr_state(Status);
			aprList.add(statusVo);
		}
		sc.setAprStatusVo(aprList);
		
		totCount = apprFuncService.searchClsfWorkTotCnt(sc);
		List<IntfatabVo> aprListVoList = apprFuncService.searchClsfWorkList(sc);
		IntfatabListVo intfatabListVo = new IntfatabListVo();
		intfatabListVo.setIntfatabListVo(aprListVoList);
		intfatabListVo.setTotalCount(totCount);
		
		return intfatabListVo;
	}
	
	/**
	 * 모바일 작성중문서함 리스트
	 * 
	 * @throws Exception 
	 */
	@ElService(key = "SvcMbiSearchSaveList")
	@RequestMapping(value = "SvcMbiSearchSaveList")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "모바일 작성중문서함 리스트", desc = "모바일 작성중문서함 리스트")
	public IntfatabListVo searchMbiWorkList(AprScVo sc) throws Exception {
		String[] StatusList = sc.getStatus().split(",");
		List<AprStatusVo> aprList = new ArrayList<AprStatusVo>();
		for(String Status : StatusList){
			AprStatusVo statusVo = new AprStatusVo();
			statusVo.setApr_state(Status);
			aprList.add(statusVo);
		}
		sc.setAprStatusVo(aprList);
		
		int totCount = apprFuncService.searchMbiWorkTotCnt(sc);
		List<IntfatabVo> aprListVoList = apprFuncService.searchMbiWorkList(sc);
        
		IntfatabListVo intfatabListVo = new IntfatabListVo();
		intfatabListVo.setIntfatabListVo(aprListVoList);
		intfatabListVo.setTotalCount(totCount);
		
		return intfatabListVo;
	}
	
	
	
	
}