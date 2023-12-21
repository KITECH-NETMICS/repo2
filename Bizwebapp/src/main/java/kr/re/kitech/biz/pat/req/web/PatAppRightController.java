package kr.re.kitech.biz.pat.req.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.mnt.vo.PatRightMngListVo;
import kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo;
import kr.re.kitech.biz.pat.req.service.PatAppRightService;
import kr.re.kitech.biz.pat.req.vo.PatAppRightListVo;
import kr.re.kitech.biz.pat.req.vo.PatAppRightVo;
import kr.re.kitech.biz.pat.req.vo.PatResLstListVo;
import kr.re.kitech.biz.pat.req.vo.PatResLstVo;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

@Controller
public class PatAppRightController {

  @Resource(name = "patAppRightServiceImpl")
  private PatAppRightService reqService;

  @ElService(key="SvcPATREQPATSR01")
  @RequestMapping(value="SvcPATREQPATSR01")
  @DataCollection(ref="dma_search", target="dma_result")
  @ElDescription(sub="권리유지신청 주발명자 상세조회",desc="권리유지신청 주발명자 상세조회")
  public PatAppRightListVo selectItem01(PatAppRightVo reqVo) throws Exception {
      PatAppRightVo vo = reqService.selectItem01(reqVo); 
      PatAppRightListVo List = new PatAppRightListVo();
      List.setPatAppRightVo(vo);
      return List;
  }

  @ElService(key="SvcPATREQPATMR01")
  @RequestMapping(value="SvcPATREQPATMR01")
  @DataCollection(ref="dma_res_search", target="dlt_res_list")
  @ElDescription(sub="과제 검색",desc="과제 검색")
  public PatResLstListVo selectList01(PatResLstVo reqVo) throws Exception {
      List<PatResLstVo> list = reqService.selectList01(reqVo);         
      PatResLstListVo List = new PatResLstListVo();
      List.setPatResLstVoList(list);
      return List;
  }

  @ElService(key="SvcPATREQPATSI01")
  @RequestMapping(value="SvcPATREQPATSI01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="유지신청 저장",desc="유지신청 저장")
  public PatRightMngVo insertItem01(PatRightMngListVo vo) throws Exception {
    return reqService.insertItem01(vo);
  }

}
