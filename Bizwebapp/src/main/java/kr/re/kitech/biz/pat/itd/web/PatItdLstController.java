package kr.re.kitech.biz.pat.itd.web;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;
import kr.re.kitech.biz.xom.base.exception.KitechException;

import kr.re.kitech.biz.pat.itd.service.PatItdLstService;
import kr.re.kitech.biz.pat.itd.vo.PatItdLstListVo;
import kr.re.kitech.biz.pat.itd.vo.PatItdLstVo;


/**
 * @ClassSubJect 
 * @ClassName : PatItdLstController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.30.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.30.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatItdLstController {

  @Resource(name = "patItdLstServiceImpl")
  private PatItdLstService itdService;

  @ElService(key="SvcPATITDITDR01")
  @RequestMapping(value="SvcPATITDITDR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'patItdLstVoList'}")
  @ElDescription(sub="출원업무대기함 조회",desc="출원업무대기함 조회")
  public PatItdLstListVo selectList01(PatItdLstVo itdVo) throws KitechException {
      List<PatItdLstVo> list = itdService.selectList01(itdVo);    	 
      PatItdLstListVo List = new PatItdLstListVo();
      List.setPatItdLstVoList(list);
      return List;
  }
}
  