package kr.re.kitech.biz.kbk.bmg.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.kbk.bmg.service.BmgBookReportService;
import kr.re.kitech.biz.kbk.bmg.service.BmgJurnlService;
import kr.re.kitech.biz.kbk.bmg.service.BmgOutUrlService;
import kr.re.kitech.biz.kbk.bmg.vo.BmgBookReportListVo;
import kr.re.kitech.biz.kbk.bmg.vo.BmgSearchVo;
import kr.re.kitech.biz.kbk.bmg.vo.KbkClsfVo;
import kr.re.kitech.biz.kbk.bmg.vo.KbkJurnlContntVo;
import kr.re.kitech.biz.kbk.bmg.vo.KbkJurnlNoVo;
import kr.re.kitech.biz.kbk.bmg.vo.KbkOutUrlVo;
import kr.re.kitech.biz.res.com.service.ResCommService;


/**  
 * @ClassSubJect 도서관리-소장자료검색 관련 처리른 하는 컨트롤러
 * @Class Name KbkBmgController.java
 * @Description 도서관리-소장자료검색 관련 처리른 하는 컨트롤러
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
public class BmgController {
	
    @Resource(name = "bmgBookReportServiceImpl")
    private BmgBookReportService bmgBookReportService;
    
    @Resource(name = "bmgJurnlService")
    private BmgJurnlService bmgJurnlService;
    
    @Resource(name = "bmgOutUrlService")
    private BmgOutUrlService bmgOutUrlService;
	
    @Resource(name = "resCommServiceImpl")
    private ResCommService resCommServiceImpl;
    
    
    @ElService(key="SvcKBKBMGBRSR01")
    @RequestMapping(value="SvcKBKBMGBRSR01")    
    @ElDescription(sub="도서&보고서 목록조회",desc="페이징을 처리하여 도서&보고서 목록 조회를 한다.")               
    public BmgBookReportListVo selectListBookReport(BmgSearchVo searchVo) throws ElException {
    
    	BmgBookReportListVo result = new BmgBookReportListVo();
    	result.setBmgBookReportVoList(bmgBookReportService.selectListBookReport(searchVo));
    	
        return result;            
    }
    
    @ElService(key="SvcKBKBMGBRSU01")
    @RequestMapping(value="SvcKBKBMGBRSU01")    
    @ElDescription(sub="도서&보고서 예약",desc="도서&보고서 중 대출중인 건을 예약한다.")               
    public void updateBookReportReserve(BmgSearchVo searchVo) throws ElException {
    	bmgBookReportService.updateBookReportReserve(searchVo);
    }
    
    @ElService(key="SvcKBKBMGBJNR01")
    @RequestMapping(value="SvcKBKBMGBJNR01")    
    @ElDescription(sub="저널 조회", desc="저널 조회")
    public List<KbkJurnlNoVo> selectKbkBmgJurnlNo(KbkJurnlNoVo kbkJurnlNoVo) throws ElException {
    	return bmgJurnlService.selectKbkBmgJurnlNo(kbkJurnlNoVo);
    }
    
    @ElService(key="SvcKBKBMGBJLR01")
    @RequestMapping(value="SvcKBKBMGBJLR01")    
    @ElDescription(sub="저널권호 조회", desc="저널권호 조회")
    public List<KbkJurnlContntVo> selectKbkBmgJurnlNoList(KbkJurnlContntVo kbkJurnlContntVo) throws ElException {
    	return bmgJurnlService.selectKbkBmgJurnlNoList(kbkJurnlContntVo);
    }
    
    @ElService(key="SvcKBKBMGBJRR01")
    @RequestMapping(value="SvcKBKBMGBJRR01")
    @ElDescription(sub="저널기본정보 조회", desc="저널기본정보 조회")
    public KbkJurnlNoVo selectKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException {
    	return bmgJurnlService.selectKbkJurnlNoReg(kbkJurnlNoVo);
    }
    
    @ElService(key="SvcKBKBMGBJRC01")
    @RequestMapping(value="SvcKBKBMGBJRC01")
    @ElDescription(sub="저널기본정보 등록", desc="저널기본정보 등록")
    public void insertKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException {
    	bmgJurnlService.insertKbkJurnlNoReg(kbkJurnlNoVo);
    }
    
    @ElService(key="SvcKBKBMGBJRU01")
    @RequestMapping(value="SvcKBKBMGBJRU01")
    @ElDescription(sub="저널기본정보 수정", desc="저널기본정보 수정")
    public void updateKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException {
    	bmgJurnlService.updateKbkJurnlNoReg(kbkJurnlNoVo);
    }
    
    @ElService(key="SvcKBKBMGBJRD01")
    @RequestMapping(value="SvcKBKBMGBJRD01")
    @ElDescription(sub="저널기본정보 삭제", desc="저널기본정보 삭제")
    public void deleteKbkJurnlNoReg(KbkJurnlNoVo kbkJurnlNoVo) throws ElException {
    	bmgJurnlService.deleteKbkJurnlNoReg(kbkJurnlNoVo);
    }
    
    @ElService(key="SvcKBKBMGBOUR01")
    @RequestMapping(value="SvcKBKBMGBOUR01")
    @ElDescription(sub="전자정보 조회", desc="전자정보 조회")
    public List<KbkOutUrlVo> selectKbkOutUrlList(KbkOutUrlVo kbkOutUrlVo) throws ElException {
    	String[] clsfArr = kbkOutUrlVo.getClsf_cd().split(",");
		List<KbkClsfVo> clsfList = new ArrayList<KbkClsfVo>();
		for(String cd : clsfArr){
			KbkClsfVo clsfVo = new KbkClsfVo();
			clsfVo.setCd(cd);
			clsfList.add(clsfVo);
		}
		kbkOutUrlVo.setClsfVo(clsfList);
    	
    	return bmgOutUrlService.selectKbkOutUrlList(kbkOutUrlVo);
    }
    
    @ElService(key="SvcKBKBMGOURR01")
    @RequestMapping(value="SvcKBKBMGOURR01")
    @ElDescription(sub="전자정보관리 조회", desc="전자정보관리 조회")
    public KbkOutUrlVo selectKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException {
    	return bmgOutUrlService.selectKbkOutUrlReg(kbkOutUrlVo);
    }
    
    @ElService(key="SvcKBKBMGOURC01")
    @RequestMapping(value="SvcKBKBMGOURC01")
    @ElDescription(sub="전자정보관리 등록", desc="전자정보관리 등록")
    public void insertKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException {
    	bmgOutUrlService.insertKbkOutUrlReg(kbkOutUrlVo);
    }
    
    @ElService(key="SvcKBKBMGOURU01")
    @RequestMapping(value="SvcKBKBMGOURU01")
    @ElDescription(sub="전자정보관리 수정", desc="전자정보관리 수정")
    public void updateKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException {
    	bmgOutUrlService.updateKbkOutUrlReg(kbkOutUrlVo);
    }
    
    @ElService(key="SvcKBKBMGOURD01")
    @RequestMapping(value="SvcKBKBMGOURD01")
    @ElDescription(sub="전자정보관리 삭제", desc="전자정보관리 삭제")
    public void deleteKbkOutUrlReg(KbkOutUrlVo kbkOutUrlVo) throws ElException {
    	bmgOutUrlService.deleteKbkOutUrlReg(kbkOutUrlVo);
    }
}