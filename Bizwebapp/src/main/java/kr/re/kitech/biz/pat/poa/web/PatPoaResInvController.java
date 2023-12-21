package kr.re.kitech.biz.pat.poa.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.poa.service.PatPoaResInvService;
import kr.re.kitech.biz.pat.poa.vo.PatPoaResInvListVo;
import kr.re.kitech.biz.pat.poa.vo.PatPoaResInvVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatPoaResInvController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.22.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.22.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPoaResInvController {

  @Resource(name = "patPoaResInvServiceImpl")
  private PatPoaResInvService poaService;

  @ElService(key="SvcPATPOAPATR01")
  @RequestMapping(value="SvcPATPOAPATR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'patPoaResInvVoList'}")
  @ElDescription(sub="대응안 보안요청 결과 횟수 조회",desc="대응안 보안요청 결과 횟수 조회")
  public PatPoaResInvListVo selectList01(PatPoaResInvVo poaVo) throws KitechException {
      List<PatPoaResInvVo> list = poaService.selectList01(poaVo);    	 
      PatPoaResInvListVo List = new PatPoaResInvListVo();
      List.setPatPoaResInvVoList(list);
      return List;
  }

  @ElService(key="SvcPATPOAPATR02")
  @RequestMapping(value="SvcPATPOAPATR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPoaResInvVo'}")
  @ElDescription(sub="OA 대응안 보안요청 결과 조회",desc="OA 대응안 보안요청 결과 조회")
  public PatPoaResInvListVo selectItem01(PatPoaResInvVo poaVo) throws KitechException {
      PatPoaResInvVo vo = poaService.selectItem01(poaVo); 
      PatPoaResInvListVo List = new PatPoaResInvListVo();
      List.setPatPoaResInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPOAPATR03")
  @RequestMapping(value="SvcPATPOAPATR03")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPoaResInvVo'}")
  @ElDescription(sub="OA 상세조회",desc="OA 상세조회")
  public PatPoaResInvListVo selectItem02(PatPoaResInvVo poaVo) throws KitechException {
      PatPoaResInvVo vo = poaService.selectItem02(poaVo); 
      PatPoaResInvListVo List = new PatPoaResInvListVo();
      List.setPatPoaResInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPOAPATR04")
  @RequestMapping(value="SvcPATPOAPATR04")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPoaResInvVo'}")
  @ElDescription(sub="OA대응안 보완요청 결과 조회",desc="OA대응안 보완요청 결과 조회")
  public PatPoaResInvListVo selectItem03(PatPoaResInvVo poaVo) throws KitechException {
      PatPoaResInvVo vo = poaService.selectItem03(poaVo); 
      PatPoaResInvListVo List = new PatPoaResInvListVo();
      List.setPatPoaResInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPOAPATR05")
  @RequestMapping(value="SvcPATPOAPATR05")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPoaResInvVo'}")
  @ElDescription(sub="심사청구 의뢰 결과 조회",desc="심사청구 의뢰 결과 조회")
  public PatPoaResInvListVo selectItem04(PatPoaResInvVo poaVo) throws KitechException {
      PatPoaResInvVo vo = poaService.selectItem04(poaVo); 
      PatPoaResInvListVo List = new PatPoaResInvListVo();
      List.setPatPoaResInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPOAPATM01")
  @RequestMapping(value="SvcPATPOAPATM01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="OA 대응안 검토 등록",desc="OA 대응안 검토 등록")
  public void updatePoaResInv(PatPoaResInvVo poaVo) throws Exception {
      poaService.updatePoaResInv(poaVo);
  }

  @ElService(key="SvcPATPOAPATM02")
  @RequestMapping(value="SvcPATPOAPATM02")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="OA 첨부파일 등록",desc="OA 첨부파일 등록")
  public void insertPoaAttach(PatPoaResInvVo poaVo) throws KitechException {
      poaService.insertPoaAttach(poaVo);
  }

  @ElService(key="SvcPATPOAPATM03")
  @RequestMapping(value="SvcPATPOAPATM03")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="OA 대응안 보완요청 결과 검토 등록",desc="OA 대응안 보완요청 결과 검토 등록")
  public void updatePoaRecInv(PatPoaResInvVo poaVo) throws Exception {
      poaService.updatePoaRecInv(poaVo);
  }

  @ElService(key="SvcPATPOAPATM04")
  @RequestMapping(value="SvcPATPOAPATM04")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="OA 대응안 검토 등록",desc="OA 대응안 검토 등록")
  public void updatePoaReeInv(PatPoaResInvVo poaVo) throws Exception {
      poaService.updatePoaReeInv(poaVo);
  }

}
  