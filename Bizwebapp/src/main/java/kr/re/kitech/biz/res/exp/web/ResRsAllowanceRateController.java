package kr.re.kitech.biz.res.exp.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.res.exp.service.ResRsAllowanceRateService;
import kr.re.kitech.biz.res.exp.vo.ResRsAllowanceRateListVo;
import kr.re.kitech.biz.res.exp.vo.ResRsAllowanceRateVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : ResRsAllowanceRateController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.      이지훈    최초생성
 * 
 * @author 
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class ResRsAllowanceRateController {

  @Resource(name = "resRsAllowanceRateServiceImpl")
  private ResRsAllowanceRateService expService;

  @ElService(key="SvcRESEXPRESR01")
  @RequestMapping(value="SvcRESEXPRESR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'resRsAllowanceRateVoList'}")
  @ElDescription(sub="다건 조회",desc="다건 조회")
  public ResRsAllowanceRateListVo selectList01(ResRsAllowanceRateVo expVo) throws KitechException {
      List<ResRsAllowanceRateVo> list = expService.selectList01(expVo);    	 
      ResRsAllowanceRateListVo List = new ResRsAllowanceRateListVo();
      List.setResRsAllowanceRateVoList(list);
      return List;
  }
  
 
 
  @ElService(key = "SvcRESEXPRESR02")
@RequestMapping(value = "SvcRESEXPRESR02")
@ElDescription(sub = "부처코드 조회", desc = "부처코드 조회")
@ElValidator(errUrl = "")
public ResRsAllowanceRateListVo selectList02(ResRsAllowanceRateVo expVo) throws KitechException {
      List<ResRsAllowanceRateVo> list = expService.selectList02(expVo);    	 
      ResRsAllowanceRateListVo List = new ResRsAllowanceRateListVo();
      List.setResRsAllowanceRateVoList(list);
      return List;
  }


  @ElService(key = "SvcRESEXPRESM01")
  @RequestMapping(value = "SvcRESEXPRESM01")
  @DataCollection(ref="data:json,dma_insert", target="")
  @ElDescription(sub = "단건 등록 및 수정", desc = "단건 등록 및 수정")
@ElValidator(errUrl = "")
  public void updateItem01(ResRsAllowanceRateVo expVo) throws KitechException {
      expService.updateItem01(expVo);
  }
  
  
  @ElService(key = "SvcRESEXPRESD01")
@RequestMapping(value = "SvcRESEXPRESD01")
@ElDescription(sub = "단건 삭제", desc = "단건 삭제")
@ElValidator(errUrl = "")
public void deleteItem01(ResRsAllowanceRateVo expVo) throws KitechException {
	  expService.deleteItem01(expVo);
  }

}
  