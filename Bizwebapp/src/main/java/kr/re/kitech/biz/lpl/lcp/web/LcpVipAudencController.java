package kr.re.kitech.biz.lpl.lcp.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.lpl.lcp.service.LcpVipAudencService;
import kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpVipAudencVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : LcpVipAudencController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.06. 김준하    최초생성
 * 
 * @author 
 * @since 2023.11.06.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class LcpVipAudencController {

  @Resource(name = "lcpVipAudencServiceImpl")
  private LcpVipAudencService lcpService;

  @ElService(key="SvcLPLLCPVIPR01")
  @RequestMapping(value="SvcLPLLCPVIPR01")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="국외귀빈 목록 조회",desc="목록 조회")
  public LcpVipAudencListVo selectList01(LcpVipAudencVo lcpVo) throws KitechException {
      List<LcpVipAudencVo> list = lcpService.selectVipAudencList(lcpVo);    	 
      LcpVipAudencListVo List = new LcpVipAudencListVo();
      List.setLcpVipAudencVoList(list);
      return List;
  }

  @ElService(key="SvcLPLLCPVIPR02")
  @RequestMapping(value="SvcLPLLCPVIPR02")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="국외귀빈접견 상세조회",desc="상세 조회")
  public LcpVipAudencListVo selectItem01(LcpVipAudencVo lcpVo) throws KitechException {
      return lcpService.selectVipAudencDetail(lcpVo);
  }

  @ElService(key="SvcLPLLCPVIPR03")
  @RequestMapping(value="SvcLPLLCPVIPR03")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="기관찾기 팝업 국가 리스트 조회",desc="국가 리스트 조회")
  public LcpVipAudencListVo selectList02(LcpVipAudencVo lcpVo) throws KitechException {
      List<LcpVipAudencVo> list = lcpService.selectVipAudencPopTree(lcpVo);    	 
      LcpVipAudencListVo List = new LcpVipAudencListVo();
      List.setLcpVipAudencVoList(list);
      return List;
  }

  @ElService(key="SvcLPLLCPVIPR04")
  @RequestMapping(value="SvcLPLLCPVIPR04")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="기관찾기 팝업 기관 리스트 조회",desc="기관 리스트 조회")
  public LcpVipAudencListVo selectList03(LcpVipAudencVo lcpVo) throws KitechException {
      List<LcpVipAudencVo> list = lcpService.selectVipAudencPopAgency(lcpVo);    	 
      LcpVipAudencListVo List = new LcpVipAudencListVo();
      List.setLcpVipAudencVoList(list);
      return List;
  }


  @ElService(key="SvcLPLLCPVIPR05")
  @RequestMapping(value="SvcLPLLCPVIPR05")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="기관찾기 팝업 기관 검색 결과",desc="검색 조회")
  public LcpVipAudencListVo selectList04(LcpVipAudencVo lcpVo) throws KitechException {
      List<LcpVipAudencVo> list = lcpService.selectVipAudencPopSearch(lcpVo);    	 
      LcpVipAudencListVo List = new LcpVipAudencListVo();
      List.setLcpVipAudencVoList(list);
      return List;
  }         

  @ElService(key="SvcLPLLCPVIPM01")
  @RequestMapping(value="SvcLPLLCPVIPM01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="국외귀빈 저장, 수정, 삭제",desc="저장, 수정, 삭제")
  public LcpVipAudencVo insertItem01(LcpVipAudencListVo lcpVo) throws KitechException {
      return lcpService.CrudLcpVipAudenc(lcpVo);
  }

}
  