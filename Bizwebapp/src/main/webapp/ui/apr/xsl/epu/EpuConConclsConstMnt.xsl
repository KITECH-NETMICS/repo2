<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
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
								<xsl:if test="selectCnt/msgEpuConMnt/divYn = 'N'">
									<xsl:for-each select="selectCnt/selectCntAccnt/vector/data">
										<tr>
											<td class="contant-center">
												<xsl:value-of select="msgCntAccnt/accnt_no" />
											</td>
											<td class="contant">
												<xsl:value-of select="msgCntAccnt/accnt_no_nm" />
												(
												<xsl:value-of select="msgCntAccnt/cls_ymd" />
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
								<xsl:if test="selectCnt/msgEpuConMnt/divYn != 'N'">
									<xsl:for-each select="selectCnt/selectCntAccnt/vector/data">
										<tr>
											<td class="contant-center">
												<xsl:value-of select="msgCntAccnt/accnt_no" />
											</td>
											<td class="contant">
												<xsl:value-of select="msgCntAccnt/accnt_no_nm" />
												(
												<xsl:value-of select="msgCntAccnt/cls_ymd" />
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
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">계약상대자</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<xsl:for-each select="selectCnt/selectCntVend/vector/data">
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
										<xsl:if test="msgEpuConVend/vend_clsf = 'FBA001'">
											<td class='title2' width="20%">법인등록번호</td>
											<td class="contant">
												<xsl:value-of select="msgEpuConVend/corp_regst_no" />
											</td>
										</xsl:if>
										<xsl:if test="msgEpuConVend/vend_clsf != 'FBA001'">
											<td class='title2' width="20%">주민등록번호</td>
											<td class="contant">
												<xsl:value-of select="msgEpuConVend/contrct_psn_resid_regst_no" />
											</td>
										</xsl:if>
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
						<td class="head">공사 계약서</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="20%">전자계약 여부</td>
									<td class="contant">
										<xsl:if test="selectCnt/msgEpuConMnt/contrct_g2b_clsf_cd = 'PRG010'">
											조달청 연계 전자계약
										</xsl:if>
										<xsl:if test="selectCnt/msgEpuConMnt/contrct_g2b_clsf_cd != 'PRG010'">
											비연계 계약
										</xsl:if>
									</td>
									<td class='title2' width="20%">안전장비포함 구매여부</td>
									<td class="contant">
										<xsl:value-of select="selectCnt/msgEpuConMnt/safety_yn" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">계약번호</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:if test="selectCnt/msgEpuConMnt/chng_seq_g2b != '00' ">
											<a style="color: #0000FF;">
												<xsl:attribute name="href">javascript:openContrctNoPop('<xsl:value-of select="selectCnt/msgEpuConMnt/contrct_no_g2b" />','<xsl:value-of select="selectCnt/msgEpuConMnt/old_chng_seq_g2b" />')</xsl:attribute>
	
											<xsl:value-of select="selectCnt/msgEpuConMnt/contrct_no_g2b" />
											</a>
										</xsl:if>
										<xsl:if test="selectCnt/msgEpuConMnt/chng_seq_g2b = '00' ">
											<xsl:value-of select="selectCnt/msgEpuConMnt/contrct_no_g2b" />
										</xsl:if>
									</td>
									<td class='title2' width="20%">구매요구 내용확인</td>
									<td class="contant">
										<a style="color: #0000FF;">
											<xsl:attribute name="href">javascript:openPurReqPop('<xsl:value-of select="selectCnt/msgEpuConMnt/pur_req_no" />')</xsl:attribute>
											<xsl:value-of select="selectCnt/msgEpuConMnt/pur_req_no" />
											확인
										</a>
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">계약건명</td>
									<td class="contant" >
										<xsl:value-of select="selectCnt/msgEpuConMnt/contrct_nm" />
									</td>
									<td class='title2' width="20%">발주계획 내용확인</td>
									<td class="contant">
										<a style="color: #0000FF;">
											<xsl:attribute name="href">javascript:openContrctNoPop('<xsl:value-of select="selectCnt/msgEpuConMnt/bid_ord_no" />','<xsl:value-of select="selectCnt/msgEpuConMnt/ord_chg_no" />')</xsl:attribute>
											<xsl:value-of select="selectCnt/msgEpuConMnt/bid_ord_no" /> 확인
										</a>
									</td>	
								</tr>
								<tr>
									<td class='title2' width="20%">계약금액</td>
									<xsl:if test="selectCnt/msgEpuConMnt/epu_tec_cnt = '' ">
										<td class="contant" style="width: 218.47px;color: #0000FF;" colspan="3">
											<xsl:value-of select="format-number(selectCnt/msgEpuConMnt/contrct_tot_amt, '#,###,###')" />
											원
										</td>
									</xsl:if>
									<xsl:if test="selectCnt/msgEpuConMnt/epu_tec_cnt != '' ">
										<td class="contant" style="width: 218.47px;color: #0000FF;">
											<xsl:value-of select="format-number(selectCnt/msgEpuConMnt/contrct_tot_amt, '#,###,###')" />
											원
										</td>
										<td class='title2' width="20%">기술평가 내용확인</td>
										<td class="contant">
												<a style="color: #0000FF;">
													<xsl:attribute name="href">javascript:openNotiNoPop('<xsl:value-of select="selectCnt/msgEpuConMnt/bid_ord_no" />','<xsl:value-of select="selectCnt/msgEpuConMnt/ord_chg_no" />','<xsl:value-of select="selectCnt/msgEpuConMnt/bid_noti_no" />','<xsl:value-of select="selectCnt/msgEpuConMnt/chg_no" />')</xsl:attribute>
													<xsl:value-of select="selectCnt/msgEpuConMnt/bid_noti_no" /> 확인
												</a>
										</td>
									</xsl:if>
								</tr>
								<tr>
									<td class='title2' width="20%">공사기간</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="substring(selectCnt/msgEpuConMnt/suply_time_start_ymd, 1, 4)" />
										-
										<xsl:value-of select="substring(selectCnt/msgEpuConMnt/suply_time_start_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(selectCnt/msgEpuConMnt/suply_time_start_ymd, 7, 2)" />
										~
										<xsl:value-of select="substring(selectCnt/msgEpuConMnt/suply_time_cls_ymd, 1, 4)" />
										-
										<xsl:value-of select="substring(selectCnt/msgEpuConMnt/suply_time_cls_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(selectCnt/msgEpuConMnt/suply_time_cls_ymd, 7, 2)" />
									</td>
									<td class='title2' width="20%">지체상금율</td>
									<td class="contant" style="text-align:right;">
										<xsl:if test="selectCnt/msgEpuConMnt/delay_add_mny_rt != '' ">
											<xsl:value-of select="selectCnt/msgEpuConMnt/delay_add_mny_rt" />
											%
										</xsl:if>
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">준공일자</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="substring(selectCnt/msgEpuConMnt/delvr_schdl_ymd, 1, 4)" />
										-
										<xsl:value-of select="substring(selectCnt/msgEpuConMnt/delvr_schdl_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(selectCnt/msgEpuConMnt/delvr_schdl_ymd, 7, 2)" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">수요부서</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="selectCnt/msgEpuConMnt/user_main_dept_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">현장</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="selectCnt/msgEpuConMnt/filed" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">지급방법</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="selectCnt/msgEpuConMnt/mny_pay_way_nm" />
									</td>
									<td class='title2' width="20%">지급구분</td>
									<td class="contant">
										<xsl:value-of select="selectCnt/msgEpuConMnt/pay_way_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">하자담보책임기간</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="selectCnt/msgEpuConMnt/dfct_guarnt_rmk" />
									</td>
									<td class='title2' width="20%">하자보수보증금율</td>
									<td class="contant">
										<xsl:if test="selectCnt/msgEpuConMnt/dfct_gurnt_mny_rt != '' ">
											<xsl:value-of select="selectCnt/msgEpuConMnt/dfct_gurnt_mny_rt" />
											%
										</xsl:if>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">부가정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="20%">인지세액</td>
									<td class="contant" colspan="3">
										<xsl:if test="selectCnt/msgEpuConMnt/rs_amt != '' ">
											<xsl:value-of select="format-number(selectCnt/msgEpuConMnt/rs_amt, '#,###,###')" />
											원
										</xsl:if>
									</td>
								</tr>
								<tr>
									<td class='title2' width="20%">계약보증서 전자제출여부</td>
									<td class="contant" style="width: 218.47px;">
										<xsl:value-of select="selectCnt/msgEpuConMnt/grunt_elec_nm" />
									</td>
									<td class='title2' width="20%">계약보증금</td>
									<td class="contant">
										<xsl:if test="selectCnt/msgEpuConMnt/gurnt_amt != '' ">
											<xsl:value-of select="format-number(selectCnt/msgEpuConMnt/gurnt_amt, '#,###,###')" />
											원
										</xsl:if>
									</td>
								</tr>
								<tr>
									<xsl:if test="selectCnt/msgEpuConMnt/contrct_base_clause != ''">
										<td class='title2' width="20%" rowspan="2">계약방법</td>
									</xsl:if>
									<xsl:if test="selectCnt/msgEpuConMnt/contrct_base_clause = ''">
										<td class='title2' width="20%">계약방법</td>
									</xsl:if>
									<td class="contant" colspan="3">
										<xsl:if test="selectCnt/msgEpuConMnt/contrct_base_provsn != ''">
											<xsl:value-of select="selectCnt/msgEpuConMnt/contrct_base_provsn_nm" />
											(조)
										</xsl:if>
										<xsl:if test="selectCnt/msgEpuConMnt/contrct_base_provsn = ''">
											선택없음(조,항)
										</xsl:if>
									</td>
								</tr>
								<xsl:if test="selectCnt/msgEpuConMnt/contrct_base_clause != ''">
									<tr>
										<td class="contant" colspan="3">
											<xsl:value-of select="selectCnt/msgEpuConMnt/contrct_base_clause_nm" />
											(항)
										</td>
									</tr>
								</xsl:if>
							</table>
						</td>
					</tr>
				</table>
				<xsl:if test="selectCnt/spcficCnt/msgPurReqSpcfic/pur_req_no != '' ">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head">특정물품(업체)구매사유서 첨부</td>
						</tr>
						<tr>
							<td class="body">
								<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<TR>
										<td class="contant">
											<a>
												<xsl:attribute name="href">javascript:openPurReqSpcficPop('<xsl:value-of select="selectCnt/spcficCnt/msgPurReqSpcfic/pur_req_no" />', '<xsl:value-of
													select="selectCnt/spcficCnt/msgPurReqSpcfic/cn" />', '<xsl:value-of select="selectCnt/spcficCnt/msgPurReqSpcfic/sn" />', '<xsl:value-of
													select="selectCnt/spcficCnt/msgPurReqSpcfic/bizoucode" />', '', '<xsl:value-of select="selectCnt/spcficCnt/msgPurReqSpcfic/accnt_no" />', '<xsl:value-of
													select="selectCnt/spcficCnt/msgPurReqSpcfic/gdnm" />', '<xsl:value-of select="selectCnt/spcficCnt/msgPurReqSpcfic/esti_amt" />', '<xsl:value-of
													select="selectCnt/spcficCnt/msgPurReqSpcfic/delvr_demnd_daycnt" />')</xsl:attribute>
												특정물품(업체)구매사유서
											</a>
										</td>
									</TR>
								</TABLE>
							</td>
						</tr>
					</table>
				</xsl:if>
				<xsl:if test="selectCnt/msgEpuConMnt/contrct_g2b_clsf_cd != 'PRG010'">
					<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
						<TR>
							<TD class="head" align="left">계약구비서류</TD>
						</TR>
						<TR>
							<TD class="body">
								<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<xsl:if test="count(selectCnt/fileList_A/vector/data)!=0">
										<xsl:for-each select="selectCnt/fileList_A/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">계약이행보증보험증권</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
									<xsl:if test="count(selectCnt/fileList_B/vector/data)!=0">
										<xsl:for-each select="selectCnt/fileList_B/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">최종견적서</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
									<xsl:if test="count(selectCnt/fileList_C/vector/data)!=0">
										<xsl:for-each select="selectCnt/fileList_C/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">원가산출내역서</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
									<xsl:if test="count(selectCnt/fileList_D/vector/data)!=0">
										<xsl:for-each select="selectCnt/fileList_D/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">사용인감계 및 입금계좌신고서</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
									<xsl:if test="count(selectCnt/fileList_E/vector/data)!=0">
										<xsl:for-each select="selectCnt/fileList_E/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">입금통장 사본</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
									<xsl:if test="count(selectCnt/fileList_F/vector/data)!=0">
										<xsl:for-each select="selectCnt/fileList_F/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">사업자등록증 사본</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
									<xsl:if test="count(selectCnt/fileList_G/vector/data)!=0">
										<xsl:for-each select="selectCnt/fileList_G/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">법인인감증명서</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
									<xsl:if test="count(selectCnt/fileList_H/vector/data)!=0">
										<xsl:for-each select="selectCnt/fileList_H/vector/data/msgXomxComAttachFileMS01">
											<TR>
												<TD class="title2" width="25%">법인등기부등본</TD>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
														<xsl:value-of select="org_file" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</xsl:if>
								</TABLE>
							</TD>
						</TR>
					</TABLE>
				</xsl:if>
				<xsl:if test="selectCnt/msgEpuConMnt/contrct_g2b_clsf_cd = 'PRG010'">
					<xsl:if test="count(selectCnt/selectG2BAttach/vector/data)!=0">
						<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
							<TR>
								<TD class="head" align="left">조달청 첨부파일</TD>
							</TR>
							<TR>
								<TD class="body">
									<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
										<xsl:for-each select="selectCnt/selectG2BAttach/vector/data/msgEpuConG2BAttach">
											<TR>
												<TD class="contant">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA110')</xsl:attribute>
														<xsl:value-of select="real_file_nm" />
													</a>
												</TD>
											</TR>
										</xsl:for-each>
									</TABLE>
								</TD>
							</TR>
						</TABLE>
					</xsl:if>
				</xsl:if>
				<xsl:if test="count(selectCnt/fileList_P/vector/data/mdata)!=0">
					<TABLE class="aproutertable" cellspacing="0" cellpadding="0" border="0" width="100%">
						<TR>
							<TD class="head" align="left">첨부파일</TD>
						</TR>
						<TR>
							<TD class="body">
								<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<xsl:for-each select="selectCnt/fileList_P/vector/data/mdata">
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