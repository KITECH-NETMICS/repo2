package kr.re.kitech.biz.bud.frc.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.bud.frc.service.BblEnfrcService;
import kr.re.kitech.biz.bud.frc.vo.BblEnfrcListVo;
import kr.re.kitech.biz.bud.frc.vo.BblEnfrcReqVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**  
 * @ClassSubJect 일반예산신청 Controller
 * @Class Name : FinTaxController.java
 * @Description : 일반예산신청 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/11   김준하         최초생성
 * 
 * @author 김준하
 * @since 2023/09/01
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Controller
public class BblEnfrcController {

  @Resource(name = "bblEnfrcServiceImpl")
  private BblEnfrcService budService;

  @ElService(key = "SvcFINBUDBBLR01")
  @RequestMapping(value = "SvcFINBUDBBLR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub = "일반예산신청 목록 조회", desc = "일반예산신청 목록 조회한다.")
@ElValidator(errUrl = "")
  public BblEnfrcListVo selectList01(BblEnfrcReqVo budVo) throws KitechException {
      List<BblEnfrcReqVo> list = budService.selectList01(budVo);    	 
      BblEnfrcListVo List = new BblEnfrcListVo();
      List.setBblEnfrcVoList(list);
      return List;
  }

  @ElService(key = "SvcFINBUDBBLR02")
  @RequestMapping(value = "SvcFINBUDBBLR02")
  @DataCollection(ref="", target="")
  @ElDescription(sub = "일반예산신청 상세 조회", desc = "일반예산신청 상세 조회한다")
@ElValidator(errUrl = "")
  public BblEnfrcReqVo selectItem01(BblEnfrcReqVo budVo) throws KitechException {     
      return budService.selectItem01(budVo);
  }

  @ElService(key = "SvcFINBUDBBLM01")
  @RequestMapping(value = "SvcFINBUDBBLM01")
  @DataCollection(ref="", target="")
  @ElDescription(sub = "일반예산신청 저장, 수정, 결재", desc = "일반예산신청 저장, 수정, 결재한다.")
@ElValidator(errUrl = "")
  public BblEnfrcReqVo insertItem01(BblEnfrcReqVo budVo) throws KitechException {
      BblEnfrcReqVo retVo = new BblEnfrcReqVo();
      retVo.setReq_no(budService.saveItem01(budVo));
      return retVo;
  }
  
  @ElService(key = "SvcFINBUDBBLD01")
  @RequestMapping(value = "SvcFINBUDBBLD01")
  @DataCollection(ref="", target="")
  @ElDescription(sub = "일반예산신청 삭제", desc = "일반예산신청 삭제한다.")
@ElValidator(errUrl = "")
  public void deleteItem01(DelBblEnfrcVo budVo) throws KitechException {
      budService.deleteItem01(budVo);
  }  

}
