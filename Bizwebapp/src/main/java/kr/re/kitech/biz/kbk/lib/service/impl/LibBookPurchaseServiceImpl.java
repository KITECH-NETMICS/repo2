package kr.re.kitech.biz.kbk.lib.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.kbk.lib.dao.LibBookPurchaseDAO;
import kr.re.kitech.biz.kbk.lib.service.LibBookPurchaseService;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurListInpVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurListSrcVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurRegListVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurRegVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqCommVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqListVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqVo;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.CodeVo;

@Service("libBookPurchaseService")
public class LibBookPurchaseServiceImpl implements LibBookPurchaseService {
	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name = "apprFuncServiceImpl")
	public ApprFuncService apprFuncService;
	
    @Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService;
	
	@Resource(name="libBookPurchaseDAO")
	LibBookPurchaseDAO libBookPurchaseDAO;
	
	@Resource(name="attachDAO")
    private AttachDAO attachDao;
	
	/*-----------------------------------------------------------------------------------
		도서구입 신청 리스트 K628_00L
    -----------------------------------------------------------------------------------*/
	
	@Override
	public List<LibBookPurListSrcVo> selectLibBookPurcList(LibBookPurListInpVo libBookPurListInpVo) throws Exception {
		return libBookPurchaseDAO.selectLibBookPurcList(libBookPurListInpVo);
	}
	
	/*-----------------------------------------------------------------------------------
		도서구입 신청(팝업) K628_01P
    -----------------------------------------------------------------------------------*/

	@Override
	public LibBookPurRegVo selectLibBookPurRegDtl(LibBookPurRegVo libBookPurRegVo) throws Exception {
		return libBookPurchaseDAO.selectLibBookPurRegDtl(libBookPurRegVo);
	}

	@Override
	public List<LibBookPurRegListVo> selectLibBookPurRegList(LibBookPurRegVo libBookPurRegVo) throws Exception {
		return libBookPurchaseDAO.selectLibBookPurRegList(libBookPurRegVo);
	}

	@Override
	public void updateLibBookPurReg(LibBookPurRegVo libBookPurRegVo) throws Exception {
		libBookPurchaseDAO.updateLibBookPurReg(libBookPurRegVo);
	}
	
	
	/*-----------------------------------------------------------------------------------
		도서구입 신청서 K628_02D
    -----------------------------------------------------------------------------------*/	
	// 도서구입신청서 상세조회(메인)
	@Override
	public LibBookPurReqCommVo selectLibBookPurReq(LibBookPurReqVo libBookPurReqVo) throws Exception {
		LibBookPurReqCommVo libBookPurReqCommVo = new LibBookPurReqCommVo();
		
		libBookPurReqCommVo.setReqVo(libBookPurchaseDAO.selectLibBookPurReq(libBookPurReqVo));
		libBookPurReqCommVo.setBookList(libBookPurchaseDAO.selectLibBookPurReqList(libBookPurReqVo));
		
		return libBookPurReqCommVo;
	}
	
	// 도서구입신청서 결재 회계코드 검증
	@Override
	public LibBookPurReqVo selectLibBprAccntCd(LibBookPurReqVo libBookPurReqVo) throws Exception {
		return libBookPurchaseDAO.selectLibBprAccntCd(libBookPurReqVo);
	}
	
	// 도서구입신청서 통화단위
	@Override
	public LibBookPurReqVo selectLibBprCashPurRt(LibBookPurReqVo libBookPurReqVo) throws Exception {
		return libBookPurchaseDAO.selectLibBprCashPurRt(libBookPurReqVo);
	}
	
	// 도서구입신청서 승인버튼
	@Override
	public void updateLibBprAgrPrc(LibBookPurReqVo libBookPurReqVo) throws Exception {
		libBookPurchaseDAO.updateLibBprAgrPrc(libBookPurReqVo);
		
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(libBookPurReqVo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setAprState(libBookPurReqVo.getApr_state());
		aprVo.setTaskExt1("K621");
		
		apprFuncService.formAccept(aprVo);
	}
	
	// 도서구입신청서 등록(메인)
	@Override
	public LibBookPurReqVo modifyLibBookPurReq(LibBookPurReqCommVo libBookPurReqCommVo) throws Exception {
		LibBookPurReqVo purReqVo = libBookPurReqCommVo.getReqVo();
		List<LibBookPurReqListVo> bookPurList = libBookPurReqCommVo.getBookList();
		
		//신청서
		String status = purReqVo.getStatus();
		String reqNo = null;
		
		//신규
		if("C".equals(status)) {
			reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "K01");
			purReqVo.setReq_no(reqNo);
			libBookPurchaseDAO.insertLibBookPurReq(purReqVo);
			
			//인터페이스
			apprFuncService.formInit(reqNo, "K621", "");
		}
		//수정
		else {
			reqNo = purReqVo.getReq_no();
			libBookPurchaseDAO.updateLibBookPurReq(purReqVo);
		}
		
		//신청도서
		for(LibBookPurReqListVo vo : bookPurList) {
			vo.setReq_no(reqNo);
			
			switch(vo.getRowStatus()) {
				case "C" : libBookPurchaseDAO.insertLibBookPurReqList(vo);
					break;
				case "U" : libBookPurchaseDAO.updateLibBookPurReqList(vo);
					break;
				case "D" : libBookPurchaseDAO.deleteLibBookPurReqList(purReqVo);
					break;
			}
		}
		
		return purReqVo;
	}
		
	// 도서구입신청서 삭제(메인)
	@Override
	public void deleteLibBookPurReq(LibBookPurReqVo libBookPurReqVo) throws Exception {
		libBookPurchaseDAO.deleteLibBookPurReq(libBookPurReqVo);
		libBookPurchaseDAO.deleteLibBookPurReqList(libBookPurReqVo);
	}
	
	// 도서구입신청서 신청
	@Override
	public void approvalLibBookPurReq(LibBookPurReqCommVo vo) throws Exception {
		this.modifyLibBookPurReq(vo);
		
		LibBookPurReqVo reqVo = vo.getReqVo();
		CodeVo codeVo = CodeCacheManager.getInstance().getCode("BAC", reqVo.getCentr_cd());		
		reqVo.setCentr_cd(codeVo.getComNm());
		reqVo.setCurncy_unit_nm(CodeCacheManager.getInstance().getCode("FAM", reqVo.getCurncy_unit()).getComNm());
		
		// 첨부파일
		if(!"".equals(reqVo.getAttach_file_no())){
			vo.setFileList(attachDao.selectListAttach(reqVo.getAttach_file_no()));
		}	
		StringBuilder formatQty = new StringBuilder("");
		
		if (StringUtils.isNotBlank(reqVo.getTot_expns())) {
			formatQty.append(reqVo.getTot_expns().replaceAll("\\B(?=(\\d{3})+(?!\\d))", ","));
//			formatQty.append(reqVo.getCurncy_unit_nm()) // 공통코드 이슈로 인하여 잠시 보류
			formatQty.append("원"); 					// 이민기 행정원 요청으로 "원" 으로 하드코딩
		}
		
		//결재정보
    	AprVo aprVo = new AprVo();
    	aprVo.setMainKey(reqVo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setReqNo(reqVo.getReq_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("K621");
		aprVo.setAccountCharger(reqVo.getAccnt_respn_psn_syspayno());		
		aprVo.setBookManagerRoleCode(reqVo.getBook_manager_role_cd());
		aprVo.setInfoCd(new StringBuilder(reqVo.getBook_pur_typ_nm()).append(" / ")
										.append(reqVo.getReq_qty()).append("권 / ")
										.append(formatQty.toString())
										.toString());
		aprVo.setExt1Cd("");
		aprVo.setExt2Cd(reqVo.getCentr_cd());
		
		AppLog.info("\n #################### aprVo : " + aprVo);
		apprFuncService.approvalRequest(aprVo, vo);
	}
	
	// 도서구입신청서 반려
	@Override
	public void rejectLibBookPurReq(LibBookPurReqVo libBookPurReqVo) throws Exception {
		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(libBookPurReqVo.getReq_no());
		aprScVo.setEndpoint(KitechContextUtil.getUserId());
		aprScVo.setAprState(libBookPurReqVo.getApr_state());
		aprScVo.setComments(libBookPurReqVo.getComments());
		
		if(AprState.isComplate(libBookPurReqVo.getApr_state())) {
			aprScVo.setEndpoint("system");
			apprFuncService.formAuthReject(aprScVo);
		}
		else {
			apprFuncService.formReject(aprScVo);
		}
	}
}