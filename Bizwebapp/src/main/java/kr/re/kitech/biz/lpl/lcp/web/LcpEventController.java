package kr.re.kitech.biz.lpl.lcp.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.lpl.lcp.service.LcpEventService;
import kr.re.kitech.biz.lpl.lcp.vo.LcpEventListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpEventVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : LcpEventController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.15.      author    최초생성
 * 
 * @author 
 * @since 2023.11.15.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class LcpEventController {

  @Resource(name = "lcpEventServiceImpl")
  private LcpEventService lcpService;

  @ElService(key="SvcLPLLCPEVER01")
  @RequestMapping(value="SvcLPLLCPEVER01")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="국가 조회",desc="국가 조회")
  public LcpEventListVo selectList01(LcpEventVo vo) throws KitechException {
      List<LcpEventVo> retList = lcpService.selectList01(vo);
      LcpEventListVo List = new LcpEventListVo();
      List.setLcpEventVoList(retList);
      return List;
  }

  @ElService(key="SvcLPLLCPEVER02")
  @RequestMapping(value="SvcLPLLCPEVER02")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="조회",desc="조회")
  public LcpEventListVo selectList02(LcpEventVo vo) throws KitechException {
      List<LcpEventVo> retList = lcpService.selectList02(vo);
      LcpEventListVo List = new LcpEventListVo();
      List.setLcpEventVoList(retList);
      return List;
  }

  @ElService(key="SvcLPLLCPEVER03")
  @RequestMapping(value="SvcLPLLCPEVER03")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="상세조회",desc="조회")
  public LcpEventListVo selectList03(LcpEventVo vo) throws KitechException {
      LcpEventVo ret = lcpService.selectLcpEventDetail(vo);
      LcpEventListVo List = new LcpEventListVo();
      List.setLcpEventVo(ret);
      return List;
  }

  @ElService(key="SvcLPLLCPEVER04")
  @RequestMapping(value="SvcLPLLCPEVER04")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="비용조회",desc="조회")
  public LcpEventListVo selectList04(LcpEventVo vo) throws KitechException {
      List<LcpEventVo> retList = lcpService.selectLcpEventExpen(vo);
      LcpEventListVo List = new LcpEventListVo();
      List.setLcpEventVoList(retList);
      return List;
  }

  @ElService(key="SvcLPLLCPEVER05")
  @RequestMapping(value="SvcLPLLCPEVER05")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="기관조회",desc="조회")
  public LcpEventListVo selectList05(LcpEventVo vo) throws KitechException {
      List<LcpEventVo> retList = lcpService.selectLcpEventAgncy(vo);
      LcpEventListVo List = new LcpEventListVo();
      List.setLcpEventVoList(retList);
      return List;
  }

  @ElService(key="SvcLPLLCPEVER06")
  @RequestMapping(value="SvcLPLLCPEVER06")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="행사비용조회",desc="조회")
  public LcpEventListVo selectList06(LcpEventVo vo) throws KitechException {
      List<LcpEventVo> retList = lcpService.selectLcpEventPop(vo);
      LcpEventListVo List = new LcpEventListVo();
      List.setLcpEventVoList(retList);
      return List;
  }

  @ElService(key="SvcLPLLCPEVEM01")
  @RequestMapping(value="SvcLPLLCPEVEM01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="국제행사 저장, 수정, 삭제",desc="저장, 수정, 삭제")
  public LcpEventVo insertItem01(LcpEventListVo lcpVo) throws KitechException {
      return lcpService.CrudLcpEventAudenc(lcpVo);
  }          

/*  @ElService(key="SvcLPLLCPLCPR02")
  @RequestMapping(value="SvcLPLLCPLCPR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'lcpEventVo'}")
  @ElDescription(sub="단건 조회",desc="단건 조회")
  public LcpEventListVo selectOne01(LcpEventVo vo) throws KitechException {
      //LcpEventVo retVo = lcpService.selectItem01(vo); 
      LcpEventListVo List = new LcpEventListVo();
      List.setLcpEventVo(retVo);
      return List;
  }

  @ElService(key="SvcLPLLCPLCPM01")
  @RequestMapping(value="SvcLPLLCPLCPM01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="단건 등록",desc="단건 등록")
  public void insertOne01(LcpEventVo vo) throws KitechException {
      //lcpService.insertItem01(vo);
  }*/

}
  