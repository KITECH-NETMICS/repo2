package kr.re.kitech.biz.fin.com.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.com.vo.AutoBugtVo;
import kr.re.kitech.biz.fin.com.vo.BBlBugtActRsltVo;
import kr.re.kitech.biz.fin.com.vo.BblEnfrcDelVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcOldVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.com.vo.BugtChkVo;
import kr.re.kitech.biz.fin.com.vo.BugtRamtVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.fin.com.vo.FbaCardVo;
import kr.re.kitech.biz.fin.com.vo.FinCodeNmVo;
import kr.re.kitech.biz.fin.com.vo.FinComAmtChkVo;
import kr.re.kitech.biz.fin.com.vo.LogBugCtrlMdlVo;
import kr.re.kitech.biz.fin.com.vo.ResBgAcctmVo;
import kr.re.kitech.biz.fin.std.vo.FbaAccntMngmtVo;
import kr.re.kitech.biz.fin.std.vo.XodfVendAccntVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**  
 * @ClassSubJect 재무공통 
 * @Class Name : FinComDAO.java
 * @Description : 재무공통 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/08   이영희                최초생성
 * 
 * @author LeeYh
 * @since 2022/03/08
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("finComDAO")
public class FinComDAO extends BizDefaultAbstractDAO {	
	/**
     * 계정번호 정보를 조회한다.
     * @param vo 인터페이스 vo
     * @throws Exception
     */
	public ResBgAcctmVo selectResBgAcctmChk(String accntNo) throws ElException{
		return (ResBgAcctmVo)selectByPk("kr.re.kitech.biz.fin.com.selectResBgAcctmChk", accntNo);
	}	
	
	/**
     * 일반예실구분 및 예실유무 체크(budEnfrcMnt01)
     * @param BblenfrcVo
     * @return Map
     * @throws Exception
     */
	public BblenfrcOldVo selectBblEnfrcChk1(BblenfrcVo vo) throws ElException{
		return (BblenfrcOldVo)selectByPk("kr.re.kitech.biz.fin.com.selectBblEnfrcChk1", vo);
	}
	
	/**
     * 기타예실 또는 예실 구분(selectBugtRamtChk)
     * @param String(계정번호)
     * @return String
     * @throws Exception
     */
	public String selectXodxCommstEtcYn(String accntNo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.fin.com.selectXodxCommstEtcYn", accntNo);
	}
	
	/**
     * 272결의 기타예실 예산금액조회(budEnfrcMnt01)
     * @param BblenfrcVo
     * @return BugtRamtVo
     * @throws Exception
     */
	public BugtRamtVo selectBblBugtActRsltEtcSS22(BblenfrcVo vo) throws ElException{
		return(BugtRamtVo)selectByPk("kr.re.kitech.biz.fin.com.selectBblBugtActRsltEtcSS22", vo);
	}
	
	/**
     * 272결의 이외의  기타예실 예산금액조회(budEnfrcMnt01)
     * @param BblenfrcVo
     * @return BugtRamtVo
     * @throws Exception
     */
	public BugtRamtVo selectBblBugtActRsltEtcSS21(BblenfrcVo vo) throws ElException{
		return(BugtRamtVo)selectByPk("kr.re.kitech.biz.fin.com.selectBblBugtActRsltEtcSS21", vo);
	}
	
	/**
     * 일반예실 통제방법 조회(budEnfrcMnt01)
     * @param BblenfrcVo
     * @return BugtRamtVo
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public Map<String,String> selectBblBugtActRsltSS01(BblenfrcVo vo) throws ElException{
		return(Map<String,String>)selectByPk("kr.re.kitech.biz.fin.com.selectBblBugtActRsltSS01", vo);
	}
	
	/**
     * 잔액통제 예실검증
     * @param BblenfrcVo
     * @return BugtRamtVo
     * @throws Exception
     */
	public BugtRamtVo selectBblBugtActRsltSS22(BblenfrcVo vo) throws ElException{
		return(BugtRamtVo)selectByPk("kr.re.kitech.biz.fin.com.selectBblBugtActRsltSS22", vo);
	}
	
	/**
     * 일반예실정보 조회 - 비목통제 (예통모듈 잔액조회시 사용)-(budEnfrcMnt01)
     * @param BblenfrcVo
     * @return BugtRamtVo
     * @throws Exception
     */
	public BugtRamtVo selectBblBugtActRsltSS23(Map<String, String> map) throws ElException{
		return(BugtRamtVo)selectByPk("kr.re.kitech.biz.fin.com.selectBblBugtActRsltSS23", map);
	}
	
