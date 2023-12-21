package kr.re.kitech.biz.ccs.cws.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.ccs.com.service.CcsComService;
import kr.re.kitech.biz.ccs.com.vo.CwsCommVo;
import kr.re.kitech.biz.ccs.cws.service.CwsOutWorkService;
import kr.re.kitech.biz.ccs.cws.service.CwsPartTimerJorService;
import kr.re.kitech.biz.ccs.cws.service.CwsTagExceptService;
import kr.re.kitech.biz.ccs.cws.service.CwsWorkTimeMngService;
import kr.re.kitech.biz.ccs.cws.vo.CwsAllWorkTimeVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsExceptWorkTimeVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkListVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorListVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsSmryWorkTimeVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsTagExceptListVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsTagExceptVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkDaysVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeAnalCountVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeBasicInfoVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailFlexListVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailFlexVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailListVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeSearchVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeStatusVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeVo;


/**  
 * @ClassSubJect 근태관리 관련 처리른 하는 컨트롤러
 * @Class Name CwsController.java
 * @Description 근태관리 관련 처리른 하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/28     개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/03/28
 * @version 1.0
 * @see
 * 
 */

@Controller
public class CwsController {
	
    /** CwsOutWorkService */
    @Resource(name = "cwsOutWorkServiceImpl")
    private CwsOutWorkService cwsOutWorkService;
    
    /** CwsPartTimerJorService */
    @Resource(name = "cwsPartTimerJorServiceImpl")
    private CwsPartTimerJorService cwsPartTimerJorService;
    
    @Resource(name = "ccsComService")
    private CcsComService ccsComService;
    
    
    @Resource(name = "cwsTagExceptServiceImpl")
    private CwsTagExceptService cwsTagExceptService;
    
    @Resource(name = "cwsWorkTimeMngServiceImpl")
    private CwsWorkTimeMngService cwsWorkTImeMngService;
    
    @ElService(key = "SvcCCSCWSCOMR01")    
    @RequestMapping(value = "SvcCCSCWSCOMR01")    
    @ElValidator(errUrl = "")
    @ElDescription(sub = "담당자 조회", desc = "담당자 조회")    
    public CwsCommVo selectAuth(CwsCommVo cwsCommVo) throws Exception {
    	CwsCommVo vo = (CwsCommVo)ccsComService.selectAuth(cwsCommVo);
    	return vo;
    }
    
