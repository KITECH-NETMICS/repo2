<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
 	 <xsl:variable name="localPath" select="1"/>
			<BODY>
			<script language="javascript">
				<![CDATA[
					/* 크리스피드 이원길 미리보기 시작 */
					function openEvidWindow(unslipNo){
						var url = "https://evid.kitech.re.kr/sd/view?CLS=00&amp;amp;amp;RESL_NO=" + unslipNo + "&amp;amp;amp;EMP_NO=" + unslipNo;
						url = url.replaceAll("amp;","");
						window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
					}
					/* 크리스피드 이원길 미리보기 끝 */
				]]>
			</script>
			<form name="frmXsl" target="blank" action="http://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
				<INPUT type="hidden" name="FilePath" size="25" />
				<INPUT type="hidden" name="orgFileName" size="25" />
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
				<tr>
		     		<td class="body">
						<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">							
							<tr>
								<td class="title2">출장신청번호</td>
								<td width="37%" class="contant">
									<xsl:value-of
										select="request/crudInfo/apr_biztrip_req_no" />
								</td>
								<td class="title2">정산서신청번호</td>
								<td colspan="2" width="37%" class="contant">
									<xsl:value-of
										select="request/crudInfo/apr_req_no" />
								</td>
							</tr>
							<tr>
								<td class="title2">정산사유</td>
								<td class="contant">
									<xsl:value-of
										select="request/crudInfo/apr_adjst_resn" />
								</td>
								<td class="title2">정산내용</td>
								<td colspan="2" class="contant">
									<xsl:value-of
										select="request/crudInfo/apr_adjst_contnt" />
								</td>
							</tr>
							<tr>
								<td class="title2">계정번호</td>
								<td class="contant">
									<xsl:value-of
										select="request/crudInfo/apr_accnt_no" />
								</td>
								<td class="title2">결의번호</td>
								<td class="contant-center">
									<xsl:value-of select="request/crudInfo/unslip_no" />
									<br />
								</td>
								<td class="contant-center" valign="middle">
									<a>
										<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="request/crudInfo/unslip_no" />')</xsl:attribute>
										<img src="http://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/>
									</a>
								</td>
							</tr>
							<tr>
								<td class="title2">출장기간</td>
								<td colspan="4" class="contant">
									당초 :<xsl:value-of
										select="request/crudInfo/apr_str_ymd" />
									~ <xsl:value-of
										select="request/crudInfo/apr_cls_ymd" /><xsl:text disable-output-escaping="yes"></xsl:text>
									[<xsl:value-of
										select="request/crudInfo/apr_biztrip_nght" />박
									<xsl:value-of
										select="request/crudInfo/apr_biztrip_day" />일]
									=>변경 :<xsl:value-of
										select="request/crudInfo/apr_orign_ymd" />
									~<xsl:value-of
										select="request/crudInfo/apr_chng_cls_ymd" /><xsl:text disable-output-escaping="yes"></xsl:text>
									<xsl:value-of
										select="request/crudInfo/apr_chng_biztrip_nght" />박
									<xsl:value-of
										select="request/crudInfo/apr_chng_biztrip_day" />일
									기내<xsl:text disable-output-escaping="yes"></xsl:text><xsl:value-of
											select="request/crudInfo/apr_cabin_night" />박
									기내<xsl:text disable-output-escaping="yes"></xsl:text><xsl:value-of
											select="request/crudInfo/apr_cabin_meal" />식
								</td>
							</tr>
							<tr>
								<td rowspan="2" class="title2">출장지</td>
								<td colspan="4" class="contant">
									당초 :<xsl:value-of
											select="request/crudInfo/apr_region" />
								</td>
							</tr>
							<tr>
								<td colspan="5" class="contant">
									변경 :<xsl:value-of
											select="request/crudInfo/apr_chng_biztrip_land" />
								</td>
							</tr>
							<tr>
								<td rowspan="2" class="title2">출장목적</td>
								<td colspan="4" class="contant">
									당초 :<xsl:value-of
											select="request/crudInfo/apr_biztrip_goal" />
								</td>
							</tr>
							<tr>
								<td colspan="5" class="contant">
									변경 :<xsl:value-of
											select="request/crudInfo/apr_chng_biztrip_goal" />
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
									<td rowspan="2" class="title">구분</td>
									<td class="title">변경구분</td>
									<td rowspan="2" class="title">출장자</td>
								    <td rowspan="2" class="title">소속/직급</td>
	   							    <td rowspan="2" class="title">기간</td>
	   							    <td rowspan="2" class="title">박/일</td>
								</tr>
								<tr>
									<td class="title">취소</td>
								</tr>
								<xsl:for-each select="request/crudInfo/compn/vector/data">
								<xsl:variable name="biztrip_psn_clsf_nm" select="msgCtrOverCompnMS01/biztrip_psn_clsf_nm" />
							    <xsl:variable name="chng_clsf" select="msgCtrOverCompnMS01/chng_clsf" />
								<xsl:variable name="biztrip_psn_empno" select="msgCtrOverCompnMS01/biztrip_psn_empno" />
								<xsl:variable name="biztrip_psn_nm" select="msgCtrOverCompnMS01/biztrip_psn_nm" />
								<xsl:variable name="biztrip_dept_nm" select="msgCtrOverCompnMS01/biztrip_dept_nm" />
								<xsl:variable name="posi_clsf_nm" select="msgCtrOverCompnMS01/posi_clsf_nm" />
								<xsl:variable name="biztrip_orign_ymd" select="msgCtrOverCompnMS01/apr_start_ymd" />
								<xsl:variable name="biztrip_cls_ymd" select="msgCtrOverCompnMS01/apr_cls_ymd" />
								<xsl:variable name="biztrip_nght" select="msgCtrOverCompnMS01/biztrip_nght" />
								<xsl:variable name="biztrip_day" select="msgCtrOverCompnMS01/biztrip_day" />
								<tr>
									<td width="5%" class="contant-center">
									 	<xsl:value-of select="$biztrip_psn_clsf_nm"/>
								    </td>
								    <td width="5%" class="contant-center">
									 	<xsl:if test="contains($chng_clsf, '1')">
											취소
										</xsl:if>
								    </td>
								    <td width="10%" class="contant-center">									 	
									 	<xsl:value-of select="$biztrip_psn_nm"/>
									 	(<xsl:value-of select="$biztrip_psn_empno"/>)
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$biztrip_dept_nm"/>/
										<xsl:value-of select="$posi_clsf_nm"/>
								    </td>
								    <td width="10%" class="contant-center">
									 	<xsl:value-of select="$biztrip_orign_ymd"/> ~
									 	<xsl:value-of select="$biztrip_cls_ymd"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$biztrip_nght"/>박
									 	<xsl:value-of select="$biztrip_day"/>일
								    </td>
								</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">해외출장경비</td>
					</tr>
					<tr>
					     <td class="body">
					     	<table width="100%" class="aprinnertable">														
								<tr>
									<td width="4%" rowspan="2" class="title">성명</td>
									<td width="10%" class="title">운임비(\) 수령액</td>
									<td width="10%" class="title">운임비(\) 실사용금액</td>
									<td width="10%" class="title">일비($) 수령액</td>
								    <td width="10%" class="title">일비($) 실사용액</td>
	   							    <td width="10%" class="title">숙박비($) 수령액</td>
	   							    <td width="10%" class="title">숙박비($) 실사용액</td>
	   							    <td width="10%" class="title">식비($) 수령액</td>
	   							    <td width="10%" class="title">식비($) 실사용액</td>
	   							    <td width="10%" class="title">수령액합계</td>   		   							
								</tr>
								<tr>
									<td width="10%" class="title">비고</td>
									<td width="10%" class="title">산출근거</td>
								    <td width="10%" class="title">비고</td>
	   							    <td width="10%" class="title">산출근거</td>
	   							    <td width="10%" class="title">비고</td>
	   							    <td width="10%" class="title">산출근거</td>
	   							    <td width="10%" class="title">비고</td>
	   							    <td width="10%" class="title">산출근거</td>
	   							    <td width="10%" class="title">실사용액합계</td>
								</tr>
								<xsl:for-each select="request/crudInfo/expn/vector/data">
								<xsl:variable name="nm" select="msgCtrOverExpnsMS01/nm" />
							    <xsl:variable name="apr_truth_fare_fee" select="msgCtrOverExpnsMS01/apr_truth_fare_fee" />
								<xsl:variable name="apr_adjst_fare_fee" select="msgCtrOverExpnsMS01/apr_adjst_fare_fee" />
								<xsl:variable name="apr_truth_ymd_fee" select="msgCtrOverExpnsMS01/apr_truth_ymd_fee" />
								<xsl:variable name="apr_adjst_ymd_fee" select="msgCtrOverExpnsMS01/apr_adjst_ymd_fee" />
								<xsl:variable name="apr_truth_lodg_fee" select="msgCtrOverExpnsMS01/apr_truth_lodg_fee" />
								<xsl:variable name="apr_adjst_lodg_fee" select="msgCtrOverExpnsMS01/apr_adjst_lodg_fee" />
								<xsl:variable name="apr_truth_meal_fee" select="msgCtrOverExpnsMS01/apr_truth_meal_fee" />
								<xsl:variable name="apr_adjst_meal_fee" select="msgCtrOverExpnsMS01/apr_adjst_meal_fee" />
								<xsl:variable name="apr_won_tot_expns2" select="msgCtrOverExpnsMS01/apr_won_tot_expns2" />
								<xsl:variable name="apr_won_tot_expns" select="msgCtrOverExpnsMS01/apr_won_tot_expns" />									
								<xsl:variable name="won_fare_fee_rmk" select="msgCtrOverExpnsMS01/won_fare_fee_rmk" />
								<xsl:variable name="adjst_fare_fee_rmk" select="msgCtrOverExpnsMS01/adjst_fare_fee_rmk" />
								<xsl:variable name="ymd_fee_rmk" select="msgCtrOverExpnsMS01/ymd_fee_rmk" />
								<xsl:variable name="adjst_ymd_fee_rmk" select="msgCtrOverExpnsMS01/adjst_ymd_fee_rmk" />
								<xsl:variable name="lodg_fee_rmk" select="msgCtrOverExpnsMS01/lodg_fee_rmk" />
								<xsl:variable name="adjst_lodg_fee_rmk" select="msgCtrOverExpnsMS01/adjst_lodg_fee_rmk" />
								<xsl:variable name="meal_fee_rmk" select="msgCtrOverExpnsMS01/meal_fee_rmk" />
								<xsl:variable name="adjst_meal_fee_rmk" select="msgCtrOverExpnsMS01/adjst_meal_fee_rmk" />
								<tr>
									<td width="4%" rowspan="2" class="contant">
									 	<xsl:value-of select="$nm"/>
								    </td>
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="$apr_truth_fare_fee"/>
								    </td>
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="$apr_adjst_fare_fee"/>
								    </td>
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="$apr_truth_ymd_fee"/>
								    </td>
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="$apr_adjst_ymd_fee"/>
								    </td>
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="$apr_truth_lodg_fee"/>
								    </td>
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="$apr_adjst_lodg_fee"/>
								    </td>
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="$apr_truth_meal_fee"/>
								    </td>
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="$apr_adjst_meal_fee"/>
								    </td>
								    <td width="5%" class="contant-right">
									 	<xsl:value-of select="$apr_won_tot_expns2"/>
								    </td>
								</tr>
								<tr>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$won_fare_fee_rmk"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$adjst_fare_fee_rmk"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$ymd_fee_rmk"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$adjst_ymd_fee_rmk"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$lodg_fee_rmk"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$adjst_lodg_fee_rmk"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$meal_fee_rmk"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$adjst_meal_fee_rmk"/>
								    </td>
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="$apr_won_tot_expns"/>
								    </td>
								</tr>
								</xsl:for-each>
								<tr bgcolor="#EEEEEE">
								    <td width="5%" rowspan="2" class="contant-center">
								    합계
								    </td>
								    <td width="10%" rowspan="2" class="contant-right">
									 	<xsl:value-of
												select="request/crudInfo/apr_totFareFee" />
								    </td>
								    <td width="10%" rowspan="2" class="contant-right">
									 	<xsl:value-of
												select="request/crudInfo/apr_totTruthFareFee" />
								    </td>
								    <td width="10%" rowspan="2" class="contant-right">
									 	<xsl:value-of
												select="request/crudInfo/apr_totYmdFee" />
								    </td>
								    <td width="10%" rowspan="2" class="contant-right">
									 	<xsl:value-of
												select="request/crudInfo/apr_totTruthYmdFee" />
								    </td>
								    <td width="10%" rowspan="2" class="contant-right">
									 	<xsl:value-of
												select="request/crudInfo/apr_totLodgFee" />
								    </td>
								    <td width="10%" rowspan="2" class="contant-right">
									 	<xsl:value-of
												select="request/crudInfo/apr_totTruthLodgFee" />
								    </td>									    							
								    <td width="10%" rowspan="2" class="contant-right">
									 	<xsl:value-of
												select="request/crudInfo/apr_totMealFee" />
								    </td>
								    <td width="10%" rowspan="2" class="contant-right">
									 	<xsl:value-of
												select="request/crudInfo/apr_totTruthMealFee" />
								    </td>
								    <td width="10%" class="contant-right">
									 	<xsl:value-of
												select="request/crudInfo/apr_column62" />
								    </td>
								</tr>
								<tr bgcolor="#EEEEEE">									
								    <td width="10%" class="contant-right">
									 	<xsl:value-of
												select="request/crudInfo/apr_column67" />
								    </td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">온라인입금내역</td>
					</tr>
					<tr>
					     <td class="body">
					     	<table width="100%" class="aprinnertable">							
								<tr>
									<td class="title">가결의번호</td>
									<td class="title">금액</td>
									<td class="title">입금일자</td>
								    <td class="title">적요</td>
	   							    <td class="title">비고</td>
								</tr>
								<xsl:for-each select="request/crudInfo/depst/vector/data">
								<xsl:variable name="unslip_no" select="msgCtrOverAdDepstMS01/unslip_no" />
							    <xsl:variable name="apr_amt" select="msgCtrOverAdDepstMS01/apr_amt" />
								<xsl:variable name="apr_tran_ymd" select="msgCtrOverAdDepstMS01/apr_tran_ymd" />
								<xsl:variable name="abst" select="msgCtrOverAdDepstMS01/abst" />
								<xsl:variable name="apr_rmk" select="msgCtrOverAdDepstMS01/column137" />
								<tr>
									<td width="5%" class="contant-center">
									 	<xsl:value-of select="$unslip_no"/>
								    </td>
								    <td width="5%" class="contant-right">
									 	<xsl:value-of select="$apr_amt"/>
								    </td>
								    <td width="5%" class="contant-center">
									 	<xsl:value-of select="$apr_tran_ymd"/>
								    </td>
								    <td width="8%" class="contant">
									 	<xsl:value-of select="$abst"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$apr_rmk"/>
								    </td>
								</tr>
								</xsl:for-each>
								<tr bgcolor="#EEEEEE">
								    <td width="5%" class="contant-center">
								    </td>
								    <td width="5%" class="contant-right">
									 	<xsl:value-of
												select="request/crudInfo/apr_tot_amt" />
								    </td>
								    <td width="5%" class="contant-right">
								    </td>
								    <td width="8%" class="contant-right">
								    </td>
								    <td width="10%" class="contant-right">
								    </td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">운임 카드사용내역</td>
					</tr>
					<tr>
					     <td class="body">
					     	<table width="100%" class="aprinnertable">							
								<tr>
									<td class="title">카드번호</td>
									<td class="title">승인일자</td>
									<td class="title">승인번호</td>
								    <td class="title">승인금액</td>
	   							    <td class="title">가맹점명</td>
	   							    <td class="title">적요</td>
								</tr>
								<xsl:for-each select="request/crudInfo/save2/vector/data">
								<xsl:variable name="card_no" select="msgCtrOverPayMS01/card_no" />
							    <xsl:variable name="apr_use_ymd" select="msgCtrOverPayMS01/apr_use_ymd" />
							    <xsl:variable name="apprvl_no" select="msgCtrOverPayMS01/apprvl_no" />
								<xsl:variable name="apr_card_amt" select="msgCtrOverPayMS01/apr_card_amt" />
								<xsl:variable name="joinsto_nm" select="msgCtrOverPayMS01/joinsto_nm" />
								<xsl:variable name="abst" select="msgCtrOverPayMS01/abst" />
								<tr>
									<td width="7%" class="contant-center">
									 	<xsl:value-of select="$card_no"/>
								    </td>
								    <td width="5%" class="contant-center">
									 	<xsl:value-of select="$apr_use_ymd"/>
								    </td>
								    <td width="7%" class="contant-center">
									 	<xsl:value-of select="$apprvl_no"/>
								    </td>
								    <td width="5%" class="contant-right">
									 	<xsl:value-of select="$apr_card_amt"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$joinsto_nm"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$abst"/>
								    </td>
								</tr>
								</xsl:for-each>
								<tr bgcolor="#EEEEEE">
								    <td width="7%" class="contant-center">
								    </td>
								    <td width="5%" class="contant-right">
								    </td>
								    <td width="7%" class="contant-right">
								    </td>
								    <td width="5%" class="contant-right">
								    	<xsl:value-of
												select="request/crudInfo/apr_tot_card_amt" />
								    </td>
								    <td width="10%" class="contant-right">
								    </td>
								    <td width="10%" class="contant-right">
								    </td>
								</tr>
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
									<td colspan="9" class="contant-right">결의환율 :									
										 <xsl:value-of
											select="request/crudInfo/apr_req_exchgr" />원/$
									</td>
								</tr>
								<tr>
									<td class="title">구분</td>
									<td class="title">지급자</td>
									<td class="title">금액</td>
								    <td class="title">실사용액</td>
	   							    <td class="title">정산액</td>
	   							    <td class="title">계좌번호</td>
	   							    <td class="title">은행</td>
	   							    <td class="title">예금주</td>
	   							    <td class="title">비고</td>
								</tr>
								<xsl:for-each select="request/crudInfo/SeaPay/vector/data">
								<xsl:variable name="clsf" select="msgCtrOverPayMS01/clsf" />
							    <xsl:variable name="pay_psn_empno" select="msgCtrOverPayMS01/apr_pay_psn_empno" />
								<xsl:variable name="pay_psn_nm" select="msgCtrOverPayMS01/pay_psn_nm" />
								<xsl:variable name="apr_truth_use_amt" select="msgCtrOverPayMS01/apr_truth_use_amt" />
								<xsl:variable name="apr_adjst_amt" select="msgCtrOverPayMS01/apr_adjst_amt" />
								<xsl:variable name="apr_after_amt" select="msgCtrOverPayMS01/apr_after_amt" />
								<xsl:variable name="bankaccnt_no" select="msgCtrOverPayMS01/bankaccnt_no" />
								<xsl:variable name="apr_bank_nm" select="msgCtrOverPayMS01/apr_bank_nm" />
								<xsl:variable name="depstr" select="msgCtrOverPayMS01/depstr" />
								<xsl:variable name="rmk" select="msgCtrOverPayMS01/rmk" />
								<tr>
									<td width="5%" class="contant-center">
									 	<xsl:value-of select="$clsf"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$pay_psn_nm"/>
									 	<xsl:value-of select="$pay_psn_empno"/>
								    </td>
								    <td width="7%" class="contant-right">
									 	<xsl:value-of select="$apr_truth_use_amt"/>
								    </td>
								    <td width="7%" class="contant-right">
									 	<xsl:value-of select="$apr_adjst_amt"/>
								    </td>
								    <td width="7%" class="contant-right">
									 	<xsl:value-of select="$apr_after_amt"/>
								    </td>
								    <td width="7%" class="contant-center">
									 	<xsl:value-of select="$bankaccnt_no"/>
								    </td>
								    <td width="7%" class="contant-center">
									 	<xsl:value-of select="$apr_bank_nm"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$depstr"/>
								    </td>
								    <td width="10%" class="contant">
									 	<xsl:value-of select="$rmk"/>
								    </td>
								</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">지급계정내역(추가)</td>
					</tr>
					<tr>
					     <td class="body">
					     	<table width="100%" class="aprinnertable">							
								<tr>
									<td colspan="2" class="title">계정번호</td>
									<td class="title">비용</td>
									<td class="title">금액</td>
								    <td class="title">계정책임자</td>
	   							    <td class="title">통제번호</td>
								</tr>
								<xsl:for-each select="request/crudInfo/accnt/vector/data">
								<xsl:variable name="accnt_no" select="msgCtrOverAccntMS01/accnt_no" />
							    <xsl:variable name="accnt_nm" select="msgCtrOverAccntMS01/accnt_nm" />
								<xsl:variable name="apr_expns_cd" select="msgCtrOverAccntMS01/apr_expns_cd" />
								<xsl:variable name="apr_won_amt" select="msgCtrOverAccntMS01/apr_won_amt" />
								<xsl:variable name="accnt_respn_psn_empno" select="msgCtrOverAccntMS01/apr_accnt_respn_psn_empno" />
								<xsl:variable name="accnt_respn_psn_nm" select="msgCtrOverAccntMS01/accnt_respn_psn_nm" />
								<xsl:variable name="bugt_ctrl_no" select="msgCtrOverAccntMS01/bugt_ctrl_no" />
								<xsl:variable name="req_seq" select="msgCtrOverAccntMS01/req_seq" />
								<tr>
									<td width="3%" class="contant-center">
									 	<xsl:value-of select="$accnt_no"/>
								    </td>
								    <td width="8%" class="contant">
									 	<xsl:value-of select="$accnt_nm"/>
								    </td>
								    <td width="5%" class="contant-center">
									 	<xsl:value-of select="$apr_expns_cd"/>
								    </td>
								    <td width="5%" class="contant-right">
								    	<xsl:attribute name="id">
											<xsl:text>reqAmt</xsl:text>
											<xsl:value-of select="$req_seq"/>
										</xsl:attribute>
									 	<xsl:value-of select="$apr_won_amt"/>
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
					     <td class="body">
					     	<table width="100%" class="aprinnertable">
					          <tr>
					           <td class="title2">첨부파일</td>
					           <td class="contant" width="84%">
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