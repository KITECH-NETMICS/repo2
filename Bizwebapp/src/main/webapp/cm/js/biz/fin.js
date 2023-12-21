/**
 * 재무 공통 스코프
 */
biz.fin = {
	CONST : {
		  "EXPNS_CHK_SML" : "141,142,146,148,221,223"
		, "EXPNS_CHK_SML_EVID" : "141,142,144,146,148,177,221,222,223,224,228,241,251,321,322,323,327"
		, "EXPNS_CHK_EZBR" : "141,142,144,146,221,222,223,231,281,282,283,313,322,323,461"
		, "EXPNS_RES_EQUIP" : "262,322,431" // 연구장비통합관리
		, "CON_ACCNT_REG" : /(PA|PD|PG|PH|PX|PL|PQ)\d+/	
	}
};

/**
 * biz 객체에서 관리항목 셋팅을 위하여 호출
 *
 * @param row 관리항목 그리드에서 클릭한 행
 * @memberof biz.fin
 * @example biz.fin.setMngmtDetls(1)
 */
biz.fin.setMngmtDetls = function(mngmtItemCd, param, func){
	var data = {}
	// 출장신청번호
	if(mngmtItemCd == "2050"){
		switch(param.expns_cd){
			case "273" : data.flag = "LocalAdjst"; break;
			case "271" : data.flag = "DomRep"; break;
			case "272" : data.flag = "OverRep"; break;
			default : data.flag = "AllTrip"; break;
		}
	}
	
	switch (mngmtItemCd) {
		case "1001" :
		case "1300" :
			com.pop.open( com.pop.TYPE.HUM, "", function(ret){
				(func)(ret.syspayno, ret.nm);
			});					
			break;
		case "1002" :
		case "1020" : // 부서코드
			var cd = param.mngmt_detls_cd;
			if(cd != ""){
				if(com.isKorean(cd)) data.dept_nm = cd;
				else data.dept_cd = cd;
			}
			
			com.pop.open( com.pop.TYPE.DEPT, (param.mngmt_detls_cd != "")? data:"", function(ret){
				(func)(ret.dept_cd, ret.dept_nm);
			});	
			break;
		case "1003" : // 거래처코드
		case "3001" : // 거래처코드
			com.pop.open( com.pop.TYPE.VEND, {ref_yn:"Y"}, function(ret){
				(func)(ret.vend_cd, ret.vend_abbr);
			});	
			break;
		case "1005" : // 계좌번호
			com.pop.open( com.pop.TYPE.BNKAC, "", function(ret){
				(func)(ret.bankaccnt_no, "");
			});	
			break;
		case "1007" : // 카드번호
			biz.fin.pop.open(biz.fin.pop.TYPE.CARD, "", function(ret){
				(func)(ret.card_no, "");
			});	
			break;
		case "1200" :
		case "1201" :
		case "8005" : // 계정번호
			com.pop.open( com.pop.TYPE.ACNNO, "", function(ret){
				(func)(ret.accnt_no, ret.accnt_no_nm);
			});	
			break;
		case "1004" :
			biz.fin.setMngmtCommCd("FAA", func);
			break;
		case "6001" :
			biz.fin.setMngmtCommCd("FBB", func);
			break;
		case "6002" :
			biz.fin.setMngmtCommCd("FBC", func);
			break;
		case "6003" :
			biz.fin.setMngmtCommCd("FAO", func);
			break;
		case "6004" :
			biz.fin.setMngmtCommCd("FAM", func);
			break;
		case "6005" :
			biz.fin.setMngmtCommCd("FAJ", func);
			break;
		case "6006" :
			biz.fin.setMngmtCommCd("FAA", func);
			break;
		case "6010" :
			biz.fin.setMngmtCommCd("FBD", func);
			break;
		case "6011" :
			biz.fin.setMngmtCommCd("FAP", func);
			break;
		case "6020" :
			biz.fin.setMngmtCommCd("FAY", func);
			break;
		case "2051" : // 구매요청번호(117결의에서 사용하지 않음)
			break;
		case "2050" : // 출장신청번호
			data.req_no = param.mngmt_detls_cd;
			com.pop.open(com.pop.TYPE.TRIP, data, function(ret){
				(func)(ret.req_no, "");
			});
			break;
		case "1012" : // NFIS등록번호
			com.pop.open(com.pop.TYPE.ZEUS, {ref_yn:"Y"}, function(ret){
				(func)(ret.ntis_reg_no, "");
			});
			break;
		case "2091" : // 매출세금계산서번호
			biz.fin.pop.open(biz.fin.pop.TYPE.FTXBILL, {biz_clsf : "F", type : "110"}, function(ret){
				(func)(ret.tax_bill_no, "");
			});
			break;
		default :
			(func)("", "");
			break;
	}	
};


