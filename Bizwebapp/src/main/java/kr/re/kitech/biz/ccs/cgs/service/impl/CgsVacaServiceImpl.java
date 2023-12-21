package kr.re.kitech.biz.ccs.cgs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.api.server.vo.biz.CgsAnnlHoliVo;
import kr.re.kitech.biz.ccs.cgs.dao.CgsVacaDAO;
import kr.re.kitech.biz.ccs.cgs.dao.CgslappDAO;
import kr.re.kitech.biz.ccs.cgs.service.CgsVacaService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCrtYmHolVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappHumVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;


/**  
 * @ClassSubJect 연차 일괄 생성 서비스 로직
 * @Class Name : CgsVacaService.java
 * @Description : 연차 일괄 생성 : 연수생(근로), 연구별정(단), 행정별정(단) 월차개념으로 부여 (전자결재 웹서비스에 의해 실행)
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/08/05		전재우			최초생성
 * 
 * @author 전재우
 * @since 2022/08/05
 * @version 1.0
 * @see
 * 
 */
@Service("cgsVacaService")
public class CgsVacaServiceImpl extends EgovAbstractServiceImpl implements CgsVacaService {
	@Resource(name="cgsVacaDAO")
    private CgsVacaDAO dao;
    
    @Resource(name="cgslappDAO")
    private CgslappDAO lappDao;
	
	/**
    * 연차 일괄 생성
    * @param ApiBpmVo
    * @author JeonJW
    * @since 2022.08.04.
    */
	@Override
	public void createYmHol(CgsAnnlHoliVo vo) throws KitechException {		
		String currYmd = DateUtil.getCurrentDate(); // 현재일자
		// 이전 데이터 생성시 예외 처리
		currYmd = (currYmd.substring(0, 4).compareTo(vo.getAnal_yr()) > 0) ? vo.getAnal_yr() + "1231" : currYmd;
		vo.setCur_ymd(currYmd);

		// 0. 소멸예정연차 조회
		this.getWillExpireMap(vo);
		
		CgslappHumVo humVo = lappDao.selectHumInfo(vo.getSyspayno());
		String occugrpCd = humVo.getOccugrp_cd();
		String occuTypCd = humVo.getOccutyp_cd();
		String posiCd = humVo.getPosi_cd();
			
		// 1. 일반직 연차생성: 임원, 파견관, 연수생(근로), 연구별정(단), 행정별정(단) 직군이 기타, 전년도퇴사자 제외
		if(!posiCd.matches("110010|210015|250040|330010|350020|351020|354010") 
				&& ( ("HAA030".equals(occugrpCd) && "353000".equals(occuTypCd)) || !"HAA030".equals(occugrpCd))){ /* 임원, 파견관, 연구별정(단), 행정별정(단), 연수생 */
			// 1-0. 현재 기준 생성 연차 삭제	
			vo.setTarget("REGULAR");
			dao.deleteCgsAnUlmHold(vo);		
	
			// 1-1. 대상자 별 연차 생성		
			this.registYmHol(dao.selectHumBasicInfo(vo), vo);
		}
		
		// 2.학생연구원 연차생성: 351020-UST학생(근로), 350020-학연협동과정생(근로), 354010-근로연수생
		if(posiCd.matches("351020|350020|354010")){
			// 2-1. 생성 대상 삭제
			vo.setTarget("STUDENT");
			dao.deleteCgsAnUlmHold(vo);	
			// 2-2. 월차대상 병합(생성)
			AppLog.debug("\n ################# CgsAnnlHoliVo : " + vo);
			dao.updateCgsAnulmHoldStuMon(vo);
			// 2-3. 연차대상 병합(생성)
			dao.updateCgsAnulmHoldStuYr(vo);
		}
		
		// 3. 아르바이트 연차생성: 월차개념, 연구별정(단)/ 행정별정(단)
		if(posiCd.matches("210015|250040")){
			vo.setTarget("ARBEIT");
			// 3-1. 삭제
			dao.deleteCgsAnUlmHold(vo);		
			
			// 3-2.아르바이트 , 연구별정(단)/ 행정별정(단) 연차생성
			this.registYmHol(dao.selectHumBasicInfoArb(vo), vo);
		}
		
		// 4. 시간선택제
		if(posiCd.matches("170010|170020|170030|170040|170050")){
			vo.setTarget("FLEXTIME");
			// 4-1. 삭제
			dao.deleteCgsAnUlmHold(vo);		
			// 4-2. 연차생성
			this.registYmHol(dao.selectHumBasicInfoTime(vo), vo);
		}
		
		// 5. 비상근 연차생성: 310010-임원(비상근), 310070-행정별정(비상근), 310032 -연구별정Ⅰ(비상근), 310051-연구별정Ⅱ(비상근)
		if(posiCd.matches("310010|310070|310051|310032")){
			vo.setTarget("PARTTIME");
			// 5-1. 삭제
			dao.deleteCgsAnUlmHold(vo);		
			// 5-2. 월차대상 병합(생성)
			dao.updateCgsAnulmHoldTimeMon(vo);
			// 5-3. 연차대상 병합(생성)
			dao.updateCgsAnulmHoldTimeYr(vo);
		}
		
		if(vo.getAnal_yr().compareTo("2025") >= 0){
			// 6. 2022년저축부터 60개이상 저축 시 소멸 < 계산상으로 24년부터 소멸시작>
			this.updateYmHol(dao.selectCgsAnulmHoldExpir(vo));
		}
	}
	
