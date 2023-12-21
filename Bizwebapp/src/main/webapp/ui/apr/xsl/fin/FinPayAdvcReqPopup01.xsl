<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
			<body>
				<script language="javascript">
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
				<!-- <script type="javascript" src="/kitech/com/js/snapCommon.js"></script> -->
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="10%" class="title2">신청번호</td>
									<td colspan="2" class="contant-center">
										<xsl:value-of select="APPROVAL/req_no" />
										
									</td>
									<td width="10%" class="title2">신청구분</td>
									<td colspan="3" class="contant-center">
										<xsl:value-of select="APPROVAL/req_clsf" />
										
									</td>
								</tr>
								<tr>
									<td class="title2">신청자</td>
									<td width="8%" class="contant-center">
										<xsl:value-of select="APPROVAL/req_empno" />
										
									</td>
									<td width="15%" class="contant-center">
										<xsl:value-of select="APPROVAL/req_emp_nm" />
										
									</td>
									<td class="title2">신청부서</td>
									<td class="contant-center" colspan="2">
										<xsl:value-of select="APPROVAL/req_dept_nm" />
										
									</td>
									<td class="contant-center" valign="middle">
										<a>
											<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="APPROVAL/unslip_no" />')</xsl:attribute>
											<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"></img>
										</a>
									</td>
								</tr>
								<tr>
									<td class="title2">신청일자</td>
									<td colspan="2" class="contant-center">
										<xsl:value-of select="substring(APPROVAL/req_ymd,0,5)" />
										-
										<xsl:value-of select="substring(APPROVAL/req_ymd,5,2)" />
										-
										<xsl:value-of select="substring(APPROVAL/req_ymd,7,2)" />
										
									</td>
									<td class="title2">지급요청일자</td>
									<td width="15%" class="contant-center">
										<xsl:value-of select="substring(APPROVAL/pay_demnd_ymd, 0, 5)" />
										-
										<xsl:value-of select="substring(APPROVAL/pay_demnd_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(APPROVAL/pay_demnd_ymd, 7, 2)" />
										
									</td>
									<td width="10%" class="title2">정산예정일자</td>
									<td width="15%" class="contant-center">
										<xsl:value-of select="substring(APPROVAL/adjst_schdl_ymd, 0, 5)" />
										-
										<xsl:value-of select="substring(APPROVAL/adjst_schdl_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(APPROVAL/adjst_schdl_ymd, 7, 2)" />
										
									</td>
								</tr>
								<tr>
									<td class="title2">계정번호</td>
									<td class="contant-center">
										<xsl:value-of select="APPROVAL/accnt_no" />
									</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/accnt_no_nm" />
										
									</td>
									<td class="title2">회계코드</td>
									<td class="contant-center">
										<xsl:value-of select="APPROVAL/accnt_cd" />
									</td>
									<td class="contant-center" colspan="2">
										<xsl:value-of select="APPROVAL/accnt_cd_abbr" />
									</td>
								</tr>
								<tr>
									<td class="title2">신청금액</td>
									<td class="contant-right" colspan="2">
										<xsl:attribute name="id">
											<xsl:text>reqAmt1</xsl:text>
										</xsl:attribute>
										<xsl:value-of select="format-number(APPROVAL/req_amt, '#,###')" />
										
									</td>
									<td class="title2">지급구분</td>
									<td width="15%" class="contant-center">
										<xsl:value-of select="APPROVAL/pay_clsf" />
										
									</td>
									<td width="10%" class="title2">결의번호</td>
									<td width="15%" class="contant-center">
										<xsl:value-of select="APPROVAL/unslip_no" />
										
									</td>
								</tr>
								<tr>
									<td class="title2">사유</td>
									<td class="contant" colspan="6">
										<xsl:value-of select="APPROVAL/req_cause" />
										
									</td>

								</tr>
								<tr>
									<td class="title2">비고(적요)</td>
									<td class="contant" colspan="6">
										<xsl:value-of select="APPROVAL/rmk" />
										
									</td>
								</tr>
								<tr>
									<td class="title2">은행</td>
									<td width="8%" class="contant-center">
										<xsl:value-of select="APPROVAL/bank" />
										
									</td>
									<td width="15%" class="contant-center">
										<xsl:value-of select="APPROVAL/bankaccnt_no" />
										
									</td>
									<td class="title2">개인번호/예금주</td>
									<td width="15%" class="contant-center">
										<xsl:value-of select="APPROVAL/vend_cd" />
									</td>
									<td with="10%" class="contant-center">
										<xsl:value-of select="APPROVAL/vend_cd_nm" />
										
									</td>
									<td width="15%" class="contant-center">
										<xsl:value-of select="APPROVAL/depstr_nm" />
										
									</td>
								</tr>
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
									<td width="8%" class="title">계정번호</td>
									<td width="20%" class="title">계정내역</td>
									<td width="8%" class="title">회계코드</td>
									<td width="15%" class="title">회계코드명</td>
									<td width="8%" class="title">비용코드</td>
									<td width="14%" class="title">비용코드명</td>
									<td width="8%" class="title">금액</td>
									<td width="15%" class="title">통제번호</td>
								</tr>
								<xsl:for-each select="APPROVAL/FinPayAdvcReq01/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:number count="APPROVAL/FinPayAdvcReq01/vector/data" level="single" format="1" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcReqMS04/accnt_no" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcReqMS04/accnt_no_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcReqMS04/accnt_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcReqMS04/accnt_cd_abbr" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcReqMS04/expns_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcReqMS04/expns_cd_nm" />
										</td>
										<td class="contant-right">
											<xsl:if test="msgFspPayAdvcReqMS04/req_amt != ''">
												<xsl:value-of select="format-number(msgFspPayAdvcReqMS04/req_amt, '#,###,###')" />
											</xsl:if>
											
										</td>
										<td class="contant-center">
											<xsl:if test="msgFspPayAdvcReqMS04/ctrl_no != ''">
												<xsl:value-of select="msgFspPayAdvcReqMS04/ctrl_no" />
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
								<xsl:for-each select="APPROVAL/FILE_LIST/vector/data/msgXomxComAttachFileMS01">
									<tr>
										<td class="title2" width="16%">
											첨부파일(<xsl:value-of select="seq" />)
										</td>
										<td class="contant" width="84%">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA002')</xsl:attribute>
												<xsl:value-of select="org_file" />
											</a>
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