<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
			<BODY>
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
			    <tr>
				     <td class="body">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
							<tr>
								<td class="title2">신청번호</td>
								<td colspan="5" class="contant">
									<xsl:value-of
									select="request/updateInfo/req_no" />
								</td>						
							</tr>
							<tr>
								<td class="title2">신청자부서</td>
								<td width="20%" class="contant">							
									<xsl:value-of
									select="request/updateInfo/req_psn_dept_nm" />							
								</td>
								<td class="title2">신청자</td>
								<td width="20%" class="contant">								
									<xsl:value-of
										select="request/updateInfo/req_psn_nm" />								
								</td>
								<td class="title2">개인번호</td>
								<td width="20%" class="contant">
									 <xsl:value-of
										select="request/updateInfo/req_psn_empno" />							
								</td>
							</tr>
							<tr>
								<td class="title2">소속</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/issu_psn_blong" />
								</td>
								<td class="title2">한글</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/issu_psn_krchar_nm" />
								</td>
								<td class="title2">영문</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/issu_psn_eng_nm" />
								</td>						
							</tr>
							<tr>
								<td class="title2">구분</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/issu_psn_clsf" />
								</td>
								<td class="title2">주민등록번호</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/resid_no" />
								</td>
								<td class="title2">핸드폰번호</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/issu_psn_mobile_no" />
								</td>
							</tr>					
							<tr>
								<td class="title2">입원일자</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_hotd_ymd" />
								</td>
								<td class="title2">퇴소일자</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_retire_ymd" />
								</td>
								<td class="title2">입금일자</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_depst_ymd" />
								</td>
							</tr>
							<tr>
								<td class="title2">구분</td>
								<td class="contant">
									<xsl:if test="contains(request/updateInfo/req_clsf, 'CSL001')">
										신규
									</xsl:if>						
									<xsl:if test="contains(request/updateInfo/req_clsf, 'CSL002')">
										불량
									</xsl:if>						
									<xsl:if test="contains(request/updateInfo/req_clsf, 'CSL003')">
										재발급
									</xsl:if>							
								</td>
								<td class="title2">활용책임자</td>
								<td colspan="3" class="contant">												
									<xsl:value-of
										select="request/updateInfo/apr_pruse_psn_nm" />								
									<xsl:value-of
										select="request/updateInfo/apr_pruse_psn_empno" />								
								</td>						
							</tr>
							<tr>
								<td class="title2">재발급요청사유</td>
								<td colspan='5' class="contant">
								 	   <xsl:value-of
												select="translate(request/updateInfo/apr_reissu_req_resn, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />							
								</td>
							</tr>		
							<tr>
								<td class="title2">첨부파일</td>
								<td colspan='5' class="contant">
									<xsl:for-each select="request/updateInfo/fileList_A/vector/data/msgXomxComAttachFileMS01">
									<a>
										<xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="full_path" />')</xsl:attribute>
										<xsl:value-of select="org_file" /><br/>
									</a>
									</xsl:for-each>
								</td>
							</tr>					
						</table>						
					</td>
				</tr>
			</table>
			<tr>
				<td height="10px">
				</td>
			</tr>
			<table class="aproutertable" width="100%">
				<tr>
			      <td class="body">
			        <table class="aprinnertable" width="100%">
			          <tr>
						<td class="contant">
						※발급대상분류 : 출입증[임시사용자, 외부업체, 기타]<br/>
						퇴소시 반드시 총무인사실 또는 각 사업지원실로 반납하여 주시기 바랍니다.<br/>
						</td>
					  </tr>
			        </table>
			      </td>
			    </tr>
		  	</table>
			</BODY>			
	</xsl:template>
</xsl:stylesheet>