package kr.re.kitech.biz.hum.tax.service;

import java.util.List;

import kr.re.kitech.biz.hum.tax.vo.HumTaxPayVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : HumTaxPayService.java
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
 
 public interface HumTaxPayService {
  
/**
   * 원천징수부 리스트조회
   * 
   * @author 
   * @param HumTaxPayVo
   * @return List<HumTaxPayVo>
   * @throws KitechException
   * @since 2023.11.23.   
   */
  public List<HumTaxPayVo> selectTaxPayInfoList(HumTaxPayVo vo) throws KitechException;
  
  /**
   * 원천징수 영수증 리스트조회
   * 
   * @author 
   * @param HumTaxPayVo
   * @return List<HumTaxPayVo>
   * @throws KitechException
   * @since 2023.11.26.   
   */
  public List<HumTaxPayVo> selectHumTaxPayInfoList(HumTaxPayVo vo) throws KitechException;
    
}
  