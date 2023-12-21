package kr.re.kitech.biz.fin.fnd.service;

import java.util.List;

import kr.re.kitech.biz.fin.fnd.vo.FinRcptPaySlipInfoVo;
import kr.re.kitech.biz.fin.fnd.vo.FinRcptPaySlipVo;
import kr.re.kitech.biz.fin.fnd.vo.PaySlipSrcVo;

/**
 * @ClassSubJect 
 * @ClassName : FinRcptPaySlipService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.14.   이영희    최초생성
 * 
 * @author 
 * @since 2023.09.14.
 * @version 1.0
 * @see
 * 
 */
public interface FinRcptPaySlipService {
	/*
	* 출금결의생성 목록 조회
	*/
	public List<FinRcptPaySlipVo> selectFinRcptPaySlipList(PaySlipSrcVo vo);
	/*
	* 출금결의생성 계좌체크(개인지급)
	*/
	public List<FinRcptPaySlipVo> checkBankAccnt(List<FinRcptPaySlipVo> slipList);
	/*
	* 출금결의 취소
	*/
	public void deleteFinRcptPaySlip(PaySlipSrcVo vo);
	/*
	* 출금결의 생성
	*/
	public String saveFinRcptPaySlip(FinRcptPaySlipInfoVo vo);
	
	/*
	* 출금조회 목록 조회
	*/
	public List<FinRcptPaySlipVo> selectFinRcptPaySendList(PaySlipSrcVo vo);

}
  