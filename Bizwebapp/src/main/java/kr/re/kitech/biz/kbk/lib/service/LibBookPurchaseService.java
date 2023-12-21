package kr.re.kitech.biz.kbk.lib.service;

import java.util.List;

import kr.re.kitech.biz.kbk.lib.vo.LibBookPurListInpVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurListSrcVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurRegListVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurRegVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqCommVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqVo;

public interface LibBookPurchaseService {
	/*-----------------------------------------------------------------------------------
		도서구입 신청 리스트 K628_00L
    -----------------------------------------------------------------------------------*/
	public List<LibBookPurListSrcVo> selectLibBookPurcList(LibBookPurListInpVo libBookPurListInpVo) throws Exception;

	/*-----------------------------------------------------------------------------------
		도서구입 신청(팝업) K628_01P
    -----------------------------------------------------------------------------------*/
	public LibBookPurRegVo selectLibBookPurRegDtl(LibBookPurRegVo libBookPurRegVo) throws Exception;
	public List<LibBookPurRegListVo> selectLibBookPurRegList(LibBookPurRegVo libBookPurRegVo) throws Exception; 
	public void updateLibBookPurReg(LibBookPurRegVo libBookPurRegVo) throws Exception;

	/*-----------------------------------------------------------------------------------
		도서구입 신청서 K628_02D
    -----------------------------------------------------------------------------------*/	
	public LibBookPurReqCommVo selectLibBookPurReq (LibBookPurReqVo libBookPurReqVo) throws Exception;

	public LibBookPurReqVo selectLibBprAccntCd   (LibBookPurReqVo libBookPurReqVo) throws Exception;
	public LibBookPurReqVo selectLibBprCashPurRt (LibBookPurReqVo libBookPurReqVo) throws Exception;
	
	public void updateLibBprAgrPrc	  (LibBookPurReqVo libBookPurReqVo) throws Exception;
	
	public LibBookPurReqVo modifyLibBookPurReq (LibBookPurReqCommVo libBookPurReqCommVo) throws Exception;
	public void deleteLibBookPurReq	  (LibBookPurReqVo libBookPurReqVo) throws Exception;
	
	public void approvalLibBookPurReq (LibBookPurReqCommVo vo) throws Exception;
	public void rejectLibBookPurReq	  (LibBookPurReqVo libBookPurReqVo) throws Exception;
}
