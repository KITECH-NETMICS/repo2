<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
 	 <xsl:variable name="localPath" select="request/localPath"/>
		<html lang="kr">
			<BODY>
				<script language="javascript">
				<![CDATA[
					function xslFileDownload(path){
  						
  						//var localPath = "/was/WebSphere/AppServer/profiles/AppSrv01/installedApps/kwas1Cell01/biz.ear/bizweb.war/kitechfiles/";
						
						var localPath   = "/was/IMIS_FILES/";
						var pathArr = path.split('/');
						var patReplace = pathArr.slice(0, (pathArr.length - 1)).join('/');
 						patReplace = patReplace.split(',').join('');
						var loPath = localPath + patReplace.replace(/(^\s*)|(\s*$)/g, "");
						var orgFileName = pathArr[pathArr.length - 1]; 						 
						var frm = createForm("frmXsl", "ifr", "https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp", "get");
						frm = createHidden("FilePath", loPath, frm);
						frm = createHidden("orgFileName", orgFileName, frm);
						
						/*IE9, IE10, 크롬 등에서 호환성 보기 없이 실행되도록 보완(2013.07.31)*/
						//document.insertBefore(frm);
						document.body.appendChild(frm);
						
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
 						/*IE9, IE10, 크롬 등에서 호환성 보기 없이 실행되도록 보완(2013.07.31)*/
						var hiddenInput=document.createElement("input");
						
						/*
						hiddenInput.type="hidden";
						hiddenInput.name=nm;
						hiddenInput.value=val;
						frm.insertBefore(hiddenInput);
 						*/
 						
 						hiddenInput.setAttribute("type", "hidden");
						hiddenInput.setAttribute("name", nm);
						hiddenInput.setAttribute("value", val);
						frm.appendChild(hiddenInput);
						
						return frm;
 					}
				]]>
				</script>
				
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 신청정보 </td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
							  		<td class='title2' width="16%">신청구분</td>
							  		<td class="contant">정산</td>
							  		<td class='title2' width="16%">신청번호</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/app_ad_req_no" /></td>
							  		<td class='title2' width="16%">정산신청금액</td>
							  		<td class="contant-right"><xsl:if test="response/selectHead/msgPurContrctMastr/contrct_amt != ''">
															  <xsl:value-of select="format-number(response/selectHead/msgPurContrctMastr/contrct_amt, '#,###')" />
															  </xsl:if>
							  		</td>
							  	</tr>
								<tr>
							  		<td class='title2' width="16%">구분</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/contrct_way_desc" /></td>
							  		<td class='title2' width="16%">부서명</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/req_dept_nm" /></td>
							  		<td class='title2' width="16%">신청자</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/req_emp_nm" /></td>
							    </tr>
								<tr>
							  		<td class='title2' width="16%">신청일자</td>
							  		<td class="contant"><xsl:value-of select="substring(response/selectHead/msgPurContrctMastr/req_ymd, 1, 4)" />-<xsl:value-of select="substring(response/selectHead/msgPurContrctMastr/req_ymd, 5, 2)" />-<xsl:value-of select="substring(response/selectHead/msgPurContrctMastr/req_ymd, 7, 2)" /></td>
							  		<td class='title2' width="16%">계약번호</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/pur_req_no" /></td>
							  		<td class='title2' width="16%">내외자구분</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/inout_desc" /></td>
							    </tr>
							    <tr>
							  		<td class='title2' width="16%">지급방법</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/pay_way" /></td>
							  		<td class='title2' width="16%">지급구분</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/pay_clsf" /></td>
							  		<td class='title2' width="16%">비용구분</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/troops_expns_clsf" /></td>
							    </tr>
							    <tr>
							  		<td class='title2' width="16%">업체명</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/vend_desc" /></td>
							  		<td class='title2' width="16%">계산서번호</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/bill_no" /></td>
							  		<td class='title2' width="16%">계산서발행일자</td>
							  		<td class="contant"><xsl:value-of select="substring(response/selectHead/msgPurContrctMastr/bill_issu_ymd, 1, 4)" />-<xsl:value-of select="substring(response/selectHead/msgPurContrctMastr/bill_issu_ymd, 5, 2)" />-<xsl:value-of select="substring(response/selectHead/msgPurContrctMastr/bill_issu_ymd, 7, 2)" /></td>
							    </tr>
							    <tr>
							  		<td class='title2' width="16%">거래은행</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/tran_bank_desc" /></td>
							  		<td class='title2' width="16%">계좌번호</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/bank_accnt_no" /></td>
							  		<td class='title2' width="16%">예금주</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/depstr" /></td>
							    </tr>
								<tr>
							  		<td class='title2' width="16%">가맹점명</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/joinsto_nm" /></td>
							  		<td class='title2' width="16%">가맹점번호</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/joinsto_no" /></td>
							  		<td class='title2' width="16%">카드번호</td>
							  		<td class="contant"><xsl:value-of select="response/selectHead/msgPurContrctMastr/card_no" /></td>
							    </tr>
							    <!-- tr>
							  		<td class='title2' width="16%">정산신청번호</td>
							  		<td class="contant" colspan="5"><xsl:value-of select="response/selectHead/msgPurContrctMastr/adjst_req_no" /></td>
							    </tr -->
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
									<td class='title' width="12%">계정번호</td>
									<td class='title' width="14%">회계(비용)코드</td>
									<td class='title' width="12%">통제번호</td>
									<td class='title' width="12%">계정책임자</td>
									<td class='title' width="12%">지급신청액</td>
									<td class='title' width="12%">공급가액</td>
									<td class='title' width="13%">부가세액</td>
								</tr>
								<tr>
									<td class='title' colspan="4">적 요</td>
									<td class='title' width="13%">미착계정</td>
									<td class='title' width="13%">미착회계(비용)</td>
									<td class='title' width="13%">미착계정책임자</td>
								</tr>
								<xsl:for-each select="response/selectDetail/vector/data">
								<tr>
									<td class="contant-center"><xsl:value-of select="msgPurPayReq/accnt_no" /></td>
									<td class="contant-center"><xsl:value-of select="msgPurPayReq/accnt_cd" />(<xsl:value-of select="msgPurPayReq/expns_cd" />)</td>
									<td class="contant-center"><xsl:value-of select="msgPurPayReq/ctrl_no" /></td>
									<td class="contant-center"><xsl:value-of select="msgPurPayReq/accnt_rspns_empnm" /></td>
									<td class="contant-right"><xsl:if test="msgPurPayReq/contrct_amt != ''">
															  <xsl:value-of select="format-number(msgPurPayReq/contrct_amt, '#,###')" />
															  </xsl:if>
									</td>
									<td class="contant-right"><xsl:if test="msgPurPayReq/suply_value != ''">
															  <xsl:value-of select="format-number(msgPurPayReq/suply_value, '#,###')" />
															  </xsl:if>
									</td>
									<td class="contant-right"><xsl:if test="msgPurPayReq/add_taxamt != ''">
															  <xsl:value-of select="format-number(msgPurPayReq/add_taxamt, '#,###')" />
															  </xsl:if>
									</td>
								</tr>
								<tr>
								    <td class="contant" colspan="4"><xsl:value-of select="msgPurPayReq/rmk" /></td>
								    <td class="contant-center"><xsl:value-of select="msgPurPayReq/unarriv_accnt_no" /></td>
									<td class="contant-center"><xsl:value-of select="msgPurPayReq/unarriv_made" /></td>
									<td class="contant-center"><xsl:value-of select="msgPurPayReq/unarriv_accnt_rspns_nm" /></td>
								</tr>
								</xsl:for-each>
                            </table>
                        </td>
                    </tr>
                </table>
				
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 첨부파일</td>
					</tr>
					<tr>
						<td class="body">
                            <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
                                <!-- xsl:for-each select="response/selectHead/msgPurContrctMastr/vector/data/msgFileVec">
								<tr>
										<td class='title2' width="16%">첨부파일 ( <xsl:value-of select="file_no"/> )</td>
										<td class='contant' width="84%">
										<a><xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="file_value" />/<xsl:value-of select="file_name"/>')</xsl:attribute>
										   <xsl:value-of select="file_name"/>
										</a>
										</td>
								</tr>
								</xsl:for-each -->
								<xsl:for-each select="response/fileList_A/vector/data/msgXomxComAttachFileMS01">
								<tr>
										<td class='title2' width="16%">첨부파일 ( <!-- xsl:number format="T"/ --><xsl:value-of select="seq"/> )</td>
										<td class='contant' width="84%">
										<a><xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="attach_full_path"/>')</xsl:attribute>
										   <xsl:value-of select="file_nm"/>.<xsl:value-of select="extens_nm"/>
										</a>
										</td>
								</tr>
								</xsl:for-each>
                            </table>
                        </td>
                    </tr>
                </table>
			</BODY>
		</html>
	</xsl:template>
</xsl:stylesheet>