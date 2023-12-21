package kr.re.kitech.biz.ccs.cgs.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ccs.cgs.service.CgsSignUseService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsSignUseListVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsSignUseVo;
/**
 * @ClassSubJect : 인장사용관리
 * @Class Name : CgsSignUseController.java
 * @Description : 직인/인감 날인 신청 컨트롤러
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
public class CgsSignUseController {

  @Resource(name = "cgsSignUseServiceImpl")
  private CgsSignUseService cgsService;

  @ElService(key = "SvcCCSCGSCSUMR01")
  @RequestMapping(value = "SvcCCSCGSCSUMR01")
  @ElDescription(sub = "인장사용관리조회", desc = "다건 아이템을 조회한다.")
  public CgsSignUseListVo selectList(CgsSignUseVo cgsVo) throws Exception {
      List<CgsSignUseVo> list = cgsService.selectList(cgsVo);    	 
      CgsSignUseListVo List = new CgsSignUseListVo();
      List.setCgsSignUseVoList(list);
      return List;
  }

  @ElService(key = "SvcCCSCGSCSUSR01")
  @RequestMapping(value = "SvcCCSCGSCSUSR01")
  @ElDescription(sub = "인장사용관리조회", desc = "단건 아이템을 조회한다.")
  public CgsSignUseListVo selectSingle(CgsSignUseVo cgsVo) throws Exception {
      CgsSignUseVo vo = cgsService.selectSingle(cgsVo); 
      CgsSignUseListVo List = new CgsSignUseListVo();
      List.setCgsSignUseVo(vo);
      return List;
  }
  
  @ElService(key = "SvcCCSCGSCSUSI01")
  @RequestMapping(value = "SvcCCSCGSCSUSI01")
  @ElDescription(sub = "인장사용관리등록", desc = "단건 아이템을 등록한다.")
  public CgsSignUseListVo insertItem(CgsSignUseVo cgsVo) throws Exception {
      CgsSignUseVo vo = cgsService.insertItem(cgsVo); 
      CgsSignUseListVo List = new CgsSignUseListVo();
      List.setCgsSignUseVo(vo);
      return List;
  }
  
  @ElService(key = "SvcCCSCGSCSUSU01")
  @RequestMapping(value = "SvcCCSCGSCSUSU01")
  @ElDescription(sub = "인장사용관리수정", desc = "단건 아이템을 수정한다.")
  public void updateItem(CgsSignUseVo cgsVo) throws Exception {
      cgsService.updateItem(cgsVo); 
  }
  
  @ElService(key = "SvcCCSCGSCSUSD01")
  @RequestMapping(value = "SvcCCSCGSCSUSD01")
  @ElDescription(sub = "인장사용관리삭제", desc = "단건 아이템을 삭제한다.")
  public void deleteItem(CgsSignUseVo cgsVo) throws Exception {
	  cgsService.deleteItem(cgsVo); 
  }
  
  @ElService(key = "SvcCCSCGSCADRR01")
  @RequestMapping(value = "SvcCCSCGSCADRR01")
  @ElDescription(sub = "공통코드주소조회", desc = "단건 아이템을 조회한다.")
  public CgsSignUseVo selectAddr(CgsSignUseVo cgsVo) throws Exception {
      CgsSignUseVo vo = cgsService.selectAddr(cgsVo); 
      CgsSignUseListVo List = new CgsSignUseListVo();
      List.setCgsSignUseVo(vo);
      return vo;
  }
  
  @ElService(key = "SvcCCSCGSCSUMR02")
  @RequestMapping(value = "SvcCCSCGSCSUMR02")
  @ElDescription(sub = "인장사용관리조회(관리화면)", desc = "다건 아이템을 조회한다.")
  public CgsSignUseListVo selectListMnt(CgsSignUseVo cgsVo) throws Exception {
	  List<CgsSignUseVo> list = cgsService.selectListMnt(cgsVo);    	 
	  CgsSignUseListVo List = new CgsSignUseListVo();
	  List.setCgsSignUseVoList(list);
	  return List;
  }
  
  @ElService(key = "SvcCCSCGSCSUSU02")
  @RequestMapping(value = "SvcCCSCGSCSUSU02")
  @ElDescription(sub = "인장사용관리수정(관리화면)", desc = "다건 아이템을 수정한다.")
@ElValidator(errUrl = "")
  public void updateItemMnt(CgsSignUseListVo listCgsVo) throws Exception {
      cgsService.updateItemMnt(listCgsVo.getCgsSignUseVoList()); 
  }
}
