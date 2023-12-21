package kr.re.kitech.biz.res.pop.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.res.app.vo.ResAppBsnsAdjstVo;
import kr.re.kitech.biz.res.pop.service.ResPopService;
import kr.re.kitech.biz.res.pop.vo.ResPopSrcVo;

/**  
 * @ClassSubJect 연구관리 팝업
 * @Class Name : ResPopController.java
 * @Description : 연구관리 팝업 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/01/12   이영희                최초생성
 * 
 * @author 이영희
 * @since 2023/01/12
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */ 
@Controller
public class ResPopController {
	@Resource(name="resPopService")
	private ResPopService popService;
	
	@ElService(key = "SvcRESPOPR01")
	@RequestMapping(value = "SvcRESPOPR01")
	@ElDescription(sub = "사업신청 사업조정회의조회", desc = "사업신청시 사업조정회의조회팝업에서 내역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<ResAppBsnsAdjstVo> selectResAppBsnsAdjst(ResPopSrcVo vo) throws Exception{
		return popService.selectResAppBsnsAdjst(vo);
	}
}
