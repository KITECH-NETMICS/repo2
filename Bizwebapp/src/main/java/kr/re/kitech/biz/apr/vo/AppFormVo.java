package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "신청서양식함")
public class AppFormVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AppFormVo(){
    }

    @ElDtoField(logicalName = "업무구분", physicalName = "div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String div;

    @ElDtoField(logicalName = "aid", physicalName = "aid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aid;

    @ElDtoField(logicalName = "defcat", physicalName = "defcat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String defcat;

    @ElDtoField(logicalName = "mdiv", physicalName = "mdiv", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mdiv;

    @ElDtoField(logicalName = "양식명", physicalName = "appname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appname;

    @ElDtoField(logicalName = "업무명", physicalName = "taskname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String taskname;

    @ElDtoField(logicalName = "화면ID", physicalName = "sclist_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sclist_cd;

    @ElDtoField(logicalName = "scapp_cd", physicalName = "scapp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scapp_cd;

    @ElDtoField(logicalName = "scapp_ch_cd", physicalName = "scapp_ch_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scapp_ch_cd;

    @ElDtoField(logicalName = "문서번호", physicalName = "reqnum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqnum;

    @ElDtoField(logicalName = "사용여부", physicalName = "isvisible", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String isvisible;

    @ElDtoField(logicalName = "비고", physicalName = "description", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String description;

    @ElDtoField(logicalName = "롤코드서브", physicalName = "rolecode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rolecode;

    @ElDtoField(logicalName = "롤코드", physicalName = "managerrole", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String managerrole;

    @ElDtoField(logicalName = "담당자", physicalName = "empnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empnm;

    @ElDtoField(logicalName = "lstUpdate", physicalName = "lstUpdate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lstUpdate;

    @ElDtoField(logicalName = "procDefAlias", physicalName = "procDefAlias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String procDefAlias;

    @ElDtoField(logicalName = "appSeq", physicalName = "appSeq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appSeq;

    @ElDtoField(logicalName = "prodVerid", physicalName = "prodVerid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prodVerid;

    @ElDtoField(logicalName = "defId", physicalName = "defId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String defId;

    @ElDtoField(logicalName = "Ldap 사용자(메뉴)", physicalName = "userVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.UserVo> userVo;

    @ElDtoField(logicalName = "결재 사용자 검색", physicalName = "aprUserVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.AprUserVo> aprUserVo;

    @ElDtoField(logicalName = "전결구분", physicalName = "ruleType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ruleType;

    @ElDtoField(logicalName = "전결금액", physicalName = "ruleMoney", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ruleMoney;

    @ElDtoField(logicalName = "결재선편집여부", physicalName = "apprEditable", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean apprEditable;

    @ElDtoField(logicalName = "양식별위임전결규정URL", physicalName = "regulationUrl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regulationUrl;

    @ElDtoField(logicalName = "회수가능여부", physicalName = "withDrawYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String withDrawYn;

    @ElDtoField(logicalName = "라인타입구분", physicalName = "linetype", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "수신결재여부체크(recieve:수신,master:결재)")
    private String linetype;

    @ElDtoField(logicalName = "전결타입구분", physicalName = "apprvConfigYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvConfigYn;

    @ElDtoField(logicalName = "감사자들사번", physicalName = "auditRolesSn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auditRolesSn;

    @ElDtoField(logicalName = "사전안전성검토유무", physicalName = "safeYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "소액물품 화학물질확인용")
    private String safeYn;

    @ElDtoField(logicalName = "전결라인구분", physicalName = "rule_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rule_yn;

    @ElVoField(physicalName = "div")
    public String getDiv(){
        return div;
    }

    @ElVoField(physicalName = "div")
    public void setDiv(String div){
        this.div = div;
    }

    @ElVoField(physicalName = "aid")
    public String getAid(){
        return aid;
    }

    @ElVoField(physicalName = "aid")
    public void setAid(String aid){
        this.aid = aid;
    }

    @ElVoField(physicalName = "defcat")
    public String getDefcat(){
        return defcat;
    }

    @ElVoField(physicalName = "defcat")
    public void setDefcat(String defcat){
        this.defcat = defcat;
    }

    @ElVoField(physicalName = "mdiv")
    public String getMdiv(){
        return mdiv;
    }

    @ElVoField(physicalName = "mdiv")
    public void setMdiv(String mdiv){
        this.mdiv = mdiv;
    }

    @ElVoField(physicalName = "appname")
    public String getAppname(){
        return appname;
    }

    @ElVoField(physicalName = "appname")
    public void setAppname(String appname){
        this.appname = appname;
    }

    @ElVoField(physicalName = "taskname")
    public String getTaskname(){
        return taskname;
    }

    @ElVoField(physicalName = "taskname")
    public void setTaskname(String taskname){
        this.taskname = taskname;
    }

    @ElVoField(physicalName = "sclist_cd")
    public String getSclist_cd(){
        return sclist_cd;
    }

    @ElVoField(physicalName = "sclist_cd")
    public void setSclist_cd(String sclist_cd){
        this.sclist_cd = sclist_cd;
    }

    @ElVoField(physicalName = "scapp_cd")
    public String getScapp_cd(){
        return scapp_cd;
    }

    @ElVoField(physicalName = "scapp_cd")
    public void setScapp_cd(String scapp_cd){
        this.scapp_cd = scapp_cd;
    }

    @ElVoField(physicalName = "scapp_ch_cd")
    public String getScapp_ch_cd(){
        return scapp_ch_cd;
    }

    @ElVoField(physicalName = "scapp_ch_cd")
    public void setScapp_ch_cd(String scapp_ch_cd){
        this.scapp_ch_cd = scapp_ch_cd;
    }

    @ElVoField(physicalName = "reqnum")
    public String getReqnum(){
        return reqnum;
    }

    @ElVoField(physicalName = "reqnum")
    public void setReqnum(String reqnum){
        this.reqnum = reqnum;
    }

    @ElVoField(physicalName = "isvisible")
    public String getIsvisible(){
        return isvisible;
    }

    @ElVoField(physicalName = "isvisible")
    public void setIsvisible(String isvisible){
        this.isvisible = isvisible;
    }

    @ElVoField(physicalName = "description")
    public String getDescription(){
        return description;
    }

    @ElVoField(physicalName = "description")
    public void setDescription(String description){
        this.description = description;
    }

    @ElVoField(physicalName = "rolecode")
    public String getRolecode(){
        return rolecode;
    }

    @ElVoField(physicalName = "rolecode")
    public void setRolecode(String rolecode){
        this.rolecode = rolecode;
    }

    @ElVoField(physicalName = "managerrole")
    public String getManagerrole(){
        return managerrole;
    }

    @ElVoField(physicalName = "managerrole")
    public void setManagerrole(String managerrole){
        this.managerrole = managerrole;
    }

    @ElVoField(physicalName = "empnm")
    public String getEmpnm(){
        return empnm;
    }

    @ElVoField(physicalName = "empnm")
    public void setEmpnm(String empnm){
        this.empnm = empnm;
    }

    @ElVoField(physicalName = "lstUpdate")
    public String getLstUpdate(){
        return lstUpdate;
    }

    @ElVoField(physicalName = "lstUpdate")
    public void setLstUpdate(String lstUpdate){
        this.lstUpdate = lstUpdate;
    }

    @ElVoField(physicalName = "procDefAlias")
    public String getProcDefAlias(){
        return procDefAlias;
    }

    @ElVoField(physicalName = "procDefAlias")
    public void setProcDefAlias(String procDefAlias){
        this.procDefAlias = procDefAlias;
    }

    @ElVoField(physicalName = "appSeq")
    public String getAppSeq(){
        return appSeq;
    }

    @ElVoField(physicalName = "appSeq")
    public void setAppSeq(String appSeq){
        this.appSeq = appSeq;
    }

    @ElVoField(physicalName = "prodVerid")
    public String getProdVerid(){
        return prodVerid;
    }

    @ElVoField(physicalName = "prodVerid")
    public void setProdVerid(String prodVerid){
        this.prodVerid = prodVerid;
    }

    @ElVoField(physicalName = "defId")
    public String getDefId(){
        return defId;
    }

    @ElVoField(physicalName = "defId")
    public void setDefId(String defId){
        this.defId = defId;
    }

    @ElVoField(physicalName = "userVo")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.UserVo> getUserVo(){
        return userVo;
    }

    @ElVoField(physicalName = "userVo")
    public void setUserVo(java.util.List<kr.re.kitech.biz.xom.core.vo.UserVo> userVo){
        this.userVo = userVo;
    }

    @ElVoField(physicalName = "aprUserVo")
    public java.util.List<kr.re.kitech.biz.apr.vo.AprUserVo> getAprUserVo(){
        return aprUserVo;
    }

    @ElVoField(physicalName = "aprUserVo")
    public void setAprUserVo(java.util.List<kr.re.kitech.biz.apr.vo.AprUserVo> aprUserVo){
        this.aprUserVo = aprUserVo;
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
        return regulationUrl;
    }

    @ElVoField(physicalName = "regulationUrl")
    public void setRegulationUrl(String regulationUrl){
        this.regulationUrl = regulationUrl;
    }

    @ElVoField(physicalName = "withDrawYn")
    public String getWithDrawYn(){
        return withDrawYn;
    }

    @ElVoField(physicalName = "withDrawYn")
    public void setWithDrawYn(String withDrawYn){
        this.withDrawYn = withDrawYn;
    }

    @ElVoField(physicalName = "linetype")
    public String getLinetype(){
        return linetype;
    }

    @ElVoField(physicalName = "linetype")
    public void setLinetype(String linetype){
        this.linetype = linetype;
    }

    @ElVoField(physicalName = "apprvConfigYn")
    public String getApprvConfigYn(){
        return apprvConfigYn;
    }

    @ElVoField(physicalName = "apprvConfigYn")
    public void setApprvConfigYn(String apprvConfigYn){
        this.apprvConfigYn = apprvConfigYn;
    }

    @ElVoField(physicalName = "auditRolesSn")
    public String getAuditRolesSn(){
        return auditRolesSn;
    }

    @ElVoField(physicalName = "auditRolesSn")
    public void setAuditRolesSn(String auditRolesSn){
        this.auditRolesSn = auditRolesSn;
    }

    @ElVoField(physicalName = "safeYn")
    public String getSafeYn(){
        return safeYn;
    }

    @ElVoField(physicalName = "safeYn")
    public void setSafeYn(String safeYn){
        this.safeYn = safeYn;
    }

    @ElVoField(physicalName = "rule_yn")
    public String getRule_yn(){
        return rule_yn;
    }

    @ElVoField(physicalName = "rule_yn")
    public void setRule_yn(String rule_yn){
        this.rule_yn = rule_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppFormVo [");
        sb.append("div").append("=").append(div).append(",");
        sb.append("aid").append("=").append(aid).append(",");
        sb.append("defcat").append("=").append(defcat).append(",");
        sb.append("mdiv").append("=").append(mdiv).append(",");
        sb.append("appname").append("=").append(appname).append(",");
        sb.append("taskname").append("=").append(taskname).append(",");
        sb.append("sclist_cd").append("=").append(sclist_cd).append(",");
        sb.append("scapp_cd").append("=").append(scapp_cd).append(",");
        sb.append("scapp_ch_cd").append("=").append(scapp_ch_cd).append(",");
        sb.append("reqnum").append("=").append(reqnum).append(",");
        sb.append("isvisible").append("=").append(isvisible).append(",");
        sb.append("description").append("=").append(description).append(",");
        sb.append("rolecode").append("=").append(rolecode).append(",");
        sb.append("managerrole").append("=").append(managerrole).append(",");
        sb.append("empnm").append("=").append(empnm).append(",");
        sb.append("lstUpdate").append("=").append(lstUpdate).append(",");
        sb.append("procDefAlias").append("=").append(procDefAlias).append(",");
        sb.append("appSeq").append("=").append(appSeq).append(",");
        sb.append("prodVerid").append("=").append(prodVerid).append(",");
        sb.append("defId").append("=").append(defId).append(",");
        sb.append("userVo").append("=").append(userVo).append(",");
        sb.append("aprUserVo").append("=").append(aprUserVo).append(",");
        sb.append("ruleType").append("=").append(ruleType).append(",");
        sb.append("ruleMoney").append("=").append(ruleMoney).append(",");
        sb.append("apprEditable").append("=").append(apprEditable).append(",");
        sb.append("regulationUrl").append("=").append(regulationUrl).append(",");
        sb.append("withDrawYn").append("=").append(withDrawYn).append(",");
        sb.append("linetype").append("=").append(linetype).append(",");
        sb.append("apprvConfigYn").append("=").append(apprvConfigYn).append(",");
        sb.append("auditRolesSn").append("=").append(auditRolesSn).append(",");
        sb.append("safeYn").append("=").append(safeYn).append(",");
        sb.append("rule_yn").append("=").append(rule_yn);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; userVo != null && i < userVo.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.UserVo vo = (kr.re.kitech.biz.xom.core.vo.UserVo)userVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; aprUserVo != null && i < aprUserVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprUserVo vo = (kr.re.kitech.biz.apr.vo.AprUserVo)aprUserVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; userVo != null && i < userVo.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.UserVo vo = (kr.re.kitech.biz.xom.core.vo.UserVo)userVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; aprUserVo != null && i < aprUserVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprUserVo vo = (kr.re.kitech.biz.apr.vo.AprUserVo)aprUserVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
