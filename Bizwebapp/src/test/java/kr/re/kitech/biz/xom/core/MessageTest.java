/**
 * 
 */
package kr.re.kitech.biz.xom.core;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Messages;
import kr.re.kitech.biz.xom.base.enums.MsgKeys;
import kr.re.kitech.biz.xom.core.model.BizMsg;
import kr.re.kitech.biz.xom.core.util.MessageSender;
import kr.re.kitech.biz.xom.core.vo.MsgTemplateVo;
import kr.re.kitech.biz.xom.core.vo.MsgVo;

/**
 * 
 * @author James
 * @since 2022. 3. 28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		  "file:src/main/resources/inswave/spring/context-common.xml"
		, "file:src/main/resources/inswave/spring/context-properties.xml"
		, "file:src/main/resources/inswave/spring/context-sqlMap.xml"
		, "file:src/main/resources/inswave/spring/context-transaction.xml"
		, "file:src/main/resources/inswave/spring/context-validator.xml"
		, "file:src/main/resources/inswave/spring/mybatis-config.xml"
		, "file:src/test/resources/inswave/spring/context-datasource.xml"
		, "file:src/test/resources/inswave/spring/context-inswave.xml"
		, "file:src/main/webapp/WEB-INF/config/**/*.xml"
})
public class MessageTest {
Logger log = LoggerFactory.getLogger(MailTest.class);
			
