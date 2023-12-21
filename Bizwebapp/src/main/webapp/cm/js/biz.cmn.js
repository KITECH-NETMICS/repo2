/**
 * 업무용 공통 js
 * - 개발 편의를 위해 업무팀별로 별도의 파일로 관리 (ex. 상품팀 biz.prd.js, 주문팀 biz.ord.js, 배송팀 biz.dlv.js)
 * - 함수 namespace는 파일명을 따름 (ex. 상품팀의 경우 com.prd.함수명, biz.prd.함수명)
 * 담당자 : 홍길동
 */

/**
 * 통합검색 패키지
 */
com.search = {};



/**
 * 통합검색을 처리한다.
 * 
 * @param {String} index
 * @param {String} query
 * @param {Function} func
 * @return {Array} 키문자 배열 
 * @example
	com.search.execute('CTR_OVER_TASK', '이민기', function(data) {
		console.log(data);	// ['C75202200035', 'C75202200036', 'C75202200042']
		debugger;			
	})
 */
com.search.execute = function(index, query, func) {
	
	// 파라미터 유효성 검증
	if (!index || !query) {
		alert("검색인덱스와 검색어는 필수 항목입니다!!");
		return;
	}

	// 검색 API 호출
	com.executeDynamic({id : "sbm_send", action : "SvcSearchProten.pwkjson"}, {
		requestData: {
			index: index,
			query: query
		}, 
		processMsg: com.getMsg('message.xom.co.com.progress.send') /* 전송중 입니다...*/,
		successCallback: function(e) {
			// 결과 처리
			try {
				(func)((e.responseJSON.elData.ids||'').split(/,/));
			} catch(e) {
				alert("통합검색 오류 발생: " + e.message);
			}
		}
	});
};


/**
 * 메일을 전송한다.
 * 
 * @param {Object} reqData
 * @param (Function} callback
 */
com.mail = {};
com.mail.sendMessage = function(reqData, callback) {
	try {
		com.executeDynamic({id : "sbm_send", action : "SvcSendMail.pwkjson"}, {
			requestData: reqData, 
			processMsg: com.getMsg('message.xom.co.com.progress.send') /* 전송중 입니다...*/,
			successCallback: callback,			
		});
	} catch (e) {
		console.error("[com.mail.sendMessage] Exception :: " + e);
	}
};


/**
 * 메시지를 전송한다.
 * 
 * @param {Object} reqData
 * @param (Function} callback
 */
com.msg = {};
com.msg.sendMessage = function(reqData, callback) {
	try {
		com.executeDynamic({id : "sbm_send", action : "SvcSendMessage.pwkjson"}, {
			requestData: reqData, 
			processMsg: com.getMsg('message.xom.co.com.progress.send') /* 전송중 입니다...*/,
			successCallback: callback,			
		});
	} catch (e) {
		console.error("[com.msg.sendMessage] Exception :: " + e);
	}
};


/**
 * 공통 팝업 객체
 * 팝업 종류 별 상수를 정의한다.
 */
