package kr.re.kitech.biz.fin.ena.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.com.vo.ResBgAcctmVo;
import kr.re.kitech.biz.fin.ena.dao.FinGrantReqDAO;
import kr.re.kitech.biz.fin.ena.service.FinGrantReqService;
import kr.re.kitech.biz.fin.ena.vo.FinGrantReqListVo;
import kr.re.kitech.biz.fin.ena.vo.FinGrantReqUpdateVo;
import kr.re.kitech.biz.fin.ena.vo.FinGrantReqVo;
import kr.re.kitech.biz.fin.ena.vo.UpdatedeleteFileVo;
import kr.re.kitech.biz.fin.spa.service.FinAutoSlipService;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

@Service("finGrantReqServiceImpl")
public class FinGrantReqServiceImpl  extends EgovAbstractServiceImpl implements FinGrantReqService {
  @Resource(name="finGrantReqDAO")
  private FinGrantReqDAO enaDAO;
  
  @Resource(name="generationServiceImpl")
  private GenerationService genService;
  
  @Resource(name = "apprFuncServiceImpl")
  private ApprFuncService apprFuncService; 
  
  @Resource(name = "apprCommonServiceImpl")
  private ApprCommonService apprCommonService;
  
  @Resource(name="finSlipSaveService")
  private FinSlipSaveService finSlipService;
  
  @Resource(name="finComService")
  private FinComService finComService;
  
  @Resource(name="finComAttachService")
  private FinComAttachService attachService;
  
  @Resource(name="apprCommonServiceImpl")
  private ApprCommonService aprComService;
  
  @Resource(name="finAutoSlipService")
  private FinAutoSlipService finAutoSlipService;    	       
    
  /**
    * 교부금신청 목록조회
    * @author 
    * @since 2023.10.18.
    */
  @Override
  public List<FinGrantReqVo> selectList01(FinGrantReqVo vo) throws ElException {
    List<FinGrantReqVo> list = enaDAO.selectList01(vo);	
    return list;
  }

  /**
    * 교부금신청 조회
    * @author 
    * @since 2023.10.18.
    */
  @Override
  public FinGrantReqListVo selectFinGrantReq(FinGrantReqVo vo) throws ElException {
    FinGrantReqListVo resultVO = new FinGrantReqListVo();
    if (!vo.isApproval()) {
    	resultVO.setFinGrantReqVo(enaDAO.selectFinGrantReq(vo));    			    
    } else {
    	resultVO.setFinGrantReqVo(enaDAO.selectFinGrantReqApr(vo));
    }
      return resultVO;
  }

  /**
    * 국가보조금 교부신청
    * @author 
    * @since 2023.10.18.
    */
  @Override
	public FinGrantReqVo saveEnaraGrantReq(FinGrantReqListVo vo) throws Exception {
	String reqNo = "";
    String cudType = vo.getFinGrantReqVo().getCud_type();
	if("I".equals(cudType)){
		//신청번호채번
		reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F51");
		vo.getFinGrantReqVo().setReq_no(reqNo);
		//인터페이스
		aprComService.createAprInterface(reqNo, "F843", KitechContextUtil.getUserId());		
	}
	enaDAO.saveEnaraGrantReq(vo.getFinGrantReqVo());
	
	if (vo.getFinGrantReqVo().isApproval()) {			
		// 결의번호가 있을 경우 삭제
		if(vo.getFinGrantReqVo().getUnslip_no() != null && !"".equals(vo.getFinGrantReqVo().getUnslip_no())){
			finAutoSlipService.deleteFinPayAdvcAdjstSlipMnt(vo.getFinGrantReqVo().getUnslip_no(),vo.getFinGrantReqVo().getReq_no());
		}
		
		//결재신청
		this.approvalFinGrantReq(vo);													
	}	
	
    return vo.getFinGrantReqVo();
	}

  /**
    * 국가보조금 교부신청 삭제
    * @author 
    * @since 2023.10.18.
    */
  @Override
	public void deleteEnaraGrantReq(FinGrantReqListVo vo) throws Exception {
		//결재스냅샷 및 인터페이스 테이블 삭제
		apprCommonService.deleteApr(vo.getFinGrantReqVo().getReq_no());
		
		UpdatedeleteFileVo delVo= new UpdatedeleteFileVo();
		delVo.setTable_nm("t_ifs_tsk_dvrq_erp");
		delVo.setCol_nm("req_no");
		delVo.setKey_col("req_no");
		delVo.setReq_no(vo.getFinGrantReqVo().getReq_no());
		
		// 교부신청(t_ifs_tsk_dvrq_erp) 신청번호 초기화
		enaDAO.updatedeleteFile(delVo);
	}
	
