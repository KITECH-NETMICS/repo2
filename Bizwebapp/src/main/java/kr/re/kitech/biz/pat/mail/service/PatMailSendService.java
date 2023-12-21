package kr.re.kitech.biz.pat.mail.service;

import java.util.Map;

import kr.re.kitech.biz.pat.com.vo.PatComWFBizVo;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;

/**
* 지재권 메일발송 인터페이스 MailSendService
* @author LeeYH
* @since 2022.07.21.
*/
public interface PatMailSendService {
	/*
	 * 발명신고서 결재완료 후 메일 발송
     */
	public void sendMailPatApr(Map<String,String> map);
	
	/*
	 * PatComService.executePatComWFBiz에서 메일발송 호출
     */
	public void sendMailWFBiz(PatToDoVo vo, PatComWFBizVo bizVo);
	
	/*
	 * PatComService.executePatComWFBiz에서 SMS발송 호출
     */
	public void sendSMSWFBiz(PatToDoVo vo, PatComWFBizVo bizVo);
}
