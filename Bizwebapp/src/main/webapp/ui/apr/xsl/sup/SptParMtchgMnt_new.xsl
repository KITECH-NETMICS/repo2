<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
 	 <xsl:variable name="localPath" select="/"/>
			<BODY>
			   <form name="frmXsl" target="blank" action="https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
				<INPUT type="hidden" name="FilePath" size="25" />
				<INPUT type="hidden" name="orgFileName" size="25" />
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable" >
					<tr>
						<td class="head"> * 파트너 기업정보</td>
					</tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class='title2' width="16%">신청번호</td>
							  		<td class="contant">
							  		<xsl:value-of select="root/supParCustMentrChnghVo/req_no" />
							  		</td>
							  		<td class='title2' width="16%">신청일자</td>
							  		<td class="contant">
							  		<xsl:value-of select="root/supParCustMentrChnghVo/req_ymd" />
							  		</td>
							  	</tr>
							  	<tr>
							  		<td class='title2' width="16%">기업명</td>
							  		<td class="contant">
							  		<xsl:value-of select="root/supParCustMentrChnghVo/cmpy_nm_krchar" />
							  		</td>
							  		<td class='title2' width="16%">사업자등록번호</td>
							  		<td class="contant">
							  		<xsl:value-of select="root/supParCustMentrChnghVo/bsns_psn_regst_no" />
							  		</td>
							    </tr>
							    <tr>
							  		<td class='title2' width="16%">대표자</td>
							  		<td class="contant">
							  		<xsl:value-of select="root/supParCustMentrChnghVo/reprs_psn" />
							  		</td>
							  		<td class='title2' width="30%">파트너기업 지정번호</td>
							  		<td class="contant"><xsl:value-of select="root/supParCustMentrChnghVo/appont_no" /></td>
							    </tr>
							    <tr>
							  		<td class='title2' width="16%">변경사유</td>
							  		
							  		<td class="contant" colspan='3'><xsl:value-of select="root/supParCustMentrChnghVo/chgn_resn" /></td>
							    </tr>
							    <tr>
							  		<td class='title2' width="16%">소연심의 회차</td>
							  		
							  		<td class="contant" colspan='3'><xsl:value-of select="root/supParCustMentrChnghVo/rmk" /></td>
							    </tr>
								<tr>
							  		<td class='title2' width="16%">첨부파일</td>
							  		<td class="contant" colspan='3'>
							  			<TABLE class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
											<xsl:for-each select="root/fileList">
												<TR>
													<TD class="contant">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA005')</xsl:attribute>
															<xsl:value-of select="file_nm" />
														</a>
													</TD>
												</TR>
											</xsl:for-each>
										</TABLE>
							  		</td>
							    </tr>
					         </table>
                        </td>
                 
                </table>
				<br></br>
			
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head" colspan='3'>* 파트너 멘토 변경내역 </td>
					</tr>
					<tr>
							<td width='48%'>
								 <table width="100%" border="1" cellpadding="0" cellspacing="0" class="aprinnertable">
                                  <tr>
                                  
                                    <td colspan="5" class='title'>변경전</td>
                                   
                                </tr>
                                <tr>
                                	  <td class='title' colspan='2' width='27%'>성명</td>
                                    <td class='title'  width='33%'>관리지역</td>
                                    <td class='title' width='20%'>부서</td>
                                    <td class='title' width='20%'>직책</td>
                                </tr>
                                <xsl:for-each select="root/beforeMentoList">
                                <tr>
					        		<td class="contant-center">
					        				<xsl:value-of select="empno" />
					        		</td>
					        		<td class="contant-center">
					        				<xsl:value-of select="nm" />
					        		</td>
					        		<td class="contant-center">
					        				<xsl:value-of select="mngmt_regionm" />
					        		</td>
					        		<td class="contant-center">
					        				<xsl:value-of select="dept_nm" />
					        		</td>
					        		<td class="contant-center">
					        				<xsl:value-of select="posi_nm" />
					        		</td>
					        		</tr>
					        		</xsl:for-each>
					        		
                                </table>
                                
							</td>
							<td width='4%'>
							
							</td>
							<td width='48%'>
								 <table width="100%" border="1" cellpadding="0" cellspacing="0" class="aprinnertable">
                                  <tr>
                                  
                                    <td colspan="5" class='title'>변경후</td>
                                   
                                </tr>
                                 <tr>
                                	   <td class='title' colspan='2' width='27%'>성명</td>
                                    <td class='title'  width='33%'>관리지역</td>
                                    <td class='title' width='20%'>부서</td>
                                    <td class='title' width='20%'>직책</td>
                                </tr>
                                 <xsl:for-each select="root/afterMentoList">
                                	
                                <tr>
					        		<td class="contant-center">
					        				<xsl:value-of select="empno" />
					        		</td>
					        		<td class="contant-center">
					        				<xsl:value-of select="nm" />
					        		</td>
					        		<td class="contant-center">
					        				<xsl:value-of select="mngmt_regionm" />
					        		</td>
					        		<td class="contant-center">
					        				<xsl:value-of select="dept_nm" />
					        		</td>
					        		<td class="contant-center">
					        				<xsl:value-of select="posi_nm" />
					        		</td>
					        		</tr>
					        		</xsl:for-each>
                                </table>
                                
							</td>
					</tr>
					</table>
				
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head" colspan='3'>* 파트너 담당자 변경내역 </td>
					</tr>
					
					<tr>
					<td width='48%'>
						 <table width="100%" border="1" cellpadding="0" cellspacing="0" class="aprinnertable">
                                  <tr>
                                  
                                    <td colspan="5" class='title'>변경전</td>
                                   
                                </tr>
                                 <tr>
                                	 <td class='title' width="10%" >성명</td>
                                    <td class='title' width="10%">직책</td>
                                    <td class='title' width="20%">전화번호</td>
                                    
                                    <td class='title' width="20%">휴대폰번호</td>
                                    <td class='title' width="40%">이메일</td>
                                </tr>
                                   <xsl:for-each select="root/beforeChargList">
                               <tr>
                               	<td class="contant-center"><xsl:value-of select="nm" /></td>
					        		<td class="contant-center"><xsl:value-of select="posi_nm" /></td>
					        		<td class="contant-center"><xsl:value-of select="tel_no" /></td>
					        		
					        		<td class="contant-center"><xsl:value-of select="mobile_no" /></td>
					        		<td class="contant-center"><xsl:value-of select="email" /></td>
					        		</tr>
					        		</xsl:for-each>
					        	
                                </table>
						</td>
						<td width='4%'>
						
						</td>
						<td width='48%'>
						 <table width="100%" border="1" cellpadding="0" cellspacing="0" class="aprinnertable">
                                  <tr>
                                  
                                    <td colspan="5" class='title'>변경후</td>
                                   
                                </tr>
                              
                                	  <tr>
                                	 <td class='title' width="10%" >성명</td>
                                    <td class='title' width="10%">직책</td>
                                    <td class='title' width="20%">전화번호</td>
                                    
                                    <td class='title' width="20%">휴대폰번호</td>
                                    <td class='title' width="40%">이메일</td>
                                </tr>
                                 <xsl:for-each select="root/afterChargList">
                               <tr>
                              	<td class="contant-center"><xsl:value-of select="nm" /></td>
					        		<td class="contant-center"><xsl:value-of select="posi_nm" /></td>
					        		<td class="contant-center"><xsl:value-of select="tel_no" /></td>
					        		
					        		<td class="contant-center"><xsl:value-of select="mobile_no" /></td>
					        		<td class="contant-center"><xsl:value-of select="email" /></td>
					        		</tr>
					        		</xsl:for-each>
                                </table>
						</td>
					</tr>
					</table>
					
					
            	
			<!-- 
                <br></br>
                <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head"> *파트너 담당자 변경내역 </td>
					</tr>
					<tr>
						<td class="body">
                            <table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
                                 <tr>
                                 
                                    <td colspan="4" class='title'>변경전</td>
                                    <td colspan="4" class='title'>변경후</td>
                                </tr>
                                <tr>
                                
                                    <td class='title' >성명</td>
                                    <td class='title'>직책</td>
                                    <td class='title'>휴대폰번호</td>
                                    <td class='title'>이메일</td>
                                    <td class='title' >성명</td>
                                    <td class='title'>직책</td>
                                    <td class='title'>휴대폰번호</td>
                                    <td class='title'>이메일</td>
                                    
								
									
                                </tr>
                                  <xsl:for-each select="response/selectData/hashtable/data[@hashkey='msgSptCustChargMS03']/vector/data/msgSptCustChargMS03">
                              
                                <tr>
					        		<td class="contant-center"><xsl:value-of select="before_nm" /></td>
					        		<td class="contant-center"><xsl:value-of select="before_posi_nm" /></td>
					        		<td class="contant-center"><xsl:value-of select="before_mobile_no" /></td>
					        		<td class="contant-center"><xsl:value-of select="after_email" /></td>
					        		<td class="contant-center"><xsl:value-of select="after_nm" /></td>
					        		<td class="contant-center"><xsl:value-of select="after_posi_nm" /></td>
					        		<td class="contant-center"><xsl:value-of select="after_mobile_no" /></td>
					        		<td class="contant-center"><xsl:value-of select="after_email" /></td>
					        		
					        		
					        			        		                                  
                                </tr>
                                </xsl:for-each>
                                
                            </table>
                        </td>
                    </tr>
                </table>
                -->
                <iframe name="ifr" height="0" width="0"></iframe>
                <br/>
				</form>
			</BODY>
	</xsl:template>
</xsl:stylesheet>