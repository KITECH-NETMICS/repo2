<?xml version="1.0"?>
<!DOCTYPE xsl:stylesheet [ <!ENTITY nbsp "&#160;"> ]>
<xsl:stylesheet xmlns:LINS="snapshot.css" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:fo="http://www.w3.org/1999/XSL/Format">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
			<body>
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
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable" style="margin-bottom:20px;">
					<tr>
						<td class="head">성적서 정보</td>
						<td align="right" valign="bottom">
						</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class="title2">신청번호</td>
									<td width="35%" class="contant">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_req_no" />
									</td>
									<td class="title2">접수번호</td>
									<td width="35%" class="contant">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_kolas_no" />
									</td>
								</tr>
								<tr>
									<td class="title2">고객명</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_cmpy_nm_krchar" />
									</td>
								</tr>
								<tr>
									<td class="title2">접수일자</td>
									<td class="contant">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_rcpt_ymd" />
									</td>
									<td class="title2">지원담당자</td>
									<td class="contant">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_rcpt_psn_nm" />
									</td>
								</tr>
								<tr>
									<td class="title2">처리상태</td>
									<td class="contant">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_prcs_state_nm" />
									</td>
									<td class="title2">기술책임자</td>
									<td class="contant">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_supt_respn_nm" />
									</td>
								</tr>
								<tr>
									<td class="title2">발행구분</td>
									<td class="contant">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_rst_book_issu_fg" />
									</td>
									<td class="title2">성적서번호</td>
									<td class="contant">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_rst_book_issu_no" />
										<a><xsl:attribute name="href">javascript:openEvidWindow("<xsl:value-of select='RstBookIssu/vector/data/msgRstBookIssuVec/apr_req_no'/>")</xsl:attribute>
										<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/>
										</a>
									</td>
								</tr>
								<tr>
									<td class="title2">국문/영문</td>
									<td class="contant">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_kr_eng_clsf" />
									</td>
									<td class="title2">성적서발행일</td>
									<td class="contant">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_issu_ymd" />
									</td>
								</tr>
								<tr>
									<td class="title2">공개여부</td>
									<td class="contant">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_rst_book_open_clsf" />
									</td>
									<td class="title2">공개기한</td>
									<td class="contant">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_limit_ymd" />
									</td>
								</tr>
								<tr>
									<td class="title2">갑지생성여부</td>
									<td class="contant">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_blackacre_clsf" />
									</td>
									<td class="title2">재발행비용</td>
									<td class="contant">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_issu_amt" />
									</td>
								</tr>
								<tr>
									<td class="title2">시험기간</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_test_start_ymd" />
										~
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_test_cls_ymd" />
									</td>
								</tr>
								<tr>
									<td class="title2">시험장소</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_test_loctn" />
									</td>
								</tr>
								<tr>
									<td class="title2">비고</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="RstBookIssu/vector/data/msgRstBookIssuVec/apr_rmk" />
									</td>
								</tr>
								<tr>
									<td class="title2">첨부파일</td>
									<td colspan="3" class="contant">
										<xsl:for-each select="RstBookIssu/vector/data/msgRstBookIssuVec/fileList_A/vector/data/mdata">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select='attach_file_no' /><xsl:value-of select='seq' />","XAA015")</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
											<br />
										</xsl:for-each>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<iframe name="ifr" style="display:none"></iframe>
			</body>
	</xsl:template>
</xsl:stylesheet>
