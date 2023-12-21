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
        	                <td colspan="4" class="head" style="width:100%; ">인수인계신청</td>    
        	            </tr>           
        	            <tr>
        	                <td class="body">
        	                    <table class="aprinnertable" style="width:100%; " >  
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">구분</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "/ASSAPPCHAREQ/INSUINKEINFO/aset_typ_nm"/></td>
        	                            <td class="title2" style="width:22% ;  ">인수인계 신청서 번호</td>
        	                            <td id="req_no" class="contant" style="width:28% ;  "><xsl:value-of select = "/ASSAPPCHAREQ/INSUINKEINFO/req_no"/></td>
        	                        </tr>
        	                    </table>
        	                </td>
        	            </tr>
        	        </table>
        	        <table class="aproutertable" style="width:100%; ">
        	            <tr>
        	                <td colspan="4" class="head" style="width:100%; ">인계자정보 </td>    
        	            </tr>           
        	            <tr>
        	                <td class="body">
        	                    <table class="aprinnertable" style="width:100%; ">  
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">인계자</td>
        	                            <td class="contant" style="width:28%; "><xsl:value-of select = "/ASSAPPCHAREQ/INSUINKEINFO/trans_nm"/>[<xsl:value-of select = "/ASSAPPCHAREQ/INSUINKEINFO/trans_empno"/>]</td>
        	                            <td class="title2" style="width:22%; ">이메일</td>
        	                            <td class="contant" style="width:28%; "><xsl:value-of select = "/ASSAPPCHAREQ/INSUINKEINFO/trans_email"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2">부서명</td>
        	                            <td class="contant"><xsl:value-of select = "/ASSAPPCHAREQ/INSUINKEINFO/trans_dept_nm"/></td>
        	                            <td class="title2">연락처</td>
        	                            <td class="contant"><xsl:value-of select = "/ASSAPPCHAREQ/INSUINKEINFO/trans_ext_no"/></td>
        	                        </tr>  
        	                        <tr>
        	                            <td class="title2">사유</td>
        	                            <td class="contant" colspan = "3"><xsl:value-of select = "/ASSAPPCHAREQ/INSUINKEINFO/cause"/></td>                           
        	                        </tr>  
        	                    </table>
        	                </td>
        	            </tr>
        	        </table>
        	        
        	        <table class="aproutertable" style="width:100%; ">                          
        	            <tr>
        	                <td colspan="4" class="head">인수자정보</td>
        	            </tr>
        	            <tr>
        	                <td class="body">
        	                    <table class="aprinnertable" style="width:100%; ">  
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">인수자</td>
        	                            <td class="contant" style="width:28%; "><xsl:value-of select = "/ASSAPPCHAREQ/INSUINKEINFO/receipt_nm"/>[<xsl:value-of select = "/ASSAPPCHAREQ/INSUINKEINFO/receipt_empno"/>]</td>
        	                            <td class="title2" style="width:22%; ">이메일</td>
        	                            <td class="contant" style="width:28%; "><xsl:value-of select = "/ASSAPPCHAREQ/INSUINKEINFO/receipt_email"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2">부서명</td>
        	                            <td class="contant"><xsl:value-of select = "/ASSAPPCHAREQ/INSUINKEINFO/receipt_dept_nm"/></td>
        	                            <td class="title2">연락처</td>
        	                            <td class="contant"><xsl:value-of select = "/ASSAPPCHAREQ/INSUINKEINFO/receipt_ext_no"/></td>
        	                        </tr>  
        	                    </table>
        	                </td>
        	            </tr>
        	        </table>            
        	
        	        <table class="aproutertable" style="width:100%; ">       
        	            <tr>    
        	                <td colspan="4" class="head">인수인계 신청내역</td>
        	            </tr>                                                                               
        	            <tr>
        	                <td colspan="4" class="body">               
        	                    <table class="aprinnertable" style="width:100%; ">                     
        	                        <tr>
        	                            <th class="title" style="width:5%; ">순번</th>
        	                            <th class="title" style="width:10%; ">시제품번호</th>
        	                            <th class="title" style="width:15%; ">품명</th> 
        	                            <th class="title" style="width:20%; ">위치-지역</th>
        	                            <th class="title" style="width:15%; ">위치-건물</th>
        	                            <th class="title" style="width:15%; ">위치-층</th>
        	                            <th class="title" style="width:20%; ">상세위치</th>                        
        	                        </tr>
     
        	                        <xsl:for-each select="/ASSAPPCHAREQ/GRIDRESULT/vector/data/msgAssMastrB011">
        	                        <tr>
        	                            <td class="contant-center" style="width:5%; "><xsl:value-of select = "position()"/></td>
        	                            <td class="contant-center" style="width:10%; "><xsl:value-of select = "pilot_no"/></td>
       	                            	<td class="contant" style="width:15%; "><xsl:value-of select = "pilot_nm"/></td> 
       	                            	<td class="contant" style="width:20%; "><xsl:value-of select = "posi_region_nm"/></td>
       	                            	<td class="contant" style="width:15%; "><xsl:value-of select = "posi_build_nm"/></td>
       	                            	<td class="contant" style="width:15%; "><xsl:value-of select = "posi_floor"/></td>
       	                            	<td class="contant" style="width:20%; "><xsl:value-of select = "posi_detls"/></td>
        	                        </tr>
        	                        </xsl:for-each>
        	                    </table>
        	               </td>
        	            </tr>        	                                           
        	        </table> 
        	        
                    <table class="aproutertable" style="width:100%; ">       
        	            <tr> 
							<xsl:choose>
								<xsl:when test ="/ASSAPPCHAREQ/INSUINKEINFO/chk_posi = 'Y'">
									<td colspan="4" class='head'>시제품위치 정보변경 내역</td>
								</xsl:when>
								<xsl:when test ="/ASSAPPCHAREQ/INSUINKEINFO/chk_posi = 'N'">
									<td colspan="4" class='head'>시제품위치 정보변경 내역   [ 위치변동없음  ]</td>
								</xsl:when>
							</xsl:choose>        	               