biz.fin.setMngmtCommCd = function(cdClsf, func) {
	com.openCmnCdPop(cdClsf, {
		srchWord : cdClsf,
		selectCallback : function(retObj) {
			(func)(retObj.values, retObj.labels);
		}
	});
};

/**
 * 재무시스템 팝업 객체
 * 팝업 종류 별 상수를 정의한다.
 */
biz.fin.pop = {
	TYPE : {
		   CARD	: { OPTION : { width: 950, height: 600, id: "cardPop", popupName: "카드 검색"},  URL : "/ui/fin/pop/FIN_POP_F201_03P.xml"}		
		 , ON_LINE : { OPTION : { width: 1000, height: 600, id: "accntCdPop", popupName: "온라인가수반제"},  URL : "/ui/fin/pop/FIN_POP_F203_05P.xml"}
		 , EVID_YMD_CHK : { OPTION : { width: 800, height: 400, id: "evidYmdChkPop", popupName: "증빙날짜오류"},  URL : "/ui/fin/pop/FIN_POP_F201_04P.xml"}
		 , RES_EQUIP_CHK : { OPTION : { width: 902, height: 495, id: "AssResEquipCheckPop", popupName: "연구장비 통합관리 확인요청"},  URL : "/ui/fin/pop/FIN_POP_F201_02P.xml"}
		 , EVID_BILL : { OPTION : { width: 650, height: 420, id: "billRegstPop", popupName: "거래증빙"},  URL : "/ui/fin/pop/FIN_POP_F201_01P.xml"} 
		 , EXPNS : { OPTION : { width: 950, height: 550, id: "expnsPop", popupName: "비용코드검색"},  URL : "/ui/fin/pop/FIN_POP_F203_01P.xml", SVRID : "SvcFINSPMPOPR05.pwkjson", RESULT : "expnsList"} 
		 , TRANS_SLIP : { OPTION : { width: 1000, height: 600, id: "trnasSlipPop", popupName: "결의내역대체처리"},  URL : "/ui/fin/pop/FIN_POP_F203_09P.xml"} 
		 , CTRL : { OPTION : { width: 1000, height: 580, id: "ctrlPop", popupName: "통제내역결의"},  URL : "/ui/fin/pop/FIN_POP_F203_03P.xml"} 
		 , BILL : { OPTION : { width: 900, height: 550, id: "billPop", popupName: "증빙내역조회"},  URL : "/ui/fin/pop/FIN_POP_F203_10P.xml"} 
		 , BOND : { OPTION : { width: 1000, height: 600, id: "bondPop", popupName: "채권미정산회계코드"},  URL : "/ui/fin/pop/FIN_POP_F203_04P.xml"}
		 , CARD_USE : { OPTION : { width: 1000, height: 580, id: "cardUsePop", popupName: "카드내역"},  URL : "/ui/fin/pop/FIN_POP_F203_06P.xml"}
		 , MEET_EVID : { OPTION : { width: 850, height: 580, id: "meetEvidPop", popupName: "회의증빙"},  URL : "/ui/fin/pop/FIN_POP_F201_06P.xml"}
		 , EDU : { OPTION : { width: 1000, height: 600, id: "eduEvidPop", popupName: "교육(학회/세미나)정보"},  URL : "/ui/fin/pop/FIN_POP_F201_08P.xml"}
		 , OVERTIME : { OPTION : { width: 850, height: 550, id: "overTimePop", popupName: "특근증빙정보"},  URL : "/ui/fin/pop/FIN_POP_F201_07P.xml"}
		 , PRO_PRUSE : { OPTION : { width: 1000, height: 550, id: "proPrusePop", popupName: "전문가활용정보"},  URL : "/ui/fin/pop/FIN_POP_F201_09P.xml"}		
		 , FTXBILL : { OPTION : { width: 1080, height: 600, id: "ftxBillPop", popupName: "매출세금계산서"},  URL : "/ui/fin/pop/FIN_POP_F203_11P.xml"}
		 , PRMSNT : { OPTION : { width: 1080, height: 550, id: "PrmsntPop", popupName: "어음번호팝업"},  URL : "/ui/fin/pop/FIN_POP_F203_08P.xml"}	
		 , SENDBILL : { OPTION : { width: 800, height: 400, id: "SendBillPop", popupName: "전자계산서 발송현황"},  URL : "/ui/fin/pop/FIN_POP_F805_01P.xml"}
		 , SMLITM_INSTL : { OPTION : { width: 500, height: 300, id: "FinChkPosiLstPop", popupName: "소액물품 최근설치지역"},  URL : "/ui/fin/pop/FIN_POP_F428_02P.xml"}
		 , ACCNT_NO_CONF : { OPTION : { width: 500, height: 300, id: "FinDomTripCheckAccntNo", popupName: "계정확인"},  URL : "/ui/fin/pop/FIN_POP_F450_01P.xml"}
		 , ASET_ITEM : { OPTION : { width: 750, height: 350, id: "FinPopF42803P", popupName: "연구실환경유지비 자산등재 대상 내역"},  URL : "/ui/fin/pop/FIN_POP_F428_03P.xml"}
		 , BILL_UNCONF : { OPTION : { width: 600, height: 700, id: "FinPopUnConfirmList", popupName: "미확인결의번호조회"},  URL : "/ui/fin/pop/FIN_POP_F812_01P.xml"}
		 , RETN_MAIL : { OPTION : { width: 1080, height: 600, id: "FinTaxBillErrorMailSelPop", popupName: "미확인계산서 반송이메일"},  URL : "/ui/fin/pop/FIN_POP_F813_01P.xml"}
		 , PSN_HIS : { OPTION : { width: 400, height: 350, id: "FinBillDetlsKwansSelHisPop", popupName: "매입계산서 담당자 변경 이력"},  URL : "/ui/fin/pop/FIN_POP_F813_02P.xml"}
		 , ETCINCOM_REG : { OPTION : { width: 800, height: 450, id: "FinEtcIncomRegPop", popupName: "기타소득등록"},  URL : "/ui/fin/tax/FIN_TAX_F825_00P.xml"}
		}
};

/**
 * 재무시스템 사용 팝업창을 호출한다.
 *
 * @param {String} clsf - 팝업창 호출 구분값(0 : 계정번호검색팝업)
 * @param {Object} 부모 창에서 전달한 데이터
 * @example
	var data={
		accnt_no : "PIZ21850"
		, clsf : "gen"    // 카드결의 일반
		, cls_yr : "2022" // 종료년도
	};
	biz.fin.pop.open(biz.fin.pop.TYPE.ON_LINE, data, function(ret){
		if(ret){
			ret
		}	
	});
 */
biz.fin.pop.open = function(type, data, func){
	com.openPopup( type.URL, type.OPTION, data, func);
};

