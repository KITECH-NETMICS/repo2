package kr.re.kitech.biz.sup.com.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.sup.com.service.SptComService;
import kr.re.kitech.biz.sup.com.vo.SptComCodeVo;

/**  
 * @ClassSubJect 기술지원공통처리 Controller
 * @Class Name SptComController.java
 * @Description 기술지원공통 관련 처리를 담당하는 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/04   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/08/04
 * @version 1
 * @see
 * 
 */
@Controller
public class SptComController {
	@Resource(name="sptComService")
	private SptComService comService;
	
	@ElService(key = "SvcSPTCOMR01")
	@RequestMapping(value = "SvcSPTCOMR01")
	@ElDescription(sub = "기술지원 공통코드 조회", desc = "기술지원업무의 공통코드를 조회한다.")
	@ElValidator(errUrl = "")
	public List<SptComCodeVo> selectSptComCode(SptComCodeVo vo) throws Exception{
		return comService.selectSptComCode(vo);
	}
}
