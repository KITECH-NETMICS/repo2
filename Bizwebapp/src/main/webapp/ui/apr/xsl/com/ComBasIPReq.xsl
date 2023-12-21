<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
		<html lang="kr">
			<BODY>
				<script language="javascript">
					<![CDATA[
						function xslFileDownload(path){
							var localPath = "/was/WebSphere/AppServer/profiles/AppSrv01/installedApps/kwas1Cell01/biz.ear/bizweb.war/kitechfiles/";
							var pathArr = path.split('/');
							var patReplace = pathArr.slice(0, (pathArr.length - 1)).join('/');
								patReplace = patReplace.split(',').join('');
							var loPath = localPath + patReplace.replace(/(^\s*)|(\s*$)/g, "");
							var orgFileName = pathArr[pathArr.length - 1];
							var frm = createForm("frmXsl", "ifr", "https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp", "get");
							frm = createHidden("FilePath", loPath, frm);
							frm = createHidden("orgFileName", orgFileName, frm);
							document.insertBefore(frm);
							frm.submit();
						}

						function createForm(nm, tg, act, met){
		 					var cForm = document.createElement("form");
							cForm.name = nm;
							cForm.target = tg;
							cForm.action = act;
							cForm.method = met;
							return cForm;
						}

						function createHidden(nm, val, frm){
						     var hiddenInput=document.createElement("input");
							 hiddenInput.type="hidden";
							 hiddenInput.name=nm;
							 hiddenInput.value=val;
							 frm.insertBefore(hiddenInput);
							 return frm;
						}
					]]>
					</script>

			<xsl:if test="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_aply_no != ''">
				<form name="frmXsl" target="blank" action="https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
					<INPUT type="hidden" name="FilePath" size="25" />
					<INPUT type="hidden" name="orgFileName" size="25" />

					<table width="100%" class="aproutertable">
						<tr>
							<td class="head">신청정보</td>
						</tr>
						<tr>
						     <td class="body">
						     	<table width="100%" class="aprinnertable">
									<tr>
										<td width="11%" class="title2">신청번호</td>
										<td width="15%" class="contant">
											<xsl:value-of
											select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_aply_no" />
										</td>
										<td width="11%" class="title2">신청구분</td>
										<td class="contant" colspan="5">
											<xsl:value-of
											select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_aply_clsf" />
										</td>
									</tr>
									<tr>
										<td class="title2">성명</td>
										<td class="contant">
											<xsl:value-of
												select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_psn_krchar_nm" />
										</td>
										<td class="title2">개인번호</td>
										<td width="11%" class="contant">
											<xsl:value-of
												select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_aply_psn_no" />
										</td>
										<td width="11%" class="title2">아이디</td>
										<td width="13%" class="contant">
											<xsl:value-of
												select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_user_id" />
										</td>
										<td width="11%" class="title2">직급</td>
										<td width="20%" class="contant">
											<xsl:value-of
												select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_posi" />
										</td>
									</tr>
									<tr>
										<td class="title2">소속(본부)</td>
										<td class="contant">
											<xsl:value-of
												select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_blong_divsn" />
										</td>
										<td class="title2">소속(부서)</td>
										<td width="15%" class="contant">
											<xsl:value-of
												select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_blong_dept" />
										</td>
										<td class="title2">소속(팀)</td>
										<td width="15%" class="contant">
											<xsl:value-of
												select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_blong_ofic" />
												<xsl:value-of select="request/IP" />
										</td>
										<td class="title2">연락처(HP)</td>
										<td width="18%" class="contant">
											<xsl:value-of
												select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_mobile_no" />
										</td>
									</tr>
									<tr>
										<td class="title2">신청사유</td>
										<td width="80%" class="contant" colspan="7">
											<xsl:value-of
												select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/apr_aply_resn" />
										</td>
									</tr>
									</table>
								</td>
							</tr>
						</table>
						<table class="aproutertable" width="100%">
							<tr>
								<td class="head">신청대상자정보</td>
							</tr>
							<tr>
								<td class="body">
									<table class="aprinnertable" width="100%">
										<tr>
											<td width="7%" class="title">사용자</td>
											<td width="13%" class="title">자산번호</td>
											<td width="15%" class="title">컴퓨터이름</td>
										    <td width="10%" class="title">장비구분</td>
										    <td width="15%" class="title">용도</td>
										    <td width="10%" class="title">지역</td>
										    <td width="13%" class="title">OS</td>
										    <td width="20%" class="title">비고</td>
										</tr>
										<xsl:for-each select="request/INSERTAPPLY/hashtable/data/INSERTAPPLY/user/vector/data/msgXomBasIPAsetItemMS">
										<xsl:variable name="use_syspaynm" select="use_syspaynm" />
										<xsl:variable name="aset_no" select="aset_no" />
										<xsl:variable name="aset_nm" select="aset_nm" />
										<xsl:variable name="aset_type" select="apr_aset" />
										<xsl:variable name="aset_usg" select="aset_usg" />
										<xsl:variable name="aset_region_1" select="aset_region_1" />
										<xsl:variable name="opr_sys" select="apr_opr_sys" />
										<xsl:variable name="etc" select="etc" />
										<tr>
											<td width="7%" class='contant-center'>
											 	<xsl:value-of select="$use_syspaynm"/>
										    </td>
										    <td width="13%" class='contant-center'>
											 	<xsl:value-of select="$aset_no"/>
										    </td>
										    <td width="15%" class='contant-center'>
											 	<xsl:value-of select="$aset_nm"/>
										    </td>
										    <td width="10%" class='contant-center'>
											 	<xsl:value-of select="$aset_type"/>
										    </td>
										    <td width="15%" class='contant'>
											 	<xsl:value-of select="$aset_usg"/>
										    </td>
										    <td width="10%" class='contant-center'>
											 	<xsl:value-of select="$aset_region_1"/>
										    </td>
										    <td width="13%" class='contant-center'>
											 	<xsl:value-of select="$opr_sys"/>
										    </td>
										    <td width="20%" class='contant'>
											 	<xsl:value-of select="$etc"/>
										    </td>
										</tr>
										</xsl:for-each>
									</table>
							 	</td>
							</tr>
						</table>
						
				</form>
			</xsl:if>

			<xsl:if test="NEWSNAPSHOT/apr_aply_no != ''">

				<form name="frmXsl" target="blank" action="https://biz.kitech.re.kr/kitech/com/jsp/DownloadProcess.jsp" method="get">
						<INPUT type="hidden" name="FilePath" size="25" />
						<INPUT type="hidden" name="orgFileName" size="25" />

						<table width="100%" class="aproutertable">
							<tr>
								<td class="head">신청정보</td>
							</tr>
							<tr>
							     <td class="body">
							     	<table width="100%" class="aprinnertable">
										<tr>
											<td width="11%" class="title2">신청번호</td>
											<td width="15%" class="contant">
												<xsl:value-of
												select="NEWSNAPSHOT/apr_aply_no" />
											</td>
											<td width="11%" class="title2">신청구분</td>
											<td class="contant" colspan="5">
												<xsl:value-of
												select="NEWSNAPSHOT/apr_aply_clsf" />
											</td>
										</tr>
										<tr>
											<td class="title2">성명</td>
											<td class="contant">
												<xsl:value-of
													select="NEWSNAPSHOT/apr_psn_krchar_nm" />
											</td>
											<td class="title2">개인번호</td>
											<td width="11%" class="contant">
												<xsl:value-of
													select="NEWSNAPSHOT/apr_aply_psn_no" />
											</td>
											<td width="11%" class="title2">아이디</td>
											<td width="13%" class="contant">
												<xsl:value-of
													select="NEWSNAPSHOT/apr_user_id" />
											</td>
											<td width="11%" class="title2">직급</td>
											<td width="20%" class="contant">
												<xsl:value-of
													select="NEWSNAPSHOT/apr_posi" />
											</td>
										</tr>
										<tr>
											<td class="title2">소속(본부)</td>
											<td class="contant">
												<xsl:value-of
													select="NEWSNAPSHOT/apr_blong_divsn" />
											</td>
											<td class="title2">소속(부서)</td>
											<td width="15%" class="contant">
												<xsl:value-of
													select="NEWSNAPSHOT/apr_blong_dept" />
											</td>
											<td class="title2">소속(팀)</td>
											<td width="15%" class="contant">
												<xsl:value-of
													select="NEWSNAPSHOT/apr_blong_ofic" />
													<xsl:value-of select="IP" />
											</td>
											<td class="title2">연락처(HP)</td>
											<td width="18%" class="contant">
												<xsl:value-of
													select="NEWSNAPSHOT/apr_mobile_no" />
											</td>
										</tr>
										<tr>
											<td class="title2">신청사유</td>
											<td width="80%" class="contant" colspan="7">
												<xsl:value-of
													select="NEWSNAPSHOT/apr_aply_resn" />
											</td>
										</tr>
										</table>
									</td>
								</tr>
							</table>
							<table class="aproutertable" width="100%">
								<tr>
									<td class="head">신청대상자정보</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" width="100%">
											<tr>
												<td width="7%" class="title">사용자</td>
												<td width="13%" class="title">자산번호</td>
												<td width="15%" class="title">컴퓨터이름</td>
											    <td width="10%" class="title">장비구분</td>
											    <td width="15%" class="title">용도</td>
											    <td width="10%" class="title">지역</td>
											    <td width="13%" class="title">OS</td>
											    <td width="20%" class="title">비고</td>
											</tr>
											<xsl:for-each select="NEWSNAPSHOT/user/vector/data/msgXomBasIPAsetItemMS">
											<xsl:variable name="use_syspaynm" select="use_syspaynm" />
											<xsl:variable name="aset_no" select="aset_no" />
											<xsl:variable name="aset_nm" select="aset_nm" />
											<xsl:variable name="aset_type" select="apr_aset" />
											<xsl:variable name="aset_usg" select="aset_usg" />
											<xsl:variable name="aset_region_1" select="aset_region_1" />
											<xsl:variable name="opr_sys" select="apr_opr_sys" />
											<xsl:variable name="etc" select="etc" />
											<tr>
												<td width="7%" class='contant-center'>
												 	<xsl:value-of select="$use_syspaynm"/>
											    </td>
											    <td width="13%" class='contant-center'>
												 	<xsl:value-of select="$aset_no"/>
											    </td>
											    <td width="15%" class='contant-center'>
												 	<xsl:value-of select="$aset_nm"/>
											    </td>
											    <td width="10%" class='contant-center'>
												 	<xsl:value-of select="$aset_type"/>
											    </td>
											    <td width="15%" class='contant'>
												 	<xsl:value-of select="$aset_usg"/>
											    </td>
											    <td width="10%" class='contant-center'>
												 	<xsl:value-of select="$aset_region_1"/>
											    </td>
											    <td width="13%" class='contant-center'>
												 	<xsl:value-of select="$opr_sys"/>
											    </td>
											    <td width="20%" class='contant'>
												 	<xsl:value-of select="$etc"/>
											    </td>
											</tr>
											</xsl:for-each>
										</table>
								 	</td>
								</tr>
							</table>

							<table width="100%" class="aproutertable">
								<tr>
									<td class="head">IP발급정보</td>
								</tr>
								<tr>
								     <td class="body">
										<table class="aprinnertable" width="100%">
											<tr>
												<td width="15%" class="title">사용자</td>											
											    <td width="10%" class="title">자산번호</td>
											    <td width="10%" class="title">발급IP</td>
											    <td width="10%" class="title">서브넷마스크</td>
											    <td width="10%" class="title">게이트웨이</td>
											    <td width="10%" class="title">기본DNS</td>
											    <td width="10%" class="title">보조DNS</td>
											    <td width="25%"  class="title">비고</td>
											</tr>
											<xsl:for-each select="NEWSNAPSHOT/ip/vector/data/msgXomBasIPAsetItemMS">
											<xsl:variable name="use_nm_full" select="use_nm_full" />										
											<xsl:variable name="aset_no" select="aset_no" />
											<xsl:variable name="ip_addr" select="ip_addr" />
											<xsl:variable name="sub_mask" select="sub_mask" />
											<xsl:variable name="gateway" select="gateway" />
											<xsl:variable name="base_dns" select="base_dns" />
											<xsl:variable name="sub_dns" select="sub_dns" />
											<xsl:variable name="result_opn" select="result_opn" />
											<tr>
												<td width="15%" class='contant-center'>
												 	<xsl:value-of select="$use_nm_full"/>
											    </td>										    
											    <td width="10%" class='contant-center'>
												 	<xsl:value-of select="$aset_no"/>
											    </td>
											    <td width="10%" class='contant-center'>
												 	<xsl:value-of select="$ip_addr"/>
											    </td>
											    <td width="10%" class='contant-center'>
												 	<xsl:value-of select="$sub_mask"/>
											    </td>
											    <td width="10%" class='contant-center'>
												 	<xsl:value-of select="$gateway"/>
											    </td>
											    <td width="10%" class='contant-center'>
												 	<xsl:value-of select="$base_dns"/>
											    </td>
											    <td width="10%" class='contant-center'>
												 	<xsl:value-of select="$sub_dns"/>
											    </td>
											    <td width="25%" class='contant-center'>
												 	<xsl:value-of select="$result_opn"/>
											    </td>
											</tr>
											</xsl:for-each>
										</table>
									</td>
								</tr>
							</table>
					</form>
				</xsl:if>
				

				<iframe name="ifr" height="0" width="0"></iframe>
			</BODY>
		</html>
	</xsl:template>
</xsl:stylesheet>