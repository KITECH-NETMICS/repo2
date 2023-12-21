/**
 * 
 */
package kr.re.kitech.biz.api.server.service;

import kr.re.kitech.biz.api.server.enums.AprProcess;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;

/**
 * 
 * @author James
 * @since 2022. 6. 29.
 */
public interface BpmPostProcess {
	ApiBpmVo doExecute(ApiBpmVo apiBpmVo) throws Exception;
	
	AprProcess getAprProcess();
}
