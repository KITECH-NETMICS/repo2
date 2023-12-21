package kr.re.kitech.biz.xom.core.dao;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.xom.base.dao.MmsDefaultAbstractDAO;
import kr.re.kitech.biz.xom.core.vo.MsgVo;

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
@Repository("msgDAO")
public class MsgDAO extends MmsDefaultAbstractDAO {

        
    /**
     * MailSendLog 테이블를 등록한다.
	 *
     * @param map 
     * @return 사번
     * @throws Exception
     */
    public int insertMessage(MsgVo message) throws Exception {    	
        return insert("kr.re.kitech.biz.xom.core.insertMessage", message);
    }
}
