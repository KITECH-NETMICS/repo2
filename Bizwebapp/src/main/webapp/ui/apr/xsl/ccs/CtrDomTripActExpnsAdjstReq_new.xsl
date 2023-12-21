<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
		<xsl:variable name="localPath" select="1" />
			<BODY>
				<script language="javascript">
				<![CDATA[
					function openAirMileOZPop(airReqNo){						
						var node = "req_no="+ airReqNo;
						com.oz.openPopup({
							ozrCode : "C006",      
							param: node
				        });
					}					
					
					function openFilePop (attachFileNo) {
						var data = {
							attach_file_no : attachFileNo,
							ref_yn : "Y",
							mode : "view"
						};
						com.pop.open(com.pop.TYPE.ATTACH, data);
					}

				]]>
				</script>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">출장정보</td>
						<td align="right" valign="bottom">
							<a><xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="root/tripAdVo/unslip_no" />')</xsl:attribute>
							<img src="http://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/></a>
						</td>
					</tr>
					<tr>
						<td colspan="2" class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td width="13%" class="title">결의일자</td>
									<td width="37%" class="contant" colspan="2">
										<xsl:value-of select="substring(root/tripAdVo/slip_ymd,1,4)" />
										-
										<xsl:value-of select="substring(root/tripAdVo/slip_ymd,5,2)" />
										-
										<xsl:value-of select="substring(root/tripAdVo/slip_ymd,7,2)" />
									</td>
									<td width="13%" class="title">적요</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="root/tripAdVo/rmk" /></td>
								</tr>
								<tr>
									<td width="13%" class="title">출장신청번호</td>
									<td width="20%" class="contant"><xsl:value-of select="root/tripAdVo/biztrip_req_no" /></td>
									<td width="13%" class="title">정산신청번호</td>
									<td width="20%" class="contant"><xsl:value-of select="root/tripAdVo/req_no" /></td>
									<td width="13%" class="title">정산결의번호</td>
									<td width="20%" class="contant">
										<xsl:value-of select="root/tripAdVo/unslip_no" />
										<xsl:if test="contains(root/tripAdVo/decsn_ex, 'Y')">
											[확정]
										</xsl:if>      
									    <xsl:if test="contains(root/tripAdVo/decsn_ex, 'N')">
											[미확정]
										</xsl:if>
										</td>
								</tr>
						 	 	<tr>
									<td width="13%" class="title">변경사유</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="root/tripAdVo/chng_resn" /></td>
									<td width="13%" class="title">변경내용</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="root/tripAdVo/chng_contnt" /></td>
								</tr>
								<tr>
									<td width="13%" class="title">신청 출장기간</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="root/tripAdVo/biztrip_prd" /></td>
									<td width="13%" class="title">복명 출장기간</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="root/tripAdVo/req_prd" /></td>
								</tr> 
								<tr>
									<td width="13%" class="title">신청 출장지</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="root/tripAdVo/biztrip_region" /></td>
									<td width="13%" class="title">복명 출장지</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="root/tripAdVo/truth_biztrip_form" /></td>
								</tr>
								<tr>
									<td width="13%" class="title">신청 출장목적</td>
									<td width="87%" class="contant" colspan="5"><xsl:value-of select="root/tripAdVo/orign_biztrip_goal" /></td>
								</tr>
								<tr>
									<td width="13%" class="title"><font color="blue">복명 출장목적</font></td>
									<td width="87%" class="contant" colspan="5"><font color="blue"><xsl:value-of select="root/tripAdVo/truth_biztrip_goal" /></font></td>
								</tr>
								<tr>
									<td width="13%" class="title">원차량사용</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="root/tripAdVo/car_use_yn" /></td>
									<td width="13%" class="title">운임구분</td>
									<td width="37%" class="contant" colspan="2">
										<xsl:if test="root/tripAdVo/biztrip_way = 'train'"> 열차/버스 등 </xsl:if>
										<xsl:if test="root/tripAdVo/biztrip_way = 'exprss'"> 항공 </xsl:if>
										<xsl:if test="root/tripAdVo/biztrip_way = 'vessel'"> 선박 </xsl:if>
										<xsl:if test="root/tripAdVo/biztrip_way = 'exMile'"> 항공(마일리지) </xsl:if>
									</td>
								</tr>
								<tr>
									<td width="13%" class="title2">정보기기 반출</td>
									<td width="37%" class="contant" colspan="2">
										(<xsl:if test="contains(root/tripAdVo/notebook_out, 'Y')">
											√
										</xsl:if>) 노트북반출      
									    (<xsl:if test="contains(root/tripAdVo/usb_out, 'Y')">
											√
										</xsl:if>) 휴대용저장매체반출
									</td>
									<td width="13%" class="title">정보기기 반입</td>
										<td width="37%" class="contant" colspan="2">
										(<xsl:if test="contains(root/tripAdVo/notebook_in, 'Y')">
											√
										</xsl:if>) 노트북반입      
									    (<xsl:if test="contains(root/tripAdVo/usb_in, 'Y')">
											√
										</xsl:if>) 휴대용저장매체반입
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>	
				<xsl:if test="root/tripAdVo/air_mile_no != ''">
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">항공마일리지 신청(신고)내역</td>
					</tr>
					<tr>
					<td class="body">
						<table width="100%" class="aprinnertable">
							<tr>
								<td class="title">항공마일리지 관리번호</td>
								<td class="title">사번</td>
								<td class="title">성명</td>
								<td class="title">항공사</td>
								<td class="title">적립 마일리지</td>
								<td class="title">신고서 파일</td>
							</tr>
							<xsl:variable name="apr_air_count" select="count(root/mileList)" />
							<xsl:for-each select="root/mileList">								
								<tr>
									<xsl:if test="position()=1">
									<td width="25%" class="contant-center">
										<xsl:attribute name="rowspan"><xsl:value-of select="$apr_air_count" /></xsl:attribute>
										<a>
											<xsl:attribute name="href">javascript:openAirMileOZPop("<xsl:value-of select="req_no" />")</xsl:attribute>
											<xsl:value-of select="req_no" />
										</a>
									</td>
									</xsl:if>
									<td width="15%" class="contant-center">
										<xsl:value-of select="empno"/>
									</td>										
									<td width="15%" class="contant-center">
										<xsl:value-of select="emp_nm"/>
									</td>
									<td width="15%" class="contant-center">
										<xsl:value-of select="air_nm"/>
									</td>
									<td width="15%" class="contant-center">
										<xsl:value-of select="format-number(pub_new_mile, '###,###,###')"/>
									</td>
									<td width="15%" class="contant-center">
										<a>
											<xsl:attribute name="href">javascript:openFilePop('<xsl:value-of select="attach_file_no_req" />')</xsl:attribute>
											<xsl:value-of select="attach_file_no_req" />
										</a>
									</td>
								</tr>
							</xsl:for-each>
						</table>
					</td>
				</tr>
				</table>
				</xsl:if>
				
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">출장경로</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td class="title">순번</td>
									<td class="title">출발지</td>
									<td class="title">도착지</td>
									<td class="title">비고</td>
									<td class="title">숙박</td>
								</tr>
								<xsl:for-each select="root/pathList">
									<tr>
										<td width="10%" class="contant-center">
											<xsl:value-of select="odr" />
										</td>
										<td width="20%" class="contant-center">
											<xsl:value-of select="start_region_nm" />
										</td>
										<td width="20%" class="contant-center">
											<xsl:value-of select="arriv_region_nm" />
										</td>
										<td width="40%" class="contant">
											<xsl:value-of select="rmk" />
										</td>
										<td width="10%" class="contant-center">
											<xsl:value-of select="lodg_yn" /> 박
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
					
				</table>	
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">출장자</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td width="10%" class="title">구분</td>
									<td width="8%" class="title">취소여부</td>
									<td width="20%" class="title">출장자</td>
									<td width="20%" class="title">소속/직급</td>
									<td width="30%" class="title">기간</td>
									<td width="20%" class="title">박/일</td>
								</tr>
								<xsl:for-each select="root/compnList">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="biztrip_psn_clsf_nm" />
										</td>
										<td class="contant-center">
											<font color="blue"><xsl:if test="chng_clsf = '1'">
												취소
											</xsl:if></font>
											<xsl:if test="chng_clsf = ''">
												출장
											</xsl:if>
										</td>
										<td class="contant-center">
											<xsl:value-of select="biztrip_psn_nm" /> ( <xsl:value-of select="biztrip_psn_empno" /> )
										</td>
										<td class="contant-center">
											<xsl:value-of select="biztrip_dept_nm" /> / <xsl:value-of select="posi_clsf_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="concat(substring(biztrip_orign_ymd, 1, 4), '-', substring(biztrip_orign_ymd, 5, 2), '-', substring(biztrip_orign_ymd, 7, 2))"/>
											~
											<xsl:value-of select="concat(substring(biztrip_cls_ymd, 1, 4), '-', substring(biztrip_cls_ymd, 5, 2), '-', substring(biztrip_cls_ymd, 7, 2))"/>
										</td>
										<td class="contant-center">
											<xsl:value-of select="biztrip_nght" /> 박
											<xsl:value-of select="biztrip_day" /> 일
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				<xsl:if test="root/gpsList != ''">	
					<table width="100%" class="aproutertable">
						<tr>
							<td class="head"><font color="blue">위치인증내역</font></td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" class="aprinnertable">
									<tr>
										<td class="title"><font color="blue">성명</font></td>
										<td class="title"><font color="blue">부서명</font></td>
										<td class="title"><font color="blue">인증아이디</font></td>
										<td class="title"><font color="blue">인증지역</font></td>
										<td class="title"><font color="blue">인증시각</font></td>
									</tr>
									<xsl:for-each select="root/gpsList">
										<tr>
											<td width="10%" class="contant-center">
												<font color="blue"><xsl:value-of select="user_nm" /></font>
											</td>
											<td width="20%" class="contant-center">
												<font color="blue"><xsl:value-of select="dept_nm" /></font>
											</td>
											<td width="20%" class="contant-center">
												<font color="blue"><xsl:value-of select="emplyr_id" /></font>
											</td>
											<td width="40%" class="contant">
												<font color="blue"><xsl:value-of select="addr_kr" /></font>
											</td>
											<td width="10%" class="contant-center">
												<font color="blue"><xsl:value-of select="input_date" /></font>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<xsl:if test="root/tripAdVo/bizwrk_atdnc_contnt !=''">
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">복명내역</td>
					</tr>
					<tr>
				     	<td class="body">
					     	<table width="100%" class="aprinnertable">	
					     		<tr>
									<td width="17%" class="title">업무수행내용</td>
									<td width="83%" class="contant" colspan="5">
										<xsl:value-of select="root/tripAdVo/bizwrk_atdnc_contnt"/>
									</td>
								</tr>
								<tr>
									<td width="17%" class="title">주요성과(정책건의사항)</td>
									<td width="83%" class="contant" colspan="5">
										<xsl:value-of select="root/tripAdVo/polcy_suggst_item"/>
									</td>
								</tr>
							</table>
						</td>
					</tr>				
				</table>
				</xsl:if>
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">출장경비</td>
					</tr>
					<tr>
				     	<td class="body">
					     	<table width="100%" class="aprinnertable">	
					     		<tr>
									<td class="title" rowspan="2">성명</td>
									<td class="title" rowspan="2" colspan="2">구분</td>
									<td class="title">기준금액</td>
								    <td class="title">실사용액</td>
								    <td class="title">신청금액</td>
								    <td class="title">카드식</td>
								    <td class="title">법인카드</td>
								</tr>
								<tr>
									<td class="title" colspan="5">산출근거</td>
								</tr>
					     		<xsl:for-each select="root/expnsList">
					     		<tr>
									<td width="10%" class="contant-center" rowspan="8">
									 	<xsl:value-of select="biztrip_psn_nm"/>
								    </td>
									<td width="10%" class="contant-center" rowspan="2">
									 	운임
								    </td>
									<td width="10%" class="contant-center" rowspan="2">
										<xsl:if test="fare_clsf ='CAD001'">
											대중교통
										</xsl:if>
										<xsl:if test="fare_clsf ='CAD003'">
											원차량
										</xsl:if>
										<xsl:if test="fare_clsf ='CAD004'">
											항공
										</xsl:if>
								    </td>
									<td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number(fare_fee_max,'#,###,###,###,###,###')"/>
								    </td>
									<td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number(fare_fee,'#,###,###,###,###,###')"/>
								    </td>
									<td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number(fare_fee_pay,'#,###,###,###,###,###')"/>
								    </td>
								    <td width="10%" class="contant-center"></td>
								    <td width="10%" class="contant-center"></td>
					     		</tr>
								<tr>
									<td class="contant" colspan="5">
										<xsl:if test="fare_clsf ='CAD001'">
											<xsl:value-of select="fare_fee_rmk"/>
										</xsl:if>
										<xsl:if test="fare_clsf ='CAD003'">
											<font color="blue"><xsl:value-of select="fare_fee_rmk"/></font>
										</xsl:if>
										<xsl:if test="fare_clsf ='CAD004'">
											<xsl:value-of select="fare_fee_rmk"/>
										</xsl:if>
									</td>
								</tr>		
					     		<tr>
					     			<td class="contant-center" rowspan="2">
									 	숙박
								    </td>
									<td width="10%" class="contant-center" rowspan="2">
									 	<xsl:if test="lodg_clsf ='CAG001'">
											일반숙박
										</xsl:if>
										<xsl:if test="lodg_clsf ='CAG002'">
											친지숙박
										</xsl:if>
										<xsl:if test="lodg_clsf ='CAG003'">
											공동숙박
										</xsl:if>
										<xsl:if test="lodg_clsf ='CAG004'">
											숙박제공
										</xsl:if>
								    </td>
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number(lodg_fee_max,'#,###,###,###,###,###')"/>
								    </td>
									<td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number(lodg_fee,'#,###,###,###,###,###')"/>
								    </td>
									<td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number(lodg_fee_pay,'#,###,###,###,###,###')"/>
								    </td>
								    <td width="10%" class="contant-center"></td>
								    <td width="10%" class="contant-center">
								    	<font color="blue">
								    	<xsl:if test="lodg_card_yn = 'Y'">
											카드사용								    	
								    	</xsl:if>
								    	<xsl:if test="lodg_card_yn != 'Y'">
											미사용								    	
								    	</xsl:if>
								    	</font>
								    </td>
					     		</tr>
					     		<tr>
					     			<td class="contant" colspan="5"><xsl:value-of select="lodg_fee_rmk"/></td>
					     		</tr>
					     		<tr>
					     			<td class="contant-center" colspan="2" rowspan="2">
					     				일비
					     			</td>
					     			<td class="contant-right">
									 	<xsl:value-of select="format-number(ymd_fee_max,'#,###,###,###,###,###')"/>
								    </td>
					     			<td class="contant-right">
									 	<xsl:value-of select="format-number(ymd_fee,'#,###,###,###,###,###')"/>
								    </td>
					     			<td class="contant-right">
									 	<xsl:value-of select="format-number(ymd_fee_pay,'#,###,###,###,###,###')"/>
								    </td>
								    <td class="contant-center"></td>
								    <td class="contant-center"></td>
					     		</tr>
					     		<tr>
					     			<td class="contant" colspan="5">
					     				<xsl:if test="fare_clsf ='CAD001'">
											<xsl:value-of select="ymd_fee_rmk"/>
										</xsl:if>
					     				<xsl:if test="fare_clsf ='CAD003'">
											<font color="blue"><xsl:value-of select="ymd_fee_rmk"/></font>
										</xsl:if>
					     				<xsl:if test="fare_clsf ='CAD004'">
											<xsl:value-of select="ymd_fee_rmk"/>
										</xsl:if>
					     			</td>
					     		</tr>
					     		<tr>
					     			<td class="contant-center" colspan="2" rowspan="2">
					     				식비
					     			</td>
					     			<td class="contant-right">
									 	<xsl:value-of select="format-number(meal_fee_max,'#,###,###,###,###,###')"/>
								    </td>
					     			<td class="contant-right">
									 	<xsl:value-of select="format-number(meal_fee,'#,###,###,###,###,###')"/>
								    </td>
					     			<td class="contant-right">
									 	<xsl:value-of select="format-number(meal_fee_pay,'#,###,###,###,###,###')"/>
								    </td>
								    <td class="contant-center">
								    	(카드 <xsl:value-of select="card_meal"/> 식)
								    </td>
								    <td class="contant-center"></td>
					     		</tr>
					     		<tr>
					     			<td class="contant" colspan="5"><xsl:value-of select="meal_fee_rmk"/></td>
					     		</tr>
					     		<td class="title" colspan="3">소계</td>
				     			<td class="contant-right"><xsl:value-of select="format-number(sum_trip_fee_max,'#,###,###,###,###,###')"/></td>
				     			<td class="contant-right"><xsl:value-of select="format-number(sum_trip_fee,'#,###,###,###,###,###')"/></td>
				     			<td class="contant-right"><xsl:value-of select="format-number(sum_trip_fee_pay,'#,###,###,###,###,###')"/></td>
							    <td class="contant-center"></td>
							    <td class="contant-center"></td>
					     		</xsl:for-each>
					     		<tr>
					     			<td class="title" colspan="3">총합계</td>
					     			<td class="contant-right"><xsl:value-of select="format-number(root/tripAdVo/totl_fare_fee_max,'#,###,###,###,###,###')"/></td>
					     			<td class="contant-right"><xsl:value-of select="format-number(root/tripAdVo/totl_fare_fee,'#,###,###,###,###,###')"/></td>
					     			<td class="contant-right"><xsl:value-of select="format-number(root/tripAdVo/totl_fare_fee_pay,'#,###,###,###,###,###')"/></td>
								    <td class="contant-center"></td>
								    <td class="contant-center"></td>
					     		</tr>
					     	</table>
						</td>
					</tr>
				</table>
				<xsl:if test="root/tripAdVo/excess_resn_cd != ''">	
					<table width="100%" class="aproutertable">
						<tr>
							<td class="body">
								<table width="100%" class="aprinnertable">
									<tr>
										<td class="title2" width="30%">숙박비 초과사유</td>
										<td class="contant" width="70%">
											<xsl:if test="root/tripAdVo/excess_resn_cd ='EXC001'">
												해당지역에 숙박비 상한액 내에 숙박 가능한 곳이 없는 경우
											</xsl:if>
										 	<xsl:if test="root/tripAdVo/excess_resn_cd ='EXC002'">
												학술회의 등의 경우 숙박예정시설로 지정된 숙박시설의 객실요금이 숙박비 상한액을 초과하는 경우
											</xsl:if>
										 	<xsl:if test="root/tripAdVo/excess_resn_cd ='EXC003'">
												여비액에 상응한 숙박시설 이용시 신변의 안전에 위험이 초래될 우려가 높은 경우
											</xsl:if>
										 	<xsl:if test="root/tripAdVo/excess_resn_cd ='EXC004'">
												해당지역에 숙박시설이 있어도 출장목적지와 거리가 멀어 출장업무 수행에 지장을 초래할 것이 명백한 경우
											</xsl:if>
										 	<xsl:if test="root/tripAdVo/excess_resn_cd ='EXC005'">
												기타(첨부파일 참조)
											</xsl:if>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>				
				
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">계정내역</td>
					</tr>
					<tr>
				     	<td class="body">
				     		<table width="100%" class="aprinnertable">							
								<tr>
									<td class="title">계정번호</td>
									<td class="title">계정명</td>
									<td class="title">과세구분</td>
									<td class="title">비용코드</td>
									<td class="title">금액</td>
								    <td class="title">계정책임자</td>
								    <td class="title">통제번호</td>
								</tr>
								<xsl:for-each select="root/accntList">
								<tr>
									<td class="contant-center">
									 	<xsl:value-of select="accnt_no"/>
								    </td>
								    <td class="contant-center">
									 	<xsl:value-of select="accnt_no_nm"/>
								    </td>
								    <td class="contant-center">
										<xsl:choose>
											<xsl:when test="tax_cd_nm = '과세'">
												<span style="color:red;"><xsl:value-of select="tax_cd_nm"/></span>
											</xsl:when>
											<xsl:otherwise>
												<xsl:value-of select="tax_cd_nm"/>
											</xsl:otherwise>
										</xsl:choose>
									</td>
								    <td class="contant-center">
									 	<xsl:if test="expns_cd = '271'">
											국내출장
										</xsl:if>
										<xsl:if test="expns_cd = '394'">
											평가관리비
										</xsl:if>
								    </td>
								    <td class="contant-right">
									 	<xsl:value-of select="format-number(tot_expns,'#,###,###,###,###,###')"/>
								    </td>
								    <td class="contant-center">
									 	<xsl:value-of select="accnt_rspns_nm"/> ( <xsl:value-of select="accnt_rspns_empno"/> )
								    </td>
								    <td class="contant-center">
									 	<xsl:value-of select="bugt_ctrl_no"/>
								    </td>
								</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				
				<table width="100%" class="aproutertable">
					<tr>
						<td class="head">지급내역</td>
					</tr>
					<tr>
				     	<td class="body">
				     		<table width="100%" class="aprinnertable">							
								<tr>
									<td class="title">구분</td>
									<td class="title">지급자</td>
									<td class="title">실사용액</td>
									<td class="title">지급액</td>
									<td class="title">은행</td>
								    <td class="title">예금주</td>
								    <td class="title">비고</td>
								</tr>
								<xsl:for-each select="root/payList">
									<tr>
										<td width="10%" class="contant-center">
											<xsl:if test="contains(pay_clsf, 'FAX010')">
												개인지급
											</xsl:if>
											<xsl:if test="contains(pay_clsf, 'FAX090')">
												기타(송금)지급
											</xsl:if>
										</td>
										<td width="20%" class="contant-center">
											<xsl:value-of select="biztrip_psn_nm" /> ( <xsl:value-of select="biztrip_psn_empno" /> )
										</td>
										<td width="12%" class="contant-right">
											<xsl:value-of select="format-number(truth_use_amt,'#,###,###,###,###,###')" />
										</td>
										<td width="12%" class="contant-right">
											<xsl:value-of select="format-number(adjst_amt,'#,###,###,###,###,###')" />
										</td>
										<td width="15%" class="contant-center">
											<xsl:value-of select="bank_nm" />
										</td>
										<td width="10%" class="contant-center">
											<xsl:value-of select="depstr" />
										</td>
										<td width="*" class="contant">
											<xsl:value-of select="rmk" />
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				
				<table width="100%" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td class="title2">첨부파일(복명서증빙)</td>
									<td class="contant" width="80%">
										<xsl:for-each select="root/evidFileList">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA006')</xsl:attribute>
												<xsl:value-of select="file_nm" /><br/>
											</a>
											<xsl:if test="attach_file_no != ''">
												<a>
													<xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of
														select="seq" />')</xsl:attribute>
													<img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기"
														style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;" />
												</a>
											</xsl:if>
											<br />
										</xsl:for-each>
									</td>
								</tr>
								<tr>
									<td class="title2">첨부파일(출장증빙)</td>
									<td class="contant" width="80%">
										<xsl:for-each select="root/fileList">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA006')</xsl:attribute>
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
											<br/>
										</xsl:for-each>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<iframe name="ifr" height="0" width="0"></iframe>
			</BODY>
	</xsl:template>
</xsl:stylesheet>