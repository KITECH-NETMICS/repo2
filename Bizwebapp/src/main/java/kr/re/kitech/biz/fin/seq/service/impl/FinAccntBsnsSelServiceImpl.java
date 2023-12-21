package kr.re.kitech.biz.fin.seq.service.impl;

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

import kr.re.kitech.biz.fin.seq.dao.FinAccntBsnsSelDAO;
import kr.re.kitech.biz.fin.seq.service.FinAccntBsnsSelService;
import kr.re.kitech.biz.fin.seq.vo.FinAccntBsnsSelVo;


/**
 * @ClassSubJect 계정별사업수행현황
 * @ClassName : FinAccntBsnsSelServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.04.     이지훈    최초생성
 * 
 * @author 이지훈
 * @since 2023.10.04.
 * @version 1.0
 * @see
 * 
 */
@Service("finAccntBsnsSelServiceImpl")
public class FinAccntBsnsSelServiceImpl  extends EgovAbstractServiceImpl implements FinAccntBsnsSelService {
  @Resource(name="finAccntBsnsSelDAO")
  private FinAccntBsnsSelDAO finDAO;
    
  /**
   * 다건 조회
   * 
   * @author 
   * @param FinAccntBsnsSelVo
   * @return List<FinAccntBsnsSelVo>
   * @throws KitechException
   * @since 2023.10.04.   
   */
  @Override
  public List<FinAccntBsnsSelVo> selectList01(FinAccntBsnsSelVo vo) throws KitechException {
    List<FinAccntBsnsSelVo> list = finDAO.selectList01(vo);	
    return list;
  }



}
