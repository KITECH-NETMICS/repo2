package kr.re.kitech.biz.pat.poa.service;

import java.util.List;

import kr.re.kitech.biz.pat.poa.vo.PatPoaResInvVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPoaResInvService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.22.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.22.
 * @version 1.0
 * @see
 * 
 */
public interface PatPoaResInvService {
  
  /**
   * 대응안 보안요청 결과 횟수 조회
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return List<PatPoaResInvVo>
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public List<PatPoaResInvVo> selectList01(PatPoaResInvVo vo) throws KitechException;

  /**
   * OA 대응안 보안요청 결과 조회
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return PatPoaResInvVo
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public PatPoaResInvVo selectItem01(PatPoaResInvVo vo) throws KitechException;

  
  /**
   * OA 상세조회
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return PatPoaResInvVo
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public PatPoaResInvVo selectItem02(PatPoaResInvVo vo) throws KitechException;

  /**
   * OA대응안 보완요청 결과 조회
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return PatPoaResInvVo
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public PatPoaResInvVo selectItem03(PatPoaResInvVo vo) throws KitechException;
  
  /**
   * 심사청구 의뢰 결과 조회
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return PatPoaResInvVo
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public PatPoaResInvVo selectItem04(PatPoaResInvVo vo) throws KitechException;

  
  /**
   * OA 대응안 검토 등록
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public int updatePoaResInv(PatPoaResInvVo vo) throws Exception;

  /**
   * OA 첨부파일 등록
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public int insertPoaAttach(PatPoaResInvVo vo) throws KitechException;

  /**
   * OA 대응안 보완요청 결과 검토 등록
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public int updatePoaRecInv(PatPoaResInvVo vo) throws Exception;

  /**
   * OA 대응안 검토 등록
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.22.   
   */
  public int updatePoaReeInv(PatPoaResInvVo vo) throws Exception;

}
  