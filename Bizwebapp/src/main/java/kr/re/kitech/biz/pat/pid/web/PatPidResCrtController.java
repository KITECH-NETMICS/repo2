package kr.re.kitech.biz.pat.pid.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.pid.service.PatPidResCrtService;
import kr.re.kitech.biz.pat.pid.vo.PatPidResCrtListVo;
import kr.re.kitech.biz.pat.pid.vo.PatPidResCrtVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

@Controller
public class PatPidResCrtController {

  @Resource(name = "patPidResCrtServiceImpl")
  private PatPidResCrtService pidService;


  @ElService(key="SvcPATPIDPATSR01")
  @RequestMapping(value="SvcPATPIDPATSR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPidResCrtVo'}")
  @ElDescription(sub="IDS제출 단건 조회",desc="IDS제출 단건 조회")
  public PatPidResCrtListVo selectSingle(PatPidResCrtVo pidVo) throws Exception {
      PatPidResCrtVo vo = pidService.selectSingle(pidVo);
      PatPidResCrtListVo List = new PatPidResCrtListVo();
      List.setPatPidResCrtVo(vo);
      return List;
  }

  @ElService(key="SvcPATPIDPATSR02")
  @RequestMapping(value="SvcPATPIDPATSR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPidResCrtVo'}")
  @ElDescription(sub="IDS 제출보고 조회",desc="IDS 제출보고 조회")
  public PatPidResCrtListVo selectItem01(PatPidResCrtVo pidVo) throws KitechException {
      PatPidResCrtVo vo = pidService.selectItem01(pidVo);
      PatPidResCrtListVo List = new PatPidResCrtListVo();
      List.setPatPidResCrtVo(vo);
      return List;
  }

  @ElService(key="SvcPATPIDPATSU01")
  @RequestMapping(value="SvcPATPIDPATSU01")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="IDS 제출보고 검토 등록 (주발명자)",desc="IDS 제출보고 검토 등록 (주발명자)")
  public void updateItem(PatPidResCrtVo pidVo) throws Exception {
      pidService.updateItem(pidVo);
  }
  
  

}
