package kr.re.kitech.biz.hum.ana.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.hum.ana.dao.HumAnaAnutySDAO;
import kr.re.kitech.biz.hum.ana.service.HumAnaAnutySService;
import kr.re.kitech.biz.hum.ana.vo.HumAnaAnutySVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : HumAnaAnutySServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.21.      author    최초생성
 * 
 * @author 
 * @since 2023.09.21.
 * @version 1.0
 * @see
 * 
 */
@Service("humAnaAnutySServiceImpl")
public class HumAnaAnutySServiceImpl  extends EgovAbstractServiceImpl implements HumAnaAnutySService {
  @Resource(name="humAnaAnutySDAO")
  private HumAnaAnutySDAO anaDAO;
    
  /**
   * 다건 조회
   * 
   * @author 
   * @param HumAnaAnutySVo
   * @return List<HumAnaAnutySVo>
   * @throws KitechException
   * @since 2023.09.21.   
   */
  @Override
  public List<HumAnaAnutySVo> selectList01(HumAnaAnutySVo vo) throws KitechException {
    List<HumAnaAnutySVo> list = anaDAO.selectList01(vo);	
    return list;
  }

}
