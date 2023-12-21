/**
 * 
 */
package kr.re.kitech.biz.com.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.dao.BetaTesterMngDAO;
import kr.re.kitech.biz.com.service.AppvConstraintService;
import kr.re.kitech.biz.com.service.BetaTesterMngService;
import kr.re.kitech.biz.com.vo.BetaTesterListVo;
import kr.re.kitech.biz.com.vo.BetaTesterVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.core.service.MenuService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.ObjectUtils;
import kr.re.kitech.biz.xom.core.vo.CodeVo;
import kr.re.kitech.biz.xom.core.vo.ServiceListVo;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;

/**
 * 업무의 양식함/제약/이중화 관리 서비스 
 *
 * @author 홍성민
 * @since 2023. 5. 10.
 */
@Service("betaTesterMngServiceImpl") 
public class BetaTesterMngServiceImpl extends EgovAbstractServiceImpl implements BetaTesterMngService {

	/** BetaTesterMngDAO */
    @Resource(name = "betaTesterMngDAO")
    private BetaTesterMngDAO betaTesterMngDAO;
    
	@Resource(name="menuServiceImpl")
	private MenuService menuServiceImpl;
	
	@Resource(name="appvConstraintServiceImpl")
	private AppvConstraintService appvConstraintServiceImpl;
	
	@Override
	public List<BetaTesterVo> selectBusinessServices(BetaTesterVo vo) throws Exception {
		List<BetaTesterVo> retList = null;
		String schDiv = vo.getParentDivCode();
		schDiv = StringUtils.equals(schDiv, "") ? "XAX000" : schDiv;
        CodeCacheManager instant = CodeCacheManager.getInstance();
        CodeVo selectSchCode = instant.getCode(schDiv.substring(0, 3), schDiv);
        selectSchCode = selectSchCode == null ? new CodeVo() : selectSchCode;
        AppLog.debug("*******************************************************");
        AppLog.debug("schDiv :  " + schDiv);
        AppLog.debug("selectSchCode : " + selectSchCode.toString());
        AppLog.debug("*******************************************************");
        
        if (StringUtils.isBlank(selectSchCode.getComCd())) {
        	retList = new ArrayList<BetaTesterVo>();
        	
        	List<ServiceVo> ldapServices = menuServiceImpl.findServicesByTopDivCode(vo);
        	List<BetaTesterVo> dbServices = this.selectAprMenu(vo);
        	
        	ldapServices.forEach(svrVo -> {
        		dbServices.add((BetaTesterVo) ObjectUtils.valueObjectcopy(BetaTesterVo.class, svrVo));
        	});
        	
        	retList.addAll(dbServices);
        	
        	
        } else if (StringUtils.equals(selectSchCode.getMngmtItem3(), "APR")) {
        	retList = this.selectAprMenu(vo);
        } else {
        	vo.setServiceCode(selectSchCode.getMngmtItem1());
        	List<ServiceVo> ldapServices = menuServiceImpl.findServicesByTopDivCode(vo);
        	
        	ArrayList<BetaTesterVo> temp = new ArrayList<BetaTesterVo>();
        	ldapServices.forEach(svrVo -> {
        		temp.add((BetaTesterVo) ObjectUtils.valueObjectcopy(BetaTesterVo.class, svrVo));
        	});
        	
        	retList = temp;
        }
        
        retList = retList == null ? new ArrayList<>() : retList;
        
        return retList;
	}
	
	private ServiceVo findServiceVoInList(List<ServiceVo> ldapServices, String serviceID) {
		return ldapServices.stream()
						   .filter(ldapService -> ldapService.getServiceID().equals(serviceID))
						   .findFirst()
						   .orElse(new ServiceVo());
	}
	
	private List<BetaTesterVo> selectAprMenu(BetaTesterVo vo) throws Exception {
		List<BetaTesterVo> retList = betaTesterMngDAO.selectBusinessServices(vo);
		if (retList != null && retList.size() > 0) {
			String[] serviceIds = retList.stream()
			    .map(retVo -> String.valueOf(retVo.getServiceID()))
			    .toArray(String[]::new);
			List<ServiceVo> ldapServices = menuServiceImpl.findServicesByServiceIds(serviceIds);
			
			// betaServiceYn Mapping
        	retList.stream()
        		   .forEach(serviceVo -> {
        			   ServiceVo findVo = this.findServiceVoInList(ldapServices, serviceVo.getServiceID());
        			   serviceVo.setBetaServiceYN(findVo.getBetaServiceYN());
        			   serviceVo.setServiceNewUrl(findVo.getServiceNewUrl());
        		   });
        		   
        	if (!StringUtils.isBlank(vo.getBetaServiceYN())) {
        		retList.removeIf(serviceVo -> !(this.isEqualToCondition(serviceVo, vo.getBetaServiceYN())));
        	}
		} 
		
		return retList;
	};
	
	private boolean isEqualToCondition(BetaTesterVo compVo, String condition) {
		String	betaServiceYn = StringUtils.defaultIfBlank(compVo.getBetaServiceYN(), "N");
		boolean isEqual = true;
		boolean isAsIs = StringUtils.isBlank(compVo.getServiceNewUrl());
		switch (condition) {
			case "Y":
				isEqual = StringUtils.equals(betaServiceYn, condition);
				break;
			case "2":
				isEqual = isAsIs && "N".equals(betaServiceYn);
				break;
			case "3":
				isEqual = !isAsIs && "N".equals(betaServiceYn);
				break;
		}
		
		return isEqual;
	}
	
	@Override
	public List<BetaTesterVo> selectBetaTester(BetaTesterVo vo) throws Exception {
		return betaTesterMngDAO.selectBetaTester(vo);
	}
	
	@Override
	public void updateBetaServiceYN(BetaTesterVo vo) throws Exception {
		String regstSyspayno = vo.getRegst_syspayno();
		regstSyspayno = regstSyspayno == null ? KitechContextUtil.getSyspayno() : regstSyspayno;
		
		// 베타 구분 변경 로그 적재용
		BetaTesterVo updateInfo = new BetaTesterVo();
		updateInfo.setServiceID(vo.getServiceID());
		updateInfo.setBetaServiceYN(vo.getBetaServiceYN());
		updateInfo.setRegst_syspayno(regstSyspayno);
		
		betaTesterMngDAO.insertUpdateBetaYNLog(updateInfo);
		menuServiceImpl.updateBetaService(vo);
	}
	
	@Override
	public void saveBetaTester(BetaTesterVo vo) throws Exception {
		if (vo == null || (StringUtils.isBlank(vo.getSyspayno()) && StringUtils.isBlank(vo.getDept_cd()))) {
			throw new KitechException(Exceptions.ALERT, Business.XOM, "파라미터 누락");
		}
		betaTesterMngDAO.insertBetaTesterLog(vo);
		betaTesterMngDAO.insertBetaTester(vo);
	}
	
	@Override
	public void deleteBetaTester(BetaTesterListVo vo) throws Exception {
		for (BetaTesterVo betavo : vo.getBetaTesterVoList()) {
			betavo.setRegst_syspayno(KitechContextUtil.getSyspayno());
			
			betaTesterMngDAO.insertBetaTesterDeleteLog(betavo);
			betaTesterMngDAO.deleteBetaTester(betavo);
		}
	}
		
	@Override
	public void saveServiceNewUrl(ServiceListVo listVo) throws Exception {
		for(ServiceVo vo : listVo.getServiceVoList()) {
			menuServiceImpl.updateBetaService(vo);
		}
	}
}
