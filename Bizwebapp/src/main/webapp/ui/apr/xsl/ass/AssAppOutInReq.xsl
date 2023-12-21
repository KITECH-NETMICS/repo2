<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />

	<xsl:template match="/">
			<body>
				<xsl:if test="contains(/ASSAPPIOREQ/ASSOUTINFO/apr_after_flag, 'Y')">
					<table width="100%" class="aproutertable">			
						<tr>
							<td class="head" style="background-image: url(/processparticipant/worklist/img/bot_title03.gif); background-repeat: no-repeat; background-position: 0.5% 80%;padding; padding-left: 25px;" >
								사후결재 정보
							</td>
						</tr>
						<tr>
						     <td class="body">
						     	<table width="100%" class="aprinnertable">								
									<tr>
										<td width="10%" class="title2">사 유</td>
										<td width="90%" class="contant">
											<xsl:value-of select="/ASSAPPIOREQ/ASSOUTINFO/apr_after_reason" />
										</td>
									</tr>				
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<table style="width:750px; " border='0' cellspacing='0' cellpadding='0'>
					<tr>
						<td>
							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head" style="width:100%; ">외부설치신청</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<td class="title2" style="width:22% ;  ">신청서 번호</td>
												<td colspan="3" class="contant" style="width:78% ;  ">
													<xsl:value-of select="/ASSAPPIOREQ/ASSOUTINFO/req_no" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">반출 예정일자</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of
														select="concat(substring(/ASSAPPIOREQ/ASSOUTINFO/tout_schdl_ymd, 1, 4), '-', substring(/ASSAPPIOREQ/ASSOUTINFO/tout_schdl_ymd, 5, 2), '-', substring(/ASSAPPIOREQ/ASSOUTINFO/tout_schdl_ymd, 7, 2))" />
												</td>
												<td class="title2" style="width:22% ;  ">반입 예정일자</td>
												<td class="contant" style="width:28% ;  ">
													<xsl:value-of
														select="concat(substring(/ASSAPPIOREQ/ASSOUTINFO/brin_schdl_ymd, 1, 4), '-', substring(/ASSAPPIOREQ/ASSOUTINFO/brin_schdl_ymd, 5, 2), '-', substring(/ASSAPPIOREQ/ASSOUTINFO/brin_schdl_ymd, 7, 2))" />
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head" style="width:100%; ">반출자정보</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<td class="title2" style="width:22%; ">반출자</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="/ASSAPPIOREQ/ASSOUTINFO/tout_psn_nm" />
													[
													<xsl:value-of select="/ASSAPPIOREQ/ASSOUTINFO/tout_psn_empno" />
													]
												</td>
												<td class="title2" style="width:22%; ">이메일</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="/ASSAPPIOREQ/ASSOUTINFO/tout_psn_email" />
												</td>
											</tr>
											<tr>
												<td class="title2">부서명</td>
												<td class="contant">
													<xsl:value-of select="/ASSAPPIOREQ/ASSOUTINFO/tout_psn_dept_nm" />
												</td>
												<td class="title2">연락처</td>
												<td class="contant">
													<xsl:value-of select="/ASSAPPIOREQ/ASSOUTINFO/tout_psn_ext_no" />
												</td>
											</tr>
											<tr>
												<td class="title2">사유</td>
												<td class="contant" colspan="3">
													<xsl:value-of select="/ASSAPPIOREQ/ASSOUTINFO/cause" />
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head">외부설치정보</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<td class="title2" style="width:22%; ">관련 과제명</td>
												<td colspan="3" class="contant" style="width:28%; ">
													<xsl:value-of select="/ASSAPPIOREQ/ASSOUTINFO/prj_nm" />
													[<xsl:value-of select="/ASSAPPIOREQ/ASSOUTINFO/prj_no" />]
												</td>
											</tr>
											<tr>
												<td class="title2">설치업체</td>
												<td colspan="3" class="contant" style="width:28%; ">
													<xsl:value-of select="/ASSAPPIOREQ/ASSOUTINFO/instl_vend" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">사후관리여부</td>
												<td colspan="3" class="contant">
													<xsl:value-of select="/ASSAPPIOREQ/ASSOUTINFO/aftr_mngmt_ex" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">설치업체담당자</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="/ASSAPPIOREQ/ASSOUTINFO/instl_vend_charg" />
												</td>
												<td class="title2" style="width:22%; ">연락처</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="/ASSAPPIOREQ/ASSOUTINFO/instl_vend_charg_tel" />
												</td>
											</tr>
											<tr>
												<td class="title2">설치운영 시작일자</td>
												<td class="contant">
													<xsl:value-of
														select="concat(substring(/ASSAPPIOREQ/ASSOUTINFO/out_instl_ymd_st, 1, 4), '-', substring(/ASSAPPIOREQ/ASSOUTINFO/out_instl_ymd_st, 5, 2), '-', substring(/ASSAPPIOREQ/ASSOUTINFO/out_instl_ymd_st, 7, 2))" />
												</td>
												<td class="title2">설치운영 종료일자</td>
												<td class="contant">
													<xsl:value-of
														select="concat(substring(/ASSAPPIOREQ/ASSOUTINFO/out_instl_ymd_ed, 1, 4), '-', substring(/ASSAPPIOREQ/ASSOUTINFO/out_instl_ymd_ed, 5, 2), '-', substring(/ASSAPPIOREQ/ASSOUTINFO/out_instl_ymd_ed, 7, 2))" />
													<xsl:choose>
														<xsl:when test="out_instl_ymd_ed=''">
															-
														</xsl:when>
													</xsl:choose>
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>

							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head">외부설치 신청내역</td>
								</tr>
								<tr>
									<td colspan="4" class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<th class="title" style="width:3%; ">순번</th>
												<th class="title" style="width:8%; ">자산번호</th>
												<th class="title" style="width:5%; ">구자산번호</th>
												<th class="title" style="width:15%; " colspan='2'>사용자</th>

												<th class="title" style="width:8%; ">도입일자</th>
												<th class="title" style="width:8%; ">도입금액</th>
												<th class="title" style="width:20%; ">품명</th>
												<th class="title" style="width:10%; ">설치위치</th>
											</tr>
											<xsl:for-each select="/ASSAPPIOREQ/GRIDRESULT/vector/data/msgAssMastrB011">
												<tr>
													<td class="contant-center" style="width:3%; ">
														<xsl:value-of select="position()" />
													</td>
													<td class="contant-center" style="width:8%; ">
														<xsl:value-of select="aset_no" />
													</td>
													<td class="contant-center" style="width:5%; ">
														<xsl:value-of select="old_aset_no" />
														<xsl:choose>
															<xsl:when test="old_aset_no='           '">
																-
															</xsl:when>
														</xsl:choose>
													</td>
													<td class="contant-center" style="width:5%; ">
														<xsl:value-of select="user_empno" />
													</td>
													<td class="contant-center" style="width:8%; ">
														<xsl:value-of select="user_nm" />
													</td>

													<td class="contant-center" style="width:8%; ">
														<xsl:value-of select="concat(substring(intro_ymd, 1, 4), '-', substring(intro_ymd, 5, 2), '-', substring(intro_ymd, 7, 2))" />
													</td>
													<td class="contant-right" style="width:8%; ">
														<xsl:value-of select="format-number(intro_amt, '###,###')" />
													</td>
													<td class="contant" style="width:20%; ">
														<xsl:value-of select="aset_nm" />
													</td>
													<td class="contant" style="width:10%; ">
														<xsl:value-of select="posi_nm" />
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
				<xsl:if test="ASSAPPIOREQ/ASSOUTINFO/attach_file_no !=''">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 첨부파일</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<xsl:for-each select="ASSAPPIOREQ/ASSOUTINFO/attaches/vector/data/mdata">
									<tr>
										<td class='title2' width="16%">
											첨부파일 (<xsl:value-of select="seq" />)
										</td>
										<td class='contant' width="84%">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA015')</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				</xsl:if>
			</body>
	</xsl:template>
</xsl:stylesheet>
