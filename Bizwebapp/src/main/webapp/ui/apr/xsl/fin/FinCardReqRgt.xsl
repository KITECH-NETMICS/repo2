<?xml version="1.0"?>
<!DOCTYPE xsl:stylesheet [ <!ENTITY nbsp "&#160;"> ]>
<xsl:stylesheet xmlns:LINS="snapshot.css"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
xmlns:fo="http://www.w3.org/1999/XSL/Format"
>
<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
<xsl:template match="/">
	 <body>
	 <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
	    <tr>
		<td class="body" >
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">	
		    <tr>
				<td width="20%" class='title2'>신청번호</td>
				<td class="contant" colspan="3"><xsl:value-of select="root/req_no"/><br/></td>				
			</tr>		
			<tr>
				<td width="20%" class='title2'>성명</td>
				<td class="contant" colspan="3"><xsl:value-of select="root/req_emp_nm"/><br/></td>				
			</tr>
			<tr>
				<td width="20%" class='title2'>영문성명</td>
				<td class="contant" colspan="2"><xsl:value-of select="root/eng_nm"/></td>
				<td class="contant" width="30%">*여권상 영문명기재</td>				
			</tr>
			<tr>
				<td class='title2'>소속(직위)</td>
				<td class="contant" colspan="3"><xsl:value-of select="root/req_dept_nm"/>(<xsl:value-of select="root/req_posi_nm"/> )<br/></td>				
			</tr>
			<tr>
				<td class='title2'>주민등록번호</td>
				<td class="contant" ><xsl:value-of select="root/resid_no"/> </td>	
				<td class='title2' width="20%">개인번호</td>
				<td class="contant" width="30%"><xsl:value-of select="root/empno"/> </td>			
			</tr>
			<tr>	
				<td class='title2'>모바일</td>
				<td class="contant" ><xsl:value-of select="root/mobile"/> </td>	
				<td class='title2' width="20%">연락처</td>	
				<td class="contant" width="30%"><xsl:value-of select="root/ext_no" /><br/></td>		
			</tr>
			<tr>
				<td class='title2'>계정번호</td>
				<td class="contant"><xsl:value-of select="root/accnt_no" /><br/></td>
				<td class='title2'>기존카드번호</td>
				<td class="contant" ><xsl:value-of select="root/card_no" /><br/></td>			
			</tr>
			<tr>
				<td class='title2'>카드수령지</td>
				<td class="contant" colspan="3"><xsl:value-of select="root/addr"/><br/></td>				
			</tr>
			<tr>
			 	<td class='title2' width="20%">카드발급구분</td>	
				<td class="contant" width="30%"><xsl:value-of select="root/issu_clsf_nm" /><br/></td>
				<td class='title2' width="20%">카드발급의뢰사유</td>
				<td class="contant" width="30%"><xsl:value-of select="root/issu_cause_nm" /><br/></td>				
			</tr>
			<tr>
				<td class='title2'>비고</td>
				<td class="contant" colspan="3" ><xsl:value-of select="root/rmk" /><br/></td>
								
			</tr>
			<tr>
			 	<td class='title2'>법인카드발급신청서약서</td>	
				<td class="contant" colspan="3"><xsl:choose>
					<xsl:when test="root/agrmt_yn = 'Y'">동의<br/></xsl:when>
					<xsl:otherwise><b style="color:red">미동의</b><br/></xsl:otherwise>
				</xsl:choose></td>
			</tr>
			<tr>
			 	<td class='title2'>법인 카드 사용 안내</td>	
				<td class="contant" colspan="3"><xsl:choose>
					<xsl:when test="root/card_use_yn = 'Y'">동의<br/></xsl:when>
					<xsl:otherwise><b style="color:red">미동의</b><br/></xsl:otherwise>
				</xsl:choose></td>		
			</tr>
			<tr>
			 	<td class='title2'>법인 카드 반납 안내</td>	
				<td class="contant" colspan="3"><xsl:choose>
					<xsl:when test="root/card_return_yn = 'Y'">동의<br/></xsl:when>
					<xsl:otherwise><b style="color:red">미동의</b><br/></xsl:otherwise>
				</xsl:choose></td>		
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
                    <xsl:for-each select="root/attachVo1">
                    <tr>
                            <td class='title2' width="16%">첨부파일(<xsl:value-of select="seq"/>)</td>
                            <td class='contant' width="84%">
	                            <a>
									<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA002')</xsl:attribute>
									<xsl:value-of select="file_nm" />
								</a>
								<xsl:if test="attach_file_no != ''">
									<a>
										<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of select="seq" />')</xsl:attribute>
										<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기" style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;"/>
									</a>
								</xsl:if>
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