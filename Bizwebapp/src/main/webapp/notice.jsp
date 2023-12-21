<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="com.inswave.elfw.log.AppLog"%>
<%@ page import="kr.re.kitech.biz.api.client.vo.NoticeResult"%><%

	NoticeResult result = (NoticeResult)request.getAttribute("noticeResult");
	AppLog.info("result \n" + result);

%><!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>EIP3 업무/결재 서비스 접근 제한 안내 </title>
		<meta http-equiv="X-UA-Compatible" content="IE=Edge" />
		<link rel="shortcut icon" href="/cm/images/favicon.ico" />
		<link rel="stylesheet" href="/cm/css/notice.css" />
	</head>
	<body>
		<div class="sys_wrap green">
			<h1>EIP3 업무/결재 시스템 작업 안내</h1>
			<dl>
				<dt>
					<%= result.getNotice() %>
				</dt>
				<dd>
					<div class="info bot_n">
						<ul>
							<li>
								<p class="arrow"><span class="arrow3">&gt;</span></p>
								<p class="txt">
									<span class="font1">
										작업내용 : <%= result.getSubject() %>
									</span>
								</p>
							</li>
							<li>
								<p class="arrow"><span class="arrow3">&gt;</span></p>
								<p class="txt">
									<span class="font1">
										작업일정 : <%= result.getStartDate() %> ~ <%= result.getCloseDate() %>
									</span>
								</p>
							</li>
							<li>
								<p class="arrow"><span class="arrow3">&gt;</span></p>
								<p class="txt">
									<span class="font1">
										중단시스템  :  <%= result.getBlockServices() %>
									</span>
								</p>
							</li>
							<li>
								<p class="arrow"><span class="arrow3">&gt;</span></p>
								<p class="txt">
									<span class="font1">
										메일 등 그 외 시스템은 통합로그인페이지(auth.kitech.re.kr)에서 접속/사용 가능
									</span>
								</p>
							</li>
						</ul>
					</div>
					<div class="info">
						<ul>
							<li>
								<p class="arrow_s"><span class="arrow1">&bull;</span></p>
								<p class="txt">
									서비스 중단 시간은 작업 상황에 따라 변경될 수 있습니다. 변경사항은 본 안내페이지를 통해 안내 예정입니다.
							</li>
						</ul>
					</div>
				</dd>
			</dl>
			<p class="bottom"><img src="/cm/images/logo.png" alt="EIP3 한국생산기술연구원 종합정보시스템"></p>
		</div>
	</body>
</html>
