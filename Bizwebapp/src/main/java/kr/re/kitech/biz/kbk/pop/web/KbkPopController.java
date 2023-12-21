package kr.re.kitech.biz.kbk.pop.web;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.kbk.pop.service.KbkPopService;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopBookDetailVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopBookTransVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopCopyVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopJournalDetailVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopJurnlDetailVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopJurnlListVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopJurnlVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopPaperDetailVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopPaperListVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopReportDetailVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopReportListVo;
import kr.re.kitech.biz.kbk.pop.vo.KbkPopSearchVo;

@Controller
public class KbkPopController {

    @Resource(name = "kbkPopServiceImpl")
    KbkPopService kbkPopService;

    @ElService(key="SvcKBKPOPDTLR01")
    @RequestMapping(value="SvcKBKPOPDTLR01")    
    @ElDescription(sub="단행본 조회",desc="특정 단행본의 상세 정보를 조회한다.")               
    public KbkPopBookDetailVo selectBookDetail(KbkPopSearchVo searchVo) throws ElException {
    	return kbkPopService.selectBookDetail(searchVo);
    }
    
    @ElService(key="SvcKBKPOPDTLM01")
    @RequestMapping(value="SvcKBKPOPDTLM01")    
    @ElDescription(sub="단행본 저장",desc="특정 단행본의 상세 정보를 등록 하거나 수정한다.")               
    public Map<String,String> saveBookDetail(KbkPopBookDetailVo bookDtlVo) throws ElException {
    	Map<String,String> map = new HashMap<>();
    	map.put("regst_no", kbkPopService.saveBookDetail(bookDtlVo));
    	return map;
    }
    
    @ElService(key="SvcKBKPOPDTLD01")
    @RequestMapping(value="SvcKBKPOPDTLD01")    
    @ElDescription(sub="단행본 삭제",desc="특정 단행본의 상세 정보를 삭제한다.")               
    public void deleteBookDetail(KbkPopBookDetailVo bookDtlVo) throws ElException {
    	kbkPopService.deleteBookDetail(bookDtlVo);
    }
    
    @ElService(key="SvcKBKPOPDTLR02")
    @RequestMapping(value="SvcKBKPOPDTLR02")    
    @ElDescription(sub="보고서 조회",desc="특정 보고서의 상세 정보를 조회한다.")               
    public KbkPopReportDetailVo selectReportDetail(KbkPopSearchVo searchVo) throws ElException {
    	return kbkPopService.selectReportDetail(searchVo);
    }
    
    @ElService(key="SvcKBKPOPDTLM02")
    @RequestMapping(value="SvcKBKPOPDTLM02")    
    @ElDescription(sub="보고서 저장",desc="특정 보고서의 상세 정보를 등록 하거나 수정한다.")               
    public void saveReportDetail(KbkPopReportDetailVo reportDtlVo) throws ElException {
    	kbkPopService.saveReportDetail(reportDtlVo);
    	
    	
    }
    
    @ElService(key="SvcKBKPOPDTLR03")
    @RequestMapping(value="SvcKBKPOPDTLR03")    
    @ElDescription(sub="원내보고서 조회",desc="원내 보고서의 목록을 조회한다.")               
    public KbkPopReportListVo selectReportList(KbkPopReportDetailVo searchVo) throws ElException {
    	KbkPopReportListVo ret = new KbkPopReportListVo();
    	ret.setKbkPopReportDetailVoList(kbkPopService.selectReportList(searchVo));
    	return ret;
    }
    
    @ElService(key="SvcKBKPOPDTLD02")
    @RequestMapping(value="SvcKBKPOPDTLD02")    
    @ElDescription(sub="보고서 삭제",desc="특정 보고서의 상세 정보를 삭제한다.")               
    public void deleteReportDetail(KbkPopReportDetailVo reportDtlVo) throws ElException {
    	kbkPopService.deleteReportDetail(reportDtlVo);
    }
    
    @ElService(key="SvcKBKPOPTRSM01")
    @RequestMapping(value="SvcKBKPOPTRSM01")    
    @ElDescription(sub="단행본 폐기 및 이관 관리", desc="단행본 폐기 및 이관 관리를 위해 폐기/이관 등록 및 단행본을 삭제한다.")               
    public KbkPopBookTransVo saveBookTrans(KbkPopBookTransVo bookTransVo) throws Exception {  
    	kbkPopService.saveBookTrans(bookTransVo);
        return bookTransVo;
    }
    
    @ElService(key="SvcKBKPOPJOUR01")
    @RequestMapping(value="SvcKBKPOPJOUR01")    
    @ElDescription(sub="저널자료 상세 조회",desc="저널자료의 상세 내용을 조회한다.")               
    public KbkPopJournalDetailVo selectReportList(KbkPopJournalDetailVo searchVo) throws ElException {
    	return kbkPopService.selectJournal(searchVo);
    }
    
    @ElService(key="SvcKBKPOPPAPR01")
    @RequestMapping(value="SvcKBKPOPPAPR01")    
    @ElDescription(sub="발표논문 상세 조회",desc="발표논문의 상세 내용을 조회한다.")     
    public KbkPopPaperDetailVo selectPaperList(KbkPopPaperDetailVo searchVo) throws ElException {
    	return kbkPopService.selectPaper(searchVo);
    }
    
