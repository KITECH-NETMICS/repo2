package kr.re.kitech.biz.hum.ana.service;

import java.util.List;

import kr.re.kitech.biz.hum.ana.vo.HumAnaUserVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : HumAnaUserInfoService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.14.    mklee      최초생성
 * 
 * @author 
 * @since 2023.11.14.
 * @version 1.0
 * @see
 * 
 */
 
 public interface HumAnaUserInfoService {
  
  /**
   * 직원명부총괄표 리스트조회
   * 
   * @author 
   * @param HumAnaUserVo
   * @return List<HumAnaUserVo>
   * @throws KitechException
   * @since 2023.11.14.   
   */
  public List<HumAnaUserVo> selectAnaUserInfoList(HumAnaUserVo vo) throws KitechException;
  
   /**
   * 직원명부총괄표 리스트 엑셀다운
   * 
   * @author 
   * @param HumAnaUserVo
   * @return List<HumAnaUserVo>
   * @throws KitechException
   * @since 2023.11.14.   
   */
  public List<HumAnaUserVo> selectAnaUserInfoExcel(HumAnaUserVo vo) throws KitechException;

 /**
   * 직원명부총괄표 직종조회
   * 
   * @author 
   * @param HumAnaUserVo
   * @return List<HumAnaUserVo>
   * @throws KitechException
   * @since 2023.11.14.   
   */
  public List<HumAnaUserVo> selectXodHoccyTyp(HumAnaUserVo vo) throws KitechException;

 /**
   * 직원명부총괄표 직급조회
   * 
   * @author 
   * @param HumAnaUserVo
   * @return List<HumAnaUserVo>
   * @throws KitechException
   * @since 2023.11.14.   
   */
  public List<HumAnaUserVo> selectXodhPosiInfo(HumAnaUserVo vo) throws KitechException;

}
  