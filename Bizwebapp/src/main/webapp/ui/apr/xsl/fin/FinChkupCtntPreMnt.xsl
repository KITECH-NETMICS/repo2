<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="snapshot.css" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:fo="http://www.w3.org/1999/XSL/Format">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
			<body>
				<script language="javascript">
		<![CDATA[ 
			/* 사진화일  */
			function openPhotoFile (photoFileNo) {						
				var photoUrl = "https://biz.kitech.re.kr/bizimages/pur/attach/"+photoFileNo;	
				window.open(photoUrl, "", "width=1024, height=768, toolbar=no, menubar=no, resizable=yes, titlebar=yes");
			}
			
			/* 사전 안전성 검토 */
			function openSafeDodfpr(safeReqNo){
				var ozFileNm = "/ccs/csf/SafeDodfprRegistMnt.ozr";
				var ozrNm = "SafeDodfprRegistMnt";
				var url = "https://biz.kitech.re.kr/websquare/popup.html?w2xPath=/kitech/com/oz/ComPopupOZReport.xml";
				var node = url+"&ozr="+ozFileNm+"&odi="+ozrNm+"&printMode=Y&param=req_no^"+safeReqNo;
				node = node.replaceAll("amp;","");
				if(navigator.appName != "Microsoft Internet Explorer"){
					node = node.replaceAll("amp;","");
				}
				window.open(node,"OZReport", "width=1012px, height=610px, location=no, resizable=yes");   
				
			}
		]]>
				</script>
				<div style="text-align:left;font-weight:bold"><xsl:value-of select='APPROVAL/msg' /></div>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td width="15%" class='title2'>검수번호</td>
									<td width="20%" class="contant-center">
										<xsl:value-of select="APPROVAL/check_no" />
										<br />
									</td>
									<td width="15%" class='title2'>검사부서</td>
									<td width="20%" class="contant-center">
										<xsl:value-of select="APPROVAL/check_dept_nm" />
										<br />
									</td>
									<td width="15%" class='title2'>검사일자</td>
									<td width="30%" class="contant-center">
										<xsl:value-of select="substring(APPROVAL/check_ymd, 0, 5)" />
										-
										<xsl:value-of select="substring(APPROVAL/check_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(APPROVAL/check_ymd, 7, 2)" />
										<br />
									</td>
								</tr>

								<tr>
									<td class='title2'>검수금액</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(APPROVAL/check_amt, '#,###')" />
										<br />
									</td>
									<td class='title2'>검사자</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/check_nm" />
										(
										<xsl:value-of select="APPROVAL/check_empno" />
										)
										<br />
									</td>
									<td class='title2'>당해년도 과제기간</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/start_ymd" /> ~ <xsl:value-of select="APPROVAL/cls_ymd" />
										<br/> 
									</td>
								</tr>
								<tr>
									<td class='title2'>계정번호</td>
									<td class="contant" colspan="3">
										(
										<xsl:value-of select="APPROVAL/accnt_no" />
										)
										
										<xsl:value-of select="APPROVAL/accnt_nm" />
										<br />
									</td>
									<td class='title2'>계정책임자</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/accnt_rspns_nm" />
										(
										<xsl:value-of select="APPROVAL/accnt_rspns" />
										)
										<br />
									</td>
								</tr>

								<tr>
									<td class='title2'>비용코드</td>
									<td class="contant">
										(
										<xsl:value-of select="APPROVAL/expns_cd" />
										)
										
										<xsl:value-of select="APPROVAL/expns_nm" />
										<br />
									</td>
									<td class='title2'>회계코드</td>
									<td class="contant" colspan="3">
										(
										<xsl:value-of select="APPROVAL/accnt_cd" />
										)
										
										<xsl:value-of select="APPROVAL/accnt_cd_abbr" />
										<br />
									</td>
								</tr>

								<tr>
									<td class='title2'>검수(입회)자</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/entsch_check_nm" />
										(
										<xsl:value-of select="APPROVAL/entsch_check_empno" />
										)
										<br />
									</td>
									<td class='title2'>검수(입회)부서</td>
									<td class="contant-center">
										<xsl:value-of select="APPROVAL/entsch_check_dept_nm" />
										<br />
									</td>
									<td class='title2'>검수(입회)자직책</td>
									<td class="contant-center">
										<xsl:value-of select="APPROVAL/entsch_psn_posi_nm" />
										<br />
									</td>
								</tr>
								<tr>
									<td class='title2'>납품일자</td>
									<td class="contant-center">
										<xsl:value-of select="substring(APPROVAL/delvr_ymd, 0, 5)" />
										-
										<xsl:value-of select="substring(APPROVAL/delvr_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(APPROVAL/delvr_ymd, 7, 2)" />
										<br />
									</td>
									<td class='title2'>사전안전성</td>
									<td class="contant-center">
										<a>
										<xsl:attribute name="href">javascript:openSafeDodfpr("<xsl:value-of select='APPROVAL/safe_req_no' />")</xsl:attribute>
										<xsl:value-of select="APPROVAL/safe_req_no"></xsl:value-of>
										</a>
									</td>
									<td class='title2'>기술장비/컴퓨터 관련여부</td>
									<td class="contant-center">
										<xsl:value-of select="APPROVAL/equip_doc" />
									</td>
								</tr>
								<tr>
									<td class='title2'>지역,건물,층,호수</td>
									<td class="contant" colspan="5">
										<xsl:value-of select="APPROVAL/posi_regionNm" />
										시
										
										<xsl:value-of select="APPROVAL/posi_buildNm" />
										동
										
										<xsl:value-of select="APPROVAL/posi_floorNm" />
										
										<xsl:value-of select="APPROVAL/posi_editNm" />
										호
										
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				
				<xsl:variable name="doc_count" select="count(APPROVAL/doc/vector/data)" />
				<xsl:if test="$doc_count &gt; 0">
				<script>
					var aprActionButtonArr = $("#aprActionTbl tbody tr td a img");
					var aprActionInputArr = $("#aprActionTbl tbody tr td input");
					var gyolJae = "";
					var gyolJaeCt = "";
					var gyolJaeCnt = 0;
					for (var i = 0; i != aprActionInputArr.length; i++) {
						if(aprActionInputArr[i].src.match('bt_gyoljae')){
							gyolJae = $(aprActionInputArr[i]);
							gyolJae.hide();
							gyolJaeCnt++;
						}
					}
					for (var i = 0; i != aprActionButtonArr.length; i++) {
						if(aprActionButtonArr[i].src.match('bt_gyoljae')){
							gyolJaeCt = $(aprActionButtonArr[i]);
							gyolJaeCt.hide();
							gyolJaeCnt++;
						}
					}
					
					setTimeout(function(){
					    if(gyolJaeCnt != 0){
							$("#aprActionTbl tbody tr").prepend($("#hiddenLabelWrap").html());
						}
					},500)
				</script>
				<table style="display: none;">
					<tr id="hiddenLabelWrap">
						<td id="LabelWrap" style="position: relative;">
							<a style="cursor:pointer;margin-left:5px;display: inline-block;">
								<xsl:attribute name="href">javascript:openLabelPrint("<xsl:value-of select="APPROVAL/safe_req_no" />")</xsl:attribute>
								<img>
									<xsl:attribute name="src">/images/Icon/bt_print.gif</xsl:attribute>
								</img>
								<span style="position: absolute;width: 49%;top: 4px;left: 29px;color: #7a7a7a;height: 19px;line-height: 1.9;text-align: center;background: rgb(255,255,255);background: linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(227,227,227,1) 100%);cursor: pointer;">라벨</span>
							</a>
						</td>
					</tr>
				</table>
				
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
						<tr>
							<td width="100%" class="head">화학물질 사전 안전성 검토</td>
						</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td class='title'>제품명</td>
									<td class='title'>물질명(영문)</td>
									<td class='title'>CAS 번호</td>
									<td class='title'>혼합물여부</td>
									<td class='title'>용량</td>
									<td class='title'>수량</td>
									<td class='title'>MSDS 링크</td>
								</tr>
								<xsl:for-each select="APPROVAL/doc/vector/data/msgSfcChmclsSafeDcdfprDetailMS02">
									<tr>
										<!-- 제품명 -->
										<td width="10%" class="contant-center">
											<xsl:value-of select="prduct_nm" />
										</td>
										<!-- 물질명(영문) -->
										<td width="25%" class="contant-center">
											<xsl:value-of select="chmcls_nm_en" />
										</td>
										<!-- CAS 번호 -->
										<td width="10%" class="contant-center">
											<xsl:value-of select="cas_no" />
										</td>
										<!-- 혼합물여부 -->
										<td width="10%" class="contant-center">
											<xsl:value-of select="mixtr_mttr_cd" />
										</td>
										<!-- 용량 -->
										<td width="20%" class="contant-center">
											<xsl:value-of select="cpcty_qty" />
										</td>
										<!-- 수량 -->
										<td width="10%" class="contant-center">
											<xsl:value-of select="format-number(item_qty, '#,###,###')" />
										</td>
										<!-- MSDS 링크 -->
										<td width="25%" class="contant-center">
											<xsl:if test="msds_url != '' and string-length(normalize-space(msds_url)) &gt; 37">
												<a>
													<xsl:attribute name="href"><xsl:value-of select="msds_url" /></xsl:attribute>
													<xsl:attribute name="target">blank</xsl:attribute>
													링크									
												</a>
											</xsl:if>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<p />
				</xsl:if>
				
				<p />
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
					<tr>
						<td width="100%" class="head">소액물품 검수 상세내역</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td class='title'>품명</td>
									<td class='title'>단위</td>
									<td class='title'>수량</td>
									<td class='title'>단가</td>
									<td class='title'>금액(부가세별도)</td>
									<td class='title'>부가세</td>
									<td class='title'>총액</td>
								</tr>
								<xsl:for-each select="APPROVAL/doc2/vector/data">
									<tr>
										<td class="contant">
											<xsl:value-of select="msgFspSmlItmCheckupMS02/item_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgFspSmlItmCheckupMS02/item_unit_nm" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgFspSmlItmCheckupMS02/item_qty, '#,###.###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgFspSmlItmCheckupMS02/item_unit_price, '#,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgFspSmlItmCheckupMS02/item_amt, '#,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgFspSmlItmCheckupMS02/tax_amt, '#,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgFspSmlItmCheckupMS02/totl_amt, '#,###')" />
										</td>
									</tr>
								</xsl:for-each>
									<tr>
										<td class="title2" colspan="3">합 계</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(APPROVAL/item_unit_price_sum, '#,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(APPROVAL/item_amt_sum, '#,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(APPROVAL/tax_amt_sum, '#,###')" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(APPROVAL/totl_amt_sum, '#,###')" />
										</td>
									</tr>
							</table>
						</td>
					</tr>
				</table>
				<p />
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<xsl:for-each select="APPROVAL/fileList_A/vector/data/mdata">
									<tr>
										<td class="title2" width="16%">첨부파일(<xsl:value-of select="seq" />)</td>
										<td class="contant" width="84%">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select='attach_file_no' /><xsl:value-of select='seq' />", "XAA002")</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</td>
									</tr>
								</xsl:for-each>
								<xsl:for-each select="APPROVAL/fileList_B/vector/data/mdata">
									<tr>
										<td class="title2" width="16%">사진파일(<xsl:value-of select="seq" />)</td>
										<td class="contant" width="84%">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select='attach_file_no' /><xsl:value-of select='seq' />", "XAA002")</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<xsl:for-each select="APPROVAL/fileList_Z/vector/data/msgXomxComAttachFileMS01">
									<tr>
										<td class="title2" width="16%">거래명세서</td>
										<td class="contant" width="84%">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select='attach_file_no' /><xsl:value-of select='seq' />", "XAA002")</xsl:attribute>
												<xsl:value-of select="org_file" />
											</a>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
					<xsl:if test="APPROVAL/photo_attach_file_no != ''">
						<tr>
							<td class="head">사진파일</td>
						</tr>
						<tr>
							<td class="contant">
								<a>
									<xsl:attribute name="href">javascript:openPhotoFile("<xsl:value-of select='APPROVAL/photo_attach_file_no' />")</xsl:attribute>
									<xsl:value-of select="APPROVAL/photo_attach_file_no"></xsl:value-of>
								</a>
							</td>
						</tr>
					</xsl:if>
				</table>
				<div>
				</div>
			</body>
	</xsl:template>
</xsl:stylesheet>