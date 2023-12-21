package kr.re.kitech.biz.apr.enums;

import java.util.Arrays;

import kr.re.kitech.biz.xom.base.enums.EnumMapperType;

/**
 * 결재 상태 열거형
 *
 * @author James
 * @since 2022. 3. 11.
 */
public enum AprState implements EnumMapperType {
	WAIT_SAVE		("XAD005", "저장중"),
	WAIT_WRITE		("XAD010", "작성중"),
	WAIT_WITHDRAW	("XAD013", "회수"),
	WAIT_REJECT		("XAD015", "반려"),
	ING_APPROVAL	("XAD020", "결재진행중"),
	ING_ACCNT		("XAD030", "계정확인중"),
	ING_CTRL		("XAD040", "예산통제중"),
	ING_DEPT		("XAD050", "신청부서결재중"),
	ING_ACCEPT		("XAD060", "접수자수신"),
	ING_RECEIVER	("XAD065", "수신부서결재중"),
	ING_AUTH		("XAD070", "담당자 확인중"),
	ING_ASS			("XAD085", "자산등재신청"),
	COMPLATE		("XAD100", "결재완료");
		
	private final String code;
	private final String title;
		
	private AprState(String code, String title) {
		this.code = code;
		this.title = title;
	}
	
	public static AprState getAprState(String code) {
		return Arrays.stream(AprState.values())
			.filter(apr -> apr.getCode().equals(code))
			.findFirst()
			.get();
	}
	
	/**
	 * DB 의 XAD 코드가 결재  대기중에 해당하는 상태인지 확인 (XAD005, XAD010, XAD013, XAD015)
	 * @param code XAD 코드
	 * @return 완료상태 true
	 */	
	public static boolean isWait(String code) {
		return Arrays.stream(AprState.values())
			.filter(value -> value.name().startsWith("WAIT_"))
			.anyMatch(value -> value.getCode().equals(code));	
	}
	
	/**
	 * DB 의 XAD 코드가 결재 진행중에 해당하는 상태인지 확인 (XAD020 이상  XAD100 미만)
	 * @param code XAD 코드
	 * @return 완료상태 true
	 */
	public static boolean isIng(String code) {
		return Arrays.stream(AprState.values())
			.filter(value -> value.name().startsWith("ING_") || code.equals(COMPLATE.getCode()))
			.anyMatch(value -> value.getCode().equals(code));	
	}
	
	/**
	 * DB 의 XAD 코드가 결재 완료상태인지 확인
	 * @param code XAD 코드
	 * @return 완료상태 true
	 */
	public static boolean isComplate(String code) {
		return AprState.COMPLATE.getCode().equals(code);
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
