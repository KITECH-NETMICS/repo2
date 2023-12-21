<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="yes"/>

  <xsl:template match="RESOUTDOCU2ND">
    <xsl:variable name="localPath" select="request/localPath"/>

    <!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">  -->
   <body>
        <!-- [A]문서 타이틀 (시작) -->
        <!--
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head" align='center'>사업비 사용실적 보고서</td>
          </tr>
        </table>
        -->
        <!-- [A]문서 타이틀 (종료) -->

        <!-- [B]문서정보 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">문서정보</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='15%'             class='title2'>문서번호</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="vector/data/msgResOutDocu2ndMS01/docu_no"/></td>
                </tr>

                <tr>
                  <td width='15%'             class='title2'>수신</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="vector/data/msgResOutDocu2ndMS01/recv"/></td>
                </tr>

                <tr>
                  <td width='15%'             class='title2'>제목</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="vector/data/msgResOutDocu2ndMS01/subj"/></td>
                </tr>

                <tr>
                  <td width='15%'             class='title2'>내용</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="vector/data/msgResOutDocu2ndMS01/contnt"/></td>
                </tr>

              </table>

            </td>
          </tr>

        </table>
        <!-- [B]문서정보 (종료) -->

        <!-- [C]연구비정보 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">연구비정보</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='05%' rowspan='2' class='title'>순번</td>
                  <td width='26%' rowspan='2' class='title'>과제명</td>
                  <td width='08%' rowspan='2' class='title'>책임자</td>
                  <td width='12%' rowspan='2' class='title'>연구기간</td>
                  <td width='39%' colspan='3' class='title'>연구비</td>
                  <td width='10%' rowspan='2' class='title'>비고</td>
                </tr>

                <tr>
                  <td width='13%'             class='title'>예산액</td>
                  <td width='13%'             class='title'>집행액</td>
                  <td width='13%'             class='title'>잔액</td>
                </tr>

                <xsl:for-each select="vector/data/msgResOutDocu2ndMS01">
                <tr>
                  <td width='05%'             class='contant-center'><xsl:value-of select="odr"                                        /></td>  <!-- 순번     -->
                  <td width='26%'             class='contant'       ><xsl:value-of select="prj_nm"                                     /></td>  <!-- 과제명   -->
                  <td width='08%'             class='contant-center'><xsl:value-of select="nm"                                         /></td>  <!-- 책임자   -->
                  <td width='12%'             class='contant-center'><xsl:value-of select="resch_prd_term"                             /></td>  <!-- 연구기간 -->
                  <td width='13%'             class='contant-right' ><xsl:value-of select="format-number(bugt_amt , '###,###,###,##0')"/></td>  <!-- 예산액   -->
                  <td width='13%'             class='contant-right' ><xsl:value-of select="format-number(enfrc_amt, '###,###,###,##0')"/></td>  <!-- 집행액   -->
                  <td width='13%'             class='contant-right' ><xsl:value-of select="format-number(ramt     , '###,###,###,##0')"/></td>  <!-- 잔액     -->
                  <td width='10%'             class='contant'       ><xsl:value-of select="rmk"                                        /></td>  <!-- 비고     -->
                </tr>
                </xsl:for-each>

                <tr>
                  <td width='51%' colspan='4' class='title'         >합계</td>                                                                                    <!-- 합계         -->
                  <td width='13%'             class='contant-right' ><xsl:value-of select="format-number(vector/sum_bugt_amt , '###,###,###,##0')"/></td>  <!-- (누적)예산액 -->
                  <td width='13%'             class='contant-right' ><xsl:value-of select="format-number(vector/sum_enfrc_amt, '###,###,###,##0')"/></td>  <!-- (누적)집행액 -->
                  <td width='13%'             class='contant-right' ><xsl:value-of select="format-number(vector/sum_ramt     , '###,###,###,##0')"/></td>  <!-- (누적)잔액   -->
                  <td width='10%'             class='contant'       ></td>                                                                                        <!-- Blank        -->
                </tr>

              </table>

            </td>
          </tr>

        </table>
        <!-- [C]연구비정보 (종료) -->

        <!-- [D]첨부파일 (시작) -->
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
<!--                         <tr> -->
<!--                           <td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;"> -->
<!--                           <xsl:for-each select="vector/data/msgFileVec"> -->
<!--                               <a><xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq"/>', 'XAA001')</xsl:attribute> -->
<!--                                  <xsl:value-of select="file_name"/> -->
<!--                               </a> -->
<!--                               <br /> -->
<!--                           </xsl:for-each> -->
                        <tr>
                          <td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">
                          	<xsl:for-each select="fileList_A/vector/data/msgXomxComAttachFileMS01">
                            <a><xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq"/>', 'XAA001')</xsl:attribute>
                               <xsl:value-of select="org_file"/>
                            </a>
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
        <!-- [D]첨부파일 (종료) -->

      </body>
  </xsl:template>

</xsl:stylesheet>
