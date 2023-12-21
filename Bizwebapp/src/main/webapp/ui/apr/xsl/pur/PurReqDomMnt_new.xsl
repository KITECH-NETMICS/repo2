<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
			<BODY>
				<script language="javascript">
				<![CDATA[
					/* 사양서 팝업 */
					function openPurReqSpecPop(pPurReqNo) {
						var data = { pur_req_no : pPurReqNo, req_clsf:"H" }; /* req_clsf - 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						var url = "/ui/epu/pop/EPU_POP_P101_01P.xml";
						var option = { width: 1008, height: 550, id: "PurReqSpecPop", popupName: "사양서", type : "iframePopup"};
						
						com.openPopup(url, option, data);
					}
					
					/* 용도설명서 팝업 */
					function openPurReqUsgPop(pPurReqNo) {
						var data = { pur_req_no : pPurReqNo, req_clsf:"H" }; /* req_clsf - 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						var url = "/ui/epu/pop/EPU_POP_P102_01P.xml";
						var option = { width: 1010, height: 520, id: "PurReqUsgPop", popupName: "용도설명서", type : "iframePopup" };
						
						com.openPopup(url, option, data);
					}
					
					/* 견적서 팝업 */
					function openPurReqEstimPop(pPurReqNo) {
						var data = { pur_req_no : pPurReqNo, req_clsf:"H" }; /* req_clsf - 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						var url = "/ui/epu/pop/EPU_POP_P103_01P.xml";
						var option = { width: 850, height: 450, id: "PurReqEstimPop", popupName: "견적서", type : "iframePopup" };
						
						com.openPopup(url, option, data);
					}
					
					/* 특정구매사유서 팝업 */
					function openPurReqSpcficPop(pPurReqNo) {
						var data = { pur_req_no : pPurReqNo, req_clsf:"H" }; /* req_clsf - 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						var url = "/ui/epu/pop/EPU_POP_P104_01P.xml";
						var option = { width: 1010, height: 750, id: "PurReqEstimPop", popupName: "견적서" };
						
						com.openPopup(url, option, data);
					}
					
					/* 시방서, 긴급구매사유서, 사업계획, 과업지시서   팝업 */
					function openPurReqDelyPop(pPurReqNo, gbn) {
						var win = "";	
						var popNm="";					
						if (gbn == "G") {	/*시방서*/
							win = "PurReqDelyGPop";
							popNm = "시방서";
						} else if (gbn == "H") {	/*긴급구매사유서*/
							win = "PurReqDelyHPop";
							popNm = "긴급구매사유서";
						} else if (gbn == "J") {	/*사업계획*/
							win = "PurReqDelyJPop";
							popNm = "사업계획서";
						} else {	/* K:과업지시서*/
							win = "PurReqDelyIPop";
							popNm = "과업지시서";
						}						
						
						var data = { pur_req_no : pPurReqNo, req_clsf:"H", clsf_cd:gbn }; /* req_clsf - 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						var url = "/ui/epu/pop/EPU_POP_P106_01P.xml";
						var option = { width: 950, height: 450, id: win, popupName: popNm};
						
						com.openPopup(url, option, data);
					}
					
					/* 원가계산서 팝업  */
					function openPurReqCostPop(pPurReqNo, purClsfCd) {
						var gbn = "C";
						if (purClsfCd == "PBA030") { /* 구매구분 : 공사 */
							gbn = "D";
						}
						
						var data = { pur_req_no : pPurReqNo, req_clsf:"H", clsf_cd:gbn }; /* req_clsf - 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						var url = "/ui/epu/pop/EPU_POP_P105_01P.xml";
						var option = { width: 950, height: 610, id: "PurReqCostPop", popupName: "원가계산서"};
						
						com.openPopup(url, option, data);
					}
					
					/* 연구장비심의  */
					function openPurEquipConsttnPop(pPurReqNo, aprState) {	
						var data = { pur_req_no : pPurReqNo, req_clsf:"H", apr_state : aprState}; /* req_clsf - 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						var url = "/ui/epu/pop/EPU_POP_P022_04P.xml";
						var option = { width: 1080, height: 350, id: "PurEquipConsttnPopup", popupName: "연구장비심의등록"};
						
						com.openPopup(url, option, data);
					}
					
					/* 품목코드  */				
					function openitemPop(pPurReqNo, itemOdr, addTaxRt)  {
						var data = { pur_req_no : pPurReqNo, item_odr : itemOdr, req_clsf : "H", addtax_calc_rts : addTaxRt}; /* req_clsf - 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						var url = "/ui/epu/pop/EPU_POP_P349_01P.xml";
						var option = { width: 1080, height: 850, id: "EpuBasItmGpMntPop", popupName: "품목코드 검색"};
						
						com.openPopup(url, option, data);
					}
					
					/* 연구 기자재 내역 */
					function openEquipPop(accntNo){
						var data = { accnt_no : accntNo, req_clsf : "H"}; /* req_clsf - 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						var url = "/ui/com/pop/COM_Z020_00P.xml";
						var option = { width: 800, height: 450, id: "ResComEquipSel", popupName: "연구기자재검색"};
						
						com.openPopup(url, option, data);
					}
					
					/* 계속연차확인서 팝업 */
					function openPurContinuePop(pPurReqNo) {
						var data = { pur_req_no : pPurReqNo, req_clsf:"H"}; /* req_clsf - 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */
						var url = "/ui/epu/pop/EPU_POP_P116_01P.xml";
						var option = { width: 1080, height: 650, id: "PurReqContinuePop", popupName: "계속연차확인서"};
						
						com.openPopup(url, option, data);
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
										<xsl:value-of select="root/mstrVo/pur_clsf_cd" />
										<font color="red">
											<xsl:value-of select="root/mstrVo/card_clsf_nm" />
										</font>

									</td>
									<td class='title2' width="14%">구매요구자</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="root/mstrVo/req_psn_nm" />(<xsl:value-of select="substring(root/mstrVo/req_psn_syspayno, 3,6)" />)
									</td>
								</tr>
								<tr>
									<td class='title2'>사용자(정)</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="root/mstrVo/user_main_nm" />(<xsl:value-of select="root/mstrVo/user_main_empno" />)
									</td>
									<td class='title2'>사용자(부)</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="root/mstrVo/user_sub_nm" />(<xsl:value-of select="root/mstrVo/user_sub_empno" />)
									</td>
								</tr>
								<tr>
									<td class='title2'>납품요구일</td>
									<td class="contant" colspan="2">
										계약 후
										<xsl:value-of select="root/mstrVo/delvr_demnd_daycnt" />
										일
									</td>
									<td class='title2'>부가세/부대비율</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="root/mstrVo/addtax_calc_rts" />
										%
									</td>
								</tr>
								<tr>
									<td class='title2'>구매요구번호</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="root/mstrVo/pur_req_no" />
									</td>
									<td class='title2'>구매요구일자</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="substring(root/mstrVo/req_ymd, 1,4)"/>-<xsl:value-of select="substring(root/mstrVo/req_ymd, 5,2)"/>-<xsl:value-of select="substring(root/mstrVo/req_ymd, 7,2)"/>
									</td>
								</tr>
								<tr>
									<td class='title2'>사용용도</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="root/mstrVo/req_usg_cd" />
									</td>
									<td class='title2'>상세용도</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="root/mstrVo/req_usg" />
									</td>
								</tr>
								<tr>
									<td class='title2'>안전장비여부</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="root/mstrVo/safety_yn" />
									</td>
									<td class='title2'>장애인생산품구매가능여부</td>
									<td class="contant" colspan="2">
										<xsl:if test="root/mstrVo/disabld_pur_yn = 'Y'"> 해당</xsl:if>
										<xsl:if test="root/mstrVo/disabld_pur_yn != 'Y'"> 해당안함</xsl:if>
									</td>
								</tr>
								<tr>
									<td class='title2'>납품장소</td>
									<td class="contant" colspan="5">
										<xsl:value-of select="root/mstrVo/delvr_plc_clsf_cd_nm" />
										:
										<xsl:value-of select="root/mstrVo/delvr_plc_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2' rowspan="2" align="center">설치위치</td>
									<td class='title2'>지역,건물,층,호수</td>
									<td class="contant" colspan="4">
										<xsl:value-of select="root/mstrVo/instl_posi_region_cd" />
										,
										<xsl:value-of select="root/mstrVo/instl_posi_build_cd" />
										,
										<xsl:value-of select="root/mstrVo/instl_posi_floor_clsf" />
										,
										<xsl:value-of select="root/mstrVo/instl_posi_editno" />
										호
									</td>
								</tr>
								<tr>
									<td class='title2'>우편번호</td>
									<td class="contant" width="15%">
										<xsl:value-of select="root/mstrVo/instl_posi_postmt_no" />
									</td>
									<td class='title2'>주소</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="root/mstrVo/instl_posi_addr" />
									</td>
								</tr>
								<tr>
									<td class='title2'>운영담당자</td>
									<td class="contant" width="15%">
										<xsl:value-of select="root/mstrVo/instl_posi_opr_charg" />
									</td>
									<td class='title2'>전화번호</td>
									<td class="contant">
										<xsl:value-of select="root/mstrVo/instl_posi_tel" />
									</td>
									<td class='title2'>설치운영기간</td>
									<td class="contant">
										검수완료 후
										<xsl:value-of select="root/mstrVo/instl_opr_time_daycnt" />
										일간
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<br></br>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">
							<font color="red">
								내자구매요령 제6조(구매요구서 작성) 제7항에 따라, 구매요구자 및 구매요구부서장은
								구매요구 대상 물품이 안전사고 등
								<br></br>
								위험 요인이 있다고 판단되는 경우 사고예방에 필요한 안전장비를 포함하여 구매요구를 하시기 바랍니다.
							</font>
						</td>
					</tr>
				</table>
				<br></br>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<xsl:if test="number(root/mstrVo/spcfic_cnt) = 0">
						<tr>
							<td class="head"> 품목정보</td>
						</tr>
					</xsl:if>
					<xsl:if test="root/mstrVo/spcfic_cnt != 0">
						<tr>
							<td>
								<br />
								<table width="100%">
									<tr>
										<td style="vertical-align:bottom;align:center;">
											<b>
												<font color="red">* 특정물품(업체)구매요구건임</font>
											</b>
										</td>
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
									<td class='title' width="4%">품목코드</td>
									<td class='title' width="6%">수량</td>
									<td class='title' width="15%">추정단가</td>
									<td class='title' width="15%">추정가격</td>
									<td class='title' width="11%">부가세</td>
									<td class='title' width="11%">추정가격+부가세 합계</td>
									<td class='title' width="13%">부대비</td> 
								</tr>
								<xsl:for-each select="root/itemList">
							        <xsl:variable name="var_req_amt" select="req_amt"/>
							        <xsl:variable name="var_req_time_addtax_extexpns" select="req_time_addtax_extexpns"/>
									<tr>
										<td class="contant">
											<xsl:if test="item_cd !=''">
												<a>
													<xsl:attribute name="href">javascript:openitemPop('<xsl:value-of select="/root/mstrVo/pur_req_no" />','<xsl:value-of
														select="item_odr" />')</xsl:attribute>
													<xsl:value-of select="krchar_gdnm" />
												</a>
											</xsl:if>
											<xsl:if test="item_cd =''">
												<xsl:value-of select="krchar_gdnm" />
											</xsl:if>
										</td>
										<td class="contant-center">
											<xsl:value-of select="unit_desc" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="item_cd" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(qty, '#,###.##')" />
										</td>										
										<td class="contant-right">
											<xsl:value-of select="format-number(req_unit_price, '#,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(req_amt, '#,###.##')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(req_time_addtax_extexpns, '#,###')" />
										</td>
										<td class="contant-right">
            								<xsl:value-of select="format-number($var_req_amt + $var_req_time_addtax_extexpns, '#,###')"/>
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(incidntl_expns, '#,###')" />
										</td>
									</tr>
								</xsl:for-each>
								<tr>
									<td colspan="4" class="title">소 계(공급가)</td>
									<td colspan="5" class="contant-right" style="padding-right:15px;">
										<xsl:value-of select="format-number(root/mstrVo/req_amt, '#,###')" />
									</td>
								</tr>
								<tr>
									<td colspan="4" class="title">부가세</td>
									<td colspan="5" class="contant-right" style="padding-right:15px;">
										<xsl:value-of select="format-number(root/mstrVo/addtax_amt, '#,###')" />	
									</td>
								</tr>
								<tr>
									<td colspan="4" class="title">부대비</td>
									<td colspan="5" class="contant-right" style="padding-right:15px;">
										<xsl:value-of select="format-number(root/mstrVo/incidntl_expns_sum, '#,###')" />
									</td>
								</tr>
								<tr>
									<td colspan="4" class="title">합 계</td>
									<td colspan="5" class="contant-right" style="padding-right:15px;">
										<xsl:value-of select="format-number(root/mstrVo/req_amt_sum, '#,###')" />
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
									<td class='title'>과제구분</td>
									<td class='title' width="25%">계정명</td>
									<td class='title'>계정책임자</td>
									<td class='title'>회계코드(코드명)</td>
									<td class='title'>비용코드(코드명)</td>
									<xsl:if test="root/mstrVo/equip_nm !=''">
										<td class='title' width="15%">연구기자재명</td>
									</xsl:if>
									<td class='title'>구매요청금액</td>
									<td class='title'>통제번호</td>
								</tr>
								<xsl:for-each select="root/accntList">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="accnt_no" />
										</td>
										<td class="contant">
											<xsl:value-of select="bsns_cd_inout" />
										</td>
										<td class="contant">
											<xsl:value-of select="accnt_no_nm" />
											(
											계정종료일 : <xsl:value-of select="substring(cls_ymd, 1, 4)" />-<xsl:value-of select="substring(cls_ymd, 5, 2)" />-<xsl:value-of select="substring(cls_ymd, 7, 2)" />
											)
										</td>
										<td class="contant-center">
											<xsl:value-of select="accnt_respn_psn_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="accnt_cd" />
											(
											<xsl:value-of select="accnt_cd_abbr" />
											)
										</td>
										<td class="contant-center">
											<xsl:value-of select="expns_cd" />
											(
											<xsl:value-of select="expns_cd_nm" />
											)
										</td>
										<xsl:if test="equip_nm !=''">
											<td class="contant-center">
												<a>
													<xsl:attribute name="href">javascript:openEquipPop('<xsl:value-of select="accnt_no" />')</xsl:attribute>
													<xsl:value-of select="equip_nm" />
												</a>
											</td>
										</xsl:if>

										<td class="contant-right">
											<xsl:value-of select="format-number(accnt_demnd_amt, '#,###')" />
										</td>
										<td class="contant-center">
											<xsl:attribute name="id">
												<xsl:text>ctrlNo</xsl:text>
												<xsl:value-of select="accnt_odr"/>
											</xsl:attribute>
											<xsl:value-of select="ctrl_no" />
										</td>
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
					<xsl:if test="root/mstrVo/attach_file_no != ''">
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<tr>
										<td class="body">
											<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
												<xsl:for-each select="root/fileList">
													<tr>
														<td class='title2' width="20%">
															중앙조달 첨부서류(
															<xsl:value-of select="seq" />
															)
														</td>
														<td class='contant' width="80%">
															<a>
																<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA110')</xsl:attribute>
																<xsl:value-of select="file_nm" /><br/>
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
														</td>
													</tr>
												</xsl:for-each>
											</table>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</xsl:if>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<xsl:if test="root/fileCntVo/spec_cnt != 0">
										<td class="contant">
											<a>
												<xsl:attribute name="href">javascript:openPurReqSpecPop('<xsl:value-of select="root/mstrVo/pur_req_no" />')</xsl:attribute>
												사양서
											</a>
										</td>
									</xsl:if>
									<xsl:if test="root/fileCntVo/usg_cnt != 0">
										<td class="contant">
											<a>
												<xsl:attribute name="href">javascript:openPurReqUsgPop('<xsl:value-of select="root/mstrVo/pur_req_no" />')</xsl:attribute>
												용도설명서
											</a>
										</td>
									</xsl:if>
									<xsl:if test="root/fileCntVo/eval_cnt != 0">
										<td class="contant">
											<a>
												<xsl:attribute name="href">javascript:openPurReqEstimPop('<xsl:value-of select="root/mstrVo/pur_req_no" />')</xsl:attribute>
												견적서
											</a>
										</td>
									</xsl:if>
									<xsl:if test="root/fileCntVo/spcfic_cnt != 0">
										<td class="contant">
											<a>
												<xsl:attribute name="href">javascript:openPurReqSpcficPop('<xsl:value-of select="root/mstrVo/pur_req_no" />')</xsl:attribute>
												특정물품(업체)구매사유서
											</a>
										</td>
									</xsl:if>
									<xsl:if test="root/fileCntVo/dely_g_cnt != 0">
										<td class="contant">
											<a>
												<xsl:attribute name="href">javascript:openPurReqDelyPop('<xsl:value-of select="root/mstrVo/pur_req_no" />', 'G')</xsl:attribute>
												시방서
											</a>
										</td>
									</xsl:if>
									<xsl:if test="root/fileCntVo/dely_h_cnt != 0">
										<td class="contant">
											<a>
												<xsl:attribute name="href">javascript:openPurReqDelyPop('<xsl:value-of select="root/mstrVo/pur_req_no" />', 'H')</xsl:attribute>
												긴급구매사유서
											</a>
										</td>
									</xsl:if>
									<xsl:if test="root/fileCntVo/dely_j_cnt != 0">
										<td class="contant">
											<a>
												<xsl:attribute name="href">javascript:openPurReqDelyPop('<xsl:value-of select="root/mstrVo/pur_req_no" />', 'J')</xsl:attribute>
												사업계획서
											</a>
										</td>
									</xsl:if>
									<xsl:if test="root/fileCntVo/dely_k_cnt != 0">
										<td class="contant"><!-- 'K'에서 'I'로 변경됨 -->
											<a>
												<xsl:attribute name="href">javascript:openPurReqDelyPop('<xsl:value-of select="root/mstrVo/pur_req_no" />', 'I')</xsl:attribute>
												과업지시서
											</a>
										</td>
									</xsl:if>
									<xsl:if test="root/fileCntVo/cost_cnt != 0">
										<td class="contant">
											<a>
												<xsl:attribute name="href">javascript:openPurReqCostPop('<xsl:value-of select="root/mstrVo/pur_req_no" />', '<xsl:value-of select="root/mstrVo/pur_clsf_cd" />')</xsl:attribute>
												원가계산서
											</a>
										</td>
									</xsl:if>	
									<xsl:if test="root/mstrVo/equip_info = 'Y'">
										<td class="contant">
											<a>
												<xsl:attribute name="href">javascript:openPurEquipConsttnPop('<xsl:value-of select="root/mstrVo/pur_req_no" />','<xsl:value-of select="root/mstrVo/apr_state" />')</xsl:attribute>
												연구장비심의
											</a>
										</td>
									</xsl:if>
									
									<xsl:if test="root/fileCntVo/conti_cnt != 0">
										<td class="contant">
											<a>
												<xsl:attribute name="href">javascript:openPurContinuePop('<xsl:value-of select="root/mstrVo/pur_req_no" />')</xsl:attribute>
												계속연차확인서
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