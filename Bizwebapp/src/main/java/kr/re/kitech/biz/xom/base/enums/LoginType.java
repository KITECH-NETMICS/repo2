package kr.re.kitech.biz.xom.base.enums;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 예외 구분
 * @author James
 * @since 2022. 3. 11.
 */
public enum LoginType implements EnumMapperType {
	
	SESSION("SESSION", "세션"),
	BIZ("API_BIZ", "BIZ 인증"),
	EIP("API_EIP", "EIP 인증"),
	BPM("API_BPM", "BPM 인증"),
	MBI("API_MBI", "MBI 인증"),	
	SSO("SSO", "SSO 연계");
	
	private final String code;
	private final String title;
		
	private LoginType(String code, String title) {
		this.code = code;
		this.title = title;
	}

	/**
	 * 파라미터로 전달된 코드 문자열이 없으면 기본값 열거형인 [SESSION] 을 반환한다.
	 * @param code
	 * @return
	 */
	public static LoginType codeOf(String code){
		if (StringUtils.isEmpty(code)) 
			return LoginType.SESSION;
			
		return LoginType.valueOf(code);
	}


	public boolean isApiAuthorization(){
		List<LoginType> types = Arrays.asList(values());
		return types.stream().filter( type -> {
			return type.getCode().startsWith("API_"); 
		}).anyMatch( type -> {
			return this == type;
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