	/**
    * 소멸연차조회
    * @param String entrYmd, String currYmd
    * @return double
    * @author JeonJW
    * @since 2022.08.04.
    */
	private void getWillExpireMap(CgsAnnlHoliVo vo) throws KitechException{
		List<CgsAnnlHoliVo> srcList = dao.selectCgsAnnual(vo);
		for(CgsAnnlHoliVo holiVo : srcList){			
			// 연차소멸 계산시 사용한 전년도 포함 4년간의 사용연차를 금년 계산로직에서 제외
			dao.updateCgsAnnual(holiVo);
		}
	}
	
	/**
    * 생성연차를 계산하는 내부 메소드
    * @param String entrYmd, String currYmd
    * @return double
    * @author 이영희
    * @since 2022.08.10.
    */
	private double calcCreateAnalQty(String entrYmd, String currYmd) throws Exception{
		final int MAX_MONS_QTY = 11;
		final int MAX_YEAR_QTY = 15;
		final int MAX_ANAL_QTY = 25;

		// 0. 현재년도 세팅.
		int curyear = Integer.parseInt(currYmd.substring(0, 4));
		// 1. 계산을 위해 입사년도 세팅: 입사일자가 없는 경우 현재년도로 세팅 함.
		int entyear = (entrYmd.length() == 8) ? Integer.parseInt(entrYmd.substring(0, 4)) : curyear;

		// 입사일을 입사월의 1일로 변경한다.(기준설정)
		// entrYmd = entrYmd.substring(0, 6) + "01";

		int createAnalQty = 0;
		// 2. 생성시킬 연차개수 계산을 위해 현재년도에서 입사년도를 차감하여 입사년차를 계산.
		switch (curyear - entyear) {
		case 0: // 1년차
		case 1: // 2년차
			// 공통 월차계산: 월차는 최대 11 이상은 적용되지 않음.
			
			int monthAnalQty = Math.min(websquare.util.DateUtil.getMonthDiffer(entrYmd, currYmd), MAX_MONS_QTY);
			// 2년차의 소급연차 계산:
			int yearAnalQty = 0;
			if (1 == (curyear - entyear)) {
				// 현재 계산된 월차에서 전년도 생성 월차 감산
				monthAnalQty = (monthAnalQty - websquare.util.DateUtil.getMonthDiffer(entrYmd, entrYmd.substring(0, 4) + "12" + entrYmd.substring(6, 8)));
				// 회계년도 기준으로 소급적용 연차 계산: 연차는 최대 15개 이상 적용되지 않음
				yearAnalQty = Math.min((int) Math.ceil(MAX_YEAR_QTY * (DateUtil.getDaysBetween(entrYmd, curyear + "0101")+1) / 365.), MAX_YEAR_QTY);
			}
			createAnalQty = Math.max(monthAnalQty + yearAnalQty, 0);
			break;
		case 2: // 3년차
		case 3: // 4년차
			createAnalQty = MAX_YEAR_QTY;
			break;
		default: // 5년차 이상
			// 2-2. 입사 후 5년차 부터
			createAnalQty = Math.min(MAX_YEAR_QTY + (int) Math.round((curyear - entyear - 3) / 2.), MAX_ANAL_QTY);
		}

		return createAnalQty;
	}
	
