//let param = '{"grpCd":"HWT","dataPrefix":"CommonCode"}';
//let action = 'SvcCodeList';

let param = '{}';
// let action = 'TestError';


/**
 * Ajax 호출 예제
 */

let param = '{}';
//let action = 'TestError';
let action = 'TestBizException';

let param = '{"grpCd":"HWT","dataPrefix":"CommonCode"}';
let action = 'SvcCodeList';

let param = '{}';
//let action = 'TestError';
let action = 'TestBizException';
fetch(`/${action}.pwkjson`, {
  method: 'POST', // or 'PUT'
  body: `{"reqMeta":{},"elData":${param}}`, // data can be `string` or {object}!
  headers:{
      'Content-Type': 'application/json'
    , 'Proworks-Lang' : 'en'
  }
}).then(res => { 
	if (res.ok) {
		return res.json();
	}
	// 404, Connection Refused 등 서버 WAS 외적인 오류
	throw new Error('요청을 찾을 수 없음!');
}).then(response => { 
	
	// WAS 예외 처리
	console.log('Success:', response);
	debugger;

}).catch( error => {
	// console.error('> > > > > > called .catch on %o with arguments: %o', this, arguments);
	console.error('Error:', error); 
});






let param = '{"grpCd":"HWT","dataPrefix":"CommonCode"}';
//let action = 'TestError';
let action = 'SvcCodeList';
WebSquare.net.ajax({
	  action : `/${action}.pwkjson`
	, mode : 'asynchronous'
	, mediatype : 'application/json'
	, method : 'post'
	, requestData : `{"reqMeta":{},"elData":${param}}`
	, success : function(response){

		console.log('Success:', response);
		
		debugger;
	}
	, error : function(error){
		console.error('Error:', error); 
	}
});

// http://localhost:8080/TestError.pwkjson






let param = '{}';
let action = 'SvcRouteInfo';
fetch(`/${action}.pwkjson`, {
method: 'POST', // or 'PUT'
body: `{"reqMeta":{},"elData":${param}}`, // data can be `string` or {object}!
headers: {
	    'Content-Type': 'application/json'
	  , 'Proworks-Lang' : 'en'
	}
}).then(res => {
	if (res.ok && res.url) {
		debugger;
		var menuObj = {};
		menuObj[gcm.MENU_INFO.MENU_ID] = "S201";
		menuObj[gcm.MENU_INFO.MENU_NM] = "단건 CRUD";
		menuObj[gcm.MENU_INFO.SRC_PATH] = res.url;
		menuObj[gcm.MENU_INFO.AUTH] = "000000001";
		if (!com.isEmpty(menuObj[gcm.MENU_INFO.SRC_PATH])) {
			com.openMenu(menuObj);
		}
	}

}).catch( error => {
	// console.error('> > > > > > called .catch on %o with arguments: %o', this, arguments);
	console.error('Error:', error); 
});
	



let param = '{}';
let action = 'SvcExcelDown';
fetch(`/${action}.pwkjson`, {
method: 'POST', // or 'PUT'
body: `{"reqMeta":{},"elData":${param}}`, // data can be `string` or {object}!
headers: {
	    'Content-Type': 'application/json'
	  , 'Proworks-Lang' : 'en'
	}
}).then(res => {
	if (res.ok) {
		return res.json();
	}
	// 404, Connection Refused 등 서버 WAS 외적인 오류
	throw new Error('요청을 찾을 수 없음!');
}).then(response => { 
	
	// WAS 예외 처리
	console.log('Success:', response);
	debugger;
}).catch( error => {
	// console.error('> > > > > > called .catch on %o with arguments: %o', this, arguments);
	console.error('Error:', error); 
});
	



let param = '{}';
let action = 'SvcSendMail';
fetch(`/${action}.pwkjson`, {
method: 'POST', // or 'PUT'
body: `{"reqMeta":{},"elData":${param}}`, // data can be `string` or {object}!
headers: {
	    'Content-Type': 'application/json'
	  , 'Proworks-Lang' : 'en'
	}
}).then( function( res){
	if (res.ok) {
		return res.json();
	}
	// 404, Connection Refused 등 서버 WAS 외적인 오류
	throw new Error('요청을 찾을 수 없음!');
}).then( function( response) { 
	
	// WAS 예외 처리
	console.log('Success:', response);
	debugger;
}).catch( function( error) {
	// console.error('> > > > > > called .catch on %o with arguments: %o', this, arguments);
	console.error('Error:', error); 
});
	

