<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="euc-kr"%>
<%@ page import="java.io.IOException" %>
<%@ page import="java.util.*" %>
<%@ page import="javax.annotation.Resource"%>
<%@ page import="kr.re.kitech.biz.epu.req.vo.PurSrcVo"%>
<%@ page import="kr.re.kitech.biz.epu.pop.vo.PurReqProgrsVo"%>
<%@ page import="kr.re.kitech.biz.epu.pop.service.EpuPopService"%>
<%@ page import="com.inswave.elfw.util.ElBeanUtils"%>
<%	
	String purReqNo = request.getParameter("pur_req_no");
	String gbidNotiNo = request.getParameter("bid_noti_no");
	String gchgNo = request.getParameter("chg_no");
	String bidNotiNo = "";
	String bidNotiYmd = "";
	String bidEndYmd = "";
	String bidVal = "";
	String cancelReason = "";	
	String format = "#,##0";
	java.text.DecimalFormat df = new java.text.DecimalFormat(format);	
	PurReqProgrsVo progrsVo = null;

	try {
		PurSrcVo vo = new PurSrcVo();
		vo.setPur_req_no(purReqNo);
		vo.setBid_noti_no(gbidNotiNo);
		vo.setChg_no(gchgNo);
		
		EpuPopService popService = (EpuPopService) ElBeanUtils.getBean("epuPopService");

		progrsVo = popService.selectPurReqProgrs(vo);
		
		bidNotiNo = progrsVo.getBid_noti_no();
		bidEndYmd = progrsVo.getBid_end_ymd();

		if (bidNotiNo != "" && bidNotiNo != null) {
			bidNotiYmd = progrsVo.getBid_noti_ymd();
		}
		
		if (bidEndYmd != "" && bidEndYmd != null) {
			bidEndYmd = bidEndYmd.substring(0,8) + " " + bidEndYmd.substring(8,10) +":" +bidEndYmd.substring(10,12);
		}
		
		if (!"".equals(progrsVo.getBid_val())) {
			bidVal = df.format(Double.parseDouble(progrsVo.getBid_val()));
		}

		cancelReason = progrsVo.getCancel_reason();
	} catch (Exception e) {
		e.printStackTrace();
	}

