package kr.re.kitech.biz.apr.enums;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

import kr.re.kitech.biz.xom.base.enums.EnumMapperType;
/**
 * 결재 상태 열거형
 *
 * @author James
 * @since 2022. 3. 11.
 */
public enum AprSearch implements EnumMapperType {
	APP_NAME	("appName", "양식명"),
	REQ_NO		("docId", "신청번호"),
	TITLE		("title", "제목"),
	INITIATOR	("initiator", "신청자"),
	ALL_SRCH	("all", "전체"),
	ACCNT_NO	("accntNo", "계정번호"),
	;
				
	private final String code;
	private final String title;
		
	private AprSearch(String code, String title) {
		this.code = code;
		this.title = title;
	}

	/**
	 * 파라미터로 전달된 코드 문자열이 없으면 기본값 열거형인 [ALL] 을 반환한다.
	 * @param code
	 * @return
	 * @throws Exception 
	 */
	public static AprSearch codeOf(String code) throws Exception {
		if (StringUtils.isEmpty(code)) { 
			return AprSearch.ALL_SRCH;
		}
		return Arrays.stream(AprSearch.values())
			.filter(search -> search.getCode().equals(code))
			.findFirst().orElseThrow(() -> new Exception("시스템 오류(AprSearch): 일치되는 열거형이 존재 하지 않음"));
	}
	
	@Override
	public String getCode() {
		return this.code;
	}

	@Override
	public String getName() {
		return this.name();
	}

	@Override
	public String getTitle() {
		return this.title;
	}
}
