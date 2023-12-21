package kr.re.kitech.biz.api.server.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.api.server.vo.biz.PatMastrUpdVo;
import kr.re.kitech.biz.api.server.vo.biz.PatSpecVo;
import kr.re.kitech.biz.pat.apl.vo.PatAppVo;
import kr.re.kitech.biz.pat.apl.vo.PatDvsPrrVo;
import kr.re.kitech.biz.pat.apl.vo.PatOaPrdChngReqVo;
import kr.re.kitech.biz.pat.apl.vo.PatPrityDemndVo;
import kr.re.kitech.biz.pat.apl.vo.PatSmitAppVo;
import kr.re.kitech.biz.pat.app.vo.PatCoSmitappVendVo;
import kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo;
import kr.re.kitech.biz.pat.app.vo.PatComVo;
import kr.re.kitech.biz.pat.app.vo.PatGiveUpVo;
import kr.re.kitech.biz.pat.app.vo.PatRelatReschPrjHisVo;
import kr.re.kitech.biz.pat.app.vo.PatSrcVo;
import kr.re.kitech.biz.pat.app.vo.PatStakeRtHisVo;
import kr.re.kitech.biz.pat.com.vo.PatMastrVo;
import kr.re.kitech.biz.pat.com.vo.PatSrhVo;
import kr.re.kitech.biz.res.rte.vo.ResSmlRvewDVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 지식재산권 결재 사후작업 DAO
 * @Class Name PatProcessDAO.java
 * @Description 지식재산권 결재 사후작업 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/11      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/11
 * @version 1.0
 * @see
 * 
 */
@Repository("patProcessDAO")
public class PatProcessDAO extends BizDefaultAbstractDAO {
	
	/**
     * (결재완료 또는 저장 후)발명자, 출원인 변경신청 조회
     * @param PatCoinvntPsnVo
     * @return int
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatStakeRtHisVo> selectPatStakeRtHisList(PatSrcVo vo) throws ElException{
		return list("kr.re.kitech.biz.pat.app.selectPatStakeRtHisList", vo);
	}
		
	/**
     * 발명자 변경신청 결재완료 후 주발명자,공동출원여부 수정
     * @param PatComVo
     * @return int
     * @throws Exception
     */
	public int updatePatMastrApr(PatComVo vo) throws ElException{
		return update("kr.re.kitech.biz.apr.bpm.updatePatMastrApr", vo);
	}	
	
	/**
     * 연구과제 변경신청 조회 
     * @param PatSrcVo
     * @return List<PatRelatReschPrjHisVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatRelatReschPrjHisVo> selectPatRelatReschPrjHisList(PatSrcVo vo) throws ElException{
		return list("kr.re.kitech.biz.pat.app.selectPatRelatReschPrjHisList", vo);
	}		
	
	/**
     * 소연심위 결과보고 원안의결일 경우 patmastr 수정
     * @param PatMastrUpdVo
     * @return int
     * @throws Exception
     */
	public int updatePatMastrApr2(PatMastrUpdVo vo) throws ElException{
		return update("kr.re.kitech.biz.apr.bpm.updatePatMastrApr2", vo);
	}
	
