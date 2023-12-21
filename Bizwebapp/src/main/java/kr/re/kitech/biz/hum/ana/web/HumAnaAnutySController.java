package kr.re.kitech.biz.hum.ana.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.hum.ana.service.HumAnaAnutySService;
import kr.re.kitech.biz.hum.ana.vo.HumAnaAnutySListVo;
import kr.re.kitech.biz.hum.ana.vo.HumAnaAnutySVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : HumAnaAnutySController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.21.      author    최초생성
 * 
 * @author 
 * @since 2023.09.21.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class HumAnaAnutySController {

  @Resource(name = "humAnaAnutySServiceImpl")
  private HumAnaAnutySService anaService;

  @ElService(key="SvcHUMANAHUMR01")
  @RequestMapping(value="SvcHUMANAHUMR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'humAnaAnutySVoList'}")
  @ElDescription(sub="다건 조회",desc="다건 조회")
  public HumAnaAnutySListVo selectList01(HumAnaAnutySVo anaVo) throws KitechException {
      List<HumAnaAnutySVo> list = anaService.selectList01(anaVo);    	 
      HumAnaAnutySListVo List = new HumAnaAnutySListVo();
      List.setHumAnaAnutySVoList(list);
      return List;
  }

}
  