%><!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>���ſ䱸 ���� ���� ����</title>
<style>
	html, body {
		height:100%;
		margin : 0 auto;
	}
	body {
		width:100%;
	}
	body, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, form, fieldset, p {
		margin:0 auto;
		padding:0
	}
	div {
		outline:none
	}
	body, h1, h2, h3, h4, input, button {
		font-family:'Malgun Gothic', '����', 'Gulim', Helvetica, sans-serif;
		color:#333;
		font-size:12px
		letter-spacing: -2px;
	}
	h1, h2, h3, h4, strong {
		font-weight:bold
	}
	body {
		word-break:break-all;
		-ms-word-break:break-all;
		font-size:12px
	}
	img, fieldset, iframe {
		border:0 none
	}
	li {
		list-style:none;
		margin-top: 10px;
	}
	input, select, button {
		vertical-align:middle;
		margin:0;
		padding:0
	}
	input[type="text"]:disabled {
		border:1px solid #d4d4d4;
		color:#383d41;
		font-size:12px;
	}
	img {
		vertical-align:top;
	}
	label, button {
		cursor:pointer
	}
	a {
		text-decoration:none
	}

	table {
		width:100%;
		border-collapse:collapse;
		border-spacing:0
	}
	.clear {
		clear:both;
	}
	legend {
		display:none;
	}
	#wrapper {
		border-style:solid;
		border-width:4px;
		border-color:#4b79c9;
		height:495px;
		width:925px;
		overflow:hidden;
	}
	#header {
		position:relative;
		width: 925px;
		background:url(img/head.png) no-repeat;
		width:100%;
		height:48px;
		margin:0 auto;
		overflow:hidden;
	}
	#header .close {
		position:absolute;
		width:56px;
		float:right;
		right:43px;
		top:10px;
	}
	#header .title {
		position:absolute;
		width:100%;
		text-align: center;
		right:0;
		top:8px;
	}
	.title h1 {
		font-size:24px;
		font-weight:bold;
		line-height:30px;
		color:#555555;
	}
	#container {
		position:relative;
		height:100%;
		margin:10px 11px 0 11px;
	}
	#container .infobox {
		height:82px;
		background-color:#727372;
		color:#ffffff;
		padding-top:8px;
		padding-left:16px;
	}
	.infobox td {
		height:23px;
	}
	.thick {
		left:14px;
		padding-left: 8px;
		font-size:12px;
		font-weight:bold;
		background:url(img/bullet.png) no-repeat 0 50%;
	}
	#container .contents {
		position:absolute;
	}
	#container .contents ul {
		padding-top:1px;
	}
	.contents ul li {
		position:relative;
		width: 177px;
		font-size:15px;
		color:#fff;
		font-weight:bold;
		text-align:center;
		line-height:30px;
		display:inline-block;
	}
	#title_01_div {
		background:url(img/title_01.png) no-repeat;
	}
	#title_02_div {
		background:url(img/title_02.png) no-repeat;
	}
	#title_03_div {
		background:url(img/title_03.png) no-repeat;
	}
	#title_04_div {
		background:url(img/title_04.png) no-repeat ;

	}
	#title_05_div {
		background:url(img/title_05.png) no-repeat;
	}
	#title_05_1 {
		background:url(img/title_05_1.png) no-repeat;
	}
	#title_05_2 {
		background:url(img/title_05_2.png) no-repeat;
	}
	#title_06_div {
		background:url(img/title_06.png) no-repeat;
	}
	#title_07_div {
		background:url(img/title_07.png) no-repeat;
	}
	#title_08_div {
		background:url(img/title_08.png) no-repeat;
	}
	#title_09_div {
		background:url(img/title_09.png) no-repeat;
	}
	#title_10_div {
		background:url(img/title_10.png) no-repeat;
	}
	#title_11_div {
		background:url(img/title_11.png) no-repeat;
	}
	#title_12_div {
		background:url(img/title_12.png) no-repeat;
	}
	#title_13_div {
		background:url(img/title_13.png) no-repeat;
	}

	.sub_table {
		margin-top:1px;
		font-size:12px;
		font-weight:bold;
		color:#555555;
		line-height:26px;
		border:1px solid #b9b3b3;
		letter-spacing: -1px;
	}
	.sub_table th {
		background:#eeeeee;
		border-bottom: 1px solid #b9b3b3;
	}
	.sub_table td {
		border-left:1px solid #b9b3b3;
		border-bottom: 1px solid #b9b3b3;
		font-weight:normal;
		text-align:left;
		padding-left:6px;
	}

	.sub_table2 {
		margin-top:1px;
		font-size:12px;
		font-weight:bold;
		color:#555555;
		line-height:26px;
		border:1px solid #b9b3b3;
		letter-spacing: -1px;
	}
	.sub_table2 th {
		background:#eeeeee;
		border-bottom: 1px solid #b9b3b3;
	}
	.sub_table2 td {
		border-left:1px solid #b9b3b3;
		border-bottom: 1px solid #b9b3b3;
		font-weight:normal;
		text-align:left;
		padding-left:6px;
	}

	.sub_table3 {
		margin-top:1px;
		font-size:14px;
		font-weight:bold;
		color:#fff;
		background:#7bc342;
	}
	.sub_table3 th {
		height: 28px;
	}

	.sub_table4 {
		margin-top:7px;
		font-size:14px;
		font-weight:bold;
		color:#fff;
		background:#7bc342;
	}

	/* ���� ���ϰ� */
	.sub_table5 {
		margin-top:10px;
		font-size:12px;
		font-weight:bold;
		color:#333333;
		line-height:26px;
		border:1px solid #867e7e;
		letter-spacing: -1px;
	}
	.sub_table5 th {
		background:#e2e2e2;
		border-bottom: 1px solid #867e7e;
	}
	.sub_table5 td {
		background:#f3f3f3;
		border-left:1px solid #867e7e;
		border-bottom: 1px solid #867e7e;
		font-weight:normal;
		text-align:left;
		padding-left:6px;
	}

	/* ���� �帮�� */
	.sub_table6 {
		margin-top:10px;
		font-size:12px;
		font-weight:bold;
		color:#c5c5c5;
		line-height:26px;
		border:1px solid #eae8e8;
		letter-spacing: -1px;
	}
	.sub_table6 th {
		background:#f9f9f9;
		border-bottom: 1px solid #eae8e8;
	}
	.sub_table6 td {
		background:#ffffff;
		border-left:1px solid #eae8e8;
		border-bottom: 1px solid #eae8e8;
		font-weight:normal;
		text-align:left;
		padding-left:6px;
	}

	#view_none {
		display:none;
	}
