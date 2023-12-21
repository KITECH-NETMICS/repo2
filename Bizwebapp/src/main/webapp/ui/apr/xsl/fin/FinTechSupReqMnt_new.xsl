<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="snapshot.css"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
xmlns:fo="http://www.w3.org/1999/XSL/Format"
>
<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
<xsl:template match="/">
	<body>
	<script language="javascript">
		<![CDATA[
			/* 크리스피드 이원길 미리보기 시작 */
			function openEvidWindow(unslipNo){
				var url = "https://evid.kitech.re.kr/sd/view?CLS=00&amp;amp;amp;RESL_NO=" + unslipNo + "&amp;amp;amp;EMP_NO=" + unslipNo;
				url = url.replaceAll("amp;","");
				window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
			}
			/* 크리스피드 이원길 미리보기 끝 */
		]]>
	</script>
	<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
	    <tr>
		<td class="body">
			 <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
				  <tr>
					<td width="12%" class="title2">신청번호</td>
					<td width="21%" class="contant-center"><xsl:value-of select="root/fspTechSuphVo/req_no"/><br/></td>
					<td width="12%" class="title2">신청부서</td>
					<td width="22%" class="contant"><xsl:value-of select="root/fspTechSuphVo/req_dept_nm"/><br/></td>
					<td width="12%" class="title2">신청일자</td>
					<td width="21%" class="contant-center"><xsl:value-of select="substring(root/fspTechSuphVo/req_ymd, 0, 5)"/>-<xsl:value-of select="substring(root/fspTechSuphVo/req_ymd, 5, 2)"/>-<xsl:value-of select="substring(root/fspTechSuphVo/req_ymd, 7, 2)"/><br/></td>
				  </tr>			  
				  <tr>
					<td class="title2">계정번호</td>
					<td class="contant" colspan="3"><xsl:value-of select="root/fspTechSuphVo/accnt_no"/><br/></td>
					<td class="title2">계정책임자</td>
					<td class="contant-center"><xsl:value-of select="root/fspTechSuphVo/accnt_rspns_nm"/>
										(
										<xsl:value-of select="substring(root/fspTechSuphVo/accnt_rspns,3,8)" />
										)<br/>					
					</td>
				  </tr>
				  <tr>
					<td class="title2">계정번호명</td>
					<td class="contant" colspan="5"><xsl:value-of select="root/fspTechSuphVo/accnt_no_nm"/><br/></td>
				  </tr>				  				  
				  <tr>
					<td class="title2">신청자</td>
					<td class="contant-center"><xsl:value-of select="root/fspTechSuphVo/req_psn_nm"/>
												(
												<xsl:value-of select="substring(root/fspTechSuphVo/req_psn,3,8)" />
												)<br/>					
					</td>
					<td class="title2">신청구분</td>
					<td class="contant-center"><xsl:value-of select="root/fspTechSuphVo/req_clsf_nm"/><br/></td>
					<td class="title2">결의번호</td>
					<td class="contant-center"><xsl:value-of select="root/fspTechSuphVo/unslip_no"/><br/></td>
				  </tr>			  
				  <tr>
					<td class="title2">접수부서</td>
					<td class="contant" colspan="3"><xsl:value-of select="root/fspTechSuphVo/rcpt_dept_nm"/><br/></td>
					<td class="title2">접수일자</td>
					<td class="contant-center" id="rcpt_ymd"><xsl:value-of select="substring(root/fspTechSuphVo/rcpt_ymd, 0,5)"/>-<xsl:value-of select="substring(root/fspTechSuphVo/rcpt_ymd, 5, 2)"/>-<xsl:value-of select="substring(root/fspTechSuphVo/rcpt_ymd, 7, 2)"/><br/></td>
				  </tr>		
				   <tr>
					<td class="title2">접수담당자</td>
					<td class="contant-center"><xsl:value-of select="root/fspTechSuphVo/rcpt_psn_nm"/>
										(
										<xsl:value-of select="substring(root/fspTechSuphVo/rcpt_psn,3,8)" />
										)<br/>					
					</td>
					<td class="title2">완료요구일자</td>
					<td class="contant-center"><xsl:value-of select="substring(root/fspTechSuphVo/complt_demnd_ymd, 0,5)"/>-<xsl:value-of select="substring(root/fspTechSuphVo/complt_demnd_ymd, 5, 2)"/>-<xsl:value-of select="substring(root/fspTechSuphVo/complt_demnd_ymd, 7, 2)"/><br/></td>
					<td class="title2">접수번호</td>
					<td class="contant-center"> <xsl:value-of select="root/fspTechSuphVo/rcpt_no"/><br/></td>
				  </tr>		  
				  <tr>
					<td class="title2">신청금액</td>
					<td class="contant-right">
						<xsl:value-of select="format-number(root/fspTechSuphVo/req_amt, '#,###')"/><br/>
					</td>
					<td class="title2">통제금액</td>
					<td class="contant-right">						
						<xsl:attribute name="id">
							<xsl:text>reqAmt1</xsl:text>
						</xsl:attribute>
						<xsl:value-of select="format-number(root/fspTechSuphVo/ctrl_amt, '#,###')"/><br/>
					</td>
					<td class="title2">통제번호</td>
					<td class="contant-center">
						<xsl:attribute name="id">
							<xsl:text>ctrlNo1</xsl:text>
						</xsl:attribute>
						<xsl:value-of select="root/fspTechSuphVo/ctrl_no"/><br/>
					</td>
				  </tr>
				
				  <tr>
					<td class="title2">비고</td>
					<td colspan="3" class="contant"><xsl:value-of select="root/fspTechSuphVo/rmk"/><br/></td>
					<td class="title2">공용실험실</td>
					<td class="contant-center"><xsl:value-of select="root/fspTechSuphVo/supt_clsf_nm"/><br/></td>
				  </tr>
				  <tr>
				  	<td class="title2">결의번호</td>
					<td class="contant-center"><xsl:value-of select="root/fspTechSuphVo/unslip_no"/><br/></td>
					<td colspan="4" class="contant-center" valign="center" style="padding:0">
						<xsl:if test="root/fspTechSuphVo/unslip_no != ''">
						<a>
							<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="root/fspTechSuphVo/unslip_no" />')</xsl:attribute>
							<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif" style="display:block;vertical-align:top;padding-left:10px"/>
						</a>
						</xsl:if>
					</td>
				  </tr>
			</table>		
			<p/>			
			</td>
		    </tr>
		</table>			
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
		<tr>
			<td width="100%" class="head">기술지원내역</td>
		</tr>
	</table>
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
		<tr>
		<td class="body">
			  <table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
				<tr>
					<td width="5%" class="title">순번</td>
					<td width="15%" class="title">의뢰시료명</td>
					<td width="10%" class="title">시험항목</td>
					<td width="8%" class="title">수량</td>
					<td width="8%" class="title">시간</td>
					<td width="8%" class="title">단가</td>
					<td width="8%" class="title">금액</td>
					<td width="38%" class="title">비고</td>
				</tr>
					<xsl:if test="root/fspTechSupdVoList != ''">
					<xsl:for-each select="root/fspTechSupdVoList">
				<tr>
					<td  class="contant-center"><xsl:value-of select="req_odr"/><br/></td>
					<td  class="contant"><xsl:value-of select="supt_detls"/><br/></td>
					<td  class="contant"><xsl:value-of select="test"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="qty"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="time"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="format-number(unit_price, '#,###')"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="format-number(amt, '#,###')"/><br/></td>
					<td  class="contant"><xsl:value-of select="rmk"/><br/></td>
				</tr>
					</xsl:for-each>
					</xsl:if>
			  </table>					
			</td>
		    </tr>
		</table>
		<p/>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
		<tr>
			<td width="100%" class="head">장비사용내역</td>
		</tr>
	</table>
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
	    <tr>
		<td class="body">
			<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
				<tr>
					<td width="5%"  class="title">순번</td>
					<td width="10%" class="title">장비번호</td>
					<td width="21%" class="title">장비명</td>
					<td width="10%" class="title">사용시작일자</td>
					<td width="8%"  class="title">시작시간</td>
					<td width="10%" class="title">사용종료일자</td>
					<td width="8%"  class="title">종료시간</td>
					<td width="8%"  class="title">사용시간</td>
					<td width="10%" class="title">사용단가</td>
					<td width="10%" class="title">사용금액</td>
				</tr>
				<xsl:if test="root/fspEquipUseVoList != ''">
				<xsl:for-each select="root/fspEquipUseVoList">
				<tr>
					<td  class="contant-center"><xsl:number count="root/fspEquipUseVoList" level="single" format="1"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="equip_no"/><br/></td>
					<td  class="contant"><xsl:value-of select="asset_name"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="substring(use_start_ymd, 0, 5)"/>-<xsl:value-of select="substring(use_start_ymd, 5, 2)"/>-<xsl:value-of select="substring(use_start_ymd, 7, 2)"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="use_start_time"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="substring(use_cls_ymd, 0, 5)"/>-<xsl:value-of select="substring(use_cls_ymd, 5, 2)"/>-<xsl:value-of select="substring(use_cls_ymd, 7, 2)"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="use_cls_time"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="use_time"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="format-number(use_unit_price, '#,###')"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="format-number(use_amt, '#,###')"/><br/></td>				 
				</tr>
				</xsl:for-each>
				</xsl:if>
			</table>					
			</td>
		    </tr>
		</table>
			<p/>
			<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
		<tr>
			<td width="100%" class="head">재료사용내역</td>
		</tr>
	</table>
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
	    <tr>
		<td class="body">
			<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
				<tr>
					<td width="5%" class="title">순번</td>
					<td width="20%" class="title">시약재료명</td>
					<td width="15%" class="title">규격</td>
					<td width="20%" class="title">단가</td>
					<td width="20%" class="title">수량</td>
					<td width="20%" class="title">금액</td>
				</tr>
				<xsl:if test="root/fspTechSupMatrlVoList != ''">
				<xsl:for-each select="root/fspTechSupMatrlVoList">
				<tr>
					<td  class="contant-center"><xsl:value-of select="req_odr"/><br/></td>
					<td  class="contant"><xsl:value-of select="matrl_nm"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="matrl_std"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="format-number(unit_price, '#,###')"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="format-number(qty, '#,###')"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="format-number(amt, '#,###')"/><br/></td>
				</tr>
				</xsl:for-each>
				</xsl:if>
			  </table>		
			</td>
		    </tr>
		</table>
		<p/>	  
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
		<tr>
			<td width="100%" class="head">인력지원내역</td>
		</tr>
	</table>
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
		    <tr>
			<td class="body">
			<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
				<tr>
					<td width="5%" class="title">순번</td>
					<td width="10%" class="title">지원자</td>
					<td width="10%" class="title">성명</td>
					<td width="10%" class="title">기술등급</td>
					<td width="10%" class="title">단가</td>
					<td width="10%" class="title">시간</td>
					<td width="10%" class="title">금액</td>
					<td width="35%" class="title">비고</td>
				</tr>
				<xsl:if test="root/fspTechSupPsnVoList != ''">
				<xsl:for-each select="root/fspTechSupPsnVoList">
				<tr>
					<td  class="contant-center"><xsl:value-of select="req_odr"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="supt_psn"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="nm"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="tech_grd"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="format-number(unit_price, '#,###')"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="format-number(time, '##.00')"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="format-number(amt, '#,###')"/><br/></td>
					<td  class="contant"><xsl:value-of select="rmk"/><br/></td>
				</tr>
				</xsl:for-each>
				</xsl:if>
			 </table>
		</td>
	    </tr>
	</table>
	<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
        <tr>
            <td class="head"> 첨부파일</td>
        </tr>
        <tr>
            <td class="body">
                <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
                    <xsl:for-each select="root/fileList">
                    <tr>
	                    <td class="title2" width="16%">첨부파일</td>
	                    <td class="contant" width="84%">
	                    <a><xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA001')</xsl:attribute>
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
	                    </td>
                    </tr>
                    </xsl:for-each>
                </table>
            </td>
        </tr>
    </table>
	</body>
</xsl:template>
</xsl:stylesheet>