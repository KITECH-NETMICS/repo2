<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="localPath" />
		<html lang="kr">
			<body>
				<TABLE cellspacing="0" cellpadding="0" border="0" width="100%">
					<tr>
						<td>
							<!-- [B]관련계정정보 (시작) -->
							<table class="aproutertable" width="100%">
								<tr>
									<td class="head">관련계정정보</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" width="100%">
											<tr>
												<td width='13%' class='title2'>신청번호</td>
												<td width='21%' class='contant'>
													<xsl:value-of select="APPROVAL/req_no" />
												</td>
												<td width='13%' class='title2'>기술명</td>
												<td width='53%' colspan='3' class='contant'>
													<xsl:value-of select="APPROVAL/tech_nm" />
												</td>
											</tr>
											<tr>
												<td width='13%' class='title2'>연구책임자</td>
												<td width='21%' class='contant'>
													<xsl:value-of select="APPROVAL/resch_rspns_nm" />
												</td>
												<td width='13%' class='title2'>협약구분</td>
												<td width='20%' class='contant' colspan='3'>
													<xsl:value-of select="APPROVAL/mou_clsf_nm" />
												</td>
											</tr>
											<tr>
												<td width='13%' class='title2'>출원번호</td>
												<td width='20%' class='contant' colspan='5'>
													<xsl:value-of select="APPROVAL/smitapp_no" />
												</td>
											</tr>
											<tr>
												<td width='13%' class='title2'>관련계정번호</td>
												<td width='21%' class='contant'>
													<xsl:value-of select="APPROVAL/rel_accnt_no" />
												</td>
												<td width='13%' class='title2'>대상업체</td>
												<td width='20%' class='contant'>
													<xsl:value-of select="APPROVAL/vend_nm" />
												</td>
												<td width='13%' class='title2'>허여기간</td>
												<td width='20%' class='contant'>
													<xsl:value-of select="substring(APPROVAL/exec_prmt_prd_term, 1, 4)" />-<xsl:value-of select="substring(APPROVAL/exec_prmt_prd_term, 5, 2)" />-<xsl:value-of select="substring(APPROVAL/exec_prmt_prd_term, 7, 2)" />~<xsl:value-of select="substring(APPROVAL/exec_prmt_prd_term, 10, 4)" />-<xsl:value-of select="substring(APPROVAL/exec_prmt_prd_term, 14, 2)" />-<xsl:value-of select="substring(APPROVAL/exec_prmt_prd_term, 16, 2)" />													
												</td>
											</tr>
											<tr>
												<td width='13%' class='title2'>계정번호</td>
												<td width='21%' class='contant'>
													<xsl:value-of select="APPROVAL/accnt_no" />
												</td>
												<td width='13%' class='title2'>기여자 보상금</td>
												<td width='20%' class='contant-right'>
													<xsl:value-of select="format-number(APPROVAL/inct_pay_amt, '###,###,###,##0')" />
												</td>
												<td width='13%' class='title2'>기술이전책임자 지정기여자<br/>예상지급액</td>
												<td width='20%' class='contant-right'>
													<xsl:value-of select="format-number(APPROVAL/contribute_pay_amt, '###,###,###,##0' )" />
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
							<!-- [B]관련계정정보 (종료) -->
							<!-- [C]기술료 사용계획 -->
							<table class="aproutertable" width="100%">
								<tr>
									<td class="head">기술료 사용계획</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" width="100%">
											<tr>
												<td class='title' width='20%'>기술료</td>
												<td class='contant-center' width='30%'>
													<xsl:value-of select="format-number(APPROVAL/suply_value, '###,###,###,##0')" />
													(VAT별도)
												</td>
												<td class='title' width='20%'>입금일</td>
												<td class='contant-center' width='30%'>
													<xsl:value-of select="substring(APPROVAL/ofic_depst_ymd, 1, 4)" />-<xsl:value-of select="substring(APPROVAL/ofic_depst_ymd, 5, 2)" />-<xsl:value-of select="substring(APPROVAL/ofic_depst_ymd, 7, 2)" />
												</td>
											</tr>
											<tr>
												<td class='title' colspan='2'>사 용 항 목</td>
												<td class='title' colspan='2'>사 용 금 액</td>
											</tr>
											<xsl:for-each select="APPROVAL/doc2/vector/data">
												<tr>
													<td class='contant' colspan='2'>
														<xsl:value-of select="msgResCrtPstpUsedMS02/use_clsf_nm" />
														(
														<xsl:value-of select="msgResCrtPstpUsedMS02/use_rate" />
														%)
													</td>
													<td class='contant-right' colspan='2'>
														<xsl:value-of select="format-number(msgResCrtPstpUsedMS02/use_amt, '###,###,###,##0')" />
													</td>
												</tr>
											</xsl:for-each>
											<tr>
												<td class='title' colspan='2'>합 계</td> <!-- 합계 -->
												<td class='contant-right' colspan='2'>
													<xsl:value-of select="format-number(APPROVAL/suply_value, '###,###,###,##0')" />
												</td>
											</tr>
										</table>
									</td>
								</tr>

							</table>
							<!-- [C]인센티브지급정보 (종료) -->

							<!-- 기여자 보상금에 해당하는 산정평가표 스냅샷 정보 확인필요 
							[D]산정평가표
							<table class="aproutertable" width="100%">
								<tr>
									<td class="head">기술료 인센티브 산정평가표</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" width="100%">
											<tr>
												<td width='5%' rowspan='2' class='title'>No</td>
												<td width='10%' rowspan='2' class='title'>성명</td>
												<td width='8%' rowspan='2' class='title'>직급</td>
												<td width='40%' colspan='4' class='title'>기술개발기여도</td>
												<td width='30%' colspan='3' class='title'>기술전수기여도</td>
												<td width='7%' rowspan='2' class='title'>총지급율(A+B)</td>
											</tr>
											<tr>
												<td width='10%' class='title'>지재권지분</td>
												<td width='10%' class='title'>가중치</td>
												<td width='10%' class='title'>비중</td>
												<td width='10%' class='title'>지급율(A)</td>
												<td width='10%' class='title'>기여율</td>
												<td width='10%' class='title'>비중</td>
												<td width='10%' class='title'>지급율(B)</td>
											</tr>
											<xsl:for-each select="APPROVAL/doc3/vector/data">
												<tr>
													<td class='contant-center'>
														<xsl:number count="APPROVAL/doc3/vector/data" level="single" format="1" />
													</td>  No
													<td class='contant-center'>
														<xsl:value-of select="msgResCrtPstpIctDMS07/nm" />
													</td>
													<td class='contant-center'>
														<xsl:value-of select="msgResCrtPstpIctDMS07/posi_nm" />
													</td>
													<td class='contant-center'>
														<xsl:value-of select="msgResCrtPstpIctDMS07/attnce_rt_001" />
														%
													</td>
													<td class='contant-center'>
														<xsl:value-of select="msgResCrtPstpIctDMS07/wght_val_001" />
													</td>
													<td class='contant-center'>
														<xsl:value-of select="msgResCrtPstpIctDMS07/devel_contrbt_rt" />
														%
													</td>
													<td class='contant-center'>
														<xsl:value-of select="msgResCrtPstpIctDMS07/inct_rts_001" />
														%
													</td>
													<td class='contant-center'>
														<xsl:value-of select="msgResCrtPstpIctDMS07/attnce_rt_002" />
														%
													</td>
													<td class='contant-center'>
														<xsl:value-of select="msgResCrtPstpIctDMS07/inst_contrbt_rt" />
														%
													</td>
													<td class='contant-center'>
														<xsl:value-of select="msgResCrtPstpIctDMS07/inct_rts_002" />
														%
													</td>
													<td class='contant-center'>
														<xsl:value-of select="msgResCrtPstpIctDMS07/inct_rts" />
													</td>
												</tr>
											</xsl:for-each>
											<tr>
												<td class='title' colspan='3'>합계</td>
												<td class='contant-center'>
													<xsl:value-of select="APPROVAL/attnce_rt_001_sum" />
													%
												</td>
												<td class='contant-center' />
												<td class='contant-center' />
												<td class='contant-center'>
													<xsl:value-of select="APPROVAL/inct_rts_001_sum" />
													%
												</td>
												<td class='contant-center'>
													<xsl:value-of select="APPROVAL/attnce_rt_002_sum" />
													%
												</td>
												<td class='contant-center' />
												<td class='contant-center'>
													<xsl:value-of select="APPROVAL/inct_rts_002_sum" />
													%
												</td>
												<td class='contant-center'>
													<xsl:value-of select="APPROVAL/inct_rts_sum" />
													%
												</td>
											</tr>
										</table>
									</td>
								</tr>
								<tr>
									<td style="text-align:left"> ※ 지식재산권의 경우 발명자 지분 자동생성 후 작성자가 기술전수기여도를 수정가능토록 함</td>
								</tr>
							</table>
							<p>
								말풍선
								<table class="aprinnertable" width="100%">
									<tr>
										<td class='title2'>
											※ 지재권의 기여율은 발명신고서의 지분율, 노하우의 기여율은 연구책임자 재량, 연구과제의 기여율은 연구과제의 참여율을 적용함
											<br />
											&#xa0;&#xa0; 가중치의 경우 지재권은 "1"로 하고, 연구과제는 연구책임자의 재량으로 결정
										</td>
									</tr>
									<tr>
										<td class='title2'>※ 지재권이 2건 이상인 경우의 지분율 = (각 지적재산권의 개인별 지분율의 합) / 지적재산권 건수 </td>
									</tr>
									<tr>
										<td class='title2'>※ 기술전수의 기여율은 연구책임자의 재량으로 결정함(A+B=100)</td>
									</tr>
									<tr>
										<td class='title2'>※ 기술개발 기여도의 비중은 60%이상으로 하고 기술전수 기여도의 비중은 주발명자 /연구책임자의 재량으로 결정  </td>
									</tr>
								</table>
							</p>
							<p style="text-align:left;">
								<span style="font-weight:bold;">※ 노하우의 개인별 지급상한 기준</span>
							</p>
							<table class="aprinnertable" width="100%">
								<tr>
									<td class='title' width='50%'>구분</td>
									<td class='title' width='50%'>개인별 지급 상한 비율</td>
								</tr>
								<tr>
									<td class='contant-center'>단독 수행 과제</td>
									<td class='contant-center'>100% 지급 </td>
								</tr>
								<tr>
									<td class='contant-center'>참여연구원 3인 이하</td>
									<td class='contant-center'>30% ~ 70% 이내</td>
								</tr>
								<tr>
									<td class='contant-center'>참여연구원 4인 이상</td>
									<td class='contant-center'>20% ~ 60% 이내</td>
								</tr>
								<tr>
									<td style="text-align:left">※ Sub 과제는 독립과제로 간주함</td>
								</tr>
							</table> -->

							<!-- [D]산정평가표 (종료) -->

							<!-- [E]인센티브지급정보 (시작) -->
							<table class="aproutertable" width="100%">
								<tr>
									<td class="head">개인별 기여자 보상금 지급 정보 (기술이전책임자 지정기여자)</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" width="100%">
											<tr>
												<td width='05%' class='title'>No</td>
												<td width='15%' class='title'>대상자</td>
