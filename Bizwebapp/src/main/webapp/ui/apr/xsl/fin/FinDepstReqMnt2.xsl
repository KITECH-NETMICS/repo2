<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<body>
				<script language="javascript">
					<![CDATA[
						/* 크리스피드 이원길 미리보기 시작 */
						function openEvidWindow(unslipNo) {
							var url = "https://evid.kitech.re.kr/sd/view?CLS=00&amp;amp;amp;RESL_NO=" + unslipNo + "&amp;amp;amp;EMP_NO=" + unslipNo;
							url = url.replaceAll("amp;","");
							window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
						}
						/* 크리스피드 이원길 미리보기 끝 */
					]]>
				</script>
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">신청내용1</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="15%" class="title2">신청번호</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVAL/req_no" />
									</td>
									<td width="15%" class="title2">신청자</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVAL/req_psn_nm" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">신청일자</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVAL/req_ymd" />
									</td>
									<td width="15%" class="title2">부서</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVAL/req_dept" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">적요</td>
									<td width="85%" colspan="3" class="contant">
										<xsl:value-of select="APPROVAL/Hrmk" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">결의번호</td>
									<td width="35%" colspan="1" class="contant-center">
										<xsl:value-of select="APPROVAL/unslip_no" />
									</td>
									<td width="50%" colspan="2" class="contant-center" valign="center" style="padding:0">
										<a>
											<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="APPROVAL/unslip_no" />')</xsl:attribute>
											<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif" style="display:block;vertical-align:top;padding-left:10px" />
										</a>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<!-- [A]신청내용 (종료) -->
				<!-- [B]계정정보 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">계정정보</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="13%" class="title2">계정번호</td>
									<td width="20%" class="contant">
										<xsl:value-of select="APPROVAL/accnt_no" />
									</td>
									<td width="13%" class="title2">과제번호</td>
									<td width="20%" class="contant">
										<xsl:value-of select="APPROVAL/prj_no" />
									</td>
									<td width="13%" class="title2">과제기간</td>
									<td width="21%" class="contant">
										<xsl:value-of select="APPROVAL/start_ymd" />
										~
										<xsl:value-of select="APPROVAL/cls_ymd" />
									</td>
								</tr>
								<tr>
									<td width="13%" class="title2">과제명</td>
									<td width="87%" colspan="5" class="contant">
										<xsl:value-of select="APPROVAL/accnt_no_nm" />
									</td>
								</tr>
								<tr>
									<td width="13%" class="title2">과제책임자</td>
									<td width="20%" class="contant">
										<xsl:value-of select="APPROVAL/emp_nm" />
									</td>
									<td width="13%" class="title2">직급</td>
									<td width="20%" class="contant">
										<xsl:value-of select="APPROVAL/posi_nm" />
									</td>
									<td width="13%" class="title2">소속</td>
									<td width="21%" class="contant">
										<xsl:value-of select="APPROVAL/dept_nm" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<!-- [B]계정정보 (종료) -->
				<!-- [C]입금상세정보 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">입금상세정보</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="13%" class="title2">입금구분</td>
									<td width="20%" class="contant-center">
										<xsl:value-of select="APPROVAL/depst_clsf_nm" />
									</td>
									<td width="13%" class="title2">계산서번호</td>
									<td width="21%" class="contant-center">
										<xsl:value-of select="APPROVAL/bill_no" />
									</td>
									<td width="13%" class="title2">입금액</td>
									<td width="20%" class="contant-right">
										<xsl:value-of select="format-number(APPROVAL/depst_liq, '###,###,###,##0')" />
									</td>
								</tr>
								<tr>
									<td width="13%" class="title2">입금일자</td>
									<td width="20%" class="contant-center">
										<xsl:value-of select="APPROVAL/depst_ymd" />
									</td>
									<td width="13%" class="title2">은행</td>
									<td width="21%" class="contant-center">
										<xsl:value-of select="APPROVAL/bank" />
									</td>
									<td width="13%" class="title2">계좌번호</td>
									<td width="20%" class="contant-center">
										<xsl:value-of select="APPROVAL/acct_no" />
									</td>
								</tr>
								<tr>
									<td width="13%" class="title2">거래처</td>
									<td width="20%" class="contant">
										<xsl:value-of select="APPROVAL/vend_nm" />
									</td>
									<td width="13%" class="title2">비고</td>
									<td width="54%" colspan="3" class="contant">
										<xsl:value-of select="APPROVAL/rmk" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<!-- [C]입금상세정보 (종료) -->
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
												<xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="attach_full_path" />/<xsl:value-of select="org_file" />')</xsl:attribute>
												<xsl:value-of select="file_nm" />
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
