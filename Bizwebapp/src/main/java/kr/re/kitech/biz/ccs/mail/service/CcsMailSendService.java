package kr.re.kitech.biz.ccs.mail.service;

import kr.re.kitech.biz.api.server.vo.ApiBpmVo;

/**
 * 총무관리 메일발송 인터페이스
 * @author 이영희
 * @since 2022.08.09.
 */
public interface CcsMailSendService {
	/*
     * 해외출장복명서(C75) 결재완료 후 메일발송
	 */
	public void mailSendOverTripApr(ApiBpmVo vo);
}
