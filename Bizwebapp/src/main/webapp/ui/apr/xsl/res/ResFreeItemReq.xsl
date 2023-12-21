<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:LINS="http://www.inswave.com/LINS">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<BODY>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body" colspan="2">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="15%">신청번호 </td>
									<td class="contant-center" width="35%">
										<xsl:value-of select="APPROVAL/key_1" />
									</td>
									<td class="contant" colspan='2'></td>
								</tr>
								<tr>
									<td class='title2'>구분</td>
									<td class="contant"> 임의안건 </td>
									<td class='title2' width="15%" >신청자 </td>
									<td class="contant" >
										<xsl:value-of select="APPROVAL/req_psn_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>안건제목</td>
									<td class="contant" colspan='3'>
										<xsl:value-of select="APPROVAL/rvew_objct" />
									</td>
								</tr>
								
								<tr>
									<td class='title2'>심의내용 </td>
									<td class="contant" colspan='3'>
										<xsl:value-of select="APPROVAL/rmk" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<!-- 첨부화일 -->
				<xsl:if test="APPROVAL/attach_file_no != ''">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 첨부파일</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<xsl:for-each select="APPROVAL/fileList_A/vector/data/msgXomxComAttachFileMS01">
										<tr>
											<td class='title2' width="16%"> <xsl:value-of select="position()" /></td>
											<td class='contant' width="84%">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA001')</xsl:attribute>
													<xsl:value-of select="org_file" />
												</a>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<!-- 불용 소연심의 첨부화일 -->
				<xsl:if test="APPROVAL/vector/data/msgResSmlRvewDMS04/attach_file_no/vector/result != '0'">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 첨부파일</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<xsl:for-each select="APPROVAL/vector/data/msgResSmlRvewDMS04/attach_file_no/vector/data/mdata">
										<tr>
											<td class='title2' width="15%">첨부파일 제목 </td>
											<td class="contant">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select='attach_file_no' /><xsl:value-of select='seq' />","XAA015")</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
			</BODY>
	</xsl:template>
</xsl:stylesheet>