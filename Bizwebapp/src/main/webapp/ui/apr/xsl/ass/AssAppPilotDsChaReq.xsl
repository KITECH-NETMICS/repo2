<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml" encoding="UTF-8" indent="yes"/>

<xsl:template match="/">
        <body>
		<form name="frmXsl" target="blank" action="http://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
			<INPUT type="hidden" name="FilePath" size="25" />
			<INPUT type="hidden" name="orgFileName" size="25" />        
        <table style="width:750px; " border='0' cellspacing='0' cellpadding='0'>
            <tr>
                <td>      
                <table class="aproutertable" style="width:100%; ">
                    <tr>
                        <td colspan="4" class="head" style="width:100%; ">불용신청</td>    
                    </tr>    
                    <tr>
                        <td class="body">
                            <table class="aprinnertable" style="width:100%; " >  
                                <tr>
                                    <td class="title2" style="width:22%; ">연구관리시제품 구분</td>
                                    <td class="contant" style="width:28% ; "><xsl:value-of select = "/ASSAPPDSCHAREQ/ASSUNUSEINFO/aset_typ"/></td>
                                    <td class="title2" style="width:22%; ">불용 신청서 번호</td>
                                    <td class="contant" style="width:28% ; "><xsl:value-of select = "/ASSAPPDSCHAREQ/ASSUNUSEINFO/req_no"/></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
                <table class="aproutertable" style="width:100%; ">
                    <tr>                                
                        <td colspan="4" class="head" style="width:100%; ">불용 신청자 정보</td>
                    </tr>
                    <tr>
                        <td class="body">
                            <table class="aprinnertable" style="width:100%; ">  
                                <tr>
                                    <td class="title2" style="width:22%; ">신청자</td>
                                    <td class="contant" style="width:28%; "><xsl:value-of select = "/ASSAPPDSCHAREQ/ASSUNUSEINFO/user_nm"/>[<xsl:value-of select = "/ASSAPPDSCHAREQ/ASSUNUSEINFO/user_empno"/>]</td>
                                    <td class="title2" style="width:22%; ">이메일</td>
                                    <td class="contant" style="width:28%; "><xsl:value-of select = "/ASSAPPDSCHAREQ/ASSUNUSEINFO/user_email"/></td>
                                </tr>
                                <tr>
                                    <td class="title2" style="width:22%; ">부서명</td>
                                    <td class="contant" style="width:28%; "><xsl:value-of select = "/ASSAPPDSCHAREQ/ASSUNUSEINFO/user_dept_nm"/></td>
                                    <td class="title2" style="width:22%; ">연락처</td>
                                    <td class="contant" style="width:28%; "><xsl:value-of select = "/ASSAPPDSCHAREQ/ASSUNUSEINFO/user_ext_no"/></td>
                                </tr> 
                                <tr>
                                    <td class="title2" style="width:22%; ">타기관사용가능성</td>
                                    <td class="contant" style="width:28%; "><xsl:value-of select = "/ASSAPPDSCHAREQ/ASSUNUSEINFO/re_use_possbl"/></td>
                                    <td class="title2" style="width:22%; ">수리후경제적가치</td>
                                    <td class="contant" style="width:28%; "><xsl:value-of select = "/ASSAPPDSCHAREQ/ASSUNUSEINFO/repay_aftr_econo_value"/></td>
                                </tr>  
                                <tr>
                                    <td class="title2" style="width:22%; ">평상시관리상태</td>
                                    <td class="contant" style="width:28%; "><xsl:value-of select = "/ASSAPPDSCHAREQ/ASSUNUSEINFO/mngmt_state"/></td>
                                    <td class="title2" style="width:22%; ">기타사항</td>
                                    <td class="contant" style="width:28%; "><xsl:value-of select = "/ASSAPPDSCHAREQ/ASSUNUSEINFO/etc_Item"/></td>
                                </tr>
                	            <tr>
                                    <td class="title2">불용사유</td>
                                    <td colspan = "3" class="contant" ><xsl:value-of select = "/ASSAPPDSCHAREQ/ASSUNUSEINFO/cause"/></td>
                                </tr> 
								<tr>
									<td class='title2'>관련자료첨부</td>
									<td class='contant' colspan = '3' >
										<xsl:for-each select="/ASSAPPDSCHAREQ/ASSUNUSEINFO/attaches/vector/data/mdata">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA015')</xsl:attribute>
												<xsl:value-of select="file_nm" />
												<br />
											</a>
										</xsl:for-each>													
									</td>
								</tr>                                                             
                            </table>
                        </td>
                   </tr>
        	   </table>                                                     
                <table class="aproutertable" style="width:100%; ">
                    <tr>    
                        <td colspan="4" class="head">불용신청 시제품내역</td>
                    </tr> 	                                  
                    <tr>
                        <td colspan="4" class="body">
                            <table class="aprinnertable" style="width:100%; ">
                                <tr>
                                    <th class="title" style="width:4%; text-align:center; ">순번</th>
                                    <th class="title" style="width:5%; text-align:center; ">M/S&#xA;구분</th>
                                    <th class="title" style="width:10%; text-align:center; ">시제품번호</th>
                                    <th class="title" style="width:17%; text-align:center; ">품명</th>
                                    <th class="title" style="width:10%; text-align:center; ">관련시제품번호</th>
                                    <th colspan='2' class="title" style="width:14%; text-align:center; " >사용자</th>
                                    <th class="title" style="width:10%; text-align:center; ">위치(지역)</th>
                                    <th class="title" style="width:10%; text-align:center; ">위치(건물)</th>
                                    <th class="title" style="width:10%; text-align:center; ">위치(층)</th>
                                    <th class="title" style="width:10%; text-align:center; ">위치(상세)</th>                         
                                </tr>
                                
                                <xsl:for-each select="/ASSAPPDSCHAREQ/GRIDRESULT/vector/data/msgAssPilotMastr007">
                                <tr>
                                    <td class="contant-center" style="width:3%; text-align:center; "><xsl:value-of select = "position()"/></td>
                                    <td class="contant" style="width:5%; text-align:center; "><xsl:value-of select = "main_sub_clsf_nm"/></td>
                                    <td class="contant-right" style="width:10%; text-align:center; "><xsl:value-of select = "pilot_no"/></td>
                                    <td class="contant-center" style="width:17%; text-align:center; "><xsl:value-of select = "pilot_nm"/></td>
									<td class="contant-center" style="width:10%; text-align:center; "><xsl:value-of select = "relat_pilot_no"/></td>
                                    <td class="contant-center" style="width:7%; text-align:center; "><xsl:value-of select = "user_empno"/></td>
                                    <td class="contant-center" style="width:7%; text-align:center; "><xsl:value-of select = "user_nm"/></td>
                                    <td class="contant" style="width:10%; text-align:center; "><xsl:value-of select = "posi_region_nm"/></td> 
                                    <td class="contant" style="width:10%; text-align:center; "><xsl:value-of select = "posi_build_nm"/></td>
                                    <td class="contant" style="width:10%; text-align:center; "><xsl:value-of select = "posi_floor"/></td>     
                                    <td class="contant" style="width:10%; text-align:center; "><xsl:value-of select = "posi_detls"/></td>                                                                                                           
                                </tr>
                                </xsl:for-each>
                            </table>
                        </td>
                    </tr>                                
                </table>
                </td>
            </tr>
        </table>
		</form>
		<iframe name="ifr" height="0" width="0"></iframe>        
        </body>
</xsl:template> 


</xsl:stylesheet>