package kr.re.kitech.biz.uss.cod.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.uss.cod.service.ComBoxCodeService;
import kr.re.kitech.biz.uss.cod.vo.ComBoxCodeVo;
import kr.re.kitech.biz.uss.cod.vo.ComBoxSrcVo;

/**
 * @ClassSubJect selectBox 코드 조회
 * @ClassName  ComBoxCodeController.java
 * @Description selectBox 코드 조회 Controller
 * @Modification :   
 *     수정일           수정자     수정내용
 *  ----------- ------- ---------
 *  2023.09.20.  이영희       최초생성
 * 
 * @author 
 * @since 2023.09.20.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class ComBoxCodeController {
	@Resource(name="comBoxCodeService")
	private ComBoxCodeService codeService;
	
	@ElService(key = "SvcCOMCODR01")
	@RequestMapping(value = "SvcCOMCODR01")
	@ElDescription(sub = "selectBox 코드 조회", desc = "selectBox 코드 조회용 공통 매소드")
	@ElValidator(errUrl = "")
	public List<ComBoxCodeVo> selectComBoxCode(ComBoxSrcVo vo) throws Exception{
		return codeService.selectComBoxCode(vo);
	}
}
