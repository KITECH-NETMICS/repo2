<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
 	 <xsl:variable name="localPath" select="request/localPath/@value"/>
		<html lang="kr">
			<BODY onload="slFileDownload()">	
			
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">입찰개요</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="20%">입찰공고번호</td>
							  		<td class="contant" style="width: 218.47px;"><xsl:value-of select="selectTecMas/msgEpuTecEvalMas/bid_noti_no" /></td>
							  		<td class='title2' width="20%">발주계획번호</td>
							  		<td class="contant"><xsl:value-of select="selectTecMas/msgEpuTecEvalMas/bid_ord_no" /></td>
								</tr>
								<tr>
									<td class='title2' width="20%">공고명</td>
									<td class="contant" style="width: 218.47px;"><xsl:value-of select="selectTecMas/msgEpuTecEvalMas/bid_title" /></td>
							  		<td class='title2' width="20%">심사구분</td>
							  		<td class="contant"><xsl:value-of select="selectTecMas/msgEpuTecEvalMas/eval_clsf_cd" /></td>
								</tr>
								<tr>
									<td class='title2' width="20%">협조 담당자</td>
							  		<td class="contant" colspan="3" ><xsl:value-of select="selectTecMas/msgEpuTecEvalMas/assist_charger_nm" /></td>
								</tr>
							</table>
						</td>							
					</tr>
                </table>
                <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">적격심사평가정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title' width="20%">사업자등록번호</td>
							  		<td class='title' width="20%">상호명</td>
							  		<td class='title' width="20%">대표자명</td>
							  		<td class='title' width="20%">평가점수</td>
							  		<td class='title' width="20%">적합여부</td>
								</tr>
								<xsl:for-each select="selectTecMas/selectTec/vector/data">	
								<tr>
									<td class="contant-center" width="20%"><xsl:value-of select="msgEpuTecEval/bsns_psn_regst_no" /></td>
									<td class="contant" width="20%"><xsl:value-of select="msgEpuTecEval/vend_nm" /></td>
									<td class="contant" width="20%"><xsl:value-of select="msgEpuTecEval/ceo_nm" /></td>
									<td class="contant-center" width="20%"><xsl:value-of select="msgEpuTecEval/tot_score" /></td>
									<td class="contant-center" width="20%">
									<xsl:if test="msgEpuTecEval/succ_yn = 'Y'">적합</xsl:if>
							  		<xsl:if test="msgEpuTecEval/succ_yn = 'N'">부적합</xsl:if>
									</td>
								</tr>
								</xsl:for-each>
							</table>
						</td>							
					</tr>
				</table>
				<xsl:if test="count(selectTecMas/fileList_A/vector/data/mdata)!=0">
                <TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
						<TR>
							<TD class="head" align="left">첨부파일</TD>
						</TR>
						<TR>
							<TD class="body">
								<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<xsl:for-each select="selectTecMas/fileList_A/vector/data/mdata">
									<TR>
										<TD class="contant">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA015')</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</TD>							            
									</TR>
									</xsl:for-each>
								</TABLE>
							</TD>
						</TR>
				</TABLE>
				</xsl:if>
				<xsl:if test="count(selectTecMas/fileList_B/vector/data/mdata)!=0">
                <TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
						<TR>
							<TD class="head" align="left">구매부서 요청 첨부파일</TD>
						</TR>
						<TR>
							<TD class="body">
								<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<xsl:for-each select="selectTecMas/fileList_B/vector/data/mdata">
									<TR>
										<TD class="contant">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA015')</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</TD>							            
									</TR>
									</xsl:for-each>
								</TABLE>
							</TD>
						</TR>
				</TABLE>
				</xsl:if>
			</BODY>
		</html>
	</xsl:template>
</xsl:stylesheet>