<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/APPROVAL">
		<xsl:variable name="localPath" select="request/localPath" />
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

				<table width="100%" border="0" cellpadding="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td class='title2' width="16%">특정업체</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="spcfic_vend" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="16%" rowspan="2">특정구매 근거</td>
									<td class="contant" width="10%" rowspan="2">
										수의계약
										<br />
										제 35조
									</td>
									<td class="contant">
										<xsl:value-of select="contrct_base_clause_desc" />
									</td>
								</tr>
								<tr>
									<td class="contant">
										<xsl:value-of select="contrct_base_no_desc" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<br />

				<table width="100%" border="0" cellpadding="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td class='title2' width="16%">특정구매신청번호</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="elecapp_docu_no" />
									</td>
									<td class='title2' width="16%">특정구매요구일자</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="spcfic_req_ymd" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="16%">구매요구번호</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="pur_req_no" />
									</td>
									<td class='title2' width="16%">구매요구일자</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="req_ymd" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="16%">구매요구부서</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="req_dept_cd_nm" />
									</td>
									<td class='title2' width="16%">계정번호</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="accnt_no" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" class="aproutertable">
					<tr>
						<td>
							<table width="100%">
								<tr>
									<td class="head" style="width:90%;"> 품목정보</td>
									<td width="200" style="vertical-align:bottom;">(단위: 원)</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" class="aprinnertable">
								<tr>
									<!-- TODO 컬럼 사이즈 조절 -->
									<td class='title'>품명</td>
									<td class='title'>단위</td>
									<td class='title'>수량</td>
									<td class='title' width="12%">추정단가</td>
									<td class='title' width="11%">화폐단위</td>
									<td class='title' width="13%">추정금액</td>
									<!-- <td class='title'>부가세</td> -->
									<td class='title'>합계</td>
									<td class='title'>비고</td>
								</tr>
								<xsl:for-each select="doc1/vector/data">
									<tr>
										<td class="contant">
											<xsl:value-of select="msgPurReqItem/eng_gdnm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgPurReqItem/unit_desc" />
										</td>
										<td class="contant-right">
											<xsl:if test="msgPurReqItem/qty != ''">
												<xsl:value-of select="format-number(msgPurReqItem/qty, '###,###,###,##0')" />
											</xsl:if>
										</td>
										<td class="contant-right">
											<xsl:if test="msgPurReqItem/req_unit_price != ''">
												<xsl:value-of select="format-number(msgPurReqItem/req_unit_price, '###,###,###,##0')" />
											</xsl:if>
										</td>
										<td class='contant-center'>
											<xsl:value-of select="msgPurReqItem/curncy_unit_desc" />
										</td>
										<td class="contant-right">
											<xsl:if test="msgPurReqItem/req_amt != ''">
												<xsl:value-of select="format-number(msgPurReqItem/req_amt, '###,###,###,##0')" />
											</xsl:if>
										</td>
										<!-- <td class="contant-right"><xsl:if test="msgPurReqItem/req_time_addtax_extexpns != ''"> <xsl:value-of select="format-number(msgPurReqItem/req_time_addtax_extexpns, 
											'###,###,###,##0')" /> </xsl:if></td> -->
										<td class="contant-right">
											<xsl:if test="msgPurReqItem/req_amt_sum != ''">
												<xsl:value-of select="format-number(msgPurReqItem/req_amt_sum, '###,###,###,##0')" />
											</xsl:if>
										</td>
										<td class="contant">
											<xsl:value-of select="msgPurReqItem/rmk" />
										</td>
									</tr>
								</xsl:for-each>
								<tr>
									<td colspan="3" class="contant-center">합 계</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(req_unit_price, '#,###')" />
									</td>
									<td class="contant-right"></td>
									<td class="contant-right">
										<xsl:value-of select="format-number(req_amt, '#,###')" />
									</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(req_amt_sum, '#,###')" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<br />

				<table width="100%" border="0" cellpadding="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td class='title2' width="16%">납품요구일자</td>
									<td class="contant" width="34%">
										계약 후
										<xsl:value-of select="delvr_demnd_daycnt" />
										일 이내
									</td>
									<td class='title2' width="16%">비고</td>
									<td class="contant">
										<xsl:value-of select="rmk" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="16%">물품사항</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="goods_item" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="16%">특정사유</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="spcfic_cause" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" class="aproutertable">
					<tr>
						<td class="head"> 첨부파일</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<xsl:for-each select="fileList_A/vector/data/mdata">
									<tr>
										<td class='title2' width="16%"><xsl:value-of select="seq" /></td>
										<td class='contant' width="84%">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>

			</BODY>
	</xsl:template>
</xsl:stylesheet>