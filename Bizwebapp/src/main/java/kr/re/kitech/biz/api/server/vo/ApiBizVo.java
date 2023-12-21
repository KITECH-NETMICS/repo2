package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "EIP2 대응 요청/응답 객체.")
public class ApiBizVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiBizVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "reqNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reqNo;

    @ElDtoField(logicalName = "요청사용자ID", physicalName = "reqUid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reqUid;

    @ElDtoField(logicalName = "결재상태", physicalName = "aprState", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String aprState;

    @ElDtoField(logicalName = "반려여부", physicalName = "rejectYN", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rejectYN;

    @ElDtoField(logicalName = "타입구분", physicalName = "existSnap", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private boolean existSnap;

    @ElDtoField(logicalName = "성공여부", physicalName = "success", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private boolean success;

    @ElDtoField(logicalName = "메시지", physicalName = "message", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String message;

    @ElDtoField(logicalName = "결과", physicalName = "result", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String result;

    @ElDtoField(logicalName = "스냅샷모델", physicalName = "snap", type = "Map", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.Map snap;

    @ElDtoField(logicalName = "서비스ID", physicalName = "uiId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String uiId;

    @ElDtoField(logicalName = "전자연구노트여부", physicalName = "eln", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private boolean eln;

    @ElDtoField(logicalName = "확정번호", physicalName = "slipNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String slipNo;

    @ElDtoField(logicalName = "의견(반려,상신)", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String comments;

    @ElDtoField(logicalName = "행위자(결재,반려)", physicalName = "actorName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String actorName;

    @ElDtoField(logicalName = "BPM API 삭제전용여부", physicalName = "bpmOnlyDel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String bpmOnlyDel;

    @ElVoField(physicalName = "reqNo")
    public String getReqNo(){
        String ret = this.reqNo;
        return ret;
    }

    @ElVoField(physicalName = "reqNo")
    public void setReqNo(String reqNo){
        this.reqNo = reqNo;
    }

    @ElVoField(physicalName = "reqUid")
    public String getReqUid(){
        String ret = this.reqUid;
        return ret;
    }

    @ElVoField(physicalName = "reqUid")
    public void setReqUid(String reqUid){
        this.reqUid = reqUid;
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

    @ElVoField(physicalName = "rejectYN")
    public String getRejectYN(){
        String ret = this.rejectYN;
        return ret;
    }

    @ElVoField(physicalName = "rejectYN")
    public void setRejectYN(String rejectYN){
        this.rejectYN = rejectYN;
    }

    @ElVoField(physicalName = "existSnap")
    public boolean isExistSnap(){
        return existSnap;
    }

    @ElVoField(physicalName = "existSnap")
    public void setExistSnap(boolean existSnap){
        this.existSnap = existSnap;
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

    @ElVoField(physicalName = "snap")
    public java.util.Map getSnap(){
        return snap;
    }

    @ElVoField(physicalName = "snap")
    public void setSnap(java.util.Map snap){
        this.snap = snap;
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

    @ElVoField(physicalName = "eln")
    public boolean isEln(){
        return eln;
    }

    @ElVoField(physicalName = "eln")
    public void setEln(boolean eln){
        this.eln = eln;
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

    @ElVoField(physicalName = "comments")
    public String getComments(){
        String ret = this.comments;
        return ret;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
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

    @ElVoField(physicalName = "bpmOnlyDel")
    public String getBpmOnlyDel(){
        String ret = this.bpmOnlyDel;
        return ret;
    }

    @ElVoField(physicalName = "bpmOnlyDel")
    public void setBpmOnlyDel(String bpmOnlyDel){
        this.bpmOnlyDel = bpmOnlyDel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiBizVo [");
        sb.append("reqNo").append("=").append(reqNo).append(",");
        sb.append("reqUid").append("=").append(reqUid).append(",");
        sb.append("aprState").append("=").append(aprState).append(",");
        sb.append("rejectYN").append("=").append(rejectYN).append(",");
        sb.append("existSnap").append("=").append(existSnap).append(",");
        sb.append("success").append("=").append(success).append(",");
        sb.append("message").append("=").append(message).append(",");
        sb.append("result").append("=").append(result).append(",");
        sb.append("snap").append("=").append(snap).append(",");
        sb.append("uiId").append("=").append(uiId).append(",");
        sb.append("eln").append("=").append(eln).append(",");
        sb.append("slipNo").append("=").append(slipNo).append(",");
        sb.append("comments").append("=").append(comments).append(",");
        sb.append("actorName").append("=").append(actorName).append(",");
        sb.append("bpmOnlyDel").append("=").append(bpmOnlyDel);
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
