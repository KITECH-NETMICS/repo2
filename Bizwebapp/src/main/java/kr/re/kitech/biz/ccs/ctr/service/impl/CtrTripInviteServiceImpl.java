package kr.re.kitech.biz.ccs.ctr.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ccs.ctr.dao.CtrTripInviteDAO;
import kr.re.kitech.biz.ccs.ctr.service.CtrTripInviteService;
import kr.re.kitech.biz.ccs.ctr.vo.CtrCvnTripSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripInviteVo;
import kr.re.kitech.biz.ccs.ctr.vo.CvnTripAprVo;
import kr.re.kitech.biz.ccs.ctr.vo.CvnTripReqMonthVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.UserVo;


/**  
 * @ClassSubJect 대회활동신고 관련 처리를 담당하는 MyBatis Impl
 * @Class Name CtrTripInviteServiceImpl.java
 * @Description 대회활동신고  처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/05/04   박영훈             최초생성
 * 
 * @author 박영훈
 * @since 2022/05/04
 * @version 1.0
 * @see
 * 
 */
@Service("ctrTripInviteServiceImpl")
public class CtrTripInviteServiceImpl  extends EgovAbstractServiceImpl implements CtrTripInviteService {

    @Resource(name="ctrTripInviteDAO")
    private CtrTripInviteDAO dao;
	
	@Resource(name="accntServiceImpl")
	private AccntService accntService;
	
	@Resource(name = "generationServiceImpl")
	private GenerationService generationService;
	
	@Resource(name="attachDAO")
    private AttachDAO attachDAO;
    
    @Resource(name = "apprFuncServiceImpl")
	public ApprFuncService apprFuncService;
	
	@Resource(name = "messageSource")
	private MessageSource messageSource;
    
	/**
	 * 대외활동신고 목록조회
	 * @param CtrCvnTripSrcVo 
	 * @return List<CtrTripInviteVo>
	 * @throws Exception
	 */
	public List<CtrTripInviteVo> selectCtrCvnTripReqList(CtrCvnTripSrcVo vo) throws ElException {
		return dao.selectCtrCvnTripReqList(vo);
	}
	
	/**
	 * 대외활동신고 수정이력조회(팝업)
	 * @param ctrTripInviteVo 대외활동신고 CtrTripInviteVo
	 * @return  대외활동신고 목록 List<CtrTripInviteVo>
	 * @throws Exception
	 */
	public List<CtrTripInviteVo> selectCtrUpdateList(CtrCvnTripSrcVo vo) throws ElException {
		return dao.selectCtrUpdateList(vo);
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.ctr.service.CtrTripInviteService#selectListCountCtrTripInvite(kr.re.kitech.biz.ccs.ctr.vo.CtrTripInviteVo)
	 */
	public long selectListCountCtrTripInvite(CtrTripInviteVo ctrTripInviteVo) throws ElException {
		return dao.selectListCountCtrTripInvite(ctrTripInviteVo);
	}

	/**
	 * 대외활동신고 상세조회를 한다.
	 * @param CtrCvnTripSrcVo 
	 * @return CtrTripInviteVo
	 * @throws Exception
	 */
	public CvnTripAprVo selectCtrTripInvite(CtrCvnTripSrcVo vo) throws ElException {
		CvnTripAprVo retVo = new CvnTripAprVo();
		
		CtrTripInviteVo cvnVo = dao.selectCvnTripReq(vo); // 작성중 또는 반려 문서 조회
		
		if(vo.getReq_no().isEmpty()){    		
    		if(cvnVo == null){ // 문서가 없을 경우
    			cvnVo = dao.selectCvnTripNoReq(vo);
    		}		
    	}else{ // 신청번호가 있을 경우
    		vo.setSyspayno(cvnVo.getSyspayno());
    		vo.setYyyymm(cvnVo.getYyyymm());   
    		vo.setAct_clsf(cvnVo.getAct_clsf());
    		vo.setActivity_cd(cvnVo.getActivity_cd());
    		
    		// 겸직, 타업종사 누적표기 필요없음(2023.11.28. 송슬하 확인)
    		// 외부강의, 기타활동(법령에 근거하지 않은 위원회 등의 정부지원활동)
    		if("CLA003".equals(vo.getAct_clsf()) || "CCF004".equals(cvnVo.getActivity_cd())){ 
	    		// 월간누적횟수 및 시간 조회
		    	if(!StringUtil.isEmpty(vo.getYyyymm())){
			    	CtrTripInviteVo accVo = this.selectInviteYearMonth(vo);
			    	if(accVo != null){
				    	cvnVo.setAcc_mon_count(accVo.getAcc_mon_count());
				    	cvnVo.setAcc_mon_hour(accVo.getAcc_mon_hour()); 
				    }
			    }
    		}else if("CLA004".equals(vo.getAct_clsf())){ // 기타활동
    			if(cvnVo.getActivity_cd().matches("CCF001|CCF002|CCF003")){ // 서면,심사,자문,원고료,집필료,자문활동
    				// 대외활동현황    				
    				retVo.setAccrList(dao.selectCtrMonthList(vo));
    			}
    		}
    	}
    	
    	// 대외활동신고 상세
    	retVo.setCvnVo(cvnVo);
    		
        return retVo;
	}
	

	/**
     * 대외활동신고 저장
     * @param ctrTripInviteVo 대외활동신고 CtrTripInviteVo
     * @throws Exception
     */
	public CtrCvnTripSrcVo saveCvnTripReq(CtrTripInviteVo vo) throws Exception {
	    String reqNo = vo.getReq_no();	
	    
	    if("CTR040".equals(vo.getTrip_cd())){
	    	vo.setTrip_req_no("");
	    }
	    
	    if(!"CLA003".equals(vo.getAct_clsf())){ // 외부강의가 아닌경우에는 start_ymd, cls_ymd에 저장
	    	vo.setStart_ymd(vo.getSt_daytm());
	    	vo.setCls_ymd(vo.getEd_daytm());
	    	vo.setSt_daytm("");
	    	vo.setEd_daytm("");
	    }else{
	    	vo.setEcono_gain_clsf("HCQ030");
	    }
	    
    	if(reqNo == null || "".equals(reqNo)){			
			reqNo = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C68");;
			vo.setReq_no(reqNo);
			
			if(dao.updateCtrCvn(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"대외활동신고서 저장"});
			}
			
			// 인터페이스 저장
			apprFuncService.formInit(reqNo, "C680", KitechContextUtil.getUserId());			
		}else{
			if(dao.updateCtrCvn(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"대외활동신고서 저장"});
			}
		}
		
