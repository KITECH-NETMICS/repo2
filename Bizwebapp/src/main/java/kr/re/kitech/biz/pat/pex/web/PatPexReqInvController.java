package kr.re.kitech.biz.pat.pex.web;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;
import kr.re.kitech.biz.xom.base.exception.KitechException;

import kr.re.kitech.biz.pat.pex.service.PatPexReqInvService;
import kr.re.kitech.biz.pat.pex.vo.PatPexReqInvListVo;
import kr.re.kitech.biz.pat.pex.vo.PatPexReqInvVo;


/**
 * @ClassSubJect 
 * @ClassName : PatPexReqInvController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.19.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.19.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPexReqInvController {

  @Resource(name = "patPexReqInvServiceImpl")
  private PatPexReqInvService pexService;

  @ElService(key="SvcPATPEXREQR01")
  @RequestMapping(value="SvcPATPEXREQR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPexReqInvVo'}")
  @ElDescription(sub="심사청구 요청 조회",desc="심사청구 요청 조회")
  public PatPexReqInvListVo selectItem01(PatPexReqInvVo pexVo) throws KitechException {
      PatPexReqInvVo vo = pexService.selectItem01(pexVo); 
      PatPexReqInvListVo List = new PatPexReqInvListVo();
      List.setPatPexReqInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPEXREQR02")
  @RequestMapping(value="SvcPATPEXREQR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPexReqInvVo'}")
  @ElDescription(sub="심사청구 의뢰 결과 조회",desc="심사청구 의뢰 결과 조회")
  public PatPexReqInvListVo selectItem02(PatPexReqInvVo pexVo) throws KitechException {
      PatPexReqInvVo vo = pexService.selectItem02(pexVo); 
      PatPexReqInvListVo List = new PatPexReqInvListVo();
      List.setPatPexReqInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPEXREQM01")
  @RequestMapping(value="SvcPATPEXREQM01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="심사청구 의뢰 등록",desc="심사청구 의뢰 등록")
  public void insertPexReqInv(PatPexReqInvVo pexVo) throws Exception {
      pexService.insertPexReqInv(pexVo);
  }

  @ElService(key="SvcPATPEXREQM02")
  @RequestMapping(value="SvcPATPEXREQM02")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="심사청구 평가 등록",desc="심사청구 평가 등록")
  public void updatePexReeInv(PatPexReqInvVo pexVo) throws Exception {
      pexService.updatePexReeInv(pexVo);
  }

}
  