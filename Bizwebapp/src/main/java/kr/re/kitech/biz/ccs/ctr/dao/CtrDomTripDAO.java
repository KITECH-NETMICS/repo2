/**
 * 
 */
package kr.re.kitech.biz.ccs.ctr.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.ctr.vo.CheckSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomFeeVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomSchedVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomTripVo;
import kr.re.kitech.biz.ccs.ctr.vo.NoJoinPsnVo;
import kr.re.kitech.biz.ccs.ctr.vo.PeriodDupVo;
import kr.re.kitech.biz.ccs.ctr.vo.SptCtrBizTripVendVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripSrcVo;
import kr.re.kitech.biz.com.vo.XomDtMstVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 국내출장 관련
 * @Class Name CtrDomTripDAO.java
 * @Description 국내출장 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/06/08      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/06/08
 * @version 1.0
 * @see
 * 
 */
@Repository("ctrDomTripDAO")
public class CtrDomTripDAO extends BizDefaultAbstractDAO {
	/**
     * 국내출장 정보 조회
     * @param CtrTripSrcVo
     * @return CtrDomTripVo
     * @throws Exception
     */
	public CtrDomTripVo selectCtrDom(CtrTripSrcVo vo) throws ElException{
		return (CtrDomTripVo)selectByPk("kr.re.kitech.biz.ccs.ctr.selectCtrDom", vo);
	}
	
	/**
     * 현장출장 방문처 조회
     * @param CtrTripSrcVo
     * @return List<SptCtrBizTripVendVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptCtrBizTripVendVo>selectSptCtrBizTripVendList(CtrTripSrcVo vo) throws ElException{
		return list("kr.re.kitech.biz.ccs.ctr.selectSptCtrBizTripVendList", vo);
	}
	
	/**
     * 국내출장 동반자 조회
     * @param CtrTripSrcVo
     * @return List<CtrDomCompnVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrDomCompnVo> selectCtrDomCompnList(String reqNo) throws ElException{
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrDomCompnList", reqNo);
	}
	
	/**
     * 국내출장 출장경로 조회
     * @param CtrTripSrcVo
     * @return List<CtrDomPathVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrDomPathVo> selectCtrDomPathList(CtrTripSrcVo vo) throws ElException{
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrDomPathList", vo);
	}
	
	/**
     * 국내출장 출장경로 운임비 조회
     * @param CtrTripSrcVo
     * @return CtrDomPathVo
     * @throws Exception
     */
	public CtrDomPathVo selectCtrDomPathTripFee(CtrTripSrcVo vo) throws ElException{
		return (CtrDomPathVo)selectByPk("kr.re.kitech.biz.ccs.ctr.selectCtrDomPathTripFee", vo);
	}
	
	/**
     * 국내출장 활동내역 조회
     * @param CtrTripSrcVo
     * @return List<CtrDomSchedVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrDomSchedVo> selectCtrDomSchedList(CtrTripSrcVo vo) throws ElException{
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrDomSchedList", vo);
	}
	
	/**
     * 국내출장 계정내역 조회
     * @param String reqNo
     * @return List<CtrDomAccntVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrDomAccntVo> selectCtrDomAccntList(String reqNo) throws ElException{
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrDomAccntList", reqNo);
	}
	
	/**
     * 국내출장 휴일내역 조회
     * @param CtrTripSrcVo
     * @return List<CtrBizTripRstVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrBizTripRstVo> selectCtrBizTripRstList(CtrTripSrcVo vo) throws ElException{
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrBizTripRstList", vo);
	}	
	
	/**
     * 대체휴일 가능일 조회
     * @param CtrTripSrcVo
     * @return List<XomDtMstVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<XomDtMstVo> selectXomDtMst(CtrTripSrcVo vo) throws ElException{
		return list("kr.re.kitech.biz.ccs.ctr.selectXomDtMst", vo);
	}
	
	/**
     * 기타경비 조회
     * @param CtrTripSrcVo
     * @return CtrDomFeeVo
     * @throws Exception
     */
	public CtrDomFeeVo selectCtrBizTripFee(CtrTripSrcVo vo) throws ElException{
		return (CtrDomFeeVo)selectByPk("kr.re.kitech.biz.ccs.ctr.selectCtrBizTripFee", vo);
	}
	
