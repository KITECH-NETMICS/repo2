package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "BPM 결재대기함")
public class AprWorkVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprWorkVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "instName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String instName;

    @ElDtoField(logicalName = "BPM인스턴스ID", physicalName = "instId", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int instId;

    @ElDtoField(logicalName = "BPM통프메인인스턴스ID", physicalName = "rootInstId", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int rootInstId;

    @ElDtoField(logicalName = "BPM인스턴스시작일시", physicalName = "instStarteddate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String instStarteddate;

    @ElDtoField(logicalName = "BPM인스턴스종료일시", physicalName = "instFinisheddate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String instFinisheddate;

    @ElDtoField(logicalName = "BPM테스크시작일시", physicalName = "taskStartdate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String taskStartdate;

    @ElDtoField(logicalName = "BPM테스크종료일시", physicalName = "taskEnddate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String taskEnddate;

    @ElDtoField(logicalName = "BPM서브여부", physicalName = "isSubprocess", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private boolean isSubprocess;

    @ElDtoField(logicalName = "BPM인스턴스상태", physicalName = "instStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String instStatus;

    @ElDtoField(logicalName = "BPM양식ID", physicalName = "defId", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int defId;

    @ElDtoField(logicalName = "BPM양식명(app_name)", physicalName = "defName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String defName;

    @ElDtoField(logicalName = "BPM문서번호(doc_id)", physicalName = "defAlias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String defAlias;

    @ElDtoField(logicalName = "BPM테스크명", physicalName = "taskName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String taskName;

    @ElDtoField(logicalName = "BPM테스크ID", physicalName = "taskId", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int taskId;

    @ElDtoField(logicalName = "BPM태그번호", physicalName = "trctag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String trctag;

    @ElDtoField(logicalName = "BPM현재처리자ID", physicalName = "endpoint", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String endpoint;

    @ElDtoField(logicalName = "BPM테스크상태", physicalName = "taskStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String taskStatus;

    @ElDtoField(logicalName = "BPM현재인스턴스담당자ID", physicalName = "currep", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String currep;

    @ElDtoField(logicalName = "BPM현재인스턴스담당자명", physicalName = "currepName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String currepName;

    @ElDtoField(logicalName = "BPM기안자ID", physicalName = "initep", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String initep;

    @ElDtoField(logicalName = "BPM기안자명", physicalName = "initepName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String initepName;

    @ElDtoField(logicalName = "문서제목", physicalName = "instInfo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String instInfo;

    @ElDtoField(logicalName = "계정번호", physicalName = "instExt1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String instExt1;

    @ElDtoField(logicalName = "예비값", physicalName = "instExt2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String instExt2;

    @ElDtoField(logicalName = "서비스ID", physicalName = "taskExt1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String taskExt1;

    @ElDtoField(logicalName = "결재상태코드", physicalName = "taskExt2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String taskExt2;

    @ElDtoField(logicalName = "퇴직신청확인코드", physicalName = "taskExt3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "퇴직신청시 사용", attr = "")
    private String taskExt3;

    @ElDtoField(logicalName = "접근URL", physicalName = "accessUrl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accessUrl;

    @ElDtoField(logicalName = "전자결재신규데이터여부", physicalName = "asistype", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String asistype;

    @ElDtoField(logicalName = "전자결재스냅여부", physicalName = "isSnapYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String isSnapYn;

    @ElDtoField(logicalName = "인스턴스Alias", physicalName = "instAlias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String instAlias;

    @ElVoField(physicalName = "instName")
    public String getInstName(){
        String ret = this.instName;
        return ret;
    }

    @ElVoField(physicalName = "instName")
    public void setInstName(String instName){
        this.instName = instName;
    }

    @ElVoField(physicalName = "instId")
    public int getInstId(){
        return instId;
    }

    @ElVoField(physicalName = "instId")
    public void setInstId(int instId){
        this.instId = instId;
    }

    @ElVoField(physicalName = "rootInstId")
    public int getRootInstId(){
        return rootInstId;
    }

    @ElVoField(physicalName = "rootInstId")
    public void setRootInstId(int rootInstId){
        this.rootInstId = rootInstId;
    }

    @ElVoField(physicalName = "instStarteddate")
    public String getInstStarteddate(){
        String ret = this.instStarteddate;
        return ret;
    }

    @ElVoField(physicalName = "instStarteddate")
    public void setInstStarteddate(String instStarteddate){
        this.instStarteddate = instStarteddate;
    }

    @ElVoField(physicalName = "instFinisheddate")
    public String getInstFinisheddate(){
        String ret = this.instFinisheddate;
        return ret;
    }

    @ElVoField(physicalName = "instFinisheddate")
    public void setInstFinisheddate(String instFinisheddate){
        this.instFinisheddate = instFinisheddate;
    }

    @ElVoField(physicalName = "taskStartdate")
    public String getTaskStartdate(){
        String ret = this.taskStartdate;
        return ret;
    }

    @ElVoField(physicalName = "taskStartdate")
    public void setTaskStartdate(String taskStartdate){
        this.taskStartdate = taskStartdate;
    }

    @ElVoField(physicalName = "taskEnddate")
    public String getTaskEnddate(){
        String ret = this.taskEnddate;
        return ret;
    }

    @ElVoField(physicalName = "taskEnddate")
    public void setTaskEnddate(String taskEnddate){
        this.taskEnddate = taskEnddate;
    }

    @ElVoField(physicalName = "isSubprocess")
    public boolean isIsSubprocess(){
        return isSubprocess;
    }

    @ElVoField(physicalName = "isSubprocess")
    public void setIsSubprocess(boolean isSubprocess){
        this.isSubprocess = isSubprocess;
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

    @ElVoField(physicalName = "defId")
    public int getDefId(){
        return defId;
    }

    @ElVoField(physicalName = "defId")
    public void setDefId(int defId){
        this.defId = defId;
    }

    @ElVoField(physicalName = "defName")
    public String getDefName(){
        String ret = this.defName;
        return ret;
    }

    @ElVoField(physicalName = "defName")
    public void setDefName(String defName){
        this.defName = defName;
    }

    @ElVoField(physicalName = "defAlias")
    public String getDefAlias(){
        String ret = this.defAlias;
        return ret;
    }

    @ElVoField(physicalName = "defAlias")
    public void setDefAlias(String defAlias){
        this.defAlias = defAlias;
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

    @ElVoField(physicalName = "taskId")
    public int getTaskId(){
        return taskId;
    }

    @ElVoField(physicalName = "taskId")
    public void setTaskId(int taskId){
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

    @ElVoField(physicalName = "endpoint")
    public String getEndpoint(){
        String ret = this.endpoint;
        return ret;
    }

    @ElVoField(physicalName = "endpoint")
    public void setEndpoint(String endpoint){
        this.endpoint = endpoint;
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

    @ElVoField(physicalName = "currep")
    public String getCurrep(){
        String ret = this.currep;
        return ret;
    }

    @ElVoField(physicalName = "currep")
    public void setCurrep(String currep){
        this.currep = currep;
    }

    @ElVoField(physicalName = "currepName")
    public String getCurrepName(){
        String ret = this.currepName;
        return ret;
    }

    @ElVoField(physicalName = "currepName")
    public void setCurrepName(String currepName){
        this.currepName = currepName;
    }

    @ElVoField(physicalName = "initep")
    public String getInitep(){
        String ret = this.initep;
        return ret;
    }

    @ElVoField(physicalName = "initep")
    public void setInitep(String initep){
        this.initep = initep;
    }

    @ElVoField(physicalName = "initepName")
    public String getInitepName(){
        String ret = this.initepName;
        return ret;
    }

    @ElVoField(physicalName = "initepName")
    public void setInitepName(String initepName){
        this.initepName = initepName;
    }

    @ElVoField(physicalName = "instInfo")
    public String getInstInfo(){
        String ret = this.instInfo;
        return ret;
    }

    @ElVoField(physicalName = "instInfo")
    public void setInstInfo(String instInfo){
        this.instInfo = instInfo;
    }

    @ElVoField(physicalName = "instExt1")
    public String getInstExt1(){
        String ret = this.instExt1;
        return ret;
    }

    @ElVoField(physicalName = "instExt1")
    public void setInstExt1(String instExt1){
        this.instExt1 = instExt1;
    }

    @ElVoField(physicalName = "instExt2")
    public String getInstExt2(){
        String ret = this.instExt2;
        return ret;
    }

    @ElVoField(physicalName = "instExt2")
    public void setInstExt2(String instExt2){
        this.instExt2 = instExt2;
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

    @ElVoField(physicalName = "taskExt2")
    public String getTaskExt2(){
        String ret = this.taskExt2;
        return ret;
    }

    @ElVoField(physicalName = "taskExt2")
    public void setTaskExt2(String taskExt2){
        this.taskExt2 = taskExt2;
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

    @ElVoField(physicalName = "accessUrl")
    public String getAccessUrl(){
        String ret = this.accessUrl;
        return ret;
    }

    @ElVoField(physicalName = "accessUrl")
    public void setAccessUrl(String accessUrl){
        this.accessUrl = accessUrl;
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

    @ElVoField(physicalName = "isSnapYn")
    public String getIsSnapYn(){
        String ret = this.isSnapYn;
        return ret;
    }

    @ElVoField(physicalName = "isSnapYn")
    public void setIsSnapYn(String isSnapYn){
        this.isSnapYn = isSnapYn;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprWorkVo [");
        sb.append("instName").append("=").append(instName).append(",");
        sb.append("instId").append("=").append(instId).append(",");
        sb.append("rootInstId").append("=").append(rootInstId).append(",");
        sb.append("instStarteddate").append("=").append(instStarteddate).append(",");
        sb.append("instFinisheddate").append("=").append(instFinisheddate).append(",");
        sb.append("taskStartdate").append("=").append(taskStartdate).append(",");
        sb.append("taskEnddate").append("=").append(taskEnddate).append(",");
        sb.append("isSubprocess").append("=").append(isSubprocess).append(",");
        sb.append("instStatus").append("=").append(instStatus).append(",");
        sb.append("defId").append("=").append(defId).append(",");
        sb.append("defName").append("=").append(defName).append(",");
        sb.append("defAlias").append("=").append(defAlias).append(",");
        sb.append("taskName").append("=").append(taskName).append(",");
        sb.append("taskId").append("=").append(taskId).append(",");
        sb.append("trctag").append("=").append(trctag).append(",");
        sb.append("endpoint").append("=").append(endpoint).append(",");
        sb.append("taskStatus").append("=").append(taskStatus).append(",");
        sb.append("currep").append("=").append(currep).append(",");
        sb.append("currepName").append("=").append(currepName).append(",");
        sb.append("initep").append("=").append(initep).append(",");
        sb.append("initepName").append("=").append(initepName).append(",");
        sb.append("instInfo").append("=").append(instInfo).append(",");
        sb.append("instExt1").append("=").append(instExt1).append(",");
        sb.append("instExt2").append("=").append(instExt2).append(",");
        sb.append("taskExt1").append("=").append(taskExt1).append(",");
        sb.append("taskExt2").append("=").append(taskExt2).append(",");
        sb.append("taskExt3").append("=").append(taskExt3).append(",");
        sb.append("accessUrl").append("=").append(accessUrl).append(",");
        sb.append("asistype").append("=").append(asistype).append(",");
        sb.append("isSnapYn").append("=").append(isSnapYn).append(",");
        sb.append("instAlias").append("=").append(instAlias);
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
