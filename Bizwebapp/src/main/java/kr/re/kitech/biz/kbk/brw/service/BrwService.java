package kr.re.kitech.biz.kbk.brw.service;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import kr.re.kitech.biz.kbk.brw.vo.KbkBookLoanVo;
import kr.re.kitech.biz.kbk.inv.vo.InvAccntBookVo;

public interface BrwService {
	
	public List<KbkBookLoanVo> selectKbkBrwRetrnMnt(KbkBookLoanVo kbkBookLoanVo) throws Exception;
	
	public int updateKbkBookLoanRetrn(KbkBookLoanVo kbkBookLoanVo) throws Exception;
	
	public List<KbkBookLoanVo> selectKbkLoanList(KbkBookLoanVo kbkBookLoanVo) throws Exception;
	
	public List<KbkBookLoanVo> selectKbkBrwMailList(KbkBookLoanVo kbkBookLoanVo) throws Exception;
	
	public void selectKbkBrwMailSend(LinkedList<LinkedHashMap<String, Object>> list) throws Exception;
	
	/**
     * 도서대출 팝업 조회 
     */
	public KbkBookLoanVo selectKbkBookLoan(InvAccntBookVo vo);
	
	/**
     * 도서대출 팝업 저장
     */
	public void saveKbkBookLoan(KbkBookLoanVo vo);
	
	/**
     * 도서대출 정보 삭제
     */
	public void deleteKbkBookLoan(String loanNo);
}