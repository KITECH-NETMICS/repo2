<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/"> 
		<xsl:variable name="localPath" select="1" />
			<BODY>
				<form name="frmXsl" target="blank" action="https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
					<INPUT type="hidden" name="FilePath" size="25" />
					<INPUT type="hidden" name="orgFileName" size="25" />
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="body">
								<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
									<tr>
										<td width="15%" class="title2">신청번호</td>
										<td width="20%" class="contant">
											<xsl:value-of select="root/reqVo/req_no" />
										</td>
										<td width="15%" class="title2">소장처(센터)</td>
										<td width="16%" class="contant">
											<xsl:value-of select="root/reqVo/centr_cd" />
										</td>
										<td width="13%" class="title2">신청일자</td>
										<td width="20%" class="contant">
											<xsl:value-of select="root/reqVo/ymd" />
										</td>
									</tr>
									<tr>
										<td class="title2">구입구분</td>
										<td width="16%" class="contant">
											<xsl:value-of select="root/reqVo/book_pur_typ_nm" />
										</td>
										<td class="title2">계정번호</td>
										<td width="25%" class="contant">
											(
											<xsl:choose>
												<xsl:when test="root/reqVo/book_pur_typ = 'BEH001'">
													<xsl:value-of select="root/reqVo/accnt_no" />
												</xsl:when>
												<xsl:when test="root/reqVo/book_pur_typ = 'BEH002'">
													<xsl:value-of select="root/reqVo/accnt_cd" />
												</xsl:when>
											</xsl:choose>
											
											)
											<xsl:value-of select="root/reqVo/accnt_no_nm" />
										</td>
										<td width="13%" class="title2">비용코드</td>
										<td width="20%" class="contant">
											<xsl:value-of select="root/reqVo/expns_cd" />
										</td>
									</tr>
									<tr>
										<td class="title2">신청자</td>
										<td width="16%" class="contant">
											<xsl:value-of select="root/reqVo/req_psn_nm" />
										</td>
										<td class="title2">대출자</td>
										<td width="16%" class="contant">
											<xsl:value-of select="root/reqVo/loan_psn_nm" />
											<xsl:value-of select="root/reqVo/loan_psn_empno" />
										</td>
										<td class="title2">계정만료일자</td>
										<td width="20%" class="contant">
											<xsl:value-of select="root/reqVo/accnt_expir_ymd" />
										</td>

									</tr>
									<tr>
										<td class="title2">통화단위</td>
										<td width="16%" class="contant">
											<xsl:value-of select="root/reqVo/curncy_unit_nm" />
										</td>
										<td class="title2">전체신청권수</td>
										<td width="16%" class="contant">
											<xsl:text disable-output-escaping="yes"></xsl:text>
											<xsl:text disable-output-escaping="yes"></xsl:text>
											<xsl:value-of select="root/reqVo/req_qty" />
											권
										</td>
										<td width="13%" class="title2">전체금액</td>
										<td width="20%" class="contant">
											<xsl:value-of select="format-number(root/reqVo/tot_expns,'#,###,###,###,###,###')" />
											원

										</td>
									</tr>
									<tr>
										<td class="title2">정보출처(URL)</td>
										<td width="16%" colspan="5" class="contant">
											<xsl:value-of select="root/reqVo/book_info_url" />
										</td>
									</tr>
									<tr>
										<td class="title2">주기사항</td>
										<td width="16%" colspan="5" class="contant">
											<xsl:value-of select="root/reqVo/cycle_item" />
										</td>
									</tr>

									<tr>
										<td class="title2">첨부파일</td>
										<td colspan='5' class="contant">
											<xsl:for-each select="root/fileList">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA013')</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
											</xsl:for-each>
										</td>
									</tr>

								</table>
							</td>
						</tr>
					</table>
					<table width="100%" class="aproutertable">
						<tr>
							<td class="head">신청도서</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" class="aprinnertable">
									<tr>
										<td class="title">도서명</td>
										<td class="title">저자명</td>
										<td class="title">출판사</td>
										<td class="title">출판년도</td>
										<td class="title">신청권수</td>
										<td class="title">단가(현지화)</td>
										<td class="title">합계(원)</td>

									</tr>
									<xsl:for-each select="root/bookList">
										<xsl:variable name="bookNm" select="book_nm" />
										<xsl:variable name="authNm" select="auth_nm" />
										<xsl:variable name="publYr" select="publ_yr" />
										<xsl:variable name="reqQty" select="req_qty" />
										<xsl:variable name="unitAmt" select="unit_amt" />
										<xsl:variable name="totExpns" select="tot_expns" />
										<xsl:variable name="issuAgncy" select="issu_agncy" />
										<tr>
											<td width="20%" class="contant">
												<xsl:value-of select="$bookNm" />
											</td>
											<td width="10%" class="contant">
												<xsl:value-of select="$authNm" />
											</td>
											<td width="10%" class="contant">
												<xsl:value-of select="$issuAgncy" />
											</td>
											<td width="5%" class="contant-center">
												<xsl:value-of select="$publYr" />
											</td>
											<td width="5%" class="contant-right">
												<xsl:value-of select="$reqQty" />
											</td>
											<td width="10%" class="contant-right">
												<xsl:value-of select="format-number($unitAmt, '#,###,###,###')" />
											</td>
											<td width="5%" class="contant-right">
												<xsl:value-of select="format-number($totExpns,'#,###,###,###')" />
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</form>
				<iframe name="ifr" height="0" width="0"></iframe>
			</BODY>
	</xsl:template>
</xsl:stylesheet>