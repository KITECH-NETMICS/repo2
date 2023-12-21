package kr.re.kitech.biz.fin.spm.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.com.vo.FinCodeNmListVo;
import kr.re.kitech.biz.fin.com.vo.FinCodeNmVo;
import kr.re.kitech.biz.fin.leg.service.FinBgaCctmService;
import kr.re.kitech.biz.fin.leg.vo.FinBgaCctmDetlVo;
import kr.re.kitech.biz.fin.leg.vo.FinBgaCctmVo;
import kr.re.kitech.biz.fin.spm.service.FinSpmEtcService;
import kr.re.kitech.biz.fin.spm.vo.FspMeetAttendVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetDetlInfoVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetSearchVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetWorkTimeVo;

/**  
 * @ClassSubJect 재무관리 결의 제외 Controller
 * @Class Name : FinExpnsSlipController.java
 * @Description : 재무관리 결의 제외 서비스를 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/09/16   
 * 
 * @author 
 * @since 2022/09/16
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Controller
public class FinSpmEtcController {

	@Resource(name="finSpmEtcService")
	private FinSpmEtcService etcService;
	
	@Resource(name="finBgaCctmService")
	private FinBgaCctmService service;
	 
    /**
     * 회의록 목록을 조회한다
     * @param FspMeetSearchVo 
     * @throws Exception
     */
	@ElService(key = "SvcFINSPMETCR01")
	@RequestMapping(value = "SvcFINSPMETCR01")
	@ElDescription(sub = "회의록 목록 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<FspMeetVo> selectMeetList(FspMeetSearchVo vo) throws Exception{
		return etcService.selectMeetList(vo);
	}
	
    /**
     * 회의록 조회를 위한 부서를 조회한다
     * @param FinCodeNmVo 
     * @throws Exception
     */
	@ElService(key = "SvcFINSPMCOMR01")
	@RequestMapping(value = "SvcFINSPMCOMR01")
	@ElDescription(sub = "콤보용 부서코드 조회", desc = "")
	@ElValidator(errUrl = "")
	public FinCodeNmListVo selectDeptCodeList(FinCodeNmVo vo) throws Exception{
		FinCodeNmListVo retVo = new FinCodeNmListVo();
		retVo.setCodeNmList(etcService.selectDeptCodeList(vo));
		return retVo;
	}
	
    /**
     * 회의록 상세 내용을 조회한다
     * @param FspMeetSearchVo 
     * @throws Exception
     */
	@ElService(key = "SvcFINSPMETCR02")
	@RequestMapping(value = "SvcFINSPMETCR02")
	@ElDescription(sub = "회의록 상세 조회", desc = "")
	@ElValidator(errUrl = "")
	public FspMeetDetlInfoVo selectMeetDetls(FspMeetSearchVo vo) throws Exception{
		return etcService.selectMeetDetls(vo);
	}
	/**
	 * 회의록 작성시 참석자 출장 구분 조회
	 * @param FspMeetDetlsVo 
	 * @throws Exception
	 */	
	@ElService(key = "SvcFINSPMETCR03")
	@RequestMapping(value = "SvcFINSPMETCR03")
	@ElDescription(sub = "회의록 작성시 참석자 출장 구분 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<FspMeetWorkTimeVo> selectHomeWorkInfo(FspMeetSearchVo vo) throws Exception{
		return etcService.selectHomeWorkInfo(vo);
	}
	
	/**
	 * 회의참석자 근태정보 조회
	 * @param FspMeetDetlsVo 
	 * @throws Exception
	 */	
	@ElService(key = "SvcFINSPMETCR04")
	@RequestMapping(value = "SvcFINSPMETCR04")
	@ElDescription(sub = "회의참석자 근태 정보 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<FspMeetWorkTimeVo> selectCwsWorkTime(FspMeetSearchVo vo) throws Exception{
		return etcService.selectCwsWorkTime(vo);
	}
	
	/**
	 * 외부인 회의 참석 조회
	 * @param FspMeetDetlsVo 
	 * @throws Exception
	 */	
	@ElService(key = "SvcFINSPMETCR05")
	@RequestMapping(value = "SvcFINSPMETCR05")
	@ElDescription(sub = "외부인 회의 참석 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<FspMeetAttendVo> selectOutMeetPrsn(FspMeetSearchVo vo) throws Exception{
		return etcService.selectOutMeetPrsn(vo);
	}
	
	/**
	 * 회의록 저장
	 * @param FspMeetDetlInfoVo 
	 * @throws Exception
	 */	
	@ElService(key = "SvcFINSPMETCM01")
	@RequestMapping(value = "SvcFINSPMETCM01")
	@ElDescription(sub = "회의록 저장", desc = "")
	@ElValidator(errUrl = "")
	public FspMeetSearchVo saveMeetDetls(FspMeetDetlInfoVo vo) throws Exception{
		FspMeetSearchVo retVo = new FspMeetSearchVo();
		retVo.setMeet_req_no(etcService.saveMeetDetls(vo));
		return retVo;
	}
	
	/**
	 * 회의록 삭제
	 * @param FspMeetDetlsVo 
	 * @throws Exception
	 */	
	@ElService(key = "SvcFINSPMETCD01")
	@RequestMapping(value = "SvcFINSPMETCD01")
	@ElDescription(sub = "회의록 삭제", desc = "")
	@ElValidator(errUrl = "")
	public void deletMeetDetls(FspMeetSearchVo vo) throws Exception{
		etcService.deletMeetDetls(vo);
	}
	
	/**
	 * 일계표조회
	 * @param FinBgaCctmVo 
	 * @throws Exception
	 */	
	@ElService(key = "SvcFINSPMETCR06")
	@RequestMapping(value = "SvcFINSPMETCR06")
	@ElDescription(sub = "일계표조회", desc = "일계표조회")
	@ElValidator(errUrl = "")
	public List<FinBgaCctmDetlVo> selectFinDayAccntList(FinBgaCctmVo vo) throws Exception{
		return service.selectFinDayAccntList(vo);
	}
	
	@ElService(key = "SvcFINSPMETCR07")
	@RequestMapping(value = "SvcFINSPMETCR07")
	@ElDescription(sub = "회의참석자 과제참여여부 조회", desc = "")
	@ElValidator(errUrl = "")
	public Map<String, String> selectMeetPrjAttendYn(FspMeetSearchVo vo) throws Exception{
		Map<String, String> retMap = new HashMap<>();
		retMap.put("cnt", String.valueOf(etcService.selectMeetPrjAttendYn(vo)));
		
		return retMap;
	}
	
	@ElService(key = "SvcFINSPMETCR08")
	@RequestMapping(value = "SvcFINSPMETCR08")
	@ElDescription(sub = "회의록 계정의 국내출장계정과의 일치여부", desc = "회의록 저장시 체크")
	@ElValidator(errUrl = "")
	public List<FspMeetVo> selectCtrToMeetAccnt(FspMeetSearchVo vo) throws Exception{
		return etcService.selectCtrToMeetAccnt(vo);
	}
	
	@ElService(key = "SvcFINSPMETCR09")
	@RequestMapping(value = "SvcFINSPMETCR09")
	@ElDescription(sub = "회의참석자 근태 재조회", desc = "")
	@ElValidator(errUrl = "")
	public List<FspMeetAttendVo> selectMeetAttend(FspMeetSearchVo vo) throws Exception{
		return etcService.selectMeetAttend(vo);
	}
	
	@ElService(key = "SvcFINSPMETCM02")
	@RequestMapping(value = "SvcFINSPMETCM02")
	@ElDescription(sub = "회의록 결의생성", desc = "회의록 (경비,카드)결의를 생성한다.")
	@ElValidator(errUrl = "")
	public Map<String, String> saveMeetSlip(FspMeetDetlInfoVo vo) throws Exception{
		Map<String, String> retMap = new HashMap<>();
		retMap.put("unslip_no", etcService.saveMeetSlip(vo));
		
		return retMap;
	}
}
