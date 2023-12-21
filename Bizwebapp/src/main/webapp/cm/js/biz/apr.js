
biz.apr.currentGapTime = function(endTime) {
	var a =  new Date(); //현재시간
	var b=  new Date(endTime); //비교대상
	var result = Math.floor((a-b)/1000/60/60);  //시간 차이 계산  1000/60 일경우 분 차이 //1000이면 초 차이
	  if(result>24) {  //시간이 24시간이상 차이날 경우 24시간(1일) 
		  result = Math.floor(result/24); 
	      result = result +'일'; //ex)  5일전 으로 표시
	  } else if(result == 0) { // 시간차이가 1시간 미만일 경우
	      result = Math.floor((a-b)/1000/60) +'분 '; //ex) 시간차이 + `분`으로 표시하기
	  } else {// 1시간 이상 24시간 미만으로 차이날 경우 시간차이로 표시하기
		  result = result +  '시간';
	  }
	return result;
};


/**
 * 제너레이터 데이터 세팅
 * 
 * @date 2022. 09. 01
 * @author James
*/ 
biz.apr.setGeneratorByJson = function(gen, json) {
	// TODO: 추후 공통화 필요.
};



/**
 * 스플릿터 초기화
 * 
 * @date 2022. 09. 01
 * @author James
*/ 
biz.apr.initSplitter = function(leftId, rightId, splitterId) {
	$p.$("#" + leftId).resizable({
		handleSelector: "#" + splitterId,
		resizeHeight: false
	});
	
	$p.$("#" + rightId).resizable({
		handleSelector: ".splitter-horizontal",
		resizeWidth: false
	});
};


/**
 * 공통 네이티브 윈도우 팝업을 오픈한다.
 * 
 * @date 2022. 09. 04
 * @author James
*/ 
biz.apr.openPopupByNative = function(url, name, options, base) {
	
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

	var width = options.width || 1400;
	var height = options.height || 950;
	var left = options.left || (screen.width / 2 - width / 2);
	var top = options.top || (screen.height / 2 - height / 2);
	var baseShape = 'toolbar=no, location=no, directories=no, status=no, menubar=no, scrollbars=no, resizable=no, copyhistory=no';
	window.open(baseUrl + url, name, baseShape + ', width='+width+', height='+height+', top='+top+', left='+left);
};

/**
 * 프로세스보기
 * @date 2022. 08. 23
 * @author James
 */ 
biz.apr.procUrl = function(instId, defName) {
	var viewType = "horizontal";
	var url = "/flowcontrol/processparticipant/viewProcessFlowChart.jsp?instanceId=" + instId;
	var param = "&viewType="+ viewType +"&cipherText=nCodMbtI5mXoPFehOT_qhVVmx9ugBJ4_-6u4TJV78f4=";

	biz.apr.openPopupByNative(url + param, defName, {width:1400, height:950}, "BPM");
};

/**
 * 메인프로세스보기
 * @date 2022. 08. 23
 * @author James
 */ 
biz.apr.procMainUrl = function(rootInstId, defName) {
	var viewType = "swimlane";
	var url = "/flowcontrol/processparticipant/viewProcessFlowChart.jsp?instanceId=" + rootInstId;
	var param = "&viewType="+ viewType +"&cipherText=nCodMbtI5mXoPFehOT_qhVVmx9ugBJ4_-6u4TJV78f4=";

	biz.apr.openPopupByNative(url + param, defName, {width:1400, height:950}, "BPM");
};

/**
 * 첨부파일 미리보기
 * @date 2022. 08. 23
 * @author Hongsm
 */ 
