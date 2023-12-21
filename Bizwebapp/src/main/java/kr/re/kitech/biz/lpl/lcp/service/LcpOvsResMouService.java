package kr.re.kitech.biz.lpl.lcp.service;

import java.util.List;

import kr.re.kitech.biz.lpl.lcp.vo.LcpOvsResMouVo;
import kr.re.kitech.biz.res.agr.vo.ResInpMastListVo;
import kr.re.kitech.biz.res.agr.vo.ResInpMastVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : LcpOvsResMouService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.01.      author    최초생성
 * 
 * @author 
 * @since 2023.11.01.
 * @version 1.0
 * @see
 * 
 */
public interface LcpOvsResMouService {
  
  /**
   * 국제공동과제현황 조회
   * 
   * @author 
   * @param LcpOvsResMouVo
   * @return List<LcpOvsResMouVo>
   * @throws KitechException
   * @since 2023.11.01.   
   */
  public List<LcpOvsResMouVo> selectList01(LcpOvsResMouVo vo) throws KitechException;
  
  /**
   * 과제정보 팝업
   * 
   * @author 
   * @param ResInpMastVo
   * @return ResInpMastListVo
   * @throws KitechException
   * @since 2023.11.01.   
   */
  public ResInpMastListVo selectPrjList(ResInpMastVo vo) throws KitechException;
  
  /**
   * 과제정보 팝업
   * 
   * @author 
   * @param ResInpMastVo
   * @return ResInpMastListVo
   * @throws KitechException
   * @since 2023.11.02.   
   */
  public ResInpMastListVo selectTabList(ResInpMastVo vo) throws KitechException;      

}
  