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

import kr.re.kitech.biz.fin.seq.dao.FinFsaledgrDAO;
import kr.re.kitech.biz.fin.seq.service.FinFsaledgrService;
import kr.re.kitech.biz.fin.seq.vo.FinFsaledgrVo;


/**
 * @ClassSubJect 합계잔액시산표
 * @ClassName : FinFsaledgrServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.26.     이지훈    최초생성
 * 
 * @author 이지훈
 * @since 2023.09.26.
 * @version 1.0
 * @see
 * 
 */
@Service("finFsaledgrServiceImpl")
public class FinFsaledgrServiceImpl  extends EgovAbstractServiceImpl implements FinFsaledgrService {
  @Resource(name="finFsaledgrDAO")
  private FinFsaledgrDAO finDAO;
    
  /**
   * 다건 조회
   * 
   * @author 이지훈
   * @param FinFsaledgrVo
   * @return List<FinFsaledgrVo>
   * @throws KitechException
   * @since 2023.09.26.   
   */
  @Override
  public List<FinFsaledgrVo> selectList01(FinFsaledgrVo vo) throws KitechException {
    List<FinFsaledgrVo> list = finDAO.selectList01(vo);	
    return list;
  }



}
