<?xml version='1.0'?>
<xsl:stylesheet xmlns:LINS='http://www.inswave.com/LINS' xmlns:xsl='http://www.w3.org/1999/XSL/Transform' version='1.0'>
	<xsl:output method='xml' encoding='UTF-8' indent='yes' />
	<xsl:template match='/'>
				<BODY>
				<script type="text/javascript">
					<![CDATA[
						/* 크리스피드 이원길 미리보기 시작 */
						function openEvidWindow(unslipNo){
							var url = "https://evid.kitech.re.kr/sd/view?CLS=99&amp;amp;amp;RESL_NO=" + unslipNo + "&amp;amp;amp;EMP_NO=" + unslipNo;
							url = url.replaceAll("amp;","");
							window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
						}
						/* 크리스피드 이원길 미리보기 끝 */
					]]>
				</script>				
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td class="title2" width="10%">신청구분</td>
									<td class="contant" width="25%">
										<xsl:value-of select="root/req_clsf_text" />
										<br />
									</td>
									<td class="title2" width="10%">신청번호</td>
									<td class="contant" width="25%">
										<xsl:value-of select="root/req_no" />
										<br />
									</td>
									<td class="title2" width="10%">통제번호</td>
									<td class="contant" width="25%">
										<xsl:attribute name="id">
											<xsl:text>ctrlNo1</xsl:text>
										</xsl:attribute>
										<xsl:value-of select="root/ctrl_no" />
										<br />
									</td>
								</tr>
								<tr>
									<td class="title2">신청일자</td>
									<td class="contant">
										<xsl:value-of select="substring(root/req_ymd,0,5)" />
										-
										<xsl:value-of select="substring(root/req_ymd,5,2)" />
										-
										<xsl:value-of select="substring(root/req_ymd,7,2)" />
										<br />
									</td>
									<td class="title2">신청자</td>
									<td class="contant">
										<xsl:value-of select="root/req_psn_nm" />
										(
										<xsl:value-of select="substring(root/req_psn,3,8)" />
										)
										<br />
									</td>									
									<td class="title2">신청부서</td>
									<td class="contant">
										<xsl:value-of select="root/req_dept_nm" />
										<br />
									</td>
								</tr>
								<tr>
									<td class="title2">계정번호</td>
									<td class="contant">
										(
										<xsl:value-of select="root/accnt_no" />
										)
										<xsl:value-of select="root/accnt_no_nm" />
										<br />
									</td>
									<td class="title2">회계코드</td>
									<td class="contant">
										(
										<xsl:value-of select="root/accnt_cd" />
										)
										<xsl:value-of select="root/accnt_cd_abbr" />
										<br />
									</td>
									<td class="title2">비용코드</td>
									<td class="contant">
										<xsl:attribute name="id">
											<xsl:text>expnsCd1</xsl:text>
										</xsl:attribute>
										(
										<xsl:value-of select="root/expns_cd" />
										)
										<xsl:value-of select="root/expns_cd_nm" />
										<br />
									</td>
								</tr>
								<tr>
									<td class="title2">신청금액</td>
									<td class="contant-right">
										<xsl:attribute name="id">
											<xsl:text>reqAmt1</xsl:text>
										</xsl:attribute>
										<xsl:value-of select="format-number(root/req_amt, '#,###,###,###,###,###')" />
										<br />
									</td>
									<td class="title2">원인행위</td>
									<td class="contant-right">
										<xsl:attribute name="id">
											<xsl:text>causeAmt1</xsl:text>
										</xsl:attribute>
										<xsl:value-of select="format-number(root/enfrc_amt_cause_apr, '#,###,###,###,###,###')" />
										<br />
									</td>
									<td class="title2">결의금액</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(root/unslip_amt, '#,###,###,###,###,###')" />
										<br />
									</td>
								</tr>
								<tr>
									<td class="title2">거래처</td>
									<td class="contant">
										<xsl:value-of select="root/vend_nm" />
										<br />
									</td>
									<td class="title2">통제상태</td>
									<td class="contant">
										<xsl:attribute name="id">
											<xsl:text>ctrlState1</xsl:text>
										</xsl:attribute>
										<xsl:value-of select="root/ctrl_state_text" />
										<br />
									</td>
									<td class="title2">비고</td>
									<td class="contant">
										<xsl:value-of select="root/rmk" />
										<br />
									</td>
								</tr>
								<tr>
									<td class="title2">통제일자</td>
									<td class="contant">
										<xsl:attribute name="id">
											<xsl:text>ctrlYmd1</xsl:text>
										</xsl:attribute>
										<xsl:if test="string-length(root/ctrl_ymd) = 8">
											<xsl:value-of select="substring(root/ctrl_ymd,0,5)" />
											-
											<xsl:value-of select="substring(root/ctrl_ymd,5,2)" />
											-
											<xsl:value-of select="substring(root/ctrl_ymd,7,2)" />
											<br />
										</xsl:if>
									</td>
									<td class="title2">통제자</td>
									<td class="contant">
										<xsl:attribute name="id">
											<xsl:text>ctrlPsn1</xsl:text>
										</xsl:attribute>
										<xsl:value-of select="root/ctrl_psn_nm" />
										(
										<xsl:value-of select="substring(root/ctrl_psn,3,8)" />
										)
										<br />
									</td>
									<td class="title2">편성단위</td>
									<td class="contant">
										<xsl:value-of select="root/fomat_unit_text" />
										<br />
									</td>
								</tr>
							</table>
						<p></p>
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
								<tr>
									<td class="body">
										<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
											<xsl:for-each select="root/fileList">
												<tr>
													<td class="title2" width="16%">첨부파일(<xsl:value-of select="seq" />)</td>
													<td class="contant" width="84%">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select='attach_file_no' /><xsl:value-of select='seq' />", "XAA002")</xsl:attribute>
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
			</BODY>
	</xsl:template>
</xsl:stylesheet>