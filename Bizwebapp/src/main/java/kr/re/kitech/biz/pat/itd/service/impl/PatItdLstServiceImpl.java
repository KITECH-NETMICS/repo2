package kr.re.kitech.biz.pat.itd.service.impl;

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

import kr.re.kitech.biz.pat.itd.dao.PatItdLstDAO;
import kr.re.kitech.biz.pat.itd.service.PatItdLstService;
import kr.re.kitech.biz.pat.itd.vo.PatItdLstVo;


/**
 * @ClassSubJect 
 * @ClassName : PatItdLstServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.30.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.30.
 * @version 1.0
 * @see
 * 
 */
@Service("patItdLstServiceImpl")
public class PatItdLstServiceImpl  extends EgovAbstractServiceImpl implements PatItdLstService {
  @Resource(name="patItdLstDAO")
  private PatItdLstDAO itdDAO;
    
  /**
   * 출원업무대기함 조회
   * 
   * @author Chris
   * @param PatItdLstVo
   * @return List<PatItdLstVo>
   * @throws KitechException
   * @since 2023.10.30.   
   */
  @Override
  public List<PatItdLstVo> selectList01(PatItdLstVo vo) throws KitechException {
    List<PatItdLstVo> list = itdDAO.selectList01(vo);	
    return list;
  }

}