    /**
     * 재택근무신청을 단건 조회 처리 한다.
     * @param cwsOutWorkVo 재택근무신청 CwsOutWorkVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcCCSCWSOUTR01")    
    @RequestMapping(value="SvcCCSCWSOUTR01") 
    @ElDescription(sub = "재택근무신청 갱신 폼을  위한 조회", desc = "재택근무신청 갱신 폼을 위한 조회를 한다.")    
    public CwsOutWorkVo selectCwsOutWork(CwsOutWorkVo cwsOutWorkVo, Model model) throws Exception {
    	CwsOutWorkVo selectCwsOutWorkVo = cwsOutWorkService.selectCwsOutWork(cwsOutWorkVo);    	    
		
        return selectCwsOutWorkVo;
    }
    
    /**
     * 재택근무신청 목록을 조회합니다.
     * @param cwsOutWorkVo 재택근무신청 CwsOutWorkVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCWSOUTR02")
    @RequestMapping(value="SvcCCSCWSOUTR02")    
    @ElDescription(sub="재택근무신청 목록조회",desc="페이징을 처리하여 재택근무신청 목록 조회를 한다.")               
    public CwsOutWorkListVo selectListCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws Exception {    	   	
                  
        long totCnt = cwsOutWorkService.selectListCountCwsOutWork(cwsOutWorkVo);
        List<CwsOutWorkVo> cwsOutWorkList = cwsOutWorkService.selectListCwsOutWork(cwsOutWorkVo);
        
	
		CwsOutWorkListVo retCwsOutWorkList = new CwsOutWorkListVo();
		retCwsOutWorkList.setCwsOutWorkVoList(cwsOutWorkList); 
		retCwsOutWorkList.setTotalCount(totCnt);

        return retCwsOutWorkList;            
    }    
 
    /**
     * 재택근무신청을 중복 조회.
     * @param cwsOutWorkVo 재택근무신청 CwsOutWorkVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcCCSCWSOUTR03")    
    @RequestMapping(value="SvcCCSCWSOUTR03") 
    @ElDescription(sub = "재택근무신청 중복 조회", desc = "재택근무신청 중복 조회")    
    public void selectCwsOutWorkDupCheck(CwsOutWorkVo cwsOutWorkVo, Model model) throws Exception {
    	cwsOutWorkService.selectCwsOutWorkDupCheck(cwsOutWorkVo);
    } 
 
     /**
     * 재택근무신청을 유효성 조회.
     * @param cwsOutWorkVo 재택근무신청 CwsOutWorkVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcCCSCWSOUTR04")    
    @RequestMapping(value="SvcCCSCWSOUTR04") 
    @ElDescription(sub = "재택근무신청 유효성 조회", desc = "특정 날짜의 재택근무신청 유효성 조회")    
    public void selectCwsOutWorkValidCheck(CwsOutWorkVo cwsOutWorkVo, Model model) throws Exception {
    	cwsOutWorkService.selectCwsOutWorkValidCheck(cwsOutWorkVo);
    }
 
     /**
     * 재택근무신청를 등록 처리 한다.
     * @param cwsOutWorkVo 재택근무신청 CwsOutWorkVo
     * @throws Exception
     */
    @ElService(key = "SvcCCSCWSOUTM01")    
    @RequestMapping(value = "SvcCCSCWSOUTM01")    
    @ElValidator(errUrl = "")
    @ElDescription(sub = "재택근무정보저장", desc = "재택근무정보를 저장 한다.")    
    public CwsOutWorkVo saveCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws Exception { 
    	String req_no = cwsOutWorkService.saveCwsOutWork(cwsOutWorkVo);
    	cwsOutWorkVo.setReq_no(req_no);
    	return cwsOutWorkVo;
    	
    }

    /**
     * 재택근무신청를 삭제 처리한다.
     * @param cwsOutWorkVo 재택근무신청 CwsOutWorkVo     
     * @throws Exception
     */
    @ElService(key = "SvcCCSCWSOUTD01")    
    @RequestMapping(value="SvcCCSCWSOUTD01")
    @ElDescription(sub = "재택근무신청 삭제처리", desc = "재택근무신청를 삭제 처리한다.")    
    public void deleteCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws Exception {
        cwsOutWorkService.deleteCwsOutWork(cwsOutWorkVo);
    }
       
