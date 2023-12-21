package kr.re.kitech.biz.fin.seq.web;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;
import kr.re.kitech.biz.xom.base.exception.KitechException;

import kr.re.kitech.biz.fin.seq.service.FinFsaledgrService;
import kr.re.kitech.biz.fin.seq.vo.FinFsaledgrListVo;
import kr.re.kitech.biz.fin.seq.vo.FinFsaledgrVo;


/**
 * @ClassSubJect 합계잔액시산표
 * @ClassName : FinFsaledgrController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.26.     이지훈    최초생성
 * 
 * @author 
 * @since 2023.09.26.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class FinFsaledgrController {

  @Resource(name = "finFsaledgrServiceImpl")
  private FinFsaledgrService finService;

  @ElService(key="SvcFINFINFINR01")
  @RequestMapping(value="SvcFINFINFINR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'finFsaledgrVoList'}")
  @ElDescription(sub="엑셀 내리기용 조회",desc="엑셀 내리기용 조회")
  public FinFsaledgrListVo selectList01(FinFsaledgrVo finVo) throws KitechException {
      List<FinFsaledgrVo> list = finService.selectList01(finVo);    	 
      FinFsaledgrListVo List = new FinFsaledgrListVo();
      List.setFinFsaledgrVoList(list);
      return List;
  }




}
  