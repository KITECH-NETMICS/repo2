package kr.re.kitech.biz.res.exa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.res.exa.vo.ResExaCryOvrMoneyInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : ResExaCryOvrMoneyDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.16.     김상미            최초생성
 * 
 * @author 김상미
 * @since 2023.10.16.
 * @version 1.0
 * @see
 * 
 */
@Repository("resExaCryOvrMoneyDAO")
public class ResExaCryOvrMoneyDAO extends BizDefaultAbstractDAO {
	
	/**
	 * RCMS 이월금 조회 
	 * 
	 * @author 김상미
	 * @param ResExaCryOvrMoneyInfoVo
	 * @return ResExaCryOvrMoneyInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExaCryOvrMoneyInfoVo selectRCMSCryOvrMoney(ResExaCryOvrMoneyInfoVo vo) throws KitechException {
	  return (ResExaCryOvrMoneyInfoVo)selectByPk("kr.re.kitech.biz.res.exa.selectResExaRCMSCryOvrMoney", vo);
	}
	
	
	/**
	 * 통합이지바로 이월금 조회
	 * 
	 * @author 김상미 
	 * @param ResExaCryOvrMoneyInfoVo
	 * @return List<ResExaCryOvrMoneyInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public List<ResExaCryOvrMoneyInfoVo> selectEzbaroCryOvrMoneyList(ResExaCryOvrMoneyInfoVo vo) throws KitechException {
	  return (List<ResExaCryOvrMoneyInfoVo>)list("kr.re.kitech.biz.res.exa.selectResExaEzbaroCryOvrMoney", vo);
	}
}