com.pop = {
	TYPE : {
		  ACNNO	: { OPTION : { width: 1000, height: 550, id: "accntNoPop", popupName: "계정번호 검색"}, URL : "/ui/com/pop/COM_Z001_00P.xml", SVRID : "SvcAccntNoPopupList.pwkjson", RESULT : "accntNoPopupVoList"}  
		, HUM	: { OPTION : { width: 950, height: 860, id: "humUserPop", popupName: "사용자 검색"},  URL : "/ui/com/pop/COM_Z002_00P.xml", SVRID : "SvcHumComUserSelList.pwkjson", RESULT : "humComUserSelVoList"}
		, PRJNO	: { OPTION : { width: 950, height: 800, id: "projectPop", popupName: "과제정보 검색"}, URL : "/ui/com/pop/COM_Z003_00P.xml", SVRID : "SvcPrjNoPopupList.pwkjson", RESULT : "prjNoPopupVoList"}
		, DEPT	: { OPTION : { width: 600, height: 700, id: "dptInfoPop", popupName: "부서정보 검색"}, URL : "/ui/com/pop/COM_Z004_00P.xml", SVRID : "SvcCodhDeptInfoList.pwkjson", RESULT : "deptInfoVoList"}
		, VEND	: { OPTION : { width: 850, height: 600, id: "vendInfoPop", popupName: "업체정보 검색"}, URL : "/ui/com/pop/COM_Z005_00P.xml", SVRID : "SvcXodfVendListView.pwkjson", RESULT : "dataListVo"}
		, ADDR	: { OPTION : { width: 850, height: 600, id: "addressPop", popupName: "주소정보 검색"}, URL : "/ui/com/pop/COM_Z006_00P.xml", SVRID : "", RESULT : ""}
		, EXPNS	: { OPTION : { width: 850, height: 600, id: "expnsCdPop", popupName: "비용코드 검색"}, URL : "/ui/com/pop/COM_Z007_00P.xml", SVRID : "SvcFinComExpnsList.pwkjson", RESULT : "fbaItmExpnsVoList"}
		, BUGT	: { OPTION : { width: 1000, height: 600, id: "bblBugtPop", popupName: "예실현황 검색"}, URL : "/ui/com/pop/COM_Z008_00P.xml", SVRID : "SvcBblBugtListView.pwkjson", RESULT : "bblBugtActRsltVoList"}
		, ACNCD	: { OPTION : { width: 550, height: 520, id: "accntCdPop", popupName: "회계코드 검색"}, URL : "/ui/com/pop/COM_Z009_00P.xml", SVRID : "SvcAccntCdListView.pwkjson", RESULT : "accntCdPopupVoList"}
		, BNKAC	: { OPTION : { width: 850, height: 520, id: "bankAccntPop", popupName: "계좌번호 검색"}, URL : "/ui/com/pop/COM_Z010_00P.xml", SVRID : "SvcCOMPOPR01.pwkjson", RESULT : "accntList"}
		, DEPST	: { OPTION : { width: 1000, height: 520, id: "fibkHisPop", popupName: "입금조회 검색"}, URL : "/ui/com/pop/COM_Z011_00P.xml", SVRID : "SvcFibkAccntHisListView.pwkjson", RESULT : "dataListVo"}
		, DOCID	: { OPTION : { width: 700, height: 520, id: "scrnIdPop", popupName: "서비스화면 검색"}, URL : "/ui/com/pop/COM_Z015_00P.xml", SVRID : "SvcXomxMenuList.pwkjson", RESULT : "dataListVo"}
		, CONFPOOL	: { OPTION : { width: 1200, height: 700, id: "ResConfPoolReq", popupName: "학술대회 증빙"}, URL : "/ui/com/pop/COM_F203_11P.xml", SVRID : "SvcCOMPOPR02.pwkjson"}
		, TAXBILL : { OPTION : { width: 1000, height: 860, id: "billPop", popupName: "전자세금계산서"},  URL : "/ui/com/pop/COM_F203_02P.xml"}
		, TRIP: { OPTION : { width: 1000, height: 550, id: "tripReqPop", popupName: "출장신청번호 검색"}, URL : "/ui/ccs/pop/CCS_POP_C309_00P.xml"}
		, CUST: { OPTION : { width: 1000, height: 550, id: "custInfoPop", popupName: "기업지원고객정보 검색"}, URL : "/ui/com/pop/COM_Z012_00P.xml", SVRID : "SvcSptCtiCunslListView.pwkjson", RESULT : "dataListVo"}
		, POST_APR: { OPTION : { width: 850, height: 400, id: "postAprPop", popupName: "사후결재"}, URL : "/ui/com/pop/COM_Z016_01P.xml"}
		, ATTACH: { OPTION : { width: 800, height: 300, id: "attachPop", popupName: "첨부파일 다운로드"}, URL : "/ui/com/pop/COM_Z017_00P.xml", SVRID : "", RESULT : ""}
		, MEET : { OPTION : { width: 1000, height: 550, id: "MeepPop", popupName: "회의록"},  URL : "/ui/fin/pop/FIN_POP_F244_01P.xml"}
		, RVN_BILL : { OPTION : { width: 1080, height: 940, id: "TaxBillPop", popupName: "계산서발행"},  URL : "/ui/fin/tax/FIN_TAX_F805_01P.xml"}
		, DOMTRIP_AD : { OPTION : { width: 1000, height: 550, id: "DomTripAdPop", popupName: "국내출장정산번호 검색"},  URL : "/ui/ccs/pop/CCS_POP_C322_00P.xml"}
		, ZEUS : { OPTION : { width: 950, height: 550, id: "zeusEquipPop", popupName: "ZEUS장비검색"},  URL : "/ui/fin/pop/FIN_POP_F201_05P.xml"} 
		, RES_EQUIP : { OPTION : { width: 800, height:450, id: "ResComEquipSel", popupName: "연구기자재검색"},  URL : "/ui/com/pop/COM_Z020_00P.xml"}
		, RES_CODE : { OPTION : { width: 1000, height:500, id: "ResCodeItemSel", popupName: "코드검색"},  URL : "/ui/res/com/RES_COM_02P.xml"} 
		, RETRN_OPN : { OPTION : { width: 600, height:250, id: "APR02P", popupName: "반려의견"},  URL : "/ui/apr/APR_C001_03P.xml"} 
		, VIEW_APR : { OPTION : { width: 1350, height:1480, id: "snapshotPop", popupName: "결재문서"},  URL : "/ui/apr/layoutSimple.xml"}
		, PRE_SAFE : { OPTION : { width: 650, height:450, id: "SafeDodfprPopupSe", popupName: "사전안전성검토검색"},  URL : "/ui/com/pop/COM_Z021_00P.xml"}
		, EXPNS_LIST : { OPTION : { width: 750, height: 450, id: "EpuChkRegAssetHelpPop", popupName: "자산등재대상"},  URL : "/ui/fin/pop/FIN_POP_F428_01P.xml"}
		, SVR_LIST : { OPTION : { width: 750, height: 650, id: "schSvrListPop", popupName: "화면 목록 조회"},  URL : "/ui/com/pop/COM_Z022_00P.xml", SVRID : "SvcCOMPOPR08.pwkjson", RESULT : "serviceVoList"}
		, FTXBILL : { OPTION : { width: 1080, height: 600, id: "ftxBillPop", popupName: "매출세금계산서"},  URL : "/ui/fin/pop/FIN_POP_F203_11P.xml"}
		, DEPST_REQ : { OPTION : { width: 1080, height: 650, id: "FinDepstReqMnt3", popupName: "예금입금의뢰등록"},  URL : "/ui/res/exc/RES_EXC_F739_01P.xml"}
		, FTXBILL_UPD : { OPTION : { width: 1080, height: 650, id: "F81501P", popupName: "국세청발행계산서수정"},  URL : "/ui/fin/pop/FIN_POP_F815_01P.xml"}
		, ITM_BASE : { OPTION : { width: 1080, height: 550, id: "itmSolvePop", popupName: "비목해소기준 검색"},  URL : "/ui/com/pop/COM_Z023_00P.xml", SVRID : "SvcCOMPOPR09.pwkjson", RESULT : "fbaItmBaseVoList"}
		, ASET	: { OPTION : { width: 1080, height:620, id: "AssPopComPop", popupName: "자산정보 검색"},  URL : "/ui/ass/pop/ASS_POP_COM_01P.xml"}
		, EVID_BILL : { OPTION : { width: 650, height: 420, id: "billRegstPop", popupName: "거래증빙"},  URL : "/ui/fin/pop/FIN_POP_F201_01P.xml"} 
		, BILL : { OPTION : { width: 900, height: 550, id: "KtxBillPop", popupName: "증빙내역조회"},  URL : "/ui/fin/pop/FIN_POP_F203_10P.xml"} 
		},
};


