package kr.re.kitech.biz.sup.mail.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.mail.vo.SptUnPaidMailVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기술지원 메일발송
 * @Class Name SptTecMailDAO.java
 * @Description 기술지원 메일발송 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/01   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/08/01
 * @version 1
 * @see
 * 
 */
@Repository("sptTecMailDAO")
public class SptTecMailDAO extends BizDefaultAbstractDAO {
	/**
     * 미수수탁정산결의 정산신청 메일발송을 위한 조회
     * @param List<SptTecAdjstSlipVo>
	 * @return List<SptUnPaidMailVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptUnPaidMailVo> selectSptTecRcptInfoMail(SptUnPaidMailVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.mail.selectSptTecRcptInfoMail", vo);
	}
}
