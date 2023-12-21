package kr.re.kitech.biz.sup.tec.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComDepstReqService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.ComReqVo;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspRamtCreatVo;
import kr.re.kitech.biz.fin.com.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.com.vo.ResBgAcctmVo;
import kr.re.kitech.biz.fin.std.vo.XodfVendAccntVo;
import kr.re.kitech.biz.sup.pop.vo.SptTranTableVo;
import kr.re.kitech.biz.sup.tec.dao.SptTecCardSlipDAO;
import kr.re.kitech.biz.sup.tec.dao.SptTecSlipMntDAO;
import kr.re.kitech.biz.sup.tec.service.SptTecCardSlipService;
import kr.re.kitech.biz.sup.tec.vo.ResAdxReqmVo;
import kr.re.kitech.biz.sup.tec.vo.SptCardSlipSrcVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecCardSlipCrtVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecCardSlipVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipMntVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipSrcVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @ClassSubJect 기술지원카드결의 DAO
 * @Class Name SptTecCardSlipDAO.java
 * @Description 기술지원카드결의 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/12/04   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/12/04
 * @version 1
 * @see
 * 
 */
@Service("sptTecCardSlipService")
public class SptTecCardSlipServiceImpl extends EgovAbstractServiceImpl implements SptTecCardSlipService {
	@Resource(name="sptTecCardSlipDAO")
	private SptTecCardSlipDAO dao;
	
	@Resource(name="sptTecSlipMntDAO")
	private SptTecSlipMntDAO slipDao;
	
