// =============================================================================
/**
 * @description 각 WFrame Scope별로 공유되는 Scope 전역 변수와 공통 함수를 작성한다.

1. com 및 하위 객체(ex. com.cmn, com.fwd, ..)는 WFrame Scope 업무 개발자가 호출해야할 공통 함수만을 정의한다.
2. com 및 하위 객체는 WFrame Scope 별로 생성되기 때문에 com 객체 내에 정의된 함수에서의 선언된 scwin 및 $p 객체는
  해당 함수를 호출한 화면의 WFrame Scope 내의 scwin 및 $p를 참조하게 된다.
3. com 및 하위 객체는 반드시 Empty Object 형태로 선언해야 한다.
4. Scope별로 생성되는 com 및 하위 객체에 데이터 저장을 위해서 변수(int, string, object, array)를 생성해야할 경우
   객체 선언 시 변수를 생성하지 말고, com 및 com 하위 객체에 선언된 함수 스크립트에서 생성해야 한다.

   // 잘못된 사용 예제
   com.str = { test : 1 };

   // 올바른 사용 예제
   com.str.init = function() {
	   com.str.test = 1;
   };
 * @namespace com
 * @author Inswave Systems
 * @date 2021.08.05
 */
// =============================================================================

var com = {};

// =============================================================================
/**
 * 통신 함수(submission 또는 ajax 통신)를 작성한다.
 * 주로 gcm.sbm 함수 호출
 */
 // =============================================================================

/**
 * 서버 통신 확장 모듈, Submission를 실행한다.
 *
 * @param {Object} sbmObj submission 객체
 * @param {Object} option 옵션 객체
 * @param {Function} option.successCallback 성공 콜백 함수 (처리결과가 성공인 경우 수행, responseJSON.head.rsMsg.statusCode == "S"인 경우)
 * @param {Function} option.exceptionCallback 실패 콜백 함수 (처리결과가 성공이 아닌 경우 수행, 미지정시 공통 콜백에서 alert함)  
 * @param {String} option.processMsg 처리중 메시지 내용 (processMsg를 생략하고 싶은 경우 빈 문자열 ""로 셋팅)
 * @param {Object} option.requestData 요청 데이터로 submission에 등록된 ref를 무시하고 현재의 값이 할당된다.
 * @param {Object} option.compObj 전송중 disable시킬 컴포넌트
 * @param {Object} option.isFileUpload 첨부파일 업로드와 함께 처리 여부 
 * @example
	com.execute(sbm_login, {
		successCallback : function(e) {
			// 로그인 성공 콜백
		},
		exceptionCallback : function(e) {
			// 로그인 실패 콜백
		},
	});
	
	// processMsg 안보이게 하는 옵션
	com.execute(sbm_sel, {processMsg : ""}); 
 */
com.execute = async function(sbmObj, option) {
	return await gcm.sbm.execute(scwin, sbmObj, option);
};

/**
 * Submission를 동적으로 생성해서 실행한다.
 *
 * @param {Object} sbmOption Submission 생성 옵션 JSON 객체
 * @param {String} sbmOption.id submission 객체의 ID. 통신 모듈 실행 시 필요.
 * @param {String} sbmOption.ref 서버로 보낼(request) DataCollection의 조건 표현식.(조건에 때라 표현식이 복잡하다) 또는 Instance Data의 XPath.
 * @param {String} sbmOption.target 서버로 응답(response) 받은 데이터가 위치 할 DataCollection의 조건 표현식. 또는 Instance Data의 XPath.
 * @param {String} sbmOption.action 통신 할 서버 측 URI.(브라우저 보안 정책으로 crossDomain은 지원되지 않는다.)
 * @param {Function} sbmOption.submitDoneHandler {script type="javascript" ev:event="xforms-submit-done"} 에 대응하는 함수
 * @param {Object} option execute 함수 실행 옵션 JSON 객체 (com.execute 함수 option 참조)
 * @example
	var sbmOption = {
		  id : "sbm_searchCodeGrp"
		 ,action : "serviceid=CD0001&action=R"
		 ,target : 'data:json,{"id":"dlt_codeGrp","key":"data"}'
		 ,submitDoneHandler : scwin.searchCodeGrpCallback
	};
	com.executeDynamic(sbmOption);
 */
com.executeDynamic = async function(sbmOption, option) {
	return await gcm.sbm.executeDynamic(scwin, sbmOption, option);
};

/**
 * workflow를 실행한다.
 *
 * @param {Object} workflowObj workflow 객체
 * @example
	com.executeWorkflow(wkf_basicInfo);
 */
com.executeWorkflow = function(workflowObj) {
	gcm.sbm.executeWorkflow(scwin, workflowObj);
};

/**
 * Submission 객체를 동적으로 생성한다.
 *
 * @param {Object} options Submission 생성 옵션 JSON 객체
 * @param {String} options.id submission 객체의 ID. 통신 모듈 실행 시 필요.
 * @param {String} options.ref 서버로 보낼(request) DataCollection의 조건 표현식.(조건에 때라 표현식이 복잡하다) 또는 Instance Data의 XPath.
 * @param {String} options.target 서버로 응답(response) 받은 데이터가 위치 할 DataCollection의 조건 표현식. 또는 Instance Data의 XPath.
 * @param {String} options.action 통신 할 서버 측 URI.(브라우저 보안 정책으로 crossDomain은 지원되지 않는다.)
 * @param {String} options.processMsg [Default : 공통 설정값(로딩중 입니다...)] 처리중 메시지 내용 (처리중 이미지를 보이고 싶지 않은 경우 빈 문자열 ""로 셋팅)
 * @param {Function} options.submitDoneHandler {script type="javascript" ev:event="xforms-submit-done"} 에 대응하는 함수
 * @example
	var searchCodeGrpOption = {
		  id : "sbm_searchCodeGrp"
		 ,action : "serviceid=CD0001&action=R"
		 ,target : 'data:json,{"id":"dlt_codeGrp","key":"data"}'
		 ,submitDoneHandler : scwin.searchCodeGrpCallback
	};
	com.create(options);
 */
com.create = function(options) {
	gcm.sbm.create(scwin, options);
};
	
/**
 * response 의 elHeader 정보를 가져온다.
 *
 * @param {Object} e submission submitdone 이벤트의 e 객체
 * @example
	com.getElHeader(e);
 */
com.getElHeader = function(e) {
	return gcm.sbm.getElHeader(e);
};

/**
 * response 의 resCode 정보를 가져온다.
 *
 * @param {Object} e submission submitdone 이벤트의 e 객체
 * @example
	com.getResCode(e);
 */
com.getResCode = function(e) {
	return gcm.sbm.getResCode(e);
};

/**
 * response 의 resMsg 정보를 가져온다.
 *
 * @param {Object} e submission submitdone 이벤트의 e 객체
 * @example
	com.getResMsg(e);
 */
com.getResMsg = function(e) {
	return gcm.sbm.getResMsg(e);
};

/**
 * response 의 elData 정보를 가져온다.
 *
 * @param {Object} e submission submitdone 이벤트의 e 객체
 * @example
	com.getElHeader(e);
 */
com.getElData = function(e) {
	return gcm.sbm.getElData(e);
};

// =============================================================================
/**
 * 데이터 유효성 검사 함수를 작성한다.
 * 주로 gcm.valid 함수 호출
 */
// =============================================================================

/**
 * 그룹안에 포함된 컴포넌트의 입력 값에 대한 유효성을 설정한다.
 * ( 컴포넌트의 유효성 관련 속성과, valInfoArr 유효성 옵션을 동기화 한다. 둘 다 설정되어 있으면 valInfoArr가 적용된다. )
 *
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
 * @example
	com.setValidGroup(grp_sample, [  
		 { id : "key1", mandatory : true }
		,{ id : "key2", mandatory : true, label : "L001" }
		,{ id : "key3", minLength : 2 }
		,{ id : "key4", minByteLength : 6 }
		,{ id : "key5", maxLength : 4 }
		,{ id : "key6", maxByteLength : 6 }
		,{ id : "key7", allowChar : "a-zA-Z0-9" }
		,{ id : "key8", allowChar : "ㄱ-힣" }
		,{ id : "key9", ignoreChar : "!@#$%^&*()" }
		,{ id : "key10", isPhone : true, allowChar : "0-9" }
		,{ id : "key11", isEmail : true, allowChar : "a-zA-Z0-9@." }
		,{ id : "key12", valFunc : function(value) {
			if (!com.isEmpty(value) && Number(value) < 50) {
				return "값이 50이상이어야 합니다.";
			}
		}, allowChar : "0-9"}
		,{ id : "key13", maxLength : 4 }
		,{ id : "key15", allowChar : "a-zA-Z0-9" }
		,{ id : "key14", ignoreChar : "!@#$%^&*()" }
		,{ id : "popS", mandatory : true}
	]);
 */
com.setValidGroup = function (groupObj, valInfoArr) {
	gcm.valid.setValidGroup(groupObj, valInfoArr);
};

/**
 * 그룹안에 포함된 컴포넌트의 입력 값에 대해 gcm.valid.setValidGroup의 설정값 기준으로 유효성을 검사한다. 
 *
 * @param {Object} groupObj 그룹 컴포넌트 객체
 * @param {Object} option 옵션 객체
 * @param {String} option.tacObj 그리드가 포함된 TabControl 컴포넌트 객체
 * @param {String} option.tabId 그리드가 포함된 TabControl 컴포넌트의 Tab 아이디
 * @returns {Boolean} 유효성 검사 결과
 * @example
	if (com.validateGroup(grp_sample)) {
		com.alert("모두 유효함.");
	}
 */
com.validateGroup = function (groupObj, option) {
	option = option || {};
	return gcm.valid.validateGroup(groupObj, option.tacObj, option.tabId);
};


/**
 * dataCollection 값에 대해 valInfoArr 의 설정값 기준으로 유효성을 검사한다. 
 * 
 * 파라미터가 배열 객체로 전달되는 경우
 * @param {Boolean} targets[].groupObj 그룹 컴포넌트 객체
 * @param {Boolean} targets[].valInfoArr 유효성 검사 옵션
 * @param {Boolean} targets[].isCheckModified [Default : true] false로 설정시 변경여부 체크하지 않음
 * 
 * 파라미터가 객체로 전달되는 경우 
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
 * @param {Boolean} isCheckModified [Default : true] false로 설정시 변경여부 체크하지 않음
 * 
 * @returns {Boolean} 유효성 검사 결과
 * @example
	com.validateData(grp_sample, [  
		 { id : "key1", mandatory : true }
		,{ id : "key2", mandatory : true, label : "L001" }
		,{ id : "key3", minLength : 2 }
		,{ id : "key4", minByteLength : 6 }
		,{ id : "key5", maxLength : 4 }
		,{ id : "key6", maxByteLength : 6 }
		,{ id : "key7", allowChar : "a-zA-Z0-9" }
		,{ id : "key8", allowChar : "ㄱ-힣" }
		,{ id : "key9", ignoreChar : "!@#$%^&*()" }
		,{ id : "key10", isPhone : true, allowChar : "0-9" }
		,{ id : "key11", isEmail : true, allowChar : "a-zA-Z0-9@." }
		,{ id : "key12", valFunc : function(value) {
			if (!com.isEmpty(value) && Number(value) < 50) {
				return "값이 50이상이어야 합니다."; 
			}
		}, allowChar : "0-9"}
		,{ id : "key13", maxLength : 4 }
		,{ id : "key15", allowChar : "a-zA-Z0-9" }
		,{ id : "key14", ignoreChar : "!@#$%^&*()" }
		,{ id : "popS", mandatory : true}
	]);
 */
