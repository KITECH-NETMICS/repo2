package kr.re.kitech.biz.xom.base.exception;

import org.springframework.context.MessageSource;

import com.inswave.elfw.exception.UserException;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;

/**
 * 예외 공통 처리를 위한 F/W Exception 확장 클래스
 */
public class KitechException extends UserException {

	private static final long serialVersionUID = 6501952553724123946L;
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
	public KitechException() {
		super();
		this.init(Exceptions.ERROR, Business.XOM);
	}	
	
	/**
     * 비즈니스 타입 설정 생성자
     */
	public KitechException(Exceptions exceptions, Business business) {
		super();
		this.init(exceptions, business);
	}

	public KitechException(Exceptions exceptions, Business business, MessageSource messageSource, String messageKey, String[] messageParameters, Throwable wrappedException) {
		super(messageSource, messageKey, messageParameters, wrappedException);
		this.init(exceptions, business);
	}

	public KitechException(Exceptions exceptions, Business business, MessageSource messageSource, String messageKey, String[] messageParameters) {
		super(messageSource, messageKey, messageParameters);
		this.init(exceptions, business);
	}

	public KitechException(Exceptions exceptions, Business business, MessageSource messageSource, String messageKey) {
		super(messageSource, messageKey);
		this.init(exceptions, business);
	}

	public KitechException(Exceptions exceptions, Business business, String messageKey, String[] messageParameters, Throwable wrappedException) {
		super(messageKey, messageParameters, wrappedException);
		this.init(exceptions, business);
	}

	public KitechException(Exceptions exceptions, Business business, String defaultMessageOrKey, String[] messageParameters) {
		super(defaultMessageOrKey, messageParameters);
		this.init(exceptions, business);
	}

	public KitechException(Exceptions exceptions, Business business, String defaultMessageOrKey, Throwable wrappedException) {
		super(defaultMessageOrKey, wrappedException);
		this.init(exceptions, business);
	}

	public KitechException(Exceptions exceptions, Business business, String defaultMessageOrKey) {
		super(defaultMessageOrKey);
		this.init(exceptions, business);
	}

	public KitechException(Exceptions exceptions, Business business, Throwable wrappedException) {
		super(wrappedException);
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
