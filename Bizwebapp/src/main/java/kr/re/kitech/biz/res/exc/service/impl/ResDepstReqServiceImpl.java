package kr.re.kitech.biz.res.exc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.fin.com.dao.FinComDepstReqDAO;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComDepstReqService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FinDepstSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspRamtCreatVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.com.vo.ResBgAcctmVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.res.com.vo.ResPrjInfoVo;
import kr.re.kitech.biz.res.exc.dao.ResDepstReqDAO;
import kr.re.kitech.biz.res.exc.service.ResDepstReqService;
import kr.re.kitech.biz.res.exc.vo.ResDemndSlipVo;
import kr.re.kitech.biz.res.exc.vo.ResRepaySlipVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * @ClassSubJect 기술료입금,연구비입금 결의생성 ServiceImpl
 * @Class Name ResDepstReqServiceImpl.java
 * @Description 기술료입금,연구비입금 결의생성 ServiceImpl
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/13      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/13
 * @version 1.0
 * @see
 * 
 */
@Service("resDepstReqService")
public class ResDepstReqServiceImpl extends EgovAbstractServiceImpl implements ResDepstReqService {
	@Resource(name="finSlipSaveService")
	private FinSlipSaveService finSlipService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;	
	
	@Resource(name="finComDepstReqService")
	private FinComDepstReqService depstService;
	
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService aprComService;	
	
	@Resource(name="finComService")
	private FinComService finComService;
	
	@Resource(name="resDepstReqDAO")
	private ResDepstReqDAO dao;
	
	@Resource(name="comDepstReqDAO")
	private FinComDepstReqDAO depstDao;	
	
	/**
    * 기술료,연구비 청구결의 삭제(신청서 삭제 또는 결재반려 시 호출)
    * @param String unslipNo
    * @author LeeYH
    * @since 2022.07.13.
    */
	@Override
	public void deleteDemndReqSlipMnt(String unslipNo, String reqNo) throws KitechException{
		// 자동결의외에 수정된 건이 있는지 조사(분개코드(Fn9910, Fn9920)외의 건수구하기)
		finSlipService.selectAutoSlipCnt(unslipNo);
		
		// 1) 결의서 삭제
		finSlipService.deleteFspSlip(unslipNo);
		
		// 2) 계산서헤더테이블의 결의번호 삭제
		FinSpaSlipUpdVo vo = new FinSpaSlipUpdVo();
		vo.setUnslip_no(unslipNo);
		depstDao.updateFtxBillHDel(vo);
		
		// 3) 청구의뢰수정(결의번호초기화)
		if("R08".equals(reqNo.substring(0,3))){
			dao.updateResDemndReqDel(vo);
			
		}else if("R78".equals(reqNo.substring(0,3))){
			dao.updateResCrtPsRectlDel(vo);
		}
		
		// 4) xomxintfatab 결의결재상태 테이블 삭제
		aprComService.delXomxintfatab(unslipNo);
		
		// 5) 전자증빙 결의서번호 초기화 및 크리스피드 전자증빙 삭제
		vo.setRqst_no(unslipNo);
		vo.setReq_no(reqNo);
		vo.setUnslip_no("");
		attachService.updateFspEvidAttach(vo);
	}
	
	/**
    * 기술료,연구비 입금결의 삭제(신청서 삭제  또는 결재반려 시 호출)
    * @param String unslipNo
    * @author LeeYH
    * @since 2022.07.13.
    */
	public void deleteDepstReqSlipMnt(String unslipNo, String reqNo) throws KitechException{
		// 자동결의외에 수정된 건이 있는지 조사(분개코드(Fn9910, Fn9920)외의 건수구하기)
		finSlipService.selectAutoSlipCnt(unslipNo);
		
		// 1) 결의서 삭제
		finSlipService.deleteFspSlip(unslipNo);
		
		// 2) 잔액정산 삭제, 잔액생성 수정, 계산서 업데이트, fcpdepstreq 결의번호 초기화
		depstService.deleteFspRamtAdjst(unslipNo, true);
		
		// 3) 입금상세테이블에 결의번호 삭제
		FinSpaSlipUpdVo vo = new FinSpaSlipUpdVo();	
		vo.setUnslip_no(unslipNo);
		vo.setDepst_state("RDF003"); // 입금의뢰
		
		if(reqNo.substring(0,3).matches("R05|R09")){ // 연구비입금, 연구비 미수반제
			this.updateResBgRectlDepstState(reqNo, "RDF003", "");
			
		}else if("R78".equals(reqNo.substring(0,3))){ // 기술료 입금, 기술료(주식,어음)
			dao.updateResCrtPsRectlDel(vo);
			
		}else{
			String depstClsf = dao.selectDepstClsf(unslipNo);
			if("FBD082".equals(depstClsf)){
				vo.setReq_no(reqNo);
				vo.setDepst_state("RDF002"); // 계산서발행
				
				dao.updateSptTltDepstDetlsDel(vo);
			}
		}
		
		// 4) 신청서의 전자증빙 결의서번호 초기화 
		vo.setReq_no(reqNo);
		vo.setUnslip_no("");
		attachService.updateFspEvidAttach(vo);	
		
		// 5) 입금내역확인증 증빙 및 크리스피드 전자증빙 삭제
		FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
		evidVo.setReq_no(unslipNo);
		evidVo.setRqst_no(unslipNo); // 크리스피드 전자증빙삭제
		attachService.deleteFspAttchEvid(evidVo);		
		
		// 6) xomxintfatab 결의결재상태 테이블 삭제
		aprComService.delXomxintfatab(unslipNo);
				
	}
	
