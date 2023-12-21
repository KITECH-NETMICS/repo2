package kr.re.kitech.biz.saf.che.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.util.ControllerContextUtil;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.saf.che.dao.SafCheProdDsuseDAO;
import kr.re.kitech.biz.saf.che.service.SafCheProdDsuseService;
import kr.re.kitech.biz.saf.che.vo.SafCheChmstryInfoVo;
import kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo;
import kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseVo;
import kr.re.kitech.biz.saf.che.vo.SafCheProdDsuseSpaceVo;
import kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo;
import kr.re.kitech.biz.saf.che.vo.SafCheSearchVo;
import kr.re.kitech.biz.saf.che.vo.SafCheSpaceInfoVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;

/**
 * @ClassSubJect : 화학제품폐기처리 담당하는 MyBatis Impl
 * @ClassName : SafCheProdDeuseServiceImpl.java
 * @Description 화학제품폐기처리를 담당하는 구현체 서비스
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.06.     김상미           최초생성
 * 
 * @author 김상미
 * @since 2023.09.06.
 * @version 1.0
 * @see
 * 
 */

@Service("safCheProdDsuseServiceImpl") 
public class SafCheProdDsuseServiceImpl extends EgovAbstractServiceImpl implements SafCheProdDsuseService {

	@Resource(name="safCheProdDsuseDAO")
	private SafCheProdDsuseDAO safDAO;

	@Resource(name="mailSender")
	private MailSender mailSender;	

  	@Resource(name = "generationServiceImpl")
    public GenerationService generationService;
    
	@Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;   
    
    @Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService;
	
	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;	
	  
	@Resource(name="accntServiceImpl")
	private AccntService accntService;  
	
				
	/**
     * 화학제품폐기 리스트 조회
     * 
     * @author 김상미
     * @param SafChePrdDsuseInfoVo
     * @return List<SfcChePrdDeuseInfoVo>
     * @throws KitechException
     * @since 2023.09.06.  
     */	
    @Override
	public List<SafChePrdDsuseInfoVo> selectList(SafCheSearchInfoVo vo) throws KitechException {
    	List<SafChePrdDsuseInfoVo> resVo = safDAO.selectList(vo);
		return resVo;
	}

	/**
     * 부서타입 조회
     * 
     * @author 김상미
     * @param  SafChePrdDsuseInfoVo
     * @return SafChePrdDsuseInfoVo
     * @throws KitechException
     * @since 2023.09.06  
     */
	@Override
	public SafChePrdDsuseInfoVo selectDeptType(SafCheSearchInfoVo vo) throws KitechException {
		SafChePrdDsuseInfoVo resVo = safDAO.selectDeptType(vo);
		return resVo;
	}
	
	/**
     * 바코드 입력시 사용번호 상태 조회
     * 
     * @author 김상미
     * @param  SafChePrdDsuseInfoVo
     * @return SafChePrdDeuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
     */
    @Override
	public SafChePrdDsuseInfoVo selectSafCheDsuseInfo(SafCheSearchInfoVo vo) throws KitechException {
		SafChePrdDsuseInfoVo resVo = safDAO.selectSafCheDsuseInfo(vo);
		return resVo;
	}

	/**
     * 폐기확정
     * 
     * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return SafChePrdDeuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06. 
     */

