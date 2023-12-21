<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<BODY>
			<script type="text/javascript">
				<![CDATA[				
					function openPurReqPop(purReqNo, aprState){												
						var data={
							reqNo : purReqNo,
							ref_yn : "Y",
							viewMode : "read",
							instStatus : (aprState == "XAD100")? "Completed" : "Running"
						};
						com.pop.open(com.pop.TYPE.VIEW_APR, data);
					}
				]]>
			</script>
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
				<tr>
					<td class="body">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
							<tr>
								<td class='title2' width="16%">계속연차신청번호</td>
								<td class="contant">
									<xsl:value-of select="root/reqVo/conti_req_no" />
								</td>
								<td class='title2' width="16%">구매요구건명</td>
								<td class="contant">
									<xsl:value-of select="root/reqVo/req_usg" />
								</td>
							</tr>
							<tr>
								<td class='title2'>구매요구번호</td>
								<td class="contant">
									<xsl:if test="root/reqVo/apr_check != 'N'">
										<a style="color: #0000FF;">
											<xsl:attribute name="href">javascript:openPurReqPop('<xsl:value-of
												select="root/reqVo/pur_req_no" />', '<xsl:value-of select="root/reqVo/apr_state_2" />')</xsl:attribute>
											<xsl:value-of select="root/reqVo/pur_req_no" />
										</a>
									</xsl:if>
									<xsl:if test="root/reqVo/apr_check = 'N'">
										<xsl:value-of select="root/reqVo/pur_req_no" />
									</xsl:if>
								</td>
								<td class='title2'>구매요청금액</td>
								<td class="contant">
									<xsl:value-of select="format-number(root/reqVo/req_amt_sum, '###,###,###,##0')" />
								</td>
							</tr>
							<tr>
								<td class='title2'>구매요구부서</td>
								<td class="contant">
									<xsl:value-of select="root/reqVo/req_dept_cd_nm" />
								</td>
								<td class='title2'>구매요구일자</td>
								<td class="contant">
									<xsl:value-of select="substring(root/reqVo/req_ymd, 1, 4)" />
									-
									<xsl:value-of select="substring(root/reqVo/req_ymd, 5, 2)" />
									-
									<xsl:value-of select="substring(root/reqVo/req_ymd, 7, 2)" />
								</td>
							</tr>
							<tr>
								<td class='title2'>사유</td>
								<td class="contant" colspan="3">
									<xsl:value-of select="root/reqVo/conti_reason" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<table width="100%" border="0" cellpadding="0" class="aproutertable">
				<tr>
					<td class="head"> 계정내역</td>
				</tr>
				<tr>
					<td class="body">
						<table width="100%" border="0" cellpadding="0" class="aprinnertable">
							<tr>
								<td class='title'>계정번호</td>
								<td class='title'>과제명</td>
								<td class='title'>총 과제기간</td>
								<td class='title'>금번 과제기간</td>
							</tr>
							<xsl:for-each select="root/prjList">
								<tr>
									<td class="contant-center">
										<xsl:value-of select="accnt_no" />
									</td>
									<td class="contant-center">
										<xsl:value-of select="accnt_no_nm" />
									</td>
									<td class="contant-center">
										<xsl:value-of select="tot_resch_prd" />
									</td>
									<td class="contant-center">
										<xsl:value-of select="current_ymd" />
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
							<xsl:for-each select="root/fileList">
								<tr>
									<td class="contant">
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