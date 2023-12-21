<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<BODY>
				<script>
					<![CDATA[
					function chngAmt(amt, expns, expnsNm, odr){
					document.getElementById("amt").innerHTML = amt;
					document.getElementById("expnsNm").innerHTML = expnsNm;
					} 
					]]>
				</script>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td class="title2" width="10%">신청구분</td>
									<td class="contant-center" width="25%">
										<xsl:value-of select="APPROVAL/BUDENFRCREQ/req_clsf" />
										<br />
									</td>
									<td class="title2" width="10%">신청번호</td>
									<td class="contant-center" width="25%">
										<xsl:value-of select="APPROVAL/BUDENFRCREQ/req_no" />
										<br />
									</td>
									<td class="title2" width="10%">통제번호</td>
									<td class="contant-center" width="25%">
										<xsl:attribute name="id">
											<xsl:text>ctrlNo1</xsl:text>
										</xsl:attribute>
										<xsl:value-of select="APPROVAL/BUDENFRCREQ/ctrl_no" />
										<br />
									</td>
								</tr>
								<tr>
									<td class="title2">신청일자</td>
									<td class="contant-center">
										<xsl:value-of select="substring(APPROVAL/BUDENFRCREQ/req_ymd,0,5)" />
										-
										<xsl:value-of select="substring(APPROVAL/BUDENFRCREQ/req_ymd,5,2)" />
										-
										<xsl:value-of select="substring(APPROVAL/BUDENFRCREQ/req_ymd,7,2)" />
										<br />
									</td>
									<td class="title2">신청자</td>
									<td class="contant-center">
										<xsl:value-of select="APPROVAL/BUDENFRCREQ/req_psn" />
										<br />
									</td>
									<td class="title2">신청부서</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/BUDENFRCREQ/req_dept" />
										<br />
									</td>
								</tr>
								<tr>
									<td class="title2">계정번호</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/BUDENFRCREQ/accnt_no" />
										<br />
									</td>
									<td class="title2">회계코드</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/BUDENFRCREQ/accnt_cd_abbr" />
										<br />
									</td>
									<td class="title2">비용코드</td>
									<td class="contant">
										<xsl:attribute name="id">
											<xsl:text>expnsCd1</xsl:text>
										</xsl:attribute>
										(
										<xsl:value-of select="APPROVAL/BUDENFRCREQ/expns_cd" />
										)
										<xsl:value-of select="APPROVAL/BUDENFRCREQ/expns_cd_nm" />
										<br />
									</td>
								</tr>
								<tr>
									<td class="title2">신청금액</td>
									<td class="contant-right">
										<xsl:attribute name="id">
											<xsl:text>reqAmt1</xsl:text>
										</xsl:attribute>
										<xsl:value-of select="format-number(APPROVAL/BUDENFRCREQ/req_amt, '#,###,###,###,###,###')" />
										<br />
									</td>
									<td class="title2">원인행위</td>
									<td class="contant-right">
										<xsl:attribute name="id">
											<xsl:text>causeAmt1</xsl:text>
										</xsl:attribute>
										<xsl:value-of select="format-number(APPROVAL/BUDENFRCREQ/enfrc_amt_cause, '#,###,###,###,###,###')" />
										<br />
									</td>
									<td class="title2">결의금액</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(APPROVAL/BUDENFRCREQ/unslip_amt, '#,###,###,###,###,###')" />
										<br />
									</td>
								</tr>
								<tr>
									<td class="title2">거래처</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/BUDENFRCREQ/vend_nm" />
										<br />
									</td>
									<td class="title2">통제상태</td>
									<td class="contant">
										<xsl:attribute name="id">
											<xsl:text>ctrlState1</xsl:text>
										</xsl:attribute>
										<xsl:value-of select="APPROVAL/BUDENFRCREQ/ctrl_state" />
										<br />
									</td>
									<td class="title2">비고</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/BUDENFRCREQ/rmk" />
										<br />
									</td>
								</tr>
								<tr>
									<td class="title2">통제일자</td>
									<td class="contant-center">
										<xsl:attribute name="id">
											<xsl:text>ctrlYmd1</xsl:text>
										</xsl:attribute>
										<xsl:if test="string-length(APPROVAL/BUDENFRCREQ/ctrl_ymd) = 8">
											<xsl:value-of select="substring(APPROVAL/BUDENFRCREQ/ctrl_ymd,0,5)" />
											-
											<xsl:value-of select="substring(APPROVAL/BUDENFRCREQ/ctrl_ymd,5,2)" />
											-
											<xsl:value-of select="substring(APPROVAL/BUDENFRCREQ/ctrl_ymd,7,2)" />
											<br />
										</xsl:if>
									</td>
									<td class="title2">통제자</td>
									<td class="contant-center">
										<xsl:attribute name="id">
											<xsl:text>ctrlPsn1</xsl:text>
										</xsl:attribute>
										<xsl:value-of select="APPROVAL/BUDENFRCREQ/ctrl_psn" />
										<br />
									</td>
									<td class="title2">편성단위</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/BUDENFRCREQ/fomat_unit" />
										<br />
									</td>
								</tr>
							</table>
						<p></p>
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
								<tr>
									<td class="body">
										<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
											<xsl:for-each select="APPROVAL/BUDENFRCREQ/fileList_A/vector/data/mdata">
												<tr>
													<td class="title2" width="16%">첨부파일(<xsl:value-of select="seq" />)</td>
													<td class="contant" width="84%">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select='attach_file_no' /><xsl:value-of select='seq' />", "XAA002")</xsl:attribute>
															<xsl:value-of select="file_nm" />
														</a>
													</td>
												</tr>
											</xsl:for-each>
										</table>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</BODY>
	</xsl:template>
</xsl:stylesheet>