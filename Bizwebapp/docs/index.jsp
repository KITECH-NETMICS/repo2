<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="com.inswave.elfw.log.AppLog"%>
<%@ page import="com.inswave.elfw.util.ElBeanUtils"%>
<%@ page import="com.inswave.elfw.view.ElMappingJacksonObjectMapper"%>
<%@ page import="kr.re.kitech.biz.xom.base.model.BizUserHeader"%>
<%@ page import="kr.re.kitech.biz.xom.base.model.SessionUserHeader"%>
<%
	/**
	 * welcome 페이지 접근 시 세션 유무에 따라 초기 화면과 로그인 화면  분기 처리
	 */
	BizUserHeader userHeader = (BizUserHeader) session.getAttribute("userHeader");
	AppLog.debug("welcome page BizUserHeader: " + userHeader);

	String w2xPath = "/cm/layout/index.xml";
	String sessions = "{}";
	if (null != userHeader && null != userHeader.getSession()) {
		ElMappingJacksonObjectMapper mapper = (ElMappingJacksonObjectMapper) ElBeanUtils.getBean("jsonMapper");
		sessions = mapper.writeValueAsString(userHeader.getSession());

		System.out.println(sessions);
	} else {
		response.sendRedirect("http://neip.kitech.re.kr");
	}

	// String w2xPath = userHeader.getSession().getRedirectUrl();
%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"></meta>
		<link rel="shortcut icon" href="/cm/images/favicon.ico" />
		<title>KITECH EIP3.0 전자결재</title>
		<script type="text/javascript">
			var WebSquareExternal = {
				"baseURI": "/websquare/", 
				"w2xPath" : "<%=w2xPath%>"
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
					WebSquare.startApplication(WebSquareExternal.w2xPath);
					gcm.data.setLoginInfo(<%= sessions %>);

					// 헤더 정보 설정
					if ($p.top().wfm_header) {
						$p.top().wfm_header.getWindow().btn_userNm.setValue(com.getLoginInfo('cn'));
					}
					
					// 나의메뉴 조회
					if ($p.top().wfm_side) {
						$p.top().wfm_side.getWindow().scwin.searchMyMenu();
					}
				} catch(e) {
					alert(e.message);
				}
				// BIZ2 스냅샷 전환용 메소드 추가
				window.addEventListener('message', function(e){
                    if (e.data) {
	                    // e.data 전달받은 메시지
	                    console.log(e.data);
	                    com.openMenu(e.data.menuData, e.data.userData);
                    }
	            });		
				
                // rMateChart 데이터 에디터 사용 설정
                rMateChartH5.dataEditorUrl = "/cm/ext/rMateChart/rMateChartH5/JS/editablegrid-2.0.1.js";
                // 시각 장애인을 위한 패턴 적용 url 
                rMateChartH5.patternImageBaseUrl = "/cm/ext/rMateChart/rMateChartH5/Assets/Patterns/";
			};
			
			window.addEventListener('message', function(e) {
				if (e.data) {
					// e.data 전달받은 메시지
					console.log(e.data);
					com.openMenu(e.data.menuData, e.data.userData);
				}
			});
		</script>

	</head>
	<body>
	</body>
</html>