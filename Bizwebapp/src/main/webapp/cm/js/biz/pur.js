/**
 * 구매시스템 팝업 객체
 * 팝업 종류 별 상수를 정의한다.
 */
biz.epu.pop = {
	TYPE : {
		   ITEM	: { OPTION : { width: 1080, height:850, id: "EpuBasItmGpMntAPop", popupName: "품목코드 검색"},  URL : "/ui/epu/pop/EPU_POP_P349_01P.xml"},
		   OUT_ITEM	: { OPTION : { width: 1080, height:900, id: "EpuBasItmGpMntAPop", popupName: "외자 품목코드 검색"},  URL : "/ui/epu/pop/EPU_POP_P349_03P.xml"},
		   PUR_SPEC	: { OPTION : { width: 1008, height:550, id: "PurReqSpecPop", popupName: "사양서"},  URL : "/ui/epu/pop/EPU_POP_P101_01P.xml"},
		   PUR_EVAL	: { OPTION : { width: 850, height:450, id: "PurReqEstimPop", popupName: "견적서"},  URL : "/ui/epu/pop/EPU_POP_P103_01P.xml"},
		   PUR_USG	: { OPTION : { width: 1010, height:520, id: "PurReqUsgPop", popupName: "용도설명서"},  URL : "/ui/epu/pop/EPU_POP_P102_01P.xml"},
		   SPEC_REQ	: { OPTION : { width: 1010, height:750, id: "PurReqSpcficPop", popupName: "특정물품(업체)구매사유서"},  URL : "/ui/epu/pop/EPU_POP_P104_01P.xml"},
		   PUR_REQ	: { OPTION : { width: 850, height:550, id: "PurReqPop", popupName: "구매요구번호검색"},  URL : "/ui/epu/pop/EPU_POP_P022_01P.xml"},
		   PUR_DELY_H	: { OPTION : { width: 950, height:450, id: "PurReqDelyHPop", popupName: "긴급구매사유서"},  URL : "/ui/epu/pop/EPU_POP_P106_01P.xml"},
		   PUR_DELY_G	: { OPTION : { width: 950, height:450, id: "PurReqDelyGPop", popupName: "시방서"},  URL : "/ui/epu/pop/EPU_POP_P106_01P.xml"},
		   PUR_DELY_J	: { OPTION : { width: 950, height:450, id: "PurReqDelyJPop", popupName: "사업계획서"},  URL : "/ui/epu/pop/EPU_POP_P106_01P.xml"},
		   PUR_DELY_I	: { OPTION : { width: 950, height:450, id: "PurReqDelyIPop", popupName: "과업지시서"},  URL : "/ui/epu/pop/EPU_POP_P106_01P.xml"},
		   PUR_COST	: { OPTION : { width: 950, height:590, id: "PurReqCostPop", popupName: "원가계산서"},  URL : "/ui/epu/pop/EPU_POP_P105_01P.xml"},
		   PUR_ANNL	: { OPTION : { width: 1080, height:650, id: "PurReqContinuePop", popupName: "계속연차확인서"},  URL : "/ui/epu/pop/EPU_POP_P116_01P.xml"},
		   PUR_ACCNT	: { OPTION : { width: 900, height:370, id: "PurReqAccntMnt", popupName: "구매계정내역"},  URL : "/ui/epu/pop/EPU_POP_P022_02P.xml"},
		   PUR_PROGRS	: { OPTION : { width: 980, height:760, id: "EpuPurReqListPop", popupName: "구매요구조달진행상태"},  URL : "/ui/epu/pop/EPU_POP_P021_01P.xml"},
		   PUR_CTRL	: { OPTION : { width: 900, height:400, id: "EpuPurCtrlPop", popupName: "통제금액수정"},  URL : "/ui/epu/pop/EPU_POP_P022_03P.xml"},
		   EQUIP_REG	: { OPTION : { width: 900, height:350, id: "PurEquipConsttnPopup", popupName: "연구장비심의등록"},  URL : "/ui/epu/pop/EPU_POP_P022_04P.xml"},
		   EPU_REQ_ADD	: { OPTION : { width: 1200, height:550, id: "PurReqItemPopup", popupName: "구매요구내역 조회"},  URL : "/ui/epu/pop/EPU_POP_P302_01P.xml"},
		   PUR_REQ_ATTACH	: { OPTION : { width: 800, height:500, id: "PurReqAttachPopup", popupName: "구매요구내역 첨부파일"},  URL : "/ui/epu/pop/EPU_POP_P302_02P.xml"},
		   EPU_BID_G2B	: { OPTION : { width: 900, height:500, id: "PurBidG2BPopup", popupName: "지명업체 추가"},  URL : "/ui/epu/pop/EPU_POP_P302_03P.xml"},
		   ITEM_SRC	: { OPTION : { width: 1080, height:520, id: "EpuBasItmGpMntPop", popupName: "품목코드 검색"},  URL : "/ui/epu/pop/EPU_POP_P349_02P.xml"},
		   VEND_G2B_REG	: { OPTION : { width: 800, height:350, id: "EpuBasVendPop", popupName: "조달청업체등록"},  URL : "/ui/epu/pop/EPU_POP_P302_04P.xml"},
		   PRTC_VEND_PRCOND	: { OPTION : { width: 1050, height:570, id: "PurParticiVendPrcondPop", popupName: "참여업체현황"},  URL : "/ui/epu/pop/EPU_POP_P066_00P.xml"},
		}
};

/**
 * 구매시스템 사용 팝업창을 호출한다.
 *
 * @param {String} clsf - 팝업창 호출 구분값(0 : 계정번호검색팝업)
 * @param {Object} 부모 창에서 전달한 데이터
 * @example
	var data={
	};
	biz.epu.pop.open(biz.epu.pop.TYPE.ITEM, data, function(ret){
		if(ret){
			ret
		}	
	});
 */
biz.epu.pop.open = function(type, data, func){
	com.openPopup( type.URL, type.OPTION, data, func);
};

/**
 * G2b 공통코드 조회
 * data={upper_cd:"L17", cd:"100", compID : "sbx_code" }
 */
biz.epu.getG2bComCode = function(scopeScwin, data, func){
	try{
		com.executeDynamic({id : "sbm_selectG2bComCode", action : "SvcEPUCOMR02.pwkjson"}, {
			requestData: data, 
			processMsg : "조회중입니다",
			successCallback: function (ret) {
				if(ret.responseJSON.epuComCodeG2bVoList != undefined){
					data.dataListId ||= "dlt_cmnCd_" + data.upper_cd;
					var codeDatalist = gcm.data.createDataList(scopeScwin, data.dataListId, ["cd", "cd_nm"] , ["text", "text"]);
					var selectBoxComp = gcm.util.getComponent(scopeScwin, data.compID);
					
					codeDatalist.setJSON(ret.responseJSON.epuComCodeG2bVoList);
					selectBoxComp.setNodeSet("data:" + data.dataListId, "cd_nm", "cd");

					if (func && typeof func === "function") {
						(func)();
					}
				}
			}
		});
	}catch (e) {
		console.error("[biz.epu.getG2bComCode] Exception :: " + e);
	}	
};

/**
 * 이후 변경차수 구하기
 */
biz.epu.toChgNo = function(num){
	var chgNo = "" + (WebSquare.util.parseInt(num, 0) + 1);
	if (chgNo.length == 1) return "0"+chgNo;
	else if (chgNo.length == 2) return chgNo;
	else return "";
};

