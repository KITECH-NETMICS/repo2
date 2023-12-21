package kr.re.kitech.biz.ccs.mail.dao;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ccs.mail.vo.CtrOverTripMailVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 총무관리 메일발송 DAO
 * @Class Name CcsMailSendDAO.java
 * @Description 총무관리 메일발송 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/09      이영희             최초생성
 * 
 * @author LeeYH
 * @since 2022/08/09
 * @version 1.0
 * @see
 * 
 */
@Repository("ccsMailSendDAO")
public class CcsMailSendDAO extends BizDefaultAbstractDAO {
	/**
     * 학술대회 부실학회 알림메일 내용 조회
     * @param String
     * @return CtrOverTripMailVo
     * @throws Exception
     */
	public CtrOverTripMailVo selectCtrOverRepMail(String reqNo) throws KitechException{
		return (CtrOverTripMailVo)selectByPk("kr.re.kitech.ccs.mail.selectCtrOverRepMail", reqNo);
	}
}
