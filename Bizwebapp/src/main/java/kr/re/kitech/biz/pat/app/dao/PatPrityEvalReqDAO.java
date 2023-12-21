package kr.re.kitech.biz.pat.app.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 
 * @ClassName : PatPrityEvalReqDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.17.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.17.
 * @version 1.0
 * @see
 * 
 */
@Repository("patPrityEvalReqDAO")
public class PatPrityEvalReqDAO extends BizDefaultAbstractDAO {
  
  /**
   * 우선심사신청 리스트 조회
   * 
   * @author Chris
   * @param PatPrityEvalReqVo
   * @return List<PatPrityEvalReqVo>
   * @throws KitechException
   * @since 2023.10.17.   
   */
  public List<PatPrityEvalReqVo> selectList01(PatPrityEvalReqVo vo) throws KitechException {
    return (List<PatPrityEvalReqVo>)list("kr.re.kitech.biz.pat.app.selectPatPrityEvalReqSS03", vo);
  }

  /**
   * 다건 조회
   * 
   * @author Chris
   * @param PatPrityEvalReqVo
   * @return List<PatPrityEvalReqVo>
   * @throws KitechException
   * @since 2023.10.17.   
   */
  public List<PatPrityEvalReqVo> executeDynamicMultiSelect(String sqlMapId, PatPrityEvalReqVo vo) throws KitechException {
    return (List<PatPrityEvalReqVo>)list(sqlMapId, vo);
  }

  /**
   * 단건 조회
   * 
   * @author Chris
   * @param PatPrityEvalReqVo
   * @return PatPrityEvalReqVo
   * @throws KitechException
   * @since 2023.10.17.   
   */
  public PatPrityEvalReqVo executeDynamicSelect(String sqlMapId, PatPrityEvalReqVo vo) throws KitechException {
    return (PatPrityEvalReqVo) selectByPk(sqlMapId, vo);
  }

  /**
   * 단건 등록
   * 
   * @author Chris
   * @param PatPrityEvalReqVo
   * @return int
   * @throws KitechException
   * @since 2023.10.17.   
   */
  public int executeDynamicInsert(String sqlMapId, PatPrityEvalReqVo vo) throws KitechException {
    return insert(sqlMapId, vo);
  }

  /**
   * 단건 수정
   * 
   * @author Chris
   * @param PatPrityEvalReqVo
   * @return int
   * @throws KitechException
   * @since 2023.10.17.   
   */
  public int executeDynamicUpdate(String sqlMapId, PatPrityEvalReqVo vo) throws KitechException {
    return update(sqlMapId, vo);
  }

  /**
   * 단건 삭제
   * 
   * @author Chris
   * @param PatPrityEvalReqVo
   * @return int
   * @throws KitechException
   * @since 2023.10.17.   
   */
  public int executeDynamicDelete(String sqlMapId, PatPrityEvalReqVo vo) throws KitechException {
    return delete(sqlMapId, vo);
  }

}
