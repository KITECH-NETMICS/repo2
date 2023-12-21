package kr.re.kitech.biz.ccs.pop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgslappSchVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrAirMileUseVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripPopVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripSrcVo;
import kr.re.kitech.biz.ccs.pop.vo.CwlHumFamyInfoPopVo;
import kr.re.kitech.biz.ccs.pop.vo.CwlLoanPopVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**  
 * @ClassSubJect 출장 팝업 
 * @Class Name : CcsPopDAO.java
 * @Description : 출장 팝업 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/14   이영희                최초생성
 * @ 2023/09/13   lsh        대출내역조회 추가
 * 
 * @author LeeYh
 * @since 2022/04/14
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
 @Repository("ccsPopDAO")
public class CcsPopDAO extends BizDefaultAbstractDAO {
	 
	 /**
     * 출장신청번호 검색 팝업 조회(국내출장)
     * @param CtrTripSrcVo
     * @return List<CtrTripPopVo>
     * @throws Exception
     */
	 @SuppressWarnings("unchecked")
	public List<CtrTripPopVo> selectPopCtrDomList(CtrTripSrcVo vo) throws ElException{
		 return list("kr.re.kitech.biz.ccs.pop.selectPopCtrDomList", vo);
	}
	
	/**
     * 출장신청번호 검색 팝업 조회(해외출장)
     * @param CtrTripSrcVo
     * @return List<CtrTripPopVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrTripPopVo> selectPopCtrOverList(CtrTripSrcVo vo) throws ElException{
		 return list("kr.re.kitech.biz.ccs.pop.selectPopCtrOverList", vo);
	}
	
	/**
     * 출장신청번호 검색 팝업 조회(근거리출장)
     * @param CtrTripSrcVo
     * @return List<CtrTripPopVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrTripPopVo> selectPopCtrLocalList(CtrTripSrcVo vo) throws ElException{
		 return list("kr.re.kitech.biz.ccs.pop.selectPopCtrLocalList", vo);
	}
	
	/**
     * 병가 휴가원신청중 증빙 미등록내역 조회(팝업)
     * @param CgslappSchVo
     * @return List<CgslappVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<CgslappVo> selectSickVaccNoFileList(CgslappSchVo vo) throws ElException {
    	return list("kr.re.kitech.biz.ccs.pop.selectSickVaccNoFileList", vo);
    }
    
    /**
     * 국내출장정산번호 검색(팝업)
     * @param CtrTripSrcVo
     * @return List<CtrTripPopVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<CtrTripPopVo> selectCtrDomAdList(CtrTripSrcVo vo) throws ElException{
    	return list("kr.re.kitech.biz.ccs.pop.selectCtrDomAdList", vo);
    }
    
    /**
     * 항공마일리지관리번호 검색(팝업)
     * @param CtrTripSrcVo
     * @return List<CtrAirMileUseVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<CtrAirMileUseVo> selectCtrAirMileUseList(CtrTripSrcVo vo) throws ElException{
    	return list("kr.re.kitech.biz.ccs.pop.selectCtrAirMileUseList", vo);
    }
    
    /**
     * 대출중도산환신청 - 대출내역조회(팝업)
     * @param CwlLoanPopVo
     * @return List<CwlLoanPopVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<CwlLoanPopVo> selectCwlLoanPopList(CwlLoanPopVo vo) throws ElException{
    	return list("kr.re.kitech.biz.ccs.pop.selectCwlLoanPopList", vo);
    }
    
    /**
     * 부양가족조회(팝업)
     * @param CwlHumFamyInfoPopVo
     * @return List<CwlHumFamyInfoPopVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<CwlHumFamyInfoPopVo> selectHumFamyInfoList(CwlHumFamyInfoPopVo vo) throws ElException{
    	return list("kr.re.kitech.biz.ccs.pop.selectHumFamyInfoList", vo);
    }
}
