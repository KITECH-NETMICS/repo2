/**
 * 
 */
package kr.re.kitech.biz.xom.base.enums;

/**
 * 
 * @author James
 * @since 2022. 3. 31.
 */
public enum Progress implements EnumMapperType {
	START("S", "시작"),
	ING("I", "진행"),
	END("E", "종료");
	
	private final String code;
	private final String title;
		
	private Progress(String code, String title) {
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
