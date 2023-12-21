package kr.re.kitech.biz.lpl.lcp.service;

import java.util.List;

import kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : LcpVipAudencService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.08.      author    최초생성
 * 
 * @author 
 * @since 2023.11.08.
 * @version 1.0
 * @see
 * 
 */
public interface LcpVipAudencService {
  
  /**
   * 국외귀빈 목록 조회
   * 
   * @author 
   * @param LcpVipAudencVo
   * @return List<LcpVipAudencVo>
   * @throws KitechException
   * @since 2023.11.08.   
   */
  public List<LcpVipAudencVo> selectVipAudencList(LcpVipAudencVo vo) throws KitechException;

  /**
   * 국외귀빈접견 상세조회
   * 
   * @author 
   * @param LcpVipAudencVo
   * @return LcpVipAudencVo
   * @throws KitechException
   * @since 2023.11.08.   
   */
  public LcpVipAudencListVo selectVipAudencDetail(LcpVipAudencVo vo) throws KitechException;
  
  /**
   * 기관찾기팝업(국가트리조회)
   * 
   * @author 
   * @param 
   * @return List<LcpVipAudencVo>
   * @throws KitechException
   * @since 2023.11.08.   
   */
  public List<LcpVipAudencVo> selectVipAudencPopTree(LcpVipAudencVo vo) throws KitechException;
  
  /**
   * 기관찾기팝업(기관목록조회)
   * 
   * @author 
   * @param 
   * @return List<LcpVipAudencVo>
   * @throws KitechException
   * @since 2023.11.09.   
   */
  public List<LcpVipAudencVo> selectVipAudencPopAgency(LcpVipAudencVo vo) throws KitechException;
  
  /**
   * 기관찾기팝업(조회결과)
   * 
   * @author 
   * @param 
   * @return List<LcpVipAudencVo>
   * @throws KitechException
   * @since 2023.11.09.   
   */
  public List<LcpVipAudencVo> selectVipAudencPopSearch(LcpVipAudencVo vo) throws KitechException;       

  
  /**
   * 국외귀빈 저장, 수정, 삭제
   * 
   * @author 
   * @param LcpVipAudencListVo
   * @return LcpVipAudencVo
   * @throws KitechException
   * @since 2023.11.10.   
   */
  public LcpVipAudencVo CrudLcpVipAudenc(LcpVipAudencListVo vo) throws KitechException;

}
  