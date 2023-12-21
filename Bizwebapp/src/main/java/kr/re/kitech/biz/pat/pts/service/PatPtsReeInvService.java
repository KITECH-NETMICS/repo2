package kr.re.kitech.biz.pat.pts.service;

import java.util.List;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.pat.pts.vo.PatPtsReeInvVo;


/**
 * @ClassSubJect 
 * @ClassName : PatPtsReeInvService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.20.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.20.
 * @version 1.0
 * @see
 * 
 */
public interface PatPtsReeInvService {
  
  /**
   * 선행기술조사 보완요청 횟수 검색
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return List<PatPtsReeInvVo>
   * @throws KitechException
   * @since 2023.09.20.   
   */
  public List<PatPtsReeInvVo> selectList01(PatPtsReeInvVo vo) throws KitechException;

  /**
   * 명세서 의뢰 결과 조회
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return PatPtsReeInvVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  public PatPtsReeInvVo selectItem01(PatPtsReeInvVo vo) throws KitechException;
  
  /**
   * 명세서 상세 검색
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return PatPtsReeInvVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  public PatPtsReeInvVo selectItem02(PatPtsReeInvVo vo) throws KitechException;

  /**
   * 선행기술조사 검색
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return PatPtsReeInvVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  public PatPtsReeInvVo selectItem03(PatPtsReeInvVo vo) throws KitechException;

  /**
   * 명세서 보완요청 결과 조회
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return PatPtsReeInvVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  public PatPtsReeInvVo selectItem04(PatPtsReeInvVo vo) throws KitechException;

  /**
   * 명세서 의뢰 조회
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return PatPtsReeInvVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  public PatPtsReeInvVo selectItem05(PatPtsReeInvVo vo) throws KitechException;

  /**
   * 명세서 평가 보완요청 등록
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return int
   * @throws Exception
   * @since 2023.09.20.   
   */
  public int insertPtsReeInv(PatPtsReeInvVo vo) throws Exception;

  /**
   * 명세서작성 의뢰 등록
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return int
   * @throws Exception
   * @since 2023.09.20.   
   */
  public int insertPtsReqInv(PatPtsReeInvVo vo) throws Exception;

}
  