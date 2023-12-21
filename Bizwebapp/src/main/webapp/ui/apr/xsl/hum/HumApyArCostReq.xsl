<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<body>
				<!-- 신청정보 -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">신청정보</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="13%" class="title2">신청번호</td>
									<td width="18%" class="contant">
										<xsl:value-of select="APPROVAL/req_no" />
									</td>
									<td width="13%" class="title2">신청부서</td>
									<td width="25%" class="contant">
										<xsl:value-of select="APPROVAL/dept_nm" />
									</td>
									<td width="13%" class="title2">신청자</td>
									<td width="18%" class="contant">
										<xsl:value-of select="APPROVAL/emp_nm" />
									</td>
								</tr>
								<tr>
									<td width="13%" class="title2">총금액</td>
									<td width="18%" class="contant-right">
										<xsl:value-of select="format-number(APPROVAL/amt_sum, '###,###,###,##0')" />
									</td>
									<td width="13%" class="title2">적요</td>
									<td width="56%" class="contant" colspan="3">
										<xsl:value-of select="APPROVAL/rmk" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<!-- 계정정보 -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">직무훈련생 연수수당 지급내역</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="15%" class="title">계정번호</td>
									<td width="15%" class="title">비용코드</td>
									<td width="15%" class="title">회계코드</td>
									<td width="15%" class="title">총인건비</td>
									<td width="40%" class="title">비고</td>
								</tr>
								<xsl:for-each select="APPROVAL/doc1/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="msgHumApyArCostMS08/accnt_no" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgHumApyArCostMS08/expns_cd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgHumApyArCostMS08/accnt_cd" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgHumApyArCostMS08/pay_tot_liq, '###,###,###,##0')" />
										</td>
										<td class="contant">
											<xsl:value-of select="msgHumApyArCostMS08/rmk" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>

				<!-- 세부지급내역 -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">직무훈련생 연수수당 개인별 상세내역</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="6%" class="title">순번</td>
									<td width="13%" class="title">성명</td>
									<td width="11%" class="title">생년월일</td>
									<td width="10%" class="title">근무월</td>
									<td width="15%" class="title">월 계획 훈련시간</td>									
									<td width="15%" class="title">실제 훈련시간</td>
									<td width="15%" class="title">훈련비율(%)</td>
									<td width="15%" class="title">지급액</td>
								</tr>
								<xsl:for-each select="APPROVAL/doc2/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:number count="APPROVAL/doc2/vector/data" level="single" format="1" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgHumApyArCostMS09/nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="substring(msgHumApyArCostMS09/resid_no, 1, 6)" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgHumApyArCostMS09/pay_yrmon" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgHumApyArCostMS09/month_tran_time" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgHumApyArCostMS09/job_days" />
										</td>										
										<td class="contant-center">
											<xsl:value-of select="msgHumApyArCostMS09/tran_rt" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgHumApyArCostMS09/expns_amt, '###,###,###,##0')" />
										</td>
									</tr>
								</xsl:for-each>
								<tr>
									<td class="contant-center" colspan="7">
										<xsl:text> 합 계</xsl:text>
									</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(APPROVAL/expns_amt, '#,###')" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<!-- 첨부파일 (시작) -->
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 첨부파일</td>
					</tr>
					<xsl:if
						test="count(APPROVAL/attaches/vector/data/mdata)!=0">	
						<tr>
							<td class="body">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<xsl:for-each select="APPROVAL/attaches/vector/data/mdata">
										<tr>
											<td class="title2" width="13%">출석부</td>
											<td class="contant" width="87%">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" />
													<xsl:value-of select="seq" />','XAA003')</xsl:attribute>
													<xsl:value-of select="file_nm" /><br/>
												</a>
											</td>
										</tr>
									</xsl:for-each>
									<xsl:for-each select="APPROVAL/attaches/vector/data/mdata">
										<tr>
											<td class="title2" width="13%">증빙서류</td>
											<td class="contant" width="87%">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" />
													<xsl:value-of select="seq" />','XAA003')</xsl:attribute>
													<xsl:value-of select="file_nm" /><br/>
												</a>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</xsl:if>
				</table>
				<!-- 첨부파일 (종료) -->
			</body>
	</xsl:template>
</xsl:stylesheet>