package kr.re.kitech.biz.api.server.enums;

import java.util.Arrays;

import kr.re.kitech.biz.xom.base.enums.EnumMapperType;

/**
 * 첨부파일 상수 구분.
 * @author James
 * @since 2022. 3. 11.
 */
public enum AprProcess implements EnumMapperType {
	RES("R", "연구과제"),
	EPU("P", "구매조달"),
	PAT("I", "발명신고서"),
	ASS("A", "자산관리"),
	FIN("F", "재무예산"),
	HUM("H", "인사급여"),
	CCS("C", "총무보안"),
	SPT("S", "기업지원"),
	CSF("D", "안전관리"),
	STD("X", "전자증빙");
	
	private final String code;
	private final String title;
		
	private AprProcess(String code, String title) {
		this.code = code;
		this.title = title;
	}
	
	public static AprProcess prefixOf(String prefix) {
		return Arrays.stream(AprProcess.values())
			.filter(process -> process.getCode().equals(prefix))
			.findFirst()
			.orElse(null);
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
