package kr.re.kitech.biz.api.client;

import kr.re.kitech.biz.api.client.vo.EasyPaySMSVo;

public interface KitechEasyPayClient {
	public EasyPaySMSVo sendEasyPaySMS(EasyPaySMSVo vo) throws Exception;
}
