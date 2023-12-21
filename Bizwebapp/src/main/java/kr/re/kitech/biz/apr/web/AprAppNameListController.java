package kr.re.kitech.biz.apr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.apr.service.AprAppNameListService;
import kr.re.kitech.biz.apr.vo.AprAppNameListListVo;
import kr.re.kitech.biz.apr.vo.AprAppNameListVo;

@Controller
public class AprAppNameListController {

  @Resource(name = "AprAppNameListServiceImpl")
  private AprAppNameListService Service;

  @ElService(key="SvcAPRAPRMR01")
  @RequestMapping(value="SvcAPRAPRMR01")
  @ElDescription(sub="selectAppListItem",desc="리스트를 조회 한다.")
  public AprAppNameListListVo selectAppListItem(AprAppNameListVo Vo) throws Exception {
      List<AprAppNameListVo> list = Service.selectAppListItem(Vo);
      AprAppNameListListVo List = new AprAppNameListListVo();
      List.setAprAppNameListVoList(list);
      return List;
  }
}
