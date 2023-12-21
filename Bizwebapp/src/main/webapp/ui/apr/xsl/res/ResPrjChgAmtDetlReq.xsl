<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/APPROVAL">
		<xsl:variable name="localPath" select="request/localPath" />
			<body>
				<!-- [A]문서 타이틀 (시작) -->
				<!-- <table class="aproutertable" width="100%"> <tr> <td class="head" align='center'>기관주요사업 연구비변경신청</td> </tr> </table> -->
				<!-- [A]문서 타이틀 (종료) -->

				<!-- [B]변경기본정보 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">기본정보</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width='15%' class='title2'>과제번호</td>
									<td width='35%' class='contant'>
										<xsl:value-of select="prj_no" />
										(
										<xsl:value-of select="accnt_no" />
										)
									</td>
									<td width='15%' class='title2'>과제기간</td>
									<td width='35%' class='contant'>
										<xsl:value-of select="tot_resch_ymd" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>과제명</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="prj_nm" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>연구책임자</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="accnt_rspns_nm" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>변경차수</td>
									<td width='35%' class='contant'>
										<xsl:value-of select="chng_seq" />
									</td>
									<td width='15%' class='title2'>확정일자</td>
									<td width='35%' class='contant'>
										<xsl:value-of select="chng_decsn_ymd" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>관련공문</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="relat_offcldoc_no" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>관련근거</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="chng_resn" />
									</td>
								</tr>
							</table>
						</td>
					</tr>

				</table>
				<!-- [B]변경기본정보 (종료) -->

				<!-- [C]변경전 (시작) -->
				<table class="aproutertable" width="100%">

					<tr>
						<td class="head">연구비</td>
					</tr>

					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">

								<tr>
									<td class='title'>구분</td>
									<td class='title'>연구비(변경전)</td>
									<td class='title'>연구비(변경후)</td>
								</tr>
								<tr>
									<td class='title'> 정부출연금</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(gov_cntrbamt, '###,###,###,##0')" />
									</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(chng_gov_cntrbamt, '###,###,###,##0')" />
									</td> 
								</tr>
								<tr>
									<td class='title'> 국고보조금</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(gov_subsidy, '###,###,###,##0')" />
									</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(chng_gov_subsidy, '###,###,###,##0')" />
									</td> 
								</tr>
								<tr>
									<td class='title'> 지방비부담금(광역)</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(area_share_wide, '###,###,###,##0')" />
									</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(chng_area_share_wide, '###,###,###,##0')" />
									</td> 
								</tr>
								<tr>
									<td class='title'> 지방비부담금(기초)</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(area_share_base, '###,###,###,##0')" />
									</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(chng_area_share_base, '###,###,###,##0')" />
									</td> 
								</tr>
								<tr>
									<td class='title'> 자기부담금</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(self_share, '###,###,###,##0')" />
									</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(chng_self_share, '###,###,###,##0')" />
									</td> 
								</tr>
								<tr>
									<td class='title'> 기업현금</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(cmpy_cash, '###,###,###,##0')" />
									</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(chng_cmpy_cash, '###,###,###,##0')" />
									</td> 
								</tr>
								<tr>
									<td class='title'> 기업현물</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(cmpy_goods, '###,###,###,##0')" />
									</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(chng_cmpy_goods, '###,###,###,##0')" />
									</td> 
								</tr>
								<tr>
									<td class='title'> 상대국현물</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(contpat_goods, '###,###,###,##0')" />
									</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(chng_contpat_goods, '###,###,###,##0')" />
									</td> 
								</tr>
								<tr>
									<td class='title'> 지방정부현금</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(local_gov_cash, '###,###,###,##0')" />
									</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(chng_local_gov_cash, '###,###,###,##0')" />
									</td> 
								</tr>
								<tr>
									<td class='title'> 대학현금</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(univ_cash, '###,###,###,##0')" />
									</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(chng_univ_cash, '###,###,###,##0')" />
									</td> 
								</tr>
								<tr>
									<td class='title'> 기타현금</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(etc_cash, '###,###,###,##0')" />
									</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(chng_etc_cash, '###,###,###,##0')" />
									</td> 
								</tr>
								<tr>
									<td class='title'> 계</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(bf_sum_amt, '###,###,###,##0')" />
									</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(chng_sum_amt, '###,###,###,##0')" />
									</td> 
								</tr>
							</table>

						</td>
					</tr>

				</table>
				<!-- [C]변경전 (종료) -->

				<!-- [D]변경후 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">비목별연구비</td>
					</tr>

					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width='20%' class='title'>내부인건비Ⅰ</td>
									<td class='contant-right'>
										<xsl:value-of select="format-number(lab_cost, '###,###,###,##0')" />
									</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(chng_lab_cost, '###,###,###,##0')" />
									</td> 
								</tr>
								<tr>
									<td width='20%' class='title'>직접비</td>
									<td class='contant-right'>
										<xsl:value-of select="format-number(drct_cost, '###,###,###,##0')" />
									</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(chng_drct_cost, '###,###,###,##0')" />
									</td> 
								</tr>
								<tr>
									<td width='20%' class='title'>연구수당</td>
									<td class='contant-right'>
										<xsl:value-of select="format-number(resch_allow, '###,###,###,##0')" />
									</td> 
									<td class='contant-right'>
										<xsl:value-of select="format-number(chng_resch_allow, '###,###,###,##0')" />
									</td> 
								</tr>
							</table>

						</td>
					</tr>

				</table>
				<!-- [D]변경후 (종료) -->

				<!-- [E]첨부파일 (시작) -->
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 첨부파일</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<xsl:for-each select="fileList_C/vector/data/msgXomxComAttachFileMS01">
										<tr>
											<td class='title2' width="16%">
												<xsl:value-of select="position()" />
											</td>
											<td class='contant' width="84%">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA001')</xsl:attribute>
													<xsl:value-of select="org_file" />
												</a>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				<!-- [E]첨부파일 (종료) -->
			</body>
	</xsl:template>
</xsl:stylesheet>
