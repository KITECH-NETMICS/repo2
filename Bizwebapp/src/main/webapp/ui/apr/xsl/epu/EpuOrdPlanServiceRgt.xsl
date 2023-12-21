<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
			<BODY onload="slFileDownload()">
				<script type="text/javascript">
				<![CDATA[
 					function openPurReqPop(tmpReqNo){
						uid = com.getLoginInfo('uid');
						var url = "https://nbiz.kitech.re.kr/websquare/popup.html?w2xPath=/ui/apr/layoutSimple.xml&amp;amp;reqNo="+tmpReqNo+"&amp;amp;endpoint="+uid+"&amp;amp;viewMode=read";
						url = url.replaceAll("amp;","");
						window.open(url,"구매요구번호확인","scrollbars=yes,toolbar=no,location=no,status=no,menubar=no,resizable=yes,width=900,height=800,left=100,top=100");
					}
					
					function openContrctNoPop(tmpContrctNo,oldChngSeqG2b){
						uid = com.getLoginInfo('uid');
						var url = "https://nbiz.kitech.re.kr/websquare/popup.html?w2xPath=/ui/apr/layoutSimple.xml&amp;amp;reqNo="+tmpContrctNo+"-"+oldChngSeqG2b+"&amp;amp;endpoint="+uid+"&amp;amp;viewMode=read";
						url = url.replaceAll("amp;","");
						window.open(url,"실행예산편성변경","scrollbars=yes,toolbar=no,location=no,status=no,menubar=no,resizable=yes,width=900,height=800,left=100,top=100");
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
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="selectOrd/msgEpuOrd/bid_ord_no" />
									</td>
									<td class='title2' width="20%">구매요구 내용확인</td>
									<td class="body">
										<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
											<xsl:for-each select="selectOrd/selectPurReq/vector/data/msgPurDoc">
												<TR>
													<TD class="contant">
														<a style="color: #0000FF;">
															<xsl:attribute name="href">javascript:openPurReqPop('<xsl:value-of select="pur_req_no" />')</xsl:attribute>
															<xsl:value-of select="pur_req_no" />
															확인
														</a>
													</TD>
												</TR>
											</xsl:for-each>
										</TABLE>
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">공고진행방법</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="selectOrd/msgEpuOrd/opnway_nm" />
									</td>
									<td class='title2' width="20%">긴급입찰여부</td>
									<td class="contant">
										<xsl:value-of select="selectOrd/msgEpuOrd/emerbidy_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">용역명</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="selectOrd/msgEpuOrd/bid_title" />
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
									<td class='title'>한글품명</td>
									<td class='title'>품목코드</td>
									<td class='title'>단위</td>
									<td class='title'>수량</td>
									<td class='title'>추정단가</td>
									<td class='title'>부가세</td>
									<td class='title'>부대비</td>
									<td class='title'>추정금액</td>
								</tr>
								<xsl:for-each select="selectOrd/selectPurReq/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="msgEpuPurReq/item_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgEpuPurReq/item_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgEpuPurReq/unit_cd" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgEpuPurReq/qty, '#,###,###,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgEpuPurReq/req_unit_price, '#,###,###,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgEpuPurReq/req_time_addtax_extexpns, '#,###,###,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgEpuPurReq/incidntl_expns, '#,###,###,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgEpuPurReq/req_amt, '#,###,###,###')" />
										</td>
									</tr>
								</xsl:for-each>
								<tr>
									<td class='title2' colspan="3">합 계(추정금액)</td>
									<td class='contant' colspan="4"/>
									<td class="contant-right">
										<xsl:value-of select="format-number(selectOrd/msgEpuOrd/subtotal_num, '#,###,###,###')" />
									</td>
								</tr>
								<tr>
									<td class='title2' colspan="3">부 가 세</td>
									<td class='contant' colspan="4"/>
									<td class="contant-right" >
										<xsl:value-of select="format-number(selectOrd/msgEpuOrd/vat_num, '#,###,###,###')" />
									</td>
								</tr>
								<tr>
									<td class='title2' colspan="3">부 대 비</td>
									<td class='contant' colspan="4"/>
									<td class="contant-right">
										<xsl:value-of select="format-number(selectOrd/msgEpuOrd/incidntl_expns, '#,###,###,###')" />
									</td>
								</tr>
								<tr>
									<td class='title2' colspan="3">총   액</td>
									<td class='contant' colspan="4"/>
									<td class="contant-right">
										<xsl:value-of select="format-number(selectOrd/msgEpuOrd/total_num, '#,###,###,###')" />
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
								<xsl:if test="selectOrd/msgEpuOrd/divYn = 'N'">
									<xsl:for-each select="selectOrd/selectAccntApr/vector/data">
										<tr>
											<td class="contant-center">
												<xsl:value-of select="msgCntAccnt/accnt_no" />
											</td>
											<td class="contant">
												<xsl:value-of select="msgCntAccnt/accnt_no_nm" />
												(
												<xsl:value-of select="msgCntAccnt/accnt_no_cls_ymd" />
												)
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgCntAccnt/accnt_respn_psn_empnm" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgCntAccnt/accnt_cd" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgCntAccnt/expns_cd" />
												(
												<xsl:value-of select="msgCntAccnt/expns_cd_nm" />
												)
											</td>
											<td class="contant-right">
												<xsl:value-of select="format-number(msgCntAccnt/accnt_demnd_amt, '#,###')" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgCntAccnt/ctrl_no" />
											</td>
										</tr>
									</xsl:for-each>
								</xsl:if>
								<xsl:if test="selectOrd/msgEpuOrd/divYn != 'N'">
									<xsl:for-each select="selectOrd/selectAccntApr/vector/data">
										<tr>
											<td class="contant-center">
												<xsl:value-of select="msgCntAccnt/accnt_no" />
											</td>
											<td class="contant">
												<xsl:value-of select="msgCntAccnt/accnt_no_nm" />
												(
												<xsl:value-of select="msgCntAccnt/accnt_no_cls_ymd" />
												)
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgCntAccnt/accnt_respn_psn_empnm" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgCntAccnt/accnt_cd" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgCntAccnt/expns_cd" />
												(
												<xsl:value-of select="msgCntAccnt/expns_cd_nm" />
												)
											</td>
											<td class="contant-right">
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgCntAccnt/ctrl_no" />
											</td>
										</tr>
									</xsl:for-each>
								</xsl:if>
							</table>
						</td>
					</tr>
				</table>
				<xsl:if test="selectOrd/msgEpuOrd/check_bid_succ != 'Y-PRB'">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 계약 및 입찰방식</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<tr>
										<td class='title2' width="20%">계약방법</td>
										<td class="contant" style="width: 218.47px;">
											<xsl:value-of select="selectOrd/msgEpuOrd/contrctmethoditem_nm" />
											 / 
											<xsl:value-of select="selectOrd/msgEpuOrd/met_nm" />
										</td>
										<td class='title2' width="20%">입찰방식</td>
										<td class="contant">
											<xsl:value-of select="selectOrd/msgEpuOrd/bidsucctype_nm" />
										</td>
									</tr>
									<xsl:if test="selectOrd/msgEpuOrd/check_bid_succ != 'Y'">
										<tr>
											<td class='title2' width="20%">낙찰방법</td>
											<td class="contant">
												<xsl:value-of select="selectOrd/msgEpuOrd/bidsucmethoditem_nm" />
											</td>
											<td class='title2' width="20%">재입찰 가능여부</td>
											<td class="contant">
												<xsl:value-of select="selectOrd/msgEpuOrd/rebidpossibleyn_nm" />
											</td>
										</tr>
										<tr>
											<td class='title2' width="20%">낙찰하한율</td>
											<td class="contant" colspan="3">
												<xsl:if test="selectOrd/msgEpuOrd/succ_min_rate != '0.00000'">
													<xsl:value-of select="selectOrd/msgEpuOrd/succ_min_rate" />
												</xsl:if>
											</td>
										</tr>
										<tr>
											<td class='title2' width="20%">PQ심사여부</td>
											<td class="contant" style="width: 218.47px;">
												<xsl:value-of select="selectOrd/msgEpuOrd/radiopqynitem_nm" />
											</td>
											<td class='title2' width="20%">PQ기준점수</td>
											<td class="contant">
												<xsl:value-of select="selectOrd/msgEpuOrd/pq_score" />
											</td>
										</tr>
										<tr>
											<td class='title2' width="20%">입찰설명회여부</td>
											<td class="contant" style="width: 218.47px;">
												<xsl:value-of select="selectOrd/msgEpuOrd/bidexpnynitem_nm" />
											</td>
											<td class='title2' width="20%">입찰설명회장소</td>
											<td class="contant">
												<xsl:value-of select="selectOrd/msgEpuOrd/bid_expl_loc" />
											</td>
										</tr>
										<tr>
											<td class='title2' width="20%">입찰참가자격</td>
											<td class="contant" colspan="3">
												<xsl:value-of select="selectOrd/msgEpuOrd/apply_lic_remark" />
											</td>
										</tr>
									</xsl:if>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				
				<xsl:if test="selectOrd/msgEpuOrd/bidsucctype_cd = '06'">
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 지명업체</td>
					</tr>
					<tr>
						<td class="body">
							<xsl:for-each select="selectOrd/selectBidNomi/vector/data">				
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="20%">거래처명</td>
									<td class="contant">
										<xsl:value-of select="msgEpuOrdBidNom2/vend_nm" />
									</td>
									<td class='title2' width="20%">대표자명</td>
									<td class="contant">
										<xsl:value-of select="msgEpuOrdBidNom2/ceo_nm" />
									</td>
								</tr>
								<tr>
										<td class='title2' width="20%">사업자등록번호</td>
										<td class="contant" colspan="3">
											<xsl:value-of select="msgEpuOrdBidNom2/bsns_psn_regst_no" />
										</td>
									</tr>
							</table>
							</xsl:for-each>
						</td>
					</tr>
				</table>
				</xsl:if>

				<xsl:if test="selectOrd/msgEpuOrd/check_bid_succ = 'N'">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 입찰진행</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<tr>
										<td class='title2' width="20%">입찰설명회 일시</td>
										<td class="contant" colspan="3">
											<xsl:if test="normalize-space(selectOrd/msgEpuOrd/bid_expl_ymd) != ''">
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_expl_ymd, 1, 4)" />
												-
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_expl_ymd, 5, 2)" />
												-
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_expl_ymd, 7, 2)" />
												&#160;
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_expl_ymd, 9, 2)" />
												:
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_expl_ymd, 11, 2)" />
											</xsl:if>
										</td>
									</tr>
									<tr>
										<td class='title2' width="20%">입찰서접수개시일시</td>
										<td class="contant" style="width: 218.47px;">
											<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_start_ymd, 1, 4)" />
											-
											<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_start_ymd, 5, 2)" />
											-
											<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_start_ymd, 7, 2)" />
											&#160;
											<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_start_ymd, 9, 2)" />
											:
											<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_start_ymd, 11, 2)" />
										</td>
										<td class='title2' width="20%">입찰서접수마감일시</td>
										<td class="contant">
											<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_end_ymd, 1, 4)" />
											-
											<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_end_ymd, 5, 2)" />
											-
											<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_end_ymd, 7, 2)" />
											&#160;
											<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_end_ymd, 9, 2)" />
											:
											<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_end_ymd, 11, 2)" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="20%">개찰(입찰)일시</td>
										<td class="contant" colspan="3">
											<xsl:value-of select="substring(selectOrd/msgEpuOrd/open_ymd, 1, 4)" />
											-
											<xsl:value-of select="substring(selectOrd/msgEpuOrd/open_ymd, 5, 2)" />
											-
											<xsl:value-of select="substring(selectOrd/msgEpuOrd/open_ymd, 7, 2)" />
											&#160;
											<xsl:value-of select="substring(selectOrd/msgEpuOrd/open_ymd, 9, 2)" />
											:
											<xsl:value-of select="substring(selectOrd/msgEpuOrd/open_ymd, 11, 2)" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="20%">
											입찰참가등록
											<br />
											마감일시
										</td>
										<td class="contant" style="width: 218.47px;">
											<xsl:if test="normalize-space(selectOrd/msgEpuOrd/bid_apply_end_ymd) != ''">
												<xsl:value-of select="substring (selectOrd/msgEpuOrd/bid_apply_end_ymd, 1, 4)" />
												-
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_apply_end_ymd, 5, 2)" />
												-
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_apply_end_ymd, 7, 2)" />
												&#160;
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_apply_end_ymd, 9, 2)" />
												:
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_apply_end_ymd, 11, 2)" />
											</xsl:if>
										</td>
										<td class='title2' width="20%">
											입찰보증서접수
											<br />
											마감일시
										</td>
										<td class="contant">
											<xsl:if test="normalize-space(selectOrd/msgEpuOrd/bid_gurnt_fin_ymd) != ''">
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_gurnt_fin_ymd, 1, 4)" />
												-
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_gurnt_fin_ymd, 5, 2)" />
												-
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_gurnt_fin_ymd, 7, 2)" />
												&#160;
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_gurnt_fin_ymd, 9, 2)" />
												:
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/bid_gurnt_fin_ymd, 11, 2)" />
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
											<xsl:if test="selectOrd/msgEpuOrd/joinynitem_nm != '없음'">
												<xsl:value-of select="selectOrd/msgEpuOrd/joinynitem_nm" />
												&#160;
												<xsl:value-of select="selectOrd/msgEpuOrd/joinmethoditem_nm" />
											</xsl:if>
											<xsl:if test="selectOrd/msgEpuOrd/joinynitem_nm = '없음'">
												해당사항 없음
											</xsl:if>
										</td>
										<td class='title2' width="20%">
											공동수급협정서
											<br />
											접수마감일시
										</td>
										<td class="contant">
											<xsl:if test="normalize-space(selectOrd/msgEpuOrd/join_agr_fin_ymd) != ''">
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/join_agr_fin_ymd, 1, 4)" />
												-
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/join_agr_fin_ymd, 5, 2)" />
												-
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/join_agr_fin_ymd, 7, 2)" />
												&#160;
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/join_agr_fin_ymd, 9, 2)" />
												:
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/join_agr_fin_ymd, 11, 2)" />
											</xsl:if>
										</td>
									</tr>
									<tr>
										<td class='title2' width="20%">
											PQ심사신청서
											<br />
											접수방식
										</td>
										<td class="contant" style="width: 218.47px;">
											<xsl:value-of select="selectOrd/msgEpuOrd/pqevalrcptype_nm" />
										</td>
										<td class='title2' width="20%">
											PQ심사신청서
											<br />
											접수기한
										</td>
										<td class="contant">
											<xsl:if test="normalize-space(selectOrd/msgEpuOrd/pq_eval_rcp_end_ymd) != ''">
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/pq_eval_rcp_end_ymd, 1, 4)" />
												-
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/pq_eval_rcp_end_ymd, 5, 2)" />
												-
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/pq_eval_rcp_end_ymd, 7, 2)" />
												&#160;
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/pq_eval_rcp_end_ymd, 9, 2)" />
												:
												<xsl:value-of select="substring(selectOrd/msgEpuOrd/pq_eval_rcp_end_ymd, 11, 2)" />
											</xsl:if>
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
											<xsl:value-of select="selectOrd/msgEpuOrd/limitloc_nm" />
										</td>
										<td class='title2' width="20%">지역제한(지사/지점)</td>
										<td class="contant">
											<xsl:value-of select="selectOrd/msgEpuOrd/tenderyn_nm" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="20%">업종제한</td>
										<td class="contant" colspan="3">
											<xsl:value-of select="selectOrd/msgEpuOrd/limitcategory_nm" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="20%">
											공동수급체 구성원
											<br />
											지역제한적용여부
										</td>
										<td class="contant" colspan="3">
											<xsl:if test="selectOrd/msgEpuOrd/joinmemloclimityn_nm != ''">
												<xsl:value-of select="selectOrd/msgEpuOrd/joinmemloclimityn_nm" />
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
									<td class="contant" colspan="3">
										<xsl:value-of select="selectOrd/msgEpuOrd/multiestiynitem_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">배정금액</td>
									<td class="contant-right" style="width: 218.47px;">
										<xsl:value-of select="format-number(selectOrd/msgEpuOrd/assign_amount, '#,###,###,###')" />
									</td>
									<td class='title2' width="20%">추정가격</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(selectOrd/msgEpuOrd/budget_amt, '#,###,###,###')" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">기초금액</td>
									<td class="contant-right" colspan="3">
										<xsl:if test="selectOrd/msgEpuOrd/desing_amt != ''">
											<xsl:value-of select="format-number(selectOrd/msgEpuOrd/desing_amt, '#,###,###,###')" />
										</xsl:if>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<xsl:if test="count(selectOrd/fileList_A/vector/data/mdata)!=0">
					<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
						<TR>
							<TD class="head" align="left">원가계산 근거 첨부파일</TD>
						</TR>
						<TR>
							<TD class="body">
								<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<xsl:for-each select="selectOrd/fileList_A/vector/data/mdata">
										<TR>
											<TD class="contant">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
											</TD>
										</TR>
									</xsl:for-each>
								</TABLE>
							</TD>
						</TR>
					</TABLE>
				</xsl:if>
				<xsl:if test="count(selectOrd/fileList_B/vector/data/mdata)!=0">
					<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
						<TR>
							<TD class="head" align="left">첨부파일</TD>
						</TR>
						<TR>
							<TD class="body">
								<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<xsl:for-each select="selectOrd/fileList_B/vector/data/mdata">
										<TR>
											<TD class="contant">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
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