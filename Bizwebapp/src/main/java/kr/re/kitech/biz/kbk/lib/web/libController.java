package kr.re.kitech.biz.kbk.lib.web;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.kbk.lib.service.LibBookPurchaseService;
import kr.re.kitech.biz.kbk.lib.service.LibService;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurListInpVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurListSrcVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurRegListVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurRegVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqCommVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqVo;
import kr.re.kitech.biz.kbk.lib.vo.LibCopyListVo;
import kr.re.kitech.biz.kbk.lib.vo.LibCopyVo;
import kr.re.kitech.biz.kbk.lib.vo.LibLoanListVo;
import kr.re.kitech.biz.kbk.lib.vo.LibLoanVo;

@Controller
public class libController {
	
	@Resource(name="libBookPurchaseService")
	LibBookPurchaseService libBookPurchaseService;
	
	@Resource(name="libService")
	LibService libService;
	
	/**
     * 도서구입신청 리스트 조회
     * @param LibBookPurListInpVo
     * @return List
     * @throws Exception
     */
	@ElService(key = "SvcKBKLIBPURL01")
	@RequestMapping(value="SvcKBKLIBPURL01")
	@ElDescription(sub = "도서구입신청 조회", desc = "도서구입신청 조회")
	public List<LibBookPurListSrcVo> selectLibBookPurcList(LibBookPurListInpVo libBookPurListInpVo) throws Exception {
		return libBookPurchaseService.selectLibBookPurcList(libBookPurListInpVo);
	}
	
	/**
     * 도서구입신청 팝업상세조회
     * @param LibBookPurRegVo
     * @return LibBookPurRegVo
     * @throws Exception
     */
	@ElService(key = "SvcKBKLIBPRDR01")
	@RequestMapping(value="SvcKBKLIBPRDR01")
	@ElDescription(sub = "도서구입신청 팝업상세조회", desc = "도서구입신청 팝업상세조회")
	public LibBookPurRegVo selectLibBookPurRegDtl(LibBookPurRegVo libBookPurRegVo) throws Exception {
		return libBookPurchaseService.selectLibBookPurRegDtl(libBookPurRegVo);
	}
	
	/**
     * 도서구입신청 상세 조회 신청도서 리스트
     * @param LibBookPurRegVo
     * @return List
     * @throws Exception
     */
	@ElService(key = "SvcKBKLIBPRDL01")
	@RequestMapping(value="SvcKBKLIBPRDL01")
	@ElDescription(sub = "도서구입신청 상세조회 신청도서리스트", desc = "도서구입신청 상세조회 신청도서리스트")
	public List<LibBookPurRegListVo> selectLibBookPurRegList(LibBookPurRegVo libBookPurRegVo) throws Exception {
		return libBookPurchaseService.selectLibBookPurRegList(libBookPurRegVo);
	}
	
	/**
     * 도서구입신청 상세조회 수정
     * @param LibBookPurRegVo
     * @return void
     * @throws Exception
     */
	@ElService(key = "SvcKBKLIBPRDU01")
	@RequestMapping(value="SvcKBKLIBPRDU01")
	@ElDescription(sub = "도서구입신청 상세조회 수정", desc = "도서구입신청 상세조회 수정")
	public void updateLibBookPurReg(LibBookPurRegVo libBookPurRegVo) throws Exception {
		libBookPurchaseService.updateLibBookPurReg(libBookPurRegVo);
	}
	
    @ElService(key = "SvcKBKLIBCOPY01")
    @RequestMapping(value="SvcKBKLIBCOPY01")
    @ElDescription(sub = "원문복사신청 조회", desc = "원문복사신청 조회")
    public LibCopyListVo selectCopyList(LibCopyVo vo) throws Exception {
    	LibCopyListVo ret = new LibCopyListVo();
    	ret.setLibCopyVoList(libService.selectCopyList(vo));
    	
    	return ret;
    }
    
    @ElService(key = "SvcKBKLIBLONR01")
    @RequestMapping(value="SvcKBKLIBLONR01")
    @ElDescription(sub = "도서목록 조회", desc = "도서목록 조회")
    public LibLoanListVo selectLoanList(LibLoanVo vo) throws Exception {
    	LibLoanListVo ret = new LibLoanListVo();
    	ret.setLibLoanVoList(libService.selectLoanList(vo));
    	
    	return ret;
    }
    
    @ElService(key="SvcKBKPOPLONU01")
    @RequestMapping(value="SvcKBKPOPLONU01")    
    @ElDescription(sub="도서예약 수정",desc="도서예약을 수정한다.")               
    public void updateReserv(LibLoanVo vo) throws Exception {
    	libService.updateReserv(vo);
    }
    
