package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "BPM 대응 요청/응답 객체")
public class AprPostVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprPostVo(){
    }

    @ElDtoField(logicalName = "업무명", physicalName = "authType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String authType;

    @ElDtoField(logicalName = "사번", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "신청번호", physicalName = "reqNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqNo;

    @ElDtoField(logicalName = "요청사용자ID", physicalName = "reqUid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqUid;

    @ElDtoField(logicalName = "결재상태", physicalName = "aprState", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aprState;

    @ElDtoField(logicalName = "성공여부", physicalName = "success", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean success;

    @ElDtoField(logicalName = "메시지", physicalName = "message", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String message;

    @ElDtoField(logicalName = "결과", physicalName = "result", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String result;

    @ElDtoField(logicalName = "프로시저호출결과", physicalName = "sqlErr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int sqlErr;

    @ElVoField(physicalName = "authType")
    public String getAuthType(){
        return authType;
    }

    @ElVoField(physicalName = "authType")
    public void setAuthType(String authType){
        this.authType = authType;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "reqNo")
    public String getReqNo(){
        return reqNo;
    }

    @ElVoField(physicalName = "reqNo")
    public void setReqNo(String reqNo){
        this.reqNo = reqNo;
    }

    @ElVoField(physicalName = "reqUid")
    public String getReqUid(){
        return reqUid;
    }

    @ElVoField(physicalName = "reqUid")
    public void setReqUid(String reqUid){
        this.reqUid = reqUid;
    }

    @ElVoField(physicalName = "aprState")
    public String getAprState(){
        return aprState;
    }

    @ElVoField(physicalName = "aprState")
    public void setAprState(String aprState){
        this.aprState = aprState;
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
        return message;
    }

    @ElVoField(physicalName = "message")
    public void setMessage(String message){
        this.message = message;
    }

    @ElVoField(physicalName = "result")
    public String getResult(){
        return result;
    }

    @ElVoField(physicalName = "result")
    public void setResult(String result){
        this.result = result;
    }

    @ElVoField(physicalName = "sqlErr")
    public int getSqlErr(){
        return sqlErr;
    }

    @ElVoField(physicalName = "sqlErr")
    public void setSqlErr(int sqlErr){
        this.sqlErr = sqlErr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprPostVo [");
        sb.append("authType").append("=").append(authType).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("reqNo").append("=").append(reqNo).append(",");
        sb.append("reqUid").append("=").append(reqUid).append(",");
        sb.append("aprState").append("=").append(aprState).append(",");
        sb.append("success").append("=").append(success).append(",");
        sb.append("message").append("=").append(message).append(",");
        sb.append("result").append("=").append(result).append(",");
        sb.append("sqlErr").append("=").append(sqlErr);
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
