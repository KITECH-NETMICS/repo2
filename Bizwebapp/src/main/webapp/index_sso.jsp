<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="com.inswave.elfw.log.AppLog"%>
<%@ page import="com.inswave.elfw.util.ElBeanUtils"%>
<%@ page import="com.inswave.elfw.view.ElMappingJacksonObjectMapper"%>
<%@ page import="kr.re.kitech.biz.xom.base.log.MbiAccessLog"%>
<%@ page import="kr.re.kitech.biz.xom.base.log.BizAccessLog"%>
<%@ page import="kr.re.kitech.biz.xom.base.util.pks.ClientUtil"%>
<%@ page import="kr.re.kitech.biz.xom.base.model.BizUserHeader"%>
<%@ page import="kr.re.kitech.biz.xom.base.model.SessionUserHeader"%>
<%@ page import="kr.re.kitech.biz.xom.core.ext.BaseUrlProperty"%>
<%@ page import="kr.re.kitech.biz.api.client.vo.NoticeResult"%>
<%@ page import="kr.re.kitech.biz.api.client.AuthClient"%>
<%
	/**
	 * welcome 페이지 접근 시 세션 유무에 따라 초기 화면과 로그인 화면  분기 처리
	 */
	AppLog.debug("==========================================================");
	AppLog.debug("[ 업무/결재 서비스 ]");
	AppLog.debug("MbiAccess Log Level", MbiAccessLog.getLevel());
	AppLog.debug("BizAccess Log Level", BizAccessLog.getLevel());
	AppLog.debug("==========================================================");
	
	ElMappingJacksonObjectMapper mapper = (ElMappingJacksonObjectMapper) ElBeanUtils.getBean("jsonMapper");
	BizUserHeader userHeader = (BizUserHeader) session.getAttribute("userHeader");
	AppLog.debug("SSO Welcome page BizUserHeader: " + userHeader);
	if (null == userHeader || null == userHeader.getSession() || null == mapper) {
		response.sendRedirect(BaseUrlProperty.ssoPxyUrl);
		return;
	}

	String sessions = mapper.writeValueAsString(userHeader.getSession());
	AppLog.debug(sessions);	
	
	String baseUrls = BaseUrlProperty.getUrls();	
	AppLog.debug(baseUrls);

	// 시스템 점검 여부 확인 로직
	AuthClient authClient = (AuthClient) ElBeanUtils.getBean("authClient");
	
	if (null != authClient) {
		try {
			// String clientIP = "10.0.0.1";
			String clientIP = ClientUtil.getClientIP(request);
			NoticeResult noticeResult = authClient.getNoticeInfo(clientIP);
			AppLog.debug("\nClientIP : " + clientIP + "\n");
			AppLog.debug("\n==================} noticeResult [==================\n" + noticeResult);
			if (null != noticeResult && noticeResult.isBlock()) {
				AppLog.debug("\nIs Block =================================>\n");
		 		request.setAttribute("noticeResult", noticeResult);		
				RequestDispatcher dispatcher = request.getRequestDispatcher("/notice.jsp");
				dispatcher.forward(request, response);
			} else {
				AppLog.debug("\nPass =================================>\n");
			}
		} catch (Exception ex) {
			AppLog.error("시스템 공지 조회 관련 오류 발생!!");
			// ignore: 시스템 공지는 비즈니스 로직과 무관하므로 오류 무시
		} 
	}
