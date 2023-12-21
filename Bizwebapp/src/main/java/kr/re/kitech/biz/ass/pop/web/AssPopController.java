package kr.re.kitech.biz.ass.pop.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ass.pop.service.AssPopService;
import kr.re.kitech.biz.ass.pop.vo.AssMastrHPopVo;

/**  
 * @ClassSubJect 자산관리 팝업 Controller
 * @Class Name AssPopController.java
 * @Description 자산관리 팝업 처리를 담당하는 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/06/14   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/06/14
 * @version 1
 * @see
 * 
 */
@Controller
public class AssPopController {
	@Resource(name="assPopService")
	private AssPopService popService;
	
	@ElService(key = "SvcASSPOPCOMR01")
	@RequestMapping(value = "SvcASSPOPCOMR01")
	@ElDescription(sub = "자산내역조회(팝업)", desc = "자산내역검색팝업에서 내역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<AssMastrHPopVo> selectAssMastrH(AssMastrHPopVo vo) throws Exception{
		return popService.selectAssMastrH(vo);
	}
}
