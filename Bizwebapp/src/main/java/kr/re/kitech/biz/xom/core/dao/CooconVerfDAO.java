package kr.re.kitech.biz.xom.core.dao;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.vo.AccountVerfVo;

/**
 * @author LeeYH-PC
 * 계좌검증 DAO
 */
@Repository("cooconDAO")
public class CooconVerfDAO extends BizDefaultAbstractDAO {
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
