package kr.re.kitech.biz.fin.leg.service;

import java.util.List;

import kr.re.kitech.biz.fin.leg.vo.FinAdjstEvidSelVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : FinAdjstEvidSelService.java
 * @Description 
 * @Modification :   
 *     수정일               수정자             수정내용
 *  -----------   ---------   ---------
 *  2023.09.15.     김정환             최초생성
 * 
 * @author 김정환
 * @since 2023.09.15.
 * @version 1.0
 * @see
 * 
 */
public interface FinAdjstEvidSelService {

  /**
   * 다건 조회
   * 
   * @author  김정환
   * @param FinAdjstEvidSelVo
   * @return List<FinAdjstEvidSelVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
  public List<FinAdjstEvidSelVo> selectList(FinAdjstEvidSelVo vo) throws KitechException;

}
  