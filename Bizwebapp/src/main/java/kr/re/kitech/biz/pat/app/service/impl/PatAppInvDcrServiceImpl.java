package kr.re.kitech.biz.pat.app.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.pat.app.dao.PatAppInvDcrDAO;
import kr.re.kitech.biz.pat.app.service.PatAppInvDcrService;
import kr.re.kitech.biz.pat.app.vo.PatAppInvDcrInfoVo;
import kr.re.kitech.biz.pat.app.vo.PatAppMastrVo;
import kr.re.kitech.biz.pat.app.vo.PatAttachaMastrVo;
import kr.re.kitech.biz.pat.app.vo.PatCoSmitappVendVo;
import kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo;
import kr.re.kitech.biz.pat.app.vo.PatDftInvDcrListVo;
import kr.re.kitech.biz.pat.app.vo.PatInvntBookVo;
import kr.re.kitech.biz.pat.app.vo.PatRelatReschPrjVo;
import kr.re.kitech.biz.pat.app.vo.PatSrcVo;
import kr.re.kitech.biz.pat.mnt.dao.PatIprMngmtDAO;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @ClassSubJect 발명신고서 관련 처리를 담당하는 Impl
 * @Class Name PatAppInvDcrServiceImpl.java
 * @Description 발명신고서  처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/01/17   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/01/17
 * @version 1
 * @see
 * 
 */
@Service("patAppInvDcrService")
public class PatAppInvDcrServiceImpl extends EgovAbstractServiceImpl implements PatAppInvDcrService{
	@Resource(name="patAppInvDcrDAO")
	private PatAppInvDcrDAO dao;
	
	@Resource(name="patIprMngmtDAO")
	private PatIprMngmtDAO mntDao;
	
	@Resource(name="attachDAO")
	private AttachDAO attachDao;
	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;
	
	/**
	 * 발명신고서 목록 조회
	 * @param PatDftInvDcrListVo
     * @return List<DftInventorVo>
	 * @throws Exception
	 */
    public List<PatDftInvDcrListVo> selectPatAppMastrList(PatDftInvDcrListVo vo) throws KitechException {    
        return dao.selectPatAppMastrList(vo);
    }
    
    /**
	 * 발명신고서 상세 조회
	 * @param PatSrcVo
     * @return PatAppInvDcrInfoVo
	 * @throws Exception
	 */
    public PatAppInvDcrInfoVo selectPatAppInvDcr(PatSrcVo vo) throws KitechException{
    	PatAppInvDcrInfoVo retVo = new PatAppInvDcrInfoVo();
    	// 01.발명신고서 상세 조회
    	retVo.setMastVo(dao.selectPatAppMastr(vo.getReq_no()));
    	
    	// 02.상표, 디자인, 프로그램 탭 조회
    	String patClsf = retVo.getMastVo().getPat_clsf();
    	if("PAT030".equals(patClsf)){ // 상표
    		retVo.setBookVo(dao.selectPatAppTmInvntBook(vo.getReq_no()));
    		
    	}else if("PAT040".equals(patClsf)){ // 디자인
    		retVo.setBookVo(dao.selectPatAppDesnInvntBook(vo.getReq_no()));
    		
    		// 디자인 첨부파일 조회
    		PatAttachaMastrVo attachVo = new PatAttachaMastrVo();
    		attachVo.setAttach_clsf("ATT002");
    		attachVo.setReq_no(vo.getReq_no());
    		retVo.setAttachList(dao.selectPatAttachmMastrList(attachVo));
    		
    	}else if("PAT050".equals(patClsf)){ // 프로그램
    		retVo.setBookVo(dao.selectPatAppPgmInvntBook(vo.getReq_no()));
    	}    	
    	
    	//-------------------------------------------------------------------
    	// 출원번호 검색하여 발명신고서 조회시 지재권데이터 우선조회
    	//-------------------------------------------------------------------
    	if("SMITAPP".equals(vo.getSrc_clsf())){ 
    		// 03. 공동출원업체 조회
    		List<PatCoSmitappVendVo> vendList = mntDao.selectPatCoSmitappVendList(vo);
    		if(vendList != null){
    			retVo.setVendList(vendList);
    		}else{
    			retVo.setVendList(dao.selectPatAppCoSmitAppVend(vo.getReq_no()));
    		}
    		
    		// 04. 공동발명자 조회
    		List<PatCoinvntPsnVo> psnList = mntDao.selectPatCoInvntPsnList(vo);
    		if(psnList != null){
    			retVo.setPsnList(psnList);
    		}else{
    			retVo.setPsnList(dao.selectPatAppCoInvntPsnList(vo.getReq_no()));
    		}
    		
    		// 05. 관련과제 조회
    		List<PatRelatReschPrjVo> prjList = mntDao.selectPatRelatReschPrjList(vo);
    		if(prjList != null){
    			retVo.setPrjList(prjList);
    		}else{
    			retVo.setPrjList(dao.selectPatAppRelatReschPrjList(vo.getReq_no()));
    		}
    	}else{
    		// 03. 공동출원업체 조회
    		retVo.setVendList(dao.selectPatAppCoSmitAppVend(vo.getReq_no()));
    		
    		// 04. 공동발명자 조회
    		retVo.setPsnList(dao.selectPatAppCoInvntPsnList(vo.getReq_no()));
    		
    		// 05. 관련과제 조회
    		retVo.setPrjList(dao.selectPatAppRelatReschPrjList(vo.getReq_no()));
    	}
    	
    	return retVo;
    }    
    
