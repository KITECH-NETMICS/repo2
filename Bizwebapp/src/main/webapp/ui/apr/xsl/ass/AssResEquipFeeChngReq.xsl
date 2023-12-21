<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="APPROVAL">
			<body>
				<table style="width:860px; " border='0' cellspacing='0'
					cellpadding='0'>
					<tr>
						<td>
							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head" style="width:100%; ">기본정보</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<td class="title2" style="width:22%; ">계정번호</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="accnt_no" />
												</td>
												<td class="title2" style="width:22%; ">신청번호/차수 </td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="req_no" />/<xsl:value-of select="degr" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">본부 부서명</td>
												<td class="contant" style="width:28% ;" colspan="3">
													<xsl:value-of select="divsn_dept_nm" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">성명(개인번호)</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="nm" />(<xsl:value-of select="empno" />)
												</td>
												<td class="title2" style="width:22%; ">직급 및 직책</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="posi_duty_nm" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">변경 전 한도금액</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="format-number(accm_lmt_amt, '#,###')" />													
												</td>
												<td class="title2" style="width:22%; ">변경 후 한도금액 </td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="format-number(req_amt, '#,###')" />
												</td>
											</tr>
											
											<tr>
												<td class="title2" style="width:22%; ">신청일자</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="req_ymd" />													
												</td>
												<td class="title2" style="width:22%; "> </td>
												<td class="contant" style="width:28% ;">
												</td>
											</tr>		
											<tr>
												<td class="title2" style="width:22%; ">첨부파일</td>
												<td class="contant" colspan="3">
													<xsl:for-each select="fileList_A/vector/data/mdata">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of
																select="seq" />','XAA015')</xsl:attribute>
															<xsl:value-of select="file_nm" />
														</a>
													</xsl:for-each>
												</td>
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