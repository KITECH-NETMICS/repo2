package kr.re.kitech.biz.fin.spa.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.hsqldb.lib.StringUtil;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.epu.giv.vo.PurPayReqAccntVo;
import kr.re.kitech.biz.epu.giv.vo.PurPayReqVendVo;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComDepstReqService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.ComReqVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FinDepstSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspRamtCreatVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.com.vo.ResBgAcctmVo;
import kr.re.kitech.biz.fin.com.vo.SlipBaseVo;
import kr.re.kitech.biz.fin.spa.dao.FinAutoSlipDAO;
import kr.re.kitech.biz.fin.spa.service.FinAutoSlipService;
import kr.re.kitech.biz.fin.spa.vo.BblenfrcSlipVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.fin.spa.vo.PurPayReqMastrVo;
import kr.re.kitech.biz.res.exc.vo.ResBgRemtlVo;
import kr.re.kitech.biz.res.exc.vo.ResDemndSlipVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 기술료인센티브 결의생성 ServiceImpl
 * @Class Name FinPstpictSlipServiceImpl.java
 * @Description 기술료인센티브 결의생성 ServiceImpl
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
@Service("finAutoSlipService")
public class FinAutoSlipServiceImpl extends EgovAbstractServiceImpl implements FinAutoSlipService {
	@Resource(name="finSlipSaveService")
	private FinSlipSaveService finSlipService;	
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	@Resource(name="finComService")
	private FinComService finComService;
	
	@Resource(name="finComDepstReqService")
	private FinComDepstReqService depstService;
	
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService aprComService;
	
	@Resource(name="finAutoSlipDAO")
	private FinAutoSlipDAO dao;
	

	/**
    * 기술료인센티브 결의삭제
    * @param String unslipNo
    * @author LeeYH
    * @since 2022.07.13.
    */
	@Override
	public void deleteFinpstpictSlipMnt(String unslipNo) throws ElException{		
		// 1) 인터페이스테이블 삭제
		aprComService.delXomxintfatab(unslipNo);
		
		// 2) 결의서 헤더, 디테일, 관리항목, 송금내역 삭제
		finSlipService.deleteFspSlip(unslipNo);
		
		// 3) 인센티브 헤더 수정 및 전자증빙 결의번호 초기화	
		List<FinSpaSlipUpdVo> rstList = dao.selectResCrtPstpIctHDel(unslipNo);
		if(rstList != null && rstList.size() > 0){
			for(FinSpaSlipUpdVo vo : rstList){				
				// 인센티브 결의번호 초기화
				vo.setUnslip_no("");
				dao.updateResCrtPstpIctH(vo);
				
				// 전자증빙 fspevidattach 결의번호 초기화
				attachService.updateFspEvidAttach(vo);
			}
		}		
				
		// 4) 예실삭제
		DelBblEnfrcVo delVo = new DelBblEnfrcVo();
		delVo.setReq_no(unslipNo);
		finComService.deleteBudEnfrcMnt(delVo);		
		
		// 5) 크리스피드 전자증빙 삭제로직
		EvidAttachVo attachVo = new EvidAttachVo();
		attachVo.setRqst_no(unslipNo);
		attachService.executeProcess(attachVo);
	}
	
