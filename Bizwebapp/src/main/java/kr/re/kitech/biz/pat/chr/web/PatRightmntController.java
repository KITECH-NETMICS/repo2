package kr.re.kitech.biz.pat.chr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.chr.service.PatRightmntService;
import kr.re.kitech.biz.pat.chr.vo.PatRightmntListVo;
import kr.re.kitech.biz.pat.chr.vo.PatRightmntVo;
import kr.re.kitech.biz.pat.com.service.PatComService;
import kr.re.kitech.biz.pat.com.vo.PatMastrListVo;
import kr.re.kitech.biz.pat.com.vo.PatMastrVo;
import kr.re.kitech.biz.pat.com.vo.PatRightMntVo;
import kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

@Controller
public class PatRightmntController {

  @Resource(name = "patRightmntServiceImpl")
  private PatRightmntService chrService;

  @Resource(name = "patComService")
  private PatComService patComService;

  @ElService(key="SvcPATCHRPATMR01")
  @RequestMapping(value="SvcPATCHRPATMR01")
  @DataCollection(ref="dma_search", target="dlt_list")
  @ElDescription(sub="권리유지내역 다건 조회",desc="권리유지내역 다건 조회")
  public PatRightmntListVo selectList(PatRightmntVo chrVo) throws Exception {
      List<PatRightmntVo> list = chrService.selectList(chrVo);    	 
      PatRightmntListVo List = new PatRightmntListVo();
      List.setPatRightmntVoList(list);
      return List;
  }  

  @ElService(key="SvcPATCHRPATSI01")
  @RequestMapping(value="SvcPATCHRPATSI01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="권리유지내역 저장",desc="권리유지내역 저장")
  public PatTotAcdtHisVo savePatRightMnt(PatMastrListVo vo) throws Exception {
  
	  	PatTotAcdtHisVo retVo = new PatTotAcdtHisVo();
    
        /**
        * 1. 특허마스터 저장
        */
        PatMastrVo patMastrVo = vo.getPatMastrVo();
        patComService.savePatPatMastr(patMastrVo);

        /**
        * 2. 권리유지 저장
        */
        PatRightMntVo patRightMntVo = vo.getPatRightMntVo();
        retVo.setSuccCnt(patComService.savePatRightMnt(patRightMntVo));

        /**
        * 3. 전체사건내역 저장
        */
        PatTotAcdtHisVo patTotAcdtHisVo = vo.getPatTotAcdtHisVo();
        patComService.savePatTotAcdtHis(patTotAcdtHisVo);
        
        return retVo;
             
  }

}
