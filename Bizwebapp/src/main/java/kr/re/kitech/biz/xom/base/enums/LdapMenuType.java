/**
 * 
 */
package kr.re.kitech.biz.xom.base.enums;

/**
 * 
 * @author James
 * @since 2023. 4. 28.
 */
public enum LdapMenuType implements EnumMapperType {
	
	UID_MENU("uid", "유저아이디 속한 전체 서비스 조회 타입"),
	URL_MENU("serviceNewUrl", "serviceNewUrl 서비스 조회 타입"),
	WORD_MENU("keyword", "서비스아이디 or 서비스명 서비스 조회 타입");
	
	private final String code;
	private final String title;
		
	private LdapMenuType(String code, String title) {
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
