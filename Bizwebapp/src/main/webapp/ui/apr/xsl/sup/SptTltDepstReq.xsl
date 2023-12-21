<?xml version="1.0"?>
<!DOCTYPE xsl:stylesheet [ <!ENTITY nbsp "&#160;"> ]>
<xsl:stylesheet xmlns:LINS="snapshot.css"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
xmlns:fo="http://www.w3.org/1999/XSL/Format"
>
<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
<xsl:template match="/">
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

        <!-- [B]신청내용 (시작) -->
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head">신청내용</td>
          </tr>
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>
                  <td width="15%"             class="title2">신청번호</td>
                  <td width="35%"             class="contant"><xsl:value-of select="APPROVAL/req_no"/></td>
                  <td width="15%"             class="title2">신청자</td>
                  <td width="35%"             class="contant"><xsl:value-of select="APPROVAL/req_psn_nm"/></td>
                </tr>
                <tr>
                  <td width="15%"             class="title2">신청일자</td>
                  <td width="35%"             class="contant"><xsl:value-of select="APPROVAL/req_ymd"/></td>
                  <td width="15%"             class="title2">부서</td>
                  <td width="35%"             class="contant"><xsl:value-of select="APPROVAL/req_dept"/></td>
                </tr>
                <tr>
					<td width="15%" class="title2">결의번호</td>
					<td width="35%" class="contant-center">
						<xsl:value-of select="APPROVAL/unslip_no" />
					</td>
					<td width="50%" colspan="2" class="contant-center" valign="middle">
						<a>
							<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="APPROVAL/unslip_no" />')</xsl:attribute>
							<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/>
						</a>
					</td>
				</tr>
              </table>
              
            </td>
          </tr>

        </table>
        <!-- [B]신청내용 (종료) -->

        <!-- [D]입금예정정보 (시작) -->
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head">입금예정정보 (<xsl:value-of select="APPROVAL/depst_mngmt_no"/>)</td>
          </tr>
          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width="13%"          class="title2">입금처</td>
                  <td width="20%"          class="contant"      ><xsl:value-of select="APPROVAL/cust_nm"/></td>
                  <td width="13%"          class="title2">입금예정총액</td>
                  <td width="20%"          class="contant-right"><xsl:value-of select="format-number(APPROVAL/depst_schdl_amt, '###,###,###,##0')"/></td>
                  <td width="13%"          class="title2">실입금총액</td>
                  <td width="21%"          class="contant-right"><xsl:value-of select="format-number(APPROVAL/ofic_depst_amt, '###,###,###,##0')"/></td>
                </tr>

                <tr>
                  <td width="13%"          class="title2">입금구분</td>
                  <td width="20%"          class="contant"      ><xsl:value-of select="APPROVAL/depst_clsf"/></td>
                  <td width="13%"             class="title2">입금액</td>
                  <td width="20%"             class="contant-right"><xsl:value-of select="format-number(APPROVAL/depst_liq, '#,###')"/></td>
                  <td width="13%"             class="title2">미수잔액</td>
                  <td width="21%"             class="contant-right"><xsl:value-of select="format-number(APPROVAL/uncollect_amt, '#,###')"/></td>
                </tr>
                
                <tr>
                  <td width="13%"          class="title2">비고</td>
                  <td width="87%"          colspan="5" class="contant"      ><xsl:value-of select="APPROVAL/rmk"/></td>
                </tr>

              </table>

            </td>
          </tr>

        </table>
        <!-- [D]입금예정정보 (종료) -->

        <!-- [E]입금상세정보 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">입금상세정보</td>
          </tr>

          <tr>
            <td class="body">

	              <table class="aprinnertable" width="100%">
	
	                <tr>                 
	                  <td width="15%" class="title">계정번호</td>
	                  <td width="18%" class="title">계산서</td>                
	                  <td width="19%" class="title">입금액</td>
	                  <td width="18%" class="title">입금일자</td>
	                  <td width="30%" class="title">은행/계좌번호</td>
	                
	                </tr>
	                <tr>                
	                  <td             class="contant-center"><xsl:value-of select="APPROVAL/accnt_no"        /></td>  <!-- 계정번호      -->
	                  <td             class="contant-center"><xsl:value-of select="APPROVAL/bill_no"                        /></td>  <!-- 계산서        -->                 
	                  <td             class="contant-right" ><xsl:value-of select="format-number(APPROVAL/depst_liq, '###,###,###,##0')"/></td>  <!-- 입금액        -->
	                  <td             class="contant-center"><xsl:value-of select="APPROVAL/depst_ymd"                                  /></td>  <!-- 입금일자      -->
	                  <td             class="contant"       ><xsl:value-of select="APPROVAL/bank"/>&nbsp;&nbsp; <xsl:value-of select="APPROVAL/bankaccnt_no"/></td>  <!-- 은행/계좌번호 -->	                 
	                </tr>
                     </table>

            </td>
          </tr>

        </table>
        <!-- [E]입금상세정보 (종료) -->

        <!-- [F]첨부파일 (시작) -->
         
        <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
        <tr>
            <td class="head"> 첨부파일</td>
        </tr>
        <tr>
            <td class="body">
                <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
                    <xsl:for-each select="APPROVAL/fileList_A/vector/data/mdata">
                    <tr>
                            <td class="title2" width="16%">첨부파일(<xsl:value-of select="seq"/>)</td>
                            <td class="contant" width="84%">
                            <a>
                            	<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA015')</xsl:attribute>
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
