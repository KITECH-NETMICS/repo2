package kr.re.kitech.biz.api.client.enums;

import kr.re.kitech.biz.xom.base.enums.EnumMapperType;


/**
 * 모바일 알림 채널 타입
 *   - 14번으로 통합 (
 * @author James
 * @since 2022. 12. 14.
 */
public enum MobChnlType implements EnumMapperType {
	NOTICE_APR_WAITING("200000000014", "[결재대기]"),	
	NOTICE_APR_REJECT("200000000014", "[결재반려]"),
	NOTICE_APR_COMPLATE("200000000014", "[결재완료]");
	
	private final String code;
	private final String title;
	
	private MobChnlType(String code, String title) {
		this.code = code;
		this.title = title;
	}
	
	
	@Override
	public String getName() {
		return this.name();
	}
	
	@Override
	public String getCode() {
		return this.code;
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}
}