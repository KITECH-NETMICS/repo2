package kr.re.kitech.biz.ccs.cgs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.api.server.vo.biz.CgsAnnlHoliVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCrtYmHolVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 휴가원 관련 처리를 담당하는 DAO
 * @Class Name CgslappDAO.java
 * @Description 휴가원 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/05/03   박병목             최초생성
 * 
 * @author 박병목
 * @since 2022/05/03
 * @version 1.0
 * @see
 * 
 */
@Repository("cgsVacaDAO")
public class CgsVacaDAO extends BizDefaultAbstractDAO {
	/**
     * 소멸연차 조회
     * @param String
     * @return List
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CgsAnnlHoliVo> selectCgsAnnual(CgsAnnlHoliVo vo) throws KitechException{
		return list("kr.re.kitech.biz.ccs.cgs.selectCgsAnnual", vo);
	}
	
	/**
     * 연차소멸 계산시 사용한 전년도 포함 4년간의 사용연차를 금년 계산로직에서 제외
     * @param String
     * @return List
     * @throws Exception
     */
	public int updateCgsAnnual(CgsAnnlHoliVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.cgs.updateCgsAnnual", vo);
	}
	
	/**
     * 일반직 연차생성: 임원, 파견관, 연수생(근로), 연구별정(단), 행정별정(단) 직군이 기타, 전년도퇴사자 제외
     * @param String
     * @return List
     * @throws Exception
     */
	public int deleteCgsAnUlmHold(CgsAnnlHoliVo vo) throws KitechException{
		return delete("kr.re.kitech.biz.ccs.cgs.deleteCgsAnUlmHold", vo);
	}
	
	/**
     * 연차생성 대상자 조회(3년간의 휴가정보, 연차정보 포함: 연차이월제 버전)
     * @param CgsAnnlHoliVo
     * @return List<CgsCrtYmHolVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CgsCrtYmHolVo> selectHumBasicInfo(CgsAnnlHoliVo vo) throws KitechException{
		return list("kr.re.kitech.biz.ccs.cgs.selectHumBasicInfo", vo);
	}
	
	/**
     * 연월차 관리-등록
     * @param CgsCrtYmHolVo
     * @return int
     * @throws Exception
     */
	public int insertCgsAnulmHold(CgsCrtYmHolVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.ccs.cgs.insertCgsAnulmHold", vo);
	}
	
	/**
     * 학생연구원 월차대상 병합(생성)
     * @param CgsAnnlHoliVo
     * @return int
     * @throws Exception
     */
	public int updateCgsAnulmHoldStuMon(CgsAnnlHoliVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.cgs.updateCgsAnulmHoldStuMon", vo);
	}
	
	/**
     * 학생연구원 연차대상 병합(생성)
     * @param CgsAnnlHoliVo
     * @return int
     * @throws Exception
     */
	public int updateCgsAnulmHoldStuYr(CgsAnnlHoliVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.cgs.updateCgsAnulmHoldStuYr", vo);
	}
	
	/**
     * 아르바이트 , 연구별정(단)/ 행정별정(단) 대상자 조회
     * @param CgsAnnlHoliVo
     * @return List<CgsCrtYmHolVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CgsCrtYmHolVo> selectHumBasicInfoArb(CgsAnnlHoliVo vo) throws KitechException{
		return list("kr.re.kitech.biz.ccs.cgs.selectHumBasicInfoArb", vo);
	}
	
	/**
     * 아르바이트 , 연구별정(단)/ 행정별정(단) 연차관리 수정
     * @param CgsAnnlHoliVo
     * @return int
     * @throws Exception
     */
	public int updateCgsAnulmHoldArb(CgsCrtYmHolVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.cgs.updateCgsAnulmHoldArb", vo);
	}
	
	/**
     * 시간선택제 대상자 조회
     * @param CgsAnnlHoliVo
     * @return List<CgsCrtYmHolVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CgsCrtYmHolVo> selectHumBasicInfoTime(CgsAnnlHoliVo vo) throws KitechException{
		return list("kr.re.kitech.biz.ccs.cgs.selectHumBasicInfoTime", vo);
	}
	
	/**
     * [TMS/BIZ] 비상근직급 계약이력에 따른 월차 생성
     * @param CgsAnnlHoliVo
     * @return int
     * @throws Exception
     */
	public int updateCgsAnulmHoldTimeMon(CgsAnnlHoliVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.cgs.updateCgsAnulmHoldTimeMon", vo);
	}
	
	/**
     * [TMS/BIZ] 비상근 계약이력에 따른 연차 생성
     * @param CgsAnnlHoliVo
     * @return int
     * @throws Exception
     */
	public int updateCgsAnulmHoldTimeYr(CgsAnnlHoliVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.cgs.updateCgsAnulmHoldTimeYr", vo);
	}
	
	/**
     * 저축연차 소멸대상조회(60개이상)
     * @param CgsAnnlHoliVo
     * @return List<CgsCrtYmHolVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<CgsCrtYmHolVo> selectCgsAnulmHoldExpir(CgsAnnlHoliVo vo) throws KitechException{
		return list("kr.re.kitech.biz.ccs.cgs.selectCgsAnulmHoldExpir", vo);
	}
	
	/**
     * 60개이상 소멸연차 계산 후 저축연자 업데이트
     * @param CgsCrtYmHolVo
     * @return int
     * @throws Exception
     */
	public int updateCgsAnulmHold(CgsCrtYmHolVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ccs.cgs.updateCgsAnulmHold", vo);
	}

}
