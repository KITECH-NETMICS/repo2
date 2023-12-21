package kr.re.kitech.biz.res.twe.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.res.twe.vo.ResDownHistVo;
import kr.re.kitech.biz.res.twe.vo.ResMarketVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : ResMarketService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.20.      author    최초생성
 * 
 * @author 
 * @since 2023.09.20.
 * @version 1.0
 * @see
 * 
 */
public interface ResMarketService {
  
  public List<ResMarketVo> selectMarketList(ResMarketVo vo) throws KitechException;
  
  public List<ResDownHistVo> selectDownHistList(ResDownHistVo vo) throws KitechException;
  
  public ResMarketVo selectMarketSingleItem(ResMarketVo FndVo) throws ElException;
  // Insert
  public String saveMarketItem(ResMarketVo FndVo) throws ElException;
  // Insert
  public String saveDownHistItem(ResDownHistVo FndVo) throws ElException;
  // Update
  public int updateMarketItem(ResMarketVo FndVo) throws ElException;
  // Delete
  public int deleteMarketItem(ResMarketVo FndVo) throws ElException;
}
  