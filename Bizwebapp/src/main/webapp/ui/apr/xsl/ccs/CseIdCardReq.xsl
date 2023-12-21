<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	
	<xsl:template name="string-replace">
	  <xsl:param name="text" />
	  <xsl:param name="search" />
	  <xsl:param name="replace" />
	  <xsl:choose>
	    <xsl:when test="contains($text, $search)">
	      <xsl:value-of select="substring-before($text, $search)" />
	      <xsl:value-of select="$replace" />
	      <xsl:call-template name="string-replace">
	        <xsl:with-param name="text" select="substring-after($text, $search)" />
	        <xsl:with-param name="search" select="$search" />
	        <xsl:with-param name="replace" select="$replace" />
	      </xsl:call-template>
	    </xsl:when>
	    <xsl:otherwise>
	      <xsl:value-of select="$text" />
	    </xsl:otherwise>
	  </xsl:choose>
	</xsl:template>

	<xsl:template match="/">
			<BODY>
			<!-- script language="javascript">
			<![CDATA[
				function xslFileDownload(path){
					var localPath = "/was/IMIS_FILES/";
					var pathArr = path.split('/');
					var patReplace = pathArr.slice(0, (pathArr.length - 1)).join('/');
						patReplace = patReplace.split(',').join('');
					var loPath = localPath + patReplace.replace(/(^\s*)|(\s*$)/g, "");
					var orgFileName = pathArr[pathArr.length - 1];
					var frm = createForm("frmXsl", "ifr", "http://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp", "get");
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
			</script -->
			<form name="frmXsl" target="blank" action="http://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
				<INPUT type="hidden" name="FilePath" size="25" />
				<INPUT type="hidden" name="orgFileName" size="25" />
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
			    <tr>
				     <td class="body">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
							<tr>
								<td class="title2">신청번호</td>
								<td colspan="5" class="contant">
									<xsl:value-of
									select="request/updateInfo/req_no" />
								</td>
							</tr>
							<tr>
								<td rowspan="2" class="title2">소속</td>
								<td width="18%" rowspan="2" class="contant">
									<xsl:value-of
									select="request/updateInfo/issu_psn_dept_nm" />
								</td>
								
														
								<td class="title2">한글</td>
								<td width="20%" class="contant">
										<xsl:value-of
										select="request/updateInfo/issu_psn_krchar_nm" />
								</td>
								<td class="title2">개인번호</td>
								<td width="20%" class="contant">
									 <xsl:value-of
										select="request/updateInfo/emp_no" />
								</td>
							</tr>
							<tr>
								<td class="title2">영문</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/issu_psn_eng_nm" />
								</td>
								<td class="title2">직급</td>
								<td width="20%" class="contant">
									 <xsl:value-of
										select="request/updateInfo/issu_psn_posi_nm" />
								</td>
							</tr>
							<tr>
								<td class="title2">주민등록번호</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/resid_no" />							
								</td>
								<td class="title2">핸드폰번호</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/mobile_no" />
								</td>
								<td class="title2">구분</td>
								<td class="contant">
									<xsl:if test="contains(request/updateInfo/req_clsf, 'CSL001')">
										신규,
									</xsl:if>
									<xsl:if test="contains(request/updateInfo/req_clsf, 'CSL002')">
										불량,
									</xsl:if>
									<xsl:if test="contains(request/updateInfo/req_clsf, 'CSL003')">
										재발급
									</xsl:if>
								</td>
							</tr>					
							<tr>
								<td class="title2">입원일자</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/hotd_Fymd" />
								</td>
								<td class="title2">근무지</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/work_region_nm" />
								</td>
								<td class="title2">입금일자</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_depst_ymd" />
								</td>
							</tr>							
							<tr>
								<td class="title2">대상</td>
								<td class="contant">
									<xsl:if test="contains(request/updateInfo/req_target, 'CSX001')">
										신분증,
									</xsl:if>
									<xsl:if test="contains(request/updateInfo/req_target, 'CSX002')">
										출퇴근,
									</xsl:if>
									<xsl:if test="contains(request/updateInfo/req_target, 'CSX003')">
										신분증 및 출퇴근카드
									</xsl:if>
								</td>
								<td class="title2">재발급 요청사유</td>
								<td colspan="3" class="contant">
									<xsl:variable name="replacedText">
										<xsl:call-template name="string-replace">
											<xsl:with-param name="text" select="request/updateInfo/apr_reissu_req_resn"/>
											<xsl:with-param name="search" select="'&lt;br&gt;'" />
											<xsl:with-param name="replace" select="'&lt;br/&gt;'" />
										</xsl:call-template>
									</xsl:variable>
									<xsl:value-of select="$replacedText" disable-output-escaping="yes" />
								</td>
							</tr>		
							<tr>
								<td class="title2">첨부파일</td>
								<td colspan="5" class="contant">
									<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
										<xsl:for-each select="request/updateInfo/fileList_A/vector/data">
											<TR>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="mdata/attach_file_no" /><xsl:value-of select="mdata/seq" />','XAA006')</xsl:attribute>
														<xsl:value-of select="mdata/file_nm" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</TABLE>
								</td>
							</tr>							
						</table>
					</td>
				</tr>
			</table>
			<tr>
				<td height="10px">
				</td>
			</tr>
			<table class="aproutertable" width="100%">
				<tr>
			      <td class="body">
			        <table class="aprinnertable" width="100%">
			          <tr>
						<td class="contant">
						급여번호를 발급받은 이후에 신청하여 주시기 바랍니다.<br/>
						*발급대상분류 : 신분증[정규직원,별정직원,별정직(비상근),전문가,학생연구원]<br/>
						첨 부 : 반명함판사진 1매(3cm X 4cm)
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