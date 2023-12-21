/**
 * 
 */
package kr.re.kitech.biz.api.server.service;

import java.util.List;

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
* BPM 대응 서비스
 * @author James
 * @since 2022. 6. 29.
 */
public interface BizEipBizService {

	/**
     * 사번에 해당하는 참여회의록을 조회한다
	 * 
     * @param String param
     * @return List<ApiEipMNoteVo>
     * @throws KitechException
     */	
	public List<ApiEipMNoteVo> selectFspmeetmnthList(String param) throws KitechException;
	
	/**
     * 사번이해당하는 작성회의록을 조회한다
	 * 
     * @param String param
     * @return List<ApiEipMNoteVo>
     * @throws KitechException
     */	
	public List<ApiEipMNoteVo> selectMNoteWriteList(String param) throws KitechException;
	
	/**
     * 사번이해당하는 작성회의록을 조회한다
	 * 
     * @param String param
     * @return List<ApiEipEduDeadlineVo>
     * @throws KitechException
     */	
	public List<ApiEipEduDeadlineVo> selectEduDeadLineList(String param) throws KitechException;
	
	/**
     * 사번이해당하는 회의실신청을 조회한다
	 * 
     * @param String param
     * @return List<ApiEipMRoomReqVo>
     * @throws KitechException
     */	
	public List<ApiEipMRoomReqVo> selectMRoomReqList(String param) throws KitechException;
	
	/**
     * 사번이해당하는 회의실신청을 조회한다
	 * 
     * @param String param
     * @return List<ApiEipDormReqVo>
     * @throws KitechException
     */	
	public List<ApiEipDormReqVo> selectDormReqList(String param) throws KitechException;
	
	/**
     * 사번이해당하는 목표근무시간을 조회한다
	 * 
     * @param String param
     * @return List<ApiEipWrkGoalTimeVo>
     * @throws KitechException
     */	
	public List<ApiEipWrkGoalTimeVo> selectWrkGoalTimeList(String param) throws KitechException;
	
	/**
     * 사번이해당하는 출장정산 미처리를 조회한다
	 * 
     * @param String param
     * @return List<ApiEipTripUnproVo>
     * @throws KitechException
     */	
	public List<ApiEipTripUnproVo> selectTripUnproList(String param) throws KitechException;
	
	/**
     * 사번이해당하는 카드 미처리를 조회한다
	 * 
     * @param String param
     * @return List<ApiEipCardUnproVo>
     * @throws KitechException
     */	
	public List<ApiEipCardUnproVo> selectCardUnproList(String param) throws KitechException;
	
	
	/**
     *  보직자재실현황 토탈 를 조회한다
	 * 
     * @param 
     * @return List<ApiEipPosiCompVo>
     * @throws KitechException
     */	
	public List<ApiEipPosiCompVo> selectPosiCompTotalList(String param) throws KitechException;
	
	/**
     *  보직자재실현황를 조회한다
	 * 
     * @param 
     * @return List<ApiEipPosiCompVo>
     * @throws KitechException
     */	
	public List<ApiEipPosiCompVo> selectPosiCompList() throws KitechException;
	
	
	
	
	
	
	
	
	
	/**
     *  사번에해당하는 과제정보를 조회한다
	 * 
     * @param 
     * @return List<ApiEipPrjInfoVo>
     * @throws KitechException
     */	
	public List<ApiEipPrjInfoVo> selectPrjInfo(String param) throws KitechException;
	
	/**
     *  사번에해당하는 과제정보 건수를 조회한다
	 * 
     * @param 
     * @return List<ApiEipPrjInfoVo>
     * @throws KitechException
     */	
	public List<ApiEipPrjInfoVo> selectAssiInfoCount(String param) throws KitechException;
	
	/**
     *  사번에해당하는 출장현황결재진행을 조회한다.
	 * 
     * @param 
     * @return List<ApiEipTripPayVo>
     * @throws KitechException
     */	
	public List<ApiEipTripPayVo> selectTripPayList(String param) throws KitechException;
	
	/**
     *  사번에해당하는 휴가신청내역을 조회한다.
	 * 
     * @param 
     * @return List<ApiEipVacaReqVo>
     * @throws KitechException
     */	
	public List<ApiEipVacaReqVo> selectVacaReq(String param) throws KitechException;
	
		/**
     *  사번에해당하는 카드결재진행 형황 내역을 조회한다.
	 * 
     * @param 
     * @return List<ApiEipVacaReqVo>
     * @throws KitechException
     */	
	public List<ApiEipCardPayProVo> selectCardPayProList(String param) throws KitechException;
	
		/**
     *  사번에해당하는 연차결재진행 형환내역을 조회한다.
	 * 
     * @param 
     * @return List<ApiEipVacaReqVo>
     * @throws KitechException
     */	
	public List<ApiEipAnnPayProVo> selectAnnPayProList(String param) throws KitechException;
	
			/**
     *  사번에해당하는 교육이력 현황내역을 조회한다.
	 * 
     * @param 
     * @return List<ApiEipVacaReqVo>
     * @throws KitechException
     */	
	public List<ApiEipHumEducVo> selectHumEducationLogList(String param) throws KitechException;
	
			/**
     *  사번에해당하는 발령사항 현황내역을 조회한다.
	 * 
     * @param 
     * @return List<ApiEipVacaReqVo>
     * @throws KitechException
     */	
	public List<ApiEipHumAppoVo> selectHumAppointLogList(String param) throws KitechException;
	
			/**
     *  사번에해당하는 인사평가 현황내역을 조회한다.
	 * 
     * @param 
     * @return List<ApiEipVacaReqVo>
     * @throws KitechException
     */	
	public List<ApiEipHumEvalVo> selectHumEvaluationLogList(String param) throws KitechException;
	
	/**
     *  사번에해당하는 상벌사항 현황내역을 조회한다.
	 * 
     * @param 
     * @return List<ApiEipVacaReqVo>
     * @throws KitechException
     */	
	public List<ApiEipHumRewardVo> selectHumRewardLogList(String param) throws KitechException;
	
	/**
     *  사번에해당하는 상벌사항 현황내역을 조회한다.
	 * 
     * @param 
     * @return List<ApiEipResReportVo>
     * @throws KitechException
     */	
	public List<ApiEipResReportVo> selectResReportList(ApiEipResReportVo vo) throws KitechException;
}
