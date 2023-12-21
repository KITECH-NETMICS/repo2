package kr.re.kitech.biz.lpl.lcp.service;

import java.util.List;

import kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstFormVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : LcpAgncyMstService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.21.      author    최초생성
 * 
 * @author 
 * @since 2023.11.21.
 * @version 1.0
 * @see
 * 
 */
public interface LcpAgncyMstService {
  
  /**
   * 다건 조회
   * 
   * @author 
   * @param LcpAgncyMstVo
   * @return List<LcpAgncyMstVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  public List<LcpAgncyMstVo> selectList01(LcpAgncyMstVo vo) throws KitechException;

  /**
   * 대외협력조회 기관헤더조회 및 목록별 건수조회
   * 
   * @author 
   * @param LcpAgncyMstFormVo
   * @return LcpAgncyMstFormVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  public LcpAgncyMstFormVo selectLcpAgncyMstForm(LcpAgncyMstFormVo vo) throws KitechException;
  
  /**
   * 탭 목록 조회
   * 
   * @author 
   * @param LcpAgncyMstVo
   * @return LcpAgncyMstListVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  public LcpAgncyMstListVo selectTabList(LcpAgncyMstVo vo) throws KitechException;  

  
  /**
   * 단건 등록
   * 
   * @author 
   * @param LcpAgncyMstVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  public int insertItem01(LcpAgncyMstVo vo) throws KitechException;

}
  