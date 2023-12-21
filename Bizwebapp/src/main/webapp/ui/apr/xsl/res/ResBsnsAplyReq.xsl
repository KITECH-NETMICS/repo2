<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />

	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />

		<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> -->
			<body>
			<xsl:if test="APPROVALREQ/apr_after_flag = 'Y'">
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
									<td width="15%" class="title2">사 유</td>
									<td width="85%" class="contant">
										<xsl:value-of select="APPROVALREQ/apr_after_reason" />
									</td>
								</tr>				
							</table>
						</td>
					</tr>
				</table>
			</xsl:if>

				<!-- [A]문서 타이틀 (시작) -->
				<!-- <table class="aproutertable" width="100%"> <tr> <td class="head" align='center'>사업신청</td> </tr> </table> -->
				<!-- [A]문서 타이틀 (종료) -->

				<!-- [B]사업신청기본 (시작) -->
				<table class="aproutertable" width="100%">

					<tr> <td class="head">기본정보</td> </tr>
					<tr>
						<td class="body">

							<table class="aprinnertable" width="100%">
								<tr>
									<td width='15%' class='title2'>사업신청번호</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/bsns_req_no" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>보안등급분류</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/secrt_prj_ex" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>사업구분</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/bsns_cd_nm_str1" />
										<br />
										<xsl:value-of select="APPROVALREQ/bsns_cd_nm_str2" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>선행기획과제</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/pre_plan_prj" />
									</td>
								</tr>
								<tr>
									<td width='15%' rowspan='2' class='title2'>과제명</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/prj_nm" />
									</td>
								</tr>
								<tr>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/prj_eng_nm" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>개발목표</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/dev_goal" />
									</td>
								</tr>
								<tr>
									<td width='15%' rowspan='2' class='title2'>키워드</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/kwd_krchar" />
									</td>
								</tr>
								<tr>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/kwd_eng" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>총연구기간</td>
									<td width='85%' colspan='3' class='contant'>
										<xsl:value-of select="APPROVALREQ/tot_resch_prd_term" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>사업계획서</td>
									<td width='85%' colspan='3' class='contant'>
										<table cellpadding="0" cellspacing="2" width="100%">

											<xsl:for-each select="APPROVALREQ/fileList_A/vector/data/mdata">
												<tr>
													<td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">
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
								
								<tr>
									<td width='15%' class='title2'>사업공고문</td>
									<td width='85%' colspan='3' class='contant'>
										<table cellpadding="0" cellspacing="2" width="100%">

											<xsl:for-each select="APPROVALREQ/fileList_D/vector/data/mdata">
												<tr>
													<td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">
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

						</td>
					</tr>

				</table>
				<!-- [B]사업신청기본 (종료) -->
				
				<xsl:if test="APPROVALREQ/pre_plan_prj = 'Y'">
					<table class="aproutertable" width="100%">
					
					<tr>
						<td class="head">선행연구과제</td>
					</tr>
					
					<tr>
						<td class="body">
					
							<table class="aprinnertable" width="100%">
					
								<tr>
									<td width='10%' class='title'>계정번호</td>
									<td width='50%' class='title'>계정명</td>
									<td width='10%' class='title'>계정책임자</td>
									<td width='20%' class='title'>과제기간</td>
									<td width='10%' class='title'>기여비율(%)</td>
								</tr>
					
								<xsl:for-each select="APPROVALREQ/docPrePrj/vector/data">
									<tr>
										<td class='contant-center'>
											<xsl:value-of select="msgResPrePrjNoMS01/accnt_no" />
										</td>
										<td class='contant-center'>
											<xsl:value-of select="msgResPrePrjNoMS01/prj_nm" />
										</td>
										<td class='contant-center'>
											<xsl:value-of select="msgResPrePrjNoMS01/accnt_rspns_nm"/>
										</td>
										<td class='contant-center'>
											<xsl:value-of select="msgResPrePrjNoMS01/tot_yr_ymd"/>
										</td>
										<td class='contant-right'>
											<xsl:value-of select="format-number(msgResPrePrjNoMS01/contr_rt      , '###,###')" />
										</td>
									</tr>
								</xsl:for-each>
					
								<tr>
									<td colspan='4' class='title'>합계</td>                                                                                                     <!-- 합계 -->
									<td class='contant-right'>
										<xsl:value-of select="format-number(APPROVALREQ/preprj_contr_rt_sum      , '###,###')" />
									</td>
								</tr>
					
							</table>
					
						</td>
					</tr>
					
					</table>
					</xsl:if>

				<!-- 과세여부 (시작) -->
				<xsl:if test="APPROVALREQ/tax_disp = 'Y'">
					<table class="aproutertable" width="100%">
						<tr>
							<td class="head">과세여부</td>
						</tr>
						<tr>
							<td class="body">

								<table class="aprinnertable" width="100%">
									<tr>
										<td width='5%' class='title' rowspan='4'>
											비
											<br />
											과
											<br />
											세
										</td>
										<td width='45%' class='title2' rowspan='4'>
											1) 새로운 학술이나 기술을 개발하기 위한 새로운 이론, 방법, 공법 또는 공식의 연구
											<br />
											2) 신제품을 개발하거나 제품의 성능이나 질, 용도등을 개선하는 연구
											<br />
											3) 실비이하로 제공하는 용역(실비이하임을 입증하는 자료필요)
										</td>
										<td width='50%' class='contant'>
											<input type="checkbox" id="chk1">
												<xsl:if test="contains(APPROVALREQ/tax_free_item, 'RBK001')">
													<xsl:attribute name="checked"> checked</xsl:attribute>
												</xsl:if>
												새로운 이론, 공법, 공식에 관한 연구
											</input>
										</td>
									</tr>
									<tr>
										<td width='50%' class='contant'>
											<input type="checkbox" id="chk2">
												<xsl:if test="contains(APPROVALREQ/tax_free_item, 'RBK002')">
													<xsl:attribute name="checked"> checked</xsl:attribute>
												</xsl:if>
												신제품 개발연구
											</input>
										</td>
									</tr>
									<tr>
										<td width='50%' class='contant'>
											<input type="checkbox" id="chk3">
												<xsl:if test="contains(APPROVALREQ/tax_free_item, 'RBK003')">
													<xsl:attribute name="checked"> checked</xsl:attribute>
												</xsl:if>
												제품의 성능이나 질, 용도를 개선하는 연구
											</input>
										</td>
									</tr>
									<tr>
										<td width='50%' class='contant'>
											<input type="checkbox" id="chk4">
												<xsl:if test="contains(APPROVALREQ/tax_free_item, 'RBK004')">
													<xsl:attribute name="checked"> checked</xsl:attribute>
												</xsl:if>
												실비이하 또는 무상으로 진행되는 연구
											</input>
										</td>
									</tr>
									<tr>
										<td width='5%' class='title' rowspan='5'>
											과
											<br />
											세
										</td>
										<td width='45%' class='title2' rowspan='5'>
											1) 새로운 학술 또는 기술을 개발하기 위하여 시행하는 면세사업이외에 실비를 초과하는 수입
										</td>
										<td width='50%' class='contant'>
											<input type="checkbox" id="chk10">
												<xsl:if test="contains(APPROVALREQ/tax_item, 'RBL001')">
													<xsl:attribute name="checked"> checked</xsl:attribute>
												</xsl:if>
												조사, 시험, 진단, 인증, 심사, 평가, 분석, 제작 등 업무/용역
											</input>
										</td>
									</tr>
									<tr>
										<td width='50%' class='contant'>
											<input type="checkbox" id="chk11">
												<xsl:if test="contains(APPROVALREQ/tax_item, 'RBL002')">
													<xsl:attribute name="checked"> checked</xsl:attribute>
												</xsl:if>
												제품 판매
											</input>
										</td>
									</tr>
									<tr>
										<td width='50%' class='contant'>
											<input type="checkbox" id="chk12">
												<xsl:if test="contains(APPROVALREQ/tax_item, 'RBL003')">
													<xsl:attribute name="checked"> checked</xsl:attribute>
												</xsl:if>
												부동산 및 기계장치임대수입
											</input>
										</td>
									</tr>
									<tr>
										<td width='50%' class='contant'>
											<input type="checkbox" id="chk13">
												<xsl:if test="contains(APPROVALREQ/tax_item, 'RBL004')">
													<xsl:attribute name="checked"> checked</xsl:attribute>
												</xsl:if>
												기술료 수입
											</input>
										</td>
									</tr>
									<tr>
										<td width='50%' class='contant'>
											<input type="checkbox" id="chk14">
												<xsl:if test="contains(APPROVALREQ/tax_item, 'RBL005')">
													<xsl:attribute name="checked"> checked</xsl:attribute>
												</xsl:if>
												기타 수입
											</input>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<!-- 과세여부 (종료) -->

				<!-- [C]참여연구원 (시작) -->
				<table class="aproutertable" width="100%">

					<tr>
						<td class="head">참여연구원</td>
					</tr>

					<tr>
						<td class="body">

							<table class="aprinnertable" width="100%">

								<tr>
									<td width='10%' class='title'>연구원구분</td>
									<td width='14%' class='title'>인건비구분</td>
									<td width='8%' class='title'>개인번호</td>
									<td width='10%' class='title'>성명</td>
									<td width='8%' class='title'>현금참여율(%)</td>
									<td width='8%' class='title'>현물참여율(%)</td>
									<td width='11%' class='title'>인건비단가</td>
									<td width='11%' class='title'>계상인건비</td>
									<td width='20%' class='title'>참여기간</td>
								</tr>

								<xsl:for-each select="APPROVALREQ/docPare/vector/data">
									<tr>
										<xsl:if test="msgResAppPare/reschr_clsf = 'RAL001'">
											<td class='contant-center'>연구책임자</td>
										</xsl:if>
										<xsl:if test="msgResAppPare/reschr_clsf = 'RAL002'">
											<td class='contant-center'>참여연구원</td>
										</xsl:if>

										<xsl:if test="msgResAppPare/psnexpns_clsf = 'RAM001'">
											<td class='contant-center'>내부인건비I</td>
										</xsl:if>
										<xsl:if test="msgResAppPare/psnexpns_clsf = 'RAM002'">
											<td class='contant-center'>내부인건비II</td>
										</xsl:if>
										<xsl:if test="msgResAppPare/psnexpns_clsf = 'RAM003'">
											<td class='contant-center'>외부인건비</td>
										</xsl:if>
										<xsl:if test="msgResAppPare/psnexpns_clsf = 'RAM004'">
											<td class='contant-center'>학생인건비</td>
										</xsl:if>
										<xsl:if test="msgResAppPare/psnexpns_clsf = 'RAM005'">
											<td class='contant-center'>내부인건비III</td>
										</xsl:if>
										<td class='contant-center'>
											<xsl:value-of select="msgResAppPare/empno" />
										</td>  <!-- 개인번호 -->
										<td class='contant-center'>
											<xsl:value-of select="msgResAppPare/nm" />
										</td>  <!-- 성명 -->
										<td class='contant-center'>
											<xsl:value-of select="format-number(msgResAppPare/cash_attnce_rt, '##0.00')" />
										</td>  <!-- 현금참여율 -->
										<td class='contant-center'>
											<xsl:value-of select="format-number(msgResAppPare/goods_attnce_rt, '##0.00')" />
										</td>  <!-- 현물참여율 -->
										<td class='contant-right'>
											<xsl:value-of select="format-number(msgResAppPare/psnexpns_month_unit_price      , '###,###,###,##0')" />
										</td>  <!-- 인건비단가 -->
										<td class='contant-right'>
											<xsl:value-of select="format-number(msgResAppPare/cash_amt      , '###,###,###,##0')" />
										</td>  <!-- 계상인건비 -->
										<td class='contant-center'>
											<xsl:value-of select="msgResAppPare/attnce_prd_orign_ymd" />
											~
											<xsl:value-of select="msgResAppPare/attnce_prd_cls_ymd" />
										</td>  <!-- 참여기간(시작~종료) -->
									</tr>
								</xsl:for-each>

								<tr>
									<td colspan='6' class='title'>합계</td>                                                                                                     <!-- 합계 -->
									<td class='contant-right'>
										<xsl:value-of select="format-number(APPROVALREQ/psnexpns_month_unit_price_sum      , '###,###,###,##0')" />
									</td>  <!-- (누적)인건비단가 -->
									<td class='contant-right'>
										<xsl:value-of select="format-number(APPROVALREQ/cash_amt_sum      , '###,###,###,##0')" />
									</td>  <!-- (누적)계상인건비 -->
									<td class='contant-center'></td>                                                                                                         <!-- Blank -->
								</tr>

							</table>

						</td>
					</tr>

				</table>
				<!-- [C]참여연구원 (종료) -->

				<!-- [D]연구비 (시작) -->

				<!-- 연구비 표시 01 년차 -->
				<table class="aproutertable" width="100%">

					<tr>
						<td class='head'>
							연구비
							<xsl:value-of select="APPROVALREQ/grid_appbugt1_summary1" />
						</td>
					</tr>
					<tr>
						<td align='right'>
							<font color='#444444' face='굴림'>
								<b>
									<xsl:value-of select="APPROVALREQ/grid_appbugt1_summary2" />
								</b>
							</font>
						</td>
					</tr>

					<tr>
						<td class="body">

							<table class="aprinnertable" width="100%">

								<tr>
									<td width='15%' class='title'>대비목</td>
									<td width='18%' class='title'>비목</td>
									<td width='13%' class='title'>정부출연금</td>
									<td width='13%' class='title'>기업현금</td>
									<td width='13%' class='title'>기업현물</td>
									<td width='13%' class='title'>기타</td>
									<td width='15%' class='title'>합계</td>
								</tr>

								<xsl:for-each select="APPROVALREQ/docBugt/vector/data">
									<tr>
										<td class='contant'>
											<xsl:value-of select="msgResAppBugt/itm_nm" />
										</td>  <!-- 대비목 -->
										<td class='contant'>
											<xsl:value-of select="msgResAppBugt/bugt_item_nm" />
										</td>  <!-- 비목 -->
										<td class='contant-right'>
											<xsl:value-of select="format-number(msgResAppBugt/gov_cntrbamt    , '###,###,###,##0')" />
										</td>  <!-- 정부출연금 -->
										<td class='contant-right'>
											<xsl:value-of select="format-number(msgResAppBugt/cmpy_cash       , '###,###,###,##0')" />
										</td>  <!-- 기업현금 -->
										<td class='contant-right'>
											<xsl:value-of select="format-number(msgResAppBugt/cmpy_goods      , '###,###,###,##0')" />
										</td>  <!-- 기업현물 -->
										<td class='contant-right'>
											<xsl:value-of
												select="format-number(number(msgResAppBugt/contpat_goods)  +
                                                                                             number(msgResAppBugt/local_gov_cash) +
                                                                                             number(msgResAppBugt/univ_cash)      +
                                                                                             number(msgResAppBugt/etc_cash), '###,###,###,##0')" />
										</td>  <!-- (기타)(상대국현물+지방정부현금+대학현금+기타현금) -->
										<td class='contant-right'>
											<xsl:value-of select="format-number(msgResAppBugt/col_sum         , '###,###,###,##0')" />
										</td>  <!-- 합계 -->
									</tr>
								</xsl:for-each>

								<tr>
									<td colspan='2' class='title'>합계</td>       <!-- 합계 -->
									<td class='contant-right'>
										<xsl:value-of select="format-number(APPROVALREQ/gov_cntrbamt_sum, '###,###,###,##0')" />
									</td>  <!-- (누적)정부출연금 -->
									<td class='contant-right'>
										<xsl:value-of select="format-number(APPROVALREQ/cmpy_cash_sum   , '###,###,###,##0')" />
									</td>  <!-- (누적)기업현금 -->
									<td class='contant-right'>
										<xsl:value-of select="format-number(APPROVALREQ/cmpy_goods_sum  , '###,###,###,##0')" />
									</td>  <!-- (누적)기업현물 -->
									<td class='contant-right'>
										<xsl:value-of select="format-number(APPROVALREQ/etc_sum_sum     , '###,###,###,##0')" />
									</td>  <!-- (누적)(기타)(상대국현물+지방정부현금+대학현금+기타현금) -->
									<td class='contant-right'>
										<xsl:value-of select="format-number(APPROVALREQ/tot_col_sum     , '###,###,###,##0')" />
									</td>  <!-- (누적)합계 -->
								</tr>

							</table>

						</td>
					</tr>

				</table>

				<!-- [D]연구비 (종료) -->

				<br />
				<br />

			</body>
	</xsl:template>

</xsl:stylesheet>