	/**
     * 소연심위 결과보고 원안의결일 경우 patmastr 수정
     * @param PatSpecVo
     * @return int
     * @throws Exception
     */
	public int selectPatSpecCnt(PatSpecVo vo) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.apr.bpm.selectPatSpecCnt", vo);
	}
	
	/**
     * 발명신고서 결재완료시 선행기술조사 저장
     * @param PatSrhVo
     * @return int
     * @throws Exception
     */
	public int insertPatSrh(PatSrhVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.com.insertPatSrh", vo);
	}
	
	/**
     * 특허외지식재산권 아니고 특허설계지원사업이 N일 경우 명세서 저장
     * @param PatSpecVo
     * @return int
     * @throws Exception
     */
	public int insertPatSpec(PatSpecVo vo) throws ElException{
		return insert("kr.re.kitech.biz.apr.bpm.insertPatSpec", vo);
	}
	
	/**
     * 명세서 보완요청 결과 등록 후 출원 데이터 작성
     * @param PatSpecVo
     * @return int
     * @throws Exception
     */
	public int insertPatApp(PatSpecVo vo) throws ElException{
		return insert("kr.re.kitech.biz.apr.bpm.insertPatApp", vo);
	}
	
	/**
     * 발명신고서 결재완료 후 지재권내역 조회
     * @param String reqNo
     * @return (List<PatMastrVo>)
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatMastrVo> selectPatMastrApr(String reqNo) throws ElException{
		return list("kr.re.kitech.biz.apr.bpm.selectPatMastrApr", reqNo);
	}
	
	/**
     * 발명신고서 결재완료시 state, invnt_apprvl_complt_ymd 업데이트
     * @param Map
     * @return int
     * @throws Exception
     */
	public int updatePatAppMastrState(PatComVo vo) throws ElException{
		return update("kr.re.kitech.biz.pat.com.updatePatAppMastrState", vo);
	}
	
	/**
     * 소연심위결과보고, 사업조정회의, 발명신고서 해외출원 결재완료시 총괄위(지심위) 저장
     * @param ResSmlRvewDVo
     * @return int
     * @throws Exception
     */
	public int updateResSuperRvewD(ResSmlRvewDVo vo) throws ElException{
		return update("kr.re.kitech.biz.res.rte.updateResSuperRvewD", vo);
	}
	
	/**
     * 발명신고서 결재반려 후 상태  co_invnt_affir_ex 업데이트 
     * @param PatCoinvntPsnVo
     * @return int
     * @throws Exception
     */
	public int updatePatAppCoInvntPsnApr(PatCoinvntPsnVo vo) throws ElException{
		return update("kr.re.kitech.biz.pat.app.updatePatAppCoInvntPsnApr", vo);
	}
	
	/**
     * 포기신청 결재완료시 조회
     * @param String reqNo
     * @return List<PatGiveUpVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatGiveUpVo> selectPatGiveUpAprList(String reqNo) throws ElException{
		return list("kr.re.kitech.biz.apr.bpm.selectPatGiveUpAprList", reqNo);
	}
	
	/**
	 * 포기신청 결재완료시 todo table 업데이트
	 *
	 * @param reqNo
	 * @return
	 */
	public int updatePatToDoDel(String reqNo) throws ElException{
	    return delete("kr.re.kitech.biz.apr.bpm.updatePatToDoDel", reqNo);
    } 
    
    /**
     * 우선권 주장/분할 결재 완료후 지재권 데이터생성을 위해 조회
     * @param String reqNo
     * @return PatMastrVo
     * @throws Exception
     */
    public PatMastrVo selectPatMastrForDvsReq(String reqNo) throws ElException{
    	return (PatMastrVo)selectByPk("kr.re.kitech.biz.apr.bpm.selectPatMastrForDvsReq", reqNo);
    }
    
    /**
     * 분할우선권 신청서 조회
     * @param String reqNo
     * @return PatDvsPrrVo
     * @throws Exception
     */
    public PatDvsPrrVo selectPatDvsPrrApr(String reqNo) throws ElException{
    	return (PatDvsPrrVo)selectByPk("kr.re.kitech.biz.apr.bpm.selectPatDvsPrrApr", reqNo);
    }
    
    /**
     * 지재권마스터 저장
     * @param PatMastrVo
     * @return int
     * @throws Exception
     */
	public int insertPatMastr(PatMastrVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.com.insertPatMastr", vo);
	}
	
	/**
     * 지재권 공동발명자 조회
     * @param PatComVo
     * @return List<PatCoinvntPsnVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatCoinvntPsnVo> selectPatCoInvntPsnList(PatComVo vo) throws ElException{
		return list("kr.re.kitech.biz.pat.com.selectPatCoInvntPsnList", vo);
	}
	
	/**
     * 지재권 공동발명자 저장
     * @param PatCoinvntPsnVo
     * @return int
     * @throws Exception
     */
	public int insertPatCoInvntPsn(PatCoinvntPsnVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.com.insertPatCoInvntPsn", vo);
	}
	
	/**
     * 지재권 공동출원업체 조회
     * @param PatComVo
     * @return List<PatCoSmitappVendVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatCoSmitappVendVo> selectPatCoSmitappVendList(PatComVo vo) throws ElException{
		return list("kr.re.kitech.biz.pat.com.selectPatCoSmitappVendList", vo);
	}
	
	/**
     * 지재권 공동출원업체 저장
     * @param PatCoSmitappVendVo
     * @return int
     * @throws Exception
     */
	public int insertPatCoSmitappVend(PatCoSmitappVendVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.com.insertPatCoSmitappVend", vo);
	}
	
	/**
     * 출원 저장
     * @param PatAppVo
     * @return int
     * @throws Exception
     */
	public int insertPatApp(PatAppVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.apl.insertPatApp", vo);
	}
	
	/**
     * 선출원목록 조회(복사용)
     * @param String dpReqNo
     * @return List<PatSmitAppVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatSmitAppVo> selectPatDvsPrrApp(String dpReqNo) throws ElException{
		return list("kr.re.kitech.biz.pat.apl.selectPatDvsPrrApp", dpReqNo);
	}
	
	/**
     * 선출원목록 복사 저장
     * @param PatSmitAppVo
     * @return int
     * @throws Exception
     */
	public int insertPatPrioritySmitApp(PatSmitAppVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.apl.insertPatPrioritySmitApp", vo);
	}
	
	/**
     * 우선권주장/분할 마스터 결재완료 업데이트
     * @param ApiBpmVo
     * @return int
     * @throws Exception
     */
	public int updatePatDvsPrrApr(ApiBpmVo vo) throws ElException{
		return update("kr.re.kitech.biz.apr.bpm.updatePatDvsPrrApr", vo);
	}
	
	/**
     * 우선심사 결재 키정보 조회
     * @param String reqNo
     * @return PatComVo
     * @throws Exception
     */
	public PatComVo selectPatPrityEvalReqApr(String reqNo) throws ElException{
		return (PatComVo)selectByPk("kr.re.kitech.biz.apr.bpm.selectPatPrityEvalReqApr", reqNo);
	}
	
	/**
     * 우선심사청구신청 결재완료 후 우선심사청구 저장
     * @param PatPrityDemndVo
     * @return int
     * @throws Exception
     */
	public int insertPatPrityDemnd(PatPrityDemndVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.apl.insertPatPrityDemnd", vo);
	}
	
	/**
     * 지재권마스터 저장을 위한, 자유발명신고서 결재완료후 조회 
     * @param String reqNo
     * @return PatMastrVo
     * @throws Exception
     */
	public PatMastrVo selectPatAppMastr(String reqNo) throws ElException{
		return (PatMastrVo)selectByPk("kr.re.kitech.biz.pat.com.selectPatAppMastr", reqNo);
	}

	/**
     * 기간마감신청 정보조회
     * @param String reqNo
     * @return PatOaPrdChngReqVo
     * @throws Exception
     */
	public PatOaPrdChngReqVo selectPatOaPrdChngReq(String reqNo) throws ElException{
		return (PatOaPrdChngReqVo)selectByPk("kr.re.kitech.biz.apr.bpm.selectPatOaPrdChngReq", reqNo);
	}
	
	/**
     * OA마감일 업데이트
     * @param PatOaPrdChngReqVo
     * @return int
     * @throws Exception
     */
	public int updatePatOaRcptDueDate(PatOaPrdChngReqVo vo) throws ElException{
		return update("kr.re.kitech.biz.apr.bpm.updatePatOaRcptDueDate", vo);
	}
	
	/**
     * OA기간연장 결재완료 후 비용마스터 저장
     * @param PatOaPrdChngReqVo
     * @return int
     * @throws Exception
     */
	public int insertPatCostMaster(PatOaPrdChngReqVo vo) throws ElException{
		return insert("kr.re.kitech.biz.apr.bpm.insertPatCostMaster", vo);
	}
}
