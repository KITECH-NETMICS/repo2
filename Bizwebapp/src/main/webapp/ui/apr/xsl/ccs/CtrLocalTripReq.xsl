<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<BODY>
				<xsl:if test="contains(root/postAprVo/is_apr_after, 't')">
					<table width="100%" class="aproutertable">
						<tr>
							<td class="head" style="">
								사후결재 정보
							</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" class="aprinnertable">
									<tr>
										<td width="10%" class="title2">사 유</td>
										<td width="90%" class="contant">
											<xsl:value-of select="root/postAprVo/reason" />
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					class="aproutertable">
					<tr>
						<td class="head">신청정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0"
								class="aprinnertable">
								<tr>
									<td width="16%" class="title2">작성자</td>
									<td width="16%" class="contant">
										<xsl:value-of select="root/tripVo/req_psn_nm" />
										<xsl:value-of select="root/tripVo/req_psn_empno" />
									</td>
									<td width="16%" class="title2">소속</td>
									<td width="16%" class="contant">
										<xsl:value-of select="root/tripVo/req_psn_dept_nm" />
									</td>
									<td width="16%" class="title2">신청번호</td>
									<td width="16%" class="contant">
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
									<td width="17%" class="title2">성명</td>
									<td width="33%" class="contant">
										<xsl:value-of select="root/biztripPsnVo/biztrip_psn_nm" /> (<xsl:value-of select="root/biztripPsnVo/biztrip_psn_empno" />)
									</td>
									<td width="17%" class="title2">소속</td>
									<td width="33%" class="contant">
										<xsl:value-of select="root/biztripPsnVo/biztrip_psn_dept_nm" />
									</td>
								</tr>
								<tr>
									<td width="8%" class="title2">직무대행</td>
									<td width="16%" class="contant">
										<xsl:value-of select="root/biztripPsnVo/agent_psn_nm" /> (<xsl:value-of select="root/biztripPsnVo/agent_psn_empno" />)
									</td>
									<td width="8%" class="title2">비상연락</td>
									<td width="16%" class="contant">
										<xsl:value-of select="root/biztripPsnVo/emgnc_contac_no" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<!-- 동반자 -->
					<xsl:if test="root/tripVo/compn_cnt != '0' ">
						<tr>
							<td class="head">동반자</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" class="aprinnertable">
									<tr>
										<td width="15%" class="title">성명</td>
										<td width="30%" class="title">소속</td>
										<td width="15%" class="title">직무대행</td>
										<td width="40%" class="title">비상연락</td>
									</tr>
									<xsl:for-each select="root/compnList">
										<tr>
											<td width="15%" class="contant">
												<xsl:value-of select="biztrip_psn_nm" />
												(
												<xsl:value-of select="biztrip_psn_empno" />
												)
											</td>
											<td width="30%" class="contant">
												<xsl:value-of select="biztrip_psn_dept_nm" />
											</td>
											<td width="15%" class="contant">
												<xsl:value-of select="agent_psn_nm" />
												(
												<xsl:value-of select="agent_psn_empno" />
												)
											</td>
											<td width="40%" class="contant-center">
												<xsl:value-of select="emgnc_contac_no" />
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</xsl:if>
					<tr>
						<td class="head">출장정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td width="15%" class="title2">출장일자</td>
									<td width="35%" class="contant">
										<xsl:value-of select="substring(root/tripVo/biztrip_ymd, 1, 4)" />-<xsl:value-of select="substring(root/tripVo/biztrip_ymd, 5, 2)" />-<xsl:value-of select="substring(root/tripVo/biztrip_ymd, 7, 2)" />
									</td>
									<td width="15%" class="title2">시간</td>
									<td width="35%" class="contant">
										<xsl:value-of select="root/tripVo/start_time" />
										~
										<xsl:value-of select="root/tripVo/arriv_time" />
									</td>
								</tr>
								<tr>
									<td class="title2">출장지</td>
									<td class="contant">
										<xsl:value-of select="root/tripVo/biztrip_land" />
									</td>
									<td class="title2">방문처</td>
									<td class="contant">
										<xsl:value-of select="root/tripVo/cust_nm" />
										<xsl:value-of select="root/tripVo/rmk_1" />
									</td>
								</tr>
								<tr>
									<td class="title2">차량사용</td>
									<td class="contant">
										<xsl:value-of select="root/tripVo/car_use_yn" />
									</td>
									<td class="title2">원내출장여부</td>
									<td class="contant">
										(
										<xsl:if
											test="contains(root/tripVo/is_internal_region, 't')">
											√
										</xsl:if>
										) 원내
										(
										<xsl:if
											test="root/tripVo/is_internal_region != 't'">
											√
										</xsl:if>
										) 원외
									</td>
								</tr>
								<tr>
									<td class="title2">주요면담자</td>
									<td class="contant">
										<xsl:value-of select="root/tripVo/major_intrv_psn" />
									</td>
									<td class="title2">면담자연락처</td>
									<td class="contant">
										<xsl:value-of select="root/tripVo/major_intrv_tel" />
									</td>
								</tr>
								<tr>
									<td class="title2">출장목적</td>
									<td class="contant" colspan="3">
										[
										<xsl:value-of
											select="root/tripVo/biztrip_goal_clsf" />
										]
										<xsl:value-of select="root/tripVo/biztrip_goal" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<xsl:if test="contains(root/tripVo/cvn_req_no, 'C68')">
					<table width="100%" class="aproutertable">
						<tr>
							<td class="head">외부강의</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" class="aprinnertable">
									<tr>
										<td width="15%" class="title2">신고번호</td>
										<td width="35%" class="contant">
											<xsl:value-of select="root/tripVo/cvn_req_no" />
										</td>
										<td width="15%" class="title2">주제</td>
										<td width="35%" class="contant">
											<xsl:value-of select="root/tripVo/subject" />
										</td>
									</tr>
									<tr>
										<td class="title2">요청기관</td>
										<td class="contant">
											<xsl:value-of select="root/tripVo/invite_org" />
										</td>
										<td class="title2">강의일시</td>
										<td class="contant">
											<xsl:value-of select="root/tripVo/period_days" />
										</td>
									</tr>
									<tr>
										<td class="title2">댓가(원)</td>
										<td class="contant">
											<xsl:value-of select="root/tripVo/reward_amt" />
										</td>
										<td class="title2">월간누적</td>
										<td class="contant">
											<xsl:value-of select="root/tripVo/acc_month" />
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">지급정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td width="18%" class="title">구분</td>
									<td width="25%" class="title">금액</td>
									<td width="55%" class="title">비고</td>
								</tr>
								<tr>
									<td class="title2">여비</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(root/tripVo/trafc_fee,'#,###,###,###,###,###')" />
									</td>
									<td class="contant">
										<xsl:value-of select="root/tripVo/trafc_fee_rmk" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td width="18%" class="title">출장자</td>
									<td width="25%" class="title">지급금액</td>
									<td width="55%" class="title">비고</td>
								</tr>
								<xsl:for-each select="root/payList">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="biztrip_psn_nm" />
											(<xsl:value-of select="biztrip_psn_empno" />)
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(pay_amt,'#,###,###,###,###,###')" />
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
				<table width="100%" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td width="45%" class="title">
										계정번호 (계정/출장비 없음<xsl:if test="contains(root/tripVo/accnt_no_use, 'Y')">√</xsl:if>)
									</td>
									<td width="30%" class="title">계정책임자</td>
									<td width="25%" class="title">통제번호</td>
								</tr>
								<tr>
									<td class="contant">
										<xsl:if test="root/tripVo/accnt_no != '' ">
											<xsl:value-of select="root/tripVo/accnt_no" />
											<xsl:value-of select="root/tripVo/accnt_no_nm" />
										</xsl:if>
										<xsl:if test="root/tripVo/accnt_no = '' ">
											(계정없음)
										</xsl:if>
									</td>
									<td class="contant">
										<xsl:value-of select="root/tripVo/accnt_respn_psn_nm" />
										<xsl:value-of select="root/tripVo/accnt_respn_psn_empno" />
									</td>
									<td class="contant">
										<xsl:value-of select="root/tripVo/bugt_ctrl_no" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					class="aproutertable">
					<tr>
						<td class="head">첨부파일</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td width="20%" class="title">첨부파일번호</td>
									<td width="80%" class="title">첨부파일명</td>
								</tr>
								<xsl:for-each select="root/fileList">
									<tr>
										<td class="contant-center">
											<a>
												<xsl:value-of select="attach_file_no" />
											</a>	
										</td>
										<td class="contant">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA006')</xsl:attribute>
												<xsl:value-of select="file_nm" /><br/>
											</a>
											<xsl:if test="attach_file_no != ''">
												<a>
													<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of select="seq" />')</xsl:attribute>
													<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기" style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;"/>
												</a>
											</xsl:if>
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