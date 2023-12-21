<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<body>
			<script language="javascript">
				<![CDATA[
				function openEvidWindow(reqNo){
					var url = "http://evid.kitech.re.kr/sd/view?CLS=50&amp;amp;RESL_NO=" + reqNo + "&amp;amp;EMP_NO=" + reqNo;
					url = url.replaceAll("amp;","");
					window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
				}
				]]>
			</script>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr> 
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td width="15%" class='title2'>
										성 명(개인번호)
									</td>
									<td class="contant">
										<xsl:value-of select="root/nm" />
										(<xsl:value-of select="root/req_empno" />)
									</td>
									<td width="15%" class='title2'>직 급</td>
									<td class="contant">
										<xsl:value-of select="root/posi_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>부 서</td>
									<td class="contant">
										<xsl:value-of select="root/dept_nm" />
									</td>
									<td class='title2'>입원일</td>
									<td class="contant">
										<xsl:value-of select="root/entr_ymd" />
									</td>
								</tr>
								<tr>
									<td class='title2'>현주소</td>
									<td class="contant" colspan="3">
										(<xsl:value-of select="root/addr_postmt_no" />)
										<xsl:value-of select="root/addr_base" />
										<br />
										<xsl:value-of select="root/addr_detls" />
									</td>
								</tr>
								<tr>
									<td class='title2'>집전화</td>
									<td class="contant">
										<xsl:value-of select="root/home_tel" />
									</td>
									<td class='title2'>개인메일주소</td>
									<td class="contant">
										<xsl:value-of select="root/email" />
									</td>
								</tr>
								<tr>
									<td class='title2'>휴대전화</td>
									<td class="contant">
										<xsl:value-of select="root/mobile" />
									</td>
									<td class='title2'>이직(진학) 기관명</td>
									<td class="contant">
										<xsl:value-of select="root/trans_agncy_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>퇴직사유</td>
									<td class="contant">
										<xsl:value-of select="root/retire_resn_nm" />
									</td>
									<td class='title2'>퇴직희망일</td>
									<td class="contant">
										<xsl:value-of select="root/retire_hope_ymd" />
									</td>
								</tr>
								<!-- 기타인 경우 추가요청(이유애) -->
								<xsl:if test="root/occugrp_cd = 'HAA030'">
									<tr>
										<td class='title2'>활용책임자</td>
										<td class="contant">
											<xsl:value-of select="root/pruse_respn_psn_nm" />
										</td>
										<td class='title2'>종료예정일(계약만료일)</td>
										<td class="contant">
											<xsl:value-of select="root/contrct_cls_ymd" />
										</td>
									</tr>
								</xsl:if>
								<tr>
									<td class='title2'>업무인수인계자</td>
									<td class="contant">
										<xsl:value-of select="root/psn_nm" />
									</td>
									<td class='title2'>직급</td>
									<td class="contant">
										<xsl:value-of select="root/psn_posi_nm" />
									</td>
								</tr>
							</table>
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title' colspan="5">
										관련부서 확인사항
									</td>
								</tr>
								<tr>
									<td class='title'>확인사항</td>
									<td class='title'>반납여부</td>
									<td class='title'>업무담당</td>
									<td class='title'>담당자확인</td>
									<td class='title'>비고</td>
								</tr>
								<xsl:for-each select="root/humApyDeptChkVoList">
									<tr>
										<td class="contant">
											<xsl:value-of select="cd_nm" />
										</td>
										<td class="contant-center">
											<xsl:if test="contains(retrn_yn, 'Y')">
												반납
											</xsl:if>
											<xsl:if test="contains(retrn_yn, 'N')" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="mngmt_item_1" />
										</td>
										<td class="contant">
											<xsl:if test="affir_ymd != ''">
												<xsl:value-of select="substring(affir_ymd,0,5)" />
												-
												<xsl:value-of select="substring(affir_ymd,5,2)" />
												-
												<xsl:value-of select="substring(affir_ymd,7,2)" />
											</xsl:if>
										</td>
										<td class="contant">
											<xsl:value-of select="rmk" />
										</td>
									</tr>
								</xsl:for-each>

							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable" style="margin-bottom:6px;">
    				<tr>
						<td class="head">첨부파일</td>
					</tr>
				    <tr>
			     		<td class="body">
					     	<table width="100%" class="aprinnertable">							
								<tr>
									<td width="14%" class="title2">첨부파일번호</td>
									<td width="86%" class="title2">첨부파일명
										<a>
											<xsl:attribute name="href">javascript:biz.apr.previewFilePop('<xsl:value-of select="root/attachVo1/attach_file_no" />')</xsl:attribute>
											<img src="http://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/>
										</a>									
									</td>
								</tr>
							<xsl:for-each select="root/attachVo1">
								<tr>
									<td class="contant">
										<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA006')</xsl:attribute>
										<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq" />
									</td>
									<td class="contant">
										<a>
										<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA006')</xsl:attribute>
										<xsl:value-of select="file_nm"/><xsl:value-of select="seq" />
										</a>
										<xsl:if test="attach_file_no != ''">
											<a>
												<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of select="seq" />')</xsl:attribute>
												<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기" style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;"/>
											</a>
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