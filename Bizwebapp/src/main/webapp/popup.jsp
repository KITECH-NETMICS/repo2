<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" import="
  java.util.Enumeration
, java.util.Base64
, org.apache.commons.lang3.StringUtils
, com.inswave.elfw.log.AppLog
, com.inswave.elfw.util.ElBeanUtils
, com.inswave.elfw.view.ElMappingJacksonObjectMapper
, kr.re.kitech.biz.xom.base.model.BizUserHeader
, kr.re.kitech.biz.xom.base.model.SessionUserHeader
, kr.re.kitech.biz.xom.core.ext.BaseUrlProperty"%><%!


%><%

	/**
	 * 팝업페이지의 세션 및 baseURL 전역데이터 설정 및 WebSqquer 렌더링
	 */
	BizUserHeader userHeader = (BizUserHeader) session.getAttribute("userHeader");
	AppLog.debug("popup page BizUserHeader: " + userHeader);
	if (null == userHeader || null ==  userHeader.getSession()) {
		response.sendRedirect(BaseUrlProperty.ssoPxyUrl);
	}

	ElMappingJacksonObjectMapper mapper = (ElMappingJacksonObjectMapper) ElBeanUtils.getBean("jsonMapper");
	String sessions = mapper.writeValueAsString(userHeader.getSession());	
	String baseUrls = BaseUrlProperty.getUrls();

	// 파라미터로 w2xPath 또는 서비스 ID를 받아서 실제 포워딩할 URL 을 가져온다.
	String w2xPath = request.getParameter("w2xPath");
	AppLog.debug("====================================================================");
	AppLog.debug("w2xPath=[" + w2xPath + "]");
	AppLog.debug("sessions=[" + sessions + "]");
	AppLog.debug("====================================================================");	

%><!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge" />
		<link rel="shortcut icon" href="/cm/images/favicon.ico" />
		<title> </title>
		<style type="text/css">
			@-ms-viewport {zoom:1; width:100vw}
			@-o-viewport {zoom:1; width:100vw}
			@viewport {zoom:1; width:100vw;}
		</style>		
		<script type="text/javascript">
			var WebSquareExternal = {
				"baseURI": "/websquare/", 
				"w2xPath": "<%= w2xPath %>"
			};
		</script>
		<!-- polaris 에디터 -->
		<script type="text/javascript" src="/javascript.wq?q=/bootloader"></script>
		<script type="text/javascript" language="javascript">
			window.onload = function() {
				try {
					gcm.data.setLoginInfo(<%= sessions %>);
					gcm.baseUrls = <%= baseUrls %>;
					WebSquare.startApplication(WebSquareExternal.w2xPath);
				} catch(e) {
					alert(e.message);
				}
			};
		</script>
	</head>
	<body>
	</body>
</html>