package kr.re.kitech.biz.pat.poa.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.poa.service.PatPoaPrdChngReqService;
import kr.re.kitech.biz.pat.poa.vo.PatPoaPrdChngReqListVo;
import kr.re.kitech.biz.pat.poa.vo.PatPoaPrdChngReqVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatPoaPrdChngReqController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.23.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.23.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPoaPrdChngReqController {

  @Resource(name = "patPoaPrdChngReqServiceImpl")
  private PatPoaPrdChngReqService poaService;

  @ElService(key="SvcPATPOAPRDR01")
  @RequestMapping(value="SvcPATPOAPRDR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'patPoaPrdChngReqVoList'}")
  @ElDescription(sub="OA기간연장변경신청 조회",desc="OA기간연장변경신청 조회")
  public PatPoaPrdChngReqListVo selectList01(PatPoaPrdChngReqVo poaVo) throws KitechException {
      List<PatPoaPrdChngReqVo> list = poaService.selectList01(poaVo);    	 
      PatPoaPrdChngReqListVo List = new PatPoaPrdChngReqListVo();
      List.setPatPoaPrdChngReqVoList(list);
      return List;
  }

  @ElService(key="SvcPATPOAPRDR02")
  @RequestMapping(value="SvcPATPOAPRDR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPoaPrdChngReqVo'}")
  @ElDescription(sub="OA기간연장신청 상세 조회",desc="OA기간연장신청 상세 조회")
  public PatPoaPrdChngReqListVo selectItem01(PatPoaPrdChngReqVo poaVo) throws KitechException {
      PatPoaPrdChngReqVo vo = poaService.selectItem01(poaVo); 
      PatPoaPrdChngReqListVo List = new PatPoaPrdChngReqListVo();
      List.setPatPoaPrdChngReqVo(vo);
      return List;
  }

  @ElService(key="SvcPATPOAPRDM01")
  @RequestMapping(value="SvcPATPOAPRDM01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="OA기간연장신청서 저장",desc="OA기간연장신청서 저장")
  public PatPoaPrdChngReqVo savePatOaPrdMnt(PatPoaPrdChngReqVo vo) throws KitechException {
      return poaService.savePatOaPrdMnt(vo);
  }

  @ElService(key="SvcPATPOAPRDAPR")
  @RequestMapping(value="SvcPATPOAPRDAPR")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="OA기간연장신청서 결재",desc="OA기간연장신청서 결재")
  public PatPoaPrdChngReqVo sendApproval(PatPoaPrdChngReqVo vo) throws KitechException {
      return poaService.sendApproval(vo);
  }

  @ElService(key="SvcPATPOAPRDD01")
  @RequestMapping(value="SvcPATPOAPRDD01")
  @DataCollection(ref="data:json,dma_delete", target="")
  @ElDescription(sub="OA기간연장신청서 삭제",desc="OA기간연장신청서 삭제")
  public PatPoaPrdChngReqVo deletePatOaPrdChngReqSD(PatPoaPrdChngReqVo vo) throws KitechException {
      return poaService.deletePatOaPrdChngReqSD(vo);
  }

}