package kr.re.kitech.biz.hum.apy.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.apy.service.HumApySlfDrivService;
import kr.re.kitech.biz.hum.apy.vo.HumApySlfDrivInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApySlfDrivVo;

/**
 * @ClassSubJect 자가운전비보조신청
 * @Class Name HumApySlfDrivController.java
 * @Description 자가운전비보조신청 Controller
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023/08/04      김상미             최초생성
 * 
 * @author 김상미
 * @since 2023/08/04
 * @version 1.0
 * @see
 * 
 */
 
@Controller
public class HumApySlfDrivController {

  @Resource(name = "humApySlfDrivServiceImpl")
  private HumApySlfDrivService humApySlfDrivService;  
  
    /**
     * 자가운전보조비신청 목록을 조회합니다.
     * @author 김상미
     * @param apyVo 자가운전보조비신청정보 HumApySlfDrivInfoVo
     * @return List<HumApySlfDrivInfoVo>
     * @throws Exception
     */
	@ElService(key = "SvcHUMAPYDRIVR01")
	@RequestMapping(value = "SvcHUMAPYDRIVR01")
	@ElDescription(sub = "자가운전보조비신청목록 조회", desc = "페이징을 처리하여 자가운전보조비신청 목록 조회를 한다.")
	@ElValidator(errUrl = "")
	public List<HumApySlfDrivInfoVo> selectList(HumApySlfDrivInfoVo apyVo) throws Exception {
		return humApySlfDrivService.selectList(apyVo);
	}
	
    /**
     * 자가운전보조비신청 상세를 조회합니다.
     * @author 김상미
     * @param apyVo 자가운전보조비신청정보 HumApySlfDrivInfoVo
     * @return HumApyAllowVo
     * @throws Exception
     */	
	@ElService(key = "SvcHUMAPYDRIVR02")
	@RequestMapping(value = "SvcHUMAPYDRIVR02")
	@ElDescription(sub = "자가운전보조비신청 조회", desc = "자가운전보조비신청 정보 조회를 한다.")
	@ElValidator(errUrl = "")
	public HumApySlfDrivVo select(HumApySlfDrivInfoVo apyVo) throws Exception {
		return humApySlfDrivService.select(apyVo);
	}
 
    /**
     * 자가운전보조비신청 등록/수정/결재요청 합니다.
     * @author 김상미
     * @param apyVo 자가운전보조비신청 HumApySlfDrivInfoVo
     * @return HumApyAllowVo
     * @throws Exception
     */
	@ElService(key = "SvcHUMAPYDIRVI01")
	@RequestMapping(value = "SvcHUMAPYDIRVI01")
	@ElDescription(sub = "자가운전보조비신청 등록", desc = "자가운전보조비신청 정보를 저장한다.")
	@ElValidator(errUrl = "")
	public HumApySlfDrivInfoVo saveSlfDriv(HumApySlfDrivInfoVo apyVo) throws Exception {
		return humApySlfDrivService.save(apyVo);
	}  
	
    /**
     * 자가운전보조비신청 정보, 전자결재를 삭제합니다.
     * @author 김상미
     * @param apyVo 자가운전보조비신청 HumApySlfDrivInfoVo
     * @throws Exception
     */	
	@ElService(key = "SvcHUMAPYDRIVD01")
	@RequestMapping(value = "SvcHUMAPYDRIVD01")
	@ElDescription(sub = "자가운전보조비신청 삭제", desc = "자가운전보조비신청 정보를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteSlfDriv(HumApySlfDrivInfoVo apyVo) throws Exception {
		humApySlfDrivService.delete(apyVo);
	}  	
  
	/**
     * 자가운전보조비신청 전자결제 승인(화면)
     * @param apyVo 자가운전보조비신청정보 HumApySlfDrivInfoVo
     * @throws Exception
     */
    @ElService(key = "SvcHUMAPYDRIVM01")    
    @RequestMapping(value = "SvcHUMAPYDRIVM01")
    @ElDescription(sub = "자가운전보조비신청 전자결재 처리(화면)", desc = "자가운전보조비신청 전자결재 처리(화면)")
	@ElValidator(errUrl = "")
    public void formAccept(HumApySlfDrivInfoVo apyVo, Model model) throws Exception {    	 
    	humApySlfDrivService.formConfirm(apyVo);
    }
    
	/**
     * 자가운전보조비신청 전자결제 반려(화면)
     * @param apyVo 자가운전보조비신청정보 HumApySlfDrivInfoVo
     * @throws Exception
     */
    @ElService(key = "SvcHUMAPYDRIVM02")    
    @RequestMapping(value = "SvcHUMAPYDRIVM02")
    @ElDescription(sub = "자가운전보조비신청 전자결재 반려(화면)", desc = "자가운전보조비신청 전자결재 반려(화면)")
	@ElValidator(errUrl = "")
    public void formReject(HumApySlfDrivInfoVo apyVo, Model model) throws Exception {    	 
    	humApySlfDrivService.formReject(apyVo);
    }  

    /**
     * 자가운전보조비신청 신청상태를 조회합니다.
     * @author 김상미
     * @param apyVo 자가운전보조비신청 HumApySlfDrivInfoVo
     * @return HumApySlfDrivInfoVo
     * @throws Exception
     */	 
	@ElService(key = "SvcHUMAPYDRIVR03")
	@RequestMapping(value = "SvcHUMAPYDRIVR03")
	@ElDescription(sub = "자가운전보조비신청 결재신청 조회", desc = "자가운전보조비신청 결재신청 내용을 조회를 한다.")
	@ElValidator(errUrl = "")
	public HumApySlfDrivInfoVo selectAprDirvInfo(HumApySlfDrivInfoVo apyVo) throws Exception {
		return humApySlfDrivService.selectAprDirvInfo(apyVo);
	}  
  
}
