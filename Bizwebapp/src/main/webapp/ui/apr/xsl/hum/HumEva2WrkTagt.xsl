<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="APPROVAL">
		<xsl:variable name="localPath" select="1" />
			<body>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' colspan="4">1. 기본인사정보</td>
								</tr>
								<tr>
									<td width="20%" class='title2'>성 명</td>
									<td class="contant">
										<xsl:value-of select="sh_nm" /> 
									</td>
									<td width="14%" class='title2'>신청번호</td>
									<td class="contant">
										<xsl:value-of select="sh_req_no" /> 
									</td>
								</tr>
								<tr>
									<td width="20%" class='title2'>부 서</td>
									<td class="contant">
										<xsl:value-of select="sh_dept_nm" />
									</td>
									<td width="14%" class='title2'>직 급</td>
									<td class="contant">
										<xsl:value-of select="sh_posi_nm" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<br />
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title' colspan="4">
										Ⅰ. 담당업무
									</td>
								</tr>
								<tr>
									<td class='title'>순번</td>
									<td class='title'>업무명</td>									
									<td class='title'>비중(%)</td>
								</tr>
								<xsl:for-each select="doc1/vector/data/msgHumEva2WrkTgCInfoSS01">
									<tr>
										<td class='contant'>
											<xsl:number count="doc1/vector/data" level="single" format="1-100" />
										</td>
										<td class='contant'>
											<xsl:value-of select="charg_subj" />
										</td>										
										<td class='contant'>
											<xsl:value-of select="grvt_pct" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<br />
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title' colspan="4">
										Ⅱ. 주요업무계획
									</td>
								</tr>
								<tr>
									<td class='title'>순번</td>
									<td class='title'>목표명</td>
									<td class='title'>주요업무계획</td>
									<td class='title'>비중(%)</td>
								</tr>
								<xsl:for-each select="doc2/vector/data/msgHumEva2WrkTgSInfoSS01">
									<tr>
										<td class='contant'>
											<xsl:number count="doc2/vector/data" level="single" format="1-100" />
										</td>
										<td class='contant'>
											<xsl:value-of select="wrk_tg_subj" />
										</td>
										<td class='contant' style='white-space:pre-line;'>
											<xsl:value-of select="wrk_tg_contnt" />
										</td>
										<td class='contant'>
											<xsl:value-of select="grvt_pct" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
			</body>
	</xsl:template>
</xsl:stylesheet>