    /**
     * 비상근 업무일지 목록을 조회합니다.
     * @param cwsPartTimerJorVo 비상근 업무일지 CwsPartTimerJorVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCWSPTJR01")
    @RequestMapping(value="SvcCCSCWSPTJR01")    
    @ElDescription(sub="비상근 업무일지 목록조회",desc="페이징을 처리하여 비상근 업무일지 목록 조회를 한다.")               
    public CwsPartTimerJorListVo selectListCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo) throws Exception {    	   	

        List<CwsPartTimerJorVo> cwsPartTimerJorList = cwsPartTimerJorService.selectListCwsPartTimerJor(cwsPartTimerJorVo);                  
        long totCnt = cwsPartTimerJorService.selectListCountCwsPartTimerJor(cwsPartTimerJorVo);
	
		CwsPartTimerJorListVo retCwsPartTimerJorList = new CwsPartTimerJorListVo();
		retCwsPartTimerJorList.setCwsPartTimerJorVoList(cwsPartTimerJorList); 
		retCwsPartTimerJorList.setTotalCount(totCnt);

        return retCwsPartTimerJorList;            
    }  
        
    /**
     * 비상근 업무일지을 단건 조회 처리 한다.
     * @param cwsPartTimerJorVo 비상근 업무일지 CwsPartTimerJorVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcCCSCWSPTJR02")    
    @RequestMapping(value="SvcCCSCWSPTJR02") 
    @ElDescription(sub = "비상근 업무일지 갱신 폼을 위한 조회", desc = "비상근 업무일지 갱신 폼을 위한 조회를 한다.")    
    public CwsPartTimerJorVo selectCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo, Model model) throws Exception {
    	CwsPartTimerJorVo selectCwsPartTimerJorVo = cwsPartTimerJorService.selectCwsPartTimerJor(cwsPartTimerJorVo);    	    
		
        return selectCwsPartTimerJorVo;
    } 
    
    /**
     * 사용자의 근무시간을 조회한다.
     * @param CwsWorkTimeVo 근무시간Vo CwsWorkTimeVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcCCSCWSPTJR03")    
    @RequestMapping(value="SvcCCSCWSPTJR03") 
    @ElDescription(sub = "근무시간 조회", desc = "사용자의 근무시간을 조회 한다.")    
    public CwsWorkTimeVo selectCwsWorkTime(CwsWorkTimeVo cwsWorkTimeVo, Model model) throws Exception {
    	CwsWorkTimeVo selectCwsWorkTimeVo = cwsPartTimerJorService.selectCwsWorkTime(cwsWorkTimeVo);    	    
		
		AppLog.debug(cwsWorkTimeVo.toString());
		
        return selectCwsWorkTimeVo;
    } 
    
    /**
     * 비상근 업무일지 신청하려는 날짜에 신청한 데이터가 있는지 체크한다.
     * @param cwsPartTimerJorVo 비상근 업무일지 CwsPartTimerJorVo
     * @throws Exception
     */
    @ElService(key = "SvcCCSCWSPTJR04")    
    @RequestMapping(value="SvcCCSCWSPTJR04") 
    @ElDescription(sub = "비상근 업무일지 중복조회", desc = "비상근 업무일지 신청하려는 날짜에 신청한 데이터가 있는지 체크한다.")    
    public void selectCwsPartTimerJorCheck(CwsPartTimerJorVo cwsPartTimerJorVo) throws Exception {
    	cwsPartTimerJorService.selectCwsPartTimerJorCheck(cwsPartTimerJorVo);
    } 
 