	/**
     * 예산통제모듈(예산 전체잔액 체크)(budEnfrcMnt01)
     * @param BblenfrcVo
     * @return BugtRamtVo
     * @throws Exception
     */
	public BugtRamtVo selectBblBugtActRsltSS24(BblenfrcVo vo) throws ElException{
		return(BugtRamtVo)selectByPk("kr.re.kitech.biz.fin.com.selectBblBugtActRsltSS24", vo);
	}
	
	/**
     * 집행내역 저장(budEnfrcMnt01)
     * @param BblenfrcVo
     * @return int
     * @throws Exception
     */
	public int mergeBblenfrc(BblenfrcVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.mergeBblenfrc", vo);
	}
	
	/**
     * 집행내역 입력에 따른 기타 예실 신청금액 수정(budEnfrcMnt01)
     * @param BblenfrcVo
     * @return int
     * @throws Exception
     */
	public int updateBblBugtActRsltEtc(FinComAmtChkVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateBblBugtActRsltEtc", vo);
	}
	
	/**
     * 집행내역 입력에 따른 예실 신청금액 수정(budEnfrcMnt01)
     * @param Map
     * @return int
     * @throws Exception
     */
	public int updateBblBugtActRslt(FinComAmtChkVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateBblBugtActRslt", vo);
	}
	
	/**
     * 집행내역 입력에 따른 예실 신청금액 수정(budEnfrcMnt01)
     * @param Map
     * @return BblenfrcVo
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<BblEnfrcDelVo> selectBblenfrcSS04(DelBblEnfrcVo vo) throws ElException{
		return (List<BblEnfrcDelVo>)list("kr.re.kitech.biz.fin.com.selectBblenfrcSS04", vo);
	}
	
	/**
     * 집행내역 삭제(budEnfrcMnt01)
     * @param BblenfrcVo
     * @return int
     * @throws Exception
     */
	public int deleteBblEnfrc(BblEnfrcDelVo vo) throws ElException{
		return delete("kr.re.kitech.biz.fin.com.deleteBblEnfrc", vo);
	}
	
	/**
     * 예산통제모듈 log저장
     * @param LogBugCtrlMdlVo
     * @return int
     * @throws Exception
     */
	public int insertLogBugCtrlMdl(LogBugCtrlMdlVo vo) throws ElException{
		return insert("kr.re.kitech.biz.fin.com.insertLogBugCtrlMdl", vo);
	}
	
	/**
     * 회계코드별 관리항목 조회
     * @param FbaAccntMngmtVo
     * @return List<FbaAccntMngmtVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FbaAccntMngmtVo> selectFbaAccntMngmtList(FbaAccntMngmtVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.com.selectFbaAccntMngmtList", vo);
	}
	
	/**
     * 회계코드별 관리항목 조회
     * @param req_no
     * @return String evid_mngmt_no
     * @throws Exception
     */
	public String selectEvidMngmtNo(String reqNo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.fin.com.selectEvidMngmtNo", reqNo);
	}
	
	/**
     * selectbox Code 조회
     * @param FinSlipSearchVo
     * @return List<FinCodeNmVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FinCodeNmVo> selectCodeList(FinCodeNmVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.com.selectCodeList", vo);
	}
	
	/**
     * 카드 기본정보 조회
     * @param String(cardNo)
     * @return FbaCardVo
     * @throws Exception
     */	
	public FbaCardVo selectFbaCard(String cardNo) throws ElException{
		return (FbaCardVo)selectByPk("kr.re.kitech.biz.fin.com.selectFbaCard", cardNo);
	}
	
	/**
     * 결의생성시 예산편성여부 체크
     * @param BugtChkVo
     * @return BugtChkVo
     * @throws Exception
     */	
	public long selectBugtChk(BugtChkVo vo) throws ElException{
		return (long)selectByPk("kr.re.kitech.biz.fin.com.selectBugtChk", vo);
	}
	