	@Override
	public SafChePrdDsuseInfoVo saveCompleteDeuse(SafChePrdDsuseInfoVo vo) throws KitechException {
		SafChePrdDsuseInfoVo res = new SafChePrdDsuseInfoVo();
		String deuseReqNo = vo.getDsuse_req_no();
		String spaceCd = vo.getSpace_cd();
		String useReqNo = vo.getUse_req_no();
		String disposalState = vo.getDisposal_state();
		
		String[] useReqNoArr = useReqNo.split(",");
		String[] spaceCdArr = spaceCd.split(",");
		String[] dsuseReqNoArr = deuseReqNo.split(",");
		int count = 0;
		
		for (int i=0; i < useReqNoArr.length; i++) {
			vo.setUse_req_no(useReqNoArr[i]);
			vo.setSpace_cd(spaceCdArr[i]);
			vo.setDsuse_req_no(dsuseReqNoArr[i]);
			vo.setPrdu_state_new(disposalState);
			
			if ("SFI001".equals(disposalState)) {
				vo.setDisposal_state_nm("폐기신청 저장");
				
			} else if ("SFI002".equals(disposalState)) {
				vo.setDisposal_state_nm("폐기신청 결재중");			
				safDAO.updateDsuseProdtQySate(vo);	
						
			} else if ("SFI003".equals(disposalState)) {
				vo.setDisposal_state_nm("배출완료");
				vo.setUpdt_syspayno(KitechContextUtil.getSyspayno());
				safDAO.updateDsuseProdtQyComplete(vo);
			}
			
			safDAO.insertDisposalAppHistory(vo);
			count++;
		}
		
		res.setCount(count);
		return res;
		
	}

    /**
     * 화학제품 폐기신청 업데이트 및 이력 insert
     * 
     * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return SafChePrdDeuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
     */
	@Override
	public void saveProdDeuseDisposal(SafChePrdDsuseVo safVo) throws KitechException {
		SafChePrdDsuseInfoVo infoVo = safVo.getSafChePrdDsuseInfoVo();
		String disposalState = infoVo.getPrdu_state_new();
		
		//폐기신청 상태변경처리
		this.setState(safVo);
		
		if ("SFI005".equals(disposalState)) {
			//반려안내 메일발송
			this.mailSendDeuseReject(safVo);
		}		
	}
	
	/**
     * 화학물질 폐기신청 조회
     * 
     * @author 김상미
     * @param  SafChePrdDsuseInfoVo
     * @return SafChePrdDsuseVo
	 * @throws KitechException
	 * @since 2023.09.06.
     */	
	@Override
	public SafChePrdDsuseVo selectSafCheProdDsuseInfo(SafCheSearchInfoVo vo) throws KitechException {
		SafChePrdDsuseVo resVo = new SafChePrdDsuseVo();
		SafChePrdDsuseInfoVo infoVo = safDAO.selectSafCheProdDsuseReqstInfo(vo);
		
		List<SafChePrdDsuseInfoVo> deuseReqInfoList = safDAO.selectSafCheProdDsuseReqstDetail(vo);
		List<SafChePrdDsuseInfoVo> productList = safDAO.selectSafCheDsusePrductDetailList(vo);
		
		resVo.setSafChePrdDsuseInfoVo(infoVo);
		resVo.setProductList(productList);
		resVo.setDsuseReqInfoList(deuseReqInfoList);
		return resVo;
	}

	/**
     * 폐기 내역 
     * 
     * @author 김상미
     * @param  SafChePrdDsuseInfoVo
     * @return SafChePrdDeuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
     */
	@Override
	public SafChePrdDsuseInfoVo selectSafCheProdDsuseReqstInfo(SafCheSearchInfoVo vo) throws KitechException {
		SafChePrdDsuseInfoVo resVo = safDAO.selectSafCheProdDsuseReqstInfo(vo);
		return resVo;
	}

	/**
     * 폐기 상세 내역
     * 
     * @author 김상미
     * @param  SafChePrdDsuseInfoVo
     * @return List<SafChePrdDsuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
     */
	@Override
	public List<SafChePrdDsuseInfoVo> selectSafCheProdDsuseReqstDetail(SafCheSearchInfoVo vo) throws KitechException {
		List<SafChePrdDsuseInfoVo> resVo = safDAO.selectSafCheProdDsuseReqstDetail(vo);
		return resVo;
	}

