package kr.re.kitech.biz.kbk.pop.service;

import java.util.List;

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

public interface KbkPopService {
	public KbkPopBookDetailVo selectBookDetail(KbkPopSearchVo searchVo) throws ElException;
	/**
	* 단행본 저장
	*/
	public String saveBookDetail(KbkPopBookDetailVo bookDtlVo) throws ElException;
	public void deleteBookDetail(KbkPopBookDetailVo bookDtlVo) throws ElException;
	public KbkPopReportDetailVo selectReportDetail(KbkPopSearchVo searchVo) throws ElException;
	public void saveReportDetail(KbkPopReportDetailVo ReportDtlVo) throws ElException;
	public void deleteReportDetail(KbkPopReportDetailVo ReportDtlVo) throws ElException;
	public void saveBookTrans(KbkPopBookTransVo bookTransVo) throws ElException;
	public List<KbkPopReportDetailVo> selectReportList(KbkPopReportDetailVo searchVo) throws ElException;
	public KbkPopJournalDetailVo selectJournal(KbkPopJournalDetailVo vo) throws ElException;
	public KbkPopPaperDetailVo selectPaper(KbkPopPaperDetailVo vo) throws ElException;
	public KbkPopPaperDetailVo selectAttnceInfo(KbkPopPaperDetailVo vo) throws ElException;
	public List<KbkPopPaperDetailVo> selectPaperPopList(KbkPopPaperDetailVo searchVo) throws ElException;
	public void deletePaperDetail(KbkPopPaperDetailVo paperDtlVo) throws ElException;
	public void savePaperDetail(KbkPopPaperDetailVo paperDtlVo) throws ElException;
	public KbkPopCopyVo selectCopyPop(KbkPopCopyVo vo) throws ElException;
	public void deleteCopyPop(KbkPopCopyVo vo) throws ElException;
	public void insertCopyPop(KbkPopCopyVo vo) throws ElException;
	public void updateCopyPop(KbkPopCopyVo vo) throws ElException;
	public void sendCopyMail(KbkPopCopyVo vo) throws ElException;
	public List<KbkPopJurnlVo> selectJurlNoList(KbkPopJurnlVo searchVo) throws ElException;
	public KbkPopJurnlDetailVo selectJurnlDetailList(KbkPopJurnlDetailVo vo) throws ElException;
	public void saveJurnlDetail(KbkPopJurnlDetailVo vo) throws ElException;
	public void deleteJurnlDetail(KbkPopJurnlDetailVo vo) throws ElException;

}
