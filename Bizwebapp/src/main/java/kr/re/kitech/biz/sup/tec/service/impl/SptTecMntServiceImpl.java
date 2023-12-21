package kr.re.kitech.biz.sup.tec.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.api.client.KitechEasyPayClient;
import kr.re.kitech.biz.api.client.vo.EasyPaySMSVo;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ass.pop.vo.AssMastrHPopVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.ExceptService;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.com.vo.ExceptItemVo;
import kr.re.kitech.biz.sup.cus.service.SptCustInfoRegService;
import kr.re.kitech.biz.sup.cus.vo.SptCustSrcVo;
import kr.re.kitech.biz.sup.pop.vo.EasyPayInfoVo;
import kr.re.kitech.biz.sup.tec.dao.SptTecMntDAO;
import kr.re.kitech.biz.sup.tec.service.SptTecMntService;
import kr.re.kitech.biz.sup.tec.service.SptZeusResvService;
import kr.re.kitech.biz.sup.tec.vo.SptApplTableVo;
import kr.re.kitech.biz.sup.tec.vo.SptCardPaymntVo;
import kr.re.kitech.biz.sup.tec.vo.SptEquipUseRsltVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecActRsltVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecChkVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecEquipRsltVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptBillVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptDetlVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptListVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptRegVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSrcVo;
import kr.re.kitech.biz.sup.tec.vo.SptZeusResvDtlVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**  
 * @ClassSubJect 기술지원내역등록(S306)
 * @Class Name SptTecMntServiceImpl.java
 * @Description 기술지원내역등록 관련 처리를 담당하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/06/07   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/06/07
 * @version 1
 * @see
 * 
 */
