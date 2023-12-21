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
				     <td class="body">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">					
							<tr>
								<td width="13%" class="title2">게시구분</td>
								<td colspan="5" class="contant"> 
									<xsl:if test="contains(request/updateInfo/notice_item_write_yn, 'Y')">
										[공지사항]
									</xsl:if>
									<xsl:if test="contains(request/updateInfo/rcrt_notice_write_yn, 'Y')">
										[채용공고]
									</xsl:if>
									<xsl:if test="contains(request/updateInfo/smnr_guide_write_yn, 'Y')">
										[세미나안내]
									</xsl:if>
									<xsl:if test="contains(request/updateInfo/educ_guide_write_yn, 'Y')">
										[교육안내]
									</xsl:if>
									<xsl:if test="contains(request/updateInfo/desc_meet_guide_write_yn, 'Y')">
										[설명회안내]
									</xsl:if>
									<xsl:if test="contains(request/updateInfo/event_guide_write_yn, 'Y')">
										[행사안내]
									</xsl:if>
									<xsl:if test="contains(request/updateInfo/etc_write_yn, 'Y')">
										[기타]
										[<xsl:value-of
										select="request/updateInfo/etc_contnt" />]
									</xsl:if>
								</td>
							</tr>
							<tr>
								<td class="title2">제목</td>
								<td colspan="5" class="contant">
									<xsl:value-of
										select="request/updateInfo/req_subj" />
								</td>
							</tr>
							<tr>						
								<td class="title2">요청부서</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_req_dept_nm" />
								</td>
								<td width="16%" class="title2">요청일자</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_req_ymd" />
								</td>
								<td width="16%" class="title2">마감일</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_close_ymd" />
								</td>
							</tr>					
							<tr>						
								<td height="250" colspan="6" class="contant">						
									<xsl:value-of
											select="translate(request/updateInfo/apr_start_contnt, '', '')" disable-output-escaping="yes" />									
								</td>
							</tr>						
							<tr>
								<td class="title2">첨부파일</td>
								<td colspan='5' class="contant">
									<xsl:for-each select="request/updateInfo/fileList_A/vector/data/msgXomxComAttachFileMS01">
									<a>
										<xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="full_path" />')</xsl:attribute>
										<xsl:value-of select="org_file" /><br></br>
									</a>
									</xsl:for-each>
								</td>
							</tr>
							<tr>
								<td class="title2">특기사항</td>
								<td colspan="5" class="contant">
										<xsl:value-of select="translate(request/updateInfo/apr_spclab_item, '', '')"  disable-output-escaping="yes" />
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