    @ElService(key="SvcKBKPOPPAPR02")
    @RequestMapping(value="SvcKBKPOPPAPR02")    
    @ElDescription(sub="참여연구원 조회",desc="참여연구원을 조회한다.")     
    public KbkPopPaperDetailVo selectAttnceInfo(KbkPopPaperDetailVo searchVo) throws ElException {
    	return kbkPopService.selectAttnceInfo(searchVo);
    }
    
    @ElService(key="SvcKBKPOPPAPR03")
    @RequestMapping(value="SvcKBKPOPPAPR03")    
    @ElDescription(sub="발표논문팝업 조회",desc="발표논문 팝업에서 상세 내용을 조회한다.")     
    public KbkPopPaperListVo selectPaperPopList(KbkPopPaperDetailVo searchVo) throws ElException {
    	KbkPopPaperListVo ret = new KbkPopPaperListVo();
    	ret.setKbkPopPaperDetailVoList(kbkPopService.selectPaperPopList(searchVo));
    	return ret;
    }
         
    @ElService(key="SvcKBKPOPDTLPA01")
    @RequestMapping(value="SvcKBKPOPDTLPA01")    
    @ElDescription(sub="발표논문 삭제",desc="특정 발표논문의 상세 정보를 삭제한다.")               
    public void deletePaperDetail(KbkPopPaperDetailVo paperDtlVo) throws ElException {
    	kbkPopService.deletePaperDetail(paperDtlVo);
    }
    
    @ElService(key="SvcKBKPOPDTLPA02")
    @RequestMapping(value="SvcKBKPOPDTLPA02")    
    @ElDescription(sub="발표논문 저장",desc="특정 발표논문의 상세 정보를 등록하거나 수정한다.")               
    public void savePaperDetail(KbkPopPaperDetailVo paperDtlVo) throws ElException {
    	kbkPopService.savePaperDetail(paperDtlVo);
    }
    
    
    @ElService(key="SvcKBKPOPCOPY01")
    @RequestMapping(value="SvcKBKPOPCOPY01")    
    @ElDescription(sub="원문복사 조회",desc="원문복사 팝업에서 상세 내용을 조회한다.")
    public KbkPopCopyVo selectCopyPop(KbkPopCopyVo vo) throws ElException {
    	return kbkPopService.selectCopyPop(vo);
    }
    
    @ElService(key="SvcKBKPOPCOPY02")
    @RequestMapping(value="SvcKBKPOPCOPY02")    
    @ElDescription(sub="원문복사 저장",desc="특정 원문복사의 상세 정보를 등록한다.")               
    public void insertCopyPop(KbkPopCopyVo vo) throws ElException {
    	kbkPopService.insertCopyPop(vo);
    }

    @ElService(key="SvcKBKPOPCOPY03")
    @RequestMapping(value="SvcKBKPOPCOPY03")    
    @ElDescription(sub="원문복사 수정",desc="특정 원문복사의 상세 정보를 수정한다.")               
    public void updateCopyPop(KbkPopCopyVo vo) throws ElException {
    	kbkPopService.updateCopyPop(vo);
    }

    @ElService(key="SvcKBKPOPCOPY04")
    @RequestMapping(value="SvcKBKPOPCOPY04")    
    @ElDescription(sub="원문복사 삭제",desc="특정 원문복사의 상세 정보를 삭제한다.")               
    public void deleteCopyPop(KbkPopCopyVo vo) throws ElException {
    	kbkPopService.deleteCopyPop(vo);
    } 
       
    @ElService(key="SvcKBKPOPMAIL01")
    @RequestMapping(value="SvcKBKPOPMAIL01")    
    @ElDescription(sub="원문복사 메일 발송",desc="원문복사 메일을 발송한다.")
    public void sendCopyMail(KbkPopCopyVo vo) throws ElException {
    	kbkPopService.sendCopyMail(vo);
    }
    
    @ElService(key="SvcKBKPOPJURR01")
    @RequestMapping(value="SvcKBKPOPJURR01")    
    @ElDescription(sub="저널번호 조회",desc="저널번호를 조회한다.")               
    public KbkPopJurnlListVo selectJurlNoList(KbkPopJurnlVo searchVo) throws ElException {
    	KbkPopJurnlListVo ret = new KbkPopJurnlListVo();
    	ret.setKbkPopJurnlVoList(kbkPopService.selectJurlNoList(searchVo));
    	return ret;
    }
    
    
    @ElService(key="SvcKBKPOPJRDR01")
    @RequestMapping(value="SvcKBKPOPJRDR01")    
    @ElDescription(sub="저널권호 상세 조회",desc="저널권호의 상세 내용을 조회한다.")     
    public KbkPopJurnlDetailVo selectJurnlDetailList(KbkPopJurnlDetailVo vo) throws ElException {
    	return kbkPopService.selectJurnlDetailList(vo);
    }
    
    @ElService(key="SvcKBKPOPJRDM01")
    @RequestMapping(value="SvcKBKPOPJRDM01")    
    @ElDescription(sub="저널권호 신규 저장",desc="저널권호를 저장한다.")               
    public void saveJurnlDetail(KbkPopJurnlDetailVo vo) throws ElException {
    	kbkPopService.saveJurnlDetail(vo);
    }

    @ElService(key="SvcKBKPOPJRDD01")
    @RequestMapping(value="SvcKBKPOPJRDD01")    
    @ElDescription(sub="저널권호 삭제",desc="특정 저널권호를 삭제한다.")               
    public void deleteJurnlDetail(KbkPopJurnlDetailVo vo) throws ElException {
    	kbkPopService.deleteJurnlDetail(vo);
    } 

    
    
}
