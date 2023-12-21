package kr.re.kitech.biz.pat.psr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.psr.service.PatPsrMailLService;
import kr.re.kitech.biz.pat.psr.vo.PatPsrMailLListVo;
import kr.re.kitech.biz.pat.psr.vo.PatPsrMailLVo;
import kr.re.kitech.biz.pat.psr.vo.PatPsrStaListVo;
import kr.re.kitech.biz.pat.psr.vo.PatPsrStaVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

/**
 * @ClassSubJect 
 * @ClassName : PatPsrMailLController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.04.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.04.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPsrMailLController {

  @Resource(name = "patPsrMailLServiceImpl")
  private PatPsrMailLService psrService;

  @ElService(key="SvcPATPSRMSTR01")
  @RequestMapping(value="SvcPATPSRMSTR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'patPsrMailLVoList'}")
  @ElDescription(sub="출원업무 메일 이력 조회",desc="출원업무 메일 이력 조회")
  public PatPsrMailLListVo selectList01(PatPsrMailLVo psrVo) throws KitechException {
      List<PatPsrMailLVo> list = psrService.selectList01(psrVo);    	 
      PatPsrMailLListVo List = new PatPsrMailLListVo();
      List.setPatPsrMailLVoList(list);
      return List;
  }

  @ElService(key="SvcPATPSRMSTR02")
  @RequestMapping(value="SvcPATPSRMSTR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPsrStaVo'}")
  @ElDescription(sub="출원업무 프로세스 상태 조회",desc="출원업무 프로세스 상태 조회")
  public PatPsrStaListVo selectItem01(PatPsrStaVo psrVo) throws KitechException {
      PatPsrStaVo vo = psrService.selectItem01(psrVo); 
      PatPsrStaListVo List = new PatPsrStaListVo();
      List.setPatPsrStaVo(vo);
      return List;
  }
}
  