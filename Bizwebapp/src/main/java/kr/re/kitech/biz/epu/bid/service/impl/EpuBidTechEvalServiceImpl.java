package kr.re.kitech.biz.epu.bid.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.epu.bid.dao.EpuBidTechEvalDAO;
import kr.re.kitech.biz.epu.bid.service.EpuBidTechEvalService;
import kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalInfoVo;
import kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalListVo;
import kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**  
 * @ClassSubJect 기술평가요청 관련 서비스
 * @Class Name : EpuBidTechEvalServiceImpl.java
 * @Description : 기술평가요청 관련 서비스
 * @Modification Information  
 * @
 * @  수정일             수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/10/17   석원탁             최초생성
 * 
 * @author 
 * @since 2023/10/17
 * @version 1.0
 * @see
 * 
 */
@Service("epuBidTechEvalServiceImpl")
public class EpuBidTechEvalServiceImpl extends EgovAbstractServiceImpl implements EpuBidTechEvalService {

	@Resource(name = "epuBidTechEvalDAO")
	private EpuBidTechEvalDAO dao;

	//저장시 채번
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	//결재상태 유효성
	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;

	//결재관련 추가
    @Resource(name = "apprFuncServiceImpl")
    private ApprFuncService apprFuncService;

    //결재신청(스냅샷) 첨부파일 관련
    @Resource(name="attachDAO")
    private AttachDAO attachDao;
    
    //결재신청시 manager 검색용
	@Resource(name = "accntServiceImpl")
	private AccntService accntService;	  

	/**
     * 기술평가요청. 목록 조회
     * @param 
     * @return List<EpuBidTechEvalInfoVo>
     * @throws Exception
     */
    @Override
    public List<EpuBidTechEvalInfoVo> selectEpuBidTechEvalList(EpuBidTechEvalSrchVo vo) throws KitechException {
    	return dao.selectEpuBidTechEvalList(vo);
    }

	/**
     * 기술평가요청(규격심사). 상세조회(입찰개요)
     * @param 
     * @return EpuBidTechEvalInfoVo
     * @throws Exception
     */
	@Override
	public EpuBidTechEvalInfoVo selectEpuBidTechEvalMasInfo(EpuBidTechEvalSrchVo vo) throws KitechException {
		return dao.selectEpuBidTechEvalMasInfo(vo);
	}

	/**
     * 기술평가요청(규격심사). 상세조회(업체조회)
     * @param 
     * @return List<EpuBidTechEvalInfoVo>
     * @throws Exception
     */
	@Override
	public List<EpuBidTechEvalInfoVo> selectEpuBidTechEvalComInfo(EpuBidTechEvalSrchVo vo) throws KitechException {
		return dao.selectEpuBidTechEvalComInfo(vo);
	}

