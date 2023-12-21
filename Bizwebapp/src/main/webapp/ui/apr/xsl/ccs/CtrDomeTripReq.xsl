<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
 	 <xsl:variable name="localPath" select="1"/>
			<body>
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
					//function openEvidWindow(unslipNo){
					//	unslipNo = unslipNo.replace(/^\s\s*/, '').replace(/\s\s*$/, '');
					//	var url = "//evid.kitech.re.kr/sd/view?CLS=50&amp;amp;amp;RESL_NO=" + unslipNo + "&amp;amp;amp;EMP_NO=" + unslipNo;
					//	url = url.replaceAll("amp;","");
					//	window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
					//}
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
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">신청정보</td>
						<!-- <td align="right" valign="bottom">
							<a>
								<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="request/crudInfo/req_no" />')</xsl:attribute>
								<img src="http://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/>
							</a>
						</td> -->
					</tr>
					<tr>
			     		<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">							
								<tr>
									<td class="title2">작성자</td>
									<td width="20%" class="contant">									
										<xsl:value-of
											select="request/crudInfo/apr_nm" />
										<xsl:value-of
											select="request/crudInfo/apr_empno" />
									</td>
									<td class="title2">소속</td>
									<td width="20%" class="contant">
											<xsl:value-of
											select="request/crudInfo/apr_req_dept" />
									</td>
									<td class="title2">신청번호</td>
									<td width="20%" class="contant">
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
									<td class="title2">성명</td>
									<td width="16%" class="contant">									
										<xsl:value-of
											select="request/crudInfo/biztrip_psn_nm" />
										<xsl:value-of
											select="request/crudInfo/apr_req_empno" />
									</td>
									<td class="title2">소속</td>
									<td width="16%" class="contant">
										<xsl:value-of
											select="request/crudInfo/apr_biztrip_psn_dept" />
									</td>
									<td class="title2">직급구분</td>
									<td width="16%" class="contant">
										<xsl:value-of
											select="request/crudInfo/apr_biztrip_psn_posi" />/
										 <xsl:value-of
											select="request/crudInfo/apr_posi" />
									</td>
									<td class="title2">직무대행</td>
									<td width="16%" class="contant">
										 <xsl:value-of
											select="request/crudInfo/apr_agent_nm" />
									     <xsl:value-of
											select="request/crudInfo/apr_agent_empno" />
									</td>
								</tr>
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
									<td width="15%" class="title">주민번호</td>
								    <td width="15%" class="title">소속</td>
	   							    <td width="10%" class="title">직무대행</td>		   							
								</tr>
								<xsl:for-each select="request/crudInfo/compn/vector/data">
								<xsl:variable name="apr_biztrip_psn_nm" select="msgCtrDomCompnMS01/apr_biztrip_psn_nm" />
							    <xsl:variable name="biztrip_psn_empno" select="msgCtrDomCompnMS01/apr_biztrip_psn_empno" />
								<xsl:variable name="biztrip_psn_nm" select="msgCtrDomCompnMS01/biztrip_psn_nm" />
								<xsl:variable name="resid_no" select="msgCtrDomCompnMS01/resid_no" />
								<xsl:variable name="biztrip_dept_nm" select="msgCtrDomCompnMS01/biztrip_dept_nm" />
								<xsl:variable name="agent_nm" select="msgCtrDomCompnMS01/agent_nm" />
								<xsl:variable name="agent_empno" select="msgCtrDomCompnMS01/apr_agent_empno" />
								<tr>
									<td width="5%" class="contant-center">										
									 	<xsl:value-of select="$apr_biztrip_psn_nm"/>
								    </td>
								    <td width="10%" class="contant">								 	
									 	<xsl:value-of select="$biztrip_psn_nm"/>
									 	<xsl:value-of select="$biztrip_psn_empno"/>
								    </td>									
								    <td width="15%" class="contant-center">
									 	<xsl:value-of select="$resid_no"/>
								    </td>
								    <td width="15%" class="contant">
									 	<xsl:value-of select="$biztrip_dept_nm"/>
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
									<td width="37%" class="contant">
										<xsl:value-of
											select="request/crudInfo/apr_biztrip_start_ymd" />
										~<xsl:value-of
											select="request/crudInfo/apr_biztrip_cls_ymd" /><xsl:text disable-output-escaping="yes"><![CDATA[&nbsp;]]></xsl:text>
										[<xsl:value-of
											select="request/crudInfo/biztrip_nght" />박
										<xsl:value-of
											select="request/crudInfo/biztrip_day" />일	]									
									</td>
									<td width="13%" class="title2">출장경로</td>
									<td width="37%" class="contant">
										[<xsl:value-of
											select="request/crudInfo/apr_biztrip_way" />]
										<xsl:value-of
											select="request/crudInfo/apr_start_region" />=>
										<xsl:value-of
											select="request/crudInfo/apr_arriv_region" />									
									</td>
								</tr>
								<tr>
									<td class="title2">출장목적</td>
									<td colspan="3" class="contant">
										(<xsl:value-of select="request/crudInfo/apr_biztrip_goal_clsf" />)
										<xsl:value-of select="request/crudInfo/biztrip_goal" />
									</td>
								</tr>
								<tr>
									<td class="title2">방문처</td>
									<td class="contant">
										<xsl:value-of select="request/crudInfo/apr_cust_nm" />
										<xsl:value-of select="request/crudInfo/biztrip_region" />
									</td>
									<td class="title2">차량사용</td>
									<td class="contant">										
										<xsl:value-of select="request/crudInfo/apr_car_use_yn" />
										<xsl:value-of select="request/crudInfo/car_accnt_no" />
									</td>
								</tr>
								<tr>
									<td class="title2">원내출장 여부</td>
									<td class="contant">
										(<xsl:if test="contains(request/crudInfo/apr_internal_region, 'Y')">
											√
										</xsl:if>) 원내
										(<xsl:if test="contains(request/crudInfo/apr_internal_region, 'N')">
											√
										</xsl:if>) 원외
									</td>
									<td class="title2">정보기기 반출</td>
									<td class="contant">
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
								<xsl:variable name="start_ymd" select="msgCtrDomSchedMS01/apr_start_ymd" />
							    <xsl:variable name="cls_ymd" select="msgCtrDomSchedMS01/apr_cls_ymd" />
							    <xsl:variable name="major_intrv_psn" select="msgCtrDomSchedMS01/major_intrv_psn" />
							    <xsl:variable name="major_intrv_tel" select="msgCtrDomSchedMS01/major_intrv_tel" />
							    <xsl:variable name="agncy_nm" select="msgCtrDomSchedMS01/agncy_nm" />
							    <xsl:variable name="actn_detls" select="msgCtrDomSchedMS01/actn_detls" />
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
									<td width="20%" class="title">구분</td>
									<td width="20%" class="title">금액</td>
									<td width="60%" class="title">비고</td>
								</tr>
								<tr>
									<td class="title2">운임</td>
									<td class="contant-right">											
										<xsl:value-of
											select="request/crudInfo/apr_fare_fee" />										
									</td>	
									<td colspan="3" class="contant">
										<xsl:value-of
											select="request/crudInfo/fare_fee_rmk" />
									</td>
								</tr>
								<tr>
									<td class="title2">현지교통비</td>
									<td class="contant-right">
										<xsl:value-of
											select="request/crudInfo/apr_ymd_fee" />
									</td>
									<td colspan="3" class="contant">
										<xsl:value-of
											select="request/crudInfo/ymd_fee_rmk" />
									</td>
								</tr>
								<tr>
									<td class="title2">숙박비</td>
									<td class="contant-right">
										<xsl:value-of
											select="request/crudInfo/apr_lodg_fee" />
									</td>
									<td colspan="3" class="contant">
										<xsl:value-of
											select="request/crudInfo/lodg_fee_rmk" />
									</td>
								</tr>
								<tr>
									<td class="title2">식비(카드<xsl:value-of
											select="request/crudInfo/card_meal" />식)</td>
									<td class="contant-right">
										<xsl:value-of
											select="request/crudInfo/apr_meal_fee" />
									</td>
									<td colspan="3" class="contant">
										<xsl:value-of
											select="request/crudInfo/meal_fee_rmk" />
									</td>
								</tr>
								<tr>
									<td class="title2">기타비용</td>
									<td class="contant-right">
										<xsl:value-of
											select="request/crudInfo/apr_etc_fee" />
									</td>
									<td colspan="3" class="contant">
										<xsl:value-of
											select="request/crudInfo/etc_fee_rmk" />
									</td>
								</tr>
								<tr>
									<td class="title2">합계</td>
									<td class="contant-right">
										<xsl:value-of
											select="request/crudInfo/apr_tot_expns" />
									</td>
									<td colspan="3" class="contant">												
									</td>
								</tr>
							</table>
						</td>
					</tr>		
				</table>
				<xsl:if test="request/crudInfo/apr_air_mile != ''">
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
				</xsl:if>
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
									<td class="title">비용코드</td>
									<td class="title">금액</td>
								    <td class="title">계정책임자</td>
	   							    <td class="title">통제번호</td>
								</tr>
								<xsl:for-each select="request/crudInfo/accnt/vector/data">
								<xsl:variable name="accnt_no" select="msgCtrDomAccntMS01/accnt_no" />
							    <xsl:variable name="accnt_nm" select="msgCtrDomAccntMS01/accnt_nm" />
								<xsl:variable name="apr_expns_nm" select="msgCtrDomAccntMS01/apr_expns_nm" />
								<xsl:variable name="apr_tot_expns" select="msgCtrDomAccntMS01/apr_tot_expns" />
								<xsl:variable name="accnt_respn_psn_empno" select="msgCtrDomAccntMS01/accnt_respn_psn_empno" />
								<xsl:variable name="accnt_respn_psn_nm" select="msgCtrDomAccntMS01/accnt_respn_psn_nm" />
								<xsl:variable name="bugt_ctrl_no" select="msgCtrDomAccntMS01/bugt_ctrl_no" />
								<xsl:variable name="req_seq" select="msgCtrDomAccntMS01/req_seq" />
								<tr>
									<td width="3%" class="contant-center">
									 	<xsl:value-of select="$accnt_no"/>
								    </td>
								    <td width="15%" class="contant">
									 	<xsl:value-of select="$accnt_nm"/>
								    </td>
								    <td width="5%" class="contant-center">
									 	<xsl:value-of select="$apr_expns_nm"/>
								    </td>
								    <td width="8%" class="contant-right">
								    	<xsl:attribute name="id">
											<xsl:text>reqAmt</xsl:text>
											<xsl:value-of select="$req_seq"/>
										</xsl:attribute>
									 	<xsl:value-of select="$apr_tot_expns"/>
								    </td>
								    <td width="8%" class="contant">								 	
									 	<xsl:value-of select="$accnt_respn_psn_nm"/>
									 	(<xsl:value-of select="$accnt_respn_psn_empno"/>)
								    </td>									
								    <td width="10%" class="contant">
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
									<td width="5%" class="title">지급구분</td>
									<td width="10%" class="title">출장자</td>
									<td width="10%" class="title">금액</td>
								    <td width="10%" class="title">은행</td>
	   							    <td width="10%" class="title">계좌번호</td>
	   							    <td width="10%" class="title">예금주명</td>   							
								</tr>
								<xsl:for-each select="request/crudInfo/pay/vector/data">
								<xsl:variable name="apr_payClsf" select="msgCtrDomPayMS01/apr_payClsf" />
							    <xsl:variable name="biztrip_psn_empno" select="msgCtrDomPayMS01/apr_biztrip_psn_empno" />
								<xsl:variable name="biztrip_psn_nm" select="msgCtrDomPayMS01/biztrip_psn_nm" />
								<xsl:variable name="apr_tot_expns" select="msgCtrDomPayMS01/apr_tot_expns" />
								<xsl:variable name="apr_bank_cd" select="msgCtrDomPayMS01/apr_bank_cd" />
								<xsl:variable name="bankaccnt_no" select="msgCtrDomPayMS01/bankaccnt_no" />
								<xsl:variable name="depstr" select="msgCtrDomPayMS01/depstr" />							
								<tr>
									<td width="5%" class="contant-center">
									 	<xsl:value-of select="$apr_payClsf"/>
								    </td>
								    <td width="10%" class="contant">								 	
									 	<xsl:value-of select="$biztrip_psn_nm"/>
									 	<xsl:value-of select="$biztrip_psn_empno"/>
								    </td>									
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="$apr_tot_expns"/>
								    </td>
								    <td width="10%" class="contant-center">
									 	<xsl:value-of select="$apr_bank_cd"/>
								    </td>
								    <td width="10%" class="contant">
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
				     	<td class="body">
				     		<table width="100%" class="aprinnertable">
					          <tr>
					           <td class="title2">첨부파일</td>
					           <td class="contant" width="80%">								
								
								<xsl:for-each select="request/crudInfo/fileList_A/vector/data/msgXomxComAttachFileMS01">	
									<a>
										<xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="full_path" />')</xsl:attribute>
										<xsl:value-of select="org_file" /><br/>
									</a>
								</xsl:for-each>																															
					           </td>
					          </tr>
	       					</table>
	  					</td>
			  		</tr>
				</table>
				<iframe name="ifr" height="0" width="0"></iframe>
			</body>			
	</xsl:template>
</xsl:stylesheet>