package kr.re.kitech.biz.lpl.lcp.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.lpl.lcp.service.LcpAgncyMstService;
import kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstFormListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstFormVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : LcpAgncyMstController.java
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
public class LcpAgncyMstController {

  @Resource(name = "lcpAgncyMstServiceImpl")
  private LcpAgncyMstService lcpService;

  @ElService(key="SvcLPLLCPMSTR01")
  @RequestMapping(value="SvcLPLLCPMSTR01")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="기관명 리스트 조회",desc="다건 조회")
  public LcpAgncyMstListVo selectList01(LcpAgncyMstVo vo) throws KitechException {
      List<LcpAgncyMstVo> retList = lcpService.selectList01(vo);
      LcpAgncyMstListVo List = new LcpAgncyMstListVo();
      List.setLcpAgncyMstVoList(retList);
      return List;
  }

  @ElService(key="SvcLPLLCPMSTR02")
  @RequestMapping(value="SvcLPLLCPMSTR02")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="대외협력조회 기관헤더조회 및 목록별 건수조회",desc="단건 조회")
  public LcpAgncyMstFormListVo selectLcpAgncyMstForm(LcpAgncyMstFormVo vo) throws KitechException {
      LcpAgncyMstFormVo retVo = lcpService.selectLcpAgncyMstForm(vo); 
      LcpAgncyMstFormListVo List = new LcpAgncyMstFormListVo();
      List.setLcpAgncyMstFormVo(retVo);
      return List;
  }

  @ElService(key="SvcLPLLCPMSTR03")
  @RequestMapping(value="SvcLPLLCPMSTR03")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="탭 목록 조회",desc="다건 조회")
  public LcpAgncyMstListVo selectTabList(LcpAgncyMstVo vo) throws KitechException {
      LcpAgncyMstListVo retList = lcpService.selectTabList(vo);

      return retList;
  }  
/*
  @ElService(key="SvcLPLLCPLCPM01")
  @RequestMapping(value="SvcLPLLCPLCPM01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="단건 등록",desc="단건 등록")
  public void insertOne01(LcpAgncyMstVo vo) throws KitechException {
      lcpService.insertItem01(vo);
  }*/

}
  