<!-- 												<td width='15%' class='title'>사용자구분</td> -->
												<td width='10%' class='title'>지급율(%)</td>
												<td width='15%' class='title'>예상지급액</td>
												<td width='10%' class='title'>과세적용</td>
												<td width='25%' class='title'>인센티브구분</td>
											</tr>

											<xsl:for-each select="APPROVAL/doc1/vector/data">
												<tr>
													<td class='contant-center'>
														<xsl:number count="APPROVAL/doc1/vector/data" level="single" format="1" />
													</td>  <!-- No -->
													<td class='contant-center'>
														<xsl:value-of select="msgResCrtPstprwdDMS01/inct_pay_objct_nm" />
													</td>  <!-- 대상자 -->
													<!-- <xsl:if test="msgResCrtPstprwdDMS01/user_div = '1'">
														<td class='contant-center'>내부자</td>
													</xsl:if>
													<xsl:if test="msgResCrtPstprwdDMS01/user_div = '3'">
														<td class='contant-center'>외부자</td>
													</xsl:if>
													<xsl:if test="msgResCrtPstprwdDMS01/user_div = '5'">
														<td class='contant-center'>학생연구원(연구생)</td>
													</xsl:if> -->
													<td class='contant-center'>
														<xsl:value-of select="format-number(msgResCrtPstprwdDMS01/inct_rts, '##0.00')" />
													</td>  <!-- 지급율(%) -->
													<td class='contant-right'>
														<xsl:value-of select="format-number(msgResCrtPstprwdDMS01/inct_amt, '###,###,###,##0')" />
													</td>  <!-- 지급액 -->
													<!-- <td class='contant-center'><xsl:value-of select="format-number(msgResCrtPstprwdDMS01/tax_apply_rt,'##.0')" /></td> 과세율 -->
													<xsl:if test="msgResCrtPstprwdDMS01/tax_apply_yn = '1'">
														<td class='contant-center'>적용</td>
													</xsl:if>
													<xsl:if test="msgResCrtPstprwdDMS01/tax_apply_yn != '1'">
														<td class='contant-center'></td>
													</xsl:if>
													<td class='contant-center'>
														<xsl:value-of select="msgResCrtPstprwdDMS01/inct_clsf_nm" />
													</td>  <!-- 인센티브구분 -->