	/**
    * 연구비 송금결의삭제
    * @param String unslipNo
    * @author LeeYH
    * @since 2022.07.14.
    */
	public void deleteFinReschSendSlipMnt(String reqNo) throws ElException{
		List<ResBgRemtlVo> rstList = dao.selectResBgRemtlDel(reqNo);
		if(rstList != null && rstList.size() > 0){
			// 인터페이스테이블 삭제
			aprComService.delXomxintfatab(rstList.get(0).getUnslip_no());
				
			for(ResBgRemtlVo vo : rstList){
				// 1) 결의서 헤더, 디테일, 관리항목, 송금내역 삭제
				finSlipService.deleteFspSlip(vo.getUnslip_no());
				
				// 2) 송금결의취소 시 매입계산서 테이블에 저장된 결의번호 빈값처리 및 금액 복구(2017.06.09.)
				if(!"".equals(vo.getBill_no())){
					dao.updateKtxIssuMstrDel(vo.getBill_no());
				}
				
				// 3) 연구비 송금 update
				dao.updateResBgRemtlDel(vo);
				
				// 4) 집행내역 결의번호 초기화
				DelBblEnfrcVo delVo = new DelBblEnfrcVo();
				delVo.setUnslip_no(vo.getUnslip_no());
				dao.updateBblenfrcDel(delVo);
				
				// 5) 전자증빙 fspevidattach 결의번호 초기화 및 전자증빙 삭제로직 (크리스피드)
				FinSpaSlipUpdVo updVo = new FinSpaSlipUpdVo();
				updVo.setReq_no(reqNo);
				updVo.setUnslip_no("");
				
				updVo.setRqst_no(vo.getUnslip_no());
				attachService.updateFspEvidAttach(updVo);				
			}
		}
	}
	
	
	/**
    * 구매지급결의취소(deleteFinMnyPaySlip1Mnt)
    * @param String unslipNo
    * @author LeeYH
    * @since 2022.07.18.
    */
	public void deletePurPayReqSlip(String unslipNo) throws ElException{
		// 1) 결의서 헤더, 디테일, 관리항목, 송금내역 삭제
		finSlipService.deleteFspSlip(unslipNo);
		
		// 2) 구매결의 내역 조회
		long unslipAmt = 0;
		boolean ajstYn = false;	
		
		// 235결의는 한개의 결의번호로 여러개의 신청번호가 있을 수 있으므로
		List<PurPayReqMastrVo> rstList = dao.selectPurPayReqMastrDel(unslipNo);
		for(PurPayReqMastrVo rstVo : rstList){
		
			// 2-1) 계정내역 조회
			List<PurPayReqAccntVo> accntList = dao.selectPurPayReqAccntDel(rstVo.getReq_no());
			for(PurPayReqAccntVo accntVo : accntList){
				if(rstVo.getExpns_clsf().matches("PLA070|PLA083|PLA082")){
					unslipAmt = accntVo.getFin_pay_amt();
				}else{
					if("FTX001".equals(accntVo.getTax_cd())){
						unslipAmt = accntVo.getSuply_value();
					}else{
						unslipAmt = accntVo.getPay_amt();
					}
				}
				
				if(StringUtil.isEmpty(accntVo.getOccr_slip_no())){
					// 2-2) 집행내역 결의번호 초기화
					accntVo.setUnslip_amt(unslipAmt);
					dao.updateBblenFrcPurSlipDel(accntVo);
				}else{
					ajstYn = true;
				}
			}
			
			// 2-3) 계산서 및 카드내역 수정
			List<PurPayReqVendVo> vendList = dao.selectPurPayReqVendDel(rstVo.getReq_no());
			long payAmt = 0;
			long totPayAmt = 0;
			for(PurPayReqVendVo vendVo : vendList){
				if(rstVo.getExpns_clsf().matches("PLA070|PLA083|PLA082")){
					payAmt = vendVo.getFin_pay_amt();
				}else{
					payAmt = vendVo.getPay_amt();
				}
				
				totPayAmt += payAmt;
				
				// 카드내역 수정
				if(!StringUtil.isEmpty(vendVo.getCard_no())){
					FspSlipDVo slipVo = new FspSlipDVo();
					slipVo.setTotal_amt(payAmt);
					slipVo.setCard_no(vendVo.getCard_no());
					slipVo.setApprvl_no(vendVo.getApprvl_no());
					slipVo.setUse_ymd(vendVo.getUse_ymd());
					slipVo.setCard_clsf(vendVo.getCard_clsf());
					slipVo.setCard_knd(vendVo.getCard_knd());
					
					finSlipService.deleteCardSlipInfo(slipVo);
				
				}else if(!StringUtil.isEmpty(vendVo.getBill_no())){
					SlipBaseVo slipVo = new SlipBaseVo();
					slipVo.setIssu_seqno(vendVo.getBill_no());
					slipVo.setUnslip_amt(payAmt);
					
					finSlipService.deleteKtxIssuMstrSlip(slipVo);
				}
			}
			
			// 2-4) 구매지급신청 마스터 수정
			ComReqVo mstrVo = new ComReqVo();
			mstrVo.setReq_no(rstVo.getReq_no());
			mstrVo.setUnslip_no("");
			mstrVo.setReq_amt(totPayAmt * (-1));
			
			dao.updatePurPayReqMastrForSlip(mstrVo);
			
			// 2-5) 전자증빙 fspevidattach 결의번호 초기화
			FinSpaSlipUpdVo updVo = new FinSpaSlipUpdVo();
			updVo.setReq_no(rstVo.getReq_no());	
			updVo.setUnslip_no("");
			attachService.updateFspEvidAttach(updVo);	
		}
		
		// 3) 잔액정산 삭제
		if(ajstYn){
			depstService.deleteFspRamtAdjst(unslipNo, true);
		}		
		
		// 4) 인터페이스테이블 삭제
		aprComService.delXomxintfatab(unslipNo);
		
		// 5) 전자증빙 삭제로직 (크리스피드)
		EvidAttachVo attachVo = new EvidAttachVo();			
		attachVo.setRqst_no(unslipNo);
		attachService.executeProcess(attachVo);	
	}
	
