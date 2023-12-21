package kr.re.kitech.biz.lpl.lcp.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.lpl.lcp.service.LplCustBaseInfoService;
import kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo;
import kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : LplCustBaseInfoController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.06.      김준하    최초생성
 * 
 * @author 김준하
 * @since 2023.11.06.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class LplCustBaseInfoController {

  @Resource(name = "lplCustBaseInfoServiceImpl")
  private LplCustBaseInfoService lcpService;

  @ElService(key="SvcLPLLCPLPLR01")
  @RequestMapping(value="SvcLPLLCPLPLR01")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="기관정보 목록조회",desc="목록 조회")
  public LplCustBaseInfoListVo selectList01(LplCustBaseInfoVo lcpVo) throws KitechException {
      List<LplCustBaseInfoVo> list = lcpService.selectList01(lcpVo);    	 
      LplCustBaseInfoListVo List = new LplCustBaseInfoListVo();
      List.setLplCustBaseInfoVoList(list);
      return List;
  }

  @ElService(key="SvcLPLLCPLPLR02")
  @RequestMapping(value="SvcLPLLCPLPLR02")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="기관정보 상세조회",desc="상세 조회")
  public LplCustBaseInfoListVo selectLplCustBaseInfoDetal(LplCustBaseInfoVo lcpVo) throws KitechException {
      LplCustBaseInfoVo vo = lcpService.selectLplCustBaseInfoDetal(lcpVo); 
      LplCustBaseInfoListVo List = new LplCustBaseInfoListVo();
      List.setLplCustBaseInfoVo(vo);
      return List;
  }

  @ElService(key="SvcLPLLCPLPLR03")
  @RequestMapping(value="SvcLPLLCPLPLR03")
  @DataCollection(ref="data:json,dma_search", target="")
  @ElDescription(sub="기관중복검사 조회",desc=" 중복 검사")
  public LplCustBaseInfoListVo selectLplCustBaseInfoChk(LplCustBaseInfoVo lcpVo) throws KitechException {
      List<LplCustBaseInfoVo> list = lcpService.selectLplCustBaseInfoChk(lcpVo);    	 
      LplCustBaseInfoListVo List = new LplCustBaseInfoListVo();
      List.setLplCustBaseInfoVoList(list);  
      return List;
  }  

  @ElService(key="SvcLPLLCPLPLM01")
  @RequestMapping(value="SvcLPLLCPLPLM01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="기관기본정보등록,수정",desc="등록, 수정")
  public LplCustBaseInfoMerVo merLplCustBaseInfo(LplCustBaseInfoMerVo lcpVo) throws KitechException {
      return lcpService.merLplCustBaseInfo(lcpVo);
  }

}
  