package kr.re.kitech.biz.ccs.com.dao;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.com.vo.BizTripHoliCntVo;
import kr.re.kitech.biz.ccs.com.vo.CwsCommVo;
import kr.re.kitech.biz.ccs.com.vo.WorkTimeVo;
import kr.re.kitech.biz.ccs.ctr.vo.CheckSrcVo;


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
@Repository("ccsComDAO")
public class CcsComDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {
	
	public CwsCommVo selectAuth(CwsCommVo vo) {
		return (CwsCommVo) selectByPk("kr.re.kitech.biz.ccs.com.selectAuth", vo);
	}
	
	/**
     * 표준근로 날짜 조회
     * @param CheckSrcVo
     * @return BizTripHoliCntVo
     * @throws Exception
     */
	public BizTripHoliCntVo selectBiztripHoliDayCnt(CheckSrcVo vo) throws ElException{
		return (BizTripHoliCntVo)selectByPk("kr.re.kitech.biz.ccs.com.selectBiztripHoliDayCnt", vo);
	}
	
	/**
     * 근무시간현황 개괄 정보 조회
     * @param CheckSrcVo
     * @return WorkTimeVo
     * @throws Exception
     */
	public WorkTimeVo selectCwsWorkTimeStatus(CheckSrcVo vo) throws ElException{
		return (WorkTimeVo)selectByPk("kr.re.kitech.biz.ccs.com.selectCwsWorkTimeStatus", vo);
	}
	
	/**
     * 결재상태 조회(국내출장삭제 전 체크)
     * @param String reqNo
     * @return String
     * @throws Exception
     */
	public String selectAprState(String reqNo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.ccs.com.selectAprState", reqNo);
	}
}
