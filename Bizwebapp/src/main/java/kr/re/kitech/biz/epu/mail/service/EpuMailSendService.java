package kr.re.kitech.biz.epu.mail.service;

/**
* 구매조달 메일발송 인터페이스 MailSendService
* @author LeeYH
* @since 2022.07.19.
*/
public interface EpuMailSendService {
	/*
	 * 발주계획 결재완료 후 메일 발송
     */
	public void sendMailBidApr(String reqNo);
}
