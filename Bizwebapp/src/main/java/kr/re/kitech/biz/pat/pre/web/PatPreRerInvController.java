package kr.re.kitech.biz.pat.pre.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.pre.service.PatPreRerInvService;
import kr.re.kitech.biz.pat.pre.vo.PatPreRecInvVo;
import kr.re.kitech.biz.pat.pre.vo.PatPreReqInvVo;
import kr.re.kitech.biz.pat.pre.vo.PatPreRerInvListVo;
import kr.re.kitech.biz.pat.pre.vo.PatPreRerInvVo;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

@Controller
public class PatPreRerInvController {

  @Resource(name = "patPreRerInvServiceImpl")
  private PatPreRerInvService preService;

  @ElService(key="SvcPATPRERERSR01")
  @RequestMapping(value="SvcPATPRERERSR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPreRerInvVo'}")
  @ElDescription(sub="등록결정보고 조회",desc="등록결정보고 조회")
  public PatPreRerInvListVo selectItem01(PatPreRerInvVo preVo) throws Exception {
      PatPreRerInvVo vo = preService.selectItem01(preVo); 
      PatPreRerInvListVo List = new PatPreRerInvListVo();
      List.setPatPreRerInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPRERERSU01")
  @RequestMapping(value="SvcPATPRERERSU01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="등록지시 확인 등록",desc="등록지시 확인 등록")
  public void updateItem01(PatPreRerInvVo preVo) throws Exception {
      preService.updateItem01(preVo);
  }

  @ElService(key="SvcPATPRERERSR02")
  @RequestMapping(value="SvcPATPRERERSR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPreRecInvVo'}")
  @ElDescription(sub="등록지시 결과 조회",desc="등록지시 결과 조회")
  public PatPreRerInvListVo selectItem02(PatPreRecInvVo preVo) throws Exception {
      PatPreRecInvVo vo = preService.selectItem02(preVo); 
      PatPreRerInvListVo List = new PatPreRerInvListVo();
      List.setPatPreRecInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPRERERSU02")
  @RequestMapping(value="SvcPATPRERERSU02")
  @DataCollection(ref="data:json,[{'id':'dma_save','key':'patPreRecInvVo'},{'id':'dma_save','key':'patMastrVo'}]", target="data:json,dma_save_result")
  @ElDescription(sub="등록지시 결과 검토 등록",desc="등록지시 결과 검토 등록")
  public PatPreRecInvVo updatePreRecInv(PatPreRerInvListVo vo) throws Exception {
	  int result = 0;
	  PatPreRecInvVo returnVo = new PatPreRecInvVo();	  
      result = preService.updatePreRecInv(vo);
      returnVo.setResult(result);
      return returnVo;
  }

  @ElService(key="SvcPATPRERERSR03")
  @RequestMapping(value="SvcPATPRERERSR03")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPreReqInvVo'}")
  @ElDescription(sub="등록지시 의뢰 조회",desc="등록지시 의뢰 조회")
  public PatPreRerInvListVo selectItem03(PatPreReqInvVo preVo) throws Exception {
      PatPreReqInvVo vo = preService.selectItem03(preVo); 
      PatPreRerInvListVo List = new PatPreRerInvListVo();
      List.setPatPreReqInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPRERERSU03")
  @RequestMapping(value="SvcPATPRERERSU03")
  @DataCollection(ref="data:json,[{'id':'dma_save','key':'patPreReqInvVo'},{'id':'dma_save','key':'patMastrVo'}]", target="data:json,dma_save_result")
  @ElDescription(sub="등록지시 의뢰 등록",desc="등록지시 의뢰 등록")
  public PatPreRecInvVo updatePreReqInv(PatPreRerInvListVo vo) throws Exception {
	  int result = 0;
	  PatPreRecInvVo returnVo = new PatPreRecInvVo();	  
      result = preService.updatePreReqInv(vo);
      returnVo.setResult(result);
      return returnVo;
  }

}
