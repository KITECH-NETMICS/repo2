package kr.re.kitech.biz.xom.base.enums;


/**
 * 예외 종류
 * @author James
 * @since 2022. 3. 11.
 */
public enum Exceptions implements EnumMapperType {
	
	ERROR("XXX001", "오류"),
	WARN("XXX002", "주의"),
	ALERT("XXX003", "알림");
	
	private final String code;
	private final String title;
		
	private Exceptions(String code, String title) {
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