com.validateData = function (dataObj, valInfoArr, isCheckModified) {
	var targets = [];
	if (dataObj instanceof Array){
		targets = dataObj;
	} else {
		// 파라미터가 객체로 전달되는 경우 배열로 래핑하여 아래 로직을 공통으로 태운다.
		targets.push({dataObj: dataObj, valInfoArr: valInfoArr, isCheckModified: isCheckModified});
	}

	return targets.every( function (target){
		target.valInfoArr = target.valInfoArr || {};
		if ('undefined' === typeof target.isCheckModified) {
			target.isCheckModified = true;
		}
		return gcm.valid.validateData(target.dataObj, target.valInfoArr, target.isCheckModified);
	});
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
 * @example
	com.setValidGrid(grd_sample, [
		 { id : "col1", mandatory : true }
		,{ id : "col2", mandatory : true, label : "L001" }
		,{ id : "col3", minLength : 2 }
		,{ id : "col4", minByteLength : 6 }
		,{ id : "col5", maxLength : 4 }
		,{ id : "col6", maxByteLength : 6 }
		,{ id : "col7", allowChar : "a-zA-Z0-9" }
		,{ id : "col8", allowChar : "ㄱ-힣" }
		,{ id : "col9", ignoreChar : "!@#$%^&*()" }
		,{ id : "col10", isPhone : true, allowChar : "0-9" }
		,{ id : "col11", isEmail : true, allowChar : "a-zA-Z0-9@." }
		,{ id : "col12", valFunc : function(value) {
			if (!com.isEmpty(value) && Number(value) < 50) {
				return "값이 50이상이어야 합니다.";
			}
		}, allowChar : "0-9"}
	]);
 */
com.setValidGrid = function (gridObj, valInfoArr) {
	gcm.valid.setValidGrid(gridObj, valInfoArr);
};

/**
 * GridView를 통해서 입력된 데이터에 대해서 gcm.valid.setValidGrid의 설정값 기준으로 유효성을 검사한다. 
 *
 * @param {Object} gridObj GridView 객체
 * @param {Object} option 옵션 객체
 * @param {String} option.tacObj 그리드가 포함된 TabControl 컴포넌트 객체
 * @param {String} option.tabId 그리드가 포함된 TabControl 컴포넌트의 Tab 아이디
 * @param {Boolean} option.isCheckModified [Default : false] true로 설정시 변경여부 체크
 * @returns {Boolean} 유효성검사 결과
 * @example
	if (com.validateGrid(grd_sample)) {
		com.alert("모두 유효함.");
	}
	if (com.validateGrid(grd_sample, {isCheckModified : false})) {
		com.alert("모두 유효함.");
	}
	if (com.validateGrid(grd_sample, {tabObj : tac_sample, tabId : "tab2"})) {
		com.alert("모두 유효함.");
	}
 */
com.validateGrid = function (gridObj, valInfoArr, option) {
	option = option || {};
	return gcm.valid.validateGrid(gridObj, valInfoArr, option.tacObj, option.tabId, option.isCheckModified);
};

/**
 * DataCollection 객체의 변경된 데이터가 있는지 검사한다.
 *
 * @param {Object} dcObjArr DataCollection 또는 배열
 * @returns {Boolean} 검사결과 (true or false)
 * @example
	if (com.validateGrid(grd_indexPage, valInfo) && com.isModified(dlt_grdAllData)) {
		com.confirm("저장하시겠습니까?", "scwin.saveData");
	};
 */
com.isModified = function (dcObjArr) {
	return gcm.valid.isModified(dcObjArr);
};

/**
 * DataCollection 객체와 첨부파일 객체의 데이터가 변경되지 않았는지 여부를 검사한다. com.isNotModifiedByDataAndAttach
 *
 * @param {Object} dcObjArr DataCollection 또는 배열
 * @returns {Boolean} 검사결과 (true or false)
 * @see /BizWebApp/src/main/webapp/ui/zam/sample/crudOnePop.xml
 * @example
	if (com.isNotModifiedByDataAndAttach(dlt_grdAllData, com.file)) {
		com.confirm("저장하시겠습니까?", "scwin.saveData");
	};
 */
com.isNotModifiedByDataAndAttach = function (dcObjArr, attach) {
	return (dcObjArr.get("rowStatus") == "U" && !com.isModified(dcObjArr)) && attach.isUploadedComplete();
};
  
/**
 * 한글 입력 방지
 * inputBox의 onkeydown 이벤트에 설정
 * gridView의 oneditkeydown 이벤트에서 호출 
 *
 * @param {Object}	e 이벤트 객체 
 * @example
	<xf:input ... ev:onkeydown="com.keydownIgnoreHan"></xf:input>
	
	scwin.grd_sample_oneditkeydown = function(info) {
	    if (info.colID == "col1") {
		    com.keydownIgnoreHan();
		}	
	};
 */
com.keydownIgnoreHan = function(e) {
	try {
		if (typeof e != "object") {
			// gridView의 oneditkeydown 이벤트에서 호출한 경우
			com.keydownIgnoreHan.call($w.comp[event.target.id], event); 
			return;
		}
	    $p.setTimeout(function() {
			var val = this.getValue();
			this.setValue(val.replace( /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/g, '' ));
	    }.bind(this), {key: "ignoreHanTimer"});
	} catch (e) {
		console.error("[com.keydownIgnoreHan] Exception :: " + e);
	} 
};

//=============================================================================
/**
 * 그리드 편집 관련 함수를 작성한다.
 * 주로 gcm.grid 함수 호출
 */
//=============================================================================

/**
 * GridView와 바인딩된 DataList 객체를 반환한다.
 *
 * @param {Object} gridObj 바인딩 된 DataList가 존재하는지 검증할 GridView 객체
 * @return {Object} 바인딩 된 DataList 객체 반환 (바인된 객체가 없을 경우 null 반환)
 * @example
	com.getGridDataList(grd_First);
 */
com.getGridDataList = function (gridObj) {
	return gcm.grid.getGridDataList(gridObj);
};

/**
 * 지정한 GridView의 맨 아래에 행을 추가한다.
 * 여러줄을 copy&paste 하는 걸 고려해서 맨 위에 행추가 하지 않는다. 
 *
 * @param {Object} gridObj GridView 객체
 * @param {String} focusColId 포커싱할 컬럼 ID
 * @param {Object} option 행추가 옵션
 * @param {Boolean} option.readOnly 다건 CUD시 행추가 후 포커싱할 컬럼의 readOnly 속성 (false시 수정 가능)
 * @param {Boolean} option.readOnlyFalseCols 다건 CUD시 readOnly=false를 추가로 적용할 컬럼 ID
 * @param {Boolean} option.checkModified 단건 CUD시 행추가 하기 전에 변경중인 정보가 있는지 체크 (true시 변경건이 있으면 행 추가 안함)
 * @return {Number} 추가된 rowIndex (null이면 추가 안된 경우)
 * @example
	//맨 아래에 행추가 하고 msgId 컬럼 포커싱
	com.addRow(grd_sample, "msgId"); 
 */
com.addRow = function(gridObj, focusColId, option) {
	return gcm.grid.addRow(scwin, gridObj, focusColId, option);
};

/**
 * 지정한 GridView에 선택컬럼(chk)이 체크된 Row들의 내용으로 맨아래에 추가한다.
 * 여러줄을 copy&paste 하는 걸 고려해서 맨 위에 행추가 하지 않는다. 
 * 
 * @param {Object} gridObj GridView 객체
 * @param {String} focusColId 포커싱할 컬럼 ID
 * @param {Object} option 행복사 옵션
 * @param {Boolean} option.readOnly 다건 CUD시 행복사 후 포커스 컬럼의 readOnly 속성 (false시 수정 가능)
 * @param {Boolean} option.readOnlyFalseCols 다건 CUD시 readOnly=false를 추가로 적용할 컬럼 ID
 * @param {Boolean} option.checkModified 단건 CUD시 행복사 하기 전에 변경중인 정보가 있는지 체크 (true시 변경건이 있으면 행 추가 안함)
 * @return {Array} 추가된 rowIndex 배열(null이면 복사 안된 경우)
 * @example
	//마지막 행에 추가하고 msgId 컬럼 포커싱
	com.copyRow(grd_sample, "msgId"); 
 */
com.copyRow = function(gridObj, focusColId, option) {
	return gcm.grid.copyRow(scwin, gridObj, focusColId, option);
};

/**
 * 지정한 GridView에 선택컬럼(chk)이 체크된 Row들을 삭제(Delete) 처리한다.
 *
 * @param {Object} gridObj GridView 객체
 * @example
	com.deleteRow(grd_sample);
 */
com.deleteRow = function(gridObj) {
	gcm.grid.deleteRow(scwin, gridObj);
};

/**
 * 지정한 GridView에 선택컬럼(chk)이 체크된 Row들을 취소(Undo) 처리한다.
 *
 * @param {Object} gridObj GridView 객체
 * @example
	com.undoRow(grd_sample);
 */
com.undoRow = function(gridObj) {
	gcm.grid.undoRow(scwin, gridObj);
};

/**
 * 전체 데이터를 초기 설정 된 데이터(originalData)로 바꾸고 행의 상태를 초기화(R) 시킨다.
 * 초기 설정 된 데이터 란 setJSON, setXML 등과 같은 API들을 통해 설정 된 데이터가 이에 속한다.
 * 추가(C)된 행은 제거한다
 *
 * @param {Object} gridObj GridView 객체
 * @example
	com.undoAll(grd_sample);
 */
com.undoAll = function(gridObj) {
	gcm.grid.undoAll(scwin, gridObj);
};

/**
 * 그리드 높이 늘이기
 *
 * @param {Object} groupObj 그리드를 감싼 gvwbox class가 적용된 Group 객체
 * @param {Number} offset [Default : 50] 늘리려는 수치
 * @example
	com.expandGrid(grp_test);
 */
com.expandGrid = function (groupObj, offset) {
	gcm.grid.expandGrid(groupObj, offset);
};

/**
 * 그리드 높이 줄이기
 *
 * @param {Object} groupObj 리드를 감싼 gvwbox class가 적용된 Group 객체
 * @param {Number} offset [Default : 50] 줄이려는 수치
 * @example
	com.reduceGrid(grp_test);
 */
com.reduceGrid = function (groupObj, offset) {
	gcm.grid.reduceGrid(groupObj, offset);
};

/**
 * 그리드 포커스 정보 저장 (조회 후 그리스 포커스 셋팅을 위함)
 *
 * @param {Object} gridObj GridView 객체
 * @param {Number} rowIdx focus row index (미지정시 현재 포커스 위치 저장)
 */
com.setFocusRow = function (gridObj, rowIdx) {
	gcm.grid.setFocusRow(gridObj, rowIdx);
};

/**
 * 조회 후 총 건수 및 그리드 포커스 셋팅
 *
 * @param {Object} gridObj GridView 객체
 * @param {Object} option 옵션 객체
 * @param {Object} option.tcntObj 총건수를 셋팅할 객체
 * @param {String} option.focusColId 포커싱 할 컬럼 ID
 * @example
	// 총건수 셋팅
	com.setGridAfterSearch(grd_detail, { tcntObj : spa_tcntD });
	// 총건수 및 포커스 셋팅
	com.setGridAfterSearch(grd_master, { tcntObj : spa_tcnt, focusColId : "group_cd" }) 
 */
com.setGridAfterSearch = function (gridObj, option) {
	gcm.grid.setGridAfterSearch(gridObj, option);
};

/**
 * 그리드에 단건 CUD 구현시 행변경 체크 여부
 *
 * @param {Object} gridObj GridView 객체
 * @param {Object} info GridView에 바인딩된 dataList의 onbeforerowpositionchange 이벤트 파라미터
 * @return {Boolean} true이면 행변경 전 체크 필요, false이면 행변경 전 체크 필요 없음
 * @example
	scwin.dlt_master_onbeforerowpositionchange = function(info) {
		// 행 변경 체크 상황인 경우 
		if (com.checkRowChange(grd_master, info)) {
			// 변경 중인 정보가 있으면 행변경 불가
			if (dlt_master.getRowStatus(info.oldRowIndex) != "R" || com.isModified(dlt_detail)) {
				com.alertW("변경 중인 정보를 먼저 저장 또는 취소해야 합니다.");
				return false;
			}
		}
	};
 */
com.checkRowChange = function (gridObj, info) {
	return gcm.grid.checkRowChange(gridObj, info);
};

//=============================================================================
/**
 * 페이징 관련 함수를 작성한다.
 * 주로 gcm.page 함수 호출
 */
//=============================================================================

/**
 * 페이지당 건수 공통 셋팅
 *
 * @param {Object}	sbxPageUnitObj page당 건수를 보여줄 selectbox 객체
 * @param {String}	ref page당 건수를 담을 dataMap의 Key (ex. dma_search.pageUnit)
 * @example
	com.setPageUnit(sbx_pageUnit, "dma_search.pageUnit");
 */
com.setPageUnit = function (sbxPageUnitObj, ref) {
	gcm.page.setPageUnit(sbxPageUnitObj, ref);
};

/**
 * 페이징 조회
 *
 * @param {Number|String} page 페이지 번호(1) 또는 다음페이지 "next" 
 * @param {Object} sbmObj submission 객체 
 * @param {Object} dmaPagingObj paging 정보를 담는 dataMap 객체 
 * @param {Object} dltObj 조회 결과를 담는 dataList 객체 
 * @example
	com.pagingExecute(page, sbm_inqClasPagedList, dma_paging, dlt_sample);
*/
com.pagingExecute = function (page, sbmObj, dmaPagingObj, dltObj) {
	gcm.page.pagingExecute(page, sbmObj, dmaPagingObj, dltObj);
};

/**
 * 조회 결과에 따른 페이지 정보 셋팅
 *
 * @param {Object}   e			조회 콜백 파라미터 (내부에 paginate 정보가 들어있음)
 * @param {Object}   gridObj	페이징 하려는 GridView 객체
 * @param {Object}   cntObj		조회 건수 출력할 TextBox 객체
 * @param {Object}   tcntObj	전체 건수 출력할 TextBox 객체
 * @param {Object}   pglObj		PageList 객체 (ScrollEnd 방식인 경우 null)
 * @param {Object}   dmaObj		pageNo(페이지 번호), pageUnit(페이지당 건수)가 담긴 dataMap 객체
 * @example
	com.setPage(e, grd_sample, tbx_cnt, tbx_tcnt, pgl_list, dma_search);
 */
com.setPage = function(e, gridObj, cntObj, tcntObj, pglObj, dmaObj) {
	gcm.page.setPage(e, gridObj, cntObj, tcntObj, pglObj, dmaObj);
};

//=============================================================================
/**
 * 엑셀 다운로드 및 업로드 함수를 작성한다.
 * 주로 gcm.xls 함수 호출
 */
//=============================================================================

/**
 * 설정된 옵션으로 그리드의 내용을 엑셀로 다운로드 한다.
 *
 * @param {Object}	gridObj GridView 객체
 * @param {Object}	options GridView의 advancedExcelDownload 함수의 options 참조
 * @param {Array}	infoArr	GridView의 advancedExcelDownload 함수의 infoArr 참조
 * @example
	var option = {
			  fileName : "data.xlsx"
			, removeColumns : "0,1"
	};
	com.downloadGridViewExcel(grd_sample, option);
 */
com.downloadGridExcel = function(gridObj, options, infoArr) {
	gcm.xls.downloadGridExcel(gridObj, options, infoArr);
};

/**
 * 설정된 옵션으로 그리드의 헤더만 엑셀로 다운로드 한다.
 *
 * @param {Object}	gridObj GridView 객체
 * @param {Object}	options GridView의 advancedExcelUpload 함수의 options 참조
 * @example
	var option = {
			  fileName : "header.xlsx"
	};
	com.downloadGridHeader(grd_sample, option);
 */
com.downloadGridHeader = function(gridObj, options) {
	gcm.xls.downloadGridHeader(gridObj, options);
};

/**
 * 엑셀 양식 파일을 다운로드 한다.
 *
 * @param {String}	fileUrl 엑셀 양식 파일 경로 (웹루트 이하 절대경로)
 * @example
	com.downloadExcelForm("/ui/sample/excelGridHeader.xlsx");
 */
com.downloadExcelForm = function(fileUrl) {
	gcm.xls.downloadExcelForm(fileUrl);
};

/**
 * 설정된 옵션으로 엑셀을 그리드에 업로드 한다.
 *
 * @param {Object}	gridObj GridView 객체
 * @param {Object}	options GridView의 advancedExcelUpload 함수의 options 참조
 * @example
	var option = {
			  fileName : "data.xlsx"
			, removeColumns : "0,1"
	};
	com.uploadGridExcel(grd_sample, option);
 */
com.uploadGridExcel = function(gridObj, options) {
	gcm.xls.uploadGridExcel(gridObj, options);
};

//=============================================================================
/**
 * 다국어를 고려한 메시지 및 레이블 관련 함수를 작성한다.
 * 주로 gcm.lang 함수 호출
 */
//=============================================================================

/**
 * 레이블 코드로 다국어 label명 조회
 *
 * @param {String} lblCd 레이블 코드
 * @return 레이블명
 * @example
	com.getLabel("L001");
 */
com.getLabel = function(lblCd) {
	return gcm.lang.getLabel(lblCd);
};

/**
 * 공통 메시지에 코드에 해당하는 공통 메시지 코드를 반환한다.
 *
 * @param {String} sysMsgId 메시지 ID , Array 형식인 경우는 첫번째 인덱스가 sysMsgId가 되고 두번째 인덱스부터 치환문자가 됨
 * @param {String} arguments 메시지 치환 문자열 (메시지 ID에서 치환이 필요한 만큼 문자열 매개변수를 전달함)
 * @example
	com.getMsg("E100"); // "사용자 정보가 존재하지 않습니다."
	com.getMsg("E104","jpg","zip"); // "허용(jpg)되지 않은 첨부파일(zip) 형식입니다."
 */
com.getMsg = function(msgId) {
	try {
		var message = ""
		if (gcm.util.isEmpty(msgId) === false) {
			message = gcm.lang.getMessage(msgId);
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
		console.error("[com.getMsg] Exception :: " + e);
		return "";
	}
};

//=============================================================================
/**
 * 공통 코드관련 함수를 작성한다.
 * 주로 gcm.cd 함수 호출
 */
// =============================================================================

/**
 * 코드성 데이터와 컴포넌트의 nodeSet(아이템 리스트)연동 기능을 제공한다.
 * cdGrp별로 JSON객체를 생성하여 array에 담아 첫번째 파라메터로 넘겨준다.
 *
 * @param {Object} codeOptions {"code" : "코드그룹", "compID" : "적용할 컴포넌트명", "useYn" : "Y"}
 * @param {Function} callbackFunc 콜백 함수
 * @example
var codeOptions = [ { code : "M001", compID :"sbx_a, ccb_a, acb_a, cbx_a, rad_a, sbx_step1, grd_sample:sbx, grd_sample:ccb, grd_sample:acb, grd_sample:step1, sbx_srch, ccb_srch, acb_srch, sbx_inpt, ccb_inpt, acb_inpt, sbx_srch2, sbx_inpt2, ccb_srch2, ccb_inpt2" } //useYn이 'N'인 항목은 재선택 불가
				  ,	{ code : "M001", compID :"sbx_all, cbx_all, grd_sample:sbx_all", ignoreUseYn : true } //useYn에 관계없이 모든 항목 재선택 가능
				  ,	{ code : "M001", compID :"cbx_y, rad_y, grd_sample:sbx_y", filter : "useYn == 'Y'" } //useYn이 'Y'인 항목만 노출
				  ,	{ code : "M002", compID :"sbx_step2", filter : "upprDtlCd == ref ('data:dma_sample.step1')" } // 다단콤보 
				  ,	{ code : "M001", compID :"sbx_addAllCd, grd_sample:addAllCd", addAllCd : "*|ALL" } //전체(*) 코드 추가
				  ,	{ code : "M001", compID :"ccb_addNullCd, grd_sample:addNullCd", addNullCd : "null|NULL" } //선택값 없음(null) 코드 추가
];
com.setCmnCd(codeOptions, function() {
	// 공통코드 셋팅 콜백에서 초기값 셋팅
});
 */
com.setCmnCd = async function(codeOptions, callbackFunc) {
	return await gcm.cd.setCmnCd(scwin, codeOptions, callbackFunc);
};

/**
 * 공통코드 팝업 셋팅
 *
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
com.setCmnCdPop = function(grpCd, wfmObj, option) {
	gcm.cd.setCmnCdPop(scwin, grpCd, wfmObj, option);
};

/**
 * 공통코드 팝업
 *
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
com.openCmnCdPop = function(grpCd, option) {
	gcm.cd.openCmnCdPop(scwin, grpCd, option);
};

com.getCmnCd = async function(grpCdArr, callbackFunc) {
	return await gcm.cd.getCmnCd(scwin, grpCdArr, callbackFunc);
}

//=============================================================================
/**
 * 팝업 관련 함수를 작성한다.
 * 주로 gcm.pop 함수 호출
 */
// =============================================================================

/**
 * Alert 메시지 창을 호출한다.
 *
 * @param {String} msg 메시지코드 또는 메시지 문자열
 * @param {Function} closeCallback 콜백 함수
 * @example
	// 메시지 코드를 넣으면 메시지로 변경하여 보여줌
	com.alert("message.xom.wq.004", function() {
		// alert 콜백
		console.log("info");
	});
	
	// 메시지에 치환값이 있는 경우 com.getMsg 함수 사용
	com.warn(com.getMsg("message.xom.wq.002", "6000"), function() {
		// alert 콜백
		console.log("warning");
	});
	
	// 일반 문자열을 넣으면 그대로 보여줌 (줄바꿈은 \n)
	com.error("시스템 오류입니다.\n관리자에게 문의바랍니다.", function() {
		// alert 콜백
		console.log("error");
	});
 */
com.alert = async function(msg, closeCallback) {
	return await gcm.pop.alert(scwin, msg, closeCallback);
};
com.warn = async function(msg, closeCallback) {
	return await gcm.pop.warn(scwin, msg, closeCallback);
};
com.error = async function(msg, closeCallback) {
	return await gcm.pop.error(scwin, msg, closeCallback);
};

com.alert = async function(msg, closeCallback, isNotEscape) {
	return await gcm.pop.alert(scwin, msg, closeCallback, null, isNotEscape);
};

/**
 * Confirm 메시지 창을 호출한다.
 *
 * @param {String} msg 메시지코드 또는 메시지 문자열
 * @param {Function} closeCallback 콜백 함수
 * @param {String} popupName 팝업 타이틀 (기본값 : "Confirm")
 * @example
	com.confirm("message.xom.wq.018", function(ret) {
		// confirm 콜백
		if (ret) {
			console.log("OK");
		} else {
			console.log("Cancel");
		}
	});
 */
com.confirm = async function(msg, closeCallback, popupName, btnLab) {
	return await gcm.pop.confirm(scwin, msg, closeCallback, popupName, btnLab);
};

/**
 * 팝업창을 연다.
 *
 * @param {String} url url 화면경로
 * @param {Array} options Popup창 옵션
 * @param {String} [options.id] Popup창 아이디
 * @param {String} [options.type] 화면 오픈 타입 ("iframePopup", "wframePopup", "browserPopup")
 * @param {String} [options.width] Popup창 넓이
 * @param {String} [options.height] Popup창 높이
 * @param {String} [options.popupName] useIframe : true시 popup 객체의 이름으로 popup 프레임의 표시줄에 나타난다.
 * @param {String} [options.useIFrame] [default : false] true : IFrame 을 사용하는 WebSquare popup / false: window.open 을 사용하는 popup
 * @param {String} [options.style] Popup의 스타일을 지정한다. 값이 있으면 left top width height는 적용되지 않는다.
 * @param {String} [options.resizable] [default : false]
 * @param {String} [options.modal] [default : false]
 * @param {String} [options.scrollbars] [default : false]
 * @param {String} [options.title] [default : false]
 * @param {String} [options.notMinSize] [default : false]
 * @example
var data = { msg : ibx_alertSend.getValue() };
var options = {
	id : "wframePopModal",
	popupName : "샘플 팝업",
	width : 400, height: 250
};
com.openPopup("/ui/sample/paramPop.xml", options, data, function(retObj) {
	// 팝업 콜백
	ibx_alertReceive.setValue( retObj.retValue );
});
 */
com.openPopup = async function(url, opt, data, callbackFn) {
	return await gcm.pop.openPopup(scwin, url, opt, data, callbackFn);
};

/**
 * 팝업창을 닫는다.
 *
 * @param {String} popId popup창 id로 값이 없을 경우 현재창의 아이디
 * @param {String|Object} 부모 창에 전달한 데이터
 * @example
// 리턴값을 전달하면 콜백 함수 실행 후, 팝업창을 닫는다.
com.closePopup({"retValue" : ibx_confirmSend.getValue()});
// 리턴값이 없으면 콜백 함수를 실행하지 않고, 팝업창을 닫는다.
com.closePopup();
 */
com.closePopup = function(retObj) {
	gcm.pop.closePopup(scwin, retObj);
};

/**
 * 현재 오픈된 전체 팝업창을 닫는다.
 *
 * @example
com.closeAllPopup();
 */
com.closeAllPopup = function() {
	gcm.pop.closeAllPopup(scwin);
};

/**
 * 현재 화면이 팝업 인지의 여부를 반환한다.
 *
 * @return {Boolean} 팝업인 경우 true, 팝업이 아닌 경우 false
 * @example
if (com.isPopup()) {
	com.alert("현재 화면은 팝업입니다.");
};
 */
com.isPopup = function() {
	return gcm.pop.isPopup(scwin);
};

//=============================================================================
/**
 * 첨부파일과 관련된 함수를 작성한다.
 * 주로 gcm.file 함수 호출
 */
//=============================================================================

/**
 * 첨부파일 wframe을 설정한다.
 *
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @param {Object} wfmObj 공통 첨부파일 wframe 객체
 * @param {Object} option 첨부파일 옵션 객체
 * @param {Number} option.maxFileCount 업로드 가능한 파일 개수 (기본값 : 3)
 * @param {Number} option.maxFileSize 업로드 가능한 파일 크기 (단위 MB, 기본값 : 2) [주의] websquare.xml에 설정된 maxUploadSize 값보다 커서는 안됨
 * @param {String} option.filter 업로드 가능한 파일 확장자 (기본값 : websquare.xml에 설정된 allowedExtension, deniedExtension에 설정을 따름)  [주의] websquare.xml에 설정 밖의 확장자는 허용 불가 
 * @param {String} option.subDir 업무구분 (기본값 : 해당 Scope의 프로그램ID) [주의] websquare.xml 환경설정 파일의 baseDir 경로 하위에 subDir/yyyyMM/에 저장됨)
 * @param {String} option.refKey 참조키 (업무 테이블과 조인시 사용되는 Key 값 : 업무테이블Key 또는 파일그룹ID)
 * @param {Boolean} option.readOnly 읽기전용 여부 (기본값 : false. false시 기존 파일 삭제 및 파일첨부 가능, true시 기존 파일 목록 조회 및 다운로드만 가능)
 * @param {Function} uploadCallback 파일 업로드 콜백 함수 (업로드 완료 후 업무정보 및 파일정보 DB 저장 처리 로직 구현 필요)
 * @example
	// 첨부파일 설정 
	var option = {
		  refKey : dma_sample.get("S_ID") 	// 참조키 (업무 테이블과 조인시 사용되는 Key 값 : 업무테이블Key 또는 파일그룹ID)
		, subDir : "Sample" // 업무구분(필수. 어떤 업무와 관련된 파일인지 구분하는 정보. websquare.xml 환경설정 파일의 baseDir 경로에 하위에 subDir/yyyyMM/에 저장됨)
		, maxFileCount : 1 	// 업로드 가능한 파일 개수 (기본값 : 3)
		, maxFileSize : 1 	// 업로드 가능한 개별 첨부 파일 크기 (단위 MB, 기본값 : 2) [주의] websquare.xml 환경설정 파일의 maxUploadSize 값보다 커서는 안됨
		, filter : "xlsx" 	//업로드 가능한 파일 확장자. 미설정시 모든 파일(*.*)로 설정. 단, websquare.xml 환경설정 파일의 allowedExtension, deniedExtension에 설정내에서 가능
		, readOnly : true	// 읽기전용 (기본값 : false. false시 기존 파일 삭제 및 파일첨부 가능, true시 기존 파일 목록 및 다운로드만 가능)
	};
	com.setFileUpload(wfm_file, option);
 */
com.setFileUpload = function(wfmObj, option, uploadCallback) {
	gcm.file.setFileUpload(scwin, wfmObj, option, uploadCallback);
};

/**
 * 첨부파일을 업로드하고 콜백함수를 실행한다.
 *
 * @param {Object} wfmObj 공통 첨부파일 wframe 객체
 * @param {Function} uploadCallback 파일 업로드 콜백 함수 (업로드 완료 후 업무정보 및 파일정보 DB 저장 처리 로직 구현 필요)
 * @example
	// 첨부파일 업로드 후 업로드 콜백에서 저장 처리 (새로운 첨부파일이 없으면 바로 콜백 수행)
	com.uploadFile(wfm_file, function() {
		// 파일 업로드 완료 콜백 : 업무정보 및 파일정보 DB 저장 처리 로직 구현
		scwin.save();
	});
 */
com.uploadFile = function(wfmObj, uploadCallback) {
	gcm.file.uploadFile(scwin, wfmObj, uploadCallback);
};
	
/**
 * 첨부파일 팝업을 오픈한다.
 *
 * @param {Object} option 첨부파일 옵션 객체
 * @param {String} option.fileGrpId 파일 그룹 ID
 * @param {Number} option.maxFileCount 업로드 가능한 전체 첨부 파일 개수
 * @param {Number} option.maxFileSize 업로드 가능한 개별 첨부 파일 크기 (단위 MB, websquare.xml 환경설정 파일의 maxUploadSize 보다 커서는 안됨)
 * @param {Number} option.totalFileSize 업로드 가능한 전체 첨부 파일 크기 (단위 MB)
 * @param {String} option.filter 업로드 가능한 파일 확장자
 * @param {Function} closeCallback 콜백 함수
 */
com.openFilePopup = function(option, closeCallback) {
	gcm.file.openFilePopup(scwin, option, closeCallback);
};	

/**
 * 첨부파일을 다운로드한다.
 *
 * @param {String} refKey 참조키
 * @param {String} fileId 파일 ID
 */
com.downloadFile = function(refKey, fileId) {
	gcm.file.downloadFile(scwin, refKey, fileId);
};	

//=============================================================================
/**
 * DataCollection 제어, 글로벌 데이터 제어(gcm의 함수를 호출), 화면 간 데이터 전달 함수를 작성한다.
 * 주로 gcm.data 함수 호출
 */
//=============================================================================

/**
 * 검색 조건에 맞는 데이터를 반환한다.
 * 
 * @param {Object} dataListObj : DataList Id 또는 DataList 객체
 * @param {Array|Object} condArr 비교 조건
 * @param {String} condArr.columnId 컬럼 아이디
 * @param {String} condArr.operator 비교 연산자 ( ==, !=, >, <, >=, <=, LIKE )
 * @param {String|Number|Boolean} condArr.value 비교 값
 * @param {String} condArr.logical 논리 연산자 ( &&, ||)
 * @returns {Array} JSON 배열
 * @example
	com.getMatchedJSON(dlt_memberList, { columnId : "POSITION_CD", operator : "==", value : "03"});
	
	com.getMatchedJSON(dlt_memberList, [
		{ columnId : "POSITION_CD", operator : "==", value : "03" },
		{ columnId : "DUTY_CD", operator : "==", value : "02", logical : "&&" }
	]);
	
	com.getMatchedJSON(dlt_memberList, [
		{ columnId : "POSITION_CD", operator : "==", value : "03" },
		{ columnId : "DUTY_CD", operator : "==", value : "02" }
	]);
	
	com.getMatchedJSON(dlt_memberList, [
		{ columnId : "POSITION_CD", operator : "==", value : "03"},
		{ columnId : "DUTY_CD", operator : "lIKE", value : "0", logical : "||" }
	]);
 */
com.getMatchedJSON = function(dataListObj, condArr) {
	return gcm.data.getMatchedJSON(scwin, dataListObj, condArr);
};

/**
 * 검색 조건에 맞는 인덱스 배열을 반환한다.
 * 
 * @param {Object} dataListObj : DataList Id 또는 DataList 객체
 * @param {Array|Object} com.getMatchedJSON 참조
 * @returns {Array} 인덱스 배열
 * @example com.getMatchedJSON 참조
 */
com.getMatchedIndex = function(dataListObj, condArr) {
	return gcm.data.getMatchedJSON(scwin, dataListObj, condArr, true);
};

/**
 * 로그인정보를 JSON Object로 반환한다.
 *
 * @return {Object} JSON 객체
 * @example
 	com.getLoginInfo();
 */
com.getLoginInfo = function (key) {
	return gcm.data.getLoginInfo(key);
};

/**
 * 조회시 변경사항이 있는지 체크하여, 변경사항이 있으면 알림창을 띄우고 변경사항이 없으면 조회를 수행한다.
 *
 * @param {Function} searchFn 조회 함수
 * @param {Array} checkList 체크할 dataCollection 배열 (null이면 scwin.checkList 배열 객체를 참조한다.)
 * @example
	com.checkBeforeSearch(scwin);
 */
com.checkBeforeSearch = function(searchFn, checkList) {
	gcm.data.checkBeforeSearch(scwin, searchFn, checkList);
};

/**
 * inputCalendar간의 기간 역전 체크
 *
 * @memberof gcm.data
 * @param {Object}	fromObj 시작일 inputCalendar 객체
 * @param {Object}	toObj 종료일 inputCalendar 객체
 */
com.checkPeriod = function (fromObj, toObj) {
	gcm.data.checkPeriod(fromObj, toObj);
};

/**
 * inputCalendar간의 기간 역전 체크 해제
 *
 * @memberof gcm.data
 * @param {Object}	fromObj 시작일 inputCalendar 객체
 * @param {Object}	toObj 종료일 inputCalendar 객체
 */
com.uncheckPeriod = function (fromObj, toObj) {
	gcm.data.uncheckPeriod(fromObj, toObj);
};

/**
 * dataList의 시작일 종료일 컬럼간의 기간 역전 체크
 *
 * @param {Object}	info dataList의 onbeforecelldatachange 이벤트 인자
 * @param {Object}	gridObj GridView 객체
 * @param {String}	fromId 시작일 컬럼 ID
 * @param {String}	toId 종료일 컬럼 ID
 * @return {Boolean} 기간 역전시 false
 * @example
	scwin.dlt_sample_onbeforecelldatachange = function(info) {
		// 시작일과 종료일 기간 역전 체크
		if (com.checkDltPeriod(grd_sample, info, "from", "to") === false) {
			return false;
		}
		return true;
	};
 */
com.checkGridPeriod = function (gridObj, info, fromId, toId) {
	return gcm.data.checkGridPeriod(gridObj, info, fromId, toId);
};

/**
 * 신규 등록에 사용하는 dataMap 빈값으로 초기화
 *
 * @param {Object}	dmaObj dataMap 객체
 * @example
	com.initDataMap(dma_sample);
 */
com.initDataMap = function (dmaObj) {
	gcm.data.initDataMap(dmaObj);
};

/**
 * 파라미터를 읽어 온다.
 *
 * @param {String} 파라미터 키
 * @return {Object} 파라미터 값
 * @example
var code = com.getParameter("code");  // 특정 파라미터 값을 얻어오기
var param = com.getParameter();	   // 전체 파라미터 값을 얻어오기
 */
com.getParameter = function (paramKey) {
	return gcm.data.getParameter(scwin, paramKey) || WebSquare.net.getParameter(paramKey);
};

/**
 * 파라미터를 세팅한다.
 *
 * @memberof com
 * @param {Object} 파라미터 
 * @return {Object} 파라미터 값
 * @example
	var param = {
		empno : "3223"
	};
	gcm.data.setParameter(param);
 */
com.setParameter = function (param) {
	return gcm.data.setParameter(scwin, param);
}

//=============================================================================
/**
 * 업무 화면 영역 제어(권한, 업무 화면 공통 UI 요소 및 버튼 제어, 개인화 등) 함수를 작성한다.
 * 주로 gcm.win 함수 호출
 */
// =============================================================================

/**
 * contextRoot가 포함된 path를 반환한다.
 *
 * @param {String} path 파일경로(Context가 포함되지 않은)
 * @return {String} Context가 포함된 파일경로
 * @example
//context가 /sample 인경우 /sample/ui/dev/common/commonCode1.xml 반환
com.getFullPath("/ui/dev/common/commonCode1.xml");
 */
com.getFullPath = function(path) {
	return gcm.win.getFullPath(path);
};

/**
 * 해당 그룹 안의 컴포넌트에서 엔터키가 발생하면 해당 컴포넌트의 값을 DataColletion에 저장하고 objFunc 함수를 실행한다.
 *
 * @param {Object} groupObj 그룹 객체
 * @param {Object} objFunc 함수 객체
 * @param {Number} rowIndex DataList가 바인딩된 gridView인 경우 ==> 현재 포커스된 focusedRowIndex [ex. gridViewId.getFocusedRowIndex()]
 *				<br/>아닌 경우 ==> rowIndex는 생략
 * @example
com.setEnterKeyEvent(grp_AuthorityDetail, scwin.search);
//return 예시) "엔터키가 발생 -> 해당 함수 실행 및 DataColletion에 UI 컴포넌트에 입력된 데이터를 DataCollection에 저장"
 */
com.setEnterKeyEvent = function(groupObj, objFunc, excludeComponents) {
    gcm.win.setEnterKeyEvent(scwin, groupObj, objFunc, excludeComponents);
};

/**
 * 현재 Scope의 메뉴객체를 반환한다.
 *
 * @param {Object} scopeScwin 함수를 호출하는 scope의 scwin 객체
 * @return {String} 메뉴객체
 */
com.getScopeMenuObj = function() {
	return gcm.win.getScopeMenuObj(scwin);
};

/**
 * ● 특정 메뉴를 오픈한다. (메뉴를 만들어서 오픈할 수 있다.)
 * ● 공통단 메뉴 오픈에만 사용한다. 업무단에서는 사용을 금지한다.
 *
 * @param {Object} menuObj 메뉴 객체
 * @param {Object} paramObj 파라미터 객체 - 메뉴 오픈시 전달할 파라미터 JSON 객체
 * @example
	var menuObj = {};
	menuObj[gcm.MENU_INFO.SERVICE_ID] = "P0001"; 
	menuObj[gcm.MENU_INFO.MENU_ID] = "M0001"; 
	menuObj[gcm.MENU_INFO.MENU_NM] = "인사조회";
	menuObj[gcm.MENU_INFO.SRC_PATH] = "/tmp/tmp01.xml";
	com.openMenu(menuObj);
 */
com.openMenu = function(menuObj, paramObj, closable) {
	return gcm.win.openMenu(menuObj, paramObj, closable);
};


/**
 * ● 서비스 아이디를 이용해 메뉴 정보를 가져온다.
 *
 * @param {String} 서비스아이디 serviceid
 * @example
 * com.getMenuObj('C110', function(ret){ console.log(ret) })
	{
	    "serviceID": "C110",
	    "serviceCode": "1006092400",
	    "parentDivCode": "1006090000",
	    "childNode": "N",
	    "serviceLevel": 3,
	    "serviceOrder": 1,
	    "cn": "근태일정현황",
	    "serviceUrl": "/kitech/ccs/cgs/CgsWorkingStatus.xml",
	    "serviceNewUrl": "/ui/ccs/cgs/CCS_CGS_C110_00D.xml",
	    "useYN": "Y",
	    "betaServiceYN": "",
	    "permission": "",
	    "rowStatus": "R"
	}
 */
com.getMenuObj = function(serviceid, callbackFn) {
	return gcm.win.getMenuObj(serviceid, callbackFn);
};

/**
 * ● LDAP에 서비스로 등록된 화면을 MDI의 새탭으로 오픈한다.
 * ● 업무단 화면이동 기본 메소드이다.
 *
 * @param {String} prgId 프로그램ID (메뉴로 등록된 화면을 오픈할 경우 사용, 등록되지 않은 화면의 경우 null)
 * @param {Object} paramObj
 * @example
	var data = { "msg" : ibx_alertSend.getValue() };
	com.openTabMenu("PT01", data, function(retObj) {
		// 콜백
		ibx_alertReceive.setValue( retObj.retValue );
	});
 */
com.openTabMenu = function(serviceid, paramObj, callbackFn) {
	gcm.win.openTab(scwin, serviceid, null, null, null, paramObj, callbackFn);
//	e.stopPropagation(); // windowContainer 사용시 필요
};

/**
 * ● LDAP에 서비스로 등록하지 않은 화면을 MDI의 새탭으로 오픈한다.
 * ● 권장하지 않음 (권한체크 불가)
 *
 * @param {String} pageNm 화면명
 * @param {String} url 화면 파일 경로
 * @param {String} subIndex 서브 인덱스 (오프너의 windowId 에 postFix로 붙여 windowId로 사용)
 * @param {Object} paramObj
 * @example
	var data = { "msg" : ibx_alertSend.getValue() };
	com.openTabUrl("새탭(Url)", "/ui/zam/sample/paramTab.xml", 1, data, function(retObj) {
		// 콜백
		ibx_alertReceive.setValue( retObj.retValue );
	});
 */
com.openTabUrl = function(pageNm, url, subIndex, paramObj, callbackFn) {
	gcm.win.openTab(scwin, null, pageNm, url, subIndex, paramObj, callbackFn);
//	e.stopPropagation(); // windowContainer 사용시 필요
};

/**
 * 현재 탭 닫으면서 오픈한 화면의 콜백 함수 실행
 *
 * @param {Object} retObj 반환 객체
 * @example
com.closeTab(scwin.param.openerWinId, scwin.param.callbackFn, ibx_confirmSend.getValue());
 */
com.closeTab = function(retObj) {
	gcm.win.closeTab(scwin, retObj);
};

/**
 * ● LDAP에 서비스로 등록된 화면으로 화면을 전환 한다.
 * ● 결재함(A001 ~ A010) 메뉴 이동시에만 사용한다.
 *
 * @param {String} menuId 메뉴ID
 * @param {Object} paramObj
 * @example
	var data = { "msg" : ibx_alertSend.getValue() };
	com.movePage("PT01", data);
 */
com.movePageMenu = function(menuId, paramObj) {
	gcm.win.movePage(scwin, menuId, null, null, null, paramObj);
};

/**
 * ● LDAP에 서비스로 등록되지 않은 화면으로 화면을 전환 한다.
 * ● 사용을 금지한다. 향 후 삭제 예정. 2023-04-14, 현재 사용처 없음
 *
 * @param {String} pageNm 화면명
 * @param {String} url 화면 파일 경로
 * @param {String} subIndex 서브 인덱스 (오프너의 windowId 에 postFix로 붙여 windowId로 사용)
 * @param {Object} paramObj
 * @deprecated 
 * @example
	com.movePageUrl("화면전환", "/ui/sample/paramMove.xml", 1, data);
 */
com.movePageUrl = function(pageNm, url, subIndex, paramObj) {
	gcm.win.movePage(scwin, null, pageNm, url, subIndex, paramObj);
};


/**
 * ● 상세화면의 목록 버튼이나 삭제 버튼의 화면 이동 용도의 메소드
 * ● 목록 화면이 오픈되어 있는 경우 선택만하고 없는 경우 오픈하고 해당 페이지를 닫는다.
 *
 * @param {String} 서비스아이디 (필수)
 * @param {Object} paramObj
 * @example
	var data = { "msg" : ibx_alertSend.getValue() };
	com.moveList("PT01", data, function(retObj) {
		// 콜백
		ibx_alertReceive.setValue( retObj.retValue );
	});
 */
com.moveList = function(serviceid, paramObj, callbackFn) {
	if (!gcm.util.isAprListMenu(serviceid)) {
		gcm.win.closeTab(scwin, paramObj);
	}
	gcm.win.openTab(scwin, serviceid, 'list', null, null, paramObj, callbackFn);
//	e.stopPropagation(); // windowContainer 사용시 필요
};

/**
 * 최상위 page를 index화면으로 이동 (/)
 */
com.goHome = function(queryStr) {
	gcm.win.goHome(queryStr);
};


/**
 * 세메뉴 접속 로그
 */
com.access = function(serviceid) {
	// 메뉴 접속 로그 기록
	gcm.win.access(serviceid);
};

/**
 * tbbox 내의 inputBox의 bold 해제
 *
 * @param {String} grpId Group ID
 * @example
	com.initBold("grp_sample");
 */
com.initBold = function(grpId) {
	gcm.win.initBold(scwin, grpId);
};

/**
 * 업무 영역 높이가 남을 경우 가변영역(fullH class를 지정한 영역)의 높이를 남는 만큼 늘린다.
 * 업무 영역에 탭 컨트롤 내에 가변영역이 존재하는 경우 해당 탭의 onchange이벤트에서 수행
 *
 * @example
	scwin.tac_tabControl1_onchange = function(tabID,idx,userTabID) {
		com.setFullHeight();
	};
 */
com.setFullHeight = function() {
	gcm.win.setFullHeight(scwin);
};

// =============================================================================
/**
 * 웹스퀘어 컴포넌트 제어, 엑셀 파일 업로드/다운로드, 파일 업로드/다운로드, 기타 유틸리티 함수를 작성한다.
 * 주로 gcm.util 함수 호출
 */
 // =============================================================================

/**
 * JSON Object로 변환해서 반환한다.
 *
 * @param {String|XML} value JSON 문자열 또는 XML Document
 * @return {Object} JSON 객체 or null
 * @example
// 유효하지 않은 JSON 문자열 일 경우
com.getJSON("");
// return 예시)	null

// 유효한 JSON 문자열
var json = '{"tbx_sPrjNm":"1","tbx_sPrtLv":"2","tbx_sReqLv":"3"}';
com.getJSON(json);
// return 예시)	{tbx_sPrjNm: "1", tbx_sPrtLv: "2", tbx_sReqLv: "3"}
 */
com.getJSON = function (value) {
	return gcm.util.getJSON(value);
};

/**
 * JSON Object인지 여부를 검사한다.
 *
 * @param {Object} jsonObj JSON Object가 맞는지 검사할 JSON Object
 * @return {Boolean} true or false
 * @example
com.isJSON("");
// return 예시) false
com.isJSON( {"tbx_sPrjNm": "1", "tbx_sPrtLv": "2", "tbx_sReqLv": "3"} );
// return 예시) true
 */
com.isJSON = function(json) {
	return gcm.util.isJSON(json);
};

/**
 * 배열 객체인지 여부를 확인한다.
 *
 * @param {Object}  array :: I :: N :: :: Array Object or String
 * @return {Boolean} Array 배열 판단 여부(Array 객체인 경우 true, 아닌경우 false)
 * @example
com.isArray(arrObject); // return true
 */
com.isArray = function(array) {
	return gcm.util.isArray(array);
};

/**
 * 값이 Empty 상태(undefined, null, "")인지 판별한다.
 * 
 * @param value Empty 여부를 판단할 값
 * @return Empty 여부 (true : Empty, false : Not Empty)
 * @example
if (com.isEmpty(empCd) === false) {
	console.log("empCd : " + empCd);
}
 */
com.isEmpty = function(value) {
	return gcm.util.isEmpty(value);
};

/**
 * 값이 Empty 상태(undefined, null, "")이 아닌지 판별한다.
 * 
 * @param value Empty 아닌지 여부를 판단할 값
 * @return Empty 아닌지 여부 (true : Not Empty, false : Empty)
 * @example
if (com.isNotEmpty(empCd) === false) {
	console.log("empCd : " + empCd);
}
 */
com.isNotEmpty = function(value) {
	return gcm.util.isNotEmpty(value);
};

/**
 * GridView Row 삭제를 위한 CheckBox 동작을 세팅한다.
 * GridView에 삭제용 CheckBox가 있을 경우 onPageLoad 이벤트에서 gcm.util.setGridViewDelCheckBox 함수를 호출한다.
 * 이 함수가 정상 동작하려면 GridView의 Delete 처리용 CheckBox의 ColumnId와 Header Id를 "chk"로 설정해야 한다.
 *
 * @param {Array} gridObj GridView 객체 배열
 * @example
com.setGridViewDelCheckBox(grd_OrganizationBasic);
com.setGridViewDelCheckBox([grd_Menu, grd_MenuAccess]);
 */
com.setGridDelCheckBox = function (gridObjArr) {
	gcm.util.setGridDelCheckBox(gridObjArr);
};

/**
 * 특정 컴포넌트의 자식 컴포넌트를 배열로 반환한다.
 *
 * @param {Object} comObj 컴포넌트 객체
 * @param {Object} options 하위 컴포넌트 검색 옵션 정보
 * @param {String} options.includeId 포함할 컴포넌트 id. 인자가 여러 개일 경우 공백을 구분자로 사용함.
 * @param {String} options.includePlugin 포함 컴포넌트 플러그인 이름. 인자가 여러 개일 경우 공백을 구분자로 사용함.
 * @example
com.getChildren(grp_content);
com.getChildren(grp_content, {excludePlugin : "trigger input", excludeId : "treeview1_tooltip windowContainer1_tooltip");
com.getChildren(grp_content, {includeId : "ibx_name sbx_payTy"});
com.getChildren(grp_content, {includePlugin : "selectbox"});
com.getChildren(grp_content, {includeId : "ibx_name sbx_payTy", includePlugin : "input selectbox"});
 */
com.getChildren = function(comObj, options) {
	return gcm.util.getChildren(comObj, options);
};

/**
 * 현재 Scope에서 주어진 아이디에 해당하는 웹스퀘어 컴포넌트를 찾아 반환한다.
 *
 * @param {String} compId 컴포넌트 아이디
 * @return {Object} 컴포넌트 객체
 * @example
var object = com.getComponent(compId);
 */
com.getComponent = function(compId) {
	return gcm.util.getComponent(scwin, compId);
};

/**
 * 주어진 인자를 통해 동적으로 Component를 생성한다.
 *
 * @param {String} strCompId 컴포넌트 ID
 * @param {String} strCompName 컴포넌트 태그명
 * @param {Object} option 컴포넌트 옵션
 * @param {String} parent 컴포넌트 생성 부모 노드 위치
 * @param {Object} itemSet 컴포넌트 setItemset 옵션
 * @return {Object} 생성된 컴포넌트 객체
 * @example
com.createComponent("ibx_input1", "input" );
com.createComponent("ibx_input2", "input", { style: "width:120px; height:40px; float:left; margin : 20px;" });
com.createComponent("ibx_input2", "input", { style: "width:120px; height:40px; float:left; margin : 20px;" }, grp_content1);
 */
com.createComponent = function(strCompId, strCompName, option, parent, itemSet) {
	return gcm.util.createComponent(scwin, strCompId, strCompName, option, parent, itemSet);
};

/**
 * 사용자가 지정한 함수가 일정 시간 후에 실행된다.
 * 실행할 함수를 함수를 setTimeout으로 등록하여 함수가 일정 시간 후에 실행되도록 한다.SPA모드에서 페이지 이동 시 이 함수로 등록한 타이머를 자동으로 제거한다.
 * 
 * @param {Function} func	실행할 함수
 * @param {Object} options	options인자로는 아래와 같은 인자가 사용된다.
 * @param {String} options.key timeout을 구별하기 위한 키값. 이 값이 지정되지 않은 경우 키값을 func.toString().slice(0,30)을 키값으로 사용한다.
 * @param {Number} options.delay func로 지정한 함수가 실행 될 간격으로 기본값은 1ms(millisecond / 1000분의 1초)이다. javascript setTimeout의 2번째 인자값.
 * @param {Object} options.caller func로 지정한 함수내에서 this값으로 지정 할 객체(웹스퀘어 컴포넌트 포함).
 * @param {Object} options.args func에 전달할 인자값. array형태로 인자를 전달한다.
 * @param {Function} options.before_call : func로 지정한 함수가 실행되기 직전에 실행 할 함수. func함수와 마찬가지로 data를 인자로 받는다.
 * @param {Function} options.callback : func로 지정한 함수가 실행된 후에 실행 할 함수. func로 지정한 함수의 return값을 인자로 받는다.
 * @example
com.setTimeout( function() {
		com.alert("5분이 지났습니다.");
	},
	{ delay : 300000, key : "loginTimeout" }
);
 */
com.setTimeout = function(func, options) {
	gcm.util.setTimeout(scwin, func, options);
};

/**
 * @description 입력 가능한 컴포넌트(input, textarea 등) 객체의 내용을 클립보드에 저장한다.
※ 주의사항
- IE 10+, Chrome 43+, Opera 29+, Firefox에서만 사용 가능함
- IE의 경우 클립복드 복사 허용을 묻는 확인 창이 뜸
 *
 * @param {Object} 컴포넌트 객체
 * @example
// ibx_message InputBox내 Text가 Select 되면서 Clipboard에 복사된다.
com.copyClipboard(ibx_message);
 */
com.copyClipboard = function(comObj) {
	gcm.util.copyClipboard(comObj);
};

/**
 * group의 innerHTML에 HTML태그 문자열을 적용한다.
 *
 * @param {String} groupObj Group 객체
 * @param {String} html html 태그 문자열
 * @example
com.setHTML(grp_test, edt_test.getHTML());
 */
com.setHTML = function (groupObj, html) {
	gcm.util.setHTML(groupObj, html);
};

/**
 * group의 innerHTML에 HTML태그 문자열을 적용한다.
 * import된 html의 스크립트 동작을 위해 jquery .html() 사용
 * @param {String} groupObj Group 객체
 * @param {String} html html 태그 문자열
 * @example
com.importHTML(grp_test, edt_test.getHTML());
 */
com.importHTML = function(groupObj, html) {
	gcm.util.importHTML(groupObj, html);
};

//=============================================================================
/**
* 숫자 관련 함수를 정의한다.
* 주로 gcm.num 함수 호출
*/
// =============================================================================

/**
 * 반올림 처리를 한다.
 *
 * @param {String|Number} value 반올림 처리를 할 값
 * @param {Number} point 반올림 처리를 할 소수점 자리 수 (Default : 0, 정수 값으로 반올림 처리)
 * @return {Number} 반올림 처리를 한 숫자 값
 * @example
com.round(23.4567); // return 예시) 23
com.round(23.5567); // return 예시) 24
com.round(23.5567, 2); // return 예시) 23.56
com.round(23.5564, 3); // return 예시) 23.556
 */
com.round = function(value, point) {
	return gcm.num.round(value, point);
};

/**
 * 내림 처리를 한다.
 *
 * @param {String|Number} value 내림 처리를 할 값
 * @param {Number} point 내림 처리를 할 소수점 자리 수 (Default : 0, 정수 값으로 내림 처리)
 * @return {Number} 내림 처리를 한 숫자 값
 * @example
com.floor(23.5567); // return 예시) 23
com.floor(23.5567, 2); // return 예시) 23.55
 */
com.floor = function(value, point) {
	return gcm.num.floor(value, point);
};

/**
 * 올림 처리를 한다.
 *
 * @param {String} value 올림 처리를 할 값 (String 또는 Number 타입 지원)
 * @param {Integer} point 올림 처리를 할 소수점 자리 수 (Default : 0, 정수 값으로 올림 처리)
 * @return {Number} 올림 처리를 한 숫자 값
 * @example
com.ceil(23.5567); // return 예시) 24
com.ceil(23.5567, 2); // return 예시) 23.56
 */
com.ceil = function(value, point) {
	return gcm.num.ceil(value, point);
};

/**
 * ex)세번째자리마다 콤마 표시, 금액, setDisplayFormat("#,###&#46##0", "fn_userFormatter2") - 입력된 str에 포메터를 적용하여 반환한다.<p>
 *
 * @param {String|Number} value 포멧터를 적용할 값
 * @param {String} type 적용할 포멧터 형식(Default:null,dollar,plusZero,won)
 * @return {String} 포멧터가 적용된 문자열
 * @example
com.formatMoney("12345"); // 12,345
com.formatMoney("12345", "dollar"); // $12,345
com.formatMoney("12345", "plusZero"); // 123,450
com.formatMoney("12345", "won"); // 12,345원
 */
com.formatMoney = function (value, type) {
	return gcm.num.formatMoney(value, type);
};

/**
 * 세째자리마다 콤마를 추가해서 반환한다.
 *
 * @param {String|Number} value 포멧터를 적용할 값
 * @return {String} 포멧터가 적용된 문자열
 * @example
com.formatNumber("12345677"); // "12,345,677"
com.formatNumber(12345677); // "12,345,677"
com.formatNumber(-12345677); // "-12,345,677"
 */
com.formatNumber = function (value) {
	return WebSquare.util.setNumber(value);
};

/**
 * 숫자가 맞는지 여부를 검사한다.
 *
 * @param {String|Number} value 검사할 숫자 값
 * @return {Boolean} 숫자 여부 (숫자이면 true, 아니면 false 반환)
 * @example
com.isNumber("123"); // true;
com.isNumber(123); // true;
com.isNumber("123.123"); // true;
com.isNumber(123.123); // true;
com.isNumber("-123.123"); // true;
com.isNumber(-123.123); // true;
com.isNumber("a123"); // false;
 */
com.isNumber = function (value) {
	return gcm.num.isNumber(value);
};

/**
 * 홀수가 맞는지 여부를 검사한다.
 *
 * @param {String|Number} value 검사할 값
 * @return {Boolean} 홀수 여부 (홀수이면 true, 아니면 false 반환)
 * @example
com.isOdd("123"); // true;
com.isOdd(123); // true;
com.isOdd("122"); // false;
com.isOdd(122); // false;
 */
com.isOdd = function (value) {
	return gcm.num.isOdd(value);
};

/**
 * 문자열을 정수형으로 변환한다.
 *
 * @param {String} value 변환할 문자열
 * @return {Number} 변환된 정수형 값
 * @example
com.parseInt("5231"); // 5231;
 */
com.parseInt = function (value) {
	return gcm.num.parseInt((value=='')?0:value);
};

/**
 * 문자열을 실수형으로 변환한다.
 *
 * @param {String} value 변환할 문자열
 * @return {Number} 변환된 실수형 값
 * @example
com.parseFloat("5231.22"); // 5231.22;
 */
com.parseFloat = function (value) {
	return gcm.num.parseFloat(value);
};

/**
 * 바이트 값을 적절한 단위(KB, MB, GB)를 변환해서 반환한다.
 *
 * @param {String} value 변환할 값
 * @example
com.formatByte(32132);
 */
com.formatByte = function(value) {
	return gcm.num.formatByte(value);
};

// =============================================================================
/**
 * 문자열 관련 함수를 정의한다.
 * 주로 gcm.str 함수 호출
 */
 // =============================================================================

/**
 * XML, JSON 객체를 String 타입으로 반환한다.
 *
 * @param {Object} object String으로 변환할 JSON 객체
 * @param {String} replacer 치환할 문자열
 * @param {Number} space 여백 수
 * @return {String} String으로 변환된 객체
 */
com.serialize = function (object, replacer, space) {
	return gcm.str.serialize(object, replacer, space);
};

/**
 * 좌측에 문자열 채우기
 *
 * @param {String} str 포멧터를 적용할 문자열
 * @param {Number} length 0 으로 채울 길이
 * @param {String} char : 채우고자하는 문자(char)
 * @return {String} 일정길이 만큼 char 으로 채워진 문자열
 * @example
com.lpad("24", 4, "0"); // "0024"
com.lpad("11321", 8, "A"); // "AAA11321"
 */
com.lpad = function(str, length, char) {
	return gcm.str.lpad(str, length, char);
};

/**
 * 우측에 문자열 채우기
 *
 * @param {String} str 포멧터를 적용할 문자열
 * @param {Number} length 0 으로 채울 길이
 * @param {String} char : 채우고자하는 문자(char)
 * @return {String} 일정길이 만큼 char 으로 채워진 문자열
 * @example
com.rpad("24", 4, "0"); // "2400"
com.rpad("11321", 8, "A"); // "11321AAA"
 */
com.rpad = function(str, length, char) {
	return gcm.str.rpad(str, length, char);
};

/**
 * 주민번호 문자열에 Formatter(######-#######)를 적용하여 반환한다.
 *
 * @param {String} str 주민번호 문자열
 * @return {String} 포멧터가 적용된 주민번호 문자열
 * @example
com.formatSSN("1234561234567");  // "123456-1234567"
 */
com.formatSSN = function (str) {
	return gcm.str.formatSSN(str);
};

/**
 * 문자열에 전화번호 형식 Formatter를 적용하여 반환한다.
 *
 * @param {String} str 포멧터를 적용할 문자열
 * @return {String} 포멧터가 적용된 문자열
 * @example
com.formatPhone("0212345678");  // "02-1234-5678"
com.formatPhone("05051234567"); // "0505-123-4567"
com.formatPhone("03112345678"); // "031-1234-5678"
com.formatPhone("0311234567");  // "031-123-4567"
 */
com.formatPhone = function (str) {
	return gcm.str.formatPhone(str);
};

/**
 * 문자열에 시간 형식 Formatter를 적용하여 반환한다.
 *
 * @param {String} str 포멧터를 적용할 문자열
 * @return {String} 포멧터가 적용된 문자열
 * @example
com.formatTime("123402"); // 12:34:02
com.formatTime("1234"); // 12:34:02
*/
com.formatTime = function(str) {
	return gcm.str.formatTime(str);
};

/**
 * 입력받은 문자열에 한글이 포함되어 있는지 여부를 검사한다.
 *
 * @param {String} value 한글 유형인지 검증할 문자열
 * @return {Boolean} true or false
 * @example
com.existKorean("abc"); // false
com.existKorean("abc무궁화"); // true
com.existKorean("무궁화꽃이"); // true
 */
com.existKorean = function (value) {
	return gcm.str.existKorean(value);
};

/**
 * 입력받은 문자열 전체가 한글인지를 검사한다.
 *
 * @param {String} str 한글이 포함되어 있는지 검증 받을 문자열
 * @return {Boolean} true or false
 * @example
com.isKorean("abcd"); // false
com.isKorean("abcd무궁화"); // false
com.isKorean("무궁화"); // true
 */
com.isKorean = function (str) {
	return gcm.str.isKorean(str);
};

/**
 * 사업자번호 유효성을 검사한다.
 *
 * @param {String} str 사업자번호 문자열
 * @return {Boolean} 정상이면 true, 비정상이면 false를 반환
 * @example
com.isBizID("1102112345"); // false
com.isBizID("1078616054"); // true
com.isBizID("2208139938"); // true
com.isBizID("1248100998"); // true
 */
com.isBizID = function (str) {
	return gcm.str.isBizID(str);
};

/**
 * 내외국인 주민등록번호 유효성을 검사한다.
 *
 * @param {String} str 문자열
 * @returns {Boolean} 정상이면 true, 비정상이면 false를 반환
 * @example
com.isSSN("9701011234567");
 */
com.isSSN = function (str) {
	return gcm.str.isSSN(str);
};

/**
 * 이메일 주소의 유효성을 검사한다.
 *
 * @param {String} str 메일주소
 * @return {Boolean} 정상이면 true, 비정상이면 false를 반환
 * @example
com.isEmail("emailTest@email.com");  // true
 */
com.isEmail = function (str) {
	return gcm.str.isEmail(str);
};

/**
 * 전화번호의 유효성을 검사한다.
 *
 * @param {String} str :: I :: Y :: :: 전화번호
 * @return {Boolean} 정상이면 true 그외는 false 반환
 * @example
com.isPhone("01094832134"); // true
com.isPhone("02094832134"); // false
 */
com.isPhone = function(str) {
	return gcm.str.isPhone(str);
};

/**
* 문자열을 치환한다.
*
* @param	{String} str 문자열
* @param	{String} orgStr 검색할 문자
* @param	{String} repStr 치환할 문자
* @return   {String} 치환문자열
* @example	com.replaceAll(obj.getValue(), "/", "");
*/
com.replaceAll = function( str, orgStr, repStr ){
	return gcm.str.replaceAll( str, orgStr, repStr );
};

/**
 * 입력된 문자열의 좌우측 공백을 제거한 문자열을 구한다.
 *
 * @param {String} str 좌우측 공백문자를 제거하려는 문자열
 * @return {String} 입력된 문자열에서 좌우측 공백이 제거된 문자열
 * @example com.trim("   a   ");  // return "a"
 */
com.trim = function(str) {
	return gcm.str.trim(str);
};

/**
 * 문자열의 바이트 기준 문자열 길이를 반환한다.
 *
 * @param {String} str 문자열
 * @param {String} ignoreChar 길이 측정 시 무사할 문자열
 * @return {Number} 문자열 길이
 * @example
com.getByteLength("1231aABC");  // 8
com.getByteLength("1231a한글");  // 9
 */
com.getByteLength = function(str, ignoreChar) {
	return gcm.str.getByteLength(str, ignoreChar);
};

/**
 * 문자열이 null이면 대체문자열를 반환한다.
 *
 * @param {String} str 문자열
 * @param {String} nvl 대체문자 문자열
 * @return {String} 문자열
 * @example
com.nvl(null, "test");  // test
 */
com.nvl = function(str, nvl) {
	return gcm.str.nvl(str, nvl);
};

/**
 * 개행 <br/>로 변환 및 탭/공백 &nbsp로 변환
 *
 * @param {String} str 문자열
 * @return {String} 변환된 문자열
 */
com.newlineToBr = function(str, isNotEscape) {
	return gcm.str.newlineToBr(str, isNotEscape);
};

// =============================================================================
/**
 * 날짜 관련 함수를 정의한다.
 * 주로 gcm.data 함수 호출
 */
 // =============================================================================

/**
 * 입력된 날짜에 지정된 만큼의 분을 더한다.
 *
 * @param {String} pYmd 날짜 형식의 문자열 (yyyyMMdd or yyyyMMddHHmmss)
 * @param {Number} offset 더할 분 수.
 * @return {String} 지정된 offset만큼의 날짜가 더해진 입력 날짜.
 * @example
com.addMinute("201708191210", 10); // "201708191220"
com.addMinute("201708191210", -10); // "201708191200"
 */
com.addMinute = function(pYmd, offset) {
	return gcm.date.addMinute(pYmd, offset);
};

/**
 * 입력된 날짜에 지정된 만큼의 시간을 더한다.
 *
 * @param {String} pYmd 날짜 형식의 문자열 (yyyyMMdd or yyyyMMddHHmmss)
 * @param {Number} offset 더할 시간 수.
 * @return {String} 지정된 offset만큼의 날짜가 더해진 입력 날짜.
 * @example
com.addHour("2017081912", 10); // "2017081922"
com.addHour("2017081912", -10); // "2017081902"
 */
com.addHour = function(pYmd, offset) {
	return gcm.date.addHour(pYmd, offset);
};

/**
 * 입력된 날짜에 지정된 만큼의 날을 더한다.
 *
 * @param {String} pYmd 날짜 형식의 문자열 (yyyyMMdd or yyyyMMddHHmmss)
 * @param {Number} offset 더할 날짜 수.
 * @return {String} 지정된 offset만큼의 날짜가 더해진 입력 날짜.
 * @example
com.addDate("20170819", 2); // "20170821"
com.addDate("20170819", -10); // "20170809"
 */
com.addDate = function(pYmd, offset) {
	return gcm.date.addDate(pYmd, offset);
};

/**
 * 입력된 날짜에 지정된 만큼의 달을 더한다.
 *
 * @param {String} pYmd 날짜 형식의 문자열 (yyyyMMdd or yyyyMMddHHmmss)
 * @param {Number} offset 더할 개월 수.
 * @return {String} 지정된 offset만큼의 개월이 더해진 입력 날짜.
 * @example
com.addMonth("20170819", 2); // "20171019"
com.addMonth("20170819", -10); // "20161019"
 */
com.addMonth = function(pYmd, offset) {
	return gcm.date.addMonth(pYmd, offset) ;
};

/**
 * 서버 날짜 반환한다. (default format: yyyyMMdd)
 *
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
com.getServerDateTime("yyyy-MM-dd HH:mm:ss SSS");
com.getServerDateTime("yyyy-MM-dd");
com.getServerDateTime();
 */
com.getServerDateTime = function (sDateFormat) {
	return gcm.date.getServerDateTime(sDateFormat);
};

/**
 * 문자열에 날짜 Formatter를 적용하여 반환한다.
 *
 * @param {String} str 포멧터를 적용할 파라메터 (String 또는 Number 타입 지원)
 * @param {String} type 적용할 포멧터 형식 Default:null,slash,date
 * @return {String} 포멧터가 적용된 문자열
 * @example
com.formatDate(20120319, "slash");
// return 예시) 12/03/19

com.formatDate(20120319, "date");
// return 예시) 2012/03/19

com.formatDate(20120319, "colon");
// return 예시) 2012:03:19

com.formatDate(20120319);
// return 예시) 2012년 03월 19일
 */
com.formatDate = function (str, type) {
	return gcm.date.formatDate(str, type);
};

/**
 * 날짜 객체에 포매팅을 적용한다. (default format: yyyyMMdd)
 *
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
com.formatDateTime(new Date());  // "20190822"
com.formatDateTime(new Date(), "yyyy-MM-dd HH:mm:ss SSS");  // "2019-08-22 15:55:35 705"
 */
com.formatDateTime = function (value, sDateFormat) {
	return gcm.date.formatDateTime(value, sDateFormat);
};

/**
 * 입력된 값이 Date 형식의 값인지 확인한다.
 *
 * @param {String|number} sDate 날짜 문자열 (yyyyMMdd or yyyyMMddHHmmss)
 * @param {Boolean} timeChk 시간체크. (true/false)
 * @return {Boolean} Date 형식에 일치하면 true, 아니면 false
 * @example
com.isDate("20170819"); // return true
 */
com.isDate = function(sDate, timeChk) {
	return gcm.date.isDate(sDate, timeChk);
};

/**
 * fromDate, toDate 를 입력받아 두 날짜의 차이를 반환한다.
 *
 * @param {String} fromDate 시작일자 (date형식은 yyyyMMdd or yyyyMMddHHmmss)
 * @param {String} toDate 종료일자 (date형식은 yyyyMMdd or yyyyMMddHHmmss)
 * @param {String} returnType 반환타입 (일수|개월수(m)|년도수(y))
 * @return {Number} 종료일자에서 시작일자의 날짜 차이 수.(
 * @example
	com.diffDate("20170821", "20180621"); // 304
	com.diffDate("20170821", "20180621", "M"); // 10
	com.diffDate("20170821", "20180621", "Y"); // 0
 */
com.diffDate = function(fromDate, toDate, returnType) {
	if (!returnType) {
		return gcm.date.diffDate(fromDate, toDate);
	} else {
		const [fromYear, fromMonth] = [parseInt(fromDate.slice(0, 4), 10), parseInt(fromDate.slice(4, 6), 10)];
		const [toYear, toMonth] = [parseInt(toDate.slice(0, 4), 10), parseInt(toDate.slice(4, 6), 10)];
		const diffInMonths = (toYear - fromYear) * 12 + toMonth - fromMonth;
		return returnType.toLowerCase() == 'y' ? Math.floor(diffInMonths / 12) : diffInMonths;
	}   
};


/**
 * 입력된 양력의 날짜가 윤년인지 검사한다.
 *
 * @param {String} pYmd :: I :: Y ::  :: 윤달 확인 날짜.
 * @return {boolean} 윤달 유무( true : 윤달)
 * @example
com.isLeafYear("20201212");  // return true
 */
com.isLeafYear = function(pYmd) {
	return gcm.date.isLeafYear(pYmd);
};

/**
 * 특정 날짜의 요일을 반환한다.
 *
 * @param {String} value "yyyyMMdd" 포맷 형태의 날짜를 나타내는 문자열 ("20190801")
 * @param {String} type 반환형식 기본값은 날짜를 한글로 반환 , num 인경우 숫자로 반환 일요일 :  1 ~ 토요일 : 7
 * @return {String} 요일
 * @example
com.getDay("20190822");  // "목요일"
com.getDay("20190824");  // "토요일"
com.getDay("20191010","num");  // "5"
 */
com.getDay = function (value,type) {
	return gcm.date.getDay(value,type);
};

/**
 * 특정 날짜의 음력 날짜를 반환한다.
 *
 * @param {String} "yyyyMMdd" 포맷 형태의 날짜를 나타내는 문자열
 * @return {String} 음력 날짜
 * @example
com.getLunar("20190824");  // "20190724"
 */
com.getLunar = function (value) {
	return gcm.date.getLunar(value);
};

/**
 * 해당 월의 마지막 날짜를 반환한다.
 *
 * @param {String} yearMonth 년월 문자열 (yyyyMM)
 * @return 마지막 날짜
 * @example
com.getLastDateOfMonth("201510");  // 31
 */
com.getLastDateOfMonth = function(yearMonth) {
	return gcm.date.getLastDateOfMonth(yearMonth);
};

// =============================================================================
/**
 * 외부 솔루션 연동 관련 함수를 정의한다.
 * 주로 gcm.ext 함수 호출
 */
 // =============================================================================

/**
 * Split 객체를 생성하고 반환한다.
 * 생성된 객체는 창을 닫을때 메모리 반환을 위해 반드시 scwin 객체 하위 객체로 리턴 받도록 한다. 
 *
 * @param {Array} grpIdArr Split 를 적용할 그룹 Array
 * @param {Object} options Split 옵션 (Split.js 스펙 참조 - https://split.js.org/)
 * @param {Object} options.direction Split 방향 (default : horizontal) horizontal / vertical
 * @param {Array} options.sizes Split 초기 Size Array (Split 를 적용할 그룹 Array 와 동일 수)
 * @param {Int|Array} options.minSize Split 최소 Size (Int 또는 Split 를 적용할 그룹 Array 와 동일 수)
 * @param {Function} options.onDblClick gutter 더블 클릭 이벤트
 * @return Split 객체
 * @example
scwin.splitA = com.setSplit(['a', 'b'], {direction: 'vertical', minSize: 180, sizes: [70, 30]});
 */
com.setSplit = function(grpIdArr, option) {
	return gcm.ext.setSplit(scwin, grpIdArr, option);
};

/**
 * Split onDblClick 옵션 설정시 gutter 더블 클릭이벤트 처리 (quick search 영역 접기 용도로 사용)
 *
 * @param {Object} splitObj Split 객체
 * @param {Object} quickSrchId quick search 영역 Id
 * @example
scwin.splitA = com.setSplit(['a', 'b'], {direction: 'horizontal', minSize: 100, sizes: [20, 80], onDblClick : function() {
		// onDblClick 옵션 설정시 gutter 더블 클릭이벤트 처리 (quick 검색영역 접기 용도로 사용)
		com.splitQuickSearchDblClick(scwin.splitA, "a");
}});
 */
com.splitQuickSearchDblClick = function(splitObj, quickSrchId) {
	gcm.ext.splitQuickSearchDblClick(scwin, splitObj, quickSrchId);
};

/**
 * 그리드 다단콤보 적용시 oncustompaste 이벤트에 적용할 함수
 * 20210713 엔진에서 그리드에 코드 레이블로 붙여넣기시 linkedDataList로 NodeSet 되어있는 select 값 셋팅 안되는 문제
 *
 * @param {Object}	e  객체
com.oncustompaste = function (e) {
	gcm.data.oncustompaste.call(this, e);
};
 */
/*
com.isExcept = function (kindCd, serviceId, value, allow_yn = "Y"){
	com.executeDynamic( {id : "sbm_temp", action : '/SvcExceptProcess.pwkjson'}, { 
		  processMsg : ""
		, requestData : { "kind_cd": "XEK040", "service_id": "RB42", "value": "20120467", "allow_yn": "Y" }
		, mode : 'asynchronous'
		, successCallback : function(e) {
			debugger;
			console.log( e.responseJSON.elData);
		}
	});	
};
*/




/**
 * 데이터 통신용 공통 내부 메소드, 추가 gcm 영역으로 이동 및 리펙토링 예정
 * @date 2023. 4. 12.
 * @memberOf member
 * @param param
 * @returns returns 
 * @author James
*/ 
com.fetchData = async function (kindCd, serviceId, value, allowYn = 'Y', url) {
  try {
    const response = await fetch(url, {
      method: 'POST',
      headers: {'Content-Type': 'application/json', 'Proworks-Lang' : 'ko'},
      body: JSON.stringify({
        'elHeader': {'locale': 'ko'},
        'userHeader': {'implExcel': false, 'excel': false},
        'elData': { 'kind_cd': kindCd, 'service_id': serviceId, 'value': value, 'allow_yn': allowYn }
      })
    });
    return await response.json();
  } catch (e) {
    console.error(e);
    return null;
  }
};


/**
 * 예외처리 확인용 메소드로 예외 종류 별로 하드코딩을 제거하고 데이터로 관리하기 위해 작성되었다.
 *  - 메소드 postfix 에 await 이 있다면 해당 키워드를 붙여서 호출하고 마치 동기 호출과 같이 코딩을 구사한다.
 *
 * @param {String} kindCd 예외처리의 종류, 공통코드 XEK
 * @param {String} serviceId 서비스 화면 아이디
 * @param {String} value 실제 비교 값
 * @param {String} allowYn Optional 이고 Default 는 Y
 * @return {Boolean} 패스 여부
 * @example 
 * 
	let syspayno = '20120467';
	const isExcept = await com.isExceptAwait('XEK040', 'RB42', syspayno);
	if ( (1 == 1 && 1 == 2) || isExcept) {
		// 비즈니스 로직
		: 
	}
 */
com.isExceptAwait = async function(kindCd, serviceId, value, allowYn = 'Y') {
  const data = await com.fetchData(kindCd, serviceId, value, allowYn, '/SvcExceptProcess.pwkjson');
  if (data) {
    return data.elData.pass;
  }
  return false;
};


/**
 * 예외처리 확인용 메소드로 예외 종류 별로 하드코딩을 제거하고 데이터로 관리하기 위해 작성되었다.
 *  - 메소드 postfix 에 await 이 있다면 해당 키워드를 붙여서 호출하고 마치 동기 호출과 같이 코딩을 구사한다.
 *  - 예외 데이터 배열을 직접 반환하며 Null Safe 하게 반환되었다.
 *
 * @param {String} kindCd 예외처리의 종류, 공통코드 XEK
 * @param {String} serviceId 서비스 화면 아이디
 * @param {String} value 실제 비교 값
 * @param {String} allowYn Optional 이고 Default 는 Y
 * @return {Array} 예외 데이터 배열, Null Safe
 * @example 
 * 
	let syspayno = '20120467';
	const values = await com.getExceptAwait('XEK040', 'RB42', syspayno);
	if ( (1 == 1 && 1 == 2) || isExcept) {
		// 비즈니스 로직
		: 
	}
 */
com.getExceptAwait = async function(kindCd, serviceId, allowYn = 'Y') {
  const data = await com.fetchData(kindCd, serviceId, '', allowYn, '/SvcExceptValues.pwkjson');
  if (data && data.elData.values) {
    return data.elData.values.split(/,/);
  }
  return [];
};


/**
 * rMateChart 기본 옵션 정보를 리턴 한다.
 */
com.getChartDefOpt = function() {
	return {
        layoutUrl : "", 					// 차트 설정 xml url
        data : [],							// 차트 데이터 json array
        chartId : "",						// 차트 id com.makeChart 호출시 설정됨
        chartBox : {},						// 차트 생성 영역(id 속성이 정의된 websquare 컴포넌트 Group)
        useDataEditor : "false",			// 차트 데이터 테이블 사용 여부 (header.xml에 관련 설정이 추가되어있음)
        accessibility : "true",				// 시각장애인용 대체 텍스트 적용 여부
        usePattern : "false",				// 시각장애인용 패턴 사용 여부
        displayCompleteCallFunction : "" 	// 차트 완성 후 호출되는 함수, 함수명을 넣어도 호출이 안됨, 일단 옵션은 생성해 둠. 2022.07.06 이상철
	};
};

/**
 * rMateChart를 생성 한다.
 * @param {Object} opt 차트 생성 옵션
 */
com.makeChart = function(opt) {
	
    var chartOpt = {
        useDataEditor : "false",
        usePattern : "false",
        accessibility : "true",	
        usePattern : "false",
        displayCompleteCallFunction : ""
    };
    // 차트 생성시 전달 되는 파라미터
    var chartVarKey = [
	    	"useDataEditor", 					// 데이터 에디터 사용여부 (true/false(기본))
	    	"accessibility",					// 접근성 설정
	    	"usePattern",						// 패턴이미지 사용여부 (true/false(기본))
	    	"displayCompleteCallFunction",		// 차트에 데이터가 모두 렌더링된 후 호출할 함수를 설정
    	];
    
    // 사용자 정의 옵션 머지
    Object.assign(chartOpt, opt);
    
    var chartVars = []; // 차트 생성시 전달될 옵션(chartVars)  
    // 차트생성시 전달될 chartVars 생성
    chartVarKey.forEach(function(key, idx){    	
    	if(chartOpt[key]) {    		
    		chartVars.push(key + "=" + chartOpt[key]);
    	}
    });
    
    // chartId를 unique하게 생성하기 위해 차트생성 영역의 id + "_chart"로 설정한다.
    chartOpt.chartId = chartOpt.chartBox.getID() + "_chart";
    
    if(com.isEmpty(chartOpt.layoutUrl)) {
        console.error("차트 레이아웃이 없습니다.");
        return;
    } else if($.isEmptyObject(chartOpt.chartBox)) {
        console.error("차트 생성 영역 정보가 없습니다.");
        return;
    } else if(com.isEmpty(chartOpt.chartBox.getID())) {
        console.error("차트 생성 영역 정보가 없습니다.");
        return;
    }
    var varchartsStr = chartVars.join("&");
    console.log("차트("+chartOpt.chartId+") 생성 옵션(chartVars) 정보 : ", varchartsStr);
    // 넓이,높이 100%인경우 차트가 숨겨져있는 버그가 있음
    // 넓이를 100% 미만으로 주면 괜찮은듯.
    rMateChartH5.create(chartOpt.chartId, chartOpt.chartBox.getID(), varchartsStr, "99.999%", "100%");
    
    rMateChartH5.calls(chartOpt.chartId, {
          "setLayoutURL" : chartOpt.layoutUrl,
          "setData" : chartOpt.data
        });
};

//오즈 리포트 관련
com.oz = {};
/**
 * 디폴트 오즈 파라미터 객체를 리턴 한다.
 * @return {Object} 오즈 레포트 팝업시 전달 할 파라미터
 * 
 */
com.oz.getDefOzInfo = function() {
	return {	
		ozr : "",			// ozr 파일 경로, 
		odi : "",			// odi 파일명
		param : "",			// odi 파라미터 정보 예)key1=value1&key2=value2 
		displayname : ""	// 다건 레포트인경우 미리보기 화면 좌측 트리에 보여질 레포트 명
	};
};

/**
 * 레포트를 Wframe에 연다. *
 * @param {Object} wframeComp WFrame Component
 * @param {array} reportArray 레포트 정보 array
 * @param {boolean} isConcatpage 멀티폼을 하나의 리포트 처럼 이용할 지 여부 true/false
 * @param {boolean} printMode 프린트 모드, true : silent(윈도우출력창)로 설정, 그외 ""(오즈출력창 -> 윈도우출력창) true/false
 * @param {String} filename 저장 시 파일명
 * @param {String} applyformat 저장 포맷 목록(확장자) 문자열, 여러 확장자는 콤마 (,)로 분류 예)pdf,hwp,html
 * @example
 */
com.oz.setOzWframe = function(wframeComp, reportArray, isConcatpage, printMode, filename, applyformat) {
	// 새로 열리는 WFrame 화면에 파라미터를 전달하는 예제 

	// 실제 전달할 데이터 정의
	var rowJSON = {
		reportArr : (reportArray instanceof Array) ? reportArray : [reportArray],
		isConcatpage : isConcatpage,
		printMode : printMode,
		filename : filename,
		applyformat : applyformat || "pdf,hwp,hml,doc,ppt,xls,html,cvs,txt,jpg,tif,svg,mht,ozd"
    }; 
	
	// 새로 열릴 화면에 데이터를 전달 (dataObject를 통해 전달 가능)         
	var obj = { 
            "dataObject": {
            "type" : "json",  
            "name" : "param",  
            "data" : rowJSON
       	} 
   	};
	
	var reportPopUrl = "/cm/xml/cmnOzReportPop.xml";
	
	if(com.isEmpty(rowJSON.reportArr[0].ozrCode) && com.isEmpty(rowJSON.reportArr[0].formAlias)) {
		console.error("리포트 파일 경로 정보가 없습니다.");
		return;
	}
	
	wframeComp.setSrc(reportPopUrl, obj);
};

/**
 * 레포트 팝업창을 연다. *
 * @param {array} reportArray 레포트 정보 array
 * @param {boolean} isConcatpage 멀티폼을 하나의 리포트 처럼 이용할 지 여부 true/false
 * @param {boolean} printMode 프린트 모드, true : silent(윈도우출력창)로 설정, 그외 ""(오즈출력창 -> 윈도우출력창) true/false
 * @param {String} filename 저장 시 파일명
 * @param {String} applyformat 저장 포맷 목록(확장자) 문자열, 여러 확장자는 콤마 (,)로 분류 예)pdf,hwp,html
 * @example
 */
com.oz.openPopup = function(reportArray, isConcatpage, printMode, filename, applyformat, option) {
	if (com.isEmpty(option) || typeof option !== 'object') {
		option = {};
	}
	
	// 레포트 미리보기 팝업 화면 url
	var reportPopUrl = "/cm/xml/cmnOzReportPop.xml";
	
	// 레포트 팝업 옵션 고정 항목
	var defOpt = {
		id			: option.id,
		type 		: "browserPopup",
		width 		: option.width  || 1012,
		height 		: option.height || 710,
		popupName 	: "",
		resizable 	: true,
		modal 		: false,
		scrollbars 	: true
	};
	
	var data = {
		reportArr : (reportArray instanceof Array) ? reportArray : [reportArray],
		isConcatpage : isConcatpage,
		printMode : printMode,
		filename : filename,
		applyformat : applyformat || "pdf,hwp,hml,doc,ppt,xls,html,cvs,txt,jpg,tif,svg,mht,ozd"
	};
	if(com.isEmpty(data.reportArr[0].ozrCode) && com.isEmpty(data.reportArr[0].formAlias)) {
		console.error("리포트 파일 경로 정보가 없습니다.");
		return;
	}
	
	gcm.pop.openPopup(scwin, reportPopUrl, defOpt, data, undefined);
};

// 상위 com.oz.openPopup의 확장성을 위해 기존에 사용하던 함수와 분리해 option을 받게 수정
com.oz.open = function(reportArray, option) {
	if (com.isEmpty(option) || typeof option !== 'object') {
		option = {};
	}
	
	com.oz.openPopup(reportArray, option.isConcatpage, option.printMode, option.filename, option.applyformat, option);
};

/**
 * 데이터 컬렉션의 value 들 중 type == string 인 데이터의 앞 뒤 공백을 제거하는 함수
 * @param {object|string} dataObj - trim할 데이터컬렉션
 * @param {Array.<string>} excludeColumn - 데이터컬렉션 중 trim을 무시할 Column ID
 * @author Chris
 * @example
 * 
 * // dlt_list -> [{ "ex" : "   abc"},{ "ex" : "a b c"}]
 * // dma_map  -> { "ex" : "   abc     "}
 * 
 * com.trimDataCollection(dlt_list); // [{ "ex" : "abc"},{ "ex" : "a b c"}]
 * com.trimDataCollection(dma_map); // { "ex" : "abc"}
 */
com.trimDataCollection = function(dataObj, excludeColumn) {
	let trimObject = (obj, excludeColumn) => {
    	var retArr = [];
    	Object.entries(obj).map(
			([key, value]) => {
				
				if (excludeColumn.length == 0 || excludeColumn.some(col => key != col)) {
				    value = typeof value === 'string' ? value.trim() : value
				}
				
                retArr.push([key, value]);
			}
		)
    	
    	return Object.fromEntries(retArr);
	};
	
	if (typeof dataObj === "string")
		dataObj = com.getComponent(dataObj);
	
	if (!Array.isArray(excludeColumn))
		excludeColumn = [excludeColumn];
		
	if (com.isEmpty(dataObj)) return;
	
	let trimData;
	
	// DataCollection 내에 존재하는 initializeType 사용 (dataMap, dataList)  
    if (dataObj.initializeType === "dataMap") {
        trimData = dataObj.getJSON();
    } else {
    	trimData = dataObj.getAllJSON();
    }

    if (Array.isArray(trimData)) {
		dataObj.setJSON(trimData.map(item => trimObject(item, excludeColumn)));
    } else {
    	dataObj.setJSON(trimObject(trimData, excludeColumn));
    }
    
};

/**
 * 업무 화면 상단에 있는 제목표시줄(contentTitle.xml)에 있는 새로고침 버튼 클릭하는 효과와 같은 효과
 * scwin.onpageload() 함수를 다시 실행한다.
 * @author Sam
 * @example
 * 
 * com.refreshFrame(); // 업무 화면 상단에 있는 제목표시줄(contentTitle.xml) 새로고침 버튼 클릭
 */
com.refreshFrame = function() {
	gcm.win.refreshFrame(scwin);
};

// 첨부파일 관련
/**
 * 첨부파일 공통 모듈
 */
com.file = (function() {
	
	'use strict';
	  
	var james = { // internal name of library
		
		/**
		 * Variable Area
		 */
		  uploadMap: {}
		, uploadObj: []
		, saveCallback: null
		, createCallback: null
		, globalEvents : []
		, hasAttach    : false
		, excludeExtensions : ["hwpx","docx"]
		, excludeEvid : false
		
		/**
		 * Initialize function - indicates if our library is present
		 */
		, init: function() {
			var bar = '====================================================';
			var about = {
				  Subject : 'Kitech Attach File Component Library'
				, Version : 2.1
				, Author : 'James'
				, Created : '2022-03-02'
				, Updated : '2022-03-02'
			};
			this.log(bar);
			Object.keys(about).map(function (key) {
				com.file.log( '['+ key +': '+ about[key] +']');
			});
			this.log(bar);
			// 변수 초기화
			this.uploadMap = {};
			this.uploadObj = [];
			this.saveCallback = null;
			this.createCallback = null;
			this.hasAttach = true;
			this.globalEvents = [
				'CreationComplete'
				, 'BeforeAddFile'
				, 'AfterAddAllFile'
				, 'AfterAddFile'
				, 'BeforeDeleteFile'
				, 'BeforeUpload'
				, 'UploadComplete'
				, 'CustomAction'
				, 'UploadingCancel'
				, 'OnError'
				, 'CustomAction'
			];
//			// 이벤트 헨들러 매핑
//			window.RAONKUPLOAD_CreationComplete = this.event.creationComplate;
//			window.RAONKUPLOAD_AfterAddAllFile = this.event.afterAddAllFile;
//			window.RAONKUPLOAD_AfterAddFile = this.event.afterAddFile;
//			window.RAONKUPLOAD_BeforeDeleteFile = this.event.beforeDeleteFile;
//			window.RAONKUPLOAD_BeforeUpload = this.event.beforeUpload;
//			window.RAONKUPLOAD_UploadComplete = this.event.uploadComplete;
//			window.RAONKUPLOAD_CustomAction = this.event.customAction;
//			window.RAONKUPLOAD_UploadingCancel = this.event.uploadingCancel;
//			window.RAONKUPLOAD_OnError = this.event.onError;
//			window.RAONKUPLOAD_CustomAction = this.event.customAction;
			com.file.globalSetting();
			this.log('init(): 이벤트 헨들러 매핑 완료!!');
		}
		, globalSetting : function() {
			console.log("Page Change, Event Setting uploadObj ------------- ");
			console.log(com.file.uploadObj);
			console.log(com.file.uploadMap);
			console.log("--------------------------------------------------")
			
			if (com.file.uploadObj.length > 0 &&
					(RAONKUPLOAD.RAONKMULTIPLEID && RAONKUPLOAD.RAONKMULTIPLEID[0] === com.file.uploadObj[0].uploadId.ID)) {
				return;
			}
			
			this.globalEvents.forEach(function(globalEvent, i) {
				var localEvent = globalEvent.charAt(0).toLowerCase() + globalEvent.slice(1);
				window["RAONKUPLOAD_"+globalEvent] = com.file.event[localEvent];
			});
			if (gcm.attach.globalRaonkUploaderArr) {
				var uploadArray = [];
				var uploadIdArray = [];
				com.file.uploadObj.forEach(function(obj) {
					uploadArray[obj.uploadId.frameID] = gcm.attach.globalRaonkUploaderArr[obj.uploadId.frameID];
					uploadIdArray.push(obj.uploadId.ID);
//					uploadArray.length = uploadIdArray.length;
				})
				RAONKUPLOAD.RAONKMULTIPLE = uploadArray;
				RAONKUPLOAD.RAONKMULTIPLEID = uploadIdArray;
			}
		}
		/**
		 * 업로드 컴포넌트 생성 여부 반환
		 */
		, isCreated: function(uploadId){
			return 0 < this.uploadObj.length && com.file.uploadObj.some( function(upload){ 
				return upload.uploadId.ID === uploadId; 
			});
		}
		
		/**
		 * 파일키 생성 여부 반환
		 */
		, hasFilekey: function(uploadId){
			return this.uploadMap[uploadId].fileKey.length != 4;
		}
		
		/**
		 * 업로드 여부 갱신
		 */
		, setUploaded: function(uploadId, isSync){
			this.uploadMap[uploadId].is_sync = isSync;
		}
		
		/**
		 * 업로드 여부 반환
		 */
		, isUploaded: function(uploadId){
			return this.uploadMap[uploadId].is_sync;
		}
		
		/**
		 * 모든 컴포넌트 업로드 여부 반환
		 */
		, isUploadedComplete: function(){
			
			return Object.keys(com.file.uploadMap).every( function(uploadId){
				return com.file.isUploaded(uploadId);
			});
		}
		
		/*
		/**
		 * 다건의 첨부파일 컴포넌트를 생성한다.
		 */
		, createMulti: function(objs, obj, callback) {
			if (obj && 0 < objs.length) {
				com.file.create(obj.uploadId, obj, function(){
					console.log("재귀 호출!! >> " + obj.uploadId);
					(com.file.createMulti)(objs, objs.shift(), callback);
				});
			} else {
				com.file.create(obj.uploadId, obj, callback);
				console.log("재귀 호출 else !! >> " + obj.uploadId);
			}
		}
		
		/**
		 * 첨부파일 컴포넌트 생성
		 */
		, create: async function(uploadId, obj, createCallback){
			return new Promise((resolve, reject) => {

				if (null ===  uploadId || undefined ===  uploadId || null ===  obj || undefined ===  obj){
					alert('파라미터 누락으로 인해 첨부파일 컴포넌트 생성에 실패하였습니다.');
					return;
				}
				obj.fileKey= obj.fileKey.trim();
				if (4 > obj.fileKey.length){
					alert('파라미터(첨부파일 번호) 오류로 인해 첨부파일 컴포넌트 생성에 실패하였습니다.');
					return;
				}

				if (obj.allowExtension && obj.limitExtension){
					alert('[allowExtension], [limitExtension] 파라미터는 상호 배타적 관계입니다.');
					return;
				}
				
				var isDup = com.file.uploadObj.some(function(obj) {
					return obj.uploadId.ID === uploadId; 
				});
				
				let succCallback = function(resData) {
					try {
						if (typeof createCallback === "function") 
							(createCallback)(resData);

						resolve(true);
					} catch {
						reject(false);
					}
				}
				
				// 이중맵으로 컴포넌트ID 와 파라미터객체(첨부파일 번호, 모드 등)를 매핑한다.
				obj.is_sync = true; 
				this.uploadMap[uploadId] = obj;
				this.createCallback = succCallback;
				this.uploadMap[uploadId].excludeEvid = obj.excludeEvid || false;
				
				var param = {
					  Id: uploadId
					, UploadHolder: uploadId
					, SkinName: 'blue'
					, StatusBar: '0'
					// 컴포넌트 표시여부 기본값은 true
					, InitVisible:  undefined === obj.isVisible || obj.isVisible ? true : false	
					, Width: '100%'
					, Height: eval(uploadId).getStyle('height')
					, ButtonBarEdit: 'custom_button_action1|미리보기,download,add,remove,remove_all'
					, ButtonBarView: 'custom_button_action2|미리보기,open,download,download_all'
					, RootPath: '/cm/ext/raonkupload/'
				};

				// 파일 제한 설정
				if (obj.allowExtension) { 
					param.ExtensionAllowOrLimit = '1';
					param.ExtensionArr = obj.allowExtension;
				} else if(obj.limitExtension){
					param.ExtensionAllowOrLimit = '0';
					param.ExtensionArr = obj.limitExtension;
				}
				
				// 파일 제한 설정
				if (obj.maxOneFileSize) {
					param.MaxOneFileSize = maxOneFileSize;
				} else if(obj.maxTotalCount){
					param.MaxTotalFileCount = maxTotalCount;
				}
				
				if (obj.isShowHeaderBar) param.HeaderBar = '1';
				if (obj.customWebFileColor) param.CustomWebFileColor = '#ffc0cb';
				
				if (isDup) {
					// 컴포넌트 생성
					new RAONKUpload(param);
				} else {
					// 컴포넌트 생성
					this.uploadObj.push({ uploadId: new RAONKUpload(param)});
				}

				

				// 로깅 출력
				this.log( 'create(): 첨부파일 컴포넌트 생성 완료!!');
			});
		}
		
		, destroy: function(uploadIds) {
			// 내부 관리되는 컴포넌트 삭제: 다른 페이지의 컴포넌트까지 삭제 되는 문제 발생
//			if (this.uploadObj){
//				this.uploadObj.forEach( function (obj){
//					console.log("[" + obj.id + "] 삭제");
//					RAONKUPLOAD.Destroy(obj.id);	// 컴포넌트 자원 해제
//					this.uploadMap[obj.id] = null;
//				});
//			}
			
			// 파라미터로 전달 받은 컴포넌트 삭제: 해당 페이지의 컴포넌트만 삭제 하지만 사용자 이벤트가 발생하지 않으면 기존과 같은 문제 발생
			if (uploadIds) {
				uploadIds.forEach( function (uploadId){
					console.log("[" + uploadId + "] 삭제");
					RAONKUPLOAD.Destroy(uploadId);	// 컴포넌트 자원 해제
					this.uploadMap[uploadId] = null;
				});
			}
		}
		
		, deleteWframe: function(wframeId) {
			if (wframeId && this.uploadObj) {
				this.uploadObj.forEach( function (obj){
					if (obj.id.startsWith(wframeId)) {
						console.log("[" + obj.id + "] 삭제");
						RAONKUPLOAD.Destroy(uploadId);	// 컴포넌트 자원 해제
					}
				});
			}
		}		

		/**
		 * 이미 생성된 컴포넌트에 첨부파일 데이터 세팅
		 */
		, setData: function(uploadId, fileKey){
			if (null ===  uploadId || undefined ===  uploadId || null ===  fileKey || undefined ===  fileKey){
				alert('파라미터 누락으로 인해 첨부파일 컴포넌트 생성에 실패하였습니다.');
				return;
			}
			fileKey = fileKey.trim();
			if (undefined === fileKey || 4 > fileKey.length){
				alert('파라미터(첨부파일 번호) 오류로 인해 첨부파일 번호 생성에 실패하였습니다.');
				return;
			}

			// 이중맵으로 컴포넌트ID 와 파라미터객체(첨부파일 번호, 모드 등)를 매핑한다.
			this.uploadMap[uploadId].fileKey = fileKey;

			if (4 == fileKey.length){
				com.file.biz.generateKey( uploadId, fileKey);
			} else {
				com.file.biz.setAttachFiles( uploadId, fileKey, this.uploadMap[uploadId].target);
			}
		}

		/**
		 * 첨부파일 전송 및 콜백 메소드 호출
		 */
		, transport: function(saveCallback){
			// 저장용 업무 메소드
			if (undefined === saveCallback || 'function' !== typeof saveCallback){
				alert("업무데이터 저장시 사용될 콜백 함수를 지정하여야 합니다!!");
				return;
			}
			
			// 전체 업로드 컴포넌트가 무결하지 않을 때 전체 전송 후 업무 저장을 위해 callback 의 레퍼런스를 저장
			this.saveCallback = saveCallback;
			
			if (com.file.isUploadedComplete()){
				// 전체 업로드 컴포넌트가 무결하다면 즉시 업무 페이지 저장
				(saveCallback)(Object.keys(this.uploadMap).reduce( function(acc, key){
					var webFile = RAONKUPLOAD.GetListInfo('array', key).webFile;
					if (webFile != null) {
						acc[key.substring(key.lastIndexOf("_upload")+1)] = com.file.uploadMap[key].fileKey;
					}
					return acc;
				}, {}));
				console.log("저장중uploadCOmplete");
			} else {
				com.file.action.transferAll();
//				Object.keys(this.uploadMap).forEach( function(uploadId){
//				 this.uploadMap.key.forEach( function(uploadId){
//					if (false === com.file.isUploaded(uploadId)){
//						com.file.action.transfer(uploadId);
//					}
//				});
			}
			
		}
		
		/**
		 * 전체 컴포넌트의 모든 파일을 삭제
		 */
		, deleteAll: function(param){
			var arrayDel = [];
			if ('function' === typeof param) {
				var removeCallback = param;
				Object.keys(this.uploadMap).forEach( function(uploadId){
				// this.uploadMap.key.forEach( function(uploadId){
					var dataArray = RAONKUPLOAD.GetListInfo('array', uploadId);
					if (dataArray.webFile){
						arrayDel = arrayDel.concat(dataArray.webFile);
					}					
				});
			} else {
				arrayDel = arrayDel.concat(param);
			}

			if (arrayDel && 0 < arrayDel.length && arrayDel[0] != null){
				var arrayObj = [];
				arrayDel.forEach( function(del) {
					var attachFileNo = com.file.util.makeAttachFileNo(del.uploadPath);
					arrayObj.push({attach_file_no: attachFileNo, seq: del.uniqKey, fileKey: del.uploadPath, which: del.customValue});
				});
				com.file.biz.deleteFiles(arrayObj, removeCallback);
			} else {
				// 삭제할 첨부파일이 없다면 콜백함수만 호출
				(removeCallback)();
			}
		}
		
		/**
		 * 특정 컴포넌트의 파일정보를 백터로 반환
		 */
		, getAttachFiles: function(uploadId){
			var dataArray = RAONKUPLOAD.GetListInfo('array', uploadId);
			var vec = [];
			if (dataArray && dataArray.mergeFile){
				dataArray.mergeFile.forEach( function(data){
					var doc = {};
					doc.attach_file_no = com.file.util.makeAttachFileNo(data.uploadPath);
					doc.seq = com.file.util.makeAttachFileNoSeq(data.uploadPath);
					doc.file_nm = data.originalName;
					doc.extens_nm = data.originalName.substring( data.originalName.lastIndexOf('.')+1);
					doc.size = data.size;
					vec.push(doc);
				});
			}
			return vec;
		}
		
		, log: function(str){
			if (window.console && window.console.log) {
				window.console.log( str);
			}
			if (WebSquare && WebSquare.logger) {
				WebSquare.logger.printLog( str);
			}						
		}  // page directives or sub libraries
		
		/**
		 * 유틸리티 패키지
		 */
		, util: {
			rpad: function(label, space, digit){
			    if (!label || !space || label.length >= digit) return label;
			    for (var i = 0; i < ((digit - label.length) / space.length); i++) label += space;
			    return label;
			}
			
			// array
			, newArrayToString: function(arrayNew) {
			
				var str = '-- 업로드 파일 정보 시작 '+ new Date().toISOString().slice(0,19).replace(/T/g, ' ') +' --\n';
				str += this.rpad('RealFileName', ' ', 20) + ' : {0}\n';
				str += this.rpad('ServerFileName', ' ', 20) + ' : {1}\n';
				str += this.rpad('IsLargeFile', ' ', 20) + ' : {2}\n';
				str += this.rpad('Size', ' ', 20) + ' : {3}\n';
				str += this.rpad('UploadPath', ' ', 20) + ' : {4}\n';
				str += this.rpad('LogicalPath', ' ', 20) + ' : {5}\n';
				str += this.rpad('fileExtention', ' ', 20) + ' : {6}\n';
				str += this.rpad('LocalPath', ' ', 20) + ' : {7}\n';
				str += this.rpad('CustomValue', ' ', 20) + ' : {8}\n';
				str += this.rpad('ResponseCustomValue', ' ', 20) + ' : {9}\n';
				str += this.rpad('Order', ' ', 20) + ' : {10}\n';
				str += '-- 업로드 파일 정보 끝 --\n';
				
				str = str.replace('{0}', arrayNew.map(function(element){ return element.originalName; }).join(','));
				str = str.replace('{1}', arrayNew.map(function(element){ return element.uploadName; }).join(','));
				str = str.replace('{2}', arrayNew.map(function(element){ return element.isLargeFile; }).join(','));
				str = str.replace('{3}', arrayNew.map(function(element){ return element.size; }).join(','));
				str = str.replace('{4}', arrayNew.map(function(element){ return element.uploadPath; }).join(','));
				str = str.replace('{5}', arrayNew.map(function(element){ return element.logicalPath; }).join(','));
				str = str.replace('{6}', arrayNew.map(function(element){ return element.fileExtension; }).join(','));
				str = str.replace('{7}', arrayNew.map(function(element){ return element.localPath; }).join(','));
				str = str.replace('{8}', arrayNew.map(function(element){ return element.customValue; }).join(','));
				str = str.replace('{9}', arrayNew.map(function(element){ return element.responseCustomValue; }).join(','));
				str = str.replace('{10}', arrayNew.map(function(element){ return element.order; }).join(','));

				com.file.log(str);	
			}
			
			, delArrayToString: function(arrayDel) {
			
				var str = '-- 삭제된 파일 정보 --\n';
				str += this.rpad('Key', ' ', 8) + ' : {0}\n';
				str += this.rpad('FileName', ' ', 8) + ' : {1}\n';
				str += this.rpad('Size', ' ', 8) + ' : {2}\n\n';
				str += '-- 삭제된 파일 정보 끝 --\n';
				
				str = str.replace('{0}', arrayDel.map(function(element){ return element.uniqKey; }).join(','));
				str = str.replace('{1}', arrayDel.map(function(element){ return element.originalName; }).join(','));
				str = str.replace('{2}', arrayDel.map(function(element){ return element.size; }).join(','));
			
				com.file.log(str);
			}
			
			, makeAttachFileNo: function(path){
				return path.substr(path.lastIndexOf('/')+1, 13);
			}
			
			, makeAttachFileNoSeq: function(path){
				return path.substr(path.length-2);
			}
			
			, isAllowEvid : function(fileExt) {
				return !com.file.excludeExtensions.some((extension) => extension == fileExt);
			}
			
			, getFileCount : function(uploadId) {
				return com.file.action.getTotalFileCount(uploadId);
			}
		}

		/**
		 * Raon 콜백 이벤트를 랩핑한 패키지
		 */
		, event: {
			
			/**
			 * 컴포넌트 생성 완료 후 콜백
			 */
			creationComplete: function(uploadId){
				
				
				com.file.log( '업로드 생성 완료 데이터 조회 후 세팅: ' + uploadId);
				com.file.action.setUploadMode(com.file.uploadMap[uploadId].mode, uploadId);

				var fileKey = com.file.uploadMap[uploadId].fileKey;
				// 유효한 fileKey 라면 데이터 조회 후 컴포넌트 세팅
				if (undefined === fileKey || '' === fileKey || 4 > fileKey.length){
					alert("첨부파일 컴포넌트 생성시 파라미터 오류!");
					return;
				}

				if (4 == fileKey.length){
					com.file.biz.generateKey( uploadId, fileKey);
				} else {
					com.file.biz.setAttachFiles( uploadId, fileKey, com.file.uploadMap[uploadId].target);
				}
				
				gcm.attach.globalRaonkUploaderArr["raonkuploader_frame_" + uploadId] = RAONKUPLOAD.RAONKMULTIPLE["raonkuploader_frame_" + uploadId];
//				gcm.attach.globalRaonkUploaderIdArr.push(uploadId);
//				gcm.attach.globalRaonkUploaderArr.length = gcm.attach.globalRaonkUploaderIdArr.length;
				
				if (com.file.uploadMap[uploadId].mode === 'open') {
					$('iframe[id="raonkuploader_frame_' + upload_A.getID() + '"]').contents().find('.fbutton button').hide();
				}
			}
		
			/**
			 * 파일 추가 완료 후 콜백
			 */
			, beforeAddFile: function(uploadId, fileInfo) {
				if (fileInfo && fileInfo["strName"].indexOf(".") <= -1) {
					com.alert("확장자가 없는 파일은 업로드 할 수 없습니다.");
					return false;
				}
				
				if (fileInfo) {
					var fileName = fileInfo["strName"] || "";
					var extName	 = fileName.substring(fileName.lastIndexOf(".") + 1);
					var isEvid	 = com.file.uploadMap[uploadId].is_evid;
					var isExclude= com.file.uploadMap[uploadId].excludeEvid;
					
					if (!isExclude && isEvid && !com.file.biz.isValidEvid(extName)) {
						com.alert(extName + " 확장자 파일은 증빙변환 불가 등의 문제로 업로드 불가능합니다.\n업로드 가능한 pdf, hwp, jpg, doc 등의 파일로 변환 후 업로드 해주시기 바랍니다.");
						return false;
					}
				}
			}
		
			/**
			 * 파일 추가 전 이벤트
			 */
			, afterAddAllFile: function(uploadId) {
				com.file.log('파일 전체 추가 완료(afterAddAllFile)');
				var dataMap = com.file.uploadMap[uploadId];
				com.file.setUploaded(uploadId, false);	// 업로드 무결성 제거
				com.file.log('파일 전체 추가 완료(afterAddAllFile): ' + uploadId + ', attach_file_no 설정: ' + dataMap.fileKey);
				RAONKUPLOAD.AddFormData('attachFileNo', dataMap.fileKey);
			}

			/**
			 * 파일 추가 완료 후 콜백
			 */
			, afterAddFile: function(uploadId, fileInfo) {
				var dataMap = com.file.uploadMap[uploadId];
				com.file.setUploaded(uploadId, false);	// 업로드 무결성 제거
				com.file.log('파일추가 완료(afterAddFile): ' + uploadId + ', attach_file_no 설정: ' + dataMap.fileKey);
				RAONKUPLOAD.AddFormData('attachFileNo', dataMap.fileKey);
				// RAONKUPLOAD.SetFileCustomValue("-1", dataMap.get('fileKey'), uploadId);
			}

			/**
			 * 파일 제거 전 콜백
			 */
			, beforeDeleteFile: function(uploadId) {
				com.file.log('파일제거 시작(beforeDeleteFile):  ' + uploadId);
				com.file.setUploaded(uploadId, false);	// 업로드 무결성 제거
			}
			
			/**
			 * 파일 전송 전 콜백 파일 변경이 있는 경우에만 수행 됨
			 */
			, beforeUpload: function(uploadId) {
				com.file.log('업로드 시작(beforeUpload): ' + uploadId);
				var dataMap = com.file.uploadMap[uploadId];
				RAONKUPLOAD.AddFormData('target', com.file.uploadMap[uploadId].target);
				
				var dataArray = RAONKUPLOAD.GetListInfo('array', uploadId);
				var arrayNew = dataArray.newFile;
				var arrayDel = dataArray.deleteFile;
				
				if (arrayNew){
					// 추가된 파일이 있으므로 핸들러에서 자동 처리(삭제 처리 후 신규 파일 저장)
					if (arrayDel) {
						// 핸들러에서 삭제시 동시성 문제가 발생하여 공통 비즈니스 단으로 이관
//						RAONKUPLOAD.AddFormData('removeFiles', arrayDel.map(function(element){
//							return com.file.util.makeAttachFileNoSeq(element.uploadPath); 
//						}).join(','), uploadId);
					}
				} else {
					// 추가된 파일이 없으므로 수동 처리(Ajax 삭제 로직 추가)
					if (arrayDel) {
			 			com.file.deleteAll(arrayDel);
			 		}
				}
			}

			/**
			 * 파일 전송 완료 콜백 - K Upload는 array, json, xml, text delimit 방식으로 결과값을
			 * 제공함, array로 처리
			 */
			, uploadComplete: function(uploadId) {
				// 파일에 대한 정보 중 업로드가 완료된 파일의 정보(업로드 된 파일경로,업로드 된 파일명)는
				// uploadComplete 이벤트 안에서만 추출 가능
				com.file.log('업로드 완료 : ' + uploadId);
				com.file.setUploaded(uploadId, true);
				var dataArray = RAONKUPLOAD.GetListInfo('array', uploadId);
				
				// 전송전 새롭게 추가된 파일, 전송후에는 전송된 파일
				var arrayNew = dataArray.newFile;
				if (arrayNew) com.file.util.newArrayToString(arrayNew);
				
				// 삭제된 파일
				var arrayDel = dataArray.deleteFile;
				if (arrayDel) {
					com.file.util.delArrayToString(arrayDel);
					// 삭제 처리.
					com.file.deleteAll(arrayDel);
				}
				
				// 컴포넌트 상의 모든 파일
				var arrayWeb = dataArray.webFile;
				if (arrayWeb) com.file.util.newArrayToString(arrayWeb);
				// 모든 컴포넌트의 싱크가 참이고,
				
				if (com.file.isUploadedComplete()){
					// 마지막 컴포넌트인 경우에만 업무파트 콜백 함수 실행
					if (uploadId == Object.keys(com.file.uploadMap)[Object.keys(com.file.uploadMap).length -1]) {
						// 전체 업로드 컴포넌트가 무결하다면 즉시 업무 페이지 저장
						(com.file.saveCallback)(Object.keys(com.file.uploadMap).reduce( function(acc, key){
							var mergeFile = RAONKUPLOAD.GetListInfo('array', key).mergeFile;
							if (mergeFile != null) {
								acc[key.substring(key.lastIndexOf("_upload")+1)] = com.file.uploadMap[key].fileKey;
							}
							return acc;
						}, {}));
					}
				}
			}

			/**
			 * 취소 이벤트 콜백
			 */ 
			, uploadingCancel: function(uploadID, paramObj) {
				com.file.log('전송 취소 이벤트 : ' + uploadId);
				if (paramObj.arrUploadedFileList != null && paramObj.arrUploadedFileList != '') {
					com.file.log('업로드 된 파일 리스트');
					var uploadedFileLen = paramObj.arrUploadedFileList.length;
					for (var i = 0; i < uploadedFileLen; i++) {
						com.file.log(paramObj.arrUploadedFileList[i].uploadName + ', ' + paramObj.arrUploadedFileList[i].uploadPath);
					}
				}
			}
			
			/**
			 * 에러 발생 콜백
			 */
			, onError: function(uploadId, paramObj) {
				com.file.log('Error : ' + paramObj.strCode + ', ' + paramObj.strMessage + ', ' + uploadId);	
				if (paramObj.arrUploadedFileList != null && paramObj.arrUploadedFileList != '') {
					com.file.log('업로드 된 파일 리스트');
					var uploadedFileLen = paramObj.arrUploadedFileList.length;
					for (var i = 0; i < uploadedFileLen; i++) {
						com.file.log(paramObj.arrUploadedFileList[i].uploadName + ', ' + paramObj.arrUploadedFileList[i].uploadPath);
					}
				}
				alert('오류['+ paramObj.strCode +']: '+ paramObj.strMessage);
			}
			
			/**
			 * 커스텀 버튼 클릭 이벤트 핸들러
			 */
			, customAction: function(uploadId, command) {
//				if (command == 'custom_button_action1') {
					// HTML로 변환
	//				var convertType = "0";
					// URL로 문서 다운로드 후 변환
	//				var fileType = "URL";
						
					/* 새탭 띄워 첨부파일 미리보기 */
					var dataArray = RAONKUPLOAD.GetSelectedListInfo('array', uploadId);
					var arrayWebFile = dataArray.webFile;
					if (dataArray.newFile) {
						com.alert('신규 파일은 미리보기 할 수 없습니다.');
						return;
					}
					
					if (arrayWebFile && arrayWebFile.length > 1 ) {
						com.alert('미리보기는 파일 한개만 가능합니다.')
						return;
					}
					if (!dataArray.webFile) {
						com.alert('미리 보기 할 파일을 선택해 주세요.')
						return;
					}
					var data = dataArray.webFile[0];
					
					if (!com.file.biz.isValidPreview(data.extension)) {
						com.alert('지원하지 않는 파일 형식입니다.');
						return;
					}
					
					var fileKey = com.file.uploadMap[uploadId].fileKey;
					var seq = data.uniqKey;
					var action = 'SvcPreviewAttach';
					var searchCodeGrpOption = {
				            id : "sbm_previewAttach"
				          , action : `/${action}.pwkjson`
					};
					gcm.sbm.executeDynamic(scwin, searchCodeGrpOption, { 
						  processMsg : ""
						, requestData : { "attach_file_no": fileKey, "seq" : seq }
						, mode : 'asynchronous'
						, successCallback : function(e) {
							window.open(e.responseJSON.elData.attachFullPath, '_blank').focus();
						}
						, exceptionCallback : function(e) {
							com.alert(e.responseJSON.elHeader.resMsg);
						}
					});
//				} else if (command == 'custom_button_action2') {
//					alert('View 미리보기' + uploadId);
//				}
			}
		} // james.event
		
		/**
		 * Raon 액션 메소드를 랩핑한 패키지
		 */					
		, action: {
			/** 파일추가 */
			  openDialog: function(uploadId){
				RAONKUPLOAD.OpenFileDialog(uploadId);
			}
			
			/** 전송시작 */
			, transfer: function(uploadId){
				RAONKUPLOAD.Transfer(uploadId);
			}
			
			/** 전체전송시작 */
			, transferAll: function(){
				RAONKUPLOAD.MultiTransfer();
			}					
			
			/** 모든 파일삭제 */
			, deleteAllFile: function(uploadId){
				RAONKUPLOAD.DeleteAllFile(uploadId);
			}
			
			/** 선택한 파일삭제 */
			, deleteSelectedFile: function(uploadId){
				RAONKUPLOAD.DeleteSelectedFile(uploadId);
			}
			
			/** 선택한 파일 다운로드 */
			, downloadFile: function(uploadId){
				RAONKUPLOAD.DownloadFile(uploadId);
			}

			/** 모든파일 다운로드 */
			, downloadAllFile: function(uploadId){
				RAONKUPLOAD.DownloadAllFile(uploadId);
			}

			/** 전체 파일개수 */
			, getTotalFileCount: function(uploadId){
				return RAONKUPLOAD.GetTotalFileCount(uploadId);
			}

			/** 전체 파일크기(Bytes) */
			, getTotalFileSize: function(uploadId){
				return RAONKUPLOAD.GetTotalFileSize(uploadId);
			}

			/**
			 * 업로드 모드 변경
			 * 
			 * @param mode: edit / view / open / download
			 */
			, setUploadMode: function(mode, uploadId){
				RAONKUPLOAD.SetUploadMode(mode, uploadId);
			}

			/** 업로드 보이기 */
			, show: function(uploadId){		
				if (com.file.isCreated(uploadId)) {
					RAONKUPLOAD.Show(uploadId);
				}
			}

			/** 업로드 숨기기 */
			, hide: function(uploadId){
				if (com.file.isCreated(uploadId)){
					RAONKUPLOAD.Hidden(uploadId);
				}
			}
			
			/** 업로드 초기화 */
			, reset: function(uploadId){
				RAONKUPLOAD.ResetUpload(uploadId);
			}
			
			
			/** 업로드 제거 */
			, destroy: function(uploadId){
				RAONKUPLOAD.Destroy(uploadId);
			}
			
		} // james.action
		
		/**
		 * Kitech 비지니스 패키지
		 */					
		, biz: {

			/**
			 * 지재권 포털 서비스에서 업로드시 용량이 공통테이블에 바이트 단위로 들어가므로 아래와 같이 분기한다.
			 */	
			getFormatSizeByFileSize: function(fileSize) {
				if (-1 < fileSize.indexOf('M')){
					return WebSquare.util.parseFloat( fileSize.replace(/[^0-9|.]/g, ''), 0) * 1024 * 1024;
				} else if (-1 < fileSize.indexOf('K')){
					return WebSquare.util.parseFloat( fileSize.replace(/[^0-9|.]/g, ''), 0) * 1024;
				} else {
					return WebSquare.util.parseFloat( fileSize, 0);
				}
			}

			/**
			 * docid로 첨부파일 키 생성
			 * 키생성 동시성 문제로 인해 sync 처리
			 */
			, generateKey: function(uploadId, docId){
				
				var action = 'SvcGetNumbering';
				var param = '{"numbering": "ATTACH", "prefix": "'+ docId +'"}';				
				WebSquare.net.ajax({
					  action : `/${action}.pwkjson`
					, requestData : `{"elHeader":{"locale":"ko"},"elData":${param}}`
					, mode : 'asynchronous'
					, mediatype : 'application/json'
					, method : 'post'
					, success : function(s){
						console.log('첨부파일 조회 완료!!', s.responseJSON);

						var fileKey = s.responseJSON.elData.gen_no_seq;
						var isEvid = s.responseJSON.elData.is_evid || false;
						if ("" == fileKey || 13 > fileKey.length){
							alert("신규 첨부파일 번호 조회에 실패하였습니다.\n 페이지 재진입 바랍니다.");
							return;	
						}
						// 신규 채번된 첨부파일번호 세팅
						com.file.uploadMap[uploadId].fileKey = fileKey;
						com.file.uploadMap[uploadId].is_evid = isEvid;
						com.file.action.reset(uploadId);
						
						if (com.file.createCallback) {
							(com.file.createCallback)();
						}
					}
					, error : function(e){
						alert("첨부파일번호 생성시 시스템 오류 발생! 페이지 재진입 필요!\n" + e);
					}
				});
			}

			/**
			 * 첨부파일번호에 해당하는 목록 조회
			 */
			, setAttachFiles: function(uploadId, fileKey, customValue){
				var action = 'SvcAttachList';
				var param = '{"attach_file_no": "'+ fileKey +'"}';
				WebSquare.net.ajax({
					  action : `/${action}.pwkjson`
					, requestData : `{"elHeader":{"locale":"ko"},"elData":${param}}`
					, mode : 'asynchronous'
					, mediatype : 'application/json'
					, method : 'post'
					, success : function(response){
						console.log('첨부파일 조회 완료!!', response.responseJSON);
						if (response.responseJSON && response.responseJSON.elData.attachVoList) {
							if (com.file.util.getFileCount(uploadId) > 0) {
								com.file.action.reset(uploadId);
							}
							response.responseJSON.elData.attachVoList.forEach( function(attach, index){	
								var fileUniqueKey = attach.seq;
								var fileName = attach.orgFile;
								var filePath = '/' + attach.attachFullPath;
								var fileSize = com.file.biz.getFormatSizeByFileSize( attach.file_size);
								RAONKUPLOAD.AddUploadedFile(fileUniqueKey, fileName, filePath, fileSize, customValue, uploadId);
							});
							
							if (com.file.uploadMap[uploadId].mode === 'open') {
								var ifrAttachList = $('iframe[id="raonkuploader_frame_' + uploadId + '"]').contents().find('.border_dashed .fname');
								ifrAttachList.each(function(index, e) {
								   this.seq = response.responseJSON.elData.attachVoList[index].seq;
								});
								ifrAttachList.unbind('click').bind('click', function(e) {
									var fileKey = com.file.uploadMap[uploadId].fileKey;
									var seq = this.seq;
									var action = 'SvcPreviewAttach';
									var searchCodeGrpOption = {
								            id : "sbm_previewAttach"
								          , action : `/${action}.pwkjson`
									};
									
									gcm.sbm.executeDynamic(scwin, searchCodeGrpOption, { 
										  processMsg : ""
										, requestData : { "attach_file_no": fileKey, "seq" : seq }
										, mode : 'asynchronous'
										, successCallback : function(e) {
											ifm_preview.setSrc(e.responseJSON.elData.attachFullPath);
										}
										, exceptionCallback : function(e) {
											console.log("첨부파일 미리보기 중 에러발생!", e);
										}
									});
								});
								
								$('iframe[id="raonkuploader_frame_' + uploadId + '"]').contents().find('.border_dashed .fname')[0].click();
							}
						} else {
							console.log("첨부파일 데이터가 스토리지에 없음!!", response);
						}
						
						if (com.file.createCallback) {
							(com.file.createCallback)();
						}								
					}
					, error : function(e){
						console.log("첨부파일 조회시 시스템 오류 발생! 페이지 재진입 필요!", e);
					}
				});
			}

			/**
			 * 파일 일괄 삭제 로직 필요. 업무테이블 삭제
			 */						
			, deleteFiles: function(params, removeCallback){
				var action = 'SvcAttachDel';
				var param = '{"attachVoList": '+ JSON.stringify(params) +'}';

				WebSquare.net.ajax({
					  action : `/${action}.pwkjson`
					, requestData : `{"elHeader":{"locale":"ko"},"elData":${param}}`
					, mode : 'asynchronous'
					, mediatype : 'application/json'
					, method : 'post'
					, success : function(response){
						console.log('첨부파일 삭제 완료!!', response.responseJSON);
						if (removeCallback){
							console.log('첨부파일 삭제 후 콜백 수행!!');
							(removeCallback)();
						}
					}
					, error : function(e){
						console.log("첨부파일 삭제시 시스템 오류 발생! 페이지 재진입 필요!", e);
					}
				});
			}
			
			/**
			 * 파일 미리보기 확장자 검사
			 */
			, isValidPreview : function(ext) {
				var validExts = ['DOC','DOT','DOTX','PPT','POT','PPS','XLS','XLT','DOCX','DOCM','DOTM','PPTX','PPTM','POTX','POTM','PPSX','THMX','XLSX','XLSM','XLTX','XLTM','XLSB','HWP','HML','HWPX','HWX','ODT','PDF','TXT','XML','CSV','BMP','GIF','JPG','PNG','TIFF','WEBP','JP2','J2K','JPC','J2C','HTML','MHT','MHTML','EML','MSG'];
				
				return validExts.some(function(validExt) {
					return validExt === ext.toUpperCase();
				});
			}
			
			/**
			 * 증빙 파일 확장자 검사
			 */
			, isValidEvid : function(ext) {
				var validExts = ['pdf', 'ppt','pptx', 'pptm', 'pps', 'ppsx', 'xls', 'xlsx', 'xlsm', 'doc', 'docx', 'docm', 'rif', 'txt', 'hwp', 'url', 'mht', 'mhtml', 'htm', 'html', 'jpg', 'jpeg', 'tif', 'tiff', 'gif', 'png', 'bmp'];
				
				return validExts.some(function(validExt) {
					return validExt === ext.toLowerCase();
				});
			}
		} // james.biz
	};
	return james;
})();	

