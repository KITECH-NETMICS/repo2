package kr.re.kitech.biz.apr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.apr.service.AprBugtCtrlService;
import kr.re.kitech.biz.apr.vo.BugtCtrlInfoVo;
import kr.re.kitech.biz.apr.vo.BugtCtrlSrcVo;

/**
 * @ClassSubJect 예산통제 
 * @Class Name AprBugtCtrlController.java
 * @Description 예산통제 Controller
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/25      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/08/25
 * @version 1.0
 * @see
 * 
 */
@Controller
public class AprBugtCtrlController {
	@Resource(name="aprBugtCtrlService")
	private AprBugtCtrlService ctrlService;
	
	@ElService(key = "SvcAprBugtCtrlR01")
	@RequestMapping(value = "SvcAprBugtCtrlR01")
	@ElDescription(sub = "예산통제자 결재리스트 조회", desc = "예산통제자의 결재목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<BugtCtrlInfoVo> selectBblEnfrcCtrlList(BugtCtrlSrcVo vo) throws Exception{
		return ctrlService.selectBblEnfrcCtrlList(vo);
	}
}
