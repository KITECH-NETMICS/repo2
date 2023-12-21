requires("uiplugin.popup");

/**
 * 전체 Scope에서 공유되는 Global 전역 변수, 상수, 공통 함수를 작성한다.
 *
 * @class gcm
 * @namespace gcm
 * @description
- gcm 객체는 WFrame Scope이 고려될 필요가 없고, com 공통 함수 객체나 전역에서 사용할 함수만을 작성한다.
- gcm 객체는 WFrame Scope별로 생성되지 않고, 전역 객체로 1개만 생성된다.
- gcm 객체 내에서는 함수를 호출한 화면의 Scope을 찾을 수 없기 때문에 Scope 확인이 필요한 경우 scwin 객체를 파라미터로 전달해야 한다.

※ 주의사항
- gcm 객체 내 변수와 함수는 업무 화면 개발 시에는 사용 금지
 */

var gcm = {
	// Web Context Root
	CONTEXT_ROOT : "",
	//CONTEXT_ROOT : "/es",

	// 레이아웃 유형
	// WFM : Wframe  			( SDI 구조 - 단 하나의 업무화면만 오픈 )
	// TAC : TabControl 		( MDI 구조 - 여러개의 업무화면을 여러 탭으로 오픈 )
	// WDC : WindowContainer 	( MDI 구조, 화면분할 가능 - 분할 시 퍼블리싱 틀어짐 이슈 해소 필요 )
	LAYOUT_TYPE : "WDC",

	// 업무영역 wrapping class
	CONTENT_WRAP : "pageWrap",
	
	// 결재 탭 스타일
	APRTAB_STYLE : "background-color: cadetblue",

	// 스냅샷 탭 스타일
	SNAPTAB_STYLE : "background-color: orange",	
	
	// 통신 스팩 정보
	SBM_INFO : {
		  SVC_URL	: "/"			// 서비스 호출을 위한 Service Url : com.execute 사용시 공통에서 추가
		, REQ_DATA	: "elData"				// 요청 데이터 key		
		, REQ_META	: "elHeader"			// 요청 메타 key
		, REQ_CMMN	: "userHeader"			// 요청 공통 key	
		, RES_DATA	: "elData"				// 응답 데이터 key
		, RES_META	: "elHeader"			// 응답 메타 key
		, RES_CMMN	: "userHeader"			// 응답 공통 key		
		, RES_CD	: "resCode"				// 결과코드 (성공시 없음)
		, RES_MSG	: "resMsg"				// 결과메시지 (성공시 없음)
		, IS_SUCC	: "resSuc"				// 성공여부
		, PG_NO		: "pageNo"				// 페이지 번호 (페이징 조회시)
		, PG_SIZE	: "pageSize"			// 페이지당 row수 (페이징 조회시)
		, PG_TCNT	: "tcnt"				// 전체 건수 (페이징 조회시)
	},
	
	// 다국어 정보
	LANG_INFO : {
		  type	 		: "SP" 			/* SP : 다국어 정보를 서버 Properties 파일로 관리하는 경우
		  								   DB : 다국어 정보를 DB로 관리하는 경우
	    	   							   JS : langpack js 파일 사용 */  
		, LANG_CD		: "lang"		// 언어코드 (en, ko, jp)	
		, LABEL_CD		: "LABEL_CD"	// DB컬럼 - 레이블코드	
		, LABEL_NM		: "LABEL_NM"	// DB컬럼 - 레이블명
		, MSG_CD		: "MSG_CD"		// DB컬럼 - 메시지코드	
		, MSG_NM		: "MSG_NM"		// DB컬럼 - 메시지명	
		, DEFAULT_LANG 	: "ko" 			// 디폴트 언어
		, LANG_ARR 		: ["ko", "en"] 	// 지원 다국어 종류 
		, actionUrl		: {
			  SP 		: "SvcMessages.pwkjson"	// 다국어 프로퍼티 조회 action Url
			, DB_LBL 	: "com.Common.selectLabelList"	// 다국어 레이블 DB 조회 action Url
			, DB_MSG 	: "com.Common.selectMsgList"	// 다국어 메시지 DB 조회 action Url
		}
	},
	properties : {},	// type=SP인 경우 사용 (메시지 + 레이블, json)
	labelList : [], 	// type=DB인 경우 사용 (레이블, json array)
	msgList : [],		// type=DB인 경우 사용 (메시지, json array)
	baseUrls : {}, 		// 베이스URL
	
	// 공통코드 관련 컬럼명 (공통코드 테이블에 맞게 변경하여 사용)
	CMNCD_INFO : {
		  isIndexAll 	: false  		/* true  : 초기화면에서 전체 공통코드를 조회해놓고 사용(공통코드 데이터량이 많지 않을 경우)
						 	   	    	   false : 업무화면에서 필요한 것만 조회하고 캐싱해서 사용 */  
		, isUseYn 		: true			// 사용여부 컬럼 고려 여부 (true이면 사용여부가 N인 코드는 조회만 되고 재선택 불가)
		, GRP_CD 		: "grpCd"		// 그룹코드 (쿼리 alias 권장, 변경시 공통코드 선택 팝업 수정)
		, GRP_NM 		: "grpNm"		// 그룹코드명 (쿼리 alias 권장, 변경시 공통코드 선택 팝업 수정)
		, VALUE 		: "comCd"		// 코드값 (쿼리 alias 권장, 변경시 공통코드 선택 팝업 수정)
		, LABEL 		: "comNm"		// 코드명 (쿼리 alias 권장, 변경시 공통코드 선택 팝업 수정)
		, DESC	 		: "cdDesc"		// 코드설명 (쿼리 alias 권장, 변경시 공통코드 선택 팝업 수정)
		, USE_YN 		: "useEx"		// 사용여부 (쿼리 alias 권장, 변경시 공통코드 선택 팝업 수정)
		, UP_CD 		: "cdClsf"		// 상위코드 (쿼리 alias 권장, 변경시 공통코드 선택 팝업 수정)
		, DATA_PREFIX	: "dlt_cmnCd_"	// dataList prefix
		, FILED_ARR 	: [ "grpCd", "grpNm", "comCd", "comNm", "useEx", "cdClsf", "mngmtItem1", "mngmtItem2", "mngmtItem3", "mngmtItem4", "mngmtItem5", "mngmtItem6"
						  , "mngmtItem7", "mngmtItem8", "mngmtNo1", "mngmtNo2", "mngmtNo3", "mngmtNo4", "mngmtNo5", "mngmtNo6", "mngmtNo7", "cdDesc"] // dataList 컬럼명
		, actionUrl		: "/SvcCodeList.pwkjson"	// 공통코드 조회 action Url
	},
	cmnCdCache : {},

	// 메뉴 관련 컬럼명
	MENU_INFO : {
		  SERVICE_ID: "serviceID"		// 화면 ID (개발자들이 활용)
		, MENU_ID 	: "serviceCode"		// 메뉴 ID
		, MENU_NM 	: "cn"				// 메뉴명
		, SRC_PATH 	: "serviceUrl"		// 화면 경로 (ex. /ui/sample/crud.xml)
		, NEW_PATH 	: "serviceNewUrl"	// 화면 경로 (ex. /ui/sample/crud.xml)	
		, LEVEL 	: "serviceLevel"	// 메뉴레벨 (1부터 시작)
		, P_MENU_ID	: "parentDivCode"	// 상위 메뉴 ID
		, USE_YN 	: "useYN"			// 메뉴표시 여부
		, BETA_YN 	: "betaServiceYN"	// 베타서비스 여부
		, T_MENU_ID : "T_MENU_ID"		// 최상위 메뉴 ID (1level)
		, IS_LEAF 	: "IS_LEAF"			// 리프노드 여부
		, LOGIN_YN 	: "LOGIN_YN"		// 로그인 체크 여부

//		, AUTH 		: "permission"		// 버튼권한 (9자리)
//		, AUTH_RA 	: "AUTH_RA"			// 조회 권한 (관리자)
//		, AUTH_RM 	: "AUTH_RM"			// 조회 권한 (담당자)
//		, AUTH_RU 	: "AUTH_RU"			// 조회 권한 (사용자)
//		, AUTH_RS 	: "AUTH_RS"			// 조회 권한 (S담당자)
//		, AUTH_C 	: "AUTH_C"			// 등록 권한
//		, AUTH_U 	: "AUTH_U"			// 수정 권한
//		, AUTH_D 	: "AUTH_D"			// 삭제 권한
//		, AUTH_E 	: "AUTH_E"			// 엑셀 권한
//		, AUTH_P 	: "AUTH_P"			// 출력 권한
	},

	// 파일 관련 컬럼명
	FILE_INFO : {
		  SUB_DIR 		: "SUB_DIR" 	// 업무구분
		, REF_KEY 		: "REF_KEY"		// 참조키 (업무테이블 Key 또는 파일그룹ID)
		, FILE_ID 		: "FILE_ID"		// 파일 ID
		, FILE_NM 		: "FILE_NM"		// 원본 파일명
		, FILE_PATH 	: "FILE_PATH"	// 물리 파일 경로 (baseDir/subDir/yyyyMM/파일ID)
		, FILE_SIZE 	: "FILE_SIZE"	// 파일 크기
		, DATA_PREFIX	: "dlt_file"	// dataList prefix
		, FILED_ARR 	: [ "SUB_DIR", "REF_KEY", "FILE_ID", "FILE_NM", "FILE_PATH", "FILE_SIZE" ] // dataList 컬럼명
	},
	
	XLS_INFO : {
		PKG_NM	: "kr.re.kitech.biz.xom.base.util.wq."	// 패키지명		
	},

	// 콜백 Function 정보 저장
	CB_FUNCTION_MANAGER : {
		  cbFuncIdx 	: 0 // 정보 저장 Index Key
		, cbFuncSave	: {} // 정보 저장 객체
	},
	
	POP_RESOLVE_CONTAINER : {
		popContIdx      : 0,
		popContSave     : {}
	},
	
	INTERVAL_ARRAY : [],

	// Console Log Debug 설정 (DEBUG_MODE가 false이면 Console 객체를 통해서 남긴 로그가 개발자 도구 Console 창에 남지 않도록 함)
	DEBUG_MODE : true
	
};


// 업무용 공통 js
var biz = {};

/**
 * 서비스 통신과 관련된 공통 로직 제어와 관련된 함수를 작성한다.
 *
 * config.xml에 정의된 Submission PreSubmit, CallSubmitFunc, ExnteralHandler 함수를 gcm.sbm 객체 아래에 작성한다.
 *
 * @class sbm
 * @namespace gcm.sbm
 */
gcm.sbm = {};

/**
 * submission의 공통 설정에서 사용.
 * submission 통신 직전 호출(config.xml에 설정)
 * return true일 경우 통신 수행, return false일 경우 통신 중단
 *
 * @memberof gcm.sbm
 * @param {Object} sbmObj 서브미션 객체
 * @return {Boolean} true or false
 */
gcm.sbm._preSubmitFunction = function(sbmObj) {
	try {
		if (sbmObj.isMakeAction !== true && sbmObj.action.indexOf("/") != 0 && sbmObj.action.indexOf(gcm.SBM_INFO.SVC_URL) != 0) {
			sbmObj.action = gcm.SBM_INFO.SVC_URL + sbmObj.action; 
			sbmObj.isMakeAction = true;
		}
	} catch (e) {
		console.error("[gcm.sbm._preSubmitFunction] Exception :: " + e);
	}
};

/**
 * 공통 요청 해더 설정
 * gcm.sbm._preSubmitFunction 수행후 통신 직전 호출(config.xml에 설정)
 *
 * @memberof gcm.sbm
 * @param {Object} requestObj XMLHttpRequest 객체
 * @param {Object} sbmObj submission 객체
 */
gcm.sbm._setRequestHeader = function(requestObj, sbmObj) {
	try {
		requestObj.setRequestHeader("Proworks-Lang", gcm.lang.getLangCode());
	} catch (e) {
		console.error("[gcm.sbm._setRequestHeader] Exception :: " + e);
	}
};
 
/**
 * 모든 submission의 defaultCallback
 * gcm.sbm._errorHandler 보다 먼저 수행(config.xml에 설정)
 * 
 * @memberof gcm.sbm
 * @param {Object} resObj responseData 객체
 * @param {Object} sbmObj Submission 객체
 */
gcm.sbm._callbackSubmitFunction = function(resObj, sbmObj) {
	try {
		var scopeScwin = sbmObj.getScopeWindow().scwin;
		// target 원복 (gcm.sbm.execute에서 resData로 감싸기 전으로)
		sbmObj.target = sbmObj.targetOrg;
		if (resObj.responseStatusCode == 200) {
			var resJSON = resObj.responseJSON || null;
			var isSucc = gcm.sbm.isSucc(resObj);
			var resultCd = gcm.sbm.getResCode(resObj);
			var resultMsg = gcm.sbm.getResMsg(resObj);
			if (isSucc === true) {
				// 성공시 성공 콜백
				if (sbmObj.successCallback && typeof sbmObj.successCallback == "function") {
					try {
						sbmObj.successCallback(resObj);
					} catch (e) {
						console.error("["+ sbmObj.id +" successCallback] Exception :: " + e);
						return false;
					}
				}
			} else if (null!= resultCd && resultCd == "message.xom.wq.037"/*로그인 후 이용가능한 서비스 입니다.*/) {
				// 세션 만료시 로그인 팝업 (로그인이 옵션인 사이트)
				gcm.pop.warn(scopeScwin, "message.xom.wq.037"/*로그인 후 이용가능한 서비스 입니다.*/, function() {
					// 로그인 정보 초기화
					gcm.data.setLoginInfo({});
					// 상단셋팅
					scopeScwin.$w.top().wfm_header.getWindow().grp_logout.hide();
					scopeScwin.$w.top().wfm_header.getWindow().grp_login.show("");
					// 로그인 팝업
					scopeScwin.$w.top().wfm_header.getWindow().scwin.btn_login_onclick();
				}, {isErr : true, errCd : "_ERR037_"});
			} else if (null!= resultCd && resultCd == "message.xom.wq.001") {
				// 세션이 끊기면 interval 작업 중지
				var intervalArr = gcm.INTERVAL_ARRAY.slice();
				intervalArr.forEach((intervalIndex, index) => { clearInterval(intervalIndex);});
				// 세션 만료시 로그인 화면으로 이동 (로그인이 필수인 사이트)
				gcm.pop.warn(scopeScwin, "서버와의 연결이 종료되어 로그인화면으로 이동합니다.", function() {
					// 로그인 화면으로 이동
					gcm.win.goHome();
				}, {isErr : true, errCd : "_ERR001_"});
				/*
				const delay = 1000;
				(function loop(second) {
					let logoutUrl = "/SvcComLogout.do";
					let appTimerId = setTimeout( function(){
						if (0 > second) {
							document.location = logoutUrl;
							appTimerId.clearInterval(); // 혹시나?
						}
						gcm.pop.closeAllPopup(scopeScwin);
						gcm.pop.warn(scopeScwin, com.getMsg("message.xom.wq.001", second), function() {
							// 자체 세션 로그아웃 -> SSO 로그아웃 전이
							document.location = logoutUrl;
						});

						loop(--second);
					}, delay);
				})(10);	// 11회 재귀호출
				*/
			} else if (null!= resultCd && resultCd == "message.xom.fw.error.base.limit.row.count.confirm") {
				// 엑셀 다운로드 유도: 엑셀 다운로드 처리 메소드 실행
				gcm.pop.confirm(scopeScwin, resultMsg/*최대 100 건으로 제한*/, function(ret) {
					// 로그인 화면으로 이동
					if (ret) {
						try {
							sbmObj.excelCallback(resObj);
						} catch (e) {
							gcm.pop.error(scopeScwin, "[엑셀 다운로드]가 구현되어 있지 않습니다.\n시스템관리자에게 문의 바랍니다.");
						}
					} else {
						// 최대 그리드 데이터 조회
						
					}
				});
			// } else if (null != resultCd && resultCd.startsWith('message.xom.co.util.apr')) {	
				// ignore : 한시적으로 처리
			} else {
				console.error("[gcm.sbm._callbackSubmitFunction("+ sbmObj.id +")] responseJSON : "+ JSON.stringify(resJSON));
				if (resJSON.userHeader.errType == 'BUSINESS') {
					// BizException인 경우
					if (sbmObj.exceptionCallback && typeof sbmObj.exceptionCallback == "function") {
						// exceptionCallback 호출
						try {
							sbmObj.exceptionCallback(resObj);
						} catch (e) {
							console.error("["+ sbmObj.id +" exceptionCallback] Exception :: " + e);
						}
					} else {
						// 공통에서 alert
						var msg = gcm.lang.getMsg(resultCd);
						if (gcm.util.isEmpty(msg) || msg == resultCd || msg.indexOf("{0}") != -1) { 
							// resultCd가 등록되지 않은 메시지 코드인 경우 resultMsg alert
							msg = resultMsg;
						}
						if (!gcm.util.isEmpty(resJSON.userHeader.errBusiness)) {
							msg = "["+ resJSON.userHeader.errBusiness +"] "+ msg;
						}
						if (resJSON.userHeader.errKind == "ALERT") {
							gcm.pop.alert(scopeScwin, msg, null, null, {isErr : true, errCd : "_ERRBIZ_"});
						} else if (resJSON.userHeader.errKind == "ERROR") {
							gcm.pop.error(scopeScwin, msg, null, {isErr : true, errCd : "_ERRBIZ_"});
						} else {
							gcm.pop.warn(scopeScwin, msg, null, {isErr : true, errCd : "_ERRBIZ_"});
						}
					}
				} else {
					// 시스템 오류인 경우 공통에서 alert
					var msg = gcm.lang.getMsg(resultCd);
					if (gcm.util.isEmpty(msg) || msg == resultCd || msg.indexOf("{0}") != -1) { 
						// resultCd가 등록되지 않은 메시지 코드인 경우 resultMsg alert
						msg = resultMsg;
					}
					if (resJSON.userHeader.errKind == "ALERT") {
						gcm.pop.alert(scopeScwin, msg, null, null, {isErr : true, errCd : "_ERRSYS_"});
					} else if (resJSON.userHeader.errKind == "WARN") {
						gcm.pop.warn(scopeScwin, msg, null, {isErr : true, errCd : "_ERRSYS_"});
					} else {
						gcm.pop.error(scopeScwin, msg, null, {isErr : true, errCd : "_ERRSYS_"});
					}
				}
			}

		} else {
			// 200이 아닌 경우 공통에서 오류 처리 (404, 500 등)
			console.error("[gcm.sbm._callbackSubmitFunction("+ sbmObj.id +")] HTTP 상태코드 : "+ resObj.responseStatusCode +", URI : "+ resObj.resourceUri +"\nresponseBody = "+ resObj.responseBody);
			if (resObj.responseStatusCode == 404) {
				// 찾을 수 없는 요청
				gcm.pop.error(scopeScwin, "message.xom.wq.040"/*찾을 수 없는 요청입니다.*/, null, {isErr : true, errCd : "_ERR404_"});
			} else if (resObj.responseStatusCode == 0 || resObj.responseStatusCode == 502) {
				// server와 연결을 할 수 없을 경우 responseStatusCode가 0으로 발생. (nginx에서 서비스 연결이 안될 경우 502) 
				// 서버 연결이 오류나는 경우 messageBox.xml도 net::ERR_CONNECTION_REFUSED 가 발생할 수 있기 때문에 브라우저 alert으로 처리함.
				// interval 작업 중지
				var intervalArr = gcm.INTERVAL_ARRAY.slice();
				intervalArr.forEach((intervalIndex, index) => { clearInterval(intervalIndex);});
				alertNative(gcm.lang.getMsg("message.xom.wq.044"/*서버와 연결할 수 없습니다.*/));
			} else if (resObj.errorType == "timeout-error") {
				// 응답시간 초과
				//gcm.pop.error(scopeScwin, gcm.lang.getMsg("message.xom.wq.002"/*응답시간({0}ms)을 초과하였습니다.*/, resObj.time));
			} else {
				gcm.pop.error(scopeScwin, "message.xom.wq.003"/*오류가 발생하였습니다. 관리자에게 문의하시기 바랍니다.*/, null, {isErr : true, errCd : "_ERR404_"});
			}
			return false;
		}
	} catch (e) {
		console.error("[gcm.sbm._callbackSubmitFunction("+ sbmObj.id +")] Exception :: " + e);
	}
};

/**
 * 서버 통신 확장 모듈, Submission를 실행합니다.
 *
 * @memberof gcm.sbm
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} sbmObj submission 객체
 * @param {Object} option gcm.sbm.execute 함수의 옵션 객체
 * @param {Function} option.successCallback 성공 콜백 함수 (처리결과가 성공인 경우 수행, responseJSON.head.rsMsg.statusCode == "S"인 경우)
 * @param {Function} option.exceptionCallback 실패 콜백 함수 (처리결과가 성공이 아닌 경우 수행, 미지정시 공통 콜백에서 alert함)  
 * @param {String} option.processMsg 처리중 메시지 내용 (processMsg를 생략하고 싶은 경우 빈 문자열 ""로 셋팅)
 * @param {Object} option.requestData 요청 데이터로 submission에 등록된 ref를 무시하고 현재의 값이 할당된다.
 * @param {Object} option.compObj 전송중 disable시킬 컴포넌트
 * @param {Object} option.isFileUpload 첨부파일 업로드와 함께 처리 여부 
 */
gcm.sbm.execute = function(scopeScwin, sbmObj, option) {
	return new Promise((resolve, reject) => {
		try {
			if (sbmObj) {
				if (!sbmObj.action) {
					console.error("[gcm.sbm.execute] submission action is null.");
					return false;
				}
				option = option || {};
				var reqPayload = {};
				// reqMeta에 메뉴의 프로그램ID 및 로그인 체크여부 전달
				reqPayload[gcm.SBM_INFO.REQ_META] = {
					"locale" : gcm.lang.getLangCode(),
				};
				reqPayload[gcm.SBM_INFO.REQ_CMMN] = {
					"implExcel" : option.isImplExcel || false,
					"excel" : option.providerInfo && option.providerInfo.method || false,
				};
				var menuObj = gcm.win.getScopeMenuObj(scopeScwin);
				if (menuObj) {
					reqPayload[gcm.SBM_INFO.REQ_META][gcm.MENU_INFO.SERVICE_ID] = menuObj[gcm.MENU_INFO.SERVICE_ID];
					reqPayload[gcm.SBM_INFO.REQ_META][gcm.MENU_INFO.LOGIN_YN] = menuObj[gcm.MENU_INFO.LOGIN_YN];
				}
				// reqMeta에 첨부파일 업로드와 함께 처리 여부 전달
				if (option.isFileUpload === true) {
					reqPayload[gcm.SBM_INFO.REQ_META]["isFileUpload"] = option.isFileUpload;
				}
				// ref에 reqData 적용 
				if (option.requestData != undefined) {
					reqPayload[gcm.SBM_INFO.REQ_DATA] = option.requestData;
				} else {
					var refData = WebSquare.ModelUtil.getRefToReqData(sbmObj);
					if (refData == "") {
						reqPayload[gcm.SBM_INFO.REQ_DATA] = {};
					} else {
						var refJson = JSON.parse(refData);
						if (Object.keys(refJson).length == 1 && sbmObj.ref.indexOf('"key":') == -1) {
							// 단일 키이고 키 지정을 안한 경우 키값을 reqData로 변경
							// ex) '{"dma_search":{"fromDate":"","toDate":"","bbsId":""}}'
							//  => '{"reqData":{"fromDate":"","toDate":"","bbsId":""}}'
							// ex) '{"dlt_sample":[{"bbsId":"B001","title":"제목1","content":"샘플 내용입니다.","rowStatus":"D"},{"bbsId":"B002","title":"제목2","content":"샘플 내용입니다.","rowStatus":"D"}]}'
							//  => '{"reqData":[{"bbsId":"B001","title":"제목1","content":"샘플 내용입니다.","rowStatus":"D"},{"bbsId":"B002","title":"제목2","content":"샘플 내용입니다.","rowStatus":"D"}]}'
							reqPayload[gcm.SBM_INFO.REQ_DATA] = refJson[Object.keys(refJson)[0]];
						} else {
							// 복합 키이거나 키 지정을 한 단일키인 경우 reqData로 래핑
							// ex) '{"master":{"bbsId":"","title":"","content":"","rowStatus":"C"},"detailList":[{"bbsId":"B001","title":"제목1","content":"샘플 내용입니다.","rowStatus":"D"},{"bbsId":"B002","title":"제목2","content":"샘플 내용입니다.","rowStatus":"D"}]}'
							//  => '"reqData":{{"master":{"bbsId":"","title":"","content":"","rowStatus":"C"},"detailList":[{"bbsId":"B001","title":"제목1","content":"샘플 내용입니다.","rowStatus":"D"},{"bbsId":"B002","title":"제목2","content":"샘플 내용입니다.","rowStatus":"D"}]}}'
							// ex) '{"empVo":{"fromDate":"","toDate":"","bbsId":""}}'
							//  => '{"reqData":{"empVo":{"fromDate":"","toDate":"","bbsId":""}}}'
							// ex) '{"empVoList":[{"bbsId":"B001","title":"제목1","content":"샘플 내용입니다.","rowStatus":"D"},{"bbsId":"B002","title":"제목2","content":"샘플 내용입니다.","rowStatus":"D"}]}'
							//  => '{"reqData":{"empVoList":[{"bbsId":"B001","title":"제목1","content":"샘플 내용입니다.","rowStatus":"D"},{"bbsId":"B002","title":"제목2","content":"샘플 내용입니다.","rowStatus":"D"}]}}'
							reqPayload[gcm.SBM_INFO.REQ_DATA] = refJson;
						}
					}
				}
				// target에 resData로 감싸기 (공통 콜백 gcm.sbm._callbackSubmitFunction에서 원복)
				var target = sbmObj.targetOrg = sbmObj.target;  
	//			console.log("original target : " + sbmObj.target);
				if (target.charAt(10) == "[") {
					// 복합조회시
					// ex) 'data:json,["dma_sample","dlt_sample"]'
					//  => 'data:json,[{"id":"dma_sample","key":"resData.dma_sample"},{"id":"dlt_sample","key":"resData.dlt_sample"}}]'
					// ex) 'data:json,["dma_search",{"id":"dlt_sample","key":"detailList"}]'
					//  => 'data:json,[{"id":"dma_sample","key":"resData.dma_sample"},{"id":"dlt_sample","key":"resData.dlt_sample"}}]'
					// ex) 'data:json,[{"id":"dma_sample","key":"master"},{"id":"dlt_sample","key":"detailList"}]'
					//  => 'data:json,[{"id":"dma_sample","key":"resData.master"},{"id":"dlt_sample","key":"resData.detailList"}]'
					var arrKey = JSON.parse(target.substr(target.indexOf("[")));
					sbmObj.target = target.substr(0, target.indexOf(",")+1) + "[";
					for (var i=0; i<arrKey.length ; i++) {
						if (i > 0) {
							sbmObj.target += ",";
						}
						if (typeof arrKey[i] == "string") {
							// 키 미지정시
							sbmObj.target += makeTargetItem(arrKey[i], arrKey[i]);
						} else {
							// 키 지정시 
							arrKey[i].key = gcm.SBM_INFO.RES_DATA +'.'+ arrKey[i].key;
							sbmObj.target += JSON.stringify(arrKey[i]);
						}
					}
					sbmObj.target += "]";
				} else {
					// 목록조회, 단건조회시
					if (target.indexOf(',"key":"') == -1) {
						// 키 미지정시
						// ex) 'data:json,dlt_sample'
						//  => 'data:json,{"id":"dlt_sample","key":"resData"}'
						// ex) 'data:json,dma_sample'
						//  => 'data:json,{"id":"dma_sample","key":"resData"}'
						sbmObj.target = target.substr(0, target.indexOf(",")+1) + makeTargetItem(target.substr(target.indexOf(",")+1));
					} else {
						// 키 지정시
						// ex) 'data:json,{"id":"dma_sample","key":"master"}'
						//  => 'data:json,{"id":"dma_sample","key":"resData.master"}'
						sbmObj.target = gcm.str.replaceAll(target, ',"key":"', ',"key":"'+ gcm.SBM_INFO.RES_DATA + '.');
					}
				}
	//			console.log("new target : " + sbmObj.target);
				// callback 옵션 처리
				let succCallback = function(resData) {
					try {
						if (typeof option.successCallback === "function") 
							(option.successCallback)(resData);

						sbmObj.resolveFunc(resData);
					} catch (e) {
						console.error("[gcm.sbm.execute] Exception :: callBackFunc Raise Error!!")
						sbmObj.rejectFunc(e);
					}
				}

				sbmObj.successCallback = succCallback;
				sbmObj.exceptionCallback = option.exceptionCallback;
				sbmObj.excelCallback = option.excelCallback;
				sbmObj.resolveFunc   = resolve;
				sbmObj.rejectFunc	 = reject;
				if (option.processMsg && option.processMsg == 'schMenu'){
					sbmObj.processMsg = "";
				} else if (option.processMsg != undefined ) {
					sbmObj.processMsg = option.processMsg;	
				}  else {
					sbmObj.processMsg = "로딩중 입니다...";
				}
	//			if (sbmObj.id.includes('sbm_menu')) {
	//				sbmObj.processMsg = "";
	//			}
				// customSubmissionHandler 
				// sbmObj.customHandler = "gcm.sbm._customSubmissionHandler";
				// sbmObj.errorHandler = "gcm.sbm._customErrorHandler";
				scopeScwin.$w.executeSubmission(sbmObj, reqPayload, option.compObj);
			}
		} catch (e) {
			console.error("[gcm.sbm.execute] Exception :: " + e);
		}
	});
	
	function makeTargetItem(id, key) {
		if (key) {
			return '{"id":"'+ gcm.str.replaceAll(id, '"', '') + '","key":"'+ gcm.SBM_INFO.RES_DATA +"."+ gcm.str.replaceAll(key, '"', '') +'"}';
		} else {
			return '{"id":"'+ gcm.str.replaceAll(id, '"', '') + '","key":"'+ gcm.SBM_INFO.RES_DATA +'"}';
		}
	};
};

/**
 * Submission를 동적으로 생성해서 실행합니다.
 *
 * @memberof gcm.sbm
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} sbmOption Submission 생성 옵션 JSON 객체
 * @param {String} sbmOption.id submission 객체의 ID. 통신 모듈 실행 시 필요.
 * @param {String} sbmOption.ref 서버로 보낼(request) DataCollection의 조건 표현식.(조건에 때라 표현식이 복잡하다) 또는 Instance Data의 XPath.
 * @param {String} sbmOption.target 서버로 응답(response) 받은 데이터가 위치 할 DataCollection의 조건 표현식. 또는 Instance Data의 XPath.
 * @param {String} sbmOption.action 통신 할 서버 측 URI.(브라우저 보안 정책으로 crossDomain은 지원되지 않는다.)
 * @param {Function} sbmOption.submitDoneHandler {script type="javascript" ev:event="xforms-submit-done"} 에 대응하는 함수
 * @param {Object} option execute 함수 실행 옵션 JSON 객체 (gcm.sbm.execute 함수 option 참조)
 */
gcm.sbm.executeDynamic = async function(scopeScwin, sbmOption, option) {
	try {
		var submissionObj = gcm.util.getComponent(scopeScwin, sbmOption.id);

		if (submissionObj === null) {
			gcm.sbm.create(scopeScwin, sbmOption);
			submissionObj = gcm.util.getComponent(scopeScwin, sbmOption.id);
		} else {
			scopeScwin.$w.deleteSubmission(sbmOption.id);
			gcm.sbm.create(scopeScwin, sbmOption);
			submissionObj = gcm.util.getComponent(scopeScwin, sbmOption.id);
		}

		return await gcm.sbm.execute(scopeScwin, submissionObj, option);
	} catch (e) {
		console.error("[gcm.sbm.executeDynamic] Exception :: " + e);
	}
};

/**
 * workflow를 실행합니다.
 *
 * @memberof gcm.sbm
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} options workflow 객체 or workflow 아이디
 */
gcm.sbm.executeWorkflow = function(scopeScwin, workflowObj) {
	try {
		scopeScwin.$w.executeWorkflow(workflowObj);
	} catch (e) {
		console.error("[gcm.sbm.executeWorkflow] Exception :: " + e);
	}
};

/**
 * Submission 객체를 동적으로 생성한다.
 *
 * @memberof gcm.sbm
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} options Submission 생성 옵션 JSON 객체
 * @param {String} options.id submission 객체의 ID. 통신 모듈 실행 시 필요.
 * @param {String} options.ref 서버로 보낼(request) DataCollection의 조건 표현식.(조건에 때라 표현식이 복잡하다) 또는 Instance Data의 XPath.
 * @param {String} options.target 서버로 응답(response) 받은 데이터가 위치 할 DataCollection의 조건 표현식. 또는 Instance Data의 XPath.
 * @param {String} options.action 통신 할 서버 측 URI.(브라우저 보안 정책으로 crossDomain은 지원되지 않는다.)
 * @param {String} options.method [default: get, post, urlencoded-post]
 * - get : 파라메타를 url에 붙이는 방식 (HTML과 동일).
 * - post : 파라메타를 body 구간에 담는 방식 (HTML과 동일)
 * - urlencoded-post : urlencoded-post.
 * @param {String} options.mediatype [default: application/json, application/xml, text/xml, application/x-www-form-urlencoded]
 * application/x-www-form-urlencoded 웹 form 방식(HTML방식). application/json : json 방식. application/xml : XML 방식. text/xml : xml방식
 * (두 개 차이는 http://stackoverflow._com/questions/4832357 참조)
 * @param {String} options.mode [default: synchronous, synchronous] 서버와의 통신 방식.  asynchronous:비동기식.  synchronous:동기식
 */
gcm.sbm.create = function(scopeScwin, options) {
	try {
		var ref = options.ref || "";
		var target = options.target || "";
		var action = options.action; // ajax 요청주소
		var method = (options.method || "post").toLowerCase(); // get/post/put/delete
		var mediatype = options.mediatype || "application/json"; // application/x-www-form-urlencoded
		var mode = options.mode || "asynchronous"; // asynchronous(default)/synchronous(비권장, 추후 브라우저에서 지원 안할 수도 있음)
		var instance = options.instance || "none";
//		var submitHandler = (typeof options.submitHandler === "function") ? options.submitHandler
//				: ((typeof options.submitHandler === "string") ? scopeScwin.$w.id + options.submitHandler : "");
//		var submitDoneHandler = (typeof options.submitDoneHandler === "function") ? options.submitDoneHandler
//				: ((typeof options.submitDoneHandler === "string") ? scopeScwin.$w.id + options.submitDoneHandler : "");
//		var submitErrorHandler = (typeof options.submitErrorHandler === "function") ? options.submitErrorHandler
//				: ((typeof options.submitErrorHandler === "string") ? scopeScwin.$w.id + options.submitErrorHandler : "");

		var submissionObj = {
				  "id" : options.id // submission 객체의 ID. 통신 모듈 실행 시 필요.
				, "ref" : ref // 서버로 보낼(request) DataCollection의 조건 표현식.(조건에 때라 표현식이 복잡하다) 또는 Instance Data의 XPath.
				, "target" : target // 서버로 응답(response) 받은 데이터가 위치 할 DataCollection의 조건 표현식. 또는 Instance Data의 XPath.
				, "action" : action // 통신 할 서버 측 URI.(브라우저 보안 정책으로 crossDomain은 지원되지 않는다.)
				, "method" : method // [default: post, get, urlencoded-post] get:파라메타를 url에 붙이는 방식 (HTML과 동일).
				// post:파라메타를 body 구간에 담는 방식 (HTML과 동일). urlencoded-post:urlencoded-post.
				, "mediatype" : mediatype // application/json
				, "mode" : mode // [default: asynchronous, synchronous] 서버와의 통신 방식. asynchronous:비동기식. synchronous:동기식
				, "encoding" : "UTF-8" // [default: utf-8, euc-kr, utf-16] 서버 측 encoding 타입 설정 (euc-kr/utf-16/utf-8)
//				, "submitHandler" : submitHandler
//				, "submitDoneHandler" : submitDoneHandler // {script type="javascript" ev:event="xforms-submit-done"} 에 대응하는 함수
//				, "submitErrorHandler" : submitErrorHandler // {script type="javascript" ev:event="xforms-submit-error"} 에 대응하는 함수
		};

		scopeScwin.$w.createSubmission(submissionObj);
	} catch (e) {
		console.error("[gcm.sbm.create] Exception :: " + e);
	}
};

/**
 * response 의 elHeader 정보를 가져온다.
 *
 * @memberof gcm.sbm
 * @param {Object} e submission submitdone 이벤트의 e 객체
 */
gcm.sbm.getElHeader = function(e) {
	try {
		if (gcm.util.isEmpty(e.responseJSON)) {
			return null;
		}
		return e.responseJSON[gcm.SBM_INFO.RES_META];
	} catch (e) {
		console.error("[gcm.sbm.getElHeader] Exception :: " + e);
		return null;
	}
};

/**
 * response 의 resCode 정보를 가져온다.
 *
 * @memberof gcm.sbm
 * @param {Object} e submission submitdone 이벤트의 e 객체
 */
gcm.sbm.getResCode = function(e) {
	try {
		var resMeta = gcm.sbm.getElHeader(e);
		if (gcm.util.isEmpty(resMeta)) {
			return null;
		}
		return resMeta[gcm.SBM_INFO.RES_CD];
	} catch (e) {
		console.error("[gcm.sbm.getResCode] Exception :: " + e);
		return null;
	}
};

/**
 * response 의 resMsg 정보를 가져온다.
 *
 * @memberof gcm.sbm
 * @param {Object} e submission submitdone 이벤트의 e 객체
 */
gcm.sbm.getResMsg = function(e) {
	try {
		var resMeta = gcm.sbm.getElHeader(e);
		if (gcm.util.isEmpty(resMeta)) {
			return null;
		}
		return resMeta[gcm.SBM_INFO.RES_MSG];
	} catch (e) {
		console.error("[gcm.sbm.getResMsg] Exception :: " + e);
		return null;
	}
};

/**
 * response 의 IS_SUCC (성공여부) 정보를 가져온다.
 *
 * @memberof gcm.sbm
 * @param {Object} e submission submitdone 이벤트의 e 객체
 */
gcm.sbm.isSucc = function(e) {
	try {
		var resMeta = gcm.sbm.getElHeader(e);
		if (gcm.util.isEmpty(resMeta)) {
			return null;
		}
		return resMeta[gcm.SBM_INFO.IS_SUCC];
	} catch (e) {
		console.error("[gcm.sbm.isSuccs] Exception :: " + e);
		return null;
	}
};

/**
 * response 의 elData 정보를 가져온다.
 *
 * @memberof gcm.sbm
 * @param {Object} e submission submitdone 이벤트의 e 객체
 */
gcm.sbm.getElData = function(e) {
	try {
		if (gcm.util.isEmpty(e.responseJSON)) {
			return null;
		}
		return e.responseJSON[gcm.SBM_INFO.RES_DATA];
	} catch (e) {
		console.error("[gcm.sbm.getElData] Exception :: " + e);
		return null;
	}
};

/**
 * 유효성 체크와 관련된 함수를 작성한다.
 *
 * @class valid
 * @namespace gcm.valid
 */
gcm.valid = {};

/**
 * 유효성 검사 결과 메시지를 반환한다.
 *
 * @memberof gcm.valid
 * @param {Object} valInfo 유효성 검사 옵션
 * @param {String} value 값
 * @param {Number} rowIndex 그리드의 rowIndex
 * @return {Object} msgInfo 유효성 검사 결과 메시지 정보 <br/>
 * 					msgInfo.msgType {String} 메시지 타입("1" : 기본 검사 항목, "2" : 사용자 정의 함수(valInfo) 검사 항목) <br/>
 *					msgInfo.message {String} 검사 결과 메시지 내용
 */
gcm.valid._getValResultMsg = function(valInfo, value, rowIndex) {
	try {
		var msgInfo = { msgType : "1", message : "" };
		if ((typeof valInfo.mandatory !== "undefined") && (valInfo.mandatory === true) && gcm.util.isEmpty(value)) {
			msgInfo.message = gcm.lang.getMsg("message.xom.wq.004"/*필수 입력 항목 입니다.*/);
		} else if ((typeof valInfo.minLength !== "undefined") && (valInfo.minLength > 0) && (!gcm.util.isEmpty(value) && value.length < valInfo.minLength)) {
			msgInfo.message = gcm.lang.getMsg("message.xom.wq.005"/*최소 {0}자리 이상 입력해야 합니다.*/, valInfo.minLength);
		} else if ((typeof valInfo.minByteLength !== "undefined") && (valInfo.minByteLength > 0) && (!gcm.util.isEmpty(value) && gcm.str.getByteLength(value) < valInfo.minByteLength)) {
			msgInfo.message = gcm.lang.getMsg("message.xom.wq.006"/*최소 {0}바이트 이상 입력해야 합니다.*/, valInfo.minByteLength);
		} else if ((typeof valInfo.maxLength !== "undefined") && (valInfo.maxLength > 0) && (!gcm.util.isEmpty(value) && value.length > valInfo.maxLength)) {
			msgInfo.message = gcm.lang.getMsg("message.xom.wq.007"/*최대 {0}자리 이하로 입력해야 합니다.*/, valInfo.maxLength);
		} else if ((typeof valInfo.maxByteLength !== "undefined") && (valInfo.maxByteLength > 0) && (!gcm.util.isEmpty(value) && gcm.str.getByteLength(value) > valInfo.maxByteLength)) {
			msgInfo.message = gcm.lang.getMsg("message.xom.wq.008"/*최대 {0}바이트 이하로 입력해야 합니다.*/, valInfo.maxByteLength);
		} else if ((typeof valInfo.allowChar !== "undefined") && !gcm.util.isEmpty(value) && (new RegExp("[^" + valInfo.allowChar + "]").test(value))) {
			msgInfo.message = gcm.lang.getMsg("message.xom.wq.009"/*허용된 문자({0})만 입력해야 합니다.*/, valInfo.allowChar);
		} else if ((typeof valInfo.ignoreChar !== "undefined") && !gcm.util.isEmpty(value) && (new RegExp("[" + valInfo.ignoreChar + "]").test(value))) {
			msgInfo.message = gcm.lang.getMsg("message.xom.wq.010"/*허용되지 않은 문자({0})가 입력되었습니다.*/, valInfo.ignoreChar);
		} else if ((typeof valInfo.isEmail !== "undefined") && (valInfo.isEmail) && (gcm.util.isEmpty(value) === false) && (gcm.str.isEmail(value) === false)) {
			msgInfo.message = gcm.lang.getMsg("message.xom.wq.011"/*유효한 이메일 주소가 아닙니다.*/);
		} else if ((typeof valInfo.isPhone !== "undefined") && (valInfo.isPhone) && (gcm.util.isEmpty(value) === false) && (gcm.str.isPhone(value) === false)) {
			msgInfo.message = gcm.lang.getMsg("message.xom.wq.012"/*유효한 전화번호가 아닙니다.*/);
		} else if (typeof valInfo.valFunc === "function") {
			var resultMsg = valInfo.valFunc(value, rowIndex);
			if (gcm.util.isEmpty(resultMsg) === false) {
				msgInfo.msgType = "2";
				msgInfo.message = resultMsg;
			}
		}
		return msgInfo;
	} catch (e) {
		console.error("[gcm.valid._getValResultMsg] Exception :: " + e);
		return null;
	}
};

/**
 * 그룹안에 포함된 컴포넌트의 입력 값에 대한 유효성을 설정한다.
 * ( 컴포넌트의 유효성 관련 속성과, valInfoArr 유효성 옵션을 동기화 한다. 둘 다 설정되어 있으면 valInfoArr가 적용된다. )
 *
 * @memberof gcm.valid
 * @param {Object} groupObj 그룹 컴포넌트 객체
 * @param {Array} valInfoArr 유효성 검사 옵션
 * @param {String} valInfoArr[].id 유효성 검사 대상 DataCollection 컬럼 아이디
 * @param {String} valInfoArr[].label 유효성 검사 실패 시 출력할 레이블 코드 (다국어 적용시 필수, DataCollection 컬럼명을 참조하지 않고 싶은 경우 사용함)
 * @param {Boolean} valInfoArr[].mandatory 필수 입력 값 여부
 * @param {Number} valInfoArr[].minLength 최소 입력 자리수
 * @param {Number} valInfoArr[].minByteLength 최소 입력 자리수 (Byte 단위)
 * @param {Number} valInfoArr[].maxLength 최대 입력 자리수
 * @param {Number} valInfoArr[].maxByteLength 최대 입력 자리수 (Byte 단위)
 * @param {String} valInfoArr[].allowChar 허용 문자
 * @param {String} valInfoArr[].ignoreChar 비허용 문자
 * @param {Boolean} valInfoArr[].isEmail 이메일 유효성 검사 실행
 * @param {Boolean} valInfoArr[].isPhone 전화번호 유효성 검사 수행
 * @param {Function} valInfoArr[].valFunc 사용자 유효성 검사 함수
 */
gcm.valid.setValidGroup = function (groupObj, valInfoArr) {
	try {
		if (gcm.util.isEmpty(groupObj)) {
			console.error("[gcm.valid.setValidGroup] groupObj is null!!!");
			return;
		}
		if (gcm.util.isEmpty(valInfoArr)) {
			console.error("[gcm.valid.setValidGroup] valInfoArr is null!!!");
			return;
		}
		var scopeScwin = groupObj.getScopeWindow().scwin;
		var objArr = gcm.util.getChildren(groupObj, { // 사용자 입력 컴포넌트만
			includePlugin: "input searchbox secret textarea editor",
			recursive: true
		});
		for (var objIdx in objArr) {
			var obj = objArr[objIdx];
			var dataObjInfo = gcm.data.getDataCollection(obj);
			var dataCollection = null;
			var columnId = null;
			if ((dataObjInfo !== undefined) && (dataObjInfo !== null) && !dataObjInfo.runtimeDataCollectionId.startsWith("null_")) {
				dataCollection = scopeScwin.$w.getComponentById(dataObjInfo.runtimeDataCollectionId);
				columnId = dataObjInfo.columnId;
			}
			var valInfo = { id : columnId };
			for (var valIdx in valInfoArr) {
				if ((typeof valInfoArr[valIdx].id !== "undefined") && (valInfoArr[valIdx].id === columnId)) {
					valInfo = valInfoArr[valIdx];
					break;
				}
			}
			// valInfo와 컴포넌트 속성 동기화 ( valInfo에만 설정한 경우 컴포넌트 속성에도 적용, 컴포넌트 속성에만 설정한 경우 valInfo에 추가 )
			// mandatory
			if (!gcm.util.isEmpty(valInfo.mandatory)) {
				obj.setMandatory(valInfo.mandatory);
			} else if (gcm.util.isEmpty(valInfo.mandatory) && !gcm.util.isEmpty(obj.options.mandatory) && obj.options.mandatory === true) {
				valInfo.mandatory = obj.options.mandatory;
			}
			// minlength
			if (!gcm.util.isEmpty(valInfo.minLength)) {
				obj.setMinLength(valInfo.minLength);
			} else if (gcm.util.isEmpty(valInfo.minLength) && !gcm.util.isEmpty(obj.options.minlength) && Number(obj.options.minlength) > 0) {
				valInfo.minLength = obj.options.minlength;
			}
			// minByteLength
			if (!gcm.util.isEmpty(valInfo.minByteLength)) {
				obj.setMinByteLength(valInfo.minByteLength);
			} else if (gcm.util.isEmpty(valInfo.minByteLength) && !gcm.util.isEmpty(obj.options.minByteLength) && Number(obj.options.minByteLength) > 0) {
				valInfo.minByteLength = obj.options.minByteLength;
			}
			// maxlength
			if (!gcm.util.isEmpty(valInfo.maxLength)) {
				obj.setMaxLength(valInfo.maxLength);
			} else if (gcm.util.isEmpty(valInfo.maxLength) && !gcm.util.isEmpty(obj.options.maxlength) && Number(obj.options.maxlength) > 0) {
				valInfo.maxLength = obj.options.maxlength;
			}
			// maxByteLength
			if (!gcm.util.isEmpty(valInfo.maxByteLength)) {
				obj.setMaxByteLength(valInfo.maxByteLength);
			} else if (gcm.util.isEmpty(valInfo.maxByteLength) && !gcm.util.isEmpty(obj.options.maxByteLength) && Number(obj.options.maxByteLength) > 0) {
				valInfo.maxByteLength = obj.options.maxByteLength;
			}
			// allowChar
			if (!gcm.util.isEmpty(valInfo.allowChar)) {
				// textarea에는 setAllowChar 함수 지원 안함
//				if (obj.getPluginName() != "textarea" && typeof obj.setIgnoreChar == 'function') { 
//					obj.setAllowChar(valInfo.allowChar);
//				}
				obj.validator.addCommand(new WebSquare.validator.allowCharCommand(valInfo.allowChar));
			} else if (gcm.util.isEmpty(valInfo.allowChar) && !gcm.util.isEmpty(obj.options.allowChar)) {
				valInfo.allowChar = obj.options.allowChar;
			}
			// ignoreChar
			if (!gcm.util.isEmpty(valInfo.ignoreChar)) {
				// setIgnoreChar 함수 버그 보완
//				obj.setIgnoreChar(valInfo.ignoreChar);
				obj.validator.addCommand(new WebSquare.validator.ignoreCharCommand(valInfo.ignoreChar));
			} else if (gcm.util.isEmpty(valInfo.ignoreChar) && !gcm.util.isEmpty(obj.options.ignoreChar)) {
				valInfo.ignoreChar = obj.options.ignoreChar;
			}
		}
		groupObj.setUserData("valInfoArr", valInfoArr);
	} catch (e) {
		console.error("[gcm.valid.setValidGroup] Exception :: " + e);
	} finally {
		objArr = null;
	}
};

/**
 * 그룹안에 포함된 컴포넌트의 입력 값에 대해 gcm.valid.setValidGroup의 설정값 기준으로 유효성을 검사한다. 
 *
 * @memberof gcm.valid
 * @param {Object} groupObj 그룹 컴포넌트 객체
 * @param {Object} tacObj 그룹이 포함된 TabControl 컴포넌트 아이디
 * @param {String} tabId 그룹이 포함된 TabControl 컴포넌트의 Tab 아이디
 * @returns {Boolean} 유효성 검사 결과
 */
gcm.valid.validateGroup = function (groupObj, tacObj, tabId) {
	try {
		if (gcm.util.isEmpty(groupObj)) {
			console.error("[gcm.valid.validateGroup] groupObj is null!!!");
			return false;
		}
		if (gcm.util.isEmpty(groupObj.getUserData("valInfoArr"))) {
			console.error("[gcm.valid.validateGroup] valInfoArr is null!!!");
			return false;
		}
		var valInfoArr = groupObj.getUserData("valInfoArr");
		var scopeScwin = groupObj.getScopeWindow().scwin;
		var objArr = gcm.util.getChildren(groupObj, {
			includePlugin: "checkbox checkcombobox datePicker editor input inputCalendar multiselect radio selectbox searchbox secret textarea",
			recursive: true
		});
		var errors = [];
		for (var objIdx in objArr) {
			var obj = objArr[objIdx];
			var dataObjInfo = gcm.data.getDataCollection(obj);
			var dataCollection = null;
			var columnId = null;
			var value = null;
			if (!gcm.util.isEmpty(dataObjInfo) && !dataObjInfo.runtimeDataCollectionId.startsWith("null_")) {
				dataCollection = scopeScwin.$w.getComponentById(dataObjInfo.runtimeDataCollectionId);
				columnId = dataObjInfo.columnId;
			}
			if (!gcm.util.isEmpty(dataCollection) && (dataCollection.getObjectType() === "dataMap")) {
				value = dataCollection.get(dataObjInfo.columnId);
				if (typeof value === "string") {
					value = value.trim();
				}
			} else {
				var tempIdArr = obj.getID().split("_");
				if (obj.getPluginName() !== "editor") {
					if ((typeof obj.getValue === "function")) {
						value = obj.getValue();
						if (typeof value === "string") {
							value = value.trim();
						}
					} else {
						continue;
					}
				} else {
					value = obj.getText();
					if (typeof value === "string") {
						value = value.trim();
					}
				}
			}
			var valInfo = { id : columnId };
			for (var valIdx in valInfoArr) {
				if ((typeof valInfoArr[valIdx].id !== "undefined") && (valInfoArr[valIdx].id === columnId)) {
					valInfo = valInfoArr[valIdx];
					break;
				}
			}
			if (Object.keys(valInfo).length > 1) {
				// 유효성 체크
				var msgInfo = gcm.valid._getValResultMsg(valInfo, value); 
				var objId = obj.getID();
				if (gcm.util.isEmpty(msgInfo.message) === false) {
					var comObj = scopeScwin.$w.getComponentById(objId);
					var errIdx = errors.length;
					errors[errIdx] = {};
					errors[errIdx].columnId = valInfo.id;
					errors[errIdx].objId = objId;
					if (gcm.util.isEmpty(valInfo.label) === false) {
						errors[errIdx].columnName = gcm.lang.getLabel(valInfo.label);
					} else if (!gcm.util.isEmpty(dataCollection)) {
						errors[errIdx].columnName = gcm.valid.getColumnName(comObj);
					} else if (typeof comObj.getInvalidMessage === "function") {
						errors[errIdx].columnName = comObj.getInvalidMessage();
					}
					if (msgInfo.msgType == "2") {
						errors[errIdx].message = msgInfo.message;
					} else {
						if (gcm.util.isEmpty(errors[errIdx].columnName) === false) {
							errors[errIdx].message = gcm.str.attachPostposition(errors[errIdx].columnName) + " " + msgInfo.message;
						} else {
							errors[errIdx].message = msgInfo.message;
						}
					}
				}
			}
		}
		if (errors.length > 0) {
			if (!gcm.util.isEmpty(tacObj) && !gcm.util.isEmpty(tabId)) {
				var tabIndex = tacObj.getTabIndex(tabId);
				tacObj.setSelectedTabIndex(tabIndex);
			}
			gcm.pop.warn(scopeScwin, errors[0].message, function() {
				var obj = scopeScwin.$w.getComponentById(errors[0].objId);
				setTimeout(function() {
					obj.focus();
				}, 100);
			});
			return false;
		} else {
			return true;
		}
	} catch (e) {
		console.error("[gcm.valid.validateGroup] Exception ::" + e);
		//console.error("Exception :: Object Id : " + obj.getID() + ", Plug-in Name: " + obj.getPluginName() + ", " + ex.message);
	} finally {
		objArr = null;
	}
};


/**
 * 유효성 규칙 배열에 데이터 컬렉션 실제 값과  컬럼명을 믹스인해서 반환한다.
 *
 * @memberof gcm.valid
 * @param {Object} valInfo 유효성 검사 옵션
 * @param {Object} Array 유효성 검사 옵션에 데이터 콜렉션 데이터를 바인딩 한다. 
 * @return {Object} Array valInfo 유효성 검사 규칙 및 해당 데이터 컬렉션 정보 <br/>
 * 					      valInfo.index {Integer} 데이터 컬렉션이 dataList 인 경우 rowIndex <br/>
 *					      valInfo.value {String} 해당 아이디에 바인딩 된 데이터 컬렉션의 값 <br/>
  *					      valInfo.columnName {String} 해당 아이디에 바인딩 된 데이터 컬렉션의 네임정보 <br/>
 */
gcm.valid._mixInDataToValidArray = function(dataObj, valInfoArr) {
	var metaData;
	var values = [];
	var dataType = dataObj.getObjectType().toLowerCase();
	if ("datalist" == dataType) {
		values = values.concat( dataObj.getAllJSON());
		metaData = dataObj.getInfo().columnInfo;
		
	} else if ("datamap" == dataType) {
		values.push( dataObj.getJSON());
		metaData = dataObj.getInfo().keyInfo;

	}

	var result = [];
	valInfoArr.forEach( function (valInfo){
		
		// 데이터 컬력션에 바인딩 된 값을 유효성 룰 배열에 믹스인한다.
		values.forEach( function( valueData, index){
			Object.keys(valueData).map(function (key) {
				if ((typeof valInfo.id !== "undefined") && (valInfo.id === key)) {
					// 마지막 건만 처리되는 현상이 있어 깊은 복사로 신규 컬랙션을 생성하여 반환되도록 수정
					var element = Object.assign({}, valInfo);
					element.value = valueData[key];
					element.index = index;

					// 데이터 컬력션에 바인딩 된 컬럼명을 유효성 룰 배열에 믹스인한다.
					Object.keys(metaData).map(function (key) {
						if ((typeof valInfo.id !== "undefined") && (valInfo.id === key)) {
							element.columnName = metaData[key].name;
						}
					});
					
					result.push( element);
				}				
			});
		});
	});

	return result;
};

/**
 * 데이터 콜랙션에 포함된 컴포넌트의 입력 값에 대해 valInfoArr 값 기준으로 유효성을 검사한다. 
 *
 * @memberof gcm.valid
 * @param {Object} dataObj dataCollection 객체
 * @param {Object} valInfoArr 유효성 검사 규칙 배열 객체.
 * @returns {Boolean} 유효성 검사 결과
 */
gcm.valid.validateData = function (dataObj, valInfoArr, isCheckModified) {
	try {
		if (gcm.util.isEmpty(dataObj)) {
			console.error("[gcm.valid.validateData] dataObj is null!!!");
			return false;
		}
		if (gcm.util.isEmpty(valInfoArr)) {
			console.error("[gcm.valid.validateData] valInfoArr is null!!!");
			return false;
		}
		// 변경여부 확인
		var scopeScwin = dataObj.getScopeWindow().scwin;
		if (isCheckModified !== false && !gcm.valid.isModified(dataObj)) {	
			gcm.pop.warn(scopeScwin, "message.xom.wq.013"/*변경된 정보가 없습니다.*/);
			return false;
		}

		var errors = [];
		// 믹스인 내부 메소드 호출
		var valInfoArr = gcm.valid._mixInDataToValidArray(dataObj, valInfoArr);
		valInfoArr.forEach( function (valInfo){

			// 유효성 체크 및 메시지 반환 내부 메소드 호출
			var msgInfo = gcm.valid._getValResultMsg(valInfo, valInfo.value, valInfo.index);
			if (gcm.util.isEmpty(msgInfo.message) === false) {
				var errIdx = errors.length;
				errors[errIdx] = {};
				errors[errIdx].columnId = valInfo.id;
				
				if (false === gcm.util.isEmpty(valInfo.columnName)) {
					errors[errIdx].columnName = valInfo.columnName;
				}
				
				if ("2" == msgInfo.msgType) {
					errors[errIdx].message = msgInfo.message;
				} else {
					if (false === gcm.util.isEmpty(errors[errIdx].columnName)) {
						errors[errIdx].message = gcm.str.attachPostposition(errors[errIdx].columnName) + " " + msgInfo.message;
					} else {
						errors[errIdx].message = msgInfo.message;
					}
				}
				
				if ("datalist" == dataObj.getObjectType().toLowerCase()){
					errors[errIdx].message = (valInfo.index + 1) + " 행 " + errors[errIdx].message;
				}
			}
		});
		
		if (0 < errors.length) {
			gcm.pop.warn( scopeScwin, errors[0].message);
			return false;
		} else {
			return true;
		}
		
	} catch (e) {
		console.error("[gcm.valid.validateData] Exception :: " + e);
	}
};



/**
 * GridView를 통해서 입력된 데이터에 대해서 유효성을 설정한다.
 * ( 컬럼의 유효성 관련 속성과, valInfoArr 유효성 옵션을 동기화 한다. 둘 다 설정되어 있으면 valInfoArr가 적용된다. )
 *
 * @memberof gcm.valid
 * @param {Object} gridObj GridView 객체
 * @param {Array} valInfoArr 유효성 검사 옵션
 * @param {String} valInfoArr[].id 유효성 검사 대상 DataCollection 컬럼 아이디
 * @param {String} valInfoArr[].label 유효성 검사 실패 시 출력할 레이블 코드 (다국어 적용시 필수, DataCollection 컬럼명을 참조하지 않고 싶은 경우 사용함)
 * @param {Boolean} valInfoArr[].mandatory 필수 입력 값 여부
 * @param {Number} valInfoArr[].minLength 최소 입력 자리수
 * @param {Number} valInfoArr[].minByteLength 최소 입력 자리수 (Byte 단위)
 * @param {Number} valInfoArr[].maxLength 최대 입력 자리수
 * @param {Number} valInfoArr[].maxByteLength 최대 입력 자리수 (Byte 단위)
 * @param {String} valInfoArr[].allowChar 허용 문자
 * @param {String} valInfoArr[].ignoreChar 비허용 문자
 * @param {Boolean} valInfoArr[].isEmail 이메일 유효성 검사 실행
 * @param {Boolean} valInfoArr[].isPhone 전화번호 유효성 검사 수행
 * @param {Function} valInfoArr[].valFunc 사용자 유효성 검사 함수
 */
gcm.valid.setValidGrid = function (gridObj, valInfoArr) {
	try {
		if (gcm.util.isEmpty(gridObj)) {
			console.error("[gcm.valid.setValidGrid] groupObj is null!!!");
			return;
		}
		if (gcm.util.isEmpty(valInfoArr)) {
			console.error("[gcm.valid.setValidGrid] valInfoArr is null!!!");
			return;
		}
		for (var valIdx in valInfoArr) {
			var valInfo = valInfoArr[valIdx];
			if (!gcm.util.isEmpty(valInfo.id)) {
				var obj = gridObj.getCellInfo(valInfo.id);
				var iObj = gridObj.getInput(obj);
				// maxLength
				if (!gcm.util.isEmpty(valInfo.maxLength)) {
					gridObj.setMaxLength(valInfo.id, valInfo.maxLength);
				} else if (gcm.util.isEmpty(valInfo.maxLength) && !gcm.util.isEmpty(obj.options.maxLength) && Number(obj.options.maxLength) > 0) {
					valInfo.maxLength = obj.options.maxLength;
				}
				// maxByteLength
				if (!gcm.util.isEmpty(valInfo.maxByteLength)) {
					obj.options.maxByteLength = valInfo.maxByteLength;
					iObj.setMaxByteLength(valInfo.maxByteLength);
				} else if (gcm.util.isEmpty(valInfo.maxByteLength) && !gcm.util.isEmpty(obj.options.maxByteLength) && Number(obj.options.maxByteLength) > 0) {
					valInfo.maxByteLength = obj.options.maxByteLength;
				}
				// allowChar
				if (!gcm.util.isEmpty(valInfo.allowChar)) {
					gridObj.setAllowChar(valInfo.id, valInfo.allowChar);
				} else if (gcm.util.isEmpty(valInfo.allowChar) && !gcm.util.isEmpty(obj.options.allowChar)) {
					valInfo.allowChar = obj.options.allowChar;
				}
				// ignoreChar
				if (!gcm.util.isEmpty(valInfo.ignoreChar)) {
					obj.options.ignoreChar = valInfo.ignoreChar;
					iObj.validator.addCommand(new WebSquare.validator.ignoreCharCommand(valInfo.ignoreChar));
				} else if (gcm.util.isEmpty(valInfo.ignoreChar) && !gcm.util.isEmpty(obj.options.ignoreChar)) {
					valInfo.ignoreChar = obj.options.ignoreChar;
				}
			}
			gridObj.setUserData("valInfoArr", valInfoArr);
		}
	} catch (e) {
		console.error("[gcm.valid.setValidGrid] Exception :: " + e);
	}
};

/**
 * GridView를 통해서 입력된 데이터에 대해서 gcm.valid.setValidGrid의 설정값 기준으로 유효성을 검사한다. 
 *
 * @memberof gcm.valid
 * @param {Object} gridObj GridView 객체
 * @param {Object} tacObj GridView가 포함된 TabControl 컴포넌트 객체
 * @param {String} tabId GridView가 포함된 TabControl 컴포넌트의 Tab 아이디
 * @param {Boolean} isCheckModified [Default : false] true로 설정시 변경여부 체크
 * @returns {Boolean} 유효성검사 결과
 */
gcm.valid.validateGrid = function (gridObj, tacObj, tabId, isCheckModified) {
	try {
		if (gcm.util.isEmpty(gridObj)) {
			console.error("[gcm.valid.validateGrid] gridObj is null!!!");
			return false;
		}
		if (gcm.util.isEmpty(gridObj.getUserData("valInfoArr"))) {
			console.error("[gcm.valid.validateGrid] valInfoArr is null!!!");
			return false;
		}
		var valInfoArr = gridObj.getUserData("valInfoArr");
		var scopeScwin = gridObj.getScopeWindow().scwin;
		var dataList = gcm.grid.getGridDataList(gridObj);
		if (gcm.util.isEmpty(dataList)) {
			console.error("[gcm.valid.validateGrid] datalist is null!!!");
			return false;
		}
		// 변경여부 확인
		if (isCheckModified !== false && !gcm.valid.isModified(dataList)) {
			gcm.pop.warn(scopeScwin, "message.xom.wq.013"/*변경된 정보가 없습니다.*/);
			return false;
		}
		var errors = [];
		var modifiedIdx = dataList.getModifiedIndex();
		for (var dataIdx = 0; dataIdx < modifiedIdx.length; dataIdx++) {
			var valInfo = {};
			var isVaild = false;

			var modifiedData = dataList.getRowJSON(modifiedIdx[dataIdx]);
			if (modifiedData.rowStatus === "D") {
				continue;
			}

			for (var valIdx in valInfoArr) {
				var valInfo = valInfoArr[valIdx];
				if ((typeof valInfo.id !== "undefined") && (modifiedData[valInfo.id] !== "undefined")) {
					var value = modifiedData[valInfo.id];
					if (typeof value === "string") {
						value = value.trim();
					}
					var rowIndex = modifiedIdx[dataIdx];
					// 유효성 체크
					var msgInfo = gcm.valid._getValResultMsg(valInfo, value, rowIndex);
					var gridObjId = gridObj.getID();
					if (gcm.util.isEmpty(msgInfo.message) === false) {
						var errIdx = errors.length;
						errors[errIdx] = {};
						errors[errIdx].columnId = valInfo.id;
						errors[errIdx].objId = gridObjId;
						if (gcm.util.isEmpty(valInfo.label) === false) {
							errors[errIdx].columnName = gcm.lang.getLabel(valInfo.label);
						} else {
							errors[errIdx].columnName = dataList.getColumnName(valInfo.id);
						}
						errors[errIdx].rowIndex = rowIndex;

						if (msgInfo.msgType == "2") {
							errors[errIdx].message = msgInfo.message;
						} else {
							errors[errIdx].message = gcm.str.attachPostposition(errors[errIdx].columnName) + " " + msgInfo.message;
						}
					}
				}
			}
		}
		if (errors.length > 0) {
			if (!gcm.util.isEmpty(tacObj) && !gcm.util.isEmpty(tabId)) {
				var tabIndex = tacObj.getTabIndex(tabId);
				tacObj.setSelectedTabIndex(tabIndex);
			}
			gcm.pop.warn(scopeScwin, errors[0].message, function(param) {
				var gridObj = scopeScwin.$w.getComponentById(errors[0].objId);
				gridObj.setFocusedCell(errors[0].rowIndex, errors[0].columnId, true);
			});
			return false;
		} else {
			return true;
		}
	} catch (e) {
		console.error("[gcm.valid.validateGrid] Exception :: " + e);
	}
};

/**
 * InputCalendar Validator를 수행한다.
 *
 * @memberof gcm.valid
 * @param {String} value 입력된 날짜 문자열
 */
gcm.valid._validateInputCalendar = function(value, compId) {
	try {
		var compObj = $w.getComponentById(compId);
		var scopeScwin = gcm.win._getScope(compObj).scwin;
		if (gcm.util.isEmpty(value) === false) {
			if (gcm.date.isDate(value) === false) {
				gcm.pop.warn(scopeScwin, "message.xom.wq.014"/*날짜 형식이 올바르지 않습니다.*/, function() {
					//compObj.setValue("");
					compObj.focus();
				});
			}
		}
		return value;
	} catch (e) {
		console.error("[gcm.valid._validateInputCalendar] Exception :: " + e);
		return value;
	}
};

/**
 * DataCollection 객체의 변경된 데이터가 있는지 검사한다.
 *
 * @memberof gcm.valid
 * @param {Object} dcObjArr DataCollection 또는 배열
 * @returns {Boolean} 검사결과 (true or false)
 */
gcm.valid.isModified = function (dcObjArr) {
	try {
		var result = false;
		if (gcm.util.getObjectType(dcObjArr) === "array") {
			for (var idx in dcObjArr) {
				if (gcm.util.getObjectType(dcObjArr[idx]) === "object") {
					if (isModified(dcObjArr[idx]) === true) {
						result = true;
					}
				}
			}
		} else if (gcm.util.getObjectType(dcObjArr) === "object") {
			result = isModified(dcObjArr);
		}
		return result;

		function isModified(dcObj) {
			if ((typeof dcObj !== "undefined") && (typeof dcObj !== null)) {
				var modifiedIndex = dcObj.getModifiedIndex();
				if (modifiedIndex.length === 0) {
					return false;
				} else {
					return true;
				}
			} else {
				return true;
			}
		}
	} catch (e) {
		console.error("[gcm.valid.isModified] Exception :: " + e);
		return null;
	}
};

/**
 * 특정 컴포넌트에 바인된 DataList나 DataMap의 컬럼 이름을 반환한다.
 *
 * @memberof gcm.valid
 * @param {Object} comObj 컴포넌트 객체
 * @return {String} 컬럼명
 */
gcm.valid.getColumnName = function (comObj) {
	try {
		if ((typeof comObj.getRef) === "function") {
			var ref = comObj.getRef();
			var refArray = ref.substring(5).split(".");
			var dataCollectionName = refArray[0];
			var columnId = refArray[1];

			if ((typeof refArray !== "undefined") && (refArray.length === 2)) {
				var dataCollection = comObj.getScopeWindow().$p.getComponentById(dataCollectionName);
				var dataType = dataCollection.getObjectType().toLowerCase();
				if (dataType === "datamap") {
					return dataCollection.getName(columnId);
				} else if (dataType === 'datalist') {
					return dataCollection.getColumnName(columnId);
				}
			} else {
				return "";
			}
		}
	} catch (e) {
		console.error("[gcm.valid.getColumnName] Exception :: " + e);
		return null;
	} finally {
		dataCollection = null;
	}
};

/**
 * 그리드 편집과 관련된 함수를 작성한다.
 *
 * @class grid
 * @namespace gcm.grid
 */
gcm.grid = {};

/**
 * GridView와 바인딩된 DataList 객체를 반환한다.
 *
 * @memberof gcm.grid
 * @param {Object} gridObj 바인딩 된 DataList가 존재하는지 검증할 GridView 객체
 * @return {Object} 바인딩 된 DataList 객체 반환 (바인된 객체가 없을 경우 null 반환)
 * @example
// 바인딩 되어있는 경우
gcm.grid.getGridDataList(grd_First);
// return 예시) "dlt_first"

// 바인딩 되어있지 않은 경우
gcm.grid.getGridDataList(grd_First);
// return 예시) undefined
 */
gcm.grid.getGridDataList = function (gridObj) {
	try {
		var scopeScwin = gcm.win._getScope(gridObj).scwin;
		var dataListId = gridObj.getDataList();
		if (dataListId !== "") {
			var dataList = scopeScwin.$w.getComponentById(dataListId);
			if ((typeof dataList === "undefined") || (dataList === null)) {
				console.log("DataList(" + dataListId + ")를 찾을 수 없습니다.");
				return null;
			} else {
				return dataList;
			}
		} else {
			console.log(gridObj.getID() + "는 DataList가 세팅되어 있지 않습니다.");
			return null;
		}
	} catch (e) {
		console.error("[gcm.grid.getGridDataList] Exception :: " + e);
		return null;
	}
};

/**
 * 지정한 GridView의 맨 아래에 행을 추가한다.
 * 여러줄을 copy&paste 하는 걸 고려해서 맨 위에 행추가 하지 않는다. 
 *
 * @memberof gcm.grid
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} gridObj GridView 객체
 * @param {String} focusColId 포커싱할 컬럼 ID
 * @param {Object} option 행추가 옵션
 * @param {Boolean} option.readOnly 다건 CUD시 행추가 후 포커싱할 컬럼의 readOnly 속성 (false시 수정 가능)
 * @param {Boolean} option.readOnlyFalseCols 다건 CUD시 readOnly=false를 추가로 적용할 컬럼 ID
 * @param {Boolean} option.checkModified 단건 CUD시 행추가 하기 전에 변경중인 정보가 있는지 체크 (true시 변경건이 있으면 행 추가 안함)
 * @return {Number} 추가된 rowIndex (null이면 추가 안된 경우)
 */
gcm.grid.addRow = function(scopeScwin, gridObj, focusColId, option) {
	try {
		var dltObj = gcm.grid.getGridDataList(gridObj);
		option = option || {};
		if (option.checkModified === true && gcm.valid.isModified(dltObj)) {
			gcm.pop.warn(scopeScwin, "message.xom.wq.015"/*변경 중인 정보를 먼저 저장 또는 취소해야 합니다.*/);
			return null;
		}
		var rowIdx = dltObj.insertRow();
		if (option.readOnly === false) {
			gridObj.setCellReadOnly(rowIdx, focusColId, false);
			if (option.readOnlyFalseCols) {
				var arrCol = option.readOnlyFalseCols.split(",");
				for (var i=0; i<arrCol.length; i++) {
					gridObj.setCellReadOnly(rowIdx, arrCol[i], false);
				}
			}
		}
		gridObj.setFocusedCell(rowIdx, focusColId || 0, true);
		return rowIdx;
	} catch (e) {
		console.error("[gcm.grid.addRow] Exception :: " + e);
		return null;
	}
};

/**
 * 지정한 GridView에 선택컬럼(chk)이 체크된 Row들의 내용으로 맨아래에 추가한다. (체크된 행이 없으면 포커스 행 복사)
 * 여러줄을 copy&paste 하는 걸 고려해서 맨 위에 행추가 하지 않는다. 
 *
 * @memberof gcm.grid
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} gridObj GridView 객체
 * @param {String} focusColId 포커싱할 컬럼 ID
 * @param {Object} option 행복사 옵션
 * @param {Boolean} option.readOnly 다건 CUD시 행복사 후 포커스 컬럼의 readOnly 속성 (false시 수정 가능)
 * @param {Boolean} option.readOnlyFalseCols 다건 CUD시 readOnly=false를 추가로 적용할 컬럼 ID
 * @param {Boolean} option.checkModified 단건 CUD시 행복사 하기 전에 변경중인 정보가 있는지 체크 (true시 변경건이 있으면 행 추가 안함)
 * @return {Array} 추가된 rowIndex 배열(null이면 복사 안된 경우)
 */
gcm.grid.copyRow = function(scopeScwin, gridObj, focusColId, option) {
	try {
		var dltObj = gcm.grid.getGridDataList(gridObj);
		var focusRowIdx = dltObj.getRowPosition() || gridObj.getFocusedRealRowIndex();
		var checkedIdx = dltObj.getMatchedIndex("chk", "Y");
		var arrReturn = [];
		if (checkedIdx.length == 0) {
			checkedIdx = dltObj.getMatchedIndex("chk", "1");
		}
		option = option || {};
		if (option.checkModified === true && gcm.valid.isModified(dltObj)) {
			gcm.pop.warn(scopeScwin, "message.xom.wq.015"/*변경 중인 정보를 먼저 저장 또는 취소해야 합니다.*/);
			return null;
		}
		if (checkedIdx.length > 0) {
			for (var idx = checkedIdx.length - 1; idx >= 0; idx--) {
				var rowIdx = dltObj.getTotalRow();
				arrReturn.push(rowIdx);
				dltObj.insertJSON(rowIdx, [dltObj.getRowJSON(checkedIdx[idx])]);
				gridObj.setCellReadOnly(rowIdx, focusColId, false);
				dltObj.setCellData(checkedIdx[idx], "chk", "");
				dltObj.setCellData(rowIdx, "chk", "");
				dltObj.setCellData(rowIdx, focusColId, "");
				if (option.readOnly === false) {
					gridObj.setCellReadOnly(rowIdx, focusColId, false);
					if (option.readOnlyFalseCols) {
						var arrCol = option.readOnlyFalseCols.split(",");
						for (var i=0; i<arrCol.length; i++) {
							gridObj.setCellReadOnly(rowIdx, arrCol[i], false);
						}
					}
				}
			}
		} else if (focusRowIdx >= 0){
			var rowIdx = dltObj.getTotalRow();
			arrReturn.push(rowIdx);
			dltObj.insertJSON(rowIdx, [dltObj.getRowJSON(focusRowIdx)]);
			dltObj.setCellData(focusRowIdx, "chk", "");
			dltObj.setCellData(rowIdx, "chk", "");
			dltObj.setCellData(rowIdx, focusColId, "");
			if (option.readOnly === false) {
				gridObj.setCellReadOnly(rowIdx, focusColId, false);
				if (option.readOnlyFalseCols) {
					var arrCol = option.readOnlyFalseCols.split(",");
					for (var i=0; i<arrCol.length; i++) {
						gridObj.setCellReadOnly(rowIdx, arrCol[i], false);
					}
				}
			}
		}
		gridObj.setFocusedCell(rowIdx, focusColId || 0);
		return arrReturn;
	} catch (e) {
		console.error("[gcm.grid.copyRow] Exception :: " + e);
		return null;
	}
};

/**
 * 지정한 GridView에 선택컬럼(chk)이 체크된 Row들을 삭제(Delete) 처리한다. (체크된 행이 없으면 포커스 행 삭제)
 *
 * @memberof gcm.grid
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} gridObj GridView 객체 또는 아이디
 */
gcm.grid.deleteRow = function(scopeScwin, gridObj) {
	try {
		var dltObj = gcm.grid.getGridDataList(gridObj);
		var focusRowIdx = dltObj.getRowPosition() || gridObj.getFocusedRealRowIndex();
//		var focusColId = gridObj.getFocusedColumnID()
		var checkedIdx = dltObj.getMatchedIndex("chk", "Y");
		if (checkedIdx.length == 0) {
			checkedIdx = dltObj.getMatchedIndex("chk", "1");
		}
		// broadcast 이용시 스크롤된 경우를 고려해서 포커스를 다시 잡아줘야 하고 동작이 자연스럽지 않음
//		dltObj.setBroadcast(false);
		gridObj.setUserData("editFlag", "delete"); // 편집 flag 삭제중 (단건 CRUD에서 추가행 삭제시 행 변경 허용을 위함)
		if (checkedIdx.length > 0) {
			for (var idx = checkedIdx.length - 1; idx >= 0; idx--) {
				if(dltObj.getRowStatus(checkedIdx[idx]) == "C") {
					dltObj.removeRow(checkedIdx[idx]);
				} else {
					dltObj.deleteRow(checkedIdx[idx]);
					dltObj.setCellData(checkedIdx[idx], "chk", "");
				}
			}
		} else if (focusRowIdx >= 0){
			if(dltObj.getRowStatus(focusRowIdx) == "C") {
				dltObj.removeRow(focusRowIdx);
			} else {
				dltObj.deleteRow(focusRowIdx);
			}
		}
//		dltObj.setBroadcast(true, true);
//		if (focusRowIdx < dltObj.getTotalRow()) {
//			gridObj.setFocusedCell(focusRowIdx, focusColId);
//		} else {
//			gridObj.setFocusedCell(dltObj.getTotalRow()-1, focusColId);
//		}
	} catch (e) {
		console.error("[gcm.grid.deleteRow] Exception :: " + e);
	} finally {
		gridObj.setUserData("editFlag", ""); // 편집 flag 초기화
	}
};

/**
 * 지정한 GridView에 선택컬럼(chk)이 체크된 Row들을 취소(Undo) 처리한다. (체크된 행이 없으면 포커스 행 취소)
 *
 * @memberof gcm.grid
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} gridObj GridView 객체
 */
gcm.grid.undoRow = function(scopeScwin, gridObj) {
	try {
		var dltObj = gcm.grid.getGridDataList(gridObj);
		var focusRowIdx = dltObj.getRowPosition() || gridObj.getFocusedRealRowIndex();
		var checkedIdx = dltObj.getMatchedIndex("chk", "Y");
		if (checkedIdx.length == 0) {
			checkedIdx = dltObj.getMatchedIndex("chk", "1");
		}
		gridObj.setUserData("editFlag", "undo"); // 편집 flag 취소중 (단건 CRUD에서 추가행 취소시 행 변경 허용을 위함)
		if (checkedIdx.length > 0) {
			for (var idx = checkedIdx.length - 1; idx >= 0; idx--) {
				dltObj.setCellData(checkedIdx[idx], "chk", ""); // oncelldatachange이벤트에서 선택건수 변경을 위해
				if(dltObj.getRowStatus(checkedIdx[idx]) == "C") {
					dltObj.removeRow(checkedIdx[idx]);
				} else {
					dltObj.undoRow(checkedIdx[idx]);
				}
			}
		} else if (focusRowIdx >= 0){
			if(dltObj.getRowStatus(focusRowIdx) == "C") {
				dltObj.removeRow(focusRowIdx);
			} else {
				dltObj.undoRow(focusRowIdx);
			}
		}
	} catch (e) {
		console.error("[gcm.grid.undoRow] Exception :: " + e);
	} finally {
		gridObj.setUserData("editFlag", ""); // 편집 flag 초기화
	}
};

/**
 * 전체 데이터를 초기 설정 된 데이터(originalData)로 바꾸고 행의 상태를 초기화(R) 시킨다.
 * 초기 설정 된 데이터 란 setJSON, setXML 등과 같은 API들을 통해 설정 된 데이터가 이에 속한다.
 * 추가(C)된 행은 제거한다
 *
 * @memberof gcm.grid
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} gridObj GridView 객체
 */
gcm.grid.undoAll = function(scopeScwin, gridObj) {
	try {
		var dltObj = gcm.grid.getGridDataList(gridObj);
		var modifiedIndex = dltObj.getModifiedIndex();
		var removeIdx = [];
		var undoIdx =[];
		if (modifiedIndex.length > 0) {
			for (var idx = modifiedIndex.length - 1; idx >= 0; idx--) {
				dltObj.setCellData(modifiedIndex[idx], "chk", ""); // oncelldatachange이벤트에서 선택건수 변경을 위해
				if(dltObj.getRowStatus(modifiedIndex[idx]) == "C") {
					removeIdx.push(modifiedIndex[idx]);
				} else {
					undoIdx.push(modifiedIndex[idx]);
					
				}
			}
		}
		dltObj.undoRows(undoIdx);
		dltObj.removeRows(removeIdx);
	} catch (e) {
		console.error("[gcm.grid.undoAll] Exception :: " + e);
	}
};

/**
 * 그리드 높이 늘이기
 *
 * @memberof gcm.grid
 * @param {Object} groupObj 그리드를 감싼 gvwbox class가 적용된 Group 객체
 * @param {Number} offset [Default : 50] 늘리려는 수치
 * @example
	gcm.grid.expandGrid(grp_test);
 */
gcm.grid.expandGrid = function (groupObj, offset) {
	try {
		var h = groupObj.getSize("height");
		offset = offset || 50;
		groupObj.addClass("flex_no");
		groupObj.setSize("height", h < 1000 ? h + offset : 1000); // 최대 높이 1000
	} catch (e) {
		console.error("[gcm.grid.expandGrid] Exception :: " + e);
	}
};

/**
 * 그리드 높이 줄이기
 *
 * @memberof gcm.grid
 * @param {Object} groupObj 리드를 감싼 gvwbox class가 적용된 Group 객체
 * @param {Number} offset [Default : 50] 줄이려는 수치
 * @example
	gcm.grid.reduceGrid(grp_test);
 */
gcm.grid.reduceGrid = function (groupObj, offset) {
	try {
		var h = groupObj.getSize("height");
		offset = offset || 50;
		groupObj.addClass("flex_no");
		groupObj.setSize("height", h - offset); // 최소 높이는 min-height에 따름
	} catch (e) {
		console.error("[gcm.grid.reduceGrid] Exception :: " + e);
	}
};

/**
 * 그리드 포커스 정보 저장 (조회 후 그리스 포커스 셋팅을 위함)
 *
 * @memberof gcm.grid
 * @param {Object} gridObj GridView 객체
 * @param {Number} rowIdx focus row index (미지정시 현재 포커스 위치 저장)
 */
gcm.grid.setFocusRow = function (gridObj, rowIdx) {
	try {
		var dltObj = gcm.grid.getGridDataList(gridObj);
		if (gcm.util.isEmpty(rowIdx)) {
			rowIdx = dltObj.getRealRowIndex(dltObj.getRowPosition());
		}
		gridObj.setUserData("focusRowIdx", rowIdx);
	} catch (e) {
		console.error("[gcm.grid.setFocusRow] Exception :: " + e);
	}
};

/**
 * 조회 후 총 건수 및 그리드 포커스 셋팅
 *
 * @memberof gcm.grid
 * @param {Object} gridObj GridView 객체
 * @param {Object} option 옵션 객체
 * @param {Object} option.tcntObj 총건수를 셋팅할 객체
 * @param {String} option.focusColId 포커싱 할 컬럼 ID
 */
gcm.grid.setGridAfterSearch = function (gridObj, option) {
	try {
		var dltObj = gcm.grid.getGridDataList(gridObj);
		// 총 건수 셋팅
		if (option.tcntObj) {
			option.tcntObj.setValue(dltObj.getTotalRow()); 
		}
		// 포커싱
		if (option.focusColId) {
			var focusRowIdx = gridObj.getUserData("focusRowIdx") || 0;
			gridObj.setFocusedCell(focusRowIdx, option.focusColId); 
			dltObj.setRowPosition(focusRowIdx); 
		}
	} catch (e) {
		console.error("[gcm.grid.setGridAfterSearch] Exception :: " + e);
	}
};

/**
 * 그리드에 단건 CUD 구현시 행변경 체크 여부
 *
 * @memberof gcm.grid
 * @param {Object} gridObj GridView 객체
 * @param {Object} info GridView에 바인딩된 dataList의 onbeforerowpositionchange 이벤트 파라미터
 * @return {Boolean} true이면 행변경 전 체크 필요, false이면 행변경 전 체크 필요 없음 (행변경 허용)
 */
gcm.grid.checkRowChange = function (gridObj, info) {
	try {
		var dltObj = gcm.grid.getGridDataList(gridObj);
		// 추가된 행 취소 또는 삭제로 인한 행 변경시에는 체크 안함 (행변경 허용)
		var editFlag = gridObj.getUserData("editFlag");
		if (editFlag == "undo" || editFlag == "delete") {
			return false;
		}
		// 최초 포커싱 및 포커스 아웃시에는 체크 안함 (행변경 허용)
		if (info.newRowIndex == null || info.oldRowIndex == null) {
			return false;
		}
		// 삭제후 재조회시에는 체크 안함 (행변경 허용)
		if (dltObj.getRowStatus(info.oldRowIndex) == undefined) {
			return false;
		}
		return true;
	} catch (e) {
		console.error("[gcm.grid.checkRowChange] Exception :: " + e);
		return true;
	}
};

/**
 * 페이징과 관련된 함수를 작성한다.
 *
 * @class page
 * @namespace gcm.page
 */
gcm.page = {};

/**
 * 페이지당 건수 공통 셋팅
 *
 * @memberof gcm.page
 * @param {Object}	sbxPageUnitObj page당 건수를 보여줄 selectbox 객체
 * @param {String}	ref page당 건수를 담을 dataMap의 Key (ex. dma_search.pageUnit)
 */
gcm.page.setPageUnit = function (sbxPageUnitObj, ref) {
	try {
//		sbxPageUnitObj.addItem(5, "5");
		sbxPageUnitObj.addItem(50, "50");
		sbxPageUnitObj.addItem(100, "100");
		sbxPageUnitObj.addItem(500, "500");
		sbxPageUnitObj.addItem(1000, "1000");
		sbxPageUnitObj.setRef("data:" + ref);		
	} catch (e) {
		console.error("[gcm.page.setPageUnit] Exception :: " + e);
	}
};

/**
 * 조회 결과에 따른 페이지 정보 셋팅
 *
 * @memberof gcm.page
 * @param {Object}   e			조회 콜백 파라미터 (내부에 paginate 정보가 들어있음)
 * @param {Object}   gridObj	페이징 하려는 GridView 객체
 * @param {Object}   cntObj		조회 건수 출력할 TextBox 객체
 * @param {Object}   tcntObj	전체 건수 출력할 TextBox 객체
 * @param {Object}   pglObj		PageList 객체 (ScrollEnd 방식인 경우 null)
 * @param {Object}   dmaObj		pageNo(페이지 번호), pageSize(페이지당 건수)가 담긴 dataMap 객체
 */
gcm.page.setPage = function(e, gridObj, cntObj, tcntObj, pglObj, dmaObj) {
	try {
		var tcnt = gcm.sbm.getElHeader(e).tcnt;
		var dltObj = gcm.grid.getGridDataList(gridObj);
		cntObj.setValue(dltObj.getTotalRow());
		tcntObj.setValue(tcnt);
		if (pglObj != null) {
			// pageList 방식
			var pageNo = dmaObj.get(gcm.SBM_INFO.PG_NO) || 1;
			var pageSize = dmaObj.get(gcm.SBM_INFO.PG_SIZE) || 50;
			var totalPages = Math.ceil(tcnt / pageSize);
			var startNum = (pageNo - 1) * pageSize;
			gridObj.setStartRowNumber(startNum);
			pglObj.setCount(totalPages, pageNo == 1 ? false : true);
		} else {
			// scrollEnd 방식
			grd_sample.setUserData("tcnt", tcnt);
		}
	} catch (e) {
		console.error("[gcm.page.setPage] Exception :: " + e);
	}
};

/**
 * 페이징 조회
 *
 * @memberof gcm.page
 * @param {Number|String} page 페이지 번호(1) 또는 다음페이지 "next" 
 * @param {Object} sbmObj submission 객체 
 * @param {Object} dmaPagingObj paging 정보를 담는 dataMap 객체 
 * @param {Object} dltObj 조회 결과를 담는 dataList 객체 
 * @example
	gcm.page.pagingExecute(page, sbm_inqClasPagedList, dma_paging, dlt_sample);
 */
gcm.page.pagingExecute = function (page, sbmObj, dmaPagingObj, dltObj) {
	try {
		var scopeScwin = sbmObj.getScopeWindow().scwin;
		if (page === 1) {
			// 첫페이지부터 새로 조회
			dmaPagingObj.set("targetRow", 1);
			dltObj.removeAll();
			gcm.sbm.execute(scopeScwin, sbmObj);
		} else if (page === "next") {
			// 조회하려는 targetRow가 전체 건수 보다 작을 경우에만 추가 조회를 한다.
			var targetRow = dmaPagingObj.get("targetRow") + dmaPagingObj.get("rowSize");
			if (targetRow < dmaPagingObj.get("rows")) {
				dmaPagingObj.set("targetRow", targetRow);
				gcm.sbm.execute(scopeScwin, sbmObj);
			}
		} else if (page === "all") {
			// 조회하려는 targetRow가 전체 건수 보다 작을 경우에만 추가 조회를 한다.
			var targetRow = dmaPagingObj.get("targetRow") + dmaPagingObj.get("rowSize");
			if (targetRow < dmaPagingObj.get("rows")) {
				dmaPagingObj.set("targetRow", targetRow);
				sbmObj.isPageAll = true;
				gcm.sbm.execute(scopeScwin, sbmObj);
			} else {
				sbmObj.isPageAll = false;
			}
		}
	} catch (e) {
		console.error("[gcm.page.pagingExecute] Exception :: " + e);
	}
};

/**
 * 엑셀 다운로드 업로드와 관련된 함수를 작성한다.
 *
 * @class xls
 * @namespace gcm.xls
 */
gcm.xls = {};

/**
 * 엑셀 다운로드 옵션에 대한 처리를 한다.
 *
 * @memberof gcm.xls
 * @param {Object} gridObj GridView Object
 * @param {Object} options JSON형태로 저장된 그리드의 엑셀 다운로드 옵션
 * @param {Boolean} options.hiddenVisible [default: false] GridView 내 Hidden 컬럼을 엑셀 다운로드 시 포함시킬지 여부 (true : 포함, false : 미포함)
 * @param {Object} options.providerInfo [default: null] Provider를 사용하여 서버에서 조회된 결과를 다운로드 하도록 옵션 설정
 * @param {String} options.providerInfo.service [default: null] Provider에서 호출할 서비스명
 * @param {String} options.providerInfo.method [default: null] Provider에서 호출할 메소드명
 * @param {Object} options.providerInfo.paramMap [default: null] Provider에서 호출할 메소드의 파라미터로 전달할 dataMap 객체
 * @param {Boolean} options.providerInfo.isSplit [default: null] SplitProvider 사용 여부
 * @param {Array} options.providerInfo.excludeColumns [default: null] Provider 사용시 keyMap에서 제외할 컬럼 ID를 배열로 설정
 */
gcm.xls._setGridDownOption = function(gridObj, options) {
	try {
		// 파일명 미설정시 기본값 설정
		var fileName = options.fileName;
		if (gcm.util.isEmpty(fileName)) {
			var dataCollectionId = gcm.data.getDataCollection(gridObj).id;
			if (gcm.util.isEmpty(dataCollectionId) === false) {
				fileName = dataCollectionId;
			} else {
				fileName = "excel_download";
			}
			if (options.fileType == undefined || options.fileType == "") {
				fileName = fileName + ".xlsx";
			} else {
				fileName = fileName + "." + options.fileType;
			}
			options.fileName = fileName;
		}
		fileName = fileName.toLowerCase();
		// 순번 사용 그리드인 경우 순번 옵션이 정의되지 않은 경우 순번 다운로드
		/* 순번 컬럼을 다운로드 후 업로드시 removeColumns : "0" 이나  startColumnIndex : "1" 옵션 적용시 마지막 컬럼이 업로드 되지 않는 문제 있음
		if (gcm.util.isEmpty(options.rowNumVisible) && gridObj.getRowNumVisible()) {
			options.rowNumVisible = true;
		}
		*/
		// hidden 컬럼 제외 로직 (화면내의 hidden컬럼을 removeColumns에 포함시켜서 엑셀 다운로드를 하지 않도록 한다.)
		// 기본값은 false, options.hiddenVisible=true 설정 시 hidden 컬럼도 다운로드 함 
		if (typeof options === "undefined") {
			options = {
					hiddenVisible: false
			}
		}
		if ((typeof options.hiddenVisible === "undefined") || (options.hiddenVisible == false)) {
			var grdCnt = gridObj.getColCnt();
			var hiddenColIndex = [];
			for (var idx = 0; idx < grdCnt; idx++) {
				if (!gridObj.getColumnVisible(idx)) {
					hiddenColIndex.push(idx);
				}
			}
			if (hiddenColIndex.length > 0) {
				if ((typeof options.removeColumns !== "undefined") && (options.removeColumns.length > 0)) {
					options.removeColumns = options.removeColumns + "," + hiddenColIndex.join(',');
				} else {
					options.removeColumns = hiddenColIndex.join(',');
				}
				// 중복 요소 제거
				var _removeColumnArr = options.removeColumns.split(",");
				options.removeColumns = _removeColumnArr.reduce(function (newObj, obj) {
					if (newObj.indexOf(obj) < 0) {
						newObj.push(obj);
					}
					return newObj;
				}, []).join(',');
			}
		}
		// Provider 사용시 관련 옵션 설정
		if (!gcm.util.isEmpty(options.providerInfo)) {
			var providerInfo = options.providerInfo;
			if (providerInfo.isSplit) {
				options.splitProvider = gcm.XLS_INFO.PKG_NM + "ExcelDownSplitProvider";
			} else {
				options.dataProvider = gcm.XLS_INFO.PKG_NM + "ExcelDownProvider";
			}
			options.providerRequestXml 	= "<data>"
										+ 	"<service>" + providerInfo.service + "</service>"
										+ 	"<method>" + providerInfo.method + "</method>"
										+ 	"<vo>" + providerInfo.vo + "</vo>"
										+ 	"<paramKey>" + providerInfo.paramMap.org_id + "</paramKey>"
										+ 	"<paramMap>" + JSON.stringify(providerInfo.paramMap.getJSON()) + "</paramMap>"
										+ "</data>";
			var colCnt = gridObj.getColumnCount();
			var columnsIDArr = new Array();
			// Provider 사용시 컬럼 순서 설정
			for (var i = 0; i < colCnt; i++) {
				var isRemoveCol = false;
				if (typeof options.excludeColumns != "undefined" && options.excludeColumns != null && options.excludeColumns.length > 0) {
					for (var k = 0; k < options.excludeColumns.length; k++) {
						if (gridObj.getColumnID(i) == options.excludeColumns[k]) {
							isRemoveCol = true;
							break;
						}
					}
				}
				if (isRemoveCol) {
					continue;
				}
				columnsIDArr.push(gridObj.getColumnID(i));
			}
			var xmlDoc = WebSquare.xml.parse(options.providerRequestXml, false);
			WebSquare.xml.setValue(xmlDoc, "data/keyMap", columnsIDArr.join(","));
			options.providerRequestXml = WebSquare.xml.serialize(xmlDoc);
			delete options.providerInfo;
		}
	} catch (e) {
		console.error("[gcm.xls._setGridDownOption] Exception :: " + e);
	}
};

/**
 * 설정된 옵션으로 엑셀을 다운로드 한다.
 *
 * @memberof gcm.xls
 * @param {Object}	gridObj GridView 객체
 * @param {Object}	options GridView의 advancedExcelDownload 함수의 options 참조
 * @param {Boolean} options.hiddenVisible				[default: false] GridView 내 Hidden 컬럼을 엑셀 다운로드 시 포함시킬지 여부 (true : 포함, false : 미포함)
 * @param {String} 	options.fontSize					[default: 10] header, rowNumHeader, GridView 내 Hidden 컬럼을 엑셀 다운로드 시 포함시킬지 여부 (true : 포함, false : 미포함)
 * @param {Object} 	options.providerInfo 				[default: null] Provider를 사용하여 서버에서 조회된 결과를 다운로드 하도록 옵션 설정
 * @param {String} 	options.providerInfo.service 		[default: null] Provider에서 호출할 서비스명
 * @param {String} 	options.providerInfo.method 		[default: null] Provider에서 호출할 메소드명
 * @param {Object} 	options.providerInfo.paramMap 		[default: null] Provider에서 호출할 메소드의 파라미터로 전달할 dataMap 객체
 * @param {Boolean} options.providerInfo.isSplit 		[default: null] SplitProvider 사용 여부
 * @param {Array} 	options.providerInfo.excludeColumns [default: null] Provider 사용시 keyMap에서 제외할 컬럼 ID를 배열로 설정
 * @param {Array}	infoArr	GridView의 advancedExcelDownload 함수의 infoArr 참조
 */
gcm.xls.downloadGridExcel = function(gridObj, options, infoArr) {
	try {
		if (gcm.util.isEmpty(options)) {
			options = {};
		}
		if (typeof infoArr === "undefined") {
			infoArr = {};
		}
		
		gcm.xls._setGridDownOption(gridObj, options);
		
		// 엔진 기본값 변경
		options.useHeaderCheckBoxLabel = options.useHeaderCheckBoxLabel || "true"; //<String:N> [default: false] 다운로드시 header가 checkbox인 경우 checked 값 대신 label을 출력 할지 여부 ("true"는 value를 출력, "false"는 checked 값 출력.) 
		options.useSubTotal = options.useSubTotal || "true"; //<String:N> [default: false] 다운로드시 SubTotal을 출력 할지 여부 ("true"인경우 출력, "false"인경우 미출력), expression을 지정한 경우 avg,sum,min,max,targetColValue,숫자를 지원 함.
		options.useSubTotalData = options.useSubTotalData || "true"; //<String:N> [defalut: false] 다운로드시 SubTotal를 화면에 출력된 값을 출력 할지 여부( "true"인경우 출력, "false"인경우 서버에서 연산하기 때문에 expression에 사용자정의함수를 설정한 경우 화면과 다른 결과가 나타남)
		options.autoSizeColumn = options.autoSizeColumn || "true"; //<String:N> [default: false] 너비 자동 맞춤 설정 유무
		options.colMerge = options.colMerge || "true"; //<String:N> [default: false] colMerge된 컬럼을 Merge해서 출력 할 지 여부
		options.colMergeValue = options.colMergeValue || "true"; //<String:N> [default: false] colMerge된 컬럼을 다운로드한 Excel 파일에서 병합을 취소할 경우 모든 셀에 데이터를 채우는 기능. ("true"인 경우 병합 해제된 모든 셀에 데이터를 채움. "false"인 경우 첫 행이나 첫 열에만 데이터가 표시됨.) 
		options.useDataFormat = options.useDataFormat || "true"; //<String:N> [default: 없음] "true"인 경우 dataType에 따라 Excel 파일에 표시 형식을 출력. dataType="text"인 셀은 Excel의 표시형식에 '텍스트' 출력, dataType="number" 혹은 "bigDecimal" 셀은 "숫자" 출력.  
		// 기본 폰트 일치 (헤더, 바디, 소계, 합계)
		var fontName = "맑은 고딕"; // 기본 폰트명
		var fontSize = "10"; // 기본 폰트 사이즈
		var fontColor = "#111111"; // 기본 폰트 색
		options.headerColor = options.headerColor || "#C0C0C0"; 
		options.headerFontName = options.headerFontName || fontName; 
		options.headerFontSize = options.headerFontSize || fontSize; 
		options.headerFontColor = options.headerFontColor || fontColor; 
		options.bodyColor = options.bodyColor || "#ffffff"; 
		options.bodyFontName = options.bodyFontName || fontName;
		options.bodyFontSize = options.bodyFontSize || fontSize; 
		options.bodyFontColor = options.bodyFontColor || fontColor; 
		options.footerColor = options.footerColor || "#008000"; 
		options.footerFontName = options.footerFontName || fontName; 
		options.footerFontSize = options.footerFontSize || fontSize;
		options.footerFontColor = options.footerFontColor || fontColor;
		options.subTotalColor = options.subTotalColor || "#ccffcc"; 
		options.subTotalFontName = options.subTotalFontName || fontName;
		options.subTotalFontSize = options.subTotalFontSize || fontSize; 
		options.subTotalFontColor = options.subTotalFontColor || fontColor; 
		// 순번 컬럼의 폰트 및 배경색 일치 
		options.rowNumHeaderColor = options.rowNumHeaderColor || options.headerColor; 
		options.rowNumHeaderFontName = options.rowNumHeaderFontName || options.headerFontName; 
		options.rowNumHeaderFontSize = options.rowNumHeaderFontSize || options.headerFontSize;
		options.rowNumHeaderFontColor = options.rowNumHeaderFontColor || options.headerFontColor; 
		options.rowNumBodyColor = options.rowNumBodyColor || options.bodyColor; 
		options.rowNumBodyFontName = options.rowNumBodyFontName || options.bodyFontName;
		options.rowNumBodyFontSize = options.rowNumBodyFontSize || options.bodyFontSize;
		options.rowNumBodyFontColor = options.rowNumBodyFontColor || options.bodyFontColor;
		options.rowNumFooterColor = options.rowNumFooterColor || options.footerColor; 
		options.rowNumFooterFontName = options.rowNumFooterFontName || options.footerFontName;
		options.rowNumFooterFontSize = options.rowNumFooterFontSize || options.footerFontSize;
		options.rowNumFooterFontColor = options.rowNumFooterFontColor || options.footerFontSize;
		options.rowNumSubTotalColor = options.rowNumSubTotalColor || options.subTotalColor; 
		options.rowNumSubTotalFontName = options.rowNumSubTotalFontName || options.subTotalFontName;
		options.rowNumSubTotalFontSize = options.rowNumSubTotalFontSize || options.subTotalFontSize;
		options.rowNumSubTotalFontColor = options.rowNumSubTotalFontColor || options.subTotalFontSize;
		// 크기제한
		options.maxRowCount = 100000; 			// 10만 건 초과시 "Row 개수가 제한 크기를 초과하였습니다.\n제한 개수 : 100,000 " alert 하고 다운로드 서블릿(xmlToExcel2.wq) 요청 안함. 
		options.maxCellCount = 20 * 100000; 	// 200만 셀 초과시 "Cell 개수가 제한 크기를 초과하였습니다.\n제한 개수 : 2,000,000" alert 하고 다운로드 서블릿(xmlToExcel2.wq) 요청 안함.
		options.maxDataSize = 10 * 1024 * 1024; // 10MB 초과시 "전송 data가 제한 크기를 초과하였습니다.\n제한 크기 : 10,485,760 byte" alert 하고 다운로드 서블릿(xmlToExcel2.wq) 요청 안함.
		
		gridObj.advancedExcelDownload(options, infoArr);
	} catch (e) {
		console.error("[gcm.data.downloadGridViewExcel] Exception :: " + e);
	}
};

/**
 * 설정된 옵션으로 CSV파일을 다운로드 한다.
 *
 * @memberof gcm.xls
 * @param {Object}   gridObj GridView Object
 * @param {Object} options 	GridView의 saveCSV 함수의 options 참조
 */
gcm.xls.downloadGridCSV = function(gridObj, options) {
	try {
		if (gcm.util.isEmpty(options)) {
			options = {};
		}

		gcm.xls._setGridDownOption(gridObj, options);

		// 엔진 기본값 변경
		options.delim = options.delim || ","; //<String:N> [default: ';'] CSV 파일에서 데이터를 구분할 구분자  

		gridObj.saveCSV(options);
	} catch (e) {
		console.error("[gcm.xls.downloadGridCSV] Exception :: " + e);
	}
};

/**
 * 여러 GridView의 데이터를 엑셀 파일로 다운로드 한다.
 *
 * @memberof gcm.xls
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object}	options.common							JSON형태로 저장된 dataList의 엑셀 다운로드 옵션
 * @param {String}	options.common.fileName					[default: excel.xls] 다운로드하려는 파일의 이름
 * @param {Boolean}   options.common.showProcess			[default: true] 다운로드 시 프로세스 창을 보여줄지 여부
 * @param {String}	options.common.multipleSheet			[default: true] 다운로드시 dataList별 sheet분리 출력유무
 * @param {Object}	options.common.printSet					JSON형태로 저장된 Excel Print관련 설정
 * @param {String}	options.common.printSet.fitToPage		[default: false] 엑셀 프린터 출력시 쪽맞춤 사용 유무
 * @param {String}	options.common.printSet.landScape		[default: false] 엑셀 프린터 출력시 가로 방향 출력 유무
 * @param {String}	options.common.printSet.fitWidth		[default: 1] 엑셀 프린터 출력시 용지너비
 * @param {String}	options.common.printSet.fitHeight		[default: 1] 엑셀 프린터 출력시 용지높이
 * @param {String}	options.common.printSet.scale			[default: 100] 엑셀 프린터 출력시 확대/축소 배율, scale을 사용할 경우 fitToPage는 false로 설정 해야 한다.
 * @param {String}	options.common.printSet.pageSize		[default: A4] 엑셀 프린터 출력시 인쇄 용지 크기 (예: "A3", "A4", "A5", "B4") 단, fitToPage: true 인 경우에만 유효.
 * @param {Array}	 [options.excelInfo]					JSON형태로 저장된 dataList의 옵션 정보
 * @param {String}	options.excelInfo.gridId				[default: 없음] excel의 sheet에 저장한 GridView의 아이디
 * @param {String}	options.excelInfo.sheetName				[default: sheet] excel의 sheet의 이름
 * @param {String}	options.excelInfo.removeColumns			[default: 없음] 다운로드시 excel에서 삭제하려는 열의 번호(여러 개일 경우 ,로 구분)
 * @param {String}	options.excelInfo.foldColumns			[default: 없음] 다운로드시 excel에서 fold하려는 열의 번호(여러 개일 경우 ,로 구분)
 * @param {Number}	options.excelInfo.startRowIndex			[default: 0] excel파일에서 dataList의 데이터가 시작되는 행의 번호(헤더 포함)
 * @param {Number}	options.excelInfo.startColumnIndex		[default: 0] excel파일에서 dataList의 데이터가 시작되는 열의 번호(헤더 포함)
 * @param {String}	options.excelInfo.headerColor			[default: #33CCCC] excel파일에서 dataList의 header부분의 색
 * @param {String}	options.excelInfo.headerFontName		[default: 없음] excel파일에서 dataList의 header부분의 font name
 * @param {String}	options.excelInfo.wframeId				[default: 현재 WFrame Id] DataList가 위치한 WFrame Id 정보
 * @param {Array}	 options.excelInfo.infoArr				dataList에 대한 내용을 추가로 다른 셀에 표현하는 경우 사용하는 배열
 * @param {Number}	options.excelInfo.infoArr.rowIndex		내용을 표시할 행번호
 * @param {Number}	options.excelInfo.infoArr.colIndex		내용을 표시할 열번호
 * @param {Number}	options.excelInfo.infoArr.rowSpan		병합할 행의 수
 * @param {Number}	options.excelInfo.infoArr.colSpan		병합할 열의 수
 * @param {String}	options.excelInfo.infoArr.text			표시할 내용
 * @param {String}	options.excelInfo.infoArr.textAlign		표시할 내용의 정렬 방법 (left, center, right)
 * @param {String}	options.excelInfo.infoArr.fontSize		font size 설정 ( ex) "20px" )
 * @param {String}	options.excelInfo.infoArr.fontName		font name 설정
 * @param {String}	options.excelInfo.infoArr.color			font color 설정 ( ex) "red" )
 * @param {String}	options.excelInfo.infoArr.fontWeight	font weight 설정 ( ex) "bold" )
 * @param {String}	options.excelInfo.infoArr.drawBorder	cell의 border 지정 ( ex) true )
 * @param {String}	options.excelInfo.infoArr.wordWrap		cell의 줄 바꿈 기능 ( ex) "true" )
 * @example
// id가 a,b,c,d,e인 5개 컬럼이 존재하는 DataList
var options = {
	common: {
		fileName : "excel_data.xlsx",
		showProcess : true,
		multipleSheet : true,
		printSet : {
			landScape : "true",
			fitToPage : "true",
			fitWidth : "1",
			fitHeight : "1",
			scale : "222"
		}
	},
	excelInfo: [
		{
			gridId : "grd_data1",
			sheetName : "첫번째 sheet",
			removeColumns : "1,3",
			foldColumns : "2",
			startRowIndex : 3,
			startColumnIndex : 0,
			headerColor : "#DBEEF3",
			bodyColor : "#92CDDC",
			infoArr : [
				{
					rowIndex : 1, colIndex : 3, rowSpan : 1, colSpan : 2, text : "데이터표시" , textAlign : "center"
				}
			]
		},
		{
			gridId : "grd_data2",
			sheetName : "두번째 sheet",
			removeColumns : "1,3",
			foldColumns : "2",
			startRowIndex : 3,
			startColumnIndex : 0,
			headerColor : "#DBEEF3",
			bodyColor : "#92CDDC",
			infoArr : [
				{
					rowIndex : 1, colIndex : 3, rowSpan : 1, colSpan : 2, text : "데이터표시" , textAlign : "center"
				}
			]
		}
	]
};
gcm.xls.downloadMultiGrid(options);
 */
gcm.xls.downloadMultiGrid = function (scopeScwin, optionsParam, infoArrParam) {
	try {
		var options = {
				common: {
					fileName : optionsParam.common.fileName || "gridView.xlsx",
					showProcess :  optionsParam.common.showProcess || true,
					autoSizeColumn : optionsParam.common.autoSizeColumn || true,
					multipleSheet : optionsParam.common.multipleSheet || true,
					printSet : optionsParam.common.printSet || {}
				},
				excelInfo: []
		};

		if (optionsParam.excelInfo.length > 0) {
			var excelInfoCount = optionsParam.excelInfo.length;

			for (var idx = 0; idx < excelInfoCount; idx++) {
				var wframeId = optionsParam.excelInfo[idx].wframeId || scopeScwin.$w.getFrameId();
				var gridId = optionsParam.excelInfo[idx].gridId;

				var gridObj = null;
				if (gcm.util.isEmpty(wframeId) === false) {
					gridObj = scopeScwin.$w.getComponentById(wframeId + "_" + gridId);
				} else {
					gridObj = scopeScwin.$w.getComponentById(gridId);
				}

				if (typeof gridObj === "undefined") {
					console.log("[gcm.xls.downloadMultiDataList] excelInfo.gridId에 설정된 " + gridId + " GridView를 찾을 수 없습니다.");
					return;
				}

				var excelInfo = {
						gridId : gridId,
						sheetName : optionsParam.excelInfo[idx].sheetName || gridId,
						removeColumns : optionsParam.excelInfo[idx].removeColumns || "",
						foldColumns : optionsParam.excelInfo[idx].foldColumns || "",
						startRowIndex : optionsParam.excelInfo[idx].startRowIndex || 0,
						startColumnIndex : optionsParam.excelInfo[idx].startColumnIndex || 0,
						headerColor : optionsParam.excelInfo[idx].headerColor || "#33CCCC",
						bodyColor : optionsParam.excelInfo[idx].bodyColor || "#FFFFFF",
						wframeId : wframeId,
						infoArr : optionsParam.excelInfo[idx].infoArr
				};

				options.excelInfo.push(excelInfo);
			}
		} else {
			console.log("[gcm.xls.downloadMultiGrid] options.excelInfo 정보가 입력되지 않았습니다.");
			return;
		}

		WebSquare.util.multipleExcelDownload(options, infoArrParam);
	} catch (e) {
		console.error("[gcm.xls.downloadMultiGrid] Exception :: " + e);
	}
};

/**
 * 여러 DataList의 데이터를 엑셀 파일로 다운로드 한다.
 *
 * @memberof gcm.xls
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object}	options.common							JSON형태로 저장된 dataList의 엑셀 다운로드 옵션
 * @param {String}	options.common.fileName					[default: excel.xls] 다운로드하려는 파일의 이름
 * @param {Boolean}   options.common.showProcess			[default: true] 다운로드 시 프로세스 창을 보여줄지 여부
 * @param {String}	options.common.multipleSheet			[default: true] 다운로드시 dataList별 sheet분리 출력유무
 * @param {Object}	options.common.printSet					JSON형태로 저장된 Excel Print관련 설정
 * @param {String}	options.common.printSet.fitToPage		[default: false] 엑셀 프린터 출력시 쪽맞춤 사용 유무
 * @param {String}	options.common.printSet.landScape		[default: false] 엑셀 프린터 출력시 가로 방향 출력 유무
 * @param {String}	options.common.printSet.fitWidth		[default: 1] 엑셀 프린터 출력시 용지너비
 * @param {String}	options.common.printSet.fitHeight		[default: 1] 엑셀 프린터 출력시 용지높이
 * @param {String}	options.common.printSet.scale			[default: 100] 엑셀 프린터 출력시 확대/축소 배율, scale을 사용할 경우 fitToPage는 false로 설정 해야 한다.
 * @param {String}	options.common.printSet.pageSize		[default: A4] 엑셀 프린터 출력시 인쇄 용지 크기 (예: "A3", "A4", "A5", "B4") 단, fitToPage: true 인 경우에만 유효.
 * @param {Array}	 [options.excelInfo]					JSON형태로 저장된 dataList의 옵션 정보
 * @param {String}	options.excelInfo.dataListId			[default: 없음] excel의 sheet에 저장한 DataList의 아이디
 * @param {String}	options.excelInfo.sheetName				[default: sheet] excel의 sheet의 이름
 * @param {String}	options.excelInfo.removeColumns			[default: 없음] 다운로드시 excel에서 삭제하려는 열의 번호(여러 개일 경우 ,로 구분)
 * @param {String}	options.excelInfo.foldColumns			[default: 없음] 다운로드시 excel에서 fold하려는 열의 번호(여러 개일 경우 ,로 구분)
 * @param {Number}	options.excelInfo.startRowIndex			[default: 0] excel파일에서 dataList의 데이터가 시작되는 행의 번호(헤더 포함)
 * @param {Number}	options.excelInfo.startColumnIndex		[default: 0] excel파일에서 dataList의 데이터가 시작되는 열의 번호(헤더 포함)
 * @param {String}	options.excelInfo.headerColor			[default: #33CCCC] excel파일에서 dataList의 header부분의 색
 * @param {String}	options.excelInfo.headerFontName		[default: 없음] excel파일에서 dataList의 header부분의 font name
 * @param {String}	options.excelInfo.wframeId				[default: 현재 WFrame Id] DataList가 위치한 WFrame Id 정보
 * @param {Array}	 options.excelInfo.infoArr				dataList에 대한 내용을 추가로 다른 셀에 표현하는 경우 사용하는 배열
 * @param {Number}	options.excelInfo.infoArr.rowIndex		내용을 표시할 행번호
 * @param {Number}	options.excelInfo.infoArr.colIndex		내용을 표시할 열번호
 * @param {Number}	options.excelInfo.infoArr.rowSpan		병합할 행의 수
 * @param {Number}	options.excelInfo.infoArr.colSpan		병합할 열의 수
 * @param {String}	options.excelInfo.infoArr.text			표시할 내용
 * @param {String}	options.excelInfo.infoArr.textAlign		표시할 내용의 정렬 방법 (left, center, right)
 * @param {String}	options.excelInfo.infoArr.fontSize		font size 설정 ( ex) "20px" )
 * @param {String}	options.excelInfo.infoArr.fontName		font name 설정
 * @param {String}	options.excelInfo.infoArr.color			font color 설정 ( ex) "red" )
 * @param {String}	options.excelInfo.infoArr.fontWeight	font weight 설정 ( ex) "bold" )
 * @param {String}	options.excelInfo.infoArr.drawBorder	cell의 border 지정 ( ex) true )
 * @param {String}	options.excelInfo.infoArr.wordWrap		cell의 줄 바꿈 기능 ( ex) "true" )
 * @example
// id가 a,b,c,d,e인 5개 컬럼이 존재하는 DataList
var options = {
	common: {
		fileName : "excel_data.xlsx",
		showProcess : true,
		multipleSheet : true,
		printSet : {
			landScape : "true",
			fitToPage : "true",
			fitWidth : "1",
			fitHeight : "1",
			scale : "222"
		}
	},
	excelInfo: [
		{
			dataListId : "dlt_data1",
			sheetName : "첫번째 sheet",
			removeColumns : "1,3",
			foldColumns : "2",
			startRowIndex : 3,
			startColumnIndex : 0,
			headerColor : "#DBEEF3",
			bodyColor : "#92CDDC",
			infoArr : [
				{
					rowIndex : 1, colIndex : 3, rowSpan : 1, colSpan : 2, text : "데이터표시" , textAlign : "center"
				}
			]
		},
		{
			dataListId : "dlt_data2",
			sheetName : "두번째 sheet",
			removeColumns : "1,3",
			foldColumns : "2",
			startRowIndex : 3,
			startColumnIndex : 0,
			headerColor : "#DBEEF3",
			bodyColor : "#92CDDC",
			infoArr : [
				{
					rowIndex : 1, colIndex : 3, rowSpan : 1, colSpan : 2, text : "데이터표시" , textAlign : "center"
				}
			]
		}
	]
};
gcm.xls.downloadMultiDataList(options);
 */
gcm.xls.downloadMultiDataList = function (scopeScwin, optionsParam, infoArrParam) {
	try {
		var options = {
				common: {
					  fileName : optionsParam.common.fileName || "dataList.xlsx"
					, showProcess : optionsParam.common.showProcess || true
					, processMsg : optionsParam.common.showProcess || "download..."
					, autoSizeColumn : optionsParam.common.autoSizeColumn || true
					, multipleSheet : optionsParam.common.multipleSheet || true
					, printSet : optionsParam.common.printSet || {}
				},
				excelInfo: []
		};

		if (optionsParam.excelInfo.length > 0) {
			var excelInfoCount = optionsParam.excelInfo.length;

			for (var idx = 0; idx < excelInfoCount; idx++) {
				var wframeId = optionsParam.excelInfo[idx].wframeId || scopeScwin.$w.getFrameId();
				var dataListId = optionsParam.excelInfo[idx].dataListId;

				var dataListObj = null;
				if (gcm.util.isEmpty(wframeId) === false) {
					dataListObj = scopeScwin.$w.getComponentById(wframeId + "_" + dataListId);
				} else {
					dataListObj = scopeScwin.$w.getComponentById(dataListId);
				}

				if (typeof dataListObj === "undefined") {
					console.log("[gcm.xls.downloadMultiDataList] excelInfo.dataListId에 설정된 " + dataListId + " DataList를 찾을 수 없습니다.");
					return;
				}

				var excelInfo = {
						dataListId : dataListId,
						sheetName : optionsParam.excelInfo[idx].sheetName || dataListId,
						removeColumns : optionsParam.excelInfo[idx].removeColumns || "",
						foldColumns : optionsParam.excelInfo[idx].foldColumns || "",
						startRowIndex : optionsParam.excelInfo[idx].startRowIndex || 0,
						startColumnIndex : optionsParam.excelInfo[idx].startColumnIndex || 0,
						headerColor : optionsParam.excelInfo[idx].headerColor || "#33CCCC",
						bodyColor : optionsParam.excelInfo[idx].bodyColor || "#FFFFFF",
						wframeId : wframeId,
						infoArr : optionsParam.excelInfo[idx].infoArr
				};

				options.excelInfo.push(excelInfo);
			}
		} else {
			console.log("[gcm.xls.downloadMultiDataList] options.excelInfo 정보가 입력되지 않았습니다.");
			return;
		}

		WebSquare.util.multipleDataListDownload(options, infoArrParam);
	} catch (e) {
		console.error("[gcm.xls.downloadMultiDataList] Exception :: " + e);
	}
};

/**
 * 설정된 옵션으로 그리드의 헤더만 엑셀로 다운로드 한다.
 *
 * @memberof gcm.data
 * @param {Object}	gridObj GridView 객체
 * @param {Object}	options GridView의 advancedExcelUpload 함수의 options 참조
 * @example
var option = {
		  fileName : "header.xlsx"
};
gcm.xls.downloadGridHeader(grd_sample, option);
 */
gcm.xls.downloadGridHeader = function(gridObj, options) {
	try {
		options = options || {};
		options.dataProvider = gcm.XLS_INFO.PKG_NM + "ExcelHeadDown";
		gcm.xls.downloadGridExcel(gridObj, options);
	} catch (e) {
		console.error("[gcm.xls.downloadGridHeader] Exception :: " + e);
	}
};

/**
 * 엑셀 양식 파일을 다운로드 한다.
 *
 * @memberof gcm.data
 * @param {String}	fileUrl 엑셀 양식 파일 경로 (웹루트 이하 절대경로)
 * @example
gcm.xls.downloadExcelForm("/ui/sample/excelGridHeader.xlsx");
 */
gcm.xls.downloadExcelForm = function(fileUrl) {
	try {
		$w.download(gcm.CONTEXT_ROOT + fileUrl, null, "get");
	} catch (e) {
		console.error("[gcm.xls.downloadExcelForm] Exception :: " + e);
	}
};

/**
 * 엑셀 xls, xlsx 업로드
 *
 * @memberof gcm.data
 * @param {Object} gridObj GridView Object
 * @param {Object} options JSON형태로 저장된 그리드의 엑셀 업로드 옵션
 * @param {String}  options.type				[default: 0] 1이면 엑셀 파일이 그리드의 보이는 결과로 만들어져있을때 0이면 엑셀 파일이 그리드의 실제 데이터로 구성되어있을때
 * @param {Number}  options.sheetNo				[default: 0] excel파일에서 그리드의 데이터가 있는 sheet번호
 * @param {Number}  options.startRowIndex		[default: 0] excel파일에서 그리드의 데이터가 시작되는 행의 번호(헤더 포함)
 * @param {Number}  options.startColumnIndex	[default: 0] excel파일에서 그리드의 데이터가 시작되는 열의 번호
 * @param {Number}  options.endColumnIndex		[default: 0] excel파일에서 그리드의 데이터가 끝나는 열의 index ( 엑셀컬럼수가 그리드컬럼수 보다 작은 경우 그리드 컬러수를 설정)
 * @param {String}  options.headerExist			[default: 0] excel파일에서 그리드의 데이터에 header가 있는지 여부(1이면 header 존재 0이면 없음)
 * @param {String}  options.footerExist			[default: 1] excel파일에서 그리드의 데이터에 footer가 있는지 여부(1이면 footer 존재 0이면 없음 기본값은 1 그리드에 footer가 없으면 적용되지 않음)
 * @param {String}  options.append				[default: 0] excel파일에서 가져온 데이터를 그리드에 append시킬지 여부(1이면 현재 그리드에 데이터를 추가로 넣어줌 0이면 현재 그리드의 데이터를 삭제하고 넣음)
 * @param {String}  options.hidden				[default: 0] 읽어들이려는 엑셀파일에 hidden column이 저장되어 있는지 여부를 설정하는 int형 숫자(0이면 엑셀파일에 hidden 데이터가 없으므로 그리드 hidden column에 빈 데이터를 삽입 1 : 엑셀파일에 hidden 데이터가 있으므로 엑셀 파일로부터 hidden 데이터를 삽입 )
 * @param {String}  options.fillHidden			[default: 0] Grid에 hiddenColumn에 빈 값을 넣을지를 결정하기 위한 int형 숫자(1이면 hidden Column에 빈 값을 저장하지 않음,0이면 hidden column이 저장되어있지 않은 Excel File이라 간주하고 hidden Column에 빈 값을 넣어줌)(hidden이 0인 경우에는 fillhidden은 영향을 끼치지 않음)
 * @param {String}  options.skipSpace			[default: 0] 공백무시 여부(1이면 무시 0이면 포함)
 * @param {Array}   options.insertColumns		radio, checkbox와 같은 컬럼을 엑셀에서 받아 오지 않고, 사용자 컬럼 설정 으로 업로드 ( 데이터 구조 : [ { columnIndex:1, columnValue:"1" } ] )
 * @param {String}  options.removeColumns		[default: 없음] 저장 하지 않을 column index, 여러컬럼인 경우 콤마(,)로 구분해서 정의 한다.
 * @param {String}  options.popupUrl			업로드시에 호출할 popup의 url
 * @param {String}  options.delim				업로드시 데이터를 구분하는 구분자 (default: , )
 * @param {String}  options.status				[default: R]업로드된 데이터의 초기 상태값, 설정하지 않으면 "R"로 설정되며 "C"값을 설정 할 수 있다.
 * @param {String}  options.pwd					엑셀파일에 암호가 걸려 있는 경우, 비밀번호
 * @param {String}  options.optionParam			[default: 없음] DRM 연계시 사용자 정의 class에 HashMap 인자로 전달할 값. key는 "optionParam"으로 참조한다.
 * @param {String}  options.cellDataConvertor	[default: true] 컬럼값을 사용자가 수정할수 있는 연계 클래스의 전체 패키지명. (AbstractCellDataProvider class를 상속후 convertValue method를 구현해야 함.
 * @param {String}  options.decimal				[default: 4] 셀의 데이터가 소수인 경우, 최종 소수점 자리수. (기본값: 4) (예: 3인경우 4자리에서 반올림해서 3자리를 최종 표시.)
 * @param {String}  options.useModalDisable		[default: false] 업로드 팝업창이 활성화 될때 부모창의 컴포넌트 disabled 처리 유무.
 * @param {String}  options.useMaxByteLength	[default: false] ignoreChar 속성으로 설정한 문자를 제외하고 maxByteLength 속성으로 설정한 길이만큼의 데이터만 업로드.
 * @param {String}  options.dateFormat			[default: yyyy-MM-dd] 엑셀의 셀포맷이 날짜형식으로 되어 있는경우 format. 기본값은 "yyyy-MM-dd"
 * @param {String}  options.byteCheckEncoding	[default: EUC-KR] useMaxByteLength 설정되어 있는경우 byte처리시 지정할 인코딩. EUC-KR인경우 2byte처리 UTF-8일경우 3byte처리한다. (default는 EUC-KR)
 * @param {String}  options.features			upload화면이 뜰 때 string 형식의 스타일 정보. 지정되지 않은경우 upload창이 기본 스타일로 생성
 * @example
var gridId = "grd_AdvancedExcel";
var type = "xlsx";
var options = {
	fileName : "gridDataUpload.xlsx" // default값이 존재하지 않으므로 꼭 fileName 값을 넣어야 한다.
};
gcm.xls.uploadGridExcel(grd_basicInfo,  options);
 */
gcm.xls.uploadGridExcel = function (gridObj, options) {
	try {
		if (gcm.util.isEmpty(options)) {
			options = {};
		}

		var width = "510";
		var height = "218";
		var top = ((document.body.offsetHeight / 2) - (parseInt(height) / 2) + $(document).scrollTop());
		var left = ((document.body.offsetWidth / 2) - (parseInt(width) / 2) + $(document).scrollLeft());
		
		if (options.callbackFunc) {
			gcm.xls["__CALLBACKFUNC__" + gridObj.getID() + "_excelPop"] = options.callbackFunc;
		}

		// 엔진 기본값 변경
		options.type = options.type || "1"; //String, 1이면 엑셀 파일이 그리드의 보이는 결과로 만들어져있을때  0이면 엑셀 파일이 그리드의 실제 데이터로 구성되어있을때
		options.startRowIndex = options.startRowIndex || 1; //Number, [defalut:0] excel파일에서 그리드의 데이터가 시작되는 행의 번호(헤더 포함)
		options.status = options.status || "C"; //String, [defalut: R]업로드된 데이터의 초기 상태값, 설정하지 않으면 "R"로 설정되며 "C"값을 설정 할 수 있다.
//		options.dateFormat = "MM-dd-yyyy";				

		options.wframe = true;
		options.name = "Upload Excel";
		options.popupUrl = "/cm/xml/excelUploadPop.xml";
//		options.features = "top="+top+",height="+height+",left="+left+",width="+width+",location=no,menubar=no,resizable=yes,scrollbars=auto,status=no,titlebar=yes,toolbar=no";
		options.features = "top="+top+",height="+height+",left="+left+",width="+width;
		options.resizable = false;
		options.windowDragMove = true;
//		options.className = "test";
		
		// PoC 설정 적용 (대용량 성능 개선)
		options.loadingMode = "SAX";
		options.chunkNum = 10000; 

		gridObj.advancedExcelUpload(options);
	} catch (e) {
		console.error("[gcm.xls.uploadGridExcel] Exception :: " + e);
	}
};

/**
 *  엑셀 CSV 업로드
 *
 * @memberof gcm.data
 * @param {String}  options.type			[default: 1, 0]데이터 형태 (0이면 실 데이터 형태,1이면 display 표시 방식)
 * @param {String}  options.header			[default: 1, 0]Grid header 존재 유무 (0이면 header row수를 무시하고 전부 업로드하고 1이면 header row수 만큼 skip한다.)
 * @param {String}  options.delim			[default: ',']CSV 파일에서 데이터를 구분할 구분자
 * @param {String}  options.escapeChar		CSV 데이터에서 제거해야 되는 문자셋 ( ex) '\'' )
 * @param {Number}  options.startRowIndex 	[default: 0] csv파일에서 그리드의 데이터가 시작되는 행의 번호, startRowIndex가 설정되면, header 설정은 무시된다.
 * @param {String}  options.append			[default: 0, 1]csv파일에서 가져온 데이터를 그리드에 append시킬지 여부(1이면 현재 그리드에 데이터를 추가로 넣어줌 0이면 현재 그리드의 데이터를 삭제하고 넣음)
 * @param {Number}  options.hidden			[default: 0, 1]hidden Column에 대한 저장 여부(0이면 저장하지않음,1이면 저장)
 * @param {String}  options.fillHidden		[default: 0, 1]hidden Column에 빈 값을 넣을지를 결정하기 위한 int형 숫자(1이면 hidden Column에 빈 값을 저장하지 않음,0이면 hidden column이 저장되어있지 않은 csv File이라 간주하고 hidden Column에 빈 값을 넣어줌)(hidden이 0인 경우에는 fillhidden은 영향을 끼치지 않음)
 * @param {String}  options.skipSpace		[default: 0, 1]공백무시 여부(1이면 무시 0이면 포함)
 * @param {String}  options.expression		[default: 1, 0]expression 컬럼 데이터를 포함하고 있는지 여부, 기본값은 미포함(1이면 미포함, 0이면 포함)
 * @param {String}  options.popupUrl		업로드시에 호출할 popup의 url
 * @param {String}  options.status			[default: R]업로드된 데이터의 초기 상태값, 설정하지 않으면 "R"로 설정되며 "C"값을 설정 할 수 있다.
 * @param {String}  options.ignoreSpan		[default: 0, 1] span되어 있는 경우 span을 무시하고 데이터를 읽을지 여부 (0이면 머지되어 있는 컬럼을 하나로 본다, 1이면 머지되어 있는 컬럼을 각각읽는다)
 * @param {String}  options.optionParam		[default: 없음] DRM 연계시 사용자 정의 class에 HashMap 인자로 전달할 값. key는 "optionParam"으로 참조한다.
 * @example
var gridId = "grd_advancedExcel";
var options = {};
gcm.xls.uploadGridCSV(gridId,  options);
// return 예시) 엑셀 파일(.CSV) 업로드
 */
gcm.xls.uploadGridCSV = function (gridObj, options) {
	try {
		if (gcm.util.isEmpty(options)) {
			options = {};
		}

		var width = "490";
		var height = "218";
		var top = ((document.body.offsetHeight / 2) - (parseInt(height) / 2) + $(document).scrollTop());
		var left = ((document.body.offsetWidth / 2) - (parseInt(width) / 2) + $(document).scrollLeft());

		var opts = {
				type: options.type || "0",					// String, [default: 1, 0]데이터 형태 (0이면 실 데이터 형태,1이면 display 표시 방식)
				header: options.header || "0",				// String, [default: 1, 0]Grid header 존재 유무 (0이면 header row수를 무시하고 전부 업로드하고 1이면 header row수 만큼 skip한다.)
				delim: options.delim || ",", 				// String, [default: ',']CSV 파일에서 데이터를 구분할 구분자
				escapeChar: options.escapeChar || "",		// String, CSV 데이터에서 제거해야 되는 문자셋 ( ex) '\'' )
				startRowIndex: options.startRowIndex || 0,	// Number, [defalut: 0] csv파일에서 그리드의 데이터가 시작되는 행의 번호, startRowIndex가 설정되면, header 설정은 무시된다.
				append: options.append || "0", 				// String, [defalut: 0, 1]csv파일에서 가져온 데이터를 그리드에 append시킬지 여부(1이면 현재 그리드에 데이터를 추가로 넣어줌 0이면 현재 그리드의 데이터를 삭제하고 넣음)
				hidden: options.hidden || 1, 				// Number, [defalut: 0, 1]hidden Column에 대한 저장 여부(0이면 저장하지않음,1이면 저장)
				fillHidden: options.fillHidden || "0",		// String, [defalut: 0, 1]hidden Column에 빈 값을 넣을지를 결정하기 위한 int형 숫자(1이면 hidden Column에 빈 값을 저장하지 않음,0이면 hidden column이 저장되어있지 않은 csv File이라 간주하고 hidden Column에 빈 값을 넣어줌)(hidden이 0인 경우에는 fillhidden은 영향을 끼치지 않음)
				skipSpace: options.skipSpace || "0", 		// String, [defalut: 0, 1]공백무시 여부(1이면 무시 0이면 포함)
				expression: options.expression || "1",		// String, [defalut: 1, 0]expression 컬럼 데이터를 포함하고 있는지 여부, 기본값은 미포함(1이면 미포함, 0이면 포함)
				popupUrl: options.popupUrl || "", 			// String, 업로드시에 호출할 popup의 url
//				features : "top="+top+",height="+height+",left="+left+",width="+width+",location=no,menubar=no,resizable=yes,scrollbars=auto,status=no,titlebar=yes,toolbar=no",
				features : "top="+top+",height="+height+",left="+left+",width="+width,
				wframe: true,
				name : "Upload CSV",
//				className : "test",
				resizable : false,
				windowDragMove : true,
		}

		gridObj.readCSV(opts);
	} catch (e) {
		console.error("[gcm.xls.uploadGridCSV] Exception :: " + e);
	}
};

/**
 * 다국어를 고려한 메시지 및 레이블 관련 함수를 작성한다.
 *
 * @class lang
 * @namespace gcm.lang
 */
gcm.lang = {};

/**
 * 브라우저 언어 코드를 반환한다.
 *
 * @memberof gcm.lang
 * @return {String} 언어코드 (ex. "ko", "en")
 */
gcm.lang.getBrowserLanguage = function() {
	try {
		var language = navigator.language || navigator.userLanguage || navigator.systemLanguage;
		if ((gcm.util.isEmpty(language) === false) && (language.length > 1)) {
			return language.substring(0,2);
		} else {
			return "";
		}
	} catch (e) {
		console.error("[gcm.lang.getBrowserLanguage] Exception :: " + e);
		return null;
	}
}

/**
 * 웹스퀘어 언어 코드를 반환한다. (웹스퀘어 쿠키 > 로컬 스토리지 > 브라우저언어(지원언어中) > 기본언어)
 *
 * @memberof gcm.lang
 * @return langCode 언어코드 (한국어 : "ko", 영어 : "en");
 * @example
	gcm.lang.getLangCode();
 */
gcm.lang.getLangCode = function() {
	try {
		return WebSquare.cookie.getCookie("system_language") || gcm.data.getLocalStorage("langCode") || (gcm.LANG_INFO.LANG_ARR.indexOf(gcm.lang.getBrowserLanguage()) >= 0 ? gcm.lang.getBrowserLanguage() : gcm.DEFAULT_LANG);
	} catch (e) {
		console.error("[gcm.lang.getLangCode] Exception :: " + e);
		return null;
	}
};

/**
 * 웹스퀘어 언어 코드를 셋팅한다. (웹스퀘어 쿠키 > 로컬 스토리지 > 브라우저언어(지원언어中) > 기본언어)
 *
 * @memberof gcm.lang
 * @param {String} langCode 언어코드 (한국어 : "ko", 영어 : "en");
 * @example
	gcm.lang.setLangCode();
 */
gcm.lang.setLangCode = function(langCode) {
	try {
		WebSquare.cookie.setCookie("system_language", langCode);
		// localStorage에 언어 코드 저장 (다음 접속시에도 활용)
		gcm.data.setLocalStorage("langCode", langCode);
	} catch (e) {
		console.error("[gcm.lang.setLangCode] Exception :: " + e);
	}
};

/**
 * 웹스퀘어 언어 코드를 설정하고, 언어팩도 갱신한다.
 *
 * @memberof gcm.lang
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} langCode 언어코드 (한국어 : "ko", 영어 : "en");
 * @example
	gcm.lang.loadLangpack("ko");
 */
gcm.lang.loadLangpack = function(scopeScwin, langCode) {
	try {
		// 언어 코드 셋팅
		gcm.lang.setLangCode(langCode);
		// 사용자 언어팩 로딩
		if (gcm.LANG_INFO.type == "SP") {
			// Properties 로딩 (서비스 연동)
			gcm.lang._loadProperties(scopeScwin, langCode);
		} else if (gcm.LANG_INFO.type == "DB") {
			// 레이블 로딩 (서비스 연동)
			gcm.lang._loadLabel(scopeScwin, langCode);
			// 메시지 로딩 (서비스 연동)
			gcm.lang._loadMsg(scopeScwin, langCode);
		} else {
			// langpack js
			$.getScript(gcm.CONTEXT_ROOT + "/cm/langpack/" + WebSquare.BootLoader.getRandomPostfix(langCode+".js"));
		}
		// 웹스퀘어 기본 언어팩 변경 (ko 또는 en)
		$.getScript(gcm.CONTEXT_ROOT + "/websquare/message/" + WebSquare.BootLoader.getRandomPostfix((langCode === "ko" ? "ko" : "en") +".js"), function() {
			//웹스퀘어 기본 언어팩 중 일부 내용 재정의
			//전체 문자열 재정의 (선택 문자열은 config.xml에서 choosOptionLabel=" " 를 기본값으로 셋팅함)
//			WebSquareLang.SelectBox_all = "-전체-";
//			WebSquareLang.SelectBox_choose = "-선택-";
//			WebSquareLang.AutoComplete_all = "-전체-";
//			WebSquareLang.AutoComplete_choose = "-선택-";
//			WebSquareLang.Grid_all = "-전체-"; 
			WebSquareLang.CheckCombobox_all = gcm.lang.getLangCode() == "ko" ? "[일괄선택]" : "[choose all]"; // CheckComboBox allOption=true시 사용
//			WebSquareLang.CheckCombobox_choose = "선택"; 
			WebSquareLang.CheckCombobox_allOption_label = WebSquareLang.CheckCombobox_all; // CheckComboBox displayAllOptionLabel=true시 사용
//			console.log("[gcm.lang.loadLangpack] websquare langpack : " + WebSquareLang.CheckCombobox_all);
		}); 
	} catch (e) {
		console.error("[gcm.lang.loadLangpack] Exception :: " + e);
	}
};

/**
 * 다국어 로딩 (서버 Properties 조회, Map 방식)
 *
 * @memberof gcm.lang
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} langCode 언어코드 (한국어 : "ko", 영어 : "en");
 * @param {Object} isLocalStorage 로컬스토리지에서 조회할지 여부 (로컬스토리지에 없으면 서비스 연동)
 * @example
	gcm.lang._loadMsg(scwin);
 */
gcm.lang._loadProperties = function(scopeScwin, langCode, isLocalStorage) {
	try {
		if (isLocalStorage) {
			gcm.properties = gcm.data.getLocalStorage("properties");
			if (gcm.properties.length > 0) {
				WebSquare.WebSquareLang = gcm.properties;
				return;
			}
		}
		var sbmOption = {
			  id : "sbm_loadProperties"
			, action : gcm.LANG_INFO.actionUrl.SP + "?lang=" + langCode
		};
		var reqData = {};
		reqData[gcm.LANG_INFO.LANG_CD] = langCode;
		gcm.sbm.executeDynamic(scopeScwin, sbmOption, { 
			  requestData : reqData
			, successCallback : function(e) {
				var data = gcm.sbm.getElData(e).data;
				if (typeof data == "string") {
					data = JSON.parse(data);
				}
				gcm.properties = Object.assign(data.label, data.message);
				gcm.data.setLocalStorage("properties", gcm.properties); // 새창 띄우기 사용시 활용
				console.log("[gcm.lang._loadProperties] done. : gcm.properties{" + Object.keys(gcm.properties).length + "}");
				WebSquare.WebSquareLang = gcm.properties;
				// 세션정보 저장
				gcm.data.setLoginInfo(e.responseJSON.userHeader.session);
			}
		});
	} catch (e) {
		console.error("[gcm.lang._loadProperties] Exception :: " + e);
		return false;

	}
};

/**
 * 레이블 로딩 (DB 조회, List방식)
 *
 * @memberof gcm.lang
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} langCode 언어코드 (한국어 : "ko", 영어 : "en");
 * @param {Object} isLocalStorage 로컬스토리지에서 조회할지 여부 (로컬스토리지에 없으면 서비스 연동)
 * @example
	gcm.lang._loadLabel(scwin);
 */
gcm.lang._loadLabel = function(scopeScwin, langCode, isLocalStorage) {
	try {
		if (isLocalStorage) {
			gcm.labelList = gcm.data.getLocalStorage("labelList");
			if (gcm.labelList.length > 0) {
				_setWebSquareLang();
				return;
			}
		}
		var sbmOption = {
			  id : "sbm_loadLabel"
			, action : gcm.LANG_INFO.actionUrl.DB_LBL
		};
		var reqData = {};
		reqData[gcm.LANG_INFO.LANG_CD] = langCode;
		gcm.sbm.executeDynamic(scopeScwin, sbmOption, { 
			  requestData : reqData
			, successCallback : function(e) {
				gcm.labelList = gcm.sbm.getElData(e);
				gcm.data.setLocalStorage("labelList", gcm.labelList); // 새창 띄우기 사용시 활용
				console.log("[gcm.lang._loadLabel] done. : gcm.labelList[" + gcm.labelList.length + "]");
				_setWebSquareLang();
			}
		});
	} catch (e) {
		console.error("[gcm.lang._loadLabel] Exception :: " + e);
	}
	
	function _setWebSquareLang() {
		// json array(gcm.labelList)를 웹스퀘어 langpack object(WebSquare.WebSquareLang)로 변환
		WebSquare.WebSquareLang = gcm.labelList.reduce(function(newObj, obj) {
				newObj[obj[gcm.LANG_INFO.LABEL_CD]] = obj[gcm.LANG_INFO.LABEL_NM]; 
				return newObj; 
		}, {}); 
	}
};

/**
 * 메시지 로딩 (DB 조회, List방식)
 *
 * @memberof gcm.lang
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} langCode 언어코드 (한국어 : "ko", 영어 : "en");
 * @param {Object} isLocalStorage 로컬스토리지에서 조회할지 여부 (로컬스토리지에 없으면 서비스 연동)
 * @example
	gcm.lang._loadMsg(scwin);
 */
gcm.lang._loadMsg = function(scopeScwin, langCode, isLocalStorage) {
	try {
		if (isLocalStorage) {
			gcm.msgList = gcm.data.getLocalStorage("msgList");
			if (gcm.labelList.length > 0) {
				return;
			}
		}
		var sbmOption = {
			  id : "sbm_loadMsg"
			, action : gcm.LANG_INFO.actionUrl.DB_MSG
		};
		var reqData = {};
		reqData[gcm.LANG_INFO.LANG_CD] = langCode;
		gcm.sbm.executeDynamic(scopeScwin, sbmOption, { 
			  requestData : reqData
			, successCallback : function(e) {
				gcm.msgList = gcm.sbm.getElData(e);
				gcm.data.setLocalStorage("msgList", gcm.msgList); // 새창 띄우기 사용시 활용
				console.log("[gcm.lang._loadMsg] done. : gcm.msgList[" + gcm.msgList.length + "]");
			}
		});
	} catch (e) {
		console.error("[gcm.lang._loadMsg] Exception :: " + e);
		return false;

	}
};

/**
 * 레이블 코드로 다국어 label명 조회
 *
 * @memberof gcm.lang
 * @param {String} lblCd 레이블 코드
 * @return 레이블명
 * @example
	gcm.lang.getLabel("L001");
 */
gcm.lang.getLabel = function(lblCd) {
	try {
		return WebSquare.WebSquareLang[lblCd] || lblCd;
	} catch (e) {
		console.error("[gcm.lang.getLabel] Exception :: " + e);
		return lblCd;
	}
};

/**
 * 메시지 코드로 메시지 조회
 *
 * @memberof gcm.lang
 * @param {String} msgCd 메시지 코드
 * @example
	gcm.lang.getMessage("message.xom.wq.0001");
 */
gcm.lang.getMessage = function(msgCd) {
	try {
		if (gcm.LANG_INFO.type == "DB") {
			// 메시지 gcm.msgList에 모든 언어의 메시지 존재
			var filterData = gcm.msgList.filter( function(data) {
				return data[gcm.LANG_INFO.MSG_CD] == msgCd;
			})[0];
			return (filterData) ? filterData[gcm.LANG_INFO.MSG_NM] : '';
		} else {
			// 서버 Properties 또는 langpack js로 관리시
			return WebSquare.WebSquareLang[msgCd]; 
		}
	} catch (e) {
		console.error("[gcm.lang.getMessage] Exception :: " + e);
		return false;
	}
};

/**
 * 공통 메시지에 코드에 해당하는 공통 메시지를 반환합니다.
 *
 * @memberof gcm.lang
 * @param {String} msgCd 메시지 코드
 * @param {String|Array} args 메시지 치환 문자열 (메시지에서 치환이 필요한 만큼 문자열 매개변수를 전달함)
 * @example
	gcm.lang.getMsg("E100"); // "사용자 정보가 존재하지 않습니다."
	gcm.lang.getMsg("E104","jpg","zip"); // "허용(jpg)되지 않은 첨부파일(zip) 형식입니다."
 */
gcm.lang.getMsg = function(msgCd) {
	try {
		var message = ""
		if (gcm.util.isEmpty(msgCd) === false) {
			message = gcm.lang.getMessage(msgCd);
		}
		if (gcm.util.isEmpty(message) === false) {
			var tmpMessage = message;

			if (arguments.length > 1) {
				for(var i = 1; i < arguments.length; i++) {
					tmpMessage = (tmpMessage.indexOf("{" + (i-1) + "}") != -1) ? gcm.str.replaceAll(tmpMessage, "{" + (i-1) + "}", arguments[i]) : tmpMessage;
				}
				return tmpMessage;
			} else {
				return tmpMessage;
			}
		} else {
			return "";
		}
	} catch (e) {
		console.error("[gcm.lang.getMsg] Exception :: " + e);
		return "";
	}
};

/**
 * 공통 코드 관련 함수를 작성한다.
 *
 * @class cd
 * @namespace gcm.cd
 */
gcm.cd = {};

/**
 * 공통코드 조회한다. 세팅X
 *
 * @memberof gcm.cd
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {string[]} codeArr 함수를 호출하는 scope의 scwin 객체
 * @param {function} callbackFunc 코드를 찾은 후 처리 할 
 */
 gcm.cd.getCmnCd = async function(scopeScwin, codeArr, callbackFunc) {
	if (codeArr == undefined || codeArr == null) {
		console.error("[gcm.cd.getCmnCd] Exception :: codeStr is null!!!");
		return;
	}
	if (!Array.isArray(codeArr)) {
		codeArr = [codeArr];
	}
	
	let retCdObj = {}, schCd = "", cdDltId = "", code = "";
	for (var i = 0; i < codeArr.length; i++) {
		code = codeArr[i];
		
		if (typeof code == "string" && code.length != 3) {
			continue;
		}
		
		cdDltId = gcm.CMNCD_INFO.DATA_PREFIX + code;
		
		if (gcm.cmnCdCache[cdDltId]) {
			// 캐싱된 정보로 return
			retCdObj[code] = gcm.cmnCdCache[cdDltId];
		} else {
			schCd += ( i > 0 ? "," : "" ) + code;
		}
	}
	
	if (schCd.length == 0) {
		if ('function' === typeof callbackFunc) {
    		callbackFunc(retCdObj);
    	}
		
		return retCdObj;
	} else {
		// 캐싱 안된 공통코드 조회
	    var searchCodeGrpOption = {
	              id : "sbm_searchCode"
	            , action : gcm.CMNCD_INFO.actionUrl
	    };
		var reqData = {
				"grpCd" : schCd,
				"dataPrefix" : gcm.CMNCD_INFO.DATA_PREFIX
		};
		
		reqData[gcm.LANG_INFO.LANG_CD] = gcm.lang.getLangCode();
		
		return new Promise(function(resolve, reject) {
				gcm.sbm.executeDynamic(scopeScwin, searchCodeGrpOption, { 
						  processMsg : ""
						, requestData : reqData
			            , successCallback : function(e) {
			            	// 공통코드 조회 콜백에서 캐싱
			        		let resCdMap = e.responseJSON[gcm.SBM_INFO.RES_DATA]['codeMap'];
			        		
			        		for (cdGrpDtlId in resCdMap) {
			            		if (cdGrpDtlId.indexOf(gcm.CMNCD_INFO.DATA_PREFIX) > -1) {
			            			let cdGrp = cdGrpDtlId.replace(gcm.CMNCD_INFO.DATA_PREFIX, "");
			            			
			            			gcm.cmnCdCache[cdGrpDtlId] = resCdMap[cdGrpDtlId];
			            			retCdObj[cdGrp] = resCdMap[cdGrpDtlId];
			            		}
			            	}

			        		// Node Setting 설정 및 공통코드 셋팅 콜백 실행
			            	if ('function' === typeof callbackFunc) {
			            		callbackFunc(retCdObj);
			            	}
			            	
			            	resolve(retCdObj);
			            }
				});
		});
	}
};

/**
 * 공통코드 일괄 조회
 *
 * @memberof gcm.cd
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 */
gcm.cd.getCmnCdAll = function(scopeScwin, callbackFunc) {
	try {
        var searchCodeGrpOption = {
              id : "sbm_getCmnCdAll"
            , action : gcm.CMNCD_INFO.actionUrl
        };
    	gcm.sbm.executeDynamic(scopeScwin, searchCodeGrpOption, { 
			  processMsg : ""
			, requestData : { "dataPrefix" : gcm.CMNCD_INFO.DATA_PREFIX }
    		, successCallback : function(e) {
            	// 전역변수에 저장
    			gcm.cmnCdCache = e.responseJSON[gcm.SBM_INFO.RES_DATA]['codeMap'];
    			// 샘플용 공통코드 추가
    			if (location.hostname == "127.0.0.1" || location.hostname == "localhost" || location.hostname == "bizdev.kitech.re.kr") {
    				gcm.cd.sampleCmnCd();
    			}
    			if (callbackFunc && typeof callbackFunc === 'function') {
    				(callbackFunc)();
    			}
            }
    	});
	} catch (e) {
		console.error("[gcm.cd.getCmnCdAll] Exception :: " + e);
	}
};

/**
 * 샘플용 공통코드 추가
 *
 * @memberof gcm.cd
 */
gcm.cd.sampleCmnCd = function() {
	gcm.cmnCdCache[gcm.CMNCD_INFO.DATA_PREFIX + "TEST_STEP1"] = [
		 {"grpCd":"TEST_STEP1", "grpNm":"대륙", "comCd":"10", "comNm":"아시아",	"useEx":"Y"}
		,{"grpCd":"TEST_STEP1", "grpNm":"대륙", "comCd":"20", "comNm":"아메리카",	"useEx":"Y"}
		,{"grpCd":"TEST_STEP1", "grpNm":"대륙", "comCd":"30", "comNm":"유럽",		"useEx":"Y"}
		,{"grpCd":"TEST_STEP1", "grpNm":"대륙", "comCd":"40", "comNm":"아프리카",	"useEx":"Y"}
		,{"grpCd":"TEST_STEP1", "grpNm":"대륙", "comCd":"50", "comNm":"오세아니아",	"useEx":"N"}
	];
	gcm.cmnCdCache[gcm.CMNCD_INFO.DATA_PREFIX + "TEST_STEP2"] = [
		 {"grpCd":"TEST_STEP2", "grpNm":"국가", "comCd":"11", "comNm":"대한민국",	"useEx":"Y", "cdClsf":"10"}
		,{"grpCd":"TEST_STEP2", "grpNm":"국가", "comCd":"12", "comNm":"중국",		"useEx":"Y", "cdClsf":"10"}
		,{"grpCd":"TEST_STEP2", "grpNm":"국가", "comCd":"13", "comNm":"일본",		"useEx":"N", "cdClsf":"10"}
		,{"grpCd":"TEST_STEP2", "grpNm":"국가", "comCd":"21", "comNm":"미국",		"useEx":"Y", "cdClsf":"20"}
		,{"grpCd":"TEST_STEP2", "grpNm":"국가", "comCd":"22", "comNm":"캐나다",	"useEx":"Y", "cdClsf":"20"}
		,{"grpCd":"TEST_STEP2", "grpNm":"국가", "comCd":"23", "comNm":"브라질",	"useEx":"N", "cdClsf":"20"}
		,{"grpCd":"TEST_STEP2", "grpNm":"국가", "comCd":"31", "comNm":"영국",		"useEx":"Y", "cdClsf":"30"}
		,{"grpCd":"TEST_STEP2", "grpNm":"국가", "comCd":"32", "comNm":"프랑스",	"useEx":"Y", "cdClsf":"30"}
		,{"grpCd":"TEST_STEP2", "grpNm":"국가", "comCd":"33", "comNm":"독일",		"useEx":"N", "cdClsf":"30"}
		,{"grpCd":"TEST_STEP2", "grpNm":"국가", "comCd":"41", "comNm":"이집트",	"useEx":"Y", "cdClsf":"40"}
		,{"grpCd":"TEST_STEP2", "grpNm":"국가", "comCd":"42", "comNm":"가나",		"useEx":"Y", "cdClsf":"40"}
		,{"grpCd":"TEST_STEP2", "grpNm":"국가", "comCd":"43", "comNm":"알제리",	"useEx":"N", "cdClsf":"40"}
		,{"grpCd":"TEST_STEP2", "grpNm":"국가", "comCd":"51", "comNm":"호주",		"useEx":"Y", "cdClsf":"50"}
		,{"grpCd":"TEST_STEP2", "grpNm":"국가", "comCd":"52", "comNm":"뉴질랜드",	"useEx":"Y", "cdClsf":"50"}
	];
	gcm.cmnCdCache[gcm.CMNCD_INFO.DATA_PREFIX + "TEST_DEPT"] = [
		 {"grpCd":"TEST_DEPT", "grpNm":"부서", "comCd":"10", "comNm":"총무부",	"useEx":"Y"}
		,{"grpCd":"TEST_DEPT", "grpNm":"부서", "comCd":"20", "comNm":"영업부",	"useEx":"Y"}
		,{"grpCd":"TEST_DEPT", "grpNm":"부서", "comCd":"30", "comNm":"기획실",	"useEx":"Y"}
		,{"grpCd":"TEST_DEPT", "grpNm":"부서", "comCd":"40", "comNm":"연구소",	"useEx":"Y"}
	];
};

/**
 * 코드성 데이터와 컴포넌트의 nodeSet(아이템 리스트)연동 기능을 제공한다.
 * cdGrp별로 JSON객체를 생성하여 array에 담아 첫번째 파라메터로 넘겨준다.
 *
 * @memberof gcm.cd
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} codeOptions {"code" : "코드그룹", "compID" : "적용할 컴포넌트명", "useYn" : "Y"}
 * @param {requestCallback} callbackFunc 콜백 함수
 */
gcm.cd.setCmnCd = async function(scopeScwin, codeOptions, callbackFunc) {
	return new Promise((resolve, reject) => {
		try {
			var codeOptionsLen = 0;
			if (codeOptions) {
				codeOptionsLen = codeOptions.length;
			} else {
				console.error("[gcm.cd.setCmnCd] codeOptions is null.");
				return;
			}
			var arrDltId = [], paramCode = "", dbParamCode = "";
			var dataListOption = _getCodeDataListOptions(gcm.CMNCD_INFO.FILED_ARR);
			// 화면에서 사용할 공통코드용 dataList 생성 
			for (var i = 0; i < codeOptionsLen; i++) {
				var codeObj = codeOptions[i];
				var dltId = gcm.CMNCD_INFO.DATA_PREFIX + codeObj.code;
				dataListOption.id = dltId;
				if (gcm.util.getComponent(scopeScwin, dltId) == null) {
					scopeScwin.$w.data.create(dataListOption); // 동일한 id의 DataCollection이 존재하지 않으면 생성
				} 
				if (gcm.CMNCD_INFO.isIndexAll) {
					// 공통코드를 초기화면에서 일괄 조회하는 경우 공통코드값 셋팅
					var dataListObj = scopeScwin.$w.getComponentById(dltId);
					dataListObj.setJSON( gcm.cmnCdCache[dltId] );
				} else {
					if (typeof gcm.cmnCdCache[dltId] === "undefined" || codeObj.isOnDB) {
						if (arrDltId.indexOf(dltId) == -1) {
							// 조회 대상에 추가
							arrDltId.push(dltId); // 공통코드 조회 콜백 자동 바인딩 용
							if (codeObj.isOnDB) {
								dbParamCode += ( i > 0 ? "," : "" ) + codeObj.code;
							} else {
								paramCode += ( i > 0 ? "," : "" ) + codeObj.code;
							}
						}
					} else {
						// 캐싱된 정보로 셋팅
						var dataListObj = scopeScwin.$w.getComponentById(dataListOption.id);
						dataListObj.setJSON(gcm.cmnCdCache[dltId]);
					}
				}
			}
			
			if (gcm.CMNCD_INFO.isIndexAll || (paramCode === "" && dbParamCode === "")) {
	        	// Node Setting 설정 및 공통코드 셋팅 콜백 실행
	        	_nodeSetting();
			} else {
		    	// 캐싱 안된 공통코드 조회
		        var searchCodeGrpOption = {
		                  id : "sbm_searchCode"
		                , action : gcm.CMNCD_INFO.actionUrl
		                //target : "data:json," + gcm.str.serialize(arrDltId)
		                , target : "data:json," + _getTarget(arrDltId)
		        };
				var reqData = {
						"grpCd" : paramCode,
						"dbGrpCd" : dbParamCode,
						"dataPrefix" : gcm.CMNCD_INFO.DATA_PREFIX
	    		};
				reqData[gcm.LANG_INFO.LANG_CD] = gcm.lang.getLangCode();
		    	gcm.sbm.executeDynamic(scopeScwin, searchCodeGrpOption, { 
		    			  processMsg : ""
		    			, requestData : reqData
			            , successCallback : function(e) {
			            	// 공통코드 조회 콜백에서 캐싱
			            	for (cdGrpDtlId in e.responseJSON[gcm.SBM_INFO.RES_DATA]['codeMap']) {
			            		if (cdGrpDtlId.indexOf(gcm.CMNCD_INFO.DATA_PREFIX) > -1) {
			            			gcm.cmnCdCache[cdGrpDtlId] = e.responseJSON[gcm.SBM_INFO.RES_DATA]['codeMap'][cdGrpDtlId];
			            		}
			            	}
			            	// Node Setting 설정 및 공통코드 셋팅 콜백 실행
			            	_nodeSetting();
			            }
		    	});
		    }
	
		    // Node Setting 설정 및 공통코드 셋팅 콜백 실행
		    function _nodeSetting() {
		    	for (var i = 0; i < codeOptionsLen; i++) {
		    		var codeObj = codeOptions[i];
		    		var dltId = gcm.CMNCD_INFO.DATA_PREFIX + codeObj.code;
					if (!gcm.util.isEmpty(codeObj.addAllCd)) {
						// 전체(*) 코드를 추가한 dataList 별도 생성 후 node setting
						var dataListOption = _getCodeDataListOptions(gcm.CMNCD_INFO.FILED_ARR);
						dataListOption.id = dltId + "*";
						scopeScwin.$w.data.create(dataListOption); 
						var orgDtlObj = scopeScwin.$w.getComponentById(dltId);
						var newDtlObj = scopeScwin.$w.getComponentById(dataListOption.id);
						newDtlObj.setJSON(orgDtlObj.getAllJSON());
						var arrTemp = codeObj.addAllCd.split("|");
						newDtlObj.insertJSON(0, [{"dtlCd": arrTemp[0], "dtlCdNm": arrTemp[1] || "All", "useYn":"Y"}]);
		    			dltId = dataListOption.id;
					} else if (!gcm.util.isEmpty(codeObj.addNullCd)) {
						// 선택값 없음(null) 코드를 추가한 dataList 별도 생성 후 node setting
						var dataListOption = _getCodeDataListOptions(gcm.CMNCD_INFO.FILED_ARR);
						dataListOption.id = dltId + "null";
						scopeScwin.$w.data.create(dataListOption); 
						var orgDtlObj = scopeScwin.$w.getComponentById(dltId);
						var newDtlObj = scopeScwin.$w.getComponentById(dataListOption.id);
						newDtlObj.setJSON(orgDtlObj.getAllJSON());
						var arrTemp = codeObj.addNullCd.split("|");
						newDtlObj.insertJSON(0, [{"dtlCd": arrTemp[0], "dtlCdNm": arrTemp[1] || "Null", "useYn":"Y"}]);
		    			dltId = dataListOption.id;
					}
					
					if (!codeObj.filter && !codeObj.isAll) {
						codeObj.filter = "useEx == 'Y'";
					}

		    		// filter 옵션 사용시 linkedDataList 생성 후 node setting
		    		if (codeObj.filter) {
		    			var ldtId = dltId.replace("dlt_", "ldt_") + "_" + i;
		    			var linkedDataListOption = _getLinkedDataListOptions(dltId, codeObj.filter);
		    			linkedDataListOption.id = dltId.replace("dlt_", "ldt_") + "_" + i;
	//					var linkedDataListOption = '<w2:linkedDataList bind="' + dltId + '" id="' + ldtId + '">'
	//											 + '<w2:condition type="filter"><![CDATA[' + codeObj.filter + ']]></w2:condition>'
	//											 + '<w2:condition type="sort"><![CDATA[]]></w2:condition>'
	//											 + '</w2:linkedDataList>';
		    			scopeScwin.$w.data.create(linkedDataListOption);
		    			dltId = ldtId;
		    		}
		    		if (codeObj.compID) {
		    			var compArr = (codeObj.compID).replaceAll(" ", "").split(",");
		    			// 커스텀 value, label 처리
		    			codeObj.value ||= "VALUE", codeObj.value = codeObj.value.toUpperCase();
						codeObj.label ||= "LABEL", codeObj.label = codeObj.label.toUpperCase();
						
						var customNode = {
							value : gcm.CMNCD_INFO[codeObj.value],
							label : gcm.CMNCD_INFO[codeObj.label]
						};
		    			for (var j = 0; j < compArr.length; j++) {
		    				var tmpIdArr = compArr[j].split(":");
		    				if (tmpIdArr.length === 1) {
		    					// 기본 컴포넌트에 대한 Node Setting 설정
		    					var comp = scopeScwin.$w.getComponentById(tmpIdArr[0]);
		    					if (comp) {
		    						
		    						var pluginName = comp.getPluginName();
		    						comp.removeAll(); // checkbox, radio의 경우 item이 들어가 있으면 오류로그 남는 문제 해결
	//		    					if ((pluginName == "selectbox" || pluginName == "autoComplete")	&& comp.itemTableMode == "gridView") {
	//		    						var obj = {
	//		    								"nodeset" : "data:" + dltId,
	//		    								"label" : gcm.CMNCD_INFO.LABEL,
	//		    								"value" : gcm.CMNCD_INFO.VALUE,
	//		    								"item" : [{"ref" : gcm.CMNCD_INFO.LABEL, "header" : "label"},{"ref" : gcm.CMNCD_INFO.VALUE, "header" : "value"}]
	//		    						};
	//		    						comp.setGridItemset(obj);
	//		    					} else {
	//		    						comp.setNodeSet("data:" + dltId, gcm.CMNCD_INFO.LABEL, gcm.CMNCD_INFO.VALUE);
	//		    					}
		    						
		    						if (com.isEmpty(customNode.value) || com.isEmpty(customNode.label)) {
		    							com.error("코드세팅 중 오류가 발생했습니다.");
		    							return;
		    						}
		    						
		    						comp.setNodeSet("data:" + dltId, customNode.label, customNode.value);
	//	    						var items = comp.getItemArray();
	//	    						if (items && items.some(function(item, index){ return (0 === index && '' == item.label.trim() && '' == item.value.trim()); })) {
	//	    							comp.deleteItem(0)
	//	    						}

		    						// 사용여부 컬럼 적용
		    						if (gcm.CMNCD_INFO.isUseYn && codeObj.ignoreUseYn !== true) {
		    							if ((pluginName == "selectbox" || pluginName == "checkcombobox" || pluginName == "autoComplete")
		    									&& typeof comp.setVisibleColumn == "function") {
		    								comp.setVisibleColumn(gcm.CMNCD_INFO.USE_YN);
		    								if (pluginName == "checkcombobox") {
		    									// checkcombobox 재선택시 미사용코드 삭제
		    									comp.bind("onviewchange", function(info) {
		    										var dltObj = this.getScopeWindow().$p.getComponentById(this.itemsetObj.nodeset.replace("data:",""));
		    										var arrUseYnN = dltObj.getMatchedJSON(gcm.CMNCD_INFO.USE_YN, "N");
		    										var arrNewValue = info.newValue.split(",");
		    										var newValueUseYnY = "";
		    										for (var i=0; i<arrNewValue.length; i++) {
		    											// useYn이 N이 아니면 추가
		    											if (!gcm.arr.isIn(arrUseYnN, customNode.value, arrNewValue[i])) {
		    												newValueUseYnY += (newValueUseYnY.length===0 ? arrNewValue[i] : ","+arrNewValue[i]);
		    											}
		    										}
		    										this.setValue(newValueUseYnY);
	//	    										console.log("[checkcombobox onviewchange] newValue : " + info.newValue);
	//	    										console.log("[checkcombobox onviewchange] newValueUseYnY : " + newValueUseYnY);
		    									});
		    								}
		    							} else if (pluginName == "checkbox" || pluginName == "radio") {
		    								// checkbox 및 radio의 사용여부 값이 false이면 setItemDisabled 처리
		    								var dataListObj = scopeScwin.$w.getComponentById(dltId);
		    								var arrIdx = dataListObj.getMatchedIndex(gcm.CMNCD_INFO.USE_YN, "N");
		    								for (var k=0; k<arrIdx.length; k++) {
		    									comp.setItemDisabled(arrIdx[k], true);
		    								}
		    								if (pluginName == "checkbox") {
		    									// checkbox 재선택시 미사용코드 삭제
		    									comp.bind("onviewchange", function(info) {
		    										var dltObj = this.getScopeWindow().$p.getComponentById(this.itemsetObj.nodeset.replace("data:",""));
		    										var arrUseYnN = dltObj.getMatchedJSON(gcm.CMNCD_INFO.USE_YN, "N");
		    										var arrNewValue = this.getValue().split(",");
		    										var newValueUseYnY = "";
		    										for (var i=0; i<arrNewValue.length; i++) {
		    											// useYn이 N이 아니면 추가
		    											if (!gcm.arr.isIn(arrUseYnN, customNode.value, arrNewValue[i])) {
		    												newValueUseYnY += (newValueUseYnY.length===0 ? arrNewValue[i] : ","+arrNewValue[i]);
		    											}
		    										}
	//	    										console.log("[checkbox onviewchange] newValue : " + this.getValue());
	//	    										console.log("[checkbox onviewchange] newValueUseYnY : " + newValueUseYnY);
		    										this.setValue(newValueUseYnY);
		    									});
		    								}
    	    							}
		    						}
		    					}
		    				} else {
		    					// gridView 컴포넌트에 대한 Node Setting 설정
		    					var gridObj = scopeScwin.$w.getComponentById(tmpIdArr[0]);
		    					if (gridObj) {
		    						gridObj.setColumnNodeSet(tmpIdArr[1], "data:" + dltId, customNode.label, customNode.value);
		    						// 사용여부 컬럼 적용
		    						if (gcm.CMNCD_INFO.isUseYn && codeObj.ignoreUseYn !== true) {
		    							var columnType = gridObj.getColumnType(tmpIdArr[1]);
		    							if ((columnType == "select" || columnType == "autoComplete" || columnType == "checkcombobox")
		    									&& typeof gridObj.setColumnVisibleColumn == "function") {
		    								// grid 컬럼에 사용여부 컬럼 적용
		    								_setColumnVisibleColumn(gridObj, tmpIdArr[1]);
		    								if (columnType == "checkcombobox") {
		    									// checkcombobox 재선택시 미사용코드 삭제
		    									_setOnViewChange(scopeScwin, gridObj, tmpIdArr[1], dltId, customNode);
		    								}
		    							}
		    						}
		    					}
		    				}
		    			}
		    		}
		    	}
		    	// 공통코드 셋팅 콜백 실행
		    	if (typeof callbackFunc === "function") {
					resolve(callbackFunc());
		    	} else {
		    		resolve(true);
		    	}
		    }
	
			// grid 컬럼에 사용여부 컬럼 적용
			function _setColumnVisibleColumn(gridObj, colId) {
				// 다단 콤보 사용시 step2 초기값이 안나오는 문제 회피를 위해 setTimeout 처리
				setTimeout(function() {
	//				console.log("[_setColumnVisibleColumn] colId : " + colId);
					gridObj.setColumnVisibleColumn(colId, gcm.CMNCD_INFO.USE_YN);
				}, 500);
			}
			
			// grid checkcombobox onviewchange이벤트에서 checkcombobox 재선택시 미사용코드 삭제 처리
			function _setOnViewChange(scopeScwin, gridObj, colId, dltId, customNode) {
	//			console.log("[_setOnViewChange] colId : " + colId);
				gridObj.bind("onviewchange", function(info) {
					if (gridObj.getColumnID(info.colIndex) === colId) {
						var dltObj = scopeScwin.$w.getComponentById(dltId);
						var arrUseYnN = dltObj.getMatchedJSON(gcm.CMNCD_INFO.USE_YN, "N");
						var arrNewValue = info.newValue.split(",");
						var newValueUseYnY = "";
						for (var i=0; i<arrNewValue.length; i++) {
							// useYn이 N이 아니면 추가
							if (!gcm.arr.isIn(arrUseYnN, customNode.value, arrNewValue[i])) {
								newValueUseYnY += (newValueUseYnY.length===0 ? arrNewValue[i] : ","+arrNewValue[i]);
							}
						}
						gridObj._setCellData(info.rowIndex, info.colIndex, newValueUseYnY);
	//					console.log("[gridview.checkcombobox onviewchange] newValue : " + info.newValue);
	//					console.log("[gridview.checkcombobox onviewchange] newValueUseYnY : " + newValueUseYnY);
					}
				});
			}
	
			// target 설정을 위한 정보를 반환한다.
			function _getTarget(arrDltId) {
				var target = "[";
				for (var i=0; i<arrDltId.length; i++) {
					target += ( i>0 ? "," : "") +'{"id":"'+ arrDltId[i] +'","key":"codeMap.'+ arrDltId[i] +'"}';
				}
				target += "]";
				return  target;
			}
			
			// dataList를 동적으로 생성하기 위한 옵션 정보를 반환한다.
			function _getCodeDataListOptions(infoArr) {
				var option = {
						"type" : "dataList",
						"option" : {
							"baseNode" : "list",
							"repeatNode" : "map"
						},
						"columnInfo" : []
				};
				for ( var idx in infoArr) {
					option.columnInfo.push({
						"id" : infoArr[idx]
					});
				}
				return option;
			}
	
			// linkedDataList를 동적으로 생성하기 위한 옵션 정보를 반환한다.
			function _getLinkedDataListOptions(bindDataListId, filter) {
				var option = {
						"type" : "linkedDataList",
						"option" : {
							"bind" : bindDataListId,
							"filterCondition" : filter
						}
				};
				return option;
			}
		} catch (e) {
			console.error("[gcm.cd.setCmnCd] Exception :: " + e);
			reject(e);
		}
	});
};

/**
 * 공통코드 팝업 셋팅 (wframe)
 *
 * @memberof gcm.cd
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} grpCd 코드 그룹
 * @param {Object} wfmObj wframe 객체
 * @param {Object} option 객체
 * @param {String} option.ref value에 바인딩할 DataMap의 Key 혹은 DataList의 Column
 * @param {String} option.type 단일선택/멀티선택 구분 (single(기본값)|multi)
 * @param {String} option.displayMode value|label, null(기본값)이면 둘다 
 * @param {String} option.showCols 기타 컬럼 노출시 설정 
 * @param {String} option.headName 컬럼명 설정 
 * @param {String} option.headName.value value 컬럼명 (기본값 Code) 
 * @param {String} option.headName.label label 컬럼명 (기본값 Desc) 
 * @param {String} option.headName.etc1 etc1 컬럼명 (기본값 ETC1) 
 * @param {String} option.headName.etc2 etc2 컬럼명 (기본값 ETC2) 
 * @param {String} option.headName.etc3 etc3 컬럼명 (기본값 ETC3) 
 * @param {Function} option.selectCallback 선택 콜백 함수
 */
gcm.cd.setCmnCdPop = function(scopeScwin, grpCd, wfmObj, option) {
	try {
		option = option || {};
		option.type = option.type || "single";
		option.grpCd = grpCd;
		wfmObj.getWindow().scwin.setCmnCdPop(option);
	} catch (e) {
		console.error("[gcm.cd.setCmnCdPop] Exception :: " + e);
	}
};

/**
 * 공통코드 팝업
 *
 * @memberof gcm.cd
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} grpCd 코드 그룹
 * @param {Object} option 객체
 * @param {String} option.type 단일선택/멀티선택 구분 (single(기본값)|multi)
 * @param {String} option.value 기존 선택값 
 * @param {String} option.srchWord 검색어 
 * @param {String} option.showCols 기타 컬럼 노출시 설정 
 * @param {String} option.headName 컬럼명 설정 
 * @param {String} option.headName.value value 컬럼명 (기본값 Code) 
 * @param {String} option.headName.label label 컬럼명 (기본값 Desc) 
 * @param {String} option.headName.etc1 etc1 컬럼명 (기본값 ETC1) 
 * @param {String} option.headName.etc2 etc2 컬럼명 (기본값 ETC2) 
 * @param {String} option.headName.etc3 etc3 컬럼명 (기본값 ETC3) 
 * @param {Function} option.selectCallback 선택 콜백 함수
 */
gcm.cd.openCmnCdPop = function(scopeScwin, grpCd, option) {
	try {
		var data = option || {};
		data.grpCd = grpCd;
		data.type = data.type || "single";
		var options = {
				  id: "cmnCdPop"
				, popupName : " "
				, width : 600, height : 500
		};
		com.openPopup("/cm/xml/cmnCdPop.xml", options, data, function(retObj) {
			// 팝업 콜백
			if (typeof data.selectCallback == "function") {
				// 선택 콜백이 있으면 선택 콜백 실행
				data.selectCallback(retObj);
			} 
		});
	} catch (e) {
		console.error("[gcm.cd.openCmnCdPop] Exception :: " + e);
	}
};

/**
 * 팝업과 관련된 함수를 작성한다.
 *
 * @class pop
 * @namespace gcm.pop
 */
gcm.pop = {};

/**
 * Alert 메시지 창을 호출한다.
 *
 * @memberof gcm.pop
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} msg 메시지코드 또는 메시지 문자열
 * @param {Function} closeCallback 콜백 함수
 * @param {String} type alert 메시지 스타일 (warn|error|info)
 */
gcm.pop.alert = async function(scopeScwin, msg, closeCallback, alertType, custOpt) {
	try {
		var errcode = custOpt?.errCd || "";
		var popId = "alertPop"+ errcode + (Math.random() * 16).toString().replace(".","");
		var msgStr = gcm.lang.getMsg(msg) || msg;
		var data = {
			  message : msgStr
			, isNotEscape : custOpt?.isNotEscape
			, callbackFn : closeCallback
		};
		var options = {
				  id: popId
				, width : 400
				, height : 150
				, className : alertType || "alert"
//				, disableCloseButton : true // <Object:N> [default: false] disableCloseButton:true 설정 시 type이 window 또는 litewindow일 때 닫기 버튼을 비활성화, disableCloseButton:false 설정 시 닫기 버튼을 활성화 
		};
		if (alertType == "warn") {
			options.popupName = gcm.lang.getLabel("label.xom.wq.etc.WARN") || "경고";
		} else if (alertType == "error") {
			options.popupName = gcm.lang.getLabel("label.xom.wq.etc.ERROR") || "오류";
		} else {
			options.popupName = gcm.lang.getLabel("label.xom.wq.etc.ALERT") || "알림";
		}
		// 브라우저 alert 재정의에 따른 처리
		if (alertType == "browser") {
			options.popupName = "Browser Alert";
			options.className = "warn";
		}
		if (com.isNotEmpty(errcode)) {
			if (0 < document.querySelectorAll("div[id*='"+ errcode +"']").length)
				return false;
		}
 		return await gcm.pop.openPopup(scopeScwin, "/cm/xml/alertPop.xml", options, data);
	} catch (e) {
		console.error("[gcm.pop.alert] Exception :: " + e);
	}
	
};
gcm.pop.warn = async function(scopeScwin, msg, closeCallback, options) {
	return await gcm.pop.alert(scopeScwin, msg, closeCallback, "warn", options);
}
gcm.pop.error = async function(scopeScwin, msg, closeCallback, options) {
	return await gcm.pop.alert(scopeScwin, msg, closeCallback, "error", options);
}

/**
 * Confirm 메시지 창을 호출한다.
 *
 * @memberof gcm.pop
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} msg 메시지코드 또는 메시지 문자열
 * @param {Function} closeCallback 콜백 함수
 * @param {String} popupName 팝업 타이틀
 */
gcm.pop.confirm = async function(scopeScwin, msg, closeCallback, popupName, btnLab) {
	try {
		var popId = "confirmPop" + (Math.random() * 16).toString().replace(".","");
		var msgStr = gcm.lang.getMsg(msg);
		if (gcm.util.isEmpty(msgStr)) {
			msgStr = msg;
		}
		var data = {
			  message : msgStr
			, callbackFn : closeCallback
			, btnLabel : btnLab
		};
		var options = {
				  id: popId
				, popupName : popupName || gcm.lang.getLabel("label.xom.wq.etc.CONFIRM") || "확인"
				, className : "confirm"
				, width : 400
				, height : 150
//				, disableCloseButton : true // <Object:N> [default: false] disableCloseButton:true 설정 시 type이 window 또는 litewindow일 때 닫기 버튼을 비활성화, disableCloseButton:false 설정 시 닫기 버튼을 활성화 
		};
		return await gcm.pop.openPopup(scopeScwin, "/cm/xml/confirmPop.xml", options, data);
	} catch (e) {
		console.error("[gcm.pop.confirm] Exception :: " + e);
	}
};

/**
 * 팝업아이디구하기
 * 초기 설정 된 데이터 란 setJSON, setXML 등과 같은 API들을 통해 설정 된 데이터가 이에 속한다.
 * 추가(C)된 행은 제거한다
 *
 * @memberof gcm.pop
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @example
	gcm.pop.getPopupId(scwin);
 */
gcm.pop.getPopupId = function(scopeScwin) {
	try {
		var parent = opener || parent;

		if (scopeScwin.$w.getPopupId()) {
			return scopeScwin.$w.getPopupId();
		} else {
			return window.scwin.$w.getPopupId();
		}
	} catch (e) {
		console.error("[gcm.pop.getPopupId] Exception :: " + e);
		return null;
	}
};

/**
 * 팝업창 높이 조정
 * 초기 설정 된 데이터 란 setJSON, setXML 등과 같은 API들을 통해 설정 된 데이터가 이에 속한다.
 * 추가(C)된 행은 제거한다
 *
 * @memberof gcm.pop
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @example
	gcm.pop.getPopupId(scwin);
 */
gcm.pop.setMsgPopHeight = function(scopeScwin, grpContentObj) {
	try {
		// 메시지 길이가 길면 높이 조정
		setTimeout(function() {
			var defaultH = 22; // 내용 부분 기본 높이
			var contentH = grpContentObj.getSize("height");
			if (contentH > defaultH) {
				var popupSelector = scopeScwin.$w.$("#" + grpContentObj.id).closest(".w2popup_window");
				var popupH = popupSelector.height();
				var popupT = popupSelector.offset().top;
				popupSelector.height(popupH + contentH - defaultH);
				popupSelector.offset({ "top" : popupT - (contentH - defaultH)/2 });
			}
//			console.log("Default height : " + defaultH);
//			console.log("Content height : " + contentH);
//			console.log("Popup height : " + $p.$("#" + grp_alert.id).closest(".w2popup_window").height());
		}, 1);
	} catch (e) {
		console.error("[gcm.pop.setMsgPopHeight] Exception :: " + e);
		return null;
	}
};

/**
 * 팝업창을 연다.
 *
 * @memberof gcm.pop
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} url url 화면경로
 * @param {Array} options Popup창 옵션
 * @param {String} [options.id] Popup창 아이디
 * @param {String} [options.type] 화면 오픈 타입 ("iframePopup", "wframePopup", "browserPopup")
 * @param {String} [options.width] Popup창 넓이
 * @param {String} [options.height] Popup창 높이
 * @param {String} [options.popupName] useIframe : true시 popup 객체의 이름으로 popup 프레임의 표시줄에 나타납니다.
 * @param {String} [options.useIFrame] [default : false] true : IFrame 을 사용하는 WebSquare popup / false: window.open 을 사용하는 popup
 * @param {String} [options.style] Popup의 스타일을 지정합니다. 값이 있으면 left top width height는 적용되지 않습니다.
 * @param {String} [options.resizable] [default : false]
 * @param {String} [options.modal] [default : false]
 * @param {String} [options.scrollbars] [default : false]
 * @param {String} [options.title] [default : false]
 * @param {String} [options.notMinSize] [default : false]
*/
gcm.pop.openPopup = async function(scopeScwin, url, opt, data, callbackFn) {
	// 동일한 ID의 팝업은 두 개 이상 뜨지 못하게 처리
	var tmpSchPopup = WebSquare.util.getPopup(scopeScwin.$w.id + opt.id);
	opt.type = opt.type || "wframePopup";
	if (opt.type != "browserPopup" && com.isNotEmpty(tmpSchPopup)) 
		return false;
	
	return new Promise((resolve, reject) => {
		try {
			var _dataObj = {
					type : "json",
					data : data || {},
					name : "param",
			};
			if (callbackFn) {
				_dataObj.data.callbackFn = callbackFn;
			}
			var width = opt.width || 500;
			var height = opt.height || 500;
	
			var deviceWidth = parseFloat($("body").css("width"));
			var deviceHeight = parseFloat($("body").css("height"));
			
			var scopeId = scopeScwin?.$w?.id;
			
			// 웹스퀘어에서 popup 파라미터를 받을 때 JSON.stringify 로 넘겨 함수가 넘어가지 않음... 전역 컨테이너에서 resolve객체 관리
			var popContIdx = ++gcm.POP_RESOLVE_CONTAINER["popContIdx"];
			var idx = "__pop_resolve_Func__" + new Date().getTime() + "_" + popContIdx;
			gcm.POP_RESOLVE_CONTAINER["popContSave"][scopeScwin.$w.id + idx] = resolve;
			_dataObj.data.resolve = scopeScwin.$w.id + idx;
			
			
			if (scopeId) {
				_dataObj.data.openerId = scopeId;
			} else if (typeof event != "undefined") {
				var eventTarget = com.getComponent(event.target.id);
				_dataObj.data.openerId = eventTarget ? eventTarget.scope_id : "";
			} else {
				_dataObj.data.openerId = "";
			}
			
	
			if (!opt.notMinSize) {
				var borderSize = 4;
				if(opt.type != "browserPopup"){
					borderSize = 4
					if (deviceWidth > 0 && width > deviceWidth) {
						width = deviceWidth - borderSize; // 팝업 border 고려
					}
	
					if (deviceHeight > 0 && height > deviceHeight) {
						height = deviceHeight - borderSize; // 팝업 border 고려
					}
	
				} else {
					if (window.screen.availHeight <= height) {
						height = window.screen.availHeight-100;
					}
				}
			}
	
			if (opt.type == "browserPopup") {
				var top = !gcm.util.isEmpty(opt.top) ? opt.top : Math.floor(((window.screen.availHeight- 50 - height))/ 2) + (window.screen.availTop|| 0) + "px";
				var left = !gcm.util.isEmpty(opt.left) ? opt.left : Math.floor((window.screen.availWidth - width) / 2) + (window.screen.availLeft || 0 ) + "px";
			} else {
				var top = !gcm.util.isEmpty(opt.top) ? opt.top : ((document.body.offsetHeight / 2) - (parseInt(height) / 2) + $(document).scrollTop()) + "px";
				var left = !gcm.util.isEmpty(opt.left) ? opt.left : ((document.body.offsetWidth / 2) - (parseInt(width) / 2) + $(document).scrollLeft()) + "px";
			}
	
			if (typeof _dataObj.data !== "undefined" && _dataObj.data.callbackFn) {
				if (typeof _dataObj.data.callbackFn == "function") {
					// callbackFn이 function객체인경우 gcm 객체에서 관리
					var cbFuncIdx = ++gcm.CB_FUNCTION_MANAGER["cbFuncIdx"];
					var idx = "__close_callback_Func__" + new Date().getTime() + "_" + cbFuncIdx;
					gcm.CB_FUNCTION_MANAGER["cbFuncSave"][scopeScwin.$w.id + idx] = _dataObj.data.callbackFn;
					_dataObj.data.callbackFn = scopeScwin.$w.id + idx;
				} else if (typeof _dataObj.data.callbackFn === "undefined") {
					_dataObj.data.callbackFn = "";
				} else if (_dataObj.data.callbackFn.indexOf("gcm") !== 0) {
					_dataObj.data.callbackFn = scopeScwin.$w.id + _dataObj.data.callbackFn;
				}
			}
	
			var paramUrl = "";
			if ((opt.type !== "wframePopup") && (gcm.util.isEmpty(_dataObj.data) === false)) {
				paramUrl = "&" + _dataObj.name + "=" + WebSquare.text.BASE64Encode(gcm.str.serialize(_dataObj.data)) ;
			}
	
			var options = {
					id : opt.id,
					popupName : opt.popupName || "",
					type : opt.type || "wframePopup",
					width : width + "px",
					height : height + "px",
					top : top,
					left : left,
					modal : (opt.modal == false) ? false : true,
					//frameModal : true, // 자식 팝업 함께 닫기
					dataObject : _dataObj,
					alwaysOnTop : opt.alwaysOnTop || false,
					//useModalStack : (opt.useModalStack == false) ? false : true,
					useModalStack : (opt.modal == false) ? false : true,
					resizable : (opt.resizable == true) ? true : false,
					useMaximize : opt.useMaximize || false,
					className :opt.className || "",
					scrollbars : true,
					disableCloseButton : opt.disableCloseButton || false, // <Object:N> [default: false] disableCloseButton:true 설정 시 type이 window 또는 litewindow일 때 닫기 버튼을 비활성화, disableCloseButton:false 설정 시 닫기 버튼을 활성화 
					closeAction : opt.closeAction || "gcm.pop.closeAction",
					processMsgFrame: true,
					//popupUrl : "popup.html"
	//				popupUrl : "../popup.do"
			};
	
			if (options.type !== "wframePopup") {
				scopeScwin.$w.openPopup(gcm.CONTEXT_ROOT + url + paramUrl, options);
			} else {
				scopeScwin.$w.openPopup(gcm.CONTEXT_ROOT + url, options);
			}
		} catch (e) {
			console.error("[gcm.pop.openPopup] Exception :: " + e);
		}
	});
};

/**
 * 팝업창 우상단 X버튼 클릭시 변경분이 있는지 확인 절차를 거친다. 
 * gcm.pop.openPopup시 기본값
 *
 * @memberof gcm.pop
 * @param {String} popupId popup창 id
 */
gcm.pop.closeAction = function (popupId) {
	let isClose = true;	// 닫기, 닫지않기 구분
	
	try {
		var popupWindow = $w.getPopupWindow(popupId);
		var scopeScwin  = popupWindow.scwin;
//		console.log("[gcm.pop.closeAction] : " + popupId);
		if (scopeScwin.closeActionFlag != true) {
			$(':focus').blur(); // 입력중에 X버튼 클릭시 입력중인 컴포넌트의 dataCollection에 바인딩하기 위해 blur() 처리 (blur시점에 dataCollection에 바인딩됨)
			if (gcm.valid.isModified(scopeScwin.checkList)) {
				gcm.pop.confirm(scopeScwin, "message.xom.wq.018"/*저장하지 않은 변경사항이 있습니다. 계속하시겠습니까?*/, function(ret) {
					if (ret) {
						scopeScwin.closeActionFlag = true;
						scopeScwin.$w.closePopup(popupId);
					}
				});
				isClose = false; // false 리턴시 팝업창 닫지 않음
			} 
		} else {
			scopeScwin.closeActionFlag = false;
		}
		
		if (isClose) {
			// 시점 문제로 인해 함수 분리
			var timeoutFunc = function(popupParam, parentObj, popupWindowObj) {
				if (popupParam && Object.keys(popupParam).length > 0) {
					if (parentObj === window) parentObj = com.getComponent(popupParam.openerId)?.scope;
					var parentCom = null;
					var errorCnt  = 0;
					do {
						parentCom = parentObj.com;
						if (parentCom && parentCom.file.uploadObj.length > 0) {
							parentCom.file.globalSetting();
							break;
						} else {
							parentObj = parentObj.$p.parent();
						}
						errorCnt++;
					} while (parentObj.$p.getFrameId().includes("wframe") && errorCnt < 100)
				}
				popupWindowObj.frame.hideProcessMessage();
			}
			
			var popupWindowObj = this;
			var popupParam = gcm.data.getParameter(scopeScwin);
			var parentObj = scopeScwin.$w.parent();
			var popResolveStr = popupParam.resolve;
			var popResolve = gcm.POP_RESOLVE_CONTAINER["popContSave"][popResolveStr];
			
			if (popupWindow && popupWindow.com.file.hasAttach) {
				popupWindowObj.frame.showProcessMessage("잠시만 기다려주세요.");
				
				// raonKUploader의 MultiTransfer 함수와 시점 문제로 인하여 0.3초 정도 딜레이
				setTimeout(timeoutFunc, 300, popupParam, parentObj, popupWindowObj);
			}
			
			if (popResolve && typeof popResolve == "function") {
				delete gcm.POP_RESOLVE_CONTAINER["popContSave"][popResolveStr];
				popResolve(popupParam);
			}
		}
	} catch (e) {
		console.error("[gcm.pop.closeAction] Exception :: " + e);
	}
	
	return isClose;
};

/**
 * 팝업창을 닫는다.
 *
 * @memberof gcm.pop
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} popId popup창 id로 값이 없을 경우 현재창의 아이디
 * @param {String|Object} 부모 창에 전달한 데이터
 * @example
	gcm.pop.closePopup(scwin);
	gcm.pop.closePopup(scwin, "scwin.zipPopupCallback" , '{message:"정상처리되었습니다"}');
	gcm.pop.closePopup(scwin, "scwin.zipPopupCallback" , '정상처리되었습니다.');
 */
gcm.pop.closePopup = function (scopeScwin, retObj) {
	try {
		var popId = gcm.pop.getPopupId(scopeScwin);
		var callbackFnStr = gcm.data.getParameter(scopeScwin).callbackFn;
		var retStr = gcm.str.serialize(retObj);
		var popResolveStr = gcm.data.getParameter(scopeScwin).resolve;
		var popResolve = gcm.POP_RESOLVE_CONTAINER["popContSave"][popResolveStr];
		delete gcm.POP_RESOLVE_CONTAINER["popContSave"][popResolveStr];

		if (!gcm.util.isEmpty(callbackFnStr) && !gcm.util.isEmpty(retStr)) {
			var func;
			if (callbackFnStr.indexOf("__close_callback_Func__") > -1) {
				func = gcm.CB_FUNCTION_MANAGER["cbFuncSave"][callbackFnStr];
				delete gcm.CB_FUNCTION_MANAGER["cbFuncSave"][callbackFnStr];
			} else {
				func = window.WebSquare.util.getGlobalFunction(callbackFnStr);
			}

			if (gcm.pop.isPopup(scopeScwin)) {
				if (scopeScwin.$w.isWFramePopup()) {
					scopeScwin.$w.closePopup(popId);
					if (func) {
						func(gcm.util.getJSON(retStr));
					}

				} else {
					var funcArr = callbackFnStr.split(".");
					if (opener[funcArr[0]] && typeof opener[funcArr[0]][funcArr[1]] == "function") {
						opener[funcArr[0]][funcArr[1]]
						func = opener[funcArr[0]][funcArr[1]];
						func(gcm.util.getJSON(retStr));
					}
					$w.closePopup();
				}
			} else {
				scopeScwin.$w.closePopup(popId);
				if (func) {
					func(gcm.util.getJSON(retStr));
				}
			}
		} else {
			if (gcm.pop.isPopup(scopeScwin)) {
				if (scopeScwin.$w.isWFramePopup()) {
					scopeScwin.$w.closePopup(popId);
				} else {
					$w.closePopup();
				}
			} else {
				scopeScwin.$w.closePopup(popId);
			}
		}
		popResolve(gcm.util.getJSON(retStr));
	} catch (e) {
		console.error("[gcm.pop.closePopup] Exception :: " + e);
	}
};

/**
 * 현재 오픈된 전체 팝업창을 닫는다.
 *
 * @memberof gcm.pop
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @example
	gcm.pop.closeAllPopup(scwin);
 */
gcm.pop.closeAllPopup = function(scopeScwin) {
	try {
		// WebSquare.uiplugin.popup.popupList 속성은 엔진 내 비공개 속성으로 공통에서만 제한적으로 사용함(업무 화면 소스 사용 금지)
		var popupList = WebSquare.uiplugin.popup.popupList;
		for (var idx = 0; idx < popupList.length; idx++) {
			scopeScwin.$w.closePopup(WebSquare.uiplugin.popup.popupList[idx].id);
		}
	} catch (e) {
		console.error("[gcm.pop.closeAllPopup] Exception :: " + e);
	}
};

/**
 * 현재 화면이 팝업 인지의 여부를 반환한다.
 *
 * @memberof gcm.pop
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @return {Boolean} 팝업인 경우 true, 팝업이 아닌 경우 false
 * @example
	if (gcm.pop.isPopup()) {
		gcm.pop.alert("현재 화면은 팝업입니다.");
	};
 */
gcm.pop.isPopup = function(scopeScwin) {
	try {
		return scopeScwin.$w.isPopup();
	} catch (e) {
		console.error("[gcm.pop.isPopup] Exception :: " + e);
	}
};

/**
 * 첨부파일과 관련된 함수를 작성한다.
 *
 * @class file
 * @namespace gcm.file
 */
gcm.file = {};

/**
 * 첨부파일 wframe을 설정한다.
 *
 * @memberof gcm.file
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} wfmObj 공통 첨부파일 wframe 객체
 * @param {Object} option 첨부파일 옵션 객체
 * @param {String} option.refKey 참조키 (업무 테이블과 조인시 사용되는 Key 값 : 업무테이블Key 또는 파일그룹ID)
 * @param {String} option.subDir 업무구분 (기본값 : 해당 Scope의 프로그램ID) [주의] websquare.xml 환경설정 파일의 baseDir 경로 하위에 subDir/yyyyMM/에 저장됨)
 * @param {Number} option.maxFileCount 업로드 가능한 파일 개수 (기본값 : 3, 5개이내)
 * @param {Number} option.maxFileSize 업로드 가능한 파일 크기 (단위 MB, 기본값 : 2MB) [주의] websquare.xml에 설정된 maxUploadSize값(5MB)보다 커서는 안됨
 * @param {String} option.filter 업로드 가능한 파일 확장자 (기본값 : websquare.xml에 설정된 allowedExtension, deniedExtension에 설정을 따름)  [주의] websquare.xml에 설정 밖의 확장자는 허용 불가 
 * @param {Boolean} option.readOnly 읽기전용 여부 (기본값 : false. false시 기존 파일 삭제 및 파일첨부 가능, true시 기존 파일 목록 조회 및 다운로드만 가능)
 */
gcm.file.setFileUpload = function(scopeScwin, wfmObj, option) {
	try {
		option = option || {};
		// subDir이 없으면 파일첨부 불가
		if (gcm.util.isEmpty(option.subDir)) {
			console.error("[gcm.file.setFileUpload] subDir is Empty.");
			wfmObj.setSrc("");
			return;
		} else {
			wfmObj.setSrc(gcm.CONTEXT_ROOT + "/cm/xml/fileUpload.xml");
		}
		// 첨부파일 dataList 생성후 첨부파일 공통 wframe의 alias dataList와 연결
		var dltId = gcm.FILE_INFO.DATA_PREFIX + option.subDir;
		var dltFileObj = gcm.data.createDataList(scopeScwin, gcm.FILE_INFO.DATA_PREFIX + option.subDir, gcm.FILE_INFO.FILED_ARR);
		wfmObj.getWindow().adl_file.setScope("../" + dltId);
		// 첨부파일 조회용 dataMap 생성 
		var dmaSrchObj = gcm.data.createDataMap(wfmObj.getWindow().scwin, "dma_search", [gcm.FILE_INFO.SUB_DIR, gcm.FILE_INFO.REF_KEY]);
		// File Upload 옵션 정보
		var _option = {
			  refKey : option.refKey || ""
			, subDir : option.subDir || gcm.win.getScopeMenuObj(scopeScwin)[gcm.MENU_INFO.SERVICE_ID]
			, maxFileCount : option.maxFileCount || 3
			, maxFileSize : option.maxFileSize * 1024 * 1024 || 2 * 1024 * 1024
			, filter : option.filter || "png, gif, jpg, jpeg, doc, docx, xls, xlsx, ppt, pptx, pdf, txt, xml, csv, zip, hwp"
			, readOnly : option.readOnly === true ? true : false
		};
		wfmObj.getWindow().scwin.setFileUpload(_option);
	} catch (e) {
		console.error("[gcm.file.setFileUpload] Exception :: " + e);
	}
};

/**
 * 첨부파일을 업로드하고 콜백함수를 실행한다.
 *
 * @memberof gcm.file
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} wfmObj 공통 첨부파일 wframe 객체
 * @param {Function} uploadCallback 파일 업로드 콜백 함수 (업로드 완료 후 업무정보 및 파일정보 DB 저장 처리 로직 구현 필요)
 */
gcm.file.uploadFile = function(scopeScwin, wfmObj, uploadCallback) {
	try {
		var adlObj = wfmObj.getWindow().adl_file;
		if (adlObj.getInsertedIndex().length > 0) {
			// 새로운 첨부파일이 있으면 첨부파일 업로드 후 업로드 콜백에서 저장 처리
			wfmObj.getWindow().scwin.uploadCallback = uploadCallback;
			wfmObj.getWindow().mpd_file.startUpload();
		} else {
			// 새로운 첨부파일이 없으면 바로 콜백 수행
			uploadCallback(false);
		}
	} catch (e) {
		console.error("[gcm.file.uploadFile] Exception :: " + e);
	}
};

/**
 * 첨부파일을 다운로드한다.
 *
 * @memberof gcm.file
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} refKey 참조키
 * @param {String} fileId 파일 ID
 */
gcm.file.downloadFile = function(scopeScwin, refKey, fileId) {
	try {
		var fileInfo = {};
		fileInfo[gcm.FILE_INFO.REF_KEY] = refKey;
		fileInfo[gcm.FILE_INFO.FILE_ID] = fileId;
		$W.layer.showProcessMessage(gcm.lang.getMsg("message.xom.wq.027"/*다운로드 중입니다.*/));
		// 파일 다운로드 요청
		var xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function(){
			if (this.readyState == 4) {
				if (this.status == 200){
					var filename = "";
					var disposition = xhr.getResponseHeader('Content-Disposition');
					if (disposition && disposition.indexOf('attachment') !== -1) {
						var filenameRegex = /filename[^;=\n]*=((['"]).*?\2|[^;\n]*)/;
						var matches = filenameRegex.exec(disposition);
						if (matches != null && matches[1]) {
							filename = matches[1].replace(/['"]/g, '');
							filename = decodeURIComponent(filename);
						}
					}
					// blob 다운로드
					if (window.navigator && window.navigator.msSaveOrOpenBlob) {
						// IE에서 동작
						window.navigator.msSaveBlob(this.response, filename);
					} else {
						// 크롬에서 동작
						var link = document.createElement('a');
						link.download = filename;
						link.href = URL.createObjectURL(this.response);
						link.click();
						delete link;
					}
				} else {
					if (this.status == 601) {
						gcm.pop.error(scopeScwin, "message.xom.wq.028"/*파일정보를 찾을 수 없습니다.*/);
					} else if (this.status == 602) {
						gcm.pop.error(scopeScwin, "message.xom.wq.029"/*파일이 존재하지 않습니다.*/);
					} else {
						gcm.pop.error(scopeScwin, "message.xom.wq.030"/*다운로드 중 오류가 발생하였습니다.*/);
					}
				}
				$W.layer.hideProcessMessage();
			} 
		}
		xhr.open('POST', "/com/file/downloadFile.do");
		xhr.setRequestHeader('Content-type', 'application/json');
		xhr.responseType = 'blob'; // !!필수!!
		xhr.send(JSON.stringify({reqData : fileInfo}));
	} catch (e) {
		console.error("[gcm.file.downloadFile] Exception :: " + e);
	}
};

/**
 * 첨부파일 팝업을 오픈한다.
 *
 * @memberof gcm.file
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} option 첨부파일 옵션 객체
 * @param {String} option.fileGrpId 파일 그룹 ID
 * @param {Number} option.maxFileCount 업로드 가능한 전체 첨부 파일 개수
 * @param {Number} option.maxFileSize 업로드 가능한 개별 첨부 파일 크기 (단위 MB, websquare.xml 환경설정 파일의 maxUploadSize 값보다는 작아야 함)
 * @param {Number} option.totalFileSize 업로드 가능한 전체 첨부 파일 크기 (단위 MB)
 * @param {String} option.filter 업로드 가능한 파일 확장자 (websquare.xml 환경설정 파일의 allowedExtension에도 존재해야 함)
 * @param {Function} closeCallback 콜백 함수
 */
gcm.file.openFilePopup = function(scopeScwin, option, closeCallback) {
	try {
		var prgId = gcm.win._getActiveWin().scwin.menuObj[gcm.MENU_INFO.SERVICE_ID] || gcm.win._getActiveWin().scwin.menuObj[gcm.MENU_INFO.MENU_ID]; // 화면ID
		var data = {
			 fileGrpId : option.fileGrpId || ""
			,maxFileCount : option.maxFileCount || 5
			,maxFileSize : option.maxFileSize * 1024 * 1024 || 10485760
			,totalFileSize : option.totalFileSize * 1024 * 1024 || 536870912
			,filter : option.filter || "png, gif, jpg, jpeg, bmp, txt, doc, docx, xls, xlsx, ppt, pptx, pdf, xml, csv, hwp, zip"
			,prgId : prgId
		};
		var options = {
			 id : "filePop"
			,popupName : "파일 첨부"
			,width : 800, height: 420 
		};
		gcm.pop.openPopup(scopeScwin, "/cm/xml/fileUploadPop.xml", options, data, closeCallback);
	} catch (e) {
		console.error("[gcm.file.openFilePopup] Exception :: " + e);
	}
};

/**
 * DataCollection 제어, 글로벌 데이터 제어(gcm의 함수를 호출), 화면 간 데이터 전달 함수를 작성한다.
 *
 * @class data
 * @namespace gcm.data
 */
gcm.data = {};

/**
 * 특정 컴포넌트에 바인된 DataList나 DataMap의 정보를 반환한다.
 *
 * @memberof gcm.data
 * @param {Object} comObj callerObj 컴포넌트 객체
 * @returns {Object} dataCollection정보
 */
gcm.data.getDataCollection = function(comObj) {
	try {
		if ((typeof comObj !== "undefined") && (typeof comObj.getRef === "function")) {
			if (comObj.getPluginName() === "gridView") {
				return comObj.getDataListInfo();
			} else {
				var ref = comObj.options.ref;
				if ((typeof ref !== "undefined") && (ref !== "")) {
					var refArray = ref.substring(5).split(".");
					if ((typeof refArray !== "undefined") && (refArray.length === 2)) {
						var dataObjInfo = {};
						dataObjInfo.runtimeDataCollectionId = comObj.getScopeWindow().$p.getFrameId() + "_" + refArray[0];
						dataObjInfo.dataColletionId = refArray[0];
						dataObjInfo.columnId = refArray[1];
						return dataObjInfo;
					} else {
						return null;
					}
				} else {
					return null;
				}
			}
		}
	} catch (e) {
		console.error("[gcm.data.getDataCollection] Exception :: " + e);
		return null;
	} finally {
		dataCollection = null;
	}
};

/**
 * DataList를 동적으로 생성한다.
 *
 * @memberof gcm.data
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} dsId	:: I :: Y ::  :: DataList의 아이디
 * @param {Array} colArr   :: I :: Y ::  :: 컬럼정보
 * @param {Array} typeArr  :: I :: Y ::  :: 컬럼들의 dataType 정의
 * @return {Object} dataCollection(dataList)
 * @example
	var dlObj = gcm.data.createDataList(scwin, "dlt_code", ["cdGrp", "cd", "nm","ord"], ["text", "text", "text", "text"]);
 */
gcm.data.createDataList = function(scopeScwin, dsId, colArr, typeArr) {
	try {
		var dltObj = gcm.util.getComponent(scopeScwin, dsId);
		if (!gcm.util.isEmpty(dltObj)) {
			scopeScwin.$w.data.remove( dsId );
		}
		var colInfoJSON = [];
		if (typeof colArr !== "undefined") {

			colInfoJSON = [];

			for (var i=0; i < colArr.length; i++) {
				var dataType = "text";
				if (typeof typeArr !== "undefined") {
					dataType = typeArr[i];
				}
				var colInfo = {
						"id" : colArr[i],
						"dataType" : dataType,
						"name" : colArr[i]
				};
				colInfoJSON.push(colInfo);
			}
		}
		var dataCollectionJSON = {
				id : dsId,
				type : "dataList",
				option : {
					"baseNode" : "list",
					"repeatNode" : "map",
					"saveRemovedData" : "true"
				},
				columnInfo : colInfoJSON
		};
		var codeDataObj = scopeScwin.$w.data.create(dataCollectionJSON);
		return gcm.util.getComponent(scopeScwin, dsId);
	} catch (e) {
		console.error("[gcm.data.createDataList] Exception :: " + e);
		return null;
	}
};

/**
 * DataMap을 동적으로 생성한다.
 *
 * @memberof gcm.data
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} dsId	:: I :: Y ::  :: dataMap 의 아이디
 * @param {Array} colArr   :: I :: Y ::  :: 컬럼정보
 * @author Inswave Systems
 * @return {Object} dataCollection(dataMap)
 * @example
	var mapObj = gcm.data.createDataMap("dma_test", ["col1", "col2", "col3"] , ["text", "text", "text"]);
 */
gcm.data.createDataMap = function(scopeScwin, dsId, colArr, typeArr) {
	try {
		var dltObj = gcm.util.getComponent(scopeScwin, dsId);
		if (!gcm.util.isEmpty(dltObj)) {
			scopeScwin.$w.data.remove( dsId );
		}
		var colInfoJSON = [];
		if (typeof colArr !== "undefined") {
			colInfoJSON = [];
			for (var i=0; i < colArr.length; i++) {
				var dataType = "text";
				if (typeof typeArr !== "undefined") {
					dataType = typeArr[i];
				}
				var colInfo = {
						"id" : colArr[i],
						"type" : dataType,
						"name" : colArr[i]
				};
				colInfoJSON.push(colInfo);
			}
		}
		var dataCollectionJSON = {
				"id" : dsId,
				"type" : "dataMap",
				"option" : {
					"baseNode" : "map",
				},
				"keyInfo" : colInfoJSON
		};
		scopeScwin.$w.data.create(dataCollectionJSON);
		return gcm.util.getComponent(scopeScwin, dsId);
	} catch (e) {
		console.error("[gcm.data.createDataMap] Exception :: " + e);
		return null;
	}
};

/**
 * 조건에 맞는 데이터를 반환한다.
 * 
 * @memberof gcm.data
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} dataListObj : DataList Id 또는 DataList 객체
 * @param {Array|Object} condArr 비교 조건
 * @param {String} condArr.columnId 컬럼 아이디
 * @param {String} condArr.operator 비교 연산자 ( ==, !=, >, <, >=, <=, LIKE )
 * @param {String|Number|Boolean} condArr.value 비교 값
 * @param {String} condArr.logical 논리 연산자 ( &&, ||)
 * @returns {Array} JSON 배열
 * @example
	gcm.data.getMatchedJSON(dlt_memberList, { columnId : "POSITION_CD", operator : "==", value : "03"});
	
	gcm.data.getMatchedJSON(dlt_memberList, [
		{ columnId : "POSITION_CD", operator : "==", value : "03" },
		{ columnId : "DUTY_CD", operator : "==", value : "02", logical : "&&" }
	]);
	
	gcm.data.getMatchedJSON(dlt_memberList, [
		{ columnId : "POSITION_CD", operator : "==", value : "03" },
		{ columnId : "DUTY_CD", operator : "==", value : "02" }
	]);
	
	gcm.data.getMatchedJSON(dlt_memberList, [
		{ columnId : "POSITION_CD", operator : "==", value : "03"},
		{ columnId : "DUTY_CD", operator : "lIKE", value : "0", logical : "||" }
	]);
 */
gcm.data.getMatchedJSON = function(scopeScwin, dataListObj, condArr, isIndex) {
	try {
		if (typeof dataListObj === "string") {
			dataListObj = scopeScwin.$w.getComponentById(dataListObj);
		}

		var returnData = [];
		var allData = dataListObj.getAllJSON();

		if (gcm.util.isArray(condArr) === false) {
			condArr = [ condArr ];
		}

		for (var idx = 0; idx < allData.length; idx++) {
			var result = true;

			for (var conIdx = 0; conIdx < condArr.length; conIdx++) {
				var colValue = allData[idx][condArr[conIdx].columnId.trim()];
				var value = condArr[conIdx].value;
				var operator = condArr[conIdx].operator.trim();
				var logical = (condArr[conIdx].logical || "&&").trim();

				if (operator === "==") {
					if (colValue == value) {
						if (logical === "||") {
							result = true;
							break;
						}
					} else {
						result = false;
					}
				} else if (operator === "!=") {
					if (colValue != value) {
						if (logical === "||") {
							result = true;
							break;
						}
					} else {
						result = false;
					}
				} else if (operator === ">") {
					if (colValue > value) {
						if (logical === "||") {
							result = true;
							break;
						}
					} else {
						result = false;
					}
				} else if (operator === "<") {
					if (colValue < value) {
						if (logical === "||") {
							result = true;
							break;
						}
					} else {
						result = false;
					}
				} else if (operator === ">=") {
					if (colValue >= value) {
						if (logical === "||") {
							result = true;
							break;
						}
					} else {
						result = false;
					}
				} else if (operator === "<=") {
					if (colValue <= value) {
						if (logical === "||") {
							result = true;
							break;
						}
					} else {
						result = false;
					}
				} else if (operator === "LIKE") {
					if (colValue.indexOf(value) > -1) {
						if (logical === "||") {
							result = true;
							break;
						}
					} else {
						result = false;
					}
				} else {
					result = false;
				}
			}

			if (result === true) {
				if (isIndex === true) {
					returnData.push(idx);
				} else {
					returnData.push(allData[idx]);
				}
			}
		}

		return returnData;
	} catch (e) {
		console.error("[gcm.data.getMatchedJSON] Exception :: " + e);
		return null;
	}
};

/**
 * JSON Object를 sessionStorage에 저장한다.
 *
 * @memberof gcm.data
 * @param {String} key 키이름
 * @param {Object} obj JSON 객체
 * @example
	gcm.data.setSessionStorage("loginInfo", {userId : "test"});
 */
gcm.data.setSessionStorage = function (key, obj) {
	try {
		sessionStorage.setItem(key, JSON.stringify(obj));
	} catch (e) {
		console.error("[gcm.data.setSessionStorage] Exception :: " + e);
	}
};

/**
 * sessionStorage에 저장한 정보를 JSON Object로 반환한다.
 *
 * @memberof gcm.data
 * @param {String} key 키이름
 * @return {Object} JSON 객체
 * @example
	gcm.data.getSessionStorage("loginInfo");
 */
gcm.data.getSessionStorage = function (key) {
	try {
		return JSON.parse(sessionStorage.getItem(key));
	} catch (e) {
		console.error("[gcm.data.getSessionStorage] Exception :: " + e);
	}
};

/**
 * JSON Object를 localStorage에 저장한다.
 *
 * @memberof gcm.data
 * @param {String} key 키이름
 * @param {Object} obj JSON 객체
 * @example
	gcm.data.setLocalStorage("loginInfo", {userId : "test"});
 */
gcm.data.setLocalStorage = function (key, obj) {
	try {
		localStorage.setItem(key, JSON.stringify(obj));
	} catch (e) {
		console.error("[gcm.data.setLocalStorage] Exception :: " + e);
	}
};

/**
 * localStorage에 저장한 정보를 JSON Object로 반환한다.
 *
 * @memberof gcm.data
 * @param {String} key 키이름
 * @return {Object} JSON 객체
 * @example
	gcm.data.getLocalStorage("loginInfo");
 */
gcm.data.getLocalStorage = function (key) {
	try {
		return JSON.parse(localStorage.getItem(key));
	} catch (e) {
		console.error("[gcm.data.getLocalStorage] Exception :: " + e);
	}
};

/**
 * 로그인정보를 담은 JSON Object를 저장한다.
 * IE의 경우 localStorage에 저장하고 그외에는 sessionStorage에 저장
 *
 * @memberof gcm.data
 * @param {Object} obj JSON 객체
 * @example
	gcm.data.setLoginInfo({userId : "test"});
 */
gcm.data.setLoginInfo = function (obj) {
	try {
		if (gcm.util._getUserAgent() == "msie") {
			gcm.data.setLocalStorage("loginInfo", obj);
		} else {
			gcm.data.setSessionStorage("loginInfo", obj);
		}
	} catch (e) {
		console.error("[gcm.data.setLoginInfo] Exception :: " + e);
	}
};

/**
 * 로그인정보를 JSON Object로 반환한다.
 *
 * @memberof gcm.data
 * @return {Object} JSON 객체
 * @example
	gcm.data.getLoginInfo("userId");
 */
gcm.data.getLoginInfo = function (key) {
	try {
//		var loginInfo = gcm.USER_SESSION || {};
		if (gcm.util._getUserAgent() == "msie") {
			var loginInfo = gcm.data.getLocalStorage("loginInfo");
		} else {
			var loginInfo = gcm.data.getSessionStorage("loginInfo");
		}
		if (key) {
			return loginInfo[key];
		} else {
			return loginInfo;
		}
	} catch (e) {
		console.error("[gcm.data.getLoginInfo] Exception :: " + e);
		return null;
	}
};

/**
 * MDI 창 닫기전 변경사항이 있는지 체크하여, 변경사항이 있으면 알림창을 띄우고 변경사항이 없으면 해당 창을 닫는다.
 *
 * @memberof gcm.data
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} tabId TabControl의 tabId
 */
gcm.data.checkBeforeClose = function(scopeScwin, tabId) {
	try {
		// TODO: iframe(레거시 페이지나 jsp)의 경우 scwin 스코프가 없으므로 대안 필요
		//var dcObjArr = gcm.win._getLayoutWin(tabId).scwin.checkList;
		if (mf_wdc_layout.getUserData('isOnbeforeCloseAll') && mf_wdc_layout.windows[0].windowId == tabId) {
			return;
		}

		if (gcm.util.isAprListMenu(tabId)){
			com.alert("결재 문서함 탭은 닫을 수 없습니다.");
			return;
		}

		if ($('#mf_wdc_layout_name').children().length == 1) {
			com.alert("마지막 탭은 닫을 수 없습니다.");
			return;
		}

		var dcObjArr;
		try {
			dcObjArr = gcm.win._getLayoutWin(tabId).scwin.checkList;
		} catch (e) {
			dcObjArr = {};
		}
		
		if (gcm.valid.isModified(dcObjArr)) {
			var title = "";
			if (gcm.LAYOUT_TYPE == "TAC") {
				title = $p.top().tac_layout.getLabelText($p.top().tac_layout.getTabIndex(tabId));
			} else if (gcm.LAYOUT_TYPE == "WDC") {
				title = $p.top().wdc_layout.getWindowLabel(tabId, "window");
			}
			var msg = gcm.lang.getMsg("message.xom.wq.026"/*{0} 화면에 저장하지 않은 변경사항이 있습니다. 계속하시겠습니까?*/, title);
			gcm.pop.confirm(scopeScwin, msg, function(ret) {
				if (ret) {
					gcm.win.isChecked = true;
					if (gcm.LAYOUT_TYPE == "TAC") {
						$p.top().tac_layout.deleteTab($p.top().tac_layout.getTabIndex(tabId));
					} else if (gcm.LAYOUT_TYPE == "WDC") {
						if ($p.top().wdc_layout.getFrame(tabId).render.localName != 'iframe') {
							$p.top().wdc_layout.getWindow(tabId).com.file.uploadObj.forEach(
								function(elt) { 
									delete(gcm.attach.globalRaonkUploaderArr[elt.uploadId.frameID]);
//										gcm.attach.globalRaonkUploaderIdArr.pop(gcm.attach.globalRaonkUploaderIdArr.indexOf(elt.uploadId.ID));
								}
							);
						}
						$p.top().wdc_layout.closeWindow(tabId);
					}
				} else {
					if (gcm.LAYOUT_TYPE == "TAC") {
						$p.top().tac_layout.setSelectedTabIndex($p.top().tac_layout.getTabIndex(tabId));
					} else if (gcm.LAYOUT_TYPE == "WDC") {
						var menuObj = gcm.win.getMenuObj(tabId);
						if (!gcm.util.isEmpty(menuObj)) {
							gcm.win.openMenu(menuObj);
						}
					}
				}
			});
			return false;
		} else {
			if ($p.top().wdc_layout.getFrame(tabId).render.localName != 'iframe') {
				$p.top().wdc_layout.getWindow(tabId).com.file.uploadObj.forEach(
					function(elt) { 
						delete(gcm.attach.globalRaonkUploaderArr[elt.uploadId.frameID]);
//							gcm.attach.globalRaonkUploaderIdArr.pop(gcm.attach.globalRaonkUploaderIdArr.indexOf(elt.uploadId.ID));
					}
				);
			}
			return true;
		}
	} catch (e) {
		console.error("[gcm.data.checkBeforeClose] Exception :: " + e);
		return false;
	}
};

/**
 * 조회시 변경사항이 있는지 체크하여, 변경사항이 있으면 알림창을 띄우고 변경사항이 없으면 조회를 수행한다.
 *
 * @memberof gcm.data
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Function} searchFn 조회 함수
 * @param {Array} checkList 체크할 dataCollection 배열 (null이면 scwin.checkList 배열 객체를 참조한다.)
 * @author Inswave Systems
 */
gcm.data.checkBeforeSearch = function(scopeScwin, searchFn, checkList) {
	try {
		var dcObjArr = checkList || scopeScwin.checkList;
		if (gcm.valid.isModified(dcObjArr)) {
			gcm.pop.confirm(scopeScwin, "message.xom.wq.018"/*저장하지 않은 변경사항이 있습니다. 계속하시겠습니까?*/, function(ret) {
				if (ret) {
					searchFn();
				}
			});
		} else {
			searchFn();
		}
	} catch (e) {
		console.error("[gcm.data.checkBeforeSearch] Exception :: " + e);
		return false;

	}
};

/**
 * inputCalendar간의 기간 역전 체크
 *
 * @memberof gcm.data
 * @param {Object}	fromObj 시작일 inputCalendar 객체
 * @param {Object}	toObj 종료일 inputCalendar 객체
 */
gcm.data.checkPeriod = function (fromObj, toObj) {
	try {
		fromObj.bind("onchange", function() {
			if (!com.isEmpty(fromObj.getValue()) && !com.isEmpty(toObj.getValue()) && fromObj.getValue() > toObj.getValue()) {
				//com.warn("message.xom.wq.020"/*시작일은 종료일보다 작아야 합니다.*/, function() {
					toObj.setValue(fromObj.getValue());
					//fromObj.focus();
				//});
			}
		});
		toObj.bind("onchange", function() {
			if (!com.isEmpty(fromObj.getValue()) && !com.isEmpty(toObj.getValue()) && fromObj.getValue() > toObj.getValue()) {
				//com.warn("message.xom.wq.021"/*종료일은 시작일보다 커야 합니다.*/, function() {
					fromObj.setValue(toObj.getValue());
					//toObj.focus();
				//});
			}
		});
	} catch (e) {
		console.error("[gcm.data.checkPeriod] Exception :: " + e);
	}
};


/**
 * inputCalendar간의 기간 역전 체크
 *
 * @memberof gcm.data
 * @param {Object}	fromObj 시작일 inputCalendar 객체
 * @param {Object}	toObj 종료일 inputCalendar 객체
 */
gcm.data.uncheckPeriod = function (fromObj, toObj) {
	try {
		fromObj.unbind("onchange");
		toObj.unbind("onchange");
	} catch (e) {
		console.error("[gcm.data.unCheckPeriod] Exception :: " + e);
	}
};

/**
 * dataList의 시작일 종료일 컬럼간의 기간 역전 체크
 *
 * @memberof gcm.data
 * @param {Object}	info dataList의 onbeforecelldatachange 이벤트 인자
 * @param {Object}	gridObj GridView 객체
 * @param {String}	fromId 시작일 컬럼 ID
 * @param {String}	toId 종료일 컬럼 ID
 * @return {Boolean} 기간 역전시 false
*/
gcm.data.checkGridPeriod = function (gridObj, info, fromId, toId) {
	try {
		var dltObj = gcm.grid.getGridDataList(gridObj);
		// 시작일과 종료일 기간 역전 체크
		if (info.colID == fromId) {
			var toDate = dltObj.getCellData(info.rowIndex, toId);
			if (!com.isEmpty(info.newValue) && !com.isEmpty(toDate) && info.newValue > toDate) {
				com.warn("message.xom.wq.020"/*시작일은 종료일보다 작아야 합니다.*/, function() {
					dltObj.setCellData(info.rowIndex, info.colID, "");
					gridObj.setFocusedCell(info.rowIndex, info.colID, true);
				});
				return false;
			}
		} else if (info.colID == toId) {
			var fromDate = dltObj.getCellData(info.rowIndex, fromId);
			if (!com.isEmpty(info.newValue) && !com.isEmpty(fromDate) && info.newValue < fromDate) {
				com.warn("message.xom.wq.021"/*종료일은 시작일보다 커야 합니다.*/, function() {
					dltObj.setCellData(info.rowIndex, info.colID, "");
					gridObj.setFocusedCell(info.rowIndex, info.colID, true);
				});
				return false;
			}
		}
		return true;
	} catch (e) {
		console.error("[gcm.data.checkGridPeriod] Exception :: " + e);
		return false;
	}
};

/**
 * 신규 등록에 사용하는 dataMap 빈값으로 초기화
 *
 * @memberof gcm.data
 * @param {Object}	dmaObj dataMap 객체
 */
gcm.data.initDataMap = function (dmaObj) {
	try {
		dmaObj.setEmptyValue();
		dmaObj.set("rowStatus", "C");
		dmaObj.reform();
	} catch (e) {
		console.error("[gcm.data.initDataMap] Exception :: " + e);
	}
};

/**
 * 신규 등록에 사용하는 dataList 빈값으로 초기화
 *
 * @memberof gcm.data
 * @param {Object}	dmaObj dataList 객체
 */
gcm.data.initDataList = function (dltObj) {
	try {
		dltObj.removeAll();
		dltObj.reform();
	} catch (e) {
		console.error("[gcm.data.initDataList] Exception :: " + e);
	}
};

/**
 * 파라미터를 읽어 온다.
 *
 * @memberof gcm.data
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} 파라미터 키
 * @return {Object} 파라미터 값
 */
gcm.data.getParameter = function (scopeScwin, paramKey) {
	try {
		var paramData = scopeScwin.$w.getParameter("param");
		if ((gcm.util.isEmpty(paramData) === false) && gcm.util.isJSON(paramData)) {
			if (gcm.util.isEmpty(paramKey) === false) {
				return paramData[paramKey];
			} else {
				return paramData;
			}
		} else {
			// 찾기
			if (gcm.util.isEmpty(paramData)) {
				paramData = getUrlParameter('param');
			}

			if (gcm.util.isEmpty(paramData) === false) {
				// Base64 문자열인지 확인하여 자동 Decoding 처리
				if (isBase64(paramData)) {
					paramData = WebSquare.text.BASE64Decode(paramData);
					// SSO 인증 후 최초 호출시 &amp; 로 파라미터 구분자가 처리되는 버그(?) 방어 로직
					if (paramData && -1 < paramData.indexOf('amp;')) {
						paramData = paramData.replace(/amp;/g,'');
					}
				}
				// Url 파라미터를 배열로 리턴하여 처리
				var params = getUrlParameters(paramData);
				if (params && 0 < params.length && gcm.util.isNotEmpty(paramKey)) {
					return (params) ? params[paramKey] : "";
				} else {
					return paramData;
				}
			}
		}
		return "";
		
		function isBase64(str) {
		    if (str ==='' || str.trim() ===''){ return false; }
		    try {
		        return btoa(atob(str)) == str;
		    } catch (err) {
		        return false;
		    }
		}
		
		/**
		 * 파라미터 전체 배열 반환
		 */
		function getUrlParameters(paramData) {
			var results = [];
			var paramArray = paramData.split(/[\&\?\#]/);
			paramArray.forEach( function(param) {
				if (param) {
					var queries = param.split(/\=/);
					if (queries && 1 < queries.length) {
						results[queries[0]] = queries[1];
						results.length++;
					}
				}
			});
			return results;
		}

		/**
		 * 파라미터 반환
		 */
		function getUrlParameter(paramKey) {
			var param = [];
			var paramArray = location.search.split(/[\&\?\#]/);
			for (var i = 0; i < paramArray.length; i++) {
				if (gcm.util.isEmpty(paramArray[i]) === false) {
					var valueIdx = paramArray[i].indexOf("=");
					if (valueIdx > 0) {
						var key = paramArray[i].substring(0, valueIdx);
						var value = paramArray[i].substring(valueIdx + 1);
						if (key === paramKey) {
							return value;
						}
					}
				}
			}
		}
	} catch (e) {
		console.error("[gcm.data.getParameter] Exception :: " + e);
		return null;
	}
};

/**
 * 현재 페이지의 파라미터를 세팅한다.
 *
 * @memberof gcm.data
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} 파라미터 
 * @return {Object} 파라미터 값
 * @example
	var param = {
		empno : "3223"
	};
	gcm.data.setParameter(scwin, param);
 */

gcm.data.setParameter = function(scopeScwin, param) {
	try {
		var paramData = {};
		
		paramData.name = "param";
		paramData.type = "json";
		paramData.data = scopeScwin.$w.getFrame()._dataObject.data;
		paramData.data = Object.assign(paramData.data, param)
		scopeScwin.$w.getFrame()._dataObject = paramData;
		
		return scopeScwin.$w.getFrame()._dataObject;
	} catch (e) {
		console.error("[gcm.data.setParameter] Exception :: " + e);
		return null;
	}
}
/**
 * 페이지 별 임시저장을 하기위한 함수
 * @param {object} scopeScwin - 임시저장을 할 스코프의 window 객체
 * @param {object} menuObj - 임시저장하는 스코프의 메뉴 객체
 */
gcm.data.saveTemporary = function(scopeObj, menuObj) {
	let isDocument = menuObj.serviceNewUrl.indexOf("D.xml") > -1;
	
		if (gcm.util.isEmpty(menuObj) || !isDocument) return false;
	
	const savedJsonArr = [];
	const serviceID = menuObj.serviceID;
	const frameDataCollectionArr = gcm.data.getAllScopeDataCollection(scopeObj);
	
	// $w.data.getAllDataCollection - Websquare API 존재하는 화면의 모든 DataCollection을 가져온다.
	frameDataCollectionArr.map((element, index) => {
    	var id = element.org_id;
    	var value = element.initializeType === "dataMap" ? element.getJSON() : element.getAllJSON();
    	savedJsonArr.push({ "key" : id, "value" : value });
	});
	
	let reqData = {
			"serviceID" : serviceID,
			"data" : savedJsonArr,
			"syspayno" : gcm.data.getLoginInfo("sn")
	};
	
	gcm.sbm.executeDynamic(scopeObj.scwin, {id: "sbm_saveTemp", action : "/rest/saveTemporary.pwkjson"}, {
		  processMsg: "임시 저장 중 입니다..."
		, requestData: reqData
		, successCallback: function(e) {
			
		}
	});
	
};

/**
 * 스코프 내 모든 데이터컬렉션을 가져오는 공통함수 (wframe 포함)
 * @param {object} scopeScwin - 스코프의 객체
 */
gcm.data.getAllScopeDataCollection = function(scopeObj) {
	const frameId = scopeObj.$w.getFrameId();
	const frameDataCollection = [];
	
	// $w.data.getAllDataCollection - Websquare API 존재하는 화면의 모든 DataCollection을 가져온다.
	$w.data.getAllDataCollection("object").map((element, index) => {
	    if (element.scope_id == frameId && (!element.id.includes("dlt_cmnCd") && !element.id.includes("ldt_cmnCd"))) {
	    	frameDataCollection.push(element);
	    }
	});
	
	return frameDataCollection;
};

/**
 * 스코프 내 모든 데이터컬렉션을 초기화하는 공통함수 (wframe 포함)
 * @param {object} scopeScwin - 스코프의 객체
 */
gcm.data.initAllFrameDataCollection = function(scopeObj) {
	const dataCollectionArr = gcm.data.getAllScopeDataCollection(scopeObj);
	
	dataCollectionArr.forEach((element) => {
		if (element.initializeType === "dataMap") {
			gcm.data.initDataMap(element);
		} else {
			gcm.data.initDataList(element);
		}
	});
};

/**
 * 화면 제어와 관련된 함수를 작성한다.
 *
 * @class win
 * @namespace gcm.win
 */
gcm.win = {};

/**
 * 브라우저의 뒤로가기 처리 (MDI이면 뒤로가기 방지, SDI면 뒤로가기 효과)
 * 1) MDI 이면 뒤로가기 방지 (TabControl, WindowContainer 레이아웃)
 * 초기페이지 진입시 history.pushState 함수로 새로운 history state를 추가 하여 이전 페이지로 갈 수 없도록 하고,
 * 이후 페이지가 뒤로가면서 생기는 history의 변경을 popstate 이벤트로 캐치 하여 처리 하는 방식
 * 단, 일부 브라우저(크롬)는 사용자가 페이지 내에서 상호작용을 한 기록이 없는 경우 뒤로 갈 수 있다.
 * 2) SDI면 뒤로가기 효과 (Wframe 레이아웃)
 * 초기페이지 진입시 history.replaceState 함수로 메인화면의 history state를 추가하고 
 * 메뉴 변경에 따른 화면 이동시에 history.pushState 함수로 새로운 history state를 추가 하여,
 * 이후 페이지가 뒤로가면서 생기는 history의 변경을 popstate 이벤트로 캐치 하여 history state의 정보를 토대로 뒤로가기 효과를 주는 방식
 *
 * @memberof gcm.win
 */
gcm.win.backControl = function() {
	try {
		gcm.win.innerDoc = false;
		if (gcm.LAYOUT_TYPE == "TAC" || gcm.LAYOUT_TYPE == "WDC") {
			// MDI인 경우 뒤로가기 방지
			history.pushState({page:"first"}, null, gcm.CONTEXT_ROOT); // + "/main.do");// + "#first");
		}
		window.addEventListener('mouseover', function(event) {
			gcm.win.innerDoc = true;
		});
		window.addEventListener('mouseout', function(event) {
			gcm.win.innerDoc = false;
		});
		window.addEventListener('popstate', function(event) {
			if (gcm.LAYOUT_TYPE == "TAC" || gcm.LAYOUT_TYPE == "WDC") {
				// MDI인 경우 뒤로가기 방지
				history.pushState({page:"historyChanged"}, null, gcm.CONTEXT_ROOT); // + "/main.do");// + "#change");
				if (!gcm.win.innerDoc) {
//					console.log("뒤로가기 방지");
				};
			} else if (gcm.LAYOUT_TYPE == "WFM") {
				// SDI인 경우 뒤로가기 처리
				if (event.state && !com.isEmpty(event.state.src)) {
//					console.log("뒤로가기 처리 src : " + event.state.src);
					$p.top().wfm_layout.setSrc(event.state.src, { "dataObject" : {
								"type" : "json",
								"name" : "param",
								"data" : event.state.param || {}
					}});
				}
			}
		});
	} catch (e) {
		console.error("[gcm.win.backControl] Exception :: " + e);
	}
};

/**
 * onbeforeunload 이벤트 추가 (페이지 나갈시 경고)
 * 일부 브라우저(크롬)는 사용자가 페이지 내에서 상호작용을 한 기록이 없는 경우 확인 대화 상자를 표시하지 않을 수 있다. 이는 확인 대화 상자를 불필요하게 사용하거나 악의적으로 이용하는 경우를 방지하기 위함이다.
 *
 * @memberof gcm.win
 */
gcm.win.addEventOnBeforeUnload = function() {
	try {
		if (window.addEventListener) { // all browsers except IE before version 9
			window.addEventListener("beforeunload", gcm.win._alertBeforeUnload);
		} else {  // IE before version 9
			window.attachEvent("onbeforeunload", gcm.win._alertBeforeUnload);
		}
	} catch (e) {
		console.error("[gcm.win.addEventOnBeforeUnload] Exception :: " + e);
	}
};

/**
 * onbeforeunload 이벤트 제거 (페이지 나갈시 경고 안함)
 *
 * @memberof gcm.win
 */
gcm.win.removeEventOnBeforeUnload = function() {
	try {
		if (window.removeEventListener) { // all browsers except IE before version 9
			window.removeEventListener("beforeunload", gcm.win._alertBeforeUnload);
		} else {  // IE before version 9
			window.detachEvent("onbeforeunload", gcm.win._alertBeforeUnload);
		}
	} catch (e) {
		console.error("[gcm.win.removeEventOnBeforeUnload] Exception :: " + e);
	}
};

/**
 * window.onbeforeunload 이벤트 핸들러 - 경고창 띄움
 *
 * @memberof gcm.win
 */
gcm.win._alertBeforeUnload = function(e) {
	var e = e || window.event;
	// For IE and Firefox
	if (e) {
		e.returnValue = "변경사항이 저장되지 않을 수 있습니다.";
	}
	// For Safari
	return "변경사항이 저장되지 않을 수 있습니다.";
};
	
/**
 * xml 화면 요청시 공통 요청 해더 설정
 *
 * @memberof gcm.win
 * @param {Object} requestObj XMLHttpRequest 객체
 */
gcm.win._setRequestHeader = function(requestObj) {
	try {
		requestObj.setRequestHeader("x-session-token", gcm.SESSION_TOKEN);
	} catch (e) {
		console.error("[gcm.win._setRequestHeader] Exception :: " + e);
	}
};

/**
 * queryString으로 넘어온 파라미터를 읽어온다.
 *
 * @memberof gcm.win
 * @param {String} param 파라미터 키
 * @return {String] 파라미터 값
 */
gcm.win._getQueryString = function(param) {
	try {
		var url = unescape(location.href);
		var paramArr = (url.substring(url.indexOf("?")+1, url.length)).split("&");
		var value = "";
		for(var i=0; i<paramArr.length; i++) {
			var temp = paramArr[i].split("=");
			if(temp[0].toUpperCase() == param.toUpperCase()) {
				value = temp[1];
				break;
			}
		}
		return value;
	} catch (e) {
		console.error("[gcm.win._getQueryString] Exception :: " + e);
		return null;
	}
};

/**
 * 특정 컴포넌트가 속한 WFrame Scope을 반환한다.
 *
 * @memberof gcm.win
 * @param {Object} compObj 컴포넌트 객체 또는 아이디(WFrame Scope 경로를 포함한 Full Path Id)
 * @return {Object} Scope Window 객체
 */
gcm.win._getScope = function(compObj) {
	try {
		if (typeof compObj === "string") {
			//var scopeObj = gcm.util.getComponent(compObj);
			var scopeObj = $w.getComponentById(compObj);
			if (scopeObj !== null) {
				return scopeObj.getScopeWindow();
			}
		} else {
			return compObj.getScopeWindow();
		}
	} catch (e) {
		console.error("[gcm.win._getScope] Exception :: " + e);
		return null;
	}
};

/**
 * 레이아웃 컴포넌트 객체를 반환한다. (tac_layout 또는 wdc_layout 또는 wfm_layout)
 *
 * @memberof gcm.win
 * @return {Object} 레이아웃 컴포넌트 객체 
 */
gcm.win._getLayoutComp = function() {
	try {
		if (gcm.LAYOUT_TYPE == "TAC") {
			return $p.top().tac_layout;
		} else if (gcm.LAYOUT_TYPE == "WDC") {
			return $p.top().wdc_layout;
		} else if (gcm.LAYOUT_TYPE == "WFM") {
			return $p.top().wfm_layout;
		}
	} catch (e) {
		console.error("[gcm.win._getLayoutComp] Exception :: " + e);
		return null;
	}
};

/**
 * 레이아웃 컴포넌트 객체의 윈도우 객체를 반환한다.
 *
 * @memberof gcm.win
 * @param {String} id tab 또는 window id
 * @return {Object} 레이아웃 컴포넌트의 해당 id 윈도우 객체 
 */
gcm.win._getLayoutWin = function(id) {
	try {
		return gcm.win._getLayoutComp().getWindow(id);
	} catch (e) {
		console.error("[gcm.win._getLayoutComp] Exception :: " + e);
		return null;
	}
};

/**
 * 레이아웃 컴포넌트 객체의 현재 활성화된 윈도우 객체를 반환한다.
 *
 * @memberof gcm.win
 * @return {Object} 레이아웃 컴포넌트의 해당 id 윈도우 객체 
 */
gcm.win._getActiveWin = function() {
	try {
		if (gcm.LAYOUT_TYPE == "WFM") {
			return $p.top().wfm_layout.getWindow();
		} else if (gcm.LAYOUT_TYPE == "TAC") {
			return $p.top().tac_layout.getWindow($p.top().tac_layout.getSelectedTabID());
		} else if (gcm.LAYOUT_TYPE == "WDC") {
			return $p.top().wdc_layout.getWindow($p.top().wdc_layout.getSelectedWindowId());
		}
	} catch (e) {
		console.error("[gcm.win._getActiveWin] Exception :: " + e);
		return null;
	}
};

/**
 * 현재 Scope의 메뉴객체를 반환한다. (wframe이나 팝업의 경우 조상의 메뉴객체 반환)
 *
 * @memberof gcm.win
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @return {Object} 메뉴객체
 */
gcm.win.getScopeMenuObj = function(scopeScwin) {
	try {
		if (gcm.win._getLayoutComp()) {
			while (scopeScwin.$w.id.startsWith(gcm.win._getLayoutComp().id)) {
				if(scopeScwin.menuObj) {
					return scopeScwin.menuObj;
				} else {
					scopeScwin = scopeScwin.$w.parent().scwin;
				}
			}
		} else {
			return null;
		}
	} catch (e) {
		console.error("[gcm.win.getScopeMenuObj] Exception :: " + e);
		return null;
	}
};

/**
 * 특정 메뉴ID의 메뉴객체를 반환한다.
 * 콜백 함수 파라미터가 있는 경우 콜백함수 호출의 파라미터로 서비스ID 전달하고 그 외의 경우에는 리턴값으로 service 정보를 반환한다.
 * @memberof gcm.win
 * @param {String} serviceid 프로그램ID 또는 메뉴ID
 * @return {Object} 메뉴객체
 */
gcm.win.getMenuObj = function(serviceid, callbackFn, isPop) {
	try {
		var arrMenu = [];
		
		// pop.jsp 에서도 사용하기 위해 아래 로직은 isPop == true 가 아닐때만 동작하도록 수정
		if (!(isPop == true)) {
			var menuData = $p.top().wfm_side.getWindow().dlt_menu;
			var aprMenuData = $p.top().wfm_side.getWindow().dlt_apr_menu;
			// 결재메뉴 데이터 컬렉션 분리 관련 처리
			arrMenu = menuData.getMatchedJSON(gcm.MENU_INFO.SERVICE_ID, serviceid, true);
			if (0 == arrMenu) arrMenu = menuData.getMatchedJSON(gcm.MENU_INFO.MENU_ID, serviceid, true);
			if (0 == arrMenu) arrMenu = aprMenuData.getMatchedJSON(gcm.MENU_INFO.SERVICE_ID, serviceid, true);
		}
		
		if (0 < arrMenu.length) {
			if (callbackFn && "function" == typeof callbackFn) {
				// 콜백 함수 파라미터가 있는 경우 콜백함수 호출의 파라미터로 서비스 객체 전달
				(callbackFn)(arrMenu[0]);
			} else {
				return arrMenu[0];
			}
			
		} else {
			if (null == serviceid || '' == serviceid || 4 != serviceid.length) {
				alert("gcm.win.getMenuObj 오류: 서비스ID 파라미터가 없습니다.\n시스템 문의 부탁드립니다.");
				return;
			}
			// 서비스 정보를 클라이언트로 가져오기전에 콜백 파라미터가 있는 경우는 동적으로 메뉴정보를 가져온다. 
			return new Promise((resolve, reject) => {
				com.executeDynamic({id : "sbm_getMenu", action : "SvcGetMenu.pwkjson"}, {
					  requestData: { serviceID : serviceid }
					, processMsg : ""	// silence
					, successCallback: function (ret) {
						let menuObj = ret.responseJSON.elData;
						if (menuObj) {
							if (callbackFn && "function" == typeof callbackFn) {
								// 콜백 함수 파라미터가 있는 경우 콜백함수 호출의 파라미터로 서비스 객체 전달
								(callbackFn)(menuObj);
							}
							
							resolve(menuObj);
						} else {
							resolve(null);
						}
					}
				});
			});
		}
	} catch (e) {
		// ignore 메뉴 정보가 없음
		console.error("[gcm.win.getMenuObj] Exception :: " + e);
	}
	return null;
};

/**
 * 특정 메뉴를 오픈한다.
 * 
 * @memberof gcm.win
 * @param {Object} menuObj 메뉴 객체
 * @param {Object} paramObj 파라미터 객체 - 메뉴 오픈시 전달할 파라미터 JSON 객체
 * @param {Boolean} closeable 닫기버튼 보여주기 여부
 * @example
	var menuObj = {};
	menuObj[gcm.MENU_INFO.SERVICE_ID] = "P001";
	menuObj[gcm.MENU_INFO.MENU_ID] = "M001";
	menuObj[gcm.MENU_INFO.MENU_NM] = "인사조회";
	menuObj[gcm.MENU_INFO.SRC_PATH] = "/tmp/tmp01.xml";
	gcm.win.openMenu(menuObj);
 */
gcm.win.openMenu = function(menuObj, paramObj, closable) {
	try {		
		if (gcm.util.isEmpty(menuObj)) {
			com.warn("message.xom.wq.019"/*메뉴 정보가 없습니다.*/);
			return false;
		}
		var isLegacy = gcm.util.isLegacyMenu(menuObj);
		
		var menuId = menuObj[gcm.MENU_INFO.SERVICE_ID] || menuObj[gcm.MENU_INFO.MENU_ID];
		var menuNm = menuObj[gcm.MENU_INFO.MENU_NM];
		var srcPath = !gcm.util.isEmpty(menuObj[gcm.MENU_INFO.NEW_PATH]) ? menuObj[gcm.MENU_INFO.NEW_PATH] : menuObj[gcm.MENU_INFO.SRC_PATH];
		
		if (!isLegacy && (gcm.util.isEmpty(menuId) || gcm.util.isEmpty(menuNm))) {
			com.warn("message.xom.wq.019"/*메뉴 정보가 없습니다.*/);
			return false;
		}
		if (!isLegacy && gcm.util.isEmpty(srcPath)) {
			com.warn("message.xom.wq.024"/*화면 경로가 등록되어 있지 않습니다.*/);
			return false;
		}
		var data;
		if (!isLegacy && srcPath.indexOf("/") !== 0) {
			srcPath = "/" + srcPath;
		}
		srcPath = gcm.CONTEXT_ROOT + srcPath;
		if ((typeof paramObj !== "undefined") && (paramObj !== null)) {
			data = paramObj;
		} else {
			data = {};
		}
		data.menuObj = menuObj;
		var dataObj = { 
			type : "json", 
			name : "param", 
			data : data
		}
		if (gcm.LAYOUT_TYPE == "TAC") {
			var tabObj = { 
				  closable : (closable == false) ? false : true //탭 닫기 기능 제공
				, openAction : "select" // exist : 기존 탭을 갱신, new : 항상 새탭으로, select : 동일 id 가 존재하면 선택, last: 기존 tab을 마지막 tab으로 이동후 선택
				, label : menuNm 
			};
			var contObj = {
				  frameMode : "wframePreload"
				, scope : true
				, src : srcPath
//				, alwaysDraw : true
				, alwaysDraw : false // split이 적용된 화면의 경우 화면이 랜더링되기 전에 split 객체 생성시 minSize가 안 먹는 현상이 있어 false로 변경
				, title : menuNm
				, dataObject : dataObj
			};
			if (!srcPath.endsWith(".xml")) {
				contObj.frameMode = "iframe";
			}
			$p.top().tac_layout.addTab(menuId, tabObj, contObj);
			// tabObj의 openAction의 last값의 동작 특이 사항으로 선택이 되지 않은 경우 선택하는 로직 추가
			if ($p.top().tac_layout.getSelectedTabID() !== menuId) {
				var tabIndex = $p.top().tac_layout.getTabIndex(menuId);
				if (tabIndex) {
					$p.top().tac_layout.setSelectedTabIndex(tabIndex);
				}
			}
		} else if (gcm.LAYOUT_TYPE == "WDC") {
			var options = {
				  title : menuNm
				, src : srcPath
				, windowTitle : menuNm
				, windowId : menuId
				, openAction : "existWindow" // 미지정시 id가 동일 창이 있으면 확인창 띄움. existWindow : 기존 탭을 갱신 / newWindow : 항상 새로운 창을 생성 / selectWindow : id가 동일한 창이 있으면 그 윈도우를 선택
				, frameMode : "wframe"
				, fixed : (closable == false) ? true : false
				, dataObject : dataObj
				, closeAction : function(title) {
					// 메인은 닫히지 않도록 처리
					if (title === "메인") {
						return false;
					} else {
						// 창 닫기전 변경사항이 있는지 체크 (변경사항이 없으면 gcm.data.checkBeforeClose 함수내에서 닫음)
						if (gcm.win.isChecked === true) {
							gcm.win.isChecked = false;
							return true;
						} else {
							return gcm.data.checkBeforeClose(scwin, menuId);
						}
					}
				}
			}
			
			if (isLegacy){
				options.frameMode = "iframe";
//				options.src = "http://dbiz.kitech.re.kr" + "/filter/index.jsp?serviceid=" + options.windowId;
				options.src = gcm.baseUrls.oldBizUrl + "/filter/index.jsp?serviceid=" + (paramObj && !(options.windowId) ? paramObj.serviceId : options.windowId);
				// AS-IS화면에 파라미터를 보내기 위해 data 객체 복사
				var cloneParamObj = Object.assign({}, paramObj); 
				// AS-IS화면에 파라미터를 보내기 위해 복사한 파라미터 객체에서 필요 없는 데이터 삭제
				if (cloneParamObj.callbackFn)
					delete cloneParamObj.callbackFn;
				if (cloneParamObj.openerTabId)
					delete cloneParamObj.openerTabId;
				if (cloneParamObj.menuObj)
					delete cloneParamObj.menuObj;
				
				if (menuObj && menuObj.param) {
					cloneParamObj = Object.assign(cloneParamObj, menuObj.param);
				}
				
				if (cloneParamObj && Object.keys(cloneParamObj).length != 0) {
					
					options.src += "&" + Object.keys(cloneParamObj).map(function(key) {
						return key + '=' + cloneParamObj[key];
					}).join('&');
				}
				console.log( options.src);
			} else if (gcm.util.isAprListMenu(menuId)) {
				var aprWindow = $p.top().wdc_layout.windows.find(win => gcm.util.isAprListMenu(win.windowId));
				if (aprWindow) {
					var aprCom = com.getComponent(aprWindow.window.frame.id + "_com");
					aprCom.movePageMenu(menuId, paramObj);
					return;
				}
			}
			// history 객체에 현재 오픈 메뉴 상태 추가 2022.07.15
			// 주석 처리 후 인수 인계 (테스트가 충분하지 않음...)
			// 일단 기능동작은 확인 완료.
			// gcm.win.pushState(menuObj);
			setTimeout(function(){ 
				// 이전창으로 포커싱 되는 문제 회피
				$p.top().wdc_layout.createWindow(options);
				// MDI 탭 색상 변경
				gcm.util.changeTabColor();
			},1);
		} else if (gcm.LAYOUT_TYPE == "WFM") {
			// 업무화면 이동전 변경사항이 있는지 체크
			var dcObjArr = $p.top().wfm_layout.getWindow().scwin.checkList;
			if (gcm.valid.isModified(dcObjArr)) {
				gcm.pop.confirm(scopeScwin, "message.xom.wq.026"/*{0} 화면에 저장하지 않은 변경사항이 있습니다. 계속하시겠습니까?*/, function(ret) {
					if (ret) {
						// 뒤로가기 처리용
						history.pushState({ "src" : srcPath, "param" : dataObj.data || {} }, null);
						// 업무화면 이동
						$p.top().wfm_layout.setSrc(srcPath, { "dataObject" : dataObj });
					}
				});
			} else {
				// 뒤로가기 처리용
				history.pushState({ "src" : srcPath, "param" : dataObj.data || {} }, null);
				// 업무화면 이동
				$p.top().wfm_layout.setSrc(srcPath, { "dataObject" : dataObj });
			}
		} 

		// 메뉴 접속 로그 기록
		gcm.win.access(menuId);

		return true;
	} catch (e) {
		console.error("[gcm.win.openMenu] Exception :: " + e);
	}
};

/**
 * 메뉴 엑세스 로깅 및 클라이언트 세션정보를 갱신한다. 
 */
gcm.win.access = function(serviceId, callbackFn) {
	gcm.sbm.executeDynamic(scwin, {id: "sbm_accessLog", action : "/SvcAccessLogging.pwkjson"}, {
		  processMsg: ""
		, requestData: { serviceID: serviceId }
		, successCallback: function(e) {
			
			if (e.responseJSON && e.responseJSON.userHeader && e.responseJSON.userHeader.session) { 
				// 클라이언트 세션 정보 갱신	
				gcm.data.setLoginInfo(e.responseJSON.userHeader.session);
				if (callbackFn && "function" == typeof callbackFn) {
					(callbackFn)();
				}
			}
		}
	});
};

/**
 * 특정 화면을 MDI의 새탭으로 오픈한다.
 *
 * @memberof gcm.win
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} menuId 화면ID 또는 메뉴ID (메뉴로 등록된 화면을 오픈할 경우 사용, 등록되지 않은 화면의 경우 null)
 * @param {String} pageNm 화면명
 * @param {String} url 화면 파일 경로
 * @param {String} subIndex 서브 인덱스 (오프너의 windowId 에 postFix로 붙여 windowId로 사용)
 * @param {Object} paramObj
 * @param {Function} callbackFn 콜백함수
 */
gcm.win.openTab = function(scopeScwin, menuId, pageNm, url, subIndex, paramObj, callbackFn) {
	try {
		var data = paramObj ? paramObj : {};
		var tabId;
		if (gcm.LAYOUT_TYPE == "TAC") {
			tabId = $p.top().tac_layout.getSelectedTabID();
		} else if (gcm.LAYOUT_TYPE == "WDC") {
			tabId = $p.top().wdc_layout.getSelectedWindowId();
		}
		data.openerTabId = tabId;
		if (typeof callbackFn == "function") {
			// callbackFn이 function객체인경우 gcm 객체에서 관리
			var cbFuncIdx = ++gcm.CB_FUNCTION_MANAGER["cbFuncIdx"];
			var idx = "__close_callback_Func__" + new Date().getTime() + "_" + cbFuncIdx;
			gcm.CB_FUNCTION_MANAGER["cbFuncSave"][scopeScwin.$w.id + idx] = callbackFn;
			data.callbackFn = scopeScwin.$w.id + idx;
		} else if (!gcm.util.isEmpty(callbackFn)) {
			// callbackFn이 함수명인 경우 full name 전달
			data.callbackFn = scopeScwin.$w.id + callbackFn;
		}

		if (menuId) {
			// 이미 같은 아이디의 MDI 가 존재한다면 활성화만 하고, 없다면 새로운 MDI 탭으로 오픈한다.
			const index = $p.top().wdc_layout.windows.findIndex(function(win) {return menuId == win.windowId;});
			
			// 타겟이 리스트로 이동하는 경우만 예외 처리 추가
			if (-1 < index && 'list' === pageNm) {
				$p.top().wdc_layout.setFocus(index);
				
				// 포커싱 만 할 경우라도 상세 탭을 오픈할 당시 선언한 콜백 함수를 실행한다.
				const param = gcm.data.getParameter(scopeScwin);
				const callbackFnStr = param.callbackFn;
				if (-1 < callbackFnStr && callbackFnStr.indexOf("__close_callback_Func__")) {
					let func = gcm.CB_FUNCTION_MANAGER["cbFuncSave"][callbackFnStr];
					delete gcm.CB_FUNCTION_MANAGER["cbFuncSave"][callbackFnStr];
					(func)(param);
				}
			} else {
				gcm.win.getMenuObj(menuId, function(menuObj) {
					gcm.win.openMenu(menuObj, data);
				});
			}
			
		} else {
			if (url.indexOf("/") !== 0) {
				url = "/" + url;
			}
			url = gcm.CONTEXT_ROOT + url;
			var menuObj = {};
			menuObj[gcm.MENU_INFO.MENU_ID] = tabId + "_" + subIndex;
			menuObj[gcm.MENU_INFO.MENU_NM] = pageNm;
			menuObj[gcm.MENU_INFO.NEW_PATH] = url;
			gcm.win.openMenu(menuObj, data);
		}
	} catch (e) {
		console.error("[gcm.win.openTab] Exception :: " + e);
	}
};

/**
 * 현재 MDI 탭 닫으면서 오픈한 화면의 콜백 함수 실행
 *
 * @memberof gcm.win
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} retObj 반환 객체
 */
gcm.win.closeTab = function(scopeScwin, retObj) {
	try {
		var param = gcm.data.getParameter(scopeScwin);
		var openerTabId = param.openerTabId;
		var callbackFnStr = param.callbackFn;
		if (retObj) {
			var func;
			if (callbackFnStr && callbackFnStr.indexOf("__close_callback_Func__") > -1) {
				func = gcm.CB_FUNCTION_MANAGER["cbFuncSave"][callbackFnStr];
				delete gcm.CB_FUNCTION_MANAGER["cbFuncSave"][callbackFnStr];
			} else if (retObj && callbackFnStr) {
				func = window.WebSquare.util.getGlobalFunction(callbackFnStr);
			}
			if (func) {
				func(retObj);
			}
		}
		if (gcm.LAYOUT_TYPE == "TAC") {
			$p.top().tac_layout.deleteTab($p.top().tac_layout.getSelectedTabIndex());
			$p.top().tac_layout.setSelectedTabIndex($p.top().tac_layout.getTabIndex(openerTabId));
		} else if (gcm.LAYOUT_TYPE == "WDC") {
			
			$p.top().wdc_layout.closeWindow($p.top().wdc_layout.getSelectedWindowId());
		}
	} catch (e) {
		console.error("[gcm.win.closeTab] Exception :: " + e);
	}
};

/**
 * 화면전환하기 (동일 탭에서 이동)
 * 3.0 작성중 문서함에서는 우측 컨텐츠 프레임만 전환
 * 2.0 에서 결재신청 시 신규 스냅샷 MDI 열린 직후 해당 서비스MDI 제거
 * 스냅샷 MDI를 전자결재 메뉴 메커니즘에서 제거 
 *
 * @memberof gcm.win
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} menuId 화면ID 또는 메뉴ID (메뉴로 등록된 화면을 오픈할 경우 사용, 등록되지 않은 화면의 경우 null)
 * @param {String} pageNm 화면명
 * @param {String} url 화면 파일 경로
 * @param {String} subIndex 서브 인덱스 (오프너의 windowId 에 postFix로 붙여 windowId로 사용)
 * @param {Object} paramObj
 */
gcm.win.movePage = function(scopeScwin, menuId, pageNm, url, subIndex, paramObj) {
	try {
		var data = paramObj ? paramObj : {};
		var tabId;
		if (gcm.LAYOUT_TYPE == "TAC") {
			tabId = $p.top().tac_layout.getSelectedTabID();
		} else if (gcm.LAYOUT_TYPE == "WDC") {
			tabId = $p.top().wdc_layout.getSelectedWindowId();
		}
		// 레거시가 아닌 탭만 유효성 관련 체크리스트를 가져와서 메시징 처리한다.
		gcm.win.getMenuObj(tabId, function(activeTab) {

			if (!gcm.util.isEmpty(activeTab[gcm.MENU_INFO.NEW_PATH])
				&& "Y" != activeTab[gcm.MENU_INFO.BETA_YN]
				&& gcm.valid.isModified(gcm.win._getLayoutWin(tabId).scwin.checkList)) {
				var title = "";

				if (gcm.LAYOUT_TYPE == "TAC") {
					title = $p.top().tac_layout.getLabelText($p.top().tac_layout.getTabIndex(tabId));
				} else if (gcm.LAYOUT_TYPE == "WDC") {
					title = $p.top().wdc_layout.getWindowLabel(tabId, "window");
				}
				var msg = gcm.lang.getMsg("message.xom.wq.026"/*{0} 화면에 저장하지 않은 변경사항이 있습니다. 계속하시겠습니까?*/, title);
				gcm.pop.confirm(scopeScwin, msg, function(ret) {
					if (ret) {
						// 시점 문제로 인하여 0.1초 지연
//						setTimeout(function() {
							_movePage();
//						}, 100);
					}
				});
			} else {
				// 시점 문제로 인하여 0.1초 지연
//				setTimeout(function() {
					_movePage();
//				}, 100);
			}
		});		
		
	} catch (e) {
		console.error("[gcm.win.movePage] Exception :: " + e);
	}
	
	function _hideProcessMsgAndMove(mdiWindow, url, data, isWfForm = false) {
		// wfForm이 있을 경우 mdiWindow는 window 객체로 받음 frame으로 받을경우 wframe 정보를 가져오려면 복잡해서 걍 window로 냅둠
		// 따라서 wfForm이 있는 경우를 예외처리 해야해서 아래와 같이 받은 파라미터를 재정의 함
		var wfForm = isWfForm ? mdiWindow.wfForm : {};
		mdiWindow = isWfForm ? mdiWindow.$p.getFrame() : mdiWindow;
		
		var msgQ = [...(mdiWindow._processMsgQueue)];
		var moveTarget = isWfForm ? wfForm : mdiWindow;
		if (isWfForm) msgQ = [...msgQ, ...(wfForm._processMsgQueue)];
		
		if (msgQ.length > 0) {
			var msg = msgQ[0];
			var sbmObj = com.getComponent(msg.id); 	
			var interceptFn = sbmObj.successCallback;
		
			if (com.isEmpty(sbmObj.endTime)) {
				// 기존 프레임에서 현재 실행 하고 있는 서브미션이 있을 경우 프로세스 메시지가 사라지지 않는 경우가 발생
				// 따라서 서브미션 successCallback을 가로채 기존의 콜백을 수행 후 로딩창을 지워주고 url로 이동
				sbmObj.successCallback = function(resData) {
					interceptFn(resData);
					
					// 윈도우내 wframe과 wfForm의 프로세스 컴포넌트 메시지를 둘 다 지워줘야함
					mdiWindow.hideProcessMessage();
					if (isWfForm) wfForm.hideProcessMessage();
					
					moveTarget.setSrc(
						url, { "dataObject" : {
							"type" : "json",
							"name" : "param",
							"data" : data
						}}
					);
				};
				
				return;
			} else {
				// 윈도우내 wframe과 wfForm의 프로세스 컴포넌트 메시지를 둘 다 지워줘야함
				mdiWindow.hideProcessMessage();
				if (isWfForm) wfForm.hideProcessMessage();
			}
		}
		
		// 메시지 창이 띄워져있지 않을때는 바로 이동
		moveTarget.setSrc(
			url, { "dataObject" : {
				"type" : "json",
				"name" : "param",
				"data" : data
			}}
		);
		
		return true;
	}
	
	function _movePage() {
		data.openerTabId = tabId;
		var menuObj = {};
		if (menuId) {
			menuObj = gcm.win.getMenuObj(menuId);
			if (gcm.util.isEmpty(menuObj)) {
				gcm.pop.error(scopeScwin, "message.xom.wq.019"/*메뉴 정보가 없습니다.*/);
				return;
			}
		} else {
			if (url.indexOf("/") !== 0) {
				url = "/" + url;
			}
			url = gcm.CONTEXT_ROOT + url;
			menuObj[gcm.MENU_INFO.MENU_ID] = menuId + "_" + subIndex;
			menuObj[gcm.MENU_INFO.MENU_NM] = pageNm;
			menuObj[gcm.MENU_INFO.SRC_PATH] = url;
		}
		// 예외 처리 #1: 목적 페이지가 결재문서(A001)라면 
		// 예외 처리 #2: 활성화된 윈도우 내부에 wfForm 가지고 있다면 해당 영역에 랜더링한다.
		var mdiWindow = $p.top().wdc_layout.getWindow($p.top().wdc_layout.getSelectedWindowId());
		if ('A001' == menuObj.serviceID && 'undefined' === typeof mdiWindow.location && mdiWindow.wfForm) {
			_hideProcessMsgAndMove(mdiWindow, gcm.win.getMenuObj('A001').serviceNewUrl, data, true);
			return true;
		}
		// 예외처리: 레거시 MDI 제거 및 신규MDI 오픈
		var isOpenLegacy = false;
		gcm.win.getMenuObj(tabId, function(legacyMenu) {
			if (("Y" == legacyMenu[gcm.MENU_INFO.BETA_YN] || !legacyMenu[gcm.MENU_INFO.NEW_PATH]) && 'A001' == menuId) {
				isOpenLegacy = true;
				gcm.win.openMenu(menuObj, data);
				$p.top().wdc_layout.closeWindow(legacyMenu[gcm.MENU_INFO.SERVICE_ID]);
			}
		});
		if (isOpenLegacy) {
			return;
		}
		
		data.menuObj = menuObj;
		var mdiframe;
		if (gcm.LAYOUT_TYPE == "TAC") {
			mdiframe = $p.top().tac_layout.getFrame($p.top().tac_layout.getSelectedTabID());
		} else if (gcm.LAYOUT_TYPE == "WDC") {
			// MDI 치환 분기
			if ('A001' ==  menuId) {
				// 목적 MDI 가 스냅샷 일때
				var index = $p.top().wdc_layout.windows.findIndex(function( win) {
				    return 'A001' == win.windowId;
				});
			} else if (('A001' <  menuId && 'A011' > menuId) || (menuId == "B504")) {
				// 목적 MDI 가 문서함 일때
				var index = $p.top().wdc_layout.windows.findIndex(function( win) {
				    return win.windowId.startsWith('A0') && 'A001' < menuId;
				});
				
				// 스냅샷 상신 이벤트에 의한 호출인 경우
				if (data && data.where == 'snapshot') {
					$p.top().wdc_layout.closeWindow(tabId);
				}
			}
			// 
			
			if (-1 < index) {
				$p.top().wdc_layout.setFocus(index);
				tabId = $p.top().wdc_layout.getSelectedWindowId();
			}

			// 기본적으로 활성화된 탭을 전환의 대성으로 설정
			mdiframe = $p.top().wdc_layout.getFrame($p.top().wdc_layout.getSelectedWindowId());
		}
		
		// 동적으로 타이틀을 변경한다. 2022-09-14, By James
		var moveUrl = menuObj[gcm.MENU_INFO.NEW_PATH] || menuObj[gcm.MENU_INFO.SRC_PATH];
		$p.top().wdc_layout.setWindowLabel(tabId, "all", menuObj[gcm.MENU_INFO.MENU_NM]);
		_hideProcessMsgAndMove(mdiframe, moveUrl, data);
	};
};

/**
 * 최상위 page를 index화면으로 이동
 *
 * @memberof gcm.win
 */
gcm.win.goHome = function(queryStr) {
	try {
		// onbeforeunload 이벤트 제거 (브라우저 alert 안함)
		gcm.win.removeEventOnBeforeUnload();
		queryStr = queryStr || "";
		if (gcm.CONTEXT_ROOT == "") {
			top.window.location.href = "/" + queryStr;
		} else {
			top.window.location.href = gcm.CONTEXT_ROOT + "/" + queryStr;
		}
	} catch (e) {
		console.error("[gcm.win.goHome] Exception :: " + e);
	}
};

/**
 * 사용자의 권한에 따른 화면 컴포넌트 제어를 한다.
 *
 * @memberof gcm.win
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 */
gcm.win._setProgramAuthority = function(scopeScwin) {
	try {
		var menuObj = gcm.win.getScopeMenuObj(scopeScwin);
		if (menuObj && menuObj[gcm.MENU_INFO.AUTH]) {
			if (menuObj[gcm.MENU_INFO.AUTH].substr(0,1) == "0") { // 조회 권한 (관리자)
				scopeScwin.$w.$("." + gcm.MENU_INFO.AUTH_RA).wq("hide");
			}
			if (menuObj[gcm.MENU_INFO.AUTH].substr(1,1) == "0") { // 조회 권한 (담당자)
				scopeScwin.$w.$("." + gcm.MENU_INFO.AUTH_RM).wq("hide");
			}
			if (menuObj[gcm.MENU_INFO.AUTH].substr(2,1) == "0") { // 조회 권한 (사용자)
				scopeScwin.$w.$("." + gcm.MENU_INFO.AUTH_RU).wq("hide");
			}
			if (menuObj[gcm.MENU_INFO.AUTH].substr(3,1) == "0") { // 조회 권한 (S담당자)
				scopeScwin.$w.$("." + gcm.MENU_INFO.AUTH_RS).wq("hide");
			}
			if (menuObj[gcm.MENU_INFO.AUTH].substr(4,1) == "0") { // 등록 권한
				scopeScwin.$w.$("." + gcm.MENU_INFO.AUTH_C).wq("hide");
			}
			if (menuObj[gcm.MENU_INFO.AUTH].substr(5,1) == "0") { // 수정 권한
				scopeScwin.$w.$("." + gcm.MENU_INFO.AUTH_U).wq("hide");
			}
			if (menuObj[gcm.MENU_INFO.AUTH].substr(6,1) == "0") { // 삭제 권한
				scopeScwin.$w.$("." + gcm.MENU_INFO.AUTH_D).wq("hide");
			}
			if (menuObj[gcm.MENU_INFO.AUTH].substr(7,1) == "0") { // 엑셀 권한
				scopeScwin.$w.$("." + gcm.MENU_INFO.AUTH_E).wq("hide");
			}
			if (menuObj[gcm.MENU_INFO.AUTH].substr(8,1) == "0") { // 출력 권한
				scopeScwin.$w.$("." + gcm.MENU_INFO.AUTH_P).wq("hide");
			}
		}
	} catch (e) {
		console.error("[gcm.win._setProgramAuthority] Exception :: " + e);
	}
}

/**
 * 공통 코드, 권한, 개인화 처리를 위한 Workflow를 실행한다.
 *
 * @memberof gcm.win
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 */
gcm.win._processCommonData = function(scopeScwin) {
	try {
		var commonDataWorkflow = {
				"id" : "wkf_commonDataWorkflow",
				"processMsg" : "처리중",
				"step" : [],
				"resolveCallback" : "",
				"rejectCallback" : ""
		};

		var sbmSearchCode = gcm.util.getComponent(scopeScwin, "_sbm_searchCode");

		if (gcm.util.isEmpty(sbmSearchCode) === false) {
			commonDataWorkflow.step = [
				{ "type" : "submit", "action" : "_sbm_searchCode" },
				{ "type" : "submitDone", "action" : "_sbm_searchCode" }
				];
		}

		var sbmSelectShortcutList = gcm.util.getComponent(scopeScwin, "_sbm_selectShortcutList");

		if (gcm.util.isEmpty(sbmSelectShortcutList) === false) {
			commonDataWorkflow.step.push({ "type" : "submit", "action" : "_sbm_selectShortcutList" });
			commonDataWorkflow.step.push({ "type" : "submitDone", "action" : "_sbm_selectShortcutList" });
		}

		if (commonDataWorkflow.step.length > 0) {
			gcm.sbm.executeWorkflow(commonDataWorkflow);
		}
	} catch (e) {
		console.error("[gcm.win._processCommonData] Exception :: " + e);
	}
};

/**
 * contextRoot가 포함된 path를 반환한다.
 *
 * @memberof gcm.win
 * @param {String} path 파일경로(Context가 포함되지 않은)
 * @return {String} Context가 포함된 파일경로
 */
gcm.win.getFullPath = function(path) {
	try {
		var rtn_path = "";
		if (gcm.CONTEXT_ROOT == "") {
			rtn_path = path;
		} else {
			rtn_path = gcm.CONTEXT_ROOT + path;
		}
		return rtn_path;
	} catch (e) {
		console.error("[gcm.win.getFullPath] Exception :: " + e);
		return path;
	}
};

/**
 * 해당 그룹 안의 컴포넌트에서 엔터키가 발생하면 해당 컴포넌트의 값을 DataColletion에 저장하고 objFunc 함수를 실행한다.
 *
 * @memberof gcm.win
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} groupObj 그룹 객체
 * @param {Object} objFunc 함수 객체
 */
gcm.win.setEnterKeyEvent = function(scopeScwin, groupObj, objFunc, excludeComponents) {
	excludeComponents = excludeComponents || []; // 예외 처리할 컴포넌트가 없을 경우 빈 배열로 초기화
	try {
		var objArr = gcm.util.getChildren(groupObj, {
			includePlugin: "checkbox checkcombobox editor input inputCalendar multiselect radio selectbox searchbox secret textarea",
			recursive: true
		});
		for (var i = 0; i < objArr.length; i++) {
			// 제외 컴포넌트 체크
            if (excludeComponents.includes(objArr[i])) {
                continue;
            }
			if (typeof objFunc === "function") {
				if (objArr[i].getPluginName() == "searchbox" && objArr[i].id.endsWith("___input") === true) {
					continue;
				}
				objArr[i].bind("onkeyup", function (e) {
					if (e.keyCode === 13) {
						if (typeof this.getRef === "function") {
							var ref = this.getRef();
							var refArray = ref.substring(5).split(".");
							if ((typeof refArray !== "undefined") && (refArray.length === 2)) {
								var dataCollectionName = refArray[0];
								var columnId = refArray[1];
								var dataCollection = this.getScopeWindow().$p.getComponentById(dataCollectionName);
								var dataType = dataCollection.getObjectType().toLowerCase();
								if (dataType === "datamap") {
									dataCollection.set(columnId, this.getValue());
								} else if ((dataType === 'datalist') && (typeof rowIndex !== "undefined")) {
									dataCollection.setCellData(dataCollection.getRowPosition(), columnId, this.getValue());
								}
							}
							objFunc();
							e.stopPropagation();
						}
					}
				});
			}
		}
	} catch (e) {
		console.error("[gcm.win.setEnterKeyEvent] Exception :: " + e);
	} finally {
		dataCollection = null;
		objArr = null;
	}
};

/**
 * wframe안의 스크립트 영역에서 이 함수를 호출할 경우 자신을 감싼 wframe object를 반환한다. 전역스크립트에서 호출 시에는 null을 반환한다.
 *
 * @memberof gcm.win
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @return {Object} 자신을 감싼 wframe object
 */
gcm.win.getFrame = function(scopeScwin) {
	try {
		return scopeScwin.$w.getFrame();
	} catch (e) {
		console.error("[gcm.win.getFrame] Exception :: " + e);
		return null;
	}
};

/**
 * 자신의 부모 WFrame 객체를 찾아 반환한다.
 *
 * @memberof gcm.win
 * @return {Object} 자신을 감싼 wframe object의 부모 wfrmae 객체
 * @example
	var parentFrame = gcm.win.getParentFrame();
	var dltObj = parentFrame.getObj("dlt_dataList1"); // 자기 부모 프레임 내에 있는 dlt_dataList1에 접근
	var pScwinObj = parentFrame.getObj("scwin"); // 자기 부모 프레임에 있는 scwin 객체에 접근
	if (!gcm.util.isEmpty(pScwinObj){
		pScwinObj.search(); // 부모화면에 있는 scwin.search 함수를 호출
	}
 */
gcm.win.getParentFrame = function() {
	try {
		var frameObj = gcm.win.getFrame();
		if (!gcm.util.isEmpty(frameObj) && typeof frameObj.getParentFrame == "function") {
			return frameObj.getParentFrame();
		} else {
			return null;
		}
	} catch (e) {
		console.error("[gcm.win.getParentFrame] Exception :: " + e);
		return null;
	}
};

/**
 * 그리드 소팅시 헤더에 클래스 적용 
 *
 * @memberof gcm.win
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
*/
gcm.win._setGridSortClass = function(scopeScwin) {
	try {
		scopeScwin.$w.$('.w2grid_head_sort_asc').prev().addClass('asc');
		scopeScwin.$w.$('.w2grid_head_sort_desc').prev().addClass('desc');
	} catch (e) {
		console.error("[gcm.win._setGridSortClass] Exception :: " + e);
	}
};

/**
 * Calendar 오늘 날짜에 클래스 적용
 *
 * @memberof gcm.win
 */
gcm.win._setCalTodayClass = function(icaObj) {
	try {
		var today = gcm.date.getServerDateTime();
		if (icaObj.options.calendarValueType.indexOf("yearMonthDate") != -1 ) {
			setTimeout(function() {
				icaObj.calendar.setCellClass(today, "today");
			}, 10);
		}
	} catch (e) {
		console.error("[gcm.win._setCalTodayClass] Exception :: " + e);
	}
};

/**
 * inputBox 값 변경시 bold 처리
 *
 * @memberof gcm.win
 */
gcm.win._setInputBold = function(ibxObj) {
	try {
		var ref = ibxObj.getRef();
		if (!gcm.util.isEmpty(ref) && ref.indexOf("data:") === 0) {
			// dataCollection 바인딩된 경우 original 값과 다르면 bold
			var refDcId = ref.substr(5, ref.indexOf(".")-5);
			var refKeyId = ref.substr(ref.indexOf(".")+1);
			var refDcObj = ibxObj.getScopeWindow().$p.getComponentById(refDcId);
			var orgValue = refDcObj.getObjectType() == "dataMap" ? refDcObj.getOriginal(refKeyId) : refDcObj.getOriginalCellData(refDcObj.getRowPosition(), refKeyId);
			var currValue = ibxObj.getValue();
			if (orgValue === currValue) {
				ibxObj.setStyle("font-weight", "normal");
			} else {
				ibxObj.setStyle("font-weight", "bold");
			}
		} else {
			// dataCollection 바인딩되어 있지 않으면 value값이 있으면 bold
			if (gcm.util.isEmpty(ibxObj.getValue())) {
				ibxObj.setStyle("font-weight", "normal");
			} else {
				ibxObj.setStyle("font-weight", "bold");
			}
		}
	} catch (e) {
		console.error("[gcm.win._setInputBold] Exception :: " + e);
	}
};

/**
 * tbbox 내의 inputBox의 bold 해제
 *
 * @memberof gcm.win
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} grpId Group ID
 */
gcm.win.initBold = function(scopeScwin, grpId) {
	try {
		// tbbox 내의 inputBox의 bold 해제
		scopeScwin.$w.$(".tbbox #" + grpId + " .w2input:wq").wq("setStyle", "font-weight", "normal");
	} catch (e) {
		console.error("[gcm.win.initBold] Exception :: " + e);
	}
};

/**
 * 업무 영역 높이가 남을 경우 fullH class를 지정한 영역의 높이를 남는 만큼 늘린다.
 * tabControl 레이아웃인 경우만 사용하고 아래 두 군데에서 수행
 * 1) index.xml의 scwin.tac_layout_onchange
 * 2) index.xml의 window.resize
 *
 * @memberof gcm.win
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 */
gcm.win.setFullHeight = function(scopeScwin) {
	try {
		if (scopeScwin.$w.isWFramePopup()) {
			setTimeout(function() {
				_setFullHeight(scopeScwin);
			}, 10);
		} else {
			_setFullHeight(scopeScwin);
		}
	} catch (e) {
		console.error("[gcm.win.setFullHeight] Exception :: " + e);
	}
	
	function _setFullHeight(scopeScwin) {
//		console.log("["+ scopeScwin.$w.id +"]");
		if (scopeScwin.$w.$(".fullH").length > 0) {
			var containerH = scopeScwin.$w.$(".fullH").closest("."+ gcm.CONTENT_WRAP).parent().outerHeight(); // layout 컨테이너 높이
			var contentH = scopeScwin.$w.$(".fullH").closest("."+ gcm.CONTENT_WRAP).outerHeight() + 51; // 현재 업무화면 sub_contents 높이
			if (scopeScwin.$w.isWFramePopup()) {
				var popupH = scopeScwin.$w.$(".fullH").closest(".w2popup_window").outerHeight();
				var popupHeaderH = scopeScwin.$w.$(".fullH").closest(".w2popup_window .w2window_body").prev().outerHeight();
				containerH = popupH - popupHeaderH - 20;
			}
//			console.log("["+ scopeScwin.$w.$(".fullH").closest("."+ gcm.CONTENT_WRAP).parent()[0].id +"] containerH : " + containerH);
//			console.log("["+ scopeScwin.$w.$(".fullH").closest("."+ gcm.CONTENT_WRAP)[0].id +"] contentH : " + contentH);
			scopeScwin.$w.$(".fullH").each(function() {
				var targetH = $(this).outerHeight(); // 높이를 맞추려는 가변 영역의 현재 높이
				if (contentH - targetH < containerH) {
					// 가변 영역의 높이를 여백만큼 증가
					var fullH = targetH + containerH - contentH - 1;
					if ($(this).hasClass("gvwbox")) {
						// 가변 영역이 그리드 영역이면 그리드 스크롤시 행이 비어보이는 현상 회피를 위해 timeout 처리
						var fullHSeletor = $(this);
						setTimeout(function() {
							fullHSeletor.css("height", fullH );
						}, 100);
					} else {
						$(this).css("height", fullH );
					}
//					console.log("["+ $(this)[0].id +"] targetH : " + targetH);
//					console.log("["+ $(this)[0].id +"] fullH : " + fullH);
				}
			});
		}
	} 
};

/**
 * wframe postScript에서 공통으로 적용할 UI 관련 스크립트 
 *
 * @memberof gcm.win
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 */
gcm.win._initUI = function(scopeScwin) {
	try {
/*
		// 그리드 소팅시 헤더에 클래스 적용
		scopeScwin.$w.$(".w2grid:wq").wq("bind", "onsort", function() {	
			gcm.win._setGridSortClass(scopeScwin);
		});
		// Calendar 오늘 날짜에 클래스 적용
		scopeScwin.$w.$(".w2inputCalendar_div:wq").wq("bind", "oniconclick", function() {
			gcm.win._setCalTodayClass(this);
		});
		// tbbox 내의 inputBox를 입력해서 변경한 경우 bold 처리
		scopeScwin.$w.$(".tbbox .w2input:wq").wq("bind", "onblur", function(info) {
			gcm.win._setInputBold(this);
		});
		// inputBox에 displayFormat 적용된 경우 포커싱될 때 select 되지 않는 현상 개선
		scopeScwin.$w.$(".w2input:wq").wq("bind", "onfocus", function(info) {
			this.select();
		});
		// 기간선택 udc 달력 바깥영역 클릭시 닫기
		if (scopeScwin.$w.isPopup() && window.opener != null) { // 브라우저 팝업시 $p가 잘 안먹음
			if ($(".grp_calArea").length > 0) {
				$("#" + WebSquare.util.getChildren()[0].id).click(function(e) {
					if ($(e.target).parents(".grp_calArea").length == 0) {
						$(".fromToCalShowCss").hide();
						$(".fromToCalShowCss").removeClass("fromToCalShowCss");
					}
				});
			}
		} else {
			if (scopeScwin.$w.$(".grp_calArea").length > 0) {
				scopeScwin.$w.$('.sub_contents').click(function(e) {
					if ($(e.target).parents(".grp_calArea").length == 0) {
						scopeScwin.$w.$(".fromToCalShowCss").hide();
						scopeScwin.$w.$(".fromToCalShowCss").removeClass("fromToCalShowCss");
					}
				});
			}
		}
*/
	} catch (e) {
		console.error("[gcm.win.initUI] Exception :: " + e);
	}
};

/**
 * history.pushState API를 호출해서 브라우저에서 History 상태를 기록한다.
 *
 * @memberOf gcm.win
 * @date 2022.07.15
 * @author Inswave Systems
 * @example
gcm.win.pushState(data);
 */
gcm.win.pushState = function(data) {
	if($.isEmptyObject(data) || com.isEmpty(data[gcm.MENU_INFO.SERVICE_ID])) {
		// serviceId가 없으면 아무것도 안함
	} else {
		history.pushState({ "data" : data }, data[gcm.MENU_INFO.MENU_NM], "?serviceId=" + data[gcm.MENU_INFO.SERVICE_ID]);	
	}
};

/**
 * 서비스ID 에 해당하는 메뉴를 갱신한다.
 *
 * @memberOf gcm.win
 * @date 2023.05.15
 * @author Hong Seongmin
 * @example
gcm.win.refreshMenuObj("F220");
 */
gcm.win.refreshMenuObj = function(serviceID) {
	
	return new Promise((resolve, reject) => {
		let menuList = $p.top().wfm_side.scope.dlt_menu;
		let errMsg = "";
		
		if (menuList.getTotalRow() <= 0) 
			errMsg = "전체 메뉴 조회 전 갱신 불가!";
		
		if (null == serviceID || '' == serviceID || 4 != serviceID.length)
			errMsg = "서비스ID 파라미터가 없습니다.";
		
		if (gcm.util.isNotEmpty(errMsg)) {
			alert("[gcm.win.refreshMenuObj] 오류:", errMsg);
			return false;
		}
		
		// 서비스 메뉴를 서버에서 조회해 전체메뉴에서 갱신한다.
		com.executeDynamic({id : "sbm_getMenuForRefresh", action : "SvcGetMenu.pwkjson"}, {
			  requestData: { serviceID : serviceID }
			, processMsg : ""	// silence
			, successCallback: function (ret) {
				let menuObj = ret.responseJSON.elData;
				
				if (menuObj) {
					let savedIndex = menuList.getMatchedIndex('serviceID', serviceID)[0];
					menuList.setRowJSON(savedIndex, menuObj, true);
				}
				
				resolve(true);
			}
		});
	});
};

gcm.win.refreshFrame = function(scopeWindow) {
	let refresh = function() {
		gcm.win.isRefreshing = true;
		scopeWindow.$w.reinitialize();
	}
	
	if (com.isModified(scopeWindow.checkList)) {
		gcm.pop.confirm("message.xom.wq.018"/*저장하지 않은 변경사항이 있습니다. 계속하시겠습니까?*/, function(ret) {
			if (ret) {
				refresh();
			}
		});
	} else {
		refresh();
	}
}

/**
 * 웹스퀘어 컴포넌트 제어, 엑셀 파일 업로드/다운로드, 파일 업로드/다운로드, 기타 함수를 작성한다.
 *
 * @class util
 * @namespace gcm.util
 */
gcm.util = {};

/**
 * 레거시 메뉴 여부를 판별한다.
 *	- 테스터 아이디가 아닌경우 레거시 serviceNewUrl 이 존재하더라도 레거시 메뉴 True 이다.
 * @memberof gcm.util
 * @param {Object} menuObj 메뉴객체
 * @return {Boolean} 레거시메뉴여부
 */
gcm.util.isLegacyMenu = function(menuObj) {

	if ('Y' == menuObj[gcm.MENU_INFO.BETA_YN]) {
		// 베터 테스터 중인 메뉴일 때 테스터가 아닐때만 레거시로
		var testServices = gcm.data.getLoginInfo('betaService');
		
		if (this.isEmpty(testServices)) return true;

		return !(testServices === "all" || testServices.includes(menuObj[gcm.MENU_INFO.SERVICE_ID]));
	} else {
		// 그 외 일반 메뉴일 때 serviceNewUrl 이 존재하지 않을 때 레거시로
		return this.isEmpty(menuObj[gcm.MENU_INFO.NEW_PATH]);
	}
	// 아래와 같이 처리하면 동일하지만 가독성이 떨어지므로
	// return this.isEmpty(menuObj[gcm.MENU_INFO.NEW_PATH]) || (!gcm.data.getLoginInfo('tester') && 'Y' == menuObj[gcm.MENU_INFO.BETA_YN])
};

gcm.util.isAprListMenu = function(serviceid) {
	return serviceid && serviceid.startsWith('A0') && "A001" < serviceid;
};

gcm.util.isAprMenu = function(serviceid) {
	return serviceid && serviceid.startsWith('A0');
};

/**
 * MDI 탭 색상 변경
 */
gcm.util.changeTabColor = function() {
	// 결재 탭 색상 변경
	for (var i = mf_wdc_layout.windows.length - 1; i >= 0; i--) {
		if (mf_wdc_layout.windows[i].windowId == 'A001'){
			var id = document.querySelector('#mf_wdc_layout_nameLayer_' + mf_wdc_layout.windows[i].id);
			id.style = gcm.SNAPTAB_STYLE;
		} else if (gcm.util.isAprListMenu(mf_wdc_layout.windows[i].windowId)) {
			var id = document.querySelector('#mf_wdc_layout_nameLayer_' + mf_wdc_layout.windows[i].id);
			id.style = gcm.APRTAB_STYLE;
		}
	}
}


/**
 * 접속한 사용자의 웹 브라우저 종류를 반환한다.
 *
 * @memberof gcm.util
 * @return {String} 웹 브라우저 종류
 */
gcm.util._getUserAgent = function() {
	try {
		var agt = navigator.userAgent.toLowerCase();
		if (agt.indexOf("chrome") != -1) {
			return 'Chrome';
		} else if (agt.indexOf("opera") != -1) {
			return 'Opera';
		} else if (agt.indexOf("staroffice") != -1) {
			return 'Star Office';
		} else if (agt.indexOf("webtv") != -1) {
			return 'WebTV';
		} else if (agt.indexOf("beonex") != -1) {
			return 'Beonex';
		} else if (agt.indexOf("chimera") != -1) {
			return 'Chimera';
		} else if (agt.indexOf("netpositive") != -1) {
			return 'NetPositive';
		} else if (agt.indexOf("phoenix") != -1) {
			return 'Phoenix';
		} else if (agt.indexOf("firefox") != -1) {
			return 'Firefox';
		} else if (agt.indexOf("safari") != -1) {
			return 'Safari';
		} else if (agt.indexOf("skipstone") != -1) {
			return 'SkipStone';
		} else if (agt.indexOf("msie") != -1 || agt.indexOf("trident") != -1) {
			return 'msie';
		} else if (agt.indexOf("netscape") != -1) {
			return 'Netscape';
		} else if (agt.indexOf("mozilla/5.0") != -1) {
			return 'Mozilla';
		} else {
			return '';
		}
	} catch (e) {
		console.error("[gcm.util._getUserAgent] Exception :: " + e);
		return '';
	}
};

/**
 * GET 방식으로 전달한 파라미터를 읽어 온다.
 *
 * @memberof gcm.util
 * @param {String} param 파라미터 키
 * @param {String} url URL
 * @return {Object} 파라미터 값
 */
gcm.util._getParameter = function(param, url) {
	try {
		if (gcm.util.isEmpty(url)) {
			url = unescape(location.href);
		}
		var paramArr = (url.substring(url.indexOf("?")+1,url.length)).split("&");
		var value = "";

		for(var i = 0 ; i < paramArr.length ; i++) {
			var temp = paramArr[i].split("=");

			if(temp[0].toUpperCase() == param.toUpperCase()) {
				value = paramArr[i].split("=")[1];
				break;
			}
		}

		return value;
	} catch (e) {
		console.error("[gcm.util._getParameter] Exception :: " + e);
		return null;
	}
};

/**
 * JSON Object로 변환해서 반환한다.
 *
 * @memberof gcm.util
 * @param {String|XML} value JSON 문자열 또는 XML Document
 * @return {Object} JSON 객체 or null
 * @example
// 유효하지 않은 JSON 문자열 일 경우
gcm.util.getJSON("");
// return 예시)	null

// 유효한 JSON 문자열
var json = '{"tbx_sPrjNm":"1","tbx_sPrtLv":"2","tbx_sReqLv":"3"}';
gcm.util.getJSON(json);
// return 예시)	{tbx_sPrjNm: "1", tbx_sPrtLv: "2", tbx_sReqLv: "3"}
 */
gcm.util.getJSON = function (value) {
	try {
		if (gcm.util.isEmpty(value)) {
			return null;
		} else if (gcm.util.isXmlDoc(value) === true) {
			return JSON.parse(WebSquare.json.XML2JSONString(value));
		} else {
			try {
				return JSON.parse(value);
			} catch (e) {
				return value;
			}
		}
	} catch (e) {
		console.error("[gcm.util.getJSON] Exception :: " + e);
		return value;
	}
};

/**
 * JSON Object인지 여부를 검사한다.
 *
 * @memberof gcm.util
 * @param {Object} jsonObj JSON Object가 맞는지 검사할 JSON Object
 * @return {Boolean} true or false
 * @example
gcm.util.isJSON("");
// return 예시) false
gcm.util.isJSON( {"tbx_sPrjNm": "1", "tbx_sPrtLv": "2", "tbx_sReqLv": "3"} );
// return 예시) true
 */
gcm.util.isJSON = function(json) {
	try {
		if (jQuery.isPlainObject(json) === false && gcm.util.isArray(json) === false) {
			return false;
		}

		if (typeof json === "object") {
			try {
				JSON.stringify(json);
				return true;
			} catch (ex) {
				return false;
			}
		} else if (typeof json === "string") {
			try {
				JSON.parse(json);
				return true;
			} catch (ex) {
				return false;
			}
		}
		return false;
	} catch (e) {
		console.error("gcm.util.isJSON[] Exception :: " + e);
		return false;
	}
};

/**
 * 배열 객체인지 여부를 확인한다.
 *
 * @memberof gcm.util
 * @param {Object}  array :: I :: N :: :: Array Object or String
 * @return {Boolean} Array 배열 판단 여부(Array 객체인 경우 true, 아닌경우 false)
 * @example
gcm.util.isArray(arrObject); // return true
 */
gcm.util.isArray = function(array) {
	try {
		if ((typeof array !== "undefined") && (array !== null) && (typeof array == "object")) {
			if (array.constructor.name && array.constructor.name.toLowerCase() == "array")
				return true;
			if (array.constructor && array.constructor == Array)
				return true;
		}
		return false;
	} catch (e) {
		console.error("[gcm.util.isArray] Exception :: " + e);
		return false;
	}
};

/**
 * 값이 Empty 상태(undefined, null, "")인지 판별한다.
 * 
 * @memberof gcm.util
 * @param value Empty 여부를 판단할 값
 * @return Empty 여부 (true : Empty, false : Not Empty)
 * @example
		if (gcm.util.isEmpty(empCd) === false) {
			console.log("empCd : " + empCd);
		}
 */
gcm.util.isEmpty = function(value) {
	try {
		if ("undefined" === typeof value 
				|| null === value 
				|| ("string" === typeof value && "" == value.trim())) {
			return true;
		} else {
			return false;
		}
	} catch (e) {
		console.error("[gcm.util.isEmpty] Exception :: " + e);
	}
};

/**
 * 값이 Empty 상태(undefined, null, "")가 아닌지 판별한다.
 * 
 * @memberof gcm.util
 * @param value Empty 아닌지 여부를 판단할 값
 * @return Empty 아닌지 여부 (true : Not Empty, false : Empty)
 * @example
		if (gcm.util.isNotEmpty(empCd) === false) {
			console.log("empCd : " + empCd);
		}
 */
gcm.util.isNotEmpty = function(value) {
	return !gcm.util.isEmpty(value);
};

/**
 * 객체의 typeof 값을 반환하며 typeof의 값이 object인 경우 array, json, xml, null로 체크하여 반환한다.
 *
 * @memberof gcm.util
 * @param {Object} obj type을 반환 받을 객체(string,boolean,number,object 등)
 * @return {String} 객체의 타입으로 typeof가 object인 경우 array, json, xml, null로 세분화하여 반환한다. 그외 object타입이 아닌경우 원래의 type(string,boolean,number 등)을 반환한다.
 * @example
 gcm.util.getObjectType("WebSquare");
 // return 예시) "string"

 gcm.util.getObjectType({"name":"WebSquare"});
 // return 예시) "json"

 gcm.util.getObjectType(["1","2"]);
 // return 예시) "array"
*/
gcm.util.getObjectType = function (obj) {
	try {
		var objType = typeof obj;
		if (objType !== "object") {
			return objType;
		} else if (gcm.util.isArray(obj)) {
			return "array";
		} else if (gcm.util.isJSON(obj)) {
			return "json";
		} else if (obj === null) {
			return "null";
		} else {
			var tmpDoc = WebSquare.xml.parse("<data></data>");
			if (obj.constructor === tmpDoc.constructor || obj.constructor === tmpDoc.childNodes[0].constructor) {
				return "xml";
			} else {
				return objType;
			}
		}
	} catch (e) {
		console.error("[gcm.util.getObjectType] Exception :: " + e);
		return null;
	}
 };

/**
 * 현재 클라이언트 브라우저 환경의 모바일 여부를 반환한다.
 *
 * @memberof gcm.util
 */
gcm.util.isMobile = function () {
	try {
		return WebSquare.util.isMobile();
	} catch (e) {
		console.error("[gcm.util.isMobile] Exception :: " + e);
		return null;
	}
};

/**
 * XML Document 객체인지 여부를 검사한다.
 *
 * @memberof gcm.util
 * @param {Object} data XML Document 객체인지 여부를 검사한다.
 * @return {Boolean} true or false
 */
gcm.util.isXmlDoc = function(data) {
	try {
		if (typeof data != 'object')
			return false;
		if ((typeof data.documentElement != 'undefined' && data.nodeType == 9)
				|| (typeof data.documentElement == 'undefined' && data.nodeType == 1)) {
			return true;
		}
		return false;
	} catch (e) {
		console.error("[gcm.util.isXmlDoc] Exception :: " + e);
		return null;
	}
};

/**
 * GridView Row 삭제를 위한 CheckBox 동작을 세팅한다.
 * GridView에 삭제용 CheckBox가 있을 경우 onPageLoad 이벤트에서 gcm.util.setGridDelCheckBox 함수를 호출한다.
 * 이 함수가 정상 동작하려면 GridView의 Delete 처리용 CheckBox의 ColumnId와 Header Id를 "chk"로 설정해야 한다.
 *
 * @memberof gcm.util
 * @param {Array} gridObj GridView 객체 배열
 * @example
gcm.util.setGridDelCheckBox(grd_OrganizationBasic);
gcm.util.setGridDelCheckBox([grd_Menu, grd_MenuAccess]);
 */
gcm.util.setGridDelCheckBox = function (gridObjArr) {
	try {
		if (gcm.util.getObjectType(gridObjArr) === "array") {
			for (idx in gridObjArr) {
				setGridViewDelCheckBox(gridObjArr[idx]);
			}
		} else {
			setGridViewDelCheckBox(gridObjArr);
		}

		function setGridViewDelCheckBox(gridObj) {
			gridObj.bind("oncellclick",
					function (row, col) {
				var columnId = gridObj.getColumnID(col);
				if (columnId == "chk") {
					var dltObj = gcm.grid.getGridDataList(this);
					var realRowIndex = this.getRealRowIndex(row);

					if(dltObj.getFilterList().length >0){
						realRowIndex = dltObj.getFilteredRowIndex(realRowIndex);
					}
					var newValue = dltObj.getCellData(realRowIndex, columnId);
					gcm.util._setGridViewRowCheckBox(this, realRowIndex, newValue === "1" ? true : false);
				}
			}
			);
			gridObj.bind("onheaderclick",
					function (headerId) {
				if (headerId == "chk") {
					var newValue = this.getHeaderValue(headerId);
					var dltObj = gcm.grid.getGridDataList(this);
					var rowCount = dltObj.getRowCount();
					var removeIdx = [];
					var deleteIdx = [];
					var undoIdx =[];
					for (var i = 0; i <rowCount; i++) {
						var realRowIndex = dltObj.getRealRowIndex(i);

						if (dltObj.getFilterList().length > 0) {
							realRowIndex = dltObj.getFilteredRowIndex(realRowIndex);
						}

						if (dltObj.getRowStatus(realRowIndex) == "C") {
							removeIdx.push(realRowIndex);
							continue;
						}

						if (newValue) {
							deleteIdx.push(realRowIndex);
						} else {
							undoIdx.push(realRowIndex)
						}
					}

					if (newValue) {
						dltObj.deleteRows(deleteIdx);
						dltObj.removeRows(removeIdx);
					} else {
						dltObj.undeleteRows(undoIdx);
					}

				}
			}
			);
		}
	} catch (e) {
		console.error("[gcm.util.setGridDelCheckBox] Exception :: " + e);
	}
};

gcm.util._setGridViewRowCheckBox = function (gridObj, rowIndex, newValue) {
	try {
		var rowIndexArr = gridObj.getChildrenRowIndexArray(rowIndex);
		var dltObj = gcm.grid.getGridDataList(gridObj);

		for (var idx in rowIndexArr) {
			var childRowIndexArr = gridObj.getChildrenRowIndexArray(rowIndexArr[idx]);

			if (childRowIndexArr.length > 0) {
				gcm.util._setGridViewRowCheckBox( gridObj, rowIndexArr[idx], newValue);
			} else {
				gcm.util._deleteGridViewRow(gridObj, rowIndexArr[idx], newValue);
			}
		}

		gcm.util._deleteGridViewRow(gridObj, rowIndex, newValue);
	} catch (e) {
		console.error("[gcm.util._setGridViewRowCheckBox] Exception :: " + e);
	}
};

gcm.util._deleteGridViewRow = function (gridObj, rowIndex, newValue) {
	try {
		gridObj.setCellChecked(rowIndex, "chk", newValue);
		var dltObj = gcm.grid.getGridDataList(gridObj);

		if (newValue) {
			var rowStatus = dltObj.getRowStatus(rowIndex);
			if (rowStatus == "C") {
				dltObj.deleteRow(rowIndex);
				dltObj.removeRow(rowIndex);
			} else {
				dltObj.deleteRow(rowIndex);
			}
		} else {
			dltObj.undeleteRow(rowIndex);
		}
	} catch (e) {
		console.error("[gcm.util._deleteGridViewRow] Exception :: " + e);
	}
}

/**
 * 특정 컴포넌트의 자식 컴포넌트를 배열로 반환한다.
 *
 * @memberof gcm.util
 * @param {Object} comObj 컴포넌트 객체
 * @param {Object} options 하위 컴포넌트 검색 옵션 정보
 * @param {String} options.includeId 포함할 컴포넌트 id. 인자가 여러 개일 경우 공백을 구분자로 사용함.
 * @param {String} options.includePlugin 포함 컴포넌트 플러그인 이름. 인자가 여러 개일 경우 공백을 구분자로 사용함.
 * @example
gcm.util.getChildren(grp_content);
gcm.util.getChildren(grp_content, {excludePlugin : "trigger input", excludeId : "treeview1_tooltip windowContainer1_tooltip");
gcm.util.getChildren(grp_content, {includeId : "ibx_name sbx_payTy"});
gcm.util.getChildren(grp_content, {includePlugin : "selectbox"});
gcm.util.getChildren(grp_content, {includeId : "ibx_name sbx_payTy", includePlugin : "input selectbox"});
 */
gcm.util.getChildren = function(comObj, options) {
	try {
		return WebSquare.util.getChildren(comObj, options);
	} catch (e) {
		console.error("[gcm.util.getChildren] Exception :: " + e);
		return null;
	}
};

/**
 * 주어진 아이디에 해당하는 웹스퀘어 컴포넌트를 찾아 반환한다.
 *
 * @memberof gcm.util
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} compId 컴포넌트 아이디
 * @return {Object} 바인딩 된 DataList 객체 반환 (바인된 객체가 없을 경우 null 반환)
 */
gcm.util.getComponent = function(scopeScwin, compId) {
	try {
		if (typeof compId === "string") {
			var object = scopeScwin.$w.getComponentById(compId);
			if (typeof object === "undefined") {
				return null;
			} else {
				return object;
			}
		} else {
			return compId;
		}
	} catch (e) {
		console.error("[gcm.util.getComponent] Exception :: " + e);
		return null;
	}
};

/**
 * 주어진 인자를 통해 동적으로 Component를 생성합니다.
 *
 * @memberof gcm.util
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} strCompId 컴포넌트 ID
 * @param {String} strCompName 컴포넌트 태그명
 * @param {Object} option 컴포넌트 옵션
 * @param {String} parent 컴포넌트 생성 부모 노드 위치
 * @param {Object} itemSet 컴포넌트 setItemset 옵션
 * @return {Object} 생성된 컴포넌트 객체
 * @example
	gcm.util.createComponent("ibx_input1", "input" );
	gcm.util.createComponent("ibx_input2", "input", { style: "width:120px; height:40px; float:left; margin : 20px;" });
	gcm.util.createComponent("ibx_input2", "input", { style: "width:120px; height:40px; float:left; margin : 20px;" }, grp_content1);
 */
gcm.util.createComponent = function(scopeScwin, strCompId, strCompName, option, parent, itemSet) {
	try {
		if ((typeof strCompId !== "undefined") && (strCompId !== "") && (typeof strCompName !== "undefined") && (strCompName !== "")) {

			if (typeof option == "undefined") {
				option = {};
			}

			if (typeof parent == "undefined") {
				parent = "";
			}

			if (typeof itemSet == "undefined") {
				itemSet = "";
			}

			return scopeScwin.$w.dynamicCreate(strCompId, strCompName, option, parent, itemSet);
		}
	} catch (e) {
		console.error("[gcm.util.createComponent] Exception :: " + e);
		return null;
	}
};

/**
 * 사용자가 지정한 함수가 주기적으로 실행된다.
 * 실행할 함수를 함수를 setInterval로 등록하여 함수가 주기적으로 계속 실행되도록 한다.SPA모드에서 페이지 이동 시 이 함수로 등록한 타이머를 자동으로 제거한다.
 *
 * @memberof gcm.util
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Function} func	실행할 함수
 * @param {Object} options	options인자로는 아래와 같은 인자가 사용된다.
 * @param {String} options.key timer를 구별하기 위한 키값. 이 값이 지정되지 않은 경우 키값을 func.toString().slice(0,30)을 키값으로 사용한다.
 * @param {Number} options.delay setInterval의 2번째 인자값. func함수가 delay시간 이후에 실행되도록 한다.  기본값은 1이다.
 * @param {Object} options.caller func내에서 this값을 caller로 변경한다.
 * @param {Object} options.args func에 전달할 인자값. array형태로 인자를 전달한다.
 * @param {Function} options.before_call : func 함수가 실행되기 직전에 실행할 함수. func함수와 마찬가지로 data를 인자로 받는다.
 * @param {Function} options.callback : func함수가 실행된 후에 실행할 함수. func함수의 return값을 인자로 받는다
 * @example
	gcm.util.setInterval(
		function() {
			gcm.pop.alert("처리가 완료 되었습니다");
		},
		{ caller : grd_data1, delay : 2000, key : "interval1" }
	);
 */
gcm.util.setInterval = function(scopeScwin, func, options) {
	try {
		scopeScwin.$w.setInterval(func, options);
	} catch (e) {
		console.error("[gcm.util.setInterval] Exception :: " + e);
	}
};

/**
 * gcm.util.setInterval API를 이용하여 등록 한 함수를 직접 Clear시킨다.
 * 실행할 함수를 함수를 setInterval로 등록하여 함수가 주기적으로 계속 실행되도록 한다.SPA모드에서 페이지 이동 시 이 함수로 등록한 타이머를 자동으로 제거한다.
 *
 * @memberof gcm.util
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} keyName	key로 지정한 값. ( gcm.util.setInterval API 호출 시 options에 등록 한 key명)
 * @param {Boolean} force	keyName으로 지정 된 Interval 객체를 해제하기 전 해당 함수를 한 번 실행할지에 대한 여부. 기본값은 false.
 * @example
	gcm.util.clearInterval("timer1");
 */
gcm.util.clearInterval = function(scopeScwin, func, options) {
	try {
		scopeScwin.$w.clearInterval(func, options);
	} catch (e) {
		console.error("[gcm.util.clearInterval] Exception :: " + e);
	}
};

/**
 * 사용자가 지정한 함수가 일정 시간 후에 실행된다.
 * 실행할 함수를 함수를 setInterval로 등록하여 함수가 주기적으로 계속 실행되도록 한다.SPA모드에서 페이지 이동 시 이 함수로 등록한 타이머를 자동으로 제거한다.
 * 
 * @memberof gcm.util
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Function} func	실행할 함수
 * @param {Object} options	options인자로는 아래와 같은 인자가 사용된다.
 * @param {String} options.key timeout을 구별하기 위한 키값. 이 값이 지정되지 않은 경우 키값을 func.toString().slice(0,30)을 키값으로 사용한다.
 * @param {Number} options.delay func로 지정한 함수가 실행 될 간격으로 기본값은 1ms(millisecond / 1000분의 1초)이다. javascript setTimeout의 2번째 인자값.
 * @param {Object} options.caller func로 지정한 함수내에서 this값으로 지정 할 객체(웹스퀘어 컴포넌트 포함).
 * @param {Object} options.args func에 전달할 인자값. array형태로 인자를 전달한다.
 * @param {Function} options.before_call : func로 지정한 함수가 실행되기 직전에 실행 할 함수. func함수와 마찬가지로 data를 인자로 받는다.
 * @param {Function} options.callback : func로 지정한 함수가 실행된 후에 실행 할 함수. func로 지정한 함수의 return값을 인자로 받는다.
 * @example
	gcm.util.setTimeout(
		function() {
			gcm.pop.alert("5분이 지났습니다.");
		},
		{ delay : 300000, key : "loginTimeout" }
	);
 */
gcm.util.setTimeout = function(scopeScwin, func, options) {
	try {
		scopeScwin.$w.setTimeout(func, options);
	} catch (e) {
		console.error("[gcm.util.setTimeout] Exception :: " + e);
	}
};

/**
 * gcm.util.setTimer API를 이용하여 등록 한 함수를 직접 Clear시킨다.
 * 실행할 함수를 함수를 setInterval로 등록하여 함수가 주기적으로 계속 실행되도록 한다.SPA모드에서 페이지 이동 시 이 함수로 등록한 타이머를 자동으로 제거한다.
 * 
 * @memberof gcm.util
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {String} keyName	key로 지정한 값. ( gcm.util.setTimeout API 호출 시 options에 등록 한 key명)
 * @param {Boolean} force	keyName으로 지정 된 Interval 객체를 해제하기 전 해당 함수를 한 번 실행할지에 대한 여부. 기본값은 false.
 * @example
	gcm.util.clearTimeout("timer1");
 */
gcm.util.clearTimeout = function(scopeScwin, func, options) {
	try {
		scopeScwin.$w.clearTimeout(func, options);
	} catch (e) {
		console.error("[gcm.util.clearTimeout] Exception :: " + e);
	}
};

/**
 * 입력 가능한 컴포넌트(input, textarea 등) 객체의 내용을 클립보드에 저장한다.
 * ※ 주의사항
 * - IE 10+, Chrome 43+, Opera 29+, Firefox에서만 사용 가능함
 * - IE의 경우 클립복드 복사 허용을 묻는 확인 창이 뜸
 *
 * @memberof gcm.util
 * @param {Object} 컴포넌트 객체
 * @example
	// ibx_message InputBox내 Text가 Select 되면서 Clipboard에 복사된다.
	gcm.util.copyClipboard(ibx_message);
 */
gcm.util.copyClipboard = function(comObj) {
	try {
		if (typeof comObj !== "undefined") {
			comObj.select();
		}
		document.execCommand("Copy");
	} catch (e) {
		console.error("[gcm.util.copyClipboard] Exception :: " + e);
	}
};

/**
 * 문자열을 함수로 반환한다.
 *
 * @memberof gcm.util
 * @param {String} functionName 함수명
 * @example
	var func = gcm.util.getFunctionByName(options.func , window );
 */
gcm.util.getFunctionByName = function (functionName, context ) {
	try {
		var rtnFunc;
		var namespaces = functionName.split(".");
		var func = namespaces.pop();
		for(var i = 0; i < namespaces.length; i++) {
			context = context[namespaces[i]];
		}
		rtnFunc =  context[func];
		return rtnFunc;
	} catch (e) {
		console.error("[gcm.util.getFunctionByName] Exception :: " + e);
		return null;
	}
};

/**
 * group의 innerHTML에 HTML태그 문자열을 적용한다.
 *
 * @memberof gcm.util
 * @param {Object} groupObj Group 객체
 * @param {String} html html 태그 문자열
 * @example
	gcm.util.setHTML(grp_test, edt_test.getHTML());
 */
gcm.util.setHTML = function (groupObj, html) {
	try {
		groupObj.render.innerHTML = html;
	} catch (e) {
		console.error("[gcm.util.setHTML] Exception :: " + e);
	}
};


/**
 * group의 innerHTML에 HTML태그 문자열을 적용한다.
 * import된 html의 스크립트 동작을 위해 jquery .html() 사용
 * @memberof gcm.util
 * @param {Object} groupObj Group 객체
 * @param {String} html html 태그 문자열
 * @example
	gcm.util.importHTML(grp_test, edt_test.getHTML());
 */
gcm.util.importHTML = function (groupObj, html) {
	try {
		$(groupObj.render).html(html);
	} catch (e) {
		console.error("[gcm.util.importHTML] Exception :: " + e);
	}
};


/**
 * 숫자 관련 함수를 작성한다.
 *
 * @class num
 * @namespace gcm.num
 */
gcm.num = {};

/**
* 반올림 처리를 한다.
*
* @memberof gcm.num
* @param {String|Number} value 반올림 처리를 할 값
* @param {Number} point 반올림 처리를 할 소수점 자리 수 (Default : 0, 정수 값으로 반올림 처리)
* @return {Number} 반올림 처리를 한 숫자 값
* @example
	gcm.num.round(23.4567); // return 예시) 23
	gcm.num.round(23.5567); // return 예시) 24
	gcm.num.round(23.5567, 2); // return 예시) 23.56
	gcm.num.round(23.5564, 3); // return 예시) 23.556
*/
gcm.num.round = function(value, point) {
	try {
		var num = 1;
		if (typeof point !== "undefined") {
			num = Math.pow(10, point);
		}

		return Math.round(Number(value) * num) / num;
	} catch (e) {
		console.error("[gcm.num.round] Exception :: " + e);
		return null;
	}
};

/**
* 내림 처리를 한다.
*
* @memberof gcm.num
* @param {String|Number} value 내림 처리를 할 값
* @param {Number} point 내림 처리를 할 소수점 자리 수 (Default : 0, 정수 값으로 내림 처리)
* @return {Number} 내림 처리를 한 숫자 값
* @example
	gcm.num.floor(23.5567); // return 예시) 23
	gcm.num.floor(23.5567, 2); // return 예시) 23.55
*/
gcm.num.floor = function(value, point) {
	try {
		var num = 1;
		if (typeof point !== "undefined") {
			num = Math.pow(10, point);
		}

		return Math.floor(Number(value) * num) / num;
	} catch (e) {
		console.error("[gcm.num.floor] Exception :: " + e);
		return null;
	}
};

/**
* 올림 처리를 한다.
*
* @memberof gcm.num
* @param {String} value 올림 처리를 할 값 (String 또는 Number 타입 지원)
* @param {Integer} point 올림 처리를 할 소수점 자리 수 (Default : 0, 정수 값으로 올림 처리)
* @return {Number} 올림 처리를 한 숫자 값
* @example
	gcm.num.ceil(23.5567); // return 예시) 24
	gcm.num.ceil(23.5567, 2); // return 예시) 23.56
*/
gcm.num.ceil = function(value, point) {
	try {
		var num = 1;
		if (typeof point !== "undefined") {
			num = Math.pow(10, point);
		}

		return Math.ceil(Number(value) * num) / num;
	} catch (e) {
		console.error("[gcm.num.ceil] Exception :: " + e);
		return null;
	}
};

/**
 * 입력된 str에 포메터를 적용하여 반환한다.
 * ex)세번째자리마다 콤마 표시, 금액, setDisplayFormat("#,###&#46##0", "fn_userFormatter2")
 *
 * @memberof gcm.num
 * @param {String|Number} value 포멧터를 적용할 값
 * @param {String} type 적용할 포멧터 형식(Default:null,dollar,plusZero,won)
 * @return {String} 포멧터가 적용된 문자열
 * @example
	gcm.num.formatMoney("12345"); // 12,345
	gcm.num.formatMoney("12345", "dollar"); // $12,345
	gcm.num.formatMoney("12345", "plusZero"); // 123,450
	gcm.num.formatMoney("12345", "won"); // 12,345원
 */
gcm.num.formatMoney = function (value, type) {
	try {
		var amount;

		if (type == "plusZero") {
			amount = new String(value) + "0";
		} else {
			amount = new String(value);
		}

		amount = amount.split(".");

		var amount1 = amount[0].split("").reverse();
		var amount2 = amount[1];

		var output = "";
		for (var i = 0; i <= amount1.length - 1; i++) {
			output = amount1[i] + output;
			if ((i + 1) % 3 == 0 && (amount1.length - 1) !== i)
				output = ',' + output;
		}

		if (type == "dollar") {
			if (!amount2) {
				output = "$ " + output;
			} else {
				output = "$ " + output + "." + amount2;
			}
		} else if (type == "won") {
			if (!amount2) {
				output = output + "원";
			} else {
				output = output + "." + amount2 + "원";
			}
		} else {
			if (!amount2) {
				output = output;
			} else {
				output = output + "." + amount2;
			}
		}

		return output;
	} catch (e) {
		console.error("[gcm.num.formatMoney] Exception :: " + e);
		return null;
	}
};

/**
 * 세째자리마다 콤마를 추가해서 반환한다.
 *
 * @memberof gcm.num
 * @param {String|Number} value 포멧터를 적용할 값
 * @return {String} 포멧터가 적용된 문자열
 * @example
	gcm.num.formatNumber("12345677"); // "12,345,677"
	gcm.num.formatNumber(12345677); // "12,345,677"
	gcm.num.formatNumber(-12345677); // "-12,345,677"
 */
gcm.num.formatNumber = function (value) {
	try {
		return WebSquare.util.setNumber(value);
	} catch (e) {
		console.error("[gcm.num.formatNumber] Exception :: " + e);
		return null;
	}
};

/**
 * 숫자가 맞는지 여부를 검사한다.
 *
 * @memberof gcm.num
 * @param {String|Number} value 검사할 숫자 값
 * @return {Boolean} 숫자 여부 (숫자이면 true, 아니면 false 반환)
 * @example
	gcm.num.isNumber("123"); // true;
	gcm.num.isNumber(123); // true;
	gcm.num.isNumber("123.123"); // true;
	gcm.num.isNumber(123.123); // true;
	gcm.num.isNumber("-123.123"); // true;
	gcm.num.isNumber(-123.123); // true;
	gcm.num.isNumber("a123"); // false;
 */
gcm.num.isNumber = function (value) {
	try {
		return !isNaN(value);
	} catch (e) {
		console.error("[gcm.num.isNumber] Exception :: " + e);
		return null;
	}
};

/**
 * 홀수가 맞는지 여부를 검사한다.
 *
 * @memberof gcm.num
 * @param {String|Number} value 검사할 값
 * @return {Boolean} 홀수 여부 (홀수이면 true, 아니면 false 반환)
 * @example
	gcm.num.isOdd("123"); // true;
	gcm.num.isOdd(123); // true;
	gcm.num.isOdd("122"); // false;
	gcm.num.isOdd(122); // false;
 */
gcm.num.isOdd = function (value) {
	try {
		return WebSquare.util.isOdd(value);
	} catch (e) {
		console.error("[gcm.num.isOdd] Exception :: " + e);
		return null;
	}
};

/**
 * 문자열을 정수형으로 변환한다.
 *
 * @memberof gcm.num
 * @param {String} value 변환할 문자열
 * @return {Number} 변환된 정수형 값
 * @example
	gcm.num.parseInt("5231"); // 5231;
 */
gcm.num.parseInt = function (value) {
	try {
		return WebSquare.util.parseInt(value);
	} catch (e) {
		console.error("[gcm.num.parseInt] Exception :: " + e);
		return null;
	}
};

/**
 * 문자열을 실수형으로 변환한다.
 *
 * @memberof gcm.num
 * @param {String} value 변환할 문자열
 * @return {Number} 변환된 실수형 값
 * @example
	gcm.num.parseFloat("5231.22"); // 5231.22;
 */
gcm.num.parseFloat = function (value) {
	try {
		return WebSquare.util.parseFloat(value);
	} catch (e) {
		console.error("[gcm.num.parseFloat] Exception :: " + e);
		return null;
	}
};

/**
 * 바이트 값을 적절한 단위(KB, MB, GB)를 변환해서 반환한다.
 *
 * @memberof gcm.num
 * @param {String} value 변환할 값
 * @example
	gcm.num.formatByte(32132);
 */
gcm.num.formatByte = function(value) {
	try {
		var unitType = ['Bytes', 'KB', 'MB', 'GB', 'TB', 'PB'];
		if (value == 0 || value == "0" || isNaN(value)) {
			return 0 + " " + unitType[0];
		}
		var index = Math.floor(Math.log(value) / Math.log(1024));
		if (unitType[index] == "Bytes") {
			return (value / Math.pow(1024, index)) + " " + unitType[index];
		} else {
			return (value / Math.pow(1024, index)).toFixed(1) + " " + unitType[index];
		}
	} catch (e) {
		console.error("[gcm.num.formatByte] Exception :: " + e);
		return null;
	}
};

/**
 * 문자열 관련 함수를 작성한다.
 *
 * @class str
 * @namespace gcm.str
 */
gcm.str = {};

/** 
 * XML, JSON 객체를 String 타입으로 반환한다.
 *
 * @memberof gcm.str
 * @param {Object} object String으로 변환할 JSON 객체
 * @param {String} replacer 치환할 문자열
 * @param {Number} space 여백 수
 * @return {String} String으로 변환된 객체
 */
gcm.str.serialize = function (object, replacer, space) {
	try {
		if (typeof object === 'string') {
			return object;
		} else if (gcm.util.isJSON(object)) {
			return JSON.stringify(object, replacer, space);
		} else if (gcm.util.isXmlDoc(object)) {
			return WebSquare.xml.serialize(object);
		} else {
			return object;
		}
	} catch (e) {
		console.error("[gcm.str.serialize] Exception :: " + e);
		return null;
	}
};

/**
 * 좌측에 문자열 채우기
 *
 * @memberof gcm.str
 * @param {String} str 포멧터를 적용할 문자열
 * @param {Number} length 0 으로 채울 길이
 * @param {String} char : 채우고자하는 문자(char)
 * @return {String} 일정길이 만큼 char 으로 채워진 문자열
 * @example
	gcm.str.lpad("24", 4, "0"); // "0024"
	gcm.str.lpad("11321", 8, "A"); // "AAA11321"
 */
gcm.str.lpad = function(str, length, char) {
	try {
		if (typeof str === "number") {
			str = str.toString();
		}

		if (char.length > length) {
			console.log("오류 : 채우고자 하는 문자열이 요청 길이보다 큽니다");
			return str + "";
		}

		while (str.length < length) {
			str = char + str;
		}

		str = str.length >= length ? str.substring(0, length) : str;
		return str;
	} catch (e) {
		console.error("[gcm.str.lpad] Exception :: " + e);
		return str;
	}
};

/**
 * 우측에 문자열 채우기
 *
 * @memberof gcm.str
 * @param {String} str 포멧터를 적용할 문자열
 * @param {Number} length 0 으로 채울 길이
 * @param {String} char : 채우고자하는 문자(char)
 * @return {String} 일정길이 만큼 char 으로 채워진 문자열
 * @example
	gcm.str.rpad("24", 4, "0"); // "2400"
	gcm.str.rpad("11321", 8, "A"); // "11321AAA"
 */
gcm.str.rpad = function(str, length, char) {
	try {
		if (char.length > length) {
			console.log("오류 : 채우고자 하는 문자열이 요청 길이보다 큽니다");
			return str + "";
		}
		while (str.length < length)
			str += char;
		str = str.length >= length ? str.substring(0, length) : str;
		return str;
	} catch (e) {
		console.error("[gcm.str.rpad] Exception :: " + e);
		return str;
	}
};

/**
 * 주민번호 문자열에 Formatter(######-#######)를 적용하여 반환한다.
 *
 * @memberof gcm.str
 * @param {String} str 주민번호 문자열
 * @return {String} 포멧터가 적용된 주민번호 문자열
 * @example
	gcm.str.formatSSN("1234561234567");  // "123456-1234567"
 */
gcm.str.formatSSN = function (str) {
	try {
		var front = String(str).substr(0, 6);
		var back = String(str).substr(6, 7);
		var output = front + "-" + back;

		return output;
	} catch (e) {
		console.error("[gcm.str.formatSSN] Exception :: " + e);
		return str;
	}
};

/**
 * 문자열에 전화번호 형식 Formatter를 적용하여 반환한다.
 *
 * @memberof gcm.str
 * @param {String} str 포멧터를 적용할 문자열
 * @return {String} 포멧터가 적용된 문자열
 * @example
	gcm.str.formatPhone("0212345678");  // "02-1234-5678"
	gcm.str.formatPhone("05051234567"); // "0505-123-4567"
	gcm.str.formatPhone("03112345678"); // "031-1234-5678"
	gcm.str.formatPhone("0311234567");  // "031-123-4567"
 */
gcm.str.formatPhone = function (str) {
	try {
		str = str.replace(/\s+/g,"");
		var commCdList = ["0505"]; // 4자리 국번 ,예외가 되는 국번 확인
		var commCdNum = str.substr(0,4); // 국번 4자리 확인
		if(commCdList.indexOf(commCdNum) >-1){ //국번이 0505 인경우
			return str.replace(/^(01[0136789]{1}|02|0[3-9]{1}[0-9]{1}[0-9]{1})-?([*0-9]{3,4})-?([0-9]{4})$/,"$1-$2-$3");
		}else if(str.length <=11){
			return str.replace(/^(01[0136789]{1}|02|0[3-9]{1}[0-9]{1})-?([*0-9]{3,4})-?([0-9]{4})$/,"$1-$2-$3");
		}else{
			return str;
		}
	} catch (e) {
		console.error("[gcm.str.formatPhone] Exception :: " + e);
		return str;
	}
};

/**
 * 문자열에 시간 형식 Formatter를 적용하여 반환한다.
 *
 * @memberof gcm.str
 * @param {String} str 포멧터를 적용할 문자열
 * @return {String} 포멧터가 적용된 문자열
 * @example
	gcm.str.formatTime("123402"); // 12:34:02
	gcm.str.formatTime("1234"); // 12:34:02
 */
gcm.str.formatTime = function(str) {
	try {
		var hour = String(str).substr(0, 2);
		var minute = String(str).substr(2, 2);
		var second = String(str).substr(4, 2);
		if (gcm.util.isEmpty(second)) {
			return hour + ":" + minute;
		} else {
			return hour + ":" + minute + ":" + second;
		}
	} catch (e) {
		console.error("[gcm.str.formatTime] Exception :: " + e);
		return str;
	}
};

/**
 * 문자(char)의 유형을 리턴한다.
 *
 * @memberof gcm.str
 * @param {String} str 어떤 유형인지 리턴받을 문자
 * @return {Number} 유니코드 기준 <br><br>
 * 한글자모[ 4352 ~ 4601 ] => 2 <br>
 * 한글음절[ 44032 ~ 55203 ] => 1 <br>
 * 숫자[ 48 ~ 57 ] => 4 <br>
 * 특수문자[ 32 ~ 47 || 58 ~ 64 || 91 ~ 96 || 123 ~ 126 ] => 8 <br>
 * 영문대[ 65 ~ 90 ] => 16 <br>
 * 영문소[ 97 ~ 122 ] => 32 <br>
 * 기타[그외 나머지] => 48
 * @example
	gcm.str.getLocale("가"); // 1
	gcm.str.getLocale("ㅏ"); // 2
	gcm.str.getLocale("1");  // 4
	gcm.str.getLocale("!");  // 8
	gcm.str.getLocale("A");  // 16
	gcm.str.getLocale("a");  // 32
	gcm.str.getLocale("¿");  // 48
 */
gcm.str.getLocale = function (str) {
	try {
		var locale = 0;
		if (str.length > 0) {
			var charCode = str.charCodeAt(0);

			if (charCode >= 0XAC00 && charCode <= 0XD7A3) { // 한글음절.[ 44032 ~ 55203 ]
				locale = 0X1; // 1
			} else if ((charCode >= 0X1100 && charCode <= 0X11F9) || (charCode >= 0X3131 && charCode <= 0X318E)) { // 한글자모.[ 4352 ~ 4601 ]
				locale = 0X2; // 2
			} else if (charCode >= 0X30 && charCode <= 0X39) { // 숫자.[ 48 ~ 57 ]
				locale = 0X4; // 4
			} else if ((charCode >= 0X20 && charCode <= 0X2F) || (charCode >= 0X3A && charCode <= 0X40) || (charCode >= 0X5B && charCode <= 0X60)
					|| (charCode >= 0X7B && charCode <= 0X7E)) { // 특수문자
				locale = 0X8; // 8
			} else if (charCode >= 0X41 && charCode <= 0X5A) { // 영문 대.[ 65 ~ 90 ]
				locale = 0X10; // 16
			} else if (charCode >= 0X61 && charCode <= 0X7A) { // 영문 소.[ 97 ~ 122 ]
				locale = 0X20; // 32
			} else { // 기타
				locale = 0X30; // 48
			}
		}
		return locale;
	} catch (e) {
		console.error("[gcm.str.getLocale] Exception :: " + e);
		return null;
	}
};

/**
 * 입력받은 문자열에 한글이 포함되어 있는지 여부를 검사한다.
 *
 * @memberof gcm.str
 * @param {String} value 한글 유형인지 검증할 문자열
 * @return {Boolean} true or false
 * @example
	gcm.str.existKorean("abc"); // false
	gcm.str.existKorean("abc무궁화"); // true
	gcm.str.existKorean("무궁화꽃이"); // true
 */
gcm.str.existKorean = function (value) {
	try {
		check = /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
		if (check.test(value)) {
			return true;
		} else {
			return false;
		}
	} catch (e) {
		console.error("[gcm.str.existKorean] Exception :: " + e);
		return null;
	}
};

/**
 * 입력받은 문자열 전체가 한글인지를 검사한다.
 *
 * @memberof gcm.str
 * @param {String} str 한글이 포함되어 있는지 검증 받을 문자열
 * @return {Boolean} true or false
 * @example
	gcm.str.isKorean("abcd"); // false
	gcm.str.isKorean("abcd무궁화"); // false
	gcm.str.isKorean("무궁화"); // true
 */
gcm.str.isKorean = function (str) {
	try {
		var result = false;

		for (var i = 0; i < str.length; i++) {
			c = str.charAt(i);
			if (!gcm.str.existKorean(c)) {
				result = false;
				break;
			} else {
				result = true;
			}

		}
		return result;
	} catch (e) {
		console.error("[gcm.str.isKorean] Exception :: " + e);
		return null;
	}
};

/**
 * 종성이 존재하는지 여부를 검사한다.
 *
 * @memberof gcm.str
 * @param {String} str 종성의 여부를 검사할 문자열
 * @return {Boolean} true or false
 * @example
	gcm.str.isFinalConsonant("종서")
	//return 예시) false
	
	gcm.str.isFinalConsonant("종성")
	//return 예시) true
	
	gcm.str.isFinalConsonant("입니다")
	//return 예시) false
	
	gcm.str.isFinalConsonant("입니당")
	//return 예시) true
 */
gcm.str.isFinalConsonant = function (str) {
	try {
		var code = str.charCodeAt(str.length - 1);
		if ((code < 44032) || (code > 55197)) {
			return false;
		}
		if ((code - 16) % 28 == 0) {
			return false;
		}
		return true;
	} catch (e) {
		console.error("[gcm.str.isFinalConsonant] Exception :: " + e);
		return null;
	}
};

/**
 * 단어 뒤에 '은'이나 '는'을 붙여서 반환한다.
 *
 * @memberof gcm.str
 * @param {String} str 은, 는 붙일 문자열
 * @return {String} 변환된 문자열
 * @example
	gcm.str.attachPostposition("나");
	//return 예시)"나는"
	
	gcm.str.attachPostposition("나와 너");
	//return 예시)"나와 너는"
	
	gcm.str.attachPostposition("그래서");
	//return 예시)"그래서는"
	
	gcm.str.attachPostposition("그랬습니다만");
	//return 예시)"그랬습니다만은"
 */
gcm.str.attachPostposition = function (str) {
	try {
		if (gcm.lang.getLangCode() == "ko") {
			if (gcm.str.isFinalConsonant(str)) {
				str = str + "은";
			} else {
				str = str + "는";
			}
			return str;
		} else {
			return str;
		}
	} catch (e) {
		console.error("[gcm.str.attachPostposition] Exception :: " + e);
		return str;
	}
};

/**
 * 사업자번호 유효성을 검사한다.
 *
 * @memberof gcm.str
 * @param {String} str 사업자번호 문자열
 * @return {Boolean} 정상이면 true, 비정상이면 false를 반환
 * @example
	gcm.str.isBizID("1102112345"); // false
	gcm.str.isBizID("1078616054"); // true
	gcm.str.isBizID("2208139938"); // true
	gcm.str.isBizID("1248100998"); // true
 */
gcm.str.isBizID = function (str) {
	try {
		var sum = 0;
		var aBizID = new Array(10);
		var checkID = new Array("1", "3", "7", "1", "3", "7", "1", "3", "5");

		for (var i = 0; i < 10; i++) {
			aBizID[i] = str.substring(i, i + 1);
		}

		for (var i = 0; i < 9; i++) {
			sum += aBizID[i] * checkID[i];
		}

		sum = sum + parseInt((aBizID[8] * 5) / 10);
		temp = sum % 10;
		temp1 = 0;

		if (temp != 0) {
			temp1 = 10 - temp;
		} else {
			temp1 = 0;
		}

		if (temp1 != aBizID[9]) {
			return false;
		}

		return true;
	} catch (e) {
		console.error("[gcm.str.isBizID] Exception :: " + e);
		return null;
	}
};

/**
 * 내외국인 주민등록번호 유효성을 검사한다.
 *
 * @memberof gcm.str
 * @param {String} str 문자열
 * @returns {Boolean} 정상이면 true, 비정상이면 false를 반환
 * @example
	gcm.str.isSSN("9701011234567");
 */
gcm.str.isSSN = function (str) {
	try {
		var checkID = new Array(2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5);
		var i = 0, sum = 0;
		var temp = 0;
		var yy = "";

		if (str.length != 13) {
			return false;
		}

		for (i = 0; i < 13; i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				return false;
			}
		}

		// foreigner PersonID Pass
		if (str.substring(6, 13) == "5000000" || str.substring(6, 13) == "6000000" || str.substring(6, 13) == "7000000"
			|| str.substring(6, 13) == "8000000") {
			return true;
		}

		for (i = 0; i < 12; i++) {
			sum += str.charAt(i) * checkID[i];
		}

		temp = sum - Math.floor(sum / 11) * 11;
		temp = 11 - temp;
		temp = temp - Math.floor(temp / 10) * 10;

		// 나이 (-) 체크
		if (str.charAt(6) == '1' || str.charAt(6) == '2' || str.charAt(6) == '5' || str.charAt(6) == '6') {
			yy = "19";
		} else {
			yy = "20";
		}

		if (parseInt(gcm.date.getServerDateTime("yyyy")) - parseInt(yy + str.substring(0, 2)) < 0) {
			return false;
		}

		// 외국인 주민번호 체크로직 추가
		if (str.charAt(6) != '5' && str.charAt(6) != '6' && str.charAt(6) != '7' && str.charAt(6) != '8') {
			if (temp == gcm.num.parseInt(str.charAt(12))) {
				return true;
			} else {
				return false;
			}
		} else {
			if ((temp + 2) % 10 == gcm.num.parseInt(str.charAt(12))) {
				return true;
			} else {
				return false;
			}
		}

		return false;
	} catch (e) {
		console.error("[gcm.str.isSSN] Exception :: " + e);
		return null;
	}
};

/**
 * 이메일 주소의 유효성을 검사한다.
 *
 * @memberof gcm.str
 * @param {String} str 메일주소
 * @return {Boolean} 정상이면 true, 비정상이면 false를 반환
 * @example
	gcm.str.isEmail("emailTest@email.com");  // true
 */
gcm.str.isEmail = function (str) {
	try {
		if (typeof str != "undefined" && str != "") {
			var format = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

			if (format.test(str)) {
				return true;
			} else {
				return false;
			}
		}

		return true;
	} catch (e) {
		console.error("[gcm.str.isEmail] Exception :: " + e);
		return null;
	}
};

/**
 * 전화번호의 유효성을 검사한다.
 *
 * @memberof gcm.str
 * @param {String} str :: I :: Y :: :: 전화번호
 * @return {Boolean} 정상이면 true 그외는 false 반환
 * @example
	gcm.str.isPhone("01094832134"); // true
	gcm.str.isPhone("02094832134"); // false
 */
gcm.str.isPhone = function(str) {
	try {
		var phoneNum = gcm.str.formatPhone(str);
		var isDash = (phoneNum.indexOf("-")>1);
		return isDash;
	} catch (e) {
		console.error("[gcm.str.isPhone] Exception :: " + e);
		return null;
	}
};

/**
 * 문자열을 치환한다.
 *
 * @memberof gcm.str
 * @param	{String} str 문자열
 * @param	{String} orgStr 검색할 문자
 * @param	{String} repStr 치환할 문자
 * @return   {String} 치환문자열
 * @example	gcm.str.replaceAll(obj.getValue(), "/", "");
 */
gcm.str.replaceAll = function( str, orgStr, repStr ){
	try {
		str = ""+str;
		return str.split(orgStr).join(repStr);
	} catch (e) {
		console.error("[gcm.str.replaceAll] Exception :: " + e);
		return str;
	}
};

/**
 * 입력된 문자열의 좌우측 공백을 제거한 문자열을 구한다.
 *
 * @memberof gcm.str
 * @param {String} str 좌우측 공백문자를 제거하려는 문자열
 * @return {String} 입력된 문자열에서 좌우측 공백이 제거된 문자열
 * @example gcm.str.trim("   a   ");  // return "a"
 */
gcm.str.trim = function(str) {
	try {
		if (typeof str == "undefined" || str == null) {
			str ="";
		}
		if (typeof str !== "string") {
			str = str + "";
		}
		return str.trim();
	} catch (e) {
		console.error("[gcm.str.trim] Exception :: " + e);
		return str;
	}
};

/**
 * 문자열의 바이트 기준 문자열 길이를 반환한다.
 *
 * @memberof gcm.str
 * @param {String} str 문자열
 * @param {String} ignoreChar 길이 측정 시 무사할 문자열
 * @return {Number} 문자열 길이
 * @example
	gcm.str.getByteLength("1231aABC");  // 8
	gcm.str.getByteLength("1231a한글");  // 9
 */
gcm.str.getByteLength = function(str, ignoreChar) {
	try {
		return WebSquare.util.getStringByteSize(str, ignoreChar);
	} catch (e) {
		console.error("[gcm.str.getByteLength] Exception :: " + e);
		return null;
	}
};

/**
 * 문자열이 null이면 대체문자열를 반환한다.
 *
 * @memberof gcm.str
 * @param {String} str 문자열
 * @param {String} nvl 대체문자 문자열
 * @return {String} 문자열
 * @example
	gcm.str.nvl(null, "test");  // test
 */
gcm.str.nvl = function(str, nvl) {
	try {
		if (str == null || str == undefined) {
			return nvl ? nvl : "";
		} else {
			return str;
		}
	} catch (e) {
		console.error("[gcm.str.nvl] Exception :: " + e);
		return null;
	}
};

/**
 * 개행 <br/>로 변환 및 탭/공백 &nbsp로 변환
 *
 * @memberof gcm.str
 * @param {String} str 문자열
 * @return {String} 변환된 문자열
 */
gcm.str.newlineToBr = function(str, isNotEscape) {
	try {
		if (str == null || str == undefined) {
			return "";
		} else if (typeof str == "string") {
			str = str.replace(/(\n|\r\n)/g, '<br/>'); // 개행 <br/>로 변환
			str = str.replace(/\t/g, '&nbsp;&nbsp;&nbsp;&nbsp;'); // 탭 &nbsp;&nbsp;&nbsp;&nbsp;로 변환
			if (!isNotEscape) {
				str = str.replace(/\s/gi, '&nbsp;'); // 공백을 &nbsp;로 변환
			}
			return str;
		} else {
			return str;
		}
	} catch (e) {
		console.error("[gcm.str.newlineToBr] Exception :: " + e);
		return str;
	}
};

/**
 * 날짜 관련 함수를 작성한다.
 *
 * @class date
 * @namespace gcm.date
 */
gcm.date = {};

/**
 * 입력된 날짜에 지정된 만큼의 분을 더한다.
 *
 * @memberof gcm.date
 * @param {String} pYmd 날짜 형식의 문자열 (yyyyMMdd or yyyyMMddHHmmss)
 * @param {Number} offset 더할 분 수.
 * @return {String} 지정된 offset만큼의 날짜가 더해진 입력 날짜.
 * @example
	gcm.date.addMinute("201708191210", 10); // "201708191220"
	gcm.date.addMinute("201708191210", -10); // "201708191200"
 */
gcm.date.addMinute = function(pYmd, offset) {
	try {
		return WebSquare.date.dateTimeAdd(pYmd, offset, "minute");
	} catch (e) {
		console.error("[gcm.date.addMinute] Exception :: " + e);
		return null;
	}
};

/**
 * 입력된 날짜에 지정된 만큼의 시간을 더한다.
 *
 * @memberof gcm.date
 * @param {String} pYmd 날짜 형식의 문자열 (yyyyMMdd or yyyyMMddHHmmss)
 * @param {Number} offset 더할 시간 수.
 * @return {String} 지정된 offset만큼의 날짜가 더해진 입력 날짜.
 * @example
	gcm.date.addHour("2017081912", 10); // "2017081922"
	gcm.date.addHour("2017081912", -10); // "2017081902"
 */
gcm.date.addHour = function(pYmd, offset) {
	try {
		return WebSquare.date.dateTimeAdd(pYmd, offset, "hour");
	} catch (e) {
		console.error("[gcm.date.addHour] Exception :: " + e);
		return null;
	}
};

/**
 * 입력된 날짜에 지정된 만큼의 날을 더한다.
 *
 * @memberof gcm.date
 * @param {String} pYmd 날짜 형식의 문자열 (yyyyMMdd or yyyyMMddHHmmss)
 * @param {Number} offset 더할 날짜 수.
 * @return {String} 지정된 offset만큼의 날짜가 더해진 입력 날짜.
 * @example
	gcm.date.addDate("20170819", 2); // "20170821"
	gcm.date.addDate("20170819", -10); // "20170809"
 */
gcm.date.addDate = function(pYmd, offset) {
	try {
		return WebSquare.date.dateAdd(pYmd, offset);
	} catch (e) {
		console.error("[gcm.date.addDate] Exception :: " + e);
		return null;
	}
};

/**
 * 입력된 날짜에 지정된 만큼의 달을 더한다.
 *
 * @memberof gcm.date
 * @param {String} pYmd 날짜 형식의 문자열 (yyyyMMdd or yyyyMMddHHmmss)
 * @param {Number} offset 더할 개월 수.
 * @return {String} 지정된 offset만큼의 개월이 더해진 입력 날짜.
 * @example
	gcm.date.addMonth("20170819", 2); // "20171019"
	gcm.date.addMonth("20170819", -10); // "20161019"
 */
gcm.date.addMonth = function(pYmd, offset) {
	try {
		var date = "";
		var isDate = gcm.date.isDate(pYmd);

		if (!isDate) {
			return;
		}
		if (typeof offset == "undefined" || isNaN(offset)) {
			offset = 0;
		}

		var dY = (pYmd + "").substring(0, 4);
		var dM = (pYmd + "").substring(4, 6);
		var dD = (pYmd + "").substring(6, 8);
		var dTime = (pYmd + "").substring(8);
		dM = (dM * 1) + (offset * 1);

		if (dM > 0) {
			dY = (dY * 1) + Math.floor(dM / 12);
			dM = dM % 12;
		} else {
			dY = (dY * 1) - Math.floor((dM * -1 + 12) / 12);
			dM = dM % 12 + 12;
		}

		if (Number(dD) >= 30) {
			var chkMonth1 = [ 2 ];
			var chkMonth2 = [ 4, 6, 9, 11 ];

			if (chkMonth1.indexOf(dM) > -1) {
				if (comf.isLeafYear(dY + "01" + "01")) {
					dD = "29";
				} else {
					dD = "28";
				}
			} else if (chkMonth2.indexOf(dM) > -1) {
				if (Number(dD) > 30) {
					dD = "30";
				}
			}
		}
		var cDate = new Date(dY, dM - 1, dD);
		var cYear = cDate.getFullYear();
		var cMonth = cDate.getMonth() + 1;
		if ((cMonth + "").length < 2) {
			cMonth = "0" + cMonth;
		}
		var cDay = cDate.getDate();
		if ((cDay + "").length < 2) {
			cDay = "0" + cDay;
		}
		date = cYear + "" + cMonth + "" + cDay + "" + dTime;
		return date;
	} catch (e) {
		console.error("[gcm.date.addMonth] Exception :: " + e);
		return null;
	}
};

/**
 * 서버 날짜 반환한다. (default format: yyyyMMdd)
 *
 * @memberof gcm.date
 * @param {String:N} sDateFormat 날짜 포맷<br/>
 * y Year 1996; 96<br/>
 * M Month in year 07<br/>
 * d Day in month 10<br/>
 * H Hour in day (0-23) 0<br/>
 * m Minute in hour 30<br/>
 * s Second in minute 55<br/>
 * S Millisecond 978<br/>
 * @return  String 현재날짜
 * @example
	gcm.date.getServerDateTime("yyyy-MM-dd HH:mm:ss SSS");
	gcm.date.getServerDateTime("yyyy-MM-dd");
	gcm.date.getServerDateTime();
 */
gcm.date.getServerDateTime = function (sDateFormat) {
	try {
		if (gcm.util.isEmpty(sDateFormat)) {
			sDateFormat = "yyyyMMdd";
		}
		var now = WebSquare.date.getCurrentServerDate(sDateFormat);
		// 서버가 죽어있을때(19700101로 리턴) 클라이언트 시간으로 변경
		if (sDateFormat.startsWith("yyyy") && now.startsWith("1970")) {
			now = gcm.date.formatDateTime(new Date(), sDateFormat);
		}
		return now;
	} catch (e) {
		console.error("[gcm.date.getServerDateTime] Exception :: " + e);
		return null;
	}
};

/**
 * 문자열에 날짜 Formatter를 적용하여 반환한다.
 *
 * @memberof gcm.date
 * @param {String} str 포멧터를 적용할 파라메터 (String 또는 Number 타입 지원)
 * @param {String} type 적용할 포멧터 형식 Default:null,slash,date
 * @author Inswave Systems
 * @return {String} 포멧터가 적용된 문자열
 * @example
	gcm.date.formatDate(20120319, "slash");
	//return 예시) 12/03/19
	
	gcm.date.formatDate(20120319, "date");
	//return 예시) 2012/03/19
	
	gcm.date.formatDate(20120319, "dash");
	//return 예시) 2012-03-19
	
	gcm.date.formatDate(20120319, "colon");
	//return 예시) 2012:03:19
	
	gcm.date.formatDate(20120319);
	//return 예시) 2012년 03월 19일
 */
gcm.date.formatDate = function (str, type) {
	try {
		var output = "";
		var date = new String(str);

		if (type == "slash") {
			date = date.substring(2, date.length);
			for (var i = 0; i <= date.length - 1; i++) {
				output = output + date[i];
				if ((i + 1) % 2 == 0 && (date.length - 1) !== i)
					output = output + "/";
			}
		} else if (type == "date") {
			if (date.length == 8) {
				output = date.substr(0, 4) + "/" + date.substr(4, 2) + "/" + date.substr(6, 2);
			}
		} else if (type == "dash") {
			if (date.length == 8) {
				output = date.substr(0, 4) + "-" + date.substr(4, 2) + "-" + date.substr(6, 2);
			}
		} else if (type == "dot") {
			if (date.length == 8) {
				output = date.substr(0, 4) + "." + date.substr(4, 2) + "." + date.substr(6, 2);
			}
		} else if (type == "colon") {
			if (date.length == 8) {
				output = date.substr(0, 4) + ":" + date.substr(4, 2) + ":" + date.substr(6, 2);
			}
		} else {
			var year = date.substr(0, 4);
			var month = date.substr(4, 2);
			var day = date.substr(6, 2);
			var output = year + "년 " + month + "월 " + day + "일";
		}

		return output;
	} catch (e) {
		console.error("[gcm.date.formatDate] Exception :: " + e);
		return str;
	}
};

/**
 * 시간 - 입력된 String 또는 Number에 포메터를 적용하여 반환한다.
 *
 * @memberof gcm.date
 * @param {String} value 시간 Formatter를 적용한 값 (String 또는 Number 타입 지원)
 * @return {String} 포멧터가 적용된 문자열
 * @example
	gcm.date.formatTime("123402");
	//return 예시) "12:34:02"
 */
gcm.date.formatTime = function (value) {
	try {
		var hour = String(value).substr(0, 2);
		var minute = String(value).substr(2, 2);
		var second = String(value).substr(4, 2);
		var output = hour + ":" + minute + ":" + second;

		return output;
	} catch (e) {
		console.error("[gcm.date.formatTime] Exception :: " + e);
		return value;
	}
};

/**
 * 날짜 객체에 포매팅을 적용한다. (default format: yyyyMMdd)
 *
 * @memberof gcm.date
 * @param {Date} 포맷팅을 적용할 날짜 객체
 * @param {String:N} sDateFormat 날짜 포맷<br/>
 * y Year 1996; 96<br/>
 * M Month in year 07<br/>
 * d Day in month 10<br/>
 * H Hour in day (0-23) 0<br/>
 * m Minute in hour 30<br/>
 * s Second in minute 55<br/>
 * S Millisecond 978<br/>
 * @return {String} 현재날짜
 * @example
	gcm.date.formatDateTime(new Date());  // "20190822"
	gcm.date.formatDateTime(new Date(), "yyyy-MM-dd HH:mm:ss SSS");  // "2019-08-22 15:55:35 705"
 */
gcm.date.formatDateTime = function (value, sDateFormat) {
	try {
		if (gcm.util.isEmpty(sDateFormat)) {
			sDateFormat = "yyyyMMdd";
		}

		return WebSquare.date.getFormattedDate(value, sDateFormat);
	} catch (e) {
		console.error("[gcm.date.formatDateTime] Exception :: " + e);
		return value;
	}
};

/**
 * 입력된 값이 Date 형식의 값인지 확인한다.
 *
 * @memberof gcm.date
 * @param {String|number} sDate 날짜 문자열 (yyyyMMdd or yyyyMMddHHmmss)
 * @param {Boolean} timeChk 시간체크. (true/false)
 * @return {Boolean} Date 형식에 일치하면 true, 아니면 false
 * @author Inswave Systems
 * @example
	gcm.date.isDate("20170819"); // return true
 */
gcm.date.isDate = function(sDate, timeChk) {
	try {
		var flag = true;
		if (sDate.length == 8) {
//			sDate = sDate + "000000";
			sDate = gcm.str.rpad(sDate, 14, "0");
		}

		var y1 = parseInt(sDate.substring(0, 4), 10);
		var m1 = parseInt(sDate.substring(4, 6), 10);
		var d1 = parseInt(sDate.substring(6, 8), 10);
		var h1 = parseInt(sDate.substring(8, 10), 10);
		var t1 = parseInt(sDate.substring(10, 12), 10);
		var s1 = parseInt(sDate.substring(12), 10);
		if (isNaN(y1) || isNaN(m1) || isNaN(d1) || isNaN(h1) || isNaN(t1) || isNaN(s1))
			flag = false;

		if (m1 < 1 || m1 > 12)
			flag = false;

		var maxDay = 31;
		if (m1 == 2) {
			maxDay = ((y1 % 400 == 0) || ((y1 % 4 == 0) && (y1 % 100 != 0))) ? 29
					: 28;
		} else if (m1 == 4 || m1 == 6 || m1 == 9 || m1 == 11) {
			maxDay = 30;
		}

		if (d1 < 1 || d1 > maxDay) {
			flag = false;
		}

		if (h1 + t1 + s1 != "") {
			if (h1 < 0 || h1 > 24) {
				flag = false;
			} else if (h1 == 24) {
				if(typeof timeChk == "boolean" && !timeChk)
					flag = false;
				if (t1 > 0)
					flag = false;
				if (s1 > 0)
					flag = false;
			}
			if (t1 < 0 || t1 > 59)
				flag = false;
			if (s1 < 0 || s1 > 59)
				flag = false;
		}
		return flag;
	} catch (e) {
		console.error("[gcm.date.isDate] Exception :: " + e);
		return null;
	}
};

/**
 * fromDate, toDate 를 입력받아 두 날짜의 차이를 반환한다.
 *
 * @memberof gcm.date
 * @param {String} fromDate 시작일자 (date형식은 yyyyMMdd or yyyyMMddHHmmss)
 * @param {String} toDate 종료일자 (date형식은 yyyyMMdd or yyyyMMddHHmmss)
 * @return {Number} 종료일자에서 시작일자의 날짜 차이 수.
 * @example
	gcm.date.diffDate("20170821", "20180621"); // 304
 */
gcm.date.diffDate = function(fromDate, toDate) {
	try {
		if (!gcm.date.isDate(fromDate) || !gcm.date.isDate(toDate)) {
			return;
		}
		var diffDate = WebSquare.date.dateDiff(fromDate, toDate);
		return diffDate;
	} catch (e) {
		console.error("[gcm.date.diffDate] Exception :: " + e);
		return null;
	}
};

/**
 * 입력된 양력의 날짜가 윤년인지 검사한다.
 *
 * @memberof gcm.date
 * @param {String} pYmd :: I :: Y ::  :: 윤달 확인 날짜.
 * @return {boolean} 윤달 유무( true : 윤달)
 * @example
	gcm.date.isLeafYear("20201212");  // return true
 */
gcm.date.isLeafYear = function(pYmd) {
	try {
		var isLeafYear = false;
		if (!gcm.date.isDate(pYmd)) {
			return;
		} else {
			pYmd = pYmd.substr(0, 8);
			var y1 = parseInt( pYmd.substr(0, 4), 10);
			isLeafYear = ((y1 % 400 == 0 ) || ((y1 % 4 == 0) && (y1 % 100 != 0))) ? true : false;
		}
		return isLeafYear;
	} catch (e) {
		console.error("[gcm.date.isLeafYear] Exception :: " + e);
		return null;
	}
};

/**
 * 특정 날짜의 요일을 반환한다.
 *
 * @memberof gcm.date
 * @param {String} value "yyyyMMdd" 포맷 형태의 날짜를 나타내는 문자열 ("20190801")
 * @param {String} type 반환형식 기본값은 날짜를 한글로 반환 , num 인경우 숫자로 반환 일요일 :  1 ~ 토요일 : 7
 * @return {String} 요일
 * @example
	gcm.date.getDay("20190822");  // "목요일"
	gcm.date.getDay("20190824");  // "토요일"
	gcm.date.getDay("20191010","num");  // "5"
 */
gcm.date.getDay = function (value,type) {
	try {
		var dayVal;
		if (type == "num") {
			var dayVal = WebSquare.date._getDay(value);
			if (dayVal == 0 ) {
				return "7";
			}else{
				return String(dayVal);
			}
		} else {
			return WebSquare.date.getDay(value);
		}
	} catch (e) {
		console.error("[gcm.date.getDay] Exception :: " + e);
		return null;
	}
};

/**
 * 특정 날짜의 음력 날짜를 반환한다.
 *
 * @memberof gcm.date
 * @param {String} "yyyyMMdd" 포맷 형태의 날짜를 나타내는 문자열
 * @return {String} 음력 날짜
 * @example
	gcm.date.getLunar("20190824");  // "20190724"
 */
gcm.date.getLunar = function (value) {
	try {
		return  WebSquare.date.toLunar(value);
	} catch (e) {
		console.error("[gcm.date.getLunar] Exception :: " + e);
		return null;
	}
};

/**
 * 해당 월의 마지막 날짜를 반환한다.
 *
 * @memberof gcm.date
 * @param {String} yearMonth 년월 문자열 (yyyyMM)
 * @return 마지막 날짜
 * @example
	gcm.date.getLastDateOfMonth("201510");  // 31
 */
gcm.date.getLastDateOfMonth = function(yearMonth) {
	try {
		if (typeof yearMonth !== "string") {
			yearMonth = gcm.str.serialize(yearMonth);
		}

		var year = yearMonth.substring(0, 4);
		var month = yearMonth.substring(4, 6);

		return (new Date(year, month, 0)).getDate();
	} catch (e) {
		console.error("[gcm.date.getLastDateOfMonth] Exception :: " + e);
		return null;
	}
};

/**
 * 기간 달력 UDC에서 Holiday기능을 이용해 시작일과 종료일 사이에 기간 효과를 준다.
 *
 * @memberof gcm.date
 * @param {Object} From Calendar 객체
 * @param {Object} To Calendar 객체
 * @example
	gcm.date.setPeriodHoliday(cal_from, cal_to);
 */
gcm.date.setPeriodHoliday = function(calFromObj, calToObj) {
	try {
		// 다른 달일 경우 기간 배경 색상 효과
		var fromDt = calFromObj.getValue();
		var toDt = calToObj.getValue();
		var diff = gcm.date.diffDate(fromDt, toDt);
		var holiday = fromDt;
		calFromObj.options.holiday = "";
		calToObj.options.holiday = "";
//		for (var i=0; i<diff; i++) {
//			holiday += gcm.date.addDate(fromDt, i+1);
		for (var i=0; i<diff; i++) {
			var tmp = gcm.date.addDate(fromDt, i+1);
			if (fromDt.substr(4,2) != tmp.substr(4,2)) {
				break;
			}
			holiday += " " + tmp; 
		}
//		console.log("fromDt holiday : " + holiday);
		calFromObj.setHoliday(holiday);
		holiday = toDt;
		for (var i=0; i>-diff; i--) {
			var tmp = gcm.date.addDate(toDt, i-1);
			if (toDt.substr(4,2) != tmp.substr(4,2)) {
				break;
			}
			holiday += " " + tmp; 
		}
//		console.log("toDt holiday : " + holiday);
		calToObj.setHoliday(holiday);
	} catch (e) {
		console.error("[gcm.date.setPeriodHoliday] Exception :: " + e);
		return null;
	}
};

/**
 * 배열과 관련된 함수를 작성한다.
 *
 * @class arr
 * @namespace gcm.arr
 */
gcm.arr = {}

/**
 * JSON 배열 내 존재 여부
 * (JSON 배열이 아니면 배열의 indexOf 함수 사용할 것)
 *
 * @memberof gcm.arr
 * @param {Array} arrObj JSON 배열
 * @param {String} key 찾으려는 키
 * @param {Object} value 찾으려는 값
 * @return {Boolean} 있으면 true, 없으면 false
 * @example
	var a = [{id:1, name:"kim"},{id:2, name:"park"}];
	gcm.arr.isIn(a, "id", 2); // true
	gcm.arr.isIn(a, "name", "kim"); // true
	gcm.arr.isIn(a, "name", "test"); // false
 */
gcm.arr.isIn = function(arrObj, key, value) {
	try {
		for (let i=0; i<arrObj.length; i++) {
			if (arrObj[i][key] === value) {
				return true;
			}
		}
		return false;
	} catch (e) {
		console.error("[gcm.date.isIn] Exception :: " + e);
		return false;
	}
};

/**
 * 외부 솔루션 연동과 관련된 함수를 작성한다.
 *
 * @class ext
 * @namespace gcm.ext
 */
gcm.ext = {}

/**
 * Split 객체를 생성하고 반환한다.
 * 생성된 객체는 창을 닫을때 메모리 반환을 위해 반드시 scwin 객체 하위 객체로 리턴 받도록 한다. 
 *
 * @memberof gcm.ext
 * @param {Object} scopeScwin Scope scwin 객체
 * @param {Array} grpIdArr Split 를 적용할 그룹 Array
 * @param {Object} options Split 옵션 (Split.js 스펙 참조 - https://split.js.org/)
 * @param {Object} options.direction Split 방향 (default : horizontal) horizontal / vertical
 * @param {Array} options.sizes Split 초기 Size Array (Split 를 적용할 그룹 Array 와 동일 수)
 * @param {Int||Array} options.minSize Split 최소 Size (Int 또는 Split 를 적용할 그룹 Array 와 동일 수)
 * @param {Function} options.onDblClick gutter 더블 클릭 이벤트
 * @return Split 객체
 * @example
	scwin.splitA = gcm.ext.setSplit(['a', 'b'], {direction: 'vertical', minSize: 180, sizes: [70, 30]});
 */
gcm.ext.setSplit = function(scopeScwin, grpIdArr, options) {
	try {
		var _gutterSize = 8;
		var _direction = (typeof options !== 'undefined' && typeof options.direction !== 'undefined') ? options.direction : 'horizontal';
		var _cursor = _direction === 'horizontal' ? 'col-resize' : 'row-resize';
		var _sizes = (typeof options !== 'undefined' && typeof options.sizes !== 'undefined') ? options.sizes : [];
		var _minSize = (typeof options !== 'undefined' && typeof options.minSize !== 'undefined') ? options.minSize : 180;
		// if (_minSize <  20) _minSize = 20;
		if (_sizes.length == 0) {
			var _size = parseInt(100 / grpIdArr.length);
			for (var idx = 0, iCnt = grpIdArr.length; idx <  iCnt; idx++) {
				_sizes.push(_size);
			}
		}
		for (var idx = 0, iCnt = grpIdArr.length; idx <  iCnt; idx++) {
			grpIdArr[idx] = '#' + scopeScwin.$w.getRuntimeId(grpIdArr[idx]);
		}
		var splitOption = {
				direction: _direction,
				sizes: _sizes,
				minSize : _minSize,
				gutterSize: _gutterSize,
				cursor: _cursor
		};
		// onDblClick 옵션 설정시 gutter 더블 클릭이벤트 처리 (quick 검색영역 접기 용도로 사용)
		if (typeof options.onDblClick == "function") {
			gcm.ext.splitClickCount = 0; 
			splitOption.onDragEnd = function() { // gutter 클릭시 이벤트 진입
//				console.log("[spliter onDragEnd] clickCount : " + gcm.ext.splitClickCount);
				// 더블클릭 이벤트 판단
				if (gcm.ext.splitClickCount === undefined) {
					gcm.ext.splitClickCount = 1;
				} else {
					gcm.ext.splitClickCount++;
				} 
//				console.log("[spliter onDragEnd] clickCount : " + gcm.ext.splitClickCount);
			    if (gcm.ext.splitClickCount === 1) {
			        gcm.ext.splitSingleClickTimer = setTimeout(function() {
			            gcm.ext.splitClickCount = 0;
				        // singleClick 처리로직
			            // onDragEnd 이벤트 정의시 onDragEnd이벤트 동작
			            if (typeof options.onDragEnd == "function") {
			            	options.onDragEnd();
			            }
			        }, 400);
			    } else if (gcm.ext.splitClickCount === 2) {
			        clearTimeout(gcm.ext.splitSingleClickTimer);
			        gcm.ext.splitClickCount = 0;
			        // doubleClick 처리로직
//			        console.log("[spliter doubleClick]");
			        options.onDblClick();
			    }
			}
		}
		return Split(grpIdArr, splitOption);
	} catch (e) {
		console.error("[gcm.ext.setSplit] Exception :: " + e);
		return null;
	}
};

/**
 * Split onDblClick 옵션 설정시 gutter 더블 클릭이벤트 처리 (quick search 영역 접기 용도로 사용)
 *
 * @memberof gcm.ext
 * @param {Object} scopeScwin Scope scwin 객체
 * @param {Object} splitObj Split 객체
 * @param {Object} quickSrchId quick search 영역 Id
 */
gcm.ext.splitQuickSearchDblClick = function(scopeScwin, splitObj, quickSrchId) {
	try {
		if (splitObj.getSizes()[0] === 0) {
			// 접혀져 있는 경우 다시 펼침
			scopeScwin.$w.$("#" + quickSrchId).parent().parent().removeClass("fold");
			splitObj.setSizes(splitObj.beforeSizes);
		} else {
			// 가로 split 첫번째 영역 접기
			splitObj.beforeSizes = splitObj.getSizes();
			scopeScwin.$w.$("#" + quickSrchId).parent().parent().addClass("fold");
			splitObj.setSizes([0, 100]);
		}
	} catch (e) {
		console.error("[gcm.ext.splitQuickSearchDblClick] Exception :: " + e);
	}
};

gcm.clearPage = function(src) {
    console.log("### Call clearPage", "src: ["+ src +"]", "id: ["+ this.id +"]");
    // com.file.deleteWframe(this.id);
    // this : 삭제처리되기전의 wframe 객체.  src : 삭제 처리대상 wframe의 src
    // $p는 해당 이벤트가 발생하는 시점에서 이미 제거됨. 현재는 $p가 삭제되기 전에 발생하는 이벤트가 없는 상태  
}

gcm.attach = {
	  globalRaonkUploaderArr : []
//	, globalRaonkUploaderIdArr : []
}

/**
 * 브라우저 alert 재정의
 */
var alertNative = alert;

window.alert = function(msg) {
	gcm.pop.alert(scwin, msg, null, "browser");	
};

/**
 * polaris editor basePath 설정 
 */
if ('undefined' === typeof POLARIS ) {
	POLARIS = {};
}
POLARIS.basePath = "/cm/ext/polariseditor/";




/**
 *  통합검색 공통 모듈
 *
 * @param task : FIN_SLIP_TASK:결의, PUR_REQ_TASK:구매요구, CTR_DOME_TASK:국내출장, CTR_OVER_TASK:해외출장
 * @param dma : 데이터 맵
 * @param dmaParam : 데이터 맵 키
 * @param INTEGRATEDSEARCHEL : searchSection에 "INTEGRATEDSEARCHEL" id를 설정한다.
 * @param func : 통합검색 후 처리
 *
 * scwin.onpageload 페이지 로드시 아래와 같이 호출한다.
 * gcm.ext.insertIntegratedElement("CTR_DOME_TASK", dma_integrated, "req_no_list", INTEGRATEDSEARCHEL.id, scwin.integratedSearch_onclick)
 *
 * [ dataCollection ]
 * <w2:dataMap baseNode="map" id="dma_integrated">
 * 	<w2:keyInfo>
 *	 <w2:key id="text" name="검색어" dataType="text"></w2:key>
 *   <w2:key id="req_no_list" name="신청번호리스트" dataType="text"></w2:key>
 *	 <w2:key id="trip_knd" name="출장구분" dataType="text"></w2:key>
 *	 <w2:key id="biztrip_start_ymd" name="출발시간" dataType="text"></w2:key>
 *	 <w2:key id="biztrip_cls_ymd" name="도착시간" dataType="text"></w2:key>
 *  </w2:keyInfo>
 * </w2:dataMap>
 *
 * [ 버튼 삽입 ]
 * <xf:trigger class="btn search integrated-search-btn" id="integratedSearchBtn" style="width: 75px;" type="button" ev:onclick="integrated_SearchBtnOnclick">
 *  <xf:label><![CDATA[통합검색]]></xf:label>
 * </xf:trigger>
 *
 */
gcm.ext.insertIntegratedElement = function(task, dma, dmaParam, integratedSearchEl, func, serviceId) {

	let integratedSelectedValue = "";

	function insertAndExecuteScript(element, scriptText) {
	  const script = document.createElement('script');
	  script.textContent = scriptText;
	  element.appendChild(script);
	}

	function stringToHTMLAndScript(str) {
	  const wrapper = document.createElement('div');
	  wrapper.innerHTML = str.trim();
	  const scriptTag = wrapper.querySelector('script');
	  const scriptText = scriptTag ? scriptTag.textContent : '';
	  wrapper.removeChild(scriptTag);
	  return { html: wrapper.childNodes, scriptText };
	}


	// 통합검색
	scwin['integratedSearch_onclick_' + serviceId] = function(event) {
		// 검색어 세팅
        let inputElement = document.getElementById('integratedSearchInput-' + serviceId);
        let inputValue = inputElement.value;

		if(task == 'CTR_DOME_TASK' || task == 'CTR_OVER_TASK'){
			// 셀렉트 박스 구분값 세팅
	        let selectElement = document.getElementById('integratedTripType');
			let selectedValue = selectElement.value;

			com.search.execute((selectedValue == 'Dom') ? 'CTR_DOME_TASK' : 'CTR_OVER_TASK', inputValue, function(data) {
				if(data.length !== 1 && data[0] !== ''){
					dma.set(dmaParam, data.join(','));
					console.log(selectedValue);
					dma.set('trip_knd', selectedValue);
					(func)();
					console.log(data.join(','));
				}else{
					com.warn("결과가 없습니다.");
				}
	        });

		}else{

			com.search.execute(task, inputValue, function(data) {
				if(data.length !== 1 && data[0] !== ''){
					dma.set(dmaParam, data.join(','));
					(func)();
					console.log(data.join(','));
				}else{
					com.warn("결과가 없습니다.");
				}
	        });

		}


    }

    // 레이아웃 변수 INTEGRATEDSEARCHEL엘리먼트 최상단에 삽입된다.
	let commonCode = `
<style>
.integrated-search {display: none;width: 100%;height: 100%;position: absolute;left: 0;top:0;background-color: #cfd4dfeb;box-shadow: 0 0 5px rgba(0, 0, 0, 0.2);z-index: 10}
#integratedSearchInput-${serviceId} {padding: 5px;border: 1px solid #ccc;border-radius: 3px;outline: none;}
</style>

<div id="integratedSearch-${serviceId}" style="z-index: 10; width: 100%; height: 100%; top: 0px; left: 0px; align-items: center; justify-content: space-around;" class="w2group integrated-search">
    <div class="w2group" style="display: flex;width: 100%;height: 100%;justify-content: center;position: relative;align-items: center;">
    <div class="integrated-close-btn" style="background-image: url('/cm/images/thin_close_button.png');background-position: center;background-repeat: no-repeat;background-size: 54px;width: 60px;height: 100%;position: absolute;right: 0;cursor: pointer;"></div>`
if(task == 'CTR_DOME_TASK' || task == 'CTR_OVER_TASK'){
	commonCode += `
	    <select id="integratedTripType" style="height: 40px;">
		    <option value="Dom">국내출장</option>
		    <option value="Over">해외출장</option>
		</select>`
}
commonCode += `
      <input id="integratedSearchInput-${serviceId}" style="height: 40px;width: 400px;font-size: 2em;font-weight: bold;color: #606060;" class="w2input" type="text" title="검색어를 입력하세요" placeholder="검색어를 입력하세요" autocomplete="off" onkeydown="scwin.integratedSearch_onkeypress_${serviceId}(event)">
      <input type="button" style="height: 40px;width: 90px;font-size: 1.5em;" class="w2trigger btn search" value="조회" onclick="scwin.integratedSearch_onclick_${serviceId}(event)">
    </div>
</div>

<script>

    
    scwin['integrated_SearchBtnOnclick_${serviceId}'] = function(e) {
        // 바깥 영역 클릭 이벤트
        document.addEventListener('click', scwin.integrated_HandleClickOutside);
         // Escape 키 이벤트 리스너 등록
        document.addEventListener('keydown', scwin.integrated_HandleClickOutsideKeydown);
        const elements = document.querySelectorAll('.integrated-search');
		elements.forEach(element => {
		  	element.style.display = 'flex';
		});
        document.querySelector('#integratedSearchInput-${serviceId}').focus();
    };


    scwin.integrated_HandleClickOutside = function (event) {
    	var temp = event.target.classList;
        if (event.target.closest('.w2window_selected .integrated-search') == null && event.target.closest('.w2window_selected .integrated-search-btn') == null || event.target.classList[0] == 'integrated-close-btn') {
            const elements = document.querySelectorAll('.integrated-search');
			elements.forEach(element => {
			  	element.style.display = 'none';
			});
            document.removeEventListener('click', scwin.integrated_HandleClickOutside);
            document.removeEventListener('keydown', scwin.integrated_HandleClickOutsideKeydown);
        }
    }

    scwin.integrated_HandleClickOutsideKeydown = function (event) {
        if (event.key === 'Escape') {
	        const elements = document.querySelectorAll('.integrated-search');
			elements.forEach(element => {
			  	element.style.display = 'none';
			});
            document.removeEventListener('click', scwin.integrated_HandleClickOutside);
            document.removeEventListener('keydown', scwin.integrated_HandleClickOutsideKeydown);
        }
    }

    scwin['integratedSearch_onkeypress_${serviceId}'] = function(event) {
	    if(event.keyCode == 13){
	        scwin.integratedSearch_onclick_${serviceId}();
	    }
	};
</script>
	`;

	const { html: htmlObjects, scriptText } = stringToHTMLAndScript(commonCode);

	const searchSection = document.querySelector('#' + integratedSearchEl);
	if (searchSection) {
		for (const element of htmlObjects) {
		  searchSection.insertAdjacentElement('afterbegin', element);
		}
		insertAndExecuteScript(searchSection, scriptText);
	}

	const searchElements = document.querySelectorAll('.integrated-search-btn');
	searchElements.forEach(element => {
	  	element.addEventListener('click', (e) => scwin['integrated_SearchBtnOnclick_' + serviceId](e));
	});

	const closeElements = document.querySelectorAll('.integrated-close-btn');
	closeElements.forEach(element => {
	  	element.addEventListener('click', scwin.integrated_HandleClickOutside);
	});

}

var setIntervalProto 		= setInterval;
var clearIntervalProto 	= clearInterval;

window.setInterval = function(intervalFunc, delay = 0, ...augs) {
	var intervalFuncString = intervalFunc.toString();
	var intervalId = setIntervalProto(intervalFunc, delay, ...augs);

	if (!(/(apply\(.*\)|call\(.*\)|e\(\))/.test(intervalFuncString))) {
		gcm.INTERVAL_ARRAY.push(intervalId);
	}
	
	return intervalId;
};


window.clearInterval = function(intervalId) {
	let findIndex = gcm.INTERVAL_ARRAY.findIndex((id) => {
		return id === intervalId
	});
	
	if (findIndex > -1) {
		gcm.INTERVAL_ARRAY.pop(findIndex);
	}
	
	return clearIntervalProto(intervalId);
};