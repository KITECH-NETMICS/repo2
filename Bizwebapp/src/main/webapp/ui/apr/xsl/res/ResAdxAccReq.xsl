<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="yes"/>

  <xsl:template match="PROCESSPROCAPPROVAL">
    <xsl:variable name="localPath" select="request/localPath"/>

    <!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">  -->

      <body>
        <!-- [B]신청정보 (시작) -->
        <table class="aproutertable" width="100%">

          <tr>
            <td class="head">신청정보</td>
          </tr>

          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">

                <tr>
                  <td width='100%' colspan='4' class='title2'>( <xsl:value-of select="yr"/> ) 년도 기술지원사업 신청서</td>
                </tr>

                <tr>
                  <td width='15%'              class='title2'>신청번호</td>
                  <td width='35%'              class='contant'><xsl:value-of select="req_no"/></td>
                  <td width='15%'              class='title2'>신청일자</td>
                  <td width='35%'              class='contant'><xsl:value-of select='substring(req_ymd,1,4)'/>-<xsl:value-of select='substring(req_ymd,5,2)'/>-<xsl:value-of select='substring(req_ymd,7,2)'/></td>
                </tr>

                <tr>
                  <td width='15%'              class='title2'>사업구분</td>
                  <td width='85%'  colspan='3' class='contant'><xsl:value-of select="cd_nm_text"/> (<xsl:value-of select="bsns_clsf"/>)</td>
                </tr>

                <tr>
                  <td width='15%'              class='title2'>사업명</td>
                  <td width='85%'  colspan='3' class='contant'><xsl:value-of select="bsns_nm"/></td>
                </tr>

                <tr>
                  <td width='15%'              class='title2'>사업신청사유</td>
                  <td width='85%'  colspan='3' class='contant'><xsl:value-of select="req_cause"/></td>
                </tr>

                <tr>
                  <td width='15%'              class='title2'>사업책임자</td>
                  <td width='35%'              class='contant'><xsl:value-of select="bsns_rspns_str"/></td>
                  <td width='15%'              class='title2'>소속</td>
                  <td width='35%'              class='contant'><xsl:value-of select="dept_nm"/></td>
                </tr>
                
                <tr>
                  <td width='15%'              class='title2'>예산통제자</td>
                  <td width='35%'              class='contant'><xsl:value-of select="bugt_ctrl_psn"/></td>
                  <td width='15%'              class='title2'>계정용도구분</td>
                  <td width='35%'              class='contant'><xsl:value-of select="usg_clsf"/></td>
                </tr>

                <tr>
                  <td width='15%'              class='title2'>집행비율(%)</td>
                  <td width='85%'  colspan='3' class='contant'><xsl:value-of select="enfrc_rts"/></td>
                </tr>

                <tr>
                  <td width='15%'              class='title2'>비고</td>
                  <td width='85%'  colspan='3' class='contant'><xsl:value-of select="rmk"/></td>
                </tr>

              </table>

            </td>
          </tr>

        </table>
        <!-- [B]신청정보 (종료) -->
        
        <!-- 과세여부 (시작) -->           
        <table class="aproutertable" width="100%">
          <tr>
            <td class="head">과세여부</td>
          </tr>
          <tr>
            <td class="body">

              <table class="aprinnertable" width="100%">
                <tr>
                  <td width='5%' class='title' rowspan='4'> 비 <br/> 과 <br/> 세  </td>
                  <td width='45%' class='title2' rowspan='4'>
                  	 1) 새로운 학술이나 기술을 개발하기 위한 새로운 이론, 방법, 공법 또는 공식의 연구 <br/>2) 신제품을 개발하거나 제품의 성능이나 질, 용도등을 개선하는 연구<br/>3) 실비이하로 제공하는 용역(실비이하임을 입증하는 자료필요)      
                  </td>
                  <td width='50%' class='contant'>
                  	<input type="checkbox" id="chk1"> 
	                  	<xsl:if test="contains(tax_free_item, 'RBK001')">
	                       	<xsl:attribute name="checked"> checked</xsl:attribute>
	                    </xsl:if> 새로운 이론, 공법, 공식에 관한 연구
                    </input>
                  </td>
                </tr>  
                <tr>
                	 <td width='50%' class='contant'>
                		<input type="checkbox" id="chk2"> 
		                  	<xsl:if test="contains(tax_free_item, 'RBK002')">
		                       	<xsl:attribute name="checked"> checked</xsl:attribute>
		                    </xsl:if> 신제품 개발연구
                    	</input> 
                	</td>
                </tr>
                 <tr>
                 	 <td width='50%' class='contant'>
                 		<input type="checkbox" id="chk3"> 
		                  	<xsl:if test="contains(tax_free_item, 'RBK003')">
		                       	<xsl:attribute name="checked"> checked</xsl:attribute>
		                    </xsl:if> 제품의 성능이나 질, 용도를 개선하는 연구
	                    </input> 
                 	</td>
                 </tr>  
                 <tr>
                 	 <td width='50%' class='contant'>
                 		<input type="checkbox" id="chk4"> 
		                  	<xsl:if test="contains(tax_free_item, 'RBK004')">
		                       	<xsl:attribute name="checked"> checked</xsl:attribute>
		                    </xsl:if> 실비이하 또는 무상으로 진행되는 연구
	                    </input>
                 	</td>
                 </tr> 
                 <tr>
                  <td width='5%' class='title' rowspan='5'> 과 <br/> 세  </td>
                  <td width='45%' class='title2' rowspan='5'>
                  	 1) 새로운 학술 또는 기술을 개발하기 위하여 시행하는 면세사업이외에 실비를 초과하는 수입      
                  </td>
                  <td width='50%' class='contant'>
                  	<input type="checkbox" id="chk10"> 
	                  	<xsl:if test="contains(tax_item, 'RBL001')">
	                       	<xsl:attribute name="checked"> checked</xsl:attribute>
	                    </xsl:if> 조사, 시험, 진단, 인증, 심사, 평가, 분석, 제작 등 업무/용역
                    </input>
                  </td>
                </tr>  
                <tr>
                	 <td width='50%' class='contant'>
                		<input type="checkbox" id="chk11"> 
		                  	<xsl:if test="contains(tax_item, 'RBL002')">
		                       	<xsl:attribute name="checked"> checked</xsl:attribute>
		                    </xsl:if> 제품 판매
                    	</input> 
                	</td>
                </tr>
                 <tr>
                 	 <td width='50%' class='contant'>
                 		<input type="checkbox" id="chk12"> 
		                  	<xsl:if test="contains(tax_item, 'RBL003')">
		                       	<xsl:attribute name="checked"> checked</xsl:attribute>
		                    </xsl:if> 부동산 및 기계장치임대수입
	                    </input> 
                 	</td>
                 </tr>  
                 <tr>
                 	 <td width='50%' class='contant'>
                 		<input type="checkbox" id="chk13"> 
		                  	<xsl:if test="contains(tax_item, 'RBL004')">
		                       	<xsl:attribute name="checked"> checked</xsl:attribute>
		                    </xsl:if> 기술료 수입
	                    </input>
                 	</td>
                 </tr> 
                 <tr>
                 	 <td width='50%' class='contant'>
                 		<input type="checkbox" id="chk14"> 
		                  	<xsl:if test="contains(tax_item, 'RBL005')">
		                       	<xsl:attribute name="checked"> checked</xsl:attribute>
		                    </xsl:if> 기타 수입
	                    </input>
                 	</td>
                 </tr> 
              </table>
            </td>
          </tr>
        </table>              
        <!-- 과세여부 (종료) -->

        <!-- [C]첨부파일 (시작) -->
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
                            	<xsl:attribute name="onclick">downloadForXsl('<xsl:value-of select="attach_file_no"/>
																			                            	 <xsl:value-of select="seq"/>', 'XAA001');return false;</xsl:attribute>
																											 <xsl:value-of select="file_nm" />
                            </a>
                          </td>
                        </tr>
                        </xsl:for-each>
                </table>
            </td>
        </tr>
        </table>
        <!-- [C]첨부파일 (종료) -->

      </body>


  </xsl:template>

</xsl:stylesheet>
