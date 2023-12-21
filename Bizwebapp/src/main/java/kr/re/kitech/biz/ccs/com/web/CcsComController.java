package kr.re.kitech.biz.ccs.com.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ccs.com.service.CcsComService;

/**  
 * @ClassSubJect 총무보안 공통 컨트롤러
 * @Class Name CcsComController.java
 * @Description 총무보안 공통 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/09/14     이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/09/14
 * @version 1.0
 * @see
 * 
 */
@Controller
public class CcsComController {
	@Resource(name="ccsComService")
	private CcsComService comService;
	
	@ElService(key = "SvcCCSCOMM01")
	@RequestMapping(value = "SvcCCSCOMM01")
	@ElDescription(sub = "총무보안 결재저장(타입2)", desc = "총무보안 TYPE2 결재를 처리한다.")
	@ElValidator(errUrl = "")
	public void saveApr(AprVo vo) throws Exception{
		comService.saveApr(vo);
	}
	
	@ElService(key = "SvcCCSCOMM02")
	@RequestMapping(value = "SvcCCSCOMM02")
	@ElDescription(sub = "총무보안 type2 결재 반려", desc = "총무보안 type2 결재 반려처리를 한다(휴가원 증빙자료)")
	@ElValidator(errUrl = "")
	public void saveAprReject(AprScVo vo) throws Exception{
		comService.saveAprReject(vo);
	}
	
	@ElService(key = "SvcCCSCOMM03")
	@RequestMapping(value = "SvcCCSCOMM03")
	@ElDescription(sub = "담당자 반려처리", desc = "결재완료 후 담당자 반려처리를 할수있다.")
	@ElValidator(errUrl = "")
	public void saveAprAuthReject(AprScVo vo) throws Exception{
		comService.saveAprAuthReject(vo);
	}
}
