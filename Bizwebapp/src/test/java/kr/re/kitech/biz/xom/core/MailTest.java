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
import kr.re.kitech.biz.xom.core.ext.BaseUrlProperty;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;
import kr.re.kitech.biz.xom.core.vo.MailVo;

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
public class MailTest {
	
	Logger log = LoggerFactory.getLogger(LdapTest.class);
			
	@Autowired
	private MailSender mailSender;
	
	
	private void sendMessage(String syspayno, MailVo mailVo){
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
	 * 플랜 텍스트 일괄 발송 테스트
	 */
	//@Test
	public void planTextOnesend(){

		String syspayno = "99999995"; // KitechContextUtil.getSyspayno();
		String bizCode = "CCS";
		
		MailVo mailVo = new MailVo();
		mailVo.setToAddr("eipparkji@kitech.re.kr, eipparkbm@kitech.re.kr");
		mailVo.setSubject("플랜 텍스트 일괄 발송 테스트");
		mailVo.setContent("메일 본문입니다.");
		mailVo.setBusiness(bizCode);
		mailVo.setSavesent(true);
		mailVo.setOnesend(true);
		mailVo.setLogging(true);

		this.sendMessage(syspayno, mailVo);
		System.out.println("플랜 텍스트 일괄 발송 테스트 결과: ");
	}
	
	/**
	 * 플랜 텍스트 개별 발송 테스트
	 */
	//@Test
	public void planText(){

		String syspayno = "99999995"; // KitechContextUtil.getSyspayno();
		String bizCode = "CCS";
		MailVo mailVo = new MailVo();
		mailVo.setToAddr("eipparkji@kitech.re.kr, eipparkbm@kitech.re.kr");
		mailVo.setCcAddr("결재PL <eip3bz.pl@kitech.re.kr>");
		mailVo.setSubject("플랜 텍스트 개별 발송 테스트");
		mailVo.setContent("메일 본문입니다.");
		mailVo.setBusiness(bizCode);
		mailVo.setSavesent(true);
		mailVo.setOnesend(false);	// 개별 발송
		mailVo.setLogging(true);

		this.sendMessage(syspayno, mailVo);
		System.out.println("플랜 텍스트 개별 발송 테스트 결과: ");
	}	

	/**
	 * 싱글 탬플릿 일괄 발송 테스트
	 */
	//@Test
	public void singleTemplateOnesend(){

		String syspayno = "99999995"; // KitechContextUtil.getSyspayno();
		String bizCode = "CCS";
		MailVo mailVo = new MailVo();
		mailVo.setToAddr("eipparkji@kitech.re.kr, eipparkbm@kitech.re.kr");
		mailVo.setCcAddr("결재PL <eip3bz.pl@kitech.re.kr>");
		mailVo.setSubject("싱글 탬플릿 일괄 발송 테스트");
		mailVo.setContent("메일 본문입니다.");
		mailVo.setBusiness(bizCode);
		mailVo.setSavesent(true);
		mailVo.setOnesend(true);
		mailVo.setLogging(true);
		mailVo.setTemplatePath("ccs/CwsNoticeMissTagMail");

		this.sendMessage(syspayno, mailVo);
		System.out.println("싱글 탬플릿 일괄 발송 테스트 결과: ");
	}	
	
	/**
	 * 싱글 탬플릿 개별 발송 테스트
	 * templateVars 개별 발송 리스트를 설정해야 함
	 */
	//@Test
	public void singleTemplate(){
		
		String syspayno = "99999995"; // KitechContextUtil.getSyspayno();
		String bizCode = "CCS";

		MailVo mailVo = new MailVo();
		mailVo.setCcAddr("결재PL <eip3bz.pl@kitech.re.kr>");
		mailVo.setSubject("싱글 탬플릿 개별 발송 테스트");
		mailVo.setContent("메일 본문입니다.");
		mailVo.setBusiness(bizCode);
		mailVo.setSavesent(true);
		mailVo.setOnesend(false);	// 개별 발송
		mailVo.setLogging(true);
		mailVo.setTemplatePath("ccs/CwsNoticeMissTagMail");
		
		MailTemplateVo templateVo1 = new MailTemplateVo();
		templateVo1.setToAddr("eipparkji@kitech.re.kr");
		
		MailTemplateVo templateVo2 = new MailTemplateVo();
		templateVo2.setToAddr("eipparkbm@kitech.re.kr");		
		
		List<MailTemplateVo> templateVars = new ArrayList<>();
		templateVars.add(templateVo1);
		templateVars.add(templateVo2);
		
		mailVo.setTemplateVars(templateVars);

		this.sendMessage(syspayno, mailVo);
		System.out.println("싱글 탬플릿 개별 발송 테스트 결과: ");
	}	
	
	
	/**
	 * 멀티 탬플릿 개별 발송 테스트
	 * 주의) 멀티 탬플릿은 일괄 발송 할 수 없다.
	 */
	//@Test
	public void multiTemplateOnesend(){

		String syspayno = "99999995"; // KitechContextUtil.getSyspayno();
		String bizCode = "CCS";
		MailVo mailVo = new MailVo();

		mailVo.setCcAddr("결재PL <eip3bz.pl@kitech.re.kr>");
		mailVo.setBccAddr("결재DEV <eip3bz.dev1@kitech.re.kr>");
		mailVo.setSubject("@userName@님 멀티 탬플릿 개별 발송 테스트");
		mailVo.setContent("메일 본문입니다.");
		mailVo.setBusiness(bizCode);
		mailVo.setSavesent(true);
		mailVo.setOnesend(false);	// * 주의) 멀티 탬플릿은 일괄 발송 할 수 없다.
		mailVo.setLogging(true);
		mailVo.setTemplatePath("com/DemandReject");
		
		// 템플릿1
		MailTemplateVo templateVo1 = new MailTemplateVo();
		Map<String, String> subjectVar1 = new HashMap<>();
		subjectVar1.put("@userName@", "박정일");
		Map<String, String> contentVar1 = new HashMap<>();
		contentVar1.put("@reqTitle@", "게시판에 글쓰기가 안됩니다.");
		contentVar1.put("@reqDate@", "2021년2월15일");
		contentVar1.put("@reqContntTxt@", "게시판에 !!@!#!$!$% 이런 글씨를 썼는데 안되네요");

		contentVar1.put("@rejectDate@", "2021년3월30일");
		contentVar1.put("@@actnPlanTxt@", "기분이 나쁘니까 반려합니다.");
		contentVar1.put("@actorName@", "결재PL");
		contentVar1.put("@actorDept@", "전자결재");

		templateVo1.setToAddr("eipparkji@kitech.re.kr");
		templateVo1.setContentVar(contentVar1);
		templateVo1.setSubjectVar(subjectVar1);

		// 템플릿1		
		MailTemplateVo templateVo2 = new MailTemplateVo();
		Map<String, String> subjectVar2 = new HashMap<>();
		subjectVar2.put("@userName@", "박병목");
		Map<String, String> contentVar2 = new HashMap<>();
		contentVar2.put("@reqTitle@", "게시판에 글쓰기가 안됩니다.");
		contentVar2.put("@reqDate@", "2021년2월15일");
		contentVar2.put("@reqContntTxt@", "게시판에 !!@!#!$!$% 이런 글씨를 썼는데 안되네요");

		contentVar2.put("@rejectDate@", "2021년3월30일");
		contentVar2.put("@@actnPlanTxt@", "명확히 알 수 없으므로 반려 처리합니다.");
		contentVar2.put("@actorName@", "결재PL");
		contentVar2.put("@actorDept@", "전자결재");

		templateVo2.setToAddr("eipparkbm@kitech.re.kr");
		templateVo2.setContentVar(contentVar2);
		templateVo2.setSubjectVar(subjectVar2);		
		
		List<MailTemplateVo> templateVars = new ArrayList<>();
		templateVars.add(templateVo1);
		templateVars.add(templateVo2);

		mailVo.setTemplateVars(templateVars);

		this.sendMessage(syspayno, mailVo);
		System.out.println("멀티 탬플릿 개별 발송 테스트 결과: ");
	}
	
	// @Test
	public void sendAprComplete() {
		String initiator = "mklee";
		String toAddress = initiator += "@kitech.re.kr";
		String linkUrl = BaseUrlProperty.newBizUrl + "?serviceid=A006" + "&reqNo=C76202204016";

		Map<String, String> subjectVar = new HashMap<>();
		subjectVar.put("@reqNo@", "신청번호");
		subjectVar.put("@reqNm@", "양식명");
		
		Map<String, String> contentVar = new HashMap<>();
		contentVar.put("@reqInfo@", "제 목");
		contentVar.put("@reqNm@", "신청서명");
		contentVar.put("@reqNo@", "신청번호");
		contentVar.put("@actorName@", "최종결재자");
		contentVar.put("@@snapShot@", "<a href='"+ linkUrl + "' target='_blank' > 완료결재 원문보기 </a>");

		MailTemplateVo templateVo = new MailTemplateVo();
		templateVo.setContentVar(contentVar);
		templateVo.setSubjectVar(subjectVar);

		List<MailTemplateVo> templateVars = new ArrayList<>();
		templateVars.add(templateVo);		
		
		// 전자결재 완료 메일 발송
		this.mailSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMail.Builder("99999995", Business.APR, false)
				.subject("[전자결재] @reqNo@(@reqNm@) 전자결재가 완료 되었습니다.")
				.templatePath("apr/CompleteAPR")
				.templateVars(templateVars)
				.toAddr(toAddress)
				.savesent(false)	// 받은 편지함 저장 여부
				.logging(true)		// 로그 저장 여부
			.build());	
	}
	
	
	@Test
	public void sendAprReject() {
		String initiator = "eipparkji";
		String toAddress = initiator += "@kitech.re.kr";
		String linkUrl = BaseUrlProperty.newBizUrl + "?serviceid=A009" + "&reqNo=C76202204016";

		Map<String, String> subjectVar = new HashMap<>();
		subjectVar.put("@reqNo@", "신청번호");
		subjectVar.put("@reqNm@", "양식명");
		
		Map<String, String> contentVar = new HashMap<>();
		contentVar.put("@reqInfo@", "제 목");
		contentVar.put("@reqNm@", "신청서명");
		contentVar.put("@reqNo@", "신청번호");
		
		contentVar.put("@actorName@", "반려자");
		contentVar.put("@rejectComment@", "반려의견");
		contentVar.put("@@snapShot@", "<a href='"+ linkUrl + "' target='_blank'> 완료결재 원문보기 </a>");

		MailTemplateVo templateVo = new MailTemplateVo();
		templateVo.setContentVar(contentVar);
		templateVo.setSubjectVar(subjectVar);

		List<MailTemplateVo> templateVars = new ArrayList<>();
		templateVars.add(templateVo);		
		
		// 전자결재 완료 메일 발송
		this.mailSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMail.Builder("99999995", Business.APR, false)
				.subject("[전자결재] @reqNo@(@reqNm@) 전자결재가 반려 되었습니다.")
				.templatePath("apr/RejectAPR")
				.templateVars(templateVars)
				.toAddr(toAddress)
				.savesent(false)	// 받은 편지함 저장 여부
				.logging(true)		// 로그 저장 여부
			.build());	
	}	
}