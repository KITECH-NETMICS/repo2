package kr.re.kitech.biz.api.server.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.api.server.vo.biz.ResAppBsnsAdjstVo;
import kr.re.kitech.biz.api.server.vo.biz.ResBgAcctmAprVo;
import kr.re.kitech.biz.api.server.vo.biz.ResSmlRvewDRstVo;
import kr.re.kitech.biz.fin.com.vo.SPComVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.res.out.vo.ResRtPaperVo;
import kr.re.kitech.biz.res.out.vo.ResRtSeminVo;
import kr.re.kitech.biz.res.rte.vo.ResSmlRvewDVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 연구관리 결재 사후작업 DAO
 * @Class Name ResProcessDAO.java
 * @Description 연구관리 결재 사후작업 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/05      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/05
 * @version 1.0
 * @see
 * 
 */
@Repository("resProcessDAO")
public class ResProcessDAO extends BizDefaultAbstractDAO {
	/**
     * 연구관리 결재 후 사후작업 프로시저 콜
     * @param ApiBpmVo
     * @return ApiBpmVo
     * @throws Exception
     */
	public ApiBpmVo selectResElecResultSP(ApiBpmVo vo) throws ElException{		
		return (ApiBpmVo)selectByPk("kr.re.kitech.biz.api.bpm.selectResElecResultSP", vo);		
	}
	
