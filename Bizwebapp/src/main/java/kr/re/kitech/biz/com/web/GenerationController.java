package kr.re.kitech.biz.com.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.com.vo.GenerationParamVo;
import kr.re.kitech.biz.com.vo.GenerationVo;

/**  
 * @ClassSubJect 공통채번 관련 처리 하는 컨트롤러
 * @Class Name GenerationController.java
 * @Description 공통채번 관련 처리 하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/02/15     박병목             최초생성
 * 
 * @author 박병목
 * @since 2022/02/15
 * @version 1.0
 * @see
 * 
 */
 
@Controller
public class GenerationController {

	/** GenerationService */
    @Resource(name = "generationServiceImpl")
    private GenerationService generationService;

    /**
     * 구분에 따른 공통채번 증가 처리.
     * @param GenerationVo 공통채번 GenerationVo     
     * @throws Exception
     */
    @ElService(key = "SvcGetNumbering")    
    @RequestMapping(value = "SvcGetNumbering")
    @ElDescription(sub = "구분에 따른 채번값 증가", desc = "구분에 따른 채번값 증가")
	@ElValidator(errUrl = "")
    public GenerationVo getGenVoNumber(GenerationParamVo paramVo) throws Exception {
    
    	AppLog.debug(paramVo.getNumbering());
    	AppLog.debug(Numberings.valueOf(paramVo.getNumbering()).getName());
    
        return generationService.getGenVoNumber(paramVo);
    }
}
