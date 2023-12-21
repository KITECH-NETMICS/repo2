package kr.re.kitech.biz.pat.pex.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.pex.vo.PatPexReqInvVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 
 * @ClassName : PatPexReqInvDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.19.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.19.
 * @version 1.0
 * @see
 * 
 */
@Repository("patPexReqInvDAO")
public class PatPexReqInvDAO extends BizDefaultAbstractDAO {

  /**
   * 심사청구 요청 조회
   * 
   * @author Chris
   * @param PatPexReqInvVo
   * @return PatPexReqInvVo
   * @throws KitechException
   * @since 2023.09.19.   
   */
  public PatPexReqInvVo selectItem01(PatPexReqInvVo vo) throws KitechException {
    return (PatPexReqInvVo) selectByPk("kr.re.kitech.biz.pat.pex.selectPatPexReqInvSS02", vo);
  }

  /**
   * 심사청구 의뢰 결과 조회
   * 
   * @author Chris
   * @param PatPexReqInvVo
   * @return PatPexReqInvVo
   * @throws KitechException
   * @since 2023.09.19.   
   */
  public PatPexReqInvVo selectItem02(PatPexReqInvVo vo) throws KitechException {
    return (PatPexReqInvVo) selectByPk("kr.re.kitech.biz.pat.pex.selectPatPexReeInvSS01", vo);
  }

  /**
   * 동적 등록
   *
   * @author
   * @param sqlMapId, PatPexReqInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.19. 
   */
  public int executeDynamicInsert(String sqlMapId, PatPexReqInvVo vo) throws KitechException {
    return insert(sqlMapId, vo);
  }

  /**
   * 동적 수정
   *
   * @author
   * @param sqlMapId, PatPexReqInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.19. 
   */
  public int executeDynamicUpdate(String sqlMapId, PatPexReqInvVo vo) throws KitechException {
      return update(sqlMapId, vo);
  }

}
