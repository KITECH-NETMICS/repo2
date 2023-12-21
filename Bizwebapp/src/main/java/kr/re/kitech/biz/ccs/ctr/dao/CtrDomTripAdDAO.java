package kr.re.kitech.biz.ccs.ctr.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ccs.ctr.vo.CtrAirMileUseAprVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomAdFormVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomExpnsVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomRepVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripAdSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripGpsVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.com.vo.ComReqVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 국내출장정산 관련
 * @Class Name CtrDomTripAdDAO.java
 * @Description 국내출장정산 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/11/07      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/11/07
 * @version 1.0
 * @see
 * 
 */
@Repository("ctroDomTripAdDAO")
public class CtrDomTripAdDAO extends BizDefaultAbstractDAO {
	/**
     * 국내출장정산 폼 조회
     * @param CtrTripAdSrcVo
     * @return CtrDomAdFormVo
     * @throws Exception
     */
	public CtrDomAdFormVo selectCtrDomAd(CtrTripAdSrcVo vo) throws KitechException{	
		return (CtrDomAdFormVo)selectByPk("kr.re.kitech.biz.ccs.ctr.selectCtrDomAd", vo);
	}
	
	/**
     * 국내출장정산 동반자 조회
     * @param String reqNo
     * @return List<CtrDomCompnVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrDomCompnVo> selectCtrDomRepCompnList(String reqNo) throws KitechException{
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrDomRepCompnList", reqNo);
	}
	
	/**
     * 국내출장정산 경로 조회
     * @param String reqNo
     * @return List<CtrDomPathVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrDomPathVo> selectCtrDomPathAd(String reqNo) throws KitechException{
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrDomPathAd", reqNo);
	}
	
	/**
     * 국내출장정산 경비 조회
     * @param String reqNo
     * @return List<CtrDomExpnsVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrDomExpnsVo> selectCtrDomExpnsList(String reqNo) throws KitechException{
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrDomExpnsList", reqNo);
	}
	
	/**
     * 국내출장정산 지급내역 조회
     * @param String reqNo
     * @return List<CtrDomPayVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrDomPayVo> selectCtrDomAdPayList(String reqNo) throws KitechException{
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrDomAdPayList", reqNo);
	}
	
	/**
     * 국내출장정산 계정내역 조회
     * @param String reqNo
     * @return List<CtrDomAccntVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrDomAccntVo> selectCtrDomAdAccntList(String reqNo) throws KitechException{
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrDomAdAccntList", reqNo);
	}
	
	/**
     * 마일리지 신청번호 조회
     * @param String reqNo
     * @return String
     * @throws Exception
     */
	public String selectCtrAirMileUseReqNo(String reqNo) throws KitechException{
		return (String)selectByPk("kr.re.kitech.biz.ccs.ctr.selectCtrAirMileUseReqNo", reqNo);
	}
	
	/**
     * 국내출장 정보 조회
     * @param String reqNo
     * @return CtrDomAdFormVo
     * @throws Exception
     */
	public CtrDomAdFormVo selectCtrDomForAd(String reqNo) throws KitechException{
		return (CtrDomAdFormVo)selectByPk("kr.re.kitech.biz.ccs.ctr.selectCtrDomForAd", reqNo);
	}
	
	/**
     * 국내출장 정산을 위한 지급내역 조회
     * @param String reqNo
     * @return List<CtrDomPayVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrDomPayVo> selectDomTripPayList(String reqNo) throws KitechException{
		return list("kr.re.kitech.biz.ccs.ctr.selectDomTripPayList", reqNo);
	}
	
	/**
     * 국내출장 정산 위치 인증내역 조회
     * @param CtrTripAdSrcVo
     * @return List<CtrTripGpsVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrTripGpsVo> selectGpsInfoData(CtrTripAdSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.ccs.ctr.selectGpsInfoData", vo);
	}
	
	/**
     * 중복정산서 여부 조회
     * @param String reqNo
     * @return Map
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public Map<String,String> selectCtrDomAdExistsYn(String reqNo) throws KitechException{
		return (Map<String,String>)selectByPk("kr.re.kitech.biz.ccs.ctr.selectCtrDomAdExistsYn", reqNo);
	}
	
	/**
     * 국내출장 복명서 저장
     * @param CtrDomRepVo
     * @return int
     * @throws Exception
     */
	public int insertCtrDomRep(CtrDomRepVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.ccs.ctr.insertCtrDomRep", vo);
	}
	
	/**
     * 국내출장 정산서 저장
     * @param CtrDomAdFormVo
     * @return int
     * @throws Exception
     */
	public int insertCtrDomAd(CtrDomAdFormVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.ccs.ctr.insertCtrDomAd", vo);
	}
	
	/**
     * 국내출장 복명서 수정
     * @param CtrDomRepVo
     * @return int
     * @throws Exception
     */
	public int updateCtrDomRep(CtrDomRepVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrDomRep", vo);
	}
	
	/**
     * 국내출장 정산서 수정
     * @param CtrDomAdFormVo
     * @return int
     * @throws Exception
     */
	public int updateCtrDomAd(CtrDomAdFormVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrDomAd", vo);
	}
	
	/**
     * 국내출장 복명서 동반자 저장
     * @param CtrDomCompnVo
     * @return int
     * @throws Exception
     */
	public int insertCtrDomRepCompn(CtrDomCompnVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.ccs.ctr.insertCtrDomRepCompn", vo);
	}
	
