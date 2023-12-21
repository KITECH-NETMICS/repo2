package kr.re.kitech.biz.com.enums;

import kr.re.kitech.biz.xom.base.enums.EnumMapperType;

public enum Numberings implements EnumMapperType {
	
	DOCUMENT("XXY001", "문서번호"),
	ATTACH("XXY002", "첨부파일번호"),
	SLIP("XXY003", "결의번호"),
	RCMS("XXY004", "재무RCMS전송번호"),
	CTRNO("XXY005", "통제번호");
	
	private final String code;
	private final String title;
		
	private Numberings(String code, String title) {
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
