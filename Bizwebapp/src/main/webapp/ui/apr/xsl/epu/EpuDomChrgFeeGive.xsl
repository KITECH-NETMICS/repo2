<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
		<html lang="kr">
			<BODY>
			<script type="text/javascript">
				<![CDATA[
					function openBidOrdPop(tmpReqNo){
						var url = "https://nbiz.kitech.re.kr/pop.jsp?w2xPath=/ui/apr/layoutSimple.xml&viewMode=read&reqNo="+tmpReqNo;
						window.open(url,"발주계획서","scrollbars=yes,toolbar=no,location=no,status=no,menubar=no,resizable=yes,width=900,height=800,left=100,top=100");
					}
						
					/* 크리스피드 이원길 미리보기 시작 */
					function openEvidWindow(unslipNo){
						var url = "https://evid.kitech.re.kr/sd/view?CLS=00&RESL_NO=" + unslipNo + "&EMP_NO=" + unslipNo;
						url = url.replaceAll("amp;","");
						window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
					}
					/* 크리스피드 이원길 미리보기 끝 */
				]]>
				</script>
			
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body" colspan="2">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="16%">지급신청번호</td>
									<td class="contant-center">
										<xsl:value-of select="request/APPROVAL/req_no" />
									</td>
									<td class='title2' width="16%">지급신청일자</td>
									<td class="contant-center">
										<xsl:value-of select="substring(request/APPROVAL/req_ymd, 1, 4)" />
										-
										<xsl:value-of select="substring(request/APPROVAL/req_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(request/APPROVAL/req_ymd, 7, 2)" />
									</td>
									<td class='title2' width="16%">지급신청금액</td>
									<td class="contant-center">
										<xsl:value-of select="format-number(request/APPROVAL/pay_amt, '#,###')" />
									</td>
								</tr>
								<tr>
									<td class="title2">결의번호</td>
									<td class="contant-center">
										<xsl:value-of select="request/APPROVAL/unslip_no" />
									</td>
									<td colspan="4" class="contant-center" valign="middle">
										<a>
											<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="request/APPROVAL/unslip_no" />')</xsl:attribute>
											<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/>
										</a>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<!-- 전자증빙 -->
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 계약정보</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<!-- <tr>
						<td class="head"> 계약정보</td>
					</tr> -->
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="16%">발주번호</td>
									<td class="contant">
										<a style="color:#0000FF;">
											<xsl:attribute name="href">javascript:openBidOrdPop('<xsl:value-of select="request/APPROVAL/bid_ord_no" />')</xsl:attribute>
											<xsl:value-of select="request/APPROVAL/bid_ord_no" />
										</a>
									</td>
									<td class='title2' width="16%">공고명</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="request/APPROVAL/bid_title" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="16%">내외자구분</td>
									<td class="contant">
										<xsl:value-of select="request/APPROVAL/inout_psn_clsf" />
									</td>
									<td class='title2' width="16%">계약구분</td>
									<td class="contant">
										<xsl:value-of select="request/APPROVAL/pur_clsf_cd" />
									</td>
									<td class='title2' width="16%">계약방법</td>
									<td class="contant">
										<xsl:value-of select="request/APPROVAL/contrct_method" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="16%">낙찰자선정방법</td>
									<td class="contant" colspan='3'>
										<xsl:value-of select="request/APPROVAL/succ_type" />
									</td>
									<td class='title2' width="16%">비용구분</td>
									<td class="contant">
										<xsl:value-of select="request/APPROVAL/expns_clsf" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="16%">계약부서명</td>
									<td class="contant">
										<xsl:value-of select="request/APPROVAL/charg_dept_nm" />
									</td>
									<td class='title2' width="16%">계약담당자</td>
									<td class="contant">
										<xsl:value-of select="request/APPROVAL/charg_nm" />
									</td>
									<td class='title2' width="16%">연락처</td>
									<td class="contant-center">
										<xsl:value-of select="request/APPROVAL/ext_no" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 지급정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<xsl:for-each select="request/APPROVAL/doc2/vector/data">
									<tr>
										<td class='title2' width="16%">지급방법</td>
										<td class="contant">
											<xsl:value-of select="msgPurPayReqVendMS01/pay_way" />
										</td>
										<td class='title2' width="16%">지급구분</td>
										<td class="contant">
											<xsl:value-of select="msgPurPayReqVendMS01/pay_clsf_nm" />
										</td>
										<td class='title2' width="16%">지급금액</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgPurPayReqVendMS01/pay_amt, '#,###')" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="16%">업체명</td>
										<td class="contant">
											<xsl:value-of select="msgPurPayReqVendMS01/vend_nm" />
										</td>
										<td class='title2' width="16%">계산서번호</td>
										<td class="contant">
											<xsl:value-of select="msgPurPayReqVendMS01/bill_no" />
										</td>
										<td class='title2' width="16%">계산서발행일자</td>
										<td class="contant">
											<xsl:value-of select="substring(msgPurPayReqVendMS01/issu_date, 1, 4)" />
											-
											<xsl:value-of select="substring(msgPurPayReqVendMS01/issu_date, 5, 2)" />
											-
											<xsl:value-of select="substring(msgPurPayReqVendMS01/issu_date, 7, 2)" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="16%">거래은행</td>
										<td class="contant">
											<xsl:value-of select="msgPurPayReqVendMS01/bank_nm" />
										</td>
										<td class='title2' width="16%">계좌번호</td>
										<td class="contant">
											<xsl:value-of select="msgPurPayReqVendMS01/bankaccnt_no" />
										</td>
										<td class='title2' width="16%">예금주</td>
										<td class="contant">
											<xsl:value-of select="msgPurPayReqVendMS01/depstr_nm" />
										</td>
									</tr>
									<!-- <tr> -->
									<!-- <td class='title2' width="16%">카드번호</td> -->
									<!-- <td class="contant"><xsl:value-of select="msgPurPayReqVendMS01/card_no" /></td> -->
									<!-- <td class='title2' width="16%">가맹점번호</td> -->
									<!-- <td class="contant"><xsl:value-of select="msgPurPayReqVendMS01/joinsto_no" /></td> -->
									<!-- <td class='title2' width="16%">가맹점명</td> -->
									<!-- <td class="contant"><xsl:value-of select="msgPurPayReqVendMS01/vend_nm" /></td> -->
									<!-- </tr> -->
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 계정정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<xsl:for-each select="request/APPROVAL/doc1/vector/data">
									<tr>
										<td class='title2' width="16%">과제명</td>
										<td class="contant" colspan="5">
											<xsl:value-of select="msgPurPayReqAccntMS01/accnt_no_nm" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="16%">계정번호</td>
										<td class="contant">
											<xsl:value-of select="msgPurPayReqAccntMS01/accnt_no" />
										</td>
										<td class='title2' width="16%">회계(비용)코드</td>
										<td class="contant">
											<xsl:value-of select="msgPurPayReqAccntMS01/accnt_cd" />
											(
											<xsl:value-of select="msgPurPayReqAccntMS01/expns_cd" />
											)
										</td>
										<td class='title2' width="16%">통제번호</td>
										<td class="contant">
											<xsl:value-of select="msgPurPayReqAccntMS01/ctrl_no" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="16%">계정책임자</td>
										<td class="contant">
											<xsl:value-of select="msgPurPayReqAccntMS01/accnt_rspns_nm" />
										</td>
										<td class='title2' width="16%">과제기간</td>
										<td class="contant" colspan="3">
											<xsl:value-of select="substring(msgPurPayReqAccntMS01/start_ymd, 1, 4)" />
											-
											<xsl:value-of select="substring(msgPurPayReqAccntMS01/start_ymd, 5, 2)" />
											-
											<xsl:value-of select="substring(msgPurPayReqAccntMS01/start_ymd, 7, 2)" />
											~
											<xsl:value-of select="substring(msgPurPayReqAccntMS01/cls_ymd, 1, 4)" />
											-
											<xsl:value-of select="substring(msgPurPayReqAccntMS01/cls_ymd, 5, 2)" />
											-
											<xsl:value-of select="substring(msgPurPayReqAccntMS01/cls_ymd, 7, 2)" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="16%">적요</td>
										<td class="contant" colspan="5">
											<xsl:value-of select="msgPurPayReqAccntMS01/rmk" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="16%">지급신청액</td>
										<td class="contant-right">
											<xsl:if test="msgPurPayReqAccntMS01/pay_amt != ''">
												<xsl:value-of select="format-number(msgPurPayReqAccntMS01/pay_amt, '#,###')" />
											</xsl:if>
										</td>
										<td class='title2' width="16%">공급가액</td>
										<td class="contant-right">
											<xsl:if test="msgPurPayReqAccntMS01/suply_value != ''">
												<xsl:value-of select="format-number(msgPurPayReqAccntMS01/suply_value, '#,###')" />
											</xsl:if>
										</td>
										<td class='title2' width="16%">부가세액</td>
										<td class="contant-right">
											<xsl:if test="msgPurPayReqAccntMS01/add_tax != ''">
												<xsl:value-of select="format-number(msgPurPayReqAccntMS01/add_tax, '#,###')" />
											</xsl:if>
										</td>
									</tr>
									<tr>
										<td class='title2' width="16%">원인행위금액</td>
										<td class="contant-right">
											<xsl:if test="msgPurPayReqAccntMS01/enfrc_amt_cause != ''">
												<xsl:value-of select="format-number(msgPurPayReqAccntMS01/enfrc_amt_cause, '#,###')" />
											</xsl:if>
										</td>
										<td class='title2' width="16%">기처리액</td>
										<td class="contant-right">
											<xsl:if test="msgPurPayReqAccntMS01/unslip_amt != ''">
												<xsl:value-of select="format-number(msgPurPayReqAccntMS01/unslip_amt, '#,###')" />
											</xsl:if>
										</td>
										<td class='title2' width="16%">집행잔액</td>
										<td class="contant-right">
											<xsl:if test="msgPurPayReqAccntMS01/ramt_amt != ''">
												<xsl:value-of select="format-number(msgPurPayReqAccntMS01/ramt_amt, '#,###')" />
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
								<xsl:for-each select="request/APPROVAL/fileList_A/vector/data/mdata">
									<tr>
										<td class='title2' width="16%">
											첨부파일 ( <xsl:value-of select="seq" />)
										</td>
										<td class='contant' width="84%">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA015')</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
			</BODY>
		</html>
	</xsl:template>
</xsl:stylesheet>