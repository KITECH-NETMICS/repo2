package kr.re.kitech.biz.sup.tec.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.fin.com.dao.FinComDepstReqDAO;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComDepstReqService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.ComReqVo;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FinDepstSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspRamtCreatVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.com.vo.ResBgAcctmVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.sup.tec.dao.SptTecSlipMntDAO;
import kr.re.kitech.biz.sup.tec.service.SptTecSlipMntService;
import kr.re.kitech.biz.sup.tec.vo.ResAdxReqmVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipMntVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipSrcVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @ClassSubJect 기술지원결의생성(S330)
 * @Class Name SptTecSlipMntServiceImpl.java
 * @Description 기술지원결의생성 관련 처리를 담당하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/06/02   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/06/02
 * @version 1
 * @see
 * 
 */
@Service("sptTecSlipMntService")
public class SptTecSlipMntServiceImpl extends EgovAbstractServiceImpl implements SptTecSlipMntService {
	@Resource(name="finSlipSaveService")
	private FinSlipSaveService finSlipService;
	
	@Resource(name="finComService")
	private FinComService finComService;
	
	@Resource(name="finComDepstReqService")
	private FinComDepstReqService depstService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;	
	
	@Resource(name="comDepstReqDAO")
	private FinComDepstReqDAO depstDao;	
	
	@Resource(name="sptTecSlipMntDAO")
	private SptTecSlipMntDAO dao;

	/**
     * 기술지원결의생성 목록조회
     * @param SptTecSrcVo
     * @return List<SptTecDepstVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.02.
     */
	@Override
	public List<SptTecSlipMntVo> selectSptTecSlipMnt(SptTecSlipSrcVo vo) throws KitechException {
		// 완전오픈전 임시 실행
		//dao.insertSptTecRcpddepstTemp2(vo);
		
	    if("RST".equals(vo.getSrc_kind())){ // 성적서
	    	return dao.selectFcpDepstReqRst(vo);
	    }else if("VCR".equals(vo.getSrc_kind())){ // 바우처
	    	return dao.selectSptTecRcptInfoVcr(vo);
	    }else{	    	
	    	return dao.selectFcpDepstReqSlip(vo);
	    }
	}
	
	/**
     * 기술지원 결의생성 헤더 적요
     * @param ResPrjInfoVo
	 * @return boolean
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.26.
     */
	private String getSlipHRmk(String clsf, String rmk, int size) throws KitechException{		
		if("RST".equals(clsf)){ // 성적서발행
			rmk += " 기술지원 성적서 재발행" + ((size ==1)? "" : " 외" + (size-1) + "건");
			
		}else if("VCR".equals(clsf)){ // 바우처
			rmk += " 바우처 발행" + ((size ==1)? "" : " 외" + (size-1) + "건");
		
		}else{ // 기술지원
			rmk += " 기술지원 수수료" + ((size ==1)? "" : " 외" + (size-1) + "건");
		}
		
		return rmk;
	}
	
	/**
     * 기술지원결의생성(기술지원,성적서, 바우처) 영수결의
     * @param SptTecSlipInfoVo
     * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.17.
     */
	public String saveTecRcptDepstSlip(SptTecSlipInfoVo vo) throws Exception{
		
		SptTecSlipSrcVo srcVo = vo.getSrcVo();
		String flag = srcVo.getSrc_kind(); // 성적서 RST, 바우처 VCR, 기술지원 SPT
		
		List<SptTecSlipMntVo> slipList = vo.getSlipList();
		
		List<ComReqVo> reqNoList = new ArrayList<>();
		ComReqVo reqVo = null;
		for(SptTecSlipMntVo slipVo : slipList){
			reqVo = new ComReqVo();
			if(slipVo.getSupt_work_clsf().matches("STG050|STG060")){
				reqVo.setReq_no(slipVo.getTech_supt_req_no());
			}else{
				if("1".equals(slipVo.getDemnd_recv_clsf())){
					reqVo.setReq_no(slipVo.getBill_no());
				}else{
					reqVo.setReq_no(slipVo.getReq_no());
				}
			}
			
			reqNoList.add(reqVo);
		}
		
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //
		FspSlipHVo hVo = vo.getSlipHVo();
		// 1-1) 헤더 적요조회	
		String rmk = dao.selectFtxBilldRmk(slipList.get(0).getBill_no());		
		hVo.setRmk(this.getSlipHRmk(flag, rmk, slipList.size()));
		
		String unslipNo = finSlipService.saveAutoSlipH("", reqNoList, hVo);	
		
		// 1-2) 결재 인터페이스 저장
		apprFuncService.formInit(unslipNo, "F203", KitechContextUtil.getUserId(), rmk);
		
		// ==================================================== //
		// 2. 결의서 디테일
		// ==================================================== //
		// 2-1.FF030001 계정 - 계정책임자 및 편성단위 조회
		ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk("FF030001");
		
		int seq =0;
		if(!"VCR".equals(flag)){
			seq =this.saveSptTecRcptDepstSlip(unslipNo, flag, hVo.getSlip_ymd(), acctmVo, slipList);
			
		}else{ // 바우처인 경우 대변만 생성
			for(SptTecSlipMntVo mntVo : slipList){
				seq = this.saveTecSuptSlipCr(unslipNo, seq, hVo.getSlip_ymd(), mntVo, acctmVo);
				
				// spttecrcptinfo에 결의번호 업데이트
				mntVo.setPrcs_state("STE070");
				mntVo.setUnslip_no(unslipNo);
				mntVo.setUnslip_odr(seq);
				
				dao.updateSptTecRcptInfoUnslipNoVcr(mntVo);
			}
		}
		
		// ==================================================== //
		// 3. 전자증빙
		// ==================================================== //
		// 기술지원수수료내역, 입금내역확인증
		FbaExpnsEvidVo paramVo = new FbaExpnsEvidVo();
		paramVo.setDoc_id(hVo.getSlip_typ_cd());
		paramVo.setClsf(slipList.get(0).getTax_cd());
		List<FspEvidAttachVo> evidList = attachService.selectFbaExpnsEvidList(paramVo);
		
		for(FspEvidAttachVo attachVo : evidList){
			attachVo.setReq_no(unslipNo);
			attachVo.setUnslip_no(unslipNo);
			attachVo.setUnslip_odr(seq);
			attachVo.setKey_val(unslipNo + "," + flag);
		}
		attachService.saveFspEvidAttach(evidList);
		
		// 전자증빙 호출(크리스피드)
		EvidAttachVo evidVo = new EvidAttachVo();
		evidVo.setUnslip_no(unslipNo);
		attachService.executeProcess(evidVo);
		
		// ==================================================== //
		// 4. 통합프로세스 종료
		// ==================================================== //
		if(!"RST".equals(flag)){
			List<String> techNoList = dao.selectTechSuptReqNoByBill(unslipNo);
			AprVo aprVo = null;
			for(String reqNo : techNoList){
				aprVo = new AprVo();
				aprVo.setLoginUserId(KitechContextUtil.getUserId());
				aprVo.setReporterId(KitechContextUtil.getSyspayno());
				aprVo.setEndpoint(KitechContextUtil.getUserId());
				aprVo.setMainKey(reqNo);
				aprVo.setReqNo(reqNo);
				aprVo.setUiId("S330");
				aprVo.setBiz(true);
				
				apprFuncService.formAccept(aprVo);
			}
		}
				
		return unslipNo;
	}
	
