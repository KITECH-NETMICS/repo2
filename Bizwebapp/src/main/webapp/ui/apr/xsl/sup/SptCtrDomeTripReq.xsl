<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
<xsl:template match="/">
<!--      <xsl:variable name="localPath" select="1"/> -->
			<BODY>
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
									<td class="title2">출장일자</td>
									<td width="40%" class="contant">
										<xsl:value-of
											select="request/crudInfo/apr_biztrip_start_ymd" />
										~<xsl:value-of
											select="request/crudInfo/apr_biztrip_cls_ymd" /><xsl:text disable-output-escaping="yes"><![CDATA[&nbsp;]]></xsl:text>
										[<xsl:value-of
											select="request/crudInfo/biztrip_nght" />박
										<xsl:value-of
											select="request/crudInfo/biztrip_day" />일	]									
									</td>
									<td class="title2">출장경로</td>
									<td class="contant">
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
										(<xsl:value-of
											select="request/crudInfo/apr_biztrip_goal_clsf" />)
										<xsl:value-of
											select="request/crudInfo/biztrip_goal" />
									</td>
								</tr>
								<tr>
									<!-- 
									<td width="10%" class="title2">방문처</td>
									<td class="contant">
										<xsl:value-of
											select="request/crudInfo/apr_cust_nm" />
										<xsl:value-of
											select="request/crudInfo/biztrip_region" />
									</td>
									 -->
									<td class="title2">차량사용</td>
									<td colspan="1" class="contant">										
										<xsl:value-of
											select="request/crudInfo/apr_car_use_yn" />
									</td>
									<td class="title2">정보기기 반출</td>
									<td colspan="2" class="contant">
									<xsl:if test="request/crudInfo/apr_notebook_out = 'Y' ">
										(노트북 반출)
									</xsl:if>	
									<xsl:if test="request/crudInfo/apr_usb_out = 'Y' ">
										(휴대용 저장매체 반출)
									</xsl:if>
									</td>
								</tr>
								<tr>
								</tr>
							</table>
						</td>
					</tr>			
				</table>	
				<table width="100%" class="aproutertable">		
					<tr>
						<td class="head">방문처</td>
					</tr>		
					<tr>
				     	<td class="body">
				     		<table width="100%" class="aprinnertable">							
								<tr>
									<td width="30%" class="title">기업명</td>
									<td width="15%" class="title">사업자번호</td>
									<td width="15%" class="title">대표자</td>
									<td width="40%" class="title">주소</td>
								</tr>
								<xsl:for-each select="request/crudInfo/ctrBiztripVend/vector/data">
								<xsl:variable name="cmpy_nm_krchar" select="msgSptCtrBiztripVend001/cmpy_nm_krchar" />
							    <xsl:variable name="bsns_psn_regst_no" select="msgSptCtrBiztripVend001/bsns_psn_regst_no" />
							    <xsl:variable name="reprs_psn" select="msgSptCtrBiztripVend001/reprs_psn" />
							    <xsl:variable name="cmpy_addr" select="msgSptCtrBiztripVend001/cmpy_addr" />
								<tr>
									<td width="30%" class="contant-center">
									 	<xsl:value-of select="$cmpy_nm_krchar"/>
								    </td>
								    <td width="15%" class="contant">
									 	<xsl:value-of select="$bsns_psn_regst_no"/>
								    </td>
								    <td width="15%" class="contant-center">
									 	<xsl:value-of select="$reprs_psn"/> 
								    </td>
								    <td width="40%" class="contant">
									 	<xsl:value-of select="$cmpy_addr"/>
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
									<td width="30%" class="title">일자</td>
									<td width="70%" class="title">활동내역</td>
								</tr>
								<xsl:for-each select="request/crudInfo/sched/vector/data">
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
			</BODY>			
	</xsl:template>
</xsl:stylesheet>