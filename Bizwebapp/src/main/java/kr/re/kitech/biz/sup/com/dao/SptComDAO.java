package kr.re.kitech.biz.sup.com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.com.vo.SptComCodeVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;
/**  
 * @ClassSubJect 기술지원공통처리 DAO
 * @Class Name SptComDAO.java
 * @Description 기술지원공통 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/04   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/08/04
 * @version 1
 * @see
 * 
 */
@Repository("sptComDAO")
public class SptComDAO extends BizDefaultAbstractDAO {
	/**
     * 기술지원 공통코드 조회
     * @param SptComCodeVo
     * @return List<SptComCodeVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptComCodeVo> selectSptComCode(SptComCodeVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.com.selectSptComCode", vo);
	}
}
