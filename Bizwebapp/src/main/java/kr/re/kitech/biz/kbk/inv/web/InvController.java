package kr.re.kitech.biz.kbk.inv.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.kbk.inv.service.InvAccntBookListService;
import kr.re.kitech.biz.kbk.inv.service.InvBookListService;
import kr.re.kitech.biz.kbk.inv.service.InvJournalListService;
import kr.re.kitech.biz.kbk.inv.service.InvJurnlVolListService;
import kr.re.kitech.biz.kbk.inv.service.InvPaperListService;
import kr.re.kitech.biz.kbk.inv.service.InvReportListService;
import kr.re.kitech.biz.kbk.inv.service.InvSummaryService;
import kr.re.kitech.biz.kbk.inv.vo.InvAccntBookListVo;
import kr.re.kitech.biz.kbk.inv.vo.InvAccntBookVo;
import kr.re.kitech.biz.kbk.inv.vo.InvAllSummaryVo;
import kr.re.kitech.biz.kbk.inv.vo.InvBookListVo;
import kr.re.kitech.biz.kbk.inv.vo.InvBookSearchVo;
import kr.re.kitech.biz.kbk.inv.vo.InvJournalListVo;
import kr.re.kitech.biz.kbk.inv.vo.InvJournalVo;
import kr.re.kitech.biz.kbk.inv.vo.InvJurnlVolListVo;
import kr.re.kitech.biz.kbk.inv.vo.InvJurnlVolVo;
import kr.re.kitech.biz.kbk.inv.vo.InvPaperListVo;
import kr.re.kitech.biz.kbk.inv.vo.InvPaperVo;
import kr.re.kitech.biz.kbk.inv.vo.InvReportListVo;
import kr.re.kitech.biz.kbk.inv.vo.InvReportVo;
import kr.re.kitech.biz.kbk.inv.vo.InvTransBookListVo;
import kr.re.kitech.biz.kbk.inv.vo.InvTransBookVo;

/**  
 * @ClassSubJect 컨트롤러
 * @Class Name LibController.java
 * @Description  컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/31     개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/03/31
 * @version 1.0
 * @see
 * 
 */

@Controller
public class InvController {

    @Resource(name = "invSummaryServiceImpl")
    InvSummaryService invSummaryService;
    
    @Resource(name = "invBookListServiceImpl")
    InvBookListService invBookListService;
    
    @Resource(name = "invAccntBookListServiceImpl")
    InvAccntBookListService invAccntBookListService;
    
    @Resource(name = "invReportListServiceImpl")
    InvReportListService invReportListService;
    
    @Resource(name = "invJournalListServiceImpl")
    InvJournalListService invjournalListService;
    
    @Resource(name = "invJurnlVolListServiceImpl")
    InvJurnlVolListService invJurnlVolListService;
    
    @Resource(name = "invPaperListServiceImpl")
    InvPaperListService invPaperListService;
    
    
    @ElService(key="SvcKBKINVSUMR01")
    @RequestMapping(value="SvcKBKINVSUMR01")    
    @ElDescription(sub="소장자료현황", desc="소장자료의 현황을 모두 조회하다.")               
    public InvAllSummaryVo selectAllSummary(InvAllSummaryVo temp) throws Exception {  
    	return invSummaryService.selectAllSummary();
    }
    
    @ElService(key="SvcKBKINVLSTR01")
    @RequestMapping(value="SvcKBKINVLSTR01")  
    @ElDescription(sub="단행본 관리 목록 조회", desc="단행본 관리를 위해 단행본의 목록을 조회한다.")               
    public InvBookListVo selectBookList(InvBookSearchVo vo) throws Exception {  
    	InvBookListVo ret = new InvBookListVo(); 
    	
    	ret.setInvBookListVo(invBookListService.selectBookList(vo));
    	
        return ret;            
    }
    
    @ElService(key="SvcKBKINVACTR01")
    @RequestMapping(value="SvcKBKINVACTR01")    
    @ElDescription(sub="계정별 도서구입현황1", desc="계정별 도서구입현황1을 조회한다.")               
    public InvAccntBookListVo selectAccntBookList1(InvAccntBookVo vo) throws Exception {  
    	InvAccntBookListVo ret = new InvAccntBookListVo();
    	ret.setInvAccntBookVoList(invAccntBookListService.selectBookList1(vo));
    	return ret;
    }

    @ElService(key="SvcKBKINVACTR02")
    @RequestMapping(value="SvcKBKINVACTR02")    
    @ElDescription(sub="계정별 도서구입현황2", desc="계정별 도서구입현황2를 조회한다.")               
    public InvAccntBookListVo selectAccntBookList2(InvAccntBookVo vo) throws Exception {
    	InvAccntBookListVo ret = new InvAccntBookListVo();
    	ret.setInvAccntBookVoList(invAccntBookListService.selectBookList2(vo));  
    	return ret;
    }
    
    @ElService(key="SvcKBKINVTRSR01")
    @RequestMapping(value="SvcKBKINVTRSR01")    
    @ElDescription(sub="단행본폐기이관현황 조회", desc="단행본폐기이관현황을 검색조건에 맞게 조회한다.")               
    public InvTransBookListVo selectTransBookList(InvTransBookVo vo) throws Exception {  
    	InvTransBookListVo ret = new InvTransBookListVo();
    	ret.setInvTransBookVoList(invBookListService.selectTransBookList(vo));
    	 
    	return ret;
    }
    
    @ElService(key="SvcKBKINVRPTR01")
    @RequestMapping(value="SvcKBKINVRPTR01")    
    @ElDescription(sub="연구보고서 목록 조회", desc="검색조건에 해당하는 연구보고서의 목록을 조회한다.")
    public InvReportListVo selectReportList(InvReportVo vo) throws Exception {  
    	InvReportListVo ret = new InvReportListVo();
    	ret.setInvReportVoList(invReportListService.selectReportList(vo));
    	
        return ret;
    }
    
    @ElService(key="SvcKBKINVJOUR01")
    @RequestMapping(value="SvcKBKINVJOUR01")    
    @ElDescription(sub="저널 목록 조회", desc="검색조건에 해당하는 저널의 목록을 조회한다.")
    public InvJournalListVo selectJournalList(InvJournalVo vo) throws Exception {  
    	InvJournalListVo ret = new InvJournalListVo();
    	ret.setInvJournalVoList(invjournalListService.selectJournalList(vo));
    	
        return ret;
    }
    
    @ElService(key="SvcKBKINVJURVOL01")
    @RequestMapping(value="SvcKBKINVJURVOL01")    
    @ElDescription(sub="저널권호정보", desc="검색조건에 해당하는 저널권호정보의 목록을 조회한다.")
    public InvJurnlVolListVo selectJurnlVolList(InvJurnlVolVo vo) throws Exception {  
    	InvJurnlVolListVo ret = new InvJurnlVolListVo();
    	ret.setInvJurnlVolVoList(invJurnlVolListService.selectJurnlVolList(vo));
    	
        return ret;
    }
    
    @ElService(key="SvcKBKINVPAPER01")
    @RequestMapping(value="SvcKBKINVPAPER01")    
    @ElDescription(sub="발표논문", desc="검색조건에 해당하는 발표논문 목록을 조회한다.")
    public InvPaperListVo selectPaperList(InvPaperVo vo) throws Exception {  
    	InvPaperListVo ret = new InvPaperListVo();
    	ret.setInvPaperVoList(invPaperListService.selectPaperList(vo));
    	
        return ret;
    }
    
}
