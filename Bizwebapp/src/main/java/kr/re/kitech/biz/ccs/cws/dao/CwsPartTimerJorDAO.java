package kr.re.kitech.biz.ccs.cws.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 비상근 업무일지 관련 처리를 담당하는 DAO
 * @Class Name CwsPartTimerJorDAO.java
 * @Description 비상근 업무일지 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/07   개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/04/07
 * @version 1.0
 * @see
 * 
 */
@Repository("cwsPartTimerJorDAO")
public class CwsPartTimerJorDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {

    /**
     * 비상근 업무일지 상세를 조횐한다.
     * @param vo 비상근 업무일지 CwsPartTimerJorVo
     * @return 비상근 업무일지 CwsPartTimerJorVo
     * @throws Exception
     */
    public CwsPartTimerJorVo selectCwsPartTimerJor(CwsPartTimerJorVo vo) throws KitechException {
        return (CwsPartTimerJorVo) selectByPk("kr.re.kitech.biz.ccs.cws.selectCwsPartTimerJor", vo);
    }

    /**
     * 페이징을 처리하여 비상근 업무일지 목록조회를 한다.
     * @param vo 비상근 업무일지 CwsPartTimerJorVo
     * @return 사원목록  List<CwsPartTimerJorVo>
     * @throws Exception
     */
    public List<CwsPartTimerJorVo> selectListCwsPartTimerJor(CwsPartTimerJorVo vo) throws KitechException {
        return (List<CwsPartTimerJorVo>)list("kr.re.kitech.biz.ccs.cws.selectListCwsPartTimerJor", vo);
    }

    /**
     * 비상근 업무일지 목록 조회의 전체 카운트를 조회한다.
     * @param vo 비상근 업무일지 CwsPartTimerJorVo
     * @return 사원목록 조회의 전체 카운트
     * @throws Exception
     */
    public long selectListCountCwsPartTimerJor(CwsPartTimerJorVo vo)  throws KitechException{               
        return (Long)selectByPk("kr.re.kitech.biz.ccs.cws.selectListCountCwsPartTimerJor", vo);
    }
        
    /**
     * 비상근 업무일지를 등록한다.
     * @param vo 비상근 업무일지 CwsPartTimerJorVo
     * @return 사번
     * @throws Exception
     */
    public int insertCwsPartTimerJor(CwsPartTimerJorVo vo) throws KitechException { 
        return insert("kr.re.kitech.biz.ccs.cws.insertCwsPartTimerJor", vo);
    }

    /**
     * 비상근 업무일지를 갱신한다.
     * @param vo 비상근 업무일지 CwsPartTimerJorVo
     * @throws Exception
     */
    public int updateCwsPartTimerJor(CwsPartTimerJorVo vo) throws KitechException {
        return update("kr.re.kitech.biz.ccs.cws.updateCwsPartTimerJor", vo);
    }

    /**
     * 비상근 업무일지를 삭제한다.
     * @param vo 비상근 업무일지 CwsPartTimerJorVo
     * @throws Exception
     */
    public int deleteCwsPartTimerJor(CwsPartTimerJorVo vo) throws KitechException {
        return delete("kr.re.kitech.biz.ccs.cws.deleteCwsPartTimerJor", vo);
    }
    
    public CwsWorkTimeVo selectCwsWorkTime(CwsWorkTimeVo cwsWorkTimeVo) throws KitechException {
    	 return (CwsWorkTimeVo) selectByPk("kr.re.kitech.biz.ccs.cws.selectCwsWorkTime", cwsWorkTimeVo);
    }
    
    public String selectCwsWorkDays(CwsWorkTimeVo cwsWorkTimeVo) throws KitechException {
    	 return (String) selectByPk("kr.re.kitech.biz.ccs.cws.selectCwsWorkDays", cwsWorkTimeVo);
    }
    
    public String selectCwsPartTimerJorCheck(CwsPartTimerJorVo cwsPartTimerJorVo) throws KitechException {
    	 return (String) selectByPk("kr.re.kitech.biz.ccs.cws.selectCwsPartTimerJorChk", cwsPartTimerJorVo);
    }

}
