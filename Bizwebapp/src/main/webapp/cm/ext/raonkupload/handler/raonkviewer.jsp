<%@page import="egovframework.rte.ptl.mvc.filter.HTMLTagFilterRequestWrapper"%>
<%@page import="org.springframework.web.multipart.MultipartFile"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.springframework.web.multipart.MultipartHttpServletRequest"%>
<%@ page contentType="text/html;charset=utf-8" pageEncoding="UTF8" import="
	  com.raonwiz.kupload.RAONKHandler
"%><%
	
	/**
	 *  2022-03-02, James, 라온Kupload 이미지 뷰어 핸들러
	 */
	out.clear();
	request.setCharacterEncoding("UTF-8");
	RAONKHandler upload = new RAONKHandler();
	upload.settingVo.setDebugMode(true, "L");	// debug 모드 log4j
	
// 	HTMLTagFilterRequestWrapper tagFilterRequest = (HTMLTagFilterRequestWrapper) request;		
// 	System.out.println("request: " + tagFilterRequest.getParameter("k00"));

//     Iterator<String> iter = multiPartRequest.getFileNames();
// 	if(!iter.hasNext()) {
// 		throw new RuntimeException("파일 업로드 오류!!");
// 	}
        
//     String uploadFileName = iter.next();
//     MultipartFile mfile = (MultipartFile) multiPartRequest.getFile(uploadFileName);
    
	
// 	System.out.println("request: " + mfile);

	String result = upload.Viewer(request, response);
    if(null != result && !result.equals("")) {
		out.print(result.replace("<title>RAONK Viewer</title>", "<title>KITECH Image Viewer</title>"));
	}
%>