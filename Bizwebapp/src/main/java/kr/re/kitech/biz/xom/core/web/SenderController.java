package kr.re.kitech.biz.xom.core.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Messages;
import kr.re.kitech.biz.xom.base.enums.MsgKeys;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.model.BizMsg;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.util.MessageSender;
import kr.re.kitech.biz.xom.core.vo.MailVo;
import kr.re.kitech.biz.xom.core.vo.MsgVo;
import kr.re.kitech.biz.xom.core.vo.UserListVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * 업무 메일 또는 메시지 발송 컨트롤러
 *
 * @author James
 * @since 2022. 3. 29.
 */
@Controller 
public class SenderController { 

	@Autowired
	private MailSender mailSender;

    
	@Autowired
	private MessageSender messageSender;
	
	
	@Resource(name="accntServiceImpl")
	private AccntService accntService;
	
        

	/**
	 * 업무 메일을 전송한다.
	 */
	@ElService(key = "SvcSendMail")
    @RequestMapping(value = "SvcSendMail")    
    @ElDescription(sub = "업무 메일을 전송한다.", desc = "업무 메일을전송한다.")
	@ElValidator(errUrl = "")               
    public void sendMail(MailVo mailVo) throws Exception { 
		AppLog.debug("업무 메일을 전송: " + mailVo);
		String syspayno = KitechContextUtil.getSyspayno();
		mailSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMail.Builder(syspayno, Business.valueOf(mailVo.getBusiness()), mailVo.isOnesend())
				.templatePath(mailVo.getTemplatePath())
				.templateVars(mailVo.getTemplateVars())
				.senderEmail(mailVo.getFromAddr())
				.toAddr(mailVo.getToAddr()) 
				.ccAddr(mailVo.getCcAddr())
				.bccAddr(mailVo.getBccAddr())
				.subject(mailVo.getSubject())
				.content(mailVo.getContent())
				.savesent(mailVo.isSavesent())	// 받은 편지함 저장 여부
				.logging(mailVo.isLogging())	// 로그 저장 여부
			.build());
    }
    
	/**
	 * 업무 메시지를 전송한다.
	 */
	@ElService(key = "SvcSendMessage")
    @RequestMapping(value = "SvcSendMessage")    
    @ElDescription(sub = "업무 메시지를 전송한다.", desc = "업무 메시지를 전송한다.")
	@ElValidator(errUrl = "")               
    public void sendMessage(MsgVo msgVo) throws Exception { 
		AppLog.debug("업무 메시지  전송: " + msgVo);	

		// 발신자가 있는 경우 세팅.
		Map<String,String> sender = null;
		if (StringUtils.isNotEmpty(msgVo.getSendPhone())){
			sender = new HashMap<>();
			sender.put( MsgKeys.SEND_NAME.getCode(), msgVo.getSendName());
			sender.put( MsgKeys.SEND_PHONE.getCode(), msgVo.getSendPhone());
			sender.put( MsgKeys.SEND_SYSPAYNO.getCode(), msgVo.getSendSyspayno());
		}

		// 단건 메시지를 발송할때 템플릿에 수신자를 포함하지 않고 단순하게 사용할 수 있도록 처리
		Map<String,String> reciever = null;
		if (StringUtils.isNotEmpty(msgVo.getDestPhone())){
			reciever = new HashMap<>();
			reciever.put( MsgKeys.DEST_NAME.getCode(), msgVo.getDestName());
			reciever.put( MsgKeys.DEST_PHONE.getCode(), msgVo.getDestPhone());
			reciever.put( MsgKeys.DEST_SYSPAYNO.getCode(), msgVo.getDestSyspayno());	
		}

		messageSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMsg.Builder(KitechContextUtil.getSyspayno(), Business.valueOf(msgVo.getBusiness()), Messages.valueOf(msgVo.getMessages()))
				.templateCode(msgVo.getTemplateCode())
				.templateVars(msgVo.getTemplateVars())
				.subject(msgVo.getSubject())	// SMS | AT | FT 의 경우 무시
				.msgBody(msgVo.getMsgBody())	// AT | FT 의 경우 무시
				.sender(sender)					// 발신자가 Null 경우 기본 발신자로 설정
				.reciever(reciever)				// 다건의 경우 템플릿변수에 설정된 수신자로 대상 변경 됨
				.businessYn(msgVo.getBusinessYn())
				.logging(msgVo.isLogging())	// 로그 저장 여부
			.build());
    }    
    
	/**
	 * 메시지 발송을 위한 사용자 정보에 해당하는 모바일 정보를 조회한다.
	 */
	@ElService(key = "SvcGetMobileInfos")
    @RequestMapping(value = "SvcGetMobileInfos")    
    @ElDescription(sub = "다건 사용자의 모바일 발송 정보 리스트를 조회", desc = "다건 사용자의 모바일 발송 정보를 리스트를 조회한다.")
	@ElValidator(errUrl = "")                   
    public UserListVo getMobileInfos(UserListVo userListVo) throws Exception {
    	
    	List<UserVo> users = new ArrayList<>(); 
    	userListVo.getUsers().forEach(user -> {
    		UserVo result = accntService.findUserByUsername(user.getUid());    
    		AppLog.debug("메시지 수신 대상자 >>>> " + result);		
    		users.add(result);
    	});
    	userListVo.setUsers(users);
    	
    	return userListVo;
    }
}
