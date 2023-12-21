package kr.re.kitech.biz.hum.tax.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.tax.service.HumTaxPayService;
import kr.re.kitech.biz.hum.tax.vo.HumTaxPayVo;

/**
 * @ClassSubJect
 * @ClassName : HumTaxPayController.java
 * @Description
 * @Modification : 
       수정일              수정자         수정내용
   ---------- --------- --------- 
    2023.11.23. mklee     최초생성               
 * 
 * @author
 * @since 2023.11.23.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class HumTaxPayController {

	@Resource(name = "humTaxPayServiceImpl")
	private HumTaxPayService humTaxPayService;

	/** 원천징수부 목록 조회 */
	@ElService(key = "SvcHUMTAXPAYR01")
	@RequestMapping(value = "SvcHUMTAXPAYR01")
	@ElDescription(sub = "원천징수부 조회", desc = "원천징수부 조회")
	@ElValidator(errUrl = "")
	public List<HumTaxPayVo> selectTaxPayInfoList(HumTaxPayVo vo) throws Exception {
		return humTaxPayService.selectTaxPayInfoList(vo);
	}
	
	/** 원천징수  목록 조회 */
	@ElService(key = "SvcHUMTAXPAYR02")
	@RequestMapping(value = "SvcHUMTAXPAYR02")
	@ElDescription(sub = "원천징수 영수증 조회", desc = "원천징수 영수증 조회")
	@ElValidator(errUrl = "")
	public List<HumTaxPayVo> selectHumTaxPayInfoList(HumTaxPayVo vo) throws Exception {
		return humTaxPayService.selectHumTaxPayInfoList(vo);
	}		

}
