package kr.re.kitech.biz.api.server.enums;

import kr.re.kitech.biz.xom.base.enums.EnumMapperType;

/**
 * 첨부파일 상수 구분.
 * @author James
 * @since 2022. 3. 11.
 */
public enum RoleType implements EnumMapperType {
	asset("ASS", "지역별 담당자(자산)"), 
	asset_hq("ASS", "원본부 자산 담당자"), 
	security("CCS", "지역별 담당자(총무보안)"), 
	security_hq("CCS", "원본부 총무보안 담당자"), 
	pv("", "PV에서 선택"), 
	pv_hr("", "PV에서 인사 담당자 선택"), 
	pur_manager("PUR", "지역별구매담당자(5000만원 이하)"), 
	pur_manager_high("PUR", "지역별구매담당자(5000만원 이상)"), 
	pur_manager_aboard("", "외자구매담당"),
    audit_role("ADT", "지역별 감사"),
    lib_manager("KBK", "지역별 도서 담당자"),
    tech_manager("", "지역별 기술료 담당자"),
    pat_manager("PAT", "지역별 지재권 담당자"),
    safe_manager("D02", "안전보건담당자");
	
	private final String code;
	private final String title;
		
	private RoleType(String code, String title) {
		this.code = code;
		this.title = title;
	}
	
	public static boolean isRequireOccutype(String name) {
		return (RoleType.pv == RoleType.valueOf(name) || (RoleType.pv_hr == RoleType.valueOf(name)));
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
