<?xml version="1.0"?>
<!DOCTYPE xsl:stylesheet [ <!ENTITY nbsp "&#160;"> ]>
<xsl:stylesheet xmlns:LINS="snapshot.css" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
	xmlns:fo="http://www.w3.org/1999/XSL/Format">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/APPROVAL">
		<xsl:variable name="localPath" select="request/localPath" />
			<body>
				<!-- [B]과제정보 (시작) -->
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">과제정보</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width='15%' class='title2'>과제명</td>
									<td width='42%' class='contant' colspan='3'>
										<xsl:value-of select="prj_nm" />
									</td>
									<td width='15%' class='title2'>연구책임자(부서)</td>
									<td width='28%' class='contant'>
										<xsl:value-of select="resch_rspns" />(<xsl:value-of select="dept_nm" />)
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>사업분류</td>
									<td width='42%' class='contant' colspan='3'>
										<xsl:value-of select="bsns_cd_detls_nm" />
									</td>
									<td width='15%' class='title2'>실무자</td>
									<td width='25%' class='contant'>
										<xsl:value-of select="affair_charg" />
									</td>
								</tr>
								<tr>
									<td class='title2'>장비명(국문)</td>
									<td class='contant' colspan='3'>
										<xsl:value-of select="equip_nm" />
									</td>
									<td class='title2'>장비명(영문)</td>
									<td class='contant'>
										<xsl:value-of select="equip_nm_eng" />
									</td>
								</tr>
								<tr>
									<td class='title2'>제작사/모델</td>
									<td class='contant' colspan='3'>
										<xsl:value-of select="mfg_vend" />
										/
										<xsl:value-of select="modl_nm" />
									</td>
									<td class='title2'>구축장소</td>
									<td class='contant'>
										<xsl:value-of select="instl_plce" />
									</td>
								</tr>
								<tr>
									<td class='title2'>발주예정일</td>
									<td class='contant' colspan='3'>
										<xsl:value-of select="demnd_schdl_start_ymd" />
										~
										<xsl:value-of select="demnd_schdl_cls_ymd" />
									</td>
									<td class='title2'>설치예정일</td>
									<td class='contant'>
										<xsl:value-of select="instl_schdl_start_ymd" />
										~
										<xsl:value-of select="instl_schdl_cls_ymd" />
									</td>
								</tr>
								<tr>
									<td width='15%' class='title2'>사전기획여부</td>
									<xsl:if test="bf_plan_yn = 'Y'">
										<td width='14%' class='contant-center'> O </td>
									</xsl:if>
									<xsl:if test="bf_plan_yn = 'N'">
										<td width='14%' class='contant-center'> X </td>
									</xsl:if>
									
									<td width='15%' class='title2'>수요조사여부</td>
									<xsl:if test="demnd_exam_yn = 'Y'">
										<td width='14%' class='contant-center'> O </td>
									</xsl:if>
									<xsl:if test="demnd_exam_yn = 'N'">
										<td width='14%' class='contant-center'> X </td>
									</xsl:if>
									
									<td width='15%' class='title2'>취득방법</td>
									<td width='28%' class='contant'>
										<xsl:value-of select="acq_way" />
									</td>
								</tr>
								
								<tr>
									<td width='15%' class='title2'>구축연구소(본부)</td>
									<td width='25%' class='contant'>
										<xsl:value-of select="instl_divsn_dept" />
									</td>
									
									<td  width='15%' class='title2'>장비책임자</td>
									<td  width='15%' class='contant'>
										<xsl:value-of select="equip_empnm" />
									</td>
									
									<td width='15%' class='title2'>구축금액</td>
									<td width='15%' class='contant-right'>
										<xsl:value-of select="format-number(instl_amt, '#,###')" />
									</td>
								</tr>
								
								<tr>
									<td class='title2' rowspan='2'>5대 중점 투자분야</td>
									<td class='contant' colspan='2'>
										<input type="checkbox" id="chk1">
											<xsl:if test="contains(five_imp_invst_fld, 'RBN001')">
												<xsl:attribute name="checked"> checked</xsl:attribute>
											</xsl:if>
											국가주도기술 핵심역량 확보
										</input>
									</td>
									<td class='contant' colspan='2'>
										<input type="checkbox" id="chk2">
											<xsl:if test="contains(five_imp_invst_fld, 'RBN002')">
												<xsl:attribute name="checked"> checked</xsl:attribute>
											</xsl:if>
											글로벌 이슈대응 연구개발 추진
										</input>
									</td>
									<td class='contant'>
										<input type="checkbox" id="chk3">
											<xsl:if test="contains(five_imp_invst_fld, 'RBN003')">
												<xsl:attribute name="checked"> checked</xsl:attribute>
											</xsl:if>
											기초과학 ·융합기술 연구개발 활성화
										</input>
									</td>
								</tr>
								<tr>
									<td class='contant' colspan='2'>
										<input type="checkbox" id="chk4">
											<xsl:if test="contains(five_imp_invst_fld, 'RBN004')">
												<xsl:attribute name="checked"> checked</xsl:attribute>
											</xsl:if>
											신산업 창출 핵심기술 개발강화
										</input>
									</td>
									<td class='contant' colspan='2'>
										<input type="checkbox" id="chk5">
											<xsl:if test="contains(five_imp_invst_fld, 'RBN005')">
												<xsl:attribute name="checked"> checked</xsl:attribute>
											</xsl:if>
											주력기간사업 기술 고도화
										</input>
									</td>
									<td class='contant'></td>
								</tr>
								<tr>
									<td class='title2' rowspan='2'>6T분야</td>
									<td width='13%' class='contant'>
										<input type="checkbox" id="chk6">
											<xsl:if test="contains(sixt_relat_tech, 'RAH001')">
												<xsl:attribute name="checked"> checked</xsl:attribute>
											</xsl:if>
											IT
										</input>
									</td>
									<td width='13%' class='contant'>
										<input type="checkbox" id="chk7">
											<xsl:if test="contains(sixt_relat_tech, 'RAH002')">
												<xsl:attribute name="checked"> checked</xsl:attribute>
											</xsl:if>
											BT
										</input>
									</td>
									<td width='13%' class='contant'>
										<input type="checkbox" id="chk8">
											<xsl:if test="contains(sixt_relat_tech, 'RAH003')">
												<xsl:attribute name="checked"> checked</xsl:attribute>
											</xsl:if>
											NT
										</input>
									</td>
									<td width='13%' class='contant'>
										<input type="checkbox" id="chk9">
											<xsl:if test="contains(sixt_relat_tech, 'RAH004')">
												<xsl:attribute name="checked"> checked</xsl:attribute>
											</xsl:if>
											ST
										</input>
									</td>
									<td width='13%' class='contant'>
										<input type="checkbox" id="chk10">
											<xsl:if test="contains(sixt_relat_tech, 'RAH005')">
												<xsl:attribute name="checked"> checked</xsl:attribute>
											</xsl:if>
											ET
										</input>
									</td>
								</tr>
								<tr>
									<td width='13%' class='contant'>
										<input type="checkbox" id="chk11">
											<xsl:if test="contains(sixt_relat_tech, 'RAH006')">
												<xsl:attribute name="checked"> checked</xsl:attribute>
											</xsl:if>
											CT
										</input>
									</td>
									<td width='12%' class='contant'>
										<input type="checkbox" id="chk12">
											<xsl:if test="contains(sixt_relat_tech, 'RAH007')">
												<xsl:attribute name="checked"> checked</xsl:attribute>
											</xsl:if>
											기타
										</input>
									</td>
									<td class='contant'></td>
									<td class='contant'></td>
									<td class='contant'></td>
								</tr>
								<tr>
									<td width='10%' class='title2'>키워드</td>
									<td width='30%' class='contant' colspan='2'>
										<xsl:value-of select="kwd_1" />
									</td>
									<td width='30%' class='contant' colspan='2'>
										<xsl:value-of select="kwd_2" />
									</td>
									<td width='40%' class='contant'>
										<xsl:value-of select="kwd_3" />
									</td>
								</tr>
							</table>
						</td>
					</tr>					
					<tr>
						<td colspan='2' class='contant'>
							<xsl:element name="a">
								<xsl:attribute name="href">
								<xsl:value-of select="addr" />
							</xsl:attribute>
								<xsl:attribute name="target">
								 _blank
							</xsl:attribute>
								연구장비도입심의요청서 바로가기
							</xsl:element>
						</td>
						<td colspan='4' class='contant'></td>
					</tr>
				</table>
				<!-- [B]과제정보 (종료) -->

				<!-- [F]첨부파일 (시작) -->
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 첨부파일</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<xsl:for-each select="fileList_A/vector/data/mdata">
							         <tr>
							          <td class='title2' width="16%">첨부파일</td>
							          <td class='contant' width="84%">
							            <a>
									  	  <xsl:attribute name="href">#</xsl:attribute>
										  <xsl:attribute name="onclick">downloadForXsl('<xsl:value-of select="attach_file_no"/>
										                                                <xsl:value-of select="seq"/>', 'XAA001');return false;</xsl:attribute>
										  <xsl:value-of select="file_nm" />                      
									    </a>
							          </td>
							         </tr>
							      </xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<!-- [F]첨부파일 (종료) -->

			</body>
	</xsl:template>

</xsl:stylesheet>
