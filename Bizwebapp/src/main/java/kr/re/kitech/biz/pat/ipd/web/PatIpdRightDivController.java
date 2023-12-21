package kr.re.kitech.biz.pat.ipd.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.ipd.service.PatIpdRightDivService;
import kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivListVo;
import kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatIpdRightDivController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.29.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.29.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatIpdRightDivController {

  @Resource(name = "patIpdRightDivServiceImpl")
  private PatIpdRightDivService ipdService;

  @ElService(key="SvcPATIPDRNDR01")
  @RequestMapping(value="SvcPATIPDRNDR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,[{'id':'dma_draftInfo','key':'draftInfo'},{'id':'dlt_smipAppLst','key':'smipAppLst'}]")
  @ElDescription(sub="우선권/분할 신청서 조회",desc="우선권/분할 신청서 조회")
  public PatIpdRightDivListVo retrieveDraftInfo(PatIpdRightDivVo vo) throws KitechException {
      return ipdService.retrieveDraftInfo(vo);
  }

  @ElService(key="SvcPATIPDRNDR02")
  @RequestMapping(value="SvcPATIPDRNDR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'patIpdRightDivVoList'}")
  @ElDescription(sub="우선권/분할 신청서 리스트 조회",desc="우선권/분할 신청서 리스트 조회")
  public PatIpdRightDivListVo patIpdRightDivSelectList(PatIpdRightDivVo vo) throws KitechException {
    List<PatIpdRightDivVo> retVo = ipdService.patIpdRightDivSelectList(vo); 
    PatIpdRightDivListVo List = new PatIpdRightDivListVo();
    List.setPatIpdRightDivVoList(retVo);
    return List;
  }

  @ElService(key="SvcPATIPDRNDM01")
  @RequestMapping(value="SvcPATIPDRNDM01")
  @DataCollection(ref="data:json,[{'id':'dma_save','key':'patIpdRightDivVo'}, {'id':'dlt_smipAppLst','key':'patIpdList'}]", target="")
  @ElDescription(sub="우선권/분할 신청서 임시저장",desc="우선권/분할 신청서 임시저장")
  public PatIpdRightDivVo patIpdtempSave(PatIpdRightDivListVo vo) throws KitechException {
      return ipdService.patIpdtempSave(vo);
  }

  @ElService(key="SvcPATIPDRNDD01")
  @RequestMapping(value="SvcPATIPDRNDD01")
  @DataCollection(ref="data:json,dma_delete", target="")
  @ElDescription(sub="신청서 삭제",desc="신청서 삭제")
  public void deletePatAprInfo(PatIpdRightDivVo vo) throws KitechException {
      ipdService.deletePatAprInfo(vo);
  }

  @ElService(key="SvcPATIPDRNDAPR")
  @RequestMapping(value="SvcPATIPDRNDAPR")
  @DataCollection(ref="data:json,[{'id':'dma_approval','key':'core'}, {'id':'dlt_smipAppLst','key':'smipAppLst'}]", target="")
  @ElDescription(sub="우선권/분할 결재 신청",desc="우선권/분할 결재 신청")
  public PatIpdRightDivVo approval(PatIpdRightDivListVo vo) throws KitechException {
      return ipdService.approval(vo);
  }

}
  