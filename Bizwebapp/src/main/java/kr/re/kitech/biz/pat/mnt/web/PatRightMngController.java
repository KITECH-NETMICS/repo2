package kr.re.kitech.biz.pat.mnt.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.mnt.service.PatRightMngService;
import kr.re.kitech.biz.pat.mnt.vo.PatRightMngListVo;
import kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


@Controller
public class PatRightMngController {

  @Resource(name = "patRightMngServiceImpl")
  private PatRightMngService mntService;

  @ElService(key="SvcPATMNTPATMR01")
  @RequestMapping(value="SvcPATMNTPATMR01")
  @DataCollection(ref="dma_search", target="dlt_list")
  @ElDescription(sub="권리 유지 관리자 조회",desc="권리 유지 관리자 조회")
  public PatRightMngListVo selectList(PatRightMngVo mntVo) throws Exception {
      List<PatRightMngVo> list = mntService.selectList(mntVo);    	 
      PatRightMngListVo List = new PatRightMngListVo();
      List.setPatRightMngVoList(list);
      return List;
  }

  @ElService(key="SvcPATMNTPATMI01")
  @RequestMapping(value="SvcPATMNTPATMI01")
  @DataCollection(ref="dlt_send_list", target="")
  @ElDescription(sub="권리 유지 관리자 저장",desc="권리 유지 관리자 저장")
  public void insertItem(PatRightMngListVo vo) throws Exception {
      mntService.savePatRightMntBatch(vo);
  }  

  @ElService(key="SvcPATMNTPATAPR1")
  @RequestMapping(value="SvcPATMNTPATAPR1")
  @DataCollection(ref="dma_patApproval,dma_patRightMnt", target="")
  @ElDescription(sub="권리유지 결재신청",desc="권리유지 결재신청")
  public PatRightMngVo saveReqPatRight(PatRightMngListVo vo) throws Exception {
      return mntService.saveReqPatRight(vo);
  }  

}
