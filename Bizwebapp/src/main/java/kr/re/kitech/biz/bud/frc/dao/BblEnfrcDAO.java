package kr.re.kitech.biz.bud.frc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.bud.frc.vo.BblEnfrcReqVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : BblEnfrcDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.01.      김준하   최초생성
 * 
 * @author 
 * @since 2023.09.01.
 * @version 1.0
 * @see
 * 
 */
@Repository("bblEnfrcDAO")
public class BblEnfrcDAO extends BizDefaultAbstractDAO {
  

  /**
   * 예산집행신청 리스트 조회
   * 
   * @author 
   * @param BblEnfrcReqVo
   * @return List<BblEnfrcVo>
   * @throws KitechException
   * @since 2023.09.01.   
   */
  public List<BblEnfrcReqVo> selectList01(BblEnfrcReqVo vo) throws KitechException {
    return (List<BblEnfrcReqVo>)list("kr.re.kitech.biz.bud.frc.selectBblEnfrcList", vo);
  }

  /**
   * 예산집행신청 단건 조회
   * 
   * @author 
   * @param BblEnfrcReqVo
   * @return BblEnfrcVo
   * @throws KitechException
   * @since 2023.09.01.   
   */
  public BblEnfrcReqVo selectItem01(BblEnfrcReqVo vo) throws KitechException {
    return (BblEnfrcReqVo) selectByPk("kr.re.kitech.biz.bud.frc.selectBblEnfrc", vo);
  }


}
