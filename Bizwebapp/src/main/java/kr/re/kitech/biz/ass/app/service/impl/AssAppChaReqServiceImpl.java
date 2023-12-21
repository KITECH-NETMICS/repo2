package kr.re.kitech.biz.ass.app.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.cxf.common.i18n.Exception;
import org.springframework.stereotype.Service;

import com.inswave.elfw.util.ControllerContextUtil;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ass.app.dao.AssAppChaReqDAO;
import kr.re.kitech.biz.ass.app.service.AssAppChaReqService;
import kr.re.kitech.biz.ass.app.vo.AssAppChaReqDetailVo;
import kr.re.kitech.biz.ass.app.vo.AssAppChaReqListVo;
import kr.re.kitech.biz.ass.app.vo.AssAppChaReqSrchVo;
import kr.re.kitech.biz.ass.app.vo.AssAppChaReqVo;
import kr.re.kitech.biz.ass.app.vo.AssMastrVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

@Service("assAppChaReqService")
public class AssAppChaReqServiceImpl extends EgovAbstractServiceImpl implements AssAppChaReqService {
	@Resource(name="assAppChaReqDAO")
	private AssAppChaReqDAO dao;

	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name="attachDAO")
    private AttachDAO attachDao;

    @Resource(name="apprValidServiceImpl")
    private ApprValidService apprValidService;

	public List<AssAppChaReqVo> selectAssAppChaReqList(AssAppChaReqSrchVo vo) throws KitechException {
		return dao.selectAssAppChaReqList(vo);
	}

	public List<AssAppChaReqDetailVo> selectAssAppChaReqDetailList(AssAppChaReqSrchVo vo) throws KitechException {
		return dao.selectAssAppChaReqDetailList(vo);
	}

	public String saveAssAppChaReq(AssAppChaReqListVo vo) throws KitechException {
		AssAppChaReqDetailVo appChaReqDetailVo = vo.getAssAppChaReqDetailVo();
		List<AssAppChaReqDetailVo> appChaReqDetailVoList = vo.getAssAppChaReqDetailVoList();

		BizUserHeader siteUserHeader = (BizUserHeader)ControllerContextUtil.getUserHeader();

		String reqNo = appChaReqDetailVo.getReq_no();
		String cudType = appChaReqDetailVo.getCud_type();
		String docuClsf = appChaReqDetailVo.getDocu_clsf();

		if("".equals(reqNo)) {	// 신청번호가 없을 경우
			reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), docuClsf);
			appChaReqDetailVo.setReq_no(reqNo);

			// ======================================== //
			// 1. 전자 결재 임시 저장 //
			// ======================================== //
			if("C".equals(cudType)) {
				// 인터페이스 테이블 저장
				apprFuncService.formInit(reqNo, "G203", KitechContextUtil.getUserId());
			}
		}

		for(int i = 0; i < appChaReqDetailVoList.size(); i++) {
			AssAppChaReqDetailVo rowData = appChaReqDetailVoList.get(i);

			rowData.setReq_no(reqNo);
			rowData.setAttach_file_no(appChaReqDetailVo.getAttach_file_no());
			rowData.setAset_typ(appChaReqDetailVo.getAset_typ());
			rowData.setWrte_syspayno(siteUserHeader.getSession().getSn());
			
			rowData.setTrans_syspayno(appChaReqDetailVo.getTrans_syspayno());
			rowData.setTrans_nm(appChaReqDetailVo.getTrans_nm());
			rowData.setTrans_empno(appChaReqDetailVo.getTrans_empno());
			rowData.setTrans_email(appChaReqDetailVo.getTrans_email());
			rowData.setTrans_dept_cd(appChaReqDetailVo.getTrans_dept_cd());
			rowData.setTrans_dept_cd_new_ymd(appChaReqDetailVo.getTrans_dept_cd_new_ymd());
			rowData.setTrans_dept_nm(appChaReqDetailVo.getTrans_dept_nm());

			rowData.setReceipt_syspayno(appChaReqDetailVo.getReceipt_syspayno());
			rowData.setReceipt_nm(appChaReqDetailVo.getReceipt_nm());
			rowData.setReceipt_empno(appChaReqDetailVo.getReceipt_empno());
			rowData.setReceipt_email(appChaReqDetailVo.getReceipt_email());
			rowData.setReceipt_dept_nm(appChaReqDetailVo.getReceipt_dept_nm());
			rowData.setReceipt_ext_no(appChaReqDetailVo.getReceipt_ext_no());
			rowData.setReceipt_dept_cd(appChaReqDetailVo.getReceipt_dept_cd());
			rowData.setReceipt_dept_cd_new_ymd(appChaReqDetailVo.getReceipt_dept_cd_new_ymd());

			rowData.setCause(appChaReqDetailVo.getCause());
			rowData.setCouse_clsf("N");
			rowData.setRegst_syspayno(siteUserHeader.getSession().getSn());
			rowData.setUpdt_syspayno(siteUserHeader.getSession().getSn());

			// 인수인계 등록 확인
			AssAppChaReqDetailVo result = dao.selectAssAppChaReqRgstChk(rowData);
			int iCnt = result.getCnt();

			if(!"D".equals(rowData.getRowStatus())) {
				if(iCnt == 0) {	// 신규
					iCnt = dao.selectAssAppChaReqExstChk(rowData).getCnt();

					if(iCnt > 0) {
						String msg = "자산번호[" + rowData.getAset_no() + "]에 대하여 결재진행중인 인수인계신청서가 존재합니다. 확인바랍니다.";
						throw new KitechException(Exceptions.ALERT, Business.ASS, msg);
					}
					
					dao.insertAssAppChaReq(rowData);
					
				} else {	// 수정
					//결재상태 유효성
					try {
						apprValidService.isWaitStateAtIntfatab("G203", reqNo);

					} catch (KitechException ex) {
						throw ex;

					}
				
					dao.updateAssAppChaReq(rowData);
				}
			} else {
				if(iCnt > 0) dao.deleteAssAppChaReq(rowData);
			}
		}

		// 결제신청 버튼 눌렀을 때
		if("S".equals(cudType)) {
			// 수량
			if("A10".equals(docuClsf)) {
				if(appChaReqDetailVo.isApproval()) {
					this.aprReq(vo);
				}
			// 자산, 관리대상시작품
			} else {
				if(appChaReqDetailVo.isApproval()) {
					this.aprReq(vo);
				}
			}
		}

		return reqNo;
	}

	public void deleteAssAppChaReq(AssAppChaReqDetailVo vo) throws KitechException {
		BizUserHeader siteUserHeader = (BizUserHeader)ControllerContextUtil.getUserHeader();

		vo.setLogin_user_id(siteUserHeader.getSession().getUid());
		vo.setReporter_id(siteUserHeader.getSession().getSn());
		vo.setUi_id(siteUserHeader.getSession().getServiceId());

		apprFuncService.formRemove(vo.getReq_no());

		AssAppChaReqDetailVo result = dao.selectAssAppChaReqRgstChk(vo);

		if(result.getCnt() > 0) dao.deleteAssAppChaReq(vo);
	}

	public AssAppChaReqVo selectDeptManager(AssAppChaReqSrchVo vo) throws KitechException {
		return dao.selectDeptManager(vo);
	}
	
	
	
	private void aprReq(AssAppChaReqListVo vo) throws KitechException {
		AssAppChaReqDetailVo saveVo = vo.getAssAppChaReqDetailVo();
		List<AssAppChaReqDetailVo> saveListVo = vo.getAssAppChaReqDetailVoList();

		// 전자결재 전문
    	AprVo aprVo = new AprVo();

		String asetTyp = saveVo.getAset_typ();
		int introAmt = 0;

		for(AssAppChaReqDetailVo rowData : saveListVo) {
			introAmt += Integer.parseInt(rowData.getIntro_amt());
		}

		int resultCount = saveListVo.size();
		String resultAsetNm = saveListVo.get(0).getAset_nm();
		String gridResultAsetNmApp = "";

		if(resultCount == 1) {
			gridResultAsetNmApp = resultAsetNm;
		} else {
			int resultCountInt = resultCount - 1;
			gridResultAsetNmApp = resultAsetNm + " 외 " + resultCountInt + "건";
		}

		String infoCdText = "인수자 : "  + saveVo.getReceipt_nm() + "("+ saveVo.getReceipt_empno() +")" + 
							" / 인계자 : " + saveVo.getTrans_nm() + "("+ saveVo.getTrans_empno() +")" +
							" / " + gridResultAsetNmApp;

		aprVo.setLoginUserId(KitechContextUtil.getUserId());	// 신청자 ID
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());	// 신청자 시스템개인번호 (인계자)
		aprVo.setUiId(KitechContextUtil.getServiceId());	// 화면 ID
		aprVo.setReqNo(saveVo.getReq_no());	// 문서 ID
		aprVo.setAprState("XAD010");	// 상태 코드 (작성중)

		aprVo.setManagerId(saveVo.getReceipt_syspayno());
		aprVo.setManager(saveVo.getReceipt_syspayno());
		aprVo.setResult("");

		/*
		 * fcc1_cd(인계자부서편성단위)
		 * fcc2_cd(인수자부서편성단위)
		 * 필드가 없음
		 */

		aprVo.setExt1Cd("");
		aprVo.setExt2Cd(saveVo.getTrans_nm());	// 추가된 결재변수3
		aprVo.setExt3Cd("");	// 추가된 결재변수4
 
		//이민기님 요청.
		aprVo.setRuleMoney(Integer.toString(introAmt));	// 전결금액
		aprVo.setRuleType("ADR080");	// 전결구분

		// 2020.10.13 인계, 인수담당자
		aprVo.setSupmanager1(saveVo.getTrans_syspayno());	// 인계관리담당자
		aprVo.setSupmanager2(saveVo.getReceipt_syspayno());	// 인수관리담당자

		if(!"AAA030".equals(asetTyp)) {
			aprVo.setOperCode("0");
			aprVo.setInfoCd("자산인수인계_" + saveVo.getCause());

			//스냅샷에 전달하기위한 첨부파일 세팅
			if(!"".equals(saveVo.getAttach_file_no())){
				vo.setFileList(attachDao.selectListAttach(saveVo.getAttach_file_no()));
			}

			apprFuncService.approvalRequest(aprVo, vo);

		} else {
			aprVo.setOperCode("9");
			aprVo.setInfoCd(infoCdText);

			apprFuncService.approvalScreen(aprVo);
		}
	}

	public void formAccept(AssAppChaReqListVo vo) throws Exception {
		List<AssAppChaReqDetailVo> assAppChaReqDetailList = vo.getAssAppChaReqDetailVoList();
		String mngmtMbody = dao.selectAssMngmtBody(KitechContextUtil.getSyspayno());

		for(AssAppChaReqDetailVo saveVo : assAppChaReqDetailList) {
			saveVo.setMngmt_mbody(mngmtMbody);
			dao.updateCntReceptTransProc(saveVo);
		}
		
		AprVo aprVo = new AprVo();

		int introAmt = 0;

		for(AssAppChaReqDetailVo rowData : assAppChaReqDetailList) {
			introAmt += Integer.parseInt(rowData.getIntro_amt());
		}

		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReqNo(assAppChaReqDetailList.get(0).getReq_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("G219");
		aprVo.setAprState("XAD100");
		aprVo.setOperCode("0");
		aprVo.setBiz(true);
		aprVo.setResult("TYPE2");
		aprVo.setTaskExt1("G219");
		aprVo.setRuleMoney(Integer.toString(introAmt));
		aprVo.setRuleType("ADR080");

		apprFuncService.formAccept(aprVo);
		
	}

	public void formReject(AssAppChaReqDetailVo vo) throws Exception {
		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(vo.getReq_no());
		aprScVo.setEndpoint(KitechContextUtil.getUserId());
		aprScVo.setAprState(vo.getApr_state());
		aprScVo.setComments(vo.getComments());

		if(AprState.isComplate(vo.getApr_state())) {
			aprScVo.setEndpoint("system");
			apprFuncService.formAuthReject(aprScVo);

		} else {
			apprFuncService.formReject(aprScVo);

		}
	}

	public void saveAssReceiptTransPosi(AssAppChaReqListVo vo) throws Exception {
		List<AssAppChaReqDetailVo> assAppChaReqDetailList = vo.getAssAppChaReqDetailVoList();

		for(AssAppChaReqDetailVo rowData : assAppChaReqDetailList) {
			dao.updateAssReceiptTransPosi(rowData);
		}
	}
	
	public List<AssMastrVo> selectAssetList(AssMastrVo vo) throws Exception {
		return dao.selectAssetList(vo);
	}
}
