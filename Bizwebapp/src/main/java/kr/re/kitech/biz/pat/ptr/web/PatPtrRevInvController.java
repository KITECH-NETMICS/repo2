package kr.re.kitech.biz.pat.ptr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.ptr.service.PatPtrRevInvService;
import kr.re.kitech.biz.pat.ptr.vo.PatPtrRevInvListVo;
import kr.re.kitech.biz.pat.ptr.vo.PatPtrRevInvVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatPtrRevInvController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.07.      이대훈    최초생성
 * 
 * @author 
 * @since 2023.09.07.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPtrRevInvController {

  @Resource(name = "patPtrRevInvServiceImpl")
  private PatPtrRevInvService ptrService;

  @ElService(key="SvcPATPTRREVSR01")
  @RequestMapping(value="SvcPATPTRREVSR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPtrRevInvVo'}")
  @ElDescription(sub="발명신고서 서지사항 조회",desc="발명신고서 서지사항 조회")
  public PatPtrRevInvListVo selectItem01(PatPtrRevInvVo ptrVo) throws KitechException {
      PatPtrRevInvVo vo = ptrService.selectItem01(ptrVo); 
      PatPtrRevInvListVo List = new PatPtrRevInvListVo();
      List.setPatPtrRevInvVo(vo);
      return List;
  }
  
  @ElService(key="SvcPATPTRREVSR02")
  @RequestMapping(value="SvcPATPTRREVSR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPtrRevInvVo'}")
  @ElDescription(sub="선행기술조사서 조회",desc="선행기술조사서 조회")
  public PatPtrRevInvListVo selectItem02(PatPtrRevInvVo ptrVo) throws KitechException {
      PatPtrRevInvVo vo = ptrService.selectItem02(ptrVo); 
      PatPtrRevInvListVo List = new PatPtrRevInvListVo();
      List.setPatPtrRevInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPTRREVSR03")
  @RequestMapping(value="SvcPATPTRREVSR03")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPtrRevInvVo'}")
  @ElDescription(sub="선행기술조사 보완요청 보완요청결과 조회",desc="선행기술조사 보완요청 보완요청결과 조회")
  public PatPtrRevInvListVo selectItem03(PatPtrRevInvVo ptrVo) throws KitechException {
      PatPtrRevInvVo vo = ptrService.selectItem03(ptrVo); 
      PatPtrRevInvListVo List = new PatPtrRevInvListVo();
      List.setPatPtrRevInvVo(vo);
      return List;
  }


  @ElService(key="SvcPATPTRREVSR04")
  @RequestMapping(value="SvcPATPTRREVSR04")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPtrRevInvVo'}")
  @ElDescription(sub="선행기술조사 의뢰 조회",desc="선행기술조사 의뢰 조회")
  public PatPtrRevInvListVo selectItem04(PatPtrRevInvVo ptrVo) throws KitechException {
      PatPtrRevInvVo vo = ptrService.selectItem04(ptrVo); 
      PatPtrRevInvListVo List = new PatPtrRevInvListVo();
      List.setPatPtrRevInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPTRREVSR05")
  @RequestMapping(value="SvcPATPTRREVSR05")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_result','key':'patPtrRevInvVo'}")
  @ElDescription(sub="선행기술조사서 조회",desc="선행기술조사서 조회")
  public PatPtrRevInvListVo selectItem05(PatPtrRevInvVo ptrVo) throws KitechException {
      PatPtrRevInvVo vo = ptrService.selectItem05(ptrVo); 
      PatPtrRevInvListVo List = new PatPtrRevInvListVo();
      List.setPatPtrRevInvVo(vo);
      return List;
  }

  @ElService(key="SvcPATPTRREVSR06")
  @RequestMapping(value="SvcPATPTRREVSR06")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dma_content','key':'patPtrRevInvVo'}")
  @ElDescription(sub="선행기술조사서 의뢰내용 조회",desc="선행기술조사서 의뢰내용 조회")
  public PatPtrRevInvListVo selectItem06(PatPtrRevInvVo ptrVo) throws KitechException {
      PatPtrRevInvVo vo = ptrService.selectItem06(ptrVo); 
      PatPtrRevInvListVo List = new PatPtrRevInvListVo();
      List.setPatPtrRevInvVo(vo);
      return List;
  }


  @ElService(key="SvcPATPTRREVMR01")
  @RequestMapping(value="SvcPATPTRREVMR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'patPtrRevInvVoList'}")
  @ElDescription(sub="보완요청 select box 조회",desc="보완요청 select box 조회")
  public PatPtrRevInvListVo selectList01(PatPtrRevInvVo ptrVo) throws KitechException {
      List<PatPtrRevInvVo> list = ptrService.selectList01(ptrVo);    	 
      PatPtrRevInvListVo List = new PatPtrRevInvListVo();
      List.setPatPtrRevInvVoList(list);
      return List;
  }

  @ElService(key="SvcPATPTRREVSU01")
  @RequestMapping(value="SvcPATPTRREVSU01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="지식재산권 첨부파일 수정",desc="지식재산권 첨부파일 수정")
  public void updateAttachmentFilesBySrhId(PatPtrRevInvVo vo) throws KitechException {
    ptrService.updateAttachmentFilesBySrhId(vo);
  }

  @ElService(key="SvcPATPTRREVSI01")
  @RequestMapping(value="SvcPATPTRREVSI01")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="선행기술조사서 검토 결과 등록",desc="선행기술조사서 검토 결과 등록")
  public void insertPtrRevInv(PatPtrRevInvVo ptrVo) throws Exception {
      ptrService.insertPtrRevInv(ptrVo);
  }

  @ElService(key="SvcPATPTRREVSI02")
  @RequestMapping(value="SvcPATPTRREVSI02")
  @DataCollection(ref="data:json,dma_save", target="")
  @ElDescription(sub="선행기술조사서 의뢰",desc="선행기술조사서 의뢰")
  public void insertPtrReqInv(PatPtrRevInvVo ptrVo) throws Exception {
      ptrService.insertPtrReqInv(ptrVo);
  }

}
  