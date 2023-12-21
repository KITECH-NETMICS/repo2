package kr.re.kitech.biz.ccs.cgs.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsWorkingStatusVo;
import kr.re.kitech.biz.ccs.cgs.vo.HumPotletGetDepartmentVo;
import kr.re.kitech.biz.ccs.cgs.vo.XomDtMstVo;

public interface CgsWorkingStatusService {
  // List Select Param
  public List<CgsWorkingStatusVo> selectListItem(CgsWorkingStatusVo CgsVo) throws ElException;
  public List<XomDtMstVo> selectHolidayListItem(XomDtMstVo XomVo) throws ElException;
  public List<HumPotletGetDepartmentVo> selectCodhDeptInfo(HumPotletGetDepartmentVo vo) throws ElException;
}
