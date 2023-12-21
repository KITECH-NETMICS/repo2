<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="yes"/>

  <xsl:template match="/">
        <xsl:variable name="localPath" select="request/localPath"/>

    <!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">  -->

      <body>
        <!-- [A]문서 타이틀 (시작) -->
        <!--
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head" align='center'>연구기자재/시작품변경</td>
          </tr>
        </table>
        -->
        <!-- [A]문서 타이틀 (종료) -->

        <!-- [B]변경기본정보 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">변경기본정보</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='15%'             class='title2'>과제번호</td>
                  <td width='35%'             class='contant'><xsl:value-of select="request/RESPRJCHG/vector/savePrj_no"/>(<xsl:value-of select="request/RESPRJCHG/vector/saveAccnt_no"/>)</td>
                  <td width='15%'             class='title2'>과제기간</td>
                  <td width='35%'             class='contant'><xsl:value-of select="request/RESPRJCHG/vector/saveTotReschYmd"/></td>
                </tr>

                <tr>
                  <td width='15%'             class='title2'>과제명</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="request/RESPRJCHG/vector/savePrj_nm"/></td>
                </tr>

                <tr>
                  <td width='15%'             class='title2'>연구책임자</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="request/RESPRJCHG/vector/saveAccnt_rspns_nm"/></td>
                </tr>

                <tr>
                  <td width='15%'             class='title2'>변경차수</td>
                  <td width='35%'             class='contant'><xsl:value-of select="request/RESPRJCHG/vector/chng_seq"/></td>
                  <td width='15%'             class='title2'>확정일자</td>
                  <td width='35%'             class='contant'><xsl:value-of select="request/RESPRJCHG/vector/chng_decsn_ymd"/></td>
                </tr>

                <tr>
                  <td width='15%'             class='title2'>관련공문</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="request/RESPRJCHG/vector/relat_offcldoc_no"/></td>
                </tr>

                <tr>
                  <td width='15%'             class='title2'>관련근거</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="request/RESPRJCHG/vector/chng_resn"/></td>
                </tr>

              </table>

            </td>
          </tr>

        </table>
        <!-- [B]변경기본정보 (종료) -->

        <!-- [C]변경전 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">변경전</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='20%' class='title'>장비구분</td>
                  <td width='40%' class='title'>품명</td>
                  <td width='20%' class='title'>수량</td>
                  <td width='20%' class='title'>금액</td>
                </tr>

                <xsl:for-each select="request/RESPRJCHG/GRID5/vector/data/msgResIncDtmaMS01">
                <tr>
                  <td             class='contant-center'><xsl:value-of select="cd_nm"                                /></td>  <!-- 장비구분 -->
                  <td             class='contant'       ><xsl:value-of select="gdnm"                                 /></td>  <!-- 품명     -->
                  <td             class='contant-right' ><xsl:value-of select="format-number(qty, '###,###,###,##0')"/></td>  <!-- 수량     -->
                  <td             class='contant-right' ><xsl:value-of select="format-number(amt, '###,###,###,##0')"/></td>  <!-- 금액     -->
                </tr>
                </xsl:for-each>

              </table>

            </td>
          </tr>

        </table>
        <!-- [C]변경전 (종료) -->

        <!-- [D]변경후 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">변경후</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='20%' class='title'>장비구분</td>
                  <td width='40%' class='title'>품명</td>
                  <td width='20%' class='title'>수량</td>
                  <td width='20%' class='title'>금액</td>
                </tr>

                <xsl:for-each select="request/RESPRJCHG/GRID6/vector/data/msgResIncDtmaMS02">
                <tr>
                  <td width='20%' class='contant-center'><xsl:value-of select="cd_nm"                                /></td>  <!-- 장비구분 -->
                  <td width='40%' class='contant'       ><xsl:value-of select="gdnm"                                 /></td>  <!-- 품명     -->
                  <td width='20%' class='contant-right' ><xsl:value-of select="format-number(qty, '###,###,###,##0')"/></td>  <!-- 수량     -->
                  <td width='20%' class='contant-right' ><xsl:value-of select="format-number(amt, '###,###,###,##0')"/></td>  <!-- 금액     -->
                </tr>
                </xsl:for-each>

              </table>

            </td>
          </tr>

        </table>
        <!-- [D]변경후 (종료) -->

        <!-- [E]첨부파일 (시작) -->
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

                      <xsl:if test="request/RESPRJCHG/vector/attach_fileno_b =  ''">
                        <tr>
                          <td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">
                          </td>
                        </tr>
                      </xsl:if>

                      <xsl:if test="request/RESPRJCHG/vector/attach_fileno_b != ''">
                        <xsl:for-each select="request/RESPRJCHG/fileList_B/vector/data/msgXomxComAttachFileMS01">
                        <tr>
                          <td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">
                            <a><xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq"/>', 'XAA001')</xsl:attribute>
                               <xsl:value-of select="org_file"/>
                            </a>
                          </td>
                        </tr>
                        </xsl:for-each>
                      </xsl:if>

                    </table>
                  </td>
                </tr>

              </table>

            </td>
          </tr>

        </table>
        <!-- [E]첨부파일 (종료) -->

      </body>

  </xsl:template>

</xsl:stylesheet>
