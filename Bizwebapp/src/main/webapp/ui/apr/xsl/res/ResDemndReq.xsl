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
	<script language="javascript">
        <![CDATA[
			/* 크리스피드 이원길 미리보기 시작 */
			function openEvidWindow(unslipNo){
				var url = "https://evid.kitech.re.kr/sd/view?CLS=00&amp;amp;amp;RESL_NO=" + unslipNo + "&amp;amp;amp;EMP_NO=" + unslipNo;
				url = url.replaceAll("amp;","");
				window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
			}
			/* 크리스피드 이원길 미리보기 끝 */
		]]>
        </script>
  

        <!-- [B]과제정보 (시작) -->
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head">과제정보</td>
          </tr>
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='10%'  class='title2'>계정번호</td>
                  <td width='20%'  class='contant'><xsl:value-of select="accnt_no"/></td>
                  <td width='10%'  class='title2'>과제명</td>
                  <td width='60%'  class='contant' colspan='3'><xsl:value-of select="prj_nm"/></td>
                </tr>
                <tr>
                  <td width='10%' class='title2'>과제책임자</td>
                  <td width='20%' class='contant'><xsl:value-of select="accnt_rspns_nm"/></td>
                  <td width='10%' class='title2'>과제기간</td>
                  <td width='30%' class='contant'><xsl:value-of select="period"/></td>
                  <td width='10%' class='title2'>총연구비</td>
                  <td width='20%' class='contant-right'><xsl:value-of select="format-number(tot_resch_amt, '#,###')"/></td>
                </tr>
              </table>
              
            </td>
          </tr>

        </table>
        <!-- [B]과제정보 (종료) -->

        <!-- [C]거래처정보 (시작) -->
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head">거래처정보</td>
          </tr>
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='10%'  class='title2'>거래처코드</td>
                  <td width='20%'  class='contant'><xsl:value-of select="vend_cd"/></td>
                  <td width='10%'  class='title2'>거래처명</td>
                  <td width='30%'  class='contant'><xsl:value-of select="vend_abbr"/></td>
                  <td width='10%'  class='title2'>대표자</td>
                  <td width='20%'  class='contant'><xsl:value-of select="reprs_psn_nm"/></td>
                </tr>
                <tr>
                  <td width='10%' class='title2'>사업자등록번호</td>
                  <td width='20%' class='contant'><xsl:value-of select="bsns_psn_regst_no"/></td>
                  <td width='10%' class='title2'>거래처주소</td>
                  <td width='60%' class='contant' colspan='3'><xsl:value-of select="addr"/></td>                  
                </tr>
              </table>

            </td>
          </tr>

        </table>
        <!-- [C]거래처정보 (종료) -->

        <!-- [D]청구계산서발행정보 (시작) -->
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head">청구계산서발행정보 </td>
          </tr>
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='10%'  class='title2'>신청번호</td>
                  <td width='20%'  class='contant'><xsl:value-of select="req_no"/></td>
                  <td width='15%'  class='title2'>청구의뢰일자</td>
                  <td width='20%'  class='contant'><xsl:value-of select="substring(req_ymd, 1, 4)" />-<xsl:value-of select="substring(req_ymd, 5, 2)" />-<xsl:value-of select="substring(req_ymd, 7, 2)" /></td>
                  <td width='15%'  class='title2'>과세구분</td>
                  <td width='20%'  class='contant'><xsl:value-of select="tax_cd_nm"/></td>
                </tr>
                <tr>
                  <td width='10%'  class='title2'>총액</td>
                  <td width='20%'  class='contant-right'><xsl:value-of select="format-number(demnd_liq, '#,###')"/></td>
                  <td width='15%' class='title2'>공급가액</td>
                  <td width='20%' class='contant-right'><xsl:value-of select="format-number(suply_value, '#,###')"/></td>
                  <td width='15%' class='title2'>부가세액</td>
                  <td width='20%' class='contant-right'><xsl:value-of select="format-number(tax_amt, '#,##0')"/></td>                  
                </tr>
				<tr>
                  <td width='15%' class='title2'>계산서발행일자</td>
                  <td width='20%' class='contant'><xsl:value-of select="issu_ymd"/></td>   
                  <td width='15%' class='title2'>계산서번호</td>
                  <td width='20%' class='contant'><xsl:value-of select="bill_no"/></td>    
                  <td width='10%' class='title2'>계산서구분</td>
                  <td width='20%' class='contant'><xsl:value-of select="bill_clsf"/></td>  
                </tr>
				<tr>
                  <td width='15%' class='title2'>결의번호</td>
                  <td width='20%' class='contant'><xsl:value-of select="unslip_no"/></td>
                  <td width='15%' class='title2'>결의증빙</td>   
                  <td colspan="3" class="contant-center" valign="middle">
					<a>
						<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="unslip_no" />')</xsl:attribute>
						<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/>
					</a>
				  </td>
                </tr>
              </table>

            </td>
          </tr>

        </table>
        <!-- [D]청구계산서발행정보 (종료) -->
        

        <!-- [F]첨부파일 (시작) -->
        <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
        <tr>
            <td class="head"> 첨부파일</td>
        </tr>
        <tr>
            <td class="body">
                <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
                   <xsl:for-each select="fileList_A/vector/data/mdata">
				         <tr>
				          <td class='title2' width="16%">첨부파일</td>
				          <td class='contant' width="84%">
				            <a>
						  	  <xsl:attribute name="href">#</xsl:attribute>
							  <xsl:attribute name="onclick">downloadForXsl('<xsl:value-of select="attach_file_no"/>
							                                                <xsl:value-of select="seq"/>', 'XAA001');return false;</xsl:attribute>
							  <xsl:value-of select="file_nm" />                      
						    </a>
				          </td>
				         </tr>
				     </xsl:for-each>
                </table>
            </td>
        </tr>
        </table>
        <!-- [F]첨부파일 (종료) -->
      </body>
  </xsl:template>
</xsl:stylesheet>