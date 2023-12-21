
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.net.InetAddress" %>
<%@ page import="java.util.*" %>
<%@ page import="kr.re.kitech.biz.xom.base.log.BizAccessLog" %>
<%
	BizAccessLog.write(String.format("\t%s\t%s\t%s\t%s\t%s"
		, request.getRemoteHost()
		, request.getRequestedSessionId()
		, request.getRequestURI()
		, ""
		, ""
	));
%>
<html>
<body>
<h3>■ local의 기본 정보 (IP, Name, Port)</h3>
<ul>
<li>Local IP : <%=request.getLocalAddr()%></li>
<li>Local Name : <%=request.getLocalName()%></li>
<li>Local Port : <%=request.getLocalPort()%></li>
</ul>

<h3>■ 클라이언트의 정보</h3>
<ul>
<li>Remote IP : <%=request.getRemoteAddr()%></li>
<li>Remote Host : <%=request.getRemoteHost()%></li>
<li>Remote Port : <%=request.getRemotePort()%></li>
</ul>

<h3>■ 서버 이름과 포트 (일반적으로 local 기본정보와 동일)</h3>
<ul>
<li>Server Name : <%=request.getServerName()%></li> (<%=InetAddress.getLocalHost().getHostAddress()%></li>)
<li>Server Port : <%=request.getServerPort()%></li>
</ul>

<h3>■ 지역 정보 (대부분 한국을 의미하는 ko가 나옴)</h3>
<ul>
<li>Locale : <%=request.getLocale()%></li>
</ul>

<h3>■ 사용하는 프로토콜 ("프로토콜/메이저버전.마이너버전" 의 형태)</h3>
<ul>
<li>Protocol : <%=request.getProtocol()%></li>
</ul>

<h3>■ http, https, ftp와 같은 것을 의미</h3>
<ul>
Scheme : <%=request.getScheme()%></li>
</ul>

<h3>■ https와 같은 보안 채널의 사용 여부 (true/false 값으로 되어 있음)</h3>
<ul>
Secure Channel : <%=request.isSecure()%></li>
</ul>

<h3>■ 요청에 대한 URI, URL, 컨텍스트 경로, 서블릿 경로, GET/POST등의 메소드</h3>
<ul>
Request's URI : <%=request.getRequestURI()%></li>
Request's URL : <%=request.getRequestURL()%></li>
Context Path : <%=request.getContextPath()%></li>
Servlet Path : <%=request.getServletPath()%></li>
Method : <%=request.getMethod()%></li>
</ul>

<h3>■ 세션 ID에 대한 정보</h3>
<ul>
Session ID : <%=request.getRequestedSessionId()%></li>
Session ID from Cookie : <%=request.isRequestedSessionIdFromCookie()%></li>
Session ID from URL : <%=request.isRequestedSessionIdFromURL()%></li>
Session ID is still valid : <%=request.isRequestedSessionIdValid()%></li>
</ul>
<ul>
<h3>■ Header 정보</h3>
<%
Enumeration eHeader = request.getHeaderNames();
while (eHeader.hasMoreElements()) {
    String hName = (String)eHeader.nextElement();
    String hValue = request.getHeader(hName);
    out.println(hName + " : " + hValue + "");
}
%>
</ul>

<h3>■ Request 객체를 통해서 쿠키 정보를 보는 방식</h3>
<ul>
<%
Cookie cookies[] = request.getCookies();
for (int i=0; i < cookies.length; i++) {
    String name = cookies[i].getName();
    String value = cookies[i].getValue();
    out.println(name + " : " + value + "");
}
%>
</ul>
</body>
</html>

