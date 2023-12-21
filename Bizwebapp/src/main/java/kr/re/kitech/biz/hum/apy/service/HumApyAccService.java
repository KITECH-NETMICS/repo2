package kr.re.kitech.biz.hum.apy.service;

import java.util.List;

import kr.re.kitech.biz.hum.apy.vo.HumApyAccInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyAccSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 급여계좌신청 관련 인터페이스
 * @Class Name : HumApyAccService.java
 * @Description : 급여계좌신청 관련 인터페이스
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
public interface HumApyAccService {

	 /**
	 * 급여계좌신청. 목록 조회
	 */
	public List<HumApyAccInfoVo> selectHumApyAccList(HumApyAccSrchVo vo) throws KitechException;
	
	/**
	 * 급여계좌신청. 작성중 문서 유효성 체크
	 */
	public HumApyAccInfoVo selectHumApyAccAprChk(HumApyAccSrchVo vo) throws KitechException;

	/**
	 * 급여계좌신청. 신청전 기본 계좌 정보 조회(신규)
	 */
	public HumApyAccInfoVo selectHumApyAccBscInfo(HumApyAccSrchVo vo) throws KitechException;

	/**
	 * 급여계좌신청. 신청계좌정보 조회(상세)
	 */
	public HumApyAccInfoVo selectHumApyAccInfo(HumApyAccSrchVo vo) throws KitechException;

	/**
	 * 급여계좌신청. 신청서 삭제
	 */
	public void deleteHumApyAcc(HumApyAccSrchVo vo) throws KitechException;

	/**
	 * 급여계좌신청. 신청서 저장, 수정, 결재신청
	 */
	public String saveHumApyAcc(HumApyAccInfoVo vo) throws KitechException;
	
	/**
	 * 급여계좌신청. 반려
	 */
	public void formReject(HumApyAccInfoVo vo) throws KitechException;

	/**
	 * 급여계좌신청. 처리
	 */
	public void formAccept(HumApyAccInfoVo vo) throws KitechException;

}
