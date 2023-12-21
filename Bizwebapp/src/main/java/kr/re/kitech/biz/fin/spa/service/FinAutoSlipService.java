package kr.re.kitech.biz.fin.spa.service;

import kr.re.kitech.biz.fin.com.vo.ComReqVo;

/**
 * 기술료인센티브 결의생성 SERVICE
 * @author LeeYH
 * @since 2022.07.13.
 */
public interface FinAutoSlipService {
	/*
    * 기술료 인센티브 결의 삭제
    */
	public void deleteFinpstpictSlipMnt(String unslipNo);
	
	/*
    * 연구비 송금결의 삭제
    */
	public void deleteFinReschSendSlipMnt(String reqNo);
	
	/*
    * 구매지급결의 삭제
    */
	public void deletePurPayReqSlip(String unslipNo);
	
	/*
    * 가지급금신청 삭제
    */
	public void deleteFinPayAdvcReqSlipMnt(String unslipNo, String reqNo);
	
	/*
    * 가지급금정산 삭제
    */
	public void deleteFinPayAdvcAdjstSlipMnt(String unslipNo, String reqNo);
	
	/*
    * 내부기술지원신청 결의취소
    */
	public void deleteFinTechSupSlipMnt(ComReqVo vo);
	
	/*
    * 국내, 해외 출장정산 결의취소
    */
	public void deleteFinTripAdjstSlipMnt(ComReqVo vo);
}