	/**
    * 가지급금(전도금)신청결의 취소
    * @param String unslipNo, String reqNo
    * @author LeeYH
    * @since 2022.08.02.
    */
	public void deleteFinPayAdvcReqSlipMnt(String unslipNo, String reqNo) throws ElException{
		// 1) 결의서 헤더, 디테일, 관리항목, 송금내역 삭제
		finSlipService.deleteFspSlip(unslipNo);
		
		// 2) 결의서 인터페이스 삭제
		aprComService.delXomxintfatab(unslipNo);
		
		// 3) 가지급금 신청 결의번호 초기화
		dao.updateFspPayAdvcReqDel(reqNo);
		
		// 4) 전자증빙 결의번호 초기화 및 전자증빙 삭제로직 호출 시작(크리스피드 이원길)
		FinSpaSlipUpdVo vo = new FinSpaSlipUpdVo();
		vo.setReq_no(reqNo);
		vo.setUnslip_no("");
		
		vo.setRqst_no(unslipNo);
		attachService.updateFspEvidAttach(vo);
	}
	
	/**
    * 가지급금(전도금)정산 결의 취소
    * @param String unslipNo, String reqNo
    * @author LeeYH
    * @since 2022.08.02.
    */
	public void deleteFinPayAdvcAdjstSlipMnt(String unslipNo, String reqNo) throws ElException{
		// 1) // 정산신청번호로 정산예정계정내역 또는 정산추가계정내역을 조회하여 가지급신청번호와 순번을 찾고, 집행내역테이블의 데이터를 원복시킨다.
		List<ComReqVo> reqList = dao.selectFspPayAdvcAdjstAccntDel(reqNo);
		
		BblenfrcSlipVo enfrcVo = null;
		for(ComReqVo vo : reqList){
			enfrcVo = new BblenfrcSlipVo();
			enfrcVo.setReq_no(vo.getReq_no());
			enfrcVo.setReq_seq(vo.getReq_seq());
			enfrcVo.setUnslip_amt(vo.getReq_amt() * (-1));
			enfrcVo.setUnslip_no("");
			enfrcVo.setPart_all_clsf("");
			
			dao.updateBblenFrcForSlip(enfrcVo);
		}
		
		// 2) 잔액정산 삭제 및 잔액생성 수정
		depstService.deleteFspRamtAdjst(unslipNo, false);
		
		// 3) 결의서 삭제
		finSlipService.deleteFspSlip(unslipNo);
		
		// 4) 결의서 인터페이스 삭제
		aprComService.delXomxintfatab(unslipNo);
		
		// 5) 가지급금정산 결의취소시 가지급정산, 정산예정계정내역, 잔액입금내역, 추가계정 결의번호 초기화
		FinSpaSlipUpdVo vo = new FinSpaSlipUpdVo();
		vo.setReq_no(reqNo);
		
		dao.updateFspPayAdvcAdjstDel(vo);	
		
		// 6) 전자증빙 결의번호 초기화 및 전자증빙 삭제로직 호출 시작(크리스피드 이원길)	
		vo.setUnslip_no("");
		vo.setRqst_no(unslipNo);
		attachService.updateFspEvidAttach(vo);
	}
	
	/**
    * 내부기술지원신청 결의취소
    * @param ComReqVo
    * @author LeeYH
    * @since 2022.08.05.
    */
	public void deleteFinTechSupSlipMnt(ComReqVo vo) throws ElException{
		// 1) 결의서 삭제
		finSlipService.deleteFspSlip(vo.getUnslip_no());
		
		// 2) 결의서 인터페이스 삭제
		aprComService.delXomxintfatab(vo.getUnslip_no());
		
		// 3) 내부기술지원신청헤드, 집행내역 초기화
		dao.updateFspTechSuphDel(vo);
		
		// 4) 전자증빙 결의번호 초기화 및 전자증빙 삭제로직 호출 시작(크리스피드 이원길)	
		FinSpaSlipUpdVo updVo = new FinSpaSlipUpdVo();
		updVo.setReq_no(vo.getReq_no());
		updVo.setUnslip_no("");
		
		updVo.setRqst_no(vo.getUnslip_no());
		attachService.updateFspEvidAttach(updVo);
		
		// S007(총괄목록표)삭제
		FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
		evidVo.setReq_no(vo.getUnslip_no());
		attachService.deleteFspAttchEvid(evidVo);
	}
	
