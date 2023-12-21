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
  						var frm = createForm("frmXsl", "_blank", "https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp", "get");
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
				<xsl:if test="SAVEAPYTRAIN/sh_nm != ''">
					<table width="100%" border="0" cellpadding="0"
						cellspacing="0" class="aproutertable">
						<tr>
							<td class="body">
								<table width="100%" border="0"
									cellpadding="0" cellspacing="0" class="aprinnertable">
									<tr>
										<td class='title2' colspan="4">
											1. 인적사항
										</td>
									</tr>
									<tr>
										<td width="20%" class='title2'>
											성 명
										</td>
										<td class="contant">
											<xsl:value-of
												select="SAVEAPYTRAIN/sh_nm" />
										</td>
										<td width="14%" class='title2'>
											직 급
										</td>
										<td class="contant">
											<xsl:value-of
												select="SAVEAPYTRAIN/sh_posi_nm" />
										</td>
									</tr>
									<tr>
										<td class='title2'>부 서</td>
										<td colspan="3" class="contant">
											<xsl:value-of
												select="SAVEAPYTRAIN/sh_dept_nm" />
										</td>
									</tr>
									<tr>
										<td colspan="4" class='title2'>
											2. 교육훈련구분
										</td>
									</tr>
									<tr>
										<td class='title2'>교육구분</td>
										<td class='contant'>
											<xsl:value-of
												select="SAVEAPYTRAIN/sh_educ_typ_nm" />
										</td>
										<td class='title2'>교육종류</td>
										<td class='contant'>
											<xsl:value-of select="SAVEAPYTRAIN/sh_educ_cd_nm" />
										</td>
									</tr>
									<tr>
										<td class='title2'>교육형태(온/오프라인)</td>
										<td class='contant'>
											<xsl:if test="contains(sh_is_online, 't')">
												√
											</xsl:if>
										</td>
										<td class='title2'>해외개최</td>
										<td class='contant'>
											<xsl:if test="contains(sh_oversea_open_yn, 'Y')">
												√
											</xsl:if>
										</td>
									</tr>
									<tr>
										<td class='title2'>교육명</td>
										<td class='contant' colspan="3">
											<xsl:value-of
												select="SAVEAPYTRAIN/sh_educ_nm" />
										</td>
									</tr>
									<tr>
										<td class='title2'>교육기관</td>
										<td class='contant'>
											<xsl:value-of
												select="SAVEAPYTRAIN/sh_educ_agncy" />
										</td>
										<td class='title2'>교육기간</td>
										<td class='contant'>
											<xsl:value-of
												select="SAVEAPYTRAIN/sh_educ_ymd" />
										</td>
									</tr>
									<tr>
										<td class='title2'>교육시간</td>
										<td class='contant-right'>
											<xsl:value-of
												select="SAVEAPYTRAIN/sh_educ_time" />
											시간
										</td>
										<td class='title2'>교육비합계</td>
										<td class='contant-right'>
											<xsl:value-of
												select="format-number(SAVEAPYTRAIN/sh_educ_amt, '#,###,###,###,###,###')" />
										</td>
									</tr>
									<tr>
										<td class='title2'>계정</td>
										<td class='contant'>
											<xsl:value-of
												select="SAVEAPYTRAIN/sh_accnt_no" />
										</td>
										<td class='title2'>비용코드</td>
										<td class='contant'>
											<xsl:value-of
												select="SAVEAPYTRAIN/sh_expns_cd_nm" />
											(
											<xsl:value-of
												select="SAVEAPYTRAIN/sh_expns_cd" />
											)
										</td>
									</tr>
									<!-- 2015.06.23. 인재경영실 윤인옥 삭제 요청 -->
									<!-- 
									<tr>
										<td class='title2'>
											의무교육 이수 시간(선택)
										</td>
										<td class='contant' colspan="3">
											<xsl:value-of
												select="sh_duty_educ_complt_nm" />
										</td>
									</tr>
									-->
									<tr>
										<td class='title2' colspan="4">
											3. 주요 교육훈련 내용
										</td>
									</tr>
									<tr>
										<td class='contant' colspan="4">										
											<xsl:value-of
												select="SAVEAPYTRAIN/sh_educ_contnt" />										
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
						<xsl:if
							test="count(SAVEAPYTRAIN/fileList_A/vector/data/mdata)!=0">
							<TR>
								<TD class="body">
									<TABLE width="100%" border="0"
										cellpadding="0" cellspacing="0" class="aprinnertable">
										<xsl:for-each
											select="SAVEAPYTRAIN/fileList_A/vector/data/mdata">
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
					<br />
					<table width="100%" border="0" cellpadding="0" 
						cellspacing="0" class="aproutertable">
						<tr>
							<td class="body">
								<table width="100%" border="0"
									cellpadding="0" cellspacing="0" class="aprinnertable">
									<tr>
										<td class='title' colspan="8">
											교육 참가자 인적사항
										</td>
									</tr>
									<xsl:for-each
										select="SAVEAPYTRAIN/EDU_LST/vector/data/msgHumApyEduCpacp01">
										<tr>
											<td class='title'>순번</td>
											<td class='title'>부서</td>
											<td class='title'>개인번호</td>
											<td class='title'>성명</td>
											<td class='title'>직급</td>
											<td class='title'>교육비</td>
											<td class='title'>교육기간</td>
											<td class='title'>교육시간</td>
										</tr>
										<tr>
											<td class='contant'>
												<xsl:number
													count="SAVEAPYTRAIN/EDU_LST/vector/data" level="single"
													format="1-100" />
											</td>
											<td class='contant'>
												<xsl:value-of
													select="dept_nm" />
											</td>
											<td class='contant'>
												<xsl:value-of
													select="emp_no" />
											</td>
											<td class='contant'>
												<xsl:value-of
													select="nm" />
											</td>
											<td class='contant'>
												<xsl:value-of
													select="posi_nm" />
											</td>
											<td class='contant-right'>
												<xsl:value-of
													select="format-number(educ_amt, '#,###,###,###,###,###')" />
											</td>
											<td class='contant'>
												<xsl:value-of
													select="educ_ymd" />
											</td>
											<td class='contant-right'>
												<xsl:value-of
													select="educ_time" />
												시간
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>

				</xsl:if>

				<xsl:if test="createXslInfo/SAVEAPYTRAIN/sh_nm != ''">
					<table width="100%" border="0" cellpadding="0"
						cellspacing="0" class="aproutertable">
						<tr>
							<td class="body">
								<table width="100%" border="0"
									cellpadding="0" cellspacing="0" class="aprinnertable">
									<tr>
										<td class='title2' colspan="4">
											1. 인적사항
										</td>
									</tr>
									<tr>
										<td width="20%" class='title2'>
											성 명
										</td>
										<td class="contant">
											<xsl:value-of
												select="createXslInfo/SAVEAPYTRAIN/sh_nm" />
										</td>
										<td width="14%" class='title2'>
											직 급
										</td>
										<td class="contant">
											<xsl:value-of
												select="createXslInfo/SAVEAPYTRAIN/sh_posi_nm" />
										</td>
									</tr>
									<tr>
										<td class='title2'>부 서</td>
										<td colspan="3" class="contant">
											<xsl:value-of
												select="createXslInfo/SAVEAPYTRAIN/sh_dept_nm" />
										</td>
									</tr>
									<tr>
										<td colspan="4" class='title2'>
											2. 교육훈련구분
										</td>
									</tr>
									<tr>
										<td class='title2'>교육구분</td>
										<td class='contant'>
											<xsl:value-of
												select="createXslInfo/SAVEAPYTRAIN/sh_educ_typ_nm" />
										</td>
										<td class='title2'>교육종류</td>
										<td class='contant'>
											<xsl:value-of select="createXslInfo/SAVEAPYTRAIN/sh_educ_cd_nm" />
										</td>
									</tr>
									<tr>
										<td class='title2'>교육형태(온/오프라인)</td>
										<td class='contant'>
											<xsl:if test="contains(sh_is_online, 't')">
												√
											</xsl:if>
										</td>
										<td class='title2'>해외개최</td>
										<td class='contant'>
											<xsl:if test="contains(sh_oversea_open_yn, 'Y')">
												√
											</xsl:if>
										</td>
									</tr>
									<tr>
										<td class='title2'>교육명</td>
										<td class='contant' colspan="3">
											<xsl:value-of
												select="createXslInfo/SAVEAPYTRAIN/sh_educ_nm" />
										</td>
									</tr>
									<tr>
										<td class='title2'>교육기관</td>
										<td class='contant'>
											<xsl:value-of
												select="createXslInfo/SAVEAPYTRAIN/sh_educ_agncy" />
										</td>
										<td class='title2'>교육기간</td>
										<td class='contant'>
											<xsl:value-of
												select="createXslInfo/SAVEAPYTRAIN/sh_educ_ymd" />
										</td>
									</tr>
									<tr>
										<td class='title2'>교육시간</td>
										<td class='contant-right'>
											<xsl:value-of
												select="createXslInfo/SAVEAPYTRAIN/sh_educ_time" />
											시간
										</td>
										<td class='title2'>교육비합계</td>
										<td class='contant-right'>
											<xsl:value-of
												select="format-number(createXslInfo/SAVEAPYTRAIN/sh_educ_amt, '#,###,###,###,###,###')" />
										</td>
									</tr>
									<tr>
										<td class='title2'>계정</td>
										<td class='contant'>
											<xsl:value-of
												select="createXslInfo/SAVEAPYTRAIN/sh_accnt_no" />
										</td>
										<td class='title2'>비용코드</td>
										<td class='contant'>
											<xsl:value-of
												select="createXslInfo/SAVEAPYTRAIN/sh_expns_cd_nm" />
											(
											<xsl:value-of
												select="createXslInfo/SAVEAPYTRAIN/sh_expns_cd" />
											)
										</td>
									</tr>
									<!-- 2015.06.23. 인재경영실 윤인옥 삭제 요청 -->
									<!-- 
									<tr>
										<td class='title2'>
											의무교육 이수 시간(선택)
										</td>
										<td class='contant' colspan="3">
											<xsl:value-of
												select="sh_duty_educ_complt_nm" />
										</td>
									</tr>
									-->
									<tr>
										<td class='title2' colspan="4">
											3. 주요 교육훈련 내용
										</td>
									</tr>
									<tr>
										<td class='contant' colspan="4">										
											<xsl:value-of
												select="createXslInfo/SAVEAPYTRAIN/sh_educ_contnt" />										
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
						<xsl:if
							test="count(createXslInfo/SAVEAPYTRAIN/fileList_A/vector/data/mdata)!=0">
							<TR>
								<TD class="body">
									<TABLE width="100%" border="0"
										cellpadding="0" cellspacing="0" class="aprinnertable">
										<xsl:for-each
											select="createXslInfo/SAVEAPYTRAIN/fileList_A/vector/data/mdata">
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
					<br />
					<table width="100%" border="0" cellpadding="0" 
						cellspacing="0" class="aproutertable">
						<tr>
							<td class="body">
								<table width="100%" border="0"
									cellpadding="0" cellspacing="0" class="aprinnertable">
									<tr>
										<td class='title' colspan="8">
											교육 참가자 인적사항
										</td>
									</tr>
									<tr>
										<td class='title'>순번</td>
										<td class='title'>부서</td>
										<td class='title'>개인번호</td>
										<td class='title'>성명</td>
										<td class='title'>직급</td>
										<td class='title'>교육비</td>
										<td class='title'>교육기간</td>
										<td class='title'>교육시간</td>
									</tr>
									<xsl:for-each
										select="createXslInfo/SAVEAPYTRAIN/EDU_LST/vector/data/msgHumApyEduCpacp01">
										<tr>
											<td class='contant'>
												<xsl:number
													count="createXslInfo/SAVEAPYTRAIN/EDU_LST/vector/data" level="single"
													format="1-100" />
											</td>
											<td class='contant'>
												<xsl:value-of
													select="dept_nm" />
											</td>
											<td class='contant'>
												<xsl:value-of
													select="emp_no" />
											</td>
											<td class='contant'>
												<xsl:value-of
													select="nm" />
											</td>
											<td class='contant'>
												<xsl:value-of
													select="posi_nm" />
											</td>
											<td class='contant-right'>
												<xsl:value-of
													select="format-number(educ_amt, '#,###,###,###,###,###')" />
											</td>
											<td class='contant'>
												<xsl:value-of
													select="educ_ymd" />
											</td>
											<td class='contant-right'>
												<xsl:value-of
													select="educ_time" />
												시간
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>

				</xsl:if>


			</body>
	</xsl:template>
</xsl:stylesheet>