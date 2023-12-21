package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재 코어 파라미터 객체")
public class AprVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprVo(){
    }

    @ElDtoField(logicalName = "양식구분", physicalName = "procDefAlias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String procDefAlias;

    @ElDtoField(logicalName = "업무담당자", physicalName = "endpoint", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoint;

    @ElDtoField(logicalName = "인스턴스상태", physicalName = "instStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instStatus;

    @ElDtoField(logicalName = "제목", physicalName = "titleName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "ext1_cd = instExt1")
    private String titleName;

    @ElDtoField(logicalName = "예비2", physicalName = "accntNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "info_cd  = instExt2")
    private String accntNo;

    @ElDtoField(logicalName = "스냅샷", physicalName = "html", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String html;

    @ElDtoField(logicalName = "메인키", physicalName = "mainKey", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "메인키")
    private String mainKey;

    @ElDtoField(logicalName = "신청번호", physicalName = "reqNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "신청번호")
    private String reqNo;

    @ElDtoField(logicalName = "의견", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "의견")
    private String comments;

    @ElDtoField(logicalName = "사번", physicalName = "reporterId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "사번")
    private String reporterId;

    @ElDtoField(logicalName = "서비스번호", physicalName = "uiId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "서비스번호")
    private String uiId;

    @ElDtoField(logicalName = "요청시상태값", physicalName = "aprState", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "요청시상태값")
    private String aprState;

    @ElDtoField(logicalName = "제목", physicalName = "infoCd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "공고명(제목)")
    private String infoCd;

    @ElDtoField(logicalName = "임시값01", physicalName = "ext1Cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "임시값01")
    private String ext1Cd;

    @ElDtoField(logicalName = "임시값02", physicalName = "ext2Cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "임시값02")
    private String ext2Cd;

    @ElDtoField(logicalName = "임시값03", physicalName = "ext3Cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "임시값03")
    private String ext3Cd;

    @ElDtoField(logicalName = "로그인ID", physicalName = "loginUserId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "로그인ID")
    private String loginUserId;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accountCharger", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "계정책임자")
    private String accountCharger;

    @ElDtoField(logicalName = "예산통제자", physicalName = "budgetController", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "예산통제자")
    private String budgetController;

    @ElDtoField(logicalName = "신청자의 편성단위", physicalName = "region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "신청자의 편성단위")
    private String region;

    @ElDtoField(logicalName = "감사여부", physicalName = "audit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "무조건 감사를 넣을지 여부")
    private String audit;

    @ElDtoField(logicalName = "담당자시스템번호", physicalName = "managerId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "담당자 시스템 개인번호 : 담당자를 직접 지정할 경우에 사용")
    private String managerId;

    @ElDtoField(logicalName = "입찰방식", physicalName = "biddingType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "입찰방식")
    private String biddingType;

    @ElDtoField(logicalName = "공고진행방식", physicalName = "biddingTypeMain", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "공고진행방식")
    private String biddingTypeMain;

    @ElDtoField(logicalName = "예가종류", physicalName = "estimatedPriceType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "예가종류(복수,단수,비예가)")
    private String estimatedPriceType;

    @ElDtoField(logicalName = "예가구분", physicalName = "estimatedOnoff", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "예가종류(온,오프라인)")
    private String estimatedOnoff;

    @ElDtoField(logicalName = "내자외자구분", physicalName = "dcFcType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "내자 외자 구분")
    private String dcFcType;

    @ElDtoField(logicalName = "수기계약여부", physicalName = "manualContractYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "수기계약여부")
    private String manualContractYn;

    @ElDtoField(logicalName = "PQ심사여부", physicalName = "pqReviewYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "PQ심사여부")
    private String pqReviewYn;

    @ElDtoField(logicalName = "계약벙법", physicalName = "contractType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "계약벙법")
    private String contractType;

    @ElDtoField(logicalName = "발주종류", physicalName = "orderType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "발주종류")
    private String orderType;

    @ElDtoField(logicalName = "구매요구자 사번", physicalName = "purRequestor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "구매요구자 사번")
    private String purRequestor;

    @ElDtoField(logicalName = "구매담당자", physicalName = "charger", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "구매담당자")
    private String charger;

    @ElDtoField(logicalName = "금액", physicalName = "amounts", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "금액")
    private String amounts;

    @ElDtoField(logicalName = "출장자", physicalName = "travelers", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "출장자")
    private String travelers;

    @ElDtoField(logicalName = "예산자동통제여부", physicalName = "autoControlYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "예산자동통제여부")
    private String autoControlYn;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslipNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "결의번호")
    private String unslipNo;

    @ElDtoField(logicalName = "휴일구분", physicalName = "holiday", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "휴일구분")
    private String holiday;

    @ElDtoField(logicalName = "전결구분", physicalName = "ruleType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "전결구분")
    private String ruleType;

    @ElDtoField(logicalName = "전결금액", physicalName = "ruleMoney", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "전결금액")
    private String ruleMoney;

    @ElDtoField(logicalName = "출장목적코드", physicalName = "tripGoal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "출장목적코드")
    private String tripGoal;

    @ElDtoField(logicalName = "당일출장여부", physicalName = "oneDay", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "당일출장여부")
    private String oneDay;

    @ElDtoField(logicalName = "출장변경없음", physicalName = "chgnYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chgnYn;

    @ElDtoField(logicalName = "기술협상여부", physicalName = "techNegoYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "기술협상여부")
    private String techNegoYn;

    @ElDtoField(logicalName = "입찰설명회 개최여부", physicalName = "bidPresentationYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "입찰설명회 개최여부")
    private String bidPresentationYn;

    @ElDtoField(logicalName = "출장자부서장사번", physicalName = "deptHed1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "출장자의 부서장 사번")
    private String deptHed1;

    @ElDtoField(logicalName = "출장자상위부서장사번", physicalName = "deptHed2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "출장자의 상위부서장 사번")
    private String deptHed2;

    @ElDtoField(logicalName = "출장자타입1", physicalName = "headType1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "출장자가 부서장이면(A) 아니면 (B)")
    private String headType1;

    @ElDtoField(logicalName = "출장자타입2", physicalName = "headType2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "출장자의 부서장과 상위부서장이 같으면(A) 아니면 (B)")
    private String headType2;

    @ElDtoField(logicalName = "RCMS계정대체연구확인", physicalName = "rcmsRes", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "RCMS계정대체연구확인")
    private String rcmsRes;

    @ElDtoField(logicalName = "RcmsPoint", physicalName = "rcmsPoint", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "RcmsPoint")
    private String rcmsPoint;

    @ElDtoField(logicalName = "e나라도움계정구분", physicalName = "enaraYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "e나라도움계정구분")
    private String enaraYn;

    @ElDtoField(logicalName = "research_charger_id", physicalName = "researchChargerId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String researchChargerId;

    @ElDtoField(logicalName = "참여연구원시스템번호", physicalName = "researcher", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "참여연구원 시스템 개인번호")
    private String researcher;

    @ElDtoField(logicalName = "비공개여부", physicalName = "securityCd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "비공개여부")
    private String securityCd;

    @ElDtoField(logicalName = "occutyp_cd", physicalName = "occutyp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp;

    @ElDtoField(logicalName = "법인카드 소지여부", physicalName = "cardKeepperYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "법인카드 소지여부")
    private String cardKeepperYn;

    @ElDtoField(logicalName = "도서담당자", physicalName = "bookManager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bookManager;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns;

    @ElDtoField(logicalName = "소액물품검수증빙", physicalName = "inspectEvid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inspectEvid;

    @ElDtoField(logicalName = "소액물품검수여부", physicalName = "inspectYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inspectYn;

    @ElDtoField(logicalName = "자산담당자", physicalName = "assetRgManager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String assetRgManager;

    @ElDtoField(logicalName = "출장비여부", physicalName = "noMoney", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String noMoney;

    @ElDtoField(logicalName = "특허사무소", physicalName = "patoffice", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "지식재산권")
    private String patoffice;

    @ElDtoField(logicalName = "oper_code", physicalName = "operCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String operCode;

    @ElDtoField(logicalName = "검토결과", physicalName = "approve", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "지식재산권")
    private String approve;

    @ElDtoField(logicalName = "IP실검토여부", physicalName = "check", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "지식재산권")
    private String check;

    @ElDtoField(logicalName = "국외여부", physicalName = "abroad", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "지식재산권")
    private String abroad;

    @ElDtoField(logicalName = "근태담당자", physicalName = "manager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager;

    @ElDtoField(logicalName = "업무여부", physicalName = "biz", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean biz;

    @ElDtoField(logicalName = "요청사용자ID", physicalName = "reqUid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqUid;

    @ElDtoField(logicalName = "결과", physicalName = "result", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String result;

    @ElDtoField(logicalName = "성공여부", physicalName = "success", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean success;

    @ElDtoField(logicalName = "반려여부", physicalName = "rejectYN", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rejectYN;

    @ElDtoField(logicalName = "휴가구분", physicalName = "repReason", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repReason;

    @ElDtoField(logicalName = "검사자여부", physicalName = "chkPsnYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chkPsnYn;

    @ElDtoField(logicalName = "사전안전성검토유무", physicalName = "safeYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String safeYn;

    @ElDtoField(logicalName = "검사자(계정책임자)", physicalName = "accountManager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accountManager;

    @ElDtoField(logicalName = "스냅샷모델", physicalName = "snap", type = "Map", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.Map snap;

    @ElDtoField(logicalName = "행동강령담당자", physicalName = "amangerId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String amangerId;

    @ElDtoField(logicalName = "허가제여부", physicalName = "approvalYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String approvalYn;

    @ElDtoField(logicalName = "변경후 멘토", physicalName = "befrMentr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String befrMentr;

    @ElDtoField(logicalName = "변경전 멘토", physicalName = "afterMentr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String afterMentr;

    @ElDtoField(logicalName = "사업지원실장", physicalName = "supportPsn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supportPsn;

    @ElDtoField(logicalName = "예산구분", physicalName = "reqClsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqClsf;

    @ElDtoField(logicalName = "담당자4시스템개인번호", physicalName = "manager4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager4;

    @ElDtoField(logicalName = "결의확정번호", physicalName = "slipNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slipNo;

    @ElDtoField(logicalName = "영수기술지원 신청자", physicalName = "yManager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "기술지원 통합프로세스 ( 아이디 : 416 , 별칭 : S02M )")
    private String yManager;

    @ElDtoField(logicalName = "청구기술지원 신청자", physicalName = "cManager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "기술지원 통합프로세스 ( 아이디 : 416 , 별칭 : S02M )")
    private String cManager;

    @ElDtoField(logicalName = "미수수탁결의 신청자", physicalName = "mManager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "기술지원 통합프로세스 ( 아이디 : 416 , 별칭 : S02M )")
    private String mManager;

    @ElDtoField(logicalName = "성적서담당자", physicalName = "tManager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "기술지원 통합프로세스 ( 아이디 : 416 , 별칭 : S02M )")
    private String tManager;

    @ElDtoField(logicalName = "활용책임자", physicalName = "tcManger", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tcManger;

    @ElDtoField(logicalName = "계산서 구분", physicalName = "billType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "기술지원 통합프로세스 ( 아이디 : 416 , 별칭 : S02M )")
    private String billType;

    @ElDtoField(logicalName = "금액", physicalName = "decsnamt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "기술지원 통합프로세스 ( 아이디 : 416 , 별칭 : S02M )")
    private String decsnamt;

    @ElDtoField(logicalName = "성적서 필요 유무", physicalName = "reportNeedYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "기술지원 통합프로세스 ( 아이디 : 416 , 별칭 : S02M )")
    private String reportNeedYn;

    @ElDtoField(logicalName = "휴가자", physicalName = "holidayPsn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String holidayPsn;

    @ElDtoField(logicalName = "차상위결재ID", physicalName = "nextApprUid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nextApprUid;

    @ElDtoField(logicalName = "차상위결재사번", physicalName = "nextApprSyspayNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nextApprSyspayNo;

    @ElDtoField(logicalName = "참여저자", physicalName = "author", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String author;

    @ElDtoField(logicalName = "서비스ID", physicalName = "taskExt1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "결재시서비스ID 조회 필요")
    private String taskExt1;

    @ElDtoField(logicalName = "퇴직신청확인코드", physicalName = "taskExt3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String taskExt3;

    @ElDtoField(logicalName = "직급구분", physicalName = "occuTyp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occuTyp;

    @ElDtoField(logicalName = "author2", physicalName = "author2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String author2;

    @ElDtoField(logicalName = "researchManager", physicalName = "researchManager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String researchManager;

    @ElDtoField(logicalName = "mouClsf", physicalName = "mouClsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mouClsf;

    @ElDtoField(logicalName = "techPrjClsf", physicalName = "techPrjClsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String techPrjClsf;

    @ElDtoField(logicalName = "managerRoleCode", physicalName = "managerRoleCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String managerRoleCode;

    @ElDtoField(logicalName = "techManagerSN", physicalName = "techManagerSN", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String techManagerSN;

    @ElDtoField(logicalName = "purDrafter", physicalName = "purDrafter", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String purDrafter;

    @ElDtoField(logicalName = "budgerCharger", physicalName = "budgerCharger", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String budgerCharger;

    @ElDtoField(logicalName = "rchYn", physicalName = "rchYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rchYn;

    @ElDtoField(logicalName = "bugtCtrlYn", physicalName = "bugtCtrlYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugtCtrlYn;

    @ElDtoField(logicalName = "타입구분", physicalName = "existSnap", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean existSnap;

    @ElDtoField(logicalName = "참여연구원", physicalName = "presearcher", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String presearcher;

    @ElDtoField(logicalName = "근접지원자", physicalName = "sManager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sManager;

    @ElDtoField(logicalName = "낙찰자선정취소여부", physicalName = "cancYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cancYn;

    @ElDtoField(logicalName = "적격심사합격여부", physicalName = "tryOutPassYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tryOutPassYn;

    @ElDtoField(logicalName = "적요", physicalName = "info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info;

    @ElDtoField(logicalName = "프로세스종료여부", physicalName = "toClose", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String toClose;

    @ElDtoField(logicalName = "openYn", physicalName = "openYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String openYn;

    @ElDtoField(logicalName = "outerPrjYn", physicalName = "outerPrjYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String outerPrjYn;

    @ElDtoField(logicalName = "researchCharger", physicalName = "researchCharger", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String researchCharger;

    @ElDtoField(logicalName = "evalManager", physicalName = "evalManager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evalManager;

    @ElDtoField(logicalName = "점검자", physicalName = "inspector", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inspector;

    @ElDtoField(logicalName = "협조자접수", physicalName = "techEvalManager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String techEvalManager;

    @ElDtoField(logicalName = "smanagerYn", physicalName = "smanagerYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smanagerYn;

    @ElDtoField(logicalName = "supmanager1", physicalName = "supmanager1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supmanager1;

    @ElDtoField(logicalName = "supmanager2", physicalName = "supmanager2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supmanager2;

    @ElDtoField(logicalName = "assetFlag", physicalName = "assetFlag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String assetFlag;

    @ElDtoField(logicalName = "inspection1", physicalName = "inspection1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inspection1;

    @ElDtoField(logicalName = "inspection2", physicalName = "inspection2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inspection2;

    @ElDtoField(logicalName = "memberInspec2", physicalName = "memberInspec2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String memberInspec2;

    @ElDtoField(logicalName = "inspection", physicalName = "inspection", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inspection;

    @ElDtoField(logicalName = "memberInspection", physicalName = "memberInspection", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String memberInspection;

    @ElDtoField(logicalName = "appType", physicalName = "appType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appType;

    @ElDtoField(logicalName = "expnscd", physicalName = "expnscd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expnscd;

    @ElDtoField(logicalName = "rcvAccountCharger", physicalName = "rcvAccountCharger", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcvAccountCharger;

    @ElDtoField(logicalName = "budgtCheck", physicalName = "budgtCheck", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String budgtCheck;

    @ElDtoField(logicalName = "budgtCheckPsn", physicalName = "budgtCheckPsn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String budgtCheckPsn;

    @ElDtoField(logicalName = "amt", physicalName = "amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String amt;

    @ElDtoField(logicalName = "applyYn", physicalName = "applyYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String applyYn;

    @ElDtoField(logicalName = "mainResearcher", physicalName = "mainResearcher", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mainResearcher;

    @ElDtoField(logicalName = "contractTypeMain", physicalName = "contractTypeMain", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contractTypeMain;

    @ElDtoField(logicalName = "manager1", physicalName = "manager1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager1;

    @ElDtoField(logicalName = "manager2", physicalName = "manager2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager2;

    @ElDtoField(logicalName = "manager3", physicalName = "manager3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager3;

    @ElDtoField(logicalName = "lcYn", physicalName = "lcYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lcYn;

    @ElDtoField(logicalName = "ttYn", physicalName = "ttYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ttYn;

    @ElDtoField(logicalName = "taxFreeYn", physicalName = "taxFreeYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String taxFreeYn;

    @ElDtoField(logicalName = "aftrYn", physicalName = "aftrYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aftrYn;

    @ElDtoField(logicalName = "shipInsuYn", physicalName = "shipInsuYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String shipInsuYn;

    @ElDtoField(logicalName = "cardYn", physicalName = "cardYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cardYn;

    @ElDtoField(logicalName = "domOverseaClsf", physicalName = "domOverseaClsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String domOverseaClsf;

    @ElDtoField(logicalName = "patClsf", physicalName = "patClsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patClsf;

    @ElDtoField(logicalName = "regInitiator", physicalName = "regInitiator", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regInitiator;

    @ElDtoField(logicalName = "interviewYn", physicalName = "interviewYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String interviewYn;

    @ElDtoField(logicalName = "업무대기함용", physicalName = "particiPation", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String particiPation;

    @ElDtoField(logicalName = "전결유무", physicalName = "ruleAutoYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ruleAutoYn;

    @ElDtoField(logicalName = "labResearcher", physicalName = "labResearcher", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String labResearcher;

    @ElDtoField(logicalName = "autoCmpltMan", physicalName = "autoCmpltMan", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String autoCmpltMan;

    @ElDtoField(logicalName = "결의서구분", physicalName = "slipGubun", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slipGubun;

    @ElDtoField(logicalName = "휴가구분", physicalName = "holidayClsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String holidayClsf;

    @ElDtoField(logicalName = "resManager", physicalName = "resManager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resManager;

    @ElDtoField(logicalName = "감사자사번", physicalName = "auditRolesSn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auditRolesSn;

    @ElDtoField(logicalName = "regAstYn", physicalName = "regAstYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regAstYn;

    @ElDtoField(logicalName = "계정책임자자경결재", physicalName = "NxtWrkAuto", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "기안자랑 계정책임자가 동일할 경우 Y온다")
    private String NxtWrkAuto;

    @ElDtoField(logicalName = "prjSelYn", physicalName = "prjSelYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prjSelYn;

    @ElDtoField(logicalName = "evalYn", physicalName = "evalYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evalYn;

    @ElDtoField(logicalName = "initiatorBpm", physicalName = "initiatorBpm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String initiatorBpm;

    @ElDtoField(logicalName = "accountType", physicalName = "accountType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accountType;

    @ElDtoField(logicalName = "도서담당자 롤코드", physicalName = "bookManagerRoleCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bookManagerRoleCode;

    @ElDtoField(logicalName = "재무담당자", physicalName = "finManager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String finManager;

    @ElDtoField(logicalName = "자산인계관리책임", physicalName = "totalManager1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String totalManager1;

    @ElDtoField(logicalName = "자산인수관리책임", physicalName = "totalManager2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String totalManager2;

    @ElDtoField(logicalName = "보안안전관리롤코드", physicalName = "safeControllerRoleCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String safeControllerRoleCode;

    @ElDtoField(logicalName = "보안안전담당롤코드", physicalName = "safeManagerRoleCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String safeManagerRoleCode;

    @ElDtoField(logicalName = "머지XSL여부", physicalName = "mergeXsl", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "false", desc = "")
    private boolean mergeXsl = false;

    @ElDtoField(logicalName = "reqnum", physicalName = "reqnum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqnum;

    @ElVoField(physicalName = "procDefAlias")
    public String getProcDefAlias(){
        return procDefAlias;
    }

    @ElVoField(physicalName = "procDefAlias")
    public void setProcDefAlias(String procDefAlias){
        this.procDefAlias = procDefAlias;
    }

    @ElVoField(physicalName = "endpoint")
    public String getEndpoint(){
        return endpoint;
    }

    @ElVoField(physicalName = "endpoint")
    public void setEndpoint(String endpoint){
        this.endpoint = endpoint;
    }

    @ElVoField(physicalName = "instStatus")
    public String getInstStatus(){
        return instStatus;
    }

    @ElVoField(physicalName = "instStatus")
    public void setInstStatus(String instStatus){
        this.instStatus = instStatus;
    }

    @ElVoField(physicalName = "titleName")
    public String getTitleName(){
        return titleName;
    }

    @ElVoField(physicalName = "titleName")
    public void setTitleName(String titleName){
        this.titleName = titleName;
    }

    @ElVoField(physicalName = "accntNo")
    public String getAccntNo(){
        return accntNo;
    }

    @ElVoField(physicalName = "accntNo")
    public void setAccntNo(String accntNo){
        this.accntNo = accntNo;
    }

    @ElVoField(physicalName = "html")
    public String getHtml(){
        return html;
    }

    @ElVoField(physicalName = "html")
    public void setHtml(String html){
        this.html = html;
    }

    @ElVoField(physicalName = "mainKey")
    public String getMainKey(){
        return mainKey;
    }

    @ElVoField(physicalName = "mainKey")
    public void setMainKey(String mainKey){
        this.mainKey = mainKey;
    }

    @ElVoField(physicalName = "reqNo")
    public String getReqNo(){
        return reqNo;
    }

    @ElVoField(physicalName = "reqNo")
    public void setReqNo(String reqNo){
        this.reqNo = reqNo;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @ElVoField(physicalName = "reporterId")
    public String getReporterId(){
        return reporterId;
    }

    @ElVoField(physicalName = "reporterId")
    public void setReporterId(String reporterId){
        this.reporterId = reporterId;
    }

    @ElVoField(physicalName = "uiId")
    public String getUiId(){
        return uiId;
    }

    @ElVoField(physicalName = "uiId")
    public void setUiId(String uiId){
        this.uiId = uiId;
    }

    @ElVoField(physicalName = "aprState")
    public String getAprState(){
        return aprState;
    }

    @ElVoField(physicalName = "aprState")
    public void setAprState(String aprState){
        this.aprState = aprState;
    }

    @ElVoField(physicalName = "infoCd")
    public String getInfoCd(){
        return infoCd;
    }

    @ElVoField(physicalName = "infoCd")
    public void setInfoCd(String infoCd){
        this.infoCd = infoCd;
    }

    @ElVoField(physicalName = "ext1Cd")
    public String getExt1Cd(){
        return ext1Cd;
    }

    @ElVoField(physicalName = "ext1Cd")
    public void setExt1Cd(String ext1Cd){
        this.ext1Cd = ext1Cd;
    }

    @ElVoField(physicalName = "ext2Cd")
    public String getExt2Cd(){
        return ext2Cd;
    }

    @ElVoField(physicalName = "ext2Cd")
    public void setExt2Cd(String ext2Cd){
        this.ext2Cd = ext2Cd;
    }

    @ElVoField(physicalName = "ext3Cd")
    public String getExt3Cd(){
        return ext3Cd;
    }

    @ElVoField(physicalName = "ext3Cd")
    public void setExt3Cd(String ext3Cd){
        this.ext3Cd = ext3Cd;
    }

    @ElVoField(physicalName = "loginUserId")
    public String getLoginUserId(){
        return loginUserId;
    }

    @ElVoField(physicalName = "loginUserId")
    public void setLoginUserId(String loginUserId){
        this.loginUserId = loginUserId;
    }

    @ElVoField(physicalName = "accountCharger")
    public String getAccountCharger(){
        return accountCharger;
    }

    @ElVoField(physicalName = "accountCharger")
    public void setAccountCharger(String accountCharger){
        this.accountCharger = accountCharger;
    }

    @ElVoField(physicalName = "budgetController")
    public String getBudgetController(){
        return budgetController;
    }

    @ElVoField(physicalName = "budgetController")
    public void setBudgetController(String budgetController){
        this.budgetController = budgetController;
    }

    @ElVoField(physicalName = "region")
    public String getRegion(){
        return region;
    }

    @ElVoField(physicalName = "region")
    public void setRegion(String region){
        this.region = region;
    }

    @ElVoField(physicalName = "audit")
    public String getAudit(){
        return audit;
    }

    @ElVoField(physicalName = "audit")
    public void setAudit(String audit){
        this.audit = audit;
    }

    @ElVoField(physicalName = "managerId")
    public String getManagerId(){
        return managerId;
    }

    @ElVoField(physicalName = "managerId")
    public void setManagerId(String managerId){
        this.managerId = managerId;
    }

    @ElVoField(physicalName = "biddingType")
    public String getBiddingType(){
        return biddingType;
    }

    @ElVoField(physicalName = "biddingType")
    public void setBiddingType(String biddingType){
        this.biddingType = biddingType;
    }

    @ElVoField(physicalName = "biddingTypeMain")
    public String getBiddingTypeMain(){
        return biddingTypeMain;
    }

    @ElVoField(physicalName = "biddingTypeMain")
    public void setBiddingTypeMain(String biddingTypeMain){
        this.biddingTypeMain = biddingTypeMain;
    }

    @ElVoField(physicalName = "estimatedPriceType")
    public String getEstimatedPriceType(){
        return estimatedPriceType;
    }

    @ElVoField(physicalName = "estimatedPriceType")
    public void setEstimatedPriceType(String estimatedPriceType){
        this.estimatedPriceType = estimatedPriceType;
    }

    @ElVoField(physicalName = "estimatedOnoff")
    public String getEstimatedOnoff(){
        return estimatedOnoff;
    }

    @ElVoField(physicalName = "estimatedOnoff")
    public void setEstimatedOnoff(String estimatedOnoff){
        this.estimatedOnoff = estimatedOnoff;
    }

    @ElVoField(physicalName = "dcFcType")
    public String getDcFcType(){
        return dcFcType;
    }

    @ElVoField(physicalName = "dcFcType")
    public void setDcFcType(String dcFcType){
        this.dcFcType = dcFcType;
    }

    @ElVoField(physicalName = "manualContractYn")
    public String getManualContractYn(){
        return manualContractYn;
    }

    @ElVoField(physicalName = "manualContractYn")
    public void setManualContractYn(String manualContractYn){
        this.manualContractYn = manualContractYn;
    }

    @ElVoField(physicalName = "pqReviewYn")
    public String getPqReviewYn(){
        return pqReviewYn;
    }

    @ElVoField(physicalName = "pqReviewYn")
    public void setPqReviewYn(String pqReviewYn){
        this.pqReviewYn = pqReviewYn;
    }

    @ElVoField(physicalName = "contractType")
    public String getContractType(){
        return contractType;
    }

    @ElVoField(physicalName = "contractType")
    public void setContractType(String contractType){
        this.contractType = contractType;
    }

    @ElVoField(physicalName = "orderType")
    public String getOrderType(){
        return orderType;
    }

    @ElVoField(physicalName = "orderType")
    public void setOrderType(String orderType){
        this.orderType = orderType;
    }

    @ElVoField(physicalName = "purRequestor")
    public String getPurRequestor(){
        return purRequestor;
    }

    @ElVoField(physicalName = "purRequestor")
    public void setPurRequestor(String purRequestor){
        this.purRequestor = purRequestor;
    }

    @ElVoField(physicalName = "charger")
    public String getCharger(){
        return charger;
    }

    @ElVoField(physicalName = "charger")
    public void setCharger(String charger){
        this.charger = charger;
    }

    @ElVoField(physicalName = "amounts")
    public String getAmounts(){
        return amounts;
    }

    @ElVoField(physicalName = "amounts")
    public void setAmounts(String amounts){
        this.amounts = amounts;
    }

    @ElVoField(physicalName = "travelers")
    public String getTravelers(){
        return travelers;
    }

    @ElVoField(physicalName = "travelers")
    public void setTravelers(String travelers){
        this.travelers = travelers;
    }

    @ElVoField(physicalName = "autoControlYn")
    public String getAutoControlYn(){
        return autoControlYn;
    }

    @ElVoField(physicalName = "autoControlYn")
    public void setAutoControlYn(String autoControlYn){
        this.autoControlYn = autoControlYn;
    }

    @ElVoField(physicalName = "unslipNo")
    public String getUnslipNo(){
        return unslipNo;
    }

    @ElVoField(physicalName = "unslipNo")
    public void setUnslipNo(String unslipNo){
        this.unslipNo = unslipNo;
    }

    @ElVoField(physicalName = "holiday")
    public String getHoliday(){
        return holiday;
    }

    @ElVoField(physicalName = "holiday")
    public void setHoliday(String holiday){
        this.holiday = holiday;
    }

    @ElVoField(physicalName = "ruleType")
    public String getRuleType(){
        return ruleType;
    }

    @ElVoField(physicalName = "ruleType")
    public void setRuleType(String ruleType){
        this.ruleType = ruleType;
    }

    @ElVoField(physicalName = "ruleMoney")
    public String getRuleMoney(){
        return ruleMoney;
    }

    @ElVoField(physicalName = "ruleMoney")
    public void setRuleMoney(String ruleMoney){
        this.ruleMoney = ruleMoney;
    }

    @ElVoField(physicalName = "tripGoal")
    public String getTripGoal(){
        return tripGoal;
    }

    @ElVoField(physicalName = "tripGoal")
    public void setTripGoal(String tripGoal){
        this.tripGoal = tripGoal;
    }

    @ElVoField(physicalName = "oneDay")
    public String getOneDay(){
        return oneDay;
    }

    @ElVoField(physicalName = "oneDay")
    public void setOneDay(String oneDay){
        this.oneDay = oneDay;
    }

    @ElVoField(physicalName = "chgnYn")
    public String getChgnYn(){
        return chgnYn;
    }

    @ElVoField(physicalName = "chgnYn")
    public void setChgnYn(String chgnYn){
        this.chgnYn = chgnYn;
    }

    @ElVoField(physicalName = "techNegoYn")
    public String getTechNegoYn(){
        return techNegoYn;
    }

    @ElVoField(physicalName = "techNegoYn")
    public void setTechNegoYn(String techNegoYn){
        this.techNegoYn = techNegoYn;
    }

    @ElVoField(physicalName = "bidPresentationYn")
    public String getBidPresentationYn(){
        return bidPresentationYn;
    }

    @ElVoField(physicalName = "bidPresentationYn")
    public void setBidPresentationYn(String bidPresentationYn){
        this.bidPresentationYn = bidPresentationYn;
    }

    @ElVoField(physicalName = "deptHed1")
    public String getDeptHed1(){
        return deptHed1;
    }

    @ElVoField(physicalName = "deptHed1")
    public void setDeptHed1(String deptHed1){
        this.deptHed1 = deptHed1;
    }

    @ElVoField(physicalName = "deptHed2")
    public String getDeptHed2(){
        return deptHed2;
    }

    @ElVoField(physicalName = "deptHed2")
    public void setDeptHed2(String deptHed2){
        this.deptHed2 = deptHed2;
    }

    @ElVoField(physicalName = "headType1")
    public String getHeadType1(){
        return headType1;
    }

    @ElVoField(physicalName = "headType1")
    public void setHeadType1(String headType1){
        this.headType1 = headType1;
    }

    @ElVoField(physicalName = "headType2")
    public String getHeadType2(){
        return headType2;
    }

    @ElVoField(physicalName = "headType2")
    public void setHeadType2(String headType2){
        this.headType2 = headType2;
    }

    @ElVoField(physicalName = "rcmsRes")
    public String getRcmsRes(){
        return rcmsRes;
    }

    @ElVoField(physicalName = "rcmsRes")
    public void setRcmsRes(String rcmsRes){
        this.rcmsRes = rcmsRes;
    }

    @ElVoField(physicalName = "rcmsPoint")
    public String getRcmsPoint(){
        return rcmsPoint;
    }

    @ElVoField(physicalName = "rcmsPoint")
    public void setRcmsPoint(String rcmsPoint){
        this.rcmsPoint = rcmsPoint;
    }

    @ElVoField(physicalName = "enaraYn")
    public String getEnaraYn(){
        return enaraYn;
    }

    @ElVoField(physicalName = "enaraYn")
    public void setEnaraYn(String enaraYn){
        this.enaraYn = enaraYn;
    }

    @ElVoField(physicalName = "researchChargerId")
    public String getResearchChargerId(){
        return researchChargerId;
    }

    @ElVoField(physicalName = "researchChargerId")
    public void setResearchChargerId(String researchChargerId){
        this.researchChargerId = researchChargerId;
    }

    @ElVoField(physicalName = "researcher")
    public String getResearcher(){
        return researcher;
    }

    @ElVoField(physicalName = "researcher")
    public void setResearcher(String researcher){
        this.researcher = researcher;
    }

    @ElVoField(physicalName = "securityCd")
    public String getSecurityCd(){
        return securityCd;
    }

    @ElVoField(physicalName = "securityCd")
    public void setSecurityCd(String securityCd){
        this.securityCd = securityCd;
    }

    @ElVoField(physicalName = "occutyp")
    public String getOccutyp(){
        return occutyp;
    }

    @ElVoField(physicalName = "occutyp")
    public void setOccutyp(String occutyp){
        this.occutyp = occutyp;
    }

    @ElVoField(physicalName = "cardKeepperYn")
    public String getCardKeepperYn(){
        return cardKeepperYn;
    }

    @ElVoField(physicalName = "cardKeepperYn")
    public void setCardKeepperYn(String cardKeepperYn){
        this.cardKeepperYn = cardKeepperYn;
    }

    @ElVoField(physicalName = "bookManager")
    public String getBookManager(){
        return bookManager;
    }

    @ElVoField(physicalName = "bookManager")
    public void setBookManager(String bookManager){
        this.bookManager = bookManager;
    }

    @ElVoField(physicalName = "expns")
    public String getExpns(){
        return expns;
    }

    @ElVoField(physicalName = "expns")
    public void setExpns(String expns){
        this.expns = expns;
    }

    @ElVoField(physicalName = "inspectEvid")
    public String getInspectEvid(){
        return inspectEvid;
    }

    @ElVoField(physicalName = "inspectEvid")
    public void setInspectEvid(String inspectEvid){
        this.inspectEvid = inspectEvid;
    }

    @ElVoField(physicalName = "inspectYn")
    public String getInspectYn(){
        return inspectYn;
    }

    @ElVoField(physicalName = "inspectYn")
    public void setInspectYn(String inspectYn){
        this.inspectYn = inspectYn;
    }

    @ElVoField(physicalName = "assetRgManager")
    public String getAssetRgManager(){
        return assetRgManager;
    }

    @ElVoField(physicalName = "assetRgManager")
    public void setAssetRgManager(String assetRgManager){
        this.assetRgManager = assetRgManager;
    }

    @ElVoField(physicalName = "noMoney")
    public String getNoMoney(){
        return noMoney;
    }

    @ElVoField(physicalName = "noMoney")
    public void setNoMoney(String noMoney){
        this.noMoney = noMoney;
    }

    @ElVoField(physicalName = "patoffice")
    public String getPatoffice(){
        return patoffice;
    }

    @ElVoField(physicalName = "patoffice")
    public void setPatoffice(String patoffice){
        this.patoffice = patoffice;
    }

    @ElVoField(physicalName = "operCode")
    public String getOperCode(){
        return operCode;
    }

    @ElVoField(physicalName = "operCode")
    public void setOperCode(String operCode){
        this.operCode = operCode;
    }

    @ElVoField(physicalName = "approve")
    public String getApprove(){
        return approve;
    }

    @ElVoField(physicalName = "approve")
    public void setApprove(String approve){
        this.approve = approve;
    }

    @ElVoField(physicalName = "check")
    public String getCheck(){
        return check;
    }

    @ElVoField(physicalName = "check")
    public void setCheck(String check){
        this.check = check;
    }

    @ElVoField(physicalName = "abroad")
    public String getAbroad(){
        return abroad;
    }

    @ElVoField(physicalName = "abroad")
    public void setAbroad(String abroad){
        this.abroad = abroad;
    }

    @ElVoField(physicalName = "manager")
    public String getManager(){
        return manager;
    }

    @ElVoField(physicalName = "manager")
    public void setManager(String manager){
        this.manager = manager;
    }

    @ElVoField(physicalName = "biz")
    public boolean isBiz(){
        return biz;
    }

    @ElVoField(physicalName = "biz")
    public void setBiz(boolean biz){
        this.biz = biz;
    }

    @ElVoField(physicalName = "reqUid")
    public String getReqUid(){
        return reqUid;
    }

    @ElVoField(physicalName = "reqUid")
    public void setReqUid(String reqUid){
        this.reqUid = reqUid;
    }

    @ElVoField(physicalName = "result")
    public String getResult(){
        return result;
    }

    @ElVoField(physicalName = "result")
    public void setResult(String result){
        this.result = result;
    }

    @ElVoField(physicalName = "success")
    public boolean isSuccess(){
        return success;
    }

    @ElVoField(physicalName = "success")
    public void setSuccess(boolean success){
        this.success = success;
    }

    @ElVoField(physicalName = "rejectYN")
    public String getRejectYN(){
        return rejectYN;
    }

    @ElVoField(physicalName = "rejectYN")
    public void setRejectYN(String rejectYN){
        this.rejectYN = rejectYN;
    }

    @ElVoField(physicalName = "repReason")
    public String getRepReason(){
        return repReason;
    }

    @ElVoField(physicalName = "repReason")
    public void setRepReason(String repReason){
        this.repReason = repReason;
    }

    @ElVoField(physicalName = "chkPsnYn")
    public String getChkPsnYn(){
        return chkPsnYn;
    }

    @ElVoField(physicalName = "chkPsnYn")
    public void setChkPsnYn(String chkPsnYn){
        this.chkPsnYn = chkPsnYn;
    }

    @ElVoField(physicalName = "safeYn")
    public String getSafeYn(){
        return safeYn;
    }

    @ElVoField(physicalName = "safeYn")
    public void setSafeYn(String safeYn){
        this.safeYn = safeYn;
    }

    @ElVoField(physicalName = "accountManager")
    public String getAccountManager(){
        return accountManager;
    }

    @ElVoField(physicalName = "accountManager")
    public void setAccountManager(String accountManager){
        this.accountManager = accountManager;
    }

    @ElVoField(physicalName = "snap")
    public java.util.Map getSnap(){
        return snap;
    }

    @ElVoField(physicalName = "snap")
    public void setSnap(java.util.Map snap){
        this.snap = snap;
    }

    @ElVoField(physicalName = "amangerId")
    public String getAmangerId(){
        return amangerId;
    }

    @ElVoField(physicalName = "amangerId")
    public void setAmangerId(String amangerId){
        this.amangerId = amangerId;
    }

    @ElVoField(physicalName = "approvalYn")
    public String getApprovalYn(){
        return approvalYn;
    }

    @ElVoField(physicalName = "approvalYn")
    public void setApprovalYn(String approvalYn){
        this.approvalYn = approvalYn;
    }

    @ElVoField(physicalName = "befrMentr")
    public String getBefrMentr(){
        return befrMentr;
    }

    @ElVoField(physicalName = "befrMentr")
    public void setBefrMentr(String befrMentr){
        this.befrMentr = befrMentr;
    }

    @ElVoField(physicalName = "afterMentr")
    public String getAfterMentr(){
        return afterMentr;
    }

    @ElVoField(physicalName = "afterMentr")
    public void setAfterMentr(String afterMentr){
        this.afterMentr = afterMentr;
    }

    @ElVoField(physicalName = "supportPsn")
    public String getSupportPsn(){
        return supportPsn;
    }

    @ElVoField(physicalName = "supportPsn")
    public void setSupportPsn(String supportPsn){
        this.supportPsn = supportPsn;
    }

    @ElVoField(physicalName = "reqClsf")
    public String getReqClsf(){
        return reqClsf;
    }

    @ElVoField(physicalName = "reqClsf")
    public void setReqClsf(String reqClsf){
        this.reqClsf = reqClsf;
    }

    @ElVoField(physicalName = "manager4")
    public String getManager4(){
        return manager4;
    }

    @ElVoField(physicalName = "manager4")
    public void setManager4(String manager4){
        this.manager4 = manager4;
    }

    @ElVoField(physicalName = "slipNo")
    public String getSlipNo(){
        return slipNo;
    }

    @ElVoField(physicalName = "slipNo")
    public void setSlipNo(String slipNo){
        this.slipNo = slipNo;
    }

    @ElVoField(physicalName = "yManager")
    public String getYManager(){
        return yManager;
    }

    @ElVoField(physicalName = "yManager")
    public void setYManager(String yManager){
        this.yManager = yManager;
    }

    @ElVoField(physicalName = "cManager")
    public String getCManager(){
        return cManager;
    }

    @ElVoField(physicalName = "cManager")
    public void setCManager(String cManager){
        this.cManager = cManager;
    }

    @ElVoField(physicalName = "mManager")
    public String getMManager(){
        return mManager;
    }

    @ElVoField(physicalName = "mManager")
    public void setMManager(String mManager){
        this.mManager = mManager;
    }

    @ElVoField(physicalName = "tManager")
    public String getTManager(){
        return tManager;
    }

    @ElVoField(physicalName = "tManager")
    public void setTManager(String tManager){
        this.tManager = tManager;
    }

    @ElVoField(physicalName = "tcManger")
    public String getTcManger(){
        return tcManger;
    }

    @ElVoField(physicalName = "tcManger")
    public void setTcManger(String tcManger){
        this.tcManger = tcManger;
    }

    @ElVoField(physicalName = "billType")
    public String getBillType(){
        return billType;
    }

    @ElVoField(physicalName = "billType")
    public void setBillType(String billType){
        this.billType = billType;
    }

    @ElVoField(physicalName = "decsnamt")
    public String getDecsnamt(){
        return decsnamt;
    }

    @ElVoField(physicalName = "decsnamt")
    public void setDecsnamt(String decsnamt){
        this.decsnamt = decsnamt;
    }

    @ElVoField(physicalName = "reportNeedYn")
    public String getReportNeedYn(){
        return reportNeedYn;
    }

    @ElVoField(physicalName = "reportNeedYn")
    public void setReportNeedYn(String reportNeedYn){
        this.reportNeedYn = reportNeedYn;
    }

    @ElVoField(physicalName = "holidayPsn")
    public String getHolidayPsn(){
        return holidayPsn;
    }

    @ElVoField(physicalName = "holidayPsn")
    public void setHolidayPsn(String holidayPsn){
        this.holidayPsn = holidayPsn;
    }

    @ElVoField(physicalName = "nextApprUid")
    public String getNextApprUid(){
        return nextApprUid;
    }

    @ElVoField(physicalName = "nextApprUid")
    public void setNextApprUid(String nextApprUid){
        this.nextApprUid = nextApprUid;
    }

    @ElVoField(physicalName = "nextApprSyspayNo")
    public String getNextApprSyspayNo(){
        return nextApprSyspayNo;
    }

    @ElVoField(physicalName = "nextApprSyspayNo")
    public void setNextApprSyspayNo(String nextApprSyspayNo){
        this.nextApprSyspayNo = nextApprSyspayNo;
    }

    @ElVoField(physicalName = "author")
    public String getAuthor(){
        return author;
    }

    @ElVoField(physicalName = "author")
    public void setAuthor(String author){
        this.author = author;
    }

    @ElVoField(physicalName = "taskExt1")
    public String getTaskExt1(){
        return taskExt1;
    }

    @ElVoField(physicalName = "taskExt1")
    public void setTaskExt1(String taskExt1){
        this.taskExt1 = taskExt1;
    }

    @ElVoField(physicalName = "taskExt3")
    public String getTaskExt3(){
        return taskExt3;
    }

    @ElVoField(physicalName = "taskExt3")
    public void setTaskExt3(String taskExt3){
        this.taskExt3 = taskExt3;
    }

    @ElVoField(physicalName = "occuTyp")
    public String getOccuTyp(){
        return occuTyp;
    }

    @ElVoField(physicalName = "occuTyp")
    public void setOccuTyp(String occuTyp){
        this.occuTyp = occuTyp;
    }

    @ElVoField(physicalName = "author2")
    public String getAuthor2(){
        return author2;
    }

    @ElVoField(physicalName = "author2")
    public void setAuthor2(String author2){
        this.author2 = author2;
    }

    @ElVoField(physicalName = "researchManager")
    public String getResearchManager(){
        return researchManager;
    }

    @ElVoField(physicalName = "researchManager")
    public void setResearchManager(String researchManager){
        this.researchManager = researchManager;
    }

    @ElVoField(physicalName = "mouClsf")
    public String getMouClsf(){
        return mouClsf;
    }

    @ElVoField(physicalName = "mouClsf")
    public void setMouClsf(String mouClsf){
        this.mouClsf = mouClsf;
    }

    @ElVoField(physicalName = "techPrjClsf")
    public String getTechPrjClsf(){
        return techPrjClsf;
    }

    @ElVoField(physicalName = "techPrjClsf")
    public void setTechPrjClsf(String techPrjClsf){
        this.techPrjClsf = techPrjClsf;
    }

    @ElVoField(physicalName = "managerRoleCode")
    public String getManagerRoleCode(){
        return managerRoleCode;
    }

    @ElVoField(physicalName = "managerRoleCode")
    public void setManagerRoleCode(String managerRoleCode){
        this.managerRoleCode = managerRoleCode;
    }

    @ElVoField(physicalName = "techManagerSN")
    public String getTechManagerSN(){
        return techManagerSN;
    }

    @ElVoField(physicalName = "techManagerSN")
    public void setTechManagerSN(String techManagerSN){
        this.techManagerSN = techManagerSN;
    }

    @ElVoField(physicalName = "purDrafter")
    public String getPurDrafter(){
        return purDrafter;
    }

    @ElVoField(physicalName = "purDrafter")
    public void setPurDrafter(String purDrafter){
        this.purDrafter = purDrafter;
    }

    @ElVoField(physicalName = "budgerCharger")
    public String getBudgerCharger(){
        return budgerCharger;
    }

    @ElVoField(physicalName = "budgerCharger")
    public void setBudgerCharger(String budgerCharger){
        this.budgerCharger = budgerCharger;
    }

    @ElVoField(physicalName = "rchYn")
    public String getRchYn(){
        return rchYn;
    }

    @ElVoField(physicalName = "rchYn")
    public void setRchYn(String rchYn){
        this.rchYn = rchYn;
    }

    @ElVoField(physicalName = "bugtCtrlYn")
    public String getBugtCtrlYn(){
        return bugtCtrlYn;
    }

    @ElVoField(physicalName = "bugtCtrlYn")
    public void setBugtCtrlYn(String bugtCtrlYn){
        this.bugtCtrlYn = bugtCtrlYn;
    }

    @ElVoField(physicalName = "existSnap")
    public boolean isExistSnap(){
        return existSnap;
    }

    @ElVoField(physicalName = "existSnap")
    public void setExistSnap(boolean existSnap){
        this.existSnap = existSnap;
    }

    @ElVoField(physicalName = "presearcher")
    public String getPresearcher(){
        return presearcher;
    }

    @ElVoField(physicalName = "presearcher")
    public void setPresearcher(String presearcher){
        this.presearcher = presearcher;
    }

    @ElVoField(physicalName = "sManager")
    public String getSManager(){
        return sManager;
    }

    @ElVoField(physicalName = "sManager")
    public void setSManager(String sManager){
        this.sManager = sManager;
    }

    @ElVoField(physicalName = "cancYn")
    public String getCancYn(){
        return cancYn;
    }

    @ElVoField(physicalName = "cancYn")
    public void setCancYn(String cancYn){
        this.cancYn = cancYn;
    }

    @ElVoField(physicalName = "tryOutPassYn")
    public String getTryOutPassYn(){
        return tryOutPassYn;
    }

    @ElVoField(physicalName = "tryOutPassYn")
    public void setTryOutPassYn(String tryOutPassYn){
        this.tryOutPassYn = tryOutPassYn;
    }

    @ElVoField(physicalName = "info")
    public String getInfo(){
        return info;
    }

    @ElVoField(physicalName = "info")
    public void setInfo(String info){
        this.info = info;
    }

    @ElVoField(physicalName = "toClose")
    public String getToClose(){
        return toClose;
    }

    @ElVoField(physicalName = "toClose")
    public void setToClose(String toClose){
        this.toClose = toClose;
    }

    @ElVoField(physicalName = "openYn")
    public String getOpenYn(){
        return openYn;
    }

    @ElVoField(physicalName = "openYn")
    public void setOpenYn(String openYn){
        this.openYn = openYn;
    }

    @ElVoField(physicalName = "outerPrjYn")
    public String getOuterPrjYn(){
        return outerPrjYn;
    }

    @ElVoField(physicalName = "outerPrjYn")
    public void setOuterPrjYn(String outerPrjYn){
        this.outerPrjYn = outerPrjYn;
    }

    @ElVoField(physicalName = "researchCharger")
    public String getResearchCharger(){
        return researchCharger;
    }

    @ElVoField(physicalName = "researchCharger")
    public void setResearchCharger(String researchCharger){
        this.researchCharger = researchCharger;
    }

    @ElVoField(physicalName = "evalManager")
    public String getEvalManager(){
        return evalManager;
    }

    @ElVoField(physicalName = "evalManager")
    public void setEvalManager(String evalManager){
        this.evalManager = evalManager;
    }

    @ElVoField(physicalName = "inspector")
    public String getInspector(){
        return inspector;
    }

    @ElVoField(physicalName = "inspector")
    public void setInspector(String inspector){
        this.inspector = inspector;
    }

    @ElVoField(physicalName = "techEvalManager")
    public String getTechEvalManager(){
        return techEvalManager;
    }

    @ElVoField(physicalName = "techEvalManager")
    public void setTechEvalManager(String techEvalManager){
        this.techEvalManager = techEvalManager;
    }

    @ElVoField(physicalName = "smanagerYn")
    public String getSmanagerYn(){
        return smanagerYn;
    }

    @ElVoField(physicalName = "smanagerYn")
    public void setSmanagerYn(String smanagerYn){
        this.smanagerYn = smanagerYn;
    }

    @ElVoField(physicalName = "supmanager1")
    public String getSupmanager1(){
        return supmanager1;
    }

    @ElVoField(physicalName = "supmanager1")
    public void setSupmanager1(String supmanager1){
        this.supmanager1 = supmanager1;
    }

    @ElVoField(physicalName = "supmanager2")
    public String getSupmanager2(){
        return supmanager2;
    }

    @ElVoField(physicalName = "supmanager2")
    public void setSupmanager2(String supmanager2){
        this.supmanager2 = supmanager2;
    }

    @ElVoField(physicalName = "assetFlag")
    public String getAssetFlag(){
        return assetFlag;
    }

    @ElVoField(physicalName = "assetFlag")
    public void setAssetFlag(String assetFlag){
        this.assetFlag = assetFlag;
    }

    @ElVoField(physicalName = "inspection1")
    public String getInspection1(){
        return inspection1;
    }

    @ElVoField(physicalName = "inspection1")
    public void setInspection1(String inspection1){
        this.inspection1 = inspection1;
    }

    @ElVoField(physicalName = "inspection2")
    public String getInspection2(){
        return inspection2;
    }

    @ElVoField(physicalName = "inspection2")
    public void setInspection2(String inspection2){
        this.inspection2 = inspection2;
    }

    @ElVoField(physicalName = "memberInspec2")
    public String getMemberInspec2(){
        return memberInspec2;
    }

    @ElVoField(physicalName = "memberInspec2")
    public void setMemberInspec2(String memberInspec2){
        this.memberInspec2 = memberInspec2;
    }

    @ElVoField(physicalName = "inspection")
    public String getInspection(){
        return inspection;
    }

    @ElVoField(physicalName = "inspection")
    public void setInspection(String inspection){
        this.inspection = inspection;
    }

    @ElVoField(physicalName = "memberInspection")
    public String getMemberInspection(){
        return memberInspection;
    }

    @ElVoField(physicalName = "memberInspection")
    public void setMemberInspection(String memberInspection){
        this.memberInspection = memberInspection;
    }

    @ElVoField(physicalName = "appType")
    public String getAppType(){
        return appType;
    }

    @ElVoField(physicalName = "appType")
    public void setAppType(String appType){
        this.appType = appType;
    }

    @ElVoField(physicalName = "expnscd")
    public String getExpnscd(){
        return expnscd;
    }

    @ElVoField(physicalName = "expnscd")
    public void setExpnscd(String expnscd){
        this.expnscd = expnscd;
    }

    @ElVoField(physicalName = "rcvAccountCharger")
    public String getRcvAccountCharger(){
        return rcvAccountCharger;
    }

    @ElVoField(physicalName = "rcvAccountCharger")
    public void setRcvAccountCharger(String rcvAccountCharger){
        this.rcvAccountCharger = rcvAccountCharger;
    }

    @ElVoField(physicalName = "budgtCheck")
    public String getBudgtCheck(){
        return budgtCheck;
    }

    @ElVoField(physicalName = "budgtCheck")
    public void setBudgtCheck(String budgtCheck){
        this.budgtCheck = budgtCheck;
    }

    @ElVoField(physicalName = "budgtCheckPsn")
    public String getBudgtCheckPsn(){
        return budgtCheckPsn;
    }

    @ElVoField(physicalName = "budgtCheckPsn")
    public void setBudgtCheckPsn(String budgtCheckPsn){
        this.budgtCheckPsn = budgtCheckPsn;
    }

    @ElVoField(physicalName = "amt")
    public String getAmt(){
        return amt;
    }

    @ElVoField(physicalName = "amt")
    public void setAmt(String amt){
        this.amt = amt;
    }

    @ElVoField(physicalName = "applyYn")
    public String getApplyYn(){
        return applyYn;
    }

    @ElVoField(physicalName = "applyYn")
    public void setApplyYn(String applyYn){
        this.applyYn = applyYn;
    }

    @ElVoField(physicalName = "mainResearcher")
    public String getMainResearcher(){
        return mainResearcher;
    }

    @ElVoField(physicalName = "mainResearcher")
    public void setMainResearcher(String mainResearcher){
        this.mainResearcher = mainResearcher;
    }

    @ElVoField(physicalName = "contractTypeMain")
    public String getContractTypeMain(){
        return contractTypeMain;
    }

    @ElVoField(physicalName = "contractTypeMain")
    public void setContractTypeMain(String contractTypeMain){
        this.contractTypeMain = contractTypeMain;
    }

    @ElVoField(physicalName = "manager1")
    public String getManager1(){
        return manager1;
    }

    @ElVoField(physicalName = "manager1")
    public void setManager1(String manager1){
        this.manager1 = manager1;
    }

    @ElVoField(physicalName = "manager2")
    public String getManager2(){
        return manager2;
    }

    @ElVoField(physicalName = "manager2")
    public void setManager2(String manager2){
        this.manager2 = manager2;
    }

    @ElVoField(physicalName = "manager3")
    public String getManager3(){
        return manager3;
    }

    @ElVoField(physicalName = "manager3")
    public void setManager3(String manager3){
        this.manager3 = manager3;
    }

    @ElVoField(physicalName = "lcYn")
    public String getLcYn(){
        return lcYn;
    }

    @ElVoField(physicalName = "lcYn")
    public void setLcYn(String lcYn){
        this.lcYn = lcYn;
    }

    @ElVoField(physicalName = "ttYn")
    public String getTtYn(){
        return ttYn;
    }

    @ElVoField(physicalName = "ttYn")
    public void setTtYn(String ttYn){
        this.ttYn = ttYn;
    }

    @ElVoField(physicalName = "taxFreeYn")
    public String getTaxFreeYn(){
        return taxFreeYn;
    }

    @ElVoField(physicalName = "taxFreeYn")
    public void setTaxFreeYn(String taxFreeYn){
        this.taxFreeYn = taxFreeYn;
    }

    @ElVoField(physicalName = "aftrYn")
    public String getAftrYn(){
        return aftrYn;
    }

    @ElVoField(physicalName = "aftrYn")
    public void setAftrYn(String aftrYn){
        this.aftrYn = aftrYn;
    }

    @ElVoField(physicalName = "shipInsuYn")
    public String getShipInsuYn(){
        return shipInsuYn;
    }

    @ElVoField(physicalName = "shipInsuYn")
    public void setShipInsuYn(String shipInsuYn){
        this.shipInsuYn = shipInsuYn;
    }

    @ElVoField(physicalName = "cardYn")
    public String getCardYn(){
        return cardYn;
    }

    @ElVoField(physicalName = "cardYn")
    public void setCardYn(String cardYn){
        this.cardYn = cardYn;
    }

    @ElVoField(physicalName = "domOverseaClsf")
    public String getDomOverseaClsf(){
        return domOverseaClsf;
    }

    @ElVoField(physicalName = "domOverseaClsf")
    public void setDomOverseaClsf(String domOverseaClsf){
        this.domOverseaClsf = domOverseaClsf;
    }

    @ElVoField(physicalName = "patClsf")
    public String getPatClsf(){
        return patClsf;
    }

    @ElVoField(physicalName = "patClsf")
    public void setPatClsf(String patClsf){
        this.patClsf = patClsf;
    }

    @ElVoField(physicalName = "regInitiator")
    public String getRegInitiator(){
        return regInitiator;
    }

    @ElVoField(physicalName = "regInitiator")
    public void setRegInitiator(String regInitiator){
        this.regInitiator = regInitiator;
    }

    @ElVoField(physicalName = "interviewYn")
    public String getInterviewYn(){
        return interviewYn;
    }

    @ElVoField(physicalName = "interviewYn")
    public void setInterviewYn(String interviewYn){
        this.interviewYn = interviewYn;
    }

    @ElVoField(physicalName = "particiPation")
    public String getParticiPation(){
        return particiPation;
    }

    @ElVoField(physicalName = "particiPation")
    public void setParticiPation(String particiPation){
        this.particiPation = particiPation;
    }

    @ElVoField(physicalName = "ruleAutoYn")
    public String getRuleAutoYn(){
        return ruleAutoYn;
    }

    @ElVoField(physicalName = "ruleAutoYn")
    public void setRuleAutoYn(String ruleAutoYn){
        this.ruleAutoYn = ruleAutoYn;
    }

    @ElVoField(physicalName = "labResearcher")
    public String getLabResearcher(){
        return labResearcher;
    }

    @ElVoField(physicalName = "labResearcher")
    public void setLabResearcher(String labResearcher){
        this.labResearcher = labResearcher;
    }

    @ElVoField(physicalName = "autoCmpltMan")
    public String getAutoCmpltMan(){
        return autoCmpltMan;
    }

    @ElVoField(physicalName = "autoCmpltMan")
    public void setAutoCmpltMan(String autoCmpltMan){
        this.autoCmpltMan = autoCmpltMan;
    }

    @ElVoField(physicalName = "slipGubun")
    public String getSlipGubun(){
        return slipGubun;
    }

    @ElVoField(physicalName = "slipGubun")
    public void setSlipGubun(String slipGubun){
        this.slipGubun = slipGubun;
    }

    @ElVoField(physicalName = "holidayClsf")
    public String getHolidayClsf(){
        return holidayClsf;
    }

    @ElVoField(physicalName = "holidayClsf")
    public void setHolidayClsf(String holidayClsf){
        this.holidayClsf = holidayClsf;
    }

    @ElVoField(physicalName = "resManager")
    public String getResManager(){
        return resManager;
    }

    @ElVoField(physicalName = "resManager")
    public void setResManager(String resManager){
        this.resManager = resManager;
    }

    @ElVoField(physicalName = "auditRolesSn")
    public String getAuditRolesSn(){
        return auditRolesSn;
    }

    @ElVoField(physicalName = "auditRolesSn")
    public void setAuditRolesSn(String auditRolesSn){
        this.auditRolesSn = auditRolesSn;
    }

    @ElVoField(physicalName = "regAstYn")
    public String getRegAstYn(){
        return regAstYn;
    }

    @ElVoField(physicalName = "regAstYn")
    public void setRegAstYn(String regAstYn){
        this.regAstYn = regAstYn;
    }

    @ElVoField(physicalName = "NxtWrkAuto")
    public String getNxtWrkAuto(){
        return NxtWrkAuto;
    }

    @ElVoField(physicalName = "NxtWrkAuto")
    public void setNxtWrkAuto(String NxtWrkAuto){
        this.NxtWrkAuto = NxtWrkAuto;
    }

    @ElVoField(physicalName = "prjSelYn")
    public String getPrjSelYn(){
        return prjSelYn;
    }

    @ElVoField(physicalName = "prjSelYn")
    public void setPrjSelYn(String prjSelYn){
        this.prjSelYn = prjSelYn;
    }

    @ElVoField(physicalName = "evalYn")
    public String getEvalYn(){
        return evalYn;
    }

    @ElVoField(physicalName = "evalYn")
    public void setEvalYn(String evalYn){
        this.evalYn = evalYn;
    }

    @ElVoField(physicalName = "initiatorBpm")
    public String getInitiatorBpm(){
        return initiatorBpm;
    }

    @ElVoField(physicalName = "initiatorBpm")
    public void setInitiatorBpm(String initiatorBpm){
        this.initiatorBpm = initiatorBpm;
    }

    @ElVoField(physicalName = "accountType")
    public String getAccountType(){
        return accountType;
    }

    @ElVoField(physicalName = "accountType")
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    @ElVoField(physicalName = "bookManagerRoleCode")
    public String getBookManagerRoleCode(){
        return bookManagerRoleCode;
    }

    @ElVoField(physicalName = "bookManagerRoleCode")
    public void setBookManagerRoleCode(String bookManagerRoleCode){
        this.bookManagerRoleCode = bookManagerRoleCode;
    }

    @ElVoField(physicalName = "finManager")
    public String getFinManager(){
        return finManager;
    }

    @ElVoField(physicalName = "finManager")
    public void setFinManager(String finManager){
        this.finManager = finManager;
    }

    @ElVoField(physicalName = "totalManager1")
    public String getTotalManager1(){
        return totalManager1;
    }

    @ElVoField(physicalName = "totalManager1")
    public void setTotalManager1(String totalManager1){
        this.totalManager1 = totalManager1;
    }

    @ElVoField(physicalName = "totalManager2")
    public String getTotalManager2(){
        return totalManager2;
    }

    @ElVoField(physicalName = "totalManager2")
    public void setTotalManager2(String totalManager2){
        this.totalManager2 = totalManager2;
    }

    @ElVoField(physicalName = "safeControllerRoleCode")
    public String getSafeControllerRoleCode(){
        return safeControllerRoleCode;
    }

    @ElVoField(physicalName = "safeControllerRoleCode")
    public void setSafeControllerRoleCode(String safeControllerRoleCode){
        this.safeControllerRoleCode = safeControllerRoleCode;
    }

    @ElVoField(physicalName = "safeManagerRoleCode")
    public String getSafeManagerRoleCode(){
        return safeManagerRoleCode;
    }

    @ElVoField(physicalName = "safeManagerRoleCode")
    public void setSafeManagerRoleCode(String safeManagerRoleCode){
        this.safeManagerRoleCode = safeManagerRoleCode;
    }

    @ElVoField(physicalName = "mergeXsl")
    public boolean isMergeXsl(){
        return mergeXsl;
    }

    @ElVoField(physicalName = "mergeXsl")
    public void setMergeXsl(boolean mergeXsl){
        this.mergeXsl = mergeXsl;
    }

    @ElVoField(physicalName = "reqnum")
    public String getReqnum(){
        return reqnum;
    }

    @ElVoField(physicalName = "reqnum")
    public void setReqnum(String reqnum){
        this.reqnum = reqnum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprVo [");
        sb.append("procDefAlias").append("=").append(procDefAlias).append(",");
        sb.append("endpoint").append("=").append(endpoint).append(",");
        sb.append("instStatus").append("=").append(instStatus).append(",");
        sb.append("titleName").append("=").append(titleName).append(",");
        sb.append("accntNo").append("=").append(accntNo).append(",");
        sb.append("html").append("=").append(html).append(",");
        sb.append("mainKey").append("=").append(mainKey).append(",");
        sb.append("reqNo").append("=").append(reqNo).append(",");
        sb.append("comments").append("=").append(comments).append(",");
        sb.append("reporterId").append("=").append(reporterId).append(",");
        sb.append("uiId").append("=").append(uiId).append(",");
        sb.append("aprState").append("=").append(aprState).append(",");
        sb.append("infoCd").append("=").append(infoCd).append(",");
        sb.append("ext1Cd").append("=").append(ext1Cd).append(",");
        sb.append("ext2Cd").append("=").append(ext2Cd).append(",");
        sb.append("ext3Cd").append("=").append(ext3Cd).append(",");
        sb.append("loginUserId").append("=").append(loginUserId).append(",");
        sb.append("accountCharger").append("=").append(accountCharger).append(",");
        sb.append("budgetController").append("=").append(budgetController).append(",");
        sb.append("region").append("=").append(region).append(",");
        sb.append("audit").append("=").append(audit).append(",");
        sb.append("managerId").append("=").append(managerId).append(",");
        sb.append("biddingType").append("=").append(biddingType).append(",");
        sb.append("biddingTypeMain").append("=").append(biddingTypeMain).append(",");
        sb.append("estimatedPriceType").append("=").append(estimatedPriceType).append(",");
        sb.append("estimatedOnoff").append("=").append(estimatedOnoff).append(",");
        sb.append("dcFcType").append("=").append(dcFcType).append(",");
        sb.append("manualContractYn").append("=").append(manualContractYn).append(",");
        sb.append("pqReviewYn").append("=").append(pqReviewYn).append(",");
        sb.append("contractType").append("=").append(contractType).append(",");
        sb.append("orderType").append("=").append(orderType).append(",");
        sb.append("purRequestor").append("=").append(purRequestor).append(",");
        sb.append("charger").append("=").append(charger).append(",");
        sb.append("amounts").append("=").append(amounts).append(",");
        sb.append("travelers").append("=").append(travelers).append(",");
        sb.append("autoControlYn").append("=").append(autoControlYn).append(",");
        sb.append("unslipNo").append("=").append(unslipNo).append(",");
        sb.append("holiday").append("=").append(holiday).append(",");
        sb.append("ruleType").append("=").append(ruleType).append(",");
        sb.append("ruleMoney").append("=").append(ruleMoney).append(",");
        sb.append("tripGoal").append("=").append(tripGoal).append(",");
        sb.append("oneDay").append("=").append(oneDay).append(",");
        sb.append("chgnYn").append("=").append(chgnYn).append(",");
        sb.append("techNegoYn").append("=").append(techNegoYn).append(",");
        sb.append("bidPresentationYn").append("=").append(bidPresentationYn).append(",");
        sb.append("deptHed1").append("=").append(deptHed1).append(",");
        sb.append("deptHed2").append("=").append(deptHed2).append(",");
        sb.append("headType1").append("=").append(headType1).append(",");
        sb.append("headType2").append("=").append(headType2).append(",");
        sb.append("rcmsRes").append("=").append(rcmsRes).append(",");
        sb.append("rcmsPoint").append("=").append(rcmsPoint).append(",");
        sb.append("enaraYn").append("=").append(enaraYn).append(",");
        sb.append("researchChargerId").append("=").append(researchChargerId).append(",");
        sb.append("researcher").append("=").append(researcher).append(",");
        sb.append("securityCd").append("=").append(securityCd).append(",");
        sb.append("occutyp").append("=").append(occutyp).append(",");
        sb.append("cardKeepperYn").append("=").append(cardKeepperYn).append(",");
        sb.append("bookManager").append("=").append(bookManager).append(",");
        sb.append("expns").append("=").append(expns).append(",");
        sb.append("inspectEvid").append("=").append(inspectEvid).append(",");
        sb.append("inspectYn").append("=").append(inspectYn).append(",");
        sb.append("assetRgManager").append("=").append(assetRgManager).append(",");
        sb.append("noMoney").append("=").append(noMoney).append(",");
        sb.append("patoffice").append("=").append(patoffice).append(",");
        sb.append("operCode").append("=").append(operCode).append(",");
        sb.append("approve").append("=").append(approve).append(",");
        sb.append("check").append("=").append(check).append(",");
        sb.append("abroad").append("=").append(abroad).append(",");
        sb.append("manager").append("=").append(manager).append(",");
        sb.append("biz").append("=").append(biz).append(",");
        sb.append("reqUid").append("=").append(reqUid).append(",");
        sb.append("result").append("=").append(result).append(",");
        sb.append("success").append("=").append(success).append(",");
        sb.append("rejectYN").append("=").append(rejectYN).append(",");
        sb.append("repReason").append("=").append(repReason).append(",");
        sb.append("chkPsnYn").append("=").append(chkPsnYn).append(",");
        sb.append("safeYn").append("=").append(safeYn).append(",");
        sb.append("accountManager").append("=").append(accountManager).append(",");
        sb.append("snap").append("=").append(snap).append(",");
        sb.append("amangerId").append("=").append(amangerId).append(",");
        sb.append("approvalYn").append("=").append(approvalYn).append(",");
        sb.append("befrMentr").append("=").append(befrMentr).append(",");
        sb.append("afterMentr").append("=").append(afterMentr).append(",");
        sb.append("supportPsn").append("=").append(supportPsn).append(",");
        sb.append("reqClsf").append("=").append(reqClsf).append(",");
        sb.append("manager4").append("=").append(manager4).append(",");
        sb.append("slipNo").append("=").append(slipNo).append(",");
        sb.append("yManager").append("=").append(yManager).append(",");
        sb.append("cManager").append("=").append(cManager).append(",");
        sb.append("mManager").append("=").append(mManager).append(",");
        sb.append("tManager").append("=").append(tManager).append(",");
        sb.append("tcManger").append("=").append(tcManger).append(",");
        sb.append("billType").append("=").append(billType).append(",");
        sb.append("decsnamt").append("=").append(decsnamt).append(",");
        sb.append("reportNeedYn").append("=").append(reportNeedYn).append(",");
        sb.append("holidayPsn").append("=").append(holidayPsn).append(",");
        sb.append("nextApprUid").append("=").append(nextApprUid).append(",");
        sb.append("nextApprSyspayNo").append("=").append(nextApprSyspayNo).append(",");
        sb.append("author").append("=").append(author).append(",");
        sb.append("taskExt1").append("=").append(taskExt1).append(",");
        sb.append("taskExt3").append("=").append(taskExt3).append(",");
        sb.append("occuTyp").append("=").append(occuTyp).append(",");
        sb.append("author2").append("=").append(author2).append(",");
        sb.append("researchManager").append("=").append(researchManager).append(",");
        sb.append("mouClsf").append("=").append(mouClsf).append(",");
        sb.append("techPrjClsf").append("=").append(techPrjClsf).append(",");
        sb.append("managerRoleCode").append("=").append(managerRoleCode).append(",");
        sb.append("techManagerSN").append("=").append(techManagerSN).append(",");
        sb.append("purDrafter").append("=").append(purDrafter).append(",");
        sb.append("budgerCharger").append("=").append(budgerCharger).append(",");
        sb.append("rchYn").append("=").append(rchYn).append(",");
        sb.append("bugtCtrlYn").append("=").append(bugtCtrlYn).append(",");
        sb.append("existSnap").append("=").append(existSnap).append(",");
        sb.append("presearcher").append("=").append(presearcher).append(",");
        sb.append("sManager").append("=").append(sManager).append(",");
        sb.append("cancYn").append("=").append(cancYn).append(",");
        sb.append("tryOutPassYn").append("=").append(tryOutPassYn).append(",");
        sb.append("info").append("=").append(info).append(",");
        sb.append("toClose").append("=").append(toClose).append(",");
        sb.append("openYn").append("=").append(openYn).append(",");
        sb.append("outerPrjYn").append("=").append(outerPrjYn).append(",");
        sb.append("researchCharger").append("=").append(researchCharger).append(",");
        sb.append("evalManager").append("=").append(evalManager).append(",");
        sb.append("inspector").append("=").append(inspector).append(",");
        sb.append("techEvalManager").append("=").append(techEvalManager).append(",");
        sb.append("smanagerYn").append("=").append(smanagerYn).append(",");
        sb.append("supmanager1").append("=").append(supmanager1).append(",");
        sb.append("supmanager2").append("=").append(supmanager2).append(",");
        sb.append("assetFlag").append("=").append(assetFlag).append(",");
        sb.append("inspection1").append("=").append(inspection1).append(",");
        sb.append("inspection2").append("=").append(inspection2).append(",");
        sb.append("memberInspec2").append("=").append(memberInspec2).append(",");
        sb.append("inspection").append("=").append(inspection).append(",");
        sb.append("memberInspection").append("=").append(memberInspection).append(",");
        sb.append("appType").append("=").append(appType).append(",");
        sb.append("expnscd").append("=").append(expnscd).append(",");
        sb.append("rcvAccountCharger").append("=").append(rcvAccountCharger).append(",");
        sb.append("budgtCheck").append("=").append(budgtCheck).append(",");
        sb.append("budgtCheckPsn").append("=").append(budgtCheckPsn).append(",");
        sb.append("amt").append("=").append(amt).append(",");
        sb.append("applyYn").append("=").append(applyYn).append(",");
        sb.append("mainResearcher").append("=").append(mainResearcher).append(",");
        sb.append("contractTypeMain").append("=").append(contractTypeMain).append(",");
        sb.append("manager1").append("=").append(manager1).append(",");
        sb.append("manager2").append("=").append(manager2).append(",");
        sb.append("manager3").append("=").append(manager3).append(",");
        sb.append("lcYn").append("=").append(lcYn).append(",");
        sb.append("ttYn").append("=").append(ttYn).append(",");
        sb.append("taxFreeYn").append("=").append(taxFreeYn).append(",");
        sb.append("aftrYn").append("=").append(aftrYn).append(",");
        sb.append("shipInsuYn").append("=").append(shipInsuYn).append(",");
        sb.append("cardYn").append("=").append(cardYn).append(",");
        sb.append("domOverseaClsf").append("=").append(domOverseaClsf).append(",");
        sb.append("patClsf").append("=").append(patClsf).append(",");
        sb.append("regInitiator").append("=").append(regInitiator).append(",");
        sb.append("interviewYn").append("=").append(interviewYn).append(",");
        sb.append("particiPation").append("=").append(particiPation).append(",");
        sb.append("ruleAutoYn").append("=").append(ruleAutoYn).append(",");
        sb.append("labResearcher").append("=").append(labResearcher).append(",");
        sb.append("autoCmpltMan").append("=").append(autoCmpltMan).append(",");
        sb.append("slipGubun").append("=").append(slipGubun).append(",");
        sb.append("holidayClsf").append("=").append(holidayClsf).append(",");
        sb.append("resManager").append("=").append(resManager).append(",");
        sb.append("auditRolesSn").append("=").append(auditRolesSn).append(",");
        sb.append("regAstYn").append("=").append(regAstYn).append(",");
        sb.append("NxtWrkAuto").append("=").append(NxtWrkAuto).append(",");
        sb.append("prjSelYn").append("=").append(prjSelYn).append(",");
        sb.append("evalYn").append("=").append(evalYn).append(",");
        sb.append("initiatorBpm").append("=").append(initiatorBpm).append(",");
        sb.append("accountType").append("=").append(accountType).append(",");
        sb.append("bookManagerRoleCode").append("=").append(bookManagerRoleCode).append(",");
        sb.append("finManager").append("=").append(finManager).append(",");
        sb.append("totalManager1").append("=").append(totalManager1).append(",");
        sb.append("totalManager2").append("=").append(totalManager2).append(",");
        sb.append("safeControllerRoleCode").append("=").append(safeControllerRoleCode).append(",");
        sb.append("safeManagerRoleCode").append("=").append(safeManagerRoleCode).append(",");
        sb.append("mergeXsl").append("=").append(mergeXsl).append(",");
        sb.append("reqnum").append("=").append(reqnum);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
    }


    @Override
    public void _xStreamDec() {
    }


}
