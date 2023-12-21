<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="localPath" />
		<html lang="kr">
			<BODY onload="slFileDownload()">
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
										<xsl:value-of select="selectTechNego/msgTecNegoMnt/bid_ord_no" />
									</td>
									<td class='title2' width="20%">발주계획번호</td>
									<td class="contant">
										<xsl:value-of select="selectTechNego/msgTecNegoMnt/bid_ord_no" />
										-
										<xsl:value-of select="selectTechNego/msgTecNegoMnt/ord_chg_no" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">공고명</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="selectTechNego/msgTecNegoMnt/bid_title" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">공고일자</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="selectTechNego/msgTecNegoMnt/noti_ymd" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">기술협상등록</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="20%">업체명</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="selectTechNego/msgTecNegoMnt/vend_nm" />
									</td>
									<td class='title2' width="20%">사업자등록번호</td>
									<td class="contant">
										<xsl:value-of select="selectTechNego/msgTecNegoMnt/bsns_psn_regst_no" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">대표자명</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="selectTechNego/msgTecNegoMnt/ceo_nm" />
									</td>
								</tr>
								<tr style="height:200px;">
									<td class='title2' width="20%" style="height:200px;">협상내용</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="selectTechNego/msgTecNegoMnt/nego_contents" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">기술평가대상</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title'>우선협상대상자</td>
									<td class='title'>사업자등록번호</td>
									<td class='title'>상호명</td>
									<td class='title'>대표자명</td>
									<td class='title'>기술점수</td>
									<td class='title'>가격점수</td>
									<td class='title'>종합점수</td>
								</tr>
								<xsl:for-each select="selectTechNego/selectTecVend/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:if test="msgEpuTecEval/chkRadio = '1'">
												협상대상업체
											</xsl:if>
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgEpuTecEval/bsns_psn_regst_no" />
										</td>
										<td class="contant">
											<xsl:value-of select="msgEpuTecEval/vend_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgEpuTecEval/ceo_nm" />
										</td>
										<td class="contant-center">
											<xsl:if test="msgEpuTecEval/tech_score != ''">
												<xsl:value-of select="format-number(msgEpuTecEval/tech_score, '#,###,###,###.0000')" />
											</xsl:if>
										</td>
										<td class="contant-center">
											<xsl:if test="msgEpuTecEval/price_score != ''">
												<xsl:value-of select="format-number(msgEpuTecEval/price_score, '#,###,###,###.0000')" />
											</xsl:if>
										</td>
										<td class="contant-center">
											<xsl:if test="msgEpuTecEval/tot_score != ''">
												<xsl:value-of select="format-number(msgEpuTecEval/tot_score, '#,###,###,###.0000')" />
											</xsl:if>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<xsl:if test="count(selectTechNego/fileList_P/vector/data)!=0">
					<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
						<TR>
							<TD class="head" align="left">첨부파일</TD>
						</TR>
						<TR>
							<TD class="body">
								<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<xsl:for-each select="selectTechNego/fileList_P/vector/data/msgXomxComAttachFileMS01">
										<TR>
											<TD class="contant">
												<a>
													<xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="attach_full_path" />/<xsl:value-of select="org_file" />')</xsl:attribute>
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