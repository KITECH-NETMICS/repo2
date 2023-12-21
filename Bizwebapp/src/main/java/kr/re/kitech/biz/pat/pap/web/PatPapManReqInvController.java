package kr.re.kitech.biz.pat.pap.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.pap.service.PatPapManReqInvService;
import kr.re.kitech.biz.pat.pap.vo.PatPapManReqInvListVo;
import kr.re.kitech.biz.pat.pap.vo.PatPapManReqInvVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatPapManReqInvController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.      Chris    최초생성
 * 
 * @author 
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPapManReqInvController {

  @Resource(name = "patPapManReqInvServiceImpl")
  private PatPapManReqInvService papService;

  @ElService(key="SvcPATPAPREQSR01")
  @RequestMapping(value="SvcPATPAPREQSR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPapManReqInvVo'}")
  @ElDescription(sub="출원지시 요청 조회",desc="출원지시 요청 조회")
  public PatPapManReqInvListVo selectItem01(PatPapManReqInvVo papVo) throws KitechException {
      PatPapManReqInvVo vo = papService.selectItem01(papVo); 
      PatPapManReqInvListVo List = new PatPapManReqInvListVo();
      List.setPatPapManReqInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPAPREQSR02")
  @RequestMapping(value="SvcPATPAPREQSR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPapManReqInvVo'}")
  @ElDescription(sub="출원지시 조회",desc="출원지시 조회")
  public PatPapManReqInvListVo selectItem02(PatPapManReqInvVo papVo) throws KitechException {
      PatPapManReqInvVo vo = papService.selectItem02(papVo); 
      PatPapManReqInvListVo List = new PatPapManReqInvListVo();
      List.setPatPapManReqInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPAPREQSR03")
  @RequestMapping(value="SvcPATPAPREQSR03")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPapManReqInvVo'}")
  @ElDescription(sub="출원지시 의뢰 결과 조회",desc="출원지시 의뢰 결과 조회")
  public PatPapManReqInvListVo selectItem03(PatPapManReqInvVo papVo) throws KitechException {
      PatPapManReqInvVo vo = papService.selectItem03(papVo); 
      PatPapManReqInvListVo List = new PatPapManReqInvListVo();
      List.setPatPapManReqInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPAPREQSI01")
  @RequestMapping(value="SvcPATPAPREQSI01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="출원지시 요청 등록",desc="출원지시 요청 등록")
  public void insertPapManReqInv(PatPapManReqInvVo vo) throws Exception {
      papService.insertPapManReqInv(vo);
  }

  @ElService(key="SvcPATPAPREQSI02")
  @RequestMapping(value="SvcPATPAPREQSI02")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="출원지시 의뢰 등록",desc="출원지시 의뢰 등록")
  public void insertPapReqInv(PatPapManReqInvVo vo) throws Exception {
      papService.insertPapReqInv(vo);
  }

  @ElService(key="SvcPATPAPREQSI03")
  @RequestMapping(value="SvcPATPAPREQSI03")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="출원지시 검토결과 등록",desc="출원지시 검토결과 등록")
  public void insertPapReeInv(PatPapManReqInvVo vo) throws Exception {
      papService.insertPapReeInv(vo);
  }

  @ElService(key="SvcPATPAPREQSI04")
  @RequestMapping(value="SvcPATPAPREQSI04")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="출원지시 검토결과 등록 (오류 강제 진행)",desc="출원지시 검토결과 등록 (오류 강제 진행)")
  public void insertPapReeInvTemp(PatPapManReqInvVo vo) throws Exception {
      papService.insertPapReeInvTemp(vo);
  }

}
  