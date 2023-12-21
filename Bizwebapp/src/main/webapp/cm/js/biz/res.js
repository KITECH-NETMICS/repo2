/**
 * 연구관리 팝업 객체
 * 팝업 종류 별 상수를 정의한다.
 * REG_RPTP : { OPTION : { width: 1200, height: 600, id: "regRptp", popupName: "연구보고서 기본정보 등록" }, URL : "/ui/kbk/pop/KBK_POP_K600_02P.xml" } 예시
 */
biz.res.pop = {
	TYPE : {
		SEL_BSNS : { OPTION : { width: 1000, height: 550, id: "selBsnsCd", popupName: "사업분류코드 검색" }, URL : "/ui/res/com/RES_COM_01P.xml" },
		SEL_ATTENCE : { OPTION : { width: 1000, height: 550, id: "selAttence", popupName: "과제참여요청 검색" }, URL : "/ui/res/pop/RES_APP_RB42_05P.xml" },
		APC_CMT : { OPTION : { width: 900, height: 650, id: "apcCommit", popupName: "선정평가위원회" }, URL : "/ui/res/pop/RES_APP_RB42_06P.xml" },
		THREE_FIVE : { OPTION : { width: 1200, height: 550, id: "threeFivePopup", popupName: "사업조정 제외기준" }, URL : "/ui/res/pop/RES_APP_RB42_09P.xml" },
		SECU_GRD : { OPTION : { width: 800, height: 380, id: "threeFivePopup", popupName: "보안등급분류및심사기준" }, URL : "/ui/res/pop/RES_APP_RB42_02P.xml" },
		BSNS_ADJST : { OPTION : { width: 1200, height: 550, id: "ResBsnsAdjstConfPop", popupName: "사업조정회의조회" }, URL : "/ui/res/pop/RES_APP_RB42_04P.xml" },
		SEL_ACCNT : { OPTION : { width: 900, height: 540, id: "popupAppFormList", popupName: "집행예산선택" }, URL : "/ui/res/pop/RES_EXC_RF51_01P.xml" },
		CHGN_RESN : { OPTION : { width: 680, height: 417, id: "ResTechAgReg", popupName: "실행예산 변경사유 조회" }, URL : "/ui/res/pop/RES_EXC_RF51_02P.xml" },
		OVE_MONEY : { OPTION : { width: 680, height: 560, id: "ResPrjAgrBudgetMntSel", popupName: "통합이지바로RCMS이월연구비정보" }, URL : "/ui/res/pop/RES_EXA_R492_00P.xml" },		
	}
};

biz.res.pop.test = function() {
	console.log("HI!!");
}

/**
 * 연구 공통 스코프
 */

biz.res.com = {}

/**
 * 관계부처, 사업분류, 사업소분류의 SelectBox를 설정합니다.
 * @param {Object} scwin
 * @param {Object} data
 * @param {Object} data.oficComp 관계부처 SelectBox Component 
 * @param {Object} data.bsnsComp 사업분류 SelectBox Component
 * @param {Object} data.detlsComp 사업소분류 SelectBox Component
 * @param {Function} callback 콜백 함수
 * @example
  	data = {
  		oficComp : sbx_bsns_cd_ofic,
  		bsnsComp : sbx_bsns_cd_bsns,
  		detlsComp : sbx_bsns_cd_detls_bsns,
  		oficCd : "038000000",
  		bsnsCd : "038001000",
  		detlsCd : "038001001",
  	}
  	
	biz.res.com.setBsnsCd(data, function() { ... });
 */
