package kr.re.kitech.biz.hum.apy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.apy.vo.HumApyAccInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyAccSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**  
 * @ClassSubJect 급여계좌신청 관련 DAO
 * @Class Name : HumApyAccDAO.java
 * @Description : 급여계좌신청 관련 DAO
 * @Modification Information  
 * @
 * @  수정일             수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/21   석원탁             최초생성
 * 
 * @author 
 * @since 2023/09/21
 * @version 1.0
 * @see
 * 
 */
@Repository("humApyAccDAO")
public class HumApyAccDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {

	/**
	 * 급여계좌신청. 목록 조회
	 */
	@SuppressWarnings("unchecked")
	public List<HumApyAccInfoVo> selectHumApyAccList(HumApyAccSrchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyAccList", vo);
	}
	
	/**
	 * 급여계좌신청. 작성중 문서 유효성 체크
	 */
	public HumApyAccInfoVo selectHumApyAccAprChk(HumApyAccSrchVo vo) throws KitechException {
		return (HumApyAccInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyAccAprChk", vo);
	}

	/**
	 * 급여계좌신청. 신청전 기본 계좌 정보 조회(신규)
	 */
	public HumApyAccInfoVo selectHumApyAccBscInfo(HumApyAccSrchVo vo) throws KitechException {
		return (HumApyAccInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyAccBscInfo", vo);
	}

	/**
	 * 급여계좌신청. 신청계좌정보 조회(상세)
	 */
	public HumApyAccInfoVo selectHumApyAccInfo(HumApyAccSrchVo vo) throws KitechException {
		return (HumApyAccInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyAccInfo", vo);
	}

	/**
	 * 급여계좌신청. 신청서 삭제
	 */
	public void deleteHumApyAcc(HumApyAccSrchVo vo) throws KitechException {
		delete("kr.re.kitech.biz.hum.apy.deleteHumApyAcc", vo);
	}
	
	/**
	 * 급여계좌신청. 신청서 저장
	 */
	public void insertHumApyAcc(HumApyAccInfoVo vo) throws KitechException {
		insert("kr.re.kitech.biz.hum.apy.insertHumApyAcc", vo);
	}
	
	/**
	 * 급여계좌신청. 신청서 수정
	 */
	public void updateHumApyLnd(HumApyAccInfoVo vo) throws KitechException {
		update("kr.re.kitech.biz.hum.apy.updateHumApyAcc", vo);
	}
	
	/**
	 * 급여계좌신청. 신청자 계좌정보 수정
	 */
	public void updateHumApyAccUserInfo(HumApyAccInfoVo vo) throws KitechException {
		update("kr.re.kitech.biz.hum.apy.updateHumApyAccUserInfo", vo);
	}

}
