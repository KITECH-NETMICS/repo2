<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="yes"/>

  <xsl:template match="APPROVALREQ">
    <xsl:variable name="localPath" select="request/localPath"/>

    <!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">  -->
   <body> 

        <!-- [B]신청내용 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">신청내용</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='15%'             class='title2'>신청번호</td>
                  <td width='35%'             class='contant'><xsl:value-of select="req_no"/></td>
                  <td width='15%'             class='title2'>신청자</td>
                  <td width='35%'             class='contant'><xsl:value-of select="req_psn_nm"/></td>
                </tr>

                <tr>
                  <td width='15%'             class='title2'>신청일자</td>
                  <td width='35%'             class='contant'><xsl:value-of select="req_ymd"/></td>
                  <td width='15%'             class='title2'>부서</td>
                  <td width='35%'             class='contant'><xsl:value-of select="req_dept_nm"/></td>
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
                  <td width='13%'             class='title2'>계정번호</td>
                  <td width='20%'             class='contant'><xsl:value-of select="accnt_no"/></td>
                  <td width='13%'             class='title2'>과제번호</td>
                  <td width='20%'             class='contant'><xsl:value-of select="prj_no"/></td>
                  <td width='13%'             class='title2'>과제기간</td>
                  <td width='21%'             class='contant'><xsl:value-of select="prj_prd_term"/></td>
                </tr>

                <tr>
                  <td width='13%'             class='title2'>과제명</td>
                  <td width='87%' colspan='5' class='contant'><xsl:value-of select="prj_nm"/></td>
                </tr>

                <tr>
                  <td width='13%'             class='title2'>과제책임자</td>
                  <td width='20%'             class='contant'><xsl:value-of select="prj_rspns_nm"/></td>
                  <td width='13%'             class='title2'>직급</td>
                  <td width='20%'             class='contant'><xsl:value-of select="posi_nm"/></td>
                  <td width='13%'             class='title2'>소속</td>
                  <td width='21%'             class='contant'><xsl:value-of select="dept_nm"/></td>
                </tr>

              </table>

            </td>
          </tr>

        </table>
        <!-- [C]계정정보 (종료) -->

        <!-- [D]입금예정정보 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">입금예정정보 (<xsl:value-of select="depst_odr"/>)</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='13%'             class='title2'>연구비구분</td>
                  <td width='20%'             class='contant'      ><xsl:value-of select="reschamt_clsf_nm"/></td>
                  <td width='13%'             class='title2'>입금예정총액</td>
                  <td width='20%'             class='contant-right'><xsl:value-of select="depst_schdl_amt"/></td>
                  <td width='13%'             class='title2'>실입금총액</td>
                  <td width='21%'             class='contant-right'><xsl:value-of select="ofic_depst_amt"/></td>
                </tr>

                <tr>
                  <td width='13%'             class='title2'>입금처</td>
                  <td width='20%'             class='contant'      ><xsl:value-of select="depst_loc_nm"/></td>
                  <td width='13%'             class='title2'>입금액</td>
                  <td width='20%'             class='contant-right'><xsl:value-of select="format-number(ofic_depst_amt_sum, '###,###,###,##0')"/></td>
                  <td width='13%'             class='title2'>미수잔액</td>
                  <td width='21%'             class='contant-right'><xsl:value-of select="uncollected_amt"/></td>
                </tr>
                <tr>
                  <td width='13%'             class='title2'>사업구분</td>
                  <td width='20%'             class='contant'><xsl:value-of select="bsns_clsf_nm"/></td>
                  <td width='13%'             class='title2'></td>
                  <td width='20%'             class='contant'></td>
                  <td width='13%'             class='title2'></td>
                  <td width='21%'             class='contant-right'></td>
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
                  <td width='04%' class='title'>순번1</td>
                  <td width='09%' class='title'>입금구분</td>
                  <td width='12%' class='title'>어음번호</td>
                  <td width='12%' class='title'>계산서</td>
                  <td width='13%' class='title'>입금액</td>
                  <td width='11%' class='title'>입금일자</td>
                  <td width='11%' class='title'>적요</td>
                </tr>

                <xsl:for-each select="GRIDLIST1A/vector/data/msgResBgRectl">
                <tr>
                  <td             class='contant-center'><xsl:value-of select="odr"                                             /></td>  <!-- 순번          -->
                  <td             class='contant-center'><xsl:value-of select="depst_clsf_nm"                                   /></td>  <!-- 입금구분      -->
                  <td             class='contant'       ><xsl:value-of select="prmsnt_no"                                       /></td>  <!-- 어음번호      -->
                  <td             class='contant-center'><xsl:value-of select="bill_no"                                         /></td>  <!-- 계산서        -->
                  <td             class='contant-right' ><xsl:value-of select="format-number(ofic_depst_amt, '###,###,###,##0')"/></td>  <!-- 입금액        -->
                  <td             class='contant-center'><xsl:value-of select="ofic_depst_ymd"                                  /></td>  <!-- 입금일자      -->
                  <td             class='contant-center'><xsl:value-of select="rmk"                                             /></td>  <!-- 적요          -->
                </tr>
                </xsl:for-each>

                <tr>
                  <td             colspan='5' class='title'        >합계</td>                                                                                  <!-- 합계           -->
                  <td bgcolor='#eaeaea'       class='contant-right'><xsl:value-of select="format-number(ofic_depst_amt_sum, '###,###,###,##0')"/></td>  <!-- (누적)실입금액 -->
                  <td             colspan='3' class='title'        ></td>                                                                                      <!-- Blank          -->
                </tr>

              </table>

            </td>
          </tr>

        </table>
        <!-- [E]입금상세정보 (종료) -->

        <!-- [F]첨부파일 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">첨부파일</td>
          </tr>

          <xsl:if test="ATTACHFILELISTS/attach_file_lists_cnt = '0'">
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='13%'             class='title2'>첨부파일</td>
                  <td width='87%'             class='contant'></td>
                </tr>
              </table>
            </td>
          </tr>
          </xsl:if>

          <xsl:if test="ATTACHFILELISTS/attach_file_lists_cnt = ''">
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='13%'             class='title2'>첨부파일</td>
                  <td width='87%'             class='contant'></td>
                </tr>
              </table>
            </td>
          </tr>
          </xsl:if>

          <xsl:if test="format-number(ATTACHFILELISTS/attach_file_lists_cnt, '##0') &gt; 0">
          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <xsl:for-each select="ATTACHFILELISTS/ATTACHFILELIST_1  | ATTACHFILELISTS/ATTACHFILELIST_2  | ATTACHFILELISTS/ATTACHFILELIST_3  | ATTACHFILELISTS/ATTACHFILELIST_4  | ATTACHFILELISTS/ATTACHFILELIST_5 |
                                      ATTACHFILELISTS/ATTACHFILELIST_6  | ATTACHFILELISTS/ATTACHFILELIST_7  | ATTACHFILELISTS/ATTACHFILELIST_8  | ATTACHFILELISTS/ATTACHFILELIST_9  | ATTACHFILELISTS/ATTACHFILELIST_10 |
                                      ATTACHFILELISTS/ATTACHFILELIST_11 | ATTACHFILELISTS/ATTACHFILELIST_12 | ATTACHFILELISTS/ATTACHFILELIST_13 | ATTACHFILELISTS/ATTACHFILELIST_14 | ATTACHFILELISTS/ATTACHFILELIST_15 |
                                      ATTACHFILELISTS/ATTACHFILELIST_16 | ATTACHFILELISTS/ATTACHFILELIST_17 | ATTACHFILELISTS/ATTACHFILELIST_18 | ATTACHFILELISTS/ATTACHFILELIST_19 | ATTACHFILELISTS/ATTACHFILELIST_20 |
                                      ATTACHFILELISTS/ATTACHFILELIST_21 | ATTACHFILELISTS/ATTACHFILELIST_22 | ATTACHFILELISTS/ATTACHFILELIST_23 | ATTACHFILELISTS/ATTACHFILELIST_24 | ATTACHFILELISTS/ATTACHFILELIST_25 |
                                      ATTACHFILELISTS/ATTACHFILELIST_26 | ATTACHFILELISTS/ATTACHFILELIST_27 | ATTACHFILELISTS/ATTACHFILELIST_28 | ATTACHFILELISTS/ATTACHFILELIST_29 | ATTACHFILELISTS/ATTACHFILELIST_30 |
                                      ATTACHFILELISTS/ATTACHFILELIST_31 | ATTACHFILELISTS/ATTACHFILELIST_32 | ATTACHFILELISTS/ATTACHFILELIST_33 | ATTACHFILELISTS/ATTACHFILELIST_34 | ATTACHFILELISTS/ATTACHFILELIST_35 |
                                      ATTACHFILELISTS/ATTACHFILELIST_36 | ATTACHFILELISTS/ATTACHFILELIST_37 | ATTACHFILELISTS/ATTACHFILELIST_38 | ATTACHFILELISTS/ATTACHFILELIST_39 | ATTACHFILELISTS/ATTACHFILELIST_40 |
                                      ATTACHFILELISTS/ATTACHFILELIST_41 | ATTACHFILELISTS/ATTACHFILELIST_42 | ATTACHFILELISTS/ATTACHFILELIST_43 | ATTACHFILELISTS/ATTACHFILELIST_44 | ATTACHFILELISTS/ATTACHFILELIST_45 |
                                      ATTACHFILELISTS/ATTACHFILELIST_46 | ATTACHFILELISTS/ATTACHFILELIST_47 | ATTACHFILELISTS/ATTACHFILELIST_48 | ATTACHFILELISTS/ATTACHFILELIST_49 | ATTACHFILELISTS/ATTACHFILELIST_50">

                <tr>
                  <td width='13%'             class='title2'>순번 : <xsl:value-of select="vector/data/msgXomxComAttachFileMS01/odr"/></td>
                  <td width='87%'             class='contant'>
                    <table cellpadding="0" cellspacing="2" width="100%">

                      <xsl:for-each select="vector/data/msgXomxComAttachFileMS01">
                      <tr>
                        <td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">
                          <a><xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="attach_full_path"/>/<xsl:value-of select="org_file"/>')</xsl:attribute>
                             <xsl:value-of select="org_file"/>
                          </a>
                        </td>
                      </tr>
                      </xsl:for-each>

                    </table>
                  </td>
                </tr>
                </xsl:for-each>

              </table>

            </td>
          </tr>
          </xsl:if>

        </table>
        <!-- [F]첨부파일 (종료) -->

      </body>
  </xsl:template>

</xsl:stylesheet>
