package kr.re.kitech.biz.xom.core.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.vo.RoleCheckVo;

/**
 * role check 등 업무에서 롤에 관한 처리를 담당한다
 *
 * @author 이영희
 * @since 2022.10.16.
 */
 @Controller
public class RoleController {
	 @Resource(name="accntServiceImpl")
	 private AccntService accntService;
	 
	 @ElService(key = "SvcCheckRole")
	@RequestMapping(value = "SvcCheckRole")
	@ElDescription(sub = "화면 권한 여부 조회", desc = "화면에 대한 권한이 있는지 여부를 조회한다.")
	@ElValidator(errUrl = "")
	public RoleCheckVo checkRole(RoleCheckVo vo) throws Exception{
		 return accntService.checkRole(vo.getServiceId(), vo.getRoleCodes());
	 }
}
