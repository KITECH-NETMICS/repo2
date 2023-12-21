<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
 	<xsl:variable name="localPath" select="1" />
	<body>
		 <script language="javascript"><![CDATA[
				function openFilePop (confNm) {
					var url = "https://biz.kitech.re.kr//filter/index.jsp?serviceid=JA68&conf_nm="+ confNm;
					url = url.replace(/amp;amp;/g,"");
					window.open(url, "_blank","scrollbars=yes,toolbar=no,location=no,status=no,menubar=no,resizable=yes,width=1200,height=385,left=250,top=150");
				}
		 ]]></script>
       
        <table class="aproutertable" width="100%">
          <tr>
          	<td>
	          	<table class="aproutertable" width="100%">
	            <td width='20%' align='left' ><font color='#444444' face='굴림'><b>학술대회Pool관리</b></font></td>
	            <td width='80%' align='right'>
					<a>
						<xsl:attribute name="href">javascript:openFilePop('<xsl:value-of select="request/saveInfo/conf_nm" />')</xsl:attribute>
						<span><font color='blue' face='굴림'><b>국제학회Pool 등록 현황 조회</b></font></span>
					</a>
				</td>
				</table>
			</td>
          </tr>
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
              	<tr>
                  <td width='20%' class='title2'>등록번호</td>
                  <td width="30%" class="contant" colspan="2"> <xsl:value-of select="request/saveInfo/rcpt_no" /></td>
                  <td width='20%' class='title2'>관련년도</td>
                  <td width="30%" class="contant" colspan="2"> <xsl:value-of select="request/saveInfo/yr" /></td>
                  
                </tr> 
                <tr>
                  <td width='20%' class='title2'>신청인(추천인)</td>
                  <td width="30%" class="contant" colspan="2"> <xsl:value-of select="request/saveInfo/recomm_psn" /></td>
                  <td width='20%' class='title2'>심의담당자</td>
                  <td width="30%" class="contant" colspan="2"> <xsl:value-of select="request/saveInfo/chrg_nm" /></td>
                </tr>              
                <tr>
                  <td width='20%' class='title2'>국가과학기술표준분류</td>
                  <td width="30%" class="contant" colspan="2"> <xsl:value-of select="request/saveInfo/scitech_nm" /></td>
				  <td width='20%' class='title2'>연구분야</td>
                  <td width="30%" class="contant" colspan="2"> <xsl:value-of select="request/saveInfo/rscharea" /></td>
                  
                </tr>                   
                <tr>
                  <td width='20%' class='title2'>개최학회(기관)명/영문</td>
                  <td width="30%" class="contant" colspan="2"><xsl:value-of select="request/saveInfo/society_nm_en" /></td>
                  <td width='20%' class='title2'>개최학회(기관)명/한글</td>
                  <td width="30%" class="contant" colspan="2"><xsl:value-of select="request/saveInfo/society_nm_ko" /></td>
                </tr>                   
                <tr>
                  <td width='20%' class='title2'>학술대회명</td>
                  <td width="30%" class="contant" colspan="2"><xsl:value-of select="request/saveInfo/conf_nm" /></td>
                  <td width='20%' class='title2'>학술대회명(약어)</td>
                  <td width="30%" class="contant" colspan="2"><xsl:value-of select="request/saveInfo/conf_nm_abbr" /></td>
                </tr>                         
                <tr>
                  <td width='20%' class='title2'>개최국</td>
                  <td width="30%" class="contant" colspan="2"><xsl:value-of select="request/saveInfo/conf_area" /></td>
                  <td width='20%' class='title2'>개최지</td>
                  <td width="30%" class="contant" colspan="2"><xsl:value-of select="request/saveInfo/conf_area_ctiy" /></td>
                </tr>              
                <tr>
                  <td width='20%' class='title2'>웹주소</td>
                  <td width="80%" class="contant" colspan="5">
                  	<xsl:value-of select="request/saveInfo/event_url" />
                  </td>
                </tr>              
               
                <tr>
                  <td width='20%' class='title2'>행사(예정)일</td>
                  <td width="30%" class="contant" colspan="2"><xsl:value-of select="request/saveInfo/event_strdt_format" /> ~ <xsl:value-of select="request/saveInfo/event_clsdt_format" /></td>
                  <td width='20%' class='title2'>행사일정 비고</td>
                  <td width="30%" class="contant" colspan="2"> <xsl:value-of select="request/saveInfo/event_rmk" /></td>
                </tr>                       
           		<tr>
					<td width='10%' class='title2'>위원회/발표자 국적</td>
					<td width='20%' class='contant'><xsl:value-of select="request/saveInfo/conf_natn"/>개국</td>
					<td width='10%' class='title2'>발표건수</td>
					<td width='20%' class='contant'><xsl:value-of select="request/saveInfo/conf_gn"/>건</td>
					<td width='10%' class='title2'>발표자 중 외국인 비율</td>
					<td width='20%' class='contant'><xsl:value-of select="request/saveInfo/conf_rt"/>%</td>
			   </tr>
           
                <tr>
                  <td width='20%' class='title2'>추천사유</td>
                  <td width="80%" class="contant" colspan="5">
                  	<xsl:value-of select="request/saveInfo/recomm_rsn" />
                  </td>
                </tr>  
                
                <tr>
					<td width="20%" class="title2" colspan="1">발표목록첨부</td>
					<td width="80%" colspan="5" class="contant">
					<table cellpadding="0" cellspacing="2" width="100%">
				    <xsl:for-each select="request/saveInfo/fileList_A/vector/data/mdata">
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
          <tr>
          	<td class="body">
				<table width="100%" class="aprinnertable">
					<tr>
						<td width="22%" class="title">질문</td>
						<td width="8%" class="title">예</td>
						<td width="8%" class="title">아니오</td>
						<td width="30%" class="title">주의사항</td>
					</tr>
					<xsl:for-each select="request/saveInfo/doc1/vector/data">
						<tr>
							<td class="contant">
								<xsl:value-of select="msgXodxComMst/cd_nm" />
							</td>
							<td class="contant-center">
								<xsl:if test="msgXodxComMst/chkY = '1'">
									√								
								</xsl:if>
							</td>
							<td class="contant-center">
								<xsl:if test="msgXodxComMst/chkN = '1'">
									√								
								</xsl:if>
							</td>
							<td class="contant">
								<xsl:value-of select="msgXodxComMst/cd_desc" />
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
