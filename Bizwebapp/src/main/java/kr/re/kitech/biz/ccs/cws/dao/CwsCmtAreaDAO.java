package kr.re.kitech.biz.ccs.cws.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cws.vo.CwsCmtAreaTagVo;


/**  
 * @ClassSubJect 출퇴근인증API 관련 처리를 담당하는 DAO
 * @Class Name CwsCommuteDAO.java
 * @Description 출퇴근인증API 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/09/15   김소연                 최초생성
 * @author 모바일
 * @since 2022/09/15
 * @version 1.0 
 * @see
 * 
 */

@Repository("cwsCmtAreaDAO")
public class CwsCmtAreaDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {
	
	// 출퇴근 인증 insert
	public void insertCwsCmtAreaTag(CwsCmtAreaTagVo vo) throws ElException{
		 insert("kr.re.kitech.biz.ccs.cws.insertCwsCmtAreaTag", vo);
	}
	
	// 출퇴근 인증 IS_VALID 비교
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectCwsCmtAreaCheck(CwsCmtAreaTagVo cwsCmtAreaTagVo) throws ElException { 
		return list("kr.re.kitech.biz.ccs.cws.selectCwsCmtAreaCheck", cwsCmtAreaTagVo);
	}
	
	// 출퇴근 인증 최신 5건 리스트 출력
	@SuppressWarnings("unchecked")
	public List<CwsCmtAreaTagVo> selectCwsCmtAreaList(CwsCmtAreaTagVo cwsCmtAreaTagVo) throws ElException { 
		return list("kr.re.kitech.biz.ccs.cws.selectCwsCmtAreaList", cwsCmtAreaTagVo);
	}
}