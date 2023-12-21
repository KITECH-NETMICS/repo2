package kr.re.kitech.biz.ccs.cws.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cws.vo.CwsExceptWorkTimeVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsTagExceptVo;

/**  
 * @ClassSubJect 재택근무신청 관련 처리를 담당하는 DAO
 * @Class Name CwsOutWorkDAO.java
 * @Description 재택근무신청 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/28   개발팀             최초생성
 * 1
 * @author 개발팀
 * @since 2022/03/28
 * @version 1.0
 * @see
 * 
 */
@Repository("cwsTagExceptDAO")
public class CwsTagExceptDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {
	
	public CwsExceptWorkTimeVo selectExceptWorkTimeTarget(CwsExceptWorkTimeVo vo) throws ElException {
		return (CwsExceptWorkTimeVo) selectByPk("kr.re.kitech.biz.ccs.cws.selectExceptWorkTime", vo);
	}
	
	public CwsTagExceptVo selectExcepAuthor(String syspayno) throws ElException {
		return (CwsTagExceptVo) selectByPk("kr.re.kitech.biz.ccs.cws.selectExcepAuthor", syspayno);
	}

	public List<CwsTagExceptVo> selectTagExceptList(CwsTagExceptVo vo) throws ElException {
		return (List<CwsTagExceptVo>) list("kr.re.kitech.biz.ccs.cws.selectListCwsTagExcept", vo);
	}
	
	public CwsTagExceptVo selectTagExcept(CwsTagExceptVo vo) throws ElException {
		return (CwsTagExceptVo) selectByPk("kr.re.kitech.biz.ccs.cws.selectCwsTagExcept", vo);
	}
	
	public long insertTagExcept(CwsTagExceptVo vo) throws ElException {
		return insert("kr.re.kitech.biz.ccs.cws.insertCwsTagExcept", vo);
	}
	
	public long updateTagExcept(CwsTagExceptVo vo) throws ElException {
		return update("kr.re.kitech.biz.ccs.cws.updateCwsTagExcept", vo);
	}
	
	public long deleteTagExcept(CwsTagExceptVo vo) throws ElException {
		return delete("kr.re.kitech.biz.ccs.cws.deleteCwsTagExcept", vo);
	}
}
