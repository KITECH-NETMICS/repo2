<?xml version='1.0'?>
<xsl:stylesheet xmlns:LINS='http://www.inswave.com/LINS'
	xmlns:xsl='http://www.w3.org/1999/XSL/Transform' version='1.0'>
	<xsl:output method='xml' encoding='UTF-8' indent='yes' />
	<xsl:template match='/'>
		<xsl:variable name='localPath'	select='request/localPath' />
			<body>
			<script language="javascript" type="text/javascript">
			<![CDATA[ 
			
				var oldId = "";
				var oldId2 = "";
				
				function chngData(odr){
				    try{				
						var chngId = "R"+odr;	
						var chngId2 = "RR"+odr;
						if(chngId == oldId){
							return;
						}
	
						docR = document.getElementById("relTab");
						docOld = document.getElementById(oldId);
						docOld2 = document.getElementById(oldId2);
						docChng = document.getElementById(chngId);
						docChng2 = document.getElementById(chngId2);
	
						docChng.style.display = 'block';
						docChng2.style.display = 'block';
						if(oldId != ""){
							docOld.style.display = 'none';
							docOld2.style.display = 'none';
						}
						var i = 0;
						while(i != docR.all.length-1){
							if(docR.all[i].id != null){
								if(docR.all[i].id.length != 0){
									if(chngId == docR.all[i].id){
										docR.all[i].style.display = 'block';
									}
								}
							}
							i++;
						}
	
						oldId = chngId;
						oldId2 = chngId2;
				    }catch(e){
						alert(e.toString()+"데이터가 존재하지 않습니다.");
				    }

				}
				
				function openTransReasonOZPop(unslipNo){
					var instnceNm = unslipNo.trim();
					var ozFileNm = "fin/fin/spa/FinAccntTransReasonSel.ozr";
					var ozrNm = "FinAccntTransReasonSel";
					var paramNm = "unslip_no";					
					var url = "https://biz.kitech.re.kr/filter/index.jsp?serviceid=F982";
					var node = url+"&ozFileNm="+ozFileNm+"&ozrNm="+ozrNm+"&paramNm="+paramNm+"&instnceNm="+instnceNm;		
					
                    node = node.replaceAll("amp;","");
                    if(navigator.appName != "Microsoft Internet Explorer"){
						node = node.replaceAll("amp;","");
		            }								

					window.open(node,"OZReport", "width=1012px, height=610px, location=no, resizable=yes");   
				}

				function openBfSlipDecsndOZPop(unslipNo){
					var instnceNm = unslipNo.trim();
					var ozFileNm = "fin/fin/leg/FinAccntLedger6Sel.ozr";
					var ozrNm = "FinAccntLedger6Sel";
					var paramNm = "unslip_no";
					var url = "https://biz.kitech.re.kr/filter/index.jsp?serviceid=F982";
					var node = url+"&ozFileNm="+ozFileNm+"&ozrNm="+ozrNm+"&paramNm="+paramNm+"&instnceNm="+instnceNm;
                    node = node.replaceAll("amp;","");
                    if(navigator.appName != "Microsoft Internet Explorer"){
						node = node.replaceAll("amp;","");	
		            }
                    
					window.open(node,"OZReport", "width=1012px, height=610px, location=no, resizable=yes");                 						
				}
				
				function conV() {
					node.replaceAll()
				}
				
			    String.prototype.replaceAll = replaceAll;
				function replaceAll(str1, str2){
				 
				 var strTemp = this;
				 strTemp = strTemp.replace(new RegExp(str1, "g"), str2);
				 return strTemp;
				}

			]]> 
		</script>	
	  <br/>	
	   <table width="100%" border="0" cellpadding="0" cellspacing="10" class="aproutertable">
	    <tr>
		<td class="body">
			
			<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
				<tr>
					<td width="10%" class='title'>결의일자</td>
					<td  width="10%" class="contant-center"><xsl:value-of select="hashtable/data[@hashkey='Header']/msgFspSliphSS09/slip_ymd"/><br/></td>
					<td width="10%" class='title'>작성일자</td>
					<td  width="10%" class="contant-center"><xsl:value-of select="hashtable/data[@hashkey='Header']/msgFspSliphSS09/wrte_ymd"/><br/></td>
					<td width="10%" class='title'>작성자</td>
					<td  width="10%" class="contant-center"><xsl:value-of select="hashtable/data[@hashkey='Header']/msgFspSliphSS09/nm"/><br/></td>
					<td width="10%" class='title'>작성부서</td>
					<td  width="30%" class="contant-center"><xsl:value-of select="hashtable/data[@hashkey='Header']/msgFspSliphSS09/dept_nm"/><br/></td>
				</tr>
				<tr>
					<td class='title'>회계일자</td>
					<td class="contant-center"><xsl:value-of select="hashtable/data[@hashkey='Header']/msgFspSliphSS09/accnt_ymd"/><br/></td>
					<td class='title'>결의유형</td>
					<td class="contant-center"><xsl:value-of select="Ahashtable/data[@hashkey='Header']/msgFspSliphSS09/slip_typ_cd"/><br/></td>
					<td class='title'>결의번호</td>
					<td class="contant-center"><xsl:value-of select="hashtable/data[@hashkey='Header']/msgFspSliphSS09/unslip_no"/><br/></td>
					<td class='title'>적요</td>
					<td class="contant-center"><xsl:value-of select="hashtable/data[@hashkey='Header']/msgFspSliphSS09/rmk"/><br/></td>
				</tr>
			  </table>		
			</td>
		    </tr>
		</table><br/><br/>

		<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
			<tr>
				<td width="100%" class="head">변경 전 계정</td>
			</tr>
		</table>
	   <table width="100%" border="0" cellpadding="0" cellspacing="10" class="aproutertable">
	    <tr>
		<td class="body">
			<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable" >
				<tr>
					<td width="5%" class='title' >No</td>
					<td width="6%" class='title'>계정번호</td>
					<td width="8%" class='title'>계정<br/>책임자</td>
					<td width="6%" class='title'>회계코드</td>
					<td width="8%" class='title'>회계<br/>코드명</td>
					<td width="7%" class='title'>비용<br/>코드</td>
					<td width="5%" class='title'>비용<br/>코드명</td>
					<td width="10%" class='title'>금액</td>
					<td width="10%" class='title'>통제번호</td>
					<td width="35%" class='title'>비고</td>
				</tr>

				<xsl:for-each select="hashtable/data[@hashkey='DetailBf']/vector/data">
				<tr>
					<xsl:attribute name="ONCLICK1">chngData('<xsl:number count="hashtable/data[@hashkey='DetailBf']/vector/data" level="single" format="1"/>')</xsl:attribute>
					<td  class="contant-center"><xsl:number count="hashtable/data[@hashkey='DetailBf']/vector/data" level="single" format="1"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS12/accnt_no"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS12/rspns_nm"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS12/accnt_cd"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS12/accnt_cd_abbr"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS12/expns_cd"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS12/expns_cd_nm"/><br/></td>
					<td  class="contant-right"><xsl:value-of select="format-number(msgFspSlipdMS12/unslip_amt, '#,###,###')"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS12/ctrl_no"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS12/rmk_1"/><br/></td>
					 
				</tr>
				</xsl:for-each>
			</table>					
			</td>
		    </tr>
		</table><br/><br/>

		<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
			<tr>
				<td width="100%" class="head">변경 후 계정</td>
			</tr>
		</table>
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
	    <tr>
		<td class="body">
			<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable" >
				<tr>
					<td width="5%" class='title' rowspan="2">No</td>
					<td width="10%" class='title'>계정번호</td>
					<td width="30%" class='title'>계정명</td>
					<td width="10%" class='title'>회계<br/>코드</td>
					<td width="15%" class='title'>회계<br/>코드명</td>
					<td width="6%" class='title'>비용<br/>코드</td>
					<td width="11%" class='title'>비용<br/>코드명</td>
					<td width="13%" class='title'>금액</td>
				</tr>
				<tr>
					<td class='title' colspan="3">적요</td>
					<td class='title'>거래처</td>
					<td class='title'>증빙</td>
					<td class='title'>첨부파일</td>
					<td class='title'>편성단위</td>
				</tr>
				<xsl:for-each select="hashtable/data[@hashkey='DetailAf']/vector/data">
				<tr>
					<xsl:attribute name="id">R<xsl:number count="hashtable/data[@hashkey='DetailAf']/vector/data" level="single" format="1"/></xsl:attribute>
					<td  class="contant-center" rowspan="2"><xsl:number count="hashtable/data[@hashkey='DetailAf']/vector/data" level="single" format="1"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS13/accnt_no"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS13/accnt_no_nm"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS13/accnt_cd"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS13/accnt_cd_abbr"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS13/expns_cd"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS13/expns_cd_nm"/><br/></td>
					<td  class="contant-center" align="right"><xsl:value-of select="format-number(msgFspSlipdMS13/unslip_amt, '#,###,###')"/><br/></td>
					 
				</tr>
				<tr>
					<xsl:attribute name="id">RR<xsl:number count="hashtable/data[@hashkey='DetailAf']/vector/data" level="single" format="1"/></xsl:attribute>
					<td  class="contant-center" colspan="3"><xsl:value-of select="msgFspSlipdMS13/rmk_1"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS13/vend_abbr"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS13/evid_cd"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS13/attach_file_no"/><br/></td>
					<td  class="contant-center"><xsl:value-of select="msgFspSlipdMS13/fomat_unit"/><br/></td>
				</tr>
				</xsl:for-each>
			</table>					
			</td>
		    </tr>
		</table>
		<p/><p/>


		<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aproutertable">
			<tr>
				<td width="100%" class="head">관련내역</td>
			</tr>
		</table>
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
		    <tr>
			<td  class="body">
			<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable" id="relTab">
				<tr>
					<td width="5%" class='title'>No</td>
					<td width="10%" class='title'>가결의순번</td>
					<td width="15%" class='title'>관리항목</td>
					<td width="15%" class='title'>세부적요</td>
					<td width="55%" class='title'>세부적요명</td>
				</tr>
				<xsl:for-each select="hashtable/data[@hashkey='Mngmt']/vector/data">
				<tr>
					<xsl:attribute name="id">R<xsl:value-of select="msgFspSlipMngmtMS01/unslip_odr"/>
					</xsl:attribute>
					<td  class="contant-center" ><xsl:number count="hashtable/data[@hashkey='Mngmt']/vector/data" level="single" format="1"/><br/></td>
					<td  class="contant-center" ><xsl:value-of select="msgFspSlipMngmtMS01/unslip_odr"/><br/></td>
					<td  class="contant-center" ><xsl:value-of select="msgFspSlipMngmtMS01/mngmt_item_nm"/><br/></td>
					<td  class="contant-center" ><xsl:value-of select="msgFspSlipMngmtMS01/mngmt_detls_cd"/><br/></td>
					<td  class="contant-center" ><xsl:value-of select="msgFspSlipMngmtMS01/mngmt_detls_nm"/><br/></td>
				</tr>
				</xsl:for-each>
			 </table>
		</td>
	    </tr>
	</table>
	<p/><p/>	
	<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
		<tr>
			<td class="head">사유서</td>
		</tr>
		<tr>
			<td class="body">
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
					<tr>
						<td class='title2' width="16%">사유서</td>
						<td class='contant' width="34%">
							
							<a><xsl:attribute name="href">javascript:openTransReasonOZPop("<xsl:value-of select="hashtable/data[@hashkey='Header']/msgFspSliphSS09/unslip_no" />")</xsl:attribute>
							사유서
							</a>
						</td>
						<td class='title2' width="16%">변경전원장</td>
						<td class='contant' width="34%">
							<a><xsl:attribute name="href">javascript:openBfSlipDecsndOZPop("<xsl:value-of select="hashtable/data[@hashkey='Header']/msgFspSliphSS09/unslip_no" />")</xsl:attribute>
							변경전원장
							</a>
						</td>						
					</tr>
					<tr>
						<td colspn="4" height="0"> </td>
					</tr>
				</table>
			</td>
		</tr>
    </table>	
	<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
        <tr>
            <td class="head">첨부파일</td>
        </tr>
        <tr>
            <td class="body">
                <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
                    <xsl:for-each select="hashtable/data[@hashkey='Attach']/vector/data/msgXomxComAttachFileMS01">
                    	<xsl:if test="seq != ''">
                    <tr>
                            <td class='title2' width="16%">첨부파일(<xsl:value-of select="seq"/>)</td>
                            <td class='contant' width="84%">
                            <a><xsl:attribute name="href">javascript:xslFileDownload("<xsl:value-of select="attach_full_path" />/<xsl:value-of select="org_file"/>")</xsl:attribute>
                               <xsl:value-of select="file_nm"/>
                            </a>
                            </td>
                    </tr>
                    	</xsl:if>
                    </xsl:for-each>
                    <tr>
                            <td colspn="2" height="0"> </td>
                            
                    </tr>
                </table>
            </td>
        </tr>
    </table>
	<p/><p/>
	</body>
</xsl:template>
</xsl:stylesheet>