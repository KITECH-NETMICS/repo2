package kr.re.kitech.biz.fin.spm.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.spm.service.FinSlipAftEvidService;
import kr.re.kitech.biz.fin.spm.vo.FinSlipAftEvidListVo;
import kr.re.kitech.biz.fin.spm.vo.FinSlipAftEvidVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : FinSlipAftEvidController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.07.      작업자    최초생성
 * 
 * @author 
 * @since 2023.09.07.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class FinSlipAftEvidController {

  @Resource(name = "finSlipAftEvidServiceImpl")
  private FinSlipAftEvidService finService;
  
  @ElService(key = "SvcFINSLIPAFTEVIDMR01")
  @RequestMapping(value = "SvcFINSLIPAFTEVIDMR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'finVoList'}")
  @ElDescription(sub = "다건 조회", desc = "다건 아이템을 조회한다.")
  @ElValidator(errUrl = "")
  public List<FinSlipAftEvidListVo> selectSlipAftEvidInfoList(FinSlipAftEvidVo finVo) throws KitechException {
      return finService.selectSlipAftEvidInfoList(finVo);
  }
  
  @ElService(key = "SvcFINSLIPAFTEVIDSU01")
  @RequestMapping(value = "SvcFINSLIPAFTEVIDSU01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'finVoList'}")
  @ElDescription(sub = "사후증빙 저장", desc = "사후증빙을 저장한다.")
  @ElValidator(errUrl = "")
  public FinSlipAftEvidListVo updateSlipAftEvidInfo(FinSlipAftEvidVo finVo) throws KitechException {
      return finService.updateSlipAftEvidInfo(finVo);
  }
}
  