	/**
    * 정규직. 아르바이트, 시간선택제 연차등록
    * @param List<CgsCrtYmHolVo>, CgsAnnlHoliVo
    * @author 이영희
    * @since 2022.08.10.
    */
	private void registYmHol(List<CgsCrtYmHolVo> holList, CgsAnnlHoliVo vo) throws KitechException{
		String currYmd = vo.getCur_ymd();
		int iYear = Integer.parseInt(vo.getAnal_yr());	
		
		for(CgsCrtYmHolVo holVo : holList){	
			double createAnalQty = holVo.getCreat_anal_qty();
			double curExpireQty = 0;
			double calcExpireQty = 0;				
			
			String rmk = "";
			if("REGULAR".equals(vo.getTarget())){
				rmk = "연자 적용(신)";
			}else if("ARBEIT".equals(vo.getTarget())){
				rmk = "월차 적용(신)";
			}else if("FLEXTIME".equals(vo.getTarget())){
				rmk = "시간선택제 연차 적용(신)";
			}
			
			if("REGULAR".equals(vo.getTarget())){ // 일반직인 경우 	
				// 1-1. 생성연차를 계산: 금년 생성연차
				try {
					createAnalQty = this.calcCreateAnalQty(holVo.getEntr_ymd(), currYmd);
				} catch (Exception e) {
					throw new KitechException(Exceptions.ERROR, Business.CCS, "message.alert.ccs.cgs.0001");
				}
			}
			// 1-2. 금년 소멸예정연차 계산
			if(vo.getTarget().matches("REGULAR|FLEXTIME")){ // 일반직인, 시간선택제 경우 	
				// 2022년 연차부터 1~10년 저축가능. <22년도 이전 연차의 경우에는 3년까지 저축가능 : 최대 2024년이 최대>
				if(iYear <= 2025){
					// 2025년 이전 연차의 경우 4년전까지 연차 저축가능
					holVo.setCreate_save_qty04(0);
					holVo.setUse_save_qty04(0);
					if (iYear <= 2024) { // <22년도 이전 연차의 경우에는 3년까지 저축가능 : 최대 2024년이 최대>
						curExpireQty = holVo.getCreate_save_qty03() - holVo.getUse_save_qty03();
						
					} else { // 22년도 이후 연차의 경우 10년저축(60개 초과 시 소멸)
						curExpireQty = holVo.getCreate_save_qty10() - holVo.getUse_save_qty10(); // 10년저축
						
						calcExpireQty = createAnalQty 
								+ holVo.getCreate_save_qty01() 
								+ holVo.getCreate_save_qty02() 
								+ holVo.getCreate_save_qty03() 
								+ holVo.getCreate_save_qty04() 
								+ holVo.getCreate_save_qty05() 
								+ holVo.getCreate_save_qty06() 
								+ holVo.getCreate_save_qty07() 
								+ holVo.getCreate_save_qty08() 
								+ holVo.getCreate_save_qty09()  
								- holVo.getUse_save_qty00() 
								- holVo.getUse_save_qty01() 
								- holVo.getUse_save_qty02() 
								- holVo.getUse_save_qty03() 
								- holVo.getUse_save_qty04() 
								- holVo.getUse_save_qty05() 
								- holVo.getUse_save_qty06() 
								- holVo.getUse_save_qty07() 
								- holVo.getUse_save_qty08() 
								- holVo.getUse_save_qty09()  
								- 60;
								
						curExpireQty = curExpireQty + (calcExpireQty <= 0 ? 0 : calcExpireQty);
					}
				}
			}
			
			holVo.setAnal_yr(vo.getAnal_yr());
			holVo.setExpired_cnt(curExpireQty); //금년 소멸예정연차
			// 1-3. 전년 소멸예정연차가 차감된 저축연차(전년 잔여 연차- 전년 소멸 연차)
			double preHolRemain = holVo.getPre_hol_remain() - holVo.getPre_expire_qty();
			holVo.setCryfwd_anal_qty(preHolRemain);
			// 1-4.금년 생성연차
			holVo.setCreat_anal_qty(createAnalQty);
			
			// 1-5. 잔여연차 계산: 금년 생성연차 + 전년 잔여연차 - 금년 사용연차
			double curHolRemain = createAnalQty + preHolRemain - holVo.getCur_hol_used();
			// 잔여연차
			holVo.setRemidr_anal_qty(curHolRemain);
			holVo.setCreat_mhold_qty(0);
			holVo.setDuty_use_anal_qty(createAnalQty);
			holVo.setUse_anal_qty(holVo.getCur_hol_used());
			holVo.setRmk(DateUtil.formatDate(currYmd, "-") + rmk);
			holVo.setFinal_ymd(currYmd);
			holVo.setRegst_syspayno(("").equals(vo.getSyspayno()) ? "TmsSystem" : vo.getSyspayno());
			
			holVo.setRemidr_save_qty01(holVo.getCreate_save_qty01() - holVo.getUse_save_qty01());
			holVo.setRemidr_save_qty02(holVo.getCreate_save_qty02() - holVo.getUse_save_qty02());
			holVo.setRemidr_save_qty03(holVo.getCreate_save_qty03() - holVo.getUse_save_qty03());
			holVo.setRemidr_save_qty04(holVo.getCreate_save_qty04() - holVo.getUse_save_qty04());
			holVo.setRemidr_save_qty05(holVo.getCreate_save_qty05() - holVo.getUse_save_qty05());
			holVo.setRemidr_save_qty06(holVo.getCreate_save_qty06() - holVo.getUse_save_qty06());
			holVo.setRemidr_save_qty07(holVo.getCreate_save_qty07() - holVo.getUse_save_qty07());
			holVo.setRemidr_save_qty08(holVo.getCreate_save_qty08() - holVo.getUse_save_qty08());
			holVo.setRemidr_save_qty09(holVo.getCreate_save_qty09() - holVo.getUse_save_qty09());
			holVo.setRemidr_save_qty10(holVo.getCreate_save_qty10() - holVo.getUse_save_qty10());
			
			if(vo.getTarget().matches("REGULAR|FLEXTIME")){ // 일반직인, 시간선택제 경우 	
				dao.insertCgsAnulmHold(holVo);
				
			}else if("ARBEIT".equals(vo.getTarget())){
				if("1".equals(holVo.getRank().trim())){
					dao.insertCgsAnulmHold(holVo);
				}else{
					holVo.setRmk("(Append)");
					dao.updateCgsAnulmHoldArb(holVo);
				}
			}
		}
	}
	
