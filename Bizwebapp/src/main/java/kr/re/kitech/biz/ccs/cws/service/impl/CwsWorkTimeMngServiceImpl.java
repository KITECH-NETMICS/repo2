package kr.re.kitech.biz.ccs.cws.service.impl;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cws.dao.CwsWorkTimeMngDAO;
import kr.re.kitech.biz.ccs.cws.service.CwsWorkTimeMngService;
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

@Service("cwsWorkTimeMngServiceImpl")
public class CwsWorkTimeMngServiceImpl implements CwsWorkTimeMngService {

    @Resource(name="cwsWorkTimeMngDAO")
    private CwsWorkTimeMngDAO cwsWorkTimeMngDAO;
	
	@Resource(name = "messageSource")
	private MessageSource messageSource;


	@Override
	public CwsWorkTimeAnalCountVo selectAnnualDay(CwsWorkTimeSearchVo searchVo) throws ElException {
		return cwsWorkTimeMngDAO.selectAnnualDay(searchVo);
	}
	
	@Override
	public CwsWorkTimeBasicInfoVo selectCommuteCd(CwsWorkTimeSearchVo searchVo) throws ElException {
		return cwsWorkTimeMngDAO.selectCommuteCd(searchVo);
	}
	
	@Override
	public CwsWorkTimeStatusVo selectExtWorkInfo(CwsWorkTimeSearchVo searchVo) throws ElException {
		return cwsWorkTimeMngDAO.selectExtWorkInfo(searchVo);
	}
	
	@Override
	public CwsWorkTimeDetailFlexVo selectFlxDtlWorkTime(CwsWorkTimeSearchVo searchVo) throws ElException {
		return cwsWorkTimeMngDAO.selectFlxDtlWorkTime(searchVo);
	}
	
	@Override
	public CwsWorkTimeDetailFlexListVo selectFlxWorkTimes(CwsWorkTimeSearchVo searchVo) throws ElException {
		return cwsWorkTimeMngDAO.selectFlxWorkTimes(searchVo);
	}
	
	@Override
	public CwsSmryWorkTimeVo selectSmryWorkTime(CwsWorkTimeSearchVo searchVo) throws ElException {
		return cwsWorkTimeMngDAO.selectSmryWorkTime(searchVo);
	}
	
	@Override
	public CwsWorkTimeDetailVo selectStdDtlWorkTime(CwsWorkTimeSearchVo searchVo) throws ElException {
		return cwsWorkTimeMngDAO.selectStdDtlWorkTime(searchVo);
	}
	
	@Override
	public CwsWorkTimeDetailListVo selectStdWorkTimes(CwsWorkTimeSearchVo searchVo) throws ElException {
		return cwsWorkTimeMngDAO.selectStdWorkTimes(searchVo);
	}
	
	@Override
	public CwsWorkDaysVo selectWorksDays(CwsWorkTimeSearchVo searchVo) throws ElException {
		return cwsWorkTimeMngDAO.selectWorksDays(searchVo);
	}
	
	@Override
	public CwsAllWorkTimeVo selectAllWorkTime(CwsWorkTimeSearchVo searchVo) throws ElException {
		CwsAllWorkTimeVo retVo = new CwsAllWorkTimeVo();
		
		// TODO : 해당하는 정보를 VO에 담아주는 작업 필요
		CwsWorkTimeBasicInfoVo infoVo = cwsWorkTimeMngDAO.selectCommuteCd(searchVo);
		if (infoVo == null) {
			return retVo;
		}
		String basedate = infoVo.getCreated_at();
		searchVo.setBasedate(basedate);
		searchVo.setYear(basedate.substring(0, 4));
		searchVo.setYyyymm(basedate.substring(0, 6));
		searchVo.setYyyymmdd(basedate);
		retVo.setCwsWorkTimeBasicInfoVo(infoVo);

		retVo.setCwsWorkTimeAnalCountVo(cwsWorkTimeMngDAO.selectAnnualDay(searchVo));
		retVo.setCwsWorkTimeStatusVo(cwsWorkTimeMngDAO.selectExtWorkInfo(searchVo));
		retVo.setCwsWorkDaysVo(cwsWorkTimeMngDAO.selectWorksDays(searchVo));
		retVo.setCwsSmryWorkTimeVo(cwsWorkTimeMngDAO.selectSmryWorkTime(searchVo));
		
		String commuteCd = retVo.getCwsWorkTimeBasicInfoVo().getCommute_cd();
		if (commuteCd.matches("HWT010|HWT020|HWT040|HWT050")) {
			retVo.setCwsWorkTimeDetailFlexVo(cwsWorkTimeMngDAO.selectFlxDtlWorkTime(searchVo));
		} else if (commuteCd.matches("HWT030|HWT035|HWT025")){
			retVo.setCwsWorkTimeDetailVo(cwsWorkTimeMngDAO.selectStdDtlWorkTime(searchVo));
		}
		
		
		return retVo;
	}
	
}

