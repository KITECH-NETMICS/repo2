package kr.re.kitech.biz.ass.rpt.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.ass.rpt.service.AssRptService;
import kr.re.kitech.biz.ass.rpt.vo.AssRptVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : AssRptController.java
 * @Description 
 * @Modification :   
 *     수정일                 수정자            수정내용
 *  -----------   ---------   ---------
 *  2023.10.16.      김정환           최초생성
 * 
 * @author 
 * @since 2023.10.16.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class AssRptController {

  @Resource(name = "assRptServiceImpl")
  private AssRptService rptService;

  @ElService(key="SvcASSRPTASSR01")
  @RequestMapping(value="SvcASSRPTASSR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'assRptVoList'}")
  @ElDescription(sub="다건 조회",desc="다건 조회")
  public List<AssRptVo> selectAssRptList(AssRptVo vo) throws KitechException {
      return rptService.selectAssRptList(vo);
  }

}
  