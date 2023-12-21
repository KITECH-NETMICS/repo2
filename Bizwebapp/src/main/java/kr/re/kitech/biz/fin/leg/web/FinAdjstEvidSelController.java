package kr.re.kitech.biz.fin.leg.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.fin.leg.service.FinAdjstEvidSelService;
import kr.re.kitech.biz.fin.leg.vo.FinAdjstEvidSelListVo;
import kr.re.kitech.biz.fin.leg.vo.FinAdjstEvidSelVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : FinAdjstEvidSelController.java
 * @Description 
 * @Modification :   
 *     수정일               수정자             수정내용
 *  -----------   ---------   ---------
 *  2023.09.15.     김정환             최초생성
 * 
 * @author 김정환
 * @since 2023.09.15.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class FinAdjstEvidSelController {

  @Resource(name = "finAdjstEvidSelServiceImpl")
  private FinAdjstEvidSelService legService;

  @ElService(key="SvcFINLEGFINMR01")
  @RequestMapping(value="SvcFINLEGFINMR01")
  @ElDescription(sub="다건 조회",desc="다건 아이템을 조회한다.")
  public FinAdjstEvidSelListVo selectList(FinAdjstEvidSelVo legVo) throws KitechException {
      List<FinAdjstEvidSelVo> list = legService.selectList(legVo);    	 
      FinAdjstEvidSelListVo List = new FinAdjstEvidSelListVo();
      List.setFinAdjstEvidSelVoList(list);
      return List;
  }
}
  