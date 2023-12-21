<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
<xsl:template match="/">
<xsl:variable name="localPath" select="1" />
			<body>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head">1. 학생연구원 인적사항</td>
					</tr>
					<tr>
						<td class="body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" class="aprinnertable">
								<tr style="height: 45px">
									<td class="title2">성 명</td>
									<td width="20%" class="contant">
										<xsl:value-of select = "request/APPROVAL/nm"/>
									</td>
									<td class="title2">학 번</td>
									<td width="20%" class="contant">

									</td> 
									<td class="title2">생년월일</td>
									<td width="20%" class="contant">
										<xsl:value-of select = "request/APPROVAL/birthdt_mmdd"/>
									</td>
								</tr>
								<tr style="height: 45px">
									<td class="title2" style="line-height: 1">소 속<br />(학과명)</td>
									<td width="20%" class="contant">
										<xsl:value-of select = "request/APPROVAL/dept_nm"/>
									</td>
									<td class="title2">과정 및 학기</td>
									<td width="20%" class="contant" colspan="3">
										<span><xsl:value-of select = "request/APPROVAL/degreeCourse"/></span><span>과정</span>
									</td>
								</tr>
								<tr style="height: 45px">
									<td class="title2" style="line-height: 1">과학기술인번호</td>
									<td colspan="5" width="20%" class="contant">
										<xsl:value-of select = "request/APPROVAL/sci_tech_regst_no"/>
									</td>
								</tr>
								<tr style="height: 45px">
									<td class="title2" style="line-height: 1">주소</td>
									<td colspan="5" width="20%" class="contant">
										<xsl:value-of select = "request/APPROVAL/addr"/>
									</td>
								</tr>
								<tr style="height: 45px">
									<td class="title2" style="line-height: 1">연락처</td>
									<td colspan="2" width="20%" class="contant">
										<xsl:value-of select = "request/APPROVAL/mobile"/>
									</td>
									<td class="title2" style="line-height: 1">이메일</td>
									<td colspan="2" width="20%" class="contant">
										<xsl:value-of select = "request/APPROVAL/email"/>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable" style="margin-bottom: 10px;">
					<tr>
						<td class="head">2. 연구참여정보</td>
					</tr>
					<tr>
						<td>
							<table width="100%" class="aprinnertable">
								<tr>
									<td style="width: 150px">가. 연구참여기간 :</td>
									<td><xsl:value-of select = "request/APPROVAL/연구참여기간"/></td>
								</tr>
								<tr>
									<td>나. 담당업무(역할) :</td>
									<td><xsl:value-of select = "request/APPROVAL/job_nm"/></td>
								</tr>
								<tr>
									<td colspan="2"><span style="font-size: 12px">※ 연구주제 및 연구수행내용, 역할 등 담당업무를 구체적으로 작성하고, 연구와 관련 없는 업무는 기재하지 않음</span></td>
								</tr>
								<tr>
									<td colspan="2"> 다. 계정단위 학생인건비 총지급액 및 지급률</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<!-- 다. 계정단위 학생인건비 총지급액 및 지급률 -->
				<table width="100%" class="aproutertable">
					<tr>
						<td class="body">
							<table width="100%" class="aprinnertable">
								<tr style="height: 45px;">
									<td class="title2">계정번호</td>
									<td class="title2">계정책임자</td>
									<td class="title2">지급총액</td>
									<td class="title2">지급개월수</td>
									<td class="title2">*월평균지급률</td>
								</tr>
								<tr style="height: 45px;">
									<td class="contant">
										<xsl:value-of select = "request/APPROVAL/ff_num"/>
									</td>
									<td class="contant" rowspan="2">
										<xsl:value-of select = "request/APPROVAL/pruse_psn_nm"/>
									</td>
									<td class="contant" rowspan="2">
										<span><xsl:value-of select = "request/APPROVAL/contrct_amt_sum"/></span><span>원</span>
									</td>
									<td class="contant" rowspan="2">
										<span><xsl:value-of select = "request/APPROVAL/prj_month"/></span><span>개월</span>
									</td>
									<td class="contant" rowspan="2">
										<xsl:value-of select = "request/APPROVAL/week_work_time"/>
									</td>
								</tr>
								<tr style="height: 45px;">
									<td class="contant">
										<xsl:for-each select="request/APPROVAL/doc/vector/data/HumStdnCcdMntMS01">
											<div><xsl:value-of select="accnt_no"/></div>
										</xsl:for-each>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<p style="text-align: left;">* 계정번호는 풀링(ff130005) 및 비풀링(민간수탁 및 자체연구사업) 계정번호 기재<br />** 월평균지급률 = 월평균지급액(지급총액/지급개월수)/기준금액</p>

				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable">
					<tr>
						<td class="head" style="width: 200px">라. 학생인건비 지급일 : 매월 21일 </td>
					</tr>
					<tr>
						<td class="head">마. 지급방법 : 학생연구원 명의 예금통장에 입금(1인 1계좌)</td>
					</tr>
					<tr>
						<td style="font-size: 12px;"> ※ 참여중단·종료 시 중단·종료일까지 참여한 업무 일(월 등)수에 대해 일할(월할 등) 계산하여 지급함.</td>
					</tr>
					<tr>
						<td class="head">바. 연수(계정)책임자</td>
					</tr>
				</table>
				<table width="100%" class="aprinnertable" style="border: 1px solid #B9C3D1;">
					<tr style="height: 45px;">
						<td class="title2" style="width: 200px">성 명</td>
						<td colspan="3" class="contant"><xsl:value-of select = "request/APPROVAL/pruse_psn_nm"/></td>
					</tr>
					<tr style="height: 45px">
						<td class="title2" style="line-height: 1">소 속<br />(학과명)</td>
						<td class="contant" style="width: 200px"><xsl:value-of select = "request/APPROVAL/pruse_psn_dept_nm"/></td>
						<td class="title2">직 급</td>
						<td class="contant"><xsl:value-of select = "request/APPROVAL/pruse_psn_posi_nm"/></td>
					</tr>
					<tr style="height: 45px;">
						<td class="title2">연락처</td>
						<td class="contant"><xsl:value-of select = "request/APPROVAL/pruse_psn_ext_no"/></td>
						<td class="title2">E-mail</td>
						<td class="contant"><xsl:value-of select = "request/APPROVAL/pruse_psn_email"/></td>
					</tr>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aproutertable" style="padding-bottom: 80px">
					<tr>
						<td class="head">3. 기타 확약사항</td>
					</tr>
					<tr>
						<td>
							<table width="100%" class="aprinnertable" style="margin-bottom: 50px;">
								<tr>
									<td style="font-size: 12px;padding: 20px 0" colspan="3">
