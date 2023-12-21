/**
 * 안전관리 팝업 객체
 * 팝업 종류 별 상수를 정의한다.
 */
biz.saf.pop = {
	TYPE : {
		DEUSE : { OPTION : { width: 890, height: 1010, id: "deuse", popupName: "화학제품폐기신청" }, URL : "/ui/saf/che/SAF_CHE_D305_00D.xml" }
	,	REQ_REJECT : { OPTION : { width: 700, height: 225, id: "reqReject", popupName: "폐기신청 반려 사유 작성" }, URL : "/ui/saf/pop/SAF_CHE_D311_01P.xml" }
	,	CHE_SRCH : { OPTION : { width: 800, height: 550, id: "cheSrch", popupName: "화학제품검색" }, URL : "/ui/saf/pop/SAF_CHE_D305_02P.xml" }
	,	LAB_SRCH : { OPTION : { width: 680, height: 510, id: "labSrch", popupName: "연구실검색" }, URL : "/ui/saf/pop/SAF_CHE_D305_01P.xml" }
	}
};


/**
 * 안전관리 사용 팝업창을 호출한다.
 *
 * @param {String} type - 팝업창 호출 구분값
 * @param {Object} data - 부모 창에서 전달한 데이터
 * @param function	    - 부모 창에서 실행할 callback 함수
 * @example
	let data = {
		req_no : "TEST"
	};
	biz.saf.pop.open(biz.saf.pop.TYPE.TEST, data, function(ret){
		if(ret){
			console.log(ret);
		}
	});
 */
biz.saf.pop.open = function(type, data, func) {
	com.openPopup(type.URL, type.OPTION, data, func);
};


/**
 * 한글 영문 변환 함수.
 *
 * @param {String} src - 입력 컴포넌트에서 입력된 값
 * @return {String} res - 한글 > 영문으로 변환된 값
 */
biz.saf.korTypeToEng = function(src){
	//한글 -> 영문 변환을 위하여
	var ENG_KEY = "rRseEfaqQtTdwWczxvgkoiOjpuPhynbml";
	var KOR_KEY = "ㄱㄲㄴㄷㄸㄹㅁㅂㅃㅅㅆㅇㅈㅉㅊㅋㅌㅍㅎㅏㅐㅑㅒㅓㅔㅕㅖㅗㅛㅜㅠㅡㅣ";
	var CHO_DATA = "ㄱㄲㄴㄷㄸㄹㅁㅂㅃㅅㅆㅇㅈㅉㅊㅋㅌㅍㅎ";
	var JUNG_DATA = "ㅏㅐㅑㅒㅓㅔㅕㅖㅗㅘㅙㅚㅛㅜㅝㅞㅟㅠㅡㅢㅣ";
	var JONG_DATA = "ㄱㄲㄳㄴㄵㄶㄷㄹㄺㄻㄼㄽㄾㄿㅀㅁㅂㅄㅅㅆㅇㅈㅊㅋㅌㅍㅎ";
	
	var res = "";
	if (src.length == 0)
		return res;

	for (var i = 0; i < src.length; i++) {
		var ch = src.charAt(i);
		var nCode = ch.charCodeAt(0);
		var nCho = CHO_DATA.indexOf(ch), nJung = JUNG_DATA.indexOf(ch), nJong = JONG_DATA.indexOf(ch);
		var arrKeyIndex = [-1, -1, -1, -1, -1];

		if (0xac00 <= nCode && nCode <= 0xd7a3) {
			nCode -= 0xac00;
			arrKeyIndex[0] = Math.floor(nCode / (21 * 28));			// 초성
			arrKeyIndex[1] = Math.floor(nCode / 28) % 21;			// 중성
			arrKeyIndex[3] = nCode % 28 - 1;						// 종성
		} else if (nCho != -1)			// 초성 자음
			arrKeyIndex[0] = nCho;
		else if (nJung != -1)			// 중성
			arrKeyIndex[1] = nJung;
		else if (nJong != -1)			// 종성 자음
			arrKeyIndex[3] = nJong;
		else							// 한글이 아님
			res += ch;

		// 실제 Key Index로 변경. 초성은 순서 동일
		if (arrKeyIndex[1] != -1) {
			if (arrKeyIndex[1] == 9) {					// ㅘ
				arrKeyIndex[1] = 27;
				arrKeyIndex[2] = 19;
			} else if (arrKeyIndex[1] == 10) {			// ㅙ
				arrKeyIndex[1] = 27;
				arrKeyIndex[2] = 20;
			} else if (arrKeyIndex[1] == 11) {			// ㅚ
				arrKeyIndex[1] = 27;
				arrKeyIndex[2] = 32;
			} else if (arrKeyIndex[1] == 14) {			// ㅝ
				arrKeyIndex[1] = 29;
				arrKeyIndex[2] = 23;
			} else if (arrKeyIndex[1] == 15) {			// ㅞ
				arrKeyIndex[1] = 29;
				arrKeyIndex[2] = 24;
			} else if (arrKeyIndex[1] == 16) {			// ㅟ
				arrKeyIndex[1] = 29;
				arrKeyIndex[2] = 32;
			} else if (arrKeyIndex[1] == 19) {			// ㅢ
				arrKeyIndex[1] = 31;
				arrKeyIndex[2] = 32;
			} else {
				arrKeyIndex[1] = KOR_KEY.indexOf(JUNG_DATA.charAt(arrKeyIndex[1]));
				arrKeyIndex[2] = -1;
			}
		}
		if (arrKeyIndex[3] != -1) {
			if (arrKeyIndex[3] == 2) {					// ㄳ
				arrKeyIndex[3] = 0
				arrKeyIndex[4] = 9;
			} else if (arrKeyIndex[3] == 4) {			// ㄵ
				arrKeyIndex[3] = 2;
				arrKeyIndex[4] = 12;
			} else if (arrKeyIndex[3] == 5) {			// ㄶ
				arrKeyIndex[3] = 2;
				arrKeyIndex[4] = 18;
			} else if (arrKeyIndex[3] == 8) {			// ㄺ
				arrKeyIndex[3] = 5;
				arrKeyIndex[4] = 0;
			} else if (arrKeyIndex[3] == 9) {			// ㄻ
				arrKeyIndex[3] = 5;
				arrKeyIndex[4] = 6;
			} else if (arrKeyIndex[3] == 10) {			// ㄼ
				arrKeyIndex[3] = 5;
				arrKeyIndex[4] = 7;
			} else if (arrKeyIndex[3] == 11) {			// ㄽ
				arrKeyIndex[3] = 5;
				arrKeyIndex[4] = 9;
			} else if (arrKeyIndex[3] == 12) {			// ㄾ
				arrKeyIndex[3] = 5;
				arrKeyIndex[4] = 16;
			} else if (arrKeyIndex[3] == 13) {			// ㄿ
				arrKeyIndex[3] = 5;
				arrKeyIndex[4] = 17;
			} else if (arrKeyIndex[3] == 14) {			// ㅀ
				arrKeyIndex[3] = 5;
				arrKeyIndex[4] = 18;
			} else if (arrKeyIndex[3] == 17) {			// ㅄ
				arrKeyIndex[3] = 7;
				arrKeyIndex[4] = 9;
			} else {
				arrKeyIndex[3] = KOR_KEY.indexOf(JONG_DATA.charAt(arrKeyIndex[3]));
				arrKeyIndex[4] = -1;
			}
		}

		for (var j = 0; j < 5; j++) {
			if (arrKeyIndex[j] != -1)
				res += ENG_KEY.charAt(arrKeyIndex[j]);
		}
	}

	return res.toUpperCase();	
};