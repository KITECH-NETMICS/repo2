package kr.re.kitech.biz.kbk.brw.web;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.kbk.brw.service.BrwService;
import kr.re.kitech.biz.kbk.brw.vo.KbkBookLoanVo;
import kr.re.kitech.biz.kbk.inv.vo.InvAccntBookVo;

@Controller
public class BrwController {
	
	@Resource(name="brwService")
	BrwService brwService;
	
	
	/**
     * 대출반납관리 조회
     * @param KbkBookLoanVo
     * @return List
     * @throws Exception
     */
    @ElService(key = "SvcKBKBRWBRMR01")
    @RequestMapping(value="SvcKBKBRWBRMR01")
    @ElDescription(sub = "대출반납관리 조회", desc = "대출반납관리 조회")
    public List<KbkBookLoanVo> selectKbkBrwRetrnMnt(KbkBookLoanVo kbkBookLoanVo) throws Exception {
    	return brwService.selectKbkBrwRetrnMnt(kbkBookLoanVo);
    }
    
    /**
     * 대출반납관리 조회
     * @param KbkBookLoanVo
     * @return int
     * @throws Exception
     */
    @ElService(key = "SvcKBKBRWBRMU01")
    @RequestMapping(value="SvcKBKBRWBRMU01")
    @ElDescription(sub = "대출반납관리 수정", desc = "대출반납관리 수정")
    public void updateKbkBookLoanRetrn(KbkBookLoanVo kbkBookLoanVo) throws Exception {
    	brwService.updateKbkBookLoanRetrn(kbkBookLoanVo);
    }
    
    /**
     * 대출현황 조회
     * @param KbkBookLoanVo
     * @return List
     * @throws Exception
     */
    @ElService(key = "SvcKBKBRWKLLR01")
    @RequestMapping(value="SvcKBKBRWKLLR01")
    @ElDescription(sub = "대출현황 조회", desc = "대출현황 조회")
    public List<KbkBookLoanVo> selectKbkLoanList(KbkBookLoanVo kbkBookLoanVo) throws Exception {
    	return brwService.selectKbkLoanList(kbkBookLoanVo);
    }
    
    /**
     * 대출메일 조회
     * @param KbkBookLoanVo
     * @return List
     * @throws Exception
     */
    @ElService(key = "SvcKBKBRWBMLR01")
    @RequestMapping(value="SvcKBKBRWBMLR01")
    @ElDescription(sub = "대출메일 조회", desc = "대출메일 조회")
    public List<KbkBookLoanVo> selectKbkBrwMailList(KbkBookLoanVo kbkBookLoanVo) throws Exception {
    	return brwService.selectKbkBrwMailList(kbkBookLoanVo);
    }
    
    /**
     * 대출메일 발송
     * @param KbkBookLoanVo
     * @return List
     * @throws Exception
     */
    @ElService(key = "SvcKBKBRWBMSP01")
    @RequestMapping(value="SvcKBKBRWBMSP01")
    @ElDescription(sub = "대출메일 발송", desc = "대출메일 발송")
    public void selectKbkBrwMailSend(LinkedList<LinkedHashMap<String, Object>> list) throws Exception {
    	brwService.selectKbkBrwMailSend(list);
    }
    
    @ElService(key = "SvcKBKBRWR01")
	@RequestMapping(value = "SvcKBKBRWR01")
	@ElDescription(sub = "도서대출 팝업 상세조회", desc = "대출반납관리 도서대출팝업에서 상세내역을 조회한다.")
	@ElValidator(errUrl = "")
	public KbkBookLoanVo selectKbkBookLoan(InvAccntBookVo vo) throws Exception{
    	return brwService.selectKbkBookLoan(vo);
    }
    
    @ElService(key = "SvcKBKBRWPOPM01")
	@RequestMapping(value = "SvcKBKBRWPOPM01")
	@ElDescription(sub = "도서대출정보 저장", desc = "도서대출팝업에서 대출정보를 저장한다.")
	@ElValidator(errUrl = "")
	public void saveKbkBookLoan(KbkBookLoanVo vo) throws Exception{
    	brwService.saveKbkBookLoan(vo);
    }
    
    @ElService(key = "SvcKBKBRWPOPD01")
	@RequestMapping(value = "SvcKBKBRWPOPD01")
	@ElDescription(sub = "대출정보 삭제", desc = "도서대출 팝업에서 대출정보를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteKbkBookLoan(KbkBookLoanVo vo) throws Exception{
    	brwService.deleteKbkBookLoan(vo.getLoan_no());
    }
}