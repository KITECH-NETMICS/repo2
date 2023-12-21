package kr.re.kitech.biz.xom.core.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**  
 * @ClassSubJect 공통첨부파일테이블 관련 처리를 담당하는 DAO
 * @Class Name AttachDAO.java
 * @Description 공통첨부파일테이블 관련 처리를 담당하는 DAO
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
@Repository("accntDao")
public class AccntDao extends BizDefaultAbstractDAO{

    /**
     * 세션에 넣을 데이터를 인사정보에서 조회한다.
     * @param syspayno 사번
     * @return 인사정보에서 Map
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public Map<String,String> getSessionEtcDataByKey(String syspayno) throws ElException {
        return (Map<String,String>) selectByPk("kr.re.kitech.biz.xom.core.getSessionEtcDataByKey", syspayno);
    }
    
    /**
     * 세션에 넣을 데이터를 인사정보에서 조회한다.
     * @param syspayno 사번
     * @return 인사정보에서 Map
     * @throws Exception
     */    
    @SuppressWarnings("unchecked")
	public Map<String,String> getSessionBotBetaServieByKey(String syspayno) throws ElException {
        return (Map<String,String>) selectByPk("kr.re.kitech.biz.xom.core.getSessionBotBetaServieByKey", syspayno);
    }    
    
    /**
     * Expire 된 시스템사번으로 현재 시스템사번을 조회한다.
	 * @param syspayno
     * @return
     * @throws Exception
     */
    public String getSyspaynoByExpireSyspaynoInDB(String syspayno) throws ElException {
        return (String) selectByPk("kr.re.kitech.biz.xom.core.getSyspaynoByExpireSyspaynoInDB", syspayno);
    }

    /**
     * 특정 사번의 차상위자사번을 조회한다.
	 * 
     * @param syspayno
     * @return
     * @throws Exception
     */
    public String findDirectSupervisorBySyspaynoInDB(String syspayno) throws ElException {
    	return (String) selectByPk("kr.re.kitech.biz.xom.core.findDirectSupervisorBySyspaynoInDB", syspayno);
    }
}
