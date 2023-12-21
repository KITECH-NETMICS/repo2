<?xml version="1.0"?>
<!DOCTYPE xsl:stylesheet [ <!ENTITY nbsp "&#160;"> ]>
<xsl:stylesheet xmlns:LINS="snapshot.css" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:fo="http://www.w3.org/1999/XSL/Format">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
			<BODY>
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">연구실등록정보</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="20%" class="title2">신청번호</td>

									<xsl:if test="APPROVAL/lab_gubun = 'A'">
										<td width="30%" class="contant" colspan="3">
											<xsl:value-of select="APPROVAL/space_cd" />
										</td>
									</xsl:if>
									<xsl:if test="APPROVAL/lab_gubun != 'A'">
										<td width="30%" class="contant">
											<xsl:value-of select="APPROVAL/space_cd" />
										</td>

										<td width="20%" class="title2">연구실번호</td>
										<td width="30%" class="contant">
											<xsl:value-of select="APPROVAL/lab_no" />
										</td>
									</xsl:if>
								</tr>
								<tr>
									<td width="20%" class="title2">처리구분</td>
									<td width="30%" class="contant" colspan="3">
										<xsl:value-of select="APPROVAL/lab_gubun_nm" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">신청자</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/req_nm" />
									</td>
									<td width="20%" class="title2">신청일자</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/req_date" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">지역본부</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/centr_cd_nm" />
									</td>
									<td width="20%" class="title2">부서</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/dept_cd_nm" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">소재지</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/regn_cd_nm" />
									</td>
									<td width="20%" class="title2">건물명</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/build_nm" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">건물동</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/build_smal_clsf_nm" />
									</td>
									<td width="20%" class="title2">호실</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/roomno" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">연구실명</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/lab_nm" />
									</td>
									<td width="20%" class="title2">연구실유형</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/lab_grd_nm" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">연구실책임자</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/main_secrt_rspns_nm" />
										(
										<xsl:value-of select="APPROVAL/main_secrt_rspns_empno" />
										)
									</td>
									<td width="20%" class="title2">연구실책임자부서</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/main_dept_nm" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">안전관리담담자</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/sub_secrt_rspns_nm" />
										(
										<xsl:value-of select="APPROVAL/sub_secrt_rspns_empno" />
										)
									</td>
									<td width="20%" class="title2">안전관리담담자부서</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/sub_dept_nm" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">주소</td>
									<td width="30%" class="contant" colspan="3">
										<xsl:value-of select="APPROVAL/address" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">등록일</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/aloc_ymd" />
									</td>
									<td width="20%" class="title2">해제일</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/retrn_ymd" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">운영상태</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/lab_state_nm" />
									</td>
									<td width="20%" class="title2"></td>
									<td width="30%" class="contant"></td>
								</tr>
								<tr>
									<td width="20%" class="title2">비고</td>
									<td width="30%" class="contant" colspan="3">
										<xsl:value-of select="APPROVAL/rmk" />
									</td>
								</tr>

							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<xsl:for-each select="APPROVAL/fileList_A/vector/data/mdata">
									<tr>
										<td class="title2" width="16%">첨부파일</td>
										<td class="contant" width="84%">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />","XAA016")</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>

				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">연구실 사용자</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">

								<tr>
									<td width="7%" class="title">순번</td>
									<td width="7%" class="title">구분</td>
									<td width="7%" class="title">개인번호</td>
									<td width="10%" class="title">사용자명</td>
									<td width="10%" class="title">부서</td>
									<td width="7%" class="title">직급</td>
									<td width="10%" class="title">비상연락처</td>
									<td width="7%" class="title">근무여부</td>
								</tr>
								<xsl:for-each select="APPROVAL/doc/vector/data/msgCsfSpaceUserMS02">
									<tr>
										<td width="7%" class="contant-center">
											<xsl:value-of select="seq" />
										</td>
										<td width="7%" class="contant-center">
											<xsl:value-of select="user_clsf" />
										</td>
										<td width="7%" class="contant-center">
											<xsl:value-of select="user_empno" />
										</td>
										<td width="10%" class="contant-center">
											<xsl:value-of select="user_nm" />
										</td>
										<td width="10%" class="contant-center">
											<xsl:value-of select="dept_nm" />
										</td>
										<td width="7%" class="contant-center">
											<xsl:value-of select="posi_nm" />
										</td>
										<td width="10%" class="contant-right">
											<xsl:value-of select="mobile" />
										</td>
										<td width="7%" class="contant-right">
											<xsl:value-of select="work_clsf" />
										</td>
										<td width="7%" class="contant-right">
											<xsl:value-of select="work_yn" />
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
