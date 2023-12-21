package kr.re.kitech.biz.api.client.enums;

import kr.re.kitech.biz.xom.base.enums.EnumMapperType;

/**
 * 첨부파일 상수 구분.
 * @author James
 * @since 2022. 3. 11.
 */
public enum CsrType implements EnumMapperType {
	CREATE_PRG_IMP("PIMP", "프로그램 개선"),
	CREATE_PRG_DEV("PDEV", "프로그램 개발"),
	CREATE_PRG_ERR("PERR", "프로그램 오류"),
	CREATE_DATA_MOD("DMOD", "데이터 수정"),
	CREATE_DATA_REQ("DREQ", "데이터 요청"),
	CREATE_BIZ_INQ("BINQ", "업무문의 제안사항"),
	CREATE_ETC_INQ("OINQ", "기타문의"),
	APPROVAL_FIRST("APPR", "1단계 결재요청");
	
	private final String code;
	private final String title;
		
	private CsrType(String code, String title) {
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
