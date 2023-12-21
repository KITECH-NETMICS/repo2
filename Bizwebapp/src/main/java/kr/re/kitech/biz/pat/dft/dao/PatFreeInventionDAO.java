package kr.re.kitech.biz.pat.dft.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.dft.vo.PatFreeInventionListVo;
import kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 
 * @ClassName : PatFreeInventionDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.10.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.10.
 * @version 1.0
 * @see
 * 
 */
@Repository("patFreeInventionDAO")
public class PatFreeInventionDAO extends BizDefaultAbstractDAO {

  private static final String NAMESPACE = "kr.re.kitech.biz.pat.dft.";
  
  /**
   * 리스트 조회
   * 
   * @author Chris
   * @param PatFreeInventionVo
   * @return List<PatFreeInventionVo>
   * @throws KitechException
   * @since 2023.11.10.
   */
  public List<PatFreeInventionVo> executeDynamicSelectList(String sqlMapId, PatFreeInventionVo vo) throws KitechException {
    return (List<PatFreeInventionVo>)list(NAMESPACE + sqlMapId, vo);
  }

  /**
   * 조회
   * 
   * @author Chris
   * @param PatFreeInventionVo
   * @return PatFreeInventionVo
   * @throws KitechException
   * @since 2023.11.10.
   */
  public PatFreeInventionVo executeDynamicSelect(String sqlMapId, PatFreeInventionVo vo) throws KitechException {
    return (PatFreeInventionVo) selectByPk(NAMESPACE + sqlMapId, vo);
  }

  /**
   * 등록
   * 
   * @author Chris
   * @param PatFreeInventionVo
   * @return int
   * @throws KitechException
   * @since 2023.11.10.
   */
  public int executeDynamicInsert(String sqlMapId, PatFreeInventionVo vo) throws KitechException {
    return insert(NAMESPACE + sqlMapId, vo);
  }

  /**
   * 수정
   * 
   * @author Chris
   * @param PatFreeInventionVo
   * @return int
   * @throws KitechException
   * @since 2023.11.10.
   */
  public int executeDynamicUpdate(String sqlMapId, PatFreeInventionVo vo) throws KitechException {
    return update(NAMESPACE + sqlMapId, vo);
  }

  /**
   * 삭제
   * 
   * @author Chris
   * @param PatFreeInventionVo
   * @return int
   * @throws KitechException
   * @since 2023.11.10.
   */
  public int executeDynamicDelete(String sqlMapId, PatFreeInventionVo vo) throws KitechException {
    return delete(NAMESPACE + sqlMapId, vo);
  }

}
