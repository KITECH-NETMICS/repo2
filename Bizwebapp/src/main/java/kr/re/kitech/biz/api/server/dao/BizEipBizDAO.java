package kr.re.kitech.biz.api.server.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

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
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
/**
 * @ClassSubJect BPM 대응 공통 API 관련 DAO
 * @Class Name BizBpmDAO.java
 * @Description BPM 대응 공통 API 관련 데이터를 처리한다.
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/29     박정일             최초생성
 * 
 * @author 박정일
 * @since 2022/07/29
 * @version 1.0
 * @see
 * 
 */
@Repository("bizEipBizDAO")
public class BizEipBizDAO extends BizDefaultAbstractDAO {

	/**
     * 사번에 해당하는 참여회의록을 조회한다
	 * 
     * @param String syspayno
     * @return List<ApiEipMNoteVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipMNoteVo> selectFspmeetmnthList(String syspayno) {
		return (List<ApiEipMNoteVo>)list("kr.re.kitech.biz.api.eip.selectMNoteList", syspayno);
	}
	
	/**
     * 사번이해당하는 작성회의록을 조회한다
	 * 
      * @param String syspayno
     * @return List<ApiEipMNoteVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipMNoteVo> selectMNoteWriteList(String syspayno) {
		return (List<ApiEipMNoteVo>)list("kr.re.kitech.biz.api.eip.selectMNoteWriteList", syspayno);
	}
	
	/**
     * 사번에해당하는 교육마감일정을 조회한다
	 * 
     * @param String syspayno
     * @return List<ApiEipEduDeadlineVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipEduDeadlineVo> selectEduDeadLineList(String syspayno) {
		return (List<ApiEipEduDeadlineVo>)list("kr.re.kitech.biz.api.eip.selectEduDeadLineList", syspayno);
	}
	
	/**
     * 사번에해당하는 회의실신청을 조회한다
	 * 
     * @param String syspayno
     * @return List<ApiEipMRoomReqVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipMRoomReqVo> selectMRoomReqList(String syspayno) {
		return (List<ApiEipMRoomReqVo>)list("kr.re.kitech.biz.api.eip.selectMRoomReqList", syspayno);
	}
	
	 /**
     * 사번에해당하는 기숙사신청을 조회한다
	 * 
     * @param String syspayno
     * @return List<ApiEipDormReqVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipDormReqVo> selectDormReqList(String syspayno) {
		return (List<ApiEipDormReqVo>)list("kr.re.kitech.biz.api.eip.selectDormReqList", syspayno);
	}
	
	/**
     * 사번에해당하는 목표근무시간을 조회한다
	 * 
     * @param ApiEipWrkGoalTimeVo apiEipWrkGoalTimeVo
     * @return List<ApiEipWrkGoalTimeVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipWrkGoalTimeVo> selectWrkGoalTimeList(String syspayno) {
		return (List<ApiEipWrkGoalTimeVo>)list("kr.re.kitech.biz.api.eip.selectWrkGoalTimeList", syspayno);
	}
	
	/**
     * 사번에해당하는 출장정산 미처리 현황을 조회한다
	 * 
     * @param String syspayno
     * @return List<ApiEipTripUnproVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipTripUnproVo> selectTripUnproList(String syspayno) {
		return (List<ApiEipTripUnproVo>)list("kr.re.kitech.biz.api.eip.selectTripUnproList", syspayno);
	}
	
	/**
     * 사번에해당하는 카드 미처리 현황을 조회한다
	 * 
     * @param String syspayno
     * @return List<ApiEipCardUnproVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipCardUnproVo> selectCardUnproList(String syspayno) {
		return (List<ApiEipCardUnproVo>)list("kr.re.kitech.biz.api.eip.selectCardUnproList", syspayno);
	}
	
	/**
     * 보직자재실 현황 을 조회한다
	 * 
     * @param String syspayno
     * @return List<ApiEipCardUnproVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipPosiCompVo> selectPosiCompTotalList(String deptCode) {
		return (List<ApiEipPosiCompVo>)list("kr.re.kitech.biz.api.eip.selectPosiCompTotalList", deptCode);
	}
	
	/**
     * 보직자재실 상세 현황을 조회한다
	 * 
     * @param String syspayno
     * @return List<ApiEipCardUnproVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipPosiCompVo> selectPosiCompList() {
		return (List<ApiEipPosiCompVo>)list("kr.re.kitech.biz.api.eip.selectPosiCompList");
	}
	
	
	
	
	
	
	/**
     * 사번에해당하는 과제정보를 조회한다
	 * 
     * @param String syspayno
     * @return List<ApiEipPrjInfoVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipPrjInfoVo> selectPrjInfo(String syspayno) {
		return (List<ApiEipPrjInfoVo>)list("kr.re.kitech.biz.api.eip.selectPrjInfo", syspayno);
	}
	
	/**
     * 사번에해당하는 과제정보 건수를 조회한다
	 * 
     * @param String syspayno
     * @return List<ApiEipPrjInfoVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipPrjInfoVo> selectAssiInfoCount(String syspayno) {
		return (List<ApiEipPrjInfoVo>)list("kr.re.kitech.biz.api.eip.selectAssiInfoCount", syspayno);
	}
	
	/**
     * 사번에해당하는 출장현황결재진행을 조회한다.
	 * 
     * @param String syspayno
     * @return List<ApiEipTripPayVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipTripPayVo> selectTripPayList(String syspayno) {
		return (List<ApiEipTripPayVo>)list("kr.re.kitech.biz.api.eip.selectTripPayList", syspayno);
	}
	
	/**
     * 사번에해당하는 휴가신청내역을 조회한다.
	 * 
     * @param String syspayno
     * @return List<ApiEipVacaReqVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipVacaReqVo> selectVacaReq(String syspayno) {
		return (List<ApiEipVacaReqVo>)list("kr.re.kitech.biz.api.eip.selectVacaReq", syspayno);
	}
		
		
	/**
     * 사번에해당하는 카드결재진행 형황 내역을 조회한다.
	 * 
     * @param String syspayno
     * @return List<ApiEipVacaReqVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipCardPayProVo> selectCardPayProList(String syspayno) {
		return (List<ApiEipCardPayProVo>)list("kr.re.kitech.biz.api.eip.selectCardPayProList", syspayno);
	}
	
			/**
     * 사번에해당하는 연차결재진행 형환내역을 조회한다.
	 * 
     * @param String syspayno
     * @return List<ApiEipVacaReqVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipAnnPayProVo> selectAnnPayProList(String syspayno) {
		return (List<ApiEipAnnPayProVo>)list("kr.re.kitech.biz.api.eip.selectAnnPayProList", syspayno);
	}	
	
	/**
     *  사번에해당하는 발령사항 현황내역을 조회한다.
	 * 
     * @param String syspayno
     * @return List<ApiEipVacaReqVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipHumAppoVo> selectHumAppointLogList(String syspayno) {
		return (List<ApiEipHumAppoVo>)list("kr.re.kitech.biz.api.eip.selectHumAppointLogList", syspayno);
	}	
	
		/**
     *  사번에해당하는 교육이력 현황내역을 조회한다.
	 * 
     * @param String syspayno
     * @return List<ApiEipVacaReqVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipHumEducVo> selectHumEducationLogList(String syspayno) {
		return (List<ApiEipHumEducVo>)list("kr.re.kitech.biz.api.eip.selectHumEducationLogList", syspayno);
	}	
	
		/**
     *  사번에해당하는 인사평가 현황내역을 조회한다.
	 * 
     * @param String syspayno
     * @return List<ApiEipVacaReqVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiEipHumEvalVo> selectHumEvaluationLogList(String syspayno) {
		return (List<ApiEipHumEvalVo>)list("kr.re.kitech.biz.api.eip.selectHumEvaluationLogList", syspayno);
	}	
	
	/**
     *  사번에해당하는 상벌사항 현황내역을 조회한다.
	 * 
	 * @param String syspayno
	 * @return List<ApiEipVacaReqVo>
	 * @throws Exception
	 */	
	@SuppressWarnings("unchecked")
	public List<ApiEipHumRewardVo> selectHumRewardLogList(String syspayno) {
		return (List<ApiEipHumRewardVo>)list("kr.re.kitech.biz.api.eip.selectHumRewardLogList", syspayno);
	}	
	
	/**
     *  조건에 해당하는 연구보고서 목록을 조회한다.
	 * 
	 * @param ApiEipResReportVo vo
	 * @return List<ApiEipResReportVo>
	 * @throws Exception
	 */	
	@SuppressWarnings("unchecked")
	public List<ApiEipResReportVo> selectResReportList(ApiEipResReportVo vo) {
		return (List<ApiEipResReportVo>)list("kr.re.kitech.biz.api.eip.selectResReportList", vo);
	}	
	
	
		
}
