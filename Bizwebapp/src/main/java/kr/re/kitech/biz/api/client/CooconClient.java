package kr.re.kitech.biz.api.client;

import kr.re.kitech.biz.xom.core.vo.AccountVerfVo;

/**
 * 쿠콘 예금주 조회 API 지원 클래스
 * @author 이영희
 * @since 2022.08.18.
 */
public interface CooconClient {
	/**
     * 계좌검증
     */
	public AccountVerfVo getAccountInfo(AccountVerfVo vo);
}
