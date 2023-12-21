package kr.re.kitech.biz.pat.dft.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.dft.service.PatFreeInventionService;
import kr.re.kitech.biz.pat.dft.vo.PatFreeInventionListVo;
import kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatFreeInventionController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.10.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.10.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatFreeInventionController {

  @Resource(name = "patFreeInventionServiceImpl")
  private PatFreeInventionService dftService;

  @ElService(key="SvcPATDFTINVR01")
  @RequestMapping(value="SvcPATDFTINVR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,[{'id':'dma_form', 'key': 'formVo'},{'id':'dlt_smitVend', 'key': 'vendList'},{'id':'dlt_invntPsn', 'key': 'invntpsnList'},{'id':'dlt_design_attach', 'key': 'attachtab2List'}]")
  @ElDescription(sub="발명 신고서 작성 조회",desc="발명 신고서 작성 조회")
  public PatFreeInventionListVo selectPatAppFreeInvnt(PatFreeInventionVo vo) throws KitechException {
      return dftService.selectPatAppFreeInvnt(vo);
  }

  @ElService(key="SvcPATDFTINVR02")
  @RequestMapping(value="SvcPATDFTINVR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_gridInvntPsn','key':'patFreeInventionVoList'}")
  @ElDescription(sub="직무발명자 기본정보 조회",desc="직무발명자 기본정보 조회")
  public PatFreeInventionListVo getInvntPsn(PatFreeInventionVo vo) throws KitechException {
      List<PatFreeInventionVo> retList = dftService.getInvntPsn(vo);
      PatFreeInventionListVo List = new PatFreeInventionListVo();
      List.setPatFreeInventionVoList(retList);
      return List;
  }

  @ElService(key="SvcPATDFTINVR03")
  @RequestMapping(value="SvcPATDFTINVR03")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_manager','key':'patFreeInventionVo'}")
  @ElDescription(sub="구매 검수 권한 담당자 조회",desc="구매 검수 권한 담당자 조회")
  public PatFreeInventionListVo getDeptToManager(PatFreeInventionVo vo) throws KitechException {
      PatFreeInventionVo retVo = dftService.getDeptToManager(vo);
      PatFreeInventionListVo List = new PatFreeInventionListVo();
      List.setPatFreeInventionVo(retVo);
      return List;
  }

  @ElService(key="SvcPATDFTINVR04")
  @RequestMapping(value="SvcPATDFTINVR04")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'patFreeInventionVoList'}")
  @ElDescription(sub="자유발명신고서 조회",desc="자유발명신고서 조회")
  public PatFreeInventionListVo getGridResult(PatFreeInventionVo vo) throws KitechException {
      List<PatFreeInventionVo> retList = dftService.getGridResult(vo);
      PatFreeInventionListVo List = new PatFreeInventionListVo();
      List.setPatFreeInventionVoList(retList);
      return List;
  }

  @ElService(key="SvcPATDFTINVM01")
  @RequestMapping(value="SvcPATDFTINVM01")
  @DataCollection(ref="data:json,[{'id':'dma_save', 'key': 'formVo'},{'id':'dma_tabData', 'key': 'tabData'},{'id':'dlt_smitVend', 'key': 'vendList'},{'id':'dlt_del_smitVend', 'key': 'delvendList'},{'id':'dlt_invntPsn', 'key': 'invntpsnList'},{'id':'dlt_del_invntPsn', 'key': 'delpersonList'},{'id':'dlt_del_design_attach', 'key': 'delattachList'},{'id':'dlt_design_attach', 'key': 'attachtab2List'}]", target="")
  @ElDescription(sub="발명 신고서 작성 저장",desc="발명 신고서 작성 저장")
  public PatFreeInventionVo savePatAppFreeInvnt(PatFreeInventionListVo vo) throws KitechException {
      return dftService.savePatAppFreeInvnt(vo);
  }

  @ElService(key="SvcPATDFTINVAPR")
  @RequestMapping(value="SvcPATDFTINVAPR")
  @DataCollection(ref="data:json,[{'id':'dma_approval', 'key': 'core'},{'id':'dma_tabData', 'key': 'tabData'},{'id':'dlt_invntPsn', 'key': 'invntpsnList'},{'id':'dlt_smitVend', 'key': 'vendList'},{'id':'dlt_design_attach', 'key': 'attachtab2List'}]", target="")
  @ElDescription(sub="발명 신고서 결재 신청",desc="발명 신고서 결재 신청")
  public PatFreeInventionVo approval(PatFreeInventionListVo vo) throws KitechException {
      return dftService.approval(vo);
  }

  @ElService(key="SvcPATDFTINVD01")
  @RequestMapping(value="SvcPATDFTINVD01")
  @DataCollection(ref="data:json,dma_delete", target="")
  @ElDescription(sub="발명 신고서 결재 중 삭제",desc="발명 신고서 결재 중 삭제")
  public void deletePatDftInfo(PatFreeInventionVo vo) throws KitechException {
      dftService.deletePatDftInfo(vo);
  }

}
  