	@Resource(name="finSlipSaveService")
	private FinSlipSaveService finSlipService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name="finComService")
	private FinComService finComService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	@Resource(name="finComDepstReqService")
	private FinComDepstReqService depstService;
	
	/**
     * 카드처리내역 조회 
     * @param SptCardSlipSrcVo
     * @return List<SptTranTableVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.04.
     */
	@Override
	public List<SptTranTableVo> selectSptTranCardPrcs(SptCardSlipSrcVo vo) throws KitechException {
		return dao.selectSptTranCardPrcs(vo);
	}
	
	/**
     * 카드처리내역 접수번호 저장
     * @param List<SptTranTableVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.04.
     */
	public void updateSptTranCard(SptTranTableVo vo) throws KitechException{
		dao.updateSptTranTable(vo);
	}
	
	/**
     * 기술지원카드 미수(취소)결의생성 조회 
     * @param SptCardSlipSrcVo
     * @return List<SptTecCardSlipVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.04.
     */
	public List<SptTecCardSlipVo> selectSptTecCardSlip(SptCardSlipSrcVo vo) throws KitechException{
		return dao.selectSptTecCardSlip(vo);
	}
	
	/**
     * 기술지원카드 미수(취소)결의생성
     * @param SptTecCardSlipCrtVo
     * @return String unslipNo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.05.
     */
	public String saveSptTecCardSlip(SptTecCardSlipCrtVo vo) throws KitechException{
		List<SptTecCardSlipVo> slipList = vo.getSlipList();
		
		List<ComReqVo> reqNoList = new ArrayList<>();
		ComReqVo reqVo = null;
		for(SptTecCardSlipVo dVo : slipList){
			reqVo = new ComReqVo();
			reqVo.setReq_no(dVo.getTech_supt_req_no());
			reqNoList.add(reqVo);
		}
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //
		FspSlipHVo hVo = vo.getSlipHVo();
		String rmk = hVo.getRmk();
		if(slipList.size() > 1){
			rmk += "외" + (slipList.size() -1) + "건";
		}
		// 1-1) 헤더 적요조회	
		hVo.setRmk(rmk);		
		String unslipNo = finSlipService.saveAutoSlipH("", reqNoList, hVo);	
		
		// 1-2) 결재 인터페이스 저장
		apprFuncService.formInit(unslipNo, "F203", KitechContextUtil.getUserId(), rmk);
		
		// ==================================================== //
		// 2. 결의서 디테일
		// ==================================================== //
		// 2-1.FF030001 계정 - 계정책임자 및 편성단위 조회
		ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk("FF030001");	
			
		int seq = 0;
		for(SptTecCardSlipVo sVo : slipList){
			if("456".equals(hVo.getSlip_typ_cd())){
				seq = this.saveSptTecCardMisuSlip(sVo, acctmVo, hVo, seq); 
				
			}else if("457".equals(hVo.getSlip_typ_cd())){ // 카드 취소결의
				seq = this.saveSptTecCardCanclSlip(sVo, acctmVo, hVo, seq);
			}
		} 
		
		// ==================================================== //
		// 3. 전자증빙
		// ==================================================== //
		if("456".equals(hVo.getSlip_typ_cd())){
			List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList("456", "N"); // S011 기술지원수수료카드결제내역
			for(FspEvidAttachVo attachVo : attachList){
				attachVo.setReq_no(unslipNo);
				attachVo.setUnslip_no(unslipNo);
				attachVo.setUnslip_odr(seq);
				
				attachVo.setKey_val(unslipNo + "," + slipList.get(0).getKolas_no());	
			}
			
			attachService.saveFspEvidAttach(attachList);
		}
		
		// 3-1) 전자증빙 호출(크리스피드)
		EvidAttachVo evidVo = new EvidAttachVo();
		evidVo.setUnslip_no(unslipNo);
		attachService.executeProcess(evidVo);
		
		return unslipNo;
	}
	
	/**
     * 기술지원카드 미수결의생성
     * @param SptTecCardSlipVo, ResBgAcctmVo, String, int
     * @return int seq
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.05.
     */
	private int saveSptTecCardMisuSlip(SptTecCardSlipVo sVo, ResBgAcctmVo acctmVo, FspSlipHVo hVo, int seq) throws KitechException{
		String unslipNo = hVo.getUnslip_no();
		
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = new FinComSlipVo();
		
		//--------------------------------------------------------
		// 1) 차변 생성
		//--------------------------------------------------------
		slipVo.setSlip_ymd(hVo.getSlip_ymd());			
		seq++;
		
		FspSlipDVo dVo = new FspSlipDVo();
		dVo.setUnslip_no(unslipNo);
		dVo.setUnslip_odr(seq);	
		dVo.setJourn_cd("Fn9910");
		dVo.setJourn_odr(seq);
		dVo.setBase_debit_cr("1");
		dVo.setAccnt_no("FF030001");
		dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
		dVo.setFomat_unit(acctmVo.getFomat_unit());
		dVo.setAccnt_cd("11127010"); // 카드사 미수금
		dVo.setExpns_cd("999");
		dVo.setTotal_amt(sVo.getDsaleamt());
		dVo.setUnslip_amt(sVo.getDsaleamt());
		dVo.setTax_amt(0);
		
		dVo.setEvid_cd("FAH999");
		dVo.setRmk_1(sVo.getRmk());
		dVo.setRmk_2("한국정보통신(주)");
		dVo.setReq_no(sVo.getTech_supt_req_no());
		
		slipVo.setSlipDVo(dVo);		
		
		// 관리항목
		Map<String, String> map = new HashMap<String,String>();
		map.put("unslip_no", unslipNo);
		map.put("unslip_odr", String.valueOf(seq));		
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("base_debit_cr", dVo.getBase_debit_cr());		
		
		map.put("vend_nm", sVo.getVend_abbr());
		map.put("mngmt_accnt_no", sVo.getAccnt_no());
		map.put("kolas_no", sVo.getKolas_no());
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
		// 결의생성 호출
		finSlipService.saveAutoSlip(slipVo);
		
		// 1-2) 기업지원 접수테이블에 결의번호 입력
		SptTecSlipMntVo updVo = new SptTecSlipMntVo();
		updVo.setUnslip_no(unslipNo);
		updVo.setUnslip_odr(seq);
		updVo.setTech_supt_req_no(sVo.getTech_supt_req_no());
		updVo.setPrcs_state("STE090");
		updVo.setIssu_ymd(hVo.getSlip_ymd());
		slipDao.updateSptTecRcptInfoUnslipNoVcr(updVo);
		
		// 1-3) 카드거래테이블(spt_tran_table)에 결의번호 입력
		sVo.setUnslip_no(unslipNo);
		sVo.setUnslip_odr(seq);
		dao.updateSptTranCardSlipNo(sVo);
		
		// 1-4) 전자증빙
		List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList("456", "Y"); // S008 기업지원 카드미수 결의/카드매출영수증
		for(FspEvidAttachVo attachVo : attachList){
			attachVo.setReq_no(unslipNo);
			attachVo.setUnslip_no(unslipNo);
			attachVo.setUnslip_odr(seq);
			
			attachVo.setKey_val(sVo.getCard_appl_no() + "," + sVo.getCard_issu_ymd() + ",A," + sVo.getKolas_no() + ",S359");	
		}
		
		attachService.saveFspEvidAttach(attachList);
		
		//--------------------------------------------------------
		// 2) 대변 생성
		//--------------------------------------------------------
		slipVo = new FinComSlipVo();
		slipVo.setSlip_ymd(hVo.getSlip_ymd());
		
		seq++;
		
		dVo = new FspSlipDVo();
		dVo.setUnslip_no(unslipNo);
		dVo.setUnslip_odr(seq);	
		dVo.setJourn_cd("Fn9920");
		dVo.setJourn_odr(seq);
		dVo.setBase_debit_cr("2");
		dVo.setAccnt_no(sVo.getAccnt_no());	
		dVo.setAccnt_rspns(sVo.getAccnt_rspns());
		dVo.setFomat_unit(sVo.getFomat_unit());	
		dVo.setAccnt_cd(this.getAccntCd(sVo.getAccnt_no()));
		dVo.setExpns_cd("999");	

		long hcfUnslipAmt = 0L;
		ResAdxReqmVo reqmVo = null;
		
		long unslipAmt = sVo.getSuply_value() - sVo.getDprovfee(); // 수수료는 원부담으로 확정 2020.2.3 배진희,이상훈 회의결과
		
		if("SRP010".equals(sVo.getSrpt_cd())){
			reqmVo = new ResAdxReqmVo();
			reqmVo.setSlip_ymd(hVo.getSlip_ymd());
			reqmVo.setTax_cd(sVo.getTax_cd());
			reqmVo.setDivsn_clsf(sVo.getDivsn_clsf());
			
			reqmVo = slipDao.selectResAdxReqm(reqmVo);
			if(reqmVo == null || reqmVo.getAccnt_no() == null){
				throw new KitechException(Exceptions.ALERT, Business.SUP, "message.alert.spt.tec.0001", new String[]{sVo.getAccnt_no()});
			}
			
			String rate = reqmVo.getMngmt_item_1();
			hcfUnslipAmt = Math.round(unslipAmt * Float.parseFloat(rate) / 100);
			unslipAmt = unslipAmt - hcfUnslipAmt;
			
			if("FTX001".equals(sVo.getTax_cd())){
				dVo.setTotal_amt(unslipAmt + sVo.getTax_amt());
				dVo.setUnslip_amt(unslipAmt);
				dVo.setTax_amt(sVo.getTax_amt());
			}else{
				dVo.setTotal_amt(unslipAmt);
				dVo.setUnslip_amt(unslipAmt);
				dVo.setTax_amt(0);
			}
		}else{
			dVo.setTotal_amt(unslipAmt + sVo.getTax_amt());
			dVo.setUnslip_amt(unslipAmt);
			dVo.setTax_amt(sVo.getTax_amt());
		}
		
		dVo.setEvid_cd("");
		dVo.setRmk_1(sVo.getRmk());
		dVo.setRmk_2(sVo.getVend_abbr());
		dVo.setReq_no(sVo.getKolas_no());
		
		slipVo.setSlipDVo(dVo);		
		
		// 관리항목
		map = new HashMap<String,String>();
		map.put("unslip_no", unslipNo);
		map.put("unslip_odr", String.valueOf(seq));		
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("base_debit_cr", dVo.getBase_debit_cr());
		map.put("mngmt_accnt_no", sVo.getAccnt_no());
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
		// 결의생성 호출
		finSlipService.saveAutoSlip(slipVo);
		
		//-------------------------------------------
		// 2) 대변생성(경상비 흡수)
		//-------------------------------------------
		if("SRP010".equals(sVo.getSrpt_cd())){ // SRP010	경상비지원
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
			dVo.setAccnt_cd(this.getAccntCd(reqmVo.getAccnt_no()));
			dVo.setExpns_cd("999");	
			dVo.setTotal_amt(hcfUnslipAmt);
			dVo.setUnslip_amt(hcfUnslipAmt);
			
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(sVo.getRmk());
			dVo.setRmk_2(sVo.getVend_abbr());
			dVo.setReq_no(sVo.getKolas_no());
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());			
			map.put("mngmt_accnt_no", reqmVo.getAccnt_no());
			map.put("mngmt_2060_nm", "운영비흡수" + "(" + sVo.getAccnt_no() + ")");	
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
		}
		//-------------------------------------------
		// 3) 대변생성(카드수수료)
		//-------------------------------------------
		slipVo = new FinComSlipVo();
		slipVo.setSlip_ymd(hVo.getSlip_ymd());
		
		seq++;
		
		dVo = new FspSlipDVo();
		dVo.setUnslip_no(unslipNo);
		dVo.setUnslip_odr(seq);	
		dVo.setJourn_cd("Fn9920");
		dVo.setJourn_odr(seq);
		dVo.setBase_debit_cr("2");
		dVo.setAccnt_no(sVo.getFee_accnt_no());	
		dVo.setAccnt_rspns(sVo.getFee_accnt_rspns());
		dVo.setFomat_unit(sVo.getFee_fomat_unit());
		dVo.setAccnt_cd(this.getAccntCd(sVo.getFee_accnt_no()));
		dVo.setExpns_cd("999");	
		dVo.setUnslip_amt(sVo.getDprovfee());

		dVo.setRmk_1(sVo.getRmk());
		dVo.setRmk_2(sVo.getVend_abbr());
		dVo.setReq_no(sVo.getKolas_no());
		
		slipVo.setSlipDVo(dVo);		
		
		// 관리항목
		map = new HashMap<String,String>();
		map.put("unslip_no", unslipNo);
		map.put("unslip_odr", String.valueOf(seq));		
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("base_debit_cr", dVo.getBase_debit_cr());			
		map.put("mngmt_accnt_no", sVo.getFee_accnt_no());
		map.put("mngmt_2060_nm", "카드수수료" + "(" + sVo.getAccnt_no() + ")");	
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
		// 결의생성 호출
		finSlipService.saveAutoSlip(slipVo);
		
		//-------------------------------------------
		// 4) 대변생성(부가세)
		//-------------------------------------------
		if(sVo.getTax_amt() > 0 && "FTX001".equals(sVo.getTax_cd())){
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
			dVo.setUnslip_amt(sVo.getTax_amt());

			dVo.setRmk_1(sVo.getRmk());
			dVo.setRmk_2(sVo.getVend_abbr());
			dVo.setReq_no(sVo.getKolas_no());
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			map = new HashMap<String,String>();
			map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());			
			map.put("mngmt_accnt_no", sVo.getAccnt_no());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);				
		}
		
		//-------------------------------------------
		// 5) 통프호출
		//-------------------------------------------
		AprVo aprVo = new AprVo();
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setMainKey(sVo.getTech_supt_req_no());
		aprVo.setReqNo(sVo.getTech_supt_req_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setUiId("S370");
		
		//apprFuncService.formAccept(aprVo);
		
		return seq;
	}	
	
	/**
     * 기술지원카드결의 대변 회계코드 조회
     * @param String
     * @return String accntCd
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.05.
     */
	private String getAccntCd(String accntNo) throws KitechException{
		String accntCd = "";
		switch(accntNo.substring(0,2)){
			case "PA" : accntCd = "41015020"; break;
			case "PX" : accntCd = "41015900"; break;
			case "PD" : accntCd = "41015010"; break;
			case "PG" : accntCd = "41015030"; break;
		}
		
		if("".equals(accntCd)){
			throw new KitechException(Exceptions.ALERT, Business.SUP, "message.alert.res.exc.0003", new String[]{accntNo});
		}

		return accntCd;
	}
	
	/**
     * 기술지원카드 취소결의 생성
     * @param SptCardSlipSrcVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.06.
     */
	private int saveSptTecCardCanclSlip(SptTecCardSlipVo sVo, ResBgAcctmVo acctmVo, FspSlipHVo hVo, int seq) throws KitechException{
		String unslipNo = hVo.getUnslip_no();
		
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = null;
		
		//--------------------------------------------------------
		// 1) 차변 생성
		//--------------------------------------------------------
		// 미수결의 정보 불러와서 차변 세팅
		SptTecSlipSrcVo srcVo = new SptTecSlipSrcVo();
		srcVo.setUnslip_no(sVo.getMisu_unslip_no());
		srcVo.setKolas_no(sVo.getKolas_no());
		List<FspSlipDVo> slipList = dao.selectSptTecCardMisuSlip(srcVo);
		
		if(slipList == null || slipList.size() == 0){
			throw new KitechException(Exceptions.ALERT, Business.SUP, "카드취소를 위한 미수결의정보를 불러오는데 실패하였습니다. 시스템문의 해주시기 바랍니다.");
		}
		
		long unslipAmtSum = 0;
		for(FspSlipDVo dVo : slipList){
			slipVo = new FinComSlipVo();
			
			slipVo.setSlip_ymd(hVo.getSlip_ymd());			
			seq++;
			
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);	
			dVo.setJourn_cd("Fn9910");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("1");
			dVo.setRmk_1("기술지원카드미수취소/" + sVo.getAccnt_no());
			dVo.setRmk_2("한국정보통신(주)");
			dVo.setReq_no(sVo.getTech_supt_req_no());
			
			unslipAmtSum += dVo.getUnslip_amt();
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			Map<String, String> map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());			
			
			map.put("vend_cd", sVo.getVend_cd());
			map.put("vend_nm", sVo.getVend_abbr());
			if("41015020".equals(dVo.getAccnt_cd())){
				map.put("mngmt_accnt_no", dVo.getRamt_mngmt_1());
			}else{
				map.put("mngmt_accnt_no", sVo.getAccnt_no());
			}
			map.put("kolas_no", sVo.getKolas_no());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
		}		
		
		//--------------------------------------------------------
		// 2) 대변 생성
		//--------------------------------------------------------
		slipVo = new FinComSlipVo();
			
		slipVo.setSlip_ymd(hVo.getSlip_ymd());			
		seq++;
		
		FspSlipDVo dVo = new FspSlipDVo();
		
		dVo.setUnslip_no(unslipNo);
		dVo.setUnslip_odr(seq);	
		dVo.setJourn_cd("Fn9920");
		dVo.setJourn_odr(seq);
		dVo.setBase_debit_cr("2");
		dVo.setAccnt_no("FF030001");	
		dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
		dVo.setFomat_unit(acctmVo.getFomat_unit());	
		dVo.setAccnt_cd("21009100");
		dVo.setExpns_cd("999");	
		dVo.setTotal_amt(sVo.getDsaleamt());
		dVo.setUnslip_amt(sVo.getDsaleamt());
		dVo.setRmk_1("기술지원카드미수취소/" + sVo.getAccnt_no());
		dVo.setRmk_2("한국정보통신(주)");
		dVo.setReq_no(sVo.getKolas_no());
		
		slipVo.setSlipDVo(dVo);		
			
		// 관리항목
		Map<String, String> map = new HashMap<String,String>();
		map.put("unslip_no", unslipNo);
		map.put("unslip_odr", String.valueOf(seq));		
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("base_debit_cr", dVo.getBase_debit_cr());			
		
		map.put("vend_cd", sVo.getVend_cd());
		map.put("vend_nm", sVo.getVend_abbr());
		map.put("mngmt_accnt_no", sVo.getAccnt_no());		
		map.put("kolas_no", sVo.getKolas_no());
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
		// 결의생성 호출
		finSlipService.saveAutoSlip(slipVo);
		
		// 2-2) 전자증빙 저장
		List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList("457", "Y"); // S008 기업지원 카드미수 결의/카드매출영수증
		for(FspEvidAttachVo attachVo : attachList){
			attachVo.setReq_no(unslipNo);
			attachVo.setUnslip_no(unslipNo);
			attachVo.setUnslip_odr(seq);
			
			attachVo.setKey_val(sVo.getCard_appl_no() + "," + sVo.getCard_issu_ymd() + "," + sVo.getDdealgubun() + "," + sVo.getKolas_no() + ",S359");	
		}
		
		attachService.saveFspEvidAttach(attachList);
		
		// 2-3) 카드거래테이블(spt_tran_table)에 결의번호 입력
		sVo.setUnslip_no(unslipNo);
		sVo.setUnslip_odr(seq);
		dao.updateSptTranCardSlipNo(sVo);
		
		// 2-4) 기업지원 접수테이블 결의번호 클리어(카드미수결의번호 매핑된 건에서 카드취소로 인해 다시 다른 카드미수결의번호 매핑될 수 있도록 하기 위함)
		// 2023.12.11. 이영희 - 전체취소인경우만 결의번호 클리어 되도록 변경
		srcVo = new SptTecSlipSrcVo();
		if(unslipAmtSum == sVo.getDsaleamt()){
			srcVo.setPrcs_state("STE030");
			srcVo.setUnslip_no(sVo.getMisu_unslip_no());
			slipDao.updateSptTecRcptInfoSlipDel(srcVo);
		}
		
		return seq;
	}
	
	/**
     * 기술지원카드결의 삭제
     * @param SptCardSlipSrcVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.06.
     */
	public void deleteSptTecCardSlip(SptTecSlipSrcVo vo) throws KitechException{
		String unslipNo = vo.getUnslip_no();
		// 자동결의외에 수정된 건이 있는지 조사(분개코드(Fn9910, Fn9920)외의 건수구하기)
		finSlipService.selectAutoSlipCnt(unslipNo);
		
		// 1) 결의서 삭제
		finSlipService.deleteFspSlip(unslipNo);
		
		String unslipNoSub = vo.getUnslip_no().substring(0, 3);
		
		// 2) 카드취소결의하면서 빈값처리했던 건들을 카드미수결의번호 조회하여 입력
		if("457".equals(unslipNoSub)){		
			List<SptTecCardSlipVo> slipList = dao.selectSptTranTableMisu(vo.getUnslip_no());
			for(SptTecCardSlipVo slipVo : slipList){
				SptTecSlipMntVo updVo = new SptTecSlipMntVo();
				updVo.setUnslip_no(slipVo.getUnslip_no());
				updVo.setUnslip_odr(slipVo.getUnslip_odr());
				updVo.setTech_supt_req_no(slipVo.getTech_supt_req_no());
				updVo.setPrcs_state("STE090");
				updVo.setIssu_ymd(slipVo.getWrte_ymd());
				
				slipDao.updateSptTecRcptInfoUnslipNoVcr(updVo);
			}
		}else if("456".equals(unslipNoSub)){
			// 2-2) 기술지원 접수테이블(spttecrcptinfo) 결의번호 초기화
			vo.setPrcs_state("STE065");
			slipDao.updateSptTecRcptInfoSlipDel(vo);
		}
		
		// 3) 카드테이블 결의번호 초기화
		if("458".equals(unslipNoSub)){ // 카드정산결의
			dao.updateSptProvTableSlipDel(vo);
			
			// 2) 잔액정산 삭제, 잔액생성 수정 - fspramtcreat.won_adjst_amt 초기화
			depstService.deleteFspRamtAdjst(unslipNo, false);		
					
		}else{
			dao.updateSptTranCardSlipDel(vo);
		}		
		
		// 4) 전자증빙 삭제
		FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
		evidVo.setReq_no(unslipNo);
		evidVo.setRqst_no(unslipNo); // 크리스피드 전자증빙삭제
		attachService.deleteFspAttchEvid(evidVo);
		
		// 5) 결재 삭제
		apprFuncService.formRemove(unslipNo);
	}
	
	/**
     * 기술지원카드정산결의 조회 
     * @param SptCardSlipSrcVo
     * @return List<SptTecCardSlipVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.07.
     */
	public List<SptTecCardSlipVo> selectSptCardAdjstSlip(SptCardSlipSrcVo vo) throws KitechException{
		return dao.selectSptCardAdjstSlip(vo);
	}
	
	/**
     * 기술지원카드 정산결의생성
     * @param SptTecCardSlipCrtVo
     * @return String unslipNo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.07.
     */
	public String saveSptTecCardAdjstSlip(SptTecCardSlipCrtVo vo) throws KitechException{
		List<SptTecCardSlipVo> slipList = vo.getSlipList();
		
		List<ComReqVo> reqNoList = new ArrayList<>();
		ComReqVo reqVo = null;
		for(SptTecCardSlipVo dVo : slipList){
			reqVo = new ComReqVo();
			reqVo.setReq_no(dVo.getMisu_unslip_no());
			reqNoList.add(reqVo);
		}
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //
		FspSlipHVo hVo = vo.getSlipHVo();
		String rmk = hVo.getRmk();
		if(slipList.size() > 1){
			rmk += "외" + (slipList.size() -1) + "건";
		}
		// 1-1) 헤더 적요조회	
		hVo.setRmk(rmk);		
		String unslipNo = finSlipService.saveAutoSlipH("", reqNoList, hVo);	
		
		// 1-2) 결재 인터페이스 저장
		apprFuncService.formInit(unslipNo, "F203", KitechContextUtil.getUserId(), rmk);
		
		// ==================================================== //
		// 2. 결의서 디테일
		// ==================================================== //
		FinComSlipVo slipVo = null;
		FspSlipDVo dVo = null;
					
		int seq = -1;
		int daeSeq = 0;
		SptCardSlipSrcVo srcVo = null;
		for(SptTecCardSlipVo sVo : slipList){
			// 경우1) 카드취소 건 결의번호(457) 있는 경우(차변생성)
			if(StringUtils.isNotBlank(sVo.getCnl_unslip_no())){		
				srcVo = new SptCardSlipSrcVo();
				srcVo.setUnslip_no(sVo.getCnl_unslip_no());
				srcVo.setCard_appl_no(sVo.getCard_appl_no());
				
				for(SptTecCardSlipVo cardVo : dao.selectSptCardAdjstSlipDetl(srcVo)){
					slipVo = new FinComSlipVo();
					slipVo.setSlip_ymd(hVo.getSlip_ymd());
					
					seq+=2;
					dVo = new FspSlipDVo();
					dVo.setUnslip_no(unslipNo);
					dVo.setUnslip_odr(seq);
					dVo.setJourn_cd("Fn9910");
					dVo.setJourn_odr(seq);
					dVo.setBase_debit_cr("1");
					dVo.setAccnt_no(cardVo.getAccnt_no());
					dVo.setAccnt_rspns(cardVo.getAccnt_rspns());
					dVo.setFomat_unit(cardVo.getFomat_unit());
					dVo.setAccnt_cd("21009100"); // 카드사미지급금
					dVo.setExpns_cd("999");
					dVo.setUnslip_amt(cardVo.getDsaleamt());
					dVo.setTax_amt(0);
					
					dVo.setEvid_cd("");
					dVo.setRmk_1(cardVo.getRmk());
					dVo.setRmk_2("한국정보통신(주)");
					dVo.setReq_no(sVo.getMisu_unslip_no());
					
					slipVo.setSlipDVo(dVo);		
					
					// 관리항목
					Map<String, String> map = new HashMap<String,String>();
					map.put("unslip_no", unslipNo);
					map.put("unslip_odr", String.valueOf(seq));		
					map.put("accnt_cd", dVo.getAccnt_cd());
					map.put("base_debit_cr", dVo.getBase_debit_cr());		
					
					map.put("vend_nm", cardVo.getVend_abbr());
					map.put("mngmt_accnt_no", cardVo.getMngmt_accnt_no());
					map.put("kolas_no", cardVo.getKolas_no());
					
					slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
					
					// 결의생성 호출
					finSlipService.saveAutoSlip(slipVo);
					
					// 2-1) 정산결의번호 업데이트
					sVo.setUnslip_no(unslipNo);
					sVo.setUnslip_odr(seq);
					sVo.setDdealgubun("C");
					dao.updateSptProvTableUnslipNo(sVo);
					
					// 2-2) 전자증빙 저장(카드취소 건 있는 경우 카드사미지급금 계정원장(상세))
					FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
					evidVo.setDoc_id("458");
					evidVo.setCommon_yn("Y");
					
					List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList(evidVo);
					for(FspEvidAttachVo attachVo : attachList){
						attachVo.setReq_no(unslipNo);
						attachVo.setUnslip_no(unslipNo);
						attachVo.setUnslip_odr(seq);
						
						attachVo.setKey_val("21009100," + cardVo.getMngmt_accnt_no() + "," + cardVo.getAccnt_ymd() + "," + cardVo.getAccnt_ymd() + "," + cardVo.getKolas_no());	
					}
					attachService.saveFspEvidAttach(attachList);
				}
			}
			
			// 경우2) 카드미수결의번호(456) 있는 경우(대변만 생성)
			if(StringUtils.isNotBlank(sVo.getMisu_unslip_no())){
				srcVo = new SptCardSlipSrcVo();
				srcVo.setUnslip_no(sVo.getMisu_unslip_no());
				srcVo.setCard_appl_no(sVo.getCard_appl_no());
				
				for(SptTecCardSlipVo cardVo : dao.selectSptCardAdjstSlipDetl(srcVo)){
					slipVo = new FinComSlipVo();
					slipVo.setSlip_ymd(hVo.getSlip_ymd());
					
					daeSeq+=2;
					
					dVo = new FspSlipDVo();
					dVo.setUnslip_no(unslipNo);
					dVo.setUnslip_odr(daeSeq);
					dVo.setJourn_cd("Fn9920");
					dVo.setJourn_odr(daeSeq);
					dVo.setBase_debit_cr("2");
					dVo.setAccnt_no(cardVo.getAccnt_no());
					dVo.setAccnt_rspns(cardVo.getAccnt_rspns());
					dVo.setFomat_unit(cardVo.getFomat_unit());
					dVo.setAccnt_cd("11127010"); // 카드사미수금
					dVo.setExpns_cd("999");
					dVo.setUnslip_amt(cardVo.getDsaleamt());
					dVo.setTax_amt(0);
					
					dVo.setEvid_cd("");
					dVo.setRmk_1(cardVo.getRmk());
					dVo.setRmk_2("한국정보통신(주)");
					dVo.setReq_no(sVo.getMisu_unslip_no());
					// 카드미수 확정결의번호
					dVo.setOccr_slip_no(cardVo.getSlip_no());
					dVo.setOccr_slip_odr(cardVo.getSlip_odr());
					
					slipVo.setSlipDVo(dVo);		
					
					// 관리항목
					Map<String, String> map = new HashMap<String,String>();
					map.put("unslip_no", unslipNo);
					map.put("unslip_odr", String.valueOf(daeSeq));		
					map.put("accnt_cd", dVo.getAccnt_cd());
					map.put("base_debit_cr", dVo.getBase_debit_cr());		
					
					map.put("vend_nm", cardVo.getVend_abbr());
					map.put("mngmt_accnt_no", cardVo.getMngmt_accnt_no());
					map.put("kolas_no", cardVo.getKolas_no());
					
					slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
					
					// 잔액정산 데이터
					slipVo.setRamtVo(this.setRamtCreat(dVo));
					
					// 결의생성 호출
					finSlipService.saveAutoSlip(slipVo);
					
					// 2-1) 정산결의번호 업데이트
					sVo.setUnslip_no(unslipNo);
					sVo.setUnslip_odr(daeSeq);
					sVo.setDdealgubun("A");
					dao.updateSptProvTableUnslipNo(sVo);
					
					// 2-2) 전자증빙 저장(입금내역확인증, 카드사미수금 계정원장(상세))					
					List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList("458","Y");
					for(FspEvidAttachVo attachVo : attachList){
						attachVo.setReq_no(unslipNo);
						attachVo.setUnslip_no(unslipNo);
						attachVo.setUnslip_odr(daeSeq);
						
						switch(attachVo.getEvid_item_cd()){
							case "F080" :
								attachVo.setKey_val("11127010," + cardVo.getMngmt_accnt_no() + "," + cardVo.getAccnt_ymd() + "," + cardVo.getAccnt_ymd() + "," + cardVo.getKolas_no());
								break;
							case "S002" : 
								attachVo.setKey_val(unslipNo + ",458");
								break;
						}
					}
					
					attachService.saveFspEvidAttach(attachList);
				} // end 미수결의
			}
		}// end slipList 
		
		// 3-1) 전자증빙 호출(크리스피드)
		EvidAttachVo evidVo = new EvidAttachVo();
		evidVo.setUnslip_no(unslipNo);
		attachService.executeProcess(evidVo);
		
		return unslipNo;
	}
	
	/**
     * 정산결의 작성시 정산데이터 셋팅
     * @param FspSlipDVo
     * @return FspRamtCreatVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.08.
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
		ramtVo.setRmk_2("카드정산결의");
		ramtVo.setSlip_no(vo.getOccr_slip_no());
		ramtVo.setSlip_odr(vo.getOccr_slip_odr());
		// 미수반제신청시 청구금액에 대하여는 반제금액 입력하지 않음(2023.11.21. 이영희 수정)
		if("2".equals(vo.getBase_debit_cr())){ 
			ramtVo.setUnslip_repay_upd_yn(false);
		}
		
		return ramtVo;
	}
	
	/**
     * 기술지원 카드수수료 결의 목록 조회
     * @param SptCardSlipSrcVo
     * @return List<SptTecCardSlipVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.12.
     */
	public List<SptTecCardSlipVo> selectSptTecCardFeeSlip(SptCardSlipSrcVo vo) throws KitechException{
		return dao.selectSptTecCardFeeSlip(vo);
	}
	
	/**
     * 기술지원 카드수수료 결의생성
     * @param SptTecCardSlipCrtVo
     * @return String unslipNo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.12.
     */
	public String saveSptTecCardFeeSlip(SptTecCardSlipCrtVo vo) throws KitechException{
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //
		FspSlipHVo hVo = vo.getSlipHVo();
		String unslipNo = finSlipService.saveAutoSlipH("",hVo);	
		
		// 1-2) 결재 인터페이스 저장
		apprFuncService.formInit(unslipNo, "F203", KitechContextUtil.getUserId(), hVo.getRmk());
		
		// ==================================================== //
		// 2. 결의서 디테일
		// ==================================================== //
		// 2-1.FF030001 계정 - 계정책임자 및 편성단위 조회
		ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk("FF030001");	
		
		FinComSlipVo slipVo = null;
		FspSlipDVo dVo = null;
					
		int seq = 0;
		int idx = 0;
		long totUnslipAmt = 0;
		String provYrMon = vo.getSlipList().get(0).getHprovdate().substring(0,6); // 정산월
		
		for(SptTecCardSlipVo sVo : vo.getSlipList()){
			//-------------------------------------------------
			// 차변저장(수수료)
			//-------------------------------------------------
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(hVo.getSlip_ymd());
			
			// 예산통제모듈 호출위해 
			slipVo.setSlipHVo(hVo);
			
			seq++;
			dVo = new FspSlipDVo();
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);
			dVo.setJourn_cd("Fn9910");
			dVo.setJourn_odr(idx * 2 + 1);
			dVo.setBase_debit_cr("1");
			dVo.setAccnt_no(sVo.getAccnt_no());
			dVo.setAccnt_rspns(sVo.getAccnt_rspns());
			dVo.setFomat_unit(sVo.getFomat_unit());
			dVo.setAccnt_cd(sVo.getAccnt_cd()); // 관리비
			dVo.setExpns_cd("383");
			dVo.setTotal_amt(sVo.getDprovfee() + sVo.getDprovvat());
			dVo.setUnslip_amt(sVo.getDprovfee()); // 수수료
			dVo.setTax_amt(sVo.getDprovvat()); // 부가세
			totUnslipAmt += sVo.getDprovfee();
			
			dVo.setEvid_cd("");
			dVo.setRmk_1(provYrMon + "월 기술지원 카드수수료");
			dVo.setRmk_2("한국정보통신(주)");
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목(회계코드 51135420에 관리항목 없어서 걍 주석처리)
//			Map<String, String> map = new HashMap<String,String>();
//			map.put("unslip_no", unslipNo);
//			map.put("unslip_odr", String.valueOf(seq));		
//			map.put("accnt_cd", dVo.getAccnt_cd());
//			map.put("base_debit_cr", dVo.getBase_debit_cr());	
//			
//			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
			
			// 2-2) 정산결의번호 업데이트
			sVo.setUnslip_no(unslipNo);
			sVo.setUnslip_odr(seq);
			sVo.setDdealgubun("A");
			dao.updateSptProvTableUnslipNo(sVo);
			
			//-------------------------------------------------
			// 차변저장(부가세)
			//-------------------------------------------------
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(hVo.getSlip_ymd());
			
			seq++;
			dVo = new FspSlipDVo();
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);
			dVo.setJourn_cd("Fn9910");
			dVo.setJourn_odr(idx * 2 + 1);
			dVo.setBase_debit_cr("1");
			dVo.setAccnt_no("FF030001");
			dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
			dVo.setFomat_unit(acctmVo.getFomat_unit());
			dVo.setAccnt_cd("11149015"); // 부가세대급금
			dVo.setExpns_cd("999");
			dVo.setUnslip_amt(sVo.getDprovvat()); // 부가세
			totUnslipAmt += sVo.getDprovvat();
			
			dVo.setEvid_cd("");
			dVo.setRmk_1(provYrMon + "월 기술지원 부가세대급금");
			dVo.setRmk_2("한국정보통신(주)");
			
			slipVo.setSlipDVo(dVo);		
			
			// 관리항목
			Map<String, String> map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());	
			
			map.put("mngmt_accnt_no", sVo.getAccnt_no());
			map.put("bill_no", sVo.getBill_no());	
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
			
			idx++;			
			
		}// end slipList 
		
		//-------------------------------------------------
		// 결의서 디테일 대변저장
		//-------------------------------------------------
		slipVo = new FinComSlipVo();
		slipVo.setSlip_ymd(hVo.getSlip_ymd());
		
		seq++;
		dVo = new FspSlipDVo();
		dVo.setUnslip_no(unslipNo);
		dVo.setUnslip_odr(seq);
		dVo.setJourn_cd("Fn9920");
		dVo.setJourn_odr(2);
		dVo.setBase_debit_cr("2");
		dVo.setAccnt_no("FF030001");
		dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
		dVo.setFomat_unit(acctmVo.getFomat_unit());
		dVo.setAccnt_cd("21009010");
		dVo.setExpns_cd("999");
		dVo.setUnslip_amt(totUnslipAmt);
		dVo.setTotal_amt(totUnslipAmt);
		
		dVo.setEvid_cd("");
		dVo.setRmk_1(provYrMon + "월 기술지원 카드수수료");
		dVo.setRmk_2("한국정보통신(주)");
		dVo.setBill_no(vo.getSlipList().get(0).getBill_no());
		
		slipVo.setSlipDVo(dVo);		
		
		// 관리항목
		Map<String, String> map = new HashMap<String,String>();
		map.put("unslip_no", unslipNo);
		map.put("unslip_odr", String.valueOf(seq));		
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("base_debit_cr", dVo.getBase_debit_cr());	
		
		map.put("occr_ymd", vo.getSlipList().get(0).getIssu_ymd());
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
		// 송금내역
		List<FspSendReqVo> sendList = new ArrayList<>();
		FspSendReqVo sendVo = new FspSendReqVo();
		sendVo.setUnslip_no(unslipNo);
		sendVo.setUnslip_odr(seq);
		sendVo.setSend_odr(1);
		sendVo.setPay_clsf("202196");
		sendVo.setSend_req_amt(totUnslipAmt);
		sendVo.setVend_cd("202196");
		sendVo.setVend_nm("한국정보통신(주)");
		
		// 계좌정보 조회
		XodfVendAccntVo accntVo = finComService.selectXodfVendAccnt("202196");
		sendVo.setBank(accntVo.getTran_bank());
		sendVo.setBankaccnt_no(accntVo.getBankaccnt_no());
		sendVo.setDepstr_nm(accntVo.getDepstr());
		sendVo.setUse_ymd(vo.getSlipList().get(0).getIssu_ymd());
		sendVo.setRmk(dVo.getRmk_1());
		sendList.add(sendVo);
		slipVo.setSendList(sendList);
		
		// 결의생성 호출
		finSlipService.saveAutoSlip(slipVo);			
		
		// 3) 전자증빙 저장(카드수수료내역서)
		List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList("216","Y");
		for(FspEvidAttachVo attachVo : attachList){
			attachVo.setReq_no(unslipNo);
			attachVo.setUnslip_no(unslipNo);
			attachVo.setUnslip_odr(seq);
			
			attachVo.setKey_val(unslipNo);	
		}
		attachService.saveFspEvidAttach(attachList);
		
		// 4) 전자증빙 호출(크리스피드)
		EvidAttachVo evidVo = new EvidAttachVo();
		evidVo.setUnslip_no(unslipNo);
		attachService.executeProcess(evidVo);
		
		return unslipNo;
	}
	
	/**
     * 기술지원 카드수수료 결의 삭제
     * @param SptCardSlipSrcVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.12.12.
     */
	public void deleteSptTecCardFeeSlip(SptCardSlipSrcVo vo) throws KitechException{
		String unslipNo = vo.getUnslip_no();
		// 자동결의외에 수정된 건이 있는지 조사(분개코드(Fn9910, Fn9920)외의 건수구하기)
		finSlipService.selectAutoSlipCnt(unslipNo);
		
		// 1) 결의서 삭제(계산서 결의번호 초기화, 예산통제모듈삭제)
		finSlipService.deleteFspSlip(unslipNo, vo.getBill_no(), true);
		
		// 2) 카드테이블 결의번호 초기화
		dao.updateSptProvFeeSlipDel(vo.getUnslip_no());

		// 3) 전자증빙 - 결의번호 초기화
		FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
		evidVo.setReq_no(unslipNo);
		evidVo.setRqst_no(unslipNo); // 크리스피드 전자증빙삭제
		attachService.deleteFspAttchEvid(evidVo);
		
		// 4) 결재정보 삭제
		apprFuncService.formRemove(unslipNo);
	}
}
