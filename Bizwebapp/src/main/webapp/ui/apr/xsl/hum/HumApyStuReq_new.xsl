<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="1" />
			<body>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<TR>
						<TD align="left" class="head">신청자 정보</TD>
					</TR>
					<tr> 
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="10%">부서</td>
									<td class="contant" width="40%">
										<xsl:value-of select="root/humApyStuVo/dept_nm" />
									</td>
									<td class='title2' width="10%">직급</td>
									<td colspan="3" class="contant" width="40%">
										<xsl:value-of select="root/humApyStuVo/posi_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>성명</td>
									<td class="contant">
										<xsl:value-of select="root/humApyStuVo/nm" />(<xsl:value-of select="root/humApyStuVo/empno" />)
									</td>
									<td class='title2'>문서번호</td>
									<td colspan="3" class="contant">
										<xsl:value-of select="root/humApyStuVo/req_no" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<TR>
						<TD align="left" class="head">연수책임자(지도교수) 정보</TD>
					</TR>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="10%">부서</td>
									<td class="contant" width="40%">
										<xsl:value-of select="root/humApyStuVo/rspns_dept_nm" />
									</td>
									<td class='title2' width="10%">직급</td>
									<td colspan="3" class="contant" width="40%">
										<xsl:value-of select="root/humApyStuVo/rspns_posi_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>성명</td>
									<td class="contant">
										<xsl:value-of select="root/humApyStuVo/rspns_map_prof_nm" />
									</td>
									<td class='title2'>개인번호</td>
									<td colspan="3" class="contant">
										<xsl:value-of select="root/humApyStuVo/rspns_empno" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="10%">부서장</td>
									<td class="contant" width="40%">
										<xsl:value-of select="root/humApyStuVo/rspns_depthed_nm" />
									</td>
									<td class='title2' width="10%">본부장</td>
									<td class="contant" width="40%">
										<xsl:value-of select="root/humApyStuVo/rspns_divsn_rspns_nm" />
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
								<tr>
									<td colspan="8" class='title'>
										학생연구원 정보
									</td>
								</tr>
								<tr>
									<td class='title'>성명</td>
<!-- 									<td class='title'>성명<br/>(한자)</td> -->
<!-- 									<td class='title'>최종학력<br/>(학교명 및<br/> 전공명)</td> -->
<!-- 									<td class='title'>졸업<br/>(예정)일</td> -->
									<td class='title'>지원학교</td>
									<td class='title'>전공</td>
									<td class='title'>과정</td>
									<td class='title'>직급</td>
									<td class='title'>활용예정시작일</td>
									<td class='title'>활용예정종료일</td>
<!-- 									<td class='title'>생년월일</td> -->
<!-- 									<td class='title'>성별</td> -->
<!-- 									<td class='title'>전기/후기</td> -->
<!-- 									<td class='title'>입사일자</td> -->
									<td class='title'>수련내용</td>
								</tr>
								<xsl:for-each select="root/humApyStuVoList">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="nm" />
										</td>
<!-- 										<td class="contant-center"> -->
<!-- 											<xsl:value-of select="nm_chchar" /> -->
<!-- 										</td> -->
<!-- 										<td class="contant-center"> -->
<!-- 											<xsl:value-of select="final_edu" /> -->
<!-- 										</td> -->
<!-- 										<td class="contant-center"> -->
<!-- 											<xsl:value-of select="gradt_ymd" /> -->
<!-- 										</td> -->
										<td class="contant-center">
											<xsl:value-of select="supt_schl" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="major_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="procs" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="posi_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="prj_start_ymd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="prj_cls_ymd" />
										</td>
<!-- 										<td class="contant-center"> -->
<!-- 											<xsl:value-of select="birth_ymd" /> -->
<!-- 										</td> -->
<!-- 										<td class="contant-center"> -->
<!-- 											<xsl:value-of select="sex" /> -->
<!-- 										</td> -->
<!-- 										<td class="contant-center"> -->
<!-- 											<xsl:value-of select="former_latter" /> -->
<!-- 										</td> -->
<!-- 										<td class="contant-center"> -->
<!-- 											<xsl:value-of select="entr_ymd" /> -->
<!-- 										</td> -->
										<td class="contant">
											<xsl:value-of select="pruse_contnt" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<TR>
						<TD align="left" class="head">면담결과</TD>
					</TR>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title'>대상</td>
									<td class='title'>면담결과</td>
								</tr>
								<xsl:for-each select="root/humApyStuVoList">
									<tr>
										<td class="contant-center" width="20%">
											<xsl:value-of select="nm" />
										</td>
										<td class="contant" width="80%">
											<xsl:value-of select="intrv_result" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<TR>
						<TD align="left" class="head">연수책임자 학생인건비 현황</TD>
					</TR>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="10%">잔액</td>
									<td class="contant" width="40%">
										<xsl:value-of select="format-number(root/humApyStuVo/ramt_amt, '#,###')"/>
									</td>
									<td class='title2' width="20%">당해년도지출예정액</td>
									<td class="contant" width="30%">
										<xsl:value-of select="format-number(root/humApyStuVo/enfrc_amt, '#,###')" />
									</td>
								</tr>
								<tr>
									<td class='title2' width="10%">확보계획</td>
									<td colspan="3" class="contant" width="90%" style="word-break:break-all">
										<xsl:value-of select="root/humApyStuVo/secure_plan" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<TR>
						<TD align="left" class="head">연수책임자 과제현황</TD>
					</TR>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title'>계정번호</td>
									<td class='title'>과제명</td>
									<td class='title'>연구비</td>
									<td class='title'>연구기간</td>
								</tr>
								<xsl:for-each select="root/rspnsPrjVoList">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="accnt_no" />
										</td>
										<td class="contant">
											<xsl:value-of select="accnt_no_nm" />
										</td>
										<td class="contant-right">
											<xsl:if test="total_cash != ''">
												<xsl:value-of select="format-number(total_cash, '#,###')" />
											</xsl:if>
											<xsl:if test="total_cash = ''">
												<xsl:value-of select="total_cash" />
											</xsl:if>
										</td>
										<td class="contant-center">
											<xsl:value-of select="prj_ymd" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<TR>
						<TD align="left" class="head">연수책임자 지도 학생연구원 현황</TD>
					</TR>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title'>개인번호</td>
									<td class='title'>성명</td>
									<td class='title'>직급</td>
									<td class='title'>계약인건비</td>
									<td class='title'>계약기간</td>
									<td class='title'>교수구분</td>
								</tr>
								<xsl:for-each select="root/rspnsStuVoList">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="empno" />
										</td>
										<td class="contant">
											<xsl:value-of select="nm" />
										</td>
										<td class="contant">
											<xsl:value-of select="posi_nm" />
										</td>
										<td class="contant-center">
											<xsl:if test="month_fxdamt_amt != ''">
												<xsl:value-of select="format-number(month_fxdamt_amt, '#,###')" />
											</xsl:if>
											<xsl:if test="month_fxdamt_amt = ''">
												<xsl:value-of select="month_fxdamt_amt" />
											</xsl:if>
										</td>
										<td class="contant-center">
											<xsl:value-of select="contrct_ymd" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="respn_clsf" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<TR>
						<TD align="left" class="head">첨부파일</TD>
					</TR>
						<TR>
							<TD class="body">
								<TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								
								
									<xsl:for-each
										select="root/fileList">
										<TR>
											<TD class="contant">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA003')</xsl:attribute>
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
											</TD>
										</TR>
									</xsl:for-each>
									
									
								</TABLE>
							</TD>
						</TR>
				</TABLE>
			</body>
	</xsl:template>
</xsl:stylesheet>