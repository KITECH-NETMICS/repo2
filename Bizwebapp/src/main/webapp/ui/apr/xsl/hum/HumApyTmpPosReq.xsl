<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="msgHumRctBasInfo">
 	 <xsl:variable name="localPath" select="1"/>  
			<body>	 
			 
			<script language="javascript">
				<![CDATA[
					function createForm(nm, tg, act, met){
						var cForm = document.createElement("form"); 
						cForm.name = nm;
						cForm.target = tg; 
						cForm.action = act;
						cForm.method = met;
						return cForm;
					}
					
					function createHidden(nm, val, frm){
						var hiddenInput=document.createElement("input");
						
						hiddenInput.setAttribute("type", "hidden");
						hiddenInput.setAttribute("name", nm);
						hiddenInput.setAttribute("value", val);
						frm.appendChild(hiddenInput);
						
						return frm;
					}
					
					function openTrainQstPage(pReqNo){
						
						window.open("","HumApyTmpPosReq",'width=1050,height=800,top=50,left=150'); 
						
						var frm = createForm("popFrm", "HumApyTmpPosReq", "http://biz.kitech.re.kr/filter/index.jsp", "get");
						frm = createHidden("serviceid", "H521", frm);
						frm = createHidden("reqNo", pReqNo, frm);											
						frm = createHidden("requestFlag", "H", frm);			/* 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */	
		
						document.body.appendChild(frm);
						frm.submit();
					}
					
					function openEvidWindow(reqNo){
						var url = "https://evid.kitech.re.kr/sd/view?CLS=50&amp;amp;RESL_NO=" + reqNo + "&amp;amp;EMP_NO=" + reqNo;
						url = url.replaceAll("amp;","");
						window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
					}
				]]>
			</script>
				
				<table width="100%" border="0" cellpadding="0"
					cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0"
								cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2'>기본정보(신규/계약변경)</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0"
					cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0"
								cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="12%">
										성명
									</td>
									<td class="contant">
										<xsl:value-of
											select="nm" />
									</td>
									<td class='title2' width="12%">
										주민번호
									</td>
									<td class="contant">
										<xsl:value-of
											select="resid_no" />
									</td>
									<td class='title2' width="12%">
										생년월일
									</td>
									<td class="contant">
										<xsl:value-of
											select="birthdt_mmdd" />
									</td>
									<td class='title2' width="12%">
										학력
									</td>
									<td class="contant">
										<xsl:value-of
											select="educ_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="12%">
										전화번호
									</td>
									<td class="contant">
										<xsl:value-of
											select="home_tel" />
									</td>
									<td class='title2' width="12%">
										핸드폰
									</td>
									<td class="contant">
										<xsl:value-of
											select="mobile" />
									</td>
									<td class='title2' width="12%">
										이메일
									</td>
									<td class="contant">
										<xsl:value-of
											select="email" />
									</td>
									<td class='title2' width="12%">
										병역
									</td>
									<td class="contant">
										<xsl:value-of
											select="milsvc_clsf_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="12%">
										본적주소
									</td>
									<td class="contant" colspan="7">
 										<xsl:value-of
											select="domic_addr" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="12%">
										현주소
									</td>
									<td class="contant" colspan="7">
										<xsl:value-of
											select="addr" />										
									</td>
								</tr>
								<tr>
									<td class="contant" colspan="6"
										align="center">
										<a>
											<xsl:attribute
												name="href">javascript:openTrainQstPage('<xsl:value-of
													select="req_no" />')</xsl:attribute>
											<b>상세정보 보기</b>
										</a>
									</td>
									
									<td class="contant" colspan="2"
										align="right">
										<a>
											<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="req_no" />')</xsl:attribute>
											<img src="http://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/>
										</a>
									</td>
									
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0"
					cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0"
								cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2'>계약정보</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0"
					cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0"
								cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="10%">문서번호</td>
									<td class="contant" width="23%" colspan="9">
										<xsl:value-of
													select="req_no" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="10%">직종</td>
									<td class="contant" width="23%">
										<xsl:value-of
											select="occutyp_nm" />
									</td>
									<td class='title2' width="12%">직급</td>
									<td class="contant" width="14%">
										<xsl:value-of
											select="posi_nm" />
									</td>
									<td class='title2' width="11%">직무구분</td>
									<td class="contant" colspan="3" width="30%">
										<xsl:value-of
											select="job_clsf_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>임용권자</td>
									<td class="contant">
										<xsl:value-of
											select="appont_nm" />
									</td>
									<td class='title2'>활용책임자</td>
									<td class="contant">
										<xsl:value-of
											select="pruse_nm" />
									</td>
									<td class='title2'>육아휴직자</td>
									<td class="contant" colspan="3">
										<xsl:value-of
											select="timeoff_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>계약부서</td>
									<td class="contant">
										<xsl:value-of
											select="pruse_dept_nm" />
									</td>
									<td class='title2'>계약기간</td>
									<td class="contant">
										<xsl:value-of
											select="contrct_start_ymd" /> ~ <xsl:value-of
											select="contrct_cls_ymd" />
									</td>
									<td class='title2'>계약근거</td>
									<td class="contant" colspan="3">
										<xsl:value-of
											select="contrct_base" />
									</td>
								</tr>
								<tr>
									<td class='title2'>경력년수</td>
									<td class="contant">
										<xsl:value-of
											select="carer_month_no" />
									</td>
									<td class='title2'>추가호봉</td>
									<td class="contant">
										<xsl:value-of
											select="add_slcls" />
									</td>
									<td class='title2'>환산비율</td>
									<td class="contant">
										<xsl:value-of
											select="convsn_rts" />
									</td>
									<td class='title2'>사정직급호</td>
									<td class="contant">
										<xsl:value-of
											select="auinsp_posi_nm" />
									</td>
								</tr>
							</table>
							<table width="100%" border="0"
								cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="10%">
										계약금액
									</td>
									<td class="contant-right"
										width="23%">
										<xsl:value-of
											select="format-number(contrct_base_amt,'#,###,###,###,###,###')" />
										(월 :
										<xsl:value-of
											select="format-number(month_contrct_base_amt,'#,###,###,###,###,###')" />
										)
									</td>
									<td class='title2' width="12%">
										기본정액
									</td>
									<td class="contant-right"
										width="14%">
										<xsl:value-of
											select="format-number(month_fxdamt_amt,'#,###,###,###,###,###')" />
									</td>
									<td class='title2' width="11%">
										연구활동비
									</td>
									<td class="contant-right"
										width="30%">
										<xsl:value-of
											select="format-number(month_resch_actn_amt,'#,###,###,###,###,###')" />
									</td>
								</tr>
								<tr>
									<td class='title2'>기타금액</td>
									<td class="contant-right">
										<xsl:value-of
											select="format-number(etc_contrct_amt,'#,###,###,###,###,###')" />
										(월 :
										<xsl:value-of
											select="format-number(month_etc_contrct_amt,'#,###,###,###,###,###')" />
										)
									</td>
									<td class='title2'>차량(교통)보조비</td>
									<td class="contant-right">
										<xsl:value-of
											select="format-number(trafc_sub_amt,'#,###,###,###,###,###')" />
									</td>
									<td class='title2'>선택적복지비</td>
									<td class="contant-right">
										<xsl:value-of
											select="format-number(selt_welfr_amt,'#,###,###,###,###,###')" />
									</td>
								</tr>
								<tr>
									<td class='title2'>계약총금액</td>
									<td class="contant-right">
										<xsl:value-of
											select="format-number(contrct_amt_sum,'#,###,###,###,###,###')" />
										(월 :
										<xsl:value-of
											select="format-number(month_contrct_amt_sum,'#,###,###,###,###,###')" />
										)
									</td>
									<td class='title2'>중식</td>
									<td class="contant-right">
										<xsl:value-of
											select="format-number(mid_meal_pay_amt,'#,###,###,###,###,###')" />
									</td>
									<td class='title2'>계약구분</td>
									<td class="contant">
										<xsl:value-of
											select="contrct_clsf_name" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<xsl:choose>
						<xsl:when test="occutyp_cd = '310000'">
							<tr style="height:30px">
								<table width="100%" border="0" cellpadding="0"
									cellspacing="0" class="aproutertable">
									<tr>
										<td class="body">
											<table width="100%" border="0"
												cellpadding="0" cellspacing="0" class="aprinnertable">
												<tr>
													<td class='title2'>근로시간 (월 <xsl:value-of select="month_work_time" /> 시간)</td>
												</tr>
											</table>
										</td>
									</tr>
								</table>
							</tr>
							<tr>
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<tr>
										<td class='title' style="border-left:1px solid #B9C3D1">구분</td>
										<td class='title'>월요일</td>
										<td class='title'>화요일</td>
										<td class='title'>수요일</td>
										<td class='title'>목요일</td>
										<td class='title'>금요일</td>
									</tr>
			
									<xsl:for-each select="MONTH_WORK/vector/data">
										<tr>
											<td class="contant-center" style="width: 170px;border-left:1px solid #B9C3D1">
												<xsl:value-of select="msgHumTmpWork03/time_gbn" />
											</td>
											<td class="contant-center" style="width: 170px;border-left:1px solid #B9C3D1">
												<xsl:if test="msgHumTmpWork03/mon_st_time != ''">
													<xsl:value-of select="msgHumTmpWork03/mon_st_time" />~<xsl:value-of select="msgHumTmpWork03/mon_end_time" />
												</xsl:if>
											</td>
											<td class="contant-center" style="width: 170px;border-left:1px solid #B9C3D1">
												<xsl:if test="msgHumTmpWork03/tue_st_time != ''">
													<xsl:value-of select="msgHumTmpWork03/tue_st_time" />~<xsl:value-of select="msgHumTmpWork03/tue_end_time" />
												</xsl:if>
											</td>
											<td class="contant-center" style="width: 170px;border-left:1px solid #B9C3D1">
												<xsl:if test="msgHumTmpWork03/wed_st_time != ''">
													<xsl:value-of select="msgHumTmpWork03/wed_st_time" />~<xsl:value-of select="msgHumTmpWork03/wed_end_time" />
												</xsl:if>
											</td>
											<td class="contant-center" style="width: 170px;border-left:1px solid #B9C3D1">
												<xsl:if test="msgHumTmpWork03/thu_st_time != ''">
													<xsl:value-of select="msgHumTmpWork03/thu_st_time" />~<xsl:value-of select="msgHumTmpWork03/thu_end_time" />
												</xsl:if>
											</td>
											<td class="contant-center" style="width: 170px;border-left:1px solid #B9C3D1">
												<xsl:if test="msgHumTmpWork03/fri_st_time != ''">
													<xsl:value-of select="msgHumTmpWork03/fri_st_time" />~<xsl:value-of select="msgHumTmpWork03/fri_end_time" />
												</xsl:if>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</tr>
						</xsl:when>
					</xsl:choose>
					
				</table>
				<TABLE width="100%" border="0" cellpadding="0"
					cellspacing="0" class="aproutertable">
					<xsl:if test="count(fileList_A/vector/data/mdata)!=0">
						<TR>
							<TD align="left" class="head">첨부파일</TD>
							
							<TD align="right" class="head">
								<a>
								<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="req_no" />')</xsl:attribute>
								<img src="http://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/>
								</a>
							</TD>
							
						</TR>
						<TR>
							<TD class="body" colspan="2">
								<TABLE width="100%" border="0"
									cellpadding="0" cellspacing="0" class="aprinnertable">
									<xsl:for-each
										select="fileList_A/vector/data/mdata/msgXomxComAttachFileMS01">
										<TR>
											<TD class="contant">
												<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA003')</xsl:attribute>
												<xsl:value-of select="file_nm" /><br/>
												</a>
											</TD>
										</TR>
									</xsl:for-each>
								</TABLE>
							</TD>
						</TR>
					</xsl:if>
				</TABLE>
			</body>		
	</xsl:template>
</xsl:stylesheet>