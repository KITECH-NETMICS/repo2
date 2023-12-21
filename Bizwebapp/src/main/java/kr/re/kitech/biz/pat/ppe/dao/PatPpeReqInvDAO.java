package kr.re.kitech.biz.pat.ppe.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.ppe.vo.PatPpeReqInvVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 
 * @ClassName : PatPpeReqInvDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.14.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.14.
 * @version 1.0
 * @see
 * 
 */
@Repository("patPpeReqInvDAO")
public class PatPpeReqInvDAO extends BizDefaultAbstractDAO {

  /**
   * 우선심사청구 의뢰 조회
   * 
   * @author Chris
   * @param PatPpeReqInvVo
   * @return PatPpeReqInvVo
   * @throws KitechException
   * @since 2023.09.14.   
   */
  public PatPpeReqInvVo selectItem01(PatPpeReqInvVo vo) throws KitechException {
    return (PatPpeReqInvVo) selectByPk("kr.re.kitech.biz.pat.ppe.selectPatPpeReqInvSS01", vo);
  }

  /**
   * 우선심사청구 결과 조회
   * 
   * @author Chris
   * @param PatPpeReqInvVo
   * @return PatPpeReqInvVo
   * @throws KitechException
   * @since 2023.09.14.   
   */
  public PatPpeReqInvVo selectItem02(PatPpeReqInvVo vo) throws KitechException {
    return (PatPpeReqInvVo) selectByPk("kr.re.kitech.biz.pat.ppe.selectPatPpeReeInvSS01", vo);
  }

  /**
   * 동적 등록
   *
   * @author
   * @param sqlMapId, PatPpeReqInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.14.
   */
  public int executeDynamicInsert(String sqlMapId, PatPpeReqInvVo vo) throws KitechException {
    return insert(sqlMapId, vo);
  }

  /**
   * 동적 수정
   *
   * @author
   * @param sqlMapId, PatPpeReqInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.14.
   */
  public int executeDynamicUpdate(String sqlMapId, PatPpeReqInvVo vo) throws KitechException {
      return update(sqlMapId, vo);
  }

}
