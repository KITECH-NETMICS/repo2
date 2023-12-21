/**
 * 출장관리 팝업 객체
 * 팝업 종류 별 상수를 정의한다.
 */
biz.ccs.pop = {
	TYPE : {
		PAY_INFO : { OPTION : { width: 600, height: 446, id: "payInfo", popupName: "교통비 안내" }, URL : "/ui/ccs/pop/CCS_POP_C304_01P.xml" }
	  ,	RCT_ACCNT : { OPTION : { width: 1000, height: 600, id: "recntAccnt", popupName: "출장신청 이용계정내역" }, URL : "/ui/ccs/pop/CCS_POP_C304_03P.xml" }
	  ,	TRIP_INFO : { OPTION : { width: 800, height: 450, id: "tripInfo", popupName: "출장현황" }, URL : "/ui/ccs/pop/CCS_POP_C304_04P.xml" }
	  ,	CAR_USE : { OPTION : { width: 1000, height: 450, id: "carUseReq", popupName: "차량배차신청" }, URL : "/ui/ccs/cgs/CCS_CGS_C20A_01P.xml" }
	  ,	APR_CHK : { OPTION : { width: 1000, height: 450, id: "aprCheckPop", popupName: "출장검증" }, URL : "/ui/ccs/pop/CCS_POP_C309_01P.xml" }
	  ,	VACA_EVID_CHK : { OPTION : { width: 1000, height: 420, id: "vacaEvidPop", popupName: "휴가원증빙" }, URL : "/ui/ccs/pop/CCS_POP_C21A_03P.xml" }
	  ,	VACA_CTNT : { OPTION : { width: 1000, height: 800, id: "vacaInfoPop", popupName: "개인휴가현황" }, URL : "/ui/ccs/pop/CCS_POP_C22A_01P.xml" }
	  ,	SICK_VAC : { OPTION : { width: 800, height: 600, id: "CvEvidFilePcsPop", popupName: "병가증빙파일미처리" }, URL : "/ui/ccs/pop/CCS_POP_C21A_04P.xml" }
	  ,	VACA_PSN : { OPTION : { width: 1080, height: 280, id: "openCgsSavePop", popupName: "개인연차조회" }, URL : "/ui/ccs/pop/CCS_POP_C21A_05P.xml" }
	  ,	CVN_RPT : { OPTION : { width: 800, height: 700, id: "CtrCvnListPop", popupName: "대외활동 신고현황" }, URL : "/ui/ccs/pop/CCS_POP_C680_02P.xml" }
	  ,	CVN_UPT_CAUSE : { OPTION : { width: 700, height: 300, id: "CtrCvnCausePop", popupName: "외부강의등 수정" }, URL : "/ui/ccs/pop/CCS_POP_C680_01P.xml" }
	  ,	CVN_MOD_HIS : { OPTION : { width: 1000, height: 400, id: "CvnModHisPop", popupName: "수정이력" }, URL : "/ui/ccs/pop/CCS_POP_C680_03P.xml" }
	  ,	LODG_EVID_INFO : { OPTION : { width: 600, height: 500, id: "LodgEvidInfoPop", popupName: "숙박증빙안내" }, URL : "/ui/ccs/pop/CCS_POP_C321_06P.xml" }
	  ,	AIR_MILE : { OPTION : { width: 900, height: 500, id: "AirMileUsePop", popupName: "항공마일리지신청번호검색" }, URL : "/ui/ccs/pop/CCS_POP_C321_05P.xml" }
	  ,	AIR_MILE_WRTE : { OPTION : { width: 1150, height: 850, id: "CtrAirMileMntPop", popupName: "항공마일리지신청(신고)서" }, URL : "/ui/ccs/ctr/CCS_CTR_C341_00D.xml" }
	  ,	SEAL_ASSU : { OPTION : { width: 750, height: 430, id: "CgsSealAssuReg", popupName: "사용(직인/인감)인수증" }, URL : "/ui/ccs/pop/CCS_POP_C202_00P.xml" }
	  ,	CGCD_UPT : { OPTION : { width: 1300, height: 400, id: "CwlCgCdInfoUptPop", popupName: "경조내역수정" }, URL : "/ui/ccs/cwl/CCS_CWL_C271_00P.xml" }
	  ,	LOAN_INFO : { OPTION : { width: 850, height: 400, id: "CwlLoanPop", popupName: "대출내역조회" }, URL : "/ui/ccs/pop/CCS_POP_C276_00P.xml" }
	  ,	CONDO_USE_INFO : { OPTION : { width: 650, height: 450, id: "CgsCondoUseInfoPop", popupName: "콘도이용안내" }, URL : "/ui/ccs/pop/CCS_POP_C21D_01P.xml" }
	  ,	FAMY_INFO_UNIV : { OPTION : { width: 650, height: 450, id: "CwlFamyInfoUnivPop", popupName: "부양가족찾기" }, URL : "/ui/ccs/pop/CCS_POP_C25A_01P.xml" }
	  , CVN_NOTI : { OPTION : { width: 1080, height: 680, id: "CcsCtrC68004Pop", popupName: "대회활동유형별 공지"},  URL : "/ui/ccs/pop/CCS_POP_C680_04P.xml"}
	}
};


/**
 * 출장관리 사용 팝업창을 호출한다.
 *
 * @param {String} clsf - 팝업창 호출 구분값(0 : 계정번호검색팝업)
 * @param {Object} 부모 창에서 전달한 데이터
 * @example
	let data = {
		req_no : "TEST"
	};
	biz.ccs.pop.open(biz.ccs.pop.TYPE.TEST, data, function(ret){
		if(ret){
			console.log(ret);
		}
	});
 */
biz.ccs.pop.open = function(type, data, func) {
	com.openPopup(type.URL, type.OPTION, data, func);
};

/** 
 * Textarea 의 사이즈를 표시해야 할 경우 사이즈를 동적으로 변경할 수 있게 한다. 
 * TextBox 의 id를 (Teaxtarea 컴포넌트의 id)_size 로 설정해야 합니다.
 * @param {Object} target Textarea 의 이벤트 객체
 * @param {String} maxSize 최대 사이즈
 */

biz.ccs.setSizeLabel = function(target, maxSize) {
	var nBytes = target.value.split("").reduce(function(sumBytes, aChar) {
		return sumBytes + (escape(aChar).indexOf("%u") == -1 ? 1 : 3);
	}, 0);
	var sizeCpnt = com.getComponent(target.id + '_size');
	
	sizeCpnt.setValue(nBytes + " / " + maxSize +  " byte(s)");
	if (nBytes > maxSize) {
		sizeCpnt.changeClass("valid", "invalid");
		return false;
	} else {
		sizeCpnt.changeClass("invalid", "valid");
		return true;
	}
};

/** 
 * 국내출장 신청 또는 정산시 과제참여 여부 체크제외
 */
biz.ccs.exceptAccntMember = function(accntNo, expnsCd){
	if(accntNo.substring(0,3) == "PJF" || (accntNo == "PJC23012" && expnsCd == "394")){
		return true; // 과제참여여부 체크 제외
	}else{		
		return false;
	}
};