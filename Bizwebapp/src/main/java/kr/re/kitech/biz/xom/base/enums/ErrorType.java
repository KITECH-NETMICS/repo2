package kr.re.kitech.biz.xom.base.enums;


/**
 * 예외 구분
 * @author James
 * @since 2022. 3. 11.
 */
public enum ErrorType implements EnumMapperType {
	
	BUSINESS("XXY001", "비즈니스"),
	SYSTEM("XXY002", "시스템");
	
	private final String code;
	private final String title;
		
	private ErrorType(String code, String title) {
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
