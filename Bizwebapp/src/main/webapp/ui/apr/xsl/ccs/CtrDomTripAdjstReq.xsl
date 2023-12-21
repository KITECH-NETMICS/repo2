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
										select="request/crudInfo/apr_cls_ymd" /><xsl:text disable-output-escaping="yes"><![CDATA[&nbsp;]]></xsl:text>
									[<xsl:value-of
										select="request/crudInfo/apr_biztrip_nght" />박
									<xsl:value-of
										select="request/crudInfo/apr_biztrip_day" />일]
									=>변경 :<xsl:value-of
										select="request/crudInfo/apr_orign_ymd" />
									~<xsl:value-of
										select="request/crudInfo/apr_chng_cls_ymd" /><xsl:text disable-output-escaping="yes"><![CDATA[&nbsp;]]></xsl:text>
									<xsl:value-of
										select="request/crudInfo/apr_chng_biztrip_nght" />박
									<xsl:value-of
										select="request/crudInfo/apr_chng_biztrip_day" />일
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
							<xsl:variable name="biztrip_psn_clsf_nm" select="msgCtrDomCompnMS01/biztrip_psn_clsf_nm" />
						    <xsl:variable name="chng_clsf" select="msgCtrDomCompnMS01/chng_clsf" />
							<xsl:variable name="biztrip_psn_empno" select="msgCtrDomCompnMS01/apr_biztrip_psn_empno" />
							<xsl:variable name="biztrip_psn_nm" select="msgCtrDomCompnMS01/biztrip_psn_nm" />
							<xsl:variable name="biztrip_dept_nm" select="msgCtrDomCompnMS01/biztrip_dept_nm" />
							<xsl:variable name="posi_clsf_nm" select="msgCtrDomCompnMS01/posi_clsf_nm" />
							<xsl:variable name="biztrip_orign_ymd" select="msgCtrDomCompnMS01/apr_start_ymd" />
							<xsl:variable name="biztrip_cls_ymd" select="msgCtrDomCompnMS01/apr_cls_ymd" />
							<xsl:variable name="biztrip_nght" select="msgCtrDomCompnMS01/biztrip_nght" />
							<xsl:variable name="biztrip_day" select="msgCtrDomCompnMS01/biztrip_day" />
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
								 	<xsl:value-of select="$biztrip_psn_empno"/>
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
					<td class="head">국내출장경비</td>
				</tr>
				<tr>
				     <td class="body">
				     	<table width="100%" class="aprinnertable">							
							<tr>
								<td class="title2">구분</td>
								<td class="title2">수령액(A)</td>
								<td class="title2">실사용액(B)</td>
								<td class="title2">정산액(B-A)</td>
								<td class="title2">실사용액 산출근거</td>
							</tr>
							<tr>
								<td class="title2">운임</td>
								<td width="15%" class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_fare_fee" />
								</td>
								<td width="15%" class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_truth_fee" />
								</td>
								<td width="15%" class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_adjst_fee" />
								</td>
								<td width="42%" class="contant">
									[<xsl:value-of
										select="request/crudInfo/apr_car_yn" />]
									<xsl:value-of
										select="request/crudInfo/apr_fare_rmk" />
								</td>
							</tr>
							<tr>
								<td class="title2">현지교통비</td>
								<td class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_ymd_fee" />
								</td>
								<td class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_truth_ymd_fee" />
								</td>
								<td class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_adjst_ymd_fee" />
								</td>
								<td class="contant">
									<xsl:value-of
										select="request/crudInfo/apr_ymd_rmk" />
								</td>
							</tr>
							<tr>
								<td class="title2">숙박비</td>
								<td class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_lodg_fee" />
								</td>
								<td class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_truth_lodg_fee" />
								</td>
								<td class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_adjst_lodg_fee" />
								</td>
								<td class="contant">
									<xsl:value-of
										select="request/crudInfo/apr_lodg_rmk" />
								</td>
							</tr>
							<tr>
								<td class="title2">식비(카드<xsl:value-of
										select="request/crudInfo/apr_card" />식)</td>
								<td class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_meal_fee" />
								</td>
								<td class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_truth_meal_fee" />
								</td>
								<td class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_adjst_meal_fee" />
								</td>
								<td class="contant">
									<xsl:value-of
										select="request/crudInfo/apr_meal_rmk" />
								</td>
							</tr>
							<tr>
								<td class="title2">기타비용</td>
								<td class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_etc_fee" />
								</td>
								<td class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_truth_etc_fee" />
								</td>
								<td class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_adjst_etc_fee" />
								</td>
								<td class="contant">
									<xsl:value-of
										select="request/crudInfo/apr_etc_rmk" />
								</td>
							</tr>
							<tr>
								<td class="title2">합계</td>
								<td class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_tot_fee" />
								</td>
								<td class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_truth_tot_fee" />
								</td>
								<td class="contant-right">
									<xsl:value-of
										select="request/crudInfo/apr_adjst_tot_fee" />
								</td>
								<td class="contant">
									<xsl:value-of
										select="request/crudInfo/apr_tot_rmk" />
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
							<xsl:variable name="unslip_no" select="msgCtrDomAdDepstMS01/unslip_no" />
						    <xsl:variable name="apr_amt" select="msgCtrDomAdDepstMS01/apr_amt" />
							<xsl:variable name="apr_tran_ymd" select="msgCtrDomAdDepstMS01/apr_tran_ymd" />
							<xsl:variable name="abst" select="msgCtrDomAdDepstMS01/abst" />
							<xsl:variable name="apr_rmk" select="msgCtrDomAdDepstMS01/column137" />									
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
							<xsl:for-each select="request/crudInfo/card/vector/data">
							<xsl:variable name="card_no" select="msgCtrDomPayMS01/card_no" />
						    <xsl:variable name="apr_use_ymd" select="msgCtrDomPayMS01/apr_use_ymd" />
						    <xsl:variable name="apprvl_no" select="msgCtrDomPayMS01/apprvl_no" />
							<xsl:variable name="apr_card_amt" select="msgCtrDomPayMS01/apr_card_amt" />
							<xsl:variable name="joinsto_nm" select="msgCtrDomPayMS01/joinsto_nm" />
							<xsl:variable name="abst" select="msgCtrDomPayMS01/abst" />
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
							<xsl:for-each select="request/crudInfo/DomPay/vector/data">
							<xsl:variable name="clsf" select="msgCtrDomPayMS01/clsf" />
						    <xsl:variable name="pay_psn_empno" select="msgCtrDomPayMS01/pay_psn_empno" />
							<xsl:variable name="pay_psn_nm" select="msgCtrDomPayMS01/pay_psn_nm" />
							<xsl:variable name="apr_after_amt" select="msgCtrDomPayMS01/apr_after_amt" />
							<xsl:variable name="apr_truth_use_amt" select="msgCtrDomPayMS01/apr_truth_use_amt" />
							<xsl:variable name="apr_adjst_amt" select="msgCtrDomPayMS01/apr_adjst_amt" />
							<xsl:variable name="bankaccnt_no" select="msgCtrDomPayMS01/bankaccnt_no" />
							<xsl:variable name="apr_bank_nm" select="msgCtrDomPayMS01/apr_bank_nm" />
							<xsl:variable name="depstr" select="msgCtrDomPayMS01/depstr" />
							<xsl:variable name="rmk" select="msgCtrDomPayMS01/rmk" />
							<tr>
								<td width="5%" class="contant-center">
								 	<xsl:value-of select="$clsf"/>
							    </td>
							    <td width="10%" class="contant">								 	
								 	<xsl:value-of select="$pay_psn_nm"/>
								 	(<xsl:value-of select="$pay_psn_empno"/>)
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
							<xsl:variable name="accnt_no" select="msgCtrDomAccntMS01/accnt_no" />
						    <xsl:variable name="accnt_nm" select="msgCtrDomAccntMS01/accnt_nm" />
							<xsl:variable name="apr_expns_cd" select="msgCtrDomAccntMS01/apr_expns_cd" />
							<xsl:variable name="apr_tot_expns" select="msgCtrDomAccntMS01/apr_tot_expns" />
							<xsl:variable name="accnt_respn_psn_empno" select="msgCtrDomAccntMS01/apr_accnt_respn_psn_empno" />
							<xsl:variable name="accnt_respn_psn_nm" select="msgCtrDomAccntMS01/accnt_respn_psn_nm" />
							<xsl:variable name="bugt_ctrl_no" select="msgCtrDomAccntMS01/bugt_ctrl_no" />
							<xsl:variable name="req_seq" select="msgCtrDomAccntMS01/req_seq" />
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
								 	<xsl:value-of select="$apr_tot_expns"/>
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
					<td class="head">지급계정내역(추가)</td>
				</tr>
				<tr>
				     <td class="body">
				     	<table width="100%" class="aprinnertable">							
				          <tr>
				           <td class="title2">첨부파일</td>
				           <td class="contant" width="84%">
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
				</form>
				<iframe name="ifr" height="0" width="0"></iframe>
			</BODY>
	</xsl:template>
</xsl:stylesheet>