package kr.re.kitech.biz.hum.ana.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.ana.service.HumAnaUserInfoService;
import kr.re.kitech.biz.hum.ana.vo.HumAnaUserVo;

/**
 * @ClassSubJect
 * @ClassName : HumAnaAnutySController.java
 * @Description
 * @Modification : 
       수정일              수정자         수정내용
   ---------- --------- --------- 
    2023.11.14. mklee     최초생성               
 * 
 * @author
 * @since 2023.11.24.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class HumAnaUserInfoController {

	@Resource(name = "humAnaUserInfoServiceImpl")
	private HumAnaUserInfoService humAnaUserInfoService;

	/** 직원명부 총괄표 목록 조회 */
	@ElService(key = "SvcHUMANAUSERLISTR01")
	@RequestMapping(value = "SvcHUMANAUSERLISTR01")
	@ElDescription(sub = "직원명부총괄표조회", desc = "직원명부총괄표조회")
	@ElValidator(errUrl = "")
	public List<HumAnaUserVo> selectAnaUserInfoList(HumAnaUserVo vo) throws Exception {
		return humAnaUserInfoService.selectAnaUserInfoList(vo);
	}
	
	@ElService(key = "SvcHUMANAUSERLISTR02")
	@RequestMapping(value = "SvcHUMANAUSERLISTR02")
	@ElDescription(sub = "직원명부총괄표 엑셀 바로 내려받기", desc = "직원명부총괄표 엑셀 바로 내려받기")
	@ElValidator(errUrl = "")
	public List<HumAnaUserVo> selectAnaUserInfoExcel(HumAnaUserVo vo) throws Exception {
		return humAnaUserInfoService.selectAnaUserInfoExcel(vo);
	}
	
	@ElService(key = "SvcHUMANAUSERLISTR03")
	@RequestMapping(value = "SvcHUMANAUSERLISTR03")
	@ElDescription(sub = "직종조회", desc = "직종조회")
	@ElValidator(errUrl = "")
	public List<HumAnaUserVo> selectXodHoccyTyp(HumAnaUserVo vo) throws Exception {
		return humAnaUserInfoService.selectXodHoccyTyp(vo);
	}
	
	@ElService(key = "SvcHUMANAUSERLISTR04")
	@RequestMapping(value = "SvcHUMANAUSERLISTR04")
	@ElDescription(sub = "직급조회", desc = "직급조회")
	@ElValidator(errUrl = "")
	public List<HumAnaUserVo> selectXodhPosiInfo(HumAnaUserVo vo) throws Exception {
		return humAnaUserInfoService.selectXodhPosiInfo(vo);
	}

}
