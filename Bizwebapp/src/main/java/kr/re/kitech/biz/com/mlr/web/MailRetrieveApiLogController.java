package kr.re.kitech.biz.com.mlr.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.com.mlr.service.MailRetrieveApiLogService;
import kr.re.kitech.biz.com.mlr.vo.MailRetrieveApiLogListVo;
import kr.re.kitech.biz.com.mlr.vo.MailRetrieveApiLogVo;

@Controller
public class MailRetrieveApiLogController {

  @Resource(name = "MailRetrieveApiLogServiceImpl")
  private MailRetrieveApiLogService mailService;

  @ElService(key="SvcCOMMAILMAIMR01")
  @RequestMapping(value="SvcCOMMAILMAIMR01")
  @ElDescription(sub="리스트 조회",desc="리스트 조회")
  public MailRetrieveApiLogListVo selectListItem(MailRetrieveApiLogVo mailVo) throws Exception {
      List<MailRetrieveApiLogVo> list = mailService.selectListItem(mailVo);
      MailRetrieveApiLogListVo List = new MailRetrieveApiLogListVo();
      List.setMailRetrieveApiLogVoList(list);
      return List;
  }  

  @ElService(key="SvcCOMMAILMAIMR02")
  @RequestMapping(value="SvcCOMMAILMAIMR02")
  @ElDescription(sub="메일회수",desc="메일회수")
  public Map<String, Object> retrieveMail(MailRetrieveApiLogListVo vo) throws Exception {
	  Map<String, Object> elData = new HashMap<>();
	  Map<String, Object> item = new HashMap<>();
	  Boolean ret = Boolean.FALSE;
	  List<MailRetrieveApiLogVo> listVo = vo.getMailRetrieveApiLogVoList();
	  for (MailRetrieveApiLogVo mailVo: listVo) {
		ret = mailService.retrieveMail(mailVo);
		if(!ret) break;
	  }
	  item.put("success", ret);
	  elData.put("elData", item);
	  return elData;
	}
}
