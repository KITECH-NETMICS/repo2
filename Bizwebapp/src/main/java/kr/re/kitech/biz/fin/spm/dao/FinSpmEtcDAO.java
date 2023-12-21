package kr.re.kitech.biz.fin.spm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.com.vo.FinCodeNmVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetAttendVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetDetlsVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetEvidVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetSearchVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetVo;
import kr.re.kitech.biz.fin.spm.vo.FspMeetWorkTimeVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 재무관리 결의 제외
 * @Class Name : FinExpnsSlipDAO.java
 * @Description : 재무관리 결의 제외 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
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
@Repository("finSpmEtcDAO")
public class FinSpmEtcDAO extends BizDefaultAbstractDAO  {
	/**
     * 회의록 관리 목록 조회
     * @param FspMeetSearchVo
     * @return List<FspMeetVo>
     * @throws Exception
     */
     @SuppressWarnings("unchecked")
	public List<FspMeetVo> selectMeetList(FspMeetSearchVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spm.selectMeetList", vo);
	}
	
	/**
     * 회의록 부서조회 코드 조회(selectbox Code)
     * @param FinCodeNmVo
     * @return List<FinCodeNmVo>
     * @throws Exception
     */
     @SuppressWarnings("unchecked")
	public List<FinCodeNmVo> selectDeptCodeList(FinCodeNmVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spm.selectDeptCodeList", vo);
	}
	
	/**
     * 회의록 증빙 내용 조회
     * @param FspMeetSearchVo
     * @return List<FspMeetEvidVo>
     * @throws Exception
     */
     @SuppressWarnings("unchecked")
	public List<FspMeetEvidVo> selectMeetEvidList(FspMeetSearchVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spm.selectMeetEvidList", vo);
	}
	
	/**
     * 회의록 상세 내용 조회
     * @param FspMeetSearchVo
     * @return FspMeetDetlsVo
     * @throws Exception
     */
	public FspMeetDetlsVo selectMeetDetls(FspMeetSearchVo vo) throws KitechException{
		return (FspMeetDetlsVo)selectByPk("kr.re.kitech.biz.fin.spm.selectMeetDetls", vo);
	}
	
	/**
     * 회의록 참석자 조회
     * @param FspMeetSearchVo
     * @return List<FspMeetAttendVo>
     * @throws Exception
     */
     @SuppressWarnings("unchecked")
	public List<FspMeetAttendVo> selectMeetAttendList(FspMeetSearchVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spm.selectMeetAttendList", vo);
	}
	
	/**
	 * 회의록 작성시 참석자 재택근무정보 조회
	 * @param FspMeetSearchVo
	 * @return List<FspMeetWorkTimeVo>
	 * @throws Exception
	 */
	 @SuppressWarnings("unchecked")
	public List<FspMeetWorkTimeVo> selectHomeWorkInfo(FspMeetSearchVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spm.selectHomeWorkInfo", vo);
	}
	
	/**
	 * 회의참석자 근태정보 조회
	 * @param FspMeetSearchVo
	 * @return List<FspMeetWorkTimeVo>
	 * @throws Exception
	 */
	 @SuppressWarnings("unchecked")
	public List<FspMeetWorkTimeVo> selectCwsWorkTime(FspMeetSearchVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spm.selectCwsWorkTime", vo);
	}
	
	/**
	 * 외부인 회의 참석 조회
	 * @param FspMeetSearchVo
	 * @return List<FspMeetAttendVo>
	 * @throws Exception
	 */
	 @SuppressWarnings("unchecked")
	public List<FspMeetAttendVo> selectOutMeetPrsn(FspMeetSearchVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spm.selectOutMeetPrsn", vo);
	}
	
	/**
	 * 회의록 내역 저장
	 * @param FspMeetDetlsVo
	 * @throws Exception
	 */
	public int insertFspmeetmnth(FspMeetDetlsVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.fin.spm.insertFspmeetmnth", vo);
	}
	
	/**
	 * 회의 증빙 내역 저장
	 * @param FspMeetDetlsVo
	 * @throws Exception
	 */
	public int insertFspmeetevidh(FspMeetEvidVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.fin.spm.insertFspmeetevidh", vo);
	}

