<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<body>
			<script language="javascript">
			<![CDATA[ 
				/* 사진화일  */
				function openPhotoFile (photoFileNo) {						
					var photoUrl = "https://nbiz.kitech.re.kr/bizimages/pur/attach/"+photoFileNo;	
					window.open(photoUrl, "", "width=1024, height=768, toolbar=no, menubar=no, resizable=yes, titlebar=yes");
				}
				
				/* 사전 안전성 검토 */
				function openSafeDodfpr(safeReqNo){				
					var node="req_no=" + safeReqNo;
					com.oz.openPopup({
						ozrCode : "C040",
						param: node
			        });				
				}
			]]>
			</script>
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
				<tr>
					<td class="body">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
							<tr>
								<td width="15%" class='title2'>검수번호</td>
								<td width="20%" class="contant">
									<xsl:value-of select="root/mastVo/check_no" />
								</td>
								<td width="15%" class='title2'>검사부서</td>
								<td width="20%" class="contant">
									<xsl:value-of select="root/mastVo/check_dept_nm" />
									<br />
								</td>
								<td width="15%" class='title2'>검사일자</td>
								<td width="30%" class="contant">
									<xsl:value-of select="substring(root/mastVo/check_ymd, 0, 5)" />
									-
									<xsl:value-of select="substring(root/mastVo/check_ymd, 5, 2)" />
									-
									<xsl:value-of select="substring(root/mastVo/check_ymd, 7, 2)" />
									<br />
								</td>
							</tr>
							<tr>
								<td class='title2'>검수금액</td>
								<td class="contant-right">
									<xsl:value-of select="format-number(root/mastVo/check_amt, '#,###')" />
									<br />
								</td>
								<td class='title2'>검사자</td>
								<td class="contant">
									<xsl:value-of select="root/mastVo/check_nm" />
									(
									<xsl:value-of select="root/mastVo/check_empno" />
									)
									<br />
								</td>
								<td class='title2'>당해년도 과제기간</td>
								<td class="contant">
									<xsl:value-of select="root/mastVo/start_ymd" />									
									~
									<xsl:value-of select="root/mastVo/cls_ymd" />									
								</td>
							</tr>
							<tr>
								<td class='title2'>계정번호</td>
								<td class="contant" colspan="3">
									(
									<xsl:value-of select="root/mastVo/accnt_no" />
									)
									<xsl:value-of select="root/mastVo/accnt_no_nm" />
								</td>
								<td class='title2'>계정책임자</td>
								<td class="contant">
									<xsl:value-of select="root/mastVo/accnt_rspns_nm" />
									(
									<xsl:value-of select="substring(root/mastVo/accnt_rspns, 3, 6)" />
									)
								</td>
							</tr>
							<tr>
								<td class='title2'>비용코드</td>
								<td class="contant">
									(
									<xsl:value-of select="root/mastVo/expns_cd" />
									)
									<xsl:value-of select="root/mastVo/expns_cd_nm" />
								</td>
								<td class='title2'>회계코드</td>
								<td class="contant" colspan="3">
									(
									<xsl:value-of select="root/mastVo/accnt_cd" />
									)
									<xsl:value-of select="root/mastVo/accnt_cd_abbr" />
								</td>
							</tr>
							<tr>
								<td class='title2'>검수(입회)자</td>
								<td class="contant">
									<xsl:value-of select="root/mastVo/entsch_psn_nm" />
									(
									<xsl:value-of select="root/mastVo/entsch_psn_empno" />
									)
								</td>
								<td class='title2'>검수(입회)부서</td>
								<td class="contant">
									<xsl:value-of select="root/mastVo/entsch_check_dept_nm" />
								</td>
								<td class='title2'>검수(입회)자직책</td>
								<td class="contant">
									<xsl:value-of select="root/mastVo/entsch_psn_posi_nm" />
								</td>
							</tr>
							<tr>
								<td class='title2'>납품일자</td>
								<td class="contant">
									<xsl:value-of select="substring(root/mastVo/delvr_ymd, 0, 5)" />
									-
									<xsl:value-of select="substring(root/mastVo/delvr_ymd, 5, 2)" />
									-
									<xsl:value-of select="substring(root/mastVo/delvr_ymd, 7, 2)" />
								</td>
								<td class='title2'>사전안전성</td>
								<td class="contant">
									<a>
										<xsl:attribute name="href">javascript:openSafeDodfpr("<xsl:value-of select='root/mastVo/safe_req_no' />")</xsl:attribute>
										<xsl:value-of select="root/mastVo/safe_req_no"></xsl:value-of>
									</a>
								</td>
								<td class='title2'>기술장비/컴퓨터 관련여부</td>
								<td class="contant">
									<xsl:if test="root/mastVo/equip_doc_yn = 'Y'"> 해당</xsl:if>
									<xsl:if test="root/mastVo/equip_doc_yn != 'Y'"> 해당안함</xsl:if>
								</td>
							</tr>
							<tr>
								<td class='title2'>지역,건물,층,호수</td>
								<td class="contant" colspan="5">
									<xsl:if test="root/mastVo/instl_posi_region_cd !=''">
										<xsl:value-of select="root/mastVo/instl_posi_region_cd" />,
										<xsl:value-of select="root/mastVo/instl_posi_build_cd" />,									
										<xsl:value-of select="root/mastVo/instl_posi_floor_cd" />,
										<xsl:value-of select="root/mastVo/instl_posi_editno" /> 호
									</xsl:if>									
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<xsl:variable name="doc_count" select="count(root/safeList)" />
			<xsl:if test="$doc_count != 0">	
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
								<xsl:for-each select="root/safeList">
									<tr>
										<!-- 제품명 -->
										<td width="10%" class="contant">
											<xsl:value-of select="prduct_nm" />
										</td>
										<!-- 물질명(영문) -->
										<td width="25%" class="contant">
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
										<td width="20%" class="contant-right">
											<xsl:value-of select="cpcty_qty" />
										</td>
										<!-- 수량 -->
										<td width="10%" class="contant-right">
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
							<xsl:variable name="item_unit_price_sum" select="sum(root/itemList/item_unit_price)" />
							<xsl:variable name="item_amt_sum" select="sum(root/itemList/item_amt)" />
							<xsl:variable name="tax_amt_sum" select="sum(root/itemList/tax_amt)" />
							<xsl:variable name="totl_amt_sum" select="sum(root/itemList/totl_amt)" />
							<xsl:for-each select="root/itemList">
								<tr>
									<td class="contant">
										<xsl:value-of select="item_nm" />
									</td>
									<td class="contant-center">
										<xsl:value-of select="item_unit_nm" />
									</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(item_qty, '#,###.###')" />
									</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(item_unit_price, '#,###')" />
									</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(item_amt, '#,###')" />
									</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(tax_amt, '#,###')" />
									</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(totl_amt, '#,###')" />
									</td>
								</tr>
							</xsl:for-each>
							<tr>
								<td class="title2" colspan="3">합 계</td>
								<td class="contant-right">
									<xsl:value-of select="format-number($item_unit_price_sum, '#,###')" />
								</td>
								<td class="contant-right">
									<xsl:value-of select="format-number($item_amt_sum, '#,###')" />
								</td>
								<td class="contant-right">
									<xsl:value-of select="format-number($tax_amt_sum, '#,###')" />
								</td>
								<td class="contant-right">
									<xsl:value-of select="format-number($totl_amt_sum, '#,###')" />
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
							<xsl:for-each select="root/fileList_A">
								<tr>
									<td class="title2" width="16%">
										첨부파일(
										<xsl:value-of select="seq" />
										)
									</td>
									<td class="contant" width="84%">
										<a>
											<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select='attach_file_no' /><xsl:value-of
												select='seq' />", "XAA002")</xsl:attribute>
											<xsl:value-of select="file_nm" />
										</a>
										<xsl:if test="attach_file_no != ''">
											<a>
												<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of
													select="seq" />')</xsl:attribute>
												<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기"
													style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;" />
											</a>
										</xsl:if>
										<br/>
									</td>
								</tr>
							</xsl:for-each>
							<xsl:for-each select="root/fileList_B">
								<tr>
									<td class="title2" width="16%">
										사진파일(
										<xsl:value-of select="seq" />
										)
									</td>
									<td class="contant" width="84%">
										<a>
											<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select='attach_file_no' /><xsl:value-of
												select='seq' />", "XAA002")</xsl:attribute>
											<xsl:value-of select="file_nm" />
										</a>
										<xsl:if test="attach_file_no != ''">
											<a>
												<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of
													select="seq" />')</xsl:attribute>
												<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기"
													style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;" />
											</a>
										</xsl:if>
										<br/>
									</td>
								</tr>
							</xsl:for-each>
						</table>
					</td>
				</tr>
				<tr>
					<td class="body">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
							<xsl:for-each select="root/evidFileList">
								<tr>
									<td class="title2" width="16%"><xsl:value-of select='fileName' /></td>
									<td class="contant" width="84%">
										<a>
											<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select='attach_file_no' /><xsl:value-of
												select='seq' />", "XAA002")</xsl:attribute>
											<xsl:value-of select="file_nm" />
										</a>
										<xsl:if test="attach_file_no != ''">
											<a>
												<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of
													select="seq" />')</xsl:attribute>
												<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기"
													style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;" />
											</a>
										</xsl:if>
										<br/>
									</td>
								</tr>
							</xsl:for-each>
						</table>
					</td>
				</tr>
				<xsl:if test="root/mastVo/photo_attach_file_no != ''">
					<tr>
						<td class="head">사진파일</td>
					</tr>
					<tr>
						<td class="contant">
							<a>
								<xsl:attribute name="href">javascript:openPhotoFile("<xsl:value-of select='root/mastVo/photo_attach_file_no' />")</xsl:attribute>
								<xsl:value-of select="root/mastVo/photo_attach_file_no"></xsl:value-of>
							</a>
						</td>
					</tr>
				</xsl:if>
			</table>
		</body>
	</xsl:template>
</xsl:stylesheet>