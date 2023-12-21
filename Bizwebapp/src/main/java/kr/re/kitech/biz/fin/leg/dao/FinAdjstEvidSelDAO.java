package kr.re.kitech.biz.fin.leg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.leg.vo.FinAdjstEvidSelVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : FinAdjstEvidSelDAO.java
 * @Description 
 * @Modification :   
 *     수정일              수정자              수정내용
 *  -----------   ---------   ---------
 *  2023.09.15.    김정환              최초생성
 * 
 * @author  김정환
 * @since 2023.09.15.
 * @version 1.0
 * @see
 * 
 */
@Repository("finAdjstEvidSelDAO")
public class FinAdjstEvidSelDAO extends BizDefaultAbstractDAO {
  
  /**
   * 정산증빙자료 조회
   * 
   * @author 김정환
   * @param FinAdjstEvidSelVo
   * @return List<FinAdjstEvidSelVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
  public List<FinAdjstEvidSelVo> selectList(FinAdjstEvidSelVo vo) throws KitechException {
    return (List<FinAdjstEvidSelVo>)list("kr.re.kitech.biz.fin.leg.selectFinAdjstEvidSel", vo);
  }

}
