package kr.re.kitech.biz.xom.core.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.enums.MsgKeys;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.model.BizMsg;
import kr.re.kitech.biz.xom.core.service.LoggingService;
import kr.re.kitech.biz.xom.core.service.MsgService;
import kr.re.kitech.biz.xom.core.vo.MsgTemplateVo;
import kr.re.kitech.biz.xom.core.vo.MsgVo;

/**
 * 메시지 발송 지원 클래스
 *
 * @author James
 * @since 2022. 4. 05.
 */
@Component("messageSender")
public class MessageSender {

    @Value("${message.isExecute}")
    private Boolean exceute;
    
    @Value("${message.default.sender.name}")
    private String senderName;
    
    @Value("${message.default.sender.phone}")
    private String senderPhone;

    @Value("${message.default.sender.syspayno}")
    private String senderSyspayno;
    
    @Value("${message.sender.key}")
    private String senderKey;    
    
    @Value("${message.nation.code}")
    private String nationCode;      

	@Resource(name = "msgServiceImpl")
	private MsgService msgService;


	@Resource(name = "loggingServiceImpl")
	private LoggingService loggingService;

	public Boolean isExecute() {
		return this.exceute;
	}
    	
	/**
	 * [내부 메소드]
	 * 메일 템플릿 콘텐츠 내용중 템플릿 변수의 값을 치환한 후 반환한다. 
	 * 템플릿 변수가 맵 형태이므로 반환되는 탬플릿도 단건(스트링)이다.
	 *
	 * @param templateCode
	 * @param contentVar
	 * @return
	 * @throws Exception
	 */
	private String getTemplateContent(String templateCode, Map<String,String> contentVar) throws Exception {
		String content = this.msgService.getContentStrByTemplateCode(templateCode);
		if (null != contentVar && 0 < contentVar.size()) {
			for (String key : contentVar.keySet()) {
				content = content.replaceAll("\\#\\{"+ key +"\\}", contentVar.get(key));
			}
		}
		return content;
	}
	
	/**
	 * [내부 메소드]
	 * 템플릿 변수 파라미터가 없는 타입이므로 메일 템플릿 콘텐츠 내용을 가져온다.
	 *
	 * @param templateCode
	 * @return
	 * @throws Exception
	 */
	private String getTemplateContent(String templateCode) throws Exception {
		return this.getTemplateContent(templateCode, null);
	}	
	
	
	/**
	 * History 를 저장한다.
	 *
	 * @param mail
	 * @param isSuccess
	 * @return
	 * @throws InterruptedException
	 */
	private boolean saveHistory(MsgVo msgVo, boolean isSuccess) throws Exception {
		
		Map<String,String> msgSendLog = new HashMap<>();
		msgSendLog.put( "is_success", isSuccess ? "t" : "f");
		msgSendLog.put( "syspayno", msgVo.getRegst_syspayno());
		msgSendLog.put( "cmid", String.valueOf(msgVo.getCmid()));
		msgSendLog.put( "subject", msgVo.getSubject());
		msgSendLog.put( "business_yn", msgVo.getBusinessYn());
		msgSendLog.put( "send_phone", msgVo.getSendPhone());
		msgSendLog.put( "send_name", msgVo.getSendName());
		msgSendLog.put( "send_syspayno", msgVo.getSendSyspayno());
		msgSendLog.put( "dest_phone", msgVo.getDestPhone());
		msgSendLog.put( "dest_name", msgVo.getDestName());
		msgSendLog.put( "dest_syspayno", msgVo.getDestSyspayno());
		msgSendLog.put( "msg_body", msgVo.getMsgBody());
		msgSendLog.put( "send_time", msgVo.getSendTime());
		msgSendLog.put( "re_type", msgVo.getReType());
		msgSendLog.put( "msg_type", String.valueOf(msgVo.getMsgType()));
		msgSendLog.put( "template_code", msgVo.getTemplateCode());
		
		return (0 < loggingService.insertMsgSendLog(msgSendLog));
	}
	
	private String getDefaultSendTime(){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formatter.format(Calendar.getInstance().getTime());	
	}
	
	private Map<String,String> getDefaultSender(){
		Map<String,String> sender = new HashMap<>();
		sender.put( MsgKeys.SEND_NAME.getCode(), this.senderName);
		sender.put( MsgKeys.SEND_PHONE.getCode(), this.senderPhone);
		sender.put( MsgKeys.SEND_SYSPAYNO.getCode(), this.senderSyspayno);
		return sender;
	}
	
	/**
	 * 아래 케이스에 대한 메일을 발송한다.
	 *
	 * 1. SMS 메시지 발송
	 * 2. LMS 메시지 발송
	 * 3. MMS 메시지 발송
	 * 4. AT 알림톡 발송
	 * 5. FT 친구톡 발송
	 * @param mail BizMessage 객체
	 * @throws Exception 모든 예외를 던진다.
	 */
	public void sendMessage(BizMsg message){

		try {
			if (this.isExecute()) {
				MsgVo param = message.toMsgVo( this.getDefaultSendTime(), this.getDefaultSender(), this.senderKey, this.nationCode);
				String templateCode = message.getTemplateCode();
				if (null == templateCode) {
	
					// 1. 템플릿코드가 없는 경우
					boolean isSuccess = this.msgService.insertMessage(param);	// 일반 문자열 발송
					if (message.isLogging()){
						this.saveHistory( param, isSuccess);
					}
				} else {
	
					// 2. 템플릿코드가 있는 경우
					List<MsgTemplateVo> templateVars = message.getTemplateVars();
					if (null == templateVars){
	
						// 2-1) 템플릿변수가 없는 경우: 템플릿 코드로 내용을 치환한다.
						param.setMsgBody( this.getTemplateContent( templateCode));
						boolean isSuccess = this.msgService.insertMessage(param);	// 단건 템플릿 발송
						if (message.isLogging()){
							this.saveHistory( param, isSuccess);
						}
					} else {
	
						// 2-2) 템플릿변수가 있는 경우: 템플릿 코드로 내용 변경 및 수신자를 설정한다.
						for (MsgTemplateVo templateVar : templateVars){
							@SuppressWarnings("unchecked")
							Map<String,String> contentVar = templateVar.getContentVar();
							param.setMsgBody( this.getTemplateContent( templateCode, contentVar));
							param.setDestName( templateVar.getDestName());
							param.setDestPhone( templateVar.getDestPhone());
							param.setDestSyspayno( templateVar.getDestSyspayno());
							param.setSubject( templateVar.getSubject());
							param.setCmid( System.nanoTime());
							boolean isSuccess = this.msgService.insertMessage(param);	// 다건 템플릿 발송
							if (message.isLogging()){
								this.saveHistory( param, isSuccess);
							}	
						}
					}
				}
			}
		} catch (Exception ex) {
			AppLog.error("메시지 기타 시스템 오류", ex);
			throw new KitechException( Exceptions.ERROR, Business.XOM, "message.xom.co.send.msg.error", ex);	
		} 
	}
}
