<%@page import="com.inswave.elfw.log.AppLog"%>
<%@ page contentType="text/html; charset=UTF-8" import="
	com.ksign.access.api.SSORspData,
	com.ksign.access.api.SSOService,
	java.util.Enumeration,
	javax.servlet.RequestDispatcher"
%><%
	
	String uidStr = (null != session.getAttribute("UID") ? (String)session.getAttribute("UID") : "");
	String cnStr = (null != session.getAttribute("CN") ? (String)session.getAttribute("CN") : "");
	String snStr = (null != session.getAttribute("SN") ? (String)session.getAttribute("SN") : "");

	AppLog.debug("UID: " + uidStr);
	if ("mklee".equals(uidStr)){
		AppLog.debug("========================================================");
		AppLog.debug("UID: " + uidStr);
		AppLog.debug("CN: " + cnStr);
		AppLog.debug("SN: " + snStr);
	}
		
		
	Enumeration<String> em = request.getParameterNames();
	String serviceid = null;
	StringBuffer params = new StringBuffer();
	while (em.hasMoreElements()){
		String key = em.nextElement();
		String value = request.getParameter(key);
		
		if ("mklee".equals(uidStr)){
			AppLog.debug("key: " + key + ", value: " + value);
		}
		if ("serviceid".equals(key)) {
			serviceid = value;
		} else {
			params.append("&" + key + "=" + java.net.URLEncoder.encode(value, "UTF-8"));
		}
	}
	/*
	if ("mklee".equals(uidStr)){
		AppLog.debug("========================================================");
	}*/
	
	

	SSORspData rspData = SSOService.getInstance().ssoGetLoginData(request);
	if ("mklee".equals(uidStr)){
		AppLog.debug("========================================================");
		AppLog.debug("rspData: " + rspData);
		AppLog.debug("========================================================");
	}
	
	if (serviceid == null || serviceid.equals("") || serviceid.equals("null")) {
		response.sendRedirect("/cm/jsp/forbidden.jsp");
	} else {
		RequestDispatcher rd = request.getRequestDispatcher("/cm/jsp/filter.jsp?serviceid=" + serviceid + params.toString());
		rd.forward(request, response);
	}
%>