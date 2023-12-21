package kr.re.kitech.biz.ass.rpt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ass.rpt.vo.AssRptVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : AssRptDAO.java
 * @Description 
 * @Modification :   
 *     수정일                 수정자            수정내용
 *  -----------   ---------    ---------
 *  2023.10.16.      김정환            최초생성
 * 
 * @author 
 * @since 2023.10.16.
 * @version 1.0
 * @see
 * 
 */
@Repository("assRptDAO")
public class AssRptDAO extends BizDefaultAbstractDAO {
  
  /**
   * 다건 조회
   * 
   * @author 
   * @param AssRptVo
   * @return List<AssRptVo>
   * @throws KitechException
   * @since 2023.10.16.   
   */
  public List<AssRptVo> selectAssRptList(AssRptVo vo) throws KitechException {
    return list("kr.re.kitech.biz.ass.rpt.selectAssRpt", vo);
  }

}
