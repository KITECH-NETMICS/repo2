package kr.re.kitech.biz.pat.com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo;
import kr.re.kitech.biz.pat.app.vo.PatComVo;
import kr.re.kitech.biz.pat.app.vo.PatRelatReschPrjVo;
import kr.re.kitech.biz.pat.app.vo.PatStakeRtHisVo;
import kr.re.kitech.biz.pat.com.vo.EmpTableVo;
import kr.re.kitech.biz.pat.com.vo.PatComWFBizVo;
import kr.re.kitech.biz.pat.com.vo.PatMastrVo;
import kr.re.kitech.biz.pat.com.vo.PatRightMntVo;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo;
import kr.re.kitech.biz.res.rte.vo.ResSmlRvewDVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;


/**
 * @ClassSubJect 지식재산권 공통작업 DAO
 * @Class Name PatComDAO.java
 * @Description 지식재산권 공통작업 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/20      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/20
 * @version 1.0
 * @see
 * 
 */
@Repository("patComDAO")
public class PatComDAO extends BizDefaultAbstractDAO {
	/**
     * 발명신고서 결재완료시 관련과제 입력
     * @param PatComVo
     * @return int
     * @throws Exception
     */
	public int insertPatRelatReschPrj(PatComVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.com.insertPatRelatReschPrj", vo);
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
     * 관리번호 순번 조회
     * @param String mngmtNo
     * @return String
     * @throws Exception
     */
	public String selectMngmtNoSeq(String mngmtNo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.pat.com.selectMngmtNoSeq", mngmtNo);
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
     * 발명신고서 결재완료시 공동발명자 저장
     * @param PatComVo
     * @return int
     * @throws Exception
     */
	public int insertPatCoInvntPsnList(PatComVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.com.insertPatCoInvntPsnList", vo);
	}
	
	/**
     * 발명신고서 결재완료시 공동출원업체 저장
     * @param PatComVo
     * @return int
     * @throws Exception
     */
	public int insertPatCoSmitappVendList(PatComVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.com.insertPatCoSmitappVendList", vo);
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
     * 지재권 마스터 정보 조회(bpm 처리용)
     * @param PatSrcVo
     * @return PatComWFBizVo
     * @throws Exception
     */
	public PatComWFBizVo selectPatComWfInfo(PatToDoVo vo) throws ElException{
		return (PatComWFBizVo)selectByPk("kr.re.kitech.biz.pat.com.selectPatComWfInfo", vo);
	}
	
	/**
     * 기존 todo 제거(PatComService.executePatComWFBiz에서 사용)
     * @param PatSrcVo
     * @return int
     * @throws Exception
     */
	public int updatePatToDoDel(PatToDoVo vo) throws ElException{
		return update("kr.re.kitech.biz.pat.com.updatePatToDoDel", vo);
	}
	
	/**
     * 심사청구 진행중 상태 todo 조회
     * @param PatSrcVo
     * @return List<PatToDoVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatToDoVo> selectPatToDoDel(PatToDoVo vo) throws ElException{
		return list("kr.re.kitech.biz.pat.com.selectPatToDoDel", vo);
	}
	
	/**
     * 심사청구 진행중 상태 todo 삭제 처리
     * @param PatToDoVo
     * @return int
     * @throws Exception
     */
	public int deletePatToDo(PatToDoVo vo) throws ElException{
		return delete("kr.re.kitech.biz.pat.com.deletePatToDo", vo);
	}
	
	/**
     * 특허팀권한 정보 조회 
     * @param String roleCode
     * @return List<EmpTableVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<EmpTableVo> selectRoleUserTableList(String roleCode) throws ElException{
		return list("kr.re.kitech.biz.pat.com.selectRoleUserTableList", roleCode);
	}
	
	/**
     * TO-DO정보 조회 - executePatComWFBiz에서 호출 (As IS :PatComWFBiz.execute)
     * @param String regCd
     * @return List<PatToDoVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatToDoVo> selectPatTotoCd(String regCd) throws ElException{
		return list("kr.re.kitech.biz.pat.com.selectPatTotoCd", regCd);
	}
	
	/**
     * pattodo 저장(PatComService.executePatComWFBiz에서 호출)
     * @param PatToDoVo
     * @return int
     * @throws Exception
     */
	public int insertPatToDo(PatToDoVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.com.insertPatToDo", vo);
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
     * 저장전 patcoinvntpsn 삭제
     * @param PatStakeRtHisVo
     * @return int
     * @throws Exception
     */
	public int deletePatCoInvntPsn(PatStakeRtHisVo vo) throws ElException{
		return delete("kr.re.kitech.biz.apr.bpm.deletePatCoInvntPsn", vo);
	}
	
	/**
     * 공동발명자 저장
     * @param PatCoinvntPsnVo
     * @return int
     * @throws Exception
     */
	public int updatePatCoinvntPsn(PatCoinvntPsnVo vo) throws ElException{
		return update("kr.re.kitech.biz.pat.app.updatePatCoinvntPsn", vo);
	}
	
	/**
     * 저장전 patcosmitappvend 삭제
     * @param PatStakeRtHisVo
     * @return int
     * @throws Exception
     */
	public int deletePatCosmitAppVend(PatStakeRtHisVo vo) throws ElException{
		return delete("kr.re.kitech.biz.apr.bpm.deletePatCosmitAppVend", vo);
	}
	
	/**
     * 공동출원인 저장
     * @param PatStakeRtHisVo
     * @return int
     * @throws Exception
     */
	public int updatePatCoSmitappVend(PatStakeRtHisVo vo) throws ElException{
		return update("kr.re.kitech.biz.apr.bpm.updatePatCoSmitappVend", vo);
	}
	
	/**
     * 저장전 patrelatreschprj 삭제
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int deletePatRelatReschPrj(String reqNo) throws ElException{
		return delete("kr.re.kitech.biz.apr.bpm.deletePatRelatReschPrj", reqNo);
	}
	
	/**
     * 지재권 관련과제 저장
     * @param PatRelatReschPrjVo
     * @return int
     * @throws Exception
     */
	public int insertPatRelatReschPrj(PatRelatReschPrjVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.app.insertPatRelatReschPrj", vo);
	}

     /**
     * 특허마스터 등록확인
     */
	@SuppressWarnings("unchecked")
	public List<PatMastrVo> selectPatMastr(PatMastrVo vo) throws ElException{
		return list("kr.re.kitech.biz.pat.com.selectPatMastr", vo);
	}
     

     /**
     * 특허마스터 수정
     */
	public int updatePatMastr(PatMastrVo vo) throws ElException{
		return update("kr.re.kitech.biz.pat.com.updatePatMastr", vo);
	}

     /**
     * 권리유지 등록확인
     */
	@SuppressWarnings("unchecked")
	public List<PatRightMntVo> selectPatRightMnt(PatRightMntVo vo) throws ElException{
		return list("kr.re.kitech.biz.pat.com.selectPatRightMnt", vo);
	}
     
     /**
     * 권리유지 저장
     */
	public int insertPatRightMnt(PatRightMntVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.com.insertPatRightMnt", vo);
	}

     /**
     * 권리유지 수정
     */
	public int updatePatRightMnt(PatRightMntVo vo) throws ElException{
		return update("kr.re.kitech.biz.pat.com.updatePatRightMnt", vo);
	}

     /**
     * 권리유지 삭제
     */
	public int deletePatRightMnt(PatRightMntVo vo) throws ElException{
		return delete("kr.re.kitech.biz.pat.com.deletePatRightMnt", vo);
	}

     /**
     * 전체사건내역 등록확인
     */
	@SuppressWarnings("unchecked")
	public List<PatTotAcdtHisVo> selectPatTotAcdtHis(PatTotAcdtHisVo vo) throws ElException{
		return list("kr.re.kitech.biz.pat.com.selectPatTotAcdtHis", vo);
	}
     
     /**
     * 전체사건내역 저장
     */
	public int insertPatTotAcdtHis(PatTotAcdtHisVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.com.insertPatTotAcdtHis", vo);
	}

     /**
     * 전체사건내역 수정
     */
	public int updatePatTotAcdtHis(PatTotAcdtHisVo vo) throws ElException{
		return update("kr.re.kitech.biz.pat.com.updatePatTotAcdtHis", vo);
	}

     /**
     * 전체사건내역 삭제
     */
	public int deletePatTotAcdtHis(PatTotAcdtHisVo vo) throws ElException{
		return delete("kr.re.kitech.biz.pat.com.deletePatTotAcdtHis", vo);
	}

}
