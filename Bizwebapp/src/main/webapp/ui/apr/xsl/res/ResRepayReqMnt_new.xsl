<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="yes"/>
  <xsl:template match="/">
      <body>
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head">신청내용</td>
          </tr>
          <tr>
            <td class="body">
              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='15%' class='title2'>신청번호</td>
                  <td width='35%' class='contant'><xsl:value-of select="root/demndVo/req_no"/></td>
                  <td width='15%' class='title2'>신청자</td>
                  <td width='35%' class='contant'><xsl:value-of select="root/demndVo/req_psn_nm"/></td>
                </tr>

                <tr>
                  <td width='15%' class='title2'>신청일자</td>
                  <td width='35%' class='contant'><xsl:value-of select="root/demndVo/req_ymd"/></td>
                  <td width='15%' class='title2'>부서</td>
                  <td width='35%' class='contant'><xsl:value-of select="root/demndVo/req_dept_nm"/></td>
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
                  <td width='13%' class='title2'>계정번호</td>
                  <td width='20%' class='contant'><xsl:value-of select="root/prjVo/accnt_no"/></td>
                  <td width='13%' class='title2'>과제번호</td>
                  <td width='20%' class='contant'><xsl:value-of select="root/prjVo/prj_no"/></td>
                  <td width='13%' class='title2'>과제기간</td>
                  <td width='21%' class='contant'>
                  	<xsl:value-of select="substring(root/prjVo/start_ymd, 1, 4)" />-<xsl:value-of select="substring(root/prjVo/start_ymd, 5, 2)" />-<xsl:value-of select="substring(root/prjVo/start_ymd, 7, 2)" />
					~
					<xsl:value-of select="substring(root/prjVo/cls_ymd, 1, 4)" />-<xsl:value-of select="substring(root/prjVo/cls_ymd, 5, 2)" />-<xsl:value-of select="substring(root/prjVo/cls_ymd, 7, 2)" />
                  </td>
                </tr>

                <tr>
                  <td width='13%' class='title2'>과제명</td>
                  <td width='87%' colspan='5' class='contant'><xsl:value-of select="root/prjVo/accnt_no_nm"/></td>
                </tr>

                <tr>
                  <td width='13%' class='title2'>과제책임자</td>
                  <td width='20%' class='contant'><xsl:value-of select="root/prjVo/accnt_rspns_nm"/></td>
                  <td width='13%' class='title2'>직급</td>
                  <td width='20%' class='contant'><xsl:value-of select="root/prjVo/posi_nm"/></td>
                  <td width='13%' class='title2'>소속</td>
                  <td width='21%' class='contant'><xsl:value-of select="root/prjVo/dept_nm"/></td>
                </tr>

              </table>

            </td>
          </tr>

        </table>
        <!-- [C]계정정보 (종료) -->

        <!-- [D]청구정보 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">청구정보 (<xsl:value-of select="root/demndVo/depst_odr"/>)</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='13%'  class='title2'>연구비구분</td>
                  <td width='20%'  class='contant-center'><xsl:value-of select="root/demndVo/reschamt_clsf"/></td>
                  <td width='13%'  class='title2'>청구일자</td>
                  <td width='20%'  class='contant-center'><xsl:value-of select="root/demndVo/accnt_ymd"/></td>
                  <td width='13%'  class='title2'>청구계산서번호</td>
                  <td width='20%'  class='contant-center'><xsl:value-of select="root/demndVo/bill_no"/></td>
                  
                </tr>

                <tr>
                  <td width='13%'  class='title2'>청구금액</td>
                  <td width='20%'  class='contant-right'><xsl:value-of select="format-number(root/demndVo/demnd_liq, '###,###,###,##0')"/></td>
                  <td width='13%'  class='title2'>기입금액</td>
                  <td width='21%'  class='contant-right'><xsl:value-of select="format-number(root/demndVo/won_adjst_amt, '###,###,###,##0')"/></td>   
                  <td width='13%'  class='title2'>미수잔액</td>
                  <td width='21%'  class='contant-right'><xsl:value-of select="format-number(root/demndVo/ramt_amt, '###,###,###,##0')"/></td>
                </tr>
                <tr>
                  <td width='13%'  class='title2'>입금구분</td>
                  <td width='20%'  class='contant-center'><xsl:value-of select="root/demndVo/depst_clsf"/></td>
                  <td width='13%'  class='title2'>입금처</td>
                  <td width='20%'  class='contant'><xsl:value-of select="root/demndVo/vend_abbr"/></td>
                  <td width='13%'  class='title2'>사업자번호</td>
                  <td width='20%'  class='contant-center'><xsl:value-of select="root/demndVo/bsns_psn_regst_no"/></td>
                  
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
                  <td width='04%' class='title'>순번</td>                  
                  <td width='14%' class='title'>미수반제신청번호</td>
                  <td width='12%' class='title'>입금액</td>
                  <td width='11%' class='title'>입금일자</td>
                  <td width='24%' class='title'>은행/계좌번호</td>
                  <td width='28%' class='title'>적요</td>
                  <td width='07%' class='title'>결의번호</td>
                </tr>
				
				<xsl:variable name="ofic_depst_amt_sum" select="sum(root/rectlList/ofic_depst_amt)" />
                <xsl:for-each select="root/rectlList">
	                <tr>
	                  <td class='contant-center'><xsl:value-of select="odr"             /></td>  <!-- 순번          -->                
	                  <td class='contant-center'><xsl:value-of select="depst_req_no"    /></td>  <!-- 입금확인      -->
	                  <td class='contant-right' ><xsl:value-of select="format-number(ofic_depst_amt, '###,###,###,##0')"/></td>  <!-- 입금액        -->
	                  <td class='contant-center'><xsl:value-of select="ofic_depst_ymd"  /></td>  <!-- 입금일자      -->
	                  <td class='contant'><xsl:value-of select="bank_nm"/> / <xsl:value-of select="bankaccnt_no" /></td>  <!-- 은행/계좌번호 -->
	                  <td class='contant'><xsl:value-of select="rmk"   /></td>  <!-- 적요          -->
	                  <td             class='contant-center'>
							<a>
								<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="unslip_no" />')</xsl:attribute>
								<xsl:value-of select="unslip_no"/>
							</a>
	                  </td>  <!-- 결의번호        -->
	                </tr>
                </xsl:for-each>

                <tr>
                  <td colspan='2' class='title'  >합계</td>       <!-- 합계           -->
                  <td bgcolor='#eaeaea' class='contant-right'><xsl:value-of select="format-number($ofic_depst_amt_sum, '###,###,###,##0')"/></td>  <!-- (누적)실입금액 -->
                  <td colspan='4' class='title' ></td>    <!-- Blank          -->
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

          <xsl:if test="count(root/fileList) != 0">	          
	          <tr>
	            <td class="body">
	              <table class="aprinnertable" width="100%">
	                <xsl:for-each select="root/fileList">
		                <tr>
		                  <td width='13%' class='title2'>순번 : <xsl:value-of select="position()" /></td>
		                  <td width='87%' class='contant'>
		                    <table cellpadding="0" cellspacing="2" width="100%">	                     
		                      <tr>
		                        <td>
		                        	<a>
										<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA001')</xsl:attribute>
										<xsl:value-of select="file_nm" />
									</a>
									<xsl:if test="attach_file_no != ''">
										<a>
											<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of
												select="seq" />')</xsl:attribute>
											<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기"
												style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;" />
										</a>
									</xsl:if>
									<br/>
		                        </td>
		                      </tr>	
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
