package kr.re.kitech.biz.pat.pts.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.pts.service.PatPtsReeInvService;
import kr.re.kitech.biz.pat.pts.vo.PatPtsReeInvListVo;
import kr.re.kitech.biz.pat.pts.vo.PatPtsReeInvVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatPtsReeInvController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.20.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.20.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPtsReeInvController {

  @Resource(name = "patPtsReeInvServiceImpl")
  private PatPtsReeInvService ptsService;

  @ElService(key="SvcPATPTSREQR01")
  @RequestMapping(value="SvcPATPTSREQR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPtsReeInvVo'}")
  @ElDescription(sub="명세서 의뢰 결과 조회",desc="명세서 의뢰 결과 조회")
  public PatPtsReeInvListVo selectItem01(PatPtsReeInvVo ptsVo) throws KitechException {
      PatPtsReeInvVo vo = ptsService.selectItem01(ptsVo); 
      PatPtsReeInvListVo List = new PatPtsReeInvListVo();
      List.setPatPtsReeInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPTSREQR02")
  @RequestMapping(value="SvcPATPTSREQR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPtsReeInvVo'}")
  @ElDescription(sub="명세서 상세 검색",desc="명세서 상세 검색")
  public PatPtsReeInvListVo selectItem02(PatPtsReeInvVo ptsVo) throws KitechException {
      PatPtsReeInvVo vo = ptsService.selectItem02(ptsVo); 
      PatPtsReeInvListVo List = new PatPtsReeInvListVo();
      List.setPatPtsReeInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPTSREQR03")
  @RequestMapping(value="SvcPATPTSREQR03")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPtsReeInvVo'}")
  @ElDescription(sub="선행기술조사 검색",desc="선행기술조사 검색")
  public PatPtsReeInvListVo selectItem03(PatPtsReeInvVo ptsVo) throws KitechException {
      PatPtsReeInvVo vo = ptsService.selectItem03(ptsVo); 
      PatPtsReeInvListVo List = new PatPtsReeInvListVo();
      List.setPatPtsReeInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPTSREQR04")
  @RequestMapping(value="SvcPATPTSREQR04")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPtsReeInvVo'}")
  @ElDescription(sub="명세서 보완요청 결과 조회",desc="명세서 보완요청 결과 조회")
  public PatPtsReeInvListVo selectItem04(PatPtsReeInvVo ptsVo) throws KitechException {
      PatPtsReeInvVo vo = ptsService.selectItem04(ptsVo); 
      PatPtsReeInvListVo List = new PatPtsReeInvListVo();
      List.setPatPtsReeInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPTSREQR05")
  @RequestMapping(value="SvcPATPTSREQR05")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPtsReeInvVo'}")
  @ElDescription(sub="명세서 의뢰 조회",desc="명세서 의뢰 조회")
  public PatPtsReeInvListVo selectItem05(PatPtsReeInvVo ptsVo) throws KitechException {
      PatPtsReeInvVo vo = ptsService.selectItem05(ptsVo); 
      PatPtsReeInvListVo List = new PatPtsReeInvListVo();
      List.setPatPtsReeInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPTSREQR06")
  @RequestMapping(value="SvcPATPTSREQR06")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'patPtsReeInvVoList'}")
  @ElDescription(sub="선행기술조사 보완요청 횟수 검색",desc="선행기술조사 보완요청 횟수 검색")
  public PatPtsReeInvListVo selectList01(PatPtsReeInvVo ptsVo) throws KitechException {
      List<PatPtsReeInvVo> list = ptsService.selectList01(ptsVo);    	 
      PatPtsReeInvListVo List = new PatPtsReeInvListVo();
      List.setPatPtsReeInvVoList(list);
      return List;
  }

  @ElService(key="SvcPATPTSREQM01")
  @RequestMapping(value="SvcPATPTSREQM01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="명세서 평가 보완요청 등록",desc="명세서 평가 보완요청 등록")
  public void insertPtsReeInv(PatPtsReeInvVo ptsVo) throws Exception {
      ptsService.insertPtsReeInv(ptsVo);
  }

  @ElService(key="SvcPATPTSREQM02")
  @RequestMapping(value="SvcPATPTSREQM02")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="명세서작성 의뢰 등록",desc="명세서작성 의뢰 등록")
  public void insertPtsReqInv(PatPtsReeInvVo ptsVo) throws Exception {
      ptsService.insertPtsReqInv(ptsVo);
  }

}
  