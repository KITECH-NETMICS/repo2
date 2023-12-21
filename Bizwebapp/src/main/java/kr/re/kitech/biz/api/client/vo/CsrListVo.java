package kr.re.kitech.biz.api.client.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "CSR List Vo")
public class CsrListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CsrListVo(){
    }

    @ElDtoField(logicalName = "요청번호", physicalName = "inst_id", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int inst_id;

    @ElDtoField(logicalName = "제목", physicalName = "change_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String change_title;

    @ElDtoField(logicalName = "요청자", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "사번", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "요청일", physicalName = "inst_dt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inst_dt;

    @ElDtoField(logicalName = "접수자", physicalName = "rcpt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_nm;

    @ElDtoField(logicalName = "진행상태", physicalName = "status_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String status_nm;

    @ElDtoField(logicalName = "만족도조사", physicalName = "sat_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sat_yn;

    @ElVoField(physicalName = "inst_id")
    public int getInst_id(){
        return inst_id;
    }

    @ElVoField(physicalName = "inst_id")
    public void setInst_id(int inst_id){
        this.inst_id = inst_id;
    }

    @ElVoField(physicalName = "change_title")
    public String getChange_title(){
        return change_title;
    }

    @ElVoField(physicalName = "change_title")
    public void setChange_title(String change_title){
        this.change_title = change_title;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "inst_dt")
    public String getInst_dt(){
        return inst_dt;
    }

    @ElVoField(physicalName = "inst_dt")
    public void setInst_dt(String inst_dt){
        this.inst_dt = inst_dt;
    }

    @ElVoField(physicalName = "rcpt_nm")
    public String getRcpt_nm(){
        return rcpt_nm;
    }

    @ElVoField(physicalName = "rcpt_nm")
    public void setRcpt_nm(String rcpt_nm){
        this.rcpt_nm = rcpt_nm;
    }

    @ElVoField(physicalName = "status_nm")
    public String getStatus_nm(){
        return status_nm;
    }

    @ElVoField(physicalName = "status_nm")
    public void setStatus_nm(String status_nm){
        this.status_nm = status_nm;
    }

    @ElVoField(physicalName = "sat_yn")
    public String getSat_yn(){
        return sat_yn;
    }

    @ElVoField(physicalName = "sat_yn")
    public void setSat_yn(String sat_yn){
        this.sat_yn = sat_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CsrListVo [");
        sb.append("inst_id").append("=").append(inst_id).append(",");
        sb.append("change_title").append("=").append(change_title).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("inst_dt").append("=").append(inst_dt).append(",");
        sb.append("rcpt_nm").append("=").append(rcpt_nm).append(",");
        sb.append("status_nm").append("=").append(status_nm).append(",");
        sb.append("sat_yn").append("=").append(sat_yn);
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
