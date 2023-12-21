package kr.re.kitech.biz.pat.poa.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.poa.vo.PatPoaResInvVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 
 * @ClassName : PatPoaResInvDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.22.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.22.
 * @version 1.0
 * @see
 * 
 */
@Repository("patPoaResInvDAO")
public class PatPoaResInvDAO extends BizDefaultAbstractDAO {
  
  /**
   * OA 대응안 보안요청 결과 횟수 조회
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return List<PatPoaResInvVo>
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public List<PatPoaResInvVo> selectList01(PatPoaResInvVo vo) throws KitechException {
    return (List<PatPoaResInvVo>)list("kr.re.kitech.biz.pat.poa.selectPatPoaResCntSS01", vo);
  }

  /**
   * OA 대응안 보안요청 결과 조회
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return PatPoaResInvVo
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public PatPoaResInvVo selectItem01(PatPoaResInvVo vo) throws KitechException {
    return (PatPoaResInvVo) selectByPk("kr.re.kitech.biz.pat.poa.selectPatPoaResInvSS01", vo);
  }
  
  /**
   * OA 상세조회
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return PatPoaResInvVo
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public PatPoaResInvVo selectItem02(PatPoaResInvVo vo) throws KitechException {
    return (PatPoaResInvVo) selectByPk("kr.re.kitech.biz.pat.poa.selectPatPoaResInvSS02", vo);
  }

  /**
   * OA대응안 보완요청 결과 조회
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return PatPoaResInvVo
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public PatPoaResInvVo selectItem03(PatPoaResInvVo vo) throws KitechException {
    return (PatPoaResInvVo) selectByPk("kr.re.kitech.biz.pat.poa.selectPatPoaRecInvSS01", vo);
  }

  /**
   * 심사청구 의뢰 결과 조회
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return PatPoaResInvVo
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public PatPoaResInvVo selectItem04(PatPoaResInvVo vo) throws KitechException {
    return (PatPoaResInvVo) selectByPk("kr.re.kitech.biz.pat.poa.selectPatPoaReeInvSS01", vo);
  }

  /**
   * 단건 등록
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public int insertItem01(PatPoaResInvVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.pat.poa.insertPatPoaResInv", vo);
  }

  /**
   * 동적 등록
   *
   * @author
   * @param sqlMapId, PatPoaResInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public int executeDynamicInsert(String sqlMapId, PatPoaResInvVo vo) throws KitechException {
    return insert(sqlMapId, vo);
  }

  /**
   * 동적 수정
   *
   * @author
   * @param sqlMapId, PatPoaResInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public int executeDynamicUpdate(String sqlMapId, PatPoaResInvVo vo) throws KitechException {
      return update(sqlMapId, vo);
  }

  /**
   * 동적 삭제
   *
   * @author
   * @param sqlMapId, PatPoaResInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public int executeDynamicDelete(String sqlMapId, PatPoaResInvVo vo) throws KitechException {
      return delete(sqlMapId, vo);
  }

}