  /**
    * 국가보조금 교부신청 결의생성
    * @author 
    * @since 2023.10.23.
    */
  @Override
	public FinGrantReqVo createSlipEnaraGrant(FinGrantReqListVo vo) throws KitechException {
	String accntNo = vo.getFinGrantReqVo().getAccnt_no();
	String sysPayNo = vo.getFinGrantReqVo().getWrte_psn();
	String reqNo = vo.getFinGrantReqVo().getReq_no();
	String bank = vo.getFinGrantReqVo().getBank();
	String bankAccntNo = vo.getFinGrantReqVo().getBankaccnt_no();
	String bankNm = vo.getFinGrantReqVo().getBank_nm();
	String depstrNm = vo.getFinGrantReqVo().getDepstr_nm();
	String rmk2 = vo.getFinGrantReqVo().getRmk_2();
	String slipYmd = vo.getFinGrantReqVo().getSlip_ymd();
	long unslipAmt = vo.getFinGrantReqVo().getUnslip_amt();
	
	// ============================================================================
	// 01. 결의서 헤드 저장
	// ============================================================================ 	
	FspSlipHVo hVo = new FspSlipHVo();
	hVo.setSlip_ymd(vo.getFinGrantReqVo().getSlip_ymd());
	hVo.setSlip_typ_cd(vo.getFinGrantReqVo().getSlip_typ_cd());
	String hRmk = "참여기관연구비입금/" + accntNo + "(보조금사업)";
	hVo.setRmk(hRmk);
	hVo.setDecsn_ex("N");
		
	String unslipNo = finSlipService.saveAutoSlipH(reqNo, hVo); //-> 2.0, 3.0 차이점 필수
	
	// ============================================================================
	// 02. 결의서 디테일 차변 저장(1)
	// ============================================================================	
	// 2-1. FF030001 계정 - 계정책임자 및 편성단위 조회
	ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk("FF030001");
	
	int seq = 1;
	
	// 결의생성을 위한 Vo
	FinComSlipVo comSlipVo = new FinComSlipVo();
	comSlipVo.setSlip_ymd(vo.getFinGrantReqVo().getSlip_ymd());
	
	FspSlipDVo dVo = new FspSlipDVo();
	dVo.setUnslip_no(unslipNo);
	dVo.setUnslip_odr(seq);
	dVo.setFomat_unit(acctmVo.getFomat_unit());
	dVo.setJourn_cd("Fn9910");
	dVo.setJourn_odr((seq+1)/2);
	dVo.setBase_debit_cr("1");
	dVo.setAccnt_no("FF030001");
	dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
	dVo.setAccnt_cd("11105020"); //기업자유예금
	dVo.setExpns_cd("999");
	dVo.setUnslip_amt(unslipAmt);
	dVo.setRmk_1(hRmk);
	dVo.setRmk_2("");
	dVo.setReq_no(reqNo);
	dVo.setEvid_cd("FAH999");
	
	comSlipVo.setSlipDVo(dVo);
	
	//잔액관리항목
	
	//필수
	Map<String, String> map = new HashMap<String,String>();
	map.put("unslip_no", unslipNo);
	map.put("unslip_odr", String.valueOf(seq));		
	map.put("accnt_cd", dVo.getAccnt_cd());
	map.put("base_debit_cr", dVo.getBase_debit_cr());
	
	//회계코드별 관리항목 코드			
	map.put("bankaccnt_no", bankAccntNo);
	map.put("depstr_nm", depstrNm);
	map.put("bank", bank);
	map.put("bank_nm", bankNm);
	
	comSlipVo.setMngmtList(finComService.getFspSlipMngmt(map));
	
	// 결의생성 호출
	finSlipService.saveAutoSlip(comSlipVo);
	
	// 전자증빙
	//List<FspEvidAttachVo> evidList = attachService.selectFbaExpnsEvidList("156", "Y");
	//for(FspEvidAttachVo evidVo : evidList){
		//evidVo.setReq_no(unslipNo);
		//evidVo.setUnslip_no(unslipNo);
		//evidVo.setKey_val(unslipNo);
	//}
	//attachService.saveFspEvidAttach(evidList);
	
	// ============================================================================
	// 03. 결의서 디테일 대변 저장(1)
	// ============================================================================
	seq++;
	comSlipVo = new FinComSlipVo();
	comSlipVo.setSlip_ymd(vo.getFinGrantReqVo().getSlip_ymd());
	
	dVo = new FspSlipDVo();
	dVo.setUnslip_no(unslipNo);
	dVo.setUnslip_odr(seq);
	dVo.setJourn_cd("Fn9920");
	dVo.setJourn_odr(seq/2);
	dVo.setFomat_unit(acctmVo.getFomat_unit());
	dVo.setBase_debit_cr("2");	
	dVo.setAccnt_no("FF030001");
	dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
	dVo.setExpns_cd("999");
	dVo.setUnslip_amt(unslipAmt);
	dVo.setReq_no(reqNo);
	dVo.setEvid_cd("FAH999");	
	dVo.setAccnt_cd("21017912"); // 가수금-기타가수금(기타)
	dVo.setRmk_1(hRmk);
	dVo.setRmk_2(rmk2);
	
	comSlipVo.setSlipDVo(dVo);
	
	//잔액관리항목
	map = new HashMap<String,String>();
	map.put("unslip_no", unslipNo);
	map.put("unslip_odr", String.valueOf(seq));		
	map.put("accnt_cd", dVo.getAccnt_cd());
	map.put("base_debit_cr", dVo.getBase_debit_cr());
	map.put("mngmt_accnt_no", accntNo);
	map.put("mngmt_2060_nm", accntNo);
	map.put("occr_ymd", slipYmd);
	
	comSlipVo.setMngmtList(finComService.getFspSlipMngmt(map));
	
	// 결의생성 호출
	finSlipService.saveAutoSlip(comSlipVo);
	
	// ============================================================================
	// 04. 결의서 디테일 차변 저장(2)
	// ============================================================================
	
	seq++;
	comSlipVo = new FinComSlipVo();
	comSlipVo.setSlip_ymd(vo.getFinGrantReqVo().getSlip_ymd());
	
	dVo = new FspSlipDVo();
	dVo.setUnslip_no(unslipNo);//차이점 필수
	dVo.setUnslip_odr(seq);
	dVo.setJourn_cd("Fn9910");
	dVo.setJourn_odr((seq+1)/2);
	dVo.setFomat_unit(acctmVo.getFomat_unit());
	dVo.setBase_debit_cr("1");
	dVo.setAccnt_cd("21017912"); // 가수금-기타가수금(기타)
	dVo.setRmk_1(hRmk);
	dVo.setRmk_2(rmk2);
	dVo.setAccnt_no("FF030001");
	dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
	dVo.setExpns_cd("999");
	dVo.setUnslip_amt(unslipAmt);
	dVo.setReq_no(reqNo);
	dVo.setEvid_cd("FAH999");	
	
	comSlipVo.setSlipDVo(dVo);
	
	//잔액관리항목
	map = new HashMap<String,String>();
	map.put("unslip_no", unslipNo);
	map.put("unslip_odr", String.valueOf(seq));		
	map.put("accnt_cd", dVo.getAccnt_cd());
	map.put("base_debit_cr", dVo.getBase_debit_cr());
	map.put("mngmt_accnt_no", accntNo);
	map.put("mngmt_2060_nm", accntNo);
	map.put("occr_ymd", slipYmd);
	
	comSlipVo.setMngmtList(finComService.getFspSlipMngmt(map));
	
	// 결의생성 호출
	finSlipService.saveAutoSlip(comSlipVo);	
	
	// ============================================================================
	// 05. 결의서 디테일 대변 저장(2)
	// ============================================================================
	
	seq++;
	comSlipVo = new FinComSlipVo();
	comSlipVo.setSlip_ymd(vo.getFinGrantReqVo().getSlip_ymd());
	
	dVo = new FspSlipDVo();
	dVo.setUnslip_no(unslipNo);
	dVo.setUnslip_odr(seq);
	dVo.setFomat_unit(acctmVo.getFomat_unit());
	dVo.setJourn_cd("Fn9920");
	dVo.setJourn_odr(seq/2);
	dVo.setBase_debit_cr("2");
	dVo.setAccnt_cd("11105020"); // 가수금-기타가수금(기타)
	dVo.setRmk_1(hRmk);
	dVo.setRmk_2(rmk2);
	dVo.setAccnt_no("FF030001");
	dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
	dVo.setExpns_cd("999");
	dVo.setUnslip_amt(unslipAmt);
	dVo.setReq_no(reqNo);
	dVo.setEvid_cd("FAH999");	
	
	comSlipVo.setSlipDVo(dVo);
	
	//잔액관리항목
	map = new HashMap<String,String>();
	//필수
	map.put("unslip_no", unslipNo);
	map.put("unslip_odr", String.valueOf(seq));		
	map.put("accnt_cd", dVo.getAccnt_cd());
	map.put("base_debit_cr", dVo.getBase_debit_cr());
	
	//회계코드별 관리항목 코드			
	map.put("bankaccnt_no", bankAccntNo);
	map.put("depstr_nm", depstrNm);
	map.put("bank", bank);
	map.put("bank_nm", bankNm);
	map.put("bankaccnt_no", bankAccntNo);
	
	comSlipVo.setMngmtList(finComService.getFspSlipMngmt(map));
	
	// 결의생성 호출
	finSlipService.saveAutoSlip(comSlipVo);
	
	// ============================================================================
	// 06. 교부금신청 결의번호 업데이트
	// ============================================================================
	FinGrantReqUpdateVo reqUpVo = new FinGrantReqUpdateVo();
	reqUpVo.setReq_no(reqNo);
	reqUpVo.setUnslip_no(unslipNo);
	reqUpVo.setRegst_syspayno(sysPayNo);
	
	enaDAO.updateFinGrantReqNum(reqUpVo);
	
	// 전자증빙 호출 시작(크리스피드 이원길)
	//EvidAttachVo evidVo = new EvidAttachVo();		
	//evidVo.setUnslip_no(unslipNo);
	//attachService.executeProcess(evidVo);

    return vo.getFinGrantReqVo();
	}
	
