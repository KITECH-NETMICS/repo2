<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
 	 <xsl:variable name="localPath" select="request/localPath"/>
			<BODY>
				<table cellpadding="3" width="100%" cellspacing="0" borderColor="#000" border="1px" style="border-collapse:collapse">
					<tr>
						<td width="16%" class="system-b1">계약번호</td>
						<td width="16%">
							<xsl:value-of
							select="response/select/msgPurCheckUpComplt01/pur_req_no" />							
						</td>
						<td width="16%" class="system-b1">준공검사 차수</td>
						<td width="16%">							
								<xsl:value-of
								select="response/select/msgPurCheckUpComplt01/complt_test_seq" /> 차								
						</td>
					</tr>
					<tr>
						<td class="system-b1">
								<xsl:value-of
								select="response/select/msgPurCheckUpComplt01/build_nm" /> 명
						</td>
						<td colspan="3">
							<xsl:value-of
								select="response/selectCntMaster/msgPurContrctMastr01/contrct_nm" />
						</td>
					</tr>
					<tr>
						<td class="system-b1">계약자</td>
						<td colspan="3">
							<xsl:value-of
								select="response/select/msgPurCheckUpComplt01/contrct_vend_cd" /> - 
							<xsl:value-of
								select="response/select/msgPurCheckUpComplt01/vend_nm" />	
						</td>
					</tr>
					<tr>
						<td class="system-b1">계약일자</td>
						<td>
							<xsl:value-of
								select="response/selectCntMaster/msgPurContrctMastr01/contrct_ymd" />
						</td>
						<td class="system-b1">계약금액</td>
						<td>
							<xsl:value-of
								select="response/selectCntMaster/msgPurContrctMastr01/contrct_tot_amt" />
						</td>
					</tr>
					<tr>
						<td class="system-b1">공사기간</td>
						<td>
							<xsl:value-of
								select="response/select/msgPurCheckUpComplt01/build_start_ymd" /> ~ 
							<xsl:value-of
								select="response/select/msgPurCheckUpComplt01/build_cls_ymd" />
						</td>
						<td class="system-b1">준공년월일</td>
						<td>
							<xsl:value-of
								select="response/select/msgPurCheckUpComplt01/complt_ymd" />
						</td>
					</tr>
					<tr>
						<td class="system-b1">검사내용</td>
						<td colspan="3">
							명에 의하여 
							<xsl:value-of
								select="response/select/msgPurCheckUpComplt01/complt_test_ymd" /> 일 위의 공사에 대한 	준공(기성고) 검사를 실시한 결과 
							<xsl:value-of
								select="response/select/msgPurCheckUpComplt01/build_nm" /> 시방서, 설계서 및 명세서 대로 
							전공정이 
							( <xsl:value-of
								select="response/select/msgPurCheckUpComplt01/procs_complt_rts" /> % 완료) 되었음을 확인함. 
						</td>
					</tr>					
				</table>
			</BODY>
	</xsl:template>
</xsl:stylesheet>