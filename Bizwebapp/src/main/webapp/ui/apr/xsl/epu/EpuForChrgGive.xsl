<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:LINS="http://www.inswave.com/LINS">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/APPROVAL">
		<xsl:variable name="localPath" select="request/localPath" />
			<BODY>
				<script type="text/javascript"><![CDATA[
					function openContrctPop(tmpReqNo){
						var url = "https://nbiz.kitech.re.kr/pop.jsp?w2xPath=/ui/apr/layoutSimple.xml&viewMode=read&reqNo="+tmpReqNo;
						window.open(url,"외자계약품의서","scrollbars=yes,toolbar=no,location=no,status=no,menubar=no,resizable=yes,width=900,height=800,left=100,top=100");
					}
					/* 크리스피드 이원길 미리보기 시작 */
					function openEvidWindow(unslipNo){
						var url = "http://evid.kitech.re.kr/sd/view?CLS=50&amp;amp;amp;RESL_NO=" + unslipNo + "&amp;amp;amp;EMP_NO=" + unslipNo;
						url = url.replaceAll("amp;","");
						window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
					}
					/* 크리스피드 이원길 미리보기 끝 */
				]]></script>
				<xsl:variable name="curncyUnitCdTmp" select="curncy_unit_cd" />
				
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body" colspan="2">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="16%">지급신청번호</td>
									<td class="contant-center">
										<xsl:value-of select="req_no" />
									</td>
									<td class='title2' width="16%">지급신청일자</td>
									<td class="contant-center">
										<xsl:value-of select="substring(req_ymd, 1, 4)" />
										-
										<xsl:value-of select="substring(req_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(req_ymd, 7, 2)" />
									</td>
									<xsl:if test="curncy_unit_cd = 'FAM022'">
										<td class='title2' width="16%">지급금액</td>
									</xsl:if>
									<xsl:if test="curncy_unit_cd != 'FAM022'">
										<td class='title2' width="16%">원화환산예정액</td>
									</xsl:if>
									<td class="contant-right">
										<xsl:value-of select="format-number(pay_amt, '#,###.##')" />
									</td>
								</tr>
								<xsl:if test="curncy_unit_cd != 'FAM022'">
									<tr>
										<td class='title2'>화폐단위 </td>
										<td class="contant-center">
											<xsl:value-of select="curncy_unit_nm" />
										</td>
										<td class='title2' width="16%">지급금액</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(suply_value, '#,###.##')" />
										</td>
										<td class='title2' width="16%"></td>
										<td class="contant-right">
											
										</td>
									</tr>
								</xsl:if>
							</table>
						</td>
					</tr>
				</table>
				<!-- 전자증빙 -->
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 계약정보</td>
						
						<td width="10%" align="right" valign="bottom">
							<a>
								<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="req_no" />')</xsl:attribute>
								<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/>
							</a>
						</td>
						
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head" colspan="2"> 계약정보 </td>
					</tr>
					<tr>
						<td class="body" colspan="2">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="16%">계약번호</td>
									<td class="contant-center">
										<xsl:choose>
											<xsl:when test="snapshot_yn = 'Y'">
												<a style="color: #0000FF;">
													<xsl:attribute name="href">javascript:openContrctPop('<xsl:value-of select="contrct_no" />')</xsl:attribute>
													<xsl:value-of select="contrct_no" />
												</a>
											</xsl:when>
											<xsl:otherwise>
												<xsl:value-of select="contrct_no" />
											</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class='title2' width="16%">계약명</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="contrct_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="16%">계약기간</td>
									<td class="contant-center">
										<xsl:value-of select="substring(suply_time_start_ymd, 1, 4)" />
										-
										<xsl:value-of select="substring(suply_time_start_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(suply_time_start_ymd, 7, 2)" />
										~
										<xsl:value-of select="substring(suply_time_cls_ymd, 1, 4)" />
										-
										<xsl:value-of select="substring(suply_time_cls_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(suply_time_cls_ymd, 7, 2)" />
									</td>
									<td class='title2' width="16%">납품일자</td>
									<td class="contant-center">
										<xsl:value-of select="substring(delvr_ymd, 1, 4)" />
										-
										<xsl:value-of select="substring(delvr_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(delvr_ymd, 7, 2)" />
									</td>
									<td class='title2' width="16%">검수일자</td>
									<td class="contant-center">
										<xsl:value-of select="substring(check_ymd, 1, 4)" />
										-
										<xsl:value-of select="substring(check_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(check_ymd, 7, 2)" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="16%">계약구분</td>
									<td class="contant-center">
										<xsl:value-of select="pur_clsf_cd" />
									</td>
									<td class='title2' width="16%">통화명</td>
									<td class="contant-center">
										<xsl:value-of select="contrct_time_curncy_unit_cd" disable-output-escaping="yes" />
									</td>
									<td class='title2' width="16%">계약금액</td>
									<td class="contant-right">
										<!-- <xsl:value-of select="format-number(contrct_tot_amt, '###,###,###.##')" /> -->
										<xsl:value-of select="contrct_tot_amt" disable-output-escaping="yes" />
									</td>
								</tr>
								
								<xsl:if test=" (region_amt != '') and (region_amt != '0') ">
									<tr>
									<td class='title2' width="16%"></td>
									<td class="contant-center">
									</td>
									<td class='title2' width="16%">통화명</td>
									<td class="contant-center">
										한국원
									</td>
									<td class='title2' width="16%">local금액</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(region_amt, '###,###,###.##')" />
									</td>
								</tr>
								</xsl:if>
								<tr>
									<td class='title2' width="16%">업체명</td>
									<td class="contant">
										<xsl:value-of select="vend_nm" />
									</td>
									<td class='title2' width="16%">대표자</td>
									<td class="contant-center">
										<xsl:value-of select="reprs_psn" />
									</td>
									<td class='title2' width="16%">사업자등록번호</td>
									<td class="contant-center">
										<xsl:value-of select="bsns_psn_regst_no" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="16%">업체주소</td>
									<td class="contant" colspan='5'>
										<xsl:value-of select="vend_addr" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="16%">계약부서</td>
									<td class="contant">
										<xsl:value-of select="req_dept" />
									</td>
									<td class='title2' width="16%">계약담당자</td>
									<td class="contant-center">
										<xsl:value-of select="req_psn" />
									</td>
									<td class='title2' width="16%">연락처</td>
									<td class="contant-center">
										<xsl:value-of select="ext_no" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>



				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head" colspan="2"> 지급정보 </td>
					</tr>
					<tr>
						<td class="body" colspan="2">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<xsl:for-each select="doc2/vector/data">
									<tr>
										<td class='title2' width="16%">지급방법</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurPayReqVendMS01/pay_way_desc" />
										</td>
										<td class='title2' width="16%">지급구분</td>
										<td class="contant">
											<xsl:value-of select="msgPurPayReqVendMS01/pay_clsf_desc" />
										</td>
										<td class='title2' width="16%">비용구분</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurPayReqVendMS01/expns_clsf_desc" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="16%">업체명</td>
										<td class="contant">
											<xsl:value-of select="msgPurPayReqVendMS01/rmk" />
										</td>
										<td class='title2' width="16%">계산서번호</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurPayReqVendMS01/bill_no" />
										</td>
										<td class='title2' width="16%">계산서발행일자</td>
										<td class="contant-center">
											<xsl:value-of select="substring(msgPurPayReqVendMS01/issu_date, 1, 4)" />
											-
											<xsl:value-of select="substring(msgPurPayReqVendMS01/issu_date, 5, 2)" />
											-
											<xsl:value-of select="substring(msgPurPayReqVendMS01/issu_date, 7, 2)" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="16%">거래은행</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurPayReqVendMS01/bank_nm" />
										</td>
										<td class='title2' width="16%">계좌번호</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurPayReqVendMS01/bankaccnt_no" />
										</td>
										<td class='title2' width="16%">예금주</td>
										<td class="contant">
											<xsl:value-of select="msgPurPayReqVendMS01/depstr_nm" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="16%">카드번호</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurPayReqVendMS01/card_no" />
										</td>
										<td class='title2' width="16%">승인번호</td>
										<td class="contant">
											<xsl:value-of select="msgPurPayReqVendMS01/apprvl_no" />
										</td>
										<td class='title2' width="16%">가맹점명</td>
										<td class="contant">
											<xsl:if test="msgPurPayReqVendMS01/pay_clsf = 'FAX900'">
												<xsl:value-of select="msgPurPayReqVendMS01/vend_nm" />
											</xsl:if>
										</td>
									</tr>

								</xsl:for-each>
									<tr>
										<td class='title2' width="16%">화폐단위</td>
										<td class="contant-center">
											<xsl:value-of select="curncy_unit_nm" />
										</td>
										<td class='title2' width="16%">지급금액</td>
										<td class="contant" colspan='3'>
											<xsl:if test="curncy_unit_cd != 'FAM022'">
												<xsl:value-of select="format-number(suply_value, '#,###.##')" />
											</xsl:if>
											<xsl:if test="curncy_unit_cd = 'FAM022'">
												<xsl:value-of select="format-number(pay_amt, '###,###,###.##')" />
											</xsl:if>
										</td>
									</tr>
									<tr>
										<td class="contant" colspan='6' style='height:0px;padding:0px;margine:0px;'></td>
									</tr>
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

								<xsl:for-each select="doc1/vector/data">
									<tr>
										<td class='title2' width="16%">과제명</td>
										<td class="contant" colspan="5">
											<xsl:value-of select="msgPurPayReqAccntMS01/accnt_no_nm" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="16%">계정번호</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurPayReqAccntMS01/accnt_no" />
											(
											<xsl:value-of select="msgPurPayReqAccntMS01/expns_cd" />
											)
										</td>
										<td class='title2' width="16%">회계(비용)코드</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurPayReqAccntMS01/accnt_cd" />
											(
											<xsl:value-of select="msgPurPayReqAccntMS01/expns_cd" />
											)
										</td>
										<td class='title2' width="16%">통제번호</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurPayReqAccntMS01/ctrl_no" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="16%">계정책임자</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurPayReqAccntMS01/accnt_rspns_nm" />
										</td>
										<td class='title2' width="16%">과제기간</td>
										<td class="contant-center" colspan='3'>
											<xsl:value-of select="substring(msgPurPayReqAccntMS01/start_ymd, 1, 4)" />
											-
											<xsl:value-of select="substring(msgPurPayReqAccntMS01/start_ymd, 5,2)" />
											-
											<xsl:value-of select="substring(msgPurPayReqAccntMS01/start_ymd, 7,2)" />
											~
											<xsl:value-of select="substring(msgPurPayReqAccntMS01/cls_ymd, 1,4)" />
											-
											<xsl:value-of select="substring(msgPurPayReqAccntMS01/cls_ymd, 5,2)" />
											-
											<xsl:value-of select="substring(msgPurPayReqAccntMS01/cls_ymd, 7,2)" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="16%">적요</td>
										<td class="contant" colspan='5'>
											<xsl:value-of select="msgPurPayReqAccntMS01/rmk" />
										</td>
									</tr>
									<tr>
										<xsl:if test="$curncyUnitCdTmp = 'FAM022'">
											<td class='title2' width="16%">지급금액</td>
										</xsl:if>
										<xsl:if test="$curncyUnitCdTmp != 'FAM022'">
											<td class='title2' width="16%">원화환산예정액</td>
										</xsl:if>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgPurPayReqAccntMS01/apr_pay_amt, '###,###,###.##')" />
										</td>
										<td class='title2' width="16%">원인행위금액</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgPurPayReqAccntMS01/enfrc_amt_cause, '#,###')" />
										</td>
										<td class='title2' width="16%">기처리액</td>
										<td class="contant-right">
											<xsl:if test="msgPurPayReqAccntMS01/unslip_amt != ''">
												<xsl:value-of select="format-number(msgPurPayReqAccntMS01/unslip_amt, '#,###')" />
											</xsl:if>
										</td>
									</tr>
									<tr>
										<td class='title2' width="16%">집행잔액</td>
										<td class="contant-right">
											<xsl:if test="msgPurPayReqAccntMS01/ramt_amt != ''">
												<xsl:value-of select="format-number(msgPurPayReqAccntMS01/ramt_amt, '#,###')" />
											</xsl:if>
										</td>
										<td class='title2' width="16%"></td>
										<td class="contant-right">
										</td>
										<td class='title2' width="16%"></td>
										<td class="contant-right">
										</td>
									</tr>
									<tr>
										<td class="contant" colspan='6' style='height:0px;padding:0px;margine:0px;'></td>
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
								<xsl:for-each select="fileList_A/vector/data/mdata">
									<tr>
										<td class='title2' width="16%">
											첨부파일 ( <!-- xsl:number format="T"/ -->
											<xsl:value-of select="seq" />
											)
										</td>
										<td class='contant' width="84%">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />', 'XAA004')</xsl:attribute>
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
	</xsl:template>
</xsl:stylesheet>