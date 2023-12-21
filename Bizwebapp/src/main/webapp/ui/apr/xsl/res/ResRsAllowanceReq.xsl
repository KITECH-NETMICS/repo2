<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
			<body>
				<script><![CDATA[
					/* 크리스피드 이원길 미리보기 시작 */
					function openEvidWindow(unslipNo){
						var url = "https://evid.kitech.re.kr/sd/view?CLS=00&amp;amp;amp;RESL_NO=" + unslipNo + "&amp;amp;amp;EMP_NO=" + unslipNo;
						url = url.replaceAll("amp;","");
						window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
					}
					/* 크리스피드 이원길 미리보기 끝 */
				]]></script>

				<!-- [A]문서 타이틀 (시작) -->
				<!-- <table class="aproutertable" width="100%"> <tr> <td class="head" align='center'>연구수당신청</td> </tr> </table> -->
				<!-- [A]문서 타이틀 (종료) -->

				<!-- [B]계정정보 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head"></td>
					</tr>
					<tr>
						<td>
							<table class="aproutertable" width="100%">
								<tr>
									<td width='20%' align='left'>
										<font color='#444444' face='굴림'>
											<b> 계정정보</b>
										</font>
									</td>
									<td width='80%' align='right'>
										<font color='#444444' face='굴림'>
											<b>
												신청번호 :
												<xsl:value-of select="APPROVALREQ/req_no" />
											</b>
										</font>
									</td>
								</tr>
							</table>
						</td>
					</tr>

					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width='13%' class='title2'>계정번호</td>
									<td width='20%' class='contant'>
										<xsl:value-of select="APPROVALREQ/accnt_no" />
									</td>
									<td width='13%' class='title2'>과제번호</td>
									<td width='20%' class='contant'>
										<xsl:value-of select="APPROVALREQ/prj_no" />
									</td>
									<td width='13%' class='title2'>연구기간</td>
									<td width='21%' class='contant'>
										<xsl:value-of select="APPROVALREQ/resch_prd_term" />
									</td>
								</tr>
								<tr>
									<td width='13%' class='title2'>사업구분</td>
									<td width='20%' class='contant'>
										<xsl:value-of select="APPROVALREQ/bsns_cd_bsns_nm" />
									</td>
									<td width='13%' class='title2'>과제상태</td>
									<td width='21%' class='contant' colspan='3'>
										<xsl:value-of select="APPROVALREQ/prj_state_nm" />
									</td>
								</tr>
								<tr>
									<td width='13%' class='title2'>과제명</td>
									<td width='53%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/prj_nm" />
									</td>
									<td width='13%' class='title2'>계정상태</td>
									<td width='21%' class='contant'>
										<xsl:value-of select="APPROVALREQ/accnt_state_nm" />
									</td>
								</tr>

								<tr>
									<td width='13%' class='title2'>계정책임자</td>
									<td width='20%' class='contant'>
										<xsl:value-of select="APPROVALREQ/accnt_rspns_str" />
									</td>
									<td width='13%' class='title2'>직급</td>
									<td width='20%' class='contant'>
										<xsl:value-of select="APPROVALREQ/posi_nm" />
									</td>
									<td width='13%' class='title2'>소속</td>
									<td width='21%' class='contant'>
										<xsl:value-of select="APPROVALREQ/dept_nm" />
									</td>
								</tr>
																
							</table>

						</td>
					</tr>
				</table>
				<!-- [B]계정정보 (종료) -->
				<!-- [C]지급정보 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">
							지급정보
							<xsl:value-of select="APPROVALREQ/pay_seq" /><xsl:text disable-output-escaping="yes"><![CDATA[]]>
							</xsl:text>직접비집행율(%) : <xsl:value-of select="APPROVALREQ/drct_rt" />
						</td>
					</tr>

					<tr>
						<td>
							<table class="aproutertable" width="100%">
								<tr>
									<td class="body">
										<table class="aprinnertable" width="100%">
											<tr>
												<td width='19%' class='title2'>인건비집행액(현금)</td>
												<td width='14%' class='contant-right'>
													<xsl:value-of select="format-number(APPROVALREQ/psn_cost, '###,###,###,##0')" />
												</td>
												<td width='19%' class='title2'>인건비집행액(현물)</td>
												<td width='14%' class='contant-right'>
													<xsl:value-of select="format-number(APPROVALREQ/goos_amt, '###,###,###,##0')" />
												</td>
												<td width='19%' class='title2'>인건비집행액총계</td>
												<td width='14%' class='contant-right'>
													<xsl:value-of select="format-number(APPROVALREQ/totl_psn_cost, '###,###,###,##0')" />
												</td>
											</tr>
											<tr>
												<td width='19%' class='title2'>내부1집행금액(현금)</td>
												<td width='14%' class='contant-right'>
													<xsl:value-of select="format-number(APPROVALREQ/psn1_cost, '###,###,###,##0')" />
												</td>
												<td width='19%' class='title2'>간접비집행액(현금)</td>
												<td width='14%' class='contant-right'>
													<xsl:value-of select="format-number(APPROVALREQ/indrc_agree_sum, '###,###,###,##0')" />
												</td>
												<td width='19%' class='title2'>연구수당 편성비율(%)</td>
												<td width='14%' class='contant-center'>
													<xsl:if test="APPROVALREQ/frm_rt != '해당없음'">
														<xsl:value-of select="format-number(APPROVALREQ/frm_rt, '##0.00')" />
													</xsl:if>
													<xsl:if test="APPROVALREQ/frm_rt = '해당없음'">
														해당없음
													</xsl:if>
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
						</td>
					</tr>

					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td class='title'>순번</td>
									<td class='title'>구분</td>
									<td width='8%' class='title'>성명</td>
									<td width='9%' class='title'>직급</td>
									<td class='title'>인건비집행액</td>
									<td class='title'>참여율(%)</td>
									<td class='title'>참여기간</td>
									<td class='title'>기여도점수</td>
									<td class='title'>기여도총점</td>
									<td class='title'>지급율(%)</td>
									<td class='title'>지급금액</td>
									<td class='title'>과세적용</td>
									<td class='title'>수령액</td>
								</tr>
								<xsl:for-each select="APPROVALREQ/GRIDLIST/vector/data/msgResBgAllow">
									<xsl:variable name="taxYn" select="tax_apply_yn" />
									<xsl:variable name="apprvYn" select="apprvl_yn" />
									<tr>
										<td class='contant-center'>
											<xsl:value-of select="no" />
										</td>  <!-- 순번 -->
										<td class='contant-center'>
											<xsl:value-of select="reschr_clsf_nm" />
										</td>  <!-- 연구원구분 -->
										<td class='contant-center'>
											<xsl:value-of select="hu_nm" />
										</td>  <!-- 성명 -->
										<td class='contant-center'>
											<xsl:value-of select="posi_nm" />
										</td>  <!-- 직급 -->
										<td class='contant-right'>
											<xsl:value-of select="format-number(distr_amt, '###,###,###,##0')" />
										</td>  <!-- 인건비집행액 -->
										<td class='contant-center'>
											<xsl:value-of select="format-number(attnce_rt, '##0.00')" />
										</td>  <!-- 참여율(%) -->
										<td class='contant-center'>
											<xsl:value-of select="attnce_prd_trm" /><br/>(<xsl:value-of select="format-number(attnce_prd_tot, '##0.00')" />%)
										</td>  <!-- 참여기간 -->
										<td class='contant-center'>
											<xsl:value-of select="format-number(contribute_rt, '##0.00')" />
										</td>  <!-- 기여도점수 -->
										<td class='contant-center'>
											<xsl:value-of select="format-number(contribute_total, '##0.00')" />
										</td>  <!-- 기여도총점 -->
										<td class='contant-center'>
											<xsl:value-of select="format-number(pay_rt, '##0.00')" />
										</td>  <!-- 지급율(%) -->
										<td class='contant-right'>
											<xsl:value-of select="format-number(pay_amt, '###,###,###,##0')" />
										</td>  <!-- 지급금액 -->
										<td class='contant-center'>
											<xsl:choose>
												<xsl:when test="$taxYn = '1'">
													적용
												</xsl:when>
												<xsl:otherwise>
													-
												</xsl:otherwise>
											</xsl:choose>
										</td>  <!-- 과세적용 -->
										<td class='contant-right'>
											<xsl:value-of select="format-number(real_amt, '###,###,###,##0')" />
										</td>  <!-- 지급금액 -->
									</tr>
								</xsl:for-each>

								<tr bgcolor="#EEEEEE">
									<td colspan="5" class='title'>합계</td>                                                                             <!-- 합계 -->
									<td class='contant-right'>
										<!--
										<xsl:value-of select="format-number(distr_amt_sum, '###,###,###,##0')" />
										-->
									</td>  <!-- 인건비집행액 -->
									<td class='contant-center'>
									</td>  <!-- 참여율(%) -->
									<td class='contant-center'>
										<!--
										<xsl:value-of select="format-number(contribute_rt_sum, '###,###,###,##0.00')" />
										-->
									</td>  <!-- 기여도점수 -->
									<td class='contant-center'>
										<xsl:value-of select="format-number(APPROVALREQ/contribute_rt2_sum, '###,###,###,##0.00')" />
									</td>  <!-- 기여도총점 -->
									<td class='contant-center'>
										<xsl:value-of select="format-number(APPROVALREQ/pay_rt_sum, '###,###,###,##0.00')" />
									</td>  <!-- (누적)지급율(%) -->
									<td class='contant-right'>
										<xsl:value-of select="format-number(APPROVALREQ/pay_amt_sum, '###,###,###,##0')" />
									</td>  <!-- (누적)지급금액 -->
									<td colspan="3" class='contant'></td>                                                                                 <!-- Blank -->
								</tr>
							</table>
						</td>
					</tr>

				</table>
				<!-- [C]지급정보 (종료) -->

				<!-- [D]첨부파일 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">첨부파일</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<xsl:if test="APPROVALREQ/non_reg_rsn != ''">
									<tr>
										<td width='20%' class='title2'>평가결과 미등록사유</td>
										<td width='80%' class='contant'>
											<xsl:value-of select="APPROVALREQ/non_reg_rsn" />
										</td>
									</tr>
								</xsl:if>
								<xsl:if test="APPROVALREQ/attach_file_no_d != ''">
									<tr>
										<td width='20%' class='title2'>평가결과</td>
										<td width='80%' colspan='3' class='contant'>
											<table cellpadding="0" cellspacing="2" width="100%">
												<xsl:for-each select="APPROVALREQ/fileList_D/vector/data/msgXomxComAttachFileMS01">
													<tr>
														<td class='contant'>
															<a>
																<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA001')</xsl:attribute>
																<xsl:value-of select="org_file" />
															</a>
														</td>
													</tr>
												</xsl:for-each>
											</table>
										</td>
									</tr>
								</xsl:if>
								<xsl:if test="APPROVALREQ/attach_file_no_a != ''">
									<tr>
										<td width='20%' class='title2'>첨부파일</td>
										<td width='80%' colspan='3' class='contant'>
											<table cellpadding="0" cellspacing="2" width="100%">
												<xsl:for-each select="APPROVALREQ/fileList_A/vector/data/msgXomxComAttachFileMS01">
													<tr>
														<td class='contant'>
															<a>
																<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA001')</xsl:attribute>
																<xsl:value-of select="org_file" />
															</a>
														</td>
													</tr>
												</xsl:for-each>
											</table>
										</td>
									</tr>
								</xsl:if>
								<xsl:if test="APPROVALREQ/attach_file_no_b != ''">
									<tr>
										<td width='20%' class='title2'>개인정보활용동의서</td>
										<td width='80%' colspan='3' class='contant'>
											<table cellpadding="0" cellspacing="2" width="100%">
												<xsl:for-each select="APPROVALREQ/fileList_B/vector/data/msgXomxComAttachFileMS01">
													<tr>
														<td class='contant'>
															<a>
																<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA001')</xsl:attribute>
																<xsl:value-of select="org_file" />
															</a>
														</td>
													</tr>
												</xsl:for-each>
											</table>
										</td>
									</tr>
								</xsl:if>
							</table>
						</td>
					</tr>
				</table>
				<!-- [D]첨부파일 (종료) -->

			</body>
	</xsl:template>

</xsl:stylesheet>
