/**
 * 
 */
package kr.re.kitech.biz.api.server.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.re.kitech.biz.api.server.dao.BizEipBizDAO;
import kr.re.kitech.biz.api.server.service.BizEipBizService;
import kr.re.kitech.biz.api.server.vo.ApiEipAnnPayProVo;
import kr.re.kitech.biz.api.server.vo.ApiEipCardPayProVo;
import kr.re.kitech.biz.api.server.vo.ApiEipCardUnproVo;
import kr.re.kitech.biz.api.server.vo.ApiEipDormReqVo;
import kr.re.kitech.biz.api.server.vo.ApiEipEduDeadlineVo;
import kr.re.kitech.biz.api.server.vo.ApiEipHumAppoVo;
import kr.re.kitech.biz.api.server.vo.ApiEipHumEducVo;
import kr.re.kitech.biz.api.server.vo.ApiEipHumEvalVo;
import kr.re.kitech.biz.api.server.vo.ApiEipHumRewardVo;
import kr.re.kitech.biz.api.server.vo.ApiEipMNoteVo;
import kr.re.kitech.biz.api.server.vo.ApiEipMRoomReqVo;
import kr.re.kitech.biz.api.server.vo.ApiEipPosiCompVo;
import kr.re.kitech.biz.api.server.vo.ApiEipPrjInfoVo;
import kr.re.kitech.biz.api.server.vo.ApiEipResReportVo;
import kr.re.kitech.biz.api.server.vo.ApiEipTripPayVo;
import kr.re.kitech.biz.api.server.vo.ApiEipTripUnproVo;
import kr.re.kitech.biz.api.server.vo.ApiEipVacaReqVo;
import kr.re.kitech.biz.api.server.vo.ApiEipWrkGoalTimeVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * BPM 대응 서비스 구현체
 * @author James
 * @since 2022. 6. 29.
 */
@Service("bizEipBizServiceImpl")
public class BizEipBizServiceImpl implements BizEipBizService {

    @Resource(name="bizEipBizDAO")
    private BizEipBizDAO bizEipBizDAO;
    
	@Override
	public List<ApiEipMNoteVo> selectFspmeetmnthList(String param) throws KitechException {
		List<ApiEipMNoteVo> list = bizEipBizDAO.selectFspmeetmnthList(param);	
		return list;
	}
	
	@Override
	public List<ApiEipMNoteVo> selectMNoteWriteList(String param) throws KitechException {
		List<ApiEipMNoteVo> list = bizEipBizDAO.selectMNoteWriteList(param);	
		return list;
	}
	
	@Override
	public List<ApiEipEduDeadlineVo> selectEduDeadLineList(String param) throws KitechException {
		List<ApiEipEduDeadlineVo> list = bizEipBizDAO.selectEduDeadLineList(param);	
		return list;
	}
	
	@Override
	public List<ApiEipMRoomReqVo> selectMRoomReqList(String param) throws KitechException {
		List<ApiEipMRoomReqVo> list = bizEipBizDAO.selectMRoomReqList(param);	
		return list;
	}
	
	@Override
	public List<ApiEipDormReqVo> selectDormReqList(String param) throws KitechException {
		List<ApiEipDormReqVo> list = bizEipBizDAO.selectDormReqList(param);	
		return list;
	}
	
	@Override
	public List<ApiEipWrkGoalTimeVo> selectWrkGoalTimeList(String param) throws KitechException {
		List<ApiEipWrkGoalTimeVo> list = bizEipBizDAO.selectWrkGoalTimeList(param);	
		return list;
	}
	
	@Override
	public List<ApiEipTripUnproVo> selectTripUnproList(String param) throws KitechException {
		List<ApiEipTripUnproVo> list = bizEipBizDAO.selectTripUnproList(param);	
		return list;
	}
	
	@Override
	public List<ApiEipCardUnproVo> selectCardUnproList(String param) throws KitechException {
		List<ApiEipCardUnproVo> list = bizEipBizDAO.selectCardUnproList(param);	
		return list;
	}
	

	
	@Override
	public List<ApiEipPosiCompVo> selectPosiCompTotalList(String param) throws KitechException {
		List<ApiEipPosiCompVo> list = bizEipBizDAO.selectPosiCompTotalList(param);	
		return list;
	}
	
	@Override
	public List<ApiEipPosiCompVo> selectPosiCompList() throws KitechException {
		List<ApiEipPosiCompVo> list = bizEipBizDAO.selectPosiCompList();	
		return list;
	}
	
	
	
	
	
	@Override
	public List<ApiEipPrjInfoVo> selectAssiInfoCount(String param) throws KitechException {
		List<ApiEipPrjInfoVo> list = bizEipBizDAO.selectAssiInfoCount(param);	
		return list;
	}
	
	@Override
	public List<ApiEipPrjInfoVo> selectPrjInfo(String param) throws KitechException {
		List<ApiEipPrjInfoVo> list = bizEipBizDAO.selectPrjInfo(param);	
		return list;
	}
	
	@Override
	public List<ApiEipTripPayVo> selectTripPayList(String param) throws KitechException {
		List<ApiEipTripPayVo> list = bizEipBizDAO.selectTripPayList(param);	
		return list;
	}
	
	@Override
	public List<ApiEipVacaReqVo> selectVacaReq(String param) throws KitechException {
		List<ApiEipVacaReqVo> list = bizEipBizDAO.selectVacaReq(param);	
		return list;
	}
	
	@Override
	public List<ApiEipAnnPayProVo> selectAnnPayProList(String param) throws KitechException {
		List<ApiEipAnnPayProVo> list = bizEipBizDAO.selectAnnPayProList(param);	
		return list;
	}
	
	@Override
	public List<ApiEipCardPayProVo> selectCardPayProList(String param) throws KitechException {
		List<ApiEipCardPayProVo> list = bizEipBizDAO.selectCardPayProList(param);	
		return list;
	}
	
	@Override
	public List<ApiEipHumAppoVo> selectHumAppointLogList(String param) throws KitechException {
		List<ApiEipHumAppoVo> list = bizEipBizDAO.selectHumAppointLogList(param);	
		return list;
	}
	
	@Override
	public List<ApiEipHumEducVo> selectHumEducationLogList(String param) throws KitechException {
		List<ApiEipHumEducVo> list = bizEipBizDAO.selectHumEducationLogList(param);	
		return list;
	}
	
	@Override
	public List<ApiEipHumEvalVo> selectHumEvaluationLogList(String param) throws KitechException {
		List<ApiEipHumEvalVo> list = bizEipBizDAO.selectHumEvaluationLogList(param);	
		return list;
	}
	
	@Override
	public List<ApiEipHumRewardVo> selectHumRewardLogList(String param) throws KitechException {
		List<ApiEipHumRewardVo> list = bizEipBizDAO.selectHumRewardLogList(param);	
		return list;
	}
	
	@Override
	public List<ApiEipResReportVo> selectResReportList(ApiEipResReportVo vo) throws KitechException {
		List<ApiEipResReportVo> list = bizEipBizDAO.selectResReportList(vo);	
		return list;
	}
	
}