    /**
     * 비상근 업무일지를 등록 처리 한다.
     * @param cwsPartTimerJorVo 비상근 업무일지 CwsPartTimerJorVo
     * @throws Exception
     */
    @ElService(key="SvcCCSCWSPTJM01")    
    @RequestMapping(value="SvcCCSCWSPTJM01")
    @ElDescription(sub="비상근 업무일지 등록처러",desc="비상근 업무일지를 등록 처리 한다.")
    public CwsPartTimerJorVo insertCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo, Model model) throws Exception {    	 
    	String req_no = cwsPartTimerJorService.saveCwsPartTimerJor(cwsPartTimerJorVo);
    	cwsPartTimerJorVo.setReq_no(req_no);
    	return cwsPartTimerJorVo;
    }
    
           /**
     * 특정일의 출퇴근 기록시간을 조회한다.
     * @param CwsExceptWorkTimeVo 출퇴근 기록시간Vo CwsExceptWorkTimeVo
     * @throws Exception
     */
    @ElService(key="SvcCCSCWSTAGR01")    
    @RequestMapping(value="SvcCCSCWSTAGR01")
    @ElDescription(sub="특정일 출 퇴근 기록시간 조회",desc="특정일의 출퇴근 기록시간을 조회한다.")
    public CwsExceptWorkTimeVo selectExceptWorkTimeTarget(CwsExceptWorkTimeVo cwsExceptWorkTimeVo, Model model) throws Exception {    	 
    	return cwsTagExceptService.selectExceptWorkTimeTarget(cwsExceptWorkTimeVo);   
    }
    
     /** 출퇴근 기록 미이행 사유서를 조회한다.
     * @param CwsTagExceptVo 출퇴근 기록시간Vo CwsTagExceptVo
     * @throws Exception
     */
    @ElService(key="SvcCCSCWSTAGR02")    
    @RequestMapping(value="SvcCCSCWSTAGR02")
    @ElDescription(sub="출퇴근 기록 미이행 사유서 조회",desc="출퇴근 기록 미이행 사유서를 조회한다.")
    public CwsTagExceptVo selectTagExcept(CwsTagExceptVo cwsTagExtVo, Model model) throws Exception {    	 
    	return cwsTagExceptService.selectTagExcept(cwsTagExtVo);
    }
    
     /** 출퇴근 기록 미이행 사유서 리스트를 조회한다.
     * @param CwsTagExceptVo 출퇴근 기록시간Vo CwsTagExceptVo
     * @throws Exception
     */
    @ElService(key="SvcCCSCWSTAGR03")    
    @RequestMapping(value="SvcCCSCWSTAGR03")
    @ElDescription(sub="출퇴근 기록 미이행 사유서 리스트 조회",desc="출퇴근 기록 미이행 사유서 리스트를 조회한다.")
    public CwsTagExceptListVo selectTagExceptList(CwsTagExceptVo cwsTagExtVo, Model model) throws Exception {
    	CwsTagExceptListVo retVo = new CwsTagExceptListVo();
    	
    	if (cwsTagExtVo.getDup_str() != null && cwsTagExtVo.getDup_str().equals("dup")) {
    		cwsTagExceptService.selectExceptWorkTimedupCheck(cwsTagExtVo);
		}
    	else {
    		retVo.setCwsTagExceptVoList(cwsTagExceptService.selectTagExceptList(cwsTagExtVo));
		}
    	
    	return retVo;
    }
    
     /** 출퇴근 기록 미이행 사유서를 저장한다.
     * @param CwsTagExtVo 출퇴근 기록시간Vo CwsTagExtVo
     * @throws Exception
     */
    @ElService(key="SvcCCSCWSTAGM01")    
    @RequestMapping(value="SvcCCSCWSTAGM01")
    @ElDescription(sub="출퇴근 기록 미이행 사유서 저장",desc="출퇴근 기록 미이행 사유서를 저장한다.")
    public CwsTagExceptVo saveTagExcept(CwsTagExceptVo cwsTagExtVo, Model model) throws Exception {    	 
    	
    	String req_no = cwsTagExceptService.saveTagExcept(cwsTagExtVo);
    	cwsTagExtVo.setReq_no(req_no);
    	return cwsTagExtVo;
    }
    
    @ElService(key="SvcCCSCWSWTCR01")    
    @RequestMapping(value="SvcCCSCWSWTCR01")
    @ElDescription(sub="근태관련 기본정보 조회",desc="최종 데이터 생성일을 기준으로 기본근태종류 코드 등 기본정보를 조회한다.")
    public CwsWorkTimeBasicInfoVo selectCommuteCd(CwsWorkTimeSearchVo searchVo, Model model) throws Exception {    	 
    	CwsWorkTimeBasicInfoVo retVo = cwsWorkTImeMngService.selectCommuteCd(searchVo);
      
      return retVo;
    }
    
    @ElService(key="SvcCCSCWSWTCR02")    
    @RequestMapping(value="SvcCCSCWSWTCR02")
    @ElDescription(sub="연차 및 보상/대체 휴일 정보 조회",desc="기준 년도에 대한 연차 및 보상/대체 휴일 정보를 조회한다.")
    public CwsWorkTimeAnalCountVo selectAnnualDay(CwsWorkTimeSearchVo searchVo, Model model) throws Exception {    	 
    	CwsWorkTimeAnalCountVo retVo = cwsWorkTImeMngService.selectAnnualDay(searchVo);
      
      return retVo;
    }

    @ElService(key="SvcCCSCWSWTCR03")    
    @RequestMapping(value="SvcCCSCWSWTCR03")
    @ElDescription(sub="근무시간현황 개괄 정보 조회",desc="기준일에 해당하는 근무시간현황 개괄 정보를 조회한다.")
    public CwsWorkTimeStatusVo selectExtWorkInfo(CwsWorkTimeSearchVo searchVo, Model model) throws Exception {    	 
    	CwsWorkTimeStatusVo retVo = cwsWorkTImeMngService.selectExtWorkInfo(searchVo);

      return retVo;
    }

    @ElService(key="SvcCCSCWSWTCR04")    
    @RequestMapping(value="SvcCCSCWSWTCR04")
    @ElDescription(sub="근무대상일수 조회",desc="특정인의 근무대상일수를 주어진 연도 및 월에 따라 구한다.")
    public CwsWorkDaysVo selectWorksDays(CwsWorkTimeSearchVo searchVo, Model model) throws Exception {    	 
    	CwsWorkDaysVo retVo = cwsWorkTImeMngService.selectWorksDays(searchVo);
      
      return retVo;
    }

    @ElService(key="SvcCCSCWSWTCR05")    
    @RequestMapping(value="SvcCCSCWSWTCR05")
    @ElDescription(sub="실근무시간 요약정보",desc="표준 및 유연 근무대상자의 실근무시간 요약 정보를 조회한다.")
    public CwsSmryWorkTimeVo selectSmryWorkTime(CwsWorkTimeSearchVo searchVo, Model model) throws Exception {    	 
    	CwsSmryWorkTimeVo retVo = cwsWorkTImeMngService.selectSmryWorkTime(searchVo);
      
      return retVo;
    }
    
        @ElService(key="SvcCCSCWSWTCR06")    
    @RequestMapping(value="SvcCCSCWSWTCR06")
    @ElDescription(sub="실근무시간 상세정보",desc="표준 근무대상자의 실근무시간 상세 정보를 조회한다.")
    public CwsWorkTimeDetailVo selectStdDtlWorkTime(CwsWorkTimeSearchVo searchVo, Model model) throws Exception {    	 
    	CwsWorkTimeDetailVo retVo = cwsWorkTImeMngService.selectStdDtlWorkTime(searchVo);
      
      return retVo;
    }
    
    @ElService(key="SvcCCSCWSWTCR07")    
    @RequestMapping(value="SvcCCSCWSWTCR07")
    @ElDescription(sub="실근무시간 상세정보",desc="유연 근무대상자의 실근무시간 상세 정보를 조회한다.")
    public CwsWorkTimeDetailFlexVo selectFlxDtlWorkTime(CwsWorkTimeSearchVo searchVo, Model model) throws Exception {    	 
    	CwsWorkTimeDetailFlexVo retVo = cwsWorkTImeMngService.selectFlxDtlWorkTime(searchVo);
      
      return retVo;
    }

    @ElService(key="SvcCCSCWSWTCR08")    
    @RequestMapping(value="SvcCCSCWSWTCR08")
    @ElDescription(sub="실근무시간 일별 리스트 조회",desc="표준근무제 해당하는 근무자의 실근무시간 일별 리스트를 조회한다.")
    public CwsWorkTimeDetailListVo selectStdWorkTimes(CwsWorkTimeSearchVo searchVo, Model model) throws Exception {    	 
    	CwsWorkTimeDetailListVo retVo = cwsWorkTImeMngService.selectStdWorkTimes(searchVo);
      
      return retVo;
    }

    @ElService(key="SvcCCSCWSWTCR09")    
    @RequestMapping(value="SvcCCSCWSWTCR09")
    @ElDescription(sub="실근무시간 일별 리스트 조회",desc="유연근무제 해당하는 근무자의 실근무시간 일별 리스트를 조회한다.")
    public CwsWorkTimeDetailFlexListVo selectFlxWorkTimes(CwsWorkTimeSearchVo searchVo, Model model) throws Exception {    	 
    	CwsWorkTimeDetailFlexListVo retVo = cwsWorkTImeMngService.selectFlxWorkTimes(searchVo);
      
      return retVo;
    }

    @ElService(key="SvcCCSCWSWTCR10")    
    @RequestMapping(value="SvcCCSCWSWTCR10")
    @ElDescription(sub="전체 조회",desc="모든 근무시간 정보를 조회한다.")
    public CwsAllWorkTimeVo selectAllWorkTime(CwsWorkTimeSearchVo searchVo, Model model) throws Exception {    	 
    	CwsAllWorkTimeVo retVo;
    	retVo = cwsWorkTImeMngService.selectAllWorkTime(searchVo);
    	if (retVo.getCwsWorkTimeBasicInfoVo() == null)
    		return retVo;
    	
    	return retVo;
    }

}
