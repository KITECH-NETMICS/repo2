<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<body>
				<!--div style="color:blue;text-align:right;">누적기준 월3회 이하 시 차상위자 결재를 받아 합니다.</div-->
				<!--div style="color:blue;text-align:right;">누적기준 월3회 초과 시 원장님 결재 및 임직원 행동강령책임관 결재를 받아야 합니다.</div-->
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable"
					style="margin-bottom:6px;">
					<tr>
						<td class="head">제출자</td>
					</tr>					
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable" style="height:40px;">
								<tr height="30px"> 
									<td width="15%" class="title2">신청번호</td>
									<td width="35%" class="contant">
										<xsl:value-of select="root/req_no" />
									</td>
									<td width="15%" class="title2">부서/본부</td>
									<td width="35%" class="contant">
										<xsl:value-of select="root/apr_dept_divisn" />
									</td>
								</tr>
								<tr height="30px">
									<td class="title2">성명(사번)</td>
									<td class="contant">
										<xsl:value-of select="root/apr_req_nm" />	
									</td>
									<td class="title2">직급/직책</td>
									<td class="contant">
										<xsl:value-of select="root/apr_posi_duty" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable"
					style="margin-bottom:6px;">
					<tr>
						<td class="head">제출정보</td>
					</tr>						
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable" style="height:40px;">
								<tr height="30px">
									<td width="15%" class="title2">대상일</td>
									<td width="35%" class="contant">
										<xsl:value-of select="root/basedate" />
									</td>
									<td width="15%" class="title2">미이행 구분</td>
									<td width="35%" class="contant">
										<xsl:value-of select="root/miss_type_nm" />	
									</td>
								</tr>
								<tr height="30px">
									<td width="15%" class="title2">기존출근시각</td>
									<td width="35%" class="contant">
										<xsl:choose>
											<xsl:when test="root/org_st_dt = '누락'">
												<span style="color:red"><xsl:value-of select="root/org_st_dt" /></span>
											</xsl:when>
											<xsl:otherwise>
												<xsl:value-of select="root/org_st_dt" />
											</xsl:otherwise>
										</xsl:choose>										
									</td>
									<td width="15%" class="title2">기존퇴근시각</td>
									<td width="35%" class="contant">
										<xsl:choose>
											<xsl:when test="root/org_ed_dt = '누락'">
												<span style="color:red"><xsl:value-of select="root/org_ed_dt" /></span>
											</xsl:when>
											<xsl:otherwise>
												<xsl:value-of select="root/org_ed_dt" />
											</xsl:otherwise>
										</xsl:choose>
									</td>
								</tr>								
								<tr height="30px">
									<td width="15%" class="title2">신청출근시각</td>
									<td width="35%" class="contant" style="color:blue">
										<xsl:value-of select="root/valid_st_dt" />	
									</td>
									<td width="15%" class="title2">신청퇴근시각</td>
									<td width="35%" class="contant" style="color:blue">
										<xsl:value-of select="root/valid_ed_dt" />
									</td>
								</tr>
								<tr height="50px">
									<td width="15%" class="title2">제출사유</td>
									<td width="85%" colspan="3" class="contant">
										<xsl:value-of select="root/cause" />
									</td>
								</tr>
								<xsl:if test="root/work_perfmc != ''">
								<tr height="50px">
									<td width="15%" class="title2">업무수행 실적</td>
									<td width="85%" colspan="3" class="contant">
										<xsl:value-of select="root/work_perfmc" />
									</td>
								</tr>
								</xsl:if>								
							</table>
						</td>
					</tr>
				</table>
				
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable"
					style="margin-bottom:6px;">
					<tr>
						<td class="head">증빙정보</td>
					</tr>						
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable" style="margin-bottom:6px;">
							    <tr>
						     		<td class="body">
								     	<table width="100%" class="aprinnertable">							
											<tr>
												
												<td class="title2">첨부파일명</td>
											</tr>
										<xsl:for-each select="root/attachVo1">
											<xsl:variable name="saveName" select="mdata/attach_file_no" />
											<xsl:variable name="saveSeq" select="mdata/seq" />
											<xsl:variable name="fileName" select="mdata/file_nm" />
											<xsl:variable name="fileExt" select="mdata/extens_nm" />
											<tr>
												
												<td class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA006')</xsl:attribute>
														<xsl:value-of select="file_nm" />
													</a>
													<xsl:if test="attach_file_no != ''">
														<a>
															<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of select="seq" />')</xsl:attribute>
															<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기" style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;"/>
														</a>
													</xsl:if>
												</td>
											</tr>
										</xsl:for-each>
										</table>
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