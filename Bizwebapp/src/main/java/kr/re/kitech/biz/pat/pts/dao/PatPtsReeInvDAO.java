package kr.re.kitech.biz.pat.pts.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.pts.vo.PatPtsReeInvVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 
 * @ClassName : PatPtsReeInvDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.20.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.20.
 * @version 1.0
 * @see
 * 
 */
@Repository("patPtsReeInvDAO")
public class PatPtsReeInvDAO extends BizDefaultAbstractDAO {
  
  /**
   * 선행기술조사 보완요청 횟수 검색
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return List<PatPtsReeInvVo>
   * @throws KitechException
   * @since 2023.09.20.   
   */
  public List<PatPtsReeInvVo> selectList01(PatPtsReeInvVo vo) throws KitechException {
    return (List<PatPtsReeInvVo>)list("kr.re.kitech.biz.pat.pts.selectPatPtsRecCntSS01", vo);
  }

  /**
   * 명세서 의뢰 결과 조회
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return PatPtsReeInvVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  public PatPtsReeInvVo selectItem01(PatPtsReeInvVo vo) throws KitechException {
    return (PatPtsReeInvVo) selectByPk("kr.re.kitech.biz.pat.pts.selectPatPtsReeInvSS01", vo);
  }

  /**
   * 명세서 상세 검색
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return PatPtsReeInvVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  public PatPtsReeInvVo selectItem02(PatPtsReeInvVo vo) throws KitechException {
    return (PatPtsReeInvVo) selectByPk("kr.re.kitech.biz.pat.pts.selectPatPtsRecInvSS02", vo);
  }

  /**
   * 선행기술조사 검색
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return PatPtsReeInvVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  public PatPtsReeInvVo selectItem03(PatPtsReeInvVo vo) throws KitechException {
    return (PatPtsReeInvVo) selectByPk("kr.re.kitech.biz.pat.pts.selectPatPtsRecInvSS01", vo);
  }

  /**
   * 명세서 보완요청 결과 조회
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return PatPtsReeInvVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  public PatPtsReeInvVo selectItem04(PatPtsReeInvVo vo) throws KitechException {
    return (PatPtsReeInvVo) selectByPk("kr.re.kitech.biz.pat.pts.selectPatPtsRecInvSS02", vo);
  }

  /**
   * 명세서 의뢰 조회
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return PatPtsReeInvVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  public PatPtsReeInvVo selectItem05(PatPtsReeInvVo vo) throws KitechException {
    return (PatPtsReeInvVo) selectByPk("kr.re.kitech.biz.pat.pts.selectPatPtsReqInvSS01", vo);
  }

  /**
   * 동적 등록
   *
   * @author
   * @param sqlMapId, PatPtsReeInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.20.   
   */
  public int executeDynamicInsert(String sqlMapId, PatPtsReeInvVo vo) throws KitechException {
    return insert(sqlMapId, vo);
  }

  /**
   * 동적 수정
   *
   * @author
   * @param sqlMapId, PatPtsReeInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.20.   
   */
  public int executeDynamicUpdate(String sqlMapId, PatPtsReeInvVo vo) throws KitechException {
      return update(sqlMapId, vo);
  }

}