		if(vo.isApproval()){
			this.approvalCvnTripReq(vo);
			
			// 반려사유 저장
			if("XAD015".equals(vo.getApr_state()) && !vo.getModify_item().isEmpty()){
				dao.insertCtrCvnModLog(vo);
			}
		}
		
		CtrCvnTripSrcVo srcVo = new CtrCvnTripSrcVo();
		srcVo.setReq_no(reqNo);
		srcVo.setSyspayno(vo.getSyspayno());
		
		return srcVo;	
	}
	
	/**
    * 대외활동신고 결재신청
    * @param CtrTripInviteVo
    * @author LeeYH
    * @since 2022.07.29.
    */
	private void approvalCvnTripReq(CtrTripInviteVo vo) throws Exception{		
		// 출장연계구분
		vo.setTrip_cd_nm(CodeCacheManager.getInstance().getCode("CTR", vo.getTrip_cd()).getComNm());
		
		// 활동유형
		if("CLA001".equals(vo.getAct_clsf())){ // 겸직
			vo.setActivity_cd_nm(CodeCacheManager.getInstance().getCode("CCB", vo.getActivity_cd()).getComNm());
		}else if("CLA002".equals(vo.getAct_clsf())){ // 타업종사
			vo.setActivity_cd_nm(CodeCacheManager.getInstance().getCode("CCE", vo.getActivity_cd()).getComNm());
		}else if("CLA003".equals(vo.getAct_clsf())){ // 외부강의등
			vo.setActivity_cd_nm(CodeCacheManager.getInstance().getCode("CCA", vo.getActivity_cd()).getComNm());
		}else if("CLA004".equals(vo.getAct_clsf())){ // 기타활동
			vo.setActivity_cd_nm(CodeCacheManager.getInstance().getCode("CCF", vo.getActivity_cd()).getComNm());
		}
		
		// 활동구분
		vo.setAct_clsf_nm(CodeCacheManager.getInstance().getCode("CLA", vo.getAct_clsf()).getComNm());
		// 경제보상구분
		vo.setEcono_gain_clsf(CodeCacheManager.getInstance().getCode("HCQ", vo.getEcono_gain_clsf()).getComNm());
		// 참여정보
		vo.setAttnce_clsf(CodeCacheManager.getInstance().getCode("HCN", vo.getAttnce_clsf()).getComNm());
		
		CvnTripAprVo cvnAprVo = new CvnTripAprVo();
		
		// 겸직, 타업종사 누적표기 필요없음(2023.11.28. 송슬하 확인)
		// 외부강의, 기타활동(법령에 근거하지 않은 위원회 등의 정부지원활동)
		CtrCvnTripSrcVo srcVo = new CtrCvnTripSrcVo();
		srcVo.setReq_no(vo.getReq_no());
		srcVo.setSyspayno(vo.getSyspayno());
		srcVo.setYyyymm(vo.getYyyymm());   
		srcVo.setAct_clsf(vo.getAct_clsf());
		srcVo.setActivity_cd(vo.getActivity_cd());
    		
		if("CLA003".equals(vo.getAct_clsf()) || "CCF004".equals(vo.getActivity_cd())){ 
    		// 월간누적횟수 및 시간 조회
	    	if(!StringUtil.isEmpty(vo.getYyyymm())){
		    	CtrTripInviteVo accVo = this.selectInviteYearMonth(srcVo);
		    	if(accVo != null){
			    	vo.setAcc_mon_count(accVo.getAcc_mon_count());
			    	vo.setAcc_mon_hour(accVo.getAcc_mon_hour()); 
			    }
		    }
		}else if("CLA004".equals(vo.getAct_clsf())){ // 기타활동
			if(vo.getActivity_cd().matches("CCF001|CCF002|CCF003")){ // 서면,심사,자문,원고료,집필료,자문활동
				// 대외활동현황 	
				cvnAprVo.setAccrList(dao.selectCtrMonthList(srcVo));
				if(cvnAprVo.getAccrList() != null && cvnAprVo.getAccrList().size() > 0){
					vo.setAcc_mon("ETC");
				}
			}
		}
		cvnAprVo.setCvnVo(vo);
		
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(vo.getReq_no());
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setEndpoint(KitechContextUtil.getUserId());		
		aprVo.setUiId("C680");
			
		if( vo.getAcc_mon_count() > 3){
			aprVo.setRuleMoney("4");
			List<UserVo> userList = accntService.findUsersByRoleCodes(new String[]{"1006272"}); // 행동강령담당자
			aprVo.setAmangerId(userList.get(0).getSn());
			aprVo.setApprovalYn("Y");
		}else{
			aprVo.setRuleMoney("0");
			aprVo.setAmangerId("");
			aprVo.setApprovalYn("N");
		}
		
		// 연구소장 본부장용
		if(vo.getReport_cd() == "CCR030"){
			aprVo.setRuleMoney("1");
		} 
		
		String info = vo.getReq_psn_nm() +"("+ vo.getEmpno() +") "+ vo.getAct_clsf() +"/"+ vo.getSubject() +"/"+ vo.getRegion() 
							  + "/"+ vo.getSt_daytm() +" ~ "+ vo.getEd_daytm();
		aprVo.setInfoCd(info);
		aprVo.setRuleType("ADR180");
		
		//2. 모델에 첨부파일 및 컬렉션류의 데이터 리스트 추가(필요시)
		// 첨부파일 번호로 첨부파일 리스트 조회
		if(!"".equals(vo.getAttach_file_no())){
			cvnAprVo.setFileList(attachDAO.selectListAttach(vo.getAttach_file_no()));
		}
		apprFuncService.approvalRequest(aprVo, cvnAprVo);
	}
	
	/**
    * 대외활동신고 삭제
    * @param CtrTripInviteVo
    * @author LeeYH
    * @since 2022.07.29.
    */
	public void deleteCtrTripInvite(CtrCvnTripSrcVo vo) throws Exception {
		// 대외활동 신고 삭제
		if(dao.deleteCtrCvn(vo) < 0){
			throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"대외활동신고서 저장"});
		}
		
		apprFuncService.formRemove(vo.getReq_no());
	}
	
	/**
	 * 대외활동신고 월간 누적횟수 및 시간 조회
	 * @param CtrCvnTripSrcVo 
	 * @return CtrTripInviteVo
	 * @throws Exception
	 */
	public CtrTripInviteVo selectInviteYearMonth(CtrCvnTripSrcVo vo) throws ElException {
		return dao.selectOutlecAccMonCnt(vo);
	}
	
	 /**
     * 사용자의 월간 누적 조회
     * @param ctrTripInviteVo 대외활동신고 CtrTripInviteVo
     * @return 목록조회 결과
     * @throws Exception
     */
	public List<CvnTripReqMonthVo> selectCtrMonthList(CtrCvnTripSrcVo vo) throws ElException {	
		return dao.selectCtrMonthList(vo);
	}
	
}
