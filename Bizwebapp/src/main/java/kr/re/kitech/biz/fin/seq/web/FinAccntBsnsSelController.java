package kr.re.kitech.biz.fin.seq.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.seq.service.FinAccntBsnsSelService;
import kr.re.kitech.biz.fin.seq.vo.FinAccntBsnsSelListVo;
import kr.re.kitech.biz.fin.seq.vo.FinAccntBsnsSelVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 계정별사업수행현황
 * @ClassName : FinAccntBsnsSelController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.04.     이지훈    최초생성
 * 
 * @author 계정별사업수행현황
 * @since 2023.10.04.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class FinAccntBsnsSelController {

  @Resource(name = "finAccntBsnsSelServiceImpl")
  private FinAccntBsnsSelService finService;

  @ElService(key = "SvcFINSEQF615R01")
  @RequestMapping(value = "SvcFINSEQF615R01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'finAccntBsnsSelVoList'}")
  @ElDescription(sub = "다건 조회", desc = "다건 조회")
@ElValidator(errUrl = "")
  public FinAccntBsnsSelListVo selectList01(FinAccntBsnsSelVo finVo) throws KitechException {
      List<FinAccntBsnsSelVo> list = finService.selectList01(finVo);    	 
      FinAccntBsnsSelListVo List = new FinAccntBsnsSelListVo();
      List.setFinAccntBsnsSelVoList(list);
      return List;
  }



}
  