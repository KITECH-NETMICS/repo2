package kr.re.kitech.biz.fin.spm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FinCodeNmVo;
import kr.re.kitech.biz.fin.com.vo.FinSaveSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.spm.dao.FinSpmEtcDAO;
import kr.re.kitech.biz.fin.spm.service.FinSpmEtcService;
import kr.re.kitech.biz.fin.spm.vo.FspMeetAttendVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetDetlInfoVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetDetlsVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetEvidVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetSearchVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetWorkTimeVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * FinSpmEtcServiceImpl
 * 결의제외 재무 ServiceImpl
 * @author 
 * @since 2022.09.16.
 */
@Service("finSpmEtcService")
public class FinSpmEtcServiceImpl extends EgovAbstractServiceImpl implements FinSpmEtcService {
	@Resource(name="finSpmEtcDAO")
	private FinSpmEtcDAO dao;
	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="finSlipSaveService")
	private FinSlipSaveService slipService;
	
	@Resource(name="finComService")
	private FinComService finComService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;

	/**
    * 회의록 목록 조회
    */
	//@Override
	public List<FspMeetVo> selectMeetList(FspMeetSearchVo vo) throws KitechException {
		// 전체 오픈 전까지 결의번호 저장(임시)
		List<FspMeetVo> meetList = dao.selectMeetUnslipNo(vo);
		if(meetList != null && meetList.size() > 0){
			for(FspMeetVo meetVo : meetList){
				dao.updateFspMeetUnslipNo(meetVo);
			}
		}
		return dao.selectMeetList(vo);
	}
	
	/**
    * 회의록 부서 코드 조회
    */
	//@Override
	public List<FinCodeNmVo> selectDeptCodeList(FinCodeNmVo vo) throws KitechException {
		return dao.selectDeptCodeList(vo);
	}

    /**
    * 회의록 내용 상세 조회
    * @param FspMeetSearchVo
    * @return FspMeetDetlInfoVo
    */
	//@Override
	public FspMeetDetlInfoVo selectMeetDetls(FspMeetSearchVo vo) throws KitechException {
		FspMeetDetlInfoVo returnVo = new FspMeetDetlInfoVo();
		
		//증빙 내용 조회
		returnVo.setEvidList(dao.selectMeetEvidList(vo));
		
		//회의내용 상세 조회
		FspMeetDetlsVo detlsVo = dao.selectMeetDetls(vo);
		returnVo.setDetlVo(detlsVo);
		
		//회의참석자 조회
		vo.setMeet_cls_time(detlsVo.getMeet_cls_time());
		vo.setMeet_start_time(detlsVo.getMeet_start_time());
		vo.setMeet_start_ymd(detlsVo.getMeet_start_ymd());
		vo.setMeet_cls_ymd(detlsVo.getMeet_cls_ymd());
		returnVo.setAttendList(dao.selectMeetAttendList(vo));
		 
		return returnVo;
	}
	
	/**
    * 회의참석자 근태 재조회
    * @param FspMeetSearchVo
    * @return List<FspMeetAttendVo>
	* @throws Exception
	* @author LeeYoungHee
	* @since 2023.11.01.
    */
	public List<FspMeetAttendVo> selectMeetAttend(FspMeetSearchVo vo) throws KitechException {
		List<FspMeetAttendVo> attendList = dao.selectMeetAttendList(vo);
		
		for(FspMeetAttendVo attendVo : attendList){
			vo.setSyspayno(attendVo.getSyspayno());
			
			for(FspMeetWorkTimeVo workVo : dao.selectCwsWorkTime(vo)){
				if(workVo.getWork_detls() != null && !"".equals(workVo.getWork_detls().trim())){
					attendVo.setRmk(workVo.getWork_detls());
					attendVo.setCtr_req_no(workVo.getCtr_req_no());
					attendVo.setAdjst_req_no(workVo.getAdjst_req_no());
					break;
				}
			}
		}
		
		return attendList;
	}
	
	/**
    * 회의록 작성시 참석자 재택근무정보 조회
    * @param FspMeetSearchVo
    * @return List<FspMeetWorkTimeVo>
    */
	//@Override
	public List<FspMeetWorkTimeVo> selectHomeWorkInfo(FspMeetSearchVo vo) throws KitechException {
		return dao.selectHomeWorkInfo(vo);
	}

    /**
    * 회의참석자 근태정보 조회
    * @param FspMeetSearchVo
    * @return List<FspMeetWorkTimeVo>
    */
	//@Override
	public List<FspMeetWorkTimeVo> selectCwsWorkTime(FspMeetSearchVo vo) throws KitechException {
		return dao.selectCwsWorkTime(vo);
	}

    /**
    * 외부인 회의 참석 조회
    * @param FspMeetSearchVo
    * @return List<FspMeetWorkTimeVo>
	* @throws Exception
    */
	public List<FspMeetAttendVo> selectOutMeetPrsn(FspMeetSearchVo vo) throws KitechException {
		return dao.selectOutMeetPrsn(vo);
	}
	
	/**
    * 회의록 저장
    * @param FspMeetSearchVo
    * @return List<FspMeetWorkTimeVo>
	* @throws Exception
    */
	public String saveMeetDetls(FspMeetDetlInfoVo vo) throws KitechException {
		//회의내용 마스터 저장
		FspMeetDetlsVo detlsVo = vo.getDetlVo();
		String reqNo = detlsVo.getMeet_req_no();
		
		//01. 회의록 마스터 저장
		if("C".equals(detlsVo.getCud_type())){
			reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F25");
			detlsVo.setMeet_req_no(reqNo);
			
			if(dao.insertFspmeetmnth(detlsVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"회의록 저장"});
			}
			
		}else{
			//회의록 마스터 수정
			dao.updateFspmeetmnth(detlsVo);			
		}
		
		// 02. 회의록 지출증빙(fspmeetevidh) 저장
		if(!"C".equals(detlsVo.getCud_type())){
			// 기존 지출증빙 삭제
			dao.deleteFspmeetevidh(reqNo);
		}
		for(FspMeetEvidVo evidVo : vo.getEvidList()){
			//회의신청번호 세팅
			evidVo.setMeet_req_no(reqNo);
			dao.insertFspmeetevidh(evidVo);	
		}
		
		// 03. 회의록 참석자 저장
		if(!"C".equals(detlsVo.getCud_type())){
			// 기존 지출증빙 삭제
			dao.deleteFspmeetmntd(reqNo);
		}
		
		FspMeetSearchVo searchVo = null;
		int seq = 1;
		for(FspMeetAttendVo attendVo : vo.getAttendList()){
			attendVo.setMeet_req_no(reqNo);
			attendVo.setSeq(seq);
			
			//비고가 없고 참석자가 내부인의 경우 근태정보 조회
			if("1".equals(attendVo.getUser_clsf()) && "".equals(attendVo.getRmk())){
				searchVo = new FspMeetSearchVo();
				
				searchVo.setMeet_req_no(reqNo);
				searchVo.setMeet_start_ymd(detlsVo.getMeet_start_ymd());
				searchVo.setMeet_cls_ymd(detlsVo.getMeet_cls_ymd());
				searchVo.setMeet_start_time(detlsVo.getMeet_start_time());
				searchVo.setMeet_cls_time(detlsVo.getMeet_cls_time());
				searchVo.setMeet_start_hour(detlsVo.getMeet_start_time().substring(0,2));
				searchVo.setMeet_cls_hour(detlsVo.getMeet_cls_time().substring(0,2));
				searchVo.setSyspayno(attendVo.getSyspayno());
				
				 List<FspMeetWorkTimeVo> workList = dao.selectCwsWorkTime(searchVo);
				 if(workList.size() > 0){
					 String workDetls = workList.get(0).getWork_detls();
					 if(workDetls != null && !"".equals(workDetls)){
						 attendVo.setRmk(workDetls);
					 }else{
						 if(workList.size() > 1){
							 workDetls = workList.get(1).getWork_detls();
							 if(workDetls != null && !"".equals(workDetls)){
								 attendVo.setRmk(workDetls);
							 }
						 }
					 }
				 }
			}
			
			dao.insertFspmeetmntd(attendVo);
			seq++;
		}
		
		return reqNo;
	}

	/**
    * 회의록 삭제
    * @param FspMeetSearchVo
    * @throws Exception
	*/
	public void deletMeetDetls(FspMeetSearchVo vo) throws KitechException {
		//참석자 삭제 처리
		dao.deleteFspmeetmnth(vo.getMeet_req_no());
		//카드증빙 내역 삭제 처리
		dao.deleteFspmeetevidh(vo.getMeet_req_no());
		//회의록 상세 내역 삭제 처리
		dao.deleteFspmeetmntd(vo.getMeet_req_no());
	}
	
	/**
	 * 회의참석자 과제참여 여부 조회
	 * @param FspMeetSearchVo
	 * @return int
	 * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.10.31.
	 */
	public int selectMeetPrjAttendYn(FspMeetSearchVo vo) throws KitechException{
		return dao.selectMeetPrjAttendYn(vo);
	}
	
	/**
    * 회의록 경비(카드)결의생성
    * @param FspMeetDetlsListVo, List<FspMeetEvidVo>
    * @return String unslipNo
    * @throws Exception
    * @author timothee
    * @since 2023.06.09.
	*/    
	public String saveMeetSlip(FspMeetDetlInfoVo vo) throws Exception{
		// 01.결의생성 전 저장
		//this.saveMeetDetls(vo);		
		
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //
		FspSlipHVo hVo = vo.getSlipHVo();
		
		FspMeetDetlsVo detlsVo = vo.getDetlVo();
		hVo.setWrte_dept(KitechContextUtil.getDeptCd());
		hVo.setWrte_dept_new_ymd(KitechContextUtil.getSession().getDeptNewYmd());
		hVo.setWrte_psn(KitechContextUtil.getSyspayno());
		hVo.setCud_type("C");
		
		String unslipNo = slipService.saveAutoSlipH(detlsVo.getMeet_req_no(), hVo);
		
		FinSaveSlipVo slipVo = new FinSaveSlipVo();
		// ==================================================== //
		// 2. 결의서 디테일(차변저장)
		// ==================================================== //	
		FspSlipDVo dVo = null;
		int seq = -1;
		
		List<FspSendReqVo> sendList = null;
		FspSendReqVo sendVo = null;
		for(FspMeetEvidVo evidVo : vo.getEvidList()){
			hVo.setCud_type("U");
			slipVo.setSlipHVo(hVo);			
			
			// 결의서 디테일
			dVo = new FspSlipDVo();
			seq = seq+2;			
			
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);
			dVo.setCud_type("C");
			
			if("113".equals(hVo.getSlip_typ_cd())){
				dVo.setJourn_cd("Fn0013");
				dVo.setEvid_cd(evidVo.getEvid_cd());
				dVo.setBill_no(evidVo.getIssu_seqno());
			}else{
				dVo.setJourn_cd("Fn0014");
				dVo.setEvid_cd("FAH500");
				dVo.setCard_no(evidVo.getCard_no());
				dVo.setApprvl_no(evidVo.getEvid_apprno());
				dVo.setUse_ymd(evidVo.getEvid_date());
				dVo.setCard_clsf(evidVo.getCard_clsf());
				dVo.setCard_knd(evidVo.getCard_knd());
				
				if("FAI001".equals(evidVo.getCard_clsf())){
					dVo.setRamt_mngmt_1("BC");
				}else{
					if("FAJ002".equals(evidVo.getCard_knd())){
						dVo.setRamt_mngmt_1("BC");
					}else if(evidVo.getCard_knd().matches("FAJ003|FAJ006|FAJ007")){
						dVo.setRamt_mngmt_1("신한");
					}else if(evidVo.getCard_knd().matches("FAJ008|FAJ009")){
						dVo.setRamt_mngmt_1("보탬e");
					}
				}
				dVo.setRamt_mngmt_2(evidVo.getCard_no());
			}
			
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("1");
			dVo.setAccnt_no(detlsVo.getAccnt_no());
			dVo.setAccnt_rspns(detlsVo.getAccnt_rspns());
			dVo.setFomat_unit(detlsVo.getFomat_unit());
			dVo.setAccnt_cd(evidVo.getAccnt_cd());
			dVo.setExpns_cd(evidVo.getExpns_cd());

			if("FTX001".equals(detlsVo.getTax_cd())){
				dVo.setUnslip_amt(evidVo.getChrg_amt());
				dVo.setTax_amt(evidVo.getTax_amt());
			}else{
				dVo.setUnslip_amt(evidVo.getEvid_amt());
				dVo.setTax_amt(0);
			}
			
			dVo.setTotal_amt(evidVo.getEvid_amt());			
			
			dVo.setRmk_1(hVo.getRmk());
			dVo.setRmk_2(evidVo.getEvid_shop());
			dVo.setReq_no(detlsVo.getMeet_req_no());
			dVo.setAttach_file_no(detlsVo.getAttach_file_no());
			
			slipVo.setSlipDVo(dVo);
			
			// 관리항목
			Map<String, String> map2 = new HashMap<String,String>();
			map2.put("unslip_ono", unslipNo);
			map2.put("unslip_odr", String.valueOf(seq));
			map2.put("accnt_cd", dVo.getAccnt_cd());
			map2.put("base_debit_cr", dVo.getBase_debit_cr());	
			map2.put("vend_nm", evidVo.getEvid_shop());
			map2.put("occr_ymd", evidVo.getEvid_date().substring(0, 8));
			map2.put("req_no", detlsVo.getMeet_req_no());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map2));
			
			// 송금내역
			sendList = new ArrayList<FspSendReqVo>();
			sendVo = new FspSendReqVo();
			
			sendVo.setCud_type("C");
			sendVo.setUnslip_no(unslipNo);
			sendVo.setUnslip_odr(seq);
			sendVo.setSend_odr(1);
			sendVo.setSend_req_amt(dVo.getTotal_amt());
			sendVo.setVend_cd("");
			sendVo.setVend_nm("");
			sendVo.setRmk(dVo.getRmk_1());
				
			if("113".equals(hVo.getSlip_typ_cd())){
				sendVo.setPay_clsf("FAX010");
				sendVo.setSend_amt(0);
				sendVo.setUse_ymd(evidVo.getEvid_date());
				
				sendVo.setSyspayno(evidVo.getSyspayno());
				sendVo.setBankaccnt_no(evidVo.getBankaccnt_no());
				sendVo.setBank(evidVo.getBank());
				sendVo.setDepstr_nm(evidVo.getDepstr_nm());
			}else{
				sendVo.setPay_clsf("FAX900");	
				sendVo.setSend_amt(evidVo.getEvid_amt());
				
				sendVo.setBankaccnt_no("");
				sendVo.setBank("");
				sendVo.setDepstr_nm("");
				sendVo.setVend_cd("");
				sendVo.setVend_nm("");
				sendVo.setSyspayno("");
				
				sendVo.setCard_no(evidVo.getCard_no());
				sendVo.setUse_ymd(evidVo.getEvid_date());
				sendVo.setApprvl_no(evidVo.getEvid_apprno());
				sendVo.setJoinsto_nm(evidVo.getEvid_shop()); // 가맹점명
			}
			sendList.add(sendVo);
			slipVo.setSendList(sendList);
			
			// 결의생성시 evidProcess를 호출하므로 미리저장위해 결의생성전 호출
			this.saveFspEvidAttach(hVo.getSlip_typ_cd(), dVo, detlsVo.getMeet_req_no());
			
			// 결의생성 호출
			slipService.saveSlip(slipVo).getUnslip_no();			
			
			// ================================================================ //
			// 04. fspmeetevidh 에 결의번호 업데이트
			// ================================================================ //	
			evidVo.setUnslip_no(unslipNo);
			evidVo.setUnslip_odr(seq);
					
			dao.updateFspMeetEvidUnslipNo(evidVo);
		} // end for evidList			

		return unslipNo;
	}
	
	/**
	 * 전자증빙 저장
	 * @param FspMeetEvidVo
	 * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.11.03.
	 */
	private void saveFspEvidAttach(String slipTypCd, FspSlipDVo dVo, String meetReqNo) throws Exception{
		String unslipNo = dVo.getUnslip_no();
		int seq = dVo.getUnslip_odr();
		
		// 전자증빙을 위한 참석자 출장정보 조회(중복제거 위해 다시 조회)
		List<FspMeetAttendVo> attendList = dao.selectMeetAttendEvid(meetReqNo);

		FbaExpnsEvidVo paramVo = new FbaExpnsEvidVo();
		paramVo.setDoc_id(slipTypCd);
		paramVo.setExpns_cd(dVo.getExpns_cd());
		paramVo.setAuto_yn("N");
		List<FspEvidAttachVo> attachList = new ArrayList<>();
		
		FspEvidAttachVo attachVo = null;
		for(FspEvidAttachVo vo : attachService.selectFbaExpnsEvidList(paramVo)){
			switch(vo.getEvid_item_cd()){
				case "C030" : // 국내출장신청서
				case "F045" : // 국내출장정산서	
					int evidItemSeq = 1;
					
					for(FspMeetAttendVo attendVo : attendList){					
						if(attendVo.getRmk().contains("국내출장")) {
						 	attachVo = new FspEvidAttachVo();
							BeanUtils.copyProperties(attachVo, vo);
						 	
							attachVo.setReq_no(unslipNo);
							attachVo.setUnslip_no(unslipNo);
							attachVo.setUnslip_odr(seq);
							attachVo.setEvid_mngmt_seq(evidItemSeq);
							
							if("C030".equals(vo.getEvid_item_cd())) {
								if(StringUtils.isBlank(attendVo.getAdjst_req_no())){
									attachVo.setKey_val(attendVo.getCtr_req_no());
								}
							}else {
								attachVo.setKey_val(attendVo.getAdjst_req_no());
							}
							
							if(StringUtils.isNotBlank(attachVo.getKey_val())){							
								attachList.add(attachVo);
								evidItemSeq++;
							}
						}
					}
					
					break;
					
				case "F014" : // 회의록					
					vo.setReq_no(unslipNo);
					vo.setUnslip_no(unslipNo);
					vo.setUnslip_odr(seq);
					vo.setKey_val(dVo.getReq_no());
					
					attachList.add(vo);
					
					break;
			}
		}
		
		AppLog.info("\n--------------------------- attachList : " + attachList.toString());
		attachService.saveFspEvidAttach(attachList);
	}
	
	/**
	 * 회의록 계정의 국내출장계정과의 일치여부
	 * @param FspMeetSearchVo
	 * @return int
	 * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.11.01.
	 */
	public List<FspMeetVo> selectCtrToMeetAccnt(FspMeetSearchVo vo) throws KitechException{
		return dao.selectCtrToMeetAccnt(vo);
	}
}
