<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<body>
			<!-- <div style="color:blue;text-align:right;">누적기준 월3회 이하 시 차상위자 결재를 받아 합니다.</div> -->
			<!-- <div style="color:blue;text-align:right;">누적기준 월3회 초과 시 외부강의 수행 전 원장님 및 임직원 행동강령책임관 결재를 받아야 합니다.</div> -->
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable" style="margin-bottom:6px; ">
				<tr>
					<td class="head">신고정보</td>
				</tr>
				<tr>
					<td class="body">
						<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
							<tr>
								<td width="14%" class="title2" colspan='2'>접수번호</td>
								<td width="43%" class="contant">
									<xsl:value-of select="root/cvnVo/req_no" />
								</td>
								<td width="15%" class="title2">접수일자</td>
								<td width="28%" class="contant">
									<xsl:value-of select="root/cvnVo/req_daytm" />
								</td>
							</tr>
							<tr>
								<td class="title2" rowspan="2">신고자</td>
								<td class="title2">성명</td>
								<td class="contant">
									<xsl:value-of select="root/cvnVo/req_psn_nm" />
								</td>
								<td class="title2">부서/본부</td>
								<td class="contant">
									<xsl:value-of select="root/cvnVo/dept_nm" />
									/
									<xsl:value-of select="root/cvnVo/divsn_nm" />
								</td>
							</tr>
							<tr>
								<td class="title2">직급</td>
								<td class="contant">
									<xsl:value-of select="root/cvnVo/posi_nm" />
								</td>
								<td class="title2">연락처</td>
								<td class="contant">
									<xsl:value-of select="root/cvnVo/req_tel_no" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>

			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable" style="margin-bottom:6px; ">
				<tr>
					<td class="head">대외활동정보</td>
				</tr>
				<tr>
					<td class="body">
						<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
							<tr style="height:40px;">
								<td class="title2">활동구분</td>
								<td class="contant" colspan='2'>
									<xsl:value-of select="root/cvnVo/act_clsf_nm" />
								</td>
								<td class="title2">활동유형</td>
								<td class="contant">
									<xsl:value-of select="root/cvnVo/activity_cd_nm" />
								</td>
							</tr>
							<tr style="height:40px;">
								<td width="14%" class="title2">출장연계구분</td>
								<td width="86%" class="contant" colspan="4">
									<xsl:value-of select="root/cvnVo/trip_cd_nm" />
								</td>
							</tr>
							<xsl:if test="not(root/cvnVo/trip_cd = '' or root/cvnVo/trip_cd = 'CTR040')">
								<tr style="height:20px;">
									<td width="14%" class="title2" rowspan="2">출장연계정보</td>
									<td width="15%" class="title2">출장번호</td>
									<td width="28%" class="contant">
										<xsl:value-of select="root/cvnVo/trip_req_no" />
									</td>
									<td width="15%" class="title2">출장목적</td>
									<td width="28%" class="contant">
										<xsl:value-of select="root/cvnVo/trip_goal" />
									</td>
								</tr>
								<tr style="height:20px;">
									<td class="title2">출장일시</td>
									<td class="contant">
										<xsl:value-of select="root/cvnVo/trip_days" />
									</td>
									<td class="title2">출장지역</td>
									<td class="contant">
										<xsl:value-of select="root/cvnVo/trip_region" />
									</td>
								</tr>
							</xsl:if>
							<xsl:if test="root/cvnVo/companion_cd != ''">
								<tr style="height:40px;">
									<td class="title2">반려 사유</td>
									<td class="contant" colspan="4">
										<input type='radio' name='rdoCancel1' value="REC010">
											<xsl:if test="root/cvnVo/companion_cd = 'REC010'">
												<xsl:attribute name="checked">Y</xsl:attribute>
											</xsl:if>
											<xsl:if test="not(root/cvnVo/companion_cd = 'REC010')">
												<xsl:attribute name="disabled">disabled</xsl:attribute>
											</xsl:if>
											사례정보(대가 등)변경
										</input>
										<input type='radio' name='rdoCancel2'>
											<xsl:if test="root/cvnVo/companion_cd = 'REC020'">
												<xsl:attribute name="checked">Y</xsl:attribute>
											</xsl:if>
											<xsl:if test="not(root/cvnVo/companion_cd = 'REC020')">
												<xsl:attribute name="disabled">disabled</xsl:attribute>
											</xsl:if>
											일정 변경
										</input>
										<input type='radio' name='rdoCancel3'>
											<xsl:if test="root/cvnVo/companion_cd = 'REC030'">
												<xsl:attribute name="checked">Y</xsl:attribute>
											</xsl:if>
											<xsl:if test="not(root/cvnVo/companion_cd = 'REC030')">
												<xsl:attribute name="disabled">disabled</xsl:attribute>
											</xsl:if>
											요청정보 변경
										</input>
										<input type='radio' name='rdoCancel4'>
											<xsl:if test="root/cvnVo/companion_cd = 'REC040'">
												<xsl:attribute name="checked">Y</xsl:attribute>
												기타(사유 :
												<xsl:value-of select="root/cvnVo/companion_rs" />
												)
											</xsl:if>
											<xsl:if test="not(root/cvnVo/companion_cd = 'REC040')">
												<xsl:attribute name="disabled">disabled</xsl:attribute>
												기타
											</xsl:if>
										</input>
									</td>
								</tr>
							</xsl:if>
							<tr style="height:20px;">
								<td width="14%" class="title2" rowspan="2">요청자</td>
								<td width="15%" class="title2">기관명</td>
								<td width="28%" class="contant">
									<xsl:value-of select="root/cvnVo/invite_org_nm" />
								</td>
								<td width="15%" class="title2">대표자</td>
								<td width="28%" class="contant">
									<xsl:value-of select="root/cvnVo/invite_ceo_nm" />
								</td>
							</tr>
							<tr style="height:20px;">
								<td class="title2">담당부서(담당자)</td>
								<td class="contant">
									<xsl:value-of select="root/cvnVo/invite_dept_nm" />
								</td>
								<td class="title2">연락처</td>
								<td class="contant">
									<xsl:value-of select="root/cvnVo/invite_tel_no" />
								</td>
							</tr>
							<tr style="height:40px;">
								<td class="title2">활동내용</td>
								<td class="contant" colspan="4">
									<xsl:value-of select="root/cvnVo/invite_cause" />
								</td>
							</tr>
							<tr style="height:40px;">
								<td class="title2">주제</td>
								<td class="contant" colspan="4">
									<xsl:value-of select="root/cvnVo/subject" />
								</td>
							</tr>
							<tr style="height:40px;">
								<td class="title2">장소</td>
								<td class="contant" colspan="4">
									<xsl:value-of select="root/cvnVo/region" />
								</td>
							</tr>
							<tr style="height:40px;">
								<td class="title2">일시</td>
								<td class="contant" colspan="4">
									<xsl:if test="root/cvnVo/act_clsf = 'CLA003'">
										<xsl:variable name="st" select="root/cvnVo/st_daytm" />
										<xsl:variable name="ed" select="root/cvnVo/ed_daytm" />
										<xsl:value-of
											select="concat(substring($st, 1, 4), '년 ', substring($st, 5, 2), '월 ', substring($st, 7, 2), '일 ', substring($st, 9, 2), '시 ', substring($st, 11, 2), '분')" />
										~
										<xsl:value-of
											select="concat(substring($ed, 1, 4), '년 ', substring($ed, 5, 2), '월 ', substring($ed, 7, 2), '일 ', substring($ed, 9, 2), '시 ', substring($ed, 11, 2), '분')" />
										(										
										<xsl:value-of select="root/cvnVo/period_minute" />
										분 )
									</xsl:if>
									<xsl:if test="root/cvnVo/act_clsf != 'CLA003'">
										<xsl:variable name="st" select="root/cvnVo/start_ymd" />
										<xsl:variable name="ed" select="root/cvnVo/cls_ymd" />
										<xsl:value-of select="concat(substring($st, 1, 4), '년 ', substring($st, 5, 2), '월 ', substring($st, 7, 2), '일 ')" />
										~
										<xsl:value-of select="concat(substring($ed, 1, 4), '년 ', substring($ed, 5, 2), '월 ', substring($ed, 7, 2), '일 ')" />
										(
										<xsl:value-of select="root/cvnVo/attnce_clsf" /> /
										<xsl:value-of select="root/cvnVo/period_minute" />
										시간 )
									</xsl:if>
								</td>
							</tr>
							<tr style="height:40px;">
								<td class="title2">사례금</td>
								<td class="contant" colspan="4">
									총액:
									<xsl:if test="root/cvnVo/act_clsf != 'CLA003'">
										(
										<xsl:value-of select="root/cvnVo/econo_gain_clsf" />
										)
									</xsl:if>
									<xsl:value-of select="format-number(root/cvnVo/reward_amt,'#,###,###')" />
									원,
									실비:
									<xsl:value-of
										select="format-number(root/cvnVo/traffic_amt+root/cvnVo/stay_amt+root/cvnVo/food_amt,'#,###,###')" />
									원 별도.
									( 교통비:
									<xsl:value-of select="format-number(root/cvnVo/traffic_amt,'#,###,###')" />
									원
									, 숙박비:
									<xsl:value-of select="format-number(root/cvnVo/stay_amt,'#,###,###')" />
									원
									, 식비:
									<xsl:value-of select="format-number(root/cvnVo/food_amt,'#,###,###')" />
									원 )
								</td>
							</tr>
							<xsl:if test="root/cvnVo/act_clsf = 'CLA003' or root/cvnVo/activity_cd = 'CCF004'">
								<tr style="height:40px;">
									<td class="title2">
										누적이력
										<br />
										(금번신청포함)
									</td>
									<td class="contant" colspan="4">
										월간
										<xsl:value-of select="root/cvnVo/acc_mon_count" />
										회/
										<xsl:value-of select="root/cvnVo/acc_mon_hour" />
										시간
										<br />
									</td>
								</tr>
							</xsl:if>
						</table>
					</td>
				</tr>
			</table>
			<xsl:if test="root/cvnVo/acc_mon = 'ETC'">
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">기타활동 누적정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td class="title2">활동일시</td>
									<td class="title2">활동시간</td>									
									<td class="title2">기관명</td>
									<td class="title2">보상구분</td>
									<td class="title2">사례금</td>								
								</tr>
								<xsl:for-each select="root/accrList">
									<tr>
										<td width="16%" class="contant"><xsl:value-of select="period_date" /></td>
										<td width="16%" class="contant"><xsl:value-of select="period_minute" /></td>
										<td width="16%" class="contant"><xsl:value-of select="invite_org_nm" /></td>
										<td width="16%" class="contant"><xsl:value-of select="econo_gain_clsf_nm" /></td>
										<td width="16%" class="contant"><xsl:value-of select="format-number(reward_amt,'###,###,###')" /></td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
			</xsl:if>
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable" style="margin-bottom:6px;">
				<tr>
					<td class="head">첨부파일</td>
				</tr>
				<tr>
					<td class="body">
						<table width="100%" class="aprinnertable">
							<tr>
								<td width="14%" class="title2">첨부파일번호</td>
								<td width="86%" class="title2">첨부파일명</td>
							</tr>
							<xsl:for-each select="root/fileList">
								<tr>
									<td class="contant">
										<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of
											select="seq" />','XAA006')</xsl:attribute>
										<xsl:value-of select="attach_file_no" />
										<xsl:value-of select="seq" />
									</td>
									<td class="contant">
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
									</td>
								</tr>
							</xsl:for-each>
						</table>
					</td>
				</tr>
			</table>
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
				<tr>
					<td class="body">
						<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
							<tr>
								<td class="title2" style="position:relative; width:100%; font-weight:bold; text-align:center;">유 의 사 항</td>
							</tr>
							<tr>
								<td class="contant">
									<ol style="margin:0.5em;padding-left: 2em;">
										<li>대가는 교통비, 숙박비, 식비를 제외한 금액을 기재하고 교통비, 숙박비, 식비는 별도 기재함.</li>
										<li>법정기준을 초과한 사례금의 경우 청탁방지담당관에게 신고하고, 제공자에게 반환해야 하며 위반 시 징계나 과태료(최대 500만원이하)등 불이익을 받을 수 있음.</li>
									</ol>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<br />
			<br />
		</body>
	</xsl:template>
</xsl:stylesheet>