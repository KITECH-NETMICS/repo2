package kr.re.kitech.biz.pat.app.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.app.service.PatPrityEvalReqService;
import kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqListVo;
import kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatPrityEvalReqController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.17.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.17.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPrityEvalReqController {

  @Resource(name = "patPrityEvalReqServiceImpl")
  private PatPrityEvalReqService appService;

  @ElService(key="SvcPATAPPPRIR01")
  @RequestMapping(value="SvcPATAPPPRIR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'patPrityEvalReqVoList'}")
  @ElDescription(sub="우선심사신청 리스트 조회",desc="우선심사신청 리스트 조회")
  public PatPrityEvalReqListVo selectList01(PatPrityEvalReqVo appVo) throws KitechException {
      List<PatPrityEvalReqVo> list = appService.selectList01(appVo);
      PatPrityEvalReqListVo List = new PatPrityEvalReqListVo();
      List.setPatPrityEvalReqVoList(list);
      return List;
  }

  @ElService(key="SvcPATAPPPRIR02")
  @RequestMapping(value="SvcPATAPPPRIR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,[{'id':'dma_result','key':'patPrityEvalReqVo'},{'id':'dlt_list01','key':'patPrityEvalReqVoList01'},{'id':'dlt_list02','key':'patPrityEvalReqVoList02'}]")
  @ElDescription(sub="우선심사청구 조회",desc="우선심사청구 조회")
  public PatPrityEvalReqListVo selectPatPrityEvalReq(PatPrityEvalReqVo vo) throws KitechException {
    return appService.selectPatPrityEvalReq(vo);
  }

  @ElService(key="SvcPATAPPPRIM01")
  @RequestMapping(value="SvcPATAPPPRIM01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="우선심사청구 등록",desc="우선심사청구 등록")
  public PatPrityEvalReqVo savePatPrityEvalReq(PatPrityEvalReqVo vo) throws KitechException {
    return appService.savePatPrityEvalReq(vo);
  }

  @ElService(key="SvcPATAPPPRIAPR")
  @RequestMapping(value="SvcPATAPPPRIAPR")
  @DataCollection(ref="data:json,[{'id':'dma_approval','key':'patPrityEvalReqVo'},{'id':'dlt_approval','key':'patPrityEvalReqVoList01'}]", target="")
  @ElDescription(sub="우선심사청구 결재",desc="우선심사청구 결재")
  public PatPrityEvalReqVo sendApproval(PatPrityEvalReqListVo vo) throws KitechException {
    return appService.sendApproval(vo);
  }

  @ElService(key="SvcPATAPPPRID01")
  @RequestMapping(value="SvcPATAPPPRID01")
  @DataCollection(ref="data:json,dma_delete", target="")
  @ElDescription(sub="우선심사청구 결재 삭제",desc="우선심사청구 결재 삭제")
  public PatPrityEvalReqVo deleteApproval(PatPrityEvalReqVo vo) throws KitechException {
    return appService.deleteApproval(vo);
  }

}
  