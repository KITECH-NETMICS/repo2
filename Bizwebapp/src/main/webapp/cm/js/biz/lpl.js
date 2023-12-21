/**
 * 기획협력 팝업 객체
 * 팝업 종류 별 상수를 정의한다.
 */
biz.lpl.pop = {
	TYPE : {
		DELIV : { OPTION : { width: 1000, height: 350, id: "deliv", popupName: "기념홍보물출고" }, URL : "/ui/lpl/pop/LPL_LPR_L52C_00P.xml" }
	  , PROJEC : { OPTION : { width: 934, height: 800, id: "project", popupName: "과제정보" }, URL : "/ui/lpl/pop/LPL_LCP_J017_00P.xml" }
	  , ORGAN : { OPTION : { width: 934, height: 800, id: "organ", popupName: "기관기본정보등록" }, URL : "/ui/lpl/pop/LPL_LCP_L45E_00P.xml" }
	  , AGENCY : { OPTION : { width: 840, height: 650, id: "agency", popupName: "기관찾기" }, URL : "/ui/lpl/pop/LPL_LCP_L45B_00P.xml" }
	  , EVEXPEN : { OPTION : { width: 1150, height: 700, id: "evexpen", popupName: "국제행사비용등록" }, URL : "/ui/lpl/pop/LPL_LCP_L414_00P.xml" }
	}
};


/**
 * 기획협력 사용 팝업창을 호출한다.
 *
 * @param {String} type - 팝업창 호출 구분값
 * @param {Object} data - 부모 창에서 전달한 데이터
 * @param function	    - 부모 창에서 실행할 callback 함수
 * @example
	let data = {
		req_no : "TEST"
	};
	biz.lpl.pop.open(biz.lpl.pop.TYPE.TEST, data, function(ret){
		if(ret){
			console.log(ret);
		}
	});
 */
biz.lpl.pop.open = function(type, data, func) {
	com.openPopup(type.URL, type.OPTION, data, func);
};

