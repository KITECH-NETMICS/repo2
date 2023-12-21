<?xml version="1.0"?>
<!DOCTYPE xsl:stylesheet [ <!ENTITY nbsp "&#160;"> ]>
<xsl:stylesheet xmlns:LINS="snapshot.css" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:fo="http://www.w3.org/1999/XSL/Format">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
		
			<BODY>
				<script language="javascript"><![CDATA[
					(function(){
						var imgPath = "https://biz.kitech.re.kr/bizimages/tec/attach/";
										
						if (document.getElementById('attachImg1')) {
							var img1 = document.getElementById('attachImg1').innerText;
							if (img1 != "") {
								document.getElementById('attachImgNo1').src = imgPath + img1;
							}
						}
					
						if (document.getElementById('attachImg2')) {
							var img2 = document.getElementById('attachImg2').innerText;
							if (img2 != "") {
								document.getElementById('attachImgNo2').src = imgPath + img2;
							}
						}
					
						if (document.getElementById('attachImg3')) {
							var img3 = document.getElementById('attachImg3').innerText;
							if (img3 != "") {
								document.getElementById('attachImgNo3').src = imgPath + img3;
							}
						}
					
					})();
					
					function newPop(fnm) {
						var photoFileNo = fnm;
					
						if (photoFileNo == null || photoFileNo == "") {
							alert("첨부된 파일이 없습니다.");
							return false;
						}
					
						var photoUrl = "https://biz.kitech.re.kr/" + photoFileNo;
					
						window.open(photoUrl, "", "width=1280 height=750, top=100, toolbar=no, menubar=no, resizable=yes, titlebar=yes");
					}
				]]></script>

				<!-- [B]신청내용 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">기술이전기본정보</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width='16%' class='title2'>신청번호</td>
									<td width='20%' class='contant'>
										<xsl:value-of select="APPROVAL/req_no" />
									</td>
									<td width='15%' class='title2'>신청자</td>
									<td width='49%' class='contant' colspan='3'>
										<xsl:value-of select="APPROVAL/req_psn_nm" />
										/
										<xsl:value-of select="APPROVAL/req_dept_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>기술의 출처</td>
									<td class='contant'>
										<xsl:value-of select="APPROVAL/mou_clsf" />
										<xsl:value-of select="APPROVAL/tech_prj_clsf" />
									</td>
									<td class='title2'>계약형태</td>
									<td class='contant'>
										<xsl:value-of select="APPROVAL/trns_typ" />
									</td>
									<td class='title2' width='15%'>실시범위</td>
									<td class='contant'>
										<xsl:value-of select="APPROVAL/trns_scop" />
									</td>
								</tr>
								<tr>
									<td class='title2'>이전기술명</td>
									<td colspan='5' class='contant'>
										<xsl:value-of select="APPROVAL/mou_clsf" /> 
										/
										<xsl:value-of select="APPROVAL/trns_krn_nm" />
										/
										<xsl:value-of select="format-number(APPROVAL/fxd_tech_fee, '#,###')" />
									</td>
								</tr>
								<tr>
									<td class='title2'>기술이전책임자</td>
									<td class='contant'>
										<xsl:value-of select="APPROVAL/trns_rspns_nm" />
									</td>
									<td class='title2'>이전책임자 부서</td>
									<td colspan='3' class='contant'>
										<xsl:value-of select="APPROVAL/trns_rspns_dept_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>희망계약기간</td>
									<td colspan='5' class='contant'>
										<xsl:value-of select="substring(APPROVAL/contrct_ymd, 1, 4)" />-<xsl:value-of select="substring(APPROVAL/contrct_ymd, 5, 2)" />-<xsl:value-of select="substring(APPROVAL/contrct_ymd, 7, 2)" />
										~
										<xsl:value-of select="substring(APPROVAL/contrct_ymd, 12, 4)" />-<xsl:value-of select="substring(APPROVAL/contrct_ymd, 16, 2)" />-<xsl:value-of select="substring(APPROVAL/contrct_ymd, 18, 2)" />
									</td>
								</tr>
								<xsl:if test="APPROVAL/fxd_tech_suply_value != ''">
									<tr>
										<td class='title2'>정액기술료 공급가</td>
										<td class='contant-right'>
											<xsl:value-of select="format-number(APPROVAL/fxd_tech_suply_value, '#,###')" />
										</td>
										<td class='title2'>정액기술료 부가세</td>
										<td class='contant-right'>
											<xsl:if test="APPROVAL/fxd_tech_tax_fee != ''">
												<xsl:value-of select="format-number(APPROVAL/fxd_tech_tax_fee, '#,###')" />
											</xsl:if>
										</td>
										<td class='title2'>정액기술료</td>
										<td class='contant-right'>
											<xsl:if test="APPROVAL/fxd_tech_fee != ''">
												<xsl:value-of select="format-number(APPROVAL/fxd_tech_fee, '#,###')" />
											</xsl:if>
										</td>
									</tr>
								</xsl:if>
								<xsl:if test="APPROVAL/run_ryalty != ''">
									<tr>
										<td class='title2'>경상기술료</td>
										<td class='contant-right'>
											<xsl:value-of select="format-number(APPROVAL/run_ryalty, '#,###.##')" />
											(
											<xsl:value-of select="APPROVAL/unit_typ" />
											)

										</td>
										<td class='title2' colspan="2">경상기술료 징수예상액</td>
										<td colspan="2" class='contant-right'>
											<xsl:if test="APPROVAL/estmt_collct_amt != ''">
												<xsl:value-of select="format-number(APPROVAL/estmt_collct_amt, '#,###')" />
											</xsl:if>
										</td>
									</tr>
									<tr>
										<td class='title2'>경상기술료산정기준</td>
										<td colspan='5' class='contant'>
											<xsl:value-of select="APPROVAL/estmt_stndrd" />
										</td>
									</tr>
								</xsl:if>
								<tr>
									<td class='title2'>수요기업존재여부</td>
									<td class='contant'>
										<xsl:value-of select="APPROVAL/dmnd_vend_yn" />
									</td>
									<td class='title2'>기타기술이전조건</td>
									<td colspan='3' class='contant'>
										<xsl:value-of select="APPROVAL/etc_cnd" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<!-- [B]신청내용 (종료) -->

				<!-- [C]계정정보 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">과제정보</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width='13%' class='title2'>계정번호</td>
									<td width='19%' class='contant-center'>
										<xsl:value-of select="APPROVAL/accnt_no" />
									</td>
									<td width='13%' class='title2'>과제기간</td>
									<td width='25%' class='contant'>
										<xsl:value-of select="substring(APPROVAL/start_ymd, 1, 4)" />-<xsl:value-of select="substring(APPROVAL/start_ymd, 5, 2)" />-<xsl:value-of select="substring(APPROVAL/start_ymd, 7, 2)" />
										~
										<xsl:value-of select="substring(APPROVAL/cls_ymd, 1, 4)" />-<xsl:value-of select="substring(APPROVAL/cls_ymd, 5, 2)" />-<xsl:value-of select="substring(APPROVAL/cls_ymd, 7, 2)" />
									</td>
									<td width='14%' class='title2'>실 투입 연구비</td>
									<td width='16%' class='contant-right'>
										<xsl:value-of select="format-number(APPROVAL/resch_fund, '#,###')" />
									</td>
								</tr>
								<tr>
									<td class='title2'>과제명</td>
									<td colspan='5' class='contant'>
										<xsl:value-of select="APPROVAL/accnt_no_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>연구책임자</td>
									<td class='contant' colspan='5'>
										<xsl:value-of select="APPROVAL/accnt_rspns_nm" />
										(
										<xsl:value-of select="APPROVAL/posi_nm" />
										)
										/
										<xsl:value-of select="APPROVAL/dept_nm" />
									</td>

								</tr>
							</table>
						</td>
					</tr>
				</table>
				<!-- [C]계정정보 (종료) -->

				<!-- [D]지식재산권정보 (시작) -->
				<xsl:if test="APPROVAL/grid1_cnt > '0'">
					<table class="aproutertable" width="100%">
						<tr>
							<td class="head">지식재산권</td>
						</tr>
						<tr>
							<td class="body">
								<table class="aprinnertable" width="100%">
									<xsl:for-each select="APPROVAL/doc1/vector/data/msgResTrnsRelatPatMS01">
										<tr>
											<td width='15%' class='title2'>종류</td>
											<td width='15%' class='contant'>
												<xsl:value-of select="indst_right_clsf_nm" />
											</td>
											<td width='15%' class='title2'>지재권/등록번호</td>
											<td width='25%' class='contant'>
												<xsl:if test="smitapp_no != ''">
													<xsl:value-of select="smitapp_no" />
												</xsl:if>
												/
												<xsl:if test="regst_no != ''">
													<xsl:value-of select="regst_no" />
												</xsl:if>
											</td>

											<td width='15%' class='title2'>상태</td>
											<td width='15%' class='contant'>
												<xsl:value-of select="state_desc" />
											</td>
										</tr>
										<tr>
											<td class='title2'>발명의명칭</td>
											<td colspan='5' class='contant'>
												<xsl:value-of select="invnt_krn_nm" />
											</td>
										</tr>
										<tr>
											<td class='title2'>주발명자</td>
											<td class='contant-center'>
												<xsl:value-of select="invnt_nm" />
											</td>
											<td class='title2'>출원/등록일자</td>
											<td class='contant'>
												<xsl:if test="smitapp_ymd != ''">
													<xsl:value-of select="substring(smitapp_ymd, 1, 4)" />-<xsl:value-of select="substring(smitapp_ymd, 5, 2)" />-<xsl:value-of select="substring(smitapp_ymd, 7, 2)" />
												</xsl:if>
												/
												<xsl:if test="regst_ymd != ''">
													<xsl:value-of select="substring(regst_ymd, 1, 4)" />-<xsl:value-of select="substring(regst_ymd, 5, 2)" />-<xsl:value-of select="substring(regst_ymd, 7, 2)" />
												</xsl:if>
											</td>
											<td class='title2'> 기술이전여부 </td>
											<td class='contant-center'>
												<font color='red'>
													<xsl:value-of select="trns_yn" />
												</font>
											</td>
										</tr>
										<tr>
											<td class="contant" colspan='6' style='height:0px;padding:0px;margine:0px;'></td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<!-- [D]지식재산권정보 (종료) -->

				<!-- [G]기술자료(시작) -->
				<xsl:if test="APPROVAL/grid3_cnt > '0'">
					<table class="aproutertable" width="100%">
						<tr>
							<td class="head">기술자료</td>
						</tr>
						<tr>
							<td class="body">
								<table class="aprinnertable" width="100%">
									<tr>
										<td width='25%' class='title2'>기술자료</td>
										<td width='10%' class='title2'>단위</td>
										<td width='5%' class='title2'>수량</td>
										<td width='15%' class='title2'>이전예정일</td>
										<td width='20%' class='title2'>비고</td>
										<td width='25%' class='title2'>첨부파일</td>

									</tr>
									<xsl:for-each select="APPROVAL/doc3/vector/data/msgResTrnsTechRefMS01">
										<tr>
											<td width='25%' class='contant'>
												<xsl:value-of select="tech_ref_data" />
											</td>
											<td width='10%' class='contant-center'>
												<xsl:value-of select="unit_cd_nm" />
											</td>
											<td width='5%' class='contant-center'>
												<xsl:value-of select="qty" />
											</td>
											<td width='15%' class='contant-center'>
												<xsl:value-of select="substring(trns_schdl_ymd,1,4)" />-<xsl:value-of select="substring(trns_schdl_ymd,5,2)" />-<xsl:value-of select="substring(trns_schdl_ymd,7,2)" />
											</td>
											<td width='20%' class='contant'>
												<xsl:value-of select="rmk" />
											</td>
											<td width='25%' class='contant'>
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_full_path" />','XAA016')</xsl:attribute>
													<xsl:value-of select="org_file" />
												</a>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>

				<!-- [I]기술이전 추가건 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">기술개요</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td style="white-space:pre-wrap">
									   
										<xsl:value-of select="APPROVAL/tech_outline" />
									   
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">기술이미지</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<xsl:if test="APPROVAL/attach_img_no1 != ''">
										<a>
											<xsl:attribute name="href">javascript:newPop('<xsl:value-of select="APPROVAL/attach_img_no1" />')</xsl:attribute>
											<td class='contant' width="33%">
												<img src="" style="width:100%;height:140px;" id="attachImgNo1" />
											</td>
										</a>
									</xsl:if>
									<xsl:if test="APPROVAL/attach_img_no1 = ''">
										<td class='contant' width="33%" style="text-align:center;height:140px;">No Image</td>
									</xsl:if>

									<xsl:if test="APPROVAL/attach_img_no2 != ''">
										<a>
											<xsl:attribute name="href">javascript:newPop('<xsl:value-of select="APPROVAL/attach_img_no2" />')</xsl:attribute>
											<td class='contant' width="33%">
												<img src="" style="width:100%;height:140px;" id="attachImgNo2" />
											</td>
										</a>
									</xsl:if>
									<xsl:if test="APPROVAL/attach_img_no2 = ''">
										<td class='contant' width="33%" style="text-align:center;height:140px;">No Image</td>
									</xsl:if>

									<xsl:if test="APPROVAL/attach_img_no3 != ''">
										<a>
											<xsl:attribute name="href">javascript:newPop('<xsl:value-of select="APPROVAL/attach_img_no3" />')</xsl:attribute>
											<td class='contant' width="34%">
												<img src="" style="width:100%;height:140px;" id="attachImgNo3" />
											</td>
										</a>
									</xsl:if>
									<xsl:if test="APPROVAL/attach_img_no3 = ''">
										<td class='contant' width="34%" style="text-align:center;height:140px;">No Image</td>
									</xsl:if>

								</tr>
								<tr>
									<xsl:if test="APPROVAL/attach_img_no1 != ''">
										<td class='contant' width="33%" id="attachImg1">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="substring(APPROVAL/attach_img_no1, 2)" />', 'IMG')</xsl:attribute>
												<xsl:value-of select="substring(APPROVAL/attach_img_no1, 23)" />
											</a>
										</td>
									</xsl:if>
									<xsl:if test="APPROVAL/attach_img_no1 = ''">
										<td class='contant' width="33%" id="attachImg1"></td>
									</xsl:if>

									<xsl:if test="APPROVAL/attach_img_no2 != ''">
										<td class='contant' width="33%" id="attachImg2">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="substring(APPROVAL/attach_img_no2, 2)" />', 'IMG')</xsl:attribute>
												<xsl:value-of select="substring(APPROVAL/attach_img_no2, 23)" />
											</a>
										</td>
									</xsl:if>
									<xsl:if test="APPROVAL/attach_img_no2 = ''">
										<td class='contant' width="33%" id="attachImg2"></td>
									</xsl:if>

									<xsl:if test="APPROVAL/attach_img_no3 != ''">
										<td class='contant' width="34%" id="attachImg3">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="substring(APPROVAL/attach_img_no3, 2)" />', 'IMG')</xsl:attribute>
												<xsl:value-of select="substring(APPROVAL/attach_img_no3, 23)" />
											</a>
										</td>
									</xsl:if>
									<xsl:if test="APPROVAL/attach_img_no3 = ''">
										<td class='contant' width="34%" id="attachImg3"></td>
									</xsl:if>

								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">기술차별성</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td class='title2' width="15%">기술 적용분야</td>
									<td class='contant' width="35%">
										<xsl:value-of select="APPROVAL/six_t" />
									</td>
									<td class='title2' width="15%">산업기술분류코드</td>
									<td class='contant' width="35%">
										<xsl:value-of select="APPROVAL/ind_tech_clsf" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="15%" style="letter-spacing:-2px;">총 기술개발소요기간</td>
									<td class='contant'>
										<xsl:value-of select="substring(APPROVAL/dev_lead_st, 1, 4)" />-<xsl:value-of select="substring(APPROVAL/dev_lead_st, 5, 2)" />-<xsl:value-of select="substring(APPROVAL/dev_lead_st, 7, 2)" />
										~
										<xsl:value-of select="substring(APPROVAL/dev_lead_ed, 1, 4)" />-<xsl:value-of select="substring(APPROVAL/dev_lead_ed, 5, 2)" />-<xsl:value-of select="substring(APPROVAL/dev_lead_ed, 7, 2)" />
									</td>
									<td class='title2' width="15%">기술성숙도</td>
									<td class='contant'>
										<xsl:value-of select="APPROVAL/tech_grow_level" />
										단계 (
										<xsl:value-of select="APPROVAL/grow_level_nm" />
										)
									</td>
								</tr>
								<tr>
									<td class='title2' width="15%">기대효과</td>
									<td class='contant' colspan="3">
										<xsl:value-of select="APPROVAL/expect_effect" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<!-- [I]기술이전 추가건 (종료) -->

				<!-- [E]업체정보(시작) -->
				<xsl:if test="APPROVAL/grid2_cnt > '0'">
					<table class="aproutertable" width="100%">
						<tr>
							<td class="head">업체정보</td>
						</tr>
						<tr>
							<td class="body">
								<table class="aprinnertable" width="100%">
									<xsl:for-each select="APPROVAL/doc2/vector/data/msgResTrnsVendMS01">
										<tr>
											<td width='14%' class='title2'>업체명</td>
											<td width='23%' class='contant'>
												<xsl:value-of select="vend_abbr" />
											</td>
											<td width='14%' class='title2'>업체관리번호</td>
											<td width='23%' class='contant'>
												<xsl:value-of select="vend_cd" />
											</td>
											<td width='14%' class='title2'>대표자</td>
											<td width='19%' class='contant'>
												<xsl:value-of select="reprs_psn_nm" />
											</td>
										</tr>
										<tr>
											<td class='title2'>사업자등록번호</td>
											<td class='contant-center'>
												<xsl:value-of select="bsns_psn_regst_no" />
											</td>
											<td width='13%' class='title2'>업체규모</td>
											<td class='contant'>
												<xsl:value-of select="cmpy_typ_desc" />
											</td>
											<td class='title2'>종목</td>
											<td class='contant'>
												<xsl:value-of select="biztyp" />
											</td>
										</tr>
										<tr>
											<td class='title2'>업체주소</td>
											<td colspan='3' class='contant'>
												<xsl:value-of select="addr" />
											</td>
											<td class='title2'>이메일</td>
											<td class='contant'>
												<xsl:value-of select="charg_email" />
											</td>
										</tr>
										<tr>
											<td class='title2'>담당자</td>
											<td class='contant-center'>
												<xsl:value-of select="charg" />
											</td>
											<td class='title2'>소속/직위</td>
											<td class='contant-center'>
												<xsl:value-of select="charg_posi_nm" />
											</td>
											<td class='title2'>연락처</td>
											<td class='contant'>
												<xsl:value-of select="charg_tel" />
											</td>
										</tr>
										<tr>
											<td class='title2'>기타사항</td>
											<td colspan='5' class='contant'>
												<xsl:value-of select="etc" />
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<!-- [E]업체정보 (종료) -->

				<!-- [F]중개기관정보(시작) -->
				<xsl:if test="APPROVAL/agncy_vend_yn = 'Y'">
					<table class="aproutertable" width="100%">
						<tr>
							<td class="head">중개기관정보</td>
						</tr>
						<tr>
							<td class="body">
								<table class="aprinnertable" width="100%">
									<xsl:for-each select="APPROVAL/doc5/vector/data/msgResTrnsAgncyVendMS01">
										<tr>
											<td width='14%' class='title2'>업체명</td>
											<td width='53%' class='contant' colspan='3'>
												<xsl:value-of select="vend_abbr" />
												(
												<xsl:value-of select="vend_cd" />
												)
											</td>
											<td width='14%' class='title2'>대표자</td>
											<td width='19%' class='contant'>
												<xsl:value-of select="reprs_psn_nm" />
											</td>
										</tr>
										<tr>
											<td class='title2'>사업자등록번호</td>
											<td class='contant-center'>
												<xsl:value-of select="bsns_psn_regst_no" />
											</td>
											<td class='title2'>중개수수료율</td>
											<td class='contant-right'>
												<xsl:value-of select="agncy_fee_rt" />
												(%)
											</td>
											<td colspan='2'></td>
										</tr>
										<tr>
											<td class='title2'>중개수수료내용</td>
											<td colspan='5' class='contant'>
												<xsl:value-of select="agncy_contnt" />
											</td>
										</tr>
										<tr>
											<td class='title2'>금액</td>
											<td class='contant-right'>
												<xsl:value-of select="format-number(suply_value, '#,###')" />
											</td>
											<td class='title2'>부가세</td>
											<td class='contant-right'>
												<xsl:value-of select="format-number(add_tax, '#,###') " />
											</td>
											<td class='title2'>합계</td>
											<td class='contant-right'>
												<xsl:value-of select="format-number(agncy_fee, '#,###') " />
											</td>
										</tr>
										<tr>
											<td class='title2'>담당자</td>
											<td class='contant-center'>
												<xsl:value-of select="charg" />
											</td>
											<td class='title2'>연락처</td>
											<td class='contant'>
												<xsl:value-of select="charg_tel" />
											</td>
											<td class='title2'>이메일</td>
											<td class='contant'>
												<xsl:value-of select="charg_email" />
											</td>
										</tr>

									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<!-- [F]중개기관정보 (종료) -->

				<!-- [G]기술이전 참여자(시작) -->
				<xsl:if test="APPROVAL/grid4_cnt > '0'">
					<table class="aproutertable" width="100%">
						<tr>
							<td class="head">기술이전 참여자</td>
						</tr>
						<tr>
							<td class="body">
								<table class="aprinnertable" width="100%">
										<tr>
											<td width='15%' class='title2'>전수자구분</td>
											<td width='10%' class='title2'>개인번호</td>
											<td width='15%' class='title2'>성명</td>
											<td width='20%' class='title2'>직급</td>
											<td width='30%' class='title2'>부서</td>
											<td width='10%' class='title2'>기여수준</td>
										</tr>
										<xsl:for-each select="APPROVAL/doc4/vector/data/msgResTrnsTecPareMS01">
										<tr>
											<td width='15%' class='contant-center'>
												<xsl:value-of select="init_nm" />
											</td>
											<td width='10%' class='contant-center'>
												<xsl:value-of select="empno" />
											</td>
											<td width='15%' class='contant-center'>
												<xsl:value-of select="nm" />
											</td>
											<td width='20%' class='contant'>
												<xsl:value-of select="posi_nm" />
											</td>
											<td width='30%' class='contant'>
												<xsl:value-of select="dept_nm" />
											</td>
											<td width='10%' class='contant-right'>
												<xsl:value-of select="format-number(contrbt_rt, '#,###.##')" />
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>

				<!-- [H]첨부파일 (시작) -->
				<xsl:if test="APPROVAL/attachCnt > '0'">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head"> 첨부파일 </td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<xsl:for-each select="APPROVAL/fileList_A/vector/data/mdata">
										<tr>
											<td class='title2' width="16%">청렴유지서약서</td>
											<td class='contant' width="84%">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA016')</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
											</td>
										</tr>
									</xsl:for-each>
									<xsl:for-each select="APPROVAL/fileList_B/vector/data/mdata">
										<tr>
											<td class='title2' width="16%">사업자등록증</td>
											<td class='contant' width="84%">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA016')</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
											</td>
										</tr>
									</xsl:for-each>
									<xsl:for-each select="APPROVAL/fileList_C/vector/data/mdata">
										<tr>
											<td class='title2' width="16%">과제협약서</td>
											<td class='contant' width="84%">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA016')</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
											</td>
										</tr>
									</xsl:for-each>
									<xsl:for-each select="APPROVAL/fileList_D/vector/data/mdata">
										<tr>
											<td class='title2' width="16%">비밀유지계약서</td>
											<td class='contant' width="84%">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA016')</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<!-- [H]첨부파일 (종료) -->
			</BODY>
	</xsl:template>
</xsl:stylesheet>