<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<body>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td>
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									  <tr>
							        		<td class='title2' width="12%">부서</td>
							        		<td class="contant" width="15%"><xsl:value-of select="root/dept_nm" /></td>
							        		<td class='title2' width="12%">직급</td>
							        		<td class="contant" width="15%"><xsl:value-of select="root/posi_nm" /></td>    		
							          </tr>
							          <tr>
							        		<td class='title2' width="12%">성명</td>
							        		<td class="contant" width="15%"><xsl:value-of select="root/nm" /></td>
							        		<td class='title2' width="12%">개인번호</td>
							        		<td class="contant" width="15%"><xsl:value-of select="root/empno" /></td>      		
							          </tr>   
							          <tr>
							        		<td class='title2' width="12%">발급종류</td>
							        		<td class="contant" width="15%"><xsl:value-of select="root/issu_knd" /></td>
							        		<td class='title2' width="12%">발급부수</td>
							        		<td class="contant" width="15%"><xsl:value-of select="root/issu_qty" /></td>        		
							          </tr>   
							           <tr>
							        		<td class='title2' width="12%">발급용도</td>
							        		<td class="contant" colspan = "3"><xsl:value-of select="root/issu_usg" /></td>        	   		
							          </tr>
							  </table>
						  </td>
					  </tr>
				  </table>				 
			</body>		
	</xsl:template>
</xsl:stylesheet>