<?xml version="1.0"?>
<!DOCTYPE xsl:stylesheet [ <!ENTITY nbsp "&#160;"> ]>
<xsl:stylesheet xmlns:LINS="snapshot.css" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:fo="http://www.w3.org/1999/XSL/Format">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
			<BODY>
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">화학제품등록</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="20%" class="title2">폐기신청번호</td>
									<td width="30%" class="contant">
										<xsl:value-of select="root/safChePrdDsuseInfoVo/dsuse_req_no" />
									</td>

									<td width="20%" class="title2">신청자</td>
									<td width="30%" class="contant">
										<xsl:value-of select="root/safChePrdDsuseInfoVo/reqst_nm" />
									</td>

								</tr>
								<tr>
									<td width="20%" class="title2">신청일자</td>
									<td width="30%" class="contant">
										<xsl:value-of select="substring(root/safChePrdDsuseInfoVo/reqst_ymd, 1, 4)" />-<xsl:value-of select="substring(root/safChePrdDsuseInfoVo/reqst_ymd, 5, 2)" />-<xsl:value-of select="substring(root/safChePrdDsuseInfoVo/reqst_ymd, 7, 2)" />
									</td>

									<td width="20%" class="title2">부서</td>
									<td width="30%" class="contant">
										<xsl:value-of select="root/safChePrdDsuseInfoVo/dept_nm" />
									</td>

								</tr>
								<tr>
									<td width="20%" class="title2">소속</td>
									<td colspan="3" class="contant">
										<xsl:value-of select="root/safChePrdDsuseInfoVo/centr_nm" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">연구실명</td>
									<td width="30%" class="contant">
										<xsl:value-of select="root/safChePrdDsuseInfoVo/lab_nm" />
									</td>
									<td width="20%" class="title2">위치정보</td>
									<td width="30%" class="contant">
										<xsl:value-of select="root/safChePrdDsuseInfoVo/address" />
									</td>
								</tr>
								<tr>
									<td class="title2">연구실책임자</td>
									<td colspan="3" class="contant">
										<xsl:value-of select="root/safChePrdDsuseInfoVo/main_secrt_rspns_nm" />
									</td>
									
								</tr>
								<tr>
									<td class="title2">연구실안전관리담당자</td>
									<td colspan="3" class="contant">
										<xsl:value-of select="root/safChePrdDsuseInfoVo/sub_secrt_rspns_nm" />
									</td>
									
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">화학폐기물</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="40%" class="title2">폐기물 배출일</td>
									<td width="60%" colspan="3"  class="contant">
										<xsl:value-of select="root/safChePrdDsuseInfoVo/wste_exhst_ymd" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">폐기물 분류</td>
									<td colspan="3" class="contant">
										<xsl:value-of select="root/safChePrdDsuseInfoVo/wste_clsf_arr_nm" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<xsl:if test="root/safChePrdDsuseInfoVo/wste_clsf_1 = 'Y'">
					<tr>
						<td class="head">폐기물 배출 신청 정보</td>
					</tr>					
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="10%" class="title">폐기물구분</td>
									<td width="10%" class="title">배출신청량</td>
									<td width="10%" class="title">단위</td>
									<td width="20%" class="title">폐기물종류</td>
									<td width="25%" class="title">특이사항</td>
<!-- 									<td width="25%" class="title">폐기첨부파일</td> -->
								</tr>
								<xsl:for-each select="root/dsuseReqInfoList">
									<tr>
										<td width="10%" class="contant-center">
											<xsl:value-of select="wste_clsf" />
										</td>
										<td width="10%" class="contant-center">
											<xsl:value-of select="exhst_reqst_cpcty" />
										</td>
										<td width="10%" class="contant-center">
											<xsl:value-of select="unit_clsf" />
										</td>
										<td width="20%" class="contant-center">
											<xsl:value-of select="wste_knd" />
										</td>
										<td width="25%" class="contant-center">
											<xsl:value-of select="partclr_matter" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
					</xsl:if>
					<xsl:if test="root/safChePrdDsuseInfoVo/wste_clsf_2 = 'Y'">
					<tr>
						<td class="head">폐기/취급 제품정보</td>
					</tr>					
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="10%" class="title">구분</td>
									<td width="10%" class="title">제품사용번호</td>
									<td width="10%" class="title">제품코드</td>
									<td width="20%" class="title">제품명</td>
									<td width="10%" class="title">제조사</td>
<!-- 									<td width="10%" class="title">용량</td> -->
<!-- 									<td width="10%" class="title">폐기용량</td> -->
									<td width="5%" class="title">단위</td>
									<td width="10%" class="title">MSDS</td>
<!-- 									<td width="10%" class="title">폐기첨부파일</td> -->
								</tr>
								<xsl:for-each select="root/productList">
									<tr>
										<td width="10%" class="contant-center">
											<xsl:if test="prduct_knd = 'SFD050'" >
												폐시약
											</xsl:if>
											<xsl:if test="prduct_knd = 'SFD060'" >
												공병
											</xsl:if>
										</td>
										<td width="10%" class="contant-center">
											<xsl:value-of select="use_req_no" />
										</td>
										<td width="10%" class="contant-center">
											<xsl:value-of select="prduct_cd" />
										</td>
										<td width="20%" class="contant-center">
											<xsl:value-of select="prduct_nm" />
										</td>
										<td width="10%" class="contant-center">
											<xsl:value-of select="makr_cmpny" />
										</td>
<!-- 										<td width="10%" class="contant-center"> -->
<!-- 											<xsl:value-of select="item_qty" /> -->
<!-- 										</td> -->
<!-- 										<td width="10%" class="contant-center"> -->
<!-- 											<xsl:value-of select="dsuse_qy" /> -->
<!-- 										</td> -->
										<td width="5%" class="contant-center">
											<xsl:value-of select="item_unit" />
										</td>
										<td width="10%" class="contant-center">
											<xsl:if test="msds_url != ''">
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
					
					<tr>
						<td class="head">화학물질 정보</td>
					</tr>					
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="30%" class="title">제품사용번호</td>
									<td width="30%" class="title">물질명</td>
									<td width="30%" class="title">물질명(영문)</td>
									<td width="40%" class="title">CAS번호</td>
								</tr>
								<xsl:for-each select="root/snapChmstryList">
									<tr>
										<td width="30%" class="contant-center">
											<xsl:value-of select="use_req_no" />
										</td>
										<td width="30%" class="contant-center">
											<xsl:value-of select="chmcls_nm_kr" />
										</td>
										<td width="30%" class="contant-center">
											<xsl:value-of select="chmcls_nm_en" />
										</td>
										<td width="40%" class="contant-center">
											<xsl:value-of select="cas_no" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
					
					</xsl:if>
					<tr>
						<td class="head"></td>
					</tr>
				</table>
			</BODY>
	</xsl:template>
</xsl:stylesheet>
