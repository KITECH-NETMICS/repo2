package kr.re.kitech.biz.lpl.lcp.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.lpl.lcp.service.LcpMouIntrnService;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : LcpMouIntrnController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.20.      author    최초생성
 * 
 * @author 
 * @since 2023.11.20.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class LcpMouIntrnController {

  @Resource(name = "lcpMouIntrnServiceImpl")
  private LcpMouIntrnService lcpService;

  @ElService(key="SvcLPLLCPMOUR01")
  @RequestMapping(value="SvcLPLLCPMOUR01")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="국제협약 목록 조회",desc="다건 조회")
  public LcpMouIntrnListVo selectList01(LcpMouIntrnVo vo) throws KitechException {
      List<LcpMouIntrnVo> retList = lcpService.selectList01(vo);
      LcpMouIntrnListVo List = new LcpMouIntrnListVo();
      List.setLcpMouIntrnVoList(retList);
      return List;
  }

  @ElService(key="SvcLPLLCPMOUR02")
  @RequestMapping(value="SvcLPLLCPMOUR02")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="국제협약 상세 조회",desc="단건 조회")
  public LcpMouIntrnListVo selectOne01(LcpMouIntrnVo vo) throws KitechException {
      LcpMouIntrnVo retVo = lcpService.selectItem01(vo); 
      LcpMouIntrnListVo List = new LcpMouIntrnListVo();
      List.setLcpMouIntrnVo(retVo);
      return List;
  }

  @ElService(key="SvcLPLLCPMOUR03")
  @RequestMapping(value="SvcLPLLCPMOUR03")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="국내협약기관정보조회",desc="다건 조회")
  public LcpMouDomAgencyListVo selectList02(LcpMouDomAgencyVo vo) throws KitechException {
      List<LcpMouDomAgencyVo> retList = lcpService.selectList02(vo);
      LcpMouDomAgencyListVo List = new LcpMouDomAgencyListVo();
      List.setLcpMouDomAgencyVoList(retList);
      return List;
  }
  @ElService(key="SvcLPLLCPMOUR05")
  @RequestMapping(value="SvcLPLLCPMOUR05")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="국제협약사후관리조회",desc="다건 조회")
  public LcpMouAfactListVo selectList03(LcpMouAfactVo vo) throws KitechException {
      List<LcpMouAfactVo> retList = lcpService.selectList03(vo);
      LcpMouAfactListVo List = new LcpMouAfactListVo();
      List.setLcpMouAfactVoList(retList);
      return List;
  }    

  @ElService(key="SvcLPLLCPMOUI01")
  @RequestMapping(value="SvcLPLLCPMOUI01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="국제협약사후저장, 수정, 삭제",desc="단건 등록")
  public LcpMouIntrnVo crudInfo(LcpMouIntrnListVo vo) throws KitechException {
      return lcpService.crudInfo(vo);
  }

}
  