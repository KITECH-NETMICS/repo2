<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/response">
		<xsl:variable name="localPath" select="localPath" />
		<html lang="kr">
			<BODY>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="16%">변경구분</td>
									<td class="contant">
										<input type='checkbox' name='req_clsf' id="req_clsf1" value="a">
											<xsl:if test="contains(selectChng/msgPurContrctChng02/contrct_amt_chng_yn, 'Y')">
												<xsl:attribute name="checked">Y</xsl:attribute>
											</xsl:if>
											계약금액
										</input>
										<input type='checkbox' name='req_clsf' id="req_clsf2" value="a">
											<xsl:if test="contains(selectChng/msgPurContrctChng02/contrct_prd_chng_yn, 'Y')">
												<xsl:attribute name="checked">Y</xsl:attribute>
											</xsl:if>
											계약기간
										</input>
										<input type='checkbox' name='req_clsf' id="req_clsf3" value="a">
											<xsl:if test="contains(selectChng/msgPurContrctChng02/contrct_etc_chng_yn, 'Y')">
												<xsl:attribute name="checked">Y</xsl:attribute>
											</xsl:if>
											기타
										</input>
									</td>
									<td class='title2' width="16%">계약구분</td>
									<td class="contant">
										<xsl:value-of select="selectMaster/msgEpuContrctChng01/pur_grp_desc" />
									</td>
								</tr>
								<tr>
									<td class='title2'>구매계약번호</td>
									<td class="contant">
										<xsl:value-of select="selectMaster/msgEpuContrctChng01/contrct_no" />-<xsl:value-of select="selectMaster/msgEpuContrctChng01/chng_seq" />
									</td>
									<td class='title2'>계약방법</td>
									<td class="contant">
										<xsl:value-of select="selectMaster/msgEpuContrctChng01/contrct_way_desc" />
									</td>
								</tr>
								<tr>
									<td class='title2'>계약명</td>
									<td class="contant">
										<xsl:value-of select="selectMaster/msgEpuContrctChng01/contrct_nm" />
									</td>
									<td class='title2'>계약일자</td>
									<td class="contant">
										<xsl:value-of select="substring(selectMaster/msgEpuContrctChng01/contrct_ymd, 1, 4)" />-<xsl:value-of select="substring(selectMaster/msgEpuContrctChng01/contrct_ymd, 5, 2)" />-<xsl:value-of select="substring(selectMaster/msgEpuContrctChng01/contrct_ymd, 7, 2)" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 거래처</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title' width="16%">거래처구분</td>
									<td class='title' width="16%">거래처번호</td>
									<td class='title'>거래처명</td>
									<td class='title' width="13%">대표자</td>
									<td class='title' width="18%">전화번호</td>
								</tr>
								<xsl:for-each select="selectCntVend/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="msgEpuContrctVend/vend_clsf_desc" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgEpuContrctVend/contrct_vend_cd" />
										</td>
										<td class="contant">
											<xsl:value-of select="msgEpuContrctVend/vend_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgEpuContrctVend/reprs_psn" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgEpuContrctVend/tel" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 변경내역</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="16%">신청번호</td>
									<td class="contant">
										<xsl:value-of select="selectChng/msgPurContrctChng02/contrct_chng_req_no" />
									</td>
									<td class='title2' width="16%">신청일자</td>
									<td class="contant">
										<xsl:value-of select="substring(selectChng/msgPurContrctChng02/req_ymd, 1, 4)" />-<xsl:value-of select="substring(selectChng/msgPurContrctChng02/req_ymd, 5, 2)" />-<xsl:value-of select="substring(selectChng/msgPurContrctChng02/req_ymd, 7, 2)" />
									</td>
								</tr>
								<xsl:if test="selectChng/msgPurContrctChng02/contrct_amt_chng_yn = 'Y'">
									<tr>
										<td class='title2'>변경전 계약금액</td>
										<td class="contant">
											<xsl:if test="selectChng/msgPurContrctChng02/chng_befr_contrct_amt != ''">
												<xsl:value-of select="format-number(selectChng/msgPurContrctChng02/chng_befr_contrct_amt, '#,###')" />
											</xsl:if>
										</td>
										<td class='title2'>변경후 계약금액</td>
										<td class="contant">
											<xsl:if test="selectChng/msgPurContrctChng02/chng_aftr_contrct_amt != ''">
												<xsl:value-of select="format-number(selectChng/msgPurContrctChng02/chng_aftr_contrct_amt, '#,###')" />
											</xsl:if>
										</td>
									</tr>
								</xsl:if>
								<xsl:if test="selectChng/msgPurContrctChng02/contrct_prd_chng_yn = 'Y'">
									<tr>
										<td class='title2'>변경전 계약기간</td>
										<td class="contant">
											<xsl:if test="selectChng/msgPurContrctChng02/chng_befr_contrct_start_ymd != ''">
												<xsl:value-of select="substring(selectChng/msgPurContrctChng02/chng_befr_contrct_start_ymd, 1, 4)" />-<xsl:value-of select="substring(selectChng/msgPurContrctChng02/chng_befr_contrct_start_ymd, 5, 2)" />-<xsl:value-of select="substring(selectChng/msgPurContrctChng02/chng_befr_contrct_start_ymd, 7, 2)" />
												~<xsl:value-of select="substring(selectChng/msgPurContrctChng02/chng_befr_contrct_cls, 1, 4)" />-<xsl:value-of select="substring(selectChng/msgPurContrctChng02/chng_befr_contrct_cls, 5, 2)" />-<xsl:value-of select="substring(selectChng/msgPurContrctChng02/chng_befr_contrct_cls, 7, 2)" />
											</xsl:if>
											<xsl:if test="selectChng/msgPurContrctChng02/chng_befr_contrct_prd != ''">
												/ <xsl:value-of select="selectChng/msgPurContrctChng02/chng_befr_contrct_prd" />
											</xsl:if>
										</td>
										<td class='title2'>변경후 계약기간</td>
										<td class="contant">
											<xsl:if test="selectChng/msgPurContrctChng02/chng_aftr_contrct_start_ymd != ''">
												<xsl:value-of select="substring(selectChng/msgPurContrctChng02/chng_aftr_contrct_start_ymd, 1, 4)" />-<xsl:value-of select="substring(selectChng/msgPurContrctChng02/chng_aftr_contrct_start_ymd, 5, 2)" />-<xsl:value-of select="substring(selectChng/msgPurContrctChng02/chng_aftr_contrct_start_ymd, 7, 2)" />
												~<xsl:value-of select="substring(selectChng/msgPurContrctChng02/chng_aftr_contrct_cls, 1, 4)" />-<xsl:value-of select="substring(selectChng/msgPurContrctChng02/chng_aftr_contrct_cls, 5, 2)" />-<xsl:value-of select="substring(selectChng/msgPurContrctChng02/chng_aftr_contrct_cls, 7, 2)" />
											</xsl:if>
											<xsl:if test="selectChng/msgPurContrctChng02/chng_afrt_contrct_prd != ''">
												/ <xsl:value-of select="selectChng/msgPurContrctChng02/chng_afrt_contrct_prd" />
											</xsl:if>
										</td>
									</tr>
								</xsl:if>
								<xsl:if test="selectChng/msgPurContrctChng02/contrct_etc_chng_yn = 'Y'">
									<tr>
										<td class='title2'>기타변경내역</td>
										<td class="contant" colspan="3">
											<xsl:value-of select="selectChng/msgPurContrctChng02/etc_chng_cntnt" />
										</td>
									</tr>
								</xsl:if>	
								<tr>
									<td class='title2'>변경사유</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="selectChng/msgPurContrctChng02/chng_resn" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 계정정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title' width="20%">계정번호</td>
									<td class='title' width="20%">비용코드</td>
									<td class='title' width="20%">책임자</td>
									<td class='title' width="20%">통제번호</td>
									<td class='title' width="20%">과세여부</td>
								</tr>
								<xsl:for-each select="selectCntVend/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="msgEpuContrctVend/accnt_no" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgEpuContrctVend/expns_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgEpuContrctVend/accnt_rspns_empnm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgEpuContrctVend/ctrl_no" />
										</td>
										<td class="contant-center">
											<xsl:if test="contains(msgEpuContrctVend/tax_cd, 'FTX001')">
												과세
											</xsl:if>
											<xsl:if test="contains(msgEpuContrctVend/tax_cd, 'FTX002')">
												비과세
											</xsl:if>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>				
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 첨부파일</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<xsl:for-each select="attaches/vector/data/mdata">
									<tr>
										<td class="contant">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
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
		</html>
	</xsl:template>
</xsl:stylesheet>