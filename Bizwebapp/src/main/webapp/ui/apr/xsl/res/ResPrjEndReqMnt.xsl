<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="yes"/>

  <xsl:template match="RESPRJENDMNTVEC">
  <xsl:variable name="localPath" select="request/localPath"/>

    <!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">  -->


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
        <!-- [B]계정정보 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head"></td>
          </tr>
          
          <tr>
            <td>
              <table class="aproutertable" width="100%">
                <tr>
                  <td width='2%' align='left' ></td>
                  <td width='98%' align='left'><font color='#444444' face='굴림'><b>의뢰번호 : <xsl:value-of select="vector/req_no"/></b></font></td>
                </tr>
                <tr>
                  <td width='5%' align='left' ></td>
                  <td width='95%' align='left'></td>
                </tr>
              </table>
            </td>
          </tr>
			
          <tr>
            <td>
              <table class="aproutertable" width="100%">
                <tr>
                  <td width='20%' align='left' ><font color='#444444' face='굴림'><b>1. 과제정보</b></font></td>
                  <td width='80%' align='right'></td>
                </tr>
              </table>
            </td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='10%'             class='title2'>계정번호</td>
                  <td width='15%'             class='contant'><xsl:value-of select="vector/saveAccnt_no"/></td>
                  <td width='10%'             class='title2'>과제명</td>
                  <td width='40%'             class='contant'><xsl:value-of select="vector/savePrj_nm"/></td>
                  <td width='10%'             class='title2'>별도통장</td>
                  <td width='15%'             class='contant'><xsl:value-of select="vector/bank_accntno"/></td>                  
                </tr>

                <tr>
                  <td width='10%'             class='title2'>연구책임자</td>
                  <td width='15%'             class='contant'><xsl:value-of select="vector/resch_rspns_nm"/></td>
                  <td width='10%'             class='title2'>과제기간</td>
                  <td width='40%'             class='contant-center'><xsl:value-of select="vector/resch_prd"/></td>
                  <td width='10%'             class='title2'>반납액</td>
                  <td width='15%'             class='contant-right' ><xsl:value-of select="format-number(vector/retrn_amt_sum, '###,###,###,##0')"     /></td>
                </tr>
				<tr>
					<td width='10%' class='title2'>결의번호</td>
					<td width='15%' class="contant-center">
						<xsl:value-of select="vector/unslip_no" />
					</td>
					<td width='75%' colspan="4" class="contant-center" valign="center" style="padding:0">
							<a>
								<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="vector/unslip_no" />')</xsl:attribute>
								<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif" style="display:block;vertical-align:top;padding-left:10px"/>
							</a>
					</td>
				</tr>

              </table>

            </td>
          </tr>

        </table>
        <!-- [B]계정정보 (종료) -->

        <!-- [D]정산잔액정보 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">2. 정산잔액</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='20%'             class='title'>적요</td>
                  <td width='10%'             class='title'>회계코드</td>
                  <td width='30%'             class='title'>회계코드명</td>
                  <td width='20%'             class='title'>금액</td>
                  <td width='20%'             class='title'>대상</td>
                </tr>
				
				<xsl:for-each select="GRID11/vector/data/msgResEnAdjstDtlMS01">
                <!-- xsl:if test="number(BBB) &gt; 0">  -->
                <tr>
                  <td                         class='contant-center'><xsl:value-of select="adjst_clsf_nm"     /></td>  <!-- 구분 -->
                  <td                         class='contant-center' ><xsl:value-of select="accnt_cd"     /></td>  <!-- 반납 -->
                  <td                         class='contant-center' ><xsl:value-of select="accnt_cd_abbr"     /></td>  <!-- 흡수 -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(input_amt, '###,###,###,##0')"     /></td>  <!-- 이월 -->
                  <td                         class='contant-center' ><xsl:value-of select="nm"     /></td>  <!-- 합계 -->
                </tr>
                <!-- /xsl:if-->
				</xsl:for-each>
                <tr>
                  <td                         class='title'  colspan='3'       >합계</td>                                                                                <!-- 합계       -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(vector/totAmt, '###,###,###,##0')"     /></td>  <!-- (누적)반납 -->
                  <td                         class='contant-right' ></td>  <!-- (누적)흡수 -->
                </tr>

              </table>

            </td>
          </tr>

        </table>
        <!-- [D]정산잔액정보 (종료) -->

        <!-- [F]반납정보 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">3. 송금내용</td>
          </tr>
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='20%'             class='title'>거래처</td>
                  <td width='10%'             class='title'>구분</td>
                  <td width='10%'             class='title'>금액</td>
                  <td width='12%'             class='title'>은행</td>
                  <td width='18%'             class='title'>입금계좌</td>
                  <td width='20%'             class='title'>예금주</td>
                </tr>
				<xsl:for-each select="GRID12/vector/data/msgResEnYrRtnMS01">
                <tr>
                  <td                         class='contant'       ><xsl:value-of select="vend_nm"     /></td>  <!-- 거래처   -->
                  <td                         class='contant'		><xsl:value-of select="pay_clsf_nm"     /></td>  <!-- 참여지분   -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(retrn_amt, '###,###,###,##0')"     /></td>  <!-- 거래처   -->
                  <td                         class='contant'       ><xsl:value-of select="bank_nm"     /></td>  <!-- 은행계좌 -->
                  <td                         class='contant-center'><xsl:value-of select="bankaccnt_no"     /></td>  <!-- 예금주   -->
                  <td                         class='contant'       ><xsl:value-of select="depstr"     /></td>  <!-- 은행명   -->
                </tr>
				</xsl:for-each>
                <tr>
                  <td             colspan='2' class='title'         >합계</td>                                                                                    <!-- 합계         -->
                  <!-- td                         class='contant-right' ></td -->  <!-- (누적)송금액 -->                                                          <!-- 합계         -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(vector/retrn_amt_sum, '###,###,###,##0')" /></td>  <!-- (누적)송금액 -->
                  <td             colspan='3' class='contant'       >                                                                                      </td>  <!-- Blank        -->
                </tr>
              </table>
            </td>
          </tr>
        </table>
        <!-- [F]반납정보 (종료) -->

        <!-- [G]첨부파일 (시작) -->
        <table class="aproutertable" width="100%">
          <tr>

            <td class="head">첨부파일</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='15%'             class='title2'>첨부파일</td>
                  <td width='85%' colspan='3' class='contant'>

                    <table cellpadding="0" cellspacing="2" width="100%">


                        <xsl:for-each select="fileList_A/vector/data/mdata">
                        <tr>
                          <td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">
                            <a>
                               <xsl:attribute name="href">#</xsl:attribute>
							   <xsl:attribute name="onclick">downloadForXsl('<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq"/>', 'XAA001');return false;</xsl:attribute>
                               <xsl:value-of select="file_nm"/>
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

        </table>
        <!-- [G]첨부파일 (종료) -->

      </body>

  </xsl:template>
</xsl:stylesheet>
