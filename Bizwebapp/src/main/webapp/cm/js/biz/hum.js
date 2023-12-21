/**
 * 인사시스템 팝업 객체
 * 팝업 종류 별 상수를 정의한다.
 */
biz.hum.pop = {
	TYPE : {
		EDUC : { OPTION : { width: 1080, height:850, id: "HumBasEducPop", popupName: "교육과정 등록"},  URL : "/ui/hum/pop/HUM_POP_H169_01P.xml"}
	}
};

/**
 * 인사시스템 사용 팝업창을 호출한다.
 *
 * @param {String} clsf - 팝업창 호출 구분값(0 : 계정번호검색팝업)
 * @param {Object} 부모 창에서 전달한 데이터
 * @example
	var data={
	};
	biz.hum.pop.open(biz.epu.pop.TYPE.ITEM, data, function(ret){
		if(ret){
			ret
		}	
	});
 */
biz.hum.pop.open = function(type, data, func){
	com.openPopup(type.URL, type.OPTION, data, func);
};
