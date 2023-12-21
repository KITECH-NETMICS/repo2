package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "예외정보")
public class ExceptItemVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ExceptItemVo(){
    }

    @ElDtoField(logicalName = "예외종류코드", physicalName = "kind_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kind_cd;

    @ElDtoField(logicalName = "예외값코드", physicalName = "value_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String value_cd;

    @ElDtoField(logicalName = "예외값", physicalName = "value", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String value;

    @ElDtoField(logicalName = "서비스ID", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElDtoField(logicalName = "서비스명", physicalName = "service_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_nm;

    @ElDtoField(logicalName = "허용|금지", physicalName = "allow_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String allow_yn;

    @ElDtoField(logicalName = "패스여부", physicalName = "pass", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean pass;

    @ElDtoField(logicalName = "데이터", physicalName = "values", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String values;

    @ElDtoField(logicalName = "예외시작일", physicalName = "start_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_date;

    @ElDtoField(logicalName = "에외종료일", physicalName = "close_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String close_date;

    @ElDtoField(logicalName = "순번", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "행 상태", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElVoField(physicalName = "kind_cd")
    public String getKind_cd(){
        return kind_cd;
    }

    @ElVoField(physicalName = "kind_cd")
    public void setKind_cd(String kind_cd){
        this.kind_cd = kind_cd;
    }

    @ElVoField(physicalName = "value_cd")
    public String getValue_cd(){
        return value_cd;
    }

    @ElVoField(physicalName = "value_cd")
    public void setValue_cd(String value_cd){
        this.value_cd = value_cd;
    }

    @ElVoField(physicalName = "value")
    public String getValue(){
        return value;
    }

    @ElVoField(physicalName = "value")
    public void setValue(String value){
        this.value = value;
    }

    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @ElVoField(physicalName = "service_nm")
    public String getService_nm(){
        return service_nm;
    }

    @ElVoField(physicalName = "service_nm")
    public void setService_nm(String service_nm){
        this.service_nm = service_nm;
    }

    @ElVoField(physicalName = "allow_yn")
    public String getAllow_yn(){
        return allow_yn;
    }

    @ElVoField(physicalName = "allow_yn")
    public void setAllow_yn(String allow_yn){
        this.allow_yn = allow_yn;
    }

    @ElVoField(physicalName = "pass")
    public boolean isPass(){
        return pass;
    }

    @ElVoField(physicalName = "pass")
    public void setPass(boolean pass){
        this.pass = pass;
    }

    @ElVoField(physicalName = "values")
    public String getValues(){
        return values;
    }

    @ElVoField(physicalName = "values")
    public void setValues(String values){
        this.values = values;
    }

    @ElVoField(physicalName = "start_date")
    public String getStart_date(){
        return start_date;
    }

    @ElVoField(physicalName = "start_date")
    public void setStart_date(String start_date){
        this.start_date = start_date;
    }

    @ElVoField(physicalName = "close_date")
    public String getClose_date(){
        return close_date;
    }

    @ElVoField(physicalName = "close_date")
    public void setClose_date(String close_date){
        this.close_date = close_date;
    }

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExceptItemVo [");
        sb.append("kind_cd").append("=").append(kind_cd).append(",");
        sb.append("value_cd").append("=").append(value_cd).append(",");
        sb.append("value").append("=").append(value).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("service_nm").append("=").append(service_nm).append(",");
        sb.append("allow_yn").append("=").append(allow_yn).append(",");
        sb.append("pass").append("=").append(pass).append(",");
        sb.append("values").append("=").append(values).append(",");
        sb.append("start_date").append("=").append(start_date).append(",");
        sb.append("close_date").append("=").append(close_date).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("rowStatus").append("=").append(rowStatus);
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
