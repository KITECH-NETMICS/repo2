<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:LINS="http://www.inswave.com/LINS">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/APPROVAL">
		<xsl:variable name="localPath" select="request/localPath" />
			<BODY>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body" colspan="2">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width='12%'>보조사업명 </td>
									<td class="contant" colspan='4'>
										<xsl:value-of select="ddtlbz_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2' rowspan='3'>수행기관 </td>
									<td class='title2'>기관명 </td>
									<td class="contant-center"> 한국생산기술연구원</td>
									<td class='title2'>대표자명</td>
									<td class="contant-center"> <xsl:value-of select="reprs_psn_nm" /></td>
								</tr>
								<tr>
									<td class='title2'>주소 </td>
									<td class="contant" colspan='3'>
										(<xsl:value-of select="postmt_no" />)<xsl:value-of select="addr" />
									</td>
								</tr>
								<tr>
									<td class='title2'>담당자 </td>
									<td class="contant-center"> <xsl:value-of select="req_psn_nm" /></td>
									<td class='title2'>이메일/연락처</td>
									<td class="contant"> <xsl:value-of select="email" />/<xsl:value-of select="ext_no" /></td>
								</tr>
								<tr>
									<td class='title2' >교부신청액 </td>
									<td class="contant-right" colspan='2'>
										<xsl:value-of select="format-number(dvrq_amount, '###,###,###')" />
									</td>
									<td class='title2' colspan='2'/>
								</tr>
								<tr>
									<td class='title2' rowspan='2'>총보조사업비 <br/> (단위 : 원) </td>
									<td class='title2'>국고보조금 </td>
									<td class='title2'>지방비부담금 </td>
									<td class='title2'>자기부담금 </td>
									<td class='title2'>합 계 </td>
								</tr>
								<tr>
									<td class='contant-right'><xsl:value-of select="format-number(gov_subsidy, '###,###,###')" /> </td>
									<td class='contant-right'><xsl:value-of select="format-number(area_share, '###,###,###')" /> </td>
									<td class='contant-right'><xsl:value-of select="format-number(self_share, '###,###,###')" /> </td>
									<td class='contant-right'><xsl:value-of select="format-number(subsidy_sum, '###,###,###')" /> </td>
								</tr>
								<tr>
									<td class='title2' rowspan='3'>사업개요 </td>
									<td class='title2' width='12%'>사업목적 </td>
									<td class="contant" colspan='3'> <xsl:value-of select="dev_goal" /></td>
								</tr>
								<tr>
									<td class='title2'>사업내용 </td>
									<td class="contant" colspan='3'> <xsl:value-of select="resch_contnt" /></td>
								</tr>
								<tr>
									<td class='title2'>사업기간 </td>
									<td class="contant" colspan='3'> <xsl:value-of select="biz_prd" /></td>
								</tr>
								<tr>
									<td class='title2' rowspan='3'>신청내용 </td>
									<td class='title2'>신청제목 </td>
									<td class="contant" colspan='3'> <xsl:value-of select="reqst_sj_nm" /></td>
								</tr>
								<tr>
									<td class='title2'>신청사항 </td>
									<td class="contant" colspan='3'> <xsl:value-of select="reqst_matter" /></td>
								</tr>
								<tr>
									<td class='title2'>신청기관명 </td>
									<td class="contant" colspan='3'> <xsl:value-of select="reqst_instt_nm" /></td>
								</tr>
								<tr>
									<td class='title2' rowspan='3'>입금계좌정보 </td>
									<td class='title2'>예금주성명 </td>
									<td class="contant"> <xsl:value-of select="rcpmny_dpstr_nm" /></td>
									<td class='title2'>입금식별번호 </td>
									<td class="contant"> <xsl:value-of select="dpstg_rcpmny_idntfc_code" /></td>
								</tr>
								<tr>
									<td class='title2'>은행명 </td>
									<td class="contant" colspan='3'> <xsl:value-of select="dpstg_bank_nm" /></td>
								</tr>
								<tr>
									<td class='title2'>계좌번호 </td>
									<td class="contant" colspan='3'> <xsl:value-of select="dpstg_acnut_no" /></td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				
				<br/>
			</BODY>
	</xsl:template>
</xsl:stylesheet>