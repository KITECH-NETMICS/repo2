package kr.re.kitech.biz.fin.rcms.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.fin.rcms.service.FinRcmsPaySendService;
import kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySend04ListVo;
import kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySend04Vo;
import kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendListVo;
import kr.re.kitech.biz.fin.rcms.vo.FinRcmsPaySendVo;
import kr.re.kitech.biz.fin.rcms.vo.ResBgacCtmListVo;
import kr.re.kitech.biz.fin.rcms.vo.ResBgacCtmVo;

@Controller
public class FinRcmsPaySendController {
  Logger log = LoggerFactory.getLogger(FinRcmsPaySendController.class);
  @Resource(name = "FinRcmsPaySendServiceImpl")
  private FinRcmsPaySendService rcmsService;

  @ElService(key = "SvcFINRCMSFINMR01")
  @RequestMapping(value = "SvcFINRCMSFINMR01")
  @ElDescription(sub = "리스트 조회", desc = "리스트 조회")
  public FinRcmsPaySendListVo selectListItem(FinRcmsPaySendVo rcmsVo)
    throws Exception {
    List<FinRcmsPaySendVo> list = rcmsService.selectListItem(rcmsVo);
    FinRcmsPaySendListVo List = new FinRcmsPaySendListVo();
    List.setFinRcmsPaySendVoList(list);
    return List;
  }

  @ElService(key = "SvcFINRCMSFINMR02")
  @RequestMapping(value = "SvcFINRCMSFINMR02")
  @ElDescription(sub = "반납목록 조회", desc = "반납목록 조회")
  public FinRcmsPaySend04ListVo selectReturnList(FinRcmsPaySend04Vo rcmsVo)
    throws Exception {
    List<FinRcmsPaySend04Vo> list = rcmsService.selectReturnList(rcmsVo);
    FinRcmsPaySend04ListVo List = new FinRcmsPaySend04ListVo();
    List.setFinRcmsPaySend04VoList(list);
    return List;
  }
  
  @ElService(key = "SvcFINRCMSFINMR03")
  @RequestMapping(value = "SvcFINRCMSFINMR03")
  @ElDescription(sub = "오류내역 리스트 조회", desc = "오류내역 리스트 조회")
  public FinRcmsPaySendListVo selectErrorListItem(FinRcmsPaySendVo rcmsVo)
    throws Exception {
    List<FinRcmsPaySendVo> list = rcmsService.selectErrorListItem(rcmsVo);
    FinRcmsPaySendListVo List = new FinRcmsPaySendListVo();
    List.setFinRcmsPaySendVoList(list);
    return List;
  }

  @ElService(key = "SvcFINRCMSFINSR03")
  @RequestMapping(value = "SvcFINRCMSFINSR03")
  @ElDescription(sub = "계정팝업 조회", desc = "계정팝업 조회(RCMS용)")
  public ResBgacCtmListVo selectAccountPopup(ResBgacCtmVo rcmsVo) throws Exception {
      List<ResBgacCtmVo> list = rcmsService.selectAccountPopup(rcmsVo); 
      ResBgacCtmListVo List = new ResBgacCtmListVo();
      List.setResBgacCtmVoList(list);
      return List;
  }
  
  @ElService(key = "SvcFINRCMSFIMI01")
  @RequestMapping(value = "SvcFINRCMSFIMI01")
  @ElDescription(sub = "전송 처리", desc = "전송 처리")
  public Map<String, Object> rcmsSend(FinRcmsPaySendListVo rcmsVo) throws Exception {
	Map<String, Object> elData = new HashMap<>();
	Map<String, Object> item = new HashMap<>();
	
	item = rcmsService.rcmsSend(rcmsVo);
	
    item.put("success", Integer.parseInt(item.get("count").toString()) > 0 ? true : false);
    elData.put("elData", item);
    return elData;
  }

  @ElService(key = "SvcFINRCMSFIMI02")
  @RequestMapping(value = "SvcFINRCMSFIMI02")
  @ElDescription(sub = "전송취소 처리", desc = "전송취소 처리")
  public Map<String, Object> rcmsSendCancel(FinRcmsPaySendListVo rcmsVo) throws Exception {
	Map<String, Object> elData = new HashMap<>();
	Map<String, Object> item = new HashMap<>();
	
	int result = rcmsService.cancelFinRcmsPaySend(rcmsVo);
    item.put("success", result > 0 ? true : false);
    elData.put("elData", item);
    return elData;
  }

  @ElService(key = "SvcFINRCMSFIMU01")
  @RequestMapping(value = "SvcFINRCMSFIMU01")
  @ElDescription(sub = "미전송 강제처리", desc = "미전송 강제처리")
  public Map<String, Object> updateUnsentForced(FinRcmsPaySendListVo rcmsVo) throws Exception {
	Map<String, Object> elData = new HashMap<>();
	Map<String, Object> item = new HashMap<>();
	List<FinRcmsPaySendVo> listVo = rcmsVo.getFinRcmsPaySendVoList();
	for (FinRcmsPaySendVo vo: listVo) {
		log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓");
		log.debug("미전송 vo : [{}]", vo);
		rcmsService.updateUnsentForced(vo);
    }
    item.put("success", "true");
    elData.put("elData", item);
    return elData;
  }
}
