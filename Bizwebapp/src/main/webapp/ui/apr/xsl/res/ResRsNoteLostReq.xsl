<?xml version="1.0"?>
<!DOCTYPE xsl:stylesheet [ <!ENTITY nbsp "&#160;"> ]>
<xsl:stylesheet xmlns:LINS="snapshot.css"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
xmlns:fo="http://www.w3.org/1999/XSL/Format"
>
<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
<xsl:template match="/APPROVAL">
<xsl:variable name="localPath" select="request/localPath"/>
 	<body>
        <!-- [B]대여신청정보 (시작) -->
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head">분실신고자정보</td>
          </tr>
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">              	
                <tr>
                  <td width='10%' class='title2'>성명</td>
                  <td width='20%' class='contant'><xsl:value-of select="req_psn_nm"/></td>   
                  <td width='10%' class='title2'>소속</td>
                  <td width='20%' class='contant'><xsl:value-of select="dept_nm"/></td>                   
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
            <td class="head">분실연구노트</td>
          </tr>
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='10%'  class='title2'>연구노트 관리번호</td>
                  <td width='20%'  class='contant'><xsl:value-of select="rcpt_no"/></td>
                  <td width='10%'  class='title2'>분실신고일자</td>
                  <td width='20%'  class='contant'><xsl:value-of select="substring(req_ymd,1,4)"/>-<xsl:value-of select="substring(req_ymd,5,2)"/>-<xsl:value-of select="substring(req_ymd,7,2)"/></td>
                </tr>
                <tr>
                  <td width='10%'  class='title2'>연구개발 사업명</td>
                  <td width='30%'  class='contant' colspan='3'><xsl:value-of select="accnt_no_nm"/></td>
                </tr>
                <tr>
                  <td width='10%'  class='title2'>연구책임자</td>
                  <td width='20%'  class='contant'><xsl:value-of select="resch_rspns"/></td>
                  <td width='10%'  class='title2'>재배부여부</td>
                  <td width='20%'  class='contant'><xsl:value-of select="re_distr_clsf"/></td>
                </tr>
                <tr>
                  <td width='10%'  class='title2'>기록자</td>
                  <td width='20%'  class='contant' colspan='3'><xsl:value-of select="attnce_psn"/></td>
                </tr> 
                <xsl:if test="discard_yn = 'Y'">  
                <tr>
                  <td width='10%'  class='title2' colspan='2' style="color:red"> ※ 폐기요청일 경우 연구노트 작성 · 관리지침 13조(폐기)에 따라 연구총괄심의위원회 심의안건으로 상정하여야 한다.  </td>                 
                </tr> 
                </xsl:if>     
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