/**
 * 공통 팝업창을 호출한다.
 *
 * @param {String} clsf - 팝업창 호출 구분값(0 : 계정번호검색팝업)
 * @param {Object} 부모 창에서 전달한 데이터
 * @example
	var data={
		accnt_no : "PIZ21850"
		, clsf : "gen"    // 카드결의 일반
		, cls_yr : "2022" // 종료년도
	};
	com.pop.open( com.pop.TYPE.ACCNT, data, function(ret){
		if(ret){
			ret
			
		}	
	});
 */
com.pop.open = async function(type, data, func){
	try {
		if (type === com.pop.TYPE.ACNNO && /[ㄱ-힣]/.test(data.accnt_no)) {
			data.rspns_nm = data.accnt_no;
			data.accnt_no = "";
		}
		if (type === com.pop.TYPE.ATTACH) {
			if (data && data.isEvid) {
				var tmpType = JSON.parse(JSON.stringify(type));
				tmpType.OPTION.popupName = "증빙파일 다운로드";
				type = tmpType;
			}
		}
		
		if (!data || data.ref_yn == "Y" || com.isEmpty(type.SVRID)) { // data가 없거나 참조용일 경우 바로 팝업 호출
			return await com.openPopup( type.URL, type.OPTION, data, func);
		} else {
			// 데이터가 빈값이면 바로 팝업 호출
			for (var key in data) {
				if (!data[key]) {
					return await com.openPopup( type.URL, type.OPTION, data, func);
				}
			}
		}
		
		let ret = await com.executeDynamic({id : "sbm_send", action : type.SVRID}, { requestData: data });
		// 결과값이 한개일 경우 바로 화면으로 세팅
		if ((ret.responseJSON.elData 
				&& (ret.responseJSON.elData.totalCount == 1 
				|| ret.responseJSON.elData[type.RESULT].length == 1))				
				|| ret.responseJSON[type.RESULT]?.length == 1) {
			if (func && typeof func === "function") {
				if (ret.responseJSON.elData){
					(func)(ret.responseJSON.elData[type.RESULT][0]);					
				} else {
					(func)(ret.responseJSON[type.RESULT][0]);
				}
			} else {			
				return (ret.responseJSON.elData)?ret.responseJSON.elData[type.RESULT][0]:ret.responseJSON[type.RESULT][0];
			}
		} else {
			return await com.openPopup( type.URL, type.OPTION, data, func);
		}

	} catch (e) {
		console.error("[com.pop.open] Exception :: " + e);
	}
};


