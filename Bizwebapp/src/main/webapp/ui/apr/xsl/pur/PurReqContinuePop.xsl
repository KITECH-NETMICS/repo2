<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/response">
		<xsl:variable name="localPath" select="request/localPath" />
			<BODY>
				<script type="text/javascript">
				<![CDATA[
				
					function openPurReqPop(tmpReqNo){
						uid = com.getLoginInfo('uid');
						var url = "https://nbiz.kitech.re.kr/websquare/popup.html?w2xPath=/ui/apr/layoutSimple.xml&amp;amp;reqNo="+tmpReqNo+"&amp;amp;endpoint="+uid+"&amp;amp;viewMode=read";
						url = url.replaceAll("amp;","");
						window.open(url,"구매요구번호확인","scrollbars=yes,toolbar=no,location=no,status=no,menubar=no,resizable=yes,width=900,height=800,left=100,top=100");
					}
					
					function openContrctNoPop(tmpContrctNo,oldChngSeqG2b){
						uid = com.getLoginInfo('uid');
						var url = "https://nbiz.kitech.re.kr/websquare/popup.html?w2xPath=/ui/apr/layoutSimple.xml&amp;amp;reqNo="+tmpContrctNo+"-"+oldChngSeqG2b+"&amp;amp;endpoint="+uid+"&amp;amp;viewMode=read";
						url = url.replaceAll("amp;","");
						window.open(url,"실행예산편성변경","scrollbars=yes,toolbar=no,location=no,status=no,menubar=no,resizable=yes,width=900,height=800,left=100,top=100");
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
										<xsl:value-of select="selectData/msgPurReqContinueSS01/conti_req_no" />
									</td>
									<td class='title2' width="16%">구매요구건명</td>
									<td class="contant">
										<xsl:value-of select="selectData/msgPurReqContinueSS01/req_usg" />
									</td>
								</tr>
								<tr>
									<td class='title2'>구매요구번호</td>
									<td class="contant">
										<xsl:if test="selectData/msgPurReqContinueSS01/apr_check != 'N'">
											<a style="color: #0000FF;">
												<xsl:attribute name="href">javascript:openPurReqPop('<xsl:value-of select="selectData/msgPurReqContinueSS01/pur_req_no" />')</xsl:attribute>
												<xsl:value-of select="selectData/msgPurReqContinueSS01/pur_req_no" />
											</a>
										</xsl:if>
										<xsl:if test="selectData/msgPurReqContinueSS01/apr_check = 'N'">
												<xsl:value-of select="selectData/msgPurReqContinueSS01/pur_req_no" />
										</xsl:if>
									</td>
									<td class='title2'>구매요청금액</td>
									<td class="contant">
										<xsl:value-of select="format-number(selectData/msgPurReqContinueSS01/req_amt_sum, '###,###,###,##0')" />
									</td>
								</tr>
								<tr>
									<td class='title2'>구매요구부서</td>
									<td class="contant">
										<xsl:value-of select="selectData/msgPurReqContinueSS01/req_dept_cd_nm" />
									</td>
									<td class='title2'>구매요구일자</td>
									<td class="contant">
										<xsl:value-of select="substring(selectData/msgPurReqContinueSS01/req_ymd, 1, 4)" />-<xsl:value-of select="substring(selectData/msgPurReqContinueSS01/req_ymd, 5, 2)" />-<xsl:value-of select="substring(selectData/msgPurReqContinueSS01/req_ymd, 7, 2)" />
									</td>
								</tr>
								<tr>
									<td class='title2'>사유</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="selectData/msgPurReqContinueSS01/conti_reason" />
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
								<xsl:for-each select="accntNoSelect/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="msgPurReqContinueMS01/accnt_no" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurReqContinueMS01/accnt_no_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurReqContinueMS01/tot_resch_prd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurReqContinueMS01/current_ymd" />
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
								<xsl:for-each select="fileList_A/vector/data/msgXomxComAttachFileMS01">
									<tr>
										<td class="contant">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
												<xsl:value-of select="org_file" />
											</a>
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