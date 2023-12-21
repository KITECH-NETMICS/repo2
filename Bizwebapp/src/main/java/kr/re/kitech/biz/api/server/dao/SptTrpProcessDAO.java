package kr.re.kitech.biz.api.server.dao;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.api.server.vo.biz.SptRstBookVo;
import kr.re.kitech.biz.xom.base.dao.TrpDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 기업지원 결재 사후작업 epapyrus 서버 DAO
 * @Class Name SptTrpProcessDAO.java
 * @Description 기업지원 결재 사후작업 epapyrus 서버 DAO (TrpDefaultAbstractDAO)
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/04      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/08/04
 * @version 1.0
 * @see
 * 
 */
@Repository("sptTrpProcessDAO")
public class SptTrpProcessDAO extends TrpDefaultAbstractDAO {
	/**
     * 성적서 뷰어 서버에서 기존 문서 삭제 flag처리
     * @param SptRstBookVo
     * @return int
     * @throws Exception
     */
	public int updatePdfResource(SptRstBookVo vo) throws KitechException{
		return update("kr.re.kitech.biz.api.bpm.updatePdfResource", vo);
	}
}
