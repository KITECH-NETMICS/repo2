package kr.re.kitech.biz.fin.fnd.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.fnd.service.FndCardService;
import kr.re.kitech.biz.fin.fnd.vo.FndCardListVo;
import kr.re.kitech.biz.fin.fnd.vo.FndCardUseSelectVo;
import kr.re.kitech.biz.fin.fnd.vo.FndCardVo;

@Controller
public class FndCardController {

  @Resource(name = "FndCardServiceImpl")
  private FndCardService fndCardService;

  @ElService(key="SvcFINFNDCADR01")
  @RequestMapping(value="SvcFINFNDCADR01")
  @ElDescription(sub="selectList",desc="리스트를 조회 한다.")
  public FndCardListVo selectList(FndCardVo fndVo) throws Exception {
      FndCardListVo retVo = new FndCardListVo();
      retVo.setFndCardVoList(fndCardService.selectList(fndVo));
      return retVo;
  }

  @ElService(key="SvcFINFNDCADR02")
  @RequestMapping(value="SvcFINFNDCADR02")
  @ElDescription(sub="selectListItem",desc="단건 아이템을 조회 한다.")
  public FndCardVo selectSingleItem(FndCardVo vo) throws Exception {
      return fndCardService.selectSingleItem(vo);
  }
  
  @ElService(key = "SvcFINFNDCADR03")
  @RequestMapping(value = "SvcFINFNDCADR03")
  @ElDescription(sub = "selectCardUserList", desc = "개인별카드미처리내역 조회")
@ElValidator(errUrl = "")
  public List<FndCardUseSelectVo> selectCardUseList(FndCardUseSelectVo vo) throws Exception {      
	  
      return fndCardService.selectCardUseList(vo);
  }

  @ElService(key="SvcFINFNDCADM01")
  @RequestMapping(value="SvcFINFNDCADM01")
  @ElDescription(sub="saveItem",desc="아이템을 저장한다.")
  public FndCardVo saveItem(FndCardVo vo) throws Exception {
      String req_no = fndCardService.saveItem(vo);
      vo.setReq_no(req_no);
	  return vo;
  }
  
  @ElService(key="SvcFINFNDCADD01")
  @RequestMapping(value="SvcFINFNDCADD01")
  @ElDescription(sub="deleteItem",desc="아이템을 삭제한다.")
  public void deleteItem(FndCardVo vo) throws Exception {
      fndCardService.deleteItem(vo);
  }
  
  @ElService(key="SvcFINFNDCADU01")
  @RequestMapping(value="SvcFINFNDCADU01")
  @ElDescription(sub="updateEmailYn",desc="메일발송 YN 수정")
  public void updateEmailYn(FndCardVo vo) throws Exception {
      fndCardService.updateMailYn(vo);
  }

}
