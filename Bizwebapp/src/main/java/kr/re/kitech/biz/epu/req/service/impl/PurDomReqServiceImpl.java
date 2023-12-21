package kr.re.kitech.biz.epu.req.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.com.vo.ResInpMatePopVo;
import kr.re.kitech.biz.com.vo.SfcChmclsSafeVo;
import kr.re.kitech.biz.epu.com.dao.EpuCommonDAO;
import kr.re.kitech.biz.epu.pop.vo.PurContAnnlInfoVo;
import kr.re.kitech.biz.epu.pop.vo.PurContAnnlReqVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqSpcficVo;
import kr.re.kitech.biz.epu.req.dao.PurDomReqDAO;
import kr.re.kitech.biz.epu.req.service.PurDomReqService;
import kr.re.kitech.biz.epu.req.vo.ApprPurReqSpcficVo;
import kr.re.kitech.biz.epu.req.vo.PurAttachCntVo;
import kr.re.kitech.biz.epu.req.vo.PurReqAccntVo;
import kr.re.kitech.biz.epu.req.vo.PurReqAttachFileVo;
import kr.re.kitech.biz.epu.req.vo.PurReqInfoVo;
import kr.re.kitech.biz.epu.req.vo.PurReqItemAprVo;
import kr.re.kitech.biz.epu.req.vo.PurReqItemVo;
import kr.re.kitech.biz.epu.req.vo.PurReqMastrMngVo;
import kr.re.kitech.biz.epu.req.vo.PurReqMastrVo;
import kr.re.kitech.biz.epu.req.vo.PurSrcVo;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.vo.AutoBugtVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * @ClassSubJect 구매요구관리(내자구매) ServiceImpl
 * @Class PurDomReqServiceImpl.java
 * @Description 구매요구관리(내자구매) ServiceImpl
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/11/24      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/11/24
 * @version 1.0
 * @see
 * 
 */
@Service("purDomReqService")
public class PurDomReqServiceImpl extends EgovAbstractServiceImpl implements PurDomReqService {
	@Resource(name="purDomReqDAO")
	private PurDomReqDAO dao;
	
	@Resource(name="attachDAO")
    private AttachDAO attachDao;
    
