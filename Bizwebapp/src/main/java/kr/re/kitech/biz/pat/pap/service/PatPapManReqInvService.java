package kr.re.kitech.biz.pat.pap.service;

import kr.re.kitech.biz.pat.pap.vo.PatPapManReqInvVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPapManReqInvService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.      Chris    최초생성
 * 
 * @author
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
public interface PatPapManReqInvService {
  
  /**
   * 출원지시 요청 조회
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return PatPapManReqInvVo
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public PatPapManReqInvVo selectItem01(PatPapManReqInvVo vo) throws KitechException;

  
  /**
   * 출원지시 조회
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return PatPapManReqInvVo
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public PatPapManReqInvVo selectItem02(PatPapManReqInvVo vo) throws KitechException;

  
  /**
   * 출원지시 의뢰 결과 조회
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return PatPapManReqInvVo
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public PatPapManReqInvVo selectItem03(PatPapManReqInvVo vo) throws KitechException;

  
  /**
   * 출원지시 요청 등록
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public int insertPapManReqInv(PatPapManReqInvVo vo) throws Exception;

  /**
   * 출원지시 의뢰 등록
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public int insertPapReqInv(PatPapManReqInvVo vo) throws Exception;

  /**
   * 출원지시 검토결과 등록
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public int insertPapReeInv(PatPapManReqInvVo vo) throws Exception;

  /**
   * 출원지시 검토결과 등록 (오류 강제 진행)
   * 
   * @author 
   * @param PatPapManReqInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.13.   
   */
  public int insertPapReeInvTemp(PatPapManReqInvVo vo) throws Exception;

}
  