package kr.re.kitech.biz.fin.spa.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.fin.spa.service.FspPayAdvcAdjstService;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstListVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstVo;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

@Controller
public class FspPayAdvcAdjstController {

  @Resource(name = "fspPayAdvcAdjstServiceImpl")
  private FspPayAdvcAdjstService spaService;

  @ElService(key="SvcFINSPAADJR01")
  @RequestMapping(value="SvcFINSPAADJR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="가지급금/전도금정산(신청결의내역조회)리스트",desc="가지급금/전도금정산(신청결의내역조회)리스트 조회한다.")
  public FspPayAdvcAdjstListVo selectList01(FspPayAdvcAdjstVo spaVo) throws Exception {
      List<FspPayAdvcAdjstVo> list = spaService.selectFspPayAdvcAdjstList(spaVo);    	 
      FspPayAdvcAdjstListVo List = new FspPayAdvcAdjstListVo();
      List.setFspPayAdvcAdjstVoList(list);
      return List;
  }

  @ElService(key="SvcFINSPAADJR02")
  @RequestMapping(value="SvcFINSPAADJR02")
  @DataCollection(ref="", target="")
  @ElDescription(sub="가지급금 및 전도금신청 내역을 조회",desc="가지급금 및 전도금신청 내역을 조회한다.")
  public FspPayAdvcAdjstListVo selectItem01(FspPayAdvcAdjstVo spaVo) throws Exception {
      FspPayAdvcAdjstListVo vo = spaService.selectFspPayAdvcAdjst(spaVo); 
      
      return vo;
  }

  @ElService(key="SvcFINSPAADJI01")
  @RequestMapping(value="SvcFINSPAADJI01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="가지급금 및 전도금정산 입력내역을 저장",desc="가지급금 및 전도금정산 입력내역을 저장한다.")
  public FspPayAdvcAdjstVo insertItem01(FspPayAdvcAdjstListVo spaVo) throws Exception {
      
      return spaService.insertFspPayAdvcAdjst(spaVo);
  }
  
  @ElService(key="SvcFINSPAADJD01")
  @RequestMapping(value="SvcFINSPAADJD01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="가지급금 및 전도금정산 입력내역을 삭제",desc="가지급금 및 전도금정산 입력내역을 삭제한다.")
  public FspPayAdvcAdjstVo deleteItem01(FspPayAdvcAdjstListVo spaVo) throws Exception {
      
      return spaService.deleteFspPayAdvcAdjst(spaVo);
  }  
  
  

}
