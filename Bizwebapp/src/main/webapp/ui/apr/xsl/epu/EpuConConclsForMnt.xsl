<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="APPROVAL">
		<xsl:variable name="localPath" select="request/localPath" />
			<BODY>
				<script type="text/javascript">
				<![CDATA[
					function createForm(nm, tg, act, met) {
						var cForm = document.createElement("form");
						cForm.name = nm;
						cForm.target = tg;
						cForm.action = act;
						cForm.method = met;
						
						return cForm;
					}
					
					function createHidden(nm, val, frm) {
						/*IE9, IE10, 크롬 등에서 호환성 보기 없이 실행되도록 보완(2013.07.29)*/
						var	hiddenInput	=	document.createElement("input");
						
						/*
						hiddenInput.type="hidden";
						hiddenInput.name=nm;
						hiddenInput.value=val;
						frm.insertBefore(hiddenInput);
 						*/
 						
						hiddenInput.setAttribute("type", "hidden");
						hiddenInput.setAttribute("name", nm);
						hiddenInput.setAttribute("value", val);
						frm.appendChild(hiddenInput);
						
						return frm;
					}
					
 					/* 특정구매사유서 팝업 */
					function openPurReqSpcficPop (pPurReqNo, pCn, pSn, pBizoucode, pMaxStateCd, pAccntNo, pGdnm, pEstiAmt, pDelvrDemndDaycnt) {
						window.open("","spcfic89",'width=1023,height=460,top=50,left=150');
						
						var idx = (new Date()).getTime() + Math.random() * 10000;
						var frm = createForm("popFrm", "spcfic89", "https://biz.kitech.re.kr/websquare/popup.html", "get");
						frm = createHidden("w2xPath", "/kitech/pur/req/PurReqSpcficPop.xml", frm);
						frm = createHidden("popupID", "spcfic89", frm);
						frm = createHidden("idx", idx, frm);
						frm = createHidden("w2xHome", "/kitech/pur/req/", frm);
						frm = createHidden("purReqNo", pPurReqNo, frm);
						frm = createHidden("cn", pCn, frm);
						frm = createHidden("sn", pSn, frm);
						frm = createHidden("bizoucode", pBizoucode, frm);
						frm = createHidden("serviceId", "P104", frm);
						
						if ( pMaxStateCd == "" ) {
							frm = createHidden("maxStateCd", "XAD100", frm);
						} else {
							frm = createHidden("maxStateCd", pMaxStateCd, frm);
						}
						
						frm = createHidden("accntNo", pAccntNo, frm);
						frm = createHidden("gdnm", pGdnm, frm);
						frm = createHidden("estiAmt", pEstiAmt, frm);
						frm = createHidden("delvrDemndDaycnt", pDelvrDemndDaycnt, frm);
						frm = createHidden("requestFlag", "H", frm);			/* 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						document.body.appendChild(frm);
						frm.submit();
					}
					
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
					
					function openNotiNoPop(bid_ord_no, ord_chg_no, bid_noti_no, chg_no){
						var eval_state = "PRD070";
						var eval_clsf_cd = "PRC020";
			
						window.open("","NotiNoPop",'scrollbars=yes,resizable=yes,width=1050,height=800,top=50,left=150',"_blank");
						var frm = createForm("popFrm", "NotiNoPop", "https://biz.kitech.re.kr/websquare/popup.html", "get");
						frm = createHidden("w2xPath", "/kitech/epu/bid/tec/EpuBidTechEvalCoopMnt.xml", frm);
						frm = createHidden("popupID", "NotiNoPop", frm);
						frm = createHidden("w2xHome", "/kitech/epu/bid/tec/", frm);
						
						frm = createHidden("bid_ord_no", bid_ord_no, frm);
						frm = createHidden("eval_state", eval_state, frm);
						frm = createHidden("eval_clsf_cd", eval_clsf_cd, frm);
						frm = createHidden("ord_chg_no", ord_chg_no, frm);
						frm = createHidden("chg_no", chg_no, frm);
						frm = createHidden("bid_noti_no", bid_noti_no, frm);
						frm = createHidden("serviceId", "P384", frm);
						frm = createHidden("requestFlag", "W", frm); /* 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						document.body.appendChild(frm);
						frm.submit();
						
					}				
				]]>
				</script>
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
								<xsl:if test="divYn = 'N'">
									<xsl:for-each select="selectCntAccnt/vector/data">
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
											<td class="contant-right" style="text-align:right;">
												<xsl:value-of select="format-number(msgCntAccnt/accnt_demnd_amt, '#,###')" />
											</td>
											<td class="contant-center">
												<xsl:value-of select="msgCntAccnt/ctrl_no" />
											</td>
										</tr>
									</xsl:for-each>
								</xsl:if>
								<xsl:if test="divYn != 'N'">
									<xsl:for-each select="selectCntAccnt/vector/data">
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
											<td class="contant-right"></td>
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
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 계약물품명세서 </td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title'>영문품명</td>
									<td class='title'>Hscode</td>
									<td class='title'>공급가</td>
									<td class='title' colspan ='2'>계약시환율</td>
									<td class='title'>공급가(원)</td>
									<td class='title'>부대금액(원)</td>

								</tr>
								<tr>
									<td class='title'>한글품명</td>
									<td class='title'>모델명</td>
									<td class='title'>단가</td>
									<td class='title'>수량</td>
									<td class='title'>단위</td>
									<td class='title'>local금액</td>
									<td class='title'>합계(원)</td>

								</tr>
								<xsl:for-each select="selectItem/vector/data">
									<tr>
										<td class="contant-center" style="width: 170px;">
											<xsl:value-of select="msgEpuConItem/eng_gdnm" />
										</td>
										<td class="contant-center" style="width: 170px;">
											<xsl:value-of select="msgEpuConItem/hs_no" />
										</td>
										<td class="contant-center" style="text-align:right;">
											(<xsl:value-of select="msgEpuConItem/contrct_time_curncy_unit" />)
											<xsl:value-of select="format-number(msgEpuConItem/contrct_time_exchgr_amt, '#,###,###.###')" />
										</td>
										<td class="contant-center" style="text-align:right;" colspan='2'>
											<xsl:if test="msgEpuConItem/contrct_time_exchgr != ''">
												<xsl:value-of select="format-number(msgEpuConItem/contrct_time_exchgr, '#,###,###.00')" />
											</xsl:if>
										</td>
										<td class="contant-center" style="text-align:right;">
											<xsl:value-of select="format-number(msgEpuConItem/convsn_amt, '#,###,###')" />
										</td>
										<td class="contant-center" style="text-align:right;">
											<xsl:value-of select="format-number(msgEpuConItem/contrct_time_addtax_extexpns, '#,###,###')" />
										</td>
									</tr>
									<tr>
										<td class="contant-center" style="width: 170px;">
											<xsl:value-of select="msgEpuConItem/krchar_gdnm" />
										</td>
										<td class="contant" style="width: 170px;">
											<xsl:value-of select="msgEpuConItem/model_nm" />
										</td>
										<td class="contant-center" style="text-align:right;">
											(<xsl:value-of select="msgEpuConItem/contrct_time_curncy_unit" />)
											<xsl:value-of select="format-number(msgEpuConItem/unit_price, '#,###,###.###')" />
										</td>
										<td class="contant-center" style="text-align:right;">
											<xsl:value-of select="format-number(msgEpuConItem/qty, '#,###,###.###')" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgEpuConItem/unit_desc" />
										</td>
										<td class="contant-center" style="text-align:right;">
											<xsl:value-of select="format-number(msgEpuConItem/region_amt, '#,###,###')" />
										</td>
										<td class="contant-center" style="text-align:right;color: #0000FF;">
											<xsl:value-of select="format-number(msgEpuConItem/contrct_amt, '#,###,###')" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">계약상대자</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<xsl:for-each select="selectCntVend/vector/data">
									<tr>
										<td class='title2' width="20%">상호</td>
										<td class="contant" style="width: 218.47px;">
											<xsl:value-of select="msgEpuConVend/vend_nm" />
										</td>
										<td class='title2' width="20%">대표자</td>
										<td class="contant">
											<xsl:value-of select="msgEpuConVend/reprs_psn" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="20%">주소</td>
										<td class="contant" colspan="3">
											<xsl:value-of select="msgEpuConVend/contrct_psn_addr" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="20%">사업자등록번호</td>
										<td class="contant" style="width: 218.47px;">
											<xsl:value-of select="msgEpuConVend/bsns_psn_regst_no" />
										</td>
										<td class='title2' width="20%">법인등록번호</td>
										<td class="contant">
											<xsl:value-of select="msgEpuConVend/corp_regst_no" />
										</td>
									</tr>
									<tr>
										<td class='title2' width="20%">전화번호</td>
										<td class="contant" style="width: 218.47px;">
											<xsl:value-of select="msgEpuConVend/tel" />
										</td>
										<td class='title2' width="20%">팩스번호</td>
										<td class="contant">
											<xsl:value-of select="msgEpuConVend/fax_no" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">계약서</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="20%">계약번호</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:if test="chng_seq_g2b != '00' ">
											<a style="color: #0000FF;">
												<xsl:attribute name="href">javascript:openContrctNoPop('<xsl:value-of select="contrct_no_g2b" />','<xsl:value-of select="old_chng_seq_g2b" />')</xsl:attribute>
											<xsl:value-of select="contrct_no_g2b" />
											</a>
										</xsl:if>
										<xsl:if test="chng_seq_g2b = '00' ">
											<xsl:value-of select="contrct_no_g2b" />
										</xsl:if>
									</td>
									<td class='title2' width="20%">구매요구 내용확인</td>
									<td class="contant">
										<a style="color: #0000FF;">
											<xsl:attribute name="href">javascript:openPurReqPop('<xsl:value-of select="pur_req_no" />')</xsl:attribute>
											<xsl:value-of select="pur_req_no" />
											확인
										</a>
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">계약건명</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="contrct_nm" />
									</td>
									<td class='title2' width="20%">발주계획 내용확인</td>
									<td class="contant">
										<a style="color: #0000FF;">
											<xsl:attribute name="href">javascript:openContrctNoPop('<xsl:value-of select="bid_ord_no" />','<xsl:value-of select="ord_chg_no" />')</xsl:attribute>
											<xsl:value-of select="bid_ord_no" /> 확인
										</a>
									</td>								</tr>
								<tr>
									<td class='title2' width="20%">계약금액(원)</td>
									<xsl:if test="epu_tec_cnt = '' ">
										<td class="contant" style="text-align:right;" colspan="3">
											<xsl:value-of select="format-number(contrct_tot_amt, '#,###,###')" />
										</td>
									</xsl:if>
									<xsl:if test="epu_tec_cnt != '' ">
									<td class="contant" style="text-align:right;">
										<xsl:value-of select="format-number(contrct_tot_amt, '#,###,###')" />
									</td>
									<td class='title2' width="20%">기술평가 내용확인</td>
									<td class="contant">
											<a style="color: #0000FF;">
												<xsl:attribute name="href">javascript:openNotiNoPop('<xsl:value-of select="bid_ord_no" />','<xsl:value-of select="ord_chg_no" />','<xsl:value-of select="bid_noti_no" />','<xsl:value-of select="chg_no" />')</xsl:attribute>
												<xsl:value-of select="bid_noti_no" /> 확인
											</a>
									</td>	
									</xsl:if>								
								</tr>
								
								<tr>
									<td class="title2" width="20%">Offer-No</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="focpt_no" />
									</td>
									<td class="title2" width="20%">Offer일</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="focpt_ymd" />
									</td>
								</tr>
								<tr>
									<td class="title2" width="20%">하자기간</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:if test="dfct_guarnt_prd != ''">
											<xsl:value-of select="dfct_guarnt_prd" />개월 &#160;
										</xsl:if>
										<xsl:if test="dfct_gurnt_start_ymd != ''">
											<xsl:value-of select="dfct_gurnt_start_ymd" />
											~
											<xsl:value-of select="dfct_gurnt_cls_ymd" />
										</xsl:if>
									</td>
									<td class="title2" width="20%">하자보증율</td>
									<td class="contant" style="width: 218.47px;text-align:right;">
										<xsl:value-of select="dfct_gurnt_mny_rt" />
									</td>
								</tr>
								<tr>
									<td class="title2" width="20%">1차 입찰일자</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="bid_ymd_1_gap" />
									</td>
									<td class="title2" width="20%">2차 입찰일자</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="bid_ymd_2_gap" />
									</td>
								</tr>
								<tr>
									<td class="title2" width="20%">공급기간</td>
									<td class="contant" style="width: 218.47px;" colspan="3">
										<xsl:value-of select="suply_time_start_ymd" />
										~
										<xsl:value-of select="suply_time_cls_ymd" />
									</td>
								</tr>
								<tr>
									<td class="title2" width="20%">선적예정일</td>
									<td class="contant" style="width: 218.47px;" colspan="3">
										<xsl:value-of select="focpt_delvr_close_day" />
									</td>
								</tr>								
								<tr>
									<td class="title2" width="20%">지체상금률</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="delay_add_mny_rt" />
										%
									</td>
									<td class="title2" width="20%">지체상금액(원)</td>
									<td class="contant" style="width: 218.47px;text-align:right;">
										<xsl:value-of select="format-number(delay_add_amt, '#,###,###,###')" />
									</td>
								</tr>
								<tr>
									<td class="title2" width="20%">공급자</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="focpt_suply_psn" />
									</td>
									<td class="title2" width="20%">제조자</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="focpt_mfg_psn" />
									</td>
								</tr>
								<tr>
									<td class="title2" width="20%">운송방법</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="trnspt_way_nm" />
									</td>
									<td class="title2" width="20%">납품예정일</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="delvr_schdl_ymd" />
									</td>
								</tr>
								<tr>
									<td class="title2" width="20%">보증금 내역</td>
									<td class="contant">
										<xsl:value-of select="gurnt_mny_detls_nm" />
									</td>
									<td class="title2" width="20%">안전장비포함 구매여부</td>
									<td class="contant">
										<xsl:value-of select="safety_yn" />
									</td>
								</tr>
								<tr>
									<td class="title2" width="20%">계약부서(코드)</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="delvrPlcNm" />
										(
										<xsl:value-of select="delvrPlcDeptVendCd" />
										)
									</td>
									<td class="title2" width="20%">가격조건</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="price_cond_nm" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<br />
				<xsl:if test="count(fileList_A/vector/data)!=0">
					<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
						<TR>
							<TD class="head" align="left" colspan='2'>계약용 첨부파일</TD>
						</TR>
						<TR>
							<TD class="body">
								<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<xsl:for-each select="fileList_A/vector/data/mdata">
										<TR>
											<TD class="contant"><xsl:value-of select="seq" /></TD>
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
				<xsl:if test="count(fileList_B/vector/data)!=0">
					<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
						<TR>
							<TD class="head" align="left" colspan='2'>재무용 첨부파일</TD>
						</TR>
						<TR>
							<TD class="body">
								<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<xsl:for-each select="fileList_B/vector/data/mdata">
										<TR>
											<TD class="contant"><xsl:value-of select="seq" /></TD>
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