/**
 * com 객체는 업무화면에서 직접 사용하는 함수로, scope별로 복제되며, biz 객체의 대응 함수를 호출하도록 구현한다.
 * scope정보를 biz객체에 전달할 때는 scwin 객체를 파라미터로 전달하거나, 컴포넌트의 rendering id를 전달하여 함수를 호출한 scope을 파악한다.
 */
com.cmn = {};

/**
 * biz 객체는 전역 객체로 com 객체에서 사용하는 함수의 실제 구현은 이곳에서 한다.
 * 업무화면에서 직접 biz 함수 사용은 하지 않도록 한다.
 * 반드시 try catch 문으로 감싸준다.
 */
biz.cmn = {};
biz.fin = {};	// 재무관리
biz.ccs = {};	// 총무보안
biz.bpm = {};	// BPM
biz.bud = {};	// 예산관리
biz.epu = {};	// 구매조달
biz.pat = {};	// 지식재산권
biz.res = {};	// 연구관리
biz.sup = {};	// 기업지원
biz.kbk = {};	// 도서관리
biz.apr = {};	// 전자결재
biz.ass = {};	// 자산관리

biz.hum = {};	// 인사관리
biz.saf = {};	// 안전관리
biz.lpl = {};	// 기획협력


/**
 * biz 객체에서 com 함수를 호출한 Scope을 파악하는 방법을 안내하기 위한 테스트 함수
 *
 * @param {String} compId 컴포넌트의 rendering id (컴포넌트의 getID()함수 결과, 컴포넌트의 original id가 아님에 유의)
 * @param {Object} compObj 컴포넌트 객체
 * @memberof com.cmn
 * @example
	com.cmn.test(btn_select.getID(), btn_select);
 */
com.cmn.test = function(compId, compObj) {
	return biz.cmn.test(scwin, compId, compObj);
};

/**
 * biz 객체에서 com 함수를 호출한 Scope을 파악하는 방법을 안내하기 위한 테스트 함수
 *
 * @param {Object} scopeScwin 함수를 호출한 Scope의 scwin 객체
 * @param {String} compId 컴포넌트의 rendering id (컴포넌트의 getID()함수 결과, 컴포넌트의 original id가 아님에 유의)
 * @param {Object} compObj 컴포넌트 객체
 * @memberof biz.cmn
 */
