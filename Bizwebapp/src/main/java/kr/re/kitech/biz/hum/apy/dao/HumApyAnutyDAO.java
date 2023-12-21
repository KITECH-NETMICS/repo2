package kr.re.kitech.biz.hum.apy.dao;
 
import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.apy.vo.HumApyAnutyInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 과학기술인연금신청 
 * @Class Name HumApyAnutyDAO.java
 * @Description 과학기술인연금신청 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.08.25.      김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.25.
 * @version 1.0
 * @see
 * 
 */
 
 @Repository("humApyAnutyDAO")
 public class HumApyAnutyDAO extends BizDefaultAbstractDAO {
	
	/**
     * 과학기술인연금신청 목록 조회
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @return List<HumApyAnutyInfoVo>
	 * @throws KitechException
	 * @since 2023.08.25.
     */
	 public List<HumApyAnutyInfoVo> selectList(HumApyAnutyInfoVo vo) throws KitechException {
	   return (List<HumApyAnutyInfoVo>)list("kr.re.kitech.biz.hum.apy.selectHumApyAnutyList", vo);
	 }
	
	/**
     * 과학기술인연금신청 상세 조회
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @return HumApyAnutyInfoVo
	 * @throws KitechException
	 * @since 2023.08.25.
     */
	 public HumApyAnutyInfoVo select(HumApyAnutyInfoVo vo) throws KitechException {
	   return (HumApyAnutyInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyAnuty", vo);
	 }
	 
	 /**
	  * 과학기술인연금신청 신청자 정보 조회
	  *
	  * @author 김상미	
	  * @param HumApyAnutyInfoVo
	  * @return HumApyAnutyInfoVo
	  * @throws KitechException
	  * @since 2023.08.25.
      */
	 public HumApyAnutyInfoVo selectEmpInfo(HumApyAnutyInfoVo vo) throws KitechException {
	   return (HumApyAnutyInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyAnutyEmpBasicInfo", vo);
	 }  
	 
	 /**
	  * 과학기술인연금신청 계산 금액 조회
	  *
	  * @author 김상미	
	  * @param HumApyAnutyInfoVo
	  * @return HumApyAnutyInfoVo
	  * @throws KitechException
	  * @since 2023.08.25.
      */
	 public HumApyAnutyInfoVo selecXodhSlCode(HumApyAnutyInfoVo vo) throws KitechException {
	   return (HumApyAnutyInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyAnutyXodhSlCode", vo);
	 }  
	
	 /**
	  * 과학기술인연금신청 등록
	  *
	  * @author 김상미	
	  * @param HumApyAnutyInfoVo
	  * @return int
	  * @throws KitechException
	  * @since 2023.08.25.
      */
	 public int insert(HumApyAnutyInfoVo vo) throws KitechException {
	   return insert("kr.re.kitech.biz.hum.apy.insertHumApyAnuty", vo);
	 }
	
	 /**
	  * 과학기술인연금신청 수정
	  *
	  * @author 김상미	
	  * @param HumApyAnutyInfoVo
	  * @return int
	  * @throws KitechException
	  * @since 2023.08.25.
      */
	 public int update(HumApyAnutyInfoVo vo) throws KitechException {
	   return update("kr.re.kitech.biz.hum.apy.updateHumApyAnuty", vo);
	 }
	
	 /**
	  * 과학기술인연금신청 삭제
	  *
	  * @author 김상미	
	  * @param HumApyAnutyInfoVo
	  * @return int
	  * @throws KitechException
	  * @since 2023.08.25.
      */
	 public int delete(HumApyAnutyInfoVo vo) throws KitechException {
	   return delete("kr.re.kitech.biz.hum.apy.deleteHumApyAnuty", vo);
	 }
	
	 /**
	  * 소급분내역 등록
	  *
	  * @author 김상미	
	  * @param HumApyAnutyInfoVo
	  * @return HumApyAnutyInfoVo
	  * @throws int
	  * @since 2023.08.25.
      */
	 public int insertAnutyRet(HumApyAnutyInfoVo vo) throws KitechException {
	   return insert("kr.re.kitech.biz.hum.apy.insertHumApyAnutyRet", vo);
	 }
	
	 /**
	  * 인사 기본정보 수정
	  *
	  * @author 김상미	
	  * @param HumApyAnutyInfoVo
	  * @return int
	  * @throws KitechException
	  * @since 2023.08.25.
      */
	 public int updateEmpBasicInfo(HumApyAnutyInfoVo vo) throws KitechException {
	   return update("kr.re.kitech.biz.hum.apy.updateHumApyAnuty", vo);
	 }
	 
	 /**
	  * 급여 기본정보 수정
	  *
	  * @author 김상미	
	  * @param HumApyAnutyInfoVo
	  * @return int
	  * @throws KitechException
	  * @since 2023.08.25.
      */
	 public int updateSlBasInfo(HumApyAnutyInfoVo vo) throws KitechException {
	   return update("kr.re.kitech.biz.hum.apy.updateHumApyAntySlBasInfo", vo);
	 }  
}
