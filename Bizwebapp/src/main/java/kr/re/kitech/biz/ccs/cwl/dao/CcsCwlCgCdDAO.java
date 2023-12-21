package kr.re.kitech.biz.ccs.cwl.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.apr.vo.IntfatabVo;
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
 * @ClassSubJect 경조사비 신청 DAO
 * @Class Name CcsCwlCgCdDAO.java
 * @Description 경조사비 신청 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/07/27   석원탁                 최초생성
 * @author 
 * @since 2023/07/27
 * @version 1.0 
 * @see
 * 
 */
@Repository("ccsCwlCgCdDAO")
public class CcsCwlCgCdDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {
	
    /**
     * 경조사비 신청. 목록 조회
     */
	@SuppressWarnings("unchecked")
	public List<CcsCwlCgCdVo> selectCcsCwlCgCdList(CcsCwlCgCdSrchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.ccs.cwl.selectCcsCwlCgCdList", vo);
	}

    /**
     * 경조사비 신청. 급여계좌정보 조회
     */
	public CcsCwlHumSlBscInfoVo selectHumSlBscInfo(CcsCwlCgCdSrchVo vo) throws KitechException {
		return (CcsCwlHumSlBscInfoVo) selectByPk("kr.re.kitech.biz.ccs.cwl.selectHumSlBscInfo", vo);
	}

    /**
     * 경조사비 신청. 경조금액 조회
     */
	public CcsCwlCgCdFeeVo selectCwlCgCdFee(CcsCwlCgCdSrchVo vo) throws KitechException {
		return (CcsCwlCgCdFeeVo) selectByPk("kr.re.kitech.biz.ccs.cwl.selectCwlCgCdFee", vo);
	}
	
    /**
     * 경조사비 신청. 중복 신청 조회
     */
	@SuppressWarnings("unchecked")
	public List<CcsCwlCgCdVo> selectCwlBeforeCgCdInfo(CcsCwlCgCdSrchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.ccs.cwl.selectCwlBeforeCgCdInfo", vo);
	}

    /**
     * 경조사비 신청. 중복 신청 조회2(회갑, 칠순, 팔순, 구순 각 1회 신청가능 검증)
     */
	@SuppressWarnings("unchecked")
	public List<CcsCwlBeforeCgCdInfoVo> selectCwlBeforeCgCdInfo2(CcsCwlCgCdSrchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.ccs.cwl.selectCwlBeforeCgCdInfo2", vo);
	}
	
	/**
	 * 경조사비 신청. 작성
	 */
	public void insertCwlCgCd(CcsCwlSvCgCdVo vo) throws KitechException {
		insert("kr.re.kitech.biz.ccs.cwl.insertCwlCgCd", vo);
	}
	
	/**
	 * 경조사비 신청. 작성 시 결재상태 값 변경
	 */
	public void updateXomxintfatab(IntfatabVo aprVo) {
		update("kr.re.kitech.biz.apr.modXomxintfatab", aprVo);		
	}

    /**
     * 경조사비 신청. 상세조회
     */
	public CcsCwlCgCdDtlVo selectCcsCwlCgCdDtl(CcsCwlCgCdSrchVo vo) throws KitechException {
		return (CcsCwlCgCdDtlVo) selectByPk("kr.re.kitech.biz.ccs.cwl.selectCcsCwlCgCdDtl", vo);
	}
	
	/**
	 * 경조사비 신청. 삭제
	 */
	public int deleteCwlCgCd(CcsCwlCgCdSrchVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.ccs.cwl.deleteCwlCgCd", vo);
	}
	
    /**
     * 경조내역수정. 상세조회
     */
	public CcsCwlCgCdMntVo selectCcsCwlCgCdMnt(CcsCwlCgCdSrchVo vo) throws KitechException {
		return (CcsCwlCgCdMntVo) selectByPk("kr.re.kitech.biz.ccs.cwl.selectCcsCwlCgCdMnt", vo);
	}
	
	/**
	 * 경조내역수정. 수정
	 */
	public int updateCwlCgCd(CcsCwlSvCgCdVo vo) throws KitechException {
		return update("kr.re.kitech.biz.ccs.cwl.updateCwlCgCd", vo);
	}

	/**
	 * 경조사비 신청. 결재상태 수정
	 */
	public int updateCwlCgCdDtl(CcsCwlSvCgCdVo vo) throws KitechException {
		return update("kr.re.kitech.biz.ccs.cwl.updateCwlCgCdDtl", vo);
	}


}