  /**
    * 국가보조금 교부금 결의 취소
    * @author 
    * @since 2023.10.23.
    */
  @Override
	public FinGrantReqVo cancelSlipEnaraGrant(FinGrantReqListVo vo) throws Exception {
		// 교부신청(t_ifs_tsk_dvrq_erp) 결의번호 초기화
		FinGrantReqUpdateVo reqUpVo = new FinGrantReqUpdateVo();
		reqUpVo.setReq_no(vo.getFinGrantReqVo().getReq_no());
		reqUpVo.setCancel_slip("Y");
		enaDAO.updateFinGrantReqNum(reqUpVo);
		
		// 결의서 삭제
		finSlipService.deleteFspSlip(vo.getFinGrantReqVo().getUnslip_no());
		
		// 전자증빙 삭제로직 
		FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
		evidVo.setReq_no(vo.getFinGrantReqVo().getUnslip_no());
		evidVo.setRqst_no(vo.getFinGrantReqVo().getUnslip_no()); // 크리스피드 전자증빙삭제
		attachService.deleteFspAttchEvid(evidVo);
		
		return vo.getFinGrantReqVo();
	}
	
  /**
    * 국가보조금  결재신청
    * @param FspPayAdvcAdjstListVo
    * @throws Exception
    * @author 
    * @since 2023.10.17.
    */
	private void approvalFinGrantReq(FinGrantReqListVo vo) throws Exception{
	  	// 결재정보
		AprVo aprVo = new AprVo();
		aprVo.setUiId("F843");
		aprVo.setReqNo(vo.getFinGrantReqVo().getReq_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setAprState(vo.getFinGrantReqVo().getApr_state());
		aprVo.setResearchChargerId(vo.getFinGrantReqVo().getAccnt_rspns());
		aprVo.setManager(vo.getFinGrantReqVo().getManager_id());
		aprVo.setInfoCd(vo.getFinGrantReqVo().getReqst_sj_nm());
		
		apprFuncService.approvalRequest(aprVo, vo);	//vo에 xsl에 들어갈 파라미터 넣기		
	}			
}
