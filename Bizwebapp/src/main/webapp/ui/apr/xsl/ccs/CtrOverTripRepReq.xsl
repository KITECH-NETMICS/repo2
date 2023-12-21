<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<BODY>
				<script language="javascript">
					<![CDATA[
						function openTransReasonOZPop(airReqNo){
							var ozFileNm = "ccs/ctr/CtrAirMileReport.ozr";
							var ozrNm = "CtrAirMile";
							var url = "https://biz.kitech.re.kr/websquare/popup.html?w2xPath=/kitech/com/oz/ComPopupOZReport.xml";
							var node = url+"&ozr="+ozFileNm+"&odi="+ozrNm+"&printMode=Y&param=req_no^"+airReqNo;		
							node = node.replaceAll("amp;","");
							if(navigator.appName != "Microsoft Internet Explorer"){
								node = node.replaceAll("amp;","");
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
							window.open("","smlRvew",'width=616,height=119,top=150,left=150');
							var frm = createForm("popFrm", "smlRvew", "https://biz.kitech.re.kr/websquare/popup.html", "get");
							frm = createHidden("w2xPath", "/kitech/res/twe/ResGridAttachPop.xml", frm);
							frm = createHidden("popupID", "smlRvew", frm);
							frm = createHidden("w2xHome", "/kitech/res/twe/", frm);
							frm = createHidden("attach_file_no", attachFileNo, frm);
							document.body.appendChild(frm);
							frm.submit();
						}
					]]>
				</script>
				<form name="frmXsl" target="blank" action="https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
					<INPUT type="hidden" name="FilePath" size="25" />
					<INPUT type="hidden" name="orgFileName" size="25" />
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
						<tr>
							<td class="body">
								<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
									<tr>
										<td class="title2">복명서신청번호</td>
										<td colspan="3" class="contant">
											<xsl:value-of select="request/crudInfo/rep_req_no" />
										</td>
									</tr>
									<tr>
										<td class="title2">출장신청번호</td>
										<td colspan="3" class="contant">
											<xsl:value-of select="request/crudInfo/apr_biztrip_req_no" />
										</td>
									</tr>
									<tr>
										<td class="title2">출장자</td>
										<td width="35%" class="contant">
											<xsl:value-of select="request/crudInfo/apr_psn_nm" />
											<xsl:value-of select="request/crudInfo/apr_empno" />
										</td>
										<td class="title2">소속/직급</td>
										<td width="35%" class="contant">
											<xsl:value-of select="request/crudInfo/apr_psn_dept" />
											/
											<xsl:value-of select="request/crudInfo/apr_psn_posi" />
										</td>
									</tr>
									<tr>
										<td class="title2">동반자</td>
										<td colspan="3" class="contant">
											<xsl:value-of select="request/crudInfo/apr_biztrip_psn_compn" />
										</td>
									</tr>
									<tr>
										<td class="title2">계정번호</td>
										<td colspan="3" class="contant">
											<xsl:value-of select="request/crudInfo/apr_accnt_no" />
										</td>
									</tr>
									<tr>
										<td class="title2">출장기간</td>
										<td colspan="3" class="contant">
											당초 :
											<xsl:value-of select="request/crudInfo/apr_start_ymd" />
											~
											<xsl:value-of select="request/crudInfo/apr_cls_ymd" />
											<xsl:text disable-output-escaping="yes"> </xsl:text>
											<xsl:value-of select="request/crudInfo/apr_biztrip_night" />
											박
											<xsl:value-of select="request/crudInfo/apr_biztrip_day" />
											일
											=>변경 :
											<xsl:value-of select="request/crudInfo/apr_orign_ymd" />
											~
											<xsl:value-of select="request/crudInfo/apr_truth_cls_ymd" />
											<xsl:text disable-output-escaping="yes"> </xsl:text>
											<xsl:value-of select="request/crudInfo/apr_biztrip_night02" />
											박
											<xsl:value-of select="request/crudInfo/apr_biztrip_day02" />
											일
										</td>
									</tr>
									<tr>
										<td class="title2">변경사유</td>
										<td class="contant">
											<xsl:value-of select="request/crudInfo/apr_chng_resn" />
										</td>
										<td class="title2">변경내용</td>
										<td class="contant">
											<xsl:value-of select="request/crudInfo/chng_contnt" />
										</td>
									</tr>
									<tr>
										<td rowspan="2" class="title2">출장지</td>
										<td colspan="3" class="contant">
											당초 :
											<xsl:value-of select="request/crudInfo/apr_biztrip_region" />
										</td>
									</tr>
									<tr>
										<td colspan="3" class="contant">
											변경 :(
											<xsl:value-of select="request/crudInfo/apr_truth_biztrip_region" />
											)
											<xsl:value-of select="request/crudInfo/apr_truth_biztrip_land" />
										</td>
									</tr>
									<tr>
										<td rowspan="2" class="title2">출장목적</td>
										<td colspan="3" class="contant">
											당초 :(
											<xsl:value-of select="request/crudInfo/apr_biztrip_goal_clsf" />
											)
											<xsl:value-of select="request/crudInfo/apr_biztrip_goal" />
										</td>
									</tr>
									<tr>
										<td colspan="3" class="contant">
											변경 :(
											<xsl:value-of select="request/crudInfo/apr_truth_bistrip_goal_clsf" />
											)
											<xsl:value-of select="request/crudInfo/apr_truth_bistrip_goal" />
										</td>
									</tr>
									<tr>
										<td width="10%" class="title2">정보기기 반입</td>
										<td colspan="3" class="contant">
											(
											<xsl:if test="contains(request/crudInfo/apr_notebook_in, 'Y')">
												√
											</xsl:if>
											) 노트북반입
											(
											<xsl:if test="contains(request/crudInfo/apr_usb_in, 'Y')">
												√
											</xsl:if>
											) 휴대용저장매체반입
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
					<xsl:if test="request/crudInfo/apr_air_req_no != ''">
					<table width="100%" class="aproutertable">
						<tr>
							<td class="head">항공마일리지 신고내역</td>
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
									<xsl:variable name="apr_air_count" select="count(request/crudInfo/selectAirMileageMulti/vector/data)" />
									<xsl:for-each select="request/crudInfo/selectAirMileageMulti/vector/data">
									<xsl:variable name="empno" select="mdata/empno" />
									<xsl:variable name="syspaynm" select="mdata/syspaynm" />
									<xsl:variable name="req_no" select="mdata/req_no" />
									<xsl:variable name="air_nm" select="mdata/air_nm" />
									<xsl:variable name="pub_new_mile" select="mdata/pub_new_mile" />
									<xsl:variable name="attach_file_no" select="mdata/attach_file_no_report" />
									<xsl:variable name="air_cd_chang_yn" select="mdata/air_cd_chang_yn" />
									
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
											<xsl:choose>
												<xsl:when test="$air_cd_chang_yn = 'Y'">
													<span style="color:red;">(항공사취소)</span>
												</xsl:when>
												<xsl:otherwise>
													<xsl:value-of select="$pub_new_mile"/>
												</xsl:otherwise>
											</xsl:choose>
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
							<td class="head">출장자</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" class="aprinnertable">
									<tr>
										<td rowspan="2" class="title">구분</td>
										<td class="title">변경구분</td>
										<td rowspan="2" class="title">출장자</td>
										<td rowspan="2" class="title">소속/직급</td>
										<td rowspan="2" class="title">기간</td>
										<td rowspan="2" class="title">박/일</td>
									</tr>
									<tr>
										<td class="title">취소</td>
									</tr>
									<xsl:for-each select="request/crudInfo/save/vector/data">
										<xsl:variable name="biztrip_psn_clsf_nm" select="msgCtrOverCompnMS01/biztrip_psn_clsf_nm" />
										<xsl:variable name="chng_clsf" select="msgCtrOverCompnMS01/chng_clsf" />
										<xsl:variable name="biztrip_psn_empno" select="msgCtrOverCompnMS01/apr_biztrip_psn_empno" />
										<xsl:variable name="biztrip_psn_nm" select="msgCtrOverCompnMS01/biztrip_psn_nm" />
										<xsl:variable name="biztrip_dept_nm" select="msgCtrOverCompnMS01/biztrip_dept_nm" />
										<xsl:variable name="posi_clsf_nm" select="msgCtrOverCompnMS01/posi_clsf_nm" />
										<xsl:variable name="biztrip_orign_ymd" select="msgCtrOverCompnMS01/apr_start_ymd" />
										<xsl:variable name="biztrip_cls_ymd" select="msgCtrOverCompnMS01/apr_cls_ymd" />
										<xsl:variable name="biztrip_nght" select="msgCtrOverCompnMS01/biztrip_nght" />
										<xsl:variable name="biztrip_day" select="msgCtrOverCompnMS01/biztrip_day" />
										<tr>
											<td width="5%" class="contant-center">
												<xsl:value-of select="$biztrip_psn_clsf_nm" />
											</td>
											<td width="5%" class="contant-center">
												<xsl:if test="contains($chng_clsf, '1')">
													취소
												</xsl:if>
											</td>
											<td width="10%" class="contant-center">
												<xsl:value-of select="$biztrip_psn_nm" />
												<xsl:value-of select="$biztrip_psn_empno" />
											</td>
											<td width="10%" class="contant">
												<xsl:value-of select="$biztrip_dept_nm" />
												/
												<xsl:value-of select="$posi_clsf_nm" />
											</td>
											<td width="10%" class="contant-center">
												<xsl:value-of select="$biztrip_orign_ymd" />
												~
												<xsl:value-of select="$biztrip_cls_ymd" />
											</td>
											<td width="10%" class="contant">
												<xsl:value-of select="$biztrip_nght" />
												박
												<xsl:value-of select="$biztrip_day" />
												일
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
										<td class="title2">
											업무수행내용
											<br />
											(접촉인물)
										</td>
										<td width="84%" class="contant">
											<xsl:value-of select="translate(request/crudInfo/apr_atdnc_contnt, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />
										</td>
									</tr>
									<tr>
										<td class="title2">자료수집내용</td>
										<td width="84%" class="contant">
											<xsl:value-of select="translate(request/crudInfo/apr_colct_contnt, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />
										</td>
									</tr>
									<tr>
										<td class="title2">
											주요성과
											<br />
											(정책건의사항)
										</td>
										<td class="contant" width="84%">
											<xsl:value-of select="translate(request/crudInfo/apr_polcy_suggst_item, '&lt;br&gt;', '&lt;br&gt;')" disable-output-escaping="yes" />
										</td>
									</tr>
									<tr>
										<td class="title2">첨부파일(증빙)</td>
										<td class="contant" width="84%">
											<xsl:for-each select="request/crudInfo/fileList_A/vector/data/mdata">
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA006')</xsl:attribute>
													<xsl:value-of select="file_nm" /><br/>
													<br />
												</a>
											</xsl:for-each>
										</td>
									</tr>
									<tr>
										<td class="title2">첨부파일(내용)</td>
										<td class="contant" width="84%">
											<xsl:for-each select="request/crudInfo/fileList_B/vector/data/mdata">										
												<a>
													<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA006')</xsl:attribute>
													<xsl:value-of select="file_nm" /><br/>
													<br />
												</a>
											</xsl:for-each>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				<xsl:if test="request/crudInfo/apr_truth_bistrip_goal_cd = 'FBV110' ">
					<table width="100%" class="aproutertable">
						<tr>
							<td class="head">부실학회 자가점검 체크리스트</td>
						</tr>
						<tr>
							<td class="body">
								<table width="100%" class="aprinnertable">
									<tr>
										<td width="33%" class="title">질문</td>
										<td width="8%" class="title">예</td>
										<td width="8%" class="title">아니오</td>
										<td width="51%" class="title">주의 사항</td>
									</tr>
									<tr>
										<td class="contant" style="height: 45px;">① 논문초록 심사를 거치었습니까?</td>
										<td class="contant-center"><xsl:if test="contains(request/crudInfo/chk_1, 'Y')">√</xsl:if></td>
										<td class="contant-center"><xsl:if test="contains(request/crudInfo/chk_1, 'N')">√</xsl:if></td>
										<td class="contant"> 권위 있는 학회는 일반적으로 논문초록을 제출하고 그에 대한 심사를 거친다.</td>
									</tr>
									<tr>
										<td class="contant" style="height: 45px;">② 학회에서 제시한 프로그램을 준수하여 운영되었습니까?</td>
										<td class="contant-center"><xsl:if test="contains(request/crudInfo/chk_2, 'Y')">√</xsl:if></td>
										<td class="contant-center"><xsl:if test="contains(request/crudInfo/chk_2, 'N')">√</xsl:if></td>
										<td class="contant">학회 운영 일정이 고정되어 있지 않고 관광일정 등 다른 일정으로 변경, 생략, 장소 변경 등의 사항 확인한다.</td>
									</tr>
									<tr>
										<td class="contant" style="height: 45px;">③ 학회의 발표 주제가 특정한문 분야이고, 전문적이었습니까?</td>
										<td class="contant-center"><xsl:if test="contains(request/crudInfo/chk_3, 'Y')">√</xsl:if></td>
										<td class="contant-center"><xsl:if test="contains(request/crudInfo/chk_3, 'N')">√</xsl:if></td>
										<td class="contant">다양한 분야, 주제에 대한 학회 개최를 하여 제대로 된 토론이 이루어지지 않을 경우 부실학회로 추정한다.</td>
									</tr>
									<tr>
										<td class="contant" style="height: 45px;">④ 다른 동료에게 추천할 만한 학회라고 생각하십니까?</td>
										<td class="contant-center"><xsl:if test="contains(request/crudInfo/chk_4, 'Y')">√</xsl:if></td>
										<td class="contant-center"><xsl:if test="contains(request/crudInfo/chk_4, 'N')">√</xsl:if></td>
										<td class="contant"></td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</xsl:if>	
				</form>
				<iframe name="ifr" height="0" width="0"></iframe>
			</BODY>
	</xsl:template>
</xsl:stylesheet>