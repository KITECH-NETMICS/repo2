<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="1" />
			<body>
				<table width="100%" border="0" cellpadding="0"
					cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0"
								cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td width="12%" class='title2'>부서</td>
									<td class="contant"><xsl:value-of select="SAVE/sh_dept_nm" /></td>
									<td width="12%" class='title2'>직급</td>
									<td class="contant"><xsl:value-of select="SAVE/sh_posi_nm" /></td>
								</tr>
								<tr>
									<td class='title2'>성명</td>
									<td class="contant"><xsl:value-of select="SAVE/sh_nm" /></td>
									<td class='title2'>개인번호</td>
									<td class="contant"><xsl:value-of select="SAVE/sh_empno" /></td>
								</tr>
								<tr>
									<td class='title2'>이동부서</td>
									<td class="contant"><xsl:value-of select="SAVE/sh_hope_dept_nm" /></td>
									<td class='title2'>희망일</td>
									<td class="contant"><xsl:value-of select="SAVE/sh_hope_ymd" /></td>
								</tr>
								<tr>
									<td class='title2'>이동사유</td>
									<td colspan="3" class="contant">
										<pre>
											<xsl:value-of select="SAVE/sh_resn" />
										</pre>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</body>
	</xsl:template>
</xsl:stylesheet>