	/**
     * 국내출장 저장
     * @param CtrDomTripVo
     * @return int
     * @throws Exception
     */
	public int insertCtrDom(CtrDomTripVo vo) throws ElException{
		return insert("kr.re.kitech.biz.ccs.ctr.insertCtrDom", vo);
	}
	
	/**
     * 국내출장 수정
     * @param CtrDomTripVo
     * @return int
     * @throws Exception
     */
	public int updateCtrDom(CtrDomTripVo vo) throws ElException{
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrDom", vo);
	}
	
	/**
     * 국내출장 삭제
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int deleteCtrDom(String reqNo) throws ElException{
		return delete("kr.re.kitech.biz.ccs.ctr.deleteCtrDom", reqNo);
	}
	
	/**
     * 국내출장 동반자 삭제
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int deleteCtrDomCompn(String reqNo) throws ElException{
		return delete("kr.re.kitech.biz.ccs.ctr.deleteCtrDomCompn", reqNo);
	}
	
	/**
     * 국내출장 동반자 저장
     * @param CtrDomCompnVo
     * @return int
     * @throws Exception
     */
	public int insertCtrDomCompn(CtrDomCompnVo vo) throws ElException{
		return insert("kr.re.kitech.biz.ccs.ctr.insertCtrDomCompn", vo);
	}
	
	/**
     * 국내출장 활동내역 삭제
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int deleteCtrDomSched(String reqNo) throws ElException{
		return delete("kr.re.kitech.biz.ccs.ctr.deleteCtrDomSched", reqNo);
	}
	
	/**
     * 국내출장 활동내역 저장
     * @param CtrDomSchedVo
     * @return int
     * @throws Exception
     */
	public int insertCtrDomSched(CtrDomSchedVo vo) throws ElException{
		return insert("kr.re.kitech.biz.ccs.ctr.insertCtrDomSched", vo);
	}
	
	/**
     * 국내출장 출장경로 삭제
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int deleteCtrDomPath(String reqNo) throws ElException{
		return delete("kr.re.kitech.biz.ccs.ctr.deleteCtrDomPath", reqNo);
	}
	
	/**
     * 국내출장 출장경로 저장
     * @param CtrDomPathVo
     * @return int
     * @throws Exception
     */
	public int insertCtrDomPath(CtrDomPathVo vo) throws ElException{
		return insert("kr.re.kitech.biz.ccs.ctr.insertCtrDomPath", vo);
	}
	
	/**
     * 국내출장 계정내역 삭제
     * @param Map
     * @return int
     * @throws Exception
     */
	public int deleteCtrDomAccnt(Map<String,String> map) throws ElException{
		return delete("kr.re.kitech.biz.ccs.ctr.deleteCtrDomAccnt", map);
	}
	
	/**
     * 국내출장 계정내역 저장
     * @param CtrDomAccntVo
     * @return int
     * @throws Exception
     */
	public int insertCtrDomAccnt(CtrDomAccntVo vo) throws ElException{
		return insert("kr.re.kitech.biz.ccs.ctr.insertCtrDomAccnt", vo);
	}
	
	/**
     * 국내출장 계정내역 수정
     * @param BblenfrcVo
     * @return int
     * @throws Exception
     */
	public int updateCtrDomAccnt(CtrDomAccntVo vo) throws ElException{
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrDomAccnt", vo);
	}
	
	/**
     * 국내출장 계정내역 통제번호 업데이트
     * @param BblenfrcVo
     * @return int
     * @throws Exception
     */
	public int updateCtrDomAccntCtrlNo(BblenfrcVo vo) throws ElException{
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrDomAccntCtrlNo", vo);
	}
	
	/**
     * 기업현장출장일 경우 방문처 삭제
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int deleteSptCtrBiztripVend(String reqNo) throws ElException{
		return delete("kr.re.kitech.biz.ccs.ctr.deleteSptCtrBiztripVend", reqNo);
	}
	
	/**
     * 기업현장출장일 경우 방문처 저장
     * @param SptCtrBizTripVendVo
     * @return int
     * @throws Exception
     */
	public int insertSptCtrBiztripVend(SptCtrBizTripVendVo vo) throws ElException{
		return insert("kr.re.kitech.biz.ccs.ctr.insertSptCtrBiztripVend", vo);
	}
	
