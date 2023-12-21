<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<BODY>
			<table width="100%" border="0" cellpadding="0" class="aproutertable">
				<tr>
					<td class="body">
						<table width="100%" border="0" cellpadding="0" class="aprinnertable">
							<tr>
								<td class='title2' width="16%">특정업체</td>
								<td class="contant" colspan="2">
									<xsl:value-of select="root/spcficVo/spcfic_vend" />
								</td>
							</tr>
							<tr>
								<td class='title2' width="16%" rowspan="2">특정구매 근거</td>
								<td class="contant" width="10%" rowspan="2">
									수의계약
									<br />
									제 35조
								</td>
								<td class="contant">
									<xsl:value-of select="root/spcficVo/contrct_base_clause" />
								</td>
							</tr>
							<tr>
								<td class="contant">
									<xsl:value-of select="root/spcficVo/contrct_base_no" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<br />

			<table width="100%" border="0" cellpadding="0" class="aproutertable">
				<tr>
					<td class="body">
						<table width="100%" border="0" cellpadding="0" class="aprinnertable">
							<tr>
								<td class='title2' width="16%">특정구매신청번호</td>
								<td class="contant" colspan="2">
									<xsl:value-of select="root/spcficVo/elecapp_docu_no" />
								</td>
								<td class='title2' width="16%">특정구매요구일자</td>
								<td class="contant" colspan="2">
									<xsl:value-of select="root/spcficVo/spcfic_req_ymd" />
								</td>
							</tr>
							<tr>
								<td class='title2' width="16%">구매요구번호</td>
								<td class="contant" colspan="2">
									<xsl:value-of select="root/spcficVo/pur_req_no" />
								</td>
								<td class='title2' width="16%">구매요구일자</td>
								<td class="contant" colspan="2">
									<xsl:value-of select="root/spcficVo/req_ymd" />
								</td>
							</tr>
							<tr>
								<td class='title2' width="16%">구매요구부서</td>
								<td class="contant" colspan="2">
									<xsl:value-of select="root/spcficVo/req_dept_cd_nm" />
								</td>
								<td class='title2' width="16%">계정번호</td>
								<td class="contant" colspan="2">
									<xsl:value-of select="root/spcficVo/accnt_no" />
								</td>
							</tr>
							<tr>
								<td class='title2' width="16%">사용자(정)</td>
								<td class="contant" colspan="2">
									<xsl:value-of select="root/spcficVo/user_main_nm" />
								</td>
								<td class='title2' width="16%">계정책임자</td>
								<td class="contant" colspan="2">
									<xsl:value-of select="root/spcficVo/accnt_rspns_nm" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>

			<table width="100%" border="0" cellpadding="0" class="aproutertable">
				<tr>
					<td class="head"> 품목정보</td>
				</tr>
				<tr>
					<td class="body">
						<table width="100%" border="0" cellpadding="0" class="aprinnertable">
							<tr>
								<!-- TODO 컬럼 사이즈 조절 -->
								<td class='title'>품명</td>
								<td class='title'>단위</td>
								<td class='title'>수량</td>
								<td class='title'>추정단가</td>
								<td class='title'>추정금액</td>
								<!-- <td class='title'>부가세</td> -->
								<td class='title'>합계</td>
								<td class='title'>비고</td>
							</tr>
							<xsl:variable name="totl_req_unit_price" select="sum(root/itemList/req_unit_price)" />
							<xsl:variable name="totl_req_amt" select="sum(root/itemList/req_amt)" />
							<xsl:variable name="totl_req_amt_sum" select="sum(root/itemList/req_amt_sum)" />
							<xsl:for-each select="root/itemList">
								<tr>
									<td class="contant">
										<xsl:value-of select="krchar_gdnm" />
									</td>
									<td class="contant-center">
										<xsl:value-of select="unit_desc" />
									</td>
									<td class="contant-right">
										<xsl:if test="qty != ''">
											<xsl:value-of select="format-number(qty, '###,###,###,##0')" />
										</xsl:if>
									</td>
									<td class="contant-right">
										<xsl:if test="req_unit_price != ''">
											<xsl:value-of select="format-number(req_unit_price, '###,###,###,##0')" />
										</xsl:if>
									</td>
									<td class="contant-right">
										<xsl:if test="req_amt != ''">
											<xsl:value-of select="format-number(req_amt, '###,###,###,##0')" />
										</xsl:if>
									</td>
									<!-- <td class="contant-right"><xsl:if test="req_time_addtax_extexpns != ''"> <xsl:value-of select="format-number(req_time_addtax_extexpns,
										'###,###,###,##0')" /> </xsl:if></td> -->
									<td class="contant-right">
										<xsl:if test="req_amt_sum != ''">
											<xsl:value-of select="format-number(req_amt_sum, '###,###,###,##0')" />
										</xsl:if>
									</td>
									<td class="contant">
										<xsl:value-of select="rmk" />
									</td>
								</tr>
							</xsl:for-each>
							<tr>
								<td colspan="3" class="contant-center">합 계</td>
								<td class="contant-right">
									<xsl:value-of select="format-number($totl_req_unit_price, '###,###,###')" />
								</td>
								<td class="contant-right">
									<xsl:value-of select="format-number($totl_req_amt, '###,###,###')" />
								</td>
								<td class="contant-right">
									<xsl:value-of select="format-number($totl_req_amt_sum, '###,###,###')" />
								</td>
								<td class="contant"></td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<br />

			<table width="100%" border="0" cellpadding="0" class="aproutertable">
				<tr>
					<td class="body">
						<table width="100%" border="0" cellpadding="0" class="aprinnertable">
							<tr>
								<td class='title2' width="16%">납품요구일자</td>
								<td class="contant" width="34%">
									계약 후
									<xsl:value-of select="root/spcficVo/delvr_demnd_daycnt" />
									일 이내
								</td>
								<td class='title2' width="16%">비고</td>
								<td class="contant">
									<xsl:value-of select="root/spcficVo/rmk" />
								</td>
							</tr>
							<tr>
								<td class='title2' width="16%">물품사항</td>
								<td class="contant" colspan="3">
									<xsl:value-of select="root/spcficVo/goods_item" disable-output-escaping="yes" />
								</td>
							</tr>
							<tr>
								<td class='title2' width="16%">특정사유</td>
								<td class="contant" colspan="3">
									<xsl:value-of select="root/spcficVo/spcfic_cause" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>

			<table width="100%" border="0" cellpadding="0" class="aproutertable">
				<tr>
					<td class="head"> 첨부파일</td>
				</tr>
				<tr>
					<td class="body">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
							<xsl:for-each select="root/fileList">
								<tr>
									<td class='title2' width="16%">
										<xsl:value-of select="seq" />
									</td>
									<td class='contant' width="84%">
										<a>
											<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of
												select="seq" />','XAA004')</xsl:attribute>
											<xsl:value-of select="file_nm" />
										</a>
										<xsl:if test="attach_file_no != ''">
											<a>
												<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of
													select="seq" />')</xsl:attribute>
												<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기"
													style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;" />
											</a>
										</xsl:if>
										<br/>
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