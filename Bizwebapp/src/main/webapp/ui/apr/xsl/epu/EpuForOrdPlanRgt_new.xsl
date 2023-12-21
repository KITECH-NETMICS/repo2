<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
			<BODY>
				<script type="text/javascript">
					<![CDATA[
						function openPurReqPop(tmpReqNo){
							uid = com.getLoginInfo('uid');
							var url = "https://nbiz.kitech.re.kr/websquare/popup.html?w2xPath=/ui/apr/layoutSimple.xml&amp;amp;reqNo="+tmpReqNo+"&amp;amp;endpoint="+uid+"&amp;amp;viewMode=read";
							url = url.replaceAll("amp;","");
							window.open(url,"구매요구번호확인","scrollbars=yes,toolbar=no,location=no,status=no,menubar=no,resizable=yes,width=900,height=800,left=100,top=100");
						}						
					]]>
				</script>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 발주번호</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="20%">발주번호</td>
									<td class="contant">
										<xsl:value-of select="root/mastrVo/bid_ord_no" />
									</td>
									<td class='title2' width="20%">공고진행방법</td>
									<td class="contant">
										<xsl:value-of select="root/chkVo/bid_clsf_cd" />
									</td>
								</tr>
								<tr>
									<!-- 외자직거래일 경우에도 긴급입찰여부 표시될 수 있도록 수정 -->
									<td class='title2' width="20%">긴급입찰여부</td>
									<td class="contant">
										<xsl:value-of select="root/chkVo/emer_bid_yn" />
									</td>
									<td class='title2' width="20%">부가세포함여부</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="root/chkVo/vat_include_yn" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">공고명</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="root/mastrVo/bid_title" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">비고</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="root/mastrVo/remark" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 물품정보 </td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title'>품명</td>
									<td class='title'>단위</td>
									<td class='title'>수량</td>
									<td class='title'>추정단가</td>
									<td class='title'>환율</td>
									<td class='title'>화폐단위</td>
									<td class='title'>추정금액</td>
									<td class='title'>부대비/부가세</td>
									<td class='title'>합계</td>
								</tr>
								<tr>
									<td class='title'>코드한글품목명</td>
									<td class='title' colspan='3'>품목코드</td>
									<td class='title' colspan='4'>비고</td>
									<td class='title'>구매요구번호</td>

								</tr>
								<xsl:variable name="req_amt_sum" select="sum(root/itemList/req_amt)" />
								<xsl:variable name="addtax_sum" select="sum(root/itemList/req_time_addtax_extexpns)" />
								<xsl:for-each select="root/itemList">
									<tr>
										<td class="contant">
											<xsl:value-of select="item_nm " />
										</td>
										<td class="contant-center">
											<xsl:value-of select="unit_cd" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(qty, '#,###,###,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(req_unit_price, '#,###,###,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(req_time_exchgr, '#,###,###,###')" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="curncy_unit_nm" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(req_amt, '#,###,###,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(req_time_addtax_extexpns, '#,###,###,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(req_amt_sum, '#,###,###,###')" />
										</td>
									</tr>
									<tr>
										<td class="contant">
											<xsl:value-of select="p_item_nm" />
										</td>
										<td class="contant-center" colspan='3'>
											<xsl:value-of select="item_cd" />
										</td>
										<td class="contant" colspan='4'>
											<xsl:value-of select="rmk" />
										</td>
										<td class="contant-center">
											<a style="color:#0000FF;">
												<xsl:attribute name="href">javascript:openPurReqPop('<xsl:value-of select="pur_req_no" />')</xsl:attribute>
												<xsl:value-of select="pur_req_no" />
											</a>
										</td>
									</tr>
									<tr>
										<td></td>
									</tr>
								</xsl:for-each>
								<tr>
									<td class='title2' colspan="8">추정금액 합계</td>
									<td class="contant-right">
										<xsl:value-of select="format-number($req_amt_sum, '#,###,###,###')" />
									</td>
								</tr>
								<tr>
									<td class='title2' colspan="8">부대비(부가세)</td>
									<td class="contant-right">
										<xsl:value-of select="format-number($addtax_sum, '#,###,###,###')" />
									</td>
								</tr>
								<tr>
									<td class='title2' colspan="8">총액</td>
									<td class="contant-right">
										<xsl:value-of select="format-number($req_amt_sum+$addtax_sum, '#,###,###,###')" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 계정정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title'>계정번호</td>
									<td class='title' width="40%">계정명</td>
									<td class='title'>계정책임자</td>
									<td class='title'>회계코드</td>
									<td class='title'>비용코드명(코드)</td>
									<td class='title'>구매요청금액</td>
									<td class='title'>통제번호</td>
								</tr>
								<xsl:variable name="div_yn" select="root/chkVo/div_yn" />						
								<xsl:for-each select="root/accntList">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="accnt_no" />
										</td>
										<td class="contant">
											<xsl:value-of select="accnt_no_nm" />(<xsl:value-of select="apply_cls_ymd" />)
										</td>
										<td class="contant-center">
											<xsl:value-of select="accnt_respn_psn_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="accnt_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="expns_cd" />(<xsl:value-of select="expns_cd_nm" />)
										</td>
										<td class="contant-right">
											<xsl:if test="$div_yn = 'N'">
												<xsl:value-of select="format-number(accnt_demnd_amt, '###,###,###')" />
											</xsl:if>
										</td>
										<td class="contant-center">
											<xsl:value-of select="ctrl_no" />
										</td>
									</tr>
								</xsl:for-each>								
							</table>
						</td>
					</tr>
				</table>
				<xsl:if test="root/mastrVo/bid_clsf_cd != 'PRB050'">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 계약 및 입찰방식</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<tr>
										<td class='title2' width="20%">계약방법</td>
										<td class="contant" colspan="3">
											<xsl:value-of select="root/chkVo/contrct_method" />
											&#160;
											<xsl:value-of select="root/chkVo/bid_succ_method" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="20%">입찰방식</td>
										<td class="contant" style="width: 218.47px;">
											<xsl:value-of select="root/chkVo/bid_succ_type" />
										</td>
										<td class='title2' width="20%">재입찰 가능여부</td>
										<td class="contant">
											<xsl:value-of select="root/chkVo/rebid_possible_yn" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="20%">낙찰방법</td>
										<td class="contant" colspan="3">
											<xsl:value-of select="root/chkVo/succ_type" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="20%">낙찰하한율</td>
										<td class="contant" colspan="3">
											<xsl:if test="root/mastrVo/succ_min_rate = ''">
												없음
											</xsl:if>
											<xsl:if test="root/mastrVo/succ_min_rate != ''">
												<xsl:value-of select="root/mastrVo/succ_min_rate" />
											</xsl:if>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>

					<xsl:if test="root/mastrVo/bid_succ_type = '06'">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
							<tr>
								<td class="head"> 지명업체</td>
							</tr>
							<tr>
								<td class="body">
									<xsl:for-each select="root/vendList">
										<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
											<tr>
												<td class='title2' width="20%">거래처명</td>
												<td class="contant">
													<xsl:value-of select="vend_nm" />
												</td>
												<td class='title2' width="20%">대표자명</td>
												<td class="contant">
													<xsl:value-of select="ceo_nm" />
												</td>
											</tr>
											<tr>
												<td class='title2' width="20%">사업자등록번호</td>
												<td class="contant" colspan="3">
													<xsl:value-of select="bsns_psn_regst_no" />
												</td>
											</tr>
										</table>
									</xsl:for-each>
								</td>
							</tr>
						</table>
					</xsl:if>
					<xsl:if test="root/mastrVo/bid_clsf_cd != 'PRB060'">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
							<tr>
								<td class="head"> 입찰진행</td>
							</tr>
							<tr>
								<td class="body">
									<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
										<tr>
											<td class='title2' width="20%">입찰서접수개시일시</td>
											<td class="contant" style="width: 218.47px;">
												<xsl:value-of select="substring(root/mastrVo/bid_start_ymd, 1, 4)" />
												-
												<xsl:value-of select="substring(root/mastrVo/bid_start_ymd, 5, 2)" />
												-
												<xsl:value-of select="substring(root/mastrVo/bid_start_ymd, 7, 2)" />
												&#160;
												<xsl:value-of select="substring(root/mastrVo/bid_start_ymd, 9, 2)" />
												:
												<xsl:value-of select="substring(root/mastrVo/bid_start_ymd, 11, 2)" />
											</td>
											<td class='title2' width="20%">입찰서접수마감일시</td>
											<td class="contant">
												<xsl:value-of select="substring(root/mastrVo/bid_end_ymd, 1, 4)" />
												-
												<xsl:value-of select="substring(root/mastrVo/bid_end_ymd, 5, 2)" />
												-
												<xsl:value-of select="substring(root/mastrVo/bid_end_ymd, 7, 2)" />
												&#160;
												<xsl:value-of select="substring(root/mastrVo/bid_end_ymd, 9, 2)" />
												:
												<xsl:value-of select="substring(root/mastrVo/bid_end_ymd, 11, 2)" />
											</td>
										</tr>
										<tr>
											<td class='title2' width="20%">개찰(입찰)일시</td>
											<td class="contant" colspan="3">
												<xsl:value-of select="substring(root/mastrVo/open_ymd, 1, 4)" />
												-
												<xsl:value-of select="substring(root/mastrVo/open_ymd, 5, 2)" />
												-
												<xsl:value-of select="substring(root/mastrVo/open_ymd, 7, 2)" />
												&#160;
												<xsl:value-of select="substring(root/mastrVo/open_ymd, 9, 2)" />
												:
												<xsl:value-of select="substring(root/mastrVo/open_ymd, 11, 2)" />
											</td>
										</tr>
										<tr>
											<td class='title2' width="20%">
												입찰참가자격
												<br />
												등록마감일시
											</td>
											<td class="contant" style="width: 218.47px;">
												<xsl:if test="normalize-space(root/mastrVo/bid_apply_end_ymd) != ''">
													<xsl:value-of select="substring (root/mastrVo/bid_apply_end_ymd, 1, 4)" />
													-
													<xsl:value-of select="substring(root/mastrVo/bid_apply_end_ymd, 5, 2)" />
													-
													<xsl:value-of select="substring(root/mastrVo/bid_apply_end_ymd, 7, 2)" />
													&#160;
													<xsl:value-of select="substring(root/mastrVo/bid_apply_end_ymd, 9, 2)" />
													:
													<xsl:value-of select="substring(root/mastrVo/bid_apply_end_ymd, 11, 2)" />
												</xsl:if>
											</td>
											<td class='title2' width="20%">
												입찰보증서
												<br />
												접수마감일시
											</td>
											<td class="contant">
												<xsl:if test="normalize-space(root/mastrVo/bid_gurnt_fin_ymd) != ''">
													<xsl:value-of select="substring(root/mastrVo/bid_gurnt_fin_ymd, 1, 4)" />
													-
													<xsl:value-of select="substring(root/mastrVo/bid_gurnt_fin_ymd, 5, 2)" />
													-
													<xsl:value-of select="substring(root/mastrVo/bid_gurnt_fin_ymd, 7, 2)" />
													&#160;
													<xsl:value-of select="substring(root/mastrVo/bid_gurnt_fin_ymd, 9, 2)" />
													:
													<xsl:value-of select="substring(root/mastrVo/bid_gurnt_fin_ymd, 11, 2)" />
												</xsl:if>
											</td>
										</tr>
										<tr>
											<td class='title2' width="20%">
												공동수급협정서
												<br />
												접수 및 구성방식
											</td>
											<td class="contant" style="width: 218.47px;">
												<xsl:if test="root/chkVo/join_possible_yn != '없음'">
													<xsl:value-of select="root/chkVo/join_possible_yn" />
													&#160;
													<xsl:value-of select="root/chkVo/join_method" />
												</xsl:if>
												<xsl:if test="root/chkVo/join_possible_yn = '없음'">
													해당사항 없음
												</xsl:if>
											</td>
											<td class='title2' width="20%">
												공동수급협정서
												<br />
												접수마감일시
											</td>
											<td class="contant">
												<xsl:if test="normalize-space(root/mastrVo/join_agr_fin_ymd) != ''">
													<xsl:value-of select="substring(root/mastrVo/join_agr_fin_ymd, 1, 4)" />
													-
													<xsl:value-of select="substring(root/mastrVo/join_agr_fin_ymd, 5, 2)" />
													-
													<xsl:value-of select="substring(root/mastrVo/join_agr_fin_ymd, 7, 2)" />
													&#160;
													<xsl:value-of select="substring(root/mastrVo/join_agr_fin_ymd, 9, 2)" />
													:
													<xsl:value-of select="substring(root/mastrVo/join_agr_fin_ymd, 11, 2)" />
												</xsl:if>
											</td>
										</tr>
										<tr>
											<td class='title2' width="20%">
												동가입찰 낙찰자
												<br />
												자동추첨프로그램
											</td>
											<td class="contant" colspan="3">
												<xsl:value-of select="root/chkVo/same_suc_lot_program_yn" />
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
							<tr>
								<td class="head"> 투찰제한</td>
							</tr>
							<tr>
								<td class="body">
									<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
										<tr>
											<td class='title2' width="20%">지역제한</td>
											<td class="contant" style="width: 218.47px;">
												<xsl:value-of select="root/chkVo/limit_loc" />
											</td>
											<td class='title2' width="20%">지역제한(지사/지점)</td>
											<td class="contant">
												<xsl:value-of select="root/chkVo/tender_yn" />
											</td>
											<td class='title2' width="20%">업종제한</td>
											<td class="contant">
												<xsl:value-of select="root/chkVo/limit_category" />
											</td>
										</tr>
										<tr>
											<td class='title2' width="20%">물품분류제한여부</td>
											<td class="contant">
												<xsl:value-of select="root/chkVo/item_limit_yn" />
											</td>
											<td class='title2' width="20%">
												공동수급체 구성원
												<br />
												지역제한적용여부
											</td>
											<td class="contant" colspan="3">
												<xsl:if test="root/chkVo/join_mem_loc_limit_yn != ''">
													<xsl:value-of select="root/chkVo/join_mem_loc_limit_yn" />
												</xsl:if>
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</xsl:if>

					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 예가</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<tr>
										<td class='title2' width="20%">예가방식</td>
										<td class="contant" colspan="5">
											<xsl:value-of select="root/chkVo/multi_esti_pr_yn" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="20%">배정금액</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(root/mastrVo/assign_amount, '#,###,###,###')" />
										</td>
										<td class='title2' width="20%">추정가격</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(root/mastrVo/budget_amt, '#,###,###,###')" />
										</td>
										<td class='title2' width="20%">기초금액</td>
										<td class="contant-right" width="10%">
											<xsl:if test="root/mastrVo/desing_amt != '0'">
												<xsl:value-of select="format-number(root/mastrVo/desing_amt, '#,###,###,###')" />
											</xsl:if>
										</td>
									</tr>		
								</table>
							</td>
						</tr>
					</table>
					<xsl:if test="root/mastrVo/estipr_attach_file_no !=''">
						<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
							<TR>
								<TD class="head" align="left">원가계산 근거 첨부파일</TD>
							</TR>
							<TR>
								<TD class="body">
									<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
										<xsl:for-each select="root/fileList_A">
											<TR>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
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
												</TD>
											</TR>
										</xsl:for-each>
									</TABLE>
								</TD>
							</TR>
						</TABLE>
					</xsl:if>
				</xsl:if>
				<xsl:if test="root/mastrVo/attach_file_no !=''">
					<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
						<TR>
							<TD class="head" align="left">첨부파일</TD>
						</TR>
						<TR>
							<TD class="body">
								<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<xsl:for-each select="root/fileList_B">
										<TR>
											<TD class="contant">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />', 'XAA004')</xsl:attribute>
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
											</TD>
										</TR>
									</xsl:for-each>
								</TABLE>
							</TD>
						</TR>
					</TABLE>
				</xsl:if>
			</BODY>
	</xsl:template>
</xsl:stylesheet>