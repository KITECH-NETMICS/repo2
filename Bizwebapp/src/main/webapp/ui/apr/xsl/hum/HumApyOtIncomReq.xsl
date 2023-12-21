﻿<?xml version="1.0"?>
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
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">  
							  <tr>
									<td class='title2'>급여코드</td>
									<td class="contant"><xsl:value-of select="APRSNPSHOT/salry_cd_nm" /></td>
							  </tr>				
						  	</table>
						 </td>
					  </tr>
				  </table>    
				  <br/>
				  <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">  
							  <tr>
									<td colspan="9" align="center" class='title'>지급내역</td>
							  </tr>
							  <tr>
									<td class='title'>개인번호</td>
									<td class='title'>계좌번호</td>
									<td class='title'>은행</td>
									<td class='title'>예금주</td>
									<td class='title'>금액</td>
									<td class='title'>세액</td>
									<td class='title'>세율</td>
									<td class='title'>실지급액</td>
									<td class='title'>송금내역</td>
							  </tr>
							  <xsl:for-each select="APRSNPSHOT/OTI_VEC/vector/data/msgHumApyOtincome01">
							  <tr>
									<td class="contant-center"><xsl:value-of select="empno" /></td>
									<td class="contant-center"><xsl:value-of select="bankaccnt_no" /></td>
									<td class="contant"><xsl:value-of select="bankaccnt_nm" /></td>
									<td class="contant-center"><xsl:value-of select="nm" /></td>									
									<td class="contant-right" align="right"><xsl:value-of select="format-number(pay,'#,###,###,###,###,###')" /></td>
									<td class="contant-right" align="right"><xsl:value-of select="format-number(incomtax + residtax,'#,###,###,###,###,###')" /></td>
									<td class="contant-right"><xsl:value-of select="avg_taxrts" />%</td>
									<td class='contant-right'><xsl:value-of select="format-number(ofic_pay,'#,###,###,###,###,###')" /></td>
									<td class="contant"><xsl:value-of select="rmk" /></td>
							  </tr>
							  </xsl:for-each>
						 	 </table>
						  </td>
					  </tr>
				  </table>
				  
				  <TABLE width="100%" border="0"
                    cellpadding="0" cellspacing="0" class="aproutertable">
                    <TR>
                        <TD align="left" class="head">
                            첨부파일
                        </TD>
                    </TR>
                    <xsl:if
                        test="count(APRSNPSHOT/FILE_VEC/vector/data)!=0">
                        <TR>
                            <TD class="body">
                                <TABLE width="100%"
                                    border="0" cellpadding="0" cellspacing="0"
                                    class="aprinnertable">
                                    <xsl:for-each
                                        select="APRSNPSHOT/FILE_VEC/vector/data/msgXomxComAttachFileMS01">
                                        <TR>
                                            <TD
                                                class="contant">
                                                <a>
												<xsl:attribute
													name="href">javascript:xslFileDownload('<xsl:value-of
														select="attach_full_path" />/<xsl:value-of
														select="org_file" />')</xsl:attribute>
                                                <xsl:value-of
                                                    select="org_file" />
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