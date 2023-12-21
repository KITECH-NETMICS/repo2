package kr.re.kitech.biz.fin.fnd.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.com.vo.ResBgAcctmVo;
import kr.re.kitech.biz.fin.fnd.dao.FinRcptPaySlipDAO;
import kr.re.kitech.biz.fin.fnd.service.FinRcptPaySlipService;
import kr.re.kitech.biz.fin.fnd.vo.FinRcptPaySlipInfoVo;
import kr.re.kitech.biz.fin.fnd.vo.FinRcptPaySlipVo;
import kr.re.kitech.biz.fin.fnd.vo.PaySlipSrcVo;
import kr.re.kitech.biz.fin.std.vo.FbaApartAccntVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**
 * @ClassSubJect 출금결의생성
 * @ClassName  FinRcptPaySlipServiceImpl.java
 * @Description 출금결의생성 ServiceImpl
 * @Modification :   
 *     수정일           수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.14.   이영희    최초생성
 * 
 * @author 
 * @since 2023.09.14.
 * @version 1.0
 * @see
 * 
 */
@Service("finRcptPaySlipService")
public class FinRcptPaySlipServiceImpl extends EgovAbstractServiceImpl implements FinRcptPaySlipService {
	@Resource(name="finSlipSaveService")
	private FinSlipSaveService finSlipService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;	
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name="finComService")
	private FinComService finComService;
	
	@Resource(name="finRcptPaySlipDAO")
	private FinRcptPaySlipDAO dao;
    
    /**
     * 출금결의생성 목록 조회
     * @param PaySlipSrcVo
     * @return List<FinRcptPaySlipVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.09.15.
     */
	public List<FinRcptPaySlipVo> selectFinRcptPaySlipList(PaySlipSrcVo vo) throws KitechException{
		return dao.selectFinRcptPaySlipList(vo);
	}
	
	/**
     * 출금결의생성 계좌체크(개인지급)
     * @param List<FinRcptPaySlipVo>
     * @return 
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.09.15.
     */
	public List<FinRcptPaySlipVo> checkBankAccnt(List<FinRcptPaySlipVo> slipList) throws KitechException{
		for(FinRcptPaySlipVo vo : slipList){
			if("FAX001".equals(vo.getPay_clsf())){
				if(vo.getSyspayno() != null && !"".equals(vo.getSyspayno())){
					FbaApartAccntVo accntVo = dao.selectFbaApartAccnt(vo.getSyspayno());
					vo.setBank(accntVo.getBank());
					vo.setBankaccnt_no(accntVo.getBankaccnt_no());
					vo.setDepstr_nm(accntVo.getDepstr_nm());
					
					// 송금내역 계좌정보 수정
					dao.updateFspSendReqBank(vo);
					
				}else{ // 개인번호가 없을 때는 기타(송금)지급으로 코드를 바꿔준다.
					vo.setPay_clsf("FAX090");
					dao.updateFspSendReqPayClsf(vo);
					
					vo.setBank(vo.getBank_send());
					vo.setBankaccnt_no(vo.getBankaccnt_no_send());
					vo.setDepstr_nm(vo.getDepstr_nm_send());
				}
			}
		}
		
		return slipList;
	}
	
	/**
     * 출금결의취소
     * @param FspSlipHVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.09.18.
     */
	public void deleteFinRcptPaySlip(PaySlipSrcVo vo) throws KitechException{
		String unslipNo = vo.getPay_unslip_no();
		
		// 1) 결의서 삭제
		finSlipService.deleteFspSlip(unslipNo);
	
		// 2) 지급결의취소시 송금내역 업데이트
		dao.updateFspSendReqDel(unslipNo);
		
		// 3) 전자증빙삭제(송금의뢰서,출납처리내역)
		attachService.deleteFspAttchEvid(unslipNo, unslipNo);	
	}
	
	/**
     * 출금결의 생성
     * @param FinRcptPaySlipInfoVo
     * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.09.18.
     */
	public String saveFinRcptPaySlip(FinRcptPaySlipInfoVo vo) throws KitechException{
		FspSlipHVo hVo = vo.getSlipHVo();
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //	
		
		String unslipNo = finSlipService.saveAutoSlipH("", null, hVo);
		
		// ==================================================== //
		// 2. 결의서 디테일(차변저장)
		// ==================================================== //	
		List<FinRcptPaySlipVo> slipList = vo.getSlipList();
		
		// 2-1.FF030001 계정 - 계정책임자 및 편성단위 조회
		ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk("FF030001");	
		// 2-2. 대변 회계코드 조회
		String crAccntCd = dao.selectPaySlipAccntCd(slipList.get(0).getBankaccnt_no_send());

		long totAmt = 0;
		for(FinRcptPaySlipVo grdVo : slipList){
			if(dao.selectDupPaySlipCrtCnt(grdVo) > 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.fnd.0001", new String[]{grdVo.getUnslip_no()}); 
			}
			
			totAmt+= grdVo.getSend_req_amt();
		}
		String rmk_1 = slipList.get(0).getRmk_1();
		if(slipList.size() > 1){
			rmk_1 += "외 " + (slipList.size() -1) + "건";
		}
		
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = new FinComSlipVo();
		slipVo.setSlip_ymd(hVo.getSlip_ymd());				
		
		// 2-1. 디테일 저장
		int seq = 1;
		FspSlipDVo dVo = new FspSlipDVo();
		dVo.setUnslip_no(unslipNo);
		dVo.setUnslip_odr(seq);			
		dVo.setJourn_cd("Fn9910");
		dVo.setJourn_odr(seq);
		dVo.setBase_debit_cr("1");
		dVo.setAccnt_no("FF030001");
		dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
		dVo.setFomat_unit(acctmVo.getFomat_unit());
		dVo.setAccnt_cd("21009010");
		dVo.setExpns_cd("999");
		dVo.setUnslip_amt(totAmt);
		dVo.setEvid_cd("FAH999");
		dVo.setRmk_1(rmk_1);
		dVo.setPay_clsf(slipList.get(0).getPay_clsf());
		dVo.setRmk_2(slipList.get(0).getRmk_2());	
		
		slipVo.setSlipDVo(dVo);			
		
		// 2-2. 관리항목
		Map<String, String> map2 = new HashMap<String,String>();
		map2.put("unslip_no", unslipNo);
		map2.put("unslip_odr", String.valueOf(seq));
		map2.put("accnt_cd", dVo.getAccnt_cd());
		map2.put("base_debit_cr", dVo.getBase_debit_cr());			
		map2.put("occr_ymd", hVo.getSlip_ymd());
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map2));
		
		finSlipService.saveAutoSlip(slipVo);
		
		// ==================================================== //
		// 3. 결의서 디테일(대변저장)
		// ==================================================== //	
		slipVo = new FinComSlipVo();
		slipVo.setSlip_ymd(hVo.getSlip_ymd());				
		
		// 2-1. 디테일 저장
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
		dVo.setAccnt_cd(crAccntCd);
		dVo.setExpns_cd("999");
		dVo.setUnslip_amt(totAmt);
		dVo.setEvid_cd("FAH999");
		dVo.setRmk_1(rmk_1);
		dVo.setPay_clsf(slipList.get(0).getPay_clsf());
		dVo.setRmk_2(slipList.get(0).getRmk_2());	
		
		slipVo.setSlipDVo(dVo);			
		
		// 2-2. 관리항목
		map2 = new HashMap<String,String>();
		map2.put("unslip_no", unslipNo);
		map2.put("unslip_odr", String.valueOf(seq));
		map2.put("accnt_cd", dVo.getAccnt_cd());
		map2.put("base_debit_cr", dVo.getBase_debit_cr());			
		map2.put("bank", slipList.get(0).getBank_send());
		map2.put("bankaccnt_no", slipList.get(0).getBankaccnt_no_send());
		map2.put("bank_nm", CodeCacheManager.getInstance().getCode("FAA", slipList.get(0).getBank_send()).getComNm());
		
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map2));
		
		finSlipService.saveAutoSlip(slipVo);
		
		// ==================================================== //
		// 4. 송금내역 지급결의번호 업데이트
		// ==================================================== //	
		for(FinRcptPaySlipVo grdVo : slipList){
			grdVo.setPay_unslip_no(unslipNo);
			grdVo.setPay_unslip_odr(1);
			grdVo.setSend_amt(grdVo.getSend_req_amt());
			
			dao.updateSendReqPayUnslipNo(grdVo);
		}
		
		// ==================================================== //
		// 5. 전자증빙
		// ==================================================== //	
		List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList("430", "Y");
		for(FspEvidAttachVo attachVo : attachList){
			attachVo.setReq_no(unslipNo);
			attachVo.setUnslip_no(unslipNo);
			
			switch(attachVo.getEvid_item_cd()){
				case "F023" : // 송금의뢰서
					attachVo.setKey_val(unslipNo + "," + KitechContextUtil.getSyspayno().substring(2,8));
					break;
				case "F025" : // 출납처리내역
					attachVo.setKey_val(unslipNo + "," + KitechContextUtil.getSyspayno().substring(2,8));
					break;
			}
		}
		attachService.saveFspEvidAttach(attachList);
		
		// 5-1. 전자증빙 호출 시작(크리스피드 이원길)
		EvidAttachVo evidVo = new EvidAttachVo();
		evidVo.setUnslip_no(unslipNo);
		attachService.executeProcess(evidVo);
		
		return unslipNo;
	}

	
	/**
     * 출금조회 목록 조회
     * @param PaySlipSrcVo
     * @return List<FinRcptPaySlipVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.09.15.
     */
	public List<FinRcptPaySlipVo> selectFinRcptPaySendList(PaySlipSrcVo vo) throws KitechException{
		return dao.selectFinRcptPaySendList(vo);
	}
}