biz.cmn.test = function(scopeScwin, compObj, compId) {
	try {
		// 아래 3개는 모두 같은 scope의 scwin객체임.
		console.log(scopeScwin);
		console.log(compObj.getScopeWindow().scwin);
		console.log($w.getComponentById(compId).getScopeWindow().scwin);
	} catch (e) {
		console.error("[biz.cmn.test] Exception :: " + e);
	}
};


com.biz = {};

/**
 * 수정 가능 상태 판별
 * apr_state : "XDA005" ... 결재 상태 코드
 */
com.biz.isAllow = function(apr_state) {
	// TODO: 공통 코드를 활용하는 방법 필요.
	var isEngNum = /^[A-Za-z0-9]+$/;
	var isKorean = /^[가-힣\s]+$/;  // 띄어쓰기를 포함 한글
	
	var allowAprStateCodes = gcm.cmnCdCache.dlt_cmnCd_XAD.filter(function(xad) {
		if (xad.mngmtItem8 === 'Y') return true;
		return false;
	});
	return allowAprStateCodes.some(function(xad) {
		if (isEngNum.test(apr_state)) {
		    // 영문+숫자 조합일 때의 처리
			return (xad.comCd === apr_state);
		} else if (isKorean.test(apr_state)) {
		    // 한글만 포함될 때의 처리
			return (xad.comNm === apr_state);
		} else {
		    // 그 외의 경우 처리
			return (xad.comCd === apr_state);
		}
	});
};

/**
 * 현재 결재 상태에 따라 버튼의 활성화 유무 컨트롤
 * apr_state : 결재상태 코드
 * req_no : 신청번호
 */
com.biz.disabledButtons = function(apr_state, req_no) {
	try {
		if (typeof btn_del !== 'undefined') {
			btn_del.setDisabled(!com.biz.isAllowDelete(apr_state));
		}
		if (typeof btn_apr !== 'undefined') {
			btn_apr.setDisabled(!com.biz.isAllowApproval(apr_state, req_no));
		}
		if (typeof btn_save !== 'undefined') {
			btn_save.setDisabled(!com.biz.isAllowModify(apr_state));
		}		
		if (typeof btn_upd !== 'undefined') {
			btn_upd.setDisabled(!com.biz.isAllowModify(apr_state));
		}
	}
	catch(e) {
		console.error("[com.biz.disabledButtons] Exception :: " + e);
	}
}

/**
 * 수정 가능 상태 판별
 * apr_state : "XDA005" ... 결재 상태 코드 
 */
com.biz.isAllowModify = function(apr_state){
	if (apr_state === undefined || apr_state === '') return true;
	return com.biz.isAllow(apr_state);
};
/**
 * 삭제 가능 상태 판별
 * apr_state : "XDA005" ... 결재 상태 코드
 */
com.biz.isAllowDelete = function(apr_state){
	if (apr_state === undefined || apr_state === '') return false;
	return com.biz.isAllow(apr_state);
};

/**
 * 전자결재 신청 가능 상태 판별 (신청번호가 있고 전자결재가 수정 가능 상태면)
 * apr_state : "XDA005" ... 결재 상태 코드
 * req_no : 신청번호
 */
com.biz.isAllowApproval = function(apr_state, req_no){
	return (undefined !== req_no && '' !== req_no && com.biz.isAllowModify(apr_state));
};

/**
 * 예산편성 체크 (gfnBugtRamtChk, gfnBugtRamtChk2)
 * var data ={bugt_yr:"2022", accnt_no:"PIZ21850", accnt_cd : "51125100", relat_no:""}
 */
com.biz.checkBugtRamt = function(data, func){
	try{
		com.executeDynamic({id : "sbm_execute", action : "SvcFINCOMCHKR02.pwkjson"}, {
			requestData: data, 
			processMsg : "",
			successCallback: function (ret) {	
				(func)(ret.responseJSON.elData);
			}	
		});
	}catch (e) {
		console.error("[com.fin.bugtChk] Exception :: " + e);
	}
	
};

