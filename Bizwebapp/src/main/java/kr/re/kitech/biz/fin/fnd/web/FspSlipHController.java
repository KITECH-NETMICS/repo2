package kr.re.kitech.biz.fin.fnd.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.fin.fnd.service.FspSlipHService;
import kr.re.kitech.biz.fin.fnd.vo.FspSlipHListVo;
import kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerListVo;
import kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerVo;
import kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

@Controller
public class FspSlipHController {

  @Resource(name = "fspSlipHServiceImpl")
  private FspSlipHService fndService;


/**
 * 출금결의현황 목록을 조회합니다.
 * @param FspSlipHVo 출금결의 FspSlipHVo
 * @return 목록조회 결과
 * @throws Exception
 */
  @ElService(key="SvcFINFNDFSPMR01")
  @RequestMapping(value="SvcFINFNDFSPMR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="출금결의현황 조회",desc="출금결의현황을 목록을 조회한다.")
  public FspSlipHListVo selectList(FspSlipHVo fndVo) throws Exception {
      List<FspSlipHVo> list = fndService.selectList(fndVo);    	 
      FspSlipHListVo List = new FspSlipHListVo();
      List.setFspSlipHVoList(list);
      return List;
  }

  @ElService(key="SvcFINFNDFSPDR01")
  @RequestMapping(value="SvcFINFNDFSPDR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="출금결의현황 결재 조회",desc="출금결의현황 결재 목록을 조회한다.")
  public FspSlipHListVo selectDetailList(FspSlipHVo fndVo) throws Exception {
      List<FspSlipHVo> list = fndService.selectFspSlipDetail(fndVo);    	 
      FspSlipHListVo List = new FspSlipHListVo();
      List.setFspSlipHVoList(list);
      return List;
  }

  @ElService(key="SvcFINFNDFSPSI01")
  @RequestMapping(value="SvcFINFNDFSPSI01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="출금결의 지불장 신청 저장 ",desc="출금결의 지불장 신청 저장 한다.")
  public FspSlipHMerVo insert(FspSlipHMerListVo fndVo) throws Exception {     
      return fndService.insertItem(fndVo);
  }

  @ElService(key="SvcFINFNDFSPSD01")
  @RequestMapping(value="SvcFINFNDFSPSD01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="출금결의 지불장 삭제 ",desc="출금결의 지불장 삭제.")
  public FspSlipHVo delete(FspSlipHVo fndVo) throws Exception {      
      return fndService.deleteItem(fndVo);
  }
  
  

}