    /**
	 * 발명신고서 저장
	 * @param PatAppInvDcrInfoVo
     * @return String
	 * @throws Exception
     * @author LeeYoungHee
     * @since 2023.01.30.
	 */
    public String savePatAppInvDcr(PatAppInvDcrInfoVo vo) throws Exception{
    	PatAppMastrVo mastVo = vo.getMastVo();
    	String reqNo = mastVo.getReq_no();
    	
    	// 01. 발명신고서 마스터 저장
    	if(StringUtils.isEmpty(reqNo)){
    		reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I01");
    		
    		mastVo.setReq_no(reqNo);
    		if(dao.insertPatAppMastr(mastVo) == 0){
    			throw new KitechException(Exceptions.ERROR, Business.PAT, "message.xom.co.com.0002", new String[]{"발명신고서 마스터 저장"});
    		}
    		
    		// 인터페이스 테이블 저장
    		apprFuncService.formInit(reqNo, "I110", KitechContextUtil.getUserId(), mastVo.getInvnt_krn_nm());
    	}else{
    		// AprState 체크하는 공통 메소드호출
			try {
			    apprValidService.isWaitStateAtIntfatab("I110", reqNo);
			} catch (KitechException ex) {
			    throw ex;
			}
			
    		dao.updatePatAppMastr(mastVo);
    		
    		// 디자인, 프로그램, 상표 
    		if(mastVo.getPat_clsf().matches("PAT030|PAT040|PAT050")){
    			dao.deletePatAppInvntBook(reqNo);
    		}
    		
    		// 출원인, 직무발명자, 관련연구과제 삭제
    		dao.deletePatAppCoInvnt(reqNo);
    	}    	
    	
    	// 02.디자인, 프로그램, 상표 저장    	
    	vo.getBookVo().setReq_no(reqNo);
    	if(mastVo.getPat_clsf().equals("PAT030")){ // 상표
    		dao.insertPatAppTmInvntBook(vo.getBookVo());
    		
    	}else if(mastVo.getPat_clsf().equals("PAT040")){ // 디자인
    		dao.insertPatAppDesnInvntBook(vo.getBookVo());
    		
    		// 디자인 첨부파일 저장
    		List<PatAttachaMastrVo> attachList = vo.getAttachList();
    		if(attachList != null && attachList.size() > 0){
    			for(PatAttachaMastrVo attachVo : attachList){
    				attachVo.setReq_no(reqNo);
    				
    				dao.insertPatAttachMastr(attachVo);
    			}
    		}
    	}else if(mastVo.getPat_clsf().equals("PAT050")){ // 프로그램
    		dao.insertPatAppPgmInvntBook(vo.getBookVo());
    	}
    	
    	// 03. 공동출원업체 저장
    	List<PatCoSmitappVendVo> vendList = vo.getVendList();
    	if(vendList != null && vendList.size() > 0){
    		int seq = 1;
    		for(PatCoSmitappVendVo vendVo : vendList){
    			vendVo.setReq_no(reqNo);
    			vendVo.setSeq(seq);
    			seq++;
    			
    			dao.insertPatAppCoSmitAppVend(vendVo);
    		}
    	}
    	
    	// 04. 직무발명자 저장
    	List<PatCoinvntPsnVo> psnList = vo.getPsnList();
    	if(psnList != null && psnList.size() > 0){
    		int seq = 1;
    		for(PatCoinvntPsnVo psnVo : psnList){
    			psnVo.setReq_no(reqNo);
    			psnVo.setSeq(seq);
    			seq++;
    			
    			dao.insertPatAppCoInvntPsn(psnVo);
    		}
    	}
    	
    	// 05. 관련연구과제 저장
    	List<PatRelatReschPrjVo> prjList = vo.getPrjList();
    	if(prjList != null && prjList.size() > 0){
    		for(PatRelatReschPrjVo prjVo : prjList){
    			prjVo.setReq_no(reqNo);
    			
    			dao.insertPatAppRelatRecchPrj(prjVo);
    		}
    	}    	
    	
    	if(mastVo.isApproval()){
    		this.approvalPatAppInvDcr(vo);
    	}
    	
    	return reqNo;
    }
    
