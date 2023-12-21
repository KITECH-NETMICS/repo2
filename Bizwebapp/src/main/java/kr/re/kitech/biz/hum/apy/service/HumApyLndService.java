package kr.re.kitech.biz.hum.apy.service;

import java.util.List;

import kr.re.kitech.biz.hum.apy.vo.HumApyLndInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyLndListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyLndSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 휴복직신청 관련 인터페이스
 * @Class Name : HumApyLndService.java
 * @Description : 휴복직신청 관련 인터페이스
 * @Modification Information  
 * @
 * @  수정일             수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/15   석원탁             최초생성
 * 
 * @author 
 * @since 2023/09/15
 * @version 1.0
 * @see
 * 
 */
public interface HumApyLndService {

	 /**
	 * 휴복직신청. 목록 조회
	 */
	public List<HumApyLndInfoVo> selectHumApyLndList(HumApyLndSrchVo vo) throws KitechException;
	
	/**
	 * 휴복직신청. 상세조회
	 */
	public HumApyLndInfoVo selectHumApyLndInfo(HumApyLndSrchVo vo) throws KitechException;
	
	/**
	 * 휴복직신청. 신청서 삭제
	 */
	public void deleteHumApyLnd(HumApyLndSrchVo vo) throws KitechException;

	/**
	 * 휴복직신청. 저장, 수정, 결재신청
	 */
	public String saveHumApyLnd(HumApyLndInfoVo vo) throws KitechException;

	/**
	 * 휴복직신청. 반려
	 */
	public void formReject(HumApyLndInfoVo vo) throws KitechException;

	/**
	 * 휴복직신청. 처리
	 */
	public void formAccept(HumApyLndListVo vo) throws KitechException;

}
