/**
 * 
 */
package kr.re.kitech.biz.apr.enums;

import kr.re.kitech.biz.xom.base.enums.EnumMapperType;

/**
 * 
 * @author James
 * @since 2023. 4. 18.
 */
public enum AprAction implements EnumMapperType {

	SUBMIT("APC010", "상신"),
	REJECT("APC020", "반려"),
	ACCEPT("APC030", "결재"),
	WITHDRAW("APC040", "회수"),
	DELEGATE("APC050", "전달");
	
	private final String code;
	private final String title;
		
	private AprAction(String code, String title) {
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
