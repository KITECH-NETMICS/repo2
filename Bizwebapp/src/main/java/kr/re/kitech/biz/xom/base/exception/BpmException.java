package kr.re.kitech.biz.xom.base.exception;

import com.inswave.elfw.exception.UserException;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;

/**
 * BPM 예외 공통 처리를 위한 F/W Exception 확장 클래스
 */
public class BpmException extends UserException {

	private static final long serialVersionUID = 5192911464834301508L;
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
	public BpmException() {
		super();
		this.init(Exceptions.ERROR, Business.XOM);
	}	
	
	/**
     * 비즈니스 타입 설정 생성자
     */
	public BpmException(Exceptions exceptions, Business business) {
		super();
		this.init(exceptions, business);
	}

	public BpmException(Exceptions exceptions, Business business, String message) {
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
