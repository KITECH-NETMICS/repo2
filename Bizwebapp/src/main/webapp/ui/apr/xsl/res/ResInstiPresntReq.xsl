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
		<script language="javascript">
		<![CDATA[
		
		function openEvidWindow(reqNo){
						var url = "https://evid.kitech.re.kr/sd/view?CLS=00&amp;amp;RESL_NO=" + reqNo + "&amp;amp;EMP_NO=" + reqNo;
						url = url.replaceAll("amp;","");
						window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
					}
				]]>
			</script>
        <!-- [B]논문 데이터 (시작) -->
        <table width="100%" border="0" cellspacing="0" cellpadding="0"
					class="aproutertable">
		  <tr>
            <td width="90%" class="head">발표정보</td>
						<!-- 크리스피드 이원길 미리보기 버튼 추가 시작 -->
						<td width="10%" align="right" valign="bottom">
							<a>
								<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="APPROVALREQ/rcpt_no"/>')</xsl:attribute>
								<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/>
							</a>
						</td>
          </tr>
		  </table>
		 <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='15%' class='title2'>게재일자</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/notice_ymd"/></td>
                  <td width='15%' class='title2'>접수번호</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/rcpt_no"/></td>
                </tr>
                <tr>
                  <td width='15%'             class='title2'>발표제목</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="APPROVALREQ/anoun_nm"/></td>
                </tr>
                <tr>
                  <td width='15%'             class='title2'>발표학회 명</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="APPROVALREQ/notice_socty_nm"/></td>
                </tr>
                <tr>
                  <td width='15%' class='title2'>학회발표 구분</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/socty_anoun_clsf"/></td>
                  <td width='15%' class='title2'>발표유형</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/anoun_type"/></td>
                </tr>
                <xsl:if test ="APPROVALREQ/pool_rcpt_no != ''">
				<tr>
					<td width='15%' class='title2'>학술대회명</td>
					<td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/pool_conf_nm"/></td>
					<td width='15%' class='title2'>학술대회Pool등록번호</td>
					<td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/pool_rcpt_no"/></td>
				</tr>
				<tr>
					<td width='15%' class='title2'>개최학회명/영문</td>
					<td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/pool_society_nm_en"/></td>
					<td width='15%' class='title2'>연구분야</td>
					<td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/pool_rscharea"/></td>
				</tr>
				<tr>
					<td width='15%' class='title2'>개최국</td>
					<td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/pool_conf_area"/></td>
					<td width='15%' class='title2'>개최지</td>
					<td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/pool_conf_area_ctiy"/></td>
				</tr>
				</xsl:if>
                <tr>
                  <td width='15%' class='title2'>재단등록학회여부</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/socty_yn"/></td>
                  <td width='15%' class='title2'>자료수록</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/data_colct_start"/> ~ <xsl:value-of select="APPROVALREQ/data_colct_end"/></td>
                </tr>
                
                <tr>
                  <td width='15%' class='title2'>발표물첨부</td>
                  <td width='85%' colspan='3' class='contant'>
                    <table cellpadding="0" cellspacing="2" width="100%">
                        <xsl:for-each select="APPROVALREQ/fileList_A/vector/data/mdata">
                        <tr>
                          <td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">
                            <a>
                            	<xsl:attribute name="onclick">downloadForXsl('<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq"/>', 'XAA001');return false;</xsl:attribute>
								<xsl:value-of select="file_nm" />
                            </a>
                          </td>
                        </tr>
                        </xsl:for-each>
                    </table>
                  </td>
                </tr>
               	<tr>
                  <td width='15%' class='title2'>공개사유</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="APPROVALREQ/secrt_rmk"/></td>
                </tr>
                <tr>
                  <td width='15%' class='title2'>공개사유서첨부</td>
                  <td width='70%' colspan='3' class='contant'>
                    <table cellpadding="0" cellspacing="2" width="100%">
                        <xsl:for-each select="APPROVALREQ/fileList_B/vector/data/mdata">
                        <tr>
                          <td style="font-family:'돋움', Dotum, Helvetica, AppleGothic, Sans-serif; font-size:12px;">
                            <a>
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
                  <td width='15%' class='title2'>계정정보</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/accnt_no"/></td>
                  <td width='15%' class='title2'>연구기간</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/prj_ymd"/></td>
                </tr>
                <tr>
                  <td width='15%' class='title2'>과제구분</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/bsns_cd_detls_bsns_nm"/></td>
                  <td width='15%' class='title2'>주관부처</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/bsns_cd_ofic_nm"/></td>
                </tr>
                <tr>
                  <td width='15%' 			  class='title2'>과제명</td>
                  <td width='85%' colspan='3' class='contant'><xsl:value-of select="APPROVALREQ/prj_nm"/></td>
                </tr>
                <tr>
                  <td width='15%' class='title2'>연구책임자</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/nm"/></td>
                  <td width='15%' class='title2'>부서</td>
                  <td width='35%' class='contant'><xsl:value-of select="APPROVALREQ/dept_nm"/></td>
                </tr>
              </table>
            </td>
          </tr>
        </table>
        <!-- [B]논문데이터 (종료) -->

        <!-- [C]참여저자 (시작) -->
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head">참여저자</td>
          </tr>
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='5%' class='title'>순번</td>
                  <td width='10%' class='title'>저자구분</td>
                  <td width='9%' class='title'>내외구분</td>
                  <td width='9%' class='title'>성명</td>
                  <td width='9%' class='title'>개인번호</td>
                  <td width='9%' class='title'>직급</td>
                  <td width='9%' class='title'>지분</td>
                  <td width='20%' class='title'>소속</td>
                  <td width='20%' class='title'>부서</td>
                </tr>
                <xsl:for-each select="APPROVALREQ/docGrid/vector/data">
                <tr>
                  <td			  class="contant-center"><xsl:value-of select = "position()"/></td>
                  <xsl:if test="msgResRtRepptMS03/auth_clsf = 'RVE001'">
                  <td             class='contant-center'>주발표자</td>
                  </xsl:if>
                  <xsl:if test="msgResRtRepptMS03/auth_clsf = 'RVE002'">
                  <td             class='contant-center'>참여자</td>
                  </xsl:if>
                  
                  <xsl:if test="msgResRtRepptMS03/auth_clsf = 'RVE003'">
                  <td             class='contant-center'>교신저자</td>
                  </xsl:if>
                  <xsl:if test="msgResRtRepptMS03/rhi_clsf = 'RHI001'">
                  <td             class='contant-center'>내부</td>
                  </xsl:if>
                  <xsl:if test="msgResRtRepptMS03/rhi_clsf = 'RHI002'">
                  <td             class='contant-center'>외부</td>
                  </xsl:if>
                  <td             class='contant-center'><xsl:value-of select="msgResRtRepptMS03/nm"            /></td>  <!-- 성명 -->
                  <td             class='contant-center'><xsl:value-of select="msgResRtRepptMS03/empno"      /></td>  <!-- 개인번호 -->
                   <td             class='contant-center'><xsl:value-of select="msgResRtRepptMS03/posi_nm"  /></td>  <!-- 직급 -->
                  <td             class='contant-center'><xsl:value-of select="format-number(msgResRtRepptMS03/auth_scr, '##0.000')"         /></td>  <!-- 현금참여율          -->
                  <td             class='contant-center'><xsl:value-of select="msgResRtRepptMS03/divsn_dept_nm"         /></td>  <!-- 현금참여율          -->
                  <td             class='contant-center' ><xsl:value-of select="msgResRtRepptMS03/dept_nm"/></td>  <!-- 계상인건비          -->
                </tr>
                </xsl:for-each>
              </table>
            </td>
          </tr>
        </table>
        <!-- [C]참여저자 (종료) -->
        <br/>
        <br/>
      </body>
  </xsl:template>
</xsl:stylesheet>