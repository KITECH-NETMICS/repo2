<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/response">
		<xsl:variable name="localPath" select="request/localPath" />
		<html lang="kr">
			<BODY>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="16%">계약해지신청번호</td>
									<td class="contant">
										<xsl:value-of select="selectMaster/msgEpuContrctCancSS01/contrct_canc_req_no" />
									</td>
									<td class='title2' width="16%">계약구분</td>
									<td class="contant">
										<xsl:value-of select="selectMaster/msgEpuContrctCancSS01/pur_grp_desc" />
									</td>
								</tr>
								<tr>
									<td class='title2'>구매계약번호</td>
									<td class="contant">
										<xsl:value-of select="selectMaster/msgEpuContrctCancSS01/contrct_no" />-<xsl:value-of select="selectMaster/msgEpuContrctCancSS01/chng_seq" />
									</td>
									<td class='title2'>계약방법</td>
									<td class="contant">
										<xsl:value-of select="selectMaster/msgEpuContrctCancSS01/contrct_way_desc" />
									</td>
								</tr>
								<tr>
									<td class='title2'>계약명</td>
									<td class="contant">
										<xsl:value-of select="selectMaster/msgEpuContrctCancSS01/contrct_nm" />
									</td>
									<td class='title2'>계약일자</td>
									<td class="contant">
										<xsl:value-of select="substring(selectMaster/msgEpuContrctCancSS01/contrct_ymd, 1, 4)" />-<xsl:value-of select="substring(selectMaster/msgEpuContrctCancSS01/contrct_ymd, 5, 2)" />-<xsl:value-of select="substring(selectMaster/msgEpuContrctCancSS01/contrct_ymd, 7, 2)" />
									</td>
								</tr>
								<tr>
									<td class='title2'>계약금액</td>
									<td class="contant">
										<xsl:value-of select="selectMaster/msgEpuContrctCancSS01/contrct_tot_amt" />
									</td>
									<td class='title2'>계약해지신청일자</td>
									<td class="contant">
										<xsl:value-of select="substring(selectMaster/msgEpuContrctCancSS01/canc_req_ymd, 1, 4)" />-<xsl:value-of select="substring(selectMaster/msgEpuContrctCancSS01/canc_req_ymd, 5, 2)" />-<xsl:value-of select="substring(selectMaster/msgEpuContrctCancSS01/canc_req_ymd, 7, 2)" />
									</td>
								</tr>
								<tr>
									<td class='title2'>계약해지사유</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="selectMaster/msgEpuContrctCancSS01/canc_resn" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 첨부파일</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<xsl:for-each select="fileList_J/vector/data/msgXomxComAttachFileMS01">
									<tr>
										<td class="contant">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
												<xsl:value-of select="org_file" />
											</a>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<xsl:if test="selectMaster/msgEpuContrctCancSS01/contrct_g2b_clsf_cd != 'PRG010'">
					<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
						<TR>
							<TD class="head" align="left">계약구비서류</TD>
						</TR>
						<TR>
							<TD class="body">
								<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<xsl:if test="count(fileList_A/vector/data)!=0">
										<xsl:for-each select="fileList_A/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">계약이행보증보험증권</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
									<xsl:if test="count(fileList_B/vector/data)!=0">
										<xsl:for-each select="fileList_B/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">최종견적서</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
									<xsl:if test="count(fileList_C/vector/data)!=0">
										<xsl:for-each select="fileList_C/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">원가산출내역서</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
									<xsl:if test="count(fileList_D/vector/data)!=0">
										<xsl:for-each select="fileList_D/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">사용인감계 및 입금계좌신고서</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
									<xsl:if test="count(fileList_E/vector/data)!=0">
										<xsl:for-each select="fileList_E/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">입금통장 사본</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
									<xsl:if test="count(fileList_F/vector/data)!=0">
										<xsl:for-each select="fileList_F/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">사업자등록증 사본</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
									<xsl:if test="count(fileList_G/vector/data)!=0">
										<xsl:for-each select="fileList_G/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">법인인감증명서</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
									<xsl:if test="count(fileList_H/vector/data)!=0">
										<xsl:for-each select="fileList_H/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">법인등기부등본</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
								</TABLE>
							</TD>
						</TR>
					</TABLE>
				</xsl:if>
				<xsl:if test="selectMaster/msgEpuContrctCancSS01/contrct_g2b_clsf_cd = 'PRG010'">
					<xsl:if test="count(selectG2BAttach/vector/data)!=0">
						<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
							<TR>
								<TD class="head" align="left">계약서 관련 조달청 첨부파일</TD>
							</TR>
							<TR>
								<TD class="body">
									<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
										<xsl:for-each select="selectG2BAttach/vector/data/msgEpuConG2BAttach">
											<TR>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA110')</xsl:attribute>
														<xsl:value-of select="real_file_nm" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</TABLE>
								</TD>
							</TR>
						</TABLE>
					</xsl:if>
				</xsl:if>
				<xsl:if test="count(fileList_P/vector/data)!=0">
					<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
						<TR>
							<TD class="head" align="left">계약서 관련 첨부파일</TD>
						</TR>
						<TR>
							<TD class="body">
								<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<xsl:for-each select="fileList_P/vector/data/msgXomxComAttachFileMS01">
										<TR>
											<TD class="contant">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
													<xsl:value-of select="org_file" />
												</a>
											</TD>
										</TR>
									</xsl:for-each>
								</TABLE>
							</TD>
						</TR>
					</TABLE>
				</xsl:if>
			</BODY>
		</html>
	</xsl:template>
</xsl:stylesheet>