biz.res.com.setBsnsCd = function(scopeScwin, data, callback) {
	var scopeBsnsObj = scopeScwin.$w.getFrame().scope.com.res.bsnsCd;
	if (com.isEmpty(data) && typeof data != 'object') {
		com.warn("data parameter error!!!");
		return;
	}
	if (com.isEmpty(data['oficComp']) || com.isEmpty(data['bsnsComp']) || com.isEmpty(data['detlsComp'])) {
		com.warn("data parameter error!!!");
		return;
	}
	
	if (scopeBsnsObj.isSet) {
		if (!com.isEmpty(data['oficCd'])) {
			scopeBsnsObj['oficComp'].setValue(data['oficCd']);
			scopeBsnsObj.dlt_depth2.setJSON(scopeBsnsObj.dlt_orgBsns.getMatchedJSON("bsns_grp_cd", data['oficCd'], true), false);
		}
		
		if (!com.isEmpty(data['bsnsCd'])) {
			scopeBsnsObj['bsnsComp'].setValue(data['bsnsCd']);
			scopeBsnsObj.dlt_depth3.setJSON(scopeBsnsObj.dlt_orgDetls.getMatchedJSON("bsns_grp_cd", data['bsnsCd'], true), false);
		}
		
		if (!com.isEmpty(data['detlsCd'])) {
			scopeBsnsObj['detlsComp'].setValue(data['detlsCd']);
		}
		return;
	}
	
	biz.res.com.init(scopeScwin, data);

	try {
		var scwinPrefix = scopeScwin.$w.id;
		var target = 'data:json,[{"id": "' + scwinPrefix + 'dlt_orgOfic","key":"depth1Vo"},' +
					 '{"id": "' + scwinPrefix + 'dlt_orgBsns","key":"depth2Vo"},' +
					 '{"id": "' + scwinPrefix + 'dlt_orgDetls","key":"depth3Vo"}]';
		com.executeDynamic( {
			id : "sbm_getBsnsCd", 
			action : "SvcRESCOMRBAR01.pwkjson", 
			"target" : target
		},
		{
			requestData: {},
			compObj: [data['oficComp'], data['bsnsComp'], data['detlsComp']],
			successCallback: function(e) {
				scopeBsnsObj.oficComp.setNodeSet("data:dlt_orgOfic", "bsns_nm", "bsns_cd");
				scopeBsnsObj.oficComp.bind("onviewchange", biz.res.com.bsns_cd_ofic_onviewchange);
				
				scopeBsnsObj.bsnsComp.setNodeSet("data:dlt_depth2", "bsns_nm", "bsns_cd");
				scopeBsnsObj.bsnsComp.bind("onviewchange", biz.res.com.bsns_cd_bsns_onviewchange);
				
				scopeBsnsObj.detlsComp.setNodeSet("data:dlt_depth3", "bsns_nm", "bsns_cd");
				if (!com.isEmpty(scopeBsnsObj['oficCd'])) {
					scopeBsnsObj['oficComp'].setValue(scopeBsnsObj['oficCd']);
					scopeBsnsObj.dlt_depth2.setJSON(scopeBsnsObj.dlt_orgBsns.getMatchedJSON("bsns_grp_cd", scopeBsnsObj['oficCd'], true), false);
				}
				
				if (!com.isEmpty(scopeBsnsObj['bsnsCd'])) {
					scopeBsnsObj['bsnsComp'].setValue(scopeBsnsObj['bsnsCd']);
					scopeBsnsObj.dlt_depth3.setJSON(scopeBsnsObj.dlt_orgDetls.getMatchedJSON("bsns_grp_cd", scopeBsnsObj['bsnsCd'], true), false);
				}
				
				if (!com.isEmpty(scopeBsnsObj['detlsCd'])) {
					scopeBsnsObj['detlsComp'].setValue(scopeBsnsObj['detlsCd']);
				}
				
				if (callback && typeof callback == "function") {
					(callback)();
				}
			},
		});
	} catch (e) {
		console.error("[biz.res.com.setBsnsCd] Exception :: " + e);
	}
};

