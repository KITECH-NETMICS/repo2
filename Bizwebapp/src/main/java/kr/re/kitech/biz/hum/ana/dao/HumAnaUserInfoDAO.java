package kr.re.kitech.biz.hum.ana.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.ana.vo.HumAnaUserVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : HumAnaUserInfoSDAO.java
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
@Repository("humAnaUserInfoDAO")
public class HumAnaUserInfoDAO extends BizDefaultAbstractDAO {
  
 /**
   * 직원명부총괄표 리스트조회
   * 
   * @author 
   * @param HumAnaUserVo
   * @return List<HumAnaUserVo>
   * @throws KitechException
   * @since 2023.11.14.   
   */
  @SuppressWarnings("unchecked")
  public List<HumAnaUserVo> selectAnaUserInfoList(HumAnaUserVo vo) throws KitechException {
	  //조회구분
	  //1 : 겸직
	  //2 : 프로젝트
	  //3 : 전체
	  if("1".equals(vo.getSearchGubn())){
	  	  return (List<HumAnaUserVo>)list("kr.re.kitech.biz.hum.ana.selectAnaUserAddInfoList", vo);
	  }else if("2".equals(vo.getSearchGubn())){
	  	  return (List<HumAnaUserVo>)list("kr.re.kitech.biz.hum.ana.selectAnaUserPrjInfoList", vo);
	  }else{
	  	  return (List<HumAnaUserVo>)list("kr.re.kitech.biz.hum.ana.selectAnaUserInfoList", vo);
	  }  
  }
  
 /**
   * 직원명부총괄표 엑셀 상세 다운
   * 
   * @author 
   * @param HumAnaUserVo
   * @return List<HumAnaUserVo>
   * @throws KitechException
   * @since 2023.11.14.   
   */
  @SuppressWarnings("unchecked")
  public List<HumAnaUserVo> selectAnaUserInfoExcel(HumAnaUserVo vo) {
    //엑셀 개인정보 포함 다운로드 이력 관리
    if("1".equals(vo.getPrivacy_info())){
    	 vo.setParam(vo.toString());
    	 insert("kr.re.kitech.biz.hum.ana.insertHumResidnoDownHis", vo); 
    }
  
	return (List<HumAnaUserVo>)list("kr.re.kitech.biz.hum.ana.selectAnaUserInfoListExcel", vo);  
  }
  
  /**
   * 직원명부총괄표 직종조회
   * 
   * @author 
   * @param HumAnaUserVo
   * @return List<HumAnaUserVo>
   * @throws KitechException
   * @since 2023.11.14.   
   */
  @SuppressWarnings("unchecked")
  public List<HumAnaUserVo> selectXodHoccyTyp(HumAnaUserVo vo) {
	return (List<HumAnaUserVo>)list("kr.re.kitech.biz.hum.ana.selectXodHoccyTyp", vo);  
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
  @SuppressWarnings("unchecked")
  public List<HumAnaUserVo> selectXodhPosiInfo(HumAnaUserVo vo) {
	return (List<HumAnaUserVo>)list("kr.re.kitech.biz.hum.ana.selectXodhPosiInfo", vo);  
  }

}

