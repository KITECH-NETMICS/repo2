package kr.re.kitech.biz.xom.core.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ControllerContextUtil;

import kr.re.kitech.biz.api.client.RecommClient;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.core.service.MenuService;
import kr.re.kitech.biz.xom.core.service.RecomMenuService;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

@Service("recomMenuServiceImpl")
public class RecomMenuServiceImpl implements RecomMenuService {

	@Resource(name="menuServiceImpl")
	MenuService menuServiceImpl;

	@Resource(name="recommMenuClient")
	private RecommClient recommMenuClient;
	
	@Override
	public List<ServiceVo> selectRecommendMenuList() throws KitechException {
//		List<ServiceVo> services = menuServiceImpl.selectRootMenu();
		BizUserHeader bizheader = (BizUserHeader)ControllerContextUtil.getUserHeader();
		
    	UserVo user = new UserVo();
    	user.setSn(bizheader.getSession().getSn());
    	user.setOuCode(bizheader.getSession().getDeptCode());
//    	user.setSn("20211106");
//    	user.setOuCode("H650");
		JSONObject result = recommMenuClient.execute(user);
		
		// 2. 추천 메뉴 서비스코드 리스트 추출
		List<String> serviceCodes =  new ArrayList<String>();
		
		JSONArray menuGroups = result.getJSONArray("menuGroups");
		JSONArray items = result.getJSONArray("items");
		
		if (menuGroups.length() == 0) {
			return null;
		}
		
		for (int i = 0; (i < menuGroups.length() && serviceCodes.size() <= 30); i++) {
			String serviceId = menuGroups.getJSONObject(i).getString("serviceid");
			
			if (this.isContainServiceId(items, serviceId))
				serviceCodes.add( serviceId );
		}
		
		// 전체 메뉴에서 사용자 추천 메뉴 목록에 존재하는 건만 추출
		List<ServiceVo> resultList = menuServiceImpl.selectServicesByIds(serviceCodes.toArray(new String[serviceCodes.size()]));
		resultList = resultList.stream()
					.sorted(Comparator.comparing(ServiceVo::getServiceOrder))
					.collect(Collectors.toList());
					
		AppLog.debug("serviceCodes =============================> " + serviceCodes);
		AppLog.debug("resultList ===============================> " + resultList);
//		services.forEach(service -> {
//			serviceCodes.forEach(serviceCode -> {
//				if (serviceCode.contains(service.getServiceID())){
//				// if (Pattern.matches(serviceCodePattern, service.getServiceCode())){
//					resultList.add(service);
//				}
//			});
//		});
		
		return resultList;
	}
	
	private boolean isContainServiceId(JSONArray arr, String serviceID) {
		return arr.toList()
				  .stream()
				  .anyMatch(item -> StringUtils.equals((String)((Map)item).get("scrn_id"), serviceID));
	}

}
