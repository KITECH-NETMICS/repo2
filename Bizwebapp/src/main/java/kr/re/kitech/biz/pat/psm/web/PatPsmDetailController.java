package kr.re.kitech.biz.pat.psm.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.psm.service.PatPsmDetailService;
import kr.re.kitech.biz.pat.psm.vo.PatPsmDetailListVo;
import kr.re.kitech.biz.pat.psm.vo.PatPsmDetailVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatPsmDetailController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.08.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.08.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPsmDetailController {

  @Resource(name = "patPsmDetailServiceImpl")
  private PatPsmDetailService psmService;

  @ElService(key="SvcPATPSMDTLR01")
  @RequestMapping(value="SvcPATPSMDTLR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,[{'id':'dma_patPsmExam','key':'patPsmExam'},{'id':'dlt_patPsmExamArea','key':'patPsmExamArea'},{'id':'dlt_krExam','key':'krExam'},{'id':'dlt_freeExam','key':'freeExam'},{'id':'dlt_etcExam','key':'etcExam'},{'id':'dlt_programExam','key':'programExam'}]")
  @ElDescription(sub="소연심의 상세조회",desc="소연심의 상세조회")
  public PatPsmDetailListVo selectList01(PatPsmDetailVo vo) throws KitechException {
      return psmService.retrieveExamDtl(vo);
  }

  @ElService(key="SvcPATPSMDTLU01")
  @RequestMapping(value="SvcPATPSMDTLU01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="첨부파일 수정",desc="첨부파일 수정")
  public void saveExamAttach(PatPsmDetailVo vo) throws KitechException {
      psmService.saveExamAttach(vo);
  }

  @ElService(key="SvcPATPSMDTLR02")
  @RequestMapping(value="SvcPATPSMDTLR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPsmDetailVo'}")
  @ElDescription(sub="첨부파일 다운로드",desc="첨부파일 다운로드")
  public PatPsmDetailListVo patFileSearch(PatPsmDetailVo vo) throws KitechException {
      PatPsmDetailListVo retVo = new PatPsmDetailListVo();
      retVo.setPatPsmDetailVo(psmService.patFileSearch(vo));
      return retVo;
  }
}
  