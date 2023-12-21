<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
 	 <xsl:variable name="localPath" select="1"/>
			<BODY>
			<form name="frmXsl" target="blank" action="https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
				<INPUT type="hidden" name="FilePath" size="25" />
				<INPUT type="hidden" name="orgFileName" size="25" />
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">신청정보</td>
					</tr>
					<tr>
			     		<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">								
								<tr>
									<td class="title2">작성자</td>
									<td width="22%" class="contant">										
										<xsl:value-of
											select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_nm/@value" />
										<xsl:value-of
											select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_req_empno/@value" />
									</td>
									<td class="title2">소속</td>
									<td width="22%" class="contant">
											<xsl:value-of
											select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_req_dept/@value" />
									</td>
									<td class="title2">신청번호</td>
									<td width="22%" class="contant">
										 <xsl:value-of
											select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_req_no/@value" />
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
								<xsl:for-each select="SAVEMULTI/REAPRVEC/SAVEMULTI/aprCompn/vector/data">
								<xsl:variable name="biztrip_psn_clsf" select="msgCtrOverCompnMS01/apr_biztrip_psn_nm/@value" />
							    <xsl:variable name="biztrip_psn_empno" select="msgCtrOverCompnMS01/biztrip_psn_empno/@value" />
								<xsl:variable name="biztrip_psn_nm" select="msgCtrOverCompnMS01/biztrip_psn_nm/@value" />
								<xsl:variable name="posi_clsf" select="msgCtrOverCompnMS01/apr_posi_clsf/@value" />
								<xsl:variable name="biztrip_dept_nm" select="msgCtrOverCompnMS01/biztrip_dept_nm/@value" />
								<xsl:variable name="biztrip_posi_nm" select="msgCtrOverCompnMS01/biztrip_posi_nm/@value" />
								<xsl:variable name="agent_empno" select="msgCtrOverCompnMS01/apr_agent_empno/@value" />
								<xsl:variable name="agent_nm" select="msgCtrOverCompnMS01/agent_nm/@value" />
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
									<td width="13%" class="title">주민번호</td>
								    <td width="10%" class="title">소속</td>
	   							    <td width="10%" class="title">직무대행</td>
								</tr>
								<xsl:for-each select="SAVEMULTI/REAPRVEC/SAVEMULTI/aprCompn01/vector/data">
								<xsl:variable name="biztrip_psn_clsf" select="msgCtrOverCompnMS01/apr_biztrip_psn_nm/@value" />
							    <xsl:variable name="biztrip_psn_empno" select="msgCtrOverCompnMS01/apr_biztrip_psn_empno/@value" />
								<xsl:variable name="biztrip_psn_nm" select="msgCtrOverCompnMS01/biztrip_psn_nm/@value" />
								<xsl:variable name="resid_no" select="msgCtrOverCompnMS01/resid_no/@value" />
								<xsl:variable name="biztrip_dept_nm" select="msgCtrOverCompnMS01/biztrip_dept_nm/@value" />
								<xsl:variable name="agent_empno" select="msgCtrOverCompnMS01/apr_agent_empno/@value" />
								<xsl:variable name="agent_nm" select="msgCtrOverCompnMS01/agent_nm/@value" />
								<tr>
									<td width="5%" class="contant-center">
									 	<xsl:value-of select="$biztrip_psn_clsf"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$biztrip_psn_nm"/>
									 	<xsl:value-of select="$biztrip_psn_empno"/>
								    </td>										
								    <td width="13%" class="contant-center">
									 	<xsl:value-of select="$resid_no"/>
								    </td>
								    <td width="10%" class="contant">
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
										<td class="title2">출장일자</td>
										<td width="45%" class="contant">
											<xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_biztrip_start_ymd/@value" />
											~ <xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_biztrip_cls_ymd/@value" /><xsl:text disable-output-escaping="yes"><![CDATA[&nbsp;]]></xsl:text>
											[<xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/biztrip_nght/@value" />박
											<xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/biztrip_day/@value" />일]
											기내<xsl:text disable-output-escaping="yes"><![CDATA[&nbsp;]]></xsl:text><xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/cabin_night/@value" />박
											기내<xsl:text disable-output-escaping="yes"><![CDATA[&nbsp;]]></xsl:text><xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/cabin_meal/@value" />식
										</td>
										<td class="title2">출장지</td>
										<td width="30%" class="contant">
											[<xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_biztrip_region/@value" />]
											<xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_biztrip_city/@value" />
										</td>
									</tr>
									<tr>
										<td class="title2">출장목적</td>
										<td colspan="3" class="contant">
											[<xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_biztrip_goal_clsf/@value" />]
											<xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/biztrip_goal/@value" />
										</td>
									</tr>
									<tr>
										<td class="title2">방문처</td>
										<td colspan="3" class="contant">
											<xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/biztrip_land_info/@value" />
										</td>
									</tr>
									<tr>
										<td class="title2">방문기관</td>
										<td colspan="3" class="contant">
											[<xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_biztrip_agncy_yn/@value" />]
											<xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/agncy_cd_nm_1/@value" /><xsl:text disable-output-escaping="yes"><![CDATA[&nbsp;]]></xsl:text>
											<xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/agncy_cd_nm_2/@value" /><xsl:text disable-output-escaping="yes"><![CDATA[&nbsp;]]></xsl:text>
											<xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/agncy_cd_nm_3/@value" />		
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
										<td width="30%" class="title">일자</td>
										<td width="70%" class="title">활동내역</td>
									</tr>
									<xsl:for-each select="SAVEMULTI/REAPRVEC/SAVEMULTI/sched/vector/data">
									<xsl:variable name="start_ymd" select="msgCtrOverSeaSchedMS01/apr_start_ymd/@value" />
								    <xsl:variable name="cls_ymd" select="msgCtrOverSeaSchedMS01/apr_cls_ymd/@value" />
								    <xsl:variable name="actn_detls" select="msgCtrOverSeaSchedMS01/actn_detls/@value" />
									<tr>
										<td width="30%" class="contant-center">
										 	<xsl:value-of select="$start_ymd"/> ~
										 	<xsl:value-of select="$cls_ymd"/>
									    </td>
									    <td width="70%" class="contant">
										 	<xsl:value-of select="$actn_detls"/>
									    </td>
									</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
					<table width="100%" class="aproutertable">	
						<tr>
							<td class="head">출장경비</td>
						</tr>					
						<tr>
						     <td class="body">
						     	<table width="100%" class="aprinnertable">								
									<tr>
										<td colspan="9" class="contant-right">결의환율 :
										
											 <xsl:value-of
												select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_req_exchgr/@value" />원/$
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
									<xsl:for-each select="SAVEMULTI/REAPRVEC/SAVEMULTI/expns/vector/data">
									<xsl:variable name="nm" select="msgCtrOverExpnsMS01/nm/@value" />
								    <xsl:variable name="won_fare_fee" select="msgCtrOverExpnsMS01/won_fare_fee/@value" />
									<xsl:variable name="fare_clsf" select="msgCtrOverExpnsMS01/apr_fare_clsf/@value" />
									<xsl:variable name="flight_grd" select="msgCtrOverExpnsMS01/apr_flight_grd/@value" />
									<xsl:variable name="won_fare_fee_rmk" select="msgCtrOverExpnsMS01/won_fare_fee_rmk/@value" />
									<xsl:variable name="ymd_fee" select="msgCtrOverExpnsMS01/ymd_fee/@value" />
									<xsl:variable name="ymd_fee_rmk" select="msgCtrOverExpnsMS01/ymd_fee_rmk/@value" />
									<xsl:variable name="lodg_fee" select="msgCtrOverExpnsMS01/lodg_fee/@value" />
									<xsl:variable name="lodg_fee_rmk" select="msgCtrOverExpnsMS01/lodg_fee_rmk/@value" />
									<xsl:variable name="meal_fee" select="msgCtrOverExpnsMS01/meal_fee/@value" />
									<xsl:variable name="meal_fee_rmk" select="msgCtrOverExpnsMS01/meal_fee_rmk/@value" />
									<xsl:variable name="trip_insr_fee" select="msgCtrOverExpnsMS01/trip_insr_fee/@value" />
									<xsl:variable name="trip_insr_fee_rmk" select="msgCtrOverExpnsMS01/trip_insr_fee_rmk/@value" />
									<xsl:variable name="won_tot_expns" select="msgCtrOverExpnsMS01/won_tot_expns/@value" />
									<xsl:variable name="tot_amt_rmk" select="msgCtrOverExpnsMS01/tot_amt_rmk/@value" />
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
													select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_won_fare_fee/@value" />
									    </td>
									    <td width="10%" class="contant-right">
										 	<xsl:value-of
													select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_ymd_fee/@value" />
									    </td>
									    <td width="10%" class="contant-right">
										 	<xsl:value-of
													select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_lodg_fee/@value" />
									    </td>
									    <td width="10%" class="contant-right">
										 	<xsl:value-of
													select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_meal_fee/@value" />
									    </td>
									    <td width="10%" class="contant-right">
										 	<xsl:value-of
													select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_trip_insr_fee/@value" />
									    </td>
									    <td width="10%" class="contant-right">
										 	<xsl:value-of
													select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_won_tot_expns/@value" />
									    </td>
									</tr>
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
								<xsl:for-each select="SAVEMULTI/REAPRVEC/SAVEMULTI/accnt/vector/data">
								<xsl:variable name="accnt_no" select="msgCtrOverAccntMS02/accnt_no/@value" />
							    <xsl:variable name="accnt_nm" select="msgCtrOverAccntMS02/accnt_nm/@value" />
								<xsl:variable name="expns_cd" select="msgCtrOverAccntMS02/apr_expns_nm/@value" />
								<xsl:variable name="won_amt" select="msgCtrOverAccntMS02/apr_won_amt/@value" />
								<xsl:variable name="accnt_respn_psn_empno" select="msgCtrOverAccntMS02/apr_accnt_respn_psn_empno/@value" />
								<xsl:variable name="accnt_respn_psn_nm" select="msgCtrOverAccntMS02/accnt_respn_psn_nm/@value" />
								<xsl:variable name="bugt_ctrl_no" select="msgCtrOverAccntMS02/bugt_ctrl_no/@value" />
								<xsl:variable name="req_seq" select="msgCtrOverAccntMS02/req_seq/@value" />
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
								<xsl:for-each select="SAVEMULTI/REAPRVEC/SAVEMULTI/pay/vector/data">
								<xsl:variable name="payClsf" select="msgCtrOverPayMS02/apr_payClsf/@value" />
							    <xsl:variable name="biztrip_psn_empno" select="msgCtrOverPayMS02/apr_biztrip_psn_empno/@value" />
								<xsl:variable name="biztrip_psn_nm" select="msgCtrOverPayMS02/biztrip_psn_nm/@value" />
								<xsl:variable name="won_tot_expns" select="msgCtrOverPayMS02/apr_won_tot_expns/@value" />
								<xsl:variable name="bank_cd" select="msgCtrOverPayMS02/apr_bank_cd/@value" />
								<xsl:variable name="bankaccnt_no" select="msgCtrOverPayMS02/bankaccnt_no/@value" />
								<xsl:variable name="depstr" select="msgCtrOverPayMS02/depstr/@value" />
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
									<td class="title2">1. 출장자 인적사항</td>
									<td width="84%" class="contant">
										<xsl:value-of
											select="translate(SAVEMULTI/REAPRVEC/SAVEMULTI/apr_human_item/@value, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />
									</td>
								</tr>
								<tr>
									<td class="title2">2. 출장 세부일정</td>
									<td class="contant">
										<xsl:value-of
											select="translate(SAVEMULTI/REAPRVEC/SAVEMULTI/apr_detls_sched/@value, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />
									</td>
								</tr>
								<tr>
									<td class="title2">3. 최근 1년간 출장경력</td>
									<td class="contant">
										<xsl:value-of
											select="translate(SAVEMULTI/REAPRVEC/SAVEMULTI/apr_biztrip_carer/@value, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />
									</td>
								</tr>
								<tr>
									<td class="title2">4. 접촉 예정인물</td>
									<td class="contant">
										<xsl:value-of
											select="translate(SAVEMULTI/REAPRVEC/SAVEMULTI/apr_contac_objct/@value, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />
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
									<td class="title2">첨부파일</td>
									<td class="contant" width="84%">
										<xsl:for-each select="SAVEMULTI/REAPRVEC/SAVEMULTI/fileList_A/vector/data/msgXomxComAttachFileMS01">	
											<a>
												<xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="full_path/@value" />')</xsl:attribute>
												<xsl:value-of select="org_file/@value" /><br/>
											</a>
										</xsl:for-each>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>						
				</form>
				<iframe name="ifr" height="0" width="0"></iframe>
			</BODY>			
	</xsl:template>
</xsl:stylesheet>