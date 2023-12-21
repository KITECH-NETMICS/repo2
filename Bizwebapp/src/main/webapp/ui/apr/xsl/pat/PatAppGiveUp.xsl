<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
<xsl:template match="/">
	<html lang="kr">
	    <body>
	
		<xsl:if test="count(PATAPPGIVEUPREQ/GRIDRESULT) = 0">
			<table style="width:750px; " border='0' cellspacing='0' cellpadding='0'>
				<tr>
					<td>   	    
						<table class="aproutertable" style="width:100%; ">
							<tr>
								<td colspan="4" class="head" style="width:100%; ">발명신고서 정보</td>    
							</tr>           
							<tr>
								<td class="body">
									<table class="aprinnertable" style="width:100%; " >  
										<tr>
											<td class="title2" style="width:22%; ">관리번호</td>
											<td class="contant" style="width:28%; "><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/mngmt_no"/></td>
											<td class="title2" style="width:22%; ">포기신청번호</td>
											<td class="contant" style="width:28%; "><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/req_no"/></td>
										</tr>
										<tr>
											<td class="title2" >발명의 명칭</td>
											<td class="contant" colspan="3"><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/invnt_krn_nm"/></td>
										</tr>  
										<tr>
											<td class="title2">발명자</td>
											<td class="contant"><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/invnt_nm"/>[<xsl:value-of select = "/PATAPPGIVEUPREQ/PATGIVEUPINFO/invnt_empno"/>]</td>
											<td class="title2">발명자 부서</td>
											<td class="contant"><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/invnt_dept_nm"/></td>
										</tr> 
									</table>
								</td>
							</tr>
						</table>
						<table class="aproutertable" style="width:100%; ">
							<tr>
								<td colspan="4" class="head" style="width:100%; ">출원/등록정보</td>    
							</tr>           
							<tr>
								<td class="body">
									<table class="aprinnertable" style="width:100%; ">  
										<tr>
											<td class="title2" style="width:22%; ">출원인</td>
											<td class="contant" colspan="3" style="width:72%; "><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/smitapp_nm"/>[<xsl:value-of select = "/PATAPPGIVEUPREQ/PATGIVEUPINFO/receipt_empno"/>]</td>
										</tr>    	                        
										<tr>
											<td class="title2">출원일자</td>
											<td class="contant"><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/smitapp_ymd"/></td>
											<td class="title2">출원번호</td>
											<td class="contant"><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/smitapp_no"/></td>
										</tr>  
										<tr>
											<td class="title2">등록일자</td>
											<td class="contant"><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/regst_ymd"/></td>
											<td class="title2">등록번호</td>
											<td class="contant"><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/regst_no"/></td>
										</tr> 
									</table>
								</td>
							</tr>
						</table>
						<table class="aproutertable" style="width:100%; ">                          
							<tr>
								<td colspan="4" class="head">포기 신청 정보</td>
							</tr>
							<tr>
								<td class="body">
									<table class="aprinnertable" style="width:100%; ">  
										<tr>
											<td class="title2" style="width:22%; ">포기신청일자</td>
											<td class="contant" colspan="3" style="width:72%; "><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/draft_ymd"/></td>
										</tr>
										<tr>
											<td class="title2" style="width:22%; ">신청자</td>
											<td class="contant" style="width:28%; "><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/giveup_nm"/>[<xsl:value-of select = "/PATAPPGIVEUPREQ/PATGIVEUPINFO/giveup_empno"/>]</td>
											<td class="title2" style="width:22%; ">부서명</td>
											<td class="contant" style="width:28%; "><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/giveup_dept_nm"/></td>
										</tr>
										<tr>
											<td class="title2" style="width:22%; ">포기종류</td>
											<td class="contant" colspan="3" style="width:72%; "><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/giveup_knd"/></td>
										</tr>           	                        
										<tr>
											<td class="title2">포기사유</td>
											<td class="contant" colspan="3" ><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/giveup_resn"/></td>
										</tr>  
										<tr>
										<td class='title2'>첨부파일</td>
										<td class='contant' colspan = '3' >
											<xsl:for-each select="PATAPPGIVEUPREQ/PATGIVEUPINFO/fileList_A/vector/data/mdata">
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
		</xsl:if>

		<xsl:if test="count(PATAPPGIVEUPREQ/GRIDRESULT) != 0">

			<table style="width:100%; " border='0' cellspacing='0' cellpadding='0'>
				<tr>
					<td>   	    
						<table class="aproutertable" style="width:100%; ">
							<tr>
								<td colspan="4" class="head" style="width:100%; ">포기신고서 정보</td>    
							</tr>           
							<tr>
								<td class="body">
									<table class="aprinnertable" style="width:100%; " >  
										<tr>
											<td class="title2" style="width:22%; ">포기신청서번호</td>
											<td class="contant" colspan="3"><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/req_no"/></td>
										</tr>
										<tr>
											<td class="title2" style="width:22%; ">주발명자</td>
											<td class="contant" style="width:22%; "><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/invnt_nm"/></td>
											<td class="title2" style="width:22%; ">부서명</td>
											<td class="contant" style="width:22%; "><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/invntdeptNm"/></td>
											
										</tr>  
									</table>
								</td>
							</tr>
						</table>
						<table class="aproutertable" style="width:100%; ">
							<tr>
								<td colspan="4" class="head" style="width:100%; ">지재권정보</td>    
							</tr>           
							<tr>
								<td class="body">
									<table class="aprinnertable" style="width:100%; ">  
										<tr>
											<td class="title2" style="width:4%; ">No.</td>
											<td class="title2" style="width:10%; ">관리번호</td>
											<td class="title2" style="width:19%; ">발명의 명칭</td>
											<td class="title2" style="width:9%; ">등록번호</td>
											<td class="title2" style="width:8%; ">등록일자</td>
											<td class="title2" style="width:6%; ">등록연차수</td>
											<td class="title2" style="width:7%; ">소유권</td>
											<td class="title2" style="width:7%; ">활용구분</td>
											<td class="title2" style="width:10%; ">이전업체명</td>
											<td class="title2" style="width:10%; ">기술이전 계약기간</td>
											<td class="title2" style="width:10%; ">포기처리방안</td>
											
											
										</tr>    	                   
										<xsl:for-each select="PATAPPGIVEUPREQ/GRIDRESULT/vector/data/msgPatPsrLst02">     
										<tr>
											<td class="contant-center" style="width:4%; "><xsl:value-of select = "position()"/></td>
											<td class="contant-center" style="width:10%; "><xsl:value-of select = "mngmt_no"/></td>
											<td class="contant-center" style="width:19%; "><xsl:value-of select = "invnt_krn_nm"/></td>
											<td class="contant-center" style="width:9%; "><xsl:value-of select = "regst_no"/></td>
											<td class="contant-center" style="width:8%; "><xsl:value-of select = "reg_ymd"/></td>
											<td class="contant-center" style="width:6%; "><xsl:value-of select = "regst_yr"/></td>
											<td class="contant-center" style="width:7%; "><xsl:value-of select = "co_smitapp_ex_nm"/></td>
											<td class="contant-center" style="width:7%; "><xsl:value-of select = "trans_yn"/></td>
											<td class="contant-center" style="width:10%; "><xsl:value-of select = "vend_nm"/></td>
											<td class="contant" style="width:10%; "><xsl:value-of select = "period"/></td>
											<td class="contant-center" style="width:10%; "><xsl:value-of select = "after_action"/></td>
											
										</tr>  
										</xsl:for-each>
									</table>
								</td>
							</tr>
						</table>
						<table class="aproutertable" style="width:100%; ">                          
							<tr>
								<td colspan="4" class="head">포기 신청 정보</td>
							</tr>
							<tr>
								<td class="body">
									<table class="aprinnertable" style="width:100%; ">  
										<tr>
											<td class="title2" style="width:22%; ">포기신청일자</td>
											<td class="contant" colspan="3" style="width:72%; "><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/draft_ymd"/></td>
										</tr>
										<tr>
											<td class="title2" style="width:22%; ">신청자</td>
											<td class="contant" style="width:28%; "><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/giveup_nm"/>[<xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/giveup_empno"/>]</td>
											<td class="title2" style="width:22%; ">부서명</td>
											<td class="contant" style="width:28%; "><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/giveup_dept_nm"/></td>
										</tr>
										<tr>
											<td class="title2" style="width:22%; ">포기종류</td>
											<td class="contant" colspan="3" style="width:72%; "><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/selectboxGiveupKnd"/></td>
										</tr>           	                        
										<tr>
											<td class="title2">포기사유</td>
											<td class="contant" colspan="3" ><xsl:value-of select = "PATAPPGIVEUPREQ/PATGIVEUPINFO/giveup_resn"/></td>
										</tr>  
										<tr>
										<td class='title2'>첨부파일</td>
										<td class='contant' colspan = '3' >
											<xsl:for-each select="PATAPPGIVEUPREQ/PATGIVEUPINFO/fileList_A/vector/data/mdata">
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

		</xsl:if>
       
	    </body>
   </html>
</xsl:template>


</xsl:stylesheet>