@Service("sptTecMntService")
public class SptTecMntServiceImpl extends EgovAbstractServiceImpl implements SptTecMntService {
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="sptCustInfoRegService")
	private SptCustInfoRegService custService;
	
	@Resource(name="sptZeusResvService")
	private SptZeusResvService zeusService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name="accntServiceImpl")
	private AccntService accntService;
	
	@Resource(name="exceptService")
	private ExceptService exceptService;
	
	@Resource(name="kitechEasyPayClient")
	private KitechEasyPayClient kitechEasyPayClient;

	@Resource(name="sptTecMntDAO")
	private SptTecMntDAO dao;
	
	/**
     * 실험실 담당자 확인
     * @param String sysPayNo
     * @return SptTecChkVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.07.
     */
	@Override
	public SptTecChkVo selectSptLabHedcnt(String sysPayNo) throws KitechException{
		return dao.selectSptLabHedcnt(sysPayNo);
	}
	
	/**
     * 외부기술지원(유상) 목록조회
     * @param String sysPayNo
     * @return int
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.07.
     */
	public List<SptTecRcptInfoVo> selectSptTecRcptInfoList(SptTecSrcVo vo) throws KitechException{
		return dao.selectSptTecRcptInfoList(vo);
	}
	
	/**
     * 외부기술지원(유상) 내역등록 상세조회
     * @param SptTecSrcVo
     * @return SptTecRcptDetlVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.08.
     */
	public SptTecRcptRegVo selectSptTecRcptInfo(SptTecSrcVo vo) throws KitechException{
		SptTecRcptRegVo retVo = new SptTecRcptRegVo();
		// 상세내역 조회
		retVo.setDetlVo(dao.selectSptTecRcptInfo(vo));
		
		// 고객정보조회
		SptCustSrcVo srcVo = new SptCustSrcVo();
		srcVo.setCust_no(retVo.getDetlVo().getCust_no());
		retVo.setCustVo(custService.selectSptCustBaseInfo(srcVo));
		
		// 바우처가입여부 조회
		if(retVo.getDetlVo().getSupt_work_clsf().matches("STG050|STG060")){
			SptTecChkVo chkVo = this.selectCustVoucherYn(retVo.getDetlVo().getCust_no());
			if(chkVo != null){
				retVo.getCustVo().setVoucher_yn(chkVo.getVoucher_yn());
			}
		}
		
		if("STD030".equals(retVo.getDetlVo().getSupt_clsf())){
			// 기술지원 접수(교정) 실적조회
			retVo.setRsltList(dao.selectSptTecRevsnRslt(vo.getTech_supt_req_no()));
		}else{
			// 기술지원 접수(시험) 실적조회
			retVo.setRsltList(dao.selectSptTecActRslt(vo.getTech_supt_req_no()));
		}
		
		// 장비실적정보 조회
		retVo.setEquipList(dao.selectSptTecSupEquipRslt(vo.getTech_supt_req_no()));
		
		// 카드 결재내역 확인
		retVo.setApplVo(dao.selectSptApplTable(retVo.getDetlVo().getKolas_no())); 
		
		return retVo;
	}
	
	/**
     * 제우스 예약현황 상세정보 조회
     * @param String resvNo
     * @return SptTecRcptDetlVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.09.
     */
	public SptTecRcptRegVo selectSptZeusResvMst(SptTecSrcVo vo) throws KitechException{
		SptTecRcptRegVo retVo = new SptTecRcptRegVo();
		SptTecRcptDetlVo detlVo = dao.selectSptZeusResvMst(vo.getResvno());
		retVo.setDetlVo(detlVo);
		
		// 고객정보 조회
		SptCustSrcVo srcVo = new SptCustSrcVo();
		srcVo.setBsns_psn_regst_no(detlVo.getBsns_psn_regst_no());
		srcVo.setCmpy_nm_krchar(detlVo.getCmpy_nm_krchar());
		retVo.setCustVo(custService.selectSptCustBaseInfo(srcVo));
		
		// 장비실적내역
		SptTecEquipRsltVo equipVo = new SptTecEquipRsltVo();
		equipVo.setEquip_cd(detlVo.getEquip_cd());
		equipVo.setAset_nm(detlVo.getAset_nm());
		equipVo.setSeq(1);
		equipVo.setEquip_use_start_daytm(detlVo.getEquip_use_start_daytm());
		equipVo.setEquip_use_cls_daytm(detlVo.getEquip_use_cls_daytm());
		equipVo.setJob_time(detlVo.getJob_time());
		equipVo.setRmk(detlVo.getRmk());
		
		List<SptTecEquipRsltVo> equipList = new ArrayList<>();
		equipList.add(equipVo);
		
		retVo.setEquipList(equipList);
		
		return retVo;
	}
	
	/**
     * 청구세금계산서 발행내역
     * @param String custNo
     * @return List<SptTecRcptBillVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.12.
     */
	public List<SptTecRcptBillVo> selectSptTecChrgBillInfo(SptTecSrcVo vo) throws KitechException{
		return dao.selectSptTecChrgBillInfo(vo.getVend_cd());
	}
	
	/**
     * 기술지원내역등록-장비검색팝업 조회
     * @param AssMastrHPopVo
     * @return List<AssMastrHPopVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.14.
     */
	public List<AssMastrHPopVo> selectSptLabEquipInfoAsetPop(AssMastrHPopVo vo) throws KitechException{
		return dao.selectSptLabEquipInfoAsetPop(vo);
	}
	
	/**
     * 외부기술지원(유상) 내역등록 저장
     * @param SptTecRcptRegVo
     * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.16.
     */
	public String saveSptTecRcptInfo(SptTecRcptRegVo vo) throws Exception{
		SptTecRcptDetlVo detlVo = vo.getDetlVo();
		//----------------------------------------------------------------
		// 01. 고객정보확인
		//----------------------------------------------------------------
		detlVo.setCust_no(custService.saveSptCustBaseInfo(vo.getCustVo()));
		
		//----------------------------------------------------------------
		// 02. 기술지원접수
		//----------------------------------------------------------------
		// 접수번호 생성
		if(detlVo.getKolas_no() == null || "".equals(detlVo.getKolas_no())){
			detlVo.setKolas_no(genService.getSuptKolasNo(detlVo.getSupt_team(), detlVo.getSupt_clsf(), detlVo.getRst_book_issu()));
		}
			
		if(detlVo.getTech_supt_req_no() == null || "".equals(detlVo.getTech_supt_req_no().trim())){
			detlVo.setCud_type("C");
			
			// 상담 접수 번호 생성
			detlVo.setCunsl_rcpt_no(genService.getGenNumber(Numberings.DOCUMENT.getName(), "S01"));
			detlVo.setCunsl_psn_syspayno(KitechContextUtil.getSyspayno()); // 상담자시스템개인번호
			detlVo.setCunsl_rcpt_path("SCA030"); // 상담접수경로 (방문)
			detlVo.setCunsl_rcpt_loc_clsf("SCC050"); // 상담접수처구분 (기술지원 연구원)
			detlVo.setCunsl_complt_clsf("SCD040"); // 기술지원접수	
			
			// 기술지원 접수 번호 생성
			detlVo.setTech_supt_req_no(genService.getGenNumber(Numberings.DOCUMENT.getName(), "S02"));
			
			// 기술지원 접수 저장
			dao.insertSptTecRcptInfo(detlVo);
			
			// 상담 노트 등록
			dao.insertSptCtiCunslContnt(detlVo);
			
			// xomxintfatab 저장
			apprFuncService.formInit(detlVo.getTech_supt_req_no(), "S306", KitechContextUtil.getUserId(), detlVo.getKolas_no() + "(" + detlVo.getRegst_nm() + "(" + detlVo.getRegst_empno() + "))");
			
		}else{
			detlVo.setCud_type("U");
			
			// 기술지원 접수 수정
			dao.updateSptTecRcptInfo(detlVo);
			
			detlVo.setCunsl_complt_clsf("SCD040"); // 기술지원접수
			
			//상담 노트 변경
			dao.updateSptCtiCunslContnt(detlVo);
			
			if(!"".equals(detlVo.getBill_no()) || !"".equals(detlVo.getCard_appl_no())){
				if(dao.selectSptTecRcptInfoAmtChk(detlVo) != 0){
					throw new KitechException(Exceptions.ALERT, Business.SUP, "총액과 결재신청금액이 틀립니다.");
				}
			}
		}
		
		//----------------------------------------------------------------
		// 03. 기술지원 실적등록 저장
		//----------------------------------------------------------------
		if(!"C".equals(detlVo.getCud_type())){
			dao.deleteSptTecActRslt(detlVo.getTech_supt_req_no());
		}
		
		List<SptTecActRsltVo> rsltList = vo.getRsltList();
		int seq = 1;
		for(SptTecActRsltVo rsltVo : rsltList){
			rsltVo.setCust_no(detlVo.getCust_no());
			rsltVo.setTech_supt_req_no(detlVo.getTech_supt_req_no());
			rsltVo.setCunsl_rcpt_no(detlVo.getCunsl_rcpt_no());
			rsltVo.setJob_ymd(detlVo.getComplt_ymd());
			rsltVo.setJob_psn_syspayno(detlVo.getRcpt_psn_syspayno());
			rsltVo.setSeq(seq);
	
			if("STD030".equals(detlVo.getSupt_clsf())){ // 교정
				dao.insertSptTecRevsnRslt(rsltVo);
				
			}else{ // 기술지원 내역 실적 저장
				dao.insertSptTecActRslt(rsltVo);	
			}
			
			seq++;			
		}
		
		//----------------------------------------------------------------
		// 04. 장비 사용 실적 저장
		//----------------------------------------------------------------
		List<SptTecEquipRsltVo> equipList = vo.getEquipList();
		for(SptTecEquipRsltVo equipVo : equipList){
			equipVo.setCust_no(detlVo.getCust_no());
			equipVo.setTech_supt_req_no(detlVo.getTech_supt_req_no());
			equipVo.setCunsl_rcpt_no(detlVo.getCunsl_rcpt_no());
			
			if("C".equals(equipVo.getCud_type())){
				dao.insertSptTecSupEquipRslt(equipVo);
				
			}else if("U".equals(equipVo.getCud_type())){
				dao.updateSptTecSupEquipRslt(equipVo);
				
			}else if("D".equals(equipVo.getCud_type())){
				if(equipVo.getTech_supt_req_no() != null && "".equals(equipVo.getTech_supt_req_no())){
					dao.deleteSptTecSupEquipRslt(equipVo);
				}
			}			
			
			// 04-01. 장비일지 등록 
			if(!"D".equals(equipVo.getCud_type())){
				SptEquipUseRsltVo useVo = new SptEquipUseRsltVo();
				if("C".equals(equipVo.getCud_type())){
					useVo.setReq_no(genService.getGenNumber(Numberings.DOCUMENT.getName(), "S20"));
				}else{
					useVo.setReq_no(equipVo.getReq_no());
				}
				useVo.setJob_clsf("1");
				useVo.setEquip_cd(equipVo.getEquip_cd());
				useVo.setCust_no(equipVo.getCust_no());
				useVo.setTech_sup_req_no(equipVo.getTech_supt_req_no());			
				useVo.setTech_sup_seq(equipVo.getSeq());
				useVo.setEquip_use_syspayno(detlVo.getRcpt_psn_syspayno());
				useVo.setEquip_use_start_day(equipVo.getEquip_use_start_daytm());
				useVo.setEquip_use_start_hour(equipVo.getEquip_use_start_hour());
				useVo.setEquip_use_start_minute(equipVo.getEquip_use_start_minute());
				useVo.setEquip_use_cls_day(equipVo.getEquip_use_cls_daytm());
				useVo.setEquip_use_cls_hour(equipVo.getEquip_use_cls_hour());
				useVo.setEquip_use_cls_minute(equipVo.getEquip_use_cls_minute());
				useVo.setJob_time(equipVo.getJob_time());
				useVo.setAccnt_no(detlVo.getAccnt_no());
				useVo.setUse_clsf("S");
				useVo.setUser_clsf("A");
				useVo.setUse_type("STD010");
				useVo.setTreat_qty(equipVo.getTreat_qty());
				useVo.setJob_rmk(equipVo.getRmk());
				
				dao.mergeSptEquipUseRslt(useVo);
			}
		}
		
		//----------------------------------------------------------------
		// 05. zeus 예약승인 연계 처리
		//----------------------------------------------------------------
		if(detlVo.getResvno() != null && !"".equals(detlVo.getResvno())){
			SptZeusResvDtlVo zeusVo = zeusService.selectZeusResvMng(detlVo.getResvno());
			
			if(!"5001".equals(zeusVo.getResvlaststatcd())){ // 5001:결제완료
				// 제우스 장비예약 상세 정보 확인
				if("STE040".equals(detlVo.getPrcs_state())){
					zeusVo.setPostreserveflag("cancel"); // postreserveflag:제우스에 보낼 상태, cancel:분석취소
					zeusVo.setCancelreason("기술지원 수행취소");
				}else{
					zeusVo.setPostreserveflag("approve"); // approve:이용승인
					
					// 제우스 장비 예약 기술지원의뢰번호 업데이트
					dao.updateSptZeusResvDtlSuptNo(detlVo);
				} 
				
				// 상태값 전송 / 기술지원취소일때는 취소 전송
				zeusService.sendResrvData(zeusVo);
			}
		}
		
		// 통합프로세스진행
		if(!detlVo.getApr_state().matches("XAD070|XAD100")){
			this.approvalSptTechRcptInfo(detlVo);
		}
		
		return detlVo.getTech_supt_req_no();
	}
	
	/**
     * 외부기술지원 확정 저장
     * @param SptTecRcptDetlVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.26.
     */
	public void saveSptTechRcptDecideYn(SptTecRcptDetlVo vo) throws Exception{
		dao.updateSptTecRcptInfoDecideYn(vo);
		
		// 통합프로세스진행
		if(!vo.getApr_state().matches("XAD070|XAD100")){
			AprVo aprVo = new AprVo();
			aprVo.setLoginUserId(KitechContextUtil.getUserId());
			aprVo.setReporterId(KitechContextUtil.getSyspayno());
			aprVo.setEndpoint(KitechContextUtil.getUserId());
			aprVo.setMainKey(vo.getTech_supt_req_no());
			aprVo.setReqNo(vo.getTech_supt_req_no());
			aprVo.setUiId("S306");

			apprFuncService.formAccept(aprVo);
		}
	}
	
	/**
     * 바우처가입여부 조회
     * @param String custNo
     * @return SptTecChkVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.27.
     */
	public SptTecChkVo selectCustVoucherYn(String custNo) throws KitechException{
		return dao.selectSptParBaseInfoVoucher(custNo);
	}
	
	/**
     * 기술지원 내역등록 삭제
     * @param SptTecRcptInfoVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.27.
     */
	public void deleteSptTecRcptInfo(SptTecRcptInfoVo vo) throws KitechException{
		// 01) 내역등록 삭제
		dao.deleteSptTecRcptInfo(vo);
		
		
		// 02) 실적등록 삭제
		dao.deleteSptTecActRslt(vo.getTech_supt_req_no());
		
		// 03) 장비실적 및 장비일지 삭제
		SptTecEquipRsltVo equipVo = new SptTecEquipRsltVo();
		
		equipVo.setCunsl_rcpt_no(vo.getCunsl_rcpt_no());
		equipVo.setTech_supt_req_no(vo.getTech_supt_req_no());
		
		dao.deleteSptTecSupEquipRslt(equipVo);
	}
	
	/**
     * 외부기술지원 통합프로세스
     * @param SptTecRcptInfoVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.28.
     */
	private void approvalSptTechRcptInfo(SptTecRcptDetlVo vo) throws Exception{
		AppLog.info("\n -------------- 외부기술지원 통합결재프로세스 start vo : " + vo);
		
		AprVo aprVo = new AprVo();
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setMainKey(vo.getTech_supt_req_no());
		aprVo.setReqNo(vo.getTech_supt_req_no());
		aprVo.setUiId("S306");
		aprVo.setRejectYN("N");
		// 성적서발행유무
		String reportYn = "";
		if("STC020".equals(vo.getRst_book_issu())){ // STC020 일반 
			reportYn = "Y";
		}else if("STC030".equals(vo.getRst_book_issu())){ // STC030 미발급
			reportYn = "N";
		}
		aprVo.setReportNeedYn(reportYn);
		// 바우처인 경우
		if(vo.getSupt_work_clsf().matches("STG050|STG060")){
			aprVo.setBillType("B");
		}else{
			aprVo.setBillType("");
		}
		
		// 결재자 셋팅
		List<UserVo> userList = accntService.findUsersByRoleCodes(new String[]{"1005233"}); // 청구세금계산서발행(기업지원)
		
		// 결재예외자 조회
		ExceptItemVo itemVo = new ExceptItemVo();
		itemVo.setKind_cd("XEK053");
		itemVo.setService_id("S306");
		itemVo.setAllow_yn("Y");
		String strSysNo = exceptService.getExceptValues(itemVo).toString();
		
		String ext5 = ""; // 기업지원총괄실 담당자 + 접수인 + 기술지원담당자 + 기술지원책임자
		Set<String> set = new HashSet<>();
		for(UserVo usrVo : userList){
			if(strSysNo.indexOf(usrVo.getSn()) < 0){
				set.add(usrVo.getSn());
			}
		}
		
		Set<String> set2 = new HashSet<>();
		set2.add(KitechContextUtil.getSyspayno());
		set2.add(vo.getRcpt_psn_syspayno());
		set2.add(vo.getSupt_respn_syspayno());
		
		set.addAll(set2);
		ext5 = StringUtils.join(set, ";");
		
		String ext6 = StringUtils.join(set2, ";");
		
		aprVo.setManager(ext5); // 계산서 담당자
		aprVo.setYManager(ext5); // 영수기술지원 신청자
		aprVo.setCManager(ext5); // 청구결의 신청자
		aprVo.setMManager(ext6); // 미수수탁결의 신청자
		aprVo.setTManager(ext6); // 성적서담당자
		
		aprVo.setInfo(vo.getKolas_no() + "(" + vo.getRegst_nm() + "(" + vo.getRegst_empno() + "))");
		aprVo.setDecsnamt(String.valueOf(vo.getDecsn_amt()));
		
		apprFuncService.approvalScreen(aprVo);
	}
	
	/**
     * 외부기술지원 기술지원 최소
     * @param SptTecRcptInfoVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.30.
     */
	public void saveTechSuptCancel(SptTecSrcVo vo) throws KitechException{
		// 1) 기술지원 취소 업데이트
		vo.setPrcs_state("STE040");
		dao.updateSptTecRcptInfoPrcsState(vo);
		
		// 2) 장비실적 및 장비사용일지 삭제
		SptTecEquipRsltVo equipVo = new SptTecEquipRsltVo();
		equipVo.setTech_supt_req_no(vo.getTech_supt_req_no());
		equipVo.setCunsl_rcpt_no(vo.getCunsl_rcpt_no());
		dao.deleteSptTecSupEquipRslt(equipVo);
	}
	
	/**
     * 외부기술지원 카드결제 저장
     * @param SptTecRcptInfoVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.04.
     */
	public void saveCardPaymnt(SptCardPaymntVo vo) throws Exception{
		// 1) 카드응답 정보 저장
		dao.insertSptCardHis(vo.getHisVo());
		
		// 카드결제 승인 또는 취소가 성공이었을 경우 업데이트
		if(vo.getHisVo().getRS04() != null && "0000".equals(vo.getHisVo().getRS04())){
			// 2) 카드결제 후 기술지원접수(spttecrcptinfo) 업데이트
			SptTecRcptInfoVo rcptVo = vo.getRcptVo();
			dao.updateSptTecRcptInfoCard(rcptVo);
			
			SptApplTableVo applVo = new SptApplTableVo();
			applVo.setKolas_no(rcptVo.getKolas_no());
			applVo.setAppl_no(rcptVo.getCard_appl_no());
				
			// 3) 카드결제 저장
			if("STE030".equals(rcptVo.getPrcs_state())){ // 카드결제 취소			
				dao.updateSptApplTable(applVo);
			}else if("STE065".equals(rcptVo.getPrcs_state())){
				applVo.setAppl_ymd(rcptVo.getCard_issu_ymd().substring(2,8));
				applVo.setDel_yn("N");
				applVo.setGubun_cd("D1");
				dao.insertSptApplTable(applVo);
				
				// 통합프로세스 진행
				AprVo aprVo = new AprVo();
				aprVo.setLoginUserId(KitechContextUtil.getUserId());
				aprVo.setReporterId(KitechContextUtil.getSyspayno());
				aprVo.setEndpoint(KitechContextUtil.getUserId());
				aprVo.setMainKey(rcptVo.getTech_supt_req_no());
				aprVo.setReqNo(rcptVo.getTech_supt_req_no());
				aprVo.setUiId("S306");
				aprVo.setBillType("C");
				
				apprFuncService.formAccept(aprVo);
			}
		}
	}
	
	/**
     * 외부기술지원 기술내역 저장
     * @param SptTecRcptRegVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.04.
     */
	public void saveSptTecRcptInfoPost(SptTecRcptRegVo vo) throws KitechException{
		// 1) 기술지원 접수 수정
		SptTecRcptDetlVo detlVo = vo.getDetlVo();
		dao.updateSptTecRcptInfoPost(detlVo);
		
		// 2) 기술지원 실적등록 저장(삭제 후 저장)
		dao.deleteSptTecActRslt(detlVo.getTech_supt_req_no());
		
		List<SptTecActRsltVo> rsltList = vo.getRsltList();
		int seq = 1;
		for(SptTecActRsltVo rsltVo : rsltList){
			rsltVo.setCust_no(detlVo.getCust_no());
			rsltVo.setTech_supt_req_no(detlVo.getTech_supt_req_no());
			rsltVo.setCunsl_rcpt_no(detlVo.getCunsl_rcpt_no());
			rsltVo.setJob_ymd(detlVo.getComplt_ymd());
			rsltVo.setJob_psn_syspayno(detlVo.getRcpt_psn_syspayno());
			rsltVo.setSeq(seq);
			
			dao.insertSptTecActRslt(rsltVo);
			
			seq++;
		}
	}
	
	/**
     * 이지페이 SMS결제요청
     * @param EasyPaySMSVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.06.
     */
	public EasyPayInfoVo sendEasyPaySMS(EasyPaySMSVo vo){
		EasyPayInfoVo retVo = new EasyPayInfoVo();
		
		try{
			vo = kitechEasyPayClient.sendEasyPaySMS(vo);			
			retVo.setSuccess(vo.isSuccess());
			
			AppLog.info("\n ----------------------------- sendEasyPaySMS  EasyPaySMSVo : " + vo);
			
			if(vo.isSuccess()){
				SptTecSrcVo updVo = new SptTecSrcVo();
				
				updVo.setUpdt_syspayno("easyPay");
				updVo.setKolas_no(vo.getOrder_no());
				
				if("00301020".equals(vo.getTr_cd())){ // SMS결제요청
					// 응답결과 저장
					dao.insertEasypayRequestInfo(vo);
					
					// 기술지원 상태값 변경 
					updVo.setPrcs_state("STE056");	
					updVo.setProof_yn("STO020");
				}else if("00201000".equals(vo.getTr_cd())){ // SMS결제 취소
					// 기술지원 상태값 변경 
					updVo.setPrcs_state("STE030");
					updVo.setProof_yn("STO010");
				}
				
				dao.updateSptTecRcptInfoPrcsState(updVo);
				
				retVo.setRes_cd(vo.getRes_cd());
				retVo.setRes_msg(vo.getRes_msg());
			}
		}catch(Exception ex){
			retVo.setRes_cd("K008");
			retVo.setRes_msg("알수 없는 예외: " + ex.getMessage());
			retVo.setSuccess(false);
		}finally{
			if(!vo.isSuccess()){
				vo.setSyspayno(KitechContextUtil.getSyspayno());
				dao.insertXomxPgFailure(vo);
			}			
		}
		
		return retVo;
	}
	
	/**
     * 외부기술지원(유상)- 카드처리내역 팝업 저장
     * @param SptTecRcptInfoVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.07.
     */
	public void updateSptTecRcptInfoCard(SptTecRcptInfoVo vo) throws KitechException{
		dao.updateSptTecRcptInfoCard(vo);
	}
	
	/**
     * 외부기술지원(유상)- RPA 수행여부 Update
     * @param SptTecRcptInfoVo
     * @throws Exception
	 * @author KimJooYeol
	 * @since 2023.11.03.
     */
	public void updateRpaYn(SptTecRcptInfoVo vo) throws KitechException{
		String kolas_value = vo.getKolas_no();
		String rpa_value = vo.getRpa_result_yn();
		String [] kolas_array = kolas_value.split(";");
		String [] rpa_array = rpa_value.split(";");
		
		for(int i=0;i<kolas_array.length;i++){
			vo.setKolas_no(kolas_array[i]);
			vo.setRpa_result_yn(rpa_array[i]);
			dao.updateRpaYn(vo);
		}
	}
	
	/**
     * 외부기술지원(유상) 엑셀내리기(장비)
     * @param SptTecSrcVo
     * @return List<SptTecRcptListVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.11.
     */
	public List<SptTecRcptListVo> selectSptTecRcptExcelDown(SptTecSrcVo vo) throws KitechException{
		return dao.selectSptTecRcptExcelDown(vo);
	}
}