<p>가. 학생연구원은 연구 수행시 관련 규정을 준수하고 연구에 필요한 담당업무를 성실히 수행한다.</p>
<p>나. 연수책임자는 학생연구원의 정당한 학업활동 및 연구활동, 충분한 휴식 등을 보장하기 위해 노력하고, 학생연구원 제도를 공정하고 투명하게 운영한다.</p>
<p>다. 연수책임자는 학생연구원에게 연구 내용과 무관한 업무를 지시하거나 연구참여확약서에 명시되지 않은 활동이나 사적 업무에 동원하지 않는다.</p>
<p>라. 연수책임자는 통합관리자지정기관의 장과 협의하여 학생연구원의 재해 예방을 위해 안전·보건에 필요한 조치를 취한다.</p>
<p>마. 연수책임자는 인권, 양성평등, 윤리 등에 관한 교육을 이수하고 학생연구원에게 폭언·폭행·성추행 및 성희롱 등을 포함한 제반 권리를 침해하지 않는다.</p>
<p>바. 연수책임자는 학생연구원에게 지급된 학생인건비를 어떠한 이유에서든지 회수하여 공동으로 관리 또는 사용(학생인건비 유용)하지 않는다.</p>
<p>사. 학생연구원은 연수책임자가 연구참여확약서 조건을 위한하였을 경우 연구기관에 시정을 요구할 수 있다.</p>
<p>아. 학생연구원 동 연구참여확약서에 따라 지급 받는 인건비 이외에 타 소득이 발생한 경우 또는 학적변동, 업무수행 불가능의 변경사항 발생 시 연수책임자 및 연구원에 반드시 사전신고 및 승인을 받아야 한다.</p>
<p>자. 연수책임자는 학생연구원이 질병·실종·형사소추 등으로 업무 수행이 불가능하거나 업무 능력 미달 또는 업무를 성실히 수행하지 아니할 경우 연구참여확약을 취소할 수 있다.</p>
<p>차. 연수책임자는 학생연구원을 성실히 지도하고, 연구윤리 및 연구보안을 준수하며, 학생연구원에 대한 학생인건비·연구수당 지급, 연구개발 성과에 대한 권리 보장 등을 공정하고 투명하게 관리하여야 한다.</p>
									</td>
								</tr>
								<tr>
									<td colspan="3" style="text-align: center;height: 120px;"><h3><xsl:value-of select = "request/APPROVAL/contractDate"/></h3></td>
								</tr>
								<tr>
									<td style="text-align: right;width: 75%">학생연구원 : </td>
									<td style="text-align: center;"><xsl:value-of select = "request/APPROVAL/nm"/></td>
									<td>(서명 또는 인)</td>
								</tr>
								<tr>
									<td style="text-align: right;">연수책임자 : </td>
									<td style="text-align: center;"><xsl:value-of select = "request/APPROVAL/pruse_psn_nm"/></td>
									<td>(서명 또는 인)</td>
								</tr>
								<tr>
									<td style="text-align: right;">한국생산기술연구원장 : </td>
									<td style="text-align: center;">이상목</td>
									<td>(서명 또는 인)</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</body>
	</xsl:template>
</xsl:stylesheet>