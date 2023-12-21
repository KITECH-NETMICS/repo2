package kr.re.kitech.biz.hum.tax.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.tax.vo.HumTaxPayVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : HumTaxPayDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.23.    mklee      최초생성
 * 
 * @author 
 * @since 2023.11.23.
 * @version 1.0
 * @see
 * 
 */
@Repository("humTaxPayDAO")
public class HumTaxPayDAO extends BizDefaultAbstractDAO {
  
 /**
   * 원천징수부 리스트조회
   * 
   * @author 
   * @param HumTaxPayVo
   * @return List<HumTaxPayVo>
   * @throws KitechException
   * @since 2023.11.23.   
   */
  @SuppressWarnings("unchecked")
  public List<HumTaxPayVo> selectTaxPayInfoList(HumTaxPayVo vo) throws KitechException {
	  
	  return (List<HumTaxPayVo>)list("kr.re.kitech.biz.hum.tax.selectTaxPayInfoList", vo);
	    
  }  
  
   /**
   * 원천징수 영수증 리스트조회
   * 
   * @author 
   * @param HumTaxPayVo
   * @return List<HumTaxPayVo>
   * @throws KitechException
   * @since 2023.11.26.   
   */
  @SuppressWarnings("unchecked")
  public List<HumTaxPayVo> selectHumTaxPayInfoList(HumTaxPayVo vo) throws KitechException {
	  if("excel".equals(vo.getSearchGubun())){
		  return (List<HumTaxPayVo>)list("kr.re.kitech.biz.hum.tax.selectHumTaxPayInfoExcel", vo);
	  }else{
		  return (List<HumTaxPayVo>)list("kr.re.kitech.biz.hum.tax.selectHumTaxPayInfoList", vo);
	  }
	    
  }  
}