    @ElService(key = "SvcKBKLIBBMSP01")
    @RequestMapping(value="SvcKBKLIBBMSP01")
    @ElDescription(sub = "예약연장 메일 발송", desc = "예약연장 메일 발송")
    public void selectKbkLibMailSend(LinkedList<LinkedHashMap<String, Object>> list) throws Exception {
    	libService.selectKbkLibMailSend(list);
    }
    
    
    /*-----------------------------------------------------------------------------------
		도서구입 신청서 K628_02D
    -----------------------------------------------------------------------------------*/	
	/**
	 * 도서구입신청서 상세조회(메인)
	 * @param LibBookPurReqVo
	 * @return LibBookPurReqVo
	 * @throws Exception
	 */
	@ElService(key = "SvcKBKLIBPRQR01")
	@RequestMapping(value="SvcKBKLIBPRQR01")
	@ElDescription(sub = "도서구입신청서 상세조회(메인)", desc = "도서구입신청서 상세조회(메인)")
	public LibBookPurReqCommVo selectLibBookPurReq(LibBookPurReqVo libBookPurReqVo) throws Exception {
		return libBookPurchaseService.selectLibBookPurReq(libBookPurReqVo);
	}
		
	/**
	 * 도서구입신청서 결재 회계코드 검증
	 * @param LibBookPurReqVo
	 * @return LibBookPurReqVo
	 * @throws Exception
	 */
	@ElService(key = "SvcKBKLIBACDS01")
	@RequestMapping(value="SvcKBKLIBACDS01")
	@ElDescription(sub = " 도서구입신청서 결재 회계코드 검증 ", desc = " 도서구입신청서 결재 회계코드 검증 ")
	public LibBookPurReqVo selectLibBprAccntCd(LibBookPurReqVo libBookPurReqVo) throws Exception {
		return libBookPurchaseService.selectLibBprAccntCd(libBookPurReqVo);
	}
	
	/**
	 * 도서구입신청서 통화단위
	 * @param LibBookPurReqVo
	 * @return LibBookPurReqVo
	 * @throws Exception
	 */
	@ElService(key = "SvcKBKLIBCPRS01")
	@RequestMapping(value="SvcKBKLIBCPRS01")
	@ElDescription(sub = "도서구입신청서 통화단위", desc = "도서구입신청서 통화단위")
	public LibBookPurReqVo selectLibBprCashPurRt(LibBookPurReqVo libBookPurReqVo) throws Exception {
		return libBookPurchaseService.selectLibBprCashPurRt(libBookPurReqVo);
	}
		
	/**
	 * 도서구입신청서 승인버튼
	 * @param LibBookPurReqVo
	 * @return void
	 * @throws Exception
	 */
	@ElService(key = "SvcKBKLIBAPBU01")
	@RequestMapping(value="SvcKBKLIBAPBU01")
	@ElDescription(sub = "도서구입신청서 승인버튼", desc = "도서구입신청서 승인버튼")
	public void updateLibBprAgrPrc(LibBookPurReqVo libBookPurReqVo) throws Exception {
		libBookPurchaseService.updateLibBprAgrPrc(libBookPurReqVo);
	}
	
	/**
	 * 도서구입신청서 등록(메인)
	 * @param LibBookPurReqVo
	 * @return void
	 * @throws Exception
	 */
	@ElService(key = "SvcKBKLIBPRQI01")
	@RequestMapping(value="SvcKBKLIBPRQI01")
	@ElDescription(sub = "도서구입신청서 등록(메인)", desc = "도서구입신청서 등록(메인)")
	public LibBookPurReqVo modifyLibBookPurReq(LibBookPurReqCommVo libBookPurReqCommVo) throws Exception {
		return libBookPurchaseService.modifyLibBookPurReq(libBookPurReqCommVo);
	}
	
	/**
	 * 도서구입신청서 삭제(메인)
	 * @param LibBookPurReqVo
	 * @return void
	 * @throws Exception
	 */
	@ElService(key = "SvcKBKLIBPRQD01")
	@RequestMapping(value="SvcKBKLIBPRQD01")
	@ElDescription(sub = "도서구입신청서 삭제(메인)", desc = "도서구입신청서 삭제(메인)")
	public void deleteLibBookPurReq(LibBookPurReqVo libBookPurReqVo) throws Exception {
		libBookPurchaseService.deleteLibBookPurReq(libBookPurReqVo);
	}
	
	/**
	 * 도서구입신청서 신청
	 * @param LibBookPurReqVo
	 * @return void
	 * @throws Exception
	 */
	@ElService(key = "SvcKBKLIBPRAA01")
	@RequestMapping(value="SvcKBKLIBPRAA01")
	@ElDescription(sub = "도서구입신청서 신청", desc = "도서구입신청서 신청")
	public void approvalLibBookPurReq(LibBookPurReqCommVo vo) throws Exception {
		libBookPurchaseService.approvalLibBookPurReq(vo);
	}
	
	/**
	 * 도서구입신청서 반려
	 * @param LibBookPurReqVo
	 * @return void
	 * @throws Exception
	 */
	@ElService(key = "SvcKBKLIBPRAR01")
	@RequestMapping(value="SvcKBKLIBPRAR01")
	@ElDescription(sub = "도서구입신청서 반려", desc = "도서구입신청서 반려")
	public void rejectLibBookPurReq(LibBookPurReqVo libBookPurReqVo) throws Exception {
		libBookPurchaseService.rejectLibBookPurReq(libBookPurReqVo);
	}
}