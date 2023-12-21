package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "재무자동결의 결의번호 업데이트 Vo")
public class FinSpaSlipUpdVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinSpaSlipUpdVo(){
    }

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "결의순번", physicalName = "unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int unslip_odr;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "크리스피트 전자증빙 삭제시", physicalName = "rqst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rqst_no;

    @ElDtoField(logicalName = "입금상태", physicalName = "depst_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_state;

    @ElDtoField(logicalName = "청구결의번호(미수수탁)", physicalName = "chrg_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chrg_unslip_no;

    @ElDtoField(logicalName = "청구결의순번(미수수탁)", physicalName = "chrg_unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int chrg_unslip_odr;

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "unslip_odr")
    public int getUnslip_odr(){
        return unslip_odr;
    }

    @ElVoField(physicalName = "unslip_odr")
    public void setUnslip_odr(int unslip_odr){
        this.unslip_odr = unslip_odr;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "rqst_no")
    public String getRqst_no(){
        return rqst_no;
    }

    @ElVoField(physicalName = "rqst_no")
    public void setRqst_no(String rqst_no){
        this.rqst_no = rqst_no;
    }

    @ElVoField(physicalName = "depst_state")
    public String getDepst_state(){
        return depst_state;
    }

    @ElVoField(physicalName = "depst_state")
    public void setDepst_state(String depst_state){
        this.depst_state = depst_state;
    }

    @ElVoField(physicalName = "chrg_unslip_no")
    public String getChrg_unslip_no(){
        return chrg_unslip_no;
    }

    @ElVoField(physicalName = "chrg_unslip_no")
    public void setChrg_unslip_no(String chrg_unslip_no){
        this.chrg_unslip_no = chrg_unslip_no;
    }

    @ElVoField(physicalName = "chrg_unslip_odr")
    public int getChrg_unslip_odr(){
        return chrg_unslip_odr;
    }

    @ElVoField(physicalName = "chrg_unslip_odr")
    public void setChrg_unslip_odr(int chrg_unslip_odr){
        this.chrg_unslip_odr = chrg_unslip_odr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinSpaSlipUpdVo [");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("rqst_no").append("=").append(rqst_no).append(",");
        sb.append("depst_state").append("=").append(depst_state).append(",");
        sb.append("chrg_unslip_no").append("=").append(chrg_unslip_no).append(",");
        sb.append("chrg_unslip_odr").append("=").append(chrg_unslip_odr);
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
