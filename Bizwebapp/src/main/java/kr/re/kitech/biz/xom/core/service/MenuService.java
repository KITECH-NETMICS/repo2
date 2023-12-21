package kr.re.kitech.biz.xom.core.service;

import java.util.List;

import kr.re.kitech.biz.xom.core.vo.ServiceListVo;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;

/**
 * 메뉴 서비스
 *
 * @author James
 * @since 2023. 2. 15.
 */
public interface MenuService {
	final static String ROOT_SVC_CD = "1000000000";
	final static String[] MENU_ATTR = {"serviceCode","parentDivCode","childNode","serviceLevel","serviceOrder","serviceID","useYN","cn","cnServiceFullName","serviceUrl","serviceNewUrl","betaServiceYN"};

	public List<ServiceVo> findActiveServices() ;				// 전체 메뉴 조회
	public List<ServiceVo> selectMenu(String uid) ;				// 사용자ID 별 권한 적용 메뉴 조회
	public List<ServiceVo> getMenuListForTree(String uid) ;		// 사용자ID 별 권한 적용 메뉴 조회 #2
	public List<ServiceVo> selectSmartMenu(String syspayno) ;	// 추천 메뉴 조회
	public List<ServiceVo> selectServicesByIds(String[] serviceIds) ;	// 서비스 ID로 메뉴 조회
	public List<ServiceVo> selectMyMenu(String syspayno) ;		// 나의메뉴 조회
	public void appendMyMenu(ServiceListVo menuListVo) ;		// 나의메뉴 추가
	public void deleteMyMenu(ServiceListVo menuListVo) ;		// 나의메뉴 삭제
	public List<ServiceVo> findServicesByTopDivCode(ServiceVo vo) throws Exception;
	public List<ServiceVo> findServicesByServiceIds(String[] serviceIDs) throws Exception;
	public void updateBetaService(ServiceVo vo) throws Exception;
}
