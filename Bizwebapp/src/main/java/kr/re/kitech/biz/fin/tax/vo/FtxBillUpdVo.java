package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계산서 삭제시 업무별 처리 Vo")
public class FtxBillUpdVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FtxBillUpdVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "계산서구분", physicalName = "bill_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_clsf;

    @ElDtoField(logicalName = "청구영수구분", physicalName = "demnd_recv_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_recv_clsf;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계산서번호(계산서)", physicalName = "tax_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_bill_no;

    @ElDtoField(logicalName = "발행일련번호", physicalName = "issu_seqno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_seqno;

    @ElDtoField(logicalName = "입금상태", physicalName = "depst_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_state;

    @ElDtoField(logicalName = "수정사유코드", physicalName = "mody_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mody_code;

    @ElDtoField(logicalName = "계산서번호(입금의뢰)", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "입금예정차수", physicalName = "depst_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int depst_odr;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "기술지원의뢰번호", physicalName = "tech_supt_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_supt_req_no;

    @ElDtoField(logicalName = "거래처코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "발행일자", physicalName = "regs_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regs_date;

    @ElDtoField(logicalName = "업무구분", physicalName = "biz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf;

    @ElDtoField(logicalName = "이전 계산서번호", physicalName = "old_tax_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_tax_bill_no;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "bill_clsf")
    public String getBill_clsf(){
        return bill_clsf;
    }

    @ElVoField(physicalName = "bill_clsf")
    public void setBill_clsf(String bill_clsf){
        this.bill_clsf = bill_clsf;
    }

    @ElVoField(physicalName = "demnd_recv_clsf")
    public String getDemnd_recv_clsf(){
        return demnd_recv_clsf;
    }

    @ElVoField(physicalName = "demnd_recv_clsf")
    public void setDemnd_recv_clsf(String demnd_recv_clsf){
        this.demnd_recv_clsf = demnd_recv_clsf;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "tax_bill_no")
    public String getTax_bill_no(){
        return tax_bill_no;
    }

    @ElVoField(physicalName = "tax_bill_no")
    public void setTax_bill_no(String tax_bill_no){
        this.tax_bill_no = tax_bill_no;
    }

    @ElVoField(physicalName = "issu_seqno")
    public String getIssu_seqno(){
        return issu_seqno;
    }

    @ElVoField(physicalName = "issu_seqno")
    public void setIssu_seqno(String issu_seqno){
        this.issu_seqno = issu_seqno;
    }

    @ElVoField(physicalName = "depst_state")
    public String getDepst_state(){
        return depst_state;
    }

    @ElVoField(physicalName = "depst_state")
    public void setDepst_state(String depst_state){
        this.depst_state = depst_state;
    }

    @ElVoField(physicalName = "mody_code")
    public String getMody_code(){
        return mody_code;
    }

    @ElVoField(physicalName = "mody_code")
    public void setMody_code(String mody_code){
        this.mody_code = mody_code;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "depst_odr")
    public int getDepst_odr(){
        return depst_odr;
    }

    @ElVoField(physicalName = "depst_odr")
    public void setDepst_odr(int depst_odr){
        this.depst_odr = depst_odr;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public String getTech_supt_req_no(){
        return tech_supt_req_no;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public void setTech_supt_req_no(String tech_supt_req_no){
        this.tech_supt_req_no = tech_supt_req_no;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "regs_date")
    public String getRegs_date(){
        return regs_date;
    }

    @ElVoField(physicalName = "regs_date")
    public void setRegs_date(String regs_date){
        this.regs_date = regs_date;
    }

    @ElVoField(physicalName = "biz_clsf")
    public String getBiz_clsf(){
        return biz_clsf;
    }

    @ElVoField(physicalName = "biz_clsf")
    public void setBiz_clsf(String biz_clsf){
        this.biz_clsf = biz_clsf;
    }

    @ElVoField(physicalName = "old_tax_bill_no")
    public String getOld_tax_bill_no(){
        return old_tax_bill_no;
    }

    @ElVoField(physicalName = "old_tax_bill_no")
    public void setOld_tax_bill_no(String old_tax_bill_no){
        this.old_tax_bill_no = old_tax_bill_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FtxBillUpdVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("bill_clsf").append("=").append(bill_clsf).append(",");
        sb.append("demnd_recv_clsf").append("=").append(demnd_recv_clsf).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("tax_bill_no").append("=").append(tax_bill_no).append(",");
        sb.append("issu_seqno").append("=").append(issu_seqno).append(",");
        sb.append("depst_state").append("=").append(depst_state).append(",");
        sb.append("mody_code").append("=").append(mody_code).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("depst_odr").append("=").append(depst_odr).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("tech_supt_req_no").append("=").append(tech_supt_req_no).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("regs_date").append("=").append(regs_date).append(",");
        sb.append("biz_clsf").append("=").append(biz_clsf).append(",");
        sb.append("old_tax_bill_no").append("=").append(old_tax_bill_no);
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
