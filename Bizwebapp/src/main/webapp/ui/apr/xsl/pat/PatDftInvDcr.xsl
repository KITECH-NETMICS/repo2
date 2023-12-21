<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml" encoding="UTF-8" indent="yes"/>

<xsl:template match="APPROVALREQ">
<xsl:variable name="localPath" select="request/localPath/@value"/>

<html lang="kr">
	<body>

	 <script language="javascript">
		<![CDATA[
		
				function fileDown (orgFile, attachFullPath) {
  						//var localPath = "/was/WebSphere/AppServer/profiles/AppSrv01/installedApps/kwas1Cell01/biz.ear/bizweb.war/kitechfiles/";
  						var localPath   = "/was/IMIS_FILES/";
						var loPath 		= localPath + attachFullPath;
						var orgFileName = orgFile; 						 
						var frm 		= createForm("frmXsl", "ifr", "https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp", "get");
						
						frm = createHidden("FilePath", loPath, frm);
						frm = createHidden("orgFileName", orgFileName, frm);
						
						/*IE9, IE10, 크롬 등에서 호환성 보기 없이 실행되도록 보완(2013.07.31)*/
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
 						/*IE9, IE10, 크롬 등에서 호환성 보기 없이 실행되도록 보완(2013.07.31)*/
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
		]]>
    </script>	
 		
<!--		<script type="javascript" src="/kitech/com/js/snapCommon.js"></script>-->
			    
		<form name="frmXsl" target="blank" action="https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
			<INPUT type="hidden" name="FilePath" size="25" />
			<INPUT type="hidden" name="orgFileName" size="25" />		    
	
		<TABLE cellspacing="0" cellpadding="0" border="0" width="750px">
			<TR>
				<TD>
					<table class="aproutertable" width="100%">
						<tr>
							<td width='100%' class='head'>발명기본정보내역</td>
						</tr>
						<TR>
			      			<TD class="body">
								<table class="aprinnertable" width="100%">
									<tr>
										<td width='15%' class='title'>신청번호</td>
										<td width='35%' class='contant-center'><xsl:value-of select="patmastr/req_no"/></td>
										<td width='15%' class='title'>발명구분</td>
										<td width='35%' class='contant-center'><xsl:value-of select="patmastr/pat_clsf_nm"/></td>
									</tr>
									<tr>
										<td width='15%' class='title'>기술분류</td>
										<td width='35%' class='contant-center'><xsl:value-of select="patmastr/tech_clsf"/></td>
										
										<td width='15%' class='title'>소유권구분</td>
										<td width='35%' class='contant-center'><xsl:value-of select="patmastr/co_smitapp_ex_nm"/></td>
									</tr>
									<tr>
										<td width='15%' class='title'>직무발명의 명칭</td>
										<td width='35%' colspan = '3' class='contant'><xsl:value-of select="patmastr/invnt_krn_nm"/></td>
									</tr>
									<tr>
										<td width='15%' class='title'>사전공개유무</td>
										<td width='35%' class='contant-center'><xsl:value-of select="patmastr/bef_open_yn"/></td>
										<td width='15%' class='title'>직무발명여부</td>
										<xsl:choose>
                                        	<xsl:when test ="patmastr/invnt_clsf = 'PBT010'">
												<td width='35%' class='contant-center'>직무발명</td>
											</xsl:when>
											<xsl:when test ="patmastr/invnt_clsf = 'PBT020'">
												<td width='35%' class='contant-center'>자유발명</td>
											</xsl:when>
	                                    </xsl:choose>
									</tr>
									
									<xsl:choose>
                                        <xsl:when test ="patmastr/dom_oversea_clsf = '국외'">
                                            <td width='15%' class='title'>출원번호</td>
											<td width='35%' class='contant-center'><xsl:value-of select="patmastr/relat_dom_smitapp_no"/></td>
											<td width='15%' class='title'>출원일자</td>
											<td width='35%' class='contant-center'><xsl:value-of select="patmastr/smitapp_ymd"/></td>
                                        </xsl:when>
                                    </xsl:choose>
									<xsl:choose>
									<xsl:when test ="patmastr/bef_open_yn = '예'">
									<tr>
										<td width='15%' class='title'>사전공개확인서류</td>
										<td width='35%' colspan = '3' class='contant'>
											<xsl:for-each select="fileList_M/vector/data/msgXomxComAttachFileMS01">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
													<xsl:value-of select="org_file" /><br/>
												</a>
											</xsl:for-each>											
										</td>
									</tr>	
									</xsl:when> 
									</xsl:choose>							
								</table> 
							</TD>
						</TR>
					</table>	

					<table class="aproutertable" width="100%">
						<tr>
							<td width='100%' class='head'>공동소유권</td>
						</tr>
						<TR>
							<TD class="body">
								<table class="aprinnertable" width="100%">
									<tr>
										<td width='8%' class='title'>구분</td>
										<td width='22%' class='title'>업체명</td>
										<td width='8%'  class='title'>권리지분</td>
										<td width='15%' class='title'>사업자등록번호</td>
										<td width='8%'  class='title'>대표자</td>
										<td width='15%' class='title'>연락처</td>
										<td width='24%' class='title'>주소</td>
									</tr>
									<xsl:for-each select="GRIDLIST6/vector/data/msgPatAppCosmitAppVendMS01">
										<tr>
											<xsl:choose>
												<xsl:when test ="vend_type = '1'">
													<td class='contant-center'>사업자</td>
												</xsl:when>
												<xsl:when test ="vend_type = '2'">
													<td class='contant-center'>개인</td>
												</xsl:when>
											</xsl:choose>
											<td class='contant-center'><xsl:value-of select="vend_nm"/></td>
											<td class='contant-center'><xsl:value-of select="stake_rt"/></td>
											<td class='contant-center'><xsl:value-of select="vend_bsn_no"/></td>
											<td class='contant-center'><xsl:value-of select="charg"/></td>
											<td class='contant-center'><xsl:value-of select="contac_loc"/></td>
											<td class='contant'><xsl:value-of select="addr"/></td>
										</tr>
									</xsl:for-each>
								</table>
							</TD>
						</TR>
					</table>

					<table class="aproutertable" width="100%">
						<tr>
							<td width='100%' class='head'>직무발명자</td>
						</tr>
						<TR>
							<TD class="body">
								<table class="aprinnertable" width="100%">
									<tr>
										<td width='8%'  class='title'>주발명자</td>
										<td width='8%'  class='title'>소속구분</td>
										<td width='10%' class='title'>성명</td>
										<td width='15%' class='title'>주민번호</td>
										<td width='10%' class='title'>개인번호</td>
										<td width='8%'  class='title'>지분(%)</td>
										<td width='12%' class='title'>연락처</td>
										<td width='13%' class='title'>소속</td>
										<td width='16%' class='title'>이메일</td>
									</tr>
									<xsl:for-each select="GRIDLIST1/vector/data/msgPatAppCoinvntPsnMS01">
										<tr>
										    <xsl:choose>
                                                <xsl:when test ="invnt_psn_clsf = '1'">
                                                    <td class='contant-center'> V</td>
                                                </xsl:when>
                                                <xsl:when test ="invnt_psn_clsf != '1'">
                                                    <td class='contant-center'>  </td>
                                                </xsl:when>
                                            </xsl:choose>
<!-- 											<td class='contant-center'><xsl:value-of select="invnt_psn_clsf"/></td> -->
											<xsl:choose>
												<xsl:when test ="blong_clsf = 'PDT010'">
													<td class='contant-center'>내부</td>
												</xsl:when>
												<xsl:when test ="blong_clsf = 'PDT020'">
													<td class='contant-center'>외부</td>
												</xsl:when>
											</xsl:choose>
											<td class='contant-center'><xsl:value-of select="nm_krn"/></td>
											<td class='contant-center'><xsl:value-of select="resid_no_dis"/></td>
											<td class='contant-center'><xsl:value-of select="syspayno"/></td>
											<td class='contant-right'><xsl:value-of select="stake_rt"/></td>
											<td class='contant-center'><xsl:value-of select="contac_loc"/></td>
											<td class='contant-center'><xsl:value-of select="blong_nm"/></td>
											<td class='contant'><xsl:value-of select="email"/></td>
										</tr>
									</xsl:for-each>
								</table>
							</TD>
						</TR>
					</table>
					<table class="aproutertable" width="100%">
						<tr>
							<td width='100%' class='head'>관련연구과제</td>
						</tr>
						<TR>
							<TD class="body">
								<table class="aprinnertable" width="100%">
									<tr>
										<td width='15%' class='title'>계정번호</td>
										<td width='45%' class='title'>연구과제명</td>
										<td width='20%' class='title'>연구기간</td>
										<td width='20%' class='title'>연구책임자</td>
									</tr>
									<xsl:for-each select="GRIDLIST2/vector/data/msgPatAppRelatResChprjMS01">
										<tr>
											<td class='contant-center'><xsl:value-of select="accnt_no"/></td>
											<td class='contant'><xsl:value-of select="prj_nm"/></td>
											<td class='contant-center'><xsl:value-of select="prj_term"/></td>
											<td class='contant-center'><xsl:value-of select="resch_respn_syspaynm"/></td>
										</tr>
									</xsl:for-each>
								</table>
							</TD>
						</TR>
					</table>
					<table class="aproutertable" width="100%">
						<tr>
							<td width='100%' class='head'></td>
						</tr>
						<TR>
							<TD class="body">
								<table class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
									<tr>
										<td width='15%' class='title2'>국내/국외구분</td>
										<td width='35%' colspan = '3' class='contant'><xsl:value-of select="patmastr/dom_oversea_clsf"/></td>
									</tr>
<!--									<xsl:choose>-->
<!--										<xsl:when test ="patmastr/pct_chk = 'P'">-->
<!--											<tr>-->
<!--												<td width='15%' class='title2'>출원희망국</td>-->
<!--												<td width='35%' colspan = '3' class='contant-center'>PCT진입국가(<xsl:value-of select="patmastr/smitapp_hope_natn_nm"/>)</td>-->
<!--									#		</tr>-->
<!--										</xsl:when>-->
<!--									</xsl:choose>-->
<!--									<xsl:choose>-->
<!--										<xsl:when test ="patmastr/pct_chk = ''">-->
<!--											<tr>-->
<!--												<td width='15%' class='title2'>출원희망국</td>-->
<!--												<td width='35%' colspan = '3' class='contant-center'><xsl:value-of select="patmastr/smitapp_hope_natn_nm"/></td>-->
<!--											</tr>-->
<!--										</xsl:when>-->
<!--									</xsl:choose>-->
									<tr>
										<td width='15%' class='title2'>출원희망국</td>									
									    <xsl:choose>
										    <xsl:when test ="patmastr/pct_chk = 'P'">
												<td width='35%' colspan = '3' class='contant'>PCT진입국가(<xsl:value-of select="patmastr/smitapp_hope_natn_nm"/>)</td>
										    </xsl:when>

										    <xsl:when test ="patmastr/pct_chk = ''">
												<td width='35%' colspan = '3' class='contant'><xsl:value-of select="patmastr/smitapp_hope_natn_nm"/></td>
										    </xsl:when>
										</xsl:choose>
									</tr>
									<!-- 	
									<tr>
										<td width='15%' class='title2'>심사청구</td>
										<xsl:choose>
											<xsl:when test ="patmastr/eval_demnd_ex = 'Y'">
												<td width='35%' colspan = '3' class='contant'>Y</td>
											</xsl:when>
											<xsl:otherwise>
												<td width='35%' colspan = '3' class='contant'>N</td>
											</xsl:otherwise>
										</xsl:choose>
									</tr>
									 -->
									<xsl:if test ="patmastr/pat_clsf_nm != '디자인'">
									<tr>
										<td width='15%' class='title2'>특허설계지원사업 지원여부</td>
										<td width='35%' colspan = '3' class='contant'><xsl:value-of select="patmastr/pdp_flag"/></td>
									</tr>
									<!--  <tr>
										<td width='35%' class='contant-center'><xsl:value-of select="patmastr/pat_grd"/></td>
									</tr>-->
									<tr>
										<td class='title2' >발명등급</td>
										<xsl:choose>
											<xsl:when test ="patmastr/pat_grd = 'PPG010'">
												<td width='40%' colspan = '1' class='contant'>S</td>
											</xsl:when>
											<xsl:when test ="patmastr/pat_grd = 'PPG020'">
												<td width='40%' colspan = '1' class='contant'>A</td>
											</xsl:when>
											<xsl:when test ="patmastr/pat_grd = 'PPG030'">
												<td width='40%' colspan = '1' class='contant'>B</td>
											</xsl:when>	
											<xsl:when test ="patmastr/pat_grd = 'PPG040'">
												<td width='40%' colspan = '1' class='contant'>C</td>
											</xsl:when>
											<xsl:when test ="patmastr/pat_grd = 'PPG050'">
												<td width='40%' colspan = '1' class='contant'>F</td>
											</xsl:when>										
										</xsl:choose>
										<td width='10%' class='title2'>발명인터뷰신청</td>
										<td class='contant'><xsl:value-of select="patmastr/interview_yn"/></td>
									</tr>
									<tr>
										<td class='title2'>조기공개신청</td>
										<xsl:choose>
											<xsl:when test ="patmastr/ely_open_ex = 'Y'">
												<td width='35%' colspan = '3' class='contant'>Y</td>
											</xsl:when>
											<xsl:otherwise>
												<td width='35%' colspan = '3' class='contant'>N</td>
											</xsl:otherwise>										
										</xsl:choose>
									</tr>
									</xsl:if>
									<tr>
										<td class='title2'>기술이전가능여부</td>
										<xsl:choose>
											<xsl:when test ="patmastr/tech_befr_hope_ex = 'Y'">
												<td width='35%' colspan = '3' class='contant'>Y</td>
											</xsl:when>
											<xsl:otherwise>
												<td width='35%' colspan = '3' class='contant'>N</td>
											</xsl:otherwise>
										</xsl:choose>
									</tr>
									<tr>
										<td class='title2'>특허사무소</td>
										<td width='40%' class='contant'><xsl:value-of select="patmastr/hope_patofic_nm"/></td>
										<td width='10%' class='title2'>담당자</td>
										<td class='contant'><xsl:value-of select="patmastr/hope_patofic_charg_nm"/></td>
									</tr>
									<tr>
										<td class='title2'>연락처</td>
										<td class='contant-center' colspan = '3'><xsl:value-of select="patmastr/hope_patofic_contac_loc"/></td>
									</tr>
									<tr>
										<td width='15%' class='title2'>배경(종래)기술</td>
										<td width='35%' colspan = '3' class='contant'><xsl:value-of select="patmastr/tech_field"/></td>
									</tr>
									<tr>
										<td width='15%' class='title2'>산업상 이용분야</td>
										<td width='35%' colspan = '3' class='contant'><xsl:value-of select="patmastr/indst_use_clsf"/></td>
									</tr>
									<tr>	
										<td width='15%' class='title2'>과제해결수단</td>
										<td width='35%' colspan = '3' class='contant'><xsl:value-of select="patmastr/solve_task"/></td>
									</tr>
									<tr>	
										<td width='15%' class='title2'>상세한 설명</td>
										<td width='35%' colspan = '3' class='contant'><xsl:value-of select="patmastr/rans_nm"/></td>
									</tr>
									<tr>	
										<td width='15%' class='title2'>발명의 효과</td>
										<td width='35%' colspan = '3' class='contant'><xsl:value-of select="patmastr/invnt_efct"/></td>
									</tr>
									<tr>	
										<td width='15%' class='title2'>관련특허</td>
										<td width='35%' colspan = '3' class='contant'><xsl:value-of select="patmastr/relat_invnt"/></td>
									</tr>
									<tr>	
										<td width='15%' class='title2'>도면첨부</td>
										<td width='35%' colspan = '3' class='contant'>										
											<xsl:for-each select="fileList_N/vector/data/msgXomxComAttachFileMS01">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
													<xsl:value-of select="org_file" /><br/>
												</a>
											</xsl:for-each>		
										</td>	
									</tr>								
									<tr>	
										<td width='15%' class='title2'>기타</td>
										<td width='35%' colspan = '3' class='contant'>									
											<xsl:for-each select="fileList_O/vector/data/msgXomxComAttachFileMS01">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
													<xsl:value-of select="org_file" /><br/>
												</a>
											</xsl:for-each>	
										</td>	
									</tr>										
									<tr>
										<td width='15%' class='title2'>기술설명서</td>
										<td width='35%' colspan = '3' class='contant'>											
											<xsl:for-each select="fileList_A/vector/data/msgXomxComAttachFileMS01">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
													<xsl:value-of select="org_file" /><br/>
												</a>
											</xsl:for-each>											
										</td>
									</tr>
									<!-- <tr>
										<td width='15%' class='title2'>선행기술조사서</td>
										<td width='35%' colspan = '3' class='contant'>											
											<xsl:for-each select="fileList_K/vector/data/msgXomxComAttachFileMS11">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
													<xsl:value-of select="org_file" /><br/>
												</a>
											</xsl:for-each>											
										</td>									
									</tr> 
									<tr>
										<td width='15%' class='title2'>발명인터뷰 발표자료</td>
										<td width='35%' colspan = '3' class='contant'>
											<xsl:for-each select="fileList_R/vector/data/msgXomxComAttachFileMS12">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
													<xsl:value-of select="org_file" /><br/>
												</a>
											</xsl:for-each>											
										</td>									
									</tr>-->
									<tr> 
										<td width='15%' class='title2'>PCT사업화 계획서</td>
										<td width='35%' colspan = '3' class='contant'>
											<xsl:for-each select="fileList_P/vector/data/msgXomxComAttachFileMS01">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
													<xsl:value-of select="org_file" /><br/>
												</a>
											</xsl:for-each>											
										</td>									
									</tr>
									<tr>
										<td width='15%' class='title2'>외부인 양도증 </td>
										<td width='35%' colspan = '3' class='contant'>
											<xsl:for-each select="fileList_C/vector/data/msgXomxComAttachFileMS01">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
													<xsl:value-of select="org_file" /><br/>
												</a>
											</xsl:for-each>											
										</td>									
									</tr>
									<tr>
										<td width='15%' class='title2'>공동출원사유서 </td>
										<td width='35%' colspan = '3' class='contant'>
											<xsl:for-each select="fileList_Q/vector/data/msgXomxComAttachFileMS01">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
													<xsl:value-of select="org_file" /><br/>
												</a>
											</xsl:for-each>											
										</td>									
									</tr>
									<tr>
										<td width='15%' class='title2'>1인발명지분소명서 </td>
										<td width='35%' colspan = '3' class='contant'>
											<xsl:for-each select="fileList_S/vector/data/msgXomxComAttachFileMS01">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
													<xsl:value-of select="org_file" /><br/>
												</a>
											</xsl:for-each>											
										</td>									
									</tr>
									<!-- <xsl:choose>
										<xsl:when test ="patmastr/dom_oversea_clsf = '국외'">
											<tr>
												<td width='15%' class='title2'>사업화계획서</td>
												<td width='35%' colspan = '3' class='contant'>													
													<xsl:for-each select="fileList_I/vector/data/msgXomxComAttachFileMS09">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
															<xsl:value-of select="org_file" /><br/>
														</a>
													</xsl:for-each>													
												</td>
											</tr>
										</xsl:when>
									</xsl:choose>
									<xsl:choose>
										<xsl:when test ="patmastr/dom_oversea_clsf = '국내+국외'">
											<tr>
												<td width='15%' class='title2'>사업화계획서</td>
												<td width='35%' colspan = '3' class='contant'>													
													<xsl:for-each select="fileList_I/vector/data/msgXomxComAttachFileMS09">
														<a>
															<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
															<xsl:value-of select="org_file" /><br/>
														</a>
													</xsl:for-each>													
												</td>
											</tr>
										</xsl:when>
									</xsl:choose>
									 -->
								</table>
							</TD>
						</TR>
					</table>
					<xsl:choose>
					<xsl:when test ="patmastr/pat_clsf = 'PAT050'">
						<table class="aproutertable" width="100%">
							<tr>
								<td width='100%' class='head'>프로그램</td>
							</tr>
							<TR>
								<TD class="body">
									<table class="aprinnertable" width="100%">
										<tr>
										
											<td width='100%' colspan = '4' class='title'>프로그램 저작물</td>
										</tr>
									</table>
									<table class="aprinnertable" width="100%">
										<tr>
											<td width='15%' class='title'>명칭</td>
											<td width='35%' colspan = '3' class='contant'><xsl:value-of select="savepatpgminvntbook/nm"/></td>
										</tr>
										<tr>
											<td width='15%' class='title'>창작년월일</td>
											<td width='35%' class='contant-center'><xsl:value-of select="savepatpgminvntbook/crt_yr_mmdd"/></td>
											<td width='15%' class='title'>공표년월일</td>
											<td width='35%' class='contant-center'><xsl:value-of select="savepatpgminvntbook/notice_yrmon_ymd"/></td>
										</tr>
										<tr>
											<td class='title'>복제물의형태</td>
											<td class='contant'><xsl:value-of select="savepatpgminvntbook/replica_shape"/></td>
											<td class='title'>수량</td>
											<td class='contant'><xsl:value-of select="savepatpgminvntbook/replica_qty"/></td>
										</tr>
									</table>
									<table class="aprinnertable" width="100%">
										<tr>
											<td width='100%' colspan = '4' class='title'>프로그램 개요</td>
										</tr>
									</table>
									<table class="aprinnertable" width="100%">
										<tr>
											<td width='15%' class='title'>프로그램 종류코드</td>
											<td width='85%' class='contant'><xsl:value-of select="savepatpgminvntbook/pgm_knd_cd"/></td>
										</tr>
										<tr>
											<td class='title'>적용분야</td>
											<td class='contant'><xsl:value-of select="savepatpgminvntbook/apply_fild"/></td>
										</tr>
										<tr>
											<td class='title'>본 프로그램의 특징</td>
											<td class='contant'><xsl:value-of select="savepatpgminvntbook/spclmark"/></td>
										</tr>
										<tr>
											<td class='title'>주요기능</td>
											<td class='contant'><xsl:value-of select="savepatpgminvntbook/major_skill"/></td>
										</tr>
										<tr>
											<td class='title'>판매구분</td>
											<td class='contant'><xsl:value-of select="savepatpgminvntbook/sale_clsf"/></td>
										</tr>
										<tr>
											<td class='title'>사용기종</td>
											<td class='contant'><xsl:value-of select="savepatpgminvntbook/use_model"/></td>
										</tr>
										<tr>
											<td class='title'>사용 OS</td>
											<td class='contant'><xsl:value-of select="savepatpgminvntbook/use_os"/></td>
										</tr>
										<tr>
											<td class='title'>사용언어</td>
											<td class='contant'><xsl:value-of select="savepatpgminvntbook/use_lang"/></td>
										</tr>
										<tr>
											<td class='title'>필요한 프로그램</td>
											<td class='contant'><xsl:value-of select="savepatpgminvntbook/need_pgm"/></td>
										</tr>
										<tr>
											<td class='title'>규모(Line, byte)</td>
											<td class='contant'><xsl:value-of select="savepatpgminvntbook/scale"/></td>
										</tr>
									</table>
								</TD>
							</TR>
						</table>
					</xsl:when>
					<xsl:when test ="patmastr/pat_clsf = 'PAT040'">
						<table class="aproutertable" width="100%">
							<tr>
								<td width='100%' class='head'>디자인</td>
							</tr>
							<TR>
								<TD class="body">
									<table class="aprinnertable" width="100%">
										<xsl:if test ="patdesninvntbook/pre_desn_nm != ''">
										<tr>
											<td width='15%' class='title'>명칭</td>
											<td width='85%' class='contant'><xsl:value-of select="patdesninvntbook/pre_desn_nm"/></td>
										</tr>
										</xsl:if>
										<tr>
											<td class='title'>첨부도면</td>
											<td class='contant'>													
												<xsl:for-each select="fileList_B/vector/data/msgXomxComAttachFileMS02">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
														<xsl:value-of select="org_file" /><br/>
													</a>
												</xsl:for-each>													
											</td>
										</tr>											
										<tr>
											<td class='title'>선행디자인</td>
											<td class='contant'><xsl:value-of select="patdesninvntbook/pre_desn_ex"/></td>
										</tr>
										<tr>
											<td class='title'>디자인명</td>
											<td class='contant'><xsl:value-of select="patdesninvntbook/pre_desn_nm"/></td>
										</tr>
										<tr>
											<td class='title'>디자인상세</td>
											<td class='contant'><xsl:value-of select="patdesninvntbook/desn_detls_desc"/></td>
										</tr>
									</table>
								</TD>
							</TR>
						</table>
						<table class="aproutertable" width="100%">
							<tr>
								<td width='100%' class='head'>발명내용 첨부</td>
							</tr>
							<TR>
								<TD class="body">
									<table class="aprinnertable" width="100%">
										<tr>
											<td width='15%' class='title'>첨부파일</td>
											<td width='85%' class='title'>파일내용</td>
										</tr>
										<xsl:for-each select="GRIDLIST3/vector/data/msgPatAppAttachMS01">
											<tr>
												<td class='contant'><xsl:value-of select="attach_file_no"/></td>
												<td class='contant'><xsl:value-of select="desc"/></td>
											</tr>
										</xsl:for-each>
									</table>
								</TD>
							</TR>
						</table>
					</xsl:when>
					
					<xsl:when test ="patmastr/pat_clsf = 'PAT030'"> 
						<table class="aproutertable" width="100%">
							<tr>
								<td width='100%' class='head'>상표</td>
							</tr>
							<TR>
								<TD class="body">
									<table class="aprinnertable" cellspacing="0" cellpadding="0" border="0" width="100%">
										<tr>
											<td width='15%' class='title'>상표명</td>
											<td width='85%' class='contant'><xsl:value-of select="pattminvntbook/tm_mean"/></td>
										</tr>
										<tr>
											<td class='title'>첨부파일</td>
											<td class='contant'>
												<!-- <xsl:value-of select="pattminvntbook/attach_file_no"/> -->
												<xsl:for-each select="fileList_L/vector/data/msgXomxComAttachFileMS12">
													<a>
														<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
														<xsl:value-of select="org_file" /><br/>
													</a>
												</xsl:for-each>													
											</td>
										</tr>
										<tr>
											<td class='title'>상표의 간단한 설명</td>
											<td class='contant'><xsl:value-of select="pattminvntbook/tm_desc"/></td>
										</tr>
										<tr>
											<td class='title'>지정상품</td>
											<td class='contant'><xsl:value-of select="pattminvntbook/appont_goods"/></td>
										</tr>
									</table>
								</TD>
							</TR>
						</table>
					</xsl:when> 
					</xsl:choose>
					
					<xsl:choose>
                       <xsl:when test ="patmastr/invnt_clsf = 'PBT010'">
					
							<table class="aproutertable" width="100%">
								<tr>
									<td width='100%' class='head'>양도증</td>
								</tr>
								<TR>
									<TD class="body">
										<table class="aprinnertable" width="100%">
											<tr>
												<td width='15%' class='title'>주소</td>
												<td width='85%' class='contant'><xsl:value-of select="patmastr/sd_addr"/></td>
											</tr>
											<tr>
												<td class='title'>성명</td>
												<td class='contant'><xsl:value-of select="patmastr/sd_nm"/></td>
											</tr>
											<tr>
												
												<td class='contant' colspan = "2"><xsl:value-of select="patmastr/sd_desc"/></td>
											</tr>
											<tr>
												<td class='title'>명칭</td>
												<td class='contant' colspan = "2"><xsl:value-of select="patmastr/sd_inv_nm"/></td>
											</tr>
										</table>
									</TD>
								</TR>
							</table>
							<table class="aproutertable" width="100%">
								<tr>
									<td width='100%' class='head'>양도인</td>
								</tr>
								<TR>
									<TD class="body">
										<table class="aprinnertable" width="100%">
											<tr>
												<td width='8%'  class='title'>주발명자</td>
												<td width='8%'  class='title'>소속구분</td>
												<td width='10%' class='title'>성명</td>
												<td width='15%' class='title'>주민번호</td>
												<td width='10%' class='title'>개인번호</td>
												<td width='8%'  class='title'>지분(%)</td>
												<td width='12%' class='title'>연락처</td>
												<td width='13%' class='title'>소속</td>
												<td width='16%' class='title'>이메일</td>
											</tr>
											<xsl:for-each select="GRIDLIST1/vector/data/msgPatAppCoinvntPsnMS01">
												<tr>
		                                            <xsl:choose>
		                                                <xsl:when test ="invnt_psn_clsf = '1'">
		                                                    <td class='contant-center'> V</td>
		                                                </xsl:when>
		                                                <xsl:when test ="invnt_psn_clsf != '1'">
		                                                    <td class='contant-center'>  </td>
		                                                </xsl:when>
		                                            </xsl:choose>										
		<!-- 											<td class='contant-center'><xsl:value-of select="invnt_psn_clsf"/></td> -->
													<xsl:choose>
														<xsl:when test ="blong_clsf = 'PDT010'">
															<td class='contant-center'>내부</td>
														</xsl:when>
														<xsl:when test ="blong_clsf = 'PDT020'">
															<td class='contant-center'>외부</td>
														</xsl:when>
													</xsl:choose>
													<td class='contant-center'><xsl:value-of select="nm_krn"/></td>
													<td class='contant-center'><xsl:value-of select="resid_no_dis"/></td>
													<td class='contant-center'><xsl:value-of select="syspayno"/></td>
													<td class='contant-right'><xsl:value-of select="stake_rt"/></td>
													<td class='contant-center'><xsl:value-of select="contac_loc"/></td>
													<td class='contant-center'><xsl:value-of select="blong_nm"/></td>
													<td class='contant'><xsl:value-of select="email"/></td>
												</tr>
											</xsl:for-each>
										</table>
									</TD>
								</TR>
							</table>
						</xsl:when>
	    			</xsl:choose>
				</TD>
			</TR>
		</TABLE>
			
		</form>
		<iframe name="ifr" height="0" width="0"></iframe>		
		
	</body>
</html>

</xsl:template>

</xsl:stylesheet>