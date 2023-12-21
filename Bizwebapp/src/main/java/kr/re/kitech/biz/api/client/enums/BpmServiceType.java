/**
 * 
 */
package kr.re.kitech.biz.api.client.enums;

import kr.re.kitech.biz.xom.base.enums.EnumMapperType;

/**
 * 
 * @author James
 * @since 2022. 5. 16.
 */
public enum BpmServiceType implements EnumMapperType {
	START("start", "결재신청"),
	COMPLET("complete", "완료"),
	COMPENSATE("compensate", "회수"),
	DELEGATE("delegate", "전달"),
	CANCEL_CHANGE("cancel_change", "보상");	
	
	private final String code;
	private final String title;
		
	private BpmServiceType(String code, String title) {
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