/**
 * 예산편성 체크 (gfnBugtChk, gfnBugtEtcChk)
 * var data ={bugt_yr:"2022", accnt_no:"PIZ21850", accnt_cd : "51125100", relat_no:""}
 */
com.biz.gfnBugtEtcChk = function(data, func){
	try{
		com.executeDynamic({id : "sbm_execute", action : "SvcFINCOMBUGR02.pwkjson"}, {
			requestData: data, 
			processMsg : "",
			successCallback: function (ret) {	
				(func)(ret.responseJSON.elData);
			}	
		});
	}catch (e) {
		console.error("[com.fin.bugtChk] Exception :: " + e);
	}
	
};

/**
 * 예산통제자, 자동통제유무조회 (gfnAccntBugtPsn)
 * var data ={req_no:"1102270001"}
 */
com.biz.getAccntBugtPsn = function(data, func){
	try{
		com.executeDynamic({id : "sbm_execute", action : "SvcFINCOMBUGR01.pwkjson"}, {
			requestData: data, 
			processMsg : "",
			successCallback: function (ret) {	
				(func)(ret.responseJSON.elData);
			}
		});
	}catch (e) {
		console.error("[com.fin.bugtChk] Exception :: " + e);
	}
	
};

/**
 * 사후결재 체크
 * var data ={req_no:"C86202203604"
 *           , docu_id:"C86"
 *           , syspayno : "20130576"
 *           , callback func}
 */
com.biz.confirmPostApr = function(data, func){
	try{
		com.executeDynamic({id : "sbm_execute", action : "SvcConfirmPostApr.pwkjson"}, {
			requestData: data, 
			processMsg : "",
			successCallback: function (ret) {	
				if(ret.responseJSON.elData.is_apr_after){
					com.pop.open(com.pop.TYPE.POST_APR, ret.responseJSON.elData, function(ret){
						if(func){
							(func)(ret);
						}
					 });
				}else{
					if(func){
						(func)(!ret.responseJSON.elData.is_apr_after);
					}
				}
			}
		});
	}catch (e) {
		console.error("[com.fin.bugtChk] Exception :: " + e);
	}
	
};

/**
 * 전자증빙 화면을 새창(탭)으로 연다.
 * 
 * @param key 신청번호, 가결의번호 혹은 확정결의번호
 * @param syspayno 시스템개인번호
 */
com.biz.openEvidWindow = function(key, syspayno, accntNo, accntCd) {	
	key = key.trim();
	if (key.length == 0) {
		alert("결의번호가 없습니다.");
		return;
	}
	if (typeof syspayno != "string" || syspayno == "")
		syspayno = com.getLoginInfo("sn"); // 기본값은 로그인사용자 시스템개인번호
	if (typeof accntNo == "undefined")
		accntNo = "";
	if (typeof accntCd == "undefined")
		accntCd = "";
	
	var cls; // 증빙구분: 일반결의=00, 확정결의=10, 예실대비표=20
	var evidBaseURL = "http://evid.kitech.re.kr/sd/view?"; // 전자증빙 뷰어 서비스 기본주소

	switch (key.length) { // 파라미터 키값의 문자열 길이로 종류를 판별, 증빙구분을 자동 결정
	case 7: // 예실대비표
		if (key == "BugtSub")
			cls = "30"; // 서브계정포함
		else
			cls = "20"; // 메인계정단독
		break;
	case 8: // 확정결의번호
		cls = "10";
		break;
	case 10: // 가결의번호
		cls = "00";
		break;
	case 12: // 신청번호
		cls = "50";
		break;
	default:
		cls = "00";
	}

	if (cls == "20" || cls == "30") // 증빙구분 = 예실대비표
		window.open(evidBaseURL + "CLS=" + cls + "&RESL_NO=" + accntNo + "&EMP_NO=" + syspayno + "&EXPN_ITM_CD=" + accntCd, "_blank");
	else // 증빙구분 = 결의서 등
		window.open(evidBaseURL + "CLS=" + cls + "&RESL_NO=" + key + "&EMP_NO=" + syspayno, "_blank");
};


