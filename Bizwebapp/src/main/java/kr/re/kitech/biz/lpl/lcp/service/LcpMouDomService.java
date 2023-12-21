package kr.re.kitech.biz.lpl.lcp.service;

import java.util.List;

import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomExcelVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : LcpMouDomService.java
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
public interface LcpMouDomService {
  
  /**
   * 다건 조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouDomVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  public List<LcpMouDomVo> selectList01(LcpMouDomVo vo) throws KitechException;
  
  /**
   * 액셀 리스트 조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouDomVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  public List<LcpMouDomExcelVo> selectList02(LcpMouDomVo vo) throws KitechException;
  
  /**
   * 실무자 그리드 셋팅  조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouDomVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  public List<LcpMouDomVo> selectLcpMouDomUserGrid(LcpMouDomVo vo) throws KitechException;    

  /**
   * 국내협약 상세 조회
   * 
   * @author 
   * @param LcpMouDomFormVo
   * @return LcpMouDomVo
   * @throws KitechException
   * @since 2023.11.22.
   */
  public LcpMouDomFormVo selectLcpMouDomForm(LcpMouDomVo vo) throws KitechException;

  /**
   * 국내협약 사후관리  조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouDomAftrVo>
   * @throws KitechException
   * @since 2023.11.22.
   */
  public List<LcpMouDomAftrVo> selectLcpMouDomAfter(LcpMouDomVo vo) throws KitechException;
  
  /**
   * 국내협약긴관정보조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouDomAgencyVo>
   * @throws KitechException
   * @since 2023.11.22.
   */
  public List<LcpMouDomAgencyVo> selectLcpMouDomAgy(LcpMouDomVo vo) throws KitechException;
  
  /**
   * 실무자 유저  조회
   * 
   * @author 
   * @param LcpMouDomVo
   * @return List<LcpMouUserVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  public List<LcpMouUserVo> selectLcpMouDomUser(LcpMouDomVo vo) throws KitechException;
          
  /**
   * 국내협약사후저장, 수정, 삭제
   * 
   * @author 
   * @param LcpMouDomListVo
   * @return LcpMouDomFormVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  public LcpMouDomFormVo crudInfoDom(LcpMouDomListVo vo) throws KitechException;

}
  