<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml" encoding="UTF-8" indent="yes"/>

<xsl:template match="/">
	    <body>
	    <table style="width:750px; " border="0" cellspacing="0" cellpadding="0">
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
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "/GRPMEETREQ/SPTGRPMEETINFO/req_ymd"/></td>
        	                            <td class="title2" style="width:22% ;  ">신청번호</td>
        	                            <td class="contant" style="width:28% ;  "><xsl:value-of select = "/GRPMEETREQ/SPTGRPMEETINFO/req_no"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">성명</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "/GRPMEETREQ/SPTGRPMEETINFO/req_nm"/>(<xsl:value-of select = "/GRPMEETREQ/SPTGRPMEETINFO/req_empno"/>)</td>
        	                            <td class="title2" style="width:22% ;  ">소속</td>
        	                            <td class="contant" style="width:28% ;  "><xsl:value-of select = "/GRPMEETREQ/SPTGRPMEETINFO/req_dept_nm"/></td>
        	                        </tr>
        	                    </table>
        	                </td>
        	            </tr>
        	        </table>
        	        <table class="aproutertable" style="width:100%; ">
        	            <tr>
        	                <td colspan="4" class="head" style="width:100%; ">교류회정보</td>    
        	            </tr>           
        	            <tr>
        	                <td class="body">
        	                    <table class="aprinnertable" style="width:100%; ">  
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >커뮤니티명</td>
        	                            <td colspan="3" class="contant"><xsl:value-of select = "/GRPMEETREQ/SPTGRPMEETINFO/cmnty_nm"/>(<xsl:value-of select = "/GRPMEETREQ/SPTGRPMEETINFO/cmnty_no"/>)</td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >회장</td>
        	                            <td class="contant" style="width:28%;"><xsl:value-of select = "/GRPMEETREQ/SPTGRPMEETINFO/meet_rspns_nm"/></td>
        	                            <td class="title2" style="width:22%;" >간사</td>
        	                            <td class="contant" style="width:28%;"><xsl:value-of select = "/GRPMEETREQ/SPTGRPMEETINFO/mangr_nm"/></td>
        	                        </tr>  
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >교류회명</td>
        	                            <td class="contant" style="width:28%;"><xsl:value-of select = "/GRPMEETREQ/SPTGRPMEETINFO/intrc_meet_nm"/></td>                           
        	                            <td class="title2" style="width:22%;" >회차</td>
        	                            <td class="contant" style="width:28%;"><xsl:value-of select = "/GRPMEETREQ/SPTGRPMEETINFO/times"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >개최일자</td>
        	                            <td class="contant" style="width:28%;"><xsl:value-of select = "/GRPMEETREQ/SPTGRPMEETINFO/open_ymd"/></td>
        	                            <td class="title2" style="width:22%;" >개최장소</td>
        	                            <td class="contant" style="width:28%;"><xsl:value-of select = "/GRPMEETREQ/SPTGRPMEETINFO/open_plc"/></td>                           
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >교류회내용</td>
        	                            <td class="contant" colspan="3"><xsl:value-of select = "/GRPMEETREQ/SPTGRPMEETINFO/intrc_meet_contnt"/></td>                           
        	                        </tr>
                                    <tr>
                                        <td class="title2" style="width:22%;" >개최계획서</td>
                                        <td class="contant" colspan="3">
                                            <xsl:for-each select="/GRPMEETREQ/fileList_A/vector/data/mdata">
                                                <a>
                                                    <xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA005')</xsl:attribute>
													<xsl:value-of select="file_nm" /><br/>
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
        	                <td colspan="4" class="head">내부참여자</td>
        	            </tr>                                                                               
        	            <tr>
        	                <td colspan="4" class="body">               
        	                    <table class="aprinnertable" style="width:100%; ">                     
        	                        <tr>
        	                            <th class="title" style="width:10%;">순번</th>
        	                            <th class="title" style="width:25%;">성명</th>
        	                            <th class="title" style="width:40%;">부서</th>
        	                            <th class="title" style="width:25%;" >휴대전화</th>
        	                        </tr>           	                            
        	                        <xsl:for-each select="/GRPMEETREQ/GRIDRESULT01/vector/data/msgSptIntrcAttncecCmpy001">
        	                        <tr>
        	                            <td class="contant-center" style="width:10%; "><xsl:value-of select = "position()"/></td>
        	                            <td class="contant-center" style="width:25%; "><xsl:value-of select = "attnce"/></td> 
        	                            <td class="contant-center" style="width:40%; "><xsl:value-of select = "dept_nm"/></td>
        	                            <td class="contant-center" style="width:25%; "><xsl:value-of select = "attnce_psn_mobile"/></td> 
        	                        </tr>
        	                        </xsl:for-each>
        
        	                    </table>
        	                </td>
        	            </tr>                                
        	        </table>
        	        <table class="aproutertable" style="width:100%; ">       
        	            <tr>    
        	                <td colspan="4" class="head">기업참여자</td>
        	            </tr>                                                                               
        	            <tr>
        	                <td colspan="4" class="body">               
        	                    <table class="aprinnertable" style="width:100%; ">                     
        	                        <tr>
        	                            <th rowspan="2" class="title" style="width:3%;">순번</th>
        	                            <th rowspan="2" class="title" style="width:20%;">기업명</th>
        	                            <th rowspan="2" class="title" style="width:14%;" >사업자번호</th>
        	                            <th rowspan="2" class="title" style="width:10%;">대표자</th>
        	                            <th rowspan="2" class="title" style="width:16%;">멘토성명</th>
        	                            <th colspan="2" class="title">참여자</th>
        	                            <th rowspan="2" class="title" style="width:12%;">등록완료여부</th>
        	                        </tr>
        	                        <tr>
        	                            <th class="title" style="width:10%; ">성명</th>
        	                            <th class="title" style="width:15%; ">휴대전화</th>
        	                        </tr>
        	                      
        	                       <xsl:for-each select="/GRPMEETREQ/GRIDRESULT02/vector/data/msgSptIntrcAttncecCmpy001">
        	                        <tr>
        	                            <td class="contant-center" style="width:3%; "><xsl:value-of select = "position()"/></td>
        	                            <td class="contant" style="width:20%; "><xsl:value-of select = "cmpy_nm_krchar"/></td>
        	                            <td class="contant-center" style="width:14%; "><xsl:value-of select = "bsns_psn_regst_no"/></td>
        	                            <td class="contant-center" style="width:10%; "><xsl:value-of select = "reprs_psn"/></td> 
        	                            <td class="contant-center" style="width:16%; "><xsl:value-of select = "mento"/></td> 
        	                            <td class="contant-center" style="width:10%; "><xsl:value-of select = "attnce_psn_nm"/></td>
        	                            <td class="contant-center" style="width:15%; "><xsl:value-of select = "attnce_psn_mobile"/></td>
        	                            <td class="contant-center" style="width:12%; "><xsl:value-of select = "wrte_clsf"/></td>
        	                        </tr>
        	                        </xsl:for-each>
        
        	                    </table>
        	                </td>
        	            </tr>                                
        	        </table>
        	        <table class="aproutertable" style="width:100%; ">       
        	            <tr>    
        	                <td colspan="4" class="head">주요프로그램</td>
        	            </tr>                                                                               
        	            <tr>
        	                <td colspan="4" class="body">               
        	                    <table class="aprinnertable" style="width:100%; ">                     
        	                        <tr>
        	                            <th rowspan="2" class="title" style="width:5%;">순번</th>
        	                            <th colspan="3" class="title" style="width:20%;">일정</th>
        	                            <th rowspan="2" class="title" style="width:30%;">내용</th>
        	                            <th rowspan="2" class="title" style="width:15%;" >주관</th>
        	                            <th rowspan="2" class="title" style="width:15%;">장소</th>
        	                            <th rowspan="2" class="title" style="width:15%;">비고</th>
        	                        </tr>
        	                        <tr>
        	                            <th class="title" style="width:6%; ">시작</th>
        	                            <th class="title" style="width:6%; ">종료</th>
        	                            <th class="title" style="width:8%; ">소요(분)</th>
        	                        </tr>
        	                      
        	                       <xsl:for-each select="/GRPMEETREQ/GRIDRESULT03/vector/data/msgSptIntrcSched001">
        	                       		<tr>
        	                            <td class="contant-center" style="width:5%; "><xsl:value-of select = "position()"/></td>
        	                            <td class="contant-center" style="width:6%; "><xsl:value-of select = "concat(substring(start_time, 1, 2), ':', substring(start_time, 3, 2))"/></td>
        	                            <td class="contant-center" style="width:6%; "><xsl:value-of select = "concat(substring(cls_time, 1, 2), ':', substring(cls_time, 3, 2))"/></td>
        	                            <td class="contant-center" style="width:8%; "><xsl:value-of select = "total_time"/></td>
        	                            <td class="contant" style="width:30%; "><xsl:value-of select = "contnt"/></td>
        	                            <td class="contant-center" style="width:15%; "><xsl:value-of select = "supvis"/></td> 
        	                            <td class="contant-center" style="width:15%; "><xsl:value-of select = "plc"/></td> 
        	                            <td class="contant" style="width:15%; "><xsl:value-of select = "rmk"/></td>
        	                        	</tr>
        	                        </xsl:for-each>
        
        	                    </table>
        	                </td>
        	            </tr>                                
        	        </table>
        	        <table class="aproutertable" style="width:100%; ">       
        	            <tr>    
        	                <td colspan="4" class="head">소요예산</td>
        	            </tr>                                                                               
        	            <tr>
        	                <td colspan="4" class="body">               
        	                    <table class="aprinnertable" style="width:100%; ">                     
        	                        <tr>
        	                            <th class="title" style="width:5%;">순번</th>
        	                            <th class="title" style="width:20%;">항목</th>
        	                            <th class="title" style="width:10%;">금액</th>
        	                            <th class="title" style="width:40%;" >산출내역</th>
        	                            <th class="title" style="width:25%;">비고</th>
        	                        </tr>
        	                        
        	                        <xsl:for-each select="/GRPMEETREQ/GRIDRESULT04/vector/data/msgSptIntrcBugt001">
        	                        <tr>
        	                            <td class="contant-center" style="width:5%; "><xsl:value-of select = "position()"/></td>
        	                            <td class="contant-center" style="width:20%; "><xsl:value-of select = "item"/></td>
        	                            <td class="contant-right" style="width:10%; "><xsl:value-of select = "format-number(amt, '###,###')"/></td>
        	                            <td class="contant" style="width:40%; "><xsl:value-of select = "calc_detls"/></td>
        	                            <td class="contant" style="width:25%; "><xsl:value-of select = "rmk"/></td> 
        	                        </tr>
        	                        </xsl:for-each>
        							<tr>
        								<td class="contant" style="width:5%;"></td>
        								<td class="contant-center" style="width:20%;">총합</td>
        	                            <td class="contant-right" style="width:10%; "><xsl:value-of select = "format-number(/GRPMEETREQ/SPTGRPMEETINFO/total, '###,###')"/></td> 
        	                            <td class="contant" style="width:40%; "></td>
        	                            <td class="contant" style="width:25%; "></td> 
        							</tr>
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