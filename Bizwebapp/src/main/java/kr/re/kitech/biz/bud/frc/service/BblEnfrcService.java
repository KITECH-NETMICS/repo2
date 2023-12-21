package kr.re.kitech.biz.bud.frc.service;

import java.util.List;

import kr.re.kitech.biz.bud.frc.vo.BblEnfrcReqVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : BblEnfrcService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.01.      작업자    최초생성
 * 
 * @author
 * @since 2023.09.01.
 * @version 1.0
 * @see
 * 
 */
public interface BblEnfrcService {
  

  /**
   * 일반예산신청 목록 조회
   * 
   * @author 
   * @param BblEnfrcReqVo
   * @return List<BblEnfrcVo>
   * @throws KitechException
   * @since 2023.09.02.   
   */
  public List<BblEnfrcReqVo> selectList01(BblEnfrcReqVo vo) throws KitechException;

  /**
   * 일반예산신청 상세 조회
   * 
   * @author 
   * @param BblEnfrcReqVo
   * @return BblEnfrcVo
   * @throws KitechException
   * @since 2023.09.03.   
   */
  public BblEnfrcReqVo selectItem01(BblEnfrcReqVo vo) throws KitechException;

  
  /**
   * 일반예산신청 저장, 수정, 결재
   * 
   * @author 
   * @param BblEnfrcReqVo
   * @return BblEnfrcVo
   * @throws KitechException
   * @since 2023.09.11.   
   */
  public String saveItem01(BblEnfrcReqVo vo) throws KitechException;
  
  /**
   * 일반예산신청 삭제
   * 
   * @author 
   * @param BblEnfrcReqVo
   * @return BblEnfrcVo
   * @throws KitechException
   * @since 2023.09.6.   
   */
  public void deleteItem01(DelBblEnfrcVo vo) throws KitechException;  

}
