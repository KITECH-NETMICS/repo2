package kr.re.kitech.biz.pat.pcm.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.pcm.service.PatPcmMainService;
import kr.re.kitech.biz.pat.pcm.vo.PatPcmMainListVo;
import kr.re.kitech.biz.pat.pcm.vo.PatPcmMainVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatPcmMainController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.04.      이대훈    최초생성
 * 
 * @author 
 * @since 2023.09.04.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPcmMainController {

  @Resource(name = "patPcmMainServiceImpl")
  private PatPcmMainService pcmService;

  @ElService(key="SvcPATPCMMANSR01")
  @RequestMapping(value="SvcPATPCMMANSR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_rev_param','key':'patPcmMainVo'}")
  @ElDescription(sub="출원업무공통탭 파라미터 조회",desc="출원업무공통탭 파라미터 조회")
  public PatPcmMainListVo selectParam(PatPcmMainVo pcmVo) throws KitechException {
      PatPcmMainVo vo = pcmService.selectParam(pcmVo); 
      PatPcmMainListVo List = new PatPcmMainListVo();
      List.setPatPcmMainVo(vo);
      return List;
  }

}
  