<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html lang="kr">
			<head>
				<meta charset="UTF-8" />
				<title>휴가원</title>
				<link href="snapshot.css" rel="stylesheet" type="text/css" />
			</head>
			<body>
				<xsl:if test="contains(request/updateInfo/apr_after_flag, 'Y')">
					<table width="100%" class="aproutertable">
						<tr>
							<td class="head"
								style="background-image: url(/processparticipant/worklist/img/bot_title03.gif); background-repeat: no-repeat; background-position: 0.5% 80%;padding; padding-left: 25px;">
								사후결재 정보
							</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" class="aprinnertable">
									<tr>
										<td width="10%" class="title2">사 유</td>
										<td width="90%" class="contant">
											<xsl:value-of select="request/updateInfo/apr_after_reason" />
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable" style="margin-bottom:20px;">
					<tr>
						<td class="head">신청 정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class="title2">휴가자</td>
									<td width="35%" class="contant">
										<xsl:value-of select="request/updateInfo/apr_req_nm" />
										<xsl:value-of select="request/updateInfo/apr_empno" />
										<a target="_blank" onclick="window.open(this.href,this.target,'width=725,height=575,scrollbars=1');return false;" style="margin-left:10px;color:gray;">
											<xsl:attribute name="href">http://biz.kitech.re.kr/filter/index.jsp?serviceid=C22A&amp;sysPayNo=<xsl:value-of select="request/updateInfo/req_psn_syspayno" /></xsl:attribute>
											휴가사용내역
										</a>
									</td>
									<td class="title2">신청번호</td>
									<td width="35%" class="contant">
										<xsl:value-of select="request/updateInfo/req_no" />
									</td>
								</tr>
								<tr>
									<td class="title2">소속</td>
									<td class="contant">
										<xsl:value-of select="request/updateInfo/apr_dept_nm" />
									</td>
									<td class="title2">직급</td>
									<td class="contant">
										<xsl:value-of select="request/updateInfo/apr_posi_nm" />
									</td>
								</tr>
								<tr>
									<td class="title2">휴가구분</td>
									<td class="contant">
										<xsl:value-of select="request/updateInfo/apr_holiday_clsf" />
										<xsl:if test="request/updateInfo/apr_holiday_sub_clsf != ''">
											/ <xsl:value-of select="request/updateInfo/apr_holiday_sub_clsf" />
										</xsl:if>
										<xsl:if test="contains(request/updateInfo/apr_holiday_clsf, '보상휴가')">
											(<xsl:value-of select="request/updateInfo/apr_reward_count" />)
										</xsl:if>
									</td>
									<td class="title2">휴가사유</td>
									<td class="contant">
										<xsl:value-of select="request/updateInfo/holiday_cause" />
									</td>
								</tr>
								<tr>
									<td class="title2">휴가기간</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="request/updateInfo/apr_holiday_start" />
										~
										<xsl:value-of select="request/updateInfo/apr_holiday_cls" />
										<xsl:if test="not(contains(request/updateInfo/apr_holiday_clsf, '시간제연차') or contains(request/updateInfo/apr_holiday_clsf, '보상휴가'))">
											(
											<xsl:value-of select="request/updateInfo/holiday_daycnt" />
											일)
										</xsl:if>
									</td>
								</tr>
								<xsl:if test="contains(request/updateInfo/apr_holiday_clsf, '가족돌봄휴가')">
								<tr>
									<td class="title2">돌봄가족정보</td>
									<td class="contant" colspan="3">
										성명: <xsl:value-of select="request/updateInfo/apr_care_name" />,
										관계: <xsl:value-of select="request/updateInfo/apr_care_relation" />,
										생년월일: <xsl:value-of select="request/updateInfo/apr_care_birth_ymd" />
									</td>
								</tr>
								</xsl:if>
								<xsl:if test="contains(request/updateInfo/apr_holiday_clsf, '공가-코로나19')">
								<tr>
									<td class="title2">공가-코로나19</td>
									<td class="contant" colspan="3">
										백신접종구분: <xsl:value-of select="request/updateInfo/apr_vaccine" />
										<xsl:if test="request/updateInfo/apr_vac_cause != '-선택-'">
											, 백신접종사유: <xsl:value-of select="request/updateInfo/apr_vac_cause" />
										</xsl:if>
										<xsl:if test="request/updateInfo/apr_vac_gb != '-선택-'">
											, 백신종류: <xsl:value-of select="request/updateInfo/apr_vac_gb" />
										</xsl:if>
										<xsl:if test="request/updateInfo/apr_vac_date != '-선택-'">
											, 접종시기: <xsl:value-of select="request/updateInfo/apr_vac_date" />
										</xsl:if>
									</td>
								</tr>
								</xsl:if>
								<tr>
									<td class="title2">신청전 잔여연차</td>
									<td class="contant">
										<xsl:value-of select="request/updateInfo/remidr_anal_cnt" />일
										<xsl:if test="contains(request/updateInfo/apr_holiday_clsf, '시간제연차')">
											<xsl:value-of select="request/updateInfo/apr_holiday_before_remain" />
										</xsl:if>
									</td>
									<td class="title2">신청후 잔여연차</td>
									<td class="contant">
										<xsl:value-of select="request/updateInfo/remain_holiday" />일
										<xsl:if test="contains(request/updateInfo/apr_holiday_clsf, '시간제연차')">
											<xsl:value-of select="request/updateInfo/apr_holiday_after_remain" />
										</xsl:if>
									</td>
								</tr>
								<tr>
									<td class="title2">신청전 잔여보상휴가</td>
									<td class="contant">
										<xsl:value-of select="request/updateInfo/apr_beforeRewardRemain" />
									</td>								
									<td class="title2">신청후 잔여보상휴가</td>
									<td class="contant">
										<xsl:value-of select="request/updateInfo/apr_afterRewardRemain" />
									</td>
								</tr>
								<tr>
									<td class="title2">행선지</td>
									<td class="contant">
										<xsl:value-of select="request/updateInfo/destin" />
									</td>
									<td class="title2">입사일</td>
									<td class="contant">
										<xsl:value-of select="request/updateInfo/comin_day" />
									</td>
								</tr>
								<tr>
									<td class="title2">직무대행</td>
									<td class="contant">
										<xsl:value-of select="request/updateInfo/agent_psn_nm" />
										<xsl:value-of select="request/updateInfo/apr_agent_empno" />
									</td>								
									<td class="title2">작성자</td>
									<td class="contant">
										<xsl:value-of select="request/updateInfo/apr_regst_psn_nm" />
									</td>
								</tr>
								
								<xsl:for-each select="request/updateInfo/fileList_A/vector/data">
									<tr>
										<td class="title2">첨부파일</td>
										<td class="contant" colspan="3">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="mdata/attach_file_no" /><xsl:value-of select="mdata/seq" />','XAA006')</xsl:attribute>
												<xsl:value-of select="mdata/file_nm" />
											</a>
	
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
			</body>
		</html>		
	</xsl:template>
</xsl:stylesheet>