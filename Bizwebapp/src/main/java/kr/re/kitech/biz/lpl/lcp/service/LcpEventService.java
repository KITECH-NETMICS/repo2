package kr.re.kitech.biz.lpl.lcp.service;

import java.util.List;

import kr.re.kitech.biz.lpl.lcp.vo.LcpEventListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpEventVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : LcpEventService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.15.      author    최초생성
 * 
 * @author 
 * @since 2023.11.15.
 * @version 1.0
 * @see
 * 
 */
public interface LcpEventService {
  
  /**
   * 국가 조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.15.
   */
  public List<LcpEventVo> selectList01(LcpEventVo vo) throws KitechException;
  
  /**
   * 조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.15.
   */
  public List<LcpEventVo> selectList02(LcpEventVo vo) throws KitechException;
  
  /**
   * 상세조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.15.
   */
  public LcpEventVo selectLcpEventDetail(LcpEventVo vo) throws KitechException;  
  
  /**
   * 비용조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.15.
   */
  public List<LcpEventVo> selectLcpEventExpen(LcpEventVo vo) throws KitechException;  
  
  /**
   * 기관조회
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.15.
   */
  public List<LcpEventVo> selectLcpEventAgncy(LcpEventVo vo) throws KitechException;
  
  /**
   * 행사비용조회 팝업
   * 
   * @author 
   * @param LcpEventVo
   * @return List<LcpEventVo>
   * @throws KitechException
   * @since 2023.11.16.
   */
  public List<LcpEventVo> selectLcpEventPop(LcpEventVo vo) throws KitechException;             

  /**
   * 단건 조회
   * 
   * @author 
   * @param LcpEventVo
   * @return LcpEventVo
   * @throws KitechException
   * @since 2023.11.15.
   */
  public LcpEventVo selectOne01(LcpEventVo vo) throws KitechException;

  
 /**
   * 국제행사 저장, 수정, 삭제
   * 
   * @author 
   * @param LcpEventListVo
   * @return LcpEventVo
   * @throws KitechException
   * @since 2023.11.17.   
   */
  public LcpEventVo CrudLcpEventAudenc(LcpEventListVo vo) throws KitechException;

}
  