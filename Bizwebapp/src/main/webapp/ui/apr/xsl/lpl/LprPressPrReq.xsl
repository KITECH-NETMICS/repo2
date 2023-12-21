<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
			<BODY> 
			<form name="frmXsl" target="blank" action="https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
				<INPUT type="hidden" name="FilePath" size="25" />
				<INPUT type="hidden" name="orgFileName" size="25" />
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
				<tr>
					<td class="head">신청자정보</td>
				</tr>
			    <tr>
			        <td class="body">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
							
							<tr>		
								<td width="13%" class="title2">신청자</td>
								<td width="37%" class="contant">									
									 <xsl:value-of
										select="request/updateInfo/apr_req_psn_nm" />
								     <xsl:value-of
										select="request/updateInfo/apr_emp_no" />
								</td>
								<td width="13%" class="title2">부서</td>
								<td width="37%" class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_req_dept_nm" />
								</td>													
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<table width="100%" class="aproutertable">
				<tr>
					<td class="head">신청정보</td>
				</tr>
				<tr>
				     <td class="body">
				     	<table width="100%" class="aprinnertable">							
							<tr>
								<td width="10%" class="title2">신청번호</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="request/updateInfo/req_no" />
								</td>
								<td width="10%" class="title2">신청일자</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_req_ymd" />
								</td>
								<td width="13%" class="title2">보도희망일자</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_hope_ymd" />
								</td>																
							</tr>
							<tr>
								<td width="3%" class="title2">신청구분</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_req_clsf" />
								</td>
								<td width="10%" class="title2">보도매체구분</td>
								<td colspan="3" class="contant">
									<xsl:if test="contains(request/updateInfo/apr_rptg_media_clsf1, 'Y')">
										[종합일간지]
									</xsl:if>
									<xsl:if test="contains(request/updateInfo/apr_rptg_media_clsf2, 'Y')">
										[주요경제지]
									</xsl:if>
									<!-- xsl:if test="contains(request/updateInfo/apr_rptg_media_clsf3, 'Y')">
										[지상파방송]
									</xsl:if-->
									<xsl:if test="contains(request/updateInfo/apr_rptg_media_clsf4, 'Y')">
										[온라인언론매체]
									</xsl:if>												
								</td>									
							</tr>								
						</table>
					</td>
				</tr>
			</table>
			<table width="100%" class="aproutertable">
				<tr>
					<td class="head">취재협조사항</td>
				</tr>
				<tr>
				     <td class="body">
				     	<table width="100%" class="aprinnertable">				     	
							
							<tr>
								<td width="10%" class="title2">언론사</td>
								<td width="10%" class="contant">
									<xsl:value-of
										select="request/updateInfo/press_nm" />
								</td>	
								<td width="10%" class="title2">담당자</td>
								<td width="10%" class="contant">
									<xsl:value-of
										select="request/updateInfo/charg_nm" />
								</td>
								<td width="10%" class="title2">전화번호</td>
								<td width="10%" class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_tel" />
								</td>
								<td width="10%" class="title2">이메일</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="request/updateInfo/email" />
								</td>
							</tr>
							<tr>
								<td width="16%" class="title2">보도의뢰<br>주요내용</br></td>
								<td colspan="7" class="contant">
									<xsl:value-of
										select="translate(request/updateInfo/apr_rptg_contnt, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />																				
								</td>
							</tr>
							<tr>
								<td width="16%" class="title2">보도사유</td>
								<td colspan="7" class="contant">										
									<xsl:value-of
										select="translate(request/updateInfo/apr_rptg_resn, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />										
								</td>
							</tr>
							<tr>
								<td class="title2">첨부파일</td>
								<td colspan='7' class="contant">
									<xsl:for-each select="request/updateInfo/fileList_A/vector/data/mdata">
									<a>
										<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA014')</xsl:attribute>
	                               		<xsl:value-of select="file_nm"/>
	                               		<br/>
									</a>
									</xsl:for-each>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>								
			</form>
			<iframe name="ifr" height="0" width="0"></iframe>
			</BODY>				
	</xsl:template>
</xsl:stylesheet>