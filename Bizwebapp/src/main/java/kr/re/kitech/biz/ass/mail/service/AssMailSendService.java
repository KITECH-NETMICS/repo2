package kr.re.kitech.biz.ass.mail.service;

/**
* 자산관리 메일발송 인터페이스 MailSendService
* @author JeonJW
* @since 2022.07.29.
*/
public interface AssMailSendService {
	/*
	 * 자산이동신청(A13), 자산외부설치(A14) 결재완료 후 메일발송
     */
	public void mailSendAssMove(String reqNo, String syspayNo, String reqNoSub);
}
