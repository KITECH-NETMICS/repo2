<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
 	 <xsl:variable name="localPath" select="request/localPath"/>
			<BODY>
			<script language="javascript">
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
					
					/* 사양서 팝업 */
					function openPurReqSpecPop (pPurReqNo, pCn, pSn, pBizoucode, pMaxStateCd) {
						/*window.open("","spec28",'width=1008,height=260,top=50,left=150');*/
						window.open("","spec28", "width=1008,height=260,top=50,left=150,location=no, status=no");
						
						var idx = (new Date()).getTime() + Math.random() * 10000;
						var frm = createForm("popFrm", "spec28", "http://biz.kitech.re.kr/websquare/popup.html", "get");
						frm = createHidden("w2xPath", "/kitech/pur/req/PurReqSpecPop.xml", frm);
						frm = createHidden("popupID", "spec28", frm);
						frm = createHidden("idx", idx, frm);
						frm = createHidden("w2xHome", "/kitech/pur/req/", frm);
						frm = createHidden("purReqNo", pPurReqNo, frm);
						frm = createHidden("cn", pCn, frm);
						frm = createHidden("sn", pSn, frm);
						frm = createHidden("bizoucode", pBizoucode, frm);
						frm = createHidden("serviceId", "P101", frm);
						
						if ( pMaxStateCd == "" ) {
							frm = createHidden("maxStateCd", "XAD100", frm);
						} else {
							frm = createHidden("maxStateCd", pMaxStateCd, frm);
						}
						
						frm = createHidden("requestFlag", "H", frm);			/* 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						frm = createHidden("page_gbn", "first", frm );          /* 사양서를 호출하는 페이지가 구매요구인지, 검수인지 구분 */
						
						document.body.appendChild(frm);
						frm.submit();
					}
					
					/* 용도설명서 팝업 */
					function openPurReqUsgPop (pPurReqNo, pCn, pSn, pBizoucode, pMaxStateCd) {
						window.open("","usg76",'width=1023,height=335,top=50,left=150');
						
						var idx = (new Date()).getTime() + Math.random() * 10000;
						var frm = createForm("popFrm", "usg76", "http://biz.kitech.re.kr/websquare/popup.html", "get");
						frm = createHidden("w2xPath", "/kitech/pur/req/PurReqUsgPop.xml", frm);
						frm = createHidden("popupID", "usg76", frm);
						frm = createHidden("idx", idx, frm);
						frm = createHidden("w2xHome", "/kitech/pur/req/", frm);
						frm = createHidden("purReqNo", pPurReqNo, frm);
						frm = createHidden("cn", pCn, frm);
						frm = createHidden("sn", pSn, frm);
						frm = createHidden("bizoucode", pBizoucode, frm);	
						frm = createHidden("serviceId", "P102", frm);
						
						if ( pMaxStateCd == "" ) {
							frm = createHidden("maxStateCd", "XAD100", frm);
						} else {
							frm = createHidden("maxStateCd", pMaxStateCd, frm);
						}
						
						frm = createHidden("requestFlag", "H", frm);			/* 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						
						document.body.appendChild(frm);						
						frm.submit();
					}
					
					/* 견적서 팝업 */
					function openPurReqEstimPop (pPurReqNo, pCn, pSn, pBizoucode, pMaxStateCd) {
						window.open("","estim82",'width=930,height=240,top=50,left=150');
						
						var idx = (new Date()).getTime() + Math.random() * 10000;
						var frm = createForm("popFrm", "estim82", "http://biz.kitech.re.kr/websquare/popup.html", "get");
						frm = createHidden("w2xPath", "/kitech/pur/req/PurReqEstimPop.xml", frm);
						frm = createHidden("popupID", "estim82", frm);
						frm = createHidden("idx", idx, frm);
						frm = createHidden("w2xHome", "/kitech/pur/req/", frm);
						frm = createHidden("purReqNo", pPurReqNo, frm);
						frm = createHidden("cn", pCn, frm);
						frm = createHidden("sn", pSn, frm);
						frm = createHidden("bizoucode", pBizoucode, frm);
						frm = createHidden("serviceId", "P103", frm);
						
						if ( pMaxStateCd == "" ) {
							frm = createHidden("maxStateCd", "XAD100", frm);
						} else {
							frm = createHidden("maxStateCd", pMaxStateCd, frm);
						}
						
						frm = createHidden("requestFlag", "H", frm);			/* 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						
						document.body.appendChild(frm);
						frm.submit();
					}
					
					/* 특정구매사유서 팝업 */
					function openPurReqSpcficPop (pPurReqNo, pCn, pSn, pBizoucode, pMaxStateCd, pAccntNo, pGdnm, pEstiAmt, pDelvrDemndDaycnt) {
						window.open("","spcfic89",'width=1023,height=460,top=50,left=150');
						
						var idx = (new Date()).getTime() + Math.random() * 10000;
						var frm = createForm("popFrm", "spcfic89", "http://biz.kitech.re.kr/websquare/popup.html", "get");
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
					
					/* 시방서, 긴급구매사유서, 사업계획, 과업지시서   팝업 */
					function openPurReqDelyPop (pPurReqNo, pCn, pSn, pBizoucode, pMaxStateCd, gbn) {
						var win = "";
						
						if (gbn == "G") {	/*시방서*/
							win = "dely28";
						} else if (gbn == "H") {	/*긴급구매사유서*/
							win = "dely29";
						} else if (gbn == "J") {	/*사업계획*/
							win = "dely31";
						} else {	/* K:과업지시서*/
							win = "dely32";
						}
						
						if (gbn == "G") {
							window.open("",win,'width=1023,height=225,top=50,left=150,scrollbars=yes');
						} else {
							window.open("",win,'width=1023,height=225,top=50,left=150');
						}
						
						var idx = (new Date()).getTime() + Math.random() * 10000;
						var frm = createForm("popFrm", win, "http://biz.kitech.re.kr/websquare/popup.html", "get");
						frm = createHidden("w2xPath", "/kitech/pur/req/PurReqDelyPop.xml", frm);
						frm = createHidden("popupID", win, frm);
						frm = createHidden("idx", idx, frm);
						frm = createHidden("w2xHome", "/kitech/pur/req/", frm);
						frm = createHidden("purReqNo", pPurReqNo, frm);
						frm = createHidden("cn", pCn, frm);
						frm = createHidden("sn", pSn, frm);
						frm = createHidden("bizoucode", pBizoucode, frm);
						frm = createHidden("serviceId", "P106", frm);
						
						if ( pMaxStateCd == "" ) {
							frm = createHidden("maxStateCd", "XAD100", frm);
						} else {
							frm = createHidden("maxStateCd", pMaxStateCd, frm);
						}
						
						frm = createHidden("clsfCd", gbn, frm);
						frm = createHidden("requestFlag", "H", frm);			/* 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						
						document.body.appendChild(frm);
						frm.submit();
					}
					
					/* 원가계산서 팝업  */
					function openPurReqCostPop (pPurReqNo, pCn, pSn, pBizoucode, pMaxStateCd, gbn, purClsfCd) {
						if (purClsfCd == "PBA030") {		/* 구매구분 : 공사 */
							gbn = "D";
						}
						
						window.open("","cost89",'width=1023,height=354,top=50,left=150');
						
						var idx = (new Date()).getTime() + Math.random() * 10000;
						var frm = createForm("popFrm", "cost89", "http://biz.kitech.re.kr/websquare/popup.html", "get");
						frm = createHidden("w2xPath", "/kitech/pur/req/PurReqCostPop.xml", frm);
						frm = createHidden("popupID", "cost89", frm);
						frm = createHidden("idx", idx, frm);
						frm = createHidden("w2xHome", "/kitech/pur/req/", frm);
						frm = createHidden("purReqNo", pPurReqNo, frm);
						frm = createHidden("cn", pCn, frm);
						frm = createHidden("sn", pSn, frm);
						frm = createHidden("bizoucode", pBizoucode, frm);
						frm = createHidden("serviceId", "P105", frm);
						
						if ( pMaxStateCd == "" ) {
							frm = createHidden("maxStateCd", "XAD100", frm);
						} else {
							frm = createHidden("maxStateCd", pMaxStateCd, frm);
						}
						
						frm = createHidden("clsfCd", gbn, frm);
						frm = createHidden("requestFlag", "H", frm);			/* 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						
						document.body.appendChild(frm);
						frm.submit();
					}
					
					/* 연구장비심의  */
					function openPurEquipConsttnPop (pPurReqNo, pSn, pMaxStateCd) {						
						
						window.open("","equipCons",'width=712,height=287,top=50,left=150');
						
						var idx = (new Date()).getTime() + Math.random() * 10000;
						var frm = createForm("popFrm", "equipCons", "http://biz.kitech.re.kr/websquare/popup.html", "get");
						frm = createHidden("w2xPath", "/kitech/pur/req/PurEquipConsttnPopup.xml", frm);
						frm = createHidden("popupID", "equipCons", frm);
						frm = createHidden("idx", idx, frm);
						frm = createHidden("w2xHome", "/kitech/pur/req/", frm);
						frm = createHidden("pur_req_no", pPurReqNo, frm);						
						frm = createHidden("sn", pSn, frm);						
						frm = createHidden("serviceId", "P115", frm);
						frm = createHidden("apr_state", pMaxStateCd, frm);	
						frm = createHidden("requestFlag", "H", frm);			/* 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */	
						
						document.body.appendChild(frm);
						frm.submit();
					}
				]]>
				</script>
							
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
					        		<td class='title2' width="14%">구매구분</td>
					        		<td class="contant" colspan="2">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/inout_psn_clsf_nm" />
										/
										<xsl:value-of select="response/select/msgPurReqMastr03/pur_clsf_nm" />
										
										<font color="red">
										<xsl:value-of select="response/APPROVAL/etube_nm" />
										</font>
										
					        		</td>
					        		<td class='title2' width="14%">구매요구자</td>
					        		<td class="contant" colspan="2">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/req_psn_empnm" />
					        		</td>
					          	</tr>
								<tr>
					        		<td class='title2'>사용자(정)</td>
					        		<td class="contant" colspan="2">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/user_main_empnm" />
					        		</td>
					        		<td class='title2'>사용자(부)</td>
					        		<td class="contant" colspan="2">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/user_sub_empnm" />
					        		</td>
					          	</tr>
					          	<tr>
					        		<td class='title2'>납품요구일</td>
					        		<td class="contant" colspan="2">
					        			계약 후 
					        			<xsl:value-of select="response/select/msgPurReqMastr03/delvr_demnd_daycnt" /> 일 
					        		</td>
					        		<td class='title2'>부가세/부대비율</td>
					        		<td class="contant" colspan="2">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/addtax_calc_rts" /> %
					        		</td>
					          	</tr>
					          	<tr>
					        		<td class='title2'>구매요구번호</td>
					        		<td class="contant" colspan="2">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/pur_req_no" />
					        		</td>
					        		<td class='title2'>구매요구일자</td>
					        		<td class="contant" colspan="2">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/req_ymd" />
					        		</td>
					         	</tr>
					          	<tr>
					        		<td class='title2'>사용용도</td>
					        		<td class="contant" colspan="2">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/req_usg_cd_nm" />
					        		</td>	        		
					        		<td class='title2'>상세용도</td>
					        		<td class="contant" colspan="2">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/req_usg" />
					        		</td>
					            </tr>
					            <tr>
					        		<td class='title2'>납품장소</td>
					        		<td class="contant" colspan="5">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/delvr_plc_clsf_cd_nm" /> : 
					        			<xsl:value-of select="response/select/msgPurReqMastr03/delvr_plc_nm" />
					        		</td>
					          	</tr>
					          	<tr>
					        		<td class='title2' rowspan="2" align="center">설치위치</td>
					        		<td class='title2'>지역,건물,층,호수</td>
					        		<td class="contant" colspan="4">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/instl_posi_region_cd_nm" />, 
										<xsl:value-of select="response/select/msgPurReqMastr03/instl_posi_build_cd_nm" />, 
										<xsl:value-of select="response/select/msgPurReqMastr03/instl_posi_floor_clsf" />, 
										<xsl:value-of select="response/select/msgPurReqMastr03/instl_posi_editno" />호
					        		</td>
					          	</tr>
					          	<tr>
					        		<td class='title2'>우편번호</td>
					        		<td class="contant" width="15%">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/instl_posi_postmt_no" />
					        		</td>
					        		<td class='title2'>주소</td>
					        		<td class="contant" colspan="2">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/instl_posi_addr" />
					        		</td>
					          	</tr>	
					          	<tr>
					        		<td class='title2'>운영담당자</td>
					        		<td class="contant" width="15%">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/instl_posi_opr_charg" />
					        		</td>
					        		<td class='title2'>전화번호</td>
					        		<td class="contant">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/instl_posi_tel" />
					        		</td>
					        		<td class='title2'>설치운영기간</td>
					        		<td class="contant">
					        			검수완료 후 
										<xsl:value-of select="response/select/msgPurReqMastr03/instl_opr_time_daycnt" /> 일간
					        		</td>
					          	</tr>
                            </table>
                        </td>
                    </tr>
                </table>
							
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<xsl:if test="number(response/spcficCnt/msgPurReqSpcfic01/cnt) = 0">
					<tr>
						<td class="head"> 품목정보</td>
					</tr>
					</xsl:if>
					<xsl:if test="response/spcficCnt/msgPurReqSpcfic01/cnt &gt; 0">
					<tr>
						<td>
							<br/>
							<table width="100%">
								<tr>
									<td style="vertical-align:bottom;align:center;"><b><font color="red">* 특정물품(업체)구매요구건임</font></b></td>
								</tr>
								<tr>
									<td class="head" style="width:90%;"> 품목정보</td>
								</tr>
							</table>
						</td>
					</tr>
					</xsl:if>
					<tr>
						<td class="body">
                            <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">  	
					        	<tr>
					        		<td class='title'>한글품명</td>
					        		<td class='title' width="6%">단위</td>
					        		<td class='title' width="6%">수량</td>
					        		<td class='title' width="17%">추정단가</td>
					        		<td class='title' width="17%">추정금액</td>
					        		<!-- 
					        		<td class='title' width="11%">부가세</td>
					        		<td class='title' width="13%">합계</td>
					        		 -->
					        		<td class='title'>비고</td>
					          	</tr>
					          	<xsl:for-each select="response/itemSelect/vector/data">
					          	<tr>
					        		<td class="contant">
					        			<xsl:value-of select="msgPurReqItem/krchar_gdnm" />
					        		</td>
					        		<td class="contant-center">
					        			<xsl:value-of select="msgPurReqItem/unit_desc" />
					        		</td>
					        		<td class="contant-right">
					        			<xsl:value-of select="format-number(msgPurReqItem/qty, '#,###')" />
					        		</td>
					        		<td class="contant-right">
					        			<xsl:value-of select="format-number(msgPurReqItem/req_unit_price, '#,###')"/>
					        		</td>
					        		<td class="contant-right">
					        			<xsl:value-of select="format-number(msgPurReqItem/req_amt, '#,###')"/>
					        		</td>
					        		<!-- 
					        		<td class="contant-right">
					        			<xsl:value-of select="format-number(msgPurReqItem/req_time_addtax_extexpns, '#,###')"/>
					        		</td>
					        		<td class="contant-right">
					        			<xsl:value-of select="format-number(msgPurReqItem/req_amt_sum, '#,###')"/>
					        		</td>
					        		 -->
					        		<td class="contant">
					        			<xsl:value-of select="msgPurReqItem/rmk" />
					        		</td>
					          	</tr>
					          	</xsl:for-each>
					          	<tr>
					          		<td colspan="4" class="contant-center">합계</td>
					          		<td class="contant-right">
					        			<xsl:value-of select="format-number(response/select/msgPurReqMastr03/colReqAmtSum1, '#,###')"/>
					        		</td>
					        		<td class="contant">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/colReqAmtSum4"/>
					        		</td>
					          	</tr>
					          	<tr>
					          		<td colspan="4" class="contant-center">부대비(부가세)</td>
					        		<td class="contant-right">
					        			<xsl:value-of select="format-number(response/select/msgPurReqMastr03/colReqAmtSum2, '#,###')"/>
					        		</td>
					        		<td class="contant">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/colReqAmtSum5" />
					        		</td>
					          	</tr>
					          	<tr>
					          		<td colspan="4" class="contant-center">총액</td>
					        		<td class="contant-right">
					        			<xsl:value-of select="format-number(response/select/msgPurReqMastr03/colReqAmtSum3, '#,###')"/>
					        		</td>
					        		<td class="contant">
					        			<xsl:value-of select="response/select/msgPurReqMastr03/colReqAmtSum6" />
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
					        		<!-- td class='title'>회계코드명</td -->
					        		<!-- td class='title'>비용코드</td -->
					        		<td class='title'>비용코드명(코드)</td>
					        		<td class='title'>통제번호</td>
					        		
					        		<td class='title'>구매요청금액</td>
					        		<!-- td class='title2'>통제금액</td -->
					          	</tr>
					          	<xsl:for-each select="response/accntSelect/vector/data">
					          	<tr>
					        		<td class="contant-center">
					        			<xsl:value-of select="msgPurReqAccnt/accnt_no" />
					        		</td>
					        		<!-- 
					        		<td class="contant">
					        			<xsl:value-of select="msgPurReqAccnt/accnt_no_nm" />
					        		</td>
					        		-->
					        		<td class="contant">
					        			<xsl:value-of select="msgPurReqAccnt/accnt_no_nm" />(<xsl:value-of select="msgPurReqAccnt/accnt_no_cls_ymd" />)
					        		</td>
					        		<td class="contant-center">
					        			<xsl:value-of select="msgPurReqAccnt/accnt_respn_psn_empnm" />
					        		</td>
					        		<td class="contant-center">
					        			<xsl:value-of select="msgPurReqAccnt/accnt_cd" />
					        		</td>
					        		<!-- td class="contant">
					        			<xsl:value-of select="msgPurReqAccnt/accnt_cd_abbr" />
					        		</td -->
					        		<!-- td class="contant-center">
					        			<xsl:value-of select="msgPurReqAccnt/expns_cd" />
					        		</td -->
					        		<td class="contant-center">
					        			<xsl:value-of select="msgPurReqAccnt/expns_cd" />(<xsl:value-of select="msgPurReqAccnt/expns_cd_nm" />)
					        		</td>
					        		<td class="contant-right">
					        			<xsl:value-of select="format-number(msgPurReqAccnt/accnt_demnd_amt, '#,###')"/>
					        		</td>
					        		<td class="contant-center">
					        			<xsl:value-of select="msgPurReqAccnt/ctrl_no" />
					        		</td>
					        		<!-- td class="contant">
					        			<xsl:value-of select="format-number(msgPurReqAccnt/ctrl_amt, '#,###')"/>
					        		</td -->
					          	</tr>
					          	</xsl:for-each>
                            </table>
                        </td>
                    </tr>
                </table>
				
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 첨부서류</td>
					</tr>
					<tr>
						<td class="body">
                            <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
                                <tr>
	                                <xsl:if test="response/specCnt/msgPurReqSpec01/spec_cnt &gt; 0">
	                                <td class="contant">
                                        <a>
                                        <xsl:attribute name="href">javascript:openPurReqSpecPop('<xsl:value-of select="response/select/msgPurReqMastr03/pur_req_no" />', '<xsl:value-of select="response/select/msgPurReqMastr03/cn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/sn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/bizoucode" />', '<xsl:value-of select="response/select/msgPurReqMastr03/max_state_cd" />')</xsl:attribute>
                                		사양서
                                		</a>
	                                </td>
	                                </xsl:if>
	                                <xsl:if test="response/usgCnt/msgPurReqUsg01/usg_cnt &gt; 0">
	                                <td class="contant">
                                        <a>
                                        <xsl:attribute name="href">javascript:openPurReqUsgPop('<xsl:value-of select="response/select/msgPurReqMastr03/pur_req_no" />', '<xsl:value-of select="response/select/msgPurReqMastr03/cn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/sn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/bizoucode" />', '<xsl:value-of select="response/select/msgPurReqMastr03/max_state_cd" />')</xsl:attribute>
                                		용도설명서
                                		</a>
	                                </td>
	                                </xsl:if>
	                                <xsl:if test="response/costCnt_E/msgPurReqEval01/cnt &gt; 0">
	                                <td class="contant">
                                        <a>
                                        <xsl:attribute name="href">javascript:openPurReqEstimPop('<xsl:value-of select="response/select/msgPurReqMastr03/pur_req_no" />', '<xsl:value-of select="response/select/msgPurReqMastr03/cn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/sn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/bizoucode" />', '<xsl:value-of select="response/select/msgPurReqMastr03/max_state_cd" />')</xsl:attribute>
                                		견적서
                                		</a>
	                                </td>
	                                </xsl:if>
	                                <xsl:if test="response/spcficCnt/msgPurReqSpcfic01/cnt &gt; 0">
	                                <td class="contant">
                                        <a>
                                        <xsl:attribute name="href">javascript:openPurReqSpcficPop('<xsl:value-of select="response/select/msgPurReqMastr03/pur_req_no" />', '<xsl:value-of select="response/select/msgPurReqMastr03/cn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/sn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/bizoucode" />', '<xsl:value-of select="response/select/msgPurReqMastr03/max_state_cd" />', '<xsl:value-of select="response/select/msgPurReqMastr03/accnt_no" />', '<xsl:value-of select="response/select/msgPurReqMastr03/gdnm" />', '<xsl:value-of select="response/select/msgPurReqMastr03/esti_amt" />', '<xsl:value-of select="response/select/msgPurReqMastr03/delvr_demnd_daycnt" />')</xsl:attribute>
                                		특정물품(업체)구매사유서
                                		</a>
	                                </td>
	                                </xsl:if>
	                                <xsl:if test="response/delyCnt_G/msgPurReqDely01/cnt &gt; 0">
	                                <td class="contant">
                                        <a>
                                        <xsl:attribute name="href">javascript:openPurReqDelyPop('<xsl:value-of select="response/select/msgPurReqMastr03/pur_req_no" />', '<xsl:value-of select="response/select/msgPurReqMastr03/cn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/sn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/bizoucode" />', '<xsl:value-of select="response/select/msgPurReqMastr03/max_state_cd" />', 'G')</xsl:attribute>
                                		시방서
                                		</a>
	                                </td>
	                                </xsl:if>
	                                <xsl:if test="response/delyCnt_H/msgPurReqDely01/cnt &gt; 0">
	                                <td class="contant">
                                        <a>
                                        <xsl:attribute name="href">javascript:openPurReqDelyPop('<xsl:value-of select="response/select/msgPurReqMastr03/pur_req_no" />', '<xsl:value-of select="response/select/msgPurReqMastr03/cn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/sn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/bizoucode" />', '<xsl:value-of select="response/select/msgPurReqMastr03/max_state_cd" />', 'H')</xsl:attribute>
                                		긴급구매사유서
                                		</a>
	                                </td>
	                                </xsl:if>
	                                <xsl:if test="response/delyCnt_J/msgPurReqDely01/cnt &gt; 0">
	                                <td class="contant">
                                        <a>
                                        <xsl:attribute name="href">javascript:openPurReqDelyPop('<xsl:value-of select="response/select/msgPurReqMastr03/pur_req_no" />', '<xsl:value-of select="response/select/msgPurReqMastr03/cn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/sn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/bizoucode" />', '<xsl:value-of select="response/select/msgPurReqMastr03/max_state_cd" />', 'J')</xsl:attribute>
                                		사업계획서
                                		</a>
	                                </td>
	                                </xsl:if>
	                                <xsl:if test="response/delyCnt_K/msgPurReqDely01/cnt &gt; 0">
	                                <td class="contant"><!-- 'K'에서 'I'로 변경됨  -->
                                        <a>
                                        <xsl:attribute name="href">javascript:openPurReqDelyPop('<xsl:value-of select="response/select/msgPurReqMastr03/pur_req_no" />', '<xsl:value-of select="response/select/msgPurReqMastr03/cn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/sn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/bizoucode" />', '<xsl:value-of select="response/select/msgPurReqMastr03/max_state_cd" />', 'I')</xsl:attribute>
                                		과업지시서
                                		</a>
	                                </td>
	                                </xsl:if>
	                                <xsl:if test="response/costCnt_D1/msgPurReqCost01/cnt &gt; 0">
	                                <td class="contant">
                                        <a>
                                        <xsl:attribute name="href">javascript:openPurReqCostPop('<xsl:value-of select="response/select/msgPurReqMastr03/pur_req_no" />', '<xsl:value-of select="response/select/msgPurReqMastr03/cn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/sn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/bizoucode" />', '<xsl:value-of select="response/select/msgPurReqMastr03/max_state_cd" />', 'D', '<xsl:value-of select="response/select/msgPurReqMastr03/pur_clsf_cd" />')</xsl:attribute>
                                		원가계산서
                                		</a>
	                                </td>
	                                </xsl:if>
	                                <xsl:if test="response/costCnt_C1/msgPurReqCost01/cnt &gt; 0">
	                                <td class="contant">
                                        <a>
                                        <xsl:attribute name="href">javascript:openPurReqCostPop('<xsl:value-of select="response/select/msgPurReqMastr03/pur_req_no" />', '<xsl:value-of select="response/select/msgPurReqMastr03/cn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/sn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/bizoucode" />', '<xsl:value-of select="response/select/msgPurReqMastr03/max_state_cd" />', 'C', '<xsl:value-of select="response/select/msgPurReqMastr03/pur_clsf_cd" />')</xsl:attribute>
                                		원가계산서
                                		</a>
	                                </td>
	                                </xsl:if>
	                                
	                                <xsl:if test="response/select/msgPurReqMastr03/equip_info = 'Y'">
	                                <td class="contant">
                                        <a>
                                        <xsl:attribute name="href">javascript:openPurEquipConsttnPop('<xsl:value-of select="response/select/msgPurReqMastr03/pur_req_no" />', '<xsl:value-of select="response/select/msgPurReqMastr03/sn" />', '<xsl:value-of select="response/select/msgPurReqMastr03/max_state_cd" />')</xsl:attribute>
                                		연구장비심의
                                		</a>
	                                </td>
	                                </xsl:if>
                                </tr>                            
                            </table>
                        </td>
                    </tr>
                </table>		       
			</BODY>			
	</xsl:template>
</xsl:stylesheet>