	/**
	 * 폐기신청 제품 상세 내역
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafChePrdDeuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@Override
	public List<SafChePrdDsuseInfoVo> selectSafCheDsusePrductDetailList(SafCheSearchInfoVo vo) throws KitechException {
		List<SafChePrdDsuseInfoVo> resVo = safDAO.selectSafCheDsusePrductDetailList(vo);
		return resVo;
	}	
	
    /**
     * 폐기신청등록/수정
     * 
     * @author 김상미
	 * @param SafChePrdDsuseVo
	 * @return SafChePrdDeuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
     */
	@Override
	public SafChePrdDsuseInfoVo saveProdDeuse(SafChePrdDsuseVo safVo) throws KitechException {
		SafChePrdDsuseInfoVo infoVo = safVo.getSafChePrdDsuseInfoVo();
		List<SafChePrdDsuseInfoVo> prductList = safVo.getProductList();
		List<SafChePrdDsuseInfoVo> dsuseReqInoList = safVo.getDsuseReqInfoList();
		
		infoVo.setRegist_syspayno(KitechContextUtil.getSyspayno());
		infoVo.setRegst_psn_syspayno(KitechContextUtil.getSyspayno());
		String dsuseReqNo = infoVo.getDsuse_req_no();
		if (dsuseReqNo.equals("")) {
			String gen = "";
			String docId = infoVo.getDoc_id(); //D35
			gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), docId);
			infoVo.setDsuse_req_no(gen);
			dsuseReqNo = gen;
			apprFuncService.formInit(gen, infoVo.getService_id(), KitechContextUtil.getUserId());				
			
		}
		
		// AprState 체크하는 공통 메소드호출
		try {
		    apprValidService.isWaitStateAtIntfatab(infoVo.getService_id(), infoVo.getDsuse_req_no());
		} catch (KitechException ex) {
		    throw ex;
		}
				
		if (!infoVo.isApproval()) {
			safDAO.saveSfaCheDsuseReqstInfo(infoVo);
			safDAO.deleteDsuseReqstDetail(infoVo);
			safDAO.deleteDsusePrductDetail(infoVo);
	
			if (dsuseReqInoList.size() > 0) {
				//신청정보 상세 저장
				for (SafChePrdDsuseInfoVo vo : dsuseReqInoList) {
					vo.setDsuse_req_no(infoVo.getDsuse_req_no());
					vo.setRegst_psn_syspayno(infoVo.getRegist_syspayno());
					vo.setSeq(String.valueOf(Integer.parseInt(vo.getId())+1));
					safDAO.insertSafCheDsuseReqstDetail(vo);
				}		
			}
	
			if (prductList.size() > 0) {		
				for (SafChePrdDsuseInfoVo vo : prductList) {
					vo.setDsuse_req_no(infoVo.getDsuse_req_no());
					vo.setRegst_psn_syspayno(infoVo.getRegist_syspayno());
					infoVo.setUse_req_no(vo.getUse_req_no());
					infoVo.setSpace_cd(vo.getSpace_cd());
					infoVo.setPrdu_state_new("SFI001");
					infoVo.setPrdu_state("SFB010"); // 폐기상태 => 폐기로 변경 (SFB010 => 사용중 , SFB020 => 폐기)
					infoVo.setDisposal_state_nm("폐기신청 저장");
					infoVo.setSyspayno(infoVo.getRegst_syspayno());
					
					safDAO.updateDsuseProdtQySate(infoVo);
					safDAO.insertDisposalAppHistory(infoVo); 
					
					safDAO.insertSafCheDsusePrductDetail(vo);
				}
			}		
		} else {
			//폐기신청 상태변경처리
			this.setState(safVo);
			
			SafChePrdDsuseVo safChePrdDsuseVo = new SafChePrdDsuseVo();
			safChePrdDsuseVo.setSafChePrdDsuseInfoVo(safVo.getAprSnapVo());
			safChePrdDsuseVo.setProductList(safVo.getProductList());
			safChePrdDsuseVo.setDsuseReqInfoList(safVo.getDsuseReqInfoList());
			
			//스냅샷화면에 출력될 화학물질 리스트 조회
			SafCheSearchInfoVo searchVo = new SafCheSearchInfoVo();
			searchVo.setDsuse_req_no(infoVo.getDsuse_req_no());			
			safChePrdDsuseVo.setSnapChmstryList(safVo.getSnapChmstryList());
			
			AprVo aprVo = new AprVo();
			aprVo.setInfoCd(infoVo.getInfo_cd());
			aprVo.setReqNo(infoVo.getDsuse_req_no());
			aprVo.setEndpoint(accntService.findUserIdBySyspayno(infoVo.getSyspayno()).getUid());
			aprVo.setAprState(infoVo.getApr_state());
			aprVo.setUiId(infoVo.getService_id());
			aprVo.setReporterId(KitechContextUtil.getSyspayno());
			aprVo.setManager(infoVo.getManager_id());
			aprVo.setResearchCharger(infoVo.getResearch_charger_id());
			
			apprFuncService.approvalRequest(aprVo, safChePrdDsuseVo);	
		}

		return infoVo;
	}

    /**
     * 폐기신청 삭제
     * 
     * @author 김상미
	 * @param SafChePrdDsuseVo
	 * @return SafChePrdDeuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
     */
	@Override
	public SafChePrdDsuseInfoVo deleteProdDeuse(SafChePrdDsuseVo safVo) throws KitechException {
		SafChePrdDsuseInfoVo infoVo = safVo.getSafChePrdDsuseInfoVo();
		List<SafChePrdDsuseInfoVo> prductList = safVo.getProductList();
		
		safDAO.deleteDsuseReqstInfo(infoVo);
		safDAO.deleteDsuseReqstDetail(infoVo);
		safDAO.deleteDsusePrductDetail(infoVo);
		
		for (SafChePrdDsuseInfoVo vo : prductList) {
			vo.setDsuse_req_no(infoVo.getDsuse_req_no());
			vo.setRegst_psn_syspayno(infoVo.getRegst_psn_syspayno());
			vo.setSpace_cd(infoVo.getSpace_cd());
			vo.setPrdu_state("");
			vo.setPrdu_state_new("SFB010");
			safDAO.updateDsuseProdtQySate(vo);
		}
		if (infoVo.getApr_state().equals(AprState.WAIT_REJECT.getCode())){
			apprFuncService.formRemove(infoVo.getDsuse_req_no(),true);		
		}else{
			apprFuncService.formRemove(infoVo.getDsuse_req_no());
		}
		
		return infoVo;
	}

	/**
     * 연구실 상세보기
     * 
     * @author 김상미
     * @param  SafChePrdDsuseInfoVo
     * @return SafCheProdDeuseSpaceVo
	 * @throws KitechException
	 * @since 2023.09.06.  
     */
	@Override
	public SafCheProdDsuseSpaceVo selectSafCheSpace(SafCheSearchInfoVo vo) throws KitechException {
		SafCheProdDsuseSpaceVo resVo = safDAO.selectSafCheSpace(vo);
		return resVo;
	}

	/**
	 * 사용번호 기준 폐기 시 제품 정보 리스트
	 * 
	 * @author 김상미
	 * @param SafCheSearchVo
	 * @return List<SafChePrdDeuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@Override
	public List<SafChePrdDsuseInfoVo> selectSafCheUsePrductQyList(SafCheSearchVo vo) throws KitechException {
		List<SafChePrdDsuseInfoVo> resVo = safDAO.selectSafCheUsePrductQyList(vo);
		return resVo;
	}

	/**
	 * 제품코드 기준 화학 제품 별 화학물질
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafCheChmstryInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@Override
	public List<SafCheChmstryInfoVo> selectSafCheProductChmstryList(SafCheSearchInfoVo vo) throws KitechException {
		List<SafCheChmstryInfoVo> resVo = safDAO.selectSafCheProductChmstryList(vo);
		return resVo;
	}
	
	/**
	 * 사용번호 기준 화학 제품 별 화학물질
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafChePrdDeuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@Override
	public SafChePrdDsuseInfoVo selectSafCheUseProdChmstryList(SafCheSearchInfoVo vo) throws KitechException {
		SafChePrdDsuseInfoVo resVo = safDAO.selectSafCheUseProdChmstryList(vo);
		return resVo;
	}

	/**
	 * 폐기 기간 설정 조회
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafChePrdDeuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@Override
	public List<SafChePrdDsuseInfoVo> selectSafCheDsuseDateManage(SafCheSearchInfoVo vo) throws KitechException {
		List<SafChePrdDsuseInfoVo> resVo = safDAO.selectSafCheDsuseDateManage(vo);
		return resVo;
	}

	/**
     * 안전보건담당자 확인
	 * 
	 * @author 김상미
     * @param  SafChePrdDsuseInfoVo
     * @return SafChePrdDeuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
     */
	@Override
	public SafChePrdDsuseInfoVo selectDeptToManager(SafCheSearchInfoVo vo) throws KitechException {
		SafChePrdDsuseInfoVo resVo = safDAO.selectDeptToManager(vo);
		return resVo;
	}
	
	/**
     * 물질명칭, 관리법,보건법, 안전관리법조회
	 * 
	 * @author 김상미
     * @param  SafChePrdDsuseInfoVo
     * @return SafCheChmstryInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
     */
	@Override
	public SafCheChmstryInfoVo selectSafCheLawData(SafCheSearchInfoVo vo) throws KitechException {
		SafCheChmstryInfoVo resVo = safDAO.selectSafCheLawData(vo);
		return resVo;
	}

	/**
	 * 스냅샷용 화학제품 정보 리스트 조회
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafCheChmstryInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@Override
	public List<SafCheChmstryInfoVo> selectSafCheDeusePrductSnapList(SafCheSearchInfoVo vo) throws KitechException {
		List<SafCheChmstryInfoVo> resVo = safDAO.selectSafCheDeusePrductSnapList(vo);
		return resVo;
	}

	/**
	 * 폐기일자 정보 조회 
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafChePrdDeuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@Override
	public List<SafChePrdDsuseInfoVo> selectSafCheDsuseDeManageInfoList(SafCheSearchInfoVo vo) throws KitechException {
		List<SafChePrdDsuseInfoVo> resVo = safDAO.selectSafCheDsuseDeManageInfoList(vo);
		return resVo;
	}

	/**
	 * 바코드 인식으로 세팅하는 경우 연구실 정보 조회 
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafChePrdDeuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@Override
	public List<SafCheProdDsuseSpaceVo> selectSafCheSpaceUseReqNoList(SafCheSearchInfoVo vo) throws KitechException {
	    List<SafCheProdDsuseSpaceVo> resVo = safDAO.selectSafCheSpaceUseReqNoList(vo);
		return resVo;
	}

	/**
     *  연구실 제품 사용 목록
     * 
     * @author 김상미
     * @param SafCheDsusePrductVo
     * @return List<SfcPrductQyInfoVo>
     * @throws KitechException
     * @since 2023.09.06.  
     */
	@Override
	public List<SafChePrdDsuseInfoVo> selectListChmstryProduct(SafCheSearchInfoVo vo) throws KitechException {
		List<SafChePrdDsuseInfoVo> list = safDAO.selectListChmstryProduct(vo);
		return list;
	}	

	/**
	 * 연구실조회 팝업 검색
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafCheSpaceInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@Override
	public List<SafCheSpaceInfoVo> selectSafCheSpacePopupList(SafCheSearchInfoVo vo) throws KitechException {
		List<SafCheSpaceInfoVo> resVo = safDAO.selectSafCheSpacePopupList(vo);
		return resVo;
	}
	
  	/**
	 * 결재신청/반려상태 변경
     * 
     * @author 김상미
	 * @param SafChePrdDsuseVo
     * @throws KitechException
     * @since 2023.09.06.  
	 */
	private void setState(SafChePrdDsuseVo safVo) throws KitechException {
		SafChePrdDsuseInfoVo infoVo = safVo.getSafChePrdDsuseInfoVo();
		String[] useReqNoArr, spaceCdArr, dsuseReqNoArr;
		String spaceCd = infoVo.getSpace_cd();
		String useReqNo = infoVo.getUse_req_no();
		String disposalState = infoVo.getPrdu_state_new();
		String dsuseReqNo = infoVo.getDsuse_req_no();
		
		useReqNoArr = useReqNo.split(",");
		spaceCdArr = spaceCd.split(",");	
		
		for (int i=0; i < useReqNoArr.length; i++) {
			infoVo.setUse_req_no(useReqNoArr[i]);
			
			if ("SFI005".equals(disposalState)) {
				infoVo.setSpace_cd(spaceCdArr[i]);
			} else {
				infoVo.setSpace_cd(spaceCd);
			}
			
			infoVo.setDsuse_req_no(dsuseReqNo);
		
			if ("SFI001".equals(disposalState)) {
				infoVo.setDisposal_state_nm("폐기신청 저장");
			} else if ("SFI002".equals(disposalState)) {
				infoVo.setDisposal_state_nm("폐기신청 결재중");
			} else if ("SFI003".equals(disposalState)) {
				infoVo.setDisposal_state_nm("폐기완료 대기중");
			} else if ("SFI004".equals(disposalState)) {
				infoVo.setDisposal_state_nm("배출완료");
			} else if ("SFI005".equals(disposalState)) {
				infoVo.setDisposal_state_nm("폐기신청 반려");
			}
			
			safDAO.updateDsuseProdtQySate(infoVo);
			safDAO.insertDisposalAppHistory(infoVo);	
		}	
	}		 	

  	/**
	 * 화학제품폐기신청 반려 메일발송
     * 
     * @author 김상미
	 * @param SafChePrdDsuseVo
     * @throws KitechException
     * @since 2023.09.06.  
	 */	 
	private void mailSendDeuseReject(SafChePrdDsuseVo safVo) throws KitechException {
		SafChePrdDsuseInfoVo infoVo = safVo.getSafChePrdDsuseInfoVo();
		List<SafChePrdDsuseInfoVo> dsuseReqInfoList = safVo.getDsuseReqInfoList();

		MailTemplateVo templateVo = new MailTemplateVo();
		Map<String, String> templateVar = new HashMap<String, String>();
		BizUserHeader siteUserHeader = (BizUserHeader)ControllerContextUtil.getUserHeader();
		String templatePath = "";
		String subject = "";

		for (SafChePrdDsuseInfoVo aprVo : dsuseReqInfoList) {
			String year = aprVo.getWste_exhst_ymd().substring(0, 4);
			String month = aprVo.getWste_exhst_ymd().substring(4, 6);
			String day = aprVo.getWste_exhst_ymd().substring(6, 8);
			String wsteExhstYmd = year +"년 " +month +"월 " +day+"일 ";							
			
			templateVar.put("@labNm@", aprVo.getLab_nm());
			templateVar.put("@dsuseReqNo@", aprVo.getDsuse_req_no());
			templateVar.put("@useReqNo@", aprVo.getUse_req_no());
			templateVar.put("@prductNm@", aprVo.getPrduct_nm());
			templateVar.put("@wsteExhstYmd@", wsteExhstYmd);
			templateVar.put("@actorName@", infoVo.getCn());
			templateVar.put("@rejectComment@", infoVo.getCompanion_rs());
									
			templatePath = "sfc/DsuseReject";
			subject = "[화학물질 폐기신청 반려 안내 메일]";			
			
			String syspayno = siteUserHeader.getSession().getSn();
			String toAddr = aprVo.getEmail();
			String sender = siteUserHeader.getSession().getUid() + "@kitech.re.kr";
			
			templateVo.setContentVar(templateVar);
			List<MailTemplateVo> templateVars = new ArrayList<>();
			templateVars.add(templateVo);
			
			mailSender.sendMessage(
				// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
				new BizMail.Builder(syspayno, Business.CCS, true)
					.senderEmail(sender.trim())
					.toAddr(toAddr.trim())
					.subject(subject)
					.savesent(false)	// 받은 편지함 저장 여부
					.logging(true)	// 로그 저장 여부
					.templatePath(templatePath)
					.templateVars(templateVars)
				.build());		
		}
	}
}
