<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS='http://www.inswave.com/LINS' xmlns:xsl='http://www.w3.org/1999/XSL/Transform' version='1.0'>
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match='/'>
		<body>
			<!-- [B]과제정보 (시작) -->
			<table class="aproutertable" width="100%">
				<tr>
					<td class="head">과제정보</td>
				</tr>
				<tr>
					<td class="body">
						<table class="aprinnertable" width="100%">
							<tr>
								<td width='10%' class='title2'>계정번호</td>
								<td width='20%' class='contant'>
									<xsl:value-of select="root/prjVo/accnt_no" />
								</td>
								<td width='10%' class='title2'>과제명</td>
								<td width='60%' class='contant' colspan='3'>
									<xsl:value-of select="root/prjVo/accnt_no_nm" />
								</td>
							</tr>
							<tr>
								<td width='10%' class='title2'>과제책임자</td>
								<td width='20%' class='contant'>
									<xsl:value-of select="root/prjVo/accnt_rspns_nm" />
								</td>
								<td width='10%' class='title2'>과제기간</td>
								<td width='30%' class='contant'>
									<xsl:value-of select="substring(root/prjVo/start_ymd, 1, 4)" />-<xsl:value-of select="substring(root/prjVo/start_ymd, 5, 2)" />-<xsl:value-of select="substring(root/prjVo/start_ymd, 7, 2)" />
									~
									<xsl:value-of select="substring(root/prjVo/cls_ymd, 1, 4)" />-<xsl:value-of select="substring(root/prjVo/cls_ymd, 5, 2)" />-<xsl:value-of select="substring(root/prjVo/cls_ymd, 7, 2)" />
								</td>
								<td width='10%' class='title2'>총연구비</td>
								<td width='20%' class='contant-right'>
									<xsl:value-of select="format-number(root/prjVo/tot_resch_cash_tax_amt, '#,###')" />
								</td>
							</tr>
						</table>

					</td>
				</tr>

			</table>
			<!-- [B]과제정보 (종료) -->

			<!-- [C]거래처정보 (시작) -->
			<table class="aproutertable" width="100%">
				<tr>
					<td class="head">거래처정보</td>
				</tr>
				<tr>
					<td class="body">
						<table class="aprinnertable" width="100%">
							<tr>
								<td width='10%' class='title2'>거래처코드</td>
								<td width='20%' class='contant'>
									<xsl:value-of select="root/demndVo/depst_loc" />
								</td>
								<td width='10%' class='title2'>거래처명</td>
								<td width='30%' class='contant'>
									<xsl:value-of select="root/demndVo/vend_abbr" />
								</td>
								<td width='10%' class='title2'>대표자</td>
								<td width='20%' class='contant'>
									<xsl:value-of select="root/demndVo/reprs_psn_nm" />
								</td>
							</tr>
							<tr>
								<td width='10%' class='title2'>사업자등록번호</td>
								<td width='20%' class='contant'>
									<xsl:value-of select="root/demndVo/bsns_psn_regst_no" />
								</td>
								<td width='10%' class='title2'>거래처주소</td>
								<td width='60%' class='contant' colspan='3'>
									<xsl:value-of select="root/demndVo/addr" />
								</td>
							</tr>
						</table>

					</td>
				</tr>

			</table>
			<!-- [C]거래처정보 (종료) -->

			<!-- [D]청구계산서발행정보 (시작) -->
			<table class="aproutertable" width="100%">
				<tr>
					<td class="head">청구계산서발행정보 </td>
				</tr>
				<tr>
					<td class="body">
						<table class="aprinnertable" width="100%">
							<tr>
								<td width='10%' class='title2'>신청번호</td>
								<td width='20%' class='contant'>
									<xsl:value-of select="root/demndVo/req_no" />
								</td>
								<td width='15%' class='title2'>청구의뢰일자</td>
								<td width='20%' class='contant'>
									<xsl:value-of select="substring(root/demndVo/req_ymd, 1, 4)" />
									-
									<xsl:value-of select="substring(root/demndVo/req_ymd, 5, 2)" />
									-
									<xsl:value-of select="substring(root/demndVo/req_ymd, 7, 2)" />
								</td>
								<td width='15%' class='title2'>과세구분</td>
								<td width='20%' class='contant'>
									<xsl:if test="root/prjVo/tax_cd='FTX001'">과세계정</xsl:if>
									<xsl:if test="root/prjVo/tax_cd='FTX002'">비과세계정</xsl:if>
								</td>
							</tr>
							<tr>
								<td width='10%' class='title2'>총액</td>
								<td width='20%' class='contant-right'>
									<xsl:value-of select="format-number(root/demndVo/demnd_liq, '#,###')" />
								</td>
								<td width='15%' class='title2'>공급가액</td>
								<td width='20%' class='contant-right'>
									<xsl:value-of select="format-number(root/demndVo/suply_value, '#,###')" />
								</td>
								<td width='15%' class='title2'>부가세액</td>
								<td width='20%' class='contant-right'>
									<xsl:value-of select="format-number(root/demndVo/tax_amt, '#,##0')" />
								</td>
							</tr>
							<tr>
								<td width='15%' class='title2'>계산서발행일자</td>
								<td width='20%' class='contant'>
									<xsl:value-of select="root/demndVo/issu_ymd" />
								</td>
								<td width='15%' class='title2'>계산서번호</td>
								<td width='20%' class='contant'>
									<xsl:value-of select="root/demndVo/bill_no" />
								</td>
								<td width='10%' class='title2'>계산서구분</td>
								<td width='20%' class='contant'>
									<xsl:if test="root/demndVo/evid_cd='FAH212'">세금계산서</xsl:if>
									<xsl:if test="root/demndVo/evid_cd='FAH211'">계산서</xsl:if>
								</td>
							</tr>
							<tr>
								<td width='15%' class='title2'>결의번호</td>
								<td width='20%' class='contant'>
									<xsl:value-of select="root/demndVo/unslip_no" />
								</td>
								<td width='15%' class='title2'>결의증빙</td>
								<td colspan="3" class="contant" valign="middle">
									<a>
										<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="root/demndVo/unslip_no" />')</xsl:attribute>
										<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif" />
									</a>
								</td>
							</tr>
						</table>

					</td>
				</tr>

			</table>
			<!-- [D]청구계산서발행정보 (종료) -->


			<!-- [F]첨부파일 (시작) -->
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
				<tr>
					<td class="head"> 첨부파일</td>
				</tr>
				<tr>
					<td class="body">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
							<xsl:for-each select="root/fileList">
								<tr>
									<td class='title2' width="16%">첨부파일</td>
									<td class='contant' width="84%">
										<a>
											<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select='attach_file_no' /><xsl:value-of
												select='seq' />", "XAA001")</xsl:attribute>
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
			<!-- [F]첨부파일 (종료) -->
		</body>
	</xsl:template>
</xsl:stylesheet>