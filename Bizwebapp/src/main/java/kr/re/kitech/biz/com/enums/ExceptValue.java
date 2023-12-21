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
public enum ExceptValue implements EnumMapperType {
	
	HUMAN("XEK010", "사용자"),
	ACCNTCD("XEK020", "회계코드"),
	ACCNTNO("XEK040", "계정번호");
	
	private final String code;
	private final String title;
		
	private ExceptValue(String code, String title) {
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
