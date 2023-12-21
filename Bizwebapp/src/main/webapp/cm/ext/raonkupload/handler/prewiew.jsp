<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder"%>
<%
	String fid = request.getParameter("fid");
	String filePath = request.getParameter("filePath");
	
	String converType = "0";
	String fileType = "URL";
	String encodedUrl = URLEncoder.encode(filePath, "UTF-8");
	
	String requestUrl = "https://doc.kitech.re.kr/SynapDocViewServer/job?fid=" + fid // Server Address Setting
                   + "&filePath=" + encodedUrl + "&convertType=" + convertType
                   + "&fileType=" + fileType;
	response.sendRedirect(requestUrl);
%>