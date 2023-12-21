<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
			<BODY> 
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
			    <tr>
				     <td class="body">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
							<tr>
								<td width="16%" class="title2">신청번호</td>
								<td width="16%" colspan="5" class="contant">
									<xsl:value-of
									select="request/updateInfo/req_no" />
								</td>
							</tr>
							<tr>
								<td width="16%" class="title2">신청일자</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_req_ymd" />
								</td>
								<td width="16%" class="title2">신청자</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_req_psn_nm" />
									<xsl:value-of
										select="request/updateInfo/apr_emp_no" />
								</td>
								<td width="16%" class="title2">신청부서</td>
								<td width="16%" class="contant">
									 <xsl:value-of
										select="request/updateInfo/apr_req_dept_nm" />
								</td>
							</tr>
							<tr>
								<td width="16%" class="title2">품명</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_gdnm" />
								</td>
								<td width="16%" class="title2">수량</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="request/updateInfo/qty" />
								</td>
								<td width="16%" class="title2">전화번호</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_tel_no" />
								</td>								
							</tr>
							<tr>
								<td width="16%" class="title2">제출처</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="request/updateInfo/submit_loc" />
								</td>
								<td width="16%" class="title2">전달방법</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_premnth_way" />
								</td>
							</tr>
							<tr>
								<td width="16%" class="title2">주소</td>
								<td width="16%" colspan="5" class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_addr_clsf" />
									<xsl:value-of
										select="request/updateInfo/addr" />
								</td>
							</tr>
							<tr>
								<td width="16%" class="title2">용도</td>
								<td width="16%" colspan="5" class="contant">
									<xsl:value-of
										select="translate(request/updateInfo/apr_usg, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />
								</td>
							</tr>
							<xsl:if test="count(request/updateInfo/fileList_A/vector/data)!=0">
							<tr>
								<td width="16%" class="title2">첨부파일</td>
								<td width="16%" colspan="5" class="contant">
									<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
										<!-- xsl:value-of select="translate(request/updateInfo/apr_usg, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" /-->
										<xsl:for-each select="request/updateInfo/fileList_A/vector/data">
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
								</td>
							</tr>
							</xsl:if>
						</table>
					</td>
				</tr>
			</table>
			</BODY>			
	</xsl:template>
</xsl:stylesheet>