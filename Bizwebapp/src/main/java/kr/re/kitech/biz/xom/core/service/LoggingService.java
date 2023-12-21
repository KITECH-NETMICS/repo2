package kr.re.kitech.biz.xom.core.service;

import java.util.Map;

import kr.re.kitech.biz.xom.core.vo.MailVo;

/**  
 * @ClassSubJect 공통 로그 테이블 관련 처리를 담당하는 인터페이스
 * @Class Name : AttachService.java
 * @Description : 공통 로그 테이블 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/18   박정일             최초생성
 * 
 * @author 박정일
 * @since 2022/03/18
 * @version 1.0
 * @see
 * 
 */
public interface LoggingService {
		
	/**
	 * 메일전송로그 테이블에 등록한다.
	 * @param mailSendLog 메일전송로그 Map
	 * @return 저장 건수
	 * @throws Exception
	 */
	public int insertMailSendLog(Map<String,String> mailSendLog) throws Exception;
	
	
	/**
	 * 메시지전송로그 테이블에 등록한다.
	 * @param msgSendLog 메일전송로그 Map
	 * @return 저장 건수
	 * @throws Exception
	 */	
	public int insertMsgSendLog(Map<String,String> msgSendLog) throws Exception;
	
	public int insertMailFailLog(MailVo vo) throws Exception;
}
