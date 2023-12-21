<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="yes"/>

  <xsl:template match="RESPRJENDMNTVEC">
    <xsl:variable name="localPath" select="request/localPath"/>

    <!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">  -->

      <body>

        

        <!-- [A]문서 타이틀 (시작) -->
        <!--
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head" align='center'>과제정산의뢰서</td>
          </tr>
        </table>
        -->
        <!-- [A]문서 타이틀 (종료) -->

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
                  <td width='15%'             class='contant'><xsl:value-of select="vector/bank_book"/></td>                  
                </tr>

                <tr>
                  <td width='10%'             class='title2'>연구책임자</td>
                  <td width='15%'             class='contant'><xsl:value-of select="vector/accnt_rspns_nm"/></td>
                  <td width='10%'             class='title2'>과제기간</td>
                  <td width='40%'             class='contant'><xsl:value-of select="vector/thyr_yr_ymd"/></td>
                  <td width='10%'             class='title2'>연구비잔액</td>
                  <td width='15%'             class='contant-right' ><xsl:value-of select="format-number(vector/retrn_tot_amt, '###,###,###,##0')"/></td>
                </tr>


              </table>

            </td>
          </tr>

        </table>
        <!-- [B]계정정보 (종료) -->

        <!-- [C]참여위탁기관정산정보 (시작) -->
        <xsl:if test="number(vector/unaprv_amt_tot1) &gt; 0">  <!-- 불인정금액의 총합이 0 이상인 경우에만 표시 -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">참여위탁기관정산정보</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='15%'             class='title'>사업자번호</td>
                  <td width='25%'             class='title'>참여기관</td>

                  <td width='15%'             class='title'>현금</td>
                  <td width='15%'             class='title'>현물</td>
                  <td width='15%'             class='title'>합계</td>
                  <td width='15%'             class='title'>불인정금액</td>
                </tr>

                <xsl:for-each select="GRID2/vector/data/msgResPrjEndMS05">
                <tr>
                  <td                         class='contant-center'><xsl:value-of select="bsns_psn_regst_no"                           /></td>  <!-- 사업자번호 -->
                  <td                         class='contant'       ><xsl:value-of select="vend_abbr"                                   /></td>  <!-- 참여기관   -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(cash, '###,###,###,##0')"      /></td>  <!-- 현금       -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(goods, '###,###,###,##0')"     /></td>  <!-- 현물       -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(tot_sum, '###,###,###,##0')"   /></td>  <!-- 합계       -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(unaprv_amt, '###,###,###,##0')"/></td>  <!-- 불인정금액 -->
                </tr>
                </xsl:for-each>

                <tr>
                  <td             colspan='2' class='title'         >합계</td>                                                                                      <!-- 합계             -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(vector/cash_tot1, '###,###,###,##0')"      /></td>  <!-- (누적)현금       -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(vector/goods_tot1, '###,###,###,##0')"     /></td>  <!-- (누적)현물       -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(vector/tot_sum_tot1, '###,###,###,##0')"   /></td>  <!-- (누적)합계       -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(vector/unaprv_amt_tot1, '###,###,###,##0')"/></td>  <!-- (누적)불인정금액 -->
                </tr>

              </table>
            </td>
          </tr>

        </table>
        </xsl:if>
        <!-- [C]참여위탁기관정산정보 (종료) -->

        <!-- [D]정산잔액정보 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">2. 회계 정보</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='20%'             class='title'>적요</td>
                  <td width='20%'             class='title'>회계코드명</td>
                  <td width='20%'             class='title'>회계코드</td>
                  <td width='20%'             class='title'>금액</td>
                  <td width='20%'             class='title'>관련계정</td>
                </tr>
				
                <xsl:for-each select="GRID11/vector/data/msgResPrjEndMS03">
                <!-- xsl:if test="number(BBB) &gt; 0">  -->
                <tr>
                  <td                         class='contant-center'><xsl:value-of select="AAA"                                       /></td>  <!-- 구분 -->
                  <td                         class='contant-center' ><xsl:value-of select="accnt_cd_nm"     /></td>  <!-- 반납 -->
                  <td                         class='contant-center' ><xsl:value-of select="accnt_cd"     /></td>  <!-- 흡수 -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(BBB, '###,###,###,##0')"     /></td>  <!-- 이월 -->
                  <td                         class='contant-center' ><xsl:value-of select="accnt_no"/></td>  <!-- 합계 -->
                </tr>
                <!-- /xsl:if-->
                </xsl:for-each>
				
                <tr>
                  <td                         class='title'         >합계</td>                                                                                <!-- 합계       -->
                  <!-- td                         class='contant-right' ><xsl:value-of select="format-number(vector/tot1, '###,###,###,##0')"     /></td -->  <!-- (누적)반납 -->
                  <td                         class='contant-right' ></td>  <!-- (누적)반납 -->
                  <!-- td                         class='contant-right' ><xsl:value-of select="format-number(vector/tot2, '###,###,###,##0')"     /></td -->  <!-- (누적)흡수 -->
                  <td                         class='contant-right' ></td>  <!-- (누적)흡수 -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(vector/tot1, '###,###,###,##0')"     /></td>  <!-- (누적)이월 -->
                  <!-- td                         class='contant-right' ><xsl:value-of select="format-number(vector/totalSum4, '###,###,###,##0')"/></td -->  <!-- (누적)합계 -->
                  <td                         class='contant-right' ></td>  <!-- (누적)합계 -->
                </tr>

              </table>

            </td>
          </tr>

        </table>
        <!-- [D]정산잔액정보 (종료) -->


        <!-- [F]반납정보 (시작) -->
        <xsl:if test="number(vector/retrn_amt_sum) &gt; 0">  <!-- 반납액의 총합이 0 이상인 경우에만 표시 -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">3. 지급 정보</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='15%'             class='title'>구분</td>
                  <td width='10%'             class='title'>금액</td>
                  <td width='30%'             class='title'>거래처</td>
                  <td width='18%'             class='title'>입금계좌</td>
                  <td width='15%'             class='title'>예금주</td>
                  <td width='12%'             class='title'>은행</td>
                </tr>

                <xsl:for-each select="GRID12/vector/data/msgResPrjEndMS04">
                <tr>
                  <td                         class='contant'       >거래처</td>  <!-- 업체명   -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(retrn_amt, '###,###,###,##0')"/></td>  <!-- 금액   -->
                  <td                         class='contant'       ><xsl:value-of select="vend_nm"                                    /></td>  <!-- 거래처   -->
                  <td                         class='contant'       ><xsl:value-of select="bankaccnt_no"                               /></td>  <!-- 은행계좌 -->
                  <td                         class='contant-center'><xsl:value-of select="depstr"                                     /></td>  <!-- 예금주   -->
                  <td                         class='contant'       ><xsl:value-of select="bank_nm"                                    /></td>  <!-- 은행명   -->
                </tr>
                </xsl:for-each>

                <tr>
                  <td                         class='title'         >합계</td>                                                                                    <!-- 합계         -->
                  <td                         class='contant-right' ><xsl:value-of select="format-number(vector/retrn_amt_sum, '###,###,###,##0')"/></td>  <!-- (누적)송금액 -->
                  <td             colspan='4' class='contant'       >                                                                                      </td>  <!-- Blank        -->
                </tr>

              </table>

            </td>
          </tr>

        </table>
        </xsl:if>
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

                        <tr>
                          <td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">

                          <xsl:for-each select="vector/data/msgFileVec">
                              <a><xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="file_value" />/<xsl:value-of select="file_name"/>')</xsl:attribute>
                                 <xsl:value-of select="file_name"/>
                              </a>
                              <br />
                          </xsl:for-each>

                          </td>
                        </tr>

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
