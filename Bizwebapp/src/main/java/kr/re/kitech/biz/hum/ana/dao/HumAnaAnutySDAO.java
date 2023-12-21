package kr.re.kitech.biz.hum.ana.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.ana.vo.HumAnaAnutySVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : HumAnaAnutySDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.21.      author    최초생성
 * 
 * @author 
 * @since 2023.09.21.
 * @version 1.0
 * @see
 * 
 */
@Repository("humAnaAnutySDAO")
public class HumAnaAnutySDAO extends BizDefaultAbstractDAO {
  
  /**
   * 다건 조회
   * 
   * @author 
   * @param HumAnaAnutySVo
   * @return List<HumAnaAnutySVo>
   * @throws KitechException
   * @since 2023.09.21.   
   */
  @SuppressWarnings("unchecked")
public List<HumAnaAnutySVo> selectList01(HumAnaAnutySVo vo) throws KitechException {
    return (List<HumAnaAnutySVo>)list("kr.re.kitech.biz.hum.ana.selectHumAnaAnutyS", vo);
  }

}
