<?xml version="1.0"?>
<!DOCTYPE xsl:stylesheet [ <!ENTITY nbsp "&#160;"> ]>
<xsl:stylesheet xmlns:LINS="snapshot.css"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
xmlns:fo="http://www.w3.org/1999/XSL/Format"
>
<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
<xsl:template match="/">
<xsl:variable name="localPath" select="request/localPath"/>
	 <body>
	 <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
	    <tr>
		<td class="body" >
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">	
		    <tr>
				<td width="20%" class='title2'>신청번호</td>
				<td class="contant" colspan="3"><xsl:value-of select="APPROVAL/req_no"/><br/></td>				
			</tr>		
			<tr>
				<td width="20%" class='title2'>성명</td>
				<td class="contant" colspan="3"><xsl:value-of select="APPROVAL/req_emp_nm"/><br/></td>				
			</tr>
			<tr>
				<td width="20%" class='title2'>영문성명</td>
				<td class="contant" colspan="2"><xsl:value-of select="APPROVAL/eng_nm"/></td>
				<td class="contant" width="30%">*여권상 영문명기재</td>				
			</tr>
			<tr>
				<td class='title2'>소속(직위)</td>
				<td class="contant" colspan="3"><xsl:value-of select="APPROVAL/req_dept_nm"/>(<xsl:value-of select="APPROVAL/posi_nm"/> )<br/></td>				
			</tr>
			<tr>
				<td class='title2'>주민등록번호</td>
				<td class="contant" ><xsl:value-of select="APPROVAL/resid_no"/> </td>	
				<td class='title2' width="20%">개인번호</td>
				<td class="contant" width="30%"><xsl:value-of select="APPROVAL/syspayno"/> </td>			
			</tr>
			<tr>	
				<td class='title2'>모바일</td>
				<td class="contant" ><xsl:value-of select="APPROVAL/mobile_no"/> </td>	
				<td class='title2' width="20%">연락처</td>	
				<td class="contant" width="30%"><xsl:value-of select="APPROVAL/ext_no" /><br/></td>		
			</tr>
			<tr>
				<td class='title2'>계정번호</td>
				<td class="contant"><xsl:value-of select="APPROVAL/accnt_no" /><br/></td>
				<td class='title2'>기존카드번호</td>
				<td class="contant" ><xsl:value-of select="APPROVAL/card_no" /><br/></td>			
			</tr>
			<tr>
				<td class='title2'>카드수령지</td>
				<td class="contant" colspan="3"><xsl:value-of select="APPROVAL/addr"/><br/></td>				
			</tr>
			<tr>
			 	<td class='title2' width="20%">카드발급구분</td>	
				<td class="contant" width="30%"><xsl:value-of select="APPROVAL/issu_clsf" /><br/></td>
				<td class='title2' width="20%">카드발급의뢰사유</td>
				<td class="contant" width="30%"><xsl:value-of select="APPROVAL/issu_cause" /><br/></td>				
			</tr>
			<tr>
				<td class='title2'>비고</td>
				<td class="contant" colspan="3" ><xsl:value-of select="APPROVAL/rmk" /><br/></td>
								
			</tr>
		</table>
		</td>
	    </tr>	    
	</table>	
	<p/>
	
	<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
        <tr>
            <td class="head"> 첨부파일</td>
        </tr>
        <tr>
            <td class="body">
                <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
                    <xsl:for-each select="APPROVAL/FILE_LIST/vector/data/msgXomxComAttachFileMS01">
                    <tr>
                            <td class='title2' width="16%">첨부파일(<xsl:value-of select="seq"/>)</td>
                            <td class='contant' width="84%">
                            <a><xsl:attribute name="href">javascript:xslFileDownload("<xsl:value-of select="attach_full_path" />/<xsl:value-of select="org_file"/>")</xsl:attribute>
                               <xsl:value-of select="file_nm"/>
                            </a>
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