biz.apr.previewFiles = function(fileKey, seq) {
//	var data = {attach_file_no : attachFileNo };
//	var options = { width: 1200, height: 800, id: "accntNoPop", popupName: "첨부파일 미리보기"};
//	com.openPopup( "/ui/com/pop/COM_Z018_00P.xml", options, data);
	var action = 'SvcPreviewAttach';
	var previewOption = {
            id : "sbm_previewAttach"
          , action : `/${action}.pwkjson`
	};
	gcm.sbm.executeDynamic(scwin, previewOption, { 
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
}


/**
 * 첨부파일 미리보기
 * @date 2022. 08. 23
 * @author Hongsm
 */ 
biz.apr.previewFilePop = function(attachFileNo) {
	var data = {attach_file_no : attachFileNo };
	var options = { width: 1200, height: 800, id: "accntNoPop", popupName: "첨부파일 미리보기"};
	com.openPopup( "/ui/com/pop/COM_Z018_00P.xml", options, data);
}


/**
 * 스냅샷 첨부파일 다운로드 함수
 * 	- WebSqaure scope 가 적용되지 않음
 *
 * @date 2022. 07. 27
 * @param 첨부파일번호+순번, 업무코드(XAA)
 * @author OWNER
*/ 
biz.apr.downloadForXsl = function(fileName, bizKind){
	try {
		var frm = document.createElement("form");

		var objs1 = document.createElement("input");
		objs1.setAttribute("type", "hidden");
		objs1.setAttribute("name", "fileName");
		objs1.setAttribute("value", fileName);
		frm.appendChild(objs1);

		var objs2 = document.createElement("input");
		objs2.setAttribute("type", "hidden");
		objs2.setAttribute("name", "bizKind");
		
		if(bizKind == 'XAA004') bizKind = '';
		objs2.setAttribute("value", bizKind || 'XAA990');
		frm.appendChild(objs2);

		frm.setAttribute("name", "frmXsl");
		frm.setAttribute("target", "ifr");
		frm.setAttribute("method", "get");
		
		frm.setAttribute("action", "/SvcAttachDown.do");
		document.body.appendChild(frm);
		
		frm.submit();
	} catch (err) {
		alert(err.text);
	}
}

/**
 * 스냅샷 첨부파일 다운로드 함수
 * 임시로 작성한 스냅샷 xslFileDownload 함수
 * @date 2022. 10. 20
 * @param 첨부파일경로
*/
biz.apr.xslFileDownload = function(fileName){

	try {
		var fileNameArr = fileName.split('/');
		var fileName = fileNameArr[3];

		var frm = document.createElement("form");

		var objs1 = document.createElement("input");
		objs1.setAttribute("type", "hidden");
		objs1.setAttribute("name", "fileName");
		objs1.setAttribute("value", fileName);
		frm.appendChild(objs1);

		var objs2 = document.createElement("input");
		objs2.setAttribute("type", "hidden");
		objs2.setAttribute("name", "bizKind");
		objs2.setAttribute("value", "XAA990");
		frm.appendChild(objs2);

		frm.setAttribute("name", "frmXsl");
		frm.setAttribute("target", "ifr");
		frm.setAttribute("method", "get");
		
		frm.setAttribute("action", "/SvcAttachDown.do");
		document.body.appendChild(frm);
		
		frm.submit();
	} catch (err) {
		alert(err.text);
	}
}


/**
 *
 * Uid로 사용자 팝업을 열기 위한 공통 스크립트
 * @date 2022.10.16
 * @author Hongsm
 * @param (string) uid
 * 
 **/
biz.apr.onClickUidEvent = function(uid) {
	if (!uid){
		return;
	}
	
	var url = "/ui/com/pop/COM_Z002_00P.xml";
	var option = { width: 950, height: 430, id: "humUserPop", popupName: "직원검색"};
	var data = {"uid" : uid, aprMode : true, auth_type:"uid"};
	com.openPopup(url, option, data);
}

biz.apr.bindEmpnmEvent = function(uid, empnm) {
	uid = uid ? uid : "";
	empnm = empnm ? empnm : "";
	
	var links = "";
	var uidArr = uid.split(";")
	var empnmArr = empnm.split(";");
	var aprLen = uidArr.length-1;
    links = '<a href=\'javascript:biz.apr.onClickUidEvent("' + uidArr[0] +  '")\'>' + empnmArr[0] + '</a><br/>' + (aprLen > 0 ? ('외 ' + aprLen + '명') : '') ;

	
	return links;
}

biz.apr.onClickHeader = function(dlt, gen, by, order) {
	
//	var sortedJson = json.sort(function(a, b) {
//	    if (a[by] > b[by]) return order * 1;
//	    if (a[by] < b[by]) return order * -1;
//	    return 0;
//	});
	dlt.sort(by, order);
	gen.removeAll();
	dlt.getAllJSON().forEach( function (element, index) {
		var currepName = element.currepName;
		var currp = element.currep;
		gen.insert();
		gen.getChild( index , "idx" ).setValue(index+1);
		gen.getChild( index , "instId" ).setValue(element.instId);
		gen.getChild( index , "rootInstId" ).setValue(element.rootInstId);
		gen.getChild( index , "defName" ).setValue(element.defName);
		gen.getChild( index , "instName" ).setValue(element.instName);
		gen.getChild( index , "instInfo" ).setValue(element.instInfo);
		gen.getChild( index , "instExt1" ).setValue(element.instExt1);
		gen.getChild( index , "initepName" ).setValue(element.initepName);
		gen.getChild( index , "currep" ).setValue(currp);
		gen.getChild( index , "currepName" ).setValue(biz.apr.bindEmpnmEvent(currp, currepName));
		gen.getChild( index , "taskStartYmd" ).setValue(element.taskStartdate.substring(0,10));
		gen.getChild( index , "taskStartdate" ).setValue(biz.apr.currentGapTime( element.taskStartdate ));
		
		if (element.instId == element.rootInstId) {
			gen.getChild( index , "procMainUrl" ).setStyle("display", "none");
		}
	});
}

biz.apr.chkSearchForm = function(element , dataMap) {
	if (dataMap.get('instStartYmd') || dataMap.get('instEndYmd')) {
		if (!dataMap.get('instStartYmd') || !dataMap.get('instEndYmd')) {
			alert('검색 일자를 올바르게 입력해주세요.')
			return false;
		}
	}
	
	if ( element.getValue() == "docId" && dataMap.get("searchData").length < 3 && dataMap.get("searchData").length != 0) { 
		alert("문서번호 검색은 3자리 이상 입력해주세요");
		return false;
	}
	return true;
}

biz.apr.wfFormMovePage = function(wfForm, menuObj, dataObj) {
	wfForm._executeStatus.onpageload = false;
	wfForm.setSrc( menuObj.serviceNewUrl.trim(), {"dataObject" : { 
		type: "json", 
		name: "param", 
		data: dataObj
	}});
};