	/**
     * 기존 출장 휴일 관리 항목 삭제
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int deleteCtrBiztripRst(String reqNo) throws ElException{
		return delete("kr.re.kitech.biz.ccs.ctr.deleteCtrBiztripRst", reqNo);
	}
	
	/**
     * 출장 휴일/휴무일 관리 저장
     * @param CtrBizTripRstVo
     * @return int
     * @throws Exception
     */
	public int insertCtrBiztripRst(CtrBizTripRstVo vo) throws ElException{
		return insert("kr.re.kitech.biz.ccs.ctr.insertCtrBiztripRst", vo);
	}
	
	/**
     * 국내출장 정산서 작성건수
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int selectCtrDomAdCnt(String reqNo) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.ccs.ctr.selectCtrDomAdCnt", reqNo);
	}
	
	/**
     * 학술정보 삭제(출장신청)
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int deleteResConfPoolReq(String reqNo) throws ElException{
		return delete("kr.re.kitech.biz.ccs.ctr.deleteResConfPoolReq", reqNo);
	}
	
	/**
     * 출장기간 중복검증
     * @param CheckSrcVo
     * @return List<PeriodDupVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PeriodDupVo> selectPeriodDup(CheckSrcVo vo) throws ElException{
		return list("kr.re.kitech.biz.ccs.ctr.selectPeriodDup", vo);
	}
	
	/**
     * 복명서 작성여부조회
     * @param CheckSrcVo
     * @return List<PeriodDupVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PeriodDupVo> selectValidRep(CheckSrcVo vo) throws ElException{
		return list("kr.re.kitech.biz.ccs.ctr.selectValidRep", vo);
	}
	
	/**
     * 타업종사 등록여부확인
     * @param CheckSrcVo
     * @return List<PeriodDupVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PeriodDupVo> selectOtherWork(CheckSrcVo vo) throws ElException{
		return list("kr.re.kitech.biz.ccs.ctr.selectOtherWork", vo);
	}
	
	/**
     * 과제 미참여 연구원 조회
     * @param CheckSrcVo
     * @return List<NoJoinPsnVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<NoJoinPsnVo> selectAccntMember(CheckSrcVo vo) throws ElException{
		return list("kr.re.kitech.biz.ccs.ctr.selectAccntMember", vo);
	}
	
	/**
     * (구)국내출장 지급내역 조회
     * @param CtrTripSrcVo
     * @return List<CtrDomPayVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrDomPayVo> selectCtrDomPayList(CtrTripSrcVo vo) throws ElException{
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrDomPayList", vo);
	}	
    
    /**
     * 출장자 중에 이공계인턴쉽이 있는경우 (posi_cd = 353010) 월중 출장비 지급내역
     * @param CtrTripSrcVo
     * @return List<CtrDomPayVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrDomPayVo> selectCtrDomPayPosi(CtrTripSrcVo vo) throws ElException{
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrDomPayPosi", vo);
	}
	
	/**
     * 표준근무제 휴일 시간외근무신청 유무 체크
     * @param CheckSrcVo
     * @return String
     * @throws Exception
     */
	public String selectStdWrkTimeChk(CheckSrcVo vo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.ccs.ctr.selectStdWrkTimeChk", vo);
	}	
	
	/**
     * 학술대회정보 입력
     * @param String reqNo
     * @return String
     * @throws Exception
     */
	public String selectPoolConfNm(String reqNo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.ccs.ctr.selectPoolConfNm", reqNo);
	}	
	
	/**
     * 항공마일리지 변경여부 조회
     * @param String reqNo
     * @return String
     * @throws Exception
     */
	public int selectCtrAirMileUseCnt(String reqNo) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.ccs.ctr.selectCtrAirMileUseCnt", reqNo);
	}	
	
	/**
     * 결재 후 담당자 저장
     * @param CtrDomTripVo
     * @return int
     * @throws Exception
     */
	public int updateCtrDomPostApr(CtrDomTripVo vo) throws ElException{
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrDomPostApr", vo);
	}
}