biz.res.com.init = function(scopeScwin, data) {
	var scopeBsnsObj = scopeScwin.$w.getFrame().scope.com.res.bsnsCd;
	var dataObjChild = ['oficComp', 'bsnsComp', 'detlsComp', 'oficCd', 'bsnsCd', 'detlsCd'];
	
	dataObjChild.forEach( function(name) {
		scopeBsnsObj[name] = data[name];
	});
	
	var dltObjChild = ['dlt_orgOfic', 'dlt_orgBsns', 'dlt_orgDetls', 'dlt_depth2', 'dlt_depth3'];
	
	dltObjChild.forEach( function(name) {
		if (name === 'dlt_orgOfic')
			scopeBsnsObj[name] = gcm.data.createDataList(scopeScwin, name, ["bsns_cd", "bsns_nm"] , ["text", "text"]);
		else 
			scopeBsnsObj[name] = gcm.data.createDataList(scopeScwin, name, ["bsns_cd", "bsns_nm", "bsns_grp_cd"] , ["text", "text", "text"]);
	});
	
	scopeBsnsObj.isSet = true;
}

biz.res.com.bsns_cd_ofic_onviewchange = function(info) {
	var scopeBsnsObj = this.getScope().scope.com.res.bsnsCd;
	
	scopeBsnsObj.dlt_depth2.removeAll();
	scopeBsnsObj.dlt_depth3.removeAll();
	
	var data = scopeBsnsObj.dlt_orgBsns.getMatchedJSON("bsns_grp_cd", this.getValue(), true);
	
	scopeBsnsObj.dlt_depth2.setJSON(data, false);
	scopeBsnsObj.dlt_depth2.reform();
};

biz.res.com.bsns_cd_bsns_onviewchange = function(info) {
	var scopeBsnsObj = this.getScope().scope.com.res.bsnsCd;
	var data = scopeBsnsObj.dlt_orgDetls.getMatchedJSON("bsns_grp_cd", this.getValue(), true);
	scopeBsnsObj.dlt_depth3.setJSON(data, false);
	scopeBsnsObj.dlt_depth3.reform();
};

/**
 * 연구관리 사용 팝업창을 호출한다.
 *
 * @param {String} clsf - 팝업창 호출 구분값(0 : 계정번호검색팝업)
 * @param {Object} 부모 창에서 전달한 데이터
 * @example

 */
biz.res.pop.open = function(type, data, func) {
	com.openPopup(type.URL, type.OPTION, data, func);
};

biz.res.com.selectAppIndrc = function(ymd) {
	com.executeDynamic( {
		id : "sbm_selectAppIndrc", 
		action : "SvcRESCOMRBAR03.pwkjson", 
	},
	{
		requestData: {"ymd" : ymd},
		successCallback: function(e) {
			
		},
	});
};

/**
 * 간접비 기준율 구하기
 *
 * @param bsnsCdInout 내외구분, bsnsCdOfic 관계부처, ymd 현단계 연구기간 시작일자
 * @ return 간접비율
 */
biz.res.getIndrcRt = function(bsnsCdInout, bsnsCdOfic, ymd){
	if(ymd == undefined || ymd ==""){
		alert("현단계 연구기간 시작일자가 존재하지 않습니다.");
		return;
	}
	
	if(bsnsCdInout == undefined || bsnsCdInout ==""){
		alert("내외구분이 존재하지 않습니다.");
		return;
	}
	
	if(bsnsCdOfic == undefined || bsnsCdOfic ==""){
		alert("관계부처가 존재하지 않습니다.");
		return;
	}
	
	if(bsnsCdInout == "RHA001"){ // 정부수탁		
		if(ymd >= "20191231" && ymd <= "20211231"){
			return 13.31;
		}else if(ymd >= "20220101" && ymd <= "20221220"){
			return 15.48;
		}else if(ymd >= "20221221"){
			return 13.65;
		}else if(ymd >= "20171229" && ymd <= "20191230"){
			return 14.7;
		}
	}else if(bsnsCdInout == "RHA003"){ // 민간수탁
		if(bsnsCdOfic == "014000000"){  // 민간기업
			return 20.00;
		}else if(bsnsCdOfic == "034000000"){ // 공공기관
			return 15.00;
		}else if(bsnsCdOfic == "020000000"){ // 공공기관
			return 5.00;
		}
	}else{
		return 0;
	}
};