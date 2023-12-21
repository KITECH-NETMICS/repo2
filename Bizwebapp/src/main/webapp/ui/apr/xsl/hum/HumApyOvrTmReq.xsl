<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/APRREQUEST">
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
				 <script language="javascript">
					<![CDATA[
						/** 근무시간현황 바로가기 */
						function goWorkTimeView(empNo, reqYm){
							var url = "http://biz.kitech.re.kr//filter/index.jsp?serviceid=C945&pEmpno="+ empNo +"&yyyymm="+ reqYm;
							url = url.replace(/amp;amp;/g,"");
							window.open(url, "_blank");
						}
					]]>
				</script>
				<table width="100%" border="0" cellpadding="0"
					cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0"
								cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td width="15%" class='title2'>
										성 명(개인번호)
									</td>
									<td class="contant">
										<xsl:value-of
											select="emp_nm" />
									</td>
									<td width="15%" class='title2'>직 　　　급</td>
									<td class="contant">
										<xsl:value-of
											select="posi_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>부　　　 서</td>
									<td class="contant">
										<xsl:value-of
											select="dept_nm" />
									</td>
									<td class='title2'>신　청　월</td>
									<td class="contant">
										<xsl:value-of
											select="work_yrmon" />
										<a style ="display:inline-block;padding-left:30px; color:blue;">
											<xsl:attribute name="href">javascript:goWorkTimeView('<xsl:value-of select="apr_emp_no" />', '<xsl:value-of select="apr_req_ym" />')</xsl:attribute>
											근무시간현황 바로가기
										</a>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				 </table>
				 <br></br>		 
				<table width="100%" border="0" cellpadding="0"
					cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0"
								cellpadding="0" cellspacing="0" class="aprinnertable">
								<!--  tr>
									<td colspan="6" class='title'>
										시간외 근무실적 확인서
									</td>
								</tr -->
								<tr>
									<td class='title' width='80'>날　　짜</td>
									<td class='title' width='80'>개시시간</td>
									<td class='title' width='80'>종료시간</td>
									<td class='title'>근무실적</td>
									<td class='title' width='80'>비　　고</td>
								</tr>
								<!-- request/APRREQUEST/ -->
								<xsl:for-each select="ovrtm/vector/data">
								<xsl:variable name="work_day" select="msgHumApyOvrTm02/work_day" />
							    <xsl:variable name="work_str_tm" select="msgHumApyOvrTm02/work_str_tm" />
								<xsl:variable name="work_end_tm" select="msgHumApyOvrTm02/work_end_tm" />
								<xsl:variable name="work_desc" select="msgHumApyOvrTm02/work_desc" />
								<xsl:variable name="rmk" select="msgHumApyOvrTm02/rmk" />
								<tr>
									<td class="contant-center" width='80'>
										<xsl:value-of select="$work_day" />
									</td>
									<td class="contant-center" width='80'>
										<xsl:value-of select="$work_str_tm" />
									</td>
									<td class="contant-center" width='80'>
										<xsl:value-of select="$work_end_tm" />
									</td>
									<td class="contant-center">
										<xsl:value-of select="$work_desc" />
									</td>
									<td class="contant-center" width='80'>
										<xsl:value-of select="$rmk" />
									</td>
								</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				
				<table width="100%" border="0" cellpadding="0"
					cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0"
								cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title' width='16%'>분　단　가</td>
									<td class="contant-center" width='16%'>
										<xsl:value-of select="format-number(unit_price,'#,###,###,###,###,###')" />원
									</td>
									<td class='title' width='16%'>근무시간(분)</td>
									<td class="contant-center"  width='16%'>
										<xsl:value-of select="ovr_tm" />분
									</td>
									<td class='title' width='16%'>합　　계</td>
									<td class="contant-center"  width='17%'>
										<xsl:value-of select="format-number(req_amt,'#,###,###,###,###,###')" />원
									</td>
								</tr>
							</table>
						</td>
					</tr>
				 </table>					
				
			</body>
	</xsl:template>
</xsl:stylesheet>