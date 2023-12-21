package kr.re.kitech.biz.res.mail.service;

import java.util.List;
import java.util.Map;

import kr.re.kitech.biz.api.server.vo.biz.ResSmlRvewDRstVo;

/**
* 연구관리 메일발송 인터페이스 MailSendService
* @author LeeYH
* @since 2022.07.06.
*/
public interface ResMailSendService {
	/*
	 * 기술이전 계약 결재완료 후 메일 발송
     */
	public void sendMailTechApr(String reqNo);
	
	/*
	 * 소연심의 결과보고 결재완료 후 메일 발송
     */
	public void sendRvewRstMail(List<ResSmlRvewDRstVo> voList);
	
	public void sendRvewRstMailtest();
	
	/*
	 * 사업신청 사업선정 후 메일 발송
     */
	public void sendBsnsSeltRst(Map<String,String> map);
		
}
