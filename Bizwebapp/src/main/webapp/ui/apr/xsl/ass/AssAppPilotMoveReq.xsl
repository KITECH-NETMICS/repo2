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
        	                <td colspan="4" class="head" style="width:100%; ">시제품 반출 신청</td>    
        	            </tr>           
        	            <tr>
        	                <td class="body">
        	                    <table class="aprinnertable" style="width:100%; " >  
        	                        <tr>
        	                            <td class="title2" style="width:22% ; ">신청서 번호</td>
        	                            <td colspan="3" class="contant" style="width:78% ; "><xsl:value-of select = "/ASSAPPIOREQ/ASSOUTINFO/req_no"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">반출 예정일자</td>
        	                            <td class="contant" style="width:28% ; ">
                                            <xsl:value-of select = "concat(substring(/ASSAPPIOREQ/ASSOUTINFO/tout_schdl_ymd, 1, 4), '-', substring(/ASSAPPIOREQ/ASSOUTINFO/tout_schdl_ymd, 5, 2), '-', substring(/ASSAPPIOREQ/ASSOUTINFO/tout_schdl_ymd, 7, 2))"/>        	                            	
        	                            </td>
        	                            <td class="title2" style="width:22% ;  ">반입 예정일자</td>
        	                            <td class="contant" style="width:28% ;  ">
                                            <xsl:value-of select = "concat(substring(/ASSAPPIOREQ/ASSOUTINFO/brin_schdl_ymd, 1, 4), '-', substring(/ASSAPPIOREQ/ASSOUTINFO/brin_schdl_ymd, 5, 2), '-', substring(/ASSAPPIOREQ/ASSOUTINFO/brin_schdl_ymd, 7, 2))"/>        	                            	
        	                            </td>
        	                        </tr>
        	                    </table>
        	                </td>
        	            </tr>
        	        </table>
        	        <table class="aproutertable" style="width:100%; ">
        	            <tr>
        	                <td colspan="4" class="head" style="width:100%; ">반출자정보</td>    
        	            </tr>           
        	            <tr>
        	                <td class="body">
        	                    <table class="aprinnertable" style="width:100%; ">  
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">반출자</td>
        	                            <td class="contant" style="width:28%; ">
        	                            	<xsl:value-of select = "/ASSAPPIOREQ/ASSOUTINFO/tout_psn_nm"/>
        	                            	[<xsl:value-of select = "/ASSAPPIOREQ/ASSOUTINFO/tout_psn_empno"/>]
        	                            </td>
        	                            <td class="title2" style="width:22%; ">이메일</td>
        	                            <td class="contant" style="width:28%; "><xsl:value-of select = "/ASSAPPIOREQ/ASSOUTINFO/tout_psn_email"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2">부서명</td>
        	                            <td class="contant"><xsl:value-of select = "/ASSAPPIOREQ/ASSOUTINFO/tout_psn_dept_nm"/></td>
        	                            <td class="title2">연락처</td>
        	                            <td class="contant"><xsl:value-of select = "/ASSAPPIOREQ/ASSOUTINFO/tout_psn_ext_no"/></td>
        	                        </tr>  
        	                        <tr>
        	                            <td class="title2">사유</td>
        	                            <td class="contant" colspan = "3"><xsl:value-of select = "/ASSAPPIOREQ/ASSOUTINFO/cause"/></td>                           
        	                        </tr> 
        	                        <tr>
        	                            <td class="title2">첨부파일</td>
        	                            <td class="contant" colspan = "3">
        	                            	<xsl:value-of select = "/ASSAPPIOREQ/ASSOUTINFO/attach_file_nm"/>
<!--        	                            	<xsl:value-of select = "/ASSAPPIOREQ/ASSOUTINFO/attach_file_no"/>-->
        	                            </td>                           
        	                        </tr>    
        	                    </table>
        	                </td>
        	            </tr>
        	        </table>
        	        <table class="aproutertable" style="width:100%; ">                          
        	            <tr>
        	                <td colspan="4" class="head">반출정보</td>
        	            </tr>
        	            <tr>
        	                <td class="body">
        	                    <table class="aprinnertable" style="width:100%; ">  
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">이동장소</td>
        	                            <td colspan="3" class="contant" style="width:78%; ">
        	                            	<xsl:value-of select = "/ASSAPPIOREQ/ASSOUTINFO/tout_posi_region"/>
        	                            	<xsl:value-of select = "/ASSAPPIOREQ/ASSOUTINFO/build"/>
        	                            	<xsl:value-of select = "/ASSAPPIOREQ/ASSOUTINFO/floor"/>
        	                            	<xsl:value-of select = "/ASSAPPIOREQ/ASSOUTINFO/detls"/>
										</td>
        	                        </tr>

        	                    </table>
        	                </td>
        	            </tr>
        	        </table>            
        	
        	        <table class="aproutertable" style="width:100%; ">       
        	            <tr>    
        	                <td colspan="4" class="head">반출 신청내역</td>
        	            </tr>                                                                               
        	            <tr>
        	                <td colspan="4" class="body">               
        	                    <table class="aprinnertable" style="width:100%; ">                     
        	                        <tr>
        	                            <th class="title" style="width:5%; ">순번</th>
        	                            <th class="title" style="width:10%; ">시제품번호</th>
        	                            <th class="title" style="width:8%; ">도입일자</th>
        	                            <th class="title" style="width:8%; ">도입금액</th>
        	                            <th class="title" style="width:26%; ">품명</th>                         
        	                        </tr>
        	                        
        	                        <xsl:for-each select="/ASSAPPIOREQ/GRIDRESULT/vector/data/msgAssPilotMastr007">
        	                        <tr>
        	                            <td class="contant-center" style="width:5%; "><xsl:value-of select = "position()"/></td>
        	                            <td class="contant-center" style="width:10%; "><xsl:value-of select = "pilot_no"/></td>
        	                            <td class="contant-center" style="width:8%; ">
                                            <xsl:value-of select = "concat(substring(intro_ymd, 1, 4), '-', substring(intro_ymd, 5, 2), '-', substring(intro_ymd, 7, 2))"/>
         	                            </td>
        	                            <td class="contant-right" style="width:8%; "><xsl:value-of select = "format-number(intro_amt, '###,###')"/></td>
        	                            <td class="contant" style="width:26%; "><xsl:value-of select = "pilot_nm"/></td> 
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