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
		<td class="body">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
			<tr>
				<td width="10%" class='title2'>신청번호</td>
				<td colspan="2" class="contant-center"><xsl:value-of select="APPROVAL/req_no"/><br/></td>
				<td width="10%" class='title2'>신청구분</td>
				<td colspan="3" class="contant">
					<xsl:value-of select="APPROVAL/req_clsf"/><br/>
				</td>
	
			</tr>
			<tr>
				<td class='title2'>신청자</td>
				<td width="8%" class="contant-center"><xsl:value-of select="APPROVAL/req_empno"/><br/></td>
				<td width="15%" class="contant-center"><xsl:value-of select="APPROVAL/req_emp_nm"/><br/></td>
				<td class='title2'>신청부서</td>
				<td class="contant" colspan="3"><xsl:value-of select="APPROVAL/req_dept_nm"/><br/></td>
	
			</tr>
			<tr>
				<td class='title2'>신청일자</td>
				<td colspan="2" class="contant-center"><xsl:value-of select="substring(APPROVAL/req_ymd,0,5)"/>-<xsl:value-of select="substring(APPROVAL/req_ymd,5,2)"/>-<xsl:value-of select="substring(APPROVAL/req_ymd,7,2)"/><br/></td>
				<td class='title2'>지급일자</td>
				<td width="15%" class="contant-center"><xsl:value-of select="substring(APPROVAL/pay_demnd_ymd, 0, 5)"/>-<xsl:value-of select="substring(APPROVAL/pay_demnd_ymd, 5, 2)"/>-<xsl:value-of select="substring(APPROVAL/pay_demnd_ymd, 7, 2)"/><br/></td>
				<td width="10%" class='title2'>정산예정일자</td>
				<td width="15%" class="contant-center"><xsl:value-of select="substring(APPROVAL/adjst_schdl_ymd, 0, 5)"/>-<xsl:value-of select="substring(APPROVAL/adjst_schdl_ymd, 5, 2)"/>-<xsl:value-of select="substring(APPROVAL/adjst_schdl_ymd, 7, 2)"/><br/></td>
			</tr>
			<tr>
				<td class='title2'>계정번호</td>
				<td class="contant-center"><xsl:value-of select="APPROVAL/accnt_no"/> </td>
				<td class="contant"><xsl:value-of select="APPROVAL/accnt_no_nm"/><br/></td>
				<td class='title2'>정산계정번호</td>
				<td class="contant" colspan="3">
					<xsl:value-of select="APPROVAL/adjst_accnt_no"/>&nbsp;&nbsp;(<xsl:value-of select="APPROVAL/expns_cd"/>)
				<br/></td>
			</tr>
			<tr>
				<td class='title2'>회계코드</td>
				<td class="contant-center"><xsl:value-of select="APPROVAL/accnt_cd"/> </td>
				<td class="contant"> <xsl:value-of select="APPROVAL/accnt_cd_abbr"/><br/></td>
				<td class='title2'>지급구분</td>
				<td class="contant-center" colspan="3">
					<xsl:value-of select="APPROVAL/pay_clsf"/><br/>
				</td>
			</tr>
			<tr>
				<td class='title2'>신청금액</td>
				<td class="contant-right" colspan="2">
					<xsl:attribute name='id'>
						<xsl:text>reqAmt1</xsl:text>
					</xsl:attribute>
					<xsl:value-of select="format-number(APPROVAL/req_amt, '#,###')"/><br/>
				</td>
				<td class='title2'><br/></td>
				<td class="contant-center" colspan="3"><br/></td>
			</tr>
			<tr>
				<td class='title2'>사유</td>
				<td class="contant" colspan="6"><xsl:value-of select="APPROVAL/req_cause"/><br/></td>
	
			</tr>
			<tr>
				<td class='title2'>비고(적요)</td>
				<td class="contant" colspan="6"><xsl:value-of select="APPROVAL/rmk"/><br/></td>
			</tr>
		</table>
		</td>
	    </tr>
	</table>
	
		<p/>
	<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
	    <tr>
		<td class="body">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
			<tr>
				<td width="10%" class='title2'>개인번호</td>
				<td width="40%" class="contant-center">
					<xsl:value-of select="APPROVAL/vend_cd_nm"/>  
					(<xsl:value-of select="APPROVAL/vend_cd"/>)<br/>
				</td>
				<td width="10%" class='title2'>입금계좌</td>
				<td width="40%" class="contant"><xsl:value-of select="APPROVAL/bankaccnt_no"/><br/></td>
			</tr>
			<tr>
				<td class='title2'>은행</td>
				<td class="contant-center">
					<xsl:value-of select="APPROVAL/bank"/><br/>
				</td>
				<td class='title2'>예금주</td>
				<td class="contant"><xsl:value-of select="APPROVAL/depstr_nm"/><br/></td>
			</tr>
		</table>
		</td>
	    </tr>
	</table>
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