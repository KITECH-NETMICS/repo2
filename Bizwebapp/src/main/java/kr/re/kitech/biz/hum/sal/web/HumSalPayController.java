package kr.re.kitech.biz.hum.sal.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.sal.service.HumSalPayService;
import kr.re.kitech.biz.hum.sal.vo.HumSalPayListVo;
import kr.re.kitech.biz.hum.sal.vo.HumSalPayVo;

/**  
 * @ClassSubJect 급여관련 컨트롤러
 * @Class Name : HumSalPayController.java
 * @Description : 급여관련 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/12/09   이민기                최초생성
 * 
 * @author 이민기
 * @since 2023/12/09
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Controller
public class HumSalPayController {
	@Resource(name="humSalPayService")	
	private HumSalPayService humSalPayService;
	
	/** 급여내역 기본정보 조회 */
	@ElService(key = "SvcHUMSALPAYR01")
	@RequestMapping(value = "SvcHUMSALPAYR01")
	@ElDescription(sub = "급여내역 기본정보 조회", desc = "해당월 기본정보조회")
	@ElValidator(errUrl = "")
	public HumSalPayListVo selectHumslallow(HumSalPayVo vo) throws Exception{
		
		return humSalPayService.selectHumslallow(vo);
	}
	
	/** 급여지급내역 조회 */
	@ElService(key = "SvcHUMSALPAYR03")
	@RequestMapping(value = "SvcHUMSALPAYR03")
	@ElDescription(sub = "급여 공제내역 조회", desc = "급여 공제내역 조회")
	@ElValidator(errUrl = "")
	public List<HumSalPayVo> selectHumSlmmPayMonList(HumSalPayVo vo) throws Exception{
		return humSalPayService.selectHumSlmmPayMonList(vo);
	}
	
	@ElService(key = "SvcHUMSALPAYR04")
	@RequestMapping(value = "SvcHUMSALPAYR04")
	@ElDescription(sub = "급여내역 총괄표", desc = "급여내역 총괄표")
	@ElValidator(errUrl = "")
	public HumSalPayListVo selectHumSlmmPayTotList(HumSalPayVo vo) throws Exception{
		
		return humSalPayService.selectHumSlmmPayTotList(vo);
	}
	

}
