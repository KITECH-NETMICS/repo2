package kr.re.kitech.biz.res.ape.service;

/**
 * 과제정산 Interface
 * @author LeeYH
 * @since 2022.07.14.
 */
public interface ResPrjEndService {
	/*
    * 연구비정산결의취소
    */
	public void deleteResPrjEndSlip(String unslipNo, String reqNo);
}