	/**
     * 연구수당 결재여부 초기화
     * @param ApiBpmVo
     * @return int
     * @throws Exception
     */
	public int updateResBgAllow(ApiBpmVo vo) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updateResBgAllow", vo);
	}
	
	/**
     * 논문 상태초기화
     * @param ResRtPaperVo
     * @return int
     * @throws Exception
     */
	public int updateResRtPaperApr(ResRtPaperVo vo) throws ElException{
		return update("kr.re.kitech.biz.res.out.updateResRtPaperApr", vo);
	}
	
	/**
     * 학회발표 상태초기화
     * @param ResRtSeminVo
     * @return int
     * @throws Exception
     */
	public int updateResRtSeminApr(ResRtSeminVo vo) throws ElException{
		return update("kr.re.kitech.biz.res.out.updateResRtSeminApr", vo);
	}
	
	/**
     * 성과지표 상태초기화
     * @param ApiBpmVo
     * @return int
     * @throws Exception
     */
	public int updateResAchIndMst(ApiBpmVo vo) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updateResAchIndMst", vo);
	}
	
	/**
     * 실행예산편성(프로젝트 포함)을 위해 계정번호 조회
     * @param String reqNo
     * @return ResBgExectAprVo
     * @throws Exception
     */
	public ResBgAcctmAprVo selectResBgAcctmApr(String reqNo) throws ElException{
		return (ResBgAcctmAprVo)selectByPk("kr.re.kitech.biz.api.bpm.selectResBgAcctmApr", reqNo);
	}
	
	/**
     * 실행예산편성(R23) 프로시저 호출
     * @param String reqNo
     * @return ResBgExectAprVo
     * @throws Exception
     */
	public SPComVo selectSrpResBBlReflect(ResBgAcctmAprVo vo) throws ElException{
		return (SPComVo)selectByPk("kr.re.kitech.biz.api.bpm.selectSrpResBBlReflect", vo);
	}
	
	/**
     * 프로젝트계정 실행예산편성(R24) 프로시저 호출
     * @param String reqNo
     * @return ResBgExectAprVo
     * @throws Exception
     */
	public SPComVo selectSrpResPrjBBlReflect(ResBgAcctmAprVo vo) throws ElException{
		return (SPComVo)selectByPk("kr.re.kitech.biz.api.bpm.selectSrpResPrjBBlReflect", vo);
	}
	
	/**
     * 이지바로 과제 수정예산등록정보
     * @param ResBgAcctmAprVo
     * @return int
     * @throws Exception
     */
	public int updateEzbaroRebgInfo(ResBgAcctmAprVo vo) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updateEzbaroRebgInfo", vo);
	} 
	
	/**
     * 이비바로 과제 수정예산 요청 상태 등록 (송신대기 : 10 송신완료 : 11)
     * @param ResBgAcctmAprVo
     * @return int
     * @throws Exception
     */
	public int updateEzbaroRebgReq(ResBgAcctmAprVo vo) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updateEzbaroRebgReq", vo);
	} 
	
	/**
     * 결재완료 후 연구관리시작품 소연심의저장을 위한 조회
     * @param String reqNo
     * @return ResSmlRvewDVo
     * @throws Exception
     */
	public ResSmlRvewDVo selectResTrialGoodsMstr(String reqNo) throws ElException{
		return (ResSmlRvewDVo)selectByPk("kr.re.kitech.biz.api.bpm.selectResTrialGoodsMstr", reqNo);
	}
	
	/**
     * 결재완료 후 기술료인센티브 소연심의저장을 위한 조회
     * @param String reqNo
     * @return ResSmlRvewDVo
     * @throws Exception
     */
	public ResSmlRvewDVo selectResCrtPstpictApr(String reqNo) throws ElException{
		return (ResSmlRvewDVo)selectByPk("kr.re.kitech.biz.api.bpm.selectResCrtPstpictApr", reqNo);
	}
	
	/**
     * 결재완료 후 학술대회Pool관리 소연심의저장을 위한 조회
     * @param String reqNo
     * @return ResSmlRvewDVo
     * @throws Exception
     */
	public ResSmlRvewDVo selectResConfPoolApr(String reqNo) throws ElException{
		return (ResSmlRvewDVo)selectByPk("kr.re.kitech.biz.api.bpm.selectResConfPoolApr", reqNo);
	}
	
	/**
     * 연구관리 시작품,기술료인센티브,학술대회 Pool 결재완료시 소연심의 저장
     * @param ResSmlRvewDVo
     * @return int
     * @throws Exception
     */
	public int updateResSmlRvewD(ResSmlRvewDVo vo) throws ElException{
		return update("kr.re.kitech.biz.res.rte.updateResSmlRvewD", vo);
	}
	
	/**
     * 소연심위결과보고, 사업조정회의 결재완료시 총괄위 저장
     * @param ResSmlRvewDVo
     * @return int
     * @throws Exception
     */
	public int updateResSuperRvewD(ResSmlRvewDVo vo) throws ElException{
		return update("kr.re.kitech.biz.res.rte.updateResSuperRvewD", vo);
	}
	
	/**
     * 결재완료 후 사업조정회의 총괄위저장을 위한 조회
     * @param String reqNo
     * @return ResAppBsnsAdjstVo
     * @throws Exception
     */
	public ResAppBsnsAdjstVo selectResAppBsnsAdjstApr(String reqNo) throws ElException{
		return (ResAppBsnsAdjstVo)selectByPk("kr.re.kitech.biz.api.bpm.selectResAppBsnsAdjstApr", reqNo);
	}
	
	/**
     * 주관기관일 경우 사업조정회의 중복체크
     * @param ResAppBsnsAdjstVo
     * @return List<Map<String,String>>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<Map<String,String>> selectResAppBsnsAdjstChk(ResAppBsnsAdjstVo vo) throws ElException{
		return (List<Map<String,String>>)list("kr.re.kitech.biz.api.bpm.selectResAppBsnsAdjstChk", vo);
	}
	
	/**
     * 중복시 사업조정회의 여부 수정
     * @param Map
     * @return int
     * @throws Exception
     */
	public int updateResAppMastApr(Map<String,String> map) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updateResAppMastApr", map);
	}
	
	/**
     * 사업조정회의 결재완료시 중복작성일 경우 사업신청번호 초기화 
     * @param Map
     * @return int
     * @throws Exception
     */
	public int updateResAppBsnsAdjst(Map<String,String> map) throws ElException{
		return update("kr.re.kitech.biz.res.app.updateResAppBsnsAdjst", map);
	}
	
	/**
     * 총괄위 안건삭제시 신청번호 초기화
     * @param ResSmlRvewDVo
     * @return int
     * @throws Exception
     */
	public int updateResSuperRvewdDel(ResSmlRvewDVo vo) throws ElException{
		return update("kr.re.kitech.biz.res.rte.updateResSuperRvewdDel", vo);
	}
	
	/**
     * 소연심의 결과보고 후 총괄위 저장을 위한 조회
     * @param map
     * @return List<ResSmlRvewDRstVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<ResSmlRvewDRstVo> selectResSmlRvewDApr(String reqNo) throws ElException{
		return list("kr.re.kitech.biz.api.bpm.selectResSmlRvewDApr", reqNo);
	}
	
	/**
     * 소연심의 결과보고시 학술대회 원안접수일 경우 학술대회신청->학술대회 마스터 복사입력 
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int insertResConfPoolMastr(String reqNo) throws ElException{
		return insert("kr.re.kitech.biz.api.bpm.insertResConfPoolMastr", reqNo);
	}
	
	/**
     * 소연심의 결과보고 결재완료시 부결건 재입력
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int insertResSmlRvewD(ResSmlRvewDRstVo vo) throws ElException{
		return insert("kr.re.kitech.biz.api.bpm.insertResSmlRvewD", vo);
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
     * 기술료입금(2015.12.08)결재완료 후 기여율 연구책임자 100% 입력
     * @param String ApiBpmVo
     * @return int
     * @throws Exception
     */
	public int insertResCtrContrbtRt(ApiBpmVo vo) throws ElException{
		return insert("kr.re.kitech.biz.api.bpm.insertResCtrContrbtRt", vo);
	}
	
	/**
     * 기술료입금의뢰 또는 결재완료 후 결의번호 및 입금상태 업데이트
     * @param Map
     * @return int
     * @throws Exception
     */
	public int updateResPsRectlDepstState(Map<String,String> map) throws ElException{
		return update("kr.re.kitech.biz.res.tec.updateResPsRectlDepstState", map);
	}
	
	/**
     * 연구비입금의뢰 또는 결재완료 후 결의번호 및 입금상태 업데이트
     * @param Map
     * @return int
     * @throws Exception
     */
	public int updateResBgRectlDepstState(Map<String,String> map) throws ElException{
		return update("kr.re.kitech.biz.res.exc.updateResBgRectlDepstState", map);
	}
	
	/**
     * 결의번호업데이트 (생성 또는 삭제시)
     * @param FinSpaSlipUpdVo
     * @return int
     * @throws Exception
     */
	public int updateResCrtPstpIctH(FinSpaSlipUpdVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.spa.updateResCrtPstpIctH", vo);
	}
	
	/**
     * 결재완료 후 기술이전 기여자 보상금 소연심의 저장을 위한 조회
     * @param String reqNo
     * @return ResSmlRvewDVo
     * @throws Exception
     */
	public ResSmlRvewDVo selectResCrtPstpRwdApr(String reqNo) throws ElException{
		return (ResSmlRvewDVo)selectByPk("kr.re.kitech.biz.api.bpm.selectResCrtPstpRwdApr", reqNo);
	}
	
	/**
     * 결재완료 후 기술이전 기여자 보상금 소연심의 저장을 위한 기술료금액 조회
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public double selectResCrtPstpRwdInctAmt006(String reqNo) throws ElException{
		return (double)selectByPk("kr.re.kitech.biz.api.bpm.selectResCrtPstpRwdInctAmt006", reqNo);
	}
	
	/**
     * 결재완료 후 기술이전 기여자 보상금 기술료 3000만원 미만 소연심의 미진행 업데이트(complt_yn) 
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int updateResCrtPstpRwdCompltYn(String reqNo) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updateResCrtPstpRwdCompltYn", reqNo);
	}


	/**
     * 결재완료 후 조직기여도 접수 정보 업데이트 (aply_yn) 
     * @param ApiBpmVo
     * @return void
     * @throws Exception
     */
	public void updateResOutCtrbtEvalRcptInfo(String rcptno) {
		update("kr.re.kitech.biz.api.bpm.updateResOutCtrbtEvalRcptInfo", rcptno);
	}	
} 
