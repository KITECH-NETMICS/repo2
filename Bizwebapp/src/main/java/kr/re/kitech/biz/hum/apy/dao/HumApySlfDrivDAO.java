package kr.re.kitech.biz.hum.apy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.apy.vo.HumApySlfDrivInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 자가운전보조비신청 
 * @Class Name HumApySlfDrivDAO.java
 * @Description 자가운전보조비신청 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.08.04.     김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.04.
 * @version 1.0
 * @see
 * 
 */
 
  @Repository("humApySlfDrivDAO")
  public class HumApySlfDrivDAO extends BizDefaultAbstractDAO {
  
	/**
     * 자가운전보조비신청 목록 조회
	 *
	 * @author 김상미	
     * @param  HumApySlfDrivInfoVo
     * @return List<HumApySlfDrivInfoVo>
	 * @throws KitechException
	 * @since 2023.08.04. 
     */
	 @SuppressWarnings("unchecked")
	 public List<HumApySlfDrivInfoVo> selectList(HumApySlfDrivInfoVo vo) throws KitechException {
	   return (List<HumApySlfDrivInfoVo>)list("kr.re.kitech.biz.hum.apy.selectHumApySlfDrivList", vo);
	 }
	
	/**
     * 자가운전보조비신청 상세 조회
	 *
	 * @author 김상미	
     * @param  HumApySlfDrivInfoVo
     * @return HumApySlfDrivInfoVo
	 * @throws KitechException
	 * @since 2023.08.04.
     */
	 public HumApySlfDrivInfoVo select(HumApySlfDrivInfoVo vo) throws KitechException {
	   return (HumApySlfDrivInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApySlfDriv", vo);
	 }
	
	/**
     * 자가운전보조비신청 결재신청 조회
	 *
	 * @author 김상미	
     * @param  HumApySlfDrivInfoVo
     * @return HumApySlfDrivInfoVo
	 * @throws KitechException
	 * @since 2023.08.04. 
     */
	 public HumApySlfDrivInfoVo selectAprDirvInfo(HumApySlfDrivInfoVo vo) throws KitechException {
	   return (HumApySlfDrivInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApySlfDrivAprInfo", vo);
	 }
	 
	 /**
      * 자가운전보조비신청 등록
      *
      * @author 김상미	
      * @param  HumApySlfDrivInfoVo
      * @return int
      * @throws KitechException
      * @since 2023.08.04. 
      */
	 public int insert(HumApySlfDrivInfoVo vo) throws KitechException {
	   return insert("kr.re.kitech.biz.hum.apy.insertHumApySlfDriv", vo);
	 }
	
	 /**
	  * 자가운전보조비 신청  수정
      *
      * @author 김상미	
      * @param  HumApySlfDrivInfoVo
      * @return int
	  * @throws KitechException
	  * @since 2023.08.04. 
      */
	 public int update(HumApySlfDrivInfoVo vo) throws KitechException {
	   return update("kr.re.kitech.biz.hum.apy.updateHumApySlfDriv", vo);
	 }
	
	 /**
	  * 자가운전보조비 신청 삭제
      *
      * @author 김상미	
      * @param  HumApySlfDrivInfoVo
      * @return int
	  * @throws KitechException
	  * @since 2023.08.04. 
      */
	 public int delete(HumApySlfDrivInfoVo vo) throws KitechException {
	   return delete("kr.re.kitech.biz.hum.apy.deleteHumApySlfDriv", vo);
	 }

}
