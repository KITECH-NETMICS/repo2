<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="updateMasterInfo">
			<BODY>
			<form name="frmXsl" target="blank" action="http://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
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
									<td class="title2">성명/직원검색</td>
									<td class="contant" width="15%">
										<xsl:value-of
										select="vector/apr_req_nm" />
									</td>
									<td class="title2">급여번호</td>
									<td class="contant" width="10%">
											<xsl:value-of
											select="vector/apr_emp_no" />
									</td>
									<td class="title2">직급</td>
									<td class="contant" width="20%">
										 <xsl:value-of
											select="vector/apr_posi_nm" />
									</td>
									<td class="title2">소속</td>
									<td class="contant" width="20%">
										 <xsl:value-of
											select="vector/apr_req_dept_nm" />
									</td>
								</tr>
							</table>
						</td>
					</tr>		
				</table>
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">자녀</td>
					</tr>
					<tr>
					     <td class="body">
					     	<table width="100%" class="aprinnertable">
								<tr>
									<td class="title2">성명</td>
									<td width="21%" class="contant">
										<xsl:value-of
											select="vector/apr_bnft_psn_nm1" />
									</td>
									<td width="21%" class="contant">
										<xsl:value-of
											select="vector/apr_bnft_psn_nm2" />
									</td>
									<td width="21%" class="contant">
										<xsl:value-of
											select="vector/apr_bnft_psn_nm3" />
									</td>
										<td width="21%" class="contant">
										<xsl:value-of
											select="vector/apr_bnft_psn_nm4" />
									</td>												
								</tr>
								<tr>
									<td class="title2">주민등록번호</td>
									<td class="contant">
										<xsl:value-of
											select="vector/apr_bnft_psn_resid_no1" />
									</td>
									<td class="contant">
										<xsl:value-of
											select="vector/apr_bnft_psn_resid_no2" />
									</td>
									<td class="contant">
										<xsl:value-of
											select="vector/apr_bnft_psn_resid_no3" />
									</td>
										<td class="contant">
										<xsl:value-of
											select="vector/apr_bnft_psn_resid_no4" />
									</td>
								</tr>
								<tr>
									<td class="title2">학교</td>
									<td class="contant">
										(<xsl:value-of select="vector/apr_schl_clsf1" />) 
										<xsl:value-of
											select="vector/apr_bnft_psn_schl_nm1" />
									</td>
									<td class="contant">
										(<xsl:value-of select="vector/apr_schl_clsf2" />) 
										<xsl:value-of
											select="vector/apr_bnft_psn_schl_nm2" />
									</td>
									<td class="contant">
										(<xsl:value-of select="vector/apr_schl_clsf3" />) 
										<xsl:value-of
											select="vector/apr_bnft_psn_schl_nm3" />
									</td>
										<td class="contant">
										(<xsl:value-of select="vector/apr_schl_clsf4" />) 
										<xsl:value-of
											select="vector/apr_bnft_psn_schl_nm4" />
									</td>
								</tr>
								<tr>
									<td class="title2">학년(<xsl:value-of select="vector/apr_year" />)</td>
									<td class="contant">
										<xsl:value-of
											select="vector/apr_schlyr1" />
									</td>
									<td class="contant">
										<xsl:value-of
											select="vector/apr_schlyr2" />
									</td>
									<td class="contant">
										<xsl:value-of
											select="vector/apr_schlyr3" />
									</td>
										<td class="contant">
										<xsl:value-of
											select="vector/apr_schlyr4" />
									</td>
								</tr>
								<tr>
									<td class="title2">분기</td>
									<td class="contant">
										<xsl:value-of
											select="vector/apr_qutr1" />
									</td>
									<td class="contant">
										<xsl:value-of
											select="vector/apr_qutr2" />
									</td>
									<td class="contant">
										<xsl:value-of
											select="vector/apr_qutr3" />
									</td>
										<td class="contant">
										<xsl:value-of
											select="vector/apr_qutr4" />
									</td>
								</tr>
								<tr>
									<td class="title2">기 수혜금액</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_pre_amt1" />
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_pre_amt2" />
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_pre_amt3" />
									</td>
										<td class="contant-right">
										<xsl:value-of
											select="vector/apr_pre_amt4" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">신청금액</td>
					</tr>
					<tr>
					     <td class="body">
					     	<table width="100%" class="aprinnertable">
								<tr>
									<td class="title2">입학금</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_entsch_mny1" />														
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_entsch_mny2" />
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_entsch_mny3" />
									</td>
										<td class="contant-right">
										<xsl:value-of
											select="vector/apr_entsch_mny4" />
									</td>
								</tr>
								<tr>
									<td class="title2">수업료</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_lesn_fee1" />
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_lesn_fee2" />
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_lesn_fee3" />
									</td>
										<td class="contant-right">
										<xsl:value-of
											select="vector/apr_lesn_fee4" />
									</td>
								</tr>
								<tr>
									<td class="title2">학교운영지원비</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_promo_mfee1" />
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_promo_mfee2" />
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_promo_mfee3" />
									</td>
										<td class="contant-right">
										<xsl:value-of
											select="vector/apr_promo_mfee4" />
									</td>
								</tr>
								<tr>
									<td class="title2">학생회비</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_student_mfee1" />
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_student_mfee2" />
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_student_mfee3" />
									</td>
										<td class="contant-right">
										<xsl:value-of
											select="vector/apr_student_mfee4" />
									</td>
								</tr>
								<tr>
									<td class="title2">교과서대금</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_textbk_mny1" />
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_textbk_mny2" />
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_textbk_mny3" />
									</td>
										<td class="contant-right">
										<xsl:value-of
											select="vector/apr_textbk_mny4" />
									</td>
								</tr>
								<tr>
									<td class="title2">기타비</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_labwk_practc_fee1" />
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_labwk_practc_fee2" />
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_labwk_practc_fee3" />
									</td>
										<td class="contant-right">
										<xsl:value-of
											select="vector/apr_labwk_practc_fee4" />
									</td>
								</tr>
								<tr>
									<td class="title2">합계(원)</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_req_tot_amt1" />
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_req_tot_amt2" />
									</td>
									<td class="contant-right">
										<xsl:value-of
											select="vector/apr_req_tot_amt3" />
									</td>
										<td class="contant-right">
										<xsl:value-of
											select="vector/apr_req_tot_amt4" />
									</td>
								</tr>
								<tr>
									<td class="title2">사정금액(원)</td>
									<td width="21%" class="contant-right">
										<xsl:value-of
											select="vector/apr_auinsp_tot_amt1" />
									</td>
									<td width="21%" class="contant-right">
										<xsl:value-of
											select="vector/apr_auinsp_tot_amt2" />
									</td>
									<td width="21%" class="contant-right">
										<xsl:value-of
											select="vector/apr_auinsp_tot_amt3" />
									</td>
										<td width="21%" class="contant-right">
										<xsl:value-of
											select="vector/apr_auinsp_tot_amt4" />
									</td>
								</tr>
							</table>
						</td>
					</tr>			
				</table>								
					<tr>
						<td height="5"></td>
					</tr>
				<table class="aproutertable" width="100%">
					<tr>
				      <td class="body">
				        <table class="aprinnertable" width="100%">
							<tr>												
								<td class="title2">신청총액</td>
								<td class="contant-right" width="84%">
									<xsl:value-of
										select="vector/req_tot_liq" />
								</td>
							</tr>	
							<tr>												
								<td class="title2">사정총액</td>
								<td class="contant-right">
									<xsl:value-of
										select="vector/apr_auinsp_tot_liq" />
								</td>
							</tr>
							<tr>
								<td class="title2">첨부파일</td>
								<td class="contant">
									<xsl:for-each select="vector/fileList_A/vector/data/msgXomxComAttachFileMS01">
									<a>
										<xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="full_path" />')</xsl:attribute>
										<xsl:value-of select="org_file" /><br/>
									</a>
									</xsl:for-each>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>				
			<table width="100%" class="aproutertable">
				<tr>
					<td class="head">기지급정보</td>
				</tr>
				<tr>
				     <td class="body">
						<table class="aprinnertable" width="100%">
							<tr>
								<td width="10%" class="title2">년도</td>
								<td width="20%" class="title2">자녀명</td>
								<td width="35%" class="title2">신청금액</td>
								<td width="35%" class="title2">지급금액</td>
							</tr>
							<xsl:for-each select="vector/bnftPayInfo/vector/data">
							<xsl:variable name="apr_bnft_year"        select="msgCwlSubReqMS06/bnft_year" />
							<xsl:variable name="apr_bnft_psn_nm"    select="msgCwlSubReqMS06/bnft_psn_nm" />
							<xsl:variable name="apr_req_tot_amt"     select="msgCwlSubReqMS06/req_tot_amt" />
							<xsl:variable name="apr_auinsp_tot_amt" select="msgCwlSubReqMS06/auinsp_tot_amt" />
							<tr>
								<td width="10%" class="contant-center"> <xsl:value-of select="$apr_bnft_year"/> </td>
								<td width="20%" class="contant-center"> <xsl:value-of select="$apr_bnft_psn_nm"/> </td>
								<td width="35%" class="contant-center"> <xsl:value-of select="$apr_req_tot_amt"/> </td>
								<td width="35%" class="contant-center"> <xsl:value-of select="$apr_auinsp_tot_amt"/> </td>
							</tr>
							</xsl:for-each>
						</table>
					</td>
				</tr>
			</table>							
			<br></br>
    		<br></br>					
			<font class="document_title" size="10" align="center">한 국 생 산 기 술 연 구 원 장 귀 하</font>		
			<br></br>
			<br></br>
			</form>
			<iframe name="ifr" height="0" width="0"></iframe>
		</BODY>			
	</xsl:template>
</xsl:stylesheet>