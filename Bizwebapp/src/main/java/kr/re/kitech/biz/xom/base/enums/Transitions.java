/**
 * 
 */
package kr.re.kitech.biz.xom.base.enums;

import java.util.Arrays;
import java.util.List;

/**
 * 컨트롤러 인터셉터에서 메소드 prefix 판별을 위한 enum 구현체: 향 후 개발자들의 의견으로 추가될 수 있다.
 *
 * @author James
 * @since 2022. 3. 28.
 */
public enum Transitions implements EnumMapperType {
	
	SAVE("save", "저장"),
	INSERT("insert", "삽입"),
	UPDATE("update", "수정"),
	MODIFY("modify", "변경"),
	SEND("send", "발송"),
	TRANS("trans", "전달"),
	REMOVE("remove", "삭제");
	
	
	private final String code;
	private final String title;
		
	private Transitions(String code, String title) {
		this.code = code;
		this.title = title;
	}
	
	public static boolean hasContains(String param){
		List<Transitions> transitions = Arrays.asList(Transitions.values());
		return transitions.stream().anyMatch( transition -> {
			return param.startsWith(transition.getCode());
		});
	}
	
	public static boolean isCreated(String param){
		List<Transitions> transitions = Arrays.asList(Transitions.values());
		return transitions.stream().anyMatch( transition -> {
			return (param.startsWith(Transitions.INSERT.getCode()) || param.startsWith(Transitions.SAVE.getCode()));
		});
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

