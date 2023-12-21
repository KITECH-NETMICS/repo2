package kr.re.kitech.biz.ccs.ctr.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ccs.ctr.vo.BizTripFareVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO;
import kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripInfoVO;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripCurStnVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripSrcVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 근거리출장 관련 처리 컨트롤러
 * @Class Name CtrTripInviteController.java
 * @Description 근거리출장 관련 처리 컨트롤러
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/05/13      김태균             최초생성
 * 
 * @author 김태균
 * @since 2022/05/13
 * @version 1.0
 * @see
 * 
 */
@Repository("ctrLocalTripDAO")
public class CtrLocalTripDAO extends BizDefaultAbstractDAO {
	
	/**
     * 근거리출장 여비조회
     * @param Object
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<BizTripFareVo> selectCtrTrafcFee(CtrTripSrcVo param) throws KitechException {
    	 return list("kr.re.kitech.biz.ccs.ctr.selectCtrBiztripFare", param);
    }
     
    /**
     * 근거리출장정보를 생성
     * @param CtrLocalTripInfoVO
     * @throws Exception
     */
	public int insertCtrLocalInfo(CtrLocalTripInfoVO param) throws KitechException {
		return insert("kr.re.kitech.biz.ccs.ctr.insertCtrLocalInfo", param);
	}
	
	/**
     * 근거리출장정보를 수정
     * @param CtrLocalTripInfoVO
     * @throws KitechException
     */
	public int updateCtrLocalInfo(CtrLocalTripInfoVO param) throws KitechException {
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrLocalInfo", param);
	}
	
	/**
     * 근거리출장정보를 삭제
     * @param String reqNo
     * @throws KitechException
     */
	public int deleteCtrLocalInfo(String reqNo) throws KitechException {
		return update("kr.re.kitech.biz.ccs.ctr.deleteCtrLocalInfo", reqNo);
	}
	
	/**
     * 근거리출장정보를 조회
     * @param String reqNo
     * @throws KitechException
     */
	public CtrLocalTripInfoVO selectCtrLocalTrip(String reqNo) throws KitechException {
		return (CtrLocalTripInfoVO)selectByPk("kr.re.kitech.biz.ccs.ctr.selectCtrLocalTrip", reqNo);
	}
	
	/**
     * 근거리출장원을 생성
     * @param CtrLocalTripCompnVO
     * @throws KitechException
     */
	public int insertCtrLocalCompn(CtrLocalTripCompnVO param) throws KitechException {
		return insert("kr.re.kitech.biz.ccs.ctr.insertCtrLocalCompn", param);
	}
	
	/**
     * 근거리출장원을 삭제
     * @param String reqNo
     * @throws KitechException
     */
	public int deleteCtrLocalCompn(String reqNo) throws KitechException {
		return delete("kr.re.kitech.biz.ccs.ctr.deleteCtrLocalCompn", reqNo);
	}
	
	/**
     * 근거리출장원을 조회
     * @param CtrLocalTripInfoVO
     * @throws KitechException
     */
	@SuppressWarnings("unchecked")
	public List<CtrLocalTripCompnVO> selectCtrLocalCompn(String reqNo) throws KitechException {
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrLocalCompn", reqNo);
	}
	
	/**
     * 근거리출장비를 검증
     * @param CtrLocalTripCompnVO
     * @throws KitechException
     */
	@SuppressWarnings("unchecked")
	public List<CtrLocalTripCompnVO> selectCtrLocalAmt(CtrLocalTripInfoVO param) throws KitechException {
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrLocalAmt", param);
	}
    
    /**
     * 근거리출장비를 변경
     * @param CtrLocalTripCompnVO
     * @throws KitechException
     */
	public int updateCtrLocalAmt(CtrLocalTripCompnVO vo) throws KitechException {
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrLocalAmt", vo);
	}
	
	/**
     * 최근계정을 조회 한다
     * @param Object
     * @throws KitechException
     */
    @SuppressWarnings("unchecked")
	public List<Object> selectRecntAccnt(Object param) throws KitechException {
    	return list("kr.re.kitech.biz.ccs.ctr.selectRecntAccnt", param);
    }
    
    /**
     * 근무일수를 조회 한다
     * @param Object
     * @throws KitechException
     */
    public int selectWorkDays(CtrTripCurStnVo param) throws KitechException {
    	return (int)selectByPk("kr.re.kitech.biz.ccs.ctr.selectWorkDays", param);
    }
    
    /**
     * 출장일수를 조회 한다
     * @param Object
     * @throws KitechException
     */
    @SuppressWarnings("unchecked")
	public List<CtrTripCurStnVo> selectTripPsnCount(CtrTripCurStnVo vo) throws KitechException {
    	return list("kr.re.kitech.biz.ccs.ctr.selectTripPsnCount", vo);
    }
    
    /**
     * 회계코드를 조회 한다
     * @param Object
     * @throws KitechException
     */
    public String selectAccntCdLocalTrip(Map<String,String> param) throws KitechException {
    	return (String)selectByPk("kr.re.kitech.biz.ccs.ctr.selectAccntCdLocalTrip", param);
    }
    
    /**
     * 총액을 수정 한다
     * @param Object
     * @throws KitechException
     */
    public int updateCtrLocalExpns(CtrLocalTripInfoVO param) throws KitechException {
    	return update("kr.re.kitech.biz.ccs.ctr.updateCtrLocalExpns", param);
    }
    
    /**
     * 예산통제모듈 호출 후 통제번호 수정
     * @param BblenfrcVo
     * @return int
     * @throws KitechException
     */
    public int updateCtrLocalCtrlNo(BblenfrcVo vo) throws KitechException {
    	return update("kr.re.kitech.biz.ccs.ctr.updateCtrLocalCtrlNo", vo);
    }
}