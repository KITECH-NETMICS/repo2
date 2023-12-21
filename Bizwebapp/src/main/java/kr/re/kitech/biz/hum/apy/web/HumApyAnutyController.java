package kr.re.kitech.biz.hum.apy.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.apy.service.HumApyAnutyService;
import kr.re.kitech.biz.hum.apy.vo.HumApyAnutyInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyAnutyVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

/**
 * @ClassSubJect 과학기술인연금신청
 * @Class Name HumApyAllowController.java
 * @Description 과학기술인연금신청 Controller
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.08.25.      김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.25.
 * @version 1.0
 * @see
 * 
 */
 
@Controller
public class HumApyAnutyController {

	@Resource(name = "humApyAnutyServiceImpl")
	private HumApyAnutyService apyService;

    /**
     * 과학기술인연금신청 목록을 조회합니다.
     *
     * @author 김상미
     * @param  HumApyAnutyInfoVo
     * @return List<HumApyAnutyInfoVo>
     * @throws KitechException
     * @since 2023.08.25.
     */
	@ElService(key = "SvcHUMAPYANUMR01")
	@RequestMapping(value = "SvcHUMAPYANUMR01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "과학기술인연금신청 리스트 조회", desc = "과학기술인연금신청 리스트를 조회한다.")
	@ElValidator(errUrl = "")
	public List<HumApyAnutyInfoVo> selectList(HumApyAnutyInfoVo apyVo) throws KitechException {
	  return apyService.selectList(apyVo);
	}

    /**
     * 과학기술인연금신청 상세를 조회합니다.
     *
     * @author 김상미
     * @param  HumApyAnutyInfoVo
     * @return HumApyAnutyVo
     * @throws KitechException
     * @since 2023.08.25.
     */	
	@ElService(key = "SvcHUMAPYANUSR01")
	@RequestMapping(value = "SvcHUMAPYANUSR01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "과학기술인연금신청 상세조회", desc = "과학기술인연금신청 상세를 조회한다.")
	@ElValidator(errUrl = "")
	public HumApyAnutyVo select(HumApyAnutyInfoVo apyVo) throws Exception {
	  return apyService.select(apyVo);
	}

	/**
	 * 과학기술인연금신청 전자결재 등록/수정/결재요청
     *
     * @author 김상미
     * @param  HumApyAnutyInfoVo
     * @return HumApyAnutyInfoVo
     * @throws KitechException
     * @since 2023.08.25.
     */
	@ElService(key = "SvcHUMAPYANUSI01")
	@RequestMapping(value = "SvcHUMAPYANUSI01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "과학기술인연금신청 등록", desc = "과학기술인연금신청 정보를 등록한다.")
	@ElValidator(errUrl = "")
	public HumApyAnutyInfoVo save(HumApyAnutyInfoVo apyVo) throws Exception {
	  return apyService.save(apyVo);
	}

	/**
	 * 과학기술인연금신청 전자결재 삭제
     *
     * @author 김상미
     * @param  HumApyAnutyInfoVo
     * @throws KitechException
     * @since 2023.08.25.
     */
	@ElService(key = "SvcHUMAPYANUSD01")
	@RequestMapping(value = "SvcHUMAPYANUSD01")
	@ElDescription(sub = "과학기술인연금신청 삭제", desc = "과학기술인연금신청 정보를 삭제한다.")
	@ElValidator(errUrl = "")
	public void delete(HumApyAnutyInfoVo apyVo) throws Exception {
		apyService.delete(apyVo);
	}  	

	/**
	 * 과학기술인연금신청 전자결재 처리(화면)
     *
     * @author 김상미
     * @param  HumApyAnutyInfoVo
     * @throws KitechException
     * @since 2023.08.25.
	 */
	@ElService(key = "SvcHUMAPYANUSU01")    
	@RequestMapping(value = "SvcHUMAPYANUSU01")
	@ElDescription(sub = "과학기술인연금신청 전자결재 처리(화면)", desc = "과학기술인연금신청 전자결재 처리(화면)")
	@ElValidator(errUrl = "")
	public void formAccept(HumApyAnutyInfoVo apyVo, Model model) throws Exception {    	 
		apyService.formConfirm(apyVo);
	}

	/**
	 * 과학기술인연금신청 전자결재 반려(화면)
     *
     * @author 김상미
     * @param  HumApyAnutyInfoVo
     * @throws KitechException
     * @since 2023.08.25.
	 */
	@ElService(key = "SvcHUMAPYANUSU02")    
	@RequestMapping(value = "SvcHUMAPYANUSU02")
	@ElDescription(sub = "과학기술인연금신청 전자결재 반려(화면)", desc = "과학기술인연금신청 전자결재 반려(화면)")
	@ElValidator(errUrl = "")
	public void formReject(HumApyAnutyInfoVo apyVo, Model model) throws Exception {    	 
		apyService.formReject(apyVo);
	}  

	/**
	 * 과학기술인연금신청 결재신청상태 조회
     *
     * @author 김상미
     * @param  HumApyAnutyInfoVo
     * @return HumApyAnutyInfoVo
     * @throws KitechException
     * @since 2023.08.25.
	 */  
	@ElService(key = "SvcHUMAPYANUSR02")
	@RequestMapping(value = "SvcHUMAPYANUSR02")
	@ElDescription(sub = "과학기술인연금신청 결재신청 조회", desc = "과학기술인연금신청 결재신청 내용을 조회를 한다.")
	@ElValidator(errUrl = "")
	public HumApyAnutyInfoVo selectApr(HumApyAnutyInfoVo apyVo) throws Exception {
		return apyService.selectApr(apyVo);
	}    
}
