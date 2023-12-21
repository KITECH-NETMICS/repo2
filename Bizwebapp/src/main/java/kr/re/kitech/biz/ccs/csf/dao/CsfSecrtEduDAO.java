package kr.re.kitech.biz.ccs.csf.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ccs.csf.vo.CsfSecrtEduVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 
 * @ClassName : CsfSecrtEduDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.27.      author    최초생성
 * 
 * @author 
 * @since 2023.10.27.
 * @version 1.0
 * @see
 * 
 */
@Repository("csfSecrtEduDAO")
public class CsfSecrtEduDAO extends BizDefaultAbstractDAO {
	@SuppressWarnings("unchecked")
	public List<CsfSecrtEduVo> selectCsfSecrtEduList(CsfSecrtEduVo csfVo) {
		return list("kr.re.kitech.biz.ccs.csf.selectCsfSecrtEduList", csfVo);
	}

	@SuppressWarnings("unchecked")
	public List<CsfSecrtEduVo> selectCsfSecrtEduList_2(CsfSecrtEduVo csfVo) {
		return list("kr.re.kitech.biz.ccs.csf.selectCsfSecrtEduList2", csfVo);
	}

	@SuppressWarnings("unchecked")
	public List<CsfSecrtEduVo> selectEducTypCdList(CsfSecrtEduVo csfVo) {
		return list("kr.re.kitech.biz.ccs.csf.selectEducTypCdList", csfVo);
	}

	@SuppressWarnings("unchecked")
	public List<CsfSecrtEduVo> selectEducKndCdList(CsfSecrtEduVo csfVo) {
		return list("kr.re.kitech.biz.ccs.csf.selectEducKndCdList", csfVo);
	}

	public int insertCsfSecrtEdu(CsfSecrtEduVo csfVo) {
		return insert("kr.re.kitech.biz.ccs.csf.insertCsfSecrtEdu", csfVo);
	}

	public int updateCsfSecrtEdu(CsfSecrtEduVo csfVo) {
		return update("kr.re.kitech.biz.ccs.csf.updateCsfSecrtEdu", csfVo);
	}

	public int deleteCsfSecrtEdu(CsfSecrtEduVo csfVo) {
		return delete("kr.re.kitech.biz.ccs.csf.deleteCsfSecrtEdu", csfVo);
	}
}
