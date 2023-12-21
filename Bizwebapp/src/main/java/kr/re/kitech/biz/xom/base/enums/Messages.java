/**
 * 
 */
package kr.re.kitech.biz.xom.base.enums;

/**
 * 
 * @author James
 * @since 2022. 4. 5.
 */
public enum Messages implements EnumMapperType {

	  SMS_MSG(0,"SMS 메시지 발송")
	, LMS_MSG(5,"LMS 메시지 발송")
	, MMS_MSG(5,"MMS 메시지 발송")
	, AT_MSG(6,"알림 메시지 발송")
	, FT_MSG(7,"친구 메시지 발송")
	, ATR_MSG(6,"알림 메시지 발송 - 재전송")
	, FTR_MSG(7,"친구 메시지 발송 - 재전송");

	private final int value;
	private final String title;
		
	private Messages(int value, String title) {
		this.value = value;
		this.title = title;
	}
	
	public int getValue() {
		return this.value;
	}

	@Override
	public String getCode() {
		return String.valueOf(this.value);
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
