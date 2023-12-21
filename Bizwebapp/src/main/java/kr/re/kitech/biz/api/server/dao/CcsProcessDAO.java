package kr.re.kitech.biz.api.server.dao;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.api.server.vo.biz.CgsAnnlHoliVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 총무관리 결재 사후작업 DAO
 * @Class Name CcsProcessDAO.java
 * @Description 총무관리 결재 사후작업 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/01      전재우             최초생성
 * 
 * @author JeonJW
 * @since 2022/08/01
 * @version 1.0
 * @see
 * 
 */
@Repository("ccsProcessDAO")
public class CcsProcessDAO extends BizDefaultAbstractDAO {
	/**
     * 휴가원 상세조회
     * @param String
     * @return List
     * @throws Exception
     */
	public CgsAnnlHoliVo selectCgsLappApr(String reqNo) throws KitechException{
		return (CgsAnnlHoliVo)selectByPk("kr.re.kitech.biz.api.bpm.selectCgsLappApr", reqNo);
	}
	
	/**
     * 신청번호로 결의번호 조회
     * @param String reqNo
     * @return String
     * @throws Exception
     */
	public String selectUnslipNo(String reqNo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.api.bpm.selectUnslipNo", reqNo);
	}
	
	/**
     * 자가점검 부실학회 카운트 조회
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int selectCtrOverRepCompnCnt(String reqNo) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.api.bpm.selectCtrOverRepCompnCnt", reqNo);
	}
} 
