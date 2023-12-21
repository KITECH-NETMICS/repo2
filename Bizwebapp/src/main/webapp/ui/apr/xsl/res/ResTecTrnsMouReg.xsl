<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="localPath" />
		
			<BODY>

				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">기술이전기본정보</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width='14%' class='title2'>신청번호</td>
									<td width='19%' class='contant'>
										<xsl:value-of select="APPROVAL/req_no" />
									</td>
									<td width='13%' class='title2'>계약번호</td>
									<td width='53%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVAL/tech_fee_no" />
									</td>
								</tr>
								<tr>
									<td width='14%' class='title2'>기술이전계약명</td>
									<td width='19%' colspan='5' class='contant'>
										<xsl:value-of select="APPROVAL/tech_nm" />
									</td>
								</tr>
								<tr>
									<td width='14%' class='title2'>계약기간</td>
									<td width='19%' colspan='5' class='contant'>
										<xsl:value-of select="substring(APPROVAL/contrct_start_ymd,1,4)" />
										년
										<xsl:value-of select="substring(APPROVAL/contrct_start_ymd,5,2)" />
										월
										<xsl:value-of select="substring(APPROVAL/contrct_start_ymd,7,2)" />
										일 ~
										<xsl:value-of select="substring(APPROVAL/contrct_cls_ymd,1,4)" />
										년
										<xsl:value-of select="substring(APPROVAL/contrct_cls_ymd,5,2)" />
										월
										<xsl:value-of select="substring(APPROVAL/contrct_cls_ymd,7,2)" />
										일
									</td>
								</tr>
								<tr>
									<td width='14%' class='title2'>기술이전책임자</td>
									<td width='19%' class='contant'>
										<xsl:value-of select="APPROVAL/nm" />
									</td>
									<td width='13%' class='title2'>소속</td>
									<td colspan='3' class='contant'>
										<xsl:value-of select="APPROVAL/dept_nm" />
									</td>
								</tr>
								<tr>
									<td width='14%' class='title2'>기술구분</td>
									<td width='19%' class='contant'>
										<xsl:value-of select="APPROVAL/mou_clsf" />
										(
										<xsl:value-of select="APPROVAL/tech_prj_clsf" />
										)
									</td>
									<td width='13%' class='title2'>실시범위</td>
									<td colspan='3' class='contant'>
										<xsl:value-of select="APPROVAL/trns_scop" />
									</td>
								</tr>
								<tr>
									<td width='14%' class='title2'>계약형태</td>
									<td colspan='5' class='contant'>
										<xsl:value-of select="APPROVAL/permit_clsf" />
									</td>
								</tr>
								<tr>
									<td width='14%' class='title2'>관련계정</td>
									<td width='19%' class='contant'>
										<xsl:value-of select="APPROVAL/accnt_no" />
									</td>
									<td width='67%' colspan='4' class='contant'>
										<xsl:value-of select="APPROVAL/accnt_no_nm" />
									</td>
								</tr>
								<tr>
									<td width='14%' class='title2'>기타계약조건</td>
									<td colspan='5' class='contant'>
										<xsl:value-of select="APPROVAL/rmk" disable-output-escaping="yes" />
									</td>
								</tr>
								<tr>
									<td width='14%' class='title2'>기술적용분야</td>
									<td width='19%' class='contant'>
										<xsl:value-of select="APPROVAL/six_t" />
									</td>
									<td width='13%' class='title2'>산업기술분류</td>
									<td colspan='3' class='contant'>
										<xsl:value-of select="APPROVAL/ind_tech_clsf" />
									</td>
								</tr>
								<tr>
									<td width='14%' class='title2'>기술성숙도</td>
									<td colspan='5' class='contant'>
										<xsl:value-of select="APPROVAL/tech_grow_level" />
									</td>
								</tr>								
							</table>
						</td>
					</tr>
				</table>
				<!-- <xsl:if test="APPROVAL/grid6_cnt > '0'"> -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">대상업체</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<xsl:for-each select="APPROVAL/doc6/vector/data/msgResPstCrtPagrMS01">
									<tr>
										<td class='title2'>상호</td>
										<td class='contant'>
											<xsl:value-of select="vend_nm" />
										</td>
										<td class='title2'>대표자</td>
										<td class='contant-center'>
											<xsl:value-of select="reprs_psn_nm" />
										</td>
										<td class='title2'>사업자번호</td>
										<td class='contant-center'>
											<xsl:value-of select="bsns_psn_regst_no" />
										</td>
									</tr>
									<tr>
										<td class='title2'>부서</td>
										<td class='contant'>
											<xsl:value-of select="charg_dept" />
										</td>
										<td class='title2'>주소</td>
										<td colspan='4' class='contant'>
											<xsl:value-of select="addr" />
										</td>
									</tr>
									<tr>
										<td class='title2'>담당자 정보</td>
										<td width='20%' class='contant-center'>
											<xsl:value-of select="charg" />
										</td>
										<td class='contant-center'>
											<xsl:value-of select="charg_posi_nm" />
										</td>
										<td class='contant-center'>
											<xsl:value-of select="charg_tel" />
										</td>
										<td colspan='2' class='contant'>
											<xsl:value-of select="charg_email" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>

				<xsl:if test="APPROVAL/grid1_cnt > '0'">
					<table class="aproutertable" width="100%">
						<tr>
							<td class="head">지식재산권</td>
						</tr>
						<tr>
							<td class="body">
								<table class="aprinnertable" width="100%">
									<tr>
										<td class='title2' style='text-align:center'>번호</td>
										<td class='title2' style='text-align:center'>지재권종류</td>
										<td class='title2' style='text-align:center'>지재권관리번호</td>
										<td class='title2' style='text-align:center'>지재권출원번호</td>
										<td class='title2' style='text-align:center'>지재권등록번호</td>
										<td class='title2' style='text-align:center'>상태</td>
										<td class='title2' style='text-align:center'>계약형태</td>
										<td class='title2' style='text-align:center'>실시범위</td>
										<td class='title2' style='text-align:center'>계정번호</td>
									</tr>
									<xsl:for-each select="APPROVAL/doc1/vector/data/msgResPstAplyMS01">
										<tr>
											<td class='contant-center'>
												<xsl:value-of select="odr" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="indst_right_clsf_nm" />
											</td>
											<td class='contant'>
												<xsl:value-of select="mngmt_no" />
											</td>
											<td class='contant'>
												<xsl:value-of select="smitapp_no" />
											</td>
											<td class='contant'>
												<xsl:value-of select="regst_no" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="state_desc" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="permit_clsf_nm" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="trns_scop_nm" />
											</td>
											<td class='contant'>
												<xsl:value-of select="accnt_no" />
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				
				<xsl:if test="APPROVAL/grid2_cnt > '0'">
					<table class="aproutertable" width="100%">
						<tr>
							<td class="head">기술자료</td>
						</tr>
						<tr>
							<td class="body">
								<table class="aprinnertable" width="100%">
									<tr>
										<td class='title2' style='text-align:center'>번호</td>
										<td class='title2' style='text-align:center'>기술자료(사양포함)</td>
										<td class='title2' style='text-align:center'>단위</td>
										<td class='title2' style='text-align:center'>수량</td>
										<td class='title2' style='text-align:center'>이전예정일</td>
										<td class='title2' style='text-align:center'>첨부화일</td>
									</tr>
									<xsl:for-each select="APPROVAL/doc2/vector/data/msgResTrnsTechRefMS01">
										<tr>
											<td class='contant-center'>
												<xsl:number count="APPROVAL/doc2/vector/data" level="single" format="1" />
											</td>
											<td class='contant'>
												<xsl:value-of select="tech_ref_data" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="unit_cd_nm" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="qty" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="substring(trns_schdl_ymd,1,4)" />-<xsl:value-of select="substring(trns_schdl_ymd,5,2)" />-<xsl:value-of select="substring(trns_schdl_ymd,7,2)" />
											</td>
											<td class='contant'>
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_full_path" />', 'XAA016')</xsl:attribute>
													<xsl:value-of select="org_file" />
												</a>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<xsl:if test="APPROVAL/grid5_cnt > '0'">
					<table class="aproutertable" width="100%">
						<tr>
							<td class="head">실시대가</td>
						</tr>
						<tr>
							<td class="body">
								<table class="aprinnertable" width="100%">
									<tr>
										<td class='title2' style='text-align:center'>기술료구분</td>
										<td class='title2' style='text-align:center'>입금구분</td>
										<td class='title2' style='text-align:center'>납부예정일</td>
										<td class='title2' style='text-align:center'>공급가액</td>
										<td class='title2' style='text-align:center'>부가세</td>
										<td class='title2' style='text-align:center'>총액</td>
										<td class='title2' style='text-align:center'>비고</td>
									</tr>
									<xsl:for-each select="APPROVAL/doc5/vector/data/msgResCrtPsRecTeMS01">
										<tr>
											<td class='contant-center'>
												<xsl:value-of select="tech_fee_nm" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="depst_clsf_nm" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="substring(depst_schdl_ymd,1,4)" />
												-
												<xsl:value-of select="substring(depst_schdl_ymd,5,2)" />
												-
												<xsl:value-of select="substring(depst_schdl_ymd,7,2)" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(depst_schdl_suply_value, '#,###,###')" />
												<br />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(depst_schdl_tax_amt, '#,###,###')" />
												<br />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(depst_schdl_amt, '#,###,###')" />
												<br />
											</td>
											<td class='contant'>
												<xsl:value-of select="unusual_item" />
											</td>
										</tr>
									</xsl:for-each>
									<xsl:if test="APPROVAL/estmt_stndrd != ''">
										<tr>
											<td class='title2' colspan="7" style='text-align:center'>기술료지급</td>
										</tr>
										<tr>
											<td class='title2' style='text-align:center'>기술료산정기준</td>
											<td colspan='6' class='contant'>
												<xsl:value-of select="APPROVAL/estmt_stndrd" />
											</td>
										</tr>
										<tr>
											<td class='title2' style='text-align:center'>납부조건</td>
											<td colspan='6' class='contant'>
												<xsl:value-of select="APPROVAL/crt_pay_cnd" />
											</td>
										</tr>
										<tr>
											<td class='title2' style='text-align:center'>납부시기</td>
											<td colspan='6' class='contant'>
												<xsl:value-of select="APPROVAL/crt_pay_date" />
											</td>
										</tr>
									</xsl:if>									
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">기술료 입금계좌</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td class='title2' style='text-align:center'>은행명</td>
									<td class='title2' style='text-align:center'>계좌번호</td>
									<td class='title2' style='text-align:center'>예금주</td>
								</tr>
								<tr>
									<td class='contant-center'>기업은행</td>
									<td class='contant-center'>431-1700-179-7400</td>
									<td class='contant-center'>한국생산기술연구원</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table class="aproutertable" width="100%">
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td class='title2'>특약사항</td>
									<td colspan='5' class='contant'>
										<pre style="white-space:pre-wrap;">
											<xsl:value-of select="APPROVAL/spcl_cntrct" />
										</pre>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">기업신용정보</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<tr>
										<td width='13%' class='title2'> 조회일자</td>
										<td width='15%' class='contant-center'>
											<xsl:value-of select="APPROVAL/agncy_chk_ymd" />
										</td>
										<td width='13%' class='title2'> 조회기관 </td>
										<td width='30%' class='contant'>
											<xsl:value-of select="APPROVAL/chk_agncy" />
										</td>
										<td width='13%' class='title2' >신용등급 </td>
										<td width='13%' class='contant-center'>
											<xsl:value-of select="APPROVAL/credit_grd" />
										</td>
									</tr>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<xsl:if test="APPROVAL/grid7_cnt > '0'">
					<table class="aproutertable" width="100%">
						<tr>
							<td class="head">기술이전 중개기관</td>
						</tr>
						<tr>
							<td class="body">
								<table class="aprinnertable" width="100%">
									<tr>
										<td class='title2' style='text-align:center'>업체명</td>
										<td class='title2' style='text-align:center'>사업자등록번호</td>
										<td class='title2' style='text-align:center'>대표자</td>
										<td class='title2' style='text-align:center'>내용</td>
										<td class='title2' style='text-align:center'>중개수수료율</td>
										<td class='title2' style='text-align:center'>금액</td>
										<td class='title2' style='text-align:center'>부가세</td>
										<td class='title2' style='text-align:center'>합계</td>
									</tr>
									<xsl:for-each select="APPROVAL/doc7/vector/data/msgResTrnsAgncyVendMS01">
										<tr>
											<td class='contant-center'>
												<xsl:value-of select="vend_abbr" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="bsns_psn_regst_no" />
											</td>
											<td class='contant-center'>
												<xsl:value-of select="reprs_psn_nm " />
											</td>
											<td class='contant'>
												<xsl:value-of select="agncy_contnt " />
											</td>
											<td class="contant-center">
												<xsl:value-of select="agncy_fee_rt " /> %
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(suply_value, '#,###,###')" />
												<br />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(add_tax, '#,###,###')" />
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(agncy_fee, '#,###,###')" />
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>

				<!-- [F]첨부파일 (시작) -->
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 첨부파일</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2'>세부기술이전계약서</td>
									<td class='contant'>
										<xsl:for-each select="APPROVAL/fileList_A/vector/data/mdata">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA016')</xsl:attribute>
												<xsl:value-of select="file_nm" />												
											</a>
											<br />
										</xsl:for-each>
									</td>
								</tr>
								<tr>
									<td class='title2'>기술자료 및 기타자료</td>
									<td class='contant'>
										<xsl:for-each select="APPROVAL/fileList_D/vector/data/mdata">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />', 'XAA016')</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
											<br />
										</xsl:for-each>
									</td>
								</tr>
								<tr>
									<td class='title2'>사업자등록증</td>
									<td class='contant'>
										<xsl:for-each select="APPROVAL/fileList_E/vector/data/mdata">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />', 'XAA016')</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
											<br />
										</xsl:for-each>
									</td>
								</tr>
								<tr>
									<td class='title2'>기업신용정보</td>
									<td class='contant'>
										<xsl:for-each select="APPROVAL/fileList_F/vector/data/mdata">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />', 'XAA016')</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
											<br />
										</xsl:for-each>
									</td>
								</tr>
								<xsl:if test="APPROVAL/agncy_attach_file != ''">
									<tr>
										<td class='title2'>기술이전 중개기관</td>
										<td class='contant'>
											<xsl:for-each select="APPROVAL/doc7/vector/data/mdata">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_full_path" />', 'XAA016')</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
												<br />
											</xsl:for-each>
										</td>
									</tr>
								</xsl:if>
							</table>
						</td>
					</tr>
				</table>
				<!-- [F]첨부파일 (종료) -->
			</BODY>
	</xsl:template>
</xsl:stylesheet>