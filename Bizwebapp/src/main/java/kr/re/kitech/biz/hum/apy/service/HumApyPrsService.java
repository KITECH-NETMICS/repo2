package kr.re.kitech.biz.hum.apy.service;

import java.util.List;

import kr.re.kitech.biz.hum.apy.vo.HumApyPrsInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPrsListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPrsSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 지도교수(활용책임자) 변경신청 관련 인터페이스
 * @Class Name : HumApyPrsService.java
 * @Description : 지도교수(활용책임자) 변경신청 관련 인터페이스
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
public interface HumApyPrsService {
	
	 /**
	 * 지도교수(활용책임자) 변경신청. 목록 조회
	 */
	public List<HumApyPrsInfoVo> selectHumApyPrsList(HumApyPrsSrchVo humApySvrVo) throws KitechException;

	 /**
	 * 지도교수(활용책임자) 변경신청. 목록 내 승인
	 */
	public void approvalHumApyPrs(HumApyPrsInfoVo humApySvrVo) throws KitechException;

	 /**
	 * 지도교수(활용책임자) 변경신청. 신청서 삭제
	 */
	public void deleteHumApyPrs(HumApyPrsSrchVo humApySvrVo) throws KitechException;

	 /**
	 * 지도교수(활용책임자) 변경신청. 지도교수(활용책임자) 변경전 지도교수 조회
	 */
	public List<HumApyPrsInfoVo> selectHumApyPrsInfo(HumApyPrsSrchVo humApySvrVo) throws KitechException;

	/**
	 * 지도교수(활용책임자) 변경신청. 지도교수(활용책임자) 변경신청서 상세 조회
	 */
	public HumApyPrsInfoVo selectHumApyPrsDtl(HumApyPrsSrchVo humApySvrVo) throws KitechException;

	/**
	 * 지도교수(활용책임자) 변경신청. 변경전 지도교수(활용책임자) 조회
	 */
	public List<HumApyPrsInfoVo> selectHumApyPrsBefore(HumApyPrsSrchVo humApySvrVo) throws KitechException;

	/**
	 * 지도교수(활용책임자) 변경신청. 변경후 지도교수(활용책임자) 조회
	 */
	public List<HumApyPrsInfoVo> selectHumApyPrsAfter(HumApyPrsSrchVo humApySvrVo) throws KitechException;

	/**
	 * 지도교수(활용책임자) 변경신청. 저장, 결재신청
	 */
	public String saveHumApyPrs(HumApyPrsListVo vo) throws KitechException;

	/**
	 * 지도교수(활용책임자) 변경신청. 변경후 지도교수(활용책임자) 삭제
	 */
	public void deleteHumApyPrsAfter(HumApyPrsListVo vo) throws KitechException;

	/**
	 * 지도교수(활용책임자) 변경신청. 반려
	 */
	public void formReject(HumApyPrsInfoVo vo) throws KitechException;

	/**
	 * 지도교수(활용책임자) 변경신청. 처리
	 */
	public void formAccept(HumApyPrsInfoVo vo) throws KitechException;


}
