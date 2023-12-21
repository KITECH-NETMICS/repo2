<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<body>
				<table style="width:100%; " border='0' cellspacing='0' cellpadding='0'>
					<tr>
						<td>
							<table class="aproutertable" style="width:100%;">
								<tr>
									<td colspan="4" class="head" style="width:100%; ">제출정보</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" style="width:100%;">
											<tr>
												<td width="15%" class="title2">제출일자</td>
												<td width="35%" class="contant">
													<xsl:value-of select="request/APPROVAL/req_ymd"/>
												</td>
												<td width="15%" class="title2">접수번호</td>
												<td width="35%" class="contant">
													<xsl:value-of select="request/APPROVAL/req_no"/>
												</td>
											</tr>
											<tr>
												<td width="15%" class="title2">제출자</td>
												<td width="35%" class="contant">
													<xsl:value-of select="request/APPROVAL/req_nm"/>(<xsl:value-of select="request/APPROVAL/req_empno"/>)
												</td>
												<td width="15%" class="title2">직급</td>
												<td width="35%" class="contant">
													<xsl:value-of select="request/APPROVAL/req_posi"/>
												</td>
											</tr>
											<tr>
												<td width="15%" class="title2">본부</td>
												<td width="35%" class="contant">
													<xsl:value-of select="request/APPROVAL/req_divsn"/>
												</td>
												<td width="15%" class="title2">부서</td>
												<td width="35%" class="contant">
													<xsl:value-of select="request/APPROVAL/req_dept"/>
												</td>
											</tr>
											<tr>
												<td width="15%" class="title2">성과지표유형</td>
												<td width="35%" class="contant">
													<xsl:value-of select="request/APPROVAL/ind_type"/>
												</td>
												<td width="15%" class="title2">성과지표</td>
												<td width="35%" class="contant">
													<xsl:value-of select="request/APPROVAL/ind_cd"/>
												</td>
											</tr>
											<tr>
												<td width="15%" class="title2">주요내용</td>
												<td width="85%" height="100px" colspan="3" class="contant" style= "vertical-align:top;">
													<xsl:value-of select="request/APPROVAL/contents"/>
												</td>
											</tr>
											<tr>
												<td width="15%" class='title2'>첨부파일</td>
												<td width="85%" class='contant' colspan='3'>
													<xsl:for-each select="APPROVAL/attaches/vector/data/mdata">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq"/>','XAA015')</xsl:attribute>
															<xsl:value-of select="file_nm"/>
															<br />
														</a>
													</xsl:for-each>
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
							<table class="aproutertable" style="width:100%;">
								<tr>
									<td colspan="4" class="head">기여자</td>
								</tr>
								<tr>
									<td colspan="4" class="body">
										<table class="aprinnertable" style="width:100%;">
											<tr>
												<th class="title" style= "text-align:center;">순번</th>
												<th class="title" style= "text-align:center;">성명</th>
												<th class="title" style= "text-align:center;">개인번호</th>
												<th class="title" style= "text-align:center;">직급</th>
												<th class="title" style= "text-align:center;">본부</th>
												<th class="title" style= "text-align:center;">부서</th>
												<th class="title" style= "text-align:center;">기여율(%)</th>
											</tr>

											<xsl:for-each select="request/APPROVAL/doc1/vector/data/msgResAchindDtlMS01">
												<tr>
													<td class="contant-center" style="white-space:nowrap;text-align:center;">
														<xsl:value-of select="position()"/>
													</td>
													<td class="contant" style="white-space:nowrap;text-align:center;">
														<xsl:value-of select="nm"/>
													</td>
													<td class="contant-right" style="white-space:nowrap;text-align:center;">
														<xsl:value-of select="empno"/>
													</td>
													<td class="contant-right" style="white-space:nowrap;text-align:center;">
														<xsl:value-of select="posi_nm"/>
													</td>
													<td class="contant-right" style="white-space:nowrap;text-align:center;">
														<xsl:value-of select="divsn_dept_nm"/>
													</td>
													<td class="contant-center" style="white-space:nowrap;text-align:center;">
														<xsl:value-of select="dept_nm"/>
													</td>
													<td class="contant-right" style="white-space:nowrap;text-align:right;">
														<xsl:value-of select="format-number(rate, '#,###.##')"/>
													</td>
												</tr>
											</xsl:for-each>
											<tr>
												<th class="title" style= "text-align:center;" colspan="6">
													합 계
												</th>
												<th class="title" style= "text-align:right;">
													<xsl:value-of select="format-number(request/APPROVAL/columnfRate, '#,###.##')"/>%
												</th>
											</tr>
										</table>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</body>
	</xsl:template>
</xsl:stylesheet>