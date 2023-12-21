package kr.re.kitech.biz.lpl.lcp.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.lpl.lcp.service.LcpMouDomService;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomExcelListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomExcelVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : LcpMouDomController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.21.      author    최초생성
 * 
 * @author 
 * @since 2023.11.21.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class LcpMouDomController {

  @Resource(name = "lcpMouDomServiceImpl")
  private LcpMouDomService lcpService;

  @ElService(key="SvcLPLLCPDOMR01")
  @RequestMapping(value="SvcLPLLCPDOMR01")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="국내협약 리스트 조회",desc="다건 조회")
  public LcpMouDomListVo selectList01(LcpMouDomVo vo) throws KitechException {
      List<LcpMouDomVo> retList = lcpService.selectList01(vo);
      LcpMouDomListVo List = new LcpMouDomListVo();
      List.setLcpMouDomVoList(retList);
      return List;
  }

  @ElService(key="SvcLPLLCPDOMR02")
  @RequestMapping(value="SvcLPLLCPDOMR02")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="국내협약 액셀 리스트 조회",desc="다건 조회")
  public LcpMouDomExcelListVo selectList02(LcpMouDomVo vo) throws KitechException {
      List<LcpMouDomExcelVo> retList = lcpService.selectList02(vo);
      LcpMouDomExcelListVo List = new LcpMouDomExcelListVo();
      List.setLcpMouDomExcelVoList(retList);
      return List;
  }

  @ElService(key="SvcLPLLCPDOMR03")
  @RequestMapping(value="SvcLPLLCPDOMR03")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="실무자 그리드 셋팅  조회",desc="다건 조회")
  public LcpMouDomListVo selectLcpMouDomUserGrid(LcpMouDomVo vo) throws KitechException {
      List<LcpMouDomVo> retList = lcpService.selectLcpMouDomUserGrid(vo);
      LcpMouDomListVo List = new LcpMouDomListVo();
      List.setLcpMouDomVoList(retList);
      return List;
  }
  
  @ElService(key="SvcLPLLCPDOMR04")
  @RequestMapping(value="SvcLPLLCPDOMR04")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="국내협약 상세 조회",desc="단건 조회")
  public LcpMouDomListVo selectLcpMouDomForm(LcpMouDomVo vo) throws KitechException {
      LcpMouDomFormVo retVo = lcpService.selectLcpMouDomForm(vo); 
      LcpMouDomListVo List = new LcpMouDomListVo();
      List.setLcpMouDomFormVo(retVo);
      return List;
  }

  @ElService(key="SvcLPLLCPDOMR05")
  @RequestMapping(value="SvcLPLLCPDOMR05")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="국내협약 사후관리  조회",desc="다건 조회")
  public LcpMouDomListVo selectLcpMouDomAfter(LcpMouDomVo vo) throws KitechException {
      List<LcpMouDomAftrVo> retList = lcpService.selectLcpMouDomAfter(vo);
      LcpMouDomListVo List = new LcpMouDomListVo();
      List.setLcpMouDomAftrVoList(retList);
      return List;
  }

  @ElService(key="SvcLPLLCPDOMR06")
  @RequestMapping(value="SvcLPLLCPDOMR06")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="국내협약긴관정보조회",desc="다건 조회")
  public LcpMouDomListVo selectLcpMouDomAgency(LcpMouDomVo vo) throws KitechException {
      List<LcpMouDomAgencyVo> retList = lcpService.selectLcpMouDomAgy(vo);
      LcpMouDomListVo List = new LcpMouDomListVo();
      List.setLcpMouDomAgencyVoList(retList);
      return List;
  }

  @ElService(key="SvcLPLLCPDOMR07")
  @RequestMapping(value="SvcLPLLCPDOMR07")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="실무자 유저 조회",desc="다건 조회")
  public LcpMouDomListVo selectLcpMouDomUser(LcpMouDomVo vo) throws KitechException {
      List<LcpMouUserVo> retList = lcpService.selectLcpMouDomUser(vo);
      LcpMouDomListVo List = new LcpMouDomListVo();
      List.setLcpMouUserVoList(retList);
      return List;
  }  
       
  @ElService(key="SvcLPLLCPDOMI01")
  @RequestMapping(value="SvcLPLLCPDOMI01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="국내협약사후저장, 수정, 삭제",desc="단건 등록")
  public LcpMouDomFormVo crudInfoDom(LcpMouDomListVo vo) throws KitechException {
      return lcpService.crudInfoDom(vo);
  }

}
  