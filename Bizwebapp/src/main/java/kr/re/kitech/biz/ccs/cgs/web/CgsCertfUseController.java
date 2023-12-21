package kr.re.kitech.biz.ccs.cgs.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ccs.cgs.service.CgsCertfUseService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCertfUseListVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCertfUseVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect : 법인증명서발급신청  
 * @Class Name : CgsCertfUseController.java
 * @Description : 법인증명서발급신청 컨트롤러
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.31.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.08.31.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class CgsCertfUseController {

  @Resource(name = "cgsCertfUseServiceImpl")
  private CgsCertfUseService cgsService;

  @ElService(key = "SvcCCSCGSCRTMR01")
  @RequestMapping(value = "SvcCCSCGSCRTMR01")
  @ElDescription(sub = "법인증명서발급신청 목록 조회", desc = "법인증명서발급신청 목록을 조회한다.")
  public CgsCertfUseListVo selectList(CgsCertfUseVo cgsVo) throws KitechException {
      List<CgsCertfUseVo> list = cgsService.selectList(cgsVo);    	 
      CgsCertfUseListVo List = new CgsCertfUseListVo();
      List.setCgsCertfUseVoList(list);
      return List;
  }

  @ElService(key = "SvcCCSCGSCRTSR01")
  @RequestMapping(value = "SvcCCSCGSCRTSR01")
  @ElDescription(sub = "법인증명서발급신청 상세 조회", desc = "법인증명서발급신청 상세 조회한다.")
  public CgsCertfUseListVo selectItem(CgsCertfUseVo cgsVo) throws KitechException {
      CgsCertfUseVo vo = cgsService.selectItem(cgsVo); 
      CgsCertfUseListVo List = new CgsCertfUseListVo();
      List.setCgsCertfUseVo(vo);
      return List;
  }

  @ElService(key = "SvcCCSCGSCRTSI01")
  @RequestMapping(value = "SvcCCSCGSCRTSI01")
  @ElDescription(sub = "법인증명서발급신청 등록", desc = "법인증명서발급신청 내용을 등록한다.")
  public CgsCertfUseListVo insertItem(CgsCertfUseVo cgsVo) throws KitechException {
      CgsCertfUseVo vo = cgsService.insertItem(cgsVo); 
      CgsCertfUseListVo List = new CgsCertfUseListVo();
      List.setCgsCertfUseVo(vo);
      return List;
  }
  
  @ElService(key = "SvcCCSCGSCRTSD01")
  @RequestMapping(value = "SvcCCSCGSCRTSD01")
  @ElDescription(sub = "법인증명서발급신청 삭제", desc = "법인증명서발급신청 내용을 삭제한다.")
  public void deleteItem(CgsCertfUseVo cgsVo) throws KitechException {
	 cgsService.deleteItem(cgsVo); 
  }
  
  @ElService(key = "SvcCCSCGSCRTMR02")
  @RequestMapping(value = "SvcCCSCGSCRTMR02")
  @ElDescription(sub = "주소 조회", desc = "주소를 조회한다.")
@ElValidator(errUrl = "")
  public CgsCertfUseVo selectAddr(CgsCertfUseVo cgsVo) throws KitechException {
      return cgsService.selectAddr(cgsVo);
  }  

}
