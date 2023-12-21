package kr.re.kitech.biz.fin.mail.service;

import kr.re.kitech.biz.fin.tax.vo.FinPurTaxSrcVo;
import kr.re.kitech.biz.fin.tax.vo.FinTaxSearchVo;

/**
 * 재무관리 메일발송 인터페이스
 * @author LeeYH-PC
 *
 */
public interface FinMailSendService {
	/*
     * 소액물품결의(119) 결재완료 후 메일발송
	 */
	public void mailSendSmlItemApr(String reqNo, String sysPayNo);
	/*
	* 매출계산서(관) 미처리이메일전송
	*/
	public void sendFtxBillUnprcsEmail(FinTaxSearchVo vo);
	/*
	* 매입계산서(관) 미처리이메일전송
	*/
	public void sendKtxBillUnprcsEmail(FinPurTaxSrcVo vo);
}
