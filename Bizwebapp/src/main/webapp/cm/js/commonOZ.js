/**
 * @target
 */
var commonOZ_js= {}; //This is WebSquare JavaScript Marker. Do not remove this line.


/**
 * 오즈 서버바인딩
 */ 
var ServerBind = {
	getElement: function(name, value){
		var i = document.createElement("input");
		i.setAttribute("type", "hidden");
		i.setAttribute("name", name);
		i.setAttribute("value", value);	
		return i;			
	},
	
	download: function(param, showtree, ptrMode, isPlan, exts) {
		const OZ_SERVLET_URL = "http://oz.kitech.re.kr/oz70/server";
		
		var params = param + "&" + showtree + "&" + ptrMode + "&" + ((exts) ? exts.join() : "");
		var paramArray = params.split("&");
		var ozDocs = paramArray[0].split("\n");
		var firstDoc = ozDocs[0].split("\t");
		
		var f = document.createElement("form");
		f.setAttribute("method", "post");
		f.setAttribute("action", OZ_SERVLET_URL);
		f.setAttribute("accept-charset", "UTF-8");
		document.body.appendChild(f);
		
		// ServerBinding 파라미터
		f.appendChild(this.getElement("ozserverexport", "true"));
		f.appendChild(this.getElement("filename", firstDoc[2]+".pdf"));
		f.appendChild(this.getElement("pdf.fontembedding", "true"));
		f.appendChild(this.getElement("exportview", "false"));

		// 오즈 뷰어 파라미터
		f.appendChild(this.getElement("viewer.focus_doc_index", "0"));					// 멀티 리포트 조회 후 처음 화면에 선택될 리포트를 지정 합니다. -1일 경우 기존 동작과 마찬가지로 마지막으로 조회된 리포트가 선택되어 표시됩니다.
		f.appendChild(this.getElement("viewer.childcount", String(ozDocs.length-1))); 	// 하나의 오즈 뷰어에 여러 개의 보고서를 보여줄 때 메인 보고서 외에 추가되는 차일드 보고서의 개수를 설정합니다.
		f.appendChild(this.getElement("viewer.showtree", paramArray[1])); 				// 트리 보기 메뉴와 아이콘의 활성화 여부를 설정합니다.
		f.appendChild(this.getElement("viewer.mode", "print")); 						// print:바로출력, export:저장, preview:미리보기. flash에서는 print모드 지원않됨.
		f.appendChild(this.getElement("information.debug", "true"));

		// 저장시 확장자 선택 리스트 순서 및 디폴트 동적 파라미터 방식으로 변경
		var strExt = paramArray[paramArray.length-1];
		if (1 < strExt.length){
			f.appendChild(this.getElement("export.applyformat", strExt));
			f.appendChild(this.getElement("export.format", -1 < strExt.indexOf(",") ? strExt.substring(0, strExt.indexOf(",")) : strExt));
		} else {
			f.appendChild(this.getElement("export.applyformat", "pdf,hwp,hml,doc,ppt,xls,html,cvs,txt,jpg,tif,svg,mht,ozd"));
			f.appendChild(this.getElement("export.format", "pdf"));
		}
	
		// 멀티폼을 하나의 리포트 처럼 이용할 지 여부를 설정합니다. True이면 멀티폼의 페이지 번호등이 연결됩니다.
		f.appendChild(this.getElement("global.concatpage" , (paramArray[1] == "true") ? "false" : "true"));
		// 프린트 창 모드 : "": 오즈출력창 -> 윈도우출력창, slient:윈도우출력창
		f.appendChild(this.getElement("print.mode" , (paramArray[2] != "Y") ? "" : "silent"));
		f.appendChild(this.getElement("print.alldocument" , "true")); // 멀티문서 형식의 보고서를 한번에 모두 인쇄할지 여부를 설정합니다.
		f.appendChild(this.getElement("connection.pcount", String(1)));
		f.appendChild(this.getElement("connection.args1", "formparam=test"));
		f.appendChild(this.getElement("connection.compressedform", "true"));
		f.appendChild(this.getElement("viewer.fontdpi", "auto"));

		// 메인문서
		f.appendChild(this.getElement("connection.servlet", OZ_SERVLET_URL));
		f.appendChild(this.getElement("viewer.configmode", "html"));
		f.appendChild(this.getElement("viewer.isframe", "false"));
		f.appendChild(this.getElement("connection.reportname", firstDoc[0]));
		f.appendChild(this.getElement("connection.displayname", firstDoc[2]));	//좌측 트리창에서보여지는 이름
		f.appendChild(this.getElement("odi.odinames", firstDoc[1]));
		f.appendChild(this.getElement("odi." + firstDoc[1] + ".pcount", String(firstDoc.length-3)));					
		
		for (var i = 0; i < firstDoc.length-3; i++){
			f.appendChild(this.getElement("odi." + firstDoc[1] + ".args"+(i+1) , firstDoc[i+3]));
		}

		// child문서
		for (var j=1; j<ozDocs.length; j++){
			var afterDoc = ozDocs[j].split("\t");
			f.appendChild(this.getElement("child"+j+".connection.servlet" , OZ_SERVLET_URL));
			f.appendChild(this.getElement("child"+j+".viewer.configmode" , "html"));
			f.appendChild(this.getElement("child"+j+".viewer.isframe" , "false"));
			f.appendChild(this.getElement("child"+j+".connection.reportname", afterDoc[0]));
			f.appendChild(this.getElement("child"+j+".connection.displayname", afterDoc[2])); //좌측 트리창에서보여지는 이름
			f.appendChild(this.getElement("child"+j+".odi.odinames", afterDoc[1]));
			f.appendChild(this.getElement("child"+j+".odi." + afterDoc[1] + ".pcount" , String(afterDoc.length-3)));
			for (var k = 0; k < afterDoc.length-3; k++) {
				f.appendChild(this.getElement("child"+j+".odi." + afterDoc[1] + ".args"+(k+1) , afterDoc[k+3]));
			}
		}
		
		debugger;
		f.submit();
	}
};


