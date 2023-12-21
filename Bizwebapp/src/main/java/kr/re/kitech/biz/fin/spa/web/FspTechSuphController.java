package kr.re.kitech.biz.fin.spa.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.fin.spa.service.FspTechSuphService;
import kr.re.kitech.biz.fin.spa.vo.FspTechSupMVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSuphExcelListVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSuphExcelVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSuphListVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

@Controller
public class FspTechSuphController {

  @Resource(name = "fspTechSuphServiceImpl")
  private FspTechSuphService spaService;

  @ElService(key="SvcFINSPATECR01")
  @RequestMapping(value="SvcFINSPATECR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="내부장비활용 목록 조회",desc="내부장비활용 목록 조회한다.")
  public FspTechSuphListVo selectList(FspTechSuphVo spaVo) throws Exception {
      List<FspTechSuphVo> list = spaService.selectList(spaVo);    	 
      FspTechSuphListVo List = new FspTechSuphListVo();
      List.setFspTechSuphVoList(list);
      return List;
  }

  @ElService(key="SvcFINSPATECR02")
  @RequestMapping(value="SvcFINSPATECR02")
  @DataCollection(ref="", target="")
  @ElDescription(sub="내부장비활용 액셀 상세",desc="내부장비활용 액셀 상세조회한다.")
  public FspTechSuphExcelListVo selectList2(FspTechSuphExcelVo spaVo) throws Exception {
      List<FspTechSuphExcelVo> list = spaService.selectList2(spaVo);    	 
      FspTechSuphExcelListVo List = new FspTechSuphExcelListVo();
      List.setFspTechSuphExcelVoList(list);
      return List;
  }

  @ElService(key="SvcFINSPATECR03")
  @RequestMapping(value="SvcFINSPATECR03")
  @DataCollection(ref="", target="")
  @ElDescription(sub="내부장비활용 상세 조회",desc="내부장비활용 상세 조회한다.")
  public FspTechSupMVo selectSingle(FspTechSuphVo spaVo) throws Exception {
      FspTechSupMVo vo = spaService.selectSingle(spaVo);       
      return vo;
  }

  @ElService(key="SvcFINSPATECI01")
  @RequestMapping(value="SvcFINSPATECI01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="내부장비활용(유상) 신청 등록",desc="내부장비활용(유상) 신청 등록한다")
  public FspTechSuphVo insertItem(FspTechSupMVo spaVo) throws Exception {
      return spaService.insertItem(spaVo);
  }

  @ElService(key="SvcFINSPATECI02")
  @RequestMapping(value="SvcFINSPATECI02")
  @DataCollection(ref="", target="")
  @ElDescription(sub="관리자 저장",desc="관리자 저장한다.")
  public FspTechSuphVo adminSave(FspTechSupMVo spaVo) throws Exception {
      return spaService.adminSave(spaVo);
  }

  @ElService(key="SvcFINSPATECD01")
  @RequestMapping(value="SvcFINSPATECD01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="내부장비활용(유상) 삭제",desc="내부장비활용(유상) 삭제한다.")
  public void deleteItem(FspTechSupMVo spaVo) throws Exception {
      spaService.deleteItem(spaVo);
  }  
}
