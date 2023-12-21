package kr.re.kitech.biz.hum.apy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.apy.vo.HumApyPrsBeforeVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPrsInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPrsSaveVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPrsSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**  
 * @ClassSubJect 지도교수(활용책임자) 변경신청 관련 DAO
 * @Class Name : HumApyPrsService.java
 * @Description : 지도교수(활용책임자) 변경신청 관련 DAO
 * @Modification Information  
 * @
 * @  수정일             수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/10   석원탁             최초생성
 * 
 * @author 
 * @since 2023/08/10
 * @version 1.0
 * @see
 * 
 */
@Repository("humApyPrsDAO")
public class HumApyPrsDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {

    /**
     * 지도교수(활용책임자) 변경신청. 목록 조회
     */
	@SuppressWarnings("unchecked")
	public List<HumApyPrsInfoVo> selectHumApyPrsList(HumApyPrsSrchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyPrsList", vo);
	}

    /**
     * 지도교수(활용책임자) 변경신청. 지도교수(활용책임자) 수정건 조회
     */
    @SuppressWarnings("unchecked")
	public List<HumApyPrsInfoVo> selectHumApyPrsUptCnt(HumApyPrsInfoVo vo) throws KitechException {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyPrsUptCnt", vo);
	}

    /**
     * 지도교수(활용책임자) 변경신청. 지도교수(활용책임자) 등록여부 조회
     */
	public HumApyPrsInfoVo selectHumApyPrsInsCnt(HumApyPrsInfoVo vo) throws KitechException {
		return (HumApyPrsInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyPrsInsCnt", vo);
	}

    /**
     * 지도교수(활용책임자) 변경신청. 지도교수(활용책임자)신규저장
     */
	public void insertHumApyPrsAppr(HumApyPrsInfoVo vo) throws KitechException {
		insert("kr.re.kitech.biz.hum.apy.insertHumApyPrsAppr", vo);
	}

    /**
     * 지도교수(활용책임자) 변경신청. 지도교수(활용책임자) 수정
     */
	public void updateHumApyPrsAppr(HumApyPrsInfoVo vo) throws KitechException {
		update("kr.re.kitech.biz.hum.apy.updateHumApyPrsAppr", vo);
	}

    /**
     * 지도교수(활용책임자) 변경신청. 인사정보(humbasicinfo) 활용책임자변경
     */
	public void updateHumBasicAppr(HumApyPrsInfoVo vo) {
		update("kr.re.kitech.biz.hum.apy.updateHumBasicAppr", vo);		
	}

    /**
     * 지도교수(활용책임자) 변경신청. 지도교수(활용책임자) 승인처리
     */
	public void updateHumPrsAppr(HumApyPrsInfoVo vo) {
		update("kr.re.kitech.biz.hum.apy.updateHumPrsAppr", vo);
	}

    /**
     * 지도교수(활용책임자) 변경신청. 삭제(신청서)
     */
	public void deleteHumApyBsc(HumApyPrsSrchVo vo) {
		delete("kr.re.kitech.biz.hum.apy.deleteHumApyBsc", vo);
	}

    /**
     * 지도교수(활용책임자) 변경신청. 삭제(지도교수)
     */
	public void deleteHumApyPrs(HumApyPrsSrchVo vo) {
		delete("kr.re.kitech.biz.hum.apy.deleteHumApyPrs", vo);
	}

    /**
     * 지도교수(활용책임자) 변경신청. 지도교수(활용책임자) 변경전 지도교수 조회
     */
	@SuppressWarnings("unchecked")
	public List<HumApyPrsInfoVo> selectHumApyPrsInfo(HumApyPrsSrchVo vo) {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyPrsInfo", vo);
	}

    /**
     * 지도교수(활용책임자) 변경신청. 지도교수(활용책임자) 변경신청서 상세 조회
     */
	public HumApyPrsInfoVo selectHumApyPrsDtl(HumApyPrsSrchVo vo) {
		return (HumApyPrsInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyPrsDtl", vo);
	}

	/**
	 * 지도교수(활용책임자) 변경신청. 변경전 지도교수(활용책임자) 조회
	 */
	@SuppressWarnings("unchecked")
	public List<HumApyPrsInfoVo> selectHumApyPrsBefore(HumApyPrsSrchVo vo) {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyPrsBefore", vo);
	}
	
	/**
	 * 지도교수(활용책임자) 변경신청. 변경후 지도교수(활용책임자) 조회
	 */
	@SuppressWarnings("unchecked")
	public List<HumApyPrsInfoVo> selectHumApyPrsAfter(HumApyPrsSrchVo vo) {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyPrsAfter", vo);
	}
	
	/**
	 * 지도교수(활용책임자) 변경신청. 신청서 신규 저장
	 */
	public void insertHumApyPrs(HumApyPrsSaveVo vo) {
		insert("kr.re.kitech.biz.hum.apy.insertHumApyPrs", vo);		
	}
	
	/**
	 * 지도교수(활용책임자) 변경신청. 신청서 수정
	 */
	public void updateHumApyPrs(HumApyPrsSaveVo vo) {
		update("kr.re.kitech.biz.hum.apy.updateHumApyPrs", vo);
	}
	
	/**
	 * 지도교수(활용책임자) 변경신청. 지도교수(활용책임자) 저장 (신규 저장시 최초 한번만 실행)
	 */
	public void insertHumApyPrsBeforeInfo(HumApyPrsBeforeVo vo) {
		insert("kr.re.kitech.biz.hum.apy.insertHumApyPrsBeforeInfo", vo);	
	}
	
	/**
	 * 지도교수(활용책임자) 변경신청. 지도교수(활용책임자) 저장
	 */
	public void insertHumApyPrsInfo(HumApyPrsInfoVo vo) {
		insert("kr.re.kitech.biz.hum.apy.insertHumApyPrsInfo", vo);	
	}
	
	/**
	 * 지도교수(활용책임자) 변경신청. 지도교수(활용책임자) 수정
	 */
	public void updateHumApyPrsInfo(HumApyPrsInfoVo vo) {
		update("kr.re.kitech.biz.hum.apy.updateHumApyPrsInfo", vo);
	}
	
	/**
	 * 지도교수(활용책임자) 변경신청. 변경후 지도교수(활용책임자) 삭제
	 */
	public void deleteHumApyPrsAfter(HumApyPrsInfoVo vo) {
		delete("kr.re.kitech.biz.hum.apy.deleteHumApyPrsAfter", vo);
	}

}
