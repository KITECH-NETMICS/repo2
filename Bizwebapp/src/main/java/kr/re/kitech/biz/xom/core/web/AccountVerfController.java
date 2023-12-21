package kr.re.kitech.biz.xom.core.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.xom.core.service.AccountVerfService;
import kr.re.kitech.biz.xom.core.vo.AccountVerfListVo;
import kr.re.kitech.biz.xom.core.vo.AccountVerfVo;

/**
 * @author LeeYH-PC
 * 계좌검증 컨트롤러
 */
@Controller 
public class AccountVerfController {
	@Resource(name="accountVerfService")
	private AccountVerfService service;
	
	@ElService(key = "SvcAccountVerf")
	@RequestMapping(value = "SvcAccountVerf")
	@ElDescription(sub = "계좌검증", desc = "단건 계좌검증을 처리한다.")
	@ElValidator(errUrl = "")
	public AccountVerfVo proccessAccountVerf(AccountVerfVo vo) throws Exception{
		return service.proccessAccountVerf(vo);
	}
	
	@ElService(key = "SvcAccountVerfMulti")
	@RequestMapping(value = "SvcAccountVerfMulti")
	@ElDescription(sub = "계좌검증 다건 처리", desc = "다건의 계좌에 대한 검증처리를 한다.")
	@ElValidator(errUrl = "")
	public AccountVerfListVo proccessAccountVerfList(AccountVerfListVo voList) throws Exception{
		AccountVerfListVo retVo = new AccountVerfListVo();
		retVo.setAccList(service.proccessAccountVerfList(voList));
		return retVo;
	}
}
