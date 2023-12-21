package kr.re.kitech.biz.api.server.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ass.com.vo.AssMastrBodyVO;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 자산관리 결재 사후작업 DAO
 * @Class Name AssProcessDAO.java
 * @Description 자산관리 결재 사후작업 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/27      전재우             최초생성
 * 
 * @author JeonJW
 * @since 2022/07/27
 * @version 1.0
 * @see
 * 
 */
@Repository("assProcessDAO")
public class AssProcessDAO extends BizDefaultAbstractDAO {
	/**
     * 불용신청된 자산 번호 조회
     * @param String
     * @return List
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<Map<String,String>> selectAssUnUseAsetNo(String reqNo) throws ElException{
		return (List<Map<String,String>>)list("kr.re.kitech.biz.api.bpm.selectAssUnUseAsetNo", reqNo);
	}
	
	/**
     * 불용신청 결재완료 후 자산 마스터 헤더 수정
     * @param String
     * @return int
     * @throws Exception
     */
	public int updateAssMasterHead(Map<String, String> map) throws ElException{
		return update("kr.re.kitech.biz.ass.reg.updateAssMasterHead", map);
	}
	
	/**
     * 자산 인수인계 결재 완료 후 설치위치 조회
     * @param String
     * @return List
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<AssMastrBodyVO> selectAssReceiptTransInfo(String reqNo) throws ElException{
		return list("kr.re.kitech.biz.api.bpm.selectAssReceiptTransInfo", reqNo);
	}
	
	/**
     * 자산 사용자 부서 및 관리주체 조회
     * @param String
     * @return String
     * @throws Exception
     */
	public String selectAssMngmtBody(String string) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.ass.com.selectAssMngmtBody", string);
	}
	
	/**
     * 자산 인수인계 결재 완료 후 설치위치 업데이트
     * @param String
     * @return int
     * @throws Exception
     */
	public int updateAssMasterBody(AssMastrBodyVO vo) throws ElException{
		return update("kr.re.kitech.biz.ass.reg.updateAssMasterBody", vo);
	}
	
	/**
     * 자산 이동신청 결재 완료 후
     * @param String
     * @return List
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<AssMastrBodyVO> selectAssMoveInfo(String reqNo) throws ElException{
		return list("kr.re.kitech.biz.api.bpm.selectAssMoveInfo", reqNo);
	}
} 
