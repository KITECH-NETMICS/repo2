package kr.re.kitech.biz.kbk.lib.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ControllerContextUtil;

import kr.re.kitech.biz.kbk.lib.dao.LibDAO;
import kr.re.kitech.biz.kbk.lib.service.LibService;
import kr.re.kitech.biz.kbk.lib.vo.LibCopyVo;
import kr.re.kitech.biz.kbk.lib.vo.LibLoanVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;

@Service("libService")
public class LibServiceImpl implements LibService {

	@Resource(name="libDAO")
	LibDAO libDAO;
	
	@Resource(name="mailSender")
	private MailSender mailSender;

	@Override
	public List<LibCopyVo> selectCopyList(LibCopyVo vo) throws KitechException {
		return libDAO.selectCopyList(vo);
	}
	
	@Override
	public List<LibLoanVo> selectLoanList(LibLoanVo vo) throws KitechException {
	
		List<LibLoanVo> returnVo = null;
		String flag = vo.getFlag();
		
		if(flag.equals("loan") ||  flag.equals("retrngrid")){
			returnVo = libDAO.selectLoanList(vo);
		}else{
			returnVo = libDAO.selectReservList(vo);
		}
	
		return returnVo;
	}
	
	
	@Override
	public void updateReserv(LibLoanVo vo) throws KitechException {
		libDAO.updateReserv(vo);
	}
	
	
	@Override
	public void selectKbkLibMailSend(LinkedList<LinkedHashMap<String, Object>> list) throws KitechException {
		BizUserHeader siteUserHeader = (BizUserHeader)ControllerContextUtil.getUserHeader();
		
		String syspayno = siteUserHeader.getSession().getSn();
		String sender = siteUserHeader.getSession().getEmail();
		String empNo = siteUserHeader.getSession().getEmpno();
		String cn = siteUserHeader.getSession().getCn();
		String toAddr = "aroma@kitech.re.kr";
		//String toAddr = "eip3da.dev1@kitech.re.kr"; //테스트
		//String sender = "eip3da.dev1@kitech.re.kr"; //테스트
		String subject = "도서 예약연장신청 안내";
		String templatePath = "kbk/KbkLoanMailSend";
		StringBuilder format = new StringBuilder("");
		format.append(" <div id='kitech-mailer-template-row'>");
		format.append(" <div id='kitech-mailer-template-data1'>%s</div> ");
		format.append(" <div id='kitech-mailer-template-data2'>%s</div> ");
		format.append(" <div id='kitech-mailer-template-data3'>%s</div> ");
		format.append(" </div> ");
		
		List<MailTemplateVo> templateVars = null;
		MailTemplateVo templateVo = null;
		Map<String, String> templateVar = null;
		StringBuilder data = null;
		templateVars = new ArrayList<MailTemplateVo>();
		data = new StringBuilder("");
		for(LinkedHashMap<String, Object> map : list) {
			templateVo = new MailTemplateVo();
			data.append(String.format(format.toString(), map.get("loan_no"), map.get("book_nm"), cn+"("+empNo+")"));
		}
		
		templateVar = new LinkedHashMap<String, String>();
		templateVar.put("@@data@", data.toString());
		
		templateVo.setContentVar(templateVar);
		templateVars.add(templateVo);
		
		try{	
			mailSender.sendMessage(
			new BizMail.Builder(syspayno, Business.KBK, true)
				.senderEmail(sender)
				.toAddr(toAddr)
				.subject(subject)
				.savesent(false)
				.logging(true)
				.templatePath(templatePath)
				.templateVars(templateVars)
			.build());
		}catch(Exception e){
			AppLog.debug("\n ------------------------ 예약연장 메일 오류 발생", e);
		}
	}
	
	
	
}