package kr.re.kitech.biz.xom.base.enums;

public class EnumMapperValue {
	private String name;
	private String code;
	private String title;

	public EnumMapperValue(EnumMapperType enumMapperType) {
		this.name = enumMapperType.getName();
		this.code = enumMapperType.getCode();
		this.title = enumMapperType.getTitle();
	}
}
