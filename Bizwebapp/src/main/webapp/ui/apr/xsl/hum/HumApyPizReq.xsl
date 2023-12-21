﻿<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="SETXSL">
 	 <xsl:variable name="localPath" select="1"/>
			<body>  
				 <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">  
				  <tr>
					<td valign="top">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
						<tr> 
			        		<td class='title2'>부서</td>
			        		<td class="contant" width="20%"><xsl:value-of select="dept_nm" /></td>
			        		<td class='title2'>직급</td>
			        		<td class="contant"><xsl:value-of select="posi_nm" /></td>			        		
	          			</tr>
	         			<tr>
	         				<td class='title2'>성명</td>
			        		<td class="contant"><xsl:value-of select="nm" /></td>
			        		<td class='title2'>개인번호</td>
			        		<td class="contant"><xsl:value-of select="empno" /></td>
	        			</tr>
			        	<tr>
			        		<td class='title2'>원내외구분</td>
			        		<td class="contant"><xsl:value-of select="outsd_yn" /></td>
			        		<td class='title2'>포상일</td>
			        		<td class="contant"><xsl:value-of select="reward_ymd" /></td>
			        	</tr>
			        	<tr>
			        		<td class='title2'>포상종류</td>
			        		<td class="contant"><xsl:value-of select="reward_knd" /></td>
			        		<td class='title2'>상장번호</td>
			        		<td class="contant"><xsl:value-of select="reward_no" /></td>
			        	</tr>
			        	<tr>
			        		<td class='title2'>시행기관</td>
			        		<td class="contant" colspan="3"><xsl:value-of select="impl_agncy" /></td>			        		
			        	</tr>
			        	<tr>
			        		<td class='title2'>포상내용</td>
			        		<td class="contant" colspan="3"><xsl:value-of select="reward_contnt" /></td>			        		
			        	</tr>	
					  </table>
					 </td>
					 </tr>
					 </table>
			  </body>			
	</xsl:template>
</xsl:stylesheet>