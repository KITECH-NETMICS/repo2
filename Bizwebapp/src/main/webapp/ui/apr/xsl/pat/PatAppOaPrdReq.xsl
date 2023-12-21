<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml" encoding="UTF-8" indent="yes"/>

<xsl:template match="APPROVAL">
	    <body>
	    <table style="width:750px; " border='0' cellspacing='0' cellpadding='0'>
            <tr>
                <td>   	    
        	        <table class="aproutertable" style="width:100%; ">
        	            <tr>
        	                <td colspan="4" class="head" style="width:100%; ">발명정보</td>    
        	            </tr>           
        	            <tr>
        	                <td class="body">
        	                    <table class="aprinnertable" style="width:100%; " >  
        	                    	<tr>
        	                            <td class="title2" style="width:22%; ">발명신고번호</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "doc_no"/></td>
        	                            <td class="title2" style="width:22% ;  ">관리번호</td>
        	                            <td class="contant" style="width:28% ;  " ><xsl:value-of select = "mngmt_no"/> </td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">출원번호</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "smitapp_no"/></td>
        	                            <td class="title2" style="width:22%; ">특허사무소 </td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "office_nm"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">대상국가</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "smitapp_natn_nm"/></td>
        	                            <td class="title2" style="width:22%; ">권리구분 </td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "pat_clsf_nm"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">발명의 명칭</td>
        	                            <td class="contant" style="width:28% ; " colspan="3"><xsl:value-of select = "invnt_krn_nm"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22% ;  ">출원일자</td>
        	                            <td class="contant" style="width:28% ;  " ><xsl:value-of select = "smitapp_ymd"/></td>
        	                            <td class="title2" style="width:22%; ">출원구분</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "smitapp_occr_clsf_nm"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22% ;  ">OA차수</td>
        	                            <td class="contant" style="width:28% ;  " ><xsl:value-of select = "oa_sn"/> 차</td>
        	                            <td class="title2" style="width:22%; ">OA발생일자</td>
        	                            <td class="contant" style="width:28% ; "> <xsl:value-of select="rcpt_oa_date" /></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22% ;  ">OA보고구분</td>
        	                            <td class="contant" style="width:28% ;  " ><xsl:value-of select = "rcpt_clsf_nm"/></td>
        	                            <td class="title2" style="width:22%; ">OA대응마감일</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "rcpt_due_date"/></td>
        	                        </tr>
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
        	                            <td class="title2" style="width:22% ;  ">OA기간연장신청번호 / 순번</td>
        	                            <td class="contant" style="width:28% ;  " ><xsl:value-of select = "req_no"/>  /  <xsl:value-of select = "req_sn"/></td>
        	                             <td class="title2" style="width:22%; ">신청일자</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "req_ymd" /></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >변경전마감일자</td>
        	                            <td class="contant"><xsl:value-of select = "bf_chng_ymd"/></td>
        	                            <td class="title2" style="width:22%;" >마감일 연장기간</td>
        	                            <td colspan="2" class="contant">
        	                            	<input type="radio" name="rdoLongTerm" id="rdoLongTerm">
        	                            		<xsl:if test="long_term = '1'">
        	                            			<xsl:attribute name="checked">Y</xsl:attribute>
        	                            		</xsl:if>
        	                            		1개월
        	                            	</input>  
        	                            	<input type="radio" name="rdoLongTerm" id="rdoLongTerm">
        	                            		<xsl:if test="long_term = '2'">
        	                            			<xsl:attribute name="checked">Y</xsl:attribute>
        	                            		</xsl:if>
        	                            		2개월
        	                            	</input>  
        	                            	<input type="radio" name="rdoLongTerm" id="rdoLongTerm">
        	                            		<xsl:if test="long_term = '3'">
        	                            			<xsl:attribute name="checked">Y</xsl:attribute>
        	                            		</xsl:if>
        	                            		3개월
        	                            	</input>        	                            
        	                            </td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >신청자</td>
        	                            <td class="contant" style="width:28%;"><xsl:value-of select = "nm"/></td>
        	                            <td class="title2" style="width:22%;" >부서명</td>
        	                            <td class="contant" style="width:28%;"><xsl:value-of select = "dept_nm"/></td>
        	                        </tr>  
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >신청사유</td>
        	                            <td colspan="3" class="contant" style="width:28%;"><xsl:value-of select = "chng_rsn"/></td>                           
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >비고</td>
        	                            <td colspan="3" class="contant" style="width:28%;"><xsl:value-of select = "rmk"/></td>
        	                        </tr>
        	                        <tr>
                                        <td class="title2" style="width:22%;" >첨부파일</td>
                                        <td class="contant" colspan="3">
                                            <xsl:for-each select="fileList_A/vector/data/mdata">
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