/**
 * 계좌검증 체크(단건)
 * var data ={bank:"FAA081"
 *           , bankaccnt_no:"78091001385004"
 *           , syspayno : "20130576"
 *           , acnm_no :  // 생년월일 or 사업자번호
 *           }
 */
com.biz.verifyAccount = function(data, func){
	try{
		com.executeDynamic({id : "sbm_execute", action : "SvcAccountVerf.pwkjson"}, {
			requestData: data, 
			processMsg : "조회중입니다.",
			successCallback: function (ret) {	
				(func)(ret.responseJSON.elData);
			}
		});
	}catch (e) {
		console.error("[com.fin.bugtChk] Exception :: " + e);
	}	
};

/**
 * 계좌검증 체크(다건)
 */
com.biz.verifyAccountMulti = function(func){
	try{
		var sbmOption = {
				  id : "sbm_execute"
				 ,action : "SvcAccountVerfMulti.pwkjson"
				 ,ref : 'data:json,{"id":"dlt_account","key":"accList"}'
				 ,target : 'data:json,{"id":"dlt_account","key":"accList"}'
				 ,submitDoneHandler : scwin.postAccVerf
			};
		
		com.executeDynamic(sbmOption, {
			processMsg : "조회중입니다.",
			successCallback: function (ret) {	
				(func)(ret);
			}
		});
	}catch (e) {
		console.error("[com.fin.bugtChk] Exception :: " + e);
	}	
};

/**
 * 화면 권한 체크
 */
com.biz.checkRole = function(data, func){
	try{
		com.executeDynamic({id : "sbm_execute", action : "SvcCheckRole.pwkjson"}, {
			requestData: data, 
			processMsg : "조회중입니다",
			successCallback: function (ret) {	
				(func)(ret.responseJSON.elData);
			}
		});
	}catch (e) {
		console.error("[com.fin.bugtChk] Exception :: " + e);
	}	
};

/**
 * 네이티브 팝업
 * @example 
 *   com.biz.openPopupByNative( '/filter/index.jsp?serviceid=C955', '계정번호검색', {width: 800, height: 600}, 'BIZ2');
 *   com.biz.openPopupByNative( '/websquare/websquare.jsp?w2xPath=/ccs/ctr/xxx.xml', '계정번호검색', {width: 800, height: 600}, 'BIZ2');
 */
com.biz.openPopupByNative = function(url, name, options, base, callbackFn) {
	
	var baseUrl = "";
	switch(base) {
		case "BPM": baseUrl = gcm.baseUrls.newBpmUrl; break;
		case "EIP": baseUrl = gcm.baseUrls.newEipUrl; break;
		case "BIZ": baseUrl = gcm.baseUrls.newBizUrl; break;
		case "OZ": baseUrl = gcm.baseUrls.ozUrl; break;
		case "KDOC": baseUrl = gcm.baseUrls.kdocUrl; break;
		case "EIP2": baseUrl = gcm.baseUrls.oldEipUrl; break;
		case "BIZ2": baseUrl = gcm.baseUrls.oldBizUrl; break;
		case "APR2": baseUrl = gcm.baseUrls.oldAprUrl; break;
	}
	debugger;
	url = url.replace(/&amp;/, "&");

	var width = options.width || 1400;
	var height = options.height || 950;
	var left = options.left || (screen.width / 2 - width / 2);
	var top = options.top || (screen.height / 2 - height / 2);
	var baseShape = 'toolbar=no, location=no, directories=no, status=no, menubar=no, scrollbars=no, resizable=no, copyhistory=no';
	var openServiceId = $p.top().wdc_layout.getSelectedWindowId();
	window.open(baseUrl + url + "&biz3=true&bizServiceId="+openServiceId, name, baseShape + ', width='+width+', height='+height+', top='+top+', left='+left);
};




/**
 * 
 * 각 Scope별 bsns의 정보를 담기 위해 com에 반영
 * 
 */

com.res = {};

com.res.bsnsCd = {
	isSet : false
};

com.res.setBsnsCd = function(data, callback) {
	biz.res.com.setBsnsCd(scwin, data, callback);
};

