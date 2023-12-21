package kr.re.kitech.biz.ccs.cgs.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.ccs.cgs.service.CgsSealUseService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsSealUseListVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsSealUseVo;

/**
 * @ClassSubJect : 직인/인감신청 관리
 * @Class Name : CgsSealUseController.java
 * @Description : 직인/인감신청 컨트롤러
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
public class CgsSealUseController {

  @Resource(name = "cgsSealUseServiceImpl")
  private CgsSealUseService cgsService;

  @ElService(key = "SvcCCSCGSCSLMR01")
  @RequestMapping(value = "SvcCCSCGSCSLMR01")
  @ElDescription(sub = "직인/인감신청 조회", desc = "다건 아이템을 조회한다.")
  public CgsSealUseListVo selectList(CgsSealUseVo cgsVo) throws Exception {
      List<CgsSealUseVo> list = cgsService.selectList(cgsVo);    	 
      CgsSealUseListVo List = new CgsSealUseListVo();
      List.setCgsSealUseVoList(list);
      return List;
  }

  @ElService(key = "SvcCCSCGSCSLSR01")
  @RequestMapping(value = "SvcCCSCGSCSLSR01")
  @ElDescription(sub = "직인/인감신청 조회", desc = "단건 아이템을 조회한다.")
  public CgsSealUseListVo selectItem(CgsSealUseVo cgsVo) throws Exception {
      CgsSealUseVo vo = cgsService.selectItem(cgsVo); 
      CgsSealUseListVo List = new CgsSealUseListVo();
      List.setCgsSealUseVo(vo);
      return List;
  }

  @ElService(key = "SvcCCSCGSCSLSM01")
  @RequestMapping(value = "SvcCCSCGSCSLSM01")
  @ElDescription(sub = "직인/인감신청 등록", desc = "단건 아이템을 등록한다.")
  public CgsSealUseListVo insertItem(CgsSealUseVo cgsVo) throws Exception {
	  CgsSealUseVo vo = cgsService.saveItem(cgsVo); 
      CgsSealUseListVo List = new CgsSealUseListVo();
      List.setCgsSealUseVo(vo);
      
      return List;
  }
  
  @ElService(key = "SvcCCSCGSCSLSD01")
  @RequestMapping(value = "SvcCCSCGSCSLSD01")
  @ElDescription(sub = "직인/인감신청 삭제", desc = "단건 아이템을 삭제한다.")
  public void deleteItem(CgsSealUseVo cgsVo) throws Exception {
	  cgsService.deleteItem(cgsVo); 
  }  
  
  @ElService(key = "SvcCCSCGSCSLMR02")
  @RequestMapping(value = "SvcCCSCGSCSLMR02")
  @ElDescription(sub = "사용(직인/인감)인수증 조회(팝업)", desc = "다건 아이템을 조회한다.")
  public CgsSealUseListVo selectListPop(CgsSealUseVo cgsVo) throws Exception {
      List<CgsSealUseVo> list = cgsService.selectListPop(cgsVo);    	 
      CgsSealUseListVo List = new CgsSealUseListVo();
      List.setCgsSealUseVoList(list);
      return List;
  }
  
  @ElService(key = "SvcCCSCGSCSLSU01")
  @RequestMapping(value = "SvcCCSCGSCSLSU01")
  @ElDescription(sub = "사용(직인/인감)인수증 수정(팝업)", desc = "단건 아이템을 수정한다.")
  public void updateItemPop(CgsSealUseVo cgsVo) throws Exception {
	  cgsService.updateItemPop(cgsVo); 
  }    

}
