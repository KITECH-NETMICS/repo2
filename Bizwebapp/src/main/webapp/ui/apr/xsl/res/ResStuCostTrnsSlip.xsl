<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:LINS="http://www.inswave.com/LINS">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/APPROVAL">
		<xsl:variable name="localPath" select="request/localPath" />
		
			<BODY>
				<script type="text/javascript"><![CDATA[
					/* 크리스피드 이원길 미리보기 시작 */
					function openEvidWindow(unslipNo){
						var url = "https://evid.kitech.re.kr/sd/view?CLS=00&amp;amp;RESL_NO=" + unslipNo + "&amp;amp;EMP_NO=" + unslipNo;
						url = url.replaceAll("amp;","");
						window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
					}
					/* 크리스피드 이원길 미리보기 끝 */
				]]></script>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 결의 내역 </td>
					</tr>
					<tr>
						<td class="body" colspan="2">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2'>구분</td>
									<td class="contant" colspan='3'>
										<xsl:if test="slip_typ = 'A'">
											<span style="font-weight:bold">학생인건비 추가흡수</span>
										</xsl:if>
										<xsl:if test="slip_typ = 'C'">
											<span style="font-weight:bold">학생인건비 흡수취소</span>
										</xsl:if>
									</td>
								</tr>
								<tr>
									<td class='title2'>결의번호</td>
									<td class="contant">
										<a style="color: #0000FF;">
											<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="unslip_no" />')</xsl:attribute>
											<xsl:value-of select="unslip_no" />
										</a>
									</td>
									<td class='title2'>결의일자</td>
									<td class="contant">
										<xsl:value-of select="slip_ymd" />
									</td>
								</tr>
								<tr>
									<td class='title2'>작성자</td>
									<td class="contant">
										<xsl:value-of select="wrte_psn_nm" />
									</td>
									<td class="title2">작성부서</td>
									<td class="contant">
										<xsl:value-of select="dept_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>적요 </td>
									<td class="contant" colspan='3'>
										<xsl:value-of select="rmk" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<!-- 계정정보 -->
				<xsl:if test="slip_typ = 'C'">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 계정정보</td>
						</tr>
						<tr>
							<td class="body" colspan="2">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<tr>
										<td class='title2'>계정번호/연구책임자 </td>
										<td class="contant">
											<xsl:value-of select="accnt_no" />
											/
											<xsl:value-of select="accnt_rspns_nm" />
										</td>
										<td class='title2'>연구기간 </td>
										<td class="contant">
											<xsl:value-of select="accnt_prd" />
										</td>
									</tr>
									<tr>
										<td class='title2'>과제명 </td>
										<td class="contant" colspan='3'>
											<xsl:value-of select="accnt_no_nm" />
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<!-- 추가흡수 -->
				<xsl:if test="slip_typ = 'A'">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 추가흡수 내역 </td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<tr>
										<td class='title2'>흡수월</td>
										<td class='title2'>계정번호</td>
										<td class='title2'>연구책임자</td>
										<td class="title2">연구기간</td>
										<td class='title2'>흡수요청금액</td>
										<td class='title2'>신청사유</td>
									</tr>
									<xsl:for-each select="doc1/vector/data">
										<tr>
											<td class="contant-center">
												<xsl:value-of select="substring(msgFsaAbsrpMS01/absrp_yrmon, 1, 4)" />
												-
												<xsl:value-of select="substring(msgFsaAbsrpMS01/absrp_yrmon, 5, 2)" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgFsaAbsrpMS01/accnt_no" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgFsaAbsrpMS01/accnt_rspns_nm" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgFsaAbsrpMS01/accnt_prd" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(msgFsaAbsrpMS01/plan_amt, '#,###.##')" />
											</td>
											<td class="contant">
												<xsl:value-of select="msgFsaAbsrpMS01/rmk" />
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<!-- 흡수취소일 경우 -->
				<xsl:if test="slip_typ = 'C'">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 흡수취소 내역</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">

									<tr>
										<td class='title2' rowspan='2'>계정번호</td>
										<td class='title2' rowspan='2'>연구책임자</td>
										<td class="title" colspan='3'>흡수 취소 내역</td>
										<td class='title2' rowspan='2'>신청사유</td>
									</tr>
									<tr>
										<td class="title2">해당월</td>
										<td class="title2">원장금액</td>
										<td class="title2">취소금액</td>
									</tr>
									<xsl:for-each select="doc1/vector/data">
										<tr>
											<td class="contant-center">
												<xsl:value-of select="msgFsaAbsrpMS01/accnt_no" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgFsaAbsrpMS01/accnt_rspns_nm" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="substring(msgFsaAbsrpMS01/absrp_yrmon, 1, 4)" />
												-
												<xsl:value-of select="substring(msgFsaAbsrpMS01/absrp_yrmon, 5, 2)" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(msgFsaAbsrpMS01/ori_plan_amt, '#,###')" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(msgFsaAbsrpMS01/plan_amt, '#,###')" />
											</td>
											<td class="contant">
												<xsl:value-of select="msgFsaAbsrpMS01/rmk" />
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<br />
				<!-- 첨부파일 -->
				<xsl:if test="attach_file_no != ''">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 첨부파일</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<xsl:for-each select="fileList_A/vector/data/mdata">
										<tr>
											<td class="title2" width="16%">첨부파일(<xsl:value-of select="seq" />)</td>
											<td class="contant" width="84%">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select='attach_file_no' /><xsl:value-of select='seq' />", "XAA002")</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
			</BODY>
	</xsl:template>
</xsl:stylesheet>