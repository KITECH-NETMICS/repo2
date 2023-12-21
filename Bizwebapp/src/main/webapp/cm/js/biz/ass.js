/**
 * 자산관리시스템 팝업 객체
 * 팝업 종류 별 상수를 정의한다.
 */
biz.ass.pop = {
	TYPE : {
		   ASET	: { OPTION : { width: 1080, height:620, id: "AssPopComPop", popupName: "자산정보 검색"},  URL : "/ui/ass/pop/ASS_POP_COM_01P.xml"},
		   DS_CHA_REQ_DTL : { OPTION : { width: 800, height:840, id: "AssAppDsChaReqDtlPop", popupName: "불용신청상세내역"},  URL : "/ui/ass/pop/ASS_APP_G222_00P.xml"},
		   CHA_REQ_ASET_LIST : { OPTION : { width: 1000, height:600, id: "AssAppPopupAssetLst", popupName: "자산정보 조회 (인수인계)"},  URL : "/ui/ass/pop/ASS_APP_G211_00P.xml"}
		}
};

/**
 * 자산관리시스템 사용 팝업창을 호출한다.
 *
 * @param {String} clsf - 팝업창 호출 구분값(0 : 자산정보검색팝업)
 * @param {Object} 부모 창에서 전달한 데이터
 * @example
	var data={
	};
	biz.ass.pop.open(biz.ass.pop.TYPE.ASET, data, function(ret){
		if(ret){
			ret
		}	
	});
 */
biz.ass.pop.open = function(type, data, func){
	com.openPopup( type.URL, type.OPTION, data, func);
};