	@Autowired
	private MessageSender messageSender;
	
	
	private void sendMessage(String syspayno, MsgVo msgVo){
		
		Map<String,String> sender = null;
		if (null != msgVo.getSendPhone()){
			sender = new HashMap<>();
			sender.put( MsgKeys.SEND_NAME.getCode(), msgVo.getSendName());
			sender.put( MsgKeys.SEND_PHONE.getCode(), msgVo.getSendPhone());
			sender.put( MsgKeys.SEND_SYSPAYNO.getCode(), msgVo.getSendSyspayno());
		}

		Map<String,String> reciever = new HashMap<>();
		reciever.put( MsgKeys.DEST_NAME.getCode(), msgVo.getDestName());
		reciever.put( MsgKeys.DEST_PHONE.getCode(), msgVo.getDestPhone());
		reciever.put( MsgKeys.DEST_SYSPAYNO.getCode(), msgVo.getDestSyspayno());		

		messageSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMsg.Builder(syspayno, Business.valueOf(msgVo.getBusiness()), Messages.valueOf(msgVo.getMessages()))
				.templateCode(msgVo.getTemplateCode())
				.templateVars(msgVo.getTemplateVars())
				.subject(msgVo.getSubject())
				.msgBody(msgVo.getMsgBody())
				.sender(sender)
				.reciever(reciever)
				.businessYn(msgVo.getBusinessYn())
				.logging(true)
			.build());
	}

	
	/**
	 * 플랜 텍스트 단건 발송 테스트
	 */
	//@Test
	public void planText(){

		String syspayno = "99999995"; // KitechContextUtil.getSyspayno();
		String business = Business.XOM.getName();
		String messages = Messages.SMS_MSG.getName();
		
		MsgVo msgVo = new MsgVo();
		msgVo.setMessages(messages);
		msgVo.setBusiness(business);
		
		// msgVo.setSendTime("2022");
		msgVo.setSubject("SMS 단건 발송 테스트 제목");
		msgVo.setMsgBody("SMS 단건 발송 테스트 본문");
		msgVo.setDestName("박정일");
		msgVo.setDestPhone("01092546288");
		msgVo.setDestSyspayno("99999995");
		msgVo.setBusinessYn("N");

		this.sendMessage(syspayno, msgVo);
		System.out.println("플랜 텍스트 일괄 발송 테스트 결과: ");
	}
	
	/**
	 * 플랜 텍스트 다건 LMS 발송 테스트
	 */
	//@Test
	public void staticTemplateToMultiLMS(){

		String syspayno = "99999995"; // KitechContextUtil.getSyspayno();
		String business = Business.XOM.getName();
		String messages = Messages.LMS_MSG.getName();
		
		MsgVo msgVo = new MsgVo();
		msgVo.setMessages(messages);
		msgVo.setBusiness(business);
		
		// msgVo.setSendTime("2022");
		msgVo.setSubject("LMS 단건 발송 테스트 제목");
		msgVo.setMsgBody("LMS 단건 발송 테스트 본문");
		msgVo.setBusinessYn("N");
		msgVo.setTemplateCode("bizp_2019121423321030063559493");
		
		MsgTemplateVo templateVar1 = new MsgTemplateVo();
		templateVar1.setDestName("박정일");
		templateVar1.setDestPhone("01092546288");
		templateVar1.setDestSyspayno("99999995");
		
		MsgTemplateVo templateVar2 = new MsgTemplateVo();
		templateVar2.setDestName("박병목");
		templateVar2.setDestPhone("01030511942");
		templateVar2.setDestSyspayno("99997994");	
		
		List<MsgTemplateVo> templateVars = new ArrayList<>();	
		templateVars.add(templateVar1);
		templateVars.add(templateVar2);		
		
		msgVo.setTemplateVars(templateVars);

		this.sendMessage(syspayno, msgVo);
		System.out.println("정적 템플릿 다건 발송 테스트 결과: ");
	}
	
	
	private List<Map<String,String>> getSampleData(){
		Map<String,String> data1 = new HashMap<>();
		data1.put("name", "박정일");
		data1.put("tel", "01092546288");
		data1.put("syspayno", "99999995");
		data1.put("var", "James");
		
		Map<String,String> data2 = new HashMap<>();
		data2.put("name", "박병목");
		data2.put("tel", "01030511942");
		data2.put("syspayno", "99997994");
		data2.put("var", "Monky");
		
		List<Map<String,String>> result = new ArrayList<>();
		result.add(data1);
		result.add(data2);
		return result;	
	}	
	

	/**
	 * 플랜 텍스트 다건 LMS 발송 테스트
	 */
	@Test
	public void dynamicTemplateToMultiAT(){

		String syspayno = "99999995"; // KitechContextUtil.getSyspayno();
//		String business = Business.XOM.getName();
//		String messages = Messages.AT_MSG.getName();
//		
//		MsgVo msgVo = new MsgVo();
//		msgVo.setMessages(messages);
//		msgVo.setBusiness(business);
//
//		msgVo.setSubject("AT 단건 발송 테스트 제목");
//		msgVo.setMsgBody("AT 단건 발송 테스트 본문");
//		msgVo.setBusinessYn("N");
//		msgVo.setTemplateCode("bizp_2019121500241118033664447");
		
		
		// 발신자 처리
//		Map<String,String> sender = new HashMap<>();
//		sender.put( MsgKeys.SEND_NAME.getCode(), "");
//		sender.put( MsgKeys.SEND_PHONE.getCode(), "");
//		sender.put( MsgKeys.SEND_SYSPAYNO.getCode(), "");

		List<MsgTemplateVo> templateVars = new ArrayList<>();
		for (Map<String,String> data : this.getSampleData()){
			MsgTemplateVo templateVar = new MsgTemplateVo();

			// 수신자 처리
			templateVar.setDestName( data.get("name"));
			templateVar.setDestPhone( data.get("tel"));
			templateVar.setDestSyspayno( data.get("syspayno"));		

			// 템플릿 변수 처리
			Map<String, String> contentVar = new HashMap<>();
			contentVar.put("성명", data.get("var"));		
			templateVar.setContentVar( contentVar);
			templateVars.add(templateVar);
		}

		messageSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMsg.Builder(syspayno, Business.XOM, Messages.AT_MSG)
				.templateCode("bizp_2019121500241118033664447")
				.templateVars(templateVars)
				.businessYn("N")
			.build());

	}	
		
	

	
}