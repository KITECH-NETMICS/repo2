<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="1" /> 
			<body>
			<!-- 
				<script language="javascript">
					<![CDATA[
					 
 					function xslFileFreDownload(loPath, orgFileName){
  						//var localPath        = "/was/WebSphere/AppServer/profiles/AppSrv01/installedApps/kwas1Cell01/biz.ear/bizweb.war/kitechfiles/";
  						var frm = createForm("frmXsl", "_blank", "http://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp", "get");
						frm = createHidden("FilePath", localPath+loPath, frm);
						frm = createHidden("orgFileName", orgFileName, frm);
						document.insertBefore(frm);
						frm.submit();
 					}
 					
 					function createForm(nm, tg, act, met){
 						var cForm = document.createElement("form"); 
						cForm.name = nm;
						cForm.target = tg;
						cForm.action = act;
						cForm.method = met;
 						return cForm;
 					}
 					
 					function createHidden(nm, val, frm){
 						var hiddenInput=document.createElement("input");
						 hiddenInput.type="hidden";
						 hiddenInput.name=nm;
						 hiddenInput.value=val;
						 frm.insertBefore(hiddenInput);
						 return frm;
 					} 					
 					
 					
				]]>
				</script>
				 -->
				<table width="100%" border="0" cellpadding="0"
					cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0"
								cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="12%">
										부서
									</td>
									<td class="contant">
										<xsl:value-of
											select="root/sh_dept_nm" />
									</td>
									<td class='title2'>직급</td>
									<td class="contant">
										<xsl:value-of
											select="root/sh_posi_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="12%">
										성명(개인번호)
									</td>
									<td class="contant">
										<xsl:value-of
											select="root/sh_nm" />(<xsl:value-of select="root/empno" />)
									</td>
									<td class='title2'>직무구분</td>
									<td class="contant">
										<xsl:value-of
											select="root/sh_job_clsf_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="12%">
										신청유형
									</td>
									<td class="contant">
										<xsl:value-of
											select="root/sh_req_typ_nm" />
									</td>
									<td class='title2'>문서번호</td>
									<td class="contant">
										<xsl:value-of
											select="root/req_no" />
									</td>
								</tr>
								<xsl:if
									test="root/sh_req_typ ='HBL240'">
									<tr>
										<td class='title2'
											width="12%">
											복직일
										</td>
										<td class="contant">
											<xsl:value-of
												select="root/sh_combk_ymd" />
										</td>
										<td class='title2'>복직부서</td>
										<td class="contant">
											<xsl:value-of
												select="root/sh_combk_dept_nm" />
										</td>
									</tr>
								</xsl:if>
								<xsl:if
									test="root/sh_req_typ != 'HBL240'">
									<tr>
										<td class='title2'
											width="12%">
											휴직기간
										</td>
										<td class="contant">
											<xsl:value-of
												select="root/sh_ttoff_orign_ymd" />
										</td>
										<td class='title2'>일수</td>
										<td class="contant">
											<xsl:value-of
												select="root/sh_month_no" /> 일
										</td>
									</tr>
								</xsl:if>
								<tr>
									<td class='title2' width="12%">
										사유
									</td>
									<td class="contant" colspan="3">
										
											<xsl:value-of
												select="root/sh_resn" />
										
									</td>
								</tr>
							</table>

						</td>
					</tr>
				</table>

				<TABLE width="100%" border="0" cellpadding="0"
					cellspacing="0" class="aproutertable">
					<TR>
						<TD align="left" class="head">첨부파일</TD>
					</TR>
						<TR>
							<TD class="body">
								<TABLE width="100%" border="0"
									cellpadding="0" cellspacing="0" class="aprinnertable">
									
									
									<xsl:for-each
										select="root/fileList">
										<TR>
											<TD class="contant">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA003')</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
												<xsl:if test="attach_file_no != ''">
													<a>
														<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of
															select="seq" />')</xsl:attribute>
														<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기"
															style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;" />
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
	</xsl:template>
</xsl:stylesheet>