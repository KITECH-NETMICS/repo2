package kr.re.kitech.biz.api.server.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.api.server.vo.LogCallAppVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
/**
 * @ClassSubJect BPM 대응 공통 API 관련 DAO
 * @Class Name BizBpmDAO.java
 * @Description BPM 대응 공통 API 관련 데이터를 처리한다.
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/29     박정일             최초생성
 * 
 * @author 박정일
 * @since 2022/07/29
 * @version 1.0
 * @see
 * 
 */
@Repository("bizBpmDAO")
public class BizBpmDAO extends BizDefaultAbstractDAO {

	/**
     * 사번에 해당하는 지역담당자를 조회하여 반환한다.
	 * 
     * @param ApiBpmVo apiAprVo
     * @return List<ApiAprVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<ApiBpmVo> findLocalAuthorsByRoleType(ApiBpmVo apiAprVo) {
		return (List<ApiBpmVo>)list("kr.re.kitech.biz.api.bpm.findLocalAuthorsByRoleType", apiAprVo);
	}
	
	@SuppressWarnings("unchecked")
	public List<ApiBpmVo> findAssHqAuthors() {
		return (List<ApiBpmVo>)list("kr.re.kitech.biz.api.bpm.findAssHqAuthors");
	}	
	
	/**
	 * 인사담당자를 조회한다.
	 * @param roleCode
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<ApiBpmVo> findAuthorsByRoleCode(String roleCode) {
		return (List<ApiBpmVo>)list("kr.re.kitech.biz.api.bpm.findAuthorsByRoleCode", roleCode);
	}	
	
	/**
	 * 롤코드에 해당하는 기술료 담당자 조회한다.
	 * @param roleCode
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<ApiBpmVo> findTecAuthorsByRoleCode(String roleCode) {
		return (List<ApiBpmVo>)list("kr.re.kitech.biz.api.bpm.findTecAuthorsByRoleCode", roleCode);
	}		
	
	public int selectSlipTypCnt(String slipTypCd) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.api.bpm.selectSlipTypCnt", slipTypCd);
	}
	
	/**
	 * 결재 후처리 Process 호출 후 로그 저장
	 * @param LogCallAppVo
	 * @return int
     * @exception
	 */
	public int insertLogCallApp(LogCallAppVo vo) throws ElException{
		return insert("kr.re.kitech.biz.api.bpm.insertLogCallApp", vo);
	}
}
