<%@page language="java" contentType="text/html;charset=MS949"
%><!DOCTYPE html>
<html>
	<head>
		<title>사용권한 제한</title>
		
		<style>
			* { margin:0; padding:0; }
			body {
				background:#e5e5e5; position:relative; color:#3d3d3d;
				font-family: "Apple SD Gothic Neo", "Malgun Gothic", Sans-Serif;
				position:relative;
			}
			img { border:0 }
			li { list-style:none }
			.clear { clear:both }

			.sys_wrap {
				position:absolute; width:840px; min-height:300px;
				left:50%; margin-left:-420px; margin-top:100px;
				border:1px solid #d4d4d4; background:#fff;
				-webkit-box-shadow:0 0 30px rgba(0, 0, 0, 0.3);
				box-shadow:0 0 30px rgba(0, 0, 0, 0.3);
			}
			.sys_wrap h1 {
				height:100px; line-height:100px; background:#3178bb; font-weight:normal;
				font-size:26px; color:#fff; text-indent:50px;
			}
			dl { margin:40px 50px 0; }
			dl dt {
				min-height:27px; padding:4px 0 27px; border-bottom:1px solid #e5e5e5;
				font-weight:bold; font-size:18px; color:#003b8c;
			}
			dl dd { min-height:200px;}
			.bottom { height:64px; line-height:70px; border-top:1px solid #e5e5e5; text-indent:50px }

			/* 관련정보내용 나오는 곳 */
			.info { clear:both; width:600px; padding-top:30px; padding-bottom:40px; }
			.info:after {clear:both; content: ""; display: block;}
			.info li { overflow:hidden; clear:both; padding-bottom:13px; font-size:14px }
			.info li p { float:left; }

			/* 관련정보내용 나오는 곳 - 원인 및 해결책 내용이 없으면 꼭 이 클래스를 넣어줌 */
			.space { display:table-cell; vertical-align:middle }

			/* 기타 */
			.etc { clear:both; width:600px; padding-top:30px; padding-bottom:40px }
			.etc:after {clear:both; content: ""; display: block;}
			.etc li { overflow:hidden; clear:both; padding-bottom:10px; font-size:12.5px; }
			.etc p { float:left; }

			/* 내용 하단 여백 없을 때  */
			.bot_n { padding-bottom:0 !important }

			/* 폰트속성  */
			.bold { font-weight:bold; }
			.font1 { line-height:1; font-size:16px; color:#3d3d3d; font-weight:bold }
			p.arrow { float:left; padding-right:8px; }
			/* 들여쓰기  */
			p.arrow_s { float:left; padding-left:10px; }
			p.txt { float:left; line-height:1.5 }
			p.txt2 { float:left; line-height:1.5 }
			p.txt3 { float:left; line-height:1.5 }
			p.txt4 { float:left; line-height:1.5 }

			/* 아이콘모양 */
			.arrow1 { float:left; color:#3178bb; padding-right:5px }
			.arrow1_2 { float:left; width:140px; color:#3178bb }
			.arrow2 {
				float:left; margin-top:2px; width:17px; height:17px; line-height:17px; border-radius:17px;
				-moz-border-radius:17px; -webkit-border-radius:17px;
				background:#3178bb; color:#fff; font-weight:bold; font-size:10px; font-family:"굴림"; text-align:center }
			.arrow3 { float:left; margin-top:2px; width:17px; height:17px; line-height:17px; border-radius:3px; -moz-border-radius:3px; -webkit-border-radius:3px; background:#3178bb; color:#fff; font-weight:bold; font-size:10px; font-family:"굴림"; text-align:center }

			/* 버튼 */
			.btn1 { display:block; width:200px; height:40px; margin:0 auto; line-height:40px; border:1px solid #3178bb; color:#3178bb; font-weight:bold; font-size:18px; text-decoration:none; text-align:center; #eaeaea; box-shadow:0 2px 0 rgba(0, 0, 0, 0.1); -webkit-box-shadow:0 2px 0 rgba(0, 0, 0, 0.1); }

			/* 빨간색일때 */
			.red h1 { background:#d84938 !important; }
			.red dl dt { color:#d84938 !important; }
			.red .arrow1 { color:#d84938 !important; }
			.red .arrow1_2 { color:#d84938 !important; }
			.red .arrow2 { background:#d84938 !important; }
			.red .arrow3 { background:#d84938 !important; }
			.red .btn1 { border:1px solid #d84938 !important; color:#d84938 !important;  }

			/* 녹색일때 */
			.green h1 { background:#0fa400 !important; }
			.green dl dt { color:#0fa400 !important; }
			.green .arrow1 { color:#0fa400 !important; }
			.green .arrow1_2 { color:#0fa400 !important; }
			.green .arrow2 { background:#0fa400 !important; }
			.green .arrow3 { background:#0fa400 !important; }
			.green .btn1 { border:1px solid #0fa400 !important; color:#0fa400 !important;  }
		</style>
	</head>
	<body>
		<div class="sys_wrap green">
			<h1>사용권한 제한</h1>
			<dl>
				<dt>해당 화면에 대한 사용 권한이 없습니다.</dt>
				<dd>
					<div class="info">
						<ul>
							<li>
								<p class="arrow">
									<span class="arrow1">&bull;</span>
									<span style="font-weight:bold">원&nbsp;&nbsp;&nbsp;인</span>
								</p>
								<div>로그인 세션 만료 또는 로그인 정보 손실</div>
							</li>
							<li>
								<p class="arrow">
									<span class="arrow1">&bull;</span>
									<span style="font-weight:bold">해결책</span>
								</p>
								<div>브라우저 종료 후 새로 로그인</div>
							</li>
						</ul>
					</div>
					<div class="etc">
						<ul>
							<li>
								<p class="arrow"><span class="arrow2">&gt;</span></p>
								<p class="txt3 bold">기타 문의는 시스템문의(업무포털 우측 상단)로 작성하여 제출해 주시기 바랍니다.</p>
							</li>
						</ul>
					</div>
				</dd>
			</dl>
			<p class="bottom">
				<image alt="EIP3 한국생산기술연구원 종합정보시스템" src="/kitech/images/kitech_logo.jpg" />
			</p>
		</div>
	</body>
</html>