</style>
<script lang="javascript">
	window.onload = function () {
		var pqYn = '<%=progrsVo.getPq_eval_yn()%>';
		var estiYn = '<%=progrsVo.getMulti_esti_pr_yn()%>';
		var assetReg = '<%=progrsVo.getAsset_reg()%>';
		var bidClsf = '<%=progrsVo.getBid_clsf_cd()%>';
		var bidSuccType = '<%=progrsVo.getBid_succ_type()%>';
		var purGrpCd = '<%=progrsVo.getPur_grp_cd()%>';
		var contractTypeNm = '<%=progrsVo.getContract_type_nm()%>';

		document.getElementById('bid_01').style.display = "none";
		document.getElementById('bid_02').style.display = "none";
		document.getElementById('bid_03').style.display = "none";
		document.getElementById('bid_04').style.display = "none";

		//�������� ���
		if (bidClsf == '��������' || bidClsf == '�񿬰�����') {
			if (bidSuccType == '���ڽô�' || bidSuccType == '���ڽô�(���ڰ�)') {
				document.getElementById('bid_02').style.display = "block";
				document.getElementById('title_05').style.display = "none";
				document.getElementById('title_06').style.display = "none";
			} else {
				document.getElementById('bid_01').style.display = "block";
			}

			if (bidClsf == '�񿬰�����') {
				document.getElementById('title_06').style.display = "none";
			}
		} else if (bidClsf == '�߾������Ƿ�') {
			document.getElementById('bid_03').style.display = "block";
			document.getElementById('title_09').style.display = "none";	//�����ڼ���
		} else if (bidClsf == '�������� ���θ�') {
			document.getElementById('bid_04').style.display = "block";
			document.getElementById('title_09').style.display = "none";	//�����ڼ���
		} else {
			document.getElementById('bid_01').style.display = "block";
		}

		if (purGrpCd == '����') {
			document.getElementById('chk_01').style.display = "none";
		} else {
			document.getElementById('chk_02').style.display = "none";
		}

		//PQ�ɻ� ����
		if (pqYn != 'Y') {
			document.getElementById('title_03').style.display = "none";
		}

		//����
		if (estiYn.trim() == '�񿹰�') {
			document.getElementById('title_05').style.display = "none";
		}

		contractTypeNm = contractTypeNm.trim();

		//����/�ɻ�
		if (contractTypeNm == '������') {
			document.getElementById('title_04').style.display = "none";	//�ɻ�
			document.getElementById('title_07').style.display = "none";	//���ݽɻ�
			document.getElementById('title_08').style.display = "none"; //�������
		} else if (contractTypeNm == '�԰�') {
			document.getElementById('eval_02').style.display = "none";	//���Ƚɻ�
			document.getElementById('title_07').style.display = "none";	//���ݽɻ�
			document.getElementById('title_08').style.display = "none"; //�������
		} else if (contractTypeNm == '����') {
			document.getElementById('eval_01').style.display = "none";	//���Ƚɻ�
			document.getElementById('title_07').style.display = "none";	//���ݽɻ�
		} else if (contractTypeNm == '����') {
			document.getElementById('title_04').style.display = "none";	//�ɻ�
			document.getElementById('title_08').style.display = "none"; //�������
		} else {
			document.getElementById('title_04').style.display = "none";	//�ɻ�
			document.getElementById('title_07').style.display = "none";	//���ݽɻ�
			document.getElementById('title_08').style.display = "none"; //�������
		}

		//�ڻ����
		if (assetReg != 'Y') {
			document.getElementById('title_12').style.display = "none";
		}

		//������ �ܰ� �� ���

		var bid_ord_no = '<%= progrsVo.getBid_ord_no()%>';
		//console.log("bid_ord_no : " + bid_ord_no);

		var bid_noti_no = '<%= progrsVo.getBid_noti_no()%>';

		var pq_chgr_nm = '<%= progrsVo.getPq_chgr_nm()%>';
		var eval_chgr_nm = '<%= progrsVo.getEval_chgr_nm()%>';

		var esti_chgr = '<%= progrsVo.getEsti_chgr()%>';
		var noti_status = '<%= progrsVo.getNoti_status()%>';

		var qual_chgr_nm = '<%=progrsVo.getQual_chgr_nm() %>';
		var nego_chgr_nm = '<%=progrsVo.getNego_chgr_nm() %>';

		var succ_chgr = '<%= progrsVo.getSucc_chgr()%>';
		var contrct_no = '<%=progrsVo.getContrct_no() %>';
		var checkup_req_no = '<%=progrsVo.getCheckup_req_no() %>';
		var complete_req_no = '<%=progrsVo.getComplete_req_no() %>';
		var ass_chgr = '<%=progrsVo.getAss_chgr() %>';
		var pay_req_no = '<%=progrsVo.getReq_no() %>';

		if (bid_ord_no == "" || bid_ord_no == null) {	//���ְ�ȹ
			document.getElementById('title_08_div').style.display = "none";

			document.getElementById('title_13_div').style.opacity = '0.4';	//����
			document.getElementById('title_12_div').style.opacity = '0.4';	//�ڻ����
			document.getElementById('title_11_div').style.opacity = '0.4';	//�˼�
			document.getElementById('title_10_div').style.opacity = '0.4';	//���
			document.getElementById('title_09_div').style.opacity = '0.4';	//�����ڼ���
			document.getElementById('title_08_div').style.opacity = '0.4';	//�������
			document.getElementById('title_07_div').style.opacity = '0.4';	//���ݽɻ�
			document.getElementById('title_06_div').style.opacity = '0.4';	//����
			document.getElementById('title_05_div').style.opacity = '0.4';	//����
			document.getElementById('title_04_div').style.opacity = '0.4';	//�ɻ�
			document.getElementById('title_03_div').style.opacity = '0.4';	//PQ�ɻ�
			document.getElementById('title_02_div').style.opacity = '0.4';	//����������
			document.getElementById('title_01_div').style.opacity = '0.4';	//���ְ�ȹ

			document.getElementById('title_13_div').style.filter = 'alpha(opacity=40)';	//����
			document.getElementById('title_12_div').style.filter = 'alpha(opacity=40)';	//�ڻ����
			document.getElementById('title_11_div').style.filter = 'alpha(opacity=40)';	//�˼�
			document.getElementById('title_10_div').style.filter = 'alpha(opacity=40)';	//���
			document.getElementById('title_09_div').style.filter = 'alpha(opacity=40)';	//�����ڼ���
			document.getElementById('title_08_div').style.filter = 'alpha(opacity=40)';	//�������
			document.getElementById('title_07_div').style.filter = 'alpha(opacity=40)';	//���ݽɻ�
			document.getElementById('title_06_div').style.filter = 'alpha(opacity=40)';	//����
			document.getElementById('title_05_div').style.filter = 'alpha(opacity=40)';	//����
			document.getElementById('title_04_div').style.filter = 'alpha(opacity=40)';	//�ɻ�
			document.getElementById('title_03_div').style.filter = 'alpha(opacity=40)';	//PQ�ɻ�
			document.getElementById('title_02_div').style.filter = 'alpha(opacity=40)';	//����������
			document.getElementById('title_01_div').style.filter = 'alpha(opacity=40)';	//���ְ�ȹ
		} else {
			if (bid_noti_no == "" || bid_noti_no == null) {	//����,����
				document.getElementById('title_02_div').style.opacity = '0.4';	//����������
				document.getElementById('title_02_div').style.filter = 'alpha(opacity=40)';	//����������
			}

			if (pq_chgr_nm == "" || pq_chgr_nm == null) {	//PQ�ɻ�
				document.getElementById('title_03_div').style.opacity = '0.4';	//PQ�ɻ�
				document.getElementById('title_03_div').style.filter = 'alpha(opacity=40)';	//PQ�ɻ�
			}

			if (eval_chgr_nm == "" || eval_chgr_nm == null) {	//�ɻ�(�԰�,����)
				document.getElementById('title_04_div').style.opacity = '0.4';	//�ɻ�(�԰�,����)
				document.getElementById('title_04_div').style.filter = 'alpha(opacity=40)';	//�ɻ�(�԰�,����)
			}

			if (esti_chgr == "" || esti_chgr == null) {	//����
				document.getElementById('title_05_div').style.opacity = '0.4';	//����
				document.getElementById('title_05_div').style.filter = 'alpha(opacity=40)';	//����

				//�ӽ�...pq�� �ɻ�
				//document.getElementById('title_03_div').style.opacity = '0.4';	//pq
				//document.getElementById('title_03_div').style.filter = 'alpha(opacity=40)';	//pq

				//document.getElementById('title_04_div').style.opacity = '0.4';	//�ɻ�
				//document.getElementById('title_04_div').style.filter = 'alpha(opacity=40)';	//�ɻ�
			}

			if (noti_status > 'PRA060') {	//����
				;
			} else {
				document.getElementById('title_06_div').style.opacity = '0.4';	//����
				document.getElementById('title_06_div').style.filter = 'alpha(opacity=40)';	//����
			}

			if (qual_chgr_nm == "" || qual_chgr_nm == null) {	//���ݽɻ�
				document.getElementById('title_07_div').style.opacity = '0.4';	//����
				document.getElementById('title_07_div').style.filter = 'alpha(opacity=40)';	//����
			}

			if (nego_chgr_nm == "" || nego_chgr_nm == null) {	//�������
				document.getElementById('title_08_div').style.opacity = '0.4';	//�������
				document.getElementById('title_08_div').style.filter = 'alpha(opacity=40)';	//�������
			}


			if (succ_chgr == "" || succ_chgr == null) {	//�����ڼ���
				document.getElementById('title_09_div').style.opacity = '0.4';	//�����ڼ���
				document.getElementById('title_09_div').style.filter = 'alpha(opacity=40)';	//�����ڼ���

				//�ӽ� ����, �������
				//document.getElementById('title_07_div').style.opacity = '0.4';	//����
				//document.getElementById('title_07_div').style.filter = 'alpha(opacity=40)';	//����

				//document.getElementById('title_08_div').style.opacity = '0.4';	//�������
				//document.getElementById('title_08_div').style.filter = 'alpha(opacity=40)';	//�������
			}

			if (contrct_no == "" || contrct_no == null) {	//���
				document.getElementById('title_10_div').style.opacity = '0.4';	//���
				document.getElementById('title_10_div').style.filter = 'alpha(opacity=40)';	//���
			}

			if ((checkup_req_no == "" || checkup_req_no == null) && (complete_req_no == "" || complete_req_no == null)) {	//�˼�
				document.getElementById('title_11_div').style.opacity = '0.4';	//�˼�
				document.getElementById('title_11_div').style.filter = 'alpha(opacity=40)';	//�˼�
			}

			if (ass_chgr == "" || ass_chgr == null) {	//�ڻ����
				document.getElementById('title_12_div').style.opacity = '0.4';	//�ڻ����
				document.getElementById('title_12_div').style.filter = 'alpha(opacity=40)';	//�ڻ����
			}

			if (pay_req_no == "" || pay_req_no == null) {	//����
				document.getElementById('title_13_div').style.opacity = '0.4';	//����
				document.getElementById('title_13_div').style.filter = 'alpha(opacity=40)';	//����
			}
		}
	};
