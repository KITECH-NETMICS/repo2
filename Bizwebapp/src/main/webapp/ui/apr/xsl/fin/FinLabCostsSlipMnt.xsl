<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
			<body>
				<script language="javascript">
					<![CDATA[
							function openTransReasonOZPop(unslipNo){					
								var	ozFileNm	=	"fin/fin/spa/FinAccntTransReasonSel.ozr";					
								var	ozrNm			=	"FinAccntTransReasonSel";					
								var url = "https://biz.kitech.re.kr/websquare/popup.html?w2xPath=/kitech/com/oz/ComPopupOZReport.xml";
								var node = url+"&ozr="+ozFileNm+"&odi="+ozrNm+"&printMode=Y&param=unslip_no^"+unslipNo;
								node = node.replaceAll("amp;","");
								window.open(node,"OZReport", "width=1012px, height=610px, location=no, resizable=yes");				
							
							}
		
							function openBfSlipDecsndOZPop(unslipNo){					
								var	ozFileNm	=	"fin/fin/leg/FinAccntLedger6Sel.ozr";					
								var	ozrNm			=	"FinAccntLedger6Sel";					
								var url = "https://biz.kitech.re.kr/websquare/popup.html?w2xPath=/kitech/com/oz/ComPopupOZReport.xml";
								var node = url+"&ozr="+ozFileNm+"&odi="+ozrNm+"&printMode=Y&param=unslip_no^"+unslipNo;
								node = node.replaceAll("amp;","");
								window.open(node,"OZReport", "width=1012px, height=610px, location=no, resizable=yes");				
							
							}
							
							function openAccntPsnexpnsOZPop(salry_base_fr_yrmon, salry_base_to_yrmon, accnt_no, syspayno){
								var	ozFileNm	=	"fin/fin/seq/FinAccntPsnexpns1Sel.ozr";
								var	ozrNm			=	"FinAccntPsnexpns1Sel";
								var url = "https://biz.kitech.re.kr/websquare/popup.html?w2xPath=/kitech/com/oz/ComPopupOZReport.xml";
								var node = url+"&ozr="+ozFileNm+"&odi="+ozrNm+"&printMode=Y&param=salry_base_fr_yrmon^"+salry_base_fr_yrmon.trim()+"*salry_base_to_yrmon^"+salry_base_to_yrmon.trim()+"*accnt_no^"+accnt_no.trim()+"*syspayno^"+syspayno.trim();
								node = node.replaceAll("amp;","");
								window.open(node,"OZReport", "width=1012px, height=610px, location=no, resizable=yes");                 										
							}
							
							/* 크리스피드 이원길 미리보기 시작 */
							function openEvidWindow(unslipNo){
								var url = "https://evid.kitech.re.kr/sd/view?CLS=00&amp;amp;amp;amp;RESL_NO=" + unslipNo + "&amp;amp;amp;amp;EMP_NO=" + unslipNo;
								url = url.replaceAll("amp;","");
								window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
							}
							/* 크리스피드 이원길 미리보기 끝 */
					]]>
			    </script>	
				<table width="100%" border="0" cellpadding="0" cellspacing="10" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="10%" class="title">결의일자</td>
									<td width="10%" class="contant-center"><xsl:value-of select="APPROVAL/doc1/slip_ymd" /></td>
									<td width="10%" class="title">작성일자</td>
									<td width="10%" class="contant-center"><xsl:value-of select="APPROVAL/doc1/wrte_ymd" /></td>
									<td width="10%" class="title">작성자</td>
									<td width="10%" class="contant-center"><xsl:value-of select="APPROVAL/doc1/nm" /></td>
									<td width="10%" class="title">작성부서</td>
									<td width="30%" class="contant-center"><xsl:value-of select="APPROVAL/doc1/dept_nm" /></td>
								</tr>
								<tr>
									<td class="title">회계일자</td>
									<td class="contant-center"><xsl:value-of select="APPROVAL/doc1/accnt_ymd" /></td>
									<td class="title">결의유형</td>
									<td class="contant-center"><xsl:value-of select="APPROVAL/doc1/slip_typ_cd" /></td>
									<td class="title">결의번호</td>
									<td class="contant-center"><xsl:value-of select="APPROVAL/doc1/unslip_no" /></td>
									<td class="title">적요</td>
									<td class="contant-center"><xsl:value-of select="APPROVAL/doc1/rmk" /></td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<br />
				<br />

				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
					<tr>
						<td width="90%" class="head">변경 전 계정</td>
						<!-- 크리스피드 이원길 미리보기 버튼 추가 시작 -->
						<td width="10%" align="right" valign="bottom">
							<a>
								<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="APPROVAL/doc1/unslip_no" />')</xsl:attribute>
								<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/>
							</a>
						</td>
						<!-- 크리스피드 이원길 미리보기 버튼 추가 끝 -->
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="10" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="5%" class="title">No</td>
									<td width="6%" class="title">계정번호</td>
									<td width="8%" class="title">계정<br />책임자</td>
									<td width="6%" class="title">회계코드</td>
									<td width="8%" class="title">회계<br />코드명</td>
									<td width="7%" class="title">비용<br />코드</td>
									<td width="9%" class="title">비용<br />코드명</td>
									<td width="10%" class="title">금액</td>
									<td width="10%" class="title">통제번호</td>
									<td width="35%" class="title">비고</td>
								</tr>

								<xsl:for-each select="APPROVAL/doc2/vector/data">
									<tr>
										<xsl:attribute name="ONCLICK1">chngData('<xsl:number count="APPROVAL/doc2/vector/data" level="single" format="1" />')</xsl:attribute>
										<td class="contant-center"><xsl:number count="APPROVAL/doc2/vector/data" level="single" format="1" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS02/accnt_no" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS02/rspns_nm" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS02/accnt_cd" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS02/accnt_cd_abbr" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS02/expns_cd" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS02/expns_cd_nm" /></td>
										<td class="contant-right"><xsl:value-of select="format-number(msgFspSlipdMS02/unslip_amt, '#,###,###')" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS02/ctrl_no" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS02/rmk_1" /></td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<br />
				<br />

				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
					<tr>
						<td width="100%" class="head">변경 후 계정</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="4%" class="title" rowspan="2">No</td>
									<td width="6%" class="title">계정번호</td>
									<td width="27%" class="title">계정명</td>
									<td width="5%" class="title">회계<br />코드</td>
									<td width="8%" class="title">회계<br />코드명</td>
									<td width="5%" class="title">비용<br />코드</td>
									<td width="8%" class="title">비용<br />코드명</td>
									<td width="10%" class="title">금액</td>
								</tr>
								<tr>
									<td class="title" colspan="3">적요</td>
									<td class="title">거래처</td>
									<td class="title">증빙</td>
									<td class="title">첨부파일</td>
									<td class="title">편성단위</td>
								</tr>
								<xsl:for-each select="APPROVAL/doc3/vector/data">
									<tr>
										<xsl:attribute name="id">R<xsl:number count="APPROVAL/doc3/vector/data" level="single" format="1" /></xsl:attribute>
										<td class="contant-center" rowspan="2">
											<xsl:number count="APPROVAL/doc3/vector/data" level="single" format="1" />
											<br />
										</td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS03/accnt_no" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS03/accnt_no_nm" /></td>
										<td class="contant-center"><xsl:value-of select="substring(msgFspSlipdMS03/accnt_cd, 0, 5)" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS03/accnt_cd_abbr" /></td>
										<td class="contant-center"><xsl:value-of select="substring(msgFspSlipdMS03/expns_cd, 0, 5)" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS03/expns_cd_nm" /></td>
										<td class="contant-center" align="right"><xsl:value-of select="format-number(msgFspSlipdMS03/unslip_amt, '#,###,###')" /></td>
									</tr>
									<tr>
										<xsl:attribute name="id">RR<xsl:number count="APPROVAL/doc3/vector/data" level="single" format="1" /></xsl:attribute>
										<td class="contant-center" colspan="3"><xsl:value-of select="msgFspSlipdMS03/rmk_1" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS03/vend_abbr" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS03/evid_cd" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS03/attach_file_no" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipdMS03/fomat_unit" /></td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<p />
				<p />

				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
					<tr>
						<td width="100%" class="head">관련내역</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable" id="relTab">
								<tr>
									<td width="5%" class="title">No</td>
									<td width="10%" class="title">가결의순번</td>
									<td width="15%" class="title">관리항목</td>
									<td width="15%" class="title">세부적요</td>
									<td width="55%" class="title">세부적요명</td>
								</tr>
								<xsl:for-each select="APPROVAL/doc4/vector/data">
									<tr>
										<xsl:attribute name="id">R<xsl:value-of select="msgFspSlipMngmtMS01/unslip_odr" /></xsl:attribute>
										<td class="contant-center"><xsl:number count="APPROVAL/doc4/vector/data" level="single" format="1" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipMngmtMS01/unslip_odr" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipMngmtMS01/mngmt_item_nm" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipMngmtMS01/mngmt_detls_cd" /></td>
										<td class="contant-center"><xsl:value-of select="msgFspSlipMngmtMS01/mngmt_detls_nm" /></td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<p />
				<p />
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
											<xsl:attribute name="href">javascript:openTransReasonOZPop("<xsl:value-of select="APPROVAL/doc1/unslip_no" />")</xsl:attribute>
											사유서
										</a>
									</td>
									<td class="title2" width="10%">변경전원장</td>
									<td class="contant" width="15%">
										<a>
											<xsl:attribute name="href">javascript:openBfSlipDecsndOZPop("<xsl:value-of select="APPROVAL/doc1/unslip_no" />")</xsl:attribute>
											변경전원장
										</a>
									</td>
									<td class="title2" width="22%">계정별인건비배부현황</td>
									<td class="contant" width="28%">
										<a>
											<xsl:attribute name="href">javascript:openAccntPsnexpnsOZPop('<xsl:value-of select="APPROVAL/doc1/salry_base_fr_yrmon" />','<xsl:value-of
												select="APPROVAL/doc1/salry_base_to_yrmon" />','<xsl:value-of select="APPROVAL/doc1/accnt_no" />','<xsl:value-of
												select="APPROVAL/doc1/syspayno" />')</xsl:attribute>
											계정별인건비배부현황
										</a>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<!-- 첨부파일 기능은 현재 없으므로 일단 막아 놓음. 2011.11.03.정종구 -->
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">첨부파일</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<xsl:for-each select="APPROVAL/FILE_LIST/vector/data/msgXomxComAttachFileMS01">
									<tr>
										<td class="title2" width="16%">첨부파일(<xsl:value-of select="seq" />)</td>
										<td class="contant" width="84%">
											<a>
												<xsl:attribute name="href">javascript:xslFileDownload("<xsl:value-of select="attach_full_path" />/<xsl:value-of
													select="org_file" />")</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</td>
									</tr>
								</xsl:for-each>
								<tr>
									<td colspn="2" height="0" />
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<p />
				<p />
			</body>
	</xsl:template>
</xsl:stylesheet>