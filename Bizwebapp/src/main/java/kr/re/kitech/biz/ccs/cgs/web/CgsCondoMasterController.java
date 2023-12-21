package kr.re.kitech.biz.ccs.cgs.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.ccs.cgs.service.CgsCondoMasterService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterListVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCondoMasterVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect : 콘도기본정보
 * @Class Name : CgsCondoMasterController.java
 * @Description : 콘도기본정보 컨트롤러
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.30.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.08.30.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class CgsCondoMasterController {

  @Resource(name = "cgsCondoMasterServiceImpl")
  private CgsCondoMasterService cgsService;

  @ElService(key = "SvcCCSCGSCDMMR01")
  @RequestMapping(value = "SvcCCSCGSCDMMR01")
  @ElDescription(sub = "콘도기본정보 목록 조회", desc = "콘도기본정보 목록을 조회한다.")
  public CgsCondoMasterListVo selectList(CgsCondoMasterVo cgsVo) throws KitechException {
      List<CgsCondoMasterVo> list = cgsService.selectList(cgsVo);
      CgsCondoMasterListVo List = new CgsCondoMasterListVo();
      List.setCgsCondoMasterVoList(list);    	 
      return List;
  }

  @ElService(key = "SvcCCSCGSCDMSI01")
  @RequestMapping(value = "SvcCCSCGSCDMSI01")
  @ElDescription(sub = "콘도기본정보 등록", desc = "콘도기본정보 등록를 등록한다.")
  public void insertItem(CgsCondoMasterListVo cgsVo) throws KitechException {
	  cgsService.insertItem(cgsVo); 
  }
  
  @ElService(key = "SvcCCSCGSCDMMR02")
  @RequestMapping(value = "SvcCCSCGSCDMMR02")
  @ElDescription(sub = "콘도명 셀렉트박스 목록 조회", desc = "콘도명  셀렉트박스 목록을 조회한다.")
  public CgsCondoMasterListVo selectCondoList(CgsCondoMasterVo cgsVo) throws KitechException {
      List<CgsCondoMasterVo> list = cgsService.selectCondoList(cgsVo);    	 
      CgsCondoMasterListVo List = new CgsCondoMasterListVo();
      List.setCgsCondoMasterVoList(list);    	 
      return List;
  }
  
  @ElService(key = "SvcCCSCGSCDMMR03")
  @RequestMapping(value = "SvcCCSCGSCDMMR03")
  @ElDescription(sub = "지역명 셀렉트박스 목록 조회", desc = "지역명 셀렉트박스 목록을 조회한다.")
  public CgsCondoMasterListVo selectRegionList(CgsCondoMasterVo cgsVo) throws KitechException {
      List<CgsCondoMasterVo> list = cgsService.selectRegionList(cgsVo);    	 
      CgsCondoMasterListVo List = new CgsCondoMasterListVo();
      List.setCgsCondoMasterVoList(list);    	 
      return List;
  }

}
