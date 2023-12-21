<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<body>
				<table style="width:860px; " border='0' cellspacing='0'
					cellpadding='0'>
					<tr>
						<td>
							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head" style="width:100%; ">기본정보</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<td class="title2" style="width:22%; ">자료구분</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="APPROVAL/data_clsf_nm" />
												</td>
												<td class="title2" style="width:22%; ">요청기관</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="APPROVAL/org_nm" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">요청채널</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="APPROVAL/req_clsf_nm" />
												</td>
												<td class="title2" style="width:22%; ">기재부문서번호</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="APPROVAL/agncy_doc_no" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">문서번호</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="APPROVAL/req_no" />
												</td>
												<td class="title2" style="width:22%; ">문서제목 </td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="APPROVAL/doc_nm" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">시작일자</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="APPROVAL/start_ymd" />
												</td>
												<td class="title2" style="width:22%; ">마감일시 </td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="APPROVAL/cls_datetime" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">등록자</td>
												<td class="contant" style="width:28% ;" colspan="3">
													<xsl:value-of select="APPROVAL/req_psn_nm" />
													(
													<xsl:value-of select="APPROVAL/empno" />
													)
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">검토의견</td>
												<td class="contant" style="width:28% ; " colspan="3">
													<xsl:value-of select="APPROVAL/rslt_opn" disable-output-escaping="yes"/>
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>

							<table class="aproutertable" width="100%">
								<tr>
									<td width='100%' class='head'>담당부서</td>
								</tr>
								<TR>
									<TD class="body">
										<table class="aprinnertable" width="100%">
											<tr>
												<td width='5%' class='title'>순번</td>
												<td width='10%' class='title'>담당부서</td>
												<td width='10%' class='title'>부서구분</td>
												<td width='10%' class='title'>담당업무</td>
												<td width='10%' class='title'>담당자</td>
												<td width='25%' class='title'>부서의견</td>
												<td width='10%' class='title'>메일발송일시</td>
												<td width='10%' class='title'>접수일시</td>
												<td width='10%' class='title'>제출일시</td>
											</tr>
											<xsl:for-each select="APPROVAL/grid1/vector/data/msgLplEtrReqDeptMS01">
												<tr>
													<td class='contant-center'>
														<xsl:number count="APPROVAL/grid1/vector/data"
															level="single" format="1" />
													</td>
													<td class='contant-center'>
														<xsl:value-of select="dept_nm" />
													</td>
													<td class='contant-center'>
														<xsl:value-of select="dept_clsf" />
													</td>
													<td class='contant-center'>
														<xsl:value-of select="job_nm" />
													</td>
													<td class='contant-center'>
														<xsl:value-of select="chrg_nm" />
													</td>
													<td class='contant'>
														<xsl:value-of select="doc_ctnt" />
													</td>
													<td class='contant'>
														<xsl:value-of select="mail_send_time" />
													</td>
													<td class='contant'>
														<xsl:value-of select="rcpt_ymd" />
													</td>
													<td class='contant'>
														<xsl:value-of select="sumit_ymd" />
													</td>
												</tr>
											</xsl:for-each>
										</table>
									</TD>
								</TR>
							</table>

							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head" style="width:100%; ">제출문서</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<td class="title2" style="width:22%; ">첨부파일</td>
												<td class="contant" colspan="3">
													<xsl:for-each select="APPROVAL/fileList_A/vector/data/mdata">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of
																select="attach_file_no" /><xsl:value-of
																select="seq" />','XAA014')</xsl:attribute>
															<xsl:value-of select="file_nm" />
														</a>
													</xsl:for-each>
												</td>
											</tr>
										</table>
									</td>
								</tr>
								<tr>
									<td></td>
								</tr>
								<tr>
									<td></td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</body>
	</xsl:template>
</xsl:stylesheet>