	/**
     * 국내출장 복명서 동반자 수정
     * @param CtrDomCompnVo
     * @return int
     * @throws Exception
     */
	public int updateCtrDomRepCompn(CtrDomCompnVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrDomRepCompn", vo);
	}
	
	/**
     * 복명서 출장경로 저장
     * @param CtrDomPathVo
     * @return int
     * @throws Exception
     */
	public int mergeCtrDomPath(CtrDomPathVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.ctr.mergeCtrDomPath", vo);
	}
	
	/**
     * 출장경비 저장
     * @param CtrDomExpnsVo
     * @return int
     * @throws Exception
     */
	public int mergeCtrDomExpns(CtrDomExpnsVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.ctr.mergeCtrDomExpns", vo);
	}
	
	/**
     * 국내출장정산 지급내역 삭제
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int deleteCtrDomAdPay(String reqNo) throws KitechException{
		return delete("kr.re.kitech.biz.ccs.ctr.deleteCtrDomAdPay", reqNo);
	}
	
	/**
     * 국내출장정산 지급내역 저장
     * @param CtrDomPayVo
     * @return int
     * @throws Exception
     */
	public int insertCtrDomAdPay(CtrDomPayVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.ccs.ctr.insertCtrDomAdPay", vo);
	}
	
	/**
     * 국내출장정산 계정내역 저장 
     * @param CtrDomAccntVo
     * @return int
     * @throws Exception
     */
	public int insertCtrDomAdAccnt(CtrDomAccntVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.ccs.ctr.insertCtrDomAdAccnt", vo);
	}
	
	/**
     * 국내출장정산 계정내역 수정
     * @param CtrDomAccntVo
     * @return int
     * @throws Exception
     */
	public int updateCtrDomAdAccnt(CtrDomAccntVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrDomAdAccnt", vo);
	}
	
	/**
     * 국내출장정산 지급내역 삭제
     * @param CtrDomAccntVo
     * @return int
     * @throws Exception
     */
	public int deleteCtrDomAdAccnt(CtrDomAccntVo vo) throws KitechException{
		return delete("kr.re.kitech.biz.ccs.ctr.deleteCtrDomAdAccnt", vo);
	}
	
	/**
     * 마일리지에 정산번호, 출장번호 업데이트
     * @param CtrDomAdFormVo
     * @return int
     * @throws Exception
     */
	public int updateCtrAirMileUseTripNo(CtrDomAdFormVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrAirMileUseTripNo", vo);
	}
	
	/**
     * 국내출장 정산결의 중복신청 건수 조회
     * @param CtrTripAdSrcVo
     * @return List<ComReqVo>
     */
	@SuppressWarnings("unchecked")
	public List<ComReqVo> selectTripAdSlipDupCnt(CtrTripAdSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.ccs.ctr.selectTripAdSlipDupCnt", vo);
	}
	
	/**
     * 국내출장 정산 통제번호 업데이트
     * @param BblenfrcVo
     * @return int
     * @throws Exception
     */
	public int updateCtrDomAdAccntCtrlNo(BblenfrcVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrDomAdAccntCtrlNo", vo);
	}
	
	/**
     * 국내출장 정산 대변생성을 위한 조회(미지급당좌)
     * @param reqNo
     * @return FspSlipDVo
     * @throws Exception
     */
	public FspSlipDVo selectCtrDomAdPaySum(String reqNo) throws KitechException{
		return (FspSlipDVo)selectByPk("kr.re.kitech.biz.ccs.ctr.selectCtrDomAdPaySum", reqNo);
	}
	
	/**
     * 국내출장 정산 대변생성을 위한 조회(원차량 계정)
     * @param reqNo
     * @return FspSlipDVo
     * @throws Exception
     */
	public FspSlipDVo selectCtrDomExpnsSum(String reqNo) throws KitechException{
		return (FspSlipDVo)selectByPk("kr.re.kitech.biz.ccs.ctr.selectCtrDomExpnsSum", reqNo);
	}
	
	/**
     * 국내출장 정산 결의번호 업데이트
     * @param CtrDomAdFormVo
     * @return int
     * @throws Exception
     */
	public int updateCtrDomAdUnslipNo(CtrDomAdFormVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrDomAdUnslipNo", vo);
	}
	
	/**
     * 국내출장 정산 정산 삭제
     * @param String
     * @return int
     * @throws Exception
     */
	public int deleteCtrDomTripAd(String reqNo) throws KitechException{
		return delete("kr.re.kitech.biz.ccs.ctr.deleteCtrDomTripAd", reqNo);
	}
	
	/**
     * 항공마일리지 신청(신고)내역
     * @param String
     * @return List<CtrAirMileUseAprVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrAirMileUseAprVo> selectCtrAirMileUseList(String reqNo) throws KitechException{
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrAirMileUseAprList", reqNo);
	}
	
	/**
     * 정산계정내역의 신청계정내역과의 일치여부 조회
     * @param String
     * @return int
     * @throws Exception
     */
	public int selectNotDupAccntCnt(String reqNo) throws KitechException{
		return (int)selectByPk("kr.re.kitech.biz.ccs.ctr.selectNotDupAccntCnt", reqNo);
	}
	
	/**
     * 국내출장 복명서 수정(출장담당자)
     * @param CtrDomRepVo
     * @return int
     * @throws Exception
     */
	public int updateCtrDomRepMng(CtrDomRepVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrDomRepMng", vo);
	}
	
	/**
     * 국내출장 정산서 수정(출장담당자)
     * @param CtrDomAdFormVo
     * @return int
     * @throws Exception
     */
	public int updateCtrDomAdMng(CtrDomAdFormVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrDomAdMng", vo);
	}
}
