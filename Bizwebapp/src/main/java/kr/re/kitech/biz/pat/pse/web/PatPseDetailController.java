package kr.re.kitech.biz.pat.pse.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.pse.service.PatPseDetailService;
import kr.re.kitech.biz.pat.pse.vo.PatPseDetailListVo;
import kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatPseDetailController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.09.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.09.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPseDetailController {

  @Resource(name = "patPseDetailServiceImpl")
  private PatPseDetailService pseService;

  @ElService(key="SvcPATPSEDTLR01")
  @RequestMapping(value="SvcPATPSEDTLR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,[{'id':'dma_patPseExam','key':'patPseExam'},{'id':'dlt_outSideExam','key':'outSideExam'},{'id':'dlt_jointExam','key':'jointExam'},{'id':'dlt_giveUpExam','key':'giveUpExam'}]")
  @ElDescription(sub="지심의 조회",desc="지심의 조회")
  public PatPseDetailListVo selectList01(PatPseDetailVo vo) throws KitechException {
      return pseService.retrieveExamDtl(vo);
  }
}
  