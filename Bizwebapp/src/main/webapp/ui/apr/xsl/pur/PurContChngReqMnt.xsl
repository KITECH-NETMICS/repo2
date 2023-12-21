<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
 	 <xsl:variable name="localPath" select="request/localPath"/>
			<BODY>

 				<script language="javascript">
				<![CDATA[
					function fileDown_backup (a, b) {
						var attachFullPath = a;
			    		var orgFileName = b;
			    		
			    		//var localPath = "/was/WebSphere/AppServer/profiles/AppSrv01/installedApps/kwas1Cell01/biz.ear/bizweb.war/kitechfiles/"; 
			    		
			    		var localPath   = "/was/IMIS_FILES/";
			       		var path = localPath + attachFullPath;
			       		
						window.FilePath = path;
			       		window.orgFileName =  orgFileName;
			       		
			       		window.open("https://biz.kitech.re.kr/kitech/com/html/fileView.html?idx=" + (new Date()).getTime() + Math.random() * 10000);
					}
					
					function fileDown (orgFile, attachFullPath) {
					
  						//var localPath   = "/was/WebSphere/AppServer/profiles/AppSrv01/installedApps/kwas1Cell01/biz.ear/bizweb.war/kitechfiles/";
  						var localPath   = "/was/IMIS_FILES/";
						var loPath 		= localPath + attachFullPath;
						var orgFileName = orgFile; 						 
						var frm 		= createForm("frmXsl", "ifr", "https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp", "get");
						
						frm = createHidden("FilePath", loPath, frm);
						frm = createHidden("orgFileName", orgFileName, frm);
						
						/*IE9, IE10, 크롬 등에서 호환성 보기 없이 실행되도록 보완(2013.08.01)*/
						//document.insertBefore(frm);
						document.body.appendChild(frm);
						
						frm.submit();
					}					
				
 					function createForm(nm, tg, act, met){
 						var cForm = document.createElement("form"); 
						cForm.name = nm;
						cForm.target = tg;
						cForm.action = act;
						cForm.method = met;
 						return cForm;
 					}
 					
 					function createHidden(nm, val, frm){
 						/*IE9, IE10, 크롬 등에서 호환성 보기 없이 실행되도록 보완(2013.08.01)*/
						var hiddenInput=document.createElement("input");
						
						/*
						hiddenInput.type="hidden";
						hiddenInput.name=nm;
						hiddenInput.value=val;
						frm.insertBefore(hiddenInput);
 						*/
 						
 						hiddenInput.setAttribute("type", "hidden");
						hiddenInput.setAttribute("name", nm);
						hiddenInput.setAttribute("value", val);
						frm.appendChild(hiddenInput);
						
						 return frm;
 					} 				
    		 	]]></script>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
                                <tr>
                                    <td class='title2' width="16%">변경구분</td>
                                    <td class="contant">
                                        <input type='checkbox' name='req_clsf' id="req_clsf1" value="a">
                                            <xsl:if test="contains(response/selectChng/msgPurContrctChng02/contrct_amt_chng_yn, 'Y')">
                                                <xsl:attribute name="checked">Y</xsl:attribute>
                                            </xsl:if>계약금액
                                        </input>							
                                        <input type='checkbox' name='req_clsf' id="req_clsf2" value="a">
                                            <xsl:if test="contains(response/selectChng/msgPurContrctChng02/contrct_prd_chng_yn, 'Y')">
                                                <xsl:attribute name="checked">Y</xsl:attribute>
                                            </xsl:if>계약기간
                                        </input>
                                    </td>
                                    <td class='title2' width="16%">구매구분</td>
                                    <td class="contant"><xsl:value-of select="response/selectMaster/msgPurContrctChng01/pur_clsf_desc" /></td>
                                </tr>
                                <tr>
                                    <td class='title2' >구매요청번호</td>
                                    <td class="contant"><xsl:value-of select="response/selectMaster/msgPurContrctChng01/pur_req_no" /></td>
                                    <td class='title2' >구매방법</td>
                                    <td class="contant"><xsl:value-of select="response/selectMaster/msgPurContrctChng01/contrct_way_desc" /></td>
                                </tr>
                                <tr>
                                    <td class='title2' >계약명</td>
                                    <td class="contant"><xsl:value-of select="response/selectMaster/msgPurContrctChng01/contrct_nm" /></td>
                                    <td class='title2' >계약일자</td>
                                    <td class="contant"><xsl:value-of select="substring(response/selectMaster/msgPurContrctChng01/contrct_ymd, 1, 4)" />-<xsl:value-of select="substring(response/selectMaster/msgPurContrctChng01/contrct_ymd, 5, 2)" />-<xsl:value-of select="substring(response/selectMaster/msgPurContrctChng01/contrct_ymd, 7, 2)" /></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
				
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 거래처</td>
					</tr>
					<tr>
						<td class="body">
                            <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
                                <tr>
                                    <td class='title' width="16%" >거래처구분</td>
                                    <td class='title' width="16%" >거래처번호</td>
                                    <td class='title' >거래처명</td>
                                    <td class='title' width="13%" >대표자</td>
                                    <td class='title' width="18%" >전화번호</td>
                                </tr>
                                <xsl:for-each select="response/selectCntVend/vector/data">
                                <tr>
                                    <td class="contant-center"><xsl:value-of select="msgPurContrctVend/vend_clsf_desc" /></td>
                                    <td class="contant-center"><xsl:value-of select="msgPurContrctVend/contrct_vend_cd" /></td>
                                    <td class="contant"><xsl:value-of select="msgPurContrctVend/vend_nm" /></td>
                                    <td class="contant-center"><xsl:value-of select="msgPurContrctVend/reprs_psn" /></td>
                                    <td class="contant-center"><xsl:value-of select="msgPurContrctVend/tel" /></td>
                                </tr>
                                </xsl:for-each>
                            </table>
                        </td>
                    </tr>
                </table>
					
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> 변경내역</td>
					</tr>
					<tr>
						<td class="body">
                            <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
                                <tr>
                                    <td class='title2' width="16%" >신청번호</td>
                                    <td class="contant"><xsl:value-of select="response/selectChng/msgPurContrctChng02/contrct_chng_req_no" /></td>
                                    <td class='title2' width="16%" >신청일자</td>
                                    <td class="contant"><xsl:value-of select="substring(response/selectChng/msgPurContrctChng02/req_ymd, 1, 4)" />-<xsl:value-of select="substring(response/selectChng/msgPurContrctChng02/req_ymd, 5, 2)" />-<xsl:value-of select="substring(response/selectChng/msgPurContrctChng02/req_ymd, 7, 2)" /></td>
                                </tr>
                                <tr>
                                    <td class='title2' >변경전 계약금액</td>
                                    <td class="contant"><xsl:if test="response/selectChng/msgPurContrctChng02/chng_befr_contrct_amt != ''">
                                    					<xsl:value-of select="format-number(response/selectChng/msgPurContrctChng02/chng_befr_contrct_amt, '#,###')" />
                                    					</xsl:if>
                                    </td>
                                    <td class='title2' >변경후 계약금액</td>
                                    <td class="contant"><xsl:if test="response/selectChng/msgPurContrctChng02/chng_aftr_contrct_amt != ''">
                                                        <xsl:value-of select="format-number(response/selectChng/msgPurContrctChng02/chng_aftr_contrct_amt, '#,###')" />
                                                        </xsl:if>
                                    </td>
                                </tr>
                                <tr>
                                    <td class='title2' >변경전 계약기간</td>
                                    <td class="contant"><xsl:if test="response/selectChng/msgPurContrctChng02/chng_befr_contrct_start_ymd != ''">
                                        				<xsl:value-of select="substring(response/selectChng/msgPurContrctChng02/chng_befr_contrct_start_ymd, 1, 4)" />-<xsl:value-of select="substring(response/selectChng/msgPurContrctChng02/chng_befr_contrct_start_ymd, 5, 2)" />-<xsl:value-of select="substring(response/selectChng/msgPurContrctChng02/chng_befr_contrct_start_ymd, 7, 2)" /> ~
                                        				<xsl:value-of select="substring(response/selectChng/msgPurContrctChng02/chng_befr_contrct_cls, 1, 4)" />-<xsl:value-of select="substring(response/selectChng/msgPurContrctChng02/chng_befr_contrct_cls, 5, 2)" />-<xsl:value-of select="substring(response/selectChng/msgPurContrctChng02/chng_befr_contrct_cls, 7, 2)" />
                                        				</xsl:if>
                                    </td>
                                    <td class='title2' >변경후 계약기간</td>
                                    <td class="contant"><xsl:if test="response/selectChng/msgPurContrctChng02/chng_aftr_contrct_start_ymd != ''">
                                        				<xsl:value-of select="substring(response/selectChng/msgPurContrctChng02/chng_aftr_contrct_start_ymd, 1, 4)" />-<xsl:value-of select="substring(response/selectChng/msgPurContrctChng02/chng_aftr_contrct_start_ymd, 5, 2)" />-<xsl:value-of select="substring(response/selectChng/msgPurContrctChng02/chng_aftr_contrct_start_ymd, 7, 2)" /> ~
                                        				<xsl:value-of select="substring(response/selectChng/msgPurContrctChng02/chng_aftr_contrct_cls, 1, 4)" />-<xsl:value-of select="substring(response/selectChng/msgPurContrctChng02/chng_aftr_contrct_cls, 5, 2)" />-<xsl:value-of select="substring(response/selectChng/msgPurContrctChng02/chng_aftr_contrct_cls, 7, 2)" />
                                        				</xsl:if>
                                    </td>
                                </tr>
                                <tr>
                                    <td class='title2' >변경사유</td>
                                    <td class="contant" colspan="3"><xsl:value-of select="response/selectChng/msgPurContrctChng02/chng_resn" /></td>
                                </tr>
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
                                <xsl:for-each select="response/fileList_A/vector/data/msgXomxComAttachFileMS01">
                                <tr>
                                	<td class="contant">
                                        <a>
                                        <xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA004')</xsl:attribute>
                                		<xsl:value-of select="org_file" />
                                		</a>
                                	</td>
                                </tr>
                                </xsl:for-each> 
                            </table>
                        </td>
                    </tr>
                </table>	
			
			</BODY>
	</xsl:template>
</xsl:stylesheet>