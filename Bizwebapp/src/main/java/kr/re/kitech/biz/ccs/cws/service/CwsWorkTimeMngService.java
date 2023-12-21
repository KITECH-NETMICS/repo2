package kr.re.kitech.biz.ccs.cws.service;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cws.vo.CwsAllWorkTimeVo;
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

public interface CwsWorkTimeMngService {
	public CwsWorkTimeBasicInfoVo selectCommuteCd(CwsWorkTimeSearchVo searchVo) throws ElException;
	public CwsWorkTimeAnalCountVo selectAnnualDay(CwsWorkTimeSearchVo searchVo) throws ElException;
	public CwsWorkTimeStatusVo selectExtWorkInfo(CwsWorkTimeSearchVo searchVo) throws ElException;
	public CwsWorkDaysVo selectWorksDays(CwsWorkTimeSearchVo searchVo) throws ElException;
	public CwsSmryWorkTimeVo selectSmryWorkTime(CwsWorkTimeSearchVo searchVo) throws ElException;
	public CwsWorkTimeDetailVo selectStdDtlWorkTime(CwsWorkTimeSearchVo searchVo) throws ElException;
	public CwsWorkTimeDetailFlexVo selectFlxDtlWorkTime(CwsWorkTimeSearchVo searchVo) throws ElException;
	public CwsWorkTimeDetailListVo selectStdWorkTimes(CwsWorkTimeSearchVo searchVo) throws ElException;
	public CwsWorkTimeDetailFlexListVo selectFlxWorkTimes(CwsWorkTimeSearchVo searchVo) throws ElException;
	public CwsAllWorkTimeVo selectAllWorkTime(CwsWorkTimeSearchVo searchVo) throws ElException;
}
