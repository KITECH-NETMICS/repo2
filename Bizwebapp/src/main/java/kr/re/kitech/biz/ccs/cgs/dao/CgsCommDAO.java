package kr.re.kitech.biz.ccs.cgs.dao;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.ccs.cgs.vo.CgsCommVo;

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
@Repository("cgsCommDAO")
public class CgsCommDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {

	public CgsCommVo selectEmp(CgsCommVo vo) {
		AppLog.debug(vo.toString());
		CgsCommVo cvo = (CgsCommVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectEmp", vo);
		
		return cvo;
	}

}
