<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
	<xsl:variable name="localPath" select="1"/>
	<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">  -->
		<body>
			<!-- [A]문서 타이틀 (시작) --> 
			<!--
			<table class="aproutertable" width="100%">
			  <tr>
				<td class="head" align='center'>참여연구원변경</td>
			  </tr>
			</table>
			-->
			<!-- [A]문서 타이틀 (종료) -->
			
			<!-- [B]변경기본정보 (시작) -->
			<table class="aproutertable" width="100%">
				<tr>
					<td class="head">변경기본정보</td>
				</tr>
				<tr>
					<td class="body">
						<table class="aprinnertable" width="100%">
							<tr>
								<td width='15%' class='title2'>신청번호</td>
								<td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/req_no"/></td>
								<td width='15%' class='title2'>가점과제</td>
								<td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/plus_prj_yn"/></td>
							</tr>
							<tr>
								<td width='15%' class='title2'>계정번호</td>
								<td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/accnt_no"/>(<xsl:value-of select="APPROVALREQ/prj_no"/>)<xsl:value-of select="APPROVALREQ/cryfwd_yn"/></td>
								<td width='15%' class='title2'>과제기간</td>
								<td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/prj_term"/></td>
							</tr>
							<tr>
								<td width='15%' class='title2'>과제명</td>
								<td width='85%' colspan='3' class='contant'><xsl:value-of select="APPROVALREQ/prj_nm"/></td>
							</tr>
							<tr>
								<td width='15%' class='title2'>연구책임자</td>
								<td width='85%' colspan='3' class='contant'><xsl:value-of select="APPROVALREQ/nm"/></td>
							</tr>
							<tr>
								<td width='15%' class='title2'>변경차수</td>
								<td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/chng_seq"/></td>
								<td width='15%' class='title2'>확정일자</td>
								<td width='35%' class='contant'>
									<xsl:value-of select="concat(substring(APPROVALREQ/chng_decsn_ymd, 1, 4),
											'-', substring(APPROVALREQ/chng_decsn_ymd, 5, 2), '-', substring(APPROVALREQ/chng_decsn_ymd, 7, 2))" />
								</td>
							</tr>
							<tr>
								<td width='15%' class='title2'>변경근거</td>
								<td width='85%' colspan='3' class='contant'><xsl:value-of select="APPROVALREQ/relat_offcldoc_no"/></td>
							</tr>
							<tr>
								<td width='15%' class='title2'>변경사유</td>
								<td width='85%' colspan='3' class='contant'><xsl:value-of select="APPROVALREQ/chng_resn"/></td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<!-- [B]변경기본정보 (종료) -->

			<table class="aproutertable" width="100%">
				<tr>
					<td class="head">변경 전</td>
				</tr>
		
				<xsl:if test="APPROVALREQ/plus_prj_yn='해당'">
				<tr>
					<td>
						<table class="aproutertable" width="100%">
							<tr>
								<td class="body">
									<table class="aprinnertable" width="100%">
										<tr>
											<td width='20%' class='title'>총 참여연구원 수</td>
											<td width='20%' class='title'>여성연구원 수</td>
											<td width='20%' class='title'>여성연구원 비율</td>
											<td width='20%' class='title'>시간제(여성) 수</td>
											<td width='20%' class='title'>시간제(여성) 인건비</td>
										</tr>
										<tr style="color:blue;background-color:pink">
											<td class='contant-center'><xsl:value-of select="APPROVALREQ/bf_total_psn"/></td>
											<td class='contant-center'><xsl:value-of select="APPROVALREQ/bf_female_psn"/></td>
											<td class='contant-center'><xsl:value-of select="APPROVALREQ/bf_female_rt"/></td>
											<td class='contant-center'><xsl:value-of select="APPROVALREQ/bf_tmfemale_psn"/></td>
											<td class='contant-right'><xsl:value-of select="format-number(APPROVALREQ/bf_tmfemal_amt, '#,###')"/></td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr><td style="height:20px"></td></tr>
				</xsl:if>

				<tr>
					<td class="body">
						<table class="aprinnertable" width="100%">
							<tr>
								<td width='6%' class='title'>연구원구분</td>								
								<td width='6%' class='title'>인건비구분</td>
								<td width='7%' class='title'>성명</td>
								<td width='7%' class='title'>개인번호</td>
								<td width='10%' class='title'>직급</td>
								<td class='title'>부서</td>
								<td width='6%' class='title'>참여율</td>
								<td width='6%' class='title'>현물참여율</td>
								<td width='9%' class='title'>인건비단가</td>
								<td width='9%' class='title'>계상인건비</td>
								<td width='9%' class='title'>현물금액</td>
								<td class='title'>참여기간</td>
								<td class='title'>재참여기간</td>
								<td class='title'>가점사항</td>
							</tr>
							<xsl:for-each select="APPROVALREQ/docPare1/vector/data">
							<tr>
								<td class="contant-center">
									<xsl:choose>
										<xsl:when test="msgResIncDtrfMS04/reschr_clsf='RAL001'">
											연책
										</xsl:when>
										<xsl:when test="msgResIncDtrfMS04/reschr_clsf='RAL002'">
											참여
										</xsl:when>
									</xsl:choose>
								</td>
								<td class='contant-center'><xsl:value-of select="msgResIncDtrfMS04/psnexpns_clsf_nm"/></td>
								<td class='contant-center'><xsl:value-of select="msgResIncDtrfMS04/nm"/></td>
								<td class='contant-center'><xsl:value-of select="msgResIncDtrfMS04/empno"/></td>
								<td class='contant-center'><xsl:value-of select="msgResIncDtrfMS04/posi_nm"/></td>
								<td class='contant'><xsl:value-of select="msgResIncDtrfMS04/dept_nm"/></td>
								<td class='contant-center'><xsl:value-of select="msgResIncDtrfMS04/attnce_rt"/></td>
								<td class='contant-center'><xsl:value-of select="msgResIncDtrfMS04/goods_attnce_rt"/></td>
								<td class='contant-right'><xsl:value-of select="format-number(msgResIncDtrfMS04/psnexpns_month_unit_price, '#,##0')"/></td>
								<td class='contant-right'><xsl:value-of select="format-number(msgResIncDtrfMS04/cash_amt, '#,##0')"/></td>
								<td class='contant-right'><xsl:value-of select="format-number(msgResIncDtrfMS04/goods_amt, '#,##0')"/></td>
								<td class='contant-center'><xsl:value-of select="msgResIncDtrfMS04/attnce_prd_orign_ymd"/> ~ <xsl:value-of select="msgResIncDtrfMS04/attnce_prd_cls_ymd"/></td>
								<td class='contant-center'><xsl:value-of select="msgResIncDtrfMS04/sec_attnce_prd_orign_ymd"/> ~ <xsl:value-of select="msgResIncDtrfMS04/sec_attnce_prd_cls_ymd"/></td>
								<td class='contant-center'><xsl:value-of select="msgResIncDtrfMS04/plus_itm_list"/></td>
							</tr>
							</xsl:for-each>
							<tr>
								<td class='contant-center' colspan="9">합계</td>
								<td class='contant-right'><xsl:value-of select="format-number(APPROVALREQ/total_cash_amt, '#,##0')"/></td>
								<td class='contant-right'><xsl:value-of select="format-number(APPROVALREQ/total_good_amt, '#,##0')"/></td>
								<td class='contant-center' colspan="3"></td>
							</tr>
						</table>
					</td>
				</tr>
			</table>

			<table class="aproutertable" width="100%">
				<tr>
					<td class="head">변경후</td>
				</tr>

				<xsl:if test="APPROVALREQ/plus_prj_yn = '해당'">
				<tr>
					<td>
						<table class="aproutertable" width="100%">
							<tr>
								<td class="body">
									<table class="aprinnertable" width="100%">
										<tr>
											<td width='20%' class='title'>총 참여연구원 수</td>
											<td width='20%' class='title'>여성연구원 수</td>
											<td width='20%' class='title'>여성연구원 비율</td>
											<td width='20%' class='title'>시간제(여성) 수</td>
											<td width='20%' class='title'>시간제(여성) 인건비</td>
										</tr>
										<tr style="color:red;background-color:pink">
											<td class='contant-center'><xsl:value-of select="APPROVALREQ/af_total_psn"/></td>
											<td class='contant-center'><xsl:value-of select="APPROVALREQ/af_female_psn"/></td>
											<td class='contant-center'><xsl:value-of select="APPROVALREQ/af_female_rt"/></td>
											<td class='contant-center'><xsl:value-of select="APPROVALREQ/af_tmfemale_psn"/></td>
											<td class='contant-right'><xsl:value-of select="format-number(APPROVALREQ/af_tmfemal_amt, '#,###')"/></td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr><td style="height:20px"></td></tr>
				</xsl:if>

				<tr>
					<td class="body">
						<table class="aprinnertable" width="100%">
							<tr>
								<td width='6%' class='title'>연구원구분</td>
								<td width='6%' class='title'>인건비구분</td>
								<td width='7%' class='title'>성명</td>
								<td width='7%' class='title'>개인번호</td>
								<td width='10%' class='title'>직급</td>
								<td class='title'>부서</td>
								<td width='6%' class='title'>참여율</td>
								<td width='6%' class='title'>현물참여율</td>
								<td width='9%' class='title'>인건비단가</td>
								<td width='9%' class='title'>계상인건비</td>
								<td width='9%' class='title'>현물금액</td>
								<td class='title'>참여기간</td>
								<td class='title'>재참여기간</td>
								<td class='title'>가점사항</td>
							</tr>

							<xsl:for-each select="APPROVALREQ/docPare2/vector/data">

							<xsl:variable name="syspayno" select="msgResIncDtrfMS04/syspayno"/>
							
							<!-- 현금참여율 -->
							<xsl:variable name="after_attnce_rt" select="msgResIncDtrfMS04/attnce_rt"/>
							<xsl:variable name="before_attnce_rt" select="/APPROVALREQ/docPare1/vector/data/msgResIncDtrfMS04[syspayno=$syspayno]/attnce_rt"/>

							<!-- 참여기간 시작 -->
							<xsl:variable name="after_attnce_prd_orign_ymd" select="msgResIncDtrfMS04/attnce_prd_orign_ymd"/>
							<xsl:variable name="before_attnce_prd_orign_ymd" select="/APPROVALREQ/docPare1/vector/data/msgResIncDtrfMS04[syspayno=$syspayno]/attnce_prd_orign_ymd"/>
							
							<!-- 참여기간 종료 -->
							<xsl:variable name="after_attnce_prd_cls_ymd" select="msgResIncDtrfMS04/attnce_prd_cls_ymd"/>
							<xsl:variable name="before_attnce_prd_cls_ymd" select="/APPROVALREQ/docPare1/vector/data/msgResIncDtrfMS04[syspayno=$syspayno]/attnce_prd_cls_ymd"/>
							
							<!-- 현물참여율 -->
							<xsl:variable name="after_goods_attnce_rt" select="msgResIncDtrfMS04/goods_attnce_rt"/>
							<xsl:variable name="before_goods_attnce_rt" select="/APPROVALREQ/docPare1/vector/data/msgResIncDtrfMS04[syspayno=$syspayno]/goods_attnce_rt"/>
							
							<!-- 인건비단가 -->
							<xsl:variable name="after_psnexpns_month_unit_price" select="msgResIncDtrfMS04/psnexpns_month_unit_price"/>
							<xsl:variable name="before_psnexpns_month_unit_price" select="/APPROVALREQ/docPare1/vector/data/msgResIncDtrfMS04[syspayno=$syspayno]/psnexpns_month_unit_price"/>
							
							<!-- 계상인건비 -->
							<xsl:variable name="after_cash_amt" select="msgResIncDtrfMS04/cash_amt"/>
							<xsl:variable name="before_cash_amt" select="/APPROVALREQ/docPare1/vector/data/msgResIncDtrfMS04[syspayno=$syspayno]/cash_amt"/>
							
							<!-- 현물금액 -->
							<xsl:variable name="after_goods_amt" select="msgResIncDtrfMS04/goods_amt"/>
							<xsl:variable name="before_goods_amt" select="/APPROVALREQ/docPare1/vector/data/msgResIncDtrfMS04[syspayno=$syspayno]/goods_amt"/>
							
							
							<!-- 재참여기간 시작 -->
							<xsl:variable name="after_sec_attnce_prd_orign_ymd" select="msgResIncDtrfMS04/sec_attnce_prd_orign_ymd"/>
							<xsl:variable name="before_sec_attnce_prd_orign_ymd" select="/APPROVALREQ/docPare1/vector/data/msgResIncDtrfMS04[syspayno=$syspayno]/sec_attnce_prd_orign_ymd"/>
							
							<!-- 재참여기간 종료 -->
							<xsl:variable name="after_sec_attnce_prd_cls_ymd" select="msgResIncDtrfMS04/sec_attnce_prd_cls_ymd"/>
							<xsl:variable name="before_sec_attnce_prd_cls_ymd" select="/APPROVALREQ/docPare1/vector/data/msgResIncDtrfMS04[syspayno=$syspayno]/sec_attnce_prd_cls_ymd"/>

							<tr>
								<xsl:if test="msgResIncDtrfMS04/chng_state='RHN003'">
								<xsl:attribute name="style">color:blue;background-color:yellow</xsl:attribute>
								</xsl:if>
								<td class="contant-center">
									<xsl:choose>
										<xsl:when test="msgResIncDtrfMS04/reschr_clsf='RAL001'">
											연책
										</xsl:when>
										<xsl:when test="msgResIncDtrfMS04/reschr_clsf='RAL002'">
											참여
										</xsl:when>
									</xsl:choose>
								</td>
								<td class="contant-center">
									<xsl:choose>
										<xsl:when test="msgResIncDtrfMS04/psnexpns_clsf='RAM001'">
											내부I
										</xsl:when>
										<xsl:when test="msgResIncDtrfMS04/psnexpns_clsf='RAM002'">
											내부II
										</xsl:when>
										<xsl:when test="msgResIncDtrfMS04/psnexpns_clsf='RAM003'">
											외부
										</xsl:when>
										<xsl:when test="msgResIncDtrfMS04/psnexpns_clsf='RAM004'">
											학생
										</xsl:when>
										<xsl:when test="msgResIncDtrfMS04/psnexpns_clsf='RAM005'">
											내부III
										</xsl:when>
									</xsl:choose>
								</td>
								<td class='contant-center'><xsl:value-of select="msgResIncDtrfMS04/nm"/></td>
								<td class='contant-center'><xsl:value-of select="msgResIncDtrfMS04/empno"/></td>
								<td class='contant-center'><xsl:value-of select="msgResIncDtrfMS04/posi_nm"/></td>
								<td class='contant'><xsl:value-of select="msgResIncDtrfMS04/dept_nm"/></td>
								
								<!-- 현금참여율 -->
								<td class='contant-center'>
									<xsl:attribute name="style">
										<xsl:if test="$before_attnce_rt!=$after_attnce_rt">background-color:#D6EFF5</xsl:if>
									</xsl:attribute>
									<xsl:value-of select="msgResIncDtrfMS04/attnce_rt"/>
								</td>
								
								<!-- 현물참여율 -->
								<td class='contant-center'>
									<xsl:attribute name="style">
										<xsl:if test="$before_goods_attnce_rt != $after_goods_attnce_rt">background-color:#D6EFF5</xsl:if>
									</xsl:attribute>
									<xsl:value-of select="msgResIncDtrfMS04/goods_attnce_rt"/>
								</td>
								
								<!-- 인건비단가 -->
								<td class='contant-center'>
									<xsl:attribute name="style">
										<xsl:if test="$before_psnexpns_month_unit_price != $after_psnexpns_month_unit_price">background-color:#D6EFF5</xsl:if>
									</xsl:attribute>
									<xsl:value-of select="format-number(msgResIncDtrfMS04/psnexpns_month_unit_price, '#,##0')"/>
								</td>
								
								<!-- 계상인건비 -->
								<td class='contant-center'>
									<xsl:attribute name="style">
										<xsl:if test="$before_cash_amt != $after_cash_amt">background-color:#D6EFF5</xsl:if>
									</xsl:attribute>
									<xsl:value-of select="format-number(msgResIncDtrfMS04/cash_amt, '#,##0')"/>
								</td>
								
								<!-- 현물금액 -->
								<td class='contant-center'>
									<xsl:attribute name="style">
										<xsl:if test="$before_goods_amt != $after_goods_amt">background-color:#D6EFF5</xsl:if>
									</xsl:attribute>
									<xsl:value-of select="format-number(msgResIncDtrfMS04/goods_amt, '#,##0')"/>
								</td>
								
								<!-- 참여기간 -->
								<td class='contant-center'>
									<xsl:attribute name="style">
										<xsl:if test="$before_attnce_prd_orign_ymd!=$after_attnce_prd_orign_ymd or $before_attnce_prd_cls_ymd!=$after_attnce_prd_cls_ymd">background-color:#D6EFF5</xsl:if>
									</xsl:attribute>
									<xsl:value-of select="msgResIncDtrfMS04/attnce_prd_orign_ymd"/> ~ <xsl:value-of select="msgResIncDtrfMS04/attnce_prd_cls_ymd"/>
								</td>
								
								<!-- 재참여기간 -->
								<td class='contant-center'>
									<xsl:attribute name="style">
										<xsl:if test="$before_sec_attnce_prd_orign_ymd != $after_sec_attnce_prd_orign_ymd or $after_sec_attnce_prd_cls_ymd != $before_sec_attnce_prd_cls_ymd">background-color:#D6EFF5</xsl:if>
									</xsl:attribute>
									<xsl:value-of select="msgResIncDtrfMS04/sec_attnce_prd_orign_ymd"/> ~ <xsl:value-of select="msgResIncDtrfMS04/sec_attnce_prd_cls_ymd"/>
								</td>
								
								<td class='contant-center'> <xsl:value-of select="msgResIncDtrfMS04/plus_itm_list"/></td>
							</tr>
							</xsl:for-each>

							<tr>
								<td class='contant-center' colspan="9">합계</td>
								<td class='contant-right'><xsl:value-of select="format-number(APPROVALREQ/total_chng_cash_amt, '#,##0')"/></td>
								<td class='contant-right'><xsl:value-of select="format-number(APPROVALREQ/total_chng_good_amt, '#,##0')"/></td>
								<td class='contant-right' colspan="3"></td>
							</tr>
						</table>
					</td>
				</tr>
			</table>

			<table class="aproutertable" width="100%">
				<tr>
					<td class="head">인건비 총액</td>
				</tr>
				<tr>
					<td class="body">
						<table class="aprinnertable" width="100%">
							<tr>
								<td class="title" width="20%">인건비구분</td>
								<td class="title" width="40%">변경 전</td>
								<td class="title" width="40%">변경 후</td>
							</tr>
							<tr>
								<td class="title">내부I</td>
								<td class="contant-right"><xsl:value-of select="format-number(APPROVALREQ/bef_tot_ram001_amt, '#,##0')"/></td>
								<td class="contant-right"><xsl:value-of select="format-number(APPROVALREQ/aft_tot_ram001_amt, '#,##0')"/></td>
							</tr>
							<tr>
								<td class="title">내부II</td>
								<td class="contant-right"><xsl:value-of select="format-number(APPROVALREQ/bef_tot_ram002_amt, '#,##0')"/></td>
								<td class="contant-right"><xsl:value-of select="format-number(APPROVALREQ/aft_tot_ram002_amt, '#,##0')"/></td>
							</tr>
							<tr>
								<td class="title">내부III</td>
								<td class="contant-right"><xsl:value-of select="format-number(APPROVALREQ/bef_tot_ram005_amt, '#,##0')"/></td>
								<td class="contant-right"><xsl:value-of select="format-number(APPROVALREQ/aft_tot_ram005_amt, '#,##0')"/></td>
							</tr>
							<tr>
								<td class="title">학생인건비</td>
								<td class="contant-right"><xsl:value-of select="format-number(APPROVALREQ/bef_tot_stu_amt, '#,##0')"/></td>
								<td class="contant-right"><xsl:value-of select="format-number(APPROVALREQ/aft_tot_stu_amt, '#,##0')"/></td>
							</tr>
							<tr>
								<td class="title">총합</td>
								<td class="contant-right"><xsl:value-of select="format-number(number(APPROVALREQ/bef_tot_ram001_amt) + number(APPROVALREQ/bef_tot_ram002_amt) + number(APPROVALREQ/bef_tot_ram005_amt) + number(APPROVALREQ/bef_tot_stu_amt), '#,##0')"/></td>
								<td class="contant-right"><xsl:value-of select="format-number(number(APPROVALREQ/aft_tot_ram001_amt) + number(APPROVALREQ/aft_tot_ram002_amt) + number(APPROVALREQ/aft_tot_ram005_amt) + number(APPROVALREQ/aft_tot_stu_amt), '#,##0')"/></td>
							</tr>
						</table>
					</td>
				</tr>
			</table>

			<!-- [D]첨부파일 (시작) -->
			<table class="aproutertable" width="100%">
				<tr>
					<td class="head">첨부파일</td>
				</tr>
				<tr>
					<td class="body">
						<table class="aprinnertable" width="100%">
							<tr>
								<td width="15%" class="title2">첨부파일</td>
								<td width='85%' colspan='3' class='contant'>
									<table cellpadding="0" cellspacing="2" width="100%">

										<xsl:if test="vector/attach_fileno_a=''">
										<tr>
											<td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">
											</td>
										</tr>
										</xsl:if>
				
										<xsl:for-each select="APPROVALREQ/fileList_A/vector/data/msgXomxComAttachFileMS01">
										<tr>
											<td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">
												<a>
													<xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="attach_full_path"/>')</xsl:attribute>
													<xsl:value-of select="org_file"/>
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
			<!-- [D]첨부파일 (종료) -->

		</body>
	</xsl:template>
</xsl:stylesheet>
