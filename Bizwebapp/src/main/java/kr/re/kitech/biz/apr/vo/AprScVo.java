package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "BPM API조회 전용")
public class AprScVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprScVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "reqNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reqNo;

    @ElDtoField(logicalName = "메인키", physicalName = "mainKey", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String mainKey;

    @ElDtoField(logicalName = "양식구분", physicalName = "procDefAlias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String procDefAlias;

    @ElDtoField(logicalName = "양식명", physicalName = "appname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String appname;

    @ElDtoField(logicalName = "검색시작일", physicalName = "startDt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String startDt;

    @ElDtoField(logicalName = "검색종료일", physicalName = "closeDt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String closeDt;

    @ElDtoField(logicalName = "업무담당자", physicalName = "endpoint", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String endpoint;

    @ElDtoField(logicalName = "결재상태", physicalName = "aprState", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String aprState;

    @ElDtoField(logicalName = "태스크상태", physicalName = "taskStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String taskStatus;

    @ElDtoField(logicalName = "태스크명", physicalName = "taskName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String taskName;

    @ElDtoField(logicalName = "인스턴스상태", physicalName = "instStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String instStatus;

    @ElDtoField(logicalName = "전문구분", physicalName = "procClsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String procClsf;

    @ElDtoField(logicalName = "업무구분", physicalName = "tool", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String tool;

    @ElDtoField(logicalName = "진행함구분", physicalName = "status", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String status;

    @ElDtoField(logicalName = "스냅샷", physicalName = "html", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String html;

    @ElDtoField(logicalName = "BPM 결재신청상태", physicalName = "aprStatusVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.AprStatusVo> aprStatusVo;

    @ElDtoField(logicalName = "결재 사용자 검색", physicalName = "aprUserVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.AprUserVo> aprUserVo;

    @ElDtoField(logicalName = "행위(결재/반려)자", physicalName = "actorName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String actorName;

    @ElDtoField(logicalName = "반려여부", physicalName = "rejectYN", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rejectYN;

    @ElDtoField(logicalName = "전결타입", physicalName = "ruleType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String ruleType;

    @ElDtoField(logicalName = "전결금액", physicalName = "ruleMoney", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String ruleMoney;

    @ElDtoField(logicalName = "결재의견", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String comments;

    @ElDtoField(logicalName = "결재선편집여부", physicalName = "apprEditable", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private boolean apprEditable;

    @ElDtoField(logicalName = "양식별위임전결규정URL", physicalName = "regulationUrl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String regulationUrl;

    @ElDtoField(logicalName = "제목", physicalName = "InfoCd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String InfoCd;

    @ElDtoField(logicalName = "계정번호", physicalName = "ext1Cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String ext1Cd;

    @ElDtoField(logicalName = "결의확정번호", physicalName = "slipNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String slipNo;

    @ElDtoField(logicalName = "서비스ID", physicalName = "taskExt1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String taskExt1;

    @ElDtoField(logicalName = "퇴직신청확인코드", physicalName = "taskExt3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "퇴직신청사용", attr = "")
    private String taskExt3;

    @ElDtoField(logicalName = "양식구분", physicalName = "searchClsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "BPM 검색", attr = "")
    private String searchClsf;

    @ElDtoField(logicalName = "검색데이터", physicalName = "searchData", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "BPM 검색", attr = "")
    private String searchData;

    @ElDtoField(logicalName = "시작일자", physicalName = "instStartYmd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "BPM 검색", attr = "")
    private String instStartYmd;

    @ElDtoField(logicalName = "종료일자", physicalName = "instEndYmd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "BPM 검색", attr = "")
    private String instEndYmd;

    @ElDtoField(logicalName = "결재시작자명", physicalName = "initiatorNm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String initiatorNm;

    @ElDtoField(logicalName = "인스턴스ID", physicalName = "instId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String instId;

    @ElDtoField(logicalName = "타스크ID", physicalName = "taskId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String taskId;

    @ElDtoField(logicalName = "태그번호", physicalName = "trctag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String trctag;

    @ElDtoField(logicalName = "대결설정자ID", physicalName = "prevEndpoint", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "대결을 설정한ID", attr = "")
    private String prevEndpoint;

    @ElDtoField(logicalName = "회수가능여부", physicalName = "withDrawYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String withDrawYn;

    @ElDtoField(logicalName = "물품공사용역구분", physicalName = "orderType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String orderType;

    @ElDtoField(logicalName = "라인타입구분", physicalName = "linetype", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "수신결재여부체크(recieve:수신,master:결재)", attr = "")
    private String linetype;

    @ElDtoField(logicalName = "전자결재신규데이터여부", physicalName = "asistype", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String asistype;

    @ElDtoField(logicalName = "인스턴스Alias", physicalName = "instAlias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String instAlias;

    @ElDtoField(logicalName = "전결타입구분", physicalName = "apprvConfigYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apprvConfigYn;

    @ElDtoField(logicalName = "기안자사번", physicalName = "inItEmpcode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String inItEmpcode;

    @ElDtoField(logicalName = "감사자들사번", physicalName = "auditRolesSn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String auditRolesSn;

    @ElDtoField(logicalName = "리스트정렬순서", physicalName = "orderBy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String orderBy;

    @ElDtoField(logicalName = "사전안전성검토유무", physicalName = "safeYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String safeYn;

    @ElDtoField(logicalName = "전체검색", physicalName = "totalSearch", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "BPM 전체검색", attr = "")
    private String totalSearch;

    @ElDtoField(logicalName = "예산통제예외여부", physicalName = "budgetControl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String budgetControl;

    @ElDtoField(logicalName = "계정상태", physicalName = "accnt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_state;

    @ElDtoField(logicalName = "시작연도", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String start_ymd;

    @ElDtoField(logicalName = "사원번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "집행가능카운트", physicalName = "cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cnt;

    @ElDtoField(logicalName = "머지XSL여부", physicalName = "mergeXsl", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private boolean mergeXsl;

    @ElVoField(physicalName = "reqNo")
    public String getReqNo(){
        String ret = this.reqNo;
        return ret;
    }

    @ElVoField(physicalName = "reqNo")
    public void setReqNo(String reqNo){
        this.reqNo = reqNo;
    }

    @ElVoField(physicalName = "mainKey")
    public String getMainKey(){
        String ret = this.mainKey;
        return ret;
    }

    @ElVoField(physicalName = "mainKey")
    public void setMainKey(String mainKey){
        this.mainKey = mainKey;
    }

    @ElVoField(physicalName = "procDefAlias")
    public String getProcDefAlias(){
        String ret = this.procDefAlias;
        return ret;
    }

    @ElVoField(physicalName = "procDefAlias")
    public void setProcDefAlias(String procDefAlias){
        this.procDefAlias = procDefAlias;
    }

    @ElVoField(physicalName = "appname")
    public String getAppname(){
        String ret = this.appname;
        return ret;
    }

    @ElVoField(physicalName = "appname")
    public void setAppname(String appname){
        this.appname = appname;
    }

    @ElVoField(physicalName = "startDt")
    public String getStartDt(){
        String ret = this.startDt;
        return ret;
    }

    @ElVoField(physicalName = "startDt")
    public void setStartDt(String startDt){
        this.startDt = startDt;
    }

    @ElVoField(physicalName = "closeDt")
    public String getCloseDt(){
        String ret = this.closeDt;
        return ret;
    }

    @ElVoField(physicalName = "closeDt")
    public void setCloseDt(String closeDt){
        this.closeDt = closeDt;
    }

    @ElVoField(physicalName = "endpoint")
    public String getEndpoint(){
        String ret = this.endpoint;
        return ret;
    }

    @ElVoField(physicalName = "endpoint")
    public void setEndpoint(String endpoint){
        this.endpoint = endpoint;
    }

    @ElVoField(physicalName = "aprState")
    public String getAprState(){
        String ret = this.aprState;
        return ret;
    }

    @ElVoField(physicalName = "aprState")
    public void setAprState(String aprState){
        this.aprState = aprState;
    }

    @ElVoField(physicalName = "taskStatus")
    public String getTaskStatus(){
        String ret = this.taskStatus;
        return ret;
    }

    @ElVoField(physicalName = "taskStatus")
    public void setTaskStatus(String taskStatus){
        this.taskStatus = taskStatus;
    }

    @ElVoField(physicalName = "taskName")
    public String getTaskName(){
        String ret = this.taskName;
        return ret;
    }

    @ElVoField(physicalName = "taskName")
    public void setTaskName(String taskName){
        this.taskName = taskName;
    }

    @ElVoField(physicalName = "instStatus")
    public String getInstStatus(){
        String ret = this.instStatus;
        return ret;
    }

    @ElVoField(physicalName = "instStatus")
    public void setInstStatus(String instStatus){
        this.instStatus = instStatus;
    }

    @ElVoField(physicalName = "procClsf")
    public String getProcClsf(){
        String ret = this.procClsf;
        return ret;
    }

    @ElVoField(physicalName = "procClsf")
    public void setProcClsf(String procClsf){
        this.procClsf = procClsf;
    }

    @ElVoField(physicalName = "tool")
    public String getTool(){
        String ret = this.tool;
        return ret;
    }

    @ElVoField(physicalName = "tool")
    public void setTool(String tool){
        this.tool = tool;
    }

    @ElVoField(physicalName = "status")
    public String getStatus(){
        String ret = this.status;
        return ret;
    }

    @ElVoField(physicalName = "status")
    public void setStatus(String status){
        this.status = status;
    }

    @ElVoField(physicalName = "html")
    public String getHtml(){
        String ret = this.html;
        return ret;
    }

    @ElVoField(physicalName = "html")
    public void setHtml(String html){
        this.html = html;
    }

    @ElVoField(physicalName = "aprStatusVo")
    public java.util.List<kr.re.kitech.biz.apr.vo.AprStatusVo> getAprStatusVo(){
        return aprStatusVo;
    }

    @ElVoField(physicalName = "aprStatusVo")
    public void setAprStatusVo(java.util.List<kr.re.kitech.biz.apr.vo.AprStatusVo> aprStatusVo){
        this.aprStatusVo = aprStatusVo;
    }

    @ElVoField(physicalName = "aprUserVo")
    public java.util.List<kr.re.kitech.biz.apr.vo.AprUserVo> getAprUserVo(){
        return aprUserVo;
    }

    @ElVoField(physicalName = "aprUserVo")
    public void setAprUserVo(java.util.List<kr.re.kitech.biz.apr.vo.AprUserVo> aprUserVo){
        this.aprUserVo = aprUserVo;
    }

    @ElVoField(physicalName = "actorName")
    public String getActorName(){
        String ret = this.actorName;
        return ret;
    }

    @ElVoField(physicalName = "actorName")
    public void setActorName(String actorName){
        this.actorName = actorName;
    }

    @ElVoField(physicalName = "rejectYN")
    public String getRejectYN(){
        String ret = this.rejectYN;
        return ret;
    }

    @ElVoField(physicalName = "rejectYN")
    public void setRejectYN(String rejectYN){
        this.rejectYN = rejectYN;
    }

    @ElVoField(physicalName = "ruleType")
    public String getRuleType(){
        String ret = this.ruleType;
        return ret;
    }

    @ElVoField(physicalName = "ruleType")
    public void setRuleType(String ruleType){
        this.ruleType = ruleType;
    }

    @ElVoField(physicalName = "ruleMoney")
    public String getRuleMoney(){
        String ret = this.ruleMoney;
        return ret;
    }

    @ElVoField(physicalName = "ruleMoney")
    public void setRuleMoney(String ruleMoney){
        this.ruleMoney = ruleMoney;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        String ret = this.comments;
        return ret;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @ElVoField(physicalName = "apprEditable")
    public boolean isApprEditable(){
        return apprEditable;
    }

    @ElVoField(physicalName = "apprEditable")
    public void setApprEditable(boolean apprEditable){
        this.apprEditable = apprEditable;
    }

    @ElVoField(physicalName = "regulationUrl")
    public String getRegulationUrl(){
        String ret = this.regulationUrl;
        return ret;
    }

    @ElVoField(physicalName = "regulationUrl")
    public void setRegulationUrl(String regulationUrl){
        this.regulationUrl = regulationUrl;
    }

    @ElVoField(physicalName = "InfoCd")
    public String getInfoCd(){
        String ret = this.InfoCd;
        return ret;
    }

    @ElVoField(physicalName = "InfoCd")
    public void setInfoCd(String InfoCd){
        this.InfoCd = InfoCd;
    }

    @ElVoField(physicalName = "ext1Cd")
    public String getExt1Cd(){
        String ret = this.ext1Cd;
        return ret;
    }

    @ElVoField(physicalName = "ext1Cd")
    public void setExt1Cd(String ext1Cd){
        this.ext1Cd = ext1Cd;
    }

    @ElVoField(physicalName = "slipNo")
    public String getSlipNo(){
        String ret = this.slipNo;
        return ret;
    }

    @ElVoField(physicalName = "slipNo")
    public void setSlipNo(String slipNo){
        this.slipNo = slipNo;
    }

    @ElVoField(physicalName = "taskExt1")
    public String getTaskExt1(){
        String ret = this.taskExt1;
        return ret;
    }

    @ElVoField(physicalName = "taskExt1")
    public void setTaskExt1(String taskExt1){
        this.taskExt1 = taskExt1;
    }

    @ElVoField(physicalName = "taskExt3")
    public String getTaskExt3(){
        String ret = this.taskExt3;
        return ret;
    }

    @ElVoField(physicalName = "taskExt3")
    public void setTaskExt3(String taskExt3){
        this.taskExt3 = taskExt3;
    }

    @ElVoField(physicalName = "searchClsf")
    public String getSearchClsf(){
        String ret = this.searchClsf;
        return ret;
    }

    @ElVoField(physicalName = "searchClsf")
    public void setSearchClsf(String searchClsf){
        this.searchClsf = searchClsf;
    }

    @ElVoField(physicalName = "searchData")
    public String getSearchData(){
        String ret = this.searchData;
        return ret;
    }

    @ElVoField(physicalName = "searchData")
    public void setSearchData(String searchData){
        this.searchData = searchData;
    }

    @ElVoField(physicalName = "instStartYmd")
    public String getInstStartYmd(){
        String ret = this.instStartYmd;
        return ret;
    }

    @ElVoField(physicalName = "instStartYmd")
    public void setInstStartYmd(String instStartYmd){
        this.instStartYmd = instStartYmd;
    }

    @ElVoField(physicalName = "instEndYmd")
    public String getInstEndYmd(){
        String ret = this.instEndYmd;
        return ret;
    }

    @ElVoField(physicalName = "instEndYmd")
    public void setInstEndYmd(String instEndYmd){
        this.instEndYmd = instEndYmd;
    }

    @ElVoField(physicalName = "initiatorNm")
    public String getInitiatorNm(){
        String ret = this.initiatorNm;
        return ret;
    }

    @ElVoField(physicalName = "initiatorNm")
    public void setInitiatorNm(String initiatorNm){
        this.initiatorNm = initiatorNm;
    }

    @ElVoField(physicalName = "instId")
    public String getInstId(){
        String ret = this.instId;
        return ret;
    }

    @ElVoField(physicalName = "instId")
    public void setInstId(String instId){
        this.instId = instId;
    }

    @ElVoField(physicalName = "taskId")
    public String getTaskId(){
        String ret = this.taskId;
        return ret;
    }

    @ElVoField(physicalName = "taskId")
    public void setTaskId(String taskId){
        this.taskId = taskId;
    }

    @ElVoField(physicalName = "trctag")
    public String getTrctag(){
        String ret = this.trctag;
        return ret;
    }

    @ElVoField(physicalName = "trctag")
    public void setTrctag(String trctag){
        this.trctag = trctag;
    }

    @ElVoField(physicalName = "prevEndpoint")
    public String getPrevEndpoint(){
        String ret = this.prevEndpoint;
        return ret;
    }

    @ElVoField(physicalName = "prevEndpoint")
    public void setPrevEndpoint(String prevEndpoint){
        this.prevEndpoint = prevEndpoint;
    }

    @ElVoField(physicalName = "withDrawYn")
    public String getWithDrawYn(){
        String ret = this.withDrawYn;
        return ret;
    }

    @ElVoField(physicalName = "withDrawYn")
    public void setWithDrawYn(String withDrawYn){
        this.withDrawYn = withDrawYn;
    }

    @ElVoField(physicalName = "orderType")
    public String getOrderType(){
        String ret = this.orderType;
        return ret;
    }

    @ElVoField(physicalName = "orderType")
    public void setOrderType(String orderType){
        this.orderType = orderType;
    }

    @ElVoField(physicalName = "linetype")
    public String getLinetype(){
        String ret = this.linetype;
        return ret;
    }

    @ElVoField(physicalName = "linetype")
    public void setLinetype(String linetype){
        this.linetype = linetype;
    }

    @ElVoField(physicalName = "asistype")
    public String getAsistype(){
        String ret = this.asistype;
        return ret;
    }

    @ElVoField(physicalName = "asistype")
    public void setAsistype(String asistype){
        this.asistype = asistype;
    }

    @ElVoField(physicalName = "instAlias")
    public String getInstAlias(){
        String ret = this.instAlias;
        return ret;
    }

    @ElVoField(physicalName = "instAlias")
    public void setInstAlias(String instAlias){
        this.instAlias = instAlias;
    }

    @ElVoField(physicalName = "apprvConfigYn")
    public String getApprvConfigYn(){
        String ret = this.apprvConfigYn;
        return ret;
    }

    @ElVoField(physicalName = "apprvConfigYn")
    public void setApprvConfigYn(String apprvConfigYn){
        this.apprvConfigYn = apprvConfigYn;
    }

    @ElVoField(physicalName = "inItEmpcode")
    public String getInItEmpcode(){
        String ret = this.inItEmpcode;
        return ret;
    }

    @ElVoField(physicalName = "inItEmpcode")
    public void setInItEmpcode(String inItEmpcode){
        this.inItEmpcode = inItEmpcode;
    }

    @ElVoField(physicalName = "auditRolesSn")
    public String getAuditRolesSn(){
        String ret = this.auditRolesSn;
        return ret;
    }

    @ElVoField(physicalName = "auditRolesSn")
    public void setAuditRolesSn(String auditRolesSn){
        this.auditRolesSn = auditRolesSn;
    }

    @ElVoField(physicalName = "orderBy")
    public String getOrderBy(){
        String ret = this.orderBy;
        return ret;
    }

    @ElVoField(physicalName = "orderBy")
    public void setOrderBy(String orderBy){
        this.orderBy = orderBy;
    }

    @ElVoField(physicalName = "safeYn")
    public String getSafeYn(){
        String ret = this.safeYn;
        return ret;
    }

    @ElVoField(physicalName = "safeYn")
    public void setSafeYn(String safeYn){
        this.safeYn = safeYn;
    }

    @ElVoField(physicalName = "totalSearch")
    public String getTotalSearch(){
        String ret = this.totalSearch;
        return ret;
    }

    @ElVoField(physicalName = "totalSearch")
    public void setTotalSearch(String totalSearch){
        this.totalSearch = totalSearch;
    }

    @ElVoField(physicalName = "budgetControl")
    public String getBudgetControl(){
        String ret = this.budgetControl;
        return ret;
    }

    @ElVoField(physicalName = "budgetControl")
    public void setBudgetControl(String budgetControl){
        this.budgetControl = budgetControl;
    }

    @ElVoField(physicalName = "accnt_state")
    public String getAccnt_state(){
        String ret = this.accnt_state;
        return ret;
    }

    @ElVoField(physicalName = "accnt_state")
    public void setAccnt_state(String accnt_state){
        this.accnt_state = accnt_state;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        String ret = this.start_ymd;
        return ret;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        String ret = this.syspayno;
        return ret;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "cnt")
    public String getCnt(){
        String ret = this.cnt;
        return ret;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(String cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "mergeXsl")
    public boolean isMergeXsl(){
        return mergeXsl;
    }

    @ElVoField(physicalName = "mergeXsl")
    public void setMergeXsl(boolean mergeXsl){
        this.mergeXsl = mergeXsl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprScVo [");
        sb.append("reqNo").append("=").append(reqNo).append(",");
        sb.append("mainKey").append("=").append(mainKey).append(",");
        sb.append("procDefAlias").append("=").append(procDefAlias).append(",");
        sb.append("appname").append("=").append(appname).append(",");
        sb.append("startDt").append("=").append(startDt).append(",");
        sb.append("closeDt").append("=").append(closeDt).append(",");
        sb.append("endpoint").append("=").append(endpoint).append(",");
        sb.append("aprState").append("=").append(aprState).append(",");
        sb.append("taskStatus").append("=").append(taskStatus).append(",");
        sb.append("taskName").append("=").append(taskName).append(",");
        sb.append("instStatus").append("=").append(instStatus).append(",");
        sb.append("procClsf").append("=").append(procClsf).append(",");
        sb.append("tool").append("=").append(tool).append(",");
        sb.append("status").append("=").append(status).append(",");
        sb.append("html").append("=").append(html).append(",");
        sb.append("aprStatusVo").append("=").append(aprStatusVo).append(",");
        sb.append("aprUserVo").append("=").append(aprUserVo).append(",");
        sb.append("actorName").append("=").append(actorName).append(",");
        sb.append("rejectYN").append("=").append(rejectYN).append(",");
        sb.append("ruleType").append("=").append(ruleType).append(",");
        sb.append("ruleMoney").append("=").append(ruleMoney).append(",");
        sb.append("comments").append("=").append(comments).append(",");
        sb.append("apprEditable").append("=").append(apprEditable).append(",");
        sb.append("regulationUrl").append("=").append(regulationUrl).append(",");
        sb.append("InfoCd").append("=").append(InfoCd).append(",");
        sb.append("ext1Cd").append("=").append(ext1Cd).append(",");
        sb.append("slipNo").append("=").append(slipNo).append(",");
        sb.append("taskExt1").append("=").append(taskExt1).append(",");
        sb.append("taskExt3").append("=").append(taskExt3).append(",");
        sb.append("searchClsf").append("=").append(searchClsf).append(",");
        sb.append("searchData").append("=").append(searchData).append(",");
        sb.append("instStartYmd").append("=").append(instStartYmd).append(",");
        sb.append("instEndYmd").append("=").append(instEndYmd).append(",");
        sb.append("initiatorNm").append("=").append(initiatorNm).append(",");
        sb.append("instId").append("=").append(instId).append(",");
        sb.append("taskId").append("=").append(taskId).append(",");
        sb.append("trctag").append("=").append(trctag).append(",");
        sb.append("prevEndpoint").append("=").append(prevEndpoint).append(",");
        sb.append("withDrawYn").append("=").append(withDrawYn).append(",");
        sb.append("orderType").append("=").append(orderType).append(",");
        sb.append("linetype").append("=").append(linetype).append(",");
        sb.append("asistype").append("=").append(asistype).append(",");
        sb.append("instAlias").append("=").append(instAlias).append(",");
        sb.append("apprvConfigYn").append("=").append(apprvConfigYn).append(",");
        sb.append("inItEmpcode").append("=").append(inItEmpcode).append(",");
        sb.append("auditRolesSn").append("=").append(auditRolesSn).append(",");
        sb.append("orderBy").append("=").append(orderBy).append(",");
        sb.append("safeYn").append("=").append(safeYn).append(",");
        sb.append("totalSearch").append("=").append(totalSearch).append(",");
        sb.append("budgetControl").append("=").append(budgetControl).append(",");
        sb.append("accnt_state").append("=").append(accnt_state).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("mergeXsl").append("=").append(mergeXsl);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; aprStatusVo != null && i < aprStatusVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprStatusVo vo = (kr.re.kitech.biz.apr.vo.AprStatusVo)aprStatusVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; aprUserVo != null && i < aprUserVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprUserVo vo = (kr.re.kitech.biz.apr.vo.AprUserVo)aprUserVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; aprStatusVo != null && i < aprStatusVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprStatusVo vo = (kr.re.kitech.biz.apr.vo.AprStatusVo)aprStatusVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; aprUserVo != null && i < aprUserVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprUserVo vo = (kr.re.kitech.biz.apr.vo.AprUserVo)aprUserVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
