package kr.re.kitech.biz.pat.app.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.app.vo.PatAppChangeListVo;
import kr.re.kitech.biz.pat.app.vo.PatAppChangeVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect
 * @ClassName : PatAppChangeDAO.java
 * @Description
 * @Modification :
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.21.      Chris    최초생성
 *
 * @author Chris
 * @since 2023.11.21.
 * @version 1.0
 * @see
 *
 */
@Repository("patAppChangeDAO")
public class PatAppChangeDAO extends BizDefaultAbstractDAO {

  private static final String NAMESPACE = "kr.re.kitech.biz.pat.app.";

  /**
   * 리스트 조회
   *
   * @author Chris
   * @param PatAppChangeVo
   * @return List<PatAppChangeVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  public List<PatAppChangeVo> executeDynamicSelectList(String sqlMapId, PatAppChangeVo vo) throws KitechException {
    return (List<PatAppChangeVo>)list(NAMESPACE + sqlMapId, vo);
  }

  /**
   * 조회
   *
   * @author Chris
   * @param PatAppChangeVo
   * @return PatAppChangeVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  public PatAppChangeVo executeDynamicSelect(String sqlMapId, PatAppChangeVo vo) throws KitechException {
    return (PatAppChangeVo) selectByPk(NAMESPACE + sqlMapId, vo);
  }

  /**
   * 등록
   *
   * @author Chris
   * @param PatAppChangeVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int executeDynamicInsert(String sqlMapId, PatAppChangeVo vo) throws KitechException {
    return insert(NAMESPACE + sqlMapId, vo);
  }

  /**
   * 수정
   *
   * @author Chris
   * @param PatAppChangeVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int executeDynamicUpdate(String sqlMapId, PatAppChangeVo vo) throws KitechException {
    return update(NAMESPACE + sqlMapId, vo);
  }

  /**
   * 삭제
   *
   * @author Chris
   * @param PatAppChangeVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int executeDynamicDelete(String sqlMapId, PatAppChangeVo vo) throws KitechException {
    return delete(NAMESPACE + sqlMapId, vo);
  }

}
