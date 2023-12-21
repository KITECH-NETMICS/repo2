<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<body>
				<script language="javascript">
		<![CDATA[
				
			function createForm(nm, tg, act, met){
				var cForm = document.createElement("form"); 
				cForm.name = nm;
				cForm.target = tg;
				cForm.action = act;
				cForm.method = met;
					return cForm;
				}
				
				function createHidden(nm, val, frm){
					/*IE9, IE10, 크롬 등에서 호환성 보기 없이 실행되도록 보완(2013.07.31)*/
				var hiddenInput=document.createElement("input");				
					
				hiddenInput.setAttribute("type", "hidden");
				hiddenInput.setAttribute("name", nm);
				hiddenInput.setAttribute("value", val);
				frm.appendChild(hiddenInput);
				
				return frm;
			}
		]]>
				</script>

				<!-- <script type="javascript" src="/kitech/com/js/snapCommon.js"></script> -->

				<form name="frmXsl" target="blank"
					action="https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp"
					method="get">
					<INPUT type="hidden" name="FilePath" size="25" />
					<INPUT type="hidden" name="orgFileName" size="25" />

					<TABLE cellspacing="0" cellpadding="0" border="0" width="860px">
						<TR>
							<TD>
								<table class="aproutertable" width="100%">
									<tr>
										<td width='100%' class='head'>발명기본정보내역</td>
									</tr>
									<TR>
										<TD class="body">
											<table class="aprinnertable" width="100%">
												<tr>
													<td width='15%' class='title'>신청번호</td>
													<td width='35%' class='contant-center'>
														<xsl:value-of select="APPROVAL/patmastr/req_no" />
													</td>
													<td width='15%' class='title'>권리구분</td>
													<td width='35%' class='contant-center'>
														<xsl:value-of select="APPROVAL/patmastr/pat_clsf_nm" />
													</td>
												</tr>
												<tr>
													<td width='15%' class='title'>기술분류</td>
													<td width='35%' class='contant-center'>
														<xsl:value-of select="APPROVAL/patmastr/tech_clsf" />
													</td>

													<td width='15%' class='title'>발명구분</td>
													<xsl:choose>
														<xsl:when test="APPROVAL/patmastr/invnt_clsf = 'PBT030'">
															<td width='35%' class='contant-center'>개인명의특허</td>
														</xsl:when>
														<xsl:when test="APPROVAL/patmastr/invnt_clsf = 'PBT040'">
															<td width='35%' class='contant-center'>외부발명자</td>
														</xsl:when>
													</xsl:choose>
												</tr>
												<tr>
													<td width='15%' class='title'>직무발명의 명칭</td>
													<td width='35%' colspan='3' class='contant'>
														<xsl:value-of select="APPROVAL/patmastr/invnt_krn_nm" />
													</td>
												</tr>
											</table>
										</TD>
									</TR>
								</table>

								<table class="aproutertable" width="100%">
									<tr>
										<td width='100%' class='head'>출원인</td>
									</tr>
									<TR>
										<TD class="body">
											<table class="aprinnertable" width="100%">
												<tr>
													<td width='8%' class='title'>구분</td>
													<td width='22%' class='title'>업체명</td>
													<td width='8%' class='title'>권리지분</td>
													<xsl:if test="APPROVAL/patmastr/vend_type ='2'">
														<td width='15%' class='title'>주민번호</td>
													</xsl:if>
													<xsl:if test="APPROVAL/patmastr/vend_type ='1'">
													<td width='15%' class='title'>사업자등록번호</td>
													</xsl:if>
													<td width='8%' class='title'>대표자</td>
													<td width='15%' class='title'>연락처</td>
													<td width='24%' class='title'>주소</td>
												</tr>
												<xsl:for-each
													select="APPROVAL/SmitVend/vector/data/msgPatAppCosmitAppVendMS01">
													<tr>
														<td class='contant-center'>
															<xsl:value-of select="vend_type" />
														</td>
														<td class='contant-center'>
															<xsl:value-of select="vend_nm" />
														</td>
														<td class='contant-center'>
															<xsl:value-of select="stake_rt" />
														</td>
														<td class='contant-center'>
															<xsl:value-of select="vend_bsn_no" />
														</td>
														<td class='contant-center'>
															<xsl:value-of select="charg" />
														</td>
														<td class='contant-center'>
															<xsl:value-of select="contac_loc" />
														</td>
														<td class='contant'>
															<xsl:value-of select="addr" />
														</td>
													</tr>
												</xsl:for-each>
											</table>
										</TD>
									</TR>
								</table>

								<table class="aproutertable" width="100%">
									<tr>
										<td width='100%' class='head'>자유발명자</td>
									</tr>
									<TR>
										<TD class="body">
											<table class="aprinnertable" width="100%">
												<tr>
													<td width='8%' class='title'>주발명자</td>
													<td width='8%' class='title'>소속구분</td>
													<td width='10%' class='title'>성명</td>
													<td width='15%' class='title'>주민번호</td>
													<td width='10%' class='title'>개인번호</td>
													<td width='8%' class='title'>지분(%)</td>
													<td width='12%' class='title'>연락처</td>
													<td width='13%' class='title'>소속</td>
													<td width='16%' class='title'>이메일</td>
												</tr>
												<xsl:for-each select="APPROVAL/InvntPsn/vector/data/msgPatAppCoinvntPsnMS01">
													<tr>
														<xsl:choose>
															<xsl:when test="invnt_psn_clsf = '1'">
																<td class='contant-center'> V</td>
															</xsl:when>
															<xsl:when test="invnt_psn_clsf != '1'">
																<td class='contant-center'>
																</td>
															</xsl:when>
														</xsl:choose>
														<td class='contant-center'>
															<xsl:value-of select="blong_clsf" />
														</td>
														<td class='contant-center'>
															<xsl:value-of select="nm_krn" />
														</td>
														<td class='contant-center'>
															<xsl:value-of select="resid_regst_no" />
														</td>
														<td class='contant-center'>
															<xsl:value-of select="syspayno" />
														</td>
														<td class='contant-right'>
															<xsl:value-of select="stake_rt" />
														</td>
														<td class='contant-center'>
															<xsl:value-of select="contac_loc" />
														</td>
														<td class='contant-center'>
															<xsl:value-of select="blong_nm" />
														</td>
														<td class='contant'>
															<xsl:value-of select="email" />
														</td>
													</tr>
												</xsl:for-each>
											</table>
										</TD>
									</TR>
								</table>

								<table class="aproutertable" width="100%">
									<tr>
										<td width='100%' class='head'></td>
									</tr>
									<TR>
										<TD class="body">
											<table class="aprinnertable" cellspacing="0"
												cellpadding="0" border="0" width="100%">
												<xsl:if test="APPROVAL/patmastr/pat_clsf = 'PAT070' or patmastr/pat_clsf = 'PAT020'">
													<tr>
														<td width='15%' class='title2'>배경(종래)기술</td>
														<td width='35%' colspan='3' class='contant'>
															<xsl:value-of select="APPROVAL/patmastr/tech_field" />
														</td>
													</tr>
													<tr>
														<td width='15%' class='title2'>과제해결수단</td>
														<td width='35%' colspan='3' class='contant'>
															<xsl:value-of select="APPROVAL/patmastr/solve_task" />
														</td>
													</tr>
													<tr>
														<td width='15%' class='title2'>상세한 설명</td>
														<td width='35%' colspan='3' class='contant'>
															<xsl:value-of select="APPROVAL/patmastr/trans_nm" />
														</td>
													</tr>
													<tr>
														<td width='15%' class='title2'>발명의 효과</td>
														<td width='35%' colspan='3' class='contant'>
															<xsl:value-of select="APPROVAL/patmastr/invnt_efct" />
														</td>
													</tr>
													<tr>
														<td width='15%' class='title2'>관련특허</td>
														<td width='35%' colspan='3' class='contant'>
															<xsl:value-of select="APPROVAL/patmastr/relat_invnt" />
														</td>
													</tr>
												</xsl:if>
												
												<tr>
													<td width='15%' class='title2'>발명을 하게된 경위</td>
													<td width='35%' colspan='3' class='contant'>
														<xsl:value-of select="APPROVAL/patmastr/indst_use_clsf" />
													</td>
												</tr>
												<tr>
													<td width='15%' class='title2'>도면첨부</td>
													<td width='35%' colspan='3' class='contant'>
														<xsl:for-each
															select="APPROVAL/fileList_B/vector/data/mdata">
															<a>
																<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of
																	select="attach_file_no" /><xsl:value-of
																	select="seq" />','XAA016')</xsl:attribute>
																<xsl:value-of select="file_nm" />
																<br />
															</a>
														</xsl:for-each>
													</td>
												</tr>
												<tr>
													<td width='15%' class='title2'>기술설명서</td>
													<td width='35%' colspan='3' class='contant'>
														<xsl:for-each
															select="APPROVAL/fileList_A/vector/data/mdata">
															<a>
																<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of
																	select="attach_file_no" /><xsl:value-of
																	select="seq" />','XAA016')</xsl:attribute>
																<xsl:value-of select="file_nm" />
																<br />
															</a>
														</xsl:for-each>
													</td>
												</tr>
												<tr>
													<td width='15%' class='title2'>자유발명신고서</td>
													<td width='35%' colspan='3' class='contant'>
														<xsl:for-each
															select="APPROVAL/fileList_C/vector/data/mdata">
															<a>
																<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of
																	select="attach_file_no" /><xsl:value-of
																	select="seq" />','XAA016')</xsl:attribute>
																<xsl:value-of select="file_nm" />
																<br />
															</a>
														</xsl:for-each>
													</td>
												</tr>
											</table>
										</TD>
									</TR>
								</table>
								<xsl:choose>
									<xsl:when test="APPROVAL/patmastr/pat_clsf = 'PAT040'">
										<table class="aproutertable" width="100%">
											<tr>
												<td width='100%' class='head'>디자인</td>
											</tr>
											<TR>
												<TD class="body">
													<table class="aprinnertable" width="100%">
														<xsl:if test="APPROVAL/TabData/pre_desn_nm != ''">
															<tr>
																<td width='15%' class='title'>명칭</td>
																<td width='85%' class='contant'>
																	<xsl:value-of select="TabData/pre_desn_nm" />
																</td>
															</tr>
														</xsl:if>
														<tr>
															<td class='title'>첨부도면</td>
															<td class='contant'>
																<xsl:for-each
																	select="APPROVAL/fileList_D/vector/data/mdata">
																	<a>
																		<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of
																			select="attach_file_no" /><xsl:value-of
																			select="seq" />','XAA016')</xsl:attribute>
																		<xsl:value-of select="file_nm" />
																		<br />
																	</a>
																</xsl:for-each>
															</td>
														</tr>
														<tr>
															<td class='title'>선행디자인</td>
															<td class='contant'>
																<xsl:value-of select="TabData/pre_desn_ex" />
															</td>
														</tr>
														<tr>
															<td class='title'>선행디자인명</td>
															<td class='contant'>
																<xsl:value-of select="TabData/pre_desn_nm" />
															</td>
														</tr>
														<tr>
															<td class='title'>디자인상세</td>
															<td class='contant'>
																<xsl:value-of select="TabData/desn_detls_desc" />
															</td>
														</tr>
													</table>
												</TD>
											</TR>
										</table>
										<table class="aproutertable" width="100%">
											<tr>
												<td width='100%' class='head'>발명내용 첨부</td>
											</tr>
											<TR>
												<TD class="body">
													<table class="aprinnertable" width="100%">
														<tr>
															<td width='15%' class='title'>첨부파일</td>
															<td width='85%' class='title'>파일내용</td>
														</tr>
														<xsl:for-each select="APPROVAL/ATTCHGRID/vector/data/msgPatAppAttachMS01">
															<tr>
																<td class='contant'>
																	<xsl:value-of select="attach_file_no" />
																</td>
																<td class='contant'>
																	<xsl:value-of select="desc" />
																</td>
															</tr>
														</xsl:for-each>
													</table>
												</TD>
											</TR>
										</table>
									</xsl:when>

									<xsl:when test="APPROVAL/patmastr/pat_clsf = 'PAT030'">
										<table class="aproutertable" width="100%">
											<tr>
												<td width='100%' class='head'>상표</td>
											</tr>
											<TR>
												<TD class="body">
													<table class="aprinnertable" cellspacing="0"
														cellpadding="0" border="0" width="100%">
														<tr>
															<td width='15%' class='title'>상표명</td>
															<td width='85%' class='contant'>
																<xsl:value-of select="TabData/tm_mean" />
															</td>
														</tr>
														<tr>
															<td class='title'>첨부파일</td>
															<td class='contant'>
																<xsl:for-each
																	select="APPROVAL/fileList_E/vector/data/mdata">
																	<a>
																		<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of
																			select="attach_file_no" /><xsl:value-of
																			select="seq" />','XAA016')</xsl:attribute>
																		<xsl:value-of select="file_nm" />
																		<br />
																	</a>
																</xsl:for-each>
															</td>
														</tr>
														<tr>
															<td class='title'>상표의 간단한 설명</td>
															<td class='contant'>
																<xsl:value-of select="TabData/tm_desc" />
															</td>
														</tr>
														<tr>
															<td class='title'>지정상품</td>
															<td class='contant'>
																<xsl:value-of select="TabData/appont_goods" />
															</td>
														</tr>
													</table>
												</TD>
											</TR>
										</table>
									</xsl:when>
								</xsl:choose>
							</TD>
						</TR>
					</TABLE>
				</form>
			</body>
	</xsl:template>
</xsl:stylesheet>