package kr.re.kitech.biz.hum.ana.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.hum.ana.dao.HumAnaUserInfoDAO;
import kr.re.kitech.biz.hum.ana.service.HumAnaUserInfoService;
import kr.re.kitech.biz.hum.ana.vo.HumAnaUserVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : HumAnaUserInfoServiceImpl.java
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
@Service("humAnaUserInfoServiceImpl")
public class HumAnaUserInfoServiceImpl  extends EgovAbstractServiceImpl implements HumAnaUserInfoService {
  @Resource(name="humAnaUserInfoDAO") 
  private HumAnaUserInfoDAO anaDAO;
    
  /**
   * 직원명부총괄표 리스트조회
   * 
   * @author 
   * @param HumAnaUserVo
   * @return List<HumAnaUserVo>
   * @throws KitechException
   * @since 2023.11.14.   
   */
  public List<HumAnaUserVo> selectAnaUserInfoList(HumAnaUserVo vo) throws KitechException {
    return anaDAO.selectAnaUserInfoList(vo);	     
  }
  
   /**
   * 직원명부총괄표 리스트 엑셀다운로드
   * 
   * @author 
   * @param HumAnaUserVo
   * @return List<HumAnaUserVo>
   * @throws KitechException
   * @since 2023.11.14.   
   */
  public List<HumAnaUserVo> selectAnaUserInfoExcel(HumAnaUserVo vo) throws KitechException {
    return anaDAO.selectAnaUserInfoExcel(vo);	     
  }
  
   /**
   * 직원명부총괄표 리스트 직종조회
   * 
   * @author 
   * @param HumAnaUserVo
   * @return List<HumAnaUserVo>
   * @throws KitechException
   * @since 2023.11.14.   
   */
  public List<HumAnaUserVo> selectXodHoccyTyp(HumAnaUserVo vo) throws KitechException {
    return anaDAO.selectXodHoccyTyp(vo);	     
  }
  
  
   /**
   * 직원명부총괄표 직급조회
   * 
   * @author 
   * @param HumAnaUserVo
   * @return List<HumAnaUserVo>
   * @throws KitechException
   * @since 2023.11.14.   
   */
  public List<HumAnaUserVo> selectXodhPosiInfo(HumAnaUserVo vo) throws KitechException {
    return anaDAO.selectXodhPosiInfo(vo);	     
  }

}
