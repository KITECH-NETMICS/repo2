package kr.re.kitech.biz.epu.giv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "구내지급계정 Vo")
public class PurPayReqAccntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurPayReqAccntVo(){
    }

    @ElDtoField(logicalName = "지급신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "계정순번", physicalName = "accnt_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int accnt_odr;

    @ElDtoField(logicalName = "순번", physicalName = "odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int odr;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "지급금액", physicalName = "pay_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_amt;

    @ElDtoField(logicalName = "공급가액", physicalName = "suply_value", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long suply_value;

    @ElDtoField(logicalName = "재무지급금액", physicalName = "fin_pay_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long fin_pay_amt;

    @ElDtoField(logicalName = "재무지급공급가액", physicalName = "fin_suply_value", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long fin_suply_value;

    @ElDtoField(logicalName = "통제신청번호", physicalName = "ctrl_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_req_no;

    @ElDtoField(logicalName = "통제신청순번", physicalName = "ctrl_req_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int ctrl_req_seq;

    @ElDtoField(logicalName = "발생결의번호", physicalName = "occr_slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occr_slip_no;

    @ElDtoField(logicalName = "발생결의순번", physicalName = "occr_slip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int occr_slip_odr;

    @ElDtoField(logicalName = "과세구분", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "결의금액", physicalName = "unslip_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unslip_amt;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "accnt_odr")
    public int getAccnt_odr(){
        return accnt_odr;
    }

    @ElVoField(physicalName = "accnt_odr")
    public void setAccnt_odr(int accnt_odr){
        this.accnt_odr = accnt_odr;
    }

    @ElVoField(physicalName = "odr")
    public int getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(int odr){
        this.odr = odr;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "pay_amt")
    public long getPay_amt(){
        return pay_amt;
    }

    @ElVoField(physicalName = "pay_amt")
    public void setPay_amt(long pay_amt){
        this.pay_amt = pay_amt;
    }

    @ElVoField(physicalName = "suply_value")
    public long getSuply_value(){
        return suply_value;
    }

    @ElVoField(physicalName = "suply_value")
    public void setSuply_value(long suply_value){
        this.suply_value = suply_value;
    }

    @ElVoField(physicalName = "fin_pay_amt")
    public long getFin_pay_amt(){
        return fin_pay_amt;
    }

    @ElVoField(physicalName = "fin_pay_amt")
    public void setFin_pay_amt(long fin_pay_amt){
        this.fin_pay_amt = fin_pay_amt;
    }

    @ElVoField(physicalName = "fin_suply_value")
    public long getFin_suply_value(){
        return fin_suply_value;
    }

    @ElVoField(physicalName = "fin_suply_value")
    public void setFin_suply_value(long fin_suply_value){
        this.fin_suply_value = fin_suply_value;
    }

    @ElVoField(physicalName = "ctrl_req_no")
    public String getCtrl_req_no(){
        return ctrl_req_no;
    }

    @ElVoField(physicalName = "ctrl_req_no")
    public void setCtrl_req_no(String ctrl_req_no){
        this.ctrl_req_no = ctrl_req_no;
    }

    @ElVoField(physicalName = "ctrl_req_seq")
    public int getCtrl_req_seq(){
        return ctrl_req_seq;
    }

    @ElVoField(physicalName = "ctrl_req_seq")
    public void setCtrl_req_seq(int ctrl_req_seq){
        this.ctrl_req_seq = ctrl_req_seq;
    }

    @ElVoField(physicalName = "occr_slip_no")
    public String getOccr_slip_no(){
        return occr_slip_no;
    }

    @ElVoField(physicalName = "occr_slip_no")
    public void setOccr_slip_no(String occr_slip_no){
        this.occr_slip_no = occr_slip_no;
    }

    @ElVoField(physicalName = "occr_slip_odr")
    public int getOccr_slip_odr(){
        return occr_slip_odr;
    }

    @ElVoField(physicalName = "occr_slip_odr")
    public void setOccr_slip_odr(int occr_slip_odr){
        this.occr_slip_odr = occr_slip_odr;
    }

    @ElVoField(physicalName = "tax_cd")
    public String getTax_cd(){
        return tax_cd;
    }

    @ElVoField(physicalName = "tax_cd")
    public void setTax_cd(String tax_cd){
        this.tax_cd = tax_cd;
    }

    @ElVoField(physicalName = "unslip_amt")
    public long getUnslip_amt(){
        return unslip_amt;
    }

    @ElVoField(physicalName = "unslip_amt")
    public void setUnslip_amt(long unslip_amt){
        this.unslip_amt = unslip_amt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurPayReqAccntVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("accnt_odr").append("=").append(accnt_odr).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("pay_amt").append("=").append(pay_amt).append(",");
        sb.append("suply_value").append("=").append(suply_value).append(",");
        sb.append("fin_pay_amt").append("=").append(fin_pay_amt).append(",");
        sb.append("fin_suply_value").append("=").append(fin_suply_value).append(",");
        sb.append("ctrl_req_no").append("=").append(ctrl_req_no).append(",");
        sb.append("ctrl_req_seq").append("=").append(ctrl_req_seq).append(",");
        sb.append("occr_slip_no").append("=").append(occr_slip_no).append(",");
        sb.append("occr_slip_odr").append("=").append(occr_slip_odr).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("unslip_amt").append("=").append(unslip_amt);
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
