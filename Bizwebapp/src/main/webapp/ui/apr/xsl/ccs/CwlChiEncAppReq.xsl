<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
			<BODY>
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
										<xsl:value-of select="request/APPROVAL/apr_req_no" />
									</td>
									<td class="title2" width="20%">성명</td>
									<td class="contant">
											<xsl:value-of select="request/APPROVAL/apr_req_nm" />(<xsl:value-of select="request/APPROVAL/apr_req_empno" />)
									</td>
								</tr>
								<tr>
									<td class="title2" width="20%">출생자녀</td>
									<td class="contant">
										<xsl:value-of select="request/APPROVAL/apr_child_clsf" />
									</td>
									<td class="title2" width="20%">출생일</td>
									<td class="contant">
										<xsl:value-of select="request/APPROVAL/apr_birth_ymd" />
									</td>
								</tr>
								<tr>
									<td class="title2" width="20%">입금계좌</td>
									<td class="contant">
										<xsl:value-of select="request/APPROVAL/apr_bank_no" />
									</td>
									<td class="title2" width="20%">은행명</td>
									<td class="contant">
										<xsl:value-of select="request/APPROVAL/apr_bank_nm" />
									</td>
								</tr>
								<tr>
									<td class="title2" width="20%">예금주명</td>
									<td class="contant">
										<xsl:value-of select="request/APPROVAL/apr_bank_per_nm" />
									</td>
									<td class="title2" width="20%">신청일</td>
									<td class="contant">
										<xsl:value-of select="request/APPROVAL/apr_req_ymd" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<xsl:if test="count(request/APPROVAL/fileList_A/vector/data)!=0">
				<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
					<TR>
						<TD class="head" align="left">첨부파일</TD>
					</TR>
					<TR>
						<TD class="body">
							<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
								<xsl:for-each select="request/APPROVAL/fileList_A/vector/data">
									<TR>
										<TD class="contant">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="mdata/attach_file_no" /><xsl:value-of select="mdata/seq" />','XAA006')</xsl:attribute>
												<xsl:value-of select="mdata/file_nm" />
											</a>
										</TD>
									</TR>
								</xsl:for-each>
							</TABLE>
						</TD>
					</TR>
				</TABLE>
				</xsl:if>
			</BODY>			
	</xsl:template>
</xsl:stylesheet>