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
						<td class="head">신청정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr>
									<td class="title2">신청번호</td>
									<td width="22%" class="contant">
										<xsl:value-of select="request/updateInfo/apr_req_no" />
									</td>
									<td class="title2">신청자</td>
									<td width="22%" class="contant">
										<xsl:value-of select="request/updateInfo/apr_psn_nm" />
									</td>
									<td class="title2">신청부서</td> 
									<td width="22%" class="contant">
										<xsl:value-of select="request/updateInfo/apr_dept_nm" />
									</td>
									<td class="title2">신청일자</td>
									<td width="22%" class="contant">
										<xsl:value-of select="request/updateInfo/apr_req_ymd" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">사용문서정보</td>
					</tr>
					<tr>
						 <td class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td class="title2">문서번호</td>
									<td width="35%" class="contant">
										<xsl:value-of select="request/updateInfo/apr_docu_no" />
									</td>
									<td class="title2">계인</td>
									<td width="35%" class="contant">
										<xsl:value-of select="request/updateInfo/apr_seal_clsf" />
									</td>
									<td class="title2">부수</td>
									<td width="30%" class="contant">
										<xsl:value-of select="request/updateInfo/apr_qty" />
									</td>
								</tr>
								<tr>
									<td class="title2">최종결재</td>
									<td width="35%" class="contant">
										<xsl:value-of select="request/updateInfo/apr_final_apprvl_psn" />
									</td>
									<td class="title2">수신처</td>
									<td width="65%" class="contant">
										<xsl:value-of select="request/updateInfo/apr_recv_loc" />
									</td>
								</tr>
								<tr>
									<td class="title2">문서제목</td>
									<td class="contant" colspan="5">
										<xsl:value-of select="request/updateInfo/apr_docu_subj" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">첨부파일</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td class="title2">첨부파일</td>
									<td class="contant" width="84%">
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
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">전달정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td class="title2">전달방법</td>
									<td width="35%" class="contant">
										<xsl:value-of select="request/updateInfo/apr_premnth_way" />
									</td>
									<td class="title2">주소</td>
									<td width="65%" class="contant">
										()<xsl:value-of select="request/updateInfo/apr_addr_clsf" />)
										<xsl:value-of select="request/updateInfo/apr_addr" />
									</td>
								</tr>
								<tr>
									<td class="title2">용도</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="request/updateInfo/apr_rmk" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				</form>
				<iframe name="ifr" height="0" width="0"></iframe>
			</BODY>
	</xsl:template>
</xsl:stylesheet>