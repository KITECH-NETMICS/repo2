package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "인수자산 계획디테일 Vo")
public class FinAcqAsetPlanDtlVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinAcqAsetPlanDtlVo(){
    }

    @ElDtoField(logicalName = "계획번호", physicalName = "plan_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String plan_req_no;

    @ElDtoField(logicalName = "계획순번", physicalName = "plan_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int plan_seq;

    @ElDtoField(logicalName = "계상일자", physicalName = "rec_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rec_ymd;

    @ElDtoField(logicalName = "공급가액", physicalName = "suply_value", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double suply_value;

    @ElDtoField(logicalName = "부가세액", physicalName = "add_tax", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double add_tax;

    @ElDtoField(logicalName = "합계", physicalName = "total_amt", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double total_amt;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "결의순번", physicalName = "unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int unslip_odr;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "결의일자", physicalName = "slip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd;

    @ElDtoField(logicalName = "결의확정번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "자산번호", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;

    @ElDtoField(logicalName = "자산명", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "계상시작일", physicalName = "rec_st_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rec_st_ymd;

    @ElDtoField(logicalName = "계상종료일", physicalName = "rec_ed_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rec_ed_ymd;

    @ElDtoField(logicalName = "계산서번호", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "사업자등록번호", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "거래처명", physicalName = "vend_fulnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_fulnm;

    @ElDtoField(logicalName = "취소결의번호", physicalName = "cancel_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cancel_unslip_no;

    @ElVoField(physicalName = "plan_req_no")
    public String getPlan_req_no(){
        return plan_req_no;
    }

    @ElVoField(physicalName = "plan_req_no")
    public void setPlan_req_no(String plan_req_no){
        this.plan_req_no = plan_req_no;
    }

    @ElVoField(physicalName = "plan_seq")
    public int getPlan_seq(){
        return plan_seq;
    }

    @ElVoField(physicalName = "plan_seq")
    public void setPlan_seq(int plan_seq){
        this.plan_seq = plan_seq;
    }

    @ElVoField(physicalName = "rec_ymd")
    public String getRec_ymd(){
        return rec_ymd;
    }

    @ElVoField(physicalName = "rec_ymd")
    public void setRec_ymd(String rec_ymd){
        this.rec_ymd = rec_ymd;
    }

    @ElVoField(physicalName = "suply_value")
    public double getSuply_value(){
        return suply_value;
    }

    @ElVoField(physicalName = "suply_value")
    public void setSuply_value(double suply_value){
        this.suply_value = suply_value;
    }

    @ElVoField(physicalName = "add_tax")
    public double getAdd_tax(){
        return add_tax;
    }

    @ElVoField(physicalName = "add_tax")
    public void setAdd_tax(double add_tax){
        this.add_tax = add_tax;
    }

    @ElVoField(physicalName = "total_amt")
    public double getTotal_amt(){
        return total_amt;
    }

    @ElVoField(physicalName = "total_amt")
    public void setTotal_amt(double total_amt){
        this.total_amt = total_amt;
    }

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

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "slip_ymd")
    public String getSlip_ymd(){
        return slip_ymd;
    }

    @ElVoField(physicalName = "slip_ymd")
    public void setSlip_ymd(String slip_ymd){
        this.slip_ymd = slip_ymd;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        return aset_no;
    }

    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "rec_st_ymd")
    public String getRec_st_ymd(){
        return rec_st_ymd;
    }

    @ElVoField(physicalName = "rec_st_ymd")
    public void setRec_st_ymd(String rec_st_ymd){
        this.rec_st_ymd = rec_st_ymd;
    }

    @ElVoField(physicalName = "rec_ed_ymd")
    public String getRec_ed_ymd(){
        return rec_ed_ymd;
    }

    @ElVoField(physicalName = "rec_ed_ymd")
    public void setRec_ed_ymd(String rec_ed_ymd){
        this.rec_ed_ymd = rec_ed_ymd;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "vend_fulnm")
    public String getVend_fulnm(){
        return vend_fulnm;
    }

    @ElVoField(physicalName = "vend_fulnm")
    public void setVend_fulnm(String vend_fulnm){
        this.vend_fulnm = vend_fulnm;
    }

    @ElVoField(physicalName = "cancel_unslip_no")
    public String getCancel_unslip_no(){
        return cancel_unslip_no;
    }

    @ElVoField(physicalName = "cancel_unslip_no")
    public void setCancel_unslip_no(String cancel_unslip_no){
        this.cancel_unslip_no = cancel_unslip_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinAcqAsetPlanDtlVo [");
        sb.append("plan_req_no").append("=").append(plan_req_no).append(",");
        sb.append("plan_seq").append("=").append(plan_seq).append(",");
        sb.append("rec_ymd").append("=").append(rec_ymd).append(",");
        sb.append("suply_value").append("=").append(suply_value).append(",");
        sb.append("add_tax").append("=").append(add_tax).append(",");
        sb.append("total_amt").append("=").append(total_amt).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("slip_ymd").append("=").append(slip_ymd).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("aset_no").append("=").append(aset_no).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("rec_st_ymd").append("=").append(rec_st_ymd).append(",");
        sb.append("rec_ed_ymd").append("=").append(rec_ed_ymd).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("vend_fulnm").append("=").append(vend_fulnm).append(",");
        sb.append("cancel_unslip_no").append("=").append(cancel_unslip_no);
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
