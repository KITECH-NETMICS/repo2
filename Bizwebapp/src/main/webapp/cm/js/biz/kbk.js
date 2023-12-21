/**
 * 도서관리 팝업 객체
 * 팝업 종류 별 상수를 정의한다.
 */
biz.kbk.pop = {
	TYPE : {
		REG_BOOK : { OPTION : { width: 900, height: 560, id: "regBook", popupName: "단행본 기본정보 등록" }, URL : "/ui/kbk/pop/KBK_POP_K600_01P.xml" },
		REG_RPTP : { OPTION : { width: 1000, height: 750, id: "regRptp", popupName: "연구보고서 기본정보 등록" }, URL : "/ui/kbk/pop/KBK_POP_K600_02P.xml" },
		DEL_BOOK : { OPTION : { width: 550, height: 350, id: "delBook", popupName: "단행본 폐기 및 이관" }, URL : "/ui/kbk/pop/KBK_POP_K601_01P.xml" },
		SEL_RSCH : { OPTION : { width: 820, height: 600, id: "selRsch", popupName: "원내보고서 조회" }, URL : "/ui/kbk/pop/KBK_POP_K610_01P.xml" },
		REG_JURN : { OPTION : { width: 1000, height: 500, id: "regJurn", popupName: "저널자료 등록" }, URL : "/ui/kbk/bmg/KBK_BMG_K61F_01P.xml" },
		REG_CTNT : { OPTION : { width: 900, height: 370, id: "regJurnCtnt", popupName: "저널권호 등록" }, URL : "/ui/kbk/pop/KBK_POP_K61A_01P.xml" },
		REG_LOAN : { OPTION : { width: 950, height: 400, id: "regLoan", popupName: "대출도서 등록" }, URL : "/ui/kbk/pop/KBK_POP_K631_01P.xml" },
		REG_PAPR : { OPTION : { width: 950, height: 600, id: "regPapr", popupName: "발표논문 등록" }, URL : "/ui/kbk/pop/KBK_POP_K612_01P.xml" },
		SEL_PAPR : { OPTION : { width: 950, height: 600, id: "selPapr", popupName: "발표논문 조회" }, URL : "/ui/kbk/pop/KBK_POP_K612_02P.xml" },
		REG_COPY : { OPTION : { width: 1000, height: 540, id: "regCopy", popupName: "원문복사 신청" }, URL : "/ui/kbk/pop/KBK_POP_K623_01P.xml" },
		SEL_JUNO : { OPTION : { width: 1200, height: 600, id: "selJuno", popupName: "저널번호 조회" }, URL : "/ui/kbk/pop/KBK_POP_K61A_02P.xml" },
		REG_OURL : { OPTION : { width: 850, height: 600, id: "regOurl", popupName: "전자정보관리 등록" }, URL : "/ui/kbk/bmg/KBK_BMG_K62F_01P.xml" }
	}
};


/**
 * 도서관리관리 사용 팝업창을 호출한다.
 *
 * @param {String} clsf - 팝업창 호출 구분값(0 : 계정번호검색팝업)
 * @param {Object} 부모 창에서 전달한 데이터
 * @example

 */
biz.kbk.pop.open = function(type, data, func) {
	com.openPopup(type.URL, type.OPTION, data, func);
};