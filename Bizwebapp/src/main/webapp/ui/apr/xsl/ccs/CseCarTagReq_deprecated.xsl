<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
			<BODY>
				<form name="frmXsl" target="blank" action="http://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
					<INPUT type="hidden" name="FilePath" size="25" />
					<INPUT type="hidden" name="orgFileName" size="25" />	
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
				    <tr>
					     <td class="body">
					     	<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
      							<tr>
									<td width="15%" rowspan="2" class="title2">소속</td>
									<td width="20%" rowspan="2" class="contant">
										<xsl:value-of
											select="request/updateInfo/issu_dept_nm" />
									</td>
									<td width="10%" class="title2">직급</td>
									<td width="20%" class="contant">
										<xsl:value-of
											select="request/updateInfo/issu_psn_posi_cd_nm2" />
									</td>
									<td width="10%" rowspan="2" class="title2">성명</td>
									<td width="20%" rowspan="2" class="contant">
										 <xsl:value-of
											select="request/updateInfo/issu_psn_nm" />
									</td>
								</tr>
								<tr>
									<td class="title2">직위</td>
									<td class="contant">
										<xsl:value-of
											select="request/updateInfo/issu_psn_posi_cd_nm1" />
									</td>
								</tr>
								<tr>
									<td class="title2">주민등록번호</td>
									<td colspan="5" class="contant">
										<xsl:value-of
											select="request/updateInfo/resid_no" />
									</td>
								</tr>
								<tr>
									<td class="title2">채용기간 또는 <br>근무기간</br></td>
									<td colspan="3" class="contant">
										<xsl:value-of
											select="request/updateInfo/work_start_yyyy" />년
										<xsl:value-of
											select="request/updateInfo/work_start_mm" />월
										<xsl:value-of
											select="request/updateInfo/work_start_dd" />일부터
										<xsl:value-of
											select="request/updateInfo/work_cls_yyyy" />년
										<xsl:value-of
											select="request/updateInfo/work_cls_mm" />월
										<xsl:value-of
											select="request/updateInfo/work_cls_dd" />일까지
									</td>
									<td class="title2">신청번호</td>
									<td class="contant">
										<xsl:value-of
											select="request/updateInfo/req_no" />
									</td>
								</tr>
								<tr>
									<td class="title2">개인번호(해당자)</td>
									<td colspan="3" class="contant">
										<xsl:value-of
											select="request/updateInfo/syspayno_emp" />
									</td>
									<td class="title2">구분</td>
									<td class="contant">
										<xsl:if test="contains(request/updateInfo/req_clsf, 'CSL001')">
											신규
										</xsl:if>
										<xsl:if test="contains(request/updateInfo/req_clsf, 'CSL002')">
											불량
										</xsl:if>
										<xsl:if test="contains(request/updateInfo/req_clsf, 'CSL003')">
											재발급
										</xsl:if>
									</td>									
								</tr>
								<tr>
									<td class="title2">재발급(변경)<br>요청사유</br></td>
									<td colspan="5" class="contant">
										<xsl:value-of
											select="translate(request/updateInfo/apr_req_resn, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />
									</td>
								</tr>
								<tr>
									<td class="title2">전화번호</td>
									<td colspan="3" class="contant">
										<xsl:value-of
											select="request/updateInfo/tel_no" />
									</td>
									<td rowspan="2" class="title2">사무실(호실)</td>
									<td rowspan="2" colspan="1" class="contant">
										<xsl:value-of
											select="request/updateInfo/issu_psn_ofic" />
									</td>
								</tr>
								<tr>
									<td class="title2">휴대폰</td>
									<td colspan="3" class="contant">
										<xsl:value-of
											select="request/updateInfo/mobile_no" />
									</td>
								</tr>
								<tr>
									<td class="title2">차량번호</td>
									<td class="contant">
										<xsl:value-of
											select="request/updateInfo/car_no" />
									</td>
									<td class="title2">차종</td>
									<td class="contant">
										<xsl:value-of
											select="request/updateInfo/car_knd" />
									</td>
									<td class="title2">색상</td>
									<td class="contant">
										<xsl:value-of
											select="request/updateInfo/car_clr" />
									</td>
								</tr>
								<tr>
									<td class="title2">첨부파일</td>
									<td colspan='5' class="contant">
										<xsl:for-each select="request/updateInfo/fileList_A/vector/data/msgXomxComAttachFileMS01">
											<a>
												<xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="full_path" />')</xsl:attribute>
												<xsl:value-of select="org_file" /><br/>
											</a>
										</xsl:for-each>
									</td>
								</tr>															
							</table>
						</td>
					</tr>
				</table>
				<tr>
					<td height="10px"></td>
				</tr>
				 <table class="aproutertable" width="100%">
					<tr>
				      <td class="body">
				        <table class="aprinnertable" width="100%">
				          <tr>
							<td class="contant">
							※자동차 등록증 사본 1부
							</td>
						  </tr>
				        </table>
				      </td>
				    </tr>
				  </table>				
				</form>
				<iframe name="ifr" height="0" width="0"></iframe>
			</BODY>
			<script language="javascript">
			<![CDATA[
   			]]>
			</script>
	</xsl:template>
</xsl:stylesheet>