/** 오즈 뷰어 직접 드로윙 용 파리미터 객체 */
var gvrOzParamObj = {
	sparams : undefined,
	mparams : undefined
};

/**
 * 오즈7 HTML5 팝업창 호출 (단건)
 * 
 * @param OZRName
 *            ozr 이름 ex) "fin/fin/seq/FinBsSel.ozr"
 * @param ODIName
 *            odi이름 ex) "FinBsSel"
 * @param PRINTMode
 *            출력 방식 "N":오즈 출력창-> 윈도우 출력창, "Y":윈도우출력창만
 * @param Param
 *            OZ로 넘길 파라미터 ex) form_knd=formKnd&creatYrmon=creatYrmon (순서대로 해야함)
 * @param isTab
 * @param isPlan
 * @param exts
 * @param isSvg
 */
function OZFlashOpen(OZRName, ODIName, PRINTMode, Param, isTab, isPlan, exts) {
	var delim = (isTab) ? "\t" : "&";
	var strParam = OZRName + delim + ODIName + delim + PRINTMode + delim + Param;
	strParam += delim + ((exts) ? exts.join() : "");
	strParam += delim + ((isTab) ? "Y" : "N");
	
	if (!isPlan) {
		WebSquare.uiplugin.popup.openPopup("/kitech/com/oz/ComPopupOZReport.xml", {
			id : "",
			type : "window",
			width : "1012px",
			height : "610px",
			top : "100px",
			left : "100px",
			popupName : "",
			modal : false,
			useIFrame : false,
			resizable : true,
			status : false,
			menubar : false,
			scrollbars : true,
			title : false,
			xml : strParam
		});
	} else {
		gvrOzParamObj.mparams = undefined;
		gvrOzParamObj.sparams = strParam.split(delim);
		var opt = new Array();
		opt["use_request_binary"] = false;
		start_ozjs('OZViewer', '/kitech/js/OZHtml5Viewer/', opt);
	}
}

/**
 * 오즈7 HTML5 팝업창 호출 (다건)
 * 
 * @param OZParam :
 *            OZ로 넘길 파라미터 ex) form_knd=formKnd&creatYrmon=creatYrmon (순서대로 해야함)
 * @param showtree :
 *            true:트리형식, false:페이지넘김형식
 * @param PRINTMode :
 *            출력 방식 "N":오즈 출력창-> 윈도우 출력창, "Y":윈도우출력창만
 */
