<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/APPROVAL">
		<xsl:variable name="localPath" select="request/localPath" />
			<body>
				<script type="text/javascript"><![CDATA[
					function openTransReasonOZPop(unslipNo){					
						var	ozFileNm	=	"/fin/fin/spa/FinLabCostAccntTransRsn.ozr";					
						var	ozrNm			=	"FinLabCostAccntTransRsn";					
						var url = "https://biz.kitech.re.kr/websquare/popup.html?w2xPath=/kitech/com/oz/ComPopupOZReport.xml";
						var node = url+"&ozr="+ozFileNm+"&odi="+ozrNm+"&printMode=Y&param=unslip_no^"+unslipNo;
						node = node.replaceAll("amp;","");
						window.open(node,"OZReport", "width=1012px, height=610px, location=no, resizable=yes");
					}
				
					/* 크리스피드 이원길 미리보기 시작 */
					function openEvidWindow(unslipNo){
						var url = "https://evid.kitech.re.kr/sd/view?CLS=00&amp;amp;RESL_NO=" + unslipNo + "&amp;amp;EMP_NO=" + unslipNo;
						url = url.replaceAll("amp;","");
						window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
					}
					/* 크리스피드 이원길 미리보기 끝 */
				]]></script>
				<table width="100%" border="0" cellpadding="0" cellspacing="10" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td class="title">결의번호</td>
									<td class="contant-center">
										<a style="color: #0000FF;">
											<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="doc1/unslip_no" />')</xsl:attribute>
											<xsl:value-of select="doc1/unslip_no" />
										</a>
									</td>
									<td class="title">결의일자</td>
									<td class="contant-center">
										<xsl:value-of select="doc1/slip_ymd" />
									</td>
									<td class="title">유형</td>
									<td class="contant-center">
										<xsl:value-of select="doc1/slip_typ_nm" />
									</td>
								</tr>
								<tr>
									<td class="title">작성자</td>
									<td class="contant-center">
										<xsl:value-of select="doc1/nm" />
									</td>
									<td class="title">작성부서</td>
									<td class="contant" colspan='3'>
										<xsl:value-of select="doc1/dept_nm" />
									</td>
								</tr>
								<tr>
									<td class="title">적요</td>
									<td class="contant" colspan='5'>
										<xsl:value-of select="doc1/rmk" />
									</td>
								</tr>
								<tr>
									<td class="title">해당월</td>
									<td class="contant-center">
										<xsl:value-of select="doc1/distr_yrmon" />
									</td>
									<td class="title">참여연구원</td>
									<td class="contant-center">
										<xsl:value-of select="doc1/user_nm" />
										(
										<xsl:value-of select="doc1/user_empno" />
										)
									</td>
									<td class="title">
										<xsl:value-of select="doc1/month" />
										월 인건비
									</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(doc1/tot_salry, '#,###,###')" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
					<tr>
						<td width="100%" class="head">변경전</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="10" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td class="title" rowspan='2'>No</td>
									<td class="title" rowspan='2'>계정번호</td>
									<td class="title" rowspan='2'>계정책임자</td>
									<td class="title" colspan='2'>변경전</td>
									<td class="title" rowspan='2'>과제기간</td>
									<td class="title" rowspan='2'>과제명</td>
								</tr>
								<tr>
									<td class="title">참여율</td>
									<td class="title">인건비</td>
								</tr>
								<xsl:for-each select="doc2/vector/data">
									<xsl:if test="msgResBglCostMS02/chng_yn = 'Y'">
										<tr style="color:blue;background-color:#FFFFC4">
											<td class="contant-center">
												<xsl:number count="doc2/vector/data" level="single" format="1" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgResBglCostMS02/accnt_no" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgResBglCostMS02/accnt_rspns_nm" />
											</td>
											<td class="contant-right" style="white-space:nowrap;">
												<xsl:value-of select="format-number(msgResBglCostMS02/distr_rt, '#,###.###')" />
											</td>
											<td class="contant-right" style="white-space:nowrap;">
												<xsl:value-of select="format-number(msgResBglCostMS02/distr_amt, '#,###,###')" />
											</td>
											<td class="contant" style="white-space:nowrap;">
												<xsl:value-of select="msgResBglCostMS02/prj_prd" />
											</td>
											<td class="contant">
												<xsl:value-of select="msgResBglCostMS02/accnt_no_nm" />
											</td>
										</tr>
									</xsl:if>
									<xsl:if test="msgResBglCostMS02/chng_yn != 'Y'">
										<tr>
											<td class="contant-center">
												<xsl:number count="doc2/vector/data" level="single" format="1" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgResBglCostMS02/accnt_no" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgResBglCostMS02/accnt_rspns_nm" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(msgResBglCostMS02/distr_rt, '#,###.###')" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(msgResBglCostMS02/distr_amt, '#,###,###')" />
											</td>
											<td class="contant">
												<xsl:value-of select="msgResBglCostMS02/prj_prd" />
											</td>
											<td class="contant">
												<xsl:value-of select="msgResBglCostMS02/accnt_no_nm" />
											</td>
										</tr>
									</xsl:if>
								</xsl:for-each>
								<xsl:if test="doc1/bf_sum_yn = 'Y'">
									<tr>
										<td class="title" colspan='3'>총 계</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(doc1/bf_distr_rt_sum, '#,###.###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(doc1/bf_distr_amt_sum, '#,###,###')" />
										</td>
										<td class="contant" colspan='2' />
									</tr>
								</xsl:if>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
					<tr>
						<td width="100%" class="head">변경 후</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td class="title" rowspan='2'>No</td>
									<td class="title" rowspan='2'>계정번호</td>
									<td class="title" rowspan='2'>계정책임자</td>
									<td class="title" colspan='2'>변경후</td>
									<td class="title" colspan='2'>증감</td>
									<td class="title" rowspan='2'>구분</td>
								</tr>
								<tr>
									<td class="title">참여율</td>
									<td class="title">인건비</td>
									<td class="title">참여율</td>
									<td class="title">인건비</td>
								</tr>
								<xsl:for-each select="doc3/vector/data">
									<xsl:if test="msgResBglCostMS03/color_yn = 'Y'">
										<tr style="color:blue;background-color:#FFFFC4">
											<td class="contant-center">
												<xsl:number count="doc3/vector/data" level="single" format="1" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgResBglCostMS03/accnt_no" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgResBglCostMS03/accnt_rspns_nm" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(msgResBglCostMS03/trans_rt, '#,###.###')" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(msgResBglCostMS03/trans_amt, '#,###,###')" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(msgResBglCostMS03/distr_rt_diff, '#,###.###')" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(msgResBglCostMS03/distr_amt_diff, '#,###,###')" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgResBglCostMS03/chng_typ" />
											</td>
										</tr>
									</xsl:if>
									<xsl:if test="msgResBglCostMS03/color_yn != 'Y'">
										<tr>
											<td class="contant-center">
												<xsl:number count="doc3/vector/data" level="single" format="1" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgResBglCostMS03/accnt_no" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgResBglCostMS03/accnt_rspns_nm" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(msgResBglCostMS03/trans_rt, '#,###.###')" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(msgResBglCostMS03/trans_amt, '#,###,###')" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(msgResBglCostMS03/distr_rt_diff, '#,###.###')" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(msgResBglCostMS03/distr_amt_diff, '#,###,###')" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgResBglCostMS03/chng_typ" />
											</td>
										</tr>
									</xsl:if>
								</xsl:for-each>
								<xsl:if test="doc1/trans_accnt_yn = 'Y'">
									<tr>
										<td class="contant-center"></td>
										<td class="contant-center">
											<xsl:value-of select="doc1/accnt_no" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="doc1/accnt_rspns_nm" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(doc1/trans_rt, '#,###.###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(doc1/trans_amt, '#,###,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(doc1/distr_rt_diff, '#,###.###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(doc1/distr_amt_diff, '#,###')" />
										</td>
										<td class="contant-center">대체(BG/BK)</td>
									</tr>
								</xsl:if>
								<xsl:if test="doc1/aft_sum_yn = 'Y'">
									<tr>
										<td class="title" colspan='3'>총 계</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(doc1/trans_rt_sum, '#,###.###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(doc1/trans_amt_sum, '#,###,###')" />
										</td>
										<td class="contant" colspan='3' />
									</tr>
								</xsl:if>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">사유서</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class="title2" width="10%">사유서</td>
									<td class="contant" width="15%">
										<a>
											<xsl:attribute name="href">javascript:openTransReasonOZPop("<xsl:value-of select="doc1/unslip_no" />")</xsl:attribute>
											사유서
										</a>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</body>
	</xsl:template>
</xsl:stylesheet>