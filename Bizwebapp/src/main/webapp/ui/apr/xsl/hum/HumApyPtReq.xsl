<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="SAVE">
		<xsl:variable name="localPath" select="1" /> 
			<body>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="9%">신청번호</td>
									<td class="contant-center" width="15%">
										<xsl:value-of select="req_no" />
									</td>
									
									<td class='title2' width="6%">부서</td>
									<td class="contant-center" width="20%">
										<xsl:value-of select="sh_dept_nm" />
									</td>
									
									<td class='title2' width="6%">직급</td>
									<td class="contant-center" width="11%">
										<xsl:value-of select="sh_posi_nm" />
									</td>
									
									<td class='title2' width="6%">성명</td>
									<td class="contant-center" width="9%">
										<xsl:value-of select="sh_nm" />
									</td>
									
									<td class='title2' width="9%">개인번호</td>
									<td class="contant-center" width="9%">
										<xsl:value-of select="sh_empno" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td colspan="10" class='title2'>
										활용대상 정보
									</td>
								</tr>
								<xsl:for-each select="APY_LST/vector/data/msgHumApyPtInfo011">
								<tr>
									<td width="13%" class='title'>성명</td>
									<td width="12%" class='title'>
										생년월일
									</td>
									<td width="13%" class='title'>
										활용시작일
									</td>
									<td width="13%" class='title'>
										활용종료일
									</td>
									<td width="14%" class='title'>
										NST 접수번호
									</td>
									<td width="10%" class='title'>
										계정번호
									</td>
									<td width="10%" class='title'>
										비용코드
									</td>
									<td width="15%" colspan="3" class='title'>
										금액
									</td>
								</tr>
									<tr>
										<td class="contant-center">
											<xsl:value-of select="nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="substring(resid_no, 0, 7)" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="substring(pruse_orign_ymd,0,5)" />
											-
											<xsl:value-of select="substring(pruse_orign_ymd,5,2)" />
											-
											<xsl:value-of select="substring(pruse_orign_ymd,7,2)" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="substring(pruse_cls_ymd,0,5)" />
											-
											<xsl:value-of select="substring(pruse_cls_ymd,5,2)" />
											-
											<xsl:value-of select="substring(pruse_cls_ymd,7,2)" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="nst_num" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="accnt_no" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="expns_cd" />
										</td>
										<td colspan="3" class="contant-right">
											<xsl:value-of select="format-number(amt, '###,###,###')" />
										</td>
									</tr>
									<tr>
										<td class='title' align='center' colspan="4">과정명</td>
										<td class='title' align='center' colspan="2">이력서 및 자기소개서</td>
										<td class='title' align='center' colspan="2">증명서</td>
										<td class='title' align='center' colspan="2">훈련계약서</td>
									</tr>					
									<tr>
									<td class="contant" colspan="4">
											<xsl:value-of select="edu_course_region_nm" />
										</td>
										<td class="contant-center" colspan="2">
											<xsl:variable name="fileInfo1" select="his_attach_file_info" />
											<xsl:choose>
												<xsl:when test="$fileInfo1 != ''">
													<a>
														<xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="his_attach_file_info" />')
												</xsl:attribute>
														이력서 및 자기소개서
													</a>
												</xsl:when>
												<xsl:otherwise>
													-
												</xsl:otherwise>
											</xsl:choose>
										</td>
										<td class="contant-center" colspan="2">
											<xsl:variable name="fileInfo2" select="proof_attach_file_info" />
											<xsl:choose>
												<xsl:when test="$fileInfo2 != ''">
													<a>
														<xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="proof_attach_file_info" />')
												</xsl:attribute>
														증명서
													</a>
												</xsl:when>
												<xsl:otherwise>
													-
												</xsl:otherwise>
											</xsl:choose>
										</td>
										<td class="contant-center" colspan="2">
											<xsl:variable name="fileInfo3" select="contr_attach_file_info" />
											<xsl:choose>
												<xsl:when test="$fileInfo3 != ''">
													<a>
														<xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="contr_attach_file_info" />')
												</xsl:attribute>
														훈련계약서
													</a>
												</xsl:when>
												<xsl:otherwise>
													-
												</xsl:otherwise> 
											</xsl:choose>
										</td>
									</tr>
									<tr>
										<td class='title' align='center'>입금은행</td>
										<td class='title' colspan="3" align='center'>계좌번호</td>
										<td class='title' align='center'>예금주</td>
										<td class='title' colspan="5" align='center'>비고</td>
									</tr>
									<tr>
										<td class='contant-center'>
											<xsl:value-of select="bank_cd_nm" />
										</td>
										<td class='contant-center' colspan="3">
											<xsl:value-of  select="bankaccnt_no" />
										</td>
										<td class='contant-center'>
											<xsl:value-of  select="depstr_nm" />
										</td>
										<td class='contant-center' colspan="5">
											<xsl:value-of  select="rmk" />
										</td>
									</tr>
								</xsl:for-each>
								<TR>
									<td class="title2">첨부파일</td>
									<td class="contant-center" colspan="9">
										<xsl:for-each select="fileList_C/vector/data/mdata">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA003')</xsl:attribute>
												<xsl:value-of select="file_nm" /><br/>
											</a>
										</xsl:for-each>
									</td>
								</TR>
							</table>
						</td>
					</tr>
				</table>
				<iframe name="ifr" height="0" width="0" />
			</body>
	</xsl:template>
</xsl:stylesheet>