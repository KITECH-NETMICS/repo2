package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "BPM 테스크키")
public class AprTaskVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprTaskVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "reqNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reqNo;

    @ElDtoField(logicalName = "인스턴스ID", physicalName = "instanceId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String instanceId;

    @ElDtoField(logicalName = "테스크ID", physicalName = "taskId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "BPM 검색", attr = "")
    private String taskId;

    @ElDtoField(logicalName = "테스크Tag", physicalName = "trcTag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "BPM 검색", attr = "")
    private String trcTag;

    @ElDtoField(logicalName = "행위자", physicalName = "endPoint", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "BPM 검색", attr = "")
    private String endPoint;

    @ElDtoField(logicalName = "별칭", physicalName = "alias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String alias;

    @ElVoField(physicalName = "reqNo")
    public String getReqNo(){
        String ret = this.reqNo;
        return ret;
    }

    @ElVoField(physicalName = "reqNo")
    public void setReqNo(String reqNo){
        this.reqNo = reqNo;
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

    @ElVoField(physicalName = "alias")
    public String getAlias(){
        String ret = this.alias;
        return ret;
    }

    @ElVoField(physicalName = "alias")
    public void setAlias(String alias){
        this.alias = alias;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprTaskVo [");
        sb.append("reqNo").append("=").append(reqNo).append(",");
        sb.append("instanceId").append("=").append(instanceId).append(",");
        sb.append("taskId").append("=").append(taskId).append(",");
        sb.append("trcTag").append("=").append(trcTag).append(",");
        sb.append("endPoint").append("=").append(endPoint).append(",");
        sb.append("alias").append("=").append(alias);
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
