/**
 * 지식재산권 공통 스코프
 */

/**
 * 지식재산권시스템 팝업 객체
 * 팝업 종류 별 상수를 정의한다.
 */
biz.pat.pop = {
	TYPE : {
		   SMITAPP_NO	: { OPTION : { width: 700, height: 550, id: "PatPopupSmitappNo", popupName: "출원번호 검색"},  URL : "/ui/pat/pop/PAT_POP_I110_01P.xml"},
		   PAT_OFFICE	: { OPTION : { width: 850, height: 600, id: "PatOfficePop", popupName: "특허사무소 검색"},  URL : "/ui/pat/pop/PAT_POP_I110_02P.xml"},
		   RELATED_SMITAPP_NO	: { OPTION : { width: 700, height: 600, id: "PatPopupRelatedSmitappNo", popupName: "관련 출원번호 검색"},  URL : "/ui/pat/pop/PAT_POP_I110_08P.xml"},
		   PGM_CODE	: { OPTION : { width: 760, height: 550, id: "PgmCodePop", popupName: "프로그램종류코드 검색"},  URL : "/ui/pat/pop/PAT_POP_I110_03P.xml"},
		   MNGNO_CRT	: { OPTION : { width: 750, height: 350, id: "MngmtNoCrtPop", popupName: "관리번호생성"},  URL : "/ui/pat/pop/PAT_POP_I110_04P.xml"},
		   SMITAPP_NATN	: { OPTION : { width: 500, height: 500, id: "SmitappHopeNatnPop", popupName: "출원희망국조회"},  URL : "/ui/pat/pop/PAT_POP_I110_06P.xml"},
		   PAT_FILEDOWNLOAD	: { OPTION : { width: 750, height: 700, id: "PatReviewFileDownLoadPop", popupName: "파일 다운로드"},  URL : "/ui/pat/pop/PAT_POP_R237_01P.xml"},
		   PAT_MAIL	: { OPTION : { width: 850, height: 750, id: "PatPpoMailSendDetailPopup", popupName: "지식재산권 메일상세"},  URL : "/ui/pat/pop/PAT_POP_I110_09P.xml"},
		   PAT_MAIL_SEND : { OPTION : { width: 900, height: 750, id: "PatPpoMailSendPopup", popupName: "지식재산권 메일전송"},  URL : "/ui/pat/pop/PAT_POP_I110_11P.xml"},
		   PAT_ATTACH	: { OPTION : { width: 700, height: 650, id: "PatPpoRefFileSearchPopup", popupName: "지식재산권 관련 첨부파일"},  URL : "/ui/pat/pop/PAT_POP_I110_10P.xml"},
		   PAT_FAM	: { OPTION : { width: 700, height: 650, id: "PatPpoFamilyPopup", popupName: "패밀리 목록"},  URL : "/ui/pat/pop/PAT_POP_I110_12P.xml"},
		   PAT_RES	: { OPTION : { width: 800, height: 500, id: "PatResListPopup", popupName: "연구과제 검색"},  URL : "/ui/pat/pop/PAT_POP_I320_01P.xml"}
		}
};

/**
 * 지식재산권 시스템 사용 팝업창을 호출한다.
 *
 * @param {String} clsf - 팝업창 호출 구분값
 * @param {Object} 부모 창에서 전달한 데이터
 * @example
	var data={
		sh_flag : "I110"
	};
	biz.pat.pop.open(biz.pat.pop.TYPE.SMITAPP_NO, data, function(ret){
		if(ret){
			ret
		}	
	});
 */
biz.pat.pop.open = function(type, data, func){
	com.openPopup( type.URL, type.OPTION, data, func);
};