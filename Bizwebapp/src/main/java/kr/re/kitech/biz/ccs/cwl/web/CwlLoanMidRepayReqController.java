package kr.re.kitech.biz.ccs.cwl.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.ccs.cwl.service.CwlLoanMidRepayReqService;
import kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqListVo;
import kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 대출중도상환신청
 * @ClassName : CwlLoanMidRepayReqController.java
 * @Description 대출중도상환신청 컨트롤러
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.08.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.09.08.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class CwlLoanMidRepayReqController {

  @Resource(name = "cwlLoanMidRepayReqServiceImpl")
  private CwlLoanMidRepayReqService cwlService;

  @ElService(key = "SvcCCSCWLLMRMR01")
  @RequestMapping(value = "SvcCCSCWLLMRMR01")
  @ElDescription(sub = "대출중도상환 목록 조회", desc = "대출중도상환 목록을 조회한다.")
  public CwlLoanMidRepayReqListVo selectList(CwlLoanMidRepayReqVo cwlVo) throws KitechException {
      List<CwlLoanMidRepayReqVo> list = cwlService.selectList(cwlVo);    	 
      CwlLoanMidRepayReqListVo List = new CwlLoanMidRepayReqListVo();
      List.setCwlLoanMidRepayReqVoList(list);
      return List;
  }

  @ElService(key = "SvcCCSCWLLMRSR01")
  @RequestMapping(value = "SvcCCSCWLLMRSR01")
  @ElDescription(sub = "대출중도상환 상세 조회", desc = "대출중도상환 상세 조회한다.")
  public CwlLoanMidRepayReqListVo selectItem(CwlLoanMidRepayReqVo cwlVo) throws KitechException {
      CwlLoanMidRepayReqVo vo = cwlService.selectItem(cwlVo); 
      CwlLoanMidRepayReqListVo List = new CwlLoanMidRepayReqListVo();
      List.setCwlLoanMidRepayReqVo(vo);
      return List;
  }

  @ElService(key = "SvcCCSCWLLMRSI01")
  @RequestMapping(value = "SvcCCSCWLLMRSI01")
  @ElDescription(sub = "대출중도상환 등록", desc = "대출중도상환 내용을 등록한다.")
  public CwlLoanMidRepayReqListVo insertItem(CwlLoanMidRepayReqVo cwlVo) throws KitechException {
      CwlLoanMidRepayReqVo vo = cwlService.insertItem(cwlVo);
      CwlLoanMidRepayReqListVo List = new CwlLoanMidRepayReqListVo();
      List.setCwlLoanMidRepayReqVo(vo);
      return List;
  }
  
  @ElService(key = "SvcCCSCWLLMRSU01")
  @RequestMapping(value = "SvcCCSCWLLMRSU01")
  @ElDescription(sub = "대출중도상환 수정", desc = "대출중도상환 내용을 수정한다.")
  public void updateItem(CwlLoanMidRepayReqVo cwlVo) throws KitechException {
	  cwlService.updateItem(cwlVo);
  }
  
  @ElService(key = "SvcCCSCWLLMRSM02")
  @RequestMapping(value = "SvcCCSCWLLMRSM02")
  @ElDescription(sub = "대출중도상환 승인", desc = "대출중도상환 내용을 승인 처리한다.")
  public void cwlLoanMidRepayAgree(CwlLoanMidRepayReqVo cwlVo) throws KitechException {
	  cwlService.cwlLoanMidRepayAgree(cwlVo);
  }
  
  @ElService(key = "SvcCCSCWLLMRSM03")
  @RequestMapping(value = "SvcCCSCWLLMRSM03")
  @ElDescription(sub = "대출중도상환 반려", desc = "대출중도상환 내용을 반려 처리한다.")
  public void cwlLoanMidRepayReject(CwlLoanMidRepayReqVo cwlVo) throws KitechException {
	  cwlService.cwlLoanMidRepayReject(cwlVo);
  }
  
  @ElService(key = "SvcCCSCWLLMRSD01")
  @RequestMapping(value = "SvcCCSCWLLMRSD01")
  @ElDescription(sub = "대출중도상환 삭제", desc = "대출중도상환 내용을 삭제한다.")
  public void deleteItem(CwlLoanMidRepayReqVo cwlVo) throws KitechException {
	  cwlService.deleteItem(cwlVo);
  }

  @ElService(key = "SvcCCSCWLLMRSM01")
  @RequestMapping(value = "SvcCCSCWLLMRSM01")
  @ElDescription(sub = "대출중도상환 이자계산 처리", desc = "대출중도상환 이자계산 로직을 처리한다.")
  public CwlLoanMidRepayReqListVo processInterestCalculation(CwlLoanMidRepayReqVo cwlVo) throws KitechException {
	  CwlLoanMidRepayReqVo vo = cwlService.processInterestCalculation(cwlVo); 
	  CwlLoanMidRepayReqListVo List = new CwlLoanMidRepayReqListVo();
	  List.setCwlLoanMidRepayReqVo(vo);
	  return List;
  }
  
  @ElService(key = "SvcCCSCWLLMRSU02")
  @RequestMapping(value = "SvcCCSCWLLMRSU02")
  @ElDescription(sub = "대출중도상환 확정 ", desc = "대출중도상환 내용을 확정 처리한다.")
  public void updateLoanMidRepayConfirm(CwlLoanMidRepayReqListVo cwlVo) throws KitechException {
	  cwlService.updateLoanMidRepayConfirm(cwlVo);
  }
    
  @ElService(key = "SvcCCSCWLLMRSU03")
  @RequestMapping(value = "SvcCCSCWLLMRSU03")
  @ElDescription(sub = "대출중도상환 확정취소", desc = "대출중도상환 내용 확정을 취소 처리한다.")
  public void updateLoanMidRepayCancel(CwlLoanMidRepayReqListVo cwlVo) throws KitechException {
	  cwlService.updateLoanMidRepayCancel(cwlVo);
  }  
}
  