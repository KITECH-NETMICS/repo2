package kr.re.kitech.biz.api.server.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.api.server.enums.RoleType;
import kr.re.kitech.biz.api.server.service.BizBpmService;
import kr.re.kitech.biz.api.server.service.BpmPostService;
import kr.re.kitech.biz.api.server.vo.ApiBpmListVo;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * BPM 대응 서비스.
 * 
 * @author James
 * @since 2022. 5. 3.
 */
@Controller
public class BizBpmController {

    @Resource(name="bizBpmServiceImpl")
    private BizBpmService bizBpmService;    
    
    @Resource(name="bpmPostService")
    private BpmPostService bpmPostService;    
    
        
	/**
     * 타입별 담당자 조회
	 */
	@ElService(key = "ApiBpmGetAuth")
    @RequestMapping(value = "ApiBpmGetAuth")    
    @ElDescription(sub = "타입별 담당자 조회", desc = "행위자의 타입별 담당자 조회하여 사번을 반환한다.")
	@ElValidator(errUrl = "")               
    public ApiBpmListVo findBusinessAuthor(ApiBpmVo param) throws Exception {
		AppLog.info("BPM 타입별 지역 담당자 조회 파라미터: " + param);
		
		if (StringUtils.isEmpty(param.getSyspayno())) {
			throw new KitechException(Exceptions.ERROR, Business.APR, "syspayno 파라미터가 누락되었습니다.");
		}
		if (StringUtils.isEmpty(param.getRoleType())) {
			throw new KitechException(Exceptions.ERROR, Business.APR, "roleType 파라미터가 누락되었습니다.");
		}
		if (RoleType.isRequireOccutype(param.getRoleType()) && StringUtils.isEmpty(param.getOccutypCd())) {
			throw new KitechException(Exceptions.ERROR, Business.APR, "occutypCd 파라미터가 누락되었습니다.");
		}
		
		List<ApiBpmVo> list = this.bizBpmService.findLocalAuthors(param);
		ApiBpmListVo result = new ApiBpmListVo();
		result.setApiBpmVo(list);
		if (null != list) {
			result.setTotalCount(list.size());
		}
        return result;
    }	

	/**
     * 업무/결재 단계별 후처리
	 */
	@ElService(key = "ApiBpmPostProcess")
    @RequestMapping(value = "ApiBpmPostProcess")    
    @ElDescription(sub = "업무/결재 단계별 후처리", desc = "업무/결재 단계별 후처리 로직을 수행한다.")
	@ElValidator(errUrl = "")               
    public ApiBpmVo execComplate(ApiBpmVo param) throws Exception {
		AppLog.info("업무/결재 단계별 후처리: " + param);
		param.setManager(true);
		ApiBpmVo result = this.bpmPostService.executePostProcess(param);
		
        return result;
    }
    
	/**
     * 업무/결재 BPM Back to here 대응 처리
	 */
	@ElService(key = "ApiBpmBackToHere")
    @RequestMapping(value = "ApiBpmBackToHere")    
    @ElDescription(sub = "업무/결재 BPM Back to here 대응 처리", desc = "업무/결재 BPM Back to here 대응 처리, apr_state 값을 현행화 한다.")
	@ElValidator(errUrl = "")               
    public ApiBpmVo execBackToHere(ApiBpmVo param) throws Exception {
		AppLog.info("업무/결재 BPM 관리자 Back to here 대응 처리: " + param);
		
		ApiBpmVo result = this.bizBpmService.execBackToHere(param);
		
        return result;
    }	      
    
	/**
     * 업무/결재 BPM Delegate(전달) 대응 처리
	 */
	@ElService(key = "ApiBpmDelegate")
    @RequestMapping(value = "ApiBpmDelegate")    
    @ElDescription(sub = "업무/결재 BPM Task를 위임한다.", desc = "업무/결재 BPM Task를 위임한다.")
	@ElValidator(errUrl = "")               
    public ApiBpmVo execDelegate(ApiBpmVo param) throws Exception {    
		AppLog.info("업무/결재 BPM 대결자 조회 : " + param);
		
		ApiBpmVo result = this.bizBpmService.execDelegate(param);

        return result;
    }    
    

	/**
     * 업무/결재 BPM 대결자 정보를 전달한다.
	 */
	@ElService(key = "ApiBpmApprByProxy")
    @RequestMapping(value = "ApiBpmApprByProxy")    
    @ElDescription(sub = "업무/결재 BPM 대결자 조회 대응 처리", desc = "업무/결재 부합되는 대결자가 있을경우 전달한다.")
	@ElValidator(errUrl = "")               
    public ApiBpmVo getApprByProxy(ApiBpmVo param) throws Exception {    
		AppLog.info("업무/결재 BPM 대결자 조회 : " + param);
		
		ApiBpmVo result = this.bizBpmService.getApprByProxy(param);

        return result;
    }


}
