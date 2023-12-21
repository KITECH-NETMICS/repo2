package kr.re.kitech.biz.hum.bas.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.bas.vo.HumBasComCdVo;
import kr.re.kitech.biz.hum.bas.vo.HumBasEducMngmtVo;
import kr.re.kitech.biz.hum.bas.vo.HumOccutypCdVo;
import kr.re.kitech.biz.hum.bas.vo.HumPosiCdVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : HumBasEducMngmtDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.      작업자    최초생성
 * 
 * @author 
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
@Repository("humBasEducMngmtDAO")
public class HumBasEducMngmtDAO extends BizDefaultAbstractDAO {

 /**
   * 단건 등록
   * 
   * @author 
   * @param HumBasEducMngmtVo
   * @return int
   * @throws KitechException
   * @since 2023.09.13.   
   */
	@SuppressWarnings("unchecked")
	public List<HumBasEducMngmtVo> selectEducMngmtList(HumBasEducMngmtVo basVo) {
		return list("kr.re.kitech.biz.hum.bas.selectHumBasEducMngmt", basVo);
	}

  /**
   * 직종코드 조회
   * 
   * @author 
   * @param HumBasEducMngmtVo
   * @return List<HumOccutypCdVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
	@SuppressWarnings("unchecked")
	public List<HumOccutypCdVo> selectHumOccutypCdList(HumBasEducMngmtVo basVo) {
		return list("kr.re.kitech.biz.hum.bas.selectHumOccutypCdList", basVo);
	}
	
  /**
   * 직급코드 조회
   * 
   * @author 
   * @param HumBasEducMngmtVo
   * @return List<HumPosiCdListVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
	@SuppressWarnings("unchecked")
	public List<HumPosiCdVo> selectHumPosiCdList(HumBasEducMngmtVo basVo) {
		return list("kr.re.kitech.biz.hum.bas.selectHumPosiCdList", basVo);
	}

  /**
   * 교육훈련 조회
   * 
   * @author 
   * @param HumBasComCdVo
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
	@SuppressWarnings("unchecked")
	public List<HumBasComCdVo> selectHumComCdList(HumBasComCdVo basVo) {
		return list("kr.re.kitech.biz.hum.bas.selectHumComCdList", basVo);
	}

  /**
   * 교육훈련 코드 추가
   * 
   * @author 
   * @param HumBasComCdVo
 * @return 
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
	public int insertHumComCd(HumBasComCdVo vo) {
		return insert("kr.re.kitech.biz.hum.bas.insertHumComCd", vo);
	}
	
  /**
   * 교육훈련 코드 수정
   * 
   * @author 
   * @param HumBasComCdVo
 * @return 
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */	
	public int updateHumComCd(HumBasComCdVo vo) {
		return update("kr.re.kitech.biz.hum.bas.updateHumComCd", vo);
	}
	
  /**
   * 교육훈련 코드 삭제
   * 
   * @author 
   * @param HumBasComCdVo
 * @return 
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */	
	public int deleteHumComCd(HumBasComCdVo vo) {
		return delete("kr.re.kitech.biz.hum.bas.deleteHumComCd", vo);
	}

  /**
   * 교육구분, 교육명 비교
   * 
   * @author 
   * @param HumBasComCdVo
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.15.   
   */
	@SuppressWarnings("unchecked")
	public List<HumBasEducMngmtVo> selectHumCmpCdInfo(HumBasEducMngmtVo basVo) {
		return list("kr.re.kitech.biz.hum.bas.selectHumCmpCdInfo", basVo);
	}

  /**
   * 교육훈련 내역 추가
   * 
   * @author 
   * @param HumBasComCdVo
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.26.
   */
	public int insertEducMngmt(HumBasEducMngmtVo vo) {
		return insert("kr.re.kitech.biz.hum.bas.insertEducMngmt", vo);
	}

  /**
   * 교육훈련 내역 수정
   * 
   * @author 
   * @param HumBasComCdVo
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.26.
   */	
	public int updateEducMngmt(HumBasEducMngmtVo vo) {
		return update("kr.re.kitech.biz.hum.bas.updateEducMngmt", vo);
	}

  /**
   * 교육훈련 내역 삭제
   * 
   * @author 
   * @param HumBasComCdVo
   * @return List<HumBasComCdVo>
   * @throws KitechException
   * @since 2023.09.26.
   */	
	public int deleteEducMngmt(HumBasEducMngmtVo vo) {
		return delete("kr.re.kitech.biz.hum.bas.deleteEducMngmt", vo);
	}

	@SuppressWarnings("unchecked")
	public List<HumBasEducMngmtVo> selectEducMngmtInfoExcel_1(HumBasEducMngmtVo basVo) {
		return list("kr.re.kitech.biz.hum.bas.selectEducMngmtInfoExcel_1", basVo);
	}
	
	@SuppressWarnings("unchecked")
	public List<HumBasEducMngmtVo> selectEducMngmtInfoExcel_2(HumBasEducMngmtVo basVo) {
		return list("kr.re.kitech.biz.hum.bas.selectEducMngmtInfoExcel_2", basVo);
	}
}
