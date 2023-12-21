package kr.re.kitech.biz.kbk.pop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.kbk.pop.vo.KbkPopBookDetailVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopBookTransVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopCopyVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopJournalDetailVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopJurnlDetailVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopJurnlVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopPaperDetailVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopReportDetailVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopSearchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Repository("kbkPopDAO")
public class KbkPopDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {
	/**
     * 단행본 기본정보 등록 팝업 조회
     * @param KbkPopSearchVo
     * @return KbkPopBookDetailVo
     * @throws KitechException
     */
	public KbkPopBookDetailVo selectBookDetail(KbkPopSearchVo searchVo) throws ElException {
		return (KbkPopBookDetailVo)selectByPk("kr.re.kitech.biz.kbk.pop.selectBookDetail", searchVo);
	}
	
	public String insertBook(KbkPopBookDetailVo bookDtlVo) throws ElException {
		
		insert("kr.re.kitech.biz.kbk.pop.insertBook", bookDtlVo);
		
    	return bookDtlVo.getRegst_no();
	}
	
	public void updateBook(KbkPopBookDetailVo bookDtlVo) throws ElException {
		update("kr.re.kitech.biz.kbk.pop.updateBook", bookDtlVo);
	}
		
	public void deleteBookDetail(KbkPopBookDetailVo bookDtlVo) throws ElException {
		delete("kr.re.kitech.biz.kbk.pop.deleteBook", bookDtlVo);
	}
	
	public KbkPopReportDetailVo selectReportDetail(KbkPopSearchVo searchVo) throws ElException {
		return (KbkPopReportDetailVo)selectByPk("kr.re.kitech.biz.kbk.pop.selectReportDetail", searchVo);
	}
	
	public String insertReport(KbkPopReportDetailVo reportDtlVo) throws ElException {
		
		insert("kr.re.kitech.biz.kbk.pop.insertReport", reportDtlVo);
		
    	return reportDtlVo.getRegst_no();
	}
	
	public void updateReport(KbkPopReportDetailVo reportDtlVo) throws ElException {
		update("kr.re.kitech.biz.kbk.pop.updateReport", reportDtlVo);
	}
		
	public void deleteReport(KbkPopReportDetailVo reportDtlVo) throws ElException {
		delete("kr.re.kitech.biz.kbk.pop.deleteReport", reportDtlVo);
	}
	
	public void insertBookTrans(KbkPopBookTransVo bookTransVo) throws ElException {
		insert("kr.re.kitech.biz.kbk.pop.insertBookTrans", bookTransVo);
	}
	
	public void deleteBookTrans(KbkPopBookTransVo bookTransVo) throws ElException {
		delete("kr.re.kitech.biz.kbk.pop.deleteBookTrans", bookTransVo);
	}
	
	/**
     * 단행본 복구를 위한 이관정보 조회
     * @param KbkPopBookTransVo
     * @return KbkPopBookDetailVo
     * @throws KitechException
     */
	public KbkPopBookDetailVo selectBookTrans(KbkPopBookTransVo bookTransVo) throws ElException {
		return (KbkPopBookDetailVo) selectByPk("kr.re.kitech.biz.kbk.pop.selectTransBook", bookTransVo);
	}
	
	public List<KbkPopReportDetailVo> selectReportList(KbkPopReportDetailVo searchVo) throws ElException {
		return list("kr.re.kitech.biz.kbk.pop.selectReschRptp", searchVo);
	}
	
	public KbkPopJournalDetailVo selectJournal(KbkPopJournalDetailVo vo) throws ElException {
		return (KbkPopJournalDetailVo)selectByPk("kr.re.kitech.biz.kbk.pop.selectJournal", vo);
	}
	
	public KbkPopPaperDetailVo selectPaper(KbkPopPaperDetailVo vo) throws ElException {
		return (KbkPopPaperDetailVo)selectByPk("kr.re.kitech.biz.kbk.pop.selectPaper", vo);
	}
		
	public KbkPopPaperDetailVo selectAttnceInfo(KbkPopPaperDetailVo vo) throws ElException {
		return (KbkPopPaperDetailVo)selectByPk("kr.re.kitech.biz.kbk.pop.selectAttnceInfo", vo);
	}
		
	public List<KbkPopPaperDetailVo> selectPaperPopList(KbkPopPaperDetailVo searchVo) throws ElException {
		return list("kr.re.kitech.biz.kbk.pop.selectPaperPopList", searchVo);
	}
		
	public KbkPopPaperDetailVo selectRegstNo() throws ElException {
		return (KbkPopPaperDetailVo)selectByPk("kr.re.kitech.biz.kbk.pop.selectRegstNo");
	}
		
	public void deletePaperDetail(KbkPopPaperDetailVo paperDtlVo) throws ElException {
		delete("kr.re.kitech.biz.kbk.pop.deletePaper", paperDtlVo);
	}
		
	public void updatePaperDetail(KbkPopPaperDetailVo paperDtlVo) throws ElException {
		update("kr.re.kitech.biz.kbk.pop.updatePaper", paperDtlVo);
	}
		
	public void insertPaperDetail(KbkPopPaperDetailVo paperDtlVo) throws ElException {
		insert("kr.re.kitech.biz.kbk.pop.insertPaper", paperDtlVo);   
	}
	
	public KbkPopCopyVo selectCopyPop(KbkPopCopyVo vo) throws ElException {
		return (KbkPopCopyVo)selectByPk("kr.re.kitech.biz.kbk.pop.selectCopyPop", vo);
	}
		
	public void deleteCopyPop(KbkPopCopyVo vo) throws ElException {
		delete("kr.re.kitech.biz.kbk.pop.deleteCopyPop", vo);
	}
		
	public void updateCopyPop(KbkPopCopyVo vo) throws ElException {
		update("kr.re.kitech.biz.kbk.pop.updateCopyPop", vo);
	}
		
	public void insertCopyPop(KbkPopCopyVo vo) throws ElException {
		insert("kr.re.kitech.biz.kbk.pop.insertCopyPop", vo);   
	}
	
	public List<KbkPopJurnlVo> selectJurlNoList(KbkPopJurnlVo searchVo) throws ElException {
		return list("kr.re.kitech.biz.kbk.pop.selectJurlNoList", searchVo);
	}
	
		
	public KbkPopJurnlDetailVo selectJurnlDetailList(KbkPopJurnlDetailVo vo) throws ElException {
		return (KbkPopJurnlDetailVo)selectByPk("kr.re.kitech.biz.kbk.pop.selectJurnlDetailList", vo);
	}
	
	public void insertJurnlDetail(KbkPopJurnlDetailVo vo) throws ElException {
		insert("kr.re.kitech.biz.kbk.pop.insertJurnlDetail", vo);   
	}
	
	public void updateJurnlDetail(KbkPopJurnlDetailVo vo) throws ElException {
		insert("kr.re.kitech.biz.kbk.pop.updateJurnlDetail", vo);   
	}		
	
	public void deleteJurnlDetail(KbkPopJurnlDetailVo vo) throws ElException {
		delete("kr.re.kitech.biz.kbk.pop.deleteJurnlDetail", vo);
	}
	
}
