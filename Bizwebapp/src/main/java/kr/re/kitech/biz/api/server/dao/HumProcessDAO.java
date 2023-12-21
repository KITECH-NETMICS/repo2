package kr.re.kitech.biz.api.server.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPruseVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 인사관리 결재 사후작업 DAO
 * @Class Name HumProcessDAO.java
 * @Description 인사관리 결재 사후작업 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/01      전재우             최초생성
 * 
 * @author JeonJW
 * @since 2022/08/01
 * @version 1.0
 * @see
 * 
 */
@Repository("humProcessDAO")
public class HumProcessDAO extends BizDefaultAbstractDAO {
	/**
     * 아르바이트 활용신청내역 조회
     * @param String
     * @return List
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<Map<String,String>> selectHumApyPtInfo(String reqNo) throws ElException{
		return (List<Map<String,String>>)list("kr.re.kitech.biz.api.bpm.selectHumApyPtInfo", reqNo);
	}
	
	/**
     * 아르바이트 기간조회
     * @param Map
     * @return List
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<Map<String,String>> selectXomdtmast(Map<String, String> map) throws ElException{
		return (List<Map<String,String>>)list("kr.re.kitech.biz.api.bpm.selectXomdtmast", map);
	}
	
	/**
     * 아르바이트 비용신청 입력
     * @param Map
     * @return List
     * @throws Exception
     */
	public int insertHumApyArCost(Map<String, String> map) throws ElException{
		return insert("kr.re.kitech.biz.hum.apy.insertHumApyArCost", map);
	}
	
	/**
     * 지도교수(활용책임자) 수정건 조회
     * @param String
     * @return List
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<HumApyPruseVo> selectHumPruse(String reqNo) throws ElException{
		return (List<HumApyPruseVo>)list("kr.re.kitech.biz.api.bpm.selectHumPruse", reqNo);
	}
	
	/**
     * 지도교수(활용책임자) 카운트 조회
     * @param String
     * @return int
     * @throws Exception
     */
	public int selectHumPruseCnt(HumApyPruseVo vo) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.hum.apy.selectHumPruseCnt", vo);
	}
	
	/**
     * 지도교수(활용책임자) 신규 저장
     * @param HumApyPruseVo
     * @return int
     * @throws Exception
     */
	public int insertHumPruse(HumApyPruseVo vo) throws ElException{
		return insert("kr.re.kitech.biz.hum.apy.insertHumPruse", vo);
	}
	
	/**
     * 지도교수(활용책임자) 수정
     * @param HumApyPruseVo
     * @return int
     * @throws Exception
     */
	public int updateHumPruse(HumApyPruseVo vo) throws ElException{
		return update("kr.re.kitech.biz.hum.apy.updateHumPruse", vo);
	}
	
	/**
     * 인사정보 활용책임자 수정
     * @param HumApyPruseVo
     * @return int
     * @throws Exception
     */
	public int updateHumBasic(HumApyPruseVo vo) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updateHumBasic", vo);
	}
	
	/**
     * 지도교수(활용책임자) 승인처리
     * @param ApiBpmVo
     * @return int
     * @throws Exception
     */
	public int updateHumApyPruserEspnInfo(ApiBpmVo vo) {
		return update("kr.re.kitech.biz.api.bpm.updateHumApyPruserEspnInfo", vo);
	}
	
	/**
     * EIP 정보변경신청서 상세조회
     * @param String
     * @return List
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<Map<String,String>> selectHumApyInfoChg(String reqNo) {
		return (List<Map<String,String>>)list("kr.re.kitech.biz.api.bpm.selectHumApyInfoChg", reqNo);
	}
	
	/**
     * EIP 정보변경 이미지 수정
     * @param Map
     * @return int
     * @throws Exception
     */
	public int updateHumApyInfoChgImg(Map<String, String> map) {
		return update("kr.re.kitech.biz.api.bpm.updateHumApyInfoChgImg", map);
	}
	
	/**
     * 사용자 휴대폰번호 조회
     * @param String
     * @return List
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public Map<String,String> selectHumMobile(String reqNo) {
		return (Map<String,String>)selectByPk("kr.re.kitech.biz.api.bpm.selectHumMobile", reqNo);
	}
} 
