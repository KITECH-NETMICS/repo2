package kr.re.kitech.biz.com.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.dao.AppvConstraintDAO;
import kr.re.kitech.biz.com.service.AppvConstraintService;
import kr.re.kitech.biz.com.vo.AppvConstraintListVo;
import kr.re.kitech.biz.com.vo.AppvConstraintVo;
import kr.re.kitech.biz.com.vo.BetaTesterListVo;
import kr.re.kitech.biz.com.vo.BetaTesterVo;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * 업무의 양식함/제약/이중화 관리 서비스
 *
 * @author 홍성민
 * @since 2023. 5. 10.
 */
@Service("appvConstraintServiceImpl") 
public class AppvConstraintServiceImpl extends EgovAbstractServiceImpl implements AppvConstraintService {

    
	/** BetaTesterMngDAO */
    @Resource(name = "appvConstraintDAO")
    private AppvConstraintDAO appvConstraintDAO;
	
    @Override
    public BetaTesterVo selectAppvApplicationMap(BetaTesterVo vo) throws Exception {
    	return appvConstraintDAO.selectAliasViaServiceId(vo);
    }
    
    @Override
	public List<AppvConstraintVo> selectAppvConstList(AppvConstraintVo vo) throws Exception {
		List<AppvConstraintVo> retList = appvConstraintDAO.selectAppvConstList(vo);
		
		return retList == null ? new ArrayList<>() : retList;
	}
	
	@Override
	public void saveAppvApplicationMap(BetaTesterVo vo) throws Exception {
		appvConstraintDAO.saveAppvApplicationMap(vo);
	}
	
	@Override
	public void saveAppvApplicationMap(BetaTesterListVo vo) throws Exception {
		for (BetaTesterVo svrVo : vo.getBetaTesterVoList()) {
			if (StringUtils.isBlank(svrVo.getAlias())) continue;
			
			this.saveAppvApplicationMap(svrVo);
		}
	}
	
	@Override
	public void saveAppvConstList(AppvConstraintListVo vo) throws Exception {
		for (AppvConstraintVo appvVo : vo.getAppvConstraintVoList()) {
			appvVo.setRegst_syspayno(KitechContextUtil.getSyspayno());
			
			appvConstraintDAO.saveAppvConstraint(appvVo);
		}
	}
	
	@Override
	public void swapAppvApplicationMap(BetaTesterVo vo) throws Exception {
		appvConstraintDAO.swapAppvApplicationMap(vo);
	}
	
}