<!-- 													<td class='contant-center'> -->
<!-- 														<xsl:value-of select="msgResCrtPstprwdDMS01/apprvl_yn" /> -->
<!-- 													</td>  승인여부 -->
												</tr>
											</xsl:for-each>
											<tr>
												<td colspan='2' class='title'>합계</td> <!-- 합계 -->
												<td class='contant-center'>100 </td>  <!-- (누적)지급율(%) -->
												<td class='contant-right'>
													<xsl:value-of select="format-number(APPROVAL/inct_amt_sum, '###,###,###,##0')" />
												</td>  <!-- (누적)지급액 -->
												<td colspan='3' class='contant'></td>  <!-- Blank -->
											</tr>
										</table>
									</td>
								</tr>
							</table>
							<!-- [E]인센티브지급정보 (종료) -->

							<!-- [F]첨부파일 (시작) -->
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
								<tr>
									<td class="head"> 첨부파일</td>
								</tr>
								<tr>
									<td class="body">
										<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
											<xsl:for-each select="APPROVAL/fileList_E/vector/data/mdata">
												<tr>
													<td class='title2' width="16%">기술이전계약서</td>
													<td class='contant' width="84%">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA016')</xsl:attribute>
															<xsl:value-of select="file_nm" />
														</a>
													</td>
												</tr>
											</xsl:for-each>
											<xsl:for-each select="APPROVAL/fileList_B/vector/data/mdata">
												<tr>
													<td class='title2' width="16%">기여자 보상금 지급 내역 및 산정평가표</td>
													<td class='contant' width="84%">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA016')</xsl:attribute>
															<xsl:value-of select="file_nm" />
														</a>
													</td>
												</tr>
											</xsl:for-each>
											<xsl:for-each select="APPROVAL/fileList_C/vector/data/mdata">
												<tr>
													<td class='title2' width="16%">기술료인센티브 산정 평가표</td>
													<td class='contant' width="84%">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA016')</xsl:attribute>
															<xsl:value-of select="file_nm" />
														</a>
													</td>
												</tr>
											</xsl:for-each>
											<xsl:for-each select="APPROVAL/fileList_D/vector/data/mdata">
												<tr>
													<td class='title2' width="16%">발명신고서</td>
													<td class='contant' width="84%">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA016')</xsl:attribute>
															<xsl:value-of select="file_nm" />
														</a>
													</td>
												</tr>
											</xsl:for-each>
											<xsl:for-each select="APPROVAL/fileList_A/vector/data/mdata">
												<tr>
													<td class='title2' width="16%">기타첨부파일</td>
													<td class='contant' width="84%">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA016')</xsl:attribute>
															<xsl:value-of select="file_nm" />
														</a>
													</td>
												</tr>
											</xsl:for-each>
										</table>
									</td>
								</tr>
							</table>
							<!-- [F]첨부파일 (종료) -->
						</td>
					</tr>
				</TABLE>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>