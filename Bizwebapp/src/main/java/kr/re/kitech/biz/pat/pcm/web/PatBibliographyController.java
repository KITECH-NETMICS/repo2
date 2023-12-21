package kr.re.kitech.biz.pat.pcm.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.pcm.service.PatBibliographyService;
import kr.re.kitech.biz.pat.pcm.vo.PatBibliographyListVo;
import kr.re.kitech.biz.pat.pcm.vo.PatBibliographyVo;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

@Controller
public class PatBibliographyController {

  @Resource(name = "patBibliographyServiceImpl")
  private PatBibliographyService pcmService;


  @ElService(key="SvcPATPCMPATSR01")
  @RequestMapping(value="SvcPATPCMPATSR01")
  @DataCollection(ref="dma_search", target="dma_result")
  @ElDescription(sub="선행기술조사서 단건 조회",desc="선행기술조사서 단건 조회")
  public PatBibliographyListVo selectSingle(PatBibliographyVo pcmVo) throws Exception {
      PatBibliographyVo vo = pcmService.selectSingle(pcmVo); 
      PatBibliographyListVo List = new PatBibliographyListVo();
      List.setPatBibliographyVo(vo);
      return List;
  }
  
}
