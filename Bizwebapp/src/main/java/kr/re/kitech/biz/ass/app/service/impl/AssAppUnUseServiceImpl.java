package kr.re.kitech.biz.ass.app.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ass.app.dao.AssAppUnUseDAO;
import kr.re.kitech.biz.ass.app.service.AssAppUnUseService;
import kr.re.kitech.biz.ass.app.vo.AssMastrBVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseChkVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseDetailVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseListVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseMastVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseSrcVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

@Service("assAppUnUseService")
public class AssAppUnUseServiceImpl extends EgovAbstractServiceImpl implements AssAppUnUseService {
	@Resource(name="assAppUnUseDAO")
	private AssAppUnUseDAO dao;	
		
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name="attachDAO")
    private AttachDAO attachDao;
	
	/**
     * 불용신청 상세조회
     * @param 
     * @return List<AssUnUseVo>
     * @throws Exception
     */
	@Override
	public List<AssUnUseVo> selectAssUnUseList(AssUnUseVo vo) throws KitechException {
		return dao.selectAssUnUseList(vo.getReq_no());
	}
	
	/**
     * 불용신청 목록조회
     * @param 
     * @return List<AssUnUseVo>
     * @throws Exception
     */
	@Override
	public List<AssUnUseVo> selectListAssUnUseList(AssUnUseSrcVo vo) throws KitechException {
		return dao.selectListAssUnUseList(vo);
	}
	
	
	/**
     * 불용신청  신규 등록 상세조회 리스트 
     * @param 
     * @return List<AssUnUseVo>
     * @throws Exception
     */
	@Override
	public List<AssMastrBVo> selectAssUnUseCList(AssMastrBVo vo) throws KitechException {
		return dao.selectAssUnUseCList(vo);
	}
	
	/**
     * 불용신청 저장
     * @param 
     * @return reqNo
     * @throws Exception
     */
	
	public String saveAsetUnUse(AssUnUseListVo vo)throws Exception{
		
		List<AssUnUseVo> asetList = vo.getAsetList();
		AssUnUseMastVo mastVo = vo.getAssUnUseMastVo();
		
		String reqNo = asetList.get(0).getReq_no();
		String saveClsf = mastVo.getSave_clsf();
		
		if(reqNo == null || "".equals(reqNo)){
			reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "A12");
			
			// 인터페이스 테이블 저장
			apprFuncService.formInit(reqNo, "G206", KitechContextUtil.getUserId());
		}else{
		    // 기존데이터 있을 경우 삭제 후 저장
			dao.deleteAssUnUse(reqNo);
		}		
		
		if(asetList != null && asetList.size() > 0){
			for(AssUnUseVo asetVo : asetList){
			
				String asetNo = asetVo.getAset_no();
			
				AssUnUseChkVo assChk = dao.selectAssUnuseChk(asetNo);
	
				if(assChk != null){
					throw new KitechException(Exceptions.ERROR, Business.ASS,"[" + asetNo + "]은 불용신청중인 자산입니다. [ 불용신청서번호 : " + assChk.getReq_no() + " , 작성자 : " + assChk.getNm() + "("
								+ assChk.getEmpno() + ") ]");
				}
			 
				if("insert".equals(saveClsf)){
					asetVo.setReq_no(reqNo);
				}
				dao.insertAssUnUse(asetVo);		
			}
		}
		
		if(mastVo.isApproval()){
			this.approvalAsetUnUse(vo);
		}
		return reqNo;
	}
	
	private void approvalAsetUnUse(AssUnUseListVo vo) throws Exception{
		// vo(AssUnUseListVo)에는 xsl파일(스냅샷)에 전달할 변수들을 담는다.
		List<AssUnUseVo> asetList = vo.getAsetList();
		
		vo.getAssUnUseMastVo().setAset_typ(asetList.get(0).getAset_typ());
		vo.getAssUnUseMastVo().setReq_no(asetList.get(0).getReq_no());
		vo.getAssUnUseMastVo().setNm(asetList.get(0).getReq_nm());
		vo.getAssUnUseMastVo().setEmpno(asetList.get(0).getReq_empno());
		vo.getAssUnUseMastVo().setEmail(asetList.get(0).getReq_email());
		vo.getAssUnUseMastVo().setDept_nm(asetList.get(0).getReq_dept_nm());
		vo.getAssUnUseMastVo().setExt_no(asetList.get(0).getReq_ext_no());
		
		String assetFlag = "";
		Integer introAmt = 0;
		String assetClsf = "";
		String ext2Cd = asetList.get(0).getUser_nm() + "외" + (asetList.size()-1);
		
		for(AssUnUseVo unseVo : asetList){
			introAmt += Integer.parseInt(unseVo.getIntro_amt().trim());
			assetClsf = unseVo.getAset_clsf().trim();
	
			if (assetClsf == "ABA050") {
				if (assetFlag == "A" || assetFlag == "C") {
					assetFlag ="C"; //기술장비 여부 확인
				} else {
					assetFlag ="B"; //기술장비 여부 확인
				}
			} else {
				if (assetFlag == "B" || assetFlag == "C") {
					assetFlag = "C"; //기술장비와 다른장비가 함께 있을 때
				} else {
					assetFlag = "A";
				}
			}
		}
		
		AprVo aprVo = new AprVo();
		//aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReqNo(asetList.get(0).getReq_no());
		//aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("G206");
		aprVo.setAssetFlag(assetFlag);
		aprVo.setExt2Cd(ext2Cd);
		aprVo.setRuleMoney(String.valueOf(introAmt));
		aprVo.setRuleType("ADR080");
		aprVo.setManager(asetList.get(0).getManager_id());	
		
		apprFuncService.approvalRequest(aprVo, vo);
	}
	
	/**
     * 자산불용 삭제
     * @param PatSrcVo
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.06.08.
     */
	public void deleteAsetUnUse(AssUnUseVo vo) throws KitechException{
		//자산불용 삭제
		dao.deleteAssUnUse(vo.getReq_no());
		
		// 결재삭제
		apprFuncService.formRemove(vo.getReq_no());		
	}
	
	/**
     * 불용신청 상세조회
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public AssUnUseDetailVo selectAssUnUseDtl(AssUnUseDetailVo vo) throws KitechException {
		return dao.selectAssUnUseDtl(vo);
	}
	
	/**
     * 불용신청 상세조회 저장
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public void updateAsetUnUseDtl(AssUnUseListVo vo) throws Exception {
		AssUnUseDetailVo detailVo = vo.getAssUnUseDetailVo();

		dao.updateAsetUnUseDtl(detailVo);
		 
		 // 첨부파일
		if(!"".equals(detailVo.getAttach_file_no())){
			vo.setFileList(attachDao.selectListAttach(detailVo.getAttach_file_no()));
		}
		
		 // 사진파일
		if(!"".equals(detailVo.getAset_file_no())){
			vo.setFileList(attachDao.selectListAttach(detailVo.getAset_file_no()));
		}	
	}
	
	/**
     * 신청구분 수정 (불용 -> 환원)
     * @param AssUnUseVo
     * @throws Exception
     */
	public void updateRstrt(AssUnUseVo vo) throws KitechException{
		//자산불용 삭제
		dao.updateRstrt(vo);
	}

}
