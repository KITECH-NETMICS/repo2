package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재 제약 Vo")
public class AppvConstraintVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AppvConstraintVo(){
    }

    @ElDtoField(logicalName = "결재행위구분", physicalName = "action_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String action_cd;

    @ElDtoField(logicalName = "쿼리", physicalName = "query", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String query;

    @ElDtoField(logicalName = "메세지", physicalName = "message", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String message;

    @ElDtoField(logicalName = "사용유무", physicalName = "is_use", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean is_use;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "문서번호(검색용)", physicalName = "alias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String alias;

    @ElVoField(physicalName = "action_cd")
    public String getAction_cd(){
        return action_cd;
    }

    @ElVoField(physicalName = "action_cd")
    public void setAction_cd(String action_cd){
        this.action_cd = action_cd;
    }

    @ElVoField(physicalName = "query")
    public String getQuery(){
        return query;
    }

    @ElVoField(physicalName = "query")
    public void setQuery(String query){
        this.query = query;
    }

    @ElVoField(physicalName = "message")
    public String getMessage(){
        return message;
    }

    @ElVoField(physicalName = "message")
    public void setMessage(String message){
        this.message = message;
    }

    @ElVoField(physicalName = "is_use")
    public boolean isIs_use(){
        return is_use;
    }

    @ElVoField(physicalName = "is_use")
    public void setIs_use(boolean is_use){
        this.is_use = is_use;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "alias")
    public String getAlias(){
        return alias;
    }

    @ElVoField(physicalName = "alias")
    public void setAlias(String alias){
        this.alias = alias;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppvConstraintVo [");
        sb.append("action_cd").append("=").append(action_cd).append(",");
        sb.append("query").append("=").append(query).append(",");
        sb.append("message").append("=").append(message).append(",");
        sb.append("is_use").append("=").append(is_use).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
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
