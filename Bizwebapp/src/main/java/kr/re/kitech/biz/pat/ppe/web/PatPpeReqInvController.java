package kr.re.kitech.biz.pat.ppe.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.ppe.service.PatPpeReqInvService;
import kr.re.kitech.biz.pat.ppe.vo.PatPpeReqInvListVo;
import kr.re.kitech.biz.pat.ppe.vo.PatPpeReqInvVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatPpeReqInvController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.14.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.14.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPpeReqInvController {
  @Resource(name = "patPpeReqInvServiceImpl")
  private PatPpeReqInvService ppeService;
  

  @ElService(key="SvcPATPPEREQR01")
  @RequestMapping(value="SvcPATPPEREQR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPpeReqInvVo'}")
  @ElDescription(sub="우선심사청구 의뢰 조회",desc="우선심사청구 의뢰 조회")
  public PatPpeReqInvListVo selectItem01(PatPpeReqInvVo ppeVo) throws KitechException {
      PatPpeReqInvVo vo = ppeService.selectItem01(ppeVo); 
      PatPpeReqInvListVo List = new PatPpeReqInvListVo();
      List.setPatPpeReqInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPPEREQR02")
  @RequestMapping(value="SvcPATPPEREQR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPpeReqInvVo'}")
  @ElDescription(sub="우선심사청구 결과 조회",desc="우선심사청구 결과 조회")
  public PatPpeReqInvListVo selectItem02(PatPpeReqInvVo ppeVo) throws KitechException {
      PatPpeReqInvVo vo = ppeService.selectItem02(ppeVo); 
      PatPpeReqInvListVo List = new PatPpeReqInvListVo();
      List.setPatPpeReqInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPPEREQM01")
  @RequestMapping(value="SvcPATPPEREQM01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="우선심사청구 의뢰 등록",desc="우선심사청구 의뢰 등록")
  public void insertPpeReqInv(PatPpeReqInvVo ppeVo) throws Exception {
      ppeService.insertPpeReqInv(ppeVo);
  }

  @ElService(key="SvcPATPPEREQM02")
  @RequestMapping(value="SvcPATPPEREQM02")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="우선심사청구 평가 등록",desc="우선심사청구 평가 등록")
  public void updatePpeReeInv(PatPpeReqInvVo ppeVo) throws Exception {
      ppeService.updatePpeReeInv(ppeVo);
  }

}
  