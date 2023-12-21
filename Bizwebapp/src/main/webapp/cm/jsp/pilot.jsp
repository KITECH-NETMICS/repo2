<%@page import="com.inswave.elfw.core.ControllerInvocationContext"%>
<%@ page contentType="text/html;charset=utf-8" pageEncoding="UTF8"%>
<%@page import="com.inswave.elfw.core.UserHeader"%>
<%@page import="kr.re.kitech.biz.xom.base.model.BizUserHeader"%>
<%@page import="com.inswave.elfw.util.ControllerContextUtil"%>
<%@page import="kr.re.kitech.biz.xom.core.util.KitechContextUtil"%><%

	// String syspayno = KitechContextUtil.getSyspayno();
	UserHeader userHeader = ControllerContextUtil.getUserHeader();
	BizUserHeader bizUserHeader = userHeader;
	if( userHeader instanceof BizUserHeader ) {  // 로그인 세션이 있는 경우 
	      bizUserHeader = (BizUserHeader)userHeader ;
	}
	// ControllerContextUtil.setUserHeader(session.getAttribute("userHeader"));
	
	// session.getAttribute("userHeader");
	out.print("<html><body><div style='width:50%;display:inline-block;'>");
	
	out.print("<h1>"+ userHeader +"</h1>");
	out.print("<h1>"+ bizUserHeader +"</h1>");
	out.print("<h1>"+ session.getAttribute("userHeader") +"</h1>");
	
	out.print("</div></body></html>");
	ControllerInvocationContext.setCurrent( new ControllerInvocationContext());
	
	ControllerInvocationContext.getCurrent()

%>
