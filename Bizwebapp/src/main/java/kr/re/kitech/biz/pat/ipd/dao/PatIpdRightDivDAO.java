package kr.re.kitech.biz.pat.ipd.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivListVo;
import kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 
 * @ClassName : PatIpdRightDivDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.29.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.29.
 * @version 1.0
 * @see
 * 
 */
@Repository("patIpdRightDivDAO")
public class PatIpdRightDivDAO extends BizDefaultAbstractDAO {

  private static final String NAMESPACE = "kr.re.kitech.biz.pat.ipd.";

  /**
   * 리스트 조회
   *
   * @author Chris
   * @param PatIpdRightDivVo
   * @return List<PatIpdRightDivVo>
   * @throws KitechException
   * @since 2023.11.29.
   */
  public List<PatIpdRightDivVo> executeDynamicSelectList(String sqlMapId, PatIpdRightDivVo vo) throws KitechException {
    return (List<PatIpdRightDivVo>)list(NAMESPACE + sqlMapId, vo);
  }

  /**
   * 조회
   *
   * @author Chris
   * @param PatIpdRightDivVo
   * @return PatIpdRightDivVo
   * @throws KitechException
   * @since 2023.11.29.
   */
  public PatIpdRightDivVo executeDynamicSelect(String sqlMapId, PatIpdRightDivVo vo) throws KitechException {
    return (PatIpdRightDivVo) selectByPk(NAMESPACE + sqlMapId, vo);
  }

  /**
   * 등록
   *
   * @author Chris
   * @param PatIpdRightDivVo
   * @return int
   * @throws KitechException
   * @since 2023.11.29.
   */
  public int executeDynamicInsert(String sqlMapId, PatIpdRightDivVo vo) throws KitechException {
    return insert(NAMESPACE + sqlMapId, vo);
  }

  /**
   * 수정
   *
   * @author Chris
   * @param PatIpdRightDivVo
   * @return int
   * @throws KitechException
   * @since 2023.11.29.
   */
  public int executeDynamicUpdate(String sqlMapId, PatIpdRightDivVo vo) throws KitechException {
    return update(NAMESPACE + sqlMapId, vo);
  }

  /**
   * 삭제
   *
   * @author Chris
   * @param PatIpdRightDivVo
   * @return int
   * @throws KitechException
   * @since 2023.11.29.
   */
  public int executeDynamicDelete(String sqlMapId, PatIpdRightDivVo vo) throws KitechException {
    return delete(NAMESPACE + sqlMapId, vo);
  }

}
