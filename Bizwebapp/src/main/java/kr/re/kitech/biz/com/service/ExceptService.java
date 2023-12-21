package kr.re.kitech.biz.com.service;

import java.util.List;

import kr.re.kitech.biz.com.enums.ExceptKind;
import kr.re.kitech.biz.com.vo.ExceptItemListVo;
import kr.re.kitech.biz.com.vo.ExceptItemVo;

/**
 * 예외처리의 최상위 인터페이스
 * 사람, 계정번호, 회계코드 .. 관리 데이터에 따라 구현체를 생성하여 구현한다.
 *
 * @author James
 * @since 2023. 4. 5.
 */
public interface ExceptService {


	/**
	 * 서비스 아이디의 허용 또는 금지 예외 처리 조건 확인
	 * 
	 * @param type
	 * @param serviceid
	 * @param isAllow 허용 | 금지
	 * @return
	 */
	public boolean isExcept(ExceptKind type, String serviceid, String value, Boolean isAllow);
	

	/**
	 * 서비스 아이디의 허용 예외 처리 조건 확인
	 * 
	 * @param kind
	 * @param serviceid
	 * @return
	 */
	public boolean isExcept(ExceptKind kind, String serviceid, String value);
	
	
	/**
	 * 서비스 아이디의 허용 예외 처리 조건 확인
	 *
	 * @param exceptItemVo
	 * @return
	 */
	public boolean isExcept(ExceptItemVo exceptItemVo);
	
	
	/**
	 * @param exceptItemVo
	 * @return
	 */
	public List<String> getExceptValues(ExceptItemVo exceptItemVo);
	
	/**
	 * @param exceptItemVo
	 * @return ExceptItemListVo
	 */
	public ExceptItemListVo selectExceptItemList(ExceptItemVo exceptVo);
	
	/**
	* @param exceptItemVo
	* @return ExceptItemListVo
	*/
	public int saveExceptItemList(ExceptItemListVo exceptVo) throws Exception;
}
