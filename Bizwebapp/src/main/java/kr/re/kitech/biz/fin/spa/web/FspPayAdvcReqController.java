package kr.re.kitech.biz.fin.spa.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.fin.spa.service.FspPayAdvcReqService;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqBankVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqListVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

@Controller
public class FspPayAdvcReqController {

  @Resource(name = "fspPayAdvcReqServiceImpl")
  private FspPayAdvcReqService spaService;

  @ElService(key="SvcFINSPAFSPR01")
  @RequestMapping(value="SvcFINSPAFSPR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="가지급금신청 목록조회",desc="가지급금신청 목록 조회한다.")
  public FspPayAdvcReqListVo selectList01(FspPayAdvcReqVo spaVo) throws KitechException {
      List<FspPayAdvcReqVo> list = spaService.selectList01(spaVo);    	 
      FspPayAdvcReqListVo List = new FspPayAdvcReqListVo();
      List.setFspPayAdvcReqVoList(list);
      return List;
  }

  @ElService(key="SvcFINSPAREQR02")
  @RequestMapping(value="SvcFINSPAREQR02")
  @DataCollection(ref="", target="")
  @ElDescription(sub="지급구분이 개인일 경우 별도계좌정보가져오기",desc="지급구분이 개인일 경우 별도계좌정보를 조회한다.")
  public FspPayAdvcReqBankVo selectItem03(FspPayAdvcReqVo spaVo) throws Exception {
      FspPayAdvcReqBankVo vo = spaService.selectFspPayAdvcReqBank(spaVo);       
      return vo;
  } 

  @ElService(key="SvcFINSPAREQR03")
  @RequestMapping(value="SvcFINSPAREQR03")
  @DataCollection(ref="", target="")
  @ElDescription(sub="가지급금신청서 조회",desc="가지급금신청서을 조회한다.")
  public FspPayAdvcReqListVo selectItem01(FspPayAdvcReqVo spaVo) throws Exception {
      FspPayAdvcReqListVo vo = spaService.selectFspPayAdvcReq(spaVo);   
      return vo;
  }

  @ElService(key="SvcFINSPAREQR04")
  @RequestMapping(value="SvcFINSPAREQR04")
  @DataCollection(ref="", target="")
  @ElDescription(sub="신청구분선택시회계코드,계정번호,계정책임자가져오기",desc="신청구분으로 단건 아이템을 조회한다.")
  public FspPayAdvcReqVo selectItem02(FspPayAdvcReqVo spaVo) throws Exception {
      FspPayAdvcReqVo vo = spaService.selectFspPayAdvcReqClsf(spaVo);       
      return vo;
  }  

  @ElService(key="SvcFINSPAREQI01")
  @RequestMapping(value="SvcFINSPAREQI01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="가지급금/전도금신청등록(Insert)",desc="가지급금/전도금신청등록(Insert)한다.")
  public FspPayAdvcReqVo insertItem01(FspPayAdvcReqListVo spaVo) throws Exception {
      return spaService.insertFspPayAdvcReq(spaVo);
  }

  @ElService(key="SvcFINSPAREQD01")
  @RequestMapping(value="SvcFINSPAREQD01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="가지급금/전도금신청(삭제)",desc="가지급금/전도금신청(삭제)한다.")
  public void deleteItem01(FspPayAdvcReqListVo spaVo) throws Exception {
      spaService.deleteFspPayAdvcReq(spaVo);
  }
}
