<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<body>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable" style="margin-bottom:20px;">
					<tr>
						<td class="head">신청 정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class="title2">신청자</td>
									<td width="35%" class="contant">
										<xsl:value-of select="root/nm" />(<xsl:value-of select="root/emp_no" />)
									</td>
									<td class="title2">신청번호</td>
									<td width="35%" class="contant">
										<xsl:value-of select="root/req_no" />
									</td>
								</tr>
								<tr>
									<td class="title2">소속</td>
									<td class="contant">
										<xsl:value-of select="root/dept_nm" />
									</td>
									<td class="title2">직급</td>
									<td class="contant">
										<xsl:value-of select="root/posi_nm" />
									</td>
								</tr>
								<tr>
									<td class="title2">신청기간</td>
									<td class="contant">
										<xsl:value-of select="root/start_ymd" />
										~
										<xsl:value-of select="root/cls_ymd" />
									</td>
									<td class="title2">재택근무장소</td>
									<td class="contant">
										<xsl:if test="contains(root/out_work_clsf, 'CWP001')">
											자택
										</xsl:if>
										<xsl:if test="contains(root/out_work_clsf, 'CWP002')">
											기타(<xsl:value-of select="root/out_work_clsf_etc" />)
										</xsl:if>
									</td>
								</tr>
								<tr>
									<td class="title2">신청사유</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="root/cause" />
									</td>
								</tr>
								<tr>
									<td class="title2">첨부파일</td>
									<td class="contant" colspan="3">

										<xsl:for-each select="root/attachVo1">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA006')</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
											<xsl:if test="attach_file_no != ''">
												<a>
													<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of select="seq" />')</xsl:attribute>
													<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기" style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;"/>
												</a>
											</xsl:if>
										</xsl:for-each>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<iframe name="ifr" style="display:none"></iframe>
			</body>
	</xsl:template>
</xsl:stylesheet>
