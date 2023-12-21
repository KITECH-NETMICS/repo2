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
									select="root/req_no" />
								</td>				 				
							</tr>
							<tr>
								<td class="title2">신청자</td>
								<td class="contant">
									<xsl:value-of
										select="root/apr_nm" />
									<xsl:value-of
										select="root/apr_emp_no" />
								</td>
								<td class="title2">신청부서</td>
								<td class="contant">
									<xsl:value-of
										select="root/apr_dept_nm" />
								</td>
								<td class="title2">직급</td>
								<td class="contant">
									<xsl:value-of
										select="root/apr_posi" />
								</td>
							</tr>
							<tr>
								<td class="title2">인장명</td>
								<td colspan="5" class="contant">
									<xsl:if test="contains(root/seal_clsf, 'CGA001')">
										직인
									</xsl:if>							
									<xsl:if test="contains(root/seal_clsf, 'CGA002')">
										인감
									</xsl:if>							
								</td>						
							</tr>			
							<tr>
								<td rowspan="2" class="title2">인장서명</td>
								<td class="title2">각인문자</td>
								<td colspan="4" width="50%" class="contant">
									<xsl:value-of
										select="root/stamp_char" />
								</td>						
							</tr>
							<tr>
								<td class="title2">각인규격</td>
								<td colspan="2" class="contant" width="20%">
									<xsl:value-of
										select="root/stamp_std" />
								</td>
								<td class="title2">크기</td>
								<td class="contant" width="20%">
									<xsl:value-of
										select="root/size" />
								</td>
							</tr>
							<tr>
								<td class="title2">관리책임자</td>
								<td class="title2">부서</td>
								<td colspan="2" class="contant" width="20%">
									<xsl:value-of
										select="root/apr_mngmt_respn_psn_dept_nm" />
								</td>
								<td class="title2">이름</td>
								<td class="contant" width="20%">
									<xsl:value-of
										select="root/mngmt_respn_psn_nm" />
								</td>
							</tr>
							<tr>
								<td class="title2">사용부서</td>
								<td colspan="5" class="contant">
									<xsl:value-of
										select="root/use_dept_nm" />
								</td>
							</tr>
							<tr>
								<td class="title2">용도</td>
								<td colspan="5" class="contant">
									<xsl:value-of
										select="root/use_usg" />							
								</td>
							</tr>
							<tr>
								<td class="title2">각인의뢰이유</td>
								<td width="30%" class="contant">
									<xsl:value-of
										select="root/stamp_req_resn" />
								</td>
								<td class="title2">사용기간</td>
								<td width="35%" colspan="3" class="contant">
									<xsl:value-of
										select="root/apr_use_orign_ymd" />~
									<xsl:value-of
										select="root/apr_use_cls_ymd" />
								</td>
							</tr>	
							<tr>
								<td class="title2">인장재료</td>
								<td class="contant">
									<xsl:value-of
										select="root/seal_matrl" />
								</td>
								<td class="title2">특기사항</td>
								<td colspan="3" class="contant">
									<xsl:value-of
										select="root/spclab_item" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			</BODY>			
	</xsl:template>
</xsl:stylesheet>