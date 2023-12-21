package kr.re.kitech.biz.ccs.ctr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ccs.ctr.vo.AirMileSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrAirMileVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrAirMileTripVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrAirMileUseVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 항공마일리지
 * @Class Name CtrAirMileDAO.java
 * @Description 항공마일리지 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023/02/14      이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/02/14
 * @version 1.0
 * @see
 * 
 */
@Repository("ctrAirMileDAO")
public class CtrAirMileDAO extends BizDefaultAbstractDAO {
	/**
     * 항공사별 마일리지 신청서(신고서) 사용내역 조회
     * @param AirMileSrcVo
     * @return List<CtrAirMileUseVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrAirMileUseVo> selectCtrAirMileUseList(AirMileSrcVo vo) throws KitechException{	
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrAirMileUseList", vo);
	}	
	
	/**
     * 개인별 사용가능 항공마일리지 조회
     * @param String
     * @return List<CtrAirMileVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CtrAirMileVo> selectCtrAirMileList(AirMileSrcVo vo) throws KitechException{	
		return list("kr.re.kitech.biz.ccs.ctr.selectCtrAirMileList", vo);
	}	
	
	/**
     * 마일리지 사용 출장정보 조회
     * @param String 출장신청번호
     * @return CtrDomVo
     * @throws Exception
     */
	public CtrAirMileTripVo selectCtrTripAirMile(String reqNo) throws KitechException{
		return (CtrAirMileTripVo)selectByPk("kr.re.kitech.biz.ccs.ctr.selectCtrTripAirMile", reqNo);
	}
	
	/**
     * 마일리지 신청 저장
     * @param CtrAirMileUseVo
     * @return int
     * @throws Exception
     */
	public int insertCtrAirMileUse(CtrAirMileUseVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.ccs.ctr.insertCtrAirMileUse", vo);
	}
	
	/**
     * 개인별 항공마일리지 저장
     * @param CtrAirMileVo
     * @return int
     * @throws Exception
     */
	public int mergeCtrAirMile(CtrAirMileVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.ctr.mergeCtrAirMile", vo);
	}
	
	/**
     * 마일리지 신청 수정
     * @param CtrAirMileUseVo
     * @return int
     * @throws Exception
     */
	public int updateCtrAirMileUse(CtrAirMileUseVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.ctr.updateCtrAirMileUse", vo);
	}
}
