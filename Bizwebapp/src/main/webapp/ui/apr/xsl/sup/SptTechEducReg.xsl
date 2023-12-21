<?xml version="1.0"?>
<!DOCTYPE xsl:stylesheet [ <!ENTITY nbsp "&#160;"> ]>
<xsl:stylesheet xmlns:LINS="snapshot.css" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
	xmlns:fo="http://www.w3.org/1999/XSL/Format">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/APPROVAL">
		<xsl:variable name="localPath" select="request/localPath" />
			<body>
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">교육정보</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="15%" class="title2">신청번호</td>
									<td width="35%" class="contant">
										<xsl:value-of select="req_no" />
									</td>
									<td width="15%" class="title2">등록자</td>
									<td width="35%" class="contant">
										<xsl:value-of select="regst_psn_nm" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">관리번호</td>
									<td width="35%" class="contant">
										<xsl:value-of select="mngmt_no" />
									</td>
									<td width="15%" class="title2">책임자</td>
									<td width="35%" class="contant">
										<xsl:value-of select="rspns_nm" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">지역본부</td>
									<td width="35%" class="contant">
										<xsl:value-of select="region_centr_nm" />
									</td>
									<td width="15%" class="title2">소속</td>
									<td width="35%" class="contant">
										<xsl:value-of select="dept_nm" />
									</td>
								</tr>
								<tr>
									<td class="title2">교육과정</td>
									<td class="contant">
										<xsl:value-of select="educ_procs" />
									</td>
									<td class="title2">참여자수</td>
									<td class="contant">
										<xsl:value-of select="attnce_qty1" />
									</td>
								</tr>
								<tr>
									<td class="title2">교육일자</td>
									<td class="contant">
										<xsl:value-of select="educ_start_ymd" /> ~ <xsl:value-of select="educ_end_ymd" /> 
									</td>
									<td class="title2">교육수준</td>
									<td class="contant">
										<xsl:value-of select="educ_grd" />
									</td>
								</tr>
								<tr>
									<td class="title2">교육목적</td>
									<td class="contant">
										<xsl:value-of select="educ_purp" />
									</td>
									<td class="title2">교육유형</td>
									<td class="contant">
										<xsl:value-of select="educ_form" />
									</td>
								</tr>
								<tr>
									<td class="title2">교육장소</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="educ_plce" />
									
									</td>
								</tr>
								<tr>
									<td class="title2">비고</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="rmk" />
									
									</td>
								</tr>
								<tr>
									<td class="title2">교육계획서 첨부파일</td>
									<td class="contant" colspan="3">
										<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
											<xsl:for-each select="fileList_A/vector/data/mdata">
											<tr>
												<td class="contant" width="100%">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA015')</xsl:attribute>
														<xsl:value-of select="file_nm" />
													</a>
												</td>
											</tr>
											</xsl:for-each>
										</table>									
									</td>
								</tr>
								<tr>
									<td class="title2">결과보고서 첨부파일</td>
									<td class="contant" colspan="3">
										<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
											<xsl:for-each select="fileList_B/vector/data/mdata">
											<tr>
												<td class="contant" width="100%">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA015')</xsl:attribute>
														<xsl:value-of select="file_nm" />
													</a>
												</td>
											</tr>
											</xsl:for-each>
										</table>									
									</td>
								</tr>
							</table>
						</td>
					</tr>					
				</table>
				
				
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">주요프로그램</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class="title" width="20%" colspan="2">시작</td>
									<td class="title" width="20%" colspan="2">종료</td>
									<td class="title" width="15%" rowspan="2">소요(분)</td>
									<td class="title" width="25%" rowspan="2">내용</td>
									<td class="title" width="10%" rowspan="2">강사명</td>
									<td class="title" width="10%" rowspan="2">비고</td>
								</tr>
								<tr>
									<td class="title" width="10%">일자</td>
									<td class="title" width="10%">시간</td>
									<td class="title" width="10%">일자</td>
									<td class="title" width="10%">시간</td>
								</tr>
								<xsl:for-each select="itemSelect02/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducSched001/start_ymd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducSched001/start_tm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducSched001/end_ymd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducSched001/end_tm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducSched001/total_time" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducSched001/contnt" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducSched001/lectr_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducSched001/rmk" />
										</td>										
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>	

				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">소요예산</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class="title" width="10%" >계정번호</td>
									<td class="title" >사업명</td>
									<td class="title" width="15%" >소요금액</td>
									<td class="title" width="25%" >비고</td>
								</tr>
								<xsl:for-each select="itemSelect03/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducReqdBugt001/accnt_no" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducReqdBugt001/accnt_no_nm" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="msgSptTechEducReqdBugt001/reqd_amt" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducReqdBugt001/rmk" />
										</td>
									</tr>
								</xsl:for-each>
								<tr>
									<td colspan="2" class="contant">총계</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(itemSelect03sum, '#,###')" />
									</td>
									<td class="contant-right"></td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">기여자</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class="title" width="10%" >성명</td>
									<td class="title" width="10%" >사원번호</td>
									<td class="title" width="15%" >부서</td>
									<td class="title" width="10%" >전화번호</td>
									<td class="title" width="10%" >기여율(%)</td>
									<td class="title" width="10%" >실적부서</td>
									<td class="title" width="25%" >비고</td>
								</tr>
								<xsl:for-each select="itemSelect04/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducContribute001/nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducContribute001/empno" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducContribute001/dept_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducContribute001/ext_no" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducContribute001/contribute_rt" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducContribute001/stake_dept" />
										</td>										
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducContribute001/rmk" />
										</td>																
									</tr>
								</xsl:for-each>
								<tr>
									<td colspan="4" class="contant">총계</td>
									<td class="contant-center">
										<xsl:value-of select="format-number(itemSelect04sum, '#,###')" />
									</td>
									<td colspan="2" class="contant-center">
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">교육 참여자</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class="title" width="15%" >내외구분</td>
									<td class="title" width="15%" >참석자</td>
									<td class="title" width="15%" >소속</td>
									<td class="title" width="15%" >직급</td>
									<td class="title" width="20%" >연락처</td>
									<td class="title" width="20%" >이메일</td>
								</tr>
								<xsl:for-each select="itemSelect01/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducAttnceMS02/user_clsf_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducAttnceMS02/attnce_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducAttnceMS02/dept_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducAttnceMS02/posi_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducAttnceMS02/attnce_mobile" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgSptTechEducAttnceMS02/attnce_email" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>				
			</body>
	</xsl:template>

</xsl:stylesheet>
