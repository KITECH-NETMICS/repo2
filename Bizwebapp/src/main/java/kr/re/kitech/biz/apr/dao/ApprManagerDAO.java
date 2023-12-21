package kr.re.kitech.biz.apr.dao;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.apr.vo.AprMngVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 관리자 전자결재 처리 DAO
 * @Class Name ApprManagerDAO.java
 * @Description 관리자 전자결재 처리 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/10/04      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/10/04
 * @version 1.0
 * @see
 * 
 */
@Repository("apprManagerDAO")
public class ApprManagerDAO extends BizDefaultAbstractDAO {
	/**
     * Bpm 삭제
     * @param AprMngVo
     * @return int
     * @throws Exception
     */
	public int updateBpmProcInst(AprMngVo vo) throws KitechException{
		return update("kr.re.kitech.biz.apr.updateBpmProcInst", vo);
	}
	
	/**
     * Bpm 건수 조회
     * @param String
     * @return int
     * @throws Exception
     */
	public int selectBpmProcInstCnt(String name) throws KitechException{
		return (int)selectByPk("kr.re.kitech.biz.apr.selectBpmProcInstCnt", name);
	}
}
