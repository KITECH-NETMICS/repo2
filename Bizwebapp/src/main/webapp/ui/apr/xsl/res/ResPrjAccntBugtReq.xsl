<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="yes"/>

  <xsl:template match="APPROVALREQ">
    <xsl:variable name="localPath" select="request/localPath"/>

    <!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">  -->

      <body>

        <!-- [A]문서 타이틀 (시작) -->
        <!--
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head" align='center'>실행예산편성/변경</td>
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
                  <td width='20%' align='left' ><font color='#444444' face='굴림'><b> 계정정보</b></font></td>
                  <td width='80%' align='right'><font color='#444444' face='굴림'><b>신청번호 : <xsl:value-of select="req_no"/></b></font></td>
                </tr>
              </table>
            </td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='13%'  class='title2'>계정번호</td>
                  <td width='20%'  class='contant'><xsl:value-of select="accnt_no"/></td>
                  <td width='13%'  class='title2'>과제기간</td>
                  <td width='18%'  class='contant'><xsl:value-of select="resch_prd_term"/></td>
                  <td width='15%'  class='title2'>계정상태</td>
                  <td width='21%'  class='contant'><xsl:value-of select="accnt_state_nm"/></td>
                </tr>

                <tr>
                  <td width='13%' class='title2'>과제명</td>
                  <td width='87%' colspan='5' class='contant'><xsl:value-of select="accnt_no_nm"/></td>
                </tr>
                
                <tr>
                  <td width='13%' class='title2'>계정책임자</td>
                  <td width='20%' class='contant'><xsl:value-of select="accnt_rspns_str"/></td>
                  <td width='13%' class='title2'>직급</td>
                  <td width='18%' class='contant'><xsl:value-of select="posi_nm"/></td>
                  <td width='15%' class='title2'>소속</td>
                  <td width='21%' class='contant'><xsl:value-of select="dept_nm"/></td>
                </tr>
                <tr>
                  <td width='13%'  class='title2'>이월금액</td>
                  <td width='20%'  class='contant-right'><xsl:value-of select="format-number(cryfwd_amt, '###,###,###,##0')"/></td>
                  <td width='13%'  class='title2'>당해연도수입</td>
                  <td width='18%'  class='contant-right'><xsl:value-of select="format-number(incom_amt, '###,###,###,##0')"/></td>
                  <td width='15%'  class='title2'>내부기술지원수입</td>
                  <td width='21%'  class='contant-right'><xsl:value-of select="format-number(insd_tech_sup_incom, '###,###,###,##0')"/></td>
                </tr>
                <tr>                 
                  <td width='13%'  class='title2'>계정대체(차감)</td>
                  <td width='20%'  class='contant-right'><xsl:value-of select="format-number(trans_amt, '###,###,###,##0')"/></td>
                  <td width='13%'  class='title2'>총금액</td>
                  <td width='18%'  class='contant-right'><xsl:value-of select="format-number(totl_amt, '###,###,###,##0')"/></td>
                  <td width='15%'  class='title2'/>
                  <td width='21%'  class='contant-right'/>
                </tr>
              </table>

            </td>
          </tr>

        </table>
        <!-- [B]계정정보 (종료) -->

        <!-- [C]실행예산정보 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">실행예산정보 (<xsl:value-of select="exec_bugt_seq"/>)</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
					<td width='20%'  class='title'>대비목</td>
					<td width='30%'  class='title'>세부비목</td>									
					<td width='15%'  class='title'>이전<br/>실행예산</td>
					<td width='15%'  class='title'>실행예산</td>
					<td width='20%'  class='title'>집행금액<br/>(원인금액포함)</td>
                </tr>

                <xsl:for-each select="GRIDLIST1A/vector/data/msgResPrjAccntBugtMS01">
                <tr>
					<td  class='contant' > <xsl:value-of select="itm_clsf_nm"   /></td>  <!-- 대비목    -->
					<td  class='contant' > <xsl:value-of select="bugt_item_nm"  /></td>  <!-- 세부비목  -->									
					<td  class='contant-right' ><xsl:value-of select="format-number(pre_amt, '###,###,###,##0')"/></td>  <!-- 이전실행예산                    -->
					<td  class='contant-right' ><xsl:value-of select="format-number(amt, '###,###,###,##0')"/></td>  <!-- 실행예산   -->
					<td  class='contant-right' ><xsl:value-of select="format-number(enfrc_cause_amt , '###,###,###,##0')"/></td>  <!-- 집행금액<br/>(원인금액포함) -->
                </tr>
                </xsl:for-each>

                <tr>
					<td width='50%' colspan='2' class='title' >합계</td>    <!-- 대비목(합계)  -->					
					<td width='15%' class='contant-right' ><xsl:value-of select="format-number(tot_pre_amt         , '###,###,###,##0')"/></td>  <!-- (합계)실행예산   -->
					<td width='15%' class='contant-right' ><xsl:value-of select="format-number(tot_amt             , '###,###,###,##0')"/></td>  <!-- (합계)실행예산   -->
					<td width='20%' class='contant-right' ><xsl:value-of select="format-number(tot_enfrc_cause_amt , '###,###,###,##0')"/></td>  <!-- (합계)집행금액<br/>(원인금액포함) -->

                </tr>

              </table>

            </td>
          </tr>

        </table>
        <!-- [C]실행예산정보 (종료) -->

        <!-- [D]변경사유 (시작) -->
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head">변경사유</td>
          </tr>
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='13%'   class='title2'>변경사유</td>
                  <td width='87%'   class='contant'><xsl:value-of select="resn_contnt"/></td>
                </tr>
              </table>
            </td>
          </tr>

        </table>
        <!-- [D]변경사유 (종료) -->

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
								<td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">
									<a>
										<xsl:attribute name="href">#</xsl:attribute>
										<xsl:attribute name="onclick">downloadForXsl('<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq"/>', 'XAA001');return false;</xsl:attribute>
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
