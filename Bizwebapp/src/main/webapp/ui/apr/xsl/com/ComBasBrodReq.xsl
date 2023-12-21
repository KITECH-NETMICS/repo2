<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
		
			<BODY>			
			<script language="javascript">
				<![CDATA[
					function xslFileDownload(path){
						var localPath = "/was/WebSphere/AppServer/profiles/AppSrv01/installedApps/kwas1Cell01/biz.ear/bizweb.war/kitechfiles/";
						var pathArr = path.split('/');
						var patReplace = pathArr.slice(0, (pathArr.length - 1)).join('/');
							patReplace = patReplace.split(',').join('');
						var loPath = localPath + patReplace.replace(/(^\s*)|(\s*$)/g, "");
						var orgFileName = pathArr[pathArr.length - 1];
						var frm = createForm("frmXsl", "ifr", "https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp", "get");
						frm = createHidden("FilePath", loPath, frm);
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
				<form name="frmXsl" target="blank" action="https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
					<INPUT type="hidden" name="FilePath" size="25" />
					<INPUT type="hidden" name="orgFileName" size="25" />
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">신청정보</td>
					</tr>
					<tr>
					     <td class="body">
					     	<table width="100%" class="aprinnertable">													
								<tr>
									<td width="11%" class="title2">신청번호</td>
									<td colspan="7" class="contant">
										<xsl:value-of
											select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_aply_no" />
									</td>									
								</tr>
								<tr>
									<td class="title2">성명</td>
									<td width="12%" class="contant">									
										<xsl:value-of
											select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_psn_krchar_nm" />
									</td>
									<td width="13%" class="title2">개인번호</td>
									<td width="11%" class="contant">									
										<xsl:value-of
											select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_aply_psn_no" />
									</td>
									<td width="11%" class="title2">아이디</td>
									<td width="9%" class="contant">
										<xsl:value-of
											select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_user_id" />
									</td>
									<td width="11%" class="title2">직급</td>
									<td width="16%" class="contant">
										<xsl:value-of
											select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_posi" />
									</td>
								</tr>							
								<tr>
									<td class="title2">소속(본부)</td>
									<td class="contant">
										<xsl:value-of
											select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_blong_divsn" />
									</td>
									<td class="title2">소속(부서)</td>
									<td class="contant">
										<xsl:value-of
											select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_blong_dept" />
									</td>
									<td class="title2">소속(팀)</td>
									<td class="contant">
										<xsl:value-of
											select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_blong_ofic" />
									</td>
									<td class="title2">연락처(HP)</td>
									<td class="contant">
										<xsl:value-of
											select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_mobile_no" />
									</td>
								</tr>		
								</table>
							</td>
						</tr>
					</table>
					<table class="aproutertable" width="100%">															
						<tr>
							<td class="head">신청내용</td>
						</tr>
						<tr>
							<td class="body">
								<table class="aprinnertable" width="100%">
									<tr>
										<td width="11%" class="title2">행사명</td>
										<td class="contant">
											<xsl:value-of
												select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_event_nm" />
										</td>
									</tr>
									<tr>
										<td width="11%" class="title2">행사일시</td>
										<td class="contant">
											<xsl:value-of
												select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_link_ymd" />
										</td>
									</tr>
									<tr>
										<td width="11%" class="title2">행사장소</td>
										<td class="contant">
											<xsl:value-of
												select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_event_plc" />
										</td>
									</tr>
									<tr>
										<td width="11%" class="title2">행사내용</td>
										<td class="contant">
											<xsl:value-of
												select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_event_contnt" />
										</td>
									</tr>
									<tr>
										<td width="11%" class="title2">방송목적</td>
										<td class="contant">
											<xsl:value-of
												select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_broad_goal" />
										</td>
									</tr>
									<tr>
										<td width="11%" class="title2">특이사항</td>
										<td class="contant">
											<xsl:value-of
												select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_item" />
										</td>
									</tr>			
									<tr>								
										<td class="title2">첨부파일</td>
										<td class="contant">
											<xsl:for-each select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/fileList_A/vector/data/msgXomxComAttachFileMS01">
												<a>
													<xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="full_path" />')</xsl:attribute>
													<xsl:value-of select="org_file" /><br/>
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