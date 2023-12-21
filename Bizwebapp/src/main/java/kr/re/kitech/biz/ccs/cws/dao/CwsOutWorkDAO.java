package kr.re.kitech.biz.ccs.cws.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo;

/**  
 * @ClassSubJect 재택근무신청 관련 처리를 담당하는 DAO
 * @Class Name CwsOutWorkDAO.java
 * @Description 재택근무신청 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/28   개발팀             최초생성
 * 1
 * @author 개발팀
 * @since 2022/03/28
 * @version 1.0
 * @see
 * 
 */
@Repository("cwsOutWorkDAO")
public class CwsOutWorkDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {

    public CwsOutWorkVo selectCwsOutWork(CwsOutWorkVo vo) throws ElException {
        return (CwsOutWorkVo) selectByPk("kr.re.kitech.biz.ccs.cws.selectCwsOutWork", vo);
    }
    
    public CwsOutWorkVo selectCwsOutWorkTest(CwsOutWorkVo vo) throws ElException {
        return (CwsOutWorkVo) selectByPk("kr.re.kitech.biz.ccs.cws.selectCwsOutWorkTest", vo);
    }
    
    public CwsOutWorkVo selectCwsOutWorkDupCheck(CwsOutWorkVo vo) throws ElException {
        return (CwsOutWorkVo) selectByPk("kr.re.kitech.biz.ccs.cws.selectCwsOutWorkDupCheck", vo);
    }
    
    public CwsOutWorkVo selectCwsOutWorkValidCheck(CwsOutWorkVo vo) throws ElException {
        return (CwsOutWorkVo) selectByPk("kr.re.kitech.biz.ccs.cws.selectCwsOutWorkValidCheck", vo);
    }
    
    public List<CwsOutWorkVo> selectListCwsOutWork(CwsOutWorkVo vo) throws ElException {      	
        return list("kr.re.kitech.biz.ccs.cws.selectListCwsOutWork", vo);
    }

    public long selectListCountCwsOutWork(CwsOutWorkVo vo)  throws ElException{               
        return (Long)selectByPk("kr.re.kitech.biz.ccs.cws.selectListCountCwsOutWork", vo);
    }
        
    public int insertCwsOutWork(CwsOutWorkVo vo) throws ElException {  
        return insert("kr.re.kitech.biz.ccs.cws.insertCwsOutWork", vo);
    }

    public int updateCwsOutWork(CwsOutWorkVo vo) throws ElException {
        return update("kr.re.kitech.biz.ccs.cws.updateCwsOutWork", vo);
    }

    public int deleteCwsOutWork(CwsOutWorkVo vo) throws ElException {
        return delete("kr.re.kitech.biz.ccs.cws.deleteCwsOutWork", vo);
    }

}
