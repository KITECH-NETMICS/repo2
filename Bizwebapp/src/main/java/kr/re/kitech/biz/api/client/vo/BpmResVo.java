package kr.re.kitech.biz.api.client.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "BPM 응답 객체")
public class BpmResVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BpmResVo(){
    }

    @ElDtoField(logicalName = "결과", physicalName = "result", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private boolean result;

    @ElDtoField(logicalName = "메시지", physicalName = "message", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String message;

    @ElDtoField(logicalName = "응답데이터", physicalName = "apiResult", type = "Map", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.Map apiResult;

    @ElVoField(physicalName = "result")
    public boolean isResult(){
        return result;
    }

    @ElVoField(physicalName = "result")
    public void setResult(boolean result){
        this.result = result;
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

    @ElVoField(physicalName = "apiResult")
    public java.util.Map getApiResult(){
        return apiResult;
    }

    @ElVoField(physicalName = "apiResult")
    public void setApiResult(java.util.Map apiResult){
        this.apiResult = apiResult;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BpmResVo [");
        sb.append("result").append("=").append(result).append(",");
        sb.append("message").append("=").append(message).append(",");
        sb.append("apiResult").append("=").append(apiResult);
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
