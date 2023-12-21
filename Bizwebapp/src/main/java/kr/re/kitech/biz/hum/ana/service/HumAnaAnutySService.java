package kr.re.kitech.biz.hum.ana.service;

import java.util.List;

import kr.re.kitech.biz.hum.ana.vo.HumAnaAnutySVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : HumAnaAnutySService.java
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
public interface HumAnaAnutySService {
  
  /**
   * 다건 조회
   * 
   * @author 
   * @param HumAnaAnutySVo
   * @return List<HumAnaAnutySVo>
   * @throws KitechException
   * @since 2023.09.21.   
   */
  public List<HumAnaAnutySVo> selectList01(HumAnaAnutySVo vo) throws KitechException;

}
  