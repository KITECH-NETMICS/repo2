/**
 * 
 */
package kr.re.kitech.biz.xom.base.enums;

/**
 * 
 * @author James
 * @since 2022. 4. 7.
 */
public enum MsgKeys implements EnumMapperType {
	DEST_NAME("destName", "수신자명"),
	DEST_PHONE("destPhone", "수신자번호"),
	DEST_SYSPAYNO("destSyspayno", "수신자사번"),
	SEND_NAME("sendName", "발신자명"),
	SEND_PHONE("sendPhone", "발신자번호"),
	SEND_SYSPAYNO("sendSyspayno", "발신자사번");

	private final String code;
	private final String title;
		
	private MsgKeys(String code, String title) {
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

