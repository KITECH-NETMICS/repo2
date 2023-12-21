/**
 * 기업지원시스템 팝업 객체
 * 팝업 종류 별 상수를 정의한다.
 */
biz.sup.pop = {
	TYPE : {
		   ASET			: { OPTION : { width: 1080, height:620, id: "AssPopComPop"			, popupName: "자산정보 검색"}					,  URL : "/ui/ass/pop/ASS_POP_COM_01P.xml"},
		   CARD_APP		: { OPTION : { width: 650, height:400, id: "SptCardAppPop"			, popupName: "카드결제"}						,  URL : "/ui/sup/pop/SUP_POP_S306_02P.xml"},
		   SMS_APP		: { OPTION : { width: 650, height:400, id: "SptSMSAppPop"			, popupName: "SMS결제"}						,  URL : "/ui/sup/pop/SUP_POP_S306_03P.xml"},
		   CARD_PRCS	: { OPTION : { width: 800, height:500, id: "SptCardPrcPop"			, popupName: "카드처리내역"}					,  URL : "/ui/sup/pop/SUP_POP_S306_04P.xml"},
		   SUPT_DEPST	: { OPTION : { width: 1080, height:550, id: "SptAdjstDepstPop"		, popupName: "미수수탁입금신청"}					,  URL : "/ui/sup/tec/SUP_TEC_S357_01P.xml"},
		   TLT_MAIL		: { OPTION : { width: 570, height:362, id: "SptTltSendMailPopup"	, popupName: "이메일/문자 전송"}				,  URL : "/ui/sup/tlt/SUP_TLT_S676_01P.xml"},
		   TLT_DEPST	: { OPTION : { width: 1080, height:650, id: "SptTltDepstInfoRegPop"	, popupName: "기업부담금 입금예정관리"}			,  URL : "/ui/sup/tlt/SUP_TLT_S961_01P.xml"},
		   COM_FIN_DEPST: { OPTION : { width: 790, height:640, id: "SptComFinDepstReqPop"	, popupName: "가수 온라인 입금설정 현황(입금의뢰)"}	,  URL : "/ui/sup/tlt/SUP_TLT_S962_01P.xml"},
		}
};

/**
 * 기업지원시스템 사용 팝업창을 호출한다.
 *
 * @param {String} clsf - 팝업창 호출 구분값(0 : 자산정보검색팝업)
 * @param {Object} 부모 창에서 전달한 데이터
 * @example
	var data={
	};
	biz.sup.pop.open(biz.sup.pop.TYPE.ASET, data, function(ret){
		if(ret){
			ret
		}	
	});
 */
biz.sup.pop.open = function(type, data, func){
	com.openPopup( type.URL, type.OPTION, data, func);
};

