package kr.re.kitech.biz.ass.pop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ass.pop.vo.AssMastrHPopVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 자산관리 팝업 DAO
 * @Class Name AssPopDAO.java
 * @Description 자산관리 팝업 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/06/14   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/06/14
 * @version 1
 * @see
 * 
 */
@Repository("assPopDAO")
public class AssPopDAO extends BizDefaultAbstractDAO {
	/**
     * 자산정보조회(팝업)
     * @param AssMastrHPopVo
     * @return List<AssMastrHPopVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<AssMastrHPopVo> selectAssMastrH(AssMastrHPopVo vo) throws KitechException{
		return list("kr.re.kitech.biz.ass.pop.selectAssMastrH", vo);
	}
}
