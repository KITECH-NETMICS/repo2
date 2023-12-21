<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
			<BODY>
			<form name="frmXsl" target="blank" action="https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
				<INPUT type="hidden" name="FilePath" size="25" />
				<INPUT type="hidden" name="orgFileName" size="25" />
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">신청자정보</td>
					</tr>
				    <tr>
					     <td class="body">
						     <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">																		
																			
								<tr>
									<td width="6%" class="title2">개인번호</td>
									<td width="10%" class="contant">
										<xsl:value-of
										select="request/crudInfo/req_empno" />
									</td>
									<td width="6%" class="title2">신청자</td>
									<td width="10%" class="contant">										
										<xsl:value-of
											select="request/crudInfo/req_psn" />
									</td>
									<td width="6%" class="title2">소속</td>
									<td width="10%" class="contant">
										 <xsl:value-of
											select="request/crudInfo/dept_nm" />
									</td>
									<td width="6%" class="title2">직급</td>
									<td width="10%" class="contant">
										 <xsl:value-of
											select="request/crudInfo/posi_nm" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" class="aproutertable">							
					<tr>
					     <td class="body">
					     	<table width="100%" class="aprinnertable">											
								<tr>
									<td class="title2">신청구분</td>
									<td width="85%" class="contant">							
										<xsl:if test="contains(request/crudInfo/req_clsf, 'LRA001')">
											제정
										</xsl:if>							
										<xsl:if test="contains(request/crudInfo/req_clsf, 'LRA002')">
											개정
										</xsl:if>							
									</td>
								</tr>
								<tr>
									<td class="title2">규정명</td>
									<td class="contant">
										<xsl:value-of
											select="request/crudInfo/reglt_nm" />
									</td>						
								</tr>
								<tr>
									<td class="title2">의결주문</td>
									<td class="contant">
										<xsl:value-of
											select="request/crudInfo/decsn_order" />
									</td>
								</tr>
								<tr>
									<td class="title2">의결사유</td>
									<td class="contant">
										<xsl:value-of
											select="translate(request/crudInfo/apr_decsn_resn, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />												
									</td>
								</tr>
								<tr>
									<td class="title2">주요내용</td>
									<td class="contant">							
										<xsl:value-of
											select="translate(request/crudInfo/apr_major_contnt, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />									
									</td>
								</tr>
								<tr>
									<td class="title2">조문대조</td>
									<td class="contant">
										<table class="aproutertable" width="100%">
											<tr>
												<td class="body">						
													<table width="100%" class="aprinnertable">
														<tr>
															<td width="50%" class="title">현행</td>
														    <td width="50%" class="title">개정(안)</td>
														</tr>
														<xsl:for-each select="request/crudInfo/aprAmend/vector/data">
														<xsl:variable name="currimpl" select="msgLrgRegLtAmendProvsnMS01/currimpl" />
													    <xsl:variable name="revsn" select="msgLrgRegLtAmendProvsnMS01/revsn" />
														<tr>
															<td width="50%" class="contant">
															 	<xsl:value-of select="$currimpl"/>
														    </td>
														    <td width="50%" class="contant">
															 	<xsl:value-of select="$revsn"/>
														    </td>
														</tr>
														</xsl:for-each>
													</table>
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>							
			<table width="100%" class="aproutertable">						
				<tr>
				     <td class="body">
				     	<table width="100%" class="aprinnertable">														
							<tr>
								<td class="title2">첨부파일</td>
								<td class="contant" width="85%">
									<xsl:for-each select="request/crudInfo/fileList_A/vector/data/mdata">
									<a>
										<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA014')</xsl:attribute>
										<xsl:value-of select="file_nm"/>
										<br/>
									</a>
									</xsl:for-each>
								</td>
							</tr>
						</table>
					</td>
				</tr>										
			</table>						
		</form>
		<iframe name="ifr" height="0" width="0"></iframe>
	</BODY>			
	</xsl:template>
</xsl:stylesheet>