/**
 * G2b 공통코드 조회
 * data={upper_cd:"L17", cd:"100"}
 */
com.biz.getG2bComCd = function(data, callback){
	biz.epu.getG2bComCode(scwin, data, callback);	
};

/**
 * 연구담당자 조회(gfnDeptResSyspayno)
 * data={dept_cd:"", dept_new_ymd:""}
 */
com.biz.getResMan = function(data, func){
	try{
		com.executeDynamic({id : "sbm_selectResMan", action : "SvcRESCOMR01.pwkjson"}, {
			requestData: data, 
			processMsg : "조회중입니다",
			successCallback: function (ret) {	
				(func)(ret.responseJSON.elData);
			}
		});
	}catch (e) {
		console.error("[com.biz.getResMan] Exception :: " + e);
	}	
};

/**
 * 부서별 담당자 조회
 * data={roleType:"PAT", syspayno:""}
 */
com.biz.getDeptManager = function(data, func){
	try{
		com.executeDynamic({id : "sbm_selectDeptManager", action : "ApiBpmGetAuth.pwkjson"}, {
			requestData: data, 
			processMsg : "조회중입니다",
			successCallback: function (ret) {
				if(ret.responseJSON.elData.apiBpmVo != undefined){	
					(func)(ret.responseJSON.elData.apiBpmVo[0]);
				}else{
					alert("담당자가 존재하지 않습니다.")
				}
			}
		});
	}catch (e) {
		console.error("[com.biz.getDeptManager] Exception :: " + e);
	}	
};

/**
 * 메일 쓰기 팝업
 */
com.biz.openMailPop = function(sender, ref){
	var param = "?";
	param += "to=" + sender;
	param += "&" ;
	param += "cc=";
	param += "&";
	param += "subject=";
	window.open("https://kitech.gov-dooray.com/mail/write/new"+param, "", "width=850, height=550, toolbar=no, menubar=no, resizable=yes" );	
};

/**
 * 사업자번호 유효성 체크
 */
com.biz.checkBsnsRegstNo = function(bsnsRegstNo){
	if (bsnsRegstNo.length != 10) { // '-' 빼고 자릿수 체크
		alert("사업자번호 자릿수 오류입니다");
		return false;
	}
	
	// 사업자번호 유효성 체크
	var sum = 0;
	var checknum = 0;
	var anum = new Array(10);
	var chknum = new Array("1", "3", "7", "1", "3", "7", "1", "3", "5");
	for (var i = 0; i < 10; i++) {
		anum[i] = bsnsRegstNo.substring(i, i + 1);
	}

	for (var i = 0; i < 9; i++) {
		sum += anum[i] * chknum[i];
	}

	sum += parseInt((anum[8] * 5) / 10);
	checknum = (10 - sum % 10) % 10;
	if (checknum != anum[9]) {
		alert("잘못된 사업자번호입니다. ");
		return false;
	}
	return true;
};

/**
 * 지역본부 조회
 * data={clsf : DEPTH(자산 통합관리계정 변경이력 - xodhdeptinfo에서 dept_shape = 3)}
 */
com.biz.getComboBox = function(data, func){
	try{
		com.executeDynamic({id : "sbm_selectComboBox", action : "SvcCOMCODR01.pwkjson"}, {
			requestData: data, 
			processMsg : "조회중입니다",
			successCallback: function (ret) {
				if(ret.responseJSON.comBoxCodeVoList != undefined){
					data.dataListId ||= "dlt_comBox_" + data.clsf;

					var codeDatalist = gcm.data.createDataList(scwin, data.dataListId, ["cd", "cd_nm"] , ["text", "text"]);
					var selectBoxComp = gcm.util.getComponent(scwin, data.compID);
					
					codeDatalist.setJSON(ret.responseJSON.comBoxCodeVoList);
					if(selectBoxComp){
						selectBoxComp.setNodeSet("data:" + data.dataListId, "cd_nm", "cd");
					}

					if (func && typeof func === "function") {
						(func)();
					}
				}
			}
		});
	}catch (e) {
		console.error("[com.biz.getDeptInfo] Exception :: " + e);
	}	
};
