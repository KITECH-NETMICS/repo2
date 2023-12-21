package kr.re.kitech.biz.pat.poa.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.poa.vo.PatPoaPrdChngReqVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 
 * @ClassName : PatPoaPrdChngReqDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.23.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.23.
 * @version 1.0
 * @see
 * 
 */
@Repository("patPoaPrdChngReqDAO")
public class PatPoaPrdChngReqDAO extends BizDefaultAbstractDAO {
  
  /**
   * OA기간연장변경신청 조회
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return List<PatPoaPrdChngReqVo>
   * @throws KitechException
   * @since 2023.10.23.   
   */
  public List<PatPoaPrdChngReqVo> selectList01(PatPoaPrdChngReqVo vo) throws KitechException {
    return (List<PatPoaPrdChngReqVo>)list("kr.re.kitech.biz.pat.poa.selectPatOaPrdChngReqMS01", vo);
  }

  /**
   * OA기간연장신청 상세 조회
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return PatPoaPrdChngReqVo
   * @throws KitechException
   * @since 2023.10.23.   
   */
  public PatPoaPrdChngReqVo selectItem01(PatPoaPrdChngReqVo vo) throws KitechException {
    return (PatPoaPrdChngReqVo) selectByPk("kr.re.kitech.biz.pat.poa.selectPatOaPrdChngReqSS01", vo);
  }

  /**
   * OA기간연장신청저장
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return int
   * @throws KitechException
   * @since 2023.10.23.   
   */
  public int insertPatOaPrdChngReqSI(PatPoaPrdChngReqVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.pat.poa.insertPatOaPrdChngReqSI", vo);
  }

  /**
   * xomxintfatab 저장
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return int
   * @throws KitechException
   * @since 2023.10.23.   
   */
  public int insertXomxIntfaTabSI01(PatPoaPrdChngReqVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.pat.poa.insertXomxIntfaTabSI01", vo);
  }

  /**
   * OA기간연장신청수정
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return int
   * @throws KitechException
   * @since 2023.10.23.   
   */
  public int updatePatOaPrdChngReqSU(PatPoaPrdChngReqVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.pat.poa.updatePatOaPrdChngReqSU", vo);
  }

  /**
   * OA기간연장신청서 삭제
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return int
   * @throws KitechException
   * @since 2023.10.23.   
   */
  public int deletePatOaPrdChngReqSD(PatPoaPrdChngReqVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.pat.poa.deletePatOaPrdChngReqSD", vo);
  }

}
