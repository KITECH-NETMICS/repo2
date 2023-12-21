package kr.re.kitech.biz.xom.base.enums;

import java.util.Arrays;
import java.util.NoSuchElementException;

import kr.re.kitech.biz.api.server.enums.AprProcess;

public enum Business implements EnumMapperType {
	
	EIS("XAA007", "목표경영"),
	RES("XAA001", "연구과제"),
	SUP("XAA005", "기업지원"),
	PUR("XAA004", "구매관리"),
	RSP("XAA016", "지재권/기술이전"),
	PAT("XAA070", "지식재산권"),
	FIN("XAA002", "재무예산"),
	HUM("XAA003", "인사급여"),
	EPU("XAA110", "구매조달"),
	ASS("XAA015", "자산관리"),
	CCS("XAA006", "총무보안"),
	SFC("XAA021", "안전관리"),
	LPL("XAA014", "기획협력"),
	KBK("XAA013", "도서관리"),
	ADT("XAA020", "감사관리"),
	COM("XAA010", "정보시스템운영"),
	APR("XAA009", "전자결재"),
	ETC("XAA900", "기타지원시스템"),
	BUD("XAA017", "예산관리"),
	IMG("IMG", "이미지 파일"),
	OLD("OLD", "업무별 저장 된 파일"),
	XOM("XAA990", "시스템");
	
	private final String code;
	private final String title;
		
	private Business(String code, String title) {
		this.code = code;
		this.title = title;
	}

	public static Business getBusiness(AprProcess process) {
		return Arrays.stream(Business.values())
			.filter(biz -> biz.name().equals(process.getName()))
			.findFirst()
			.orElse(Business.ETC);
	}
	
	public static Business prefixOf(String prefix) {
		return Arrays.stream(Business.values())
			.filter(biz -> biz.name().startsWith(prefix))
			.findFirst()
			.orElse(Business.ETC);
	}
	
	public static String getName(String code) throws NoSuchElementException{
		return Arrays.stream(Business.values())
			  .filter(biz -> biz.getCode().equals(code))
			  .findFirst().get().getName();
	}

//	
//	public Business findBusiness(String prefix){
//		List<Business> business = Arrays.asList(Business.values());
//		return business.stream().filter( biz -> biz.name().startsWith(prefix));	
//	}


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
