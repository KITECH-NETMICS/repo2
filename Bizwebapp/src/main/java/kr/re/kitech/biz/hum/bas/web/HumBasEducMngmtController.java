package kr.re.kitech.biz.hum.bas.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.bas.service.HumBasEducMngmtService;
import kr.re.kitech.biz.hum.bas.vo.HumBasComCdListVo;
import kr.re.kitech.biz.hum.bas.vo.HumBasComCdVo;
import kr.re.kitech.biz.hum.bas.vo.HumBasEducMngmtListVo;
import kr.re.kitech.biz.hum.bas.vo.HumBasEducMngmtVo;
import kr.re.kitech.biz.hum.bas.vo.HumOccutypCdVo;
import kr.re.kitech.biz.hum.bas.vo.HumPosiCdVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : HumBasEducMngmtController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.      작업자    최초생성
 * 
 * @author 
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class HumBasEducMngmtController {

  @Resource(name = "humBasEducMngmtServiceImpl")
  private HumBasEducMngmtService basService;
  
  @ElService(key = "SvcHUMBASHUMMR01")
  @RequestMapping(value = "SvcHUMBASHUMMR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'basVoList'}")
  @ElDescription(sub = "교육훈련통합 조회", desc = "교육훈련통합 조회")
  @ElValidator(errUrl = "")
  public List<HumBasEducMngmtVo> selectEducMngmtList(HumBasEducMngmtVo basVo) throws KitechException {
      return basService.selectEducMngmtList(basVo);
  }
  
  @ElService(key = "SvcHUMOCCCD01")
  @RequestMapping(value = "SvcHUMOCCCD01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'humOccutypCdVoList'}")
  @ElDescription(sub = "직종코드 조회", desc = "직종코드 조회")
  @ElValidator(errUrl = "")
  public List<HumOccutypCdVo> selectHumOccutypCdList(HumBasEducMngmtVo basVo) throws KitechException {
      return basService.selectHumOccutypCdList(basVo);
  }
  
  @ElService(key = "SvcHUMPOSICD01")
  @RequestMapping(value = "SvcHUMPOSICD01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'humPosiCdListVoList'}")
  @ElDescription(sub = "직급코드 조회", desc = "직급코드 조회")
  @ElValidator(errUrl = "")
  public List<HumPosiCdVo> selectHumPosiCdList(HumBasEducMngmtVo basVo) throws KitechException {
      return basService.selectHumPosiCdList(basVo);
  }
 
  @ElService(key = "SvcHUMBASCCDMR01")
  @RequestMapping(value = "SvcHUMBASCCDMR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'humPosiCdListVoList'}")
  @ElDescription(sub = "공통코드 조회", desc = "공통코드 조회")
  @ElValidator(errUrl = "")
  public List<HumBasComCdVo> selectHumComCdList(HumBasComCdVo basVo) throws KitechException {
      return basService.selectHumComCdList(basVo);
  }
  
  @ElService(key = "SvcHUMBASCCDMI01")
  @RequestMapping(value = "SvcHUMBASCCDMI01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'humPosiCdListVoList'}")
  @ElDescription(sub = "공통코드 저장", desc = "공통코드 저장")
  @ElValidator(errUrl = "")
  public void selectHumComCdSave(HumBasComCdListVo basVo) throws KitechException {
      basService.selectHumComCdSave(basVo);
  }
  
  @ElService(key = "SvcHUMCMPCD01")
  @RequestMapping(value = "SvcHUMCMPCD01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'humPosiCdListVoList'}")
  @ElDescription(sub = "교육구분, 교육명 비교", desc = "교육구분, 교육명 비교")
  @ElValidator(errUrl = "")
  public List<HumBasEducMngmtVo> selectHumCmpCdInfo(HumBasEducMngmtVo basVo) throws KitechException {
      return basService.selectHumCmpCdInfo(basVo);
  }
  
  @ElService(key = "SvcHUMBASHUMMI01")
  @RequestMapping(value = "SvcHUMBASHUMMI01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'humPosiCdListVoList'}")
  @ElDescription(sub = "교육훈련 내역 저장", desc = "교육훈련 내역 저장")
  @ElValidator(errUrl = "")
  public void saveEducMngmtInfo(HumBasEducMngmtListVo basVo) throws KitechException {
      basService.saveEducMngmtInfo(basVo);
  }
}
  