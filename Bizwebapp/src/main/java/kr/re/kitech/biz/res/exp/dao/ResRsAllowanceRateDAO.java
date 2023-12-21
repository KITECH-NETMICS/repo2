package kr.re.kitech.biz.res.exp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.res.exp.vo.ResRsAllowanceRateVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : ResRsAllowanceRateDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.      author    최초생성
 * 
 * @author 
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
@Repository("resRsAllowanceRateDAO")
public class ResRsAllowanceRateDAO extends BizDefaultAbstractDAO {
  
  /**
   * 다건 조회
   * 
   * @author 
   * @param ResRsAllowanceRateVo
   * @return List<ResRsAllowanceRateVo>
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public List<ResRsAllowanceRateVo> selectList01(ResRsAllowanceRateVo vo) throws KitechException {
    return (List<ResRsAllowanceRateVo>)list("kr.re.kitech.biz.res.exp.selectResRsAllowanceRate", vo);
  }

  /**
   * 부처코드 조회
   * 
   * @author 
   * @param ResRsAllowanceRateVo
   * @return ResRsAllowanceRateVo
   * @throws KitechException
   * @since 2023.09.13.   
   */
   public List<ResRsAllowanceRateVo> selectList02(ResRsAllowanceRateVo vo) throws KitechException {
    return (List<ResRsAllowanceRateVo>)list("kr.re.kitech.biz.res.exp.selectResRsAllowanceRateBsnsCode", vo);
  }
  
  
  
  /**
   * 단건 등록
   * 
   * @author 
   * @param ResRsAllowanceRateVo
   * @return int
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public int updateItem01(ResRsAllowanceRateVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.res.exp.mergeResRsAllowanceRate", vo);
  }
  
  public void deleteItem01(ResRsAllowanceRateVo vo) throws KitechException {
	  delete("kr.re.kitech.biz.res.exp.deleteResRsAllowanceRate", vo);
  }
  
  /**
   * 사용하지 않음 저장
   * 
   * @author 
   * @param ResRsAllowanceRateVo
   * @return int
   * @throws KitechException
   * @since 2023.10.31.   
   */
  public int updateResRsAllowanceRate(ResRsAllowanceRateVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.res.exp.updateResRsAllowanceRate", vo);
  }

}
