/**
 * 
 */
package kr.re.kitech.biz.xom.base.exception;

import com.inswave.elfw.exception.UserException;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;

/**
 * 범용 메시지를 직접 처리하기 위한 F/W Exception 확장 클래스
 * @author James
 * @since 2022. 11. 15.
 */
public class MsgException extends UserException {

	private static final long serialVersionUID = 8071600216576569690L;
	private Exceptions exceptions;
	private Business business;
	
	/**
	 * 비즈니스 타입 설정 내부 메소드
     */
	private void init(Exceptions exceptions, Business business){
		this.exceptions = exceptions;
		this.business = business;
	}

	/**
     * Default 생성자
	 */
	public MsgException() {
		super();
		this.init(Exceptions.ERROR, Business.XOM);
	}	
	
	/**
     * 비즈니스 타입 설정 생성자
     */
	public MsgException(Exceptions exceptions, Business business) {
		super();
		this.init(exceptions, business);
	}

	public MsgException(Exceptions exceptions, Business business, String message) {
		super(message);
		this.init(exceptions, business);
	}
	
	/**
	 * 비즈니스 타입 설정 Getter
     */	
	public Business getBusiness(){
		return this.business;
	}
	
	/**
	 * 예외 타입 설정 Getter
     */		
	public Exceptions getExceptions(){
		return this.exceptions;
	}
}