	/**
     * 기술평가요청(규격심사). 저장
     * @param 
     * @return String
     * @throws Exception
     */
	@Override
	public String insertEpuBidTechEvalInfo(EpuBidTechEvalListVo vo) throws KitechException {
		
		EpuBidTechEvalInfoVo saveVo = vo.getEpuBidTechEvalInfoVo();
		List<EpuBidTechEvalInfoVo> saveList = vo.getEpuBidTechEvalInfoVoList();
		
		String techEvalDocNo 	= "";
		String evalClsfCd 		= saveVo.getEval_clsf_cd();
		
		if (evalClsfCd.equals("PRC020")) {			//제안심사
			techEvalDocNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "P89");
			
		} else if (evalClsfCd.equals("PRC030")) {	//규격심사
			techEvalDocNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "P94");
			
		} else if (evalClsfCd.equals("PRC040")) {	//적격심사
			techEvalDocNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "P92");
		}
		
		//인터페이스테이블 저장
		if (!evalClsfCd.equals("PRC010")) {
			//마지막 parameter -> info_cd -> 공고명 넣기
			apprFuncService.formInit(techEvalDocNo, saveVo.getUi_id(), KitechContextUtil.getUserId(), saveVo.getBid_title());
		}
		
			
		//결재상태 유효성
		try {
			apprValidService.isWaitStateAtIntfatab(saveVo.getUi_id(), saveVo.getTech_eval_doc_no());
		}catch (KitechException ex){
			throw ex;
		}
		
		//마스터 테이블 저장
		saveVo.setTech_eval_doc_no(techEvalDocNo);
		dao.updateEpuBidTechEvalInfo(saveVo);		//기존 데이터에서 update로 상세정보 추가해줌
		
		//업체리스트 저장
		for (EpuBidTechEvalInfoVo saveVoList : saveList) {
			dao.insertEpuBidTechEvalVendInfo(saveVoList);			
		};

		return techEvalDocNo;
	}

	/**
     * 기술평가요청(규격심사). 수정
     * @param 
     * @return String
     * @throws Exception
     */
	@Override
	public String updateEpuBidTechEvalInfo(EpuBidTechEvalListVo vo) throws KitechException {
		
		EpuBidTechEvalInfoVo saveVo = vo.getEpuBidTechEvalInfoVo();
		List<EpuBidTechEvalInfoVo> saveList = vo.getEpuBidTechEvalInfoVoList();
		
		String techEvalDocNo 	= "";
		String evalClsfCd 		= saveVo.getEval_clsf_cd();		//심사구분
		String evalState		= saveVo.getEval_state();		//진행상태
		
		if (evalState.equals("PRD040")) {	//"결재요청중"상태
		
			String techEvalAssistDocNo = "";	//협조내용결재 문서번호
		
			if (evalClsfCd.equals("PRC020")) {			//제안심사
				techEvalAssistDocNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "P87");
				
			} else if (evalClsfCd.equals("PRC030")) {	//규격심사
				techEvalAssistDocNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "P86");
				
			} else if (evalClsfCd.equals("PRC040")) {	//적격심사
				techEvalAssistDocNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "P93");
			}
		
			//마지막 parameter -> info_cd -> 공고명 넣기
			apprFuncService.formInit(techEvalAssistDocNo, saveVo.getUi_id(), KitechContextUtil.getUserId(), saveVo.getBid_title());
		
			//협조요청 결재 생성 후에는 상태값 변경
			saveVo.setTech_eval_assist_doc_no(techEvalAssistDocNo);
			saveVo.setEval_state("PRD050");
		
		}
		
		if (!evalClsfCd.equals("PRC010")) {
			if (evalState.equals("PRD020")) {	//"작성중" 상태
			
				//결재상태 유효성
				try {
					apprValidService.isWaitStateAtIntfatab(saveVo.getUi_id(), saveVo.getTech_eval_doc_no());
				}catch (KitechException ex){
					throw ex;
				}
			
				//수정
				dao.updateEpuBidTechEvalInfo(saveVo);
				
			} else {
				//"수의계약을 위한 제안서 적합성 평가" -> 체크박스 여부 확인해서 값 세팅
				if (saveVo.getRenoti_after_yn().equals("Y")) {
					saveVo.setTech_nego_yn_cd("N");
				} else {
					saveVo.setTech_nego_yn_cd("Y");
				}
				
				//결재상태 유효성
				try {
					apprValidService.isWaitStateAtIntfatab(saveVo.getUi_id(), saveVo.getTech_eval_doc_no());
				}catch (KitechException ex){
					throw ex;
				}
				
				//입찰가격배점 수정
				dao.updateEpuBidTechEvalVendScore(saveVo);
				
			}
			
		}
		
		//업체리스트 저장 -> 수정이라 전체 삭제 후 for문으로 다시 저장
		dao.deleteEpuBidTechEvalVendInfoAll(saveVo);
		//업체 저장
		for (EpuBidTechEvalInfoVo saveVoList : saveList) {
			dao.insertEpuBidTechEvalVendInfo(saveVoList);			
		};

		return techEvalDocNo;
	}

	/**
     * 기술평가요청(규격심사). 결재신청
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public void aprEpuBidTechEvalInfo(EpuBidTechEvalInfoVo vo) throws KitechException {
	
		//결재신청 완료 후 진행상태 수정
    	// 결재정보
    	AprVo aprVo = new AprVo();
    	aprVo.setMainKey(vo.getBid_ord_no() + "-" + vo.getOrd_chg_no());
//    	aprVo.setMainKey(vo.getTech_eval_doc_no());
    	aprVo.setReqNo(vo.getTech_eval_doc_no());
    	aprVo.setEvalManager(vo.getAssist_charger_cd());
    	aprVo.setReporterId(KitechContextUtil.getSyspayno());
    	aprVo.setBiz(false);
    	aprVo.setOperCode("9");
    	aprVo.setUiId(vo.getUi_id());
//    	aprVo.setAprState(vo.getUi_id());			//apr_state 인데 왜 as-is에서는 serviceId를 넣어주는지 모르겠음. 일단 무의미해보여서 주석처리
    	aprVo.setLoginUserId(KitechContextUtil.getUserId());
    	aprVo.setEndpoint(KitechContextUtil.getUserId());
    	aprVo.setInfoCd(vo.getBid_title());
    	
		//결재신청
		apprFuncService.approvalScreen(aprVo);
		
		//데이터 수정 (진행상태 수정)
		dao.updateEpuBidTechEvalInfoApr(vo);
	}

	/**
     * 기술평가요청(규격심사). 결재승인
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public void formAccept(EpuBidTechEvalInfoVo vo) throws KitechException {
		
		AprVo aprVo = new AprVo();
		aprVo.setMainKey(vo.getBid_ord_no() + "-" + vo.getOrd_chg_no());
//		aprVo.setMainKey(vo.getTech_eval_doc_no());
		aprVo.setReqNo(vo.getTech_eval_doc_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId(vo.getUi_id());
    	aprVo.setLoginUserId(KitechContextUtil.getUserId());
    	aprVo.setAprState(vo.getApr_state());
    	aprVo.setOperCode(vo.getApprovalCheck());
    	aprVo.setEndpoint(KitechContextUtil.getUserId());
    	
    	if (!vo.getApprovalCheck().equals("2")) {
    		aprVo.setBiz(true);
    	}
    	if (vo.getUi_id().equals("P449") || vo.getUi_id().equals("P385")) {
			aprVo.setOperCode("9");
		} else if (vo.getUi_id().equals("P450") || vo.getUi_id().equals("P384")) {
			aprVo.setOperCode("0");
		}
    	
		//승인처리
		apprFuncService.formAccept(aprVo);
		
		
		//기술평가결과서 화면에서[접수]버튼 클릭한 경우는 진행상태 변경 
		if (vo.getUi_id().equals("P449") || vo.getUi_id().equals("P450") || vo.getUi_id().equals("P385") || vo.getUi_id().equals("P384")) {
			//데이터 수정 (진행상태 수정)
			dao.updateEpuBidTechEvalInfoApr(vo);
		} 
		
		//기술평가요청 화면에서 승인 버튼 누른 경우
		if (vo.getApprovalCheck().equals("0")) {
			//데이터 수정 (평가 요청일자 등록(수정))
			dao.updateEpuBidTechEvalInfoReqDaytm(vo);
		}
		
	}

	/**
     * 기술평가요청(규격심사). 결재반려
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public void formReject(EpuBidTechEvalInfoVo vo) throws KitechException {
		
		AprScVo aprScVo = new AprScVo();
		aprScVo.setMainKey(vo.getBid_ord_no() + "-" + vo.getOrd_chg_no());
//		aprScVo.setMainKey(vo.getTech_eval_doc_no());
		aprScVo.setReqNo(vo.getTech_eval_doc_no());
    	aprScVo.setAprState(vo.getApr_state());
    	aprScVo.setEndpoint(KitechContextUtil.getUserId());
    	aprScVo.setComments(vo.getComments());
		
		//반려
		apprFuncService.formReject(aprScVo);
		
		//데이터 수정 (진행상태 수정)
		dao.updateEpuBidTechEvalInfoApr(vo);
	}

	/**
     * 기술평가요청(규격심사). 결재신청(스냅샷)
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public void aprEpuBidTechEvalInfoSnap(EpuBidTechEvalListVo vo) throws KitechException {

		EpuBidTechEvalInfoVo saveVo = vo.getEpuBidTechEvalInfoVo();
		List<EpuBidTechEvalInfoVo> saveList = vo.getEpuBidTechEvalInfoVoList();
		
    	// 결재정보
    	AprVo aprVo = new AprVo();
    	aprVo.setMainKey(saveVo.getBid_ord_no() + "-" + saveVo.getOrd_chg_no());
//    	aprVo.setMainKey(saveVo.getTech_eval_assist_doc_no());
    	aprVo.setReqNo(saveVo.getTech_eval_assist_doc_no());		//전자결재 문서번호
    	aprVo.setReporterId(KitechContextUtil.getSyspayno());		//사번
    	aprVo.setUiId(saveVo.getUi_id());							//serviceId
    	aprVo.setTechNegoYn("Y");									//기술협상 여부
    	aprVo.setDcFcType("1");										//내자 외자 구분 (내자:1, 외자:2)
//    	aprVo.setAprState("XAD010");								//요청시 상태코드값
    	aprVo.setInfoCd(saveVo.getCd_nm());							//공고명
    	aprVo.setEndpoint(KitechContextUtil.getUserId());
    	
		//스냅샷에 전달하기위한 첨부파일 세팅_1
		if(!"".equals(saveVo.getEval_attach_file_no())){
			vo.setFileList(attachDao.selectListAttach(saveVo.getEval_attach_file_no()));
		}
		
		//스냅샷에 전달하기위한 첨부파일 세팅_2
		if(!"".equals(saveVo.getEval_assist_attach_file_no())){
			vo.setFileList(attachDao.selectListAttach(saveVo.getEval_assist_attach_file_no()));
		}		
		
		//스냅샷 결재신청
		apprFuncService.approvalRequest(aprVo, saveList);	
		
	}

	/**
     * 기술평가요청(규격심사). 결재신청 시 manager 조회
     * @param EpuBidTechEvalInfoVo
     * @return 
     * @throws Exception
     */
	@Override
	public EpuBidTechEvalInfoVo selectDeptToManager(EpuBidTechEvalSrchVo vo) throws KitechException {
		return dao.selectDeptToManager(vo);
	}

	/**
     * 기술평가요청(규격심사). 결재 최종담당자 정보 조회
     * @param EpuBidTechEvalInfoVo
     * @return 
     * @throws Exception
     */
	@Override
	public EpuBidTechEvalInfoVo selectEpuBidTechEvalEndPoint(EpuBidTechEvalSrchVo vo) throws KitechException {
		return dao.selectEpuBidTechEvalEndPoint(vo);
	}
	
}
