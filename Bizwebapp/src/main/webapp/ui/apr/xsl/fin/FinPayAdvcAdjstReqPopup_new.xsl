<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="snapshot.css" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:fo="http://www.w3.org/1999/XSL/Format">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<body>
				<script>
					<![CDATA[
						/* 크리스피드 이원길 미리보기 시작 */
						function openEvidWindow(unslipNo){
							var url = "https://evid.kitech.re.kr/sd/view?CLS=00&amp;amp;amp;RESL_NO=" + unslipNo + "&amp;amp;amp;EMP_NO=" + unslipNo;
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
									<td width="20%" class="title2">정산신청번호</td>
									<td colspan="2" class="contant-center">
										<xsl:value-of select="root/fspPayAdvcAdjstVo/adjst_req_no" />
										<br />
									</td>
									<td width="20%" class="title2">정산일자</td>
									<td colspan="2" class="contant-center">
										<xsl:value-of select="root/fspPayAdvcAdjstVo/adjst_ymd" />
										<br />
									</td>
								</tr>
								<tr>
									<td class="title2">정산자</td>
									<td width="10%" class="contant-center">
										<xsl:value-of select="root/fspPayAdvcAdjstVo/adjst_emp_no" />
										<br />
									</td>
									<td width="20%" class="contant-center">
										<xsl:value-of select="root/fspPayAdvcAdjstVo/adjst_psn_nm" />
										<br />
									</td>
									<td class="title2">정산부서</td>
									<td class="contant-center" colspan="2">
										<xsl:value-of select="root/fspPayAdvcAdjstVo/adjst_dept_nm" />
										<br />
									</td>

								</tr>
								<tr>
									<td class="title2">신청금액</td>
									<td class="contant-right" colspan="2">
										<xsl:value-of select="format-number(root/fspPayAdvcAdjstVo/req_amt, '#,###')" />
										<br />
									</td>
									<td class="title2">정산금액</td>
									<td class="contant-right" colspan="2">
										<xsl:value-of select="format-number(root/fspPayAdvcAdjstVo/adjst_amt, '#,###')" />
										<br />
									</td>
								</tr>
								<tr>
									<td class="title2">결의번호</td>
									<td colspan="2" class="contant-center">
										<xsl:value-of select="root/fspPayAdvcAdjstVo/unslip_no" />
									</td>
									<td colspan="3" class="contant-center" valign="center" style="padding:0">
										<a>
											<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="root/fspPayAdvcAdjstVo/unslip_no" />')</xsl:attribute>
											<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif" style="display:block;vertical-align:top;padding-left:10px" />
										</a>
									</td>
								</tr>
								<tr>
									<td class="title2">정산내역</td>
									<td class="contant" colspan="5">
										<xsl:value-of select="root/fspPayAdvcAdjstVo/adjst_detls" />
										<br />
									</td>

								</tr>
								<xsl:if test="root/fspPayAdvcAdjstVo/bank_nm != ''">
									<tr>
										<td class="title2">은행/계좌번호</td>
										<td width="15%" class="contant-center">
											<xsl:value-of select="root/fspPayAdvcAdjstVo/bank_nm" />
											<br />
										</td>
										<td width="20%" class="contant-center">
											<xsl:value-of select="root/fspPayAdvcAdjstVo/bankaccnt_no" />
											<br />
										</td>
										<td class="title2">개인번호/예금주</td>
										<td width="10%" class="contant-center">
											<xsl:value-of select="root/fspPayAdvcAdjstVo/adjst_emp_no" />
										</td>
										<td with="10%" class="contant-center">
											<xsl:value-of select="root/fspPayAdvcAdjstVo/depstr_nm" />
											<br />
										</td>
									</tr>
								</xsl:if>
							</table>
						</td>
					</tr>
				</table>

				<p />
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
					<tr>
						<td width="100%" class="head">정산 계정 내역</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="4%" class="title">순번</td>
									<td width="10%" class="title">계정번호</td>
									<td width="10%" class="title">회계코드</td>
									<td width="15%" class="title">회계코드명</td>
									<td width="8%" class="title">비용코드</td>
									<td width="14%" class="title">비용코드명</td>
									<td width="12%" class="title">신청금액</td>
									<td width="12%" class="title">정산금액</td>
									<td width="15%" class="title">통제번호</td>
								</tr>
								<xsl:for-each select="root/fspPayAdvcAdjstGridVoList">
									<tr>
										<td class="contant-center">
											<xsl:number count="root/fspPayAdvcAdjstGridVoList" level="single" format="1" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="accnt_no" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="accnt_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="accnt_cd_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="expns_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="expns_cd_nm" />
										</td>
										<td class="contant-right">
											<xsl:if test="req_amt != ''">
												<xsl:value-of select="format-number(req_amt, '#,###,###')" />
											</xsl:if>
											<br />
										</td>
										<td class="contant-right">
											<xsl:if test="adjst_amt != ''">
												<xsl:value-of select="format-number(adjst_amt, '#,###,###')" />
											</xsl:if>
											<br />
										</td>
										<td class="contant-center">
											<xsl:if test="ctrl_no != ''">
												<xsl:value-of select="ctrl_no" />
											</xsl:if>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<p />
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
					<tr>
						<td width="100%" class="head">잔액 입금 내역</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="4%" class="title">순번</td>
									<td width="15%" class="title">입금일자</td>
									<td width="25%" class="title">계좌번호</td>
									<td width="13%" class="title">입금금액</td>
									<td width="20%" class="title">입금내역</td>
									<td width="23%" class="title">비고</td>
								</tr>
								<xsl:if test="root/fcpDepstDetlsVoList != ''">
								<xsl:for-each select="root/fcpDepstDetlsVoList">
									<tr>
										<td class="contant-center">
											<xsl:number count="root/fcpDepstDetlsVoList" level="single" format="1" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="depst_ymd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="bankaccnt_no" />
										</td>
										<td class="contant-right">
											<xsl:if test="depst_amt != ''">
												<xsl:value-of select="format-number(depst_amt, '#,###,###')" />
											</xsl:if>
											<br />
										</td>
										<td class="contant-center">
											<xsl:value-of select="detls" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="rmk" />
										</td>
									</tr>
								</xsl:for-each>
								</xsl:if>
							</table>
						</td>
					</tr>
				</table>
				<p />
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
					<tr>
						<td width="100%" class="head">정산 추가계정 내역</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="4%" class="title">순번</td>
									<td width="8%" class="title">구분</td>
									<td width="8%" class="title">계정번호</td>
									<td width="15%" class="title">계정명</td>
									<td width="8%" class="title">회계코드</td>
									<td width="15%" class="title">회계코드명</td>
									<td width="8%" class="title">비용코드</td>
									<td width="14%" class="title">비용코드명</td>
									<td width="10%" class="title">신청금액</td>
									<td width="10%" class="title">통제번호</td>
								</tr>
								<xsl:if test="root/fspPayAdvcAdjstAddVoList != ''">
								<xsl:for-each select="root/fspPayAdvcAdjstAddVoList">
									<tr>
										<td class="contant-center">
											<xsl:number count="root/fspPayAdvcAdjstAddVoList" level="single" format="1" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="cd_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="accnt_no" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="accnt_no_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="accnt_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="accnt_cd_abbr" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="expns_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="expns_cd_nm" />
										</td>
										<td class="contant-right">
											<xsl:if test="req_amt != ''">
												<xsl:value-of select="format-number(req_amt, '#,###,###')" />
											</xsl:if>
											<br />
										</td>
										<td class="contant-center">
											<xsl:if test="ctrl_no != ''">
												<xsl:value-of select="ctrl_no" />
											</xsl:if>
										</td>
									</tr>
								</xsl:for-each>
								</xsl:if>
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
								<xsl:for-each select="root/fileList">
									<tr>
										<td class="title2" width="16%">첨부파일(<xsl:value-of select="seq" />)
										</td>
										<td class="contant" width="84%">
											<a>
												<xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="attach_file_no" />/<xsl:value-of select="seq" />')</xsl:attribute>
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
			</body>
	</xsl:template>
</xsl:stylesheet>
