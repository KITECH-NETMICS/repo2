package kr.re.kitech.biz.hum.apy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.hum.apy.vo.HumApyMidSvrInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumSlmmPayAmtVo;
import kr.re.kitech.biz.hum.apy.vo.HumslBasInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 가족수당신청 
 * @Class Name HumApyMidSvrDAO.java
 * @Description 퇴직급중간정산신청 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.08.31.      김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.31.
 * @version 1.0
 * @see
 * 
 */
 
  @Repository("humApyMidSvrDAO")
  public class HumApyMidSvrDAO extends BizDefaultAbstractDAO {

	 /**
	   * 퇴직금중간정산신청 리스트 조회
	   * 
	   * @author 김상미
	   * @param HumApyMidSvrInfoVo
	   * @return List<HumApyMidSvrInfoVo>
	   * @throws KitechException
	   * @since 2023.08.31.
	   */
	 public List<HumApyMidSvrInfoVo> selectList(HumApyMidSvrInfoVo vo) throws KitechException {
	   return (List<HumApyMidSvrInfoVo>)list("kr.re.kitech.biz.hum.apy.selectHumApyMidSvrList", vo);
	 }
	
	 /**
	   * 퇴직금중간정산신청 대상여부 조회
	   * 
	   * @author 김상미
	   * @param HumApyMidSvrInfoVo
	   * @return HumslBasInfoVo
	   * @throws KitechException
	   * @since 2023.08.31.
	   */
	 public HumslBasInfoVo selectEmpState(HumslBasInfoVo vo) throws KitechException {
	   return (HumslBasInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumslEmpState", vo);
	 }
	
	 /**
	   * 퇴직금중간정산신청 상세 조회
	   * 
	   * @author 김상미
	   * @param HumApyMidSvrInfoVo
	   * @return HumApyMidSvrInfoVo
	   * @throws KitechException
	   * @since 2023.08.31.
	   */
	 public HumApyMidSvrInfoVo select(HumApyMidSvrInfoVo vo) throws KitechException {
	   return (HumApyMidSvrInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApySvrInfo", vo);
	 }
	
	 /**
	   * 퇴직금중간정산 신청자 기본 정보 조회
	   * 
	   * @author 김상미
	   * @param HumApyMidSvrInfoVo
	   * @return HumApyMidSvrInfoVo
	   * @throws KitechException
	   * @since 2023.08.31.
	   */
	 public HumApyMidSvrInfoVo selectEmpInfo(HumApyMidSvrInfoVo vo) throws KitechException {
	   return (HumApyMidSvrInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApySvrEmpInfo", vo);
	 }  
	 
	 /**
	   * 퇴직금중간정산신청 건수 조회
	   * 
	   * @author 김상미
	   * @param HumApyMidSvrInfoVo
	   * @return HumApyMidSvrInfoVo
	   * @throws KitechException
	   * @since 2023.08.31.
	   */
	 public HumApyMidSvrInfoVo selectReqCount(HumApyMidSvrInfoVo vo) throws KitechException {
	   return (HumApyMidSvrInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApySvrCount", vo);
	 }
	 
	 /**
	   * 퇴직충당금조회
	   * 
	   * @author 김상미
	   * @param HumApyMidSvrInfoVo
	   * @return HumSlmmPayAmtVo
	   * @throws KitechException
	   * @since 2023.08.31.
	   */
	 public HumSlmmPayAmtVo selectSlmmPayAmt(HumApyMidSvrInfoVo vo) throws KitechException {
	   return (HumSlmmPayAmtVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumSlmmPayAmt", vo);
	 }
	 
	 /**
	   * 퇴직금중간정산신청자 급여기본정보 조회
	   * 
	   * @author 김상미
	   * @param HumApyMidSvrInfoVo
	   * @return HumApyMidSvrInfoVo
	   * @throws KitechException
	   * @since 2023.08.31.
	   */
	 public HumApyMidSvrInfoVo selectSalBasicInfo(HumApyMidSvrInfoVo vo) throws ElException {
	   return (HumApyMidSvrInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyMidSvrEmpBasicInfo", vo);
	 }  
	 
	 /**
	   * 퇴직금중간정산신청 정보 등록
	   * 
	   * @author 김상미
	   * @param HumApyMidSvrInfoVo
	   * @return int
	   * @throws KitechException
	   * @since 2023.08.31.
	   */
	 public int insert(HumApyMidSvrInfoVo vo) throws KitechException {
	   return insert("kr.re.kitech.biz.hum.apy.insertHumApyMidSvr", vo);
	 }
	
	 /**
	   * 퇴직금중간정산신청 수정
	   * 
	   * @author 김상미
	   * @param HumApyMidSvrInfoVo
	   * @return int
	   * @throws KitechException
	   * @since 2023.08.31.
	   */
	 public int update(HumApyMidSvrInfoVo vo) throws KitechException {
	   return update("kr.re.kitech.biz.hum.apy.updateHumApyMidSvr", vo);
	 }
	
	 /**
	   * 퇴직금중간정산신청 삭제
	   * 
	   * @author 김상미
	   * @param HumApyMidSvrInfoVo
	   * @return int
	   * @throws KitechException
	   * @since 2023.08.31.
	   */
	 public int delete(HumApyMidSvrInfoVo vo) throws KitechException {
	   return delete("kr.re.kitech.biz.hum.apy.deleteHumApyMidSvr", vo);
	 }

}