	/**
     * 기술지원결의생성
     * @param SptTecSlipInfoVo
     * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.17.
     */
	private int saveSptTecRcptDepstSlip(String unslipNo,  String flag, String slipYmd, ResBgAcctmVo acctmVo, List<SptTecSlipMntVo> slipList) throws KitechException{		
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = new FinComSlipVo();

		FspSlipDVo dVo = null;	
		int seq = 0;
		for(SptTecSlipMntVo mntVo : slipList){
			// ==================================================== //
			// 2-1. 결의서 디테일(차변저장)
			// ==================================================== //
			slipVo.setSlip_ymd(slipYmd);
			
			seq++;
			
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
			dVo.setUnslip_amt(mntVo.getDepst_liq());
			
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(mntVo.getRmk_1());
			dVo.setRmk_2(mntVo.getVend_nm());
			if("1".equals(mntVo.getDemnd_recv_clsf())){
				dVo.setReq_no(mntVo.getBill_no());
			}else{
				dVo.setReq_no(mntVo.getReq_no());
			}
			dVo.setOccr_slip_no(mntVo.getSlip_no());
			dVo.setOccr_slip_odr(mntVo.getSlip_odr());
			dVo.setBill_no(mntVo.getBill_no());
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			Map<String, String> map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());			
			map.put("bankaccnt_no", mntVo.getBankaccnt_no());
			map.put("occr_ymd", mntVo.getDepst_ymd());
			map.put("mngmt_2060_nm", mntVo.getVend_nm());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 잔액정산
			slipVo.setRamtVo(this.setRamtCreat(dVo));
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
			
			// fcpdepstreq 에 결의번호 업데이트
			depstService.updateFcpDepstReqUnslipNo(unslipNo, seq, mntVo.getReq_no());	
				
		} // end for
		
		// ==================================================== //
		// 2-2. 결의서 디테일(대변저장)
		// ==================================================== //
		// 대변생성을 위한 조회		
		List<SptTecSlipMntVo> slipCrList = dao.selectFcpDepstReqForSlipCr(unslipNo);
		if(slipCrList == null || slipCrList.size() == 0){
			throw new KitechException(Exceptions.ALERT, Business.SUP, "대변생성내역이 존재하지 않습니다.관리자에게 문의바랍니다.");
		}
		
		for(SptTecSlipMntVo mntVo : slipCrList){
			if(mntVo.getTotl_amt() != mntVo.getDepst_liq()){
				throw new KitechException(Exceptions.ALERT, Business.SUP, "message.alert.spt.tec.0002", new String[]{String.valueOf(mntVo.getTotl_amt()), String.valueOf(mntVo.getDepst_liq())});
			}
			// 대변생성
			seq = this.saveTecSuptSlipCr(unslipNo, seq, slipYmd, mntVo, acctmVo);
			
			// 2-3. 계산서 결의번호 업데이트	
			depstService.updateFtxBillHUnslipNo(mntVo.getBill_no(), unslipNo);	
			
			// 2-4. spttecrcptinfo 결의번호 업데이트	
			mntVo.setUnslip_no(unslipNo);
			mntVo.setUnslip_odr(seq);
			
			if("RST".equals(flag)){ // 성적서재발행
				dao.updateSptRstBookUnslipNo(mntVo);
			}else{				
				mntVo.setPrcs_state("STE070");
				dao.updateSptTecRcptInfoUnslipNo(mntVo);	
			}
		}
		
