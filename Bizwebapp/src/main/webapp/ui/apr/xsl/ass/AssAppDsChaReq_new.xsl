<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<body>
				<table style="width:750px; " border='0' cellspacing='0' cellpadding='0'>
					<tr>
						<td>
							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head" style="width:100%; ">불용신청</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<td class="title2" style="width:22%; ">자산구분</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="root/assUnUseMastVo/aset_typ" />
												</td>
												<td class="title2" style="width:22%; ">불용 신청서 번호</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="root/assUnUseMastVo/req_no" />
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head" style="width:100%; ">불용 신청자 정보</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<td class="title2" style="width:22%; ">신청자</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="root/assUnUseMastVo/nm" />[<xsl:value-of select="root/assUnUseMastVo/empno" />]
												</td>
												<td class="title2" style="width:22%; ">이메일</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="root/assUnUseMastVo/email" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">부서명</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="root/assUnUseMastVo/dept_nm" />
												</td>
												<td class="title2" style="width:22%; ">연락처</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="root/assUnUseMastVo/ext_no" />
												</td>
											</tr>
											<!--  2022-09-13 불용 신청 프로세스 수정으로 스냅샷에 필요없는 데이터도 주석처리
											<tr>
												<td class="title2" style="width:22%; ">타기관사용가능성</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="re_use_possbl" />
												</td>
												<td class="title2" style="width:22%; ">수리후경제적가치</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="repay_aftr_econo_value" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">평상시관리상태</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="mngmt_state" />
												</td>
												<td class="title2" style="width:22%; ">기타사항</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="etc_Item" />
												</td>
											</tr>
											<tr>
												<td class="title2">불용사유</td>
												<td colspan="3" class="contant">
													<xsl:value-of select="cause" />
												</td>
											</tr>
											<tr>
												<td class='title2'>관련자료첨부</td>
												<td class='contant' colspan='3'>
													<xsl:for-each select="attaches/vector/data/mdata">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA015')</xsl:attribute>
															<xsl:value-of select="file_nm" />
															<br />
														</a>
													</xsl:for-each>
												</td>
											</tr>
											-->
										</table>
									</td>
								</tr>
							</table>
							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head">불용신청 자산내역</td>
								</tr>
								<tr>
									<td colspan="4" class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<th class="title" style= "text-align:center;">순번</th>
												<th class="title" style= "text-align:center;">M/S 구분</th>
												<th class="title" style= "text-align:center;">자산분류</th>
												<th class="title" style= "text-align:center;">자산번호</th>
												<th class="title" style= "text-align:center;">취득일자</th>
												<th class="title" style= "text-align:center;">품명</th>
												<th class="title" style= "text-align:center;">취득금액</th>
												<th class="title" style= "text-align:center;">사용자</th>
												<th class="title" style= "text-align:center;">위치</th>
											</tr>

											<xsl:for-each select="root/asetList">
												<tr>
													<td class="contant-center" style="text-align:center; ">
														<xsl:value-of select="position()" />
													</td>
													<td class="contant" style="text-align:center; ">
														<xsl:value-of select="main_sub_clsf_nm" />
													</td>
													<td class="contant-right" style="text-align:center; ">
														<xsl:value-of select="aset_clsf_nm" />
													</td>
													<td class="contant-right" style="white-space:nowrap;text-align:center; ">
														<xsl:value-of select="aset_no" />
													</td>
													<td class="contant-right" style="white-space:nowrap;text-align:center; ">
														<xsl:value-of select="substring(intro_ymd, 1, 4)" />-<xsl:value-of select="substring(intro_ymd, 5, 2)" />-<xsl:value-of select="substring(intro_ymd, 7, 2)" />
													</td>
													<td class="contant-center" style="text-align:left; ">
														<xsl:value-of select="aset_nm" />
													</td>
													<td class="contant-right" style="white-space:nowrap;text-align:right; ">
														<xsl:value-of select="format-number(intro_amt, '#,###.##')" />
													</td>
													<td class="contant-center" style="white-space:nowrap;text-align:center; ">
														<xsl:value-of select="user_nm" />
													</td>
													<td class="contant" style="text-align:left; ">
														<xsl:value-of select="posi_region_nm" />
														<span><xsl:value-of select="posi_build_nm" /></span> 
														<span><xsl:value-of select="posi_floor" /> </span>
														<xsl:value-of select="posi_detls" />
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
			</body>
	</xsl:template>
</xsl:stylesheet>