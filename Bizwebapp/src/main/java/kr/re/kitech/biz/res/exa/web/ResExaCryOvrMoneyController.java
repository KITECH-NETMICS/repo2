package kr.re.kitech.biz.res.exa.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.res.exa.service.ResExaCryOvrMoneyService;
import kr.re.kitech.biz.res.exa.vo.ResExaCryOvrMoneyInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : ResExaCryOvrMoneyController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.16.      김상미    최초생성
 * 
 * @author 김상미
 * @since 2023.10.16.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class ResExaCryOvrMoneyController {

	@Resource(name = "resExaCryOvrMoneyServiceImpl")
	private ResExaCryOvrMoneyService exaService;

	/**
	 * RCMS 이월금 조회 
	 * 
	 * @author 김상미
	 * @param ResExaCryOvrMoneyInfoVo
	 * @return List<ResExaCryOvrMoneyInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	@ElService(key="SvcRESEXARESR01")
	@RequestMapping(value="SvcRESEXARESR01")
	@DataCollection(ref="h", target="")
	@ElDescription(sub="RCMS 이월금 조회 ",desc="RCMS 이월금 조회 ")
	public ResExaCryOvrMoneyInfoVo selectRCMSCryOvrMoney(ResExaCryOvrMoneyInfoVo exaVo) throws KitechException {  	 
	    return exaService.selectRCMSCryOvrMoney(exaVo);
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
	@ElService(key="SvcRESEXARESR02")
	@RequestMapping(value="SvcRESEXARESR02")
	@DataCollection(ref="h", target="")
	@ElDescription(sub="통합이지바로 이월금 조회 ",desc="통합이지바로 이월금 조회")
	public List<ResExaCryOvrMoneyInfoVo> selectEzbaroCryOvrMoneyList(ResExaCryOvrMoneyInfoVo exaVo) throws KitechException {  	 
	    return exaService.selectEzbaroCryOvrMoneyList(exaVo);
	}
}
  