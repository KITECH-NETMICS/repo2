<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
	<xsl:variable name="localPath" select="1" />
	<body>
		 <script language="javascript"><![CDATA[
			function createHidden(nm, val, frm) {
				/*IE9, IE10, 크롬 등에서 호환성 보기 없이 실행되도록 보완(2013.07.29)*/
				var	hiddenInput	=	document.createElement("input");

				hiddenInput.setAttribute("type", "hidden");
				hiddenInput.setAttribute("name", nm);
				hiddenInput.setAttribute("value", val);
				frm.appendChild(hiddenInput);
				return frm;
			}
		 ]]></script>
			<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
				<tr>
					<td class="head">신청정보</td>
				</tr>
				<tr>
					<td class="body">
						<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
							<tr>
								<td class="title2">작성자</td>
								<td width="16%" class="contant-center">
									<xsl:value-of select="request/APPROVAL/req_psn_nm" />
								</td>
								<td class="title2">소속</td>
								<td width="16%" class="contant-center">
									<xsl:value-of select="request/APPROVAL/req_psn_dept_nm" />
								</td>
								<td class="title2">신청일자</td>
								<td width="16%" class="contant-center">
									<xsl:value-of select="request/APPROVAL/slip_tmd_pd" />
								</td>
								<td class="title2">신청번호</td>
								<td width="16%" class="contant-center">
									<xsl:value-of select="request/APPROVAL/req_no" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<table width="100%" class="aproutertable">
				<tr>
					<td class="head">출금결의현황</td>
				</tr>
				<tr>
					<td class="body">
						<table width="100%" class="aprinnertable">
							<tr>
								<td width="6%" class="title">순번</td>
								<td width="40%" class="title">적요</td>
								<td width="22%" class="title">지불처</td>
								<td width="10%" class="title">확정결의번호</td>
								<td width="10%" class="title">출금결의번호</td>
								<td width="12%" class="title">지불금액</td>
							</tr>
							<xsl:for-each select="request/APPROVAL/doc1/vector/data">
								<tr>
									<td class="contant-center">
										<xsl:value-of select="mdata/req_seq" />
									</td>
									<td class="contant-center">
										<xsl:value-of select="mdata/rmk" />
									</td>
									<td class="contant-center">
										<xsl:value-of select="mdata/vend_nm" />
									</td>
									<td class="contant-center">
										<xsl:value-of select="mdata/slip_no2" />
									</td>
									<td class="contant-center">
										<xsl:value-of select="mdata/pslip_no" />
									</td>
									<td class="contant-right">
										<xsl:value-of select="format-number(mdata/amt,'#,###,###,###,###,###')" />
									</td>
								</tr>
							</xsl:for-each>
							<tr>
								<td class="title" colspan="5">합계</td>
								<td class="contant-right"><xsl:value-of select="format-number(request/APPROVAL/totl_amt,'#,###,###,###,###,###')"/></td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</body>
	</xsl:template>
</xsl:stylesheet>
