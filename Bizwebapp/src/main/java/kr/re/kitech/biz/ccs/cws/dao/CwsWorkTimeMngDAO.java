package kr.re.kitech.biz.ccs.cws.dao;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cws.vo.CwsSmryWorkTimeVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkDaysVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeAnalCountVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeBasicInfoVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailFlexListVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailFlexVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailListVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeSearchVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeStatusVo;

@Repository("cwsWorkTimeMngDAO")
public class CwsWorkTimeMngDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO{
	
	public CwsWorkTimeAnalCountVo selectAnnualDay(CwsWorkTimeSearchVo searchVo) throws ElException {
		
		return (CwsWorkTimeAnalCountVo)selectByPk("kr.re.kitech.biz.ccs.cws.selectAnnualDay", searchVo);
	}
	
	public CwsWorkTimeBasicInfoVo selectCommuteCd(CwsWorkTimeSearchVo searchVo) throws ElException {
		
		return (CwsWorkTimeBasicInfoVo)selectByPk("kr.re.kitech.biz.ccs.cws.selectCommuteCd", searchVo);
	}
	
	public CwsWorkTimeStatusVo selectExtWorkInfo(CwsWorkTimeSearchVo searchVo) throws ElException {
		
		return (CwsWorkTimeStatusVo)selectByPk("kr.re.kitech.biz.ccs.cws.selectExtWorkInfo", searchVo);
	}
	
	public CwsWorkTimeDetailFlexVo selectFlxDtlWorkTime(CwsWorkTimeSearchVo searchVo) throws ElException {
		
		return (CwsWorkTimeDetailFlexVo)selectByPk("kr.re.kitech.biz.ccs.cws.selectFlxDtlWorkTime", searchVo);
	}
	
	public CwsWorkTimeDetailFlexListVo selectFlxWorkTimes(CwsWorkTimeSearchVo searchVo) throws ElException {
		
		return (CwsWorkTimeDetailFlexListVo)selectByPk("kr.re.kitech.biz.ccs.cws.selectFlxWorkTimes", searchVo);
	}
	
	public CwsSmryWorkTimeVo selectSmryWorkTime(CwsWorkTimeSearchVo searchVo) throws ElException {
		
		return (CwsSmryWorkTimeVo)selectByPk("kr.re.kitech.biz.ccs.cws.selectSmryWorkTime", searchVo);
	}
	
	public CwsWorkTimeDetailVo selectStdDtlWorkTime(CwsWorkTimeSearchVo searchVo) throws ElException {
		return (CwsWorkTimeDetailVo)selectByPk("kr.re.kitech.biz.ccs.cws.selectStdDtlWorkTime", searchVo);
	}
	
	public CwsWorkTimeDetailListVo selectStdWorkTimes(CwsWorkTimeSearchVo searchVo) throws ElException {
		
		return (CwsWorkTimeDetailListVo)selectByPk("kr.re.kitech.biz.ccs.cws.selectStdWorkTimes", searchVo);
	}
	
	public CwsWorkDaysVo selectWorksDays(CwsWorkTimeSearchVo searchVo) throws ElException {
		
		return (CwsWorkDaysVo)selectByPk("kr.re.kitech.biz.ccs.cws.selectWorksDaysCount", searchVo);
	}
	
}
