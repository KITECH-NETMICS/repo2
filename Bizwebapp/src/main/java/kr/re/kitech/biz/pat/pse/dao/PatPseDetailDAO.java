package kr.re.kitech.biz.pat.pse.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.pse.vo.PatPseDetailListVo;
import kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 
 * @ClassName : PatPseDetailDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.09.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.09.
 * @version 1.0
 * @see
 * 
 */
@Repository("patPseDetailDAO")
public class PatPseDetailDAO extends BizDefaultAbstractDAO {
  
  /**
   * 단건 조회
   * 
   * @author Chris
   * @param sqlMapId, PatPseDetailVo
   * @return PatPseDetailVo
   * @throws KitechException
   * @since 2023.11.09.   
   */
  public PatPseDetailVo executeDynamicSelect(String sqlMapId, PatPseDetailVo vo) throws KitechException {
    return (PatPseDetailVo) selectByPk("kr.re.kitech.biz.pat.pse." + sqlMapId, vo);
  }

  /**
   * 다건 조회
   * 
   * @author Chris
   * @param sqlMapId, PatPseDetailVo
   * @return List<PatPseDetailVo>
   * @throws KitechException
   * @since 2023.11.09.   
   */
  public List<PatPseDetailVo> executeDynamicSelectList(String sqlMapId, PatPseDetailVo vo) throws KitechException {
    return (List<PatPseDetailVo>)list("kr.re.kitech.biz.pat.pse." + sqlMapId, vo);
  }

}
