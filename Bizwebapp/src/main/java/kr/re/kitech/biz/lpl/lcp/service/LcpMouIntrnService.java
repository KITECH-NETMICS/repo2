package kr.re.kitech.biz.lpl.lcp.service;

import java.util.List;

import kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : LcpMouIntrnService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.20.      author    최초생성
 * 
 * @author 
 * @since 2023.11.20.
 * @version 1.0
 * @see
 * 
 */
public interface LcpMouIntrnService {
  
  /**
   * 다건 조회
   * 
   * @author 
   * @param LcpMouIntrnVo
   * @return List<LcpMouIntrnVo>
   * @throws KitechException
   * @since 2023.11.20.
   */
  public List<LcpMouIntrnVo> selectList01(LcpMouIntrnVo vo) throws KitechException;

  /**
   * 단건 조회
   * 
   * @author 
   * @param LcpMouIntrnVo
   * @return LcpMouIntrnVo
   * @throws KitechException
   * @since 2023.11.20.
   */
  public LcpMouIntrnVo selectItem01(LcpMouIntrnVo vo) throws KitechException;
  
  /**
   * 국내협약기관정보 다건 조회
   * 
   * @author 
   * @param LcpMouDomAgencyVo
   * @return List<LcpMouDomAgencyVo>
   * @throws KitechException
   * @since 2023.11.20.
   */
  public List<LcpMouDomAgencyVo> selectList02(LcpMouDomAgencyVo vo) throws KitechException;
  
  /**
   * 국제협약사후관리조회 다건 조회
   * 
   * @author 
   * @param LcpMouAfactVo
   * @return List<LcpMouAfactVo>
   * @throws KitechException
   * @since 2023.11.20.
   */
  public List<LcpMouAfactVo> selectList03(LcpMouAfactVo vo) throws KitechException;     

  
  /**
   * 국제협약사후저장, 수정, 삭제
   * 
   * @author 
   * @param LcpMouAfactListVo
   * @return LcpMouIntrnVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  public LcpMouIntrnVo crudInfo(LcpMouIntrnListVo vo) throws KitechException;

}
  