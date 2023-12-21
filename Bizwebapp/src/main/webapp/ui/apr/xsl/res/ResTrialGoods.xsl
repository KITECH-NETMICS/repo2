<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:LINS="http://www.inswave.com/LINS">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/APPROVAL">
		<xsl:variable name="localPath" select="localPath" />
		<html lang="kr">
			<BODY>
				<script language="javascript"><![CDATA[ 
					/* 사진화일  */
					function openPhotoFile (photoFileNo) {
						var photoUrl = "https://biz.kitech.re.kr/bizimages/res/attach/"+photoFileNo;	
						window.open(photoUrl, "", "width=1024, height=768, toolbar=no, menubar=no, resizable=yes, titlebar=yes");
					}
				]]></script>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body" colspan="2">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2'>신청번호</td>
									<td class="contant-center">
										<xsl:value-of select="req_no" />
									</td>
									<td class='title2'>신청일자</td>
									<td class="contant-center">
										<xsl:value-of select="substring(regst_date, 1, 4)" />
										-
										<xsl:value-of select="substring(regst_date, 5, 2)" />
										-
										<xsl:value-of select="substring(regst_date, 7, 2)" />
									</td>
									<td class='title2'>신청자</td>
									<td class="contant-center">
										<xsl:value-of select="regst_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>시작품명 </td>
									<td class="contant" colspan='5'>
										<xsl:value-of select="item_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>사용자 </td>
									<td class="contant">
										<xsl:value-of select="nm" />
										(
										<xsl:value-of select="empno" />
										)
									</td>
									<td class='title2'>사용자부서</td>
									<td class="contant" colspan='3'>
										<xsl:value-of select="dept_nm" />
									</td>
								</tr>
								<tr>
									<td class='title2'>계약업체 </td>
									<td class="contant">
										<xsl:value-of select="vend_abbr" />
									</td>
									<td class='title2'>구입금액 </td>
									<td class="contant-right">
										<xsl:value-of select="format-number(intro_amt, '#,###.##')" />
									</td>
									<td class='title2'>화페단위</td>
									<td class="contant">
										<xsl:value-of select="curncy_unit" />
									</td>
								</tr>
								<tr>
									<td class='title2'>도입방법 </td>
									<td class="contant">
										<xsl:value-of select="intro_way" />
									</td>
									<td class='title2'>위치</td>
									<td class="contant" colspan='3'>
										<xsl:value-of select="posi_region" />
										/
										<xsl:value-of select="posi_build" />
										/
										<xsl:value-of select="posi_floor" />
										/
										<xsl:value-of select="posi_detls" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 관련 시제품 및 재료내역 </td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2'>순번</td>
									<td class='title2'>계정번호</td>
									<td class='title2'>비용코드</td>
									<td class="title2">품명</td>
									<td class='title2'>구입금액</td>
									<td class='title2'>계약업체</td>
									<td class='title2'>설치장소</td>
								</tr>
								<xsl:for-each select="doc1/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="msgResTrialGoodsDetlMS01/req_seq" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgResTrialGoodsDetlMS01/accnt_no" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgResTrialGoodsDetlMS01/expns_cd" />
										</td>
										<td class="contant">
											<xsl:value-of select="msgResTrialGoodsDetlMS01/item_nm" />
										</td>
										<td class="contant-right">
											<xsl:value-of select="format-number(msgResTrialGoodsDetlMS01/contrct_amt, '#,###.##')" />
										</td>
										<td class="contant">
											<xsl:value-of select="msgResTrialGoodsDetlMS01/contrct_vend" />
										</td>
										<td class="contant">
											<xsl:value-of select="msgResTrialGoodsDetlMS01/instl_plc" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				
				<xsl:if test="attach_file_no != ''">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="head" >사진파일</td>
						</tr>
						<tr>
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class="contant">
										<a>
											<xsl:attribute name="href">javascript:openPhotoFile("<xsl:value-of select='attach_file_no' />")</xsl:attribute>
											<xsl:value-of select="attach_file_no"></xsl:value-of>
										</a>
									</td>
								</tr>
							</table>
						</tr>
					</table>
				</xsl:if>
			</BODY>
		</html>
	</xsl:template>
</xsl:stylesheet>