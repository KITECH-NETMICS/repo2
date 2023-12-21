package kr.re.kitech.biz.fin.spa.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.spa.service.FinLocalTripSlipService;
import kr.re.kitech.biz.fin.spa.vo.CtrLocalSlipVo;
import kr.re.kitech.biz.fin.spa.vo.FinAutoSlipCrtVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSrcVo;

/**
 * @ClassSubJect 근거리출장결의생성 
 * @Class Name FinLocalTripSlipController.java
 * @Description 근거리출장결의생성  Controller
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023/03/21      이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/03/21
 * @version 1.0
 * @see
 * 
 */
@Controller
public class FinLocalTripSlipController {
	@Resource(name="finLocalTripSlipService")
	private FinLocalTripSlipService localSlipService;
	
	@ElService(key = "SvcFINSPALOCR01")
	@RequestMapping(value = "SvcFINSPALOCR01")
	@ElDescription(sub = "근거리출장결의생성 목록 조회", desc = "근거리출장결의생성 목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<CtrLocalSlipVo> selectCtrLocalSlip(FinSpaSrcVo vo) throws Exception{
		return localSlipService.selectCtrLocalSlip(vo);
	}
	
	@ElService(key = "SvcFINSPALOCM01")
	@RequestMapping(value = "SvcFINSPALOCM01")
	@ElDescription(sub = "근거리출장 결의생성", desc = "근거리출장 결의를 생성한다.(근거리출장결의생성(관))")
	@ElValidator(errUrl = "")
	public FinSpaSrcVo saveLocalTripSlip(FinAutoSlipCrtVo vo) throws Exception{
		FinSpaSrcVo retVo = new FinSpaSrcVo();
		// 결의생성 호출
		retVo.setUnslip_no(localSlipService.saveLocalTripSlip(vo));
		return retVo;
	}
	
	@ElService(key = "SvcFINSPALOCD01")
	@RequestMapping(value = "SvcFINSPALOCD01")
	@ElDescription(sub = "근거리출장결의취소", desc = "근거리출장결의를 취소한다.")
	@ElValidator(errUrl = "")
	public void deleteLocalTripSlip(FinAutoSlipCrtVo vo) throws Exception{
		localSlipService.deleteLocalTripSlip(vo);
	}
}
