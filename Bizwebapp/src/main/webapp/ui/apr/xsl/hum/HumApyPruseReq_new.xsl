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
									<td class='title2' colspan="4">
										1. 신청자 인적사항
									</td>
								</tr>
								<tr>
									<td width="20%" class='title2'>
										성 명
									</td>
									<td class="contant">
										<xsl:value-of
											select="root/saveVo/nm" />(<xsl:value-of select="root/saveVo/empno" />)
									</td>
									<td width="14%" class='title2'>
										직 급
									</td>
									<td class="contant">
										<xsl:value-of
											select="root/saveVo/posi_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>부 서</td>
									<td colspan="3" class="contant">
										<xsl:value-of
											select="root/saveVo/dept_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2' colspan="4">
										2. 대상자 인적사항
									</td>
								</tr>
								<tr>
									<td width="20%" class='title2'>
										성 명
									</td>
									<td class="contant">
										<xsl:value-of
											select="root/saveVo/tar_nm" />(<xsl:value-of select="root/saveVo/tar_empno" />)
									</td>
									<td width="14%" class='title2'>
										직 급
									</td>
									<td class="contant">
										<xsl:value-of
											select="root/saveVo/tar_posi_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>부 서</td>
									<td colspan="3" class="contant">
										<xsl:value-of
											select="root/saveVo/tar_dept_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>변경사유</td>
									<td colspan="3" class="contant">
										<xsl:value-of
											select="root/saveVo/rmk" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				
				<br />
				<table width="100%" border="0" cellpadding="0"
					cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0"
								cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title' colspan="8">
										변경전 지도교수(활용책임자)
									</td>
								</tr>
									<tr>
										<td class='title'>순번</td>
										<td class='title'>부서</td>
										<td class='title'>개인번호</td>
										<td class='title'>성명</td>
										<td class='title'>직급</td>
										<td class='title'>지도교수구분</td>
									</tr>
								<xsl:for-each
									select="root/humApyPrsBeforeVoList">
									<tr>
										<td class='contant-center'>
											<xsl:value-of select="position()" />
										</td>
										<td class='contant-center'>
											<xsl:value-of
												select="dept_nm" />
										</td>
										<td class='contant-center'>
											<xsl:value-of
												select="empno" />
										</td>
										<td class='contant-center'>
											<xsl:value-of
												select="nm" />
										</td>
										<td class='contant-center'>
											<xsl:value-of
												select="posi_nm" />
										</td>
										<td class='contant-center'>
											<xsl:value-of
												select="respn_clsf_nm" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>

                <br />
				<table width="100%" border="0" cellpadding="0"
					cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0"
								cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title' colspan="8">
										변경후 지도교수(활용책임자)
									</td>
								</tr>
									<tr>
										<td class='title'>순번</td>
										<td class='title'>부서</td>
										<td class='title'>개인번호</td>
										<td class='title'>성명</td>
										<td class='title'>직급</td>
										<td class='title'>지도교수구분</td>
										<td class='title'>상태</td>
									</tr>
								<xsl:for-each
									select="root/humApyPrsInfoVoList">
									<tr>
										<td class='contant-center'>
											<xsl:value-of select="position()" />
										</td>
										<td class='contant-center'>
											<xsl:value-of
												select="dept_nm" />
										</td>
										<td class='contant-center'>
											<xsl:value-of
												select="empno" />
										</td>
										<td class='contant-center'>
											<xsl:value-of
												select="nm" />
										</td>
										<td class='contant-center'>
											<xsl:value-of
												select="posi_nm" />
										</td>
										<td class='contant-center'>
											<xsl:value-of
												select="respn_clsf_nm" />
										</td>
										<td class='contant-center'>
											<xsl:value-of
												select="use_yn" />
										</td>
									</tr>
								</xsl:for-each>
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