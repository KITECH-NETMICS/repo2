<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
			<body>
				<table style="width:750px; " border='0' cellspacing='0' cellpadding='0'>
					<tr>
						<td>
							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head" style="width:100%; color:#ff0000; font-weight:700; font-size:13px;">
										[ 인계/인수부서의 부서장 전결사항입니다.
										<br />
										특별한 사안이 아닌경우, 결재선은 부서장까지만 남기시고 편집-삭제 후 상신바랍니다. (문의 :천안 254) ]
									</td>
								</tr>
								<tr>
									<td colspan="4" class="head" style="width:100%; ">인수인계신청</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<td class="title2" style="width:22%; ">자산구분</td>
												<td class="contant" style="width:28% ; ">
													<xsl:value-of select="/ASSAPPCHAREQ/INSUINKEINFO/aset_typ" />
												</td>
												<td class="title2" style="width:22% ;  ">인수인계 신청서 번호</td>
												<td id="req_no" class="contant" style="width:28% ;  ">
													<xsl:value-of select="/ASSAPPCHAREQ/INSUINKEINFO/req_no" />
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head" style="width:100%; ">인계자정보</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<td class="title2" style="width:22%; ">인계자</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="/ASSAPPCHAREQ/INSUINKEINFO/trans_nm" />
													[
													<xsl:value-of select="/ASSAPPCHAREQ/INSUINKEINFO/trans_empno" />
													]
												</td>
												<td class="title2" style="width:22%; ">이메일</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="/ASSAPPCHAREQ/INSUINKEINFO/trans_email" />
												</td>
											</tr>
											<tr>
												<td class="title2">부서명</td>
												<td class="contant">
													<xsl:value-of select="/ASSAPPCHAREQ/INSUINKEINFO/trans_dept_nm" />
												</td>
												<td class="title2">연락처</td>
												<td class="contant">
													<xsl:value-of select="/ASSAPPCHAREQ/INSUINKEINFO/trans_ext_no" />
												</td>
											</tr>
											<tr>
												<td class="title2">사유</td>
												<td class="contant" colspan="3">
													<xsl:value-of select="/ASSAPPCHAREQ/INSUINKEINFO/cause" />
												</td>
											</tr>
											<tr>
												<td class="title2">첨부서류</td>
												<td colspan="3">
													<table width="100%" border="0" cellpadding="0" cellspacing="0" class="aprinnertable">
														<xsl:for-each select="/ASSAPPCHAREQ/fileList_A/vector/data/mdata">
															<tr>
																<td class='title2' width="16%"> <xsl:value-of select="seq" /></td>
																<td class='contant' width="84%">
																	<a>
																		<xsl:attribute name="href">javascript:downloadForXsl('<xsl:value-of select="attach_file_no" /><xsl:value-of select="seq" />','XAA015')</xsl:attribute>
																		<xsl:value-of select="file_nm" />
																	</a>
																</td>
															</tr>
														</xsl:for-each>
													</table>
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head">인수자정보</td>
								</tr>
								<tr>
									<td class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<td class="title2" style="width:22%; ">인수자</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="/ASSAPPCHAREQ/INSUINKEINFO/receipt_nm" />
													[
													<xsl:value-of select="/ASSAPPCHAREQ/INSUINKEINFO/receipt_empno" />
													]
												</td>
												<td class="title2" style="width:22%; ">이메일</td>
												<td class="contant" style="width:28%; ">
													<xsl:value-of select="/ASSAPPCHAREQ/INSUINKEINFO/receipt_email" />
												</td>
											</tr>
											<tr>
												<td class="title2">부서명</td>
												<td class="contant">
													<xsl:value-of select="/ASSAPPCHAREQ/INSUINKEINFO/receipt_dept_nm" />
												</td>
												<td class="title2">연락처</td>
												<td class="contant">
													<xsl:value-of select="/ASSAPPCHAREQ/INSUINKEINFO/receipt_ext_no" />
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>

							<table class="aproutertable" style="width:100%; ">
								<tr>
									<td colspan="4" class="head">인수인계 신청내역</td>
								</tr>
								<tr>
									<td colspan="4" class="body">
										<table class="aprinnertable" style="width:100%; ">
											<tr>
												<th class="title" style= "text-align:center;">순번</th>
												<th class="title" style= "text-align:center;">자산분류</th>
												<th class="title" style= "text-align:center;">자산번호</th>
												<th class="title" style= "text-align:center;">취득일자</th>
												<th class="title" style= "text-align:center;">품명</th>
												<th class="title" style= "text-align:center;">취득금액</th>
												<th class="title" style= "text-align:center;">사용자</th>
												<th class="title" style= "text-align:center;">위치</th>
											</tr>

											<xsl:for-each select="/ASSAPPCHAREQ/GRIDRESULT/vector/data/msgAssReceiptTransMS02">
												<tr>
													<td class="contant-center" >
														<xsl:value-of select="position()" />
													</td>
													<td class="contant-center" >
														<xsl:value-of select="aset_clsf_nm" />
													</td>
													<td class="contant-center" style="white-space:nowrap;">
														<xsl:value-of select="aset_no" />
													</td>
													<td class="contant-center" style="white-space:nowrap;">
														<xsl:value-of select="substring(intro_ymd, 1, 4)" />-<xsl:value-of select="substring(intro_ymd, 5, 2)" />-<xsl:value-of select="substring(intro_ymd, 7, 2)" />
													</td>
													<td class="contant" >
														<xsl:value-of select="aset_nm" />
													</td>
													<td class="contant-right" style="white-space:nowrap;">
														<xsl:value-of select="format-number(intro_amt, '#,###.##')" />
													</td>
													<td class="contant-center" style="white-space:nowrap; ">
														<xsl:value-of select="user_nm" />
													</td>
													<td class="contant" >
														<xsl:value-of select="posi_region_nm" />
														<span><xsl:value-of select="posi_build_nm" /></span> 
														<span><xsl:value-of select="posi_floor" /> </span>
														<xsl:value-of select="posi_detls" />
													</td>
												</tr>
											</xsl:for-each>
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