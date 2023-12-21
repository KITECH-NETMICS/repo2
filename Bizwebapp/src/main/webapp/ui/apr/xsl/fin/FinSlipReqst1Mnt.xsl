<?xml version='1.0'?>
<xsl:stylesheet xmlns:LINS='http://www.inswave.com/LINS' xmlns:xsl='http://www.w3.org/1999/XSL/Transform' version='1.0'>
	<xsl:output method='xml' encoding='UTF-8' indent='yes' />
	<xsl:template match='/'>
		<body>
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
				<tr>
					<td class="body">
						<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
							<tr>
								<td width="10%" class='title2'>결의번호</td>
								<td width="15%" class='contant-center'>
									<xsl:value-of select="root/slipHVo/unslip_no" />
									<br />
								</td>
								<td width="10%" class='title2'>신청부서</td>
								<td width="15%" class='contant'>
									<xsl:value-of select="root/slipHVo/dept_nm" />
									<br />
								</td>
								<td width="10%" class='title2'>신청자</td>
								<td width="15%" class='contant-center'>
									<xsl:value-of select="root/slipHVo/nm" />
									<br />
								</td>
								<td width="12%" class='title2'>확정결의번호</td>
								<td width="13%" class='contant-center'>
									<xsl:value-of select="root/slipHVo/slip_no" />
									<br />
								</td>
							</tr>
							<tr>
								<td class='title2'>신청일자</td>
								<td class='contant-center'>
									<xsl:value-of select="substring(root/slipHVo/slip_ymd,1,4)" />
									-
									<xsl:value-of select="substring(root/slipHVo/slip_ymd,5,2)" />
									-
									<xsl:value-of select="substring(root/slipHVo/slip_ymd,7,2)" />
									<br />
								</td>
								<td class='title2'>계정책임자</td>
								<td class='contant-center'>
									<br />
								</td>
								<td class='title2'>전화</td>
								<td class='contant-center'>
									<xsl:value-of select="root/slipHVo/ext_no" />
									<br />
								</td>
								<td class='title2'>확정일자</td>
								<td class='contant-center'>
									<xsl:if test="root/slipHVo/accnt_ymd != ''">
										<xsl:value-of select="substring(root/slipHVo/accnt_ymd,1,4)" />
										-
										<xsl:value-of select="substring(root/slipHVo/accnt_ymd,5,2)" />
										-
										<xsl:value-of select="substring(root/slipHVo/accnt_ymd,7,2)" />
									</xsl:if>
									<br />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<p />
			<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
				<tr>
					<td width="90%" class="head">결의내역</td>
					<!-- 크리스피드 이원길 미리보기 버튼 추가 시작 -->
					<td width="10%" align="right" valign="bottom">
						<a>
							<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="root/slipHVo/unslip_no" />')</xsl:attribute>
							<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif" />
						</a>
					</td>
					<!-- 크리스피드 이원길 미리보기 버튼 추가 끝 -->
				</tr>
			</table>
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
				<tr>
					<td class="body">
						<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
							<tr>
								<td width="4%" class='title' rowspan='2'>순번</td>
								<td width="15%" class='title'>계정번호</td>
								<td width="10%" class='title'>계정종료일</td>
								<td width="15%" class='title'>비용</td>
								<td width="10%" class='title'>통제</td>
								<td width="18%" class='title'>차변</td>
								<td width="18%" class='title'>대변</td>
							</tr>
							<tr>
								<td colspan='3' class='title'>계정코드</td>
								<td class='title'>책임자</td>
								<td colspan='2' class='title'>관련내역</td>
							</tr>
							<xsl:for-each select="root/slipdList">
								<tr>
									<td class="contant-center" rowspan='3'>
										<xsl:number count="root/slipdList" level="single" format="1" />
										<br />
									</td>
									<td class="contant-center">
										<xsl:value-of select="accnt_no" />
										<br />
									</td>
									<td class="contant-center">
										<xsl:value-of select="cls_ymd" />
										<br />
									</td>
									<td class="contant-center">
										<xsl:choose>
											<xsl:when test="evid_yn != 'Y'">
												<xsl:value-of select="expns_cd_nm" />
											</xsl:when>
											<xsl:otherwise>
												<a style="color:blue">
													<xsl:attribute name="href">javascript:openItmEvidPop('<xsl:value-of select="unslip_no" />', '<xsl:value-of
														select="unslip_odr" />','<xsl:value-of select="expns_cd" />','<xsl:value-of select="service_id" />','')
														</xsl:attribute>
													<xsl:value-of select="expns_cd_nm" />
												</a>
											</xsl:otherwise>
										</xsl:choose>
										<br />
									</td>
									<td class="contant-center">
										<xsl:value-of select="ctrl_no" />
										<br />
									</td>
									<td class="contant-right">
										<xsl:if test="debit_amt != ''">
											<xsl:value-of select="format-number(debit_amt, '#,###,###')" />
										</xsl:if>
										<br />
									</td>
									<td class="contant-right">
										<xsl:if test="cr_amt != ''">
											<xsl:value-of select="format-number(cr_amt, '#,###,###')" />
										</xsl:if>
										<br />
									</td>
								</tr>
								<tr>
									<td class="contant" colspan='3' style="word-break:break-all;">
										<xsl:value-of select="rmk_1" />
										<br />
									</td>
									<td class="contant-center">
										<xsl:value-of select="accnt_rspns_nm" />
										<br />
									</td>
									<td class="contant">
										<xsl:value-of select="mngmt_detls_cd1" />
										<br />
									</td>
									<td class="contant">
										<xsl:value-of select="mngmt_detls_cd2" />
										<br />
									</td>
								</tr>
								<tr>
									<td class="contant" colspan='3'>
										<xsl:value-of select="accnt_abbr_nm" />
										<br />
									</td>
									<td class="contant">
										<br />
									</td>
									<td class="contant">
										<xsl:value-of select="mngmt_detls_cd3" />
										<br />
									</td>
									<td class="contant">
										<xsl:value-of select="rmk_2" />
										<br />
									</td>
								</tr>
							</xsl:for-each>
						</table>
					</td>
				</tr>
			</table>

			<p />

			<xsl:variable name="sendCnt" select="count(root/sendList)" />
			<xsl:if test="$sendCnt &gt; 0">
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
					<tr>
						<td width="100%" class="head">지급내역</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="5%" class='title' rowspan='2'>순번</td>
									<td width="15%" class='title'>지급방법</td>
									<td width="15%" class='title'>발생일자</td>
									<td width="15%" class='title'>개인번호</td>
									<td width="15%" class='title'>거래처코드</td>
									<td width="15%" class='title'>승인번호</td>
									<td width="20%" class='title'>카드번호</td>
								</tr>
								<tr>
									<td class='title'>가맹점</td>
									<td class='title'>지로/현금 구분</td>
									<td class='title'>송금은행</td>
									<td class='title'>송금계좌번호</td>
									<td class='title'>송금예금주명</td>
									<td class='title'>금액</td>
								</tr>
								<xsl:for-each select="root/sendList">
									<tr>
										<td class="contant-center" rowspan="2">
											<xsl:number count="root/sendList" level="single" format="1" />
											<br />
										</td>
										<td class="contant-center">
											<xsl:value-of select="pay_clsf" />
											<br />
										</td>
										<td class="contant-center">
											<xsl:value-of select="use_ymd" />
											<br />
										</td>
										<td class="contant-center">
											<xsl:value-of select="syspayno" />
											<br />
										</td>
										<td class="contant-center">
											<xsl:value-of select="vend_cd" />
											<br />
										</td>
										<td class="contant-center">
											<xsl:value-of select="apprvl_no" />
											<br />
										</td>
										<td class="contant-center">
											<xsl:value-of select="card_no" />
											<br />
										</td>
									</tr>
									<tr>
										<td class="contant">
											<xsl:value-of select="joinsto_nm" />
											<br />
										</td>
										<td class="contant-center">
											<xsl:value-of select="giro_cash_clsf" />
											<br />
										</td>
										<td class="contant-center">
											<xsl:value-of select="bank" />
											<br />
										</td>
										<td class="contant">
											<xsl:value-of select="bankaccnt_no" />
											<br />
										</td>
										<td class="contant">
											<xsl:value-of select="depstr_nm" />
											<br />
										</td>
										<td class="contant-right">
											<xsl:if test="send_req_amt != ''">
												<xsl:value-of select="format-number(send_req_amt, '#,###,###')" />
											</xsl:if>
											<br />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
			</xsl:if>

			<xsl:variable name="totalEvidNum" select="count(root/evidList)" />
			<xsl:choose>
				<xsl:when test="$totalEvidNum &gt; 0">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 증빙내역</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<tr>
										<td width="25%" class='title'>계정번호</td>
										<td width="55%" class='title'>증빙구분</td>
										<td width="20%" class='title'>참여자수</td>
									</tr>
									<xsl:for-each select="root/evidList">
										<tr>
											<td class='contant-center' width="">
												<xsl:value-of select="accnt_no" />
											</td>
											<td class='contant' width="">
												<a>
													<xsl:attribute name="href">javascript:openItmEvidPop('<xsl:value-of select="unslip_no" />', '<xsl:value-of
														select="unslip_odr" />','<xsl:value-of select="expns_cd" />','<xsl:value-of select="service_id" />','<xsl:value-of
														select="syspayno" />')</xsl:attribute>
													<xsl:value-of select="expns_cd_nm" />
												</a>
											</td>
											<td class='contant-center' width="">
												<xsl:value-of select="cnt" />
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:when>

			</xsl:choose>

			<xsl:variable name="totalAttachNum" select="count(root/fileList)" />

			<xsl:variable name="unslipNoTmp" select="substring(root/slipHVo/unslip_no,1,3)" />

			<xsl:choose>
				<xsl:when test="$totalAttachNum &gt; 0">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<xsl:for-each select="root/fileList">
										<tr>
											<td class='title2' width="16%">
												첨부파일(
												<xsl:value-of select="unslip_no" />
												-
												<xsl:value-of select="unslip_odr" />
												)
											</td>
											<td class='contant' width="84%">
												<a>
													<xsl:if test="$unslipNoTmp != '178'">
														<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select="attach_file_no" /><xsl:value-of
															select="seq" />", "XAA002")</xsl:attribute>
														<xsl:value-of select="file_nm" />
													</xsl:if>

													<xsl:if test="$unslipNoTmp = '178'">
														<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select="attach_file_no" /><xsl:value-of
															select="seq" />", "XAA002")</xsl:attribute>
														<xsl:value-of select="file_nm" />
													</xsl:if>
												</a>
												<xsl:if test="attach_file_no != ''">
													<a>
														<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of select="seq" />')</xsl:attribute>
														<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기" style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;"/>
													</a>
												</xsl:if>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:when>
			</xsl:choose>
			<p/>
		</body>
	</xsl:template>
</xsl:stylesheet>