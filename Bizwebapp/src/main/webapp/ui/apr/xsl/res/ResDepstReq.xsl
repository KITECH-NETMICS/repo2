<?xml version="1.0"?>
<!DOCTYPE xsl:stylesheet [ <!ENTITY nbsp "&#160;"> ]>
<xsl:stylesheet xmlns:LINS="snapshot.css"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
xmlns:fo="http://www.w3.org/1999/XSL/Format"
>
<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
<xsl:template match="/">
<xsl:variable name="localPath" select="request/localPath"/>
  <html lang="kr">
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
                  <td width='15%' class='title2'>신청번호</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVAL/req_no"/></td>
                  <td width='15%' class='title2'>신청자</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVAL/req_psn_nm"/></td>
                </tr>
                
                <tr>
                  <td width='15%' class='title2'>신청일자</td>
                  <td width='35%' class='contant'><xsl:value-of select="substring(APPROVAL/req_ymd, 1, 4)" />-<xsl:value-of select="substring(APPROVAL/req_ymd, 5, 2)" />-<xsl:value-of select="substring(APPROVAL/req_ymd, 7, 2)" /></td>
                  <td width='15%' class='title2'>부서</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVAL/req_dept"/></td>
                </tr>
                <tr>
				  <td width='15%' class="title2">결의번호</td>
				  <td width='35%' class="contant"><xsl:value-of select="APPROVAL/unslip_no" /></td>
				  <td width='15%' class="title2">결의일자</td>
				  <td width='35%' class='contant'><xsl:value-of select="substring(APPROVAL/unslip_ymd, 1, 4)" />-<xsl:value-of select="substring(APPROVAL/unslip_ymd, 5, 2)" />-<xsl:value-of select="substring(APPROVAL/unslip_ymd, 7, 2)" /></td>
				</tr>
				<tr>
					<td width='100%' colspan="4" class="contant-center" valign="middle">
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

        <!-- [C]계정정보 (시작) -->
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head">계정정보</td>
          </tr>
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>              
                  <td width='13%' class='title2'>기술명</td>
                  <td width='52%'  colspan='3' class='contant'><xsl:value-of select="APPROVAL/tech_nm"/></td>      
                  <td width='14%' class='title2'>과제번호</td>
                  <td width='21%' class='contant'><xsl:value-of select="APPROVAL/prj_no"/></td>           
                </tr>
                <tr>
                  <td width='13%' class='title2'>협약구분</td>
                  <td width='20%' class='contant'><xsl:value-of select="APPROVAL/mou_clsf"/></td>  
                  <td width='12%' class='title2'>출원번호</td>
                  <td width='20%' class='contant'><xsl:value-of select="APPROVAL/smitapp_no"/></td>
                  <td width='14%' class='title2'>관련계정번호</td>
                  <td width='21%' class='contant'><xsl:value-of select="APPROVAL/main_accnt_no"/></td>   
                </tr>

                <tr>
                  <td width='13%' class='title2'>연구책임자</td>
                  <td width='20%' class='contant'><xsl:value-of select="APPROVAL/accnt_rspns_str"/></td>
                  <td width='13%' class='title2'>직급</td>
                  <td width='20%' class='contant'><xsl:value-of select="APPROVAL/posi_nm"/></td>
                  <td width='13%' class='title2'>소속</td>
                  <td width='21%' class='contant'><xsl:value-of select="APPROVAL/dept_nm"/></td>
                </tr>
              </table>

            </td>
          </tr>

        </table>
        <!-- [C]계정정보 (종료) -->

        <!-- [D]입금예정정보 (시작) -->
        <table class="aproutertable" width="100%">
          <tr>
			<xsl:choose>
				<xsl:when test="APPROVAL/claim_yn = 'Y'">
					<td class="head">청구예정정보 (<xsl:value-of select="APPROVAL/depst_no"/>)</td>
				</xsl:when>
				<xsl:otherwise>
					<td class="head">입금예정정보 (<xsl:value-of select="APPROVAL/depst_no"/>)</td>
				</xsl:otherwise>
			</xsl:choose>          	
          </tr>
          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='11%' class='title2'>입금처</td>
                  <td width='20%' class='contant'      ><xsl:value-of select="APPROVAL/vend_nm"/></td>
                  <td width='15%' class='title2'>입금예정총액</td>
                  <td width='20%' class='contant-right'><xsl:value-of select="format-number(APPROVAL/depst_schdl_amt, '#,###')"/></td>
                  <td width='13%' class='title2'>실입금총액</td>
                  <td width='21%' class='contant-right'><xsl:value-of select="format-number(APPROVAL/ofic_depst_amt, '#,###')"/></td>
                </tr>

                <tr>
                  <td width='11%' class='title2'>입금구분</td>
                  <td width='20%' class='contant'      ><xsl:value-of select="APPROVAL/depst_clsf_nm"/></td>
				  <xsl:choose>
					  <xsl:when test="APPROVAL/claim_yn = 'Y'">
						  <td width='15%' class='title2'>청구액</td>
					  </xsl:when>
					  <xsl:otherwise>
						  <td width='15%' class='title2'>입금액</td>
					  </xsl:otherwise>
				  </xsl:choose>                     
                  <td width='20%' class='contant-right'><xsl:value-of select="format-number(APPROVAL/depst_liq, '#,###')"/></td>
                  <td width='13%' class='title2'>미수잔액</td>
                  <td width='21%' class='contant-right'><xsl:value-of select="format-number(APPROVAL/uncollect_amt, '#,###')"/></td>
                </tr>

              </table>

            </td>
          </tr>

        </table>
        <!-- [D]입금예정정보 (종료) -->

        <!-- [E]입금상세정보 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
			<xsl:choose>
				<xsl:when test="APPROVAL/claim_yn = 'Y'">
          			<td class="head">청구상세정보</td>
				</xsl:when>
				<xsl:otherwise>
            		<td class="head">입금상세정보</td>
				</xsl:otherwise>
			</xsl:choose>            
          </tr>

          <tr>
            <td class="body">

	              <table class="aprinnertable" width="100%">
	
	                <tr>                 
	                  <td width='11%' class='title'>계정번호</td>
	                  <td width='10%' class='title'>입금구분</td>
	                  <td width='11%' class='title'>어음번호</td>
	                  <td width='14%' class='title'>계산서</td>
					  <xsl:choose>
						  <xsl:when test="APPROVAL/claim_yn = 'Y'">
							  <td width='15%' class='title'>청구액</td>
	                  		  <td width='14%' class='title'>청구일자</td>
						  </xsl:when>
						  <xsl:otherwise>
	                  		  <td width='15%' class='title'>입금액</td>
	                  		  <td width='14%' class='title'>입금일자</td>
						  </xsl:otherwise>
					  </xsl:choose>  	                     
	                  <td width='25%' class='title'>은행/계좌번호</td>
	                </tr>
	                <tr>                
	                  <td class='contant-center'><xsl:value-of select="APPROVAL/accnt_no" /></td>  <!-- 계정번호      -->
	                  <td class='contant-center'><xsl:value-of select="APPROVAL/depst_method" /></td>  <!-- 입금구분      -->
	                  <td class='contant'       ><xsl:value-of select="APPROVAL/prmsnt_no" /></td>  <!-- 어음번호      -->
	                  <td class='contant-center'><xsl:value-of select="APPROVAL/bill_no" /></td>  <!-- 계산서        -->                 
	                  <td class='contant-right' ><xsl:value-of select="format-number(APPROVAL/depst_liq, '###,###,###,##0')" /></td>  <!-- 입금액        -->
	                  <td class='contant-center'><xsl:value-of select="APPROVAL/depst_ymd" /></td>  <!-- 입금일자      -->
					  <xsl:choose>
						  <xsl:when test="APPROVAL/depst_method = '주식'">
						  	<td class='contant'></td>
						  </xsl:when>
						  <xsl:otherwise>
	                  		<td class='contant'><xsl:value-of select="APPROVAL/bank"/><br/><xsl:value-of select="APPROVAL/bankaccnt_no" /></td>  <!-- 은행/계좌번호 -->
						  </xsl:otherwise>
					  </xsl:choose>
	                                            	                 
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
				<xsl:choose>
					<xsl:when test="APPROVAL/claim_yn = 'Y'">
		                <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
		                    <xsl:for-each select="APPROVAL/fileList_B/vector/data/mdata">
		                    <tr>
		                            <td class='title2' width="16%">첨부파일</td>
		                            <td class='contant' width="84%">
		                            <a>
										<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA016')</xsl:attribute>
										<xsl:value-of select="file_nm" />
		                            </a>
		                            </td>
		                    </tr>
		                    </xsl:for-each>
		                </table>  					
					</xsl:when>
					<xsl:otherwise>
		                <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
		                    <xsl:for-each select="APPROVAL/fileList_A/vector/data/mdata">
		                    <tr>
		                            <td class='title2' width="16%">첨부파일</td>
		                            <td class='contant' width="84%">
		                            <a>
		                            	<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA016')</xsl:attribute>
										<xsl:value-of select="file_nm" />
		                            </a>
		                            </td>
		                    </tr>
		                    </xsl:for-each>
		                </table> 					
					</xsl:otherwise>            
				</xsl:choose>
            </td>
        </tr>
        </table>
        <!-- [F]첨부파일 (종료) -->
      </body>
    </html>

  </xsl:template>

</xsl:stylesheet>
