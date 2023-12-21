<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="EUC-KR" indent="yes" />
	<xsl:template match="selectParCom">
		<xsl:variable name="localPath" select="1" />
		<html lang="kr">
			<head>
				<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
				<link href="/style/snapshot_st.css" rel="stylesheet" type="text/css" />
			</head>
			<body>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="15%">신청번호</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="msgSptParEval/par_eval_req_no/@value" />
									</td>
									<td class='title2' width="15%">신청자</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="msgSptParEval/req_psn/@value" />
									</td>
									<td class='title2' width="15%">신청일</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="msgSptParEval/req_dt/@value" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class='head'>파트너기업 정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="15%">회사명</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="msgSptParEval/cmpy_nm_krchar/@value" />
									</td>
									<td class='title2' width="15%">대표자</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="msgSptParEval/reprs_psn/@value" />
									</td>
								</tr>
								<tr>
									<td class='title2'>사업자 등록번호</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="msgSptParEval/bsns_psn_regst_no/@value" />
									</td>
									<td class='title2'>전화번호</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="msgSptParEval/cmpy_reprs_tel/@value" />
									</td>
								</tr>
								<tr>
									<td class='title2'>파트너기업 지정번호</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="msgSptParEval/appont_no/@value" />
									</td>
									<td class='title2'>파트너기업 지정일</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="msgSptParEval/appont_ymd/@value" />
									</td>
								</tr>
								<tr>
									<td class='title2'>멘토</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="msgSptParEval/manager_sysnm/@value" />
									</td>
									<td class='title2'>유지심사일</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="msgSptParEval/eval_ymd/@value" />
									</td>
								</tr>
								<tr>
									<td class='title2'>최종 유지심사일</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="msgSptParEval/last_eval_ymd/@value" />
									</td>
									<td class='title2'>최종 유지심사자</td>
									<td class="contant" colspan="2">
										<xsl:value-of select="msgSptParEval/last_eval_nm/@value" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class='head'>기업지원 프로그램</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="60%" style= "text-align:center;">기업지원 프로그램</td>
									<td class='title2' width="40%" style= "text-align:center;">프로그램 활용유무(3년 이내)</td>
								</tr>
								<xsl:for-each select="programs/vector/data/INFO">
									<tr>
										<td class="contant-center" style="text-align:left;">
											<xsl:value-of select="program/@value" />
										</td>
										<td class="contant-center">
											<xsl:if test="utillO/@value=1">
												O
											</xsl:if>
											<xsl:if test="utillO/@value!=1">
												X
											</xsl:if>
										</td>
									</tr>
								</xsl:for-each>
								<tr>
									<td class="contant-center" style="text-align:left;">
										⑦ 기타
									</td>
									<td class="contant-center">
										<xsl:value-of select="msgSptParEval/program_etc/@value" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class='head'>파트너기업 유지 여부</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="25%">멘토유지</td>
									<td class="contant" width="25%">
										<xsl:if test="msgSptParEval/mento_keep_yn/@value='KEP1'">
												O
										</xsl:if>
									</td>
									<td class='title2' width="25%">멘토변경</td>
									<td class="contant" width="25%">
										<xsl:if test="msgSptParEval/mento_keep_yn/@value='KEP3'">
												O
										</xsl:if>
									</td>
								</tr>
								<tr>
									<td class='title2' width="25%">탈퇴검토</td>
									<td class="contant" width="25%">
										<xsl:if test="msgSptParEval/mento_keep_yn/@value='KEP2'">
												O
										</xsl:if>
									</td>
									<td class='title2' width="25%">추천멘토</td>
									<td class="contant" width="25%">
										<xsl:value-of select="msgSptParEval/rec_mento_nm/@value" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="25%">사유</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="msgSptParEval/rec_mento_reason/@value" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class='head'>파트너 기업 담당자 정보 확인</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' style= "text-align:center;">성명</td>
									<td class='title2' style= "text-align:center;">직책</td>
									<td class='title2' style= "text-align:center;">전화번호</td>
									<td class='title2' style= "text-align:center;">휴대폰 번호</td>
									<td class='title2' style= "text-align:center;">E-mail</td>
								</tr>
								<xsl:for-each select="managers/vector/data/msgSptParInfoEvalMS02">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="affair_respn_psn/@value" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="affair_respn_psn_dept/@value" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="affair_respn_psn_tel/@value" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="affair_respn_psn_mobile_no/@value" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="affair_respn_psn_email/@value" />
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