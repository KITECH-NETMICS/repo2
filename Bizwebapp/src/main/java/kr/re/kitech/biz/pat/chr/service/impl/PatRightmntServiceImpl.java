package kr.re.kitech.biz.pat.chr.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.util.ControllerContextUtil;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

import kr.re.kitech.biz.pat.chr.dao.PatRightmntDAO;
import kr.re.kitech.biz.pat.chr.service.PatRightmntService;
import kr.re.kitech.biz.pat.chr.vo.PatRightmntVo;

@Service("patRightmntServiceImpl")
public class PatRightmntServiceImpl  extends EgovAbstractServiceImpl implements PatRightmntService {
  @Resource(name="patRightmntDAO")
  private PatRightmntDAO chrDAO;

  /**
    * 권리유지내역 다건 조회
    * @author 
    * @since 2023.08.02.
    */
  @Override
  public List<PatRightmntVo> selectList(PatRightmntVo vo) throws ElException {
    List<PatRightmntVo> list = chrDAO.selectList(vo);	
    return list;
  }

}