	/**
     * 연구비청구의뢰 결의생성
     * @param ResDemndReqVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.26.
     */
	 public String createResDemndSlip(ResDemndSlipVo demndVo, ResPrjInfoVo prjVo) throws KitechException{		
		if(demndVo.getDemnd_liq() != demndVo.getSuply_value() + demndVo.getTax_amt()){
			throw new KitechException(Exceptions.ALERT, Business.RES, "message.alert.res.exc.0002");
		}		
		
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //		
		String rmk = demndVo.getRmk() + "/" + demndVo.getAccnt_no();
		String unslipNo = this.saveUnslipH(demndVo.getReq_ymd(), rmk, demndVo.getReq_no(), "426");
				
		// 1-1) 인터페이스 테이블 저장
		IntfatabVo inftaVo = new IntfatabVo();
		inftaVo.setReqNo(unslipNo);
		inftaVo.setUiId("RF42");
		inftaVo.setAprState("XAD020");
		inftaVo.setEndpoints(KitechContextUtil.getUserId());
		aprComService.putXomxintfatab(inftaVo);	
		
		// ==================================================== //
		// 2. 결의서 디테일(차변저장)
		// ==================================================== //			
		// 2-1. FF030001 계정 - 계정책임자 및 편성단위 조회
		ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk("FF030001");
		
		int seq = 1;
				
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = new FinComSlipVo();
		slipVo.setSlip_ymd(demndVo.getReq_ymd());
		
		FspSlipDVo dVo = new FspSlipDVo();
		dVo.setUnslip_no(unslipNo);
		dVo.setUnslip_odr(seq);	
		dVo.setJourn_cd("Fn9910");
		dVo.setJourn_odr(seq);
		dVo.setBase_debit_cr("1");
		if("FBD011".equals(demndVo.getDepst_clsf())){
			dVo.setAccnt_no("FF030001");
			dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
			dVo.setFomat_unit(acctmVo.getFomat_unit());
		}else{
			dVo.setAccnt_no(demndVo.getAccnt_no());
			dVo.setAccnt_rspns(prjVo.getAccnt_rspns());
			dVo.setFomat_unit(prjVo.getFomat_unit());
		}		
		dVo.setAccnt_cd("11117010"); // 미수연구사업비
		dVo.setExpns_cd("999");
		//위탁기관 중소벤처기업부 결의생성 분기
		if(this.getConsignOrg(prjVo)){
			dVo.setUnslip_amt(demndVo.getTax_amt());
		}else{
			dVo.setUnslip_amt(demndVo.getDemnd_liq());
		}
		
		dVo.setEvid_cd("FAH999");
		dVo.setRmk_1(rmk);
		dVo.setRmk_2(demndVo.getVend_abbr());
		dVo.setRegst_req_psn(demndVo.getReq_psn());
		dVo.setAttach_file_no(demndVo.getAttach_file_no());		
		dVo.setBill_no(demndVo.getBill_no());
		dVo.setReq_no(demndVo.getReq_no());
		
		slipVo.setSlipDVo(dVo);		
		
		// 관리항목
		Map<String, String> map = new HashMap<String,String>();
		map.put("unslip_no", unslipNo);
		map.put("unslip_odr", String.valueOf(seq));		
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("base_debit_cr", dVo.getBase_debit_cr());			
		map.put("mngmt_accnt_no", demndVo.getAccnt_no());
		map.put("vend_cd", demndVo.getDepst_loc());
		map.put("vend_nm", demndVo.getVend_abbr());
		map.put("occr_ymd", demndVo.getIssu_ymd());
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
		// 결의생성 호출
		finSlipService.saveAutoSlip(slipVo);	
		
		// 계산서 결의번호 업데이트	
		depstService.updateFtxBillHUnslipNo(demndVo.getBill_no(), unslipNo);	
		
		// 연구비 청구의뢰 결의번호 업데이트
		demndVo.setUnslip_no(unslipNo);
		demndVo.setUnslip_odr(seq);
		dao.updateResDemndReqUnslipNo(demndVo);
		
		// 전자증빙(fspevidattach) 결의번호 추가
		attachService.updateFspEvidAttachUnslipNo(demndVo.getReq_no(), unslipNo, 1);
		
		//위탁기관 중소벤처기업부 선수금 차변생성
		seq +=2;
		if(this.getConsignOrg(prjVo)){
			demndVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
			demndVo.setFomat_unit(acctmVo.getFomat_unit());
			this.createConsignOrgSlip(demndVo, seq);
		}
		
		// ==================================================== //
		// 3. 결의서 디테일(대변저장)
		// ==================================================== //	
		seq= 2;
		slipVo = new FinComSlipVo();
		slipVo.setSlip_ymd(demndVo.getReq_ymd());
		
		dVo = new FspSlipDVo();
		dVo.setUnslip_no(unslipNo);
		dVo.setUnslip_odr(seq);	
		dVo.setJourn_cd("Fn9920");
		dVo.setJourn_odr(seq);
		dVo.setBase_debit_cr("2");
		if("FBD011".equals(demndVo.getDepst_clsf())){
			dVo.setAccnt_no("FF030001");
		}else{
			dVo.setAccnt_no(demndVo.getAccnt_no());
			dVo.setAccnt_rspns(prjVo.getAccnt_rspns());
		}		
		// 대변회계코드 조회
		String accntCd = depstService.getDepstMntAccntCd("FBD011", demndVo.getAccnt_no(), demndVo.getReq_ymd());
		dVo.setAccnt_cd(accntCd);
		dVo.setExpns_cd("999");		
		
		dVo.setTotal_amt(demndVo.getDemnd_liq());
		dVo.setTax_amt(demndVo.getTax_amt());
		if("FTX001".equals(prjVo.getTax_cd())){
			dVo.setUnslip_amt(demndVo.getSuply_value());
		}else{
			dVo.setUnslip_amt(demndVo.getDemnd_liq());
		}
		dVo.setEvid_cd("FAH999");
		dVo.setRmk_1(rmk);
		dVo.setBill_no(demndVo.getBill_no());
		dVo.setRmk_2(demndVo.getVend_abbr());
		dVo.setRegst_req_psn(demndVo.getReq_psn());
		
		slipVo.setSlipDVo(dVo);		
		
		// 관리항목
		map = new HashMap<String,String>();
		map.put("unslip_no", unslipNo);
		map.put("unslip_odr", String.valueOf(seq));		
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("base_debit_cr", dVo.getBase_debit_cr());			
		map.put("mngmt_accnt_no", demndVo.getAccnt_no());
		map.put("bill_no", demndVo.getBill_no());
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
		// 결의생성 호출
		finSlipService.saveAutoSlip(slipVo);		
		
		//---------------------------------------------------------------------
		// 3-1. 부가세 예수금 결의생성
		//---------------------------------------------------------------------
		if("FTX001".equals(prjVo.getTax_cd()) && demndVo.getTax_amt() > 0){
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(demndVo.getReq_ymd());
			
			seq+= 2;
			dVo = new FspSlipDVo();
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);	
			dVo.setJourn_cd("Fn9920");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("2");
			dVo.setAccnt_no("FF030001");
			dVo.setAccnt_cd("21025100");
			dVo.setExpns_cd("999");	
			dVo.setUnslip_amt(demndVo.getTax_amt());		
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(rmk);
			dVo.setBill_no(demndVo.getBill_no());
			dVo.setRmk_2(demndVo.getVend_abbr());
			dVo.setRegst_req_psn(demndVo.getReq_psn());
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());			
			map.put("mngmt_accnt_no", demndVo.getAccnt_no());
			map.put("bill_no", demndVo.getBill_no());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);	
		}
		
		int checkAmt = finComService.selectUnslipAmtCheck(unslipNo);
		if(checkAmt != 0){
			throw new KitechException(Exceptions.ERROR, Business.RES, "message.alert.fin.com.0041", new String[]{String.valueOf(checkAmt)});
		}
		
		// 전자증빙 호출 시작(크리스피드 이원길)
		EvidAttachVo evidVo = new EvidAttachVo();		
		evidVo.setUnslip_no(unslipNo);
		attachService.executeProcess(evidVo);
		
		return unslipNo;
	}	
	
	/**
     * 위탁기관 중소벤처기업부 선수금 차변생성
     * @param ResDemndReqVo
	 * @return int
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.27.
     */
	private void createConsignOrgSlip(ResDemndSlipVo vo, int seq) throws KitechException{
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = new FinComSlipVo();
		slipVo.setSlip_ymd(vo.getReq_ymd());

		FspSlipDVo dVo = new FspSlipDVo();
		dVo.setUnslip_no(vo.getUnslip_no());
		dVo.setUnslip_odr(seq);	
		dVo.setJourn_cd("Fn9910");
		dVo.setJourn_odr(seq);
		dVo.setBase_debit_cr("1");		
		dVo.setAccnt_no("FF030001");
		dVo.setAccnt_rspns(vo.getAccnt_rspns());
		dVo.setFomat_unit(vo.getFomat_unit());
		dVo.setAccnt_cd("21021041"); // 선수금-국가연구개발사업
		dVo.setExpns_cd("999");
		//위탁기관 중소벤처기업부 결의생성 분기
		dVo.setUnslip_amt(vo.getSuply_value());		
		dVo.setEvid_cd("FAH999");
		dVo.setReq_no(vo.getReq_no());
		dVo.setRmk_1("중기부 위탁과제 공급가액(RCMS)/ " + vo.getAccnt_no());
		dVo.setRmk_2(vo.getVend_abbr());
		dVo.setRegst_req_psn(vo.getReq_psn());
		slipVo.setSlipDVo(dVo);		
		
		// 관리항목
		Map<String, String> map = new HashMap<String,String>();
		map.put("unslip_no", vo.getUnslip_no());
		map.put("unslip_odr", String.valueOf(seq));		
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("base_debit_cr", dVo.getBase_debit_cr());			
		map.put("mngmt_accnt_no", vo.getAccnt_no());
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
		// 결의생성 호출
		finSlipService.saveAutoSlip(slipVo);
	}
	
	/**
     * 위탁기관 중소벤처기업부 여부
     * @param ResPrjInfoVo
	 * @return boolean
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.26.
     */
	private boolean getConsignOrg(ResPrjInfoVo vo) throws KitechException{
		return "RCA020".equals(vo.getPrj_kind())  
				&& "040000000".equals(vo.getBsns_cd_ofic()) 
				&& "RHA001".equals(vo.getBsns_cd_inout()) 
				&& "FTX001".equals(vo.getTax_cd())
				&& "FAJ005".equals(vo.getCard_use_ex())
				&& vo.getStart_ymd().compareTo("20190301") >= 0;
	}
	
	/**
     * 연구비 청구결의 헤더 저장
     * @param ResPrjInfoVo
	 * @return boolean
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.26.
     */
	private String saveUnslipH(String slipYmd, String rmk, String reqNo, String slipTypCd) throws KitechException{
		FspSlipHVo hVo = new FspSlipHVo();
		hVo.setSlip_ymd(slipYmd);		
		hVo.setSlip_typ_cd(slipTypCd);		
		hVo.setRmk(rmk);
		
		return finSlipService.saveAutoSlipH(reqNo, hVo);	
	}
	
	/**
     * 연구비 입금의뢰 저장
     * @param FcpDepstReqVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.09.
     */
	public void saveFcpDepstReq(FcpDepstReqVo vo) throws KitechException{
		depstService.saveDepstReq(vo);
	}
	
	/**
    * 연구비청구 반제금액 수정
    * @param String slipNo, int slipOdr, long depstLiq
    * @author LeeYH
    * @since 2023.05.10.
    */
	public void updateUnslipRepayAmt(String slipNo, int slipOdr, long depstLiq, long bfDepstLiq, String cudType) throws KitechException{
		FcpDepstReqVo vo = new FcpDepstReqVo();
		vo.setSlip_no(slipNo);
		vo.setSlip_odr(slipOdr);
		vo.setDepst_liq(depstLiq);
		vo.setBf_depst_liq(bfDepstLiq);
		vo.setCud_type(cudType);
		
		// 반제금액 수정
		depstService.updateFspRamtCreatRepayAmt(vo);
	}	
	
	/**
    * 연구비반제신청 결의생성
    * @param ResRepaySlipVo
    * @return String unslipNo
    * @author LeeYH
    * @since 2023.05.12.
    */
	public String createResRepayReqSlip(ResRepaySlipVo vo) throws KitechException{
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //
		String unslipNo = this.saveUnslipH(vo.getSlip_ymd(), vo.getRmk(), vo.getReq_no(), "428");
				
		// 1-1) 인터페이스 테이블 저장
		IntfatabVo inftaVo = new IntfatabVo();
		inftaVo.setReqNo(unslipNo);
		inftaVo.setUiId("RF44");
		inftaVo.setAprState("XAD020");
		inftaVo.setEndpoints(KitechContextUtil.getUserId());
		aprComService.putXomxintfatab(inftaVo);	
		
		// ==================================================== //
		// 2. 결의서 디테일(차변저장)
		// ==================================================== //			
		int seq = -1;
		
		List<FinDepstSlipVo> depstList = depstDao.selectFcpDepstSlipList(vo.getReq_no());
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = new FinComSlipVo();

		FspSlipDVo dVo = null;
		for(FinDepstSlipVo depstVo : depstList){		
			slipVo.setSlip_ymd(vo.getSlip_ymd());
			
			seq +=2;
			
			dVo = new FspSlipDVo();
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);	
			dVo.setJourn_cd("Fn9910");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("1");
			dVo.setAccnt_no("FF030001");
			dVo.setAccnt_cd("21017911"); // 회계코드(온라인 가수)
			dVo.setExpns_cd("999");
			dVo.setUnslip_amt(depstVo.getDepst_liq());
			
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(vo.getRmk());
			dVo.setRmk_2(depstVo.getVend_abbr());
			dVo.setReq_no(depstVo.getDepst_req_no());
			dVo.setRegst_req_psn(depstVo.getReq_psn());
			dVo.setOccr_slip_no(depstVo.getSlip_no());
			dVo.setOccr_slip_odr(depstVo.getSlip_odr());
			dVo.setAttach_file_no(depstVo.getAttach_file_no());		
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			Map<String, String> map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());			
			map.put("bankaccnt_no", depstVo.getBankaccnt_no());
			map.put("occr_ymd", depstVo.getAcct_txday());
			map.put("mngmt_2060_nm", depstVo.getVend_abbr());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 잔액정산
			slipVo.setRamtVo(this.setRamtCreat(dVo));
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
			
			// fcpdepstreq 에 결의번호 업데이트
			depstService.updateFcpDepstReqUnslipNo(unslipNo, seq, depstVo.getDepst_req_no());				
		}
		
		// 2-1. resbgrectl 에 결의번호 업데이트
		this.updateResBgRectlDepstState(vo.getReq_no(), "", unslipNo);		
		
		// 2-2. 신청서단에서 생성된 증빙데이터에 결의번호 입력
		attachService.updateFspEvidAttachUnslipNo(vo.getReq_no(), unslipNo, seq);
		
		// 2-3.입금내역확인증 증빙 신규생성
		List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList("R09", "N");
		for(FspEvidAttachVo attachVo : attachList){
			attachVo.setReq_no(unslipNo);
			attachVo.setUnslip_no(unslipNo);
			attachVo.setUnslip_odr(seq);
			attachVo.setKey_val(unslipNo);
		}
		
		attachService.saveFspEvidAttach(attachList);
		
		// ==================================================== //
		// 3. 결의서 디테일(대변저장)
		// ==================================================== //	
		List<ResRepaySlipVo> repayList = dao.selectResDemndForRepaySlip(vo.getReq_no());
		seq= 0;
		
		for(ResRepaySlipVo repayVo : repayList){
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(vo.getSlip_ymd());
			
			seq+= 2;
			
			dVo = new FspSlipDVo();
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);	
			dVo.setJourn_cd("Fn9920");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("2");
			dVo.setAccnt_no("FF030001");			
			dVo.setAccnt_cd("11117010");
			dVo.setExpns_cd("999");	
			dVo.setUnslip_amt(repayVo.getDemnd_liq());
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(vo.getRmk());
			dVo.setRmk_2(repayVo.getVend_abbr());
			dVo.setReq_no(vo.getReq_no());
			dVo.setOccr_slip_no(repayVo.getSlip_no());
			dVo.setOccr_slip_odr(repayVo.getSlip_odr());
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			Map<String, String> map = new HashMap<String,String>();
			map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());			
			map.put("mngmt_accnt_no", repayVo.getAccnt_no());
			map.put("vend_cd", repayVo.getVend_cd());
			map.put("vend_nm", repayVo.getVend_abbr());
			map.put("occr_ymd", repayVo.getAccnt_ymd()); // 발생결의 확정일자
			map.put("adjst_schdl_ymd", vo.getSlip_ymd()); // 결의일자			
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 잔액정산
			slipVo.setRamtVo(this.setRamtCreat(dVo));
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
		}
		
		// 전자증빙 호출(크리스피드)
		EvidAttachVo evidVo = new EvidAttachVo();
		evidVo.setUnslip_no(unslipNo);
		attachService.executeProcess(evidVo);
		
		return unslipNo;
	};
	
	/**
    * 연구비반제신청 잔액생성 Vo setting
    * @param FspSlipDVo
    * @return FspRamtCreatVo
    * @author LeeYH
    * @since 2023.05.12.
    */
	private FspRamtCreatVo setRamtCreat(FspSlipDVo vo) throws KitechException{
		FspRamtCreatVo ramtVo = new FspRamtCreatVo();
		ramtVo.setUnslip_no(vo.getUnslip_no());
		ramtVo.setUnslip_odr(vo.getUnslip_odr());
		ramtVo.setAccnt_no(vo.getAccnt_no());
		ramtVo.setAccnt_cd(vo.getAccnt_cd());
		ramtVo.setExpns_cd(vo.getExpns_cd());
		ramtVo.setBase_debit_cr(vo.getBase_debit_cr());			
		ramtVo.setUnslip_amt(vo.getUnslip_amt());
		ramtVo.setRmk_1(vo.getRmk_1());
		ramtVo.setRmk_2(vo.getRmk_2());
		ramtVo.setSlip_no(vo.getOccr_slip_no());
		ramtVo.setSlip_odr(vo.getOccr_slip_odr());
		// 미수반제신청시 청구금액에 대하여는 반제금액 입력하지 않음(2023.11.21. 이영희 수정)
		if("2".equals(vo.getBase_debit_cr())){ 
			ramtVo.setUnslip_repay_upd_yn(false);
		}
		
		return ramtVo;
	}
	
	/**
    * 연구비입금의뢰 또는 결재완료 후 결의번호, 입금상태 업데이트
    * @param String reqNo, String depstState, String unslipNo
    * @return int
    * @author LeeYH
    * @since 2023.05.12.
    */
	public void updateResBgRectlDepstState(String reqNo, String depstState, String unslipNo) throws KitechException{
		FinSpaSlipUpdVo vo = new FinSpaSlipUpdVo();
		vo.setReq_no(reqNo);
		vo.setUnslip_no(unslipNo);
		vo.setDepst_state(depstState);
		
		dao.updateResBgRectlDepstState(vo);
	};
	
	/**
    * 입금의뢰 결의서 및 잔액정산 데이터 삭제
    * @param String unslipNo
    * @author LeeYH
    * @since 2023.05.16.
    */
	public void deleteDepstSlipAndReq(String unslipNo) throws KitechException{		
		// 자동결의외에 수정된 건이 있는지 조사(분개코드(Fn9910, Fn9920)외의 건수구하기)
		finSlipService.selectAutoSlipCnt(unslipNo);
		
		// 1) 결의서 삭제
		finSlipService.deleteFspSlip(unslipNo);
		
		// 2) 잔액정산 삭제, 잔액생성 수정 - fspramtcreat.won_adjst_amt 초기화
		depstService.deleteFspRamtAdjst(unslipNo, false);		
		
		// 3) 전자증빙삭제(입금내역확인증)
		attachService.deleteFspAttchEvid(unslipNo, unslipNo);		
		
		// 4) xomxintfatab 결의결재상태 테이블 삭제
		aprComService.delXomxintfatab(unslipNo);	
	}
	
	/**
    * 입금의뢰 및 반제금액 수정
    * @param FcpDepstReqVo
    * @author LeeYH
    * @since 2023.05.16.
    */
	public void deleteDepstReq(FcpDepstReqVo vo) throws KitechException{
		depstService.deleteDepstReq(vo);
	}
	
	/**
    * 연구비입금의뢰 결의생성
    * @param ResRepaySlipVo
    * @return String unslipNo
    * @author LeeYH
    * @since 2023.05.18.
    */
	public String createResDepstReqSlip(ResPrjInfoVo prjVo, ResRepaySlipVo vo) throws KitechException{
		// 결의서 저장을 위한 조회
		List<FinDepstSlipVo> depstList = depstDao.selectFcpDepstSlipList(vo.getReq_no());
		String rmk = vo.getRmk() + "/" + depstList.get(0).getAccnt_no() + ((depstList.size() > 1)? "외 " + (depstList.size() -1) + "건" : "");
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //
		String unslipNo = this.saveUnslipH(vo.getSlip_ymd(), rmk, vo.getReq_no(), "425");
				
		// 1-1) 인터페이스 테이블 저장
		IntfatabVo inftaVo = new IntfatabVo();
		inftaVo.setReqNo(unslipNo);
		inftaVo.setUiId("RF44");
		inftaVo.setAprState("XAD020");
		inftaVo.setEndpoints(KitechContextUtil.getUserId());
		aprComService.putXomxintfatab(inftaVo);	
		
		// ==================================================== //
		// 2. 결의서 디테일(차변저장)
		// ==================================================== //
		
		// 2-1.FF030001 계정 - 계정책임자 및 편성단위 조회
		ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk("FF030001");
		
		int seq = -1;
		
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = new FinComSlipVo();

		FspSlipDVo dVo = null;
		for(FinDepstSlipVo depstVo : depstList){		
			slipVo.setSlip_ymd(vo.getSlip_ymd());
			
			seq +=2;
			
			dVo = new FspSlipDVo();
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);	
			dVo.setJourn_cd("Fn9910");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("1");
			dVo.setAccnt_no("FF030001");
			dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
			dVo.setFomat_unit(acctmVo.getFomat_unit());
			dVo.setAccnt_cd("21017911"); // 회계코드(온라인 가수)
			dVo.setExpns_cd("999");
			dVo.setUnslip_amt(depstVo.getDepst_liq());
			
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(depstVo.getDepst_clsf_nm() + "(" + depstVo.getAcct_txday() + "," + depstVo.getRmk() + "/" + depstVo.getAccnt_no() + ")");
			dVo.setRmk_2(depstVo.getVend_abbr());
			dVo.setReq_no(depstVo.getDepst_req_no());
			dVo.setRegst_req_psn(depstVo.getReq_psn());
			dVo.setOccr_slip_no(depstVo.getSlip_no());
			dVo.setOccr_slip_odr(depstVo.getSlip_odr());
			dVo.setBill_no(depstVo.getBill_no());
			dVo.setAttach_file_no(depstVo.getAttach_file_no());		
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			Map<String, String> map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());			
			map.put("bankaccnt_no", depstVo.getBankaccnt_no());
			map.put("occr_ymd", depstVo.getAcct_txday());
			map.put("mngmt_2060_nm", depstVo.getVend_abbr());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 잔액정산
			slipVo.setRamtVo(this.setRamtCreat(dVo));
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
			
			// fcpdepstreq 에 결의번호 업데이트
			depstService.updateFcpDepstReqUnslipNo(unslipNo, seq, depstVo.getDepst_req_no());	
			
			//=============================================
			//위탁기관 중소벤처기업부 선수금 차변생성
			//=============================================
			seq+= 2;
			if(this.getConsignOrg(prjVo)){
				if(depstVo.getSuply_value() > 0){
					ResDemndSlipVo demndVo = new ResDemndSlipVo();
					demndVo.setUnslip_no(unslipNo);
					demndVo.setReq_ymd(vo.getSlip_ymd());
					demndVo.setSuply_value(depstVo.getSuply_value());
					demndVo.setReq_no(depstVo.getDepst_req_no());
					demndVo.setVend_abbr(depstVo.getVend_abbr());
					demndVo.setReq_psn(depstVo.getReq_psn());
					demndVo.setAccnt_no(depstVo.getAccnt_no());
					demndVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
					demndVo.setFomat_unit(acctmVo.getFomat_unit());
					
					this.createConsignOrgSlip(demndVo, seq);
				}
			}	
		}
		
		// 2-1. resbgrectl 에 결의번호 업데이트
		this.updateResBgRectlDepstState(vo.getReq_no(), "", unslipNo);		
		
		// 2-2. 계산서 결의번호 업데이트	
		if(depstList.get(0).getBill_no() != null && !"".equals(depstList.get(0).getBill_no().trim())){
			depstService.updateFtxBillHUnslipNo(depstList.get(0).getBill_no(), unslipNo);
		}
		
		// 2-3. 신청서단에서 생성된 증빙데이터에 결의번호 입력
		attachService.updateFspEvidAttachUnslipNo(vo.getReq_no(), unslipNo, seq);
		
		// 2-4.입금내역확인증 증빙 신규생성
		List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList(vo.getReq_no().substring(0,3), "N");
		for(FspEvidAttachVo attachVo : attachList){
			attachVo.setReq_no(unslipNo);
			attachVo.setUnslip_no(unslipNo);
			attachVo.setUnslip_odr(seq);
			attachVo.setKey_val(unslipNo);
		}
		
		attachService.saveFspEvidAttach(attachList);
		
		// ==================================================== //
		// 3. 결의서 디테일(대변저장)
		// ==================================================== //	
		List<FcpDepstReqVo> chaList = dao.selectFcpDepstReqForSlip(vo.getReq_no());
		seq= 0;
		
		for(FcpDepstReqVo depstVo : chaList){
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(vo.getSlip_ymd());
			
			seq+= 2;
			
			dVo = new FspSlipDVo();
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);	
			dVo.setJourn_cd("Fn9920");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("2");
			dVo.setAccnt_no("FF030001");	
			dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
			dVo.setFomat_unit(acctmVo.getFomat_unit());		
			dVo.setAccnt_cd(depstService.getDepstMntAccntCd(depstVo.getDepst_clsf(), depstVo.getAccnt_no(), vo.getSlip_ymd()));
			dVo.setExpns_cd("999");	
			if(depstVo.getTaxamt() > 0){
				dVo.setUnslip_amt(depstVo.getSuply_value());
			}else{
				dVo.setUnslip_amt(depstVo.getDepst_liq());
			}
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(vo.getRmk() + "/" + depstVo.getAccnt_no());
			dVo.setRmk_2(depstVo.getVend_abbr());
			dVo.setReq_no(vo.getReq_no());
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			Map<String, String> map = new HashMap<String,String>();
			map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());			
			map.put("mngmt_accnt_no", depstVo.getAccnt_no());
			map.put("mngmt_2060_nm", depstVo.getAccnt_no());
			map.put("vend_cd", depstVo.getVend_cd());
			map.put("vend_nm", depstVo.getVend_abbr());		
			map.put("bankaccnt_no", depstVo.getBankaccnt_no());
			map.put("bill_no", depstVo.getRecv_bill_no());
			map.put("occr_ymd", depstVo.getAcct_txday());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
			
			if(depstVo.getTaxamt() > 0){
				slipVo = new FinComSlipVo();
				slipVo.setSlip_ymd(vo.getSlip_ymd());
				
				seq+= 2;
				
				dVo = new FspSlipDVo();
				dVo.setUnslip_no(unslipNo);
				dVo.setUnslip_odr(seq);	
				dVo.setJourn_cd("Fn9920");
				dVo.setJourn_odr(seq);
				dVo.setBase_debit_cr("2");
				dVo.setAccnt_no("FF030001");	
				dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
				dVo.setFomat_unit(acctmVo.getFomat_unit());		
				dVo.setAccnt_cd("21025100"); // 부가세예수금
				dVo.setExpns_cd("999");	
				dVo.setUnslip_amt(depstVo.getTaxamt());
				
				dVo.setEvid_cd("FAH999");
				dVo.setRmk_1(vo.getRmk() + "/" + depstVo.getAccnt_no());
				dVo.setRmk_2(depstVo.getVend_abbr());
				dVo.setReq_no(vo.getReq_no());
				
				slipVo.setSlipDVo(dVo);		
				
				// 관리항목
				map = new HashMap<String,String>();
				map = new HashMap<String,String>();
				map.put("unslip_no", unslipNo);
				map.put("unslip_odr", String.valueOf(seq));		
				map.put("accnt_cd", dVo.getAccnt_cd());
				map.put("base_debit_cr", dVo.getBase_debit_cr());			
				map.put("mngmt_accnt_no", depstVo.getAccnt_no());
				map.put("bill_no", depstVo.getRecv_bill_no());
				
				slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
				// 결의생성 호출
				finSlipService.saveAutoSlip(slipVo);				
			}
		}
		
		int checkAmt = finComService.selectUnslipAmtCheck(unslipNo);
		if(checkAmt != 0){
			throw new KitechException(Exceptions.ERROR, Business.RES, "message.alert.fin.com.0041", new String[]{String.valueOf(checkAmt)});
		}
		
		// 전자증빙 호출(크리스피드)
		EvidAttachVo evidVo = new EvidAttachVo();
		evidVo.setUnslip_no(unslipNo);
		attachService.executeProcess(evidVo);
		
		return unslipNo;
	};
}
