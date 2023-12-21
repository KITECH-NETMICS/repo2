package kr.re.kitech.biz.ccs.cwl.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.ccs.cwl.service.CwlFwLoanReqService;
import kr.re.kitech.biz.ccs.cwl.vo.CwlFwLoanReqListVo;
import kr.re.kitech.biz.ccs.cwl.vo.CwlFwLoanReqVo;
import kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMasterVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 상조회대출신청 
 * @ClassName : CwlFwLoanReqController.java
 * @Description 상조회대출신청 컨트롤러
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.04.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.09.04.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class CwlFwLoanReqController {

  @Resource(name = "cwlFwLoanReqServiceImpl")
  private CwlFwLoanReqService cwlService;

  @ElService(key = "SvcCCSCWLFWLMR01")
  @RequestMapping(value = "SvcCCSCWLFWLMR01")
  @ElDescription(sub = "상조회대출신청 목록 조회", desc = "상조회대출신청 목록을 조회한다.")
  public CwlFwLoanReqListVo selectList(CwlFwLoanReqVo cwlVo) throws KitechException {
      List<CwlFwLoanReqVo> list = cwlService.selectList(cwlVo);    	 
      CwlFwLoanReqListVo List = new CwlFwLoanReqListVo();
      List.setCwlFwLoanReqVoList(list);
      return List;
  }

  @ElService(key = "SvcCCSCWLFWLSR01")
  @RequestMapping(value = "SvcCCSCWLFWLSR01")
  @ElDescription(sub = "상조회대출신청 상세 조회", desc = "상조회대출신청 상세 조회한다.")
  public CwlFwLoanReqListVo selectItem(CwlFwLoanReqVo cwlVo) throws KitechException {
      CwlFwLoanReqVo vo = cwlService.selectItem(cwlVo); 
      CwlFwLoanReqListVo List = new CwlFwLoanReqListVo();
      List.setCwlFwLoanReqVo(vo);
      return List;
  }

  @ElService(key = "SvcCCSCWLFWLMI01")
  @RequestMapping(value = "SvcCCSCWLFWLMI01")
  @ElDescription(sub = "상조회대출신청 등록", desc = "상조회대출신청을 등록한다.")
  public CwlFwLoanReqListVo insertItem(CwlFwLoanReqVo cwlVo) throws KitechException {
      CwlFwLoanReqVo vo = cwlService.insertItem(cwlVo); 
      CwlFwLoanReqListVo List = new CwlFwLoanReqListVo();
      List.setCwlFwLoanReqVo(vo);
      return List;
  }
  
  @ElService(key = "SvcCCSCWLFWLSD01")
  @RequestMapping(value = "SvcCCSCWLFWLSD01")
  @ElDescription(sub = "상조회대출신청 삭제", desc = "상조회대출신청을 삭제한다.")
  public void deleteItem(CwlFwLoanReqVo cwlVo) throws KitechException {
	  cwlService.deleteItem(cwlVo); 
  }

  @ElService(key = "SvcCCSCWLFWLSR02")
  @RequestMapping(value = "SvcCCSCWLFWLSR02")
  @ElDescription(sub = "대출금마스터 기대출금 조회", desc = "대출금마스터 기대출금을 조회한다.")
  public CwlFwLoanReqListVo selectloanRamtInfo(CwlFwLoanReqVo cwlVo) throws KitechException {
	  CwlFwLoanReqVo vo = cwlService.selectloanRamtInfo(cwlVo); 
	  CwlFwLoanReqListVo List = new CwlFwLoanReqListVo();
	  List.setCwlFwLoanReqVo(vo);
	  return List;
  }
  
  @ElService(key = "SvcCCSCWLFWLSR03")
  @RequestMapping(value = "SvcCCSCWLFWLSR03")
  @ElDescription(sub = "급여계좌정보 조회", desc = "급여계좌정보를 조회한다.")
  public CwlFwLoanReqListVo selectHumBankBasicInfo(CwlFwLoanReqVo cwlVo) throws KitechException {
	  CwlFwLoanReqVo vo = cwlService.selectHumBankBasicInfo(cwlVo); 
	  CwlFwLoanReqListVo List = new CwlFwLoanReqListVo();
	  List.setCwlFwLoanReqVo(vo);
	  return List;
  }
  
  @ElService(key = "SvcCCSCWLFWLSR04")
  @RequestMapping(value = "SvcCCSCWLFWLSR04")
  @ElDescription(sub = "확정내역 조회", desc = "확정내역을 조회한다.")
  public CwlFwLoanReqListVo selectDecideInfo(CwlFwLoanReqVo cwlVo) throws KitechException {
	  CwlFwLoanReqVo vo = cwlService.selectDecideInfo(cwlVo);
	  CwlFwLoanReqListVo List = new CwlFwLoanReqListVo();
	  List.setCwlFwLoanReqVo(vo); 
	  return List;
  }
  
  @ElService(key = "SvcCCSCWLFWLSI01")
  @RequestMapping(value = "SvcCCSCWLFWLSI01")
  @ElDescription(sub = "대출금마스터 등록", desc = "대출금마스터 정보를 등록한다.")
  public void insertCwlLoanMaster(CwlLoanMasterVo cwlVo) throws KitechException {
	  cwlService.insertCwlLoanMaster(cwlVo); 
  }
  
  @ElService(key = "SvcCCSCWLFWLSM01")
  @RequestMapping(value = "SvcCCSCWLFWLSM01")
  @ElDescription(sub = "상조회대출신청 승인, 반려 처리", desc = "상조회대출신청 승인, 반려 처리한다.")
  public void cwlFwLoanReqProcApr(CwlFwLoanReqVo cwlVo) throws KitechException {
	  cwlService.cwlFwLoanReqProcApr(cwlVo); 
  }
}
  