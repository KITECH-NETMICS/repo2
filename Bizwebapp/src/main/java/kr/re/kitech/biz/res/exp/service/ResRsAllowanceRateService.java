package kr.re.kitech.biz.res.exp.service;

import java.util.List;

import kr.re.kitech.biz.res.exp.vo.ResRsAllowanceRateVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : ResRsAllowanceRateService.java
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
public interface ResRsAllowanceRateService {
  
  /**
   * 다건 조회
   * 
   * @author 
   * @param ResRsAllowanceRateVo
   * @return List<ResRsAllowanceRateVo>
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public List<ResRsAllowanceRateVo> selectList01(ResRsAllowanceRateVo vo) throws KitechException;

  /**
   * 부처코드 조회
   * 
   * @author 
   * @param ResRsAllowanceRateVo
   * @return ResRsAllowanceRateVo
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public List<ResRsAllowanceRateVo> selectList02(ResRsAllowanceRateVo vo) throws KitechException;
  
  /**
   * 단건 등록
   * 
   * @author 
   * @param ResRsAllowanceRateVo
   * @return int
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public void updateItem01(ResRsAllowanceRateVo vo) throws KitechException;



  public void deleteItem01(ResRsAllowanceRateVo vo) throws KitechException;
}

  
  