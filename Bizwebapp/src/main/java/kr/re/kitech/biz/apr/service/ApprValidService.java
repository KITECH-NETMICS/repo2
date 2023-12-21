/**
 * 
 */
package kr.re.kitech.biz.apr.service;

import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * 
 * @author James
 * @since 2023. 1. 17.
 */
public interface ApprValidService {
	/**
	 * 인터페이스 테이블의 상태값이 유효한지 체크한다.
	 * @param reqNo
	 * @return boolean 상신 전 상태이면 true
	 */
	public boolean isWaitStateAtIntfatab(String serviceid, String reqNo) throws KitechException;
}
