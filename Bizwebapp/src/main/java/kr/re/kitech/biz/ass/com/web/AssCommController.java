package kr.re.kitech.biz.ass.com.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ass.app.service.AssAppUnUseService;
import kr.re.kitech.biz.ass.app.vo.AssUnUseListVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseSrcVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseVo;
import kr.re.kitech.biz.ass.com.service.AssCommService;
import kr.re.kitech.biz.ass.com.vo.AssCommSrchVo;
import kr.re.kitech.biz.ass.com.vo.AssCommVo;

import org.springframework.web.bind.annotation.RequestMethod;

/**  
 * @ClassSubJect 자산 불용신청 
 * @Class Name : AssAppUnUseController.java
 * @Description : 자산 불용신청 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/08   이정호                  최초생성
 * 
 * @author LeeYh
 * @since 2023/07/25
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Controller
public class AssCommController{
	@Resource(name="assCommService")
	AssCommService commService;
	
	@ElService(key = "SvcASSComm01")
	@RequestMapping(value = "SvcASSComm01")
	@ElDescription(sub = "자산 지역위치에 따른 건물, 층수 검색", desc = "자산 지역위치에 따른 건물, 층수를 검색한다")
	@ElValidator(errUrl = "")
	public List<AssCommVo> selectBuilding(AssCommSrchVo vo) throws Exception{
		return commService.selectBuilding(vo);
	}

}
