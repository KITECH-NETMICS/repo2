package kr.re.kitech.biz.xom.core.service;

import java.util.List;

import kr.re.kitech.biz.xom.core.vo.AccountVerfListVo;
import kr.re.kitech.biz.xom.core.vo.AccountVerfVo;

/**
 * 계좌검증 서비스
 * @author 이영희
 * @since 2022.08.19.
 */
public interface AccountVerfService {
	/**
	 * 계좌검증 (단건)
	 */
	public AccountVerfVo proccessAccountVerf(AccountVerfVo vo);
	
	/**
	 * 계좌검증 (다건)
	 */
	public List<AccountVerfVo> proccessAccountVerfList(AccountVerfListVo listVo);
}
