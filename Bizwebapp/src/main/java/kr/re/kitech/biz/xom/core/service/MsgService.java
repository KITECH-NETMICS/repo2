package kr.re.kitech.biz.xom.core.service;

import kr.re.kitech.biz.xom.core.vo.MsgVo;

/**  
 * @ClassSubJect 메시지 발송 테이블 관련 처리를 담당하는 인터페이스
 * @Class Name : AttachService.java
 * @Description : 메시지 발송 테이블 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/05   박정일             최초생성
 * 
 * @author 박정일
 * @since 2022/04/05
 * @version 1.0
 * @see
 * 
 */
public interface MsgService {
		
		
	public String getContentByTemplateCode(String templateCode) throws Exception;
	public String getContentStrByTemplateCode(String templateCode) throws Exception;

	/**
	 * 메시지 발송 테이블 데이터를 삽입한다.
	 * @param attachVo 공통첨부파일테이블 AttachVo
	 * @return boolean 
	 * @throws Exception
	 */
	public boolean insertMessage(MsgVo message) throws Exception;
}
