<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
			<BODY>
			<script language="javascript">
				<![CDATA[
					function openTransReasonOZPop(airReqNo){
						var ozFileNm = "ccs/ctr/CtrAirMileReq.ozr";
						var ozrNm = "CtrAirMile";
						var url = "http://biz.kitech.re.kr/websquare/popup.html?w2xPath=/kitech/com/oz/ComPopupOZReport.xml";
						var node = url+"&ozr="+ozFileNm+"&odi="+ozrNm+"&printMode=Y&param=req_no^"+airReqNo;		
						node = node.replace(/amp;amp;/g,"");
						if(navigator.appName != "Microsoft Internet Explorer"){
							node = node.replace(/amp;/g,"");
						}
	
						window.open(node,"OZReport", "width=1012px, height=610px, location=no, resizable=yes");   
					}
					
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

						hiddenInput.setAttribute("type", "hidden");
						hiddenInput.setAttribute("name", nm);
						hiddenInput.setAttribute("value", val);
						frm.appendChild(hiddenInput);
						
						return frm;
					}
					
					function openFilePop (attachFileNo) {
						window.open("","smlRvew",'width=616,height=119,top=150,left=150');
						var frm = createForm("popFrm", "smlRvew", "http://biz.kitech.re.kr/websquare/popup.html", "get");
						frm = createHidden("w2xPath", "/kitech/res/twe/ResGridAttachPop.xml", frm);
						frm = createHidden("popupID", "smlRvew", frm);
						frm = createHidden("w2xHome", "/kitech/res/twe/", frm);
						frm = createHidden("attach_file_no", attachFileNo, frm);
						document.body.appendChild(frm);
						frm.submit();
					}
					
					/* 크리스피드 이원길 미리보기 시작 */
					function openEvidWindow(unslipNo){
						unslipNo = unslipNo.replace(/^\s\s*/, '').replace(/\s\s*$/, '');
						var url = "https://evid.kitech.re.kr/sd/view?CLS=50&amp;amp;amp;RESL_NO=" + unslipNo + "&amp;amp;amp;EMP_NO=" + unslipNo;
						url = url.replaceAll("amp;","");
						window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
					}
					/* 크리스피드 이원길 미리보기 끝 */
				]]>
			</script>
			<xsl:if test="contains(request/crudInfo/apr_after_flag, 'Y')">
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
									<td width="10%" class="title2">사 유</td>
									<td width="90%" class="contant">
										<xsl:value-of select="request/crudInfo/apr_after_reason" />
									</td>
								</tr>				
							</table>
						</td>
					</tr>
				</table>
			</xsl:if>
				<INPUT type="hidden" name="FilePath" size="25" />
				<INPUT type="hidden" name="orgFileName" size="25" />
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">신청정보</td>
						<td align="right" valign="bottom">
							<a>
								<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="request/crudInfo/req_no" />')</xsl:attribute>
								<img src="http://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/>
							</a>
						</td>
					</tr>
					<tr>
			     		<td colspan="2" class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">								
								<tr>
									<td class="title2">작성자</td>
									<td width="22%" class="contant">										
										<xsl:value-of
											select="request/crudInfo/apr_nm" />
										<xsl:value-of
											select="request/crudInfo/apr_req_empno" />
									</td>
									<td class="title2">소속</td>
									<td width="22%" class="contant">
											<xsl:value-of
											select="request/crudInfo/apr_req_dept" />
									</td>
									<td class="title2">신청번호</td>
									<td width="22%" class="contant">
										 <xsl:value-of
											select="request/crudInfo/apr_req_no" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">출장자</td>
					</tr>
					<tr>
					     <td class="body">
					     	<table width="100%" class="aprinnertable">								
								<tr>
									<td width="5%" class="title">구분</td>
									<td width="10%" class="title">성명</td>
									<td width="10%" class="title">소속</td>
									<td width="10%" class="title">직급구분</td>
								    <td width="10%" class="title">직무대행</td>
								</tr>
								<xsl:for-each select="request/ctrOverCompn/aprCompn/vector/data">
								<xsl:variable name="biztrip_psn_clsf" select="msgCtrOverCompnMS01/apr_biztrip_psn_nm" />
							    <xsl:variable name="biztrip_psn_empno" select="msgCtrOverCompnMS01/biztrip_psn_empno" />
								<xsl:variable name="biztrip_psn_nm" select="msgCtrOverCompnMS01/biztrip_psn_nm" />
								<xsl:variable name="posi_clsf" select="msgCtrOverCompnMS01/apr_posi_clsf" />
								<xsl:variable name="biztrip_dept_nm" select="msgCtrOverCompnMS01/biztrip_dept_nm" />
								<xsl:variable name="biztrip_posi_nm" select="msgCtrOverCompnMS01/biztrip_posi_nm" />
								<xsl:variable name="agent_empno" select="msgCtrOverCompnMS01/apr_agent_empno" />
								<xsl:variable name="agent_nm" select="msgCtrOverCompnMS01/agent_nm" />
								<tr>
									<td width="5%" class="contant-center">
									 	<xsl:value-of select="$biztrip_psn_clsf"/>
								    </td>
								    <td width="10%" class="contant">									 	
									 	<xsl:value-of select="$biztrip_psn_nm"/>
									 	(<xsl:value-of select="$biztrip_psn_empno"/>)
								    </td>		
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$biztrip_dept_nm"/>
								    </td>								
								    <td width="10%" class="contant-center">
									 	<xsl:value-of select="$biztrip_posi_nm"/>/<xsl:value-of select="$posi_clsf"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$agent_nm"/>
									 	<xsl:value-of select="$agent_empno"/>
								    </td>										
								</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">동반자</td>
					</tr>
					<tr>
					     <td class="body">
					     	<table width="100%" class="aprinnertable">								
								<tr>
									<td width="5%" class="title">구분</td>
									<td width="10%" class="title">성명</td>
									<td width="10%" class="title">주민번호</td>
								    <td width="10%" class="title">소속</td>
								    <td width="10%" class="title">직급구분</td>
	   							    <td width="10%" class="title">직무대행</td>
								</tr>
								<xsl:for-each select="request/ctrOverCompn/aprCompn01/vector/data">
								<xsl:variable name="biztrip_psn_clsf" select="msgCtrOverCompnMS01/apr_biztrip_psn_nm" />
							    <xsl:variable name="biztrip_psn_empno" select="msgCtrOverCompnMS01/apr_biztrip_psn_empno" />
								<xsl:variable name="biztrip_psn_nm" select="msgCtrOverCompnMS01/biztrip_psn_nm" />
								<xsl:variable name="resid_no" select="msgCtrOverCompnMS01/resid_no" />
								<xsl:variable name="posi_clsf" select="msgCtrOverCompnMS01/posi_clsf" />
								<xsl:variable name="biztrip_dept_nm" select="msgCtrOverCompnMS01/biztrip_dept_nm" />
								<xsl:variable name="biztrip_posi_nm" select="msgCtrOverCompnMS01/biztrip_posi_nm" />								
								<xsl:variable name="agent_empno" select="msgCtrOverCompnMS01/apr_agent_empno" />
								<xsl:variable name="agent_nm" select="msgCtrOverCompnMS01/agent_nm" />
								<tr>
									<td width="5%" class="contant-center">
									 	<xsl:value-of select="$biztrip_psn_clsf"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$biztrip_psn_nm"/>
									 	<xsl:value-of select="$biztrip_psn_empno"/>
								    </td>										
								    <td width="10%" class="contant-center">
									 	<xsl:value-of select="$resid_no"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$biztrip_dept_nm"/>
								    </td>
								    <td width="10%" class="contant-center">
									 	<xsl:value-of select="$biztrip_posi_nm"/>/<xsl:value-of select="$posi_clsf"/>
								    </td>								    
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$agent_nm"/>
									 	<xsl:value-of select="$agent_empno"/>
								    </td>
								</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
					</table>
					<table width="100%" class="aproutertable">			
						<tr>
							<td class="head">출장일정</td>
						</tr>
						<tr>
						     <td class="body">
						     	<table width="100%" class="aprinnertable">								
									<tr>
										<td width="13%" class="title2">출장일자</td>
										<td width="42%" class="contant">
											<xsl:value-of select="request/crudInfo/apr_biztrip_start_ymd" /> ~ <xsl:value-of select="request/crudInfo/apr_biztrip_cls_ymd" />
											<xsl:text disable-output-escaping="yes"></xsl:text>
											[<xsl:value-of select="request/crudInfo/biztrip_nght" />박 <xsl:value-of select="request/crudInfo/biztrip_day" />일]
											기내 <xsl:value-of select="request/crudInfo/cabin_night" />박 <xsl:value-of select="request/crudInfo/cabin_meal" />식
										</td>
										<td width="13%" class="title2">출장지</td>
										<td width="32%" class="contant">
											[<xsl:value-of select="request/crudInfo/apr_biztrip_region" />] <xsl:value-of select="request/crudInfo/apr_biztrip_city" />
										</td>
									</tr>
									<tr>
										<td class="title2">출장목적</td>
										<td colspan="3" class="contant">
											[<xsl:value-of select="request/crudInfo/apr_biztrip_goal_clsf" />]
											<xsl:value-of select="request/crudInfo/biztrip_goal" />
										</td>
									</tr>								
									<tr>
										<td class="title2">방문처</td>
										<td colspan="3" class="contant">
											<xsl:value-of
												select="request/crudInfo/biztrip_land_info" />
										</td>
									</tr>
									<tr>
										<td class="title2">방문기관</td>
										<td colspan="3" class="contant">
											[<xsl:value-of
												select="request/crudInfo/apr_biztrip_agncy_yn" />]
											<xsl:value-of
												select="request/crudInfo/agncy_cd_nm_1" /><xsl:text disable-output-escaping="yes"></xsl:text>
											<xsl:value-of
												select="request/crudInfo/agncy_cd_nm_2" /><xsl:text disable-output-escaping="yes"></xsl:text>
											<xsl:value-of
												select="request/crudInfo/agncy_cd_nm_3" />		
										</td>
									</tr>
									<tr>
										<td width="10%" class="title2">정보기기 반출</td>
										<td colspan="3" class="contant">
											(<xsl:if test="contains(request/crudInfo/apr_notebook_out, 'Y')">
												√
											</xsl:if>) 노트북반출    
											(<xsl:if test="contains(request/crudInfo/apr_usb_out, 'Y')">
												√
											</xsl:if>) 휴대용저장매체반출
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
					<table width="100%" class="aproutertable">				
						<tr>
					     	<td class="body">
					     		<table width="100%" class="aprinnertable">							
									<tr>
										<td width="22%" class="title">일자</td>
										<td width="11%" class="title">주요면담자</td>
										<td width="11%" class="title">면담자연락처</td>
										<td width="16%" class="title">방문기관</td>
										<td width="50%" class="title">활동내역</td>
									</tr>
								<xsl:for-each select="request/crudInfo/sched/vector/data">
									<xsl:variable name="start_ymd" select="msgCtrOverSeaSchedMS01/apr_start_ymd" />
								    <xsl:variable name="cls_ymd" select="msgCtrOverSeaSchedMS01/apr_cls_ymd" />
								    <xsl:variable name="major_intrv_psn" select="msgCtrOverSeaSchedMS01/major_intrv_psn" />
								    <xsl:variable name="major_intrv_tel" select="msgCtrOverSeaSchedMS01/major_intrv_tel" />
								    <xsl:variable name="agncy_nm" select="msgCtrOverSeaSchedMS01/agncy_nm" />
								    <xsl:variable name="actn_detls" select="msgCtrOverSeaSchedMS01/actn_detls" />
									<tr>
										<td class="contant-center"><xsl:value-of select="$start_ymd"/>~<xsl:value-of select="$cls_ymd"/></td>
									    <td class="contant"><xsl:value-of select="$major_intrv_psn"/></td>
									    <td class="contant"><xsl:value-of select="$major_intrv_tel"/></td>
									    <td class="contant"><xsl:value-of select="$agncy_nm"/></td>
									    <td class="contant"><xsl:value-of select="$actn_detls"/></td>
									</tr>
								</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				<xsl:if test="request/crudInfo/Holy_day != '0'">
					<table width="100%" class="aproutertable">			
						<tr>
							<td class="head">휴무/휴일 관리</td>
						</tr>
						<tr>
						     <td class="body">
					     		<table width="100%" class="aprinnertable">							
									<tr>
										<td width="12%" class="title" colSpan="2">성명</td>
										<td width="12%" class="title">일자</td>
										<td width="11%" class="title">요일</td>
										<td width="12%" class="title">요일구분</td>
										<td width="12%" class="title">근무구분</td>
										<td width="13%" class="title">대체휴일</td>
										<td width="40%" class="title">활동내역</td>
									</tr>
								<xsl:for-each select="request/crudInfo/aprHolyday01/vector/data">
									<xsl:variable name="biztrip_nm" select="msgCtrBizTripRstMS01/biztrip_nm" />
									<xsl:variable name="biztrip_empno" select="msgCtrBizTripRstMS01/biztrip_empno" />																	
									<xsl:variable name="biztrip_day" select="msgCtrBizTripRstMS01/biztrip_day" />
								    <xsl:variable name="weekday" select="msgCtrBizTripRstMS01/weekday" />
								    <xsl:variable name="day_clsf" select="msgCtrBizTripRstMS01/day_clsf" />
								    <xsl:variable name="rest_cd" select="msgCtrBizTripRstMS01/rest_cd" />
								    <xsl:variable name="holiday_alt_day" select="msgCtrBizTripRstMS01/holiday_alt_day" />
								    <xsl:variable name="detls_scheads" select="msgCtrBizTripRstMS01/detls_scheads" />
									<tr>
										<td class="contant-center"><xsl:value-of select="$biztrip_nm"/></td>
										<td class="contant-center"><xsl:value-of select="$biztrip_empno"/></td>
										<td class="contant-center"><xsl:value-of select="$biztrip_day"/></td>
									    <td class="contant-center"><xsl:value-of select="$weekday"/></td>
									    <td class="contant-center"><xsl:value-of select="$day_clsf"/></td>
									    <td class="contant-center"><xsl:value-of select="$rest_cd"/></td>
									    <td class="contant-center"><xsl:value-of select="$holiday_alt_day"/></td>
									    <td class="contant-center"><xsl:value-of select="$detls_scheads"/></td>
									</tr>
								</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>		
				<xsl:if test="contains(request/crudInfo/apr_cvn_req_no, 'C68')">
					<table width="100%" class="aproutertable">			
						<tr>
							<td class="head">외부강의</td>
						</tr>
						<tr>
						     <td class="body">
						     	<table width="100%" class="aprinnertable">								
									<tr>
										<td width="13%" class="title2">신고번호</td>
										<td width="37%" class="contant">
											<xsl:value-of select="request/crudInfo/apr_cvn_req_no" />
										</td>
										<td width="13%" class="title2">주제</td>
										<td width="37%" class="contant">
											<xsl:value-of select="request/crudInfo/apr_subject" />
										</td>
									</tr>									
									<tr>
										<td width="13%" class="title2">요청기관</td>
										<td width="37%" class="contant">
											<xsl:value-of select="request/crudInfo/apr_invite_org" />
										</td>
										<td width="13%" class="title2">강의일시</td>
										<td width="37%" class="contant">
											<xsl:value-of select="request/crudInfo/apr_period_days" />
										</td>
									</tr>									
									<tr>
										<td width="13%" class="title2">댓가(원)</td>
										<td width="37%" class="contant">
											<xsl:value-of select="request/crudInfo/apr_reward_amt" />
										</td>
										<td width="13%" class="title2">월간누적</td>
										<td width="37%" class="contant">
											<xsl:value-of select="request/crudInfo/apr_acc_month" />
										</td>
									</tr>				
								</table>
							</td>
						</tr>
					</table>					
				</xsl:if>
									
					<table width="100%" class="aproutertable">	
						<tr>
							<td class="head">출장경비<span style="color:red;" ><xsl:value-of select="request/crudInfo/apr_expns_desc" /></span></td>
						</tr>					
						<tr>
						     <td class="body">
						     	<table width="100%" class="aprinnertable">								
									<tr>
										<td colspan="9" class="contant-right">신청환율 :
										
											 <xsl:value-of
												select="request/crudInfo/apr_req_exchgr" />원/$
										</td>
									</tr>
									<tr>
										<td width="5%" rowspan="2" class="title">성명</td>
										<td width="7%" class="title">운임비(\)</td>
										<td width="8%" class="title">운임구분</td>
										<td width="8%" class="title">항공등급</td>
									    <td width="10%" class="title">일비($)</td>
		   							    <td width="10%" class="title">숙박비($)</td>
		   							    <td width="10%" class="title">식비($)</td>
		   							    <td width="10%" class="title">보험료(\)</td>
		   							    <td width="5%" rowspan="2" class="title">합계</td>
									</tr>
									<tr>
										<td width="7%" colspan="3" class="title">비고</td>
										<td width="8%" class="title">비고</td>
									    <td width="10%" class="title">비고</td>
		   							    <td width="10%" class="title">비고</td>
		   							    <td width="10%" class="title">비고</td>
									</tr>
									<xsl:for-each select="request/crudInfo/expns/vector/data">
									<xsl:variable name="nm" select="msgCtrOverExpnsMS01/nm" />
								    <xsl:variable name="won_fare_fee" select="msgCtrOverExpnsMS01/won_fare_fee" />
									<xsl:variable name="fare_clsf" select="msgCtrOverExpnsMS01/apr_fare_clsf" />
									<xsl:variable name="flight_grd" select="msgCtrOverExpnsMS01/apr_flight_grd" />
									<xsl:variable name="won_fare_fee_rmk" select="msgCtrOverExpnsMS01/won_fare_fee_rmk" />
									<xsl:variable name="ymd_fee" select="msgCtrOverExpnsMS01/ymd_fee" />
									<xsl:variable name="ymd_fee_rmk" select="msgCtrOverExpnsMS01/ymd_fee_rmk" />
									<xsl:variable name="lodg_fee" select="msgCtrOverExpnsMS01/lodg_fee" />
									<xsl:variable name="lodg_fee_rmk" select="msgCtrOverExpnsMS01/lodg_fee_rmk" />
									<xsl:variable name="meal_fee" select="msgCtrOverExpnsMS01/meal_fee" />
									<xsl:variable name="meal_fee_rmk" select="msgCtrOverExpnsMS01/meal_fee_rmk" />
									<xsl:variable name="trip_insr_fee" select="msgCtrOverExpnsMS01/trip_insr_fee" />
									<xsl:variable name="trip_insr_fee_rmk" select="msgCtrOverExpnsMS01/trip_insr_fee_rmk" />
									<xsl:variable name="won_tot_expns" select="msgCtrOverExpnsMS01/won_tot_expns" />
									<xsl:variable name="tot_amt_rmk" select="msgCtrOverExpnsMS01/tot_amt_rmk" />
									<tr>
										<td width="5%" rowspan="2" class="contant-center">
										 	<xsl:value-of select="$nm"/>
									    </td>
									    <td width="7%" class="contant-right">
										 	<xsl:value-of select="$won_fare_fee"/>
									    </td>
									    <td width="8%" class="contant-center">
										 	<xsl:value-of select="$fare_clsf"/>
									    </td>
									    <td width="8%" class="contant-center">
										 	<xsl:value-of select="$flight_grd"/>
									    </td>
									    <td width="10%" class="contant-right">
										 	<xsl:value-of select="$ymd_fee"/>
									    </td>
									    <td width="10%" class="contant-right">
										 	<xsl:value-of select="$lodg_fee"/>
									    </td>
									    <td width="10%" class="contant-right">
										 	<xsl:value-of select="$meal_fee"/>
									    </td>
									    <td width="10%" class="contant-right">
										 	<xsl:value-of select="$trip_insr_fee"/>
									    </td>
									    <td width="10%" class="contant-right">
									    	<xsl:value-of select="format-number($won_tot_expns,'#,###,###,###,###,###')"/>
									    </td>
									</tr>
									<tr>
									    <td width="7%" colspan="3" class="contant">
										 	<xsl:value-of select="$won_fare_fee_rmk"/>
									    </td>
									    <td width="8%" class="contant">
										 	<xsl:value-of select="$ymd_fee_rmk"/>
									    </td>
									    <td width="10%" class="contant">
										 	<xsl:value-of select="$lodg_fee_rmk"/>
									    </td>
									    <td width="10%" class="contant">
										 	<xsl:value-of select="$meal_fee_rmk"/>
									    </td>
									    <td width="10%" class="contant">
										 	<xsl:value-of select="$trip_insr_fee_rmk"/>
									    </td>
									    <td width="10%" class="contant">
										 	<xsl:value-of select="$tot_amt_rmk"/>
									    </td>
									</tr>
									</xsl:for-each>
									<tr bgcolor="#EEEEEE">
									    <td width="5%" class="contant" style="text-align:center">
									    합계											 	
									    </td>
									    <td width="23%" colspan="3" class="contant-right">
										 	<xsl:value-of
													select="request/crudInfo/apr_won_fare_fee" />
									    </td>
									    <td width="10%" class="contant-right">
										 	<xsl:value-of
													select="request/crudInfo/apr_ymd_fee" />
									    </td>
									    <td width="10%" class="contant-right">
										 	<xsl:value-of
													select="request/crudInfo/apr_lodg_fee" />
									    </td>
									    <td width="10%" class="contant-right">
										 	<xsl:value-of
													select="request/crudInfo/apr_meal_fee" />
									    </td>
									    <td width="10%" class="contant-right">
										 	<xsl:value-of
													select="request/crudInfo/apr_trip_insr_fee" />
									    </td>
									    <td width="10%" class="contant-right">
										 	<xsl:value-of
													select="request/crudInfo/apr_won_tot_expns" />
									    </td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
					<table width="100%" class="aproutertable">
						<tr>
							<td class="head">항공마일리지 신청내역</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" class="aprinnertable">
									<tr>
										<td class="title">항공마일리지번호</td>
										<td class="title">사번</td>
										<td class="title">성명</td>
										<td class="title">항공사</td>
										<td class="title">마일리지사용유무</td>
										<td class="title">첨부파일</td>
									</tr>
									<xsl:variable name="apr_air_count" select="count(request/crudInfo/selectAirMileageMulti/vector/data)" />
									<xsl:for-each select="request/crudInfo/selectAirMileageMulti/vector/data">
									<xsl:variable name="empno" select="mdata/empno" />
									<xsl:variable name="syspaynm" select="mdata/syspaynm" />
									<xsl:variable name="air_nm" select="mdata/air_nm" />
									<xsl:variable name="req_no" select="mdata/req_no" />
									<xsl:variable name="use_mile_yn" select="mdata/use_mile_yn" />
									<xsl:variable name="attach_file_no" select="mdata/attach_file_no_req" />
									<tr>
										<xsl:if test="position()=1">
										<td width="25%" class="contant-center">
											<xsl:attribute name="rowspan"><xsl:value-of select="$apr_air_count" /></xsl:attribute>
											<a>
												<xsl:attribute name="href">javascript:openTransReasonOZPop("<xsl:value-of select="$req_no" />")</xsl:attribute>
												<xsl:value-of select="$req_no" />
											</a>
										</td>
										</xsl:if>
										<td width="15%" class="contant-center">
											<xsl:value-of select="$empno"/>
										</td>										
										<td width="15%" class="contant-center">
											<xsl:value-of select="$syspaynm"/>
										</td>
										<td width="15%" class="contant-center">
											<xsl:value-of select="$air_nm"/>
										</td>
										<td width="30%" class="contant-center">
											<xsl:if test="$use_mile_yn != 'Y'">
												미사용
											</xsl:if>
											<xsl:if test="$use_mile_yn = 'Y'">
												사용
											</xsl:if>
										</td>
										<td width="15%" class="contant-center">
											<a>
												<xsl:attribute name="href">javascript:openFilePop('<xsl:value-of select="$attach_file_no" />')</xsl:attribute>
												<xsl:value-of select="$attach_file_no" />
											</a>
										</td>
									</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
					<table width="100%" class="aproutertable">
					<tr>
						<td class="head">계정내역</td>
					</tr>
					<tr>
					     <td class="body">
					     	<table width="100%" class="aprinnertable">								
								<tr>
									<td class="title">계정번호</td>
									<td class="title">계정명</td>
									<td class="title">비용</td>
									<td class="title">금액</td>
								    <td class="title">계정책임자</td>
	   							    <td class="title">통제번호</td>
								</tr>
								<xsl:for-each select="request/crudInfo/accnt/vector/data">
								<xsl:variable name="accnt_no" select="msgCtrOverAccntMS01/accnt_no" />
							    <xsl:variable name="accnt_nm" select="msgCtrOverAccntMS01/accnt_nm" />
								<xsl:variable name="expns_cd" select="msgCtrOverAccntMS01/apr_expns_nm" />
								<xsl:variable name="won_amt" select="msgCtrOverAccntMS01/apr_won_amt" />
								<xsl:variable name="accnt_respn_psn_empno" select="msgCtrOverAccntMS01/apr_accnt_respn_psn_empno" />
								<xsl:variable name="accnt_respn_psn_nm" select="msgCtrOverAccntMS01/accnt_respn_psn_nm" />
								<xsl:variable name="bugt_ctrl_no" select="msgCtrOverAccntMS01/bugt_ctrl_no" />
								<xsl:variable name="req_seq" select="msgCtrOverAccntMS01/req_seq" />
								<tr>
									<td width="3%" class="contant-center">
									 	<xsl:value-of select="$accnt_no"/>
								    </td>
								    <td width="15%" class="contant">
									 	<xsl:value-of select="$accnt_nm"/>
								    </td>
								    <td width="5%" class="contant-center">
								    	<xsl:attribute name="id">
											<xsl:text>expnsCd</xsl:text>
											<xsl:value-of select="$req_seq"/>
										</xsl:attribute>
									 	<xsl:value-of select="$expns_cd"/>
								    </td>
								    <td width="5%" class="contant-right">
									    <xsl:attribute name="id">
											<xsl:text>reqAmt</xsl:text>
											<xsl:value-of select="$req_seq"/>
										</xsl:attribute>
									 	<xsl:value-of select="$won_amt"/>
								    </td>
								    <td width="8%" class="contant">
									 	<xsl:value-of select="$accnt_respn_psn_nm"/>
									 	<xsl:value-of select="$accnt_respn_psn_empno"/>
								    </td>										
								    <td width="8%" class="contant">
									    <xsl:attribute name="id">
											<xsl:text>ctrlNo</xsl:text>
											<xsl:value-of select="$req_seq"/>
										</xsl:attribute>
									 	<xsl:value-of select="$bugt_ctrl_no"/>
								    </td>
								</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">지급내역</td>
					</tr>
					<tr>
					     <td class="body">
					     	<table width="100%" class="aprinnertable">								
								<tr>
									<td class="title">지급구분</td>
									<td class="title">출장자</td>
									<td class="title">금액</td>
								    <td class="title">은행</td>
	   							    <td class="title">계좌번호</td>
	   							    <td class="title">예금주명</td>
								</tr>
								<xsl:for-each select="request/crudInfo/pay/vector/data">
								<xsl:variable name="payClsf" select="msgCtrOverPayMS01/apr_payClsf" />
							    <xsl:variable name="biztrip_psn_empno" select="msgCtrOverPayMS01/apr_biztrip_psn_empno" />
								<xsl:variable name="biztrip_psn_nm" select="msgCtrOverPayMS01/biztrip_psn_nm" />
								<xsl:variable name="won_tot_expns" select="msgCtrOverPayMS01/apr_won_tot_expns" />
								<xsl:variable name="bank_cd" select="msgCtrOverPayMS01/apr_bank_cd" />
								<xsl:variable name="bankaccnt_no" select="msgCtrOverPayMS01/bankaccnt_no" />
								<xsl:variable name="depstr" select="msgCtrOverPayMS01/depstr" />
								<tr>
									<td width="5%" class="contant-center">
									 	<xsl:value-of select="$payClsf"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$biztrip_psn_nm"/>
									 	<xsl:value-of select="$biztrip_psn_empno"/>
								    </td>										
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="$won_tot_expns"/>
								    </td>
								    <td width="10%" class="contant-center">
									 	<xsl:value-of select="$bank_cd"/>
								    </td>
								    <td width="10%" class="contant-center">
									 	<xsl:value-of select="$bankaccnt_no"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$depstr"/>
								    </td>
								</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">해외출장계획서</td>
					</tr>
					<tr>
					     <td class="body">
					     	<table width="100%" class="aprinnertable">					     									
								<tr>
									<td width="20%" class="title2">1. 출장자 인적사항</td>
									<td class="contant">
										<xsl:value-of
											select="translate(request/crudInfo/apr_human_item, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />
									</td>
								</tr>
								<tr>
									<td class="title2">2. 출장 세부일정</td>
									<td class="contant">
										<xsl:value-of
											select="translate(request/crudInfo/apr_detls_sched, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />
									</td>
								</tr>
								<tr>
									<td class="title2">3. 최근 1년간 출장경력</td>
									<td class="contant">
										<xsl:value-of
											select="translate(request/crudInfo/apr_biztrip_carer, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />
									</td>
								</tr>
								<tr>
									<td class="title2">4. 접촉 예정인물</td>
									<td class="contant">
										<xsl:value-of
											select="translate(request/crudInfo/apr_contac_objct, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />
									</td>
								</tr>
							</table>
						</td>
					</tr>				
				</table>		
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">사업(출장)계획서, 관련증빙</td>
					</tr>
					<tr>
					     <td class="body">
					     	<table width="100%" class="aprinnertable">					     									
								<tr>
									<td width="20%" class="title2">첨부파일</td>
									<td class="contant">
										<xsl:for-each select="request/crudInfo/fileList_A/vector/data/mdata">	
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA006')</xsl:attribute>
												<xsl:value-of select="file_nm" /><br/>
											</a>
										</xsl:for-each>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<iframe name="ifr" height="0" width="0"></iframe>
			</BODY>			
	</xsl:template>
</xsl:stylesheet>