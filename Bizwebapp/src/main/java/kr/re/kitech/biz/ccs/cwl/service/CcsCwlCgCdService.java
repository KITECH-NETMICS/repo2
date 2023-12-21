package kr.re.kitech.biz.ccs.cwl.service;

import java.util.List;

import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlBeforeCgCdInfoVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdDtlVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdFeeVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdMntVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdSrchVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlHumSlBscInfoVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlSvCgCdVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 경조사비 신청 인터페이스
 * @Class Name : CcsCwlCgCdService.java
 * @Description : 경조사비 신청 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/07/27   석원탁                  최초생성
 * 
 * @author 
 * @since 2023/07/27
 * @version 1.0
 * @see
 * 
 */
public interface CcsCwlCgCdService {
 
	 /**
	 * 경조사비 신청. 목록 조회
	 */
	public List<CcsCwlCgCdVo> selectCcsCwlCgCdList(CcsCwlCgCdSrchVo vo) throws KitechException;

	 /**
	 * 경조사비 신청. 급여계좌정보 조회
	 */
	public CcsCwlHumSlBscInfoVo selectHumSlBscInfo(CcsCwlCgCdSrchVo vo) throws KitechException;

	 /**
	 * 경조사비 신청. 경조금액 조회
	 */
	public CcsCwlCgCdFeeVo selectCwlCgCdFee(CcsCwlCgCdSrchVo vo) throws KitechException;
	
	 /**
	 * 경조사비 신청. 중복 신청 조회
	 */
	public List<CcsCwlCgCdVo> selectCwlBeforeCgCdInfo(CcsCwlCgCdSrchVo vo) throws KitechException;
	
	 /**
	 * 경조사비 신청. 중복 신청 조회2(회갑, 칠순, 팔순, 구순 각 1회 신청가능 검증)
	 */
	public List<CcsCwlBeforeCgCdInfoVo> selectCwlBeforeCgCdInfo2(CcsCwlCgCdSrchVo vo) throws KitechException;

	 /**
	 * 경조사비 신청. 작성
	 */
	public CcsCwlCgCdSrchVo insertCwlCgCd(CcsCwlSvCgCdVo vo) throws KitechException;

	 /**
	 * 경조사비 신청. 상세조회
	 */
	public CcsCwlCgCdDtlVo selectCcsCwlCgCdDtl(CcsCwlCgCdSrchVo vo) throws KitechException;
	
	/**
	 * 경조사비 신청. 삭제
	 */
	public int deleteCwlCgCd(CcsCwlCgCdSrchVo vo) throws KitechException;
	
	 /**
	 * 경조내역수정. 상세조회
	 */
	public CcsCwlCgCdMntVo selectCcsCwlCgCdMnt(CcsCwlCgCdSrchVo vo) throws KitechException;
	
	 /**
	 * 경조내역수정. 수정
	 */
	public void updateCwlCgCd(CcsCwlSvCgCdVo vo) throws KitechException;

	 /**
	 * 경조사비 신청 결재상태 수정
	 */
	public void updateCwlCgCdDtl(CcsCwlSvCgCdVo vo) throws KitechException;


}