package kr.re.kitech.biz.hum.apy.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.apy.service.HumApyAllowService;
import kr.re.kitech.biz.hum.apy.vo.HumApyAllowInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyAllowVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 가족수당신청
 * @Class Name HumApyAllowController.java
 * @Description 가족수당신청 Controller
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.08.11.      김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.11.
 * @version 1.0
 * @see
 * 
 */
 
@Controller
public class HumApyAllowController {

	@Resource(name = "humApyAllowServiceImpl")
	private HumApyAllowService apyService; 

    /**
     * 가족수당신청 목록을 조회합니다.
     *
     * @author 김상미
     * @param  HumApyAllowInfoVo
     * @return List<HumApyAllowInfoVo>
     * @throws KitechException
     * @since 2023.08.11.
     */
	@ElService(key = "SvcHUMAPYALLWR01")
	@RequestMapping(value = "SvcHUMAPYALLWR01")
	@ElDescription(sub = "가족수당신청 리스트조회", desc = "가족수당신청 리스트를 조회한다.")
	@ElValidator(errUrl = "")
	public List<HumApyAllowInfoVo> selectList(HumApyAllowInfoVo apyVo) throws KitechException { 
	    return apyService.selectList(apyVo);
	}  

    /**
     * 가족수당신청 상세를 조회합니다.
     *
     * @author 김상미
     * @param HumApyAllowInfoVo
     * @return HumApyAllowVo
     * @throws KitechException
     * @since 2023.08.11.
     */	
	@ElService(key = "SvcHUMAPYALLWR02")
	@RequestMapping(value = "SvcHUMAPYALLWR02")
	@ElDescription(sub = "가족수당신청 정보 조회", desc = "가족수당신청 정보를 조회한다")
	@ElValidator(errUrl = "")
	public HumApyAllowVo select(HumApyAllowInfoVo apyVo) throws KitechException { 
	    return apyService.select(apyVo);
	}  

    /**
     * 가족수당신청 신청상태를 조회합니다.
     *
     * @author 김상미
     * @param HumApyAllowInfoVo
     * @return HumApyAllowVo
     * @throws KitechException
     * @since 2023.08.11.
     */		
	@ElService(key = "SvcHUMAPYALLWR03")
	@RequestMapping(value = "SvcHUMAPYALLWR03")
	@ElDescription(sub = "가족수당신청 중복 체크", desc = "결재가 진행중인 가족수당신청서가 있는지 확인.")
	@ElValidator(errUrl = "")
	public HumApyAllowInfoVo selectDupCheck(HumApyAllowInfoVo apyVo) throws KitechException { 
	    return apyService.selectDupCheck(apyVo);
	} 
  
    /**
     * 가족수당신청 등록/수정/결재요청 합니다.
     *
     * @author 김상미
     * @param HumApyAllowVo
     * @return HumApyAllowInfoVo
     * @throws KitechException
     * @since 2023.08.11.
     */	 
	@ElService(key = "SvcHUMAPYALLWI01")
	@RequestMapping(value = "SvcHUMAPYALLWI01")
	@ElDescription(sub = "가족수당신청 등록", desc = "가족수당신청 정보를 저장한다.")
	@ElValidator(errUrl = "")
	public HumApyAllowInfoVo saveAllowInfo(HumApyAllowVo apyVo) throws KitechException {
		return apyService.saveAllowInfo(apyVo);
	}  
	
    /**
     * 가족수당신청 정보, 전자결재를 삭제합니다.
     *
     * @author 김상미
     * @param HumApyAllowVo
     * @throws KitechException
     * @since 2023.08.11.
     */	  
	@ElService(key = "SvcHUMAPYALLWD01")
	@RequestMapping(value = "SvcHUMAPYALLWD01")
	@ElDescription(sub = "가족수당신청 삭제", desc = "가족수당신청 정보를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteAllowInfo(HumApyAllowInfoVo apyVo) throws KitechException {
		apyService.delete(apyVo);
	}  	
  
    /**
     * 가족수당신청 전자결제 승인(화면)
     *
     * @author 김상미
     * @param HumApyAllowVo
     * @throws KitechException
     * @since 2023.08.11.
     */
    @ElService(key = "SvcHUMAPYALLWM01")    
    @RequestMapping(value = "SvcHUMAPYALLWM01")
    @ElDescription(sub = "가족수당신청 전자결제 처리(화면)", desc = "가족수당신청 전자결재 처리(화면)")
	@ElValidator(errUrl = "")
    public void formAccept(HumApyAllowVo apyVo, Model model) throws KitechException {    	 
    	apyService.formConfirm(apyVo);
    }
    
    /**
     * 가족수당신청 전자결제 반려(화면)
     *
     * @author 김상미
     * @param HumApyAllowInfoVo
     * @throws KitechException
     * @since 2023.08.11.
     */
    @ElService(key = "SvcHUMAPYALLWM02")    
    @RequestMapping(value = "SvcHUMAPYALLWM02")
    @ElDescription(sub = "가족수당신청 전자결제 반려(화면)", desc = "가족수당신청 전자결재 반려(화면)")
	@ElValidator(errUrl = "")
    public void formReject(HumApyAllowInfoVo apyVo, Model model) throws KitechException {    	 
    	apyService.formReject(apyVo);
    } 	  
}
