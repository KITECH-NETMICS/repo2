package kr.re.kitech.biz.pat.app.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.app.service.PatAppChangeService;
import kr.re.kitech.biz.pat.app.vo.PatAppChangeListVo;
import kr.re.kitech.biz.pat.app.vo.PatAppChangeVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatAppChangeController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.21.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.21.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatAppChangeController {

  @Resource(name = "patAppChangeServiceImpl")
  private PatAppChangeService appService;

  @ElService(key="SvcPATAPPCHNR01")
  @RequestMapping(value="SvcPATAPPCHNR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'patAppChangeVoList'}")
  @ElDescription(sub="변경신청 조회",desc="변경신청 조회")
  public PatAppChangeListVo selectChangeList(PatAppChangeVo vo) throws KitechException {
      List<PatAppChangeVo> retList = appService.selectChangeList(vo);
      PatAppChangeListVo List = new PatAppChangeListVo();
      List.setPatAppChangeVoList(retList);
      return List;
  }

  @ElService(key="SvcPATAPPCHNR02")
  @RequestMapping(value="SvcPATAPPCHNR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,[{'id':'dma_apr_result','key':'patAppChangeVo'},{'id':'dlt_after','key':'after'},{'id':'dlt_before','key':'before'}]")
  @ElDescription(sub="변경신청 상세 조회",desc="변경신청 상세 조회")
  public PatAppChangeListVo selectChngInfo(PatAppChangeVo vo) throws KitechException {
    return appService.selectChngInfo(vo); 
  }

  @ElService(key="SvcPATAPPCHNR03")
  @RequestMapping(value="SvcPATAPPCHNR03")
  @DataCollection(ref="data:json,dma_search", target="data:json,[{'id':'dma_hisdata','key':'hisdata'}, {'id':'dlt_hisdataList','key':'patAppChangeVoList'}]")
  @ElDescription(sub="변경(공동발명자 지분율)내역 조회",desc="변경(공동발명자 지분율)내역 조회")
  public PatAppChangeListVo selectHisResult(PatAppChangeVo vo) throws KitechException {
    return appService.selectHisResult(vo);
  }

  @ElService(key="SvcPATAPPCHNR04")
  @RequestMapping(value="SvcPATAPPCHNR04")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_before_grid1','key':'patAppChangeVoList'}")
  @ElDescription(sub="출원인 변경신청시 공동발명자 조회",desc="출원인 변경신청시 공동발명자 조회")
  public PatAppChangeListVo getInvenPsn(PatAppChangeVo vo) throws KitechException {
      List<PatAppChangeVo> retList = appService.getInvenPsn(vo);
      PatAppChangeListVo List = new PatAppChangeListVo();
      List.setPatAppChangeVoList(retList);
      return List;
  }

  @ElService(key="SvcPATAPPCHNR05")
  @RequestMapping(value="SvcPATAPPCHNR05")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_getMainInvenPsn','key':'patAppChangeVo'}")
  @ElDescription(sub="연구과제 변경신청시 주발명자 조회",desc="연구과제 변경신청시 주발명자 조회")
  public PatAppChangeListVo getMainInvenPsn(PatAppChangeVo vo) throws KitechException {
      PatAppChangeVo retVo = appService.getMainInvenPsn(vo);
      PatAppChangeListVo List = new PatAppChangeListVo();
      List.setPatAppChangeVo(retVo);
      return List;
  }

  @ElService(key="SvcPATAPPCHNR06")
  @RequestMapping(value="SvcPATAPPCHNR06")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patAppChangeVo'}")
  @ElDescription(sub="지재권 기본 정보 조회",desc="지재권 기본 정보 조회")
  public PatAppChangeListVo selectBasicInfo(PatAppChangeVo vo) throws KitechException {
      PatAppChangeVo retVo = appService.selectBasicInfo(vo);
      PatAppChangeListVo List = new PatAppChangeListVo();
      List.setPatAppChangeVo(retVo);
      return List;
  }

  @ElService(key="SvcPATAPPCHNM01")
  @RequestMapping(value="SvcPATAPPCHNM01")
  @DataCollection(ref="data:json,[{'id':'dma_save','key':'save'},{'id':'dlt_saveList','key':'saveList'},{'id':'dlt_bfSaveList','key':'bfSaveList'},{'id':'dlt_deleteList','key':'deleteList'}]", target="")
  @ElDescription(sub="공동발명자, 출원인, 연구과제 변경신청 저장",desc="공동발명자, 출원인, 연구과제 변경신청 저장")
  public PatAppChangeVo savePatChngHis(PatAppChangeListVo vo) throws KitechException {
      return appService.savePatChngHis(vo);
  }

  @ElService(key="SvcPATAPPCHND01")
  @RequestMapping(value="SvcPATAPPCHND01")
  @DataCollection(ref="data:json,dma_delete", target="")
  @ElDescription(sub="변경이력 삭제",desc="변경이력 삭제")
  public void deletePatChngHis(PatAppChangeVo vo) throws KitechException {
      appService.deletePatChngHis(vo);
  }

  @ElService(key="SvcPATAPPCHNAPR")
  @RequestMapping(value="SvcPATAPPCHNAPR")
  @DataCollection(ref="data:json,[{'id':'dma_approval','key':'core'},{'id':'dlt_approval_after','key':'after'},{'id':'dlt_approval_before','key':'before'}]", target="")
  @ElDescription(sub="변경 결재 신청",desc="변경 결재 신청")
  public PatAppChangeVo approval(PatAppChangeListVo vo) throws KitechException {
      return appService.approval(vo);
  }

}
  