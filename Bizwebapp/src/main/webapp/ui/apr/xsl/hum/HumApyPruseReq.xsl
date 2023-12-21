<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="SAVEMULTI">
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
								<xsl:for-each
									select="INFO/vector/data/msgHumPruseMS02">
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
											select="nm" />
									</td>
									<td width="14%" class='title2'>
										직 급
									</td>
									<td class="contant">
										<xsl:value-of
											select="posi_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>부 서</td>
									<td colspan="3" class="contant">
										<xsl:value-of
											select="dept_nm" />
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
											select="tar_nm" />
									</td>
									<td width="14%" class='title2'>
										직 급
									</td>
									<td class="contant">
										<xsl:value-of
											select="tar_posi_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>부 서</td>
									<td colspan="3" class="contant">
										<xsl:value-of
											select="tar_dept_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>변경사유</td>
									<td colspan="3" class="contant">
										<xsl:value-of
											select="rmk" />
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
										변경전 지도교수(활용책임자)
									</td>
								</tr>
								<xsl:for-each
									select="BEF_LST/vector/data/msgHumPruseMS01">
									<tr>
										<td class='title'>순번</td>
										<td class='title'>부서</td>
										<td class='title'>개인번호</td>
										<td class='title'>성명</td>
										<td class='title'>직급</td>
										<td class='title'>지도교수구분</td>
									</tr>
									<tr>
										<td class='contant'>
											<xsl:number
												count="BEF_LST/vector/data" level="single"
												format="1-100" />
										</td>
										<td class='contant'>
											<xsl:value-of
												select="dept_nm" />
										</td>
										<td class='contant'>
											<xsl:value-of
												select="empno" />
										</td>
										<td class='contant'>
											<xsl:value-of
												select="nm" />
										</td>
										<td class='contant'>
											<xsl:value-of
												select="posi_nm" />
										</td>
										<td class='contant'>
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
								<xsl:for-each
									select="AFT_LST/vector/data/msgHumPruseMS01">
									<tr>
										<td class='title'>순번</td>
										<td class='title'>부서</td>
										<td class='title'>개인번호</td>
										<td class='title'>성명</td>
										<td class='title'>직급</td>
										<td class='title'>지도교수구분</td>
										<td class='title'>상태</td>
									</tr>
									<tr>
										<td class='contant'>
											<xsl:number
												count="AFT_LST/vector/data" level="single"
												format="1-100" />
										</td>
										<td class='contant'>
											<xsl:value-of
												select="dept_nm" />
										</td>
										<td class='contant'>
											<xsl:value-of
												select="empno" />
										</td>
										<td class='contant'>
											<xsl:value-of
												select="nm" />
										</td>
										<td class='contant'>
											<xsl:value-of
												select="posi_nm" />
										</td>
										<td class='contant'>
											<xsl:value-of
												select="respn_clsf_nm" />
										</td>
										<td class='contant'>
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
					<xsl:if
						test="count(fileList_A/vector/mdata)!=0">
						<TR>
							<TD class="body">
								<TABLE width="100%" border="0"
									cellpadding="0" cellspacing="0" class="aprinnertable">
									<xsl:for-each
										select="fileList_A/vector/data/mdata">
										<TR>
											<TD class="contant">
												<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA003')</xsl:attribute>
												<xsl:value-of select="file_nm" /><br/>
												</a>
											</TD>
										</TR>
									</xsl:for-each>
								</TABLE>
							</TD>
						</TR>
					</xsl:if>
				</TABLE>
			</body>
	</xsl:template>
</xsl:stylesheet>