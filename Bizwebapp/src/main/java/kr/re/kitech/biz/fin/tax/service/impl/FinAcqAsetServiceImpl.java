package kr.re.kitech.biz.fin.tax.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.dao.FinComDepstReqDAO;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.tax.dao.FinAcqAsetDAO;
import kr.re.kitech.biz.fin.tax.service.FinAcqAsetService;
import kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanDtlVo;
import kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanMstrVo;
import kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @ClassSubJect 인수자산 수익관리
 * @Class Name : FinAcqAsetServiceImpl.java
 * @Description : 인수자산 수익관리 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/09/19		전재우		최초생성
 * 
 * @author 전재우
 * @since 2022/09/19
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Service("finAcqAsetServiceImpl")
public class FinAcqAsetServiceImpl extends EgovAbstractServiceImpl implements FinAcqAsetService {
	@Resource(name="finAcqAsetDAO")
	private FinAcqAsetDAO finAcqAsetDAO;
	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="finSlipSaveService")
	private FinSlipSaveService slipService;
	
	@Resource(name="comDepstReqDAO")
	private FinComDepstReqDAO depstDao;	
	
	@Resource(name = "finComService")
	private FinComService finComService;
	
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprComService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	/**
    * 인수자산 수익관리 리스트 조회
    * @param TaxAcqAsetPlanMstrVo
    * @return List<TaxAcqAsetPlanMstrVo>
    * @author JenoJW
    * @since 2022.09.19.
    */
	@Override
	public List<FinAcqAsetPlanMstrVo> selectListFinAcqAset(FinAcqAsetPlanMstrVo finAcqAsetPlanMstrVo) throws KitechException{
		return finAcqAsetDAO.selectListFinAcqAset(finAcqAsetPlanMstrVo);
	}
	
	/**
    * 인수자산 계획정보 조회
    * @param TaxAcqAsetPlanMstrVo
    * @return TaxAcqAsetPlanMstrVo
    * @author JenoJW
    * @since 2022.10.10.
    */
	@Override
	public FinAcqAsetPlanVo selectTaxAcqAset(FinAcqAsetPlanVo finAcqAsetPlanVo) throws KitechException{
		FinAcqAsetPlanMstrVo planMstrVo = finAcqAsetPlanVo.getFinAcqAsetPlanMstrVo();
		FinAcqAsetPlanDtlVo planDtlVo = finAcqAsetPlanVo.getFinAcqAsetPlanDtlVo();
		
		FinAcqAsetPlanMstrVo planMstrVoList = finAcqAsetDAO.selectTaxAcqAset(planMstrVo);
		finAcqAsetPlanVo.setFinAcqAsetPlanMstrVo(planMstrVoList);
		
		String planReqNo = planMstrVo.getPlan_req_no();
		System.out.println("planReqNo" + planReqNo);
		if (!"".equals(planReqNo)) {
			List<FinAcqAsetPlanDtlVo> planDtlVoList = finAcqAsetDAO.selectPlanDtlList(planReqNo);
			finAcqAsetPlanVo.setFinAcqAsetPlanDtlListVo(planDtlVoList);
		}
		
		return finAcqAsetPlanVo;
	}
	
	/**
    * 인수자산 수익계획 생성
    * @param TaxAcqAsetPlanMstrVo
    * @return TaxAcqAsetPlanMstrVo
    * @author JenoJW
    * @since 2022.10.10.
    */
	@Override
	public FinAcqAsetPlanVo createTaxAcqAsetPlan(FinAcqAsetPlanVo finAcqAsetPlanVo) throws KitechException{
		FinAcqAsetPlanMstrVo planMstrVo = finAcqAsetPlanVo.getFinAcqAsetPlanMstrVo();
		FinAcqAsetPlanDtlVo planDtlVo = finAcqAsetPlanVo.getFinAcqAsetPlanDtlVo();
	
		String reqNo = planMstrVo.getPlan_req_no();
		
		// 신청서 번호가 없는경우 채번
		if("".equals(reqNo)){
			reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F08");
			planMstrVo.setPlan_req_no(reqNo);
			planDtlVo.setPlan_req_no(reqNo);
		} else {
			planMstrVo.setPlan_req_no(reqNo);
			planDtlVo.setPlan_req_no(reqNo);
			finAcqAsetDAO.deletePlanMstr(reqNo);
			finAcqAsetDAO.deletePlanDtl(reqNo);
		}
		
		finAcqAsetDAO.insertPlanMstr(planMstrVo);
		finAcqAsetPlanVo.setFinAcqAsetPlanMstrVo(planMstrVo);
		
		String planStYmd = planMstrVo.getPlan_st_ymd();
		String planEdYmd = planMstrVo.getPlan_ed_ymd();
		int plan_ymd = 0;
		//plan_ymd = DateUtil.getDaysBetween(planStYmd, planEdYmd) / 30;
		plan_ymd = DateUtil.getMonthsDifference(planStYmd, planEdYmd) + 1;
		
		// 계획 생성 금액 계산
		// 인수자산은 자산의 부가세로만 공급가액, 부가세를 계산한다.
		
		double suplyValue = planMstrVo.getSuply_value();
		double addTax = planMstrVo.getAdd_tax();
		long roundSuplyValue = Math.round(suplyValue / plan_ymd);
		long roundAddTax = Math.round(addTax / plan_ymd);
		long finalSuplyValue = (long) (suplyValue - (roundSuplyValue * plan_ymd));
		long finalAddTax = (long) (addTax - (roundAddTax * plan_ymd));
		
		/*if (finalSuplyValue < 0 || finalAddTax < 0) {
			long lastTotalAmt = finalSuplyValue + finalAddTax;
			long lastSuplyValue = Math.round(lastTotalAmt / 1.1);
			long lastAddTax = lastTotalAmt - Math.round(lastTotalAmt / 1.1);
			finalSuplyValue = lastSuplyValue;
			finalAddTax = lastAddTax;
		}*/
		
		for (int i=1; i<=plan_ymd; i++) {
			planDtlVo.setPlan_seq(i);

			// 마지막 차수에는 잔여금액 추가
			if (plan_ymd != i) { 
				planDtlVo.setSuply_value(roundSuplyValue);
				planDtlVo.setAdd_tax(roundAddTax);
			} else {
				planDtlVo.setSuply_value(roundSuplyValue + finalSuplyValue);
				planDtlVo.setAdd_tax(roundAddTax + finalAddTax);
			}
			String formatPlanStYmd = DateUtil.addMonth(planStYmd, i-1);
			planDtlVo.setRec_ymd(formatPlanStYmd);
			planDtlVo.setRmk(planMstrVo.getAset_no());
			
			finAcqAsetDAO.insertPlanDtl(planDtlVo);
			System.out.println("suplyValue >>>>>>>>>>>>>>>" + suplyValue);
			System.out.println("addTax >>>>>>>>>>>>>>>" + addTax);
			System.out.println("suplyValue / plan_ymd >>>>>>>>>>>>>>>" + suplyValue / plan_ymd);
			System.out.println("addTax / plan_ymd >>>>>>>>>>>>>>>" + addTax / plan_ymd);
			System.out.println("roundSuplyValue >>>>>>>>>>>>>>>" + roundSuplyValue);
			System.out.println("roundAddTax >>>>>>>>>>>>>>>" + roundAddTax);
			System.out.println("finalSuplyValue >>>>>>>>>>>>>>>" + finalSuplyValue);
			System.out.println("finalAddTax >>>>>>>>>>>>>>>" + finalAddTax);
		}
		
		System.out.println("DateUtil.getMonthsDifference(planStYmd, planEdYmd) >>>>> "+DateUtil.getMonthsDifference(planStYmd, planEdYmd));
		System.out.println("plan_ymd >>>>> " + plan_ymd);
		return finAcqAsetPlanVo;
	}
	
	/**
    * 인수자산 수익계획 생성
    * @param TaxAcqAsetPlanMstrVo
    * @return TaxAcqAsetPlanMstrVo
    * @author JenoJW
    * @since 2022.10.10.
    */
	@Override
	public List<FinAcqAsetPlanDtlVo> selectListFinAcqAsetPlan(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo) {
		return finAcqAsetDAO.selectListFinAcqAsetPlan(finAcqAsetPlanDtlVo);
	}
	
	/**
    * 인수자산 부가세 결의생성
    * @param TaxAcqAsetPlanMstrVo
    * @author JenoJW
    * @since 2022.10.10.
    */
	@Override
	public void createSlip(List<FinAcqAsetPlanDtlVo> finAcqAsetPlanDtlListVo) {
		FinComSlipVo slipVo = null;
		
		String unslipNo = "";
		
		//if(StringUtils.isEmpty(finAcqAsetPlanDtlVo.getRec_ymd())){
		//	throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.co.com.0001", new String[]{"결의일자"});
		//}
		
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //
		FspSlipHVo hVo = new FspSlipHVo();
		hVo.setSlip_ymd(DateUtil.getCurrentDate(DateUtil.yyyyMMdd));
		hVo.setWrte_dept(KitechContextUtil.getDeptCd());
		hVo.setWrte_dept_new_ymd(KitechContextUtil.getSession().getDeptNewYmd());
		hVo.setSlip_typ_cd("223");
		hVo.setWrte_psn(KitechContextUtil.getSyspayno());
		// 비고에 어떤값을 넣을지 확인해야함.
		//hVo.setRmk(finAcqAsetPlanDtlVo.getRmk());
		hVo.setRmk("KBCC의무투자자산");
		hVo.setCud_type("C");
		
		unslipNo = slipService.saveSlipH(hVo);
		
		// 1-1) 인터페이스 테이블 저장
		IntfatabVo inftaVo = new IntfatabVo();
		inftaVo.setReqNo(unslipNo);
		inftaVo.setUiId("F203");
		inftaVo.setAprState("XAD010");
		inftaVo.setEndpoints(KitechContextUtil.getUserId());
		apprComService.putXomxintfatab(inftaVo);
		
		// ==================================================== //
		// 2. 결의서 디테일 차변
		// ==================================================== //
		FspSlipDVo dVo = null;
		int seq = -1;
		for(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo : finAcqAsetPlanDtlListVo){
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(hVo.getSlip_ymd());
			
			dVo = new FspSlipDVo();
			seq = seq+2;
			
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);
			dVo.setJourn_cd("Fn9910");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("1");
			dVo.setAccnt_no("FF030001");
			dVo.setAccnt_rspns("19919011");
			dVo.setFomat_unit("FCC011");
			dVo.setAccnt_cd("21017912");
			dVo.setExpns_cd("999");
			//dVo.setTotal_amt(finAcqAsetPlanDtlVo.getTotal_amt());
			//dVo.setUnslip_amt(finAcqAsetPlanDtlVo.getSuply_value());
			//dVo.setTax_amt(finAcqAsetPlanDtlVo.getAdd_tax());
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(finAcqAsetPlanDtlVo.getRmk());
			dVo.setRmk_2(finAcqAsetPlanDtlVo.getVend_fulnm());
			dVo.setReq_no(finAcqAsetPlanDtlVo.getPlan_req_no());
			dVo.setBill_no(finAcqAsetPlanDtlVo.getBill_no());
			dVo.setBsns_psn_regst_no(finAcqAsetPlanDtlVo.getBsns_psn_regst_no());
			
			slipVo.setSlipDVo(dVo);
			
			// 관리항목
			Map<String, String> map2 = new HashMap<String,String>();
			map2.put("unslip_no", unslipNo);
			map2.put("unslip_odr", String.valueOf(seq));
			map2.put("accnt_cd", dVo.getAccnt_cd());
			map2.put("base_debit_cr", dVo.getBase_debit_cr());			
			map2.put("req_no", finAcqAsetPlanDtlVo.getPlan_req_no());
			map2.put("mngmt_accnt_no", "FF030001");
			map2.put("mngmt_2060_nm", "KBCC의무투자자산");
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map2));
			
			// 결의생성 호출
			slipService.saveAutoSlip(slipVo);
		}
		
		// ==================================================== //
		// 3. 결의서 디테일 대변
		// ==================================================== //
		seq = 0;
		for(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo : finAcqAsetPlanDtlListVo){
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(hVo.getSlip_ymd());
			seq = seq + 2;
			
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);
			dVo.setJourn_cd("Fn0140");
			dVo.setJourn_odr(seq);
			dVo.setAccnt_cd("21025100");
			dVo.setBase_debit_cr("2");
			//dVo.setTotal_amt(finAcqAsetPlanDtlVo.getTotal_amt());
			//dVo.setUnslip_amt(finAcqAsetPlanDtlVo.getSuply_value());
			//dVo.setTax_amt(finAcqAsetPlanDtlVo.getAdd_tax());
			dVo.setEvid_cd("");
			dVo.setRmk_1(finAcqAsetPlanDtlVo.getRmk());
			dVo.setRmk_2(finAcqAsetPlanDtlVo.getVend_fulnm());
			
			slipVo.setSlipDVo(dVo);
			// 결의생성 호출
			slipService.saveAutoSlip(slipVo);
		}
		
		// ==================================================== //
		// 4. 결의서 관리항목
		// ==================================================== //
		Map<String, String> map = new HashMap<String,String>();
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("base_debit_cr", dVo.getBase_debit_cr());
		map.put("unslip_no", unslipNo);
		map.put("unslip_odr", String.valueOf(seq));
		map.put("mngmt_accnt_no", "FF030001");
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
		
		// ==================================================== //
		// 5. finAcqAsetPlanDtlVo - unslip_no 저장
		// ==================================================== //	
		for(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo : finAcqAsetPlanDtlListVo){
			finAcqAsetPlanDtlVo.setUnslip_no(unslipNo);
			finAcqAsetPlanDtlVo.setUnslip_odr(seq);
			finAcqAsetDAO.updateBillNo(finAcqAsetPlanDtlVo);
		}
		
		// ==================================================== //
		// 6. 증빙생성
		//   - fspevidattach에 신청번호별로 이미 저장이 된경우에 결의번호만 업데이트가 필요할 경우 : attachService.updateFspEvidAttach
		//   - fspevidattach에 insert가 필요할 경우 : attachService.saveFspEvidAttach
		// ==================================================== //	
		FbaExpnsEvidVo paramVo = new FbaExpnsEvidVo();
		paramVo.setDoc_id("223");
		List<FspEvidAttachVo> evidVoList = attachService.selectFbaExpnsEvidList(paramVo);
		
		for(FspEvidAttachVo evidVo : evidVoList){
			evidVo.setReq_no(unslipNo);
			evidVo.setKey_val(unslipNo);
		}
		attachService.saveFspEvidAttach(evidVoList);
	}

	@Override
	public FinAcqAsetPlanDtlVo updateBillNo(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo) {
		finAcqAsetDAO.updateBillNo(finAcqAsetPlanDtlVo);
		return finAcqAsetPlanDtlVo;
	}
	
	public void cancelSlip(FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo) {
		// 결의서 삭제
		slipService.deleteFspSlip(finAcqAsetPlanDtlVo.getUnslip_no());
		
		// 인터페이스 테이블 삭제
		apprComService.delXomxintfatab(finAcqAsetPlanDtlVo.getUnslip_no());
		
		// 증빙 삭제
		FbaExpnsEvidVo paramVo = new FbaExpnsEvidVo();
		paramVo.setReq_no(finAcqAsetPlanDtlVo.getUnslip_no());
		attachService.deleteFspAttchEvid(paramVo);
		
		// 인수자산 계획 테이블 결의번호 삭제
		finAcqAsetPlanDtlVo.setCancel_unslip_no(finAcqAsetPlanDtlVo.getUnslip_no());
		finAcqAsetPlanDtlVo.setUnslip_no("");
		finAcqAsetPlanDtlVo.setUnslip_odr(0);
		finAcqAsetPlanDtlVo.setBill_no("");
		
		finAcqAsetDAO.updateCancelSlip(finAcqAsetPlanDtlVo);
	}
}
