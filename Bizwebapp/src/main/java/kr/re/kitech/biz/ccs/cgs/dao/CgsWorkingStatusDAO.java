package kr.re.kitech.biz.ccs.cgs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsWorkingStatusVo;
import kr.re.kitech.biz.ccs.cgs.vo.HumPotletGetDepartmentVo;
import kr.re.kitech.biz.ccs.cgs.vo.XomDtMstVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("CgsWorkingStatusDAO")
public class CgsWorkingStatusDAO extends BizDefaultAbstractDAO {
  
  public List<CgsWorkingStatusVo> selectListItem(CgsWorkingStatusVo vo) throws ElException {
    return (List<CgsWorkingStatusVo>)list("kr.re.kitech.biz.ccs.cgs.selectListItemCgsWorkingStatus", vo);
  }
  
  public List<XomDtMstVo> selectHolidayListItem(XomDtMstVo vo) throws ElException {
    return (List<XomDtMstVo>)list("kr.re.kitech.biz.ccs.cgs.selectHolidayListItem", vo);
  }
  
  public List<HumPotletGetDepartmentVo> selectCodhDeptInfo(HumPotletGetDepartmentVo vo) throws ElException {
    return (List<HumPotletGetDepartmentVo>)list("kr.re.kitech.biz.ccs.cgs.selectListItemHumPotletGetDepartment", vo);
  }
  
}
