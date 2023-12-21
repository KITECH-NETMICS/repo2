<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
			<body>
				<table class="aproutertable" width="100%">
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width='15%' class='title2'>신청번호</td>
									<td width='35%' class='contant'>
										<xsl:value-of select="APPROVALREQ/req_no" />
									</td>
									<td width='15%' class='title2'>연구책임자</td>
									<td width='35%' class='contant'>
										<xsl:value-of select="APPROVALREQ/req_psn_data" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>아이디어배경</td>
									<td width='35%' class='contant'>
										<xsl:value-of select="APPROVALREQ/idea_view" />
									</td>
									<td width='15%' class='title2'>과제유형</td>
									<td width='35%' class='contant'>
										<xsl:value-of select="APPROVALREQ/bsns_cd_clsf" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>차년도계획</td>
									<td width='35%' class='contant'>
										<xsl:value-of select="APPROVALREQ/bsns_cd_inout" />
									</td>
									<td width='15%' class='title2'>기술분류</td>
									<td width='35%' class='contant'>
										<xsl:value-of select="APPROVALREQ/tech_clsf" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>과제명</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/bsns_nm" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>총 예상연구기간</td>
									<td width='35%' class='contant'>
										<xsl:value-of select="APPROVALREQ/tot_resch_prd_term" />
									</td>
									<td width='15%' class='title2'>총 예상연구비</td>
									<td width='35%' class='contant-right'>
										<xsl:value-of select="format-number(APPROVALREQ/tot_resch_amt      , '###,###,###,###')" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>개발내용</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/dev_goal" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>지원필요성</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/supp_needs" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>활용분야<br>(기대효과)</br></td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/use_clsf" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>한글 키워드</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/kwd_krchar" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>영문 키워드</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/kwd_eng" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>TRL</td>
									<td width='35%' class='contant'>
										<xsl:value-of select="APPROVALREQ/trl" />
									</td>
									<td width='15%' class='title2'>선행기술 조사<br>지원요청</br></td>
									<td width='35%' class='contant'>
										<xsl:value-of select="APPROVALREQ/supp_req" />
									</td>
								</tr>
								<xsl:if test="APPROVALREQ/org_dev != ''">
									<tr>
										<td width='15%' class='title2'>정부 및 지역본부 전략과의 연관성</td>
										<td width='85%' colspan='3' class='contant'>
											<xsl:value-of select="APPROVALREQ/org_dev" />
										</td>
									</tr>
								</xsl:if>
								<xsl:if test="APPROVALREQ/req_cmp != ''">
									<tr>
										<td width='15%' class='title2'>예상수요기업</td>
										<td width='35%' class='contant'>
											<xsl:value-of select="APPROVALREQ/req_cmp" />
										</td>
										<td width='15%' class='title2'>예상기술료</td>
										<td width='35%' class='contant-right'>
											<xsl:value-of select="format-number(APPROVALREQ/tech_fee      , '###,###,###,###')" />
										</td>
									</tr>
									<tr>
										<td width='15%' class='title2'>시장현황</td>
										<td width='85%' colspan='3' class='contant'>
											<xsl:value-of select="APPROVALREQ/market_tr" />
										</td>
									</tr>
								</xsl:if>
								<tr>
									<td width='15%' class='title2'>첨부파일</td>
									<td width='85%' colspan='3' class='contant'>
										<table cellpadding="0" cellspacing="2" width="100%">
											 <xsl:for-each select="APPROVALREQ/ResConceptPaperReq/fileList_A/vector/data/mdata">
										         <tr>
										          <td class='contant' width="84%">
										            <a>
												  	  <xsl:attribute name="href">#</xsl:attribute>
													  <xsl:attribute name="onclick">downloadForXsl('<xsl:value-of select="attach_file_no"/>
													                                                <xsl:value-of select="seq"/>', 'XAA001');return false;</xsl:attribute>
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
				<br />
				<br />

			</body>

	</xsl:template>

</xsl:stylesheet>
