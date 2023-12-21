<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
			<BODY>
			<!-- script language="javascript">
			<![CDATA[
				function xslFileDownload(path){
					var localPath = "/was/WebSphere/AppServer/profiles/AppSrv01/installedApps/kwas1Cell01/biz.ear/bizweb.war/kitechfiles/";
					var pathArr = path.split('/');
					var patReplace = pathArr.slice(0, (pathArr.length - 1)).join('/');
						patReplace = patReplace.split(',').join('');
					var loPath = localPath + patReplace.replace(/(^\s*)|(\s*$)/g, "");
					var orgFileName = pathArr[pathArr.length - 1];
					var frm = createForm("frmXsl", "ifr", "http://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp", "get");
					frm = createHidden("FilePath", loPath, frm);
					frm = createHidden("orgFileName", orgFileName, frm);
					document.insertBefore(frm);
					frm.submit();
				}

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
					 hiddenInput.type="hidden";
					 hiddenInput.name=nm;
					 hiddenInput.value=val;
					 frm.insertBefore(hiddenInput);
					 return frm;
				}
			]]>
			</script-->
			<form name="frmXsl" target="blank" action="http://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
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
									<td class="title">구분</td>
									<td class="title">성명</td>
									<td class="title">소속</td>
									<td class="title">직급구분</td>
								    <td class="title">직무대행</td>
								</tr>
								<xsl:for-each select="request/ctrOverCompn/aprCompn/vector/data">
								<xsl:variable name="biztrip_psn_clsf" select="msgCtrOverCompnMS01/apr_biztrip_psn_nm" />
							    <xsl:variable name="biztrip_psn_empno" select="msgCtrOverCompnMS01/apr_biztrip_psn_empno" />
								<xsl:variable name="biztrip_psn_nm" select="msgCtrOverCompnMS01/biztrip_psn_nm" />
								<xsl:variable name="biztrip_posi_nm" select="msgCtrOverCompnMS01/biztrip_posi_nm" />
								<xsl:variable name="posi_clsf" select="msgCtrOverCompnMS01/apr_posi_clsf" />
								<xsl:variable name="biztrip_dept_nm" select="msgCtrOverCompnMS01/biztrip_dept_nm" />
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
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$biztrip_dept_nm"/>
								    </td>						
								    <td width="10%" class="contant-center"> 
								   	 	<xsl:value-of select="$biztrip_posi_nm"/>/
									 	<xsl:value-of select="$posi_clsf"/>
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
									<td class="title">구분</td>
									<td class="title">성명</td>
									<td class="title">주민번호</td>
								    <td class="title">소속</td>
	   							    <td class="title">직무대행</td>
								</tr>
								<xsl:for-each select="request/ctrOverCompn/aprCompn/vector/data">
								<xsl:variable name="biztrip_psn_clsf" select="msgCtrOverCompnMS01/apr_biztrip_psn_nm" />
							    <xsl:variable name="biztrip_psn_empno" select="msgCtrOverCompnMS01/apr_biztrip_psn_empno" />
								<xsl:variable name="biztrip_psn_nm" select="msgCtrOverCompnMS01/biztrip_psn_nm" />
								<xsl:variable name="resid_no" select="msgCtrOverCompnMS01/resid_no" />
								<xsl:variable name="biztrip_dept_nm" select="msgCtrOverCompnMS01/biztrip_dept_nm" />
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
								    <td width="8%" class="contant-center">
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
											select="request/crudInfo/apr_biztrip_start_ymd" />
										~ <xsl:value-of
											select="request/crudInfo/apr_biztrip_cls_ymd" /><xsl:text disable-output-escaping="yes"></xsl:text>
										[<xsl:value-of
											select="request/crudInfo/biztrip_nght" />박
										<xsl:value-of
											select="request/crudInfo/biztrip_day" />일]
										기내<xsl:text disable-output-escaping="yes"></xsl:text><xsl:value-of
											select="request/crudInfo/cabin_night" />박
										기내<xsl:text disable-output-escaping="yes"></xsl:text><xsl:value-of
											select="request/crudInfo/cabin_meal" />식
									</td>
									<td class="title2">출장지</td>
									<td width="30%" class="contant">
										[<xsl:value-of
											select="request/crudInfo/apr_biztrip_region" />]
										<xsl:value-of
											select="request/crudInfo/apr_biztrip_city" />
									</td>
								</tr>
								<tr>
									<td class="title2">출장목적</td>
									<td colspan="3" class="contant">
										[<xsl:value-of
											select="request/crudInfo/apr_biztrip_goal_clsf" />]
										<xsl:value-of
											select="request/crudInfo/biztrip_goal" />
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
									<td width="25%" class="title">일자</td>
									<td width="75%" class="title">활동내역(세부내역)</td>
								</tr>
								<xsl:for-each select="request/crudInfo/save3/vector/data">
								<xsl:variable name="start_ymd" select="msgCtrOverSeaSchedMS01/apr_start_ymd" />
							    <xsl:variable name="cls_ymd" select="msgCtrOverSeaSchedMS01/apr_cls_ymd" />
							    <xsl:variable name="actn_detls" select="msgCtrOverSeaSchedMS01/actn_detls" />
								<tr>
									<td width="25%" class="contant-center">
									 	<xsl:value-of select="$start_ymd"/> ~
									 	<xsl:value-of select="$cls_ymd"/>
								    </td>
								    <td width="75%" class="contant">
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
									<td width="5%" rowspan="2" class="title">성명</td>
									<td width="7%" class="title">운임비(\)</td>
									<td width="8%" class="title">운임구분</td>
									<td width="8%" class="title">항공등급</td>
								    <td width="10%" class="title">일비($)</td>
	   							    <td width="10%" class="title">숙박비($)</td>
	   							    <td width="10%" class="title">식비($)</td>
	   							    <td width="5%" rowspan="2" class="title">합계</td>
								</tr>
								<tr>
									<td width="7%" colspan="3" class="title">비고</td>
									<td width="8%" class="title">비고</td>
								    <td width="10%" class="title">비고</td>
	   							    <td width="10%"  class="title">비고</td>
								</tr>
								<xsl:for-each select="request/crudInfo/expns/vector/data">
								<xsl:variable name="nm" select="msgCtrOverExpnsMS01/nm" />
							    <xsl:variable name="fare_fee" select="msgCtrOverExpnsMS01/fare_fee" />
								<xsl:variable name="fare_clsf" select="msgCtrOverExpnsMS01/apr_fare_clsf" />
								<xsl:variable name="flight_grd" select="msgCtrOverExpnsMS01/apr_flight_grd" />
								<xsl:variable name="fare_fee_rmk" select="msgCtrOverExpnsMS01/fare_fee_rmk" />
								<xsl:variable name="ymd_fee" select="msgCtrOverExpnsMS01/ymd_fee" />
								<xsl:variable name="ymd_fee_rmk" select="msgCtrOverExpnsMS01/ymd_fee_rmk" />
								<xsl:variable name="lodg_fee" select="msgCtrOverExpnsMS01/lodg_fee" />
								<xsl:variable name="lodg_fee_rmk" select="msgCtrOverExpnsMS01/lodg_fee_rmk" />
								<xsl:variable name="meal_fee" select="msgCtrOverExpnsMS01/meal_fee" />
								<xsl:variable name="meal_fee_rmk" select="msgCtrOverExpnsMS01/meal_fee_rmk" />
								<xsl:variable name="tot_amt" select="msgCtrOverExpnsMS01/tot_amt" />
								<xsl:variable name="tot_amt_rmk" select="msgCtrOverExpnsMS01/tot_amt_rmk" />
								<tr>
									<td width="5%" rowspan="2" class="contant">
									 	<xsl:value-of select="$nm"/>
								    </td>
								    <td width="7%" class="contant-right">
									 	<xsl:value-of select="format-number($fare_fee,'#,###,###,###,###,###.00')"/>
								    </td>
								    <td width="8%" class="contant">
									 	<xsl:value-of select="$fare_clsf"/>
								    </td>
								    <td width="8%" class="contant">
									 	<xsl:value-of select="$flight_grd"/>
								    </td>
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number($ymd_fee,'#,###,###,###,###,###.00')"/>
								    </td>
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number($lodg_fee,'#,###,###,###,###,###.00')"/>
								    </td>
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number($meal_fee,'#,###,###,###,###,###.00')"/>
								    </td>										
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number($tot_amt,'#,###,###,###,###,###.00')"/>
								    </td>
								</tr>
								<tr>
								    <td width="7%" colspan="3" class="contant">
									 	<xsl:value-of select="$fare_fee_rmk"/>
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
									 	<xsl:value-of select="$tot_amt_rmk"/>
								    </td>
								</tr>
								</xsl:for-each>
								<tr bgcolor="#EEEEEE">
								    <td width="5%" class="contant-center">
								    합계											 	
								    </td>
								    <td width="23%" colspan="3" class="contant-right">
									 	<!-- xsl:value-of select="request/crudInfo/apr_won_fare_fee" /-->
									 	<xsl:value-of select="format-number(request/crudInfo/apr_won_fare_fee, '#,###,###,###,###,###.00')" />
								    </td>
								    <td width="10%" class="contant-right">
									 	<!--xsl:value-of select="request/crudInfo/apr_ymd_fee" /-->
									 	<xsl:value-of select="format-number(request/crudInfo/apr_ymd_fee, '#,###,###,###,###,###.00')" />
								    </td>
								    <td width="10%" class="contant-right">
									 	<!--xsl:value-of select="request/crudInfo/apr_lodg_fee" /-->
									 	<xsl:value-of select="format-number(request/crudInfo/apr_lodg_fee, '#,###,###,###,###,###.00')" />
								    </td>
								    <td width="10%" class="contant-right">
									 	<!--xsl:value-of select="request/crudInfo/apr_meal_fee" /-->
									 	<xsl:value-of select="format-number(request/crudInfo/apr_meal_fee, '#,###,###,###,###,###.00')" />
								    </td>										
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="request/crudInfo/apr_won_tot_expns" />									 	
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
									 	<!-- xsl:value-of select="$won_amt"/-->
									 	<xsl:value-of select="format-number($won_amt,'#,###,###,###,###,###.00')"/>
								    </td>
								    <td width="15%" class="contant">
									 	<xsl:value-of select="$accnt_respn_psn_nm"/>
									 	<xsl:value-of select="$accnt_respn_psn_empno"/>
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
								    <td width="15%" class="contant-right">
									 	<!--xsl:value-of select="$won_tot_expns"/-->
									 	<xsl:value-of select="format-number($won_tot_expns,'#,###,###,###,###,###.00')"/>
								    </td>
								    <td width="15%" class="contant">
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
						<td class="head">사업(출장)계획서, 관련증빙</td>
					</tr>
					<tr>
					     <td class="body">
					     	<table width="100%" class="aprinnertable">								
								<tr>
									<td class="title2">첨부파일</td>
									<td class="contant" width="80%">
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
				</form>
				<iframe name="ifr" height="0" width="0"></iframe>
			</BODY>			
	</xsl:template>
</xsl:stylesheet>