function OZFlashOpenMulti(OZParam, showtree, PRINTMode, isPlan, exts, isSvg) {
	var strParam = OZParam + "&" + showtree + "&" + PRINTMode;
	strParam += "&" + ((exts) ? exts.join() : "");

	if (!isPlan) {
		WebSquare.uiplugin.popup.openPopup(isSvg ? "/kitech/com/oz/ComPopupOZReportSvg.xml" : "/kitech/com/oz/ComPopupOZReportMulti.xml", {
			id : "_blank",
			type : "window",
			width : "1012px",
			height : "610px",
			top : "100px",
			left : "100px",
			popupName : "",
			modal : false,
			useIFrame : false,
			resizable : true,
			status : false,
			menubar : false,
			scrollbars : true,
			title : false,
			xml : strParam
		});
	} else {
		gvrOzParamObj.sparams = undefined;
		gvrOzParamObj.mparams = strParam.split("&");
		var opt = new Array();
		opt["use_request_binary"] = false;
		start_ozjs('OZViewer', '/kitech/js/OZHtml5Viewer/', []);
	}
}

/**
 * 오즈7 HTML5 파라미터 처리 함수.
 * 
 * by James, 2018-03-15
 */
function SetOZParamters_OZViewer() {

	debugger;
	if (gvrOzParamObj.sparams) {
		var oz = document.getElementById('OZViewer');
		oz.innerHTML = '';
		oz.sendToActionScript('connection.servlet', 'http://oz.kitech.re.kr/oz70/server');
		oz.sendToActionScript("connection.reportname", gvrOzParamObj.sparams[0]);
		oz.sendToActionScript("connection.compressedform", "true");
		oz.sendToActionScript("viewer.mode", "");
		oz.sendToActionScript("print.mode", ("Y" != gvrOzParamObj.sparams[2]) ? "" : "silent");
		oz.sendToActionScript("print.pagerange", "all");
		oz.sendToActionScript("toolbar.showtree", "false");
		oz.sendToActionScript("toolbar.open", "false");
		oz.sendToActionScript("toolbar.refresh", "false");
		oz.sendToActionScript("toolbar.addmemo", "false");
		oz.sendToActionScript("toolbar.inputparameter", "false");
		oz.sendToActionScript("information.debug", "true");

		// 2017-11-09.
		oz.sendToActionScript("viewer.fontdpi", "auto");

		// 2017-07-18, Added James, 저장시 확장자 선택 리스트 순서 및 디폴트 확장자 변경
		// 2018-06-26, Added James, 저장시 확장자 선택 리스트 순서 및 디폴트 동적 파라미터 방식으로 변경
		var strExt = gvrOzParamObj.sparams[gvrOzParamObj.sparams.length - 2];
		if (1 < strExt.length && -1 == strExt.indexOf("=")) {
			oz.sendToActionScript("export.applyformat", strExt);
			oz.sendToActionScript("export.format", -1 < strExt.indexOf(",") ? strExt.substring(0, strExt.indexOf(",")) : strExt);
		} else {
			oz.sendToActionScript("export.applyformat", "pdf,hwp,hml,doc,ppt,xls,html,cvs,txt,jpg,tif,svg,mht,ozd");
			oz.sendToActionScript("export.format", "pdf");
		}

		oz.sendToActionScript("odi.odinames", gvrOzParamObj.sparams[1]);
		if (gvrOzParamObj.sparams[2] != "Y") {
			oz.sendToActionScript("odi." + gvrOzParamObj.sparams[1] + ".pcount", gvrOzParamObj.sparams.length - 2);
			for (var i = 0; i < gvrOzParamObj.sparams.length - 2; i++) {
				oz.sendToActionScript("odi." + gvrOzParamObj.sparams[1] + ".args" + (i + 1), gvrOzParamObj.sparams[i + 2]);
			}
		} else {
			oz.sendToActionScript("odi." + gvrOzParamObj.sparams[1] + ".pcount", gvrOzParamObj.sparams.length - 3);
			for (var i = 0; i < gvrOzParamObj.sparams.length - 3; i++) {
				oz.sendToActionScript("odi." + gvrOzParamObj.sparams[1] + ".args" + (i + 1), gvrOzParamObj.sparams[i + 3]);
			}
		}
	} else {
		var ozDocs = gvrOzParamObj.mparams[0].split("\n");
		var firstDoc = ozDocs[0].split("\t");

		var oz = document.getElementById('OZViewer');
		oz.innerHTML = '';
		// 문서공통
		oz.sendToActionScript("viewer.focus_doc_index", "0"); // 멀티 리포트 조회 후 처음 화면에 선택될 리포트를 지정 합니다. -1일 경우 기존 동작과 마찬가지로 마지막으로 조회된 리포트가 선택되어 표시됩니다.
		oz.sendToActionScript("viewer.childcount", ozDocs.length - 1); // 하나의 오즈 뷰어에 여러 개의 보고서를 보여줄 때 메인 보고서 외에 추가되는 차일드 보고서의 개수를 설정합니다.
		oz.sendToActionScript("viewer.showtree", gvrOzParamObj.mparams[1]); // 트리 보기 메뉴와 아이콘의 활성화 여부를 설정합니다.
		oz.sendToActionScript("viewer.mode", "preview"); // print:바로출력, export:저장, preview:미리보기. flash에서는 print모드 지원않됨.
		oz.sendToActionScript("information.debug", "true");

		// 2017-07-18, Added James, 저장시 확장자 선택 리스트 순서 및 디폴트 확장자 변경
		// 2018-06-26, Added James, 저장시 확장자 선택 리스트 순서 및 디폴트 동적 파라미터 방식으로 변경
		var strExt = gvrOzParamObj.mparams[gvrOzParamObj.mparams.length - 1];
		if (1 < strExt.length) {
			oz.sendToActionScript("export.applyformat", strExt);
			oz.sendToActionScript("export.format", -1 < strExt.indexOf(",") ? strExt.substring(0, strExt.indexOf(",")) : strExt);
		} else {
			oz.sendToActionScript("export.applyformat", "pdf,hwp,hml,doc,ppt,xls,html,cvs,txt,jpg,tif,svg,mht,ozd");
			oz.sendToActionScript("export.format", "pdf");
		}

		// 멀티폼을 하나의 리포트 처럼 이용할 지 여부를 설정합니다. True이면 멀티폼의 페이지 번호등이 연결됩니다.
		oz.sendToActionScript("global.concatpage", (gvrOzParamObj.mparams[1] == "true") ? "false" : "true");
		// 프린트 창 모드 : "": 오즈출력창 -> 윈도우출력창, slient:윈도우출력창
		oz.sendToActionScript("print.mode", (gvrOzParamObj.mparams[2] != "Y") ? "" : "silent");
		oz.sendToActionScript("print.alldocument", "true"); // 멀티문서 형식의 보고서를 한번에 모두 인쇄할지 여부를 설정합니다.

		oz.sendToActionScript("connection.pcount", 1);
		oz.sendToActionScript("connection.args1", "formparam=test");
		oz.sendToActionScript("connection.compressedform", "true");

		// 2017-11-09.
		oz.sendToActionScript("viewer.fontdpi", "auto");

		// 메인문서
		oz.sendToActionScript('connection.servlet', 'http://oz.kitech.re.kr/oz70/server');
		oz.sendToActionScript("viewer.configmode", "html");
		oz.sendToActionScript("viewer.isframe", "false");
		oz.sendToActionScript("connection.reportname", firstDoc[0]);
		oz.sendToActionScript("connection.displayname", firstDoc[2]); // 좌측 트리창에서보여지는 이름
		oz.sendToActionScript("odi.odinames", firstDoc[1]);
		oz.sendToActionScript("odi." + firstDoc[1] + ".pcount", firstDoc.length - 3);
		for (var i = 0; i < firstDoc.length - 3; i++) {
			oz.sendToActionScript("odi." + firstDoc[1] + ".args" + (i + 1), firstDoc[i + 3]);
		}

		// child문서
		for (var j = 1; j < ozDocs.length; j++) {
			var afterDoc = ozDocs[j].split("\t");
			oz.sendToActionScript("child" + j + ".connection.servlet", "http://oz.kitech.re.kr/oz70/server");
			oz.sendToActionScript("child" + j + ".viewer.configmode", "html");
			oz.sendToActionScript("child" + j + ".viewer.isframe", "false");
			oz.sendToActionScript("child" + j + ".connection.reportname", afterDoc[0]);
			oz.sendToActionScript("child" + j + ".connection.displayname", afterDoc[2]); // 좌측 트리창에서보여지는 이름
			oz.sendToActionScript("child" + j + ".odi.odinames", afterDoc[1]);
			oz.sendToActionScript("child" + j + ".odi." + afterDoc[1] + ".pcount", afterDoc.length - 3);
			for (var k = 0; k < afterDoc.length - 3; k++) {
				oz.sendToActionScript("child" + j + ".odi." + afterDoc[1] + ".args" + (k + 1), afterDoc[k + 3]);
			}
		}
	}
	return true;
}