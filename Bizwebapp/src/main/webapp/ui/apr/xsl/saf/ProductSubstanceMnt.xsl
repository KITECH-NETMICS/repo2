<?xml version="1.0"?>
<!DOCTYPE xsl:stylesheet [ <!ENTITY nbsp "&#160;"> ]>
<xsl:stylesheet xmlns:LINS="snapshot.css" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:fo="http://www.w3.org/1999/XSL/Format">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="request/localPath" />
			<BODY>
				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">화학제품등록</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">
								<tr>
									<td width="20%" class="title2">제품코드</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/prduct_cd" />
									</td>

									<td width="20%" class="title2">등록자</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/regist_mn" />
									</td>

								</tr>
								<tr>
									<td width="20%" class="title2">제품명</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/prduct_nm" />
									</td>
									<td width="20%" class="title2">공급망</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/suply_cmpny" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">제조사</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/makr_cmpny" />
									</td>
									<td width="20%" class="title2">혼합물여부</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/mixtr_mttr_cd_nm" />
									</td>
								</tr>
								<tr>
									<td width="20%" class="title2">용량</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/cpcty_qty" />
									</td>
									<td width="20%" class="title2">등록일자</td>
									<td width="30%" class="contant">
										<xsl:value-of select="APPROVAL/purchs_date" />
									</td>
									
								</tr>
								<tr>
									<td class="title2">MSDS 파일</td>
									<td colspan="3" class="contant">
										<xsl:for-each select="APPROVAL/fileList_A/vector/data/mdata">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl("<xsl:value-of select='attach_file_no' /><xsl:value-of select='seq' />","XAA015")</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
											<br />
										</xsl:for-each>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table class="aproutertable" width="100%">
					<tr>
						<td class="head">화학물질정보</td>
					</tr>
					<tr>
						<td class="body">
							<table class="aprinnertable" width="100%">

								<tr>
									<td width="25%" class="title">화학물질명</td>
									<td width="25%" class="title">CAS번호</td>
									<td width="25%" class="title">함유량</td>
									<td width="25%" class="title">규제</td>
								</tr>
								<xsl:for-each select="APPROVAL/doc/vector/data/msgCsfSpaceUserMS02">
									<tr>
										<td width="25%" class="contant-center">
											<xsl:value-of select="chmcls_nm_kr" />
										</td>
										<td width="25%" class="contant-center">
											<xsl:value-of select="cas_no" />
										</td>
										<td width="25%" class="contant-center">
											<xsl:value-of select="cnamt" />
										</td>
										<td width="25%" class="contant-center">
											<xsl:value-of select="regl" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
			</BODY>
	</xsl:template>
</xsl:stylesheet>
