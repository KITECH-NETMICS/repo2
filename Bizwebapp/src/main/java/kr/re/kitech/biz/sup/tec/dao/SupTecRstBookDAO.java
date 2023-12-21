package kr.re.kitech.biz.sup.tec.dao;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.tec.vo.SptRstBookVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기술지원 시험성적서 DAO
 * @Class Name SupTecRstBookDAO.java
 * @Description 기술지원 시험성적서 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/05/30   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/05/30
 * @version 1
 * @see
 * 
 */
@Repository("supTecRstBookDAO")
public class SupTecRstBookDAO extends BizDefaultAbstractDAO {
	/**
     * 성적서 계산서 발행시 발행업체와 기술지원요청 업체가 다를 경우 계산서 발행업체 저장
     * @param SptTecBillIssuInfoVo
     * @return int
     * @throws Exception
     */
	public int updateSptTecBillIssuInfo(SptRstBookVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTecBillIssuInfo", vo);
	}
	
	/**
     * 성적서에서 계산서 발행 후 계산서 번호 업데이트
     * @param SptTecRcptInfoVo
     * @return int
     * @throws Exception
     */
	public int updateSptRstBook(SptRstBookVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptRstBook", vo);
	}
}
