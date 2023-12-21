<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="MODIFYHUMAPYTTOFF">
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
			        		<td class='title2' width="15%">부 서</td>
			        		<td class="contant" width="30%"><xsl:value-of select="sh_dept_nm" /></td>
			        		<td class='title2' width="12%">직 급</td>
			        		<td class="contant" width="15%"><xsl:value-of select="sh_posi_nm" /></td>
			        		<td class='title2' width="13%">성 명</td>
			        		<td class="contant" width="15%"><xsl:value-of select="sh_nm" /></td>
	          			</tr>
	         			<tr>
			        		<td width="12%" class='title2'>분 야</td>
			        		<td colspan="5" class="contant"><xsl:value-of select="fild" /></td>
	        			</tr>
			        	<tr>
			        		<td width="12%" class='title2'>신청기간</td>
			        		<td colspan="6" class="contant"><xsl:value-of select="sh_apy_date" /></td>
			        	</tr>
			        	<tr>
			        		<td rowspan="2" class='title2'>장 소</td>
			        		<td class='title2'>기관명</td>
			        		<td colspan="5" width="76%" class="contant"><xsl:value-of select="agncy_nm" /></td>
			        	</tr>
			        	<tr>
			        		<td class='title2'>주 소</td>
			        		<td colspan="5" class="contant">
			        		(<xsl:value-of select="postmt_no" />) <xsl:value-of select="base_addr" /></td>
			        	</tr>
			        	<tr>
			        		<td width="12%" class='title2'>O/H부담</td>
			        		<td colspan="5" class="contant"><xsl:value-of select="sh_burdn_nm" /></td>
			        	</tr>
			        	<tr>
			        		<td width="12%" class='title2'>활동계획 요약</td>
			        		<td colspan="5" class="contant"><xsl:value-of select="plan_abst" /></td>
			        	</tr>
					  </table>
					 </td>
					 </tr>
					 </table>
					 
					 <TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					    <TR>
					      <TD align="left" class="head">연가계획서</TD>
					    </TR>
					    <xsl:if test="count(fileList_B/vector/data)!=0">
					    <TR>
					      <TD class="body">
					        <TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
					        	<xsl:for-each select="fileList_B/vector/data/mdata">
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
					  
					  <TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					    <TR>
					      <TD align="left" class="head">첨부파일</TD>
					    </TR>
					    <xsl:if test="count(fileList_A/vector/data)!=0">
					    <TR>
					      <TD class="body">
					        <TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
					        	<xsl:for-each select="fileList_A/vector/data/mdata">
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