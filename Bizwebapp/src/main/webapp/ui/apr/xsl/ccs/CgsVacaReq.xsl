<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<body>
			<script language="javascript">
				<![CDATA[
					/**
					 * 휴가원 사용내역
					*/ 
					function openVacaInfoPop(reqPsnSyaPayNo){
						debugger;
						var data = { sysPayNo : reqPsnSyaPayNo, displayType:"" };
						var url = "/ui/ccs/pop/CCS_POP_C22A_01P.xml";
						var option = { width: 1000, height: 800, id: "vacaInfoPop", popupName: "개인휴가현황" };
						
						com.openPopup(url, option, data);
					}					
				]]>
			</script>
			<xsl:if test="contains(root/postAprVo/is_apr_after, 't')">
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head" style="">
							사후결재 정보
						</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td width="10%" class="title2">사 유</td>
									<td width="90%" class="contant">
										<xsl:value-of select="root/postAprVo/reason" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</xsl:if>
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
									<xsl:value-of select="root/cgslappVo/req_psn_nm" />
									(
									<xsl:value-of select="root/cgslappVo/req_psn_empno" />
									)
									<!-- <a target="_blank" onclick="window.open(this.href,this.target,'width=725,height=575,scrollbars=1');return false;" style="margin-left:10px;color:gray;"> -->
									<!-- <xsl:attribute name="href">http://biz.kitech.re.kr/filter/index.jsp?serviceid=C22A&amp;sysPayNo=<xsl:value-of select="root/cgslappVo/req_psn_syspayno" 
										/></xsl:attribute> -->
									<!-- 휴가사용내역 -->
									<!-- </a> -->
									<a style="color:blue">
										<xsl:attribute name="href">javascript:openVacaInfoPop('<xsl:value-of select="root/cgslappVo/req_psn_syspayno" />')</xsl:attribute>
										휴가사용내역
									</a>
								</td>
								<td class="title2">신청번호</td>
								<td width="35%" class="contant">
									<xsl:value-of select="root/cgslappVo/req_no" />
								</td>
							</tr>
							<tr>
								<td class="title2">소속</td>
								<td class="contant">
									<xsl:value-of select="root/cgslappVo/req_psn_dept_nm" />
								</td>
								<td class="title2">직급</td>
								<td class="contant">
									<xsl:value-of select="root/cgslappVo/posi_nm" />
								</td>
							</tr>
							<tr>
								<td class="title2">휴가구분</td>
								<td class="contant">
									<xsl:value-of select="root/cgslappVo/holiday_clsf_nm" />
									<xsl:if test="root/cgslappVo/holiday_sub_clsf != ''">
										/
										<xsl:value-of select="root/cgslappVo/holiday_sub_clsf" />
									</xsl:if>
									<xsl:if test="contains(root/cgslappVo/holiday_clsf_nm, '보상휴가')">
										(
										<xsl:value-of select="root/cgslappAnalVo/use_reward" />
										/
										<xsl:value-of select="root/cgslappAnalVo/remain_reward" />
										)
									</xsl:if>
								</td>
								<td class="title2">휴가사유</td>
								<td class="contant">
									<xsl:value-of select="root/cgslappVo/holiday_cause" />
								</td>
							</tr>
							<tr>
								<td class="title2">휴가기간</td>
								<td class="contant" colspan="3">
									<xsl:value-of select="root/cgslappVo/holiday_prd" />
								</td>
							</tr>
							<xsl:if test="contains(root/cgslappVo/apr_holiday_clsf, '가족돌봄휴가')">
								<tr>
									<td class="title2">돌봄가족정보</td>
									<td class="contant" colspan="3">
										성명:
										<xsl:value-of select="root/cgslappVo/care_name" />
										,
										관계:
										<xsl:value-of select="root/cgslappVo/care_relation" />
										,
										생년월일:
										<xsl:value-of select="root/cgslappVo/care_birth_ymd" />
									</td>
								</tr>
							</xsl:if>
							<xsl:if test="contains(root/cgslappVo/holiday_clsf_nm, '공가-코로나19')">
								<tr>
									<td class="title2">공가-코로나19</td>
									<td class="contant" colspan="3">
										백신접종구분:
										<xsl:value-of select="root/cgslappVo/vaccine" />
										<xsl:if test="root/cgslappVo/vac_cause != ''">
											, 백신접종사유:
											<xsl:value-of select="root/cgslappVo/vac_cause" />
										</xsl:if>
										<xsl:if test="root/cgslappVo/vac_gb != ''">
											, 백신종류:
											<xsl:value-of select="root/cgslappVo/vac_gb" />
										</xsl:if>
										<xsl:if test="root/cgslappVo/vac_date != ''">
											, 접종시기:
											<xsl:value-of select="root/cgslappVo/vac_date" />
										</xsl:if>
									</td>
								</tr>
							</xsl:if>
							<tr>
								<td class="title2">신청전 잔여연차</td>
								<td class="contant">
									<xsl:value-of select="root/cgslappVo/holiday_before_remain" />
								</td>
								<td class="title2">신청후 잔여연차</td>
								<td class="contant">
									<xsl:value-of select="root/cgslappVo/remain_holiday" />
								</td>
							</tr>
							<tr>
								<td class="title2">신청전 잔여보상휴가</td>
								<td class="contant">
									<xsl:value-of select="root/cgslappVo/apr_beforeRewardRemain" />
								</td>
								<td class="title2">신청후 잔여보상휴가</td>
								<td class="contant">
									<xsl:value-of select="root/cgslappVo/apr_afterRewardRemain" />
								</td>
							</tr>
							<tr>
								<td class="title2">행선지</td>
								<td class="contant">
									<xsl:value-of select="root/cgslappVo/destin" />
								</td>
								<td class="title2">입사일</td>
								<td class="contant">
									<xsl:value-of select="root/cgslappVo/entr_ymd" />
								</td>
							</tr>
							<tr>
								<td class="title2">직무대행</td>
								<td class="contant">
									<xsl:value-of select="root/cgslappVo/agent_psn_nm" />
									(
									<xsl:value-of select="root/cgslappVo/agent_psn_empno" />
									)
								</td>
								<td class="title2">작성자</td>
								<td class="contant">
									<xsl:value-of select="root/cgslappVo/regst_psn_nm" />
								</td>
							</tr>
							<tr>
								<td class="title2">첨부파일</td>
								<td class="contant" colspan="3">
									<xsl:for-each select="root/fileList">
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
									</xsl:for-each>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</body>
	</xsl:template>
</xsl:stylesheet>
