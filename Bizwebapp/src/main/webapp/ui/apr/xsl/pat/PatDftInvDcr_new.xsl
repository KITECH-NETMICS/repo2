<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<TABLE cellspacing="0" cellpadding="0" border="0" width="750px">
			<TR>
				<TD>
					<table class="aproutertable" width="100%">
						<tr>
							<td width='100%' class='head'>발명기본정보내역</td>
						</tr>
						<TR>
							<TD class="body">
								<table class="aprinnertable" width="100%">
									<tr>
										<td width='15%' class='title'>신청번호</td>
										<td width='35%' class='contant'>
											<xsl:value-of select="root/mastVo/req_no" />
										</td>
										<td width='15%' class='title'>발명구분</td>
										<td width='35%' class='contant'>
											<xsl:value-of select="root/mastVo/pat_clsf_nm" />
										</td>
									</tr>
									<tr>
										<td width='15%' class='title'>기술분류</td>
										<td width='35%' class='contant'>
											<xsl:value-of select="root/mastVo/tech_clsf" />
										</td>

										<td width='15%' class='title'>소유권구분</td>
										<xsl:choose>
											<xsl:when test="root/mastVo/co_smitapp_ex = 'N'">
												<td width='35%' class='contant'>단독</td>
											</xsl:when>
											<xsl:when test="root/mastVo/co_smitapp_ex = 'Y'">
												<td width='35%' class='contant'>공동</td>
											</xsl:when>
										</xsl:choose>
									</tr>
									<tr>
										<td width='15%' class='title'>직무발명의 명칭</td>
										<td width='35%' colspan='3' class='contant'>
											<xsl:value-of select="root/mastVo/invnt_krn_nm" />
										</td>
									</tr>
									<tr>
										<td width='15%' class='title'>사전공개유무</td>										
										<xsl:choose>
											<xsl:when test="root/mastVo/bef_open_yn = 'N'">
												<td width='35%' class='contant'>무</td>
											</xsl:when>
											<xsl:when test="root/mastVo/bef_open_yn = 'Y'">
												<td width='35%' class='contant'>유</td>
											</xsl:when>
										</xsl:choose>
										<td width='15%' class='title'>직무발명여부</td>
										<xsl:choose>
											<xsl:when test="root/mastVo/invnt_clsf = 'PBT010'">
												<td width='35%' class='contant'>직무발명</td>
											</xsl:when>
											<xsl:when test="root/mastVo/invnt_clsf = 'PBT020'">
												<td width='35%' class='contant'>자유발명</td>
											</xsl:when>
										</xsl:choose>
									</tr>
									<xsl:choose>
										<xsl:when test="root/mastVo/dom_oversea_clsf = '국외'">
											<td width='15%' class='title'>출원번호</td>
											<td width='35%' class='contant-center'>
												<xsl:value-of select="root/mastVo/relat_dom_smitapp_no" />
											</td>
											<td width='15%' class='title'>출원일자</td>
											<td width='35%' class='contant-center'>
												<xsl:value-of select="root/mastVo/smitapp_ymd" />
											</td>
										</xsl:when>
									</xsl:choose>
									<xsl:choose>
										<xsl:when test="root/mastVo/bef_open_yn = 'Y'">
											<tr>
												<td width='15%' class='title'>사전공개확인서류</td>
												<td width='35%' colspan='3' class='contant'>
													<xsl:for-each select="root/fileList_K">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of
																select="seq" />','XAA070')</xsl:attribute>
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
														<br/>
													</xsl:for-each>
												</td>
											</tr>
										</xsl:when>
									</xsl:choose>
								</table>
							</TD>
						</TR>
					</table>

					<table class="aproutertable" width="100%">
						<tr>
							<td width='100%' class='head'>공동소유권</td>
						</tr>
						<TR>
							<TD class="body">
								<table class="aprinnertable" width="100%">
									<tr>
										<td width='8%' class='title'>구분</td>
										<td width='18%' class='title'>업체명</td>
										<td width='8%' class='title'>권리지분</td>
										<td width='15%' class='title'>사업자등록번호</td>
										<td width='8%' class='title'>대표자</td>
										<td width='15%' class='title'>연락처</td>
										<td width='28%' class='title'>주소</td>
									</tr>
									<xsl:for-each select="root/vendList">
										<tr>
											<xsl:choose>
												<xsl:when test="vend_type = '1'">
													<td class='contant-center'>사업자</td>
												</xsl:when>
												<xsl:when test="vend_type = '2'">
													<td class='contant-center'>개인</td>
												</xsl:when>
											</xsl:choose>
											<td class='contant-center'>
												<xsl:value-of select="vend_nm" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="stake_rt" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="vend_bsn_no" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="charg" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="contac_loc" />
											</td>
											<td class='contant'>
												<xsl:value-of select="addr" />
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</TD>
						</TR>
					</table>

					<table class="aproutertable" width="100%">
						<tr>
							<td width='100%' class='head'>직무발명자</td>
						</tr>
						<TR>
							<TD class="body">
								<table class="aprinnertable" width="100%">
									<tr>
										<td width='8%' class='title'>주발명자</td>
										<td width='8%' class='title'>소속구분</td>
										<td width='10%' class='title'>성명</td>
										<td width='15%' class='title'>주민번호</td>
										<td width='10%' class='title'>개인번호</td>
										<td width='8%' class='title'>지분(%)</td>
										<td width='12%' class='title'>연락처</td>
										<td width='13%' class='title'>소속</td>
										<td width='16%' class='title'>이메일</td>
									</tr>
									<xsl:for-each select="root/psnList">
										<tr>
											<xsl:choose>
												<xsl:when test="invnt_psn_clsf = '1'">
													<td class='contant-center'> V</td>
												</xsl:when>
												<xsl:when test="invnt_psn_clsf != '1'">
													<td class='contant-center'>
													</td>
												</xsl:when>
											</xsl:choose>										
											<xsl:choose>
												<xsl:when test="blong_clsf = 'PDT010'">
													<td class='contant-center'>내부</td>
												</xsl:when>
												<xsl:when test="blong_clsf = 'PDT020'">
													<td class='contant-center'>외부</td>
												</xsl:when>
											</xsl:choose>
											<td class='contant-center'>
												<xsl:value-of select="nm_krn" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="resid_no_dis" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="syspayno" />
											</td>
											<td class='contant-right'>
												<xsl:value-of select="stake_rt" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="contac_loc" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="blong_nm" />
											</td>
											<td class='contant'>
												<xsl:value-of select="email" />
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</TD>
						</TR>
					</table>
					<table class="aproutertable" width="100%">
						<tr>
							<td width='100%' class='head'>관련연구과제</td>
						</tr>
						<TR>
							<TD class="body">
								<table class="aprinnertable" width="100%">
									<tr>
										<td width='15%' class='title'>계정번호</td>
										<td width='45%' class='title'>연구과제명</td>
										<td width='20%' class='title'>연구기간</td>
										<td width='20%' class='title'>연구책임자</td>
									</tr>
									<xsl:for-each select="root/prjList">
										<tr>
											<td class='contant-center'>
												<xsl:value-of select="accnt_no" />
											</td>
											<td class='contant'>
												<xsl:value-of select="prj_nm" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="prj_term" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="resch_respn_nm" />
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</TD>
						</TR>
					</table>
					<table class="aproutertable" width="100%">
						<tr>
							<td width='100%' class='head'></td>
						</tr>
						<TR>
							<TD class="body">
								<table class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<tr>
										<td width='15%' class='title2'>국내/국외구분</td>
										<td width='35%' colspan='3' class='contant'>
											<xsl:value-of select="root/mastVo/dom_oversea_clsf" />
										</td>
									</tr>
									<tr>
										<td width='15%' class='title2'>출원희망국</td>
										<xsl:choose>
											<xsl:when test="root/mastVo/pct_chk = 'P'">
												<td width='35%' colspan='3' class='contant'>
													PCT진입국가(
													<xsl:value-of select="root/mastVo/smitapp_hope_natn_nm" />
													)
												</td>
											</xsl:when>

											<xsl:when test="root/mastVo/pct_chk != 'P'">
												<td width='35%' colspan='3' class='contant'>
													<xsl:value-of select="root/mastVo/smitapp_hope_natn_nm" />
												</td>
											</xsl:when>
										</xsl:choose>
									</tr>
									<!-- 
									<tr>
										<td width='15%' class='title2'>심사청구</td>
										<xsl:choose>
											<xsl:when test="root/mastVo/eval_demnd_ex = 'Y'">
												<td width='35%' colspan='3' class='contant'>Y</td>
											</xsl:when>
											<xsl:otherwise>
												<td width='35%' colspan='3' class='contant'>N</td>
											</xsl:otherwise>
										</xsl:choose>
									</tr>
									 -->
									<xsl:if test="root/mastVo/pat_clsf != 'PAT040'">
