package kr.re.kitech.biz.pat.ptl.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.ptl.service.PatPtlResWorkService;
import kr.re.kitech.biz.pat.ptl.vo.PatPtlResWorkListVo;
import kr.re.kitech.biz.pat.ptl.vo.PatPtlResWorkVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatPtlResWorkController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.12.      이대훈    최초생성
 * 
 * @author 
 * @since 2023.09.12.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPtlResWorkController {

  @Resource(name = "patPtlResWorkServiceImpl")
  private PatPtlResWorkService ptlService;

  @ElService(key="SvcPATPTLRESSR01")
  @RequestMapping(value="SvcPATPTLRESSR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPtlResWorkVo'}")
  @ElDescription(sub="번역 제출보고 조회",desc="번역 제출보고 조회")
  public PatPtlResWorkListVo selectItem01(PatPtlResWorkVo ptlVo) throws KitechException {
      PatPtlResWorkVo vo = ptlService.selectItem01(ptlVo); 
      PatPtlResWorkListVo List = new PatPtlResWorkListVo();
      List.setPatPtlResWorkVo(vo);
      return List;
  }

  @ElService(key="SvcPATPTLRESSR02")
  @RequestMapping(value="SvcPATPTLRESSR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPtlResWorkVo'}")
  @ElDescription(sub="번역 제출보고 상세 조회",desc="번역 제출보고 상세 조회")
  public PatPtlResWorkListVo selectItem02(PatPtlResWorkVo ptlVo) throws KitechException {
      PatPtlResWorkVo vo = ptlService.selectItem02(ptlVo); 
      PatPtlResWorkListVo List = new PatPtlResWorkListVo();
      List.setPatPtlResWorkVo(vo);
      return List;
  }

  @ElService(key="SvcPATPTLRESSI01")
  @RequestMapping(value="SvcPATPTLRESSI01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="번역 제출보고 결과검토 등록",desc="번역 제출보고 결과검토 등록")
  public void updatePtlResInv(PatPtlResWorkVo vo) throws Exception {
      ptlService.updatePtlResInv(vo);
  }

}
  