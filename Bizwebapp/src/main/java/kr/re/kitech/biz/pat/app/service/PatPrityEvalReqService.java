package kr.re.kitech.biz.pat.app.service;

import java.util.List;

import kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqListVo;
import kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPrityEvalReqService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.17.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.17.
 * @version 1.0
 * @see
 * 
 */
public interface PatPrityEvalReqService {
  
  /**
   * 우선심사신청 리스트 조회
   * 
   * @author Chris
   * @param PatPrityEvalReqVo
   * @return List<PatPrityEvalReqVo>
   * @throws KitechException
   * @since 2023.10.17.   
   */
  public List<PatPrityEvalReqVo> selectList01(PatPrityEvalReqVo vo) throws KitechException;

  /**
   * 우선심사청구 조회
   * 
   * @author Chris
   * @param PatPrityEvalReqVo
   * @return PatPrityEvalReqListVo
   * @throws KitechException
   * @since 2023.10.17.   
   */
  public PatPrityEvalReqListVo selectPatPrityEvalReq(PatPrityEvalReqVo vo) throws KitechException;

  /**
   * 우선심사청구 등록
   * 
   * @author Chris
   * @param PatPrityEvalReqVo
   * @return PatPrityEvalReqVo
   * @throws KitechException
   * @since 2023.10.17.   
   */
  public PatPrityEvalReqVo savePatPrityEvalReq(PatPrityEvalReqVo vo) throws KitechException;

  /**
   * 우선심사청구 결재
   * 
   * @author Chris
   * @param PatPrityEvalReqListVo
   * @return PatPrityEvalReqVo
   * @throws KitechException
   * @since 2023.10.17.   
   */
  public PatPrityEvalReqVo sendApproval(PatPrityEvalReqListVo vo) throws KitechException;

  /**
   * 우선심사청구 결재 삭제
   * 
   * @author Chris
   * @param PatPrityEvalReqListVo
   * @return PatPrityEvalReqVo
   * @throws KitechException
   * @since 2023.10.17.   
   */
  public PatPrityEvalReqVo deleteApproval(PatPrityEvalReqVo vo) throws KitechException;


}
  