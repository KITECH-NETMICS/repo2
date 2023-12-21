package kr.re.kitech.biz.pat.poa.service;

import java.util.List;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.poa.vo.PatPoaPrdChngReqVo;


/**
 * @ClassSubJect 
 * @ClassName : PatPoaPrdChngReqService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.23.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.23.
 * @version 1.0
 * @see
 * 
 */
public interface PatPoaPrdChngReqService {
  
  /**
   * OA기간연장변경신청 조회
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return List<PatPoaPrdChngReqVo>
   * @throws KitechException
   * @since 2023.10.23.   
   */
  public List<PatPoaPrdChngReqVo> selectList01(PatPoaPrdChngReqVo vo) throws KitechException;

  /**
   * OA기간연장신청 상세 조회
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return PatPoaPrdChngReqVo
   * @throws KitechException
   * @since 2023.10.23.   
   */
  public PatPoaPrdChngReqVo selectItem01(PatPoaPrdChngReqVo vo) throws KitechException;

  
  /**
   * OA기간연장신청서 저장
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return PatPoaPrdChngReqVo
   * @throws KitechException
   * @since 2023.10.23.   
   */
  public PatPoaPrdChngReqVo savePatOaPrdMnt(PatPoaPrdChngReqVo vo) throws KitechException;

  /**
   * OA기간연장신청서 결재
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return PatPoaPrdChngReqVo
   * @throws KitechException
   * @since 2023.10.23.   
   */
  public PatPoaPrdChngReqVo sendApproval(PatPoaPrdChngReqVo vo) throws KitechException;

  
  /**
   * OA기간연장신청서 삭제
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return PatPoaPrdChngReqVo
   * @throws KitechException
   * @since 2023.10.23.   
   */
  public PatPoaPrdChngReqVo deletePatOaPrdChngReqSD(PatPoaPrdChngReqVo vo) throws KitechException;

}
  