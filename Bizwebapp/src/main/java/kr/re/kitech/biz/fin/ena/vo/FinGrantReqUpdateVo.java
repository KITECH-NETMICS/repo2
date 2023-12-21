package kr.re.kitech.biz.fin.ena.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FinGrantReqUpdateExp")
public class FinGrantReqUpdateVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinGrantReqUpdateVo(){
    }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "reqPsn", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "unslipNo", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "bsnsyear", physicalName = "bsnsyear", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsnsyear;

    @ElDtoField(logicalName = "ddtlbzId", physicalName = "ddtlbz_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ddtlbz_id;

    @ElDtoField(logicalName = "dvrqOdr", physicalName = "dvrq_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dvrq_odr;

    @ElDtoField(logicalName = "cancel_slip", physicalName = "cancel_slip", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cancel_slip;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "bsnsyear")
    public String getBsnsyear(){
        return bsnsyear;
    }

    @ElVoField(physicalName = "bsnsyear")
    public void setBsnsyear(String bsnsyear){
        this.bsnsyear = bsnsyear;
    }

    @ElVoField(physicalName = "ddtlbz_id")
    public String getDdtlbz_id(){
        return ddtlbz_id;
    }

    @ElVoField(physicalName = "ddtlbz_id")
    public void setDdtlbz_id(String ddtlbz_id){
        this.ddtlbz_id = ddtlbz_id;
    }

    @ElVoField(physicalName = "dvrq_odr")
    public String getDvrq_odr(){
        return dvrq_odr;
    }

    @ElVoField(physicalName = "dvrq_odr")
    public void setDvrq_odr(String dvrq_odr){
        this.dvrq_odr = dvrq_odr;
    }

    @ElVoField(physicalName = "cancel_slip")
    public String getCancel_slip(){
        return cancel_slip;
    }

    @ElVoField(physicalName = "cancel_slip")
    public void setCancel_slip(String cancel_slip){
        this.cancel_slip = cancel_slip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinGrantReqUpdateVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("bsnsyear").append("=").append(bsnsyear).append(",");
        sb.append("ddtlbz_id").append("=").append(ddtlbz_id).append(",");
        sb.append("dvrq_odr").append("=").append(dvrq_odr).append(",");
        sb.append("cancel_slip").append("=").append(cancel_slip);
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
