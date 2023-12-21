package kr.re.kitech.biz.com.sms.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.util.ControllerContextUtil;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;

import kr.re.kitech.biz.com.sms.dao.MsgSendLogDAO;
import kr.re.kitech.biz.com.sms.service.MsgSendLogService;
import kr.re.kitech.biz.com.sms.vo.MsgSendLogVo;

@Service("MsgSendLogServiceImpl")
public class MsgSendLogServiceImpl  extends EgovAbstractServiceImpl implements MsgSendLogService {
  @Resource(name="MsgSendLogDAO")
  private MsgSendLogDAO smsDAO;
    
	@Resource(name="mailSender")
	private MailSender mailSender;

  @Override
  public List<MsgSendLogVo> selectList() throws ElException {
    List<MsgSendLogVo> list = smsDAO.selectList();
    return list;
  }

  @Override
  public List<MsgSendLogVo> selectListItem(MsgSendLogVo vo) throws ElException {
    List<MsgSendLogVo> list = smsDAO.selectListItem(vo);	
    return list;
  }

  @Override
  public MsgSendLogVo selectSingleItem(MsgSendLogVo SmsVo) throws ElException {
    MsgSendLogVo resultVO = smsDAO.selectSingleItem(SmsVo);			
      return resultVO;
  }

  @Override
	public int insertItem(MsgSendLogVo vo) throws ElException, IOException {
    int result = smsDAO.insertItem(vo);
    return result;
	}

  @Override
	public int updateItem(MsgSendLogVo vo) throws Exception {
    int result = smsDAO.updateItem(vo);
		return result;
	}

  @Override
	public int deleteItem(MsgSendLogVo SmsVo) throws Exception {
		return smsDAO.deleteItem(SmsVo);
	}

  @Override
	public void smsMailSend(MsgSendLogVo smsVo) throws ElException {
		MailTemplateVo templateVo = new MailTemplateVo();
		Map<String, String> templateVar = new HashMap<String, String>();
		BizUserHeader siteUserHeader = (BizUserHeader)ControllerContextUtil.getUserHeader();
		
		
		// templateVar.put("@data@", smsVo.getDataName());
		
		String subject = "subject";
		String templatePath = "com/TemplateMailName";
		String syspayno = siteUserHeader.getSession().getSn();
		// String toAddr = smsDAO.selectReqPsnEmail(smsVo).getEmail();
		String sender = siteUserHeader.getSession().getUid() + "@kitech.re.kr";
		
		templateVo.setContentVar(templateVar);
		List<MailTemplateVo> templateVars = new ArrayList<>();
		templateVars.add(templateVo);
		
		mailSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMail.Builder(syspayno, Business.COM, true)
				.senderEmail(sender.trim())
				//.toAddr(toAddr.trim())
				//.ccAddr(ccAddress)
				.subject(subject)
				.savesent(false)	// 받은 편지함 저장 여부
				.logging(true)	// 로그 저장 여부
				.templatePath(templatePath)
				.templateVars(templateVars)
			.build());
	}

}
