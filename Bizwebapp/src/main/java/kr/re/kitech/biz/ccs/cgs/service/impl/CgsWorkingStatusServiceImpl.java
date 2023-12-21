package kr.re.kitech.biz.ccs.cgs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ccs.cgs.dao.CgsWorkingStatusDAO;
import kr.re.kitech.biz.ccs.cgs.service.CgsWorkingStatusService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsWorkingStatusVo;
import kr.re.kitech.biz.ccs.cgs.vo.HumPotletGetDepartmentVo;
import kr.re.kitech.biz.ccs.cgs.vo.XomDtMstVo;

@Service("CgsWorkingStatusServiceImpl")
public class CgsWorkingStatusServiceImpl  extends EgovAbstractServiceImpl implements CgsWorkingStatusService {
  @Resource(name="CgsWorkingStatusDAO")
  private CgsWorkingStatusDAO cgsDAO;

  @Override
  public List<CgsWorkingStatusVo> selectListItem(CgsWorkingStatusVo vo) throws ElException {
    List<CgsWorkingStatusVo> list = cgsDAO.selectListItem(vo);	
    return list;
  }
  
  @Override
  public List<XomDtMstVo> selectHolidayListItem(XomDtMstVo vo) throws ElException {
    List<XomDtMstVo> list = cgsDAO.selectHolidayListItem(vo);	
    return list;
  }
  
  @Override
  public List<HumPotletGetDepartmentVo> selectCodhDeptInfo(HumPotletGetDepartmentVo vo) throws ElException {
    List<HumPotletGetDepartmentVo> list = cgsDAO.selectCodhDeptInfo(vo);	
    return list;
  }
  
}