<!-- 										<tr> -->
<!-- 											<td width='15%' class='title2'>특허설계지원사업 지원여부</td> -->
<!-- 											<td width='35%' colspan='3' class='contant'> -->
<!-- 												<xsl:value-of select="root/mastVo/pdp_flag" /> -->
<!-- 											</td> -->
<!-- 										</tr>	 -->
										<tr>
											<td class='title2'>발명등급</td>
											<xsl:choose>
												<xsl:when test="root/mastVo/pat_grd = 'PPG010'">
													<td width='40%' colspan='1' class='contant'>S</td>
												</xsl:when>
												<xsl:when test="root/mastVo/pat_grd = 'PPG020'">
													<td width='40%' colspan='1' class='contant'>A</td>
												</xsl:when>
												<xsl:when test="root/mastVo/pat_grd = 'PPG030'">
													<td width='40%' colspan='1' class='contant'>B</td>
												</xsl:when>
												<xsl:when test="root/mastVo/pat_grd = 'PPG040'">
													<td width='40%' colspan='1' class='contant'>C</td>
												</xsl:when>
												<xsl:when test="root/mastVo/pat_grd = 'PPG050'">
													<td width='40%' colspan='1' class='contant'>F</td>
												</xsl:when>
											</xsl:choose>
											<td width='10%' class='title2'>발명인터뷰신청</td>
											<td class='contant'>
												<xsl:value-of select="root/mastVo/interview_yn" />
											</td>
										</tr>
										<tr>
											<td class='title2'>조기공개신청</td>
											<xsl:choose>
												<xsl:when test="root/mastVo/ely_open_ex = 'Y'">
													<td width='35%' colspan='3' class='contant'>Y</td>
												</xsl:when>
												<xsl:otherwise>
													<td width='35%' colspan='3' class='contant'>N</td>
												</xsl:otherwise>
											</xsl:choose>
										</tr>
									</xsl:if>
									<tr>
										<td class='title2'>특허사무소</td>
										<td width='40%' class='contant'>
											<xsl:value-of select="root/mastVo/patofic_nm" />
										</td>
										<td width='10%' class='title2'>담당자</td>
										<td class='contant'>
											<xsl:value-of select="root/mastVo/patofic_charg_nm" />
										</td>
									</tr>
									<tr>
										<td class='title2'>연락처</td>
										<td class='contant' colspan='3'>
											<xsl:value-of select="root/mastVo/patofic_contac_loc" />
										</td>
									</tr>
									<tr>
										<td width='15%' class='title2'>배경(종래)기술</td>
										<td width='35%' colspan='3' class='contant'>
											<xsl:value-of select="root/mastVo/tech_field" />
										</td>
									</tr>
									<tr>
										<td width='15%' class='title2'>산업상 이용분야</td>
										<td width='35%' colspan='3' class='contant'>
											<xsl:value-of select="root/mastVo/indst_use_clsf" />
										</td>
									</tr>
									<tr>
										<td width='15%' class='title2'>과제해결수단</td>
										<td width='35%' colspan='3' class='contant'>
											<xsl:value-of select="root/mastVo/solve_task" />
										</td>
									</tr>
									<tr>
										<td width='15%' class='title2'>상세한 설명</td>
										<td width='35%' colspan='3' class='contant'>
											<xsl:value-of select="root/mastVo/trans_nm" />
										</td>
									</tr>
									<tr>
										<td width='15%' class='title2'>발명의 효과</td>
										<td width='35%' colspan='3' class='contant'>
											<xsl:value-of select="root/mastVo/invnt_efct" />
										</td>
									</tr>
									<tr>
										<td width='15%' class='title2'>관련특허</td>
										<td width='35%' colspan='3' class='contant'>
											<xsl:value-of select="root/mastVo/relat_invnt" />
										</td>
									</tr>
									<tr>
										<td width='15%' class='title2'>도면첨부</td>
										<td width='35%' colspan='3' class='contant'>
											<xsl:for-each select="root/fileList_A">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of
														select="seq" />','XAA070')</xsl:attribute>
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
												<br/>
											</xsl:for-each>
										</td>
									</tr>
									<tr>
										<td width='15%' class='title2'>기타</td>
										<td width='35%' colspan='3' class='contant'>
											<xsl:for-each select="root/fileList_F">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of
														select="seq" />','XAA070')</xsl:attribute>
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
												<br/>
											</xsl:for-each>
										</td>
									</tr>
									<tr>
										<td width='15%' class='title2'>기술설명서</td>
										<td width='35%' colspan='3' class='contant'>
											<xsl:for-each select="root/fileList_B">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of
														select="seq" />','XAA070')</xsl:attribute>
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
												<br/>
											</xsl:for-each>
										</td>
									</tr>
									<tr>
										<td width='15%' class='title2'>PCT사업화 계획서</td>
										<td width='35%' colspan='3' class='contant'>
											<xsl:for-each select="root/fileList_C">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of
														select="seq" />','XAA070')</xsl:attribute>
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
												<br/>
											</xsl:for-each>
										</td>
									</tr>
									<tr>
										<td width='15%' class='title2'>외부인 양도증 </td>
										<td width='35%' colspan='3' class='contant'>
											<xsl:for-each select="root/fileList_D">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of
														select="seq" />','XAA070')</xsl:attribute>
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
												<br/>
											</xsl:for-each>
										</td>
									</tr>
									<tr>
										<td width='15%' class='title2'>공동출원사유서 </td>
										<td width='35%' colspan='3' class='contant'>
											<xsl:for-each select="root/fileList_E">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of
														select="seq" />','XAA070')</xsl:attribute>
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
												<br/>
											</xsl:for-each>
										</td>
									</tr>
									<tr>
										<td width='15%' class='title2'>1인발명지분소명서 </td>
										<td width='35%' colspan='3' class='contant'>
											<xsl:for-each select="root/fileList_G">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of
														select="seq" />','XAA070')</xsl:attribute>
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
												<br/>
											</xsl:for-each>
										</td>
									</tr>									
								</table>
							</TD>
						</TR>
					</table>
					<xsl:choose>
						<xsl:when test="root/mastVo/pat_clsf = 'PAT050'">
							<table class="aproutertable" width="100%">
								<tr>
									<td width='100%' class='head'>프로그램</td>
								</tr>
								<TR>
									<TD class="body">
										<table class="aprinnertable" width="100%">
											<tr>

												<td width='100%' colspan='4' class='title'>프로그램 저작물</td>
											</tr>
										</table>
										<table class="aprinnertable" width="100%">
											<tr>
												<td width='15%' class='title'>명칭</td>
												<td width='35%' colspan='3' class='contant'>
													<xsl:value-of select="root/bookVo/nm" />
												</td>
											</tr>
											<tr>
												<td width='15%' class='title'>창작년월일</td>
												<td width='35%' class='contant-center'>
													<xsl:value-of select="concat(substring(root/bookVo/crt_yr_mmdd, 1, 4), '-', substring(root/bookVo/crt_yr_mmdd, 5, 2), '-', substring(root/bookVo/crt_yr_mmdd, 7, 2))" />													
												</td>
												<td width='15%' class='title'>공표년월일</td>
												<td width='35%' class='contant-center'>
													<xsl:if test="root/bookVo/notice_yrmon_ymd !=''">
														<xsl:value-of select="concat(substring(root/bookVo/notice_yrmon_ymd, 1, 4), '-', substring(root/bookVo/notice_yrmon_ymd, 5, 2), '-', substring(root/bookVo/notice_yrmon_ymd, 7, 2))" />
													</xsl:if>
												</td>
											</tr>
											<tr>
												<td class='title'>복제물의형태</td>
												<td class='contant'>
													<xsl:value-of select="root/bookVo/replica_shape_nm" />
												</td>
												<td class='title'>수량</td>
												<td class='contant'>
													<xsl:value-of select="root/bookVo/replica_qty" />
												</td>
											</tr>
										</table>
										<table class="aprinnertable" width="100%">
											<tr>
												<td width='100%' colspan='4' class='title'>프로그램 개요</td>
											</tr>
										</table>
										<table class="aprinnertable" width="100%">
											<tr>
												<td width='15%' class='title'>프로그램 종류코드</td>
												<td width='85%' class='contant'>
													[<xsl:value-of select="root/bookVo/pgm_knd_big" />] > [<xsl:value-of select="root/bookVo/pgm_knd_middle" />] > [<xsl:value-of select="root/bookVo/pgm_knd_small" />] > [<xsl:value-of select="root/bookVo/pgm_knd_cd" />]
												</td>
											</tr>
											<tr>
												<td class='title'>적용분야</td>
												<td class='contant'>
													<xsl:value-of select="root/bookVo/apply_fild" />
												</td>
											</tr>
											<tr>
												<td class='title'>본 프로그램의 특징</td>
												<td class='contant'>
													<xsl:value-of select="root/bookVo/spclmark" />
												</td>
											</tr>
											<tr>
												<td class='title'>주요기능</td>
												<td class='contant'>
													<xsl:value-of select="root/bookVo/major_skill" />
												</td>
											</tr>
											<tr>
												<td class='title'>판매구분</td>
												<td class='contant'>
													<xsl:value-of select="root/bookVo/sale_clsf" />
												</td>
											</tr>
											<tr>
												<td class='title'>사용기종</td>
												<td class='contant'>
													<xsl:value-of select="root/bookVo/use_model" />
												</td>
											</tr>
											<tr>
												<td class='title'>사용 OS</td>
												<td class='contant'>
													<xsl:value-of select="root/bookVo/use_os_nm" />
												</td>
											</tr>
											<tr>
												<td class='title'>사용언어</td>
												<td class='contant'>
													<xsl:value-of select="root/bookVo/use_lang_nm" />
												</td>
											</tr>
											<tr>
												<td class='title'>필요한 프로그램</td>
												<td class='contant'>
													<xsl:value-of select="root/bookVo/need_pgm" />
												</td>
											</tr>
											<tr>
												<td class='title'>규모(Line, byte)</td>
												<td class='contant'>
													<xsl:value-of select="format-number(root/bookVo/scale,'###,###,###')" />
												</td>
											</tr>
										</table>
									</TD>
								</TR>
							</table>
						</xsl:when>
						<xsl:when test="root/mastVo/pat_clsf = 'PAT040'">
							<table class="aproutertable" width="100%">
								<tr>
									<td width='100%' class='head'>디자인</td>
								</tr>
								<TR>
									<TD class="body">
										<table class="aprinnertable" width="100%">
											<xsl:if test="root/bookVo/pre_desn_nm != ''">
												<tr>
													<td width='15%' class='title'>명칭</td>
													<td width='85%' class='contant'>
														<xsl:value-of select="root/bookVo/pre_desn_nm" />
													</td>
												</tr>
											</xsl:if>
											<tr>
												<td class='title'>첨부도면</td>
												<td class='contant'>
													<xsl:for-each select="root/fileList_I">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of
																select="seq" />','XAA070')</xsl:attribute>
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
														<br/>
													</xsl:for-each>
												</td>
											</tr>
											<tr>
												<td class='title'>선행디자인</td>
												<td class='contant'>													
													<xsl:value-of select="root/bookVo/pre_desn_ex" />
												</td>
											</tr>
											<tr>
												<td class='title'>디자인명</td>
												<td class='contant'>
													<xsl:value-of select="root/bookVo/pre_desn_nm" />
												</td>
											</tr>
											<tr>
												<td class='title'>디자인상세</td>
												<td class='contant'>
													<xsl:value-of select="root/bookVo/desn_detls_desc" />
												</td>
											</tr>
										</table>
									</TD>
								</TR>
							</table>
							<table class="aproutertable" width="100%">
								<tr>
									<td width='100%' class='head'>발명내용 첨부</td>
								</tr>
								<TR>
									<TD class="body">
										<table class="aprinnertable" width="100%">
											<tr>
												<td width='15%' class='title'>첨부파일</td>
												<td width='85%' class='title'>파일내용</td>
											</tr>
											<xsl:for-each select="root/attachList">
												<tr>
													<td class='contant'>
														<xsl:value-of select="attach_file_no" />
													</td>
													<td class='contant'>
														<xsl:value-of select="desc" />
													</td>
												</tr>
											</xsl:for-each>
										</table>
									</TD>
								</TR>
							</table>
						</xsl:when>

						<xsl:when test="root/mastVo/pat_clsf = 'PAT030'">
							<table class="aproutertable" width="100%">
								<tr>
									<td width='100%' class='head'>상표</td>
								</tr>
								<TR>
									<TD class="body">
										<table class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
											<tr>
												<td width='15%' class='title'>상표명</td>
												<td width='85%' class='contant'>
													<xsl:value-of select="root/bookVo/tm_mean" />
												</td>
											</tr>
											<tr>
												<td class='title'>첨부파일</td>
												<td class='contant'>
													<xsl:for-each select="root/fileList_J">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of
																select="seq" />','XAA070')</xsl:attribute>
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
														<br/>
													</xsl:for-each>
												</td>
											</tr>
											<tr>
												<td class='title'>상표의 간단한 설명</td>
												<td class='contant'>
													<xsl:value-of select="pattminvntbook/tm_desc" />
												</td>
											</tr>
											<tr>
												<td class='title'>지정상품</td>
												<td class='contant'>
													<xsl:value-of select="pattminvntbook/appont_goods" />
												</td>
											</tr>
										</table>
									</TD>
								</TR>
							</table>
						</xsl:when>
					</xsl:choose>

					<xsl:choose>
						<xsl:when test="root/mastVo/invnt_clsf = 'PBT010'">

							<table class="aproutertable" width="100%">
								<tr>
									<td width='100%' class='head'>양도증</td>
								</tr>
								<TR>
									<TD class="body">
										<table class="aprinnertable" width="100%">
											<tr>
												<td width='15%' class='title'>주소</td>
												<td width='85%' class='contant'>충청남도 천안시 서북구 입장면 양대기로길 89 한국생산기술연구원</td>
											</tr>
											<tr>
												<td class='title'>성명</td>
												<td class='contant'>한국 생산기술연구원 원장</td>
											</tr>
											<tr>												
												<td class='contant' colspan = "2">다음의 발명에 관한 <xsl:value-of select="root/mastVo/pat_clsf_nm"/>을(를) 받을 수 있는 권리를 귀하에게 양도함</td>
											</tr>
											<tr>
												<td class='title'>명칭</td>
												<td class='contant' colspan = "2"><xsl:value-of select="root/mastVo/invnt_krn_nm"/></td>
											</tr>
										</table>
									</TD>
								</TR>
							</table>
							<table class="aproutertable" width="100%">
								<tr>
									<td width='100%' class='head'>양도인</td>
								</tr>
								<TR>
									<TD class="body">
										<table class="aprinnertable" width="100%">
											<tr>
												<td width='8%' class='title'>주발명자</td>
												<td width='8%' class='title'>소속구분</td>
												<td width='10%' class='title'>성명</td>
												<td width='15%' class='title'>주민번호</td>
												<td width='10%' class='title'>개인번호</td>
												<td width='8%' class='title'>지분(%)</td>
												<td width='12%' class='title'>연락처</td>
												<td width='13%' class='title'>소속</td>
												<td width='16%' class='title'>이메일</td>
											</tr>
											<xsl:for-each select="root/psnList">
												<tr>
													<xsl:choose>
														<xsl:when test="invnt_psn_clsf = '1'">
															<td class='contant-center'> V</td>
														</xsl:when>
														<xsl:when test="invnt_psn_clsf != '1'">
															<td class='contant-center'>
															</td>
														</xsl:when>
													</xsl:choose>
													<xsl:choose>
														<xsl:when test="blong_clsf = 'PDT010'">
															<td class='contant-center'>내부</td>
														</xsl:when>
														<xsl:when test="blong_clsf = 'PDT020'">
															<td class='contant-center'>외부</td>
														</xsl:when>
													</xsl:choose>
													<td class='contant-center'>
														<xsl:value-of select="nm_krn" />
													</td>
													<td class='contant-center'>
														<xsl:value-of select="resid_no_dis" />
													</td>
													<td class='contant-center'>
														<xsl:value-of select="syspayno" />
													</td>
													<td class='contant-right'>
														<xsl:value-of select="stake_rt" />
													</td>
													<td class='contant-center'>
														<xsl:value-of select="contac_loc" />
													</td>
													<td class='contant-center'>
														<xsl:value-of select="blong_nm" />
													</td>
													<td class='contant'>
														<xsl:value-of select="email" />
													</td>
												</tr>
											</xsl:for-each>
										</table>
									</TD>
								</TR>
							</table>
						</xsl:when>
					</xsl:choose>
				</TD>
			</TR>
		</TABLE>
	</xsl:template>
</xsl:stylesheet>