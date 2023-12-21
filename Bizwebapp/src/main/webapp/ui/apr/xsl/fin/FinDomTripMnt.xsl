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
								<td width="20%" class="contant">									
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_nm" />
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_empno" />
								</td>
								<td class="title2">소속</td>
								<td width="20%" class="contant">
										<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_req_dept" />
								</td>
								<td class="title2">신청번호</td>
								<td width="20%" class="contant">
									 <xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_req_no" />
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
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/biztrip_psn_nm" />
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_req_empno" />
								</td>
								<td class="title2">소속</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_biztrip_psn_dept" />
								</td>
								<td class="title2">직급구분</td>
								<td width="16%" class="contant">
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_biztrip_psn_posi" />/
									 <xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_posi" />
								</td>
								<td class="title2">직무대행</td>
								<td width="16%" class="contant">
									 <xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_agent_nm" />
								     <xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_agent_empno" />
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
							<xsl:for-each select="SAVEMULTI/REAPRVEC/SAVEMULTI/compn/vector/data">
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
								<td class="title2">출장일자</td>
								<td width="40%" class="contant">
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_biztrip_start_ymd" />
									~<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_biztrip_cls_ymd" /><xsl:text disable-output-escaping="yes"><![CDATA[&nbsp;]]></xsl:text>
									[<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/biztrip_nght" />박
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/biztrip_day" />일	]									
								</td>
								<td class="title2">출장경로</td>
								<td class="contant">
									[<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_biztrip_way" />]
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_start_region" />=>
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_arriv_region" />									
								</td>
							</tr>
							<tr>
								<td class="title2">출장목적</td>
								<td colspan="3" class="contant">
									(<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_biztrip_goal_clsf" />)
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/biztrip_goal" />
								</td>
							</tr>
							<tr>
								<td width="10%" class="title2">방문처</td>
								<td class="contant">
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_cust_nm" />
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/biztrip_region" />
								</td>
								<td class="title2">차량사용</td>
								<td width="40%" class="contant">										
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_car_use_yn" />
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
							<xsl:variable name="start_ymd" select="msgCtrDomSchedMS01/apr_start_ymd" />
						    <xsl:variable name="cls_ymd" select="msgCtrDomSchedMS01/apr_cls_ymd" />
						    <xsl:variable name="actn_detls" select="msgCtrDomSchedMS01/actn_detls" />
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
								<td width="20%" class="title">구분</td>
								<td width="20%" class="title">금액</td>
								<td width="60%" class="title">비고</td>
							</tr>
							<tr>
								<td class="title2">운임</td>
								<td class="contant-right">											
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_fare_fee" />										
								</td>	
								<td colspan="3" class="contant">
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/fare_fee_rmk" />
								</td>
							</tr>
							<tr>
								<td class="title2">현지교통비</td>
								<td class="contant-right">
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_ymd_fee" />
								</td>
								<td colspan="3" class="contant">
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/ymd_fee_rmk" />
								</td>
							</tr>
							<tr>
								<td class="title2">숙박비</td>
								<td class="contant-right">
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_lodg_fee" />
								</td>
								<td colspan="3" class="contant">
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/lodg_fee_rmk" />
								</td>
							</tr>
							<tr>
								<td class="title2">식비(카드<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/card_meal" />식)</td>
								<td class="contant-right">
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_meal_fee" />
								</td>
								<td colspan="3" class="contant">
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/meal_fee_rmk" />
								</td>
							</tr>
							<tr>
								<td class="title2">기타비용</td>
								<td class="contant-right">
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_etc_fee" />
								</td>
								<td colspan="3" class="contant">
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/etc_fee_rmk" />
								</td>
							</tr>
							<tr>
								<td class="title2">합계</td>
								<td class="contant-right">
									<xsl:value-of
										select="SAVEMULTI/REAPRVEC/SAVEMULTI/apr_tot_expns" />
								</td>
								<td colspan="3" class="contant">												
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
								<td class="title">비용코드</td>
								<td class="title">금액</td>
							    <td class="title">계정책임자</td>
   							    <td class="title">통제번호</td>
							</tr>
							<xsl:for-each select="SAVEMULTI/REAPRVEC/SAVEMULTI/accnt/vector/data">
							<xsl:variable name="accnt_no" select="msgCtrDomAccntMS02/accnt_no" />
						    <xsl:variable name="accnt_nm" select="msgCtrDomAccntMS02/accnt_nm" />
							<xsl:variable name="apr_expns_nm" select="msgCtrDomAccntMS02/apr_expns_nm" />
							<xsl:variable name="apr_tot_expns" select="msgCtrDomAccntMS02/apr_tot_expns" />
							<xsl:variable name="accnt_respn_psn_empno" select="msgCtrDomAccntMS02/accnt_respn_psn_empno" />
							<xsl:variable name="accnt_respn_psn_nm" select="msgCtrDomAccntMS02/accnt_respn_psn_nm" />
							<xsl:variable name="bugt_ctrl_no" select="msgCtrDomAccntMS02/bugt_ctrl_no" />
							<xsl:variable name="req_seq" select="msgCtrDomAccntMS02/req_seq" />
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
							<xsl:for-each select="SAVEMULTI/REAPRVEC/SAVEMULTI/pay/vector/data">
							<xsl:variable name="apr_payClsf" select="msgCtrDomPayMS02/apr_payClsf" />
						    <xsl:variable name="biztrip_psn_empno" select="msgCtrDomPayMS02/apr_biztrip_psn_empno" />
							<xsl:variable name="biztrip_psn_nm" select="msgCtrDomPayMS02/biztrip_psn_nm" />
							<xsl:variable name="apr_tot_expns" select="msgCtrDomPayMS02/apr_tot_expns" />
							<xsl:variable name="apr_bank_cd" select="msgCtrDomPayMS02/apr_bank_cd" />
							<xsl:variable name="bankaccnt_no" select="msgCtrDomPayMS02/bankaccnt_no" />
							<xsl:variable name="depstr" select="msgCtrDomPayMS02/depstr" />							
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
							
							<xsl:for-each select="SAVEMULTI/REAPRVEC/SAVEMULTI/fileList_A/vector/data/msgXomxComAttachFileMS01">	
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
			</form>
			<iframe name="ifr" height="0" width="0"></iframe>
			</BODY>			
	</xsl:template>
</xsl:stylesheet>