<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/APRREQUEST"> 
		<xsl:variable name="localPath" select="1" />
			<body>
				<script language="javascript">
					<![CDATA[
						/** 근무시간현황 바로가기 */
						function goWorkTimeView(empNo, reqYm){
							var url = "https://biz.kitech.re.kr//filter/index.jsp?serviceid=C944&amp;pEmpno="+ empNo +"&amp;yyyymm="+ reqYm;
							url = url.replace(/amp;/g,"");
							window.open(url, "_blank");
						}
					]]>
				</script>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td width="15%" class='title2'>
										성 명(개인번호)
									</td>
									<td class="contant">
										<xsl:value-of select="emp_nm" />
									</td>
									<td width="15%" class='title2'>부 서</td>
									<td class="contant">
										<xsl:value-of select="dept_nm" />
									</td>
									<td width="15%" class='title2'>직 급</td>
									<td class="contant">
										<xsl:value-of select="posi_nm" />
									</td>
								</tr>
								<tr>
									<td width="15%" class='title2'>신 청 번 호</td>
									<td class="contant">
										<xsl:value-of select="req_no" />
									</td>
									<td width="15%" class='title2'>신 청 월</td>
									<td class="contant">
										<xsl:value-of select="work_yrmon" />
										<a style="display:inline-block;padding-left:30px; color:blue;">
											<xsl:attribute name="href">javascript:goWorkTimeView('<xsl:value-of select="apr_emp_no" />', '<xsl:value-of select="apr_req_ym" />')</xsl:attribute>
											근무시간현황 바로가기
										</a>
									</td>
									<td width="15%" class='title2'>근 무 유 형</td>
									<td class="contant">
										<xsl:value-of select="work_type" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<br />
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title' width='24%'>결재완료된 보상휴가 대상 근무시간</td>
									<td class="contant-center" width='12%'>
										<xsl:value-of select="rwd_occr_ovr_wk_mm" />
<!-- 										원 -->
									</td>
									<td class='title' width='20%'>결재완료된 보상휴가시간</td>
									<td class="contant-center" width='12%' style="color:blue;background-color:skyblue">
										<xsl:value-of select="add_rwd_mm" />
<!-- 										분 -->
									</td>
									<td class='title' width='20%'>결재완료된 대체휴일수</td>
									<td class="contant-center" width='12%' style="color:blue;background-color:skyblue">
<!-- 										<xsl:value-of select="add_trn_day" /> -->
										<xsl:value-of select="format-number(add_trn_day,'#,###')" />
										일
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<br />
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title' width='63'>날 짜</td>
									<td class='title' width='60'>구 분</td>
									<td class='title' width='53'>시작시간</td>
									<td class='title' width='53'>종료시간</td>
									<td class='title'>근무내용</td>
<!-- 									<td class='title' width='80'>초과시간</td> -->
									<td class='title' width='80'>보상휴가 대상<br>근무시간</br></td>
									<td class='title' width='63'>보상휴가<br>적립시간</br></td>
									<td class='title' width='65'>대체휴일</td>
								</tr>
								<xsl:for-each select="ovrtm/vector/data">
									<xsl:variable name="work_ymd" select="msgHumApyOvrTmBasicSS05/work_ymd" />
									<xsl:variable name="day_clsf" select="msgHumApyOvrTmBasicSS05/day_clsf" />
									<xsl:variable name="work_str_tm" select="msgHumApyOvrTmBasicSS05/work_str_tm" />
									<xsl:variable name="work_end_tm" select="msgHumApyOvrTmBasicSS05/work_end_tm" />
									<xsl:variable name="work_resn" select="msgHumApyOvrTmBasicSS05/work_resn" />
<!-- 									<xsl:variable name="amt_ovr_wk_tm" select="msgHumApyOvrTmBasicSS05/amt_ovr_wk_tm" /> -->
									<xsl:variable name="rwd_occur_ovr_wk_tm" select="msgHumApyOvrTmBasicSS05/rwd_occur_ovr_wk_tm" />
									<xsl:variable name="rwd_ovr_wk_tm" select="msgHumApyOvrTmBasicSS05/rwd_ovr_wk_tm" />
									<xsl:variable name="trn_day" select="msgHumApyOvrTmBasicSS05/tran_ymd" />
									<tr>
										<td class="contant-center" width='63'>
											<xsl:value-of select="$work_ymd" />
										</td>
										<td class="contant-center" width='60'>
											<xsl:value-of select="$day_clsf" />
										</td>
										<td class="contant-center" width='53'>
											<xsl:value-of select="$work_str_tm" />
										</td>
										<td class="contant-center" width='53'>
											<xsl:value-of select="$work_end_tm" />
										</td>
										<td class="contant-center" style="text-align:left">
											<xsl:value-of select="$work_resn" />
										</td>
<!-- 										<td class="contant-center" width='80'> -->
<!-- 											<xsl:value-of select="$amt_ovr_wk_tm" /> -->
<!-- 										</td> -->
										<td class="contant-center" width='80'>
											<xsl:value-of select="$rwd_occur_ovr_wk_tm" />
										</td>
										<td class="contant-center" width='63'>
											<xsl:value-of select="$rwd_ovr_wk_tm" />
										</td>
										<td class="contant-center" width='65'>
											<xsl:value-of select="$trn_day" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<br/>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title' width='10%'>근무시간 계</td>
									<td class="contant-center" width='11%'>
										<xsl:value-of select="ovr_tm" />
<!-- 										분 -->
									</td>
<!-- 									<td class='title' width='12%'>수당예정금액</td> -->
<!-- 									<td class="contant-center" width='15%'> -->
<!-- 										<xsl:value-of select="format-number(ovr_amt,'#,###,###,###,###,###')" /> -->
<!-- 										원 -->
<!-- 									</td> -->
									<td class='title' width='16%'>보상휴가 대상 근무시간</td>
									<td class="contant-center" width='15%'>
										<xsl:value-of select="rwd_occr_tm" />
<!-- 										원 -->
									</td>
									<td class='title' width='12%'>보상휴가시간</td>
									<td class="contant-center" width='12%' style="background-color:yellow">
										<xsl:value-of select="rwd_tm" />
<!-- 										분 -->
									</td>
									<td class='title' width='12%'>대체휴일수</td>
									<td class="contant-center" width='12%' style="background-color:yellow">
										<xsl:value-of select="trn_day" />
										일
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<!-- 첨부파일 (시작) -->
				<!-- <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable"> -->
				<!-- <tr> -->
				<!-- <td class="head"> 첨부파일</td> -->
				<!-- </tr> -->
				<!-- <tr> -->
				<!-- <td class="body"> -->
				<!-- <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable"> -->
				<!-- <xsl:for-each select="fileList_A/vector/data/msgXomxComAttachFileMS01"> -->
				<!-- <tr> -->
				<!-- <td class='title2' width="13%">휴일근무계획서</td> -->
				<!-- <td class='contant' width="87%"> -->
				<!-- <a> -->
				<!-- <xsl:attribute name="href">javascript:xslFileDownload("<xsl:value-of select='attach_full_path' />")</xsl:attribute> -->
				<!-- <xsl:value-of select="org_file" /> -->
				<!-- </a> -->
				<!-- </td> -->
				<!-- </tr> -->
				<!-- </xsl:for-each> -->
				<!-- </table> -->
				<!-- </td> -->
				<!-- </tr> -->
				<!-- </table> -->
				<!-- 첨부파일 (종료) -->
			</body>
	</xsl:template>
</xsl:stylesheet>