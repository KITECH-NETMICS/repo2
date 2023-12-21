<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
 	 <xsl:variable name="localPath" select="1"/> 
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
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class = "body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<tr>
										<td class='title' colspan="2" width="30%" >구분</td>
										<td class='title'>신고내용</td>						
									</tr>
									<tr>
										<td class='title2' width="15%" rowspan="3">신고자</td>
										<td class='title2' width="15%">부서</td>
										<td class="contant"><xsl:value-of select="SAVE/dept_nm" /></td>
									</tr>
									<tr>
										<td class='title2'>직급</td>
										<td class="contant"><xsl:value-of select="SAVE/ptwk_posi_nm" /></td>
									</tr>
									<tr>
										<td class='title2'>성명</td>
										<td class="contant"><xsl:value-of select="SAVE/ptwk_nm" /></td>
									</tr>					
									<tr>
										<td class='title2' width="15%" rowspan="4">타업종사 기관</td>
										<td class='title2' width="15%">기관명</td>
										<td class="contant"><xsl:value-of select="SAVE/agncy_nm" /></td>						
									</tr>
									<tr>
										<td class='title2'>소재지</td>
										<td class="contant"><xsl:value-of select="SAVE/base_full_addr" /></td>						
									</tr>
									<tr>
										<td class='title2'>자격</td>
										<td class="contant"><xsl:value-of select="SAVE/licns_clsf_nm" /></td>								
									</tr>
									<tr>
										<td class='title2'>강의명(과목)</td>
										<td class="contant"><xsl:value-of select="SAVE/biztyp_nm" /></td>											
									</tr>
									
									<tr>
										<td class='title2' colspan="2">타업종사 기간</td>
										<td class="contant"><xsl:value-of select="SAVE/ptwk_ymd" /></td>											
									</tr>
									<tr>
										<td class='title2' colspan="2">타업종사 참여정도</td>
										<td class="contant"><xsl:value-of select="SAVE/attnce_time" />시간</td>											
									</tr>
									<tr>
										<td class='title2' colspan="2">타업종사 형태</td>
										<td class="contant"><xsl:value-of select="SAVE/attnce_shape_nm" /></td>											
									</tr>
									<tr>
										<td class='title2' colspan="2" >경제적 보상</td>
										<td class="contant-right"><xsl:value-of select="format-number(SAVE/compen_liq,'#,###,###,###,###,###')" /></td>											
									</tr>
								</table>			  
							</td>
						</tr>
					</table>	
				  
					<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
						<TR>
							<TD class="head" align="left">첨부파일</TD>
						</TR>
						<xsl:if test="count(SAVE/fileList_A/vector/data/mdata)!=0">
						<TR>
							<TD class="body">
								<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<xsl:for-each select="SAVE/fileList_A/vector/data/mdata">
									<TR>
										<TD class="contant">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA015')</xsl:attribute>
												<xsl:value-of select="file_nm" />
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