	/**
	 * 회의 참석자 저장
	 * @param FspMeetDetlsVo
	 * @throws Exception
	 */
	public int insertFspmeetmntd(FspMeetAttendVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.fin.spm.insertFspmeetmntd", vo);
	}
	
	/**
	 * 회의정보 수정
	 * @param FspMeetDetlsVo
	 * @throws Exception
	 */
	public int updateFspmeetmnth(FspMeetDetlsVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.spm.updateFspmeetmnth", vo);
	}
	
	/**
	 * 회의 증빙정보 삭제
	 * @param String
	 * @throws Exception
	 */
	public int deleteFspmeetevidh(String meetReqNo) throws KitechException{
		return delete("kr.re.kitech.biz.fin.spm.deleteFspmeetevidh", meetReqNo);
	}
	
	/**
	 * 회의참석자 삭제
	 * @param String
	 * @throws Exception
	 */
	public int deleteFspmeetmntd(String meetReqNo) throws KitechException{
		return delete("kr.re.kitech.biz.fin.spm.deleteFspmeetmntd", meetReqNo);
	}
	
	/**
	 * 회의정보 삭제
	 * @param String
	 * @throws Exception
	 */
	public int deleteFspmeetmnth(String meetReqNo) throws KitechException{
		return delete("kr.re.kitech.biz.fin.spm.deleteFspmeetmnth", meetReqNo);
	}
	
	/**
	 * 근태미대상자 근태정보조회
	 * @param FspMeetSearchVo
	 * @return List<FspMeetWorkTimeVo>
	 * @throws Exception
	 */
	 @SuppressWarnings("unchecked")
	public List<FspMeetWorkTimeVo> selectCwsHumInfoLog(FspMeetSearchVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spm.selectCwsHumInfoLog", vo);
	}
	
	/**
	 * 회의참석자 과제참여 여부 조회
	 * @param FspMeetSearchVo
	 * @return int
	 * @throws Exception
	 */
	public int selectMeetPrjAttendYn(FspMeetSearchVo vo) throws KitechException{
		return (int)selectByPk("kr.re.kitech.biz.fin.spm.selectMeetPrjAttendYn", vo);
	}
	
	/**
	 * 회의록 계정의 국내출장계정과의 일치여부
	 * @param FspMeetSearchVo
	 * @return List<FspMeetVo>
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<FspMeetVo> selectCtrToMeetAccnt(FspMeetSearchVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spm.selectCtrToMeetAccnt", vo);
	}	
	
	/**
	 * 회의록 결의생성 후 결의번호 업데이트
	 * @param FspMeetEvidVo
	 * @return int
	 * @throws Exception
	 */
	public int updateFspMeetEvidUnslipNo(FspMeetEvidVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.spm.updateFspMeetEvidUnslipNo", vo);
	}
	
	/**
     * 결의번호 업데이트를 위한 임시조회
     * @param FspMeetSearchVo
     * @return List<FspMeetVo>
     * @throws Exception
     */
     @SuppressWarnings("unchecked")
	public List<FspMeetVo> selectMeetUnslipNo(FspMeetSearchVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spm.selectMeetUnslipNo", vo);
	}
	
	/**
	 * 결의번호 업데이트(임시)
	 * @param FspMeetVo
	 * @return int
	 * @throws Exception
	 */
	public int updateFspMeetUnslipNo(FspMeetVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.spm.updateFspMeetUnslipNo", vo);
	}
	
	/**
	 * 반려버튼 클릭시 상태값 초기화 
	 * @param FspMeetSearchVo
	 * @return int
	 * @throws Exception
	 */
	public int updateFspMeetMntHProgrs(FspMeetSearchVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.spm.updateFspMeetMntHProgrs", vo);
	}
	
	/**
	 * 전자증빙을 위한 국내출장정보 조회(증빙 중복제거 위해)
	 * @param String meetReqNo
	 * @return List<FspMeetAttendVo>
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<FspMeetAttendVo> selectMeetAttendEvid(String meetReqNo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spm.selectMeetAttendEvid", meetReqNo);
	}
}
