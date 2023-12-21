/**
 * 
 */
package kr.re.kitech.biz.xom.base.enums;

/**
 * 
 * @author James
 * @since 2022. 4. 5.
 */
public enum Retires  implements EnumMapperType {
	SMS("0", "SMS 메시지"),
	MMS("1", "MMS 메시지");
	
	private final String code;
	private final String title;
		
	private Retires(String code, String title) {
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