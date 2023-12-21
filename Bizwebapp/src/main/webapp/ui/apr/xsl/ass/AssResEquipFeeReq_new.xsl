<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
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
												<td class="title2" style="width:22%; ">신청번호</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="root/req_no" />
												</td>
												<td class="title2" style="width:22%; ">통합관리단위 </td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="root/intgr_mngmt_unit_nm" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">통합관리계정번호</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="root/accnt_no" />
												</td>
												<td class="title2" style="width:22%; ">계정책임자</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="root/accnt_rspns_nm" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">자산번호</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="root/aset_no" />
												</td>
												<td class="title2" style="width:22%; ">ZEUS등록번호</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="root/ntis_reg_no" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">장비명(국문)</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="root/aset_kor_nm" />													
												</td>
												<td class="title2" style="width:22%; ">장비명(영문) </td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="root/aset_eng_nm" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">장비책임자</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="root/depthed_nm" />													
												</td>
												<td class="title2" style="width:22%; ">실무책임자 </td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="root/user_nm" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">취득일자</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="root/intro_ymd" />													
												</td>
												<td class="title2" style="width:22%; ">취득금액 </td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="format-number(root/intro_amt, '#,###')" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">설치장소</td>
												<td class="contant" style="width:28%;" colspan="3">
													<xsl:value-of select="root/posi_addr" />													
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">신청지역</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="root/req_region_nm" />													
												</td>
												<td class="title2" style="width:22%; ">재원 </td>
												<td class="contant" style="width:28% ;">
													R&amp;D
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">사용용도</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="root/expns_cd_nm" />													
												</td>
												<td class="title2" style="width:22%; ">집행요청금액 </td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="format-number(root/req_amt, '#,###')" />
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">적요</td>
												<td class="contant" style="width:28%;" colspan="3">
													<xsl:value-of select="root/rmk" />													
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>							
						</td>
					</tr>
					<tr>
						<td>
							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head" style="width:100%; ">연구시설장비비집행내역</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<td class="title2" style="width:22%; ">연구시설장비비집행의 필요성</td>
												<td class="contant" style="width:78%;" colspan="3">
													<xsl:value-of select="root/enfrc_ncsst" />													
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">해당 연구시설장비의 활용성</td>
												<td class="contant" style="width:28%;" colspan="3">
													<xsl:value-of select="root/enfrc_use" />													
												</td>
											</tr>
											<tr>
												<td class="title2" style="width:22%; ">첨부파일</td>
												<td class="contant" colspan="3">
													<xsl:for-each select="root/fileList">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of
																select="seq" />','XAA015')</xsl:attribute>
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
													</xsl:for-each>
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td>
							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head" style="width:100%; ">집행체크리스트</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<td class="title2" style="width:30%;" colspan="2">사용기준</td>
												<td class="title2" style="width:60%;">사용목적</td>
												<td class="title2" style="width:10%;">해당여부</td>
											</tr>
											<tr>
												<td class="title2" rowspan="5">유지・보수비</td>
												<td class="contant" > 수선유지비</td>
												<td class="contant" > 운영시설장비의 고장수리, 정비등에 소요되는 비용인가?</td>
												<td class="contant" >
													<input type='checkbox' id="chk1" disabled='true'>
														<xsl:if test="contains(root/enfrc_chk, 'ACB001')">
															<xsl:attribute name="checked">Y</xsl:attribute>
														</xsl:if>
													</input>											
												</td>
											</tr>
											<tr>
												<td class="contant"> 시설장비유지비</td>
												<td class="contant"> 운영시설장비를 이상 없이 유지시키기 위한 점검 등의 비용인가?</td>
												<td class="contant">
													<input type='checkbox' id="chk2" disabled='true'>
														<xsl:if test="contains(root/enfrc_chk, 'ACB002')">
															<xsl:attribute name="checked">Y</xsl:attribute>
														</xsl:if>
													</input>											
												</td>
											</tr>
											<tr>
												<td class="contant"> 부품교체비</td>
												<td class="contant"> 수명을 초과하거나 본래의 기능을 상실한 장비부품의 교체 비용 등의 비용인가?</td>
												<td class="contant">
													<input type='checkbox' id="chk3" disabled='true'>
														<xsl:if test="contains(root/enfrc_chk, 'ACB003')">
															<xsl:attribute name="checked">Y</xsl:attribute>
														</xsl:if>
													</input>											
												</td>
											</tr>
											<tr>
												<td class="contant"> 시설교체비</td>
												<td class="contant"> 수명을 초과하거나 본래의 기능을 상실한 시설물의 교체 비용 등의 비용인가?</td>
												<td class="contant">
													<input type='checkbox' id="chk4" disabled='true'>
														<xsl:if test="contains(root/enfrc_chk, 'ACB004')">
															<xsl:attribute name="checked">Y</xsl:attribute>
														</xsl:if>
													</input>											
												</td>
											</tr>
											<tr>
												<td class="contant"> 동일부품 교체가 아닌경우</td>
												<td class="contant"> </td>
												<td class="contant">
													<input type='checkbox' id="chk5" disabled='true'>
														<xsl:if test="contains(root/enfrc_chk2, 'ACB005')">
															<xsl:attribute name="checked">Y</xsl:attribute>
														</xsl:if>
													</input>											
												</td>
											</tr>
											<tr>
												<td class="title2">임차・사용비</td>
												<td class="contant"> 임차・사용비</td>
												<td class="contant"> 성능의 유지를 위해 지속적인 관리가 필요하여 기존 R&amp;D과제에서 임차・사용한 연구시설・장비의 계약을 연장하는 경우인가?</td>
												<td class="contant">
													<input type='checkbox' id="chk6" disabled='true'>
														<xsl:if test="contains(root/enfrc_chk, 'ACB006')">
															<xsl:attribute name="checked">Y</xsl:attribute>
														</xsl:if>
													</input>										
												</td>
											</tr>
											<tr>
												<td class="title2">이전・설치비</td>
												<td class="contant"> 이전・설치비</td>
												<td class="contant"> 연구시설・장비의 기관 간 양도 및 기관 내 공동활용시설로 재배치하는 이전과 설치에 소요되는 비용인가?</td>
												<td class="contant">
													<input type='checkbox' id="chk7" disabled='true'>
														<xsl:if test="contains(root/enfrc_chk, 'ACB007')">
															<xsl:attribute name="checked">Y</xsl:attribute>
														</xsl:if>
													</input>											
												</td>
											</tr>
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