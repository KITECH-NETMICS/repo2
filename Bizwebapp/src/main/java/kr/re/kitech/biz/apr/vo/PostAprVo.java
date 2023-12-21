package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사후결재 Vo")
public class PostAprVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PostAprVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "문서 ID", physicalName = "docu_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String docu_id;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "테이블명", physicalName = "table_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String table_nm;

    @ElDtoField(logicalName = "날짜컬럼명", physicalName = "date_col_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String date_col_nm;

    @ElDtoField(logicalName = "키컬럼명", physicalName = "key_col_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String key_col_nm;

    @ElDtoField(logicalName = "허용일자", physicalName = "allow_days", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int allow_days;

    @ElDtoField(logicalName = "사후결재여부", physicalName = "is_apr_after", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean is_apr_after;

    @ElDtoField(logicalName = "실제 날짜", physicalName = "action_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String action_ymd;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "사후결재사유", physicalName = "reason", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reason;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "docu_id")
    public String getDocu_id(){
        return docu_id;
    }

    @ElVoField(physicalName = "docu_id")
    public void setDocu_id(String docu_id){
        this.docu_id = docu_id;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "table_nm")
    public String getTable_nm(){
        return table_nm;
    }

    @ElVoField(physicalName = "table_nm")
    public void setTable_nm(String table_nm){
        this.table_nm = table_nm;
    }

    @ElVoField(physicalName = "date_col_nm")
    public String getDate_col_nm(){
        return date_col_nm;
    }

    @ElVoField(physicalName = "date_col_nm")
    public void setDate_col_nm(String date_col_nm){
        this.date_col_nm = date_col_nm;
    }

    @ElVoField(physicalName = "key_col_nm")
    public String getKey_col_nm(){
        return key_col_nm;
    }

    @ElVoField(physicalName = "key_col_nm")
    public void setKey_col_nm(String key_col_nm){
        this.key_col_nm = key_col_nm;
    }

    @ElVoField(physicalName = "allow_days")
    public int getAllow_days(){
        return allow_days;
    }

    @ElVoField(physicalName = "allow_days")
    public void setAllow_days(int allow_days){
        this.allow_days = allow_days;
    }

    @ElVoField(physicalName = "is_apr_after")
    public boolean isIs_apr_after(){
        return is_apr_after;
    }

    @ElVoField(physicalName = "is_apr_after")
    public void setIs_apr_after(boolean is_apr_after){
        this.is_apr_after = is_apr_after;
    }

    @ElVoField(physicalName = "action_ymd")
    public String getAction_ymd(){
        return action_ymd;
    }

    @ElVoField(physicalName = "action_ymd")
    public void setAction_ymd(String action_ymd){
        this.action_ymd = action_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "reason")
    public String getReason(){
        return reason;
    }

    @ElVoField(physicalName = "reason")
    public void setReason(String reason){
        this.reason = reason;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PostAprVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("docu_id").append("=").append(docu_id).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("table_nm").append("=").append(table_nm).append(",");
        sb.append("date_col_nm").append("=").append(date_col_nm).append(",");
        sb.append("key_col_nm").append("=").append(key_col_nm).append(",");
        sb.append("allow_days").append("=").append(allow_days).append(",");
        sb.append("is_apr_after").append("=").append(is_apr_after).append(",");
        sb.append("action_ymd").append("=").append(action_ymd).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("reason").append("=").append(reason);
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
