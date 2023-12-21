package kr.re.kitech.biz.res.exp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.res.exp.dao.ResRsAllowanceRateDAO;
import kr.re.kitech.biz.res.exp.service.ResRsAllowanceRateService;
import kr.re.kitech.biz.res.exp.vo.ResRsAllowanceRateVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : ResRsAllowanceRateServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.      author    최초생성
 * 
 * @author 
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
@Service("resRsAllowanceRateServiceImpl")
public class ResRsAllowanceRateServiceImpl  extends EgovAbstractServiceImpl implements ResRsAllowanceRateService {
  @Resource(name="resRsAllowanceRateDAO")
  private ResRsAllowanceRateDAO expDAO;
    
  /**
   * 다건 조회
   * 
   * @author 
   * @param ResRsAllowanceRateVo
   * @return List<ResRsAllowanceRateVo>
   * @throws KitechException
   * @since 2023.09.13.   
   */
  @Override
  public List<ResRsAllowanceRateVo> selectList01(ResRsAllowanceRateVo vo) throws KitechException {
    List<ResRsAllowanceRateVo> list = expDAO.selectList01(vo);	
    return list;
  }

  /**
   * 부처코드 조회
   * 
   * @author 
   * @param ResRsAllowanceRateVo
   * @return ResRsAllowanceRateVo
   * @throws KitechException
   * @since 2023.09.13.   
   */
  @Override
  public List<ResRsAllowanceRateVo> selectList02(ResRsAllowanceRateVo vo) throws KitechException {
    List<ResRsAllowanceRateVo> list = expDAO.selectList02(vo);	
    return list;
  }

  /**
   * 단건 등록
   * 
   * @author 
   * @param ResRsAllowanceRateVo
   * @return int
   * @throws KitechException
   * @since 2023.09.13.   
   */
  @Override
  	public void updateItem01(ResRsAllowanceRateVo vo) throws KitechException {
  		if("N".equals(vo.getUse_yn())){
  			expDAO.updateResRsAllowanceRate(vo);
  		}else{
  			expDAO.updateItem01(vo);
  		}
	}

  /**
   * 단건 삭제
   * 
   * @author 이지훈
   * @param ResRsAllowanceRateVo
   * @return 
   * @throws KitechException
   * @since 2023.09.20.   
   */
  @Override
  public void deleteItem01(ResRsAllowanceRateVo vo) throws KitechException {
	expDAO.deleteItem01(vo);
	
  }

}
