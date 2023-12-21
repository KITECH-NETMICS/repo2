<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<BODY>
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
									<xsl:value-of select="root/tripVo/req_psn_nm" />
									(
									<xsl:value-of select="root/tripVo/req_psn_empno" />
									)
								</td>
								<td class="title2">소속</td>
								<td width="20%" class="contant">
									<xsl:value-of select="root/tripVo/req_dept_nm" />
								</td>
								<td class="title2">신청번호</td>
								<td width="20%" class="contant">
									<xsl:value-of select="root/tripVo/req_no" />
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
									<xsl:value-of select="root/compnVo/biztrip_psn_nm" />
									(
									<xsl:value-of select="root/compnVo/biztrip_psn_empno" />
									)
								</td>
								<td class="title2">소속</td>
								<td width="16%" class="contant">
									<xsl:value-of select="root/compnVo/biztrip_dept_nm" />
								</td>
								<td class="title2">직급구분</td>
								<td width="16%" class="contant">
									<xsl:value-of select="root/compnVo/posi_nm" />
									/
									<xsl:value-of select="root/compnVo/posi_clsf_nm" />
								</td>
								<td class="title2">직무대행</td>
								<td width="16%" class="contant">
									<xsl:value-of select="root/compnVo/agent_nm" />
									(
									<xsl:value-of select="root/compnVo/agent_empno" />
									)
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<!-- 동반자 -->
			<xsl:if test="root/tripVo/compn_cnt != '0' ">
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">동반자</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td class="title">구분</td>
									<td class="title">성명</td>
									<td class="title">소속</td>
									<td class="title">직무대행</td>
								</tr>
								<xsl:for-each select="root/compnList">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="biztrip_psn_clsf_nm" />
										</td>
										<td class="contant">
											<xsl:value-of select="biztrip_psn_nm" />
											(
											<xsl:value-of select="biztrip_psn_empno" />
											)
										</td>
										<td class="contant">
											<xsl:value-of select="biztrip_dept_nm" />
										</td>
										<td class="contant">
											<xsl:value-of select="agent_nm" />
											(
											<xsl:value-of select="agent_empno" />
											)
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
			</xsl:if>

			<table width="100%" class="aproutertable">
				<tr>
					<td class="head">출장일정</td>
				</tr>
				<tr>
					<td class="body">
						<table width="100%" class="aprinnertable">
							<tr>
								<td width="13%" class="title2">출장일자</td>
								<td width="37%" class="contant">
									<xsl:value-of select="root/tripVo/biztrip_start_ymd" />
									~
									<xsl:value-of select="root/tripVo/biztrip_cls_ymd" />

									[
									<xsl:if test="root/tripVo/biztrip_nght != ''">
										<xsl:value-of select="root/tripVo/biztrip_nght" />
									</xsl:if>
									<xsl:if test="root/tripVo/biztrip_nght = ''">
										0
									</xsl:if>
									박
									<xsl:value-of select="root/tripVo/biztrip_day" />
									일 ]
								</td>
								<td width="13%" class="title2">출장비</td>
								<td width="37%" class="contant">
									<xsl:if test="contains(root/tripVo/no_trvel_expns, 'Y')">
										출장비없음
									</xsl:if>
									<xsl:if test="contains(root/tripVo/no_trvel_expns, 'N')">
										출장비있음
									</xsl:if>
								</td>
							</tr>
							<tr>
								<td width="13%" class="title2">출장목적</td>
								<td colspan="3" class="contant">
									(
									<xsl:value-of select="root/tripVo/biztrip_goal_clsf_nm" />
									)
									<xsl:value-of select="root/tripVo/biztrip_goal" />
								</td>
							</tr>
							<tr>
								<td width="13%" class="title2">출발지기준</td>
								<td width="37%" class="contant">
									<xsl:if test="contains(root/tripVo/depart_base, 'W')">
										근무지
									</xsl:if>
								</td>
								<td width="13%" class="title2">차량사용</td>
								<td width="37%" class="contant">
									<xsl:value-of select="root/tripVo/car_use_yn" />
								</td>
							</tr>
							<tr>
								<td width="13%" class="title2">방문처</td>
								<td width="37%" class="contant">
									<xsl:value-of select="root/tripVo/biztrip_region" />
								</td>
								<td width="13%" class="title2">운임구분</td>
								<xsl:if test="root/tripVo/biztrip_way = 'train'">
									<td width="37%" class="contant"> 열차/버스 등</td>
								</xsl:if>
								<xsl:if test="root/tripVo/biztrip_way = 'exprss'">
									<td width="37%" class="contant"> 항공</td>
								</xsl:if>
								<xsl:if test="root/tripVo/biztrip_way = 'vessel'">
									<td width="37%" class="contant"> 선박</td>
								</xsl:if>
							</tr>
							<tr>
								<td width="13%" class="title2">원내출장 여부</td>
								<td width="37%" class="contant">
									<xsl:if test="contains(root/tripVo/is_internal_region, 't')">
										원내
									</xsl:if>
									<xsl:if test="contains(root/tripVo/is_internal_region, 'f')">
										원외
									</xsl:if>
								</td>
								<td width="13%" class="title2">정보기기 반출</td>
								<td width="37%" class="contant">
									(
									<xsl:if test="contains(root/tripVo/notebook_out, 'Y')">
										√
									</xsl:if>
									) 노트북반출
									(
									<xsl:if test="contains(root/tripVo/usb_out, 'Y')">
										√
									</xsl:if>
									) 휴대용저장매체반출
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<table width="100%" class="aproutertable">
				<tr>
					<td class="head">출장경로</td>
				</tr>
				<tr>
					<td class="body">
						<table width="100%" class="aprinnertable">
							<tr>
								<td class="title">순번</td>
								<td class="title">출발지</td>
								<td class="title">도착지</td>
								<td class="title">비고</td>
							</tr>
							<xsl:for-each select="root/pathList">
								<tr>
									<td class="contant-center">
										<xsl:value-of select="odr" />
									</td>
									<td class="contant-center">
										<xsl:value-of select="start_region_nm" />
									</td>
									<td class="contant-center">
										<xsl:value-of select="arriv_region_nm" />
									</td>
									<td class="contant">
										<xsl:value-of select="rmk" />
									</td>
								</tr>
							</xsl:for-each>
						</table>
					</td>
				</tr>
			</table>
			<xsl:if test="contains(root/tripVo/biztrip_goal_clsf, 'FBV920')">
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">방문처</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td class="title">기업명</td>
									<td class="title">기술지도 신청번호</td>
									<td class="title">사업자번호</td>
									<td class="title">대표자</td>
									<td class="title">주소</td>
									<td class="title">고객번호</td>
								</tr>
								<xsl:for-each select="root/vstList">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="cmpy_nm_krchar" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="cunsl_rcpt_no" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="bsns_psn_regst_no" />
										</td>
										<td class="contant">
											<xsl:value-of select="reprs_psn" />
										</td>
										<td class="contant">
											<xsl:value-of select="cmpy_addr" />
										</td>
										<td class="contant">
											<xsl:value-of select="cust_no" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
			</xsl:if>
			<table width="100%" class="aproutertable">
				<tr>
					<td class="head">활동내역</td>
				</tr>
				<tr>
					<td class="body">
						<table width="100%" class="aprinnertable">
							<tr>
								<td width="8%" class="title">순번</td>
								<td width="15%" class="title">면담자</td>
								<td width="15%" class="title">면담자연락처</td>
								<td width="22%" class="title">방문기관</td>
								<td width="40%" class="title">활동내역</td>
							</tr>
							<xsl:for-each select="root/schdList">
								<tr>
									<td class="contant-center">
										<xsl:value-of select="ord" />
									</td>
									<td class="contant-center">
										<xsl:value-of select="major_intrv_psn" />
									</td>
									<td class="contant-center">
										<xsl:value-of select="major_intrv_tel" />
									</td>
									<td class="contant">
										<xsl:value-of select="agncy_nm" />
									</td>
									<td class="contant">
										<xsl:value-of select="actn_detls" />
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
								<td width="15%" class="title">구분</td>
								<td width="15%" class="title">금액</td>
								<td width="70%" class="title">비고</td>
							</tr>
							<tr>
								<td class="title2">운임</td>
								<td class="contant-right">
									<xsl:value-of select="format-number(root/tripVo/fare_fee,'#,###,###,###,###,###')" />
								</td>
								<td colspan="3" class="contant">
									<xsl:value-of select="root/tripVo/fare_fee_rmk" />
								</td>
							</tr>
							<tr>
								<td class="title2">현지교통비</td>
								<td class="contant-right">
									<xsl:value-of select="format-number(root/tripVo/ymd_fee,'#,###,###,###,###,###')" />
								</td>
								<td colspan="3" class="contant">
									<xsl:value-of select="root/tripVo/ymd_fee_rmk" />
								</td>
							</tr>
							<tr>
								<td class="title2">숙박비</td>
								<td class="contant-right">
									<xsl:value-of select="format-number(root/tripVo/lodg_fee,'#,###,###,###,###,###')" />
								</td>
								<td colspan="3" class="contant">
									<xsl:value-of select="root/tripVo/lodg_fee_rmk" />
								</td>
							</tr>
							<tr>
								<td class="title2">
									식비(카드
									<xsl:value-of select="root/tripVo/card_meal" />
									식)
								</td>
								<td class="contant-right">
									<xsl:value-of select="format-number(root/tripVo/meal_fee,'#,###,###,###,###,###')" />
								</td>
								<td colspan="3" class="contant">
									<xsl:value-of select="root/tripVo/meal_fee_rmk" />
								</td>
							</tr>
							<tr>
								<td class="title2">합계</td>
								<td class="contant-right">
									<xsl:value-of select="format-number(root/tripVo/tot_expns,'#,###,###,###,###,###')" />
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
								<td class="title">과세구분</td>
								<td class="title">비용코드</td>
								<td class="title">금액</td>
								<td class="title">계정책임자</td>
							</tr>
							<xsl:for-each select="root/accntList">
								<tr>
									<td class="contant-center">
										<xsl:value-of select="accnt_no" />
									</td>
									<td class="contant">
										<xsl:value-of select="accnt_no_nm" />
									</td>
									<td class="contant-center">
										<xsl:choose>
											<xsl:when test="tax_cd_nm = '과세'">
												<span style="color:red;"><xsl:value-of select="tax_cd_nm"/></span>
											</xsl:when>
											<xsl:otherwise>
												<xsl:value-of select="tax_cd_nm"/>
											</xsl:otherwise>
										</xsl:choose>
									</td>
									<td class="contant-center">
										<xsl:if test="expns_cd = '271'">
											국내출장
										</xsl:if>
										<xsl:if test="expns_cd = '394'">
											평가관리비
										</xsl:if>
									</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(tot_expns, '#,###,###,###,###,###')" />
									</td>
									<td class="contant">
										<xsl:value-of select="accnt_rspns_nm" />
										(
										<xsl:value-of select="accnt_rspns_empno" />
										)
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
									<xsl:for-each select="root/fileList">
										<a>
											<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of
												select="seq" />','XAA006')</xsl:attribute>
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
										<br />
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