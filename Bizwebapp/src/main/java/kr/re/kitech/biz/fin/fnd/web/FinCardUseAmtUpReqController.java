package kr.re.kitech.biz.fin.fnd.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.fin.fnd.service.FinCardUseAmtUpReqService;
import kr.re.kitech.biz.fin.fnd.vo.FinCardUseAmtUpReqListVo;
import kr.re.kitech.biz.fin.fnd.vo.FinCardUseAmtUpReqVo;
import kr.re.kitech.biz.fin.fnd.vo.FndCardSelectListVo;
import kr.re.kitech.biz.fin.fnd.vo.FndCardSelectVo;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

@Controller
public class FinCardUseAmtUpReqController {

  @Resource(name = "finCardUseAmtUpReqServiceImpl")
  private FinCardUseAmtUpReqService fndService;

  @ElService(key="SvcFINFNDFINMR01")
  @RequestMapping(value="SvcFINFNDFINMR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="목록 조회",desc="법인카드 한도증액 신청 목록을 조회한다")
  public FinCardUseAmtUpReqListVo selectList(FinCardUseAmtUpReqVo fndVo) throws Exception {
      List<FinCardUseAmtUpReqVo> list = fndService.selectList(fndVo);    	 
      FinCardUseAmtUpReqListVo List = new FinCardUseAmtUpReqListVo();
      List.setFinCardUseAmtUpReqVoList(list);
      return List;
  }

  @ElService(key="SvcFINFNDFINSR01")
  @RequestMapping(value="SvcFINFNDFINSR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="상세정보조회",desc="법인카드 한도증액 신청에 상세정보를 조회한다")
  public FinCardUseAmtUpReqVo select(FinCardUseAmtUpReqVo fndVo) throws Exception {
      FinCardUseAmtUpReqVo vo = fndService.selectSingle(fndVo); 
      return vo;
  }

  @ElService(key="SvcFINFNDFINMR02")
  @RequestMapping(value="SvcFINFNDFINMR02")
  @DataCollection(ref="", target="")
  @ElDescription(sub="법인카드 목록 조회",desc="셀렉트박스용 법인카드를 조회한다")
  public FndCardSelectListVo selectList(FndCardSelectVo fndVo) throws Exception {
      List<FndCardSelectVo> list = fndService.selectCardList(fndVo);    	 
      FndCardSelectListVo List = new FndCardSelectListVo();
      List.setFndCardSelectVoList(list);
      return List;
  }

  @ElService(key="SvcFINFNDFINSI01")
  @RequestMapping(value="SvcFINFNDFINSI01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="법인카드 한도증액 신청 저장",desc="법인카드 한도증액 신청 저장한다")
  public FinCardUseAmtUpReqVo insert(FinCardUseAmtUpReqVo fndVo) throws Exception {
         
      return fndService.insertItem(fndVo);
  }

  @ElService(key="SvcFINFNDFINSD01")
  @RequestMapping(value="SvcFINFNDFINSD01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="법인카드 한도증액 신청 삭제",desc="법인카드 한도증액 신청 삭제한다")
  public FinCardUseAmtUpReqVo delete(FinCardUseAmtUpReqVo fndVo) throws Exception {
         
      return fndService.insertItem(fndVo);
  }

  @ElService(key="SvcFINFNDFINSA01")
  @RequestMapping(value="SvcFINFNDFINSA01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="법인카드 한도증액 결제 신청",desc="법인카드 한도증액 결제 신청한다")
  public FinCardUseAmtUpReqVo paymentRequest(FinCardUseAmtUpReqVo fndVo) throws Exception {
         
      return fndService.paymentRequest(fndVo);
  }

  @ElService(key="SvcFINFNDFINSA02")
  @RequestMapping(value="SvcFINFNDFINSA02")
  @DataCollection(ref="", target="")
  @ElDescription(sub="법인카드 한도증액 승인 및 반려",desc="법인카드 한도증액 승인 및 반려한다")
  public FinCardUseAmtUpReqVo apyConfORrejt(FinCardUseAmtUpReqVo fndVo) throws Exception {
         
      return fndService.apyConfORrejt(fndVo);
  }   
  
  

}
