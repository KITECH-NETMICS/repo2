package com.inswave.elfw.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getConnection( String dataSourceName ) {
		System.out.println("Junit Test > DBUtil - dataSourceName:" + dataSourceName);
		if( "java:/comp/env/proworksDS".equals(dataSourceName)) {
			return getConnectionCore();
		} else if( "java:/comp/env/mmsDS".equals(dataSourceName)) {
			return getConnectionMms();
		} else if( "java:/comp/env/trpDS".equals(dataSourceName)) {
			return getConnectionTrp();
		} else {
			return getConnectionWork();
		}
	}

	private static Connection getConnectionCore() {
		Connection conn = null;
		try {
			String driverClass = "com.informix.jdbc.IfxDriver";
			String url = "jdbc:informix-sqli://10.250.104.15:8015/pks:INFORMIXSERVER=imisnet;newlocale=ko_kr,en_us;newcodeset=ksc5601,8859-1,819";
			String username = "proworks";
			String password = "proworks";
			
			System.out.println("Core - url:" + url);
			
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, username, password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	
	private static Connection getConnectionMms() {
		Connection conn = null;
		try {
			String driverClass = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://203.250.104.51:3306/neipmms";
			String username = "neipmms";
			String password = "password";
			
			System.out.println("MMS - url:" + url);
			
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, username, password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
			
	private static Connection getConnectionTrp() {
		Connection conn = null;
		try {
			String driverClass = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://203.250.108.56:3306/epapyrus";
			String username = "epapyrus";
			String password = "epapyrus12#$";
			
			System.out.println("TRIP - url:" + url);
			
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, username, password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}	

	private static Connection getConnectionWork() {
		Connection conn = null;
		try {
			String driverClass = "com.informix.jdbc.IfxDriver";
			String url = "jdbc:informix-sqli://10.250.104.15:8015/imis:INFORMIXSERVER=imisnet;newlocale=ko_kr,en_us;newcodeset=ksc5601,8859-1,819";
			String username = "imis";
			String password = "imis";
			
			System.out.println("Work - url:" + url);
			
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, username, password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
