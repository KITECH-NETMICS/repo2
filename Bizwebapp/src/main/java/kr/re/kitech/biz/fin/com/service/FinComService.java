package kr.re.kitech.biz.fin.com.service;

import java.util.List;
import java.util.Map;

import kr.re.kitech.biz.fin.com.vo.AutoBugtVo;
import kr.re.kitech.biz.fin.com.vo.BBlBugtActRsltVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.com.vo.BugtChkVo;
import kr.re.kitech.biz.fin.com.vo.BugtRamtVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.fin.com.vo.FinCodeNmVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo;
import kr.re.kitech.biz.fin.com.vo.ResBgAcctmVo;
import kr.re.kitech.biz.fin.std.vo.ResBgAcctMVo;
import kr.re.kitech.biz.fin.std.vo.XodfVendAccntVo;

/**
* 결의생성 인터페이스 FinSlipSaveService
* @author LeeYH
* @since 2022.03.07.
*/
public interface FinComService {
	/**
    * 계정종료일자 체크
    */ 
	public ResBgAcctmVo chkClsYmd(String accntNo, String slipYmd, String chkConf);	
	
	/**
    * 신청서 또는 결의서 작성 후 호출
    */ 
	public void budEnfrcMnt01(BblenfrcVo vo);
	
	/**
    * 결의확정시 호출
    */
	public void budEnfrcMnt02(BBlBugtActRsltVo vo);
	
	/**
    * 예산통제자 결재시 호출
    */
	public void budEnfrcMnt04(BblenfrcVo vo);
	
	/**
    * 통제내역결의,구매결의,계정변경신청시 part_all_clsf = F일 경우 원인행위금액 정리
    */
	public void setBblBugtCauseAmt(BBlBugtActRsltVo vo, String etcYn);
	
	/**
    * 신청서 삭제지 집행금액 및 예실 원인행위금액 삭제
    */ 
	public void deleteBudEnfrcMnt(DelBblEnfrcVo vo);
	
	/**
    * 회계코드로 관리항목 셋팅
    */
	public List<FspSlipMngmtVo> getFspSlipMngmt(Map<String, String> map);
	
	/**
    * 계정정보 조회
    */
	public ResBgAcctmVo selectResBgAcctmChk(String accntNo);	
	
	/**
    * selectbox 코드조회 
    */
	public List<FinCodeNmVo> selectCodeList(FinCodeNmVo vo);	
	
	
	/**
    * 결의생성시 예산편성여부 체크
    */
	public BugtRamtVo selectBugtRamtChk(BblenfrcVo vo, String etcYn);	
	
	/**
    * 계정책임자/예산통제자와 예산자동통제
    */
	public AutoBugtVo getAccntAutoBugtPsn(AutoBugtVo vo);
	
	/**
    * 예실반영여부 체크(gfnBugtEtcChk)
    */
	public BugtRamtVo selectBugtEtcChk(BugtChkVo vo);
	
	/**
    * 계정책임자/예산통제자(gfnAccntBugtPsn2)
    */
	public AutoBugtVo getAccntAutoBugtPsn2(AutoBugtVo vo);

	/**
    * 계정번호관리 및 과제변경시 계정마감년도 수정여부체크
    */ 
	public ResBgAcctMVo chkClsYear(ResBgAcctMVo vo);
	/**
	* 자동결의 생성 후 차대변 금액 체크
	*/
	public int selectUnslipAmtCheck(String unslipNo);
	/**
	* 대변 회계코드 조회(구매지급결의시)
	*/
	public String getAccntCd(String evidCd, String cardClsf);
	/**
	* 거래처 계좌번호 조회
	*/
	public XodfVendAccntVo selectXodfVendAccnt(String vendCd);
}
