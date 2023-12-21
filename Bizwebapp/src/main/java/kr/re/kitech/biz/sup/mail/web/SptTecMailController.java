package kr.re.kitech.biz.sup.mail.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.sup.mail.service.SptTecMailService;
import kr.re.kitech.biz.sup.mail.vo.SptTecAdjstSlipListVo;

@Controller
public class SptTecMailController {
	@Resource(name="sptTecMailService")
	private SptTecMailService mailService;
	
	@ElService(key = "SvcSUPMALADJO01")
	@RequestMapping(value = "SvcSUPMALADJO01")
	@ElDescription(sub = "미수수탁정산결의 정산신청 이메일 발송", desc = "")
	@ElValidator(errUrl = "")
	public void sendSptUnpaidReq(SptTecAdjstSlipListVo vo) throws Exception{
		mailService.sendSptUnpaidReq(vo.getSlipList());
	}
}