let param = '{}';
WebSquare.net.ajax({
	  action : `/SvcDownToExcel.do`
	, requestData : `{"elHeader":{"locale":"ko"},"elData":${param}}`
	, mode : 'asynchronous'
	, mediatype : 'application/json'
	, method : 'post'
	, success : function(response){
		console.log('첨부파일 조회 완료!!', response.responseJSON.elData);
	}
	, error : function(e){
		console.log("첨부파일 조회시 시스템 오류 발생! 페이지 재진입 필요!", e);
	}
});



var loadingAjaxImage = function(){
	console.log("show ....");
};

var hideAjaxImage = function(){
	console.log("hide ....");
};

let options = { 
	  url: "[[@{/}]]SvcDownToExcel.do" 
	, contentType: "application/x-www-form-urlencoded;charset=UTF-8" 
	, type: "post" 
	, beforeSubmit : loadingAjaxImage 
	, xhr: function () { 
		let xhr = new XMLHttpRequest(); 
		xhr.onreadystatechange = function () { 
			// response 데이터를 바이너리로 처리한다. 세팅하지 않으면 default가 text
			xhr.responseType = "blob"; 
		}; 
		return xhr; 
	} 
	, success: function (data, message, xhr) { 
		hideAjaxImage(); 
		if (xhr.readyState == 4 && xhr.status == 200) { 
			// 성공했을때만 파일 다운로드 처리하고
			let disposition = xhr.getResponseHeader('Content-Disposition'); 
			let filename; 
			if (disposition && disposition.indexOf('attachment') !== -1) { 
				let filenameRegex = /filename[^;=\n]*=((['"]).*?\2|[^;\n]*)/; 
				let matches = filenameRegex.exec(disposition); 
				if (matches != null && matches[1]) 
					filename = matches[1].replace(/['"]/g, ''); 
			} 
			let blob = new Blob([data]); 
			let link = document.createElement('a'); 
			link.href = window.URL.createObjectURL(blob); 
			link.download = filename; 
			link.click(); 
		} else { 
			// 실패했을때는 alert 메시지 출력
			alert("다운로드에 실패하였습니다."); 
		} 
	} 
};

$("#testForm").ajaxSubmit( options ); 


let param = '{ "serviceID": "C680" }';
//let action = 'TestError';
let action = 'SvcAccessLogging';
fetch(`/${action}.pwkjson`, {
method: 'POST', // or 'PUT'
body: `{"elHeader":{},"elData":${param}}`, // data can be `string` or {object}!
headers:{
    'Content-Type': 'application/json'
  , 'Proworks-Lang' : 'en'
}
}).then(res => { 
	if (res.ok) {
		return res.json();
	}
	// 404, Connection Refused 등 서버 WAS 외적인 오류
	throw new Error('요청을 찾을 수 없음!');
}).then(response => { 
	
	// WAS 예외 처리
	console.log('Success:', response);

}).catch( error => {
	// console.error('> > > > > > called .catch on %o with arguments: %o', this, arguments);
	console.error('Error:', error); 
});

fetch(`https://survey.kitech.re.kr/?task=list&syspayno=20130576`, {
	method: 'GET', // or 'PUT'
	headers:{
	    'Content-Type': 'application/json'
	}
	}).then(res => { 
		if (res.ok) {
			return res.json();
		}
		// 404, Connection Refused 등 서버 WAS 외적인 오류
		throw new Error('요청을 찾을 수 없음!');
	}).then(response => { 
		debugger;
		// WAS 예외 처리
		console.log('Success:', response);

	}).catch( error => {
		// console.error('> > > > > > called .catch on %o with arguments: %o', this, arguments);
		console.error('Error:', error); 
	});





let param = '{}';
let action = 'ApiRegacyReloadCodes';
fetch(`/${action}.pwkjson`, {
method: 'POST', // or 'PUT'
body: `{"elHeader":{},"elData":${param}}`, // data can be `string` or {object}!
headers:{
    'Content-Type': 'application/json'
  , 'Proworks-Lang' : 'en'
}
}).then( res => { 
	if (res.ok) {
		return res.json();
	}
	// 404, Connection Refused 등 서버 WAS 외적인 오류
	throw new Error('요청을 찾을 수 없음!');
}).then( response => { 
	
	// WAS 예외 처리
	console.log('Success:', response);

}).catch( error => {
	// console.error('> > > > > > called .catch on %o with arguments: %o', this, arguments);
	console.error('Error:', error); 
});


