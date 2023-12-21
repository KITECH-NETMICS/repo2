package kr.re.kitech.biz.sup.tlt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstDetlsVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstInfoVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstItemVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstSrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기업부담금입금의뢰 DAO
 * @Class Name SptTltDepstInfoDAO.java
 * @Description 기업부담금입금의뢰 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/22   손태화             최초생성
 * 
 * @author 손태화
 * @since 2023/08/22
 * @version 1
 * @see
 * 
 */
@Repository("sptTltDepstInfoDAO")
public class SptTltDepstInfoDAO extends BizDefaultAbstractDAO {
  
  /**
   * 기업부담금입금의뢰 목록
   * @author 손태화
   * @param SptTltDepstSrcVo
   * @return List<SptTltDepstInfoVo> 기업부담금입금의뢰 목록
   * @throws KitechException 공통예외
   */
	@SuppressWarnings("unchecked")
	public List<SptTltDepstInfoVo> selectSptTltDepstInfoList(SptTltDepstSrcVo vo) throws KitechException {
		return list("kr.re.kitech.biz.sup.tlt.selectSptTltDepstInfoList", vo);
	}
  
  /**
   * 기업부담금 입금예정관리 팝업 - 상세조회
   * @author 손태화
   * @param SptTltDepstSrcVo
   * @return SptTltDepstInfoVo 입금관리정보
   * @throws KitechException 공통예외
   */
	public SptTltDepstInfoVo selectSptTltDepstInfoDetail(SptTltDepstSrcVo vo) throws KitechException {
		return (SptTltDepstInfoVo)selectByPk("kr.re.kitech.biz.sup.tlt.selectSptTltDepstInfoDetail", vo);
	}
  
  /**
   * 기업지원직내역 조회
   * @author 손태화
   * @param SptTltDepstSrcVo
   * @return List<SptTltDepstItemVo>
   * @throws KitechException 공통예외
   */
	@SuppressWarnings("unchecked")
	public List<SptTltDepstItemVo> selectSptTltDepstItemList(SptTltDepstSrcVo vo) throws KitechException {
		return list("kr.re.kitech.biz.sup.tlt.selectSptTltDepstItemList", vo);
	}
	
	/**
	* 기업부담금 입금예정관리 팝업 - 업체조회
	* @param String custNo
	* @return SptTltDepstInfoVo
	* @throws Exception
	*/
	public SptTltDepstInfoVo selectSptCustBaseInfo(String custNo) throws KitechException{
		return (SptTltDepstInfoVo)selectByPk("kr.re.kitech.biz.sup.tlt.selectSptCustBaseInfo", custNo);
	}
	
	/**
	* 기업지원연구직 콤보박스
	* @param String mngmtNo
	* @return List<SptTltDepstItemVo>
	* @throws Exception
	*/
	@SuppressWarnings("unchecked")
	public List<SptTltDepstItemVo> selectSptDisPatchPrCond(String mngmtNo) throws KitechException {
		return list("kr.re.kitech.biz.sup.tlt.selectSptDisPatchPrCond", mngmtNo);
	}
	
	/**
	* 기업지원부담금 입금예정내역 저장
	* @param SptTltDepstInfoVo
	* @return int
	* @throws Exception
	*/
	public int insertSptTltDepstInfo(SptTltDepstInfoVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tlt.insertSptTltDepstInfo", vo);
	}
	
	/**
	* 기업지원부담금 입금예정내역 수정
	* @param SptTltDepstInfoVo
	* @return int
	* @throws Exception
	*/
	public int updateSptTltDepstInfo(SptTltDepstInfoVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tlt.updateSptTltDepstInfo", vo);
	}
	
	/**
	* 기업지원직 내역 저장
	* @param SptTltDepstItemVo
	* @return int
	* @throws Exception
	*/
	public int mergeSptTltDepstItem(SptTltDepstItemVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tlt.mergeSptTltDepstItem", vo);
	}
	
	/**
	* 기업지원직 내역 삭제
	* @param SptTltDepstItemVo
	* @return int
	* @throws Exception
	*/
	public int deleteSptTltDepstItem(SptTltDepstItemVo vo) throws KitechException{
		return delete("kr.re.kitech.biz.sup.tlt.deleteSptTltDepstItem", vo);
	}
	
	/**
	* 기업부담금 입금예정관리 삭제
	* @param String depstMngmtNo
	* @return int
	* @throws Exception
	*/
	public int deleteSptTltDepstInfo(String depstMngmtNo) throws KitechException{
		return delete("kr.re.kitech.biz.sup.tlt.deleteSptTltDepstInfo", depstMngmtNo);
	}
	
	/**
	* 기업부담금 입금의뢰내역 조회
	* @param String depstMngmtNo
	* @return List<FcpDepstReqVo>
	* @throws Exception
	*/	
	@SuppressWarnings("unchecked")
	public List<SptTltDepstDetlsVo> selectSptTltDepstDetls(String depstMngmtNo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tlt.selectSptTltDepstDetls", depstMngmtNo);
	}
	
	/**
	* 기업부담금 입금의뢰내역 저장
	* @param FcpDepstReqVo
	* @return int
	* @throws Exception
	*/
	public int mergeSptTltDepstDetls(FcpDepstReqVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tlt.mergeSptTltDepstDetls", vo);
	}
	
	/**
	* 민간인납부금 저장
	* @param SptTltDepstDetlsVo
	* @return int
	* @throws Exception
	*/
	public int insertSptTltPricBth(SptTltDepstDetlsVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tlt.insertSptTltPricBth", vo);
	}
	
	/**
	* 기업부담금 입금의뢰내역 삭제
	* @param String reqNo
	* @return int
	* @throws Exception
	*/
	public int deleteSptTltDepstDetls(String reqNo) throws KitechException{
		return delete("kr.re.kitech.biz.sup.tlt.deleteSptTltDepstDetls", reqNo);
	}
	
	/**
	* 입금예정관리 실입금액 수정
	* @param SptTltDepstDetlsVo
	* @return int
	* @throws Exception
	*/
	public int updateSptTltDepstInfoAmt(SptTltDepstDetlsVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tlt.updateSptTltDepstInfoAmt", vo);
	}
	
	/**
	* 기업부담금 결의생성을 위한 입금의뢰내역 조회
	* @param String depstMngmtNo
	* @return List<FcpDepstReqVo>
	* @throws Exception
	*/	
	public FcpDepstReqVo selectSptTltDepstDetlsApr(String depstMngmtNo) throws KitechException{
		return (FcpDepstReqVo)selectByPk("kr.re.kitech.biz.sup.tlt.selectSptTltDepstDetlsApr", depstMngmtNo);
	}
	
	/**
	* 기업부담금 입금의뢰 결의번호 업데이트
	* @param FcpDepstReqVo
	* @return int
	* @throws Exception
	*/
	public int updateSptTltDepstDetlsUnslipNo(FcpDepstReqVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tlt.updateSptTltDepstDetlsUnslipNo", vo);
	}
}
