package kr.re.kitech.biz.pat.ptl.service;

import kr.re.kitech.biz.pat.ptl.vo.PatPtlResWorkVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPtlResWorkService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.12.      이대훈    최초생성
 * 
 * @author
 * @since 2023.09.12.
 * @version 1.0
 * @see
 * 
 */
public interface PatPtlResWorkService {
  
  /**
   * 번역 제출보고 조회
   * 
   * @author 
   * @param PatPtlResWorkVo
   * @return PatPtlResWorkVo
   * @throws KitechException
   * @since 2023.09.12.   
   */
  public PatPtlResWorkVo selectItem01(PatPtlResWorkVo vo) throws KitechException;

  /**
   * 번역 제출보고 상세 조회
   * 
   * @author 
   * @param PatPtlResWorkVo
   * @return PatPtlResWorkVo
   * @throws KitechException
   * @since 2023.09.12.   
   */
  public PatPtlResWorkVo selectItem02(PatPtlResWorkVo vo) throws KitechException;

  /**
   * 번역 제출보고 결과검토 등록
   * 
   * @author 
   * @param PatPtlResWorkVo
   * @return int
   * @throws KitechException
   * @since 2023.09.12.   
   */
  public int updatePtlResInv(PatPtlResWorkVo vo) throws Exception;

}
  