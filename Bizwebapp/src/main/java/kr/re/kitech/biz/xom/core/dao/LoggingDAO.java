package kr.re.kitech.biz.xom.core.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.xom.core.vo.MailVo;

/**  
 * @ClassSubJect 공통 로그 테이블 관련 처리를 담당하는 DAO
 * @Class Name LoggingDAO.java
 * @Description 공통 로그 테이블 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/31   박정일             최초생성
 * 
 * @author 박정일
 * @since 2022/03/31
 * @version 1.0
 * @see
 * 
 */
@Repository("loggingDAO")
public class LoggingDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {

        
    /**
     * MailSendLog 테이블를 등록한다.
	 *
     * @param map 
     * @return 저장 로우 수
     * @throws Exception
     */
    public int insertMailSendLog(Map<String,String> map) throws Exception {    	
        return insert("kr.re.kitech.biz.xom.core.insertMailSendLog", map);
    }
    
    /**
     * MessageSendLog 테이블를 등록한다.
	 *
     * @param map 
     * @return 저장 로우 수
     * @throws Exception
     */
    public int insertMsgSendLog(Map<String,String> map) throws Exception {
        return insert("kr.re.kitech.biz.xom.core.insertMsgSendLog", map);
    }    
    
    /**
     * @param vo
     * @return
     * @throws Exception
     */
    public int insertMailFailLog(MailVo vo) throws Exception {    	
        return insert("kr.re.kitech.biz.xom.core.insertMailFailLog", vo);
    }
}
