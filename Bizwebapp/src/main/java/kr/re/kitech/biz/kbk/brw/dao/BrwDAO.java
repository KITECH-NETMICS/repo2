package kr.re.kitech.biz.kbk.brw.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.kbk.brw.vo.KbkBookLoanVo;
import kr.re.kitech.biz.kbk.inv.vo.InvAccntBookVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Repository("brwDAO")
public class BrwDAO extends BizDefaultAbstractDAO {
	
	/**
     * 대출반납관리 조회
     * @param KbkBookLoanVo
     * @return List
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<KbkBookLoanVo> selectKbkBrwRetrnMnt(KbkBookLoanVo kbkBookLoanVo) throws Exception {
        return (List<KbkBookLoanVo>)list("kr.re.kitech.biz.kbk.brw.selectKbkBrwRetrnMnt", kbkBookLoanVo);
    }
    
    /**
     * 대출반납관리 수정
     * @param KbkBookLoanVo
     * @return int
     * @throws Exception
     */
	public int updateKbkBookLoanRetrn(KbkBookLoanVo kbkBookLoanVo) throws Exception {
        return update("kr.re.kitech.biz.kbk.brw.updateKbkBookLoanRetrn", kbkBookLoanVo);
    }
    
    /**
     * 대출현황 조회
     * @param KbkBookLoanVo
     * @return List
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<KbkBookLoanVo> selectKbkLoanList(KbkBookLoanVo kbkBookLoanVo) throws Exception {
        return (List<KbkBookLoanVo>)list("kr.re.kitech.biz.kbk.brw.selectKbkLoanList", kbkBookLoanVo);
    }
    
    /**
     * 대출메일 조회
     * @param KbkBookLoanVo
     * @return List
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<KbkBookLoanVo> selectKbkBrwMailList(KbkBookLoanVo kbkBookLoanVo) throws Exception {
        return (List<KbkBookLoanVo>)list("kr.re.kitech.biz.kbk.brw.selectKbkBrwMailList", kbkBookLoanVo);
    }
    
    /**
     * 도서대출 팝업 조회 
     * @param KbkBookLoanVo
     * @return KbkBookLoanVo
     * @throws Exception
     */
    public KbkBookLoanVo selectKbkBookLoan(InvAccntBookVo vo) throws KitechException{
    	return (KbkBookLoanVo)selectByPk("kr.re.kitech.biz.kbk.brw.selectKbkBookLoan", vo);
    }
    
    /**
     * 대출정보 신규등록시 기존 대출정보 수정
     * @param String
     * @return int
     * @throws Exception
     */
    public int updateKbkBookLoanValidYn(String bookNo) throws KitechException{
    	return update("kr.re.kitech.biz.kbk.brw.updateKbkBookLoanValidYn", bookNo);
    }
    
    /**
     * 대출정보 등록
     * @param KbkBookLoanVo
     * @return int
     * @throws Exception
     */
    public int insertKbkBookLoan(KbkBookLoanVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.kbk.brw.insertKbkBookLoan", vo);
    }
    
     /**
     * 도서대출 팝업 대출정보 수정
     * @param KbkBookLoanVo
     * @return int
     * @throws Exception
     */
	public int updateKbkBookLoan(KbkBookLoanVo kbkBookLoanVo) throws KitechException {
        return update("kr.re.kitech.biz.kbk.brw.updateKbkBookLoan", kbkBookLoanVo);
    }
    
    /**
     * 도서대출 팝업 대출정보 삭제
     * @param String
     * @return int
     * @throws Exception
     */
    public int deleteKbkBookLoan(String loanNo) throws KitechException{
    	return delete("kr.re.kitech.biz.kbk.brw.deleteKbkBookLoan", loanNo);
    }
}