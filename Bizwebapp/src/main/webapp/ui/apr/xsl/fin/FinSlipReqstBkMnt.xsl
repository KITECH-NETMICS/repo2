<?xml version='1.0'?>
<xsl:stylesheet xmlns:LINS='http://www.inswave.com/LINS'
	xmlns:xsl='http://www.w3.org/1999/XSL/Transform' version='1.0'>
	<xsl:output method='xml' encoding='UTF-8' indent='yes'/>
<xsl:template match='/'>
<xsl:variable name='localPath' select='request/localPath'/>
	 <body>
	 <script type="text/javascript">
		<![CDATA[

			function createForm(nm, tg, act, met){
				var cForm = document.createElement("form"); 
				cForm.name = nm;
				cForm.target = tg;
				cForm.action = act;
				cForm.method = met;
				return cForm;
			}
			
			function createHidden(nm, val, frm){
				var hiddenInput=document.createElement("input");
				
				hiddenInput.setAttribute("type", "hidden");
				hiddenInput.setAttribute("name", nm);
				hiddenInput.setAttribute("value", val);
				frm.appendChild(hiddenInput);
				
				return frm;
			}

			/* 증빙구분 팝업 */
			function openItmEvidPop(unslip_no,unslip_odr,expns_cd,service_id, sn) {
			
				var evidWidth = "605px";
				var evidHeight ="455px";
				
				if(service_id =="F236"){
					evidWidth = "670px";
					evidHeight = "455px";
				}

				window.open("","itmEvidPop"+service_id,'width='+evidWidth+',height='+evidHeight+',top=50,left=150'); 

				var frm = createForm("popFrm", "itmEvidPop"+service_id, "https://biz.kitech.re.kr/filter/index.jsp", "get");
				frm = createHidden("serviceid", service_id, frm);
				frm = createHidden("unslipNo", unslip_no, frm);	
						
				frm = createHidden("unslipOdr", unslip_odr, frm);
				frm = createHidden("expnsCd", expns_cd, frm);
				frm = createHidden("sn", sn, frm);
				frm = createHidden("approvalYn", "Y", frm);
				frm = createHidden("requestFlag", "H", frm);

				document.body.appendChild(frm);
				frm.submit(); 
				
			}
			
			/* 크리스피드 이원길 미리보기 시작 */
			function openEvidWindow(unslipNo){
				var url = "https://evid.kitech.re.kr/sd/view?CLS=00&amp;amp;amp;amp;RESL_NO=" + unslipNo + "&amp;amp;amp;amp;EMP_NO=" + unslipNo;
				url = url.replaceAll("amp;","");
				window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
			}
			
					]]>
				</script>
	<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
	    <tr>
		<td class="body">
			<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
				<tr>
					<td width="10%" class='title2'>결의번호</td>
					<td width="15%" class='contant-center'><xsl:value-of select="hashtable/data[@hashkey='Header']/msgFspSliphSS06/unslip_no"/><br/></td>
					<td width="10%" class='title2'>신청부서</td>
					<td width="15%" class='contant'><xsl:value-of select="hashtable/data[@hashkey='Header']/msgFspSliphSS06/wrte_dept"/><br/></td>
					<td width="10%" class='title2'>신청자</td>
					<td width="15%" class='contant-center'><xsl:value-of select="hashtable/data[@hashkey='Header']/msgFspSliphSS06/wrte_psn"/><br/></td>
					<td width="12%" class='title2'>확정결의번호</td>
					<td width="13%" class='contant-center'><xsl:value-of select="hashtable/data[@hashkey='Header']/msgFspSliphSS06/slip_no"/><br/></td>
				</tr>
				<tr>
					<td class='title2'>신청일자</td>
					<td class='contant-center'>
						<xsl:value-of select="substring(hashtable/data[@hashkey='Header']/msgFspSliphSS06/slip_ymd,0,5)"/>-<xsl:value-of select="substring(hashtable/data[@hashkey='Header']/msgFspSliphSS06/slip_ymd,5,2)"/>-<xsl:value-of select="substring(hashtable/data[@hashkey='Header']/msgFspSliphSS06/slip_ymd,7,2)"/><br/>
					</td>
					<td class='title2'>계정책임자</td>
					<td class='contant-center'><br/></td>
					<td class='title2'>전화</td>
					<td class='contant-center'><xsl:value-of select="hashtable/data[@hashkey='Header']/msgFspSliphSS06/ext_no"/><br/></td>
					<td class='title2'>확정일자</td>
					<td class='contant-center'>
						<xsl:if test="hashtable/data[@hashkey='Header']/msgFspSliphSS06/accnt_ymd != ''">
							<xsl:value-of select="substring(hashtable/data[@hashkey='Header']/msgFspSliphSS06/accnt_ymd,0,5)"/>-<xsl:value-of select="substring(hashtable/data[@hashkey='Header']/msgFspSliphSS06/accnt_ymd,5,2)"/>-<xsl:value-of select="substring(hashtable/data[@hashkey='Header']/msgFspSliphSS06/accnt_ymd,7,2)"/>
						</xsl:if>
						<br/>
					</td>
				</tr>	
			  </table>
		</td>
	    </tr>
	</table>
		<p/>
		
	<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
		<tr>
			<td width="100%" class="head">결의내역</td>
			<!-- 크리스피드 이원길 미리보기 버튼 추가 시작 -->
			<td width="10%" align="right" valign="bottom">
				<a>
					<xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of  select="hashtable/data[@hashkey='Header']/msgFspSliphSS06/unslip_no"/>')</xsl:attribute>
					<img src="https://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/>
				</a>
			</td>
			<!-- 크리스피드 이원길 미리보기 버튼 추가 끝 -->
		</tr>
	</table>
	<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
	    <tr>
		<td class="body">
			<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
				<tr>
					<td width="4%"  class='title' rowspan='2'>순번</td>
					<td width="15%" class='title'>계정번호</td>
					<td width="25%" class='title'>비용</td>
					<td width="10%" class='title'>통제</td>
					<td width="18%" class='title'>차변</td>
					<td width="18%" class='title'>대변</td>
				</tr>
				<tr>
					<td colspan='2' class='title'>계정코드</td>
					<td  class='title'>책임자</td>
					<td colspan='2' class='title'>관련내역</td>
				</tr>
					<xsl:for-each select="hashtable/data[@hashkey='Detail']/vector/data">
				<tr>
					<td class="contant-center"  rowspan='3'><xsl:number count="hashtable/data[@hashkey='Detail']/vector/data" level="single" format="1"/><br/></td>
					<td class="contant-center"><xsl:value-of select="msgFspSlipdMS09/accnt_no"/><br/></td>
					<td class="contant-center"><xsl:value-of select="msgFspSlipdMS09/expns_cd"/><br/></td>
					<td class="contant-center"><xsl:value-of select="msgFspSlipdMS09/ctrl_no"/><br/></td>
					<td class="contant-right">
						<xsl:if test="msgFspSlipdMS09/debit_amt != ''">
							<xsl:value-of select="format-number(msgFspSlipdMS09/debit_amt, '#,###,###')"/>
						</xsl:if>
						<br/>
					</td>
					<td class="contant-right">
						<xsl:if test="msgFspSlipdMS09/cr_amt != ''">
							<xsl:value-of select="format-number(msgFspSlipdMS09/cr_amt, '#,###,###')"/>
						</xsl:if>
						<br/>
					</td>
				</tr>
				<tr>
					<td class="contant" colspan='2'><xsl:value-of select="msgFspSlipdMS09/rmk_1"/><br/></td>
					<td class="contant-center" ><xsl:value-of select="msgFspSlipdMS09/accnt_rspns"/><br/></td>
					<td class="contant" ><xsl:value-of select="msgFspSlipdMS09/mngmt_detls_cd1"/><br/></td>
					<td class="contant" ><xsl:value-of select="msgFspSlipdMS09/mngmt_detls_cd2"/><br/></td>
				</tr>
				<tr>
					<td class="contant" colspan='2'><xsl:value-of select="msgFspSlipdMS09/accnt_abbr_nm"/><br/></td>
					<td class="contant"><br/></td>
					<td class="contant"><xsl:value-of select="msgFspSlipdMS09/mngmt_detls_cd3"/><br/></td>
					<td class="contant"><xsl:value-of select="msgFspSlipdMS09/rmk_2"/><br/></td>
				</tr>
					</xsl:for-each>
			  </table>
		</td>
	    </tr>
	</table>
			
		<p/>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
			<tr>
				<td width="100%" class="head">지급내역</td>
			</tr>
		</table>
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
	    <tr>
		<td class="body">
			<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
				<tr>
					<td width="5%" class='title' rowspan='2'>순번</td>
					<td width="15%" class='title'>지급방법</td>
					<td width="15%" class='title'>발생일자</td>
					<td width="15%" class='title'>개인번호</td>
					<td width="15%" class='title'>거래처코드</td>
					<td width="15%" class='title'>승인번호</td>
					<td width="20%" class='title'>카드번호</td>
				</tr>
				<tr>
					<td  class='title'>가맹점</td>
					<td  class='title'>지로/현금 구분</td>
					<td  class='title'>송금은행</td>
					<td  class='title'>송금계좌번호</td>
					<td  class='title'>송금예금주명</td>
					<td  class='title'>금액</td>
				</tr>
					<xsl:for-each select="hashtable/data[@hashkey='Sendreq']/vector/data">
				<tr>
					<td class="contant-center" rowspan="2"><xsl:number count="hashtable/data[@hashkey='Sendreq']/vector/data" level="single" format="1"/><br/></td>
					<td class="contant-center"><xsl:value-of select="msgFspSendReqMS03/pay_clsf"/><br/></td>
					<td class="contant-center"><xsl:value-of select="msgFspSendReqMS03/slip_ymd"/><br/></td>
					<td class="contant-center"><xsl:value-of select="msgFspSendReqMS03/syspayno"/><br/></td>
					<td class="contant-center"><xsl:value-of select="msgFspSendReqMS03/vend_cd"/><br/></td>
					<td class="contant-center"><xsl:value-of select="msgFspSendReqMS03/apprvl_no"/><br/></td>
					<td class="contant-center"><xsl:value-of select="msgFspSendReqMS03/card_no"/><br/></td>
				</tr>
				<tr>
					<td  class="contant" ><xsl:value-of select="msgFspSendReqMS03/joinsto_nm"/><br/></td>
					<td  class="contant-center" ><xsl:value-of select="msgFspSendReqMS03/giro_cash_clsf"/><br/></td>
					<td  class="contant-center" ><xsl:value-of select="msgFspSendReqMS03/bank"/><br/></td>
					<td  class="contant" ><xsl:value-of select="msgFspSendReqMS03/bankaccnt_no"/><br/></td>
					<td  class="contant" ><xsl:value-of select="msgFspSendReqMS03/depstr_nm"/><br/></td>
					<td  class="contant-right" >
						<xsl:if test="msgFspSendReqMS03/send_req_amt != ''">
							<xsl:value-of select="format-number(msgFspSendReqMS03/send_req_amt, '#,###,###')"/>
						</xsl:if>
						<br/>
					</td>
				</tr>
					</xsl:for-each>
			  </table>
		</td>
	    </tr>
	</table>
	<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
        <tr>
            <td class="body">
                <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
                    <xsl:for-each select="hashtable/data[@hashkey='Attach']/vector/data/msgXomxComAttachFileMS01">
                    <tr>
                            <td class='title2' width="16%">첨부파일(<xsl:value-of select="unslip_no"/>-<xsl:value-of select="unslip_odr"/>)</td>
                            <td class='contant' width="84%">
                            <a><xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq"/>', 'XAA006')/<xsl:value-of select="org_file"/>")</xsl:attribute>
                               <xsl:value-of select="file_nm"/>
                            </a>
                            </td>
                    </tr>
                    </xsl:for-each>
                </table>
            </td>
        </tr>
    </table>
	<p/>
		
	</body>
</xsl:template>
</xsl:stylesheet>