    /**
	 * 발명신고서 결재신청
	 * @param PatAppInvDcrInfoVo
	 * @throws Exception
     * @author LeeYoungHee
     * @since 2023.01.30.
	 */
    private void approvalPatAppInvDcr(PatAppInvDcrInfoVo vo) throws Exception{
    	PatAppMastrVo mastVo = vo.getMastVo();    	
		
		// 01.결재 전문
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(mastVo.getReq_no());
		aprVo.setMainKey(mastVo.getReq_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setUiId("I110");
		aprVo.setPatClsf(mastVo.getPat_clsf());
		aprVo.setDomOverseaClsf(mastVo.getDom_oversea_clsf());
		aprVo.setInterviewYn(mastVo.getInterview_yn());
		aprVo.setChkPsnYn("I01"); // 진입여부(발명신고서 I01, 소연심 R26)
		
		aprVo.setInfo(mastVo.getInvnt_krn_nm());
		if(vo.getPrjList() != null && vo.getPrjList().size() > 0){
			aprVo.setExt1Cd(vo.getPrjList().get(0).getAccnt_no());
		}
		aprVo.setExt2Cd(mastVo.getPat_clsf_nm());		
		
		aprVo.setManager(mastVo.getCharg_syspayno()); // 소연심의 담당자
		if("PNT020".equals(mastVo.getDom_oversea_clsf())){
			aprVo.setRuleMoney("20");
			aprVo.setRuleType("ADR010");
		}else{
			aprVo.setRuleMoney("0");
		}
		
		// 공동발명자
		List<PatCoinvntPsnVo> psnList = vo.getPsnList();
		String invntPsns = "";
		for(PatCoinvntPsnVo psnVo : psnList){
			if("PDT010".equals(psnVo.getBlong_clsf())){
				invntPsns += psnVo.getSyspayno() + ";";
			}
		}
		aprVo.setResearcher(invntPsns.substring(0, invntPsns.lastIndexOf(";")));		
		
		// 02.공통코드
		mastVo.setDom_oversea_clsf(CodeCacheManager.getInstance().getCode("PNT", mastVo.getDom_oversea_clsf()).getComNm());
		mastVo.setTech_clsf(CodeCacheManager.getInstance().getCode("PTC", mastVo.getTech_clsf()).getComNm());
		
		if("PAT050".equals(mastVo.getPat_clsf())){ // 프로그램인 경우
			PatInvntBookVo bookVo = vo.getBookVo();
			if("PUT050".equals(bookVo.getUse_model())){
				bookVo.setUse_model(bookVo.getUse_model_etc());
			}else{
				bookVo.setUse_model(CodeCacheManager.getInstance().getCode("PUT", bookVo.getUse_model()).getComNm());
			}
			
			bookVo.setSale_clsf(CodeCacheManager.getInstance().getCode("PST", bookVo.getSale_clsf()).getComNm());
		}
		
		// 03.첨부파일
		// 도면첨부
		if(!"".equals(mastVo.getPlan_attach_file_no())){
			vo.setFileList_A(attachDao.selectListAttach(mastVo.getPlan_attach_file_no()));
		}
		// 기술설명서		
		if(!"".equals(mastVo.getAttach_file_no_1())){
			vo.setFileList_B(attachDao.selectListAttach(mastVo.getAttach_file_no_1()));
		}
		// 국외PCT사업화계획서
		if(!"".equals(mastVo.getPct_attach_file_no())){
			vo.setFileList_C(attachDao.selectListAttach(mastVo.getPct_attach_file_no()));
		}
		// 외부인양도증
		if(!"".equals(mastVo.getOut_deed_attach_file_no())){
			vo.setFileList_D(attachDao.selectListAttach(mastVo.getOut_deed_attach_file_no()));
		}
		// 공동출원동의서·사유서
		if(!"".equals(mastVo.getCom_apply_attach_file_no())){
			vo.setFileList_E(attachDao.selectListAttach(mastVo.getCom_apply_attach_file_no()));
		}
		// 기타
		if(!"".equals(mastVo.getEtc_attach_file_no())){
			vo.setFileList_F(attachDao.selectListAttach(mastVo.getEtc_attach_file_no()));
		}
		// 1인 발명지분 소명서
		if(!"".equals(mastVo.getOne_invnt_attach_file_no())){
			vo.setFileList_G(attachDao.selectListAttach(mastVo.getOne_invnt_attach_file_no()));
		}		
		// 사전공개파일
		if(!"".equals(mastVo.getOpen_attach_file_no())){
			vo.setFileList_K(attachDao.selectListAttach(mastVo.getOpen_attach_file_no()));
		}
		// 상표 첨부파일
		if(!"".equals(vo.getBookVo().getAttach_file_no()) && "PAT030".equals(mastVo.getPat_clsf())){
			vo.setFileList_J(attachDao.selectListAttach(vo.getBookVo().getAttach_file_no()));
		}		
		// 디자인 첨부파일
		if(!"".equals(vo.getBookVo().getAttach_file_no_1())){
			vo.setFileList_I(attachDao.selectListAttach(vo.getBookVo().getAttach_file_no_1()));
		}
		
		// 04. 결재프로세스 호출
		apprFuncService.approvalRequest(aprVo, vo);
    }
    
    /**
     * 발명신고서 양도인 승인 또는 반려
     * @param PatCoinvntPsnVo
     * @return int
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.02.02.
     */
	public void updatePatAppCoInvntPsnApr(PatCoinvntPsnVo vo) throws KitechException{
	    // 승인 또는 반려 수정
		dao.updatePatAppCoInvntPsnApr(vo);		
		
		if("0".equals(vo.getCo_invnt_affir_ex())){
			AprVo aprVo = new AprVo();
			aprVo.setReqNo(vo.getReq_no());
			aprVo.setEndpoint(KitechContextUtil.getUserId());
		
			apprFuncService.formAccept(aprVo);
		}else{
			AprScVo aprVo = new AprScVo();
			aprVo.setReqNo(vo.getReq_no());
			aprVo.setEndpoint(KitechContextUtil.getUserId());
			aprVo.setComments(vo.getComments());
			
			apprFuncService.formReject(aprVo);
		}		
	}
	
	/**
     * 발명신고서 삭제
     * @param PatSrcVo
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.06.08.
     */
	public void deletePatAppInvDcr(PatSrcVo vo) throws KitechException{
		// 마스터 삭제
		dao.deletePatAppMastr(vo.getReq_no());
		// 출원인, 직무발명자, 관련연구과제 삭제
		dao.deletePatAppCoInvnt(vo.getReq_no());
		// 디자인, 프로그램,상표, 첨부파일 삭제
		dao.deletePatAppInvntBook(vo.getReq_no());
		
		// 결재삭제
		apprFuncService.formRemove(vo.getReq_no());		
	}
}
