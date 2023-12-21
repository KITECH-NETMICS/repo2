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
										<xsl:value-of select="msgCwsFlexTime/req_nm" />
									</td>
									<td width="20%" class="title2">신청번호</td>
									<td width="30%" class="contant">
										<xsl:value-of select="msgCwsFlexTime/req_no" />
									</td>
								</tr>									
								<tr>
									<td class="title2">부서/본부</td>
									<td class="contant">
										<xsl:value-of select="msgCwsFlexTime/dept_nm" />/<xsl:value-of select="msgCwsFlexTime/divsn_nm" />
									</td>
									<td class="title2">직급</td>
									<td class="contant">
										<xsl:value-of select="msgCwsFlexTime/posi_nm" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">주요업무</td>
									<td width="70%" class="contant" colspan="3">
										<xsl:value-of select="msgCwsFlexTime/main_biz" />
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
								<xsl:variable name="st_ym" select="msgCwsFlexTime/start_ym" />
								<xsl:variable name="en_ym" select="msgCwsFlexTime/end_ym" />
								<tr>
									<td width="20%" class="title2">신청기간</td>
									<td width="80%" class="title2" colspan="2">
										근무유형별 근무시간제
										(<xsl:value-of select="msgCwsFlexTime/period_name" />
										: <xsl:value-of select="concat(substring($st_ym, 1, 4), '년 ', substring($st_ym, 5, 2), '월')"/>
										~ <xsl:value-of select="concat(substring($en_ym, 1, 4), '년 ', substring($en_ym, 5, 2), '월')"/>)
									</td>
								</tr>
							<xsl:for-each select="msgCwsFlexTime/dtls/vector/data">
								<xsl:variable name="ing_ym" select="msgCwsFlexTimeDtls/ing_ym" />
								<tr>
									<td width="20%" class="title2">
										<xsl:value-of select="concat(substring($ing_ym, 1, 4), '년 ', substring($ing_ym, 5, 2), '월')"/>
									</td>
									<td width="30%" class="contant"><xsl:value-of select="msgCwsFlexTimeDtls/work_name"/></td>
									<td width="50%" class="contant"><xsl:value-of select="msgCwsFlexTimeDtls/work_desc"/></td>	
								</tr>
							</xsl:for-each>
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
									<td width="20%" class="title2">신청사유</td>
									<td width="80%" class="contant">
										<xsl:value-of select="msgCwsFlexTime/req_cause" />
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
										<div style="position:relative; width:100%; padding-left:5px; ">위와 같이 시차출퇴근제를 신청합니다.</div>
										<div style="position:relative; width:100%; margin-right:50px; text-align:right;">
											 <xsl:value-of select="msgCwsFlexTime/req_ymd" />
										</div>
										<div style="position:relative; width:100%; margin-right:20px; text-align:right;">
											신청인 성명: <xsl:value-of select="msgCwsFlexTime/req_nm" />
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