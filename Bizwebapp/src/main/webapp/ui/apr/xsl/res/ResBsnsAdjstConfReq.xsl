<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:LINS="http://www.inswave.com/LINS">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/APPROVAL">
		<xsl:variable name="localPath" select="request/localPath" />
			
			<BODY>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body" colspan="2">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="20%">신청번호 </td>
									<td class="contant-center" >
										<xsl:value-of select="req_no" />
									</td>
									<td class='title2' width="20%">신청자 / 신청일자</td>
									<td class="contant">
										<xsl:value-of select="req_psn_nm" /> / 
										<xsl:value-of select="substring(req_ymd, 1, 4)" />
										-
										<xsl:value-of select="substring(req_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(req_ymd, 7, 2)" />
									</td>
								</tr>
								<tr>
									<td class='title2'>참여유형</td>
									<td class="contant">
										<xsl:value-of select="prj_knd_nm" />
									</td>
									<xsl:choose>
										<xsl:when test="prj_knd ='RCA019'"> 
											<td class='title2'>주관기관명</td>
											<td class="contant" >
												<xsl:value-of select="vend_nm" />
											</td>
										</xsl:when>
										<xsl:otherwise> 
											<td class="contant" colspan="2"/>
										</xsl:otherwise>
									</xsl:choose>
								</tr>
								<tr>
									<td class='title2'>관계부처 </td>
									<td class="contant" colspan='3'>
										<xsl:value-of select="bsns_ofic_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>세부사업명 </td>
									<td class="contant" colspan='3'>
										<xsl:value-of select="bsns_nm_detls_bsns" />
									</td>
								</tr>
								<tr>
									<td class='title2'>책임자 </td>
									<td class="contant">
										<xsl:value-of select="resch_rspns_nm" />(<xsl:value-of select="resch_rspns_no" />)
									</td>
									<td class='title2'>부서</td>
									<td class="contant" >
										(<xsl:value-of select="dept_typ_nm" />)  <xsl:value-of select="dept_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>사업명 </td>
									<td class="contant" colspan='3'>
										<xsl:value-of select="bsns_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>RFP 번호 </td>
									<td class="contant" >
										<xsl:value-of select="rfp_no" />
									</td>
									<td class='title2'>공고번호 </td>
									<td class="contant" >
										<xsl:value-of select="bsns_noti_no" />
									</td>
								</tr>
								<tr>
									<td class='title2'>추진목적 및 주요내용</td>
									<td class="contant" colspan='3'>
										<xsl:value-of select="major_contnt" />
									</td>
								</tr>
								<tr>
									<td class='title2'>근거</td>
									<td class="contant" colspan='3'>
										<xsl:value-of select="req_cause_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>총연구기간</td>
									<td class="contant" >
										<xsl:value-of select="totl_prd" />
									</td>
									<td class='title2'>사업신청기한</td>
									<td class="contant">
										<xsl:value-of select="substring(prd_limit, 1, 4)" />
										-
										<xsl:value-of select="substring(prd_limit, 5, 2)" />
										-
										<xsl:value-of select="substring(prd_limit, 7, 2)" /> 
									</td>
								</tr>
								<tr>
									<td class='title2' colspan='2'>총사업비</td>
									<td class='title2' colspan='2'>우리원수행비</td>
								</tr>
								<tr>
									<td class='title2'>전체기간</td>
									<td class='title2'>당해연도</td>
									<td class='title2'>전체기간</td>
									<td class='title2'>당해연도</td>
								</tr>
								<tr>
									<td class='contant-right'><xsl:value-of select="format-number(totl_bsns_amt, '###,###,###,###')" /> 원</td>
									<td class='contant-right'><xsl:value-of select="format-number(cur_yr_bsns_amt, '###,###,###,###')" /> 원</td>
									<td class='contant-right'><xsl:value-of select="format-number(totl_perf_amt, '###,###,###,###')" /> 원</td>
									<td class='contant-right'><xsl:value-of select="format-number(cur_yr_perf_amt, '###,###,###,###')" /> 원</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				
				<!-- 첨부화일 -->
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 첨부파일</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<xsl:for-each select="fileList_A/vector/data/mdata">
										<tr>
											<td class='title2' width="16%"> <xsl:value-of select="position()" /></td>
											<td class='contant' width="84%">
												<a>
												  <xsl:attribute name="onclick">downloadForXsl('<xsl:value-of select="attach_file_no"/>
			                                                																   <xsl:value-of select="seq"/>', 'XAA001'
			                                                																 );return false;</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
			</BODY>
	</xsl:template>
</xsl:stylesheet>