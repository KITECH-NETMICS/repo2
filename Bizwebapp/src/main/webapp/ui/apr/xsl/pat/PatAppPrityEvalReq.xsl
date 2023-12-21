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
        	                <td colspan="4" class="head" style="width:100%; ">출원/등록번호</td>    
        	            </tr>           
        	            <tr>
        	                <td class="body">
        	                    <table class="aprinnertable" style="width:100%; " >  
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">출원번호</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "/PATAPPPRITYEVALREQ/PATAPPPRITYEVALINFO/smitapp_no"/></td>
        	                            <td class="title2" style="width:22% ;  ">우선심사 신청번호</td>
        	                            <td class="contant" style="width:28% ;  " ><xsl:value-of select = "/PATAPPPRITYEVALREQ/PATAPPPRITYEVALINFO/req_no"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">발명의 명칭</td>
        	                            <td class="contant" style="width:28% ; " colspan="3"><xsl:value-of select = "/PATAPPPRITYEVALREQ/PATAPPPRITYEVALINFO/invnt_krn_nm"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22% ;  ">출원일자</td>
        	                            <td class="contant" style="width:28% ;  " ><xsl:value-of select = "/PATAPPPRITYEVALREQ/PATAPPPRITYEVALINFO/smitapp_ymd"/></td>
        	                            <td class="title2" style="width:22%; ">관리번호</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "/PATAPPPRITYEVALREQ/PATAPPPRITYEVALINFO/mngmt_no"/></td>
        	                        </tr>
        	                    </table>
        	                </td>
        	            </tr>
        	        </table>
        	        
        	        <table class="aproutertable" style="width:100%; ">       
        	            <tr>    
        	                <td colspan="4" class="head">직무발명자</td>
        	            </tr>                                                                               
        	            <tr>
        	                <td colspan="4" class="body">               
        	                    <table class="aprinnertable" style="width:100%; ">                     
        	                        <tr>
        	                            <th class="title" style="width:5%;">순번</th>
        	                            <th class="title" style="width:10%;">주발명자</th>
        	                            <th class="title" style="width:10%;">소속구분</th>
        	                            <th class="title" style="width:20%;">성명</th>
        	                            <th class="title" style="width:10%;" >지분(%)</th>
        	                            <th class="title" style="width:20%;" >연락처</th>
        	                            <th class="title" style="width:25%;" >소속</th>
        	                        </tr>           	                            
        	                        <xsl:for-each select="/PATAPPPRITYEVALREQ/GRIDRESULT/vector/data/msgPatAppCoinvntPsnMS01">
        	                        <tr>
        	                            <td class="contant-center" style="width:5%; "><xsl:value-of select = "position()"/></td>
        	                            <td class="contant-center" style="width:10%; "><xsl:value-of select = "invnt_psn_clsf_nm"/></td> 
        	                            <td class="contant-center" style="width:10%; "><xsl:value-of select = "blong_clsf_nm"/></td>
        	                            <td class="contant-center" style="width:20%; "><xsl:value-of select = "nm"/></td> 
        	                            <td class="contant-center" style="width:10%; "><xsl:value-of select = "stake_rt"/></td>
        	                            <td class="contant-center" style="width:20%; "><xsl:value-of select = "contac_loc"/></td>
        	                            <td class="contant-center" style="width:25%; "><xsl:value-of select = "blong_nm"/></td>
        	                        </tr>
        	                        </xsl:for-each>
        
        	                    </table>
        	                </td>
        	            </tr>                                
        	        </table>
        	        
        	        
        	        <table class="aproutertable" style="width:100%; ">
        	            <tr>
        	                <td colspan="4" class="head" style="width:100%; ">신청정보</td>    
        	            </tr>           
        	            <tr>
        	                <td class="body">
        	                    <table class="aprinnertable" style="width:100%; ">  
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >신청일</td>
        	                            <td colspan="3" class="contant"><xsl:value-of select = "/PATAPPPRITYEVALREQ/PATAPPPRITYEVALINFO/req_ymd"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >신청자</td>
        	                            <td class="contant" style="width:28%;"><xsl:value-of select = "/PATAPPPRITYEVALREQ/PATAPPPRITYEVALINFO/req_nm"/></td>
        	                            <td class="title2" style="width:22%;" >부서명</td>
        	                            <td class="contant" style="width:28%;"><xsl:value-of select = "/PATAPPPRITYEVALREQ/PATAPPPRITYEVALINFO/req_dept_nm"/></td>
        	                        </tr>  
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >신청사유</td>
        	                            <td colspan="3" class="contant" style="width:28%;"><xsl:value-of select = "/PATAPPPRITYEVALREQ/PATAPPPRITYEVALINFO/req_resn"/></td>                           
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >비고</td>
        	                            <td colspan="3" class="contant" style="width:28%;"><xsl:value-of select = "/PATAPPPRITYEVALREQ/PATAPPPRITYEVALINFO/rmk"/></td>
        	                        </tr>
        	                        <tr>
                                        <td class="title2" style="width:22%;" >첨부파일</td>
                                        <td class="contant" colspan="3">
                                            <xsl:for-each select="/PATAPPPRITYEVALREQ/PATAPPPRITYEVALINFO/fileList_A/vector/data/mdata">
                                                <a>
                                                	<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
													<xsl:value-of select="file_nm" />
                                                </a>
                                            </xsl:for-each>                                         
                                        </td>                          
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