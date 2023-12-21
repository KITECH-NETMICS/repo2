package kr.re.kitech.biz.apr.enums;

import kr.re.kitech.biz.xom.base.enums.EnumMapperType;

/**
 * 결재 상태 열거형
 *
 * @author James
 * @since 2022. 3. 11.
 */
public enum AprMapper implements EnumMapperType {
	FORM_WORK		("work", "업무대기함"), // 업무대기함
	FORM_APPROVAL	("approval", "결재대기함"), // 결재대기함
	FORM_RUNNING	("Running", "결재진행함"), // 결재진행함
	FORM_INSTEAD	("Instead", "대결완료함"), // 대결완료함
	FORM_COMPLETE	("Completed", "결재완료함"), // 결재완료함
	FORM_ALIAS		("alias", "담당자완료함"), // 담당자완료함
	FORM_REJECT		("reject", "결재반려함"), // 결재반려함
	
	APPROVAL	("approval", "결재"),
	ARBITRARY_DECISION	("arbitrary_decision", "전결"),
	AUDIT		("audit", "감사"),
	COOPERATION	("consent", "협조"),
	CONDUCT	("conduct", "행동강령책임관"),
	
	TASK_DRAFT ("DRAFT","상신전"),
	TASK_NEW ("NEW","생성"),
	TASK_COMPLATE ("COMPLETED","완료"),
	
	INST_RUNNING ("Running","진행중"),
	INST_COMPLETE ("Completed","완료");
		
	private final String code;
	private final String title;
		
	private AprMapper(String code, String title) {
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
