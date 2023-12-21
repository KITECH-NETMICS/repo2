<%@ page contentType="text/html; charset=UTF-8" import="java.util.HashSet" %>
<%
	boolean isMaintenanceMode = true; // 그랜드 오픈 전 true, 통상운영 모드면 false

	if (isMaintenanceMode) {
		HashSet<String> staffs = new HashSet<String>();

		// 로그인 화면을 예외적으로 허용할 최소한의 점검인원 접속용 IP-Address 지정
		staffs.add("10.250.140.115");	// 김기탁
		staffs.add("10.250.140.242");	// 이민기
		staffs.add("10.250.140.222");	// 이민기
		staffs.add("10.30.0.61");		// 이민기
		staffs.add("10.250.140.221");	// 배소연
		staffs.add("10.250.140.202");	// 박종미
		staffs.add("10.250.140.201");	// 이윤민
		staffs.add("10.250.140.200");	// 조현래
		staffs.add("10.250.140.203");	// 송슬아
		
		// 업무담당자
		staffs.add("10.250.111.167");	// 안건호	
		staffs.add("10.250.112.101");	// 구본준
		staffs.add("10.250.112.135");	// 황미진
		staffs.add("10.250.111.221");	// 배진희
		staffs.add("10.250.111.141");	// 최지영	
		staffs.add("10.250.112.130");	// 김지혜
		staffs.add("10.250.111.202");	// 권정은		
		staffs.add("10.250.111.73");	// 박현주
		

		staffs.add("10.250.109.96");	// 김진태
		staffs.add("10.250.109.114");	// 이대훈
		staffs.add("10.250.109.106");	// 전재우		
		staffs.add("10.250.109.105");	// 안화용		
	  	staffs.add("10.250.109.102");	// 김주열
	  	staffs.add("10.250.109.122");	// 구교원
	  	staffs.add("10.250.109.104"); 	// 이재춘
		//staffs.add("10.250.109.107"); 	// 박정일

		//staffs.add("10.250.140.215"); // 서연우
		//staffs.add("10.250.109.122"); // 진소영
		//staffs.add("10.250.109.104"); // 김남호

		staffs.add("10.250.109.70"); // 외부업체테스트
		staffs.add("10.250.109.71"); // 외부업체테스트

		staffs.add("10.250.112.140"); //RPA BOT1
		staffs.add("10.250.112.143"); //RPA BOT2
		staffs.add("10.250.112.144"); //RPA MONITOR
		
		staffs.add("222.108.214.40"); // EIP3.0 회의실 노트북 추가
		staffs.add("10.250.104.112"); // 전자연구노트 VPN 주소 추가

		String ip = request.getRemoteAddr();
		
		System.out.println("Remote Address: " + ip);
		//if (!staffs.contains(ip) && !ip.equals("127.0.0.1")) {
		if (!staffs.contains(ip) && !ip.startsWith("172.30.120") && !ip.equals("127.0.0.1")) {
			// 일반 사용자는 준비된 공지안내 페이지로 강제이동
			// response.sendRedirect("/cm/html/notice.html");
			
			out.println("<script>location.href='/notice.html';</script>");

			return; // 강제이동 이후에는 불필요한 화면출력을 막기 위해 실행중단
		}
	}
%>
