package kr.re.kitech.biz.ccs.cgs.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.ccs.cgs.service.CgsWorkingStatusService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsWorkingStatusListVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsWorkingStatusVo;
import kr.re.kitech.biz.ccs.cgs.vo.HumPotletGetDepartmentListVo;
import kr.re.kitech.biz.ccs.cgs.vo.HumPotletGetDepartmentVo;
import kr.re.kitech.biz.ccs.cgs.vo.XomDtMstListVo;
import kr.re.kitech.biz.ccs.cgs.vo.XomDtMstVo;
import kr.re.kitech.biz.com.service.CommonPopService;
import kr.re.kitech.biz.com.vo.DeptInfoListVo;
import kr.re.kitech.biz.com.vo.DeptInfoVo;

@Controller
public class CgsWorkingStatusController {

  @Resource(name = "CgsWorkingStatusServiceImpl")
  private CgsWorkingStatusService cgsService;

  @Resource(name="commonPopService")
	private CommonPopService popService;

  @ElService(key="SvcCCSCGSCGSMR01")
  @RequestMapping(value="SvcCCSCGSCGSMR01")
  @ElDescription(sub="selectListItem",desc="일정 조회 한다.")
  public CgsWorkingStatusListVo selectListItem(CgsWorkingStatusVo cgsVo) throws Exception {
      List<CgsWorkingStatusVo> list = cgsService.selectListItem(cgsVo);    	 
      CgsWorkingStatusListVo List = new CgsWorkingStatusListVo();
      List.setCgsWorkingStatusVoList(list);
      return List;
  }

  @ElService(key="SvcCCSCGSCGSMR02")
  @RequestMapping(value="SvcCCSCGSCGSMR02")
  @ElDescription(sub="selectListItem",desc="공휴일을 조회 한다.")
  public XomDtMstListVo selectListItem(XomDtMstVo cgsVo) throws Exception {
      List<XomDtMstVo> list = cgsService.selectHolidayListItem(cgsVo);    	 
      XomDtMstListVo List = new XomDtMstListVo();
      List.setXomDtMstVoList(list);
      return List;
  }

  @ElService(key="SvcCCSCGSCGSMR03")
  @RequestMapping(value="SvcCCSCGSCGSMR03")
  @ElDescription(sub="selectCodhDeptYmd",desc="부서 신설일 조회")
  public DeptInfoListVo selectCodhDeptYmd(DeptInfoVo vo) throws Exception {
    List<DeptInfoVo> deptInfoList = popService.selectCodhDeptInfo(vo);
		DeptInfoListVo retVo = new DeptInfoListVo();
		retVo.setDeptInfoVoList(deptInfoList);
		retVo.setTotalCount(Long.valueOf(deptInfoList.size()));
    return retVo;    
}

@ElService(key="SvcCCSCGSCGSMR04")
  @RequestMapping(value="SvcCCSCGSCGSMR04")
  @ElDescription(sub="selectCodhDeptInfo",desc="인원현황 조회")
  public HumPotletGetDepartmentListVo selectCodhDeptInfo(HumPotletGetDepartmentVo vo) throws Exception {
    List<HumPotletGetDepartmentVo> deptInfoList = cgsService.selectCodhDeptInfo(vo);
		HumPotletGetDepartmentListVo retVo = new HumPotletGetDepartmentListVo();
		retVo.setHumPotletGetDepartmentVoList(deptInfoList);
		retVo.setTotalCount(Long.valueOf(deptInfoList.size()));
    return retVo;    
}

}
