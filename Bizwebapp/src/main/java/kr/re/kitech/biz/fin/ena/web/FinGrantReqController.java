package kr.re.kitech.biz.fin.ena.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.fin.ena.service.FinGrantReqService;
import kr.re.kitech.biz.fin.ena.vo.FinGrantReqListVo;
import kr.re.kitech.biz.fin.ena.vo.FinGrantReqVo;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

@Controller
public class FinGrantReqController {

  @Resource(name = "finGrantReqServiceImpl")
  private FinGrantReqService enaService;

  @ElService(key="SvcFINENAFINR01")
  @RequestMapping(value="SvcFINENAFINR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="국가보조금 교부신청  목록조회",desc="국가보조금 교부신청  목록조회한다.")
  public FinGrantReqListVo selectList01(FinGrantReqVo enaVo) throws Exception {
    List<FinGrantReqVo> list = enaService.selectList01(enaVo);    	 
    FinGrantReqListVo List = new FinGrantReqListVo();
    List.setFinGrantReqVoList(list);
    return List;
  }

  @ElService(key="SvcFINENAFINR02")
  @RequestMapping(value="SvcFINENAFINR02")
  @DataCollection(ref="", target="")
  @ElDescription(sub="국가보조금 교부신청  조회",desc="국가보조금 교부신청  조회한다.")
  public FinGrantReqListVo selectItem01(FinGrantReqVo enaVo) throws Exception {
    FinGrantReqListVo vo = enaService.selectFinGrantReq(enaVo); 
    return vo;
  }

  @ElService(key="SvcFINENAFINI01")
  @RequestMapping(value="SvcFINENAFINI01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="국가보조금 교부신청 등록",desc="국가보조금 교부신청 등록한다.")
  public FinGrantReqVo insertItem01(FinGrantReqListVo enaVo) throws Exception {
    return enaService.saveEnaraGrantReq(enaVo);
  }

  @ElService(key="SvcFINENAFIND01")
  @RequestMapping(value="SvcFINENAFIND01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="국가보조금 교부신청 삭제 ",desc="국가보조금 교부신청 삭제한다.")
  public void deleteItem01(FinGrantReqListVo enaVo) throws Exception {
    enaService.deleteEnaraGrantReq(enaVo);
  }

  @ElService(key="SvcFINENAFINI02")
  @RequestMapping(value="SvcFINENAFINI02")
  @DataCollection(ref="", target="")
  @ElDescription(sub="국가보조금 교부신청 결의생성",desc="국가보조금 교부신청 결의생성한다.")
  public FinGrantReqVo insertItem02(FinGrantReqListVo enaVo) throws Exception {
    return enaService.createSlipEnaraGrant(enaVo);
  }

  @ElService(key="SvcFINENAFIND02")
  @RequestMapping(value="SvcFINENAFIND02")
  @DataCollection(ref="", target="")
  @ElDescription(sub="국가보조금 교부신청 결의취소",desc="국가보조금 교부신청 결의취소한다.")
  public FinGrantReqVo deleteItem02(FinGrantReqListVo enaVo) throws Exception {
    return enaService.cancelSlipEnaraGrant(enaVo);
  }   
}
