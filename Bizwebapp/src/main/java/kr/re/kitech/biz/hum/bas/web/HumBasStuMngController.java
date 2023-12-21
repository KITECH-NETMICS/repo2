package kr.re.kitech.biz.hum.bas.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.bas.service.HumBasStuMngService;
import kr.re.kitech.biz.hum.bas.vo.HumBasStuMngListVo;
import kr.re.kitech.biz.hum.bas.vo.HumBasStuMngVo;

@Controller
public class HumBasStuMngController {

	@Resource(name="humBasStuMngService")
	private HumBasStuMngService service;
	
	@ElService(key = "SvcSTUMNG01")
	@RequestMapping(value = "SvcSTUMNG01")
	@ElDescription(sub = "학생연구원 정보 조회", desc = "학생연구원 정보를 조회한다")
	@ElValidator(errUrl = "")
	public List<HumBasStuMngListVo> selectHumEducInfo(HumBasStuMngVo vo) throws Exception{
		return service.selectHumEducInfo(vo);
	}

}
