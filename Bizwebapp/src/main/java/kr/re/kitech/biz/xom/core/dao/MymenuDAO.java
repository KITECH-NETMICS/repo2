package kr.re.kitech.biz.xom.core.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.core.vo.MymenuVo;

/**  
 * @ClassSubJect 마이메뉴 관련 처리를 담당하는 DAO
 * @Class Name MymenuDAO.java
 * @Description 마이메뉴 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/08   박병목             최초생성
 * 
 * @author 박병목
 * @since 2022/03/08
 * @version 1.0
 * @see
 * 
 */
@Repository("mymenuDAO")
public class MymenuDAO extends BizDefaultAbstractDAO {

    /**
     * 마이메뉴 상세를 조횐한다.
     * @param vo 마이메뉴 MymenuVo
     * @return 마이메뉴 MymenuVo
     * @throws Exception
     */
    public MymenuVo selectMymenu(MymenuVo vo) throws ElException {
        return (MymenuVo) selectByPk("kr.re.kitech.biz.xom.core.selectMymenu", vo);
    }

    /**
     * 페이징을 처리하여 마이메뉴 목록조회를 한다.
     * @param vo 마이메뉴 MymenuVo
     * @return 사원목록  List<MymenuVo>
     * @throws Exception
     */
    public List<MymenuVo> selectListMymenu(MymenuVo vo) throws ElException {      	
        return (List<MymenuVo>)list("kr.re.kitech.biz.xom.core.selectListMymenu", vo);
    }
    
    /**
     * 사원별 마이메뉴 리스트를 조회 한다.
     * @param vo 마이메뉴 MymenuVo
     * @return 사원목록  List<MymenuVo>
     * @throws Exception
     */
    public List<MymenuVo> selectClassMymenu(MymenuVo vo) throws ElException {      	
        return (List<MymenuVo>)list("kr.re.kitech.biz.xom.core.selectClassMymenu", vo);
    }

    /**
     * 마이메뉴 목록 조회의 전체 카운트를 조회한다.
     * @param vo 마이메뉴 MymenuVo
     * @return 사원목록 조회의 전체 카운트
     * @throws Exception
     */
    public long selectListCountMymenu(MymenuVo vo)  throws ElException{               
        return (Long)selectByPk("kr.re.kitech.biz.xom.core.selectClassMymenuCnt", vo);
    }
    
    /**
     * 사원별 마이메뉴 리스트를 조회 한다.
     * @param vo 마이메뉴 MymenuVo
     * @return 사원목록  List<MymenuVo>
     * @throws Exception
     */
    public List<String> selectClassMymenuChkList(MymenuVo vo) throws ElException {      	
        return (List<String>)list("kr.re.kitech.biz.xom.core.selectClassMymenuChkList", vo);
    }
        
    /**
     * 마이메뉴를 등록한다.
     * @param vo 마이메뉴 MymenuVo
     * @return 사번
     * @throws Exception
     */
    public int insertMymenu(MymenuVo vo) throws ElException {    	
        return insert("kr.re.kitech.biz.xom.core.insertMymenu", vo);
    }
        
    /**
     * 마이메뉴를 수정한다.
     * @param vo 마이메뉴 MymenuVo
     * @return 사번
     * @throws Exception
     */
    public int updateMymenu(MymenuVo vo) throws ElException {    	
        return update("kr.re.kitech.biz.xom.core.updateMymenu", vo);
    }

    /**
     * 마이메뉴를 삭제한다.
     * @param vo 마이메뉴 MymenuVo
     * @throws Exception
     */
    public int deleteMymenu(MymenuVo vo) throws ElException {
        return delete("kr.re.kitech.biz.xom.core.deleteMymenu", vo);
    }

}
