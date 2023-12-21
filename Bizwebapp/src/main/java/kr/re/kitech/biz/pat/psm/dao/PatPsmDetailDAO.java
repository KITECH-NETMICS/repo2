package kr.re.kitech.biz.pat.psm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.psm.vo.PatPsmDetailListVo;
import kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 
 * @ClassName : PatPsmDetailDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.08.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.08.
 * @version 1.0
 * @see
 * 
 */
@Repository("patPsmDetailDAO")
public class PatPsmDetailDAO extends BizDefaultAbstractDAO {
  
  /**
   * 단건 조회
   * 
   * @author Chris
   * @param sqlMapId, PatPsmDetailVo
   * @return PatPsmDetailVo
   * @throws KitechException
   * @since 2023.11.08.   
   */
  public PatPsmDetailVo executeDynamicSelect(String sqlMapId, PatPsmDetailVo vo) throws KitechException {
    return (PatPsmDetailVo) selectByPk("kr.re.kitech.biz.pat.psm." + sqlMapId, vo);
  }

  /**
   * 다건 조회
   * 
   * @author Chris
   * @param sqlMapId, PatPsmDetailVo
   * @return List<PatPsmDetailVo>
   * @throws KitechException
   * @since 2023.11.08.   
   */
  public List<PatPsmDetailVo> executeDynamicSelectList(String sqlMapId, PatPsmDetailVo vo) throws KitechException {
    return (List<PatPsmDetailVo>)list("kr.re.kitech.biz.pat.psm." + sqlMapId, vo);
  }

  /**
   * 단건 수정
   * 
   * @author Chris
   * @param PatPsmDetailVo
   * @return int
   * @throws KitechException
   * @since 2023.11.08.   
   */
  public int executeDynamicUpdate(String sqlMapId, PatPsmDetailVo vo) throws KitechException {
    return update("kr.re.kitech.biz.pat.psm." + sqlMapId, vo);
  }

}
