package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "")
public class IntfatabVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public IntfatabVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "reqNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reqNo;

    @ElDtoField(logicalName = "서비스ID", physicalName = "uiId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String uiId;

    @ElDtoField(logicalName = "결재상태", physicalName = "aprState", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String aprState;

    @ElDtoField(logicalName = "사용자ID", physicalName = "endpoints", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String endpoints;

    @ElDtoField(logicalName = "상태플래그", physicalName = "stateInformFlag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String stateInformFlag;

    @ElDtoField(logicalName = "실행플래그", physicalName = "executeFlag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String executeFlag;

    @ElDtoField(logicalName = "최종실행일시", physicalName = "lastExecuteTim", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String lastExecuteTim;

    @ElDtoField(logicalName = "양식명", physicalName = "appname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String appname;

    @ElDtoField(logicalName = "사용자시스템사번", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "사용자명", physicalName = "empname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empname;

    @ElDtoField(logicalName = "신청서제목", physicalName = "infoCd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String infoCd;

    @ElDtoField(logicalName = "접근URL", physicalName = "accessUrl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accessUrl;

    @ElVoField(physicalName = "reqNo")
    public String getReqNo(){
        String ret = this.reqNo;
        return ret;
    }

    @ElVoField(physicalName = "reqNo")
    public void setReqNo(String reqNo){
        this.reqNo = reqNo;
    }

    @ElVoField(physicalName = "uiId")
    public String getUiId(){
        String ret = this.uiId;
        return ret;
    }

    @ElVoField(physicalName = "uiId")
    public void setUiId(String uiId){
        this.uiId = uiId;
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

    @ElVoField(physicalName = "endpoints")
    public String getEndpoints(){
        String ret = this.endpoints;
        return ret;
    }

    @ElVoField(physicalName = "endpoints")
    public void setEndpoints(String endpoints){
        this.endpoints = endpoints;
    }

    @ElVoField(physicalName = "stateInformFlag")
    public String getStateInformFlag(){
        String ret = this.stateInformFlag;
        return ret;
    }

    @ElVoField(physicalName = "stateInformFlag")
    public void setStateInformFlag(String stateInformFlag){
        this.stateInformFlag = stateInformFlag;
    }

    @ElVoField(physicalName = "executeFlag")
    public String getExecuteFlag(){
        String ret = this.executeFlag;
        return ret;
    }

    @ElVoField(physicalName = "executeFlag")
    public void setExecuteFlag(String executeFlag){
        this.executeFlag = executeFlag;
    }

    @ElVoField(physicalName = "lastExecuteTim")
    public String getLastExecuteTim(){
        String ret = this.lastExecuteTim;
        return ret;
    }

    @ElVoField(physicalName = "lastExecuteTim")
    public void setLastExecuteTim(String lastExecuteTim){
        this.lastExecuteTim = lastExecuteTim;
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

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        String ret = this.syspayno;
        return ret;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "empname")
    public String getEmpname(){
        String ret = this.empname;
        return ret;
    }

    @ElVoField(physicalName = "empname")
    public void setEmpname(String empname){
        this.empname = empname;
    }

    @ElVoField(physicalName = "infoCd")
    public String getInfoCd(){
        String ret = this.infoCd;
        return ret;
    }

    @ElVoField(physicalName = "infoCd")
    public void setInfoCd(String infoCd){
        this.infoCd = infoCd;
    }

    @ElVoField(physicalName = "accessUrl")
    public String getAccessUrl(){
        String ret = this.accessUrl;
        return ret;
    }

    @ElVoField(physicalName = "accessUrl")
    public void setAccessUrl(String accessUrl){
        this.accessUrl = accessUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntfatabVo [");
        sb.append("reqNo").append("=").append(reqNo).append(",");
        sb.append("uiId").append("=").append(uiId).append(",");
        sb.append("aprState").append("=").append(aprState).append(",");
        sb.append("endpoints").append("=").append(endpoints).append(",");
        sb.append("stateInformFlag").append("=").append(stateInformFlag).append(",");
        sb.append("executeFlag").append("=").append(executeFlag).append(",");
        sb.append("lastExecuteTim").append("=").append(lastExecuteTim).append(",");
        sb.append("appname").append("=").append(appname).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empname").append("=").append(empname).append(",");
        sb.append("infoCd").append("=").append(infoCd).append(",");
        sb.append("accessUrl").append("=").append(accessUrl);
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
