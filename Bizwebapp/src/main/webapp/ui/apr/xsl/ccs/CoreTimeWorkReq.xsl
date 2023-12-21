<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<body>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">신청자 정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="20%" class="title2">성명</td>
									<td width="30%" class="contant">
										<xsl:value-of select="msgCwsCoreTime/req_nm" />
									</td>
									<td width="20%" class="title2">신청번호</td>
									<td width="30%" class="contant">
										<xsl:value-of select="msgCwsCoreTime/req_no" />
									</td>
								</tr>									
								<tr>
									<td class="title2">부서/본부</td>
									<td class="contant">
										<xsl:value-of select="msgCwsCoreTime/dept_nm" />/<xsl:value-of select="msgCwsCoreTime/divsn_nm" />
									</td>
									<td class="title2">직급</td>
									<td class="contant">
										<xsl:value-of select="msgCwsCoreTime/posi_nm" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">신청유형 정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="20%" class="title2">실시본부</td>
									<td width="80%" class="contant" colspan="3"><xsl:value-of select="msgCwsCoreTime/divsn_nm" /></td>
								</tr>
								<tr>
									<td width="20%" class="title2">신청제도</td>
									<td width="80%" class="contant" colspan="3">집중근무시간제</td>
								</tr>
								<tr>
									<td width="20%" class="title2">신청유형</td>
									<td width="30%" class="contant"><xsl:value-of select="msgCwsCoreTime/work_name" /></td>
									<td width="20%" class="title2">집중근무시간</td>
									<td width="30%" class="contant"><xsl:value-of select="msgCwsCoreTime/work_desc" /></td>									
								</tr>								
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">기타 정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="20%" class="title2">비 고</td>
									<td width="80%" class="contant">
										<xsl:value-of select="msgCwsCoreTime/rmk" />
									</td>
								</tr>							
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td>.</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="30%" class="contant" style="padding:20px;">
										<div style="position:relative; width:100%; padding-left:5px; ">위와 같이 집중근무시간제를 신청합니다.</div>
										<div style="position:relative; width:100%; margin-right:50px; text-align:right;">
											 <xsl:value-of select="msgCwsCoreTime/req_ymd" />
										</div>
										<div style="position:relative; width:100%; margin-right:20px; text-align:right;">
											신청인 성명: <xsl:value-of select="msgCwsCoreTime/req_nm" />
										</div>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<br/><br/>
			</body>
	</xsl:template>
</xsl:stylesheet>