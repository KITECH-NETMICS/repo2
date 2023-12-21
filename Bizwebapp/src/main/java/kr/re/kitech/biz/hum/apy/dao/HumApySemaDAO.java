package kr.re.kitech.biz.hum.apy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.apy.vo.HumApySemaInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 적립형공제신청 
 * @Class Name HumApySemaDAO.java
 * @Description 적립형공제신청 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.09.25.      김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.09.25.
 * @version 1.0
 * @see
 * 
 */
 
  @Repository("humApySemaDAO")
  public class HumApySemaDAO extends BizDefaultAbstractDAO {

	/**
	 * 적립형공제신청 목록 조회
     * 
     * @author 김상미
	 * @param  HumApySemaInfoVo
	 * @return List<HumApySemaInfoVo>
	 * @throws KitechException
	 * @since 2023.09.25. 
	 */
	public List<HumApySemaInfoVo> selectList(HumApySemaInfoVo vo) throws KitechException {
		return (List<HumApySemaInfoVo>)list("kr.re.kitech.biz.hum.apy.selectHumApySemaList", vo);
	}
		
	/**
	 * 적립형공제신청 상세 조회
     * 
     * @author 김상미
	 * @param  HumApySemaInfoVo
	 * @return HumApySemaInfoVo
	 * @throws KitechException
	 * @since 2023.09.25. 
	 */
	public HumApySemaInfoVo select(HumApySemaInfoVo vo) throws KitechException {
		return (HumApySemaInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApySemaInfo", vo);
	}

	/**
	 * 신규 신청으로 진입시 결재진행 중인 적립형공제신청건 유무 조회
     * 
     * @author 김상미
	 * @param  HumApySemaInfoVo
	 * @return HumApySemaInfoVo
	 * @throws KitechException
	 * @since 2023.09.25. 
	 */
	public HumApySemaInfoVo selectHumApySemaDupCheck(HumApySemaInfoVo vo) throws KitechException {
		return (HumApySemaInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApySemaDupCheck", vo);
	}	
			
	/**
	 * 적립형공제신청 사용자 정보 조회
     * 
     * @author 김상미
	 * @param  HumApySemaInfoVo
	 * @return HumApySemaInfoVo
	 * @throws KitechException
	 * @since 2023.09.25. 
	 */
	public HumApySemaInfoVo selectEmpInfo(HumApySemaInfoVo vo) throws KitechException {
		return (HumApySemaInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApySemaEmpBasicInfo", vo);
	}		
			
	/**
	 * 적립형공제신청 등록
     * 
     * @author 김상미
	 * @param  HumApySemaInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.25. 
	 */
	public int insert(HumApySemaInfoVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.hum.apy.insertHumApySemaInfo", vo);
	}
		
	/**
	 * 적립형공제신청 수정
     * 
     * @author 김상미
	 * @param  HumApySemaInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.25. 
	 */
	public int update(HumApySemaInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.hum.apy.updateHumApySemaInfo", vo);
	}
		
	/**
	 * 적립형공제신청 삭제
     * 
     * @author 김상미
	 * @param  HumApySemaInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.25. 
	 */
	public int delete(HumApySemaInfoVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.hum.apy.deleteHumApySemaInfo", vo);
	}
		
	/**
	 * 가입금액 조회
     * 
     * @author 김상미
	 * @param  HumApySemaInfoVo
	 * @return HumApySemaInfoVo
	 * @throws KitechException
	 * @since 2023.09.25. 
	 */
	public HumApySemaInfoVo selectHumApySemaCalcBase(HumApySemaInfoVo vo) throws KitechException {
		return (HumApySemaInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApySemaCalcBase", vo);
	}
	
	/**
	 * 적립금공제신청 처리 관련 급여정보 변경
     * 
     * @author 김상미
	 * @param  HumApySemaInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.25. 
	 */
	public int updateHumApySemaSlBasInfo(HumApySemaInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.hum.apy.updateHumApySemaSlBasInfo", vo);
	}	

	/**
	 * 적립금공제신청 처리 관련 인사정보 변경
     * 
     * @author 김상미
	 * @param  HumApySemaInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.25. 
	 */
	public int updateHumApySemaEmpBasicInfo(HumApySemaInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.hum.apy.updateHumApySemaEmpBasicInfo", vo);
	}

	/**
	 * tax결과 메세지 조회
     * 
     * @author 김상미
	 * @param  HumApySemaInfoVo
	 * @return HumApySemaInfoVo
	 * @throws KitechException
	 * @since 2023.09.25. 
	 */
	public HumApySemaInfoVo selectHumyApySemaTaxTmp(HumApySemaInfoVo vo) throws KitechException {
		return (HumApySemaInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumyApySemaTaxTmp", vo);
	}
}