<!--        	                <td colspan="4" class="head">자산위치 정보변경 내역</td>-->
        	            </tr>          	                                                                                          
        	            <tr>
        	                <td colspan="4" class="body">               
        	                    <table class="aprinnertable" style="width:100%; ">                     
        	                        <tr>
        	                            <th class="title" style="width:5%; ">순번</th>
        	                            <th class="title" style="width:10%; ">시제품번호</th>
        	                            <th class="title" style="width:15%; ">품명</th>
        	                            <th class="title" style="width:20%; ">위치-지역</th>
        	                            <th class="title" style="width:15%; ">위치-건물</th>
        	                            <th class="title" style="width:15%; ">위치-층</th>
        	                            <th class="title" style="width:20%; ">상세위치</th>                        
        	                        </tr>
 
        	                        <xsl:for-each select="/ASSAPPCHAREQ/GRIDRESULT02/vector/data//msgAssMastrB011">
        	                        <tr>
        	                            <td class="contant-center" style="width:5%;  "><xsl:value-of select = "position()"/></td>
        	                            <td class="contant-center" style="width:10%; "><xsl:value-of select = "pilot_no"/></td>
        	                            <td class="contant"        style="width:15%; "><xsl:value-of select = "pilot_nm"/></td>        	                            
       	                            	<td class="contant" style="width:20%; "><xsl:value-of select = "posi_region_nm02"/></td>
       	                            	<td class="contant" style="width:15%; "><xsl:value-of select = "posi_build_nm02"/></td>
       	                            	<td class="contant" style="width:15%; "><xsl:value-of select = "posi_floor02"/></td>
       	                            	<td class="contant" style="width:20%; "><xsl:value-of select = "posi_detls02"/></td>        	                        </tr>
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