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
            <td class="head" align='center'>사업신청</td>
          </tr>
        </table>
        -->
        <!-- [A]문서 타이틀 (종료) -->

        <!-- [B]사업신청기본 (시작) -->
        <table class="aproutertable" width="100%">

          <!--
          <tr>
            <td class="head">사업신청기본</td>
          </tr>
          -->

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='15%' class='title2'>게재일자</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALCHARGREQ/issu_ymd"/></td>
                  <td width='15%' class='title2'>접수번호</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALCHARGREQ/rcpt_no"/></td>
                </tr>

                <tr>
                  <td width='15%'             class='title2'>논문제목</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="APPROVALCHARGREQ/paper_nm"/></td>
                </tr>

                <tr>
                  <td width='15%'             class='title2'>게재지명</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="APPROVALCHARGREQ/publpapr_nm"/></td>
                </tr>

                <tr>
                  <td width='15%' class='title2'>국내외 구분</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALCHARGREQ/clsf"/></td>
                  <td width='15%' class='title2'>IF지수</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALCHARGREQ/if_index"/></td>
                </tr>
                <tr>
                  <td width='15%' class='title2'>SCI구분</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALCHARGREQ/paper_clsf"/></td>
                  <td width='15%' class='title2'>IF상위구분</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALCHARGREQ/if_grade"/></td>
                </tr>
                <tr>
                  <td width='15%' class='title2'>ISBN/ISSN</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALCHARGREQ/isbn_issn"/></td>
                  <td width='15%' class='title2'>등록학술지여부</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALCHARGREQ/socty_yn"/></td>
                </tr>
                <tr>
                  <td width='15%' class='title2'>권(Vol.)호(No.)</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALCHARGREQ/ed_vol"/> 권    <xsl:value-of select="APPROVALCHARGREQ/ed_no"/> 호</td>
                  <td width='15%' class='title2'>게재면수</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALCHARGREQ/issu_page_start"/> ~ <xsl:value-of select="APPROVALCHARGREQ/issu_page_end"/></td>
                </tr>
                
                <tr>
                  <td width='15%'             class='title2'>논문접수파일</td>
                  <td width='85%' colspan='3' class='contant'>
                    <table cellpadding="0" cellspacing="2" width="100%">

                        <xsl:for-each select="APPROVALCHARGREQ/fileList_A/vector/data/msgXomxComAttachFileMS01">
                        <tr>
                          <td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">
                            <a><xsl:attribute name="href">javascript:xslFileDownload('<xsl:value-of select="attach_full_path"/>')</xsl:attribute> <!-- /<xsl:value-of select="org_file"/> -->
                               <xsl:value-of select="org_file"/>
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
                
		<table class="aproutertable" width="100%">

          <tr>
            <td class="head">과제정보</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='15%'             class='title2'>계정정보</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="APPROVALCHARGREQ/accnt_no"/></td>
                </tr>
                <tr>
                  <td width='15%' class='title2'>과제구분</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALCHARGREQ/bsns_cd_detls_bsns_nm"/></td>
                  <td width='15%' class='title2'>주관부처</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALCHARGREQ/bsns_cd_ofic_nm"/></td>
                </tr>

                <tr>
                  <td width='15%' 			  class='title2'>과제명</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="APPROVALCHARGREQ/prj_nm"/></td>
                </tr>
                <tr>
                  <td width='15%' 			  class='title2'>연구기간</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="APPROVALCHARGREQ/prj_ymd"/></td>
                </tr>
                <tr>
                  <td width='15%' class='title2'>연구책임자</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALCHARGREQ/nm"/></td>
                  <td width='15%' class='title2'>부서</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALCHARGREQ/dept_nm"/></td>
                </tr>

              </table>

            </td>
          </tr>

        </table>
        <!-- [B]사업신청기본 (종료) -->

        <!-- [C]참여연구원 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">참여저자</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='10%' class='title'>저자구분</td>
                  <td width='10%' class='title'>내외구분</td>
                  <td width='10%' class='title'>성명</td>
                  <td width='10%' class='title'>개인번호</td>
                  <td width='10%' class='title'>지분</td>
                  <td width='25%' class='title'>소속</td>
                  <td width='25%' class='title'>부서</td>
                </tr>

                <xsl:for-each select="APPROVALCHARGREQ/docGrid/vector/data">
                <tr>
                  <xsl:if test="msgResRtRepptMS03/auth_clsf = 'RVD001'">
                  <td             class='contant-center'>주저자</td>
                  </xsl:if>
                  <xsl:if test="msgResRtRepptMS03/auth_clsf = 'RVD002'">
                  <td             class='contant-center'>교신저자</td>
                  </xsl:if>
                  <xsl:if test="msgResRtRepptMS03/auth_clsf = 'RVD003'">
                  <td             class='contant-center'>참여저자</td>
                  </xsl:if>
                  
                  <xsl:if test="msgResRtRepptMS03/rhi_clsf = 'RHI001'">
                  <td             class='contant-center'>내부</td>
                  </xsl:if>
                  <xsl:if test="msgResRtRepptMS03/rhi_clsf = 'RHI002'">
                  <td             class='contant-center'>외부</td>
                  </xsl:if>
                  <td             class='contant-center'><xsl:value-of select="msgResRtRepptMS03/nm"                                              /></td>  <!-- 성명                -->
                  <td             class='contant-center'><xsl:value-of select="msgResRtRepptMS03/empno"                                           /></td>  <!-- 개인번호            -->
                  <td             class='contant-center'><xsl:value-of select="format-number(msgResRtRepptMS03/auth_scr, '##0.00')"         /></td>  <!-- 현금참여율          -->
                  <td             class='contant-center'><xsl:value-of select="msgResRtRepptMS03/divsn_dept_nm"         /></td>  <!-- 현금참여율          -->
                  <td             class='contant-center' ><xsl:value-of select="msgResRtRepptMS03/dept_nm"/></td>  <!-- 계상인건비          -->
                </tr>
                </xsl:for-each>

              </table>

            </td>
          </tr>

        </table>
        <!-- [C]참여연구원 (종료) -->


        <br/>
        <br/>

      </body>
  </xsl:template>

</xsl:stylesheet>
