<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
			<BODY>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="14%">계약번호</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/contrct_no" />
									</td>
									<td class='title2' width="14%">계약명</td>
									<td class="contant" colspan='3'>
										<xsl:value-of select="APPROVAL/contrct_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="14%">신청번호</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/req_no" />
									</td>
									<td class='title2' width="14%">신청일자</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/req_ymd" />
									</td>
									<td class='title2' width="14%">구매번호</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/pur_req_no" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="14%">변경사유</td>
									<td class="contant" colspan="5">
										<xsl:value-of select="APPROVAL/chng_resn" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 품목내역</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<!-- TODO 컬럼 사이즈 조절 -->
									<td class='title'>품명</td>
									<td class='title'>단위</td>
									<td class='title'>수량</td>
									<td class='title'>단가</td>
									<td class='title'>계약금액</td>
								</tr>
								<xsl:for-each select="APPROVAL/itemSelect/vector/data">
									<tr>
										<td class="contant">
											<xsl:value-of select="msgEpuConItem/krchar_gdnm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgEpuConItem/cd_nm" />
										</td>
										<td class="contant-right">
											<xsl:if test="msgEpuConItem/qty != ''">
												<xsl:value-of select="format-number(msgEpuConItem/qty, '#,###')" />
											</xsl:if>
										</td>
										<td class="contant-right">
											<xsl:if test="msgEpuConItem/unit_price != ''">
												<xsl:value-of select="format-number(msgEpuConItem/unit_price, '#,###')" />
											</xsl:if>
										</td>
										<td class="contant-right">
											<xsl:if test="msgEpuConItem/contrct_amt != ''">
												<xsl:value-of select="format-number(msgEpuConItem/contrct_amt, '#,###')" />
											</xsl:if>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>

				<!-- 지급내역 -->
				<xsl:if test="APPROVAL/cnt > 0">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 지급내역</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<tr>
										<!-- TODO 컬럼 사이즈 조절 -->
										<td class='title'>지급신청번호</td>
										<td class='title'>계정번호</td>
										<td class='title'>결의번호</td>
										<td class='title'>거래처</td>
										<td class='title'>금액</td>
										<td class='title'>내역</td>
									</tr>
									<xsl:for-each select="APPROVAL/doc2/vector/data">
										<tr>
											<td class="contant">
												<xsl:value-of select="msgpurpayreqmastr05/req_no" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgpurpayreqmastr05/accnt_no" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgpurpayreqmastr05/unslip_no" />
											</td>
											<td class="contant">
												<xsl:value-of select="msgpurpayreqmastr05/vend_nm" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(msgpurpayreqmastr05/pay_amt, '#,###')" />
											</td>
											<td class="contant">
												<xsl:value-of select="msgpurpayreqmastr05/rmk" />
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 계정내역</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<!-- TODO 컬럼 사이즈 조절 -->
									<td colspan="4" class='title'>변경전</td>
									<td colspan="4" class='title'>변경후</td>
									<td rowspan="3" class='title'>
										구매금액
										<br />
										(원인행위)
									</td>
								</tr>
								<tr>
									<!-- TODO 컬럼 사이즈 조절 -->
									<td class='title'>계정번호</td>
									<td colspan="3" class='title'>계정명</td>
									<td class='title'>계정번호</td>
									<td colspan="3" class='title'>계정명</td>									
								</tr>
								<tr>
									<td class='title' width="10%">회계코드</td>
									<td class='title'>비용코드</td>
									<td class='title'>계정책임자</td>
									<td class='title' width="10%">통제번호</td>
									<td class='title'>회계코드</td>
									<td class='title'>비용코드</td>
									<td class='title'>계정책임자</td>
									<td class='title'>통제번호</td>
								</tr>
								
								<xsl:for-each select="APPROVAL/doc1/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="msgPurAccntChngd04/chng_befr_accnt_no" />
										</td>
										<td class="contant-center" colspan="3">
											<xsl:value-of select="msgPurAccntChngd04/chng_befr_accnt_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurAccntChngd04/chng_aftr_accnt_no" />
										</td>
										<td class="contant-center" colspan="3">
											<xsl:value-of select="msgPurAccntChngd04/chng_aftr_accnt_nm" />
										</td>
										<td class="contant-right" rowspan="3">
											<xsl:if test="msgPurAccntChngd04/req_amt != ''">
												<xsl:value-of select="format-number(msgPurAccntChngd04/req_amt, '#,###')" />
											</xsl:if>
										</td>
									</tr>
									<tr>		
										<td class="contant-center">
											<xsl:value-of select="msgPurAccntChngd04/chng_befr_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurAccntChngd04/chng_befr_expns_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurAccntChngd04/befr_accnt_rspns_empnm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurAccntChngd04/chng_befr_ctrl_no" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurAccntChngd04/chng_aftr_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurAccntChngd04/chng_aftr_expns_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurAccntChngd04/aftr_accnt_rspns_empnm" />
										</td>
										<td class="contant-center">
											<xsl:attribute name="id">
												<xsl:text>ctrlNo</xsl:text>
												<xsl:value-of select="msgPurAccntChngd04/accnt_odr"/>
											</xsl:attribute>
											<xsl:value-of select="msgPurAccntChngd04/chng_aftr_ctrl_no" />
										</td>
									</tr>
									<tr>
										<td class="contant-center">과제기간</td>
										<td class="contant-center" colspan="3">
											<xsl:value-of select="msgPurAccntChngd04/chng_befr_ymd" />
										</td>
										<td class="contant-center">과제기간</td>
										<td class="contant-center" colspan="3">
											<xsl:value-of select="msgPurAccntChngd04/chng_aftr_ymd" />
										</td>
									</tr>
								</xsl:for-each>
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
									<xsl:for-each select="APPROVAL/attaches/vector/data/mdata">
										<tr>
											<td class='title2' width="16%">
												첨부파일 (<xsl:value-of select="seq" />)
											</td>
											<td class='contant' width="84%">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />', 'XAA004')</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				<br />
			</BODY>
	</xsl:template>
</xsl:stylesheet>