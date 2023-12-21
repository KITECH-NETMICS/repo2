<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
		<html lang="kr">
			<head>
				<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
			<style>
			</style>
			</head>
			<body>
				<script language="javascript">
					<![CDATA[
						/** 근무시간현황 바로가기 */
						function goWorkTimeView(empNo, reqYm){
							var url = "http://biz.kitech.re.kr//filter/index.jsp?serviceid=C944&pEmpno="+ empNo +"&yyyymm="+ reqYm;
							url = url.replace(/amp;amp;/g,"");
							window.open(url, "_blank");
						}
					]]>
				</script>			
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">신청정보</td>
					</tr>
					<tr>
					<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td class="title2" width="20%">신청번호</td>
									<td class="contant">
										<xsl:value-of select="root/req_no" />
									</td>
									<td class="title2" width="20%">성명</td>
									<td class="contant">
											<xsl:value-of select="root/nm" />
									</td>
								</tr>
								<tr>
									<td class="title2" width="20%">부서명</td>
									<td class="contant">
										<xsl:value-of select="root/dept_nm" />
									</td>
									<td class="title2" width="20%">직급</td>
									<td class="contant">
										<xsl:value-of select="root/posi_nm" />
									</td>
								</tr>
								<tr>
									<td class="title2" width="20%">근무일시</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="root/start_ymd" /> ~ <xsl:value-of select="root/cls_ymd" />
										<a style ="display:inline-block;padding-left:30px; color:blue;">
											<xsl:attribute name="href">javascript:goWorkTimeView('<xsl:value-of select="request/APPROVAL/apr_emp_no/@value" />', '<xsl:value-of select="request/APPROVAL/apr_req_ym/@value" />')</xsl:attribute>
											근무시간현황 바로가기
										</a>
									</td>
								</tr>
								<tr>
									<td class="title2" width="20%">계획</td>
									<td class="contant" width="500px" colspan="3">
										<xsl:value-of select="root/work_plan"/>
									</td>
								</tr>
								<tr>
									<td class="title2" width="20%">실적</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="root/work_act"/>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				
				<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
					<TR>
						<TD class="head" align="left">첨부파일</TD>
					</TR>
					<TR>
						<TD class="body">
							<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
								<xsl:for-each select="root/attachVo1">
									<TR>
										<TD class="contant">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA006')</xsl:attribute>
												<xsl:value-of select="file_nm"/>
											</a>
											<xsl:if test="attach_file_no != ''">
												<a>
													<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of select="seq" />')</xsl:attribute>
													<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기" style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;"/>
												</a>
											</xsl:if>
										</TD>
									</TR>
								</xsl:for-each>
							</TABLE>
						</TD>
					</TR>
				</TABLE>
				
			</body>			
		</html>
	</xsl:template>
</xsl:stylesheet>