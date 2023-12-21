<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
 	 <xsl:variable name="localPath" select="1"/>
			<BODY>

			<form name="frmXsl" target="blank" action="http://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
				<INPUT type="hidden" name="FilePath" size="25" />
				<INPUT type="hidden" name="orgFileName" size="25" />
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
			    <tr>
		     		<td class="body">
						<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
							<tr>
								<td width="20%" class="title2">신청번호</td>
								<td width="30%" class="contant">
									<xsl:value-of
									select="request/crudInfo/req_no" />
								</td>
							</tr>
							<tr>
								<td width="20%" class="title2">출입지역</td>
								<td width="30%" class="contant">
									<xsl:value-of
										select="request/crudInfo/apr_centr_nm" />
								</td>
							</tr>
							<tr>
								<td width="20%" class="title2">출입건물</td>
								<td class="contant">
									<xsl:value-of
									select="request/crudInfo/build_smal_clsf_nm" />동
									<xsl:value-of
									select="request/crudInfo/roomno" />호
								</td>
							</tr>
							<tr>
								<td width = "20%" class="title2">신청자</td>
								<td class="contant">
									<xsl:value-of
										select="request/crudInfo/apr_psn_nm" />	
									<xsl:value-of
										select="request/crudInfo/apr_emp_no" />
									(전화번호 :	
									<xsl:value-of
										select="request/crudInfo/labwk_psn_tel" />)	
										
								</td>
							</tr>
							<tr>
								<td width = "20%"  class="title2">출입일시</td>
								<td class="contant">
									<xsl:value-of
										select="request/crudInfo/apr_str_ymd" /> ~ 
									<xsl:value-of
									select="request/crudInfo/apr_cls_ymd" /> 
								</td>
							</tr>
							<tr>
							<td class="title2">출입사유</td>
							<td class="contant" width="80%">
								<xsl:value-of
									select="translate(request/crudInfo/apr_work_resn, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />
							</td>
							</tr>
							<tr>
								<td class="title2">출입세부내용</td>
								<td class="contant">
									<xsl:value-of
										select="translate(request/crudInfo/apr_work_contnt, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />
								</td>
							</tr>
						</table>
					</td>
				</tr>	
			</table>
			<table width="100%" class="aproutertable">
				<tr>
					<td class="head">외부인 동반자</td>
				</tr>
				<tr>
			     <td class="body">
			     	<table width="100%" class="aprinnertable">
						<tr>
							<td class="title">성명</td>
							<td class="title">소속</td>
							<td class="title">직위</td>
							
							<td class="title">연락처</td>
							<td class="title">사유</td>
							
						</tr>
						<xsl:for-each select="request/crudInfo/save/vector/data">
						<xsl:variable name="nm" select="msgCsfLabwkOutCompnMS01/nm" />
						<xsl:variable name="resid" select="msgCsfLabwkOutCompnMS01/resid" />
						<xsl:variable name="contac_loc" select="msgCsfLabwkOutCompnMS01/contac_loc" />
						<xsl:variable name="resn" select="msgCsfLabwkOutCompnMS01/resn" />
					   	<xsl:variable name="vendnm" select="msgCsfLabwkOutCompnMS01/vend_nm" />
					   	<xsl:variable name="posinm" select="msgCsfLabwkOutCompnMS01/posi_nm" />
					   	
						
						<tr>
							<td width="5%" class="contant-center">
							 	<xsl:value-of select="$nm"/>
						    </td>
						    
						    <td width="15%" class="contant-center">							 	
							 	<xsl:value-of select="$vendnm"/>
						    </td>
						    <td width="15%" class="contant-center">							 	
							 	<xsl:value-of select="$posinm"/>
						    </td>
						    <td width="15%" class="contant-center">
							 	<xsl:value-of select="$contac_loc"/>
						    </td>
						    <td width="15%" class="contant">
							 	<xsl:value-of select="$resn"/>
						    </td>
						  							    								
						</tr>
						</xsl:for-each>
					</table>
				</td>
			</tr>
		</table>
		</form>
	<iframe name="ifr" height="0" width="0"></iframe>
	</BODY>			
	</xsl:template>
</xsl:stylesheet>