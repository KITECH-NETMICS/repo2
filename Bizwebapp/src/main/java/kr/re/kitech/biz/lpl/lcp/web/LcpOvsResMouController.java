package kr.re.kitech.biz.lpl.lcp.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.lpl.lcp.service.LcpOvsResMouService;
import kr.re.kitech.biz.lpl.lcp.vo.LcpOvsResMouListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpOvsResMouVo;
import kr.re.kitech.biz.res.agr.vo.ResInpMastListVo;
import kr.re.kitech.biz.res.agr.vo.ResInpMastVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : LcpOvsResMouController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.01.      김준하    최초생성
 * 
 * @author 
 * @since 2023.11.01.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class LcpOvsResMouController {

  @Resource(name = "lcpOvsResMouServiceImpl")
  private LcpOvsResMouService lcpService;

  @ElService(key="SvcLPLLCPLCPR01")
  @RequestMapping(value="SvcLPLLCPLCPR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'lcpOvsResMouVoList'}")
  @ElDescription(sub="국제공동과제현황 조회",desc="목록 조회")
  public LcpOvsResMouListVo selectList01(LcpOvsResMouVo lcpVo) throws KitechException {
      List<LcpOvsResMouVo> list = lcpService.selectList01(lcpVo);    	 
      LcpOvsResMouListVo List = new LcpOvsResMouListVo();
      List.setLcpOvsResMouVoList(list);
      return List;
  }

  @ElService(key="SvcLPLLCPLCPR02")
  @RequestMapping(value="SvcLPLLCPLCPR02")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="과제정보 조회",desc="팝업 조회")
  public ResInpMastListVo selectPrjList(ResInpMastVo lcpVo) throws KitechException {
      ResInpMastListVo list = lcpService.selectPrjList(lcpVo);    	 
      return list;
  }

  @ElService(key="SvcLPLLCPLCPR03")
  @RequestMapping(value="SvcLPLLCPLCPR03")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="과제정보 탭 조회",desc="탭 조회")
  public ResInpMastListVo selectTabList(ResInpMastVo lcpVo) throws KitechException {
      ResInpMastListVo list = lcpService.selectTabList(lcpVo);    	 
      return list;
  }     
}
  