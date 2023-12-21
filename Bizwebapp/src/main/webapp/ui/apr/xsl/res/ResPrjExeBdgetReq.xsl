<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="APPROVALREQ">
		<xsl:variable name="localPath" select="request/localPath" />
	
			<body>
				<!-- 실행예산편성/변경 -->
				<!-- [B]계정정보 (시작) -->
				<table class="aproutertable" width="100%">
				
					<tr>
						<td class="head" />
					</tr>
					
					<tr>
						<td>
							<table class="aproutertable" width="100%">
								<tr>
									<td width="100%">
										<font color='#FF0000' face='굴림'>
											<b> <xsl:value-of select="drctText" /> </b>
										</font>
									</td>
								</tr>
								
								<tr>
									<td width='20%' align='left'>
										<font color='#444444' face='굴림'>
											<b> 계정정보</b>
										</font>
									</td>
									<td width='80%' align='right'>
										<font color='#444444' face='굴림'>
											<b>
												신청번호 :
												<xsl:value-of select="req_no" />
											</b>
										</font>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width='13%' class='title2'>계정번호</td>
									<td width='20%' class='contant'>
										<xsl:value-of select="accnt_no" />
									</td>
									<td width='13%' class='title2'>과제기간</td>
									<td width='20%' class='contant'>
										<xsl:value-of select="resch_prd_term" />
									</td>
									<td width='13%' class='title2'>계정상태</td>
									<td width='21%' class='contant'>
										<xsl:value-of select="accnt_state_nm" />
									</td>
								</tr>
								<tr>
									<td width='13%' class='title2'>계정구분</td>
									<td width='20%' class='contant'>
										<xsl:value-of select="accnt_clsf_nm" />
									</td>
									<td width='13%' class='title2'>사업구분</td>
									<td width='54%' colspan='3' class='contant'>
										<xsl:value-of select="bsns_cd_bsns_nm" />
									</td>
								</tr>
								<tr>
									<td width='13%' class='title2'>과제명</td>
									<td width='87%' colspan='5' class='contant'>
										<xsl:value-of select="prj_nm" />
									</td>
								</tr>
								<tr>
									<td width='13%' class='title2'>연구책임자</td>
									<td width='20%' class='contant'>
										<xsl:value-of select="resch_rspns_str" />
									</td>
									<td width='13%' class='title2'>직급</td>
									<td width='20%' class='contant'>
										<xsl:value-of select="curr_posi_nm" />
									</td>
									<td width='13%' class='title2'>소속</td>
									<td width='21%' class='contant'>
										<xsl:value-of select="curr_dept_nm" />
									</td>
								</tr>
								<tr>
									<td width='13%' class='title2'>계정책임자</td>
									<td width='20%' class='contant'>
										<xsl:value-of select="accnt_rspns_str" />
									</td>
									<td width='13%' class='title2'>직급</td>
									<td width='20%' class='contant'>
										<xsl:value-of select="posi_nm" />
									</td>
									<td width='13%' class='title2'>소속</td>
									<td width='21%' class='contant'>
										<xsl:value-of select="dept_nm" />
									</td>
								</tr>
								<xsl:if test="commit_yn = 'Y'">
									<tr>
										<td class='title2' colspan='6' style="color:red">※ 실행예산변경시 협약예산대비 [신설세목연구비]가 200만원이상일 경우 소연심 승인사항입니다.</td>
									</tr>
								</xsl:if>
							</table>
						</td>
					</tr>
				</table>
				<!-- [B]계정정보 (종료) -->
				
				<xsl:if test="bsns_yn = 'Y'">
					<table class="aproutertable" width="100%">
						<tr>
							<td align='right'>
								<font color='#444444' face='굴림'>
									<b>
										간접비 :
										<xsl:value-of select="indicost_rt_inp" />
									</b>
									<b>
										간접비 편성액 :
										<xsl:value-of select="indicost_amt" />
									</b>
								</font>
							</td>
						</tr>
					</table>
				</xsl:if>
				
				<!-- [C]실행예산정보 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">
							실행예산정보 (
							<xsl:value-of select="exec_bugt_seq" />
							)
						</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width='10%' class='title'>대비목</td>
									<td width='20%' class='title'>세부비목</td>
									<td width='11%' class='title'>협약예산</td>
									<td width='10%' class='title'>
										이전
										<br />
										실행예산
									</td>
									<td width='10%' class='title'>실행예산</td>
									<td width='10%' class='title'>
										집행금액
										<br />
										(원인금액포함)
									</td>
								</tr>
								<xsl:for-each select="GRIDLIST1A/vector/data/msgResBgAgree">
									<xsl:variable name="itmClsfNm" select="itm_clsf_nm" /> <!-- 현재노드의 대비목 -->
									<xsl:variable name="itmClsfNmPrev" select="../preceding::msgResBgAgree[1]/itm_clsf_nm" /> <!-- 이전노드의 대비목  -->
									
									<!-- 현재노드 내 대비목 명과 이전노드의 대비목명이 다르면 신규 소계생성 -->
									<xsl:if test="$itmClsfNm != $itmClsfNmPrev"> 
										<tr>
											<td width='30%' colspan='2' class='title'>소계</td>
											
											<td width='11%' class='contant-right'>
												<xsl:value-of select="format-number(sum(../../data/msgResBgAgree[itm_clsf_nm = $itmClsfNmPrev]/bg_agree_tot_sum), '#,##0')" />
											</td>  <!-- (소계)협약예산 -->
											
											<td width='10%' class='contant-right'>
												<xsl:value-of select="format-number(sum(../../data/msgResBgAgree[itm_clsf_nm = $itmClsfNmPrev]/pre_amt)               , '#,##0')" />
											</td>  <!-- (소계)이전실행예산 -->
											
											<td width='10%' class='contant-right'>
												<xsl:value-of select="format-number(sum(../../data/msgResBgAgree[itm_clsf_nm = $itmClsfNmPrev]/amt)                     , '#,##0')" />
											</td>  <!-- (소계)실행예산 -->
											
											<td width='10%' class='contant-right'>
												<xsl:value-of select="format-number(sum(../../data/msgResBgAgree[itm_clsf_nm = $itmClsfNmPrev]/enfrc_cause_amt) , '#,##0')" />
											</td>  <!-- (소계)집행금액<br/>(원인금액포함) -->
										</tr>
									</xsl:if>
									
									<tr>
										<xsl:if test="color='yellow'">
											<xsl:attribute name="style">color:blue;background-color:yellow;</xsl:attribute>
										</xsl:if>
										
										<xsl:if test="color='blue'">
											<xsl:attribute name="style">background-color:#B8F8FA;</xsl:attribute>
										</xsl:if>
										
										<td class='contant'>
											<xsl:value-of select="itm_clsf_nm" />
										</td>  <!-- 대비목 -->
										
										<td class='contant'>
											<xsl:value-of select="bugt_item_nm" />
										</td>  <!-- 세부비목 -->
										
										<td class='contant-right'>
											<xsl:value-of select="format-number(bg_agree_tot_sum, '#,##0')" />
										</td>  <!-- 협약예산 -->
										
										<td class='contant-right'>
											<xsl:value-of select="format-number(pre_amt                , '#,##0')" />
										</td>  <!-- 이전실행예산 -->
										
										<td class='contant-right'>
											<xsl:value-of select="format-number(amt                       , '#,##0')" />
										</td>  <!-- 실행예산 -->
										
										<td class='contant-right'>
											<xsl:value-of select="format-number(enfrc_cause_amt  , '#,##0')" />
										</td>  <!-- 집행금액<br/>(원인금액포함) -->
									</tr>
									
									<!-- 노드 내 순번이 마지막순번일경우, 최종 노드의 소계 생성 -->
									<xsl:if test="position()=last()"> 
										<tr>
											<td width='30%' colspan='2' class='title'>소계</td>
										
											<td width='11%' class='contant-right'>
												<xsl:value-of select="format-number(sum(../../data/msgResBgAgree[itm_clsf_nm = $itmClsfNm]/bg_agree_tot_sum), '#,##0')" />
											</td>  <!-- (소계)협약예산 -->
										
											<td width='10%' class='contant-right'>
												<xsl:value-of select="format-number(sum(../../data/msgResBgAgree[itm_clsf_nm = $itmClsfNm]/pre_amt)               , '#,##0')" />
											</td>  <!-- (소계)이전실행예산 -->
										
											<td width='10%' class='contant-right'>
												<xsl:value-of select="format-number(sum(../../data/msgResBgAgree[itm_clsf_nm = $itmClsfNm]/amt)                      , '#,##0')" />
											</td>  <!-- (소계)실행예산 -->
										
											<td width='10%' class='contant-right'>
												<xsl:value-of select="format-number(sum(../../data/msgResBgAgree[itm_clsf_nm = $itmClsfNm]/enfrc_cause_amt) , '#,##0')" />
											</td>  <!-- (소계)집행금액<br/>(원인금액포함) -->
										</tr>
									</xsl:if>
								</xsl:for-each>
								
								<tr>
									<td width='30%' colspan='2' class='title'>합계</td>
									
									<td width='11%' class='contant-right'>
										<xsl:value-of select="format-number(tot_bg_agree_tot_sum, '#,##0')" />
									</td>  <!-- (합계)협약예산 -->
									
									<td width='10%' class='contant-right'>
										<xsl:value-of select="format-number(tot_pre_amt                , '#,##0')" />
									</td>  <!-- (합계)실행예산 -->
									
									<td width='10%' class='contant-right'>
										<xsl:value-of select="format-number(tot_amt                       , '#,##0')" />
									</td>  <!-- (합계)실행예산 -->
									
									<td width='10%' class='contant-right'>
										<xsl:value-of select="format-number(tot_enfrc_cause_amt   , '#,##0')" />
									</td>  <!-- (합계)집행금액<br/>(원인금액포함) -->
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<!-- [C]실행예산정보 (종료) -->
				
				<!-- [D]변경사유 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">변경사유</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width='13%' class='title2'>변경사유</td>
									<td width='87%' class='contant'>
										<xsl:value-of select="resn_contnt" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<!-- [D]변경사유 (종료) -->
				<!-- [E]첨부파일 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">첨부파일</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width='13%' class='title2'>첨부파일</td>
									<td width='87%' colspan='3' class='contant'>
										<table cellpadding="0" cellspacing="2" width="100%">
												<tr>
													<td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;" />
												</tr>
											<xsl:for-each select="fileList_A/vector/data/mdata">
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
				<!-- [E]첨부파일 (종료) -->
			</body>
	</xsl:template>
</xsl:stylesheet>
