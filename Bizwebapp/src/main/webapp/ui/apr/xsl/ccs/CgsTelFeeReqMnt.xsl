<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	
	<xsl:template match="/"> 
			<BODY>
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
				<tr>
					<td class="head">신청자정보</td>
				</tr>
			    <tr>
			        <td class="body">
						<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">							
							<tr>
								<td class="title2">신청번호</td>
								<td width="20%" class="contant">
									<xsl:value-of
									select="response/reqDetlsList/vector/data/msgCgsTelFeeDetlsMS05/req_no" />
								</td>
								<td class="title2">신청자</td>
								<td width="20%" class="contant">
									<xsl:value-of
										select="response/reqDetlsList/vector/data/msgCgsTelFeeDetlsMS05/req_psn_nm" />
								</td>
								<td class="title2">신청자부서</td>
								<td width="20%" class="contant">
									 <xsl:value-of
										select="response/reqDetlsList/vector/data/msgCgsTelFeeDetlsMS05/req_dept_nm" />
								</td>											
							</tr>
						</table>
					</td>
				</tr>
				</table>
			    <table class="aproutertable" width="100%">								
				<tr>								
	 		       <td class="body">
			         <table class="aprinnertable" width="100%">
						<tr>
							<td width="8%" class="title">처리월</td>
							<td width="14%" class="title">본부</td>
							<td width="13%" class="title">부서</td>
						    <td width="10%" class="title">계정번호</td>
						    <td width="10%" class="title">계정책임자</td>
						    <td width="12%" class="title">총금액</td>
						    <td width="10%" class="title">예산통제번호</td>
						    <td width="10%" class="title">예산통제자</td>
						    <td width="20%" class="title">적요</td>
						</tr>
						<xsl:for-each select="response/reqDetlsList/vector/data/msgCgsTelFeeDetlsMS05">
						<xsl:variable name="use_yrmon" select="use_yrmon" />
						<xsl:variable name="divsn" select="divsn" />
						<xsl:variable name="dept" select="dept" />
						<xsl:variable name="accnt_no" select="accnt_no" />
						<xsl:variable name="accnt_rspns_nm" select="accnt_rspns_nm" />
						<xsl:variable name="amt" select="amt" />
						<xsl:variable name="bugt_ctrl_no" select="bugt_ctrl_no" />
						<xsl:variable name="bugt_ctrl_psn_nm" select="bugt_ctrl_psn_nm" />
						<xsl:variable name="rmk" select="rmk" />								
						<xsl:variable name="req_seq" select="req_seq" />								
						<tr>
							<td class='contant-center' width="8%">
							 	<xsl:value-of select="substring($use_yrmon,1,4)"/>-<xsl:value-of select="substring($use_yrmon,5,6)"/>
						    </td>
						    <td class='contant' width="14%">
							 	<xsl:value-of select="$divsn"/>
						    </td>
						    <td class='contant' width="13%">
							 	<xsl:value-of select="$dept"/>
						    </td>
						    <td class='contant-center' width="10%">
							 	<xsl:value-of select="$accnt_no"/>
						    </td>
						    <td class='contant-center' width="10%">
							 	<xsl:value-of select="$accnt_rspns_nm"/>
						    </td>
						    <td id="req_amt" class='contant-right' width="12%">
						    	<xsl:attribute name="id">
									<xsl:text>reqAmt1</xsl:text>
									<xsl:value-of select="$req_seq"/>
								</xsl:attribute>
							 	<xsl:value-of select="format-number($amt,'#,###,###,###,###,###')"/>
						    </td>
						    <td id="ctrl_no" class='contant-center' width="10%">
						    	<xsl:attribute name="id">
									<xsl:text>ctrlNo1</xsl:text>
									<xsl:value-of select="$req_seq"/>
								</xsl:attribute>
							 	<xsl:value-of select="$bugt_ctrl_no"/>
						    </td>
						    <td class='contant-center' width="10%">
							 	<xsl:value-of select="$bugt_ctrl_psn_nm"/>
						    </td>	
					        <td class='contant' width="20%">
							 	<xsl:value-of select="$rmk"/>
						    </td>
						</tr>
						</xsl:for-each>
						<!-- tr>
							<td width="55%" class="title" colspan="5">합계</td>
							<td width="12%" class="title" >금액</td>
							<td width="40%" class="title" colspan="3"></td>
						</tr-->
					</table>
			 	</td>
			</tr>	
			</table>
			<table class="aproutertable" width="100%">															
			<tr>
				<td class="head">요금상세현황</td>
			</tr>
			<tr>
				<td class="body">
					<table class="aprinnertable" width="100%">
						<tr>
							<td width="20%" class="title">전화번호</td>
							<td width="10%" class="title">사용자</td>
							<td width="13%" class="title">사용요금</td>
						    <td width="13%" class="title">계정번호</td>
						    <td width="13%" class="title">계정책임자</td>
						    <td width="41%" class="title">비고</td>
						</tr>
						<xsl:for-each select="response/btmDetlsList/vector/data/msgCgsTelFeeDetlsMS07">
						<xsl:variable name="tel_no" select="tel_no" />
						<xsl:variable name="user_nm" select="user_nm" />
						<xsl:variable name="tel_fee" select="tel_fee" />
						<xsl:variable name="accnt_no" select="accnt_no" />
						<xsl:variable name="accnt_rspns_nm" select="accnt_rspns_nm" />
						<xsl:variable name="rmk" select="rmk" />
						<tr>
							<td width="20%" class='contant-center'>
							 	<xsl:value-of select="$tel_no"/>
						    </td>
						    <td width="10%" class='contant-center'>
							 	<xsl:value-of select="$user_nm"/>
						    </td>
						    <td width="13%" class='contant-right'>
							 	<xsl:value-of select="format-number($tel_fee,'#,###,###,###,###,###')"/>
						    </td>
						    <td width="13%" class='contant-center'>
							 	<xsl:value-of select="$accnt_no"/>
						    </td>
						    <td width="13%" class='contant-center'>
							 	<xsl:value-of select="$accnt_rspns_nm"/>
						    </td>
						    <td width="41%" class='contant'>
							 	<xsl:value-of select="$rmk"/>
						    </td>
						</tr>
						<!-- tr>
							<td width="30%" class="title" colspan="2">합 계</td>
							<td width="13%" class="title">금액</td>
							<td width="67%" class="title" colspan="3"></td>
						</tr-->
						</xsl:for-each>
					</table>
			 	</td>
			</tr>
		</table>
		</BODY>
	</xsl:template>
</xsl:stylesheet>