</script>
</head>

<body>
	<div id="wrapper">
		<!-- header -->
		<div id="header">
			<div class="title"> <h1>���ſ䱸 ���� ���� ����</h1></div>
		</div>
		<div id="container">
			<div class="infobox">
				<table>
					<colgroup>
						<col style="width:24%;">
						<col style="width:22%;">
						<col style="width:29%;">
						<col style="width:25%;">
					</colgroup>
					<tr>
						<td><span class="thick">���ſ䱸��ȣ : </span><%= purReqNo %></td>
						<td><span class="thick">���ſ䱸���� : </span><%=progrsVo.getReq_ymd() %></td>
						<td><span class="thick">���ſ䱸�� : </span><%=progrsVo.getUser_sub_nm() %></td>
						<td><span class="thick">����å���� : </span><%=progrsVo.getUser_main_nm() %></td>
					</tr>
					<tr>
						<td><span class="thick">������ : </span><%=progrsVo.getInout_psn_clsf_cd() %></td>
						<td colspan="2"><span class="thick">ǰ������ : </span><%=progrsVo.getKrchar_gdnm() %></td>
						<td><span class="thick">�������� : </span><%=progrsVo.getPur_grp_cd() %></td>
					</tr>
					<tr>
						<td><span class="thick">������� : </span><%=progrsVo.getBid_succ_type() %></td>
						<td colspan="2"><span class="thick">������� : </span><%=progrsVo.getSucc_type() %></td>
						<td><span class="thick">����� : </span><%=progrsVo.getContrct_method() %></td>
					</tr>
				</table>
			</div>
			<div class="contents">
				<ul>
					<!-- id="view_none" ���⶧ ��� -->
					<li id="title_01">
						<div id="title_01_div" style="height:37px;">
						���ְ�ȹ
						</div>
						<table class="sub_table">
							<colgroup>
								<col style="width:75px;">
								<col>
							</colgroup>
							<tr>
								<th>���ֹ�ȣ</th>
								<td><%=progrsVo.getBid_ord_no() %></td>
							</tr>
							<tr>
								<th>��������</th>
								<td><%=progrsVo.getNoti_ymd() %></td>
							</tr>
							<tr>
								<th>���ִ����</th>
								<td><%=progrsVo.getBid_reg_nm() %></td>
							</tr>
							<tr>
								<th>����������</th>
								<td><%=progrsVo.getBid_clsf_cd() %></td>
							</tr>
						</table>
					</li>
					<li id="title_02">
						<div id="title_02_div" style="height:37px">
						����������
						</div>
						<div id="bid_01">
							<table class="sub_table3">
								<tr>
									<th>��������</th>
								</tr>
							</table>
							<table class="sub_table2">
								<colgroup>
									<col style="width:75px;">
									<col>
								</colgroup>
								<tr>
									<th>���������ȣ</th>
									<td><%=bidNotiNo %></td>
								</tr>
								<tr>
									<th>������������</th>
									<td><%=bidNotiYmd %></td>
								</tr>
								<tr>
									<th>������������</th>
									<td><%=bidEndYmd %></td>
								</tr>
								<tr>
									<th>����������</th>
									<td><%=progrsVo.getNoti_chgr() %></td>
								</tr>
							<%  if (!"".equals(cancelReason)) { %>
								<tr>
									<th>��� ����</th>
									<td><%=cancelReason %></td>
								</tr>
							<% } %>
							</table>
						</div>
						<div id="bid_02">
							<table class="sub_table3">
								<tr>
									<th>����</th>
								</tr>
							</table>
							<table class="sub_table2">
								<colgroup>
									<col style="width:75px;">
									<col>
								</colgroup>
								<tr>
									<th>���������ȣ</th>
									<td><%=bidNotiNo %></td>
								</tr>
								<tr>
									<th>������������</th>
									<td><%=bidNotiYmd %></td>
								</tr>
								<tr>
									<th>����������</th>
									<td><%=progrsVo.getNoti_chgr() %></td>
								</tr>
								<%  if (!"".equals(cancelReason)) { %>
								<tr>
									<th>��� ����</th>
									<td><%=cancelReason %></td>
								</tr>
							<% } %>
							</table>
						</div>
						<div id="bid_03">
							<table class="sub_table3">
								<tr>
									<th>�߾������Ƿ�</th>
								</tr>
							</table>
							<table class="sub_table2">
								<colgroup>
									<col style="width:75px;">
									<col>
								</colgroup>
								<tr>
									<th>���������ȣ</th>
									<td><%=bidNotiNo %></td>
								</tr>
								<tr>
									<th>������������</th>
									<td><%=bidNotiYmd %></td>
								</tr>
								<%  if (!"".equals(cancelReason)) { %>
								<tr>
									<th>��� ����</th>
									<td><%=cancelReason %></td>
								</tr>
							<% } %>
							</table>
						</div>
						<div id="bid_04">
							<table class="sub_table3">
								<tr>
									<th>�������� ���θ�</th>
								</tr>
							</table>
							<table class="sub_table2">
								<colgroup>
									<col style="width:75px;">
									<col>
								</colgroup>
								<tr>
									<th>���������ȣ</th>
									<td><%=bidNotiNo %></td>
								</tr>
								<tr>
									<th>������������</th>
									<td><%=bidNotiYmd %></td>
								</tr>
								<%  if (!"".equals(cancelReason)) { %>
								<tr>
									<th>��� ����</th>
									<td><%=cancelReason %></td>
								</tr>
							<% } %>
							</table>
						</div>
					</li>

					<li id="title_03">
						<div id="title_03_div" style="height:37px">
						PQ�ɻ�
						</div>
						<table class="sub_table">
							<colgroup>
								<col style="width:75px;">
								<col>
							</colgroup>
							<tr>
								<th>�򰡴����</th>
								<td><%=progrsVo.getPq_chgr_nm() %></td>
							</tr>
						</table>
					</li>
					<li id="title_04">
						<div id="title_04_div" style="height:37px">
						�ɻ�
						</div>
						<div id="eval_01" >
							<table class="sub_table3">
								<tr>
									<th>�԰ݽɻ�</th>
								</tr>
							</table>
							<table class="sub_table2">
								<colgroup>
									<col style="width:75px;">
									<col>
								</colgroup>
								<tr>
									<th>�򰡴����</th>
									<td><%=progrsVo.getEval_chgr_nm() %></td>
								</tr>
							</table>
						</div>
						<div id="eval_02">
							<table class="sub_table3">
								<tr>
									<th>���Ƚɻ�</th>
								</tr>
							</table>
							<table class="sub_table2">
								<colgroup>
									<col style="width:75px;">
									<col>
								</colgroup>
								<tr>
									<th>�򰡴����</th>
									<td><%=progrsVo.getEval_chgr_nm() %></td>
								</tr>
							</table>
						</div>
					</li>
					<li id="title_05">
						<div id="title_05_div" style="height:37px">
						����
						</div>
						<table class="sub_table">
							<colgroup>
								<col style="width:75px;">
								<col>
							</colgroup>
							<tr>
								<th>��������</th>
								<td><%=progrsVo.getMulti_esti_pr_yn() %></td>
							</tr>
							<tr>
								<th>�¶��ο���</th>
								<td><%=progrsVo.getEsti_online_yn() %></td>
							</tr>
							<tr>
								<th>���������</th>
								<td><%=progrsVo.getEsti_chgr() %></td>
							</tr>
						</table>
					</li>
				<!--
				</ul>
				<ul>
				-->
					<li id="title_06">
						<div id="title_06_div" style="height:37px">
						����
						</div>
						<table class="sub_table">
							<colgroup>
								<col style="width:75px;">
								<col>
							</colgroup>
							<tr>
								<th>��������</th>
								<td><%=progrsVo.getOpen_yn() %></td>
							</tr>
						</table>
					</li>
					<li id="title_07">
						<div id="title_07_div" style="height:37px">
						���ݽɻ�
						</div>
						<table class="sub_table">
							<colgroup>
								<col style="width:75px;">
								<col>
							</colgroup>
							<tr>
								<th>�򰡴����</th>
								<td><%=progrsVo.getQual_chgr_nm() %></td>
							</tr>
						</table>
					</li>
					<li id="title_08">
						<div id="title_08_div" style="height:37px">
						�������
						</div>
						<table class="sub_table">
							<colgroup>
								<col style="width:75px;">
								<col>
							</colgroup>
							<tr>
								<th>��������</th>
								<td><%=progrsVo.getNego_chgr_nm() %></td>
							</tr>
						</table>
					</li>
					<li id="title_09">
						<div id="title_09_div" style="height:37px">
						�����ڼ���
						</div>
						<table class="sub_table">
							<colgroup>
								<col style="width:75px;">
								<col>
							</colgroup>
							<tr>
								<th>��������</th>
								<td><%=progrsVo.getSucc_chgr() %></td>
							</tr>
							<tr>
								<th>�����ݾ�</th>
								<td><%=bidVal %></td>
							</tr>
							<tr>
								<th>������ü</th>
								<td><%=progrsVo.getVend_nm() %></td>
							</tr>
						</table>
					</li>
					<li id="title_10">
						<div id="title_10_div" style="height:37px">
						���
						</div>
						<table class="sub_table">
							<colgroup>
								<col style="width:75px;">
								<col>
							</colgroup>
							<tr>
								<th>����ȣ</th>
								<td><%=progrsVo.getContrct_no() %></td>
							</tr>
							<tr>
								<th>�������</th>
								<td><%=progrsVo.getCon_chgr() %></td>
							</tr>
							<tr>
								<th>�������</th>
								<td><%=progrsVo.getContrct_ymd() %></td>
							</tr>
						</table>
					</li>
				<!--
				</ul>
				<ul>
				-->
					<li id="title_11">
						<div id="title_11_div" style="height:37px">
						�˼�
						</div>
						<div id="chk_01">
							<table class="sub_table">
								<colgroup>
									<col style="width:75px;">
									<col>
								</colgroup>
								<tr>
									<th>�˼���û��ȣ</th>
									<td><%=progrsVo.getCheckup_req_no() %></td>
								</tr>
								<tr>
									<th>�˼���</th>
									<td><%=progrsVo.getChk_chgr() %></td>
								</tr>
								<tr>
									<th>�˼�����</th>
									<td><%=progrsVo.getChk_ymd() %></td>
								</tr>
							</table>
						</div>
						<div id="chk_02">
							<table class="sub_table4">
								<tr>
									<th>�ذ�</th>
								</tr>
							</table>
							<table class="sub_table2">
								<colgroup>
									<col style="width:75px;">
									<col>
								</colgroup>
								<tr>
									<th>�ذ���û��ȣ</th>
									<td><%=progrsVo.getComplete_req_no() %></td>
								</tr>
								<tr>
									<th>������</th>
									<td><%=progrsVo.getComp_chgr() %></td>
								</tr>
								<tr>
									<th>�˼�����</th>
									<td><%=progrsVo.getComp_ymd() %></td>
								</tr>
							</table>
						</div>
					</li>
					<li id="title_12">
						<div id="title_12_div" style="height:37px">
						�ڻ����
						</div>
						<table class="sub_table">
							<colgroup>
								<col style="width:75px;">
								<col>
							</colgroup>
							<tr>
								<th>�ڻ�����</th>
								<td><%=progrsVo.getAss_chgr() %></td>
							</tr>
							<tr>
								<th>�ڻ��������</th>
								<td><%=progrsVo.getAss_ymd() %></td>
							</tr>
						</table>
					</li>
					<li id="title_13">
						<div id="title_13_div" style="height:37px">
						����
						</div>
						<table class="sub_table">
							<colgroup>
								<col style="width:75px;">
								<col>
							</colgroup>
							<tr>
								<th>���޽�û��ȣ</th>
								<td><%=progrsVo.getReq_no() %></td>
							</tr>
							<tr>
								<th>��뱸��</th>
								<td><%=progrsVo.getExpns_clsf() %></td>
							</tr>
							<tr>
								<th>���޽�û����</th>
								<td><%=progrsVo.getPay_req_ymd() %></td>
							</tr>
						</table>
					</li>
				</ul>
			</div>
		</div>
		<!-- //header -->
	</div>
</body>
</html>