%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge" />
		<link rel="shortcut icon" href="/cm/images/favicon.ico" />
		<title>KITECH EIP3.0 전자결재</title>
		<meta name="viewport" content="width=1600, initial-scale=0, maximum-scale=1">
		<script type="text/javascript">
			var WebSquareExternal = {
				"baseURI": "/websquare/", 
				"w2xPath" : "/cm/layout/index.xml"
			};
		</script>
		<!-- polaris 에디터 -->
		<script type="text/javascript" src="/cm/ext/polariseditor/polaris.js"></script>
        <script type="text/javascript" src="/cm/ext/polariseditor/api/apis.js"></script>		
		<script type="text/javascript" src="/javascript.wq?q=/bootloader"></script>
		<script type="text/javascript" language="javascript">
			// document.domain = "kitech.re.kr";
			window.onload = function() {
				try {
					gcm.data.setLoginInfo(<%= sessions %>);
					gcm.baseUrls = <%= baseUrls %>;
					
					WebSquare.startApplication(WebSquareExternal.w2xPath);

					// 헤더 정보 설정
					if ($p.top().wfm_header) {
						$p.top().wfm_header.getWindow().btn_userNm.setValue(com.getLoginInfo('cn'));
					}


				} catch(e) {
					alert(e.message);
				}
				
				// BIZ2 스냅샷 전환용 메소드 추가
				window.addEventListener('message', function(e){
					if (e.data && e.data.focusData) {
	                    console.log(e.data);
						var fdata = e.data.focusData;
						if(fdata.focus == 'ON'){
							var el = document.querySelectorAll('.w2window.w2window_maximized.w2window_selected');
							var iframe = el[0].querySelector("iframe[id$='iframe']");
							iframe.focus();
						}
					}
					if (e.data && e.data.bindData) {
	                    console.log(e.data);
						var bdata = e.data.bindData;
						if(bdata.bind == 'ON'){
							var grp_side = gcm.util.getComponent(scwin, 'mf_wfm_side_grp_side');
							if (grp_side.hasClass("more") && !mf_grp_container.hasClass("fix")) {			
								grp_side.removeClass("more");
							}
							// 로컬 스토리지에서 메뉴 고정 여부 값을 가져온다.
							if (grp_side.hasClass("more") && "true" === WebSquare.localStorage.getItem("fix")) {
								mf_grp_container.removeClass("fix");
								mf_grp_container.addClass("fix");
							}
							const contextMenu = document.getElementById('mf_wfm_side_context_menu');
							if (e.target.offsetParent != contextMenu) {
								contextMenu.classList.remove("visible");
							}
						}
					}
					if (e.data && e.data.closeData) {
						console.log(e.data);
						var cdata = e.data.closeData;
						if(cdata.close == 'CLOSE'){
							if(gcm.data.checkBeforeClose(scwin, mf_wdc_layout.windows[mf_wdc_layout.selectedIndex].windowId)){
								mf_wdc_layout.closeWindow(mf_wdc_layout.windows[mf_wdc_layout.selectedIndex].windowId)
							}
							var isBiz = cdata.isBiz || false;
							
							// 일반 업무화면에서 사용 시 업무대기함으로 가는 로직 무시하기 위해 isBiz가 넘어오지 않을때만 처리
							if (isBiz != true) { 
								// 각 결재함 카운트 갱신
								mf_wfm_side.scope.scwin.refreshCount();
								// 업무대기함 이동
								com.movePageMenu("A004", { sideYn : "Y"});
								// MDI 탭 색상 변경
								gcm.util.changeTabColor();
								// 활성 탭 타이틀 설정
								var selectedTab = document.querySelectorAll('.w2windowContainer_nameLayer.w2windowContainer_selectedNameLayer');
								if(selectedTab.length > 0){
									selectedTab[0].textContent;
									document.title = selectedTab[0].textContent + " : KITECH EIP3.0 전자결재"	
								}
							}
						}
					}
                    if (e.data && e.data.menuData) {
	                    // e.data 전달받은 메시지
	                    debugger;
	                    console.log(e.data);

                    	var menu = e.data.menuData;
                    	var data = e.data.userData;
                    	if (menu.to && 'common' == menu.to) {
                    		if (data && data.methodName) {
                    			// biz 2.0 데이터 연계
                				const index = $p.top().wdc_layout.windows.findIndex(function( win) {
                				    return e.data.menuData.serviceID == win.windowId;
                				});
                				if (0 > index) return;

               					$p.top().wdc_layout.setFocus(index);
               					let mdiframe = $p.top().wdc_layout.getFrame($p.top().wdc_layout.getSelectedWindowId());
               					try {
               						var fnName = data.methodName.indexOf("scwin") < 0 ? 
           										data.methodName :
           										data.methodName.split("scwin.")[1];
               						if (mdiframe['scope'].wfForm) {
               							mdiframe['scope']['wfForm'].getWindow()['scwin'][fnName](data.methodParam);
               						} else {
               							mdiframe['scope']['scwin'][fnName](data.methodParam);
               						}
               							
               							
               					} catch(e) {
               						alert("호출실패!!" + e);
               					}
                    		} else {
	                    		// 업무 페이지 새탭 오픈
	                    		com.openTabMenu(menu.serviceID, data);
                    		}
                    	} else {
	                    	$('.side .menu .mClick').removeClass("mClick");
		                    switch(menu.serviceID) {
		                    	case "A002": mf_wfm_side_btn_aprdoc.getParent().addClass("mClick"); break;			// 신청서 양식함
		                    	case "A003": mf_wfm_side_btn_aprWait.getParent().addClass("mClick"); break;			// 결재 대기함
		                    	case "A004": mf_wfm_side_btn_workWait.getParent().addClass("mClick"); break;		// 업무 대기함
		                    	case "A005": mf_wfm_side_btn_aprRunnig.getParent().addClass("mClick"); break;		// 결재/업무 진행함
		                    	case "A006": mf_wfm_side_btn_aprComplet.getParent().addClass("mClick"); break;		// 결재/업무 완료함
		                    	case "A010": mf_wfm_side_btn_saved.getParent().addClass("mClick"); break;			// 작성중 문서함
		                    	default:	// 메뉴 핸들링 필요 없는 이동
		                    }
 
		                    // 전자결재 탭이 떠 있는지 여부에 따른 분기 필요.
 							if ("A001" == menu.serviceID) {
								// 기존 스냅샷이 있으면 이동
 								com.movePageMenu(menu.serviceID, data);
							} else {
								// 전자결재 메뉴가 모두 닫혀있는 상태에서는 새창으로 오픈
								var menuObj = gcm.win.getMenuObj(menu.serviceID);
								com.openMenu(menuObj, data);
							}
                    	}
                    }
	            });	

                // rMateChart 데이터 에디터 사용 설정
                if (rMateChartH5) {
	                rMateChartH5.dataEditorUrl = "/cm/ext/rMateChart/rMateChartH5/JS/editablegrid-2.0.1.js";
	                // 시각 장애인을 위한 패턴 적용 url 
	                rMateChartH5.patternImageBaseUrl = "/cm/ext/rMateChart/rMateChartH5/Assets/Patterns/";
                }
			};
		</script>
	</head>
	<body>
	</body>
</html>