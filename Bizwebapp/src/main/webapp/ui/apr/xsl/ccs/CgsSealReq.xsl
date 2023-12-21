<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="EUC-KR" indent="yes"/>
	<xsl:template match="/">
		<html lang="kr">
			<head>
				<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
				<link href="/style/snapshot_st.css" rel="stylesheet" type="text/css"/>
			<style>
			</style>
			</head>
			<BODY>
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
			    <tr>
				     <td class="body">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
							<tr>
								<td class="title2">신청번호</td>
								<td colspan="5" class="contant">
									<xsl:value-of
									select="request/updateInfo/req_no/@value" />
								</td>								
							</tr>
							<tr>
								<td class="title2">신청자</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_nm/@value" />
									<xsl:value-of
										select="request/updateInfo/apr_emp_no/@value" />
								</td>
								<td class="title2">신청부서</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_dept_nm/@value" />
								</td>
								<td class="title2">직급</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_posi/@value" />
								</td>
							</tr>
							<tr>
								<td class="title2">인장명</td>
								<td colspan="5" class="contant">
									<xsl:if test="contains(request/updateInfo/seal_clsf/@value, 'CGA001')">
										직인
									</xsl:if>							
									<xsl:if test="contains(request/updateInfo/seal_clsf/@value, 'CGA002')">
										인감
									</xsl:if>							
								</td>						
							</tr>			
							<tr>
								<td rowspan="2" class="title2">인장서명</td>
								<td class="title2">각인문자</td>
								<td colspan="4" width="50%" class="contant">
									<xsl:value-of
										select="request/updateInfo/stamp_char/@value" />
								</td>						
							</tr>
							<tr>
								<td class="title2">각인규격</td>
								<td colspan="2" class="contant" width="20%">
									<xsl:value-of
										select="request/updateInfo/stamp_std/@value" />
								</td>
								<td class="title2">크기</td>
								<td class="contant" width="20%">
									<xsl:value-of
										select="request/updateInfo/size/@value" />
								</td>
							</tr>
							<tr>
								<td class="title2">관리책임자</td>
								<td class="title2">부서</td>
								<td colspan="2" class="contant" width="20%">
									<xsl:value-of
										select="request/updateInfo/apr_mngmt_respn_psn_dept_nm/@value" />
								</td>
								<td class="title2">이름</td>
								<td class="contant" width="20%">
									<xsl:value-of
										select="request/updateInfo/mngmt_respn_psn_nm/@value" />
								</td>
							</tr>
							<tr>
								<td class="title2">사용부서</td>
								<td colspan="5" class="contant">
									<xsl:value-of
										select="request/updateInfo/use_dept_nm/@value" />
								</td>
							</tr>
							<tr>
								<td class="title2">용도</td>
								<td colspan="5" class="contant">
									<xsl:value-of
										select="request/updateInfo/use_usg/@value" />							
								</td>
							</tr>
							<tr>
								<td class="title2">각인의뢰이유</td>
								<td width="30%" class="contant">
									<xsl:value-of
										select="request/updateInfo/stamp_req_resn/@value" />
								</td>
								<td class="title2">사용기간</td>
								<td width="35%" colspan="3" class="contant">
									<xsl:value-of
										select="request/updateInfo/apr_use_orign_ymd/@value" />~
									<xsl:value-of
										select="request/updateInfo/apr_use_cls_ymd/@value" />
								</td>
							</tr>	
							<tr>
								<td class="title2">인장재료</td>
								<td class="contant">
									<xsl:value-of
										select="request/updateInfo/seal_matrl/@value" />
								</td>
								<td class="title2">특기사항</td>
								<td colspan="3" class="contant">
									<xsl:value-of
										select="request/updateInfo/spclab_item/@value" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			</BODY>			
		</html>
	</xsl:template>
</xsl:stylesheet>