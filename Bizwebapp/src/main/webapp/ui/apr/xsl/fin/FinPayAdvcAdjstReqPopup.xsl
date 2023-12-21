<?xml version="1.0"?>
<!DOCTYPE xsl:stylesheet [ <!ENTITY nbsp "&#160;"> ]>
<!-- <xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" -->
<!-- xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"> -->
<xsl:stylesheet xmlns:LINS="snapshot.css" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:fo="http://www.w3.org/1999/XSL/Format">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
			<body>
				<script>
					<![CDATA[
						var oldId = "";
						function chngData(no, odr){}
						function chngData2(no, odr){
						    try{				
							var chngId = no+odr;
							if(chngId == oldId){
								return;
							}
							docR = document.getElementById("useTab");
							docT = document.getElementById("depstTab");
							docChng = document.getElementById(chngId);
							docOld = document.getElementById(oldId);
			
							docChng.style.display = 'block';
							if(oldId != ""){
								docOld.style.display = 'none';
							}
							
							var i = 0;
							while(i != docR.all.length-1){
								if(docR.all[i].id != null){
									if(docR.all[i].id.length != 0){
										if(chngId == docR.all[i].id.substr(0,13)){
											docR.all[i].style.display = 'block';
										}else{
											docR.all[i].style.display = 'none';
										}
									}
								}
								i++;
							}
			
							i = 0;
							while(i != docT.all.length-1){
								if(docT.all[i].id != null){
									if(docT.all[i].id.length != 0){
										if(chngId == docT.all[i].id.substr(0,13)){
											docT.all[i].style.display = 'block';
										}else{
											docT.all[i].style.display = 'none';
										}
									}
								}
								i++;
							}
							oldId = chngId;
						    }catch(e){
							alert(e.toString()+"데이터가 존재하지 않습니다.");
						    }
			
						}
						
						/* 크리스피드 이원길 미리보기 시작 */
						function openEvidWindow(unslipNo){
							var url = "https://evid.kitech.re.kr/sd/view?CLS=00&amp;amp;amp;RESL_NO=" + unslipNo + "&amp;amp;amp;EMP_NO=" + unslipNo;
							url = url.replaceAll("amp;","");
							window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
						}
						/* 크리스피드 이원길 미리보기 끝 */
					]]>
				</script>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="20%" class="title2">정산신청번호</td>
									<td colspan="2" class="contant-center">
										<xsl:value-of select="APPROVAL/adjst_req_no" />
										<br />
									</td>
									<td width="20%" class="title2">정산일자</td>
									<td colspan="2" class="contant-center">
										<xsl:value-of select="APPROVAL/adjst_ymd" />
										<br />
									</td>
								</tr>
								<tr>
									<td class="title2">정산자</td>
									<td width="10%" class="contant-center">
										<xsl:value-of select="APPROVAL/adjst_empno" />
										<br />
									</td>
									<td width="20%" class="contant-center">
										<xsl:value-of select="APPROVAL/adjst_psn_nm" />
										<br />
									</td>
									<td class="title2">정산부서</td>
									<td class="contant-center" colspan="2">
										<xsl:value-of select="APPROVAL/adjst_dept_nm" />
										<br />
									</td>

								</tr>
								<tr>
									<td class="title2">신청금액</td>
									<td class="contant-right" colspan="2">
										<xsl:value-of select="format-number(APPROVAL/req_amt, '#,###')" />
										<br />
									</td>
									<td class="title2">정산금액</td>
									<td class="contant-right" colspan="2">
										<xsl:value-of select="format-number(APPROVAL/adjst_amt, '#,###')" />
										<br />
									</td>
								</tr>
								<tr>
									<td class="title2">결의번호</td>
									<td colspan="2" class="contant-center">
										<xsl:value-of select="APPROVAL/unslip_no" />
									</td>
									<td colspan="3" class="contant-center" valign="center" style="padding:0">
										<a>
											<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="APPROVAL/unslip_no" />')</xsl:attribute>
											<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif" style="display:block;vertical-align:top;padding-left:10px" />
										</a>
									</td>
								</tr>
								<tr>
									<td class="title2">정산내역</td>
									<td class="contant" colspan="5">
										<xsl:value-of select="APPROVAL/adjst_detls" />
										<br />
									</td>

								</tr>
								<xsl:if test="APPROVAL/bank_nm != ''">
									<tr>
										<td class="title2">은행/계좌번호</td>
										<td width="15%" class="contant-center">
											<xsl:value-of select="APPROVAL/bank_nm" />
											<br />
										</td>
										<td width="20%" class="contant-center">
											<xsl:value-of select="APPROVAL/bankaccnt_no" />
											<br />
										</td>
										<td class="title2">개인번호/예금주</td>
										<td width="10%" class="contant-center">
											<xsl:value-of select="APPROVAL/empno" />
										</td>
										<td with="10%" class="contant-center">
											<xsl:value-of select="APPROVAL/depstr_nm" />
											<br />
										</td>
									</tr>
								</xsl:if>
							</table>
						</td>
					</tr>
				</table>

				<p />
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
					<tr>
						<td width="100%" class="head">정산 계정 내역</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="4%" class="title">순번</td>
									<td width="10%" class="title">계정번호</td>
									<td width="10%" class="title">회계코드</td>
									<td width="15%" class="title">회계코드명</td>
									<td width="8%" class="title">비용코드</td>
									<td width="14%" class="title">비용코드명</td>
									<td width="12%" class="title">신청금액</td>
									<td width="12%" class="title">정산금액</td>
									<td width="15%" class="title">통제번호</td>
								</tr>
								<xsl:for-each select="APPROVAL/FinPayAdvcAdjstReq/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:number count="APPROVAL/FinPayAdvcAdjstReq/vector/data" level="single" format="1" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcAdjstMS02/accnt_no" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcAdjstMS02/accnt_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcAdjstMS02/accnt_cd_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcAdjstMS02/expns_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcAdjstMS02/expns_cd_nm" />
										</td>
										<td class="contant-right">
											<xsl:if test="msgFspPayAdvcAdjstMS02/req_amt != ''">
												<xsl:value-of select="format-number(msgFspPayAdvcAdjstMS02/req_amt, '#,###,###')" />
											</xsl:if>
											<br />
										</td>
										<td class="contant-right">
											<xsl:if test="msgFspPayAdvcAdjstMS02/adjst_amt != ''">
												<xsl:value-of select="format-number(msgFspPayAdvcAdjstMS02/adjst_amt, '#,###,###')" />
											</xsl:if>
											<br />
										</td>
										<td class="contant-center">
											<xsl:if test="msgFspPayAdvcAdjstMS02/ctrl_no != ''">
												<xsl:value-of select="msgFspPayAdvcAdjstMS02/ctrl_no" />
											</xsl:if>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<p />
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
					<tr>
						<td width="100%" class="head">잔액 입금 내역</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="4%" class="title">순번</td>
									<td width="15%" class="title">입금일자</td>
									<td width="25%" class="title">계좌번호</td>
									<td width="13%" class="title">입금금액</td>
									<td width="20%" class="title">입금내역</td>
									<td width="23%" class="title">비고</td>
								</tr>
								<xsl:for-each select="APPROVAL/FcpDepstDetls/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:number count="APPROVAL/FcpDepstDetls/vector/data" level="single" format="1" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFcpDepstDetlsMS02/depst_ymd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFcpDepstDetlsMS02/bankaccnt_no" />
										</td>
										<td class="contant-right">
											<xsl:if test="msgFcpDepstDetlsMS02/depst_amt != ''">
												<xsl:value-of select="format-number(msgFcpDepstDetlsMS02/depst_amt, '#,###,###')" />
											</xsl:if>
											<br />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFcpDepstDetlsMS02/detls" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFcpDepstDetlsMS02/rmk" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<p />
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
					<tr>
						<td width="100%" class="head">정산 추가계정 내역</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td width="4%" class="title">순번</td>
									<td width="8%" class="title">구분</td>
									<td width="8%" class="title">계정번호</td>
									<td width="15%" class="title">계정명</td>
									<td width="8%" class="title">회계코드</td>
									<td width="15%" class="title">회계코드명</td>
									<td width="8%" class="title">비용코드</td>
									<td width="14%" class="title">비용코드명</td>
									<td width="10%" class="title">신청금액</td>
									<td width="10%" class="title">통제번호</td>
								</tr>
								<xsl:for-each select="APPROVAL/FinPayAdvcAdjstAddReq/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:number count="APPROVAL/FinPayAdvcAdjstAddReq/vector/data" level="single" format="1" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcAdjstSS01/cd_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcAdjstSS01/accnt_no" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcAdjstSS01/accnt_no_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcAdjstSS01/accnt_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcAdjstSS01/accnt_cd_abbr" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcAdjstSS01/expns_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspPayAdvcAdjstSS01/expns_cd_nm" />
										</td>
										<td class="contant-right">
											<xsl:if test="msgFspPayAdvcAdjstSS01/req_amt != ''">
												<xsl:value-of select="format-number(msgFspPayAdvcAdjstSS01/req_amt, '#,###,###')" />
											</xsl:if>
											<br />
										</td>
										<td class="contant-center">
											<xsl:if test="msgFspPayAdvcAdjstSS01/ctrl_no != ''">
												<xsl:value-of select="msgFspPayAdvcAdjstSS01/ctrl_no" />
											</xsl:if>
										</td>
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
								<xsl:for-each select="APPROVAL/FILE_LIST/vector/data/msgFspPayAdvcAdjstMS05">
									<tr>
										<td class="title2" width="16%">첨부파일(<xsl:value-of select="seq" />)
										</td>
										<td class="contant" width="84%">
											<a>
												<xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="attach_full_path" />/<xsl:value-of select="org_file" />')</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
			</body>
	</xsl:template>
</xsl:stylesheet>
