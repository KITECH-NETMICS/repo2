package kr.re.kitech.biz.pat.ppe.service;

import kr.re.kitech.biz.pat.ppe.vo.PatPpeReqInvVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPpeReqInvService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.14.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.14.
 * @version 1.0
 * @see
 * 
 */
public interface PatPpeReqInvService {

  /**
   * 우선심사청구 의뢰 조회
   * 
   * @author Chris
   * @param PatPpeReqInvVo
   * @return PatPpeReqInvVo
   * @throws KitechException
   * @since 2023.09.14.   
   */
  public PatPpeReqInvVo selectItem01(PatPpeReqInvVo vo) throws KitechException;

  
  /**
   * 우선심사청구 결과 조회
   * 
   * @author Chris
   * @param PatPpeReqInvVo
   * @return PatPpeReqInvVo
   * @throws KitechException
   * @since 2023.09.14.   
   */
  public PatPpeReqInvVo selectItem02(PatPpeReqInvVo vo) throws KitechException;

  /**
   * 우선심사청구 평가 등록
   * 
   * @author Chris
   * @param PatPpeReqInvVo
   * @return int
   * @throws Exception
   * @since 2023.09.14.   
   */
  public int updatePpeReeInv(PatPpeReqInvVo vo) throws Exception;

  /**
   * 우선심사청구 의뢰 등록
   * 
   * @author Chris
   * @param PatPpeReqInvVo
   * @return int
   * @throws Exception
   * @since 2023.09.14.   
   */
  public int insertPpeReqInv(PatPpeReqInvVo vo) throws Exception;

}
  