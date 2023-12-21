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
        	                <td colspan="4" class="head" style="width:100%; ">발명정보</td>    
        	            </tr>           
        	            <tr>
        	                <td class="body">
        	                    <table class="aprinnertable" style="width:100%; " >  
        	                    	<tr>
        	                            <td class="title2" style="width:22%; ">발명신고번호</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "root/doc_no"/></td>
        	                            <td class="title2" style="width:22% ;  ">관리번호</td>
        	                            <td class="contant" style="width:28% ;  " ><xsl:value-of select = "root/mngmt_no"/> </td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">출원번호</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "root/smitapp_no"/></td>
        	                            <td class="title2" style="width:22%; ">특허사무소 </td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "root/office_nm"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">대상국가</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "root/smitapp_natn_nm"/></td>
        	                            <td class="title2" style="width:22%; ">권리구분 </td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "root/pat_clsf_nm"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%; ">발명의 명칭</td>
        	                            <td class="contant" style="width:28% ; " colspan="3"><xsl:value-of select = "root/invnt_krn_nm"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22% ;  ">출원일자</td>
        	                            <td class="contant" style="width:28% ;  " ><xsl:value-of select = "root/smitapp_ymd"/></td>
        	                            <td class="title2" style="width:22%; ">출원구분</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "root/smitapp_occr_clsf_nm"/></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22% ;  ">OA차수</td>
        	                            <td class="contant" style="width:28% ;  " ><xsl:value-of select = "root/oa_sn"/> 차</td>
        	                            <td class="title2" style="width:22%; ">OA발생일자</td>
        	                            <td class="contant" style="width:28% ; "> <xsl:value-of select="root/rcpt_oa_date" /></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22% ;  ">OA보고구분</td>
        	                            <td class="contant" style="width:28% ;  " ><xsl:value-of select = "root/rcpt_clsf_nm"/></td>
        	                            <td class="title2" style="width:22%; ">OA대응마감일</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "root/rcpt_due_date"/></td>
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
        	                            <td class="contant" style="width:28% ;  " ><xsl:value-of select = "root/req_no"/>  /  <xsl:value-of select = "root/req_sn"/></td>
        	                             <td class="title2" style="width:22%; ">신청일자</td>
        	                            <td class="contant" style="width:28% ; "><xsl:value-of select = "root/req_ymd" /></td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >변경전마감일자</td>
        	                            <td class="contant"><xsl:value-of select = "root/bf_chng_ymd"/></td>
        	                            <td class="title2" style="width:22%;" >마감일 연장기간</td>
        	                            <td colspan="2" class="contant">
        	                            	<input type="radio" name="rdoLongTerm" id="rdoLongTerm">
        	                            		<xsl:if test="root/long_term = '1'">
        	                            			<xsl:attribute name="checked">Y</xsl:attribute>
        	                            		</xsl:if>
        	                            		1개월
        	                            	</input>  
        	                            	<input type="radio" name="rdoLongTerm" id="rdoLongTerm">
        	                            		<xsl:if test="root/long_term = '2'">
        	                            			<xsl:attribute name="checked">Y</xsl:attribute>
        	                            		</xsl:if>
        	                            		2개월
        	                            	</input>  
        	                            	<input type="radio" name="rdoLongTerm" id="rdoLongTerm">
        	                            		<xsl:if test="root/long_term = '3'">
        	                            			<xsl:attribute name="checked">Y</xsl:attribute>
        	                            		</xsl:if>
        	                            		3개월
        	                            	</input>        	                            
        	                            </td>
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >신청자</td>
        	                            <td class="contant" style="width:28%;"><xsl:value-of select = "root/nm"/></td>
        	                            <td class="title2" style="width:22%;" >부서명</td>
        	                            <td class="contant" style="width:28%;"><xsl:value-of select = "root/dept_nm"/></td>
        	                        </tr>  
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >신청사유</td>
        	                            <td colspan="3" class="contant" style="width:28%;"><xsl:value-of select = "root/chng_rsn"/></td>                           
        	                        </tr>
        	                        <tr>
        	                            <td class="title2" style="width:22%;" >비고</td>
        	                            <td colspan="3" class="contant" style="width:28%;"><xsl:value-of select = "root/rmk"/></td>
        	                        </tr>
        	                        <tr>
                                        <td class="title2" style="width:22%;" >첨부파일</td>
                                        <td class="contant" colspan="3">
                                            <xsl:for-each select="root/attachVo1">
                                                <a>
                                                	<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA070')</xsl:attribute>
													<xsl:value-of select="file_nm" />
                                                </a>
                                                <xsl:if test="attach_file_no != ''">
													<a>
														<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of
															select="seq" />')</xsl:attribute>
														<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기"
															style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;" />
													</a>
												</xsl:if>
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