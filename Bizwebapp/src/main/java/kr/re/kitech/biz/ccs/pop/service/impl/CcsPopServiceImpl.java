package kr.re.kitech.biz.ccs.pop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappSchVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappVo;
import kr.re.kitech.biz.ccs.pop.dao.CcsPopDAO;
import kr.re.kitech.biz.ccs.pop.service.CcsPopService;
import kr.re.kitech.biz.ccs.pop.vo.CtrAirMileUseVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripPopVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripSrcVo;
import kr.re.kitech.biz.ccs.pop.vo.CwlHumFamyInfoPopVo;
import kr.re.kitech.biz.ccs.pop.vo.CwlLoanPopVo;

@Service("ccsPopService")
public class CcsPopServiceImpl extends EgovAbstractServiceImpl implements CcsPopService {
	@Resource(name="ccsPopDAO")
	private CcsPopDAO dao;

	/**
    * 국내출장신청 검색 팝업 목록조회
    */
	@Override
	public List<CtrTripPopVo> selectPopCtrDomList(CtrTripSrcVo vo) throws ElException{
		if(vo.getFlag().matches("DomRep|DomLoad|DomCvnTrip")){ // 경비결의,일반결의,국내출장,외부강의
			return dao.selectPopCtrDomList(vo);
		}else if(vo.getFlag().matches("OverRep|OverCvntrip")){// 경비결의,일반결의,외부강의
			return dao.selectPopCtrOverList(vo);
		}else if(vo.getFlag().matches("LocalAdjst|LocalCvnTrip")){// 경비결의,일반결의,외부강의
			return dao.selectPopCtrLocalList(vo);
			
		}else if(vo.getFlag().matches("DomAd")){// 국내출장정산번호 검색(팝업 C322)
			return dao.selectCtrDomAdList(vo);
		}else{ // All
			List<CtrTripPopVo> tripList = dao.selectPopCtrDomList(vo); // 국내출장
			
			tripList.addAll(dao.selectPopCtrOverList(vo));// 해외 출장
			tripList.addAll(dao.selectPopCtrLocalList(vo)); // 근거리출장
			return tripList;
		}
	}
	
	/**
     * 병가 휴가원신청중 증빙 미등록내역 조회(팝업)
     * @param CgslappSchVo
     * @return List<CgslappVo>
     * @throws Exception
     * @author LeeYH
     * @since 2022.09.07.
     */
	public List<CgslappVo> selectSickVaccNoFileList(CgslappSchVo vo) throws ElException {
		return dao.selectSickVaccNoFileList(vo);
	}
	
	/**
     * 항공마일리지관리번호 검색(팝업)
     * @param CtrTripSrcVo
     * @return List<CtrAirMileUseVo>
     * @throws Exception
     * @author LeeYH
     * @since 2023.02.08.
     */
	public List<CtrAirMileUseVo> selectCtrAirMileUseList(CtrTripSrcVo vo) throws ElException{
		return dao.selectCtrAirMileUseList(vo);
	}
	
	/**
	 * 대출중도산환신청 - 대출내역조회(팝업)
	 * @param CwlLoanPopVo
	 * @return List<CwlLoanPopVo>
	 * @throws Exception
	 * @author lsh
	 * @since 2023.09.13.
	 */
	public List<CwlLoanPopVo> selectCwlLoanPopList(CwlLoanPopVo vo) throws ElException{
		return dao.selectCwlLoanPopList(vo);
	}
	
	/**
	 * 학자금융자신청 - 부양가족조회(팝업)
	 * @param CwlHumFamyInfoPopVo
	 * @return List<CwlHumFamyInfoPopVo>
	 * @throws Exception
	 * @author lsh
	 * @since 2023.10.17.
	 */
	public List<CwlHumFamyInfoPopVo> selectHumFamyInfoList(CwlHumFamyInfoPopVo vo) throws ElException{
		return dao.selectHumFamyInfoList(vo);
	}

}