	/**
     * 경비결의,일반결의,소액물품,근거리출장결의, 국내출장, 기업현장출장, 근거리출장시 자동통제여부 조회
     * @param AutoBugtVo
     * @return AutoBugtVo
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<AutoBugtVo> selectAutoBugtPsn(AutoBugtVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.com.selectAutoBugtPsn", vo);
	}
	
	/**
     * 경비결의,일반결의,소액물품,근거리출장결의, 국내출장, 기업현장출장, 근거리출장시 자동통제여부 조회
     * @param AutoBugtVo
     * @return AutoBugtVo
     * @throws Exception
     */	
	public String selectXodfAccntCtrlYn(String accntCd) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.fin.com.selectXodfAccntCtrlYn", accntCd);
	}
	
	/**
     * 차액[원인금액 - 대체금액 = 차감액] 조회
     * @param String ctrlNo
     * @return BBlBugtActRsltVo
     * @throws Exception
     */	
	public FinComAmtChkVo selectBblEnfrcAmt(BBlBugtActRsltVo vo) throws ElException{
		return (FinComAmtChkVo)selectByPk("kr.re.kitech.biz.fin.com.selectBblEnfrcAmt", vo);
	}
	
	/**
     * 통제내역결의,구매결의,계정변경신청시 part_all_clsf = F일 경우 집행내역 원인행위금액 정리
     * @param BBlBugtActRsltVo
     * @return int
     * @throws Exception
     */	
	public int updateBblEnfrcCauseAmt(FinComAmtChkVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateBblEnfrcCauseAmt", vo);
	}
	
	/**
     * 구매지급결의서 Logic 상에서 결의서 Datail 입력 후 통제내역 금액 추가 Update
     * @param BBlBugtActRsltVo
     * @return int
     * @throws Exception
     */	
	public int updateBblenFrcAddAmt(BblenfrcVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateBblenFrcAddAmt", vo);
	}	
	
	/**
     * 결의확정시 예실 수정
     * @param BBlBugtActRsltVo
     * @return int
     * @throws Exception
     */	
	public int updateBblBugtActRsltDecsn(BBlBugtActRsltVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateBblBugtActRsltDecsn", vo);
	}
	
	/**
     * 결의확정시 기타예실 수정
     * @param BBlBugtActRsltVo
     * @return int
     * @throws Exception
     */	
	public int updateBblBugtActRsltEtcDecsn(BBlBugtActRsltVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateBblBugtActRsltEtcDecsn", vo);
	}
	
	/**
     * 결의확정시 기타예실 수정
     * @param BBlBugtActRsltVo
     * @return int
     * @throws Exception
     */	
	public int updateBblBugtActRsltEtcEnfrcAmt(BBlBugtActRsltVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateBblBugtActRsltEtcEnfrcAmt", vo);
	}
	
	/**
     * 예실반영여부 체크
     * @param BugtChkVo
     * @return BugtRamtVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.08.30.
     */	
	public BugtRamtVo selectBugtEtcChk(BugtChkVo vo) throws ElException{
		return (BugtRamtVo)selectByPk("kr.re.kitech.biz.fin.com.selectBugtEtcChk", vo);
	}
	
	/**
     * 계정책임자, 예산통제자조회(gfnAccntBugtPsn2)
     * @param CheckSrcVo
     * @return List<AutoBugtVo>
     * @throws Exception
     * @author LeeYH
     * @since 2022.11.23.
     */	
	@SuppressWarnings("unchecked")
	public List<AutoBugtVo> selectComBugtCtrlPsn(AutoBugtVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.com.selectComBugtCtrlPsn", vo);
	}
	
	/**
	 * 계정번호관리 - 계정 수정 시 계정년마감 체크
	 * @param BugtChkVo
	 * @return BugtChkVo
	 * @throws ElException
	 * @author timothee
	 * @since 2023.09.25.
	 */
	public BugtChkVo selectBblBugtActRslt(BugtChkVo vo) throws ElException {
		return (BugtChkVo) selectByPk("kr.re.kitech.biz.fin.com.selectBblBugtActRslt", vo);
	}
	
	/**
	 * 자동결의 생성 후 차대변 금액 체크
	 * @param String unslipNo
	 * @return int
	 * @throws ElException
	 */
	public int selectUnslipAmtCheck(String unslipNo) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.fin.com.selectUnslipAmtCheck", unslipNo);
	}
	
	/**
	 * 거래처 계좌번호 조회
	 * @param String vendCd
	 * @return XodfVendAccntVo
	 * @throws ElException
	 */
	public XodfVendAccntVo selectXodfVendAccnt(String vendCd) throws ElException{
		return (XodfVendAccntVo)selectByPk("kr.re.kitech.biz.fin.com.selectXodfVendAccnt", vendCd);
	}
}
