/**
 * 
 */
package kr.re.kitech.biz.xom.core.dao;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.vo.AccountVerfVo;

/**  
 * @ClassSubJect 계좌검증
 * @Class Name : AccountVerfDAO.java
 * @Description : 환경설정 으 처리하는 DAO
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/08/18   이영희          최초생성
 * 
 * @author 이영희
 * @since 2022/08/18
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Repository("accountVerfDAO")
public class AccountVerfDAO extends BizDefaultAbstractDAO{
	/**
     * 계좌검증결과 로그 저장
     * @param AccountVerfVo 
     * @return int
     * @throws Exception
     * @author LeeYH
     * @since 2022.08.18.
     */
	public int insertCooconCallLog(AccountVerfVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.xom.core.insertCooconCallLog", vo);
	}
	
	/**
     * 거래 일련번호 조회
     * @param AccountVerfVo 
     * @return String
     * @throws Exception
     * @author LeeYH
     * @since 2022.08.18.
     */
	public String selectTrscSeqNo(AccountVerfVo vo) throws KitechException{
		return (String)selectByPk("kr.re.kitech.biz.xom.core.selectTrscSeqNo", vo);
	}
}
