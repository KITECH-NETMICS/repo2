package kr.re.kitech.biz.ccs.ctr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.ccs.ctr.service.CtrBiztripFareService;
import kr.re.kitech.biz.ccs.ctr.vo.CtrBiztripFareVo;

@Controller
public class CtrBiztripFareController {

  @Resource(name = "CtrBiztripFareServiceImpl")
  private CtrBiztripFareService ctrBiztripFareService;

  @ElService(key="SvcCCSCTRCTRMR01")
  @RequestMapping(value="SvcCCSCTRCTRMR01")
  @ElDescription(sub="selectListCtrBiztripFare",desc="리스트를 조회 한다.")
  public List<CtrBiztripFareVo> selectListCtrBiztripFare(CtrBiztripFareVo ctrBiztripFareVo) throws Exception {
      return ctrBiztripFareService.selectListCtrBiztripFare(ctrBiztripFareVo);
  }
  
  
  @ElService(key="SvcCCSCTRCTRMR02")
  @RequestMapping(value="SvcCCSCTRCTRMR02")
  @ElDescription(sub="insertCtrBiztripReq",desc="리스트를 조회 한다.")
  public void insertItem01(CtrBiztripFareVo ctrVo) throws Exception {
      ctrBiztripFareService.insertItem01(ctrVo);
  }
  
  
  

}
