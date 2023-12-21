package kr.re.kitech.biz.pat.pex.service;

import java.util.List;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.pex.vo.PatPexReqInvVo;


/**
 * @ClassSubJect 
 * @ClassName : PatPexReqInvService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.19.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.19.
 * @version 1.0
 * @see
 * 
 */
public interface PatPexReqInvService {

  /**
   * 심사청구 요청 조회
   * 
   * @author Chris
   * @param PatPexReqInvVo
   * @return PatPexReqInvVo
   * @throws KitechException
   * @since 2023.09.19.   
   */
  public PatPexReqInvVo selectItem01(PatPexReqInvVo vo) throws KitechException;
  
  /**
   * 심사청구 의뢰 결과 조회
   * 
   * @author Chris
   * @param PatPexReqInvVo
   * @return PatPexReqInvVo
   * @throws KitechException
   * @since 2023.09.19.   
   */
  public PatPexReqInvVo selectItem02(PatPexReqInvVo vo) throws KitechException;

  
  /**
   * 심사청구 의뢰 등록
   * 
   * @author Chris
   * @param PatPexReqInvVo
   * @return int
   * @throws Exception
   * @since 2023.09.19.   
   */
  public int insertPexReqInv(PatPexReqInvVo vo) throws Exception;

  /**
   * 심사청구 평가 등록
   * 
   * @author Chris
   * @param PatPexReqInvVo
   * @return int
   * @throws Exception
   * @since 2023.09.19.   
   */
  public int updatePexReeInv(PatPexReqInvVo vo) throws Exception;

}
  