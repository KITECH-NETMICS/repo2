<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:LINS="http://www.inswave.com/LINS">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<xsl:variable name="localPath" select="localPath" />
			<BODY>
				<script language="javascript"> <![CDATA[
					function createForm(nm, tg, act, met) {
						var cForm = document.createElement("form");
						cForm.name = nm;
						cForm.target = tg;
						cForm.action = act;
						cForm.method = met;
						
						return cForm;
					}
					
					function createHidden(nm, val, frm) {
						/*IE9, IE10, 크롬 등에서 호환성 보기 없이 실행되도록 보완(2013.07.29)*/
						var	hiddenInput	=	document.createElement("input");

						hiddenInput.setAttribute("type", "hidden");
						hiddenInput.setAttribute("name", nm);
						hiddenInput.setAttribute("value", val);
						frm.appendChild(hiddenInput);
						
						return frm;
					}
					
					function openFilePop (attachFileNo) {
						window.open("","smlRvew",'width=616,height=119,top=150,left=150');
						var frm = createForm("popFrm", "smlRvew", "https://biz.kitech.re.kr/websquare/popup.html", "get");
						frm = createHidden("w2xPath", "/kitech/res/twe/ResGridAttachPop.xml", frm);
						frm = createHidden("popupID", "smlRvew", frm);
						frm = createHidden("w2xHome", "/kitech/res/twe/", frm);
						frm = createHidden("attach_file_no", attachFileNo, frm);
						document.body.appendChild(frm);
						frm.submit();
					}
				]]></script>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body" colspan="2">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="15%">신청번호 </td>
									<td class="contant-center" width="30%">
										<xsl:value-of select="request/APPROVAL/req_no" />
									</td>
									<td class='title2'>작성자 / 작성일자</td>
									<td class="contant">
										<xsl:value-of select="request/APPROVAL/regst_nm" /> / 
										<xsl:value-of select="substring(request/APPROVAL/regst_ymd, 1, 4)" />
										-
										<xsl:value-of select="substring(request/APPROVAL/regst_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(request/APPROVAL/regst_ymd, 7, 2)" />
									</td>
								</tr>
								<tr>
									<td class='title2'>제목</td>
									<td class="contant" colspan='3'>
										<xsl:value-of select="request/APPROVAL/rvew_sbj" />
									</td>
								</tr>
								<tr>
									<td class='title2'>일자 </td>
									<td class="contant-center">
										<xsl:value-of select="request/APPROVAL/rvew_seq" /> 차 /
										<xsl:value-of select="substring(request/APPROVAL/rvew_ymd, 1, 4)" />
										-
										<xsl:value-of select="substring(request/APPROVAL/rvew_ymd, 5, 2)" />
										-
										<xsl:value-of select="substring(request/APPROVAL/rvew_ymd, 7, 2)" />
									</td>
									<td class='title2'>개최방식</td>
									<xsl:choose>
										<xsl:when test="open_way ='FEI001'"> <td class="contant-center"> 대면</td> </xsl:when>
										<xsl:otherwise> <td class="contant"> 서면</td> </xsl:otherwise>
									</xsl:choose>
								</tr>
								<tr>
									<td class='title2'>장소 </td>
									<td class="contant">
										<xsl:value-of select="request/APPROVAL/rvew_plc" />
									</td>
									<td class='title2'>지역본부</td>
									<td class="contant">
										<xsl:value-of select="request/APPROVAL/dept_typ_nm" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 안건내역 </td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="10%">안건구분</td>
									<td class='title2'>소제목</td>
									<td class="title2">제안사유</td>
									<td class='title2'>첨부파일</td>
								</tr>
								<xsl:for-each select="request/APPROVAL/doc1/vector/data/msgResSmlRvewItemMS01">
									<tr>
										<td class="contant">
											<xsl:value-of select="item_clsf_seq" />
										</td>
										<td class="contant">
											<xsl:value-of select="rvew_sml_sbj" />
										</td>
										<td class="contant">
											<xsl:value-of select="propsl_cause" />
										</td>
										<td class="contant-center">
											<a>
												<xsl:attribute name="href">javascript:openFilePop('<xsl:value-of select="attach_file_no" />')</xsl:attribute>
												<xsl:value-of select="attach_file_no" />
											</a>
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<br/>
			</BODY>
	</xsl:template>
</xsl:stylesheet>