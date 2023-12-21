package kr.re.kitech.biz.res.ape.dao;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 연구과제정산 DAO
 * @Class Name ResPrjEndDAO.java
 * @Description 연구과제정산 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/14      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/14
 * @version 1.0
 * @see
 * 
 */
@Repository("resPrjEndDAO")
public class ResPrjEndDAO extends BizDefaultAbstractDAO {
	/**
     * 연구비정산결의 취소시 결의번호 초기화
     * @param FinSpaSlipUpdVo
     * @return int
     * @throws Exception
     */
	public int updateResEnyrAdjReqHDel(FinSpaSlipUpdVo vo) throws ElException{
		return update("kr.re.kitech.biz.res.ape.updateResEnyrAdjReqHDel", vo);
	}
	
	/**
	 * 인터페이스 테이블 삭제
	 *
	 * @param reqNo
	 * @return
	 */
	public int deleteXomxintfatab(String reqNo) throws ElException{
	    return delete("kr.re.kitech.biz.apr.delXomxintfatab", reqNo);
    }   
}
