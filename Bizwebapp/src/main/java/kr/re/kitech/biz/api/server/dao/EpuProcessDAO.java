package kr.re.kitech.biz.api.server.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.api.server.vo.biz.ApiEpuVo;
import kr.re.kitech.biz.epu.req.vo.PurAccntChngDVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
/**
 * @ClassSubJect 구매조달 결재 사후작업 DAO
 * @Class Name EpuProcessDAO.java
 * @Description 구매조달 결재 사후작업 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/15      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/15
 * @version 1.0
 * @see
 * 
 */
@Repository("epuProcessDAO")
public class EpuProcessDAO extends BizDefaultAbstractDAO {
	/**
     * 구매담당자 조회
     * @param String reqNo
     * @return String
     * @throws Exception
     */
	public String selectPurChrgSysPayNo(String reqNo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.api.bpm.selectPurChrgSysPayNo", reqNo);
	}
	
	/**
     * 구매진행상태 저장
     * @param ApiEpuVo
     * @return int
     * @throws Exception
     */
	public int mergeXodpPorgrsState(ApiEpuVo vo) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.mergeXodpPorgrsState", vo);
	}
	
	/**
     * 구매담당자 부서정보 조회
     * @param String sysPayNo
     * @return ApiEpuVo
     * @throws Exception
     */
	public ApiEpuVo selectChrgPsnDeptInfo(String sysPayNo) throws ElException{
		return (ApiEpuVo)selectByPk("kr.re.kitech.biz.api.bpm.selectChrgPsnDeptInfo", sysPayNo);
	}
	
	/**
     * 구매마스터 구매담당자 업데이트
     * @param ApiEpuVo
     * @return int
     * @throws Exception
     */	
	public int updatePurReqMastrChrg(ApiEpuVo vo) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updatePurReqMastrChrg", vo);
	}

	/**
     * 계정변경신청 결재완료시 대상 조회
     * @param String reqNo
     * @return List<Map<String,String>>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<PurAccntChngDVo> selectPurAccntChngHApr(String reqNo) {
		return (List<PurAccntChngDVo>)list("kr.re.kitech.biz.api.bpm.selectPurAccntChngHApr", reqNo);
	}
	
	/**
     * 결재반려시 예가 상태값 수정
     * @param ApiBpmVo
     * @return int
     * @throws Exception
     */	
	public int updateEpuNotiEstipr(ApiBpmVo vo) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updateEpuNotiEstipr", vo);
	}
	
	/**
     * 결재반려시 계약 상태값 수정
     * @param Map
     * @return int
     * @throws Exception
     */	
	public int updateEpuContrctMastrApr(Map<String,String> map) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updateEpuContrctMastrApr", map);
	}
	
	/**
     * 적격심사 결과 심사부서결재 결재승인일경우 상태값 수정
     * @param ApiBpmVo
     * @return int
     * @throws Exception
     */	
	public int updateEpuNotiTechEvalMastrApr(ApiBpmVo vo) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updateEpuNotiTechEvalMastrApr", vo);
	}
	
	/**
     * 기술협상평가 응답일자 등록
     * @param ApiBpmVo
     * @return int
     * @throws Exception
     */	
	public int updateEpuNotiTechNego(ApiBpmVo vo) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updateEpuNotiTechNego", vo);
	}
	
	/**
     * 신청번호로 결의번호 조회
     * @param String reqNo
     * @return String
     * @throws Exception
     */
	public String selectUnslipNo(String reqNo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.api.bpm.selectUnslipNo", reqNo);
	}
	
	/**
     * 결재승인(계약해지)일경우 계약 상태값 수정
     * @param ApiBpmVo
     * @return int
     * @throws Exception
     */
	public int updateEpuContrctMastrCnsl(ApiBpmVo vo) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updateEpuContrctMastrCnsl", vo);
	}
	
}
