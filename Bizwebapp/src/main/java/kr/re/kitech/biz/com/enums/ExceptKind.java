/**
 * 
 */
package kr.re.kitech.biz.com.enums;

import kr.re.kitech.biz.xom.base.enums.EnumMapperType;

/**
 * 
 * @author James
 * @since 2023. 4. 6.
 */
public enum ExceptKind implements EnumMapperType {
	
	RESPAY_ALLOW("XEK010", "연구수당허용"),
	ACCNT_ALLOW("XEK020", "계정대체허용"),
	PURREQ_ALLOW("XEK030", "구매요청허용"),
	RESER_ALLOW("XEK040", "참여연구원허용"),
	AUTO_DELEGATE("XEK050", "자동위임처리"),
	AUTO_BPM_SKIP("XEK055", "자동스킵처리"),
	MENU_CACHE("XEK005", "메뉴캐시이용");
	
	private final String code;
	private final String title;
		
	private ExceptKind(String code, String title) {
		this.code = code;
		this.title = title;
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
