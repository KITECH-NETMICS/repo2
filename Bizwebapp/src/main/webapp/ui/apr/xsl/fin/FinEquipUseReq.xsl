<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
<xsl:template match="/">
<xsl:variable name="localPath" select="request/localPath"/>
	 <body>
	 <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
	    <tr>
		<td class="body">
			 <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
						<tr>
							<td width="12%" class='title2'>신청번호</td>
							<td width="21%" class="contant-center"><xsl:value-of select="APPROVAL/doc1/msgEquipUseReq01/req_no"/><br/></td>
							<td width="12%" class='title2'>신청부서</td>
							<td width="22%" class="contant"><xsl:value-of select="APPROVAL/doc1/msgEquipUseReq01/dept_nm"/><br/></td>
							<td width="12%" class='title2'>신청일자</td>
							<td width="21%" class="contant-center"><xsl:value-of select="substring(APPROVAL/doc1/msgEquipUseReq01/req_ymd, 0,5)"/>-<xsl:value-of select="substring(APPROVAL/doc1/msgEquipUseReq01/req_ymd, 5, 2)"/>-<xsl:value-of select="substring(APPROVAL/doc1/msgEquipUseReq01/req_ymd, 7, 2)"/><br/></td>
						</tr>
						<tr> 
							<td class='title2'>계정번호</td>
							<td class="contant" colspan="3">
								<xsl:value-of select="APPROVAL/doc1/msgEquipUseReq01/accnt_no"/>
								<!-- xsl:text disable-output-escaping="yes"><![CDATA[&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;]]></xsl:text> -->
								( <xsl:value-of select="APPROVAL/doc1/msgEquipUseReq01/accnt_no_nm"/> )<br/>
							</td>								
							<td class='title2'>계정책임자</td>
							<td class="contant-center"><xsl:value-of select="APPROVAL/doc1/msgEquipUseReq01/accnt_rspns_nm"/><br/></td>
				
						</tr>
						<tr>
							<td class='title2'>신청자</td>
							<td class="contant-center"><xsl:value-of select="APPROVAL/doc1/msgEquipUseReq01/req_nm"/><br/></td>
							<td class='title2'>결의번호</td>
							<td class="contant-center"><xsl:value-of select="APPROVAL/doc1/msgEquipUseReq01/unslip_no"/><br/></td>
							<td class='title2'>통제번호</td>
							<td class="contant-center">
								<xsl:attribute name="id">
									<xsl:text>ctrlNo1</xsl:text>
								</xsl:attribute>
								<xsl:value-of select="APPROVAL/doc1/msgEquipUseReq01/ctrl_no"/><br/>
							</td>
						</tr>
						<tr>
							<td class='title2'>비고</td>
							<td class="contant" colspan="5"><xsl:value-of select="APPROVAL/doc1/msgEquipUseReq01/rmk"/><br/></td>
						</tr>
						<tr>
							<td class='title2'>신청금액</td>
							<td class="contant-right">
								<xsl:value-of select="format-number(APPROVAL/doc1/msgEquipUseReq01/req_amt, '#,###')"/><br/>
							</td>
							<td class='title2'>통제금액</td>
							<td class="contant-right">
								<xsl:attribute name="id">
									<xsl:text>reqAmt1</xsl:text>
								</xsl:attribute>
								<xsl:value-of select="format-number(APPROVAL/doc1/msgEquipUseReq01/ctrl_amt, '#,###')"/><br/>
							</td>
							<td class="contant" colspan="2"><br/></td>
						</tr>
						<tr>
							<td class='title2'>수선충담금율</td>
							<td class="contant-right"><xsl:value-of select="format-number(APPROVAL/doc1/msgEquipUseReq01/appro_mny_rt, '##0.00')"/><br/></td>
							<td class='title2'>수입비율</td>
							<td class="contant-right"><xsl:value-of select="format-number(APPROVAL/doc1/msgEquipUseReq01/impt_rt, '##0.00')"/><br/></td>
							<td class="contant" colspan="2"><br/></td>
							
						</tr>
					</table>
				</td>
		    </tr>
		</table>
					<p/>
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
		<tr>
		<td class="body">
			<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
				<tr>
					<td width="5%"  class='title'>순번</td>
					<td width="12%" class='title'>장비번호</td>
					<td width="20%" class='title'>장비명</td>
					<td width="29%" class='title'>사용일자</td>
					<td width="8%"  class='title'>사용시간</td>
					<td width="8%"  class='title'>사용단가</td>
					<td width="8%"  class='title'>사용금액</td>
				</tr>
				<xsl:for-each select="APPROVAL/doc2/SELECTGRIDLIST/vector/data">
				<tr>
					<td  class="contant-center"><xsl:value-of select="msgFspEquipDMS01/use_odr"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspEquipDMS01/equip_no"/><br/></td>
					<td  class="contant"><xsl:value-of select="msgFspEquipDMS01/asset_name"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="substring(msgFspEquipDMS01/use_start_ymd, 0,5)"/>-<xsl:value-of select="substring(msgFspEquipDMS01/use_start_ymd, 5, 2)"/>-<xsl:value-of select="substring(msgFspEquipDMS01/use_start_ymd, 7, 2)"/>
							
						<xsl:value-of select="msgFspEquipDMS01/use_start_time"/>
							~
						<xsl:value-of select="substring(msgFspEquipDMS01/use_cls_ymd, 0,5)" />-<xsl:value-of select="substring(msgFspEquipDMS01/use_cls_ymd, 5, 2)" />-<xsl:value-of select="substring(msgFspEquipDMS01/use_cls_ymd, 7, 2)" />
							
						<xsl:value-of select="msgFspEquipDMS01/use_cls_time"/>
						</td>
					<td  class="contant-right"><xsl:value-of select="msgFspEquipDMS01/use_time"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="format-number(msgFspEquipDMS01/use_unit_price, '#,###')"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="format-number(msgFspEquipDMS01/use_amt, '#,###')"/><br/></td>
				</tr>
				</xsl:for-each>
			</table>
		</td>
	    </tr>
	</table>
	</body>
</xsl:template>
</xsl:stylesheet>