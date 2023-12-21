package kr.re.kitech.biz.pat.chr.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.chr.service.PatChrCasRegstService;
import kr.re.kitech.biz.pat.chr.vo.PatChrCasInfoVo;
import kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstListVo;
import kr.re.kitech.biz.pat.chr.vo.PatChrCasRegstVo;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

@Controller
public class PatChrCasRegstController {

  @Resource(name = "patChrCasRegstServiceImpl")
  private PatChrCasRegstService chrService;

  @ElService(key="SvcPATCHRCASSR01")
  @RequestMapping(value="SvcPATCHRCASSR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'PatChrCasRegstVo'}")
  @ElDescription(sub="등록내역 조회",desc="등록내역 조회")
  public PatChrCasRegstListVo selectChrCasRegst(PatChrCasRegstVo chrVo) throws Exception {
      PatChrCasRegstVo vo = chrService.selectChrCasRegst(chrVo);
      PatChrCasRegstListVo List = new PatChrCasRegstListVo();
      List.setPatChrCasRegstVo(vo);
      return List;
  }

  @ElService(key="SvcPATCHRCASAPR1")
  @RequestMapping(value="SvcPATCHRCASAPR1")
  @DataCollection(ref="data:json,[{'id':'dma_apr_send','key':'PatChrCasRegstVo'}]", target="")
  @ElDescription(sub="등록 결재신청",desc="등록 결재신청")
  public PatChrCasRegstVo excuteApproval(PatChrCasRegstListVo vo) throws Exception {
    return chrService.excuteApproval(vo);
  }


  @ElService(key="SvcPATCHRCASID01")
  @RequestMapping(value="SvcPATCHRCASID01")
  @DataCollection(ref="data:json,[{'id':'dma_save','key':'PatChrCasRegstVo'},{'id':'dma_save','key':'PatRegstInsertVo'},{'id':'dma_save','key':'PatRegstUpdateVo'},{'id':'dma_save','key':'PatTotAcdtHisVo'}]", target="")
  @ElDescription(sub="등록내역 저장 삭제",desc="등록내역 저장 삭제")
  public PatChrCasRegstVo savePatChrRegst(PatChrCasRegstListVo vo) throws Exception {
    return chrService.savePatChrRegst(vo);
  }


  @ElService(key="SvcPATCHRCASMR02")
  @RequestMapping(value="SvcPATCHRCASMR02")
  @DataCollection(ref="data:json,[{'id':'dma_send','key':'PatRneCmtVo'},{'id':'dma_send','key':'PatSmitappVo'},{'id':'dma_send','key':'PatMastrVo'},{'id':'dma_send','key':'PatPrioritySmitappVo'}]", target="data:json,[{'id':'dma_rnecmt','key':'patRneCmtVo'},{'id':'dma_smitapp','key':'patSmitappVo'},{'id':'dma_mastr','key':'patMastrVo'},{'id':'dlt_priority_smitapp','key':'patPrioritySmitappList'}]")
  @ElDescription(sub="출원내역조회",desc="출원내역조회")
  public PatChrCasInfoVo selectChrCasPatSmitappMaster(PatChrCasRegstListVo vo) throws Exception {
    return chrService.selectChrCasPatSmitappMaster(vo);
  }


}