		return seq;
	}	
	
	/**
     * 기술지원 결의 대변생성
     * @param ResPrjInfoVo
	 * @return boolean
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.26.
     */
	private int saveTecSuptSlipCr(String unslipNo, int seq, String slipYmd, SptTecSlipMntVo mntVo, ResBgAcctmVo acctmVo) throws KitechException{		
		//-------------------------------------------
		// 1) 대변생성
		//-------------------------------------------
		FinComSlipVo slipVo = new FinComSlipVo();
		slipVo.setSlip_ymd(slipYmd);
			
		seq++;
			
		FspSlipDVo dVo = new FspSlipDVo();
		dVo.setUnslip_no(unslipNo);
		dVo.setUnslip_odr(seq);	
		dVo.setJourn_cd("Fn9920");
		dVo.setJourn_odr(seq);
		dVo.setBase_debit_cr("2");
		dVo.setAccnt_no(mntVo.getAccnt_no());	
		dVo.setAccnt_rspns(mntVo.getAccnt_rspns());
		dVo.setFomat_unit(mntVo.getFomat_unit());	
		AppLog.debug("\n -------------------------- depst_clsf : " + mntVo.getDepst_clsf());
		String accntCd = depstService.getDepstMntAccntCd(mntVo.getDepst_clsf(), mntVo.getAccnt_no(), slipYmd);
		dVo.setAccnt_cd(accntCd);
		dVo.setExpns_cd("999");	
		
		long unslipAmt = (mntVo.getTaxamt() > 0)? mntVo.getSuply_value() : mntVo.getTotl_amt();
				
		long hcfUnslipAmt = 0L;
		ResAdxReqmVo reqmVo = null;
		if("SRP010".equals(mntVo.getSrpt_cd())){ // SRP010	경상비지원
			reqmVo = new ResAdxReqmVo();
			reqmVo.setSlip_ymd(slipYmd);
			reqmVo.setTax_cd(mntVo.getTax_cd());
			reqmVo.setDivsn_clsf(mntVo.getDivsn_clsf());
			
			reqmVo = dao.selectResAdxReqm(reqmVo);
			if(reqmVo == null || reqmVo.getAccnt_no() == null){
				throw new KitechException(Exceptions.ALERT, Business.SUP, "message.alert.spt.tec.0001", new String[]{mntVo.getAccnt_no()});
			}
			
			String rate = reqmVo.getMngmt_item_1();
			hcfUnslipAmt = Math.round(unslipAmt * Float.parseFloat(rate) / 100);
			unslipAmt = unslipAmt - hcfUnslipAmt;				
		}
		
		dVo.setTotal_amt(unslipAmt + mntVo.getTaxamt());
		dVo.setUnslip_amt(unslipAmt);
		dVo.setTax_amt(mntVo.getTaxamt());
		
		dVo.setEvid_cd("FAH999");
		dVo.setRmk_1(mntVo.getRmk_1());
		dVo.setRmk_2(mntVo.getVend_nm());
		if(mntVo.getSupt_work_clsf() != null && mntVo.getSupt_work_clsf().matches("STG050|STG060")){ // 바우처
			dVo.setReq_no(mntVo.getTech_supt_req_no());
		}
		
		slipVo.setSlipDVo(dVo);		
		
		// 관리항목
		Map<String, String> map = new HashMap<String,String>();
		map.put("unslip_no", unslipNo);
		map.put("unslip_odr", String.valueOf(seq));		
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("base_debit_cr", dVo.getBase_debit_cr());			
		map.put("mngmt_accnt_no", mntVo.getAccnt_no());
		map.put("mngmt_2060_nm", mntVo.getVend_nm());	
		map.put("bill_no", mntVo.getBill_no());
		map.put("relat_no", mntVo.getAccnt_rspns().substring(2,8));
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
		// 결의생성 호출
		finSlipService.saveAutoSlip(slipVo);
		
		//-------------------------------------------
		// 2) 대변생성(경상비 흡수)
		//-------------------------------------------
		if("SRP010".equals(mntVo.getSrpt_cd())){ // SRP010	경상비지원
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(slipYmd);
			
			seq++;
			
			dVo = new FspSlipDVo();
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);	
			dVo.setJourn_cd("Fn9920");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("2");
			dVo.setAccnt_no(reqmVo.getAccnt_no());	
			dVo.setAccnt_rspns(reqmVo.getAccnt_rspns());
			dVo.setFomat_unit(reqmVo.getFomat_unit());	
			dVo.setAccnt_cd(accntCd);
			dVo.setExpns_cd("999");	
			dVo.setTotal_amt(hcfUnslipAmt);
			dVo.setUnslip_amt(hcfUnslipAmt);
			
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(mntVo.getRmk_1());
			dVo.setRmk_2(mntVo.getVend_nm());
			if(mntVo.getSupt_work_clsf() != null && mntVo.getSupt_work_clsf().matches("STG050|STG060")){ // 바우처
				dVo.setReq_no(mntVo.getTech_supt_req_no());
			}
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());			
			map.put("mngmt_accnt_no", reqmVo.getAccnt_no());
			if(mntVo.getSupt_work_clsf() != null && mntVo.getSupt_work_clsf().matches("STG050|STG060")){
				map.put("mngmt_2060_nm", mntVo.getAccnt_no());	
			}else{
				map.put("mngmt_2060_nm", "운영비흡수" + "(" + mntVo.getAccnt_no() + ")");	
			}
			
			map.put("bill_no", mntVo.getBill_no());
			map.put("relat_no", mntVo.getAccnt_rspns().substring(2,8));
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
		}
		
		//-------------------------------------------
		// 3) 대변생성(부가세)
		//-------------------------------------------
		if(mntVo.getTaxamt() > 0){
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(slipYmd);
			
			seq++;
			
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
			dVo.setUnslip_amt(mntVo.getTaxamt());
			
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(mntVo.getRmk_1());
			dVo.setRmk_2(mntVo.getVend_nm());
			if(mntVo.getSupt_work_clsf() != null && mntVo.getSupt_work_clsf().matches("STG050|STG060")){ // 바우처
				dVo.setReq_no(mntVo.getTech_supt_req_no());
			}
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			map = new HashMap<String,String>();
			map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());			
			map.put("mngmt_accnt_no", mntVo.getAccnt_no());
			map.put("bill_no", mntVo.getBill_no());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);				
		}
		
		return seq;
	}
	
	/**
    * 기업지원 잔액생성 Vo setting
    * @param FspSlipDVo
    * @return FspRamtCreatVo
	* @throws Exception
    * @author LeeYH
    * @since 2023.07.26.
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
		ramtVo.setBefore_amt(0);
		ramtVo.setRmk_1(vo.getRmk_1());
		ramtVo.setRmk_2(vo.getRmk_2());
		ramtVo.setSlip_no(vo.getOccr_slip_no());
		ramtVo.setSlip_odr(vo.getOccr_slip_odr());
		
		return ramtVo;
	}
	
	/**
    * 기술지원 영수결의 삭제
    * @param FspSlipDVo
	* @throws Exception
    * @author LeeYH
    * @since 2023.07.21.
    */
	public void deleteSptTecDepstSlip(SptTecSlipSrcVo vo) throws KitechException{
		String unslipNo = vo.getUnslip_no();
		// 자동결의외에 수정된 건이 있는지 조사(분개코드(Fn9910, Fn9920)외의 건수구하기)
		finSlipService.selectAutoSlipCnt(unslipNo);
		
		// 1) 결의서 삭제
		finSlipService.deleteFspSlip(unslipNo);
		
		// 2) 잔액정산 삭제, 잔액생성 수정, 계산서 업데이트, fcpdepstreq 결의번호 초기화
		depstService.deleteFspRamtAdjst(unslipNo, true);			
		
		// 3) 기술지원접수정보 결의번호 초기화
		if("RST".equals(vo.getSrc_kind())){
			dao.updateSptRstBookSlipDel(vo);
		}else{
			if("VCR".equals(vo.getSrc_kind())){
				// 바우처의경우 영수결의 단계로
				vo.setPrcs_state("STE070");
			}else{
				vo.setPrcs_state("STE060");
			}
			
			dao.updateSptTecRcptInfoSlipDel(vo);
		}
		
		// 4) 입금내역확인증,기술지원수수료내역 증빙 및 크리스피드 전자증빙 삭제
		FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
		evidVo.setReq_no(unslipNo);
		evidVo.setRqst_no(unslipNo); // 크리스피드 전자증빙삭제
		attachService.deleteFspAttchEvid(evidVo);
		
		// 5) xomxintfatab 결의결재상태 테이블 삭제
		apprFuncService.formRemove(unslipNo);
	}
	
	/**
    * 기술지원 청구결의 생성
    * @param SptTecSlipInfoVo
	* @return String unslipNo
	* @throws Exception
    * @author LeeYH
    * @since 2023.07.21.
    */
	public String saveTecRcptDemndSlip(SptTecSlipInfoVo vo) throws Exception{
		SptTecSlipSrcVo srcVo = vo.getSrcVo();
		String flag = srcVo.getSrc_kind(); // 성적서 RST, 바우처 VCR, 기술지원 SPT
		
		List<SptTecSlipMntVo> slipList = vo.getSlipList();
		
		List<ComReqVo> reqNoList = new ArrayList<>();
		ComReqVo reqVo = null;
		for(SptTecSlipMntVo slipVo : slipList){
			reqVo = new ComReqVo();
			reqVo.setReq_no(slipVo.getBill_no());
			
			reqNoList.add(reqVo);
		}
		
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //
		FspSlipHVo hVo = vo.getSlipHVo();
		// 1-1) 헤더 적요조회	
		String rmk = dao.selectFtxBilldRmk(slipList.get(0).getBill_no());		
		int size = slipList.size();
		if("RST".equals(flag)){ // 성적서발행
			rmk += " 기술지원 성적서 재발행/" + slipList.get(0).getAccnt_no() + ((size ==1)? "" : " 외" + (size-1) + "건");
			
		}else{ // 기술지원
			rmk += " 기술지원 수수료/" + slipList.get(0).getAccnt_no() + ((size ==1)? "" : " 외" + (size-1) + "건");
		}	
		
		hVo.setRmk(rmk);
		
		String unslipNo = finSlipService.saveAutoSlipH("", reqNoList, hVo);	
		
		// 1-2) 결재 인터페이스 저장
		apprFuncService.formInit(unslipNo, "F203", KitechContextUtil.getUserId(), rmk);
		
		// ==================================================== //
		// 2. 결의서 디테일
		// ==================================================== //
		// 2-1.FF030001 계정 - 계정책임자 및 편성단위 조회
		ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk("FF030001");
		
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = new FinComSlipVo();

		FspSlipDVo dVo = null;	
		int seq = 0;
		
		for(SptTecSlipMntVo mntVo : slipList){
			if(mntVo.getTotl_amt() != (mntVo.getSuply_value() + mntVo.getTaxamt())){
				throw new KitechException(Exceptions.ALERT, Business.SUP, "message.alert.res.exc.0002");
			}			
			// ==================================================== //
			// 2-1. 결의서 디테일(차변저장)
			// ==================================================== //
			slipVo.setSlip_ymd(hVo.getSlip_ymd());			
			seq++;
			
			dVo = new FspSlipDVo();
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);	
			dVo.setJourn_cd("Fn9910");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("1");
			dVo.setAccnt_no("FF030001");
			dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
			dVo.setFomat_unit(acctmVo.getFomat_unit());
			dVo.setAccnt_cd("11117020"); //  회계코드(미수기술지원사업비)
			dVo.setExpns_cd("999");
			dVo.setUnslip_amt(mntVo.getTotl_amt());
			
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(mntVo.getRmk_1());
			dVo.setRmk_2(mntVo.getVend_nm());
			dVo.setReq_no(mntVo.getBill_no());
			dVo.setRegst_req_psn(mntVo.getWrte_psn());
			dVo.setBill_no(mntVo.getBill_no());
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			Map<String, String> map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());			
			map.put("vend_cd", mntVo.getVend_cd());
			map.put("vend_nm", mntVo.getVend_nm());
			map.put("bill_no", mntVo.getBill_no());
			map.put("mngmt_accnt_no", mntVo.getAccnt_no());
			map.put("occr_ymd", mntVo.getIssu_ymd());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
			
			// 계산서 결의번호 업데이트	
			depstService.updateFtxBillHUnslipNo(mntVo.getBill_no(), unslipNo);	
			
			mntVo.setUnslip_no(unslipNo);
			mntVo.setUnslip_odr(seq);
			if("RST".equals(flag)){ // 성적서재발행
				dao.updateSptRstBookUnslipNo(mntVo);
			}else{				
				mntVo.setPrcs_state("STE080"); // 청구결의
				dao.updateSptTecRcptInfoUnslipNo(mntVo);	
			}
			
			// 청구결의 후 미수정산내역 입력
			dao.insertFinUnPaidAdjst(mntVo);
			
			// ==================================================== //
			// 2-2. 결의서 디테일(대변저장)
			// ==================================================== //
			slipVo = new FinComSlipVo();
			
			slipVo.setSlip_ymd(hVo.getSlip_ymd());			
			seq++;
			
			dVo = new FspSlipDVo();
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);	
			dVo.setJourn_cd("Fn9920");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("2");
			dVo.setAccnt_no(mntVo.getAccnt_no());
			dVo.setAccnt_rspns(mntVo.getAccnt_rspns());
			dVo.setFomat_unit(mntVo.getFomat_unit());
			String accntCd = depstService.getDepstMntAccntCd(mntVo.getDepst_clsf(), mntVo.getAccnt_no(), hVo.getSlip_ymd());
			dVo.setAccnt_cd(accntCd); 
			dVo.setExpns_cd("999");
			
			long unslipAmt = (mntVo.getTaxamt() > 0)? mntVo.getSuply_value() : mntVo.getTotl_amt();
				
			long hcfUnslipAmt = 0L;
			ResAdxReqmVo reqmVo = null;
			if("SRP010".equals(mntVo.getSrpt_cd())){ // SRP010	경상비지원
				reqmVo = new ResAdxReqmVo();
				reqmVo.setSlip_ymd(hVo.getSlip_ymd());
				reqmVo.setTax_cd(mntVo.getTax_cd());
				reqmVo.setDivsn_clsf(mntVo.getDivsn_clsf());
				
				reqmVo = dao.selectResAdxReqm(reqmVo);
				if(reqmVo == null || reqmVo.getAccnt_no() == null){
					throw new KitechException(Exceptions.ALERT, Business.SUP, "message.alert.spt.tec.0001", new String[]{mntVo.getAccnt_no()});
				}
				
				String rate = reqmVo.getMngmt_item_1();
				hcfUnslipAmt = Math.round(unslipAmt * Float.parseFloat(rate) / 100);
				unslipAmt = unslipAmt - hcfUnslipAmt;				
			}
			
			dVo.setTotal_amt(unslipAmt + mntVo.getTaxamt());
			dVo.setUnslip_amt(unslipAmt);
			dVo.setTax_amt(mntVo.getTaxamt());
			
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(mntVo.getRmk_1());
			dVo.setRmk_2(mntVo.getVend_nm());
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());			
			map.put("mngmt_accnt_no", mntVo.getAccnt_no());
			//map.put("mngmt_2060_nm", mntVo.getVend_nm());	
			map.put("bill_no", mntVo.getBill_no());
			map.put("relat_no", mntVo.getAccnt_rspns().substring(2,8));
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
			
			//-------------------------------------------
			// 2) 대변생성(경상비 흡수)
			//-------------------------------------------
			if("SRP010".equals(mntVo.getSrpt_cd())){ // SRP010	경상비지원
				slipVo = new FinComSlipVo();
				slipVo.setSlip_ymd(hVo.getSlip_ymd());
				
				seq++;
				
				dVo = new FspSlipDVo();
				dVo.setUnslip_no(unslipNo);
				dVo.setUnslip_odr(seq);	
				dVo.setJourn_cd("Fn9920");
				dVo.setJourn_odr(seq);
				dVo.setBase_debit_cr("2");
				dVo.setAccnt_no(reqmVo.getAccnt_no());	
				dVo.setAccnt_rspns(reqmVo.getAccnt_rspns());
				dVo.setFomat_unit(reqmVo.getFomat_unit());	
				dVo.setAccnt_cd(accntCd);
				dVo.setExpns_cd("999");	
				dVo.setTotal_amt(hcfUnslipAmt);
				dVo.setUnslip_amt(hcfUnslipAmt);
				
				dVo.setEvid_cd("FAH999");
				dVo.setRmk_1(mntVo.getRmk_1());
				dVo.setRmk_2(mntVo.getVend_nm());
				dVo.setReq_no(mntVo.getTech_supt_req_no());
				
				slipVo.setSlipDVo(dVo);		
				
				// 관리항목
				map = new HashMap<String,String>();
				map.put("unslip_no", unslipNo);
				map.put("unslip_odr", String.valueOf(seq));		
				map.put("accnt_cd", dVo.getAccnt_cd());
				map.put("base_debit_cr", dVo.getBase_debit_cr());			
				map.put("mngmt_accnt_no", reqmVo.getAccnt_no());
				map.put("mngmt_2060_nm", "운영비흡수" + "(" + mntVo.getAccnt_no() + ")"); // 원계정입력			
				map.put("bill_no", mntVo.getBill_no());
				map.put("relat_no", mntVo.getAccnt_rspns().substring(2,8));
				
				slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
				
				// 결의생성 호출
				finSlipService.saveAutoSlip(slipVo);
			}
			
			//-------------------------------------------
			// 3) 대변생성(부가세)
			//-------------------------------------------
			if(mntVo.getTaxamt() > 0){
				slipVo = new FinComSlipVo();
				slipVo.setSlip_ymd(hVo.getSlip_ymd());
				
				seq++;
				
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
				dVo.setUnslip_amt(mntVo.getTaxamt());
				
				dVo.setEvid_cd("FAH999");
				dVo.setRmk_1(mntVo.getRmk_1());
				dVo.setRmk_2(mntVo.getVend_nm());
				
				slipVo.setSlipDVo(dVo);		
				
				// 관리항목
				map = new HashMap<String,String>();
				map = new HashMap<String,String>();
				map.put("unslip_no", unslipNo);
				map.put("unslip_odr", String.valueOf(seq));		
				map.put("accnt_cd", dVo.getAccnt_cd());
				map.put("base_debit_cr", dVo.getBase_debit_cr());			
				map.put("mngmt_accnt_no", mntVo.getAccnt_no());
				map.put("bill_no", mntVo.getBill_no());
				
				slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
				// 결의생성 호출
				finSlipService.saveAutoSlip(slipVo);				
			}
		} // end for
		
		// ==================================================== //
		// 3. 전자증빙
		// ==================================================== //
		FbaExpnsEvidVo paramVo = new FbaExpnsEvidVo();
		paramVo.setDoc_id(hVo.getSlip_typ_cd());
		paramVo.setClsf(slipList.get(0).getTax_cd());
		List<FspEvidAttachVo> evidList = attachService.selectFbaExpnsEvidList(paramVo);
		// 기술지원수수료내역
		for(FspEvidAttachVo attachVo : evidList){
			attachVo.setReq_no(unslipNo);
			attachVo.setUnslip_no(unslipNo);
			attachVo.setUnslip_odr(1);
			attachVo.setKey_val(unslipNo);
		}
		attachService.saveFspEvidAttach(evidList);
		
		// 전자증빙 호출(크리스피드)
		EvidAttachVo evidVo = new EvidAttachVo();
		evidVo.setUnslip_no(unslipNo);
		attachService.executeProcess(evidVo);
		
		// ==================================================== //
		// 4. 통합프로세스 종료
		// ==================================================== //
		if(!"RST".equals(flag)){
			List<String> techNoList = dao.selectTechSuptReqNoByBill(unslipNo);
			AprVo aprVo = null;
			for(String reqNo : techNoList){
				aprVo = new AprVo();
				aprVo.setLoginUserId(KitechContextUtil.getUserId());
				aprVo.setReporterId(KitechContextUtil.getSyspayno());
				aprVo.setEndpoint(KitechContextUtil.getUserId());
				aprVo.setMainKey(reqNo);
				aprVo.setReqNo(reqNo);
				aprVo.setUiId("S330");
				aprVo.setBiz(true);
				
				apprFuncService.formAccept(aprVo);
			}
		}
		
		return unslipNo;
	}
	
	/**
    * 기술지원 청구결의 삭제
    * @param FspSlipDVo
	* @throws Exception
    * @author LeeYH
    * @since 2023.07.21.
    */
	public void deleteSptTecDemndSlip(SptTecSlipSrcVo vo) throws KitechException{
		String unslipNo = vo.getUnslip_no();
		// 자동결의외에 수정된 건이 있는지 조사(분개코드(Fn9910, Fn9920)외의 건수구하기)
		finSlipService.selectAutoSlipCnt(unslipNo);
		
		// 1) 결의서 삭제
		finSlipService.deleteFspSlip(unslipNo);				
		
		// 2) 기술지원접수정보 결의번호 초기화
		if("RST".equals(vo.getSrc_kind())){
			dao.updateSptRstBookSlipDel(vo);
		}else{
			vo.setPrcs_state("STE060");
			
			dao.updateSptTecRcptInfoSlipDel(vo);
		}
		
		// 3) 계산서헤더테이블의 결의번호 삭제
		FinSpaSlipUpdVo updVo = new FinSpaSlipUpdVo();
		updVo.setUnslip_no(unslipNo);
		depstDao.updateFtxBillHDel(updVo);
		
		// 4) 미수정산 테이블(finunpaidadjst) 삭제
		dao.deleteFinUnpaidAdjst(vo.getUnslip_no());
		
		// 5) 기술지원수수료내역 증빙 및 크리스피드 전자증빙 삭제
		FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
		evidVo.setReq_no(unslipNo);
		evidVo.setRqst_no(unslipNo); // 크리스피드 전자증빙삭제
		attachService.deleteFspAttchEvid(evidVo);
		
		// 6) xomxintfatab 결의결재상태 테이블 삭제
		apprFuncService.formRemove(unslipNo);
	}
	
	/**
     * 미수수탁 정산결의 목록 조회
     * @param SptTecSlipSrcVo
     * @return List<SptTecAdjstSlipVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.26.
     */
	public List<SptTecAdjstSlipVo> selectFinUnPaidAdjst(SptTecSlipSrcVo vo) throws KitechException{
		// 완전오픈전 데이터 입력쿼리 실행
		//dao.insertSptTecRcpddepstTemp(vo);
		return dao.selectFinUnPaidAdjst(vo);
	}
	
	/**
    * 기술지원 미수수탁결의생성
    * @param SptTecSlipInfoVo
	* @return String unslipNo
	* @throws Exception
    * @author LeeYH
    * @since 2023.07.26.
    */
	public String saveTecRcptRepaySlip(SptTecSlipInfoVo vo) throws KitechException{		
		List<SptTecAdjstSlipVo> slipList = vo.getAdjstList();
		
		List<ComReqVo> reqNoList = new ArrayList<>();
		ComReqVo reqVo = null;
		for(SptTecAdjstSlipVo slipVo : slipList){
			reqVo = new ComReqVo();
			reqVo.setReq_no(slipVo.getDepst_req_no());
			
			reqNoList.add(reqVo);
		}
		
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //
		FspSlipHVo hVo = vo.getSlipHVo();
		int size = slipList.size();
		// 1-1) 헤더 적요조회	
		String rmk = slipList.get(0).getRmk_1() + " " + hVo.getRmk() + "/" + slipList.get(0).getAccnt_no() + ((size ==1)? "" : " 외" + (size-1) + "건");		
		hVo.setRmk(rmk);
		
		String unslipNo = finSlipService.saveAutoSlipH("", reqNoList, hVo);	
		
		// 1-2) 결재 인터페이스 저장
		apprFuncService.formInit(unslipNo, "F203", KitechContextUtil.getUserId(), rmk);
		
		// ==================================================== //
		// 2. 결의서 디테일
		// ==================================================== //
		// 2-1.FF030001 계정 - 계정책임자 및 편성단위 조회
		ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk("FF030001");
		
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = new FinComSlipVo();

		FspSlipDVo dVo = null;	
		int seq = 0;
		
		for(SptTecAdjstSlipVo mntVo : slipList){
			// ==================================================== //
			// 2-2. 결의서 디테일(차변저장) - 차변과 대변 관계는 N:1
			// ==================================================== //
			// 차변 저장을 위한 조회
			List<FinDepstSlipVo> depstList = dao.selectSptTecRcptDepstForDr(mntVo.getDepst_req_no());
			
			for(FinDepstSlipVo depstVo : depstList){
				slipVo.setSlip_ymd(hVo.getSlip_ymd());			
				seq++;
				
				dVo = new FspSlipDVo();
				dVo.setUnslip_no(unslipNo);
				dVo.setUnslip_odr(seq);	
				dVo.setJourn_cd("Fn9910");
				dVo.setJourn_odr(seq);
				dVo.setBase_debit_cr("1");
				dVo.setAccnt_no("FF030001");
				dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
				dVo.setFomat_unit(acctmVo.getFomat_unit());
				dVo.setAccnt_cd("21017911"); //  회계코드(온라인 가수)
				dVo.setExpns_cd("999");
				dVo.setUnslip_amt(depstVo.getDepst_liq());
				
				dVo.setEvid_cd("FAH999");
				dVo.setRmk_1(mntVo.getRmk_1() + " " + hVo.getRmk() + "/" + depstVo.getAccnt_no());
				dVo.setRmk_2(depstVo.getVend_abbr());
				dVo.setReq_no(depstVo.getReq_no());
				dVo.setRegst_req_psn(depstVo.getReq_psn());
				dVo.setOccr_slip_no(depstVo.getSlip_no());
				dVo.setOccr_slip_odr(depstVo.getSlip_odr());
				
				slipVo.setSlipDVo(dVo);		
				
				// 관리항목
				Map<String, String> map = new HashMap<String,String>();
				map.put("unslip_no", unslipNo);
				map.put("unslip_odr", String.valueOf(seq));		
				map.put("accnt_cd", dVo.getAccnt_cd());
				map.put("base_debit_cr", dVo.getBase_debit_cr());
				map.put("bankaccnt_no", depstVo.getBankaccnt_no());
				map.put("mngmt_2060_nm", depstVo.getAccnt_no());
				map.put("occr_ymd", depstVo.getAcct_txday());
				
				slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
				
				// 잔액정산
				slipVo.setRamtVo(this.setRamtCreat(dVo));
				
				// 결의생성 호출
				finSlipService.saveAutoSlip(slipVo);	
				
				// fcpdepstreq 에 결의번호 업데이트
				depstService.updateFcpDepstReqUnslipNo(unslipNo, seq, depstVo.getReq_no());					
			}
			
			// 2-4) 전자증빙
			List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList("427","");
			if(attachList != null && attachList.size() > 0){
				for(FspEvidAttachVo attachVo : attachList){
					attachVo.setReq_no(unslipNo);
					attachVo.setUnslip_no(unslipNo);
					// accnt_cd,accnt_no,start_ymd,end_ymd,ramt_mngmt(2023.12.08. 추가)
					attachVo.setKey_val("11117020," + slipList.get(0).getAccnt_no() + "," + slipList.get(0).getAccnt_ymd() + "," + slipList.get(0).getAccnt_ymd() + "," + slipList.get(0).getAccnt_no());	
				}
				
				attachService.saveFspEvidAttach(attachList);
			}
						
			// 정산결의 후 미수정산내역 수정
			FinSpaSlipUpdVo updVo = new FinSpaSlipUpdVo();
			updVo.setUnslip_no(unslipNo);
			updVo.setUnslip_odr(seq);
			updVo.setChrg_unslip_no(mntVo.getChrg_unslip_no());
			updVo.setChrg_unslip_odr(mntVo.getChrg_unslip_odr());
			dao.updateFinUnpaidAdjstSlipNo(updVo);			
			
			// ==================================================== //
			// 2-2. 결의서 디테일(대변저장)
			// ==================================================== //
			slipVo = new FinComSlipVo();
			
			slipVo.setSlip_ymd(hVo.getSlip_ymd());			
			seq++;
			
			dVo = new FspSlipDVo();
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);	
			dVo.setJourn_cd("Fn9920");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("2");
			dVo.setAccnt_no("FF030001");
			dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
			dVo.setFomat_unit(acctmVo.getFomat_unit());
			dVo.setAccnt_cd("11117020"); 
			dVo.setExpns_cd("999");	
			dVo.setUnslip_amt(mntVo.getDepst_liq());
			
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(mntVo.getRmk_1() + " " + hVo.getRmk() + "/" + mntVo.getAccnt_no());
			dVo.setRmk_2(mntVo.getVend_nm());
			dVo.setOccr_slip_no(mntVo.getSlip_no());
			dVo.setOccr_slip_odr(mntVo.getSlip_odr());
			dVo.setBill_no(mntVo.getBill_no());
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			Map<String, String> map = new HashMap<String,String>();
			map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());			
			map.put("mngmt_accnt_no", mntVo.getAccnt_no());
			map.put("mngmt_2060_nm", mntVo.getVend_nm());	
			map.put("vend_cd", mntVo.getVend_cd());
			map.put("bill_no", mntVo.getBill_no());
			map.put("occr_ymd", mntVo.getDepst_ymd());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 잔액정산
			slipVo.setRamtVo(this.setRamtCreat(dVo));
			slipVo.getRamtVo().setUnslip_repay_upd_yn(false);
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
			
		} // end for
		
		// ==================================================== //
		// 3. 전자증빙
		// ==================================================== //
		List<FspEvidAttachVo> evidList = attachService.selectFbaExpnsEvidList("427", "N");
		// 청구반제입금내역확인증
		for(FspEvidAttachVo attachVo : evidList){
			attachVo.setReq_no(unslipNo);
			attachVo.setUnslip_no(unslipNo);
			attachVo.setUnslip_odr(seq);
			attachVo.setKey_val(unslipNo);
		}
		attachService.saveFspEvidAttach(evidList);
		
		// 전자증빙 호출(크리스피드)
		EvidAttachVo evidVo = new EvidAttachVo();
		evidVo.setUnslip_no(unslipNo);
		attachService.executeProcess(evidVo);		
		
		return unslipNo;
	}
	
	/**
    * 기술지원 미수수탁결의 취소
    * @param SptTecSlipSrcVo
	* @throws Exception
    * @author LeeYH
    * @since 2023.07.27.
    */
	public void deleteTecRcptRepaySlip(SptTecSlipSrcVo vo) throws KitechException{
		String unslipNo = vo.getUnslip_no();
		
		// 자동결의외에 수정된 건이 있는지 조사(분개코드(Fn9910, Fn9920)외의 건수구하기)
		finSlipService.selectAutoSlipCnt(unslipNo);
		
		// 1) 결의서 삭제
		finSlipService.deleteFspSlip(unslipNo);
		
		// 2) 잔액정산 삭제, 잔액생성 수정 - fspramtcreat.won_adjst_amt 초기화
		depstService.deleteFspRamtAdjst(unslipNo, true);	
		
		// 3) finunpaidadjst 에서 정산결의번호 초기화
		dao.updateFinUnpaidAdjstSlipDel(vo);
		
		// 4) 전자증빙삭제(입금내역확인증)
		attachService.deleteFspAttchEvid(unslipNo, unslipNo);		
		
		// 5) xomxintfatab 결의결재상태 테이블 삭제
		apprFuncService.formRemove(unslipNo);
	}	
}
