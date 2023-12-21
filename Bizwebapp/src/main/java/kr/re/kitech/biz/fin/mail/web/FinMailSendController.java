package kr.re.kitech.biz.fin.mail.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.mail.service.FinMailSendService;
import kr.re.kitech.biz.fin.tax.vo.FinPurTaxSrcVo;
import kr.re.kitech.biz.fin.tax.vo.FinTaxSearchVo;

@Controller
public class FinMailSendController {
	@Resource(name="finMailSendService")
	private FinMailSendService mailService;
	
	@ElService(key = "SvcFINMALM01")
	@RequestMapping(value = "SvcFINMALM01")
	@ElDescription(sub = "매출계산서(관) 미처리메일 발송", desc = "")
	@ElValidator(errUrl = "")
	public void sendFtxBillUnprcsEmail(FinTaxSearchVo vo) throws Exception{
		mailService.sendFtxBillUnprcsEmail(vo);
	}
	
	@ElService(key = "SvcFINMALM02")
	@RequestMapping(value = "SvcFINMALM02")
	@ElDescription(sub = "매입계산서(관) 미처리이메일 발송", desc = "")
	@ElValidator(errUrl = "")
	public void sendKtxBillUnprcsEmail(FinPurTaxSrcVo vo) throws Exception{
		mailService.sendKtxBillUnprcsEmail(vo);
	}
}
