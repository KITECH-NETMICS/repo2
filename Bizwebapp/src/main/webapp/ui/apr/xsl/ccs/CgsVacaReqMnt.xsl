<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
			<body>
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
										<xsl:value-of select="createXslInfo/updateInfo/apr_req_nm" />
										<xsl:value-of select="createXslInfo/updateInfo/apr_empno" />
										<a target="_blank" onclick="window.open(this.href,this.target,'width=725,height=575');return false;" style="margin-left:10px;color:gray;">
											<xsl:attribute name="href">http://biz.kitech.re.kr/filter/index.jsp?serviceid=C22A&amp;sysPayNo=<xsl:value-of select="createXslInfo/updateInfo/req_psn_syspayno" /></xsl:attribute>
											휴가사용내역
										</a>
									</td>
									<td class="title2">신청번호</td>
									<td width="35%" class="contant">
										<xsl:value-of select="createXslInfo/updateInfo/req_no" />
									</td>
								</tr>
								<tr>
									<td class="title2">소속</td>
									<td class="contant">
										<xsl:value-of select="createXslInfo/updateInfo/apr_dept_nm" />
									</td>
									<td class="title2">직급</td>
									<td class="contant">
										<xsl:value-of select="createXslInfo/updateInfo/apr_posi_nm" />
									</td>
								</tr>
								<tr>
									<td class="title2">휴가구분</td>
									<td class="contant">
										<xsl:value-of select="createXslInfo/updateInfo/apr_holiday_clsf" />
										<xsl:if test="createXslInfo/updateInfo/apr_holiday_sub_clsf != ''">
											/ <xsl:value-of select="createXslInfo/updateInfo/apr_holiday_sub_clsf" />
										</xsl:if>
										<xsl:if test="contains(createXslInfo/updateInfo/apr_holiday_clsf, '보상휴가')">
											(<xsl:value-of select="createXslInfo/updateInfo/apr_reward_count" />)
										</xsl:if>
									</td>
									<td class="title2">휴가사유</td>
									<td class="contant">
										<xsl:value-of select="createXslInfo/updateInfo/holiday_cause" />
									</td>
								</tr>
								<tr>
									<td class="title2">휴가기간</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="createXslInfo/updateInfo/apr_holiday_start" />
										~
										<xsl:value-of select="createXslInfo/updateInfo/apr_holiday_cls" />
										<xsl:if test="not(contains(createXslInfo/updateInfo/apr_holiday_clsf, '시간제연차') or contains(createXslInfo/updateInfo/apr_holiday_clsf, '보상휴가'))">
											(
											<xsl:value-of select="createXslInfo/updateInfo/holiday_daycnt" />
											일)
										</xsl:if>
									</td>
								</tr>
								Z<xsl:if test="contains(request/updateInfo/apr_holiday_clsf, '가족돌봄휴가')">
								<tr>
									<td class="title2">돌봄가족정보</td>
									<td class="contant" colspan="3">
										성명: <xsl:value-of select="createXslInfo/updateInfo/apr_care_name" />,
										관계: <xsl:value-of select="createXslInfo/updateInfo/apr_care_relation" />,
										생년월일: <xsl:value-of select="createXslInfo/updateInfo/apr_care_birth_ymd" />
									</td>
								</tr>
								</xsl:if>										
								<tr>
									<td class="title2">신청전 잔여연차</td>
									<td class="contant">
										<xsl:value-of select="createXslInfo/updateInfo/remidr_anal_cnt" />일
										<xsl:if test="contains(createXslInfo/updateInfo/apr_holiday_clsf, '시간제연차')">
											<xsl:value-of select="createXslInfo/updateInfo/apr_holiday_before_remain" />
										</xsl:if>
									</td>
									<td class="title2">신청후 잔여연차</td>
									<td class="contant">
										<xsl:value-of select="createXslInfo/updateInfo/remain_holiday" />일
										<xsl:if test="contains(createXslInfo/updateInfo/apr_holiday_clsf, '시간제연차')">
											<xsl:value-of select="createXslInfo/updateInfo/apr_holiday_after_remain" />
										</xsl:if>
									</td>
								</tr>
								<tr>
									<td class="title2">행선지</td>
									<td class="contant">
<!-- 										( -->
<!-- 										<xsl:value-of select="createXslInfo/updateInfo/contac_loc" /> -->
<!-- 										) -->
										<xsl:value-of select="createXslInfo/updateInfo/destin" />
									</td>
									<td class="title2">입사일</td>
									<td class="contant">
										<xsl:value-of select="createXslInfo/updateInfo/comin_day" />
									</td>
								</tr>
								<tr>
									<td class="title2">직무대행</td>
									<td class="contant">
										<xsl:value-of select="createXslInfo/updateInfo/agent_psn_nm" />
										<xsl:value-of select="createXslInfo/updateInfo/apr_agent_empno" />
									</td>								
									<td class="title2">작성자</td>
									<td class="contant">
										<xsl:value-of select="createXslInfo/updateInfo/apr_regst_psn_nm" />
									</td>
								</tr>
								<tr>
									<td class="title2">첨부파일</td>
									<td colspan='3' class="contant">
										<xsl:for-each select="createXslInfo/updateInfo/fileList_A/vector/data/msgXomxComAttachFileMS01">
											<a>
												<xsl:attribute name="href">#</xsl:attribute>
												
												<xsl:attribute name="onclick">downloadForXsl('<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq"/>', 'XAA006');return false;</xsl:attribute>
												<xsl:value-of select="org_file" />
											</a>
											<br />
										</xsl:for-each>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<iframe name="ifr" style="display:none"></iframe>
			</body>
	</xsl:template>
</xsl:stylesheet>