    @Resource(name="epuCommonDAO")
    private EpuCommonDAO commonDao;
	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name = "finComService")
	private FinComService finComService;
	
	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;

	/**
     * 구매요구관리 조회
     * @param PurSrcVo
     * @return List<PurReqMastrListVo>
     * @throws Exception
     * @author LeeYH
     * @since 2022.11.24.
     */
	@Override
	public List<PurReqMastrMngVo> selectPurReqMastrList(PurSrcVo vo) throws KitechException {
		AppLog.info("\n =================== PurSrcVo : " + vo);
		return dao.selectPurReqMastrList(vo);
	}
	
	/**
     * 내자구매요구 조회
     * @param PurSrcVo
     * @return PurReqInfoVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.11.28.
     */
	public PurReqInfoVo selectPurReqDomInfo(PurSrcVo vo) throws KitechException{
		PurReqInfoVo retVo = new PurReqInfoVo();
		// 구매마스터 조회
		retVo.setMstrVo(dao.selectPurReqMastr(vo.getPur_req_no()));
		// 구매 품목내역 조회
		List<PurReqItemVo> itemList = dao.selectPurReqItemList(vo.getPur_req_no());
		retVo.setItemList(itemList);
		// 구매 계정내역 조회
		List<PurReqAccntVo> accntList = dao.selectPurReqAccntList(vo.getPur_req_no());
		retVo.setAccntList(accntList);
		
		// 구매요구 첨부서류 조회
		if("PBA010".equals(retVo.getMstrVo().getPur_clsf_cd())){ // PBA010 물품(기성품)
			vo.setClsf("1");
		}else if("PBA020".equals(retVo.getMstrVo().getPur_clsf_cd())){ // PBA020 제조
			vo.setClsf("2");
		}else if("PBA030".equals(retVo.getMstrVo().getPur_clsf_cd())){ // PBA030 공사
			vo.setClsf("3");
		}else if(retVo.getMstrVo().getPur_clsf_cd().matches("PBA040|PBA045")){ // PBA040 일반용역, PBA045 기술용역
			vo.setClsf("4");
		}else if("PBA110".equals(retVo.getMstrVo().getPur_clsf_cd())){ // PBA110 S/W
			vo.setClsf("5");
		}else if("PBA080".equals(retVo.getMstrVo().getPur_clsf_cd())){ // PBA080 임대차
			vo.setClsf("6");
		}else if("PBA090".equals(retVo.getMstrVo().getPur_clsf_cd())){ // PBA090 인쇄
			vo.setClsf("7");
		}else{
			vo.setClsf("8");
		}
		
		String equipItemAmtYn = "";
		for(PurReqItemVo itemVo : itemList){
			//품목금액이 3000만원이상 존재여부
			if(Double.parseDouble(itemVo.getReq_unit_price()) >= 30000000){
				equipItemAmtYn = "Y";
			}
		}
		//정부수탁 연구장비비
		String equipExpnsYn = "";
		for(PurReqAccntVo accntVo : accntList){
			if("R".equals(accntVo.getMngmt_clsf()) && accntVo.getExpns_cd().matches("141|142|148")){
				equipExpnsYn = "Y";
			}
		}
		
		if("Y".equals(equipItemAmtYn) && "Y".equals(equipExpnsYn)){ // 연구장비심의
			vo.setFile_yn_1("Y");
		}
		
		retVo.setPurFileList(dao.selectPurReqAttachList(vo));
		
		return retVo;
	}
	
	/**
     * 특정구매사유서 저장
     * @param PurReqSpcficVo
     * @return String
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.07.
     */
	public String savePurReqSpcfic(PurReqSpcficVo vo) throws Exception{
    	String elecAppDocuNo = vo.getElecapp_docu_no();
    	
    	if("C".equals(vo.getCud_type())){    		
    		if("Y".equals(vo.getApr_flag())){
    			elecAppDocuNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "P05");
    			vo.setElecapp_docu_no(elecAppDocuNo);
    		}
    		
    		dao.insertPurReqSpcfic(vo);
    		
    		// 인터페이스 테이블 저장
    		if("Y".equals(vo.getApr_flag())){
    			apprFuncService.formInit(elecAppDocuNo, "P104", KitechContextUtil.getUserId());
    		}
    	}else{
    		dao.updatePurReqSpcfic(vo);
    	}
    	
    	// 결재신청
    	if(vo.isApproval()){
    		this.approvalPurReqSpcfic(vo);
    	}
    	
    	return elecAppDocuNo;
    }
	
	/**
     * 특정구매사유서 결재신청
     * @param PurReqSpcficVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.07.
     */
	private void approvalPurReqSpcfic(PurReqSpcficVo spcficVo) throws Exception{
		ApprPurReqSpcficVo vo = new ApprPurReqSpcficVo();
		// 공통코드
		spcficVo.setContrct_base_clause(CodeCacheManager.getInstance().getCode("POB", spcficVo.getContrct_base_clause()).getComNm()); // 관련조항(항)
		spcficVo.setContrct_base_no(CodeCacheManager.getInstance().getCode("POC", spcficVo.getContrct_base_no()).getComNm()); // 관련조항(호)
		// 특정구매신청서 내역
		vo.setSpcficVo(spcficVo);
		
		// 품목내역 조회
		vo.setItemList(dao.selectPurReqItemList(spcficVo.getPur_req_no()));
		
		// 품목 합계정보 조회
		PurReqItemAprVo itemVo = dao.selectPurReqItemApr(spcficVo.getPur_req_no());
		
		if(!"".equals(spcficVo.getAttach_file_no())){
			vo.setFileList(attachDao.selectListAttach(spcficVo.getAttach_file_no()));
		}
		
		// 결재정보
		AprVo aprVo = new AprVo();
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReqNo(spcficVo.getElecapp_docu_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("P104");
		aprVo.setDcFcType(itemVo.getInout_psn_clsf_cd());		
		aprVo.setRuleType("ADR050");
		aprVo.setRuleMoney(String.valueOf(itemVo.getReq_amt_sum()));	
		aprVo.setRegion(spcficVo.getRegion_cd());	
		
		aprVo.setExt1Cd(itemVo.getAccnt_no());
		if("1".equals(itemVo.getInout_psn_clsf_cd())){
			aprVo.setManager(itemVo.getSyspayno());
			aprVo.setInfoCd((StringUtils.isEmpty(itemVo.getKrchar_gdnm()))?itemVo.getEng_gdnm() : itemVo.getKrchar_gdnm());
		}else{
			aprVo.setManager(itemVo.getFcsyspayno());
			aprVo.setInfoCd((StringUtils.isEmpty(itemVo.getEng_gdnm()))? itemVo.getKrchar_gdnm() : itemVo.getEng_gdnm());	
		}
		
		apprFuncService.approvalRequest(aprVo, vo);	
	}
	
	/**
     * 계속연차확인서 저장
     * @param PurContAnnlReqVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.08.
     */
	public void savePurContAnnlReq(PurContAnnlReqVo vo) throws Exception{
		if(StringUtils.isEmpty(vo.getConti_req_no())){
			vo.setConti_req_no(genService.getGenNumber(Numberings.DOCUMENT.getName(), "P2C"));
			
			// 결재 인터페이스 테이블 저장
			apprFuncService.formInit(vo.getConti_req_no(), "P116", KitechContextUtil.getUserId());
		}
		
		// 구매요구 마스터 수정
		dao.updatePurReqMastrContAnnl(vo);
		
		if(vo.isApproval()){
			this.approvalPurContAnnlReq(vo);
		}
	}
	
	/**
     * 계속연차확인서 결재신청
     * @param PurContAnnlReqVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.08.
     */
	private void approvalPurContAnnlReq(PurContAnnlReqVo annlVo) throws Exception{
		PurContAnnlInfoVo vo = new PurContAnnlInfoVo();
		// 계속연차 정보
		vo.setReqVo(annlVo);
		// 과제정보
		vo.setPrjList(dao.selectPurContAnnlPrj(annlVo.getPur_req_no()));
		// 파일정보
		if(!StringUtils.isEmpty(annlVo.getConti_attach_file_no())){
			vo.setFileList(attachDao.selectListAttach(annlVo.getConti_attach_file_no()));
		}
		
		// 결재정보
		AprVo aprVo = new AprVo();
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReqNo(annlVo.getConti_req_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("P116");
		aprVo.setDcFcType(annlVo.getInout_psn_clsf_cd());		
		aprVo.setRuleType("ADR050");
		aprVo.setRuleMoney(String.valueOf(annlVo.getReq_amt_sum()));		
		aprVo.setRegion(annlVo.getRegion_cd());		
		aprVo.setInfoCd(annlVo.getPur_req_no() + ":" + annlVo.getReq_usg());
		aprVo.setAccountCharger(annlVo.getAccnt_respn_psn_syspayno());
		aprVo.setManager(commonDao.selectPurManager(annlVo.getAccnt_respn_psn_syspayno()));				
		
		apprFuncService.approvalRequest(aprVo, vo);	
	}
	
	/**
     * 사전안전성 검토 저장
     * @param String reqNo, String purReqNo
     * @throws Exception
     * @author LeeYH
     * @since 2023.03.30.
     */
	public void updateSfcChmclsSafeDcdfprInfo(String reqNo, String purReqNo) throws KitechException{
		// 기존 사전안전성검토 구매번호 초기화
		dao.updateSfcChmclsSafeDcdfprInfoDel(purReqNo);
			
		// 구매번호 업데이트
		SfcChmclsSafeVo safeVo = new SfcChmclsSafeVo();
		safeVo.setPur_req_no(purReqNo);
		safeVo.setReq_no(reqNo);
			
		dao.updateSfcChmclsSafeDcdfprInfo(safeVo);
	}
	
	/**
     * 구매요구 저장
     * @param PurReqInfoVo
     * @return String
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.13.
     */
	public String savePurReqInfo(PurReqInfoVo vo) throws Exception{
		PurReqMastrVo mstrVo = vo.getMstrVo();
		String purReqNo = mstrVo.getPur_req_no();
		
		// 01. 구매요구 마스터 저장
		String cudType = "";
		String serviceId = "";
		if(StringUtils.isEmpty(purReqNo)){
			if("1".equals(mstrVo.getInout_psn_clsf_cd())){
				purReqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "P22");
				serviceId = "P022";
			}else{
				purReqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "P23");
				serviceId = "P023";
			}
			
			mstrVo.setPur_req_no(purReqNo);
			
			// 구매요구 마스터 저장
			if(dao.insertPurReqMastr(mstrVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.EPU, "message.xom.co.com.0002", new String[]{"구매요구마스터저장"});
			}
			
			// 결재 인터페이스 저장
			String infoCd = "";
			if("EGF010".equals(mstrVo.getPur_grp_cd())){
				infoCd = "(물품)" + infoCd;
			}else if("EGF020".equals(mstrVo.getPur_grp_cd())){
				infoCd = "(용역)" + infoCd;
			}else{
				infoCd = "(공사)" + infoCd;
			}
			apprFuncService.formInit(purReqNo, serviceId, KitechContextUtil.getUserId(), infoCd);
		}else{
			// AprState 체크하는 공통 메소드호출
			try {
				if ("P22".equals(purReqNo.substring(0, 3))){
					serviceId = "P022";
				} else {
					serviceId = "P023";
				}
			
				apprValidService.isWaitStateAtIntfatab(serviceId, purReqNo);
			} catch (KitechException ex) {
				throw ex;
			}
			
			cudType = "U";
			dao.updatePurReqMastr(mstrVo);
		}
		
		// 2) 품목내역 저장
		// 20160330. 삭제 후 저장이 되도록 수정
		if("U".equals(cudType)){
			dao.deletePurReqItem(purReqNo);
		}
		
		List<PurReqItemVo> itemList = vo.getItemList();
		int cnt =1;
		String rmk = "";
		for(PurReqItemVo itemVo : itemList){
			itemVo.setPur_req_no(purReqNo);
			itemVo.setItem_odr(cnt);
			
			if(cnt == 1){
				if("1".equals(mstrVo.getInout_psn_clsf_cd())){
					rmk = (!"".equals(itemVo.getKrchar_gdnm()))? itemVo.getKrchar_gdnm() : itemVo.getEng_gdnm();
				}else{
					rmk = (!"".equals(itemVo.getEng_gdnm()))? itemVo.getEng_gdnm() : itemVo.getKrchar_gdnm();
				}
			}
			
			if(dao.insertPurReqItem(itemVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.EPU, "message.xom.co.com.0002", new String[]{"구매요구 품목내역 저장"});
			}
			cnt++;
		}
		
		// 3) 구매 계정내역 저장
		List<PurReqAccntVo> accntList = vo.getAccntList();
		for(PurReqAccntVo accntVo : accntList){
			if(!"D".equals(accntVo.getCud_type())){
				if(accntVo.getEquip_odr() != null && !"".equals(accntVo.getEquip_odr()) && (accntVo.getConsttn_no() == null || "".equals(accntVo.getConsttn_no()))){
					ResInpMatePopVo mateVo = new ResInpMatePopVo();
					mateVo.setAccnt_no(accntVo.getAccnt_no());
					mateVo.setEquip_odr(Integer.parseInt(accntVo.getEquip_odr()));
					
					List<ResInpMatePopVo> mateList = dao.selectResInpMatePop(mateVo);
					if(mateList != null && mateList.size() > 0){
						accntVo.setConsttn_plce_clsf(mateList.get(0).getConsttn_plce_clsf());
						accntVo.setConsttn_plce(mateList.get(0).getConsttn_plce());
						accntVo.setConsttn_resn(mateList.get(0).getConsttn_resn());
						accntVo.setConsttn_no(mateList.get(0).getConsttn_no());
						accntVo.setConsttn_ymd(mateList.get(0).getConsttn_ymd());
					}					
				}
			}
			if("C".equals(accntVo.getCud_type())){
				accntVo.setPur_req_no(purReqNo);
				if(dao.insertPurReqAccnt(accntVo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.EPU, "message.xom.co.com.0002", new String[]{"구매요구 계정내역 저장"});
				}
				
				// 예산통제 호출
				this.enfrcComBugt(accntVo, mstrVo.getReq_ymd(), mstrVo.getReq_psn_syspayno(), mstrVo.getReq_dept_cd(), mstrVo.getDept_new_ymd(), rmk, mstrVo.getReq_psn_nm());
			}else if("U".equals(accntVo.getCud_type())){
				dao.updatePurReqAccnt(accntVo);
				
				// 예산통제 호출
				this.enfrcComBugt(accntVo, mstrVo.getReq_ymd(), mstrVo.getReq_psn_syspayno(), mstrVo.getReq_dept_cd(), mstrVo.getDept_new_ymd(), rmk, mstrVo.getReq_psn_nm());
				
			}else if("D".equals(accntVo.getCud_type())){
				dao.deletePurReqAccnt(accntVo);
				
				// 예산통제모듈 삭제
				this.deleteComBugt(accntVo.getPur_req_no(), accntVo.getAccnt_odr());
			}
		}
		
		// 4) 사전 안전선 검토 저장
		if(!StringUtils.isEmpty(mstrVo.getSafe_req_no())){
			this.updateSfcChmclsSafeDcdfprInfo(mstrVo.getSafe_req_no(), purReqNo);
		}
		
		// 5) 결재신청인 경우
		if(mstrVo.isApproval()){
			this.approvalPurReqInfo(vo, rmk);
		}
		
		return purReqNo; 
	}
	
	/**
    * 구매요구 예산통제모듈 호출
    * @param PurReqAccntVo, String,String,String,String,String,String
    * @author LeeYH
    * @since 2022.12.13.
    */
	private void enfrcComBugt(PurReqAccntVo vo, String reqYmd, String sysPayNo, String deptCd, String deptNewYmd, String rmk, String rmk_2) throws KitechException{
		BblenfrcVo enfrcVo = new BblenfrcVo();
		enfrcVo.setReq_no(vo.getPur_req_no()); 		
		enfrcVo.setReq_seq(Integer.parseInt(vo.getAccnt_odr())); 			
		enfrcVo.setReq_clsf("FBJ051"); 			    
		enfrcVo.setReq_ymd(reqYmd); 	    
		enfrcVo.setReq_psn(sysPayNo);		
		enfrcVo.setReq_dept(deptCd);	
		enfrcVo.setReq_dept_new_ymd(deptNewYmd);
		enfrcVo.setAccnt_no(vo.getAccnt_no());		
		enfrcVo.setAccnt_cd(vo.getAccnt_cd());		
		enfrcVo.setExpns_cd(vo.getExpns_cd());		
		enfrcVo.setReq_amt(vo.getAccnt_demnd_amt());
		enfrcVo.setRmk(rmk);
		enfrcVo.setRmk_2(rmk_2);
		enfrcVo.setRelat_no(vo.getAccnt_respn_psn_syspayno().substring(2,8));
		
		finComService.budEnfrcMnt01(enfrcVo);
		
		// 예산통제모듈 호출 후 통제번호 업데이트
		dao.updatePurReqAccntCtrl(enfrcVo);
	}
	
	/**
    * 구매요구 예산통제 삭제
    * @param String,String
    * @author LeeYH
    * @since 2022.12.13.
    */
	private void deleteComBugt(String reqNo, String accntOdr) throws KitechException{
		DelBblEnfrcVo delVo = new DelBblEnfrcVo();
		delVo.setReq_no(reqNo);
		if(!"".equals(accntOdr)){
			delVo.setReq_seq(accntOdr); 
		}
				
		finComService.deleteBudEnfrcMnt(delVo);
	}
	
	/**
    * 구매요구 결재신청
    * @param PurReqInfoVo, String infoCd
    * @author LeeYH
    * @since 2022.12.13.
    */
	private void approvalPurReqInfo(PurReqInfoVo vo, String infoCd) throws Exception{	
		PurReqMastrVo mstrVo = vo.getMstrVo();
		
		//2023-11-02 외자구매요구는 담당자 지정 X -> 분기처리
		String mangerIds = "";
		if("1".equals(mstrVo.getInout_psn_clsf_cd())){
			// 1) 구매요구 담당자 조회
			mangerIds = commonDao.selectPurManager(KitechContextUtil.getSyspayno());
			if(StringUtils.isEmpty(mangerIds)){
				throw new KitechException(Exceptions.ALERT, Business.EPU, "message.xom.co.com.0007", new String[]{"구매담당자"});
			}
		}
		
		// 공통코드
		mstrVo.setPur_clsf_cd(CodeCacheManager.getInstance().getCode("PBA", mstrVo.getPur_clsf_cd()).getComNm());
		if(mstrVo.getReq_usg_cd() != null && !"".equals(mstrVo.getReq_usg_cd().trim())){
			mstrVo.setReq_usg_cd(CodeCacheManager.getInstance().getCode("AAF", mstrVo.getReq_usg_cd()).getComNm());
		}
		mstrVo.setInstl_posi_region_cd(CodeCacheManager.getInstance().getCode("HBX", mstrVo.getInstl_posi_region_cd()).getComNm());
		mstrVo.setInstl_posi_build_cd(CodeCacheManager.getInstance().getCode("APA", mstrVo.getInstl_posi_build_cd()).getComNm());			
		
		// 2) 계정내역 재조회
		vo.setAccntList(dao.selectPurReqAccntList(mstrVo.getPur_req_no()));
		
		// 3) 계정책임자 및 예산통제자 조회
		String accntNos = "";
		String cardClsfNm = "";
		int i = 0;
		long reqAmtSum = 0;
		for(PurReqAccntVo accntVo : vo.getAccntList()){
		    if(accntNos.indexOf(accntVo.getAccnt_no()) < 0){
		    	accntNos += ((i==0)?"" : ",") + accntVo.getAccnt_no(); 
		    }
			reqAmtSum += accntVo.getAccnt_demnd_amt();
			
			if("FAJ006".equals(accntVo.getCard_use_ex())){
				cardClsfNm += "나라도움";
			}
			
			if(accntVo.getSum_amt() + accntVo.getAdd_tax() >= 30000000 && "022000000".equals(accntVo.getBsns_cd_ofic())){
				if(accntVo.getExpns_cd().matches("141|142|144|145|146|147|148|241")){
					cardClsfNm += "/ 중앙조달";
				}
			}
			
			if(!StringUtils.isEmpty(accntVo.getEquip_nm())){
				mstrVo.setEquip_nm(accntVo.getEquip_nm());
			}
			
			if(accntVo.getBsns_cd_inout() != null && !"".equals(accntVo.getBsns_cd_inout().trim())){
				accntVo.setBsns_cd_inout(CodeCacheManager.getInstance().getCode("RHA", accntVo.getBsns_cd_inout()).getComNm());
			}
			i++;
		}
		
		// 4) 구매첨부서류 여부
		PurAttachCntVo cntVo = new PurAttachCntVo();
		PurSrcVo srcVo = new PurSrcVo();
		srcVo.setPur_req_no(mstrVo.getPur_req_no());	
			
		List<PurReqAttachFileVo> purFileList = dao.selectPurReqAttachList(srcVo);
		
		for(PurReqAttachFileVo fileVo : purFileList){
			switch(fileVo.getCd()){
				case "PBD003" : cntVo.setSpec_cnt(fileVo.getCnt()); break; // 사양서
				case "PBD004" : cntVo.setUsg_cnt(fileVo.getCnt()); break; // 용도설명서
				case "PBD005" : cntVo.setEval_cnt(fileVo.getCnt()); break; // 견적서
				case "PBD006" : // 특정물품(업체)구매사유서
					cntVo.setSpcfic_cnt(fileVo.getCnt()); 					
					if(fileVo.getCnt() > 0){
						mstrVo.setSpcfic_cnt(fileVo.getCnt());
					}
					break; 
				case "PBD007" : cntVo.setDely_h_cnt(fileVo.getCnt()); break; // 긴급구매사유서
				case "PBD008" : cntVo.setDely_j_cnt(fileVo.getCnt()); break; // 사업계획서
				case "PBD009" : cntVo.setConti_cnt(fileVo.getCnt()); break; // 계속연차확인서
				case "PBD010" : cntVo.setDely_g_cnt(fileVo.getCnt()); break; // 시방서
				case "PBD011" : cntVo.setCost_cnt(fileVo.getCnt()); break; // 원가계산서
				case "PBD012" : cntVo.setDely_k_cnt(fileVo.getCnt()); break; // 과업지시서				
			}
		}
		vo.setFileCntVo(cntVo);
		
		// 중기간경쟁제품 여부
		List<PurReqItemVo> itemList = vo.getItemList();		
		for(PurReqItemVo itemVo : itemList){
			if("Y".equals(itemVo.getCntst_prod_yn())){
				cardClsfNm += "/중기간 경쟁제품";
				break;
			}
		}
		mstrVo.setCard_clsf_nm(cardClsfNm);		
		
		AutoBugtVo bugtVo = new AutoBugtVo();
		bugtVo.setAccnt_no(accntNos);
		bugtVo = finComService.getAccntAutoBugtPsn2(bugtVo);
		
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(mstrVo.getPur_req_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		if("1".equals(mstrVo.getInout_psn_clsf_cd())){//2023-11-02 내외자 구분 uiID 분기처리
			aprVo.setUiId("P022");
		}else {
			aprVo.setUiId("P023");
		}
		aprVo.setAccountCharger(bugtVo.getAccnt_rspns()); // 계정책임자
		aprVo.setBudgetController(bugtVo.getBugt_ctrl_psn()); // 예산통제자
		//2023-11-02 외자구매요구는 담당자 지정 X -> 분기처리
		if("1".equals(mstrVo.getInout_psn_clsf_cd())){
			aprVo.setManager(mangerIds.replaceAll(",", ";")); // 구매담당자
		}
		aprVo.setRegion(mstrVo.getFomat_unit());
		
		if("EGF010".equals(mstrVo.getPur_grp_cd())){
			infoCd = "(물품)" + infoCd;
		}else if("EGF020".equals(mstrVo.getPur_grp_cd())){
			infoCd = "(용역)" + infoCd;
		}else{
			infoCd = "(공사)" + infoCd;
		}
		aprVo.setInfoCd(infoCd);
		aprVo.setExt1Cd(accntNos);
		aprVo.setRuleMoney(String.valueOf(reqAmtSum));
		aprVo.setRuleType("ADR050");
		aprVo.setSafeYn(mstrVo.getMsds_yn());
		aprVo.setLabResearcher(mstrVo.getSafe_syspayno());
		
		if(!"".equals(mstrVo.getAttach_file_no())){
			vo.setFileList(attachDao.selectListAttach(mstrVo.getAttach_file_no()));
		}		
		apprFuncService.approvalRequest(aprVo, vo);
	}
	
	/**
    * 구매요구 삭제
    * @param PurSrcVo
    * @author LeeYH
    * @since 2022.12.15.
    */
	public void deletePurReqInfo(PurSrcVo vo) throws KitechException{
		// 구매요구 삭제
		dao.deletePurReqInfo(vo.getPur_req_no());
		
		// 예실 반영 및 집행내역 삭제
		DelBblEnfrcVo delVo = new DelBblEnfrcVo();
		delVo.setReq_no(vo.getPur_req_no());
				
		finComService.deleteBudEnfrcMnt(delVo);
		
		// 구매요구 사양서 삭제
		dao.deletePurReqSpec(vo.getPur_req_no());
		
		// 특정물품구매사유서 삭제
		dao.deletePurReqSpcfic(vo.getPur_req_no());
		
		// 구매요구 첨부파일 삭제
		dao.deletePurReqAttachFile(vo.getPur_req_no());
		
		// 사전안전성검토 구매번호 초기화
		this.updateSfcChmclsSafeDcdfprInfoDel(vo.getPur_req_no());
		
		// 결재내역 삭제
		apprFuncService.formRemove(vo.getPur_req_no());		
	}
	
	/**
     * 구매요구삭제시 사전안전성 검토 구매번호 초기화
     * @param String
     * @throws Exception
     * @author LeeYH
     * @since 2023.03.30.
     */
	public void updateSfcChmclsSafeDcdfprInfoDel(String purReqNo) throws KitechException{
		dao.updateSfcChmclsSafeDcdfprInfoDel(purReqNo);
	}
	
	/**
     * 계속연차확인서 삭제
     * @param PurContAnnlReqVo
     * @return int
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.15.
     */
	public void deletePurContAnnlReq(PurContAnnlReqVo vo) throws KitechException{
		String contiReqNo = vo.getConti_req_no();
		
		// 계속연차데이터 초기화
		vo.setConti_req_no("");
		vo.setConti_reason("");
		vo.setConti_attach_file_no("");
		
		dao.updatePurReqMastrContAnnl(vo);
		
		// 결재정보 삭제
		apprFuncService.formRemove(contiReqNo);
	}
	
	/**
     * 특정물품구매사유서 삭제
     * @param String
     * @return int
     * @throws Exception
     * @author LeeYH
     * @since 2023.01.05.
     */
    public void deletePurReqSpcfic(PurSrcVo vo) throws KitechException{
    	// 특정물품구매사유서 삭제
    	if(dao.deletePurReqSpcfic(vo.getPur_req_no()) > 0){
    		// 결재정보 삭제
    		apprFuncService.formRemove(vo.getElecapp_docu_no());
    	}
    }
    
    /**
     * 결재 후 담당자 저장
     * @param PurReqMastrVo
     * @return int
     * @throws Exception
	 * @author LeeYH
     * @since 2023.05.31.
     */
    public void updatePurReqMastrPostApr(PurReqMastrVo vo) throws KitechException{
    	dao.updatePurReqMastrPostApr(vo);
    }
}
