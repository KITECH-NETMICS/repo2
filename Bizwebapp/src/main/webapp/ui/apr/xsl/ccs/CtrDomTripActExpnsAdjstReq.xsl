<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
		<xsl:variable name="localPath" select="1" />
			<BODY>
				<script language="javascript">
				<![CDATA[
					function openTransReasonOZPop(airReqNo){
						var ozFileNm = "ccs/ctr/CtrAirMileReq.ozr";
						var ozrNm = "CtrAirMile";
						var url = "http://biz.kitech.re.kr/websquare/popup.html?w2xPath=/kitech/com/oz/ComPopupOZReport.xml";
						var node = url+"&ozr="+ozFileNm+"&odi="+ozrNm+"&printMode=Y&param=req_no^"+airReqNo;		
						node = node.replace(/amp;amp;/g,"");
						if(navigator.appName != "Microsoft Internet Explorer"){
							node = node.replace(/amp;/g,"");
						}
						window.open(node,"OZReport", "width=1012px, height=610px, location=no, resizable=yes");   
					}
					
					function createForm(nm, tg, act, met) {
						var cForm = document.createElement("form");
						cForm.name = nm;
						cForm.target = tg;
						cForm.action = act;
						cForm.method = met;
						
						return cForm;
					}
					
					function createHidden(nm, val, frm) {
						/*IE9, IE10, 크롬 등에서 호환성 보기 없이 실행되도록 보완(2013.07.29)*/
						var	hiddenInput	=	document.createElement("input");

						hiddenInput.setAttribute("type", "hidden");
						hiddenInput.setAttribute("name", nm);
						hiddenInput.setAttribute("value", val);
						frm.appendChild(hiddenInput);
						
						return frm;
					}
					
					function openFilePop (attachFileNo) {
						window.open("","smlRvew",'width=680,height=270,top=150,left=150');
						var frm = createForm("popFrm", "smlRvew", "http://biz.kitech.re.kr/websquare/popup.html", "get");
						frm = createHidden("w2xPath", "/kitech/res/twe/ResGridAttachPop.xml", frm);
						frm = createHidden("popupID", "smlRvew", frm);
						frm = createHidden("w2xHome", "/kitech/res/twe/", frm);
						frm = createHidden("attach_file_no", attachFileNo, frm);
						document.body.appendChild(frm);
						frm.submit();
					}
					/* 크리스피드 이원길 미리보기 시작 */
					function openEvidWindow(unslipNo){
						var url = "https://evid.kitech.re.kr/sd/view?CLS=00&amp;amp;amp;RESL_NO=" + unslipNo + "&amp;amp;amp;EMP_NO=" + unslipNo;
						url = url.replaceAll("amp;","");
						window.open(url, "_blank", "toolbar=no, menubar=no, scrollbars=yes, resizable=yes");
					}
					/* 크리스피드 이원길 미리보기 끝 */
				]]>
				</script>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">출장정보</td>
						<td align="right" valign="bottom">
							<a><xsl:attribute name="href">javascript:openEvidWindow('<xsl:value-of select="request/APPROVAL/unslip_no" />')</xsl:attribute>
							<img src="http://biz.kitech.re.kr/kitech/images/evid/btn_evid02.gif"/></a>
						</td>
					</tr>
					<tr>
						<td colspan="2" class="body">
							<table width="100%" class="aprinnertable">
								<tr>
									<td width="13%" class="title">결의일자</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="request/APPROVAL/slip_ymd" /></td>
									<td width="13%" class="title">적요</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="request/APPROVAL/rmk" /></td>
								</tr>
								<tr>
									<td width="13%" class="title">출장신청번호</td>
									<td width="20%" class="contant"><xsl:value-of select="request/APPROVAL/biztrip_req_no" /></td>
									<td width="13%" class="title">정산신청번호</td>
									<td width="20%" class="contant"><xsl:value-of select="request/APPROVAL/req_no" /></td>
									<td width="13%" class="title">정산결의번호</td>
									<td width="20%" class="contant">
										<xsl:value-of select="request/APPROVAL/unslip_no" />
										[<xsl:if test="contains(request/APPROVAL/decsn_ex, 'Y')">
											확정
										</xsl:if>      
									    <xsl:if test="contains(request/APPROVAL/decsn_ex, 'N')">
											미확정
										</xsl:if>]
										</td>
								</tr>
						 	 	<tr>
									<td width="13%" class="title">변경사유</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="request/APPROVAL/chng_resn" /></td>
									<td width="13%" class="title">변경내용</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="request/APPROVAL/chng_contnt" /></td>
								</tr>
								<tr>
									<td width="13%" class="title">신청 출장기간</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="request/APPROVAL/biztrip_req_prd" /></td>
									<td width="13%" class="title">복명 출장기간</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="request/APPROVAL/req_prd" /></td>
								</tr> 
								<tr>
									<td width="13%" class="title">신청 출장지</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="request/APPROVAL/biztrip_form" /></td>
									<td width="13%" class="title">복명 출장지</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="request/APPROVAL/truth_biztrip_form" /></td>
								</tr>
								<tr>
									<td width="13%" class="title">신청 출장목적</td>
									<td width="87%" class="contant" colspan="5"><xsl:value-of select="request/APPROVAL/biztrip_goal" /></td>
								</tr>
								<tr>
									<td width="13%" class="title"><font color="blue">복명 출장목적</font></td>
									<td width="87%" class="contant" colspan="5"><font color="blue"><xsl:value-of select="request/APPROVAL/truth_biztrip_goal" /></font></td>
								</tr>
								<tr>
									<td width="13%" class="title">원차량사용</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="request/APPROVAL/car_use_yn" /></td>
									<td width="13%" class="title">운임구분</td>
									<td width="37%" class="contant" colspan="2"><xsl:value-of select="request/APPROVAL/biztrip_way" /></td>
								</tr>
								<tr>
									<td width="13%" class="title2">정보기기 반출</td>
									<td width="37%" class="contant" colspan="2">
										(<xsl:if test="contains(request/APPROVAL/notebook_out, 'Y')">
											√
										</xsl:if>) 노트북반출      
									    (<xsl:if test="contains(request/APPROVAL/usb_out, 'Y')">
											√
										</xsl:if>) 휴대용저장매체반출
									</td>
									<td width="13%" class="title">정보기기 반입</td>
										<td width="37%" class="contant" colspan="2">
										(<xsl:if test="contains(request/APPROVAL/notebook_in, 'Y')">
											√
										</xsl:if>) 노트북반입      
									    (<xsl:if test="contains(request/APPROVAL/usb_in, 'Y')">
											√
										</xsl:if>) 휴대용저장매체반입
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>	
				<xsl:if test="request/APPROVAL/apr_air_req_no != ''">
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
							<xsl:variable name="apr_air_count" select="count(request/APPROVAL/selectAirMileageMulti/vector/data)" />
							<xsl:for-each select="request/APPROVAL/selectAirMileageMulti/vector/data">
							<xsl:variable name="empno" select="mdata/empno" />
						    <xsl:variable name="syspaynm" select="mdata/syspaynm" />
							<xsl:variable name="req_no" select="mdata/req_no" />
							<xsl:variable name="air_nm" select="mdata/air_nm" />
							<xsl:variable name="pub_new_mile" select="mdata/pub_new_mile" />
							<xsl:variable name="attach_file_no" select="mdata/attach_file_no_req" />
								<tr>
									<xsl:if test="position()=1">
									<td width="25%" class="contant-center">
										<xsl:attribute name="rowspan"><xsl:value-of select="$apr_air_count" /></xsl:attribute>
										<a>
											<xsl:attribute name="href">javascript:openTransReasonOZPop("<xsl:value-of select="$req_no" />")</xsl:attribute>
											<xsl:value-of select="$req_no" />
										</a>
									</td>
									</xsl:if>
									<td width="15%" class="contant-center">
										<xsl:value-of select="$empno"/>
									</td>										
									<td width="15%" class="contant-center">
										<xsl:value-of select="$syspaynm"/>
									</td>
									<td width="15%" class="contant-center">
										<xsl:value-of select="$air_nm"/>
									</td>
									<td width="15%" class="contant-center">
										<xsl:value-of select="$pub_new_mile"/>
									</td>
									<td width="15%" class="contant-center">
										<a>
											<xsl:attribute name="href">javascript:openFilePop('<xsl:value-of select="$attach_file_no" />')</xsl:attribute>
											<xsl:value-of select="$attach_file_no" />
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
								<xsl:for-each select="request/APPROVAL/doc1/vector/data">
									<tr>
										<td width="10%" class="contant-center">
											<xsl:value-of select="msgCtrDomPathMS01/odr" />
										</td>
										<td width="20%" class="contant-center">
											<xsl:value-of select="msgCtrDomPathMS01/start_region_nm" />
										</td>
										<td width="20%" class="contant-center">
											<xsl:value-of select="msgCtrDomPathMS01/arriv_region_nm" />
										</td>
										<td width="40%" class="contant">
											<xsl:value-of select="msgCtrDomPathMS01/rmk" />
										</td>
										<td width="10%" class="contant-center">
											<xsl:value-of select="msgCtrDomPathMS01/lodg_yn" /> 박
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
								<xsl:for-each select="request/APPROVAL/doc2/vector/data">
									<tr>
										<td class="contant-center">
											<xsl:value-of select="msgCtrDomCompnMS01/biztrip_psn_clsf_nm" />
										</td>
										<td class="contant-center">
											<font color="blue"><xsl:if test="msgCtrDomCompnMS01/chng_clsf = '1'">
												취소
											</xsl:if></font>
											<xsl:if test="msgCtrDomCompnMS01/chng_clsf = ''">
												출장
											</xsl:if>
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgCtrDomCompnMS01/biztrip_psn_nm" /> ( <xsl:value-of select="msgCtrDomCompnMS01/biztrip_psn_empno" /> )
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgCtrDomCompnMS01/biztrip_dept_nm" /> / <xsl:value-of select="msgCtrDomCompnMS01/posi_clsf_nm" />
										</td>
										<td class="contant-center">
											<xsl:value-of select="concat(substring(msgCtrDomCompnMS01/biztrip_orign_ymd, 0, 5), '-', substring(msgCtrDomCompnMS01/biztrip_orign_ymd, 5, 2), '-', substring(msgCtrDomCompnMS01/biztrip_orign_ymd, 7, 2))"/>
											~
											<xsl:value-of select="concat(substring(msgCtrDomCompnMS01/biztrip_cls_ymd, 0, 5), '-', substring(msgCtrDomCompnMS01/biztrip_cls_ymd, 5, 2), '-', substring(msgCtrDomCompnMS01/biztrip_cls_ymd, 7, 2))"/>
										</td>
										<td class="contant-center">
											<xsl:value-of select="msgCtrDomCompnMS01/biztrip_nght" /> 박
											<xsl:value-of select="msgCtrDomCompnMS01/biztrip_day" /> 일
										</td>
									</tr>
								</xsl:for-each>
							</table>
						</td>
					</tr>
				</table>
				
				<xsl:variable name="gps_count" select="count(request/APPROVAL/doc4/vector/data)" />
				<xsl:if test="$gps_count &gt; 0">	
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
									<xsl:for-each select="request/APPROVAL/doc4/vector/data">
										<tr>
											<td width="10%" class="contant-center">
												<font color="blue"><xsl:value-of select="msgCtrGpsInfo/user_nm" /></font>
											</td>
											<td width="20%" class="contant-center">
												<font color="blue"><xsl:value-of select="msgCtrGpsInfo/dept_nm" /></font>
											</td>
											<td width="20%" class="contant-center">
												<font color="blue"><xsl:value-of select="msgCtrGpsInfo/emplyr_id" /></font>
											</td>
											<td width="40%" class="contant">
												<font color="blue"><xsl:value-of select="msgCtrGpsInfo/addr_kr" /></font>
											</td>
											<td width="10%" class="contant-center">
												<font color="blue"><xsl:value-of select="msgCtrGpsInfo/input_date" /></font>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				<xsl:if test="request/APPROVAL/bizwrk_atdnc_contnt !=''">
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
										<xsl:value-of select="request/APPROVAL/bizwrk_atdnc_contnt"/>
									</td>
								</tr>
								<tr>
									<td width="17%" class="title">주요성과(정책건의사항)</td>
									<td width="83%" class="contant" colspan="5">
										<xsl:value-of select="request/APPROVAL/polcy_suggst_item"/>
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
					     		<xsl:for-each select="request/APPROVAL/doc3/vector/data">
					     		<tr>
									<td width="10%" class="contant-center" rowspan="8">
									 	<xsl:value-of select="msgCtrBizTripFareMS01/biztrip_psn_nm"/>
								    </td>
									<td width="10%" class="contant-center" rowspan="2">
									 	운임
								    </td>
									<td width="10%" class="contant-center" rowspan="2">
										<xsl:if test="msgCtrBizTripFareMS01/fare_clsf ='CAD001'">
											대중교통
										</xsl:if>
										<xsl:if test="msgCtrBizTripFareMS01/fare_clsf ='CAD003'">
											원차량
										</xsl:if>
										<xsl:if test="msgCtrBizTripFareMS01/fare_clsf ='CAD004'">
											항공
										</xsl:if>
								    </td>
									<td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number(msgCtrBizTripFareMS01/fare_fee_max,'#,###,###,###,###,###')"/>
								    </td>
									<td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number(msgCtrBizTripFareMS01/fare_fee,'#,###,###,###,###,###')"/>
								    </td>
									<td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number(msgCtrBizTripFareMS01/fare_fee_pay,'#,###,###,###,###,###')"/>
								    </td>
								    <td width="10%" class="contant-center"></td>
								    <td width="10%" class="contant-center"></td>
					     		</tr>
								<tr>
									<td class="contant" colspan="5">
										<xsl:if test="msgCtrBizTripFareMS01/fare_clsf ='CAD001'">
											<xsl:value-of select="msgCtrBizTripFareMS01/fare_fee_rmk"/>
										</xsl:if>
										<xsl:if test="msgCtrBizTripFareMS01/fare_clsf ='CAD003'">
											<font color="blue"><xsl:value-of select="msgCtrBizTripFareMS01/fare_fee_rmk"/></font>
										</xsl:if>
										<xsl:if test="msgCtrBizTripFareMS01/fare_clsf ='CAD004'">
											<xsl:value-of select="msgCtrBizTripFareMS01/fare_fee_rmk"/>
										</xsl:if>
									</td>
								</tr>		
					     		<tr>
					     			<td class="contant-center" rowspan="2">
									 	숙박
								    </td>
									<td width="10%" class="contant-center" rowspan="2">
									 	<xsl:if test="msgCtrBizTripFareMS01/lodg_clsf ='CAG001'">
											일반숙박
										</xsl:if>
										<xsl:if test="msgCtrBizTripFareMS01/lodg_clsf ='CAG002'">
											친지숙박
										</xsl:if>
										<xsl:if test="msgCtrBizTripFareMS01/lodg_clsf ='CAG003'">
											공동숙박
										</xsl:if>
										<xsl:if test="msgCtrBizTripFareMS01/lodg_clsf ='CAG004'">
											숙박제공
										</xsl:if>
								    </td>
								    <td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number(msgCtrBizTripFareMS01/lodg_fee_max,'#,###,###,###,###,###')"/>
								    </td>
									<td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number(msgCtrBizTripFareMS01/lodg_fee,'#,###,###,###,###,###')"/>
								    </td>
									<td width="10%" class="contant-right">
									 	<xsl:value-of select="format-number(msgCtrBizTripFareMS01/lodg_fee_pay,'#,###,###,###,###,###')"/>
								    </td>
								    <td width="10%" class="contant-center"></td>
								    <td width="10%" class="contant-center">
								    	<font color="blue">
								    	<xsl:if test="msgCtrBizTripFareMS01/lodg_card_yn = 'Y'">
											카드사용								    	
								    	</xsl:if>
								    	<xsl:if test="msgCtrBizTripFareMS01/lodg_card_yn != 'Y'">
											미사용								    	
								    	</xsl:if>
								    	</font>
								    </td>
					     		</tr>
					     		<tr>
					     			<td class="contant" colspan="5"><xsl:value-of select="msgCtrBizTripFareMS01/lodg_fee_rmk"/></td>
					     		</tr>
					     		<tr>
					     			<td class="contant-center" colspan="2" rowspan="2">
					     				일비
					     			</td>
					     			<td class="contant-right">
									 	<xsl:value-of select="format-number(msgCtrBizTripFareMS01/ymd_fee_max,'#,###,###,###,###,###')"/>
								    </td>
					     			<td class="contant-right">
									 	<xsl:value-of select="format-number(msgCtrBizTripFareMS01/ymd_fee,'#,###,###,###,###,###')"/>
								    </td>
					     			<td class="contant-right">
									 	<xsl:value-of select="format-number(msgCtrBizTripFareMS01/ymd_fee_pay,'#,###,###,###,###,###')"/>
								    </td>
								    <td class="contant-center"></td>
								    <td class="contant-center"></td>
					     		</tr>
					     		<tr>
					     			<td class="contant" colspan="5">
					     				<xsl:if test="msgCtrBizTripFareMS01/fare_clsf ='CAD001'">
											<xsl:value-of select="msgCtrBizTripFareMS01/ymd_fee_rmk"/>
										</xsl:if>
					     				<xsl:if test="msgCtrBizTripFareMS01/fare_clsf ='CAD003'">
											<font color="blue"><xsl:value-of select="msgCtrBizTripFareMS01/ymd_fee_rmk"/></font>
										</xsl:if>
					     				<xsl:if test="msgCtrBizTripFareMS01/fare_clsf ='CAD004'">
											<xsl:value-of select="msgCtrBizTripFareMS01/ymd_fee_rmk"/>
										</xsl:if>
					     			</td>
					     		</tr>
					     		<tr>
					     			<td class="contant-center" colspan="2" rowspan="2">
					     				식비
					     			</td>
					     			<td class="contant-right">
									 	<xsl:value-of select="format-number(msgCtrBizTripFareMS01/meal_fee_max,'#,###,###,###,###,###')"/>
								    </td>
					     			<td class="contant-right">
									 	<xsl:value-of select="format-number(msgCtrBizTripFareMS01/meal_fee,'#,###,###,###,###,###')"/>
								    </td>
					     			<td class="contant-right">
									 	<xsl:value-of select="format-number(msgCtrBizTripFareMS01/meal_fee_pay,'#,###,###,###,###,###')"/>
								    </td>
								    <td class="contant-center">
								    	(카드 <xsl:value-of select="msgCtrBizTripFareMS01/card_meal"/> 식)
								    </td>
								    <td class="contant-center"></td>
					     		</tr>
					     		<tr>
					     			<td class="contant" colspan="5"><xsl:value-of select="msgCtrBizTripFareMS01/meal_fee_rmk"/></td>
					     		</tr>
					     		<td class="title" colspan="3">소계</td>
				     			<td class="contant-right"><xsl:value-of select="format-number(msgCtrBizTripFareMS01/sum_trip_fee_max,'#,###,###,###,###,###')"/></td>
				     			<td class="contant-right"><xsl:value-of select="format-number(msgCtrBizTripFareMS01/sum_trip_fee,'#,###,###,###,###,###')"/></td>
				     			<td class="contant-right"><xsl:value-of select="format-number(msgCtrBizTripFareMS01/sum_trip_fee_pay,'#,###,###,###,###,###')"/></td>
							    <td class="contant-center"></td>
							    <td class="contant-center"></td>
					     		</xsl:for-each>
					     		<tr>
					     			<td class="title" colspan="3">총합계</td>
					     			<td class="contant-right"><xsl:value-of select="format-number(request/APPROVAL/totl_Trip_Fee_max,'#,###,###,###,###,###')"/></td>
					     			<td class="contant-right"><xsl:value-of select="format-number(request/APPROVAL/totl_Trip_Fee,'#,###,###,###,###,###')"/></td>
					     			<td class="contant-right"><xsl:value-of select="format-number(request/APPROVAL/totl_Trip_Fee_pay,'#,###,###,###,###,###')"/></td>
								    <td class="contant-center"></td>
								    <td class="contant-center"></td>
					     		</tr>
					     	</table>
						</td>
					</tr>
				</table>
				<xsl:if test="request/APPROVAL/excess_resn_cd != ''">	
					<table width="100%" class="aproutertable">
						<tr>
							<td class="body">
								<table width="100%" class="aprinnertable">
									<tr>
										<td class="title2" width="30%">숙박비 초과사유</td>
										<td class="contant" width="70%">
											<xsl:if test="request/APPROVAL/excess_resn_cd ='EXC001'">
												해당지역에 숙박비 상한액 내에 숙박 가능한 곳이 없는 경우
											</xsl:if>
										 	<xsl:if test="request/APPROVAL/excess_resn_cd ='EXC002'">
												학술회의 등의 경우 숙박예정시설로 지정된 숙박시설의 객실요금이 숙박비 상한액을 초과하는 경우
											</xsl:if>
										 	<xsl:if test="request/APPROVAL/excess_resn_cd ='EXC003'">
												여비액에 상응한 숙박시설 이용시 신변의 안전에 위험이 초래될 우려가 높은 경우
											</xsl:if>
										 	<xsl:if test="request/APPROVAL/excess_resn_cd ='EXC004'">
												해당지역에 숙박시설이 있어도 출장목적지와 거리가 멀어 출장업무 수행에 지장을 초래할 것이 명백한 경우
											</xsl:if>
										 	<xsl:if test="request/APPROVAL/excess_resn_cd ='EXC005'">
												기타(첨부파일 참조)
											</xsl:if>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>
				
				<xsl:if test="gridCardRow != '0'">
				<table width="100%" class="aproutertable">
					<tr>
				     	<td class="body">
				     		<table width="100%" class="aprinnertable">							
								<tr>
									<td class="title" width="10%">성명</td>
									<td class="title" width="10%">구분</td>
									<td class="title" width="15%">승인일자</td>
								    <td class="title" width="15%">승인번호</td>
								    <td class="title" width="15%">승인금액</td>
								    <td class="title" width="*">가맹점</td>
								</tr>
								<xsl:for-each select="request/APPROVAL/doc4/vector/data">
								<tr>
								    <td class="contant-center">
									 	<xsl:value-of select="msgCtrDomAdCardMS01/nm"/>
								    </td>
								    <td class="contant-center">
									 	<xsl:if test="msgCtrDomAdCardMS01/clsf = 'fare'">
									 		운임
									 	</xsl:if>
									 	<xsl:if test="msgCtrDomAdCardMS01/clsf = 'lodg'">
									 		운임
									 	</xsl:if>
								    </td>
								    <td class="contant-center">
								    	<xsl:value-of select="concat(substring(msgCtrDomAdCardMS01/use_ymd, 0, 5), '-', substring(msgCtrDomAdCardMS01/use_ymd, 5, 2), '-', substring(msgCtrDomAdCardMS01/use_ymd, 7, 2))"/>
								    </td>
								    <td class="contant-center">
									 	<xsl:value-of select="msgCtrDomAdCardMS01/apprvl_no"/>
								    </td>
								    <td class="contant-right">
								    	<xsl:value-of select="format-number(msgCtrDomAdCardMS01/apprvl_amt,'#,###,###,###,###,###')"/>
								    </td>
								    <td class="contant-center">
								    	<xsl:value-of select="msgCtrDomAdCardMS01/joinsto_nm"/>
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
						<td class="head">계정내역</td>
					</tr>
					<tr>
				     	<td class="body">
				     		<table width="100%" class="aprinnertable">							
								<tr>
									<td class="title">계정번호</td>
									<td class="title">계정명</td>
									<td class="title">비용코드</td>
									<td class="title">금액</td>
								    <td class="title">계정책임자</td>
								    <td class="title">통제번호</td>
								</tr>
								<xsl:for-each select="request/APPROVAL/doc5/vector/data">
								<tr>
									<td width="13%" class="contant-center">
									 	<xsl:value-of select="msgCtrDomAccntMS01/accnt_no"/>
								    </td>
								    <td width="*" class="contant-center">
									 	<xsl:value-of select="msgCtrDomAccntMS01/accnt_nm"/>
								    </td>
								    <td width="13%" class="contant-center">
									 	<xsl:if test="msgCtrDomAccntMS01/expns_cd = '271'">
											국내출장
										</xsl:if>
										<xsl:if test="msgCtrDomAccntMS01/expns_cd = '394'">
											평가관리비
										</xsl:if>
								    </td>
								    <td width="20%" class="contant-right">
									 	<xsl:value-of select="format-number(msgCtrDomAccntMS01/tot_expns,'#,###,###,###,###,###')"/>
								    </td>
								    <td width="15%" class="contant-center">
									 	<xsl:value-of select="msgCtrDomAccntMS01/accnt_respn_psn_nm"/> ( <xsl:value-of select="msgCtrDomAccntMS01/accnt_respn_psn_empno"/> )
								    </td>
								    <td width="15%" class="contant-center">
									 	<xsl:value-of select="msgCtrDomAccntMS01/bugt_ctrl_no"/>
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
								<xsl:for-each select="request/APPROVAL/doc6/vector/data">
									<tr>
										<td width="10%" class="contant-center">
											<xsl:if test="contains(msgCtrDomPayMS01/adjst_pay_clsf, 'FAX010')">
												개인지급
											</xsl:if>
											<xsl:if test="contains(msgCtrDomPayMS01/adjst_pay_clsf, 'FAX090')">
												기타(송금)지급
											</xsl:if>
										</td>
										<td width="20%" class="contant-center">
											<xsl:value-of select="msgCtrDomPayMS01/pay_psn_nm" /> ( <xsl:value-of select="msgCtrDomPayMS01/pay_psn_empno" /> )
										</td>
										<td width="12%" class="contant-right">
											<xsl:value-of select="format-number(msgCtrDomPayMS01/truth_use_amt,'#,###,###,###,###,###')" />
										</td>
										<td width="12%" class="contant-right">
											<xsl:value-of select="format-number(msgCtrDomPayMS01/adjst_amt,'#,###,###,###,###,###')" />
										</td>
										<td width="15%" class="contant-center">
											<xsl:value-of select="msgCtrDomPayMS01/bank_nm" />
										</td>
										<td width="10%" class="contant-center">
											<xsl:value-of select="msgCtrDomPayMS01/depstr" />
										</td>
										<td width="*" class="contant">
											<xsl:value-of select="msgCtrDomPayMS01/rmk" />
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
										<xsl:for-each select="request/APPROVAL/fileList_A/vector/data">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="mdata/attach_file_no" /><xsl:value-of select="mdata/seq" />','XAA006')</xsl:attribute>
												<xsl:value-of select="mdata/file_nm" /><br/>
											</a>
										</xsl:for-each>
									</td>
								</tr>
								<tr>
									<td class="title2">첨부파일(출장증빙)</td>
									<td class="contant" width="80%">
										<xsl:for-each select="request/APPROVAL/fileList_B/vector/data">
											<a>
												<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="mdata/attach_file_no" /><xsl:value-of select="mdata/seq" />','XAA006')</xsl:attribute>
												<xsl:value-of select="mdata/file_nm" /><br/>
											</a>
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