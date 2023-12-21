package kr.re.kitech.biz.res.exa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.res.exa.dao.ResExaCryOvrMoneyDAO;
import kr.re.kitech.biz.res.exa.service.ResExaCryOvrMoneyService;
import kr.re.kitech.biz.res.exa.vo.ResExaCryOvrMoneyInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : ResExaCryOvrMoneyServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.16.    김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.10.16.
 * @version 1.0
 * @see
 * 
 */
@Service("resExaCryOvrMoneyServiceImpl")
public class ResExaCryOvrMoneyServiceImpl  extends EgovAbstractServiceImpl implements ResExaCryOvrMoneyService {
	@Resource(name="resExaCryOvrMoneyDAO")
	private ResExaCryOvrMoneyDAO exaDAO;
	  
	/**
	 * RCMS 이월금 조회 
	 * 
	 * @author 김상미
	 * @param ResExaCryOvrMoneyInfoVo
	 * @return ResExaCryOvrMoneyInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	@Override
	public ResExaCryOvrMoneyInfoVo selectRCMSCryOvrMoney(ResExaCryOvrMoneyInfoVo vo) throws KitechException {
	  ResExaCryOvrMoneyInfoVo resultVo = exaDAO.selectRCMSCryOvrMoney(vo);	
	  return resultVo;
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
	@Override
	public List<ResExaCryOvrMoneyInfoVo> selectEzbaroCryOvrMoneyList(ResExaCryOvrMoneyInfoVo vo) throws KitechException {
	  List<ResExaCryOvrMoneyInfoVo> list = exaDAO.selectEzbaroCryOvrMoneyList(vo);	
	  return list;
	}  
}
