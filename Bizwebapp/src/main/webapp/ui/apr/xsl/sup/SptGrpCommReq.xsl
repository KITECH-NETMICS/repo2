<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml" encoding="UTF-8" indent="yes"/>

<xsl:template match="/">
	    <body>
	    <table style="width:750px; " border='0' cellspacing='0' cellpadding='0'>
            <tr>
                <td>   	    
        	        <table class="aproutertable" style="width:100%; ">
        	            <tr>
        	                <td colspan="4" class="head" style="width:100%; ">신청자</td>    
        	            </tr>           
        	            <tr>
        	                <td class="body">
        	                    <table class="aprinnertable" style="width:100%; " >  
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">신청일자</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "/GRPCOMMREQ/COMMUNITYINFO/req_ymd"/></td>
        	                            <td class="title2" style="width:22% ;  ">신청번호</td>
        	                            <td class="contant" style="width:28% ;  "><xsl:value-of select = "/GRPCOMMREQ/COMMUNITYINFO/req_no"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">성명</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "/GRPCOMMREQ/COMMUNITYINFO/req_psn_nm"/>(<xsl:value-of select = "/GRPCOMMREQ/COMMUNITYINFO/req_psn_empno"/>)</td>
        	                            <td class="title2" style="width:22% ;  ">소속</td>
        	                            <td class="contant" style="width:28% ;  "><xsl:value-of select = "/GRPCOMMREQ/COMMUNITYINFO/req_psn_dept_nm"/></td>
        	                        </tr>
        	                    </table>
        	                </td>
        	            </tr>
        	        </table>
        	        <table class="aproutertable" style="width:100%; ">
        	            <tr>
        	                <td colspan="4" class="head" style="width:100%; ">커뮤니티정보</td>    
        	            </tr>           
        	            <tr>
        	                <td class="body">
        	                    <table class="aprinnertable" style="width:100%; ">  
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">지역본부</td>
        	                            <td colspan="3" class="contant"><xsl:value-of select = "/GRPCOMMREQ/COMMUNITYINFO/region_centr_nm"/></td>
        	                            
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >커뮤니티명</td>
        	                            <td colspan="3" class="contant"><xsl:value-of select = "/GRPCOMMREQ/COMMUNITYINFO/cmnty_nm"/>(<xsl:value-of select = "/GRPCOMMREQ/COMMUNITYINFO/cmnty_no"/>)</td>
        	                        </tr>  
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >커뮤니티 구성목적</td>
        	                            <td class="contant" colspan = "3"><xsl:value-of select = "/GRPCOMMREQ/COMMUNITYINFO/cmnty_compo_goal"/></td>                           
        	                        </tr>  
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >운영기간</td>
        	                            <td class="contant" colspan = "3"><xsl:value-of select = "/GRPCOMMREQ/COMMUNITYINFO/opr_orign_ymd"/> ~ <xsl:value-of select = "/GRPCOMMREQ/COMMUNITYINFO/opr_cls_ymd"/></td>                           
        	                        </tr>
        	                         <tr>
        	                            <td class="title2" style="width:22%;" >커뮤니티 개요</td>
        	                            <td class="contant" colspan = "3"><xsl:value-of select = "/GRPCOMMREQ/COMMUNITYINFO/cmnty_opr_plan"/></td>                           
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >운영진</td>
        	                            <td class="contant" style="width:78%;">
        	                                <table class="aprinnertable" style="width:100%;border-top:1px solid #B9C3D1;border-left:1px solid #B9C3D1;">
        	                                    <tr>
        	                                        <th class="title" style="width:5%; ">운영구분</th>
        	                                        <th class="title" style="width:12%; ">성명</th>
        	                                        <th class="title" style="width:10%; ">소속</th>
        	                                        <th class="title" style="width:10%; ">전화번호</th>
        	                                    </tr>
        	                        
        	                                    <xsl:for-each select="/GRPCOMMREQ/GRIDRESULT01/vector/data/msgSptTeccommunityMngmt001">
        	                                    <tr>
        	                                        <td class="contant-center" style="width:25%; "><xsl:value-of select = "opr_clsf_nm"/></td>
        	                                        <td class="contant-center" style="width:25%; "><xsl:value-of select = "nm"/>[<xsl:value-of select = "empno"/>]</td>
        	                                        <td class="contant-center" style="width:25%; "><xsl:value-of select = "dept_nm"/></td> 
        	                                        <td class="contant-center" style="width:25%; "><xsl:value-of select = "ext_no"/></td> 
        	                                    </tr>
        	                                    </xsl:for-each>
        	                                    
        	                                    
        	                                </table>    
        	                            </td>                           
        	                        </tr>
        	                        <tr>
											<td class='title2'>관련자료첨부</td>
											<td class='contant' colspan='3'>
												<xsl:for-each select="/GRPCOMMREQ/COMMUNITYINFO/fileList_A/vector/data/mdata">
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
        	                <td colspan="4" class="head">참여기업</td>
        	            </tr>                                                                               
        	            <tr>
        	                <td colspan="4" class="body">               
        	                    <table class="aprinnertable" style="width:100%; ">                     
        	                        <tr>
        	                            <th rowspan="2" class="title" style="width:5%;">순번</th>
        	                            <th rowspan="2" class="title" style="width:25%;">기업명</th>
        	                            <th rowspan="2" class="title" style="width:15%;" >사업자번호</th>
        	                            <th rowspan="2" class="title" style="width:10%;">대표자</th>
        	                            <th rowspan="2" class="title" style="width:15%;">멘토성명</th>
        	                            <th colspan="2" class="title">참여자</th>
        	                            <th rowspan="2" class="title" style="width:10%;">등록완료여부</th>
        	                        </tr>
        	                        <tr>
        	                            <th class="title" style="width:10%; ">성명</th>
        	                            <th class="title" style="width:10%; ">휴대전화</th>
        	                        </tr>
        	                      
        	                       <xsl:for-each select="/GRPCOMMREQ/GRIDRESULT02/vector/data/msgSptCommunityJoinCmpy001">
        	                        <tr>
        	                            <td class="contant-center" style="width:5%; "><xsl:value-of select = "position()"/></td>
        	                            <td class="contant" style="width:25%; "><xsl:value-of select = "cmpy_nm_krchar"/></td>
        	                            <td class="contant-center" style="width:15%; "><xsl:value-of select = "bsns_psn_regst_no"/></td>
        	                            <td class="contant-center" style="width:10%; "><xsl:value-of select = "reprs_psn"/></td> 
        	                            <td class="contant-center" style="width:15%; "><xsl:value-of select = "mento_nm"/></td> 
        	                            <td class="contant-center" style="width:10%; "><xsl:value-of select = "charg_nm"/></td>
        	                            <td class="contant-center" style="width:10%; "><xsl:value-of select = "charg_mobile"/></td>
        	                            <td class="contant-center" style="width:10%; "><xsl:value-of select = "wrte_clsf"/></td>
        	                        </tr>
        	                        </xsl:for-each>
        
        	                    </table>
        	                </td>
        	            </tr>                                
        	        </table> 
                </td>
            </tr>                                
        </table>
        </body>
</xsl:template>


</xsl:stylesheet>