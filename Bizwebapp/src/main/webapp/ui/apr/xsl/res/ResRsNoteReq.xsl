<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/APPROVAL">
 	<xsl:variable name="localPath" select="request/localPath"/>
	<body>
        <!-- [B]대여신청정보 (시작) -->
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head">대여신청정보</td>
          </tr>
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
              	<tr>
                  <td width='10%' class='title2'>신청일자</td>
                  <td width='20%' class='contant'><xsl:value-of select="req_ymd"/></td>  
                  <td width='10%'  class='title2'>신청기간</td>
                  <td width='20%'  class='contant' colspan='3'><xsl:value-of select="substring(rent_prd_start_ymd, 1, 4)"/>-<xsl:value-of select="substring(rent_prd_start_ymd, 5, 2)"/> -<xsl:value-of select="substring(rent_prd_start_ymd, 7, 2)"/>
                  ~ <xsl:value-of select="substring(rent_prd_cls_ymd, 1, 4)"/>-<xsl:value-of select="substring(rent_prd_cls_ymd, 5, 2)"/> -<xsl:value-of select="substring(rent_prd_cls_ymd, 7, 2)"/>
                  </td>                  
                </tr>               
                <tr>
                  <td width='10%' class='title2'>소속</td>
                  <td width='20%' class='contant'><xsl:value-of select="dept_nm"/></td>    
                  <td width='10%' class='title2'>성명</td>
                  <td width='20%' class='contant'><xsl:value-of select="req_psn_nm"/></td>  
                  <td width='10%' class='title2'>직급</td>
                  <td width='20%' class='contant'><xsl:value-of select="req_psn_posi_nm"/></td>                  
                </tr>               
              </table>
              
            </td>
          </tr>

        </table>
        <!-- [B]대여신청정보 (종료) -->

        <!-- [C]대여연구노트 (시작) -->
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head">대여연구노트</td>
          </tr>
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='10%'  class='title2'>연구노트 관리번호</td>
                  <td width='20%'  class='contant'><xsl:value-of select="rcpt_no"/></td>
                  <td width='10%'  class='title2'>연구책임자</td>
                  <td width='20%'  class='contant'><xsl:value-of select="resch_rspns"/></td>
                </tr>
                <tr>
                  <td width='10%'  class='title2'>연구개발 사업명</td>
                  <td width='30%'  class='contant' colspan='3'><xsl:value-of select="accnt_no_nm"/></td>
                </tr>                
                <tr>
                  <td width='10%'  class='title2'>기록자</td>
                  <td width='20%'  class='contant' colspan='3'><xsl:value-of select="attnce_psn"/></td>
                </tr>               
              </table>
            </td>
          </tr>
        </table>
        <!-- [C]대여연구노트 (종료) -->

        <!-- [D]신청사유 (시작) -->
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head">신청사유 </td>
          </tr>
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>                  
                  <td width='20%'  class='contant'><xsl:value-of select="req_cause"/></td>                  
                </tr>                
              </table>
            </td>
          </tr>

        </table>
        <!-- [D]신청사유 (종료) -->
        
      </body>
  </xsl:template>

</xsl:stylesheet>
