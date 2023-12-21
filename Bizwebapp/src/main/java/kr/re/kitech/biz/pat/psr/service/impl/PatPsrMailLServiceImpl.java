package kr.re.kitech.biz.pat.psr.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import com.inswave.elfw.util.ControllerContextUtil;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

import kr.re.kitech.biz.pat.psr.dao.PatPsrMailLDAO;
import kr.re.kitech.biz.pat.psr.service.PatPsrMailLService;
import kr.re.kitech.biz.pat.psr.vo.PatPsrMailLVo;
import kr.re.kitech.biz.pat.psr.vo.PatPsrStaVo;


/**
 * @ClassSubJect 
 * @ClassName : PatPsrMailLServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.04.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.04.
 * @version 1.0
 * @see
 * 
 */
@Service("patPsrMailLServiceImpl")
public class PatPsrMailLServiceImpl  extends EgovAbstractServiceImpl implements PatPsrMailLService {
  @Resource(name="patPsrMailLDAO")
  private PatPsrMailLDAO psrDAO;
    
  /**
   * 출원업무 메일 이력 조회
   * 
   * @author Chris
   * @param PatPsrMailLVo
   * @return List<PatPsrMailLVo>
   * @throws KitechException
   * @since 2023.10.04.   
   */
  @Override
  public List<PatPsrMailLVo> selectList01(PatPsrMailLVo vo) throws KitechException {
    List<PatPsrMailLVo> list = psrDAO.selectList01(vo);	
    return list;
  }

  /**
   * 출원업무 프로세스 상태 조회
   * 
   * @author Chris
   * @param PatPsrStaVo
   * @return PatPsrStaVo
   * @throws KitechException
   * @since 2023.10.04.   
   */
  @Override
  public PatPsrStaVo selectItem01(PatPsrStaVo vo) throws KitechException {
    PatPsrStaVo resultVO = psrDAO.selectItem01(vo);			
      return resultVO;
  }

}
