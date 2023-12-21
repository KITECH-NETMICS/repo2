package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "BPM 대응 요청/응답 객체")
public class ApiBpmVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiBpmVo(){
    }

    @ElDtoField(logicalName = "업무명", physicalName = "roleType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String roleType;

    @ElDtoField(logicalName = "시스템사번", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "사번", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empno;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String nm;

    @ElDtoField(logicalName = "직군코드", physicalName = "occutypCd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String occutypCd;

    @ElDtoField(logicalName = "부서코드", physicalName = "deptCd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String deptCd;

    @ElDtoField(logicalName = "신청번호", physicalName = "reqNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reqNo;

    @ElDtoField(logicalName = "결재상태", physicalName = "aprState", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String aprState;

    @ElDtoField(logicalName = "양식ID", physicalName = "formAlias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String formAlias;

    @ElDtoField(logicalName = "성공여부", physicalName = "success", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private boolean success;

    @ElDtoField(logicalName = "메시지", physicalName = "message", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String message;

    @ElDtoField(logicalName = "결과", physicalName = "result", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String result;

    @ElDtoField(logicalName = "다음프로세스", physicalName = "nextWork", type = "Map", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.Map nextWork;

    @ElDtoField(logicalName = "인스턴스ID", physicalName = "instanceId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String instanceId;

    @ElDtoField(logicalName = "테스크ID", physicalName = "taskId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String taskId;

    @ElDtoField(logicalName = "테스크Tag", physicalName = "trcTag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String trcTag;

    @ElDtoField(logicalName = "사용자ID", physicalName = "endPoint", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String endPoint;

    @ElDtoField(logicalName = "사용자명", physicalName = "endPointNm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String endPointNm;

    @ElDtoField(logicalName = "호출위치", physicalName = "manager", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private boolean manager;

    @ElDtoField(logicalName = "이전결재상태", physicalName = "prevAprState", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prevAprState;

    @ElDtoField(logicalName = "반려의견", physicalName = "rejectComment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rejectComment;

    @ElVoField(physicalName = "roleType")
    public String getRoleType(){
        String ret = this.roleType;
        return ret;
    }

    @ElVoField(physicalName = "roleType")
    public void setRoleType(String roleType){
        this.roleType = roleType;
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

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        String ret = this.empno;
        return ret;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        String ret = this.nm;
        return ret;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "occutypCd")
    public String getOccutypCd(){
        String ret = this.occutypCd;
        return ret;
    }

    @ElVoField(physicalName = "occutypCd")
    public void setOccutypCd(String occutypCd){
        this.occutypCd = occutypCd;
    }

    @ElVoField(physicalName = "deptCd")
    public String getDeptCd(){
        String ret = this.deptCd;
        return ret;
    }

    @ElVoField(physicalName = "deptCd")
    public void setDeptCd(String deptCd){
        this.deptCd = deptCd;
    }

    @ElVoField(physicalName = "reqNo")
    public String getReqNo(){
        String ret = this.reqNo;
        return ret;
    }

    @ElVoField(physicalName = "reqNo")
    public void setReqNo(String reqNo){
        this.reqNo = reqNo;
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

    @ElVoField(physicalName = "formAlias")
    public String getFormAlias(){
        String ret = this.formAlias;
        return ret;
    }

    @ElVoField(physicalName = "formAlias")
    public void setFormAlias(String formAlias){
        this.formAlias = formAlias;
    }

    @ElVoField(physicalName = "success")
    public boolean isSuccess(){
        return success;
    }

    @ElVoField(physicalName = "success")
    public void setSuccess(boolean success){
        this.success = success;
    }

    @ElVoField(physicalName = "message")
    public String getMessage(){
        String ret = this.message;
        return ret;
    }

    @ElVoField(physicalName = "message")
    public void setMessage(String message){
        this.message = message;
    }

    @ElVoField(physicalName = "result")
    public String getResult(){
        String ret = this.result;
        return ret;
    }

    @ElVoField(physicalName = "result")
    public void setResult(String result){
        this.result = result;
    }

    @ElVoField(physicalName = "nextWork")
    public java.util.Map getNextWork(){
        return nextWork;
    }

    @ElVoField(physicalName = "nextWork")
    public void setNextWork(java.util.Map nextWork){
        this.nextWork = nextWork;
    }

    @ElVoField(physicalName = "instanceId")
    public String getInstanceId(){
        String ret = this.instanceId;
        return ret;
    }

    @ElVoField(physicalName = "instanceId")
    public void setInstanceId(String instanceId){
        this.instanceId = instanceId;
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

    @ElVoField(physicalName = "trcTag")
    public String getTrcTag(){
        String ret = this.trcTag;
        return ret;
    }

    @ElVoField(physicalName = "trcTag")
    public void setTrcTag(String trcTag){
        this.trcTag = trcTag;
    }

    @ElVoField(physicalName = "endPoint")
    public String getEndPoint(){
        String ret = this.endPoint;
        return ret;
    }

    @ElVoField(physicalName = "endPoint")
    public void setEndPoint(String endPoint){
        this.endPoint = endPoint;
    }

    @ElVoField(physicalName = "endPointNm")
    public String getEndPointNm(){
        String ret = this.endPointNm;
        return ret;
    }

    @ElVoField(physicalName = "endPointNm")
    public void setEndPointNm(String endPointNm){
        this.endPointNm = endPointNm;
    }

    @ElVoField(physicalName = "manager")
    public boolean isManager(){
        return manager;
    }

    @ElVoField(physicalName = "manager")
    public void setManager(boolean manager){
        this.manager = manager;
    }

    @ElVoField(physicalName = "prevAprState")
    public String getPrevAprState(){
        String ret = this.prevAprState;
        return ret;
    }

    @ElVoField(physicalName = "prevAprState")
    public void setPrevAprState(String prevAprState){
        this.prevAprState = prevAprState;
    }

    @ElVoField(physicalName = "rejectComment")
    public String getRejectComment(){
        String ret = this.rejectComment;
        return ret;
    }

    @ElVoField(physicalName = "rejectComment")
    public void setRejectComment(String rejectComment){
        this.rejectComment = rejectComment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiBpmVo [");
        sb.append("roleType").append("=").append(roleType).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("occutypCd").append("=").append(occutypCd).append(",");
        sb.append("deptCd").append("=").append(deptCd).append(",");
        sb.append("reqNo").append("=").append(reqNo).append(",");
        sb.append("aprState").append("=").append(aprState).append(",");
        sb.append("formAlias").append("=").append(formAlias).append(",");
        sb.append("success").append("=").append(success).append(",");
        sb.append("message").append("=").append(message).append(",");
        sb.append("result").append("=").append(result).append(",");
        sb.append("nextWork").append("=").append(nextWork).append(",");
        sb.append("instanceId").append("=").append(instanceId).append(",");
        sb.append("taskId").append("=").append(taskId).append(",");
        sb.append("trcTag").append("=").append(trcTag).append(",");
        sb.append("endPoint").append("=").append(endPoint).append(",");
        sb.append("endPointNm").append("=").append(endPointNm).append(",");
        sb.append("manager").append("=").append(manager).append(",");
        sb.append("prevAprState").append("=").append(prevAprState).append(",");
        sb.append("rejectComment").append("=").append(rejectComment);
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
