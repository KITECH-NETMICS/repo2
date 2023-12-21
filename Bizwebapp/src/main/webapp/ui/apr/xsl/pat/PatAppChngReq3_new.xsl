<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:LINS="http://www.inswave.com/LINS">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<html lang="kr">
			<BODY>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body" colspan="2">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="15%">신청번호 </td>
									<td class="contant-center" width="30%">
										<xsl:value-of select="root/req_no" />
									</td>
									<td class='title2'/>
									<td class="contant"/>
								</tr>
								<tr>
									<td class='title2'>신청자 </td>
									<td class="contant">
										<xsl:value-of select="root/req_psn_nm" />
									</td>
									<td class='title2'>신청일자 </td>
									<td class="contant-center">
										<xsl:value-of select="substring(root/input_ymd, 1, 4)" />
										-
										<xsl:value-of select="substring(root/input_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(root/input_ymd, 7, 2)" />
									</td>
									<tr>
										<td class='title2'>변경사유</td>
										<td class="contant" colspan='3'>
											<xsl:value-of select="root/chng_cause" />
										</td>
									</tr>
									<td class='title2'>특허명</td>
									<td class="contant-center" colspan='3'><xsl:value-of select="root/invnt_krn_nm" /></td> 
								</tr>
								<tr>
									<td class='title2'>출원번호 </td>
									<td class="contant">
										<xsl:value-of select="root/smitapp_no" />
									</td>
									<td class='title2'>출원일</td>
									<td class="contant">
										<xsl:value-of select="substring(root/smitapp_ymd, 1, 4)" />
										-
										<xsl:value-of select="substring(root/smitapp_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(root/smitapp_ymd, 7, 2)" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 변경전 </td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="10%">계정번호</td>
									<td class='title2'>과제명</td>
									<td class="title2">연구기간</td>
									<td class='title2'>연구책임자</td>
								</tr>
								<xsl:for-each select="root/before">
									<tr>
										<td class="contant">
											<xsl:value-of select="accnt_no" />
										</td>
										<td class="contant">
											<xsl:value-of select="prj_nm" />
										</td>
										<td class="contant">
											<xsl:value-of select="prj_term" />
										</td>
										
										<td class="contant">
											<xsl:value-of select="resch_respn_syspaynm" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<!-- 안건내역 -->
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 변경후 </td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="10%">계정번호</td>
									<td class='title2'>과제명</td>
									<td class="title2">연구기간</td>
									<td class='title2'>연구책임자</td>
								</tr>
								<xsl:for-each select="root/after">
									<tr>
										<td class="contant">
											<xsl:value-of select="accnt_no" />
										</td>
										<td class="contant">
											<xsl:value-of select="prj_nm" />
										</td>
										<td class="contant">
											<xsl:value-of select="prj_term" />
										</td>
										
										<td class="contant">
											<xsl:value-of select="resch_respn_syspaynm" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<!-- 첨부화일 -->
				<xsl:if test="root/attachVo1">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 첨부파일</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<xsl:for-each select="root/attachVo1">
										<tr>
											<td class='title2' width="16%"> <xsl:value-of select="position()" /></td>
											<td class='contant' width="84%">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of
														select="attach_file_no" /><xsl:value-of
														select="seq" />','XAA016')</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
												<xsl:if test="attach_file_no != ''">
													<a>
														<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of
															select="seq" />')</xsl:attribute>
														<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기"
															style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;" />
													</a>
												</xsl:if>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
			</BODY>
		</html>
	</xsl:template>
</xsl:stylesheet>