	/**
    * 국내, 해외 출장정산 결의취소
    * @param ComReqVo
    * @author LeeYH
    * @since 2022.08.08.
    */
	public void deleteFinTripAdjstSlipMnt(ComReqVo vo) throws ElException{
		// 1) 결의서 삭제
		finSlipService.deleteFspSlip(vo.getUnslip_no());
		
		// 2) 잔액정산 삭제 및 잔액생성 수정
		depstService.deleteFspRamtAdjst(vo.getUnslip_no(), true);
		
		// 3) 출장 정산 결의번호 초기화
		if("C87".equals(vo.getReq_no().substring(0,3))){ // 국내출장정산관리
			dao.updateCtrDomAdDel(vo);
		}else{
			dao.updateCtrOverAdDel(vo);
		}
		
		// 4) 집행내역 정리
		DelBblEnfrcVo delVo = new DelBblEnfrcVo();
		delVo.setReq_no(vo.getReq_no());
		delVo.setUnslip_no(vo.getUnslip_no());
		delVo.setPart_all_clsf("");
		dao.updateBblenfrcDel(delVo);
		
		// 5) 결의서 인터페이스 삭제
		aprComService.delXomxintfatab(vo.getUnslip_no());
		
		// 6) 전자증빙 결의번호 초기화 및 전자증빙 삭제로직 호출 시작(크리스피드 이원길)	
		FinSpaSlipUpdVo updVo = new FinSpaSlipUpdVo();
		updVo.setReq_no(vo.getReq_no());
		updVo.setUnslip_no("");
		updVo.setRqst_no(vo.getUnslip_no());
		attachService.updateFspEvidAttach(updVo);
	}
	
