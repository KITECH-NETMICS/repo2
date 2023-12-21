/**
 * 
 */
package kr.re.kitech.biz.apr.service.impl;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.apr.dao.ApprCommonDAO;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.RoleCheckVo;

/**
 * 
 * @author James
 * @since 2023. 1. 17.
 */
@Service("apprValidServiceImpl") 
public class ApprValidServiceImpl implements ApprValidService {

    @Resource(name="apprCommonDAO")
    private ApprCommonDAO apprCommonDAO;
    
    @Resource(name="accntServiceImpl")
    private AccntService accntService;    
    
    /* (non-Javadoc)
     * @see kr.re.kitech.biz.apr.service.ApprValidService#isValidInterfaceState(java.lang.String)
     */
    @Override
    public boolean isWaitStateAtIntfatab(String serviceid, String reqNo) throws KitechException {
    	try {
    		AppLog.info("<<<<<<<<<<<<<<<<<<< SERVICE ID >>>>>>>>>>>>>>>>>>>", serviceid);
    		if (StringUtils.isNotEmpty(serviceid) && 4 == serviceid.length()) {
				RoleCheckVo roleVo = accntService.checkRole(serviceid, KitechContextUtil.getRoleCode());
				if (null != roleVo && roleVo.isIsRoleYn()) {
					// 세션의 사용자가 담당자 권한을 가진경우 예외 처리
					return true;
				}
			}
			IntfatabVo intfatab = this.apprCommonDAO.getXomxintfatab(reqNo);
			AppLog.debug("Interface Table ", intfatab);
			String aprStateCode = intfatab.getAprState();
	
			if (null == aprStateCode || StringUtils.isEmpty(aprStateCode.trim())) {
				return true;
			}
			
			if (!AprState.isWait(aprStateCode)) {
				String aprStateTitle = AprState.getAprState(aprStateCode).getTitle();
				throw new KitechException(Exceptions.ERROR, Business.APR, "message.error.apr.com.0012", new String[]{aprStateTitle});
			}
		} catch (KitechException ex) {
			throw ex;
		} catch (Exception ex) {
			// 전자결재 상태값 유효성 체크시 알수없는 오류가 발생했습니다. 
			throw new KitechException(Exceptions.ERROR, Business.APR, "message.error.apr.com.0012");
		}
		return true;
	}
}
