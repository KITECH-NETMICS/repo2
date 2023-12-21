<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="snapshot.css" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:fo="http://www.w3.org/1999/XSL/Format">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<html lang="kr">
			<head>
				<meta charset="UTF-8" />
				<title>유지보수일지등록</title>
				<link href="/style/snapshot_st.css" rel="stylesheet" type="text/css" />
			</head>
			<body>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable" style="margin-bottom:20px;">
					<tr>
						<td class="head">자산 정보</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class="title2">신청번호</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVAL/req_no" />
									</td>
									<td class="title2">고유자산번호</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVAL/equip_cd" />
									</td>
								</tr>
								<tr>
									<td class="title2">시설장비명</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="APPROVAL/aset_nm" />
									</td>
								</tr>
								<tr>
									<td class="title2">활용범위</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVAL/use_scop_nm" />
									</td>
									<td class="title2">NFEC관리번호</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVAL/ntis_reg_no" />
									</td>
								</tr>
								<tr>
									<td class="title2">사용자개인번호</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/user_emp_no" />
									</td>
									<td class="title2">사용자이름</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/user_nm" />
									</td>
								</tr>
								<tr>
									<td class="title2">소속(연구소)</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/user_divsn_dept_nm" />
									</td>
									<td class="title2">소속(부서)</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/user_dept_nm" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td class="head">작성자 정보</td>
					</tr>
					<tr>
						<td class="body">	
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
								<tr>
									<td class="title2">개인번호</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVAL/equip_use_emp_no" />
									</td>
									<td class="title2">이름</td>
									<td width="35%" class="contant">
										<xsl:value-of select="APPROVAL/equip_use_emp_nm" />
									</td>
								</tr>
								<tr>
									<td class="title2">소속(연구소)</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/equip_user_divsn_dept_nm" />
									</td>
									<td class="title2">소속(부서)</td>
									<td class="contant">
										<xsl:value-of select="APPROVAL/equip_use_dept_nm" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td class="head">유지보수 내역</td>
					</tr>
					<tr>
						<td class="body">	
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">	
								<tr>
									<td class="title2">유지보수 기간</td>
									<td class="contant" colspan="3" width="85%">
										<xsl:value-of select="APPROVAL/equip_use_start_day" />
										~
										<xsl:value-of select="APPROVAL/equip_use_cls_day" />
									</td>
								</tr>
								<tr>
									<td class="title2">시설장비 상태</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="APPROVAL/equip_status" />
									</td>
								</tr>
								<tr>
									<td class="title2">유지보수 내용</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="APPROVAL/job_rmk" />
									</td>
								</tr>
								<tr>
									<td class="title2">유지보수 결과</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="APPROVAL/mntnce_rst" />
									</td>
								</tr>
								<tr>
									<td class="title2">유지보수 비용</td>
									<td class="contant" colspan="3">
										<xsl:value-of select="APPROVAL/job_qty" />
									</td>
								</tr>
								<tr>
									<td class="title2">첨부파일</td>
									<td colspan="3" class="contant">
										<xsl:for-each select="APPROVAL/fileList_A/vector/data/mdata">
											<a>
												<xsl:attribute name="onclick">downloadForXsl('<xsl:value-of select="attach_file_no"/><xsl:value-of select="seq"/>', 'XAA006')</xsl:attribute>
												<xsl:value-of select="file_nm" />
											</a>
										</xsl:for-each>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
