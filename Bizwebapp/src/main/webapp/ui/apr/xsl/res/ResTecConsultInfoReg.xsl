<?xml version="1.0"?>
<!DOCTYPE xsl:stylesheet [ <!ENTITY nbsp "&#160;"> ]>
<xsl:stylesheet xmlns:LINS="snapshot.css" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:fo="http://www.w3.org/1999/XSL/Format">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
		
			<BODY>
				<!-- [B]신청내용 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">기술자문신청정보</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="20%" class="title2">신청번호</td>
									
									<xsl:if test="APPROVAL/contract_no = ''">
										<td width="30%" class="contant" colspan="3">
											<xsl:value-of select="APPROVAL/req_no" />
										</td>
									</xsl:if>
									<xsl:if test="APPROVAL/contract_no != ''">
										<td width="30%" class="contant">
											<xsl:value-of select="APPROVAL/req_no" />
										</td>
									
										<td width="20%" class="title2">계약번호</td>
										<td width="30%" class="contant" >
											<xsl:value-of select="APPROVAL/contract_no" />
										</td>
									</xsl:if>
								</tr>
								<tr>
									<td width="20%" class="title2">자문명</td>
									<td width="30%" class="contant" colspan="3">
										<xsl:value-of select="APPROVAL/consult_nm" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">신청자</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/consult_req_nm" />
									</td>
									<td width="20%" class="title2">신청일자</td>
									<td width="30%" class="contant" >
										<xsl:value-of select="substring(APPROVAL/consult_req_date, 1, 4)" />
										-
										<xsl:value-of select="substring(APPROVAL/consult_req_date, 5, 2)" />
										-
										<xsl:value-of select="substring(APPROVAL/consult_req_date, 7, 2)" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">기술책임자</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/consult_rst_nm" />
									</td>
									<td width="20%" class="title2">자문기간</td>
									<td width="30%" class="contant" >
										<xsl:value-of select="substring(APPROVAL/consult_start_date, 1, 4)" />
										-
										<xsl:value-of select="substring(APPROVAL/consult_start_date, 5, 2)" />
										-
										<xsl:value-of select="substring(APPROVAL/consult_start_date, 7, 2)" />
										~
										<xsl:value-of select="substring(APPROVAL/consult_end_date, 1, 4)" />
										-
										<xsl:value-of select="substring(APPROVAL/consult_end_date, 5, 2)" />
										-
										<xsl:value-of select="substring(APPROVAL/consult_end_date, 7, 2)" />										
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">기타(특이사항)</td>
									<td width="80%" class="contant" colspan="3">
										<xsl:value-of select="APPROVAL/other_special" />
									</td>									
								</tr>
								<tr>
									<td width="20%" class="title2">자문료총액</td>
									<td width="30%" class="contant">
										<xsl:value-of select="format-number(APPROVAL/consult_amt, '#,###.##')" />
									</td>
									<td width="20%" class="title2">공급가액(부가세)</td>
									<td width="30%" class="contant" >
										<xsl:value-of select="format-number(APPROVAL/supply_amt, '#,###.##')" />
										(<xsl:value-of select="format-number(APPROVAL/consult_tax, '#,###.##')" />)
									</td>
								</tr>
								
								<xsl:if test="APPROVAL/contract_no != ''">
								<tr>
									<td width="20%" class="title2">특약사항</td>
									<td width="80%" class="contant" colspan="3">
										<xsl:value-of select="APPROVAL/special_other" />
									</td>									
								</tr>
								<tr>
									<td width="20%" class="title2">기타사항</td>
									<td width="80%" class="contant" colspan="3">
										<xsl:value-of select="APPROVAL/other" />
									</td>									
								</tr>
								
								</xsl:if>								
							</table>
						</td>
					</tr>
				</table>
				<!-- [B]신청내용 (종료) -->
				
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 첨부파일 </td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<xsl:for-each select="APPROVAL/fileList_A/vector/data/mdata">
									<tr>
										<td class="title2" width="16%">기술자문신청서</td>
										<td class="contant" width="84%">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />","XAA016")</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</td>
									</tr>
								</xsl:for-each>
								<xsl:for-each select="APPROVAL/fileList_B/vector/data/mdata">
									<tr>
										<td class="title2" width="16%">기술자문계획서</td>
										<td class="contant" width="84%">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />","XAA016")</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</td>
									</tr>
								</xsl:for-each>
							
								<xsl:for-each select="APPROVAL/fileList_D/vector/data/mdata">
									<tr>
										<td class="title2" width="16%">기술자문계약서</td>
										<td class="contant" width="84%">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />","XAA016")</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</td>
									</tr>
								</xsl:for-each>
								
								<xsl:for-each select="APPROVAL/fileList_F/vector/data/mdata">
									<tr>
										<td class="title2" width="16%">기술자문관련자료</td>
										<td class="contant" width="84%">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />","XAA016")</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</td>
									</tr>
								</xsl:for-each>
									
							</table>
						</td>
					</tr>
				</table>
				
					<table class="aproutertable" width="100%">
						<tr>
							<td class="head">수요기업정보</td>
						</tr>
						<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="20%" class="title2">기업명</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/consult_vend_abbr" />
									</td>
									<td width="20%" class="title2">사업자등록번호</td>
									<td width="30%" class="contant" >
										<xsl:value-of select="APPROVAL/consult_bsns_psn_regst_no" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">대표자</td>
									<td width="80%" class="contant" colspan="3">
										<xsl:value-of select="APPROVAL/consult_reprs_psn_nm" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">주소</td>
									<td width="80%" class="contant" colspan="3">
										<xsl:value-of select="APPROVAL/consult_addr" />
									</td>
								</tr>
								<xsl:for-each select="APPROVAL/fileList_C/vector/data/mdata">
									<tr>
										<td class="title2" width="20%">사업자등록증</td>
										<td class="contant" width="80%" colspan="3">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />","XAA016")</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</td>
									</tr>
								</xsl:for-each>		
						</table>
						</td>
					</tr>
				</table>	
				<xsl:if test="APPROVAL/check_vend_cd = 'Y'">
					<table class="aproutertable" width="100%">
						<tr>
							<td class="head">입금기업정보</td>
						</tr>
						<tr>
							<td class="body">
								<table class="aprinnertable" width="100%">
									<tr>
										<td width="20%" class="title2">기업명</td>
										<td width="30%" class="contant">
											<xsl:value-of select="APPROVAL/receipt_vend_abbr" />
										</td>
										<td width="20%" class="title2">사업자등록번호</td>
										<td width="30%" class="contant" >
											<xsl:value-of select="APPROVAL/receipt_bsns_psn_regst_no" />
										</td>
									</tr>
									<tr>
										<td width="20%" class="title2">대표자</td>
										<td width="80%" class="contant" colspan="3">
											<xsl:value-of select="APPROVAL/receipt_reprs_psn_nm" />
										</td>
									</tr>
									<tr>
										<td width="20%" class="title2">주소</td>
										<td width="80%" class="contant" colspan="3">
											<xsl:value-of select="APPROVAL/receipt_addr" />
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				
				
				<xsl:if test="APPROVAL/contract_no = ''">
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">기술자문 참여자</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
							
								<tr>
									<td width="7%" class="title">성명</td>
									<td width="7%" class="title">개인번호</td>
									<td width="7%" class="title">직급</td>
									<td width="7%" class="title">부서</td>
									<td width="7%" class="title">기여률(%)</td>
									<td width="7%" class="title">지급액</td>
								</tr>
								<xsl:for-each select="APPROVAL/doc/vector/data/msgResConsultSS02">
									<tr>
										<td width="7%" class="contant-center">
											<xsl:value-of select="nm" />
										</td>
										<td width="7%" class="contant-center">
											<xsl:value-of select="empno" />
										</td>
										<td width="7%" class="contant-center">
											<xsl:value-of select="posi_nm" />
										</td>
										<td width="7%" class="contant-center">
											<xsl:value-of select="dept_nm" />
										</td>
										<td width="7%" class="contant-right">
											<xsl:value-of select="format-number(contri_rate, '###.##')" />%
										</td>
										<td width="7%" class="contant-right">
											<xsl:value-of select="format-number(pay_amt, '#,###')" />
										</td>
															
									</tr>
								</xsl:for-each>
								<tr>
										<td width="28%" colspan="4" class="contant-center">
											 합계
										</td>
										<td width="7%" class="contant-right">
											<xsl:value-of select="format-number(APPROVAL/contri_rate_sum, '#,###.##')" />%
										</td>
										<td width="7%" class="contant-right">
											<xsl:value-of select="format-number(APPROVAL/pay_amt_sum, '#,###.##')" />
										</td>
									</tr>
							</table>
						</td>
					</tr>
				</table>
				</xsl:if>
				
				<xsl:if test="APPROVAL/contract_no != ''">
				
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">기술자문 참여자</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="7%" class="title">성명</td>
									<td width="7%" class="title">개인번호</td>
									<td width="7%" class="title">직급</td>
									<td width="7%" class="title">부서</td>
									<td width="7%" class="title">기여률(%)</td>
									<td width="7%" class="title">지급액</td>
									<td width="7%" class="title">세후지급액</td>
									<td width="7%" class="title">과세적용</td>
									<td width="7%" class="title">과세율</td>
									<td width="7%" class="title">과세금액</td>
									<td width="7%" class="title">주민세</td>
									<td width="7%" class="title">은행</td>
									<td width="7%" class="title">계좌번호</td>
									<td width="7%" class="title">예금주</td>
									<td width="7%" class="title">비고</td>									
								</tr>
								<xsl:for-each select="APPROVAL/doc/vector/data/msgResConsultSS02">									
									<tr>
										<td width="7%" class="contant-center">
											<xsl:value-of select="nm" />
										</td>
										<td width="7%" class="contant-center">
											<xsl:value-of select="empno" />
										</td>
										<td width="7%" class="contant-center">
											<xsl:value-of select="posi_nm" />
										</td>
										<td width="7%" class="contant-center">
											<xsl:value-of select="dept_nm" />
										</td>
										<td width="7%" class="contant-center">
											<xsl:value-of select="format-number(contri_rate, '#,###.##')" />
										</td>
										<td width="7%" class="contant-right">
											<xsl:value-of select="format-number(pay_amt, '#,###.##')" />
										</td>
										<td width="7%" class="contant-right">
											<xsl:value-of select="format-number(col_after_tax_pay_amt, '#,###.##')" />
										</td>
										<td width="7%" class="contant-center">
											<xsl:if test="col_tax_cd = '1'">
												Y
											</xsl:if>
											<xsl:if test="col_tax_cd != '1'">
												N
											</xsl:if>
										</td>
										<td width="7%" class="contant-center">
											<xsl:value-of select="format-number(col_tax_apply_rt, '#,###')" />
										</td>
										<td width="7%" class="contant-right">
											<xsl:value-of select="format-number(col_tax_amt, '#,###.##')" />
										</td>
										<td width="7%" class="contant-right">
											<xsl:value-of select="format-number(col_inciim_tax, '#,###.##')" />
										</td>																				
										<td width="7%" class="contant-center">
											<xsl:value-of select="bank_nm" />
										</td>
										<td width="7%" class="contant-center">
											<xsl:value-of select="col_bank_accont_no" />
										</td>
										<td width="7%" class="contant-center">
											<xsl:value-of select="col_depstr" />
										</td>
										<td width="7%" class="contant-center">
											<xsl:value-of select="col_rmk" />
										</td>
									</tr>
								</xsl:for-each>
								<tr>
										<td width="28%" colspan="4" class="contant-center">
											 합계
										</td>
										<td width="7%" class="contant-center">
											<xsl:value-of select="format-number(APPROVAL/contri_rate_sum, '#,###.##')" />
										</td>
										<td width="7%" class="contant-right">
											<xsl:value-of select="format-number(APPROVAL/pay_amt_sum, '#,###.##')" />
										</td>
										<td width="7%" class="contant-right">
											<xsl:value-of select="format-number(APPROVAL/col_after_tax_pay_amt_sum, '#,###.##')" />
										</td>
										<td width="7%" class="contant-center"></td>
										<td width="7%" class="contant-right"></td>
										<td width="7%" class="contant-right">
											<xsl:value-of select="format-number(APPROVAL/col_tax_amt_sum, '#,###.##')" />
										</td>
										<td width="7%" class="contant-right">
											<xsl:value-of select="format-number(APPROVAL/col_inciim_tax_sum, '#,###.##')" />
										</td>																				
										<td width="7%" class="contant-center" colspan="4"></td>
									</tr>
							</table>
						</td>
					</tr>
				</table>
				</xsl:if>

			</BODY>
		
	</xsl:template>
</xsl:stylesheet>