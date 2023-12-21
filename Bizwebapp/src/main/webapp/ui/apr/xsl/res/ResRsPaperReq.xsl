<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
		<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> -->
		
			<body>
				<!-- [A]문서 타이틀 (시작) -->
				<!-- <table class="aproutertable" width="100%"> <tr> <td class="head" align="center">사업신청</td> </tr> </table> -->
				<!-- [A]문서 타이틀 (종료) -->
				<script language="javascript">
				<![CDATA[
					function openEvidWindow(reqNo){
						var url = "https://evid.kitech.re.kr/sd/view?CLS=00&amp;amp;RESL_NO=" + reqNo + "&amp;amp;EMP_NO=" + reqNo;
						url = url.replaceAll("amp;","");
						window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
					}
				]]>
			</script>
				<!-- [B]논문 데이터 (시작) -->
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					class="aproutertable">
					<tr>
						<td width="90%" class="head">논문정보</td>
						<!-- 크리스피드 이원길 미리보기 버튼 추가 시작 -->
						<td width="10%" align="right" valign="bottom">
							<a>
								<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="APPROVALREQ/rcpt_no"/>')</xsl:attribute>
								<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/>
							</a>
						</td>
					</tr>
					</table>
				<table class="aproutertable" width="100%">
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="15%" class="title2">게재일자</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/issu_ymd" />
									</td>
									<td width="15%" class="title2">접수번호</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/rcpt_no" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">논문제목</td>
									<td width="85%" colspan="3" class="contant">
										<xsl:value-of select="APPROVALREQ/paper_nm" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">게재지명</td>
									<td width="85%" colspan="3" class="contant">
										<xsl:value-of select="APPROVALREQ/publpapr_nm" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">국내외 구분</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/paper_clsf" />
									</td>
									<td width="15%" class="title2">IF지수</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/if_index" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">SCI구분</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/clsf" />
									</td>
									<td width="15%" class="title2">IF상위구분(mrnIF)</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/if_grade" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">ISBN/ISSN</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/isbn_issn" />
									</td>
									<td width="15%" class="title2">등록학술지여부</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/socty_yn" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">권(Vol.)호(No.)</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/ed_vol" />
										권
										<xsl:value-of select="APPROVALREQ/ed_no" />
										호
									</td>
									<td width="15%" class="title2">게재면수</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/issu_page_start" />
										~
										<xsl:value-of select="APPROVALREQ/issu_page_end" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">논문접수파일</td>
									<td width="85%" colspan="3" class="contant">
										<table cellpadding="0" cellspacing="2" width="100%">

											 <xsl:for-each select="APPROVALREQ/fileList_A/vector/data/mdata">
												<tr>
													<td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">
														<a>
															<xsl:attribute name="href">#</xsl:attribute>
															<xsl:attribute name="onclick">downloadForXsl('<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq"/>', 'XAA001');return false;</xsl:attribute>
															<xsl:value-of select="file_nm" />  
														</a>
													</td>
												</tr>
											</xsl:for-each>

										</table>
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">논문표절검증시스템 이용여부</td>
									<td width="85%" colspan="3" class="contant">
										<xsl:value-of select="APPROVALREQ/paperchk_clsf" />
									</td>
								</tr>
							</table>
							
						</td>
					</tr>
				</table>
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">과제정보</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="15%" class="title2">계정정보</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/accnt_no" />
									</td>
									<td width="15%" class="title2">연구기간</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/prj_ymd" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">과제구분</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/bsns_cd_detls_bsns_nm" />
									</td>
									<td width="15%" class="title2">주관부처</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/bsns_cd_ofic_nm" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">과제명</td>
									<td width="85%" colspan="3" class="contant">
										<xsl:value-of select="APPROVALREQ/prj_nm" />
									</td>
								</tr>
								<tr>
									<td width="15%" class="title2">연구책임자</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/nm" />
									</td>
									<td width="15%" class="title2">부서</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVALREQ/dept_nm" />
									</td>
								</tr>
								<tr>
                  					<td width='15%' class='title2'>공개사유</td>
                 					<td width='85%' colspan='3' class='contant'>
                 						<xsl:value-of select="APPROVALREQ/secrt_rmk"/>
                 					</td>
                				</tr>
                		
                				<tr>
									<td width="15%" class="title2">공개사유서첨부</td>
									<td width="85%" colspan="3" class="contant">
										<table cellpadding="0" cellspacing="2" width="100%">
											 <xsl:for-each select="APPROVALREQ/fileList_B/vector/data/mdata">
												<tr>
													<td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">
														<a>
															<xsl:attribute name="href">#</xsl:attribute>
															<xsl:attribute name="onclick">downloadForXsl('<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq"/>', 'XAA001');return false;</xsl:attribute>
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
				<!-- [B]논문데이터 (종료) -->

				<!-- [C]참여저자 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">참여저자</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="5%" class="title">순번</td>
									<td width="9%" class="title">저자구분</td>
									<td width="9%" class="title">내외구분</td>
									<td width="10%" class="title">성명</td>
									<td width="9%" class="title">개인번호</td>
									<td width="9%" class="title">직급</td>
									<td width="10%" class="title">지분</td>
									<td width="16%" class="title">소속</td>
									<td width="16%" class="title">부서</td>
									<td width="10%" class="title">실적부서</td>
								</tr>
								<xsl:for-each select="APPROVALREQ/docGrid/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="position()" />
										</td>
										<xsl:if test="msgResRtRepptMS03/auth_clsf = 'RVD001'">
											<td class="contant-center">제1저자</td>
										</xsl:if>
										<xsl:if test="msgResRtRepptMS03/auth_clsf = 'RVD002'">
											<td class="contant-center">교신저자</td>
										</xsl:if>
										<xsl:if test="msgResRtRepptMS03/auth_clsf = 'RVD003'">
											<td class="contant-center">참여저자</td>
										</xsl:if>
										<xsl:if test="msgResRtRepptMS03/auth_clsf = 'RVD004'">
											<td class="contant-center">제2저자</td>
										</xsl:if>
										<xsl:if test="msgResRtRepptMS03/rhi_clsf = 'RHI001'">
											<td class="contant-center">내부</td>
										</xsl:if>
										<xsl:if test="msgResRtRepptMS03/rhi_clsf = 'RHI002'">
											<td class="contant-center">외부</td>
										</xsl:if>
										<td class="contant-center">
											<xsl:value-of select="msgResRtRepptMS03/nm" />
										</td> <!-- 성명 -->
										<td class="contant-center">
											<xsl:value-of select="msgResRtRepptMS03/empno" />
										</td> <!-- 개인번호 -->
										<td class="contant-center">
											<xsl:value-of select="msgResRtRepptMS03/posi_nm" />
										</td> <!-- 직급 -->
										<td class="contant-center">
											<xsl:value-of select="format-number(msgResRtRepptMS03/auth_scr, '##0.000')" />
										</td> <!-- 지분 -->
										<td class="contant-center">
											<xsl:value-of select="msgResRtRepptMS03/divsn_dept_nm" />
										</td> <!-- 소속 -->
										<td class="contant-center">
											<xsl:value-of select="msgResRtRepptMS03/dept_nm" />
										</td> <!-- 부서 -->
										<td class="contant-center">
											<xsl:if test="msgResRtRepptMS03/dept_chk = '1'">
												√								
											</xsl:if>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<!-- [C]참여저자 (종료) -->
				<br />
				<br />
			</body>
	</xsl:template>
</xsl:stylesheet>