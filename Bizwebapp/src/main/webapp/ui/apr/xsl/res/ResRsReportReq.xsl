<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="yes"/>

  <xsl:template match="APPROVAL">
    <xsl:variable name="localPath" select="request/localPath"/>

    <!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">  -->
   
      <body>

        <!-- [A]기본정보 -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">신청내용</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='15%' class='title2'>접수번호</td>
                  <td width='35%' class='contant'><xsl:value-of select="rcpt_no"/></td>
                  <td width='15%' class='title2'>발간일</td>
                  <td width='35%' class='contant'><xsl:value-of select="substring(rcpt_agncy_ymd,1,4) "/>-<xsl:value-of select="substring(rcpt_agncy_ymd,5,2) "/>-<xsl:value-of select="substring(rcpt_agncy_ymd,7,2) "/></td>
                </tr>
                <tr>
                  <td width='15%' class='title2'>보고서명</td>
                  <td width='35%' class='contant' colspan='3'><xsl:value-of select="rptp_nm"/></td>                  
                </tr>
				<tr>
                  <td width='15%' class='title2'>개인정보검출기사용</td>
                  <td width='35%' class='contant'><xsl:value-of select="privt_info_auto_detct"/></td>
                  <td width='15%' class='title2'>보고서공개</td>
                  <td width='35%' class='contant'><xsl:value-of select="outsd_rptp_open_yn_nm"/></td>
                </tr>
                <xsl:if test="outsd_rptp_open_yn = 'N'">    
                <tr>
                  <td width='15%' class='title2'>비공개사유</td>
                  <td width='35%' class='contant' colspan='3'><xsl:value-of select="unopen_resn"/></td>                  
                </tr> 
                <tr>
                  <td width='15%' class='title2'>비공개사유서</td>
                  <td width='35%' class='contant' colspan='3'>
					<xsl:for-each select="fileList_B/vector/data/mdata">
						<a>
							<xsl:attribute name="href">#</xsl:attribute>
							<xsl:attribute name="onclick">downloadForXsl('<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq"/>', 'XAA001');return false;</xsl:attribute>
							<xsl:value-of select="file_nm" />
						</a><br/>
					</xsl:for-each>
                  </td>  
                </tr>
                </xsl:if>               
              </table>
            </td>
          </tr>

        </table>
        <!-- [A]기본정보 (종료) -->

        <!-- [B]계정정보 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">계정정보</td>
          </tr>

          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='13%' class='title2'>계정번호(과제번호)</td>
                  <td width='37%' class='contant'><xsl:value-of select="accnt_no"/>(<xsl:value-of select="prj_no"/>)</td>                  
                  <td width='13%' class='title2'>과제기간</td>
                  <td width='37%' class='contant'><xsl:value-of select="prj_prd_term"/></td>
                </tr>
                <tr>
                  <td width='13%' class='title2'>과제구분</td>
                  <td width='37%' class='contant'><xsl:value-of select="bsns_nm"/></td>
                  <td width='13%' class='title2'>관계부처</td>
                  <td width='37%' class='contant'><xsl:value-of select="bsns_cd_ofic"/></td>
                </tr>
                <tr>
                  <td width='13%' class='title2'>과제명</td>
                  <td width='87%' class='contant' colspan='3'><xsl:value-of select="prj_nm"/></td>                  
                </tr>
                <tr>
                  <td width='13%' class='title2'>과제책임자</td>
                  <td width='37%' class='contant'><xsl:value-of select="resch_rspns_nm"/></td>                 
                  <td width='13%' class='title2'>소속</td>
                  <td width='37%' class='contant'><xsl:value-of select="dept_nm"/></td>
                </tr>
              </table>

            </td>
          </tr>

        </table>
        <!-- [B]계정정보 (종료) -->

        <!-- [C]참여저자 -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">참여자정보</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='04%' class='title'>순번</td>
                  <td width='11%' class='title'>저자구분</td>
                  <td width='12%' class='title'>개인번호</td>
                  <td width='13%' class='title'>성명</td>
                  <td width='30%' class='title'>소속</td>
                  <td width='30%' class='title'>부서</td>                  
                </tr>

                <xsl:for-each select="doc1/vector/data/msgResRtReppt01">
                <tr>
                  <td class='contant-center'> <xsl:value-of select="attnce_odr"   /></td>  <!-- 순번          -->
                  <td class='contant-center'> <xsl:value-of select="auth_clsf_nm" /></td>  <!-- 저자구분      -->
                  <td class='contant'> <xsl:value-of select="empno" /></td>  <!-- 개인번호      -->
                  <td class='contant-center'><xsl:value-of select="attnce_psn_nm"  /> </td>  <!-- 성명        -->
                  <td class='contant-center'><xsl:value-of select="divsn_dept_nm"  /></td>  <!-- 소속      -->                  
                  <td class='contant-center'><xsl:value-of select="dept_nm"  /></td>  <!-- 부서      -->                  
                </tr>
                </xsl:for-each>
              </table>

            </td>
          </tr>

        </table>
        <!-- [E]저자정보 (종료) -->

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
							<xsl:attribute name="onclick">downloadForXsl('<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq"/>', 'XAA001');return false;</xsl:attribute>
							<xsl:value-of select="file_nm" />                      
							</a>
                        </td>
                    </tr>
                    </xsl:for-each>
                    
                    <tr>
						<td class="title2">위탁기관 연구보고서</td>
						<td class='contant' width="84%">
						<xsl:for-each select="fileList_C/vector/data/mdata">
							<a>
								<xsl:attribute name="href">#</xsl:attribute>
								<xsl:attribute name="onclick">downloadForXsl('<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq"/>', 'XAA001');return false;</xsl:attribute>
								<xsl:value-of select="file_nm" />
							</a><br/>
						</xsl:for-each>
						</td>
					</tr>
                </table>
            </td>
        </tr>
        </table>
        <!-- [F]첨부파일 (종료) -->

      </body>

  </xsl:template>

</xsl:stylesheet>
