package kr.re.kitech.biz.hum.com.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.com.service.HumComService;
import kr.re.kitech.biz.hum.com.vo.HumPrtLogVo;

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
public class HumComController {

	@Resource(name = "humComServiceImpl")
	private HumComService humComService;

	/** 원천징수부 출력로그 등록 */
	@ElService(key = "SvcHUMPRTLOGMI01")
	@RequestMapping(value = "SvcHUMPRTLOGMI01")
	@ElDescription(sub = "인사증명서 출력로그 등록", desc = "인사증명서 출력로그 등록")
	@ElValidator(errUrl = "")
	public void insertHumPrtLogData(HumPrtLogVo vo) throws Exception{
		humComService.insertHumPrtLogData(vo);		
	}

}
