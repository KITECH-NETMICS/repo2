<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
			<BODY>
			<form name="frmXsl" target="blank" action="https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
				<INPUT type="hidden" name="FilePath" size="25" />
				<INPUT type="hidden" name="orgFileName" size="25" />
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
				<tr>
					<td class="head">신청자정보</td>
				</tr>
			    <tr>
			        <td class="body">
						<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">															
							<tr>								
								<td width="6%" class="title">신청자</td>
								<td width="14%" class="contant">
									<xsl:value-of
										select="response/selectInfo/vector/data/msgLprPrGdReqHMS02/req_psn_nm" />
								</td>
								<td width="8%" class="title">개인번호</td>
								<td width="14%" class="contant">
									<xsl:value-of
									select="response/selectInfo/vector/data/msgLprPrGdReqHMS02/req_psn_empno" />
								</td>
								<td width="6%" class="title">소속</td>
								<td width="14%" class="contant">
									 <xsl:value-of
										select="response/selectInfo/vector/data/msgLprPrGdReqHMS02/req_psn_dept_nm" />
								</td>
								<td width="6%" class="title">직급</td>
								<td width="14%" class="contant">
									 <xsl:value-of
										select="response/selectInfo/vector/data/msgLprPrGdReqHMS02/req_psn_posi_nm" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<table width="100%" class="aproutertable">
				<tr>
					<td class="head">신청정보</td>
				</tr>
				<tr>
				     <td class="body">
				     	<table width="100%" class="aprinnertable">													
							<tr>
								<td width="11%" class="title2">신청번호</td>
								<td width="30%" class="contant">
									<xsl:value-of
									select="response/selectInfo/vector/data/msgLprPrGdReqHMS02/req_no" />
								</td>
								<td class="title2">신청일자</td>
								<td class="contant" colspan="3">											
									<xsl:value-of
									select="response/selectInfo/vector/data/msgLprPrGdReqHMS02/req_ymd" />
								</td>
							</tr>
							<tr>
								<td class="title2">계정번호</td>
								<td class="contant">
									(<xsl:value-of
										select="response/selectInfo/vector/data/msgLprPrGdReqHMS02/accnt_no" />)
									<xsl:value-of
										select="response/selectInfo/vector/data/msgLprPrGdReqHMS02/accntnm" />
								</td>
								<td class="title2">비용코드</td>
								<td width="15%" class="contant">									
									<xsl:value-of
										select="response/selectInfo/vector/data/msgLprPrGdReqHMS02/expns_cd" />
								</td>
								<td class="title2">통제번호</td>
								<td width="15%" class="contant">
									<xsl:value-of
										select="response/selectInfo/vector/data/msgLprPrGdReqHMS02/ctrl_no" />
								</td>
							</tr>							
							<tr>
								<td class="title2">신청사유</td>
								<td colspan="5" class="contant">
									<xsl:value-of
										select="translate(response/selectInfo/vector/data/msgLprPrGdReqHMS02/req_cause, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />									
								</td>
							</tr>
							<tr>
								<td class="title2">비고</td>
								<td colspan="5" class="contant">
									<xsl:value-of
										select="translate(response/selectInfo/vector/data/msgLprPrGdReqHMS02/rmk, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />									
								</td>
							</tr>
							<tr>
								<td class="title2">물품<br>신청정보</br></td>
								<td colspan="5" class="contant">
									<table width="100%" class="aproutertable">				
										<tr>
										     <td class="body">
										     	<table width="100%" class="aprinnertable">
													<tr>
														<td class="title">홍보물</td>
														<td class="title">신청수량</td>
														<td class="title">단가</td>
													    <td class="title">총금액</td>
													</tr>
													<xsl:for-each select="response/selectGridInfo/vector/data/msgLprPrGdReqDMS01">
													<xsl:variable name="prgds_nm" select="prgds_nm" />
												    <xsl:variable name="req_qty" select="req_qty" />
													<xsl:variable name="unit_price" select="unit_price" />
													<xsl:variable name="sum_cost" select="sum_cost" />
													<tr>
														<td width="40%" class="contant-center">
														 	<xsl:value-of select="$prgds_nm"/>
													    </td>
													    <td width="20%" class="contant-right">
														 	<xsl:value-of select="$req_qty"/>
													    </td>
													    <td width="20%" class="contant-right">
														 	<xsl:value-of select="format-number($unit_price,'#,###,###,###,###,###')"/>
													    </td>
													    <td width="20%" class="contant-right">
														 	<xsl:value-of select="format-number($sum_cost,'#,###,###,###,###,###')"/>
													    </td>
													</tr>
													</xsl:for-each>
												</table>
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<table width="100%" class="aproutertable">				
				<tr>
				     <td class="body">
				     	<table width="100%" class="aprinnertable">
							<tr>								
								<td class="contant-right">
									총합계 :									
									<xsl:value-of
										select="response/selectInfo/vector/data/msgLprPrGdReqHMS02/apr_total_sum" />
								</td>
							</tr>
						</table>
					</td>
				</tr>							
			</table>	
			<table width="100%" class="aproutertable">				
				<tr>
			     	<td class="body">
			     		<table width="100%" class="aprinnertable">
				          <tr>
				           <td class="title2">첨부파일</td>
				           <td class="contant" width="80%">								
							<xsl:for-each select="response/selectInfo/fileList_A/vector/data">
	                            <a>
	                               <xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="mdata/attach_file_no" /><xsl:value-of select="mdata/seq" />','XAA014')</xsl:attribute>
	                               <xsl:value-of select="mdata/file_nm"/>
	                               <br />
	                            </a>
	                        </xsl:for-each>																															
				           </td>
				          </tr>
       					</table>
  					</td>
		  		</tr>
			</table>
			</form>
			<iframe name="ifr" height="0" width="0"></iframe>
			</BODY>
	</xsl:template>
</xsl:stylesheet>