	/**
    * 연구비 입금결의
    * @param String reqNo, String slipYmd
	* @return String
	* @throws Exception
    * @author LeeYoungHee
    * @since 2023.11.14.
    */
	public String saveDepstReqSlip(String reqNo, String slipYmd) throws KitechException{
		// 결의서 저장을 위한 조회
		List<FinDepstSlipVo> depstList = depstService.selectFcpDepstSlipList(reqNo);
		String rmk = depstList.get(0).getRmk() + "/" + depstList.get(0).getAccnt_no() + ((depstList.size() > 1)? "외 " + (depstList.size() -1) + "건" : "");
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //
		String unslipNo = this.saveUnslipH(slipYmd, rmk, reqNo, "425");
		
		// ==================================================== //
		// 2. 결의서 디테일(차변저장)
		// ==================================================== //
		
		// 2-1.FF030001 계정 - 계정책임자 및 편성단위 조회
		ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk("FF030001");
		
		int seq = -1;
		
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = new FinComSlipVo();

		FspSlipDVo dVo = null;
		String reqNoList = "";
		for(FinDepstSlipVo depstVo : depstList){		
			slipVo.setSlip_ymd(slipYmd);
			
			seq +=2;
			if(seq ==1){
				reqNoList += depstVo.getReq_no();
			}else{
				reqNoList += "," + depstVo.getReq_no();
			}
			
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
			dVo.setRmk_1(depstVo.getDepst_clsf_nm() + "입금(" + depstVo.getAcct_txday() + "," + depstVo.getRmk() + "/" + depstVo.getAccnt_no() + ")");
			
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
			
			// 2-2. fcpdepstreq 에 결의번호 업데이트
			depstService.updateFcpDepstReqUnslipNo(unslipNo, seq, depstVo.getDepst_req_no());	
			
			//=============================================
			//위탁기관 중소벤처기업부 선수금 차변생성
			//=============================================
			seq+= 2;
			if(this.getConsignOrg(depstVo.getAccnt_no())){
				ResDemndSlipVo demndVo = new ResDemndSlipVo();
				demndVo.setUnslip_no(unslipNo);
				demndVo.setReq_ymd(slipYmd);
				demndVo.setSuply_value(depstVo.getSuply_value());
				demndVo.setReq_no(depstVo.getDepst_req_no());
				demndVo.setVend_abbr(depstVo.getVend_abbr());
				demndVo.setReq_psn(depstVo.getReq_psn());
				demndVo.setAccnt_no(depstVo.getAccnt_no());
				demndVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
				demndVo.setFomat_unit(acctmVo.getFomat_unit());
				
				this.createConsignOrgSlip(demndVo, seq);
			}	
			
			// 2-3. 계산서 헤더 수정
			if(StringUtils.isNotBlank(depstVo.getBill_no())){
				depstService.updateFtxBillHUnslipNo(depstVo.getBill_no(), unslipNo);
			}
			
			// 2-4. 신청서단에서 생성된 증빙데이터에 결의번호 입력
			attachService.updateFspEvidAttachUnslipNo(depstVo.getReq_no(), unslipNo, seq);
		}
		
		// 2-5.입금내역확인증 증빙 신규생성
		List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList(depstList.get(0).getReq_no().substring(0,3), "N");
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
		List<FinDepstSlipVo> crVoList = depstService.selectFcpDepstSlipCrList(reqNoList);
		
		seq= 0;
		
		for(FinDepstSlipVo depstVo : crVoList){
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(slipYmd);
			
			seq+= 2;
			
			dVo = new FspSlipDVo();
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);	
			dVo.setJourn_cd("Fn9920");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("2");
			// 기술료, 통근버스급여공제, FBD083 교육비환급 일때는 입금의뢰시의 계정번호를 결의서테이블에 입력
			// 20150205 기숙사비(FBD084) 추가
			if(depstVo.getDepst_clsf().matches("FBD032|FBD033|FBD034|FBD081|FBD083|FBD084")){
				dVo.setAccnt_no(depstVo.getAccnt_no());
			}else{
				dVo.setAccnt_no("FF030001");	
			}
			
			dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
			dVo.setFomat_unit(acctmVo.getFomat_unit());		
			dVo.setAccnt_cd(depstService.getDepstMntAccntCd(depstVo.getDepst_clsf(), depstVo.getAccnt_no(), slipYmd));
			dVo.setExpns_cd("999");	
			if(depstVo.getTaxamt() > 0){
				dVo.setUnslip_amt(depstVo.getSuply_value());
			}else{
				dVo.setUnslip_amt(depstVo.getDepst_liq());
			}
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(depstVo.getDepst_clsf_nm() + "입금/" + depstVo.getAccnt_no());
			
			dVo.setRmk_2(depstVo.getVend_abbr());
			dVo.setReq_no(depstVo.getReq_no());
			
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
			map.put("bill_no", depstVo.getBill_no());
			map.put("occr_ymd", depstVo.getAcct_txday());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
			
			if(depstVo.getTaxamt() > 0){
				slipVo = new FinComSlipVo();
				slipVo.setSlip_ymd(slipYmd);
				
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
				dVo.setRmk_1(depstVo.getRmk() + "/" + depstVo.getAccnt_no());
				dVo.setRmk_2(depstVo.getVend_abbr());
				dVo.setReq_no(depstVo.getReq_no());
				
				slipVo.setSlipDVo(dVo);		
				
				// 관리항목
				map = new HashMap<String,String>();
				map = new HashMap<String,String>();
				map.put("unslip_no", unslipNo);
				map.put("unslip_odr", String.valueOf(seq));		
				map.put("accnt_cd", dVo.getAccnt_cd());
				map.put("base_debit_cr", dVo.getBase_debit_cr());			
				map.put("mngmt_accnt_no", depstVo.getAccnt_no());
				map.put("bill_no", depstVo.getBill_no());
				
				slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
				// 결의생성 호출
				finSlipService.saveAutoSlip(slipVo);				
			}
		}
		
		// 전자증빙 호출(크리스피드)
		EvidAttachVo evidVo = new EvidAttachVo();
		evidVo.setUnslip_no(unslipNo);
		attachService.executeProcess(evidVo);
		
		return unslipNo;
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
    * 잔액생성 Vo setting
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
		
		return ramtVo;
	}
	
	/**
     * 위탁기관 중소벤처기업부 여부
     * @param ResPrjInfoVo
	 * @return boolean
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.26.
     */
	private boolean getConsignOrg(String accntNo) throws KitechException{
		ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk(accntNo);
		
		return "RCA020".equals(acctmVo.getPrj_kind())  
				&& "040000000".equals(acctmVo.getBsns_cd_ofic()) 
				&& "RHA001".equals(acctmVo.getBsns_cd_inout()) 
				&& "FTX001".equals(acctmVo.getTax_cd())
				&& "FAJ005".equals(acctmVo.getCard_use_ex())
				&& acctmVo.getStart_ymd().compareTo("20190301") >= 0;
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

}
