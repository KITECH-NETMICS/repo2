package kr.re.kitech.biz.pat.psr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.psr.service.PatPsrInquiryManageService;
import kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageListVo;
import kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatPsrInquiryManageController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.01.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.01.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPsrInquiryManageController {

  @Resource(name = "patPsrInquiryManageServiceImpl")
  private PatPsrInquiryManageService psrService;

  @ElService(key="SvcPATPSRINQR01")
  @RequestMapping(value="SvcPATPSRINQR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'patPsrInquiryManageVoList'}")
  @ElDescription(sub="지재권 목록 조회",desc="지재권 목록 조회")
  public PatPsrInquiryManageListVo selectPatPsrLst01(PatPsrInquiryManageVo psrVo) throws KitechException {
      List<PatPsrInquiryManageVo> list = psrService.selectPatPsrLst01(psrVo);
      PatPsrInquiryManageListVo List = new PatPsrInquiryManageListVo();
      List.setPatPsrInquiryManageVoList(list);
      return List;
  }

  @ElService(key="SvcPATPSRINQR02")
  @RequestMapping(value="SvcPATPSRINQR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,[{'id':'dma_patBasicInfo', 'key': 'patBasicInfo'},{'id':'dma_patManagerInfo', 'key': 'patManagerInfo'},{'id':'dlt_patInventInfo', 'key': 'patInventInfo'},{'id':'dlt_patCoVendInfo', 'key': 'patCoVendInfo'},{'id':'dlt_patInventorInfo', 'key': 'patInventorInfo'},{'id':'dlt_patPrjInfo', 'key': 'patPrjInfo'},{'id':'dlt_patPriorInfo', 'key': 'patPriorInfo'},{'id':'dlt_patDivdeInfo', 'key': 'patDivdeInfo'}]")
  @ElDescription(sub="지식재산권 기본정보 조회",desc="지식재산권 기본정보 조회")
  public PatPsrInquiryManageListVo retrieveDefaultInfo(PatPsrInquiryManageVo psrVo) throws KitechException {
      return psrService.retrieveDefaultInfo(psrVo);
  }

  @ElService(key="SvcPATPSRINQR03")
  @RequestMapping(value="SvcPATPSRINQR03")
  @DataCollection(ref="data:json,dma_search", target="data:json,[{'id':'dma_patAppInfo', 'key': 'patAppInfo'},{'id':'dlt_patAppHistory', 'key': 'patAppHistory'}]")
  @ElDescription(sub="지식재산권 출원 정보 조회",desc="지식재산권 출원 정보 조회")
  public PatPsrInquiryManageListVo retrieveAppInfo(PatPsrInquiryManageVo psrVo) throws KitechException {
      return psrService.retrieveAppInfo(psrVo);
  }

  @ElService(key="SvcPATPSRINQR04")
  @RequestMapping(value="SvcPATPSRINQR04")
  @DataCollection(ref="data:json,dma_search", target="data:json,[{'id':'dma_patRegInfo', 'key': 'patRegInfo'},{'id':'dlt_patDemndLst', 'key': 'patDemndLst'},{'id':'dlt_patOaLst', 'key': 'patOaLst'}]")
  @ElDescription(sub="지식재산권 등록 정보 조회",desc="지식재산권 등록 정보 조회")
  public PatPsrInquiryManageListVo retrieveRegInfo(PatPsrInquiryManageVo psrVo) throws KitechException {
      return psrService.retrieveRegInfo(psrVo);
  }

  @ElService(key="SvcPATPSRINQR05")
  @RequestMapping(value="SvcPATPSRINQR05")
  @DataCollection(ref="data:json,dma_search", target="data:json,[{'id':'dlt_grid01','key':'grid01'}, {'id':'dlt_grid02','key':'grid02'}, {'id':'dlt_grid03','key':'grid03'}, {'id':'dlt_grid04','key':'grid04'}, {'id':'dlt_grid05','key':'grid05'}]")
  @ElDescription(sub="지식재산권 상세 조회 사후관리",desc="지식재산권 상세 조회 사후관리")
  public PatPsrInquiryManageListVo patGridIA05(PatPsrInquiryManageVo vo) throws KitechException {
      return psrService.patGridIA05(vo);
  }

  @ElService(key="SvcPATPSRINQR06")
  @RequestMapping(value="SvcPATPSRINQR06")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPsrInquiryManageVo'}")
  @ElDescription(sub="지식재산권 비용 정보 조회",desc="지식재산권 비용 정보 조회")
  public PatPsrInquiryManageListVo retrieveCostInfo(PatPsrInquiryManageVo psrVo) throws KitechException {
      PatPsrInquiryManageVo vo = psrService.retrieveCostInfo(psrVo); 
      PatPsrInquiryManageListVo List = new PatPsrInquiryManageListVo();
      List.setPatPsrInquiryManageVo(vo);
      return List;
  }

  @ElService(key="SvcPATPSRINQR07")
  @RequestMapping(value="SvcPATPSRINQR07")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'patPsrInquiryManageVoList'}")
  @ElDescription(sub="지식재산권 비용 정보 조회",desc="지식재산권 비용 정보 조회")
  public PatPsrInquiryManageListVo retrieveCostLst(PatPsrInquiryManageVo vo) throws KitechException {
      List<PatPsrInquiryManageVo> list = psrService.retrieveCostLst(vo);
      PatPsrInquiryManageListVo List = new PatPsrInquiryManageListVo();
      List.setPatPsrInquiryManageVoList(list);
      return List;
  }

  @ElService(key="SvcPATPSRINQR08")
  @RequestMapping(value="SvcPATPSRINQR08")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'patPsrInquiryManageVoList'}")
  @ElDescription(sub="패밀리목록 조회",desc="패밀리목록 조회")
  public PatPsrInquiryManageListVo retrieveList(PatPsrInquiryManageVo vo) throws KitechException {
      List<PatPsrInquiryManageVo> list = psrService.retrieveList(vo);
      PatPsrInquiryManageListVo List = new PatPsrInquiryManageListVo();
      List.setPatPsrInquiryManageVoList(list);
      return List;
  }

  @ElService(key="SvcPATPSRINQU01")
  @RequestMapping(value="SvcPATPSRINQU01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="지식 재산권 등록 후 patmastr 수정 및 소연심 안건등록",desc="지식 재산권 등록 후 patmastr 수정 및 소연심 안건등록")
  public void updatePatMastr(PatPsrInquiryManageVo vo) throws KitechException {
      psrService.updatePatMastr(vo);
  }

  @ElService(key="SvcPATPSRINQU02")
  @RequestMapping(value="SvcPATPSRINQU02")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="출원 데이터 변경",desc="출원 데이터 변경")
  public void setPatAppSave(PatPsrInquiryManageVo vo) throws KitechException {
      psrService.setPatAppSave(vo);
  }

  @ElService(key="SvcPATPSRINQU03")
  @RequestMapping(value="SvcPATPSRINQU03")
  @DataCollection(ref="data:json,dma_send_bpm_yn", target="")
  @ElDescription(sub="지식재산권 결재 유무 변경",desc="지식재산권 결재 유무 변경")
  public void updatePatmastrBpmYn(PatPsrInquiryManageVo vo) throws KitechException {
      psrService.updatePatmastrBpmYn(vo);
  }

}
  