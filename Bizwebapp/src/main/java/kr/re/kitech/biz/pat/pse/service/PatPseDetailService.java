package kr.re.kitech.biz.pat.pse.service;

import kr.re.kitech.biz.pat.pse.vo.PatPseDetailListVo;
import kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPseDetailService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.09.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.09.
 * @version 1.0
 * @see
 * 
 */
public interface PatPseDetailService {
  
  /**
   * 지심의 조회
   * 
   * @author Chris
   * @param PatPseDetailVo
   * @return PatPseDetailListVo
   * @throws KitechException
   * @since 2023.11.09.
   */
  public PatPseDetailListVo retrieveExamDtl(PatPseDetailVo vo) throws KitechException;

}
  