<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
			<BODY>
				<script type="text/javascript">
				<![CDATA[
					function openBidOrdPop(tmpReqNo){
						var url = "http://apr.kitech.re.kr/processparticipant/worklist/workitemHandler.jsp?reqno="+tmpReqNo;
						window.open(url,"발주계획서","scrollbars=yes,toolbar=no,location=no,status=no,menubar=no,resizable=yes,width=900,height=800,left=100,top=100");
					}
				]]>
				</script>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">입찰개요</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="20%">입찰공고번호</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="selectEst/msgEpuEst/bid_noti_no" />
									</td>
									<td class='title2' width="20%">발주계획번호</td>
									<td class="contant">
										<a style="color: #0000FF;">
											<xsl:attribute name="href">javascript:openBidOrdPop('<xsl:value-of select="selectEst/msgEpuEst/bid_ord_no" />')</xsl:attribute>
											<xsl:value-of select="selectEst/msgEpuEst/bid_ord_no" />
										</a>
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">공고명</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="selectEst/msgEpuEst/bid_title" />
									</td>
									<td class='title2' width="20%">예가방식</td>
									<td class="contant">
										<xsl:value-of select="selectEst/msgEpuEst/multi_esti_pr_yn" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">개찰일시</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="substring(selectEst/msgEpuEst/openYMD, 1, 4)" />
										-
										<xsl:value-of select="substring(selectEst/msgEpuEst/openYMD, 5, 2)" />
										-
										<xsl:value-of select="substring(selectEst/msgEpuEst/openYMD, 7, 2)" />
										&#160;
										<xsl:value-of select="selectEst/msgEpuEst/openYMDHH" />
										:
										<xsl:value-of select="selectEst/msgEpuEst/openYMDMM" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">집행관</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="selectEst/msgEpuEst/exec_bsn" />
									</td>
									<td class='title2' width="20%">재무관</td>
									<td class="contant">
										<xsl:value-of select="selectEst/msgEpuEst/final_bsn" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">예가정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="20%">시장가격 조사금액</td>
									<td class="contant" style="width: 218.47px;text-align:right;">
										<xsl:if test="selectEst/msgEpuEst/market_price != ''">
											<xsl:value-of select="format-number(selectEst/msgEpuEst/market_price, '#,###,###,###')" />
											원
										</xsl:if>
									</td>
									<td class='title2' width="20%">원가 금액</td>
									<td class="contant" style="text-align:right;">
										<xsl:if test="selectEst/msgEpuEst/cost_price != ''">
											<xsl:value-of select="format-number(selectEst/msgEpuEst/cost_price, '#,###,###,###')" />
											원
										</xsl:if>
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">예정금액</td>
									<td class="contant" style="width: 218.47px;text-align:right;">
										<xsl:value-of select="format-number(selectEst/msgEpuEst/fianl_esti_pr, '#,###,###,###')" />
										원
									</td>
									<td class="contant" colspan="2" style="text-align:right;">
										<xsl:value-of select="selectEst/msgEpuEst/fianl_esti_kr_pr" />
										원정
									</td>
								</tr>
								<tr style="height:160px;">
									<td class='title2' width="20%" style="height:160px;">예정가격사유</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="selectEst/msgEpuEst/esti_contents" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<br />
				<xsl:if test="count(selectEst/msgEpuEst/attaches/vector/data/mdata) != 0">
					<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
						<TR>
							<TD class="head" align="left">첨부파일</TD>
						</TR>
						<TR>
							<TD class="body">
								<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<xsl:for-each select="selectEst/msgEpuEst/attaches/vector/data/mdata">
										<TR>
											<TD class="contant">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
													<xsl:value-of select="file_nm" />
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
	</xsl:template>
</xsl:stylesheet>