	/**
    * 60개 이상연차 소멸 후 계산된 저축연차 수정
    * @param List<CgsCrtYmHolVo>
    * @author 이영희
    * @since 2022.08.11.
    */
	private void updateYmHol(List<CgsCrtYmHolVo> voList) throws KitechException{
		for(CgsCrtYmHolVo vo : voList){
			double excQty = vo.getRemidr_save_qty01()
						   + vo.getRemidr_save_qty02()
						   + vo.getRemidr_save_qty03()
						   + vo.getRemidr_save_qty04()
						   + vo.getRemidr_save_qty05()
						   + vo.getRemidr_save_qty06()
						   + vo.getRemidr_save_qty07()
						   + vo.getRemidr_save_qty08()
						   + vo.getRemidr_save_qty09()
						   + vo.getRemidr_save_qty10();
						   
			double excQtyCalc = 0;
			excQty = excQty - 60;
			
			double remidrSaveQty = vo.getRemidr_save_qty10();
			if(remidrSaveQty > 0 && excQty > 0){
				excQtyCalc = this.getExcQtyCalc(excQty, remidrSaveQty);
				excQty = excQty - excQtyCalc;
				vo.setCreate_save_qty10(remidrSaveQty -excQtyCalc);
			}
			
			remidrSaveQty = vo.getRemidr_save_qty09();
			if(remidrSaveQty > 0 && excQty > 0){
				excQtyCalc = this.getExcQtyCalc(excQty, remidrSaveQty);
				excQty = excQty - excQtyCalc;
				vo.setCreate_save_qty09(remidrSaveQty -excQtyCalc );
			}
			
			remidrSaveQty = vo.getRemidr_save_qty08();
			if(remidrSaveQty > 0 && excQty > 0){
				excQtyCalc = this.getExcQtyCalc(excQty, remidrSaveQty);
				excQty = excQty - excQtyCalc;
				vo.setCreate_save_qty08(remidrSaveQty -excQtyCalc );
			}
			
			remidrSaveQty = vo.getRemidr_save_qty07();
			if(remidrSaveQty > 0 && excQty > 0){
				excQtyCalc = this.getExcQtyCalc(excQty, remidrSaveQty);
				excQty = excQty - excQtyCalc;
				vo.setCreate_save_qty07(remidrSaveQty -excQtyCalc );
			}
			
			remidrSaveQty = vo.getRemidr_save_qty06();
			if(remidrSaveQty > 0 && excQty > 0){
				excQtyCalc = this.getExcQtyCalc(excQty, remidrSaveQty);
				excQty = excQty - excQtyCalc;
				vo.setCreate_save_qty06(remidrSaveQty -excQtyCalc );
			}
			
			remidrSaveQty = vo.getRemidr_save_qty05();
			if(remidrSaveQty > 0 && excQty > 0){
				excQtyCalc = this.getExcQtyCalc(excQty, remidrSaveQty);
				excQty = excQty - excQtyCalc;
				vo.setCreate_save_qty05(remidrSaveQty -excQtyCalc );
			}
			
			remidrSaveQty = vo.getRemidr_save_qty04();
			if(remidrSaveQty > 0 && excQty > 0){
				excQtyCalc = this.getExcQtyCalc(excQty, remidrSaveQty);
				excQty = excQty - excQtyCalc;
				vo.setCreate_save_qty04(remidrSaveQty -excQtyCalc );
			}
			
			remidrSaveQty = vo.getRemidr_save_qty03();
			if(remidrSaveQty > 0 && excQty > 0){
				excQtyCalc = this.getExcQtyCalc(excQty, remidrSaveQty);
				excQty = excQty - excQtyCalc;
				vo.setCreate_save_qty03(remidrSaveQty -excQtyCalc );
			}
			
			// 계산된 저축연차 파라미터 생성 및 저장
			dao.updateCgsAnulmHold(vo);
		}
	}
	
	/**
    * 소멸연차 구하기
    * @param double excQty, double remidrSaveQty
    * @return double
    * @author 이영희
    * @since 2022.08.11.
    */
	private double getExcQtyCalc(double excQty, double remidrSaveQty) throws KitechException{
		return remidrSaveQty <= excQty ? remidrSaveQty : excQty;
	}
}
