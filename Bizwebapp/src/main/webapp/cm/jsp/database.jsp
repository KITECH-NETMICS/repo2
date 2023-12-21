<%@page import="kr.re.kitech.biz.xom.base.model.BizUserHeader"%>
<%@ page contentType="text/html;charset=utf-8" pageEncoding="UTF8"%>
<%@page import="com.inswave.elfw.core.UserHeader"%>
<%@page import="com.inswave.elfw.util.ControllerContextUtil"%>
<%@page import="kr.re.kitech.biz.xom.core.util.KitechContextUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.naming.NamingException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.naming.Context"%><%

	// String syspayno = KitechContextUtil.getSyspayno();
	UserHeader userHeader = ControllerContextUtil.getUserHeader();
	BizUserHeader bizUserHeader = userHeader;
	if( userHeader instanceof BizUserHeader ) {  // 로그인 세션이 있는 경우 
	      bizUserHeader = (BizUserHeader)userHeader ;
	}
	ControllerContextUtil.setUserHeader(session.getAttribute("userHeader"));
	
	// session.getAttribute("userHeader");
	out.print("<html><body><h1>"+ bizUserHeader +"</h1><div style='width:33%;display:inline-block;'>");

	Context ctx = null;
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;

	try {
		ctx = new InitialContext();
		DataSource mmsDS = (DataSource) ctx.lookup("mms/kitech");

		con = mmsDS.getConnection();
		stmt = con.createStatement();		
		rs = stmt.executeQuery("SELECT DEST_PHONE as ename, DEST_NAME as empno, REQUEST_TIME as job FROM BIZ_MSG LIMIT 0, 10");
		
		
		//PrintWriter out = response.getWriter();
	    response.setContentType("text/html");
	    out.print("<h2>MySQL</h2>");
	    out.print("<table border=\"1\" cellspacing=10 cellpadding=5 >");
	    out.print("<th>Employee ID</th>");
	    out.print("<th>Employee Name</th>");
	    
	    while(rs.next()){
	        out.print("<tr>");
	        out.print("<td>" + rs.getString("empno") + "</td>");
	        out.print("<td>" + rs.getString("ename") + "</td>");
	        out.print("</tr>");
	    }
	    out.print("</table></body><br/>");
	    
	    //lets print some DB information
	    out.print("<h3>Database Details</h3>");
	    out.print("Database Product: "+con.getMetaData().getDatabaseProductName()+"<br/>");
	    out.print("Database Driver: "+con.getMetaData().getDriverName());

	}catch(NamingException e){
		System.err.println(e);
		throw e;
	} catch (SQLException e) {
		System.err.println(e);
		throw e;
	} catch (Exception e) {
		System.err.println(e);		
		throw e;
	}finally{

		try {
			if (null != rs) rs.close();
			if (null != stmt) stmt.close();
			if (null != con) con.close();
			if (null != ctx) ctx.close();
		} catch (Exception e) {
			out.print("<h2>Exception in closing DB resources</h2></div>");
		}
		out.print("</div>");		
	}

	out.print("<div style='width:33%;display:inline-block;'>");
	try {
		ctx = new InitialContext();
		DataSource imisDS = (DataSource) ctx.lookup("imis/kitech");

		con = imisDS.getConnection();
		stmt = con.createStatement();
		rs = stmt.executeQuery("select FIRST 10 empno, ename from emp");
		
		//PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<h2>Informix</h2>");
		out.print("<table border=\"1\" cellspacing=10 cellpadding=5 style=\"display:inline-block;\">");
		out.print("<th>Employee ID</th>");
		out.print("<th>Employee Name</th>");
		
		while(rs.next()){
			out.print("<tr>");
			out.print("<td>" + rs.getString("empno") + "</td>");
			out.print("<td>" + rs.getString("ename") + "</td>");
			out.print("</tr>");
		}
		out.print("</table></body><br/>");
		
		//lets print some DB information
		out.print("<h3>Database Details</h3>");
		out.print("Database Product: "+con.getMetaData().getDatabaseProductName()+"<br/>");
		out.print("Database Driver: "+con.getMetaData().getDriverName());

	}catch(NamingException e){
		System.err.println(e);
		throw e;
	} catch (SQLException e) {
		System.err.println(e);
		throw e;
	} catch (Exception e) {
		System.err.println(e);		
		throw e;
	}finally{

		try {
			if (null != rs) rs.close();
			if (null != stmt) stmt.close();
			if (null != con) con.close();
			if (null != ctx) ctx.close();
		} catch (Exception e) {
			out.print("<h2>Exception in closing DB resources</h2>");
		}
		out.print("</div>");		
	}

	out.print("<div style='width:33%;display:inline-block;'>");
	try {
		ctx = new InitialContext();
		DataSource proworksDS = (DataSource) ctx.lookup("proworksDS");

		con = proworksDS.getConnection();
		stmt = con.createStatement();
		rs = stmt.executeQuery("select FIRST 10 sys_key as empno, sys_sub as empnm FROM el_sys_prop");
		
		//PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<h2>Informix</h2>");
		out.print("<table border=\"1\" cellspacing=10 cellpadding=5 style=\"display:inline-block;\">");
		out.print("<th>Employee ID</th>");
		out.print("<th>Employee Name</th>");
		
		while(rs.next()){
			out.print("<tr>");
			out.print("<td>" + rs.getString("empno") + "</td>");
			out.print("<td>" + rs.getString("ename") + "</td>");
			out.print("</tr>");
		}
		out.print("</table></body><br/>");
		
		//lets print some DB information
		out.print("<h3>Database Details</h3>");
		out.print("Database Product: "+con.getMetaData().getDatabaseProductName()+"<br/>");
		out.print("Database Driver: "+con.getMetaData().getDriverName());

	}catch(NamingException e){
		System.err.println(e);
		throw e;
	} catch (SQLException e) {
		System.err.println(e);
		throw e;
	} catch (Exception e) {
		System.err.println(e);		
		throw e;
	}finally{

		try {
			if (null != rs) rs.close();
			if (null != stmt) stmt.close();
			if (null != con) con.close();
			if (null != ctx) ctx.close();
		} catch (Exception e) {
			out.print("<h2>Exception in closing DB resources</h2>");
		}
		out.print("</div></body></html>");		
	}	
%>
