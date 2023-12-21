package kr.re.kitech.biz.com.sms.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.com.sms.service.MsgSendLogService;
import kr.re.kitech.biz.com.sms.vo.MsgSendLogListVo;
import kr.re.kitech.biz.com.sms.vo.MsgSendLogVo;

@Controller
public class MsgSendLogController {

  @Resource(name = "MsgSendLogServiceImpl")
  private MsgSendLogService smsService;

  @ElService(key="SvcCOMSMSMSGMR01")
  @RequestMapping(value="SvcCOMSMSMSGMR01")
  @ElDescription(sub="selectListItem",desc="리스트를 조회 한다.")
  public MsgSendLogListVo selectListItem(MsgSendLogVo smsVo) throws Exception {
      List<MsgSendLogVo> list = smsService.selectListItem(smsVo);    	 
      MsgSendLogListVo List = new MsgSendLogListVo();
      List.setMsgSendLogVoList(list);
      return List;
  }

}
