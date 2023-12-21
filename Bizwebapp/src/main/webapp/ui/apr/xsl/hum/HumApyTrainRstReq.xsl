<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="APYTRAINRSTREQSAVE">
		<xsl:variable name="localPath" select="1" />
			<body>
				<script language="javascript"> 
					<![CDATA[					
					function createForm(nm, tg, act, met){
						var cForm = document.createElement("form"); 
						cForm.name = nm;
						cForm.target = tg;
						cForm.action = act;
						cForm.method = met;
						return cForm;
					}
					
					function createHidden(nm, val, frm){
						var hiddenInput=document.createElement("input");
						
						hiddenInput.setAttribute("type", "hidden");
						hiddenInput.setAttribute("name", nm);
						hiddenInput.setAttribute("value", val);
						frm.appendChild(hiddenInput);
						
						return frm;
					}
					
					function openTrainQstPage(pReqNo, pAprState, pSyspayno){
						
						window.open("","HumApyTrainQstnMnt",'width=1050,height=400,top=50,left=150'); 
						
						var frm = createForm("popFrm", "HumApyTrainQstnMnt", "http://biz.kitech.re.kr/filter/index.jsp", "get");
						frm = createHidden("serviceid", "H565", frm);
						frm = createHidden("req_no", pReqNo, frm);
						frm = createHidden("apr_state", pAprState, frm);
						frm = createHidden("syspayno", pSyspayno, frm);										
						frm = createHidden("requestFlag", "H", frm);			/* 웹스퀘어에서 요청 : W, 결재(HTML)에서 요청 : H */	
		
						document.body.appendChild(frm);
						frm.submit();
					}
				]]>
				</script>


				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' colspan="4">
										1. 인적사항
									</td>
								</tr>
								<tr>
									<td width="20%" class='title2'>
										성 명
									</td>
									<td class="contant">
										<xsl:value-of select="sh_nm" />
									</td>
									<td width="14%" class='title2'>
										직 급
									</td>
									<td class="contant">
										<xsl:value-of select="sh_posi_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>부 서</td>
									<td colspan="3" class="contant">
										<xsl:value-of select="sh_dept_nm" />
									</td>
								</tr>
								<tr>
									<td colspan="4" class='title2'>
										2. 교육훈련구분
									</td>
								</tr>
								<tr>
									<td class='title2'>교육유형</td>
									<td class='contant'>
										<xsl:value-of select="sh_educ_typ_nm" />
									</td>
									<td class='title2'>교육구분(선택)</td>
									<td class='contant'>
										<xsl:value-of select="sh_educ_cd_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>교육명</td>
									<td class='contant' colspan="3">
										<xsl:value-of select="sh_educ_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>교육기관</td>
									<td class='contant'>
										<xsl:value-of select="sh_educ_agncy" />
									</td>
									<td class='title2'>교육기간</td>
									<td class='contant'>
										<xsl:value-of select="sh_educ_ymd" />
									</td>
								</tr>
								<tr>
									<td class='title2'>교육시간</td>
									<td class='contant-right'>
										<xsl:value-of select="sh_educ_time" />
										시간
									</td>
									<td class='title2'>교육비합계</td>
									<td class='contant-right'>
										<xsl:value-of select="format-number(sh_rpt_educ_amt, '#,###,###,###,###,###')" />
									</td>
								</tr>
								<tr>
									<td class='title2'>계정</td>
									<td class='contant'>
										<xsl:value-of select="sh_accnt_no" />
									</td>
									<td class='title2'>비용코드</td>
									<td class='contant'>
										<xsl:value-of select="sh_expns_cd_nm" />
										(
										<xsl:value-of select="sh_expns_cd" />
										)
									</td>
								</tr>
								<tr>
									<td class='title2'>
										의무교육 이수 시간(선택)
									</td>
									<td class='contant' colspan="3">
										<xsl:value-of select="sh_duty_educ_complt_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>결과보고 설문조사</td>
									<td class='contant' colspan="3">
										<a>
											<xsl:attribute name="href">javascript:openTrainQstPage('<xsl:value-of select="sh_req_no" />','<xsl:value-of select="sh_apr_state" />','<xsl:value-of
												select="sh_syspayno" />')</xsl:attribute>
											◎ 설문 상세 보기◎
										</a>
									</td>
								</tr>
								<tr>
									<td class='title2' colspan="4">
										3. 교육내용요약
									</td>
								</tr>
								<tr>
									<td class='contant' colspan="4">

										<xsl:value-of select="sh_rpt_educ_contnt" />

									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<TR>
						<TD align="left" class="head">교육훈련첨부파일</TD>
					</TR>
					<xsl:if test="count(fileList_A/vector/data)!=0">
						<TR>
							<TD class="body">
								<TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<xsl:for-each select="fileList_A/vector/data/mdata">
										<TR>
											<TD class="contant">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA015')</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
											</TD>
										</TR>
									</xsl:for-each>
								</TABLE>
							</TD>
						</TR>
					</xsl:if>
				</TABLE>
				<TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<TR>
						<TD align="left" class="head">결과보고 첨부파일</TD>
					</TR>
					<xsl:if test="count(fileList_B/vector/data)!=0">
						<TR>
							<TD class="body">
								<TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
									<xsl:for-each select="fileList_B/vector/data/mdata">
										<TR>
											<TD class="contant">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA015')</xsl:attribute>
													<xsl:value-of select="file_nm" />
												</a>
											</TD>
										</TR>
									</xsl:for-each>
								</TABLE>
							</TD>
						</TR>
					</xsl:if>
				</TABLE>

				<br />
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title' colspan="9">
										교육 참가자 인적사항
									</td>
								</tr>
								<xsl:for-each select="EDU_LST/vector/data/msgHumApyEduCpacp01">
									<tr>
										<td class='title'>순번</td>
										<td class='title'>부서</td>
										<td class='title'>개인번호</td>
										<td class='title'>성명</td>
										<td class='title'>직급</td>
										<td class='title'>교육비</td>
										<td class='title'>교육기간</td>
										<td class='title'>교육시간</td>
										<td class='title'>참석여부</td>
									</tr>
									<tr>
										<td class='contant-center'>
											<xsl:number count="EDU_LST/vector/data" level="single" format="1-100" />
										</td>
										<td class='contant-center'>
											<xsl:value-of select="dept_nm" />
										</td>
										<td class='contant-center'>
											<xsl:value-of select="emp_no" />
										</td>
										<td class='contant-center'>
											<xsl:value-of select="nm" />
										</td>
										<td class='contant-center'>
											<xsl:value-of select="posi_nm" />
										</td>
										<td class='contant-right'>
											<xsl:value-of select="format-number(rpt_educ_amt, '#,###,###,###,###,###')" />
										</td>
										<td class='contant-center'>
											<xsl:value-of select="educ_ymd" />
										</td>
										<td class='contant-right'>
											<xsl:value-of select="educ_time" />
											시간
										</td>
										<td class='contant-center'>
											<xsl:if test="attend_yn = 'Y'">
												참석
											</xsl:if>
											<xsl:if test="attend_yn = 'N'">
												불참
											</xsl:if>
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