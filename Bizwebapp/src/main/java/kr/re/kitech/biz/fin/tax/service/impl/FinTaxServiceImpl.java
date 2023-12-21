package kr.re.kitech.biz.fin.tax.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.pop.dao.FinSlipPopDAO;
import kr.re.kitech.biz.fin.std.vo.XodfVendComVo;
import kr.re.kitech.biz.fin.std.vo.XodfVendJobVo;
import kr.re.kitech.biz.fin.std.vo.XodfVendVo;
import kr.re.kitech.biz.fin.tax.dao.FinTaxDAO;
import kr.re.kitech.biz.fin.tax.service.FinTaxService;
import kr.re.kitech.biz.fin.tax.vo.FinBillUnConfirmVo;
import kr.re.kitech.biz.fin.tax.vo.FinTaxSearchVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillDVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillExcelVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillHVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillInfoVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillSendPrcsInfoVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillUpdVo;
import kr.re.kitech.biz.fin.tax.vo.ItisBizMailVo;
import kr.re.kitech.biz.fin.tax.vo.ItisIssuDetailVo;
import kr.re.kitech.biz.fin.tax.vo.ItisIssuMstrVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSrcVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @ClassSubJect 세무관리 
 * @Class Name : FinTaxServiceImpl.java
 * @Description : 세무관리 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/08/12   이영희          최초생성
 * 
 * @author 이영희
 * @since 2022/08/12
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Service("finTaxService")
public class FinTaxServiceImpl extends EgovAbstractServiceImpl implements FinTaxService {
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name="finTaxDAO")
	private FinTaxDAO dao;
	
	@Resource(name="finSlipPopDAO")
	private FinSlipPopDAO popDao;

	/**
    * 매출계산서, 매출계산서(관), 매출계산서 팝업 조회
    * @param FinTaxSearchVo
    * @return List<FtxBillHInfoVo>
    * @author LeeYH
    * @since 2022.08.12.
    */
	@Override
	public List<FtxBillHVo> selectFtxBillHList(FinTaxSearchVo vo) throws KitechException{
		return dao.selectFtxBillHList(vo);
	}
	
	/**
    * 매출계산서(관) 엑셀 다운로드
    * @param FinTaxSearchVo
    * @return List<FtxBillHInfoVo>
    * @author LeeYH
    * @since 2022.08.12.
    */
	public List<FtxBillHVo> selectFtxBillHExcelDown(FinTaxSearchVo vo) throws KitechException{
		return dao.selectFtxBillHExcelDown(vo);
	}
	
	/**
     * 매출계산서 조회(팝업)
     * @param FinTaxSearchVo
     * @return FtxBillInfoVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.10.04.
     */
    public FtxBillInfoVo selectFtxBillH(FinTaxSearchVo vo) throws KitechException{
    	FtxBillInfoVo retVo = new FtxBillInfoVo();
    	// 계산서 헤더 조회
		retVo.setBillHVo(dao.selectFtxBillH(vo.getTax_bill_no()));
		// 계산서 디테일 조회
		retVo.setBillDList(dao.selectFtxBillDList(vo.getTax_bill_no()));		
		// 수정발행 시 해당 세금계산서에 대한 기존, 수정 세금계산서 카운트 조회 
		retVo.setBillCntVo(dao.selectFtxBillCnt(vo.getTax_bill_no()));
				
		return retVo;
    }
    
    /**
     * 전자계산서 발송현황(팝업)
     * @param FinTaxSearchVo
     * @return FtxBillSendPrcsInfoVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.10.07.
     */
    public FtxBillSendPrcsInfoVo selectFtxBillSendPrcs(FinTaxSearchVo vo) throws KitechException{
    	FtxBillSendPrcsInfoVo retVo = new FtxBillSendPrcsInfoVo();
    	// 전자계산서 발송현황
    	retVo.setSendPrcsList(dao.selectFtxBillSendPrcs(vo.getTax_bill_no()));    	
    	//전자계산서 재전송 현황
    	retVo.setReSendList(dao.selectFtxBillReSend(vo.getTax_bill_no()));
    	
    	return retVo;
    }
    
    /**
     * 매출계산서 저장
     * @param FtxBillInfoVo
     * @return FinTaxSearchVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.10.13.
     */
    public String saveFtxBillInfo(FtxBillInfoVo vo) throws KitechException{
    	// 01. 계산서 헤더 저장
    	FtxBillHVo hVo = vo.getBillHVo();
    	
    	if("FBE011".equals(hVo.getBill_clsf1())){ // 현금
			hVo.setCash_depst(hVo.getTotl_amt());
		}else if("FBE021".equals(hVo.getBill_clsf1())){ // 수표
			hVo.setCheck_depst(hVo.getTotl_amt());
		}else if("FBE031".equals(hVo.getBill_clsf1())){ // 어음
			hVo.setPrmsnt_depst(hVo.getTotl_amt());
		}else if("FBE091".equals(hVo.getBill_clsf1())){ // 외상
			hVo.setCredit_pur(hVo.getTotl_amt());
		}
		
		if(!"".equals(hVo.getTax_bill_no())){
			if(dao.selectFtxBillHCnt(hVo.getTax_bill_no()) > 0){
				// {0}/해당 세금계산서는 이미 폐기처리 되어 수정 및 저장이 불가합니다.
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.tax.0001", new String[]{hVo.getTax_bill_no()});
			}
		}
    	
    	String taxBillNo = hVo.getTax_bill_no();
    	if("C".equals(hVo.getCud_type())){
    		if("01".equals(hVo.getTax_type())){
    			taxBillNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F30");
    		}else{
    			taxBillNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F10");
    		}		
    		
    		hVo.setTax_bill_no(taxBillNo);
    		hVo.setWrte_dept(KitechContextUtil.getDeptCd());
    		hVo.setWrte_psn(KitechContextUtil.getSyspayno());
    		
    		if(dao.insertFtxBillH(hVo)== 0){
    			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"계산서 헤드입력"});
    		}
    		
    		//-------------------------------------------------------------------------------------------------
		    // biz_clsf = S(기업지원)일 때 기술지원접수정보(spttecrcptinfo)에 계산서번호 업데이트(시험성적서 제외-업무단에서 처리)
		    //-------------------------------------------------------------------------------------------------
		    if("S".equals(hVo.getBiz_clsf()) && hVo.getTech_supt_req_no() != null && !"".equals(hVo.getTech_supt_req_no())){
		    	this.saveSupWithBill(hVo);;
		    }		
    	}else{
    		dao.updateFtxBillH(hVo);
    		// 기업지원 정근창 연구원 요청으로 가장 최근에 입력한 데이터만 남게 한다. (update by SoO 2012.08.02)
    		// 2023.10.04. 유연화님 요청으로 기술지원접수 고객정보에서 가지고 가도록 수정(XC220230249E)
//    		if("S".equals(hVo.getBiz_clsf())){
//    			this.saveXodfVendJob(hVo);
//    		}
    	}    	
    	
    	// 2. 계산서디테일저장
    	if("U".equals(hVo.getCud_type())){
    		dao.deleteFtxBillD(taxBillNo);
    	}
    	List<FtxBillDVo> detlList = vo.getBillDList();
    	if(detlList != null && detlList.size() > 0){
    		int odr = 1;
    		for(FtxBillDVo dVo : detlList){
    			dVo.setTax_bill_no(taxBillNo);
    			dVo.setOdr(odr);
    			odr++;
    			
    			dao.insertFtxBillD(dVo);
    		}
    	}    	
    	
    	return taxBillNo;
    }
    
    /**
     * 계산서 발행시 기업지원 업무 저장(통합프로세스처리)
     * @param FtxBillHVo
     * @throws Exception
     * @author LeeYH
     * @since 2023.05.26.
     */
    private void saveSupWithBill(FtxBillHVo hVo) throws KitechException{		
    	SptTecRcptInfoVo sptVo = new SptTecRcptInfoVo();
		sptVo.setBill_no(hVo.getTax_bill_no());
		sptVo.setBill_issu_ymd(hVo.getIssu_ymd());
			
		sptVo.setAccnt_no(hVo.getAccnt_no());
		sptVo.setCust_no(hVo.getSude_psn());
		sptVo.setTech_supt_req_no(hVo.getTech_supt_req_no());
		sptVo.setAccnt_respn_psn(hVo.getAccnt_rspns());
		sptVo.setPrcs_state("STE060");
		
		dao.updateSptTecRcptInfoBillNo(sptVo);			
		
		// 기업지원 통합프로세스 처리
		if(hVo.getTech_supt_req_no() != null && !"".equals(hVo.getTech_supt_req_no()) && !"U".equals(hVo.getBill_knd())){ // 수정발행이 아닌경우에만 통프호출
			String[] techSuptReqNos = hVo.getTech_supt_req_no().split(",");
			if(techSuptReqNos.length > 0){
				AprVo aprVo = null;
				for(String reqNo : techSuptReqNos){
					aprVo = new AprVo();
					aprVo.setLoginUserId(KitechContextUtil.getUserId());
					aprVo.setMainKey(reqNo);
					aprVo.setReqNo(reqNo);
					aprVo.setReporterId(KitechContextUtil.getSyspayno());
					aprVo.setEndpoint(KitechContextUtil.getUserId());
					
					String billType = ("1".equals(hVo.getDemnd_recv_clsf()))? "N" : "Y";					
					aprVo.setBillType(billType);
					aprVo.setUiId("S306");
					//aprVo.setAprState("XAD070");
					
					apprFuncService.formAccept(aprVo);
				}			
			}
		}
    }
    
    /**
     * 기업지원에서 거래처 담당자 저장
     * @param FtxBillHVo
     * @throws Exception
     * @author LeeYH
     * @since 2023.05.26.
     */
    private void saveXodfVendJob(FtxBillHVo hVo) throws KitechException{
    	if(StringUtils.isNotEmpty(hVo.getBuyr_chrg_email1()) || StringUtils.isNotEmpty(hVo.getBuyr_chrg_email2())){
			if(dao.selectXodfVendJobCnt(hVo.getSude_psn()) > 0){
				dao.deleteXodfVendJob(hVo.getSude_psn());
			}
		}
		
		XodfVendJobVo jobVo = null;
		if(StringUtils.isNotEmpty(hVo.getBuyr_chrg_email1())){
			jobVo = new XodfVendJobVo();
			jobVo.setVend_cd(hVo.getSude_psn());
			jobVo.setCharg_clsf("XAF040");
			jobVo.setOdr(1);
			jobVo.setCharg(hVo.getBuyr_chrg_nm1());
			jobVo.setCharg_dept_nm(hVo.getBuyr_chrg_post1());
			jobVo.setCharg_tel(hVo.getBuyr_chrg_tel1());
			jobVo.setCharg_mobile(hVo.getBuyr_chrg_mobl1());
			jobVo.setCharg_email(hVo.getBuyr_chrg_email1());
			
			dao.updateXodfVendJob(jobVo);
		}
		
		if(StringUtils.isNotEmpty(hVo.getBuyr_chrg_email2())){
			jobVo = new XodfVendJobVo();
			jobVo.setVend_cd(hVo.getSude_psn());
			jobVo.setCharg_clsf("XAF040");
			jobVo.setOdr(2);
			jobVo.setCharg(hVo.getBuyr_chrg_nm2());
			jobVo.setCharg_dept_nm(hVo.getBuyr_chrg_post2());
			jobVo.setCharg_tel(hVo.getBuyr_chrg_tel2());
			jobVo.setCharg_mobile(hVo.getBuyr_chrg_mobl2());
			jobVo.setCharg_email(hVo.getBuyr_chrg_email2());
			
			dao.updateXodfVendJob(jobVo);
		}
    }
    
    /**
     * 전자발행(저장 및 국세청 전송)
     * @param FtxBillInfoVo
     * @return String
     * @throws Exception
     * @author LeeYH
     * @since 2023.04.07.
     */
    public String saveFtxBillSend(FtxBillInfoVo vo) throws KitechException{    	
    	// 01. 매출계산서 저장 저장
    	String taxBillNo = this.saveFtxBillInfo(vo);
    	
    	// 02. 국세청 전송    	
    	this.sendTaxbill(vo);
    	
    	// 03. 기업지원 업무처리
    	FtxBillHVo hVo = vo.getBillHVo();
    	if("S".equals(hVo.getBiz_clsf()) && "1".equals(hVo.getDemnd_recv_clsf())){
	    	SptTecSrcVo sptVo = new SptTecSrcVo();
			sptVo.setBill_no(hVo.getTax_bill_no());
			sptVo.setPrcs_state("STE060");
			
			dao.updateSptTecRcptInfoPrcsState(sptVo);	
	    }
    	
    	return taxBillNo;
    }
    
    /**
     * 수정세금계산서 발행
     * @param FtxBillInfoVo
     * @return FinTaxSearchVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.10.14.
     */
    public String saveAmndFtxBill(FtxBillInfoVo vo) throws KitechException{
    	String taxBillNo = "";
    	
    	// FtxBillHInfoVo 복사
    	FtxBillHVo cloneVo = (FtxBillHVo)vo.getBillHVo().clone();   
    	//01. 계산서 수정발행시 기존계산서 업데이트
    	cloneVo.setPrcs_clsf("U");    	
    	dao.updateFtxBillHPrcsClsf(cloneVo);
    	
    	// 01. 마이너스 계산서 발행    	
    	taxBillNo = this.saveMinusBill(cloneVo);
    	
    	// 기재사항 착오·정정일 경우
    	if("01".equals(cloneVo.getMody_code())){    		
	    	//02. 신규계산서 저장
	    	// 외부기술지원 유상(수정발행계산서번호로 업데이트)
	    	if("S".equals(cloneVo.getBiz_clsf()) || "FBF031".equals(cloneVo.getBill_clsf())){
	    		List<String> reqNoList = dao.selectTechSuptReqNoByBill(cloneVo.getOld_tax_bill_no());
	    		vo.getBillHVo().setTech_supt_req_no(StringUtil.listToString(reqNoList, ","));
	    	}
	    	
	    	vo.getBillHVo().setPrcs_clsf("N");
	    	taxBillNo = this.saveFtxBillInfo(vo); 	    	
	    	
	    	// 전자발행
	    	this.sendTaxbill(vo);	    		    	
	    } 	
	    
	    // 20150119 최초세금계산서 발행, 마이너스계산서 발행, 수정세금계산서 발행 시, 연구 및 기업지원 업무로직 추가
    	// 연구 및 매출계산서 메뉴에서 접근했을 때
    	if((cloneVo.getBiz_clsf().matches("R|F") && !"FBF031".equals(cloneVo.getBill_clsf()))
    	    || "S".equals(cloneVo.getBiz_clsf()) || "FBF031".equals(cloneVo.getBill_clsf())){
    	    
	    	FtxBillUpdVo updVo = new FtxBillUpdVo();
	    	updVo.setTax_bill_no(vo.getBillHVo().getTax_bill_no());
	    	updVo.setReq_no(cloneVo.getIssu_req_no());
	    	updVo.setMody_code(cloneVo.getMody_code());
	    	updVo.setDemnd_recv_clsf(cloneVo.getDemnd_recv_clsf());
	    	updVo.setBiz_clsf(cloneVo.getBiz_clsf());
	    	updVo.setOld_tax_bill_no(cloneVo.getOld_tax_bill_no());
	    	updVo.setBill_clsf(cloneVo.getBill_clsf());
	    	
	    	AppLog.info("\n --------------- FtxBillUpdVo : " + updVo);
	    	
	    	this.saveDepstWithAmndBill(updVo);
	    }
    	
    	return taxBillNo;
    }
    
    /**
     * 기재사항 오류일 경우 마이너스 계산서 발행
     * @param String taxBillNo
     * @return boolean
     * @throws Exception
     * @author LeeYH
     * @since 2023.04.11.
     */
    private String saveMinusBill(FtxBillHVo vo) throws ElException{
    	// =====================================================================
    	// 01.매출계산서 저장
    	// =====================================================================
    	String taxBillNo = "";
		if("F30".equals(vo.getOld_tax_bill_no().substring(0,3))){
			taxBillNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F30");
		}else{
			taxBillNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F10");
		}
		
		vo.setTax_bill_no(taxBillNo);
		
		// 헤더 저장
		dao.insertMinusFtxBillH(vo);
		
		// 디테일 저장
		dao.insertMinusFtxBillD(vo);
		
		// =====================================================================
    	//.02. 전자발행 호출
    	// =====================================================================
		FtxBillInfoVo retVo = new FtxBillInfoVo();
    	// 계산서 헤더 조회
    	FtxBillHVo hVo = dao.selectFtxBillH(vo.getTax_bill_no());
    	
    	hVo.setMody_code(vo.getMody_code());
    	hVo.setTax_type(vo.getTax_type());    	
    	hVo.setIssu_id(vo.getIssu_id()); // bfo_issu_id 저장 위해 필요
    	hVo.setOld_tax_bill_no(vo.getOld_tax_bill_no());
		retVo.setBillHVo(hVo);
		// 계산서 디테일 조회
		retVo.setBillDList(dao.selectFtxBillDList(vo.getTax_bill_no()));
		
		this.sendTaxbill(retVo);		
		
		return taxBillNo;
    }
    
    /**
     * 전자발행데이터 존재유무 조회
     * @param String taxBillNo
     * @return boolean
     * @throws Exception
     * @author LeeYH
     * @since 2022.10.14.
     */
    private boolean checkItisIssuMstrExist(String taxBillNo) throws ElException{
    	if(dao.selectItisIssuMstrCnt(taxBillNo) == 0){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    /**
     * 국세청 전송을 위한 데이터 저장
     * @param FtxBillInfoVo
     * @throws Exception
     * @author LeeYH
     * @since 2023.04.07.
     */
    private void sendTaxbill(FtxBillInfoVo vo) throws KitechException{    
    	FtxBillHVo hVo = vo.getBillHVo();
    	// -----------------------------------------------------------------------
    	// 02. 국세청 전송
    	// -----------------------------------------------------------------------
    	if(!this.checkItisIssuMstrExist(hVo.getTax_bill_no())){
    		throw new KitechException(Exceptions.WARN, Business.FIN, "message.alert.fin.tax.0002");
    	}
    	
    	// 02-1. 마스터정보 셋팅
    	ItisIssuMstrVo mstrVo = this.makeItisIssuMstr(hVo);      	
    	
    	// 매출전자세금계산서 원장 저장
    	dao.insertItisIssuMstr(mstrVo);      
    	
    	// 거래명세서 포함일 경우
    	if("1".equals(hVo.getPrt_times())){
    		// 전자세금계산서_거래명세서원장 저장
    		dao.insertItisStsMstr(mstrVo);
    	}	
    	
    	// 02-2. 매출전자세금계산서 품목 저장
    	List<FtxBillDVo> billDList = vo.getBillDList();
    	
    	ItisIssuDetailVo itemVo = null;
    	for(FtxBillDVo dVo : billDList){
    		itemVo = new ItisIssuDetailVo();
    		
    		itemVo.setIssu_seqno(hVo.getTax_bill_no());
    		itemVo.setSeq_no(String.valueOf(dVo.getOdr()));
    		itemVo.setBuy_date(dVo.getIssu_ymd()); // 거래 일자
    		itemVo.setItem_code(dVo.getItem_cd()); // 품목 코드  
    		itemVo.setItem_nm(dVo.getItem_nm()); // 품목 명
    		itemVo.setItem_infm(dVo.getStd()); // 규격
    		itemVo.setItem_desp(dVo.getRmk());
    		itemVo.setItem_qunt(String.valueOf(dVo.getQty()));
    		itemVo.setUnit_prce(String.valueOf(dVo.getUnit_price()));
    		itemVo.setItem_amt(dVo.getAmt()); // 공급가액
    		itemVo.setItem_tax(dVo.getTaxamt()); // 세액
    		
    		dao.insertItisIssuDetail(itemVo);
    		
    		// 거래명세서 포함일 경우
	    	if("1".equals(hVo.getPrt_times())){	    		
	    		// 전자세금계산서_거래명세서 상세품목 저장
	    		dao.insertItisStsDetail(itemVo);
	    	}
    	}
    }    
    
    /**
     * 전자발행(저장 및 국세청 전송)
     * @param FtxBillInfoVo
     * @return FinTaxSearchVo
     * @throws Exception
     * @author LeeYH
     * @since 2023.04.07.
     */
    private ItisIssuMstrVo makeItisIssuMstr(FtxBillHVo vo) throws KitechException{
    	ItisIssuMstrVo mstrVo = new ItisIssuMstrVo();
    	mstrVo.setIssu_seqno(vo.getTax_bill_no());
    	mstrVo.setRegs_date(vo.getIssu_ymd());
    	
    	// 01. 계산서 및 세금계산서 Header 정보
    	String taxType = vo.getTax_type();
    	if(vo.getMody_code() == null || "".equals(vo.getMody_code().trim())){
    		mstrVo.setTax_type(("01".equals(taxType))? "0101":"0301"); // 01 세금계산서, 03 계산서
    		mstrVo.setReq_stat_code("01"); // 요청상태코드 - 신규발행
    	}else{    		
    		mstrVo.setTax_type(("01".equals(taxType))? "0201":"0401"); // 02 수정세금계산서, 04 : 수정계산서, 01 일반
    		mstrVo.setReq_stat_code("06"); // 요청상태코드 - 수정발행
    		mstrVo.setBfo_issu_id(vo.getIssu_id());
    		mstrVo.setBfo_issu_seqno(vo.getOld_tax_bill_no());
    	}
    	
    	// 02.영수/청구구분(01 영수, 02 청구)
    	mstrVo.setPops_code(("2".equals(vo.getDemnd_recv_clsf()))? "01" : "02");
    	mstrVo.setMody_code(vo.getMody_code());
    	mstrVo.setNote1(vo.getRmk1());
    	mstrVo.setNote2(vo.getRmk2());
    	mstrVo.setNote3(vo.getRmk3());
    	
    	// 03. 공급자 정보 조회 및 원장 셋팅
    	XodfVendComVo vendVo = dao.selectXodfVend("100000");
    	
    	mstrVo.setSelr_corp_no(vendVo.getBsns_psn_regst_no());
    	mstrVo.setSelr_corp_nm(vendVo.getVend_abbr());
    	mstrVo.setSelr_ceo(vendVo.getReprs_psn_nm());
    	mstrVo.setSelr_addr(vendVo.getAddr());
    	mstrVo.setSelr_buss_cons(vendVo.getBizcatg()); // 공급자업태
    	mstrVo.setSelr_buss_type(vendVo.getBiztyp()); // 공급자종목
    	
    	// 04. 공급자 담당자
    	mstrVo.setSelr_chrg_post(vo.getWrte_dept_nm()); // 공급자담당부서명
    	mstrVo.setSelr_chrg_nm(vo.getCharg()); // 공급자담당자명
    	mstrVo.setSelr_chrg_tel(vo.getTel_no());
    	mstrVo.setSelr_chrg_email(vo.getEmail_addr());
    	
    	// 05. 공급받는자
    	mstrVo.setBuyr_gb(vo.getBuyr_gb()); // 공급받는자 구분코드(01 사업자번호, 02 주민번호, 03 외국인번호
    	if("03".equals(vo.getBuyr_gb())){
    		mstrVo.setBuyr_corp_no("9999999999999");
    	}else{
    		mstrVo.setBuyr_corp_no(vo.getBsns_psn_regst_no().replaceAll("-", ""));
    		// 거래처테이블의 거래처구분이 FBA002(개인사업자)일 경우 bsns_psn_regst_no에 사업자번호 또는 주민번호가 들어가 있어서 다시 셋팅
    		if("02".equals(vo.getBuyr_gb()) && mstrVo.getBuyr_corp_no().length() == 10){
    			mstrVo.setBuyr_gb("01");
    		}
    	}    	
    	
    	mstrVo.setBuyr_code(vo.getBuyr_code()); // 공급받는자거래처코드
    	mstrVo.setBuyr_corp_nm(vo.getVend_abbr()); // 공급받는자상호
    	mstrVo.setBuyr_ceo(vo.getReprs_psn_nm()); // 공급받는자대표자명
    	mstrVo.setBuyr_addr(vo.getAddr());  // 공급받는자주소
    	mstrVo.setBuyr_buss_cons(vo.getBizcatg()); // 공급받는자업태
    	mstrVo.setBuyr_buss_type(vo.getBiztyp());  // 공급받는자종목
    	
    	// 공급받는자 담당자
    	mstrVo.setBuyr_chrg_post1(vo.getBuyr_chrg_post1());
    	mstrVo.setBuyr_chrg_nm1(vo.getBuyr_chrg_nm1());
    	mstrVo.setBuyr_chrg_tel1(vo.getBuyr_chrg_tel1());
    	mstrVo.setBuyr_chrg_email1(vo.getBuyr_chrg_email1()); // 공급받는자담당자이메일1  
    	mstrVo.setBuyr_chrg_mobl1(vo.getBuyr_chrg_mobl1());
    	
    	mstrVo.setBuyr_chrg_post2(vo.getBuyr_chrg_post2());
    	mstrVo.setBuyr_chrg_nm2(vo.getBuyr_chrg_nm2());
    	mstrVo.setBuyr_chrg_tel2(vo.getBuyr_chrg_tel2());
    	mstrVo.setBuyr_chrg_email2(vo.getBuyr_chrg_email2()); // 공급받는자담당자이메일1  
    	mstrVo.setBuyr_chrg_mobl2(vo.getBuyr_chrg_mobl2());
    	
    	mstrVo.setChrg_amt(vo.getSuply_value());
    	mstrVo.setTax_amt(vo.getTaxamt());
    	mstrVo.setTotl_amt(vo.getTotl_amt());
    	
    	mstrVo.setRecp_cd("1"); // 역발행구분(정발:1)
    	mstrVo.setBill_type("1"); // 매출/매입구분(매출:1)
    	mstrVo.setSnd_mal_yn("Y"); // Email발행요청유무
    	mstrVo.setSnd_sms_yn("Y"); // SMS발행요청유무  
    	mstrVo.setSnd_fax_yn("Y"); // FAX발행요청유무
    	
    	mstrVo.setPymt_type1("10"); // 현금
    	mstrVo.setPamt_amt1(vo.getCash_depst()); // 현금금액
    	mstrVo.setPymt_type2("20"); // 수표
    	mstrVo.setPamt_amt2(vo.getCheck_depst());
    	mstrVo.setPymt_type3("30"); // 어음
    	mstrVo.setPamt_amt3(vo.getPrmsnt_depst());
    	mstrVo.setPymt_type4("40"); // 외상
    	mstrVo.setPamt_amt4(vo.getCredit_pur());
    	
    	return mstrVo;
    }
    
    /**
     * 재전송
     * @param FtxBillHVo
     * @throws Exception
     * @author LeeYH
     * @since 2023.04.12.
     */
    public void saveResendData(FtxBillHVo vo) throws KitechException{
    	// 매출계산서 헤더 수정
    	dao.updateFtxBillHBuyrChrg(vo);
    	
    	// 전자계산서헤더 확인(존재여부, 발급상태 여부)
    	ItisBizMailVo mailVo = dao.selectItisIssuMstrReSend(vo.getTax_bill_no());
    	if("000000".equals(mailVo.getErr_cd()) && mailVo.getStat_code().matches("00|02")){ // 00 국세청 정상, 02 승인(승인완료)
    		if(vo.getBuyr_chrg_email1() == null || "".equals(vo.getBuyr_chrg_email1().trim())){
    			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.tax.0003");
    		}
    		// 공급받는자 이메일 1
    		if(!vo.getBuyr_chrg_email1().trim().equals(mailVo.getBuyr_chrg_email1())){
    			mailVo.setRes_addr(vo.getBuyr_chrg_email1());
    			
    			dao.insertItisBizMail(mailVo);
    		}
    		
    		// 공급받는자 이메일 2
    		if(vo.getBuyr_chrg_email2() != null && !"".equals(vo.getBuyr_chrg_email2().trim())){
    			mailVo.setRes_addr(vo.getBuyr_chrg_email2());
    			
    			dao.insertItisBizMail(mailVo);
    		}
    	}
    }
    
    /**
     * 매출계산서 삭제 또는 복구시 처리구분 업데이트
     * @param FinTaxSearchVo
     * @throws Exception
     * @author LeeYH
     * @since 2023.04.12.
     */
    public void deleteFtxBill(FtxBillHVo vo) throws KitechException{
    	if("D".equals(vo.getPrcs_clsf())){
	    	// 계산서 삭제 가능여부 조회
	    	if("N".equals(dao.selectFtxBillDelYn(vo.getTax_bill_no()))){
	    		throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.tax.0004");
	    	}
	    }
    	
    	// 01.ftxbillh.prcs_clsf 업데이트(D)
    	dao.updateFtxBillHDel(vo);
    	
    	if("D".equals(vo.getPrcs_clsf())){
	    	// 02.업무별 처리
	    	FtxBillUpdVo delVo = new FtxBillUpdVo();
	    	delVo.setBill_clsf(vo.getBill_clsf());
	    	delVo.setReq_no(vo.getIssu_req_no());
	    	
	    	delVo.setAccnt_no(vo.getAccnt_no());
	    	delVo.setDemnd_recv_clsf(vo.getDemnd_recv_clsf());
	    	delVo.setTax_bill_no(vo.getTax_bill_no());
	    	
	    	// 연구 및 매출계산서 메뉴에서 접근했을 때
	    	if(vo.getBiz_clsf().matches("R|F") && !"FBF031".equals(vo.getBill_clsf())){
	    		this.deleteResWithBill(delVo);
	    	}
	    	
	    	// 기업부담금에서 계산서번호 삭제
	    	if("S".equals(vo.getBiz_clsf()) || "FBF031".equals(vo.getBill_clsf())){
	    		if("S".equals(vo.getBiz_clsf())){
	    			// 01) 계산서 폐기시 시험성적서 발행여부 체크
	    			delVo.setVend_cd(vo.getSude_psn());
	    			delVo.setTech_supt_req_no(vo.getTech_supt_req_no());
					String rstBook = dao.selectSptRstBookIssuChk(delVo);
					
					if(rstBook != null && "Y".equals(rstBook)){
						throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.tax.0005");
					}
	    		}
	    		
	    		this.deleteSupWithBill(delVo);
	    	}
	    	
	    	// 03.매출계산서 폐기로 인한 전자세금계산서 원장 요청상태코드 업데이트
	    	if(!"".equals(vo.getIssu_id())){
	    		dao.updateItisIssuMstrDel(vo);    	
	    	}
	    }
    }
    
    /**
     * 매출계산서 수정발행시 연구,기업지원시스템 입금업무처리
     * @param FinTaxSearchVo
     * @throws Exception
     * @author LeeYH
     * @since 2023.04.12.
     */
    private void saveDepstWithAmndBill(FtxBillUpdVo vo) throws KitechException{
    	vo.setBill_no(vo.getTax_bill_no());
    	
    	if(vo.getReq_no() != null && !"".equals(vo.getReq_no().trim())){
    		String reqNoSub = vo.getReq_no().substring(0,3);
    		
	    	// 기술료 입금
	    	if("R78".equals(reqNoSub)){ 
	    		if("04".equals(vo.getMody_code())){ // 계약의 해제로 인한 수정(세금)계산서 발행
	    			vo.setBill_no("");
	    		}
	    		
	    		// 기술료 입금테이블 계산서번호 업데이트
	    		dao.updateResCrtPsRectlBill(vo);
	    		
	    		// 입금의뢰테이블 계산서번호 업데이트
		    	dao.updateFcpDepstReqBill(vo);
	    	
	    	 //연구비청구의뢰(resdemndreq)
	    	}else if("R08".equals(reqNoSub)){
	    		if("04".equals(vo.getMody_code())){ // 계약의 해제로 인한 수정(세금)계산서 발행
	    			vo.setBill_no("");
	    		}
	    		dao.updateResDemndReqBill(vo);
	    		
	    		// 연구비입금상세수정
	    		dao.updateResBgRectlBill(vo);
	    		
	    	// 연구비 입금의뢰
	    	}else if("R01".equals(reqNoSub)){
	    		if("04".equals(vo.getMody_code())){ // 계약의 해제로 인한 수정(세금)계산서 발행
	    			vo.setBill_no("");
	    		}
	    		
	    		// 연구비입금상세수정
	    		dao.updateResBgRectlBill(vo);
	    		
	    		// 입금의뢰테이블 계산서번호 업데이트
		    	dao.updateFcpDepstReqBill(vo);
		    // 외부기술지원 입금의뢰
	    	}else if(reqNoSub.matches("S03|S25")){
	    		if("04".equals(vo.getMody_code())){ // 계약의 해제로 인한 수정(세금)계산서 발행
	    			vo.setBill_no("");
	    		}
	    		
	    		dao.updateSptTecRcptDepst(vo);
	    	}
	    }
    	
    	// 계약의 해제일 경우 기업지원에서 호출했을 때 prcs_clsf = STE030, bill_no 초기화    	
		if("S".equals(vo.getBiz_clsf()) || "FBF031".equals(vo.getBill_clsf())){
			if("04".equals(vo.getMody_code())){
				// 통프 back
				vo.setTax_bill_no(vo.getOld_tax_bill_no());
				this.deleteSupWithBill(vo);
			}
		}
		    	
    }
    
    /**
    * 계산서 삭제시 연구업무 처리
    * @param FtxBillUpdVo
    * @author LeeYH
    * @since 2023.04.12.
    */
	private void deleteResWithBill(FtxBillUpdVo vo) throws KitechException{
		String reqNo = vo.getReq_no();		
		// 연구비 청구
		if(reqNo != null && reqNo.length() > 3){ 
			if("R08".equals(reqNo.substring(0,3))){
				vo.setBill_no("");
				dao.updateResDemndReqBill(vo);
			}else if("R01".equals(reqNo.substring(0,3))){
				dao.updateFcpDepstReqBillDel(vo);
			}
		}
	}	
	
	/**
    * 계산서 삭제시 기업지원업무 처리
    * @param FtxBillUpdVo
    * @author LeeYH
    * @since 2023.04.14.
    */
	private void deleteSupWithBill(FtxBillUpdVo vo) throws KitechException{		
		String reqNo = vo.getReq_no();
		if(reqNo != null && reqNo.length() > 3){
			if("S16".equals(vo.getReq_no().substring(0,3))){
				// 계산서 삭제시 기업부담금 입금의뢰 계산서번호 초기화
				dao.updateSptTltDeptstDetlsBillDel(vo);
			}
		}
		
		// 02) 외부기술지원 통프 back을 위한 조회(계산서번호 초기화 전에 조회)
		List<String> reqNoList = dao.selectTechSuptReqNoByBill(vo.getTax_bill_no());
		
		// 03) 외부기술지원 계산서 번호 초기화
		SptTecRcptInfoVo rcptVo = new SptTecRcptInfoVo();
		rcptVo.setBill_no(vo.getTax_bill_no());
		dao.updateSptTecRcptInfoBillDel(rcptVo);
		
		// 04) 외부기술지원 통프 back
		if(reqNoList != null && reqNoList.size() > 0){
			AprVo aprVo = null;
			for(String techSuptNo : reqNoList){			
				aprVo = new AprVo();
				aprVo.setLoginUserId(KitechContextUtil.getUserId());
				aprVo.setMainKey(techSuptNo);
				aprVo.setReqNo(techSuptNo);
				aprVo.setEndpoint(KitechContextUtil.getUserId());				
				aprVo.setBillType("D");
				aprVo.setUiId("S330");
				
				apprFuncService.formAccept(aprVo);
			}
		}
	}
	
	/**
     * 매출계산서 이관대상 조회
     * @param FinTaxSearchVo
     * @return List<FtxBillHVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.17.
     */
	public List<FtxBillHVo> selectItisIssuMstNotFtx(FinTaxSearchVo vo) throws KitechException{
		return dao.selectItisIssuMstNotFtx(vo);
	}
	
	/**
     * 매출계산서 이관
     * @param List<FtxBillHVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.17.
     */
	public void moveItisToFtx(List<FtxBillHVo> billList) throws KitechException{	
		String taxBillNo = "";	
		FtxBillUpdVo updVo = null;
		for(FtxBillHVo vo : billList){
			if(dao.selectFtxBillHMoveCnt(vo.getIssu_id()) > 0){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "이미 이관작업이 완료된 계산서입니다.");
			}
			
			updVo = new FtxBillUpdVo();
			updVo.setIssu_seqno(vo.getIssu_id());
			
			// 매출계산서 헤더 저장
			if(vo.getTax_type().matches("01|02")){
				taxBillNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F30");
			}else{
				taxBillNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F10");
			}
			
			vo.setTax_bill_no(taxBillNo);
			vo.setDecsn_no(vo.getIssu_id());			
			vo.setAccnt_no("");
			vo.setBill_clsf("");
			vo.setRmk2("국세청데이터이관");			
			
			if(vo.getBsns_psn_regst_no() != null && vo.getBsns_psn_regst_no().trim().length() == 10){
				List<XodfVendVo> vendList = popDao.selectXodfVendList(vo.getBsns_psn_regst_no());
				if(vendList != null && vendList.size() > 0){
					vo.setSude_psn(vendList.get(0).getVend_cd());
				}else{
					vo.setSude_psn("");
				}
			}else{
				vo.setSude_psn("");
			}
			
			dao.insertFtxBillH(vo);
			
			// 매출계산서 품목 저장
			updVo.setTax_bill_no(taxBillNo);
			updVo.setRegs_date(vo.getIssu_ymd());
			
			dao.insertFtxBillDByItis(updVo);
			
			//-----------------------------------------------------------------------------
			// 매출 전자세금계산서 저장(itis_issu_mstr에는 입력이 필요없을 것 같아서 주석처리 2023.07.28. 이영희)
			//-----------------------------------------------------------------------------
			// 1) itis_issu_mstr
			//dao.insertItisIssuMstrMove(updVo);
			
			// 2) itis_issu_detail
			//dao.insertItisIssuDetailMove(updVo);
		}
	}
	
	/**
     * 국세청발행계산서 수정
     * @param FtxBillHVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.04.18.
     */
	public void updateFtxBillH(FtxBillHVo vo) throws KitechException{
		if("FBE011".equals(vo.getBill_clsf1())){ // 현금
			vo.setCash_depst(vo.getTotl_amt());
		}else if("FBE021".equals(vo.getBill_clsf1())){ // 수표
			vo.setCheck_depst(vo.getTotl_amt());
		}else if("FBE031".equals(vo.getBill_clsf1())){ // 어음
			vo.setPrmsnt_depst(vo.getTotl_amt());
		}else if("FBE091".equals(vo.getBill_clsf1())){ // 외상
			vo.setCredit_pur(vo.getTotl_amt());
		}
		
		dao.updateFtxBillHMove(vo);
		
		//-------------------------------------------------------------------------------------------------
		// biz_clsf = S(기업지원)일 때 기술지원접수정보(spttecrcptinfo)에 계산서번호 업데이트(시험성적서 제외-업무단에서 처리)
		//-------------------------------------------------------------------------------------------------
		if("S".equals(vo.getBiz_clsf()) && vo.getTech_supt_req_no() != null && !"".equals(vo.getTech_supt_req_no())){
		   	this.saveSupWithBill(vo);;
		}	
	}
	
	/**
     * 매출계산서(관) 엑셀내리기
     * @param FinTaxSearchVo
     * @return List<FtxBillExcelVo>
     * @throws Exception
     * @author LeeYoungHee
	 * @since 2023.09.26.
     */
	public List<FtxBillExcelVo> selectFtxBillHExcel(FinTaxSearchVo vo) throws KitechException{
		return dao.selectFtxBillHExcel(vo);
	}
	
	/**
     * 매출계산서(관) 헤더 수정(계정번호,계산서구분,비고,결의번호 등)
     * @param FtxBillHVo
     * @throws Exception
     * @author LeeYoungHee
	 * @since 2023.10.04.
     */
	public void saveFtxBillMnt(FtxBillHVo vo) throws KitechException{
		dao.updateFtxBillHMnt(vo);
	}
	
	/**
     * 매출계산서(관) 미확인 조회
     * @param FinTaxSearchVo
     * @return List<FinBillUnConfirmVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.04.
     */
	public List<FinBillUnConfirmVo> selectFtxBillUnConfirm(FinTaxSearchVo vo) throws KitechException{
		return dao.selectFtxBillUnConfirm(vo);
	}
}
